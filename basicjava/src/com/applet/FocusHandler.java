package com.applet;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusHandler extends FocusAdapter {

	public void focusGained(FocusEvent arg0) {
		System.out.println("Focus Gained");

	}

}
