package paintTest;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class customOval extends customShapes{
	public Point theInitialPoint;
	public Point theFinalPoint;
	
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
	}
	public int getCenterX() {
		int theCenterX=(int)theInitialPoint.getX()+(((int)theFinalPoint.getX()-(int)theInitialPoint.getX())/2);
		return theCenterX;
	}
	public int getCenterY() {
		int theCenterY=(int)theInitialPoint.getY()+(((int)theFinalPoint.getY()-(int)theInitialPoint.getY())/2);
		return theCenterY;
	}*/
	public int getWidth() {
		int theWidth;
		theWidth=(int)super.getFinalPoint().getX()-(int)super.getInitialPoint().getX();
		if(theWidth<0) {
			theWidth=theWidth*-1;
		}
		return theWidth;
	}
	public int getHeight() {
		int theHeight;
		theHeight=(int)super.getFinalPoint().getY()-(int)super.getInitialPoint().getY();
		if(theHeight<0) {
			theHeight=theHeight*-1;
		}
		return theHeight;
	}
	public Shape theDraw() {
		//initial return type=Ellipse2D.Float
		return new Ellipse2D.Float((int)super.theInitialPoint.getX(), (int)super.theInitialPoint.getY(), this.getWidth(), this.getHeight());
		//return new Line2D.Float((int)theInitialPoint.getX(), (int)theInitialPoint.getY(), (int)theFinalPoint.getX(),(int)theFinalPoint.getY());
		
	}
}
