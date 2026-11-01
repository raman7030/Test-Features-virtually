package p067l;

import java.io.PrintStream;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۜ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B6H */
/* JADX INFO: loaded from: classes2.dex */
public final class C9100 extends Writer {

    /* JADX INFO: renamed from: ᩸ */
    public final PrintStream f24659;

    public C9100(PrintStream printStream) {
        this.f24659 = printStream;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24659.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.f24659.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        PrintStream printStream = this.f24659;
        if (i == 0 && i2 == cArr.length) {
            printStream.print(cArr);
        } else {
            printStream.print(new String(cArr, i, i2));
        }
    }
}
