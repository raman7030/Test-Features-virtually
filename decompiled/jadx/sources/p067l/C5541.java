package p067l;

/* JADX INFO: renamed from: l.ۗܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8TP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5541 extends AbstractC7553 {

    /* JADX INFO: renamed from: ֫ */
    public final long f13361;

    /* JADX INFO: renamed from: ۧ */
    public final long f13362;

    public C5541(long j, long j2) {
        this.f13362 = j;
        this.f13361 = j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5541 m12231(C19203 c19203, long j, C11157 c11157) {
        long jM12230 = m12230(j, c19203);
        return new C5541(jM12230, c11157.m25735(jM12230));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m12230(long j, C19203 c19203) {
        long jM43702 = c19203.m43702();
        if ((128 & jM43702) != 0) {
            return 8589934591L & ((((jM43702 & 1) << 32) | c19203.m43725()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p067l.AbstractC7553
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f13362);
        sb.append(", playbackPositionUs= ");
        return C17520.m39893(sb, this.f13361, " }");
    }
}
