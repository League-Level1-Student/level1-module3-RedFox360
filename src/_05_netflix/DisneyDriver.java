package _05_netflix;

public class DisneyDriver {
public static void main(String[] args) {
	Movie LionKing = new Movie("Lion King", 4.25);
	Movie Cinderella = new Movie("Cinderella", 4.3);
	Movie Tarzan = new Movie("Tarzan", 4.40);
	Movie Mulan = new Movie("Mulan", 4.55);
	Movie Frozen = new Movie("Frozen", 3.5);
	System.out.println(LionKing.getPrice());
	System.out.println(Cinderella.getPrice());
	System.out.println(Tarzan.getPrice());
	System.out.println(Mulan.getPrice());
	System.out.println(Frozen.getPrice());
	DisneyQueue dq = new DisneyQueue();
	dq.addMovie(LionKing);
	dq.addMovie(Cinderella);
	dq.addMovie(Tarzan);
	dq.addMovie(Mulan);
	dq.addMovie(Frozen);
	System.out.println(dq.sortMoviesByRating());
	
}
}
