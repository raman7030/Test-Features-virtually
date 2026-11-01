package p067l;

/* JADX INFO: renamed from: l.ۗۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19TU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5177 implements InterfaceC2493 {

    /* JADX INFO: renamed from: ۗ */
    public int f12184;

    /* JADX INFO: renamed from: ۙ */
    public long f12185;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f12186;

    /* JADX INFO: renamed from: ᩸ */
    public long f12187;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f12188;

    @Override // p067l.InterfaceC15904
    public final int getAttributes() {
        return 0;
    }

    @Override // p067l.InterfaceC23458
    public final int size() {
        return 22;
    }

    @Override // p067l.InterfaceC15904
    /* JADX INFO: renamed from: ۛ */
    public final long mo9617() {
        return 0L;
    }

    @Override // p067l.InterfaceC23282
    /* JADX INFO: renamed from: ۧ */
    public final byte mo11079() {
        return (byte) 5;
    }

    @Override // p067l.InterfaceC15904
    public final long getSize() {
        return this.f12185;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f12187 = C3775.m7367(i, bArr);
        this.f12185 = C3775.m7367(i + 8, bArr);
        this.f12184 = C3775.m7365(i + 16, bArr);
        int i3 = i + 21;
        this.f12188 = (bArr[i + 20] & 255) > 0;
        int i4 = i + 22;
        this.f12186 = (bArr[i3] & 255) > 0;
        return i4 - i;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        C3775.m7368(this.f12187, i, bArr);
        C3775.m7368(this.f12185, i + 8, bArr);
        C3775.m7366(this.f12184, i + 16, bArr);
        bArr[i + 20] = this.f12188 ? (byte) 1 : (byte) 0;
        bArr[i + 21] = this.f12186 ? (byte) 1 : (byte) 0;
        return (i + 22) - i;
    }

    public final String toString() {
        return new String("SmbQueryInfoStandard[allocationSize=" + this.f12187 + ",endOfFile=" + this.f12185 + ",numberOfLinks=" + this.f12184 + ",deletePending=" + this.f12188 + ",directory=" + this.f12186 + "]");
    }
}
