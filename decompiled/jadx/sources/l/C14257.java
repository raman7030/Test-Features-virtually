package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0644 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14257 extends AbstractC6497 {
    @Override // l.AbstractC6497
    /* JADX INFO: renamed from: ֫ */
    public final int mo17948() {
        return 0;
    }

    @Override // l.AbstractC6497
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6497 mo17950(Comparable comparable, Comparable comparable2) {
        return m33900(comparable.compareTo(comparable2));
    }

    @Override // l.AbstractC6497
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6497 mo17951(Object obj, Object obj2, Comparator comparator) {
        return m33900(comparator.compare(obj, obj2));
    }

    @Override // l.AbstractC6497
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6497 mo17949(int i, int i2) {
        return m33900(Integer.compare(i, i2));
    }

    @Override // l.AbstractC6497
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6497 mo17953(boolean z, boolean z2) {
        return m33900(Boolean.compare(z2, z));
    }

    @Override // l.AbstractC6497
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6497 mo17952(boolean z, boolean z2) {
        return m33900(Boolean.compare(z, z2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6497 m33900(int i) {
        if (i < 0) {
            return AbstractC6497.f20058;
        }
        return i > 0 ? AbstractC6497.f20057 : AbstractC6497.f20056;
    }
}
