package l;

/* JADX INFO: renamed from: l.ۜۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 655F */
/* JADX INFO: loaded from: classes3.dex */
public final class C6527 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f20170;

    public C6527(C10720 c10720, byte b) {
        this.f20170 = C3563.m10861(c10720.m26902(b + 1));
    }

    public C6527(long j) {
        this.f20170 = j;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10862 = C3563.m10862(this.f20170);
        c1547.m5300(EnumC3705.VALUE_LONG.f11701 | ((bArrM10862.length - 1) << 5));
        c1547.m5298(bArrM10862, 0, bArrM10862.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return C3563.m10866(this.f20170) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        long j = this.f20170;
        long j2 = ((C6527) abstractC16404).f20170;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_LONG;
    }

    public final int hashCode() {
        return (int) this.f20170;
    }
}
