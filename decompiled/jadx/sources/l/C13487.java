package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: l.ܰ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9AU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13487 extends SSLSocketFactory {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory f40276;

    public C13487(SSLSocketFactory sSLSocketFactory) {
        this.f40276 = sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f40276.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f40276.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f40276.createSocket();
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f40276.createSocket(socket, str, i, z);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f40276.createSocket(str, i);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f40276.createSocket(str, i, inetAddress, i2);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f40276.createSocket(inetAddress, i);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f40276.createSocket(inetAddress, i, inetAddress2, i2);
        socketCreateSocket.setTcpNoDelay(true);
        return socketCreateSocket;
    }
}
