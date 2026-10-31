package l;

import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩷᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B6H */
/* JADX INFO: loaded from: classes4.dex */
public final class C21194 extends Writer {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PrintWriter f68299;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f68300;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f68301;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f68302;

    public C21194(PrintWriter printWriter, String str) {
        super(printWriter);
        this.f68300 = true;
        this.f68299 = printWriter;
        this.f68302 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f68299.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.f68299.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3];
            PrintWriter printWriter = this.f68299;
            if (c == '\n' || c == '\r') {
                this.f68300 = true;
            } else {
                if (this.f68300) {
                    int i4 = this.f68301;
                    String str = this.f68302;
                    if (str.charAt(i4) == ' ') {
                        printWriter.write("| ");
                    } else {
                        printWriter.write(str.charAt(this.f68301));
                        printWriter.write(32);
                    }
                    int i5 = this.f68301 + 1;
                    this.f68301 = i5;
                    if (i5 >= str.length()) {
                        this.f68301 = 0;
                    }
                }
                this.f68300 = false;
            }
            printWriter.write(cArr[i3]);
        }
    }
}
