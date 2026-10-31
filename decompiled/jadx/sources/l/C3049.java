package l;

/* JADX INFO: renamed from: l.ۗۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3049 implements CharSequence {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f9592;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4460 f9593;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9594;

    public C3049(CharSequence charSequence, C4460 c4460) {
        this.f9592 = charSequence;
        this.f9593 = c4460;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f9592.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f9594 + 1;
        this.f9594 = i2;
        if ((i2 & 1023) == 0) {
            this.f9593.m13206();
        }
        return this.f9592.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C13130(i, i2, this);
    }
}
