package l;

/* JADX INFO: renamed from: l.᩵֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19155 extends AbstractC13509 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f60353;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f60354;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f60355;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f60356;

    public C19155(AbstractC4846 abstractC4846, long j, long j2, boolean z) throws C0103 {
        super(abstractC4846);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new C0103(j, 2, j2);
        }
        boolean z2 = false;
        if (abstractC4846.mo14095() != 1) {
            throw new C0103(0);
        }
        C20369 c20369Mo14103 = abstractC4846.mo14103(0, new C20369(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !c20369Mo14103.f65756 && jMax != 0 && !c20369Mo14103.f65764) {
            throw new C0103(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c20369Mo14103.f65755 : Math.max(0L, j2);
        long j3 = c20369Mo14103.f65755;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f60353 = jMax;
        this.f60356 = jMax2;
        this.f60354 = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c20369Mo14103.f65759 && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.f60355 = z2;
    }

    @Override // l.AbstractC13509, l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C20369 mo14103(int i, C20369 c20369, long j) {
        this.f40320.mo14103(0, c20369, 0L);
        long j2 = c20369.f65757;
        long j3 = this.f60353;
        c20369.f65757 = j2 + j3;
        c20369.f65755 = this.f60354;
        c20369.f65759 = this.f60355;
        long j4 = c20369.f65749;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c20369.f65749 = jMax;
            long j5 = this.f60356;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c20369.f65749 = jMax - j3;
        }
        long jM11037 = C3603.m11037(j3);
        long j6 = c20369.f65750;
        if (j6 != -9223372036854775807L) {
            c20369.f65750 = j6 + jM11037;
        }
        long j7 = c20369.f65762;
        if (j7 != -9223372036854775807L) {
            c20369.f65762 = j7 + jM11037;
        }
        return c20369;
    }

    @Override // l.AbstractC13509, l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C22485 mo14104(int i, C22485 c22485, boolean z) {
        this.f40320.mo14104(0, c22485, z);
        long j = c22485.f72804 - this.f60353;
        long j2 = this.f60354;
        c22485.m50435(c22485.f72803, c22485.f72802, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, C7214.f22068, false);
        return c22485;
    }
}
