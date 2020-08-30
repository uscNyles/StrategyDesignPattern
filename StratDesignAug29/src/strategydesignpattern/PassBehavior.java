package strategydesignpattern;

/**
 * This class implements OffenseBehavior and returns an action
 * a player evoking PassBehavior can take as a string
 * @author nylesgeiger
 */
public class PassBehavior implements OffenseBehavior{

	/**
	 * the play() method returns a string describing the behavior.
	 */
	@Override
	public String play() {
		return "passes to a forward";
	}

}
