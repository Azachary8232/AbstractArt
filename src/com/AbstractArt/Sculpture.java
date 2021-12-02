package com.AbstractArt;

public class Sculpture extends Art {
	
	public String material;

	

	public Sculpture(String material, String title, String author, String description) {
		super(title,author,description);
		this.material = material;
	}

	//	METHODS
	public void displayArtInfo() {
		System.out.println( material + title + author + description);
	}
	
	//	Getter
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
}
