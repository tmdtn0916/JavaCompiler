package hello;

public class Copy {
	public static void main(String args[]) {
		if(args.length < 2) {
			System.out.println("Usage: java Copy <from> <to>");
			System.exit(1);
		}
		FileUtil.copy(args[0], args[1]);
	}
}