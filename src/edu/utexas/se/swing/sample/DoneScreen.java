package edu.utexas.se.swing.sample;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DoneScreen {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoneScreen window = new DoneScreen();
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
	public DoneScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNiceJobNeed = new JLabel("Nice job, need to scout again?");
		lblNiceJobNeed.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNiceJobNeed.setBounds(45, 40, 277, 73);
		frame.getContentPane().add(lblNiceJobNeed);
		
		JButton btnYay = new JButton("Yay");
		btnYay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoundNumber.main(null);
				/*openscreen.getFrame().dispose();
				TeamNumber.getFrame().dispose();
				chooseaside.getFrame().dispose();
				scoutingteleop.getFrame().dispose();
				scoutingauto.getFrame().dispose();
				Comments.getFrame().dispose();
				Results.getFrame().dispose();*/
				frame.dispose();
			}
		});
		btnYay.setBounds(68, 186, 144, 50);
		frame.getContentPane().add(btnYay);
		
		JButton btnNay = new JButton("Nay");
		btnNay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				/*openscreen.getFrame().dispose();
				RoundNumber.getFrame().dispose();
				TeamNumber.getFrame().dispose();
				chooseaside.getFrame().dispose();
				scoutingteleop.getFrame().dispose();
				scoutingauto.getFrame().dispose();
				Comments.getFrame().dispose();
				Results.getFrame().dispose();*/
				frame.dispose();
				}
				catch(Exception NullPointerException){
					/*JOptionPane.showMessageDialog(null, "Just close the app via the red button on top, like normal", 
                            "Can't close via nay", JOptionPane.ERROR_MESSAGE);*/
					System.exit(0);
				}
			}
		});
		btnNay.setBounds(266, 186, 144, 50);
		frame.getContentPane().add(btnNay);
	}
}
