package paintTest;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Line2D;

public class customQuadrilateral extends customShapes{
	
	public int quadWidth() {
		int theQuadWidth=(int)super.getFinalPoint().getX()-(int)super.getInitialPoint().getX();
		return theQuadWidth;
		
	}
	public int quadHeight() {
		int theQuadHeight=(int)super.getFinalPoint().getY()-(int)super.getInitialPoint().getY();
		return theQuadHeight;
	}
	
	@Override
	public Shape theDraw() {
		// TODO Auto-generated method stub
		return new Rectangle.Float((int)super.getInitialPoint().getX(), (int)super.getInitialPoint().getY(), quadWidth(), quadHeight());
	}

}
