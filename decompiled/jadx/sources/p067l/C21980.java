package p067l;

import java.util.Date;

/* JADX INFO: renamed from: l.᩷ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9W0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21980 extends AbstractC11883 implements InterfaceC15904 {

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean f69063;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f69064;

    /* JADX INFO: renamed from: ۛ֫ */
    public int f69065;

    /* JADX INFO: renamed from: ۟֫ */
    public byte f69066;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f69067;

    /* JADX INFO: renamed from: ۨ֫ */
    public boolean f69068;

    /* JADX INFO: renamed from: ۫֫ */
    public int f69069;

    /* JADX INFO: renamed from: ۬֫ */
    public long f69070;

    /* JADX INFO: renamed from: ܰ֫ */
    public long f69071;

    /* JADX INFO: renamed from: ܶ֫ */
    public long f69072;

    /* JADX INFO: renamed from: ᩶֫ */
    public long f69073;

    /* JADX INFO: renamed from: ᩸֫ */
    public long f69074;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f69075;

    /* JADX INFO: renamed from: ᩺֫ */
    public long f69076;

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

    public C21980(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final int m49546() {
        return this.f69065;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final boolean m49548() {
        return this.f69068;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final void m49549() {
        this.f69068 = true;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final int m49545() {
        return this.f69067;
    }

    @Override // p067l.InterfaceC15904
    public final int getAttributes() {
        return this.f69069;
    }

    @Override // p067l.InterfaceC15904
    /* JADX INFO: renamed from: ۛ */
    public final long mo9617() {
        return this.f69071;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final long m49547() {
        return this.f69070;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        this.f69066 = bArr[i];
        this.f69067 = C3775.m7363(i + 1, bArr);
        this.f69075 = C3775.m7365(i + 3, bArr);
        this.f69073 = C3775.m7369(i + 7, bArr);
        this.f69076 = C3775.m7369(i + 15, bArr);
        this.f69071 = C3775.m7369(i + 23, bArr);
        this.f69074 = C3775.m7369(i + 31, bArr);
        this.f69069 = C3775.m7365(i + 39, bArr);
        this.f69072 = C3775.m7367(i + 43, bArr);
        this.f69070 = C3775.m7367(i + 51, bArr);
        this.f69065 = C3775.m7363(i + 59, bArr);
        this.f69064 = C3775.m7363(i + 61, bArr);
        int i2 = i + 64;
        this.f69063 = (bArr[i + 63] & 255) > 0;
        return i2 - i;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNTCreateAndXResponse[");
        sb.append(super.toString());
        sb.append(",oplockLevel=");
        sb.append((int) this.f69066);
        sb.append(",fid=");
        sb.append(this.f69067);
        sb.append(",createAction=0x");
        sb.append(C13854.m31529(this.f69075, 4));
        sb.append(",creationTime=");
        sb.append(new Date(this.f69073));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f69076));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f69071));
        sb.append(",changeTime=");
        sb.append(new Date(this.f69074));
        sb.append(",extFileAttributes=0x");
        C20458.m46154(this.f69069, 4, ",allocationSize=", sb);
        sb.append(this.f69072);
        sb.append(",endOfFile=");
        sb.append(this.f69070);
        sb.append(",fileType=");
        sb.append(this.f69065);
        sb.append(",deviceState=");
        sb.append(this.f69064);
        sb.append(",directory=");
        sb.append(this.f69063);
        sb.append("]");
        return new String(sb.toString());
    }
}
