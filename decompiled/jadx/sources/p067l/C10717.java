package p067l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes4.dex */
public final class C10717 implements InterfaceC16750, Serializable, Cloneable, InterfaceC14185 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // p067l.InterfaceC16750
    public final /* synthetic */ void add(int i) {
        C10046.m23408();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7884((Integer) obj);
    }

    @Override // java.util.Iterator, p067l.InterfaceC8705, p067l.InterfaceC16177, p067l.InterfaceC14185
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // p067l.InterfaceC16177
    public final void forEachRemaining(IntConsumer intConsumer) {
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
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo7886((Integer) obj);
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7883(int i) {
        C10046.m23411();
        throw null;
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7884(Integer num) {
        C10046.m23409((InterfaceC16750) this, num);
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo7886(Integer num) {
        C10046.m23412((InterfaceC16750) this, num);
    }

    @Override // p067l.InterfaceC22214
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        mo7885();
        throw null;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        throw new NoSuchElementException();
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo7885() {
        throw new NoSuchElementException();
    }

    @Override // p067l.InterfaceC16750, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C6023.f15086;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C24798.m54479(this);
    }

    private Object readResolve() {
        return C6023.f15086;
    }
}
