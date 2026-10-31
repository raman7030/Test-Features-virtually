package l;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

/* JADX INFO: renamed from: l.ۧܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L7F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11109 extends OutputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f33339;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f33340;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Socket f33341;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f33342;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final OutputStream f33343;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f33342) {
            return;
        }
        this.f33342 = true;
        try {
            this.f33343.flush();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        if (e == null) {
            try {
                if (m27543()) {
                    this.f33340 = true;
                } else if (!this.f33339) {
                    this.f33339 = true;
                    this.f33341.close();
                }
            } catch (IOException e2) {
                e = e2;
            }
        } else {
            try {
                if (!this.f33339) {
                    this.f33339 = true;
                    this.f33341.close();
                }
            } catch (IOException e3) {
                e.addSuppressed(e3);
            }
        }
        if (e == null) {
        } else {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m27544() {
        if (this.f33340) {
            this.f33340 = false;
            if (!this.f33339) {
                this.f33339 = true;
                this.f33341.close();
            }
        }
    }

    public C11109(Socket socket, OutputStream outputStream) {
        this.f33341 = socket;
        this.f33343 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f33343.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i > bArr.length || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, 16384);
            this.f33343.write(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f33343.flush();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m27543() {
        Socket socket = this.f33341;
        try {
            String str = "engine";
            for (Class<?> superclass = socket.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(socket);
                    Method method = obj.getClass().getMethod("closeOutbound", null);
                    method.invoke(obj, null);
                    for (Class<?> superclass2 = socket.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                        try {
                            Method declaredMethod = superclass2.getDeclaredMethod("drainOutgoingQueue", null);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(socket, null);
                            method.invoke(obj, null);
                            return true;
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    throw new NoSuchMethodException("drainOutgoingQueue");
                } catch (NoSuchFieldException unused2) {
                }
            }
            throw new NoSuchFieldException(str);
        } catch (ReflectiveOperationException unused3) {
            return false;
        }
    }
}
