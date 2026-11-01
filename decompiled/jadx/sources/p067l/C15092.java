package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: renamed from: l.۬᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D99I */
/* JADX INFO: loaded from: classes4.dex */
public final class C15092 implements InterfaceC7046 {

    /* JADX INFO: renamed from: ᩸ */
    public final Socket f43079;

    @Override // p067l.InterfaceC7046
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo16194() {
        return false;
    }

    @Override // p067l.InterfaceC7046
    /* JADX INFO: renamed from: ۨۧ */
    public final boolean mo16195() {
        return true;
    }

    public C15092(Socket socket) {
        this.f43079 = socket;
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

    @Override // p067l.InterfaceC7046
    public final InputStream getInputStream() {
        return this.f43079.getInputStream();
    }

    @Override // p067l.InterfaceC7046
    public final OutputStream getOutputStream() {
        return this.f43079.getOutputStream();
    }

    @Override // p067l.InterfaceC7046
    public final int getSendBufferSize() {
        return Math.min(this.f43079.getSendBufferSize(), 262144);
    }

    @Override // p067l.InterfaceC7046
    /* JADX INFO: renamed from: ᩴ֫ */
    public final int mo16196() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f43079.close();
    }
}
