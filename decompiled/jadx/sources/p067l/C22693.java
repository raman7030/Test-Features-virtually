package p067l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩸ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22693 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14645 f71578;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C14645 c14645 = this.f71578;
            if (i < c14645.f41829) {
                return new C14189(c14645, i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C22693(C14645 c14645) {
        this.f71578 = c14645;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f71578.f41829;
    }
}
