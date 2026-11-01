package p067l;

/* JADX INFO: renamed from: l.᩷ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O89D */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC22007 implements InterfaceC22910 {
    FIRST_FRAGMENT(1),
    LAST_FRAGMENT(2),
    PENDING_CANCEL(4),
    CONCURRENT_MULTIPLEXING(16),
    DID_NOT_EXECUTE(32),
    MAYBE(64),
    OBJECT_UUID(128);


    /* JADX INFO: renamed from: ᩸ */
    public final int f69232;

    EnumC22007(int i) {
        this.f69232 = i;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f69232;
    }
}
