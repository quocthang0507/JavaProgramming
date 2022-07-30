import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String server = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("Connecting to " + server + " on port " + port);
            Socket client = new Socket(server, port);
            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream out = client.getOutputStream();
            DataOutputStream outData = new DataOutputStream(out);
            outData.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream in = client.getInputStream();
            DataInputStream inData = new DataInputStream(in);
            System.out.println("Server says " + inData.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}