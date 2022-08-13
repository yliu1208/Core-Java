import java.io.*; 
import java.net.*; 
import java.nio.charset.*;
import java.util.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        // establish server socket
        try (var s = new ServerSocket(8189)) {
            // wait for client connection
            try (Socket incoming = s.accept()) {
                InputStream inStream = incoming.getInputStream(); 
                OutputStream outStream = incoming.getOutputStream(); 

                try (var in = new Scanner(inStream, StandardCharsets.UTF_8)) {
                    var out = new PrintWriter(new OutputStreamWriter(outStream, StandardCharsets.UTF_8), true /* autoFlush */); 

                    out.println("Hello! Enter BYE to exit."); 

                    // echo client input
                    boolean done = false; 
                    while (!done && in.hasNextLine()) {
                        String line = in.nextLine(); 
                        out.println("Echo: " + line); 
                        if (line.strip().equals("BYE")) done = true; 
                    }
                }
            }
        }
    }
}
