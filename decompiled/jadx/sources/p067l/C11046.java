package p067l;

/* JADX INFO: renamed from: l.ۡ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28JD */
/* JADX INFO: loaded from: classes3.dex */
public class C11046 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f30591;

    /* JADX INFO: renamed from: ۧ */
    public final int f30592;

    /* JADX INFO: renamed from: ܳ */
    public final int f30593;

    /* JADX INFO: renamed from: ܽ */
    public final long f30594;

    /* JADX INFO: renamed from: ܿ */
    public final long f30595;

    /* JADX INFO: renamed from: ᩳ */
    public final long f30596;

    /* JADX INFO: renamed from: ᩻ */
    public final long f30597;

    public C11046(int i, int i2, long j, long j2, boolean z) {
        this.f30597 = j;
        this.f30595 = j2;
        this.f30593 = i2 == -1 ? 1 : i2;
        this.f30592 = i;
        this.f30591 = z;
        if (j == -1) {
            this.f30594 = -1L;
            this.f30596 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f30594 = j3;
            this.f30596 = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public long m25452(long j) {
        return m25453(j);
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return this.f30594 != -1 || this.f30591;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        long j2 = this.f30595;
        long j3 = this.f30594;
        if (j3 == -1 && !this.f30591) {
            C10731 c10731 = new C10731(0L, j2);
            return new C8719(c10731, c10731);
        }
        long j4 = (((long) this.f30592) * j) / 8000000;
        int i = this.f30593;
        long j5 = i;
        long jMin = (j4 / j5) * j5;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j5);
        }
        long jMax = j2 + Math.max(jMin, 0L);
        long jM25453 = m25453(jMax);
        C10731 c10732 = new C10731(jM25453, jMax);
        if (j3 == -1 || jM25453 >= j || ((long) i) + jMax >= this.f30597) {
            return new C8719(c10732, c10732);
        }
        long j6 = jMax + ((long) i);
        return new C8719(c10732, new C10731(m25453(j6), j6));
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f30596;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m25453(long j) {
        return (Math.max(0L, j - this.f30595) * 8000000) / ((long) this.f30592);
    }
}
