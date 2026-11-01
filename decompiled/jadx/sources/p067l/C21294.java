package p067l;

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
public final class C21294 {

    /* JADX INFO: renamed from: ᩸ */
    public static final C6468 f66968 = new C6468();

    /* JADX INFO: renamed from: ֡ */
    public C22004 f66969;

    /* JADX INFO: renamed from: ֨ */
    public boolean f66970;

    /* JADX INFO: renamed from: ֫ */
    public final C15099 f66971;

    /* JADX INFO: renamed from: ۖ */
    public boolean f66972;

    /* JADX INFO: renamed from: ۘ */
    public boolean f66973;

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC19405 f66975;

    /* JADX INFO: renamed from: ۠ */
    public boolean f66976;

    /* JADX INFO: renamed from: ۡ */
    public final C23623 f66977;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC13035 f66978;

    /* JADX INFO: renamed from: ۧ */
    public boolean f66979;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC4317 f66980;

    /* JADX INFO: renamed from: ܺ */
    public final C8200 f66982;

    /* JADX INFO: renamed from: ܽ */
    public final C21865 f66983;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC12224 f66985;

    /* JADX INFO: renamed from: ᩴ */
    public C21378 f66986;

    /* JADX INFO: renamed from: ᩷ */
    public C8005 f66988;

    /* JADX INFO: renamed from: ᩻ */
    public final C4271 f66989;

    /* JADX INFO: renamed from: ᩵ */
    public InterfaceC8453 f66987 = InterfaceC8453.f22683;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC19740 f66984 = null;

    /* JADX INFO: renamed from: ۚ */
    public final C6395 f66974 = new C6395(11, this);

