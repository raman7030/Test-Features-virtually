package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4955 extends OutputStream {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FileOutputStream f15615;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f15616;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6841 f15617;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f15618;

    public C4955(File file, long j, C6841 c6841) {
        this.f15615 = new FileOutputStream(file);
        this.f15616 = j;
        this.f15617 = c6841;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        C6841 c6841 = this.f15617;
        AbstractC22967.m51107(c6841);
        long j = i2;
        if (j <= this.f15616 - this.f15618) {
            this.f15615.write(bArr, i, i2);
            this.f15618 += j;
            AbstractC22967.m51107(c6841);
            return;
        }
        throw new IOException("Image export exceeds byte limit");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C6841 c6841 = this.f15617;
        AbstractC22967.m51107(c6841);
        if (1 <= this.f15616 - this.f15618) {
            this.f15615.write(i);
            this.f15618++;
            AbstractC22967.m51107(c6841);
            return;
        }
        throw new IOException("Image export exceeds byte limit");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f15615.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15615.close();
    }
}
