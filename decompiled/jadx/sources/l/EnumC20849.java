package l;

/* JADX INFO: renamed from: l.᩷ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79JV */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20849 implements InterfaceC21614 {
    SMB2_SHARE_CAP_DFS(8),
    SMB2_SHARE_CAP_CONTINUOUS_AVAILABILITY(16),
    SMB2_SHARE_CAP_SCALEOUT(32),
    SMB2_SHARE_CAP_CLUSTER(64),
    SMB2_SHARE_CAP_ASYMMETRIC(128);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f67503;

    EnumC20849(long j) {
        this.f67503 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f67503;
    }
}
