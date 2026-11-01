package p067l;

/* JADX INFO: renamed from: l.ۤۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 39YC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11922 extends AbstractC11883 {

    /* JADX INFO: renamed from: ۗ֫ */
    public long f33177;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f33178;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f33179;

    /* JADX INFO: renamed from: ۫֫ */
    public int f33180;

    /* JADX INFO: renamed from: ۬֫ */
    public int f33181;

    /* JADX INFO: renamed from: ܶ֫ */
    public byte[] f33182;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f33183;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f33184;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f33185;

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

    public C11922(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, (byte) 47, (AbstractC13224) null);
    }

    public C11922(InterfaceC3341 interfaceC3341, int i, long j, int i2, byte[] bArr, int i3, int i4) {
        super(interfaceC3341, (byte) 47, (AbstractC13224) null);
        this.f33183 = i;
        this.f33177 = j;
        this.f33180 = i2;
        this.f33182 = bArr;
        this.f33178 = i3;
        this.f33184 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27251(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f33183 = i;
        this.f33177 = j;
        this.f33180 = i2;
        this.f33182 = bArr;
        this.f33178 = i3;
        this.f33184 = i4;
        this.f37136 = null;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m27252(int i) {
        this.f33179 = i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        int i2 = this.f37139;
        int i3 = (i - i2) + 26;
        this.f33185 = i3;
        int i4 = (i3 - i2) % 4;
        this.f33181 = i4;
        int i5 = i4 == 0 ? 0 : 4 - i4;
        this.f33181 = i5;
        this.f33185 = i3 + i5;
        C3775.m7364(this.f33183, i, bArr);
        C3775.m7366(this.f33177, i + 2, bArr);
        int i6 = i + 6;
        int i7 = 0;
        while (i7 < 4) {
            bArr[i6] = -1;
            i7++;
            i6++;
        }
        C3775.m7364(this.f33179, i6, bArr);
        C3775.m7364(this.f33180, i6 + 2, bArr);
        bArr[i6 + 4] = 0;
        bArr[i6 + 5] = 0;
        C3775.m7364(this.f33184, i6 + 6, bArr);
        C3775.m7364(this.f33185, i6 + 8, bArr);
        C3775.m7366(this.f33177 >> 32, i6 + 10, bArr);
        return (i6 + 14) - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int i2 = i;
        while (true) {
            int i3 = this.f33181;
            this.f33181 = i3 - 1;
            if (i3 > 0) {
                bArr[i2] = -18;
                i2++;
            } else {
                System.arraycopy(this.f33182, this.f33178, bArr, i2, this.f33184);
                return (i2 + this.f33184) - i;
            }
        }
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f33183);
        sb.append(",offset=");
        sb.append(this.f33177);
        sb.append(",writeMode=");
        sb.append(this.f33179);
        sb.append(",remaining=");
        sb.append(this.f33180);
        sb.append(",dataLength=");
        sb.append(this.f33184);
        sb.append(",dataOffset=");
        return new String(C5410.m11876(this.f33185, "]", sb));
    }
}
