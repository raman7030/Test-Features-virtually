package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.֫᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2134 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12534 f7094;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Map f7096;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17515 f7097;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20631 f7098;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17656 f7099;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f7095 = new HashMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f7100 = true;

    public C2134(C12534 c12534) {
        this.f7094 = c12534;
        this.f7097 = c12534.m30773();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7058(boolean z) {
        this.f7100 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7056(Map map) {
        this.f7096 = map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x0290  */
    /* JADX WARN: Code duplicated, block: B:128:0x029d  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ac A[LOOP:4: B:127:0x029b->B:131:0x02ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:207:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0400  */
    /* JADX WARN: Code duplicated, block: B:214:0x0403  */
    /* JADX WARN: Code duplicated, block: B:220:0x0422  */
    /* JADX WARN: Code duplicated, block: B:222:0x0425  */
    /* JADX WARN: Code duplicated, block: B:230:0x0448  */
    /* JADX WARN: Code duplicated, block: B:232:0x0452  */
    /* JADX WARN: Code duplicated, block: B:233:0x0459  */
    /* JADX WARN: Code duplicated, block: B:235:0x0461  */
    /* JADX WARN: Code duplicated, block: B:236:0x0468  */
    /* JADX WARN: Code duplicated, block: B:238:0x0470  */
    /* JADX WARN: Code duplicated, block: B:243:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:245:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:248:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:251:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:253:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:255:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:257:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:259:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:261:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:262:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:263:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:264:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:265:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:273:0x0558  */
    /* JADX WARN: Code duplicated, block: B:284:0x051d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x050d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0153  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7055(CharSequence charSequence) {
        C17656 c17656;
        C16809 c16809M39543;
        C16809 c16809M40931;
        C17656 c17657;
        int i;
        int i2;
        int i3;
        int i4;
        StringBuilder sb;
        int i5;
        char cCharAt;
        char cCharAt2;
        boolean z;
        C14692[] c14692Arr;
        boolean z2;
        int iM24993;
        int length;
        int i6;
        int i7;
        C20631 c20631M47203 = C20631.m47203(charSequence);
        this.f7098 = c20631M47203;
        C17656 c17658 = new C17656();
        this.f7099 = c17658;
        int i8 = 0;
        while (i8 < c20631M47203.m47204()) {
            C24006 c24006 = new C24006();
            int iM47209 = c20631M47203.m47209(i8);
            if (iM47209 != 0) {
                int i9 = 1;
                if (iM47209 != 1) {
                    if (iM47209 == 2) {
                        C14279 c14279M47205 = c20631M47203.m47205(i8);
                        String strM34049 = c14279M47205.m34049();
                        if (!TextUtils.isEmpty(strM34049)) {
                            c24006.f77805 = c17658.m41383(strM34049);
                        }
                        c24006.f77806 = c17658.m41383(c14279M47205.m34048());
                        c14279M47205.m34046(c24006);
                    } else if (iM47209 == 3) {
                        C17656 c17659 = c17658;
                        C23452 c23452M47207 = c20631M47203.m47207(i8);
                        c17656 = c17659;
                        c24006.f77805 = c17656.m41383(c23452M47207.m51901());
                        c24006.f77806 = c17656.m41383(c23452M47207.m51903());
                        c23452M47207.m51900(c24006);
                    } else if (iM47209 == 4) {
                        C6519 c6519M47208 = c20631M47203.m47208(i8);
                        c24006.f77805 = c17658.m41383(c6519M47208.m18018());
                        c6519M47208.m18016(c24006);
                    }
                    c17656 = c17658;
                } else {
                    C14279 c14279M47206 = c20631M47203.m47205(i8);
                    String strM340410 = c14279M47206.m34049();
                    if (!TextUtils.isEmpty(strM340410)) {
                        c24006.f77805 = c17658.m41383(strM340410);
                    }
                    c24006.f77806 = c17658.m41383(c14279M47206.m34048());
                    c14279M47206.m34046(c24006);
                    Iterator it = ((ArrayList) c14279M47206.m34045()).iterator();
                    while (it.hasNext()) {
                        C17102 c17102 = (C17102) it.next();
                        C17656 c176510 = this.f7099;
                        C14833 c14833 = new C14833();
                        String strM40122 = c17102.m40122();
                        if (!TextUtils.isEmpty(strM40122)) {
                            c14833.f45245 = c176510.m41383(strM40122);
                        }
                        String strM40118 = c17102.m40118();
                        String strM40123 = c17102.m40122();
                        if (strM40123.isEmpty()) {
                            strM40118.getClass();
                            switch (strM40118) {
                                case "platformBuildVersionCode":
                                    c16809M39543 = C16809.f51602;
                                    break;
                                case "platformBuildVersionName":
                                    c16809M39543 = C16809.f51600;
                                    break;
                                case "layout":
                                    c16809M39543 = C16809.f51603;
                                    break;
                                case "package":
                                    c16809M39543 = C16809.f51598;
                                    break;
                                case "style":
                                    c16809M39543 = C16809.f51599;
                                    break;
                                case "coreApp":
                                    c16809M39543 = C16809.f51601;
                                    break;
                                default:
                                    c16809M39543 = C16809.m39543(65535, Integer.MAX_VALUE, strM40118);
                                    break;
                            }
                            c16809M40931 = c16809M39543;
                            c14833.f45244 = this.f7099.m41383(strM40118);
                        } else {
                            String strM50967 = C22870.m50967(strM40123, ":", strM40118);
                            HashMap map = this.f7095;
                            c16809M40931 = (C16809) map.get(strM50967);
                            if (c16809M40931 == null) {
                                c16809M40931 = this.f7097.m40931(strM40123, strM40118, this.f7096);
                                if (c16809M40931 == null) {
                                    throw new C1580("Unknown attr " + c17102.m40124(), c17102.m40120());
                                }
                                map.put(strM50967, c16809M40931);
                            }
                            c14833.f45244 = this.f7099.m41382(c16809M40931.f51604, strM40118);
                        }
                        C7073 c7073 = new C7073();
                        c14833.f45247 = c7073;
                        String strM40121 = c17102.m40121();
                        if (strM40121.contains("###")) {
                            System.out.println(i9);
                        }
                        boolean zStartsWith = strM40121.startsWith("@");
                        C12534 c12534 = this.f7094;
                        Iterator it2 = it;
                        if (zStartsWith) {
                            c7073.f21767 = i9;
                            String strSubstring = strM40121.substring(i9);
                            if (strSubstring.length() == 8 && C9896.m24990(strSubstring)) {
                                c7073.f21766 = C9896.m24993(strSubstring);
                            } else if (strSubstring.equals("null")) {
                                c7073.f21766 = 0;
                            } else {
                                int iM30771 = c12534.m30771(strSubstring);
                                if (iM30771 == -1) {
                                    throw new C1580(C20087.m46306("Resource not found: ", c17102.m40124(), "=\"", c17102.m40121(), "\""), c17102.m40125());
                                }
                                c7073.f21766 = iM30771;
                            }
                        } else {
                            if (strM40121.startsWith("?")) {
                                c7073.f21767 = 2;
                                String strSubstring2 = strM40121.substring(1);
                                if (strSubstring2.length() == 8 && C9896.m24990(strSubstring2)) {
                                    c7073.f21766 = C9896.m24993(strSubstring2);
                                } else {
                                    int iM30772 = c12534.m30771(strSubstring2);
                                    if (iM30772 == -1) {
                                        throw new C1580(C20087.m46306("Resource not found: ", c17102.m40124(), "=\"", c17102.m40121(), "\""), c17102.m40125());
                                    }
                                    c7073.f21766 = iM30772;
                                }
                            } else {
                                int i10 = c16809M40931.f51608;
                                C14692[] c14692Arr2 = c16809M40931.f51607;
                                if ((65536 & i10) != 0) {
                                    int length2 = c14692Arr2.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            int i12 = length2;
                                            C14692 c14692 = c14692Arr2[i11];
                                            c17657 = c17658;
                                            if (c14692.f44875.equals(strM40121)) {
                                                c7073.f21766 = c14692.f44876;
                                                c7073.f21767 = c14692.f44877;
                                            } else {
                                                i11++;
                                                length2 = i12;
                                                c17658 = c17657;
                                            }
                                        } else {
                                            c17657 = c17658;
                                            if (C9896.m25000(strM40121)) {
                                                int i13 = Integer.parseInt(strM40121);
                                                int length3 = c14692Arr2.length;
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 < length3) {
                                                        int i15 = length3;
                                                        if (c14692Arr2[i14].f44876 == i13) {
                                                            c7073.f21767 = 16;
                                                            c7073.f21766 = i13;
                                                        } else {
                                                            i14++;
                                                            length3 = i15;
                                                        }
                                                    } else if (C9896.m24994(strM40121)) {
                                                        iM24993 = C9896.m24993(strM40121.substring(2));
                                                        length = c14692Arr2.length;
                                                        i6 = 0;
                                                        while (true) {
                                                            if (i6 < length) {
                                                                i7 = length;
                                                                if (c14692Arr2[i6].f44876 == iM24993) {
                                                                    c7073.f21767 = 16;
                                                                    c7073.f21766 = iM24993;
                                                                } else {
                                                                    i6++;
                                                                    length = i7;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (C9896.m24994(strM40121)) {
                                                iM24993 = C9896.m24993(strM40121.substring(2));
                                                length = c14692Arr2.length;
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 < length) {
                                                        i7 = length;
                                                        if (c14692Arr2[i6].f44876 == iM24993) {
                                                            c7073.f21767 = 16;
                                                            c7073.f21766 = iM24993;
                                                        } else {
                                                            i6++;
                                                            length = i7;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i = i8;
                                    }
                                } else {
                                    c17657 = c17658;
                                }
                                if ((131072 & i10) != 0) {
                                    c7073.f21767 = 17;
                                    String[] strArrSplit = strM40121.split("\\|");
                                    int length4 = strArrSplit.length;
                                    int i16 = 0;
                                    int iM24994 = 0;
                                    boolean z3 = false;
                                    while (true) {
                                        if (i16 < length4) {
                                            int i17 = length4;
                                            String strTrim = strArrSplit[i16].trim();
                                            c20631M47203 = c20631M47203;
                                            int length5 = c14692Arr2.length;
                                            i = i8;
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 < length5) {
                                                    int i19 = length5;
                                                    C14692 c14693 = c14692Arr2[i18];
                                                    c14692Arr = c14692Arr2;
                                                    if (c14693.f44875.equals(strTrim)) {
                                                        iM24994 |= c14693.f44876;
                                                        z2 = true;
                                                        z3 = true;
                                                    } else {
                                                        i18++;
                                                        length5 = i19;
                                                        c14692Arr2 = c14692Arr;
                                                    }
                                                } else {
                                                    c14692Arr = c14692Arr2;
                                                    z2 = false;
                                                }
                                            }
                                            if (!z2 && strArrSplit.length > 1 && C9896.m24994(strTrim)) {
                                                iM24994 |= C9896.m24993(strTrim.substring(2));
                                                z2 = true;
                                                z3 = true;
                                            }
                                            if (z2) {
                                                i16++;
                                                c20631M47203 = c20631M47203;
                                                length4 = i17;
                                                i8 = i;
                                                c14692Arr2 = c14692Arr;
                                            } else {
                                                z = true;
                                            }
                                        } else {
                                            c20631M47203 = c20631M47203;
                                            i = i8;
                                            z = false;
                                        }
                                    }
                                    int i20 = iM24994;
                                    if (!z && z3) {
                                        c7073.f21766 = i20;
                                    } else if (!z3 && C9896.m25000(strM40121)) {
                                        c7073.f21766 = Integer.parseInt(strM40121);
                                    } else if (!z3 && C9896.m24994(strM40121)) {
                                        c7073.f21766 = C9896.m24993(strM40121.substring(2));
                                    }
                                } else {
                                    c20631M47203 = c20631M47203;
                                    i = i8;
                                }
                                if ((i10 & 16) != 0 && strM40121.startsWith("#")) {
                                    String strM46306 = (strM40121.length() == 1 || !C9896.m24990(strM40121.substring(1))) ? C20087.m46306("Color value invalid: ", c17102.m40124(), "=\"", c17102.m40121(), "\"") : null;
                                    if (!C9896.m24991(strM40121, c7073)) {
                                        strM46306 = C20087.m46306("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ", c17102.m40124(), "=\"", c17102.m40121(), "\"");
                                    }
                                    if (strM46306 != null) {
                                        if ((i10 & 2) == 0) {
                                            throw new C1580(strM46306, c17102.m40125());
                                        }
                                        if ((i10 & 4) != 0) {
                                            i2 = i10 & 32;
                                            if (i2 != 0) {
                                                i4 = c7073.f21767;
                                                if (i4 == 4) {
                                                    if (i4 == 6) {
                                                        if (i4 != 5) {
                                                            continue;
                                                        }
                                                    } else if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 == 6) {
                                                    if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 != 5) {
                                                    continue;
                                                }
                                            } else {
                                                i4 = c7073.f21767;
                                                if (i4 == 4) {
                                                    if (i4 == 6) {
                                                        if (i4 != 5) {
                                                            continue;
                                                        }
                                                    } else if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 == 6) {
                                                    if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 != 5) {
                                                    continue;
                                                }
                                            }
                                        } else {
                                            i2 = i10 & 32;
                                            if (i2 != 0) {
                                                i4 = c7073.f21767;
                                                if (i4 == 4) {
                                                    if (i4 == 6) {
                                                        if (i4 != 5) {
                                                            continue;
                                                        }
                                                    } else if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 == 6) {
                                                    if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 != 5) {
                                                    continue;
                                                }
                                            } else {
                                                i4 = c7073.f21767;
                                                if (i4 == 4) {
                                                    if (i4 == 6) {
                                                        if (i4 != 5) {
                                                            continue;
                                                        }
                                                    } else if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 == 6) {
                                                    if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 != 5) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if ((i10 & 4) != 0 || !C9896.m24998(strM40121, c7073)) {
                                    i2 = i10 & 32;
                                    if (!(i2 != 0 && (i10 & 64) == 0 && (i10 & 128) == 0) && C9896.m24995(strM40121, c7073) && ((i3 = i10 & 2) == 0 || C9896.m24992(c7073))) {
                                        i4 = c7073.f21767;
                                        if (i4 == 4 || i2 != 0) {
                                            if (i4 == 6 || (i10 & 128) != 0) {
                                                if (i4 != 5 && (i10 & 64) == 0) {
                                                    if (i3 == 0) {
                                                        throw new C1580(C20087.m46306("Dimension value is not allowed here: ", c17102.m40124(), "=\"", c17102.m40121(), "\""), c17102.m40125());
                                                    }
                                                }
                                            } else if (i3 == 0) {
                                                throw new C1580(C20087.m46306("Fraction value is not allowed here: ", c17102.m40124(), "=\"", c17102.m40121(), "\""), c17102.m40125());
                                            }
                                        } else if (i3 == 0) {
                                            throw new C1580(C20087.m46306("Float value is not allowed here: ", c17102.m40124(), "=\"", c17102.m40121(), "\""), c17102.m40125());
                                        }
                                        if ((i10 & 8) == 0) {
                                            if (!strM40121.startsWith("<") && strM40121.endsWith(">")) {
                                                Matcher matcher = Pattern.compile("<0x([0-9a-f]{1,8}), type 0x([0-9a-f]{2})>").matcher(strM40121.toLowerCase());
                                                if (matcher.matches()) {
                                                    String strGroup = matcher.group(1);
                                                    C11003.requireNonNull(strGroup);
                                                    c7073.f21766 = C9896.m24993(strGroup);
                                                    String strGroup2 = matcher.group(2);
                                                    C11003.requireNonNull(strGroup2);
                                                    c7073.f21767 = C9896.m24993(strGroup2);
                                                } else {
                                                    if ((i10 & 2) != 0) {
                                                        throw new C1580(C9045.m23341(C3435.m10501("Error: ", c17102.m40124(), "=\"", c17102.m40121(), "\" ["), c16809M40931.m39547(), "]"), c17102.m40125());
                                                    }
                                                    c7073.f21767 = 3;
                                                    C17656 c176511 = this.f7099;
                                                    if (strM40121.indexOf(92) != -1) {
                                                        sb = new StringBuilder(strM40121.length() + 10);
                                                        i5 = 0;
                                                        while (i5 < strM40121.length()) {
                                                            cCharAt = strM40121.charAt(i5);
                                                            if (cCharAt == '\\') {
                                                                i5++;
                                                                if (i5 >= strM40121.length()) {
                                                                    cCharAt2 = strM40121.charAt(i5);
                                                                    if (cCharAt2 != '\\') {
                                                                        sb.append('\\');
                                                                    } else if (cCharAt2 != 'n') {
                                                                        sb.append('\n');
                                                                    } else if (cCharAt2 != 't') {
                                                                        sb.append(cCharAt2);
                                                                    } else {
                                                                        sb.append('\t');
                                                                    }
                                                                }
                                                            } else {
                                                                sb.append(cCharAt);
                                                            }
                                                            i5++;
                                                        }
                                                        strM40121 = sb.toString();
                                                    }
                                                    c14833.f45246 = c176511.m41383(strM40121);
                                                }
                                            } else {
                                                if ((i10 & 2) != 0) {
                                                    throw new C1580(C9045.m23341(C3435.m10501("Error: ", c17102.m40124(), "=\"", c17102.m40121(), "\" ["), c16809M40931.m39547(), "]"), c17102.m40125());
                                                }
                                                c7073.f21767 = 3;
                                                C17656 c176512 = this.f7099;
                                                if (strM40121.indexOf(92) != -1) {
                                                    sb = new StringBuilder(strM40121.length() + 10);
                                                    i5 = 0;
                                                    while (i5 < strM40121.length()) {
                                                        cCharAt = strM40121.charAt(i5);
                                                        if (cCharAt == '\\') {
                                                            i5++;
                                                            if (i5 >= strM40121.length()) {
                                                                cCharAt2 = strM40121.charAt(i5);
                                                                if (cCharAt2 != '\\') {
                                                                    sb.append('\\');
                                                                } else if (cCharAt2 != 'n') {
                                                                    sb.append('\n');
                                                                } else if (cCharAt2 != 't') {
                                                                    sb.append(cCharAt2);
                                                                } else {
                                                                    sb.append('\t');
                                                                }
                                                            }
                                                        } else {
                                                            sb.append(cCharAt);
                                                        }
                                                        i5++;
                                                    }
                                                    strM40121 = sb.toString();
                                                }
                                                c14833.f45246 = c176512.m41383(strM40121);
                                            }
                                        } else if (strM40121.equals("true")) {
                                            c7073.f21766 = -1;
                                            c7073.f21767 = 18;
                                        } else if (strM40121.equals("false")) {
                                            c7073.f21766 = 0;
                                            c7073.f21767 = 18;
                                        } else if (!strM40121.startsWith("<")) {
                                            if ((i10 & 2) != 0) {
                                                throw new C1580(C9045.m23341(C3435.m10501("Error: ", c17102.m40124(), "=\"", c17102.m40121(), "\" ["), c16809M40931.m39547(), "]"), c17102.m40125());
                                            }
                                            c7073.f21767 = 3;
                                            C17656 c176513 = this.f7099;
                                            if (strM40121.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM40121.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM40121.length()) {
                                                    cCharAt = strM40121.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM40121.length()) {
                                                            cCharAt2 = strM40121.charAt(i5);
                                                            if (cCharAt2 != '\\') {
                                                                sb.append('\\');
                                                            } else if (cCharAt2 != 'n') {
                                                                sb.append('\n');
                                                            } else if (cCharAt2 != 't') {
                                                                sb.append(cCharAt2);
                                                            } else {
                                                                sb.append('\t');
                                                            }
                                                        }
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i5++;
                                                }
                                                strM40121 = sb.toString();
                                            }
                                            c14833.f45246 = c176513.m41383(strM40121);
                                        } else {
                                            if ((i10 & 2) != 0) {
                                                throw new C1580(C9045.m23341(C3435.m10501("Error: ", c17102.m40124(), "=\"", c17102.m40121(), "\" ["), c16809M40931.m39547(), "]"), c17102.m40125());
                                            }
                                            c7073.f21767 = 3;
                                            C17656 c176514 = this.f7099;
                                            if (strM40121.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM40121.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM40121.length()) {
                                                    cCharAt = strM40121.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM40121.length()) {
                                                            cCharAt2 = strM40121.charAt(i5);
                                                            if (cCharAt2 != '\\') {
                                                                sb.append('\\');
                                                            } else if (cCharAt2 != 'n') {
                                                                sb.append('\n');
                                                            } else if (cCharAt2 != 't') {
                                                                sb.append(cCharAt2);
                                                            } else {
                                                                sb.append('\t');
                                                            }
                                                        }
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i5++;
                                                }
                                                strM40121 = sb.toString();
                                            }
                                            c14833.f45246 = c176514.m41383(strM40121);
                                        }
                                    } else if ((i10 & 8) == 0) {
                                        if (!strM40121.startsWith("<")) {
                                            if ((i10 & 2) != 0) {
                                                throw new C1580(C9045.m23341(C3435.m10501("Error: ", c17102.m40124(), "=\"", c17102.m40121(), "\" ["), c16809M40931.m39547(), "]"), c17102.m40125());
                                            }
                                            c7073.f21767 = 3;
                                            C17656 c176515 = this.f7099;
                                            if (strM40121.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM40121.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM40121.length()) {
                                                    cCharAt = strM40121.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM40121.length()) {
                                                            cCharAt2 = strM40121.charAt(i5);
                                                            if (cCharAt2 != '\\') {
                                                                sb.append('\\');
                                                            } else if (cCharAt2 != 'n') {
                                                                sb.append('\n');
                                                            } else if (cCharAt2 != 't') {
                                                                sb.append(cCharAt2);
                                                            } else {
                                                                sb.append('\t');
                                                            }
                                                        }
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i5++;
                                                }
                                                strM40121 = sb.toString();
                                            }
                                            c14833.f45246 = c176515.m41383(strM40121);
                                        } else {
                                            if ((i10 & 2) != 0) {
                                                throw new C1580(C9045.m23341(C3435.m10501("Error: ", c17102.m40124(), "=\"", c17102.m40121(), "\" ["), c16809M40931.m39547(), "]"), c17102.m40125());
                                            }
                                            c7073.f21767 = 3;
                                            C17656 c176516 = this.f7099;
                                            if (strM40121.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM40121.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM40121.length()) {
                                                    cCharAt = strM40121.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM40121.length()) {
                                                            cCharAt2 = strM40121.charAt(i5);
                                                            if (cCharAt2 != '\\') {
                                                                sb.append('\\');
                                                            } else if (cCharAt2 != 'n') {
                                                                sb.append('\n');
                                                            } else if (cCharAt2 != 't') {
                                                                sb.append(cCharAt2);
                                                            } else {
                                                                sb.append('\t');
                                                            }
                                                        }
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i5++;
                                                }
                                                strM40121 = sb.toString();
                                            }
                                            c14833.f45246 = c176516.m41383(strM40121);
                                        }
                                    } else if (strM40121.equals("true")) {
                                        c7073.f21766 = -1;
                                        c7073.f21767 = 18;
                                    } else if (strM40121.equals("false")) {
                                        c7073.f21766 = 0;
                                        c7073.f21767 = 18;
                                    } else if (!strM40121.startsWith("<")) {
                                        if ((i10 & 2) != 0) {
                                            throw new C1580(C9045.m23341(C3435.m10501("Error: ", c17102.m40124(), "=\"", c17102.m40121(), "\" ["), c16809M40931.m39547(), "]"), c17102.m40125());
                                        }
                                        c7073.f21767 = 3;
                                        C17656 c176517 = this.f7099;
                                        if (strM40121.indexOf(92) != -1) {
                                            sb = new StringBuilder(strM40121.length() + 10);
                                            i5 = 0;
                                            while (i5 < strM40121.length()) {
                                                cCharAt = strM40121.charAt(i5);
                                                if (cCharAt == '\\') {
                                                    i5++;
                                                    if (i5 >= strM40121.length()) {
                                                        cCharAt2 = strM40121.charAt(i5);
                                                        if (cCharAt2 != '\\') {
                                                            sb.append('\\');
                                                        } else if (cCharAt2 != 'n') {
                                                            sb.append('\n');
                                                        } else if (cCharAt2 != 't') {
                                                            sb.append(cCharAt2);
                                                        } else {
                                                            sb.append('\t');
                                                        }
                                                    }
                                                } else {
                                                    sb.append(cCharAt);
                                                }
                                                i5++;
                                            }
                                            strM40121 = sb.toString();
                                        }
                                        c14833.f45246 = c176517.m41383(strM40121);
                                    } else {
                                        if ((i10 & 2) != 0) {
                                            throw new C1580(C9045.m23341(C3435.m10501("Error: ", c17102.m40124(), "=\"", c17102.m40121(), "\" ["), c16809M40931.m39547(), "]"), c17102.m40125());
                                        }
                                        c7073.f21767 = 3;
                                        C17656 c176518 = this.f7099;
                                        if (strM40121.indexOf(92) != -1) {
                                            sb = new StringBuilder(strM40121.length() + 10);
                                            i5 = 0;
                                            while (i5 < strM40121.length()) {
                                                cCharAt = strM40121.charAt(i5);
                                                if (cCharAt == '\\') {
                                                    i5++;
                                                    if (i5 >= strM40121.length()) {
                                                        cCharAt2 = strM40121.charAt(i5);
                                                        if (cCharAt2 != '\\') {
                                                            sb.append('\\');
                                                        } else if (cCharAt2 != 'n') {
                                                            sb.append('\n');
                                                        } else if (cCharAt2 != 't') {
                                                            sb.append(cCharAt2);
                                                        } else {
                                                            sb.append('\t');
                                                        }
                                                    }
                                                } else {
                                                    sb.append(cCharAt);
                                                }
                                                i5++;
                                            }
                                            strM40121 = sb.toString();
                                        }
                                        c14833.f45246 = c176518.m41383(strM40121);
                                    }
                                }
                            }
                            c14833.f45243 = c16809M40931;
                            c17102.m40119(c14833);
                            i9 = 1;
                            it = it2;
                            c17658 = c17657;
                            c20631M47203 = c20631M47203;
                            i8 = i;
                        }
                        c17657 = c17658;
                        i = i8;
                        c14833.f45243 = c16809M40931;
                        c17102.m40119(c14833);
                        i9 = 1;
                        it = it2;
                        c17658 = c17657;
                        c20631M47203 = c20631M47203;
                        i8 = i;
                    }
                    Collections.sort(c14279M47206.m34045(), new C7446());
                    c17656 = c17658;
                    c20631M47203 = c20631M47203;
                }
            } else {
                C17656 c176519 = c17658;
                C23452 c23452M47208 = c20631M47203.m47207(i8);
                c17656 = c176519;
                c24006.f77805 = c17656.m41383(c23452M47208.m51901());
                c24006.f77806 = c17656.m41383(c23452M47208.m51903());
                c23452M47208.m51900(c24006);
            }
            i8++;
            c17658 = c17656;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7057(C10130 c10130) {
        C20631 c20631 = this.f7098;
        c10130.mo13229((short) 3);
        int i = 8;
        c10130.mo13229((short) 8);
        long position = c10130.getPosition();
        int i2 = 4;
        c10130.skipBytes(4);
        int i3 = 0;
        this.f7099.m41381(this.f7100).m32180((InterfaceC4485) c10130, false, (C19277) null);
        int[] iArrM41384 = this.f7099.m41384();
        if (iArrM41384.length > 0) {
            c10130.mo13231(MLKEMEngine.KyberPolyBytes);
            c10130.mo13231(8);
            c10130.writeInt((iArrM41384.length * 4) + 8);
            c10130.mo13230(iArrM41384);
        }
        int i4 = 0;
        while (i4 < c20631.m47204()) {
            int iM47209 = c20631.m47209(i4);
            if (iM47209 == 0) {
                C23452 c23452M47207 = c20631.m47207(i4);
                C24006 c24006 = (C24006) c23452M47207.m51902();
                c10130.writeInt(1048832);
                c10130.writeInt(24);
                c10130.writeInt(c23452M47207.m51899());
                c10130.writeInt(-1);
                c10130.writeInt(c24006.f77805.m42794());
                c10130.writeInt(c24006.f77806.m42794());
            } else if (iM47209 == 1) {
                C14279 c14279M47205 = c20631.m47205(i4);
                C24006 c24007 = (C24006) c14279M47205.m34050();
                List listM34045 = c14279M47205.m34045();
                c10130.writeInt(1048834);
                int size = ((ArrayList) listM34045).size();
                c10130.writeInt((size * 20) + 36);
                c10130.writeInt(c14279M47205.m34047());
                c10130.writeInt(-1);
                C18362 c18362 = c24007.f77805;
                c10130.writeInt(c18362 == null ? -1 : c18362.m42794());
                c10130.writeInt(c24007.f77806.m42794());
                c10130.mo13231(20);
                c10130.mo13231(20);
                if (size == 0) {
                    c10130.m25431(0L);
                } else {
                    c10130.mo13229((short) size);
                    int i5 = 0;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) listM34045;
                        if (i5 < arrayList.size()) {
                            String strM40118 = ((C17102) arrayList.get(i5)).m40118();
                            strM40118.getClass();
                            switch (strM40118) {
                                case "id":
                                    s = (short) (i5 + 1);
                                    break;
                                case "class":
                                    s2 = (short) (i5 + 1);
                                    break;
                                case "style":
                                    s3 = (short) (i5 + 1);
                                    break;
                            }
                            i5++;
                        } else {
                            c10130.mo13229(s);
                            c10130.mo13229(s2);
                            c10130.mo13229(s3);
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                C14833 c14833 = (C14833) ((C17102) arrayList.get(i6)).m40123();
                                C18362 c18363 = c14833.f45245;
                                c10130.writeInt(c18363 == null ? -1 : c18363.m42794());
                                c10130.writeInt(c14833.f45244.m42794());
                                C7073 c7073 = c14833.f45247;
                                if (c7073.f21767 == 3) {
                                    int iM42794 = c14833.f45246.m42794();
                                    c7073.f21766 = iM42794;
                                    c7073.f21768 = iM42794;
                                }
                                c10130.writeInt(c7073.f21768);
                                c10130.writeInt((c7073.f21767 << 24) | 8);
                                c10130.writeInt(c7073.f21766);
                            }
                        }
                    }
                }
            } else if (iM47209 == 2) {
                C14279 c14279M47206 = c20631.m47205(i4);
                C24006 c24008 = (C24006) c14279M47206.m34050();
                c10130.writeInt(1048835);
                c10130.writeInt(24);
                c10130.writeInt(c14279M47206.m34047());
                c10130.writeInt(-1);
                C18362 c18364 = c24008.f77805;
                c10130.writeInt(c18364 != null ? c18364.m42794() : -1);
                c10130.writeInt(c24008.f77806.m42794());
            } else if (iM47209 == 3) {
                C23452 c23452M47208 = c20631.m47207(i4);
                C24006 c24009 = (C24006) c23452M47208.m51902();
                c10130.writeInt(1048833);
                c10130.writeInt(24);
                c10130.writeInt(c23452M47208.m51899());
                c10130.writeInt(-1);
                c10130.writeInt(c24009.f77805.m42794());
                c10130.writeInt(c24009.f77806.m42794());
            } else if (iM47209 == i2) {
                C6519 c6519M47208 = c20631.m47208(i4);
                C24006 c240010 = (C24006) c6519M47208.m18017();
                c10130.writeInt(1048836);
                c10130.writeInt(28);
                c10130.writeInt(c6519M47208.m18015());
                c10130.writeInt(-1);
                c10130.writeInt(c240010.f77805.m42794());
                c10130.writeInt(i);
                c10130.writeInt(i3);
            }
            i4++;
            i = 8;
            i2 = 4;
            i3 = 0;
        }
        long position2 = c10130.getPosition();
        c10130.seek(position);
        c10130.writeInt((int) ((position2 - position) + 4));
        c10130.seek(position2);
    }
}
