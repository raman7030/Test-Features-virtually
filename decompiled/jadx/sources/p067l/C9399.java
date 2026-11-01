package p067l;

import java.io.Writer;

/* JADX INFO: renamed from: l.۟ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J76H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9399 extends Writer {

    /* JADX INFO: renamed from: ᩶ */
    public static final C15433 f25686 = new C15433();

    /* JADX INFO: renamed from: ᩸ */
    public final C13220 f25687;

    /* JADX INFO: renamed from: ᩹ */
    public int f25688;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C9399(C13220 c13220) {
        this.f25687 = c13220;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        m21893((char) i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            m21893(cArr[i]);
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
            m21893(str.charAt(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21894() {
        if (this.f25688 != this.f25687.length()) {
            throw f25686;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m21893(char c) {
        int i = this.f25688;
        C13220 c13220 = this.f25687;
        if (i < c13220.length()) {
            int i2 = this.f25688;
            this.f25688 = i2 + 1;
            if (c13220.charAt(i2) == c) {
                return;
            }
        }
        throw f25686;
    }
}
