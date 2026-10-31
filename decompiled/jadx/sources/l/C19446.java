package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19446 extends AbstractC1349 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f62891;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5334 f62892;

    public C19446(C5334 c5334, Iterator it) {
        this.f62891 = it;
        this.f62892 = c5334;
    }

    @Override // l.AbstractC1349
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1890() {
        Iterator it = this.f62891;
        if (!it.hasNext()) {
            m4715();
            return null;
        }
        C13758 c13758 = (C13758) it.next();
        if (this.f62892.f16637.f41053.mo7489((Comparable) c13758.f41053)) {
            m4715();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c13758.f41053, c13758);
    }
}
