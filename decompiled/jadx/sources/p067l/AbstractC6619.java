package p067l;

/* JADX INFO: renamed from: l.ۙۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1RZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6619 {

    /* JADX INFO: renamed from: ܽ */
    public final C4608 f17065;

    /* JADX INFO: renamed from: ֫ */
    public long f17063 = 0;

    /* JADX INFO: renamed from: ܿ */
    public long f17066 = 0;

    /* JADX INFO: renamed from: ۧ */
    public long f17064 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public long f17067 = 0;

    /* JADX INFO: renamed from: ܽ */
    public abstract long mo11425();

    public AbstractC6619(C4608 c4608) {
        this.f17065 = c4608;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15094() {
        return (int) (3 & (4 - ((((long) (C3395.m5936(this.f17067) + 1)) + this.f17064) + 4)));
    }

    /* JADX INFO: renamed from: ۧ */
    public long m15095() {
        return (((long) (C3395.m5936(this.f17067) + 1)) + this.f17064 + 7) & (-4);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo11423(long j, long j2) throws C4608 {
        this.f17063 += (3 + j) & (-4);
        this.f17066 += j2;
        this.f17064 += (long) (C3395.m5936(j2) + C3395.m5936(j));
        this.f17067++;
        if (this.f17063 < 0 || this.f17066 < 0 || m15095() > 17179869184L || mo11425() < 0) {
            throw this.f17065;
        }
    }
}
