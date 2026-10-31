package l;

/* JADX INFO: renamed from: l.۠ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K80R */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7983 implements InterfaceC21614 {
    FILE_SUPERSEDE(0),
    FILE_OPEN(1),
    FILE_CREATE(2),
    FILE_OPEN_IF(3),
    FILE_OVERWRITE(4),
    FILE_OVERWRITE_IF(5);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f24661;

    EnumC7983(long j) {
        this.f24661 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f24661;
    }
}
