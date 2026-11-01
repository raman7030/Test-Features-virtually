package p067l;

import android.os.Build;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C22389 {

    /* JADX INFO: renamed from: ֡ */
    public int f70624;

    /* JADX INFO: renamed from: ֨ */
    public C7933 f70625;

    /* JADX INFO: renamed from: ֫ */
    public int[] f70626;

    /* JADX INFO: renamed from: ۖ */
    public C7933 f70627;

    /* JADX INFO: renamed from: ۘ */
    public volatile HashMap f70628;

    /* JADX INFO: renamed from: ۚ */
    public InterfaceC12628 f70629;

    /* JADX INFO: renamed from: ۜ */
    public boolean f70630;

    /* JADX INFO: renamed from: ۠ */
    public C9235 f70631;

    /* JADX INFO: renamed from: ۡ */
    public int f70632;

    /* JADX INFO: renamed from: ۢ */
    public int f70633;

    /* JADX INFO: renamed from: ۧ */
    public int f70634 = 1;

    /* JADX INFO: renamed from: ܳ */
    public boolean f70635;

    /* JADX INFO: renamed from: ܶ */
    public int[] f70636;

    /* JADX INFO: renamed from: ܺ */
    public BitSet f70637;

    /* JADX INFO: renamed from: ܽ */
    public int f70638;

    /* JADX INFO: renamed from: ܿ */
    public C7263[] f70639;

    /* JADX INFO: renamed from: ᩳ */
    public int f70640;

    /* JADX INFO: renamed from: ᩴ */
    public String f70641;

    /* JADX INFO: renamed from: ᩵ */
    public final String f70642;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f70643;

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f70644;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f70645;

    /* JADX INFO: renamed from: ܽ */
    public static boolean m50278(int i, int i2) {
        if ((i2 & 1) != 0) {
            return i == 10;
        }
        return i == 10 || i == 13 || (i | 1) == 8233 || i == 133;
    }

    public C22389(String str, int i) {
        this.f70642 = str;
        this.f70640 = i;
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
    /* JADX INFO: renamed from: ֫ */
    public static C3771 m50253(int i, String str) {
        C22389 c22389;
        EnumC25070 enumC25070;
        C7263 c7263;
        C7933 c15308;
        C7933 c7933;
        int iM50275;
        C7933 c7933M50256;
        C22016 c22016;
        int i2;
        EnumC3791 enumC3791;
        int i3;
        C14638 c22686;
        EnumC3791 enumC3792;
        C23888 c23888;
        C13160 c13160;
        C8977 c8977;
        boolean z;
        C7933 c7933M50268;
        C7933 c7933M50257;
        boolean z2;
        C7933 c7934;
        C22389 c223810;
        StringBuilder sb;
        int i4;
        BitSet bitSet;
        StringBuilder sb2;
        int iM44780;
        int i5;
        int iM44781;
        int i6;
        char c;
        int i7;
        int i8;
        C22389 c223811;
        C22389 c223812 = new C22389(str, i);
        int i9 = 0;
        if (str.isEmpty()) {
            C16649 c16649 = C16057.f47258;
            c223812.f70625 = new C2449(c16649);
            c223812.f70627 = c16649;
            c223812.f70631 = C16057.m36564(c16649);
            c223811 = c223812;
        } else {
            c223812.f70630 = false;
            c223812.f70635 = false;
            c223812.f70637 = null;
            c223812.f70631 = null;
            c223812.f70641 = str;
            c223812.m50274();
            char c2 = '-';
            char c3 = '\\';
            if (c223812.m50272(128) && !c223812.m50272(16)) {
                c22389 = c223812;
                c22389 = c223812;
                int[] iArr = new int[c223812.f70636.length];
                int iCharCount = 0;
                int i10 = 0;
                while (iCharCount < c223812.f70642.length()) {
                    iArr[i10] = iCharCount;
                    iCharCount += Character.charCount(c223812.f70642.codePointAt(iCharCount));
                    i10++;
                }
                int length = c223812.f70642.length();
                iArr[i10 + 1] = length;
                iArr[i10] = length;
                int[] iArrM50263 = c223812.m50263(iArr);
                String str2 = new String(c223812.f70636, 0, c223812.f70624);
                int[] iArr2 = new int[str2.length()];
                int i11 = 0;
                while (i11 < c223812.f70624) {
                    int iCharCount2 = Character.charCount(c223812.f70636[i11]) + i9;
                    Arrays.fill(iArr2, i9, iCharCount2, iArrM50263[i11]);
                    i11++;
                    i9 = iCharCount2;
                }
                String str3 = c223812.f70642;
                int i12 = c223812.f70640;
                int length2 = str2.length();
                StringBuilder sb3 = new StringBuilder(str3.length());
                C18364 c18364 = new C18364(sb3, str3);
                BitSet bitSet2 = c18364.f54847;
                C19706 c19706 = new C19706(str2, i12);
                ArrayDeque arrayDeque = new ArrayDeque();
                int iM44782 = 0;
                boolean z3 = false;
                int i13 = 0;
                int i14 = 0;
                C22389 c223813 = c223812;
                loop2: while (true) {
                    boolean z4 = false;
                    C22389 c223814 = c223813;
                    while (true) {
                        boolean z5 = false;
                        C22389 c223815 = c223814;
                        while (true) {
                            c223810 = c223815;
                            if (iM44782 >= length2) {
                                break loop2;
                            }
                            int iM44783 = c19706.m44780(iM44782);
                            if (iM44783 != iM44782) {
                                if (iM44783 == length2) {
                                    break loop2;
                                }
                                z5 = false;
                                iM44782 = iM44783;
                            }
                            char cCharAt = str2.charAt(iM44782);
                            if (cCharAt == c3) {
                                c = c3;
                                i7 = iM44782 + 1;
                                if (i7 < length2) {
                                    break;
                                }
                            }
                            if (i14 > 0 && cCharAt == c2 && z4 && (i6 = iM44782 + 1) < length2) {
                                sb = sb3;
                                if (str2.charAt(i6) != '[' && str2.charAt(i6) != ']') {
                                    int iM44784 = c19706.m44780(i6);
                                    if (iM44784 < length2) {
                                        iM44784 = str2.charAt(iM44784) == '\\' ? c19706.m44781(iM44784, bitSet2, iArr2) : iM44784 + Character.charCount(str2.codePointAt(iM44784));
                                    }
                                    iM44782 = iM44784;
                                    c2 = '-';
                                    c3 = '\\';
                                    z3 = false;
                                    break;
                                }
                            } else {
                                sb = sb3;
                            }
                            if (i14 > 0 && cCharAt == '&' && (iM44781 = c19706.m44780(iM44782 + 1)) < length2 && str2.charAt(iM44781) == '&') {
                                iM44782 = iM44781 + 1;
                                c2 = '-';
                                c3 = '\\';
                                break;
                            }
                            if (i14 == 0 && cCharAt == '(') {
                                int i15 = c19706.f59910;
                                iM44782++;
                                int iM44785 = c19706.m44780(iM44782);
                                String str4 = c19706.f59911;
                                int length3 = str4.length();
                                if (iM44785 != length3) {
                                    i4 = length2;
                                    bitSet = bitSet2;
                                    if (str4.charAt(iM44785) == '?') {
                                        int i16 = iM44785 + 1;
                                        int i17 = c19706.f59910;
                                        boolean z6 = false;
                                        while (true) {
                                            iM44780 = c19706.m44780(i16);
                                            if (iM44780 < length3) {
                                                int i18 = length3;
                                                char cCharAt2 = str4.charAt(iM44780);
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
                                                            int i19 = c19706.f59910;
                                                            c19706.f59910 = z6 ? (~i5) & i19 : i5 | i19;
                                                        }
                                                    } else {
                                                        z6 = true;
                                                    }
                                                    i16 = iM44780 + 1;
                                                    length3 = i18;
                                                    str4 = str5;
                                                }
                                            }
                                            c19706.f59910 = i17;
                                        }
                                    }
                                    if (iM44780 >= 0) {
                                        if (str2.charAt(iM44780) == ':') {
                                            arrayDeque.push(Integer.valueOf(i15));
                                        }
                                        sb2 = sb;
                                        iM44782 = iM44780 + 1;
                                    } else {
                                        arrayDeque.push(Integer.valueOf(i15));
                                        sb2 = sb;
                                    }
                                } else {
                                    i4 = length2;
                                    bitSet = bitSet2;
                                }
                                iM44780 = -1;
                                if (iM44780 >= 0) {
                                    if (str2.charAt(iM44780) == ':') {
                                        arrayDeque.push(Integer.valueOf(i15));
                                    }
                                    sb2 = sb;
                                    iM44782 = iM44780 + 1;
                                } else {
                                    arrayDeque.push(Integer.valueOf(i15));
                                    sb2 = sb;
                                }
                            } else {
                                i4 = length2;
                                bitSet = bitSet2;
                                if (i14 == 0 && cCharAt == ')' && !arrayDeque.isEmpty()) {
                                    c19706.f59910 = ((Integer) arrayDeque.pop()).intValue();
                                }
                                if (cCharAt == '[') {
                                    if (i14 == 0) {
                                        int i20 = iArr2[iM44782];
                                        if (i13 < i20) {
                                            c18364.m41839(i13, i20);
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
                                            int i21 = iArr2[iM44782] + 1;
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
                                iM44782++;
                            }
                            c2 = '-';
                            length2 = i4;
                            sb3 = sb2;
                            c223815 = c223810;
                            bitSet2 = bitSet;
                            c3 = '\\';
                        }
                        char cCharAt3 = str2.charAt(i7);
                        z4 = "dDsSwWhHVpP".indexOf(cCharAt3) < 0 && (cCharAt3 != 'v' || ((i8 = iM44782 + 2) < length2 && str2.charAt(i8) == c2));
                        iM44782 = c19706.m44781(iM44782, bitSet2, iArr2);
                        z3 = false;
                        c3 = c;
                        c223814 = c223810;
                    }
                    sb3 = sb;
                    c223813 = c223810;
                }
                StringBuilder sb4 = sb3;
                if (i13 < str3.length()) {
                    c18364.m41839(i13, str3.length());
                }
                C22389 c223816 = c223810;
                c223816.f70641 = sb4.toString();
                c223816.m50274();
                c22389 = c223816;
            }
            c22389 = c223812;
            c22389 = c223812;
            c22389 = c223812;
            if (!c22389.m50272(16)) {
                c22389.m50263((int[]) null);
            }
            c22389.f70626 = new int[32];
            c22389.f70639 = new C7263[10];
            c22389.f70628 = null;
            c22389.f70644 = new ArrayList(10);
            if (c22389.m50272(16)) {
                C4462 c4462M50254 = c22389.m50254(c22389.f70624, c22389.f70643, c22389.f70636);
                c22389.f70627 = c4462M50254;
                c4462M50254.f20809 = C16057.f47258;
            } else {
                C16649 c166410 = C16057.f47258;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(new C8977(c166410, null));
                while (true) {
                    C8977 c8978 = (C8977) arrayDeque2.peek();
                    C7933 c7935 = c8978.f24317;
                    C7933 c7936 = c8978.f24311;
                    while (true) {
                        int iM50279 = c22389.m50279();
                        if (iM50279 != 0) {
                            if (iM50279 == 36) {
                                c22389.m50280();
                                c7933M50268 = c22389.m50272(1) ? new C3988(c22389.m50272(8)) : new C11287(c22389.m50272(8));
                            } else {
                                if (iM50279 != 46) {
                                    if (iM50279 != 63) {
                                        if (iM50279 != 124) {
                                            if (iM50279 != 125) {
                                                switch (iM50279) {
                                                    case 40:
                                                    case 41:
                                                        break;
                                                    case 42:
                                                    case 43:
                                                        break;
                                                    default:
                                                        switch (iM50279) {
                                                            case 91:
                                                                c7933M50268 = (!c22389.m50272(128) || c22389.m50272(16)) ? c22389.m50259(c22389.m50276()) : new C13968(c22389.m50276());
                                                                break;
                                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                                int[] iArr3 = c22389.f70636;
                                                                int i22 = c22389.f70638 + 1;
                                                                c22389.f70638 = i22;
                                                                int i23 = iArr3[i22];
                                                                if (i23 == 112 || i23 == 80) {
                                                                    boolean z8 = i23 == 80;
                                                                    if (c22389.m50280() != 123) {
                                                                        c22389.m50266();
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c7933M50268 = (!c22389.m50272(128) || c22389.m50272(16)) ? c22389.m50259(c22389.m50258(z2, z8)) : new C13968(c22389.m50258(z2, z8));
                                                                } else {
                                                                    c22389.m50266();
                                                                    c7933M50268 = c22389.m50268();
                                                                }
                                                                break;
                                                            case 93:
                                                                c7933M50268 = c22389.m50268();
                                                                break;
                                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                                c22389.m50280();
                                                                if (!c22389.m50272(8)) {
                                                                    c7933M50268 = new C7124();
                                                                } else if (c22389.m50272(1)) {
                                                                    c7933M50268 = new C9156();
                                                                } else {
                                                                    c7933M50268 = new C9136();
                                                                }
                                                                break;
                                                            default:
                                                                c7933M50268 = c22389.m50268();
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                c7933M50268 = c22389.m50268();
                                            }
                                        }
                                    }
                                    c22389.m50280();
                                    throw c22389.m50277("Dangling meta character '" + ((char) iM50279) + "'");
                                }
                                c22389.m50280();
                                c7933M50268 = c22389.m50272(32) ? new C4442() : c22389.m50272(1) ? new C12706() : new C10616();
                            }
                            c7933M50257 = c22389.m50256(c7933M50268);
                            if (c7935 == null) {
                                c7935 = c7933M50257;
                            } else {
                                c7936.f20809 = c7933M50257;
                            }
                            c7936 = c7933M50257;
                        } else {
                            if (c22389.f70638 >= c22389.f70624) {
                            }
                            c7933M50268 = c22389.m50268();
                            c7933M50257 = c22389.m50256(c7933M50268);
                            if (c7935 == null) {
                                c7935 = c7933M50257;
                            } else {
                                c7936.f20809 = c7933M50257;
                            }
                            c7936 = c7933M50257;
                        }
                    }
                    c8978.f24317 = c7935;
                    c8978.f24311 = c7936;
                    if (c22389.m50279() == 40) {
                        C16352 c16352 = new C16352(c22389.f70640, c22389.f70644.size());
                        c22389.f70625 = null;
                        if (c22389.m50280() == 63) {
                            int iM50282 = c22389.m50282();
                            if (iM50282 != 33) {
                                if (iM50282 != 36) {
                                    if (iM50282 == 58) {
                                        c16352.f48044 = c22389.m50255(true);
                                    } else if (iM50282 != 64) {
                                        switch (iM50282) {
                                            case 60:
                                                int iM50264 = c22389.m50264();
                                                if (iM50264 == 61 || iM50264 == 33) {
                                                    c16352.f48040 = iM50264 == 61 ? EnumC25070.POSITIVE_LOOKBEHIND : EnumC25070.NEGATIVE_LOOKBEHIND;
                                                    c16352.f48042 = c22389.f70638;
                                                    c16352.f48043 = c22389.f70634;
                                                    c16352.f48044 = c22389.m50255(true);
                                                } else {
                                                    String strM50251 = c22389.m50251(iM50264);
                                                    if (((HashMap) c22389.m50284()).containsKey(strM50251)) {
                                                        throw c22389.m50277(C6988.m16053("Named capturing group <", strM50251, "> is already defined"));
                                                    }
                                                    c16352.f48039 = true;
                                                    c16352.f48044 = c22389.m50255(false);
                                                    ((HashMap) c22389.m50284()).put(strM50251, Integer.valueOf(c22389.f70634 - 1));
                                                }
                                                break;
                                            case 61:
                                                if (iM50282 == 61) {
                                                    enumC25070 = EnumC25070.POSITIVE_LOOKAHEAD;
                                                } else {
                                                    enumC25070 = EnumC25070.NEGATIVE_LOOKAHEAD;
                                                }
                                                c16352.f48040 = enumC25070;
                                                c16352.f48044 = c22389.m50255(true);
                                                break;
                                            case 62:
                                                c16352.f48040 = EnumC25070.INDEPENDENT;
                                                c16352.f48044 = c22389.m50255(true);
                                                break;
                                            default:
                                                c22389.m50266();
                                                int iM502710 = c22389.m50279();
                                                while (true) {
                                                    if (iM502710 != 45) {
                                                        if (iM502710 == 85) {
                                                            c22389.f70640 |= 320;
                                                        } else if (iM502710 == 105) {
                                                            c22389.f70640 |= 2;
                                                        } else if (iM502710 == 109) {
                                                            c22389.f70640 |= 8;
                                                        } else if (iM502710 == 115) {
                                                            c22389.f70640 |= 32;
                                                        } else if (iM502710 == 117) {
                                                            c22389.f70640 |= 64;
                                                        } else if (iM502710 == 120) {
                                                            c22389.f70640 |= 4;
                                                        } else if (iM502710 == 99) {
                                                            c22389.f70640 |= 128;
                                                        } else if (iM502710 == 100) {
                                                            c22389.f70640 |= 1;
                                                        }
                                                        iM502710 = c22389.m50280();
                                                    } else {
                                                        c22389.m50280();
                                                        int iM502711 = c22389.m50279();
                                                        while (true) {
                                                            if (iM502711 == 85) {
                                                                c22389.f70640 &= -321;
                                                            } else if (iM502711 == 105) {
                                                                c22389.f70640 &= -3;
                                                            } else if (iM502711 == 109) {
                                                                c22389.f70640 &= -9;
                                                            } else if (iM502711 == 115) {
                                                                c22389.f70640 &= -33;
                                                            } else if (iM502711 == 117) {
                                                                c22389.f70640 &= -65;
                                                            } else if (iM502711 == 120) {
                                                                c22389.f70640 &= -5;
                                                            } else if (iM502711 == 99) {
                                                                c22389.f70640 &= -129;
                                                            } else if (iM502711 == 100) {
                                                                c22389.f70640 &= -2;
                                                            }
                                                            iM502711 = c22389.m50280();
                                                        }
                                                    }
                                                }
                                                int iM50265 = c22389.m50264();
                                                if (iM50265 != 41) {
                                                    if (iM50265 != 58) {
                                                        throw c22389.m50277("Unknown inline modifier");
                                                    }
                                                    c16352.f48044 = c22389.m50255(true);
                                                } else {
                                                    c16352 = null;
                                                }
                                                break;
                                        }
                                    }
                                }
                                throw c22389.m50277("Unknown group type");
                            }
                            if (iM50282 == 61) {
                                enumC25070 = EnumC25070.POSITIVE_LOOKAHEAD;
                            } else {
                                enumC25070 = EnumC25070.NEGATIVE_LOOKAHEAD;
                            }
                            c16352.f48040 = enumC25070;
                            c16352.f48044 = c22389.m50255(true);
                            if (c16352 != null) {
                                arrayDeque2.push(new C8977(c16352.f48046, c16352));
                            }
                        } else {
                            c16352.f48039 = true;
                            c16352.f48044 = c22389.m50255(false);
                        }
                        c16352.f48046 = c22389.f70625;
                        if (c16352 != null) {
                            arrayDeque2.push(new C8977(c16352.f48046, c16352));
                        }
                    } else {
                        C7933 c7937 = c8978.f24317;
                        C7933 c7938 = c8978.f24314;
                        if (c7937 == null) {
                            c7937 = c7938;
                        } else {
                            C7933 c7939 = c8978.f24311;
                            c7939.f20809 = c7938;
                            c22389.f70625 = c7939;
                        }
                        C7933 c79310 = c22389.f70625;
                        if (c8978.f24316 == null) {
                            c8978.f24316 = c7937;
                            c8978.f24315 = c79310;
                        } else {
                            if (c8978.f24312 == null) {
                                C23888 c23889 = new C23888();
                                c8978.f24312 = c23889;
                                c23889.f20809 = c7938;
                            }
                            if (c7937 == c7938) {
                                c7937 = null;
                            } else {
                                c79310.f20809 = c8978.f24312;
                            }
                            C7933 c79311 = c8978.f24316;
                            C13160 c13161 = c8978.f24310;
                            if (c79311 == c13161) {
                                int i24 = c13161.f36987;
                                C7933[] c7933Arr = c13161.f36986;
                                if (i24 >= c7933Arr.length) {
                                    C7933[] c7933Arr2 = new C7933[c7933Arr.length * 2];
                                    System.arraycopy(c7933Arr, 0, c7933Arr2, 0, c7933Arr.length);
                                    c13161.f36986 = c7933Arr2;
                                }
                                C7933[] c7933Arr3 = c13161.f36986;
                                int i25 = c13161.f36987;
                                c13161.f36987 = i25 + 1;
                                c7933Arr3[i25] = c7937;
                            } else {
                                if (c79311 == c7938) {
                                    c8978.f24316 = null;
                                } else {
                                    c8978.f24315.f20809 = c8978.f24312;
                                }
                                C13160 c13162 = new C13160(c8978.f24316, c7937, c8978.f24312);
                                c8978.f24310 = c13162;
                                c8978.f24316 = c13162;
                            }
                        }
                        c8978.f24311 = null;
                        c8978.f24317 = null;
                        if (c22389.m50279() == 124) {
                            c22389.m50280();
                        } else {
                            arrayDeque2.pop();
                            C13160 c13163 = c8978.f24310;
                            if (c13163 != null) {
                                c13163.m30147();
                            }
                            C16352 c16353 = c8978.f24313;
                            if (c16353 == null) {
                                c22389.f70627 = c8978.f24316;
                                if (c22389.f70624 != c22389.f70638) {
                                    if (c22389.m50279() == 41) {
                                        throw c22389.m50277("Unmatched closing ')'");
                                    }
                                    int i26 = c22389.f70638;
                                    int i27 = c22389.f70624;
                                    if (i26 == i27 + 1 && c22389.f70636[i27 - 1] == 92) {
                                        throw c22389.m50277("Unescaped trailing backslash");
                                    }
                                    throw c22389.m50277("Unexpected internal error");
                                }
                            } else {
                                C7933 c79312 = c8978.f24316;
                                C7263 c7264 = c16353.f48044;
                                C7933 c9806 = c16353.f48046;
                                int i28 = c16353.f48041;
                                boolean z9 = c16353.f48039;
                                c7264.f20809 = c79312;
                                if (c16353.f48040 == EnumC25070.NORMAL && z9) {
                                    c7263 = c7264;
                                    if (c79312 instanceof C21207) {
                                        C14500 c14500 = new C14500(c7264.f18931);
                                        c14500.f20809 = c7264.f20809;
                                        c14500.f18933 = c7264.f18933;
                                        c16353.f48044 = c14500;
                                        int i29 = ((C3239) c9806).f6277 / 2;
                                        C7263[] c7263Arr = c22389.f70639;
                                        if (i29 < c7263Arr.length) {
                                            c7263Arr[i29] = c14500;
                                        }
                                        c7263 = c14500;
                                    }
                                }
                                c7263 = c7264;
                                c7263 = c7264;
                                int iOrdinal = c16353.f48040.ordinal();
                                if (iOrdinal == 1) {
                                    c15308 = new C15308(c7263);
                                } else if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        c15308 = new C12509(c7263, EnumC3791.INDEPENDENT);
                                    } else if (iOrdinal == 4 || iOrdinal == 5) {
                                        c7933 = c7263;
                                        if (c16353.f48043 < c22389.f70634) {
                                            if (c22389.f70637 == null) {
                                                c22389.f70637 = new BitSet();
                                            }
                                            c22389.f70637.set(c16353.f48043, c22389.f70634);
                                        }
                                        c9806.f20809 = C21345.f67297;
                                        C14520 c14520 = new C14520();
                                        c7263.m18339(c14520);
                                        if (!c14520.f41438) {
                                            throw c22389.m50277("Look-behind group does not have an obvious maximum length");
                                        }
                                        int i30 = c16353.f48042;
                                        int i31 = c22389.f70624;
                                        while (true) {
                                            if (i30 >= i31) {
                                                z = false;
                                            } else if (C16057.m36562(c22389.f70636[i30])) {
                                                z = true;
                                            } else {
                                                i30++;
                                            }
                                        }
                                        c9806 = c16353.f48040 == EnumC25070.POSITIVE_LOOKBEHIND ? z ? new C9806(c14520.f41437, c14520.f41439, c7263) : new C3100(c14520.f41437, c14520.f41439, c7263) : z ? new C24026(c14520.f41437, c14520.f41439, c7263) : new C13298(c14520.f41437, c14520.f41439, c7263);
                                        if (i28 < c22389.f70644.size()) {
                                            ArrayList arrayList = c22389.f70644;
                                            arrayList.subList(i28, arrayList.size()).clear();
                                        }
                                        c7933 = c9806;
                                    }
                                    c7933 = c7263;
                                    int[] iArr4 = c22389.f70636;
                                    int i32 = c22389.f70638;
                                    c22389.f70638 = i32 + 1;
                                    iM50275 = iArr4[i32];
                                    if (c22389.m50272(4)) {
                                        iM50275 = c22389.m50275(iM50275);
                                    }
                                    if (41 == iM50275) {
                                        throw c22389.m50277("Unclosed group");
                                    }
                                    c22389.f70640 = c16353.f48045;
                                    c7933M50256 = c22389.m50256(c7933);
                                    if (c7933M50256 == c7933) {
                                        if (c16353.f48040 == EnumC25070.NORMAL && !z9) {
                                            ((C7263) c7933).f18932 = false;
                                            ((C3239) c9806).f6279 = false;
                                        }
                                        c22389.f70625 = c9806;
                                    } else if (c7933 == c9806) {
                                        c22389.f70625 = c7933M50256;
                                    } else {
                                        if (i28 < c22389.f70644.size()) {
                                            ArrayList arrayList2 = c22389.f70644;
                                            arrayList2.subList(i28, arrayList2.size()).clear();
                                        }
                                        if (c7933M50256 instanceof C12509) {
                                            enumC3792 = ((C12509) c7933M50256).f35057;
                                            if (enumC3792 == EnumC3791.POSSESSIVE) {
                                                c22389.f70625 = c7933M50256;
                                            } else {
                                                c23888 = new C23888();
                                                c9806.f20809 = c23888;
                                                if (enumC3792 == EnumC3791.GREEDY) {
                                                    c13160 = new C13160(c7933, null, c23888);
                                                } else {
                                                    c13160 = new C13160(null, c7933, c23888);
                                                }
                                                c22389.f70625 = c23888;
                                                c7933M50256 = c13160;
                                            }
                                        } else {
                                            if (c7933M50256 instanceof C22016) {
                                                throw c22389.m50277("Internal logic error");
                                            }
                                            c22016 = (C22016) c7933M50256;
                                            i2 = c22016.f69298;
                                            enumC3791 = c22016.f69299;
                                            if (enumC3791 == EnumC3791.POSSESSIVE) {
                                                c22389.f70625 = c7933M50256;
                                            } else if (c7933.m18339(new C14520())) {
                                                C3239 c3239 = (C3239) c9806;
                                                c7933M50256 = new C2568(c7933.f20809, c22016.f69300, c22016.f69298, c22016.f69299, c3239.f6278, c3239.f6277, z9);
                                                c22389.f70625 = c7933M50256;
                                            } else {
                                                i3 = ((C7263) c7933).f18931;
                                                if (enumC3791 == EnumC3791.GREEDY) {
                                                    c22686 = new C14638(c22389.f70633, i3);
                                                    if (i2 == Integer.MAX_VALUE) {
                                                        c22389.f70644.add(c22686);
                                                    }
                                                } else {
                                                    c22686 = new C22686(c22389.f70633, i3);
                                                }
                                                c7933M50256 = new C9274(c22686);
                                                c22389.f70633++;
                                                c22686.f41780 = c22016.f69300;
                                                c22686.f41781 = i2;
                                                c22686.f41779 = c7933;
                                                c9806.f20809 = c22686;
                                                c22389.f70625 = c22686;
                                            }
                                        }
                                    }
                                    c8977 = (C8977) arrayDeque2.peek();
                                    C7933 c79313 = c22389.f70625;
                                    if (c8977.f24317 == null) {
                                        c8977.f24317 = c7933M50256;
                                    } else {
                                        c8977.f24311.f20809 = c7933M50256;
                                    }
                                    c8977.f24311 = c79313;
                                } else {
                                    c15308 = new C11957(c7263);
                                }
                                c9806 = c15308;
                                c7933 = c9806;
                                c7933 = c7263;
                                int[] iArr5 = c22389.f70636;
                                int i33 = c22389.f70638;
                                c22389.f70638 = i33 + 1;
                                iM50275 = iArr5[i33];
                                if (c22389.m50272(4)) {
                                    iM50275 = c22389.m50275(iM50275);
                                }
                                if (41 == iM50275) {
                                    throw c22389.m50277("Unclosed group");
                                }
                                c22389.f70640 = c16353.f48045;
                                c7933M50256 = c22389.m50256(c7933);
                                if (c7933M50256 == c7933) {
                                    if (c16353.f48040 == EnumC25070.NORMAL) {
                                        ((C7263) c7933).f18932 = false;
                                        ((C3239) c9806).f6279 = false;
                                    }
                                    c22389.f70625 = c9806;
                                } else if (c7933 == c9806) {
                                    c22389.f70625 = c7933M50256;
                                } else {
                                    if (i28 < c22389.f70644.size()) {
                                        ArrayList arrayList3 = c22389.f70644;
                                        arrayList3.subList(i28, arrayList3.size()).clear();
                                    }
                                    if (c7933M50256 instanceof C12509) {
                                        enumC3792 = ((C12509) c7933M50256).f35057;
                                        if (enumC3792 == EnumC3791.POSSESSIVE) {
                                            c22389.f70625 = c7933M50256;
                                        } else {
                                            c23888 = new C23888();
                                            c9806.f20809 = c23888;
                                            if (enumC3792 == EnumC3791.GREEDY) {
                                                c13160 = new C13160(c7933, null, c23888);
                                            } else {
                                                c13160 = new C13160(null, c7933, c23888);
                                            }
                                            c22389.f70625 = c23888;
                                            c7933M50256 = c13160;
                                        }
                                    } else {
                                        if (c7933M50256 instanceof C22016) {
                                            throw c22389.m50277("Internal logic error");
                                        }
                                        c22016 = (C22016) c7933M50256;
                                        i2 = c22016.f69298;
                                        enumC3791 = c22016.f69299;
                                        if (enumC3791 == EnumC3791.POSSESSIVE) {
                                            c22389.f70625 = c7933M50256;
                                        } else if (c7933.m18339(new C14520())) {
                                            C3239 c32310 = (C3239) c9806;
                                            c7933M50256 = new C2568(c7933.f20809, c22016.f69300, c22016.f69298, c22016.f69299, c32310.f6278, c32310.f6277, z9);
                                            c22389.f70625 = c7933M50256;
                                        } else {
                                            i3 = ((C7263) c7933).f18931;
                                            if (enumC3791 == EnumC3791.GREEDY) {
                                                c22686 = new C14638(c22389.f70633, i3);
                                                if (i2 == Integer.MAX_VALUE) {
                                                    c22389.f70644.add(c22686);
                                                }
                                            } else {
                                                c22686 = new C22686(c22389.f70633, i3);
                                            }
                                            c7933M50256 = new C9274(c22686);
                                            c22389.f70633++;
                                            c22686.f41780 = c22016.f69300;
                                            c22686.f41781 = i2;
                                            c22686.f41779 = c7933;
                                            c9806.f20809 = c22686;
                                            c22389.f70625 = c22686;
                                        }
                                    }
                                }
                                c8977 = (C8977) arrayDeque2.peek();
                                C7933 c79314 = c22389.f70625;
                                if (c8977.f24317 == null) {
                                    c8977.f24317 = c7933M50256;
                                } else {
                                    c8977.f24311.f20809 = c7933M50256;
                                }
                                c8977.f24311 = c79314;
                            }
                        }
                    }
                }
            }
            boolean z10 = (c22389.f70640 & 512) != 0;
            if (z10) {
                c7934 = c22389.f70627;
                if (c7934 instanceof C7124) {
                    if (z10) {
                        c22389.f70627 = new C19411(c7934);
                    }
                    c22389.f70625 = c22389.f70627;
                } else {
                    if (z10) {
                        c22389.f70627 = new C19411(c7934);
                    }
                    c22389.f70625 = c22389.f70627;
                }
            } else {
                C7933 c79315 = c22389.f70627;
                if (c79315 instanceof C11168) {
                    C7933 c7933M31504 = C13830.m31504(c79315);
                    c22389.f70625 = c7933M31504;
                    C7933 c79316 = c22389.f70627;
                    if (c7933M31504 == c79316) {
                        c22389.f70625 = m50252(c79316, c22389.f70643);
                    }
                } else {
                    c7934 = c22389.f70627;
                    if ((c7934 instanceof C7124) || (c7934 instanceof C5922)) {
                        if (z10) {
                            c22389.f70627 = new C19411(c7934);
                        }
                        c22389.f70625 = c22389.f70627;
                    } else {
                        if (z10) {
                            c22389.f70627 = new C19411(c7934);
                        }
                        c22389.f70625 = m50252(c22389.f70627, c22389.f70643);
                    }
                }
            }
            c22389.f70631 = (c22389.f70630 || c22389.f70635) ? C9235.f24999 : C16057.m36564(c22389.f70627);
            c22389.f70627 = C5251.m11327(c22389.f70627);
            if (!c22389.f70645) {
                for (C7933 c79317 : c22389.f70644) {
                    if (c79317 instanceof C14638) {
                        int i34 = c22389.f70632;
                        c22389.f70632 = i34 + 1;
                        ((C14638) c79317).f41782 = i34;
                    }
                }
            }
            c22389.f70636 = null;
            c22389.f70626 = null;
            c22389.f70639 = null;
            c22389.f70624 = 0;
            c22389.f70644 = null;
            c223811 = c22389;
        }
        return new C3771(c223811.f70625, c223811.f70627, c223811.f70640, c223811.f70634, c223811.f70633, c223811.f70632, c223811.f70631, c223811.f70630 || c223811.f70635, c223811.f70637, c223811.m50284(), new C9982(1));
    }

    /* JADX INFO: renamed from: ܽ */
    private int m50275(int i) {
        while (true) {
            if (!C23434.m52139(i, 2048) && i != 35) {
                return i;
            }
            while (C23434.m52139(i, 2048)) {
                int[] iArr = this.f70636;
                int i2 = this.f70638;
                this.f70638 = i2 + 1;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f70636;
                int i3 = this.f70638;
                this.f70638 = i3 + 1;
                i = iArr2[i3];
                while (i != 0 && !m50278(i, this.f70640)) {
                    int[] iArr3 = this.f70636;
                    int i4 = this.f70638;
                    this.f70638 = i4 + 1;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f70638;
                    int i6 = this.f70624;
                    if (i5 > i6) {
                        int[] iArr4 = this.f70636;
                        this.f70638 = i6 + 1;
                        i = iArr4[i6];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m50281(int i) {
        while (true) {
            if (!C23434.m52139(i, 2048) && i != 35) {
                return i;
            }
            while (C23434.m52139(i, 2048)) {
                int[] iArr = this.f70636;
                int i2 = this.f70638 + 1;
                this.f70638 = i2;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f70636;
                int i3 = this.f70638 + 1;
                this.f70638 = i3;
                i = iArr2[i3];
                while (i != 0 && !m50278(i, this.f70640)) {
                    int[] iArr3 = this.f70636;
                    int i4 = this.f70638 + 1;
                    this.f70638 = i4;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f70638;
                    int i6 = this.f70624;
                    if (i5 > i6) {
                        this.f70638 = i6;
                        i = this.f70636[i6];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50260(int i, int i2, String str, StringBuilder sb) {
        m50261(str, i, i2, sb, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50261(String str, int i, int i2, final StringBuilder sb, final boolean z) {
        int i3 = i;
        while (i3 < i2 && C23434.m52138(str.charAt(i3))) {
            i3++;
        }
        if (i3 == i2) {
            if (z) {
                sb.append(C13259.m30305(str.substring(i, i2)));
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
                sb.append(C13259.m30305(str.substring(i, i5)));
            } else {
                sb.append((CharSequence) str, i, i5);
            }
            i = i5;
        }
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (z || ".$|()[]{}^?*+\\".indexOf(iCodePointAt) == i4) {
                int iM11539 = C5329.m11539(str, i, i2, null);
                String strSubstring = str.substring(i, iM11539);
                String strNormalize = Normalizer.normalize(strSubstring, Normalizer.Form.NFD);
                if (strNormalize.codePointCount(0, strNormalize.length()) <= 1 || C4426.m9241(strNormalize.codePointAt(Character.charCount(strNormalize.codePointAt(0)))) != 6) {
                    String strNormalize2 = Normalizer.normalize(strSubstring, Normalizer.Form.NFC);
                    if (z) {
                        strSubstring = C13259.m30305(strSubstring);
                        strNormalize = C13259.m30305(strNormalize);
                        strNormalize2 = C13259.m30305(strNormalize2);
                    }
                    if (!strSubstring.equals(strNormalize2) && !strNormalize.equals(strNormalize2)) {
                        StringBuilder sbM12525 = C5633.m12525("(?:", strSubstring, "|", strNormalize, "|");
                        sbM12525.append(strNormalize2);
                        sbM12525.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        sb.append(sbM12525.toString());
                    } else if (strSubstring.equals(strNormalize)) {
                        sb.append(strSubstring);
                    } else {
                        sb.append(C21459.m48622("(?:", strSubstring, "|", strNormalize, MotionUtils.EASING_TYPE_FORMAT_END));
                    }
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(strSubstring);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C13001(strNormalize));
                    while (!arrayList.isEmpty()) {
                        C13001 c13001 = (C13001) C20013.m45383(arrayList, 1);
                        String[] strArr = c13001.f36580;
                        String str2 = c13001.f36578;
                        if (strArr == null) {
                            linkedHashSet.add(str2);
                            arrayList.remove(arrayList.size() - 1);
                        } else if (c13001.f36579 == strArr.length) {
                            C19925.m45229(arrayList, 1);
                        } else {
                            StringBuilder sbM17248 = C7470.m17248(str2);
                            String[] strArr2 = c13001.f36580;
                            int i6 = c13001.f36579;
                            c13001.f36579 = i6 + 1;
                            sbM17248.append(strArr2[i6]);
                            String string = sbM17248.toString();
                            linkedHashSet.add(string);
                            int iM50267 = m50267(2, string);
                            String strSubstring2 = string.substring(0, iM50267);
                            String strNormalize3 = Normalizer.normalize(strSubstring2, Normalizer.Form.NFC);
                            String strM40053 = strNormalize3.equals(strSubstring2) ? null : C17588.m40053(strNormalize3, string.substring(iM50267));
                            if (strM40053 != null) {
                                arrayList.add(new C13001(strM40053));
                            }
                        }
                    }
                    sb.append("(?:");
                    C21230.forEach(linkedHashSet, new Consumer() { // from class: l.֫ᩴܽ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void m45213n(Object obj) {
                            String strM30305 = (String) obj;
                            if (z) {
                                strM30305 = C13259.m30305(strM30305);
                            }
                            StringBuilder sb2 = sb;
                            sb2.append(strM30305);
                            sb2.append('|');
                        }
                    });
                    sb.delete(sb.length() - 1, sb.length());
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                i4 = -1;
                i = iM11539;
            } else {
                sb.append((char) iCodePointAt);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String[] m50273(String str) {
        if (str.length() == m50267(1, str)) {
            return new String[]{str};
        }
        if (str.length() == m50267(2, str)) {
            int iCodePointAt = Character.codePointAt(str, 0);
            int iCodePointAt2 = Character.codePointAt(str, Character.charCount(iCodePointAt));
            if (C21423.m48552(iCodePointAt2) == C21423.m48552(iCodePointAt)) {
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
            iArr2[i6] = C21423.m48552(iCodePointAt3);
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

    /* JADX INFO: renamed from: ֫ */
    private int[] m50263(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f70624;
        int i6 = 0;
        while (true) {
            i = i5 - 1;
            if (i6 >= i) {
                break;
            }
            int[] iArr2 = this.f70636;
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
            System.arraycopy(this.f70636, 0, iArr3, 0, i6);
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
                    int i10 = this.f70636[i7];
                    int i11 = -1;
                    if (!C23434.m52138(i10) || C23434.m52139(i10, 768)) {
                        i2 = i6 + 1;
                        iArr3[i6] = i10;
                    } else if (C23434.m52140(i10)) {
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
                        int[] iArr5 = this.f70636;
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
                    } else if (this.f70636[i9] == 69) {
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
            this.f70624 = i6;
            int i12 = i6 + 2;
            this.f70636 = Arrays.copyOf(iArr3, i12);
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

    /* JADX INFO: renamed from: ܳ */
    private void m50274() {
        int length = this.f70641.length();
        this.f70636 = new int[length + 2];
        int iCharCount = 0;
        this.f70643 = false;
        int i = 0;
        while (iCharCount < length) {
            int iCodePointAt = this.f70641.codePointAt(iCharCount);
            if (C16057.m36562(iCodePointAt)) {
                this.f70643 = true;
            }
            this.f70636[i] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i++;
        }
        this.f70624 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2449 m50252(C7933 c7933, boolean z) {
        C2449 c7144;
        if (!z) {
            C3120 c3120M5324 = C3120.m5324(c7933);
            if (c3120M5324 != null) {
                return c3120M5324;
            }
            C16531 c16531M37508 = C16531.m37508(c7933);
            if (c16531M37508 != null) {
                return c16531M37508;
            }
            if (c7933 instanceof C11168) {
                c7144 = new C21227((C11168) c7933);
            } else {
                c7144 = c7933 instanceof C21207 ? new C7144((C21207) c7933) : null;
            }
            C9826 c9826M22996 = C9826.m22996(c7933);
            if (c9826M22996 != null) {
                return c9826M22996;
            }
            C22568 c22568M50591 = C22568.m50591(c7933, c7144);
            if (c22568M50591 != null) {
                return c22568M50591;
            }
            if (c7144 != null) {
                return c7144;
            }
        }
        if (z) {
            return new C23238(c7933);
        }
        return new C2449(c7933);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map m50284() {
        HashMap map = this.f70628;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap(2);
        this.f70628 = map2;
        return map2;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m50272(int i) {
        return (i & this.f70640) != 0;
    }

    /* JADX INFO: renamed from: ܿ */
    private int m50279() {
        int i = this.f70636[this.f70638];
        return m50272(4) ? m50281(i) : i;
    }

    /* JADX INFO: renamed from: ۜ */
    private int m50264() {
        int[] iArr = this.f70636;
        int i = this.f70638;
        this.f70638 = i + 1;
        int i2 = iArr[i];
        return m50272(4) ? m50275(i2) : i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m50280() {
        int[] iArr = this.f70636;
        int i = this.f70638 + 1;
        this.f70638 = i;
        int i2 = iArr[i];
        return m50272(4) ? m50281(i2) : i2;
    }

    /* JADX INFO: renamed from: ᩷ */
    private int m50282() {
        int i = this.f70638;
        int i2 = this.f70636[i + 1];
        this.f70638 = i + 2;
        return i2;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m50266() {
        this.f70638--;
    }

    /* JADX INFO: renamed from: ܽ */
    private C14599 m50277(String str) {
        return new C14599(str, this.f70641, this.f70638 - 1);
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
    /* JADX INFO: renamed from: ۧ */
    private C7933 m50268() {
        final int i;
        InterfaceC12628 interfaceC12628M36557;
        final int iM52142;
        final int i2;
        int upperCase;
        final int lowerCase;
        int iM50279 = m50279();
        boolean z = false;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            if (iM50279 != 0) {
                if (iM50279 != 36 && iM50279 != 46) {
                    if (iM50279 != 63) {
                        if (iM50279 != 94 && iM50279 != 91) {
                            if (iM50279 == 92) {
                                int[] iArr = this.f70636;
                                int i5 = this.f70638 + 1;
                                this.f70638 = i5;
                                int i6 = iArr[i5];
                                if (i6 != 112 && i6 != 80) {
                                    m50266();
                                    i3 = this.f70638;
                                    int iM50250 = m50250(false, i4 == 0, false);
                                    if (iM50250 >= 0) {
                                        m50270(iM50250, i4);
                                        i4++;
                                        if (C16057.m36562(iM50250)) {
                                            z2 = true;
                                        }
                                        iM50279 = m50279();
                                    } else {
                                        if (i4 == 0) {
                                            return this.f70625;
                                        }
                                        this.f70638 = i3;
                                    }
                                } else if (i4 > 0) {
                                    m50266();
                                } else {
                                    boolean z3 = i6 == 80;
                                    if (m50280() != 123) {
                                        m50266();
                                        z = true;
                                    }
                                    if (m50272(128) && !m50272(16)) {
                                        return new C13968(m50258(z, z3));
                                    }
                                    return m50259(m50258(z, z3));
                                }
                            } else if (iM50279 != 123) {
                                if (iM50279 != 124) {
                                    switch (iM50279) {
                                        case 40:
                                        case 41:
                                            break;
                                        case 42:
                                        case 43:
                                            break;
                                        default:
                                            i3 = this.f70638;
                                            m50270(iM50279, i4);
                                            i4++;
                                            if (C16057.m36562(iM50279)) {
                                                z2 = true;
                                            }
                                            iM50279 = m50280();
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    if (i4 > 1) {
                        this.f70638 = i3;
                        i4--;
                    }
                }
                if (i4 == 1) {
                    i = this.f70626[0];
                    if (!m50272(2)) {
                        if (m50272(64)) {
                            upperCase = Character.toUpperCase(i);
                            lowerCase = Character.toLowerCase(upperCase);
                            if (upperCase != lowerCase) {
                                C7933 c7933 = C16057.f47257;
                                interfaceC12628M36557 = new InterfaceC12628() { // from class: l.ܿ֡ܽ
                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7732(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7733(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    public final C9667 negate() {
                                        C7933 c7934 = C16057.f47257;
                                        return C9667.m22548(this);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo4821(int i7) {
                                        int i8 = lowerCase;
                                        return i8 == i7 || i8 == C5595.m12395(i7);
                                    }
                                };
                            } else if (C16057.m36562(i)) {
                                interfaceC12628M36557 = C16057.m36557(i);
                            } else {
                                interfaceC12628M36557 = new InterfaceC12628() { // from class: l.᩻֡ܽ
                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7732(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo4821(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7733(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    public final C9667 negate() {
                                        C7933 c7934 = C16057.f47257;
                                        return C9667.m22548(this);
                                    }
                                };
                            }
                        } else if (C23434.m52138(i)) {
                            iM52142 = C23434.m52142(i);
                            if (((i - 97) | (122 - i)) >= 0) {
                                i2 = i - 32;
                            } else {
                                i2 = i;
                            }
                            if (iM52142 != i2) {
                                C7933 c7934 = C16057.f47257;
                                interfaceC12628M36557 = new InterfaceC23218() { // from class: l.ۢ֡ܽ
                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                        return C22548.m50518(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                        return C22548.m50519(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    public final C9667 negate() {
                                        C7933 c7935 = C16057.f47257;
                                        return C9667.m22548(this);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo4821(int i7) {
                                        return i7 == iM52142 || i7 == i2;
                                    }
                                };
                            } else if (C16057.m36562(i)) {
                                interfaceC12628M36557 = C16057.m36557(i);
                            } else {
                                interfaceC12628M36557 = new InterfaceC12628() { // from class: l.᩻֡ܽ
                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7732(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo4821(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7733(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    public final C9667 negate() {
                                        C7933 c7935 = C16057.f47257;
                                        return C9667.m22548(this);
                                    }
                                };
                            }
                        } else if (C16057.m36562(i)) {
                            interfaceC12628M36557 = C16057.m36557(i);
                        } else {
                            interfaceC12628M36557 = new InterfaceC12628() { // from class: l.᩻֡ܽ
                                @Override // p067l.InterfaceC12628
                                /* JADX INFO: renamed from: ֫ */
                                public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                    return C3910.m7732(this, interfaceC12628);
                                }

                                @Override // p067l.InterfaceC12628
                                /* JADX INFO: renamed from: ֫ */
                                public final boolean mo4821(int i7) {
                                    return i7 == i;
                                }

                                @Override // p067l.InterfaceC12628
                                /* JADX INFO: renamed from: ۧ */
                                public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                    return C3910.m7733(this, interfaceC12628);
                                }

                                @Override // p067l.InterfaceC12628
                                public final C9667 negate() {
                                    C7933 c7935 = C16057.f47257;
                                    return C9667.m22548(this);
                                }
                            };
                        }
                    } else if (C16057.m36562(i)) {
                        interfaceC12628M36557 = C16057.m36557(i);
                    } else {
                        interfaceC12628M36557 = new InterfaceC12628() { // from class: l.᩻֡ܽ
                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                return C3910.m7732(this, interfaceC12628);
                            }

                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ֫ */
                            public final boolean mo4821(int i7) {
                                return i7 == i;
                            }

                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ۧ */
                            public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                return C3910.m7733(this, interfaceC12628);
                            }

                            @Override // p067l.InterfaceC12628
                            public final C9667 negate() {
                                C7933 c7935 = C16057.f47257;
                                return C9667.m22548(this);
                            }
                        };
                    }
                    return m50259(interfaceC12628M36557);
                }
                return m50254(i4, z2, this.f70626);
            }
            if (this.f70638 >= this.f70624) {
                if (i4 == 1) {
                    i = this.f70626[0];
                    if (!m50272(2)) {
                        if (m50272(64)) {
                            upperCase = Character.toUpperCase(i);
                            lowerCase = Character.toLowerCase(upperCase);
                            if (upperCase != lowerCase) {
                                C7933 c7935 = C16057.f47257;
                                interfaceC12628M36557 = new InterfaceC12628() { // from class: l.ܿ֡ܽ
                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7732(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7733(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    public final C9667 negate() {
                                        C7933 c7936 = C16057.f47257;
                                        return C9667.m22548(this);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo4821(int i7) {
                                        int i8 = lowerCase;
                                        return i8 == i7 || i8 == C5595.m12395(i7);
                                    }
                                };
                            } else if (C16057.m36562(i)) {
                                interfaceC12628M36557 = C16057.m36557(i);
                            } else {
                                interfaceC12628M36557 = new InterfaceC12628() { // from class: l.᩻֡ܽ
                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7732(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo4821(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7733(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    public final C9667 negate() {
                                        C7933 c7936 = C16057.f47257;
                                        return C9667.m22548(this);
                                    }
                                };
                            }
                        } else if (C23434.m52138(i)) {
                            iM52142 = C23434.m52142(i);
                            if (((i - 97) | (122 - i)) >= 0) {
                                i2 = i - 32;
                            } else {
                                i2 = i;
                            }
                            if (iM52142 != i2) {
                                C7933 c7936 = C16057.f47257;
                                interfaceC12628M36557 = new InterfaceC23218() { // from class: l.ۢ֡ܽ
                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                        return C22548.m50518(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                        return C22548.m50519(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    public final C9667 negate() {
                                        C7933 c7937 = C16057.f47257;
                                        return C9667.m22548(this);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo4821(int i7) {
                                        return i7 == iM52142 || i7 == i2;
                                    }
                                };
                            } else if (C16057.m36562(i)) {
                                interfaceC12628M36557 = C16057.m36557(i);
                            } else {
                                interfaceC12628M36557 = new InterfaceC12628() { // from class: l.᩻֡ܽ
                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7732(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ֫ */
                                    public final boolean mo4821(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // p067l.InterfaceC12628
                                    /* JADX INFO: renamed from: ۧ */
                                    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                        return C3910.m7733(this, interfaceC12628);
                                    }

                                    @Override // p067l.InterfaceC12628
                                    public final C9667 negate() {
                                        C7933 c7937 = C16057.f47257;
                                        return C9667.m22548(this);
                                    }
                                };
                            }
                        } else if (C16057.m36562(i)) {
                            interfaceC12628M36557 = C16057.m36557(i);
                        } else {
                            interfaceC12628M36557 = new InterfaceC12628() { // from class: l.᩻֡ܽ
                                @Override // p067l.InterfaceC12628
                                /* JADX INFO: renamed from: ֫ */
                                public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                    return C3910.m7732(this, interfaceC12628);
                                }

                                @Override // p067l.InterfaceC12628
                                /* JADX INFO: renamed from: ֫ */
                                public final boolean mo4821(int i7) {
                                    return i7 == i;
                                }

                                @Override // p067l.InterfaceC12628
                                /* JADX INFO: renamed from: ۧ */
                                public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                    return C3910.m7733(this, interfaceC12628);
                                }

                                @Override // p067l.InterfaceC12628
                                public final C9667 negate() {
                                    C7933 c7937 = C16057.f47257;
                                    return C9667.m22548(this);
                                }
                            };
                        }
                    } else if (C16057.m36562(i)) {
                        interfaceC12628M36557 = C16057.m36557(i);
                    } else {
                        interfaceC12628M36557 = new InterfaceC12628() { // from class: l.᩻֡ܽ
                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                return C3910.m7732(this, interfaceC12628);
                            }

                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ֫ */
                            public final boolean mo4821(int i7) {
                                return i7 == i;
                            }

                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ۧ */
                            public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                return C3910.m7733(this, interfaceC12628);
                            }

                            @Override // p067l.InterfaceC12628
                            public final C9667 negate() {
                                C7933 c7937 = C16057.f47257;
                                return C9667.m22548(this);
                            }
                        };
                    }
                    return m50259(interfaceC12628M36557);
                }
                return m50254(i4, z2, this.f70626);
            }
            i3 = this.f70638;
            m50270(iM50279, i4);
            i4++;
            if (C16057.m36562(iM50279)) {
                z2 = true;
            }
            iM50279 = m50280();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m50270(int i, int i2) {
        int length = this.f70626.length;
        if (i2 - length >= 0) {
            int i3 = (i2 + 1) - length;
            int iMax = Math.max(i3, length) + length;
            if (iMax <= 0 || iMax > 2147483639) {
                iMax = length + i3;
                if (iMax < 0) {
                    throw new OutOfMemoryError(C20780.m46928("Required array length ", length, " + ", " is too large", i3));
                }
                if (iMax <= 2147483639) {
                    iMax = 2147483639;
                }
            }
            this.f70626 = Arrays.copyOf(this.f70626, iMax);
        }
        this.f70626[i2] = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:248:0x03aa  */
    /* JADX INFO: renamed from: ֫ */
    private int m50250(boolean z, boolean z2, boolean z3) {
        InterfaceC12628 interfaceC12628M16040;
        InterfaceC12628 interfaceC12628M16044;
        InterfaceC12628 interfaceC12628M16041;
        InterfaceC12628 interfaceC12628M16045;
        int iM50282 = m50282();
        int iM52141 = 0;
        switch (iM50282) {
            case 48:
                int iM50264 = m50264();
                int i = iM50264 - 48;
                if (((55 - iM50264) | i) < 0) {
                    throw m50277("Illegal octal escape sequence");
                }
                int iM50265 = m50264();
                int i2 = iM50265 - 48;
                if (((55 - iM50265) | i2) < 0) {
                    m50266();
                    return i;
                }
                int iM50266 = m50264();
                int i3 = iM50266 - 48;
                if (((55 - iM50266) | i3) >= 0 && ((51 - iM50264) | i) >= 0) {
                    return C24420.m53892(i2, 8, i * 64, i3);
                }
                m50266();
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
                        int i4 = iM50282 - 48;
                        while (iM52141 == 0) {
                            int iM50279 = m50279();
                            switch (iM50279) {
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
                                    int i5 = (iM50279 - 48) + (i4 * 10);
                                    if (this.f70634 - 1 >= i5) {
                                        m50264();
                                        i4 = i5;
                                    } else {
                                        iM52141 = 1;
                                    }
                                    break;
                                default:
                                    iM52141 = 1;
                                    break;
                            }
                        }
                        this.f70645 = true;
                        this.f70625 = m50272(2) ? new C15170(i4, m50272(64)) : new C2429(i4);
                    }
                    return -1;
                }
                throw m50277("Illegal/unsupported escape sequence");
            default:
                switch (iM50282) {
                    case 65:
                        if (!z) {
                            if (z2) {
                                this.f70625 = new C7124();
                                return -1;
                            }
                            return -1;
                        }
                        throw m50277("Illegal/unsupported escape sequence");
                    case 66:
                        if (!z) {
                            if (z2) {
                                this.f70625 = new C7795(4, m50272(256));
                                return -1;
                            }
                            return -1;
                        }
                        throw m50277("Illegal/unsupported escape sequence");
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
                        throw m50277("Illegal/unsupported escape sequence");
                    case 68:
                        if (z2) {
                            if (m50272(256)) {
                                int i6 = C6985.f18184;
                                interfaceC12628M16040 = new C21718();
                            } else {
                                interfaceC12628M16040 = C6985.m16040();
                            }
                            this.f70629 = interfaceC12628M16040;
                            C9667 c9667Negate = interfaceC12628M16040.negate();
                            this.f70629 = c9667Negate;
                            if (!z) {
                                this.f70625 = m50259(c9667Negate);
                                return -1;
                            }
                        }
                        return -1;
                    case 71:
                        if (!z) {
                            if (z2) {
                                this.f70630 = true;
                                this.f70625 = new C9945();
                                return -1;
                            }
                            return -1;
                        }
                        throw m50277("Illegal/unsupported escape sequence");
                    case 72:
                        if (z2) {
                            C7933 c7933 = C16057.f47257;
                            C9667 c9667Negate2 = new C21877().negate();
                            this.f70629 = c9667Negate2;
                            if (!z) {
                                this.f70625 = m50259(c9667Negate2);
                                return -1;
                            }
                        }
                        return -1;
                    case 78:
                        if (Build.VERSION.SDK_INT >= 35) {
                            if (m50264() != 123) {
                                throw m50277("Illegal character name escape sequence");
                            }
                            int i7 = this.f70638;
                            while (m50264() != 125) {
                                if (this.f70638 >= this.f70624) {
                                    throw m50277("Unclosed character name escape sequence");
                                }
                            }
                            String str = new String(this.f70636, i7, (this.f70638 - i7) - 1);
                            try {
                                return Character.codePointOf(str);
                            } catch (IllegalArgumentException unused) {
                                throw m50277(C6988.m16053("Unknown character name [", str, "]"));
                            }
                        }
                        throw m50277("Illegal/unsupported escape sequence");
                    case 82:
                        if (!z) {
                            if (z2) {
                                this.f70625 = new C23356();
                                return -1;
                            }
                            return -1;
                        }
                        throw m50277("Illegal/unsupported escape sequence");
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        if (z2) {
                            if (m50272(256)) {
                                int i8 = C6985.f18184;
                                interfaceC12628M16044 = new C16372();
                            } else {
                                interfaceC12628M16044 = C6985.m16044();
                            }
                            this.f70629 = interfaceC12628M16044;
                            C9667 c9667Negate3 = interfaceC12628M16044.negate();
                            this.f70629 = c9667Negate3;
                            if (!z) {
                                this.f70625 = m50259(c9667Negate3);
                                return -1;
                            }
                        }
                        return -1;
                    case HRSS1373Polynomial.f81792K /* 86 */:
                        if (z2) {
                            C7933 c7934 = C16057.f47257;
                            C9667 c9667Negate4 = new C10477().negate();
                            this.f70629 = c9667Negate4;
                            if (!z) {
                                this.f70625 = m50259(c9667Negate4);
                                return -1;
                            }
                        }
                        return -1;
                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                        if (z2) {
                            InterfaceC12628 interfaceC12628M16047 = m50272(256) ? C6985.m16047() : C6985.m16046();
                            this.f70629 = interfaceC12628M16047;
                            C9667 c9667Negate5 = interfaceC12628M16047.negate();
                            this.f70629 = c9667Negate5;
                            if (!z) {
                                this.f70625 = m50259(c9667Negate5);
                                return -1;
                            }
                        }
                        return -1;
                    case 88:
                        if (!z) {
                            if (z2) {
                                this.f70625 = new C18740();
                                return -1;
                            }
                            return -1;
                        }
                        throw m50277("Illegal/unsupported escape sequence");
                    case 90:
                        if (!z) {
                            if (z2) {
                                if (m50272(1)) {
                                    this.f70625 = new C3988(false);
                                    return -1;
                                }
                                this.f70625 = new C11287(false);
                                return -1;
                            }
                            return -1;
                        }
                        throw m50277("Illegal/unsupported escape sequence");
                    default:
                        switch (iM50282) {
                            case 97:
                                return 7;
                            case 98:
                                if (!z) {
                                    if (z2) {
                                        if (m50279() == 123) {
                                            if (m50282() != 103) {
                                                m50266();
                                                m50266();
                                            } else if (m50264() == 125) {
                                                this.f70635 = true;
                                                this.f70625 = new C20675();
                                                return -1;
                                            }
                                        }
                                        this.f70625 = new C7795(3, m50272(256));
                                    }
                                    return -1;
                                }
                                throw m50277("Illegal/unsupported escape sequence");
                            case C0254q.f1216f /* 99 */:
                                if (this.f70638 < this.f70624) {
                                    return m50264() ^ 64;
                                }
                                throw m50277("Illegal control escape sequence");
                            case 100:
                                if (z2) {
                                    if (m50272(256)) {
                                        int i9 = C6985.f18184;
                                        interfaceC12628M16041 = new C21718();
                                    } else {
                                        interfaceC12628M16041 = C6985.m16040();
                                    }
                                    this.f70629 = interfaceC12628M16041;
                                    if (!z) {
                                        this.f70625 = m50259(interfaceC12628M16041);
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
                                throw m50277("Illegal/unsupported escape sequence");
                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                if (z2) {
                                    C7933 c7935 = C16057.f47257;
                                    C21877 c21877 = new C21877();
                                    this.f70629 = c21877;
                                    if (!z) {
                                        this.f70625 = m50259(c21877);
                                        return -1;
                                    }
                                }
                                return -1;
                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                if (!z) {
                                    if (m50264() != 60) {
                                        throw m50277("\\k is not followed by '<' for named capturing group");
                                    }
                                    String strM50251 = m50251(m50264());
                                    Integer num = (Integer) ((HashMap) m50284()).get(strM50251);
                                    if (num == null) {
                                        throw m50277(C6988.m16053("named capturing group <", strM50251, "> does not exist"));
                                    }
                                    if (z2) {
                                        this.f70645 = true;
                                        if (m50272(2)) {
                                            this.f70625 = new C15170(num.intValue(), m50272(64));
                                            return -1;
                                        }
                                        this.f70625 = new C2429(num.intValue());
                                        return -1;
                                    }
                                    return -1;
                                }
                                throw m50277("Illegal/unsupported escape sequence");
                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                return 10;
                            case 114:
                                return 13;
                            case 115:
                                if (z2) {
                                    if (m50272(256)) {
                                        int i10 = C6985.f18184;
                                        interfaceC12628M16045 = new C16372();
                                    } else {
                                        interfaceC12628M16045 = C6985.m16044();
                                    }
                                    this.f70629 = interfaceC12628M16045;
                                    if (!z) {
                                        this.f70625 = m50259(interfaceC12628M16045);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 116:
                                return 9;
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                int iM50267 = m50265();
                                char c = (char) iM50267;
                                if (Character.isHighSurrogate(c)) {
                                    int i11 = this.f70638;
                                    if (m50264() == 92 && m50264() == 117) {
                                        char cM50265 = (char) m50265();
                                        if (Character.isLowSurrogate(cM50265)) {
                                            return Character.toCodePoint(c, cM50265);
                                        }
                                    }
                                    this.f70638 = i11;
                                }
                                return iM50267;
                            case 118:
                                if (z3) {
                                    return 11;
                                }
                                if (z2) {
                                    C7933 c7936 = C16057.f47257;
                                    C10477 c10477 = new C10477();
                                    this.f70629 = c10477;
                                    if (!z) {
                                        this.f70625 = m50259(c10477);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 119:
                                if (z2) {
                                    InterfaceC12628 interfaceC12628M16048 = m50272(256) ? C6985.m16047() : C6985.m16046();
                                    this.f70629 = interfaceC12628M16048;
                                    if (!z) {
                                        this.f70625 = m50259(interfaceC12628M16048);
                                        return -1;
                                    }
                                }
                                return -1;
                            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                int iM50268 = m50264();
                                if (C23434.m52139(iM50268, 32768)) {
                                    int iM50269 = m50264();
                                    if (C23434.m52139(iM50269, 32768)) {
                                        return C23434.m52141(iM50269) + (C23434.m52141(iM50268) * 16);
                                    }
                                } else if (iM50268 == 123 && C23434.m52139(m50279(), 32768)) {
                                    do {
                                        int iM502610 = m50264();
                                        if (!C23434.m52139(iM502610, 32768)) {
                                            if (iM502610 == 125) {
                                                return iM52141;
                                            }
                                            throw m50277("Unclosed hexadecimal escape sequence");
                                        }
                                        iM52141 = C23434.m52141(iM502610) + (iM52141 << 4);
                                    } while (iM52141 <= 1114111);
                                    throw m50277("Hexadecimal codepoint is too big");
                                }
                                throw m50277("Illegal hexadecimal escape sequence");
                            case 122:
                                if (!z) {
                                    if (z2) {
                                        this.f70625 = new C4581();
                                        return -1;
                                    }
                                    return -1;
                                }
                                throw m50277("Illegal/unsupported escape sequence");
                            default:
                                return iM50282;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private InterfaceC12628 m50276() {
        int i;
        InterfaceC12628 interfaceC12628M36322;
        InterfaceC12628 interfaceC12628M36323;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m50269(true));
        while (true) {
            C19035 c19035 = (C19035) C20013.m45383(arrayList, 1);
            int i2 = c19035.f56744;
            boolean z = false;
            if (!c19035.f56747) {
                if (i2 != 0) {
                    if (i2 != 38) {
                        if (i2 == 91) {
                            arrayList.add(m50269(true));
                        } else if (i2 == 93 && (!c19035.f56742.m36328() || c19035.f56748)) {
                            if (c19035.f56746) {
                                m50280();
                            }
                            if (c19035.f56748) {
                                interfaceC12628M36322 = c19035.f56742.m36328() ? c19035.f56743 : c19035.f56743.mo4820(c19035.f56742.m36322());
                                if (c19035.f56750) {
                                    interfaceC12628M36322 = interfaceC12628M36322.negate();
                                }
                            } else {
                                c19035.f56742.m36326(c19035.f56750);
                                interfaceC12628M36322 = c19035.f56742.m36322();
                            }
                            arrayList.remove(arrayList.size() - 1);
                            if (arrayList.isEmpty()) {
                                return interfaceC12628M36322;
                            }
                            C19035 c19036 = (C19035) C20013.m45383(arrayList, 1);
                            if (c19036.f56747) {
                                InterfaceC12628 interfaceC12628 = c19036.f56749;
                                if (interfaceC12628 != null) {
                                    interfaceC12628M36322 = interfaceC12628.mo4822(interfaceC12628M36322);
                                }
                                c19036.f56749 = interfaceC12628M36322;
                            } else {
                                c19036.f56742.m36325(interfaceC12628M36322);
                            }
                            c19036.f56744 = m50279();
                        }
                    } else if (m50280() == 38) {
                        c19035.f56744 = m50280();
                        if (c19035.f56748) {
                            interfaceC12628M36323 = c19035.f56742.m36328() ? c19035.f56743 : c19035.f56743.mo4820(c19035.f56742.m36322());
                        } else {
                            interfaceC12628M36323 = c19035.f56742.m36322();
                        }
                        c19035.f56745 = interfaceC12628M36323;
                        c19035.f56749 = null;
                        c19035.f56747 = true;
                    } else {
                        m50266();
                    }
                } else if (this.f70638 >= this.f70624) {
                    throw m50277("Unclosed character class");
                }
                C15979 c15979 = c19035.f56742;
                int iM50279 = m50279();
                if (iM50279 == 92) {
                    int[] iArr = this.f70636;
                    int i3 = this.f70638;
                    int i4 = i3 + 1;
                    this.f70638 = i4;
                    int i5 = iArr[i4];
                    if (i5 == 112 || i5 == 80) {
                        boolean z2 = i5 == 80;
                        if (m50280() != 123) {
                            m50266();
                            z = true;
                        }
                        c15979.m36325(m50258(z, z2));
                    } else {
                        boolean z3 = iArr[i3 + 2] == 45;
                        m50266();
                        iM50279 = m50250(true, true, z3);
                        if (iM50279 == -1) {
                            c15979.m36325(this.f70629);
                        }
                    }
                    c19035.f56744 = m50279();
                } else {
                    m50280();
                }
                if (iM50279 < 0) {
                    throw m50277("Unexpected character '" + ((char) iM50279) + "'");
                }
                if (m50279() != 45 || (i = this.f70636[this.f70638 + 1]) == 91 || i == 93) {
                    c15979.m36323(iM50279);
                } else {
                    m50280();
                    int iM502710 = m50279();
                    if (iM502710 == 92) {
                        iM502710 = m50250(true, false, true);
                    } else {
                        m50280();
                    }
                    if (iM502710 < iM50279) {
                        throw m50277("Illegal character range");
                    }
                    c15979.m36327(iM50279, iM502710);
                }
                c19035.f56744 = m50279();
            } else if (i2 == 93 || i2 == 38) {
                InterfaceC12628 interfaceC12629 = c19035.f56749;
                if (interfaceC12629 == null) {
                    throw m50277("Bad intersection syntax");
                }
                c19035.f56743 = c19035.f56745.mo4820(interfaceC12629);
                c19035.f56748 = true;
                c19035.f56747 = false;
                c19035.f56742 = new C15979(this.f70640);
            } else {
                if (i2 != 91) {
                    m50266();
                }
                arrayList.add(m50269(i2 == 91));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C19035 m50269(boolean z) {
        C19035 c19035 = new C19035(this.f70640, z);
        int iM50280 = m50280();
        c19035.f56744 = iM50280;
        if (iM50280 == 94 && this.f70636[this.f70638 - 1] == 91) {
            c19035.f56744 = m50280();
            c19035.f56750 = true;
        }
        return c19035;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX INFO: renamed from: ֫ */
    private InterfaceC12628 m50258(boolean z, boolean z2) {
        String str;
        InterfaceC12628 interfaceC12628M16045;
        m50280();
        if (z) {
            int i = this.f70636[this.f70638];
            str = !Character.isSupplementaryCodePoint(i) ? String.valueOf((char) i) : new String(this.f70636, this.f70638, 1);
            m50264();
        } else {
            int i2 = this.f70638;
            this.f70636[this.f70624] = 125;
            while (m50264() != 125) {
            }
            int[] iArr = this.f70636;
            int i3 = this.f70624;
            iArr[i3] = 0;
            int i4 = this.f70638;
            if (i4 > i3) {
                throw m50277("Unclosed character family");
            }
            if (i2 + 1 >= i4) {
                throw m50277("Empty character family");
            }
            str = new String(iArr, i2, (i4 - i2) - 1);
        }
        int iIndexOf = str.indexOf(61);
        InterfaceC12628 interfaceC12628M16039 = null;
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            String lowerCase = str.substring(0, iIndexOf).toLowerCase(Locale.ENGLISH);
            lowerCase.getClass();
            switch (lowerCase) {
                case "script":
                case "sc":
                    interfaceC12628M16039 = C6985.m16038(strSubstring);
                    break;
                case "gc":
                case "general_category":
                    interfaceC12628M16039 = C6985.m16043(strSubstring, m50272(2));
                    break;
                case "blk":
                case "block":
                    int i5 = C6985.f18184;
                    try {
                        final Character.UnicodeBlock unicodeBlockForName = Character.UnicodeBlock.forName(strSubstring);
                        interfaceC12628M16039 = new InterfaceC12628() { // from class: l.֡ᩴܽ
                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                                return C3910.m7732(this, interfaceC12628);
                            }

                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ۧ */
                            public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                                return C3910.m7733(this, interfaceC12628);
                            }

                            @Override // p067l.InterfaceC12628
                            /* JADX INFO: renamed from: ֫ */
                            public final boolean mo4821(int i6) {
                                return unicodeBlockForName == Character.UnicodeBlock.of(i6);
                            }

                            @Override // p067l.InterfaceC12628
                            public final C9667 negate() {
                                C7933 c7933 = C16057.f47257;
                                return C9667.m22548(this);
                            }
                        };
                        break;
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
                    break;
            }
            if (interfaceC12628M16039 == null) {
                throw m50277(C21459.m48622("Unknown Unicode property {name=<", lowerCase, ">, value=<", strSubstring, ">}"));
            }
        } else {
            if (str.startsWith("In")) {
                String strSubstring2 = str.substring(2);
                int i6 = C6985.f18184;
                try {
                    final Character.UnicodeBlock unicodeBlockForName2 = Character.UnicodeBlock.forName(strSubstring2);
                    interfaceC12628M16045 = new InterfaceC12628() { // from class: l.֡ᩴܽ
                        @Override // p067l.InterfaceC12628
                        /* JADX INFO: renamed from: ֫ */
                        public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
                            return C3910.m7732(this, interfaceC12628);
                        }

                        @Override // p067l.InterfaceC12628
                        /* JADX INFO: renamed from: ۧ */
                        public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
                            return C3910.m7733(this, interfaceC12628);
                        }

                        @Override // p067l.InterfaceC12628
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo4821(int i7) {
                            return unicodeBlockForName2 == Character.UnicodeBlock.of(i7);
                        }

                        @Override // p067l.InterfaceC12628
                        public final C9667 negate() {
                            C7933 c7933 = C16057.f47257;
                            return C9667.m22548(this);
                        }
                    };
                } catch (IllegalArgumentException unused2) {
                }
            } else if (str.startsWith("Is")) {
                String strSubstring3 = str.substring(2);
                interfaceC12628M16045 = C6985.m16045(strSubstring3, m50272(2));
                if (interfaceC12628M16045 == null) {
                    interfaceC12628M16045 = C6985.m16043(strSubstring3, m50272(2));
                }
                interfaceC12628M16039 = interfaceC12628M16045 == null ? C6985.m16038(strSubstring3) : interfaceC12628M16045;
            } else {
                interfaceC12628M16039 = m50272(256) ? C6985.m16039(str, m50272(2)) : null;
                if (interfaceC12628M16039 == null) {
                    interfaceC12628M16039 = C6985.m16043(str, m50272(2));
                }
            }
            if (interfaceC12628M16039 == null) {
                throw m50277(C6988.m16053("Unknown character property name {", str, C0249l.f1198d));
            }
        }
        if (!z2) {
            return interfaceC12628M16039;
        }
        this.f70643 = true;
        return interfaceC12628M16039.negate();
    }

    /* JADX INFO: renamed from: ֫ */
    private C24697 m50259(InterfaceC12628 interfaceC12628) {
        if (interfaceC12628 == null) {
            return null;
        }
        if (interfaceC12628 instanceof InterfaceC23218) {
            return new C21207((InterfaceC23218) interfaceC12628);
        }
        this.f70643 = true;
        return new C24697(interfaceC12628);
    }

    /* JADX INFO: renamed from: ֫ */
    private String m50251(int i) {
        StringBuilder sb = new StringBuilder();
        if (C23434.m52139(i, 768)) {
            do {
                sb.append((char) i);
                i = m50264();
            } while (C23434.m52139(i, Params.POLY_BYTES));
            if (i != 62) {
                throw m50277("named capturing group is missing trailing '>'");
            }
            return sb.toString();
        }
        throw m50277("capturing group name does not start with a Latin letter");
    }

    /* JADX INFO: renamed from: ֫ */
    private C7263 m50255(boolean z) {
        int i;
        int i2 = this.f70633;
        this.f70633 = i2 + 1;
        if (z) {
            i = 0;
        } else {
            i = this.f70634;
            this.f70634 = i + 1;
        }
        C7263 c7263 = new C7263(i2);
        C3239 c3239 = new C3239(i2, i);
        this.f70625 = c3239;
        c7263.f18933 = c3239;
        if (!z && i < 10) {
            this.f70639[i] = c7263;
        }
        return c7263;
    }

    /* JADX INFO: renamed from: ᩻ */
    private EnumC3791 m50283() {
        int iM50280 = m50280();
        if (iM50280 == 63) {
            m50280();
            return EnumC3791.LAZY;
        }
        if (iM50280 == 43) {
            m50280();
            return EnumC3791.POSSESSIVE;
        }
        return EnumC3791.GREEDY;
    }

    /* JADX INFO: renamed from: ֫ */
    private C7933 m50257(C7933 c7933, int i) {
        EnumC3791 enumC3791M50283 = m50283();
        if (enumC3791M50283 == EnumC3791.GREEDY) {
            if (c7933 instanceof C21207) {
                return new C6454((C21207) c7933, i);
            }
            if (c7933 instanceof C4442) {
                return new C5783(i);
            }
            if (c7933 instanceof C12706) {
                return new C18069(i);
            }
            if (c7933 instanceof C10616) {
                return new C17320(i);
            }
            if (c7933 instanceof C24697) {
                return new C8604((C24697) c7933, i);
            }
        }
        return new C22016(c7933, i, Integer.MAX_VALUE, enumC3791M50283);
    }

    /* JADX INFO: renamed from: ֫ */
    private C7933 m50256(C7933 c7933) {
        int iM50279 = m50279();
        int i = 0;
        if (iM50279 == 42) {
            return m50257(c7933, 0);
        }
        if (iM50279 == 43) {
            return m50257(c7933, 1);
        }
        if (iM50279 == 63) {
            return new C12509(c7933, m50283());
        }
        if (iM50279 != 123) {
            return c7933;
        }
        int iM50282 = m50282();
        if (!C23434.m52140(iM50282)) {
            throw m50277("Illegal repetition");
        }
        int i2 = 0;
        while (true) {
            long j = 10;
            long j2 = ((long) i2) * j;
            long j3 = (int) j2;
            if (j2 != j3) {
                throw new ArithmeticException();
            }
            long j4 = j3 + ((long) (iM50282 - 48));
            int i3 = (int) j4;
            if (j4 != i3) {
                throw new ArithmeticException();
            }
            try {
                int iM50264 = m50264();
                if (!C23434.m52140(iM50264)) {
                    if (iM50264 == 44) {
                        iM50264 = m50264();
                        if (iM50264 == 125) {
                            m50266();
                            return m50257(c7933, i3);
                        }
                        while (C23434.m52140(iM50264)) {
                            long j5 = ((long) i) * j;
                            long j6 = (int) j5;
                            if (j5 != j6) {
                                throw new ArithmeticException();
                            }
                            long j7 = j6 + ((long) (iM50264 - 48));
                            i = (int) j7;
                            if (j7 != i) {
                                throw new ArithmeticException();
                            }
                            iM50264 = m50264();
                        }
                    } else {
                        i = i3;
                    }
                    if (iM50264 != 125) {
                        throw m50277("Unclosed counted closure");
                    }
                    if (i < i3) {
                        throw m50277("Illegal repetition range");
                    }
                    m50266();
                    return (i3 == 0 && i == 1) ? new C12509(c7933, m50283()) : new C22016(c7933, i3, i, m50283());
                }
                i2 = i3;
                iM50282 = iM50264;
            } catch (ArithmeticException unused) {
                throw m50277("Illegal repetition range");
            }
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private int m50265() {
        int iM52141 = 0;
        for (int i = 0; i < 4; i++) {
            int iM50264 = m50264();
            if (!C23434.m52139(iM50264, 32768)) {
                throw m50277("Illegal Unicode escape sequence");
            }
            iM52141 = (iM52141 * 16) + C23434.m52141(iM50264);
        }
        return iM52141;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m50267(int i, String str) {
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

    /* JADX INFO: renamed from: ֫ */
    private C4462 m50254(int i, boolean z, int[] iArr) {
        int[] iArr2 = new int[i];
        int i2 = 0;
        if (!m50272(2)) {
            while (i2 < i) {
                iArr2[i2] = iArr[i2];
                i2++;
            }
            return z ? new C5803(iArr2) : new C11168(iArr2);
        }
        if (m50272(64)) {
            while (i2 < i) {
                iArr2[i2] = C5595.m12395(iArr[i2]);
                i2++;
            }
            return z ? new C20556(iArr2) : new C19885(iArr2);
        }
        while (i2 < i) {
            iArr2[i2] = C23434.m52142(iArr[i2]);
            i2++;
        }
        return z ? new C17201(iArr2) : new C10497(iArr2);
    }
}
