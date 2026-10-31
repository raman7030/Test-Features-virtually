package l;

/* JADX INFO: renamed from: l.ۡ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28JD */
/* JADX INFO: loaded from: classes3.dex */
public class C9130 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f27651;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f27652;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f27653;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f27654;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f27655;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f27656;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f27657;

    public C9130(int i, int i2, long j, long j2, boolean z) {
        this.f27657 = j;
        this.f27655 = j2;
        this.f27653 = i2 == -1 ? 1 : i2;
        this.f27652 = i;
        this.f27651 = z;
        if (j == -1) {
            this.f27654 = -1L;
            this.f27656 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f27654 = j3;
            this.f27656 = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long m23501(long j) {
        return m23502(j);
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return this.f27654 != -1 || this.f27651;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        long j2 = this.f27655;
        long j3 = this.f27654;
        if (j3 == -1 && !this.f27651) {
            C8799 c8799 = new C8799(0L, j2);
            return new C6682(c8799, c8799);
        }
        long j4 = (((long) this.f27652) * j) / 8000000;
        int i = this.f27653;
        long j5 = i;
        long jMin = (j4 / j5) * j5;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j5);
        }
        long jMax = j2 + Math.max(jMin, 0L);
        long jM23502 = m23502(jMax);
        C8799 c87910 = new C8799(jM23502, jMax);
        if (j3 == -1 || jM23502 >= j || ((long) i) + jMax >= this.f27657) {
            return new C6682(c87910, c87910);
        }
        long j6 = jMax + ((long) i);
        return new C6682(c87910, new C8799(m23502(j6), j6));
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f27656;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m23502(long j) {
        return (Math.max(0L, j - this.f27655) * 8000000) / ((long) this.f27652);
    }
}
