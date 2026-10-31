package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9490 extends AbstractC20779 implements InterfaceC15132, InterfaceC12433 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo5654((Integer) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo5656((Integer) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo24327(int i, int i2);

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5654(Integer num) {
        C8078.m21441((InterfaceC15132) this, num);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo24328(int i, int i2);

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo5656(Integer num) {
        C8078.m21444((InterfaceC15132) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Integer.valueOf(mo5655());
    }

    @Override // l.AbstractC22436, java.util.Iterator, java.util.ListIterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f67293 > 0;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public int mo5655() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f67293 - 1;
        this.f67293 = i;
        this.f67292 = i;
        return mo32199(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f67293;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f67293 - 1;
    }

    @Override // l.InterfaceC15132
    public void add(int i) {
        int i2 = this.f67293;
        this.f67293 = i2 + 1;
        mo24327(i2, i);
        this.f67292 = -1;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5653(int i) {
        int i2 = this.f67292;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        mo24328(i2, i);
    }
}
