package geometrie;

public class Rectangle extends Quadrilateral{

	
	public Rectangle() {
		super();
		this.code = 2;
		System.out.println("Rectangle Constructor.");
	} 
	
	public Rectangle(Point topLeft, Point bottomRight) {
        super(topLeft, new Point(topLeft.getX(), bottomRight.getY()), bottomRight, new Point(bottomRight.getX(), topLeft.getY()));

    }
	
	
	@Override
    public double getPerimeter() {
        double width = this.getTheSegments()[0].length();
        double height = this.getTheSegments()[1].length();
        System.out.println("Périmètre d’un rectangle");
        return 2 * (width + height);
    }
	
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}
