package l;

/* JADX INFO: renamed from: l.ܶ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C15096 extends AbstractC4203 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f46173;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return ((AbstractC5698) obj).f17560;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        return this.f46173.m17543((AbstractC5698) obj, c8541.mo12939());
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9465(C12193 c12193, Object obj) {
        return c12193;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        C6319 c6319 = this.f46173;
        return c6319.m17543((AbstractC5698) obj, c6319.m17511(c19831));
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        AbstractC5698 abstractC5699 = abstractC5698.f17561;
        if ((abstractC5698.mo16084() & 8) == 0 && abstractC5699.f17560.mo12917()) {
            C6319 c6319 = this.f46173;
            AbstractC4308 abstractC4308M17490 = c6319.m17490(abstractC5699, c19955);
            if (c19955.mo5146()) {
                abstractC4308M17490 = c6319.m17523(abstractC4308M17490);
            }
            if (abstractC4308M17490 != null) {
                C2609 c2609Mo12934 = abstractC5699.f17560.mo12934();
                C2609 c2609Mo12935 = abstractC4308M17490.mo12934();
                if (c2609Mo12934.m8249()) {
                    if (c2609Mo12935.isEmpty()) {
                        return c6319.m17519(abstractC5698.f17560);
                    }
                    return c6319.m17488(abstractC5698.f17560, c2609Mo12934, c2609Mo12935);
                }
            }
        }
        return abstractC5698.f17560;
    }

    public C15096(C6319 c6319) {
        this.f46173 = c6319;
    }
}
