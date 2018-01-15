package com.waramun.mypackage;

import javax.persistence.*;

@Entity
@Table(name = "eplclub")

public class EplClub {
	
	private int id, capacity, lastestEplChamp;
	
	private String clubName, stadium;
	
	public EplClub() {
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getLastestEplChamp() {
		return lastestEplChamp;
	}

	public void setLastestEplChamp(int lastestEplChamp) {
		this.lastestEplChamp = lastestEplChamp;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	
	
}
