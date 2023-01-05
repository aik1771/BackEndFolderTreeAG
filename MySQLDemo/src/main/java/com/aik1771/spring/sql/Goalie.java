package com.aik1771.spring.sql;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table
public class Goalie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int player_id;
	@Column(name = "player_name")
	private String name;
	@Column
	private String position;
	
	public Goalie()
	{
		
	}

	public Goalie(int player_id, String name, String position) {
		super();
		this.player_id = player_id;
		this.name = name;
		this.position = position;
	}

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
