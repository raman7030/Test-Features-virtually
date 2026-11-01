package p067l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.۬ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78HC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14635 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public final long f41770;

    /* JADX INFO: renamed from: ۧ */
    public final long f41771;

    /* JADX INFO: renamed from: ܽ */
    public final long f41772;

    /* JADX INFO: renamed from: ܿ */
    public final C21342 f41773;

    /* JADX INFO: renamed from: ᩳ */
    public final int f41774;

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    public C14635(C21342 c21342, int i, long j, long j2) {
        this.f41773 = c21342;
        this.f41774 = i;
        this.f41772 = j;
        long j3 = (j2 - j) / ((long) c21342.f67291);
        this.f41770 = j3;
        this.f41771 = m33441(j3);
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f41771;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        C21342 c21342 = this.f41773;
        long j2 = (((long) c21342.f67294) * j) / (((long) this.f41774) * 1000000);
        long j3 = this.f41770;
        long jM12992 = C5792.m12992(j2, 0L, j3 - 1);
        long j4 = ((long) c21342.f67291) * jM12992;
        long j5 = this.f41772;
        long jM33441 = m33441(jM12992);
        C10731 c10731 = new C10731(jM33441, j4 + j5);
        if (jM33441 < j && jM12992 != j3 - 1) {
            long j6 = jM12992 + 1;
            return new C8719(c10731, new C10731(m33441(j6), (((long) c21342.f67291) * j6) + j5));
        }
        return new C8719(c10731, c10731);
    }

    /* JADX INFO: renamed from: ܽ */
    private long m33441(long j) {
        long j2 = j * ((long) this.f41774);
        long j3 = this.f41773.f67294;
        String str = C5792.f14228;
        return C5792.m12993(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
