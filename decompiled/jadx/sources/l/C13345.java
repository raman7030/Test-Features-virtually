package l;

import android.net.LocalSocket;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17F */
/* JADX INFO: loaded from: classes4.dex */
public final class C13345 implements InterfaceC4921 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f39922 = new AtomicInteger(16777215 & ((int) (System.currentTimeMillis() / 100)));

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LocalSocket f39923;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f39924;

    @Override // l.InterfaceC4921
    /* JADX INFO: renamed from: ۨۧ */
    public final boolean mo14298() {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32319() {
        return C4925.m14337() + "-" + f39922.getAndIncrement();
    }

    public C13345(LocalSocket localSocket) {
        this.f39923 = localSocket;
        try {
            int sendBufferSize = localSocket.getSendBufferSize();
            if (sendBufferSize < 1024 || sendBufferSize > 262144) {
                localSocket.setSendBufferSize(262144);
            }
        } catch (Exception unused) {
        }
        FileDescriptor fileDescriptor = localSocket.getFileDescriptor();
        int i = -1;
        if (fileDescriptor != null) {
            try {
                Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                i = declaredField.getInt(fileDescriptor);
            } catch (Exception unused2) {
            }
        }
        this.f39924 = i;
    }

    @Override // l.InterfaceC4921
    public final InputStream getInputStream() {
        return this.f39923.getInputStream();
    }

    @Override // l.InterfaceC4921
    public final OutputStream getOutputStream() {
        return this.f39923.getOutputStream();
    }

    @Override // l.InterfaceC4921
    public final int getSendBufferSize() {
        return Math.min(this.f39923.getSendBufferSize(), 262144);
    }

    @Override // l.InterfaceC4921
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo14297() {
        return this.f39924 >= 0;
    }

    @Override // l.InterfaceC4921
    /* JADX INFO: renamed from: ᩴ֫ */
    public final int mo14299() {
        return this.f39924;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39923.close();
    }
}
