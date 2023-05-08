package com.swing;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyWindow {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");
		
		JPanel pan = (JPanel)frame.getContentPane();
		
		//FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		BorderLayout layout = new BorderLayout();
		pan.setLayout(layout);

		JButton b = new JButton("Click Me");

		pan.add(b,BorderLayout.NORTH);
		
		JLabel label = new JLabel("Hello World");
		
		pan.add(label,BorderLayout.EAST);

		TextField text = new TextField(40);
		
		pan.add(text,BorderLayout.SOUTH);
		
		JCheckBox box = new JCheckBox();
		
		pan.add(box,BorderLayout.CENTER);
		
		JTextArea area = new JTextArea(5,10);
		
		pan.add(area,BorderLayout.WEST);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		
		frame.setVisible(true);

	}

}
