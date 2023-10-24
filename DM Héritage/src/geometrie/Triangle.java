package geometrie;

public class Triangle extends Polygon {
	
	public Triangle(String color, String texture) {
        super(color, texture);
    }
	
    @Override
    public double getPerimeter() {
        return -1;
    }
}