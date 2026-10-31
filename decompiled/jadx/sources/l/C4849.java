package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.ۙ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4849 extends Writer {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String f15316 = System.getProperty("line.separator");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f15317;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f15319;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final char[] f15320 = new char[16];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f15318 = 0;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    public C4849(StringBuilder sb) {
        this.f15317 = sb;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        StringBuilder sb = this.f15317;
        if (i == 10) {
            sb.append(f15316);
            this.f15319 = true;
            return;
        }
        if (this.f15319) {
            for (int i2 = 0; i2 < this.f15318; i2++) {
                sb.append(' ');
            }
        }
        this.f15319 = false;
        sb.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        for (char c : cArr) {
            write(c);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            write(cArr[i]);
            i++;
        }
    }

    @Override // java.io.Writer
    public final void write(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            write(str.charAt(i));
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            write(str.charAt(i));
            i++;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        write(charSequence.toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        write(charSequence.subSequence(i, i2).toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        write(c);
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14117() {
        int i = this.f15318 + 4;
        this.f15318 = i;
        if (i < 0) {
            this.f15318 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14114() {
        int i = this.f15318 - 4;
        this.f15318 = i;
        if (i < 0) {
            this.f15318 = 0;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14116(long j) {
        char[] cArr;
        int i;
        int i2 = 0;
        do {
            int i3 = (int) (15 & j);
            cArr = this.f15320;
            if (i3 < 10) {
                i = i2 + 1;
                cArr[i2] = (char) (i3 + 48);
            } else {
                i = i2 + 1;
                cArr[i2] = (char) (i3 + 87);
            }
            i2 = i;
            j >>>= 4;
        } while (j != 0);
        while (i2 > 0) {
            i2--;
            write(cArr[i2]);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14115(int i) {
        int i2;
        char[] cArr;
        int i3 = 0;
        boolean z = i < 0;
        while (true) {
            i2 = i3 + 1;
            cArr = this.f15320;
            cArr[i3] = (char) ((i % 10) + 48);
            i /= 10;
            if (i == 0) {
                break;
            } else {
                i3 = i2;
            }
        }
        if (z) {
            write(45);
        }
        while (i2 > 0) {
            i2--;
            write(cArr[i2]);
        }
    }
}
