package hello;

import java.awt.*;
import javax.swing.*;

public class PicEditor extends JFrame{
	protected Shape s[];
	
	public PicEditor() {
		super("±×¸²ÆÇ");
		
		s = new Shape[3];
		s[0] = new GRect(100, 150);
		s[1] = new GOval(150, 30);
		s[2] = new GRect(260, 110);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}
	public void paint(Graphics g) {
		super.paint(g);
		for(Shape p : s) {
			p.paint(g);
		}
	}
	public static void main(String args[]) {
		PicEditor dp = new PicEditor();
	}
}
