package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5IE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9568 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f29023;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo5897(Object obj);

    public AbstractC9568(Iterator it) {
        it.getClass();
        this.f29023 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29023.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo5897(this.f29023.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f29023.remove();
    }
}
