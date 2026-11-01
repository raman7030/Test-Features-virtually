package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3320 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f6494a;

    public C3320(Iterator it) {
        this.f6494a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6494a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return AbstractC24029.m53247p(this.f6494a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6494a.remove();
    }
}
