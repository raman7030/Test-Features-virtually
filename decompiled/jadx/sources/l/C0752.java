package l;

/* JADX INFO: renamed from: l.֡᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C0752 extends AbstractC1458 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7144 f2805;

    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // l.AbstractRunnableC4281
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 mo2888(int i) {
        Object obj;
        FutureC3575 futureC3575;
        C7144 c7144;
        FutureC3575 futureC3576 = this.f5207;
        if (futureC3576 != null && (obj = futureC3576.f11341) != null && (futureC3575 = this.f5205) != null && (c7144 = this.f2805) != null) {
            if (futureC3575.f11341 == null) {
                if (obj instanceof C24036) {
                    Throwable th = ((C24036) obj).f77869;
                    if (th != null) {
                        futureC3575.m10913(obj, th);
                    } else {
                        obj = null;
                        if (i <= 0) {
                            if (!m5011()) {
                            }
                        }
                        c7144.m19157(obj);
                        futureC3575.m10928();
                    }
                } else {
                    if (i <= 0) {
                        try {
                            if (!m5011()) {
                            }
                        } catch (Throwable th2) {
                            futureC3575.m10924(th2);
                        }
                    }
                    c7144.m19157(obj);
                    futureC3575.m10928();
                }
            }
            this.f5207 = null;
            this.f5205 = null;
            this.f2805 = null;
            return futureC3575.m10908(futureC3576, i);
        }
        return null;
    }
}
