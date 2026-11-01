package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4534 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7216 f10159;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C24618 f10160;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C4534(C24618 c24618, C7216 c7216) {
        this.f10160 = c24618;
        this.f10159 = c7216;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f10160.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f10160.read(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10159.close();
    }
}
