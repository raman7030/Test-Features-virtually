package l;

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
public final class C15829 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C4314 f48908 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f48909;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashSet f48910;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C11781 f48911;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C22364 f48912;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC0827 f48913 = new C20770(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f48914;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f48915;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2903 f48916;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC9481 f48917;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f48918;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f48919;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC11223 f48920;

    public C15829(C2903 c2903) {
        c2903.m8841(f48908, this);
        this.f48911 = C11781.m28823(c2903);
        this.f48912 = C22364.m50099(c2903);
        this.f48916 = c2903;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37469(ArrayList arrayList) {
        this.f48915 = "javac";
        this.f48917 = EnumC9481.LOG;
        this.f48919 = new LinkedHashSet();
        this.f48918 = new LinkedHashMap();
        this.f48910 = null;
        this.f48909 = new LinkedHashSet();
        Set setM1176 = EnumC0121.m1176();
        AbstractC0827 abstractC0827 = this.f48913;
        if (m37459(arrayList, setM1176, abstractC0827)) {
            EnumC0121 enumC0121 = EnumC0121.f1193;
            C11781 c11781 = this.f48911;
            String strM28825 = c11781.m28825(enumC0121);
            boolean z = strM28825 == null;
            InterfaceC8775 interfaceC8775 = new InterfaceC8775() { // from class: l.ܳۡ۠
                @Override // l.InterfaceC8775
                /* JADX INFO: renamed from: ֫ */
                public final void mo22667(EnumC0121 enumC0122) {
                    C12281 c12281 = C6241.f19132;
                    this.f44189.m37470(new C12281("compiler", "release.bootclasspath.conflict", enumC0122));
                }
            };
            EnumC0121 enumC0122 = EnumC0121.f1128;
            EnumC0121 enumC0123 = EnumC0121.f1205;
            m37471(z, interfaceC8775, EnumC0121.f1189, EnumC0121.f1145, EnumC0121.f1167, EnumC0121.f1208, EnumC0121.f1142, EnumC0121.f1137, EnumC0121.f1127, EnumC0121.f1192, enumC0122, enumC0123, EnumC0121.f1203, EnumC0121.f1198);
            if (strM28825 != null) {
                InterfaceC5808 interfaceC5808M6548 = C2008.m6548(strM28825);
                if (interfaceC5808M6548 == null) {
                    C12281 c12281 = C6241.f19132;
                    m37470(new C12281("compiler", "unsupported.release.version", strM28825));
                } else {
                    c11781.m28834(enumC0122, interfaceC5808M6548.m16299());
                    c11781.m28834(enumC0123, interfaceC5808M6548.m16300());
                    C2903 c2903 = this.f48916;
                    c2903.m8839(InterfaceC5808.class, interfaceC5808M6548);
                    if (m37459(interfaceC5808M6548.m16301(), setM1176, abstractC0827)) {
                        C0307.m1699(c2903, interfaceC5808M6548.m16302(), m37461());
                        c11781.m28830();
                    }
                }
            } else {
                c11781.m28830();
            }
        }
        if (this.f48914) {
            this.f48912.m50120(EnumC15307.JAVAC, "msg.usage", "javac");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Set m37476() {
        if (this.f48910 == null) {
            this.f48910 = new LinkedHashSet();
        }
        if (this.f48919 != null) {
            Iterator it = ((C11844) m37461()).m28933(this.f48919).iterator();
            while (it.hasNext()) {
                this.f48910.add((InterfaceC18278) it.next());
            }
        }
        return this.f48910;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet m37468() {
        return this.f48909;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37459(Iterable iterable, Set set, AbstractC0827 abstractC0827) {
        EnumC0121 enumC0121M1159;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.isEmpty()) {
                C12281 c12281 = C6241.f19132;
                m37470(new C12281("compiler", "invalid.flag", str));
                return false;
            }
            if (str.startsWith("-")) {
                enumC0121M1159 = EnumC0121.m1159(str, set);
            } else {
                enumC0121M1159 = EnumC0121.f1153;
                if (!enumC0121M1159.mo1183(str)) {
                    enumC0121M1159 = null;
                }
            }
            if (enumC0121M1159 != null) {
                try {
                    enumC0121M1159.m1180(abstractC0827, str, it);
                } catch (C2239 e) {
                    String message = e.getMessage();
                    this.f48914 = true;
                    int iOrdinal = this.f48917.ordinal();
                    if (iOrdinal == 0) {
                        throw new C16908(new IllegalArgumentException(message, e.getCause()));
                    }
                    if (iOrdinal == 1) {
                        throw new C16908(new IllegalStateException(message, e.getCause()));
                    }
                    if (iOrdinal == 2) {
                        this.f48912.m50111(message);
                    }
                    return false;
                }
            } else {
                C12281 c12282 = C6241.f19132;
                m37470(new C12281("compiler", "invalid.flag", str));
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
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m37477() {
        EnumC16280 enumC16280M38300;
        final EnumC10892 enumC10892M38305;
        char c;
        Object obj;
        boolean z;
        EnumC10892 enumC10892;
        EnumC10892 enumC10893;
        boolean z2;
        String str;
        boolean z3;
        EnumC0121 enumC0121;
        EnumC3503 enumC3503M38299;
        String strM28825;
        Object obj2;
        String str2;
        String strM28826;
        EnumC0121 enumC0122;
        String strM28827;
        String strM28828;
        EnumC0121 enumC0123;
        String strM28829;
        int i;
        Pattern patternMo1186;
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
        Pattern patternMo1187;
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
        InterfaceC20758 parent;
        InterfaceC11223 interfaceC11223M37461 = m37461();
        EnumC0121 enumC0124 = EnumC0121.f1166;
        C11781 c11781 = this.f48911;
        boolean zM28832 = c11781.m28832(enumC0124);
        C22364 c22364 = this.f48912;
        if (zM28832) {
            if (!interfaceC11223M37461.mo1710(EnumC21101.CLASS_OUTPUT)) {
                c22364.m7276(C6241.f19279);
            } else if (!interfaceC11223M37461.mo1710(EnumC21101.MODULE_SOURCE_PATH)) {
                c22364.m7276(C6241.f19255);
            } else {
                try {
                    for (String str7 : Arrays.asList(c11781.m28825(enumC0124).split(","))) {
                        InterfaceC2050 interfaceC2050Mo1714 = interfaceC11223M37461.mo1714(EnumC21101.MODULE_SOURCE_PATH, str7);
                        if (interfaceC2050Mo1714 == null) {
                            C12281 c12281 = C6241.f19132;
                            c22364.m7276(new C12281("compiler", "module.not.found.in.module.source.path", str7));
                        } else {
                            InterfaceC2050 interfaceC2050Mo1715 = interfaceC11223M37461.mo1714(EnumC21101.CLASS_OUTPUT, str7);
                            for (InterfaceC18278 interfaceC18278 : interfaceC11223M37461.mo1702(interfaceC2050Mo1714, "", (Set) EnumSet.of(EnumC16866.SOURCE), true)) {
                                InterfaceC18278 interfaceC18278Mo1707 = interfaceC11223M37461.mo1707(interfaceC2050Mo1715, interfaceC11223M37461.mo1703(interfaceC2050Mo1714, interfaceC18278), EnumC16866.CLASS);
                                if (interfaceC18278Mo1707 == null || interfaceC18278Mo1707.mo20798() < interfaceC18278.mo20798()) {
                                    if (this.f48910 == null) {
                                        this.f48910 = new HashSet();
                                    }
                                    this.f48910.add(interfaceC18278);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    c22364.m50120(EnumC15307.JAVAC, "msg.io", new Object[0]);
                    e.printStackTrace(c22364.m50107(EnumC21659.NOTICE));
                    return false;
                }
            }
        }
        if (m37473()) {
            if (c11781.m28832(EnumC0121.f1140) || c11781.m28832(EnumC0121.f1161) || c11781.m28832(EnumC0121.f1135) || c11781.m28832(EnumC0121.f1136) || c11781.m28832(EnumC0121.f1152) || c11781.m28832(EnumC0121.f1166)) {
                return true;
            }
            if (!this.f48914) {
                if (C4541.m13320(c11781)) {
                    m37470(C6241.f19267);
                    return false;
                }
                m37470(C6241.f19152);
                return false;
            }
        } else if (m37460(EnumC0121.f1209) && m37460(EnumC0121.f1196) && m37460(EnumC0121.f1197)) {
            if (interfaceC11223M37461 instanceof InterfaceC23922) {
                InterfaceC23922 interfaceC23922 = (InterfaceC23922) interfaceC11223M37461;
                EnumC21101 enumC21101 = EnumC21101.CLASS_OUTPUT;
                if (interfaceC23922.mo1710(enumC21101)) {
                    InterfaceC20758 interfaceC20758 = (InterfaceC20758) interfaceC23922.mo28938(enumC21101).iterator().next();
                    if (interfaceC23922.mo1710(EnumC21101.MODULE_SOURCE_PATH)) {
                        if (C17229.exists(interfaceC20758.resolve("module-info.class"), new EnumC14406[0])) {
                            C12281 c12282 = C6241.f19132;
                            c22364.m7276(new C12281("compiler", "multi-module.outdir.cannot.be.exploded.module", interfaceC20758));
                        }
                    } else {
                        EnumC0121 enumC0125 = EnumC0121.f1177;
                        StringBuilder sb = new StringBuilder("-");
                        EnumC20347 enumC20347 = EnumC20347.PATH;
                        sb.append(enumC20347.f65711);
                        if (c11781.m28833(enumC0125, sb.toString()) && (parent = interfaceC20758.getParent()) != null && C17229.exists(parent.resolve("module-info.class"), new EnumC14406[0])) {
                            C11076 c11076 = C14001.f42334;
                            c22364.m7282(enumC20347, new C11076("compiler", "outdir.is.in.exploded.module", interfaceC20758));
                        }
                    }
                }
            }
            String strM288210 = c11781.m28825(EnumC0121.f1128);
            if (strM288210 != null) {
                enumC16280M38300 = EnumC16280.m38300(strM288210);
            } else {
                enumC16280M38300 = EnumC16280.f50066;
            }
            String strM288211 = c11781.m28825(EnumC0121.f1205);
            if (strM288211 != null) {
                enumC10892M38305 = EnumC10892.m27200(strM288211);
            } else {
                enumC10892M38305 = EnumC10892.f32734;
            }
            if (Character.isDigit(enumC10892M38305.f32755.charAt(0)) && enumC10892M38305.compareTo(enumC16280M38300.m38305()) < 0) {
                if (strM288211 != null) {
                    if (strM288210 == null) {
                        EnumC10892 enumC10892M38306 = enumC16280M38300.m38305();
                        C11076 c11077 = C14001.f42334;
                        m37470(new C11076("compiler", "target.default.source.conflict", strM288211, enumC10892M38306));
                        return false;
                    }
                    EnumC10892 enumC10892M38307 = enumC16280M38300.m38305();
                    C11076 c11078 = C14001.f42334;
                    m37470(new C11076("compiler", "source.target.conflict", strM288210, enumC10892M38307));
                    return false;
                }
                enumC10892M38305 = enumC16280M38300.m38305();
                c11781.m28828("-target", enumC10892M38305.f32755);
            }
            if (c11781.m28832(EnumC0121.f1210)) {
                if (strM288210 == null) {
                    m37463(C6241.f19201);
                    return false;
                }
                EnumC16280 enumC16280 = EnumC16280.f50066;
                if (enumC16280M38300 != enumC16280) {
                    C12281 c12283 = C6241.f19132;
                    m37463(new C12281("compiler", "preview.not.latest", strM288210, enumC16280));
                    return false;
                }
            }
            EnumC0121 enumC0126 = EnumC0121.f1133;
            String strM288212 = c11781.m28825(enumC0126);
            if (strM288212 != null) {
                EnumC5973 enumC5973M16740 = EnumC5973.m16740(strM288212);
                if (enumC10892M38305.compareTo(EnumC10892.JDK1_8) > 0 || enumC5973M16740.mo16743(enumC10892M38305)) {
                    c2 = 0;
                } else {
                    C11076 c11079 = C14001.f42334;
                    c2 = 0;
                    m37470(new C11076("compiler", "profile.target.conflict", enumC5973M16740, enumC10892M38305));
                }
                if (c11781.m28825(EnumC0121.f1189) != null) {
                    m37470(C6241.f19300);
                }
                c = c2;
            } else {
                c = 0;
            }
            if (c11781.m28832(EnumC0121.f1179) && c11781.m28832(EnumC0121.f1173)) {
                m37470(C6241.f19269);
            }
            EnumC0121 enumC0127 = EnumC0121.f1177;
            StringBuilder sb2 = new StringBuilder("-");
            EnumC20347 enumC20348 = EnumC20347.OPTIONS;
            sb2.append(enumC20348.f65711);
            boolean zM28833 = c11781.m28833(enumC0127, sb2.toString());
            if (zM28833 && enumC16280M38300.compareTo(EnumC16280.f50066) < 0 && !c11781.m28832(EnumC0121.f1193) && (interfaceC11223M37461 instanceof AbstractC21017)) {
                AbstractC21017 abstractC21017 = (AbstractC21017) interfaceC11223M37461;
                if (enumC16280M38300.compareTo(EnumC16280.JDK8) <= 0) {
                    if (abstractC21017.m47836()) {
                        String str8 = enumC16280M38300.f50071;
                        C11076 c110710 = C14001.f42334;
                        Object[] objArr = new Object[1];
                        objArr[c] = str8;
                        c22364.m7282(enumC20348, new C11076("compiler", "source.no.bootclasspath", objArr));
                    }
                } else if (abstractC21017.m47837()) {
                    String str9 = enumC16280M38300.f50071;
                    C11076 c110711 = C14001.f42334;
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = str9;
                    c22364.m7282(enumC20348, new C11076("compiler", "source.no.system.modules.path", objArr2));
                }
            }
            EnumC16280 enumC16281 = EnumC16280.f50053;
            if (enumC16280M38300.compareTo(enumC16281) < 0) {
                String str10 = enumC16280M38300.f50071;
                String str11 = enumC16281.f50071;
                C12281 c12284 = C6241.f19132;
                obj = "";
                Object[] objArr3 = new Object[2];
                objArr3[c] = str10;
                objArr3[1] = str11;
                c22364.m7276(new C12281("compiler", "option.removed.source", objArr3));
            } else {
                obj = "";
                if (enumC16280M38300 == enumC16281 && zM28833) {
                    String str12 = enumC16280M38300.f50071;
                    C11076 c110712 = C14001.f42334;
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = str12;
                    c22364.m7282(enumC20348, new C11076("compiler", "option.obsolete.source", objArr4));
                    z = true;
                }
                enumC10892 = EnumC10892.f32739;
                if (enumC10892M38305.compareTo(enumC10892) < 0) {
                    C12281 c12285 = C6241.f19132;
                    Object[] objArr5 = new Object[2];
                    objArr5[c] = enumC10892M38305;
                    objArr5[1] = enumC10892;
                    c22364.m7276(new C12281("compiler", "option.removed.target", objArr5));
                } else if (enumC10892M38305 == enumC10892 && zM28833) {
                    C11076 c110713 = C14001.f42334;
                    Object[] objArr6 = new Object[1];
                    objArr6[c] = enumC10892M38305;
                    c22364.m7282(enumC20348, new C11076("compiler", "option.obsolete.target", objArr6));
                    z = true;
                }
                enumC10893 = EnumC10892.JDK1_8;
                if (enumC10892M38305.compareTo(enumC10893) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC8775 interfaceC8775 = new InterfaceC8775() { // from class: l.ᩳۡ۠
                    @Override // l.InterfaceC8775
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo22667(EnumC0121 enumC0128) {
                        C12281 c12286 = C6241.f19132;
                        this.f55948.m37470(new C12281("compiler", "option.not.allowed.with.target", enumC0128, enumC10892M38305));
                    }
                };
                str = ",";
                EnumC0121[] enumC0121Arr = new EnumC0121[9];
                enumC0121Arr[c] = EnumC0121.f1189;
                enumC0121Arr[1] = EnumC0121.f1208;
                enumC0121Arr[2] = EnumC0121.f1145;
                enumC0121Arr[3] = EnumC0121.f1167;
                enumC0121Arr[4] = EnumC0121.f1142;
                enumC0121Arr[5] = EnumC0121.f1137;
                enumC0121Arr[6] = EnumC0121.f1127;
                enumC0121Arr[7] = EnumC0121.f1192;
                enumC0121Arr[8] = enumC0126;
                m37471(z2, interfaceC8775, enumC0121Arr);
                if (enumC10892M38305.compareTo(EnumC10892.JDK1_9) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                InterfaceC8775 interfaceC8776 = new InterfaceC8775() { // from class: l.ܿۡ۠
                    @Override // l.InterfaceC8775
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo22667(EnumC0121 enumC0128) {
                        C12281 c12286 = C6241.f19132;
                        this.f52855.m37470(new C12281("compiler", "option.not.allowed.with.target", enumC0128, enumC10892M38305));
                    }
                };
                enumC0121 = EnumC0121.f1172;
                EnumC0121[] enumC0121Arr2 = new EnumC0121[10];
                enumC0121Arr2[c] = EnumC0121.f1173;
                enumC0121Arr2[1] = EnumC0121.f1198;
                enumC0121Arr2[2] = EnumC0121.f1203;
                enumC0121Arr2[3] = EnumC0121.f1207;
                enumC0121Arr2[4] = EnumC0121.f1149;
                enumC0121Arr2[5] = enumC0121;
                enumC0121Arr2[6] = EnumC0121.f1129;
                enumC0121Arr2[7] = EnumC0121.f1162;
                enumC0121Arr2[8] = EnumC0121.f1144;
                enumC0121Arr2[9] = EnumC0121.f1187;
                m37471(z3, interfaceC8776, enumC0121Arr2);
                if (zM28833 && c11781.m28832(EnumC0121.f1190) && !enumC10892M38305.m27207()) {
                    C11076 c110714 = C14001.f42334;
                    Object[] objArr7 = new Object[2];
                    objArr7[c] = enumC10892M38305;
                    objArr7[1] = enumC10893;
                    c22364.m7275(new C11076("compiler", "option.parameters.unsupported", objArr7));
                }
                if (interfaceC11223M37461.mo1710(EnumC21101.MODULE_SOURCE_PATH) && !c11781.m28829(EnumC0121.f1200, "only") && !interfaceC11223M37461.mo1710(EnumC21101.CLASS_OUTPUT)) {
                    c22364.m7276(C6241.f19243);
                }
                if (interfaceC11223M37461.mo1710(EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH) && interfaceC11223M37461.mo1710(EnumC21101.ANNOTATION_PROCESSOR_PATH)) {
                    c22364.m7276(C6241.f19212);
                }
                if (z && zM28833) {
                    c22364.m7282(enumC20348, C14001.f42335);
                }
                enumC3503M38299 = EnumC16280.m38299(enumC16280M38300);
                strM28825 = c11781.m28825(enumC0121);
                if (strM28825 != null) {
                    patternMo1187 = enumC0121.mo1186();
                    strArrSplit4 = strM28825.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                    length4 = strArrSplit4.length;
                    i5 = 0;
                    while (i5 < length4) {
                        matcher2 = patternMo1187.matcher(strArrSplit4[i5]);
                        if (matcher2.matches()) {
                            strGroup2 = matcher2.group(1);
                            if (!EnumC3503.m10692(strGroup2, enumC3503M38299)) {
                                c22364.m7275(C14001.m33600(EnumC0121.f1172, strGroup2));
                            }
                            strGroup3 = matcher2.group(2);
                            if (!EnumC3503.m10692(strGroup3, enumC3503M38299)) {
                                c22364.m7275(C14001.m33600(EnumC0121.f1172, strGroup3));
                            }
                            str5 = str;
                            strArrSplit5 = matcher2.group(3).split(str5);
                            length5 = strArrSplit5.length;
                            i7 = 0;
                            while (true) {
                                pattern = patternMo1187;
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
                                    if (str6.equals(obj4) && !EnumC3503.m10692(str6, enumC3503M38299)) {
                                        c22364.m7275(C14001.m33600(EnumC0121.f1172, str6));
                                    }
                                    i7++;
                                    strArrSplit5 = strArrSplit5;
                                    patternMo1187 = pattern;
                                    obj = obj4;
                                    length4 = i8;
                                }
                                i7++;
                                strArrSplit5 = strArrSplit5;
                                patternMo1187 = pattern;
                                obj = obj4;
                                length4 = i8;
                            }
                            i6 = length4;
                            obj3 = obj;
                        } else {
                            i6 = length4;
                            obj3 = obj;
                            str5 = str;
                            pattern = patternMo1187;
                        }
                        i5++;
                        obj = obj3;
                        patternMo1187 = pattern;
                        strArrSplit4 = strArrSplit4;
                        length4 = i6;
                        str = str5;
                    }
                }
                obj2 = obj;
                str2 = str;
                strM28826 = c11781.m28825(EnumC0121.f1149);
                if (strM28826 != null) {
                    strArrSplit3 = strM28826.split(str2);
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
                                if (!EnumC3503.m10692(str4, enumC3503M38299)) {
                                    C12281 c12286 = C6241.f19132;
                                    Object[] objArr8 = new Object[2];
                                    objArr8[c] = EnumC0121.f1149;
                                    objArr8[1] = str4;
                                    c22364.m7276(new C12281("compiler", "bad.name.for.option", objArr8));
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
                enumC0122 = EnumC0121.f1162;
                strM28827 = c11781.m28825(enumC0122);
                if (strM28827 != null) {
                    patternMo1186 = enumC0122.mo1186();
                    strArrSplit = strM28827.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                    length = strArrSplit.length;
                    i2 = 0;
                    while (i2 < length) {
                        matcher = patternMo1186.matcher(strArrSplit[i2]);
                        if (matcher.matches()) {
                            strGroup = matcher.group(1);
                            if (!EnumC3503.m10692(strGroup, enumC3503M38299)) {
                                c22364.m7275(C14001.m33600(EnumC0121.f1162, strGroup));
                            }
                            strArrSplit2 = matcher.group(2).split(str2, -1);
                            length2 = strArrSplit2.length;
                            i3 = 0;
                            while (i3 < length2) {
                                int i9 = length2;
                                str3 = strArrSplit2[i3];
                                str3.getClass();
                                if (str3.equals("ALL-UNNAMED") && !str3.equals(obj2) && !EnumC3503.m10692(str3, enumC3503M38299)) {
                                    c22364.m7275(C14001.m33600(EnumC0121.f1162, str3));
                                }
                                i3++;
                                length2 = i9;
                                strArrSplit2 = strArrSplit2;
                            }
                        } else {
                            strArrSplit = strArrSplit;
                        }
                        i2++;
                        patternMo1186 = patternMo1186;
                        strArrSplit = strArrSplit;
                    }
                }
                strM28828 = c11781.m28825(EnumC0121.f1144);
                if (strM28828 != null) {
                    for (String str13 : strM28828.split(str2)) {
                        str13.getClass();
                        if (str13.equals(obj2) && !EnumC3503.m10692(str13, enumC3503M38299)) {
                            C12281 c12287 = C6241.f19132;
                            Object[] objArr9 = new Object[2];
                            objArr9[c] = EnumC0121.f1144;
                            objArr9[1] = str13;
                            c22364.m7276(new C12281("compiler", "bad.name.for.option", objArr9));
                        }
                    }
                }
                enumC0123 = EnumC0121.f1157;
                strM28829 = c11781.m28825(enumC0123);
                if (strM28829 != null && !EnumC3503.m10692(strM28829, enumC3503M38299)) {
                    C12281 c12288 = C6241.f19132;
                    Object[] objArr10 = new Object[2];
                    objArr10[c] = enumC0123;
                    objArr10[1] = strM28829;
                    c22364.m7276(new C12281("compiler", "bad.name.for.option", objArr10));
                }
                if (zM28833 && c11781.m28832(EnumC0121.f1129)) {
                    c22364.m7282(EnumC20347.OPTIONS, C14001.f42334);
                }
                if (this.f48914 && c22364.f72454 == 0) {
                    return true;
                }
                return c;
            }
            z = false;
            enumC10892 = EnumC10892.f32739;
            if (enumC10892M38305.compareTo(enumC10892) < 0) {
                C12281 c12289 = C6241.f19132;
                Object[] objArr11 = new Object[2];
                objArr11[c] = enumC10892M38305;
                objArr11[1] = enumC10892;
                c22364.m7276(new C12281("compiler", "option.removed.target", objArr11));
            } else if (enumC10892M38305 == enumC10892) {
                C11076 c110715 = C14001.f42334;
                Object[] objArr12 = new Object[1];
                objArr12[c] = enumC10892M38305;
                c22364.m7282(enumC20348, new C11076("compiler", "option.obsolete.target", objArr12));
                z = true;
            }
            enumC10893 = EnumC10892.JDK1_8;
            if (enumC10892M38305.compareTo(enumC10893) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            InterfaceC8775 interfaceC8777 = new InterfaceC8775() { // from class: l.ᩳۡ۠
                @Override // l.InterfaceC8775
                /* JADX INFO: renamed from: ֫ */
                public final void mo22667(EnumC0121 enumC0128) {
                    C12281 c122810 = C6241.f19132;
                    this.f55948.m37470(new C12281("compiler", "option.not.allowed.with.target", enumC0128, enumC10892M38305));
                }
            };
            str = ",";
            EnumC0121[] enumC0121Arr3 = new EnumC0121[9];
            enumC0121Arr3[c] = EnumC0121.f1189;
            enumC0121Arr3[1] = EnumC0121.f1208;
            enumC0121Arr3[2] = EnumC0121.f1145;
            enumC0121Arr3[3] = EnumC0121.f1167;
            enumC0121Arr3[4] = EnumC0121.f1142;
            enumC0121Arr3[5] = EnumC0121.f1137;
            enumC0121Arr3[6] = EnumC0121.f1127;
            enumC0121Arr3[7] = EnumC0121.f1192;
            enumC0121Arr3[8] = enumC0126;
            m37471(z2, interfaceC8777, enumC0121Arr3);
            if (enumC10892M38305.compareTo(EnumC10892.JDK1_9) >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            InterfaceC8775 interfaceC8778 = new InterfaceC8775() { // from class: l.ܿۡ۠
                @Override // l.InterfaceC8775
                /* JADX INFO: renamed from: ֫ */
                public final void mo22667(EnumC0121 enumC0128) {
                    C12281 c122810 = C6241.f19132;
                    this.f52855.m37470(new C12281("compiler", "option.not.allowed.with.target", enumC0128, enumC10892M38305));
                }
            };
            enumC0121 = EnumC0121.f1172;
            EnumC0121[] enumC0121Arr4 = new EnumC0121[10];
            enumC0121Arr4[c] = EnumC0121.f1173;
            enumC0121Arr4[1] = EnumC0121.f1198;
            enumC0121Arr4[2] = EnumC0121.f1203;
            enumC0121Arr4[3] = EnumC0121.f1207;
            enumC0121Arr4[4] = EnumC0121.f1149;
            enumC0121Arr4[5] = enumC0121;
            enumC0121Arr4[6] = EnumC0121.f1129;
            enumC0121Arr4[7] = EnumC0121.f1162;
            enumC0121Arr4[8] = EnumC0121.f1144;
            enumC0121Arr4[9] = EnumC0121.f1187;
            m37471(z3, interfaceC8778, enumC0121Arr4);
            if (zM28833) {
                C11076 c110716 = C14001.f42334;
                Object[] objArr13 = new Object[2];
                objArr13[c] = enumC10892M38305;
                objArr13[1] = enumC10893;
                c22364.m7275(new C11076("compiler", "option.parameters.unsupported", objArr13));
            }
            if (interfaceC11223M37461.mo1710(EnumC21101.MODULE_SOURCE_PATH)) {
                c22364.m7276(C6241.f19243);
            }
            if (interfaceC11223M37461.mo1710(EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH)) {
                c22364.m7276(C6241.f19212);
            }
            if (z) {
                c22364.m7282(enumC20348, C14001.f42335);
            }
            enumC3503M38299 = EnumC16280.m38299(enumC16280M38300);
            strM28825 = c11781.m28825(enumC0121);
            if (strM28825 != null) {
                patternMo1187 = enumC0121.mo1186();
                strArrSplit4 = strM28825.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                length4 = strArrSplit4.length;
                i5 = 0;
                while (i5 < length4) {
                    matcher2 = patternMo1187.matcher(strArrSplit4[i5]);
                    if (matcher2.matches()) {
                        strGroup2 = matcher2.group(1);
                        if (!EnumC3503.m10692(strGroup2, enumC3503M38299)) {
                            c22364.m7275(C14001.m33600(EnumC0121.f1172, strGroup2));
                        }
                        strGroup3 = matcher2.group(2);
                        if (!EnumC3503.m10692(strGroup3, enumC3503M38299)) {
                            c22364.m7275(C14001.m33600(EnumC0121.f1172, strGroup3));
                        }
                        str5 = str;
                        strArrSplit5 = matcher2.group(3).split(str5);
                        length5 = strArrSplit5.length;
                        i7 = 0;
                        while (true) {
                            pattern = patternMo1187;
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
                                patternMo1187 = pattern;
                                obj = obj4;
                                length4 = i8;
                            } else {
                                i8 = length4;
                                obj4 = obj;
                            }
                            i7++;
                            strArrSplit5 = strArrSplit5;
                            patternMo1187 = pattern;
                            obj = obj4;
                            length4 = i8;
                        }
                        i6 = length4;
                        obj3 = obj;
                    } else {
                        i6 = length4;
                        obj3 = obj;
                        str5 = str;
                        pattern = patternMo1187;
                    }
                    i5++;
                    obj = obj3;
                    patternMo1187 = pattern;
                    strArrSplit4 = strArrSplit4;
                    length4 = i6;
                    str = str5;
                }
            }
            obj2 = obj;
            str2 = str;
            strM28826 = c11781.m28825(EnumC0121.f1149);
            if (strM28826 != null) {
                strArrSplit3 = strM28826.split(str2);
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
                            if (!EnumC3503.m10692(str4, enumC3503M38299)) {
                                C12281 c122810 = C6241.f19132;
                                Object[] objArr14 = new Object[2];
                                objArr14[c] = EnumC0121.f1149;
                                objArr14[1] = str4;
                                c22364.m7276(new C12281("compiler", "bad.name.for.option", objArr14));
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
            enumC0122 = EnumC0121.f1162;
            strM28827 = c11781.m28825(enumC0122);
            if (strM28827 != null) {
                patternMo1186 = enumC0122.mo1186();
                strArrSplit = strM28827.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                length = strArrSplit.length;
                i2 = 0;
                while (i2 < length) {
                    matcher = patternMo1186.matcher(strArrSplit[i2]);
                    if (matcher.matches()) {
                        strGroup = matcher.group(1);
                        if (!EnumC3503.m10692(strGroup, enumC3503M38299)) {
                            c22364.m7275(C14001.m33600(EnumC0121.f1162, strGroup));
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
                    patternMo1186 = patternMo1186;
                    strArrSplit = strArrSplit;
                }
            }
            strM28828 = c11781.m28825(EnumC0121.f1144);
            if (strM28828 != null) {
                while (i < r4) {
                    str13.getClass();
                    if (str13.equals(obj2)) {
                    }
                }
            }
            enumC0123 = EnumC0121.f1157;
            strM28829 = c11781.m28825(enumC0123);
            if (strM28829 != null) {
                C12281 c122811 = C6241.f19132;
                Object[] objArr15 = new Object[2];
                objArr15[c] = enumC0123;
                objArr15[1] = strM28829;
                c22364.m7276(new C12281("compiler", "bad.name.for.option", objArr15));
            }
            if (zM28833) {
                c22364.m7282(EnumC20347.OPTIONS, C14001.f42334);
            }
            if (this.f48914) {
            }
            return c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m37473() {
        LinkedHashSet linkedHashSet = this.f48919;
        if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
            return false;
        }
        HashSet hashSet = this.f48910;
        if (hashSet != null && !hashSet.isEmpty()) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = this.f48909;
        return linkedHashSet2 == null || linkedHashSet2.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m37472() {
        return this.f48918;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Set m37475() {
        String strM28825 = this.f48911.m28825(EnumC0121.f1176);
        if (strM28825 == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strM28825.split("\\x00")) {
            linkedHashSet.add(C2609.m8238((Object[]) str.split("\\s+")));
        }
        return C20195.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m37474() {
        EnumC0121 enumC0121 = EnumC0121.f1131;
        C11781 c11781 = this.f48911;
        String strM28825 = c11781.m28825(enumC0121);
        String strM28826 = c11781.m28825(EnumC0121.f1164);
        if (strM28825 == null && strM28826 == null) {
            return C2609.m8239();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (strM28825 != null) {
            linkedHashSet.add("-Xmsgs");
        }
        if (strM28826 != null) {
            for (String str : strM28826.split("\\s+")) {
                if (!str.isEmpty()) {
                    linkedHashSet.add("-Xmsgs:".concat(str));
                }
            }
        }
        if (linkedHashSet.equals(Collections.singleton("-Xmsgs:none"))) {
            return C2609.m8239();
        }
        String strM28827 = c11781.m28825(EnumC0121.f1185);
        if (strM28827 != null) {
            linkedHashSet.add("-XcheckPackage:".concat(strM28827));
        }
        return C2609.m8238(linkedHashSet.toArray(new String[linkedHashSet.size()]));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37460(EnumC0121 enumC0121) {
        String strM28825 = this.f48911.m28825(enumC0121);
        if (strM28825 != null) {
            InterfaceC20758 interfaceC20758 = C8763.get(strM28825, new String[0]);
            if (C17229.exists(interfaceC20758, new EnumC14406[0]) && !C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
                C12281 c12281 = C6241.f19132;
                m37470(new C12281("compiler", "file.not.directory", strM28825));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37471(boolean z, final InterfaceC8775 interfaceC8775, EnumC0121... enumC0121Arr) {
        if (z) {
            return;
        }
        InterfaceC17664 interfaceC17664Of = C16958.of((Object[]) enumC0121Arr);
        final C11781 c11781 = this.f48911;
        C11003.requireNonNull(c11781);
        interfaceC17664Of.filter(new Predicate() { // from class: l.᩻ۡ۠
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
                return c11781.m28832((EnumC0121) obj);
            }
        }).forEach(new Consumer() { // from class: l.ۜۡ۠
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                interfaceC8775.mo22667((EnumC0121) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37470(AbstractC4520 abstractC4520) {
        this.f48914 = true;
        int iOrdinal = this.f48917.ordinal();
        C22364 c22364 = this.f48912;
        if (iOrdinal == 0) {
            throw new C16908(new IllegalArgumentException(c22364.m50108(abstractC4520)));
        }
        if (iOrdinal == 1) {
            throw new C16908(new IllegalStateException(c22364.m50108(abstractC4520)));
        }
        if (iOrdinal != 2) {
            return;
        }
        m37463(abstractC4520);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37463(AbstractC4520 abstractC4520) {
        boolean z = abstractC4520 instanceof C12281;
        C22364 c22364 = this.f48912;
        if (z) {
            c22364.m7276((C12281) abstractC4520);
        } else if (abstractC4520 instanceof C11076) {
            c22364.m7275((C11076) abstractC4520);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private InterfaceC11223 m37461() {
        if (this.f48920 == null) {
            this.f48920 = (InterfaceC11223) this.f48916.m8837(InterfaceC11223.class);
        }
        return this.f48920;
    }
}
