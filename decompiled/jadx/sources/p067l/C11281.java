package p067l;

/* JADX INFO: renamed from: l.ۢۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C11281 extends AbstractC13154 implements InterfaceC3819 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f31431;

    /* JADX INFO: renamed from: ۛ */
    public AbstractC14355 f31432;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC12224 f31433;

    /* JADX INFO: renamed from: ۨ */
    public int f31434 = -1;

    /* JADX INFO: renamed from: ۫ */
    public C4436 f31435;

    /* JADX INFO: renamed from: ۬ */
    public AbstractC14355 f31436;

    /* JADX INFO: renamed from: ܰ */
    public AbstractC14355 f31437;

    /* JADX INFO: renamed from: ᩺ */
    public C13818 f31438;

    public C11281(C4436 c4436, AbstractC12224 abstractC12224, AbstractC14355 abstractC14355, AbstractC14355 abstractC14356, C13818 c13818, boolean z) {
        this.f31435 = c4436;
        this.f31433 = abstractC12224;
        this.f31437 = abstractC14355;
        this.f31436 = abstractC14356;
        this.f31438 = c13818;
        this.f31431 = z;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean m26219() {
        return this.f31437 == null;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean m26220() {
        return this.f31431;
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3805(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        return EnumC5532.VARIABLE;
    }

    @Override // p067l.InterfaceC3819
    /* JADX INFO: renamed from: ܳ */
    public final C4436 mo7439() {
        return this.f31435;
    }

    @Override // p067l.InterfaceC3819
    public final AbstractC12224 getName() {
        return this.f31433;
    }

    @Override // p067l.InterfaceC3819
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC14355 mo7440() {
        return this.f31432;
    }

    @Override // p067l.InterfaceC3819
    public final InterfaceC14919 getType() {
        return this.f31437;
    }

    @Override // p067l.InterfaceC3819
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC14355 mo7438() {
        return this.f31436;
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo10750(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60802;
    }
}
