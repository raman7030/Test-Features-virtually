package p067l;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes3.dex */
public final class C13207 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final Iterator f37101;

    /* JADX INFO: renamed from: ᩹ */
    public final Deque f37102;

    public C13207(AbstractC3857 abstractC3857, Deque deque) {
        this.f37102 = deque;
        if (abstractC3857.m7601()) {
            this.f37101 = ((C21293) deque).descendingIterator();
        } else {
            this.f37101 = ((C21293) deque).iterator();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Deque m30209() {
        return this.f37102;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37101.hasNext();
    }

    @Override // java.util.Iterator
    public final InterfaceC11866 next() {
        return (InterfaceC11866) this.f37101.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f37101.remove();
    }
}
