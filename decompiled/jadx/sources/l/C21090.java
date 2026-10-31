package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩷᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9XY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21090 extends AbstractC13306 implements InterfaceC4840 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final int f68010;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f68011;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public long f68012;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public byte[] f68013;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f68014;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f68015;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C21090(InterfaceC1023 interfaceC1023, byte[] bArr, byte[] bArr2, int i) {
        super(interfaceC1023, 8);
        this.f68013 = bArr;
        this.f68014 = bArr2;
        this.f68010 = i;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C9801(this.f68010, interfaceC18663.mo27540(), this.f68014);
    }

    @Override // l.InterfaceC4840
    /* JADX INFO: renamed from: ֫ */
    public final void mo8489(byte[] bArr) {
        this.f68013 = bArr;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m47986(int i) {
        this.f68011 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47987(long j) {
        this.f68012 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m47985(int i) {
        this.f68015 = i;
    }

    @Override // l.InterfaceC7578
    public final int size() {
        return AbstractC3429.m10428(UMErrorCode.E_UM_BE_RAW_OVERSIZE);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(49L, i, bArr);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        C1480.m5124(this.f68011, i + 4, bArr);
        C1480.m5126(this.f68012, i + 8, bArr);
        System.arraycopy(this.f68013, 0, bArr, i + 16, 16);
        long j = 0;
        C1480.m5124(j, i + 32, bArr);
        C1480.m5124(j, i + 36, bArr);
        C1480.m5124(this.f68015, i + 40, bArr);
        C1480.m5122(0L, i + 44, bArr);
        C1480.m5122(0L, i + 46, bArr);
        bArr[i + 48] = 0;
        return (i + 49) - i;
    }
}
