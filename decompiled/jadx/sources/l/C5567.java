package l;

/* JADX INFO: renamed from: l.ۚ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5567 implements InterfaceC22190 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17248;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f17249;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17250;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f17251;

    public C5567(int i, byte[] bArr, int i2, int[] iArr) {
        this.f17250 = i;
        this.f17251 = bArr;
        this.f17248 = i2;
        this.f17249 = iArr;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        C1480.m5124(this.f17250, i, bArr);
        System.arraycopy(this.f17251, 0, bArr, i + 4, 16);
        C1480.m5122(this.f17248, i + 20, bArr);
        int[] iArr = this.f17249;
        C1480.m5122(iArr.length, i + 22, bArr);
        int i2 = i + 24;
        for (int i3 : iArr) {
            C1480.m5122(i3, i2, bArr);
            i2 += 2;
        }
        return i2 - i;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        return (this.f17249.length * 2) + 24;
    }
}
