package com.abstractart.artapp;

public class Test {

	public static void main(String[] args) {
		Painting paint1=new Painting("Mona Lisa","Leonardo da Vinci","The Mona Lisa is a half-length portrait painting by Italian artist Leonardo da Vinci.","Portrait");
		Painting paint2=new Painting("The Starry Night","Vincent van Gogh","The Starry Night is an oil-on-canvas painting by the Dutch Post-Impressionist painter Vincent van Gogh. Painted in June 1889.","Oil-on-Canvas");
		Painting paint3=new Painting("Girl with a Pearl Earring","Johannes Vermeer","Girl with a Pearl Earring is an oil painting by Dutch Golden Age painter Johannes Vermeer, dated c. 1665.","Oil");
		paint1.viewArt();
		paint2.viewArt();
		paint3.viewArt();
		
		
		Sculpture sculpture1=new Sculpture("Singing Ringing Tree", "Mike Tonkin", "Completed in 2006, the Singing Ringing Tree is a 10-foot-tall sculpture meant to resemble the shape and grace of an actual tree.", "Wood");
		Sculpture sculpture2=new Sculpture("Bridge Over Tree", "Siah Armajani", "Located in New York’s Brooklyn Bridge Park", "Concrete");
		sculpture1.viewArt();
		sculpture2.viewArt();

	}

}
