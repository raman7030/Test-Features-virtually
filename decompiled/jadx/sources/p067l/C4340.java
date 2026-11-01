package p067l;

/* JADX INFO: renamed from: l.֫᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4340 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public final long f9702;

    /* JADX INFO: renamed from: ۧ */
    public final long f9703;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC19763 f9704;

    /* JADX INFO: renamed from: ܽ */
    public final long f9705;

    /* JADX INFO: renamed from: ܿ */
    public final long f9706;

    /* JADX INFO: renamed from: ᩳ */
    public final long f9707;

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    public C4340(InterfaceC19763 interfaceC19763, long j, long j2, long j3, long j4, long j5) {
        this.f9704 = interfaceC19763;
        this.f9707 = j;
        this.f9705 = j2;
        this.f9706 = j3;
        this.f9703 = j4;
        this.f9702 = j5;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        C10731 c10731 = new C10731(j, C18421.m41958(this.f9704.mo22134(j), 0L, this.f9705, this.f9706, this.f9703, this.f9702));
        return new C8719(c10731, c10731);
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f9707;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m8954(long j) {
        return this.f9704.mo22134(j);
    }
}
