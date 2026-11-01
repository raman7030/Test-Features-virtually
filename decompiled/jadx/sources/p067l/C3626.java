package p067l;

/* JADX INFO: renamed from: l.֨᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes3.dex */
public final class C3626 extends AbstractC7257 implements InterfaceC17406 {

    /* JADX INFO: renamed from: ֫֫ */
    public AbstractC15689 f7508;

    /* JADX INFO: renamed from: ۗ */
    public C4848 f7509;

    /* JADX INFO: renamed from: ۛ */
    public C2417 f7510;

    /* JADX INFO: renamed from: ۟ */
    public C24407 f7511;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC15575 f7512;

    /* JADX INFO: renamed from: ۨ */
    public C23737 f7513;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC13884 f7514;

    /* JADX INFO: renamed from: ۬ */
    public C10570 f7515;

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC19740 f7516;

    /* JADX INFO: renamed from: ᩺ */
    public C9794 f7517;

    public C3626() {
        throw null;
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3780(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        return EnumC5532.COMPILATION_UNIT;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final C5777 m6848() {
        for (AbstractC7257 abstractC7257 : this.f7509) {
            if (abstractC7257.m16617(EnumC19998.f60778)) {
                return (C5777) abstractC7257;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final C9800 m6851() {
        if (this.f7509.isEmpty() || !((AbstractC7257) this.f7509.f11034).m16617(EnumC19998.f60726)) {
            return null;
        }
        return (C9800) this.f7509.f11034;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final AbstractC14355 m6847() {
        C9800 c9800M6851 = m6851();
        if (c9800M6851 != null) {
            return c9800M6851.f27115;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final C4848 m6849() {
        C20271 c20271 = new C20271();
        for (AbstractC7257 abstractC7257 : this.f7509) {
            if (abstractC7257.m16617(EnumC19998.f60715)) {
                c20271.m45777((C12483) abstractC7257);
            } else if (!abstractC7257.m16617(EnumC19998.f60726) && !abstractC7257.m16617(EnumC19998.f60764)) {
                break;
            }
        }
        return c20271.m45783();
    }

    @Override // p067l.InterfaceC17406
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC19740 mo6846() {
        return this.f7516;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final C4848 m6850() {
        C4848 c4848 = this.f7509;
        while (!c4848.isEmpty() && (((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60778) || ((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60726) || ((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60715))) {
            c4848 = c4848.f11035;
        }
        return c4848;
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13717(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60733;
    }
}
