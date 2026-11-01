package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4741 extends AbstractC11512 {

    /* JADX INFO: renamed from: ᩸ */
    public int f10738;

    /* JADX INFO: renamed from: ᩹ */
    public int f10739;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10042();

    /* JADX INFO: renamed from: ۧ */
    public abstract char mo10043(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo10044(int i);

    public AbstractC4741(int i) {
        this.f10739 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10739 < mo10042();
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public char mo9752() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f10739;
        this.f10739 = i + 1;
        this.f10738 = i;
        return mo10043(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f10738;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo10044(i);
        int i2 = this.f10738;
        int i3 = this.f10739;
        if (i2 < i3) {
            this.f10739 = i3 - 1;
        }
        this.f10738 = -1;
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ۧ */
    public void mo9755(InterfaceC24857 interfaceC24857) {
        while (this.f10739 < mo10042()) {
            int i = this.f10739;
            this.f10739 = i + 1;
            this.f10738 = i;
            interfaceC24857.mo20276(mo10043(i));
        }
    }
}
