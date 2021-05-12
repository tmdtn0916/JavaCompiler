package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
 
class Memo extends JFrame
{
    //�����̳� ��ü ������ �����ϰ�, null�� ����   
    Container myContainer = null;
   
    //MyEditor Ŭ������ �����ڸ� ����
    public Memo(String title) {
       
        //�θ� Ŭ����(JFrame)�� �����ڸ� �ҷ�����.
        super(title);
 
        //�������� ����Ʈ������ �� �����̳� ��ü�� ����
        myContainer = this.getContentPane();
 
        //�����̳��� ���̾ƿ��� ����
        myContainer.setLayout(new BorderLayout());
 
        //�Է¿� �ؽ�Ʈ ������ �ۼ�
        final JTextArea myText = new JTextArea();
 
        //��ٲٱ⸦ ����; �ڵ� �ٹٲٱ�
        myText.setLineWrap(true) ;
 
        //��ũ�������� �����Ͽ� �ؽ�Ʈ ������ ����
        JScrollPane myScroll = new JScrollPane(myText);
 
        //ContentPane�� ScrollPane�� ����
        myContainer.add(myScroll, BorderLayout.CENTER);
       
        //�޴��� �ۼ� ----------------------------------------
       
        //MenuBar/Menu/MenuItem ���� ����
        JMenuBar myMenuBar ;
        JMenu myFileMenu;  //File
        JMenu myEditMenu; //Edit
       
        JMenuItem myNewMItem ; //New
        JMenuItem myOpenMItem ; //Open
        JMenuItem mySaveMItem ; //Save
        JMenuItem myExitMItem ; //Exit
        JMenuItem myCopyMItem ; //Copy
        JMenuItem myPasteMItem ; //Paste
        JMenuItem myCutMItem ; //Cut
        JMenuItem mySelectAllMItem ; //Select All
 
        //MenuBar�� �ۼ��Ͽ� �����ӿ� ����
        myMenuBar = new JMenuBar();
        myMenuBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        setJMenuBar(myMenuBar);  //�������̸�.setJMenubar(�޴����̸�)
                                                //�����ӿ� �޴��� ����
 
        //File Menu�� �ۼ��� ����------------------------------
        myFileMenu = new JMenu("File");
 
        //�ϸ�� Ű�� ����
        myFileMenu.setMnemonic('F');
 
        //MenuItem�� �ۼ��� ����
       
        //New �޴�������
        myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));
        //New�޴��������� File�޴��� �߰�
        myFileMenu.add(myNewMItem);
       
        //Open �޴�������
        myOpenMItem = new JMenuItem("Open", new ImageIcon("open.gif"));
        myFileMenu.add(myOpenMItem);
 
        //Save �޴�������
        mySaveMItem = new JMenuItem("Save", new ImageIcon("save.gif"));
        myFileMenu.add(mySaveMItem);
       
        //���۷����� �߰� ; �������¼�
        myFileMenu.addSeparator();
 
        //Exit �޴�������
        myExitMItem = new JMenuItem("Exit",new ImageIcon("exit.gif"));
        myFileMenu.add(myExitMItem);
 
        //FileMenu�� MenuBar�� ��
        myMenuBar.add(myFileMenu);
 
 
        //Edit Menu�� �ۼ��� ���� ------------------------------
        myEditMenu = new JMenu("Edit");
 
        //�ϸ�� Ű�� ����
        myEditMenu.setMnemonic('E');
       
        //Copy�޴� ������
        myCopyMItem = new JMenuItem("Copy", new ImageIcon("copy.gif"));
        //Copy�޴� �������� Edit�޴��� �߰�
        myEditMenu.add(myCopyMItem);
 
       
        /*
            Copy : �ؽ�Ʈ ���� �ȿ��� ���õǾ� �մ� ���ڿ��� Ŭ�����忡 �����Ѵ�.
                        ���� ������ �� ���� ���ڿ��� �״�� ���´�.
            Paste : Ŭ�����忡 ����Ǿ� �ִ� ���ڿ��� �ؽ�Ʈ ���� �ȿ� �ٿ� �ִ´�.
                       �ٿ��־��� ���� ��ġ�� ��ɾ ������ �Ŀ� Ŀ���� �ִ� ���̴�.
            Cut : �ؽ�Ʈ ���� �ȿ��� ���õ� ���ڿ��� �߷� Ŭ�����忡 �����Ѵ�.
                    ��ɾ ������ �� ���õ� ���ڿ��� �߷� �ؽ�Ʈ ���� �ȿ��� �����ȴ�.
           
            JTextArea �� �޼ҵ�
 
            copy()
            paste()
            cut()
 
        */
       
        //Copy �޴� �̺�Ʈ ó���� ����
        myCopyMItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                myText.copy();
            }
        });
 
 
        //Paste�޴� ������
        myPasteMItem = new JMenuItem("Paste", new ImageIcon("paste.gif"));
        myEditMenu.add(myPasteMItem);
       
        //Paste �޴� �̺�Ʈ ó���� ����
        myPasteMItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                myText.paste();
            }
        });
 
        //Cut �޴� ������
        myCutMItem = new JMenuItem("Cut", new ImageIcon("cut.gif"));
        myEditMenu.add(myCutMItem);
           
        //Cut �޴� �̺�Ʈ ó���� ����
        myCutMItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                myText.cut();
            }
        });
 
        //�߰� : 
        //Select All �޴� ������
        mySelectAllMItem = new JMenuItem("Select All");
        myEditMenu.add(mySelectAllMItem);
 
        //Select All �޴� �̺�Ʈ ó���� ����
        mySelectAllMItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(myText.getText().length()>=0){
                    //public void select(int selectionStart, int selectionEnd)
                    myText.select(0, myText.getText().length());
                    System.out.println(myText.getText() +"/"+ myText.getText().length() );
                }
               
            }
        });
 
        //EditMenu�� MenuBar�� �����ִ´�
        myMenuBar.add(myEditMenu);
 
 
        //�޴��� �ۼ� �� --------------------------------------
       
       
        //������(������)�� �������� ó���� ����
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Look & Feel ����
 
        try{
 
            //Java��Ÿ���� Look&Feel �� ����
            UIManager.setLookAndFeel(
                "javax.swing.plaf.metal.MetalLookAndFeel");
           
            //������ �ݿ�
            SwingUtilities.updateComponentTreeUI(this);
 
        }catch(Exception e){
            System.out.println(e + "--> ���� �߻�");
        }
 
        //�������� ũ�⸦ ���� �Ͽ� ǥ��
        this.setSize(500,378);
        this.setVisible(true);
 
    }//END ������ ====================
    public static void main(String[] args)
    {
        //MyEditor Ŭ������ ���ο� �ν��Ͻ� ����
        Memo myApp = new Memo("My Editor");
   
    }
}