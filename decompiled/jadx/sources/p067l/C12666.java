package p067l;

/* JADX INFO: renamed from: l.ۧۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 556V */
/* JADX INFO: loaded from: classes4.dex */
public final class C12666 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public final C12920 f35559;

    /* JADX INFO: renamed from: ۬ */
    public byte[] f35560;

    public C12666(C12920 c12920) {
        super(1, -1);
        this.f35559 = c12920;
        this.f35560 = null;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_ENCODED_ARRAY_ITEM;
    }

    public final int hashCode() {
        return this.f35559.hashCode();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ֫ */
    public final int mo5190(AbstractC5289 abstractC5289) {
        return this.f35559.compareTo(((C12666) abstractC5289).f35559);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return this.f35559.mo4819();
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C25129.m55181(c3948, this.f35559);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        C19705 c19705 = new C19705();
        new C25129(c6630.m18447(), c19705).m55185(this.f35559, false);
        byte[] bArrM44779 = c19705.m44779();
        this.f35560 = bArrM44779;
        m11431(bArrM44779.length);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        if (c19705.m44765()) {
            c19705.m44760(0, m11433() + " encoded array");
            new C25129(c3948, c19705).m55185(this.f35559, true);
            return;
        }
        c19705.m44764(this.f35560);
    }
}
