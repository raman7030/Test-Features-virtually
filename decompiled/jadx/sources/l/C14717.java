package l;

/* JADX INFO: renamed from: l.ܳᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C14717 extends AbstractC18246 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f44938 = C11321.m27961(C14717.class);

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f44939;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public byte[] f44940;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f44941;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ܽ */
    public final int mo2484(byte[] bArr) {
        return 0;
    }

    public C14717(InterfaceC1023 interfaceC1023, String str, byte[] bArr, int i, int i2) {
        super(interfaceC1023, (byte) 37, (byte) 84);
        this.f56701 = str;
        this.f44940 = bArr;
        this.f44941 = i;
        this.f44939 = i2;
        this.f56700 = -1;
        this.f56702 = 0;
        this.f56716 = 65535;
        this.f56712 = 2;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2485(int i, byte[] bArr) {
        bArr[i] = m42528();
        bArr[i + 1] = 0;
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        return 4;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f44939;
        if (length < i2) {
            f44938.mo7088("TransCallNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f44940, this.f44941, bArr, i, i2);
        return i2;
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransCallNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C9045.m23341(sb, this.f56701, "]"));
    }
}
