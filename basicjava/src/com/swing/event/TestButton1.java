package com.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFparame;
import javax.swing.JPanel;

public class TestButton1 {
	
	private static String temp;

	public static void main(String[] args) {

		
		JFparame fparame = new JFparame("Meri First Window");
		WindowHandler windowHandler = new WindowHandler();
		fparame.addWindowListener(windowHandler);
		
		

		JPanel pan = (JPanel) fparame.getContentPane();

		JButton button = new JButton("Click Me & See Console");
		
		button.addActionListener(new TestButton1.InnerButtonHandler());
		
		pan.add(button);

		fparame.setDefaultCloseOperation(JFparame.EXIT_ON_CLOSE);

		fparame.setSize(400, 200);

		fparame.setVisible(true);

	}
	
	//Inner Classes
	private static class InnerButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("This is Inner Class");
						
		}
		
		
	}

}
