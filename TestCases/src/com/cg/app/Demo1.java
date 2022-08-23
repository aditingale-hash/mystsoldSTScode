package com.cg.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Demo1 {
		private String userDB="root";
		private String passwordDB="";
		private String url="jdbc:mysql://localhost:3306/demodb";
		private String driver="com.mysql.jdbc.Driver";
		private Connection conn;
		PreparedStatement psmt;
		public void dbconnect(){
			try {
				Class.forName(driver);
			}catch(ClassNotFoundException e) {
				
				System.out.println("Driver loading issues.....");
				e.printStackTrace();
			}
			
			try {	
			 conn = DriverManager.getConnection(url, userDB, passwordDB);
				
			}catch(SQLException e){
				
				System.out.println("DB connection  issue");
				e.printStackTrace();
			}
			
		}
		public void dbClose() {
			
			try {
				
				conn.close();
				//System.out.println("conn cloased");
			}catch(SQLException e){
				System.out.println("DB close issue");
				e.printStackTrace();
			}
			
			}
			
			public void insert(Employee1 s) {
			dbconnect();
			try {
		  String sql="insert into employee(name,address,salary) values (?,?,?)";
		  PreparedStatement psmt= conn.prepareStatement(sql);
		  psmt.setString(1, s.getName());
		  psmt.setString(2, s.getAddress());
		  psmt.setInt(3, s.getSalary());
		 
		  psmt.executeUpdate();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			dbClose();
			}
}


