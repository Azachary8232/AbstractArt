package com.AbstractArt;

public class Museum {

	public static void main(String[] args) {
		
		Painting painting1 = new Painting("sfsdf","sfsdf","sfsdf","sfsdf");
		painting1.addArt(painting1);
		Painting painting2 = new Painting("sfsdf","sfsdf","sfsdf","sfsdf");
		painting2.addArt(painting2);
		Painting painting3 = new Painting("sfsdf","sfsdf","sfsdf","sfsdf");
		painting3.addArt(painting3);
		Sculpture sculpture1 = new Sculpture("sfsdf","sfsdf","sfsdf","sfsdf");
		sculpture1.displayArtInfo();
		Sculpture sculpture2 = new Sculpture("sfsdf","sfsdf","sfsdf","sfsdf");
		
		System.out.println(Art.getArtChest());
		
		
		
		
	}

	
}
