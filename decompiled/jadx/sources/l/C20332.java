package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20332 extends AbstractC5515 implements InterfaceC6403 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f65643;

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20332(C11139 c11139) {
        super(c11139, EnumC12075.HIERARCHY_PHASE, new C23153(c11139));
        this.f65643 = c11139;
    }

    @Override // l.AbstractC13980
    /* JADX INFO: renamed from: ۧ */
    public final void mo4345(C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            ((C1755) it.next()).f6079.f17186.f17564 = this;
        }
        Iterator it2 = c2609.iterator();
        while (it2.hasNext()) {
            ((C1755) it2.next()).f6079.f17186.mo16101();
        }
    }

    @Override // l.AbstractC13980
    /* JADX INFO: renamed from: ֫ */
    public final void mo6476(C1755 c1755) {
        C5557 c5557 = c1755.f6079;
        C14163 c14163 = c5557.f17186;
        C19955 c19955 = (C19955) c14163.f17560;
        C1755 c1755M15646 = AbstractC5515.m15646(c1755, c5557);
        m15648(c1755, c1755M15646);
        AbstractC10370 abstractC10370 = c14163.f42767;
        C11139 c11139 = this.f65643;
        if (abstractC10370 == c11139.f33438.f18887) {
            if (c5557.f17184 != null) {
                C15240 c15240 = c11139.f33426;
                AbstractC12612 abstractC12612 = c5557.f17184;
                abstractC12612.getClass();
                c15240.m36186(abstractC12612, c19955.f64618);
                c19955.f64618 = AbstractC4308.f13885;
            } else if (c5557.f17183.m8249()) {
                C15240 c15241 = c11139.f33426;
                AbstractC12612 abstractC12613 = (AbstractC12612) c5557.f17183.f8240;
                abstractC12613.getClass();
                c15241.m36186(abstractC12613, (AbstractC4308) c19955.f64620.f8240);
                c19955.f64620 = C2609.m8239();
            }
        }
        c11139.m27652(c14163, c5557.f17181.f7168, c1755M15646);
        C15240 c15242 = c11139.f33426;
        c15242.getClass();
        C0424 c0424 = new C0424(c15242);
        c5557.mo988(c0424);
        if (c0424.f1887 || c0424.f1888) {
            return;
        }
        c5557.f17186.f17563 |= 1073741824;
    }

    @Override // l.AbstractC5515
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12612 mo15647(AbstractC12612 abstractC12612) {
        return C2693.f8433[abstractC12612.mo989().ordinal()] != 1 ? abstractC12612 : ((C16432) abstractC12612).f50542;
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        C11139 c11139 = this.f65643;
        C12171.m29642((c11139.f33437 instanceof C12570) || c11139.f33437 == this);
        if (c11139.f33437 != this) {
            abstractC5698.f17564 = this;
        } else {
            super.mo4345(C2609.of((Object) c11139.f33429.m39519((C14163) abstractC5698)));
        }
    }
}
