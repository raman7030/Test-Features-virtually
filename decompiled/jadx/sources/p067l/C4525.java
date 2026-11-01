package p067l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۖۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4525 extends AbstractC13516 implements InterfaceC17264 {

    /* JADX INFO: renamed from: ۗ */
    public final C19532 f10149;

    @Override // p067l.InterfaceC17797
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo3658((Throwable) obj);
        return C10027.f27775;
    }

    public C4525(C19532 c19532) {
        this.f10149 = c19532;
    }

    @Override // p067l.AbstractC2512
    /* JADX INFO: renamed from: ۧ */
    public final void mo3658(Throwable th) {
        this.f10149.m44382(m22099());
    }

    @Override // p067l.InterfaceC17264
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9580(Throwable th) {
        C19532 c19532M22099 = m22099();
        if (th instanceof CancellationException) {
            return true;
        }
        return c19532M22099.m44382(th) && c19532M22099.mo44381();
    }
}
