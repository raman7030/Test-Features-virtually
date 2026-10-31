package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes4.dex */
public final class C7892 implements InterfaceC3700, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4365 f24455;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24456 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f24457;

    @Override // java.util.Iterator, l.InterfaceC6769, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14282.m34066(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo11287(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Long.valueOf(mo11286());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C7892(C4365 c4365, int i) {
        this.f24455 = c4365;
        this.f24457 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f24457 < this.f24455.f14035;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f24457 > 0;
    }

    @Override // l.InterfaceC6769
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f24455.f14034;
        int i = this.f24457;
        this.f24457 = i + 1;
        this.f24456 = i;
        return jArr[i];
    }

    @Override // l.InterfaceC3700
    /* JADX INFO: renamed from: ܿ֫ */
    public final long mo11286() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f24455.f14034;
        int i = this.f24457 - 1;
        this.f24457 = i;
        this.f24456 = i;
        return jArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24457;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24457 - 1;
    }

    @Override // l.InterfaceC3700
    public final void add(long j) {
        int i = this.f24457;
        this.f24457 = i + 1;
        this.f24455.mo7539(i, j);
        this.f24456 = -1;
    }

    @Override // l.InterfaceC3700
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11287(long j) {
        int i = this.f24456;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f24455.set(i, j);
    }

    @Override // l.InterfaceC3700, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f24456;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f24455.mo7545(i);
        int i2 = this.f24456;
        int i3 = this.f24457;
        if (i2 < i3) {
            this.f24457 = i3 - 1;
        }
        this.f24456 = -1;
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(LongConsumer longConsumer) {
        C4365 c4365 = this.f24455;
        long[] jArr = c4365.f14034;
        while (true) {
            int i = this.f24457;
            if (i >= c4365.f14035) {
                return;
            }
            this.f24457 = i + 1;
            this.f24456 = i;
            longConsumer.accept(jArr[i]);
        }
    }
}
