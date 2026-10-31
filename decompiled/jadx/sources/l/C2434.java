package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2434 implements InterfaceC15132, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC15132 f7761;

    @Override // l.InterfaceC15132
    public final /* synthetic */ void add(int i) {
        C8078.m21440();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo5654((Integer) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo5656((Integer) obj);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5653(int i) {
        C8078.m21443();
        throw null;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5654(Integer num) {
        C8078.m21441((InterfaceC15132) this, num);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo5656(Integer num) {
        C8078.m21444((InterfaceC15132) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Integer.valueOf(mo5655());
    }

    @Override // l.InterfaceC15132, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    public C2434(InterfaceC15132 interfaceC15132) {
        this.f7761 = interfaceC15132;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7761.hasNext();
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f7761.hasPrevious();
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        return this.f7761.nextInt();
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        return this.f7761.mo5655();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7761.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7761.previousIndex();
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        this.f7761.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator, l.InterfaceC6667, l.InterfaceC14529, l.InterfaceC12433
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
        this.f7761.forEachRemaining(consumer);
    }
}
