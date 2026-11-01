package p067l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۘ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6105 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C3422 f15355;

    public C6105(C3422 c3422) {
        this.f15355 = c3422;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        C3422 c3422 = this.f15355;
        if (c3422.f6814) {
            c3422.m6059();
        }
        return ((C17503) c3422.f6815.get(i)).f52337;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C3422 c3422 = this.f15355;
        if (c3422.f6814) {
            c3422.m6059();
        }
        return c3422.f6815.size() - 1;
    }
}
