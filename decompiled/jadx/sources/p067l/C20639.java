package p067l;

/* JADX INFO: renamed from: l.᩵ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9YR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20639 extends AbstractC11883 {

    /* JADX INFO: renamed from: ۗ֫ */
    public int f63756;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f63757;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f63758;

    /* JADX INFO: renamed from: ᩶֫ */
    public long f63759;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f63760;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f63761;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        return 0;
    }

    public C20639(InterfaceC3341 interfaceC3341, int i, long j, int i2) {
        super(interfaceC3341, (byte) 46, (AbstractC13224) null);
        this.f63758 = i;
        this.f63759 = j;
        this.f63761 = i2;
        this.f63760 = i2;
        this.f63757 = -1;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m46656(int i) {
        this.f63760 = i;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final void m46657() {
        this.f63761 = 1024;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m46655(int i) {
        this.f63757 = i;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final void m46654() {
        this.f63756 = 1024;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        C3775.m7364(this.f63758, i, bArr);
        long j = this.f63759;
        C3775.m7366(j, i + 2, bArr);
        C3775.m7364(this.f63760, i + 6, bArr);
        C3775.m7364(this.f63761, i + 8, bArr);
        C3775.m7366(this.f63757, i + 10, bArr);
        C3775.m7364(this.f63756, i + 14, bArr);
        C3775.m7366(j >> 32, i + 16, bArr);
        return (i + 20) - i;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComReadAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f63758);
        sb.append(",offset=");
        long j = this.f63759;
        sb.append(j);
        sb.append(",maxCount=");
        sb.append(this.f63760);
        sb.append(",minCount=");
        sb.append(this.f63761);
        sb.append(",openTimeout=");
        sb.append(this.f63757);
        sb.append(",remaining=");
        sb.append(this.f63756);
        sb.append(",offset=");
        sb.append(j);
        sb.append("]");
        return new String(sb.toString());
    }
}
