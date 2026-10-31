package l;

/* JADX INFO: renamed from: l.֡᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C0674 extends AbstractC20536 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2609 f2597;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2609 f2598;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f2599;

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        C2609 c2609 = this.f2598;
        C2609 c26010 = this.f2597;
        while (c2609.m8249()) {
            if (!c8541.m12929((AbstractC4308) c2609.f8240)) {
                c2609 = c2609.f8241;
                c26010 = c26010.f8241;
            } else {
                return ((AbstractC4308) c26010.f8240).mo12937(c8541);
            }
        }
        return c8541;
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo2744(C10077 c10077, Object obj) {
        return m2747(c10077);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC4308 mo2744(C10077 c10077, Object obj) {
        return m2747(c10077);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo2145(C19955 c19955, Void r5) {
        if (!c19955.mo5146()) {
            return super.mo2145(c19955, (Object) r5);
        }
        C6319 c6319 = this.f2599;
        AbstractC4308 abstractC4308M6856 = m6856(c6319.m17562(c19955));
        C2609 c2609M4861 = m4861(r5, c6319.m17510(c19955));
        return (abstractC4308M6856 == c6319.m17562(c19955) && c2609M4861 == c6319.m17510(c19955)) ? c19955 : c6319.m17534(c2609M4861.m8246(abstractC4308M6856));
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo2144(C19831 c19831, Void r3) {
        C19831 c19832 = (C19831) super.mo2144(c19831, (Object) r3);
        if (c19832 != c19831 && c19831.mo12922() && c19832.f64066.mo12922()) {
            c19832.f64066 = this.f2599.m17511(c19832.f64066);
        }
        return c19832;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10077 m2747(C10077 c10077) {
        C2609 c2609 = c10077.f30362;
        C2609 c26010 = this.f2597;
        boolean zM12903 = AbstractC4308.m12903(c26010, c2609);
        C6319 c6319 = this.f2599;
        if (zM12903) {
            C2609 c2609M17564 = c6319.m17564(c2609);
            c10077 = new C10077(c6319.m17488(c10077.f14167, c2609, c2609M17564), c2609M17564);
        }
        AbstractC4308 abstractC4308 = c10077.f14167;
        C2609 c26011 = c10077.f30362;
        C2609 c2609M17521 = c6319.m17521(c26011, this.f2598, c26010);
        AbstractC4308 abstractC4308M6856 = m6856(abstractC4308);
        if (c2609M17521 == c26011 && abstractC4308M6856 == abstractC4308) {
            return c10077;
        }
        if (c2609M17521 == c26011) {
            return new C19020(abstractC4308M6856, c2609M17521);
        }
        return new C19726(c6319.m17488(abstractC4308M6856, c26011, c2609M17521), c2609M17521);
    }

    public C0674(C6319 c6319, C2609 c2609, C2609 c26010) {
        this.f2599 = c6319;
        int iM8245 = c2609.m8245();
        int iM8246 = c26010.m8245();
        while (iM8245 > iM8246) {
            iM8245--;
            c2609 = c2609.f8241;
        }
        while (iM8245 < iM8246) {
            iM8246--;
            c26010 = c26010.f8241;
        }
        this.f2598 = c2609;
        this.f2597 = c26010;
    }
}
