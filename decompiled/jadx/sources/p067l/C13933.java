package p067l;

/* JADX INFO: renamed from: l.۫ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DA0R */
/* JADX INFO: loaded from: classes4.dex */
public final class C13933 extends AbstractC13224 {

    /* JADX INFO: renamed from: ֡֫ */
    public byte[] f39303;

    /* JADX INFO: renamed from: ֨֫ */
    public int f39304;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f39305;

    /* JADX INFO: renamed from: ۠֫ */
    public int f39306;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f39307;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f39308;

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

    public C13933(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, (byte) 11);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31696(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f39304 = i;
        this.f39307 = (int) (j & 4294967295L);
        this.f39308 = i2;
        this.f39303 = bArr;
        this.f39306 = i3;
        this.f39305 = i4;
        this.f37136 = null;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        C3775.m7364(this.f39304, i, bArr);
        C3775.m7364(this.f39305, i + 2, bArr);
        C3775.m7366(this.f39307, i + 4, bArr);
        C3775.m7364(this.f39308, i + 8, bArr);
        return (i + 10) - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        bArr[i] = 1;
        C3775.m7364(this.f39305, i + 1, bArr);
        int i2 = i + 3;
        System.arraycopy(this.f39303, this.f39306, bArr, i2, this.f39305);
        return (i2 + this.f39305) - i;
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWrite[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f39304);
        sb.append(",count=");
        sb.append(this.f39305);
        sb.append(",offset=");
        sb.append(this.f39307);
        sb.append(",remaining=");
        return new String(C5410.m11876(this.f39308, "]", sb));
    }
}
