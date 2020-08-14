package edu.utexas.se.swing.sample;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class chooseaside {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chooseaside window = new chooseaside();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public chooseaside() {
		initialize();
	}

	//Variables for later
	public static boolean onRed = false;
	public static boolean onBlue = false;
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 675, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChooseASide = new JLabel("Choose the side that your robot's on:");
		lblChooseASide.setFont(new Font("LiHei Pro", Font.PLAIN, 33));
		lblChooseASide.setBounds(41, 6, 592, 54);
		frame.getContentPane().add(lblChooseASide);
		
		Image gameField = new ImageIcon(this.getClass().getResource("/gamefield.png")).getImage().getScaledInstance(555, 229, Image.SCALE_DEFAULT);
		
		JLabel gameFieldImage = new JLabel("New label");
		gameFieldImage.setBounds(51, 80, 559, 249);
		frame.getContentPane().add(gameFieldImage);
		gameFieldImage.setIcon(new ImageIcon(gameField));
		
		JButton btnBlueAlliance = new JButton("Blue Alliance");
		btnBlueAlliance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onBlue = true;
				onRed = false;
				scoutingauto.main(null);
				//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
			}
		});
		btnBlueAlliance.setBackground(Color.BLUE);
		btnBlueAlliance.setBounds(138, 354, 117, 29);
		frame.getContentPane().add(btnBlueAlliance);
		
		JButton btnRedAlliance = new JButton("Red Alliance");
		btnRedAlliance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onRed = true;
				onBlue = false;
				scoutingauto.main(null);
				//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
			}
		});
		btnRedAlliance.setBackground(Color.RED);
		btnRedAlliance.setBounds(408, 354, 117, 29);
		frame.getContentPane().add(btnRedAlliance);
	}
	
	public static boolean getOnBlue(){
		return onBlue;
	}
	public static boolean getOnRed(){
		return onRed;
	}

	public static JFrame getFrame() {
		return frame;
	}

}
