package geometrie;

public class Polygon extends FigureGeometrique {
	
	public Polygon(String color, String texture) {
        super(color, texture);
    }
	
    @Override
    public double getPerimeter() {
        return -1; 
    }
}