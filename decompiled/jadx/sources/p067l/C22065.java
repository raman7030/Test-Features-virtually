package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.᩷۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9CP */
/* JADX INFO: loaded from: classes4.dex */
public final class C22065 extends SocketFactory {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC4410 f69418 = C13128.m30022(C22065.class);

    /* JADX INFO: renamed from: ۧ */
    public Proxy f69420 = Proxy.NO_PROXY;

    /* JADX INFO: renamed from: ֫ */
    public int f69419 = OpenAuthTask.Duplex;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return new Socket(this.f69420);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return m49658(new InetSocketAddress(str, i), null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m49658(new InetSocketAddress(str, i), new InetSocketAddress(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m49658(new InetSocketAddress(inetAddress, i), null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m49658(new InetSocketAddress(inetAddress, i), new InetSocketAddress(inetAddress2, i2));
    }

    /* JADX INFO: renamed from: ֫ */
    private Socket m49658(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) throws IOException {
        Socket socket = new Socket(this.f69420);
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        f69418.mo9195(inetSocketAddress, "Connecting to {}");
        socket.connect(inetSocketAddress, this.f69419);
        socket.setTcpNoDelay(true);
        return socket;
    }
}
