package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21979 extends AbstractC8567 implements InterfaceC5885, InterfaceC14185 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo32774(int i, long j);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo32775(int i, long j);

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

    @Override // p067l.AbstractC21641, java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f23035 > 0;
    }

    @Override // p067l.InterfaceC5885
    /* JADX INFO: renamed from: ܿ֫ */
    public long mo13233() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f23035 - 1;
        this.f23035 = i;
        this.f23034 = i;
        return mo19984(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23035;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23035 - 1;
    }

    @Override // p067l.InterfaceC5885
    public void add(long j) {
        int i = this.f23035;
        this.f23035 = i + 1;
        mo32774(i, j);
        this.f23034 = -1;
    }

    @Override // p067l.InterfaceC5885
    /* JADX INFO: renamed from: ᩳ */
    public final void mo13234(long j) {
        int i = this.f23034;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo32775(i, j);
    }
}
