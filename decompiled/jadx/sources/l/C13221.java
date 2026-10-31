package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13221 implements InterfaceC3700, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC3700 f39582;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10400 f39583;

    @Override // l.InterfaceC20881
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((LongConsumer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6769, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14282.m34066(this, consumer);
    }

    @Override // l.InterfaceC6769
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C23702.$default$forEachRemaining((InterfaceC6769) this, longConsumer);
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

    public C13221(C10400 c10400, InterfaceC3700 interfaceC3700) {
        this.f39583 = c10400;
        this.f39582 = interfaceC3700;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39582.nextIndex() - this.f39583.f31293;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39582.previousIndex() - this.f39583.f31293;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f39582.nextIndex() < this.f39583.f31292;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f39582.previousIndex() >= this.f39583.f31293;
    }

    @Override // l.InterfaceC6769
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f39582.nextLong();
    }

    @Override // l.InterfaceC3700
    /* JADX INFO: renamed from: ܿ֫ */
    public final long mo11286() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f39582.mo11286();
    }

    @Override // l.InterfaceC3700
    public final void add(long j) {
        this.f39582.add(j);
    }

    @Override // l.InterfaceC3700
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11287(long j) {
        this.f39582.mo11287(j);
    }

    @Override // l.InterfaceC3700, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f39582.remove();
    }
}
