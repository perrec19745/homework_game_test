package test;

import gamedice.Dice;
import gamedice.DiceImpl;

public class DiceImplTest {
	public static void main(String[] args) {
		try {
			rollTest();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("Test is not right");
		}
	}

	public static void rollTest() {
		Dice dice = new DiceImpl();
		for (int i = 0; i < 1000; i++) {
			int actualResult = dice.roll();

			if (actualResult <= 0 || actualResult >= 7) {
				throw new RuntimeException("Число не входит в промежуток 1-6");
			}
			else {
				System.out.println("Тест пройден");
			}
		}

	}

}