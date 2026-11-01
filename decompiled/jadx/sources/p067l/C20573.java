package p067l;

/* JADX INFO: renamed from: l.᩵֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes5.dex */
public final class C20573 extends AbstractC15207 {

    /* JADX INFO: renamed from: ܳ */
    public final long f63584;

    /* JADX INFO: renamed from: ܽ */
    public final long f63585;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f63586;

    /* JADX INFO: renamed from: ᩳ */
    public final long f63587;

    public C20573(AbstractC6974 abstractC6974, long j, long j2, boolean z) throws C2466 {
        super(abstractC6974);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new C2466(j, 2, j2);
        }
        boolean z2 = false;
        if (abstractC6974.mo15975() != 1) {
            throw new C2466(0);
        }
        C21727 c21727Mo15983 = abstractC6974.mo15983(0, new C21727(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !c21727Mo15983.f68432 && jMax != 0 && !c21727Mo15983.f68440) {
            throw new C2466(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c21727Mo15983.f68431 : Math.max(0L, j2);
        long j3 = c21727Mo15983.f68431;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f63584 = jMax;
        this.f63587 = jMax2;
        this.f63585 = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c21727Mo15983.f68435 && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.f63586 = z2;
    }

    @Override // p067l.AbstractC15207, p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C21727 mo15983(int i, C21727 c21727, long j) {
        this.f43390.mo15983(0, c21727, 0L);
        long j2 = c21727.f68433;
        long j3 = this.f63584;
        c21727.f68433 = j2 + j3;
        c21727.f68431 = this.f63585;
        c21727.f68435 = this.f63586;
        long j4 = c21727.f68425;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c21727.f68425 = jMax;
            long j5 = this.f63587;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c21727.f68425 = jMax - j3;
        }
        long jM13013 = C5792.m13013(j3);
        long j6 = c21727.f68426;
        if (j6 != -9223372036854775807L) {
            c21727.f68426 = j6 + jM13013;
        }
        long j7 = c21727.f68438;
        if (j7 != -9223372036854775807L) {
            c21727.f68438 = j7 + jM13013;
        }
        return c21727;
    }

    @Override // p067l.AbstractC15207, p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C23738 mo15984(int i, C23738 c23738, boolean z) {
        this.f43390.mo15984(0, c23738, z);
        long j = c23738.f75530 - this.f63584;
        long j2 = this.f63585;
        c23738.m52776(c23738.f75529, c23738.f75528, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, C9224.f24953, false);
        return c23738;
    }
}
