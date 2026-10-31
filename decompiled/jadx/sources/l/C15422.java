package l;

/* JADX INFO: renamed from: l.ܶᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1K */
/* JADX INFO: loaded from: classes5.dex */
public final class C15422 extends AbstractC18246 {

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final int f47229;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        return 0;
    }

    public C15422(InterfaceC1023 interfaceC1023, String str, int i) {
        super(interfaceC1023, (byte) 50, (byte) 5);
        this.f34156 = str;
        this.f47229 = i;
        this.f56708 = 0;
        this.f56702 = 2;
        this.f56716 = 40;
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
        long j;
        int i = this.f47229;
        if (i == 4) {
            j = 257;
        } else if (i == 5) {
            j = 258;
        } else {
            if (i != 20) {
                throw new IllegalArgumentException(C19370.m44628(i, "Unsupported information level "));
            }
            j = 260;
        }
        C1480.m5122(j, 0, bArr);
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = 0;
        bArr[5] = 0;
        return m28197(this.f34156, 6, bArr) + 6;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2QueryPathInformation[");
        sb.append(super.toString());
        sb.append(",informationLevel=0x");
        C19033.m43886(this.f47229, 3, ",filename=", sb);
        return new String(C9045.m23341(sb, this.f34156, "]"));
    }
}
