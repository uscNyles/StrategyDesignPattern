package strategydesignpattern;

/**
 * This class implements OffenseBehavior and returns an action
 * a player evoking SlapShotBehavior can take as a string
 * @author nylesgeiger
 *
 */
public class SlapShotBehavior implements OffenseBehavior{

	/**
	 * the play() method returns a string describing the behavior.
	 */
	@Override
	public String play() {
		return "shoots the puck from the blue line";
	}

}
