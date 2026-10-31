package l;

/* JADX INFO: renamed from: l.ܶ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9VY */
/* JADX INFO: loaded from: classes5.dex */
public final class C15443 implements InterfaceC21795, InterfaceC22500 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f47297;

    @Override // l.InterfaceC21795, l.InterfaceC22500
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo36537() {
        return 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] m36538() {
        return this.f47297;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        int[] iArr = this.f47297;
        C1480.m5122(iArr != null ? iArr.length : 0L, i, bArr);
        int i2 = i + 2;
        int[] iArr2 = this.f47297;
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                C1480.m5122(i3, i2, bArr);
                i2 += 2;
            }
        }
        return i2 - i;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        int iM5121 = C1480.m5121(i, bArr);
        int i3 = i + 2;
        this.f47297 = new int[iM5121];
        for (int i4 = 0; i4 < iM5121; i4++) {
            this.f47297[i4] = C1480.m5121(i3, bArr);
            i3 += 2;
        }
        return i3 - i;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        int[] iArr = this.f47297;
        return (iArr != null ? iArr.length * 2 : 0) + 4;
    }
}
