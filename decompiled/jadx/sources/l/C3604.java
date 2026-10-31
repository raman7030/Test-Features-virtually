package l;

import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۘ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9OW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3604 implements ListIterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ListIterator f11427;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f11427.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f11427.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11427.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f11427.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11427.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11427.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
