package com.AbstractArt;
import java.util.ArrayList;

public abstract class Art { 
	
	public String title;
	public String author;
	public String description;
	static ArrayList<Art> artChest = new ArrayList<>();
	
	
	public Art(String title, String author, String description) {	
		this.title = title;
		this.author = author;
		this.description = description;
	}






//	methods
	
	public void getiewArt() {
		
	}
	
	public static ArrayList<Art> getArtChest() {
		return artChest;
	}






	public static void setArtChest(ArrayList<Art> artChest) {
		Art.artChest = artChest;
	}






	public void addArt(Art item){
		artChest.add(item);
	}
	
}