package p067l;

/* JADX INFO: renamed from: l.᩶᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA04 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21742 implements InterfaceC23083, InterfaceC23753 {

    /* JADX INFO: renamed from: ᩸ */
    public int[] f68457;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f68458;

    @Override // p067l.InterfaceC23083, p067l.InterfaceC23753
    /* JADX INFO: renamed from: ֫ */
    public final int mo38695() {
        return 1;
    }

    public C21742(byte[] bArr, int[] iArr) {
        this.f68457 = iArr;
        this.f68458 = bArr;
    }

    public C21742() {
    }

    /* JADX INFO: renamed from: ܽ */
    public final int[] m49021() {
        return this.f68457;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        int[] iArr = this.f68457;
        C3775.m7364(iArr != null ? iArr.length : 0L, i, bArr);
        byte[] bArr2 = this.f68458;
        C3775.m7364(bArr2 != null ? bArr2.length : 0L, i + 2, bArr);
        int length = i + 4;
        int[] iArr2 = this.f68457;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                C3775.m7364(i2, length, bArr);
                length += 2;
            }
        }
        byte[] bArr3 = this.f68458;
        if (bArr3 != null) {
            System.arraycopy(bArr3, 0, bArr, length, bArr3.length);
            length += this.f68458.length;
        }
        return length - i;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        int iM7363 = C3775.m7363(i, bArr);
        int iM7364 = C3775.m7363(i + 2, bArr);
        int i3 = i + 4;
        this.f68457 = new int[iM7363];
        for (int i4 = 0; i4 < iM7363; i4++) {
            this.f68457[i4] = C3775.m7363(i3, bArr);
            i3 += 2;
        }
        byte[] bArr2 = new byte[iM7364];
        this.f68458 = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, iM7364);
        return (i3 + iM7364) - i;
    }

    @Override // p067l.InterfaceC23458
    public final int size() {
        int[] iArr = this.f68457;
        int length = (iArr != null ? iArr.length * 2 : 0) + 4;
        byte[] bArr = this.f68458;
        return length + (bArr != null ? bArr.length : 0);
    }
}
