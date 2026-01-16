package talalJavaCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RSTProject {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RSTProject window = new RSTProject();
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
	public RSTProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ROCK,PAPER,SCISSORS");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Vineta BT", Font.PLAIN, 16));
		lblNewLabel.setBounds(73, 28, 291, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setForeground(new Color(128, 0, 64));
		textField1.setBounds(56, 161, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Choice");
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(57, 136, 98, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField2 = new JTextField();
		textField2.setBounds(278, 161, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("AI Choice");
		lblNewLabel_2.setForeground(new Color(128, 0, 64));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(291, 136, 61, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnConfirmChoice = new JButton("Confirm Choice");
		btnConfirmChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userChoice = "";
				String[] aiChoice = new String[3];
				aiChoice[0] = "rock";
				aiChoice[1] = "paper";
				aiChoice[2] = "scissors";
				
				
				try {
					
					userChoice = (textField1.getText());
				}
				
				catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				}
			
				int a = ( (int) (Math.random() * (aiChoice.length)));
				
				textField2.setText(Integer.toString((a)));
				
				
				
				// User A Wins Rock - Scissors 
				if (userChoice.equals("rock") && aiChoice.equals("scissors")) {
					
					textField3.setText("You Win");	
				}
				
				// User A Wins Paper - Rock
				else if (userChoice.equals("paper") && aiChoice.equals("rock")) {
					
					textField3.setText("You Win!");;
				}
				
				// User A Wins Scissors - Paper
				else if (userChoice.equals("scissors") && aiChoice.equals("paper")) {
					
					textField3.setText("You Win!");;
				}
				
				// User B (Computer) Wins Rock - Scissors
				else if (aiChoice.equals("rock") && userChoice.equals("scissors")) {
					
					textField3.setText("You Lost ;(");;
				}
				
				// User B (Computer) Wins Paper - Rock
				else if (aiChoice.equals("paper") && userChoice.equals("rock")) {
					
					textField3.setText("You Lost ;(");;
				}
				
				// User B (Computer) Wins Scissors - Paper
				else if (aiChoice.equals("scissors") && userChoice.equals("paper")) {
					
					textField3.setText("You Lost ;(");;
				}
						
				// Tie Rock - Rock
				else if (userChoice.equals("rock") && aiChoice.equals("rock")) {
					
					textField3.setText("Tie!");;
				}
				
				// Tie Paper - Paper
				else if (userChoice.equals("paper") && aiChoice.equals("paper")) {
					
					textField3.setText("Tie!");;
				}
				
				// Tie Scissors - Scissors
				else {
					
					textField3.setText("Tie!");;
				}
				
			}
		});
		btnConfirmChoice.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnConfirmChoice.setBounds(159, 202, 121, 23);
		frame.getContentPane().add(btnConfirmChoice);
		
		textField3 = new JTextField();
		textField3.setBounds(159, 88, 121, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
	}
}
