package l;

/* JADX INFO: renamed from: l.ۙۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1RZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4473 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2357 f14238;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f14236 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f14239 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f14237 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f14240 = 0;

    /* JADX INFO: renamed from: ܽ */
    public abstract long mo9383();

    public AbstractC4473(C2357 c2357) {
        this.f14238 = c2357;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13212() {
        return (int) (3 & (4 - ((((long) (C1080.m3665(this.f14240) + 1)) + this.f14237) + 4)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long m13213() {
        return (((long) (C1080.m3665(this.f14240) + 1)) + this.f14237 + 7) & (-4);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9381(long j, long j2) throws C2357 {
        this.f14236 += (3 + j) & (-4);
        this.f14239 += j2;
        this.f14237 += (long) (C1080.m3665(j2) + C1080.m3665(j));
        this.f14240++;
        if (this.f14236 < 0 || this.f14239 < 0 || m13213() > 17179869184L || mo9383() < 0) {
            throw this.f14238;
        }
    }
}
