package gamedice;

public class DemoGame {
	public static void main(String[] args) {
		Dice dice = new DiceImpl();
		GameWinnerPrinter gameWinnerPrinter = new GameWinnerPrinterConsolePrinter();
		Game game = new Game(dice, gameWinnerPrinter);
		game.playGame(new Player("Петя"), new Player("Вася"));
	}
}
