package p067l;

/* JADX INFO: renamed from: l.۠᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10461 extends AbstractC3755 {

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC22729 f28942;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r3.f14147 == null) goto L33;
     */
    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FutureC5767 mo5217(int i) {
        Object obj;
        FutureC5767 futureC5767;
        InterfaceC22729 interfaceC22729;
        FutureC5767 futureC5768 = this.f7980;
        if (futureC5768 != null && (obj = futureC5768.f14147) != null && (futureC5767 = this.f7978) != null && (interfaceC22729 = this.f28942) != null) {
            if (futureC5767.f14147 == null) {
                if (obj instanceof C25213) {
                    Throwable th = ((C25213) obj).f80621;
                    if (th != null) {
                        futureC5767.m12890(obj, th);
                    } else {
                        obj = null;
                    }
                }
                if (i <= 0) {
                    try {
                        if (!m7254()) {
                        }
                    } catch (Throwable th2) {
                        futureC5767.m12901(th2);
                    }
                }
                FutureC5767 futureC5767Mo12883 = ((InterfaceC14484) interfaceC22729.apply(obj)).mo12883();
                Object obj2 = futureC5767Mo12883.f14147;
                if (obj2 != null) {
                    futureC5767.m12900(obj2);
                } else {
                    futureC5767Mo12883.m12902((AbstractRunnableC6438) new C23872(null, futureC5767, futureC5767Mo12883));
                }
            }
            this.f7980 = null;
            this.f7978 = null;
            this.f28942 = null;
            return futureC5767.m12885(futureC5768, i);
        }
        return null;
    }
}
