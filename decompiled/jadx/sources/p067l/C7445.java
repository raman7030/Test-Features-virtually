package p067l;

/* JADX INFO: renamed from: l.ۚۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L79Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C7445 {

    /* JADX INFO: renamed from: ֫ */
    public int f19496;

    /* JADX INFO: renamed from: ۧ */
    public int f19497;

    /* JADX INFO: renamed from: ܽ */
    public int f19498;

    /* JADX INFO: renamed from: ܿ */
    public CharSequence f19499 = "";

    /* JADX INFO: renamed from: ᩳ */
    public int f19500;

    /* JADX INFO: renamed from: ֫ */
    public final void m17195(CharSequence charSequence) {
        this.f19499 = charSequence;
        this.f19500 = 0;
        this.f19497 = 0;
        this.f19498 = 0;
        this.f19496 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2750 m17194(int i) {
        int iMax = Math.max(0, Math.min(i, this.f19499.length()));
        if (iMax < this.f19500) {
            m17195(this.f19499);
        }
        while (true) {
            int i2 = this.f19500;
            if (i2 < iMax) {
                char cCharAt = this.f19499.charAt(i2);
                if (cCharAt == '\n') {
                    int i3 = this.f19500 + 1;
                    this.f19500 = i3;
                    this.f19497++;
                    this.f19498 = i3;
                    this.f19496 = 0;
                } else {
                    int i4 = this.f19500;
                    if (!Character.isLowSurrogate(cCharAt) || i4 <= this.f19498 || !Character.isHighSurrogate(this.f19499.charAt(i4 - 1))) {
                        this.f19496++;
                    }
                    this.f19500++;
                }
            } else {
                return new C2750(this.f19497, this.f19496);
            }
        }
    }
}
