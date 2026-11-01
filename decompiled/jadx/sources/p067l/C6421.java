package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: KARX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6421 extends AbstractC13538 {

    /* JADX INFO: renamed from: ۜ */
    public final C5080 f16618;

    /* JADX INFO: renamed from: ۢ */
    public int f16619;

    /* JADX INFO: renamed from: ܳ */
    public int f16620;

    /* JADX INFO: renamed from: ܿ */
    public final C7959[] f16621;

    /* JADX INFO: renamed from: ᩳ */
    public int f16622;

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC24937 f16623;

    /* JADX INFO: renamed from: ᩻ */
    public int f16624;

    @Override // p067l.AbstractC13538
    /* JADX INFO: renamed from: ֫ */
    public final void mo14698() {
        C5080 c5080 = this.f16618;
        c5080.f11908 = -1;
        c5080.f11909 = 0;
        c5080.f11906 = -1;
        c5080.f11907 = null;
        this.f16619 = -1;
        this.f16620 = 1;
        this.f16622 = 0;
        this.f16624 = 0;
    }

    public C6421(AbstractC24937 abstractC24937, C22926 c22926, C7959[] c7959Arr, C19359 c19359) {
        super(c22926, c19359);
        this.f16619 = -1;
        this.f16620 = 1;
        this.f16622 = 0;
        this.f16624 = 0;
        C5080 c5080 = new C5080();
        c5080.f11908 = -1;
        c5080.f11909 = 0;
        c5080.f11906 = -1;
        this.f16618 = c5080;
        this.f16621 = c7959Arr;
        this.f16623 = abstractC24937;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m14695(InterfaceC24346 interfaceC24346, int i) {
        this.f16624 = i;
        int iMo8402 = interfaceC24346.mo8402();
        try {
            this.f16619 = interfaceC24346.index();
            C5080 c5080 = this.f16618;
            c5080.f11908 = -1;
            c5080.f11909 = 0;
            c5080.f11906 = -1;
            c5080.f11907 = null;
            C7959 c7959 = this.f16621[i];
            if (c7959.f20921 == null) {
                return m14706(interfaceC24346);
            }
            return m14696(interfaceC24346, c7959.f20921);
        } finally {
            interfaceC24346.mo8409(iMo8402);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m14706(InterfaceC24346 interfaceC24346) {
        AbstractC24266 abstractC24266 = (AbstractC24266) this.f38088.f72150.get(this.f16624);
        C22515 c22515 = C22515.f71002;
        C8432 c8432 = new C8432();
        int i = 0;
        while (i < abstractC24266.f76893.size()) {
            int i2 = i + 1;
            m14701(interfaceC24346, new C17819(abstractC24266.m53604(i).f41850, i2, c22515), c8432, false, false, false);
            i = i2;
        }
        boolean z = c8432.f42418;
        c8432.f42418 = false;
        C15334 c15334M14697 = m14697(c8432);
        if (!z) {
            this.f16621[this.f16624].f20921 = c15334M14697;
        }
        return m14696(interfaceC24346, c15334M14697);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m14696(InterfaceC24346 interfaceC24346, C15334 c15334) throws Throwable {
        C15334 c15334M14697;
        C23596 c23596;
        boolean z = c15334.f43768;
        C5080 c5080 = this.f16618;
        if (z) {
            c5080.f11908 = interfaceC24346.index();
            c5080.f11909 = this.f16620;
            c5080.f11906 = this.f16622;
            c5080.f11907 = c15334;
        }
        C15334 c15335 = c15334;
        int iMo8405 = interfaceC24346.mo8405(1);
        C6421 c6421 = this;
        InterfaceC24346 interfaceC24347 = interfaceC24346;
        while (true) {
            C15334[] c15334Arr = c15335.f43766;
            C15334 c15336 = (c15334Arr == null || iMo8405 < 0 || iMo8405 > 127) ? null : c15334Arr[iMo8405];
            C15334 c15337 = AbstractC13538.f38087;
            if (c15336 == null) {
                C8432 c8432 = new C8432();
                int i = 0;
                for (C23596 c23597 : c15335.f43764.f42416) {
                    int i2 = c23597.f75116;
                    AbstractC24266 abstractC24266 = c23597.f75119;
                    boolean z2 = i2 == i;
                    if (!z2 || !((C17819) c23597).m40445()) {
                        int size = abstractC24266.f76893.size();
                        int i3 = 0;
                        while (i3 < size) {
                            AbstractC14664 abstractC14664M53604 = abstractC24266.m53604(i3);
                            InterfaceC24346 interfaceC24348 = interfaceC24347;
                            AbstractC24266 abstractC24267 = abstractC14664M53604.mo5683(iMo8405, 1114111) ? abstractC14664M53604.f41850 : null;
                            if (abstractC24267 != null) {
                                C17819 c17819 = (C17819) c23597;
                                C21174 c21174M40443 = c17819.m40443();
                                if (c21174M40443 != null) {
                                    c21174M40443 = c21174M40443.m47794(interfaceC24346.index() - c6421.f16619);
                                }
                                c23596 = c23597;
                                if (m14701(interfaceC24346, new C17819(c17819, abstractC24267, c21174M40443), c8432, z2, true, iMo8405 == -1)) {
                                    i = c23596.f75116;
                                    interfaceC24347 = interfaceC24346;
                                    c6421 = this;
                                    break;
                                }
                                c6421 = this;
                                interfaceC24347 = interfaceC24346;
                            } else {
                                c23596 = c23597;
                                interfaceC24347 = interfaceC24348;
                            }
                            i3++;
                            c23597 = c23596;
                            size = size;
                            abstractC24266 = abstractC24266;
                        }
                    }
                }
                if (c8432.f42416.isEmpty()) {
                    if (!c8432.f42418) {
                        m14694(c15335, iMo8405, c15337);
                    }
                    c15334M14697 = c15337;
                } else {
                    boolean z3 = c8432.f42418;
                    c8432.f42418 = false;
                    c15334M14697 = c6421.m14697(c8432);
                    if (!z3) {
                        m14694(c15335, iMo8405, c15334M14697);
                    }
                }
                c15335 = c15334M14697;
            } else {
                c15335 = c15336;
            }
            if (c15335 == c15337) {
                break;
            }
            if (iMo8405 != -1) {
                m14700(interfaceC24346);
            }
            if (c15335.f43768) {
                c5080.f11908 = interfaceC24347.index();
                c5080.f11909 = c6421.f16620;
                c5080.f11906 = c6421.f16622;
                c5080.f11907 = c15335;
                if (iMo8405 == -1) {
                    break;
                }
            }
            iMo8405 = interfaceC24347.mo8405(1);
        }
        C15334 c15338 = c5080.f11907;
        AbstractC24937 abstractC24937 = c6421.f16623;
        if (c15338 != null) {
            C21174 c21174 = c15338.f43770;
            int i4 = c6421.f16619;
            int i5 = c5080.f11908;
            int i6 = c5080.f11909;
            int i7 = c5080.f11906;
            interfaceC24347.mo8403(i5);
            c6421.f16620 = i6;
            c6421.f16622 = i7;
            if (c21174 != null) {
                c21174.m47795(abstractC24937, interfaceC24347, i4);
            }
            return c5080.f11907.f43767;
        }
        if (iMo8405 == -1 && interfaceC24347.index() == c6421.f16619) {
            return -1;
        }
        throw new C8844(abstractC24937, interfaceC24347, c6421.f16619);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[PHI: r2
      0x015b: PHI (r2v2 l.᩵ܳ֡) = (r2v1 l.᩵ܳ֡), (r2v1 l.᩵ܳ֡), (r2v1 l.᩵ܳ֡), (r2v5 l.᩵ܳ֡) binds: [B:42:0x00ac, B:63:0x013e, B:65:0x0148, B:57:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m14701(InterfaceC24346 interfaceC24346, C17819 c17819, C8432 c8432, boolean z, boolean z2, boolean z3) {
        C20915 c20915;
        C17819 c178110;
        boolean zMo3736;
        C17819 c178111;
        C20915 c20916;
        C8432 c8433 = c8432;
        AbstractC24266 abstractC24266 = c17819.f75119;
        boolean z4 = abstractC24266 instanceof C11313;
        C20915 c20917 = null;
        C22926 c22926 = this.f38088;
        boolean z5 = true;
        if (!z4) {
            if (!abstractC24266.f76892 && (!z || !c17819.m40445())) {
                c8433.m33990(c17819, null);
            }
            boolean zM14701 = z;
            int i = 0;
            while (i < abstractC24266.f76893.size()) {
                AbstractC14664 abstractC14664M53604 = abstractC24266.m53604(i);
                int iMo5682 = abstractC14664M53604.mo5682();
                if (iMo5682 == 10) {
                    throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
                }
                switch (iMo5682) {
                    case 1:
                        c20916 = c20917;
                        c178111 = new C17819(c17819, abstractC14664M53604.f41850);
                        c20915 = c20916;
                        c178110 = c178111;
                        if (c178110 != 0) {
                            zM14701 = m14701(interfaceC24346, c178110, c8432, zM14701, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c20917 = c20915;
                        c8433 = c8432;
                        break;
                    case 2:
                    case 5:
                    case 7:
                        if (z3 && abstractC14664M53604.mo5683(-1, 1114111)) {
                            c20916 = c20917;
                            c178111 = new C17819(c17819, abstractC14664M53604.f41850);
                            c20915 = c20916;
                            c178110 = c178111;
                        } else {
                            c20917 = c20917;
                            C20915 c20918 = c20917;
                            c20915 = c20918;
                            c178110 = c20918;
                        }
                        if (c178110 != 0) {
                            zM14701 = m14701(interfaceC24346, c178110, c8432, zM14701, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c20917 = c20915;
                        c8433 = c8432;
                        break;
                    case 3:
                        c20915 = c20917;
                        c178110 = new C17819(c17819, abstractC14664M53604.f41850, C9971.m23280(c17819.f75117, ((C10642) abstractC14664M53604).f29431.f76895));
                        if (c178110 != 0) {
                            zM14701 = m14701(interfaceC24346, c178110, c8432, zM14701, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c20917 = c20915;
                        c8433 = c8432;
                        break;
                    case 4:
                        C12654 c12654 = (C12654) abstractC14664M53604;
                        c8433.f42418 = z5;
                        int i2 = c12654.f35530;
                        int i3 = c12654.f35531;
                        AbstractC24937 abstractC24937 = this.f16623;
                        if (!z2) {
                            zMo3736 = abstractC24937.mo3736(c20917, i2, i3);
                        } else {
                            int i4 = this.f16622;
                            int i5 = this.f16620;
                            int iIndex = interfaceC24346.index();
                            int iMo8402 = interfaceC24346.mo8402();
                            try {
                                m14700(interfaceC24346);
                                zMo3736 = abstractC24937.mo3736(null, i2, i3);
                                this.f16622 = i4;
                                this.f16620 = i5;
                                interfaceC24346.mo8403(iIndex);
                                interfaceC24346.mo8409(iMo8402);
                                c20917 = null;
                            } catch (Throwable th) {
                                this.f16622 = i4;
                                this.f16620 = i5;
                                interfaceC24346.mo8403(iIndex);
                                interfaceC24346.mo8409(iMo8402);
                                throw th;
                            }
                        }
                        if (zMo3736) {
                            c20917 = c20917;
                            c20916 = c20917;
                            c178111 = new C17819(c17819, abstractC14664M53604.f41850);
                            c20915 = c20916;
                            c178110 = c178111;
                        } else {
                            c20917 = c20917;
                            C20915 c20919 = c20917;
                            c20915 = c20919;
                            c178110 = c20919;
                        }
                        if (c178110 != 0) {
                            zM14701 = m14701(interfaceC24346, c178110, c8432, zM14701, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c20917 = c20915;
                        c8433 = c8432;
                        break;
                    case 6:
                        AbstractC18017 abstractC18017 = c17819.f75117;
                        if (abstractC18017 == null || abstractC18017.m40998()) {
                            c178111 = new C17819(c17819, abstractC14664M53604.f41850, C21174.m47793(c17819.m40443(), c22926.f72149[((C4409) abstractC14664M53604).f9899]));
                            c20916 = c20917;
                        } else {
                            c20916 = c20917;
                            c178111 = new C17819(c17819, abstractC14664M53604.f41850);
                        }
                        c20915 = c20916;
                        c178110 = c178111;
                        if (c178110 != 0) {
                            zM14701 = m14701(interfaceC24346, c178110, c8432, zM14701, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c20917 = c20915;
                        c8433 = c8432;
                        break;
                    default:
                        c20917 = c20917;
                        C20915 c209110 = c20917;
                        c20915 = c209110;
                        c178110 = c209110;
                        if (c178110 != 0) {
                            zM14701 = m14701(interfaceC24346, c178110, c8432, zM14701, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c20917 = c20915;
                        c8433 = c8432;
                        break;
                }
            }
            return zM14701;
        }
        AbstractC18017 abstractC18018 = c17819.f75117;
        if (abstractC18018 == null || abstractC18018.m40998()) {
            AbstractC18017 abstractC18019 = c17819.f75117;
            if (abstractC18019 == null || abstractC18019.mo30021()) {
                c8433.m33990(c17819, null);
                return true;
            }
            c8433.m33990(new C17819(c17819, abstractC24266, C22515.f71002), null);
        } else {
            z5 = z;
        }
        AbstractC18017 abstractC180110 = c17819.f75117;
        if (abstractC180110 == null || abstractC180110.mo30021()) {
            return z5;
        }
        boolean zM14702 = z5;
        for (int i6 = 0; i6 < c17819.f75117.mo23283(); i6++) {
            if (c17819.f75117.mo23282(i6) != Integer.MAX_VALUE) {
                zM14702 = m14701(interfaceC24346, new C17819(c17819, (AbstractC24266) c22926.f72152.get(c17819.f75117.mo23282(i6)), c17819.f75117.mo23281(i6)), c8432, zM14702, z2, z3);
            }
        }
        return zM14702;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14694(C15334 c15334, int i, C15334 c15335) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c15334) {
            if (c15334.f43766 == null) {
                c15334.f43766 = new C15334[128];
            }
            c15334.f43766[i] = c15335;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15334 m14697(C8432 c8432) {
        C23596 c23596;
        C15334 c15334 = new C15334(c8432);
        Iterator it = c8432.f42416.iterator();
        do {
            if (!it.hasNext()) {
                c23596 = null;
                break;
            }
            c23596 = (C23596) it.next();
        } while (!(c23596.f75119 instanceof C11313));
        if (c23596 != null) {
            c15334.f43768 = true;
            c15334.f43770 = ((C17819) c23596).m40443();
            c15334.f43767 = this.f38088.f72146[c23596.f75119.f76896];
        }
        C7959 c7959 = this.f16621[this.f16624];
        synchronized (c7959.f20920) {
            C15334 c15335 = (C15334) c7959.f20920.get(c15334);
            if (c15335 != null) {
                return c15335;
            }
            c15334.f43765 = c7959.f20920.size();
            c8432.m33993();
            c15334.f43764 = c8432;
            c7959.f20920.put(c15334, c15334);
            return c15334;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m14703(InterfaceC24346 interfaceC24346) {
        return interfaceC24346.mo13949(C16399.m37214(this.f16619, interfaceC24346.index() - 1));
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m14705() {
        return this.f16620;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14704(int i) {
        this.f16620 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m14702() {
        return this.f16622;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14699(int i) {
        this.f16622 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14700(InterfaceC24346 interfaceC24346) {
        if (interfaceC24346.mo8405(1) == 10) {
            this.f16620++;
            this.f16622 = 0;
        } else {
            this.f16622++;
        }
        interfaceC24346.mo8406();
    }
}
