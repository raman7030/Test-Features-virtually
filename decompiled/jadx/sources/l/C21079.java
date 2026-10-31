package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21079 extends FilterInputStream implements InterfaceC14905 {
    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C21079(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws C6967 {
        try {
            return ((FilterInputStream) this).in.read();
        } catch (IOException e) {
            throw new C6967(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C6967 {
        try {
            return ((FilterInputStream) this).in.read(bArr, i, i2);
        } catch (IOException e) {
            throw new C6967(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws C6967 {
        try {
            ((FilterInputStream) this).in.close();
        } catch (IOException e) {
            throw new C6967(e);
        }
    }
}
