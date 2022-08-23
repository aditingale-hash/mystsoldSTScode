package com.mainj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.stu.Student;

public class DBConfigure {
	private String userDB="root";
	private String passwordDB="";
	private String url="jdbc:mysql://localhost:3306/collegedb";
	private String driver="com.mysql.jdbc.Driver";
	private Connection conn;
	PreparedStatement psmt;
	public void dbconnect(){
		try {
			Class.forName(driver);
			//System.out.println("driver loaded");
		
		}catch(ClassNotFoundException e) {
			
			System.out.println("Driver loading issues.....");
			e.printStackTrace();
		}
		
		try {	
		 conn = DriverManager.getConnection(url, userDB, passwordDB);
			//System.out.println("conn made " + conn);
			
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
		
		public void insertStudent(Student s) {
		dbconnect();
		try {
	  String sql="insert into student(name,city,age,dept_id) values (?,?,?,?)";
	  PreparedStatement psmt= conn.prepareStatement(sql);
	  psmt.setString(1, s.getName());
	  psmt.setString(2, s.getCity());
	  psmt.setInt(3, s.getAge());
	  psmt.setInt(4, s.getDept_id());
	    
	  
	  psmt.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		dbClose();
		}
		public void deleteStudent(int id) {
			dbconnect();
			String sql="delete from student where id=?";
			
			 try {
				PreparedStatement psmt= conn.prepareStatement(sql);
				psmt.setInt(1, id); 
				  psmt.executeUpdate();
				  
			} catch (SQLException e) {
				System.out.println("SQL ISSUE");
				e.printStackTrace();
			}
			 dbClose();
			 
			 
		}
		public Student fetchStudentById(int id) {
			
			dbconnect();
			String sql="select * from student where id=?";
			Student s =new Student();
			
			try {
				PreparedStatement psmt= conn.prepareStatement(sql);
				psmt.setInt(1, id);
				
				ResultSet rst= psmt.executeQuery();
				
				while(rst.next()) {
					String name=rst.getString("name");
					String city=rst.getString("city");
					int age=rst.getInt("age");
					int dept_id=rst.getInt("dept_id");
					
					s.setId(id);
					s.setName(name);
					s.setCity(city);
					s.setAge(age);
					s.setDept_id(dept_id);
					
					
				}
			} catch (SQLException e) {
			System.out.println("SQL ISSUE");
				e.printStackTrace();
			}
			
			dbClose();
			// TODO Auto-generated method stub
			return s;
		}
		public void updateStudent(Student s, int id) {
			dbconnect();
			String sql="update student SET name=? ,city=?, age=?, dept_id=? where id=?";
			 
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
			    psmt.setString(1, s.getName());
			    psmt.setString(2, s.getCity());
			    psmt.setInt(3, s.getAge());
			    psmt.setInt(4, s.getDept_id());
			    psmt.setInt(5, id);
			    
			    psmt.executeUpdate();
			    
			} catch (SQLException e){
				System.out.println("SQL ISSUE");
				e.printStackTrace();
			}
			dbClose();
			
		}
		public List<Student> fectchAllStudent() {
			dbconnect();
			String sql="select * from student";
			List<Student> list=new ArrayList<>();
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rst= psmt.executeQuery();
				while(rst.next()) {
					int id=rst.getInt("id");
					String name=rst.getString("name");
					String city=rst.getString("city");
					int age=rst.getInt("age");
					int dept_id=rst.getInt("dept_id");
					
					Student s =new Student();
					s.setId(id);
					s.setName(name);
					s.setCity(city);
					s.setAge(age);
					s.setDept_id(dept_id);
					
					list.add(s);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dbClose();
			return list;
		}
		public LinkedHashMap<String, Integer> FetchStudentGroupByCity() {
			dbconnect();
			String sql="select city,count(id) as cnt from student group by city order by cnt DESC";
			LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
			PreparedStatement psmt;
			try {
				psmt = conn.prepareStatement(sql);
				ResultSet rst= psmt.executeQuery();
				while(rst.next()) {
					String city=rst.getString(1);
					int count=rst.getInt(2);
					map.put(city, count);					
				}
			} catch (SQLException e) {
				System.out.println("SQL ERROR");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			dbClose();
			
			return map;
		}
		public LinkedHashMap<Integer, Integer> FetchStudentGroupByDept() {
			dbconnect();
			String sql="select dept_id,count(id) as cnt from student group by dept_id order by cnt DESC";
			LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rst= psmt.executeQuery();
				while(rst.next()) {
					int dept_id=rst.getInt(1);
					int count=rst.getInt(2);
					map.put(dept_id, count);
		
				}
			} catch (SQLException e) {
				System.out.println("SQL ERROR");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dbClose();
			return map;
		}

}