package p067l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩸ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97MC */
/* JADX INFO: loaded from: classes4.dex */
public final class C22700 implements CharSequence, GetChars, Comparable {

    /* JADX INFO: renamed from: ۗ */
    public static final C22700 f71587 = new C22700("");

    /* JADX INFO: renamed from: ۙ */
    public final char[] f71588;

    /* JADX INFO: renamed from: ᩶ */
    public final int f71589;

    /* JADX INFO: renamed from: ᩸ */
    public int f71590 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public final int f71591;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C22700 c22700 = (C22700) obj;
        int i = c22700.f71591;
        int i2 = this.f71591;
        int iMin = Math.min(i2, i);
        for (int i3 = 0; i3 < iMin; i3++) {
            char c = this.f71588[this.f71589 + i3];
            char c2 = c22700.f71588[c22700.f71589 + i3];
            if (c != c2) {
                return c - c2;
            }
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C22700 m50810(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        if (str.length() == 0) {
            return f71587;
        }
        return new C22700(str.toString());
    }

    public C22700(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        char[] charArray = str.toCharArray();
        this.f71588 = charArray;
        this.f71589 = 0;
        this.f71591 = charArray.length;
    }

    public C22700(char[] cArr, int i, int i2) {
        this.f71588 = cArr;
        this.f71589 = i;
        this.f71591 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f71591;
    }

    public final boolean isEmpty() {
        return this.f71591 == 0;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f71591;
        if (i < 0 || i >= i2) {
            throw new StringIndexOutOfBoundsException(C19768.m44907("Index: ", i, i2, ", Length: "));
        }
        return this.f71588[this.f71589 + i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22700 m50812(int i) {
        return m50813(i, this.f71591);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22700 m50813(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(C20778.m46922(i, "Begin index: "));
        }
        if (i2 > this.f71591) {
            throw new StringIndexOutOfBoundsException(C20778.m46922(i2, "End index: "));
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(C19768.m44907("Begin index: ", i, i2, " > End index: "));
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            return f71587;
        }
        return new C22700(this.f71588, this.f71589 + i, i3);
    }

    public final int indexOf(int i) {
        if (i < 0) {
            i = 0;
        }
        while (i < this.f71591) {
            if (this.f71588[this.f71589 + i] == '/') {
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
        if (!(obj instanceof C22700)) {
            return false;
        }
        C22700 c22700 = (C22700) obj;
        int i = c22700.f71591;
        int i2 = this.f71591;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f71588[this.f71589 + i3] != c22700.f71588[c22700.f71589 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50811(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length();
            int i = this.f71591;
            if (length == i) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.f71588[this.f71589 + i2] != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f71590 == -1) {
            int i = 0;
            for (int i2 = 0; i2 < this.f71591; i2++) {
                i = (i * 31) + this.f71588[this.f71589 + i2];
            }
            this.f71590 = i;
        }
        return this.f71590;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (cArr == null) {
            throw new NullPointerException("Destination array cannot be null");
        }
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(C20778.m46922(i, "srcBegin: "));
        }
        if (i2 > this.f71591) {
            throw new StringIndexOutOfBoundsException(C20778.m46922(i2, "srcEnd: "));
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(C19768.m44907("srcBegin: ", i, i2, " > srcEnd: "));
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(C20778.m46922(i3, "dstBegin: "));
        }
        int i4 = i2 - i;
        int i5 = i3 + i4;
        if (i5 <= cArr.length) {
            System.arraycopy(this.f71588, this.f71589 + i, cArr, i3, i4);
        } else {
            StringBuilder sbM34408 = C15033.m34408(i5, "dstBegin + copyLength: ", " > dst.length: ");
            sbM34408.append(cArr.length);
            throw new ArrayIndexOutOfBoundsException(sbM34408.toString());
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return m50813(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f71588, this.f71589, this.f71591);
    }
}
