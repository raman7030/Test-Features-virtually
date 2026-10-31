package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.۟ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J76H */
/* JADX INFO: loaded from: classes3.dex */
public final class C7398 extends Writer {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13747 f22774 = new C13747();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11418 f22775;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f22776;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C7398(C11418 c11418) {
        this.f22775 = c11418;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        m19920((char) i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            m19920(cArr[i]);
            i++;
        }
    }

    @Override // java.io.Writer
    public final void write(String str) {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            m19920(str.charAt(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19921() {
        if (this.f22776 != this.f22775.length()) {
            throw f22774;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19920(char c) {
        int i = this.f22776;
        C11418 c11418 = this.f22775;
        if (i < c11418.length()) {
            int i2 = this.f22776;
            this.f22776 = i2 + 1;
            if (c11418.charAt(i2) == c) {
                return;
            }
        }
        throw f22774;
    }
}
