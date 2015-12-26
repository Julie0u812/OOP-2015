package theGame;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends Canvas {

	private static final long serialVersionUID = -7288914953391361607L;

	

	public Window(int width, int height, String title, MainGame game) {
		JFrame myFrame = new JFrame(title);

		myFrame.setPreferredSize(new Dimension(width, height));
		myFrame.setMinimumSize(new Dimension(width, height));
		myFrame.setMaximumSize(new Dimension(width, height));

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(false);
		myFrame.setLocationRelativeTo(null);

		// ----------------------------------MARGINS----------------------------------------
		JButton buttonN;
		buttonN = new JButton("");
		buttonN.setBackground(Color.blue);
		buttonN.setPreferredSize(new Dimension(0, 20));
		myFrame.add(buttonN, BorderLayout.PAGE_START);

		JButton buttonS;
		buttonS = new JButton("");
		buttonS.setBackground(Color.blue);
		buttonS.setPreferredSize(new Dimension(0, 20));
		myFrame.add(buttonS, BorderLayout.PAGE_END);

		// -------------------------------GATES----------------------------------------------

		JButton buttonW;
		buttonW = new JButton("");
		buttonW.setBorder(null);
		buttonW.setPreferredSize(new Dimension(20, 0));

		JPanel gateW;
		gateW = new JPanel(new GridLayout(3, 1));

		JButton buttonW1 = new JButton("");
		buttonW1.setBackground(Color.BLUE);
		gateW.add(buttonW1, BorderLayout.NORTH);
		JButton buttonGate = new JButton("");
		buttonGate.setBackground(Color.RED);
		gateW.add(buttonGate);
		JButton buttonW2 = new JButton("");
		buttonW2.setBackground(Color.BLUE);
		gateW.add(buttonW2, BorderLayout.SOUTH);

		buttonW.add(gateW);
		myFrame.add(buttonW, BorderLayout.WEST);

		JButton buttonE;
		buttonE = new JButton("");
		buttonE.setBorder(null);
		buttonE.setPreferredSize(new Dimension(20, 0));

		JPanel gateE;
		gateE = new JPanel(new GridLayout(3, 1));

		JButton buttonE1 = new JButton("");
		buttonE1.setBackground(Color.BLUE);
		gateE.add(buttonE1, BorderLayout.NORTH);
		JButton buttonGate2 = new JButton("");
		buttonGate2.setBackground(Color.RED);
		gateE.add(buttonGate2);
		JButton buttonE2 = new JButton("");
		buttonE2.setBackground(Color.BLUE);
		gateE.add(buttonE2, BorderLayout.SOUTH);

		buttonE.add(gateE);
		myFrame.add(buttonE, BorderLayout.EAST);
		
		myFrame.add(game);
		
	
		myFrame.setVisible(true);
		
		game.startGame();
		
	}




}