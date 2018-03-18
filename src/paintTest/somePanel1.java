package paintTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class somePanel1 extends JPanel implements MouseListener,MouseMotionListener {

	/**
	 * Create the panel.
	 */
	private Point initialPoint=new Point(0, 0);
	private Point finalPoint=new Point(0, 0);
	private String selectedAction;
	private String selectedColor;
	private ArrayList<customLine> customLineArrayList=new ArrayList<customLine>();
	private ArrayList<customOval> customOvalArrayList=new ArrayList<customOval>();
	private ArrayList<customQuadrilateral> customQuadrilateralArrayList=new ArrayList<customQuadrilateral>();
	
	private ArrayList<customBrush> customBrushArrayList=new ArrayList<customBrush>();
	
	customLine cl2=new customLine();
	private boolean lineDragLock=false;
	
	customOval co2=new customOval();
	private boolean ovalDragLock=false;
	
	customQuadrilateral cq2=new customQuadrilateral();
	private boolean quadDraqLock=false;
	
	public somePanel1() {
		setPreferredSize(new Dimension(319, 272));
		setBackground(Color.yellow);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void setAction(String theAction) {
		this.selectedAction=theAction;
		
	}
	public void setShapeColor(String theReceivedColor) {
		this.selectedColor=theReceivedColor;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		initialPoint=e.getPoint();
		if(selectedAction=="drawBrush") {
			customBrush cb1=new customBrush();
			cb1.setInitialPoint(e.getPoint());
			cb1.setColor(selectedColor);
			customBrushArrayList.add(cb1);
			repaint();
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//finalPoint=e.getPoint();
		if(selectedAction=="drawLine") {
			customLine cl1=new customLine();
			cl1.setInitialPoint(initialPoint);
			cl1.setFinalPoint(e.getPoint());
			cl1.setColor(selectedColor);
			customLineArrayList.add(cl1);
		}
		else if(selectedAction=="drawCircle") {
			customOval co1=new customOval();
			co1.setInitialPoint(initialPoint);
			co1.setFinalPoint(e.getPoint());
			co1.setColor(selectedColor);
			customOvalArrayList.add(co1);
		}
		else if(selectedAction=="drawQuad") {
			customQuadrilateral cq1=new customQuadrilateral();
			cq1.setInitialPoint(initialPoint);
			cq1.setFinalPoint(e.getPoint());
			cq1.setColor(selectedColor);
			customQuadrilateralArrayList.add(cq1);
			
		}
		repaint();
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(selectedAction=="drawLine") {
			cl2.setInitialPoint(initialPoint);
			cl2.setFinalPoint(e.getPoint());
			cl2.setColor(selectedColor);
			System.out.println(e.getPoint());
			lineDragLock=true;
		}
		else if(selectedAction=="drawCircle") {
			co2.setInitialPoint(initialPoint);
			co2.setFinalPoint(e.getPoint());
			co2.setColor(selectedColor);
			ovalDragLock=true;
		}
		else if(selectedAction=="drawBrush") {
			customBrush cb1=new customBrush();
			cb1.setInitialPoint(e.getPoint());
			cb1.setColor(selectedColor);
			customBrushArrayList.add(cb1);
			//repaint();
		}
		else if(selectedAction=="drawQuad") {
			cq2.setInitialPoint(initialPoint);
			cq2.setFinalPoint(e.getPoint());
			cq2.setColor(selectedColor);
			quadDraqLock=true;
		}
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/*public Line2D.Float drawLine() {
		return new Line2D.Float((int)initialPoint.getX(), (int)initialPoint.getY(), (int)finalPoint.getX(),(int)finalPoint.getY());
		
	}*/
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g1=(Graphics2D) g;
		super.paintComponent(g);
		
		for(customLine theLoopNum:customLineArrayList) {
			//String drawColor="Color"+theLoopNum.getColor();
			g1.setColor(Color.decode(theLoopNum.getColor()));
			//g1.setColor(Color.decode("#ff0000"));
			g1.draw(theLoopNum.theDraw());
			
			System.out.println(theLoopNum.getInitialPoint());
		}
		for(customOval theLoopNumOval:customOvalArrayList) {
			g1.setColor(Color.decode(theLoopNumOval.getColor()));
			g1.draw(theLoopNumOval.theDraw());
			//System.out.println(theLoopNum.getInitialPoint());
		}
		if(customBrushArrayList.size()>0) {
			for(customBrush theLoopNumBrush:customBrushArrayList) {
				g1.setColor(Color.decode(theLoopNumBrush.getColor()));
				g1.fill(theLoopNumBrush.theDraw());
				g1.draw(theLoopNumBrush.theDraw());
				
			}
		}
		for(customQuadrilateral theLoopNumQuad:customQuadrilateralArrayList) {
			g1.setColor(Color.decode(theLoopNumQuad.getColor()));
			g1.draw(theLoopNumQuad.theDraw());
		}
		//g1.draw(cl1.drawLine());
		if(lineDragLock==true) {
			g1.setColor(Color.decode(cl2.getColor()));
			g1.draw(cl2.theDraw());
			lineDragLock=false;
		}
		else if(ovalDragLock==true) {
			g1.setColor(Color.decode(co2.getColor()));
			g1.draw(co2.theDraw());
			ovalDragLock=false;
		}
		else if(quadDraqLock==true) {
			g1.setColor(Color.decode(cq2.getColor()));
			g1.draw(cq2.theDraw());
			quadDraqLock=false;
		}
	}


}
