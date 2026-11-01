package p067l;

/* JADX INFO: renamed from: l.ܺ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17836 extends AbstractC11132 {
    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 mo5217(int i) {
        Object obj;
        FutureC5767 futureC5767;
        Object obj2;
        FutureC5767 futureC5768;
        Throwable th;
        FutureC5767 futureC5769 = this.f7980;
        if (futureC5769 == null || (obj = futureC5769.f14147) == null || (futureC5767 = this.f30854) == null || (obj2 = futureC5767.f14147) == null || (futureC5768 = this.f7978) == null) {
            return null;
        }
        if (futureC5768.f14147 == null) {
            if ((obj instanceof C25213) && (th = ((C25213) obj).f80621) != null) {
                futureC5768.m12890(obj, th);
            } else if ((obj2 instanceof C25213) && (th = ((C25213) obj2).f80621) != null) {
                obj = obj2;
                futureC5768.m12890(obj, th);
            } else {
                futureC5768.m12905();
            }
        }
        this.f7980 = null;
        this.f30854 = null;
        this.f7978 = null;
        if (futureC5767.f14148 != null) {
            Object obj3 = futureC5767.f14147;
            if (obj3 == null) {
                futureC5767.m12899();
            }
            if (i >= 0 && (obj3 != null || futureC5767.f14147 != null)) {
                futureC5767.m12903();
            }
        }
        return futureC5768.m12885(futureC5769, i);
    }
}
