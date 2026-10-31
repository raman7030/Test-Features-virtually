package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes2.dex */
public final class C1351 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5585 f4903;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C1351(C5585 c5585) {
        this.f4903 = c5585;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (this.f4903.m15866(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f4903.m15866(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4903.m15867();
    }
}
