package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C18995 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public int f56633 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC22349 f56634;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    public C18995(AbstractC22349 abstractC22349) {
        this.f56634 = abstractC22349;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56633 < this.f56634.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f56633;
        this.f56633 = i + 1;
        return this.f56634.getItem(i);
    }
}
