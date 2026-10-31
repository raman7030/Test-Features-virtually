package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.֡ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0394 extends AbstractC1349 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5998 f1843;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5334 f1844;

    public C0394(C5334 c5334, InterfaceC5998 interfaceC5998) {
        this.f1843 = interfaceC5998;
        this.f1844 = c5334;
    }

    @Override // l.AbstractC1349
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo1890() {
        C22287 c22287 = (C22287) this.f1843;
        if (!c22287.hasNext()) {
            m4715();
            return null;
        }
        C13758 c13758 = (C13758) c22287.next();
        if (!this.f1844.f16637.f41052.mo7489((Comparable) c13758.f41053)) {
            m4715();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c13758.f41053, c13758);
    }
}
