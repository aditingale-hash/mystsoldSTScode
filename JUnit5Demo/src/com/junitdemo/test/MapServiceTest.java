package com.junitdemo.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.junitdemo.service.MapService;

public class MapServiceTest {

	MapService mapService;
	
	@Before
	public void initTest() {
		mapService = new MapService();
	}
	
	@Test
	public void addPlayerTest() {
		Assert.assertEquals("team and player added", mapService.addPlayer("csk", "MS Dhoni"));
		Assert.assertEquals("player added to team", mapService.addPlayer("csk", "R Jadeja"));
		Assert.assertEquals("team and player added", mapService.addPlayer("mi", "J Bumrah"));
		//System.out.println(mapService.ipl);
	}
	
	@Test
	public void removePlayerTest() {
		Assert.assertEquals("team not present", mapService.removePlayer("csk", "MS Dhoni"));
		mapService.addPlayer("csk", "MS Dhoni");
		mapService.addPlayer("csk", "R Jadeja");
		mapService.addPlayer("mi", "J Bumrah");
		Assert.assertEquals("player removed from team", mapService.removePlayer("csk", "R Jadeja"));
		Assert.assertEquals("player removed from team", mapService.removePlayer("mi", "J Bumrah"));
		Assert.assertEquals("player does not exists in the team", mapService.removePlayer("csk", "R Jadeja"));
	}
	
	 @Test
	 public void countPlayersTest() {
		 Map<String,Integer> map = new HashMap<>();
		 Assert.assertEquals(map, mapService.countPlayers());
		 mapService.addPlayer("csk", "MS Dhoni");
		 mapService.addPlayer("csk", "R Jadeja");
		 mapService.addPlayer("mi", "J Bumrah");
		 map.put("csk", 2);
		 map.put("mi", 1);
		 Assert.assertEquals(map, mapService.countPlayers());
	 }
}
