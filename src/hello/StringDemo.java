package hello;

public class StringDemo {
    public static void main(String[] args) {
        String url = "http://www.naver.com/index.html";

        System.out.printf("url: %s\n", url);
        int s = url.indexOf("//") + 2;
        int e = url.indexOf("/", s);
        String host = url.substring(s, e);
        System.out.printf("host: %s\n", host);
    }
}