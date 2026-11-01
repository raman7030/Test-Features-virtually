package p067l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3XQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18641 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC17970 f55648;

    public C18641(AbstractC17970 abstractC17970) {
        this.f55648 = abstractC17970;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f55648.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f55648.mo4365(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f55648.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C17061(this.f55648);
    }
}
