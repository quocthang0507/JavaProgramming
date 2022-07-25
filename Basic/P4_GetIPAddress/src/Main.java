import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress myIp = InetAddress.getLocalHost();
        String hostname = myIp.getHostName();
        System.out.println("My IP address is " + myIp.getHostAddress());
        System.out.println("My hostname is " + hostname);
    }
}