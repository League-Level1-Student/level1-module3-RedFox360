package _05_netflix;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



import java.util.ArrayList;
import java.util.Collections;

public class NetflixQueue {
	
	ArrayList<Movie> movies = new ArrayList<Movie>();
	static ArrayList<Double> ratings = new ArrayList<Double>();
	
	public Movie getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
		ratings.add(movie.getRating());
	}
	
	public Movie getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		quickSort(ratings, 0, 5);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
	void quickSort(ArrayList<Double> arr[], int low, int high){
	    if (low < high)
	    {
	        /* pi is partitioning index, arr[pi] is now
	           at right place */
	       int  pi = partition(arr, low, high);

	        quickSort(arr, low, pi - 1);  // Before pi
	        quickSort(arr, pi + 1, high); // After pi
	    }
	}

	private int partition(ArrayList<Double>[] arr, int low, int high) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
