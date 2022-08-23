package com.junitdemo.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.junitdemo.service.MapService;

public class MapServiceYTest {

	MapService mapService;
	
	@Before
	public void initTest() {

		mapService=new MapService();
	
}
	
	@Test
	public void addPlayerTest() {

		Assert.assertEquals("team and player added", mapService.addPlayer("csk", "Ms Dhoni"));
		Assert.assertEquals("player added to team", mapService.addPlayer("csk", "R jadeja"));
		Assert.assertEquals("team and player added", mapService.addPlayer("MI", "J Bumraha"));
		//System.out.println(mapService.ipl);
}
	@Test
	public void removePlayerTest() {

		Assert.assertEquals("team not present", mapService.removePlayer("csk", "Ms Dhoni"));
		mapService.addPlayer("csk", "Ms Dhoni");
		mapService.addPlayer("csk", "R jadeja");
		mapService.addPlayer("MI", "J Bumraha");
		Assert.assertEquals("player removed from team", mapService.removePlayer("csk", "R jadeja"));
		Assert.assertEquals("player removed from team", mapService.removePlayer("MI", "J Bumraha"));
		Assert.assertEquals("player does not exists in the team", mapService.removePlayer("MI", "J Bumraha"));
		
}
	@Test
	public void countPlayerTest() {
		Map<String, Integer> map=new HashMap<>();
		Assert.assertEquals(map, mapService.countPlayers());
		
		mapService.addPlayer("csk", "Ms Dhoni");
		mapService.addPlayer("csk", "R jadeja");
		mapService.addPlayer("MI", "J Bumraha");
		map.put("csk", 2);
		map.put("MI", 1);
		Assert.assertEquals(map, mapService.countPlayers());
}
		
	
}
