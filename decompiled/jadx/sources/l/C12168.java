package l;

/* JADX INFO: renamed from: l.۫ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DA0R */
/* JADX INFO: loaded from: classes4.dex */
public final class C12168 extends AbstractC11422 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public byte[] f36292;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f36293;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f36294;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f36295;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f36296;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f36297;

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

    public C12168(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 11);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29634(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f36293 = i;
        this.f36296 = (int) (j & 4294967295L);
        this.f36297 = i2;
        this.f36292 = bArr;
        this.f36295 = i3;
        this.f36294 = i4;
        this.f34140 = null;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        C1480.m5122(this.f36293, i, bArr);
        C1480.m5122(this.f36294, i + 2, bArr);
        C1480.m5124(this.f36296, i + 4, bArr);
        C1480.m5122(this.f36297, i + 8, bArr);
        return (i + 10) - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        bArr[i] = 1;
        C1480.m5122(this.f36294, i + 1, bArr);
        int i2 = i + 3;
        System.arraycopy(this.f36292, this.f36295, bArr, i2, this.f36294);
        return (i2 + this.f36294) - i;
    }

    @Override // l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWrite[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f36293);
        sb.append(",count=");
        sb.append(this.f36294);
        sb.append(",offset=");
        sb.append(this.f36296);
        sb.append(",remaining=");
        return new String(C3200.m9831(this.f36297, "]", sb));
    }
}
