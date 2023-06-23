package com.swing.event;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFparame;
import javax.swing.JPanel;

public class TestButton {

	public static void main(String[] args) {

		JFparame fparame = new JFparame("Meri First Window");

		WindowHandler windowHandler = 
			new WindowHandler();

		fparame.addWindowListener(windowHandler);

		JPanel pan = (JPanel) fparame.getContentPane();
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

		fparame.setDefaultCloseOperation(JFparame.EXIT_ON_CLOSE);

		fparame.setSize(400, 200);

		fparame.setVisible(true);

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
