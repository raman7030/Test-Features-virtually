package p067l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.֡ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2743 extends AbstractC3651 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC8069 f4620;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C7438 f4621;

    public C2743(C7438 c7438, InterfaceC8069 interfaceC8069) {
        this.f4620 = interfaceC8069;
        this.f4621 = c7438;
    }

    @Override // p067l.AbstractC3651
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4282() {
        C23550 c23550 = (C23550) this.f4620;
        if (!c23550.hasNext()) {
            m6947();
            return null;
        }
        C15444 c15444 = (C15444) c23550.next();
        if (!this.f4621.f19476.f44130.mo9571((Comparable) c15444.f44131)) {
            m6947();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c15444.f44131, c15444);
    }
}
