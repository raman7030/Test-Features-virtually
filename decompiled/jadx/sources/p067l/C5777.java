package p067l;

/* JADX INFO: renamed from: l.ۘ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes3.dex */
public final class C5777 extends AbstractC7257 implements InterfaceC22297 {

    /* JADX INFO: renamed from: ۗ */
    public C4848 f14181;

    /* JADX INFO: renamed from: ۛ */
    public C2417 f14182;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC14355 f14183;

    /* JADX INFO: renamed from: ۫ */
    public C4436 f14184;

    /* JADX INFO: renamed from: ۬ */
    public final EnumC8885 f14185;

    public C5777(C4436 c4436, EnumC8885 enumC8885, AbstractC14355 abstractC14355, C4848 c4848) {
        this.f14184 = c4436;
        this.f14185 = enumC8885;
        this.f14183 = abstractC14355;
        this.f14181 = c4848;
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3788(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        return EnumC5532.MODULE;
    }

    @Override // p067l.InterfaceC22297
    public final C4848 getAnnotations() {
        return this.f14184.f9953;
    }

    @Override // p067l.InterfaceC22297
    /* JADX INFO: renamed from: ۚ */
    public final EnumC8885 mo12958() {
        return this.f14185;
    }

    @Override // p067l.InterfaceC22297
    public final AbstractC14355 getName() {
        return this.f14183;
    }

    @Override // p067l.InterfaceC22297
    /* JADX INFO: renamed from: ܰ */
    public final C4848 mo12959() {
        return this.f14181;
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13724(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60778;
    }
}
