package l;

/* JADX INFO: renamed from: l.ܶ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15457 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8403 f47319;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f47318 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f47317 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f47316 = -1;

    public C15457(C8403 c8403) {
        this.f47319 = c8403;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36546() {
        int i = this.f47318;
        if (i == 0) {
            return;
        }
        C8403 c8403 = this.f47319;
        if (i == 1) {
            c8403.m22012(this.f47317, this.f47316);
        } else if (i == 2) {
            c8403.m22014(this.f47317, this.f47316);
        } else if (i == 3) {
            c8403.m22011(this.f47317, this.f47316);
        }
        this.f47318 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36548(int i, int i2) {
        m36546();
        this.f47319.m22013(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36547(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f47318 == 3 && i <= (i4 = this.f47316 + (i3 = this.f47317)) && (i5 = i + i2) >= i3) {
            this.f47317 = Math.min(i, i3);
            this.f47316 = Math.max(i4, i5) - this.f47317;
        } else {
            m36546();
            this.f47317 = i;
            this.f47316 = i2;
            this.f47318 = 3;
        }
    }
}
