package l;

import java.io.PrintStream;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۜ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B6H */
/* JADX INFO: loaded from: classes2.dex */
public final class C7082 extends Writer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final PrintStream f21778;

    public C7082(PrintStream printStream) {
        this.f21778 = printStream;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21778.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.f21778.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        PrintStream printStream = this.f21778;
        if (i == 0 && i2 == cArr.length) {
            printStream.print(cArr);
        } else {
            printStream.print(new String(cArr, i, i2));
        }
    }
}
