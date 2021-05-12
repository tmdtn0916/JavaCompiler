package myjava;

import java.io.*;
import java.util.*;
public class ConfigReader {
	String file;
	char comment;
	Hashtable<String, String> ht;
	String delm;
	
	public ConfigReader(String file) {
		this(file,'#',"\t");
	}
	
	public ConfigReader(String file, char comment) {
		this(file, comment, " \t");
	}
	
	public ConfigReader(String file, char comment, String delm) {
		this.file = file;
		this.comment = comment;
		this.delm = delm;
		ht = new Hashtable<String, String>();
	}
	
	public void parse() throws IOException {
		String rl;
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		while((rl = br.readLine()) != null) {
			rl = rl.trim();
			if(rl.charAt(0) == comment) {
				continue;
			}else {
				StringTokenizer st = new StringTokenizer(rl, delm, false);
				String key = st.nextToken();
				String value = st.nextToken();
				ht.put(key, value);
			}
		}
		br.close();
	}
	public String getValue(String name)	{
		return ht.get(name);
	}
	public static void main(String args[]) {
		ConfigReader cr = new ConfigReader("server.conf");
		try {
			cr.parse();
			System.out.println(cr.getValue("port"));
			System.out.println(cr.getValue("server"));
			System.out.println(cr.getValue("admin"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
