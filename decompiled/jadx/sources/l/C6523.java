package l;

/* JADX INFO: renamed from: l.ۜۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JA0A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6523 extends AbstractC10011 implements InterfaceC10716 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f20158;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f20159;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f20160;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public byte f20161;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f20162;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f20163;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f20164;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f20165;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f20166;

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

    public C6523(InterfaceC1023 interfaceC1023, String str, int i, int i2, int i3, int i4, int i5) {
        super(interfaceC1023, (byte) -94, str);
        this.f20166 = i2 | 137;
        this.f20164 = i4;
        this.f20160 = i3;
        if ((i & 64) == 64) {
            if ((i & 16) == 16) {
                this.f20163 = 5;
            } else {
                this.f20163 = 4;
            }
        } else if ((i & 16) != 16) {
            this.f20163 = 1;
        } else if ((i & 32) == 32) {
            this.f20163 = 2;
        } else {
            this.f20163 = 3;
        }
        if ((i5 & 1) == 0) {
            this.f20165 = i5 | 64;
        } else {
            this.f20165 = i5;
        }
        this.f20158 = 2;
        this.f20161 = (byte) 3;
    }

    @Override // l.AbstractC11422, l.InterfaceC7578, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1543 mo5429() {
        return (C20635) super.mo5429();
    }

    @Override // l.AbstractC11422, l.InterfaceC7578, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC11422 mo5429() {
        return (C20635) super.mo5429();
    }

    @Override // l.AbstractC11422, l.InterfaceC7578, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC13495 mo5429() {
        return (C20635) super.mo5429();
    }

    @Override // l.InterfaceC10716
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1543 mo5430(InterfaceC18663 interfaceC18663) {
        C20635 c20635 = new C20635(interfaceC18663.mo27540());
        mo28204((InterfaceC1543) c20635);
        return c20635;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final void m18037() {
        this.f20159 |= 22;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        bArr[i] = 0;
        this.f20162 = i + 1;
        C1480.m5124(this.f20159, i + 3, bArr);
        C1480.m5124(0, i + 7, bArr);
        C1480.m5124(this.f20166, i + 11, bArr);
        C1480.m5126(0L, i + 15, bArr);
        C1480.m5124(this.f20164, i + 23, bArr);
        C1480.m5124(this.f20160, i + 27, bArr);
        C1480.m5124(this.f20163, i + 31, bArr);
        C1480.m5124(this.f20165, i + 35, bArr);
        C1480.m5124(this.f20158, i + 39, bArr);
        bArr[i + 43] = this.f20161;
        return (i + 44) - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int iM28197 = m28197(this.f34156, i, bArr);
        C1480.m5122(m28215() ? this.f34156.length() * 2 : iM28197, this.f20162, bArr);
        return iM28197;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNTCreateAndX[");
        sb.append(super.toString());
        sb.append(",flags=0x");
        C19033.m43886(this.f20159, 2, ",rootDirectoryFid=0,desiredAccess=0x", sb);
        C19033.m43886(this.f20166, 4, ",allocationSize=0,extFileAttributes=0x", sb);
        C19033.m43886(this.f20164, 4, ",shareAccess=0x", sb);
        C19033.m43886(this.f20160, 4, ",createDisposition=0x", sb);
        C19033.m43886(this.f20163, 4, ",createOptions=0x", sb);
        C19033.m43886(this.f20165, 8, ",impersonationLevel=0x", sb);
        C19033.m43886(this.f20158, 4, ",securityFlags=0x", sb);
        C19033.m43886(this.f20161, 2, ",name=", sb);
        return new String(C9045.m23341(sb, this.f34156, "]"));
    }
}
