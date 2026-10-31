package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩷۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20873 implements CharSequence {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f67545;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67546;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final GetChars f67547;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f67548 = new char[2048];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f67549;

    public C20873(C7744 c7744) {
        this.f67547 = c7744;
        this.f67549 = c7744.length();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f67549;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m47697(int i) {
        int i2;
        if (i < this.f67545 || i >= this.f67546) {
            if (i < 0 || i >= (i2 = this.f67549)) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            char[] cArr = this.f67548;
            int iMin = Math.min(cArr.length, i2 - i) + i;
            this.f67546 = 0;
            this.f67545 = 0;
            this.f67547.getChars(i, iMin, cArr, 0);
            this.f67545 = i;
            this.f67546 = iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f67545 || i >= this.f67546) {
            m47697(i);
        }
        return this.f67548[i - this.f67545];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.f67549) {
            throw new IndexOutOfBoundsException("Invalid character range");
        }
        int i3 = this.f67545;
        if (i >= i3 && i2 <= this.f67546) {
            return new String(this.f67548, i - i3, i2 - i);
        }
        return this.f67547.subSequence(i, i2);
    }
}
