package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes4.dex */
public final class C9869 implements InterfaceC5885, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C6517 f27371;

    /* JADX INFO: renamed from: ᩸ */
    public int f27372 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f27373;

    @Override // java.util.Iterator, p067l.InterfaceC8802, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C15942.m36199(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo13234(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Long.valueOf(mo13233());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C9869(C6517 c6517, int i) {
        this.f27371 = c6517;
        this.f27373 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f27373 < this.f27371.f16850;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f27373 > 0;
    }

    @Override // p067l.InterfaceC8802
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f27371.f16849;
        int i = this.f27373;
        this.f27373 = i + 1;
        this.f27372 = i;
        return jArr[i];
    }

    @Override // p067l.InterfaceC5885
    /* JADX INFO: renamed from: ܿ֫ */
    public final long mo13233() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f27371.f16849;
        int i = this.f27373 - 1;
        this.f27373 = i;
        this.f27372 = i;
        return jArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27373;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27373 - 1;
    }

    @Override // p067l.InterfaceC5885
    public final void add(long j) {
        int i = this.f27373;
        this.f27373 = i + 1;
        this.f27371.mo9607(i, j);
        this.f27372 = -1;
    }

    @Override // p067l.InterfaceC5885
    /* JADX INFO: renamed from: ᩳ */
    public final void mo13234(long j) {
        int i = this.f27372;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f27371.set(i, j);
    }

    @Override // p067l.InterfaceC5885, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f27372;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f27371.mo9613(i);
        int i2 = this.f27372;
        int i3 = this.f27373;
        if (i2 < i3) {
            this.f27373 = i3 - 1;
        }
        this.f27372 = -1;
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(LongConsumer longConsumer) {
        C6517 c6517 = this.f27371;
        long[] jArr = c6517.f16849;
        while (true) {
            int i = this.f27373;
            if (i >= c6517.f16850) {
                return;
            }
            this.f27373 = i + 1;
            this.f27372 = i;
            longConsumer.accept(jArr[i]);
        }
    }
}
