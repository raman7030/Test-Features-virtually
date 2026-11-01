package p067l;

import java.io.Writer;

/* JADX INFO: renamed from: l.֡᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G5WC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2990 extends Writer {

    /* JADX INFO: renamed from: ᩸ */
    public StringBuilder f5278 = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m5014();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m5014();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m5014();
            } else {
                this.f5278.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5014() {
        StringBuilder sb = this.f5278;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }
}
