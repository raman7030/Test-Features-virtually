package l;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.֡᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes2.dex */
public final class C0688 extends Writer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f2626;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BufferedWriter f2627;

    public C0688(BufferedWriter bufferedWriter, String str) {
        this.f2627 = bufferedWriter;
        this.f2626 = str;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = i;
        while (true) {
            BufferedWriter bufferedWriter = this.f2627;
            if (i < i3) {
                if (cArr[i] == '\n') {
                    bufferedWriter.write(cArr, i4, i - i4);
                    bufferedWriter.write(this.f2626);
                    i4 = i + 1;
                }
                i++;
            } else {
                bufferedWriter.write(cArr, i4, i3 - i4);
                return;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        BufferedWriter bufferedWriter = this.f2627;
        if (i == 10) {
            bufferedWriter.write(this.f2626);
        } else {
            bufferedWriter.write(i);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f2627.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2627.close();
    }
}
