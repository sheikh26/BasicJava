package com.swing.event;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestButton {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meri First Window");

		WindowHandler windowHandler = 
			new WindowHandler();

		frame.addWindowListener(windowHandler);

		JPanel pan = (JPanel) frame.getContentPane();
		pan.setLayout(new FlowLayout());

		JButton button = 
			new JButton("Click Me & See Console");

		ButtonHandler listener = new ButtonHandler();

		button.addActionListener(listener);

		ButtonMouseHandler buttonMouseHandler = 
			new ButtonMouseHandler();

		button.addMouseListener(buttonMouseHandler);

		pan.add(button);

		JButton clickMe = new JButton("Click Me");

		clickMe.addActionListener(listener);

		pan.add(clickMe);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 200);

		frame.setVisible(true);

	}

}

class WindowHandler implements WindowListener {

	public void windowActivated(WindowEvent arg0) {
		System.out.println("WIndows Acticated");

	}

	public void windowClosed(WindowEvent arg0) {
		System.out.println("WIndows Closed");

	}

	public void windowClosing(WindowEvent arg0) {
		System.out.println("WIndows Closing");

	}

	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("WIndows Deactivated");

	}

	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("WIndows DEiconified");

	}

	public void windowIconified(WindowEvent arg0) {
		System.out.println("WIndows Acticated");

	}

	public void windowOpened(WindowEvent arg0) {
		System.out.println("WIndows OPened");

	}

}
