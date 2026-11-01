package p067l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7078 extends OutputStream {

    /* JADX INFO: renamed from: ۙ */
    public final FileOutputStream f18449;

    /* JADX INFO: renamed from: ᩶ */
    public final long f18450;

    /* JADX INFO: renamed from: ᩸ */
    public final C8870 f18451;

    /* JADX INFO: renamed from: ᩹ */
    public long f18452;

    public C7078(File file, long j, C8870 c8870) {
        this.f18449 = new FileOutputStream(file);
        this.f18450 = j;
        this.f18451 = c8870;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        C8870 c8870 = this.f18451;
        AbstractC24196.m53499(c8870);
        long j = i2;
        if (j <= this.f18450 - this.f18452) {
            this.f18449.write(bArr, i, i2);
            this.f18452 += j;
            AbstractC24196.m53499(c8870);
            return;
        }
        throw new IOException("Image export exceeds byte limit");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C8870 c8870 = this.f18451;
        AbstractC24196.m53499(c8870);
        if (1 <= this.f18450 - this.f18452) {
            this.f18449.write(i);
            this.f18452++;
            AbstractC24196.m53499(c8870);
            return;
        }
        throw new IOException("Image export exceeds byte limit");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f18449.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18449.close();
    }
}
