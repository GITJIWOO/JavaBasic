import java.sql.*;

public class OjdbcSelect {
	public static void main(String[] args) {
		// Orecle SQL과 연동해서
		// Employees 테이블의 모든 인원에 대한 정보를
		// 콘솔창에 띄워주세요.
		// SELECT * FROM employees;
		// 에 대한 결과물을 콘솔창에 띄워주시면 됩니다.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "hr", "hr");
			stmt = con.createStatement();
			String sql = "SELECT employee_ID, first_name, hire_date, job_id, salary FROM employees";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("아이디 : " + rs.getInt("employee_id"));
				System.out.println("성 : " + rs.getString("first_name"));
				System.out.println("입사일 : " + rs.getDate("hire_date"));
				System.out.println("직무명 : " + rs.getString("job_id"));
				System.out.println("연봉 : " + rs.getInt("salary"));
				System.out.println("---------------");
			}
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
			System.out.println("오류 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch(SQLException e) {
				e.getNextException();
			}
		}
	}
}
