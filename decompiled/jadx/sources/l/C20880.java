package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩷۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56O8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20880 implements InterfaceC23008, GetChars {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7744 f67569;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f67570;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f67571;

    public C20880(C7744 c7744, int i, int i2) {
        if (i2 < 0 || i < 0 || i > c7744.length() - i2) {
            throw new IndexOutOfBoundsException("Invalid deletion preview range");
        }
        this.f67569 = c7744;
        this.f67571 = i;
        this.f67570 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f67569.length() - this.f67570;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException("Invalid preview index");
        }
        if (i >= this.f67571) {
            i += this.f67570;
        }
        return this.f67569.charAt(i);
    }

    @Override // l.InterfaceC23008
    public final int indexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        int iMin = Math.min(length(), i2);
        if (iMax >= iMin) {
            return -1;
        }
        C7744 c7744 = this.f67569;
        int i3 = this.f67571;
        if (iMax < i3) {
            int iIndexOf = c7744.indexOf(c, iMax, Math.min(i3, iMin));
            if (iIndexOf >= 0) {
                return iIndexOf;
            }
            iMax = i3;
        }
        if (iMax >= iMin) {
            return -1;
        }
        int i4 = this.f67570;
        int iIndexOf2 = c7744.indexOf(c, iMax + i4, iMin + i4);
        if (iIndexOf2 < 0) {
            return -1;
        }
        return iIndexOf2 - i4;
    }

    @Override // l.InterfaceC23008
    public final int lastIndexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        int iMin = Math.min(length(), i2);
        if (iMax >= iMin) {
            return -1;
        }
        C7744 c7744 = this.f67569;
        int i3 = this.f67571;
        if (iMin > i3) {
            int iMax2 = Math.max(i3, iMax);
            int i4 = this.f67570;
            int iLastIndexOf = c7744.lastIndexOf('\n', iMax2 + i4, iMin + i4);
            if (iLastIndexOf >= 0) {
                return iLastIndexOf - i4;
            }
            iMin = i3;
        }
        if (iMax < iMin) {
            return c7744.lastIndexOf('\n', iMax, iMin);
        }
        return -1;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (i >= 0 && i2 >= i && i2 <= length()) {
            if (i3 < 0 || i3 > cArr.length - (i2 - i)) {
                throw new IndexOutOfBoundsException("Invalid preview destination");
            }
            int iMin = Math.min(i2, this.f67571);
            C7744 c7744 = this.f67569;
            if (i < iMin) {
                c7744.getChars(i, iMin, cArr, i3);
                i3 += iMin - i;
                i = iMin;
            }
            if (i < i2) {
                int i4 = this.f67570;
                c7744.getChars(i + i4, i2 + i4, cArr, i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("Invalid preview range");
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException("Invalid preview range");
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int length = length();
        if (length < 0 || length > length()) {
            throw new IndexOutOfBoundsException("Invalid preview range");
        }
        char[] cArr = new char[length];
        getChars(0, length, cArr, 0);
        return new String(cArr);
    }
}
