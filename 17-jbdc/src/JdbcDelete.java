import java.sql.*;
import java.util.Scanner;

public class JdbcDelete {
	public static void main(String[] args) {
		// Delete는 Scanner를 이용해서
		// 삭제할 num 번호를 입력받아서
		// 해당 번호 row를 삭제해줍니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번을 삭제하시겠습니까?");
		int jdbcNum = sc.nextInt();
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			stmt = con.createStatement();
			String sql = "DELETE FROM JDBCInsert WHERE num = " + jdbcNum;
			System.out.println(sql);
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
