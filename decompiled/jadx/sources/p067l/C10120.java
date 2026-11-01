package p067l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10120 extends AbstractC3651 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AbstractC5861 f28056;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Iterator f28057;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C22861 f28058;

    public C10120(C22861 c22861, Iterator it, AbstractC5861 abstractC5861) {
        this.f28057 = it;
        this.f28056 = abstractC5861;
        this.f28058 = c22861;
    }

    @Override // p067l.AbstractC3651
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4282() {
        Iterator it = this.f28057;
        if (!it.hasNext()) {
            m6947();
            return null;
        }
        C15444 c15444 = (C15444) it.next();
        if (!this.f28056.mo9571((Comparable) c15444.f44130)) {
            C15444 c15444M35191 = c15444.m35191(this.f28058.f71983);
            return new AbstractMap.SimpleImmutableEntry(c15444M35191.f44130, c15444M35191);
        }
        m6947();
        return null;
    }
}
