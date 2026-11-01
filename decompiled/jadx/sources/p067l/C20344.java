package p067l;

/* JADX INFO: renamed from: l.ᩴᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D4F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20344 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f62827;

    /* JADX INFO: renamed from: ۧ */
    public int f62828;

    /* JADX INFO: renamed from: ܳ */
    public C20344 f62829;

    /* JADX INFO: renamed from: ܽ */
    public C20344 f62830;

    /* JADX INFO: renamed from: ܿ */
    public int f62831;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f62832;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f62833;

    public C20344() {
        this.f62827 = new byte[8192];
        this.f62832 = true;
        this.f62833 = false;
    }

    public C20344(byte[] bArr, int i, int i2) {
        this.f62827 = bArr;
        this.f62831 = i;
        this.f62828 = i2;
        this.f62833 = true;
        this.f62832 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20344 m45925() {
        this.f62833 = true;
        return new C20344(this.f62827, this.f62831, this.f62828);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20344 m45922() {
        C20344 c20344 = this.f62830;
        C20344 c20345 = c20344 != this ? c20344 : null;
        C20344 c20346 = this.f62829;
        c20346.f62830 = c20344;
        this.f62830.f62829 = c20346;
        this.f62830 = null;
        this.f62829 = null;
        return c20345;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45923(C20344 c20344) {
        c20344.f62829 = this;
        c20344.f62830 = this.f62830;
        this.f62830.f62829 = c20344;
        this.f62830 = c20344;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45924(C20344 c20344, int i) {
        boolean z = c20344.f62832;
        byte[] bArr = c20344.f62827;
        if (!z) {
            throw new IllegalArgumentException();
        }
        int i2 = c20344.f62828;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c20344.f62833) {
                throw new IllegalArgumentException();
            }
            int i4 = c20344.f62831;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c20344.f62828 -= c20344.f62831;
            c20344.f62831 = 0;
        }
        System.arraycopy(this.f62827, this.f62831, bArr, c20344.f62828, i);
        c20344.f62828 += i;
        this.f62831 += i;
    }
}
