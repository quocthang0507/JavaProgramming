import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress myIp = InetAddress.getLocalHost();
        System.out.println("My IP address is " + myIp.getHostAddress());
    }
}