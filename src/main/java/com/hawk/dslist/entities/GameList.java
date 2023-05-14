package com.hawk.dslist.entities;

import java.util.Objects;

public class GameList {
	private Long idGameList;
	private String nome;

	public GameList() {
	}

	public GameList(Long idGameList, String nome) {
		this.idGameList = idGameList;
		this.nome = nome;
	}

	public Long getIdGameList() {
		return idGameList;
	}

	public void setIdGameList(Long idGameList) {
		this.idGameList = idGameList;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idGameList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameList other = (GameList) obj;
		return Objects.equals(idGameList, other.idGameList);
	}

}
