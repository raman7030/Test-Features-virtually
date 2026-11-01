package p067l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩷۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56O8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22213 implements InterfaceC24235, GetChars {

    /* JADX INFO: renamed from: ᩶ */
    public final C9729 f70255;

    /* JADX INFO: renamed from: ᩸ */
    public final int f70256;

    /* JADX INFO: renamed from: ᩹ */
    public final int f70257;

    public C22213(C9729 c9729, int i, int i2) {
        if (i2 < 0 || i < 0 || i > c9729.length() - i2) {
            throw new IndexOutOfBoundsException("Invalid deletion preview range");
        }
        this.f70255 = c9729;
        this.f70257 = i;
        this.f70256 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f70255.length() - this.f70256;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException("Invalid preview index");
        }
        if (i >= this.f70257) {
            i += this.f70256;
        }
        return this.f70255.charAt(i);
    }

    @Override // p067l.InterfaceC24235
    public final int indexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        int iMin = Math.min(length(), i2);
        if (iMax >= iMin) {
            return -1;
        }
        C9729 c9729 = this.f70255;
        int i3 = this.f70257;
        if (iMax < i3) {
            int iIndexOf = c9729.indexOf(c, iMax, Math.min(i3, iMin));
            if (iIndexOf >= 0) {
                return iIndexOf;
            }
            iMax = i3;
        }
        if (iMax >= iMin) {
            return -1;
        }
        int i4 = this.f70256;
        int iIndexOf2 = c9729.indexOf(c, iMax + i4, iMin + i4);
        if (iIndexOf2 < 0) {
            return -1;
        }
        return iIndexOf2 - i4;
    }

    @Override // p067l.InterfaceC24235
    public final int lastIndexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        int iMin = Math.min(length(), i2);
        if (iMax >= iMin) {
            return -1;
        }
        C9729 c9729 = this.f70255;
        int i3 = this.f70257;
        if (iMin > i3) {
            int iMax2 = Math.max(i3, iMax);
            int i4 = this.f70256;
            int iLastIndexOf = c9729.lastIndexOf('\n', iMax2 + i4, iMin + i4);
            if (iLastIndexOf >= 0) {
                return iLastIndexOf - i4;
            }
            iMin = i3;
        }
        if (iMax < iMin) {
            return c9729.lastIndexOf('\n', iMax, iMin);
        }
        return -1;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (i >= 0 && i2 >= i && i2 <= length()) {
            if (i3 < 0 || i3 > cArr.length - (i2 - i)) {
                throw new IndexOutOfBoundsException("Invalid preview destination");
            }
            int iMin = Math.min(i2, this.f70257);
            C9729 c9729 = this.f70255;
            if (i < iMin) {
                c9729.getChars(i, iMin, cArr, i3);
                i3 += iMin - i;
                i = iMin;
            }
            if (i < i2) {
                int i4 = this.f70256;
                c9729.getChars(i + i4, i2 + i4, cArr, i3);
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
