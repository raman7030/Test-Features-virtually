package p067l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16824 extends AbstractC3651 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Iterator f49801;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C22861 f49802;

    public C16824(C22861 c22861, Iterator it) {
        this.f49801 = it;
        this.f49802 = c22861;
    }

    @Override // p067l.AbstractC3651
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4282() {
        Iterator it = this.f49801;
        if (!it.hasNext()) {
            m6947();
            return null;
        }
        C15444 c15444 = (C15444) it.next();
        C22861 c22861 = this.f49802;
        if (c22861.f71983.f44130.compareTo(c15444.f44131) < 0) {
            C15444 c15444M35191 = c15444.m35191(c22861.f71983);
            AbstractC5861 abstractC5861 = c15444M35191.f44130;
            if (!c22861.f71985.m35188(abstractC5861)) {
                m6947();
                return null;
            }
            return new AbstractMap.SimpleImmutableEntry(abstractC5861, c15444M35191);
        }
        m6947();
        return null;
    }
}
