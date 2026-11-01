package p067l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۗ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4ZE */
/* JADX INFO: loaded from: classes2.dex */
public class C5636 extends Writer {

    /* JADX INFO: renamed from: ۗ */
    public static final String f13665 = System.getProperty("line.separator");

    /* JADX INFO: renamed from: ۙ */
    public final Writer f13666;

    /* JADX INFO: renamed from: ᩹ */
    public final char[] f13669 = new char[24];

    /* JADX INFO: renamed from: ᩶ */
    public int f13667 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f13668 = true;

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        append(charSequence, i, i2);
        return this;
    }

    public C5636(Writer writer) {
        this.f13666 = writer;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo12538() throws IOException {
        for (int i = 0; i < this.f13667; i++) {
            this.f13666.write(32);
        }
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        Writer writer = this.f13666;
        if (i == 10) {
            writer.write(f13665);
            this.f13668 = true;
        } else {
            if (this.f13668) {
                mo12538();
            }
            this.f13668 = false;
            writer.write(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12531(char[] cArr, int i, int i2) throws IOException {
        if (this.f13668 && i2 > 0) {
            mo12538();
            this.f13668 = false;
        }
        this.f13666.write(cArr, i, i2);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            if (cArr[i] == '\n') {
                m12531(cArr, i4, i - i4);
                this.f13666.write(f13665);
                this.f13668 = true;
                i4 = i + 1;
                i = i4;
            } else {
                i++;
            }
        }
        m12531(cArr, i4, i - i4);
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12533(EnumC3167 enumC3167) throws IOException {
        write(enumC3167.f6089);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            i = str.indexOf(10, i4);
            Writer writer = this.f13666;
            if (i == -1 || i >= i3) {
                int i5 = i3 - i4;
                if (this.f13668 && i5 > 0) {
                    mo12538();
                    this.f13668 = false;
                }
                writer.write(str, i4, i5);
                return;
            }
            int i6 = i - i4;
            if (this.f13668 && i6 > 0) {
                mo12538();
                this.f13668 = false;
            }
            writer.write(str, i4, i6);
            writer.write(f13665);
            this.f13668 = true;
            i4 = i + 1;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        write(charSequence.toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        write(charSequence.subSequence(i, i2).toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f13666.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13666.close();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12536() {
        int i = this.f13667 + 4;
        this.f13667 = i;
        if (i < 0) {
            this.f13667 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12532() {
        int i = this.f13667 - 4;
        this.f13667 = i;
        if (i < 0) {
            this.f13667 = 0;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo12535(long j) throws IOException {
        char[] cArr;
        int i;
        int i2 = 23;
        do {
            int i3 = (int) (15 & j);
            cArr = this.f13669;
            if (i3 < 10) {
                i = i2 - 1;
                cArr[i2] = (char) (i3 + 48);
            } else {
                i = i2 - 1;
                cArr[i2] = (char) (i3 + 87);
            }
            i2 = i;
            j >>>= 4;
        } while (j != 0);
        int i4 = i2 + 1;
        m12531(cArr, i4, 24 - i4);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12537(int i) throws IOException {
        if (i >= 0) {
            m12534(i);
            return;
        }
        long j = ((long) i) & 4294967295L;
        int i2 = 23;
        if (j < 0) {
            j *= -1;
            write(45);
        }
        while (true) {
            int i3 = i2 - 1;
            char[] cArr = this.f13669;
            cArr[i2] = (char) ((j % 10) + 48);
            j /= 10;
            if (j == 0) {
                m12531(cArr, i2, 24 - i2);
                return;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12534(int i) throws IOException {
        int i2 = 15;
        if (i < 0) {
            i *= -1;
            write(45);
        }
        while (true) {
            int i3 = i2 - 1;
            char[] cArr = this.f13669;
            cArr[i2] = (char) ((i % 10) + 48);
            i /= 10;
            if (i == 0) {
                m12531(cArr, i2, 16 - i2);
                return;
            }
            i2 = i3;
        }
    }
}
