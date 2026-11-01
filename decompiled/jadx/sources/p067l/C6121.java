package p067l;

/* JADX INFO: renamed from: l.ۘ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAX2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6121 extends AbstractC5196 {

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f15383 = 0;

    @Override // p067l.AbstractC5196
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    static {
        new C6121();
    }

    @Override // p067l.AbstractC5196
    /* JADX INFO: renamed from: ֫ */
    public final void mo8227(InterfaceC16436 interfaceC16436, Runnable runnable) {
        if (((C7462) interfaceC16436.mo11134(C7462.f19538)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
