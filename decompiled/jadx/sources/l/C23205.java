package l;

/* JADX INFO: renamed from: l.᩺᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TA0G */
/* JADX INFO: loaded from: classes2.dex */
public final class C23205 extends AbstractC12601 implements InterfaceC9305 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f74587;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f74588;

    @Override // l.InterfaceC9305
    /* JADX INFO: renamed from: ۡ */
    public final String mo9135() {
        return null;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC12601, l.InterfaceC1543
    /* JADX INFO: renamed from: ֫ */
    public final void mo5288(InterfaceC7578 interfaceC7578) {
        if (mo28213()) {
            ((AbstractC3429) interfaceC7578).m10445(m10444());
        }
        super.mo5288(interfaceC7578);
    }

    @Override // l.InterfaceC9305
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9134() {
        return m10444() != -1;
    }

    @Override // l.InterfaceC9305
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo9136() {
        return (this.f74588 & 3) != 0 || (this.f74587 & 8) == 8;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        if (C1480.m5121(i, bArr) != 16) {
            throw new C17771("Structure size is not 16");
        }
        byte b = bArr[i + 2];
        this.f74588 = C1480.m5123(i + 4, bArr);
        this.f74587 = C1480.m5123(i + 8, bArr);
        C1480.m5123(i + 12, bArr);
        return (i + 16) - i;
    }
}
