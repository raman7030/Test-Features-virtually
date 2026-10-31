package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1001 implements Iterator {
    public final Iterator a;

    public C1001(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return AbstractC22791.p(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
