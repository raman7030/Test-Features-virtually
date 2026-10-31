package l;

/* JADX INFO: renamed from: l.ۘ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAX2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3948 extends AbstractC2975 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12575 = 0;

    @Override // l.AbstractC2975
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    static {
        new C3948();
    }

    @Override // l.AbstractC2975
    /* JADX INFO: renamed from: ֫ */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        if (((C5359) interfaceC14801.mo9082(C5359.f16700)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
