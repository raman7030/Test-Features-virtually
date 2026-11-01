package p067l;

/* JADX INFO: renamed from: l.ܶ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9VY */
/* JADX INFO: loaded from: classes5.dex */
public final class C17046 implements InterfaceC23083, InterfaceC23753 {

    /* JADX INFO: renamed from: ᩸ */
    public int[] f50426;

    @Override // p067l.InterfaceC23083, p067l.InterfaceC23753
    /* JADX INFO: renamed from: ֫ */
    public final int mo38695() {
        return 2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int[] m38696() {
        return this.f50426;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        int[] iArr = this.f50426;
        C3775.m7364(iArr != null ? iArr.length : 0L, i, bArr);
        int i2 = i + 2;
        int[] iArr2 = this.f50426;
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                C3775.m7364(i3, i2, bArr);
                i2 += 2;
            }
        }
        return i2 - i;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        int iM7363 = C3775.m7363(i, bArr);
        int i3 = i + 2;
        this.f50426 = new int[iM7363];
        for (int i4 = 0; i4 < iM7363; i4++) {
            this.f50426[i4] = C3775.m7363(i3, bArr);
            i3 += 2;
        }
        return i3 - i;
    }

    @Override // p067l.InterfaceC23458
    public final int size() {
        int[] iArr = this.f50426;
        return (iArr != null ? iArr.length * 2 : 0) + 4;
    }
}
