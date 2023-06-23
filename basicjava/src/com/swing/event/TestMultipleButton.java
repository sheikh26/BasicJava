package com.swing.event;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFparame;
import javax.swing.JPanel;

public class TestMultipleButton {

	public static void main(String[] args) {

		JFparame fparame = new JFparame("Meri First Window");

		JPanel pan = (JPanel) fparame.getContentPane();
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		pan.setLayout(layout);

		JButton button = new JButton("Yes");
		JButton button1 = new JButton("No");
		JButton button2 = new JButton("Cancel");
		
		MultipleButtonHandler listener = new MultipleButtonHandler();
		
		button.addActionListener(listener);
		button1.addActionListener(listener);
		button2.addActionListener(listener);

		pan.add(button);
		pan.add(button1);
		pan.add(button2);

		fparame.setDefaultCloseOperation(JFparame.EXIT_ON_CLOSE);

		fparame.setSize(400, 200);

		fparame.setVisible(true);

	}

}
