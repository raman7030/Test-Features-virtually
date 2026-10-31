package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15210 extends AbstractC1349 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f46677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21562 f46678;

    public C15210(C21562 c21562, Iterator it) {
        this.f46677 = it;
        this.f46678 = c21562;
    }

    @Override // l.AbstractC1349
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1890() {
        Iterator it = this.f46677;
        if (!it.hasNext()) {
            m4715();
            return null;
        }
        C13758 c13758 = (C13758) it.next();
        C21562 c21562 = this.f46678;
        if (c21562.f69281.f41052.compareTo(c13758.f41053) < 0) {
            C13758 c13758M33076 = c13758.m33076(c21562.f69281);
            AbstractC3675 abstractC3675 = c13758M33076.f41052;
            if (!c21562.f69283.m33073(abstractC3675)) {
                m4715();
                return null;
            }
            return new AbstractMap.SimpleImmutableEntry(abstractC3675, c13758M33076);
        }
        m4715();
        return null;
    }
}
