package gamedice;

public class GameWinnerPrinterConsolePrinter implements GameWinnerPrinter {
	@Override
	public void printWinner(Player winner){
		System.out.println("Победитель: " + winner.getName());
	}
}
