package strategydesignpattern;

/**
 * A class which defines the number of players and each of their
 * associated names. Works in combination with other
 * classes to get the Name, Position, and actions of each player
 * to print to the screen
 * @author nylesgeiger
 *
 */
public class Hockey {
	
	/**
	 * Defines the players and their names. Has designated sections
	 * where their bio, offensive plays, and defensive plays will
	 * be shown.
	 */
	public void play() {
		Player[] players = new Player[3];//new Player[3];
		players[0] = new Forward("John Tavares");
		players[1] = new Defenceman("Morgan Rielly");
		players[2] = new Goalie("Frederik Andersen");
		
		System.out.println("***** Players *****");
		displayPlayers(players);
		
		System.out.println("\n***** Offencive Plays *****");
		displayPlays(players);
		
		turnover(players);
		
		System.out.println("\n***** Defencive Plays *****");
		displayPlays(players);
		
	}
	
	/**
	 * loops through each player(object) and prints their name 
	 * and associated toString methods.
	 * 
	 * the parameter is an array of player objects
	 * @param players
	 */
	private void displayPlayers(Player[] players) {
		for(Player player : players) {
			System.out.println(player);
		}
	}
	
	/**
	 * loops through each player(object) and prints their name 
	 * and associated actions for the current behavior.
	 * 
	 * the parameter is an array of player objects
	 * @param players
	 */
	private void displayPlays(Player[] players) {
		for(Player player : players) {
			System.out.println(player.name + " " + player.play());
		}
	}
	
	/**
	 * loops through each player(object) and switches them to the
	 * Opposite objectives (offense/defense).
	 * 
	 * the parameter is an array of player objects
	 * @param players
	 */
	private void turnover(Player[] players) {
		for(Player player : players) {
			player.turnover();
		}
	}
	
	/**
	 * The main method goes through the Hockey classes methods.
	 * 
	 * The main method's default paramater
	 * @param args
	 */
	public static void main(String[] args) {
		Hockey hockey = new Hockey();
		hockey.play();
	}

}
