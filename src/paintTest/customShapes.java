package paintTest;

import java.awt.Point;
import java.awt.Shape;

public abstract class customShapes {
	protected Point theInitialPoint;
	protected Point theFinalPoint;
	protected String theColor;
	
	protected void setColor(String paramColor) {
		this.theColor=paramColor;
	}
	protected void setInitialPoint(Point p1) {
		this.theInitialPoint=p1;
	}
	protected void setFinalPoint(Point p2) {
		this.theFinalPoint=p2;
	}
	protected String getColor() {
		return theColor;
	}
	protected Point getInitialPoint() {
		return theInitialPoint;
	}
	protected Point getFinalPoint() {
		return theFinalPoint;
	}
	
	public abstract Shape theDraw() ;
}
