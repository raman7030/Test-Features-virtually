package p067l;

import android.text.GetChars;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z96R */
/* JADX INFO: loaded from: classes3.dex */
public final class C13220 implements Appendable, CharSequence, GetChars {

    /* JADX INFO: renamed from: ᩸ */
    public int f37121;

    /* JADX INFO: renamed from: ᩹ */
    public char[] f37122;

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

    public C13220() {
        this(16);
    }

    public C13220(int i) {
        this.f37122 = new char[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f37121;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m30224(int i) {
        char[] cArr = this.f37122;
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
            this.f37122 = Arrays.copyOf(cArr, i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30229(int i) {
        m30224(i);
        int i2 = this.f37121;
        if (i2 < i) {
            Arrays.fill(this.f37122, i2, i, (char) 0);
        }
        this.f37121 = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f37122[i];
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 > this.f37121) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
        }
        System.arraycopy(this.f37122, i, cArr, i3, i2 - i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30230(String str) {
        if (str == null) {
            m30223();
            return;
        }
        int length = str.length();
        m30224(this.f37121 + length);
        str.getChars(0, length, this.f37122, this.f37121);
        this.f37121 += length;
    }

    @Override // java.lang.Appendable
    public final C13220 append(CharSequence charSequence) {
        if (charSequence == null) {
            m30223();
            return this;
        }
        if (charSequence instanceof String) {
            m30230((String) charSequence);
            return this;
        }
        if (charSequence instanceof C13220) {
            return append(charSequence);
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m30223() {
        int i = this.f37121;
        int i2 = i + 4;
        m30224(i2);
        char[] cArr = this.f37122;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.f37121 = i2;
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        int i3 = i2 - i;
        m30224(this.f37121 + i3);
        int i4 = this.f37121;
        while (i < i2) {
            this.f37122[i4] = charSequence.charAt(i);
            i++;
            i4++;
        }
        this.f37121 += i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30227(char[] cArr) {
        int length = cArr.length;
        m30224(this.f37121 + length);
        System.arraycopy(cArr, 0, this.f37122, this.f37121, length);
        this.f37121 += length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30228(char[] cArr, int i, int i2) {
        if (i2 > 0) {
            m30224(this.f37121 + i2);
        }
        System.arraycopy(cArr, i, this.f37122, this.f37121, i2);
        this.f37121 += i2;
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        m30224(this.f37121 + 1);
        char[] cArr = this.f37122;
        int i = this.f37121;
        this.f37121 = i + 1;
        cArr[i] = c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return m30225(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30225(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 > this.f37121) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(i2 - i);
        }
        return new String(this.f37122, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f37122, 0, this.f37121);
    }

    public final char[] getValue() {
        return this.f37122;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30226() {
        this.f37122 = new char[16];
        this.f37121 = 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13220) {
            C13220 c13220 = (C13220) obj;
            int i = this.f37121;
            if (i != c13220.f37121) {
                return false;
            }
            char[] cArr = this.f37122;
            char[] cArr2 = c13220.f37122;
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
        char[] cArr = this.f37122;
        int i = this.f37121;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + cArr[i3];
        }
        return i2;
    }
}
