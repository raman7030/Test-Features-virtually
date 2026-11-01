package p067l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;

/* JADX INFO: renamed from: l.۟ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G2VK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9554 extends ServerSocketFactory {

    /* JADX INFO: renamed from: ֫ */
    public final SSLContext f26264;

    public C9554(SSLContext sSLContext) {
        this.f26264 = sSLContext;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket() throws IOException {
        ServerSocket serverSocketCreateServerSocket = this.f26264.getServerSocketFactory().createServerSocket();
        ((SSLServerSocket) serverSocketCreateServerSocket).setUseClientMode(true);
        return serverSocketCreateServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) throws IOException {
        ServerSocket serverSocketCreateServerSocket = this.f26264.getServerSocketFactory().createServerSocket(i);
        ((SSLServerSocket) serverSocketCreateServerSocket).setUseClientMode(true);
        return serverSocketCreateServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) throws IOException {
        ServerSocket serverSocketCreateServerSocket = this.f26264.getServerSocketFactory().createServerSocket(i, i2);
        ((SSLServerSocket) serverSocketCreateServerSocket).setUseClientMode(true);
        return serverSocketCreateServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) throws IOException {
        ServerSocket serverSocketCreateServerSocket = this.f26264.getServerSocketFactory().createServerSocket(i, i2, inetAddress);
        ((SSLServerSocket) serverSocketCreateServerSocket).setUseClientMode(true);
        return serverSocketCreateServerSocket;
    }
}
