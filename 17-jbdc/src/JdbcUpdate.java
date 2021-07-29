import java.sql.*;
import java.util.Scanner;

public class JdbcUpdate {
	public static void main(String[] args) {
		// Update는 Scanner를 이용해서
		// 수정할 글 번호를 입력받아서
		// 해당 글의 str을 새로 입력한 값으로 변경해줍니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번을 수정하시겠습니까?");
		int jdbcNum = sc.nextInt();
		System.out.println("이름을 입력하십시오");
		String jdbcStr = sc.next();
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			stmt = con.createStatement();
			String sql = "UPDATE JDBCInsert SET str = '" + jdbcStr + "' WHERE num = " + jdbcNum;
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
