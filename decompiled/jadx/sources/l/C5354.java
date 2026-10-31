package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۚ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5354 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Iterator f16685;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f16686;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f16687 = C0414.f1880;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayDeque f16688;

    public C5354(Iterator it) {
        this.f16685 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f16687;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f16685;
                if (it3 == null || !it3.hasNext()) {
                    ArrayDeque arrayDeque = this.f16688;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        it = null;
                        break;
                    }
                    this.f16685 = (Iterator) this.f16688.removeFirst();
                } else {
                    it = this.f16685;
                    break;
                }
            }
            this.f16685 = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f16687 = it4;
            if (it4 instanceof C5354) {
                C5354 c5354 = (C5354) it4;
                this.f16687 = c5354.f16687;
                if (this.f16688 == null) {
                    this.f16688 = new ArrayDeque();
                }
                this.f16688.addFirst(this.f16685);
                if (c5354.f16688 != null) {
                    while (!c5354.f16688.isEmpty()) {
                        this.f16688.addFirst((Iterator) c5354.f16688.removeLast());
                    }
                }
                this.f16685 = c5354.f16685;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Iterator it = this.f16687;
            this.f16686 = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f16686;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f16686 = null;
    }
}
