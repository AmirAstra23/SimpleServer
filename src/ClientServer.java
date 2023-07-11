//import java.io.IOException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 30333;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new
                     PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new
                     InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Host: Student of Netology.ru\n\n\n");
            String resp = in.readLine();
            System.out.println(resp);
        }
    }
}
