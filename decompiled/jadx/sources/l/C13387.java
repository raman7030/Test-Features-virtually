package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: renamed from: l.۬᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D99I */
/* JADX INFO: loaded from: classes4.dex */
public final class C13387 implements InterfaceC4921 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Socket f40012;

    @Override // l.InterfaceC4921
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo14297() {
        return false;
    }

    @Override // l.InterfaceC4921
    /* JADX INFO: renamed from: ۨۧ */
    public final boolean mo14298() {
        return true;
    }

    public C13387(Socket socket) {
        this.f40012 = socket;
        try {
            socket.setTcpNoDelay(true);
        } catch (SocketException unused) {
        }
        try {
            int sendBufferSize = socket.getSendBufferSize();
            if (sendBufferSize < 1024 || sendBufferSize > 262144) {
                socket.setSendBufferSize(262144);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // l.InterfaceC4921
    public final InputStream getInputStream() {
        return this.f40012.getInputStream();
    }

    @Override // l.InterfaceC4921
    public final OutputStream getOutputStream() {
        return this.f40012.getOutputStream();
    }

    @Override // l.InterfaceC4921
    public final int getSendBufferSize() {
        return Math.min(this.f40012.getSendBufferSize(), 262144);
    }

    @Override // l.InterfaceC4921
    /* JADX INFO: renamed from: ᩴ֫ */
    public final int mo14299() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f40012.close();
    }
}
