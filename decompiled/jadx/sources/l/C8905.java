package l;

/* JADX INFO: renamed from: l.ۡ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8905 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15713 f27081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f27082;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f27083;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC14051 f27084;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21605 f27085;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f27086 = -1;

    public C8905(long j, long j2, EnumC14051 enumC14051, C15713 c15713) {
        if (j <= 0 || c15713.isEmpty() || (enumC14051 != EnumC14051.USER && enumC14051 != EnumC14051.BATCH)) {
            throw new IllegalArgumentException("Invalid undo record");
        }
        this.f27082 = j;
        this.f27083 = j2;
        this.f27084 = enumC14051;
        this.f27081 = c15713;
    }
}
