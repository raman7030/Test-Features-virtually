package l;

/* JADX INFO: renamed from: l.ۢᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69T4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9780 extends AbstractC18246 {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f29570 = C11321.m27961(C9780.class);

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f29571;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f29572;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public byte[] f29573;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f29574;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ܽ */
    public final int mo2484(byte[] bArr) {
        return 0;
    }

    public C9780(InterfaceC1023 interfaceC1023, int i, byte[] bArr, int i2, int i3) {
        super(interfaceC1023, (byte) 37, (byte) 38);
        this.f29571 = i;
        this.f29573 = bArr;
        this.f29574 = i2;
        this.f29572 = i3;
        this.f56702 = 0;
        this.f56716 = 65535;
        this.f56712 = 2;
        this.f56701 = "\\PIPE\\";
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2485(int i, byte[] bArr) {
        bArr[i] = m42528();
        bArr[i + 1] = 0;
        C1480.m5122(this.f29571, i + 2, bArr);
        return 4;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f29572;
        if (length < i2) {
            f29570.mo7088("TransTransactNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f29573, this.f29574, bArr, i, i2);
        return i2;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransTransactNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeFid=");
        return new String(C3200.m9831(this.f29571, "]", sb));
    }
}
