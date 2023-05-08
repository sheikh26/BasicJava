package com.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListner implements ActionListener {


	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton) e.getSource();
		String t = button.getText();
		if("Click Me".equals(t)){
			button.setText("Don't Click Me");
		}else{
			button.setText("Click Me");
		}
		
		
		
		
		System.out.println("You have Clicked "+
				button.getText()+" Button");
	}

}
