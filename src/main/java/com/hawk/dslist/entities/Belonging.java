package com.hawk.dslist.entities;

public class Belonging {

	private Game game;
	private GameList gameList;

	private Integer position;

	public Belonging() {
	}

	public Belonging(Game game, GameList gameList, Integer position) {
		super();
		this.game = game;
		this.gameList = gameList;
		this.position = position;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getGameList() {
		return gameList;
	}

	public void setGameList(GameList gameList) {
		this.gameList = gameList;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

}
