package hello;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MyWindow extends JFrame {

	private JPanel contentPane;
	private JTextField display;
	private String exp = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow frame = new MyWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyWindow() {
		setTitle("\uB098\uC758 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 365);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		display = new JTextField();
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(display, BorderLayout.NORTH);
		display.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("status");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "7";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "8";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "9";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "/";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "4";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "5";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "6";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "*";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "1";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "2";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "3";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "-";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "0";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("c");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = "";
				display.setText("");
			}
		});
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number value = ScriptCalculator.calc(exp);
				display.setText(value.toString());
			}
		});
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "+";
				display.setText(exp);
			}
		});
		panel.add(btnNewButton_15);
	}
}
