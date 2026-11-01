package p067l;

/* JADX INFO: renamed from: l.۠ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K80R */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9955 implements InterfaceC22910 {
    FILE_SUPERSEDE(0),
    FILE_OPEN(1),
    FILE_CREATE(2),
    FILE_OPEN_IF(3),
    FILE_OVERWRITE(4),
    FILE_OVERWRITE_IF(5);


    /* JADX INFO: renamed from: ᩸ */
    public long f27574;

    EnumC9955(long j) {
        this.f27574 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f27574;
    }
}
