package p067l;

import java.util.ListIterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2747 implements ListIterator, InterfaceC14185 {

    /* JADX INFO: renamed from: a */
    public final ListIterator f4627a;

    public C2747(C3418 c3418, int i) {
        this.f4627a = c3418.f6781b.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4627a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f4627a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4627a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f4627a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4627a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4627a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C14855.forEachRemaining(this.f4627a, consumer);
    }
}
