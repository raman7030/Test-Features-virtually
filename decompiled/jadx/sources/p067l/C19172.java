package p067l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܿ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7RM */
/* JADX INFO: loaded from: classes4.dex */
public class C19172 extends Writer {

    /* JADX INFO: renamed from: ᩶ */
    public final Writer f57321;

    /* JADX INFO: renamed from: ᩸ */
    public final char[] f57322;

    /* JADX INFO: renamed from: ᩹ */
    public int f57323;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public C19172(Writer writer) {
        this(writer, 16);
    }

    public C19172(Writer writer, int i) {
        this.f57323 = 0;
        this.f57321 = writer;
        this.f57322 = new char[i];
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        if (this.f57323 > this.f57322.length - 1) {
            flush();
        }
        char[] cArr = this.f57322;
        int i2 = this.f57323;
        this.f57323 = i2 + 1;
        cArr[i2] = (char) i;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (this.f57323 > this.f57322.length - i2) {
            flush();
            if (i2 > this.f57322.length) {
                this.f57321.write(cArr, i, i2);
                return;
            }
        }
        System.arraycopy(cArr, i, this.f57322, this.f57323, i2);
        this.f57323 += i2;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        if (this.f57323 > this.f57322.length - i2) {
            flush();
            if (i2 > this.f57322.length) {
                this.f57321.write(str, i, i2);
                return;
            }
        }
        str.getChars(i, i + i2, this.f57322, this.f57323);
        this.f57323 += i2;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f57321.write(this.f57322, 0, this.f57323);
        this.f57323 = 0;
    }
}
