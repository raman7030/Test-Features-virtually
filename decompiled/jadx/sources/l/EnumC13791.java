package l;

/* JADX INFO: renamed from: l.ܰۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H6 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC13791 implements InterfaceC21614 {
    SMB2_RESTART_SCANS(1),
    SMB2_RETURN_SINGLE_ENTRY(2),
    SMB2_INDEX_SPECIFIED(4),
    SMB2_REOPEN(16);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f41113;

    EnumC13791(long j) {
        this.f41113 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f41113;
    }
}
