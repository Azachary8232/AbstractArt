package com.AbstractArt;

public class Painting extends Art {
	
	public String paintType;
	
	

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	
	
	
	//	METHODS
	


	//	Getters and Setters
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
	
}
