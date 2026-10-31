package l;

/* JADX INFO: renamed from: l.᩶۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20037 extends AbstractC12669 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f64929;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return C2609.m8239();
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        if (c8541.mo12939().mo5146()) {
            return this.f64929.m17510(c8541.mo12939());
        }
        if (c8541.mo12939().mo12925()) {
            return C2609.of((Object) c8541.mo12939());
        }
        return C2609.m8239();
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        if (c19955.f64620 == null) {
            C2609 c2609M33806 = ((C14163) c19955.f13890).m33806();
            if (c19955.f64620 == null) {
                C12171.m29639(c19955, c19955 != c19955.f13890.f17560);
                C2609 c2609Mo12934 = c19955.mo12934();
                C2609 c2609Mo12935 = c19955.f13890.f17560.mo12934();
                boolean zMo9265 = c19955.mo9265();
                C6319 c6319 = this.f64929;
                if (zMo9265) {
                    c19955.f64620 = c6319.m17539(c2609M33806);
                } else if (c2609Mo12935.m8249()) {
                    c19955.f64620 = c6319.m17481(c2609M33806, c2609Mo12935, c2609Mo12934);
                } else {
                    c19955.f64620 = c2609M33806;
                }
            }
        }
        return c19955.f64620;
    }

    public C20037(C6319 c6319) {
        this.f64929 = c6319;
    }
}
