package l;

/* JADX INFO: renamed from: l.ۢ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9801 extends AbstractC12601 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f29637;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f29638;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public byte[] f29639;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C9801(int i, InterfaceC1023 interfaceC1023, byte[] bArr) {
        super(interfaceC1023);
        this.f29639 = bArr;
        this.f29637 = i;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int m24840() {
        return this.f29638;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        int iM5121 = C1480.m5121(i, bArr);
        if (iM5121 == 9) {
            return m10456(i, bArr);
        }
        if (iM5121 != 17) {
            throw new C17771("Expected structureSize = 17");
        }
        short s = bArr[i + 2];
        this.f29638 = C1480.m5123(i + 4, bArr);
        C1480.m5123(i + 8, bArr);
        int i2 = i + 16;
        int iM10453 = m10453() + s;
        int i3 = this.f29638;
        int i4 = this.f29637;
        int i5 = i3 + i4;
        byte[] bArr2 = this.f29639;
        if (i5 > bArr2.length) {
            throw new C17771("Buffer to small for read response");
        }
        System.arraycopy(bArr, iM10453, bArr2, i4, i3);
        return Math.max(i2, iM10453 + this.f29638) - i;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo10455() {
        return m10446() != -2147483643 && super.mo10455();
    }
}
