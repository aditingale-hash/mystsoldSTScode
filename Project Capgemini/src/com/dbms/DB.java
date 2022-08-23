package com.dbms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.p.Project;

public class DB {
	
	private String userDB="root";
	private String passwordDB="";
	private String url="jdbc:mysql://localhost:3306/project";
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
public List<Project> fectchAllPolicy(){
	dbconnect();
	String sql="select * from policy";
	List<Project> list=new ArrayList<>();
	try {
		PreparedStatement psmt = conn.prepareStatement(sql);
		ResultSet rst= psmt.executeQuery();
		while(rst.next()) {
			int id=rst.getInt("id");
			String name=rst.getString("name");
			int term=rst.getInt("term");
			double premium=rst.getDouble("premium");
			String avalibleFor =rst.getString("avalibleFor");
			
			Project s= new Project();
			s.setId(id);
			s.setName(name);
			s.setTerm(term);
		   s.setPremium(premium);
		s.setAvalibleFor(avalibleFor);
			list.add(s);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	dbClose();
	return list;
}

public Map<String, Long> GroupPolicyByAvalibleFor(List<Project> list) {
	Map<String, Long> result =
            list.stream().collect(
                    Collectors.groupingBy(Project::getAvalibleFor, Collectors.counting()
                  )
            );
	return result;
}

public List<Project> sort(List<Project> list) 
{
	list.sort(Comparator.comparing(Project::getTerm).reversed());
	return list;
}
public List<Project> abc(double e,List<Project>list) throws InvalidPremiumAmountException{
	List<Project>list1=new ArrayList<>();
	for(Project stud:list) {
		if(e<0||e>100000) {
			throw new InvalidPremiumAmountException("Invalid Premium Amount Exception");
		}
    	if(e>stud.getPremium()) {
       	list1.add(stud);
    	}
		
}
	return list1;
}
}
