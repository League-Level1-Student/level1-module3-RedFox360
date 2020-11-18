package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldDriver {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	World w = new World();
	Bug bug = new Bug();
	for(int i = 0; i < 2; i ++) {
		bug.turn();
	}
	w.add(new Location(5, 5), bug);
	w.show();
	Flower f1 = new Flower();
	w.add(new Location(5, 4), f1);
	Flower f2 = new Flower();
	w.add(new Location(4, 5), f2);
	for (int i = 0; i < 98; i++) {
		w.add(w.getRandomEmptyLocation(), new Flower());
	}
	
}
}
