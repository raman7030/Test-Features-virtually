package l;

/* JADX INFO: renamed from: l.ۤۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 39YC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10052 extends AbstractC10011 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public long f30219;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f30220;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f30221;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public int f30222;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f30223;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public byte[] f30224;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f30225;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f30226;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f30227;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        return 0;
    }

    public C10052(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 47, (AbstractC11422) null);
    }

    public C10052(InterfaceC1023 interfaceC1023, int i, long j, int i2, byte[] bArr, int i3, int i4) {
        super(interfaceC1023, (byte) 47, (AbstractC11422) null);
        this.f30225 = i;
        this.f30219 = j;
        this.f30222 = i2;
        this.f30224 = bArr;
        this.f30220 = i3;
        this.f30226 = i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25234(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f30225 = i;
        this.f30219 = j;
        this.f30222 = i2;
        this.f30224 = bArr;
        this.f30220 = i3;
        this.f30226 = i4;
        this.f34140 = null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m25235(int i) {
        this.f30221 = i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        int i2 = this.f34143;
        int i3 = (i - i2) + 26;
        this.f30227 = i3;
        int i4 = (i3 - i2) % 4;
        this.f30223 = i4;
        int i5 = i4 == 0 ? 0 : 4 - i4;
        this.f30223 = i5;
        this.f30227 = i3 + i5;
        C1480.m5122(this.f30225, i, bArr);
        C1480.m5124(this.f30219, i + 2, bArr);
        int i6 = i + 6;
        int i7 = 0;
        while (i7 < 4) {
            bArr[i6] = -1;
            i7++;
            i6++;
        }
        C1480.m5122(this.f30221, i6, bArr);
        C1480.m5122(this.f30222, i6 + 2, bArr);
        bArr[i6 + 4] = 0;
        bArr[i6 + 5] = 0;
        C1480.m5122(this.f30226, i6 + 6, bArr);
        C1480.m5122(this.f30227, i6 + 8, bArr);
        C1480.m5124(this.f30219 >> 32, i6 + 10, bArr);
        return (i6 + 14) - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int i2 = i;
        while (true) {
            int i3 = this.f30223;
            this.f30223 = i3 - 1;
            if (i3 > 0) {
                bArr[i2] = -18;
                i2++;
            } else {
                System.arraycopy(this.f30224, this.f30220, bArr, i2, this.f30226);
                return (i2 + this.f30226) - i;
            }
        }
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f30225);
        sb.append(",offset=");
        sb.append(this.f30219);
        sb.append(",writeMode=");
        sb.append(this.f30221);
        sb.append(",remaining=");
        sb.append(this.f30222);
        sb.append(",dataLength=");
        sb.append(this.f30226);
        sb.append(",dataOffset=");
        return new String(C3200.m9831(this.f30227, "]", sb));
    }
}
