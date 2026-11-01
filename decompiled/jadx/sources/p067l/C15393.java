package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J2K4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15393 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public static final C15393 f43980 = new C15393();

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("write(byte[], int, int) failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        throw new IOException("write(int) failed: stream is closed");
    }
}
