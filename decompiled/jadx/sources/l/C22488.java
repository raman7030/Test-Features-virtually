package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22488 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20372 f72810;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f72811;

    public C22488(AbstractC20372 abstractC20372, Iterator it) {
        this.f72810 = abstractC20372;
        this.f72811 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72811.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f72810.mo18729(this.f72811.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f72811.remove();
    }
}
