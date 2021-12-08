package test;

import gamedice.Dice;

public class Fake2Dice implements Dice {
	private int counter = 0;

	@Override
	public int roll() {
		counter++;
		if (counter % 2 != 0){
			return 5;
		}else {
			return 2;
		}
	}
}
