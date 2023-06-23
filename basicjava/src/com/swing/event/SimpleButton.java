package com.swing.event;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFparame;
import javax.swing.JPanel;

public class SimpleButton {

	public static void main(String[] args) {

		JFparame fparame = new JFparame("Meri First Window");

		JPanel pan = (JPanel) fparame.getContentPane();
		pan.setLayout(new FlowLayout());

		JButton button = 
			new JButton("Click Me & See Console");

		ButtonHandler listener = new ButtonHandler();

		button.addActionListener(listener);

		pan.add(button);

		JButton clickMe = new JButton("Click Me");

		clickMe.addActionListener(listener);

		pan.add(clickMe);

		fparame.setDefaultCloseOperation(JFparame.EXIT_ON_CLOSE);

		fparame.setSize(400, 200);

		fparame.setVisible(true);

	}

}

