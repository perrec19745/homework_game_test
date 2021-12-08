package gamedice;

import java.util.Random;

public class DiceImpl implements Dice{
	public int roll() {
		return new Random().nextInt(6) + 1;
	}
}
