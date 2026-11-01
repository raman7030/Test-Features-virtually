package p067l;

/* JADX INFO: renamed from: l.᩻ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N55R */
/* JADX INFO: loaded from: classes.dex */
public final class C24664 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public final int f78038;

    public C24664(C12556 c12556, byte b) {
        this.f78038 = (int) C5755.m12841(c12556.m28942(b + 1));
    }

    public C24664(int i) {
        this.f78038 = i;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        byte[] bArrM12842 = C5755.m12842(this.f78038);
        c3838.m7529(EnumC5889.VALUE_INT.f14502 | ((bArrM12842.length - 1) << 5));
        c3838.m7527(bArrM12842, 0, bArrM12842.length);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return C5755.m12846(this.f78038) + i + 1;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        int i = ((C24664) abstractC17958).f78038;
        int i2 = this.f78038;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_INT;
    }

    public final int hashCode() {
        return this.f78038;
    }
}
