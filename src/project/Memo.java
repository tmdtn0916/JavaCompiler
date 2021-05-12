package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
 
class Memo extends JFrame
{
    //컨테이너 객체 변수를 선언하고, null을 대입   
    Container myContainer = null;
   
    //MyEditor 클래스의 생성자를 정의
    public Memo(String title) {
       
        //부모 클래스(JFrame)의 생성자를 불러낸다.
        super(title);
 
        //프레임의 컨텐트페인을 얻어서 컨테이너 객체에 대입
        myContainer = this.getContentPane();
 
        //컨테이너의 레이아웃을 설정
        myContainer.setLayout(new BorderLayout());
 
        //입력용 텍스트 영역을 작성
        final JTextArea myText = new JTextArea();
 
        //행바꾸기를 지원; 자동 줄바꾸기
        myText.setLineWrap(true) ;
 
        //스크롤페인을 생성하여 텍스트 영역을 설정
        JScrollPane myScroll = new JScrollPane(myText);
 
        //ContentPane에 ScrollPane을 설정
        myContainer.add(myScroll, BorderLayout.CENTER);
       
        //메뉴바 작성 ----------------------------------------
       
        //MenuBar/Menu/MenuItem 변수 선언
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
 
        //MenuBar를 작성하여 프레임에 설정
        myMenuBar = new JMenuBar();
        myMenuBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        setJMenuBar(myMenuBar);  //프레임이름.setJMenubar(메뉴바이름)
                                                //프레임에 메뉴바 삽입
 
        //File Menu의 작성과 구성------------------------------
        myFileMenu = new JMenu("File");
 
        //니모닉 키를 설정
        myFileMenu.setMnemonic('F');
 
        //MenuItem의 작성과 구성
       
        //New 메뉴아이템
        myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));
        //New메뉴아이템을 File메뉴에 추가
        myFileMenu.add(myNewMItem);
       
        //Open 메뉴아이템
        myOpenMItem = new JMenuItem("Open", new ImageIcon("open.gif"));
        myFileMenu.add(myOpenMItem);
 
        //Save 메뉴아이템
        mySaveMItem = new JMenuItem("Save", new ImageIcon("save.gif"));
        myFileMenu.add(mySaveMItem);
       
        //세퍼레이터 추가 ; 구분짓는선
        myFileMenu.addSeparator();
 
        //Exit 메뉴아이템
        myExitMItem = new JMenuItem("Exit",new ImageIcon("exit.gif"));
        myFileMenu.add(myExitMItem);
 
        //FileMenu를 MenuBar에 편성
        myMenuBar.add(myFileMenu);
 
 
        //Edit Menu의 작성과 구성 ------------------------------
        myEditMenu = new JMenu("Edit");
 
        //니모닉 키를 설정
        myEditMenu.setMnemonic('E');
       
        //Copy메뉴 아이템
        myCopyMItem = new JMenuItem("Copy", new ImageIcon("copy.gif"));
        //Copy메뉴 아이템을 Edit메뉴에 추가
        myEditMenu.add(myCopyMItem);
 
       
        /*
            Copy : 텍스트 영역 안에서 선택되어 잇는 문자열을 클립보드에 복사한다.
                        명려어를 실행한 후 선택 문자열은 그대로 남는다.
            Paste : 클립보드에 복사되어 있는 문자열을 텍스트 영역 안에 붙여 넣는다.
                       붙여넣어질 곳의 위치는 명령어를 실행한 후에 커서가 있는 곳이다.
            Cut : 텍스트 영역 안에서 선택된 문자열이 잘려 클립보드에 전송한다.
                    명령어를 실행한 후 선택된 문자열은 잘려 텍스트 영역 안에서 삭제된다.
           
            JTextArea 의 메소드
 
            copy()
            paste()
            cut()
 
        */
       
        //Copy 메뉴 이벤트 처리를 정의
        myCopyMItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                myText.copy();
            }
        });
 
 
        //Paste메뉴 아이템
        myPasteMItem = new JMenuItem("Paste", new ImageIcon("paste.gif"));
        myEditMenu.add(myPasteMItem);
       
        //Paste 메뉴 이벤트 처리를 정의
        myPasteMItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                myText.paste();
            }
        });
 
        //Cut 메뉴 아이템
        myCutMItem = new JMenuItem("Cut", new ImageIcon("cut.gif"));
        myEditMenu.add(myCutMItem);
           
        //Cut 메뉴 이벤트 처리를 정의
        myCutMItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                myText.cut();
            }
        });
 
        //추가 : 
        //Select All 메뉴 아이템
        mySelectAllMItem = new JMenuItem("Select All");
        myEditMenu.add(mySelectAllMItem);
 
        //Select All 메뉴 이벤트 처리를 정의
        mySelectAllMItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(myText.getText().length()>=0){
                    //public void select(int selectionStart, int selectionEnd)
                    myText.select(0, myText.getText().length());
                    System.out.println(myText.getText() +"/"+ myText.getText().length() );
                }
               
            }
        });
 
        //EditMenu를 MenuBar에 끼워넣는다
        myMenuBar.add(myEditMenu);
 
 
        //메뉴바 작성 끝 --------------------------------------
       
       
        //프레임(윈도우)이 닫힐때의 처리를 정의
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Look & Feel 설정
 
        try{
 
            //Java스타일의 Look&Feel 로 설정
            UIManager.setLookAndFeel(
                "javax.swing.plaf.metal.MetalLookAndFeel");
           
            //설정을 반영
            SwingUtilities.updateComponentTreeUI(this);
 
        }catch(Exception e){
            System.out.println(e + "--> 오류 발생");
        }
 
        //프레임의 크기를 정의 하여 표시
        this.setSize(500,378);
        this.setVisible(true);
 
    }//END 생성자 ====================
    public static void main(String[] args)
    {
        //MyEditor 클래스의 새로운 인스턴스 생성
        Memo myApp = new Memo("My Editor");
   
    }
}