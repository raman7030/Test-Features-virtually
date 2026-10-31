package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public class C13185 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f39421;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12480 f39422;

    public C13185(C12480 c12480, AbstractC5698 abstractC5698) {
        this.f39422 = c12480;
        this.f39421 = abstractC5698;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo13818(AbstractC4308 abstractC4308) {
        C12480 c12480 = this.f39422;
        C6319 c6319 = c12480.f37507;
        C6319 c63110 = c12480.f37507;
        AbstractC4308 abstractC4308M17537 = c6319.m17537(abstractC4308);
        abstractC4308M17537.getClass();
        if (abstractC4308M17537 instanceof C5843) {
            Iterator it = ((C5843) abstractC4308M17537).m16366().iterator();
            while (it.hasNext()) {
                if (!c63110.f19604.m36163((AbstractC4308) it.next())) {
                    C16719 c16719M16617 = c63110.f19601.m16617(C11886.m29013(abstractC4308M17537));
                    C6130 c6130 = new C6130();
                    c6130.f18768 = c16719M16617;
                    throw c6130;
                }
            }
        } else if (!c63110.f19604.m36163(abstractC4308M17537)) {
            C16719 c16719M16618 = c63110.f19601.m16617(C11886.m29013(abstractC4308M17537));
            C6130 c6131 = new C6130();
            c6131.f18768 = c16719M16618;
            throw c6131;
        }
        return c63110.m17543(this.f39421, abstractC4308M17537);
    }
}
