package com.abstractart.artapp;

public class Sculpture extends Art {
	protected String material;

	public Sculpture(String title,String author, String description, String material) {
		this.title=title;
		this.author=author;
		this.description=description;
		this.material=material;
	}
	@Override
	public void viewArt() {
		System.out.println("*****************************************************");
		System.out.println("Title: "+this.getTitle());
		System.out.println("Author: "+this.getAuthor());
		System.out.println("Desc: "+this.getDescription());
		System.out.println("Material: "+this.getMaterial());
		System.out.println("*****************************************************");

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}


}
