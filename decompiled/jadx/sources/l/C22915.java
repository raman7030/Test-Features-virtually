package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22915 implements InterfaceC15132, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73853;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7393 f73854;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo5654((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6667, l.InterfaceC14529, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
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

    public C22915(C7393 c7393, int i) {
        this.f73854 = c7393;
        this.f73853 = i + c7393.f22757;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f73853 < this.f73854.f22754;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f73853 > this.f73854.f22757;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f73854.f22756;
        int i = this.f73853;
        this.f73853 = i + 1;
        return iArr[i];
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f73854.f22756;
        int i = this.f73853 - 1;
        this.f73853 = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f73853 - this.f73854.f22757;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.f73853 - this.f73854.f22757) - 1;
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        C7393 c7393 = this.f73854;
        int[] iArr = c7393.f22756;
        while (true) {
            int i = this.f73853;
            if (i >= c7393.f22754) {
                return;
            }
            this.f73853 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // l.InterfaceC15132
    public final void add(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5653(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC15132, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
