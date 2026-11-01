package p067l;

/* JADX INFO: renamed from: l.ܰۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H6 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15475 implements InterfaceC22910 {
    SMB2_RESTART_SCANS(1),
    SMB2_RETURN_SINGLE_ENTRY(2),
    SMB2_INDEX_SPECIFIED(4),
    SMB2_REOPEN(16);


    /* JADX INFO: renamed from: ᩸ */
    public long f44191;

    EnumC15475(long j) {
        this.f44191 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f44191;
    }
}
