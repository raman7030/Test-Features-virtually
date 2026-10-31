package l;

/* JADX INFO: renamed from: l.۟᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K66K */
/* JADX INFO: loaded from: classes3.dex */
public final class C7687 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char f23735;

    public C7687(C10720 c10720, byte b) {
        this.f23735 = (char) C3563.m10864(c10720.m26902(b + 1));
    }

    public C7687(char c) {
        this.f23735 = c;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10865 = C3563.m10865(this.f23735);
        c1547.m5300(EnumC3705.VALUE_CHAR.f11701 | ((bArrM10865.length - 1) << 5));
        c1547.m5298(bArrM10865, 0, bArrM10865.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return C3563.m10863(this.f23735) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        char c = ((C7687) abstractC16404).f23735;
        char c2 = this.f23735;
        if (c2 < c) {
            return -1;
        }
        return c2 > c ? 1 : 0;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_CHAR;
    }

    public final int hashCode() {
        return this.f23735;
    }
}
