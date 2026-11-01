package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0644 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15918 extends AbstractC8543 {
    @Override // p067l.AbstractC8543
    /* JADX INFO: renamed from: ֫ */
    public final int mo19896() {
        return 0;
    }

    @Override // p067l.AbstractC8543
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8543 mo19898(Comparable comparable, Comparable comparable2) {
        return m36032(comparable.compareTo(comparable2));
    }

    @Override // p067l.AbstractC8543
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8543 mo19899(Object obj, Object obj2, Comparator comparator) {
        return m36032(comparator.compare(obj, obj2));
    }

    @Override // p067l.AbstractC8543
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8543 mo19897(int i, int i2) {
        return m36032(Integer.compare(i, i2));
    }

    @Override // p067l.AbstractC8543
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8543 mo19901(boolean z, boolean z2) {
        return m36032(Boolean.compare(z2, z));
    }

    @Override // p067l.AbstractC8543
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8543 mo19900(boolean z, boolean z2) {
        return m36032(Boolean.compare(z, z2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8543 m36032(int i) {
        if (i < 0) {
            return AbstractC8543.f22932;
        }
        return i > 0 ? AbstractC8543.f22931 : AbstractC8543.f22930;
    }
}
