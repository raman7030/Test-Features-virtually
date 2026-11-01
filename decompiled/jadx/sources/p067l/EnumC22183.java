package p067l;

/* JADX INFO: renamed from: l.᩷ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79JV */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC22183 implements InterfaceC22910 {
    SMB2_SHARE_CAP_DFS(8),
    SMB2_SHARE_CAP_CONTINUOUS_AVAILABILITY(16),
    SMB2_SHARE_CAP_SCALEOUT(32),
    SMB2_SHARE_CAP_CLUSTER(64),
    SMB2_SHARE_CAP_ASYMMETRIC(128);


    /* JADX INFO: renamed from: ᩸ */
    public long f70185;

    EnumC22183(long j) {
        this.f70185 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f70185;
    }
}
