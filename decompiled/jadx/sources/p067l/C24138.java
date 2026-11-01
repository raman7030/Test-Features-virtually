package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes.dex */
public final class C24138 extends AbstractC13410 {
    @Override // p067l.AbstractC13410
    /* JADX INFO: renamed from: ֫ */
    public final void mo30558(AbstractC3094 abstractC3094, C4848 c4848, boolean z, AbstractC6462 abstractC6462) {
        int i;
        C22004 c22004;
        C4848 c4848M30557 = AbstractC13410.m30557(c4848);
        Iterator it = c4848M30557.iterator();
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            c22004 = this.f8729;
            if (!zHasNext) {
                break;
            }
            C4848<AbstractC7257> c4849 = (C4848) it.next();
            C1446.m31703("Arguments list is empty", !c4849.isEmpty());
            StringBuilder sb = new StringBuilder(c4849.m10289());
            C20271 c20271 = new C20271();
            C20271 c20272 = new C20271();
            boolean z3 = z2;
            for (AbstractC7257 abstractC7257 : c4849) {
                Object objMo14779 = abstractC7257.f18925.mo14779();
                if (!"".equals(objMo14779)) {
                    AbstractC6462 abstractC6463 = abstractC7257.f18925;
                    if (abstractC6463 == c22004.f69204) {
                        sb.append((String) null);
                    } else if (objMo14779 != null) {
                        String strMo5578 = abstractC6463.mo5578();
                        if (strMo5578.indexOf(2) != -1 || strMo5578.indexOf(1) != -1) {
                            sb.append((char) 2);
                            c20272.m45777(C7375.m17097(strMo5578));
                        } else {
                            sb.append(strMo5578);
                        }
                    } else {
                        sb.append((char) 1);
                        AbstractC6462 abstractC6464 = abstractC7257.f18925;
                        if (!z3 || z) {
                            this.f8727.m34451(abstractC6464, abstractC7257).mo8027();
                        }
                        if (!this.f8733.m19499(abstractC6464).mo14805() && abstractC6464.f16705 != c22004.f69215.f16705) {
                            this.f8727.m34462((AbstractC7257) abstractC3094, c22004.f69215, this.f8730.f21754, C4848.m10276of((Object) c22004.f69208), true);
                            abstractC6464 = c22004.f69215;
                        }
                        c20271.m45777(abstractC6464);
                        z3 = false;
                    }
                }
            }
            m53384(abstractC6462, abstractC3094, sb.toString(), c20272.m45783(), c20271.m45783());
            z2 = z3;
        }
        if (c4848M30557.m10289() > 1) {
            C20271 c20273 = new C20271();
            StringBuilder sb2 = new StringBuilder();
            for (i = 0; i < c4848M30557.m10289(); i++) {
                c20273.m45777(c22004.f69215);
                sb2.append((char) 1);
            }
            m53384(abstractC6462, abstractC3094, sb2.toString(), C4848.m10283(), c20273.m45783());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53384(AbstractC6462 abstractC6462, AbstractC3094 abstractC3094, String str, C4848 c4848, C4848 c4849) {
        C8200 c8200 = this.f8730;
        C15065 c15065 = this.f8727;
        C4848 c4848M10283 = C4848.m10283();
        C22004 c22004 = this.f8729;
        C15828 c15828 = c22004.f69163;
        AbstractC6462 abstractC6463 = c22004.f69215;
        C12497 c12497 = new C12497(c4849, abstractC6462, c4848M10283, c15828);
        C18537 c18537 = this.f8728;
        int i = c18537.f55352;
        try {
            c18537.m42189((InterfaceC5323) abstractC3094);
            C20271 c20271 = new C20271();
            C20271 c20272 = new C20271();
            Iterator it = c4848.iterator();
            while (it.hasNext()) {
                c20272.m45777((InterfaceC10057) it.next());
                c20271.m45777(abstractC6463);
            }
            C4848 c4848M10286 = C4848.m10278of((Object) c22004.f69160, (Object) abstractC6463, (Object) c22004.f69137).m10286(abstractC6463);
            c4848M10286.getClass();
            C11136 c11136 = new C11136(c8200.f21704, c22004.f69157, this.f8732.m52640(abstractC3094, c15065.m34469(), c22004.f69180, c8200.f21704, c20271.m45783().m10292(c4848M10286), (C4848) null).mo12943(), c12497, (InterfaceC10057[]) c20272.m45783().m10292(C4848.m10276of((Object) C7375.m17097(str))).toArray(new InterfaceC10057[c20272.size()]));
            C16091 c16091M34467 = c15065.m34467();
            c16091M34467.getClass();
            C8374 c8374 = c16091M34467.f47350;
            C3666.m7020(c11136.mo18010(c8374));
            C1446.m31704(c11136.f20405 == EnumC3600.f7343);
            C12497 c12498 = (C12497) c11136.mo18010(c8374);
            int iM7020 = C3666.m7020(c12498.f35031);
            c16091M34467.f47348.m7048(c11136, c12498);
            AbstractC9701 abstractC9701 = c16091M34467.f47349[iM7020];
        } finally {
            c18537.f55352 = i;
        }
    }
}
