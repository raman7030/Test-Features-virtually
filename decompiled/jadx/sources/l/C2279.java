package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2279 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5101 f7372;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23411 f7373;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C2279(C23411 c23411, C5101 c5101) {
        this.f7373 = c23411;
        this.f7372 = c5101;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f7373.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f7373.read(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7372.close();
    }
}
