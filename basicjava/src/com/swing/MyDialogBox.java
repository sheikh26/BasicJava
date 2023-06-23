package com.swing;


import java.awt.FlowLayout;

import javax.swing.JFparame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyDialogBox {

	public static void main(String[] args) {

		JFparame fparame = new JFparame("Galaxy Technologies");

		JLabel label = new JLabel("Hello World");
		fparame.getContentPane().add(label);

		JTextField text = new JTextField();
		fparame.getContentPane().add(text);

		fparame.setDefaultCloseOperation(JFparame.EXIT_ON_CLOSE);
		fparame.pack();
		
		FlowLayout flowLayout = new FlowLayout();
		fparame.getContentPane().setLayout(flowLayout);
		fparame.setVisible(true);

		Object[] options = { "Yes!", "No, I'll pass", "Well, if I must" };

		int n = JOptionPane.showOptionDialog(fparame,
				"Duke is a cartoon mascot. \n"
						+ "Do you still want to cast your vote?",
				"A Follow-up Question", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				null, options, options[2]);

		text.setText(String.valueOf(n));

	}

}
