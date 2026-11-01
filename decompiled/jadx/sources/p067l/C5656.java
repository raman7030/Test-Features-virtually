package p067l;

/* JADX INFO: renamed from: l.ۗ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9BO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5656 extends AbstractC6997 {

    /* JADX INFO: renamed from: ۜ */
    public C9739 f13755;

    /* JADX INFO: renamed from: ۡ */
    public final C8338 f13756;

    /* JADX INFO: renamed from: ۢ */
    public int f13757;

    /* JADX INFO: renamed from: ܳ */
    public C9739 f13758;

    /* JADX INFO: renamed from: ܽ */
    public final int f13759;

    /* JADX INFO: renamed from: ܿ */
    public C9739 f13760;

    /* JADX INFO: renamed from: ᩳ */
    public C18396 f13761;

    /* JADX INFO: renamed from: ᩷ */
    public final int f13762;

    /* JADX INFO: renamed from: ᩻ */
    public C9739 f13763;

    @Override // p067l.AbstractC6997
    /* JADX INFO: renamed from: ֫ */
    public final void mo12603() {
    }

    public C5656(C8338 c8338, String str, String str2, String str3) {
        super(589824, null);
        this.f13756 = c8338;
        this.f13762 = c8338.m19265(str);
        this.f13759 = c8338.m19265(str2);
        if (str3 != null) {
            this.f13757 = c8338.m19265(str3);
        }
    }

    @Override // p067l.AbstractC6997
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo12602(String str, boolean z) {
        C8338 c8338 = this.f13756;
        if (z) {
            C9739 c9739M22766 = C9739.m22766(c8338, str, this.f13763);
            this.f13763 = c9739M22766;
            return c9739M22766;
        }
        C9739 c9739M22767 = C9739.m22766(c8338, str, this.f13760);
        this.f13760 = c9739M22767;
        return c9739M22767;
    }

    @Override // p067l.AbstractC6997
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo12601(int i, C24431 c24431, String str, boolean z) {
        C8338 c8338 = this.f13756;
        if (z) {
            C9739 c9739M22765 = C9739.m22765(c8338, i, c24431, str, this.f13755);
            this.f13755 = c9739M22765;
            return c9739M22765;
        }
        C9739 c9739M22766 = C9739.m22765(c8338, i, c24431, str, this.f13758);
        this.f13758 = c9739M22766;
        return c9739M22766;
    }

    @Override // p067l.AbstractC6997
    /* JADX INFO: renamed from: ֫ */
    public final void mo12605(C18396 c18396) {
        c18396.f54924 = this.f13761;
        this.f13761 = c18396;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m12607() {
        int i = this.f13757;
        C8338 c8338 = this.f13756;
        int iM41870 = C18396.m41870(c8338, 0, i) + 6 + C9739.m22764(this.f13763, this.f13760, this.f13755, this.f13758);
        C18396 c18396 = this.f13761;
        return c18396 != null ? iM41870 + c18396.m41872(c8338) : iM41870;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12606(C19738 c19738) {
        c19738.m44877(this.f13762);
        c19738.m44877(this.f13759);
        int i = this.f13757;
        int i2 = i != 0 ? 1 : 0;
        if (this.f13763 != null) {
            i2++;
        }
        if (this.f13760 != null) {
            i2++;
        }
        if (this.f13755 != null) {
            i2++;
        }
        if (this.f13758 != null) {
            i2++;
        }
        C18396 c18396 = this.f13761;
        if (c18396 != null) {
            int i3 = 0;
            while (c18396 != null) {
                i3++;
                c18396 = c18396.f54924;
            }
            i2 += i3;
        }
        c19738.m44877(i2);
        C8338 c8338 = this.f13756;
        C18396.m41871(c8338, 0, i, c19738);
        C9739.m22768(this.f13756, this.f13763, this.f13760, this.f13755, this.f13758, c19738);
        C18396 c18397 = this.f13761;
        if (c18397 != null) {
            c18397.m41875(c8338, c19738);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12604(C13033 c13033) {
        c13033.m29848(this.f13761);
    }
}
