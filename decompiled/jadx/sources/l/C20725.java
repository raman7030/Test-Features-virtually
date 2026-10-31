package l;

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
public final class C20725 extends SocketFactory {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f66737 = C11321.m27961(C20725.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Proxy f66739 = Proxy.NO_PROXY;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f66738 = OpenAuthTask.Duplex;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return new Socket(this.f66739);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return m47331(new InetSocketAddress(str, i), null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m47331(new InetSocketAddress(str, i), new InetSocketAddress(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m47331(new InetSocketAddress(inetAddress, i), null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m47331(new InetSocketAddress(inetAddress, i), new InetSocketAddress(inetAddress2, i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Socket m47331(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) throws IOException {
        Socket socket = new Socket(this.f66739);
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        f66737.mo7100(inetSocketAddress, "Connecting to {}");
        socket.connect(inetSocketAddress, this.f66738);
        socket.setTcpNoDelay(true);
        return socket;
    }
}
