package l;

/* JADX INFO: renamed from: l.ۗۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3151 extends AbstractC2792 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14896 f9843;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12323 f9844;

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ֫ */
    public final void mo8626(byte[] bArr) {
        this.f9843.m35349(0, bArr.length, bArr);
    }

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ֫ */
    public final void mo8624(AbstractC10370 abstractC10370) {
        byte[] bArrMo2757 = abstractC10370.mo2757();
        this.f9843.m35349(abstractC10370.mo2761(), abstractC10370.mo2759(), bArrMo2757);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3151(C12323 c12323, C6319 c6319) {
        super(c6319);
        this.f9844 = c12323;
        this.f9843 = new C14896(64);
    }

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ۧ */
    public final void mo8627(AbstractC4308 abstractC4308) {
        int i = C4562.f14567[abstractC4308.mo3258().ordinal()];
        if (i == 1 || i == 2) {
            mo8627(this.f9844.f36880.m17519(((C16535) abstractC4308).f14167));
        } else {
            super.mo8627(abstractC4308);
        }
    }

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ֫ */
    public final void mo8621(char c) {
        this.f9843.m35348(c);
    }

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ֫ */
    public final void mo8625(C14163 c14163) {
        this.f9844.m29892(c14163);
    }
}
