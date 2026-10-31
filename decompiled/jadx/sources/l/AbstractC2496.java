package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2496 extends AbstractC9621 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7951;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7952;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo7994();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract char mo7995(int i);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo7996(int i);

    public AbstractC2496(int i) {
        this.f7952 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7952 < mo7994();
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public char mo7691() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f7952;
        this.f7952 = i + 1;
        this.f7951 = i;
        return mo7995(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f7951;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo7996(i);
        int i2 = this.f7951;
        int i3 = this.f7952;
        if (i2 < i3) {
            this.f7952 = i3 - 1;
        }
        this.f7951 = -1;
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ۧ */
    public void mo7694(InterfaceC23662 interfaceC23662) {
        while (this.f7952 < mo7994()) {
            int i = this.f7952;
            this.f7952 = i + 1;
            this.f7951 = i;
            interfaceC23662.mo18328(mo7995(i));
        }
    }
}
