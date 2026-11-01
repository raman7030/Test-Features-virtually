package p067l;

/* JADX INFO: renamed from: l.۟᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K66K */
/* JADX INFO: loaded from: classes3.dex */
public final class C9674 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public final char f26648;

    public C9674(C12556 c12556, byte b) {
        this.f26648 = (char) C5755.m12844(c12556.m28942(b + 1));
    }

    public C9674(char c) {
        this.f26648 = c;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        byte[] bArrM12845 = C5755.m12845(this.f26648);
        c3838.m7529(EnumC5889.VALUE_CHAR.f14502 | ((bArrM12845.length - 1) << 5));
        c3838.m7527(bArrM12845, 0, bArrM12845.length);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return C5755.m12843(this.f26648) + i + 1;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        char c = ((C9674) abstractC17958).f26648;
        char c2 = this.f26648;
        if (c2 < c) {
            return -1;
        }
        return c2 > c ? 1 : 0;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_CHAR;
    }

    public final int hashCode() {
        return this.f26648;
    }
}
