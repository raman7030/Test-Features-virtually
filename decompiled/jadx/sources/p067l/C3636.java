package p067l;

/* JADX INFO: renamed from: l.֨᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OA16 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3636 implements InterfaceC10047 {

    /* JADX INFO: renamed from: ۙ */
    public byte[] f7568 = new byte[16];

    /* JADX INFO: renamed from: ᩶ */
    public int f7569;

    /* JADX INFO: renamed from: ᩸ */
    public int f7570;

    /* JADX INFO: renamed from: ᩹ */
    public int f7571;

    /* JADX INFO: renamed from: ܽ */
    public final int m6897() {
        return this.f7570;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] m6899() {
        return this.f7568;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m6896() {
        return this.f7569;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m6898() {
        return this.f7571;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f7570 = C3775.m7365(i, bArr);
        System.arraycopy(bArr, i + 4, this.f7568, 0, 16);
        this.f7569 = C3775.m7363(i + 20, bArr);
        this.f7571 = C3775.m7363(i + 22, bArr);
        return (i + 24) - i;
    }
}
