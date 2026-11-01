package p067l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20850 extends AbstractC3651 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Iterator f65507;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C7438 f65508;

    public C20850(C7438 c7438, Iterator it) {
        this.f65507 = it;
        this.f65508 = c7438;
    }

    @Override // p067l.AbstractC3651
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4282() {
        Iterator it = this.f65507;
        if (!it.hasNext()) {
            m6947();
            return null;
        }
        C15444 c15444 = (C15444) it.next();
        if (this.f65508.f19476.f44131.mo9571((Comparable) c15444.f44131)) {
            m6947();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c15444.f44131, c15444);
    }
}
