package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20022 extends AbstractC3651 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Set f60851;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Set f60852;

    /* JADX INFO: renamed from: ᩶ */
    public final Iterator f60853;

    public C20022(Set set, Set set2) {
        this.f60852 = set;
        this.f60851 = set2;
        this.f60853 = set.iterator();
    }

    @Override // p067l.AbstractC3651
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4282() {
        Object next;
        do {
            Iterator it = this.f60853;
            if (it.hasNext()) {
                next = it.next();
            } else {
                m6947();
                return null;
            }
        } while (!this.f60851.contains(next));
        return next;
    }
}
