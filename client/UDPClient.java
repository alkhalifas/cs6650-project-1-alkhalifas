package client;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.io.IOException;

public class UDPClient extends AbstractClient {
    public UDPClient(String hostname, int port) {
        super(hostname, port);
    }

}
