package network;

public interface TCPConnectionListener {
    
    void onConnectionReady (TCPConnection tcpConnection);
    void onReceiveString (TCPConnection tcpConnection, String value);
    void onDisconnectionReady (TCPConnection tcpConnection);
    void onException (TCPConnection tcpConnection, Exception e);

    void onDisconnect(TCPConnection tcpConnection);
}
