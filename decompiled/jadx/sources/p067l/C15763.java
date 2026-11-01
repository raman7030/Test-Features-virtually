package p067l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ܰ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15763 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C9729 f45644;

    /* JADX INFO: renamed from: ۙ */
    public int f45645;

    /* JADX INFO: renamed from: ۬ */
    public C24501 f45646;

    /* JADX INFO: renamed from: ᩶ */
    public int f45647;

    /* JADX INFO: renamed from: ᩸ */
    public char[] f45648;

    /* JADX INFO: renamed from: ᩹ */
    public C22491 f45649;

    public C15763(C9729 c9729) {
        this.f45644 = c9729;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C9729 c9729 = this.f45644;
        c9729.m22741();
        return c9729.f26871;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f45645 || i >= this.f45647) {
            m35824(i);
        }
        return this.f45648[i - this.f45645];
    }

    /* JADX INFO: renamed from: ۧ */
    public final char[] m35827(int i) {
        if (i < this.f45645 || i >= this.f45647) {
            m35824(i);
        }
        return this.f45648;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m35826() {
        return this.f45645;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m35825() {
        return this.f45647;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m35824(int i) {
        C9729 c9729 = this.f45644;
        c9729.m22741();
        if (i < 0 || i >= c9729.f26871) {
            throw new IndexOutOfBoundsException("Invalid character index");
        }
        c9729.m22736();
        int i2 = this.f45647;
        int iMin = i == i2 ? Math.min(512, i2 - this.f45645) : 0;
        if (iMin != 0) {
            i = this.f45647 - iMin;
        } else if (i < this.f45645) {
            i = Math.max(0, i - 512);
        }
        if (iMin != 0) {
            char[] cArr = this.f45648;
            System.arraycopy(cArr, (this.f45647 - this.f45645) - iMin, cArr, 0, iMin);
        }
        this.f45647 = 0;
        this.f45645 = 0;
        if (this.f45646 == null) {
            C24501 c24501 = new C24501(c9729.f26879.m34522().f38940, 2048);
            this.f45646 = c24501;
            this.f45648 = c24501.m54003();
        }
        int i3 = iMin + i;
        int iMin2 = Math.min(2048, c9729.f26871 - i) + i;
        C22491 c22491 = this.f45649;
        if (c22491 == null) {
            this.f45649 = c9729.f26879.mo30001(i3);
        } else if (c22491.position() != i3) {
            this.f45649.m50442(i3);
        }
        while (i3 < iMin2) {
            c9729.m22736();
            int iMin3 = Math.min(1024, iMin2 - i3);
            this.f45649.m50443(this.f45648, i3 - i, iMin3);
            i3 += iMin3;
        }
        this.f45645 = i;
        this.f45647 = iMin2;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C9729 c9729 = this.f45644;
        c9729.m22741();
        C13773.m31392(i, i2, c9729.f26871);
        C15113.m34521(cArr, i3, i2 - i);
        while (i < i2) {
            c9729.m22736();
            if (i < this.f45645 || i >= this.f45647) {
                m35824(i);
            }
            int iMin = Math.min(i2, this.f45647) - i;
            System.arraycopy(this.f45648, i - this.f45645, cArr, i3, iMin);
            i += iMin;
            i3 += iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        C9729 c9729 = this.f45644;
        c9729.m22741();
        C13773.m31392(i, i2, c9729.f26871);
        c9729.m22736();
        if (i == i2) {
            return "";
        }
        int i3 = this.f45645;
        if (i >= i3 && i2 <= this.f45647) {
            return new String(this.f45648, i - i3, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return subSequence(0, this.f45644.f26871);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m35823(C15763 c15763) {
        c15763.f45647 = 0;
        c15763.f45645 = 0;
        c15763.f45648 = null;
        try {
            C22491 c22491 = c15763.f45649;
            if (c22491 != null) {
                c22491.close();
            }
        } finally {
            c15763.f45649 = null;
            C24501 c24501 = c15763.f45646;
            if (c24501 != null) {
                c24501.close();
                c15763.f45646 = null;
            }
        }
    }
}
