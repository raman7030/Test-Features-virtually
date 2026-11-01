package p067l;

/* JADX INFO: renamed from: l.ۡۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10583 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public final short f29309;

    public C10583(C12556 c12556, byte b) {
        this.f29309 = (short) C5755.m12841(c12556.m28942(b + 1));
    }

    public C10583(short s) {
        this.f29309 = s;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        byte[] bArrM12842 = C5755.m12842(this.f29309);
        c3838.m7529(EnumC5889.VALUE_SHORT.f14502 | ((bArrM12842.length - 1) << 5));
        c3838.m7527(bArrM12842, 0, bArrM12842.length);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return C5755.m12846(this.f29309) + i + 1;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        short s = ((C10583) abstractC17958).f29309;
        short s2 = this.f29309;
        if (s2 < s) {
            return -1;
        }
        return s2 > s ? 1 : 0;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_SHORT;
    }

    public final int hashCode() {
        return this.f29309;
    }
}
