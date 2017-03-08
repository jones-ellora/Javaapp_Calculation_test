package com.add;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addition {

	private JFrame frame;
	private JTextField num1f;
	private JTextField num2f;
	private JLabel lblAnswer;
	private JTextField anserf;
	private JButton btnSub;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addition window = new Addition();
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
	public Addition() {
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
		
		JLabel lblNumber = new JLabel("Number_1");
		lblNumber.setBounds(55, 66, 80, 14);
		frame.getContentPane().add(lblNumber);
		
		num1f = new JTextField();
		num1f.setBounds(195, 63, 86, 20);
		frame.getContentPane().add(num1f);
		num1f.setColumns(10);
		
		JLabel lblNumber_1 = new JLabel("Number_2");
		lblNumber_1.setBounds(55, 109, 87, 14);
		frame.getContentPane().add(lblNumber_1);
		
		num2f = new JTextField();
		num2f.setBounds(195, 106, 86, 20);
		frame.getContentPane().add(num2f);
		num2f.setColumns(10);
		
		JButton btnAdd = new JButton("ADDITION");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int num1,num2,ans;	
				
			try{
				num1=Integer.parseInt(num1f.getText());
				num2=Integer.parseInt(num2f.getText());
				ans=num1+num2;
				anserf.setText(Integer.toString(ans));
				
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Enter valid numbers..");
			}
			}
		});
		btnAdd.setBounds(35, 166, 115, 23);
		frame.getContentPane().add(btnAdd);
		
		lblAnswer = new JLabel("Answer..");
		lblAnswer.setBounds(55, 219, 60, 14);
		frame.getContentPane().add(lblAnswer);
		
		anserf = new JTextField();
		anserf.setBounds(195, 216, 86, 20);
		frame.getContentPane().add(anserf);
		anserf.setColumns(10);
		
		btnSub = new JButton("SUBTRACTION");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;	
				
				try{
					num1=Integer.parseInt(num1f.getText());
					num2=Integer.parseInt(num2f.getText());
					ans=num1+num2;
					anserf.setText(Integer.toString(ans));
					
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Enter valid numbers..");
				}
			}
		});
		btnSub.setBounds(160, 166, 115, 23);
		frame.getContentPane().add(btnSub);
		
		btnNewButton = new JButton("MULTIPLICATION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;	
				
				try{
					num1=Integer.parseInt(num1f.getText());
					num2=Integer.parseInt(num2f.getText());
					ans=num1*num2;
					anserf.setText(Integer.toString(ans));
					
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Enter valid numbers..");
				}
			}
		});
		btnNewButton.setBounds(285, 166, 139, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
