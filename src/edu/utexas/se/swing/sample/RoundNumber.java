package edu.utexas.se.swing.sample;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RoundNumber {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoundNumber window = new RoundNumber();
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
	   
	public RoundNumber() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private static int roundNumber;
	
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				//System.out.println("testbigboi");
				if(key == KeyEvent.VK_ENTER){
					System.out.println("test");
					if(isNumeric(textField.getText()) && Integer.valueOf(textField.getText())>150){
						JOptionPane.showMessageDialog(null, "This can't be a round number as it is too big. Please put in something else.", "This # is too big for Smash", JOptionPane.ERROR_MESSAGE);
					}
					else if(isNumeric(textField.getText())){
						setRoundNumber(Integer.valueOf(textField.getText()));
						TeamNumber.main(null);
						frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					}
					else{
						JOptionPane.showMessageDialog(null, "Can you please put in a number.", "Not a Number", JOptionPane.ERROR_MESSAGE);
						System.out.println(textField.getText());
					}
			}
			}
		});
		textField.setBounds(145, 106, 200, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("What's the round number?");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel.setBounds(127, 16, 264, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnLetsAGo = new JButton("Let's a go!");
		btnLetsAGo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				System.out.println("testbigboi");
				if(key == KeyEvent.VK_ENTER){
					System.out.println("test");
					if(isNumeric(textField.getText()) && Integer.valueOf(textField.getText())>150){
						JOptionPane.showMessageDialog(null, "This can't be a team number as it is too big. Please put in something else.", "This # is too big for Smash", JOptionPane.ERROR_MESSAGE);
					}
					else if(isNumeric(textField.getText())){
						setRoundNumber(Integer.valueOf(textField.getText()));
						TeamNumber.main(null);
						//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
						frame.dispose();
					}
					else{
						JOptionPane.showMessageDialog(null, "Can you please put in a number.", "Not a Number", JOptionPane.ERROR_MESSAGE);
						System.out.println(textField.getText());
					}
			}
			}
		});
		buttonGroup.add(btnLetsAGo);
		btnLetsAGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isNumeric(textField.getText()) && Integer.valueOf(textField.getText())>150){
					JOptionPane.showMessageDialog(null, "This can't be a team number as it is too big. Please put in something else.", "This # is too big for Smash", JOptionPane.ERROR_MESSAGE);
				}
				else if(isNumeric(textField.getText())){
					setRoundNumber(Integer.valueOf(textField.getText()));
					TeamNumber.main(null);
					//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame.dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Can you please put in a number.", "Not a Number", JOptionPane.ERROR_MESSAGE);
					System.out.println(textField.getText());
				}
			}
		});
		btnLetsAGo.setBounds(185, 206, 117, 29);
		frame.getContentPane().add(btnLetsAGo);
	   }
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    @SuppressWarnings("unused")
		int d = Integer.valueOf(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	public static void setRoundNumber(int num){
		roundNumber = num;
	}
	
	public static int getRoundNumber(){
		return roundNumber;
	}

	public static JFrame getFrame() {
		return frame;
	}
	
}
