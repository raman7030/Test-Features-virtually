package p067l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9085 extends C24572 {

    /* JADX INFO: renamed from: ۜ */
    public C4848 f24622;

    /* JADX INFO: renamed from: ܽ */
    public C4848 f24625;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f24626;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C11097 f24628;

    /* JADX INFO: renamed from: ᩳ */
    public int f24627 = 0;

    /* JADX INFO: renamed from: ܳ */
    public C16460 f24624 = new C16460();

    /* JADX INFO: renamed from: ۧ */
    public Map f24623 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static C7650 m21008(C9085 c9085, C7650 c7650) {
        c9085.getClass();
        c9085.f24625 = C4848.m10283();
        c9085.f24622 = C4848.m10283();
        c9085.f24626 = new HashMap();
        return (C7650) c9085.mo25569(c7650);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        C11097 c11097 = this.f24628;
        C4848 c4848 = this.f24622;
        try {
            AbstractC12224 abstractC12224M21428 = C9268.m21428(c17175.f51143);
            if (abstractC12224M21428 == c11097.f30758.f21744 || abstractC12224M21428 == c11097.f30758.f21756) {
                this.f24622 = this.f24622.m10290(m21022());
            }
            super.mo3820(c17175);
        } finally {
            this.f24622 = c4848;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public C15828 m21022() {
        for (C13463 c13463 : this.f24625) {
            if (c13463.f37783.m16617(EnumC19998.f60806)) {
                return ((C7650) c13463.f37783).f20027;
            }
        }
        return null;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        C4848 c4848 = this.f24625;
        try {
            if (c4848.m10293() && ((C13463) this.f24625.f11034).f37783.m16617(EnumC19998.f60806)) {
                this.f24625 = this.f24625.m10290(new C13463(c4968));
            }
            super.mo3785(c4968);
        } finally {
            this.f24625 = c4848;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) throws Throwable {
        C4848 c4848 = this.f24625;
        int i = this.f24627;
        C16460 c16460 = this.f24624;
        Map map = this.f24623;
        C11097 c11097 = this.f24628;
        C16051 c16051M9345 = c11097.f30743.m9345();
        try {
            c11097.f30743.m9363(c7650.f20027.f45858);
            this.f24627 = 0;
            this.f24624 = new C16460();
            HashMap map2 = new HashMap();
            try {
                C15828 c15828 = c7650.f20027;
                if (c15828.f20407.f20405 == EnumC3600.f7343) {
                    this.f24626.put(c15828, c7650);
                }
                if (m21019() != null) {
                    c7650.f20027.f20407 = m21010(false);
                    if (c7650.f20027.m18006()) {
                        AbstractC21195 abstractC21195 = c7650.f20027.f20406.mo7201().f16705;
                        for (AbstractC25178 abstractC25178M21025 = m21025(); abstractC25178M21025 != null && !abstractC25178M21025.f80539.mo17483(); abstractC25178M21025 = abstractC25178M21025.f80541) {
                            if (abstractC25178M21025.f80538.m16617(EnumC19998.f60747)) {
                                if (m21006(abstractC25178M21025.f80537, abstractC21195) == null) {
                                    break;
                                } else {
                                    ((C19814) abstractC25178M21025).m45053(abstractC21195, EnumC22497.CAPTURED_THIS);
                                }
                            }
                        }
                    }
                }
                this.f24625 = this.f24625.m10290(new C13463(c7650));
                super.mo3617(c7650);
                c11097.f30743.m9363(c16051M9345.m36524());
                this.f24625 = c4848;
                this.f24627 = i;
                this.f24624 = c16460;
                this.f24623 = map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                c11097.f30743.m9363(c16051M9345.m36524());
                this.f24625 = c4848;
                this.f24627 = i;
                this.f24624 = c16460;
                this.f24623 = map;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        if (m21025() != null && m21013(c9661.f26611)) {
            AbstractC7783 abstractC7783 = c9661.f26611;
            if (abstractC7783.f20405 == EnumC3600.f7339 && abstractC7783.f20407.f20405 == EnumC3600.f7343 && c9661.f18925.mo14779() == null) {
                for (AbstractC25178 abstractC25178M21025 = m21025(); abstractC25178M21025 != null; abstractC25178M21025 = abstractC25178M21025.f80541) {
                    if (abstractC25178M21025.f80538.mo3383() == EnumC19998.f60747) {
                        if (m21006(abstractC25178M21025.f80537, c9661.f26611) == null) {
                            break;
                        } else {
                            ((C19814) abstractC25178M21025).m45053(c9661.f26611, EnumC22497.CAPTURED_VAR);
                        }
                    }
                }
            } else if (c9661.f26611.f20407.f20405 == EnumC3600.f7354) {
                for (AbstractC25178 abstractC25178M21026 = m21025(); abstractC25178M21026 != null && !abstractC25178M21026.f80539.mo17483(); abstractC25178M21026 = abstractC25178M21026.f80541) {
                    if (abstractC25178M21026.f80538.m16617(EnumC19998.f60747)) {
                        AbstractC7257 abstractC7257M21006 = m21006(abstractC25178M21026.f80537, c9661.f26611);
                        if (abstractC7257M21006 == null) {
                            break;
                        }
                        if (C6757.f17521[abstractC7257M21006.mo3383().ordinal()] == 4) {
                            ((C19814) abstractC25178M21026).m45053(((C7650) abstractC7257M21006).f20027, EnumC22497.CAPTURED_THIS);
                        } else {
                            C1446.m31702("bad block kind");
                            throw null;
                        }
                    }
                }
            }
        }
        super.mo3798(c9661);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        m21011(c15834, "lambda.stat");
    }

    /* JADX INFO: renamed from: ֫ */
    private C19814 m21011(C15834 c15834, String str) {
        C11097 c11097 = this.f24628;
        C4848 c4848 = this.f24625;
        try {
            C19814 c19814 = new C19814(this, c15834);
            this.f24625 = this.f24625.m10290(new C13463(c15834));
            for (C11281 c11281 : c15834.f45863) {
                c19814.m45053(c11281.f31438, EnumC22497.PARAM);
                C13463 c13463 = (C13463) this.f24625.f11034;
                C13818 c13818 = c11281.f31438;
                if (c13463.f37782 == null) {
                    c13463.f37782 = C4848.m10283();
                }
                c13463.f37782 = c13463.f37782.m10290(c13818);
            }
            c11097.f30751.put(c15834, c19814);
            super.mo3619(c15834);
            c19814.m45055();
            if (c11097.f30749) {
                c11097.f30743.m9353(c15834, c11097.f30759.m18549(str, Boolean.valueOf(c19814.m55243()), c19814.f60258));
            }
            return c19814;
        } finally {
            this.f24625 = c4848;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        C4848 c4848 = this.f24625;
        try {
            this.f24625 = c4848.m10290(new C13463(c10471));
            super.mo3801(c10471);
        } finally {
            this.f24625 = c4848;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        boolean z;
        AbstractC21195 abstractC21195 = c20530.f18925.f16705;
        Iterator it = this.f24625.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C13463 c13463 = (C13463) it.next();
            if (c13463.f37783.m16617(EnumC19998.f60806) && ((C7650) c13463.f37783).f20027 == abstractC21195) {
                z = true;
                break;
            }
        }
        boolean zM17996 = abstractC21195.m17996();
        if ((z && zM17996) || m21016(m21025(), c20530)) {
            AbstractC21195 abstractC21196 = c20530.f18925.mo7201().f16705;
            for (AbstractC25178 abstractC25178M21025 = m21025(); abstractC25178M21025 != null && !abstractC25178M21025.f80539.mo17483(); abstractC25178M21025 = abstractC25178M21025.f80541) {
                if (abstractC25178M21025.f80538.m16617(EnumC19998.f60747)) {
                    if (abstractC21196 != null && m21006(abstractC25178M21025.f80537, abstractC21196) == null) {
                        break;
                    } else {
                        ((C19814) abstractC25178M21025).m45053(abstractC21196, EnumC22497.CAPTURED_THIS);
                    }
                }
            }
        }
        super.mo3832(c20530);
        if (m21025() == null || z || !zM17996) {
            return;
        }
        m21027(abstractC21195, (C19814) m21025());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21027(AbstractC7783 abstractC7783, C19814 c19814) {
        C7650 c7650 = (C7650) this.f24626.get(abstractC7783);
        if (c7650 == null || !c19814.f60260.add(abstractC7783)) {
            return;
        }
        C24507 c24507 = this.f24628.f30744;
        C12826.requireNonNull(c24507);
        new C8098(this, c24507, c19814).mo3617(c7650);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        boolean z;
        C19143 c19143 = new C19143(this, c11142);
        C11097 c11097 = this.f24628;
        c11097.f30751.put(c11142, c19143);
        C4848 c4848Mo14797 = c11142.m53845(c11097.f30760).mo14797();
        if ((c4848Mo14797.m10293() ? C19143.m43588((AbstractC6462) c4848Mo14797.f11034) : false) || c19143.f57157) {
            z = true;
        } else {
            if (c11142.f30894 != null) {
                z = true;
            } else {
                if (c11142.f30889.f20407 == c11097.f30747.f69187) {
                    z = true;
                } else {
                    boolean z2 = c11097.f30741;
                    AbstractC7783 abstractC7783 = c19143.f80539;
                    if (!z2) {
                        if (((c11142.f30889.mo18003() & 2) == 0 || c11097.f30760.m19490(c11097.f30760.m19459(c11142.f30889.m17990().f20406), c11097.f30760.m19459(abstractC7783.m17990().f20406))) ? false : true) {
                            z = true;
                        } else if (C11097.m25551(c11097, c11142.f30889, abstractC7783)) {
                            z = true;
                        } else {
                            z = true;
                        }
                    } else if (C11097.m25551(c11097, c11142.f30889, abstractC7783) || !c11142.f30892 || (c11142.f30886 == EnumC12909.NEW && c11142.f30888 != EnumC21871.f68796 && (c11142.f30889.f20407.m17996() || c11142.f30889.f20407.m17988()))) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (z) {
            C11768 c11768 = new C11768(c11097, c11142, c19143, m21010(false));
            C15834 c15834M27002 = c11768.m27002();
            AbstractC14355 abstractC14355 = (AbstractC14355) mo25569(c11768.m27001());
            C19814 c19814M21011 = m21011(c15834M27002, "mref.stat.1");
            if (abstractC14355 != null) {
                c19814M21011.f60264 = abstractC14355;
                return;
            }
            return;
        }
        super.mo3804(c11142);
        if (c11097.f30749) {
            C23623 c23623 = c11097.f30743;
            boolean zM55243 = c19143.m55243();
            C15380 c15380 = C24393.f77212;
            c23623.m9353(c11142, new C15380("compiler", "mref.stat", Boolean.valueOf(zM55243), null));
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        if (m21025() != null) {
            AbstractC7783 abstractC7783 = c8320.f22260;
            if (abstractC7783.f20405 == EnumC3600.f7339) {
                AbstractC12224 abstractC12224 = abstractC7783.f20408;
                C11097 c11097 = this.f24628;
                if (abstractC12224 == c11097.f30758.f21744 || c8320.f22260.f20408 == c11097.f30758.f21756) {
                    for (AbstractC25178 abstractC25178M21025 = m21025(); abstractC25178M21025 != null && !abstractC25178M21025.f80539.mo17483(); abstractC25178M21025 = abstractC25178M21025.f80541) {
                        if (abstractC25178M21025.f80538.m16617(EnumC19998.f60747)) {
                            C7650 c7650 = (C7650) m21006(abstractC25178M21025.f80537, c8320.f22260);
                            if (c7650 == null) {
                                break;
                            } else {
                                ((C19814) abstractC25178M21025).m45053(c7650.f20027, EnumC22497.CAPTURED_THIS);
                            }
                        }
                    }
                }
            }
        }
        super.mo3794(c8320);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        AbstractC25178 abstractC25178M21025 = m21025();
        if (abstractC25178M21025 != null && (abstractC25178M21025 instanceof C19814)) {
            C19814 c19814 = (C19814) abstractC25178M21025;
            for (C13463 c13463 : this.f24625) {
                if (!c13463.f37783.m16617(EnumC19998.f60802)) {
                    if (!c13463.f37783.m16617(EnumC19998.f60747)) {
                        break;
                    } else {
                        c19814.m45053(c11281.f31438, EnumC22497.LOCAL_VAR);
                    }
                }
            }
            c11281.f31438.getClass();
        }
        C4848 c4848 = this.f24625;
        try {
            C13818 c13818 = c11281.f31438;
            if (c13818.f20407.f20405 == EnumC3600.f7343) {
                C13463 c13464 = (C13463) c4848.f11034;
                if (c13464.f37782 == null) {
                    c13464.f37782 = C4848.m10283();
                }
                c13464.f37782 = c13464.f37782.m10290(c13818);
            }
            this.f24625 = this.f24625.m10290(new C13463(c11281));
            super.mo3805(c11281);
        } finally {
            this.f24625 = c4848;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 m21010(boolean z) {
        C4848 c4848 = this.f24625;
        while (c4848.m10293()) {
            switch (C6757.f17521[((C13463) c4848.f11034).f37783.mo3383().ordinal()]) {
                case 4:
                    return ((C7650) ((C13463) c4848.f11034).f37783).f20027;
                case 5:
                    if (((C11281) ((C13463) c4848.f11034).f37783).f31438.m17996()) {
                        c4848 = c4848.f11035;
                        continue;
                    } else {
                        return m21009(((C7650) ((C13463) c4848.f11035.f11034).f37783).f20027, ((C11281) ((C13463) c4848.f11034).f37783).f31438.f20409 & 8);
                    }
                    break;
                case 6:
                    return m21009(((C7650) ((C13463) c4848.f11035.f11034).f37783).f20027, ((C4968) ((C13463) c4848.f11034).f37783).f11317 & 8);
                case 7:
                    return ((C10471) ((C13463) c4848.f11034).f37783).f28960;
                case 8:
                    if (!z) {
                        return ((C19814) this.f24628.f30751.get(((C13463) c4848.f11034).f37783)).f60258;
                    }
                    break;
            }
            c4848 = c4848.f11035;
        }
        C1446.m31698();
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC7783 m21009(C15828 c15828, long j) {
        long j2 = j & 8;
        C11097 c11097 = this.f24628;
        if (j2 != 0) {
            C5771 c5771M25962 = c11097.f30754.m25962(c15828);
            if (c5771M25962 != null) {
                this.f24623.put(c15828, c5771M25962);
                return c5771M25962;
            }
            C5771 c5771 = (C5771) this.f24623.get(c15828);
            if (c5771 != null) {
                return c5771;
            }
            C5771 c5772 = new C5771(4106L, c11097.f30758.f21700, new C12497(C4848.m10283(), c11097.f30747.f69183, C4848.m10283(), c11097.f30747.f69163), c15828);
            this.f24623.put(c15828, c5772);
            return c5772;
        }
        Iterator it = c15828.f45850.m22456(c11097.f30758.f21737).iterator();
        if (it.hasNext()) {
            return (AbstractC7783) it.next();
        }
        C1446.m31702("init not found");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public AbstractC7257 m21019() {
        if (!this.f24625.isEmpty()) {
            for (C4848 c4848 = this.f24625; c4848.m10293(); c4848 = c4848.f11035) {
                int i = C6757.f17521[((C13463) c4848.f11034).f37783.mo3383().ordinal()];
                if (i != 4 && i != 7) {
                    if (i == 8) {
                        return ((C13463) c4848.f11034).f37783;
                    }
                }
            }
            C1446.m31698();
            throw null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7257 m21006(int i, AbstractC7783 abstractC7783) {
        C4848 c4848;
        int iM10289 = this.f24625.m10289() - 1;
        for (C13463 c13463 : this.f24625) {
            int[] iArr = C6757.f17521;
            AbstractC7257 abstractC7257 = c13463.f37783;
            AbstractC7257 abstractC7258 = c13463.f37783;
            switch (iArr[abstractC7257.mo3383().ordinal()]) {
                case 4:
                    C15828 c15828 = ((C7650) abstractC7258).f20027;
                    C11097 c11097 = this.f24628;
                    if (c15828.mo17999(abstractC7783, c11097.f30760) || abstractC7783.m17986((AbstractC21195) c15828, c11097.f30760)) {
                        if (iM10289 > i) {
                            return null;
                        }
                        return abstractC7258;
                    }
                    break;
                case 5:
                    if ((((C11281) abstractC7258).f31438 == abstractC7783 && abstractC7783.f20407.f20405 == EnumC3600.f7343) || ((c4848 = c13463.f37782) != null && c4848.contains(abstractC7783))) {
                        if (iM10289 > i) {
                            return null;
                        }
                        return abstractC7258;
                    }
                    break;
                    break;
                case 6:
                case 7:
                case 8:
                    C4848 c4849 = c13463.f37782;
                    if (c4849 != null && c4849.contains(abstractC7783)) {
                        if (iM10289 > i) {
                            return null;
                        }
                        return abstractC7258;
                    }
                    break;
                    break;
                default:
                    C1446.m31702("bad decl kind " + abstractC7258.mo3383());
                    throw null;
            }
            iM10289--;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public AbstractC25178 m21025() {
        Iterator it = this.f24625.iterator();
        while (it.hasNext()) {
            AbstractC25178 abstractC25178 = (AbstractC25178) this.f24628.f30751.get(((C13463) it.next()).f37783);
            if (abstractC25178 != null) {
                return abstractC25178;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m21013(AbstractC7783 abstractC7783) {
        EnumC3600 enumC3600 = abstractC7783.f20405;
        return ((enumC3600 != EnumC3600.f7339 && enumC3600 != EnumC3600.f7343) || abstractC7783.mo17483() || abstractC7783.f20408 == this.f24628.f30758.f21737) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m21016(AbstractC25178 abstractC25178, C20530 c20530) {
        if (abstractC25178 == null || c20530.f63432 != null || c20530.f63428 != null || c20530.f18925.mo7201().m14777(EnumC11353.NONE)) {
            return false;
        }
        AbstractC6462 abstractC6462Mo7201 = c20530.f18925.mo7201();
        for (AbstractC6462 abstractC6462Mo7202 = abstractC25178.f80539.m17990().f20406; !abstractC6462Mo7202.m14777(EnumC11353.NONE); abstractC6462Mo7202 = abstractC6462Mo7202.mo7201()) {
            if (abstractC6462Mo7202.f16705.mo17999((AbstractC7783) abstractC6462Mo7201.f16705, this.f24628.f30760)) {
                return true;
            }
        }
        return false;
    }

    public C9085(C11097 c11097) {
        this.f24628 = c11097;
    }
}
