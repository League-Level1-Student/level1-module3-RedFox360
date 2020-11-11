package _05_netflix;

public class NetflixDriver {
public static void main(String[] args) {
	Movie LionKing = new Movie("Lion King", 4.25);
	Movie Cinderella = new Movie("Cinderella", 4.3);
	Movie Tarzan = new Movie("Tarzan", 4.40);
	Movie Mulan = new Movie("Mulan", 4.55);
	Movie Frozen = new Movie("Frozen", 3.5);
	LionKing.getPrice();
	Cinderella.getPrice();
	Tarzan.getPrice();
	Mulan.getPrice();
	Frozen.getPrice();
	NetflixQueue nq = new NetflixQueue();
	nq.addMovie(LionKing);
	nq.addMovie(Cinderella);
	nq.addMovie(Tarzan);
	nq.addMovie(Mulan);
	nq.addMovie(Frozen);
	
	
}
}
