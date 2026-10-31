package l;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: renamed from: l.ܺ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15582 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36751(InetAddress inetAddress, InetAddress inetAddress2) {
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        try {
            datagramSocket.setBroadcast(true);
            datagramSocket.bind(new InetSocketAddress(inetAddress, 0));
            datagramSocket.send(new DatagramPacket(C19112.f60203, C19112.f60203.length, inetAddress2, 9));
            datagramSocket.close();
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
