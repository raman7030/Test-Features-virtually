package l;

/* JADX INFO: renamed from: l.֨᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OA16 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1333 implements InterfaceC8079 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f4798 = new byte[16];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f4799;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4800;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f4801;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m4665() {
        return this.f4800;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] m4667() {
        return this.f4798;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m4664() {
        return this.f4799;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m4666() {
        return this.f4801;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f4800 = C1480.m5123(i, bArr);
        System.arraycopy(bArr, i + 4, this.f4798, 0, 16);
        this.f4799 = C1480.m5121(i + 20, bArr);
        this.f4801 = C1480.m5121(i + 22, bArr);
        return (i + 24) - i;
    }
}
