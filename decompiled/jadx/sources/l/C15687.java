package l;

/* JADX INFO: renamed from: l.ܺۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15687 implements InterfaceC0165 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f48354 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f48355 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10541 f48356;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6307 f48357;

    public C15687(C6307 c6307, C10541 c10541) {
        this.f48357 = c6307;
        this.f48356 = c10541;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36961(long j) {
        this.f48354 = j;
    }

    @Override // l.InterfaceC0165
    /* JADX INFO: renamed from: ֫ */
    public final long mo1283(InterfaceC8424 interfaceC8424) {
        long j = this.f48355;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f48355 = -1L;
        return j2;
    }

    @Override // l.InterfaceC0165
    /* JADX INFO: renamed from: ֫ */
    public final void mo1285(long j) {
        long[] jArr = this.f48356.f31649;
        this.f48355 = jArr[C3603.m11036(jArr, j, true)];
    }

    @Override // l.InterfaceC0165
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9505 mo1284() {
        C22632.m50634(this.f48354 != -1);
        return new C12657(this.f48357, this.f48354);
    }
}
