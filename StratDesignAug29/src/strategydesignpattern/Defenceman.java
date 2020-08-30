
package strategydesignpattern;
import java.util.Random;

/**
 * The Defenceman class extends the Player class
 * and expresses the actions that a player with the 
 * Defenceman position can evoke.
 * @author nylesgeiger
 *
 */
public class Defenceman extends Player {
	 Random rand;
	PassBehavior passBehavior = new PassBehavior();
	SlapShotBehavior slapShotBehavior = new SlapShotBehavior();
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
	public Defenceman(String name) {
		super(name);
		setOffenceBehavior();
		setDefenceBehavior();
	}

	/**
	 * the toString() method returns the name and position
	 * of the player as a string.
	 */
	public String toString() {
		return name + " plays the position: Defenseman";
	}

	/**
	 * the setOffenceBehavior method determines the offensive behavior
	 * a player will take. Behaviors are chosen using a Random number
	 * generator. In this case, passBehavior will be chosen 9 times
	 * out of 10.
	 */
	@Override
	public void setOffenceBehavior() {
		rand = new Random();
		String choice = ""+ rand.nextInt(10);
		
		if (choice == "10") {
			offenseBehavior = slapShotBehavior;
		} else {
			offenseBehavior = passBehavior;
		}
	}

	/**
	 * the setDefenceBehavior method determines the behavior behavior
	 * a player will take. Behaviors are chosen using a Random number
	 * generator.
	 */
	@Override
	public void setDefenceBehavior() {
		rand = new Random();
		int choice = rand.nextInt(2);
		if (choice == 1) {
			defenceBehavior = chasePuckBehavior;
		} else {
			defenceBehavior = blockBehavior;
		}
	}
	
}
