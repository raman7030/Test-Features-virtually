package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۛ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7798 extends AbstractC11822 implements InterfaceC12631, InterfaceC14185 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9279(int i, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo9281(int i, Object obj);

    @Override // p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f32989 > 0;
    }

    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f32989 - 1;
        this.f32989 = i;
        this.f32988 = i;
        return mo9280(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32989;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32989 - 1;
    }

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public void add(Object obj) {
        int i = this.f32989;
        this.f32989 = i + 1;
        mo9279(i, obj);
        this.f32988 = -1;
    }

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f32988;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo9281(i, obj);
    }
}
