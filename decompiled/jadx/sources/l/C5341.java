package l;

/* JADX INFO: renamed from: l.ۚۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L79Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C5341 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16657;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16658;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f16659;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f16660 = "";

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f16661;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15287(CharSequence charSequence) {
        this.f16660 = charSequence;
        this.f16661 = 0;
        this.f16658 = 0;
        this.f16659 = 0;
        this.f16657 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0401 m15286(int i) {
        int iMax = Math.max(0, Math.min(i, this.f16660.length()));
        if (iMax < this.f16661) {
            m15287(this.f16660);
        }
        while (true) {
            int i2 = this.f16661;
            if (i2 < iMax) {
                char cCharAt = this.f16660.charAt(i2);
                if (cCharAt == '\n') {
                    int i3 = this.f16661 + 1;
                    this.f16661 = i3;
                    this.f16658++;
                    this.f16659 = i3;
                    this.f16657 = 0;
                } else {
                    int i4 = this.f16661;
                    if (!Character.isLowSurrogate(cCharAt) || i4 <= this.f16659 || !Character.isHighSurrogate(this.f16660.charAt(i4 - 1))) {
                        this.f16657++;
                    }
                    this.f16661++;
                }
            } else {
                return new C0401(this.f16658, this.f16657);
            }
        }
    }
}
