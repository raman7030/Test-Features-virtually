package p067l;

/* JADX INFO: renamed from: l.ܶ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17165 extends AbstractC3755 {

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC22729 f51109;

    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 mo5217(int i) {
        Object obj;
        FutureC5767 futureC5767;
        InterfaceC22729 interfaceC22729;
        FutureC5767 futureC5768 = this.f7980;
        if (futureC5768 != null && (obj = futureC5768.f14147) != null && (futureC5767 = this.f7978) != null && (interfaceC22729 = this.f51109) != null) {
            if (futureC5767.m12895(obj, interfaceC22729, i > 0 ? null : this)) {
                this.f7980 = null;
                this.f7978 = null;
                this.f51109 = null;
                return futureC5767.m12885(futureC5768, i);
            }
        }
        return null;
    }
}
