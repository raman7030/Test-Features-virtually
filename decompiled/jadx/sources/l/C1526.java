package l;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: renamed from: l.֫ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B2VY */
/* JADX INFO: loaded from: classes2.dex */
public final class C1526 extends SocketFactory {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SSLContext f5399;

    public C1526(SSLContext sSLContext) {
        this.f5399 = sSLContext;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return this.f5399.getSocketFactory().createSocket();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return this.f5399.getSocketFactory().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return this.f5399.getSocketFactory().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return this.f5399.getSocketFactory().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return this.f5399.getSocketFactory().createSocket(str, i, inetAddress, i2);
    }
}
