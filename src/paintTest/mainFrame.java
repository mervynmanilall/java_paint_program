package paintTest;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainFrame extends JFrame {

	private JPanel contentPane;
	private JPanel pnlDraw;
	private JButton btnLine;
	private JButton btnCircle;
	private JButton btnBrush;
	private JButton btnQuadriteral;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pnlDraw = new JPanel();
		pnlDraw.setBackground(Color.PINK);
		pnlDraw.setBounds(0, 0, 319, 272);
		contentPane.add(pnlDraw);
		//pnlDraw.setLayout(null);
		
		somePanel1 sp1=new somePanel1();
		pnlDraw.add(sp1);
		
		btnLine = new JButton("Line");
		btnLine.setEnabled(false);
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp1.setAction("drawLine");
			}
		});
		btnLine.setBounds(327, 6, 117, 29);
		contentPane.add(btnLine);
		
		btnCircle = new JButton("Circle");
		btnCircle.setEnabled(false);
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp1.setAction("drawCircle");
			}
		});
		btnCircle.setBounds(327, 61, 117, 29);
		contentPane.add(btnCircle);
		
		btnBrush = new JButton("Brush");
		btnBrush.setEnabled(false);
		btnBrush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp1.setAction("drawBrush");
			}
		});
		btnBrush.setBounds(331, 110, 117, 29);
		contentPane.add(btnBrush);
		
		btnQuadriteral = new JButton("Quadriteral");
		btnQuadriteral.setEnabled(false);
		btnQuadriteral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp1.setAction("drawQuad");
			}
		});
		btnQuadriteral.setBounds(327, 151, 117, 29);
		contentPane.add(btnQuadriteral);
		
		JButton btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp1.setShapeColor("#ff0000");
				releaseAction();
			}
		});
		btnRed.setBounds(327, 195, 117, 29);
		contentPane.add(btnRed);
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp1.setShapeColor("#0000ff");
				releaseAction();
			}
		});
		btnBlue.setBounds(327, 225, 117, 29);
		contentPane.add(btnBlue);

	}
	private void releaseAction() {
		btnLine.setEnabled(true);
		btnCircle.setEnabled(true);
		btnBrush.setEnabled(true);
		btnQuadriteral.setEnabled(true);
	}
}
