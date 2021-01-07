import javax.swing.JOptionPane;


public class Tester {

	private static final int STARTING_MONEY = 1500;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p1Name = JOptionPane.showInputDialog("Please input a name for player 1");
		Player p1 = new Player(STARTING_MONEY, p1Name);
		String p2Name = JOptionPane.showInputDialog("Please input a name for player 2");
		Player p2 = new Player(STARTING_MONEY, p2Name);
		MonopolyBoard gameBoard = new MonopolyBoard(p1Name, p2Name);
		Game myGame = new Game(gameBoard, p1, p2);
	}

}
