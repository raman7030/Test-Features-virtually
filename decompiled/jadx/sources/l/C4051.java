package l;

/* JADX INFO: renamed from: l.ۘܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4051 extends AbstractC8990 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f12868;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1228 f12869;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f12870;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f12871;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10401 f12872;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f12873;

    @Override // l.AbstractC8990
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo12171() {
        return 21;
    }

    public C4051(String str) {
        C1228 c1228 = new C1228();
        C10401 c10401 = new C10401();
        c10401.f31295 = 0;
        this.f12871 = str;
        this.f12868 = 200;
        this.f12870 = 65535;
        this.f12869 = c1228;
        this.f12872 = c10401;
        c1228.f4397 = 200;
        c1228.f4396 = new C5462();
        this.f27318 = 0;
        this.f27321 = 3;
    }

    @Override // l.AbstractC8990
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo12172(C13222 c13222) {
        C10401 c10401 = this.f12872;
        c13222.m32061(this.f12871);
        c13222.m32069(this.f12868);
        c13222.m32069(this.f12870);
        c13222.m32060(this.f12869);
        C1228 c1228 = this.f12869;
        if (c1228 != null) {
            c1228.mo2235(c13222);
        }
        c13222.m32060(c10401);
        if (c10401 != null) {
            c13222.m32069(c10401.f31295);
        }
    }

    @Override // l.AbstractC8990
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo12173(C13222 c13222) {
        if (c13222.m32058() != 0) {
            if (this.f12869 == null) {
                this.f12869 = new C1228();
            }
            this.f12869.mo2234(c13222);
        }
        if (c13222.m32058() != 0) {
            C10401 c10401 = this.f12872;
            c10401.getClass();
            c10401.f31295 = c13222.m32058();
        }
        this.f12873 = c13222.m32058();
    }
}
