import java.sql.*;
import java.util.Scanner;

public class OjdbcDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 로우를 삭제하시겠습니까?");
		int delNum = sc.nextInt();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			String sql = "DELETE FROM ojdbcTest WHERE num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, delNum);
			pstmt.executeUpdate();
			System.out.println(sql);
		} catch(ClassNotFoundException e) {
			System.out.println("드라이브 로딩 실패");
		} catch(SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
