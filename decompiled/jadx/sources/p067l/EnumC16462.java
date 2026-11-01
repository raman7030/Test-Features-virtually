package p067l;

/* JADX INFO: renamed from: l.ܳ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FL */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16462 implements InterfaceC22910 {
    SMB2_SESSION_FLAG_IS_GUEST(1),
    SMB2_SESSION_FLAG_IS_NULL(2),
    SMB2_SESSION_FLAG_ENCRYPT_DATA(4);


    /* JADX INFO: renamed from: ᩸ */
    public long f48354;

    EnumC16462(long j) {
        this.f48354 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f48354;
    }
}
