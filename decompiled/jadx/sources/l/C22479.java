package l;

/* JADX INFO: renamed from: l.᩹ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9WB */
/* JADX INFO: loaded from: classes2.dex */
public final class C22479 extends AbstractC18246 {

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final C5071 f72787;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final int f72788;

    public C22479(InterfaceC1023 interfaceC1023, int i, int i2, long j, long j2, long j3) {
        C5071 c5071 = new C5071(i2 | 128, j, j3, j2);
        super(interfaceC1023, (byte) 50, (byte) 8);
        this.f72788 = i;
        this.f72787 = c5071;
        this.f56702 = 6;
        this.f56716 = 0;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2485(int i, byte[] bArr) {
        bArr[i] = m42528();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ܽ */
    public final int mo2484(byte[] bArr) {
        C1480.m5122(this.f72788, 0, bArr);
        this.f72787.getClass();
        C1480.m5122(257L, 2, bArr);
        C1480.m5122(0L, 4, bArr);
        return 6;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        int iMo9010 = this.f72787.mo9010(i, bArr) + i;
        C1480.m5126(0L, iMo9010, bArr);
        return (iMo9010 + 6) - i;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2SetFileInformation[");
        sb.append(super.toString());
        sb.append(",fid=");
        return new String(C3200.m9831(this.f72788, "]", sb));
    }
}
