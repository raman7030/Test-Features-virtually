package p067l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩳۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C19293 extends Writer {

    /* JADX INFO: renamed from: ۙ */
    public final Writer f57636;

    /* JADX INFO: renamed from: ᩹ */
    public int f57639 = 1;

    /* JADX INFO: renamed from: ᩸ */
    public int f57638 = 1;

    /* JADX INFO: renamed from: ᩶ */
    public int f57637 = 0;

    public C19293(Writer writer) {
        this.f57636 = writer;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.f57636.write(i);
        this.f57637++;
        if (i == 10) {
            this.f57639++;
            this.f57638 = 1;
        } else {
            this.f57638++;
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        this.f57636.write(str, i, i2);
        this.f57637 += i2;
        for (int i3 = 0; i3 < i2; i3++) {
            if (str.charAt(i + i3) == '\n') {
                this.f57639++;
                this.f57638 = 1;
            } else {
                this.f57638++;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        this.f57636.write(cArr, i, i2);
        this.f57637 += i2;
        for (int i3 = 0; i3 < i2; i3++) {
            if (cArr[i + i3] == '\n') {
                this.f57639++;
                this.f57638 = 1;
            } else {
                this.f57638++;
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f57636.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f57636.close();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43987() {
        return this.f57639;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43986() {
        return this.f57638;
    }

    public final int getPosition() {
        return this.f57637;
    }
}
