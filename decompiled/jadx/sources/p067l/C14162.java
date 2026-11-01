package p067l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C14162 implements ListIterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ListIterator f40387;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f40388;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C12151 f40389;

    public C14162(C12151 c12151, ListIterator listIterator) {
        this.f40387 = listIterator;
        this.f40389 = c12151;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f40387;
        listIterator.add(obj);
        listIterator.previous();
        this.f40388 = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f40387.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f40387;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f40388 = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40387.hasNext();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f40387;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f40388 = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40389.m28074(this.f40387.nextIndex());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        C6194.m14035("no calls to next() since the last call to remove()", this.f40388);
        this.f40387.remove();
        this.f40388 = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        C6194.m14036(this.f40388);
        this.f40387.set(obj);
    }
}
