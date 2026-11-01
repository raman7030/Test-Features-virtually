package p067l;

import com.umeng.analytics.pro.C0708d;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.MissingResourceException;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۙۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6684 {

    /* JADX INFO: renamed from: ۤ֫ */
    public static ResourceBundle f17254;

    /* JADX INFO: renamed from: ۫֫ */
    public static final C6468 f17255 = new C6468();

    /* JADX INFO: renamed from: ۬֫ */
    public static final EnumC23448 f17256 = EnumC23448.f74688;

    /* JADX INFO: renamed from: ֡ */
    public C15492 f17257;

    /* JADX INFO: renamed from: ֨ */
    public InterfaceC13035 f17259;

    /* JADX INFO: renamed from: ֨֫ */
    public C23936 f17260;

    /* JADX INFO: renamed from: ֫ */
    public C6383 f17261;

    /* JADX INFO: renamed from: ֫֫ */
    public C5473 f17262;

    /* JADX INFO: renamed from: ۖ֫ */
    public final AbstractC7783 f17264;

    /* JADX INFO: renamed from: ۗ */
    public EnumC21437 f17265;

    /* JADX INFO: renamed from: ۗ֫ */
    public C18418 f17266;

    /* JADX INFO: renamed from: ۘ */
    public boolean f17267;

    /* JADX INFO: renamed from: ۘ֫ */
    public EnumC17840 f17268;

    /* JADX INFO: renamed from: ۙ */
    public boolean f17269;

    /* JADX INFO: renamed from: ۙ֫ */
    public boolean f17270;

    /* JADX INFO: renamed from: ۚ֫ */
    public C22004 f17272;

    /* JADX INFO: renamed from: ۛ */
    public boolean f17273;

    /* JADX INFO: renamed from: ۜ */
    public C23559 f17274;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f17275;

    /* JADX INFO: renamed from: ۟ */
    public C8294 f17276;

    /* JADX INFO: renamed from: ۠ */
    public C21294 f17277;

    /* JADX INFO: renamed from: ۠֫ */
    public C6899 f17278;

    /* JADX INFO: renamed from: ۡ */
    public C4271 f17279;

    /* JADX INFO: renamed from: ۡ֫ */
    public EnumC22889 f17280;

    /* JADX INFO: renamed from: ۢ */
    public C5127 f17281;

    /* JADX INFO: renamed from: ۢ֫ */
    public C4848 f17282;

    /* JADX INFO: renamed from: ۧ */
    public C15099 f17284;

    /* JADX INFO: renamed from: ۧ֫ */
    public C8200 f17285;

    /* JADX INFO: renamed from: ۨ */
    public C23623 f17286;

    /* JADX INFO: renamed from: ۫ */
    public C10728 f17287;

    /* JADX INFO: renamed from: ܰ */
    public C18537 f17289;

    /* JADX INFO: renamed from: ܳ */
    public C4848 f17290;

    /* JADX INFO: renamed from: ܶ */
    public C12083 f17292;

    /* JADX INFO: renamed from: ܶ֫ */
    public C12975 f17293;

    /* JADX INFO: renamed from: ܺ */
    public C7530 f17294;

    /* JADX INFO: renamed from: ܺ֫ */
    public EnumC22889 f17295;

    /* JADX INFO: renamed from: ܽ */
    public boolean f17296;

    /* JADX INFO: renamed from: ܽ֫ */
    public C13565 f17297;

    /* JADX INFO: renamed from: ܿ */
    public C16852 f17298;

    /* JADX INFO: renamed from: ܿ֫ */
    public C24387 f17299;

    /* JADX INFO: renamed from: ᩳ */
    public C11216 f17300;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C17274 f17301;

    /* JADX INFO: renamed from: ᩴ */
    public C8005 f17302;

    /* JADX INFO: renamed from: ᩵ */
    public C8005 f17304;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f17305;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f17307;

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC12224 f17308;

    /* JADX INFO: renamed from: ᩷֫ */
    public C21378 f17309;

    /* JADX INFO: renamed from: ᩸ */
    public C15065 f17310;

    /* JADX INFO: renamed from: ᩸֫ */
    public C8374 f17311;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f17312;

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean f17313;

    /* JADX INFO: renamed from: ᩺ */
    public C24507 f17314;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC23448 f17315;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final C7681 f17303 = new C7681(this);

    /* JADX INFO: renamed from: ۚ */
    public boolean f17271 = false;

    /* JADX INFO: renamed from: ۬ */
    public HashSet f17288 = new HashSet();

    /* JADX INFO: renamed from: ۤ */
    public boolean f17283 = false;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f17306 = false;

    /* JADX INFO: renamed from: ֡֫ */
    public long f17258 = 0;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f17316 = false;

    /* JADX INFO: renamed from: ܳ֫ */
    public C3606 f17291 = null;

    /* JADX INFO: renamed from: ۖ */
    public HashMap f17263 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static C6684 m15204(C5127 c5127) {
        C6684 c6684 = (C6684) c5127.m10905(f17255);
        return c6684 == null ? new C6684(c5127) : c6684;
    }

    /* JADX INFO: renamed from: ۜ */
    public static String m15209() {
        return m15210("release");
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m15213() {
        return m15210("full");
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m15210(String str) {
        if (f17254 == null) {
            try {
                f17254 = ResourceBundle.getBundle("com.sun.tools.javac.resources.version");
            } catch (MissingResourceException unused) {
                return C23623.m52446("version.not.available", new Object[0]);
            }
        }
        try {
            return f17254.getString(str);
        } catch (MissingResourceException unused2) {
            return C23623.m52446("version.not.available", new Object[0]);
        }
    }

    public C6684(C5127 c5127) {
        EnumC22889 enumC22889ValueOf;
        EnumC22889 enumC22889ValueOf2;
        this.f17290 = C4848.m10283();
        this.f17281 = c5127;
        c5127.m10908(f17255, this);
        if (c5127.m10904(InterfaceC13035.class) == null) {
            int i = C13625.f38343;
            c5127.m10907(InterfaceC13035.class, (InterfaceC21221) new C6249());
        }
        this.f17285 = C8200.m18988(c5127);
        this.f17286 = C23623.m52439(c5127);
        this.f17302 = C8005.m18541(c5127);
        this.f17277 = C21294.m48132(c5127);
        this.f17309 = C21378.m48420(c5127);
        this.f17289 = C18537.m42139(c5127);
        this.f17266 = C18418.m41935(c5127);
        this.f17287 = C10728.m24667(c5127);
        this.f17257 = C15492.m35238(c5127);
        this.f17278 = C6899.m15810(c5127);
        this.f17259 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        this.f17301 = C17274.m39125(c5127);
        this.f17274 = C23559.m52348(c5127);
        try {
            this.f17272 = C22004.m49577(c5127);
        } catch (C21865 e) {
            C23623 c23623 = this.f17286;
            AbstractC7783 abstractC7783 = e.f68780;
            C18258 c18258M49312 = e.m49312();
            C14040 c14040 = C8300.f21997;
            c23623.m9355(new C14040("compiler", "cant.access", abstractC7783, c18258M49312));
        }
        this.f17268 = EnumC17840.m40515(c5127);
        this.f17299 = C24387.m53737(c5127);
        this.f17300 = C11216.m25910(c5127);
        this.f17261 = C6383.m14595(c5127);
        this.f17298 = C16852.m38215(c5127);
        this.f17310 = C15065.m34431(c5127);
        this.f17292 = C12083.m27670(c5127);
        this.f17293 = C12975.m29735(c5127);
        this.f17314 = C24507.m54026(c5127);
        this.f17284 = C15099.m34493(c5127);
        this.f17311 = C8374.m19396(c5127);
        this.f17260 = C23936.m53032(c5127);
        C5473 c5473M12055 = C5473.m12055(c5127);
        this.f17262 = c5473M12055;
        C8294 c8294M19100 = C8294.m19100(c5127);
        this.f17276 = c8294M19100;
        this.f17304 = C8005.m18541(c5127);
        this.f17279 = C4271.m8674(c5127);
        this.f17277.f66987 = this.f17303;
        c5473M12055.f13088 = new C15795(this);
        c8294M19100.f21964 = new C15795(this);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f17297 = c13565M30871;
        this.f17313 = c13565M30871.m30880(EnumC2483.f3917);
        this.f17305 = c13565M30871.m30880(EnumC2483.f3923);
        EnumC2483 enumC2483 = EnumC2483.f3978;
        this.f17273 = c13565M30871.m30884(enumC2483) || c13565M30871.m30877(enumC2483, "lines");
        this.f17312 = c13565M30871.m30880(EnumC2483.f3967) || c5127.m10904(InterfaceC15775.class) != null;
        this.f17267 = c13565M30871.m30879("dev");
        this.f17275 = c13565M30871.m30879("process.packages");
        this.f17270 = c13565M30871.m30880(EnumC2483.f3945);
        this.f17307 = c13565M30871.m30879("verboseCompilePolicy");
        this.f17315 = EnumC23448.m52150(c13565M30871.m30872("compilePolicy"));
        this.f17265 = EnumC21437.m48563(c13565M30871.m30872("-implicit"));
        this.f17308 = c13565M30871.m30879("failcomplete") ? this.f17285.f21738.m32717(c13565M30871.m30872("failcomplete")) : null;
        if (c13565M30871.m30879("should-stop.at")) {
            enumC22889ValueOf = EnumC22889.valueOf(c13565M30871.m30872("should-stop.at"));
        } else if (c13565M30871.m30879("should-stop.ifError")) {
            enumC22889ValueOf = EnumC22889.valueOf(c13565M30871.m30872("should-stop.ifError"));
        } else {
            enumC22889ValueOf = EnumC22889.INIT;
        }
        this.f17280 = enumC22889ValueOf;
        if (c13565M30871.m30879("should-stop.ifNoError")) {
            enumC22889ValueOf2 = EnumC22889.valueOf(c13565M30871.m30872("should-stop.ifNoError"));
        } else {
            enumC22889ValueOf2 = EnumC22889.GENERATE;
        }
        this.f17295 = enumC22889ValueOf2;
        if (c13565M30871.m30883("diags.legacy")) {
            this.f17286.m52453(C5028.m10699(c5127));
        }
        InterfaceC7888 interfaceC7888 = (InterfaceC7888) c5127.m10904(InterfaceC7888.class);
        if (interfaceC7888 != null) {
            this.f17290 = this.f17290.m10290(interfaceC7888);
        }
        this.f17264 = new C16741(EnumC3600.f7345, 0L, this.f17285.f21725, AbstractC6462.f16700, this.f17272.f69155);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15229(EnumC22889 enumC22889) {
        EnumC22889 enumC228810;
        if (m15234() > 0) {
            enumC228810 = this.f17280;
        } else {
            C7530 c7530 = this.f17294;
            if (c7530 != null) {
                Iterator it = ((C20271) c7530.m17427()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        C18258 c18258 = (C18258) it.next();
                        if (c18258.mo31352() == EnumC8400.ERROR && !c18258.m41582(EnumC21417.RECOVERABLE)) {
                            enumC228810 = this.f17280;
                        }
                    }
                }
            }
            enumC228810 = this.f17295;
        }
        return enumC22889.m51120(enumC228810);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m15234() {
        boolean z = this.f17270;
        C23623 c23623 = this.f17286;
        if (z && c23623.f75180 == 0 && c23623.f75177 > 0) {
            c23623.m9355(C8300.f22133);
        }
        return c23623.f75180;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m15218(String str) {
        C2417 c2417M12095;
        AbstractC7783 abstractC7783M25946;
        int iIndexOf = str.indexOf(47);
        C23623 c23623 = this.f17286;
        if (iIndexOf == -1) {
            c2417M12095 = this.f17262.m12095();
        } else {
            if (!EnumC12477.f34980.m28726(this.f17268)) {
                C14040 c14040 = C8300.f21997;
                c23623.m9355(new C14040("compiler", "invalid.module.specifier", str));
                return this.f17264;
            }
            C2417 c2417M19107 = this.f17276.m19107(this.f17285.f21738.m32717(str.substring(0, iIndexOf)));
            str = str.substring(iIndexOf + 1);
            c2417M12095 = c2417M19107;
        }
        try {
            return this.f17277.m48141(c2417M12095, this.f17285.f21738.m32717(str.replace("/", ".")));
        } catch (C21865 unused) {
            if (str.equals("")) {
                return this.f17272.f69144;
            }
            AbstractC14355 abstractC14355M42194 = null;
            InterfaceC19740 interfaceC19740M9363 = c23623.m9363((InterfaceC19740) null);
            try {
                for (String str2 : str.split("\\.", -1)) {
                    if (!EnumC5698.m12682(str2)) {
                        abstractC7783M25946 = this.f17272.f69144;
                        return abstractC7783M25946;
                    }
                    abstractC14355M42194 = abstractC14355M42194 == null ? this.f17289.m42194(this.f17285.f21738.m32717(str2)) : this.f17289.m42155(abstractC14355M42194, this.f17285.f21738.m32717(str2));
                }
                C3626 c3626M42213 = this.f17289.m42213(C4848.m10283());
                c3626M42213.f7510 = c2417M12095;
                c3626M42213.f7517 = c2417M12095.f3694;
                abstractC7783M25946 = this.f17300.m25946(abstractC14355M42194, c3626M42213);
                return abstractC7783M25946;
            } finally {
                c23623.m9363(interfaceC19740M9363);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 m15219(C4036 c4036, C7650 c7650) {
        C23623 c23623 = this.f17286;
        try {
            if (this.f17310.m34464(c4036, c7650) && m15234() == 0) {
                return this.f17266.m41948(c7650.f20027);
            }
            return null;
        } catch (C11990 unused) {
            c7650.getClass();
            c23623.m9352(c7650, C8300.f22081);
            return null;
        } catch (C13055 e) {
            c7650.getClass();
            String strSubstring = e.f36707.substring(0, 20);
            C14040 c14040 = C8300.f21997;
            c23623.m9352(c7650, new C14040("compiler", "limit.string.overflow", strSubstring));
            return null;
        } catch (C21865 e2) {
            C16852 c16852 = this.f17298;
            c7650.getClass();
            c16852.m38271(c7650, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19740 m15230(C4036 c4036, C7650 c7650) throws IOException {
        InterfaceC19740 interfaceC19740Mo4106 = this.f17259.mo4106(EnumC22423.CLASS_OUTPUT, c7650.f20027.f45859.toString(), EnumC18398.SOURCE, (InterfaceC9741) null);
        boolean zContains = this.f17288.contains(interfaceC19740Mo4106);
        C23623 c23623 = this.f17286;
        if (zContains) {
            C14040 c14040 = C8300.f21997;
            c23623.m9352(c7650, new C14040("compiler", "source.cant.overwrite.input.file", interfaceC19740Mo4106));
            return null;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(interfaceC19740Mo4106.mo22777());
        try {
            new C22680(bufferedWriter, true).m50778(c4036.f8851, c7650);
            if (this.f17313) {
                c23623.m52463("wrote.file", interfaceC19740Mo4106.getName());
            }
            bufferedWriter.close();
            return interfaceC19740Mo4106;
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15224(C3626 c3626, C15828 c15828) {
        boolean z;
        AbstractC12224 abstractC12224 = this.f17308;
        AbstractC12224 abstractC12225 = c15828.f45855;
        C4271 c4271 = this.f17279;
        if (abstractC12224 == abstractC12225) {
            throw new C21865(c15828, new Supplier() { // from class: l.ۚۡ۠
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f19273.f17302.m18543(C13665.f38515);
                }
            }, c4271);
        }
        InterfaceC19740 interfaceC19740 = c15828.f45854;
        C23623 c23623 = this.f17286;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
        if (c3626 == null) {
            try {
                try {
                    c3626 = m15215(interfaceC19740, interfaceC19740.mo9471(false));
                } catch (IOException e) {
                    int i = C13625.f38343;
                    String localizedMessage = e.getLocalizedMessage();
                    if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                        localizedMessage = e.toString();
                    }
                    C14040 c14040 = C8300.f21997;
                    c23623.m9355(new C14040("compiler", "error.reading.file", interfaceC19740, localizedMessage));
                    c3626 = this.f17289.m42213(C4848.m10283());
                }
                c23623.m9363(interfaceC19740M9363);
            } catch (Throwable th) {
                c23623.m9363(interfaceC19740M9363);
                throw th;
            }
        }
        C23936 c23936 = this.f17260;
        if (!c23936.m53034()) {
            c23936.m53035(new C21925(EnumC8513.ENTER, c3626));
        }
        if (!this.f17262.m12093(c15828, C4848.m10276of((Object) c3626))) {
            throw new C21865(c15828, new Supplier() { // from class: l.֨ۡ۠
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f6509.f17304.m18543(C13665.f38472);
                }
            }, c4271);
        }
        this.f17257.m35243(c15828, C4848.m10276of((Object) c3626));
        if (!c23936.m53034()) {
            c23936.m53033(new C21925(EnumC8513.ENTER, c3626));
        }
        if (this.f17257.m35240(c15828) == null) {
            InterfaceC19740 interfaceC19741 = c3626.f7516;
            EnumC18398 enumC18398 = EnumC18398.SOURCE;
            boolean zMo23288 = interfaceC19741.mo23288("package-info", enumC18398);
            boolean zMo23289 = c3626.f7516.mo23288("module-info", enumC18398);
            C8005 c8005 = this.f17302;
            if (zMo23289) {
                if (this.f17257.m35240(c3626.f7510) == null) {
                    throw new C22635(c15828, interfaceC19740, c8005.m18543(C13665.f38466), this.f17302, this.f17279);
                }
                z = true;
            } else {
                z = true;
                if (zMo23288) {
                    if (this.f17257.m35240(c3626.f7517) == null) {
                        AbstractC7783 abstractC7783M17991 = c15828.m17991();
                        C13370 c13370 = C13665.f38450;
                        throw new C22635(c15828, interfaceC19740, c8005.m18543(new C13370("compiler", "file.does.not.contain.package", abstractC7783M17991)), this.f17302, this.f17279);
                    }
                } else {
                    AbstractC12224 abstractC12226 = c15828.f45855;
                    C13370 c13371 = C13665.f38450;
                    throw new C22635(c15828, interfaceC19740, c8005.m18543(new C13370("compiler", "file.doesnt.contain.class", abstractC12226)), this.f17302, this.f17279);
                }
            }
        } else {
            z = true;
        }
        this.f17269 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15223(Set set, LinkedHashSet linkedHashSet, Collection collection) {
        C5473 c5473;
        boolean z = this.f17313;
        C23623 c23623 = this.f17286;
        C23936 c23936 = this.f17260;
        if (!c23936.m53034()) {
            c23936.m53035(new C21925(EnumC8513.COMPILATION));
        }
        if (this.f17306) {
            throw new AssertionError("attempt to reuse JavaCompiler");
        }
        this.f17306 = true;
        StringBuilder sb = new StringBuilder();
        EnumC2483 enumC2483 = EnumC2483.f3953;
        sb.append(enumC2483.f3990);
        sb.append("-");
        EnumC21706 enumC21706 = EnumC21706.OPTIONS;
        sb.append(enumC21706.f68387);
        String string = sb.toString();
        C13565 c13565 = this.f17297;
        c13565.m30876(string, "true");
        c13565.m30885(enumC2483.f3990 + enumC21706.f68387);
        this.f17258 = System.currentTimeMillis();
        try {
            try {
                m15222(set, linkedHashSet);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c5473 = this.f17262;
                    if (!zHasNext) {
                        break;
                    }
                    String str = (String) it.next();
                    int iIndexOf = str.indexOf(47);
                    if (iIndexOf != -1) {
                        c5473.m12091(str.substring(0, iIndexOf));
                    }
                }
                Iterator it2 = ((C4848) collection).iterator();
                while (it2.hasNext()) {
                    c5473.m12091((String) it2.next());
                }
                EnumC22889 enumC22889 = EnumC22889.ENTER;
                C4848 c4848M15217 = m15217(set, false);
                if (m15229(enumC22889)) {
                    c4848M15217 = C4848.m10283();
                }
                m15232(c4848M15217);
                if (m15229(enumC22889)) {
                    c4848M15217 = C4848.m10283();
                }
                m15226(c4848M15217);
                m15227(c4848M15217, (Collection) linkedHashSet);
                if (c23936.m53034() && this.f17265 == EnumC21437.NONE) {
                    this.f17278.m15813(this.f17288);
                }
                if (!EnumC22889.ATTR.m51120(this.f17295)) {
                    int iOrdinal = this.f17315.ordinal();
                    if (iOrdinal == 0) {
                        C6899 c6899 = this.f17278;
                        C20271 c20271 = new C20271();
                        while (!c6899.isEmpty()) {
                            c20271.m45777(m15216((C4036) c6899.remove()));
                        }
                        if (m15229(EnumC22889.ATTR)) {
                            c20271 = new C20271();
                        }
                        C20271 c20272 = new C20271();
                        Iterator it3 = c20271.iterator();
                        while (it3.hasNext()) {
                            m15225((C4036) it3.next(), c20272);
                        }
                        if (m15229(EnumC22889.FLOW)) {
                            c20272 = new C20271();
                        }
                        m15231(m15214(c20272));
                    } else if (iOrdinal == 1) {
                        LinkedList linkedListM15814 = this.f17278.m15814();
                        while (!linkedListM15814.isEmpty() && !m15229(EnumC22889.ATTR)) {
                            Queue queue = (Queue) linkedListM15814.remove();
                            C20271 c20273 = new C20271();
                            while (!queue.isEmpty()) {
                                c20273.m45777(m15216((C4036) queue.remove()));
                            }
                            if (m15229(EnumC22889.ATTR)) {
                                c20273 = new C20271();
                            }
                            C20271 c20274 = new C20271();
                            Iterator it4 = c20273.iterator();
                            while (it4.hasNext()) {
                                m15225((C4036) it4.next(), c20274);
                            }
                            if (m15229(EnumC22889.FLOW)) {
                                c20274 = new C20271();
                            }
                            m15231(m15214(c20274));
                        }
                    } else {
                        if (iOrdinal != 2) {
                            C1446.m31702("unknown compile policy");
                            throw null;
                        }
                        while (!this.f17278.isEmpty()) {
                            C4036 c4036M15216 = m15216((C4036) this.f17278.remove());
                            C20271 c20275 = new C20271();
                            m15225(c4036M15216, c20275);
                            if (m15229(EnumC22889.FLOW)) {
                                c20275 = new C20271();
                            }
                            m15231(m15214(c20275));
                        }
                    }
                }
                if (z) {
                    c23623.m52463("total", Long.toString(System.currentTimeMillis() - this.f17258));
                }
                m15235();
                if (!c23623.m52464()) {
                    m15221(m15234(), C0708d.f2599O);
                    m15221(c23623.f75177, "warn");
                    m15207(m15234(), c23623.f75191, "count.error.recompile");
                    m15207(c23623.f75177, c23623.f75192, "count.warn.recompile");
                }
                if (!c23936.m53034()) {
                    c23936.m53033(new C21925(EnumC8513.COMPILATION));
                }
                m15220();
                C3606 c3606 = this.f17291;
                if (c3606 != null) {
                    c3606.close();
                }
            } catch (C8479 e) {
                if (this.f17267) {
                    e.printStackTrace(System.err);
                }
                if (z) {
                    c23623.m52463("total", Long.toString(System.currentTimeMillis() - this.f17258));
                }
                m15235();
                if (!c23623.m52464()) {
                    m15221(m15234(), C0708d.f2599O);
                    m15221(c23623.f75177, "warn");
                    m15207(m15234(), c23623.f75191, "count.error.recompile");
                    m15207(c23623.f75177, c23623.f75192, "count.warn.recompile");
                }
                if (!c23936.m53034()) {
                    c23936.m53033(new C21925(EnumC8513.COMPILATION));
                }
                m15220();
                C3606 c3607 = this.f17291;
                if (c3607 != null) {
                    c3607.close();
                }
            }
        } catch (Throwable th) {
            if (z) {
                c23623.m52463("total", Long.toString(System.currentTimeMillis() - this.f17258));
            }
            m15235();
            if (!c23623.m52464()) {
                m15221(m15234(), C0708d.f2599O);
                m15221(c23623.f75177, "warn");
                m15207(m15234(), c23623.f75191, "count.error.recompile");
                m15207(c23623.f75177, c23623.f75192, "count.warn.recompile");
            }
            if (!c23936.m53034()) {
                c23936.m53033(new C21925(EnumC8513.COMPILATION));
            }
            m15220();
            C3606 c3608 = this.f17291;
            if (c3608 != null) {
                c3608.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m15217(Set set, boolean z) {
        CharSequence charSequenceMo9471;
        if (!z && m15229(EnumC22889.PARSE)) {
            return C4848.m10283();
        }
        C20271 c20271 = new C20271();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC19740 interfaceC19740 = (InterfaceC19740) it.next();
            if (!hashSet.contains(interfaceC19740)) {
                hashSet.add(interfaceC19740);
                C23623 c23623 = this.f17286;
                InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
                try {
                    try {
                        this.f17288.add(interfaceC19740);
                        charSequenceMo9471 = interfaceC19740.mo9471(false);
                    } catch (IOException e) {
                        int i = C13625.f38343;
                        String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                            localizedMessage = e.toString();
                        }
                        C14040 c14040 = C8300.f21997;
                        c23623.m9355(new C14040("compiler", "error.reading.file", interfaceC19740, localizedMessage));
                        charSequenceMo9471 = null;
                    }
                    C3626 c3626M15215 = m15215(interfaceC19740, charSequenceMo9471);
                    AbstractC13884 abstractC13884 = c3626M15215.f7514;
                    if (abstractC13884 != null) {
                        c23623.m52454(interfaceC19740, abstractC13884);
                    }
                    c23623.m9363(interfaceC19740M9363);
                    c20271.m45777(c3626M15215);
                } catch (Throwable th) {
                    c23623.m9363(interfaceC19740M9363);
                    throw th;
                }
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m15233() {
        return !m15229(EnumC22889.ATTR);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15232(C4848 c4848) {
        this.f17262.m12090(c4848);
        if (c4848.isEmpty()) {
            this.f17284.m34516();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15226(C4848 c4848) {
        C23936 c23936 = this.f17260;
        if (!c23936.m53034()) {
            Iterator it = c4848.iterator();
            while (it.hasNext()) {
                c23936.m53035(new C21925(EnumC8513.ENTER, (C3626) it.next()));
            }
        }
        this.f17257.m35243((C15828) null, c4848);
        this.f17284.m34516();
        if (!c23936.m53034()) {
            Iterator it2 = c4848.iterator();
            while (it2.hasNext()) {
                c23936.m53033(new C21925(EnumC8513.ENTER, (C3626) it2.next()));
            }
        }
        if (this.f17305) {
            C20271 c20271 = new C20271();
            Iterator it3 = c4848.iterator();
            while (it3.hasNext()) {
                for (C4848 c4849 = ((C3626) it3.next()).f7509; c4849.m10293(); c4849 = c4849.f11035) {
                    Object obj = c4849.f11034;
                    if (obj instanceof C7650) {
                        c20271.m45777((C7650) obj);
                    }
                }
            }
            this.f17282 = c20271.m45783();
        }
        Iterator it4 = c4848.iterator();
        while (it4.hasNext()) {
            this.f17288.add(((C3626) it4.next()).f7516);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15222(Collection collection, Collection collection2) {
        EnumC2483 enumC2483 = EnumC2483.f3976;
        C13565 c13565 = this.f17297;
        if (c13565.m30877(enumC2483, "none")) {
            this.f17316 = false;
            return;
        }
        if (this.f17291 == null) {
            C3606 c3606M6726 = C3606.m6726(this.f17281);
            this.f17291 = c3606M6726;
            c3606M6726.m6755();
            boolean zM6754 = this.f17291.m6754();
            this.f17316 = zM6754;
            if (zM6754) {
                c13565.m30876("parameters", "parameters");
                this.f17309.f67428 = true;
                this.f17283 = true;
                this.f17312 = true;
                C23936 c23936 = this.f17260;
                if (!c23936.m53034()) {
                    c23936.m53035(new C21925(EnumC8513.ANNOTATION_PROCESSING));
                }
                this.f17294 = new C7530(this.f17286, null);
                this.f17291.m6758().m41795(collection, collection2);
                return;
            }
            this.f17291.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15227(C4848 c4848, Collection collection) {
        EnumC3600 enumC3600;
        EnumC3600 enumC3601;
        boolean zM15229 = m15229(EnumC22889.PROCESS);
        int i = 1;
        C23623 c23623 = this.f17286;
        if (zM15229 && this.f17316) {
            this.f17294.m17428(new C15919(i));
            c23623.m52452(this.f17294);
            return;
        }
        boolean z = this.f17316;
        C13565 c13565 = this.f17297;
        if (!z) {
            if (c13565.m30877(EnumC2483.f3976, "only")) {
                c23623.m9354(C15675.f45433);
                this.f17278.clear();
            }
            if (!collection.isEmpty()) {
                C14040 c14040 = C8300.f21997;
                c23623.m9355(new C14040("compiler", "proc.no.explicit.annotation.processing.requested", collection));
            }
            C1446.m31706(this.f17294);
            return;
        }
        C1446.m31699(this.f17294);
        try {
            C4848 c4848M10283 = C4848.m10283();
            C4848 c4848M10284 = C4848.m10283();
            if (!collection.isEmpty()) {
                if (!(this.f17271 || m15208(c13565))) {
                    C14040 c14041 = C8300.f21997;
                    c23623.m9355(new C14040("compiler", "proc.no.explicit.annotation.processing.requested", collection));
                    this.f17294.m17428(new C15919(i));
                    c23623.m52452(this.f17294);
                    return;
                }
                Iterator it = collection.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    AbstractC7783 abstractC7783M15218 = m15218(str);
                    if (abstractC7783M15218 == null || (((enumC3600 = abstractC7783M15218.f20405) == (enumC3601 = EnumC3600.f7351) && !this.f17275) || enumC3600 == EnumC3600.f7345)) {
                        if (abstractC7783M15218 != this.f17264) {
                            C14040 c14042 = C8300.f21997;
                            c23623.m9355(new C14040("compiler", "proc.cant.find.class", str));
                        }
                        z2 = true;
                    } else {
                        if (enumC3600 == enumC3601) {
                            try {
                                abstractC7783M15218.mo18020();
                            } catch (C21865 unused) {
                                C14040 c14043 = C8300.f21997;
                                c23623.m9355(new C14040("compiler", "proc.cant.find.class", str));
                                z2 = true;
                            }
                        }
                        if (!abstractC7783M15218.mo17485()) {
                            C1446.m31704(abstractC7783M15218.f20405 == enumC3601);
                            C12895 c12895 = C15675.f45417;
                            c23623.m9354(new C12895("compiler", "proc.package.does.not.exist", str));
                            c4848M10284 = c4848M10284.m10290((C9794) abstractC7783M15218);
                        } else if (abstractC7783M15218.f20405 == enumC3601) {
                            c4848M10284 = c4848M10284.m10290((C9794) abstractC7783M15218);
                        } else {
                            c4848M10283 = c4848M10283.m10290((C15828) abstractC7783M15218);
                        }
                    }
                }
                if (z2) {
                    this.f17294.m17428(new C15919(i));
                    c23623.m52452(this.f17294);
                    return;
                }
            }
            try {
                this.f17291.m6753(c4848, c4848M10283, c4848M10284, this.f17294);
                this.f17296 = true;
            } finally {
                this.f17291.close();
            }
        } catch (C21865 e) {
            AbstractC7783 abstractC7783 = e.f68780;
            C18258 c18258M49312 = e.m49312();
            C14040 c14044 = C8300.f21997;
            c23623.m9355(new C14040("compiler", "cant.access", abstractC7783, c18258M49312));
            C7530 c7530 = this.f17294;
            if (c7530 != null) {
                c7530.m17428(new C15919(i));
                c23623.m52452(this.f17294);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15208(C13565 c13565) {
        if (c13565.m30880(EnumC2483.f3934) || c13565.m30880(EnumC2483.f3957) || c13565.m30880(EnumC2483.f3931)) {
            return true;
        }
        EnumC2483 enumC2483 = EnumC2483.f3976;
        return c13565.m30877(enumC2483, "only") || c13565.m30877(enumC2483, "full") || c13565.m30880(EnumC2483.f3982) || c13565.m30880(EnumC2483.f3932);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15228(C7530 c7530) {
        this.f17294 = c7530;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4036 m15216(C4036 c4036) {
        EnumC22889 enumC22889 = EnumC22889.ATTR;
        C23559 c23559 = this.f17274;
        if (c23559.m52349(c4036, enumC22889)) {
            return c4036;
        }
        boolean z = this.f17307;
        C23623 c23623 = this.f17286;
        if (z) {
            c23623.m52455(EnumC22953.NOTICE, "[attribute " + c4036.f8855.f20027 + "]");
        }
        if (this.f17313) {
            c23623.m52463("checking.attribution", c4036.f8855.f20027);
        }
        C23936 c23936 = this.f17260;
        if (!c23936.m53034()) {
            c23936.m53035(new C21925(EnumC8513.ANALYZE, c4036.f8851, c4036.f8855.f20027));
        }
        InterfaceC19740 interfaceC19740 = c4036.f8855.f20027.f45858;
        if (interfaceC19740 == null) {
            interfaceC19740 = c4036.f8851.f7516;
        }
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
        try {
            this.f17300.m25951(c4036);
            if (m15234() > 0 && !m15229(enumC22889)) {
                this.f17300.m25966(c4036.f8850);
            }
            c23559.put(c4036, enumC22889);
            return c4036;
        } finally {
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15225(C4036 c4036, C20271 c20271) {
        C21925 c21925;
        C23936 c23936 = this.f17260;
        EnumC22889 enumC22889 = EnumC22889.FLOW;
        C23559 c23559 = this.f17274;
        if (c23559.m52349(c4036, enumC22889)) {
            c20271.m45777(c4036);
            return;
        }
        try {
            if (!m15229(enumC22889)) {
                boolean z = this.f17307;
                C23623 c23623 = this.f17286;
                if (z) {
                    c23623.m52455(EnumC22953.NOTICE, "[flow " + c4036.f8855.f20027 + "]");
                }
                InterfaceC19740 interfaceC19740 = c4036.f8855.f20027.f45858;
                if (interfaceC19740 == null) {
                    interfaceC19740 = c4036.f8851.f7516;
                }
                InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
                try {
                    C18537 c18537 = this.f17289;
                    c18537.f55352 = 0;
                    this.f17292.m27687(c4036, c18537.m42174(c4036.f8851));
                    c23559.put(c4036, enumC22889);
                    if (m15229(enumC22889)) {
                        c23623.m9363(interfaceC19740M9363);
                        if (c23936.m53034()) {
                            return;
                        } else {
                            c21925 = new C21925(EnumC8513.ANALYZE, c4036.f8851, c4036.f8855.f20027);
                        }
                    } else {
                        this.f17261.m14597(c4036);
                        c20271.m45777(c4036);
                        c23623.m9363(interfaceC19740M9363);
                        if (c23936.m53034()) {
                            return;
                        } else {
                            c21925 = new C21925(EnumC8513.ANALYZE, c4036.f8851, c4036.f8855.f20027);
                        }
                    }
                } catch (Throwable th) {
                    c23623.m9363(interfaceC19740M9363);
                    throw th;
                }
            } else if (c23936.m53034()) {
                return;
            } else {
                c21925 = new C21925(EnumC8513.ANALYZE, c4036.f8851, c4036.f8855.f20027);
            }
            c23936.m53033(c21925);
        } catch (Throwable th2) {
            if (!c23936.m53034()) {
                c23936.m53033(new C21925(EnumC8513.ANALYZE, c4036.f8851, c4036.f8855.f20027));
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x015f A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0167 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0171 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:71:0x017a A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[Catch: all -> 0x01d0, LOOP:2: B:74:0x018c->B:76:0x0192, LOOP_START, PHI: r3
      0x018c: PHI (r3v16 l.ۖܶ۠) = (r3v15 l.ۖܶ۠), (r3v17 l.ۖܶ۠) binds: [B:72:0x0189, B:76:0x0192] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0192 A[Catch: all -> 0x01d0, LOOP:2: B:74:0x018c->B:76:0x0192, LOOP_END, TryCatch #0 {all -> 0x01d0, blocks: (B:41:0x00da, B:44:0x00f3, B:47:0x00ff, B:50:0x0107, B:53:0x011e, B:55:0x0136, B:57:0x013a, B:60:0x0144, B:61:0x0153, B:65:0x015f, B:67:0x0167, B:69:0x0171, B:70:0x0176, B:71:0x017a, B:74:0x018c, B:76:0x0192, B:78:0x01a3, B:81:0x01ac, B:83:0x01b8), top: B:94:0x00da }] */
    /* JADX INFO: renamed from: ֫ */
    public final Queue m15214(Queue queue) {
        C24293 c24293;
        EnumC22889 enumC22889;
        C4848 c4848M54046;
        C7650 c7650;
        C20271 c20271 = new C20271();
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            C4036 c4036 = (C4036) it.next();
            C5127 c5127 = this.f17281;
            if (!m15229(EnumC22889.TRANSTYPES)) {
                if (this.f17265 == EnumC21437.NONE) {
                    if (!this.f17288.contains(c4036.f8851.f7516)) {
                        continue;
                    }
                }
                C5473 c5473 = this.f17262;
                if (c5473.f13067 || c4036.f8851.f7510 == c5473.m12095()) {
                    EnumC22889 enumC228810 = EnumC22889.LOWER;
                    C23559 c23559 = this.f17274;
                    boolean zM52349 = c23559.m52349(c4036, enumC228810);
                    HashMap map = this.f17263;
                    if (zM52349) {
                        c20271.addAll((Collection) map.get(c4036));
                    } else {
                        C22778 c22778 = new C22778(this, c4036);
                        c22778.mo12739(c4036.f8850);
                        for (C4036 c4037 : c22778.f71795) {
                            EnumC22889 enumC228811 = EnumC22889.FLOW;
                            if (!c23559.m52349(c4037, enumC228811)) {
                                C4036 c4036M15216 = m15216(c4037);
                                C20271 c20272 = new C20271();
                                m15225(c4036M15216, c20272);
                                if (m15229(enumC228811)) {
                                    c20272 = new C20271();
                                }
                                map.put(c4037, m15214(c20272));
                            }
                        }
                        EnumC22889 enumC228812 = EnumC22889.TRANSTYPES;
                        if (m15229(enumC228812)) {
                            continue;
                        } else {
                            boolean z = this.f17307;
                            C23623 c23623 = this.f17286;
                            if (z) {
                                c23623.m52455(EnumC22953.NOTICE, "[desugar " + c4036.f8855.f20027 + "]");
                            }
                            InterfaceC19740 interfaceC19740 = c4036.f8855.f20027.f45858;
                            if (interfaceC19740 == null) {
                                interfaceC19740 = c4036.f8851.f7516;
                            }
                            InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
                            try {
                                AbstractC7257 abstractC7257 = c4036.f8850;
                                C18537 c18537 = this.f17289;
                                c18537.f55352 = 0;
                                C18537 c18537M42174 = c18537.m42174(c4036.f8851);
                                boolean zM16617 = c4036.f8850.m16617(EnumC19998.f60726);
                                boolean z2 = this.f17305;
                                if (zM16617 || c4036.f8850.m16617(EnumC19998.f60778)) {
                                    if (!z2 && !m15229(EnumC22889.LOWER)) {
                                        C4848 c4848M54047 = this.f17314.m54046(c4036, c4036.f8850, c18537M42174);
                                        if (c4848M54047.f11034 != null) {
                                            C1446.m31704(c4848M54047.f11035.isEmpty());
                                            c24293 = new C24293(c4036, (C7650) c4848M54047.f11034);
                                            c20271.m45777(c24293);
                                        }
                                    }
                                } else if (!m15229(enumC228812)) {
                                    c4036.f8850 = this.f17293.m29738(c4036.f8850, c18537M42174);
                                    c23559.put(c4036, enumC228812);
                                    EnumC22889 enumC228813 = EnumC22889.TRANSPATTERNS;
                                    if (!m15229(enumC228813)) {
                                        C4257 c4257M8642 = C4257.m8642(c5127);
                                        AbstractC7257 abstractC7258 = c4036.f8850;
                                        c4257M8642.m8650(c4036, abstractC7258, c18537M42174);
                                        c4036.f8850 = abstractC7258;
                                        c23559.put(c4036, enumC228813);
                                        if (EnumC12477.f34975.m28726(this.f17268) && c22778.f71796) {
                                            EnumC22889 enumC228814 = EnumC22889.UNLAMBDA;
                                            if (!m15229(enumC228814)) {
                                                c4036.f8850 = C11097.m25542(c5127).m25568(c4036, c4036.f8850, c18537M42174);
                                                c23559.put(c4036, enumC228814);
                                                enumC22889 = EnumC22889.LOWER;
                                                if (!m15229(enumC22889)) {
                                                    if (z2) {
                                                        c7650 = (C7650) c4036.f8850;
                                                        if (abstractC7257 instanceof C7650) {
                                                            if (this.f17282.contains((C7650) abstractC7257)) {
                                                                c24293 = new C24293(c4036, c7650);
                                                                c20271.m45777(c24293);
                                                            }
                                                        }
                                                    } else {
                                                        c23559.put(c4036, enumC22889);
                                                        if (m15229(enumC22889)) {
                                                            for (c4848M54046 = this.f17314.m54046(c4036, c4036.f8850, c18537M42174); c4848M54046.m10293(); c4848M54046 = c4848M54046.f11035) {
                                                                c20271.m45777(new C24293(c4036, (C7650) c4848M54046.f11034));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            enumC22889 = EnumC22889.LOWER;
                                            if (!m15229(enumC22889)) {
                                                if (z2) {
                                                    c7650 = (C7650) c4036.f8850;
                                                    if (abstractC7257 instanceof C7650) {
                                                        if (this.f17282.contains((C7650) abstractC7257)) {
                                                            c24293 = new C24293(c4036, c7650);
                                                            c20271.m45777(c24293);
                                                        }
                                                    }
                                                } else {
                                                    c23559.put(c4036, enumC22889);
                                                    if (m15229(enumC22889)) {
                                                        while (c4848M54046.m10293()) {
                                                            c20271.m45777(new C24293(c4036, (C7650) c4848M54046.f11034));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                c23623.m9363(interfaceC19740M9363);
                            } catch (Throwable th) {
                                c23623.m9363(interfaceC19740M9363);
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        return m15229(EnumC22889.FLOW) ? new C20271() : c20271;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15231(Queue queue) {
        C10728 c10728 = this.f17287;
        if (m15229(EnumC22889.GENERATE)) {
            return;
        }
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            C24293 c24293 = (C24293) it.next();
            C4036 c4036 = (C4036) c24293.f76952;
            C7650 c7650 = (C7650) c24293.f76953;
            boolean z = this.f17307;
            boolean z2 = this.f17305;
            C23623 c23623 = this.f17286;
            if (z) {
                StringBuilder sb = new StringBuilder("[generate ");
                sb.append(z2 ? " source" : "code");
                sb.append(" ");
                sb.append(c7650.f20027);
                sb.append("]");
                c23623.m52455(EnumC22953.NOTICE, sb.toString());
            }
            C23936 c23936 = this.f17260;
            if (!c23936.m53034()) {
                c23936.m53035(new C21925(EnumC8513.GENERATE, c4036.f8851, c7650.f20027));
            }
            InterfaceC19740 interfaceC19740 = c4036.f8855.f20027.f45858;
            if (interfaceC19740 == null) {
                interfaceC19740 = c4036.f8851.f7516;
            }
            InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
            if (z2) {
                try {
                    try {
                        m15230(c4036, c7650);
                    } catch (IOException e) {
                        c7650.getClass();
                        C15828 c15828 = c7650.f20027;
                        String message = e.getMessage();
                        C14040 c14040 = C8300.f21997;
                        c23623.m9352(c7650, new C14040("compiler", "class.cant.write", c15828, message));
                        c23623.m9363(interfaceC19740M9363);
                        return;
                    }
                } catch (Throwable th) {
                    c23623.m9363(interfaceC19740M9363);
                    throw th;
                }
            } else {
                if (this.f17259.mo4108(EnumC22423.NATIVE_HEADER_OUTPUT) && c10728.m24672(c7650.f20027)) {
                    c10728.m24673(c7650.f20027);
                }
                m15219(c4036, c7650);
            }
            c23623.m9363(interfaceC19740M9363);
            if (!c23936.m53034()) {
                c23936.m53033(new C21925(EnumC8513.GENERATE, c4036.f8851, c7650.f20027));
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m15235() {
        int iM15234 = m15234();
        C23623 c23623 = this.f17286;
        if (iM15234 == 0 && this.f17296 && this.f17269 && this.f17265 == EnumC21437.UNSET) {
            if (this.f17271 || m15208(this.f17297)) {
                c23623.m9354(C15675.f45415);
            } else {
                c23623.m9354(C15675.f45420);
            }
        }
        this.f17298.m38336();
        this.f17299.m53748();
        if (c23623.f75186) {
            c23623.m9357((InterfaceC19740) null, C24393.f77212);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC12224 m15211(C6684 c6684, InterfaceC19740 interfaceC19740) {
        return c6684.m15206(interfaceC19740, new C10037(0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC12224 m15205(C6684 c6684, InterfaceC19740 interfaceC19740) {
        return c6684.m15206(interfaceC19740, new C4541(10));
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC12224 m15206(InterfaceC19740 interfaceC19740, Function function) {
        C23623 c23623 = this.f17286;
        C10212 c10212 = new C10212(c23623);
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
        try {
            return (AbstractC12224) function.apply(m15215(interfaceC19740, interfaceC19740.mo9471(false)));
        } catch (IOException unused) {
            return null;
        } finally {
            c23623.m52452(c10212);
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15220() {
        C8005 c8005 = this.f17302;
        C24769 c24769 = null;
        this.f17282 = null;
        this.f17277 = null;
        this.f17309 = null;
        this.f17289 = null;
        this.f17266 = null;
        this.f17257 = null;
        C6899 c6899 = this.f17278;
        if (c6899 != null) {
            c6899.clear();
        }
        this.f17278 = null;
        this.f17301 = null;
        this.f17272 = null;
        this.f17268 = null;
        this.f17300 = null;
        this.f17298 = null;
        this.f17310 = null;
        this.f17292 = null;
        this.f17293 = null;
        this.f17314 = null;
        this.f17284 = null;
        this.f17311 = null;
        this.f17286.m52462();
        try {
            try {
                this.f17259.flush();
                C8200 c8200 = this.f17285;
                if (c8200 != null) {
                    c8200.f21738.mo17849();
                }
                this.f17285 = null;
                Iterator it = this.f17290.iterator();
                while (it.hasNext()) {
                    try {
                        ((Closeable) it.next()).close();
                    } catch (IOException e) {
                        if (c24769 == null) {
                            c24769 = new C24769(c8005.m18543(C13665.f38507).toString(), e);
                        } else {
                            c24769.addSuppressed(e);
                        }
                    }
                }
                if (c24769 != null) {
                    throw c24769;
                }
                this.f17290 = C4848.m10283();
            } catch (IOException e2) {
                throw new C8479(e2);
            }
        } catch (Throwable th) {
            C8200 c8201 = this.f17285;
            if (c8201 != null) {
                c8201.f21738.mo17849();
            }
            this.f17285 = null;
            Iterator it2 = this.f17290.iterator();
            while (it2.hasNext()) {
                try {
                    ((Closeable) it2.next()).close();
                } catch (IOException e3) {
                    if (c24769 == null) {
                        c24769 = new C24769(c8005.m18543(C13665.f38507).toString(), e3);
                    } else {
                        c24769.addSuppressed(e3);
                    }
                }
            }
            if (c24769 != null) {
                throw c24769;
            }
            this.f17290 = C4848.m10283();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15221(int i, String str) {
        if (i != 0) {
            String strConcat = i == 1 ? "count.".concat(str) : C6988.m16053("count.", str, ".plural");
            EnumC22953 enumC22953 = EnumC22953.ERROR;
            Object[] objArr = {String.valueOf(i)};
            C23623 c23623 = this.f17286;
            C23623.m52440(c23623.m52447(enumC22953), c23623.m52449(EnumC16916.COMPILER_MISC, strConcat, objArr));
            c23623.m52447(enumC22953).flush();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15207(int i, int i2, String str) {
        if (i2 > 0) {
            EnumC22953 enumC22953 = EnumC22953.ERROR;
            Object[] objArr = {String.valueOf(i), String.valueOf(i2 + i)};
            C23623 c23623 = this.f17286;
            C23623.m52440(c23623.m52447(enumC22953), c23623.m52449(EnumC16916.COMPILER_MISC, str, objArr));
            c23623.m52447(enumC22953).flush();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3626 m15215(InterfaceC19740 interfaceC19740, CharSequence charSequence) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C3626 c3626M42213 = this.f17289.m42213(C4848.m10283());
        C23936 c23936 = this.f17260;
        if (charSequence != null) {
            C23623 c23623 = this.f17286;
            boolean z = this.f17313;
            if (z) {
                c23623.m52463("parsing.started", interfaceC19740);
            }
            if (!c23936.m53034()) {
                c23936.m53035(new C21925(EnumC8513.PARSE, interfaceC19740));
                this.f17283 = true;
                this.f17312 = true;
            }
            c3626M42213 = this.f17301.m39126(charSequence, this.f17283 || this.f17305, this.f17312, this.f17273, interfaceC19740.mo23288("module-info", EnumC18398.SOURCE)).m36121();
            if (z) {
                c23623.m52463("parsing.done", Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
        c3626M42213.f7516 = interfaceC19740;
        if (charSequence != null && !c23936.m53034()) {
            c23936.m53033(new C21925(EnumC8513.PARSE, c3626M42213));
        }
        return c3626M42213;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m15236() {
        this.f17288.clear();
        this.f17278.clear();
    }
}
