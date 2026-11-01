package p067l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4R6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20497 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final BufferedOutputStream f63294;

    /* JADX INFO: renamed from: ᩹ */
    public final BufferedOutputStream f63295;

    public C20497(BufferedOutputStream bufferedOutputStream, BufferedOutputStream bufferedOutputStream2) {
        this.f63294 = bufferedOutputStream;
        this.f63295 = bufferedOutputStream2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f63294.write(i);
        this.f63295.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f63294.write(bArr, i, i2);
        this.f63295.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f63294.flush();
        this.f63295.flush();
    }
}
