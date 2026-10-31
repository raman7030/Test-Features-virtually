package l;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11405 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f34104;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Deque f34105;

    public C11405(AbstractC1567 abstractC1567, Deque deque) {
        this.f34105 = deque;
        if (abstractC1567.m5372()) {
            this.f34104 = ((C19913) deque).descendingIterator();
        } else {
            this.f34104 = ((C19913) deque).iterator();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Deque m28165() {
        return this.f34105;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34104.hasNext();
    }

    @Override // java.util.Iterator
    public final InterfaceC9994 next() {
        return (InterfaceC9994) this.f34104.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f34104.remove();
    }
}
