package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
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
public final class C6735 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f20921;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20661 f20922;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C6319 f20923;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashMap f20924;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2609 f20925;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C22364 f20926;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15240 f20927;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1380 f20928;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22406 f20929;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f20930;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0384 f20931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5931 f20932;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13748 f20933;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7399 f20934;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C4314 f20920 = new C4314();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C11488 f20919 = new C11488();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C2609 m18333(C6735 c6735, C17318 c17318) {
        c6735.getClass();
        return m18334(c17318, (C6755) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6735 m18336(C2903 c2903) {
        C6735 c6735 = (C6735) c2903.m8838(f20920);
        return c6735 == null ? new C6735(c2903) : c6735;
    }

    public C6735(C2903 c2903) {
        C22921 c22921 = new C22921(this);
        this.f20928 = c22921;
        this.f20933 = new C13748(this);
        this.f20934 = new C7399(this);
        this.f20924 = new HashMap();
        c2903.m8841(f20920, this);
        this.f20929 = C22406.m50289(c2903);
        this.f20927 = C15240.m36054(c2903);
        this.f20922 = C20661.m47250(c2903);
        this.f20923 = C6319.m17456(c2903);
        this.f20932 = C5931.m16615(c2903);
        this.f20926 = C22364.m50099(c2903);
        C11781 c11781M28823 = C11781.m28823(c2903);
        this.f20921 = EnumC10637.f31993.m26686(EnumC16280.m38301(c2903)) && c11781M28823.m28835("useLegacyInference");
        this.f20930 = c11781M28823.m28824("debug.dumpInferenceGraphsTo");
        this.f20925 = C2609.m8239();
        C2609 c2609M8239 = C2609.m8239();
        this.f20931 = new C0384(this, c2609M8239, c2609M8239.m8243((Function) c22921));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12919 m18338(C16719 c16719) {
        C12919 c12919 = new C12919(null);
        C2609 c2609M8239 = C2609.m8239();
        c12919.f38791 = c2609M8239;
        if (c16719 != null) {
            c12919.f38791 = c2609M8239.m8242(c16719);
        }
        return c12919;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10658 m18348(C1755 c1755, C2609 c2609, C10658 c10658, C23420 c23420, C3581 c3581, C2609 c26010, C12364 c12364, C1386 c1386) {
        C10658 c17318;
        C10658 c10659 = c10658;
        boolean z = this.f20921;
        C0384 c0384 = new C0384(this, c2609, c2609.m8243((Function) this.f20928));
        try {
            C6755 c6755M29997 = c12364.m29997(c3581, c0384, c23420, c1386);
            c12364.f37062.mo11113(c1755, c6755M29997, c26010, c10659.f32059, c1386);
            if (z && c23420 != null && c23420.f75219 == f20919) {
                m18349(c0384, c1386);
                c17318 = new C17318(this, c10658, c0384, c1755, c1386);
                c0384.m1872();
            } else {
                if (z && c23420 != null) {
                    m18349(c0384, c1386);
                    if (!c1386.m4872(EnumC20347.UNCHECKED)) {
                        boolean zM18342 = m18342(c10659.f32060, c23420, c0384);
                        C0384 c0384M1855 = zM18342 ? c0384.m1855(m18334(c10659, c6755M29997), true, c1386) : c0384;
                        C10658 c106510 = (C10658) this.f20923.m17542(c10659, m18347(c1755.f6074, c23420, c10659, c0384M1855));
                        if (zM18342) {
                            c0384M1855.m1861(c23420.f75215.mo3857(), false);
                            c6755M29997.mo18375();
                            c0384.m1872();
                            m18339(c1755.f6074, c3581, c12364);
                            return c106510;
                        }
                        c10659 = c106510;
                    }
                }
                c6755M29997.mo18375();
                if (z) {
                    c0384.m1862(c1386);
                } else {
                    c0384.m1865(true, c1386, EnumC18024.f56196.f56198);
                }
                c17318 = (C10658) c0384.m1859(c10659);
                if (!z && c0384.m1876().m8249() && c23420 != null && !c1386.m4872(EnumC20347.UNCHECKED)) {
                    m18347(c1755.f6074, c23420, c17318, c0384);
                    c0384.m1865(false, c1386, EnumC18024.f56195.f56198);
                    c17318 = (C10658) c0384.m1859(c17318);
                }
                if (c23420 != null && this.f20929.f72584.contains(EnumC21701.DEFERRED_INST)) {
                    C22364 c22364 = this.f20926;
                    int i = c1755.f6074.f16085;
                    AbstractC4308 abstractC4308 = c23420.f75219;
                    C13691 c13691 = C23174.f74467;
                    c22364.m7270(i, new C13691("compiler", "deferred.method.inst", c3581, c17318, abstractC4308));
                }
                if (c23420 == null && z) {
                    c0384.m1875(c0384.m1856());
                } else {
                    c0384.m1872();
                }
                if (c23420 == null) {
                    c0384.f1812.clear();
                }
            }
            m18339(c1755.f6074, c3581, c12364);
            return c17318;
        } catch (Throwable th) {
            if (c23420 == null && z) {
                c0384.m1875(c0384.m1856());
            } else {
                c0384.m1872();
            }
            if (c23420 == null) {
                c0384.f1812.clear();
            }
            m18339(c1755.f6074, c3581, c12364);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m18342(AbstractC4308 abstractC4308, C23420 c23420, C0384 c0384) {
        if (c23420.f75215.mo3857() == this.f20931 || !abstractC4308.m12928(c0384.f1817)) {
            return false;
        }
        return (c0384.f1817.contains(abstractC4308) && m18341((C0779) c0384.m1868(abstractC4308), c23420.f75219, c0384)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m18334(C10658 c10658, C6755 c6755) {
        if (c6755 != null && c6755.f20970 == EnumC13829.CHECK) {
            C18837 c18837 = new C18837();
            c18837.m43511(c10658.f32060);
            for (C18750 c18750 : c6755.f20966) {
                c18837.addAll(c18750.f59252.mo28594());
                c18837.addAll(c18750.f59252.mo28593());
            }
            C2609 c2609 = (C2609) C5378.stream(c6755.f20968.f1817).filter(new C11633()).collect(C2609.m8240());
            C2609 c2609M43517 = c18837.m43517();
            C2609 c2609M8244 = c2609.m8244(c2609M43517);
            c2609M43517.getClass();
            return c2609M8244.m8248(c2609M43517);
        }
        return C2609.of((Object) c10658.f32060);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18339(InterfaceC3109 interfaceC3109, C3581 c3581, C12364 c12364) {
        String str = this.f20930;
        try {
            try {
                int i = 0;
                for (String str2 : this.f20925.m8250()) {
                    C12171.m29637((Object) str);
                    AbstractC10370 abstractC10370 = c3581.f17562;
                    if (abstractC10370 == abstractC10370.f31203.f37517.f18879) {
                        abstractC10370 = c3581.f17561.f17562;
                    }
                    BufferedWriter bufferedWriterNewBufferedWriter = C17229.newBufferedWriter(C8763.get(str, String.format("%s@%s[mode=%s,step=%s]_%d.dot", abstractC10370, Integer.valueOf(interfaceC3109.mo9483()), c12364.m29998(), c12364.f37061, Integer.valueOf(i))), new InterfaceC23579[0]);
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
                this.f20925 = C2609.m8239();
            } catch (IOException e) {
                C12171.m29640("Error occurred when dumping inference graph: " + e.getMessage());
                throw null;
            }
        } catch (Throwable th3) {
            this.f20925 = C2609.m8239();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m18347(AbstractC5144 abstractC5144, C23420 c23420, C10658 c10658, C0384 c0384) {
        char c;
        AbstractC4308 abstractC4308;
        boolean z;
        C1386 c1386;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        EnumC22756 enumC22756 = c23420.f75216;
        AbstractC4308 abstractC4309 = c23420.f75219;
        C0384 c0384Mo3857 = interfaceC3953.mo3857();
        AbstractC4308 abstractC4308M17523 = c10658.f32060;
        boolean zM12928 = abstractC4308M17523.m12928(c0384.f1817);
        C6319 c6319 = this.f20923;
        if (zM12928 && c0384Mo3857 != this.f20931) {
            abstractC4308M17523 = c6319.m17523(abstractC4308M17523);
            for (AbstractC4308 abstractC43010 : abstractC4308M17523.mo12938()) {
                if (abstractC43010.m12913(EnumC9454.TYPEVAR)) {
                    C8541 c8541 = (C8541) abstractC43010;
                    if (c8541.mo22227()) {
                        c0384.f1814 = c0384.f1814.m8246((AbstractC4308) c8541.mo2962(c0384.f1815.f20928, (Object) null));
                        c0384.f1817 = c0384.f1817.m8246(c8541);
                    }
                }
            }
        }
        AbstractC4308 abstractC4308M1868 = c0384.m1868(abstractC4308M17523);
        boolean zM12913 = abstractC4308M1868.m12913(EnumC9454.VOID);
        boolean z2 = this.f20921;
        C20661 c20661 = this.f20922;
        if (zM12913) {
            abstractC4308 = c20661.f66501;
        } else {
            if (abstractC4309.m12913(EnumC9454.NONE)) {
                if (abstractC4308M17523.mo12941()) {
                    abstractC4309 = abstractC4308M17523;
                } else {
                    abstractC4308 = c20661.f66526;
                }
            } else {
                if (!abstractC4308M1868.m12913(EnumC9454.UNDETVAR)) {
                    c = 1;
                    if (abstractC4309.m12928(c0384Mo3857.f1817)) {
                        abstractC4308M1868 = c0384.m1868(c0384Mo3857.m1860(abstractC5144, abstractC4308M17523, !enumC22756.mo16323()));
                    }
                } else {
                    C0779 c0779 = (C0779) abstractC4308M1868;
                    if (m18341(c0779, abstractC4309, c0384) && (z2 || !abstractC4309.mo12941())) {
                        c0384.m1863(C2609.of((Object) c0779.f14167), new C1386());
                        c0384.m1872();
                        if (c6319.m17556(interfaceC3953.mo3857().m1860(abstractC5144, c0779.m2971(), !enumC22756.mo16323()), interfaceC3953.mo3857().m1868(abstractC4309), c6319.f19598)) {
                            abstractC4309 = c20661.f66526;
                        }
                    }
                }
                if (z2 && abstractC4309.m12928(c0384Mo3857.f1817)) {
                    z = false;
                } else {
                    z = true;
                }
                C12171.m29641("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
                c1386 = new C1386();
                if (!interfaceC3953.mo3859(abstractC4308M1868, c0384Mo3857.m1868(abstractC4309), c1386) && (z2 || !c1386.m4870(EnumC20347.UNCHECKED))) {
                    return abstractC4308M17523;
                }
                C2609 c2609M1876 = c0384.m1876();
                AbstractC4308 abstractC43011 = c10658.f32060;
                C11576 c11576 = C11886.f35440;
                Object[] objArr = new Object[3];
                objArr[0] = c2609M1876;
                objArr[c] = abstractC43011;
                objArr[2] = abstractC4309;
                throw m18338(this.f20932.m16617(new C11576("compiler", "infer.no.conforming.instance.exists", objArr)));
            }
            c = 1;
            if (z2) {
                z = true;
            } else {
                z = true;
            }
            C12171.m29641("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
            c1386 = new C1386();
            if (!interfaceC3953.mo3859(abstractC4308M1868, c0384Mo3857.m1868(abstractC4309), c1386)) {
            }
            C2609 c2609M1877 = c0384.m1876();
            AbstractC4308 abstractC43012 = c10658.f32060;
            C11576 c11577 = C11886.f35440;
            Object[] objArr2 = new Object[3];
            objArr2[0] = c2609M1877;
            objArr2[c] = abstractC43012;
            objArr2[2] = abstractC4309;
            throw m18338(this.f20932.m16617(new C11576("compiler", "infer.no.conforming.instance.exists", objArr2)));
        }
        abstractC4309 = abstractC4308;
        c = 1;
        if (z2) {
            z = true;
        } else {
            z = true;
        }
        C12171.m29641("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
        c1386 = new C1386();
        if (!interfaceC3953.mo3859(abstractC4308M1868, c0384Mo3857.m1868(abstractC4309), c1386)) {
        }
        C2609 c2609M1878 = c0384.m1876();
        AbstractC4308 abstractC43013 = c10658.f32060;
        C11576 c11578 = C11886.f35440;
        Object[] objArr3 = new Object[3];
        objArr3[0] = c2609M1878;
        objArr3[c] = abstractC43013;
        objArr3[2] = abstractC4309;
        throw m18338(this.f20932.m16617(new C11576("compiler", "infer.no.conforming.instance.exists", objArr3)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m18341(C0779 c0779, AbstractC4308 abstractC4308, C0384 c0384) {
        boolean zMo12941 = abstractC4308.mo12941();
        C6319 c6319 = this.f20923;
        if (zMo12941) {
            Iterator it = c0779.m2963(EnumC19125.values()).iterator();
            while (it.hasNext()) {
                AbstractC4308 abstractC4308M17563 = c6319.m17563((AbstractC4308) it.next());
                if (abstractC4308M17563 != null && !abstractC4308M17563.m12913(EnumC9454.NONE)) {
                    return true;
                }
            }
            return false;
        }
        if (c6319.m17523(abstractC4308) == abstractC4308) {
            for (AbstractC4308 abstractC4309 : c0779.m2963(EnumC19125.f60275, EnumC19125.f60273)) {
                if (c6319.m17523(abstractC4309) != abstractC4309) {
                    return true;
                }
            }
            for (AbstractC4308 abstractC43010 : c0779.m2963(EnumC19125.f60273)) {
                for (AbstractC4308 abstractC43011 : c0779.m2963(EnumC19125.f60273)) {
                    if (abstractC43010 != abstractC43011 && !abstractC43010.m12928(c0384.f1817) && !abstractC43011.m12928(c0384.f1817)) {
                        for (C23069 c23069 : m18344(abstractC43010, abstractC43011)) {
                            if (!c6319.m17550((AbstractC4308) c23069.f74207, (AbstractC4308) c23069.f74208)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (abstractC4308.mo12917()) {
            Iterator it2 = c0779.m2963(EnumC19125.f60275, EnumC19125.f60273).iterator();
            while (it2.hasNext()) {
                AbstractC4308 abstractC4308M17527 = c6319.m17527(abstractC4308.f13890, (AbstractC4308) it2.next());
                if (abstractC4308M17527 != null && abstractC4308M17527.mo12920()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18352(C2609 c2609, C0384 c0384) {
        C6319 c6319;
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c6319 = this.f20923;
            if (!zHasNext) {
                break;
            }
            C0779 c0779 = (C0779) c0384.m1868((AbstractC4308) it.next());
            EnumC19125 enumC19125 = EnumC19125.f60272;
            C2609 c2609M2963 = c0779.m2963(enumC19125);
            boolean zM12903 = AbstractC4308.m12903(c2609M2963, c2609);
            C20661 c20661 = this.f20922;
            if (zM12903) {
                AbstractC19810 abstractC19810 = c0779.f14167.f13890;
                C4287 c4287 = new C4287(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC19810.f17562, null, abstractC19810.f17561);
                c4287.f17560 = new C8541(c4287, c6319.m17534(c0779.m2963(enumC19125)), c20661.f66522, C20743.f66779);
                c18837.m43511(c0779);
                c0779.m2972(c4287.f17560);
            } else if (c2609M2963.m8249()) {
                c0779.m2972(c6319.m17553(c2609M2963));
            } else {
                c0779.m2972(c20661.f66526);
            }
        }
        C2609 c26010 = c2609;
        Iterator it2 = c18837.iterator();
        while (it2.hasNext()) {
            C0779 c07710 = (C0779) ((AbstractC4308) it2.next());
            C8541 c8541 = (C8541) c07710.m2971();
            c8541.mo21267(c6319.m17553(c0384.m1857(c6319.m17484(c8541))));
            if (c8541.mo12939().mo12948()) {
                m18350(c07710, EnumC19125.f60272);
            }
            c26010 = c26010.f8241;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m18346(AbstractC4293 abstractC4293, AbstractC4308 abstractC4308, C2609 c2609, InterfaceC3953 interfaceC3953) {
        C6319 c6319 = this.f20923;
        if (c6319.m17523(abstractC4308) == abstractC4308) {
            return abstractC4308;
        }
        final AbstractC4308 abstractC4309 = abstractC4308.f13890.f17560;
        C2609 c2609Mo12938 = abstractC4309.mo12938();
        C2609 c2609M8243 = c2609Mo12938.m8243((Function) this.f20928);
        new LinkedHashMap();
        new HashMap();
        C12171.m29642(c2609 != null);
        C2609 c2609Mo12933 = c6319.m17538(abstractC4309).mo12933();
        int iM8245 = c2609Mo12933.m8245();
        int iM8246 = c2609.m8245();
        C5931 c5931 = this.f20932;
        if (iM8245 != iM8246) {
            interfaceC3953.mo1084(abstractC4293, c5931.m16617(C11886.f35463));
            return c6319.m17535(abstractC4308);
        }
        Iterator it = c2609Mo12933.iterator();
        while (it.hasNext()) {
            if (!c6319.m17550(c6319.m17488((AbstractC4308) it.next(), c2609Mo12938, c2609M8243), (AbstractC4308) c2609.f8240)) {
                interfaceC3953.mo1084(abstractC4293, c5931.m16617(C11886.m29013(abstractC4308)));
                return c6319.m17535(abstractC4308);
            }
            c2609 = c2609.f8241;
        }
        C2609 c2609Mo12939 = abstractC4308.mo12938();
        Iterator it2 = c2609M8243.iterator();
        while (it2.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it2.next());
            c0779.m2972((AbstractC4308) C5378.stream(c0779.m2963(EnumC19125.f60275)).filter(new Predicate() { // from class: l.ۛۤ֨
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return !((AbstractC4308) obj).m12928(abstractC4309.mo12938());
                }
            }).findFirst().orElse((AbstractC4308) c2609Mo12939.f8240));
            c2609Mo12939 = c2609Mo12939.f8241;
        }
        C18837 c18837 = new C18837();
        Iterator it3 = c2609M8243.iterator();
        while (it3.hasNext()) {
            C0779 c07710 = (C0779) ((AbstractC4308) it3.next());
            c18837.m43511(c07710.m2971() != null ? c07710.m2971() : c07710.f14167);
        }
        AbstractC4308 abstractC4308M17488 = c6319.m17488(abstractC4309, c2609Mo12938, c18837.m43517());
        if (!this.f20927.m36163(abstractC4308M17488)) {
            interfaceC3953.mo1084(abstractC4293, c5931.m16617(C11886.m29013(abstractC4308)));
        }
        interfaceC3953.mo3859(abstractC4308M17488, abstractC4308, c6319.f19598);
        return abstractC4308M17488;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18349(C0384 c0384, C1386 c1386) {
        HashMap map;
        boolean z = true;
        int i = 0;
        while (true) {
            map = this.f20924;
            if (!z || i >= 10000) {
                break;
            }
            try {
                Iterator it = c0384.f1814.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    C0779 c0779 = (C0779) ((AbstractC4308) it.next());
                    if (!c0779.f2881.isEmpty()) {
                        ((AbstractC21387) c0779.f2881.removeFirst()).mo34201(c0384, c1386);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 m18344(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C2609<AbstractC4308> c2609Of;
        AbstractC4308 abstractC4308M17492 = this.f20923.m17492(abstractC4308, abstractC4309);
        C20661 c20661 = this.f20922;
        if (abstractC4308M17492 == c20661.f66457 || abstractC4308M17492 == c20661.f66522) {
            return C2609.m8239();
        }
        abstractC4308M17492.getClass();
        if (abstractC4308M17492 instanceof C5843) {
            C5843 c5843 = (C5843) abstractC4308M17492;
            c2609Of = c5843.f64620.m8246(c5843.f64618);
        } else {
            c2609Of = C2609.of((Object) abstractC4308M17492);
        }
        C18837 c18837 = new C18837();
        for (AbstractC4308 abstractC43010 : c2609Of) {
            if (abstractC43010.mo12917()) {
                c18837.m43511(new C23069(m18335(abstractC4308, abstractC43010), m18335(abstractC4309, abstractC43010)));
            }
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m18335(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        boolean zM12913 = abstractC4309.m12913(EnumC9454.ARRAY);
        C6319 c6319 = this.f20923;
        if (zM12913) {
            return new C5138(m18335(c6319.m17515(abstractC4308), c6319.m17515(abstractC4309)), this.f20922.f66505);
        }
        return c6319.m17527(abstractC4309.f13890, abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18353(EnumC3042 enumC3042, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386) {
        C22092 c22092 = new C22092(this, enumC3042, abstractC4308, abstractC4309);
        HashMap map = this.f20924;
        Boolean boolValueOf = (Boolean) map.get(c22092);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(enumC3042.mo9295(abstractC4308, abstractC4309, c1386, this.f20923));
            map.put(c22092, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18350(C0779 c0779, EnumC19125 enumC19125) {
        int i = C1631.f5723[enumC19125.ordinal()];
        C5931 c5931 = this.f20932;
        if (i == 1) {
            AbstractC4308 abstractC4308 = c0779.f14167;
            C2609 c2609M2963 = c0779.m2963(enumC19125);
            C11576 c11576 = C11886.f35440;
            throw m18338(c5931.m16617(new C11576("compiler", "incompatible.eq.bounds", abstractC4308, c2609M2963)));
        }
        if (i == 2) {
            throw new AssertionError("this case shouldn't happen");
        }
        if (i != 3) {
            return;
        }
        AbstractC4308 abstractC4309 = c0779.f14167;
        C2609 c2609M2964 = c0779.m2963(enumC19125);
        C11576 c11577 = C11886.f35440;
        throw m18338(c5931.m16617(new C11576("compiler", "incompatible.upper.bounds", abstractC4309, c2609M2964)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18351(C0779 c0779, EnumC19125 enumC19125, EnumC19125 enumC19126) {
        AbstractC4308 abstractC4308 = c0779.f14167;
        C11576 c11576M18337 = m18337(enumC19125, c0779.m2963(enumC19125));
        C11576 c11576M18338 = m18337(enumC19126, c0779.m2963(enumC19126));
        C11576 c11576 = C11886.f35440;
        throw m18338(this.f20932.m16617(new C11576("compiler", "incompatible.bounds", abstractC4308, c11576M18337, c11576M18338)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11576 m18337(EnumC19125 enumC19125, C2609 c2609) {
        int i = C1631.f5723[enumC19125.ordinal()];
        if (i == 1) {
            C11576 c11576 = C11886.f35440;
            return new C11576("compiler", "eq.bounds", c2609);
        }
        if (i == 2) {
            C11576 c11577 = C11886.f35440;
            return new C11576("compiler", "lower.bounds", c2609);
        }
        if (i == 3) {
            C11576 c11578 = C11886.f35440;
            return new C11576("compiler", "upper.bounds", c2609);
        }
        throw new AssertionError("can't get to this place");
    }
}
