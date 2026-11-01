package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final class C8769 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f23795;

    /* JADX INFO: renamed from: ۖ */
    public C22004 f23796;

    /* JADX INFO: renamed from: ۘ */
    public C8374 f23797;

    /* JADX INFO: renamed from: ۜ */
    public HashMap f23798;

    /* JADX INFO: renamed from: ۡ */
    public C4848 f23799;

    /* JADX INFO: renamed from: ۢ */
    public C23623 f23800;

    /* JADX INFO: renamed from: ۧ */
    public C16852 f23801;

    /* JADX INFO: renamed from: ܳ */
    public C3680 f23802;

    /* JADX INFO: renamed from: ܺ */
    public C23663 f23803;

    /* JADX INFO: renamed from: ܽ */
    public final String f23804;

    /* JADX INFO: renamed from: ܿ */
    public final C2733 f23805;

    /* JADX INFO: renamed from: ᩳ */
    public C8005 f23806;

    /* JADX INFO: renamed from: ᩷ */
    public C15434 f23807;

    /* JADX INFO: renamed from: ᩻ */
    public C9400 f23808;

    /* JADX INFO: renamed from: ᩵ */
    public static final C6468 f23794 = new C6468();

    /* JADX INFO: renamed from: ᩴ */
    public static final C13286 f23793 = new C13286();

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ C4848 m20281(C8769 c8769, C18827 c18827) {
        c8769.getClass();
        return m20282(c18827, (C8788) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8769 m20284(C5127 c5127) {
        C8769 c8769 = (C8769) c5127.m10905(f23794);
        return c8769 == null ? new C8769(c5127) : c8769;
    }

    public C8769(C5127 c5127) {
        C24152 c24152 = new C24152(this);
        this.f23802 = c24152;
        this.f23807 = new C15434(this);
        this.f23808 = new C9400(this);
        this.f23798 = new HashMap();
        c5127.m10908(f23794, this);
        this.f23803 = C23663.m52629(c5127);
        this.f23801 = C16852.m38215(c5127);
        this.f23796 = C22004.m49577(c5127);
        this.f23797 = C8374.m19396(c5127);
        this.f23806 = C8005.m18541(c5127);
        this.f23800 = C23623.m52439(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f23795 = EnumC12477.f34964.m28726(EnumC17840.m40515(c5127)) && c13565M30871.m30883("useLegacyInference");
        this.f23804 = c13565M30871.m30872("debug.dumpInferenceGraphsTo");
        this.f23799 = C4848.m10283();
        C4848 c4848M10283 = C4848.m10283();
        this.f23805 = new C2733(this, c4848M10283, c4848M10283.m10287((Function) c24152));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14646 m20286(C18258 c18258) {
        C14646 c14646 = new C14646(null);
        C4848 c4848M10283 = C4848.m10283();
        c14646.f41832 = c4848M10283;
        if (c18258 != null) {
            c14646.f41832 = c4848M10283.m10286(c18258);
        }
        return c14646;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12497 m20296(C4036 c4036, C4848 c4848, C12497 c12497, C24626 c24626, C5771 c5771, C4848 c4849, C14119 c14119, C3686 c3686) {
        C12497 c18827;
        C12497 c12498 = c12497;
        boolean z = this.f23795;
        C2733 c2733 = new C2733(this, c4848, c4848.m10287((Function) this.f23802));
        try {
            C8788 c8788M32058 = c14119.m32058(c5771, c2733, c24626, c3686);
            c14119.f40078.mo13089(c4036, c8788M32058, c4849, c12498.f35030, c3686);
            if (z && c24626 != null && c24626.f77965 == f23793) {
                m20297(c2733, c3686);
                c18827 = new C18827(this, c12497, c2733, c4036, c3686);
                c2733.m4263();
            } else {
                if (z && c24626 != null) {
                    m20297(c2733, c3686);
                    if (!c3686.m7110(EnumC21706.UNCHECKED)) {
                        boolean zM20290 = m20290(c12498.f35031, c24626, c2733);
                        C2733 c2733M4246 = zM20290 ? c2733.m4246(m20282(c12498, c8788M32058), true, c3686) : c2733;
                        C12497 c12499 = (C12497) this.f23797.m19482(c12498, m20295(c4036.f8850, c24626, c12498, c2733M4246));
                        if (zM20290) {
                            c2733M4246.m4252(c24626.f77961.mo6098(), false);
                            c8788M32058.mo20323();
                            c2733.m4263();
                            m20287(c4036.f8850, c5771, c14119);
                            return c12499;
                        }
                        c12498 = c12499;
                    }
                }
                c8788M32058.mo20323();
                if (z) {
                    c2733.m4253(c3686);
                } else {
                    c2733.m4256(true, c3686, EnumC19498.f59394.f59396);
                }
                c18827 = (C12497) c2733.m4250(c12498);
                if (!z && c2733.m4267().m10293() && c24626 != null && !c3686.m7110(EnumC21706.UNCHECKED)) {
                    m20295(c4036.f8850, c24626, c18827, c2733);
                    c2733.m4256(false, c3686, EnumC19498.f59393.f59396);
                    c18827 = (C12497) c2733.m4250(c18827);
                }
                if (c24626 != null && this.f23803.f75310.contains(EnumC22993.DEFERRED_INST)) {
                    C23623 c23623 = this.f23800;
                    int i = c4036.f8850.f18924;
                    AbstractC6462 abstractC6462 = c24626.f77965;
                    C15380 c15380 = C24393.f77212;
                    c23623.m9349(i, new C15380("compiler", "deferred.method.inst", c5771, c18827, abstractC6462));
                }
                if (c24626 == null && z) {
                    c2733.m4266(c2733.m4247());
                } else {
                    c2733.m4263();
                }
                if (c24626 == null) {
                    c2733.f4589.clear();
                }
            }
            m20287(c4036.f8850, c5771, c14119);
            return c18827;
        } catch (Throwable th) {
            if (c24626 == null && z) {
                c2733.m4266(c2733.m4247());
            } else {
                c2733.m4263();
            }
            if (c24626 == null) {
                c2733.f4589.clear();
            }
            m20287(c4036.f8850, c5771, c14119);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m20290(AbstractC6462 abstractC6462, C24626 c24626, C2733 c2733) {
        if (c24626.f77961.mo6098() == this.f23805 || !abstractC6462.m14792(c2733.f4594)) {
            return false;
        }
        return (c2733.f4594.contains(abstractC6462) && m20289((C3108) c2733.m4259(abstractC6462), c24626.f77965, c2733)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m20282(C12497 c12497, C8788 c8788) {
        if (c8788 != null && c8788.f23845 == EnumC15511.CHECK) {
            C20271 c20271 = new C20271();
            c20271.m45777(c12497.f35031);
            for (C20188 c20188 : c8788.f23841) {
                c20271.addAll(c20188.f62475.mo30642());
                c20271.addAll(c20188.f62475.mo30641());
            }
            C4848 c4848 = (C4848) C7480.stream(c8788.f23843.f4594).filter(new C13424()).collect(C4848.m10284());
            C4848 c4848M45783 = c20271.m45783();
            C4848 c4848M10288 = c4848.m10288(c4848M45783);
            c4848M45783.getClass();
            return c4848M10288.m10292(c4848M45783);
        }
        return C4848.m10276of((Object) c12497.f35031);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20287(InterfaceC5323 interfaceC5323, C5771 c5771, C14119 c14119) {
        String str = this.f23804;
        try {
            try {
                int i = 0;
                for (String str2 : this.f23799.m10294()) {
                    C1446.m31699((Object) str);
                    AbstractC12224 abstractC12224 = c5771.f20408;
                    if (abstractC12224 == abstractC12224.f34165.f40540.f21737) {
                        abstractC12224 = c5771.f20407.f20408;
                    }
                    BufferedWriter bufferedWriterNewBufferedWriter = C18743.newBufferedWriter(C10697.get(str, String.format("%s@%s[mode=%s,step=%s]_%d.dot", abstractC12224, Integer.valueOf(interfaceC5323.mo11526()), c14119.m32059(), c14119.f40077, Integer.valueOf(i))), new InterfaceC24778[0]);
                    try {
                        bufferedWriterNewBufferedWriter.append((CharSequence) str2);
                        bufferedWriterNewBufferedWriter.close();
                        i++;
                    } catch (Throwable th) {
                        if (bufferedWriterNewBufferedWriter != null) {
                            try {
                                bufferedWriterNewBufferedWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                this.f23799 = C4848.m10283();
            } catch (IOException e) {
                C1446.m31702("Error occurred when dumping inference graph: " + e.getMessage());
                throw null;
            }
        } catch (Throwable th3) {
            this.f23799 = C4848.m10283();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m20295(AbstractC7257 abstractC7257, C24626 c24626, C12497 c12497, C2733 c2733) {
        char c;
        AbstractC6462 abstractC6462;
        boolean z;
        C3686 c3686;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        EnumC23995 enumC23995 = c24626.f77962;
        AbstractC6462 abstractC6463 = c24626.f77965;
        C2733 c2733Mo6098 = interfaceC6125.mo6098();
        AbstractC6462 abstractC6462M19463 = c12497.f35031;
        boolean zM14792 = abstractC6462M19463.m14792(c2733.f4594);
        C8374 c8374 = this.f23797;
        if (zM14792 && c2733Mo6098 != this.f23805) {
            abstractC6462M19463 = c8374.m19463(abstractC6462M19463);
            for (AbstractC6462 abstractC6464 : abstractC6462M19463.mo14802()) {
                if (abstractC6464.m14777(EnumC11353.TYPEVAR)) {
                    C10485 c10485 = (C10485) abstractC6464;
                    if (c10485.mo24195()) {
                        c2733.f4591 = c2733.f4591.m10290((AbstractC6462) c10485.mo5291(c2733.f4592.f23802, (Object) null));
                        c2733.f4594 = c2733.f4594.m10290(c10485);
                    }
                }
            }
        }
        AbstractC6462 abstractC6462M4259 = c2733.m4259(abstractC6462M19463);
        boolean zM14777 = abstractC6462M4259.m14777(EnumC11353.VOID);
        boolean z2 = this.f23795;
        C22004 c22004 = this.f23796;
        if (zM14777) {
            abstractC6462 = c22004.f69183;
        } else {
            if (abstractC6463.m14777(EnumC11353.NONE)) {
                if (abstractC6462M19463.mo14805()) {
                    abstractC6463 = abstractC6462M19463;
                } else {
                    abstractC6462 = c22004.f69208;
                }
            } else {
                if (!abstractC6462M4259.m14777(EnumC11353.UNDETVAR)) {
                    c = 1;
                    if (abstractC6463.m14792(c2733Mo6098.f4594)) {
                        abstractC6462M4259 = c2733.m4259(c2733Mo6098.m4251(abstractC7257, abstractC6462M19463, !enumC23995.mo18248()));
                    }
                } else {
                    C3108 c3108 = (C3108) abstractC6462M4259;
                    if (m20289(c3108, abstractC6463, c2733) && (z2 || !abstractC6463.mo14805())) {
                        c2733.m4254(C4848.m10276of((Object) c3108.f16992), new C3686());
                        c2733.m4263();
                        if (c8374.m19496(interfaceC6125.mo6098().m4251(abstractC7257, c3108.m5300(), !enumC23995.mo18248()), interfaceC6125.mo6098().m4259(abstractC6463), c8374.f22469)) {
                            abstractC6463 = c22004.f69208;
                        }
                    }
                }
                if (z2 && abstractC6463.m14792(c2733Mo6098.f4594)) {
                    z = false;
                } else {
                    z = true;
                }
                C1446.m31703("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
                c3686 = new C3686();
                if (!interfaceC6125.mo6100(abstractC6462M4259, c2733Mo6098.m4259(abstractC6463), c3686) && (z2 || !c3686.m7108(EnumC21706.UNCHECKED))) {
                    return abstractC6462M19463;
                }
                C4848 c4848M4267 = c2733.m4267();
                AbstractC6462 abstractC6465 = c12497.f35031;
                C13370 c13370 = C13665.f38450;
                Object[] objArr = new Object[3];
                objArr[0] = c4848M4267;
                objArr[c] = abstractC6465;
                objArr[2] = abstractC6463;
                throw m20286(this.f23806.m18543(new C13370("compiler", "infer.no.conforming.instance.exists", objArr)));
            }
            c = 1;
            if (z2) {
                z = true;
            } else {
                z = true;
            }
            C1446.m31703("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
            c3686 = new C3686();
            if (!interfaceC6125.mo6100(abstractC6462M4259, c2733Mo6098.m4259(abstractC6463), c3686)) {
            }
            C4848 c4848M4268 = c2733.m4267();
            AbstractC6462 abstractC6466 = c12497.f35031;
            C13370 c13371 = C13665.f38450;
            Object[] objArr2 = new Object[3];
            objArr2[0] = c4848M4268;
            objArr2[c] = abstractC6466;
            objArr2[2] = abstractC6463;
            throw m20286(this.f23806.m18543(new C13370("compiler", "infer.no.conforming.instance.exists", objArr2)));
        }
        abstractC6463 = abstractC6462;
        c = 1;
        if (z2) {
            z = true;
        } else {
            z = true;
        }
        C1446.m31703("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
        c3686 = new C3686();
        if (!interfaceC6125.mo6100(abstractC6462M4259, c2733Mo6098.m4259(abstractC6463), c3686)) {
        }
        C4848 c4848M4269 = c2733.m4267();
        AbstractC6462 abstractC6467 = c12497.f35031;
        C13370 c13372 = C13665.f38450;
        Object[] objArr3 = new Object[3];
        objArr3[0] = c4848M4269;
        objArr3[c] = abstractC6467;
        objArr3[2] = abstractC6463;
        throw m20286(this.f23806.m18543(new C13370("compiler", "infer.no.conforming.instance.exists", objArr3)));
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m20289(C3108 c3108, AbstractC6462 abstractC6462, C2733 c2733) {
        boolean zMo14805 = abstractC6462.mo14805();
        C8374 c8374 = this.f23797;
        if (zMo14805) {
            Iterator it = c3108.m5292(EnumC20544.values()).iterator();
            while (it.hasNext()) {
                AbstractC6462 abstractC6462M19503 = c8374.m19503((AbstractC6462) it.next());
                if (abstractC6462M19503 != null && !abstractC6462M19503.m14777(EnumC11353.NONE)) {
                    return true;
                }
            }
            return false;
        }
        if (c8374.m19463(abstractC6462) == abstractC6462) {
            for (AbstractC6462 abstractC6463 : c3108.m5292(EnumC20544.f63507, EnumC20544.f63505)) {
                if (c8374.m19463(abstractC6463) != abstractC6463) {
                    return true;
                }
            }
            for (AbstractC6462 abstractC6464 : c3108.m5292(EnumC20544.f63505)) {
                for (AbstractC6462 abstractC6465 : c3108.m5292(EnumC20544.f63505)) {
                    if (abstractC6464 != abstractC6465 && !abstractC6464.m14792(c2733.f4594) && !abstractC6465.m14792(c2733.f4594)) {
                        for (C24293 c24293 : m20292(abstractC6464, abstractC6465)) {
                            if (!c8374.m19490((AbstractC6462) c24293.f76952, (AbstractC6462) c24293.f76953)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (abstractC6462.mo14781()) {
            Iterator it2 = c3108.m5292(EnumC20544.f63507, EnumC20544.f63505).iterator();
            while (it2.hasNext()) {
                AbstractC6462 abstractC6462M19467 = c8374.m19467(abstractC6462.f16705, (AbstractC6462) it2.next());
                if (abstractC6462M19467 != null && abstractC6462M19467.mo14784()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20300(C4848 c4848, C2733 c2733) {
        C8374 c8374;
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c8374 = this.f23797;
            if (!zHasNext) {
                break;
            }
            C3108 c3108 = (C3108) c2733.m4259((AbstractC6462) it.next());
            EnumC20544 enumC20544 = EnumC20544.f63504;
            C4848 c4848M5292 = c3108.m5292(enumC20544);
            boolean zM14767 = AbstractC6462.m14767(c4848M5292, c4848);
            C22004 c22004 = this.f23796;
            if (zM14767) {
                AbstractC21195 abstractC21195 = c3108.f16992.f16705;
                C6442 c6442 = new C6442(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC21195.f20408, null, abstractC21195.f20407);
                c6442.f20406 = new C10485(c6442, c8374.m19474(c3108.m5292(enumC20544)), c22004.f69204, C22082.f69463);
                c20271.m45777(c3108);
                c3108.m5301(c6442.f20406);
            } else if (c4848M5292.m10293()) {
                c3108.m5301(c8374.m19493(c4848M5292));
            } else {
                c3108.m5301(c22004.f69208);
            }
        }
        C4848 c4849 = c4848;
        Iterator it2 = c20271.iterator();
        while (it2.hasNext()) {
            C3108 c3109 = (C3108) ((AbstractC6462) it2.next());
            C10485 c10485 = (C10485) c3109.m5300();
            c10485.mo23233(c8374.m19493(c2733.m4248(c8374.m19424(c10485))));
            if (c10485.mo14803().mo14812()) {
                m20298(c3109, EnumC20544.f63504);
            }
            c4849 = c4849.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m20294(AbstractC6448 abstractC6448, AbstractC6462 abstractC6462, C4848 c4848, InterfaceC6125 interfaceC6125) {
        C8374 c8374 = this.f23797;
        if (c8374.m19463(abstractC6462) == abstractC6462) {
            return abstractC6462;
        }
        final AbstractC6462 abstractC6463 = abstractC6462.f16705.f20406;
        C4848 c4848Mo14802 = abstractC6463.mo14802();
        C4848 c4848M10287 = c4848Mo14802.m10287((Function) this.f23802);
        new LinkedHashMap();
        new HashMap();
        C1446.m31704(c4848 != null);
        C4848 c4848Mo14797 = c8374.m19478(abstractC6463).mo14797();
        int iM10289 = c4848Mo14797.m10289();
        int iM102810 = c4848.m10289();
        C8005 c8005 = this.f23806;
        if (iM10289 != iM102810) {
            interfaceC6125.mo3480(abstractC6448, c8005.m18543(C13665.f38473));
            return c8374.m19475(abstractC6462);
        }
        Iterator it = c4848Mo14797.iterator();
        while (it.hasNext()) {
            if (!c8374.m19490(c8374.m19428((AbstractC6462) it.next(), c4848Mo14802, c4848M10287), (AbstractC6462) c4848.f11034)) {
                interfaceC6125.mo3480(abstractC6448, c8005.m18543(C13665.m31065(abstractC6462)));
                return c8374.m19475(abstractC6462);
            }
            c4848 = c4848.f11035;
        }
        C4848 c4848Mo14803 = abstractC6462.mo14802();
        Iterator it2 = c4848M10287.iterator();
        while (it2.hasNext()) {
            C3108 c3108 = (C3108) ((AbstractC6462) it2.next());
            c3108.m5301((AbstractC6462) C7480.stream(c3108.m5292(EnumC20544.f63507)).filter(new Predicate() { // from class: l.ۛۤ֨
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m18734or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return !((AbstractC6462) obj).m14792(abstractC6463.mo14802());
                }
            }).findFirst().orElse((AbstractC6462) c4848Mo14803.f11034));
            c4848Mo14803 = c4848Mo14803.f11035;
        }
        C20271 c20271 = new C20271();
        Iterator it3 = c4848M10287.iterator();
        while (it3.hasNext()) {
            C3108 c3109 = (C3108) ((AbstractC6462) it3.next());
            c20271.m45777(c3109.m5300() != null ? c3109.m5300() : c3109.f16992);
        }
        AbstractC6462 abstractC6462M19428 = c8374.m19428(abstractC6463, c4848Mo14802, c20271.m45783());
        if (!this.f23801.m38324(abstractC6462M19428)) {
            interfaceC6125.mo3480(abstractC6448, c8005.m18543(C13665.m31065(abstractC6462)));
        }
        interfaceC6125.mo6100(abstractC6462M19428, abstractC6462, c8374.f22469);
        return abstractC6462M19428;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20297(C2733 c2733, C3686 c3686) {
        HashMap map;
        boolean z = true;
        int i = 0;
        while (true) {
            map = this.f23798;
            if (!z || i >= 10000) {
                break;
            }
            try {
                Iterator it = c2733.f4591.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    C3108 c3108 = (C3108) ((AbstractC6462) it.next());
                    if (!c3108.f5653.isEmpty()) {
                        ((AbstractC22694) c3108.f5653.removeFirst()).mo36334(c2733, c3686);
                        z2 = true;
                    }
                }
                i++;
                z = z2;
            } catch (Throwable th) {
                map.clear();
                throw th;
            }
        }
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public C4848 m20292(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C4848<AbstractC6462> c4848M10276of;
        AbstractC6462 abstractC6462M19432 = this.f23797.m19432(abstractC6462, abstractC6463);
        C22004 c22004 = this.f23796;
        if (abstractC6462M19432 == c22004.f69139 || abstractC6462M19432 == c22004.f69204) {
            return C4848.m10283();
        }
        abstractC6462M19432.getClass();
        if (abstractC6462M19432 instanceof C7921) {
            C7921 c7921 = (C7921) abstractC6462M19432;
            c4848M10276of = c7921.f67261.m10290(c7921.f67259);
        } else {
            c4848M10276of = C4848.m10276of((Object) abstractC6462M19432);
        }
        C20271 c20271 = new C20271();
        for (AbstractC6462 abstractC6464 : c4848M10276of) {
            if (abstractC6464.mo14781()) {
                c20271.m45777(new C24293(m20283(abstractC6462, abstractC6464), m20283(abstractC6463, abstractC6464)));
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC6462 m20283(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        boolean zM14777 = abstractC6463.m14777(EnumC11353.ARRAY);
        C8374 c8374 = this.f23797;
        if (zM14777) {
            return new C7251(m20283(c8374.m19455(abstractC6462), c8374.m19455(abstractC6463)), this.f23796.f69187);
        }
        return c8374.m19467(abstractC6463.f16705, abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20301(EnumC5259 enumC5259, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        C23364 c23364 = new C23364(this, enumC5259, abstractC6462, abstractC6463);
        HashMap map = this.f23798;
        Boolean boolValueOf = (Boolean) map.get(c23364);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(enumC5259.mo11337(abstractC6462, abstractC6463, c3686, this.f23797));
            map.put(c23364, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20298(C3108 c3108, EnumC20544 enumC20544) {
        int i = C3918.f8503[enumC20544.ordinal()];
        C8005 c8005 = this.f23806;
        if (i == 1) {
            AbstractC6462 abstractC6462 = c3108.f16992;
            C4848 c4848M5292 = c3108.m5292(enumC20544);
            C13370 c13370 = C13665.f38450;
            throw m20286(c8005.m18543(new C13370("compiler", "incompatible.eq.bounds", abstractC6462, c4848M5292)));
        }
        if (i == 2) {
            throw new AssertionError("this case shouldn't happen");
        }
        if (i != 3) {
            return;
        }
        AbstractC6462 abstractC6463 = c3108.f16992;
        C4848 c4848M5293 = c3108.m5292(enumC20544);
        C13370 c13371 = C13665.f38450;
        throw m20286(c8005.m18543(new C13370("compiler", "incompatible.upper.bounds", abstractC6463, c4848M5293)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20299(C3108 c3108, EnumC20544 enumC20544, EnumC20544 enumC20545) {
        AbstractC6462 abstractC6462 = c3108.f16992;
        C13370 c13370M20285 = m20285(enumC20544, c3108.m5292(enumC20544));
        C13370 c13370M20286 = m20285(enumC20545, c3108.m5292(enumC20545));
        C13370 c13370 = C13665.f38450;
        throw m20286(this.f23806.m18543(new C13370("compiler", "incompatible.bounds", abstractC6462, c13370M20285, c13370M20286)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13370 m20285(EnumC20544 enumC20544, C4848 c4848) {
        int i = C3918.f8503[enumC20544.ordinal()];
        if (i == 1) {
            C13370 c13370 = C13665.f38450;
            return new C13370("compiler", "eq.bounds", c4848);
        }
        if (i == 2) {
            C13370 c13371 = C13665.f38450;
            return new C13370("compiler", "lower.bounds", c4848);
        }
        if (i == 3) {
            C13370 c13372 = C13665.f38450;
            return new C13370("compiler", "upper.bounds", c4848);
        }
        throw new AssertionError("can't get to this place");
    }
}
