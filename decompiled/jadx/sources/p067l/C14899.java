package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public class C14899 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 f42485;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14229 f42486;

    public C14899(C14229 c14229, AbstractC7783 abstractC7783) {
        this.f42486 = c14229;
        this.f42485 = abstractC7783;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo15694(AbstractC6462 abstractC6462) {
        C14229 c14229 = this.f42486;
        C8374 c8374 = c14229.f40530;
        C8374 c8375 = c14229.f40530;
        AbstractC6462 abstractC6462M19477 = c8374.m19477(abstractC6462);
        abstractC6462M19477.getClass();
        if (abstractC6462M19477 instanceof C7921) {
            Iterator it = ((C7921) abstractC6462M19477).m18291().iterator();
            while (it.hasNext()) {
                if (!c8375.f22475.m38324((AbstractC6462) it.next())) {
                    C18258 c18258M18543 = c8375.f22472.m18543(C13665.m31065(abstractC6462M19477));
                    C8194 c8194 = new C8194();
                    c8194.f21626 = c18258M18543;
                    throw c8194;
                }
            }
        } else if (!c8375.f22475.m38324(abstractC6462M19477)) {
            C18258 c18258M18544 = c8375.f22472.m18543(C13665.m31065(abstractC6462M19477));
            C8194 c8195 = new C8194();
            c8195.f21626 = c18258M18544;
            throw c8195;
        }
        return c8375.m19483(this.f42485, abstractC6462M19477);
    }
}
