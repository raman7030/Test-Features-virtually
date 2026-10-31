package l;

/* JADX INFO: renamed from: l.ܰ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65W0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14036 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte f42436;

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return i + 2;
    }

    public C14036(C10720 c10720) {
        this.f42436 = (byte) C3563.m10861(c10720.m26902(1));
    }

    public C14036(byte b) {
        this.f42436 = b;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        c1547.m5300(EnumC3705.VALUE_BYTE.f11701);
        c1547.m5300(this.f42436);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        byte b = ((C14036) abstractC16404).f42436;
        byte b2 = this.f42436;
        if (b2 < b) {
            return -1;
        }
        return b2 > b ? 1 : 0;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_BYTE;
    }

    public final int hashCode() {
        return this.f42436;
    }
}
