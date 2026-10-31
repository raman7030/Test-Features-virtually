package l;

/* JADX INFO: renamed from: l.ܺ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16274 extends AbstractC9220 {
    @Override // l.AbstractRunnableC4281
    /* JADX INFO: renamed from: ֫ */
    public final FutureC3575 mo2888(int i) {
        Object obj;
        FutureC3575 futureC3575;
        Object obj2;
        FutureC3575 futureC3576;
        Throwable th;
        FutureC3575 futureC3577 = this.f5207;
        if (futureC3577 == null || (obj = futureC3577.f11341) == null || (futureC3575 = this.f27908) == null || (obj2 = futureC3575.f11341) == null || (futureC3576 = this.f5205) == null) {
            return null;
        }
        if (futureC3576.f11341 == null) {
            if ((obj instanceof C24036) && (th = ((C24036) obj).f77869) != null) {
                futureC3576.m10913(obj, th);
            } else if ((obj2 instanceof C24036) && (th = ((C24036) obj2).f77869) != null) {
                obj = obj2;
                futureC3576.m10913(obj, th);
            } else {
                futureC3576.m10928();
            }
        }
        this.f5207 = null;
        this.f27908 = null;
        this.f5205 = null;
        if (futureC3575.f11342 != null) {
            Object obj3 = futureC3575.f11341;
            if (obj3 == null) {
                futureC3575.m10922();
            }
            if (i >= 0 && (obj3 != null || futureC3575.f11341 != null)) {
                futureC3575.m10926();
            }
        }
        return futureC3576.m10908(futureC3577, i);
    }
}
