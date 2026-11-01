package p067l;

/* JADX INFO: renamed from: l.᩵ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20902 {

    /* JADX INFO: renamed from: ֫ */
    public int f65639;

    /* JADX INFO: renamed from: ۧ */
    public long f65640;

    /* JADX INFO: renamed from: ܽ */
    public float f65641;

    /* JADX INFO: renamed from: ᩳ */
    public float f65642;

    /* JADX INFO: renamed from: ֫ */
    public final void m47213(int i, float f, long j) {
        this.f65639 = i;
        this.f65640 = j;
        this.f65642 = Math.abs(f);
        this.f65641 = -1.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m47212(int i, int i2, float f, float f2, float f3, long j) {
        if (f == f2) {
            return f;
        }
        int iRound = Math.round(f);
        int iRound2 = Math.round(f2);
        if (this.f65641 < 0.0f) {
            if (i2 < iRound || i2 > iRound2 || i < iRound || i > iRound2) {
                float f4 = this.f65642;
                this.f65641 = f4 / ((f3 * 1000.0f) + f4);
            } else {
                long j2 = this.f65640;
                if (j > j2) {
                    this.f65642 = (float) Math.abs(((((double) i) - ((double) this.f65639)) * 1000.0d) / (j - j2));
                    this.f65639 = i;
                    this.f65640 = j;
                }
            }
        }
        int iMax = Math.max(iRound, Math.min(iRound2, i));
        return Math.max(f, Math.min(f2, iMax)) + ((float) ((((double) i) - ((double) iMax)) * ((double) Math.max(0.0f, this.f65641))));
    }
}
