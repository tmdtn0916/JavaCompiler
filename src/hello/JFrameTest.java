package hello;
import javax.swing.*;
public class JFrameTest extends JFrame{
	
	public JFrameTest() {
		super("���� JFrame �׽�Ʈ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String args[]) {
		JFrameTest jf = new JFrameTest();
	}
}
