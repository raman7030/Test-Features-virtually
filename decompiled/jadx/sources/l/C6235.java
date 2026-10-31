package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 67L9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6235 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C4314 f19089 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19914 f19090;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2446 f19091;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20661 f19092;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2002 f19093;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10469 f19094 = new C10469(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5931 f19095;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22364 f19096;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f19097;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6136 f19098;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14127 f19099;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6235 m17162(C2903 c2903) {
        C6235 c6235 = (C6235) c2903.m8838(f19089);
        return c6235 == null ? new C6235(c2903) : c6235;
    }

    public C6235(C2903 c2903) {
        c2903.m8841(f19089, this);
        this.f19098 = C6136.m17057(c2903);
        this.f19092 = C20661.m47250(c2903);
        this.f19097 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f19096 = C22364.m50099(c2903);
        this.f19090 = C19914.m45820(c2903);
        this.f19095 = C5931.m16615(c2903);
        this.f19093 = C2002.m6532(c2903);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0052 m17169(AbstractC10370 abstractC10370) {
        C0052 c0052M47258 = this.f19092.m47258(abstractC10370);
        m17171(c0052M47258);
        return c0052M47258;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17171(C0052 c0052) {
        EnumC1296 enumC1296 = c0052.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4581;
        if (enumC1296 != enumC1297 && c0052.f927 == null && c0052.f914 == null && m17168(c0052).isEmpty()) {
            c0052.f17559 = enumC1297;
        }
        if (c0052.f17559 != enumC1297) {
            C14163 c14163 = c0052.f911;
            if (c14163.f42770 == null && c14163.f42766 == null) {
                m17167(c0052);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17170() {
        for (C0052 c0052 : m17168(null)) {
            if (c0052.f17559 != EnumC1296.f4581) {
                C14163 c14163 = c0052.f911;
                if (c14163.f42770 == null && c14163.f42766 == null) {
                    m17167(c0052);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0052 m17172() {
        C0052 c0052M17161;
        try {
            InterfaceC18278 interfaceC18278M17163 = m17163(EnumC21101.SOURCE_PATH, EnumC16866.SOURCE);
            EnumC21101 enumC21101 = EnumC21101.CLASS_OUTPUT;
            InterfaceC18278 interfaceC18278M17164 = m17163(enumC21101, EnumC16866.CLASS);
            if (interfaceC18278M17163 == null) {
                interfaceC18278M17163 = interfaceC18278M17164;
            } else if (interfaceC18278M17164 != null) {
                interfaceC18278M17163 = this.f19090.m45830(interfaceC18278M17163, interfaceC18278M17164);
            }
            if (interfaceC18278M17163 == null) {
                c0052M17161 = this.f19092.f66447;
            } else {
                c0052M17161 = m17161(interfaceC18278M17163);
            }
            if (c0052M17161.f924 == null) {
                c0052M17161.f914 = enumC21101;
                return c0052M17161;
            }
            c0052M17161.f926 = enumC21101;
            return c0052M17161;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0052 m17161(InterfaceC18278 interfaceC18278) {
        AbstractC10370 abstractC10370M13323;
        int i = C12585.f37948[interfaceC18278.mo21321().ordinal()];
        C20661 c20661 = this.f19092;
        C6136 c6136 = this.f19098;
        if (i == 1) {
            abstractC10370M13323 = C4541.m13323((C4541) this.f19099.f42611, interfaceC18278);
            if (abstractC10370M13323 == null) {
                throw new C21325(c20661.m47262(c6136.f18843, c20661.f66520), interfaceC18278, this.f19095.m16617(C11886.f35456), this.f19095, this.f19093);
            }
        } else {
            if (i != 2) {
                C12171.m29636();
                throw null;
            }
            try {
                abstractC10370M13323 = c6136.f18880.m30652(m17165(interfaceC18278));
            } catch (IOException | C15850 unused) {
                abstractC10370M13323 = c6136.f18855;
            }
        }
        C0052 c0052M47258 = c20661.m47258(abstractC10370M13323);
        C14163 c14163 = c0052M47258.f911;
        if (c14163.f42766 == null) {
            c14163.f42766 = interfaceC18278;
            EnumC21101 enumC21101 = EnumC21101.PATCH_MODULE_PATH;
            InterfaceC11223 interfaceC11223 = this.f19097;
            boolean zMo1710 = interfaceC11223.mo1710(enumC21101);
            C19914 c19914 = this.f19090;
            if (zMo1710 && abstractC10370M13323 != c6136.f18855) {
                InterfaceC2050 interfaceC2050Mo1714 = interfaceC11223.mo1714(enumC21101, abstractC10370M13323.toString());
                c0052M47258.f924 = interfaceC2050Mo1714;
                if (interfaceC2050Mo1714 != null) {
                    EnumC21101 enumC21102 = EnumC21101.CLASS_OUTPUT;
                    EnumC16866 enumC16866 = EnumC16866.CLASS;
                    InterfaceC18278 interfaceC18278M17163 = m17163(enumC21102, enumC16866);
                    InterfaceC18278 interfaceC18278M17164 = m17163(c0052M47258.f924, enumC16866);
                    if (interfaceC18278M17164 != null) {
                        interfaceC18278M17163 = interfaceC18278M17163 == null ? interfaceC18278M17164 : c19914.m45830(interfaceC18278M17164, interfaceC18278M17163);
                    }
                    InterfaceC18278 interfaceC18278M17165 = m17163(c0052M47258.f924, EnumC16866.SOURCE);
                    if (interfaceC18278M17165 != null) {
                        interfaceC18278M17163 = interfaceC18278M17163 == null ? interfaceC18278M17165 : c19914.m45830(interfaceC18278M17165, interfaceC18278M17163);
                    }
                    if (interfaceC18278M17163 != null) {
                        c0052M47258.f911.f42766 = interfaceC18278M17163;
                    }
                }
            }
            c0052M47258.f17564 = InterfaceC6403.f19811;
            c19914.m45831(c0052M47258.f911);
        }
        return c0052M47258;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m17165(InterfaceC18278 interfaceC18278) throws IOException {
        if (this.f19091 == null) {
            this.f19091 = new C2446();
        }
        C2446 c2446 = this.f19091;
        c2446.getClass();
        InputStream inputStreamMo20795 = interfaceC18278.mo20795();
        try {
            String strM7892 = c2446.m7892(inputStreamMo20795);
            if (inputStreamMo20795 != null) {
                inputStreamMo20795.close();
            }
            return strM7892;
        } catch (Throwable th) {
            if (inputStreamMo20795 != null) {
                try {
                    inputStreamMo20795.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC18278 m17163(InterfaceC2050 interfaceC2050, EnumC16866 enumC16866) {
        if (interfaceC2050 == null) {
            return null;
        }
        InterfaceC11223 interfaceC11223 = this.f19097;
        if (interfaceC11223.mo1710(interfaceC2050)) {
            return interfaceC11223.mo1707(interfaceC2050, this.f19098.f18843.toString(), enumC16866);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C2609 m17168(C0052 c0052) {
        C11576 c11576;
        C18837 c18837 = new C18837();
        HashMap map = new HashMap();
        EnumC21101 enumC21101 = EnumC21101.MODULE_SOURCE_PATH;
        InterfaceC11223 interfaceC11223 = this.f19097;
        boolean zMo1710 = interfaceC11223.mo1710(enumC21101);
        while (true) {
            C10469 c10469 = this.f19094;
            if (c10469.hasNext()) {
                c10469.hasNext();
                Set<InterfaceC2050> set = c10469.f31421;
                if (set != null) {
                    c10469.f31421 = null;
                    map.clear();
                    for (InterfaceC2050 interfaceC2050 : set) {
                        try {
                            AbstractC10370 abstractC10370M30652 = this.f19098.f18880.m30652(interfaceC11223.mo1717(interfaceC2050));
                            if (map.put(abstractC10370M30652, interfaceC2050) == null) {
                                C0052 c0052M47258 = this.f19092.m47258(abstractC10370M30652);
                                if (c0052M47258.f927 == null && c0052M47258.f914 == null) {
                                    EnumC21101 enumC21102 = EnumC21101.PATCH_MODULE_PATH;
                                    if (interfaceC11223.mo1710(enumC21102) && c0052M47258.f924 == null) {
                                        InterfaceC2050 interfaceC2050Mo1714 = interfaceC11223.mo1714(enumC21102, c0052M47258.f17562.toString());
                                        c0052M47258.f924 = interfaceC2050Mo1714;
                                        if (interfaceC2050Mo1714 != null && zMo1710) {
                                            EnumC21101 enumC21103 = EnumC21101.CLASS_OUTPUT;
                                            if (interfaceC11223.mo1710(enumC21103)) {
                                                c0052M47258.f926 = interfaceC11223.mo1714(enumC21103, c0052M47258.f17562.toString());
                                            }
                                        }
                                    }
                                    if (c10469.f31419 == EnumC21101.MODULE_SOURCE_PATH) {
                                        c0052M47258.f927 = interfaceC2050;
                                        EnumC21101 enumC21104 = EnumC21101.CLASS_OUTPUT;
                                        if (interfaceC11223.mo1710(enumC21104)) {
                                            c0052M47258.f914 = interfaceC11223.mo1714(enumC21104, c0052M47258.f17562.toString());
                                        }
                                    } else {
                                        c0052M47258.f914 = interfaceC2050;
                                    }
                                    EnumC21101 enumC21105 = c10469.f31419;
                                    if (enumC21105 == EnumC21101.SYSTEM_MODULES || enumC21105 == EnumC21101.UPGRADE_MODULE_PATH) {
                                        c0052M47258.f17563 |= 9007199254740992L;
                                    }
                                    if (c0052 == null || (c0052 == c0052M47258 && (c0052M47258.f927 != null || c0052M47258.f914 != null))) {
                                        c18837.m43511(c0052M47258);
                                    }
                                }
                            } else {
                                C22364 c22364 = this.f19096;
                                int i = C12585.f37949[c10469.f31419.ordinal()];
                                if (i == 1) {
                                    c11576 = C11886.f35509;
                                } else if (i == 2) {
                                    c11576 = C11886.f35502;
                                } else if (i == 3) {
                                    c11576 = C11886.f35450;
                                } else if (i == 4) {
                                    c11576 = C11886.f35446;
                                } else {
                                    throw new AssertionError();
                                }
                                C12281 c12281 = C6241.f19132;
                                c22364.m7276(new C12281("compiler", "duplicate.module.on.path", c11576, abstractC10370M30652));
                            }
                        } catch (IOException unused) {
                        }
                    }
                    if (c0052 != null && c18837.m43518()) {
                        return c18837.m43517();
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                return c18837.m43517();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17167(C0052 c0052) {
        InterfaceC2050 interfaceC2050;
        try {
            InterfaceC2050 interfaceC2051 = c0052.f926;
            EnumC16866 enumC16866 = EnumC16866.CLASS;
            InterfaceC18278 interfaceC18278M17163 = m17163(interfaceC2051, enumC16866);
            InterfaceC18278 interfaceC18278M17164 = m17163(c0052.f924, enumC16866);
            C19914 c19914 = this.f19090;
            if (interfaceC18278M17164 != null) {
                interfaceC18278M17163 = interfaceC18278M17163 == null ? interfaceC18278M17164 : c19914.m45830(interfaceC18278M17164, interfaceC18278M17163);
            }
            InterfaceC2050 interfaceC2052 = c0052.f924;
            EnumC16866 enumC16867 = EnumC16866.SOURCE;
            InterfaceC18278 interfaceC18278M17165 = m17163(interfaceC2052, enumC16867);
            if (interfaceC18278M17165 != null) {
                interfaceC18278M17163 = interfaceC18278M17163 == null ? interfaceC18278M17165 : c19914.m45830(interfaceC18278M17165, interfaceC18278M17163);
            }
            if (interfaceC18278M17163 == null) {
                interfaceC18278M17163 = m17163(c0052.f914, enumC16866);
                InterfaceC18278 interfaceC18278M17166 = m17163(c0052.f927, enumC16867);
                if (interfaceC18278M17166 != null) {
                    interfaceC18278M17163 = interfaceC18278M17163 == null ? interfaceC18278M17166 : c19914.m45830(interfaceC18278M17166, interfaceC18278M17163);
                }
            }
            if (interfaceC18278M17163 == null) {
                if (((c0052.f927 != null || (interfaceC2050 = c0052.f914) == null) ? null : this.f19097.mo1717(interfaceC2050)) != null) {
                    c0052.f911.f42766 = null;
                    c0052.f17563 |= 4503599627370496L;
                    return;
                } else {
                    c0052.f17559 = EnumC1296.f4581;
                    return;
                }
            }
            C14163 c14163 = c0052.f911;
            c14163.f42766 = interfaceC18278M17163;
            c14163.f17564 = new C13290(this, c0052);
        } catch (IOException unused) {
            c0052.f17559 = EnumC1296.f4581;
        }
    }
}
