package l;

/* JADX INFO: renamed from: l.ۛ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89UN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6272 extends AbstractC12601 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public byte[] f19415;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f19416;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC12601, l.InterfaceC1543
    /* JADX INFO: renamed from: ֫ */
    public final void mo5288(InterfaceC7578 interfaceC7578) {
        if (mo28213()) {
            interfaceC7578.mo10448(m10465());
        }
        super.mo5288(interfaceC7578);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo10455() {
        return m10446() != -1073741802 && super.mo10455();
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        if (C1480.m5121(i, bArr) != 9) {
            throw new C17771("Structure size != 9");
        }
        this.f19416 = C1480.m5121(i + 2, bArr);
        int iM5121 = C1480.m5121(i + 4, bArr);
        int iM5122 = C1480.m5121(i + 6, bArr);
        int i2 = i + 8;
        int iM10453 = i2 - (m10453() + iM5121);
        this.f19415 = new byte[iM5122];
        System.arraycopy(bArr, m10453() + iM5121, this.f19415, 0, iM5122);
        return ((i2 + iM10453) + iM5122) - i;
    }

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17280() {
        return (this.f19416 & 3) != 0;
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int m17279() {
        return this.f19416;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final byte[] m17281() {
        return this.f19415;
    }
}
