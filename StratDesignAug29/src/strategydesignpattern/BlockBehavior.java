package strategydesignpattern;
import java.util.Random;

/**
 * This class implements DefenceBehavior and describes 
 * the behavior of a player when they block as a string
 * @author nylesgeiger
 *
 */
public class BlockBehavior implements DefenceBehavior{
	Random rand = new Random();
	String[] behaviorOptions = {
			"blocks player from passing", 
			"blacks player from shooting",
			"checks player with puck"}; 
	
	/**
	 * the play() method randomly selects a random 
	 * out of 3 actions action
	 * a player that is blocking can take
	 */
	@Override
	public String play() {
		int statement = rand.nextInt(3);
		return behaviorOptions[statement];
	}

}