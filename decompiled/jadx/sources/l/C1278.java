package l;

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
public final class C1278 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21336 f4495;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public SocketFactory f4496;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4498;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5512 f4500;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BufferedOutputStream f4501;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Socket f4502;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2148 f4499 = C11321.m27961(C1278.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f4497 = new ReentrantReadWriteLock();

    public C1278(SocketFactory socketFactory, int i, C21336 c21336) {
        new C20725();
        this.f4498 = i;
        this.f4496 = socketFactory;
        this.f4495 = c21336;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4341(AbstractC0803 abstractC0803) {
        InterfaceC2148 interfaceC2148 = this.f4499;
        interfaceC2148.mo7095(abstractC0803, "Acquiring write lock to send packet << {} >>");
        if (!m4342()) {
            throw new C2380(String.format("Cannot write %s as transport is disconnected", abstractC0803));
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f4497;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                if (!m4342()) {
                    throw new C2380(String.format("Cannot write %s as transport got disconnected", abstractC0803));
                }
                interfaceC2148.mo7100(abstractC0803, "Writing packet {}");
                this.f4495.m48371().getClass();
                C0097 c0097 = new C0097(abstractC0803.mo3029());
                abstractC0803.mo2003(c0097);
                int iM26092 = c0097.m26092();
                this.f4501.write(0);
                this.f4501.write((byte) (iM26092 >> 16));
                this.f4501.write((byte) (iM26092 >> 8));
                this.f4501.write((byte) (iM26092 & 255));
                this.f4501.write(c0097.m26081(), c0097.m26083(), c0097.m26092());
                this.f4501.flush();
                interfaceC2148.mo7095(abstractC0803, "Packet {} sent, lock released.");
                reentrantReadWriteLock.writeLock().unlock();
            } catch (IOException e) {
                throw new C2380(e);
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4340(InetSocketAddress inetSocketAddress) {
        String hostString = inetSocketAddress.getHostString();
        Socket socketCreateSocket = this.f4496.createSocket(hostString, inetSocketAddress.getPort());
        this.f4502 = socketCreateSocket;
        socketCreateSocket.setSoTimeout(this.f4498);
        this.f4501 = new BufferedOutputStream(this.f4502.getOutputStream(), OpenAuthTask.OK);
        InputStream inputStream = this.f4502.getInputStream();
        C21336 c21336 = this.f4495;
        C5512 c5512 = new C5512(hostString, inputStream, c21336.m48369(), c21336.m48370());
        this.f4500 = c5512;
        c5512.m2342();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4339() {
        if (m4342()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f4497;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (m4342()) {
                    this.f4500.m2343();
                    if (this.f4502.getInputStream() != null) {
                        this.f4502.getInputStream().close();
                    }
                    BufferedOutputStream bufferedOutputStream = this.f4501;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                        this.f4501 = null;
                    }
                    Socket socket = this.f4502;
                    if (socket != null) {
                        socket.close();
                        this.f4502 = null;
                    }
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m4342() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f4497;
        reentrantReadWriteLock.readLock().lock();
        try {
            Socket socket = this.f4502;
            return (socket == null || !socket.isConnected() || this.f4502.isClosed()) ? false : true;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
