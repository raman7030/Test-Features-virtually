package l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1717 extends AbstractList {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C1717 f5940 = new C1717(AbstractC14545.of());

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5941 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f5942;

    public C1717(AbstractC14545 abstractC14545) {
        this.f5942 = abstractC14545;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (C23589) this.f5942.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5942.size();
    }
}
