package l;

/* JADX INFO: renamed from: l.۫ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12173 extends C2086 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9310 f36306;

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        if (c19955 instanceof C5843) {
            c19955 = (C5843) c19955;
            C6319 c6319 = this.f36306.f28251;
            C18837 c18837 = new C18837();
            C18837 c18838 = new C18837();
            for (AbstractC4308 abstractC4308 : c19955.f64620) {
                if (abstractC4308.mo12917()) {
                    c18837.m43512(abstractC4308.f13890.f17560.mo12934());
                }
                c18838.m43511(abstractC4308.f13890.f17560);
            }
            C5843 c5843M17534 = c6319.m17534(c18838.m43517());
            c5843M17534.f64617 = c18837.m43517();
            AbstractC19810 abstractC19810 = c5843M17534.f13890;
            abstractC19810.f17563 |= 512;
            c6319.m17493(abstractC19810);
        }
        return c19955;
    }

    public C12173(C9310 c9310) {
        this.f36306 = c9310;
    }
}
