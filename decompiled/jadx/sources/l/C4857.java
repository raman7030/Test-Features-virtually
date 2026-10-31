package l;

import android.os.Build;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Locale;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.pqc.crypto.newhope.Params;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۙ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4857 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15353 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC21938 f15354;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC21938 f15355;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC21938 f15356;

    static {
        long[] jArr = new long[2];
        for (int i = 0; i < 128; i++) {
            if (C22165.m49802(i)) {
                int i2 = i >>> 6;
                jArr[i2] = jArr[i2] | (1 << i);
            }
        }
        f15354 = new C14881(jArr);
        f15356 = m14160(new C4152());
        f15355 = m14160(new C18969());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m14160(InterfaceC21938 interfaceC21938) {
        long[] jArr = new long[2];
        for (int i = 0; i < 128; i++) {
            if (interfaceC21938.mo2465(i)) {
                int i2 = i >>> 6;
                jArr[i2] = jArr[i2] | (1 << i);
            }
        }
        return new C14881(jArr);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14166() {
        return C14403.m34422(new C18948(), new C2741(), new C5542(), false);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14167(String str, boolean z) {
        str.getClass();
        int i = 1;
        switch (str) {
            case "XDIGIT":
                return new C20359().mo2466(new C1308());
            case "ALNUM":
                return C1622.m5503(new C18948(), new C20359());
            case "ALPHA":
                return new C18948();
            case "BLANK":
                return new C18263();
            case "CNTRL":
                return new C9091();
            case "DIGIT":
                return new C20359();
            case "GRAPH":
                return new C23907();
            case "LOWER":
                if (!z) {
                    return new C2035();
                }
                return C14403.m34422(new C2035(), new C15439(), new C15586(i), false);
            case "PRINT":
                InterfaceC10795 interfaceC10795M5503 = C1622.m5503(new C23907(), new C18263());
                C9091 c9091 = new C9091();
                C5855 c5855 = C14403.f44164;
                return interfaceC10795M5503.mo2464(C7679.m20568(c9091));
            case "PUNCT":
                return new C21086();
            case "SPACE":
                return new C14734();
            case "UPPER":
                if (!z) {
                    return new C15439();
                }
                return C14403.m34422(new C15439(), new C2035(), new C15586(i), false);
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14164(String str, boolean z) {
        InterfaceC10795 c2035;
        InterfaceC10795 c15439;
        C15586 c15586;
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int i = 1;
        byte b = -1;
        switch (upperCase.hashCode()) {
            case -2052843482:
                if (upperCase.equals("LETTER")) {
                    b = 0;
                }
                break;
            case -2022879855:
                if (upperCase.equals("LOWERCASE")) {
                    b = 1;
                }
                break;
            case -2012114231:
                if (upperCase.equals("HEX_DIGIT")) {
                    b = 2;
                }
                break;
            case -1800911568:
                if (upperCase.equals("WHITE_SPACE")) {
                    b = 3;
                }
                break;
            case -1725364189:
                if (upperCase.equals("IDEOGRAPHIC")) {
                    b = 4;
                }
                break;
            case -1284848974:
                if (upperCase.equals("UPPERCASE")) {
                    b = 5;
                }
                break;
            case -1100490541:
                if (upperCase.equals("JOINCONTROL")) {
                    b = 6;
                }
                break;
            case -1066768688:
                if (upperCase.equals("EMOJI_MODIFIER")) {
                    b = 7;
                }
                break;
            case -725414195:
                if (upperCase.equals("ALPHABETIC")) {
                    b = 8;
                }
                break;
            case -252338886:
                if (upperCase.equals("PUNCTUATION")) {
                    b = 9;
                }
                break;
            case -238378200:
                if (upperCase.equals("JOIN_CONTROL")) {
                    b = 10;
                }
                break;
            case 2670346:
                if (upperCase.equals("WORD")) {
                    b = 11;
                }
                break;
            case 66095142:
                if (upperCase.equals("EMOJI")) {
                    b = 12;
                }
                break;
            case 325947122:
                if (upperCase.equals("HEXDIGIT")) {
                    b = cb.k;
                }
                break;
            case 412745166:
                if (upperCase.equals("ASSIGNED")) {
                    b = cb.f77931l;
                }
                break;
            case 651280744:
                if (upperCase.equals("TITLECASE")) {
                    b = 15;
                }
                break;
            case 762004093:
                if (upperCase.equals("WHITESPACE")) {
                    b = 16;
                }
                break;
            case 1017360423:
                if (upperCase.equals("NONCHARACTERCODEPOINT")) {
                    b = 17;
                }
                break;
            case 1155928513:
                if (upperCase.equals("NONCHARACTER_CODE_POINT")) {
                    b = 18;
                }
                break;
            case 1669525821:
                if (upperCase.equals("CONTROL")) {
                    b = 19;
                }
                break;
            case 1752109792:
                if (upperCase.equals("EMOJI_MODIFIER_BASE")) {
                    b = 20;
                }
                break;
            case 1791047684:
                if (upperCase.equals("EMOJI_COMPONENT")) {
                    b = 21;
                }
                break;
            case 1890113289:
                if (upperCase.equals("EXTENDED_PICTOGRAPHIC")) {
                    b = 22;
                }
                break;
            case 1919006355:
                if (upperCase.equals("EMOJI_PRESENTATION")) {
                    b = 23;
                }
                break;
        }
        InterfaceC10795 c15418 = null;
        switch (b) {
            case 0:
                c15418 = new C15418();
                break;
            case 1:
                if (!z) {
                    c15418 = new C2035();
                } else {
                    c2035 = new C2035();
                    c15439 = new C15439();
                    c15586 = new C15586(i);
                    c15418 = C14403.m34422(c2035, c15439, c15586, false);
                }
                break;
            case 2:
            case 13:
                c15418 = new C20359().mo2466(new C1308());
                break;
            case 3:
            case 16:
                c15418 = new C14734();
                break;
            case 4:
                c15418 = new C7658();
                break;
            case 5:
                if (!z) {
                    c15418 = new C15439();
                } else {
                    c2035 = new C15439();
                    c15439 = new C2035();
                    c15586 = new C15586(i);
                    c15418 = C14403.m34422(c2035, c15439, c15586, false);
                }
                break;
            case 6:
            case 10:
                c15418 = new C5542();
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 36) {
                    c15418 = new C17557();
                }
                break;
            case 8:
                c15418 = new C18948();
                break;
            case 9:
                c15418 = new C21086();
                break;
            case 11:
                c15418 = m14166();
                break;
            case 12:
                if (Build.VERSION.SDK_INT >= 36) {
                    c15418 = new C16145();
                }
                break;
            case 14:
                c15418 = new C20380();
                break;
            case 15:
                c15418 = !z ? new C15586(i) : C14403.m34422(new C15586(i), new C2035(), new C15439(), false);
                break;
            case 17:
            case 18:
                c15418 = new C14175(i);
                break;
            case 19:
                c15418 = new C9091();
                break;
            case 20:
                if (Build.VERSION.SDK_INT >= 36) {
                    c15418 = new C9797();
                }
                break;
            case 21:
                if (Build.VERSION.SDK_INT >= 36) {
                    c15418 = new C19654();
                }
                break;
            case 22:
                c15418 = Build.VERSION.SDK_INT >= 36 ? new C22496() : new C21791();
                break;
            case 23:
                if (Build.VERSION.SDK_INT >= 36) {
                    c15418 = new C6974();
                }
                break;
        }
        return c15418 != null ? c15418 : m14167(upperCase, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14158(String str, boolean z) {
        return m14167(str.toUpperCase(Locale.ENGLISH), z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14157(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                final Character.UnicodeScript unicodeScriptForName = Character.UnicodeScript.forName(str);
                return new InterfaceC10795() { // from class: l.֨᩵ܽ
                    @Override // l.InterfaceC10795
                    /* JADX INFO: renamed from: ֫ */
                    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
                        return C1622.m5502(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i) {
                        return C4857.m14161(unicodeScriptForName, i);
                    }

                    @Override // l.InterfaceC10795
                    /* JADX INFO: renamed from: ۧ */
                    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
                        return C1622.m5503(this, interfaceC10795);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            }
            final EnumC7536 enumC7536M20221 = EnumC7536.m20221(str);
            return new InterfaceC10795() { // from class: l.۠᩵ܽ
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
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo2465(int i) {
                    return enumC7536M20221 == EnumC7536.m20220(i);
                }

                @Override // l.InterfaceC10795
                public final C7679 negate() {
                    C5855 c5855 = C14403.f44164;
                    return C7679.m20568(this);
                }
            };
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m14161(Character.UnicodeScript unicodeScript, int i) {
        return unicodeScript == Character.UnicodeScript.of(i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m14162(String str, boolean z) {
        str.getClass();
        final int i = 65;
        final int i2 = 64;
        final int i3 = 57;
        final int i4 = 48;
        final int i5 = 16;
        final int i6 = 1;
        final int i7 = 0;
        final int i8 = 32;
        final int i9 = 14;
        byte b = -1;
        switch (str.hashCode()) {
            case -1709572171:
                if (str.equals("XDigit")) {
                    b = 0;
                }
                break;
            case -1447886457:
                if (str.equals("javaDefined")) {
                    b = 1;
                }
                break;
            case -1166681342:
                if (str.equals("javaLetterOrDigit")) {
                    b = 2;
                }
                break;
            case -1155899042:
                if (str.equals("javaUnicodeIdentifierStart")) {
                    b = 3;
                }
                break;
            case -925624088:
                if (str.equals("javaLetter")) {
                    b = 4;
                }
                break;
            case -868424661:
                if (str.equals("javaDigit")) {
                    b = 5;
                }
                break;
            case -705961562:
                if (str.equals("javaTitleCase")) {
                    b = 6;
                }
                break;
            case -453036169:
                if (str.equals("javaUnicodeIdentifierPart")) {
                    b = 7;
                }
                break;
            case 67:
                if (str.equals("C")) {
                    b = 8;
                }
                break;
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                if (str.equals("L")) {
                    b = 9;
                }
                break;
            case 77:
                if (str.equals("M")) {
                    b = 10;
                }
                break;
            case 78:
                if (str.equals("N")) {
                    b = 11;
                }
                break;
            case 80:
                if (str.equals("P")) {
                    b = 12;
                }
                break;
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                if (str.equals("S")) {
                    b = cb.k;
                }
                break;
            case 90:
                if (str.equals("Z")) {
                    b = cb.f77931l;
                }
                break;
            case 2176:
                if (str.equals("Cc")) {
                    b = 15;
                }
                break;
            case 2179:
                if (str.equals("Cf")) {
                    b = 16;
                }
                break;
            case 2187:
                if (str.equals("Cn")) {
                    b = 17;
                }
                break;
            case 2188:
                if (str.equals("Co")) {
                    b = 18;
                }
                break;
            case 2192:
                if (str.equals("Cs")) {
                    b = 19;
                }
                break;
            case 2405:
                if (str.equals("L1")) {
                    b = 20;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b = 21;
                }
                break;
            case 2424:
                if (str.equals("LD")) {
                    b = 22;
                }
                break;
            case 2464:
                if (str.equals("Ll")) {
                    b = 23;
                }
                break;
            case 2465:
                if (str.equals("Lm")) {
                    b = 24;
                }
                break;
            case 2467:
                if (str.equals("Lo")) {
                    b = 25;
                }
                break;
            case 2472:
                if (str.equals("Lt")) {
                    b = 26;
                }
                break;
            case 2473:
                if (str.equals("Lu")) {
                    b = 27;
                }
                break;
            case 2486:
                if (str.equals("Mc")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                }
                break;
            case 2488:
                if (str.equals("Me")) {
                    b = 29;
                }
                break;
            case 2497:
                if (str.equals("Mn")) {
                    b = 30;
                }
                break;
            case 2518:
                if (str.equals("Nd")) {
                    b = bo.j;
                }
                break;
            case 2526:
                if (str.equals("Nl")) {
                    b = UTF8.S_CS3;
                }
                break;
            case 2529:
                if (str.equals("No")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                }
                break;
            case 2579:
                if (str.equals("Pc")) {
                    b = 34;
                }
                break;
            case 2580:
                if (str.equals("Pd")) {
                    b = 35;
                }
                break;
            case 2581:
                if (str.equals("Pe")) {
                    b = 36;
                }
                break;
            case 2582:
                if (str.equals("Pf")) {
                    b = 37;
                }
                break;
            case 2585:
                if (str.equals("Pi")) {
                    b = 38;
                }
                break;
            case 2591:
                if (str.equals("Po")) {
                    b = 39;
                }
                break;
            case 2595:
                if (str.equals("Ps")) {
                    b = 40;
                }
                break;
            case 2672:
                if (str.equals("Sc")) {
                    b = 41;
                }
                break;
            case 2680:
                if (str.equals("Sk")) {
                    b = 42;
                }
                break;
            case 2682:
                if (str.equals("Sm")) {
                    b = 43;
                }
                break;
            case 2684:
                if (str.equals("So")) {
                    b = 44;
                }
                break;
            case 2898:
                if (str.equals("Zl")) {
                    b = 45;
                }
                break;
            case 2902:
                if (str.equals("Zp")) {
                    b = 46;
                }
                break;
            case 2905:
                if (str.equals("Zs")) {
                    b = 47;
                }
                break;
            case 96673:
                if (str.equals(ProviderConfigurationPermission.ALL_STR)) {
                    b = UTF8.S_P3A;
                }
                break;
            case 62568241:
                if (str.equals("ASCII")) {
                    b = 49;
                }
                break;
            case 63355739:
                if (str.equals("Alnum")) {
                    b = 50;
                }
                break;
            case 63357246:
                if (str.equals("Alpha")) {
                    b = 51;
                }
                break;
            case 64266548:
                if (str.equals("Blank")) {
                    b = 52;
                }
                break;
            case 65268035:
                if (str.equals("Cntrl")) {
                    b = 53;
                }
                break;
            case 66029837:
                if (str.equals("Digit")) {
                    b = 54;
                }
                break;
            case 69062958:
                if (str.equals("Graph")) {
                    b = 55;
                }
                break;
            case 73612001:
                if (str.equals("Lower")) {
                    b = 56;
                }
                break;
            case 77382285:
                if (str.equals("Print")) {
                    b = 57;
                }
                break;
            case 77476122:
                if (str.equals("Punct")) {
                    b = 58;
                }
                break;
            case 80085222:
                if (str.equals("Space")) {
                    b = 59;
                }
                break;
            case 81946754:
                if (str.equals("Upper")) {
                    b = 60;
                }
                break;
            case 179299983:
                if (str.equals("javaAlphabetic")) {
                    b = Base32Encoder.DEFAULT_PADDING;
                }
                break;
            case 379124898:
                if (str.equals("javaIdentifierIgnorable")) {
                    b = 62;
                }
                break;
            case 434193717:
                if (str.equals("javaJavaIdentifierStart")) {
                    b = 63;
                }
                break;
            case 472535264:
                if (str.equals("javaMirrored")) {
                    b = 64;
                }
                break;
            case 475906426:
                if (str.equals("javaSpaceChar")) {
                    b = 65;
                }
                break;
            case 550971585:
                if (str.equals("javaIdeographic")) {
                    b = 66;
                }
                break;
            case 914845135:
                if (str.equals("javaLowerCase")) {
                    b = 67;
                }
                break;
            case 1100152026:
                if (str.equals("javaISOControl")) {
                    b = 68;
                }
                break;
            case 1652876016:
                if (str.equals("javaUpperCase")) {
                    b = 69;
                }
                break;
            case 1666718271:
                if (str.equals("javaWhitespace")) {
                    b = 70;
                }
                break;
            case 1953561792:
                if (str.equals("javaJavaIdentifierPart")) {
                    b = 71;
                }
                break;
        }
        final int i10 = 32768;
        final int i11 = 16384;
        final int i12 = 8192;
        final int i13 = 4096;
        final int i14 = 2048;
        final int i15 = 768;
        switch (b) {
            case 0:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i16) {
                        return i16 < 128 && C22165.m49801(i16, i10);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 1:
                return new C16851();
            case 2:
                return new C21770();
            case 3:
                return new C3425();
            case 4:
                return new C15418();
            case 5:
                return new C20359();
            case 6:
                return z ? new C11208() : new C15586(i6);
            case 7:
                return new C13302();
            case 8:
                final int i16 = 884737;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i17) {
                        return ((1 << C2164.m7146(i17)) & i16) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 9:
                final int i17 = 62;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i18) {
                        return ((1 << C2164.m7146(i18)) & i17) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 10:
                final int i18 = 448;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i19) {
                        return ((1 << C2164.m7146(i19)) & i18) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 11:
                final int i19 = 3584;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i19) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 12:
                final int i20 = 1643118592;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i20) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 13:
                final int i21 = 503316480;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i21) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 14:
                final int i22 = UMModuleRegister.SHARE_EVENT_VALUE_HIGH;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i22) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 15:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i10) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 16:
                final int i23 = 65536;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i23) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 17:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i6) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 18:
                final int i24 = 262144;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i24) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 19:
                final int i25 = 524288;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i25) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 20:
                final int i26 = 255;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i27) {
                        return i7 <= i27 && i27 <= i26;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 21:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i9) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 22:
                final int i27 = 574;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i27) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 23:
                final int i28 = z ? 14 : 4;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i28) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 24:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i5) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 25:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i8) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 26:
                final int i29 = z ? 14 : 8;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i29) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 27:
                final int i30 = z ? 14 : 2;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i30) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 28:
                final int i31 = 256;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i31) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 29:
                final int i32 = 128;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i32) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 30:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i2) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 31:
                final int i33 = 512;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i33) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 32:
                final int i34 = 1024;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i34) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 33:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i14) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 34:
                final int i35 = 8388608;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i35) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 35:
                final int i36 = 1048576;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i36) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 36:
                final int i37 = 4194304;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i37) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 37:
                final int i38 = 1073741824;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i38) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 38:
                final int i39 = 536870912;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i39) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 39:
                final int i40 = 16777216;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i40) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 40:
                final int i41 = 2097152;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i41) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 41:
                final int i42 = 67108864;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i42) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 42:
                final int i43 = 134217728;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i43) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 43:
                final int i44 = 33554432;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i44) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 44:
                final int i45 = 268435456;
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i45) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i12) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 46:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i11) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 47:
                return new InterfaceC10795() { // from class: l.᩵᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return ((1 << C2164.m7146(i110)) & i13) != 0;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5855 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 48:
                C5855 c5855 = C14403.f44164;
                return new C14175(i7);
            case 49:
                final int i46 = 127;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i210) {
                        return i7 <= i210 && i210 <= i46;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 50:
                final int i47 = Params.POLY_BYTES;
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return i110 < 128 && C22165.m49801(i110, i47);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 51:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return i110 < 128 && C22165.m49801(i110, i15);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 52:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return i110 < 128 && C22165.m49801(i110, i11);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 53:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return i110 < 128 && C22165.m49801(i110, i12);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i210) {
                        return i4 <= i210 && i210 <= i3;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                final int i48 = 5888;
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return i110 < 128 && C22165.m49801(i110, i48);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 56:
                if (z) {
                    return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo2465(int i110) {
                            return i110 < 128 && C22165.m49801(i110, i15);
                        }

                        @Override // l.InterfaceC10795
                        public final C7679 negate() {
                            C5855 c5856 = C14403.f44164;
                            return C7679.m20568(this);
                        }
                    };
                }
                final int i49 = 97;
                final int i50 = 122;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i210) {
                        return i49 <= i210 && i210 <= i50;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 57:
                final int i51 = 126;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i210) {
                        return i8 <= i210 && i210 <= i51;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return i110 < 128 && C22165.m49801(i110, i13);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i110) {
                        return i110 < 128 && C22165.m49801(i110, i14);
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 60:
                if (z) {
                    return new InterfaceC21938() { // from class: l.ۚ᩵ܽ
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
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo2465(int i110) {
                            return i110 < 128 && C22165.m49801(i110, i15);
                        }

                        @Override // l.InterfaceC10795
                        public final C7679 negate() {
                            C5855 c5856 = C14403.f44164;
                            return C7679.m20568(this);
                        }
                    };
                }
                final int i52 = 90;
                return new InterfaceC21938() { // from class: l.֡᩵ܽ
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
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo2465(int i210) {
                        return i <= i210 && i210 <= i52;
                    }

                    @Override // l.InterfaceC10795
                    public final C7679 negate() {
                        C5855 c5856 = C14403.f44164;
                        return C7679.m20568(this);
                    }
                };
            case 61:
                return new C18948();
            case 62:
                return new C12597();
            case 63:
                return new C22475();
            case 64:
                return new C23180();
            case 65:
                return new C10481();
            case 66:
                return new C7658();
            case 67:
                return z ? new C8364() : new C2035();
            case 68:
                return new C11892();
            case 69:
                return z ? new C14007() : new C15439();
            case 70:
                return new C6247();
            case 71:
                return new C4836();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m14159() {
        return f15354;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m14165() {
        return f15356;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21938 m14163() {
        return f15355;
    }
}
