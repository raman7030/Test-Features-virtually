package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4682 implements InterfaceC16750, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC16750 f10552;

    @Override // p067l.InterfaceC16750
    public final /* synthetic */ void add(int i) {
        C10046.m23408();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7884((Integer) obj);
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

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Integer.valueOf(mo7885());
    }

    @Override // p067l.InterfaceC16750, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C24798.m54479(this);
    }

    public C4682(InterfaceC16750 interfaceC16750) {
        this.f10552 = interfaceC16750;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f10552.hasNext();
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f10552.hasPrevious();
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        return this.f10552.nextInt();
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo7885() {
        return this.f10552.mo7885();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10552.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10552.previousIndex();
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        this.f10552.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator, p067l.InterfaceC8705, p067l.InterfaceC16177, p067l.InterfaceC14185
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
        this.f10552.forEachRemaining(consumer);
    }
}
