package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21752 implements InterfaceC3407, Serializable, Cloneable, InterfaceC12433 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Iterator, l.InterfaceC12433
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
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

    @Override // l.InterfaceC1290
    /* JADX INFO: renamed from: ܽ */
    public final void mo2280(InterfaceC4113 interfaceC4113) {
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
        throw null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2279(((Float) obj).floatValue());
        throw null;
    }

    @Override // l.InterfaceC3407
    /* JADX INFO: renamed from: ܽ */
    public final void mo2279(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        mo2281();
        throw null;
    }

    @Override // l.InterfaceC20881
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        nextFloat();
        throw null;
    }

    @Override // l.InterfaceC3407
    public final void add(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1290
    public final float nextFloat() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC3407
    /* JADX INFO: renamed from: ᩹ */
    public final float mo2281() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC3407, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C22457.f72735;
    }

    private Object readResolve() {
        return C22457.f72735;
    }
}
