package p067l;

/* JADX INFO: renamed from: l.ۨܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C13559 extends AbstractC15079 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f38138;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8374 f38139;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        throw new AssertionError();
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5083(C11945 c11945, Object obj) {
        AbstractC6462 abstractC6462 = c11945.f16992;
        AbstractC6462 abstractC6463 = (AbstractC6462) obj;
        boolean zM14777 = abstractC6463.m14777(EnumC11353.FORALL);
        C8374 c8374 = this.f38139;
        boolean z = false;
        if (!zM14777) {
            if (!this.f38138) {
                z = abstractC6463.m14777(EnumC11353.METHOD) && c8374.m19469(((C12497) abstractC6462).f35030, abstractC6463.mo14797());
            }
            return Boolean.valueOf(z);
        }
        C11945 c11946 = (C11945) abstractC6463;
        return Boolean.valueOf(c8374.m19447(c11945, c11946) && ((Boolean) abstractC6462.mo5291(this, c8374.m19428(c11946.f16992, c11946.f33323, c11945.f33323))).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9477(C12497 c12497, Object obj) {
        boolean z;
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (abstractC6462.m14777(EnumC11353.METHOD)) {
            if (this.f38139.m19469(c12497.f35030, abstractC6462.mo14797())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo11508(C13956 c13956, Object obj) {
        return Boolean.FALSE;
    }

    public C13559(C8374 c8374, boolean z) {
        this.f38139 = c8374;
        this.f38138 = z;
    }
}
