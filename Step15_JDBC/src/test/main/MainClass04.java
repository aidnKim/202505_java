package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.utill.DBConnector;

public class MainClass04 {
	public static void main(String[] args) {
		
		//SELECT 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//우리가 설계한 DBConnector 클래스를 이용해서 Connection 객체 얻어내기
			conn=new DBConnector().getConn();
			//실행할 sql 문 미리 준비하기(java10부터 추가된 문법)
			String sql="""
					SELECT deptno, dname, loc 
					FROM dept 
					ORDER BY deptno ASC
					""";
			// sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			// SELECT 문 실행하고 결과를 ResultSet 객체로 얻어내기
			rs=pstmt.executeQuery();
			//반복문 돌면서
			while(rs.next()) {
				
				int deptno=rs.getInt("deptno");
				String dname=rs.getString("dname");
				String loc=rs.getString("loc");						
				//현재 cursor가 위치한 곳의 데이터를 테스트로 출력해보기
				System.out.println(deptno+" | "+dname+" | "+loc);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
