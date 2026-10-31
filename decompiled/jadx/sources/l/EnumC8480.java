package l;

/* JADX INFO: renamed from: l.۠᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9KH */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8480 implements InterfaceC21614 {
    SMB2_PREAUTH_INTEGRITY_CAPABILITIES(1),
    SMB2_ENCRYPTION_CAPABILITIES(2),
    SMB2_COMPRESSION_CAPABILITIES(4),
    SMB2_NETNAME_NEGOTIATE_CONTEXT_ID(5);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f25923;

    EnumC8480(long j) {
        this.f25923 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f25923;
    }
}
