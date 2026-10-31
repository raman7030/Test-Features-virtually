package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18575 extends AbstractC1349 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f57628;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f57629;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f57630;

    public C18575(Set set, Set set2) {
        this.f57629 = set;
        this.f57628 = set2;
        this.f57630 = set.iterator();
    }

    @Override // l.AbstractC1349
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1890() {
        Object next;
        do {
            Iterator it = this.f57630;
            if (it.hasNext()) {
                next = it.next();
            } else {
                m4715();
                return null;
            }
        } while (!this.f57628.contains(next));
        return next;
    }
}
