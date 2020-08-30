package strategydesignpattern;
import java.util.Random;

/**
 * This class implements DefenceBehavior and OffenseBehavior
 * interfaces. It will return an action a player evoking
 * the BlockGoalBehavior class can express as a string.
 * @author nylesgeiger
 *
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenseBehavior{
	
	Random rand = new Random();
	String[] behaviorOptions = {
			"hand blocks the puck", 
			"catches the puck",
			"blocks puck with knee pads",
			"blocks puck with stick"}; 
	
	/**
	 *  the play() method randomly selects a random 
	 * out of 4 actions action
	 * a player that is blocking can take
	 */
	@Override
	public String play() {
		int statement = rand.nextInt(4);
		return behaviorOptions[statement];
	}

}
