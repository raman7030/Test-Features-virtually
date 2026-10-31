package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۘ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3932 extends AbstractList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1109 f12547;

    public C3932(C1109 c1109) {
        this.f12547 = c1109;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        C1109 c1109 = this.f12547;
        if (c1109.f4043) {
            c1109.m3802();
        }
        return ((C15925) c1109.f4044.get(i)).f49190;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C1109 c1109 = this.f12547;
        if (c1109.f4043) {
            c1109.m3802();
        }
        return c1109.f4044.size() - 1;
    }
}
