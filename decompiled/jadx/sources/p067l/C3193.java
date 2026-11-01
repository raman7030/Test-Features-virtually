package p067l;

/* JADX INFO: renamed from: l.֨ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3193 extends C23311 {

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC12224 f6191;

    public C3193(EnumC21300 enumC21300, int i, int i2, AbstractC12224 abstractC12224, C4848 c4848) {
        super(enumC21300, i, i2, c4848);
        this.f6191 = abstractC12224;
    }

    @Override // p067l.C23311
    /* JADX INFO: renamed from: ֫ */
    public final void mo5507() {
        EnumC22641 enumC22641 = this.f73357.f67121;
        EnumC22641 enumC22642 = EnumC22641.NAMED;
        if (enumC22641 == enumC22642) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC22642);
    }

    @Override // p067l.C23311
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC12224 mo5508() {
        return this.f6191;
    }
}
