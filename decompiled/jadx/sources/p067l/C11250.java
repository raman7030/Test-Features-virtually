package p067l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۢۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11250 implements InterfaceC5885, Serializable, Cloneable, InterfaceC14185 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Iterator, p067l.InterfaceC8802, p067l.InterfaceC14185
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // p067l.InterfaceC8802
    public final void forEachRemaining(LongConsumer longConsumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
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

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Long) obj).longValue());
        throw null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo13234(((Long) obj).longValue());
        throw null;
    }

    @Override // p067l.InterfaceC5885
    /* JADX INFO: renamed from: ᩳ */
    public final void mo13234(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC22214
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        mo13233();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator, p067l.InterfaceC8802
    public final Long next() {
        nextLong();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        nextLong();
        throw null;
    }

    @Override // p067l.InterfaceC5885
    public final void add(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC8802
    public final long nextLong() {
        throw new NoSuchElementException();
    }

    @Override // p067l.InterfaceC5885
    /* JADX INFO: renamed from: ܿ֫ */
    public final long mo13233() {
        throw new NoSuchElementException();
    }

    @Override // p067l.InterfaceC5885, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C10579.f29293;
    }

    private Object readResolve() {
        return C10579.f29293;
    }
}
