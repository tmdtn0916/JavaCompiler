package hello;

import java.io.*;
import java.awt.Component;
import javax.swing.JFileChooser;

public class FileUtil {
    public static String enter = System.getProperty("line.separator");
    public static JFileChooser chooser;
    
    //���� ���� �б�
    public static StringBuffer read(String file) {
        try {
            StringBuffer data = new StringBuffer();
            BufferedReader in = new BufferedReader(new FileReader (file));
            String line = null;
            while((line = in.readLine()) != null) {
                data.append(line);
                data.append(enter);
            }
            in.close();
            return data;
        }catch(Exception e) {
            System.out.println(e);
        }    
        return null;
    }
    
    //���Ͽ� ������ ����
    public static void save(StringBuffer data, String file) {
    	try {
    		PrintWriter out = new PrintWriter(new FileWriter(file));
    		out.print(data.toString());
    		out.close();
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
    
    // from ���Ͽ��� to ���Ϸ� ���� ����
    public static void copy(String from, String to) {
    	try {
    		byte buffer[] = new byte[1024 * 5];
    		FileInputStream in = new FileInputStream(from);
    		FileOutputStream out = new FileOutputStream(to);
    		int n = -1;
    		while((n = in.read(buffer)) != -1) {
    			out.write(buffer,0,n);
    		}
    		in.close();
    		out.close();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    //���ϻ���
    public static boolean delete(String file) {
    	File f = new File(file);
    	return f.delete();
    }
    
    //from ������ to ���Ϸ� �̵�
    public static void move(String from, String to) {
    	copy(from, to);
    	delete(from);
    }
    
    //���� ����
    public static boolean rmdir(File path) {
    	if(path.exists()) {
    		File[] files = path.listFiles();
    		for(int i = 0; i<files.length; i++) {
    			if(files[i].isDirectory()) {
    				rmdir(files[i]);
    			} else {
    				files[i].delete();
    			}
    		}
    	}
    	return (path.delete());
    }
    
    //���� ����
    public static boolean rmdir(String path) {
    	return rmdir(new File(path));
    }
    
    //���� ����
    public static boolean mkdir(String dir) {
    	File f = new File(dir);
    	return f.mkdirs();
    }
    
    //�б�� �������� ���̱�
    public static File showOpenFileChooser(Component c) {
    	if(chooser == null) {
    		chooser = new JFileChooser();
    	}
    	if(chooser.showOpenDialog(c) == JFileChooser.APPROVE_OPTION) {
    		return chooser.getSelectedFile();
    	} else return null;
    }
    
    //����� �������� ���̱�
    public static File showSaveFileChooser(Component c) {
    	if(chooser == null) {
    		chooser = new JFileChooser();
    	}
    	if(chooser.showSaveDialog(c) == JFileChooser.APPROVE_OPTION) {
    		return chooser.getSelectedFile();
    	} else return null;
    }
}



