package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass03 {
	public static void main(String[] args) {
		//DB에 접속해서 작업을 하려면 Connection 객체가 필요하다
		Connection conn=null;
		try {
			//오라클 드라이버 로딩( ojdbc...jar 파일이 있어야 아래의 코드가 동작한다)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "TIGER");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//SELECT 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					//실행할 sql 문 미리 준비하기(java10부터 추가된 문법)
					String sql="""
							SELECT empno, ename, emp.deptno, dname 
							FROM emp
							INNER JOIN dept ON emp.deptno=dept.deptno 
							ORDER BY empno ASC
							""";
					// sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
					pstmt=conn.prepareStatement(sql);
					// SELECT 문 실행하고 결과를 ResultSet 객체로 얻어내기
					rs=pstmt.executeQuery();
					//반복문 돌면서
					while(rs.next()) {						
						int empno=rs.getInt("empno");
						String ename=rs.getString("ename");
						int deptno=rs.getInt("deptno");
						String dname=rs.getString("dname");						
						String info= String.format("사원번호:%d 사원이름:%s 부서번호:%d 부서명:%s",
								empno, ename, deptno, dname);
						System.out.println(info);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
	}
}
