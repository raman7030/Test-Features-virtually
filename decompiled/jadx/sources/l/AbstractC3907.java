package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3907 extends AbstractC2496 implements InterfaceC15194, InterfaceC12433 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7692((Character) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo7695((Character) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8109(char c, int i);

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7692(Character ch) {
        C8140.m21610((InterfaceC15194) this, ch);
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8110(char c, int i);

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo7695(Character ch) {
        C8140.m21612((InterfaceC15194) this, ch);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Character.valueOf(mo7697());
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return C8846.m22854(this);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f7952 > 0;
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩺֫ */
    public char mo7697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f7952 - 1;
        this.f7952 = i;
        this.f7951 = i;
        return mo7995(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7952;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7952 - 1;
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ۧ */
    public void mo7693(char c) {
        int i = this.f7952;
        this.f7952 = i + 1;
        mo8109(c, i);
        this.f7951 = -1;
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩳ */
    public final void mo7696(char c) {
        int i = this.f7951;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo8110(c, i);
    }
}
