package l;

/* JADX INFO: renamed from: l.ۤ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes4.dex */
public final class C10550 implements InterfaceC5900 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6691 f31678;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7727 f31679;

    @Override // l.InterfaceC5900
    /* JADX INFO: renamed from: ۧ */
    public final void mo16541(AbstractC12955 abstractC12955) {
    }

    public C10550(C6691 c6691, C7727 c7727) {
        this.f31678 = c6691;
        this.f31679 = c7727;
    }

    @Override // l.InterfaceC5900
    /* JADX INFO: renamed from: ֫ */
    public final void mo16540(AbstractC12955 abstractC12955) {
        C6691 c6691 = this.f31678;
        String str = c6691.f20796;
        String strMo31524 = abstractC12955.mo31524();
        AbstractC10134 abstractC10134Mo31523 = abstractC12955.mo31523();
        String strM1762 = C0340.m1762(str, strMo31524, abstractC10134Mo31523 == null ? null : abstractC10134Mo31523.mo25455(), abstractC12955.getName());
        String strM1763 = C0340.m1762(c6691.f20796, abstractC12955.mo31524(), (String) null, abstractC12955.getName());
        if (C0340.m1779(c6691, abstractC12955.mo31524(), strM1762, strM1763)) {
            this.f31679.m20702(strM1762, strM1763);
        }
    }

    @Override // l.InterfaceC5900
    /* JADX INFO: renamed from: ܽ */
    public final void mo16542(AbstractC12955 abstractC12955) {
        C11961 c11961M1766;
        C10925 c10925M1764 = C0340.m1764(abstractC12955.mo31523());
        if (c10925M1764 == null || (c11961M1766 = C0340.m1766(this.f31678, abstractC12955, c10925M1764)) == null) {
            return;
        }
        this.f31679.m20703(c11961M1766.f35826, c11961M1766.f35824, c11961M1766.f35827, c11961M1766.f35825);
    }
}
