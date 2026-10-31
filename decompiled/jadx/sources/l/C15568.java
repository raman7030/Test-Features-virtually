package l;

/* JADX INFO: renamed from: l.ܶ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15568 extends AbstractC1458 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC21423 f47977;

    @Override // l.AbstractRunnableC4281
    /* JADX INFO: renamed from: ֫ */
    public final FutureC3575 mo2888(int i) {
        Object obj;
        FutureC3575 futureC3575;
        InterfaceC21423 interfaceC21423;
        FutureC3575 futureC3576 = this.f5207;
        if (futureC3576 != null && (obj = futureC3576.f11341) != null && (futureC3575 = this.f5205) != null && (interfaceC21423 = this.f47977) != null) {
            if (futureC3575.m10918(obj, interfaceC21423, i > 0 ? null : this)) {
                this.f5207 = null;
                this.f5205 = null;
                this.f47977 = null;
                return futureC3575.m10908(futureC3576, i);
            }
        }
        return null;
    }
}
