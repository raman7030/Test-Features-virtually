package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.᩶᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21735 {

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f68450 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f68449 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f68452 = new C19203();

    /* JADX INFO: renamed from: ֫ */
    public final StringBuilder f68451 = new StringBuilder();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:114:0x0204  */
    /* JADX WARN: Code duplicated, block: B:120:0x0217  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0225  */
    /* JADX WARN: Code duplicated, block: B:126:0x022d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0232  */
    /* JADX WARN: Code duplicated, block: B:129:0x023a  */
    /* JADX WARN: Code duplicated, block: B:130:0x023f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0247  */
    /* JADX WARN: Code duplicated, block: B:134:0x024f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0254  */
    /* JADX WARN: Code duplicated, block: B:137:0x025c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0264  */
    /* JADX WARN: Code duplicated, block: B:140:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x0271  */
    /* JADX WARN: Code duplicated, block: B:144:0x0281  */
    /* JADX WARN: Code duplicated, block: B:145:0x0298  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:166:0x02da  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x0281, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m49017(C19203 c19203) {
        String strSubstring;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        StringBuilder sb = this.f68451;
        int i = 0;
        sb.setLength(0);
        int iM43731 = c19203.m43731();
        while (!TextUtils.isEmpty(c19203.m43720(StandardCharsets.UTF_8))) {
        }
        byte[] bArrM43728 = c19203.m43728();
        int iM43732 = c19203.m43731();
        C19203 c19204 = this.f68452;
        c19204.m43708(iM43732, bArrM43728);
        c19204.m43730(iM43731);
        ArrayList arrayList = new ArrayList();
        while (true) {
            m49016(c19204);
            if (c19204.m43703() >= 5 && "::cue".equals(c19204.m43705(5, StandardCharsets.UTF_8))) {
                int iM43733 = c19204.m43731();
                String strM49015 = m49015(c19204, sb);
                if (strM49015 == null) {
                    strSubstring = null;
                } else if ("{".equals(strM49015)) {
                    c19204.m43730(iM43733);
                    strSubstring = "";
                } else {
                    if (MotionUtils.EASING_TYPE_FORMAT_START.equals(strM49015)) {
                        int iM43734 = c19204.m43731();
                        int iM43729 = c19204.m43729();
                        boolean z2 = false;
                        while (iM43734 < iM43729 && !z2) {
                            int i2 = iM43734 + 1;
                            z2 = ((char) c19204.m43728()[iM43734]) == ')';
                            iM43734 = i2;
                        }
                        strSubstring = c19204.m43705((iM43734 - 1) - c19204.m43731(), StandardCharsets.UTF_8).trim();
                    } else {
                        strSubstring = null;
                    }
                    if (!MotionUtils.EASING_TYPE_FORMAT_END.equals(m49015(c19204, sb))) {
                        strSubstring = null;
                    }
                }
            } else {
                strSubstring = null;
            }
            if (strSubstring != null && "{".equals(m49015(c19204, sb))) {
                C6982 c6982 = new C6982();
                if (!strSubstring.isEmpty()) {
                    int iIndexOf = strSubstring.indexOf(91);
                    if (iIndexOf != -1) {
                        Matcher matcher2 = f68450.matcher(strSubstring.substring(iIndexOf));
                        if (matcher2.matches()) {
                            String strGroup2 = matcher2.group(1);
                            strGroup2.getClass();
                            c6982.m16029(strGroup2);
                        }
                        strSubstring = strSubstring.substring(i, iIndexOf);
                    }
                    String str = C5792.f14228;
                    String[] strArrSplit = strSubstring.split("\\.", -1);
                    String str2 = strArrSplit[i];
                    int iIndexOf2 = str2.indexOf(35);
                    if (iIndexOf2 != -1) {
                        c6982.m16025(str2.substring(i, iIndexOf2));
                        c6982.m16019(str2.substring(iIndexOf2 + 1));
                    } else {
                        c6982.m16025(str2);
                    }
                    if (strArrSplit.length > 1) {
                        int length = strArrSplit.length;
                        C23877.m52957(length <= strArrSplit.length);
                        c6982.m16012((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                    }
                }
                boolean z3 = false;
                String strM49016 = null;
                while (!z3) {
                    int iM43735 = c19204.m43731();
                    strM49016 = m49015(c19204, sb);
                    boolean z4 = strM49016 == null || C0249l.f1198d.equals(strM49016);
                    if (!z4) {
                        c19204.m43730(iM43735);
                        m49016(c19204);
                        String strM49014 = m49014(c19204, sb);
                        if (!strM49014.isEmpty() && ":".equals(m49015(c19204, sb))) {
                            m49016(c19204);
                            StringBuilder sb2 = new StringBuilder();
                            boolean z5 = false;
                            while (true) {
                                if (!z5) {
                                    int iM43736 = c19204.m43731();
                                    String strM49017 = m49015(c19204, sb);
                                    if (strM49017 == null) {
                                        string = null;
                                    } else if (C0249l.f1198d.equals(strM49017) || C0249l.f1196b.equals(strM49017)) {
                                        c19204.m43730(iM43736);
                                        z5 = true;
                                    } else {
                                        sb2.append(strM49017);
                                    }
                                } else {
                                    string = sb2.toString();
                                }
                            }
                            if (string != null && !string.isEmpty()) {
                                int iM43737 = c19204.m43731();
                                String strM49018 = m49015(c19204, sb);
                                if (!C0249l.f1196b.equals(strM49018)) {
                                    if (C0249l.f1198d.equals(strM49018)) {
                                        c19204.m43730(iM43737);
                                        if (ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR.equals(strM49014)) {
                                            c6982.m16018(C18651.m42400(string));
                                        } else if ("background-color".equals(strM49014)) {
                                            c6982.m16009(C18651.m42400(string));
                                        } else if ("ruby-position".equals(strM49014)) {
                                            if ("over".equals(string)) {
                                                c6982.m16028(1);
                                            } else if ("under".equals(string)) {
                                                c6982.m16028(2);
                                            }
                                        } else if ("text-combine-upright".equals(strM49014)) {
                                            if (!ProviderConfigurationPermission.ALL_STR.equals(string) || string.startsWith("digits")) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            c6982.m16011(z);
                                        } else if ("text-decoration".equals(strM49014)) {
                                            if ("underline".equals(string)) {
                                                c6982.m16030();
                                            }
                                        } else if ("font-family".equals(strM49014)) {
                                            c6982.m16010(string);
                                        } else if ("font-weight".equals(strM49014)) {
                                            if ("bold".equals(string)) {
                                                c6982.m16013();
                                            }
                                        } else if ("font-style".equals(strM49014)) {
                                            if ("italic".equals(string)) {
                                                c6982.m16014();
                                            }
                                        } else if ("font-size".equals(strM49014)) {
                                            matcher = f68449.matcher(C16726.m37957(string));
                                            if (!matcher.matches()) {
                                                C21334.m48351("Invalid font-size: '" + string + "'.");
                                            } else {
                                                strGroup = matcher.group(2);
                                                strGroup.getClass();
                                                switch (strGroup) {
                                                    case "%":
                                                        b = 0;
                                                    case "em":
                                                        b = 1;
                                                    case "px":
                                                        b = 2;
                                                    default:
                                                        b = -1;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR.equals(strM49014)) {
                                    c6982.m16018(C18651.m42400(string));
                                } else if ("background-color".equals(strM49014)) {
                                    c6982.m16009(C18651.m42400(string));
                                } else if ("ruby-position".equals(strM49014)) {
                                    if ("over".equals(string)) {
                                        c6982.m16028(1);
                                    } else if ("under".equals(string)) {
                                        c6982.m16028(2);
                                    }
                                } else if ("text-combine-upright".equals(strM49014)) {
                                    if (ProviderConfigurationPermission.ALL_STR.equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    c6982.m16011(z);
                                } else if ("text-decoration".equals(strM49014)) {
                                    if ("underline".equals(string)) {
                                        c6982.m16030();
                                    }
                                } else if ("font-family".equals(strM49014)) {
                                    c6982.m16010(string);
                                } else if ("font-weight".equals(strM49014)) {
                                    if ("bold".equals(string)) {
                                        c6982.m16013();
                                    }
                                } else if ("font-style".equals(strM49014)) {
                                    if ("italic".equals(string)) {
                                        c6982.m16014();
                                    }
                                } else if ("font-size".equals(strM49014)) {
                                    matcher = f68449.matcher(C16726.m37957(string));
                                    if (!matcher.matches()) {
                                        C21334.m48351("Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        switch (strGroup) {
                                            case 37:
                                                if (strGroup.equals("%")) {
                                                    b = -1;
                                                } else {
                                                    b = 0;
                                                }
                                                /*  JADX ERROR: Method code generation error
                                                    java.lang.NullPointerException: Switch insn not found in header
                                                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                    */
                                                /*
                                                    Method dump skipped, instruction units count: 788
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: p067l.C21735.m49017(l.ᩳ֨֫):java.util.ArrayList");
                                            }

                                            /* JADX INFO: renamed from: ۧ */
                                            public static void m49016(C19203 c19203) {
                                                while (true) {
                                                    for (boolean z = true; c19203.m43703() > 0 && z; z = false) {
                                                        char c = (char) c19203.m43728()[c19203.m43731()];
                                                        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                                                            c19203.m43724(1);
                                                        } else {
                                                            int iM43731 = c19203.m43731();
                                                            int iM43729 = c19203.m43729();
                                                            byte[] bArrM43728 = c19203.m43728();
                                                            int i = iM43731 + 2;
                                                            if (i <= iM43729) {
                                                                int i2 = iM43731 + 1;
                                                                if (bArrM43728[iM43731] == 47 && bArrM43728[i2] == 42) {
                                                                    while (true) {
                                                                        int i3 = i + 1;
                                                                        if (i3 >= iM43729) {
                                                                            break;
                                                                        }
                                                                        if (((char) bArrM43728[i]) == '*' && ((char) bArrM43728[i3]) == '/') {
                                                                            i += 2;
                                                                            iM43729 = i;
                                                                        } else {
                                                                            i = i3;
                                                                        }
                                                                    }
                                                                    c19203.m43724(iM43729 - c19203.m43731());
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                }
                                            }

                                            /* JADX INFO: renamed from: ۧ */
                                            public static String m49015(C19203 c19203, StringBuilder sb) {
                                                m49016(c19203);
                                                if (c19203.m43703() == 0) {
                                                    return null;
                                                }
                                                String strM49014 = m49014(c19203, sb);
                                                if (!strM49014.isEmpty()) {
                                                    return strM49014;
                                                }
                                                return "" + ((char) c19203.m43702());
                                            }

                                            /* JADX INFO: renamed from: ֫ */
                                            public static String m49014(C19203 c19203, StringBuilder sb) {
                                                boolean z = false;
                                                sb.setLength(0);
                                                int iM43731 = c19203.m43731();
                                                int iM43729 = c19203.m43729();
                                                while (iM43731 < iM43729 && !z) {
                                                    char c = (char) c19203.m43728()[iM43731];
                                                    if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                                                        z = true;
                                                    } else {
                                                        iM43731++;
                                                        sb.append(c);
                                                    }
                                                }
                                                c19203.m43724(iM43731 - c19203.m43731());
                                                return sb.toString();
                                            }
                                        }
