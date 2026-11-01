package p067l;

/* JADX INFO: renamed from: l.ᩳۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E50W */
/* JADX INFO: loaded from: classes5.dex */
public final class C19300 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public final C19971 f57651;

    public C19300(C5651 c5651, C12556 c12556, byte b) {
        this.f57651 = (C19971) c5651.f13738.m3722((int) C5755.m12844(c12556.m28942(b + 1)));
    }

    public C19300(C19971 c19971) {
        this.f57651 = c19971;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        byte[] bArrM12845 = C5755.m12845(this.f57651.m16569());
        c3838.m7529(EnumC5889.VALUE_ENUM.f14502 | ((bArrM12845.length - 1) << 5));
        c3838.m7527(bArrM12845, 0, bArrM12845.length);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return C5755.m12843(this.f57651.m16569()) + i + 1;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        return this.f57651.m16569() - ((C19300) abstractC17958).f57651.m16569();
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_ENUM;
    }

    public final int hashCode() {
        return this.f57651.hashCode();
    }
}
