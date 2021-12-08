package test;

import gamedice.*;

public class GameTest {
	public static void main(String[] args) {
 		nobodyTest();
		winnerPlayer1Test();
		winnerPlayer2Test();

	}

	private static void winnerPlayer2Test() {
		Dice dice = new Fake3Dice();
		SpyPrinter winnerPrinter = new SpyPrinter();
		Game game = new Game(dice, winnerPrinter);
		game.playGame(new Player("Bob"), new Player("Max"));
		if (winnerPrinter.getWinner().getName().equals("Bob")){
			System.out.println("Error. Победителем должен быть: " + winnerPrinter.getWinner().getName());
		} else {
			System.out.println("Тест пройден. Победитель: " + winnerPrinter.getWinner().getName());
		}
	}

	private static void winnerPlayer1Test() {
		Dice dice = new Fake2Dice();
		SpyPrinter winnerPrinter = new SpyPrinter();
		Game game = new Game(dice, winnerPrinter);
		game.playGame(new Player("Bob"), new Player("Max"));
		if (winnerPrinter.getWinner().getName().equals("Max")){
			System.out.println("Error. Должен быть: " + winnerPrinter.getWinner().getName());

		}else {
			System.out.println("Тест прошел. Победитель: " + winnerPrinter.getWinner().getName());
		}
	}

	private static void nobodyTest() {
		Dice dice = new FakeDice();
		SpyPrinter winnerPrinter = new SpyPrinter();
		Game game = new Game(dice, winnerPrinter);
		game.playGame(new Player("Bob"), new Player("Max"));
		if (winnerPrinter.getWinner() != null){
			System.out.println("Error.Должна быть ничья");
		}else{
			System.out.println("OK");
		}
	}

}
