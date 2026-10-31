package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11358 implements InterfaceC10798, Serializable, Cloneable, InterfaceC12433 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        C4248.m12792();
        throw null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return false;
    }

    @Override // l.InterfaceC14884
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        C4248.m12794();
        throw null;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC14884
    public final Object previous() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC10798, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C22646.f73151;
    }

    private Object readResolve() {
        return C22646.f73151;
    }
}
