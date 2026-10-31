package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.۠ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8298 extends AbstractC4846 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Object f25478 = new Object();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f25479;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f25480;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f25481;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f25482;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f25483;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f25484 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f25485;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f25486;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f25487;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6236 f25488;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f25489;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f25490;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11197 f25491;

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final int mo14095() {
        return 1;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ۧ */
    public final int mo14107() {
        return 1;
    }

    static {
        C22464 c22464 = new C22464();
        c22464.m50397("SinglePeriodTimeline");
        c22464.m50395(Uri.EMPTY);
        c22464.m50394();
    }

    public C8298(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, C6664 c6664, C11197 c11197, C6236 c6236) {
        this.f25490 = j;
        this.f25480 = j2;
        this.f25481 = j3;
        this.f25486 = j4;
        this.f25479 = j5;
        this.f25482 = j6;
        this.f25489 = z;
        this.f25487 = z2;
        this.f25483 = z3;
        this.f25485 = c6664;
        c11197.getClass();
        this.f25491 = c11197;
        this.f25488 = c6236;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C20369 mo14103(int i, C20369 c20369, long j) {
        long j2;
        C22632.m50627(i, 1);
        long j3 = this.f25482;
        boolean z = this.f25487;
        if (!z || this.f25483 || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f25486;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        Object obj = C20369.f65748;
        c20369.m46686(this.f25491, this.f25485, this.f25490, this.f25480, this.f25484, this.f25489, z, this.f25488, j2, this.f25486, this.f25479);
        return c20369;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C22485 mo14104(int i, C22485 c22485, boolean z) {
        C22632.m50627(i, 1);
        Object obj = z ? f25478 : null;
        long j = -this.f25479;
        c22485.getClass();
        c22485.m50435(null, obj, 0, this.f25481, j, C7214.f22068, false);
        return c22485;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final int mo14098(Object obj) {
        return f25478.equals(obj) ? 0 : -1;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14102(int i) {
        C22632.m50627(i, 1);
        return f25478;
    }
}
