
package geometrie;

public abstract class FigureGeometrique {
	
	protected String color;
    private String texture;
    public int code;

    public FigureGeometrique(String color, String texture) {
        this.color = color;
        this.texture = texture;
        this.code = 0;
    }
    
    public void draw(int zone) {
    	System.out.println("Drawing the"+ zone +"th zone of\r\n a shape");    	
    }
    
    public void draw() {
    	System.out.println("Drawing a geometrical shape");
    }
 
    public abstract double getPerimeter();
}
