package p067l;

/* JADX INFO: renamed from: l.ܺۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17277 implements InterfaceC2525 {

    /* JADX INFO: renamed from: ֫ */
    public long f51492 = -1;

    /* JADX INFO: renamed from: ۧ */
    public long f51493 = -1;

    /* JADX INFO: renamed from: ܽ */
    public C12387 f51494;

    /* JADX INFO: renamed from: ᩳ */
    public C8363 f51495;

    public C17277(C8363 c8363, C12387 c12387) {
        this.f51495 = c8363;
        this.f51494 = c12387;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39127(long j) {
        this.f51492 = j;
    }

    @Override // p067l.InterfaceC2525
    /* JADX INFO: renamed from: ֫ */
    public final long mo3691(InterfaceC10375 interfaceC10375) {
        long j = this.f51493;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f51493 = -1L;
        return j2;
    }

    @Override // p067l.InterfaceC2525
    /* JADX INFO: renamed from: ֫ */
    public final void mo3693(long j) {
        long[] jArr = this.f51494.f34613;
        this.f51493 = jArr[C5792.m13012(jArr, j, true)];
    }

    @Override // p067l.InterfaceC2525
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11402 mo3692() {
        C23877.m52960(this.f51492 != -1);
        return new C14398(this.f51495, this.f51492);
    }
}
