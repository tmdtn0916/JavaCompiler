package hello;

public class FormChecker {
	public static boolean isEmpty(String s)	{
		if(s == null || s.trim().length() == 0)
			return true;
		else
			return false;
	}
}
