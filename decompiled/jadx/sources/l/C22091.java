package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩹ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22091 extends AbstractList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12918 f71743;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C12918 c12918 = this.f71743;
            if (i < c12918.f38771) {
                if (c12918.f38783) {
                    return c12918.f38770.m41834(c12918, i);
                }
                return new C3266(c12918, i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C22091(C12918 c12918) {
        this.f71743 = c12918;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f71743.f38771;
    }
}
