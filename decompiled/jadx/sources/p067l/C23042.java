package p067l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23042 implements InterfaceC5607, Serializable, Cloneable, InterfaceC14185 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Iterator, p067l.InterfaceC14185
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
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

    @Override // p067l.InterfaceC3595
    /* JADX INFO: renamed from: ܽ */
    public final void mo4647(InterfaceC6278 interfaceC6278) {
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
        throw null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo4646(((Float) obj).floatValue());
        throw null;
    }

    @Override // p067l.InterfaceC5607
    /* JADX INFO: renamed from: ܽ */
    public final void mo4646(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        mo4648();
        throw null;
    }

    @Override // p067l.InterfaceC22214
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        nextFloat();
        throw null;
    }

    @Override // p067l.InterfaceC5607
    public final void add(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3595
    public final float nextFloat() {
        throw new NoSuchElementException();
    }

    @Override // p067l.InterfaceC5607
    /* JADX INFO: renamed from: ᩹ */
    public final float mo4648() {
        throw new NoSuchElementException();
    }

    @Override // p067l.InterfaceC5607, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C23712.f75461;
    }

    private Object readResolve() {
        return C23712.f75461;
    }
}
