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
   String class_file_name = "class파일";
//   String[] file_adress;
   // 삽질 흔적 (114~118행)
   
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
         // 주석처리를 함으로써 하나의 창을 닫을 때 모든 창이 같이 닫히는걸 방지
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
                     // 파일 주소를 \\단위로 짤라서 배열에 저장
//                  file_name = file_adress[file_adress.length-1];        
                     // 전역 변수인 file_name를 파일 주소 맨끝에 있는 파일 이름으로 저장
                     // 컴파일 버튼 클릭시 불러온 파일을 바로 컴파일 할 수 있도록 file_name을 공유
                  
// getName() 메소드 있는걸 몰라서 위에 코드 30분 동안 삽질
                  
                  file_name=myFile.getName();
                     // myFile(파일주소)에서 파일명 추출
                  Javacompiler.this.setTitle(myFile.getName());
                     // save 버튼 클릭시 불러온 파일명으로 타이틀 변경
                  BufferedReader myReader = new BufferedReader(
                        new FileReader(myFile.getAbsolutePath()));
                  textArea.setText(myReader.readLine());
                  while((strLine = myReader.readLine()) != null) {
                     textArea.append("\n" + strLine);
                  }
                  myReader.close();
               }catch(IOException ie) {
                  System.out.println(ie+ "==> 입출력오류 발생");
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
               // 파일저장
               try {
                  File myFile = myFileChooser.getSelectedFile();
                  
                  // 파일명 기재
                  file_name = myFile.getName();
                     // 컴파일 버튼 클릭시 저장된 파일을 바로 컴파일 할 수 있도록 file_name을 공유
                  Javacompiler.this.setTitle(file_name);
                     // save 버튼 클릭시 저장된 파일명으로 타이틀 변경
                  PrintWriter myWriter = new PrintWriter(
                        new BufferedWriter(new FileWriter(myFile.getAbsolutePath())));
                  myWriter.write(textArea.getText());
                  myWriter.close();
               }catch(IOException ie) {
                  System.out.println(ie+ "==> 입출력오류 발생");
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
               // 터미널에서 claas파일을 만들기 위한 javac 명령어
                  
            ProcessBuilder processBuilder = new ProcessBuilder();
               // command를 제어할 수 있는 java의 ProcessBuilder를 사용
            processBuilder.directory(new File("C:\\Users\\CHH\\eclipse-workspace\\Object\\src\\Project_1")); 
               // 명령어를 실행시킬 주소
            processBuilder.command("cmd.exe", "/c", comfile_key);     
               // 실행시킬 명령어
            
            try {
                Process process = processBuilder.start();  
                   // 프로세스 시작
                BufferedReader outReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "euc-kr"));
                   // 출력 내용 저장
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "euc-kr"));
                   // 에러 내용 저장
                int exitCode = process.waitFor();          
                   // 프로세스 종료
                
                if (exitCode == 0) {
                   class_file_name = file_name.substring(0, file_name.length()-5) + ".class"; 
                      // class파일이 정상적으로 생성 되었을 경우 기존 파일명에서 뒤의 .java를 제외한 앞부분 추출 후 .class추가
                   System.out.println("\n" + class_file_name + "파일이 생성되었습니다." + "\n ");
                   textArea_1.append("\n" + class_file_name + "파일이 생성되었습니다." + "\n ");
                      // append로 출력창에 생성결과 추가
                }
                else {
                   String line;
                   textArea_1.append("\n");
                   while ((line = outReader.readLine()) != null) {
                      System.out.println(line);
                      textArea_1.append(line + "\n");
                         // append로 출력창에 출력 코드 한줄씩 추가
                   }
                   while ((line = errorReader.readLine()) != null) {
                      System.out.println(line);
                      textArea_1.append(line + "\n");
                         // append로 출력창에 에러 코드 한줄씩 추가
                   }
                   System.out.println("\nCompile에 실패하였습니다.\n");
                   System.out.println("Exited with error code : " + exitCode + "\n");
                   textArea_1.append("\nCompile에 실패하였습니다.\n");
                   textArea_1.append("Exited with error code : " + exitCode + "\n ");
                      // 실패 결과 및 에러 코드 출력
                }        
            } 
            catch (IOException ex) {
                ex.printStackTrace();
                   // 에러 처리
            } 
            catch (Exception ex) {
                ex.printStackTrace();
                   // 에러 처리
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
               // 터미널에서 java파일을 실행시킬 java 명령어

            ProcessBuilder processBuilder = new ProcessBuilder();
               // command를 제어할 수 있는 java의 ProcessBuilder를 사용
            processBuilder.directory(new File("C:\\Users\\CHH\\eclipse-workspace\\Object\\src\\project_1"));
               // 명령어를 실행시킬 주소
            processBuilder.command("cmd.exe", "/c", run_key);
               // 실행시킬 명령어

            
            try {
                Process process = processBuilder.start();
                   // 프로세스 시작
                BufferedReader outReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "euc-kr"));
                   // 출력 내용 저장
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "euc-kr"));
                   // 오류 내용 저장
                int exitCode = process.waitFor();
                   // 프로세스 종료
                
                String line;
                textArea_1.append("\n");
                while ((line = outReader.readLine()) != null) {
                    System.out.println(line);
                    textArea_1.append(line + "\n");
                       // append로 출력창에 출력 코드 한줄씩 추가
                }
                while ((line = errorReader.readLine()) != null) {
                    System.out.println(line);
                    textArea_1.append(line + "\n");
                       // append로 출력창에 에러 코드 한줄씩 추가
                }
                textArea_1.append(" ");
            } 
            catch (IOException ex) {
                ex.printStackTrace();
                   // 에러 처리
            } 
            catch (Exception ex) {
                ex.printStackTrace();
                   // 에러 처리
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