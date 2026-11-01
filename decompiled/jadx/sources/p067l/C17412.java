package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ܺۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A7L3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17412 {

    /* JADX INFO: renamed from: ۖ */
    public static final C6468 f52046 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public LinkedHashSet f52047;

    /* JADX INFO: renamed from: ۜ */
    public HashSet f52048;

    /* JADX INFO: renamed from: ۡ */
    public final C13565 f52049;

    /* JADX INFO: renamed from: ۢ */
    public final C23623 f52050;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC3154 f52051 = new C22108(this);

    /* JADX INFO: renamed from: ܳ */
    public boolean f52052;

    /* JADX INFO: renamed from: ܺ */
    public String f52053;

    /* JADX INFO: renamed from: ܽ */
    public final C5127 f52054;

    /* JADX INFO: renamed from: ܿ */
    public EnumC11379 f52055;

    /* JADX INFO: renamed from: ᩳ */
    public LinkedHashMap f52056;

    /* JADX INFO: renamed from: ᩷ */
    public LinkedHashSet f52057;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC13035 f52058;

    public C17412(C5127 c5127) {
        c5127.m10908(f52046, this);
        this.f52049 = C13565.m30871(c5127);
        this.f52050 = C23623.m52439(c5127);
        this.f52054 = c5127;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39641(ArrayList arrayList) {
        this.f52053 = "javac";
        this.f52055 = EnumC11379.LOG;
        this.f52057 = new LinkedHashSet();
        this.f52056 = new LinkedHashMap();
        this.f52048 = null;
        this.f52047 = new LinkedHashSet();
        Set setM3577 = EnumC2483.m3577();
        AbstractC3154 abstractC3154 = this.f52051;
        if (m39631(arrayList, setM3577, abstractC3154)) {
            EnumC2483 enumC2483 = EnumC2483.f3969;
            C13565 c13565 = this.f52049;
            String strM30873 = c13565.m30873(enumC2483);
            boolean z = strM30873 == null;
            InterfaceC10708 interfaceC10708 = new InterfaceC10708() { // from class: l.ܳۡ۠
                @Override // p067l.InterfaceC10708
                /* JADX INFO: renamed from: ֫ */
                public final void mo24637(EnumC2483 enumC2484) {
                    C14040 c14040 = C8300.f21997;
                    this.f47283.m39642(new C14040("compiler", "release.bootclasspath.conflict", enumC2484));
                }
            };
            EnumC2483 enumC2484 = EnumC2483.f3904;
            EnumC2483 enumC2485 = EnumC2483.f3981;
            m39643(z, interfaceC10708, EnumC2483.f3965, EnumC2483.f3921, EnumC2483.f3943, EnumC2483.f3984, EnumC2483.f3918, EnumC2483.f3913, EnumC2483.f3903, EnumC2483.f3968, enumC2484, enumC2485, EnumC2483.f3979, EnumC2483.f3974);
            if (strM30873 != null) {
                InterfaceC7888 interfaceC7888M8690 = C4277.m8690(strM30873);
                if (interfaceC7888M8690 == null) {
                    C14040 c14040 = C8300.f21997;
                    m39642(new C14040("compiler", "unsupported.release.version", strM30873));
                } else {
                    c13565.m30882(enumC2484, interfaceC7888M8690.m18224());
                    c13565.m30882(enumC2485, interfaceC7888M8690.m18225());
                    C5127 c5127 = this.f52054;
                    c5127.m10906(InterfaceC7888.class, interfaceC7888M8690);
                    if (m39631(interfaceC7888M8690.m18226(), setM3577, abstractC3154)) {
                        C2660.m4097(c5127, interfaceC7888M8690.m18227(), m39633());
                        c13565.m30878();
                    }
                }
            } else {
                c13565.m30878();
            }
        }
        if (this.f52052) {
            this.f52050.m52460(EnumC16916.JAVAC, "msg.usage", "javac");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Set m39648() {
        if (this.f52048 == null) {
            this.f52048 = new LinkedHashSet();
        }
        if (this.f52057 != null) {
            Iterator it = ((C13625) m39633()).m30983(this.f52057).iterator();
            while (it.hasNext()) {
                this.f52048.add((InterfaceC19740) it.next());
            }
        }
        return this.f52048;
    }

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashSet m39640() {
        return this.f52047;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m39631(Iterable iterable, Set set, AbstractC3154 abstractC3154) {
        EnumC2483 enumC2483M3560;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.isEmpty()) {
                C14040 c14040 = C8300.f21997;
                m39642(new C14040("compiler", "invalid.flag", str));
                return false;
            }
            if (str.startsWith("-")) {
                enumC2483M3560 = EnumC2483.m3560(str, set);
            } else {
                enumC2483M3560 = EnumC2483.f3929;
                if (!enumC2483M3560.mo3584(str)) {
                    enumC2483M3560 = null;
                }
            }
            if (enumC2483M3560 != null) {
                try {
                    enumC2483M3560.m3581(abstractC3154, str, it);
                } catch (C4496 e) {
                    String message = e.getMessage();
                    this.f52052 = true;
                    int iOrdinal = this.f52055.ordinal();
                    if (iOrdinal == 0) {
                        throw new C18438(new IllegalArgumentException(message, e.getCause()));
                    }
                    if (iOrdinal == 1) {
                        throw new C18438(new IllegalStateException(message, e.getCause()));
                    }
                    if (iOrdinal == 2) {
                        this.f52050.m52451(message);
                    }
                    return false;
                }
            } else {
                C14040 c14041 = C8300.f21997;
                m39642(new C14040("compiler", "invalid.flag", str));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0352  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:159:0x0386  */
    /* JADX WARN: Code duplicated, block: B:160:0x0388  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:189:0x047f  */
    /* JADX WARN: Code duplicated, block: B:191:0x048b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0497  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:198:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:202:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:204:0x04df  */
    /* JADX WARN: Code duplicated, block: B:209:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:213:0x0511  */
    /* JADX WARN: Code duplicated, block: B:217:0x0537  */
    /* JADX WARN: Code duplicated, block: B:219:0x053f  */
    /* JADX WARN: Code duplicated, block: B:221:0x054b  */
    /* JADX WARN: Code duplicated, block: B:222:0x054e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0559  */
    /* JADX WARN: Code duplicated, block: B:226:0x055b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0564  */
    /* JADX WARN: Code duplicated, block: B:230:0x0566  */
    /* JADX WARN: Code duplicated, block: B:233:0x0571  */
    /* JADX WARN: Code duplicated, block: B:234:0x0573 A[PHI: r16
      0x0573: PHI (r16v12 java.lang.String[]) = (r16v8 java.lang.String[]), (r16v9 java.lang.String[]), (r16v10 java.lang.String[]), (r16v13 java.lang.String[]) binds: [B:231:0x056e, B:227:0x0561, B:223:0x0556, B:221:0x054b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:236:0x0577  */
    /* JADX WARN: Code duplicated, block: B:238:0x057d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0595 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:243:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:245:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:247:0x05be  */
    /* JADX WARN: Code duplicated, block: B:249:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:250:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:253:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:260:0x060c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0615  */
    /* JADX WARN: Code duplicated, block: B:266:0x0628  */
    /* JADX WARN: Code duplicated, block: B:268:0x0630  */
    /* JADX WARN: Code duplicated, block: B:307:0x050c A[EDGE_INSN: B:307:0x050c->B:212:0x050c BREAK  A[LOOP:3: B:200:0x04d0->B:211:0x0501], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:266:0x0628, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩻ */
    public final boolean m39649() {
        EnumC17840 enumC17840M40514;
        final EnumC12720 enumC12720M40519;
        char c;
        Object obj;
        boolean z;
        EnumC12720 enumC12720;
        EnumC12720 enumC12721;
        boolean z2;
        String str;
        boolean z3;
        EnumC2483 enumC2483;
        EnumC5698 enumC5698M40513;
        String strM30873;
        Object obj2;
        String str2;
        String strM30874;
        EnumC2483 enumC2484;
        String strM30875;
        String strM30876;
        EnumC2483 enumC2485;
        String strM30877;
        int i;
        Pattern patternMo3587;
        String[] strArrSplit;
        int length;
        int i2;
        Matcher matcher;
        String strGroup;
        String[] strArrSplit2;
        int length2;
        int i3;
        String str3;
        String[] strArrSplit3;
        int length3;
        int i4;
        String str4;
        String[] strArr;
        byte b;
        Pattern patternMo3588;
        String[] strArrSplit4;
        int length4;
        int i5;
        Matcher matcher2;
        int i6;
        Object obj3;
        String str5;
        Pattern pattern;
        String strGroup2;
        String strGroup3;
        String[] strArrSplit5;
        int length5;
        int i7;
        String str6;
        int i8;
        Object obj4;
        char c2;
        InterfaceC22097 parent;
        InterfaceC13035 interfaceC13035M39633 = m39633();
        EnumC2483 enumC2486 = EnumC2483.f3942;
        C13565 c13565 = this.f52049;
        boolean zM30880 = c13565.m30880(enumC2486);
        C23623 c23623 = this.f52050;
        if (zM30880) {
            if (!interfaceC13035M39633.mo4108(EnumC22423.CLASS_OUTPUT)) {
                c23623.m9355(C8300.f22144);
            } else if (!interfaceC13035M39633.mo4108(EnumC22423.MODULE_SOURCE_PATH)) {
                c23623.m9355(C8300.f22120);
            } else {
                try {
                    for (String str7 : Arrays.asList(c13565.m30873(enumC2486).split(","))) {
                        InterfaceC4317 interfaceC4317Mo4112 = interfaceC13035M39633.mo4112(EnumC22423.MODULE_SOURCE_PATH, str7);
                        if (interfaceC4317Mo4112 == null) {
                            C14040 c14040 = C8300.f21997;
                            c23623.m9355(new C14040("compiler", "module.not.found.in.module.source.path", str7));
                        } else {
                            InterfaceC4317 interfaceC4317Mo4113 = interfaceC13035M39633.mo4112(EnumC22423.CLASS_OUTPUT, str7);
                            for (InterfaceC19740 interfaceC19740 : interfaceC13035M39633.mo4100(interfaceC4317Mo4112, "", (Set) EnumSet.of(EnumC18398.SOURCE), true)) {
                                InterfaceC19740 interfaceC19740Mo4105 = interfaceC13035M39633.mo4105(interfaceC4317Mo4113, interfaceC13035M39633.mo4101(interfaceC4317Mo4112, interfaceC19740), EnumC18398.CLASS);
                                if (interfaceC19740Mo4105 == null || interfaceC19740Mo4105.mo22779() < interfaceC19740.mo22779()) {
                                    if (this.f52048 == null) {
                                        this.f52048 = new HashSet();
                                    }
                                    this.f52048.add(interfaceC19740);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    c23623.m52460(EnumC16916.JAVAC, "msg.io", new Object[0]);
                    e.printStackTrace(c23623.m52447(EnumC22953.NOTICE));
                    return false;
                }
            }
        }
        if (m39645()) {
            if (c13565.m30880(EnumC2483.f3916) || c13565.m30880(EnumC2483.f3937) || c13565.m30880(EnumC2483.f3911) || c13565.m30880(EnumC2483.f3912) || c13565.m30880(EnumC2483.f3928) || c13565.m30880(EnumC2483.f3942)) {
                return true;
            }
            if (!this.f52052) {
                if (C6684.m15208(c13565)) {
                    m39642(C8300.f22132);
                    return false;
                }
                m39642(C8300.f22017);
                return false;
            }
        } else if (m39632(EnumC2483.f3985) && m39632(EnumC2483.f3972) && m39632(EnumC2483.f3973)) {
            if (interfaceC13035M39633 instanceof InterfaceC25104) {
                InterfaceC25104 interfaceC25104 = (InterfaceC25104) interfaceC13035M39633;
                EnumC22423 enumC22423 = EnumC22423.CLASS_OUTPUT;
                if (interfaceC25104.mo4108(enumC22423)) {
                    InterfaceC22097 interfaceC22097 = (InterfaceC22097) interfaceC25104.mo30988(enumC22423).iterator().next();
                    if (interfaceC25104.mo4108(EnumC22423.MODULE_SOURCE_PATH)) {
                        if (C18743.exists(interfaceC22097.resolve("module-info.class"), new EnumC16060[0])) {
                            C14040 c14041 = C8300.f21997;
                            c23623.m9355(new C14040("compiler", "multi-module.outdir.cannot.be.exploded.module", interfaceC22097));
                        }
                    } else {
                        EnumC2483 enumC2487 = EnumC2483.f3953;
                        StringBuilder sb = new StringBuilder("-");
                        EnumC21706 enumC21706 = EnumC21706.PATH;
                        sb.append(enumC21706.f68387);
                        if (c13565.m30881(enumC2487, sb.toString()) && (parent = interfaceC22097.getParent()) != null && C18743.exists(parent.resolve("module-info.class"), new EnumC16060[0])) {
                            C12895 c12895 = C15675.f45417;
                            c23623.m9361(enumC21706, new C12895("compiler", "outdir.is.in.exploded.module", interfaceC22097));
                        }
                    }
                }
            }
            String strM30878 = c13565.m30873(EnumC2483.f3904);
            if (strM30878 != null) {
                enumC17840M40514 = EnumC17840.m40514(strM30878);
            } else {
                enumC17840M40514 = EnumC17840.f53233;
            }
            String strM30879 = c13565.m30873(EnumC2483.f3981);
            if (strM30879 != null) {
                enumC12720M40519 = EnumC12720.m29245(strM30879);
            } else {
                enumC12720M40519 = EnumC12720.f35712;
            }
            if (Character.isDigit(enumC12720M40519.f35733.charAt(0)) && enumC12720M40519.compareTo(enumC17840M40514.m40519()) < 0) {
                if (strM30879 != null) {
                    if (strM30878 == null) {
                        EnumC12720 enumC12720M405110 = enumC17840M40514.m40519();
                        C12895 c12896 = C15675.f45417;
                        m39642(new C12895("compiler", "target.default.source.conflict", strM30879, enumC12720M405110));
                        return false;
                    }
                    EnumC12720 enumC12720M405111 = enumC17840M40514.m40519();
                    C12895 c12897 = C15675.f45417;
                    m39642(new C12895("compiler", "source.target.conflict", strM30878, enumC12720M405111));
                    return false;
                }
                enumC12720M40519 = enumC17840M40514.m40519();
                c13565.m30876("-target", enumC12720M40519.f35733);
            }
            if (c13565.m30880(EnumC2483.f3986)) {
                if (strM30878 == null) {
                    m39635(C8300.f22066);
                    return false;
                }
                EnumC17840 enumC17840 = EnumC17840.f53233;
                if (enumC17840M40514 != enumC17840) {
                    C14040 c14042 = C8300.f21997;
                    m39635(new C14040("compiler", "preview.not.latest", strM30878, enumC17840));
                    return false;
                }
            }
            EnumC2483 enumC2488 = EnumC2483.f3909;
            String strM308710 = c13565.m30873(enumC2488);
            if (strM308710 != null) {
                EnumC8045 enumC8045M18666 = EnumC8045.m18666(strM308710);
                if (enumC12720M40519.compareTo(EnumC12720.JDK1_8) > 0 || enumC8045M18666.mo18669(enumC12720M40519)) {
                    c2 = 0;
                } else {
                    C12895 c12898 = C15675.f45417;
                    c2 = 0;
                    m39642(new C12895("compiler", "profile.target.conflict", enumC8045M18666, enumC12720M40519));
                }
                if (c13565.m30873(EnumC2483.f3965) != null) {
                    m39642(C8300.f22165);
                }
                c = c2;
            } else {
                c = 0;
            }
            if (c13565.m30880(EnumC2483.f3955) && c13565.m30880(EnumC2483.f3949)) {
                m39642(C8300.f22134);
            }
            EnumC2483 enumC2489 = EnumC2483.f3953;
            StringBuilder sb2 = new StringBuilder("-");
            EnumC21706 enumC21707 = EnumC21706.OPTIONS;
            sb2.append(enumC21707.f68387);
            boolean zM30881 = c13565.m30881(enumC2489, sb2.toString());
            if (zM30881 && enumC17840M40514.compareTo(EnumC17840.f53233) < 0 && !c13565.m30880(EnumC2483.f3969) && (interfaceC13035M39633 instanceof AbstractC22343)) {
                AbstractC22343 abstractC22343 = (AbstractC22343) interfaceC13035M39633;
                if (enumC17840M40514.compareTo(EnumC17840.JDK8) <= 0) {
                    if (abstractC22343.m50166()) {
                        String str8 = enumC17840M40514.f53238;
                        C12895 c12899 = C15675.f45417;
                        Object[] objArr = new Object[1];
                        objArr[c] = str8;
                        c23623.m9361(enumC21707, new C12895("compiler", "source.no.bootclasspath", objArr));
                    }
                } else if (abstractC22343.m50167()) {
                    String str9 = enumC17840M40514.f53238;
                    C12895 c128910 = C15675.f45417;
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = str9;
                    c23623.m9361(enumC21707, new C12895("compiler", "source.no.system.modules.path", objArr2));
                }
            }
            EnumC17840 enumC17841 = EnumC17840.f53220;
            if (enumC17840M40514.compareTo(enumC17841) < 0) {
                String str10 = enumC17840M40514.f53238;
                String str11 = enumC17841.f53238;
                C14040 c14043 = C8300.f21997;
                obj = "";
                Object[] objArr3 = new Object[2];
                objArr3[c] = str10;
                objArr3[1] = str11;
                c23623.m9355(new C14040("compiler", "option.removed.source", objArr3));
            } else {
                obj = "";
                if (enumC17840M40514 == enumC17841 && zM30881) {
                    String str12 = enumC17840M40514.f53238;
                    C12895 c128911 = C15675.f45417;
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = str12;
                    c23623.m9361(enumC21707, new C12895("compiler", "option.obsolete.source", objArr4));
                    z = true;
                }
                enumC12720 = EnumC12720.f35717;
                if (enumC12720M40519.compareTo(enumC12720) < 0) {
                    C14040 c14044 = C8300.f21997;
                    Object[] objArr5 = new Object[2];
                    objArr5[c] = enumC12720M40519;
                    objArr5[1] = enumC12720;
                    c23623.m9355(new C14040("compiler", "option.removed.target", objArr5));
                } else if (enumC12720M40519 == enumC12720 && zM30881) {
                    C12895 c128912 = C15675.f45417;
                    Object[] objArr6 = new Object[1];
                    objArr6[c] = enumC12720M40519;
                    c23623.m9361(enumC21707, new C12895("compiler", "option.obsolete.target", objArr6));
                    z = true;
                }
                enumC12721 = EnumC12720.JDK1_8;
                if (enumC12720M40519.compareTo(enumC12721) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC10708 interfaceC10708 = new InterfaceC10708() { // from class: l.ᩳۡ۠
                    @Override // p067l.InterfaceC10708
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo24637(EnumC2483 enumC24810) {
                        C14040 c14045 = C8300.f21997;
                        this.f59145.m39642(new C14040("compiler", "option.not.allowed.with.target", enumC24810, enumC12720M40519));
                    }
                };
                str = ",";
                EnumC2483[] enumC2483Arr = new EnumC2483[9];
                enumC2483Arr[c] = EnumC2483.f3965;
                enumC2483Arr[1] = EnumC2483.f3984;
                enumC2483Arr[2] = EnumC2483.f3921;
                enumC2483Arr[3] = EnumC2483.f3943;
                enumC2483Arr[4] = EnumC2483.f3918;
                enumC2483Arr[5] = EnumC2483.f3913;
                enumC2483Arr[6] = EnumC2483.f3903;
                enumC2483Arr[7] = EnumC2483.f3968;
                enumC2483Arr[8] = enumC2488;
                m39643(z2, interfaceC10708, enumC2483Arr);
                if (enumC12720M40519.compareTo(EnumC12720.JDK1_9) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                InterfaceC10708 interfaceC10709 = new InterfaceC10708() { // from class: l.ܿۡ۠
                    @Override // p067l.InterfaceC10708
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo24637(EnumC2483 enumC24810) {
                        C14040 c14045 = C8300.f21997;
                        this.f56038.m39642(new C14040("compiler", "option.not.allowed.with.target", enumC24810, enumC12720M40519));
                    }
                };
                enumC2483 = EnumC2483.f3948;
                EnumC2483[] enumC2483Arr2 = new EnumC2483[10];
                enumC2483Arr2[c] = EnumC2483.f3949;
                enumC2483Arr2[1] = EnumC2483.f3974;
                enumC2483Arr2[2] = EnumC2483.f3979;
                enumC2483Arr2[3] = EnumC2483.f3983;
                enumC2483Arr2[4] = EnumC2483.f3925;
                enumC2483Arr2[5] = enumC2483;
                enumC2483Arr2[6] = EnumC2483.f3905;
                enumC2483Arr2[7] = EnumC2483.f3938;
                enumC2483Arr2[8] = EnumC2483.f3920;
                enumC2483Arr2[9] = EnumC2483.f3963;
                m39643(z3, interfaceC10709, enumC2483Arr2);
                if (zM30881 && c13565.m30880(EnumC2483.f3966) && !enumC12720M40519.m29252()) {
                    C12895 c128913 = C15675.f45417;
                    Object[] objArr7 = new Object[2];
                    objArr7[c] = enumC12720M40519;
                    objArr7[1] = enumC12721;
                    c23623.m9354(new C12895("compiler", "option.parameters.unsupported", objArr7));
                }
                if (interfaceC13035M39633.mo4108(EnumC22423.MODULE_SOURCE_PATH) && !c13565.m30877(EnumC2483.f3976, "only") && !interfaceC13035M39633.mo4108(EnumC22423.CLASS_OUTPUT)) {
                    c23623.m9355(C8300.f22108);
                }
                if (interfaceC13035M39633.mo4108(EnumC22423.ANNOTATION_PROCESSOR_MODULE_PATH) && interfaceC13035M39633.mo4108(EnumC22423.ANNOTATION_PROCESSOR_PATH)) {
                    c23623.m9355(C8300.f22077);
                }
                if (z && zM30881) {
                    c23623.m9361(enumC21707, C15675.f45418);
                }
                enumC5698M40513 = EnumC17840.m40513(enumC17840M40514);
                strM30873 = c13565.m30873(enumC2483);
                if (strM30873 != null) {
                    patternMo3588 = enumC2483.mo3587();
                    strArrSplit4 = strM30873.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                    length4 = strArrSplit4.length;
                    i5 = 0;
                    while (i5 < length4) {
                        matcher2 = patternMo3588.matcher(strArrSplit4[i5]);
                        if (matcher2.matches()) {
                            strGroup2 = matcher2.group(1);
                            if (!EnumC5698.m12687(strGroup2, enumC5698M40513)) {
                                c23623.m9354(C15675.m35720(EnumC2483.f3948, strGroup2));
                            }
                            strGroup3 = matcher2.group(2);
                            if (!EnumC5698.m12687(strGroup3, enumC5698M40513)) {
                                c23623.m9354(C15675.m35720(EnumC2483.f3948, strGroup3));
                            }
                            str5 = str;
                            strArrSplit5 = matcher2.group(3).split(str5);
                            length5 = strArrSplit5.length;
                            i7 = 0;
                            while (true) {
                                pattern = patternMo3588;
                                if (i7 < length5) {
                                    break;
                                }
                                str6 = strArrSplit5[i7];
                                str6.getClass();
                                if (str6.equals("ALL-UNNAMED")) {
                                    i8 = length4;
                                    obj4 = obj;
                                } else {
                                    i8 = length4;
                                    obj4 = obj;
                                    if (str6.equals(obj4) && !EnumC5698.m12687(str6, enumC5698M40513)) {
                                        c23623.m9354(C15675.m35720(EnumC2483.f3948, str6));
                                    }
                                    i7++;
                                    strArrSplit5 = strArrSplit5;
                                    patternMo3588 = pattern;
                                    obj = obj4;
                                    length4 = i8;
                                }
                                i7++;
                                strArrSplit5 = strArrSplit5;
                                patternMo3588 = pattern;
                                obj = obj4;
                                length4 = i8;
                            }
                            i6 = length4;
                            obj3 = obj;
                        } else {
                            i6 = length4;
                            obj3 = obj;
                            str5 = str;
                            pattern = patternMo3588;
                        }
                        i5++;
                        obj = obj3;
                        patternMo3588 = pattern;
                        strArrSplit4 = strArrSplit4;
                        length4 = i6;
                        str = str5;
                    }
                }
                obj2 = obj;
                str2 = str;
                strM30874 = c13565.m30873(EnumC2483.f3925);
                if (strM30874 != null) {
                    strArrSplit3 = strM30874.split(str2);
                    i4 = 0;
                    for (length3 = strArrSplit3.length; i4 < length3; length3 = length3) {
                        str4 = strArrSplit3[i4];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1057501189:
                                strArr = strArrSplit3;
                                if (str4.equals("ALL-SYSTEM")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 0:
                                strArr = strArrSplit3;
                                if (str4.equals(obj2)) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1070226586:
                                strArr = strArrSplit3;
                                if (str4.equals("ALL-MODULE-PATH")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                strArr = strArrSplit3;
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (!EnumC5698.m12687(str4, enumC5698M40513)) {
                                    C14040 c14045 = C8300.f21997;
                                    Object[] objArr8 = new Object[2];
                                    objArr8[c] = EnumC2483.f3925;
                                    objArr8[1] = str4;
                                    c23623.m9355(new C14040("compiler", "bad.name.for.option", objArr8));
                                    break;
                                }
                            case 0:
                            case 1:
                            case 2:
                                break;
                        }
                        i4++;
                        strArrSplit3 = strArr;
                    }
                }
                enumC2484 = EnumC2483.f3938;
                strM30875 = c13565.m30873(enumC2484);
                if (strM30875 != null) {
                    patternMo3587 = enumC2484.mo3587();
                    strArrSplit = strM30875.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                    length = strArrSplit.length;
                    i2 = 0;
                    while (i2 < length) {
                        matcher = patternMo3587.matcher(strArrSplit[i2]);
                        if (matcher.matches()) {
                            strGroup = matcher.group(1);
                            if (!EnumC5698.m12687(strGroup, enumC5698M40513)) {
                                c23623.m9354(C15675.m35720(EnumC2483.f3938, strGroup));
                            }
                            strArrSplit2 = matcher.group(2).split(str2, -1);
                            length2 = strArrSplit2.length;
                            i3 = 0;
                            while (i3 < length2) {
                                int i9 = length2;
                                str3 = strArrSplit2[i3];
                                str3.getClass();
                                if (str3.equals("ALL-UNNAMED") && !str3.equals(obj2) && !EnumC5698.m12687(str3, enumC5698M40513)) {
                                    c23623.m9354(C15675.m35720(EnumC2483.f3938, str3));
                                }
                                i3++;
                                length2 = i9;
                                strArrSplit2 = strArrSplit2;
                            }
                        } else {
                            strArrSplit = strArrSplit;
                        }
                        i2++;
                        patternMo3587 = patternMo3587;
                        strArrSplit = strArrSplit;
                    }
                }
                strM30876 = c13565.m30873(EnumC2483.f3920);
                if (strM30876 != null) {
                    for (String str13 : strM30876.split(str2)) {
                        str13.getClass();
                        if (str13.equals(obj2) && !EnumC5698.m12687(str13, enumC5698M40513)) {
                            C14040 c14046 = C8300.f21997;
                            Object[] objArr9 = new Object[2];
                            objArr9[c] = EnumC2483.f3920;
                            objArr9[1] = str13;
                            c23623.m9355(new C14040("compiler", "bad.name.for.option", objArr9));
                        }
                    }
                }
                enumC2485 = EnumC2483.f3933;
                strM30877 = c13565.m30873(enumC2485);
                if (strM30877 != null && !EnumC5698.m12687(strM30877, enumC5698M40513)) {
                    C14040 c14047 = C8300.f21997;
                    Object[] objArr10 = new Object[2];
                    objArr10[c] = enumC2485;
                    objArr10[1] = strM30877;
                    c23623.m9355(new C14040("compiler", "bad.name.for.option", objArr10));
                }
                if (zM30881 && c13565.m30880(EnumC2483.f3905)) {
                    c23623.m9361(EnumC21706.OPTIONS, C15675.f45417);
                }
                if (this.f52052 && c23623.f75180 == 0) {
                    return true;
                }
                return c;
            }
            z = false;
            enumC12720 = EnumC12720.f35717;
            if (enumC12720M40519.compareTo(enumC12720) < 0) {
                C14040 c14048 = C8300.f21997;
                Object[] objArr11 = new Object[2];
                objArr11[c] = enumC12720M40519;
                objArr11[1] = enumC12720;
                c23623.m9355(new C14040("compiler", "option.removed.target", objArr11));
            } else if (enumC12720M40519 == enumC12720) {
                C12895 c128914 = C15675.f45417;
                Object[] objArr12 = new Object[1];
                objArr12[c] = enumC12720M40519;
                c23623.m9361(enumC21707, new C12895("compiler", "option.obsolete.target", objArr12));
                z = true;
            }
            enumC12721 = EnumC12720.JDK1_8;
            if (enumC12720M40519.compareTo(enumC12721) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            InterfaceC10708 interfaceC107010 = new InterfaceC10708() { // from class: l.ᩳۡ۠
                @Override // p067l.InterfaceC10708
                /* JADX INFO: renamed from: ֫ */
                public final void mo24637(EnumC2483 enumC24810) {
                    C14040 c14049 = C8300.f21997;
                    this.f59145.m39642(new C14040("compiler", "option.not.allowed.with.target", enumC24810, enumC12720M40519));
                }
            };
            str = ",";
            EnumC2483[] enumC2483Arr3 = new EnumC2483[9];
            enumC2483Arr3[c] = EnumC2483.f3965;
            enumC2483Arr3[1] = EnumC2483.f3984;
            enumC2483Arr3[2] = EnumC2483.f3921;
            enumC2483Arr3[3] = EnumC2483.f3943;
            enumC2483Arr3[4] = EnumC2483.f3918;
            enumC2483Arr3[5] = EnumC2483.f3913;
            enumC2483Arr3[6] = EnumC2483.f3903;
            enumC2483Arr3[7] = EnumC2483.f3968;
            enumC2483Arr3[8] = enumC2488;
            m39643(z2, interfaceC107010, enumC2483Arr3);
            if (enumC12720M40519.compareTo(EnumC12720.JDK1_9) >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            InterfaceC10708 interfaceC107011 = new InterfaceC10708() { // from class: l.ܿۡ۠
                @Override // p067l.InterfaceC10708
                /* JADX INFO: renamed from: ֫ */
                public final void mo24637(EnumC2483 enumC24810) {
                    C14040 c14049 = C8300.f21997;
                    this.f56038.m39642(new C14040("compiler", "option.not.allowed.with.target", enumC24810, enumC12720M40519));
                }
            };
            enumC2483 = EnumC2483.f3948;
            EnumC2483[] enumC2483Arr4 = new EnumC2483[10];
            enumC2483Arr4[c] = EnumC2483.f3949;
            enumC2483Arr4[1] = EnumC2483.f3974;
            enumC2483Arr4[2] = EnumC2483.f3979;
            enumC2483Arr4[3] = EnumC2483.f3983;
            enumC2483Arr4[4] = EnumC2483.f3925;
            enumC2483Arr4[5] = enumC2483;
            enumC2483Arr4[6] = EnumC2483.f3905;
            enumC2483Arr4[7] = EnumC2483.f3938;
            enumC2483Arr4[8] = EnumC2483.f3920;
            enumC2483Arr4[9] = EnumC2483.f3963;
            m39643(z3, interfaceC107011, enumC2483Arr4);
            if (zM30881) {
                C12895 c128915 = C15675.f45417;
                Object[] objArr13 = new Object[2];
                objArr13[c] = enumC12720M40519;
                objArr13[1] = enumC12721;
                c23623.m9354(new C12895("compiler", "option.parameters.unsupported", objArr13));
            }
            if (interfaceC13035M39633.mo4108(EnumC22423.MODULE_SOURCE_PATH)) {
                c23623.m9355(C8300.f22108);
            }
            if (interfaceC13035M39633.mo4108(EnumC22423.ANNOTATION_PROCESSOR_MODULE_PATH)) {
                c23623.m9355(C8300.f22077);
            }
            if (z) {
                c23623.m9361(enumC21707, C15675.f45418);
            }
            enumC5698M40513 = EnumC17840.m40513(enumC17840M40514);
            strM30873 = c13565.m30873(enumC2483);
            if (strM30873 != null) {
                patternMo3588 = enumC2483.mo3587();
                strArrSplit4 = strM30873.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                length4 = strArrSplit4.length;
                i5 = 0;
                while (i5 < length4) {
                    matcher2 = patternMo3588.matcher(strArrSplit4[i5]);
                    if (matcher2.matches()) {
                        strGroup2 = matcher2.group(1);
                        if (!EnumC5698.m12687(strGroup2, enumC5698M40513)) {
                            c23623.m9354(C15675.m35720(EnumC2483.f3948, strGroup2));
                        }
                        strGroup3 = matcher2.group(2);
                        if (!EnumC5698.m12687(strGroup3, enumC5698M40513)) {
                            c23623.m9354(C15675.m35720(EnumC2483.f3948, strGroup3));
                        }
                        str5 = str;
                        strArrSplit5 = matcher2.group(3).split(str5);
                        length5 = strArrSplit5.length;
                        i7 = 0;
                        while (true) {
                            pattern = patternMo3588;
                            if (i7 < length5) {
                                break;
                                break;
                            }
                            str6 = strArrSplit5[i7];
                            str6.getClass();
                            if (str6.equals("ALL-UNNAMED")) {
                                i8 = length4;
                                obj4 = obj;
                                if (str6.equals(obj4)) {
                                }
                                i7++;
                                strArrSplit5 = strArrSplit5;
                                patternMo3588 = pattern;
                                obj = obj4;
                                length4 = i8;
                            } else {
                                i8 = length4;
                                obj4 = obj;
                            }
                            i7++;
                            strArrSplit5 = strArrSplit5;
                            patternMo3588 = pattern;
                            obj = obj4;
                            length4 = i8;
                        }
                        i6 = length4;
                        obj3 = obj;
                    } else {
                        i6 = length4;
                        obj3 = obj;
                        str5 = str;
                        pattern = patternMo3588;
                    }
                    i5++;
                    obj = obj3;
                    patternMo3588 = pattern;
                    strArrSplit4 = strArrSplit4;
                    length4 = i6;
                    str = str5;
                }
            }
            obj2 = obj;
            str2 = str;
            strM30874 = c13565.m30873(EnumC2483.f3925);
            if (strM30874 != null) {
                strArrSplit3 = strM30874.split(str2);
                i4 = 0;
                while (i4 < length3) {
                    str4 = strArrSplit3[i4];
                    str4.getClass();
                    switch (str4.hashCode()) {
                        case -1057501189:
                            strArr = strArrSplit3;
                            if (str4.equals("ALL-SYSTEM")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 0:
                            strArr = strArrSplit3;
                            if (str4.equals(obj2)) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 1070226586:
                            strArr = strArrSplit3;
                            if (str4.equals("ALL-MODULE-PATH")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        default:
                            strArr = strArrSplit3;
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (!EnumC5698.m12687(str4, enumC5698M40513)) {
                                C14040 c14049 = C8300.f21997;
                                Object[] objArr14 = new Object[2];
                                objArr14[c] = EnumC2483.f3925;
                                objArr14[1] = str4;
                                c23623.m9355(new C14040("compiler", "bad.name.for.option", objArr14));
                                break;
                            }
                        case 0:
                        case 1:
                        case 2:
                            break;
                    }
                    i4++;
                    strArrSplit3 = strArr;
                }
            }
            enumC2484 = EnumC2483.f3938;
            strM30875 = c13565.m30873(enumC2484);
            if (strM30875 != null) {
                patternMo3587 = enumC2484.mo3587();
                strArrSplit = strM30875.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                length = strArrSplit.length;
                i2 = 0;
                while (i2 < length) {
                    matcher = patternMo3587.matcher(strArrSplit[i2]);
                    if (matcher.matches()) {
                        strGroup = matcher.group(1);
                        if (!EnumC5698.m12687(strGroup, enumC5698M40513)) {
                            c23623.m9354(C15675.m35720(EnumC2483.f3938, strGroup));
                        }
                        strArrSplit2 = matcher.group(2).split(str2, -1);
                        length2 = strArrSplit2.length;
                        i3 = 0;
                        while (i3 < length2) {
                            int i10 = length2;
                            str3 = strArrSplit2[i3];
                            str3.getClass();
                            if (str3.equals("ALL-UNNAMED")) {
                            }
                            i3++;
                            length2 = i10;
                            strArrSplit2 = strArrSplit2;
                        }
                    } else {
                        strArrSplit = strArrSplit;
                    }
                    i2++;
                    patternMo3587 = patternMo3587;
                    strArrSplit = strArrSplit;
                }
            }
            strM30876 = c13565.m30873(EnumC2483.f3920);
            if (strM30876 != null) {
                while (i < r4) {
                    str13.getClass();
                    if (str13.equals(obj2)) {
                    }
                }
            }
            enumC2485 = EnumC2483.f3933;
            strM30877 = c13565.m30873(enumC2485);
            if (strM30877 != null) {
                C14040 c140410 = C8300.f21997;
                Object[] objArr15 = new Object[2];
                objArr15[c] = enumC2485;
                objArr15[1] = strM30877;
                c23623.m9355(new C14040("compiler", "bad.name.for.option", objArr15));
            }
            if (zM30881) {
                c23623.m9361(EnumC21706.OPTIONS, C15675.f45417);
            }
            if (this.f52052) {
            }
            return c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m39645() {
        LinkedHashSet linkedHashSet = this.f52057;
        if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
            return false;
        }
        HashSet hashSet = this.f52048;
        if (hashSet != null && !hashSet.isEmpty()) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = this.f52047;
        return linkedHashSet2 == null || linkedHashSet2.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap m39644() {
        return this.f52056;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Set m39647() {
        String strM30873 = this.f52049.m30873(EnumC2483.f3952);
        if (strM30873 == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strM30873.split("\\x00")) {
            linkedHashSet.add(C4848.m10282((Object[]) str.split("\\s+")));
        }
        return C21562.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m39646() {
        EnumC2483 enumC2483 = EnumC2483.f3907;
        C13565 c13565 = this.f52049;
        String strM30873 = c13565.m30873(enumC2483);
        String strM30874 = c13565.m30873(EnumC2483.f3940);
        if (strM30873 == null && strM30874 == null) {
            return C4848.m10283();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (strM30873 != null) {
            linkedHashSet.add("-Xmsgs");
        }
        if (strM30874 != null) {
            for (String str : strM30874.split("\\s+")) {
                if (!str.isEmpty()) {
                    linkedHashSet.add("-Xmsgs:".concat(str));
                }
            }
        }
        if (linkedHashSet.equals(Collections.singleton("-Xmsgs:none"))) {
            return C4848.m10283();
        }
        String strM30875 = c13565.m30873(EnumC2483.f3961);
        if (strM30875 != null) {
            linkedHashSet.add("-XcheckPackage:".concat(strM30875));
        }
        return C4848.m10282(linkedHashSet.toArray(new String[linkedHashSet.size()]));
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m39632(EnumC2483 enumC2483) {
        String strM30873 = this.f52049.m30873(enumC2483);
        if (strM30873 != null) {
            InterfaceC22097 interfaceC22097 = C10697.get(strM30873, new String[0]);
            if (C18743.exists(interfaceC22097, new EnumC16060[0]) && !C18743.isDirectory(interfaceC22097, new EnumC16060[0])) {
                C14040 c14040 = C8300.f21997;
                m39642(new C14040("compiler", "file.not.directory", strM30873));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39643(boolean z, final InterfaceC10708 interfaceC10708, EnumC2483... enumC2483Arr) {
        if (z) {
            return;
        }
        InterfaceC19157 interfaceC19157M42024of = C18486.m42024of((Object[]) enumC2483Arr);
        final C13565 c13565 = this.f52049;
        C12826.requireNonNull(c13565);
        interfaceC19157M42024of.filter(new Predicate() { // from class: l.᩻ۡ۠
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
            public /* synthetic */ Predicate m54443or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return c13565.m30880((EnumC2483) obj);
            }
        }).forEach(new Consumer() { // from class: l.ۜۡ۠
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                interfaceC10708.mo24637((EnumC2483) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39642(AbstractC6664 abstractC6664) {
        this.f52052 = true;
        int iOrdinal = this.f52055.ordinal();
        C23623 c23623 = this.f52050;
        if (iOrdinal == 0) {
            throw new C18438(new IllegalArgumentException(c23623.m52448(abstractC6664)));
        }
        if (iOrdinal == 1) {
            throw new C18438(new IllegalStateException(c23623.m52448(abstractC6664)));
        }
        if (iOrdinal != 2) {
            return;
        }
        m39635(abstractC6664);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m39635(AbstractC6664 abstractC6664) {
        boolean z = abstractC6664 instanceof C14040;
        C23623 c23623 = this.f52050;
        if (z) {
            c23623.m9355((C14040) abstractC6664);
        } else if (abstractC6664 instanceof C12895) {
            c23623.m9354((C12895) abstractC6664);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private InterfaceC13035 m39633() {
        if (this.f52058 == null) {
            this.f52058 = (InterfaceC13035) this.f52054.m10904(InterfaceC13035.class);
        }
        return this.f52058;
    }
}
