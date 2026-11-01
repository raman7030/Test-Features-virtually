package p067l;

import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩷᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B6H */
/* JADX INFO: loaded from: classes4.dex */
public final class C22512 extends Writer {

    /* JADX INFO: renamed from: ۙ */
    public PrintWriter f70982;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f70983;

    /* JADX INFO: renamed from: ᩸ */
    public int f70984;

    /* JADX INFO: renamed from: ᩹ */
    public final String f70985;

    public C22512(PrintWriter printWriter, String str) {
        super(printWriter);
        this.f70983 = true;
        this.f70982 = printWriter;
        this.f70985 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f70982.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.f70982.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3];
            PrintWriter printWriter = this.f70982;
            if (c == '\n' || c == '\r') {
                this.f70983 = true;
            } else {
                if (this.f70983) {
                    int i4 = this.f70984;
                    String str = this.f70985;
                    if (str.charAt(i4) == ' ') {
                        printWriter.write("| ");
                    } else {
                        printWriter.write(str.charAt(this.f70984));
                        printWriter.write(32);
                    }
                    int i5 = this.f70984 + 1;
                    this.f70984 = i5;
                    if (i5 >= str.length()) {
                        this.f70984 = 0;
                    }
                }
                this.f70983 = false;
            }
            printWriter.write(cArr[i3]);
        }
    }
}
