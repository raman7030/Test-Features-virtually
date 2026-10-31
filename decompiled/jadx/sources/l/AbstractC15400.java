package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܶᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15400 extends AbstractC8346 implements InterfaceC3407, InterfaceC12433 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10288(float f, int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo10290(float f, int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2279(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Float.valueOf(mo2281());
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f25572 > 0;
    }

    /* JADX INFO: renamed from: ᩹ */
    public float mo2281() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f25572 - 1;
        this.f25572 = i;
        this.f25571 = i;
        return mo10289(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25572;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25572 - 1;
    }

    @Override // l.InterfaceC3407
    public void add(float f) {
        int i = this.f25572;
        this.f25572 = i + 1;
        mo10288(f, i);
        this.f25571 = -1;
    }

    @Override // l.InterfaceC3407
    /* JADX INFO: renamed from: ܽ */
    public final void mo2279(float f) {
        int i = this.f25571;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo10290(f, i);
    }
}
