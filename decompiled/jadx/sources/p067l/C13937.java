package p067l;

/* JADX INFO: renamed from: l.۫ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13937 extends C4351 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11216 f39317;

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        if (c21333 instanceof C7921) {
            c21333 = (C7921) c21333;
            C8374 c8374 = this.f39317.f31200;
            C20271 c20271 = new C20271();
            C20271 c20272 = new C20271();
            for (AbstractC6462 abstractC6462 : c21333.f67261) {
                if (abstractC6462.mo14781()) {
                    c20271.m45778(abstractC6462.f16705.f20406.mo14798());
                }
                c20272.m45777(abstractC6462.f16705.f20406);
            }
            C7921 c7921M19474 = c8374.m19474(c20272.m45783());
            c7921M19474.f67258 = c20271.m45783();
            AbstractC21195 abstractC21195 = c7921M19474.f16705;
            abstractC21195.f20409 |= 512;
            c8374.m19433(abstractC21195);
        }
        return c21333;
    }

    public C13937(C11216 c11216) {
        this.f39317 = c11216;
    }
}
