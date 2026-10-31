package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11627 implements InterfaceC15132, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f34647;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10901 f34648;

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

    public C11627(C10901 c10901, int i) {
        this.f34648 = c10901;
        this.f34647 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f34647 < this.f34648.f32775.length;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f34647 > 0;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (hasNext()) {
            int[] iArr = this.f34648.f32775;
            int i = this.f34647;
            this.f34647 = i + 1;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        if (hasPrevious()) {
            int[] iArr = this.f34648.f32775;
            int i = this.f34647 - 1;
            this.f34647 = i;
            return iArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34647;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34647 - 1;
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f34648.f32775;
        while (true) {
            int i = this.f34647;
            if (i >= iArr.length) {
                return;
            }
            this.f34647 = i + 1;
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
