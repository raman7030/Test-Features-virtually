package l;

/* JADX INFO: renamed from: l.ۗۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19TU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2955 implements InterfaceC0131 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f9384;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f9385;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f9386;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f9387;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f9388;

    @Override // l.InterfaceC14242
    public final int getAttributes() {
        return 0;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        return 22;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ۛ */
    public final long mo7549() {
        return 0L;
    }

    @Override // l.InterfaceC22005
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte mo9011() {
        return (byte) 5;
    }

    @Override // l.InterfaceC14242
    public final long getSize() {
        return this.f9385;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f9387 = C1480.m5125(i, bArr);
        this.f9385 = C1480.m5125(i + 8, bArr);
        this.f9384 = C1480.m5123(i + 16, bArr);
        int i3 = i + 21;
        this.f9388 = (bArr[i + 20] & 255) > 0;
        int i4 = i + 22;
        this.f9386 = (bArr[i3] & 255) > 0;
        return i4 - i;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo9010(int i, byte[] bArr) {
        C1480.m5126(this.f9387, i, bArr);
        C1480.m5126(this.f9385, i + 8, bArr);
        C1480.m5124(this.f9384, i + 16, bArr);
        bArr[i + 20] = this.f9388 ? (byte) 1 : (byte) 0;
        bArr[i + 21] = this.f9386 ? (byte) 1 : (byte) 0;
        return (i + 22) - i;
    }

    public final String toString() {
        return new String("SmbQueryInfoStandard[allocationSize=" + this.f9387 + ",endOfFile=" + this.f9385 + ",numberOfLinks=" + this.f9384 + ",deletePending=" + this.f9388 + ",directory=" + this.f9386 + "]");
    }
}
