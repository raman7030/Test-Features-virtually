package p067l;

/* JADX INFO: renamed from: l.ᩴ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58K */
/* JADX INFO: loaded from: classes5.dex */
public final class C20409 extends AbstractC6327 {

    /* JADX INFO: renamed from: ۖ */
    public final C8338 f63072;

    /* JADX INFO: renamed from: ۜ */
    public C9739 f63073;

    /* JADX INFO: renamed from: ۡ */
    public final int f63074;

    /* JADX INFO: renamed from: ۢ */
    public C9739 f63075;

    /* JADX INFO: renamed from: ܳ */
    public C18396 f63076;

    /* JADX INFO: renamed from: ܺ */
    public int f63077;

    /* JADX INFO: renamed from: ܽ */
    public final int f63078;

    /* JADX INFO: renamed from: ܿ */
    public final int f63079;

    /* JADX INFO: renamed from: ᩳ */
    public int f63080;

    /* JADX INFO: renamed from: ᩷ */
    public C9739 f63081;

    /* JADX INFO: renamed from: ᩻ */
    public C9739 f63082;

    @Override // p067l.AbstractC6327
    /* JADX INFO: renamed from: ֫ */
    public final void mo14473() {
    }

    public C20409(C8338 c8338, int i, String str, String str2, String str3, Object obj) {
        super(589824, null);
        this.f63072 = c8338;
        this.f63078 = i;
        this.f63074 = c8338.m19265(str);
        this.f63079 = c8338.m19265(str2);
        if (str3 != null) {
            this.f63077 = c8338.m19265(str3);
        }
        if (obj != null) {
            this.f63080 = c8338.m19247(obj).f42967;
        }
    }

    @Override // p067l.AbstractC6327
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo7677(String str, boolean z) {
        C8338 c8338 = this.f63072;
        if (z) {
            C9739 c9739M22766 = C9739.m22766(c8338, str, this.f63081);
            this.f63081 = c9739M22766;
            return c9739M22766;
        }
        C9739 c9739M22767 = C9739.m22766(c8338, str, this.f63082);
        this.f63082 = c9739M22767;
        return c9739M22767;
    }

    @Override // p067l.AbstractC6327
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo7676(int i, C24431 c24431, String str, boolean z) {
        C8338 c8338 = this.f63072;
        if (z) {
            C9739 c9739M22765 = C9739.m22765(c8338, i, c24431, str, this.f63075);
            this.f63075 = c9739M22765;
            return c9739M22765;
        }
        C9739 c9739M22766 = C9739.m22765(c8338, i, c24431, str, this.f63073);
        this.f63073 = c9739M22766;
        return c9739M22766;
    }

    @Override // p067l.AbstractC6327
    /* JADX INFO: renamed from: ֫ */
    public final void mo14474(C18396 c18396) {
        c18396.f54924 = this.f63076;
        this.f63076 = c18396;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m46084() {
        int i;
        int i2 = this.f63080;
        C8338 c8338 = this.f63072;
        if (i2 != 0) {
            c8338.m19265("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int iM41870 = i + C18396.m41870(c8338, this.f63078, this.f63077) + C9739.m22764(this.f63081, this.f63082, this.f63075, this.f63073);
        C18396 c18396 = this.f63076;
        return c18396 != null ? iM41870 + c18396.m41872(c8338) : iM41870;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46083(C19738 c19738) {
        C8338 c8338 = this.f63072;
        int i = 0;
        boolean z = c8338.m19262() < 49;
        int i2 = ~(z ? 4096 : 0);
        int i3 = this.f63078;
        c19738.m44877(i2 & i3);
        c19738.m44877(this.f63074);
        c19738.m44877(this.f63079);
        int i4 = this.f63080;
        int i5 = i4 == 0 ? 0 : 1;
        if ((i3 & 4096) != 0 && z) {
            i5++;
        }
        int i6 = this.f63077;
        if (i6 != 0) {
            i5++;
        }
        if ((131072 & i3) != 0) {
            i5++;
        }
        if (this.f63081 != null) {
            i5++;
        }
        if (this.f63082 != null) {
            i5++;
        }
        if (this.f63075 != null) {
            i5++;
        }
        if (this.f63073 != null) {
            i5++;
        }
        C18396 c18396 = this.f63076;
        if (c18396 != null) {
            while (c18396 != null) {
                i++;
                c18396 = c18396.f54924;
            }
            i5 += i;
        }
        c19738.m44877(i5);
        if (i4 != 0) {
            c19738.m44877(c8338.m19265("ConstantValue"));
            c19738.m44875(2);
            c19738.m44877(i4);
        }
        C18396.m41871(c8338, i3, i6, c19738);
        C9739.m22768(this.f63072, this.f63081, this.f63082, this.f63075, this.f63073, c19738);
        C18396 c18397 = this.f63076;
        if (c18397 != null) {
            c18397.m41875(c8338, c19738);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46082(C13033 c13033) {
        c13033.m29848(this.f63076);
    }
}
