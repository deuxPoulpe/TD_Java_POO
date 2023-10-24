package geometrie;

/**
 * This class represents a line segment. It is composed of two \texttt{Point}s corresponding to the extremities of the segment.
 * @author ceichler
 *
 */

public class Segment {


	/**
	 * This should compute the segment's length but does nothing quite obviously. You should probably implement it and update this comment
	 * @
	 */
	public double length(){
		
		return start.distance(end);
	}


	/**
	 * Re-implement toString for natural segment printing
     * Cf next chapter on heritance
	 */
	@Override
	public String toString(){
		return "["+start.getLabel()+end.getLabel()+"]";	
	}


	/**
	 * Starting point of the segment
	 */
	private Point start= new geometrie.Point();


	/**
	 * Getter of the property <tt>start</tt>
	 * @return  Returns the start.
	 */
	public Point getStart() {
		return start;
	}


	/**
	 * Setter of the property <tt>start</tt>
	 * @param start The start to set.
	 */
	public void setStart(Point start) {
		this.start= start;
	}


	/**
	 * End point of the segment
	 */
	private Point end = new geometrie.Point();


	/**
	 * Getter of the property <tt>end</tt>
	 * @return  Returns the end.
	 */
	public Point getEnd() {
		return end;
	}


	/**
	 * Setter of the property <tt>end</tt>
	 * @param end  The end to set.
	 */
	public void setEnd(Point end) {
		this.end = end;
	}



	/**
	 *  Segment constructor with the start and end points
	 * @param start starting point
	 * @param end ending point
	 */
	public Segment(Point start, Point end){
		this.start=start;
		this.end=end;
		System.out.println("A line segment has been created");
	}

}
