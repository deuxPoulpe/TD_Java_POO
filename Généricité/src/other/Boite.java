package other;

public class Boite {
	/**
	 * Instantiate a default safe; capacity=1
	 * The safe is built opened and empty
	 */
	public Boite() {
		System.out.println("Default " + this.getClass().getName() + " constructor");
	}
	/**
	 * Boolean tracking the opened/closed state of the safe
	 */
	private boolean opened=true;
	/**
	 * Getter of the property <tt>opened</tt>
	 * @return  opened
	 */
	public boolean isOpened() {return opened; 	}
	/**
	 * Opening the safe
	 */
	public void open(){
		if(opened)System.err.println("Trying to open an opened safe...");
		this.opened=true;
	}
	/**
	 * Closing the safe
	 */
	public void close(){
		if(!isOpened())System.err.println("Trying to close a closed safe...");
		this.opened=false;
	}

	/**
	 * Content of the safe
	 */
	private Gemstone myGem;		
	/**
	 * Test wether the safe is full (if it contains a number of stones equal to its capacity)
	 * @return boolean, whether safe is full
	 */	
	public boolean isFull(){
		return this.myGem !=null;			
	}
	/**
	 * Add a gemstone in the Box
	 * @param gem the gemstone to add
	 */
	public void addGem(Gemstone gem){
		if ( !isOpened()) {
			System.out.println("My box is closed: cannot add any element");
			return ;
		}
		if (myGem!= null)
			System.out.println("MyBox has already an element, remove it before adding another");
		else
		{
			myGem = gem;
			// further management if you want to put an element in only one box
		}

	}
	
	/**
	 * 
	 * @return the gem inside the box, null if the box is already empty or is closed
	 */
	public Gemstone removeGem(){
		if(!isOpened()) return null;
		Gemstone g = myGem;
		myGem = null;
		return g;
	}
}
