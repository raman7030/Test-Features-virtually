package p067l;

import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۬ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B2YE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14723 extends Reader implements Serializable {
    public static final long serialVersionUID = 3724187752191401220L;

    /* JADX INFO: renamed from: ۙ */
    public int f41971;

    /* JADX INFO: renamed from: ᩶ */
    public int f41972;

    /* JADX INFO: renamed from: ᩸ */
    public final CharSequence f41973;

    /* JADX INFO: renamed from: ᩹ */
    public final Integer f41974;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C14723(String str) {
        this.f41973 = str == null ? "" : str;
        this.f41974 = Integer.MAX_VALUE;
        this.f41972 = 0;
        this.f41971 = 0;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41972 = 0;
        this.f41971 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m33656() {
        int length = this.f41973.length();
        Integer num = this.f41974;
        return Math.min(length, num == null ? Integer.MAX_VALUE : num.intValue());
    }

    @Override // java.io.Reader
    public final void mark(int i) {
        this.f41971 = this.f41972;
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.f41972 >= m33656()) {
            return -1;
        }
        int i = this.f41972;
        this.f41972 = i + 1;
        return this.f41973.charAt(i);
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        if (this.f41972 >= m33656()) {
            return -1;
        }
        C12826.requireNonNull(cArr, "array");
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            StringBuilder sb = new StringBuilder("Array Size=");
            C7913.m18269(sb, cArr.length, ", offset=", i, ", length=");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        CharSequence charSequence = this.f41973;
        if (charSequence instanceof String) {
            int iMin = Math.min(i2, m33656() - this.f41972);
            int i3 = this.f41972;
            ((String) charSequence).getChars(i3, i3 + iMin, cArr, i);
            this.f41972 += iMin;
            return iMin;
        }
        if (charSequence instanceof StringBuilder) {
            int iMin2 = Math.min(i2, m33656() - this.f41972);
            int i4 = this.f41972;
            ((StringBuilder) charSequence).getChars(i4, i4 + iMin2, cArr, i);
            this.f41972 += iMin2;
            return iMin2;
        }
        if (charSequence instanceof StringBuffer) {
            int iMin3 = Math.min(i2, m33656() - this.f41972);
            int i5 = this.f41972;
            ((StringBuffer) charSequence).getChars(i5, i5 + iMin3, cArr, i);
            this.f41972 += iMin3;
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
        return this.f41972 < m33656();
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f41972 = this.f41971;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "Number of characters to skip is less than zero: "));
        }
        if (this.f41972 >= m33656()) {
            return 0L;
        }
        int iMin = (int) Math.min(m33656(), ((long) this.f41972) + j);
        int i = iMin - this.f41972;
        this.f41972 = iMin;
        return i;
    }

    public final String toString() {
        CharSequence charSequence = this.f41973;
        return charSequence.subSequence(Math.min(charSequence.length(), 0), m33656()).toString();
    }
}
