package p067l;

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
public final class C15052 implements InterfaceC7046 {

    /* JADX INFO: renamed from: ᩶ */
    public static final AtomicInteger f42988 = new AtomicInteger(16777215 & ((int) (System.currentTimeMillis() / 100)));

    /* JADX INFO: renamed from: ᩸ */
    public final LocalSocket f42989;

    /* JADX INFO: renamed from: ᩹ */
    public final int f42990;

    @Override // p067l.InterfaceC7046
    /* JADX INFO: renamed from: ۨۧ */
    public final boolean mo16195() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34420() {
        return C7050.m16234() + "-" + f42988.getAndIncrement();
    }

    public C15052(LocalSocket localSocket) {
        this.f42989 = localSocket;
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
        this.f42990 = i;
    }

    @Override // p067l.InterfaceC7046
    public final InputStream getInputStream() {
        return this.f42989.getInputStream();
    }

    @Override // p067l.InterfaceC7046
    public final OutputStream getOutputStream() {
        return this.f42989.getOutputStream();
    }

    @Override // p067l.InterfaceC7046
    public final int getSendBufferSize() {
        return Math.min(this.f42989.getSendBufferSize(), 262144);
    }

    @Override // p067l.InterfaceC7046
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo16194() {
        return this.f42990 >= 0;
    }

    @Override // p067l.InterfaceC7046
    /* JADX INFO: renamed from: ᩴ֫ */
    public final int mo16196() {
        return this.f42990;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42989.close();
    }
}
