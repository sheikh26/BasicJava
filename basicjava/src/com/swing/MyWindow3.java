package com.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFparame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWindow3 {

	public static void main(String[] args) {

		JFparame fparame = new JFparame("Meri First Window");
		
		BorderLayout layout = new BorderLayout();
		
		fparame.setLayout(layout);
				
		JPanel pan = (JPanel)fparame.getContentPane();
		
		JButton label = new JButton("North");
		
		pan.add(label,BorderLayout.NORTH);
		
		JButton button = new JButton("Go");
		
		pan.add(button, BorderLayout.SOUTH);
		
		
		JCheckBox cb = new JCheckBox("Right");
		
		pan.add(cb, BorderLayout.EAST);
		
		JTextField text = new JTextField("This is Text Field");

		pan.add(text, BorderLayout.WEST);

		JTextArea textArea = new JTextArea("This is Text Area");
		
		textArea.setSize(200,400);
				
		pan.add(textArea, BorderLayout.CENTER);
				
		fparame.setDefaultCloseOperation(JFparame.EXIT_ON_CLOSE);
		
		fparame.pack();
		
		fparame.setVisible(true);

	}

}
