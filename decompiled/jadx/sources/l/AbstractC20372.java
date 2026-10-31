package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20372 {
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo18728(Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo18729(Object obj);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m46688(Iterable iterable) {
        if (iterable == null) {
            return AbstractC14545.of();
        }
        if (iterable instanceof AbstractC14545) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!mo18728(it.next())) {
                }
            }
            return (AbstractC14545) iterable;
        }
        return AbstractC14545.m34732(new C21783(this, iterable.iterator()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6079 m46689(Iterable iterable) {
        if (iterable == null) {
            return AbstractC6079.of();
        }
        if (iterable instanceof AbstractC6079) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!mo18728(it.next())) {
                }
            }
            return (AbstractC6079) iterable;
        }
        return AbstractC6079.m16989(new C22488(this, iterable.iterator()));
    }
}
