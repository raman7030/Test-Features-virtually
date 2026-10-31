package l;

/* JADX INFO: renamed from: l.᩶᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA04 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20384 implements InterfaceC21795, InterfaceC22500 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f65781;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f65782;

    @Override // l.InterfaceC21795, l.InterfaceC22500
    /* JADX INFO: renamed from: ֫ */
    public final int mo36537() {
        return 1;
    }

    public C20384(byte[] bArr, int[] iArr) {
        this.f65781 = iArr;
        this.f65782 = bArr;
    }

    public C20384() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] m46698() {
        return this.f65781;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        int[] iArr = this.f65781;
        C1480.m5122(iArr != null ? iArr.length : 0L, i, bArr);
        byte[] bArr2 = this.f65782;
        C1480.m5122(bArr2 != null ? bArr2.length : 0L, i + 2, bArr);
        int length = i + 4;
        int[] iArr2 = this.f65781;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                C1480.m5122(i2, length, bArr);
                length += 2;
            }
        }
        byte[] bArr3 = this.f65782;
        if (bArr3 != null) {
            System.arraycopy(bArr3, 0, bArr, length, bArr3.length);
            length += this.f65782.length;
        }
        return length - i;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        int iM5121 = C1480.m5121(i, bArr);
        int iM5122 = C1480.m5121(i + 2, bArr);
        int i3 = i + 4;
        this.f65781 = new int[iM5121];
        for (int i4 = 0; i4 < iM5121; i4++) {
            this.f65781[i4] = C1480.m5121(i3, bArr);
            i3 += 2;
        }
        byte[] bArr2 = new byte[iM5122];
        this.f65782 = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, iM5122);
        return (i3 + iM5122) - i;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        int[] iArr = this.f65781;
        int length = (iArr != null ? iArr.length * 2 : 0) + 4;
        byte[] bArr = this.f65782;
        return length + (bArr != null ? bArr.length : 0);
    }
}
