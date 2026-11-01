package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21692 extends AbstractC7610 implements InterfaceC8453 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12955 f68317;

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo9173() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21692(C12955 c12955) {
        super(c12955, EnumC13844.HIERARCHY_PHASE, new C24373(c12955));
        this.f68317 = c12955;
    }

    @Override // p067l.AbstractC15655
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591(C4848 c4848) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            ((C4036) it.next()).f8855.f20027.f20410 = this;
        }
        Iterator it2 = c4848.iterator();
        while (it2.hasNext()) {
            ((C4036) it2.next()).f8855.f20027.mo18020();
        }
    }

    @Override // p067l.AbstractC15655
    /* JADX INFO: renamed from: ֫ */
    public final void mo8617(C4036 c4036) {
        C7650 c7650 = c4036.f8855;
        C15828 c15828 = c7650.f20027;
        C21333 c21333 = (C21333) c15828.f20406;
        C4036 c4036M17561 = AbstractC7610.m17561(c4036, c7650);
        m17563(c4036, c4036M17561);
        AbstractC12224 abstractC12224 = c15828.f45855;
        C12955 c12955 = this.f68317;
        if (abstractC12224 == c12955.f36438.f21745) {
            if (c7650.f20025 != null) {
                C16852 c16852 = c12955.f36426;
                AbstractC14355 abstractC14355 = c7650.f20025;
                abstractC14355.getClass();
                c16852.m38347(abstractC14355, c21333.f67259);
                c21333.f67259 = AbstractC6462.f16700;
            } else if (c7650.f20024.m10293()) {
                C16852 c16853 = c12955.f36426;
                AbstractC14355 abstractC14356 = (AbstractC14355) c7650.f20024.f11034;
                abstractC14356.getClass();
                c16853.m38347(abstractC14356, (AbstractC6462) c21333.f67261.f11034);
                c21333.f67261 = C4848.m10283();
            }
        }
        c12955.m29714(c15828, c7650.f20022.f9953, c4036M17561);
        C16852 c16854 = c12955.f36426;
        c16854.getClass();
        C2771 c2771 = new C2771(c16854);
        c7650.mo3382(c2771);
        if (c2771.f4663 || c2771.f4664) {
            return;
        }
        c7650.f20027.f20409 |= 1073741824;
    }

    @Override // p067l.AbstractC7610
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 mo17562(AbstractC14355 abstractC14355) {
        return C4928.f11227[abstractC14355.mo3383().ordinal()] != 1 ? abstractC14355 : ((C17985) abstractC14355).f53722;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        C12955 c12955 = this.f68317;
        C1446.m31704((c12955.f36437 instanceof C14315) || c12955.f36437 == this);
        if (c12955.f36437 != this) {
            abstractC7783.f20410 = this;
        } else {
            super.mo6591(C4848.m10276of((Object) c12955.f36429.m41755((C15828) abstractC7783)));
        }
    }
}
