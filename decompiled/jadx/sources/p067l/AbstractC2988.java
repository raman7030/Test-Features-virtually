package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: JAH8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2988 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public final byte[] f5274;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f5275;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f5276;

    public AbstractC2988(OutputStream outputStream) {
        super(outputStream);
        this.f5274 = new byte[1];
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f5275 = true;
    }

    public void finish() {
        this.f5276 = true;
    }

    public final boolean isClosed() {
        return this.f5275;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5004() throws IOException {
        if (this.f5276) {
            throw new IOException("Stream has already been finished.");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m5005() {
        return this.f5276;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f5274;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }
}
