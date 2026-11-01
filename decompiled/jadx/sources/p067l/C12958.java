package p067l;

/* JADX INFO: renamed from: l.ۧܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12958 extends AbstractC19663 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final boolean f36448;

    /* JADX INFO: renamed from: ۛ */
    public final int f36449;

    /* JADX INFO: renamed from: ۟ */
    public final int f36450;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f36451;

    /* JADX INFO: renamed from: ۨ */
    public final int f36452;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f36453;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f36454;

    /* JADX INFO: renamed from: ܰ */
    public final int f36455;

    /* JADX INFO: renamed from: ᩺ */
    public final int f36456;

    @Override // p067l.AbstractC19663
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ boolean mo28351(AbstractC19663 abstractC19663) {
        return false;
    }

    public C12958(int i, C15020 c15020, int i2, C24376 c24376, int i3, String str, String str2) {
        AbstractC16192 abstractC16192M36873of;
        int iM20640;
        super(i, c15020, i2);
        int i4 = 0;
        this.f36451 = C12832.m29414(i3, false);
        int i5 = this.f59793.f28542;
        int i6 = c24376.f38577;
        AbstractC16192 abstractC16192 = c24376.f38583;
        int i7 = i5 & (~i6);
        this.f36454 = (i7 & 1) != 0;
        this.f36453 = (i7 & 2) != 0;
        if (str2 != null) {
            abstractC16192M36873of = AbstractC16192.m36873of((Object) str2);
        } else {
            abstractC16192M36873of = abstractC16192.isEmpty() ? AbstractC16192.m36873of((Object) "") : abstractC16192;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= abstractC16192M36873of.size()) {
                i8 = Integer.MAX_VALUE;
                iM20640 = 0;
                break;
            } else {
                iM20640 = C8934.m20640(this.f59793, (String) abstractC16192M36873of.get(i8), c24376.f38572);
                if (iM20640 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f36449 = i8;
        this.f36452 = iM20640;
        int i9 = str2 != null ? 1088 : c24376.f38584;
        int i10 = this.f59793.f28522;
        int i11 = C8934.f24196;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f36456 = iBitCount;
        this.f36448 = (1088 & this.f59793.f28522) != 0;
        int iM20641 = C8934.m20640(this.f59793, str, C8934.m20642(str) == null);
        this.f36455 = iM20641;
        boolean z = iM20640 > 0 || (abstractC16192.isEmpty() && iBitCount > 0) || this.f36454 || (this.f36453 && iM20641 > 0);
        if (C12832.m29414(i3, c24376.f77172) && z) {
            i4 = 1;
        }
        this.f36450 = i4;
    }

    @Override // p067l.AbstractC19663
    /* JADX INFO: renamed from: ֫ */
    public final int mo28349() {
        return this.f36450;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C12958 c12958) {
        AbstractC8543 abstractC8543Mo19899 = AbstractC8543.m19894().mo19900(this.f36451, c12958.f36451).mo19899(Integer.valueOf(this.f36449), Integer.valueOf(c12958.f36449), AbstractC12093.m27883().mo24451());
        int i = c12958.f36452;
        int i2 = this.f36452;
        AbstractC8543 abstractC8543Mo19897 = abstractC8543Mo19899.mo19897(i2, i);
        int i3 = c12958.f36456;
        int i4 = this.f36456;
        AbstractC8543 abstractC8543Mo19898 = abstractC8543Mo19897.mo19897(i4, i3).mo19900(this.f36454, c12958.f36454).mo19899(Boolean.valueOf(this.f36453), Boolean.valueOf(c12958.f36453), i2 == 0 ? AbstractC12093.m27883() : AbstractC12093.m27883().mo24451()).mo19897(this.f36455, c12958.f36455);
        if (i4 == 0) {
            abstractC8543Mo19898 = abstractC8543Mo19898.mo19901(this.f36448, c12958.f36448);
        }
        return abstractC8543Mo19898.mo19896();
    }
}
