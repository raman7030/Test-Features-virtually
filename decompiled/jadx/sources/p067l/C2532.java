package p067l;

/* JADX INFO: renamed from: l.֡ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2532 extends AbstractC11883 {

    /* JADX INFO: renamed from: ۙ֫ */
    public int f4164;

    /* JADX INFO: renamed from: ܶ֫ */
    public byte[] f4165;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f4166;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f4167;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f4168;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        return 0;
    }

    public C2532(int i, InterfaceC3341 interfaceC3341, byte[] bArr) {
        super(interfaceC3341);
        this.f4165 = bArr;
        this.f4164 = i;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final byte[] m3715() {
        return this.f4165;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final int m3718() {
        return this.f4164;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m3713(int i) {
        this.f4164 += i;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final int m3711() {
        return this.f4168;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final int m3712() {
        return this.f4166;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        this.f4167 = C3775.m7363(i + 2, bArr);
        this.f4168 = C3775.m7363(i + 6, bArr);
        this.f4166 = C3775.m7363(i + 8, bArr);
        return (i + 20) - i;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComReadAndXResponse[");
        sb.append(super.toString());
        sb.append(",dataCompactionMode=");
        sb.append(this.f4167);
        sb.append(",dataLength=");
        sb.append(this.f4168);
        sb.append(",dataOffset=");
        return new String(C5410.m11876(this.f4166, "]", sb));
    }
}
