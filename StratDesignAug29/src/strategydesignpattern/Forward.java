package strategydesignpattern;

import java.util.Random;

/**
 * The Forward class extends the Player class
 * and expresses the actions that a player with the 
 * Forward position can evoke.
 * @author nylesgeiger
 *
 */
public class Forward extends Player{
	Random rand = new Random();
	PassBehavior passBehavior = new PassBehavior();
	ShootBehavior shootBehavior = new ShootBehavior();
	ChasePuckBehavior chasePuckBehavior = new ChasePuckBehavior();
	BlockBehavior blockBehavior = new BlockBehavior();

	/**
	 * The constructor for the object
	 * 
	 * Evokes the setOffenceBehavior() and setDefenceBehavior() 
	 * methods
	 * 
	 * the name parameter takes in a string which defines
	 * the name for each player given
	 * @param name
	 */
	public Forward(String name) {
		super(name);
		setOffenceBehavior();
		setDefenceBehavior();
	}

	/**
	 * the toString() method returns the name and position
	 * of the player as a string.
	 */
	public String toString() {
		return name + " plays the position: Forward";
	}

	/**
	 * the setOffenceBehavior() method determines the behavior behavior
	 * a player will take. Behaviors are chosen using a Random number
	 * generator.
	 */
	@Override
	public void setOffenceBehavior() {
		rand = new Random();
		int eitherOr = rand.nextInt(2);
		if (eitherOr == 1) {
			offenseBehavior = passBehavior;
		} else {
			offenseBehavior = shootBehavior;
		}
		
	}

	/**
	 * the setOffenceBehavior() method determines the behavior behavior
	 * a player will take. Behaviors are chosen using a Random number
	 * generator.
	 */
	@Override
	public void setDefenceBehavior() {
		rand = new Random();
		int eitherOr = rand.nextInt(2);
		if (eitherOr == 1) {
			defenceBehavior = chasePuckBehavior;
		} else {
			defenceBehavior = blockBehavior;
		}
	}
	
}
