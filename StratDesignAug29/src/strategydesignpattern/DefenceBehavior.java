package strategydesignpattern;

/**
 * an interface which contains a method all children will impose
 * All children will describe defensive behaviors
 * @author nylesgeiger
 *
 */
public interface DefenceBehavior {
	
	/**
	 * The method which all children will express
	 * @return
	 */
	public String play();
}
