package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7DZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16616 extends C6759 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3046 f51047;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15869 f51048;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15869 f51049;

    @Override // l.C6759
    /* JADX INFO: renamed from: ܽ */
    public final int mo5678() {
        return 4;
    }

    public C16616(C3046 c3046, C15869 c15869, C15869 c158610) {
        super(c3046, EnumC4662.f14821);
        this.f51047 = c3046;
        this.f51049 = c15869;
        this.f51048 = c158610;
    }

    @Override // l.C6759, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo2828(interfaceC0408);
        boolean zMo18355 = this.f51049.mo18355();
        C3046 c3046 = this.f51047;
        if (!zMo18355) {
            this.f51049 = c3046.m9329(this.f51049);
            if (!c3046.m9331().m47146(Integer.valueOf(this.f51049.f20943))) {
                c3046.f9588.m11950("\"{0}\" not found in Constant Pool", this.f51049);
                throw null;
            }
        }
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f51049.f20943);
        C15869 c15869 = this.f51048;
        if (c15869 != null && !c15869.mo18355()) {
            this.f51048 = c3046.m9329(this.f51048);
            if (!c3046.m9331().m47146(Integer.valueOf(this.f51048.f20943))) {
                c3046.f9588.m11950("\"{0}\" not found in Constant Pool", this.f51048);
                throw null;
            }
        }
        C15869 c158610 = this.f51048;
        c6053.m16889(c158610 != null ? c158610.f20943 : 0);
    }
}
