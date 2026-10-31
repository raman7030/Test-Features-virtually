package l;

import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩶ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19914 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C4314 f64330 = new C4314();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20661 f64331;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f64332;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13395 f64333;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f64334;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f64335;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC17926 f64337;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f64338;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C22364 f64339;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f64340;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f64341;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC2050 f64342;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6136 f64344;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20515 f64345;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f64347;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20002 f64348;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5931 f64350;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2002 f64351;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC6403 f64349 = InterfaceC6403.f19811;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f64346 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4236 f64336 = new C4236(11, this);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f64343 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6403 m45828() {
        return this.f64336;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19914 m45820(C2903 c2903) {
        C19914 c19914 = (C19914) c2903.m8838(f64330);
        return c19914 == null ? new C19914(c2903) : c19914;
    }

    public C19914(C2903 c2903) {
        AbstractC10370 abstractC10370M30652;
        c2903.m8841(f64330, this);
        this.f64348 = C20002.m46105(c2903);
        C6136 c6136M17057 = C6136.m17057(c2903);
        this.f64344 = c6136M17057;
        this.f64331 = C20661.m47250(c2903);
        InterfaceC11223 interfaceC11223 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f64340 = interfaceC11223;
        this.f64337 = AbstractC17926.m41937(c2903);
        if (interfaceC11223 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f64350 = C5931.m16615(c2903);
        C2002 c2002M6532 = C2002.m6532(c2903);
        this.f64351 = c2002M6532;
        this.f64339 = C22364.m50099(c2903);
        this.f64333 = C13395.m32391(c2903);
        C11781 c11781M28823 = C11781.m28823(c2903);
        this.f64338 = c11781M28823.m28832(EnumC0121.f1141);
        this.f64341 = c11781M28823.m28835("dev");
        this.f64335 = "source".equals(c11781M28823.m28824("-Xprefer"));
        this.f64332 = c11781M28823.m28832(EnumC0121.f1194);
        if (c11781M28823.m28831("failcomplete")) {
            abstractC10370M30652 = c6136M17057.f18880.m30652(c11781M28823.m28824("failcomplete"));
        } else {
            abstractC10370M30652 = null;
        }
        this.f64347 = abstractC10370M30652;
        EnumC5973.m16741(c2903);
        C20515 c20515 = new C20515(null, new C2274(), c2002M6532);
        this.f64345 = c20515;
        c20515.setStackTrace(new StackTraceElement[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45825(final C19914 c19914, AbstractC5698 abstractC5698) {
        AbstractC17926 abstractC17926 = c19914.f64337;
        C13395 c13395 = c19914.f64333;
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 == EnumC1296.f4582) {
            try {
                C14163 c14163 = (C14163) abstractC5698;
                abstractC17926.mo25113(c14163, EnumC12075.CLASS_READER);
                c13395.m32410();
                c14163.f42762 = new C23895((AbstractC5698) c14163);
                m45821(c14163.f17561);
                c19914.m45826(c14163);
                c19914.m45831(c14163);
                c13395.m32412();
                abstractC17926.mo25112();
            } catch (Throwable th) {
                c13395.m32412();
                abstractC17926.mo25112();
                throw th;
            }
        } else if (enumC1296 == EnumC1296.f4579) {
            try {
                c19914.m45822((C7814) abstractC5698);
            } catch (IOException e) {
                C20515 c20515 = new C20515(abstractC5698, new Supplier() { // from class: l.֡ۘ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C5931 c5931 = this.f1336.f64350;
                        String localizedMessage = e.getLocalizedMessage();
                        C11576 c11576 = C11886.f35440;
                        return c5931.m16617(new C11576("compiler", "exception.message", localizedMessage));
                    }
                }, c19914.f64351);
                c20515.m46990(e);
                throw c20515;
            }
        }
        if (c19914.f64348.f64751) {
            return;
        }
        c13395.m32413();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45821(AbstractC5698 abstractC5698) {
        if (abstractC5698.f17559 != EnumC1296.f4579) {
            m45821(abstractC5698.f17561);
        }
        abstractC5698.mo16101();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45826(C14163 c14163) {
        AbstractC5698 abstractC5698 = c14163.f17561;
        if (abstractC5698.f17559 == EnumC1296.f4579) {
            for (AbstractC10370 abstractC10370 : C12780.m31092(C12780.m31093(c14163.f17562))) {
                AbstractC5698 abstractC5698Mo20478 = abstractC5698.mo16064().mo20478(abstractC10370, (Predicate) null);
                if (abstractC5698Mo20478 == null) {
                    abstractC5698Mo20478 = this.f64331.m47270(c14163.m16089().f24147, AbstractC19810.m45552(abstractC10370, abstractC5698));
                }
                if (abstractC5698Mo20478 != null) {
                    abstractC5698Mo20478.mo16101();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45831(C14163 c14163) {
        C20002 c20002 = this.f64348;
        AbstractC10370 abstractC10370 = c14163.f42767;
        C2002 c2002 = this.f64351;
        if (this.f64347 == abstractC10370) {
            throw new C20515(c14163, new Supplier() { // from class: l.ᩴۘ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f57343.f64350.m16617(C11886.f35505);
                }
            }, c2002);
        }
        InterfaceC18278 interfaceC18278 = c14163.f42766;
        int i = 1;
        if (interfaceC18278 != null) {
            InterfaceC18278 interfaceC18279 = this.f64346;
            AbstractC5698 abstractC5698 = c14163.f17561;
            try {
                try {
                    if (c20002.f64751) {
                        C12171.m29640("Filling " + interfaceC18278.toUri() + " during " + interfaceC18279);
                        throw null;
                    }
                    this.f64346 = interfaceC18278;
                    if (this.f64338) {
                        this.f64339.m50123("loading", interfaceC18278.getName());
                    }
                    if (interfaceC18278.mo21321() == EnumC16866.CLASS) {
                        c20002.m46121(c14163);
                        c14163.f17563 = c14163.f17563;
                    } else if (!this.f64349.mo7078()) {
                        this.f64349.mo7076(c14163);
                    } else {
                        throw new IllegalStateException("Source completer required to read " + interfaceC18278.toUri());
                    }
                    this.f64346 = interfaceC18279;
                    return;
                } catch (C21325 e) {
                    c14163.f17561 = abstractC5698;
                    AbstractC14016 abstractC14016 = c14163.f42762;
                    C23134 c23134 = new C23134(2);
                    abstractC14016.getClass();
                    C19846.forEach(abstractC14016.mo20475(c23134, EnumC1317.RECURSIVE), new C19208());
                    c14163.f42767 = abstractC10370;
                    c14163.f17562 = C12780.m31093(abstractC10370);
                    c14163.m33817();
                    throw e;
                }
            } catch (Throwable th) {
                this.f64346 = interfaceC18279;
                throw th;
            }
        }
        C3809 c3809 = new C3809(i, this, c14163);
        if (!this.f64341) {
            throw new C20515(c14163, c3809, c2002);
        }
        C20515 c20515 = this.f64345;
        c20515.f66102 = c14163;
        c20515.m46991(c3809);
        throw c20515;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 m45829(final C0052 c0052, final AbstractC10370 abstractC10370) {
        C12171.m29637(c0052);
        AbstractC10370 abstractC10370M26172 = abstractC10370.m26172(0, abstractC10370.m26170((byte) 46));
        C20661 c20661 = this.f64331;
        C7814 c7814M47272 = c20661.m47272(c0052, abstractC10370M26172);
        C12171.m29638(c7814M47272.f24147, new Supplier() { // from class: l.ۘۘ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return "msym=" + c0052 + "; flatName=" + ((Object) abstractC10370);
            }
        });
        boolean z = c20661.m47270(c7814M47272.f24147, abstractC10370) == null;
        C14163 c14163M47260 = c20661.m47260(c7814M47272.f24147, abstractC10370);
        if (c14163M47260.f42762 != null) {
            return c14163M47260;
        }
        try {
            c14163M47260.mo16101();
            return c14163M47260;
        } catch (C20515 e) {
            if (z) {
                c20661.m47275(c7814M47272.f24147, abstractC10370);
                e.f66104.m6534(c14163M47260);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m45830(InterfaceC18278 interfaceC18278, InterfaceC18278 interfaceC18279) {
        if (this.f64335) {
            return interfaceC18278.mo21321() == EnumC16866.SOURCE ? interfaceC18278 : interfaceC18279;
        }
        return interfaceC18278.mo20798() > interfaceC18279.mo20798() ? interfaceC18278 : interfaceC18279;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45824(C7814 c7814, boolean z) {
        char c;
        EnumC16866 enumC16866 = EnumC16866.CLASS;
        EnumC16866 enumC16867 = EnumC16866.SOURCE;
        EnumSet enumSetOf = EnumSet.of(enumC16866, enumC16867);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf);
        enumSetCopyOf.remove(enumC16867);
        boolean zIsEmpty = enumSetCopyOf.isEmpty();
        EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) enumSetOf);
        enumSetCopyOf2.remove(enumC16866);
        boolean zIsEmpty2 = enumSetCopyOf2.isEmpty();
        InterfaceC11223 interfaceC11223 = this.f64340;
        boolean z2 = z && interfaceC11223.mo1710(EnumC21101.SOURCE_PATH);
        if (this.f64338 && this.f64343) {
            this.f64343 = false;
            if (interfaceC11223 instanceof InterfaceC23922) {
                InterfaceC23922 interfaceC23922 = (InterfaceC23922) interfaceC11223;
                C22364 c22364 = this.f64339;
                if (!z2 || zIsEmpty2) {
                    if (!zIsEmpty2) {
                        C2609 c2609M8239 = C2609.m8239();
                        Iterator it = interfaceC23922.mo28938(EnumC21101.CLASS_PATH).iterator();
                        while (it.hasNext()) {
                            c2609M8239 = c2609M8239.m8246((InterfaceC20758) it.next());
                        }
                        c22364.m50123("sourcepath", c2609M8239.m8250().m8241(","));
                    }
                    c = 0;
                } else {
                    C2609 c2609M82310 = C2609.m8239();
                    Iterator it2 = interfaceC23922.mo28938(EnumC21101.SOURCE_PATH).iterator();
                    while (it2.hasNext()) {
                        c2609M82310 = c2609M82310.m8246((InterfaceC20758) it2.next());
                    }
                    c = 0;
                    c22364.m50123("sourcepath", c2609M82310.m8250().m8241(","));
                }
                if (!zIsEmpty) {
                    C2609 c2609M82311 = C2609.m8239();
                    Iterator it3 = interfaceC23922.mo28938(EnumC21101.PLATFORM_CLASS_PATH).iterator();
                    while (it3.hasNext()) {
                        c2609M82311 = c2609M82311.m8246((InterfaceC20758) it3.next());
                    }
                    Iterator it4 = interfaceC23922.mo28938(EnumC21101.CLASS_PATH).iterator();
                    while (it4.hasNext()) {
                        c2609M82311 = c2609M82311.m8246((InterfaceC20758) it4.next());
                    }
                    Object[] objArr = new Object[1];
                    objArr[c] = c2609M82311.m8250().m8241(",");
                    c22364.m50123("classpath", objArr);
                }
            }
        }
        String string = c7814.f24143.toString();
        if (!zIsEmpty2 && !z2) {
            InterfaceC2050 interfaceC2050 = EnumC21101.CLASS_PATH;
            m45823(c7814, interfaceC2050, m45827(interfaceC2050, c7814, string, enumSetOf));
            return;
        }
        if (!zIsEmpty) {
            InterfaceC2050 interfaceC2051 = EnumC21101.CLASS_PATH;
            m45823(c7814, interfaceC2051, m45827(interfaceC2051, c7814, string, enumSetCopyOf));
        }
        if (zIsEmpty2) {
            return;
        }
        InterfaceC2050 interfaceC2052 = EnumC21101.SOURCE_PATH;
        m45823(c7814, interfaceC2052, m45827(interfaceC2052, c7814, string, enumSetCopyOf2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45822(C7814 c7814) {
        AbstractC14016 abstractC14016 = c7814.f24145;
        AbstractC10370 abstractC10370 = c7814.f24143;
        if (abstractC14016 == null) {
            c7814.f24145 = new C10490(c7814);
        }
        C0052 c0052 = c7814.f24147;
        C12171.m29638(c0052, new C2398(c7814, 1));
        c0052.mo16101();
        if (c0052 == this.f64331.f66465) {
            this.f64334 = false;
            if (this.f64332) {
                m45824(c7814, true);
                this.f64334 = true;
                InterfaceC2050 interfaceC2050 = EnumC21101.PLATFORM_CLASS_PATH;
                m45823(c7814, interfaceC2050, m45827(interfaceC2050, c7814, abstractC10370.toString(), EnumSet.of(EnumC16866.CLASS)));
                return;
            }
            InterfaceC2050 interfaceC2051 = EnumC21101.PLATFORM_CLASS_PATH;
            m45823(c7814, interfaceC2051, m45827(interfaceC2051, c7814, abstractC10370.toString(), EnumSet.of(EnumC16866.CLASS)));
            m45824(c7814, true);
            return;
        }
        if (c0052.f914 != EnumC21101.CLASS_PATH) {
            EnumC16866 enumC16866 = EnumC16866.CLASS;
            EnumC16866 enumC16867 = EnumC16866.SOURCE;
            EnumSet enumSetOf = EnumSet.of(enumC16866, enumC16867);
            EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf);
            enumSetCopyOf.remove(enumC16867);
            boolean zIsEmpty = enumSetCopyOf.isEmpty();
            EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) enumSetOf);
            enumSetCopyOf2.remove(enumC16866);
            boolean zIsEmpty2 = enumSetCopyOf2.isEmpty();
            String string = abstractC10370.toString();
            InterfaceC2050 interfaceC2052 = c0052.f914;
            InterfaceC2050 interfaceC2053 = c0052.f927;
            InterfaceC2050 interfaceC2054 = c0052.f924;
            InterfaceC2050 interfaceC2055 = c0052.f926;
            boolean z = this.f64334;
            try {
                this.f64334 = false;
                if (!zIsEmpty && interfaceC2055 != null) {
                    m45823(c7814, interfaceC2055, m45827(interfaceC2055, c7814, string, enumSetCopyOf));
                }
                if ((!zIsEmpty || !zIsEmpty2) && interfaceC2054 != null) {
                    EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC16866.class);
                    enumSetNoneOf.addAll(enumSetCopyOf);
                    enumSetNoneOf.addAll(enumSetCopyOf2);
                    m45823(c7814, interfaceC2054, m45827(interfaceC2054, c7814, string, enumSetNoneOf));
                }
                this.f64334 = true;
                if (!zIsEmpty && interfaceC2052 != null) {
                    m45823(c7814, interfaceC2052, m45827(interfaceC2052, c7814, string, enumSetCopyOf));
                }
                if (!zIsEmpty2 && interfaceC2053 != null) {
                    m45823(c7814, interfaceC2053, m45827(interfaceC2053, c7814, string, enumSetCopyOf2));
                }
                return;
            } finally {
                this.f64334 = z;
            }
        }
        m45824(c7814, c0052.f927 == EnumC21101.SOURCE_PATH);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45823(C7814 c7814, InterfaceC2050 interfaceC2050, C5096 c5096) {
        C14163 c14163M47261;
        InterfaceC18278 interfaceC18278;
        this.f64342 = interfaceC2050;
        Iterator it = c5096.iterator();
        while (true) {
            C0862 c0862 = (C0862) it;
            if (!c0862.hasNext()) {
                return;
            }
            InterfaceC18278 interfaceC18279 = (InterfaceC18278) c0862.next();
            int i = C7918.f24511[interfaceC18279.mo21321().ordinal()];
            if (i == 2 || i == 3) {
                InterfaceC2050 interfaceC2051 = this.f64342;
                InterfaceC11223 interfaceC11223 = this.f64340;
                String strMo1703 = interfaceC11223.mo1703(interfaceC2051, interfaceC18279);
                String strSubstring = strMo1703.substring(strMo1703.lastIndexOf(".") + 1);
                if (EnumC3503.m10687(strSubstring) || strSubstring.equals("package-info")) {
                    if ((c7814.f17563 & X931RNG.BLOCK128_RESEED_MAX) == 0) {
                        for (AbstractC5698 abstractC5698 = c7814; abstractC5698 != null && abstractC5698.f17559 == EnumC1296.f4579; abstractC5698 = abstractC5698.f17561) {
                            abstractC5698.f17563 |= X931RNG.BLOCK128_RESEED_MAX;
                        }
                    }
                    int i2 = interfaceC18279.mo21321() == EnumC16866.CLASS ? 33554432 : 67108864;
                    String strMo1704 = interfaceC11223.mo1703(this.f64342, interfaceC18279);
                    String strSubstring2 = strMo1704.substring(strMo1704.lastIndexOf(".") + 1);
                    C6136 c6136 = this.f64344;
                    AbstractC10370 abstractC10370M30652 = c6136.f18880.m30652(strSubstring2);
                    boolean z = abstractC10370M30652 == c6136.f18876;
                    if (z) {
                        c14163M47261 = c7814.f24146;
                    } else {
                        c14163M47261 = (C14163) ((C10490) c7814.f24145).m26378(abstractC10370M30652, null).f44963;
                    }
                    if (c14163M47261 == null) {
                        c14163M47261 = this.f64331.m47261(c7814.f24147, abstractC10370M30652, c7814);
                        if (c14163M47261.f42766 == null) {
                            c14163M47261.f42766 = interfaceC18279;
                        }
                        if (z) {
                            c7814.f24146 = c14163M47261;
                        } else if (c14163M47261.f17561 == c7814) {
                            c7814.f24145.mo26382(c14163M47261);
                        }
                    } else if (!this.f64334 && (interfaceC18278 = c14163M47261.f42766) != null) {
                        long j = c14163M47261.f17563;
                        if ((((long) i2) & j) == 0 && (j & 100663296) != 0) {
                            c14163M47261.f42766 = m45830(interfaceC18279, interfaceC18278);
                        }
                    }
                    c14163M47261.f17563 = ((long) i2) | c14163M47261.f17563;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5096 m45827(InterfaceC2050 interfaceC2050, C7814 c7814, String str, EnumSet enumSet) {
        return new C5096(this, this.f64340.mo1702(interfaceC2050, str, (Set) EnumSet.allOf(EnumC16866.class), false), c7814, enumSet);
    }
}
