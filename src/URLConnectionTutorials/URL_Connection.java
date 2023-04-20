package URLConnectionTutorials;


import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
public class URL_Connection {
	
public static void main(String[] args) {
	try {
		URL url = new URL("https://www.gmail.com");
		URLConnection ur = url.openConnection();
		InputStream rawdata = ur.getInputStream();
		InputStream buffer = new BufferedInputStream(rawdata);
		Reader reader = new InputStreamReader(buffer);
		int c;
		while ((c = reader.read()) != -1) {
		
		System.out.print((char) c);
		}
	} catch (MalformedURLException e) {
		throw new RuntimeException(e);
		// TODO: handle exception
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
