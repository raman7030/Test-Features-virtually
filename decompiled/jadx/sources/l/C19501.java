package l;

/* JADX INFO: renamed from: l.᩵ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19501 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63022;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f63023;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f63024;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f63025;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44915(int i, float f, long j) {
        this.f63022 = i;
        this.f63023 = j;
        this.f63025 = Math.abs(f);
        this.f63024 = -1.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m44914(int i, int i2, float f, float f2, float f3, long j) {
        if (f == f2) {
            return f;
        }
        int iRound = Math.round(f);
        int iRound2 = Math.round(f2);
        if (this.f63024 < 0.0f) {
            if (i2 < iRound || i2 > iRound2 || i < iRound || i > iRound2) {
                float f4 = this.f63025;
                this.f63024 = f4 / ((f3 * 1000.0f) + f4);
            } else {
                long j2 = this.f63023;
                if (j > j2) {
                    this.f63025 = (float) Math.abs(((((double) i) - ((double) this.f63022)) * 1000.0d) / (j - j2));
                    this.f63022 = i;
                    this.f63023 = j;
                }
            }
        }
        int iMax = Math.max(iRound, Math.min(iRound2, i));
        return Math.max(f, Math.min(f2, iMax)) + ((float) ((((double) i) - ((double) iMax)) * ((double) Math.max(0.0f, this.f63024))));
    }
}
