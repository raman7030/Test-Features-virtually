package p067l;

/* JADX INFO: renamed from: l.ᩴ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9CQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19896 implements InterfaceC7312 {

    /* JADX INFO: renamed from: ۧ */
    public C17212 f60433;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f60432 = new byte[64];

    /* JADX INFO: renamed from: ܽ */
    public byte[] f60434 = new byte[64];

    public C19896(C17212 c17212) {
        this.f60433 = c17212;
    }

    @Override // p067l.InterfaceC7312
    public final void init(byte[] bArr) throws C9994 {
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            throw new C9994("Missing key data");
        }
        int iMin = Math.min(bArr.length, 64);
        int i = 0;
        while (true) {
            bArr2 = this.f60434;
            bArr3 = this.f60432;
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
        m45195();
    }

    @Override // p067l.InterfaceC7312
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo16885() {
        C17212 c17212 = this.f60433;
        try {
            byte[] bArrM38984 = c17212.m38984();
            c17212.m38982(this.f60434);
            c17212.m38982(bArrM38984);
            return c17212.m38984();
        } finally {
            m45195();
        }
    }

    @Override // p067l.InterfaceC7312
    public final void update(byte[] bArr) {
        this.f60433.m38982(bArr);
    }

    @Override // p067l.InterfaceC7312
    public final void update(byte[] bArr, int i, int i2) {
        this.f60433.m38983(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45195() {
        C17212 c17212 = this.f60433;
        c17212.m38986();
        byte[] bArr = this.f60432;
        c17212.m38983(bArr, 0, bArr.length);
    }
}
