package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C10148 extends AbstractC2562 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f28097;

    /* JADX INFO: renamed from: ۧ */
    public C4036 f28098;

    /* JADX INFO: renamed from: ܽ */
    public boolean f28099;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16852 f28100;

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3792(AbstractC7257 abstractC7257) {
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3842(C25084 c25084) {
        m23657(c25084.f80025, this.f28097, this.f28099);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3824(C17985 c17985) {
        if (c17985.f18925.m14777(EnumC11353.CLASS)) {
            C4848 c4848 = c17985.f53721;
            C4848 c4848Mo14802 = c17985.f18925.f16705.f20406.mo14802();
            AbstractC6462 abstractC6462 = c17985.f18925;
            C16852 c16852 = this.f28100;
            AbstractC6462 abstractC6462M38257 = c16852.m38257(abstractC6462);
            if (abstractC6462M38257 != null) {
                for (AbstractC7257 abstractC7257 : c17985.f53721) {
                    if (abstractC7257.f18925 == abstractC6462M38257) {
                        C23623 c23623 = c16852.f49881;
                        AbstractC6462 abstractC6463 = (AbstractC6462) c4848Mo14802.f11034;
                        C14040 c14040 = C8300.f21997;
                        c23623.m9352(abstractC7257, new C14040("compiler", "not.within.bounds", abstractC6462M38257, abstractC6463));
                    }
                    c4848Mo14802 = c4848Mo14802.f11035;
                }
            }
            boolean z = c17985.f18925.f16705.mo18002() == c16852.f49901.f21717;
            for (C4848 c4848Mo14803 = c17985.f18925.f16705.f20406.mo14802(); c4848.m10293() && c4848Mo14803.m10293(); c4848Mo14803 = c4848Mo14803.f11035) {
                m23657((AbstractC7257) c4848.f11034, (this.f28099 && z) ? false : true, false);
                c4848 = c4848.f11035;
            }
            if (c17985.f18925.mo7201().mo14784()) {
                c16852.f49881.m9352(c17985, C8300.f22096);
            }
            if (c17985.f53722.m16617(EnumC19998.f60805)) {
                m23658((C8320) c17985.f53722);
            }
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        boolean z = this.f28099;
        for (C4848 c4848 = c15973.f46262; c4848.m10293(); c4848 = c4848.f11035) {
            m23657((AbstractC7257) c4848.f11034, true, z);
        }
        AbstractC6462 abstractC6462 = c15973.f18925;
        this.f28100.m38285(c15973, new HashMap(), abstractC6462);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3821(C17314 c17314) {
        AbstractC7257 abstractC7257 = c17314.f51641;
        if (abstractC7257 != null) {
            m23657(abstractC7257, true, this.f28099);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        if (c8320.f18925.m14777(EnumC11353.CLASS)) {
            m23658(c8320);
            if (c8320.f22261.f18925.mo14781() && c8320.f18925.f16705.f20406.mo14802().m10293()) {
                this.f28100.f49881.m9352(c8320, C8300.f22169);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23658(C8320 c8320) {
        if (c8320.f18925.f16705.mo17483() && c8320.f22261.f18925.mo14781()) {
            this.f28100.f49881.m9352(c8320, C8300.f22141);
        } else {
            c8320.f22261.mo3382(this);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        c19720.f59996.mo3382(this);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3786(C5107 c5107) {
        if (c5107.f18925.m14777(EnumC11353.VOID)) {
            this.f28100.f49881.m9352(c5107, C8300.f22018);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23657(AbstractC7257 abstractC7257, boolean z, boolean z2) {
        C16852 c16852 = this.f28100;
        if (abstractC7257 != null) {
            boolean z3 = this.f28097;
            this.f28097 = z;
            this.f28099 = z2;
            try {
                abstractC7257.mo3382(this);
                if (z) {
                    c16852.m38296(abstractC7257, this.f28098);
                }
            } catch (C21865 e) {
                c16852.m38271(abstractC7257, e);
            } finally {
                this.f28097 = z3;
            }
        }
    }

    public C10148(C16852 c16852, C4036 c4036) {
        this.f28100 = c16852;
        this.f28098 = c4036;
    }
}
