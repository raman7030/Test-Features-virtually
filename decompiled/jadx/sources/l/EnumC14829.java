package l;

/* JADX INFO: renamed from: l.ܳ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FL */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14829 implements InterfaceC21614 {
    SMB2_SESSION_FLAG_IS_GUEST(1),
    SMB2_SESSION_FLAG_IS_NULL(2),
    SMB2_SESSION_FLAG_ENCRYPT_DATA(4);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f45238;

    EnumC14829(long j) {
        this.f45238 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f45238;
    }
}
