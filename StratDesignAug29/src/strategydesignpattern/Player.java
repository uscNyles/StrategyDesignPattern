package strategydesignpattern;

/**
 * An abstract class which describes the general shape for 
 * the position classes.
 * @author nylesgeiger
 *
 */
public abstract class Player {
	
	protected String name;
	
	private boolean offense = true;
	
	protected DefenceBehavior defenceBehavior;
	
	protected OffenseBehavior offenseBehavior;

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
	public Player (String name) {
		
		setDefenceBehavior();
		setOffenceBehavior();
		this.name = name;
	}
	
	/**
	 * A method which will be passed down to all children.
	 * Will work to define their offensive behaviors.
	 */
	public abstract void setOffenceBehavior();
	
	/**
	 *  A method which will be passed down to all children.
	 * Will work to define their defensive behaviors.
	 */
	public abstract void setDefenceBehavior();
	
	/**
	 * evokes the actions within the behaviors each player 
	 * is defined to have. Returns the actions as strings.
	 * @return
	 */
	public String play() {
		if (offense == true){
			return offenseBehavior.play();
		}
		else {
			return offenseBehavior.play();
		}
	}
	
	/**
	 * switches between a players offensive and defensive behavior.
	 */
	public void turnover() {
		if (offense == true){
			offense = false;
		}
		else {
			offense = true;
		}
	}
	
	
	
}
