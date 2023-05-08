package com.swing.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

public class ButtonMouseHandler implements MouseListener {

	public void mouseClicked(MouseEvent event) {
		System.out.println("Mouse Clicked");

	}

	public void mouseEntered(MouseEvent event) {
		System.out.println("Mouse Enetred");

	}

	public void mouseExited(MouseEvent event) {
		System.out.println("Mouse Exit");

	}

	public void mousePressed(MouseEvent event) {
		System.out.println("Mouse Pressed");

	}

	public void mouseReleased(MouseEvent event) {
		System.out.println("Mouse Released");

	}

}
