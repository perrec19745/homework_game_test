package test;

import gamedice.Dice;

public class Fake3Dice implements Dice {
	private int counter = 0;
	@Override
	public int roll() {
		counter++;
		if (counter % 2 == 0){
			return 6;
		}
		else {
			return 3;
		}
	}
}
