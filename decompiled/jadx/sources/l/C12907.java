package l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.۬ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78HC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12907 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f38728;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f38729;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f38730;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19964 f38731;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f38732;

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    public C12907(C19964 c19964, int i, long j, long j2) {
        this.f38731 = c19964;
        this.f38732 = i;
        this.f38730 = j;
        long j3 = (j2 - j) / ((long) c19964.f64651);
        this.f38728 = j3;
        this.f38729 = m31355(j3);
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f38729;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        C19964 c19964 = this.f38731;
        long j2 = (((long) c19964.f64654) * j) / (((long) this.f38732) * 1000000);
        long j3 = this.f38728;
        long jM11016 = C3603.m11016(j2, 0L, j3 - 1);
        long j4 = ((long) c19964.f64651) * jM11016;
        long j5 = this.f38730;
        long jM31355 = m31355(jM11016);
        C8799 c8799 = new C8799(jM31355, j4 + j5);
        if (jM31355 < j && jM11016 != j3 - 1) {
            long j6 = jM11016 + 1;
            return new C6682(c8799, new C8799(m31355(j6), (((long) c19964.f64651) * j6) + j5));
        }
        return new C6682(c8799, c8799);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private long m31355(long j) {
        long j2 = j * ((long) this.f38732);
        long j3 = this.f38731.f64654;
        String str = C3603.f11424;
        return C3603.m11017(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
