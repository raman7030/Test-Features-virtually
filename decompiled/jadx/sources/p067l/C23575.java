package p067l;

/* JADX INFO: renamed from: l.᩹۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes.dex */
public final class C23575 implements Comparable {

    /* JADX INFO: renamed from: ۙ */
    public final long f75053;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC17043 f75054;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17043 f75055;

    /* JADX INFO: renamed from: ᩹ */
    public final String f75056;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (int) (((C23575) obj).f75053 - this.f75053);
    }

    public C23575(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, String str, long j) {
        this.f75055 = abstractC17043;
        this.f75054 = abstractC17044;
        this.f75056 = str;
        this.f75053 = j;
    }
}
