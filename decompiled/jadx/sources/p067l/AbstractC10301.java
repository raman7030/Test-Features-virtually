package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10301 extends AbstractC20320 {

    /* JADX INFO: renamed from: ᩸ */
    public int f28485;

    /* JADX INFO: renamed from: ᩹ */
    public int f28486;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo12324();

    /* JADX INFO: renamed from: ۧ */
    public abstract float mo12326(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo12328(int i);

    public AbstractC10301(int i) {
        this.f28486 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28486 < mo12324();
    }

    @Override // p067l.InterfaceC3595
    public float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f28486;
        this.f28486 = i + 1;
        this.f28485 = i;
        return mo12326(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f28485;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo12328(i);
        int i2 = this.f28485;
        int i3 = this.f28486;
        if (i2 < i3) {
            this.f28486 = i3 - 1;
        }
        this.f28485 = -1;
    }

    @Override // p067l.InterfaceC3595
    /* JADX INFO: renamed from: ܽ */
    public void mo4647(InterfaceC6278 interfaceC6278) {
        while (this.f28486 < mo12324()) {
            int i = this.f28486;
            this.f28486 = i + 1;
            this.f28485 = i;
            interfaceC6278.mo14251(mo12326(i));
        }
    }
}
