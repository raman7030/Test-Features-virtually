package p067l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes.dex */
public final class C23703 extends AbstractC7610 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12955 f75434;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23703(C12955 c12955) {
        super(c12955, EnumC13844.HEADER_PHASE, new C4237(c12955));
        this.f75434 = c12955;
    }

    @Override // p067l.AbstractC15655
    /* JADX INFO: renamed from: ֫ */
    public final void mo8617(C4036 c4036) {
        C7650 c7650 = c4036.f8855;
        C15828 c15828 = c7650.f20027;
        C4036 c4036M17561 = AbstractC7610.m17561(c4036, c7650);
        AbstractC14355 abstractC14355 = c7650.f20025;
        C12955 c12955 = this.f75434;
        if (abstractC14355 != null) {
            c12955.f36441.m34510(c7650.f20025, c4036M17561, c15828, c7650);
        }
        Iterator it = c7650.f20024.iterator();
        while (it.hasNext()) {
            c12955.f36441.m34510((AbstractC14355) it.next(), c4036M17561, c15828, c7650);
        }
        c12955.f36441.m34515();
        m17563(c4036, c4036M17561);
        HashSet hashSet = new HashSet();
        for (AbstractC14355 abstractC14356 : c7650.f20024) {
            AbstractC6462 abstractC6462 = abstractC14356.f18925;
            if (abstractC6462.m14777(EnumC11353.CLASS)) {
                c12955.f36426.m38315(abstractC14356, c12955.f36442.m19459(abstractC6462), hashSet);
            }
        }
        c12955.f36441.m34508(c7650.f20022.f9953, c4036M17561, c15828, c7650);
        c12955.f36427.m25952(c7650.f20026, c4036M17561, false);
        Iterator it2 = c7650.f20026.iterator();
        while (it2.hasNext()) {
            c12955.f36441.m34510((C15973) it2.next(), c4036M17561, c15828, c7650);
        }
        AbstractC7783 abstractC7783 = c15828.f20407;
        EnumC3600 enumC3600 = abstractC7783.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7351;
        if (enumC3600 == enumC3601 && abstractC7783 != c4036.f8851.f7510.f3694 && c12955.f36440.m49595(c4036.f8851.f7510, c15828.f45855)) {
            C23623 c23623 = c12955.f36430;
            int i = c7650.f18924;
            EnumC10306 enumC10306M51425 = C23047.m51425(c15828);
            C14040 c14040 = C8300.f21997;
            c23623.m9348(i, new C14040("compiler", "clash.with.pkg.of.same.name", enumC10306M51425, c15828));
        }
        if (c15828.f20407.f20405 == enumC3601 && (c15828.f20409 & 1) == 0 && !c4036.f8851.f7516.mo23288(c15828.f20408.toString(), EnumC18398.SOURCE)) {
            c15828.f20409 |= 17592186044416L;
        }
    }
}
