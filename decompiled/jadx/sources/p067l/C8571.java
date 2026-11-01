package p067l;

/* JADX INFO: renamed from: l.ۜۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 655F */
/* JADX INFO: loaded from: classes3.dex */
public final class C8571 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public final long f23048;

    public C8571(C12556 c12556, byte b) {
        this.f23048 = C5755.m12841(c12556.m28942(b + 1));
    }

    public C8571(long j) {
        this.f23048 = j;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        byte[] bArrM12842 = C5755.m12842(this.f23048);
        c3838.m7529(EnumC5889.VALUE_LONG.f14502 | ((bArrM12842.length - 1) << 5));
        c3838.m7527(bArrM12842, 0, bArrM12842.length);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return C5755.m12846(this.f23048) + i + 1;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        long j = this.f23048;
        long j2 = ((C8571) abstractC17958).f23048;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_LONG;
    }

    public final int hashCode() {
        return (int) this.f23048;
    }
}
