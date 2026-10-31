package l;

/* JADX INFO: renamed from: l.֡ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8SS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0515 extends AbstractC5455 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f2165;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f2166;

    public C0515(long j, long j2) {
        this.f2166 = j2;
        this.f2165 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0515 m2226(C17714 c17714, int i, long j) {
        long jM41479 = c17714.m41479();
        int i2 = i - 4;
        c17714.m41461(0, i2, new byte[i2]);
        return new C0515(jM41479, j);
    }

    @Override // l.AbstractC5455
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f2166);
        sb.append(", identifier= ");
        return C15942.m37718(sb, this.f2165, " }");
    }
}
