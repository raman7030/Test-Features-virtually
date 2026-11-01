package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11388 extends AbstractC22117 implements InterfaceC16750, InterfaceC14185 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7884((Integer) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo7886((Integer) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo26337(int i, int i2);

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7884(Integer num) {
        C10046.m23409((InterfaceC16750) this, num);
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo26338(int i, int i2);

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo7886(Integer num) {
        C10046.m23412((InterfaceC16750) this, num);
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Integer.valueOf(mo7885());
    }

    @Override // p067l.AbstractC23692, java.util.Iterator, java.util.ListIterator
    public final Integer next() {
        return C24798.m54479(this);
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f69977 > 0;
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۖ֫ */
    public int mo7885() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f69977 - 1;
        this.f69977 = i;
        this.f69976 = i;
        return mo34298(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f69977;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f69977 - 1;
    }

    @Override // p067l.InterfaceC16750
    public void add(int i) {
        int i2 = this.f69977;
        this.f69977 = i2 + 1;
        mo26337(i2, i);
        this.f69976 = -1;
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final void mo7883(int i) {
        int i2 = this.f69976;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        mo26338(i2, i);
    }
}
