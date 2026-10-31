package l;

/* JADX INFO: renamed from: l.۠᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8514 extends AbstractC1458 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC21423 f26027;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r3.f11341 == null) goto L33;
     */
    @Override // l.AbstractRunnableC4281
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FutureC3575 mo2888(int i) {
        Object obj;
        FutureC3575 futureC3575;
        InterfaceC21423 interfaceC21423;
        FutureC3575 futureC3576 = this.f5207;
        if (futureC3576 != null && (obj = futureC3576.f11341) != null && (futureC3575 = this.f5205) != null && (interfaceC21423 = this.f26027) != null) {
            if (futureC3575.f11341 == null) {
                if (obj instanceof C24036) {
                    Throwable th = ((C24036) obj).f77869;
                    if (th != null) {
                        futureC3575.m10913(obj, th);
                    } else {
                        obj = null;
                    }
                }
                if (i <= 0) {
                    try {
                        if (!m5011()) {
                        }
                    } catch (Throwable th2) {
                        futureC3575.m10924(th2);
                    }
                }
                FutureC3575 futureC3575Mo10906 = ((InterfaceC12747) interfaceC21423.apply(obj)).mo10906();
                Object obj2 = futureC3575Mo10906.f11341;
                if (obj2 != null) {
                    futureC3575.m10923(obj2);
                } else {
                    futureC3575Mo10906.m10925((AbstractRunnableC4281) new C22625(null, futureC3575, futureC3575Mo10906));
                }
            }
            this.f5207 = null;
            this.f5205 = null;
            this.f26027 = null;
            return futureC3575.m10908(futureC3576, i);
        }
        return null;
    }
}
