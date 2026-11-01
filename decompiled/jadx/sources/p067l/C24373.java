package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes.dex */
public final class C24373 extends AbstractC7610 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12955 f77163;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24373(C12955 c12955) {
        super(c12955, EnumC13844.HIERARCHY_PHASE, new C23703(c12955));
        this.f77163 = c12955;
    }

    @Override // p067l.AbstractC15655
    /* JADX INFO: renamed from: ֫ */
    public final void mo8617(C4036 c4036) {
        C7650 c7650 = c4036.f8855;
        if (!c7650.f20027.f20408.isEmpty() || c7650.f20027.m18009()) {
            C12955 c12955 = this.f77163;
            Iterator it = c12955.f36442.m19505(c7650.f20027.f20406).iterator();
            while (it.hasNext()) {
                AbstractC21195 abstractC21195 = ((AbstractC6462) it.next()).f16705;
                if (abstractC21195.f20405 == EnumC3600.f7354) {
                    C15828 c15828 = (C15828) abstractC21195;
                    C4036 c4036M41755 = c12955.f36445.f44238.m41755(c15828);
                    if (c15828.m18019() && !c15828.f45852 && c4036M41755 != null && c4036M41755.f8851 == c4036.f8851) {
                        c15828.f45853 = c15828.f45853.m10286(c7650.f20027);
                    }
                }
            }
        }
    }
}
