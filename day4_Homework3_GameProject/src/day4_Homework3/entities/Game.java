package day4_Homework3.entities;

import day4_Homework3.abstracts.Entity;

public class Game implements Entity {

	private int gameId;
	private String gameName;
	private String gameType;
	private double gamePrice;
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, String gameType, double gamePrice) {
		
		this.setGameId(gameId);
		this.setGameName(gameName);
		this.setGameType(gameType);
		this.setGamePrice(gamePrice);
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
}
