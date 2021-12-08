package test;

import gamedice.Dice;

public class FakeDice implements Dice {

	@Override
	public int roll() {
		return 3;
	}
}
