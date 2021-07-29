import java.sql.*;
import java.util.Scanner;

public class OjdbcUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("str 을 입력하십시오");
		String upStr = sc.next();
		System.out.println("num 을 선택하십시오");
		int upNum = sc.nextInt();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			String sql = "UPDATE ojdbcTest SET str = ? WHERE num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, upStr);
			pstmt.setInt(2, upNum);
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
