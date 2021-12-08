package test;

import gamedice.GameWinnerPrinter;
import gamedice.Player;

public class SpyPrinter implements GameWinnerPrinter {
	private Player winner;

	public Player getWinner() {
		return winner;
	}

	@Override
	public void printWinner(Player winner) {

	this.winner = winner;
	}
}
