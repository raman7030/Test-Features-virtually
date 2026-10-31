package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩸ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97MC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21393 implements CharSequence, GetChars, Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C21393 f68892 = new C21393("");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f68893;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f68894;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f68895 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f68896;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C21393 c21393 = (C21393) obj;
        int i = c21393.f68896;
        int i2 = this.f68896;
        int iMin = Math.min(i2, i);
        for (int i3 = 0; i3 < iMin; i3++) {
            char c = this.f68893[this.f68894 + i3];
            char c2 = c21393.f68893[c21393.f68894 + i3];
            if (c != c2) {
                return c - c2;
            }
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21393 m48474(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        if (str.length() == 0) {
            return f68892;
        }
        return new C21393(str.toString());
    }

    public C21393(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        char[] charArray = str.toCharArray();
        this.f68893 = charArray;
        this.f68894 = 0;
        this.f68896 = charArray.length;
    }

    public C21393(char[] cArr, int i, int i2) {
        this.f68893 = cArr;
        this.f68894 = i;
        this.f68896 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f68896;
    }

    public final boolean isEmpty() {
        return this.f68896 == 0;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f68896;
        if (i < 0 || i >= i2) {
            throw new StringIndexOutOfBoundsException(C18307.m42646("Index: ", i, i2, ", Length: "));
        }
        return this.f68893[this.f68894 + i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21393 m48476(int i) {
        return m48477(i, this.f68896);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21393 m48477(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(C19370.m44628(i, "Begin index: "));
        }
        if (i2 > this.f68896) {
            throw new StringIndexOutOfBoundsException(C19370.m44628(i2, "End index: "));
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(C18307.m42646("Begin index: ", i, i2, " > End index: "));
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            return f68892;
        }
        return new C21393(this.f68893, this.f68894 + i, i3);
    }

    public final int indexOf(int i) {
        if (i < 0) {
            i = 0;
        }
        while (i < this.f68896) {
            if (this.f68893[this.f68894 + i] == '/') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21393)) {
            return false;
        }
        C21393 c21393 = (C21393) obj;
        int i = c21393.f68896;
        int i2 = this.f68896;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f68893[this.f68894 + i3] != c21393.f68893[c21393.f68894 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48475(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length();
            int i = this.f68896;
            if (length == i) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.f68893[this.f68894 + i2] != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f68895 == -1) {
            int i = 0;
            for (int i2 = 0; i2 < this.f68896; i2++) {
                i = (i * 31) + this.f68893[this.f68894 + i2];
            }
            this.f68895 = i;
        }
        return this.f68895;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (cArr == null) {
            throw new NullPointerException("Destination array cannot be null");
        }
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(C19370.m44628(i, "srcBegin: "));
        }
        if (i2 > this.f68896) {
            throw new StringIndexOutOfBoundsException(C19370.m44628(i2, "srcEnd: "));
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(C18307.m42646("srcBegin: ", i, i2, " > srcEnd: "));
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(C19370.m44628(i3, "dstBegin: "));
        }
        int i4 = i2 - i;
        int i5 = i3 + i4;
        if (i5 <= cArr.length) {
            System.arraycopy(this.f68893, this.f68894 + i, cArr, i3, i4);
        } else {
            StringBuilder sbM32308 = C13325.m32308(i5, "dstBegin + copyLength: ", " > dst.length: ");
            sbM32308.append(cArr.length);
            throw new ArrayIndexOutOfBoundsException(sbM32308.toString());
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return m48477(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f68893, this.f68894, this.f68896);
    }
}
