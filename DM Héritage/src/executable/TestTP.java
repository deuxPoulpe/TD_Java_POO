package executable;

import geometrie.*;


public class TestTP {

	
	public static void main(String[] args) {
		
		
        /*	
		Point p1 = new Point (1.0,1.0,"A");
		Point p2 = new Point (1.0,6.0,"B");
		Point p3 = new Point (6.0,6.0,"C");
		Point p4 = new Point (6.0,1.0,"D");
		
		Segment s1 = new Segment(p1,p2);
		Segment s2 = new Segment(p2,p3);
		Segment s3 = new Segment(p3,p4);
		Segment s4 = new Segment(p4,p1);
		
		Segment[] theSegments = new Segment[4];
		
		theSegments[0] = s1;
		theSegments[1] = s2;
		theSegments[2] = s3;
		theSegments[3] = s4;
		
		
		Rectangle rect1 = new Rectangle();
		
		
		rect1.setLesSegments(theSegments);
		
		
		System.out.println(rect1.toString());
		Rectangle rect2 = new Rectangle(new Point(0, 0), new Point(5, 10));
		System.out.println(rect2.getPerimeter());
		Quadrilateral quad1 = new Rectangle(new Point(0, 0), new Point(5, 10));
        System.out.println("Quad initialized with a rectangle: " + quad1.toString());
        System.out.println("Périmètre du quad: " + quad1.getPerimeter());
         */
		
		Rectangle r = new Rectangle();
		r.draw(4);
		r.draw();
		
		
		FigureGeometrique[] listFig = new FigureGeometrique[3];
		
		listFig[0] = new Rectangle();
		listFig[1] = new Quadrilateral();
		listFig[2] = new Ellipse();
		
		//Rectangle rect = new Quadrilateral();
		
		/*
		for(int i = 0 ; i <= 2 ; i++) {
			listFig[i].draw();
		}
		*/
		
		Quadrilateral rect = (Rectangle) listFig[0];
		rect.getPerimeter();
		
		for(int i = 0 ; i <= 2 ; i++) {
			System.out.println(listFig[i].code);
			
		}
		
		

	}

}
