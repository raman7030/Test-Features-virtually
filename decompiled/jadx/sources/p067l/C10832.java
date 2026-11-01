package p067l;

/* JADX INFO: renamed from: l.ۡ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10832 {

    /* JADX INFO: renamed from: ֫ */
    public final C17302 f30004;

    /* JADX INFO: renamed from: ۧ */
    public final long f30005;

    /* JADX INFO: renamed from: ܳ */
    public final long f30006;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC15723 f30007;

    /* JADX INFO: renamed from: ܿ */
    public C22902 f30008;

    /* JADX INFO: renamed from: ᩳ */
    public volatile long f30009 = -1;

    public C10832(long j, long j2, EnumC15723 enumC15723, C17302 c17302) {
        if (j <= 0 || c17302.isEmpty() || (enumC15723 != EnumC15723.USER && enumC15723 != EnumC15723.BATCH)) {
            throw new IllegalArgumentException("Invalid undo record");
        }
        this.f30005 = j;
        this.f30006 = j2;
        this.f30007 = enumC15723;
        this.f30004 = c17302;
    }
}
