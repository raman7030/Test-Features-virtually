package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩸ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21386 extends AbstractList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12918 f68883;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C12918 c12918 = this.f68883;
            if (i < c12918.f38788) {
                return new C12438(c12918, i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C21386(C12918 c12918) {
        this.f68883 = c12918;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f68883.f38788;
    }
}
