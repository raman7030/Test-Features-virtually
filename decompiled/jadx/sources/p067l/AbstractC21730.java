package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21730 {
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo20677(Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo20678(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 m49011(Iterable iterable) {
        if (iterable == null) {
            return AbstractC16192.m36872of();
        }
        if (iterable instanceof AbstractC16192) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!mo20677(it.next())) {
                }
            }
            return (AbstractC16192) iterable;
        }
        return AbstractC16192.m36881(new C23071(this, iterable.iterator()));
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8146 m49012(Iterable iterable) {
        if (iterable == null) {
            return AbstractC8146.m18915of();
        }
        if (iterable instanceof AbstractC8146) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!mo20677(it.next())) {
                }
            }
            return (AbstractC8146) iterable;
        }
        return AbstractC8146.m18920(new C23741(this, iterable.iterator()));
    }
}
