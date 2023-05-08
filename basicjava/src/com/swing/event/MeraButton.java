package com.swing.event;

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MeraButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame win = new JFrame("Button Window");
		JPanel panel = (JPanel) win.getContentPane();
		JButton button = new JButton("Click Me");

		ButtonListner buttonListner = new ButtonListner();
		button.addActionListener(buttonListner);

		FocusHandler focHandler = new FocusHandler();
		button.addFocusListener(focHandler);
		
		panel.add(button);
		
		JCheckBox box = new JCheckBox("Check It");
		box.addFocusListener(focHandler);
		
		panel.add(box, BorderLayout.NORTH);
		
		JLabel label = new JLabel("No Help");
		panel.add(label, BorderLayout.SOUTH);
		
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		win.setSize(400, 200);

		win.setVisible(true);

	}

}

class FocusHandler implements FocusListener{

	/* (non-Javadoc)
	 * @see java.awt.event.FocusListener#focusGained(java.awt.event.FocusEvent)
	 */
	public void focusGained(FocusEvent e) {
		Object ob =  e.getSource();
		if( ob instanceof JCheckBox ){
			
		}else{
			
		}
	}

	/* (non-Javadoc)
	 * @see java.awt.event.FocusListener#focusLost(java.awt.event.FocusEvent)
	 */
	public void focusLost(FocusEvent e) {
		System.out.println("Focus Lost" + e.getSource());
	}
	
}



