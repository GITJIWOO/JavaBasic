import java.sql.*;

public class JdbcConnection {
	public static void main(String[] args) {
		// JAVA와 DB를 연동하기 위해서 JDBC라는 API가 필요합니다.
		// MySQL은 그 중에서고 Connector J라는 라이브러리를 이용합니다.
		// Connector J는 MySQL 공식홈페이지에서 다운받아 설치할수도 있고
		// 아니면 jar파일만 구해서 바로 적용할 수도 있습니다.
		// 공식홈페이지 루트는
		// 1. mysql 홈페이지 접속
		// 2. DOWNLOAD 탭에서 하단에 MySQL Community(GPL) 선택
		// 3. OS에 맞는 버전 선택(MySQL Installer 선택)
		// 4. 상단의 2메가바이트짜리 업데이트 파일 다운 후 실행
		// 5. Connector J 설치
		// 6. Program files(x86) -> mysql -> connetor J 폴더
		// 내부에 .jar 파일을 확인하면 됩니다.
		
		// jar 파일을 어떤 경로로든 구하셧다면, 사용할 프로젝트에
		// jar파일을 추가해줘야 합니다.
		// 프로젝트별로 계속 추가해야 하니 방법을 잘 기억해두세요.
		// 1. 프로젝트 우클릭 -> properties -> 좌측탭에 java build path
		// 2. 상단 탭에 libraries 선택 후 Add library 선택
		// 3. user library 선택후 우측 user libraries
		// 4. 우측 new 버튼 누르고 이름 임의로 입력(현재 JDBC connection)
		// 5. Add External Jar 선택 후 connector j 폴더로 이동
		// 6. jar파일 선택 후 apply and close 선택
		
		// DB 연동 코드 작성
		// 위쪽의 모든 작업이  끝났다면 본격적으로 코드를 작성해보겠습니다.
		// 기본적으로 import java.sql.*;을 1번라인에 입력하고 시작합니다.
		
		// 연결은 Connection 자료형으로 진행합니다.
		Connection con = null;
		
		// DB연결에 관련된 로직은 무조건 try~catch 구문을 활용하도록 강요받습니다.
		try {
			// MySQL DB와 연동할 것임을 나타냅니다.
			Class.forName("com.mysql.jdbc.Driver");
			
			// 접속 url은 jdbc:mysql://localhost/db명 입니다.
			String url = "jdbc:mysql://localhost/sqldb";
			
			// 접속주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
			con = DriverManager.getConnection(url, "root", "mysql");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) { // 연결 여부
					con.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
