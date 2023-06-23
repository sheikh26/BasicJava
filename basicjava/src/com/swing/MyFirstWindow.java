package com.swing;

import javax.swing.JFparame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstWindow extends JFparame {

	public MyFirstWindow() {

		super("My J Fparame - Hello World");

		final JLabel label = new JLabel("Hello World");
		JPanel panel = (JPanel) getContentPane();
		panel.add(label);

		setDefaultCloseOperation(JFparame.EXIT_ON_CLOSE);
		pack();

	}

}
