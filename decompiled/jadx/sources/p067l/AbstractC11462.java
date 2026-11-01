package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5IE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11462 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final Iterator f31970;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo8107(Object obj);

    public AbstractC11462(Iterator it) {
        it.getClass();
        this.f31970 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31970.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo8107(this.f31970.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f31970.remove();
    }
}
