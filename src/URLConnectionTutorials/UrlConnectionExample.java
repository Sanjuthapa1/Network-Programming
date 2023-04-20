package URLConnectionTutorials;

import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.IOException;

public class UrlConnectionExample {
    public static void main(String[] args)
    		throws IOException {
        URL url = new URL("https://www.google.com");
        URLConnection connection = url.openConnection();
        System.out.println("Connection has been Successful");
        System.out.println("hello");
    }
}
