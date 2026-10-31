package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.۫ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes3.dex */
public final class C12378 extends AbstractList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22961 f37108;

    public C12378(C22961 c22961) {
        this.f37108 = c22961;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C22961 c22961 = this.f37108;
            if (i < c22961.f73948) {
                if (c22961.f73951.f41106) {
                    return new C6028(c22961, (i * c22961.f73949) + c22961.f73950);
                }
                return new C10262(c22961, (i * c22961.f73949) + c22961.f73950);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37108.f73948;
    }
}
