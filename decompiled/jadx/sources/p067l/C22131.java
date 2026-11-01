package p067l;

/* JADX INFO: renamed from: l.᩷ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NG */
/* JADX INFO: loaded from: classes5.dex */
public class C22131 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public final long f70011;

    /* JADX INFO: renamed from: ۧ */
    public final C8719 f70012;

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return false;
    }

    public C22131(long j) {
        this(j, 0L);
    }

    public C22131(long j, long j2) {
        this.f70011 = j;
        C10731 c10731 = j2 == 0 ? C10731.f29727 : new C10731(0L, j2);
        this.f70012 = new C8719(c10731, c10731);
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f70011;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        return this.f70012;
    }
}
