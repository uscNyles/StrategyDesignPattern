package strategydesignpattern;

/**
 *an interface which contains a method all children will impose. 
 *All children will describe offensive behaviors
 * @author nylesgeiger
 *
 */
public interface OffenseBehavior {
	
	/**
	 * The method which all children will express
	 * @return
	 */
	public String play();
}
