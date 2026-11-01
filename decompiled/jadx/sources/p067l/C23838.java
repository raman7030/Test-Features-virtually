package p067l;

/* JADX INFO: renamed from: l.᩹᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes.dex */
public class C23838 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final String f75739;

    /* JADX INFO: renamed from: ۙ */
    public final long f75740;

    /* JADX INFO: renamed from: ۛ */
    public final int f75741;

    /* JADX INFO: renamed from: ۤ */
    public final C23168 f75742;

    /* JADX INFO: renamed from: ۨ */
    public final long f75743;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f75744;

    /* JADX INFO: renamed from: ۬ */
    public final String f75745;

    /* JADX INFO: renamed from: ᩶ */
    public final C21037 f75746;

    /* JADX INFO: renamed from: ᩸ */
    public final long f75747;

    /* JADX INFO: renamed from: ᩹ */
    public final long f75748;

    /* JADX INFO: renamed from: ᩺ */
    public final String f75749;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l2 = (Long) obj;
        long jLongValue = l2.longValue();
        long j = this.f75743;
        if (j > jLongValue) {
            return 1;
        }
        return j < l2.longValue() ? -1 : 0;
    }

    public C23838(String str, C23168 c23168, long j, int i, long j2, C21037 c21037, String str2, String str3, long j3, long j4, boolean z) {
        this.f75749 = str;
        this.f75742 = c23168;
        this.f75740 = j;
        this.f75741 = i;
        this.f75743 = j2;
        this.f75746 = c21037;
        this.f75745 = str2;
        this.f75739 = str3;
        this.f75748 = j3;
        this.f75747 = j4;
        this.f75744 = z;
    }
}
