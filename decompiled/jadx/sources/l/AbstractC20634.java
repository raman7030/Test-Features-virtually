package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20634 extends AbstractC6522 implements InterfaceC3700, InterfaceC12433 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo30699(int i, long j);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo30700(int i, long j);

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

    @Override // l.AbstractC20278, java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f20157 > 0;
    }

    @Override // l.InterfaceC3700
    /* JADX INFO: renamed from: ܿ֫ */
    public long mo11286() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f20157 - 1;
        this.f20157 = i;
        this.f20156 = i;
        return mo18035(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20157;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20157 - 1;
    }

    @Override // l.InterfaceC3700
    public void add(long j) {
        int i = this.f20157;
        this.f20157 = i + 1;
        mo30699(i, j);
        this.f20156 = -1;
    }

    @Override // l.InterfaceC3700
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11287(long j) {
        int i = this.f20156;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo30700(i, j);
    }
}
