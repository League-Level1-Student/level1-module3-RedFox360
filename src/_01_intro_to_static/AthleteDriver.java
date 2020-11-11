package _01_intro_to_static;

public class AthleteDriver {
public static void main(String[] args) {
	//create two athletes
    //print their names, bibNumbers, and the location of their race. 
	Athlete UsainBolt = new Athlete("Usain Bolt", 28);
	Athlete MichaelPhelps = new Athlete("Michael Phelps", 6);
	System.out.println(UsainBolt.bibNumber);
	System.out.println(MichaelPhelps.bibNumber);
	System.out.println(UsainBolt.raceLocation);
	System.out.println(MichaelPhelps.raceLocation);
}
}
