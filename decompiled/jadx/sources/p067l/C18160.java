package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7DZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18160 extends C8792 {

    /* JADX INFO: renamed from: ۗ */
    public C5263 f54224;

    /* JADX INFO: renamed from: ۙ */
    public C17450 f54225;

    /* JADX INFO: renamed from: ᩶ */
    public C17450 f54226;

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        return 4;
    }

    public C18160(C5263 c5263, C17450 c17450, C17450 c17451) {
        super(c5263, EnumC6799.f17651);
        this.f54224 = c5263;
        this.f54226 = c17450;
        this.f54225 = c17451;
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo5157(interfaceC2756);
        boolean zMo20303 = this.f54226.mo20303();
        C5263 c5263 = this.f54224;
        if (!zMo20303) {
            this.f54226 = c5263.m11371(this.f54226);
            if (!c5263.m11373().m49472(Integer.valueOf(this.f54226.f23817))) {
                c5263.f12389.m13870("\"{0}\" not found in Constant Pool", this.f54226);
                throw null;
            }
        }
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f54226.f23817);
        C17450 c17450 = this.f54225;
        if (c17450 != null && !c17450.mo20303()) {
            this.f54225 = c5263.m11371(this.f54225);
            if (!c5263.m11373().m49472(Integer.valueOf(this.f54225.f23817))) {
                c5263.f12389.m13870("\"{0}\" not found in Constant Pool", this.f54225);
                throw null;
            }
        }
        C17450 c17451 = this.f54225;
        c8121.m18818(c17451 != null ? c17451.f23817 : 0);
    }
}
