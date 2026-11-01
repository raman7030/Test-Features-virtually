package p067l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۚ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes2.dex */
public final class C7457 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public Iterator f19524;

    /* JADX INFO: renamed from: ᩶ */
    public Iterator f19525;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f19526 = C2762.f4657;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayDeque f19527;

    public C7457(Iterator it) {
        this.f19524 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f19526;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f19524;
                if (it3 == null || !it3.hasNext()) {
                    ArrayDeque arrayDeque = this.f19527;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        it = null;
                        break;
                    }
                    this.f19524 = (Iterator) this.f19527.removeFirst();
                } else {
                    it = this.f19524;
                    break;
                }
            }
            this.f19524 = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f19526 = it4;
            if (it4 instanceof C7457) {
                C7457 c7457 = (C7457) it4;
                this.f19526 = c7457.f19526;
                if (this.f19527 == null) {
                    this.f19527 = new ArrayDeque();
                }
                this.f19527.addFirst(this.f19524);
                if (c7457.f19527 != null) {
                    while (!c7457.f19527.isEmpty()) {
                        this.f19527.addFirst((Iterator) c7457.f19527.removeLast());
                    }
                }
                this.f19524 = c7457.f19524;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Iterator it = this.f19526;
            this.f19525 = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f19525;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f19525 = null;
    }
}
