package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FileDialog;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;

import javax.tools.*;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.CardLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.io.*;
import java.lang.*;

public class Javacompiler extends JFrame {
   
   String file_name;
   String class_file_name = "class����";
//   String[] file_adress;
   // ���� ���� (114~118��)
   
   private JTextArea textArea;
   private JTextArea textArea_1;
   
   private JPanel contentPane;
   
   final JFileChooser myFileChooser = new JFileChooser();

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Javacompiler frame = new Javacompiler();
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
   public Javacompiler() {
      setTitle("New File");
      
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // �ּ�ó���� �����ν� �ϳ��� â�� ���� �� ��� â�� ���� �����°� ����
      setBounds(300, 100, 658, 535);
      
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      
      JMenu mnNewMenu = new JMenu("File");
      menuBar.add(mnNewMenu);
         
      
      JMenuItem mntmNewMenuItem = new JMenuItem("new");
      mntmNewMenuItem.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Javacompiler frame = new Javacompiler();
            frame.setVisible(true);
         }
      });
      mnNewMenu.add(mntmNewMenuItem);
      
      JMenuItem mntmNewMenuItem_1 = new JMenuItem("open");
      mntmNewMenuItem_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            int intRet = myFileChooser.showOpenDialog(Javacompiler.this);
            
            if(intRet == JFileChooser.APPROVE_OPTION) {
               try {
                  String strLine;
                  File myFile = myFileChooser.getSelectedFile();
//                  file_adress = String.valueOf(myFile).split("\\\\");   
                     // ���� �ּҸ� \\������ ©�� �迭�� ����
//                  file_name = file_adress[file_adress.length-1];        
                     // ���� ������ file_name�� ���� �ּ� �ǳ��� �ִ� ���� �̸����� ����
                     // ������ ��ư Ŭ���� �ҷ��� ������ �ٷ� ������ �� �� �ֵ��� file_name�� ����
                  
// getName() �޼ҵ� �ִ°� ���� ���� �ڵ� 30�� ���� ����
                  
                  file_name=myFile.getName();
                     // myFile(�����ּ�)���� ���ϸ� ����
                  Javacompiler.this.setTitle(myFile.getName());
                     // save ��ư Ŭ���� �ҷ��� ���ϸ����� Ÿ��Ʋ ����
                  BufferedReader myReader = new BufferedReader(
                        new FileReader(myFile.getAbsolutePath()));
                  textArea.setText(myReader.readLine());
                  while((strLine = myReader.readLine()) != null) {
                     textArea.append("\n" + strLine);
                  }
                  myReader.close();
               }catch(IOException ie) {
                  System.out.println(ie+ "==> ����¿��� �߻�");
               }
            }
         }
      });
      mnNewMenu.add(mntmNewMenuItem_1);
      
      JMenuItem mntmNewMenuItem_2 = new JMenuItem("save");
      mntmNewMenuItem_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            int intRet = myFileChooser.showSaveDialog(Javacompiler.this);
            
            
            // yes
            if(intRet == JFileChooser.APPROVE_OPTION)
            {
               // ��������
               try {
                  File myFile = myFileChooser.getSelectedFile();
                  
                  // ���ϸ� ����
                  file_name = myFile.getName();
                     // ������ ��ư Ŭ���� ����� ������ �ٷ� ������ �� �� �ֵ��� file_name�� ����
                  Javacompiler.this.setTitle(file_name);
                     // save ��ư Ŭ���� ����� ���ϸ����� Ÿ��Ʋ ����
                  PrintWriter myWriter = new PrintWriter(
                        new BufferedWriter(new FileWriter(myFile.getAbsolutePath())));
                  myWriter.write(textArea.getText());
                  myWriter.close();
               }catch(IOException ie) {
                  System.out.println(ie+ "==> ����¿��� �߻�");
               }
            }
         
         }
      });
      mnNewMenu.add(mntmNewMenuItem_2);
      
      JMenuItem mntmNewMenuItem_3 = new JMenuItem("exit");
      mntmNewMenuItem_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      mnNewMenu.add(mntmNewMenuItem_3);
      
      JMenu mnNewMenu_1 = new JMenu("Edit");
      menuBar.add(mnNewMenu_1);
      
      JMenuItem mntmNewMenuItem_4 = new JMenuItem("copy");
      mntmNewMenuItem_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            textArea.copy();
            
         }
      });
      mnNewMenu_1.add(mntmNewMenuItem_4);
      
      JMenuItem mntmNewMenuItem_5 = new JMenuItem("paste");
      mntmNewMenuItem_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            textArea.paste();
         }
      });
      mnNewMenu_1.add(mntmNewMenuItem_5);
      
      JMenuItem mntmNewMenuItem_6 = new JMenuItem("cut");
      mntmNewMenuItem_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            textArea.cut();
         }
      });
      mnNewMenu_1.add(mntmNewMenuItem_6);
      
      JMenu mnNewMenu_2 = new JMenu("Compile");
      menuBar.add(mnNewMenu_2);
      
      JMenuItem mntmNewMenuItem_7 = new JMenuItem("compile");
      mntmNewMenuItem_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String comfile_key;
            comfile_key = "javac " + file_name;          
               // �͹̳ο��� claas������ ����� ���� javac ��ɾ�
                  
            ProcessBuilder processBuilder = new ProcessBuilder();
               // command�� ������ �� �ִ� java�� ProcessBuilder�� ���
            processBuilder.directory(new File("C:\\Users\\CHH\\eclipse-workspace\\Object\\src\\Project_1")); 
               // ��ɾ �����ų �ּ�
            processBuilder.command("cmd.exe", "/c", comfile_key);     
               // �����ų ��ɾ�
            
            try {
                Process process = processBuilder.start();  
                   // ���μ��� ����
                BufferedReader outReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "euc-kr"));
                   // ��� ���� ����
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "euc-kr"));
                   // ���� ���� ����
                int exitCode = process.waitFor();          
                   // ���μ��� ����
                
                if (exitCode == 0) {
                   class_file_name = file_name.substring(0, file_name.length()-5) + ".class"; 
                      // class������ ���������� ���� �Ǿ��� ��� ���� ���ϸ��� ���� .java�� ������ �պκ� ���� �� .class�߰�
                   System.out.println("\n" + class_file_name + "������ �����Ǿ����ϴ�." + "\n ");
                   textArea_1.append("\n" + class_file_name + "������ �����Ǿ����ϴ�." + "\n ");
                      // append�� ���â�� ������� �߰�
                }
                else {
                   String line;
                   textArea_1.append("\n");
                   while ((line = outReader.readLine()) != null) {
                      System.out.println(line);
                      textArea_1.append(line + "\n");
                         // append�� ���â�� ��� �ڵ� ���پ� �߰�
                   }
                   while ((line = errorReader.readLine()) != null) {
                      System.out.println(line);
                      textArea_1.append(line + "\n");
                         // append�� ���â�� ���� �ڵ� ���پ� �߰�
                   }
                   System.out.println("\nCompile�� �����Ͽ����ϴ�.\n");
                   System.out.println("Exited with error code : " + exitCode + "\n");
                   textArea_1.append("\nCompile�� �����Ͽ����ϴ�.\n");
                   textArea_1.append("Exited with error code : " + exitCode + "\n ");
                      // ���� ��� �� ���� �ڵ� ���
                }        
            } 
            catch (IOException ex) {
                ex.printStackTrace();
                   // ���� ó��
            } 
            catch (Exception ex) {
                ex.printStackTrace();
                   // ���� ó��
            }
         }
      });
      mnNewMenu_2.add(mntmNewMenuItem_7);
      
      
      JMenuItem mntmNewMenuItem_8 = new JMenuItem("run");
      mntmNewMenuItem_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String result = "";
            String run_key;
            run_key = "java " + file_name;       
               // �͹̳ο��� java������ �����ų java ��ɾ�

            ProcessBuilder processBuilder = new ProcessBuilder();
               // command�� ������ �� �ִ� java�� ProcessBuilder�� ���
            processBuilder.directory(new File("C:\\Users\\CHH\\eclipse-workspace\\Object\\src\\project_1"));
               // ��ɾ �����ų �ּ�
            processBuilder.command("cmd.exe", "/c", run_key);
               // �����ų ��ɾ�

            
            try {
                Process process = processBuilder.start();
                   // ���μ��� ����
                BufferedReader outReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "euc-kr"));
                   // ��� ���� ����
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "euc-kr"));
                   // ���� ���� ����
                int exitCode = process.waitFor();
                   // ���μ��� ����
                
                String line;
                textArea_1.append("\n");
                while ((line = outReader.readLine()) != null) {
                    System.out.println(line);
                    textArea_1.append(line + "\n");
                       // append�� ���â�� ��� �ڵ� ���پ� �߰�
                }
                while ((line = errorReader.readLine()) != null) {
                    System.out.println(line);
                    textArea_1.append(line + "\n");
                       // append�� ���â�� ���� �ڵ� ���پ� �߰�
                }
                textArea_1.append(" ");
            } 
            catch (IOException ex) {
                ex.printStackTrace();
                   // ���� ó��
            } 
            catch (Exception ex) {
                ex.printStackTrace();
                   // ���� ó��
            }
         }
      });
      mnNewMenu_2.add(mntmNewMenuItem_8);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(new BorderLayout(0, 0));
      
      JSplitPane splitPane_1 = new JSplitPane();
      splitPane_1.setResizeWeight(0.75);
      splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
      splitPane_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
      contentPane.add(splitPane_1, BorderLayout.CENTER);
      
      JScrollPane scrollPane = new JScrollPane();
      splitPane_1.setLeftComponent(scrollPane);
      
      textArea = new JTextArea();
//      JTextArea textArea = new JTextArea();
      scrollPane.setViewportView(textArea);
      
      JScrollPane scrollPane_1 = new JScrollPane();
      splitPane_1.setRightComponent(scrollPane_1);
      
      textArea_1 = new JTextArea();
//      JTextArea textArea_1 = new JTextArea();
      scrollPane_1.setViewportView(textArea_1);
      
   }
   
}