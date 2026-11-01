package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۨܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4GJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13526 extends OutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public OutputStream f38046;

    /* JADX INFO: renamed from: ᩹ */
    public CRC32 f38048 = new CRC32();

    /* JADX INFO: renamed from: ᩸ */
    public long f38047 = 0;

    public C13526(OutputStream outputStream) {
        this.f38046 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f38046.write(bArr, i, i2);
        this.f38048.update(bArr, i, i2);
        this.f38047 += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f38046.write(i);
        this.f38048.update(i);
        this.f38047++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m30786() {
        return this.f38047;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m30787() {
        return (int) this.f38048.getValue();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38046.close();
    }
}
