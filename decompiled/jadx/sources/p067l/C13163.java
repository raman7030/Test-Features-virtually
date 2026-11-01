package p067l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13163 implements InterfaceC12631, Serializable, Cloneable, InterfaceC14185 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        C6406.m14672();
        throw null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return false;
    }

    @Override // p067l.InterfaceC16514
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

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        C6406.m14674();
        throw null;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // p067l.InterfaceC16514
    public final Object previous() {
        throw new NoSuchElementException();
    }

    @Override // p067l.InterfaceC12631, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C23891.f75877;
    }

    private Object readResolve() {
        return C23891.f75877;
    }
}
