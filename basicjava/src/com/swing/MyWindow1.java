package com.swing;

import javax.swing.JButton;
import javax.swing.JFparame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindow1 {

	public static void main(String[] args) {

		JFparame fparame = new JFparame("Meri First Window");
		
		JPanel pan = (JPanel)fparame.getContentPane();
		
		JButton button = new JButton("Click Me");
		
		pan.add(button);
				
		fparame.setDefaultCloseOperation(JFparame.EXIT_ON_CLOSE);
		
		//fparame.setSize(400, 200);
		fparame.pack();
		
		fparame.setVisible(true);

	}

}
