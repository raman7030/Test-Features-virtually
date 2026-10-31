package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۚۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SA1S */
/* JADX INFO: loaded from: classes3.dex */
public final class C5071 implements InterfaceC0131 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f15942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f15943;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f15944;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15945;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f15946 = 0;

    @Override // l.InterfaceC14242
    public final long getSize() {
        throw null;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        return 40;
    }

    @Override // l.InterfaceC22005
    /* JADX INFO: renamed from: ۧ */
    public final byte mo9011() {
        return (byte) 4;
    }

    public C5071(int i, long j, long j2, long j3) {
        this.f15944 = j;
        this.f15943 = j2;
        this.f15942 = j3;
        this.f15945 = i;
    }

    @Override // l.InterfaceC14242
    public final int getAttributes() {
        return this.f15945;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ۛ */
    public final long mo7549() {
        return this.f15942;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f15944 = C1480.m5127(i, bArr);
        this.f15943 = C1480.m5127(i + 8, bArr);
        this.f15942 = C1480.m5127(i + 16, bArr);
        this.f15946 = C1480.m5127(i + 24, bArr);
        this.f15945 = C1480.m5123(i + 32, bArr);
        return (i + 36) - i;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        C1480.m5128(this.f15944, i, bArr);
        C1480.m5128(this.f15943, i + 8, bArr);
        C1480.m5128(this.f15942, i + 16, bArr);
        C1480.m5128(this.f15946, i + 24, bArr);
        C1480.m5124(this.f15945, i + 32, bArr);
        return (i + 40) - i;
    }

    public final String toString() {
        return new String("SmbQueryFileBasicInfo[createTime=" + new Date(this.f15944) + ",lastAccessTime=" + new Date(this.f15943) + ",lastWriteTime=" + new Date(this.f15942) + ",changeTime=" + new Date(this.f15946) + ",attributes=0x" + C12085.m29467(this.f15945, 4) + "]");
    }
}
