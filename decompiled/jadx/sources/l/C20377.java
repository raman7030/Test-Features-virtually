package l;

import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
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
public final class C20377 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f65774 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f65773 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f65776 = new C17714();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final StringBuilder f65775 = new StringBuilder();

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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m46694(C17714 c17714) {
        String strSubstring;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        StringBuilder sb = this.f65775;
        int i = 0;
        sb.setLength(0);
        int iM41485 = c17714.m41485();
        while (!TextUtils.isEmpty(c17714.m41474(StandardCharsets.UTF_8))) {
        }
        byte[] bArrM41482 = c17714.m41482();
        int iM41486 = c17714.m41485();
        C17714 c17715 = this.f65776;
        c17715.m41462(iM41486, bArrM41482);
        c17715.m41484(iM41485);
        ArrayList arrayList = new ArrayList();
        while (true) {
            m46693(c17715);
            if (c17715.m41457() >= 5 && "::cue".equals(c17715.m41459(5, StandardCharsets.UTF_8))) {
                int iM41487 = c17715.m41485();
                String strM46692 = m46692(c17715, sb);
                if (strM46692 == null) {
                    strSubstring = null;
                } else if ("{".equals(strM46692)) {
                    c17715.m41484(iM41487);
                    strSubstring = "";
                } else {
                    if (MotionUtils.EASING_TYPE_FORMAT_START.equals(strM46692)) {
                        int iM41488 = c17715.m41485();
                        int iM41483 = c17715.m41483();
                        boolean z2 = false;
                        while (iM41488 < iM41483 && !z2) {
                            int i2 = iM41488 + 1;
                            z2 = ((char) c17715.m41482()[iM41488]) == ')';
                            iM41488 = i2;
                        }
                        strSubstring = c17715.m41459((iM41488 - 1) - c17715.m41485(), StandardCharsets.UTF_8).trim();
                    } else {
                        strSubstring = null;
                    }
                    if (!MotionUtils.EASING_TYPE_FORMAT_END.equals(m46692(c17715, sb))) {
                        strSubstring = null;
                    }
                }
            } else {
                strSubstring = null;
            }
            if (strSubstring != null && "{".equals(m46692(c17715, sb))) {
                C4854 c4854 = new C4854();
                if (!strSubstring.isEmpty()) {
                    int iIndexOf = strSubstring.indexOf(91);
                    if (iIndexOf != -1) {
                        Matcher matcher2 = f65774.matcher(strSubstring.substring(iIndexOf));
                        if (matcher2.matches()) {
                            String strGroup2 = matcher2.group(1);
                            strGroup2.getClass();
                            c4854.m14148(strGroup2);
                        }
                        strSubstring = strSubstring.substring(i, iIndexOf);
                    }
                    String str = C3603.f11424;
                    String[] strArrSplit = strSubstring.split("\\.", -1);
                    String str2 = strArrSplit[i];
                    int iIndexOf2 = str2.indexOf(35);
                    if (iIndexOf2 != -1) {
                        c4854.m14144(str2.substring(i, iIndexOf2));
                        c4854.m14138(str2.substring(iIndexOf2 + 1));
                    } else {
                        c4854.m14144(str2);
                    }
                    if (strArrSplit.length > 1) {
                        int length = strArrSplit.length;
                        C22632.m50631(length <= strArrSplit.length);
                        c4854.m14131((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                    }
                }
                boolean z3 = false;
                String strM46693 = null;
                while (!z3) {
                    int iM41489 = c17715.m41485();
                    strM46693 = m46692(c17715, sb);
                    boolean z4 = strM46693 == null || l.d.equals(strM46693);
                    if (!z4) {
                        c17715.m41484(iM41489);
                        m46693(c17715);
                        String strM46691 = m46691(c17715, sb);
                        if (!strM46691.isEmpty() && ":".equals(m46692(c17715, sb))) {
                            m46693(c17715);
                            StringBuilder sb2 = new StringBuilder();
                            boolean z5 = false;
                            while (true) {
                                if (!z5) {
                                    int iM414810 = c17715.m41485();
                                    String strM46694 = m46692(c17715, sb);
                                    if (strM46694 == null) {
                                        string = null;
                                    } else if (l.d.equals(strM46694) || l.b.equals(strM46694)) {
                                        c17715.m41484(iM414810);
                                        z5 = true;
                                    } else {
                                        sb2.append(strM46694);
                                    }
                                } else {
                                    string = sb2.toString();
                                }
                            }
                            if (string != null && !string.isEmpty()) {
                                int iM414811 = c17715.m41485();
                                String strM46695 = m46692(c17715, sb);
                                if (!l.b.equals(strM46695)) {
                                    if (l.d.equals(strM46695)) {
                                        c17715.m41484(iM414811);
                                        if (ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR.equals(strM46691)) {
                                            c4854.m14137(C17133.m40155(string));
                                        } else if ("background-color".equals(strM46691)) {
                                            c4854.m14128(C17133.m40155(string));
                                        } else if ("ruby-position".equals(strM46691)) {
                                            if ("over".equals(string)) {
                                                c4854.m14147(1);
                                            } else if ("under".equals(string)) {
                                                c4854.m14147(2);
                                            }
                                        } else if ("text-combine-upright".equals(strM46691)) {
                                            if (!ProviderConfigurationPermission.ALL_STR.equals(string) || string.startsWith("digits")) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            c4854.m14130(z);
                                        } else if ("text-decoration".equals(strM46691)) {
                                            if ("underline".equals(string)) {
                                                c4854.m14149();
                                            }
                                        } else if ("font-family".equals(strM46691)) {
                                            c4854.m14129(string);
                                        } else if ("font-weight".equals(strM46691)) {
                                            if ("bold".equals(string)) {
                                                c4854.m14132();
                                            }
                                        } else if ("font-style".equals(strM46691)) {
                                            if ("italic".equals(string)) {
                                                c4854.m14133();
                                            }
                                        } else if ("font-size".equals(strM46691)) {
                                            matcher = f65773.matcher(C15107.m35799(string));
                                            if (!matcher.matches()) {
                                                C19956.m46037("Invalid font-size: '" + string + "'.");
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
                                } else if (ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR.equals(strM46691)) {
                                    c4854.m14137(C17133.m40155(string));
                                } else if ("background-color".equals(strM46691)) {
                                    c4854.m14128(C17133.m40155(string));
                                } else if ("ruby-position".equals(strM46691)) {
                                    if ("over".equals(string)) {
                                        c4854.m14147(1);
                                    } else if ("under".equals(string)) {
                                        c4854.m14147(2);
                                    }
                                } else if ("text-combine-upright".equals(strM46691)) {
                                    if (ProviderConfigurationPermission.ALL_STR.equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    c4854.m14130(z);
                                } else if ("text-decoration".equals(strM46691)) {
                                    if ("underline".equals(string)) {
                                        c4854.m14149();
                                    }
                                } else if ("font-family".equals(strM46691)) {
                                    c4854.m14129(string);
                                } else if ("font-weight".equals(strM46691)) {
                                    if ("bold".equals(string)) {
                                        c4854.m14132();
                                    }
                                } else if ("font-style".equals(strM46691)) {
                                    if ("italic".equals(string)) {
                                        c4854.m14133();
                                    }
                                } else if ("font-size".equals(strM46691)) {
                                    matcher = f65773.matcher(C15107.m35799(string));
                                    if (!matcher.matches()) {
                                        C19956.m46037("Invalid font-size: '" + string + "'.");
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
                                                throw new UnsupportedOperationException("Method not decompiled: l.C20377.m46694(l.ᩳ֨֫):java.util.ArrayList");
                                            }

                                            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
                                            public static void m46693(C17714 c17714) {
                                                while (true) {
                                                    for (boolean z = true; c17714.m41457() > 0 && z; z = false) {
                                                        char c = (char) c17714.m41482()[c17714.m41485()];
                                                        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                                                            c17714.m41478(1);
                                                        } else {
                                                            int iM41485 = c17714.m41485();
                                                            int iM41483 = c17714.m41483();
                                                            byte[] bArrM41482 = c17714.m41482();
                                                            int i = iM41485 + 2;
                                                            if (i <= iM41483) {
                                                                int i2 = iM41485 + 1;
                                                                if (bArrM41482[iM41485] == 47 && bArrM41482[i2] == 42) {
                                                                    while (true) {
                                                                        int i3 = i + 1;
                                                                        if (i3 >= iM41483) {
                                                                            break;
                                                                        }
                                                                        if (((char) bArrM41482[i]) == '*' && ((char) bArrM41482[i3]) == '/') {
                                                                            i += 2;
                                                                            iM41483 = i;
                                                                        } else {
                                                                            i = i3;
                                                                        }
                                                                    }
                                                                    c17714.m41478(iM41483 - c17714.m41485());
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                }
                                            }

                                            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
                                            public static String m46692(C17714 c17714, StringBuilder sb) {
                                                m46693(c17714);
                                                if (c17714.m41457() == 0) {
                                                    return null;
                                                }
                                                String strM46691 = m46691(c17714, sb);
                                                if (!strM46691.isEmpty()) {
                                                    return strM46691;
                                                }
                                                return "" + ((char) c17714.m41456());
                                            }

                                            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                                            public static String m46691(C17714 c17714, StringBuilder sb) {
                                                boolean z = false;
                                                sb.setLength(0);
                                                int iM41485 = c17714.m41485();
                                                int iM41483 = c17714.m41483();
                                                while (iM41485 < iM41483 && !z) {
                                                    char c = (char) c17714.m41482()[iM41485];
                                                    if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                                                        z = true;
                                                    } else {
                                                        iM41485++;
                                                        sb.append(c);
                                                    }
                                                }
                                                c17714.m41478(iM41485 - c17714.m41485());
                                                return sb.toString();
                                            }
                                        }
