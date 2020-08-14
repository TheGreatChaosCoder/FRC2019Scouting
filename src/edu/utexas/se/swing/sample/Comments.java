package edu.utexas.se.swing.sample;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Comments {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comments window = new Comments();
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
	public Comments() {
		
		//Resets these variables 
		stopHalf = false;
		stopWhole = false;
		onlyHatch = false;
		onlyBall = false;
		bothGood = false;
		lvl3Habitat = false;
		lvl2Habitat = false;
		lvl1Habitat = false;
		canShootLvl3 = false;
		canShootLvl2 = false;
		cantShootHigh = false;
		workingAuto = false;
		noAuto = false;
		goodDefense = false;
		
		defensiveRating = 0;
		autoRating = 0;
		
		otherComments = "";
		
		initialize();
	}
	
	// List of variable stuffs
	
	public static boolean stopHalf = false;
	public static boolean stopWhole = false;
	public static boolean onlyHatch = false;
	public static boolean onlyBall = false;
	public static boolean bothGood = false;
	public static boolean lvl3Habitat = false;
	public static boolean lvl2Habitat = false;
	public static boolean lvl1Habitat = false;
	public static boolean canShootLvl3 = false;
	public static boolean canShootLvl2 = false;
	public static boolean cantShootHigh = false;
	public static boolean workingAuto = false;
	public static boolean noAuto = false;
	public static boolean goodDefense = false;
	
	//------------------------------------------
	
	public static int defensiveRating = 0;
	public static int autoRating = 0;
	
	//--------------------------------------------
	
	public static String otherComments = "";
	private JTextField textFieldAutoRating;
	private JTextField textFieldDefenseRating;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCommentSection = new JLabel("Comment Section");
		lblCommentSection.setFont(new Font("Lao Sangam MN", Font.PLAIN, 23));
		lblCommentSection.setBounds(29, 19, 223, 63);
		frame.getContentPane().add(lblCommentSection);
		
		JLabel lblCommonComments = new JLabel("Common Comments:");
		lblCommonComments.setBounds(29, 98, 140, 16);
		frame.getContentPane().add(lblCommonComments);
		
		JCheckBox chckbxStopHalf = new JCheckBox("Robot stopped working midway through match");
		chckbxStopHalf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxStopHalf.isSelected()){
					stopHalf = true;
				}
				else{
					stopHalf = false;
				}
			}
		});
		chckbxStopHalf.setBounds(29, 126, 333, 23);
		frame.getContentPane().add(chckbxStopHalf);
		
		JCheckBox chckbxStopWhole = new JCheckBox("Robot didn't work at all");
		chckbxStopWhole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxStopWhole.isSelected()){
					stopWhole = true;
				}
				else{
					stopWhole = false;
				}
			}
		});
		chckbxStopWhole.setBounds(29, 150, 179, 23);
		frame.getContentPane().add(chckbxStopWhole);
		
		JCheckBox chckbxOnlyHatch = new JCheckBox("Robot is only good with hatches");
		chckbxOnlyHatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxOnlyHatch.isSelected()){
					onlyHatch = true;
				}
				else{
					onlyHatch = false;
				}
			}
		});
		chckbxOnlyHatch.setBounds(394, 126, 235, 23);
		frame.getContentPane().add(chckbxOnlyHatch);
		
		JCheckBox chckbxOnlyBall = new JCheckBox("Robot is only good with balls");
		chckbxOnlyBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxOnlyBall.isSelected()){
					onlyBall = true;
				}
				else{
					onlyBall = false;
				}
			}
		});
		chckbxOnlyBall.setBounds(394, 150, 235, 23);
		frame.getContentPane().add(chckbxOnlyBall);
		
		JCheckBox chckbxBothGood = new JCheckBox("Robot is good with both balls and hatchs");
		chckbxBothGood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBothGood.isSelected()){
					bothGood = true;
				}
				else{
					bothGood = false;
				}
			}
		});
		chckbxBothGood.setBounds(394, 176, 312, 23);
		frame.getContentPane().add(chckbxBothGood);
		
		JCheckBox chckbxLvl3Habitat = new JCheckBox("Able to get to lvl 3 of habitat");
		chckbxLvl3Habitat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLvl3Habitat.isSelected()){
					lvl3Habitat = true;
				}
				else{
					lvl3Habitat = false;
				}
			}
		});
		chckbxLvl3Habitat.setBounds(29, 176, 259, 23);
		frame.getContentPane().add(chckbxLvl3Habitat);
		
		JCheckBox chckbxLvl2Habitat = new JCheckBox("Able to get to lvl 2 of habitat");
		chckbxLvl2Habitat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLvl2Habitat.isSelected()){
					lvl2Habitat = true;
				}
				else{
					lvl2Habitat = false;
				}
			}
		});
		chckbxLvl2Habitat.setBounds(29, 200, 223, 23);
		frame.getContentPane().add(chckbxLvl2Habitat);
		
		JCheckBox chckbxLvl1Habitat = new JCheckBox("Able to get to lvl 1 of habitat");
		chckbxLvl1Habitat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLvl1Habitat.isSelected()){
					lvl1Habitat = true;
				}
				else{
					lvl1Habitat = false;
				}
			}
		});
		chckbxLvl1Habitat.setBounds(29, 224, 223, 23);
		frame.getContentPane().add(chckbxLvl1Habitat);
		
		JCheckBox chckbxCanShootLvl3 = new JCheckBox("Can reach/shoot to lvl 3 of rocket");
		chckbxCanShootLvl3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCanShootLvl3.isSelected()){
					canShootLvl3 = true;
				}
				else{
					canShootLvl3 = false;
				}
			}
		});
		chckbxCanShootLvl3.setBounds(394, 200, 290, 23);
		frame.getContentPane().add(chckbxCanShootLvl3);
		
		JCheckBox chckbxCanShootLvl2 = new JCheckBox("Can reach/shoot to lvl 2 of rocket");
		chckbxCanShootLvl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCanShootLvl2.isSelected()){
					canShootLvl2 = true;
				}
				else{
					canShootLvl2 = false;
				}
			}
		});
		chckbxCanShootLvl2.setBounds(394, 224, 312, 23);
		frame.getContentPane().add(chckbxCanShootLvl2);
		
		JLabel lblOtherComments = new JLabel("Other Comments:");
		lblOtherComments.setBounds(29, 365, 179, 16);
		frame.getContentPane().add(lblOtherComments);
		
		JEditorPane otherCommentsPane = new JEditorPane();
		otherCommentsPane.setBounds(29, 393, 652, 115);
		frame.getContentPane().add(otherCommentsPane);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherComments = otherCommentsPane.getText();
				try{
				setAutoRating(Integer.valueOf(textFieldAutoRating.getText()));
				} catch(NumberFormatException e1){
					setAutoRating(-1);
				}
				try{
				setDefensiveRating(Integer.valueOf(textFieldDefenseRating.getText()));
				} catch(NumberFormatException e2){
					setDefensiveRating(-1);
				}
				Results.main(null);
				//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
			}

			private void setDefensiveRating(int num) {
				defensiveRating = num;
				
			}

			private void setAutoRating(int num) {
				autoRating = num;
				
			}
		});
		btnNext.setBounds(29, 530, 117, 29);
		frame.getContentPane().add(btnNext);
		
		JCheckBox chckbxWorkingAuto = new JCheckBox("Have a working autonomous");
		chckbxWorkingAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxWorkingAuto.isSelected()){
					workingAuto = true;
				}
				else{
					workingAuto = false;
				}
			}
		});
		chckbxWorkingAuto.setBounds(29, 247, 259, 23);
		frame.getContentPane().add(chckbxWorkingAuto);
		
		JCheckBox chckbxNoAuto = new JCheckBox("No automonous");
		chckbxNoAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNoAuto.isSelected()){
					noAuto = true;
				}
				else{
					noAuto = false;
				}
			}
		});
		chckbxNoAuto.setBounds(29, 270, 199, 23);
		frame.getContentPane().add(chckbxNoAuto);
		
		JCheckBox chckbxCantReachShootHigh = new JCheckBox("Can't reach/shoot high at all");
		chckbxCantReachShootHigh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCantReachShootHigh.isSelected()){
					cantShootHigh = true;
				}
				else{
					cantShootHigh = false;
				}
			}
		});
		chckbxCantReachShootHigh.setBounds(394, 247, 312, 23);
		frame.getContentPane().add(chckbxCantReachShootHigh);
		
		JCheckBox chckbxGoodDefense = new JCheckBox("Good at defense");
		chckbxGoodDefense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGoodDefense.isSelected()){
					goodDefense = true;
				}
				else{
					goodDefense = false;
				}
			}
		});
		chckbxGoodDefense.setBounds(394, 270, 290, 23);
		frame.getContentPane().add(chckbxGoodDefense);
		
		JLabel lblRateHowWell = new JLabel("Rate how well their autonomous was, if there was any (out of 10):");
		lblRateHowWell.setBounds(29, 305, 416, 16);
		frame.getContentPane().add(lblRateHowWell);
		
		JLabel lblNewLabel = new JLabel("Rate how well they are at defense, if they did any (out of 10):");
		lblNewLabel.setBounds(29, 331, 381, 22);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAutoRating = new JTextField();
		textFieldAutoRating.setBounds(444, 300, 40, 26);
		frame.getContentPane().add(textFieldAutoRating);
		textFieldAutoRating.setColumns(10);
		
		textFieldDefenseRating = new JTextField();
		textFieldDefenseRating.setBounds(422, 329, 40, 26);
		frame.getContentPane().add(textFieldDefenseRating);
		textFieldDefenseRating.setColumns(10);
	}
	
	public static String getOtherComments(){
		return otherComments;
	}
	
	public static int getAutoRating(){
		return autoRating;
	}
	public static int getDefensiveRating(){
		return defensiveRating;
	}
	
	//Lists out all common comments by checking if their variable is true or false
	public static String getCommonComments(){
		String str = "";
		if(stopHalf){str = str + "Stops halfway \n";}
		if(stopWhole){str = str + "Stops for entire match \n";}
		if(onlyHatch){str = str + "Only good with hatches \n";}
		if(onlyBall){str = str + "Only good with balls \n";}
		if(bothGood){str = str + "Good with hatches and balls \n";}
		if(lvl3Habitat){str = str + "Able to get on lvl 3 habitat \n";}
		if(lvl2Habitat){str = str + "Able to get on lvl 2 habitat \n";}
		if(lvl1Habitat){str = str + "Able to get on lvl 1 habitat \n";}
		if(canShootLvl3){str = str + "Can shoot/reach to lvl 3 \n";}
		if(canShootLvl2){str = str + "Can shoot/reach to lvl 2 \n";}
		if(cantShootHigh){str = str + "Can't shoot/reach really high \n";}
		if(workingAuto){str = str + "Has a working autonomous";}
		if(noAuto){str = str + "Has no autonomous";}
        return str;

	}

	public static JFrame getFrame() {
		return frame;
	}
}
