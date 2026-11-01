package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: l.֨ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9E6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3583 {

    /* JADX INFO: renamed from: ֫ */
    public final C22646 f7269;

    /* JADX INFO: renamed from: ۜ */
    public SocketFactory f7270;

    /* JADX INFO: renamed from: ܳ */
    public int f7272;

    /* JADX INFO: renamed from: ܿ */
    public C7607 f7274;

    /* JADX INFO: renamed from: ᩳ */
    public BufferedOutputStream f7275;

    /* JADX INFO: renamed from: ᩻ */
    public Socket f7276;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4410 f7273 = C13128.m30022(C3583.class);

    /* JADX INFO: renamed from: ۧ */
    public final ReentrantReadWriteLock f7271 = new ReentrantReadWriteLock();

    public C3583(SocketFactory socketFactory, int i, C22646 c22646) {
        new C22065();
        this.f7272 = i;
        this.f7270 = socketFactory;
        this.f7269 = c22646;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6587(AbstractC3131 abstractC3131) {
        InterfaceC4410 interfaceC4410 = this.f7273;
        interfaceC4410.mo9190(abstractC3131, "Acquiring write lock to send packet << {} >>");
        if (!m6588()) {
            throw new C4630(String.format("Cannot write %s as transport is disconnected", abstractC3131));
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f7271;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                if (!m6588()) {
                    throw new C4630(String.format("Cannot write %s as transport got disconnected", abstractC3131));
                }
                interfaceC4410.mo9195(abstractC3131, "Writing packet {}");
                this.f7269.m50706().getClass();
                C2460 c2460 = new C2460(abstractC3131.mo5342());
                abstractC3131.mo4380(c2460);
                int iM28117 = c2460.m28117();
                this.f7275.write(0);
                this.f7275.write((byte) (iM28117 >> 16));
                this.f7275.write((byte) (iM28117 >> 8));
                this.f7275.write((byte) (iM28117 & 255));
                this.f7275.write(c2460.m28106(), c2460.m28108(), c2460.m28117());
                this.f7275.flush();
                interfaceC4410.mo9190(abstractC3131, "Packet {} sent, lock released.");
                reentrantReadWriteLock.writeLock().unlock();
            } catch (IOException e) {
                throw new C4630(e);
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6586(InetSocketAddress inetSocketAddress) {
        String hostString = inetSocketAddress.getHostString();
        Socket socketCreateSocket = this.f7270.createSocket(hostString, inetSocketAddress.getPort());
        this.f7276 = socketCreateSocket;
        socketCreateSocket.setSoTimeout(this.f7272);
        this.f7275 = new BufferedOutputStream(this.f7276.getOutputStream(), OpenAuthTask.f239OK);
        InputStream inputStream = this.f7276.getInputStream();
        C22646 c22646 = this.f7269;
        C7607 c7607 = new C7607(hostString, inputStream, c22646.m50704(), c22646.m50705());
        this.f7274 = c7607;
        c7607.m4713();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6585() {
        if (m6588()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f7271;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (m6588()) {
                    this.f7274.m4714();
                    if (this.f7276.getInputStream() != null) {
                        this.f7276.getInputStream().close();
                    }
                    BufferedOutputStream bufferedOutputStream = this.f7275;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                        this.f7275 = null;
                    }
                    Socket socket = this.f7276;
                    if (socket != null) {
                        socket.close();
                        this.f7276 = null;
                    }
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m6588() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f7271;
        reentrantReadWriteLock.readLock().lock();
        try {
            Socket socket = this.f7276;
            return (socket == null || !socket.isConnected() || this.f7276.isClosed()) ? false : true;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
