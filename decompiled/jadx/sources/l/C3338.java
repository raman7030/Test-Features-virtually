package l;

/* JADX INFO: renamed from: l.ۗܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8TP */
/* JADX INFO: loaded from: classes3.dex */
public final class C3338 extends AbstractC5455 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f10551;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f10552;

    public C3338(long j, long j2) {
        this.f10552 = j;
        this.f10551 = j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3338 m10195(C17714 c17714, long j, C9248 c9248) {
        long jM10194 = m10194(j, c17714);
        return new C3338(jM10194, c9248.m23734(jM10194));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m10194(long j, C17714 c17714) {
        long jM41456 = c17714.m41456();
        if ((128 & jM41456) != 0) {
            return 8589934591L & ((((jM41456 & 1) << 32) | c17714.m41479()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // l.AbstractC5455
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f10552);
        sb.append(", playbackPositionUs= ");
        return C15942.m37718(sb, this.f10551, " }");
    }
}
