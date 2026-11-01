package p067l;

/* JADX INFO: renamed from: l.۠᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9KH */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10428 implements InterfaceC22910 {
    SMB2_PREAUTH_INTEGRITY_CAPABILITIES(1),
    SMB2_ENCRYPTION_CAPABILITIES(2),
    SMB2_COMPRESSION_CAPABILITIES(4),
    SMB2_NETNAME_NEGOTIATE_CONTEXT_ID(5);


    /* JADX INFO: renamed from: ᩸ */
    public long f28838;

    EnumC10428(long j) {
        this.f28838 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f28838;
    }
}
