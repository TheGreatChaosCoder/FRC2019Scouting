package edu.utexas.se.swing.sample;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class openscreen {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					openscreen window = new openscreen();
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
	public openscreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image deepSpace = new ImageIcon(this.getClass().getResource("/deepspace.png")).getImage().getScaledInstance(123, 90, Image.SCALE_DEFAULT);
		JLabel deepSpaceLogo = new JLabel("New label");
		deepSpaceLogo.setBounds(20, 22, 124, 90);
		frame.getContentPane().add(deepSpaceLogo);
		deepSpaceLogo.setIcon(new ImageIcon(deepSpace));
		
		JLabel lblScouting = new JLabel("Scouting Time");
		lblScouting.setFont(new Font("Symbol", Font.PLAIN, 22));
		lblScouting.setBounds(166, 38, 177, 34);
		frame.getContentPane().add(lblScouting);
		
		JLabel lblBois = new JLabel("Boissssssssssssssssssssssssssssssss");
		lblBois.setFont(new Font("Apple Braille", Font.BOLD | Font.ITALIC, 23));
		lblBois.setBounds(6, 124, 438, 44);
		frame.getContentPane().add(lblBois);
		
		JButton btnLetsGo = new JButton("Lets go");
		btnLetsGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoundNumber.main(null);
				frame.dispose();
			}
		});
		btnLetsGo.setBounds(158, 196, 117, 29);
		frame.getContentPane().add(btnLetsGo);
	}

	public static JFrame getFrame() {
		return frame;
	}

}
