package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public class C14356 implements InterfaceC0951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f43287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f43288;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14163 f43289;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC8624 f43290;

    public C14356(C20002 c20002, C14163 c14163) {
        this.f43288 = c20002;
        this.f43289 = c14163;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[Catch: all -> 0x00cf, TRY_ENTER, TryCatch #1 {all -> 0x00cf, blocks: (B:18:0x005c, B:22:0x0067, B:23:0x007a), top: B:33:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #1 {all -> 0x00cf, blocks: (B:18:0x005c, B:22:0x0067, B:23:0x007a), top: B:33:0x005c }] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16384 m34258(C2363 c2363) {
        C20002 c20002;
        C22364 c22364;
        InterfaceC18278 interfaceC18278M7284;
        C3581 c3581;
        AbstractC4308 abstractC4308M34256 = m34256(c2363.f26338);
        C18837 c18837 = new C18837();
        C2609 c2609 = c2363.f7553;
        while (true) {
            C20515 c20515 = null;
            if (!c2609.m8249()) {
                return new C16384(abstractC4308M34256, c18837.m43517(), null);
            }
            AbstractC10370 abstractC10370 = (AbstractC10370) ((C23069) c2609.f8240).f74207;
            try {
                Iterator it = abstractC4308M34256.f13890.mo16064().m20476(abstractC10370).iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
                        if (abstractC5698.f17559 == EnumC1296.f4571 && abstractC5698.f17560.mo12933().m8245() == 0) {
                            c3581 = (C3581) abstractC5698;
                        }
                        c20002 = this.f43288;
                        c22364 = c20002.f64746;
                        C20661 c20661 = c20002.f64770;
                        interfaceC18278M7284 = c22364.m7284(this.f43289.f42766);
                        try {
                            if (c20002.f64753) {
                                if (c20515 == null) {
                                    C11076 c11076 = C14001.f42334;
                                    c22364.m7275(new C11076("compiler", "annotation.method.not.found", abstractC4308M34256, abstractC10370));
                                } else {
                                    C16719 c16719M46989 = c20515.m46989();
                                    C11076 c11077 = C14001.f42334;
                                    c22364.m7275(new C11076("compiler", "annotation.method.not.found.reason", abstractC4308M34256, abstractC10370, c16719M46989));
                                }
                            }
                            c22364.m7284(interfaceC18278M7284);
                            c3581 = new C3581(1025L, abstractC10370, new C10658(C2609.m8239(), c20661.f66522, C2609.m8239(), c20661.f66481), abstractC4308M34256.f13890);
                        } catch (Throwable th) {
                            c22364.m7284(interfaceC18278M7284);
                            throw th;
                        }
                    } else {
                        c20002 = this.f43288;
                        c22364 = c20002.f64746;
                        C20661 c20662 = c20002.f64770;
                        interfaceC18278M7284 = c22364.m7284(this.f43289.f42766);
                        if (c20002.f64753) {
                            if (c20515 == null) {
                                C11076 c11078 = C14001.f42334;
                                c22364.m7275(new C11076("compiler", "annotation.method.not.found", abstractC4308M34256, abstractC10370));
                            } else {
                                C16719 c16719M469810 = c20515.m46989();
                                C11076 c11079 = C14001.f42334;
                                c22364.m7275(new C11076("compiler", "annotation.method.not.found.reason", abstractC4308M34256, abstractC10370, c16719M469810));
                            }
                        }
                        c22364.m7284(interfaceC18278M7284);
                        c3581 = new C3581(1025L, abstractC10370, new C10658(C2609.m8239(), c20662.f66522, C2609.m8239(), c20662.f66481), abstractC4308M34256.f13890);
                    }
                    c18837.m43511(new C23069(c3581, m34257(c3581.f17560.mo12923(), (AbstractC8624) ((C23069) c2609.f8240).f74208)));
                    c2609 = c2609.f8241;
                }
            } catch (C20515 e) {
                c20515 = e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8624 m34257(AbstractC4308 abstractC4308, AbstractC8624 abstractC8624) {
        AbstractC4308 abstractC4309 = this.f43287;
        try {
            this.f43287 = abstractC4308;
            abstractC8624.mo5382(this);
            return this.f43290;
        } finally {
            this.f43287 = abstractC4309;
        }
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24020(C17796 c17796) {
        this.f43290 = c17796;
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24016(C10741 c10741) {
        this.f43290 = c10741;
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24019(C17090 c17090) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24018(C16384 c16384) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24015(C1568 c1568) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24017(C14267 c14267) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC0951
    /* JADX INFO: renamed from: ֫ */
    public final void mo3368(C3774 c3774) {
        C12048 c12048;
        AbstractC4308 abstractC4308 = c3774.f11907;
        AbstractC10370 abstractC10370 = c3774.f11908;
        AbstractC19810 abstractC19810 = m34256(abstractC4308).f13890;
        C12048 c12049 = null;
        try {
            Iterator it = abstractC19810.mo16064().m20476(abstractC10370).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c12048 = null;
                    break;
                }
                AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
                if (abstractC5698.f17559 == EnumC1296.f4567) {
                    c12048 = (C12048) abstractC5698;
                    break;
                }
            }
            e = null;
            c12049 = c12048;
        } catch (C20515 e) {
            e = e;
        }
        if (c12049 == null) {
            C20002 c20002 = this.f43288;
            if (e != null) {
                C22364 c22364 = c20002.f64746;
                InterfaceC18278 interfaceC18278 = c20002.f64755;
                C16719 c16719M46989 = e.m46989();
                C11076 c11076 = C14001.f42334;
                c22364.m7275(new C11076("compiler", "unknown.enum.constant.reason", interfaceC18278, abstractC19810, abstractC10370, c16719M46989));
            } else {
                C22364 c22365 = c20002.f64746;
                InterfaceC18278 interfaceC18279 = c20002.f64755;
                C11076 c11077 = C14001.f42334;
                c22365.m7275(new C11076("compiler", "unknown.enum.constant", interfaceC18279, abstractC19810, abstractC10370));
            }
            this.f43290 = new C17090(abstractC19810.f17560, new C12048(0L, c3774.f11908, c20002.f64770.f66522, abstractC19810));
            return;
        }
        this.f43290 = new C17090(abstractC19810.f17560, c12049);
    }

    @Override // l.InterfaceC0951
    /* JADX INFO: renamed from: ֫ */
    public final void mo3369(C9419 c9419) {
        this.f43290 = new C10741(m34256(c9419.f28573), this.f43288.f64756);
    }

    @Override // l.InterfaceC0951
    /* JADX INFO: renamed from: ֫ */
    public final void mo3370(C23529 c23529) {
        C2609 c2609 = c23529.f75550;
        AbstractC8624[] abstractC8624Arr = new AbstractC8624[c2609.m8245()];
        AbstractC4308 abstractC4308M17515 = this.f43288.f64756.m17515(this.f43287);
        int i = 0;
        while (c2609.m8249()) {
            abstractC8624Arr[i] = m34257(abstractC4308M17515, (AbstractC8624) c2609.f8240);
            c2609 = c2609.f8241;
            i++;
        }
        this.f43290 = new C1568(this.f43287, abstractC8624Arr);
    }

    @Override // l.InterfaceC0951
    /* JADX INFO: renamed from: ֫ */
    public final void mo3367(C2363 c2363) {
        this.f43290 = m34258(c2363);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m34256(AbstractC4308 abstractC4308) {
        if (!(abstractC4308 instanceof C5185)) {
            return abstractC4308;
        }
        C5185 c5185 = (C5185) abstractC4308;
        C14163 c14163 = this.f43289;
        C12171.m29642(c14163.f17561.f17559 == EnumC1296.f4568);
        C20002 c20002 = this.f43288;
        C0052 c0052 = c20002.f64782;
        c20002.f64782 = (C0052) c14163.f17561;
        try {
            return c5185.m14936();
        } finally {
            c20002.f64782 = c0052;
        }
    }
}
