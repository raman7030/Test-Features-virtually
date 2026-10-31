package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۡ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9XY */
/* JADX INFO: loaded from: classes4.dex */
public final class C9095 extends AbstractC13306 implements InterfaceC4840 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public byte[] f27564;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f27565;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f27566;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public byte[] f27567;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f27568;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f27569;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C9095(InterfaceC1023 interfaceC1023, byte[] bArr) {
        super(interfaceC1023, 9);
        this.f27564 = bArr;
    }

    @Override // l.InterfaceC4840
    /* JADX INFO: renamed from: ֫ */
    public final void mo8489(byte[] bArr) {
        this.f27564 = bArr;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C16149(interfaceC18663.mo27540());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23467(int i, int i2, byte[] bArr) {
        this.f27567 = bArr;
        this.f27568 = i;
        this.f27566 = i2;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m23468(int i) {
        this.f27569 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23469(long j) {
        this.f27565 = j;
    }

    @Override // l.InterfaceC7578
    public final int size() {
        return AbstractC3429.m10428(this.f27566 + UMErrorCode.E_UM_BE_DEFLATE_FAILED);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(49L, i, bArr);
        C1480.m5124(this.f27566, i + 4, bArr);
        C1480.m5126(this.f27565, i + 8, bArr);
        System.arraycopy(this.f27564, 0, bArr, i + 16, 16);
        long j = 0;
        C1480.m5124(j, i + 32, bArr);
        C1480.m5124(this.f27569, i + 36, bArr);
        C1480.m5122(0L, i + 40, bArr);
        C1480.m5122(0L, i + 42, bArr);
        C1480.m5124(j, i + 44, bArr);
        int i2 = i + 48;
        C1480.m5122(i2 - m10453(), i + 2, bArr);
        int i3 = this.f27566;
        if (i2 + i3 > bArr.length) {
            throw new IllegalArgumentException(String.format("Data exceeds buffer size ( remain buffer: %d data length: %d)", Integer.valueOf(bArr.length - i2), Integer.valueOf(this.f27566)));
        }
        System.arraycopy(this.f27567, this.f27568, bArr, i2, i3);
        return (i2 + this.f27566) - i;
    }
}
