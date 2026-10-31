package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۢۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9345 implements InterfaceC3700, Serializable, Cloneable, InterfaceC12433 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Iterator, l.InterfaceC6769, l.InterfaceC12433
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC6769
    public final void forEachRemaining(LongConsumer longConsumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
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
        mo11287(((Long) obj).longValue());
        throw null;
    }

    @Override // l.InterfaceC3700
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11287(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC20881
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        mo11286();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator, l.InterfaceC6769
    public final Long next() {
        nextLong();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        nextLong();
        throw null;
    }

    @Override // l.InterfaceC3700
    public final void add(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC6769
    public final long nextLong() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC3700
    /* JADX INFO: renamed from: ܿ֫ */
    public final long mo11286() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC3700, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C8639.f26375;
    }

    private Object readResolve() {
        return C8639.f26375;
    }
}
