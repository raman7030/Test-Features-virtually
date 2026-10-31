package l;

/* JADX INFO: renamed from: l.ۛۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89I2 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5866 implements InterfaceC21614 {
    SMB2_GLOBAL_CAP_DFS(1),
    SMB2_GLOBAL_CAP_LEASING(2),
    SMB2_GLOBAL_CAP_LARGE_MTU(4),
    SMB2_GLOBAL_CAP_MULTI_CHANNEL(8),
    SMB2_GLOBAL_CAP_PERSISTENT_HANDLES(16),
    SMB2_GLOBAL_CAP_DIRECTORY_LEASING(32),
    SMB2_GLOBAL_CAP_ENCRYPTION(64);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f18004;

    EnumC5866(long j) {
        this.f18004 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f18004;
    }
}
