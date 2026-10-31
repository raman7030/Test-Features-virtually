package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12409 implements ListIterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ListIterator f37372;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f37373;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10293 f37374;

    public C12409(C10293 c10293, ListIterator listIterator) {
        this.f37372 = listIterator;
        this.f37374 = c10293;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f37372;
        listIterator.add(obj);
        listIterator.previous();
        this.f37373 = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f37372.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f37372;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f37373 = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37372.hasNext();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f37372;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37373 = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37374.m26050(this.f37372.nextIndex());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        C4025.m12115("no calls to next() since the last call to remove()", this.f37373);
        this.f37372.remove();
        this.f37373 = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        C4025.m12116(this.f37373);
        this.f37372.set(obj);
    }
}
