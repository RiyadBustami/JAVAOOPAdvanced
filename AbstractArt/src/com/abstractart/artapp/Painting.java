package com.abstractart.artapp;

public class Painting extends Art {
	protected String paintType;


	public Painting(String title,String author, String description, String paintType) {
		this.title=title;
		this.author=author;
		this.description=description;
		this.paintType=paintType;
	}

	@Override
	public void viewArt() {
		System.out.println("*****************************************************");
		System.out.println("Title: "+this.getTitle());
		System.out.println("Author: "+this.getAuthor());
		System.out.println("Desc: "+this.getDescription());
		System.out.println("Type: "+this.getPaintType());
		System.out.println("*****************************************************");

	}
	
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

}
