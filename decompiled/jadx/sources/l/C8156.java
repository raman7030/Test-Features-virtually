package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8156 extends AbstractC1349 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3675 f25144;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f25145;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21562 f25146;

    public C8156(C21562 c21562, Iterator it, AbstractC3675 abstractC3675) {
        this.f25145 = it;
        this.f25144 = abstractC3675;
        this.f25146 = c21562;
    }

    @Override // l.AbstractC1349
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1890() {
        Iterator it = this.f25145;
        if (!it.hasNext()) {
            m4715();
            return null;
        }
        C13758 c13758 = (C13758) it.next();
        if (!this.f25144.mo7489((Comparable) c13758.f41052)) {
            C13758 c13758M33076 = c13758.m33076(this.f25146.f69281);
            return new AbstractMap.SimpleImmutableEntry(c13758M33076.f41052, c13758M33076);
        }
        m4715();
        return null;
    }
}
