package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܶᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17005 extends AbstractC10301 implements InterfaceC5607, InterfaceC14185 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12325(float f, int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo12327(float f, int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo4646(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Float.valueOf(mo4648());
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f28486 > 0;
    }

    /* JADX INFO: renamed from: ᩹ */
    public float mo4648() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f28486 - 1;
        this.f28486 = i;
        this.f28485 = i;
        return mo12326(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28486;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28486 - 1;
    }

    @Override // p067l.InterfaceC5607
    public void add(float f) {
        int i = this.f28486;
        this.f28486 = i + 1;
        mo12325(f, i);
        this.f28485 = -1;
    }

    @Override // p067l.InterfaceC5607
    /* JADX INFO: renamed from: ܽ */
    public final void mo4646(float f) {
        int i = this.f28485;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo12327(f, i);
    }
}
