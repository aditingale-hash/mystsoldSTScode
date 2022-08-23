package com.junitdemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapService {

	public Map<String, ArrayList<String>> ipl = new HashMap<>();
	
	public String addPlayer(String team,String playerName) {
		/*
		 * Step 1: 
		 * check if the team is present in the map.
		 * if(present) - add player name to the list of players of that team
		 * if(not-present) - add team in map and add the player to the list of players of that team
		 */
		boolean isPresent = ipl.containsKey(team);
		if(isPresent) {
			//fetch the list of that team players
			ArrayList<String> playerList = ipl.get(team);
			playerList.add(playerName);
			return "player added to team";
		}
		else {
			ArrayList<String> playerList = new ArrayList<>();
			playerList.add(playerName);
			ipl.put(team, playerList);
			return "team and player added";
		}
	}
	
	public String removePlayer(String team, String playerName) {
		/*
		 * Plan: 
		 * check if team is present:
		 * if(present) - check if player is present in the team. 
		 * if(not-present) - give msg
		 */
		 boolean isPresent = ipl.containsKey(team);
		 if(isPresent) {
			ArrayList<String> players= ipl.get(team);
			if(players.remove(playerName)) {
				return "player removed from team";
			}
			else {
				return "player does not exists in the team";
			}
		 }
		 else {
			 return "team not present";
		 }
	}
	
	public Map<String,Integer> countPlayers() {
		Map<String,Integer> map = new HashMap<>();
		
		/*
		 * for(String key : ipl.keySet()) { 
		 * 		ArrayList<String> list = ipl.get(key); 
		 * 		int num = list.size(); 
		 * 		map.put(key, num); 
		 * }
		 */
		
		  for(Map.Entry<String, ArrayList<String>> entry: ipl.entrySet()) 
		  {
			  	map.put(entry.getKey(), entry.getValue().size()); 
		  }
		 
		
		return map;
	}
}

/*
 *  ipl : <K,V> = [<"csk", ["ms dhoni", "r jadeja"]> "MI" : ["J Bumrah"]] 
 *  
 *  map:<String,Integer> : [csk: 2, mi: 1]
 */









