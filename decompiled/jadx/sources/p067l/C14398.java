package p067l;

/* JADX INFO: renamed from: l.۫᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38RU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14398 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public final long f41152;

    /* JADX INFO: renamed from: ۧ */
    public final C8363 f41153;

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    public C14398(C8363 c8363, long j) {
        this.f41153 = c8363;
        this.f41152 = j;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f41153.m19375();
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        C8363 c8363 = this.f41153;
        C23877.m52958(c8363.f22400);
        C12387 c12387 = c8363.f22400;
        long[] jArr = c12387.f34613;
        long[] jArr2 = c12387.f34612;
        int iM13012 = C5792.m13012(jArr, C5792.m12992((((long) c8363.f22408) * j) / 1000000, 0L, c8363.f22404 - 1), false);
        long j2 = iM13012 == -1 ? 0L : jArr[iM13012];
        long j3 = iM13012 != -1 ? jArr2[iM13012] : 0L;
        int i = c8363.f22408;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.f41152;
        C10731 c10731 = new C10731(j4, j3 + j5);
        if (j4 != j && iM13012 != jArr.length - 1) {
            int i2 = iM13012 + 1;
            return new C8719(c10731, new C10731((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
        }
        return new C8719(c10731, c10731);
    }
}
