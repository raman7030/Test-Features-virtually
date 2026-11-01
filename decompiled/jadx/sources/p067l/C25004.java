package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C25004 extends AbstractC16800 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C8911 f79819;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC6462 f79820;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25004(C8911 c8911, C8788 c8788, C3686 c3686, AbstractC6462 abstractC6462) {
        super(c8911.f24150, true, c8788, c3686);
        this.f79819 = c8911;
        this.f79820 = abstractC6462;
    }

    @Override // p067l.AbstractC16800, p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6100(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        AbstractC6462 abstractC6464;
        AbstractC7257 abstractC7257Mo6081;
        C23663 c23663 = this.f79819.f24150;
        if (c23663.f75316 && m54917(abstractC6462, abstractC6463) && (abstractC6464 = this.f79820) != null && abstractC6464.mo5577() == EnumC11353.DEFERRED && (abstractC7257Mo6081 = ((C3423) abstractC6464).mo6081(this.f49524)) != c23663.f75332.f40369) {
            return m54914(abstractC6462, abstractC6463, abstractC7257Mo6081);
        }
        return m54913(abstractC6462, abstractC6463);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m54913(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C23663 c23663 = this.f79819.f24150;
        if (!this.f49526 && abstractC6462.mo14805() != abstractC6463.mo14805()) {
            abstractC6462 = abstractC6462.mo14805() ? c23663.f75323.m19436(abstractC6462).f20406 : c23663.f75323.m19503(abstractC6462);
        }
        return c23663.f75323.m19486(abstractC6462, this.f49524.f23843.m4259(abstractC6463), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public boolean m54917(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C23663 c23663 = this.f79819.f24150;
        C8374 c8374 = c23663.f75323;
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        c8374.getClass();
        try {
            c8374.m19433(abstractC21195);
            C8374 c8375 = c23663.f75323;
            AbstractC21195 abstractC21196 = abstractC6463.f16705;
            c8375.getClass();
            c8375.m19433(abstractC21196);
            return m54919(abstractC6462, abstractC6463);
        } catch (C8194 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m54919(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        boolean zMo7388 = abstractC6462.mo7388();
        C8911 c8911 = this.f79819;
        if (zMo7388) {
            Iterator it = c8911.f24150.f75323.m19450(abstractC6462).iterator();
            while (it.hasNext()) {
                if (!m54919((AbstractC6462) it.next(), abstractC6463)) {
                    return false;
                }
            }
            return true;
        }
        if (!abstractC6463.mo7388()) {
            return c8911.f24150.f75323.m19467(abstractC6463.f16705, abstractC6462) == null && c8911.f24150.f75323.m19467(abstractC6462.f16705, abstractC6463) == null;
        }
        Iterator it2 = c8911.f24150.f75323.m19450(abstractC6463).iterator();
        while (it2.hasNext()) {
            if (!m54919(abstractC6462, (AbstractC6462) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m54914(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, AbstractC7257 abstractC7257) {
        C2733 c2733 = this.f49524.f23843;
        C23663 c23663 = this.f79819.f24150;
        C8374 c8374 = c23663.f75323;
        AbstractC6462 abstractC6462M19478 = c8374.m19478(c8374.m19463(abstractC6462));
        AbstractC6462 abstractC6462M19479 = c23663.f75323.m19478(abstractC6462);
        AbstractC6462 abstractC6462M194710 = c23663.f75323.m19478(abstractC6463);
        C4848 c4848Mo14802 = abstractC6462M19478.mo14802();
        C4848 c4848Mo14803 = abstractC6462M19479.mo14802();
        C4848 c4848Mo14804 = abstractC6462M194710.mo14802();
        if (abstractC6462M19478.m14777(EnumC11353.FORALL) && !c23663.f75323.m19447((C11945) abstractC6462M19478, (C11945) abstractC6462M19479)) {
            return false;
        }
        C4848 c4848 = c4848Mo14802;
        C4848 c4849 = c4848Mo14804;
        while (c4848.m10293() && c4849.m10293()) {
            AbstractC6462 abstractC6462Mo14803 = ((AbstractC6462) c4848.f11034).mo14803();
            AbstractC6462 abstractC6462M19428 = c23663.f75323.m19428(((AbstractC6462) c4849.f11034).mo14803(), c4848Mo14804, c4848Mo14802);
            if ((abstractC6462Mo14803.m14792(c4848Mo14802) && abstractC6462M19428.m14792(c2733.f4594)) || !c23663.f75323.m19490(abstractC6462Mo14803, c2733.m4259(abstractC6462M19428))) {
                return false;
            }
            c4848 = c4848.f11035;
            c4849 = c4849.f11035;
        }
        if (!c4848.isEmpty() || !c4849.isEmpty()) {
            return false;
        }
        C4848 c4848Mo14797 = abstractC6462M19478.mo14797();
        C4848 c4848Mo14798 = abstractC6462M19479.mo14797();
        C4848 c4848Mo14799 = abstractC6462M194710.mo14797();
        while (c4848Mo14797.m10293() && c4848Mo14798.m10293() && c4848Mo14799.m10293()) {
            AbstractC6462 abstractC6464 = (AbstractC6462) c4848Mo14797.f11034;
            AbstractC6462 abstractC6462M19429 = c23663.f75323.m19428((AbstractC6462) c4848Mo14798.f11034, c4848Mo14803, c4848Mo14802);
            AbstractC6462 abstractC6462M194210 = c23663.f75323.m19428((AbstractC6462) c4848Mo14799.f11034, c4848Mo14804, c4848Mo14802);
            if (abstractC6464.m14792(c4848Mo14802) && abstractC6462M194210.m14792(c2733.f4594)) {
                return false;
            }
            C4848 c48410 = c4848Mo14803;
            if (!c23663.f75323.m19486(c2733.m4259(abstractC6462M194210), abstractC6464, true) || !c23663.f75323.m19490(abstractC6462M19429, c2733.m4259(abstractC6462M194210))) {
                return false;
            }
            c4848Mo14797 = c4848Mo14797.f11035;
            c4848Mo14798 = c4848Mo14798.f11035;
            c4848Mo14799 = c4848Mo14799.f11035;
            c4848Mo14803 = c48410;
        }
        if (!c4848Mo14797.isEmpty() || !c4848Mo14798.isEmpty() || !c4848Mo14799.isEmpty()) {
            return false;
        }
        AbstractC6462 abstractC6462Mo14787 = abstractC6462M19478.mo14787();
        AbstractC6462 abstractC6462M194211 = c23663.f75323.m19428(abstractC6462M194710.mo14787(), c4848Mo14804, c4848Mo14802);
        if (abstractC6462Mo14787.m14792(c4848Mo14802) && abstractC6462M194211.m14792(c2733.f4594)) {
            return false;
        }
        C16286 c16286 = new C16286(this, abstractC6462Mo14787, abstractC6462M194211);
        c16286.mo12739(abstractC7257);
        return c16286.f47868;
    }
}
