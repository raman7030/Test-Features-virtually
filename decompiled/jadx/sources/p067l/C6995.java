package p067l;

/* JADX INFO: renamed from: l.ۙ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 159C */
/* JADX INFO: loaded from: classes3.dex */
public final class C6995 extends AbstractC24429 implements InterfaceC5654 {

    /* JADX INFO: renamed from: ܺ */
    public C15041 f18221;

    @Override // p067l.InterfaceC5654
    /* JADX INFO: renamed from: ֫ */
    public final C15041 mo12590() {
        return this.f18221;
    }

    public C6995(EnumC9677 enumC9677, AbstractC10348 abstractC10348, C15041 c15041) {
        super(enumC9677, abstractC10348);
        this.f18221 = c15041;
    }

    @Override // p067l.AbstractC3880
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3880 mo7667(C3702 c3702) {
        C15041 c15041Mo7135 = c3702.mo7135(this.f18221);
        return new C6995(this.f8417, this.f77339.mo8844(c3702), c15041Mo7135);
    }

    public final String toString() {
        return "if " + this.f77339 + " GOTO " + this.f18221.m34416();
    }
}
