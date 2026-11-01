package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

/* JADX INFO: renamed from: l.ۧܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L7F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12927 extends OutputStream {

    /* JADX INFO: renamed from: ۗ */
    public boolean f36339;

    /* JADX INFO: renamed from: ۙ */
    public boolean f36340;

    /* JADX INFO: renamed from: ᩶ */
    public final Socket f36341;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f36342;

    /* JADX INFO: renamed from: ᩹ */
    public final OutputStream f36343;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f36342) {
            return;
        }
        this.f36342 = true;
        try {
            this.f36343.flush();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        if (e == null) {
            try {
                if (m29605()) {
                    this.f36340 = true;
                } else if (!this.f36339) {
                    this.f36339 = true;
                    this.f36341.close();
                }
            } catch (IOException e2) {
                e = e2;
            }
        } else {
            try {
                if (!this.f36339) {
                    this.f36339 = true;
                    this.f36341.close();
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

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m29606() {
        if (this.f36340) {
            this.f36340 = false;
            if (!this.f36339) {
                this.f36339 = true;
                this.f36341.close();
            }
        }
    }

    public C12927(Socket socket, OutputStream outputStream) {
        this.f36341 = socket;
        this.f36343 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f36343.write(i);
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
            this.f36343.write(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f36343.flush();
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m29605() {
        Socket socket = this.f36341;
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
