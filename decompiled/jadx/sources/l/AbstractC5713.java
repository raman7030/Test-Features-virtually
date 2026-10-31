package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۛ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5713 extends AbstractC9947 implements InterfaceC10798, InterfaceC12433 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7200(int i, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7202(int i, Object obj);

    @Override // l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f30032 > 0;
    }

    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f30032 - 1;
        this.f30032 = i;
        this.f30031 = i;
        return mo7201(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30032;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30032 - 1;
    }

    @Override // l.InterfaceC10798, java.util.ListIterator
    public void add(Object obj) {
        int i = this.f30032;
        this.f30032 = i + 1;
        mo7200(i, obj);
        this.f30031 = -1;
    }

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f30031;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo7202(i, obj);
    }
}
