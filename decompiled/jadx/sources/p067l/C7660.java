package p067l;

/* JADX INFO: renamed from: l.ۚ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7660 implements InterfaceC23458 {

    /* JADX INFO: renamed from: ۙ */
    public int f20088;

    /* JADX INFO: renamed from: ᩶ */
    public int[] f20089;

    /* JADX INFO: renamed from: ᩸ */
    public int f20090;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f20091;

    public C7660(int i, byte[] bArr, int i2, int[] iArr) {
        this.f20090 = i;
        this.f20091 = bArr;
        this.f20088 = i2;
        this.f20089 = iArr;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        C3775.m7366(this.f20090, i, bArr);
        System.arraycopy(this.f20091, 0, bArr, i + 4, 16);
        C3775.m7364(this.f20088, i + 20, bArr);
        int[] iArr = this.f20089;
        C3775.m7364(iArr.length, i + 22, bArr);
        int i2 = i + 24;
        for (int i3 : iArr) {
            C3775.m7364(i3, i2, bArr);
            i2 += 2;
        }
        return i2 - i;
    }

    @Override // p067l.InterfaceC23458
    public final int size() {
        return (this.f20089.length * 2) + 24;
    }
}
