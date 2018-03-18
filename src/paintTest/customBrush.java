package paintTest;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class customBrush extends customOval{
	private Point brushInitialPoint=new Point(0,0);
	
	public void setThePoint(Point p1) {
		this.brushInitialPoint=p1;
	}
	public Shape theDraw() {
		return new Ellipse2D.Float((int)super.getInitialPoint().getX(), (int)super.getInitialPoint().getY(), 8, 8);
	}

}
