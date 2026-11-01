package p067l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۚۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SA1S */
/* JADX INFO: loaded from: classes3.dex */
public final class C7188 implements InterfaceC2493 {

    /* JADX INFO: renamed from: ۗ */
    public long f18778;

    /* JADX INFO: renamed from: ۙ */
    public long f18779;

    /* JADX INFO: renamed from: ᩶ */
    public long f18780;

    /* JADX INFO: renamed from: ᩸ */
    public int f18781;

    /* JADX INFO: renamed from: ᩹ */
    public long f18782 = 0;

    @Override // p067l.InterfaceC15904
    public final long getSize() {
        throw null;
    }

    @Override // p067l.InterfaceC23458
    public final int size() {
        return 40;
    }

    @Override // p067l.InterfaceC23282
    /* JADX INFO: renamed from: ۧ */
    public final byte mo11079() {
        return (byte) 4;
    }

    public C7188(int i, long j, long j2, long j3) {
        this.f18780 = j;
        this.f18779 = j2;
        this.f18778 = j3;
        this.f18781 = i;
    }

    @Override // p067l.InterfaceC15904
    public final int getAttributes() {
        return this.f18781;
    }

    @Override // p067l.InterfaceC15904
    /* JADX INFO: renamed from: ۛ */
    public final long mo9617() {
        return this.f18778;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f18780 = C3775.m7369(i, bArr);
        this.f18779 = C3775.m7369(i + 8, bArr);
        this.f18778 = C3775.m7369(i + 16, bArr);
        this.f18782 = C3775.m7369(i + 24, bArr);
        this.f18781 = C3775.m7365(i + 32, bArr);
        return (i + 36) - i;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        C3775.m7370(this.f18780, i, bArr);
        C3775.m7370(this.f18779, i + 8, bArr);
        C3775.m7370(this.f18778, i + 16, bArr);
        C3775.m7370(this.f18782, i + 24, bArr);
        C3775.m7366(this.f18781, i + 32, bArr);
        return (i + 40) - i;
    }

    public final String toString() {
        return new String("SmbQueryFileBasicInfo[createTime=" + new Date(this.f18780) + ",lastAccessTime=" + new Date(this.f18779) + ",lastWriteTime=" + new Date(this.f18778) + ",changeTime=" + new Date(this.f18782) + ",attributes=0x" + C13854.m31529(this.f18781, 4) + "]");
    }
}
