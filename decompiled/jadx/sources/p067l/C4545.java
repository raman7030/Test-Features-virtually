package p067l;

/* JADX INFO: renamed from: l.ۖۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4545 extends AbstractC11883 implements InterfaceC15904 {

    /* JADX INFO: renamed from: ۗ֫ */
    public int f10183;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f10184;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f10185;

    /* JADX INFO: renamed from: ۫֫ */
    public long f10186;

    /* JADX INFO: renamed from: ۬֫ */
    public int f10187;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f10188;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f10189;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f10190;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f10191;

    @Override // p067l.InterfaceC15904
    public final long getSize() {
        throw null;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        return 0;
    }

    public C4545(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final int m9615() {
        return this.f10191;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final int m9618() {
        return this.f10184;
    }

    @Override // p067l.InterfaceC15904
    public final int getAttributes() {
        return this.f10189;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final int m9616() {
        return this.f10183;
    }

    @Override // p067l.InterfaceC15904
    /* JADX INFO: renamed from: ۛ */
    public final long mo9617() {
        return this.f10186;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        this.f10191 = C3775.m7363(i, bArr);
        this.f10189 = C3775.m7363(i + 2, bArr);
        this.f10186 = (((long) C3775.m7365(i + 4, bArr)) & 4294967295L) * 1000;
        this.f10184 = C3775.m7365(i + 8, bArr);
        this.f10187 = C3775.m7363(i + 12, bArr);
        this.f10183 = C3775.m7363(i + 14, bArr);
        this.f10190 = C3775.m7363(i + 16, bArr);
        this.f10188 = C3775.m7363(i + 18, bArr);
        this.f10185 = C3775.m7365(i + 20, bArr);
        return (i + 26) - i;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComOpenAndXResponse[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f10191);
        sb.append(",fileAttributes=");
        sb.append(this.f10189);
        sb.append(",lastWriteTime=");
        sb.append(this.f10186);
        sb.append(",dataSize=");
        sb.append(this.f10184);
        sb.append(",grantedAccess=");
        sb.append(this.f10187);
        sb.append(",fileType=");
        sb.append(this.f10183);
        sb.append(",deviceState=");
        sb.append(this.f10190);
        sb.append(",action=");
        sb.append(this.f10188);
        sb.append(",serverFid=");
        return new String(C5410.m11876(this.f10185, "]", sb));
    }
}
