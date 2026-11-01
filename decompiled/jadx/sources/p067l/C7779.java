package p067l;

/* JADX INFO: renamed from: l.ۚ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7779 extends AbstractC3755 {

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC22729 f20398;

    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 mo5217(int i) {
        Object obj;
        FutureC5767 futureC5767;
        InterfaceC22729 interfaceC22729;
        FutureC5767 futureC5768 = this.f7980;
        if (futureC5768 != null && (obj = futureC5768.f14147) != null && (futureC5767 = this.f7978) != null && (interfaceC22729 = this.f20398) != null) {
            if (futureC5767.f14147 == null) {
                if (obj instanceof C25213) {
                    Throwable th = ((C25213) obj).f80621;
                    if (th != null) {
                        futureC5767.m12890(obj, th);
                    } else {
                        obj = null;
                        if (i <= 0) {
                            if (!m7254()) {
                            }
                        }
                        futureC5767.m12906(interfaceC22729.apply(obj));
                    }
                } else {
                    if (i <= 0) {
                        try {
                            if (!m7254()) {
                            }
                        } catch (Throwable th2) {
                            futureC5767.m12901(th2);
                        }
                    }
                    futureC5767.m12906(interfaceC22729.apply(obj));
                }
            }
            this.f7980 = null;
            this.f7978 = null;
            this.f20398 = null;
            return futureC5767.m12885(futureC5768, i);
        }
        return null;
    }
}
