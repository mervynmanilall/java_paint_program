package paintTest;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;

public class customLine extends customShapes{
	//public Point theInitialPoint=new Point(0, 0);
	//public Point theFinalPoint=new Point(0, 0);
	
	/*public void setInitialPoint(Point p1) {
		this.theInitialPoint=p1;
	}
	public void setFinalPoint(Point p2) {
		this.theFinalPoint=p2;
	}
	public Point getInitialPoint() {
		return theInitialPoint;
	}
	public Point getFinalPoint() {
		return theFinalPoint;
	}*/
	public Shape theDraw() {
		//initial return type=Line2D.Float
		return new Line2D.Float((int)super.theInitialPoint.getX(), (int)super.theInitialPoint.getY(), (int)super.theFinalPoint.getX(),(int)super.theFinalPoint.getY());
		
	}
}
