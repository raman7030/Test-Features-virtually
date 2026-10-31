package l;

import com.alipay.sdk.m.o.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.Charset;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.ۚܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I59O */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5445 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final SocketFactory f16944 = SocketFactory.getDefault();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ServerSocketFactory f16945 = ServerSocketFactory.getDefault();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f16946;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f16947 = 60000;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InputStream f16948;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Socket f16949;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public OutputStream f16950;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public SocketFactory f16951;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ServerSocketFactory f16952;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f16953;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public abstract C0505 mo15537();

    public AbstractC5445() {
        Charset.defaultCharset();
        this.f16949 = null;
        this.f16946 = null;
        this.f16948 = null;
        this.f16950 = null;
        this.f16953 = 0;
        this.f16951 = f16944;
        this.f16952 = f16945;
    }

    /* JADX INFO: renamed from: ᩵ */
    public void mo13881() throws SocketException {
        m15529();
        this.f16948 = this.f16949.getInputStream();
        this.f16950 = this.f16949.getOutputStream();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m15529() throws SocketException {
        this.f16949.setSoTimeout(this.f16953);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15531(int i, String str) throws IOException {
        this.f16946 = str;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
        Socket socketCreateSocket = this.f16951.createSocket();
        this.f16949 = socketCreateSocket;
        socketCreateSocket.connect(inetSocketAddress, this.f16947);
        mo13881();
    }

    /* JADX INFO: renamed from: ۡ */
    public void mo13861() {
        C22194.m49850(this.f16949);
        C22194.m49850((Closeable) this.f16948);
        C22194.m49850(this.f16950);
        this.f16949 = null;
        this.f16946 = null;
        this.f16948 = null;
        this.f16950 = null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m15536() {
        mo15537().m2193();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m15530() {
        mo15537().m2194();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InetAddress m15538() {
        return this.f16949.getLocalAddress();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InetAddress m15541() {
        return this.f16949.getInetAddress();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m15535() {
        if (m15539()) {
            try {
                if (this.f16949.getInetAddress() == null || this.f16949.getPort() == 0 || this.f16949.getRemoteSocketAddress() == null || this.f16949.isClosed() || this.f16949.isInputShutdown() || this.f16949.isOutputShutdown()) {
                    return false;
                }
                this.f16949.getInputStream();
                this.f16949.getOutputStream();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m15539() {
        Socket socket = this.f16949;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m15542() {
        this.f16947 = b.j0;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m15540() {
        this.f16953 = 60000;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15533(C7561 c7561) {
        if (c7561 == null) {
            this.f16952 = f16945;
        } else {
            this.f16952 = c7561;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15532(C1526 c1526) {
        if (c1526 == null) {
            this.f16951 = f16944;
        } else {
            this.f16951 = c1526;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15534(Socket socket) {
        return socket != null && C11003.equals(socket.getInetAddress(), this.f16949.getInetAddress());
    }
}
