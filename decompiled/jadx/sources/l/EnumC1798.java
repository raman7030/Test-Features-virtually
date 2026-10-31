package l;

/* JADX INFO: renamed from: l.֫ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9JS */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1798 implements InterfaceC21614 {
    SMB2_FLAGS_SERVER_TO_REDIR(1),
    SMB2_FLAGS_ASYNC_COMMAND(2),
    SMB2_FLAGS_RELATED_OPERATIONS(4),
    SMB2_FLAGS_SIGNED(8),
    SMB2_FLAGS_PRIORITY_MASK(112),
    SMB2_FLAGS_DFS_OPERATIONS(268435456),
    SMB2_FLAGS_REPLAY_OPERATION(536870912);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f6206;

    EnumC1798(long j) {
        this.f6206 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f6206;
    }
}
