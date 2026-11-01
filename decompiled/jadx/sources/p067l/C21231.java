package p067l;

/* JADX INFO: renamed from: l.᩶֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9X7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21231 implements InterfaceC23458 {

    /* JADX INFO: renamed from: ᩶ */
    public int f66747;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f66748;

    /* JADX INFO: renamed from: ᩹ */
    public int f66749;

    public C21231(byte[] bArr, int i, int i2) {
        this.f66748 = bArr;
        this.f66747 = i;
        this.f66749 = i2;
    }

    @Override // p067l.InterfaceC23458
    public final int size() {
        return this.f66749;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        byte[] bArr2 = this.f66748;
        int i2 = this.f66747;
        int i3 = this.f66749;
        System.arraycopy(bArr2, i2, bArr, i, i3);
        return i3;
    }
}
