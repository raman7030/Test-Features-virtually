package l;

/* JADX INFO: renamed from: l.ۘᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9XZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4135 extends AbstractC18246 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public String f13102;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f13103;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f13104;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f13105;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        return 0;
    }

    public C4135(InterfaceC1023 interfaceC1023, String str, String str2, int i, int i2, int i3) {
        super(interfaceC1023, (byte) 50, (byte) 1);
        if (str.equals("\\") || C7416.m19937(1, str) == '\\') {
            this.f34156 = str;
        } else {
            this.f34156 = str.concat("\\");
        }
        this.f13102 = str2;
        this.f13105 = i & 55;
        this.f13104 = 260;
        this.f56708 = 0;
        this.f56702 = 10;
        this.f13103 = i2;
        this.f56716 = i3;
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
        C1480.m5122(this.f13105, 0, bArr);
        C1480.m5122(this.f13103, 2, bArr);
        long j = 0;
        C1480.m5122(j, 4, bArr);
        C1480.m5122(this.f13104, 6, bArr);
        C1480.m5124(j, 8, bArr);
        return m28197(this.f34156 + this.f13102, 12, bArr) + 12;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2FindFirst2[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C19033.m43886(this.f13105, 2, ",searchCount=", sb);
        sb.append(this.f13103);
        sb.append(",flags=0x");
        sb.append(C12085.m29467(0, 2));
        sb.append(",informationLevel=0x");
        C19033.m43886(this.f13104, 3, ",searchStorageType=0,filename=", sb);
        return new String(C9045.m23341(sb, this.f34156, "]"));
    }
}
