package project2;
public class BattleBoatsBoard {
	int[][] board;
	int shots;
	int turn;
	int shipsLeft;
	String mode;
	public BattleBoatsBoard(String mode) {
		if(mode.equals("Expert") || mode.equals("expert")) {
			board = new int[12][12];
		} else if(mode.equals("Standard") || mode.equals("standard")){
			board = new int[8][8];
		}
		
	}
	public static void main(String[] args) {
		System.out.println("test");
	}
	
}
