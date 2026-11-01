package p067l;

/* JADX INFO: renamed from: l.᩸᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C23202 extends AbstractC3755 {

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC16692 f72889;

    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 mo5217(int i) {
        Object obj;
        FutureC5767 futureC5767;
        InterfaceC16692 interfaceC16692;
        FutureC5767 futureC5768 = this.f7980;
        if (futureC5768 != null && (obj = futureC5768.f14147) != null && (futureC5767 = this.f7978) != null && (interfaceC16692 = this.f72889) != null) {
            if (futureC5767.m12894(obj, interfaceC16692, i > 0 ? null : this)) {
                this.f7980 = null;
                this.f7978 = null;
                this.f72889 = null;
                return futureC5767.m12885(futureC5768, i);
            }
        }
        return null;
    }
}
