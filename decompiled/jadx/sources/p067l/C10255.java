package p067l;

import android.net.Uri;

/* JADX INFO: renamed from: l.۠ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10255 extends AbstractC6974 {

    /* JADX INFO: renamed from: ᩴ */
    public static final Object f28388 = new Object();

    /* JADX INFO: renamed from: ۖ */
    public final long f28389;

    /* JADX INFO: renamed from: ۘ */
    public final long f28390;

    /* JADX INFO: renamed from: ۜ */
    public final long f28391;

    /* JADX INFO: renamed from: ۡ */
    public final long f28392;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f28393;

    /* JADX INFO: renamed from: ۧ */
    public final long f28394 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ */
    public final Object f28395;

    /* JADX INFO: renamed from: ܺ */
    public final long f28396;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f28397;

    /* JADX INFO: renamed from: ܿ */
    public final C8295 f28398;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f28399;

    /* JADX INFO: renamed from: ᩷ */
    public final long f28400;

    /* JADX INFO: renamed from: ᩻ */
    public final C13010 f28401;

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final int mo15975() {
        return 1;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ۧ */
    public final int mo15987() {
        return 1;
    }

    static {
        C23718 c23718 = new C23718();
        c23718.m52738("SinglePeriodTimeline");
        c23718.m52736(Uri.EMPTY);
        c23718.m52735();
    }

    public C10255(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, C8702 c8702, C13010 c13010, C8295 c8295) {
        this.f28400 = j;
        this.f28390 = j2;
        this.f28391 = j3;
        this.f28396 = j4;
        this.f28389 = j5;
        this.f28392 = j6;
        this.f28399 = z;
        this.f28397 = z2;
        this.f28393 = z3;
        this.f28395 = c8702;
        c13010.getClass();
        this.f28401 = c13010;
        this.f28398 = c8295;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C21727 mo15983(int i, C21727 c21727, long j) {
        long j2;
        C23877.m52953(i, 1);
        long j3 = this.f28392;
        boolean z = this.f28397;
        if (!z || this.f28393 || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f28396;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        Object obj = C21727.f68424;
        c21727.m49009(this.f28401, this.f28395, this.f28400, this.f28390, this.f28394, this.f28399, z, this.f28398, j2, this.f28396, this.f28389);
        return c21727;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C23738 mo15984(int i, C23738 c23738, boolean z) {
        C23877.m52953(i, 1);
        Object obj = z ? f28388 : null;
        long j = -this.f28389;
        c23738.getClass();
        c23738.m52776(null, obj, 0, this.f28391, j, C9224.f24953, false);
        return c23738;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final int mo15978(Object obj) {
        return f28388.equals(obj) ? 0 : -1;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15982(int i) {
        C23877.m52953(i, 1);
        return f28388;
    }
}
