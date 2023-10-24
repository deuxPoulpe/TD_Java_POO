package geometrie;

/**
 * This class represents a quadrilateral. It is specified by its 4 sides of type \texttt{Segment}.
 * @author ceichler
 *
 */
public class Quadrilateral extends Polygon {

	/** 
	 * A quadrilateral has 4 segments.
	 * For some reason this is a table. Should be a collection. That's very bad programming.
	 */
	private Segment[] theSegments = new Segment[4];

	/**
	 * Getter of the property <tt>TheSegments</tt>
	 * @return  Returns the segments.
	 */
	public Segment[] getTheSegments() {
		return theSegments;
	}

	/** 
	 * Setter of the property <tt>theSegments</tt>
	 * @param theSegments  The theSegments to set.
	 */
	public void setLesSegments(Segment[] theSegments) {
		this.theSegments = theSegments;
	}



	/**
	 * Computes the perimeter of a quadrilateral 
	 * @return  Returns the perimeter.
	 */
	public double getPerimeter() {
		double perimeter = 0;
		perimeter = theSegments[0].length() + theSegments[1].length() 
				+  theSegments[2].length()  + theSegments[3].length() ;
		return perimeter;
	}


	/**
	 * Re-implement toString for neat print
	 */
	public String toString(){
		return theSegments[0]+" "+theSegments[1]+" "+theSegments[2]+" "+theSegments[3] ;	
	}


	/**
	 * Constructor for quadrilateral
	 * @param p1 first point of the quad
	 * @param p2 second point of the quad
	 * @param p3 third point of the quad
	 * @param p4 pretty sure you can guess this one on your own
	 */
	public Quadrilateral(Point p1, Point p2, Point p3, Point p4){
		super(null,null);
		theSegments[0] = new Segment(p1,p2);
		theSegments[1] = new Segment(p2,p3);
		theSegments[2] = new Segment(p3,p4);
		theSegments[3] = new Segment(p4,p1);
		System.out.println("Quadrilateral");
	}


	/**
	 * Defaut constructor for quadrilateral
	 */
	public Quadrilateral(){
		this(new Point(),new Point(),new Point(),new Point());
		this.code = 1;
	}


}
