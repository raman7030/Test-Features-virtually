package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩳۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17808 extends Writer {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Writer f54440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f54443 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f54442 = 1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54441 = 0;

    public C17808(Writer writer) {
        this.f54440 = writer;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.f54440.write(i);
        this.f54441++;
        if (i == 10) {
            this.f54443++;
            this.f54442 = 1;
        } else {
            this.f54442++;
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        this.f54440.write(str, i, i2);
        this.f54441 += i2;
        for (int i3 = 0; i3 < i2; i3++) {
            if (str.charAt(i + i3) == '\n') {
                this.f54443++;
                this.f54442 = 1;
            } else {
                this.f54442++;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        this.f54440.write(cArr, i, i2);
        this.f54441 += i2;
        for (int i3 = 0; i3 < i2; i3++) {
            if (cArr[i + i3] == '\n') {
                this.f54443++;
                this.f54442 = 1;
            } else {
                this.f54442++;
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f54440.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f54440.close();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m41741() {
        return this.f54443;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41740() {
        return this.f54442;
    }

    public final int getPosition() {
        return this.f54441;
    }
}
