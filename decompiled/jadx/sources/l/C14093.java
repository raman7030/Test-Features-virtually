package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ܰ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14093 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7744 f42558;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42559;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23287 f42560;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42561;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f42562;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21172 f42563;

    public C14093(C7744 c7744) {
        this.f42558 = c7744;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C7744 c7744 = this.f42558;
        c7744.m20761();
        return c7744.f23958;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f42559 || i >= this.f42561) {
            m33699(i);
        }
        return this.f42562[i - this.f42559];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] m33702(int i) {
        if (i < this.f42559 || i >= this.f42561) {
            m33699(i);
        }
        return this.f42562;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m33701() {
        return this.f42559;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33700() {
        return this.f42561;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m33699(int i) {
        C7744 c7744 = this.f42558;
        c7744.m20761();
        if (i < 0 || i >= c7744.f23958) {
            throw new IndexOutOfBoundsException("Invalid character index");
        }
        c7744.m20756();
        int i2 = this.f42561;
        int iMin = i == i2 ? Math.min(512, i2 - this.f42559) : 0;
        if (iMin != 0) {
            i = this.f42561 - iMin;
        } else if (i < this.f42559) {
            i = Math.max(0, i - 512);
        }
        if (iMin != 0) {
            char[] cArr = this.f42562;
            System.arraycopy(cArr, (this.f42561 - this.f42559) - iMin, cArr, 0, iMin);
        }
        this.f42561 = 0;
        this.f42559 = 0;
        if (this.f42560 == null) {
            C23287 c23287 = new C23287(c7744.f23966.m32420().f35930, 2048);
            this.f42560 = c23287;
            this.f42562 = c23287.m51607();
        }
        int i3 = iMin + i;
        int iMin2 = Math.min(2048, c7744.f23958 - i) + i;
        C21172 c21172 = this.f42563;
        if (c21172 == null) {
            this.f42563 = c7744.f23966.mo27940(i3);
        } else if (c21172.position() != i3) {
            this.f42563.m48112(i3);
        }
        while (i3 < iMin2) {
            c7744.m20756();
            int iMin3 = Math.min(1024, iMin2 - i3);
            this.f42563.m48113(this.f42562, i3 - i, iMin3);
            i3 += iMin3;
        }
        this.f42559 = i;
        this.f42561 = iMin2;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C7744 c7744 = this.f42558;
        c7744.m20761();
        C11999.m29337(i, i2, c7744.f23958);
        C13409.m32419(cArr, i3, i2 - i);
        while (i < i2) {
            c7744.m20756();
            if (i < this.f42559 || i >= this.f42561) {
                m33699(i);
            }
            int iMin = Math.min(i2, this.f42561) - i;
            System.arraycopy(this.f42562, i - this.f42559, cArr, i3, iMin);
            i += iMin;
            i3 += iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        C7744 c7744 = this.f42558;
        c7744.m20761();
        C11999.m29337(i, i2, c7744.f23958);
        c7744.m20756();
        if (i == i2) {
            return "";
        }
        int i3 = this.f42559;
        if (i >= i3 && i2 <= this.f42561) {
            return new String(this.f42562, i - i3, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return subSequence(0, this.f42558.f23958);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33698(C14093 c14093) {
        c14093.f42561 = 0;
        c14093.f42559 = 0;
        c14093.f42562 = null;
        try {
            C21172 c21172 = c14093.f42563;
            if (c21172 != null) {
                c21172.close();
            }
        } finally {
            c14093.f42563 = null;
            C23287 c23287 = c14093.f42560;
            if (c23287 != null) {
                c23287.close();
                c14093.f42560 = null;
            }
        }
    }
}
