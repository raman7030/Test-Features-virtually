package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܿ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7RM */
/* JADX INFO: loaded from: classes4.dex */
public class C17680 extends Writer {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Writer f54128;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f54129;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f54130;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public C17680(Writer writer) {
        this(writer, 16);
    }

    public C17680(Writer writer, int i) {
        this.f54130 = 0;
        this.f54128 = writer;
        this.f54129 = new char[i];
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        if (this.f54130 > this.f54129.length - 1) {
            flush();
        }
        char[] cArr = this.f54129;
        int i2 = this.f54130;
        this.f54130 = i2 + 1;
        cArr[i2] = (char) i;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (this.f54130 > this.f54129.length - i2) {
            flush();
            if (i2 > this.f54129.length) {
                this.f54128.write(cArr, i, i2);
                return;
            }
        }
        System.arraycopy(cArr, i, this.f54129, this.f54130, i2);
        this.f54130 += i2;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        if (this.f54130 > this.f54129.length - i2) {
            flush();
            if (i2 > this.f54129.length) {
                this.f54128.write(str, i, i2);
                return;
            }
        }
        str.getChars(i, i + i2, this.f54129, this.f54130);
        this.f54130 += i2;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f54128.write(this.f54129, 0, this.f54130);
        this.f54130 = 0;
    }
}
