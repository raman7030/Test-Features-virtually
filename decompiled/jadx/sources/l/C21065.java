package l;

import android.os.Build;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.text.Normalizer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.pqc.crypto.newhope.Params;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.᩷ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21065 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f67940;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5855 f67941;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f67942;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5855 f67943;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public volatile HashMap f67944;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC10795 f67945;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f67946;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7225 f67947;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f67948;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f67949;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f67950 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f67951;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f67952;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public BitSet f67953;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67954;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5150[] f67955;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f67956;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f67957;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f67958;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f67959;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f67960;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f67961;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m47948(int i, int i2) {
        if ((i2 & 1) != 0) {
            return i == 10;
        }
        return i == 10 || i == 13 || (i | 1) == 8233 || i == 133;
    }

    public C21065(String str, int i) {
        this.f67958 = str;
        this.f67956 = i;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0214  */
    /* JADX WARN: Code duplicated, block: B:130:0x0222  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:330:0x05f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:331:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:332:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:393:0x0706  */
    /* JADX WARN: Code duplicated, block: B:401:0x0725 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x0727  */
    /* JADX WARN: Code duplicated, block: B:484:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:487:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:489:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:494:0x08d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:495:0x08db  */
    /* JADX WARN: Code duplicated, block: B:496:0x08df  */
    /* JADX WARN: Code duplicated, block: B:498:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:501:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:503:0x0901  */
    /* JADX WARN: Code duplicated, block: B:504:0x0905  */
    /* JADX WARN: Code duplicated, block: B:506:0x0910  */
    /* JADX WARN: Code duplicated, block: B:507:0x0917  */
    /* JADX WARN: Code duplicated, block: B:509:0x0922  */
    /* JADX WARN: Code duplicated, block: B:511:0x0926  */
    /* JADX WARN: Code duplicated, block: B:513:0x0931  */
    /* JADX WARN: Code duplicated, block: B:514:0x0934  */
    /* JADX WARN: Code duplicated, block: B:516:0x093f  */
    /* JADX WARN: Code duplicated, block: B:517:0x0956  */
    /* JADX WARN: Code duplicated, block: B:519:0x095f  */
    /* JADX WARN: Code duplicated, block: B:521:0x096b  */
    /* JADX WARN: Code duplicated, block: B:522:0x0971  */
    /* JADX WARN: Code duplicated, block: B:526:0x099b  */
    /* JADX WARN: Code duplicated, block: B:527:0x099e  */
    /* JADX WARN: Code duplicated, block: B:536:0x09be  */
    /* JADX WARN: Code duplicated, block: B:537:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:566:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x09a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0314 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1476 m47923(int i, String str) {
        C21065 c21065;
        EnumC23886 enumC23886;
        C5150 c5150;
        C5855 c13615;
        C5855 c5855;
        int iM47945;
        C5855 c5855M47926;
        C20673 c20673;
        int i2;
        EnumC1497 enumC1497;
        int i3;
        C12910 c21378;
        EnumC1497 enumC1498;
        C22643 c22643;
        C11355 c11355;
        C6953 c6953;
        boolean z;
        C5855 c5855M47938;
        C5855 c5855M47927;
        boolean z2;
        C5855 c5856;
        C21065 c21066;
        StringBuilder sb;
        int i4;
        BitSet bitSet;
        StringBuilder sb2;
        int iM42521;
        int i5;
        int iM42522;
        int i6;
        char c;
        int i7;
        int i8;
        C21065 c21067;
        C21065 c21068 = new C21065(str, i);
        int i9 = 0;
        if (str.isEmpty()) {
            C15026 c15026 = C14403.f44165;
            c21068.f67941 = new C0085(c15026);
            c21068.f67943 = c15026;
            c21068.f67947 = C14403.m34430(c15026);
            c21067 = c21068;
        } else {
            c21068.f67946 = false;
            c21068.f67951 = false;
            c21068.f67953 = null;
            c21068.f67947 = null;
            c21068.f67957 = str;
            c21068.m47944();
            char c2 = '-';
            char c3 = '\\';
            if (c21068.m47942(128) && !c21068.m47942(16)) {
                c21065 = c21068;
                c21065 = c21068;
                int[] iArr = new int[c21068.f67952.length];
                int iCharCount = 0;
                int i10 = 0;
                while (iCharCount < c21068.f67958.length()) {
                    iArr[i10] = iCharCount;
                    iCharCount += Character.charCount(c21068.f67958.codePointAt(iCharCount));
                    i10++;
                }
                int length = c21068.f67958.length();
                iArr[i10 + 1] = length;
                iArr[i10] = length;
                int[] iArrM47933 = c21068.m47933(iArr);
                String str2 = new String(c21068.f67952, 0, c21068.f67940);
                int[] iArr2 = new int[str2.length()];
                int i11 = 0;
                while (i11 < c21068.f67940) {
                    int iCharCount2 = Character.charCount(c21068.f67952[i11]) + i9;
                    Arrays.fill(iArr2, i9, iCharCount2, iArrM47933[i11]);
                    i11++;
                    i9 = iCharCount2;
                }
                String str3 = c21068.f67958;
                int i12 = c21068.f67956;
                int length2 = str2.length();
                StringBuilder sb3 = new StringBuilder(str3.length());
                C16830 c16830 = new C16830(sb3, str3);
                BitSet bitSet2 = c16830.f51667;
                C18242 c18242 = new C18242(str2, i12);
                ArrayDeque arrayDeque = new ArrayDeque();
                int iM42523 = 0;
                boolean z3 = false;
                int i13 = 0;
                int i14 = 0;
                C21065 c21069 = c21068;
                loop2: while (true) {
                    boolean z4 = false;
                    C21065 c210610 = c21069;
                    while (true) {
                        boolean z5 = false;
                        C21065 c210611 = c210610;
                        while (true) {
                            c21066 = c210611;
                            if (iM42523 >= length2) {
                                break loop2;
                            }
                            int iM42524 = c18242.m42521(iM42523);
                            if (iM42524 != iM42523) {
                                if (iM42524 == length2) {
                                    break loop2;
                                }
                                z5 = false;
                                iM42523 = iM42524;
                            }
                            char cCharAt = str2.charAt(iM42523);
                            if (cCharAt == c3) {
                                c = c3;
                                i7 = iM42523 + 1;
                                if (i7 < length2) {
                                    break;
                                }
                            }
                            if (i14 > 0 && cCharAt == c2 && z4 && (i6 = iM42523 + 1) < length2) {
                                sb = sb3;
                                if (str2.charAt(i6) != '[' && str2.charAt(i6) != ']') {
                                    int iM42525 = c18242.m42521(i6);
                                    if (iM42525 < length2) {
                                        iM42525 = str2.charAt(iM42525) == '\\' ? c18242.m42522(iM42525, bitSet2, iArr2) : iM42525 + Character.charCount(str2.codePointAt(iM42525));
                                    }
                                    iM42523 = iM42525;
                                    c2 = '-';
                                    c3 = '\\';
                                    z3 = false;
                                    break;
                                }
                            } else {
                                sb = sb3;
                            }
                            if (i14 > 0 && cCharAt == '&' && (iM42522 = c18242.m42521(iM42523 + 1)) < length2 && str2.charAt(iM42522) == '&') {
                                iM42523 = iM42522 + 1;
                                c2 = '-';
                                c3 = '\\';
                                break;
                            }
                            if (i14 == 0 && cCharAt == '(') {
                                int i15 = c18242.f56692;
                                iM42523++;
                                int iM42526 = c18242.m42521(iM42523);
                                String str4 = c18242.f56693;
                                int length3 = str4.length();
                                if (iM42526 != length3) {
                                    i4 = length2;
                                    bitSet = bitSet2;
                                    if (str4.charAt(iM42526) == '?') {
                                        int i16 = iM42526 + 1;
                                        int i17 = c18242.f56692;
                                        boolean z6 = false;
                                        while (true) {
                                            iM42521 = c18242.m42521(i16);
                                            if (iM42521 < length3) {
                                                int i18 = length3;
                                                char cCharAt2 = str4.charAt(iM42521);
                                                String str5 = str4;
                                                if (cCharAt2 != ':' && cCharAt2 != ')') {
                                                    if (cCharAt2 != '-' || z6) {
                                                        if (cCharAt2 == 'U') {
                                                            i5 = 320;
                                                        } else if (cCharAt2 == 'i') {
                                                            i5 = 2;
                                                        } else if (cCharAt2 == 'm') {
                                                            i5 = 8;
                                                        } else if (cCharAt2 == 's') {
                                                            i5 = 32;
                                                        } else if (cCharAt2 == 'u') {
                                                            i5 = 64;
                                                        } else if (cCharAt2 == 'x') {
                                                            i5 = 4;
                                                        } else if (cCharAt2 != 'c') {
                                                            i5 = cCharAt2 != 'd' ? 0 : 1;
                                                        } else {
                                                            i5 = 128;
                                                        }
                                                        if (i5 != 0) {
                                                            int i19 = c18242.f56692;
                                                            c18242.f56692 = z6 ? (~i5) & i19 : i5 | i19;
                                                        }
                                                    } else {
                                                        z6 = true;
                                                    }
                                                    i16 = iM42521 + 1;
                                                    length3 = i18;
                                                    str4 = str5;
                                                }
                                            }
                                            c18242.f56692 = i17;
                                        }
                                    }
                                    if (iM42521 >= 0) {
                                        if (str2.charAt(iM42521) == ':') {
                                            arrayDeque.push(Integer.valueOf(i15));
                                        }
                                        sb2 = sb;
                                        iM42523 = iM42521 + 1;
                                    } else {
                                        arrayDeque.push(Integer.valueOf(i15));
                                        sb2 = sb;
                                    }
                                } else {
                                    i4 = length2;
                                    bitSet = bitSet2;
                                }
                                iM42521 = -1;
                                if (iM42521 >= 0) {
                                    if (str2.charAt(iM42521) == ':') {
                                        arrayDeque.push(Integer.valueOf(i15));
                                    }
                                    sb2 = sb;
                                    iM42523 = iM42521 + 1;
                                } else {
                                    arrayDeque.push(Integer.valueOf(i15));
                                    sb2 = sb;
                                }
                            } else {
                                i4 = length2;
                                bitSet = bitSet2;
                                if (i14 == 0 && cCharAt == ')' && !arrayDeque.isEmpty()) {
                                    c18242.f56692 = ((Integer) arrayDeque.pop()).intValue();
                                }
                                if (cCharAt == '[') {
                                    if (i14 == 0) {
                                        int i20 = iArr2[iM42523];
                                        if (i13 < i20) {
                                            c16830.m39603(i13, i20);
                                        }
                                        i13 = i20;
                                    }
                                    i14++;
                                    z3 = true;
                                    z4 = false;
                                    z5 = true;
                                    sb2 = sb;
                                } else {
                                    if (cCharAt != ']' || i14 <= 0 || z3) {
                                        sb2 = sb;
                                        if (i14 > 0) {
                                            boolean z7 = (cCharAt == '^' && z5) ? false : true;
                                            if (z7) {
                                                z3 = false;
                                            }
                                            z4 = z7;
                                        }
                                    } else {
                                        i14--;
                                        if (i14 == 0) {
                                            int i21 = iArr2[iM42523] + 1;
                                            sb2 = sb;
                                            sb2.append(Normalizer.normalize(str3.substring(i13, i21), Normalizer.Form.NFC));
                                            i13 = i21;
                                        } else {
                                            sb2 = sb;
                                        }
                                        z3 = false;
                                        z4 = false;
                                    }
                                    z5 = false;
                                }
                                iM42523++;
                            }
                            c2 = '-';
                            length2 = i4;
                            sb3 = sb2;
                            c210611 = c21066;
                            bitSet2 = bitSet;
                            c3 = '\\';
                        }
                        char cCharAt3 = str2.charAt(i7);
                        z4 = "dDsSwWhHVpP".indexOf(cCharAt3) < 0 && (cCharAt3 != 'v' || ((i8 = iM42523 + 2) < length2 && str2.charAt(i8) == c2));
                        iM42523 = c18242.m42522(iM42523, bitSet2, iArr2);
                        z3 = false;
                        c3 = c;
                        c210610 = c21066;
                    }
                    sb3 = sb;
                    c21069 = c21066;
                }
                StringBuilder sb4 = sb3;
                if (i13 < str3.length()) {
                    c16830.m39603(i13, str3.length());
                }
                C21065 c210612 = c21066;
                c210612.f67957 = sb4.toString();
                c210612.m47944();
                c21065 = c210612;
            }
            c21065 = c21068;
            c21065 = c21068;
            c21065 = c21068;
            if (!c21065.m47942(16)) {
                c21065.m47933((int[]) null);
            }
            c21065.f67942 = new int[32];
            c21065.f67955 = new C5150[10];
            c21065.f67944 = null;
            c21065.f67960 = new ArrayList(10);
            if (c21065.m47942(16)) {
                C2203 c2203M47924 = c21065.m47924(c21065.f67940, c21065.f67959, c21065.f67952);
                c21065.f67943 = c2203M47924;
                c2203M47924.f17958 = C14403.f44165;
            } else {
                C15026 c15027 = C14403.f44165;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(new C6953(c15027, null));
                while (true) {
                    C6953 c6954 = (C6953) arrayDeque2.peek();
                    C5855 c5857 = c6954.f21435;
                    C5855 c5858 = c6954.f21429;
                    while (true) {
                        int iM47949 = c21065.m47949();
                        if (iM47949 != 0) {
                            if (iM47949 == 36) {
                                c21065.m47950();
                                c5855M47938 = c21065.m47942(1) ? new C1704(c21065.m47942(8)) : new C9384(c21065.m47942(8));
                            } else {
                                if (iM47949 != 46) {
                                    if (iM47949 != 63) {
                                        if (iM47949 != 124) {
                                            if (iM47949 != 125) {
                                                switch (iM47949) {
                                                    case 40:
                                                    case 41:
                                                        break;
                                                    case 42:
                                                    case 43:
                                                        break;
                                                    default:
                                                        switch (iM47949) {
                                                            case 91:
                                                                c5855M47938 = (!c21065.m47942(128) || c21065.m47942(16)) ? c21065.m47929(c21065.m47946()) : new C12205(c21065.m47946());
                                                                break;
                                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                                int[] iArr3 = c21065.f67952;
                                                                int i22 = c21065.f67954 + 1;
                                                                c21065.f67954 = i22;
                                                                int i23 = iArr3[i22];
                                                                if (i23 == 112 || i23 == 80) {
                                                                    boolean z8 = i23 == 80;
                                                                    if (c21065.m47950() != 123) {
                                                                        c21065.m47936();
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c5855M47938 = (!c21065.m47942(128) || c21065.m47942(16)) ? c21065.m47929(c21065.m47928(z2, z8)) : new C12205(c21065.m47928(z2, z8));
                                                                } else {
                                                                    c21065.m47936();
                                                                    c5855M47938 = c21065.m47938();
                                                                }
                                                                break;
                                                            case 93:
                                                                c5855M47938 = c21065.m47938();
                                                                break;
                                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                                c21065.m47950();
                                                                if (!c21065.m47942(8)) {
                                                                    c5855M47938 = new C5004();
                                                                } else if (c21065.m47942(1)) {
                                                                    c5855M47938 = new C7142();
                                                                } else {
                                                                    c5855M47938 = new C7121();
                                                                }
                                                                break;
                                                            default:
                                                                c5855M47938 = c21065.m47938();
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                c5855M47938 = c21065.m47938();
                                            }
                                        }
                                    }
                                    c21065.m47950();
                                    throw c21065.m47947("Dangling meta character '" + ((char) iM47949) + "'");
                                }
                                c21065.m47950();
                                c5855M47938 = c21065.m47942(32) ? new C2182() : c21065.m47942(1) ? new C10877() : new C8678();
                            }
                            c5855M47927 = c21065.m47926(c5855M47938);
                            if (c5857 == null) {
                                c5857 = c5855M47927;
                            } else {
                                c5858.f17958 = c5855M47927;
                            }
                            c5858 = c5855M47927;
                        } else {
                            if (c21065.f67954 >= c21065.f67940) {
                            }
                            c5855M47938 = c21065.m47938();
                            c5855M47927 = c21065.m47926(c5855M47938);
                            if (c5857 == null) {
                                c5857 = c5855M47927;
                            } else {
                                c5858.f17958 = c5855M47927;
                            }
                            c5858 = c5855M47927;
                        }
                    }
                    c6954.f21435 = c5857;
                    c6954.f21429 = c5858;
                    if (c21065.m47949() == 40) {
                        C14713 c14713 = new C14713(c21065.f67956, c21065.f67960.size());
                        c21065.f67941 = null;
                        if (c21065.m47950() == 63) {
                            int iM47952 = c21065.m47952();
                            if (iM47952 != 33) {
                                if (iM47952 != 36) {
                                    if (iM47952 == 58) {
                                        c14713.f44930 = c21065.m47925(true);
                                    } else if (iM47952 != 64) {
                                        switch (iM47952) {
                                            case 60:
                                                int iM47934 = c21065.m47934();
                                                if (iM47934 == 61 || iM47934 == 33) {
                                                    c14713.f44926 = iM47934 == 61 ? EnumC23886.POSITIVE_LOOKBEHIND : EnumC23886.NEGATIVE_LOOKBEHIND;
                                                    c14713.f44928 = c21065.f67954;
                                                    c14713.f44929 = c21065.f67950;
                                                    c14713.f44930 = c21065.m47925(true);
                                                } else {
                                                    String strM47921 = c21065.m47921(iM47934);
                                                    if (((HashMap) c21065.m47954()).containsKey(strM47921)) {
                                                        throw c21065.m47947(C4860.m14172("Named capturing group <", strM47921, "> is already defined"));
                                                    }
                                                    c14713.f44925 = true;
                                                    c14713.f44930 = c21065.m47925(false);
                                                    ((HashMap) c21065.m47954()).put(strM47921, Integer.valueOf(c21065.f67950 - 1));
                                                }
                                                break;
                                            case 61:
                                                if (iM47952 == 61) {
                                                    enumC23886 = EnumC23886.POSITIVE_LOOKAHEAD;
                                                } else {
                                                    enumC23886 = EnumC23886.NEGATIVE_LOOKAHEAD;
                                                }
                                                c14713.f44926 = enumC23886;
                                                c14713.f44930 = c21065.m47925(true);
                                                break;
                                            case 62:
                                                c14713.f44926 = EnumC23886.INDEPENDENT;
                                                c14713.f44930 = c21065.m47925(true);
                                                break;
                                            default:
                                                c21065.m47936();
                                                int iM479410 = c21065.m47949();
                                                while (true) {
                                                    if (iM479410 != 45) {
                                                        if (iM479410 == 85) {
                                                            c21065.f67956 |= 320;
                                                        } else if (iM479410 == 105) {
                                                            c21065.f67956 |= 2;
                                                        } else if (iM479410 == 109) {
                                                            c21065.f67956 |= 8;
                                                        } else if (iM479410 == 115) {
                                                            c21065.f67956 |= 32;
                                                        } else if (iM479410 == 117) {
                                                            c21065.f67956 |= 64;
                                                        } else if (iM479410 == 120) {
                                                            c21065.f67956 |= 4;
                                                        } else if (iM479410 == 99) {
                                                            c21065.f67956 |= 128;
                                                        } else if (iM479410 == 100) {
                                                            c21065.f67956 |= 1;
                                                        }
                                                        iM479410 = c21065.m47950();
                                                    } else {
                                                        c21065.m47950();
                                                        int iM479411 = c21065.m47949();
                                                        while (true) {
                                                            if (iM479411 == 85) {
                                                                c21065.f67956 &= -321;
                                                            } else if (iM479411 == 105) {
                                                                c21065.f67956 &= -3;
                                                            } else if (iM479411 == 109) {
                                                                c21065.f67956 &= -9;
                                                            } else if (iM479411 == 115) {
                                                                c21065.f67956 &= -33;
                                                            } else if (iM479411 == 117) {
                                                                c21065.f67956 &= -65;
                                                            } else if (iM479411 == 120) {
                                                                c21065.f67956 &= -5;
                                                            } else if (iM479411 == 99) {
                                                                c21065.f67956 &= -129;
                                                            } else if (iM479411 == 100) {
                                                                c21065.f67956 &= -2;
                                                            }
                                                            iM479411 = c21065.m47950();
                                                        }
                                                    }
                                                }
                                                int iM47935 = c21065.m47934();
                                                if (iM47935 != 41) {
                                                    if (iM47935 != 58) {
                                                        throw c21065.m47947("Unknown inline modifier");
                                                    }
                                                    c14713.f44930 = c21065.m47925(true);
                                                } else {
                                                    c14713 = null;
                                                }
                                                break;
                                        }
                                    }
                                }
                                throw c21065.m47947("Unknown group type");
                            }
                            if (iM47952 == 61) {
                                enumC23886 = EnumC23886.POSITIVE_LOOKAHEAD;
                            } else {
                                enumC23886 = EnumC23886.NEGATIVE_LOOKAHEAD;
                            }
                            c14713.f44926 = enumC23886;
                            c14713.f44930 = c21065.m47925(true);
                            if (c14713 != null) {
                                arrayDeque2.push(new C6953(c14713.f44932, c14713));
                            }
                        } else {
                            c14713.f44925 = true;
                            c14713.f44930 = c21065.m47925(false);
                        }
                        c14713.f44932 = c21065.f67941;
                        if (c14713 != null) {
                            arrayDeque2.push(new C6953(c14713.f44932, c14713));
                        }
                    } else {
                        C5855 c5859 = c6954.f21435;
                        C5855 c58510 = c6954.f21432;
                        if (c5859 == null) {
                            c5859 = c58510;
                        } else {
                            C5855 c58511 = c6954.f21429;
                            c58511.f17958 = c58510;
                            c21065.f67941 = c58511;
                        }
                        C5855 c58512 = c21065.f67941;
                        if (c6954.f21434 == null) {
                            c6954.f21434 = c5859;
                            c6954.f21433 = c58512;
                        } else {
                            if (c6954.f21430 == null) {
                                C22643 c22644 = new C22643();
                                c6954.f21430 = c22644;
                                c22644.f17958 = c58510;
                            }
                            if (c5859 == c58510) {
                                c5859 = null;
                            } else {
                                c58512.f17958 = c6954.f21430;
                            }
                            C5855 c58513 = c6954.f21434;
                            C11355 c11356 = c6954.f21428;
                            if (c58513 == c11356) {
                                int i24 = c11356.f33990;
                                C5855[] c5855Arr = c11356.f33989;
                                if (i24 >= c5855Arr.length) {
                                    C5855[] c5855Arr2 = new C5855[c5855Arr.length * 2];
                                    System.arraycopy(c5855Arr, 0, c5855Arr2, 0, c5855Arr.length);
                                    c11356.f33989 = c5855Arr2;
                                }
                                C5855[] c5855Arr3 = c11356.f33989;
                                int i25 = c11356.f33990;
                                c11356.f33990 = i25 + 1;
                                c5855Arr3[i25] = c5859;
                            } else {
                                if (c58513 == c58510) {
                                    c6954.f21434 = null;
                                } else {
                                    c6954.f21433.f17958 = c6954.f21430;
                                }
                                C11355 c11357 = new C11355(c6954.f21434, c5859, c6954.f21430);
                                c6954.f21428 = c11357;
                                c6954.f21434 = c11357;
                            }
                        }
                        c6954.f21429 = null;
                        c6954.f21435 = null;
                        if (c21065.m47949() == 124) {
                            c21065.m47950();
                        } else {
                            arrayDeque2.pop();
                            C11355 c11358 = c6954.f21428;
                            if (c11358 != null) {
                                c11358.m28103();
                            }
                            C14713 c14714 = c6954.f21431;
                            if (c14714 == null) {
                                c21065.f67943 = c6954.f21434;
                                if (c21065.f67940 != c21065.f67954) {
                                    if (c21065.m47949() == 41) {
                                        throw c21065.m47947("Unmatched closing ')'");
                                    }
                                    int i26 = c21065.f67954;
                                    int i27 = c21065.f67940;
                                    if (i26 == i27 + 1 && c21065.f67952[i27 - 1] == 92) {
                                        throw c21065.m47947("Unescaped trailing backslash");
                                    }
                                    throw c21065.m47947("Unexpected internal error");
                                }
                            } else {
                                C5855 c58514 = c6954.f21434;
                                C5150 c5151 = c14714.f44930;
                                C5855 c7826 = c14714.f44932;
                                int i28 = c14714.f44927;
                                boolean z9 = c14714.f44925;
                                c5151.f17958 = c58514;
                                if (c14714.f44926 == EnumC23886.NORMAL && z9) {
                                    c5150 = c5151;
                                    if (c58514 instanceof C19822) {
                                        C12765 c12765 = new C12765(c5151.f16092);
                                        c12765.f17958 = c5151.f17958;
                                        c12765.f16094 = c5151.f16094;
                                        c14714.f44930 = c12765;
                                        int i29 = ((C0916) c7826).f3502 / 2;
                                        C5150[] c5150Arr = c21065.f67955;
                                        if (i29 < c5150Arr.length) {
                                            c5150Arr[i29] = c12765;
                                        }
                                        c5150 = c12765;
                                    }
                                }
                                c5150 = c5151;
                                c5150 = c5151;
                                int iOrdinal = c14714.f44926.ordinal();
                                if (iOrdinal == 1) {
                                    c13615 = new C13615(c5150);
                                } else if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        c13615 = new C10670(c5150, EnumC1497.INDEPENDENT);
                                    } else if (iOrdinal == 4 || iOrdinal == 5) {
                                        c5855 = c5150;
                                        if (c14714.f44929 < c21065.f67950) {
                                            if (c21065.f67953 == null) {
                                                c21065.f67953 = new BitSet();
                                            }
                                            c21065.f67953.set(c14714.f44929, c21065.f67950);
                                        }
                                        c7826.f17958 = C19967.f64657;
                                        C12786 c12786 = new C12786();
                                        c5150.m16414(c12786);
                                        if (!c12786.f38398) {
                                            throw c21065.m47947("Look-behind group does not have an obvious maximum length");
                                        }
                                        int i30 = c14714.f44928;
                                        int i31 = c21065.f67940;
                                        while (true) {
                                            if (i30 >= i31) {
                                                z = false;
                                            } else if (C14403.m34428(c21065.f67952[i30])) {
                                                z = true;
                                            } else {
                                                i30++;
                                            }
                                        }
                                        c7826 = c14714.f44926 == EnumC23886.POSITIVE_LOOKBEHIND ? z ? new C7826(c12786.f38397, c12786.f38399, c5150) : new C0770(c12786.f38397, c12786.f38399, c5150) : z ? new C22788(c12786.f38397, c12786.f38399, c5150) : new C11500(c12786.f38397, c12786.f38399, c5150);
                                        if (i28 < c21065.f67960.size()) {
                                            ArrayList arrayList = c21065.f67960;
                                            arrayList.subList(i28, arrayList.size()).clear();
                                        }
                                        c5855 = c7826;
                                    }
                                    c5855 = c5150;
                                    int[] iArr4 = c21065.f67952;
                                    int i32 = c21065.f67954;
                                    c21065.f67954 = i32 + 1;
                                    iM47945 = iArr4[i32];
                                    if (c21065.m47942(4)) {
                                        iM47945 = c21065.m47945(iM47945);
                                    }
                                    if (41 == iM47945) {
                                        throw c21065.m47947("Unclosed group");
                                    }
                                    c21065.f67956 = c14714.f44931;
                                    c5855M47926 = c21065.m47926(c5855);
                                    if (c5855M47926 == c5855) {
                                        if (c14714.f44926 == EnumC23886.NORMAL && !z9) {
                                            ((C5150) c5855).f16093 = false;
                                            ((C0916) c7826).f3504 = false;
                                        }
                                        c21065.f67941 = c7826;
                                    } else if (c5855 == c7826) {
                                        c21065.f67941 = c5855M47926;
                                    } else {
                                        if (i28 < c21065.f67960.size()) {
                                            ArrayList arrayList2 = c21065.f67960;
                                            arrayList2.subList(i28, arrayList2.size()).clear();
                                        }
                                        if (c5855M47926 instanceof C10670) {
                                            enumC1498 = ((C10670) c5855M47926).f32086;
                                            if (enumC1498 == EnumC1497.POSSESSIVE) {
                                                c21065.f67941 = c5855M47926;
                                            } else {
                                                c22643 = new C22643();
                                                c7826.f17958 = c22643;
                                                if (enumC1498 == EnumC1497.GREEDY) {
                                                    c11355 = new C11355(c5855, null, c22643);
                                                } else {
                                                    c11355 = new C11355(null, c5855, c22643);
                                                }
                                                c21065.f67941 = c22643;
                                                c5855M47926 = c11355;
                                            }
                                        } else {
                                            if (c5855M47926 instanceof C20673) {
                                                throw c21065.m47947("Internal logic error");
                                            }
                                            c20673 = (C20673) c5855M47926;
                                            i2 = c20673.f66616;
                                            enumC1497 = c20673.f66617;
                                            if (enumC1497 == EnumC1497.POSSESSIVE) {
                                                c21065.f67941 = c5855M47926;
                                            } else if (c5855.m16414(new C12786())) {
                                                C0916 c0916 = (C0916) c7826;
                                                c5855M47926 = new C0210(c5855.f17958, c20673.f66618, c20673.f66616, c20673.f66617, c0916.f3503, c0916.f3502, z9);
                                                c21065.f67941 = c5855M47926;
                                            } else {
                                                i3 = ((C5150) c5855).f16092;
                                                if (enumC1497 == EnumC1497.GREEDY) {
                                                    c21378 = new C12910(c21065.f67949, i3);
                                                    if (i2 == Integer.MAX_VALUE) {
                                                        c21065.f67960.add(c21378);
                                                    }
                                                } else {
                                                    c21378 = new C21378(c21065.f67949, i3);
                                                }
                                                c5855M47926 = new C7266(c21378);
                                                c21065.f67949++;
                                                c21378.f38738 = c20673.f66618;
                                                c21378.f38739 = i2;
                                                c21378.f38737 = c5855;
                                                c7826.f17958 = c21378;
                                                c21065.f67941 = c21378;
                                            }
                                        }
                                    }
                                    c6953 = (C6953) arrayDeque2.peek();
                                    C5855 c58515 = c21065.f67941;
                                    if (c6953.f21435 == null) {
                                        c6953.f21435 = c5855M47926;
                                    } else {
                                        c6953.f21429.f17958 = c5855M47926;
                                    }
                                    c6953.f21429 = c58515;
                                } else {
                                    c13615 = new C10089(c5150);
                                }
                                c7826 = c13615;
                                c5855 = c7826;
                                c5855 = c5150;
                                int[] iArr5 = c21065.f67952;
                                int i33 = c21065.f67954;
                                c21065.f67954 = i33 + 1;
                                iM47945 = iArr5[i33];
                                if (c21065.m47942(4)) {
                                    iM47945 = c21065.m47945(iM47945);
                                }
                                if (41 == iM47945) {
                                    throw c21065.m47947("Unclosed group");
                                }
                                c21065.f67956 = c14714.f44931;
                                c5855M47926 = c21065.m47926(c5855);
                                if (c5855M47926 == c5855) {
                                    if (c14714.f44926 == EnumC23886.NORMAL) {
                                        ((C5150) c5855).f16093 = false;
                                        ((C0916) c7826).f3504 = false;
                                    }
                                    c21065.f67941 = c7826;
                                } else if (c5855 == c7826) {
                                    c21065.f67941 = c5855M47926;
                                } else {
                                    if (i28 < c21065.f67960.size()) {
                                        ArrayList arrayList3 = c21065.f67960;
                                        arrayList3.subList(i28, arrayList3.size()).clear();
                                    }
                                    if (c5855M47926 instanceof C10670) {
                                        enumC1498 = ((C10670) c5855M47926).f32086;
                                        if (enumC1498 == EnumC1497.POSSESSIVE) {
                                            c21065.f67941 = c5855M47926;
                                        } else {
                                            c22643 = new C22643();
                                            c7826.f17958 = c22643;
                                            if (enumC1498 == EnumC1497.GREEDY) {
                                                c11355 = new C11355(c5855, null, c22643);
                                            } else {
                                                c11355 = new C11355(null, c5855, c22643);
                                            }
                                            c21065.f67941 = c22643;
                                            c5855M47926 = c11355;
                                        }
                                    } else {
                                        if (c5855M47926 instanceof C20673) {
                                            throw c21065.m47947("Internal logic error");
                                        }
                                        c20673 = (C20673) c5855M47926;
                                        i2 = c20673.f66616;
                                        enumC1497 = c20673.f66617;
                                        if (enumC1497 == EnumC1497.POSSESSIVE) {
                                            c21065.f67941 = c5855M47926;
                                        } else if (c5855.m16414(new C12786())) {
                                            C0916 c0917 = (C0916) c7826;
                                            c5855M47926 = new C0210(c5855.f17958, c20673.f66618, c20673.f66616, c20673.f66617, c0917.f3503, c0917.f3502, z9);
                                            c21065.f67941 = c5855M47926;
                                        } else {
                                            i3 = ((C5150) c5855).f16092;
                                            if (enumC1497 == EnumC1497.GREEDY) {
                                                c21378 = new C12910(c21065.f67949, i3);
                                                if (i2 == Integer.MAX_VALUE) {
                                                    c21065.f67960.add(c21378);
                                                }
                                            } else {
                                                c21378 = new C21378(c21065.f67949, i3);
                                            }
                                            c5855M47926 = new C7266(c21378);
                                            c21065.f67949++;
                                            c21378.f38738 = c20673.f66618;
                                            c21378.f38739 = i2;
                                            c21378.f38737 = c5855;
                                            c7826.f17958 = c21378;
                                            c21065.f67941 = c21378;
                                        }
                                    }
                                }
                                c6953 = (C6953) arrayDeque2.peek();
                                C5855 c58516 = c21065.f67941;
                                if (c6953.f21435 == null) {
                                    c6953.f21435 = c5855M47926;
                                } else {
                                    c6953.f21429.f17958 = c5855M47926;
                                }
                                c6953.f21429 = c58516;
                            }
                        }
                    }
                }
            }
            boolean z10 = (c21065.f67956 & 512) != 0;
            if (z10) {
                c5856 = c21065.f67943;
                if (c5856 instanceof C5004) {
                    if (z10) {
                        c21065.f67943 = new C17932(c5856);
                    }
                    c21065.f67941 = c21065.f67943;
                } else {
                    if (z10) {
                        c21065.f67943 = new C17932(c5856);
                    }
                    c21065.f67941 = c21065.f67943;
                }
            } else {
                C5855 c58517 = c21065.f67943;
                if (c58517 instanceof C9259) {
                    C5855 c5855M29442 = C12060.m29442(c58517);
                    c21065.f67941 = c5855M29442;
                    C5855 c58518 = c21065.f67943;
                    if (c5855M29442 == c58518) {
                        c21065.f67941 = m47922(c58518, c21065.f67959);
                    }
                } else {
                    c5856 = c21065.f67943;
                    if ((c5856 instanceof C5004) || (c5856 instanceof C3739)) {
                        if (z10) {
                            c21065.f67943 = new C17932(c5856);
                        }
                        c21065.f67941 = c21065.f67943;
                    } else {
                        if (z10) {
                            c21065.f67943 = new C17932(c5856);
                        }
                        c21065.f67941 = m47922(c21065.f67943, c21065.f67959);
                    }
                }
            }
            c21065.f67947 = (c21065.f67946 || c21065.f67951) ? C7225.f22115 : C14403.m34430(c21065.f67943);
            c21065.f67943 = C3033.m9285(c21065.f67943);
            if (!c21065.f67961) {
                for (C5855 c58519 : c21065.f67960) {
                    if (c58519 instanceof C12910) {
                        int i34 = c21065.f67948;
                        c21065.f67948 = i34 + 1;
                        ((C12910) c58519).f38740 = i34;
                    }
                }
            }
            c21065.f67952 = null;
            c21065.f67942 = null;
            c21065.f67955 = null;
            c21065.f67940 = 0;
            c21065.f67960 = null;
            c21067 = c21065;
        }
        return new C1476(c21067.f67941, c21067.f67943, c21067.f67956, c21067.f67950, c21067.f67949, c21067.f67948, c21067.f67947, c21067.f67946 || c21067.f67951, c21067.f67953, c21067.m47954(), new C8011(1));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m47945(int i) {
        while (true) {
            if (!C22165.m49801(i, 2048) && i != 35) {
                return i;
            }
            while (C22165.m49801(i, 2048)) {
                int[] iArr = this.f67952;
                int i2 = this.f67954;
                this.f67954 = i2 + 1;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f67952;
                int i3 = this.f67954;
                this.f67954 = i3 + 1;
                i = iArr2[i3];
                while (i != 0 && !m47948(i, this.f67956)) {
                    int[] iArr3 = this.f67952;
                    int i4 = this.f67954;
                    this.f67954 = i4 + 1;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f67954;
                    int i6 = this.f67940;
                    if (i5 > i6) {
                        int[] iArr4 = this.f67952;
                        this.f67954 = i6 + 1;
                        i = iArr4[i6];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m47951(int i) {
        while (true) {
            if (!C22165.m49801(i, 2048) && i != 35) {
                return i;
            }
            while (C22165.m49801(i, 2048)) {
                int[] iArr = this.f67952;
                int i2 = this.f67954 + 1;
                this.f67954 = i2;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f67952;
                int i3 = this.f67954 + 1;
                this.f67954 = i3;
                i = iArr2[i3];
                while (i != 0 && !m47948(i, this.f67956)) {
                    int[] iArr3 = this.f67952;
                    int i4 = this.f67954 + 1;
                    this.f67954 = i4;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f67954;
                    int i6 = this.f67940;
                    if (i5 > i6) {
                        this.f67954 = i6;
                        i = this.f67952[i6];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47930(int i, int i2, String str, StringBuilder sb) {
        m47931(str, i, i2, sb, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47931(String str, int i, int i2, final StringBuilder sb, final boolean z) {
        int i3 = i;
        while (i3 < i2 && C22165.m49800(str.charAt(i3))) {
            i3++;
        }
        if (i3 == i2) {
            if (z) {
                sb.append(C11459.m28261(str.substring(i, i2)));
                return;
            } else {
                sb.append((CharSequence) str, i, i2);
                return;
            }
        }
        int i4 = -1;
        int i5 = i3 - 1;
        if (i5 >= i) {
            if (z) {
                sb.append(C11459.m28261(str.substring(i, i5)));
            } else {
                sb.append((CharSequence) str, i, i5);
            }
            i = i5;
        }
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (z || ".$|()[]{}^?*+\\".indexOf(iCodePointAt) == i4) {
                int iM9496 = C3115.m9496(str, i, i2, null);
                String strSubstring = str.substring(i, iM9496);
                String strNormalize = Normalizer.normalize(strSubstring, Normalizer.Form.NFD);
                if (strNormalize.codePointCount(0, strNormalize.length()) <= 1 || C2164.m7146(strNormalize.codePointAt(Character.charCount(strNormalize.codePointAt(0)))) != 6) {
                    String strNormalize2 = Normalizer.normalize(strSubstring, Normalizer.Form.NFC);
                    if (z) {
                        strSubstring = C11459.m28261(strSubstring);
                        strNormalize = C11459.m28261(strNormalize);
                        strNormalize2 = C11459.m28261(strNormalize2);
                    }
                    if (!strSubstring.equals(strNormalize2) && !strNormalize.equals(strNormalize2)) {
                        StringBuilder sbM10501 = C3435.m10501("(?:", strSubstring, "|", strNormalize, "|");
                        sbM10501.append(strNormalize2);
                        sbM10501.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        sb.append(sbM10501.toString());
                    } else if (strSubstring.equals(strNormalize)) {
                        sb.append(strSubstring);
                    } else {
                        sb.append(C20087.m46306("(?:", strSubstring, "|", strNormalize, MotionUtils.EASING_TYPE_FORMAT_END));
                    }
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(strSubstring);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C11187(strNormalize));
                    while (!arrayList.isEmpty()) {
                        C11187 c11187 = (C11187) C18566.m43105(arrayList, 1);
                        String[] strArr = c11187.f33580;
                        String str2 = c11187.f33578;
                        if (strArr == null) {
                            linkedHashSet.add(str2);
                            arrayList.remove(arrayList.size() - 1);
                        } else if (c11187.f33579 == strArr.length) {
                            C18473.m42953(arrayList, 1);
                        } else {
                            StringBuilder sbM15339 = C5368.m15339(str2);
                            String[] strArr2 = c11187.f33580;
                            int i6 = c11187.f33579;
                            c11187.f33579 = i6 + 1;
                            sbM15339.append(strArr2[i6]);
                            String string = sbM15339.toString();
                            linkedHashSet.add(string);
                            int iM47937 = m47937(2, string);
                            String strSubstring2 = string.substring(0, iM47937);
                            String strNormalize3 = Normalizer.normalize(strSubstring2, Normalizer.Form.NFC);
                            String strM37867 = strNormalize3.equals(strSubstring2) ? null : C16014.m37867(strNormalize3, string.substring(iM47937));
                            if (strM37867 != null) {
                                arrayList.add(new C11187(strM37867));
                            }
                        }
                    }
                    sb.append("(?:");
                    C19846.forEach(linkedHashSet, new Consumer() { // from class: l.֫ᩴܽ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            String strM28261 = (String) obj;
                            if (z) {
                                strM28261 = C11459.m28261(strM28261);
                            }
                            StringBuilder sb2 = sb;
                            sb2.append(strM28261);
                            sb2.append('|');
                        }
                    });
                    sb.delete(sb.length() - 1, sb.length());
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                i4 = -1;
                i = iM9496;
            } else {
                sb.append((char) iCodePointAt);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String[] m47943(String str) {
        if (str.length() == m47937(1, str)) {
            return new String[]{str};
        }
        if (str.length() == m47937(2, str)) {
            int iCodePointAt = Character.codePointAt(str, 0);
            int iCodePointAt2 = Character.codePointAt(str, Character.charCount(iCodePointAt));
            if (C20049.m46236(iCodePointAt2) == C20049.m46236(iCodePointAt)) {
                return new String[]{str};
            }
            StringBuilder sb = new StringBuilder(2);
            sb.appendCodePoint(iCodePointAt2);
            sb.appendCodePoint(iCodePointAt);
            return new String[]{str, sb.toString()};
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i2++;
            int i3 = i + 1;
            i = (Character.isHighSurrogate(str.charAt(i)) && i3 < length && Character.isLowSurrogate(str.charAt(i3))) ? i + 2 : i3;
        }
        if (i2 > 12) {
            throw new OutOfMemoryError("Pattern too complex");
        }
        int i4 = 1;
        for (int i5 = 2; i5 <= i2; i5++) {
            i4 *= i5;
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int iCharCount = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int iCodePointAt3 = Character.codePointAt(str, iCharCount);
            iArr[i6] = iCodePointAt3;
            iArr2[i6] = C20049.m46236(iCodePointAt3);
            iCharCount += Character.charCount(iCodePointAt3);
        }
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        boolean[] zArr = new boolean[i2];
        int i7 = 0;
        int i8 = 0;
        while (i7 >= 0) {
            int i9 = iArr4[i7];
            iArr4[i7] = i9 + 1;
            if (i9 == i2) {
                iArr4[i7] = 0;
                i7--;
                if (i7 >= 0) {
                    zArr[iArr3[i7]] = false;
                }
            } else if (!zArr[i9]) {
                int i10 = 0;
                while (true) {
                    if (i10 < i9) {
                        if (!zArr[i10] && iArr2[i10] == iArr2[i9]) {
                            break;
                        }
                        i10++;
                    } else {
                        iArr3[i7] = i9;
                        if (i7 == i2 - 1) {
                            StringBuilder sb2 = new StringBuilder(str.length());
                            for (int i11 = 0; i11 < i2; i11++) {
                                sb2.appendCodePoint(iArr[iArr3[i11]]);
                            }
                            strArr[i8] = sb2.toString();
                            i8++;
                            break;
                        }
                        zArr[i9] = true;
                        i7++;
                        break;
                    }
                }
            }
        }
        String[] strArr2 = new String[i8];
        System.arraycopy(strArr, 0, strArr2, 0, i8);
        return strArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int[] m47933(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f67940;
        int i6 = 0;
        while (true) {
            i = i5 - 1;
            if (i6 >= i) {
                break;
            }
            int[] iArr2 = this.f67952;
            if (iArr2[i6] == 92) {
                if (iArr2[i6 + 1] == 81) {
                    break;
                }
                i6 += 2;
            } else {
                i6++;
            }
        }
        if (i6 >= i) {
            return iArr;
        }
        int i7 = i6 + 2;
        long j = ((long) 3) * ((long) (i5 - i7));
        long j2 = (int) j;
        try {
            if (j != j2) {
                throw new ArithmeticException();
            }
            long j3 = ((long) i7) + j2;
            int i8 = (int) j3;
            if (j3 != i8) {
                throw new ArithmeticException();
            }
            int[] iArr3 = new int[i8];
            System.arraycopy(this.f67952, 0, iArr3, 0, i6);
            int[] iArr4 = iArr == null ? null : new int[i8];
            if (iArr4 != null) {
                System.arraycopy(iArr, 0, iArr4, 0, i6);
            }
            loop1: while (true) {
                boolean z = true;
                boolean z2 = true;
                while (true) {
                    if (i7 >= i5) {
                        break loop1;
                    }
                    int i9 = i7 + 1;
                    int i10 = this.f67952[i7];
                    int i11 = -1;
                    if (!C22165.m49800(i10) || C22165.m49801(i10, 768)) {
                        i2 = i6 + 1;
                        iArr3[i6] = i10;
                    } else if (C22165.m49802(i10)) {
                        if (z) {
                            iArr3[i6] = 92;
                            iArr3[i6 + 1] = 120;
                            i4 = i6 + 3;
                            iArr3[i6 + 2] = 51;
                        } else {
                            i4 = i6;
                        }
                        i2 = i4 + 1;
                        iArr3[i4] = i10;
                    } else if (i10 != 92) {
                        if (z2) {
                            i3 = i6 + 1;
                            iArr3[i6] = 92;
                        } else {
                            i3 = i6;
                        }
                        i2 = i3 + 1;
                        iArr3[i3] = i10;
                    } else if (!z2) {
                        int[] iArr5 = this.f67952;
                        if (iArr5[i9] == 81) {
                            break;
                        }
                        i2 = i6 + 1;
                        iArr3[i6] = i10;
                        if (i9 != i5) {
                            iArr3[i2] = iArr5[i9];
                            i2 = i6 + 2;
                            i11 = i9;
                            i9 = i7 + 2;
                        }
                    } else if (this.f67952[i9] == 69) {
                        z2 = false;
                        i9 = i7 + 2;
                        i2 = i6;
                    } else {
                        iArr3[i6] = 92;
                        i2 = i6 + 2;
                        iArr3[i6 + 1] = 92;
                    }
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, i6, i2, iArr[i7]);
                        if (i11 >= 0) {
                            iArr4[i2 - 1] = iArr[i11];
                        }
                    }
                    z = false;
                    i7 = i9;
                    i6 = i2;
                }
                i7 += 2;
            }
            this.f67940 = i6;
            int i12 = i6 + 2;
            this.f67952 = Arrays.copyOf(iArr3, i12);
            if (iArr4 == null) {
                return null;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr4, i12);
            iArrCopyOf[i6] = iArr[i5];
            iArrCopyOf[i6 + 1] = iArr[i5 + 1];
            return iArrCopyOf;
        } catch (ArithmeticException unused) {
            throw new OutOfMemoryError("Required pattern length too large");
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47944() {
        int length = this.f67957.length();
        this.f67952 = new int[length + 2];
        int iCharCount = 0;
        this.f67959 = false;
        int i = 0;
        while (iCharCount < length) {
            int iCodePointAt = this.f67957.codePointAt(iCharCount);
            if (C14403.m34428(iCodePointAt)) {
                this.f67959 = true;
            }
            this.f67952[i] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i++;
        }
        this.f67940 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0085 m47922(C5855 c5855, boolean z) {
        C0085 c5025;
        if (!z) {
            C0791 c0791M2995 = C0791.m2995(c5855);
            if (c0791M2995 != null) {
                return c0791M2995;
            }
            C14902 c14902M35356 = C14902.m35356(c5855);
            if (c14902M35356 != null) {
                return c14902M35356;
            }
            if (c5855 instanceof C9259) {
                c5025 = new C19843((C9259) c5855);
            } else {
                c5025 = c5855 instanceof C19822 ? new C5025((C19822) c5855) : null;
            }
            C7847 c7847M21031 = C7847.m21031(c5855);
            if (c7847M21031 != null) {
                return c7847M21031;
            }
            C21254 c21254M48260 = C21254.m48260(c5855, c5025);
            if (c21254M48260 != null) {
                return c21254M48260;
            }
            if (c5025 != null) {
                return c5025;
            }
        }
        if (z) {
            return new C21959(c5855);
        }
        return new C0085(c5855);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m47954() {
        HashMap map = this.f67944;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap(2);
        this.f67944 = map2;
        return map2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m47942(int i) {
        return (i & this.f67956) != 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m47949() {
        int i = this.f67952[this.f67954];
        return m47942(4) ? m47951(i) : i;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m47934() {
        int[] iArr = this.f67952;
        int i = this.f67954;
        this.f67954 = i + 1;
        int i2 = iArr[i];
        return m47942(4) ? m47945(i2) : i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m47950() {
        int[] iArr = this.f67952;
        int i = this.f67954 + 1;
        this.f67954 = i;
        int i2 = iArr[i];
        return m47942(4) ? m47951(i2) : i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m47952() {
        int i = this.f67954;
        int i2 = this.f67952[i + 1];
        this.f67954 = i + 2;
        return i2;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m47936() {
        this.f67954--;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C12869 m47947(String str) {
        return new C12869(str, this.f67957, this.f67954 - 1);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0121  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C5855 m47938() {
        final int i;
        InterfaceC10795 interfaceC10795M34423;
        final int iM49804;
        final int i2;
        int upperCase;
        final int lowerCase;
        int iM47949 = m47949();
        boolean z = false;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            if (iM47949 != 0) {
                if (iM47949 != 36 && iM47949 != 46) {
                    if (iM47949 != 63) {
                        if (iM47949 != 94 && iM47949 != 91) {
                            if (iM47949 == 92) {
                                int[] iArr = this.f67952;
                                int i5 = this.f67954 + 1;
                                this.f67954 = i5;
                                int i6 = iArr[i5];
                                if (i6 != 112 && i6 != 80) {
                                    m47936();
                                    i3 = this.f67954;
                                    int iM47920 = m47920(false, i4 == 0, false);
                                    if (iM47920 >= 0) {
                                        m47940(iM47920, i4);
                                        i4++;
                                        if (C14403.m34428(iM47920)) {
                                            z2 = true;
                                        }
                                        iM47949 = m47949();
                                    } else {
                                        if (i4 == 0) {
                                            return this.f67941;
                                        }
                                        this.f67954 = i3;
                                    }
                                } else if (i4 > 0) {
                                    m47936();
                                } else {
                                    boolean z3 = i6 == 80;
                                    if (m47950() != 123) {
                                        m47936();
                                        z = true;
                                    }
                                    if (m47942(128) && !m47942(16)) {
                                        return new C12205(m47928(z, z3));
                                    }
                                    return m47929(m47928(z, z3));
                                }
                            } else if (iM47949 != 123) {
                                if (iM47949 != 124) {
                                    switch (iM47949) {
                                        case 40:
                                        case 41:
                                            break;
                                        case 42:
                                        case 43:
                                            break;
                                        default:
                                            i3 = this.f67954;
                                            m47940(iM47949, i4);
                                            i4++;
                                            if (C14403.m34428(iM47949)) {
                                                z2 = true;
                                            }
                                            iM47949 = m47950();
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    if (i4 > 1) {
                        this.f67954 = i3;
                        i4--;
                    }
                }
                if (i4 == 1) {
                    i = this.f67942[0];
                    if (!m47942(2)) {
                        if (m47942(64)) {
                            upperCase = Character.toUpperCase(i);
                            lowerCase = Character.toLowerCase(upperCase);
                            if (upperCase != lowerCase) {
                                C5855 c5855 = C14403.f44164;
                                interfaceC10795M34423 = new InterfaceC10795() { // from class: l.ܿ֡ܽ
                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5502(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5503(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    public final C7679 negate() {
                                        C5855 c5856 = C14403.f44164;
                                        return C7679.m20568(this);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo2465(int i7) {
                                        int i8 = lowerCase;
                                        return i8 == i7 || i8 == C3395.m10356(i7);
                                    }
                                };
                            } else if (C14403.m34428(i)) {
                                interfaceC10795M34423 = C14403.m34423(i);
                            } else {
                                interfaceC10795M34423 = new InterfaceC10795() { // from class: l.᩻֡ܽ
                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5502(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo2465(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5503(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    public final C7679 negate() {
                                        C5855 c5856 = C14403.f44164;
                                        return C7679.m20568(this);
                                    }
                                };
                            }
                        } else if (C22165.m49800(i)) {
                            iM49804 = C22165.m49804(i);
                            if (((i - 97) | (122 - i)) >= 0) {
                                i2 = i - 32;
                            } else {
                                i2 = i;
                            }
                            if (iM49804 != i2) {
                                C5855 c5856 = C14403.f44164;
                                interfaceC10795M34423 = new InterfaceC21938() { // from class: l.ۢ֡ܽ
                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                        return C21233.m48187(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                        return C21233.m48188(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    public final C7679 negate() {
                                        C5855 c5857 = C14403.f44164;
                                        return C7679.m20568(this);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo2465(int i7) {
                                        return i7 == iM49804 || i7 == i2;
                                    }
                                };
                            } else if (C14403.m34428(i)) {
                                interfaceC10795M34423 = C14403.m34423(i);
                            } else {
                                interfaceC10795M34423 = new InterfaceC10795() { // from class: l.᩻֡ܽ
                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5502(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo2465(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5503(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    public final C7679 negate() {
                                        C5855 c5857 = C14403.f44164;
                                        return C7679.m20568(this);
                                    }
                                };
                            }
                        } else if (C14403.m34428(i)) {
                            interfaceC10795M34423 = C14403.m34423(i);
                        } else {
                            interfaceC10795M34423 = new InterfaceC10795() { // from class: l.᩻֡ܽ
                                @Override // l.InterfaceC10795
                                /* JADX INFO: renamed from: ֫ */
                                public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                    return C1622.m5502(this, interfaceC10795);
                                }

                                @Override // l.InterfaceC10795
                                /* JADX INFO: renamed from: ֫ */
                                public final boolean mo2465(int i7) {
                                    return i7 == i;
                                }

                                @Override // l.InterfaceC10795
                                /* JADX INFO: renamed from: ۧ */
                                public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                    return C1622.m5503(this, interfaceC10795);
                                }

                                @Override // l.InterfaceC10795
                                public final C7679 negate() {
                                    C5855 c5857 = C14403.f44164;
                                    return C7679.m20568(this);
                                }
                            };
                        }
                    } else if (C14403.m34428(i)) {
                        interfaceC10795M34423 = C14403.m34423(i);
                    } else {
                        interfaceC10795M34423 = new InterfaceC10795() { // from class: l.᩻֡ܽ
                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                return C1622.m5502(this, interfaceC10795);
                            }

                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ֫ */
                            public final boolean mo2465(int i7) {
                                return i7 == i;
                            }

                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ۧ */
                            public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                return C1622.m5503(this, interfaceC10795);
                            }

                            @Override // l.InterfaceC10795
                            public final C7679 negate() {
                                C5855 c5857 = C14403.f44164;
                                return C7679.m20568(this);
                            }
                        };
                    }
                    return m47929(interfaceC10795M34423);
                }
                return m47924(i4, z2, this.f67942);
            }
            if (this.f67954 >= this.f67940) {
                if (i4 == 1) {
                    i = this.f67942[0];
                    if (!m47942(2)) {
                        if (m47942(64)) {
                            upperCase = Character.toUpperCase(i);
                            lowerCase = Character.toLowerCase(upperCase);
                            if (upperCase != lowerCase) {
                                C5855 c5857 = C14403.f44164;
                                interfaceC10795M34423 = new InterfaceC10795() { // from class: l.ܿ֡ܽ
                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5502(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5503(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    public final C7679 negate() {
                                        C5855 c5858 = C14403.f44164;
                                        return C7679.m20568(this);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo2465(int i7) {
                                        int i8 = lowerCase;
                                        return i8 == i7 || i8 == C3395.m10356(i7);
                                    }
                                };
                            } else if (C14403.m34428(i)) {
                                interfaceC10795M34423 = C14403.m34423(i);
                            } else {
                                interfaceC10795M34423 = new InterfaceC10795() { // from class: l.᩻֡ܽ
                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5502(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo2465(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5503(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    public final C7679 negate() {
                                        C5855 c5858 = C14403.f44164;
                                        return C7679.m20568(this);
                                    }
                                };
                            }
                        } else if (C22165.m49800(i)) {
                            iM49804 = C22165.m49804(i);
                            if (((i - 97) | (122 - i)) >= 0) {
                                i2 = i - 32;
                            } else {
                                i2 = i;
                            }
                            if (iM49804 != i2) {
                                C5855 c5858 = C14403.f44164;
                                interfaceC10795M34423 = new InterfaceC21938() { // from class: l.ۢ֡ܽ
                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                        return C21233.m48187(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                        return C21233.m48188(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    public final C7679 negate() {
                                        C5855 c5859 = C14403.f44164;
                                        return C7679.m20568(this);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo2465(int i7) {
                                        return i7 == iM49804 || i7 == i2;
                                    }
                                };
                            } else if (C14403.m34428(i)) {
                                interfaceC10795M34423 = C14403.m34423(i);
                            } else {
                                interfaceC10795M34423 = new InterfaceC10795() { // from class: l.᩻֡ܽ
                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5502(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo2465(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC10795
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                        return C1622.m5503(this, interfaceC10795);
                                    }

                                    @Override // l.InterfaceC10795
                                    public final C7679 negate() {
                                        C5855 c5859 = C14403.f44164;
                                        return C7679.m20568(this);
                                    }
                                };
                            }
                        } else if (C14403.m34428(i)) {
                            interfaceC10795M34423 = C14403.m34423(i);
                        } else {
                            interfaceC10795M34423 = new InterfaceC10795() { // from class: l.᩻֡ܽ
                                @Override // l.InterfaceC10795
                                /* JADX INFO: renamed from: ֫ */
                                public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                    return C1622.m5502(this, interfaceC10795);
                                }

                                @Override // l.InterfaceC10795
                                /* JADX INFO: renamed from: ֫ */
                                public final boolean mo2465(int i7) {
                                    return i7 == i;
                                }

                                @Override // l.InterfaceC10795
                                /* JADX INFO: renamed from: ۧ */
                                public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                    return C1622.m5503(this, interfaceC10795);
                                }

                                @Override // l.InterfaceC10795
                                public final C7679 negate() {
                                    C5855 c5859 = C14403.f44164;
                                    return C7679.m20568(this);
                                }
                            };
                        }
                    } else if (C14403.m34428(i)) {
                        interfaceC10795M34423 = C14403.m34423(i);
                    } else {
                        interfaceC10795M34423 = new InterfaceC10795() { // from class: l.᩻֡ܽ
                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                return C1622.m5502(this, interfaceC10795);
                            }

                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ֫ */
                            public final boolean mo2465(int i7) {
                                return i7 == i;
                            }

                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ۧ */
                            public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                return C1622.m5503(this, interfaceC10795);
                            }

                            @Override // l.InterfaceC10795
                            public final C7679 negate() {
                                C5855 c5859 = C14403.f44164;
                                return C7679.m20568(this);
                            }
                        };
                    }
                    return m47929(interfaceC10795M34423);
                }
                return m47924(i4, z2, this.f67942);
            }
            i3 = this.f67954;
            m47940(iM47949, i4);
            i4++;
            if (C14403.m34428(iM47949)) {
                z2 = true;
            }
            iM47949 = m47950();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47940(int i, int i2) {
        int length = this.f67942.length;
        if (i2 - length >= 0) {
            int i3 = (i2 + 1) - length;
            int iMax = Math.max(i3, length) + length;
            if (iMax <= 0 || iMax > 2147483639) {
                iMax = length + i3;
                if (iMax < 0) {
                    throw new OutOfMemoryError(C19373.m44634("Required array length ", length, " + ", " is too large", i3));
                }
                if (iMax <= 2147483639) {
                    iMax = 2147483639;
                }
            }
            this.f67942 = Arrays.copyOf(this.f67942, iMax);
        }
        this.f67942[i2] = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:248:0x03aa  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m47920(boolean z, boolean z2, boolean z3) {
        InterfaceC10795 interfaceC10795M14159;
        InterfaceC10795 interfaceC10795M14163;
        InterfaceC10795 interfaceC10795M141510;
        InterfaceC10795 interfaceC10795M14164;
        int iM47952 = m47952();
        int iM49803 = 0;
        switch (iM47952) {
            case 48:
                int iM47934 = m47934();
                int i = iM47934 - 48;
                if (((55 - iM47934) | i) < 0) {
                    throw m47947("Illegal octal escape sequence");
                }
                int iM47935 = m47934();
                int i2 = iM47935 - 48;
                if (((55 - iM47935) | i2) < 0) {
                    m47936();
                    return i;
                }
                int iM47936 = m47934();
                int i3 = iM47936 - 48;
                if (((55 - iM47936) | i3) >= 0 && ((51 - iM47934) | i) >= 0) {
                    return C23202.m51496(i2, 8, i * 64, i3);
                }
                m47936();
                return (i * 8) + i2;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
                if (!z) {
                    if (z2) {
                        int i4 = iM47952 - 48;
                        while (iM49803 == 0) {
                            int iM47949 = m47949();
                            switch (iM47949) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case 56:
                                case 57:
                                    int i5 = (iM47949 - 48) + (i4 * 10);
                                    if (this.f67950 - 1 >= i5) {
                                        m47934();
                                        i4 = i5;
                                    } else {
                                        iM49803 = 1;
                                    }
                                    break;
                                default:
                                    iM49803 = 1;
                                    break;
                            }
                        }
                        this.f67961 = true;
                        this.f67941 = m47942(2) ? new C13470(i4, m47942(64)) : new C0064(i4);
                    }
                    return -1;
                }
                throw m47947("Illegal/unsupported escape sequence");
            default:
                switch (iM47952) {
                    case 65:
                        if (!z) {
                            if (z2) {
                                this.f67941 = new C5004();
                                return -1;
                            }
                            return -1;
                        }
                        throw m47947("Illegal/unsupported escape sequence");
                    case 66:
                        if (!z) {
                            if (z2) {
                                this.f67941 = new C5710(4, m47942(256));
                                return -1;
                            }
                            return -1;
                        }
                        throw m47947("Illegal/unsupported escape sequence");
                    case 67:
                    case 69:
                    case 70:
                    case 73:
                    case 74:
                    case 75:
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    case 77:
                    case 79:
                    case 80:
                    case 81:
                    case 84:
                    case 85:
                    case 89:
                        throw m47947("Illegal/unsupported escape sequence");
                    case 68:
                        if (z2) {
                            if (m47942(256)) {
                                int i6 = C4857.f15353;
                                interfaceC10795M14159 = new C20359();
                            } else {
                                interfaceC10795M14159 = C4857.m14159();
                            }
                            this.f67945 = interfaceC10795M14159;
                            C7679 c7679Negate = interfaceC10795M14159.negate();
                            this.f67945 = c7679Negate;
                            if (!z) {
                                this.f67941 = m47929(c7679Negate);
                                return -1;
                            }
                        }
                        return -1;
                    case 71:
                        if (!z) {
                            if (z2) {
                                this.f67946 = true;
                                this.f67941 = new C7972();
                                return -1;
                            }
                            return -1;
                        }
                        throw m47947("Illegal/unsupported escape sequence");
                    case 72:
                        if (z2) {
                            C5855 c5855 = C14403.f44164;
                            C7679 c7679Negate2 = new C20527().negate();
                            this.f67945 = c7679Negate2;
                            if (!z) {
                                this.f67941 = m47929(c7679Negate2);
                                return -1;
                            }
                        }
                        return -1;
                    case 78:
                        if (Build.VERSION.SDK_INT >= 35) {
                            if (m47934() != 123) {
                                throw m47947("Illegal character name escape sequence");
                            }
                            int i7 = this.f67954;
                            while (m47934() != 125) {
                                if (this.f67954 >= this.f67940) {
                                    throw m47947("Unclosed character name escape sequence");
                                }
                            }
                            String str = new String(this.f67952, i7, (this.f67954 - i7) - 1);
                            try {
                                return Character.codePointOf(str);
                            } catch (IllegalArgumentException unused) {
                                throw m47947(C4860.m14172("Unknown character name [", str, "]"));
                            }
                        }
                        throw m47947("Illegal/unsupported escape sequence");
                    case 82:
                        if (!z) {
                            if (z2) {
                                this.f67941 = new C22083();
                                return -1;
                            }
                            return -1;
                        }
                        throw m47947("Illegal/unsupported escape sequence");
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        if (z2) {
                            if (m47942(256)) {
                                int i8 = C4857.f15353;
                                interfaceC10795M14163 = new C14734();
                            } else {
                                interfaceC10795M14163 = C4857.m14163();
                            }
                            this.f67945 = interfaceC10795M14163;
                            C7679 c7679Negate3 = interfaceC10795M14163.negate();
                            this.f67945 = c7679Negate3;
                            if (!z) {
                                this.f67941 = m47929(c7679Negate3);
                                return -1;
                            }
                        }
                        return -1;
                    case HRSS1373Polynomial.K /* 86 */:
                        if (z2) {
                            C5855 c5856 = C14403.f44164;
                            C7679 c7679Negate4 = new C8532().negate();
                            this.f67945 = c7679Negate4;
                            if (!z) {
                                this.f67941 = m47929(c7679Negate4);
                                return -1;
                            }
                        }
                        return -1;
                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                        if (z2) {
                            InterfaceC10795 interfaceC10795M14166 = m47942(256) ? C4857.m14166() : C4857.m14165();
                            this.f67945 = interfaceC10795M14166;
                            C7679 c7679Negate5 = interfaceC10795M14166.negate();
                            this.f67945 = c7679Negate5;
                            if (!z) {
                                this.f67941 = m47929(c7679Negate5);
                                return -1;
                            }
                        }
                        return -1;
                    case 88:
                        if (!z) {
                            if (z2) {
                                this.f67941 = new C17226();
                                return -1;
                            }
                            return -1;
                        }
                        throw m47947("Illegal/unsupported escape sequence");
                    case 90:
                        if (!z) {
                            if (z2) {
                                if (m47942(1)) {
                                    this.f67941 = new C1704(false);
                                    return -1;
                                }
                                this.f67941 = new C9384(false);
                                return -1;
                            }
                            return -1;
                        }
                        throw m47947("Illegal/unsupported escape sequence");
                    default:
                        switch (iM47952) {
                            case 97:
                                return 7;
                            case 98:
                                if (!z) {
                                    if (z2) {
                                        if (m47949() == 123) {
                                            if (m47952() != 103) {
                                                m47936();
                                                m47936();
                                            } else if (m47934() == 125) {
                                                this.f67951 = true;
                                                this.f67941 = new C19262();
                                                return -1;
                                            }
                                        }
                                        this.f67941 = new C5710(3, m47942(256));
                                    }
                                    return -1;
                                }
                                throw m47947("Illegal/unsupported escape sequence");
                            case q.f /* 99 */:
                                if (this.f67954 < this.f67940) {
                                    return m47934() ^ 64;
                                }
                                throw m47947("Illegal control escape sequence");
                            case 100:
                                if (z2) {
                                    if (m47942(256)) {
                                        int i9 = C4857.f15353;
                                        interfaceC10795M141510 = new C20359();
                                    } else {
                                        interfaceC10795M141510 = C4857.m14159();
                                    }
                                    this.f67945 = interfaceC10795M141510;
                                    if (!z) {
                                        this.f67941 = m47929(interfaceC10795M141510);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 101:
                                return 27;
                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                return 12;
                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            case 108:
                            case 109:
                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                throw m47947("Illegal/unsupported escape sequence");
                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                if (z2) {
                                    C5855 c5857 = C14403.f44164;
                                    C20527 c20527 = new C20527();
                                    this.f67945 = c20527;
                                    if (!z) {
                                        this.f67941 = m47929(c20527);
                                        return -1;
                                    }
                                }
                                return -1;
                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                if (!z) {
                                    if (m47934() != 60) {
                                        throw m47947("\\k is not followed by '<' for named capturing group");
                                    }
                                    String strM47921 = m47921(m47934());
                                    Integer num = (Integer) ((HashMap) m47954()).get(strM47921);
                                    if (num == null) {
                                        throw m47947(C4860.m14172("named capturing group <", strM47921, "> does not exist"));
                                    }
                                    if (z2) {
                                        this.f67961 = true;
                                        if (m47942(2)) {
                                            this.f67941 = new C13470(num.intValue(), m47942(64));
                                            return -1;
                                        }
                                        this.f67941 = new C0064(num.intValue());
                                        return -1;
                                    }
                                    return -1;
                                }
                                throw m47947("Illegal/unsupported escape sequence");
                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                return 10;
                            case 114:
                                return 13;
                            case 115:
                                if (z2) {
                                    if (m47942(256)) {
                                        int i10 = C4857.f15353;
                                        interfaceC10795M14164 = new C14734();
                                    } else {
                                        interfaceC10795M14164 = C4857.m14163();
                                    }
                                    this.f67945 = interfaceC10795M14164;
                                    if (!z) {
                                        this.f67941 = m47929(interfaceC10795M14164);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 116:
                                return 9;
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                int iM47937 = m47935();
                                char c = (char) iM47937;
                                if (Character.isHighSurrogate(c)) {
                                    int i11 = this.f67954;
                                    if (m47934() == 92 && m47934() == 117) {
                                        char cM47935 = (char) m47935();
                                        if (Character.isLowSurrogate(cM47935)) {
                                            return Character.toCodePoint(c, cM47935);
                                        }
                                    }
                                    this.f67954 = i11;
                                }
                                return iM47937;
                            case 118:
                                if (z3) {
                                    return 11;
                                }
                                if (z2) {
                                    C5855 c5858 = C14403.f44164;
                                    C8532 c8532 = new C8532();
                                    this.f67945 = c8532;
                                    if (!z) {
                                        this.f67941 = m47929(c8532);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 119:
                                if (z2) {
                                    InterfaceC10795 interfaceC10795M14167 = m47942(256) ? C4857.m14166() : C4857.m14165();
                                    this.f67945 = interfaceC10795M14167;
                                    if (!z) {
                                        this.f67941 = m47929(interfaceC10795M14167);
                                        return -1;
                                    }
                                }
                                return -1;
                            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                int iM47938 = m47934();
                                if (C22165.m49801(iM47938, 32768)) {
                                    int iM47939 = m47934();
                                    if (C22165.m49801(iM47939, 32768)) {
                                        return C22165.m49803(iM47939) + (C22165.m49803(iM47938) * 16);
                                    }
                                } else if (iM47938 == 123 && C22165.m49801(m47949(), 32768)) {
                                    do {
                                        int iM479310 = m47934();
                                        if (!C22165.m49801(iM479310, 32768)) {
                                            if (iM479310 == 125) {
                                                return iM49803;
                                            }
                                            throw m47947("Unclosed hexadecimal escape sequence");
                                        }
                                        iM49803 = C22165.m49803(iM479310) + (iM49803 << 4);
                                    } while (iM49803 <= 1114111);
                                    throw m47947("Hexadecimal codepoint is too big");
                                }
                                throw m47947("Illegal hexadecimal escape sequence");
                            case 122:
                                if (!z) {
                                    if (z2) {
                                        this.f67941 = new C2328();
                                        return -1;
                                    }
                                    return -1;
                                }
                                throw m47947("Illegal/unsupported escape sequence");
                            default:
                                return iM47952;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private InterfaceC10795 m47946() {
        int i;
        InterfaceC10795 interfaceC10795M34189;
        InterfaceC10795 interfaceC10795M341810;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m47939(true));
        while (true) {
            C17536 c17536 = (C17536) C18566.m43105(arrayList, 1);
            int i2 = c17536.f53553;
            boolean z = false;
            if (!c17536.f53556) {
                if (i2 != 0) {
                    if (i2 != 38) {
                        if (i2 == 91) {
                            arrayList.add(m47939(true));
                        } else if (i2 == 93 && (!c17536.f53551.m34195() || c17536.f53557)) {
                            if (c17536.f53555) {
                                m47950();
                            }
                            if (c17536.f53557) {
                                interfaceC10795M34189 = c17536.f53551.m34195() ? c17536.f53552 : c17536.f53552.mo2464(c17536.f53551.m34189());
                                if (c17536.f53559) {
                                    interfaceC10795M34189 = interfaceC10795M34189.negate();
                                }
                            } else {
                                c17536.f53551.m34193(c17536.f53559);
                                interfaceC10795M34189 = c17536.f53551.m34189();
                            }
                            arrayList.remove(arrayList.size() - 1);
                            if (arrayList.isEmpty()) {
                                return interfaceC10795M34189;
                            }
                            C17536 c17537 = (C17536) C18566.m43105(arrayList, 1);
                            if (c17537.f53556) {
                                InterfaceC10795 interfaceC10795 = c17537.f53558;
                                if (interfaceC10795 != null) {
                                    interfaceC10795M34189 = interfaceC10795.mo2466(interfaceC10795M34189);
                                }
                                c17537.f53558 = interfaceC10795M34189;
                            } else {
                                c17537.f53551.m34192(interfaceC10795M34189);
                            }
                            c17537.f53553 = m47949();
                        }
                    } else if (m47950() == 38) {
                        c17536.f53553 = m47950();
                        if (c17536.f53557) {
                            interfaceC10795M341810 = c17536.f53551.m34195() ? c17536.f53552 : c17536.f53552.mo2464(c17536.f53551.m34189());
                        } else {
                            interfaceC10795M341810 = c17536.f53551.m34189();
                        }
                        c17536.f53554 = interfaceC10795M341810;
                        c17536.f53558 = null;
                        c17536.f53556 = true;
                    } else {
                        m47936();
                    }
                } else if (this.f67954 >= this.f67940) {
                    throw m47947("Unclosed character class");
                }
                C14321 c14321 = c17536.f53551;
                int iM47949 = m47949();
                if (iM47949 == 92) {
                    int[] iArr = this.f67952;
                    int i3 = this.f67954;
                    int i4 = i3 + 1;
                    this.f67954 = i4;
                    int i5 = iArr[i4];
                    if (i5 == 112 || i5 == 80) {
                        boolean z2 = i5 == 80;
                        if (m47950() != 123) {
                            m47936();
                            z = true;
                        }
                        c14321.m34192(m47928(z, z2));
                    } else {
                        boolean z3 = iArr[i3 + 2] == 45;
                        m47936();
                        iM47949 = m47920(true, true, z3);
                        if (iM47949 == -1) {
                            c14321.m34192(this.f67945);
                        }
                    }
                    c17536.f53553 = m47949();
                } else {
                    m47950();
                }
                if (iM47949 < 0) {
                    throw m47947("Unexpected character '" + ((char) iM47949) + "'");
                }
                if (m47949() != 45 || (i = this.f67952[this.f67954 + 1]) == 91 || i == 93) {
                    c14321.m34190(iM47949);
                } else {
                    m47950();
                    int iM479410 = m47949();
                    if (iM479410 == 92) {
                        iM479410 = m47920(true, false, true);
                    } else {
                        m47950();
                    }
                    if (iM479410 < iM47949) {
                        throw m47947("Illegal character range");
                    }
                    c14321.m34194(iM47949, iM479410);
                }
                c17536.f53553 = m47949();
            } else if (i2 == 93 || i2 == 38) {
                InterfaceC10795 interfaceC10796 = c17536.f53558;
                if (interfaceC10796 == null) {
                    throw m47947("Bad intersection syntax");
                }
                c17536.f53552 = c17536.f53554.mo2464(interfaceC10796);
                c17536.f53557 = true;
                c17536.f53556 = false;
                c17536.f53551 = new C14321(this.f67956);
            } else {
                if (i2 != 91) {
                    m47936();
                }
                arrayList.add(m47939(i2 == 91));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C17536 m47939(boolean z) {
        C17536 c17536 = new C17536(this.f67956, z);
        int iM47950 = m47950();
        c17536.f53553 = iM47950;
        if (iM47950 == 94 && this.f67952[this.f67954 - 1] == 91) {
            c17536.f53553 = m47950();
            c17536.f53559 = true;
        }
        return c17536;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC10795 m47928(boolean z, boolean z2) {
        String str;
        InterfaceC10795 interfaceC10795M14164;
        m47950();
        if (z) {
            int i = this.f67952[this.f67954];
            str = !Character.isSupplementaryCodePoint(i) ? String.valueOf((char) i) : new String(this.f67952, this.f67954, 1);
            m47934();
        } else {
            int i2 = this.f67954;
            this.f67952[this.f67940] = 125;
            while (m47934() != 125) {
            }
            int[] iArr = this.f67952;
            int i3 = this.f67940;
            iArr[i3] = 0;
            int i4 = this.f67954;
            if (i4 > i3) {
                throw m47947("Unclosed character family");
            }
            if (i2 + 1 >= i4) {
                throw m47947("Empty character family");
            }
            str = new String(iArr, i2, (i4 - i2) - 1);
        }
        int iIndexOf = str.indexOf(61);
        InterfaceC10795 interfaceC10795M14158 = null;
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            String lowerCase = str.substring(0, iIndexOf).toLowerCase(Locale.ENGLISH);
            lowerCase.getClass();
            switch (lowerCase) {
                case "script":
                case "sc":
                    interfaceC10795M14158 = C4857.m14157(strSubstring);
                    break;
                case "gc":
                case "general_category":
                    interfaceC10795M14158 = C4857.m14162(strSubstring, m47942(2));
                    break;
                case "blk":
                case "block":
                    int i5 = C4857.f15353;
                    try {
                        final Character.UnicodeBlock unicodeBlockForName = Character.UnicodeBlock.forName(strSubstring);
                        interfaceC10795M14158 = new InterfaceC10795() { // from class: l.֡ᩴܽ
                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                                return C1622.m5502(this, interfaceC10795);
                            }

                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                                return C1622.m5503(this, interfaceC10795);
                            }

                            @Override // l.InterfaceC10795
                            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                            public final boolean mo2465(int i6) {
                                return unicodeBlockForName == Character.UnicodeBlock.of(i6);
                            }

                            @Override // l.InterfaceC10795
                            public final C7679 negate() {
                                C5855 c5855 = C14403.f44164;
                                return C7679.m20568(this);
                            }
                        };
                        break;
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
                    break;
            }
            if (interfaceC10795M14158 == null) {
                throw m47947(C20087.m46306("Unknown Unicode property {name=<", lowerCase, ">, value=<", strSubstring, ">}"));
            }
        } else {
            if (str.startsWith("In")) {
                String strSubstring2 = str.substring(2);
                int i6 = C4857.f15353;
                try {
                    final Character.UnicodeBlock unicodeBlockForName2 = Character.UnicodeBlock.forName(strSubstring2);
                    interfaceC10795M14164 = new InterfaceC10795() { // from class: l.֡ᩴܽ
                        @Override // l.InterfaceC10795
                        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                            return C1622.m5502(this, interfaceC10795);
                        }

                        @Override // l.InterfaceC10795
                        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                            return C1622.m5503(this, interfaceC10795);
                        }

                        @Override // l.InterfaceC10795
                        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final boolean mo2465(int i7) {
                            return unicodeBlockForName2 == Character.UnicodeBlock.of(i7);
                        }

                        @Override // l.InterfaceC10795
                        public final C7679 negate() {
                            C5855 c5855 = C14403.f44164;
                            return C7679.m20568(this);
                        }
                    };
                } catch (IllegalArgumentException unused2) {
                }
            } else if (str.startsWith("Is")) {
                String strSubstring3 = str.substring(2);
                interfaceC10795M14164 = C4857.m14164(strSubstring3, m47942(2));
                if (interfaceC10795M14164 == null) {
                    interfaceC10795M14164 = C4857.m14162(strSubstring3, m47942(2));
                }
                interfaceC10795M14158 = interfaceC10795M14164 == null ? C4857.m14157(strSubstring3) : interfaceC10795M14164;
            } else {
                interfaceC10795M14158 = m47942(256) ? C4857.m14158(str, m47942(2)) : null;
                if (interfaceC10795M14158 == null) {
                    interfaceC10795M14158 = C4857.m14162(str, m47942(2));
                }
            }
            if (interfaceC10795M14158 == null) {
                throw m47947(C4860.m14172("Unknown character property name {", str, l.d));
            }
        }
        if (!z2) {
            return interfaceC10795M14158;
        }
        this.f67959 = true;
        return interfaceC10795M14158.negate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23494 m47929(InterfaceC10795 interfaceC10795) {
        if (interfaceC10795 == null) {
            return null;
        }
        if (interfaceC10795 instanceof InterfaceC21938) {
            return new C19822((InterfaceC21938) interfaceC10795);
        }
        this.f67959 = true;
        return new C23494(interfaceC10795);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m47921(int i) {
        StringBuilder sb = new StringBuilder();
        if (C22165.m49801(i, 768)) {
            do {
                sb.append((char) i);
                i = m47934();
            } while (C22165.m49801(i, Params.POLY_BYTES));
            if (i != 62) {
                throw m47947("named capturing group is missing trailing '>'");
            }
            return sb.toString();
        }
        throw m47947("capturing group name does not start with a Latin letter");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5150 m47925(boolean z) {
        int i;
        int i2 = this.f67949;
        this.f67949 = i2 + 1;
        if (z) {
            i = 0;
        } else {
            i = this.f67950;
            this.f67950 = i + 1;
        }
        C5150 c5150 = new C5150(i2);
        C0916 c0916 = new C0916(i2, i);
        this.f67941 = c0916;
        c5150.f16094 = c0916;
        if (!z && i < 10) {
            this.f67955[i] = c5150;
        }
        return c5150;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private EnumC1497 m47953() {
        int iM47950 = m47950();
        if (iM47950 == 63) {
            m47950();
            return EnumC1497.LAZY;
        }
        if (iM47950 == 43) {
            m47950();
            return EnumC1497.POSSESSIVE;
        }
        return EnumC1497.GREEDY;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5855 m47927(C5855 c5855, int i) {
        EnumC1497 enumC1497M47953 = m47953();
        if (enumC1497M47953 == EnumC1497.GREEDY) {
            if (c5855 instanceof C19822) {
                return new C4299((C19822) c5855, i);
            }
            if (c5855 instanceof C2182) {
                return new C3593(i);
            }
            if (c5855 instanceof C10877) {
                return new C16520(i);
            }
            if (c5855 instanceof C8678) {
                return new C15732(i);
            }
            if (c5855 instanceof C23494) {
                return new C6561((C23494) c5855, i);
            }
        }
        return new C20673(c5855, i, Integer.MAX_VALUE, enumC1497M47953);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5855 m47926(C5855 c5855) {
        int iM47949 = m47949();
        int i = 0;
        if (iM47949 == 42) {
            return m47927(c5855, 0);
        }
        if (iM47949 == 43) {
            return m47927(c5855, 1);
        }
        if (iM47949 == 63) {
            return new C10670(c5855, m47953());
        }
        if (iM47949 != 123) {
            return c5855;
        }
        int iM47952 = m47952();
        if (!C22165.m49802(iM47952)) {
            throw m47947("Illegal repetition");
        }
        int i2 = 0;
        while (true) {
            long j = 10;
            long j2 = ((long) i2) * j;
            long j3 = (int) j2;
            if (j2 != j3) {
                throw new ArithmeticException();
            }
            long j4 = j3 + ((long) (iM47952 - 48));
            int i3 = (int) j4;
            if (j4 != i3) {
                throw new ArithmeticException();
            }
            try {
                int iM47934 = m47934();
                if (!C22165.m49802(iM47934)) {
                    if (iM47934 == 44) {
                        iM47934 = m47934();
                        if (iM47934 == 125) {
                            m47936();
                            return m47927(c5855, i3);
                        }
                        while (C22165.m49802(iM47934)) {
                            long j5 = ((long) i) * j;
                            long j6 = (int) j5;
                            if (j5 != j6) {
                                throw new ArithmeticException();
                            }
                            long j7 = j6 + ((long) (iM47934 - 48));
                            i = (int) j7;
                            if (j7 != i) {
                                throw new ArithmeticException();
                            }
                            iM47934 = m47934();
                        }
                    } else {
                        i = i3;
                    }
                    if (iM47934 != 125) {
                        throw m47947("Unclosed counted closure");
                    }
                    if (i < i3) {
                        throw m47947("Illegal repetition range");
                    }
                    m47936();
                    return (i3 == 0 && i == 1) ? new C10670(c5855, m47953()) : new C20673(c5855, i3, i, m47953());
                }
                i2 = i3;
                iM47952 = iM47934;
            } catch (ArithmeticException unused) {
                throw m47947("Illegal repetition range");
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private int m47935() {
        int iM49803 = 0;
        for (int i = 0; i < 4; i++) {
            int iM47934 = m47934();
            if (!C22165.m49801(iM47934, 32768)) {
                throw m47947("Illegal Unicode escape sequence");
            }
            iM49803 = (iM49803 * 16) + C22165.m49803(iM47934);
        }
        return iM49803;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m47937(int i, String str) {
        int i2 = 0;
        if (i == 1 && str.length() > 0 && !Character.isHighSurrogate(str.charAt(0))) {
            return 1;
        }
        int length = str.length();
        if (i >= 0) {
            for (int i3 = 0; i2 < length && i3 < i; i3++) {
                int i4 = i2 + 1;
                i2 = (Character.isHighSurrogate(str.charAt(i2)) && i4 < length && Character.isLowSurrogate(str.charAt(i4))) ? i2 + 2 : i4;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2203 m47924(int i, boolean z, int[] iArr) {
        int[] iArr2 = new int[i];
        int i2 = 0;
        if (!m47942(2)) {
            while (i2 < i) {
                iArr2[i2] = iArr[i2];
                i2++;
            }
            return z ? new C3614(iArr2) : new C9259(iArr2);
        }
        if (m47942(64)) {
            while (i2 < i) {
                iArr2[i2] = C3395.m10356(iArr[i2]);
                i2++;
            }
            return z ? new C19137(iArr2) : new C18431(iArr2);
        }
        while (i2 < i) {
            iArr2[i2] = C22165.m49804(iArr[i2]);
            i2++;
        }
        return z ? new C15607(iArr2) : new C8553(iArr2);
    }
}
