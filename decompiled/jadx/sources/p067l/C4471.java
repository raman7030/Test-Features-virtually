package p067l;

/* JADX INFO: renamed from: l.ۖ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4471 implements InterfaceC1798 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C2458 f10050;

    public C4471(C2458 c2458) {
        this.f10050 = c2458;
    }

    @Override // p067l.InterfaceC1798
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9469(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo9470();
        this.f10050.m3469((int) f);
        return true;
    }

    @Override // p067l.InterfaceC1798
    /* JADX INFO: renamed from: ۧ */
    public final void mo9470() {
        this.f10050.f3813.abortAnimation();
    }

    @Override // p067l.InterfaceC1798
    /* JADX INFO: renamed from: ֫ */
    public final float mo9468() {
        return -this.f10050.m3468();
    }
}
