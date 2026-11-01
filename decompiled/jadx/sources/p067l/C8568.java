package p067l;

/* JADX INFO: renamed from: l.ۜۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JA0A */
/* JADX INFO: loaded from: classes3.dex */
public final class C8568 extends AbstractC11883 implements InterfaceC12553 {

    /* JADX INFO: renamed from: ۗ֫ */
    public int f23036;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f23037;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f23038;

    /* JADX INFO: renamed from: ۫֫ */
    public byte f23039;

    /* JADX INFO: renamed from: ۬֫ */
    public int f23040;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f23041;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f23042;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f23043;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f23044;

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

    public C8568(InterfaceC3341 interfaceC3341, String str, int i, int i2, int i3, int i4, int i5) {
        super(interfaceC3341, (byte) -94, str);
        this.f23044 = i2 | 137;
        this.f23042 = i4;
        this.f23038 = i3;
        if ((i & 64) == 64) {
            if ((i & 16) == 16) {
                this.f23041 = 5;
            } else {
                this.f23041 = 4;
            }
        } else if ((i & 16) != 16) {
            this.f23041 = 1;
        } else if ((i & 32) == 32) {
            this.f23041 = 2;
        } else {
            this.f23041 = 3;
        }
        if ((i5 & 1) == 0) {
            this.f23043 = i5 | 64;
        } else {
            this.f23043 = i5;
        }
        this.f23036 = 2;
        this.f23039 = (byte) 3;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3835 mo7658() {
        return (C21980) super.mo7658();
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC13224 mo7658() {
        return (C21980) super.mo7658();
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC15194 mo7658() {
        return (C21980) super.mo7658();
    }

    @Override // p067l.InterfaceC12553
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3835 mo7659(InterfaceC20106 interfaceC20106) {
        C21980 c21980 = new C21980(interfaceC20106.mo29602());
        mo30248((InterfaceC3835) c21980);
        return c21980;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final void m19986() {
        this.f23037 |= 22;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        bArr[i] = 0;
        this.f23040 = i + 1;
        C3775.m7366(this.f23037, i + 3, bArr);
        C3775.m7366(0, i + 7, bArr);
        C3775.m7366(this.f23044, i + 11, bArr);
        C3775.m7368(0L, i + 15, bArr);
        C3775.m7366(this.f23042, i + 23, bArr);
        C3775.m7366(this.f23038, i + 27, bArr);
        C3775.m7366(this.f23041, i + 31, bArr);
        C3775.m7366(this.f23043, i + 35, bArr);
        C3775.m7366(this.f23036, i + 39, bArr);
        bArr[i + 43] = this.f23039;
        return (i + 44) - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int iM30241 = m30241(this.f37152, i, bArr);
        C3775.m7364(m30259() ? this.f37152.length() * 2 : iM30241, this.f23040, bArr);
        return iM30241;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNTCreateAndX[");
        sb.append(super.toString());
        sb.append(",flags=0x");
        C20458.m46154(this.f23037, 2, ",rootDirectoryFid=0,desiredAccess=0x", sb);
        C20458.m46154(this.f23044, 4, ",allocationSize=0,extFileAttributes=0x", sb);
        C20458.m46154(this.f23042, 4, ",shareAccess=0x", sb);
        C20458.m46154(this.f23038, 4, ",createDisposition=0x", sb);
        C20458.m46154(this.f23041, 4, ",createOptions=0x", sb);
        C20458.m46154(this.f23043, 8, ",impersonationLevel=0x", sb);
        C20458.m46154(this.f23036, 4, ",securityFlags=0x", sb);
        C20458.m46154(this.f23039, 2, ",name=", sb);
        return new String(C10965.m25286(sb, this.f37152, "]"));
    }
}
