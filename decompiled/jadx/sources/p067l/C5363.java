package p067l;

/* JADX INFO: renamed from: l.ۗۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5363 extends AbstractC5022 {

    /* JADX INFO: renamed from: ۧ */
    public C16525 f12646;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C14080 f12647;

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ֫ */
    public final void mo10686(byte[] bArr) {
        this.f12646.m37501(0, bArr.length, bArr);
    }

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ֫ */
    public final void mo10684(AbstractC12224 abstractC12224) {
        byte[] bArrMo5096 = abstractC12224.mo5096();
        this.f12646.m37501(abstractC12224.mo5100(), abstractC12224.mo5098(), bArrMo5096);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5363(C14080 c14080, C8374 c8374) {
        super(c8374);
        this.f12647 = c14080;
        this.f12646 = new C16525(64);
    }

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ۧ */
    public final void mo10687(AbstractC6462 abstractC6462) {
        int i = C6704.f17396[abstractC6462.mo5577().ordinal()];
        if (i == 1 || i == 2) {
            mo10687(this.f12647.f39894.m19459(((C18083) abstractC6462).f16992));
        } else {
            super.mo10687(abstractC6462);
        }
    }

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ֫ */
    public final void mo10681(char c) {
        this.f12646.m37500(c);
    }

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ֫ */
    public final void mo10685(C15828 c15828) {
        this.f12647.m31952(c15828);
    }
}
