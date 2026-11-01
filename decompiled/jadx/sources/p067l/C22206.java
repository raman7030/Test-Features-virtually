package p067l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩷۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22206 implements CharSequence {

    /* JADX INFO: renamed from: ۗ */
    public int f70231;

    /* JADX INFO: renamed from: ۙ */
    public int f70232;

    /* JADX INFO: renamed from: ᩶ */
    public final GetChars f70233;

    /* JADX INFO: renamed from: ᩸ */
    public final char[] f70234 = new char[2048];

    /* JADX INFO: renamed from: ᩹ */
    public final int f70235;

    public C22206(C9729 c9729) {
        this.f70233 = c9729;
        this.f70235 = c9729.length();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f70235;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m50027(int i) {
        int i2;
        if (i < this.f70231 || i >= this.f70232) {
            if (i < 0 || i >= (i2 = this.f70235)) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            char[] cArr = this.f70234;
            int iMin = Math.min(cArr.length, i2 - i) + i;
            this.f70232 = 0;
            this.f70231 = 0;
            this.f70233.getChars(i, iMin, cArr, 0);
            this.f70231 = i;
            this.f70232 = iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f70231 || i >= this.f70232) {
            m50027(i);
        }
        return this.f70234[i - this.f70231];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.f70235) {
            throw new IndexOutOfBoundsException("Invalid character range");
        }
        int i3 = this.f70231;
        if (i >= i3 && i2 <= this.f70232) {
            return new String(this.f70234, i - i3, i2 - i);
        }
        return this.f70233.subSequence(i, i2);
    }
}
