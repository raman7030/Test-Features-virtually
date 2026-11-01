package p067l;

/* JADX INFO: renamed from: l.᩹ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9WB */
/* JADX INFO: loaded from: classes2.dex */
public final class C23733 extends AbstractC19710 {

    /* JADX INFO: renamed from: ܳۧ */
    public final C7188 f75514;

    /* JADX INFO: renamed from: ܿۧ */
    public final int f75515;

    public C23733(InterfaceC3341 interfaceC3341, int i, int i2, long j, long j2, long j3) {
        C7188 c7188 = new C7188(i2 | 128, j, j3, j2);
        super(interfaceC3341, (byte) 50, (byte) 8);
        this.f75515 = i;
        this.f75514 = c7188;
        this.f59920 = 6;
        this.f59934 = 0;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        bArr[i] = m44787();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        C3775.m7364(this.f75515, 0, bArr);
        this.f75514.getClass();
        C3775.m7364(257L, 2, bArr);
        C3775.m7364(0L, 4, bArr);
        return 6;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        int iMo11078 = this.f75514.mo11078(i, bArr) + i;
        C3775.m7368(0L, iMo11078, bArr);
        return (iMo11078 + 6) - i;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2SetFileInformation[");
        sb.append(super.toString());
        sb.append(",fid=");
        return new String(C5410.m11876(this.f75515, "]", sb));
    }
}
