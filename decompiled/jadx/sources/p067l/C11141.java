package p067l;

/* JADX INFO: renamed from: l.ۢ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11141 extends C2974 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C17174 f30884;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11141(C17174 c17174, InterfaceC21081 interfaceC21081) {
        super(interfaceC21081);
        this.f30884 = c17174;
    }

    @Override // p067l.C2974, p067l.InterfaceC21081
    /* JADX INFO: renamed from: ۧ */
    public final void mo4937(C13010 c13010, Exception exc) {
        boolean zM9270 = C4435.m9270(exc);
        C17174 c17174 = this.f30884;
        if (!zM9270 && c17174.f51140 && !c17174.mo17768()) {
            C17174.m38901(c17174, c13010, c17174.f51134, c17174.f51131, c17174.f51135);
            return;
        }
        c17174.f51139 = false;
        c17174.f51130 = false;
        super.mo4937(c13010, exc);
    }

    @Override // p067l.C2974, p067l.InterfaceC21081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4933(C13010 c13010, Exception exc) {
        C17174 c17174 = this.f30884;
        if (c17174.f51140 && !c17174.mo17768()) {
            C17174.m38901(c17174, c13010, c17174.f51134, c17174.f51131, c17174.f51135);
            return;
        }
        c17174.f51139 = false;
        c17174.f51130 = false;
        super.mo4933(c13010, exc);
    }

    @Override // p067l.C2974, p067l.InterfaceC21081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4934(C13010 c13010, C17095 c17095, long j) {
        C17174 c17174 = this.f30884;
        c17174.f51139 = false;
        c17174.f51130 = true;
        super.mo4934(c13010, c17095, j);
    }
}
