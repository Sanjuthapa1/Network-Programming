package URLConnectionTutorials;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerExample {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8000);
        System.out.println("Server started on port 8000");

        while (true) {
            Socket client = server.accept();
            System.out.println("Client connected: " + client.getInetAddress());

            Writer out = new OutputStreamWriter(client.getOutputStream());
            out.write("HTTP/1.1 200 OK\r\n");
            out.write("Content-Type: text/plain\r\n");
            out.write("\r\n");
            out.write("Hello World!\r\n");
            out.flush();

            client.close();
        }
    }
}

