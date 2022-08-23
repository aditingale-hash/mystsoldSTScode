package com.testcases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestCase {
	@Test
	public void getCountTest() {
		getCount a = new getCount();
		List<Candidate> candidateList= new ArrayList<Candidate>();
		candidateList.add(new Candidate(1,"aditi", 21,"female","comp",2018, 25000));
		candidateList.add(new Candidate(2,"Harry", 32,"male","comp",2021, 33000));
		candidateList.add(new Candidate(3,"Ali", 25,"male","comp",2019, 21000));
		candidateList.add(new Candidate(4,"Jiya", 27,"female","IT",2017, 22000));
		
		HashMap<String, Long> map= new HashMap<>();
		map.put("male",4L);
		map.put("female", 6L);
		Assert.assertEquals(map,a.getCount(candidateList));
		}
	
	@Test
	public void getAvgAgeTest(){
		AvgAge a = new AvgAge();
		List<Candidate> candidateList= new ArrayList<Candidate>();
		candidateList.add(new Candidate(1,"aditi", 21,"female","comp",2018, 25000.0));
		candidateList.add(new Candidate(2,"Harry", 32,"male","comp",2021, 33000.0));
		candidateList.add(new Candidate(3,"Ali", 25,"male","comp",2019, 21000.0));
		candidateList.add(new Candidate(4,"Jiya", 27,"female","IT",2017, 22000.0));
		candidateList.add(new Candidate(5,"Nima", 28,"female","IT",2014, 35000.0));
		candidateList.add(new Candidate(6,"Meena", 25,"female","comp",2015, 55000.0));
		candidateList.add(new Candidate(7,"Rohit", 26,"male","comp",2020, 25000.0));
		candidateList.add(new Candidate(8,"Raju", 31,"male","IT",2021, 25000.0));
		candidateList.add(new Candidate(9,"Komal", 28,"female","IT",2018, 22000.0));
		candidateList.add(new Candidate(10,"Tanaya", 31,"female","comp",2026, 35000.0));
		
		HashMap<String, Long> map= new HashMap<>();
		map.put("male",28L);
		map.put("female", 26L);
		Assert.assertEquals(map,a.AvgAge(candidateList));
	}
	
	@Test
	public void getDepartment() {
		dept a = new dept();
		List<Candidate> candidateList= new ArrayList<Candidate>();
		candidateList.add(new Candidate(1,"aditi", 21,"female","comp",2018, 25000.0));
		candidateList.add(new Candidate(2,"Harry", 32,"male","comp",2021, 33000.0));
		candidateList.add(new Candidate(3,"Ali", 25,"male","comp",2019, 21000.0));
		candidateList.add(new Candidate(4,"Jiya", 27,"female","IT",2017, 22000.0));
		candidateList.add(new Candidate(5,"Nima", 28,"female","IT",2014, 35000.0));
		candidateList.add(new Candidate(6,"Meena", 25,"female","comp",2015, 55000.0));
		candidateList.add(new Candidate(7,"Rohit", 26,"male","comp",2020, 25000.0));
		candidateList.add(new Candidate(8,"Raju", 31,"male","IT",2021, 25000.0));
		candidateList.add(new Candidate(9,"Komal", 28,"female","IT",2018, 22000.0));
		candidateList.add(new Candidate(10,"Tanaya", 31,"female","IT",2026, 35000.0));
		HashMap<String, Long> map= new HashMap<>();
		map.put("COMP",5L);
		map.put("IT", 5L);
		Assert.assertEquals(map,a.dept(candidateList));
	}
	
}


