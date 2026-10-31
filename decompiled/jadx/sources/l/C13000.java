package l;

import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۬ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B2YE */
/* JADX INFO: loaded from: classes3.dex */
public final class C13000 extends Reader implements Serializable {
    public static final long serialVersionUID = 3724187752191401220L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38924;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38925;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f38926;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Integer f38927;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C13000(String str) {
        this.f38926 = str == null ? "" : str;
        this.f38927 = Integer.MAX_VALUE;
        this.f38925 = 0;
        this.f38924 = 0;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38925 = 0;
        this.f38924 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m31571() {
        int length = this.f38926.length();
        Integer num = this.f38927;
        return Math.min(length, num == null ? Integer.MAX_VALUE : num.intValue());
    }

    @Override // java.io.Reader
    public final void mark(int i) {
        this.f38924 = this.f38925;
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.f38925 >= m31571()) {
            return -1;
        }
        int i = this.f38925;
        this.f38925 = i + 1;
        return this.f38926.charAt(i);
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        if (this.f38925 >= m31571()) {
            return -1;
        }
        C11003.requireNonNull(cArr, "array");
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            StringBuilder sb = new StringBuilder("Array Size=");
            C5834.m16344(sb, cArr.length, ", offset=", i, ", length=");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        CharSequence charSequence = this.f38926;
        if (charSequence instanceof String) {
            int iMin = Math.min(i2, m31571() - this.f38925);
            int i3 = this.f38925;
            ((String) charSequence).getChars(i3, i3 + iMin, cArr, i);
            this.f38925 += iMin;
            return iMin;
        }
        if (charSequence instanceof StringBuilder) {
            int iMin2 = Math.min(i2, m31571() - this.f38925);
            int i4 = this.f38925;
            ((StringBuilder) charSequence).getChars(i4, i4 + iMin2, cArr, i);
            this.f38925 += iMin2;
            return iMin2;
        }
        if (charSequence instanceof StringBuffer) {
            int iMin3 = Math.min(i2, m31571() - this.f38925);
            int i5 = this.f38925;
            ((StringBuffer) charSequence).getChars(i5, i5 + iMin3, cArr, i);
            this.f38925 += iMin3;
            return iMin3;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = read();
            if (i8 == -1) {
                break;
            }
            cArr[i + i7] = (char) i8;
            i6++;
        }
        return i6;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        return this.f38925 < m31571();
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f38925 = this.f38924;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "Number of characters to skip is less than zero: "));
        }
        if (this.f38925 >= m31571()) {
            return 0L;
        }
        int iMin = (int) Math.min(m31571(), ((long) this.f38925) + j);
        int i = iMin - this.f38925;
        this.f38925 = iMin;
        return i;
    }

    public final String toString() {
        CharSequence charSequence = this.f38926;
        return charSequence.subSequence(Math.min(charSequence.length(), 0), m31571()).toString();
    }
}
