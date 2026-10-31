package l;

/* JADX INFO: renamed from: l.ۤ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10151 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30529 = new byte[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f30530;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f30531;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30532 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11122 f30533;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f30534;

    public C10151(C11122 c11122, int i, int i2, InterfaceC17066 interfaceC17066) {
        this.f30533 = c11122;
        this.f30531 = i;
        this.f30534 = i2;
        this.f30530 = interfaceC17066;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25490(int i, byte[] bArr) {
        if (i == 0) {
            return;
        }
        int i2 = this.f30531;
        this.f30533.m27598(i2, this.f30532 ? this.f30534 : i2, bArr, i, this.f30530);
        try {
            long j = ((long) this.f30531) + ((long) i);
            int i3 = (int) j;
            if (j != i3) {
                throw new ArithmeticException();
            }
            this.f30531 = i3;
            this.f30532 = false;
        } catch (ArithmeticException unused) {
            throw new C7161();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25489() {
        if (this.f30532) {
            this.f30533.m27598(this.f30531, this.f30534, f30529, 0, this.f30530);
            this.f30532 = false;
        }
    }
}
