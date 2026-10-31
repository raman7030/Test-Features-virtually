package l;

import android.text.GetChars;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z96R */
/* JADX INFO: loaded from: classes3.dex */
public final class C11418 implements Appendable, CharSequence, GetChars {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f34125;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f34126;

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    public C11418() {
        this(16);
    }

    public C11418(int i) {
        this.f34126 = new char[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f34125;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m28180(int i) {
        char[] cArr = this.f34126;
        if (i - cArr.length > 0) {
            int length = (cArr.length << 1) + 2;
            if (length - i < 0) {
                length = i;
            }
            if (length > 0 && 2147483639 - length >= 0) {
                i = length;
            } else {
                if (Integer.MAX_VALUE - i < 0) {
                    throw new OutOfMemoryError();
                }
                if (i <= 2147483639) {
                    i = 2147483639;
                }
            }
            this.f34126 = Arrays.copyOf(cArr, i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28185(int i) {
        m28180(i);
        int i2 = this.f34125;
        if (i2 < i) {
            Arrays.fill(this.f34126, i2, i, (char) 0);
        }
        this.f34125 = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f34126[i];
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 > this.f34125) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
        }
        System.arraycopy(this.f34126, i, cArr, i3, i2 - i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28186(String str) {
        if (str == null) {
            m28179();
            return;
        }
        int length = str.length();
        m28180(this.f34125 + length);
        str.getChars(0, length, this.f34126, this.f34125);
        this.f34125 += length;
    }

    @Override // java.lang.Appendable
    public final C11418 append(CharSequence charSequence) {
        if (charSequence == null) {
            m28179();
            return this;
        }
        if (charSequence instanceof String) {
            m28186((String) charSequence);
            return this;
        }
        if (charSequence instanceof C11418) {
            return append(charSequence);
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28179() {
        int i = this.f34125;
        int i2 = i + 4;
        m28180(i2);
        char[] cArr = this.f34126;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.f34125 = i2;
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        int i3 = i2 - i;
        m28180(this.f34125 + i3);
        int i4 = this.f34125;
        while (i < i2) {
            this.f34126[i4] = charSequence.charAt(i);
            i++;
            i4++;
        }
        this.f34125 += i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28183(char[] cArr) {
        int length = cArr.length;
        m28180(this.f34125 + length);
        System.arraycopy(cArr, 0, this.f34126, this.f34125, length);
        this.f34125 += length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28184(char[] cArr, int i, int i2) {
        if (i2 > 0) {
            m28180(this.f34125 + i2);
        }
        System.arraycopy(cArr, i, this.f34126, this.f34125, i2);
        this.f34125 += i2;
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        m28180(this.f34125 + 1);
        char[] cArr = this.f34126;
        int i = this.f34125;
        this.f34125 = i + 1;
        cArr[i] = c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return m28181(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28181(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 > this.f34125) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(i2 - i);
        }
        return new String(this.f34126, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f34126, 0, this.f34125);
    }

    public final char[] getValue() {
        return this.f34126;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28182() {
        this.f34126 = new char[16];
        this.f34125 = 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11418) {
            C11418 c11418 = (C11418) obj;
            int i = this.f34125;
            if (i != c11418.f34125) {
                return false;
            }
            char[] cArr = this.f34126;
            char[] cArr2 = c11418.f34126;
            for (int i2 = 0; i2 < i; i2++) {
                if (cArr[i2] != cArr2[i2]) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof CharSequence) {
            return TextUtils.equals(this, (CharSequence) obj);
        }
        return false;
    }

    public final int hashCode() {
        char[] cArr = this.f34126;
        int i = this.f34125;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + cArr[i3];
        }
        return i2;
    }
}
