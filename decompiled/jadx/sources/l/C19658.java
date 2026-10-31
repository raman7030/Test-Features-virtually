package l;

/* JADX INFO: renamed from: l.᩵ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9UF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19658 extends AbstractC18246 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f63468;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f63469;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public String f63470;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f63471;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public long f63472;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        return 0;
    }

    public C19658(int i, int i2, int i3, int i4, String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 50, (byte) 2);
        this.f63471 = i;
        this.f63468 = i2;
        this.f63470 = str;
        this.f63469 = 260;
        this.f56702 = 8;
        this.f63472 = i3;
        this.f56716 = i4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45192(int i, String str) {
        reset();
        this.f63468 = i;
        this.f63470 = str;
        this.f34162 = 0;
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
        C1480.m5122(this.f63471, 0, bArr);
        C1480.m5122(this.f63472, 2, bArr);
        C1480.m5122(this.f63469, 4, bArr);
        C1480.m5124(this.f63468, 6, bArr);
        C1480.m5122(0, 10, bArr);
        return m28197(this.f63470, 12, bArr) + 12;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2FindNext2[");
        sb.append(super.toString());
        sb.append(",sid=");
        sb.append(this.f63471);
        sb.append(",searchCount=");
        sb.append(((C13722) m28218()).m33001());
        sb.append(",informationLevel=0x");
        C19033.m43886(this.f63469, 3, ",resumeKey=0x", sb);
        C19033.m43886(this.f63468, 4, ",flags=0x", sb);
        C19033.m43886(0, 2, ",filename=", sb);
        return new String(C9045.m23341(sb, this.f63470, "]"));
    }
}
