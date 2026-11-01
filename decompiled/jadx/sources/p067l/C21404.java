package p067l;

/* JADX INFO: renamed from: l.᩶۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21404 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f67497 = new byte[1048576];

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC18588 f67498;

    /* JADX INFO: renamed from: ܽ */
    public final C12016 f67499;

    /* JADX INFO: renamed from: ܿ */
    public int f67500;

    /* JADX INFO: renamed from: ᩳ */
    public int f67501;

    public C21404(C12016 c12016, InterfaceC18588 interfaceC18588) {
        this.f67499 = c12016;
        this.f67498 = interfaceC18588;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48479(int i) {
        int i2 = this.f67501;
        int i3 = i2 + 1;
        this.f67501 = i3;
        byte[] bArr = this.f67497;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m48477();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48480(int i, byte[] bArr) throws C25008 {
        int i2 = 0;
        while (i > 0) {
            byte[] bArr2 = this.f67497;
            int iMin = Math.min(i, bArr2.length - this.f67501);
            System.arraycopy(bArr, i2, bArr2, this.f67501, iMin);
            int i3 = this.f67501 + iMin;
            this.f67501 = i3;
            i2 += iMin;
            i -= iMin;
            if (i3 == bArr2.length) {
                m48477();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48478() throws C25008 {
        m48477();
        C7992.m18515(this.f67498);
        return this.f67500;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m48477() throws C25008 {
        if (this.f67501 == 0) {
            return;
        }
        C7992.m18515(this.f67498);
        int i = this.f67500;
        int i2 = this.f67501;
        if (i > Integer.MAX_VALUE - i2) {
            throw new C9174();
        }
        this.f67499.m27509(i2, this.f67497);
        this.f67500 += this.f67501;
        this.f67501 = 0;
    }
}
