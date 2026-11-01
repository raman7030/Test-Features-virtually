package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes5.dex */
public final class C19397 extends FilterInputStream implements InterfaceC16534 {
    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C19397(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws C18726 {
        try {
            return super.read();
        } catch (IOException e) {
            throw new C18726(e);
        } catch (RuntimeException e2) {
            if (!C17384.m39538(e2)) {
                throw e2;
            }
            throw new C16043(e2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C18726 {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            throw new C18726(e);
        } catch (RuntimeException e2) {
            if (!C17384.m39538(e2)) {
                throw e2;
            }
            throw new C16043(e2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw new C18726(e);
        } catch (RuntimeException e2) {
            if (!C17384.m39538(e2)) {
                throw e2;
            }
            throw new C16043(e2);
        }
    }
}
