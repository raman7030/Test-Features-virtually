package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C3386 implements InterfaceC15132, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC15132 f10690;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12558 f10691;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo5654((Integer) obj);
    }

    @Override // l.InterfaceC20881
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6667, l.InterfaceC14529, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // l.InterfaceC14529
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C17352.$default$forEachRemaining((InterfaceC14529) this, intConsumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo5656((Integer) obj);
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

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    public C3386(C12558 c12558, InterfaceC15132 interfaceC15132) {
        this.f10691 = c12558;
        this.f10690 = interfaceC15132;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10690.nextIndex() - this.f10691.f37861;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10690.previousIndex() - this.f10691.f37861;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f10690.nextIndex() < this.f10691.f37860;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f10690.previousIndex() >= this.f10691.f37861;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f10690.nextInt();
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f10690.mo5655();
    }

    @Override // l.InterfaceC15132
    public final void add(int i) {
        this.f10690.add(i);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5653(int i) {
        this.f10690.mo5653(i);
    }

    @Override // l.InterfaceC15132, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f10690.remove();
    }
}
