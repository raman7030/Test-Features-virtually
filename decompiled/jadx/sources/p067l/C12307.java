package p067l;

/* JADX INFO: renamed from: l.ۤᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12307 extends AbstractC19663 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final int f34355;

    /* JADX INFO: renamed from: ۬ */
    public final int f34356;

    @Override // p067l.AbstractC19663
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ boolean mo28351(AbstractC19663 abstractC19663) {
        return false;
    }

    public C12307(int i, C15020 c15020, int i2, C24376 c24376, int i3) {
        int i4;
        super(i, c15020, i2);
        this.f34356 = C12832.m29414(i3, c24376.f77172) ? 1 : 0;
        C10307 c10307 = this.f59793;
        int i5 = c10307.f28547;
        int i6 = -1;
        if (i5 != -1 && (i4 = c10307.f28523) != -1) {
            i6 = i5 * i4;
        }
        this.f34355 = i6;
    }

    @Override // p067l.AbstractC19663
    /* JADX INFO: renamed from: ֫ */
    public final int mo28349() {
        return this.f34356;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C12307 c12307) {
        return Integer.compare(this.f34355, c12307.f34355);
    }
}
