package strategydesignpattern;

/**
 * This class implements OffenseBehavior and returns an action
 * a player evoking ShootBehavior can take as a string
 * @author nylesgeiger
 */
public class ShootBehavior implements OffenseBehavior{

	/**
	 * the play() method returns a string describing the behavior.
	 */
	@Override
	public String play() {
		return "shoots at the goal";
	}

}
