package p067l;

/* JADX INFO: renamed from: l.ۤ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12016 {

    /* JADX INFO: renamed from: ܳ */
    public static final byte[] f33490 = new byte[0];

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18588 f33491;

    /* JADX INFO: renamed from: ۧ */
    public int f33492;

    /* JADX INFO: renamed from: ܽ */
    public boolean f33493 = true;

    /* JADX INFO: renamed from: ܿ */
    public final C12939 f33494;

    /* JADX INFO: renamed from: ᩳ */
    public final int f33495;

    public C12016(C12939 c12939, int i, int i2, InterfaceC18588 interfaceC18588) {
        this.f33494 = c12939;
        this.f33492 = i;
        this.f33495 = i2;
        this.f33491 = interfaceC18588;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27509(int i, byte[] bArr) {
        if (i == 0) {
            return;
        }
        int i2 = this.f33492;
        this.f33494.m29660(i2, this.f33493 ? this.f33495 : i2, bArr, i, this.f33491);
        try {
            long j = ((long) this.f33492) + ((long) i);
            int i3 = (int) j;
            if (j != i3) {
                throw new ArithmeticException();
            }
            this.f33492 = i3;
            this.f33493 = false;
        } catch (ArithmeticException unused) {
            throw new C9174();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27508() {
        if (this.f33493) {
            this.f33494.m29660(this.f33492, this.f33495, f33490, 0, this.f33491);
            this.f33493 = false;
        }
    }
}
