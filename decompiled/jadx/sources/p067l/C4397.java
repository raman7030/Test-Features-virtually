package p067l;

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
public final class C4397 {

    /* JADX INFO: renamed from: ֫ */
    public final C14281 f9880;

    /* JADX INFO: renamed from: ܳ */
    public Map f9882;

    /* JADX INFO: renamed from: ܽ */
    public final C19015 f9883;

    /* JADX INFO: renamed from: ܿ */
    public C21976 f9884;

    /* JADX INFO: renamed from: ᩳ */
    public C19149 f9885;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f9881 = new HashMap();

    /* JADX INFO: renamed from: ᩻ */
    public boolean f9886 = true;

    public C4397(C14281 c14281) {
        this.f9880 = c14281;
        this.f9883 = c14281.m32845();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9153(boolean z) {
        this.f9886 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9151(Map map) {
        this.f9882 = map;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m9150(CharSequence charSequence) {
        C19149 c19149;
        C18344 c18344M41779;
        C18344 c18344M43189;
        C19149 c191410;
        int i;
        int i2;
        int i3;
        int i4;
        StringBuilder sb;
        int i5;
        char cCharAt;
        char cCharAt2;
        boolean z;
        C16332[] c16332Arr;
        boolean z2;
        int iM27008;
        int length;
        int i6;
        int i7;
        C21976 c21976M49530 = C21976.m49530(charSequence);
        this.f9884 = c21976M49530;
        C19149 c191411 = new C19149();
        this.f9885 = c191411;
        int i8 = 0;
        while (i8 < c21976M49530.m49531()) {
            C25184 c25184 = new C25184();
            int iM49536 = c21976M49530.m49536(i8);
            if (iM49536 != 0) {
                int i9 = 1;
                if (iM49536 != 1) {
                    if (iM49536 == 2) {
                        C15939 c15939M49532 = c21976M49530.m49532(i8);
                        String strM36182 = c15939M49532.m36182();
                        if (!TextUtils.isEmpty(strM36182)) {
                            c25184.f80557 = c191411.m43629(strM36182);
                        }
                        c25184.f80558 = c191411.m43629(c15939M49532.m36181());
                        c15939M49532.m36179(c25184);
                    } else if (iM49536 == 3) {
                        C19149 c191412 = c191411;
                        C24657 c24657M49534 = c21976M49530.m49534(i8);
                        c19149 = c191412;
                        c25184.f80557 = c19149.m43629(c24657M49534.m54302());
                        c25184.f80558 = c19149.m43629(c24657M49534.m54304());
                        c24657M49534.m54301(c25184);
                    } else if (iM49536 == 4) {
                        C8564 c8564M49535 = c21976M49530.m49535(i8);
                        c25184.f80557 = c191411.m43629(c8564M49535.m19967());
                        c8564M49535.m19965(c25184);
                    }
                    c19149 = c191411;
                } else {
                    C15939 c15939M49533 = c21976M49530.m49532(i8);
                    String strM36183 = c15939M49533.m36182();
                    if (!TextUtils.isEmpty(strM36183)) {
                        c25184.f80557 = c191411.m43629(strM36183);
                    }
                    c25184.f80558 = c191411.m43629(c15939M49533.m36181());
                    c15939M49533.m36179(c25184);
                    Iterator it = ((ArrayList) c15939M49533.m36178()).iterator();
                    while (it.hasNext()) {
                        C18622 c18622 = (C18622) it.next();
                        C19149 c191413 = this.f9885;
                        C16466 c16466 = new C16466();
                        String strM42367 = c18622.m42367();
                        if (!TextUtils.isEmpty(strM42367)) {
                            c16466.f48361 = c191413.m43629(strM42367);
                        }
                        String strM42363 = c18622.m42363();
                        String strM42368 = c18622.m42367();
                        if (strM42368.isEmpty()) {
                            strM42363.getClass();
                            switch (strM42363) {
                                case "platformBuildVersionCode":
                                    c18344M41779 = C18344.f54784;
                                    break;
                                case "platformBuildVersionName":
                                    c18344M41779 = C18344.f54782;
                                    break;
                                case "layout":
                                    c18344M41779 = C18344.f54785;
                                    break;
                                case "package":
                                    c18344M41779 = C18344.f54780;
                                    break;
                                case "style":
                                    c18344M41779 = C18344.f54781;
                                    break;
                                case "coreApp":
                                    c18344M41779 = C18344.f54783;
                                    break;
                                default:
                                    c18344M41779 = C18344.m41779(65535, Integer.MAX_VALUE, strM42363);
                                    break;
                            }
                            c18344M43189 = c18344M41779;
                            c16466.f48360 = this.f9885.m43629(strM42363);
                        } else {
                            String strM53357 = C24104.m53357(strM42368, ":", strM42363);
                            HashMap map = this.f9881;
                            c18344M43189 = (C18344) map.get(strM53357);
                            if (c18344M43189 == null) {
                                c18344M43189 = this.f9883.m43189(strM42368, strM42363, this.f9882);
                                if (c18344M43189 == null) {
                                    throw new C3870("Unknown attr " + c18622.m42369(), c18622.m42365());
                                }
                                map.put(strM53357, c18344M43189);
                            }
                            c16466.f48360 = this.f9885.m43628(c18344M43189.f54786, strM42363);
                        }
                        C9091 c9091 = new C9091();
                        c16466.f48363 = c9091;
                        String strM42366 = c18622.m42366();
                        if (strM42366.contains("###")) {
                            System.out.println(i9);
                        }
                        boolean zStartsWith = strM42366.startsWith("@");
                        C14281 c14281 = this.f9880;
                        Iterator it2 = it;
                        if (zStartsWith) {
                            c9091.f24648 = i9;
                            String strSubstring = strM42366.substring(i9);
                            if (strSubstring.length() == 8 && C11774.m27005(strSubstring)) {
                                c9091.f24647 = C11774.m27008(strSubstring);
                            } else if (strSubstring.equals("null")) {
                                c9091.f24647 = 0;
                            } else {
                                int iM32843 = c14281.m32843(strSubstring);
                                if (iM32843 == -1) {
                                    throw new C3870(C21459.m48622("Resource not found: ", c18622.m42369(), "=\"", c18622.m42366(), "\""), c18622.m42370());
                                }
                                c9091.f24647 = iM32843;
                            }
                        } else {
                            if (strM42366.startsWith("?")) {
                                c9091.f24648 = 2;
                                String strSubstring2 = strM42366.substring(1);
                                if (strSubstring2.length() == 8 && C11774.m27005(strSubstring2)) {
                                    c9091.f24647 = C11774.m27008(strSubstring2);
                                } else {
                                    int iM32844 = c14281.m32843(strSubstring2);
                                    if (iM32844 == -1) {
                                        throw new C3870(C21459.m48622("Resource not found: ", c18622.m42369(), "=\"", c18622.m42366(), "\""), c18622.m42370());
                                    }
                                    c9091.f24647 = iM32844;
                                }
                            } else {
                                int i10 = c18344M43189.f54790;
                                C16332[] c16332Arr2 = c18344M43189.f54789;
                                if ((65536 & i10) != 0) {
                                    int length2 = c16332Arr2.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            int i12 = length2;
                                            C16332 c16332 = c16332Arr2[i11];
                                            c191410 = c191411;
                                            if (c16332.f47990.equals(strM42366)) {
                                                c9091.f24647 = c16332.f47991;
                                                c9091.f24648 = c16332.f47992;
                                            } else {
                                                i11++;
                                                length2 = i12;
                                                c191411 = c191410;
                                            }
                                        } else {
                                            c191410 = c191411;
                                            if (C11774.m27015(strM42366)) {
                                                int i13 = Integer.parseInt(strM42366);
                                                int length3 = c16332Arr2.length;
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 < length3) {
                                                        int i15 = length3;
                                                        if (c16332Arr2[i14].f47991 == i13) {
                                                            c9091.f24648 = 16;
                                                            c9091.f24647 = i13;
                                                        } else {
                                                            i14++;
                                                            length3 = i15;
                                                        }
                                                    } else if (C11774.m27009(strM42366)) {
                                                        iM27008 = C11774.m27008(strM42366.substring(2));
                                                        length = c16332Arr2.length;
                                                        i6 = 0;
                                                        while (true) {
                                                            if (i6 < length) {
                                                                i7 = length;
                                                                if (c16332Arr2[i6].f47991 == iM27008) {
                                                                    c9091.f24648 = 16;
                                                                    c9091.f24647 = iM27008;
                                                                } else {
                                                                    i6++;
                                                                    length = i7;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (C11774.m27009(strM42366)) {
                                                iM27008 = C11774.m27008(strM42366.substring(2));
                                                length = c16332Arr2.length;
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 < length) {
                                                        i7 = length;
                                                        if (c16332Arr2[i6].f47991 == iM27008) {
                                                            c9091.f24648 = 16;
                                                            c9091.f24647 = iM27008;
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
                                    c191410 = c191411;
                                }
                                if ((131072 & i10) != 0) {
                                    c9091.f24648 = 17;
                                    String[] strArrSplit = strM42366.split("\\|");
                                    int length4 = strArrSplit.length;
                                    int i16 = 0;
                                    int iM27009 = 0;
                                    boolean z3 = false;
                                    while (true) {
                                        if (i16 < length4) {
                                            int i17 = length4;
                                            String strTrim = strArrSplit[i16].trim();
                                            c21976M49530 = c21976M49530;
                                            int length5 = c16332Arr2.length;
                                            i = i8;
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 < length5) {
                                                    int i19 = length5;
                                                    C16332 c16333 = c16332Arr2[i18];
                                                    c16332Arr = c16332Arr2;
                                                    if (c16333.f47990.equals(strTrim)) {
                                                        iM27009 |= c16333.f47991;
                                                        z2 = true;
                                                        z3 = true;
                                                    } else {
                                                        i18++;
                                                        length5 = i19;
                                                        c16332Arr2 = c16332Arr;
                                                    }
                                                } else {
                                                    c16332Arr = c16332Arr2;
                                                    z2 = false;
                                                }
                                            }
                                            if (!z2 && strArrSplit.length > 1 && C11774.m27009(strTrim)) {
                                                iM27009 |= C11774.m27008(strTrim.substring(2));
                                                z2 = true;
                                                z3 = true;
                                            }
                                            if (z2) {
                                                i16++;
                                                c21976M49530 = c21976M49530;
                                                length4 = i17;
                                                i8 = i;
                                                c16332Arr2 = c16332Arr;
                                            } else {
                                                z = true;
                                            }
                                        } else {
                                            c21976M49530 = c21976M49530;
                                            i = i8;
                                            z = false;
                                        }
                                    }
                                    int i20 = iM27009;
                                    if (!z && z3) {
                                        c9091.f24647 = i20;
                                    } else if (!z3 && C11774.m27015(strM42366)) {
                                        c9091.f24647 = Integer.parseInt(strM42366);
                                    } else if (!z3 && C11774.m27009(strM42366)) {
                                        c9091.f24647 = C11774.m27008(strM42366.substring(2));
                                    }
                                } else {
                                    c21976M49530 = c21976M49530;
                                    i = i8;
                                }
                                if ((i10 & 16) != 0 && strM42366.startsWith("#")) {
                                    String strM48622 = (strM42366.length() == 1 || !C11774.m27005(strM42366.substring(1))) ? C21459.m48622("Color value invalid: ", c18622.m42369(), "=\"", c18622.m42366(), "\"") : null;
                                    if (!C11774.m27006(strM42366, c9091)) {
                                        strM48622 = C21459.m48622("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ", c18622.m42369(), "=\"", c18622.m42366(), "\"");
                                    }
                                    if (strM48622 != null) {
                                        if ((i10 & 2) == 0) {
                                            throw new C3870(strM48622, c18622.m42370());
                                        }
                                        if ((i10 & 4) != 0) {
                                            i2 = i10 & 32;
                                            if (i2 != 0) {
                                                i4 = c9091.f24648;
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
                                                i4 = c9091.f24648;
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
                                                i4 = c9091.f24648;
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
                                                i4 = c9091.f24648;
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
                                } else if ((i10 & 4) != 0 || !C11774.m27013(strM42366, c9091)) {
                                    i2 = i10 & 32;
                                    if (!(i2 != 0 && (i10 & 64) == 0 && (i10 & 128) == 0) && C11774.m27010(strM42366, c9091) && ((i3 = i10 & 2) == 0 || C11774.m27007(c9091))) {
                                        i4 = c9091.f24648;
                                        if (i4 == 4 || i2 != 0) {
                                            if (i4 == 6 || (i10 & 128) != 0) {
                                                if (i4 != 5 && (i10 & 64) == 0) {
                                                    if (i3 == 0) {
                                                        throw new C3870(C21459.m48622("Dimension value is not allowed here: ", c18622.m42369(), "=\"", c18622.m42366(), "\""), c18622.m42370());
                                                    }
                                                }
                                            } else if (i3 == 0) {
                                                throw new C3870(C21459.m48622("Fraction value is not allowed here: ", c18622.m42369(), "=\"", c18622.m42366(), "\""), c18622.m42370());
                                            }
                                        } else if (i3 == 0) {
                                            throw new C3870(C21459.m48622("Float value is not allowed here: ", c18622.m42369(), "=\"", c18622.m42366(), "\""), c18622.m42370());
                                        }
                                        if ((i10 & 8) == 0) {
                                            if (!strM42366.startsWith("<") && strM42366.endsWith(">")) {
                                                Matcher matcher = Pattern.compile("<0x([0-9a-f]{1,8}), type 0x([0-9a-f]{2})>").matcher(strM42366.toLowerCase());
                                                if (matcher.matches()) {
                                                    String strGroup = matcher.group(1);
                                                    C12826.requireNonNull(strGroup);
                                                    c9091.f24647 = C11774.m27008(strGroup);
                                                    String strGroup2 = matcher.group(2);
                                                    C12826.requireNonNull(strGroup2);
                                                    c9091.f24648 = C11774.m27008(strGroup2);
                                                } else {
                                                    if ((i10 & 2) != 0) {
                                                        throw new C3870(C10965.m25286(C5633.m12525("Error: ", c18622.m42369(), "=\"", c18622.m42366(), "\" ["), c18344M43189.m41783(), "]"), c18622.m42370());
                                                    }
                                                    c9091.f24648 = 3;
                                                    C19149 c191414 = this.f9885;
                                                    if (strM42366.indexOf(92) != -1) {
                                                        sb = new StringBuilder(strM42366.length() + 10);
                                                        i5 = 0;
                                                        while (i5 < strM42366.length()) {
                                                            cCharAt = strM42366.charAt(i5);
                                                            if (cCharAt == '\\') {
                                                                i5++;
                                                                if (i5 >= strM42366.length()) {
                                                                    cCharAt2 = strM42366.charAt(i5);
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
                                                        strM42366 = sb.toString();
                                                    }
                                                    c16466.f48362 = c191414.m43629(strM42366);
                                                }
                                            } else {
                                                if ((i10 & 2) != 0) {
                                                    throw new C3870(C10965.m25286(C5633.m12525("Error: ", c18622.m42369(), "=\"", c18622.m42366(), "\" ["), c18344M43189.m41783(), "]"), c18622.m42370());
                                                }
                                                c9091.f24648 = 3;
                                                C19149 c191415 = this.f9885;
                                                if (strM42366.indexOf(92) != -1) {
                                                    sb = new StringBuilder(strM42366.length() + 10);
                                                    i5 = 0;
                                                    while (i5 < strM42366.length()) {
                                                        cCharAt = strM42366.charAt(i5);
                                                        if (cCharAt == '\\') {
                                                            i5++;
                                                            if (i5 >= strM42366.length()) {
                                                                cCharAt2 = strM42366.charAt(i5);
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
                                                    strM42366 = sb.toString();
                                                }
                                                c16466.f48362 = c191415.m43629(strM42366);
                                            }
                                        } else if (strM42366.equals("true")) {
                                            c9091.f24647 = -1;
                                            c9091.f24648 = 18;
                                        } else if (strM42366.equals("false")) {
                                            c9091.f24647 = 0;
                                            c9091.f24648 = 18;
                                        } else if (!strM42366.startsWith("<")) {
                                            if ((i10 & 2) != 0) {
                                                throw new C3870(C10965.m25286(C5633.m12525("Error: ", c18622.m42369(), "=\"", c18622.m42366(), "\" ["), c18344M43189.m41783(), "]"), c18622.m42370());
                                            }
                                            c9091.f24648 = 3;
                                            C19149 c191416 = this.f9885;
                                            if (strM42366.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM42366.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM42366.length()) {
                                                    cCharAt = strM42366.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM42366.length()) {
                                                            cCharAt2 = strM42366.charAt(i5);
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
                                                strM42366 = sb.toString();
                                            }
                                            c16466.f48362 = c191416.m43629(strM42366);
                                        } else {
                                            if ((i10 & 2) != 0) {
                                                throw new C3870(C10965.m25286(C5633.m12525("Error: ", c18622.m42369(), "=\"", c18622.m42366(), "\" ["), c18344M43189.m41783(), "]"), c18622.m42370());
                                            }
                                            c9091.f24648 = 3;
                                            C19149 c191417 = this.f9885;
                                            if (strM42366.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM42366.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM42366.length()) {
                                                    cCharAt = strM42366.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM42366.length()) {
                                                            cCharAt2 = strM42366.charAt(i5);
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
                                                strM42366 = sb.toString();
                                            }
                                            c16466.f48362 = c191417.m43629(strM42366);
                                        }
                                    } else if ((i10 & 8) == 0) {
                                        if (!strM42366.startsWith("<")) {
                                            if ((i10 & 2) != 0) {
                                                throw new C3870(C10965.m25286(C5633.m12525("Error: ", c18622.m42369(), "=\"", c18622.m42366(), "\" ["), c18344M43189.m41783(), "]"), c18622.m42370());
                                            }
                                            c9091.f24648 = 3;
                                            C19149 c191418 = this.f9885;
                                            if (strM42366.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM42366.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM42366.length()) {
                                                    cCharAt = strM42366.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM42366.length()) {
                                                            cCharAt2 = strM42366.charAt(i5);
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
                                                strM42366 = sb.toString();
                                            }
                                            c16466.f48362 = c191418.m43629(strM42366);
                                        } else {
                                            if ((i10 & 2) != 0) {
                                                throw new C3870(C10965.m25286(C5633.m12525("Error: ", c18622.m42369(), "=\"", c18622.m42366(), "\" ["), c18344M43189.m41783(), "]"), c18622.m42370());
                                            }
                                            c9091.f24648 = 3;
                                            C19149 c191419 = this.f9885;
                                            if (strM42366.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM42366.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM42366.length()) {
                                                    cCharAt = strM42366.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM42366.length()) {
                                                            cCharAt2 = strM42366.charAt(i5);
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
                                                strM42366 = sb.toString();
                                            }
                                            c16466.f48362 = c191419.m43629(strM42366);
                                        }
                                    } else if (strM42366.equals("true")) {
                                        c9091.f24647 = -1;
                                        c9091.f24648 = 18;
                                    } else if (strM42366.equals("false")) {
                                        c9091.f24647 = 0;
                                        c9091.f24648 = 18;
                                    } else if (!strM42366.startsWith("<")) {
                                        if ((i10 & 2) != 0) {
                                            throw new C3870(C10965.m25286(C5633.m12525("Error: ", c18622.m42369(), "=\"", c18622.m42366(), "\" ["), c18344M43189.m41783(), "]"), c18622.m42370());
                                        }
                                        c9091.f24648 = 3;
                                        C19149 c1914110 = this.f9885;
                                        if (strM42366.indexOf(92) != -1) {
                                            sb = new StringBuilder(strM42366.length() + 10);
                                            i5 = 0;
                                            while (i5 < strM42366.length()) {
                                                cCharAt = strM42366.charAt(i5);
                                                if (cCharAt == '\\') {
                                                    i5++;
                                                    if (i5 >= strM42366.length()) {
                                                        cCharAt2 = strM42366.charAt(i5);
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
                                            strM42366 = sb.toString();
                                        }
                                        c16466.f48362 = c1914110.m43629(strM42366);
                                    } else {
                                        if ((i10 & 2) != 0) {
                                            throw new C3870(C10965.m25286(C5633.m12525("Error: ", c18622.m42369(), "=\"", c18622.m42366(), "\" ["), c18344M43189.m41783(), "]"), c18622.m42370());
                                        }
                                        c9091.f24648 = 3;
                                        C19149 c1914111 = this.f9885;
                                        if (strM42366.indexOf(92) != -1) {
                                            sb = new StringBuilder(strM42366.length() + 10);
                                            i5 = 0;
                                            while (i5 < strM42366.length()) {
                                                cCharAt = strM42366.charAt(i5);
                                                if (cCharAt == '\\') {
                                                    i5++;
                                                    if (i5 >= strM42366.length()) {
                                                        cCharAt2 = strM42366.charAt(i5);
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
                                            strM42366 = sb.toString();
                                        }
                                        c16466.f48362 = c1914111.m43629(strM42366);
                                    }
                                }
                            }
                            c16466.f48359 = c18344M43189;
                            c18622.m42364(c16466);
                            i9 = 1;
                            it = it2;
                            c191411 = c191410;
                            c21976M49530 = c21976M49530;
                            i8 = i;
                        }
                        c191410 = c191411;
                        i = i8;
                        c16466.f48359 = c18344M43189;
                        c18622.m42364(c16466);
                        i9 = 1;
                        it = it2;
                        c191411 = c191410;
                        c21976M49530 = c21976M49530;
                        i8 = i;
                    }
                    Collections.sort(c15939M49533.m36178(), new C9445());
                    c19149 = c191411;
                    c21976M49530 = c21976M49530;
                }
            } else {
                C19149 c1914112 = c191411;
                C24657 c24657M49535 = c21976M49530.m49534(i8);
                c19149 = c1914112;
                c25184.f80557 = c19149.m43629(c24657M49535.m54302());
                c25184.f80558 = c19149.m43629(c24657M49535.m54304());
                c24657M49535.m54301(c25184);
            }
            i8++;
            c191411 = c19149;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX INFO: renamed from: ֫ */
    public final void m9152(C11996 c11996) {
        C21976 c21976 = this.f9884;
        c11996.mo15111((short) 3);
        int i = 8;
        c11996.mo15111((short) 8);
        long position = c11996.getPosition();
        int i2 = 4;
        c11996.skipBytes(4);
        int i3 = 0;
        this.f9885.m43627(this.f9886).m34279((InterfaceC6631) c11996, false, (C20689) null);
        int[] iArrM43630 = this.f9885.m43630();
        if (iArrM43630.length > 0) {
            c11996.mo15113(MLKEMEngine.KyberPolyBytes);
            c11996.mo15113(8);
            c11996.writeInt((iArrM43630.length * 4) + 8);
            c11996.mo15112(iArrM43630);
        }
        int i4 = 0;
        while (i4 < c21976.m49531()) {
            int iM49536 = c21976.m49536(i4);
            if (iM49536 == 0) {
                C24657 c24657M49534 = c21976.m49534(i4);
                C25184 c25184 = (C25184) c24657M49534.m54303();
                c11996.writeInt(1048832);
                c11996.writeInt(24);
                c11996.writeInt(c24657M49534.m54300());
                c11996.writeInt(-1);
                c11996.writeInt(c25184.f80557.m45066());
                c11996.writeInt(c25184.f80558.m45066());
            } else if (iM49536 == 1) {
                C15939 c15939M49532 = c21976.m49532(i4);
                C25184 c25185 = (C25184) c15939M49532.m36183();
                List listM36178 = c15939M49532.m36178();
                c11996.writeInt(1048834);
                int size = ((ArrayList) listM36178).size();
                c11996.writeInt((size * 20) + 36);
                c11996.writeInt(c15939M49532.m36180());
                c11996.writeInt(-1);
                C19820 c19820 = c25185.f80557;
                c11996.writeInt(c19820 == null ? -1 : c19820.m45066());
                c11996.writeInt(c25185.f80558.m45066());
                c11996.mo15113(20);
                c11996.mo15113(20);
                if (size == 0) {
                    c11996.m27451(0L);
                } else {
                    c11996.mo15111((short) size);
                    int i5 = 0;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) listM36178;
                        if (i5 < arrayList.size()) {
                            String strM42363 = ((C18622) arrayList.get(i5)).m42363();
                            strM42363.getClass();
                            switch (strM42363) {
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
                            c11996.mo15111(s);
                            c11996.mo15111(s2);
                            c11996.mo15111(s3);
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                C16466 c16466 = (C16466) ((C18622) arrayList.get(i6)).m42368();
                                C19820 c19821 = c16466.f48361;
                                c11996.writeInt(c19821 == null ? -1 : c19821.m45066());
                                c11996.writeInt(c16466.f48360.m45066());
                                C9091 c9091 = c16466.f48363;
                                if (c9091.f24648 == 3) {
                                    int iM45066 = c16466.f48362.m45066();
                                    c9091.f24647 = iM45066;
                                    c9091.f24649 = iM45066;
                                }
                                c11996.writeInt(c9091.f24649);
                                c11996.writeInt((c9091.f24648 << 24) | 8);
                                c11996.writeInt(c9091.f24647);
                            }
                        }
                    }
                }
            } else if (iM49536 == 2) {
                C15939 c15939M49533 = c21976.m49532(i4);
                C25184 c25186 = (C25184) c15939M49533.m36183();
                c11996.writeInt(1048835);
                c11996.writeInt(24);
                c11996.writeInt(c15939M49533.m36180());
                c11996.writeInt(-1);
                C19820 c19822 = c25186.f80557;
                c11996.writeInt(c19822 != null ? c19822.m45066() : -1);
                c11996.writeInt(c25186.f80558.m45066());
            } else if (iM49536 == 3) {
                C24657 c24657M49535 = c21976.m49534(i4);
                C25184 c25187 = (C25184) c24657M49535.m54303();
                c11996.writeInt(1048833);
                c11996.writeInt(24);
                c11996.writeInt(c24657M49535.m54300());
                c11996.writeInt(-1);
                c11996.writeInt(c25187.f80557.m45066());
                c11996.writeInt(c25187.f80558.m45066());
            } else if (iM49536 == i2) {
                C8564 c8564M49535 = c21976.m49535(i4);
                C25184 c25188 = (C25184) c8564M49535.m19966();
                c11996.writeInt(1048836);
                c11996.writeInt(28);
                c11996.writeInt(c8564M49535.m19964());
                c11996.writeInt(-1);
                c11996.writeInt(c25188.f80557.m45066());
                c11996.writeInt(i);
                c11996.writeInt(i3);
            }
            i4++;
            i = 8;
            i2 = 4;
            i3 = 0;
        }
        long position2 = c11996.getPosition();
        c11996.seek(position);
        c11996.writeInt((int) ((position2 - position) + 4));
        c11996.seek(position2);
    }
}
