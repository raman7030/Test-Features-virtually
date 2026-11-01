package p067l;

/* JADX INFO: renamed from: l.֫ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9JS */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4077 implements InterfaceC22910 {
    SMB2_FLAGS_SERVER_TO_REDIR(1),
    SMB2_FLAGS_ASYNC_COMMAND(2),
    SMB2_FLAGS_RELATED_OPERATIONS(4),
    SMB2_FLAGS_SIGNED(8),
    SMB2_FLAGS_PRIORITY_MASK(112),
    SMB2_FLAGS_DFS_OPERATIONS(268435456),
    SMB2_FLAGS_REPLAY_OPERATION(536870912);


    /* JADX INFO: renamed from: ᩸ */
    public long f8985;

    EnumC4077(long j) {
        this.f8985 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f8985;
    }
}
