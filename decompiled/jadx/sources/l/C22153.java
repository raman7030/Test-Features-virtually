package l;

/* JADX INFO: renamed from: l.᩹۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C22153 extends AbstractC12669 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f71899;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return AbstractC4308.f13885;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        boolean zMo12941 = c5138.f16077.mo12941();
        C6319 c6319 = this.f71899;
        if (zMo12941 || c6319.m17550(c5138.f16077, c6319.f19609.f66526)) {
            return c6319.m17470();
        }
        return new C5138(c6319.m17562(c5138.f16077), c5138.f13890);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        if (c8541.mo12939().m12913(EnumC9454.TYPEVAR) || (!c8541.mo12939().mo5146() && !c8541.mo12939().mo12925())) {
            return c8541.mo12939();
        }
        return this.f71899.m17562(c8541.mo12939());
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9465(C12193 c12193, Object obj) {
        return AbstractC4308.f13885;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        if (c19955.f64618 == null) {
            AbstractC4308 abstractC4308Mo23577 = ((C14163) c19955.f13890).mo23577();
            if (c19955.mo12925()) {
                abstractC4308Mo23577 = ((C19955) c19955.f13890.f17560).f64618;
            }
            if (c19955.f64618 == null) {
                C6319 c6319 = this.f71899;
                C2609 c2609Mo12934 = c6319.m17554(c19955).mo12934();
                C2609 c2609Mo12935 = c19955.f13890.f17560.mo12934();
                if (c19955.mo9265()) {
                    c19955.f64618 = c6319.m17518(abstractC4308Mo23577);
                } else if (c2609Mo12935.m8249()) {
                    c19955.f64618 = c6319.m17488(abstractC4308Mo23577, c2609Mo12935, c2609Mo12934);
                } else {
                    c19955.f64618 = abstractC4308Mo23577;
                }
            }
        }
        return c19955.f64618;
    }

    public C22153(C6319 c6319) {
        this.f71899 = c6319;
    }
}
