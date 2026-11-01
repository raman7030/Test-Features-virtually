package p067l;

/* JADX INFO: renamed from: l.ۛۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89I2 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7943 implements InterfaceC22910 {
    SMB2_GLOBAL_CAP_DFS(1),
    SMB2_GLOBAL_CAP_LEASING(2),
    SMB2_GLOBAL_CAP_LARGE_MTU(4),
    SMB2_GLOBAL_CAP_MULTI_CHANNEL(8),
    SMB2_GLOBAL_CAP_PERSISTENT_HANDLES(16),
    SMB2_GLOBAL_CAP_DIRECTORY_LEASING(32),
    SMB2_GLOBAL_CAP_ENCRYPTION(64);


    /* JADX INFO: renamed from: ᩸ */
    public long f20857;

    EnumC7943(long j) {
        this.f20857 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f20857;
    }
}
