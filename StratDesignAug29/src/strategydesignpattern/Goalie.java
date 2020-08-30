package strategydesignpattern;
import java.util.Random;

/**
 * The Goalie class extends the Player class
 * and expresses the actions that a player with the 
 * Goalie position can evoke.
 * @author nylesgeiger
 *
 */
public class Goalie extends Player {
	Random rand = new Random();
	BlockGoalBehavior blockGoalBehavior = new BlockGoalBehavior();

	/**
	 *  The constructor for the object
	 * 
	 * Evokes the setOffenceBehavior() and setDefenceBehavior() 
	 * methods
	 * 
	 * the name parameter takes in a string which defines
	 * the name for each player given
	 * @param name
	 */
	public Goalie(String name) {
		super(name);
		
		setOffenceBehavior();
		setDefenceBehavior();
	}

	/**
	 * the toString() method returns the name and position
	 * of the player as a string.
	 */
	public String toString() {
		return name + " plays the position: Goalie";
	}

	/**
	 * the setOffenceBehavior() method determines the behavior behavior
	 * a player will take. In this case it will always be 
	 * blockGoalBehavior.
	 */
	@Override
	public void setOffenceBehavior() {
		offenseBehavior = blockGoalBehavior;
		
	}

	/**
	 * the setDefenceBehavior() method determines the behavior behavior
	 * a player will take. In this case it will always be 
	 * blockGoalBehavior.
	 */
	@Override
	public void setDefenceBehavior() {
		defenceBehavior = blockGoalBehavior;
		
	}
}
