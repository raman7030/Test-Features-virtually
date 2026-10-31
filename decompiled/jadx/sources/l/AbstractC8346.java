package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8346 extends AbstractC18888 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25571;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25572;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10287();

    /* JADX INFO: renamed from: ۧ */
    public abstract float mo10289(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo10291(int i);

    public AbstractC8346(int i) {
        this.f25572 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25572 < mo10287();
    }

    @Override // l.InterfaceC1290
    public float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f25572;
        this.f25572 = i + 1;
        this.f25571 = i;
        return mo10289(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f25571;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo10291(i);
        int i2 = this.f25571;
        int i3 = this.f25572;
        if (i2 < i3) {
            this.f25572 = i3 - 1;
        }
        this.f25571 = -1;
    }

    @Override // l.InterfaceC1290
    /* JADX INFO: renamed from: ܽ */
    public void mo2280(InterfaceC4113 interfaceC4113) {
        while (this.f25572 < mo10287()) {
            int i = this.f25572;
            this.f25572 = i + 1;
            this.f25571 = i;
            interfaceC4113.mo12346(mo10289(i));
        }
    }
}