    /* JADX INFO: renamed from: ܶ */
    public boolean f66981 = true;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8453 m48140() {
        return this.f66974;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21294 m48132(C5127 c5127) {
        C21294 c21294 = (C21294) c5127.m10905(f66968);
        return c21294 == null ? new C21294(c5127) : c21294;
    }

    public C21294(C5127 c5127) {
        AbstractC12224 abstractC12224M32717;
        c5127.m10908(f66968, this);
        this.f66986 = C21378.m48420(c5127);
        C8200 c8200M18988 = C8200.m18988(c5127);
        this.f66982 = c8200M18988;
        this.f66969 = C22004.m49577(c5127);
        InterfaceC13035 interfaceC13035 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        this.f66978 = interfaceC13035;
        this.f66975 = AbstractC19405.m44186(c5127);
        if (interfaceC13035 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f66988 = C8005.m18541(c5127);
        C4271 c4271M8674 = C4271.m8674(c5127);
        this.f66989 = c4271M8674;
        this.f66977 = C23623.m52439(c5127);
        this.f66971 = C15099.m34493(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f66976 = c13565M30871.m30880(EnumC2483.f3917);
        this.f66979 = c13565M30871.m30883("dev");
        this.f66973 = "source".equals(c13565M30871.m30872("-Xprefer"));
        this.f66970 = c13565M30871.m30880(EnumC2483.f3970);
        if (c13565M30871.m30879("failcomplete")) {
            abstractC12224M32717 = c8200M18988.f21738.m32717(c13565M30871.m30872("failcomplete"));
        } else {
            abstractC12224M32717 = null;
        }
        this.f66985 = abstractC12224M32717;
        EnumC8045.m18667(c5127);
        C21865 c21865 = new C21865(null, new C4529(), c4271M8674);
        this.f66983 = c21865;
        c21865.setStackTrace(new StackTraceElement[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48137(final C21294 c21294, AbstractC7783 abstractC7783) {
        AbstractC19405 abstractC19405 = c21294.f66975;
        C15099 c15099 = c21294.f66971;
        EnumC3600 enumC3600 = abstractC7783.f20405;
        if (enumC3600 == EnumC3600.f7354) {
            try {
                C15828 c15828 = (C15828) abstractC7783;
                abstractC19405.mo27130(c15828, EnumC13844.CLASS_READER);
                c15099.m34512();
                c15828.f45850 = new C25078((AbstractC7783) c15828);
                m48133(c15828.f20407);
                c21294.m48138(c15828);
                c21294.m48143(c15828);
                c15099.m34514();
                abstractC19405.mo27129();
            } catch (Throwable th) {
                c15099.m34514();
                abstractC19405.mo27129();
                throw th;
            }
        } else if (enumC3600 == EnumC3600.f7351) {
            try {
                c21294.m48134((C9794) abstractC7783);
            } catch (IOException e) {
                C21865 c21865 = new C21865(abstractC7783, new Supplier() { // from class: l.֡ۘ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C8005 c8005 = this.f4111.f66988;
                        String localizedMessage = e.getLocalizedMessage();
                        C13370 c13370 = C13665.f38450;
                        return c8005.m18543(new C13370("compiler", "exception.message", localizedMessage));
                    }
                }, c21294.f66989);
                c21865.m49313(e);
                throw c21865;
            }
        }
        if (c21294.f66986.f67393) {
            return;
        }
        c15099.m34515();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48133(AbstractC7783 abstractC7783) {
        if (abstractC7783.f20405 != EnumC3600.f7351) {
            m48133(abstractC7783.f20407);
        }
        abstractC7783.mo18020();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m48138(C15828 c15828) {
        AbstractC7783 abstractC7783 = c15828.f20407;
        if (abstractC7783.f20405 == EnumC3600.f7351) {
            for (AbstractC12224 abstractC12224 : C14514.m33176(C14514.m33177(c15828.f20408))) {
                AbstractC7783 abstractC7783Mo22458 = abstractC7783.mo17983().mo22458(abstractC12224, (Predicate) null);
                if (abstractC7783Mo22458 == null) {
                    abstractC7783Mo22458 = this.f66969.m49597(c15828.m18008().f27063, AbstractC21195.m47863(abstractC12224, abstractC7783));
                }
                if (abstractC7783Mo22458 != null) {
                    abstractC7783Mo22458.mo18020();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48143(C15828 c15828) {
        C21378 c21378 = this.f66986;
        AbstractC12224 abstractC12224 = c15828.f45855;
        C4271 c4271 = this.f66989;
        if (this.f66985 == abstractC12224) {
            throw new C21865(c15828, new Supplier() { // from class: l.ᩴۘ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f60565.f66988.m18543(C13665.f38515);
                }
            }, c4271);
        }
        InterfaceC19740 interfaceC19740 = c15828.f45854;
        int i = 1;
        if (interfaceC19740 != null) {
            InterfaceC19740 interfaceC19741 = this.f66984;
            AbstractC7783 abstractC7783 = c15828.f20407;
            try {
                try {
                    if (c21378.f67393) {
                        C1446.m31702("Filling " + interfaceC19740.toUri() + " during " + interfaceC19741);
                        throw null;
                    }
                    this.f66984 = interfaceC19740;
                    if (this.f66976) {
                        this.f66977.m52463("loading", interfaceC19740.getName());
                    }
                    if (interfaceC19740.mo23287() == EnumC18398.CLASS) {
                        c21378.m48436(c15828);
                        c15828.f20409 = c15828.f20409;
                    } else if (!this.f66987.mo9173()) {
                        this.f66987.mo9171(c15828);
                    } else {
                        throw new IllegalStateException("Source completer required to read " + interfaceC19740.toUri());
                    }
                    this.f66984 = interfaceC19741;
                    return;
                } catch (C22635 e) {
                    c15828.f20407 = abstractC7783;
                    AbstractC15689 abstractC15689 = c15828.f45850;
                    C24355 c24355 = new C24355(2);
                    abstractC15689.getClass();
                    C21230.forEach(abstractC15689.mo22455(c24355, EnumC3620.RECURSIVE), new C20623());
                    c15828.f45855 = abstractC12224;
                    c15828.f20408 = C14514.m33177(abstractC12224);
                    c15828.m35949();
                    throw e;
                }
            } catch (Throwable th) {
                this.f66984 = interfaceC19741;
                throw th;
            }
        }
        C5988 c5988 = new C5988(i, this, c15828);
        if (!this.f66979) {
            throw new C21865(c15828, c5988, c4271);
        }
        C21865 c21865 = this.f66983;
        c21865.f68780 = c15828;
        c21865.m49314(c5988);
        throw c21865;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m48141(final C2417 c2417, final AbstractC12224 abstractC12224) {
        C1446.m31699(c2417);
        AbstractC12224 abstractC12224M28201 = abstractC12224.m28201(0, abstractC12224.m28199((byte) 46));
        C22004 c22004 = this.f66969;
        C9794 c9794M49599 = c22004.m49599(c2417, abstractC12224M28201);
        C1446.m31700(c9794M49599.f27063, new Supplier() { // from class: l.ۘۘ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return "msym=" + c2417 + "; flatName=" + ((Object) abstractC12224);
            }
        });
        boolean z = c22004.m49597(c9794M49599.f27063, abstractC12224) == null;
        C15828 c15828M49587 = c22004.m49587(c9794M49599.f27063, abstractC12224);
        if (c15828M49587.f45850 != null) {
            return c15828M49587;
        }
        try {
            c15828M49587.mo18020();
            return c15828M49587;
        } catch (C21865 e) {
            if (z) {
                c22004.m49602(c9794M49599.f27063, abstractC12224);
                e.f68782.m8676(c15828M49587);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 m48142(InterfaceC19740 interfaceC19740, InterfaceC19740 interfaceC19741) {
        if (this.f66973) {
            return interfaceC19740.mo23287() == EnumC18398.SOURCE ? interfaceC19740 : interfaceC19741;
        }
        return interfaceC19740.mo22779() > interfaceC19741.mo22779() ? interfaceC19740 : interfaceC19741;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48136(C9794 c9794, boolean z) {
        char c;
        EnumC18398 enumC18398 = EnumC18398.CLASS;
        EnumC18398 enumC18399 = EnumC18398.SOURCE;
        EnumSet enumSetOf = EnumSet.of(enumC18398, enumC18399);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf);
        enumSetCopyOf.remove(enumC18399);
        boolean zIsEmpty = enumSetCopyOf.isEmpty();
        EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) enumSetOf);
        enumSetCopyOf2.remove(enumC18398);
        boolean zIsEmpty2 = enumSetCopyOf2.isEmpty();
        InterfaceC13035 interfaceC13035 = this.f66978;
        boolean z2 = z && interfaceC13035.mo4108(EnumC22423.SOURCE_PATH);
        if (this.f66976 && this.f66981) {
            this.f66981 = false;
            if (interfaceC13035 instanceof InterfaceC25104) {
                InterfaceC25104 interfaceC25104 = (InterfaceC25104) interfaceC13035;
                C23623 c23623 = this.f66977;
                if (!z2 || zIsEmpty2) {
                    if (!zIsEmpty2) {
                        C4848 c4848M10283 = C4848.m10283();
                        Iterator it = interfaceC25104.mo30988(EnumC22423.CLASS_PATH).iterator();
                        while (it.hasNext()) {
                            c4848M10283 = c4848M10283.m10290((InterfaceC22097) it.next());
                        }
                        c23623.m52463("sourcepath", c4848M10283.m10294().m10285(","));
                    }
                    c = 0;
                } else {
                    C4848 c4848M10284 = C4848.m10283();
                    Iterator it2 = interfaceC25104.mo30988(EnumC22423.SOURCE_PATH).iterator();
                    while (it2.hasNext()) {
                        c4848M10284 = c4848M10284.m10290((InterfaceC22097) it2.next());
                    }
                    c = 0;
                    c23623.m52463("sourcepath", c4848M10284.m10294().m10285(","));
                }
                if (!zIsEmpty) {
                    C4848 c4848M10285 = C4848.m10283();
                    Iterator it3 = interfaceC25104.mo30988(EnumC22423.PLATFORM_CLASS_PATH).iterator();
                    while (it3.hasNext()) {
                        c4848M10285 = c4848M10285.m10290((InterfaceC22097) it3.next());
                    }
                    Iterator it4 = interfaceC25104.mo30988(EnumC22423.CLASS_PATH).iterator();
                    while (it4.hasNext()) {
                        c4848M10285 = c4848M10285.m10290((InterfaceC22097) it4.next());
                    }
                    Object[] objArr = new Object[1];
                    objArr[c] = c4848M10285.m10294().m10285(",");
                    c23623.m52463("classpath", objArr);
                }
            }
        }
        String string = c9794.f27059.toString();
        if (!zIsEmpty2 && !z2) {
            InterfaceC4317 interfaceC4317 = EnumC22423.CLASS_PATH;
            m48135(c9794, interfaceC4317, m48139(interfaceC4317, c9794, string, enumSetOf));
            return;
        }
        if (!zIsEmpty) {
            InterfaceC4317 interfaceC4318 = EnumC22423.CLASS_PATH;
            m48135(c9794, interfaceC4318, m48139(interfaceC4318, c9794, string, enumSetCopyOf));
        }
        if (zIsEmpty2) {
            return;
        }
        InterfaceC4317 interfaceC4319 = EnumC22423.SOURCE_PATH;
        m48135(c9794, interfaceC4319, m48139(interfaceC4319, c9794, string, enumSetCopyOf2));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48134(C9794 c9794) {
        AbstractC15689 abstractC15689 = c9794.f27061;
        AbstractC12224 abstractC12224 = c9794.f27059;
        if (abstractC15689 == null) {
            c9794.f27061 = new C12338(c9794);
        }
        C2417 c2417 = c9794.f27063;
        C1446.m31700(c2417, new C4647(c9794, 1));
        c2417.mo18020();
        if (c2417 == this.f66969.f69147) {
            this.f66972 = false;
            if (this.f66970) {
                m48136(c9794, true);
                this.f66972 = true;
                InterfaceC4317 interfaceC4317 = EnumC22423.PLATFORM_CLASS_PATH;
                m48135(c9794, interfaceC4317, m48139(interfaceC4317, c9794, abstractC12224.toString(), EnumSet.of(EnumC18398.CLASS)));
                return;
            }
            InterfaceC4317 interfaceC4318 = EnumC22423.PLATFORM_CLASS_PATH;
            m48135(c9794, interfaceC4318, m48139(interfaceC4318, c9794, abstractC12224.toString(), EnumSet.of(EnumC18398.CLASS)));
            m48136(c9794, true);
            return;
        }
        if (c2417.f3690 != EnumC22423.CLASS_PATH) {
            EnumC18398 enumC18398 = EnumC18398.CLASS;
            EnumC18398 enumC18399 = EnumC18398.SOURCE;
            EnumSet enumSetOf = EnumSet.of(enumC18398, enumC18399);
            EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf);
            enumSetCopyOf.remove(enumC18399);
            boolean zIsEmpty = enumSetCopyOf.isEmpty();
            EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) enumSetOf);
            enumSetCopyOf2.remove(enumC18398);
            boolean zIsEmpty2 = enumSetCopyOf2.isEmpty();
            String string = abstractC12224.toString();
            InterfaceC4317 interfaceC4319 = c2417.f3690;
            InterfaceC4317 interfaceC43110 = c2417.f3703;
            InterfaceC4317 interfaceC43111 = c2417.f3700;
            InterfaceC4317 interfaceC43112 = c2417.f3702;
            boolean z = this.f66972;
            try {
                this.f66972 = false;
                if (!zIsEmpty && interfaceC43112 != null) {
                    m48135(c9794, interfaceC43112, m48139(interfaceC43112, c9794, string, enumSetCopyOf));
                }
                if ((!zIsEmpty || !zIsEmpty2) && interfaceC43111 != null) {
                    EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC18398.class);
                    enumSetNoneOf.addAll(enumSetCopyOf);
                    enumSetNoneOf.addAll(enumSetCopyOf2);
                    m48135(c9794, interfaceC43111, m48139(interfaceC43111, c9794, string, enumSetNoneOf));
                }
                this.f66972 = true;
                if (!zIsEmpty && interfaceC4319 != null) {
                    m48135(c9794, interfaceC4319, m48139(interfaceC4319, c9794, string, enumSetCopyOf));
                }
                if (!zIsEmpty2 && interfaceC43110 != null) {
                    m48135(c9794, interfaceC43110, m48139(interfaceC43110, c9794, string, enumSetCopyOf2));
                }
                return;
            } finally {
                this.f66972 = z;
            }
        }
        m48136(c9794, c2417.f3703 == EnumC22423.SOURCE_PATH);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48135(C9794 c9794, InterfaceC4317 interfaceC4317, C7211 c7211) {
        C15828 c15828M49588;
        InterfaceC19740 interfaceC19740;
        this.f66980 = interfaceC4317;
        Iterator it = c7211.iterator();
        while (true) {
            C3187 c3187 = (C3187) it;
            if (!c3187.hasNext()) {
                return;
            }
            InterfaceC19740 interfaceC19741 = (InterfaceC19740) c3187.next();
            int i = C9893.f27426[interfaceC19741.mo23287().ordinal()];
            if (i == 2 || i == 3) {
                InterfaceC4317 interfaceC4318 = this.f66980;
                InterfaceC13035 interfaceC13035 = this.f66978;
                String strMo4101 = interfaceC13035.mo4101(interfaceC4318, interfaceC19741);
                String strSubstring = strMo4101.substring(strMo4101.lastIndexOf(".") + 1);
                if (EnumC5698.m12682(strSubstring) || strSubstring.equals("package-info")) {
                    if ((c9794.f20409 & X931RNG.BLOCK128_RESEED_MAX) == 0) {
                        for (AbstractC7783 abstractC7783 = c9794; abstractC7783 != null && abstractC7783.f20405 == EnumC3600.f7351; abstractC7783 = abstractC7783.f20407) {
                            abstractC7783.f20409 |= X931RNG.BLOCK128_RESEED_MAX;
                        }
                    }
                    int i2 = interfaceC19741.mo23287() == EnumC18398.CLASS ? 33554432 : 67108864;
                    String strMo4102 = interfaceC13035.mo4101(this.f66980, interfaceC19741);
                    String strSubstring2 = strMo4102.substring(strMo4102.lastIndexOf(".") + 1);
                    C8200 c8200 = this.f66982;
                    AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(strSubstring2);
                    boolean z = abstractC12224M32717 == c8200.f21734;
                    if (z) {
                        c15828M49588 = c9794.f27062;
                    } else {
                        c15828M49588 = (C15828) ((C12338) c9794.f27061).m28411(abstractC12224M32717, null).f48076;
                    }
                    if (c15828M49588 == null) {
                        c15828M49588 = this.f66969.m49588(c9794.f27063, abstractC12224M32717, c9794);
                        if (c15828M49588.f45854 == null) {
                            c15828M49588.f45854 = interfaceC19741;
                        }
                        if (z) {
                            c9794.f27062 = c15828M49588;
                        } else if (c15828M49588.f20407 == c9794) {
                            c9794.f27061.mo28415(c15828M49588);
                        }
                    } else if (!this.f66972 && (interfaceC19740 = c15828M49588.f45854) != null) {
                        long j = c15828M49588.f20409;
                        if ((((long) i2) & j) == 0 && (j & 100663296) != 0) {
                            c15828M49588.f45854 = m48142(interfaceC19741, interfaceC19740);
                        }
                    }
                    c15828M49588.f20409 = ((long) i2) | c15828M49588.f20409;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7211 m48139(InterfaceC4317 interfaceC4317, C9794 c9794, String str, EnumSet enumSet) {
        return new C7211(this, this.f66978.mo4100(interfaceC4317, str, (Set) EnumSet.allOf(EnumC18398.class), false), c9794, enumSet);
    }
}
