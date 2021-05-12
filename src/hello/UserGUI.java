package hello;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.TreePath;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTree;

public class UserGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_2;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JTree tree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGUI frame = new UserGUI();
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
	public UserGUI() {
		setTitle("\uC0AC\uC6A9\uC790 \uB4F1\uB85D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, "name_11086108119600");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNewLabel = new JLabel("\uC774\uB984");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("\uC131\uBCC4");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC790");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 2;
		panel.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC790");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 2;
		gbc_rdbtnNewRadioButton_1.gridy = 2;
		panel.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		ButtonGroup sex = new ButtonGroup();
		sex.add(rdbtnNewRadioButton);
		sex.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_2 = new JLabel("\uC790\uACA9\uC99D");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		chckbxNewCheckBox = new JCheckBox("\uC6B4\uC804\uBA74\uD5C8\uC99D");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 3;
		panel.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("\uC815\uBCF4\uCC98\uB9AC\uAE30\uC0AC");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 2;
		gbc_chckbxNewCheckBox_1.gridy = 3;
		panel.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("\uCEF4\uD4E8\uD130\uD65C\uC6A9");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_2.gridx = 3;
		gbc_chckbxNewCheckBox_2.gridy = 3;
		panel.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
		
		lblNewLabel_3 = new JLabel("\uC804\uACF5");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		
		String majors[] = {
				"컴퓨터", "전자", "통신", "기계", "국문", "영문", "경영", "경제"
		};
		comboBox = new JComboBox(majors);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		panel.add(comboBox, gbc_comboBox);
		
		btnNewButton = new JButton("\uB2E4\uC74C >>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(FormChecker.isEmpty(textField.getText()))
					return;
				CardLayout c = (CardLayout)contentPane.getLayout();
				c.next(contentPane);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 7;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, "name_11086120555000");
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblNewLabel_4 = new JLabel("\uCDE8\uBBF8");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 1;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.weighty = 1.0;
		gbc_scrollPane.weightx = 1.0;
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		
		
		String hobby[] = {
				"영화감상", "축구", "야구", "여행", "Tv"
		};list = new JList(hobby);
		scrollPane.setViewportView(list);
		
		lblNewLabel_5 = new JLabel("\uAD00\uC2EC\uBD84\uC57C");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.weighty = 1.0;
		gbc_scrollPane_1.weightx = 1.0;
		gbc_scrollPane_1.gridheight = 3;
		gbc_scrollPane_1.gridwidth = 7;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 4;
		panel_1.add(scrollPane_1, gbc_scrollPane_1);
		
		
		
		Vector web = new Vector() {
			public String toString() {
				return "Web";
			}
		};
		web.add("css");
		web.add("ajax");
		web.add("wiki");
		
		Vector java = new Vector() {
			public String toString() {
				return "Java";
			}
		};
		java.add("JDBC");
		java.add("Swing");
		Object category[] = {web, java};
		tree = new JTree(category);
		scrollPane_1.setViewportView(tree);
		
		btnNewButton_1 = new JButton("<<\uC774\uC804");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)contentPane.getLayout();
				c.next(contentPane);
				
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 6;
		gbc_btnNewButton_1.gridy = 8;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		btnNewButton_2 = new JButton("\uC885\uB8CC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText());
				boolean male = rdbtnNewRadioButton.isSelected();
				if(male)
					System.out.println("남자");
				else
					System.out.println("여자");
				
				boolean drive =chckbxNewCheckBox.isSelected();
				if(drive)
					System.out.println("운전면허증");
				boolean info =chckbxNewCheckBox_1.isSelected();
				if(info)
					System.out.println("정보처리기사");
				boolean computer =chckbxNewCheckBox_2.isSelected();
				if(computer)
					System.out.println("컴퓨터활용");
				
				Object h[] = list.getSelectedValues();
				for(int k = 0; k < h.length; k++) {
					System.out.println(h[k]);
				}
				TreePath path = tree.getSelectionPath();
				if(path != null) {
					Object step[] = path.getPath();
					System.out.println(step[step.length-1]);
				}
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridx = 7;
		gbc_btnNewButton_2.gridy = 8;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
	}

}
