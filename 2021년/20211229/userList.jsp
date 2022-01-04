<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
    
    
    
    
  
    
<%
   
request.setCharacterEncoding("UTF-8");   // 우선 한글로 보이도록

String uid = request.getParameter("id");
String ups = request.getParameter("ps");
String una = request.getParameter("name");
   
// 데이터를 넣는 구문 
String sql = "INSERT INTO user(id, password, NAME) VALUES";
sql += "('" + uid + "','" + ups + "','" + una + "')";
   
Class.forName("com.mysql.jdbc.Driver"); // lib 폴더에 있는 파일을 읽어온다.
Connection conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/testdb","root","0000");
Statement stmt = conn.createStatement();

int count = stmt.executeUpdate(sql);

if (count == 1) {
	out.print("회원가입 완료");
} else {
	out.print("오류발생");
}
   
   
 /*
 HeidiSQL >> 쿼리 >> 내에서 이 구문을 직접 입력해서 실행하면 
 데이터가 추가가된다.
 INSERT INTO user(id, PASSWORD, NAME) VALUES ("555","555","두더지")
 
 
 */
   
 %>