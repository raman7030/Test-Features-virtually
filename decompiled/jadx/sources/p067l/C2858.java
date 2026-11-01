package p067l;

/* JADX INFO: renamed from: l.֡ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8SS */
/* JADX INFO: loaded from: classes3.dex */
public final class C2858 extends AbstractC7553 {

    /* JADX INFO: renamed from: ֫ */
    public final long f4938;

    /* JADX INFO: renamed from: ۧ */
    public final long f4939;

    public C2858(long j, long j2) {
        this.f4939 = j2;
        this.f4938 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2858 m4593(C19203 c19203, int i, long j) {
        long jM43725 = c19203.m43725();
        int i2 = i - 4;
        c19203.m43707(0, i2, new byte[i2]);
        return new C2858(jM43725, j);
    }

    @Override // p067l.AbstractC7553
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f4939);
        sb.append(", identifier= ");
        return C17520.m39893(sb, this.f4938, " }");
    }
}
