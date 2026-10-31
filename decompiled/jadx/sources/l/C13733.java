package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13733 extends AbstractC11618 {
    @Override // l.AbstractC11618
    /* JADX INFO: renamed from: ֫ */
    public final void mo28512(AbstractC0764 abstractC0764, C2609 c2609, boolean z, AbstractC4308 abstractC4308) {
        int i;
        C20661 c20661;
        C2609 c2609M28511 = AbstractC11618.m28511(c2609);
        Iterator it = c2609M28511.iterator();
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            c20661 = this.f5951;
            if (!zHasNext) {
                break;
            }
            C2609<AbstractC5144> c26010 = (C2609) it.next();
            C12171.m29641("Arguments list is empty", !c26010.isEmpty());
            C18837 c18837 = new C18837();
            for (AbstractC5144 abstractC5144 : c26010) {
                if (!"".equals(abstractC5144.f16086.mo12915())) {
                    AbstractC4308 abstractC4309 = abstractC5144.f16086;
                    AbstractC4308 abstractC43010 = c20661.f66522;
                    C6319 c6319 = this.f5955;
                    if (abstractC4309 == abstractC43010) {
                        abstractC4309 = c6319.m17496(c20661.f66501).f17560;
                    }
                    if (!z2 || z) {
                        this.f5949.m32350(abstractC5144.f16086, abstractC5144).mo5817();
                    }
                    if (!c6319.m17559(abstractC4309).mo12941() && abstractC4309.f13890 != c20661.f66533.f13890) {
                        this.f5949.m32361((AbstractC5144) abstractC0764, c20661.f66533, this.f5952.f18896, C2609.of((Object) c20661.f66526), true);
                        abstractC4309 = c20661.f66533;
                    }
                    c18837.m43511(abstractC4309);
                    z2 = false;
                }
            }
            m33035(abstractC4308, abstractC0764, c18837.m43517());
        }
        if (c2609M28511.m8245() > 1) {
            C18837 c18838 = new C18837();
            for (i = 0; i < c2609M28511.m8245(); i++) {
                c18838.m43511(c20661.f66533);
            }
            m33035(abstractC4308, abstractC0764, c18838.m43517());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33035(AbstractC4308 abstractC4308, AbstractC0764 abstractC0764, C2609 c2609) {
        C6136 c6136 = this.f5952;
        C13359 c13359 = this.f5949;
        C2609 c2609M8239 = C2609.m8239();
        C20661 c20661 = this.f5951;
        C10658 c10658 = new C10658(c2609, abstractC4308, c2609M8239, c20661.f66481);
        C17013 c17013 = this.f5950;
        int i = c17013.f52172;
        try {
            c17013.m39946((InterfaceC3109) abstractC0764);
            C9226 c9226 = new C9226(c6136.f18849, c20661.f66475, this.f5954.m50300(abstractC0764, c13359.m32368(), c20661.f66498, c6136.f18849, C2609.of((Object) c20661.f66478, (Object) c20661.f66533, (Object) c20661.f66455), (C2609) null).mo10967(), c10658, (InterfaceC8090[]) C2609.m8239().toArray(new InterfaceC8090[0]));
            C14439 c14439M32366 = c13359.m32366();
            c14439M32366.getClass();
            C6319 c6319 = c14439M32366.f44256;
            C1365.m4782(c9226.mo16091(c6319));
            C12171.m29642(c9226.f17559 == EnumC1296.f4571);
            C10658 c10659 = (C10658) c9226.mo16091(c6319);
            int iM4782 = C1365.m4782(c10659.f32060);
            c14439M32366.f44254.m4810(c9226, c10659);
            AbstractC7715 abstractC7715 = c14439M32366.f44255[iM4782];
        } finally {
            c17013.f52172 = i;
        }
    }
}
