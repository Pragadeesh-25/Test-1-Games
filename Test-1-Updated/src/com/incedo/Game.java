package com.incedo;

public class Game {

	private String gameName;
	private String authorname;
	private float price;
	
	public Game(String gameName, String authorname, float price) {
		super();
		this.gameName = gameName;
		this.authorname = authorname;
		this.price = price;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Game [gameName=" + gameName + ", authorname=" + authorname + ", price=" + price + "]";
	}
	
	
	
}
