package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۖ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C2745 extends AbstractC13306 implements InterfaceC4840 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22190 f8545;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f8546;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public byte[] f8547;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int f8548;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f8549;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f8550;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C2745(InterfaceC1023 interfaceC1023, int i) {
        this(i, interfaceC1023, C10485.f31453);
    }

    public C2745(int i, InterfaceC1023 interfaceC1023, byte[] bArr) {
        super(interfaceC1023, 11);
        this.f8548 = i;
        this.f8547 = bArr;
        this.f8546 = ((C13722) interfaceC1023).m33003() & (-8);
        this.f8550 = null;
    }

    @Override // l.InterfaceC4840
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8489(byte[] bArr) {
        this.f8547 = bArr;
    }

    public C2745(InterfaceC1023 interfaceC1023, byte[] bArr, byte[] bArr2) {
        super(interfaceC1023, 11);
        this.f8548 = 1163287;
        this.f8547 = bArr;
        this.f8550 = bArr2;
        this.f8546 = bArr2.length;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C4156(this.f8548, interfaceC18663.mo27540(), this.f8550);
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final void m8490() {
        this.f8549 = 1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m8491(int i) {
        this.f8546 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8488(InterfaceC22190 interfaceC22190) {
        this.f8545 = interfaceC22190;
    }

    @Override // l.InterfaceC7578
    public final int size() {
        InterfaceC22190 interfaceC22190 = this.f8545;
        return AbstractC3429.m10428((interfaceC22190 != null ? interfaceC22190.size() : 0) + UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(57L, i, bArr);
        C1480.m5124(this.f8548, i + 4, bArr);
        System.arraycopy(this.f8547, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        int i3 = i + 28;
        C1480.m5124(0, i + 32, bArr);
        int i4 = i + 36;
        int i5 = i + 40;
        C1480.m5124(this.f8546, i + 44, bArr);
        C1480.m5124(this.f8549, i + 48, bArr);
        int i6 = i + 56;
        if (this.f8545 != null) {
            C1480.m5124(i6 - m10453(), i2, bArr);
            int iMo9010 = this.f8545.mo9010(i6, bArr);
            C1480.m5124(iMo9010, i3, bArr);
            i6 += iMo9010;
        } else {
            C1480.m5124(0L, i2, bArr);
            C1480.m5124(0L, i3, bArr);
        }
        C1480.m5124(0L, i4, bArr);
        C1480.m5124(0L, i5, bArr);
        return i6 - i;
    }
}
