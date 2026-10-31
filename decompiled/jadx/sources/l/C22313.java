package l;

/* JADX INFO: renamed from: l.᩹۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes.dex */
public final class C22313 implements Comparable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f72327;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f72328;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f72329;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f72330;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (int) (((C22313) obj).f72327 - this.f72327);
    }

    public C22313(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, String str, long j) {
        this.f72329 = abstractC15440;
        this.f72328 = abstractC15441;
        this.f72330 = str;
        this.f72327 = j;
    }
}
