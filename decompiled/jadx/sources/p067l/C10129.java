package p067l;

/* JADX INFO: renamed from: l.۠۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C10129 extends AbstractC21885 {

    /* JADX INFO: renamed from: ᩸ */
    public C8788 f28078;

    @Override // p067l.C4351, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo4507(Object obj, AbstractC6462 abstractC6462) {
        return !abstractC6462.m14777(EnumC11353.DEFERRED) ? abstractC6462 : mo4626((C3423) abstractC6462, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo4626(C3423 c3423, Object obj) {
        C8788 c8788 = this.f28078;
        int iOrdinal = c8788.f23845.ordinal();
        if (iOrdinal == 0) {
            return c3423.mo6078(c8788.f23847, c8788.f23844);
        }
        if (iOrdinal == 1) {
            AbstractC6462 abstractC6462 = c3423.f6819.f18925;
            return abstractC6462 == null ? AbstractC6462.f16700 : abstractC6462;
        }
        C1446.m31698();
        throw null;
    }

    public C10129(C14152 c14152, EnumC15511 enumC15511, AbstractC7783 abstractC7783, EnumC18298 enumC18298) {
        this.f28078 = new C8788(c14152, enumC15511, abstractC7783, enumC18298, c14152.f40364.f23805, c14152.f40370, c14152.f40358.f22469);
    }
}
