package test;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class TestListener {
	String exp;
	JTextField display;
	public void actionPerformed(ActionEvent e) {
		exp = exp + "8";
		display.setText(exp);
	}
}