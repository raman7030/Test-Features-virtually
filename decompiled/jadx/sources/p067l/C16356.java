package p067l;

/* JADX INFO: renamed from: l.ܳᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C16356 extends AbstractC19710 {

    /* JADX INFO: renamed from: ۜۧ */
    public static final InterfaceC4410 f48052 = C13128.m30022(C16356.class);

    /* JADX INFO: renamed from: ܳۧ */
    public int f48053;

    /* JADX INFO: renamed from: ܿۧ */
    public byte[] f48054;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f48055;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        return 0;
    }

    public C16356(InterfaceC3341 interfaceC3341, String str, byte[] bArr, int i, int i2) {
        super(interfaceC3341, (byte) 37, (byte) 84);
        this.f59919 = str;
        this.f48054 = bArr;
        this.f48055 = i;
        this.f48053 = i2;
        this.f59918 = -1;
        this.f59920 = 0;
        this.f59934 = 65535;
        this.f59930 = 2;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        bArr[i] = m44787();
        bArr[i + 1] = 0;
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        return 4;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f48053;
        if (length < i2) {
            f48052.mo9183("TransCallNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f48054, this.f48055, bArr, i, i2);
        return i2;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransCallNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C10965.m25286(sb, this.f59919, "]"));
    }
}
