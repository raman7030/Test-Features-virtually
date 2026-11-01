package p067l;

/* JADX INFO: renamed from: l.֡᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C3084 extends AbstractC3755 {

    /* JADX INFO: renamed from: ܰ */
    public C9158 f5578;

    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 mo5217(int i) {
        Object obj;
        FutureC5767 futureC5767;
        C9158 c9158;
        FutureC5767 futureC5768 = this.f7980;
        if (futureC5768 != null && (obj = futureC5768.f14147) != null && (futureC5767 = this.f7978) != null && (c9158 = this.f5578) != null) {
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
                        c9158.m21100(obj);
                        futureC5767.m12905();
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
                    c9158.m21100(obj);
                    futureC5767.m12905();
                }
            }
            this.f7980 = null;
            this.f7978 = null;
            this.f5578 = null;
            return futureC5767.m12885(futureC5768, i);
        }
        return null;
    }
}
