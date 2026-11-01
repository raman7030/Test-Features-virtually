package p067l;

/* JADX INFO: renamed from: l.ܰ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65W0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15708 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public final byte f45519;

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return i + 2;
    }

    public C15708(C12556 c12556) {
        this.f45519 = (byte) C5755.m12841(c12556.m28942(1));
    }

    public C15708(byte b) {
        this.f45519 = b;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        c3838.m7529(EnumC5889.VALUE_BYTE.f14502);
        c3838.m7529(this.f45519);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        byte b = ((C15708) abstractC17958).f45519;
        byte b2 = this.f45519;
        if (b2 < b) {
            return -1;
        }
        return b2 > b ? 1 : 0;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_BYTE;
    }

    public final int hashCode() {
        return this.f45519;
    }
}
