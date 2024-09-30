package com.incedo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameService {

	private static ArrayList<Game> arr=new ArrayList<>();
	public GameService()
	{
		arr.add(new Game("SnowBird", "Danny", 300));
		arr.add(new Game("FreshFood","Ram",450));
		arr.add(new Game("Batsman","Kate",400));
		arr.add(new Game("Pokiman","Steeve",600));
		arr.add(new Game("YammyTommy","Narayan",350));	
	}
	public List<Game> viewAll()
	{
		return GameService.arr;
	}
	public String authorSearch(String author)
	{
		Optional<Game> gm= arr.stream().filter(p->p.getAuthorname().equals(author)).findFirst();
		if(gm.isPresent())
		{
			return gm.get().getGameName();
		} 
			return "NOT FOUND"; 
		
	}
	
}
