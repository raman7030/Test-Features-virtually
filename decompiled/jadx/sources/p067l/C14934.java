package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14934 implements InterfaceC5885, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC5885 f42646;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C12253 f42647;

    @Override // p067l.InterfaceC22214
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((LongConsumer) obj);
    }

    @Override // java.util.Iterator, p067l.InterfaceC8802, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C15942.m36199(this, consumer);
    }

    @Override // p067l.InterfaceC8802
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C24895.$default$forEachRemaining((InterfaceC8802) this, longConsumer);
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

    public C14934(C12253 c12253, InterfaceC5885 interfaceC5885) {
        this.f42647 = c12253;
        this.f42646 = interfaceC5885;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f42646.nextIndex() - this.f42647.f34258;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f42646.previousIndex() - this.f42647.f34258;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f42646.nextIndex() < this.f42647.f34257;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f42646.previousIndex() >= this.f42647.f34258;
    }

    @Override // p067l.InterfaceC8802
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f42646.nextLong();
    }

    @Override // p067l.InterfaceC5885
    /* JADX INFO: renamed from: ܿ֫ */
    public final long mo13233() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f42646.mo13233();
    }

    @Override // p067l.InterfaceC5885
    public final void add(long j) {
        this.f42646.add(j);
    }

    @Override // p067l.InterfaceC5885
    /* JADX INFO: renamed from: ᩳ */
    public final void mo13234(long j) {
        this.f42646.mo13234(j);
    }

    @Override // p067l.InterfaceC5885, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f42646.remove();
    }
}
