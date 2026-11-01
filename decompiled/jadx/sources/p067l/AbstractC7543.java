package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
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
public abstract class AbstractC7543 {

    /* JADX INFO: renamed from: ۢ */
    public static final SocketFactory f19785 = SocketFactory.getDefault();

    /* JADX INFO: renamed from: ᩷ */
    public static final ServerSocketFactory f19786 = ServerSocketFactory.getDefault();

    /* JADX INFO: renamed from: ֫ */
    public String f19787;

    /* JADX INFO: renamed from: ۜ */
    public int f19788 = 60000;

    /* JADX INFO: renamed from: ۧ */
    public InputStream f19789;

    /* JADX INFO: renamed from: ܳ */
    public Socket f19790;

    /* JADX INFO: renamed from: ܽ */
    public OutputStream f19791;

    /* JADX INFO: renamed from: ܿ */
    public SocketFactory f19792;

    /* JADX INFO: renamed from: ᩳ */
    public ServerSocketFactory f19793;

    /* JADX INFO: renamed from: ᩻ */
    public int f19794;

    /* JADX INFO: renamed from: ۠ */
    public abstract C2848 mo17448();

    public AbstractC7543() {
        Charset.defaultCharset();
        this.f19790 = null;
        this.f19787 = null;
        this.f19789 = null;
        this.f19791 = null;
        this.f19794 = 0;
        this.f19792 = f19785;
        this.f19793 = f19786;
    }

    /* JADX INFO: renamed from: ᩵ */
    public void mo15761() throws SocketException {
        m17440();
        this.f19789 = this.f19790.getInputStream();
        this.f19791 = this.f19790.getOutputStream();
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m17440() throws SocketException {
        this.f19790.setSoTimeout(this.f19794);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17442(int i, String str) throws IOException {
        this.f19787 = str;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
        Socket socketCreateSocket = this.f19792.createSocket();
        this.f19790 = socketCreateSocket;
        socketCreateSocket.connect(inetSocketAddress, this.f19788);
        mo15761();
    }

    /* JADX INFO: renamed from: ۡ */
    public void mo15741() {
        C23461.m52177(this.f19790);
        C23461.m52177((Closeable) this.f19789);
        C23461.m52177(this.f19791);
        this.f19790 = null;
        this.f19787 = null;
        this.f19789 = null;
        this.f19791 = null;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m17447() {
        mo17448().m4560();
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m17441() {
        mo17448().m4561();
    }

    /* JADX INFO: renamed from: ܶ */
    public final InetAddress m17449() {
        return this.f19790.getLocalAddress();
    }

    /* JADX INFO: renamed from: ᩸ */
    public final InetAddress m17452() {
        return this.f19790.getInetAddress();
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m17446() {
        if (m17450()) {
            try {
                if (this.f19790.getInetAddress() == null || this.f19790.getPort() == 0 || this.f19790.getRemoteSocketAddress() == null || this.f19790.isClosed() || this.f19790.isInputShutdown() || this.f19790.isOutputShutdown()) {
                    return false;
                }
                this.f19790.getInputStream();
                this.f19790.getOutputStream();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m17450() {
        Socket socket = this.f19790;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m17453() {
        this.f19788 = C0180b.f790j0;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m17451() {
        this.f19794 = 60000;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17444(C9554 c9554) {
        if (c9554 == null) {
            this.f19793 = f19786;
        } else {
            this.f19793 = c9554;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17443(C3818 c3818) {
        if (c3818 == null) {
            this.f19792 = f19785;
        } else {
            this.f19792 = c3818;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17445(Socket socket) {
        return socket != null && C12826.equals(socket.getInetAddress(), this.f19790.getInetAddress());
    }
}
