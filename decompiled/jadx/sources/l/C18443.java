package l;

/* JADX INFO: renamed from: l.ᩴ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9CQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18443 implements InterfaceC5202 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15619 f57215;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f57214 = new byte[64];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f57216 = new byte[64];

    public C18443(C15619 c15619) {
        this.f57215 = c15619;
    }

    @Override // l.InterfaceC5202
    public final void init(byte[] bArr) throws C8024 {
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            throw new C8024("Missing key data");
        }
        int iMin = Math.min(bArr.length, 64);
        int i = 0;
        while (true) {
            bArr2 = this.f57216;
            bArr3 = this.f57214;
            if (i >= iMin) {
                break;
            }
            bArr3[i] = (byte) (54 ^ bArr[i]);
            bArr2[i] = (byte) (92 ^ bArr[i]);
            i++;
        }
        while (iMin < 64) {
            bArr3[iMin] = 54;
            bArr2[iMin] = 92;
            iMin++;
        }
        m42922();
    }

    @Override // l.InterfaceC5202
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo14975() {
        C15619 c15619 = this.f57215;
        try {
            byte[] bArrM36818 = c15619.m36818();
            c15619.m36816(this.f57216);
            c15619.m36816(bArrM36818);
            return c15619.m36818();
        } finally {
            m42922();
        }
    }

    @Override // l.InterfaceC5202
    public final void update(byte[] bArr) {
        this.f57215.m36816(bArr);
    }

    @Override // l.InterfaceC5202
    public final void update(byte[] bArr, int i, int i2) {
        this.f57215.m36817(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42922() {
        C15619 c15619 = this.f57215;
        c15619.m36820();
        byte[] bArr = this.f57214;
        c15619.m36817(bArr, 0, bArr.length);
    }
}
