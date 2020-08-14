package edu.utexas.se.swing.sample;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class scoutingteleop {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scoutingteleop window = new scoutingteleop();
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
	public scoutingteleop() {
	    
	    
	    //Resets all variables back to false
	    TopLeftLvl3Hatch = false;
		TopLeftLvl3Ball = false;
		TopLeftLvl2Hatch = false;
		TopLeftLvl2Ball = false;
		TopLeftLvl1Hatch = false;
		TopLeftLvl1Ball = false;
		TopRightLvl3Hatch = false;
		TopRightLvl3Ball = false;
		TopRightLvl2Hatch = false;
		TopRightLvl2Ball = false;
	    TopRightLvl1Hatch = false;
	    TopRightLvl1Ball = false;
		
		//-------------------------------------
		
		Spot1Hatch = false;
		Spot1Ball = false;
		Spot2Hatch = false;
	    Spot2Ball = false;
	    Spot3Hatch = false;
	    Spot3Ball = false;
		Spot4Hatch = false;
		Spot4Ball = false;
	    Spot5Hatch = false;
		Spot5Ball = false;
	    Spot6Hatch = false;
		Spot6Ball = false;
		Spot7Hatch = false;
		Spot7Ball = false;
		Spot8Hatch = false;
		Spot8Ball = false;
		
		//---------------------------------------
		
		BottomLeftLvl3Hatch = false;
		BottomLeftLvl3Ball = false;
		BottomLeftLvl2Hatch = false;
		BottomLeftLvl2Ball = false;
		BottomLeftLvl1Hatch = false;
		BottomLeftLvl1Ball = false;
		BottomRightLvl3Hatch = false;
		BottomRightLvl3Ball = false;
		BottomRightLvl2Hatch = false;
		BottomRightLvl2Ball = false;
		BottomRightLvl1Hatch = false;
		BottomRightLvl1Ball = false;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//List of variables for check boxes
	
	public static boolean TopLeftLvl3Hatch = false;
	public static boolean TopLeftLvl3Ball = false;
	public static boolean TopLeftLvl2Hatch = false;
	public static boolean TopLeftLvl2Ball = false;
	public static boolean TopLeftLvl1Hatch = false;
	public static boolean TopLeftLvl1Ball = false;
	public static boolean TopRightLvl3Hatch = false;
	public static boolean TopRightLvl3Ball = false;
	public static boolean TopRightLvl2Hatch = false;
	public static boolean TopRightLvl2Ball = false;
	public static boolean TopRightLvl1Hatch = false;
	public static boolean TopRightLvl1Ball = false;
	
	//-------------------------------------
	
	public static boolean Spot1Hatch = false;
	public static boolean Spot1Ball = false;
	public static boolean Spot2Hatch = false;
	public static boolean Spot2Ball = false;
	public static boolean Spot3Hatch = false;
	public static boolean Spot3Ball = false;
	public static boolean Spot4Hatch = false;
	public static boolean Spot4Ball = false;
	public static boolean Spot5Hatch = false;
	public static boolean Spot5Ball = false;
	public static boolean Spot6Hatch = false;
	public static boolean Spot6Ball = false;
	public static boolean Spot7Hatch = false;
	public static boolean Spot7Ball = false;
	public static boolean Spot8Hatch = false;
	public static boolean Spot8Ball = false;
	
	//---------------------------------------
	
	public static boolean BottomLeftLvl3Hatch = false;
	public static boolean BottomLeftLvl3Ball = false;
	public static boolean BottomLeftLvl2Hatch = false;
	public static boolean BottomLeftLvl2Ball = false;
	public static boolean BottomLeftLvl1Hatch = false;
	public static boolean BottomLeftLvl1Ball = false;
	public static boolean BottomRightLvl3Hatch = false;
	public static boolean BottomRightLvl3Ball = false;
	public static boolean BottomRightLvl2Hatch = false;
	public static boolean BottomRightLvl2Ball = false;
	public static boolean BottomRightLvl1Hatch = false;
	public static boolean BottomRightLvl1Ball = false;
	
	
	
	private void initialize() {
		
		if(chooseaside.getOnBlue()){
		frame = new JFrame();
		frame.setBounds(100, 100, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image blueField = new ImageIcon(this.getClass().getResource("/bluefield.png")).getImage().getScaledInstance(568, 456, Image.SCALE_DEFAULT);
		
		JLabel lblTopLeftSide = new JLabel("Left Side");
		lblTopLeftSide.setBounds(186, 6, 61, 16);
		frame.getContentPane().add(lblTopLeftSide);
		
		JCheckBox chckbxTopLeftLvl3Hatch = new JCheckBox("Lvl 3 Hatch");
		chckbxTopLeftLvl3Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopLeftLvl3Hatch.isSelected()){
				TopLeftLvl3Hatch=true;
				}
				else{
				TopLeftLvl3Hatch=false;
				}
			}
		});
		chckbxTopLeftLvl3Hatch.setBounds(110, 22, 103, 23);
		frame.getContentPane().add(chckbxTopLeftLvl3Hatch);
		
		JCheckBox chckbxTopLeftLvl2Hatch = new JCheckBox("Lvl 2 Hatch");
		chckbxTopLeftLvl2Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopLeftLvl2Hatch.isSelected()){
					TopLeftLvl2Hatch=true;
					}
					else{
					TopLeftLvl2Hatch=false;
					}
			}
		});
		chckbxTopLeftLvl2Hatch.setBounds(110, 44, 103, 23);
		frame.getContentPane().add(chckbxTopLeftLvl2Hatch);
		
		JCheckBox chckbxTopLeftLvl1Hatch = new JCheckBox("Lvl 1 Hatch");
		chckbxTopLeftLvl1Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopLeftLvl1Hatch.isSelected()){
					TopLeftLvl1Hatch=true;
					}
					else{
					TopLeftLvl1Hatch=false;
					}
			}
		});
		chckbxTopLeftLvl1Hatch.setBounds(110, 67, 103, 23);
		frame.getContentPane().add(chckbxTopLeftLvl1Hatch);
		
		JCheckBox chckbxTopLeftLvl1Ball = new JCheckBox("Lvl 1 Ball");
		chckbxTopLeftLvl1Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopLeftLvl1Ball.isSelected()){
					TopLeftLvl1Ball=true;
					}
					else{
					TopLeftLvl1Ball=false;
					}
			}
		});
		chckbxTopLeftLvl1Ball.setBounds(213, 67, 88, 23);
		frame.getContentPane().add(chckbxTopLeftLvl1Ball);
		
		JCheckBox chckbxTopLeftLvl2Ball = new JCheckBox("Lvl 2 Ball");
		chckbxTopLeftLvl2Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopLeftLvl2Ball.isSelected()){
					TopLeftLvl2Ball=true;
					}
					else{
					TopLeftLvl2Ball=false;
					}
			}
		});
		chckbxTopLeftLvl2Ball.setBounds(213, 44, 88, 23);
		frame.getContentPane().add(chckbxTopLeftLvl2Ball);
		
		JCheckBox chckbxTopLeftLvl3Ball = new JCheckBox("Lvl 3 Ball");
		chckbxTopLeftLvl3Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopLeftLvl3Ball.isSelected()){
					TopLeftLvl3Ball=true;
					}
					else{
					TopLeftLvl3Ball=false;
					}
			}
		});
		chckbxTopLeftLvl3Ball.setBounds(213, 22, 88, 23);
		frame.getContentPane().add(chckbxTopLeftLvl3Ball);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(313, 6, 12, 81);
		frame.getContentPane().add(verticalStrut);
		
		JCheckBox chckbxTopRightLvl3Hatch = new JCheckBox("Lvl 3 Hatch");
		chckbxTopRightLvl3Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopRightLvl3Hatch.isSelected()){
					TopRightLvl3Hatch=true;
					}
					else{
					TopRightLvl3Hatch=false;
					}
			}
		});
		chckbxTopRightLvl3Hatch.setBounds(337, 22, 103, 23);
		frame.getContentPane().add(chckbxTopRightLvl3Hatch);
		
		JCheckBox chckbxTopRightLvl2Hatch = new JCheckBox("Lvl 2 Hatch");
		chckbxTopRightLvl2Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopRightLvl2Hatch.isSelected()){
					TopRightLvl2Hatch=true;
					}
					else{
					TopRightLvl2Hatch=false;
					}
			}
		});
		chckbxTopRightLvl2Hatch.setBounds(337, 44, 103, 23);
		frame.getContentPane().add(chckbxTopRightLvl2Hatch);
		
		JCheckBox chckbxTopRightLvl1Hatch = new JCheckBox("Lvl 1 Hatch");
		chckbxTopRightLvl1Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopRightLvl1Hatch.isSelected()){
					TopRightLvl1Hatch=true;
					}
					else{
					TopRightLvl1Hatch=false;
					}
			}
		});
		chckbxTopRightLvl1Hatch.setBounds(337, 67, 103, 23);
		frame.getContentPane().add(chckbxTopRightLvl1Hatch);
		
		JLabel lblTopRightSide = new JLabel("Right Side");
		lblTopRightSide.setBounds(404, 6, 88, 16);
		frame.getContentPane().add(lblTopRightSide);
		
		JCheckBox chckbxTopRightLvl1Ball = new JCheckBox("Lvl 1 Ball");
		chckbxTopRightLvl1Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopRightLvl1Ball.isSelected()){
					TopRightLvl1Ball=true;
					}
					else{
					TopRightLvl1Ball=false;
					}
			}
		});
		chckbxTopRightLvl1Ball.setBounds(439, 67, 88, 23);
		frame.getContentPane().add(chckbxTopRightLvl1Ball);
		
		JCheckBox chckbxTopRightLvl2Ball = new JCheckBox("Lvl 2 Ball");
		chckbxTopRightLvl2Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopRightLvl2Ball.isSelected()){
					TopRightLvl2Ball=true;
					}
					else{
					TopRightLvl2Ball=false;
					}
			}
		});
		chckbxTopRightLvl2Ball.setBounds(439, 44, 128, 23);
		frame.getContentPane().add(chckbxTopRightLvl2Ball);
		
		JCheckBox chckbxTopRightLvl3Ball = new JCheckBox("Lvl 3 Ball");
		chckbxTopRightLvl3Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTopRightLvl3Ball.isSelected()){
					TopRightLvl3Ball=true;
					}
					else{
					TopRightLvl3Ball=false;
					}
			}
		});
		chckbxTopRightLvl3Ball.setBounds(439, 22, 128, 23);
		frame.getContentPane().add(chckbxTopRightLvl3Ball);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(58, 92, 568, 456);
		frame.getContentPane().add(layeredPane);
		
		JLabel lbl123Rover = new JLabel("1     2    3");
		lbl123Rover.setBounds(472, 148, 72, 16);
		layeredPane.add(lbl123Rover);
		lbl123Rover.setForeground(Color.WHITE);
		
		JLabel lbl4Rover = new JLabel("4");
		lbl4Rover.setForeground(Color.WHITE);
		lbl4Rover.setBounds(386, 195, 72, 38);
		layeredPane.add(lbl4Rover);
		
		JLabel lbl5Rover = new JLabel("5");
		lbl5Rover.setForeground(Color.WHITE);
		lbl5Rover.setBounds(386, 232, 61, 16);
		layeredPane.add(lbl5Rover);
		
		JLabel lbl678Rover = new JLabel("6     7     8");
		lbl678Rover.setForeground(Color.WHITE);
		lbl678Rover.setBounds(472, 288, 76, 16);
		layeredPane.add(lbl678Rover);
		
		JLabel blueFieldImage = new JLabel("New label");
		blueFieldImage.setBounds(0, 0, 568, 456);
		layeredPane.add(blueFieldImage);
		blueFieldImage.setIcon(new ImageIcon(blueField));
		
		JLabel lblSpot1 = new JLabel("Spot 1");
		lblSpot1.setBounds(638, 129, 40, 16);
		frame.getContentPane().add(lblSpot1);
		
		JLabel lblSpot2 = new JLabel("Spot 2");
		lblSpot2.setBounds(638, 182, 40, 16);
		frame.getContentPane().add(lblSpot2);
		
		JLabel lblSpot3 = new JLabel("Spot 3");
		lblSpot3.setBounds(638, 235, 40, 16);
		frame.getContentPane().add(lblSpot3);
		
		JLabel lblSpot4 = new JLabel("Spot 4");
		lblSpot4.setBounds(638, 288, 40, 16);
		frame.getContentPane().add(lblSpot4);
		
		JLabel lblSpot5 = new JLabel("Spot 5");
		lblSpot5.setBounds(638, 344, 40, 16);
		frame.getContentPane().add(lblSpot5);
		
		JLabel lblSpot6 = new JLabel("Spot 6");
		lblSpot6.setBounds(638, 397, 47, 16);
		frame.getContentPane().add(lblSpot6);
		
		JLabel lblSpot7 = new JLabel("Spot 7");
		lblSpot7.setBounds(638, 447, 40, 16);
		frame.getContentPane().add(lblSpot7);
		
		JLabel lblSpot8 = new JLabel("Spot 8");
		lblSpot8.setBounds(638, 499, 40, 16);
		frame.getContentPane().add(lblSpot8);
		
		JCheckBox chckbxSpot1Hatch = new JCheckBox("Hatch");
		chckbxSpot1Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot1Hatch.isSelected()){
					Spot1Hatch=true;
					}
					else{
				    Spot1Hatch=false;
					}
			}
		});
		chckbxSpot1Hatch.setBounds(690, 120, 69, 33);
		frame.getContentPane().add(chckbxSpot1Hatch);
		
		JCheckBox chckbxSpot1Ball = new JCheckBox("Ball");
		chckbxSpot1Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot1Ball.isSelected()){
					Spot1Ball=true;
					}
					else{
				    Spot1Ball=false;
					}
			}
		});
		chckbxSpot1Ball.setBounds(759, 120, 200, 33);
		frame.getContentPane().add(chckbxSpot1Ball);
		
		JCheckBox chckbxSpot2Hatch = new JCheckBox("Hatch");
		chckbxSpot2Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot2Hatch.isSelected()){
					Spot2Hatch=true;
					}
					else{
				    Spot2Hatch=false;
					}
			}
		});
		chckbxSpot2Hatch.setBounds(690, 173, 69, 33);
		frame.getContentPane().add(chckbxSpot2Hatch);
		
		JCheckBox chckbxSpot2Ball = new JCheckBox("Ball");
		chckbxSpot2Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot2Ball.isSelected()){
					Spot2Ball=true;
					}
					else{
				    Spot2Ball=false;
					}
			}
		});
		chckbxSpot2Ball.setBounds(759, 173, 200, 33);
		frame.getContentPane().add(chckbxSpot2Ball);
		
		JCheckBox chckbxSpot3Hatch = new JCheckBox("Hatch");
		chckbxSpot3Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot3Hatch.isSelected()){
					Spot3Hatch=true;
					}
					else{
				    Spot3Hatch=false;
					}
			}
		});
		chckbxSpot3Hatch.setBounds(690, 218, 69, 50);
		frame.getContentPane().add(chckbxSpot3Hatch);
		
		JCheckBox chckbxSpot3Ball = new JCheckBox("Ball");
		chckbxSpot3Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot3Ball.isSelected()){
					Spot3Ball=true;
					}
					else{
				    Spot3Ball=false;
					}
			}
		});
		chckbxSpot3Ball.setBounds(759, 218, 200, 50);
		frame.getContentPane().add(chckbxSpot3Ball);
		
		JCheckBox chckbxSpot4Hatch = new JCheckBox("Hatch");
		chckbxSpot4Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot4Hatch.isSelected()){
					Spot4Hatch=true;
					}
					else{
				    Spot4Hatch=false;
					}
			}
		});
		chckbxSpot4Hatch.setBounds(690, 271, 69, 50);
		frame.getContentPane().add(chckbxSpot4Hatch);
		
		JCheckBox chckbxSpot4Ball = new JCheckBox("Ball");
		chckbxSpot4Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot4Ball.isSelected()){
					Spot4Ball=true;
					}
					else{
				    Spot4Ball=false;
					}
			}
		});
		chckbxSpot4Ball.setBounds(759, 271, 200, 50);
		frame.getContentPane().add(chckbxSpot4Ball);
		
		JCheckBox chckbxSpot5Hatch = new JCheckBox("Hatch");
		chckbxSpot5Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot1Hatch.isSelected()){
					Spot5Hatch=true;
					}
					else{
				    Spot5Hatch=false;
					}
			}
		});
		chckbxSpot5Hatch.setBounds(690, 327, 69, 50);
		frame.getContentPane().add(chckbxSpot5Hatch);
		
		JCheckBox chckbxSpot5Ball = new JCheckBox("Ball");
		chckbxSpot5Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot5Ball.isSelected()){
					Spot5Ball=true;
					}
					else{
				    Spot5Ball=false;
					}
			}
		});
		chckbxSpot5Ball.setBounds(759, 327, 200, 50);
		frame.getContentPane().add(chckbxSpot5Ball);
		
		JCheckBox chckbxSpot6Hatch = new JCheckBox("Hatch");
		chckbxSpot6Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot6Hatch.isSelected()){
					Spot6Hatch=true;
					}
					else{
				    Spot6Hatch=false;
					}
			}
		});
		chckbxSpot6Hatch.setBounds(690, 380, 69, 50);
		frame.getContentPane().add(chckbxSpot6Hatch);
		
		JCheckBox chckbxSpot6Ball = new JCheckBox("Ball");
		chckbxSpot6Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot6Ball.isSelected()){
					Spot6Ball=true;
					}
					else{
				    Spot6Ball=false;
					}
			}
		});
		chckbxSpot6Ball.setBounds(759, 380, 200, 50);
		frame.getContentPane().add(chckbxSpot6Ball);
		
		JCheckBox chckbxSpot7Hatch = new JCheckBox("Hatch");
		chckbxSpot7Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot7Hatch.isSelected()){
					Spot7Hatch=true;
					}
					else{
				    Spot7Hatch=false;
					}
			}
		});
		chckbxSpot7Hatch.setBounds(690, 430, 69, 50);
		frame.getContentPane().add(chckbxSpot7Hatch);
		
		JCheckBox chckbxSpot7Ball = new JCheckBox("Ball");
		chckbxSpot7Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot7Ball.isSelected()){
					Spot7Ball=true;
					}
					else{
				    Spot7Ball=false;
					}
			}
		});
		chckbxSpot7Ball.setBounds(759, 430, 200, 50);
		frame.getContentPane().add(chckbxSpot7Ball);
		
		JCheckBox chckbxSpot8Hatch = new JCheckBox("Hatch");
		chckbxSpot8Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot8Hatch.isSelected()){
					Spot8Hatch=true;
					}
					else{
				    Spot8Hatch=false;
					}
			}
		});
		chckbxSpot8Hatch.setBounds(690, 482, 69, 50);
		frame.getContentPane().add(chckbxSpot8Hatch);
		
		JCheckBox chckbxSpot8Ball = new JCheckBox("Ball");
		chckbxSpot8Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpot8Ball.isSelected()){
					Spot8Ball=true;
					}
					else{
				    Spot8Ball=false;
					}
			}
		});
		chckbxSpot8Ball.setBounds(759, 482, 200, 50);
		frame.getContentPane().add(chckbxSpot8Ball);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setBounds(313, 550, 12, 115);
		frame.getContentPane().add(verticalStrut_1);
		
		JLabel lblBottomLeftSide = new JLabel("Left Side");
		lblBottomLeftSide.setBounds(186, 553, 61, 16);
		frame.getContentPane().add(lblBottomLeftSide);
		
		JCheckBox chckbxBottomLeftLvl3Hatch = new JCheckBox("Lvl 3 Hatch");
		chckbxBottomLeftLvl3Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomLeftLvl3Hatch.isSelected()){
					BottomLeftLvl3Hatch=true;
					}
					else{
					BottomLeftLvl3Hatch=false;
					}
			}
		});
		chckbxBottomLeftLvl3Hatch.setBounds(110, 570, 103, 33);
		frame.getContentPane().add(chckbxBottomLeftLvl3Hatch);
		
		JCheckBox chckbxBottomLeftLvl3Ball = new JCheckBox("Lvl 3 Ball");
		chckbxBottomLeftLvl3Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomLeftLvl3Ball.isSelected()){
					BottomLeftLvl3Ball=true;
					}
					else{
					BottomLeftLvl3Ball=false;
					}
			}
		});
		chckbxBottomLeftLvl3Ball.setBounds(213, 570, 88, 33);
		frame.getContentPane().add(chckbxBottomLeftLvl3Ball);
		
		JCheckBox chckbxBottomLeftLvl2Hatch = new JCheckBox("Lvl 2 Hatch");
		chckbxBottomLeftLvl2Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomLeftLvl2Hatch.isSelected()){
					BottomLeftLvl2Hatch=true;
					}
					else{
					BottomLeftLvl2Hatch=false;
					}
			}
		});
		chckbxBottomLeftLvl2Hatch.setBounds(110, 596, 103, 33);
		frame.getContentPane().add(chckbxBottomLeftLvl2Hatch);
		
		JCheckBox chckbxBottomLeftLvl2Ball = new JCheckBox("Lvl 2 Ball");
		chckbxBottomLeftLvl2Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomLeftLvl2Ball.isSelected()){
					BottomLeftLvl2Ball=true;
					}
					else{
					BottomLeftLvl2Ball=false;
					}
			}
		});
		chckbxBottomLeftLvl2Ball.setBounds(213, 596, 88, 33);
		frame.getContentPane().add(chckbxBottomLeftLvl2Ball);
		
		JCheckBox chckbxBottomLeftLvl1Hatch = new JCheckBox("Lvl 1 Hatch");
		chckbxBottomLeftLvl1Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomLeftLvl1Hatch.isSelected()){
					BottomLeftLvl1Hatch=true;
					}
					else{
					BottomLeftLvl1Hatch=false;
					}
			}
		});
		chckbxBottomLeftLvl1Hatch.setBounds(110, 626, 103, 23);
		frame.getContentPane().add(chckbxBottomLeftLvl1Hatch);
		
		JCheckBox chckbxBottomLeftLvl1Ball = new JCheckBox("Lvl 1 Ball");
		chckbxBottomLeftLvl1Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomLeftLvl1Ball.isSelected()){
					BottomLeftLvl1Ball=true;
					}
					else{
					BottomLeftLvl1Ball=false;
					}
			}
		});
		chckbxBottomLeftLvl1Ball.setBounds(213, 626, 88, 23);
		frame.getContentPane().add(chckbxBottomLeftLvl1Ball);
		
		JLabel lblRightSide = new JLabel("Right Side");
		lblRightSide.setBounds(404, 553, 69, 16);
		frame.getContentPane().add(lblRightSide);
		
		JCheckBox chckbxBottomRightLvl3Hatch = new JCheckBox("Lvl 3 Hatch");
		chckbxBottomRightLvl3Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl3Hatch.isSelected()){
					BottomRightLvl3Hatch=true;
					}
					else{
					BottomRightLvl3Hatch=false;
					}
			}
		});
		chckbxBottomRightLvl3Hatch.setBounds(337, 575, 103, 23);
		frame.getContentPane().add(chckbxBottomRightLvl3Hatch);
		
		JCheckBox chckbxBottomRightLvl2Hatch = new JCheckBox("Lvl 2 Hatch");
		chckbxBottomRightLvl2Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl2Hatch.isSelected()){
					BottomRightLvl2Hatch=true;
					}
					else{
					BottomRightLvl2Hatch=false;
					}
			}
		});
		chckbxBottomRightLvl2Hatch.setBounds(337, 596, 103, 33);
		frame.getContentPane().add(chckbxBottomRightLvl2Hatch);
		
		JCheckBox chckbxBottomRightLvl1Hatch = new JCheckBox("Lvl 1 Hatch");
		chckbxBottomRightLvl1Hatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl1Hatch.isSelected()){
					BottomRightLvl1Hatch=true;
					}
					else{
					BottomRightLvl1Hatch=false;
					}
			}
		});
		chckbxBottomRightLvl1Hatch.setBounds(337, 626, 103, 23);
		frame.getContentPane().add(chckbxBottomRightLvl1Hatch);
		
		JCheckBox chckbxBottomRightLvl3Ball = new JCheckBox("Lvl 3 Ball");
		chckbxBottomRightLvl3Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl3Ball.isSelected()){
					BottomRightLvl3Ball=true;
					}
					else{
					BottomRightLvl3Ball=false;
					}
			}
		});
		chckbxBottomRightLvl3Ball.setBounds(439, 575, 88, 28);
		frame.getContentPane().add(chckbxBottomRightLvl3Ball);
		
		JCheckBox chckbxBottomRightLvl2Ball = new JCheckBox("Lvl 2 Ball");
		chckbxBottomRightLvl2Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl2Ball.isSelected()){
					BottomRightLvl2Ball=true;
					}
					else{
					BottomRightLvl2Ball=false;
					}
			}
		});
		chckbxBottomRightLvl2Ball.setBounds(439, 596, 88, 33);
		frame.getContentPane().add(chckbxBottomRightLvl2Ball);
		
		JCheckBox chckbxBottomRightLvl1Ball = new JCheckBox("Lvl 1 Ball");
		chckbxBottomRightLvl1Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl1Ball.isSelected()){
					BottomRightLvl1Ball=true;
					}
					else{
					BottomRightLvl1Ball=false;
					}
			}
		});
		chckbxBottomRightLvl1Ball.setBounds(439, 626, 88, 23);
		frame.getContentPane().add(chckbxBottomRightLvl1Ball);
		
		JButton btnEndOfMatch = new JButton("End of Match is NOW!!");
		btnEndOfMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comments.main(null);
			//	frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
			}
		});
		btnEndOfMatch.setBounds(966, 253, 200, 50);
		frame.getContentPane().add(btnEndOfMatch);
		
		JLabel lblNewLabel = new JLabel("Post Sandstorm");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblNewLabel.setBounds(915, 44, 329, 81);
		frame.getContentPane().add(lblNewLabel);
		}
		//
		//
		//
		//
		//
		//
		//
		else{
			frame = new JFrame();
			frame.setBounds(100, 100, 1350, 900);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			Image redField = new ImageIcon(this.getClass().getResource("/redfield.png")).getImage().getScaledInstance(568, 456, Image.SCALE_DEFAULT);
			
			JLabel lblTopLeftSide = new JLabel("Left Side");
			lblTopLeftSide.setBounds(867, 6, 61, 16);
			frame.getContentPane().add(lblTopLeftSide);
			
			JCheckBox chckbxTopLeftLvl3Hatch = new JCheckBox("Lvl 3 Hatch");
			chckbxTopLeftLvl3Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopLeftLvl3Hatch.isSelected()){
						TopLeftLvl3Hatch=true;
						}
						else{
						TopLeftLvl3Hatch=false;
						}
				}
			});
			chckbxTopLeftLvl3Hatch.setBounds(792, 20, 103, 20);
			frame.getContentPane().add(chckbxTopLeftLvl3Hatch);
			
			JCheckBox chckbxTopLeftLvl2Hatch = new JCheckBox("Lvl 2 Hatch");
			chckbxTopLeftLvl2Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopLeftLvl2Hatch.isSelected()){
						TopLeftLvl2Hatch=true;
						}
						else{
						TopLeftLvl2Hatch=false;
						}
				}
			});
			chckbxTopLeftLvl2Hatch.setBounds(792, 41, 103, 23);
			frame.getContentPane().add(chckbxTopLeftLvl2Hatch);
			
			JCheckBox chckbxTopLeftLvl1Hatch = new JCheckBox("Lvl 1 Hatch");
			chckbxTopLeftLvl1Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopLeftLvl1Hatch.isSelected()){
						TopLeftLvl1Hatch=true;
						}
						else{
						TopLeftLvl1Hatch=false;
						}
				}
			});
			chckbxTopLeftLvl1Hatch.setBounds(792, 64, 103, 26);
			frame.getContentPane().add(chckbxTopLeftLvl1Hatch);
			
			JCheckBox chckbxTopLeftLvl3Ball = new JCheckBox("Lvl 3 Ball");
			chckbxTopLeftLvl3Ball.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopLeftLvl3Ball.isSelected()){
						TopLeftLvl3Ball=true;
						}
						else{
						TopLeftLvl3Ball=false;
						}
				}
			});
			chckbxTopLeftLvl3Ball.setBounds(892, 21, 88, 17);
			frame.getContentPane().add(chckbxTopLeftLvl3Ball);
			
			JCheckBox chckbxTopLeftLvl2Ball = new JCheckBox("Lvl 2 Ball");
			chckbxTopLeftLvl2Ball.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopLeftLvl2Ball.isSelected()){
						TopLeftLvl2Ball=true;
						}
						else{
						TopLeftLvl2Ball=false;
						}
				}
			});
			chckbxTopLeftLvl2Ball.setBounds(892, 40, 88, 26);
			frame.getContentPane().add(chckbxTopLeftLvl2Ball);
			
			JCheckBox chckbxTopLeftLvl1Ball = new JCheckBox("Lvl 1 Ball");
			chckbxTopLeftLvl1Ball.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopLeftLvl1Ball.isSelected()){
						TopLeftLvl1Ball=true;
						}
						else{
						TopLeftLvl1Ball=false;
						}
				}
			});
			chckbxTopLeftLvl1Ball.setBounds(892, 67, 88, 20);
			frame.getContentPane().add(chckbxTopLeftLvl1Ball);
			
			Component verticalStrut = Box.createVerticalStrut(20);
			verticalStrut.setBounds(990, 6, 12, 84);
			frame.getContentPane().add(verticalStrut);
			
			JCheckBox chckbxTopRightLvl3Hatch = new JCheckBox("Lvl 3 Hatch");
			chckbxTopRightLvl3Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopRightLvl3Hatch.isSelected()){
						TopRightLvl3Hatch=true;
						}
						else{
						TopRightLvl3Hatch=false;
						}
				}
			});
			chckbxTopRightLvl3Hatch.setBounds(1014, 20, 103, 20);
			frame.getContentPane().add(chckbxTopRightLvl3Hatch);
			
			JCheckBox chckbxTopRightLvl2Hatch = new JCheckBox("Lvl 2 Hatch");
			chckbxTopRightLvl2Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopRightLvl2Hatch.isSelected()){
						TopRightLvl2Hatch=true;
						}
						else{
						TopRightLvl2Hatch=false;
						}
				}
			});
			chckbxTopRightLvl2Hatch.setBounds(1014, 45, 103, 16);
			frame.getContentPane().add(chckbxTopRightLvl2Hatch);
			
			JCheckBox chckbxTopRightLvl1Hatch = new JCheckBox("Lvl 1 Hatch");
			chckbxTopRightLvl1Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopRightLvl1Hatch.isSelected()){
						TopRightLvl1Hatch=true;
						}
						else{
						TopRightLvl1Hatch=false;
						}
				}
			});
			chckbxTopRightLvl1Hatch.setBounds(1014, 64, 103, 20);
			frame.getContentPane().add(chckbxTopRightLvl1Hatch);
			
			JLabel lblRightSide = new JLabel("Right Side");
			lblRightSide.setBounds(1079, 6, 70, 16);
			frame.getContentPane().add(lblRightSide);
			
			JCheckBox chckbxTopRightLvl3Ball = new JCheckBox("Lvl 3 Ball");
			chckbxTopRightLvl3Ball.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopRightLvl3Ball.isSelected()){
						TopRightLvl3Ball=true;
						}
						else{
						TopRightLvl3Ball=false;
						}
				}
			});
			chckbxTopRightLvl3Ball.setBounds(1115, 20, 88, 20);
			frame.getContentPane().add(chckbxTopRightLvl3Ball);
			
			JCheckBox chckbxTopRightLvl2Ball = new JCheckBox("Lvl 2 Ball");
			chckbxTopRightLvl2Ball.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopRightLvl2Ball.isSelected()){
						TopRightLvl2Ball=true;
						}
						else{
						TopRightLvl2Ball=false;
						}
				}
			});
			chckbxTopRightLvl2Ball.setBounds(1115, 41, 88, 23);
			frame.getContentPane().add(chckbxTopRightLvl2Ball);
			
			JCheckBox chckbxTopRightLvl1Ball = new JCheckBox("Lvl 1 Ball");
			chckbxTopRightLvl1Ball.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxTopRightLvl1Ball.isSelected()){
						TopRightLvl1Ball=true;
						}
						else{
						TopRightLvl1Ball=false;
						}
				}
			});
			chckbxTopRightLvl1Ball.setBounds(1115, 64, 89, 17);
			frame.getContentPane().add(chckbxTopRightLvl1Ball);
			
			JLayeredPane layeredPane = new JLayeredPane();
			layeredPane.setBounds(744, 242, 281, 161);
			frame.getContentPane().add(layeredPane);
			
			JLabel lbl123Rover = new JLabel(" 1     2     3");
			lbl123Rover.setForeground(Color.WHITE);
			lbl123Rover.setBounds(6, 0, 85, 16);
			layeredPane.add(lbl123Rover);
			
			JLabel lbl4Rover = new JLabel("4");
			lbl4Rover.setForeground(Color.WHITE);
			lbl4Rover.setBounds(153, 55, 61, 16);
			layeredPane.add(lbl4Rover);
			
			JLabel lbl5Rover = new JLabel("5");
			lbl5Rover.setForeground(Color.WHITE);
			lbl5Rover.setBounds(153, 83, 61, 16);
			layeredPane.add(lbl5Rover);
			
			JLabel lbl678Rover = new JLabel("6      7      8");
			lbl678Rover.setForeground(Color.WHITE);
			lbl678Rover.setBounds(6, 139, 85, 16);
			layeredPane.add(lbl678Rover);
			
			JLabel redFieldImage = new JLabel("1   2  3");
			redFieldImage.setBounds(731, 93, 567, 448);
			frame.getContentPane().add(redFieldImage);
			redFieldImage.setIcon(new ImageIcon(redField));
			
			Component verticalStrut_1 = Box.createVerticalStrut(20);
			verticalStrut_1.setBounds(990, 548, 12, 122);
			frame.getContentPane().add(verticalStrut_1);
			
			JCheckBox chckbxBottomLeftLvl3Ball = new JCheckBox("Lvl 3 Ball");
			chckbxBottomLeftLvl3Ball.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxBottomLeftLvl3Ball.isSelected()){
						BottomLeftLvl3Ball=true;
						}
						else{
						BottomLeftLvl3Ball=false;
						}
				}
			});
			chckbxBottomLeftLvl3Ball.setBounds(892, 572, 88, 23);
			frame.getContentPane().add(chckbxBottomLeftLvl3Ball);
			
			JCheckBox chckbxBottomLeftLvl2Ball = new JCheckBox("Lvl 2 Ball");
			chckbxBottomLeftLvl2Ball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBottomLeftLvl2Ball.isSelected()){
					BottomLeftLvl2Ball=true;
					}
					else{
					BottomLeftLvl2Ball=false;
					}
			}
		    });
			chckbxBottomLeftLvl2Ball.setBounds(892, 598, 88, 23);
			frame.getContentPane().add(chckbxBottomLeftLvl2Ball);
			
			JCheckBox chckbxBottomLeftLvl1Ball = new JCheckBox("Lvl 1 Ball");
			chckbxBottomLeftLvl1Ball.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxBottomLeftLvl1Ball.isSelected()){
						BottomLeftLvl1Ball=true;
						}
						else{
						BottomLeftLvl1Ball=false;
						}
				}
			    });
			chckbxBottomLeftLvl1Ball.setBounds(892, 622, 88, 23);
			frame.getContentPane().add(chckbxBottomLeftLvl1Ball);
			
			JCheckBox chckbxBottomLeftLvl3Hatch = new JCheckBox("Lvl 3 Hatch");
			chckbxBottomLeftLvl3Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxBottomLeftLvl3Hatch.isSelected()){
						BottomLeftLvl3Hatch=true;
						}
						else{
						BottomLeftLvl3Hatch=false;
						}
				}
			    });
			chckbxBottomLeftLvl3Hatch.setBounds(792, 572, 103, 23);
			frame.getContentPane().add(chckbxBottomLeftLvl3Hatch);
			
			JCheckBox chckbxBottomLeftLvl2Hatch = new JCheckBox("Lvl 2 Hatch");
			chckbxBottomLeftLvl2Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxBottomLeftLvl2Hatch.isSelected()){
						BottomLeftLvl2Hatch=true;
						}
						else{
						BottomLeftLvl2Hatch=false;
						}
				}
			    });
			chckbxBottomLeftLvl2Hatch.setBounds(792, 598, 103, 23);
			frame.getContentPane().add(chckbxBottomLeftLvl2Hatch);
			
			JCheckBox chckbxBottomLeftLvl1Hatch = new JCheckBox("Lvl 1 Hatch");
			chckbxBottomLeftLvl1Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxBottomLeftLvl1Hatch.isSelected()){
						BottomLeftLvl1Hatch=true;
						}
						else{
						BottomLeftLvl1Hatch=false;
						}
				}
			    });
			chckbxBottomLeftLvl1Hatch.setBounds(792, 622, 103, 23);
			frame.getContentPane().add(chckbxBottomLeftLvl1Hatch);
			
			JLabel lblLeftSide = new JLabel("Left Side");
			lblLeftSide.setBounds(867, 555, 61, 16);
			frame.getContentPane().add(lblLeftSide);
			
			JCheckBox chckbxBottomRightLvl3Hatch = new JCheckBox("Lvl 3 Hatch");
			chckbxBottomRightLvl3Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxBottomRightLvl3Hatch.isSelected()){
						BottomRightLvl3Hatch=true;
						}
						else{
						BottomRightLvl3Hatch=false;
						}
				}
			    });
			chckbxBottomRightLvl3Hatch.setBounds(1014, 572, 103, 23);
			frame.getContentPane().add(chckbxBottomRightLvl3Hatch);
			
			JCheckBox chckbxBottomRightLvl2Hatch = new JCheckBox("Lvl 2 Hatch");
			chckbxBottomRightLvl2Hatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxBottomRightLvl2Hatch.isSelected()){
						BottomRightLvl2Hatch=true;
						}
						else{
						BottomRightLvl2Hatch=false;
						}
				}
			    });
			chckbxBottomRightLvl2Hatch.setBounds(1014, 598, 103, 23);
			frame.getContentPane().add(chckbxBottomRightLvl2Hatch);

			JCheckBox chckbxBottomRightLvl1Hatch = new JCheckBox("Lvl 1 Hatch");
			chckbxBottomRightLvl1Hatch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			if(chckbxBottomRightLvl1Hatch.isSelected()){
				BottomRightLvl1Hatch=true;
				}
				else{
				BottomRightLvl1Hatch=false;
				}
		}
	    });
			chckbxBottomRightLvl1Hatch.setBounds(1014, 622, 103, 23);
			frame.getContentPane().add(chckbxBottomRightLvl1Hatch);
			
			JCheckBox chckbxBottomRightLvl3Ball = new JCheckBox("Lvl 3 Ball");
			chckbxBottomRightLvl3Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl3Ball.isSelected()){
					BottomRightLvl3Ball=true;
					}
					else{
					BottomRightLvl3Ball=false;
					}
			}
		    });
			chckbxBottomRightLvl3Ball.setBounds(1115, 572, 128, 23);
			frame.getContentPane().add(chckbxBottomRightLvl3Ball);
			
			JCheckBox chckbxBottomRightLvl2Ball = new JCheckBox("Lvl 2 Ball");
			chckbxBottomRightLvl3Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl3Ball.isSelected()){
					BottomRightLvl3Ball=true;
					}
					else{
					BottomRightLvl3Ball=false;
					}
			}
		    });
			chckbxBottomRightLvl2Ball.setBounds(1115, 598, 88, 23);
			frame.getContentPane().add(chckbxBottomRightLvl2Ball);
			
			JCheckBox chckbxBottomRightLvl1Ball = new JCheckBox("Lvl 1 Ball");
			chckbxBottomRightLvl1Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxBottomRightLvl1Ball.isSelected()){
					BottomRightLvl1Ball=true;
					}
					else{
					BottomRightLvl1Ball=false;
					}
			}
		    });

			chckbxBottomRightLvl1Ball.setBounds(1115, 622, 128, 23);
			frame.getContentPane().add(chckbxBottomRightLvl1Ball);
			
			JLabel lblRightSide_1 = new JLabel("Right Side");
			lblRightSide_1.setBounds(1081, 555, 68, 16);
			frame.getContentPane().add(lblRightSide_1);
			
			JLabel lblSpot = new JLabel("Spot 1");
			lblSpot.setBounds(531, 116, 40, 16);
			frame.getContentPane().add(lblSpot);
			
			JCheckBox chckbxSpot1Ball = new JCheckBox("Ball");
			chckbxSpot1Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot1Ball.isSelected()){
					Spot1Ball=true;
					}
					else{
					Spot1Ball=false;
					}
			}
		    });
			chckbxSpot1Ball.setBounds(665, 112, 54, 23);
			frame.getContentPane().add(chckbxSpot1Ball);
			
			JCheckBox chckbxSpot1Hatch = new JCheckBox("Hatch");
			chckbxSpot1Hatch.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot1Hatch.isSelected()){
					Spot1Hatch=true;
					}
					else{
					Spot1Hatch=false;
					}
			}
		    });
			chckbxSpot1Hatch.setBounds(583, 112, 70, 23);
			frame.getContentPane().add(chckbxSpot1Hatch);
			
			JCheckBox chckbxSpot2Ball = new JCheckBox("Ball");
			chckbxSpot2Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot2Ball.isSelected()){
					Spot2Ball=true;
					}
					else{
					Spot2Ball=false;
					}
			}
		    });
			chckbxSpot2Ball.setBounds(665, 165, 54, 23);
			frame.getContentPane().add(chckbxSpot2Ball);
			
			JCheckBox chckbxSpot2Hatch = new JCheckBox("Hatch");
			chckbxSpot2Hatch.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot2Hatch.isSelected()){
					Spot2Hatch=true;
					}
					else{
					Spot2Hatch=false;
					}
			}
		    });
			chckbxSpot2Hatch.setBounds(583, 165, 70, 23);
			frame.getContentPane().add(chckbxSpot2Hatch);
			
			JLabel lblSpot_1 = new JLabel("Spot 2");
			
			lblSpot_1.setBounds(531, 169, 40, 16);
			frame.getContentPane().add(lblSpot_1);
			
			JCheckBox chckbxSpot3Ball = new JCheckBox("Ball");
			chckbxSpot3Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot3Ball.isSelected()){
					Spot3Ball=true;
					}
					else{
					Spot3Ball=false;
					}
			}
		    });
			chckbxSpot3Ball.setBounds(665, 218, 54, 23);
			frame.getContentPane().add(chckbxSpot3Ball);
			
			JCheckBox chckbxSpot3Hatch = new JCheckBox("Hatch");
			chckbxSpot3Hatch.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot3Hatch.isSelected()){
					Spot3Hatch=true;
					}
					else{
					Spot3Hatch=false;
					}
			}
		    });
			chckbxSpot3Hatch.setBounds(583, 218, 70, 23);
			frame.getContentPane().add(chckbxSpot3Hatch);
			
			JLabel lblSpot_2 = new JLabel("Spot 3");
			lblSpot_2.setBounds(531, 222, 40, 16);
			frame.getContentPane().add(lblSpot_2);
			
			JLabel lblSpot_3 = new JLabel("Spot 4");
			lblSpot_3.setBounds(531, 273, 40, 16);
			frame.getContentPane().add(lblSpot_3);
			
			JCheckBox chckbxSpot4Hatch = new JCheckBox("Hatch");
			chckbxSpot4Hatch.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot4Hatch.isSelected()){
					Spot4Hatch=true;
					}
					else{
					Spot4Hatch=false;
					}
			}
		    });

			chckbxSpot4Hatch.setBounds(583, 269, 70, 23);
			frame.getContentPane().add(chckbxSpot4Hatch);
			
			JCheckBox chckbxSpot4Ball = new JCheckBox("Ball");
			chckbxSpot4Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot4Ball.isSelected()){
					Spot4Ball=true;
					}
					else{
					Spot4Ball=false;
					}
			}
		    });
			chckbxSpot4Ball.setBounds(665, 269, 54, 23);
			frame.getContentPane().add(chckbxSpot4Ball);
			
			JLabel lblSpot_4 = new JLabel("Spot 5");
			lblSpot_4.setBounds(531, 322, 40, 16);
			frame.getContentPane().add(lblSpot_4);
			
			JCheckBox chckbxSpot5Hatch = new JCheckBox("Hatch");
			chckbxSpot5Hatch.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot5Hatch.isSelected()){
					Spot5Hatch=true;
					}
					else{
					Spot5Hatch=false;
					}
			}
		    });
			chckbxSpot5Hatch.setBounds(583, 318, 70, 23);
			frame.getContentPane().add(chckbxSpot5Hatch);
			
			JCheckBox chckbxSpot5Ball = new JCheckBox("Ball");
			chckbxSpot5Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot5Ball.isSelected()){
					Spot5Ball=true;
					}
					else{
					Spot5Ball=false;
					}
			}
		    });
			chckbxSpot5Ball.setBounds(665, 318, 54, 23);
			frame.getContentPane().add(chckbxSpot5Ball);
			
			JLabel lblSpot_5 = new JLabel("Spot 6");
			lblSpot_5.setBounds(531, 375, 40, 16);
			frame.getContentPane().add(lblSpot_5);
			
			JCheckBox chckbxSpot6Hatch = new JCheckBox("Hatch");
			chckbxSpot6Hatch.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot6Hatch.isSelected()){
					Spot6Hatch=true;
					}
					else{
					Spot6Hatch=false;
					}
			}
		    });
			chckbxSpot6Hatch.setBounds(583, 371, 70, 23);
			frame.getContentPane().add(chckbxSpot6Hatch);
			
			JCheckBox chckbxSpot6Ball = new JCheckBox("Ball");
			chckbxSpot6Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot6Ball.isSelected()){
					Spot6Ball=true;
					}
					else{
					Spot6Ball=false;
					}
			}
		    });
			chckbxSpot6Ball.setBounds(665, 371, 54, 23);
			frame.getContentPane().add(chckbxSpot6Ball);
			
			JLabel lblSpot_6 = new JLabel("Spot 7");
			lblSpot_6.setBounds(531, 424, 40, 16);
			frame.getContentPane().add(lblSpot_6);
			
			JCheckBox chckbxSpot7Hatch = new JCheckBox("Hatch");
			chckbxSpot7Hatch.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot7Hatch.isSelected()){
					Spot7Hatch=true;
					}
					else{
					Spot7Hatch=false;
					}
			}
		    });
			chckbxSpot7Hatch.setBounds(583, 420, 70, 23);
			frame.getContentPane().add(chckbxSpot7Hatch);
			
			JCheckBox chckbxSpot7Ball = new JCheckBox("Ball");
			chckbxSpot7Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot7Ball.isSelected()){
					Spot7Ball=true;
					}
					else{
					Spot7Ball=false;
					}
			}
		    });
			chckbxSpot7Ball.setBounds(665, 420, 54, 23);
			frame.getContentPane().add(chckbxSpot7Ball);
			
			JLabel lblSpot_7 = new JLabel("Spot 8");
			lblSpot_7.setBounds(531, 470, 40, 16);
			frame.getContentPane().add(lblSpot_7);
			
			JCheckBox chckbxSpot8Hatch = new JCheckBox("Hatch");
			chckbxSpot8Hatch.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot8Hatch.isSelected()){
					Spot8Hatch=true;
					}
					else{
					Spot8Hatch=false;
					}
			}
		    });
			chckbxSpot8Hatch.setBounds(583, 466, 70, 23);
			frame.getContentPane().add(chckbxSpot8Hatch);
			
			JCheckBox chckbxSpot8Ball = new JCheckBox("Ball");
			chckbxSpot8Ball.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				if(chckbxSpot8Ball.isSelected()){
					Spot8Ball=true;
					}
					else{
					Spot8Ball=false;
					}
			}
		    });
			chckbxSpot8Ball.setBounds(665, 466, 54, 23);
			frame.getContentPane().add(chckbxSpot8Ball);
			
			JButton btnEndOfMatch = new JButton("End of Match is NOW!!");
			btnEndOfMatch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Comments.main(null);
					//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame.dispose();
				}
			});
			btnEndOfMatch.setBounds(129, 239, 200, 50);
			frame.getContentPane().add(btnEndOfMatch);
			
			JLabel lblPostSandstorm = new JLabel("Post Sandstorm");
			lblPostSandstorm.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
			lblPostSandstorm.setBounds(77, 20, 335, 122);
			frame.getContentPane().add(lblPostSandstorm);
		}
	}
	
	// For Hatches
	public static boolean getTopLeftLvl3Hatch(){
		return TopLeftLvl3Hatch;
	}
	public static boolean getTopLeftLvl2Hatch(){
		return TopLeftLvl2Hatch;
	}
	public static boolean getTopLeftLvl1Hatch(){
		return TopLeftLvl1Hatch;
	}
	public static boolean getTopRightLvl3Hatch(){
		return TopRightLvl3Hatch;
	}
	public static boolean getTopRightLvl2Hatch(){
		return TopRightLvl2Hatch;
	}
	public static boolean getTopRightLvl1Hatch(){
		return TopRightLvl1Hatch;
	}
	public static boolean getSpot1Hatch(){
		return Spot1Hatch;
	}
	public static boolean getSpot2Hatch(){
		return Spot2Hatch;
	}
	public static boolean getSpot3Hatch(){
		return Spot3Hatch;
	}
	public static boolean getSpot4Hatch(){
		return Spot4Hatch;
	}
	public static boolean getSpot5Hatch(){
		return Spot5Hatch;
	}
	public static boolean getSpot6Hatch(){
		return Spot6Hatch;
	}
	public static boolean getSpot7Hatch(){
		return Spot7Hatch;
	}
	public static boolean getSpot8Hatch(){
		return Spot8Hatch;
	}
	public static boolean getBottomLeftLvl3Hatch(){
		return BottomLeftLvl3Hatch;
	}
	public static boolean getBottomLeftLvl2Hatch(){
		return BottomLeftLvl2Hatch;
	}
	public static boolean getBottomLeftLvl1Hatch(){
		return BottomLeftLvl1Hatch;
	}
	public static boolean getBottomRightLvl3Hatch(){
		return BottomRightLvl3Hatch;
	}
	public static boolean getBottomRightLvl2Hatch(){
		return BottomRightLvl2Hatch;
	}
	public static boolean getBottomRightLvl1Hatch(){
		return BottomRightLvl1Hatch;
	}
	
	//For balls
	public static boolean getTopLeftLvl3Ball(){
		return TopLeftLvl3Ball;
	}
	public static boolean getTopLeftLvl2Ball(){
		return TopLeftLvl2Ball;
	}
	public static boolean getTopLeftLvl1Ball(){
		return TopLeftLvl1Ball;
	}
	public static boolean getTopRightLvl3Ball(){
		return TopRightLvl3Ball;
	}
	public static boolean getTopRightLvl2Ball(){
		return TopRightLvl2Ball;
	}
	public static boolean getTopRightLvl1Ball(){
		return TopRightLvl1Ball;
	}
	public static boolean getSpot1Ball(){
		return Spot1Ball;
	}
	public static boolean getSpot2Ball(){
		return Spot2Ball;
	}
	public static boolean getSpot3Ball(){
		return Spot3Ball;
	}
	public static boolean getSpot4Ball(){
		return Spot4Ball;
	}
	public static boolean getSpot5Ball(){
		return Spot5Ball;
	}
	public static boolean getSpot6Ball(){
		return Spot6Ball;
	}
	public static boolean getSpot7Ball(){
		return Spot7Ball;
	}
	public static boolean getSpot8Ball(){
		return Spot8Ball;
	}
	public static boolean getBottomLeftLvl3Ball(){
		return BottomLeftLvl3Ball;
	}
	public static boolean getBottomLeftLvl2Ball(){
		return BottomLeftLvl2Ball;
	}
	public static boolean getBottomLeftLvl1Ball(){
		return BottomLeftLvl1Ball;
	}
	public static boolean getBottomRightLvl3Ball(){
		return BottomRightLvl3Ball;
	}
	public static boolean getBottomRightLvl2Ball(){
		return BottomRightLvl2Ball;
	}
	public static boolean getBottomRightLvl1Ball(){
		return BottomRightLvl1Ball;
	}

	public static JFrame getFrame() {
		return frame;
	}
}
