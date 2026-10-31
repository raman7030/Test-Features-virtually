package l;

import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11894 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Closeable f35521;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11894(InputStream inputStream, Closeable closeable) {
        super(inputStream);
        this.f35521 = closeable;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return ((FilterInputStream) this).in.read(bArr, i, i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f35521.close();
    }
}
