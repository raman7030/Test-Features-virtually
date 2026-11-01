package p067l;

/* JADX INFO: renamed from: l.֨᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3745 extends C21333 {

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f7935;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ C21378 f7936;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3745(C21378 c21378, AbstractC6462 abstractC6462, C4848 c4848, C15828 c15828) {
        super(c15828, abstractC6462, c4848);
        this.f7936 = c21378;
        this.f7935 = false;
    }

    @Override // p067l.C21333, p067l.AbstractC6462
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC6462 mo7201() {
        C8374 c8374 = this.f7936.f67398;
        if (!this.f7935) {
            this.f7935 = true;
            this.f16705.m18022();
            AbstractC6462 abstractC6462Mo7201 = this.f16705.f20406.mo7201();
            C13286 c13286 = AbstractC6462.f16700;
            if (abstractC6462Mo7201 != c13286) {
                C4848 c4848Mo14798 = super.mo7201().mo14798();
                C4848 c4848Mo14799 = abstractC6462Mo7201.mo14798();
                if (c4848Mo14799.m10289() != c4848Mo14798.m10289()) {
                    super.mo7202(c8374.m19459(abstractC6462Mo7201));
                } else {
                    super.mo7202(c8374.m19428(abstractC6462Mo7201, c4848Mo14799, c4848Mo14798));
                }
            } else {
                super.mo7202(c13286);
            }
        }
        return super.mo7201();
    }

    @Override // p067l.C21333
    /* JADX INFO: renamed from: ᩳ */
    public final void mo7202(AbstractC6462 abstractC6462) {
        throw new UnsupportedOperationException();
    }
}
