package geometrie;

public class Ellipse extends Conical {
	


	public Ellipse(String color, String texture) {
        super(color, texture);
    }
	
	public Ellipse() {
		super(null,null);
		this.code  = 3;
	}
	
	
    @Override
    public double getPerimeter() {
        return -1;
    }
}