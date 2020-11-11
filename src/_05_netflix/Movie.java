package _05_netflix;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class Movie implements Comparable<Movie> {
	private String title;
	private double stars;
	

	public Movie(String title, double stars) {
		this.title = title;
		this.stars = stars;
	}

	public String getTitle() {
		return this.title;
	}

	public double getRating() {
		return this.stars;
	}

	public String toString() {
		return "\"" + title + "\" - " + stars + " stars";
	}

public String getPrice() {
		return "" + title + " is $6.99 a month on Disney+";
	}
 

	
	public double compareTo(Movie otherMovie) {
		return Math.abs(otherMovie.getRating() - this.stars);
	}
}
