package com.junitdemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapService {
	public Map<String, ArrayList<String>> ipl=new HashMap<>();
	public String addPlayer(String team,String playerName) {
	  boolean isPresent = ipl.containsKey(team);
	  if(isPresent)
	  {
		  ArrayList<String> playerList=ipl.get(team);
		  playerList.add(playerName);
		  return"player added to team";

	  }
	  else {
		  ArrayList<String> playerList=new ArrayList<>();
		  playerList.add(playerName);
		 ipl.put(team, playerList);
		  return"team and player added";
  
	  }
	}
	
	public String removePlayer(String team,String playerName) {
		boolean isPresent=ipl.containsKey(team);
		if(isPresent) {
			ArrayList<String> players= ipl.get(team);
			if(players.remove(playerName)) 
			{
				return"player removed from team";	
			}else 
			{
				
				return"player does not exists in the team";
				
			}
		}else 
		{
			return"team not present";
			
		}
		
	}
	
	public Map<String, Integer> countPlayers(){
		Map<String, Integer> map=new HashMap<>();
		for(String key:ipl.keySet()) 
		{
			
			ArrayList<String> list= ipl.get(key);
			int num= list.size();
			map.put(key, num);
			
		}
		return map;
		
	}
}
