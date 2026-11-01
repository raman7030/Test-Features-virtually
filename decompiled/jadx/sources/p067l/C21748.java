package p067l;

/* JADX INFO: renamed from: l.᩶᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94VR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21748 extends AbstractC13701 implements InterfaceC5654 {

    /* JADX INFO: renamed from: ۡ */
    public C15041 f68466;

    @Override // p067l.InterfaceC5654
    /* JADX INFO: renamed from: ֫ */
    public final C15041 mo12590() {
        return this.f68466;
    }

    public C21748(C15041 c15041) {
        super(EnumC9677.GOTO);
        this.f68466 = c15041;
    }

    @Override // p067l.AbstractC3880
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3880 mo7667(C3702 c3702) {
        return new C21748(c3702.mo7135(this.f68466));
    }

    public final String toString() {
        return "GOTO ".concat(this.f68466.m34416());
    }
}
