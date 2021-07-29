import java.sql.*;
import java.util.Scanner;

public class mytest1 {
	public static void main(String[] args) {
		// sqldb를 연결
		// SELECT userID, name, addr FROM userTbl;
		// 스캐너로 원하는 수 만큼 사람을 조회합니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("몇명을 조회하시겠습니까?");
		int input = scan.nextInt();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			stmt = con.createStatement();
			String sql = "SELECT userID, name, addr FROM userTbl";
			rs = stmt.executeQuery(sql);
			for (int i = 1; i <= input; i++) {
				rs.next();
				System.out.printf("아이디 : %s\n이름 : %s\n지역 : %s\n"
									, rs.getString("userID"), rs.getString("name"), rs.getString("addr"));
				System.out.println("----------");
			}
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
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
		scan.close();
	}
}
