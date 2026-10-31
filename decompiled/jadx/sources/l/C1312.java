package l;

/* JADX INFO: renamed from: l.֨ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L9VN */
/* JADX INFO: loaded from: classes3.dex */
public final class C1312 extends AbstractC18246 {

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f4713;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        return 0;
    }

    public C1312(InterfaceC1023 interfaceC1023, int i) {
        super(interfaceC1023, (byte) 50, (byte) 3);
        this.f4713 = i;
        this.f56714 = 2;
        this.f56708 = 0;
        this.f56702 = 0;
        this.f56716 = 800;
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
        int i;
        int i2 = this.f4713;
        if (i2 == -1) {
            i = 1;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException("Unhandled information level");
            }
            i = 259;
        }
        C1480.m5122(i, 0, bArr);
        return 2;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        return new String("Trans2QueryFSInformation[" + super.toString() + ",informationLevel=0x" + C12085.m29467(this.f4713, 3) + "]");
    }
}
