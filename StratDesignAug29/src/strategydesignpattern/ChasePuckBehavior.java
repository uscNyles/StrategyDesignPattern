package strategydesignpattern;

/**
 * This class implements DefenceBehavior and returns an action
 * a player evoking ChasePuckBehavior can take as a string
 * @author nylesgeiger
 *
 */
public class ChasePuckBehavior implements DefenceBehavior{

	/**
	 * the play() method returns a string describing the behavior
	 */
	@Override
	public String play() {
		return "Chases the puck";
	}

}
