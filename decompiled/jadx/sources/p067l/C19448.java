package p067l;

/* JADX INFO: renamed from: l.ᩳۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8IP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19448 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public long f59244;

    /* JADX INFO: renamed from: ۧ */
    public final C6581 f59245;

    /* JADX INFO: renamed from: ܽ */
    public final C6581 f59246;

    public C19448(long j, long[] jArr, long[] jArr2) {
        C23877.m52957(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            C6581 c6581 = new C6581(i);
            this.f59245 = c6581;
            C6581 c6582 = new C6581(i);
            this.f59246 = c6582;
            c6581.m15037(0L);
            c6582.m15037(0L);
        } else {
            this.f59245 = new C6581(length);
            this.f59246 = new C6581(length);
        }
        this.f59245.m15038(jArr);
        this.f59246.m15038(jArr2);
        this.f59244 = j;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return this.f59246.m15035() > 0;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f59244;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        C6581 c6581 = this.f59246;
        if (c6581.m15035() != 0) {
            int iM12986 = C5792.m12986(c6581, j);
            long jM15036 = c6581.m15036(iM12986);
            C6581 c6582 = this.f59245;
            C10731 c10731 = new C10731(jM15036, c6582.m15036(iM12986));
            if (jM15036 == j || iM12986 == c6581.m15035() - 1) {
                return new C8719(c10731, c10731);
            }
            int i = iM12986 + 1;
            return new C8719(c10731, new C10731(c6581.m15036(i), c6582.m15036(i)));
        }
        C10731 c10732 = C10731.f29727;
        return new C8719(c10732, c10732);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44230(long j, long j2) {
        C6581 c6581 = this.f59246;
        int iM15035 = c6581.m15035();
        C6581 c6582 = this.f59245;
        if (iM15035 == 0 && j > 0) {
            c6582.m15037(0L);
            c6581.m15037(0L);
        }
        c6582.m15037(j2);
        c6581.m15037(j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m44231(long j) {
        C6581 c6581 = this.f59246;
        if (c6581.m15035() == 0) {
            return -9223372036854775807L;
        }
        return c6581.m15036(C5792.m12986(this.f59245, j));
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44232(long j) {
        C6581 c6581 = this.f59246;
        return c6581.m15035() != 0 && j - c6581.m15036(c6581.m15035() - 1) < 100000;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m44233(long j) {
        this.f59244 = j;
    }
}
