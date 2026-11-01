package p067l;

/* JADX INFO: renamed from: l.ۗۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5266 implements CharSequence {

    /* JADX INFO: renamed from: ᩶ */
    public final CharSequence f12393;

    /* JADX INFO: renamed from: ᩸ */
    public final C6607 f12394;

    /* JADX INFO: renamed from: ᩹ */
    public int f12395;

    public C5266(CharSequence charSequence, C6607 c6607) {
        this.f12393 = charSequence;
        this.f12394 = c6607;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12393.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f12395 + 1;
        this.f12395 = i2;
        if ((i2 & 1023) == 0) {
            this.f12394.m15087();
        }
        return this.f12393.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C14847(i, i2, this);
    }
}
