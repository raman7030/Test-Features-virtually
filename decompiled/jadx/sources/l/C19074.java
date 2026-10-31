package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4R6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19074 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f60060;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f60061;

    public C19074(BufferedOutputStream bufferedOutputStream, BufferedOutputStream bufferedOutputStream2) {
        this.f60060 = bufferedOutputStream;
        this.f60061 = bufferedOutputStream2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f60060.write(i);
        this.f60061.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f60060.write(bArr, i, i2);
        this.f60061.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f60060.flush();
        this.f60061.flush();
    }
}
