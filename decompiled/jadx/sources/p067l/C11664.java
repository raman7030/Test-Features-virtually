package p067l;

/* JADX INFO: renamed from: l.ۢᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69T4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11664 extends AbstractC19710 {

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final InterfaceC4410 f32522 = C13128.m30022(C11664.class);

    /* JADX INFO: renamed from: ۜۧ */
    public int f32523;

    /* JADX INFO: renamed from: ܳۧ */
    public int f32524;

    /* JADX INFO: renamed from: ܿۧ */
    public byte[] f32525;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f32526;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        return 0;
    }

    public C11664(InterfaceC3341 interfaceC3341, int i, byte[] bArr, int i2, int i3) {
        super(interfaceC3341, (byte) 37, (byte) 38);
        this.f32523 = i;
        this.f32525 = bArr;
        this.f32526 = i2;
        this.f32524 = i3;
        this.f59920 = 0;
        this.f59934 = 65535;
        this.f59930 = 2;
        this.f59919 = "\\PIPE\\";
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        bArr[i] = m44787();
        bArr[i + 1] = 0;
        C3775.m7364(this.f32523, i + 2, bArr);
        return 4;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f32524;
        if (length < i2) {
            f32522.mo9183("TransTransactNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f32525, this.f32526, bArr, i, i2);
        return i2;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransTransactNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeFid=");
        return new String(C5410.m11876(this.f32523, "]", sb));
    }
}
