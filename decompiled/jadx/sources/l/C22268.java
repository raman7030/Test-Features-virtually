package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.TreeSet;
import java.util.regex.PatternSyntaxException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71UU */
/* JADX INFO: loaded from: classes.dex */
public final class C22268 {

    /* JADX INFO: renamed from: ۫ܰۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f72243 = {8793, 20032, 20070, 18185, 23022, 16865, 23596, -19214, 32084, 21821, 21973, 19179, -22791, -20979, 27494, -22895, 31189, 32628, 23633, 30161, -16401, -23447, -17153, 21919, 27316, 9344, 9349, 9351, 9353, 9364, 9344, 9349, 9351, 9351, 9364, -20374, -20168, 22457, -17902, -19795, -18288, 838, 9412, 16984, 19380, 18544, -17442, 16587, -19093, -18210, 30483, 19935, 9347, 9345, 9354, 9345, 9366, 9349, 9360, 9345, 9403, 9353, 9349, 9364, 9364, 9357, 9354, 9347, 9403, 9346, 9357, 9352, 9345, 9344, 9349, 9351, 9349, 9355, 18640, 23418, -21562, 17905, 30811, 19446, -22936, -23757, -22173, 6006, 30389, 30394, 30399, 30390, 30388, 30390, 30397, 30390, 30369, 30386, 30375, 30390, 30366, 30386, 30371, 30371, 30394, 30397, 30388, 30357, 30394, 30399, 30390, 30369, 30390, 30384, 30396, 30373, 30390, 30369, 30378, 30366, 30396, 30391, 30390, 30398, 30386, 30375, 30384, 30395, 30339, 30386, 30375, 30375, 30390, 30369, 30397, 30384, 30399, 30386, 30368, 30368, 30339, 30386, 30375, 30375, 30390, 30369, 30397, 30392, 30390, 30390, 30371, 30354, 30371, 30392, 30336, 30394, 30388, 30353, 30399, 30396, 30384, 30392};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public TreeSet f72244;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f72245;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16560 f72246;

    public C22268(final AbstractC15440 abstractC15440, final C16560 c16560, final String str) {
        C10235 c10235;
        C19258 c19258;
        int iM2566;
        int i;
        int i2;
        short[] sArr;
        int i3;
        C2978 c2978;
        TextView textView;
        int iM6981;
        int i4;
        int i5;
        View view;
        C19258 c19259;
        TextView textView2;
        ViewOnClickListenerC14054 viewOnClickListenerC14054;
        short[] sArr2;
        short[] sArr3;
        short[] sArr4;
        int i6;
        C2978 c2979;
        int i7;
        View view2;
        C19258 c192510;
        String str2;
        TextView textView3;
        ViewOnClickListenerC14054 viewOnClickListenerC14055;
        TextView textView4;
        short[] sArr5;
        short[] sArr6;
        int i8;
        int i9;
        short[] sArr7;
        int i10;
        C2978 c29710;
        int i11;
        C19258 c192511;
        short[] sArr8;
        int i12;
        C19258 c192512;
        TextView textView5;
        ViewOnClickListenerC14054 viewOnClickListenerC14056;
        short[] sArr9;
        int i13;
        short[] sArr10;
        short[] sArr11;
        int i14;
        C2978 c29711;
        int i15;
        View view3;
        String str3;
        int iM2567;
        int i16;
        int i17;
        C10235 c10236;
        int iM2568;
        int i18;
        int i19;
        ViewOnClickListenerC14054 viewOnClickListenerC14057;
        int iM6982;
        int i20;
        int i21;
        final C10235 c10237 = null;
        int i22 = -494296262;
        int i23 = C3683.f11629;
        int i24 = C4616.f14690;
        short s = f72243[0];
        int i25 = ((s * s) + 399640081) - (39982 * s) >= 0 ? 9444 : 53066;
        int iM6983 = (i23 - C2105.m6981("ܳۖ")) * 49;
        int i26 = ((iM6983 ^ i24) * (-6691)) ^ 1287882528;
        int i27 = iM6983 ^ (-178761234);
        TextView textView6 = null;
        C19258 c19258M2130 = null;
        String strM9934 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        boolean zM3400 = false;
        int i28 = 0;
        int iM6984 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        TextView textView7 = null;
        String str4 = null;
        ViewOnClickListenerC14054 viewOnClickListenerC14058 = null;
        Object obj = null;
        final C2978 c29712 = null;
        TextView textView8 = null;
        View viewM3507 = null;
        final C2978 c29713 = null;
        String strM24614 = null;
        String str5 = null;
        final C2978 c29714 = null;
        int i34 = i26;
        final C10235 c10238 = null;
        View viewM9259 = null;
        final View view4 = null;
        String strM1959 = null;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = null;
        while (true) {
            i22 = i27 ^ (i34 & (((i22 ^ i24) * (-12779)) >> 31));
            switch (i22) {
                case -2136300737:
                case 186011854:
                    C2978 c29715 = c29712;
                    TextView textView9 = textView6;
                    strM1959 = strM1959;
                    textView = textView9;
                    TextView textView10 = (TextView) C1005.m3507(viewM9259, i28 ^ 2098827874);
                    View viewM28028 = C11340.m28028(viewM9259, C2105.m6981(C11340.m28025(f72243, 16, 3, i25)) ^ 2120442996);
                    int iM6985 = (C2105.m6981("ۗۛ") ^ i23) * (-71);
                    sArr14 = sArr14;
                    i33 = i33;
                    i32 = i32;
                    sArr17 = sArr17;
                    c29713 = c29713;
                    c19258M2130 = c19258M2130;
                    textView8 = textView8;
                    sArr16 = sArr16;
                    sArr15 = sArr15;
                    i31 = i31;
                    viewOnClickListenerC14058 = viewOnClickListenerC14058;
                    str5 = str5;
                    view4 = viewM28028;
                    i27 = iM6985 ^ (-2066971668);
                    i34 = ((iM6985 ^ i24) * 15811) ^ 1581949471;
                    c29712 = c29715;
                    textView7 = textView10;
                    String str6 = strM1959;
                    textView6 = textView;
                    strM1959 = str6;
                    break;
                case -2028871024:
                case 1928518771:
                    c10236 = c10237;
                    C1005.m3499(new Thread(new Runnable() { // from class: l.᩵ۨܽ
                        {
                            int i35 = 405870028;
                            int i36 = C0422.f1886;
                            int i37 = AbstractC2021.f6743;
                            int iM6986 = (C2105.m6981("ۙ۠") + i36) * (-93);
                            int i38 = ((iM6986 ^ i37) * 6123) ^ (-1991641608);
                            int i39 = -884351342;
                            while (true) {
                                i35 = ((((i35 ^ i37) * (-5555)) >> 31) & i38) ^ (iM6986 ^ i39);
                                switch (i35) {
                                    case -2048742941:
                                    case -1516616200:
                                        if (C0422.m1963()) {
                                            iM6986 = (i37 - C0630.m2566("᩻ۢ")) * (-69);
                                            i38 = ((iM6986 ^ i36) * 25823) ^ 454713865;
                                            i39 = -517598949;
                                        } else {
                                            iM6986 = C0630.m2566("ۤۤ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * (-9725)) ^ 1630345318;
                                            i39 = -899994063;
                                        }
                                        break;
                                    case -2028106584:
                                    case 1676974381:
                                        if (C0237.f1507 != 0) {
                                            iM6986 = (i36 - C2105.m6981("ܺᩳ")) * (-15);
                                            i38 = ((iM6986 ^ i37) * 19793) ^ 272526126;
                                            i39 = -1456356459;
                                        } else {
                                            iM6986 = C0630.m2566("ۤۛ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * 24895) ^ 85974714;
                                            i39 = 703984360;
                                        }
                                        break;
                                    case -1921155148:
                                    case 1100821487:
                                        if (C3683.f11629 >= 0) {
                                            iM6986 = (C0630.m2566("ۧܽ") + i37) * 71;
                                            i38 = ((iM6986 ^ i36) * (-1835)) ^ (-251944731);
                                            i39 = 1233731484;
                                        } else {
                                            iM6986 = (C0630.m2566("ۙۨ") + i36) * (-67);
                                            i38 = ((iM6986 ^ i37) * 10961) ^ (-298741606);
                                            i39 = 698199449;
                                        }
                                        break;
                                    case -1865447985:
                                    case 808263636:
                                        if (C3245.f10203 <= 0) {
                                            iM6986 = C0630.m2566("᩺ᩴ") ^ i37;
                                            i38 = ((iM6986 ^ i36) * (-2041)) ^ (-536573798);
                                            i39 = 1670208190;
                                        } else {
                                            iM6986 = C2105.m6981("ᩳ᩹") ^ i37;
                                            i38 = ((iM6986 ^ i36) * 21833) ^ (-2105273727);
                                            i39 = 895310024;
                                        }
                                        break;
                                    case -1654129560:
                                    case 734688987:
                                        C11340.m28031();
                                        C2105.m6982();
                                        throw new RuntimeException();
                                    case -1409962931:
                                    case 1170243407:
                                        if (C3019.f9544 >= 0) {
                                            iM6986 = (C0630.m2566("ۧܽ") + i37) * 71;
                                            i38 = ((iM6986 ^ i36) * (-1835)) ^ (-251944731);
                                            i39 = 1233731484;
                                        } else {
                                            iM6986 = (i37 - C2105.m6981("ۤ۫")) * (-9);
                                            i38 = ((iM6986 ^ i36) * (-14789)) ^ (-730798414);
                                            i39 = 862412434;
                                        }
                                        break;
                                    case -1334577783:
                                    case 1780884918:
                                        if (C0050.f910 >= 0) {
                                            iM6986 = (i36 - C2105.m6981("ܺᩳ")) * (-15);
                                            i38 = ((iM6986 ^ i37) * 19793) ^ 272526126;
                                            i39 = -1456356459;
                                        } else {
                                            iM6986 = (C0630.m2566("᩻ۜ") ^ i36) * 41;
                                            i38 = ((iM6986 ^ i37) * (-23725)) ^ 244569378;
                                            i39 = -1765955813;
                                        }
                                        break;
                                    case -1052164800:
                                    case 1804005851:
                                        return;
                                    case -1024934704:
                                    case 1073879251:
                                        C2958.m9034();
                                        if (C0237.f1507 == 0) {
                                            iM6986 = C0630.m2566("ۤۤ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * (-9725)) ^ 1630345318;
                                            i39 = -899994063;
                                        } else {
                                            iM6986 = C0630.m2566("᩺ᩴ") ^ i37;
                                            i38 = ((iM6986 ^ i36) * (-2041)) ^ (-536573798);
                                            i39 = 1670208190;
                                        }
                                        break;
                                    case -948966474:
                                    case -505784957:
                                        if (C0237.f1507 != 0) {
                                            iM6986 = C0630.m2566("ۤۤ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * (-9725)) ^ 1630345318;
                                            i39 = -899994063;
                                        } else {
                                            iM6986 = C0630.m2566("ۛۖ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * (-30279)) ^ (-367606070);
                                            i39 = -2010899051;
                                        }
                                        break;
                                    case -811254256:
                                    case 1403630825:
                                        if (C0630.f2410 <= 0) {
                                            iM6986 = C0630.m2566("᩺ᩴ") ^ i37;
                                            i38 = ((iM6986 ^ i36) * (-2041)) ^ (-536573798);
                                            i39 = 1670208190;
                                        } else {
                                            iM6986 = C2105.m6981("ۛ᩷") ^ i37;
                                            i38 = ((iM6986 ^ i36) * (-19121)) ^ (-894735651);
                                            i39 = -421948170;
                                        }
                                        break;
                                    case -772894392:
                                    case 594805661:
                                        if (C22628.m50615() != 0) {
                                            iM6986 = (C0630.m2566("ۧܽ") + i37) * 71;
                                            i38 = ((iM6986 ^ i36) * (-1835)) ^ (-251944731);
                                            i39 = 1233731484;
                                        } else {
                                            iM6986 = C0630.m2566("᩺ᩴ") ^ i37;
                                            i38 = ((iM6986 ^ i36) * (-2041)) ^ (-536573798);
                                            i39 = 1670208190;
                                        }
                                        break;
                                    case -760172112:
                                    case -234926640:
                                        if (C3537.f11231 >= 0) {
                                            iM6986 = C0630.m2566("᩺ᩴ") ^ i37;
                                            i38 = ((iM6986 ^ i36) * (-2041)) ^ (-536573798);
                                            i39 = 1670208190;
                                        } else {
                                            iM6986 = C0630.m2566("۠ۧ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * 5855) ^ 1958042472;
                                            i39 = 857860573;
                                        }
                                        break;
                                    case -579751313:
                                    case 824077726:
                                        if (C4616.f14690 <= 0) {
                                            iM6986 = C0630.m2566("ۤۤ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * (-9725)) ^ 1630345318;
                                            i39 = -899994063;
                                        } else {
                                            iM6986 = C0630.m2566("ۧ᩶") ^ i37;
                                            i38 = ((iM6986 ^ i36) * (-25291)) ^ 873577034;
                                            i39 = -606666664;
                                        }
                                        break;
                                    case -463159429:
                                    case 963696106:
                                        if (C7811.f24123 >= 0) {
                                            iM6986 = C0630.m2566("۠ۧ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * 5855) ^ 1958042472;
                                            i39 = 857860573;
                                        } else {
                                            iM6986 = C0630.m2566("ᩴܰ") ^ i36;
                                            i38 = ((iM6986 ^ i37) * (-22235)) ^ (-1392193427);
                                            i39 = -1116586555;
                                        }
                                        break;
                                    default:
                                        C0382.m1848();
                                        C4075.m12263();
                                        iM6986 = C0630.m2566("۠ۧ") ^ i36;
                                        i38 = ((iM6986 ^ i37) * 5855) ^ 1958042472;
                                        i39 = 857860573;
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:23:0x0059  */
                        /* JADX WARN: Code duplicated, block: B:58:0x018e  */
                        /* JADX WARN: Code duplicated, block: B:70:0x01f7  */
                        /* JADX WARN: Code duplicated, block: B:74:0x0225  */
                        /* JADX WARN: Code duplicated, block: B:78:0x0255  */
                        /* JADX WARN: Code duplicated, block: B:82:0x0286  */
                        /* JADX WARN: Code duplicated, block: B:90:0x02cd A[PHI: r0
                          0x02cd: PHI (r0v3 l.ܶ᩵ܿ) = (r0v2 l.ܶ᩵ܿ), (r0v1 l.ܶ᩵ܿ), (r0v1 l.ܶ᩵ܿ), (r0v1 l.ܶ᩵ܿ) binds: [B:89:0x02cb, B:85:0x02b1, B:15:0x0046, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            int iM6986;
                            int i35;
                            AbstractC15440 abstractC15441 = null;
                            C2978 c29716 = null;
                            C3545 c3545M1324 = null;
                            Throwable th = null;
                            Object th2 = null;
                            int i36 = -67673587;
                            int i37 = C1294.f4556;
                            int i38 = C3432.f10845;
                            int iM2569 = (i37 - C0630.m2566("᩻ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            int i39 = ((iM2569 ^ i38) * (-28593)) ^ (-1759209345);
                            int i40 = iM2569 ^ (-1624954975);
                            C18090 c18090 = null;
                            while (true) {
                                i36 = ((((i36 ^ i38) * (-9565)) >> 31) & i39) ^ i40;
                                switch (i36) {
                                    case -2071631812:
                                    case -1097856438:
                                        try {
                                            C2520.m8028(c18090);
                                            iM6986 = C2105.m6981("ۜۡ") ^ i37;
                                            i39 = ((iM6986 ^ i38) * (-14173)) ^ 1480218802;
                                            i35 = 1189379861;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            iM6986 = (i37 - C2105.m6981("ۛ᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i39 = ((iM6986 ^ i38) * (-2807)) ^ 141935402;
                                            i35 = -948761169;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -2029175137:
                                    case -1411956584:
                                        return;
                                    case -1949174112:
                                    case -616178868:
                                        c29716 = c29713;
                                        iM6986 = C0630.m2566("ۡ֫") ^ i37;
                                        i39 = ((iM6986 ^ i38) * (-14197)) ^ (-2116971703);
                                        i35 = -1830061535;
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -1866146438:
                                    case 72440668:
                                        if (C3432.m10477() <= 0) {
                                            iM6986 = C2105.m6981("ۚᩳ") ^ i37;
                                            i39 = ((iM6986 ^ i38) * (-1499)) ^ 785864641;
                                            i35 = -1695589684;
                                        } else {
                                            iM6986 = C2105.m6981("ۡܿ") ^ i38;
                                            i39 = ((iM6986 ^ i37) * (-32251)) ^ (-567177020);
                                            i35 = -1034879817;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -1782943435:
                                    case 2101706810:
                                        C5695.m16020(c18090);
                                        iM6986 = (i38 - C2105.m6981("᩹֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                        i39 = ((iM6986 ^ i37) * (-9915)) ^ 38582662;
                                        i35 = 1053803966;
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -1779831626:
                                    case -1282057096:
                                        try {
                                            C4263.m12814(c29716, true);
                                            iM6986 = C2105.m6981("ܺܰ") ^ i38;
                                            i39 = ((iM6986 ^ i37) * 31543) ^ (-65906324);
                                            i35 = 548326699;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            iM6986 = (C2105.m6981("ۛ֨") + i37) * (-117);
                                            i39 = ((iM6986 ^ i38) * (-18517)) ^ (-1833153578);
                                            i35 = -2077986828;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -1519244313:
                                    case 933058808:
                                        if (C4616.f14690 <= 0) {
                                            iM6986 = (C0630.m2566("۟ܳ") + i38) * (-55);
                                            i39 = ((iM6986 ^ i37) * 18255) ^ 2864034;
                                            i35 = 1614195244;
                                        } else {
                                            iM6986 = C0630.m2566("ۚۨ") ^ i37;
                                            i39 = ((iM6986 ^ i38) * (-32473)) ^ 1875481757;
                                            i35 = -1420216775;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -1408533497:
                                    case 1774457930:
                                        return;
                                    case -1374063556:
                                    case -23139587:
                                        if (C1420.f5096 <= 0) {
                                            iM6986 = C2105.m6981("ۚᩳ") ^ i37;
                                            i39 = ((iM6986 ^ i38) * (-1499)) ^ 785864641;
                                            i35 = -1695589684;
                                        } else {
                                            iM6986 = (i37 - C0630.m2566("ۛ֡")) * (-47);
                                            i39 = ((iM6986 ^ i38) * 20103) ^ (-1135685840);
                                            i35 = 119537841;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -1121589718:
                                    case 1038292704:
                                        try {
                                            c18090 = new C18090(abstractC15441);
                                            c3545M1324 = C0184.m1324(c18090);
                                            iM6986 = (i37 - C2105.m6981("֨۠")) * 7;
                                            i39 = ((iM6986 ^ i38) * (-6313)) ^ (-1338726414);
                                            i35 = -471476280;
                                        } catch (Exception unused) {
                                            c18090 = null;
                                            iM6986 = C2105.m6981("ۢ֡") ^ i38;
                                            i39 = ((iM6986 ^ i37) * (-19493)) ^ 478310617;
                                            i35 = -590309987;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -1093407179:
                                    case 822148628:
                                        if (C1005.f3721) {
                                            iM6986 = (C2105.m6981("ܺᩳ") + i38) * (-15);
                                            i39 = ((iM6986 ^ i37) * (-841)) ^ 1742939855;
                                            i35 = 1383229487;
                                        } else {
                                            iM6986 = C2105.m6981("ۚᩳ") ^ i37;
                                            i39 = ((iM6986 ^ i38) * (-1499)) ^ 785864641;
                                            i35 = -1695589684;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -1043918396:
                                    case 805156302:
                                        if (C22628.m50615() != 0) {
                                            iM6986 = C2105.m6981("᩷۫") ^ i37;
                                            i39 = ((iM6986 ^ i38) * 6041) ^ (-1125938004);
                                            i35 = 1186028177;
                                        } else {
                                            iM6986 = (C2105.m6981("ܺᩳ") + i38) * (-15);
                                            i39 = ((iM6986 ^ i37) * (-841)) ^ 1742939855;
                                            i35 = 1383229487;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -975229605:
                                    case -370404677:
                                        throw th;
                                    case -626091100:
                                    case 919446207:
                                        if (C4075.f12947 >= 0) {
                                            iM6986 = (C0630.m2566("᩵ᩴ") ^ i38) * 63;
                                            i39 = ((iM6986 ^ i37) * 3275) ^ (-1624903429);
                                            i35 = -1332037025;
                                        } else {
                                            iM6986 = (i38 - C2105.m6981("֡ܺ")) * 81;
                                            i39 = ((iM6986 ^ i37) * (-25701)) ^ (-11804110);
                                            i35 = 821658293;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -565304605:
                                    case -258639830:
                                        abstractC15441 = abstractC15440;
                                        if (C3663.f11553) {
                                            iM6986 = (C2105.m6981("ۛۙ") ^ i37) * 65;
                                            i39 = ((iM6986 ^ i38) * (-1277)) ^ (-655095843);
                                            i35 = -1327178895;
                                        } else {
                                            iM6986 = (C2105.m6981("֨ᩴ") ^ i37) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i39 = ((iM6986 ^ i38) * 25495) ^ 297528108;
                                            i35 = 80944345;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -412847323:
                                    case 222543542:
                                        try {
                                            C0714.m2815(th, th2);
                                            iM6986 = C2105.m6981("ۜۡ") ^ i37;
                                            i39 = ((iM6986 ^ i38) * (-14173)) ^ 1480218802;
                                            i35 = 1189379861;
                                        } catch (Exception unused2) {
                                            iM6986 = C2105.m6981("ۢ֡") ^ i38;
                                            i39 = ((iM6986 ^ i37) * (-19493)) ^ 478310617;
                                            i35 = -590309987;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -373630994:
                                    case 739357117:
                                        C0714.m2805();
                                        iM6986 = (C0630.m2566("ۙ᩻") ^ i38) * (-9);
                                        i39 = ((iM6986 ^ i37) * 12841) ^ 870474543;
                                        i35 = -572163933;
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -307957523:
                                    case 470533787:
                                        if (C2958.f9394 >= 0) {
                                            iM6986 = (C2105.m6981("ܺᩳ") + i38) * (-15);
                                            i39 = ((iM6986 ^ i37) * (-841)) ^ 1742939855;
                                            i35 = 1383229487;
                                        } else {
                                            iM6986 = (C2105.m6981("֫۫") + i37) * (-29);
                                            i39 = ((iM6986 ^ i38) * (-18699)) ^ (-718358690);
                                            i35 = 295749960;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case -208044453:
                                    case 540336726:
                                        if (C3537.f11231 >= 0) {
                                            iM6986 = (C2105.m6981("ܺᩳ") + i38) * (-15);
                                            i39 = ((iM6986 ^ i37) * (-841)) ^ 1742939855;
                                            i35 = 1383229487;
                                        } else {
                                            iM6986 = (C2105.m6981("ۛۙ") ^ i37) * 65;
                                            i39 = ((iM6986 ^ i38) * (-1277)) ^ (-655095843);
                                            i35 = -1327178895;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case 2166523:
                                    case 1756916008:
                                        if (C0798.f2919) {
                                            iM6986 = (C2105.m6981("ۛۙ") ^ i37) * 65;
                                            i39 = ((iM6986 ^ i38) * (-1277)) ^ (-655095843);
                                            i35 = -1327178895;
                                        } else {
                                            iM6986 = C0630.m2566("ܶܺ") ^ i38;
                                            i39 = ((iM6986 ^ i37) * (-30791)) ^ (-868946674);
                                            i35 = 453888464;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case 113583997:
                                    case 904331838:
                                        C1916.m6308();
                                        if (C0798.m2998() == 0) {
                                            iM6986 = (C2105.m6981("ۛۙ") ^ i37) * 65;
                                            i39 = ((iM6986 ^ i38) * (-1277)) ^ (-655095843);
                                            i35 = -1327178895;
                                        } else {
                                            iM6986 = (C0630.m2566("᩵ᩴ") ^ i38) * 63;
                                            i39 = ((iM6986 ^ i37) * 3275) ^ (-1624903429);
                                            i35 = -1332037025;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case 189045332:
                                    case 2000976865:
                                        if (C11340.m28031()) {
                                            iM6986 = (C0630.m2566("ۜܽ") + i37) * (-119);
                                            i39 = ((iM6986 ^ i38) * (-31681)) ^ 1637658570;
                                            i35 = -1098458377;
                                        } else {
                                            iM6986 = (C0630.m2566("᩶ᩴ") + i38) * (-45);
                                            i39 = ((iM6986 ^ i37) * 26579) ^ (-1009970342);
                                            i35 = 467131526;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case 718415981:
                                    case 804104564:
                                        if (c3545M1324 != null) {
                                            iM6986 = (C2105.m6981("ܿ۫") ^ i38) * 75;
                                            i39 = ((iM6986 ^ i37) * (-4923)) ^ (-1226113843);
                                            i35 = -1098508172;
                                        } else {
                                            iM6986 = C2105.m6981("ܺܰ") ^ i38;
                                            i39 = ((iM6986 ^ i37) * 31543) ^ (-65906324);
                                            i35 = 548326699;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case 805245575:
                                    case 835556286:
                                        C22628.m50615();
                                        if (C2105.f7037 != 0) {
                                            iM6986 = (C0630.m2566("ۙ᩻") ^ i38) * (-9);
                                            i39 = ((iM6986 ^ i37) * 12841) ^ 870474543;
                                            i35 = -572163933;
                                        } else {
                                            iM6986 = C2105.m6981("᩷۫") ^ i37;
                                            i39 = ((iM6986 ^ i38) * 6041) ^ (-1125938004);
                                            i35 = 1186028177;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case 978216009:
                                    case 1952802858:
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM6986 = (C0630.m2566("۟ܳ") + i38) * (-55);
                                            i39 = ((iM6986 ^ i37) * 18255) ^ 2864034;
                                            i35 = 1614195244;
                                        } else {
                                            iM6986 = C0630.m2566("ܳ۬") ^ i38;
                                            i39 = ((iM6986 ^ i37) * 28241) ^ 523272918;
                                            i35 = 1053117329;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    case 2019621567:
                                    case 2141250149:
                                        RunnableC1108.m3790();
                                        ServiceConnectionC3453.m10564();
                                        return;
                                    case 2077153962:
                                    case 2101317092:
                                        if (C3683.f11629 >= 0) {
                                            iM6986 = (C0630.m2566("᩶ᩴ") + i38) * (-45);
                                            i39 = ((iM6986 ^ i37) * 26579) ^ (-1009970342);
                                            i35 = 467131526;
                                        } else {
                                            iM6986 = (C0630.m2566("۫ۤ") ^ i38) * (-19);
                                            i39 = ((iM6986 ^ i37) * 12457) ^ 2139467833;
                                            i35 = -1192796827;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                    default:
                                        if (C2167.f7158 >= 0) {
                                            iM6986 = C2105.m6981("᩷۫") ^ i37;
                                            i39 = ((iM6986 ^ i38) * 6041) ^ (-1125938004);
                                            i35 = 1186028177;
                                        } else {
                                            iM6986 = (C0630.m2566("᩶ᩴ") + i38) * (-45);
                                            i39 = ((iM6986 ^ i37) * 26579) ^ (-1009970342);
                                            i35 = 467131526;
                                        }
                                        i40 = iM6986 ^ i35;
                                        break;
                                }
                            }
                        }
                    }));
                    c19258M2130 = C0483.m2130(C22628.m50612(c16560));
                    C1711.m5727(c19258M2130, viewM9259);
                    if (!C1005.f3721) {
                        c10237 = c10236;
                        TextView textView11 = textView6;
                        strM1959 = strM1959;
                        textView = textView11;
                        int iM6986 = C2105.m6981("ܶܶ") ^ i23;
                        i27 = iM6986 ^ (-734645922);
                        i34 = ((iM6986 ^ i24) * 16195) ^ (-754912372);
                        i32 = i32;
                        c29713 = c29713;
                        c29712 = c29712;
                        view4 = view4;
                        textView8 = textView8;
                        sArr16 = sArr16;
                        textView7 = textView7;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14058;
                        str5 = str5;
                        String str7 = strM1959;
                        textView6 = textView;
                        strM1959 = str7;
                    } else {
                        iM2568 = (C0630.m2566("᩵֫") ^ i24) * 85;
                        i18 = ((iM2568 ^ i23) * (-23817)) ^ (-1406024725);
                        i19 = 607580034;
                        i27 = iM2568 ^ i19;
                        i34 = i18;
                        c10237 = c10236;
                    }
                    break;
                case -2012847613:
                case -1649241781:
                    c10235 = c10237;
                    c19258 = c19258M2130;
                    C1504.m5166(c29712, onCheckedChangeListener);
                    zM3400 = C0964.m3400(ApplicationC20075.f65008, C1294.m4373(f72243, 52, 21, i25), true);
                    if (C3019.f9544 < 0) {
                        iM2566 = (C0630.m2566("᩻۠") ^ i23) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i24) * (-5029)) ^ (-233333333);
                        i2 = -1980942002;
                        i27 = iM2566 ^ i2;
                        i34 = i;
                        c10237 = c10235;
                        c19258M2130 = c19258;
                    } else {
                        c10237 = c10235;
                        c19258M2130 = c19258;
                        TextView textView12 = textView6;
                        strM1959 = strM1959;
                        textView = textView12;
                        int iM6987 = C2105.m6981("ܶܶ") ^ i23;
                        i27 = iM6987 ^ (-734645922);
                        i34 = ((iM6987 ^ i24) * 16195) ^ (-754912372);
                        i32 = i32;
                        c29713 = c29713;
                        c29712 = c29712;
                        view4 = view4;
                        textView8 = textView8;
                        sArr16 = sArr16;
                        textView7 = textView7;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14058;
                        str5 = str5;
                        String str8 = strM1959;
                        textView6 = textView;
                        strM1959 = str8;
                    }
                    break;
                case -1812977069:
                case -192953324:
                    c10235 = c10237;
                    c19258 = c19258M2130;
                    C4159.m12564(C1005.m3507(viewM9259, iM6984 ^ i29), new View.OnClickListener() { // from class: l.ۖۨܽ

                        /* JADX INFO: renamed from: ۙ᩸ۙ, reason: not valid java name and contains not printable characters */
                        private static final short[] f7986 = {4978, -22340, 31662, -30466, -22136, -31682, 32294};

                        /* JADX WARN: Code duplicated, block: B:32:0x00e5 A[PHI: r3 r6 r7 r15
                          0x00e5: PHI (r3v4 android.text.SpannableString) = (r3v3 android.text.SpannableString), (r3v2 android.text.SpannableString) binds: [B:31:0x00e3, B:27:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                          0x00e5: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:31:0x00e3, B:27:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                          0x00e5: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:31:0x00e3, B:27:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                          0x00e5: PHI (r15v3 short[]) = (r15v2 short[]), (r15v4 short[]) binds: [B:31:0x00e3, B:27:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:36:0x0123 A[PHI: r2
                          0x0123: PHI (r2v5 int) = (r2v4 int), (r2v2 int) binds: [B:35:0x0121, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:53:0x01f4 A[PHI: r1 r10 r11 r12 r14
                          0x01f4: PHI (r1v7 l.᩵ۚۢ) = (r1v2 l.᩵ۚۢ), (r1v2 l.᩵ۚۢ), (r1v5 l.᩵ۚۢ), (r1v2 l.᩵ۚۢ) binds: [B:9:0x005d, B:6:0x0057, B:91:0x01f4, B:88:0x01f4] A[DONT_GENERATE, DONT_INLINE]
                          0x01f4: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:9:0x005d, B:6:0x0057, B:91:0x01f4, B:88:0x01f4] A[DONT_GENERATE, DONT_INLINE]
                          0x01f4: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:9:0x005d, B:6:0x0057, B:91:0x01f4, B:88:0x01f4] A[DONT_GENERATE, DONT_INLINE]
                          0x01f4: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:9:0x005d, B:6:0x0057, B:91:0x01f4, B:88:0x01f4] A[DONT_GENERATE, DONT_INLINE]
                          0x01f4: PHI (r14v5 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:9:0x005d, B:6:0x0057, B:91:0x01f4, B:88:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:57:0x0229 A[PHI: r5 r9 r21
                          0x0229: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:56:0x0227, B:23:0x009a, B:17:0x0075, B:89:0x0229] A[DONT_GENERATE, DONT_INLINE]
                          0x0229: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:56:0x0227, B:23:0x009a, B:17:0x0075, B:89:0x0229] A[DONT_GENERATE, DONT_INLINE]
                          0x0229: PHI (r21v5 short) = (r21v4 short), (r21v3 short), (r21v3 short), (r21v3 short) binds: [B:56:0x0227, B:23:0x009a, B:17:0x0075, B:89:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            int iM6988;
                            int i35;
                            int i36;
                            short[] sArr18;
                            int iM2569;
                            int i37;
                            int i38 = 1717959442;
                            int i39 = C1047.f3863;
                            int i40 = ViewOnClickListenerC1958.f6529;
                            int iM6989 = C2105.m6981("᩻۟") ^ i40;
                            int i41 = ((iM6989 ^ i39) * (-14477)) ^ 179998933;
                            int i42 = iM6989 ^ 625529935;
                            String strM4902 = null;
                            short[] sArr19 = null;
                            short[] sArr20 = null;
                            C19258 c19258M2131 = null;
                            int iM25610 = 0;
                            int i43 = 0;
                            int i44 = 0;
                            short s2 = 0;
                            int i45 = 0;
                            int i46 = 0;
                            int i47 = 0;
                            char c = 0;
                            short s3 = 0;
                            SpannableString spannableStringM46082 = null;
                            short[] sArr21 = null;
                            int iM25611 = 0;
                            int i48 = 0;
                            while (true) {
                                i38 = i42 ^ (i41 & (((i38 ^ i39) * 5073) >> 31));
                                switch (i38) {
                                    case -2023206824:
                                    case -1484938254:
                                        C0714.m2805();
                                        if (C3432.f10845 < 0) {
                                            sArr18 = sArr19;
                                            iM2569 = C2105.m6981("ۤ᩸") ^ i40;
                                            sArr19 = sArr18;
                                            i41 = ((iM2569 ^ i39) * (-8361)) ^ 1547317913;
                                            i37 = -2118715073;
                                            i42 = iM2569 ^ i37;
                                        } else {
                                            iM6988 = (i40 - C2105.m6981("ۗ᩻")) * (-21);
                                            i35 = ((iM6988 ^ i39) * 8575) ^ (-2138359858);
                                            i36 = 2085312029;
                                            i42 = iM6988 ^ i36;
                                            i41 = i35;
                                        }
                                        break;
                                    case -1860073053:
                                    case -711611108:
                                        C0714.m2805();
                                        C3746.m11369();
                                        iM6988 = (i40 - C2105.m6981("ۗ᩻")) * (-21);
                                        i35 = ((iM6988 ^ i39) * 8575) ^ (-2138359858);
                                        i36 = 2085312029;
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case -1816923577:
                                    case 1902660540:
                                        sArr18 = f7986;
                                        if (AbstractC2021.m6574()) {
                                            iM2569 = C2105.m6981("ۤ᩸") ^ i40;
                                            sArr19 = sArr18;
                                            i41 = ((iM2569 ^ i39) * (-8361)) ^ 1547317913;
                                            i37 = -2118715073;
                                        } else {
                                            iM2569 = C0630.m2566("ۤۢ") ^ i39;
                                            sArr19 = sArr18;
                                            i41 = ((iM2569 ^ i40) * 25671) ^ 853633034;
                                            i37 = 1868203323;
                                        }
                                        i42 = iM2569 ^ i37;
                                        break;
                                    case -1661063380:
                                    case -565392251:
                                        s3 = sArr19[c];
                                        s2 = 33120;
                                        if (C0382.f1805) {
                                            iM6988 = (i40 - C2105.m6981("ܳ֫")) * 95;
                                            i35 = ((iM6988 ^ i39) * 13591) ^ 1512172184;
                                            i36 = 1916744737;
                                        } else {
                                            iM6988 = (i40 - C2105.m6981("ۗ᩻")) * (-21);
                                            i35 = ((iM6988 ^ i39) * 8575) ^ (-2138359858);
                                            i36 = 2085312029;
                                        }
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case -1479779317:
                                    case 2091021737:
                                        i48 = 28239;
                                        iM6988 = C2105.m6981("֡ᩳ") ^ i40;
                                        i35 = ((iM6988 ^ i39) * 9519) ^ (-1951401237);
                                        i36 = 1756860048;
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case -1456121302:
                                    case 1016390229:
                                        c19258M2131 = C0483.m2130(C22628.m50612(c16560));
                                        sArr21 = f7986;
                                        if (C0237.f1507 == 0) {
                                            iM2569 = C2105.m6981("᩵ܳ") ^ i39;
                                            i41 = ((iM2569 ^ i40) * (-24429)) ^ (-1880661360);
                                            i37 = 1166069164;
                                            i42 = iM2569 ^ i37;
                                        } else {
                                            iM6988 = (C0630.m2566("ᩳᩳ") ^ i39) * 109;
                                            i35 = ((iM6988 ^ i40) * 1535) ^ (-423754060);
                                            i36 = -1711058649;
                                            i42 = iM6988 ^ i36;
                                            i41 = i35;
                                        }
                                        break;
                                    case -1100360149:
                                    case 107609212:
                                        if ((i46 + i47) - i45 >= 0) {
                                            iM6988 = (i39 - C2105.m6981("۠ܺ")) * (-103);
                                            i35 = ((iM6988 ^ i40) * (-20975)) ^ 1344062187;
                                            i36 = 100456109;
                                        } else {
                                            iM6988 = (C0630.m2566("۫᩻") + i40) * 3;
                                            i35 = ((iM6988 ^ i39) * (-22953)) ^ 295325222;
                                            i36 = 1537336190;
                                        }
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case -937719465:
                                    case 2142760925:
                                        C3537.m10741(c19258M2131, spannableStringM46082);
                                        sArr20 = f7986;
                                        i43 = 4;
                                        i44 = 3;
                                        if (C2272.f7362) {
                                            iM6988 = (C2105.m6981("᩷ۖ") + i39) * 55;
                                            i35 = ((iM6988 ^ i40) * 29151) ^ 2055787733;
                                            i36 = 673693659;
                                        } else {
                                            iM6988 = (C0630.m2566("ۡۗ") ^ i40) * 115;
                                            i35 = ((iM6988 ^ i39) * 21445) ^ (-975167428);
                                            i36 = 903061908;
                                        }
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case -923012197:
                                    case -750977269:
                                        strM4902 = C1420.m4902(sArr21, 1, 3, i48);
                                        if (C3746.f11829 > 0) {
                                            iM6988 = (C2105.m6981("֡֡") ^ i40) * 31;
                                            i35 = ((iM6988 ^ i39) * (-31843)) ^ 751222934;
                                            i36 = 1239203241;
                                            i42 = iM6988 ^ i36;
                                            i41 = i35;
                                        } else {
                                            sArr18 = sArr19;
                                            iM2569 = C2105.m6981("ۤ᩸") ^ i40;
                                            sArr19 = sArr18;
                                            i41 = ((iM2569 ^ i39) * (-8361)) ^ 1547317913;
                                            i37 = -2118715073;
                                            i42 = iM2569 ^ i37;
                                        }
                                        break;
                                    case -873194865:
                                    case 492330360:
                                        ViewOnClickListenerC1958.m6441(c19258M2131, 2116847420 ^ iM25610, null);
                                        C3683.m11213(c19258M2131);
                                        break;
                                    case -815599159:
                                    case -554817433:
                                        C3432.m10490(c19258M2131, iM25611);
                                        spannableStringM46082 = ViewOnClickListenerC19987.m46082();
                                        if (C2272.f7362) {
                                            iM6988 = (C2105.m6981("᩷ۖ") + i39) * 55;
                                            i35 = ((iM6988 ^ i40) * 29151) ^ 2055787733;
                                            i36 = 673693659;
                                        } else {
                                            iM6988 = (C0630.m2566("᩸ۙ") ^ i39) * (-119);
                                            i35 = ((iM6988 ^ i40) * (-1077)) ^ 946070847;
                                            i36 = 1140966805;
                                        }
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case -712833082:
                                    case -501064660:
                                        c = 0;
                                        if (C3746.m11369() < 0) {
                                            iM6988 = (C2105.m6981("ۡ֨") + i40) * 123;
                                            i35 = ((iM6988 ^ i39) * 19681) ^ 81780490;
                                            i36 = -243844026;
                                            i42 = iM6988 ^ i36;
                                            i41 = i35;
                                        } else {
                                            sArr18 = sArr19;
                                            iM2569 = C2105.m6981("ۤ᩸") ^ i40;
                                            sArr19 = sArr18;
                                            i41 = ((iM2569 ^ i39) * (-8361)) ^ 1547317913;
                                            i37 = -2118715073;
                                            i42 = iM2569 ^ i37;
                                        }
                                        break;
                                    case -682646869:
                                    case 675513323:
                                        C22628.m50615();
                                        if (C7106.f21815 == 0) {
                                            iM6988 = (C0630.m2566("ᩳᩳ") ^ i39) * 109;
                                            i35 = ((iM6988 ^ i40) * 1535) ^ (-423754060);
                                            i36 = -1711058649;
                                            i42 = iM6988 ^ i36;
                                            i41 = i35;
                                        } else {
                                            sArr18 = sArr19;
                                            iM2569 = C2105.m6981("ۤ᩸") ^ i40;
                                            sArr19 = sArr18;
                                            i41 = ((iM2569 ^ i39) * (-8361)) ^ 1547317913;
                                            i37 = -2118715073;
                                            i42 = iM2569 ^ i37;
                                        }
                                        break;
                                    case -497277839:
                                    case 284339290:
                                        i48 = 63781;
                                        iM6988 = C2105.m6981("֡ᩳ") ^ i40;
                                        i35 = ((iM6988 ^ i39) * 9519) ^ (-1951401237);
                                        i36 = 1756860048;
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case -29534393:
                                    case 2029235033:
                                        iM25610 = C0630.m2566(RunnableC1937.m6385(sArr20, i43, i44, i48));
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM6988 = (i40 - C2105.m6981("ۗ᩻")) * (-21);
                                            i35 = ((iM6988 ^ i39) * 8575) ^ (-2138359858);
                                            i36 = 2085312029;
                                        } else {
                                            iM6988 = (i39 - C0630.m2566("ۙܽ")) * (-119);
                                            i35 = ((iM6988 ^ i40) * 2857) ^ 22530621;
                                            i36 = -160457726;
                                        }
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case 940887882:
                                    case 1701596748:
                                        AbstractC2021.m6574();
                                        C4117.m12364();
                                        break;
                                    case 951595734:
                                    case 2044874592:
                                        iM25611 = 2119210006 ^ C0630.m2566(strM4902);
                                        if (C0630.m2564()) {
                                            iM6988 = C0630.m2566("ۖ᩷") ^ i40;
                                            i35 = ((iM6988 ^ i39) * (-20025)) ^ 931793337;
                                            i36 = 2086717885;
                                        } else {
                                            iM6988 = (C0630.m2566("᩸ۗ") + i39) * 19;
                                            i35 = ((iM6988 ^ i40) * (-5275)) ^ 240012517;
                                            i36 = 1330069265;
                                        }
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    case 1297963971:
                                    case 1439049959:
                                        if (C0483.f2088 < 0) {
                                            iM6988 = (C0630.m2566("ᩳᩳ") ^ i39) * 109;
                                            i35 = ((iM6988 ^ i40) * 1535) ^ (-423754060);
                                            i36 = -1711058649;
                                        } else {
                                            iM6988 = C0630.m2566("ۖ᩷") ^ i40;
                                            i35 = ((iM6988 ^ i39) * (-20025)) ^ 931793337;
                                            i36 = 2086717885;
                                        }
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                    default:
                                        i45 = s3 * s2;
                                        i46 = s3 * s3;
                                        i47 = 274233600;
                                        if (RunnableC1108.f4040) {
                                            iM6988 = C0630.m2566("ۚ۫") ^ i39;
                                            i35 = ((iM6988 ^ i40) * (-18187)) ^ (-231230964);
                                            i36 = -1961811388;
                                        } else {
                                            iM6988 = (C0630.m2566("ᩳᩳ") ^ i39) * 109;
                                            i35 = ((iM6988 ^ i40) * 1535) ^ (-423754060);
                                            i36 = -1711058649;
                                        }
                                        i42 = iM6988 ^ i36;
                                        i41 = i35;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    final TextView textView13 = textView7;
                    C1504.m5166(c29713, new CompoundButton.OnCheckedChangeListener() { // from class: l.ۘۨܽ

                        /* JADX INFO: renamed from: ᩵᩶ۤ, reason: not valid java name and contains not printable characters */
                        private static final short[] f12509 = {6124, 30482, 30480, 30491, 30480, 30471, 30484, 30465, 30480, 30506, 30488, 30484, 30469, 30469, 30492, 30491, 30482, 30506, 30483, 30492, 30489, 30480, 30506, 30471, 30480, 30486, 30490, 30467, 30480, 30471, 30476, 30482, 30480, 30491, 30480, 30471, 30484, 30465, 30480, 30506, 30488, 30484, 30469, 30469, 30492, 30491, 30482, 30506, 30483, 30492, 30489, 30480, 5078, 4659, 14792, 7711, 8932, -1878};

                        {
                            int i35 = 1101993110;
                            int i36 = C7811.f24123;
                            int i37 = C4117.f13076;
                            int iM6988 = (C2105.m6981("ۡۡ") + i37) * 79;
                            int i38 = ((iM6988 ^ i36) * 22721) ^ 2080525947;
                            int i39 = -1552334567;
                            while (true) {
                                i35 = ((((i35 ^ i36) * (-27075)) >> 31) & i38) ^ (iM6988 ^ i39);
                                switch (i35) {
                                    case -2023147067:
                                    case -590690144:
                                        if (C1916.f6442) {
                                            iM6988 = (i36 - C0630.m2566("֡۟")) * 95;
                                            i38 = ((iM6988 ^ i37) * (-16101)) ^ (-1395005262);
                                            i39 = 1877700768;
                                        } else {
                                            iM6988 = (i37 - C2105.m6981("۠᩷")) * 87;
                                            i38 = ((iM6988 ^ i36) * (-11599)) ^ (-1708890236);
                                            i39 = -428753926;
                                        }
                                        break;
                                    case -1740400246:
                                    case -1571683063:
                                        C4159.m12565();
                                        if (C2105.f7037 != 0) {
                                            iM6988 = C0630.m2566("᩻ۗ") ^ i36;
                                            i38 = ((iM6988 ^ i37) * (-27195)) ^ (-1386270445);
                                            i39 = 83147268;
                                        } else {
                                            iM6988 = (C0630.m2566("᩻᩸") + i37) * (-123);
                                            i38 = ((iM6988 ^ i36) * 2461) ^ (-416074707);
                                            i39 = 1497592361;
                                        }
                                        break;
                                    case -1651995245:
                                    case 1407270584:
                                        if (RunnableC1937.f6483 >= 0) {
                                            iM6988 = C2105.m6981("᩻֫") ^ i36;
                                            i38 = ((iM6988 ^ i37) * (-31549)) ^ (-1044864193);
                                            i39 = -1055805831;
                                        } else {
                                            iM6988 = (C2105.m6981("۠ۜ") ^ i36) * 13;
                                            i38 = ((iM6988 ^ i37) * (-17531)) ^ (-36896930);
                                            i39 = 953469279;
                                        }
                                        break;
                                    case -1616596192:
                                    case -1257814785:
                                        C0798.m2998();
                                        if (C3019.f9544 < 0) {
                                            iM6988 = (C0630.m2566("᩻᩸") + i37) * (-123);
                                            i38 = ((iM6988 ^ i36) * 2461) ^ (-416074707);
                                            i39 = 1497592361;
                                        } else {
                                            iM6988 = (i36 - C2105.m6981("ۧۧ")) * (-55);
                                            i38 = ((iM6988 ^ i37) * 22913) ^ 831855041;
                                            i39 = -509508858;
                                        }
                                        break;
                                    case -760841791:
                                    case 1607318173:
                                        if (C1773.f6144 <= 0) {
                                            iM6988 = (i37 - C2105.m6981("۠᩷")) * 87;
                                            i38 = ((iM6988 ^ i36) * (-11599)) ^ (-1708890236);
                                            i39 = -428753926;
                                        } else {
                                            iM6988 = C2105.m6981("ܳܺ") ^ i37;
                                            i38 = ((iM6988 ^ i36) * 7759) ^ 1160635340;
                                            i39 = -1979468704;
                                        }
                                        break;
                                    case -428824364:
                                    case 746222904:
                                        if (C4117.f13076 <= 0) {
                                            iM6988 = (C0630.m2566("᩻᩸") + i37) * (-123);
                                            i38 = ((iM6988 ^ i36) * 2461) ^ (-416074707);
                                            i39 = 1497592361;
                                        } else {
                                            iM6988 = (C0630.m2566("ܶ᩸") ^ i37) * 89;
                                            i38 = ((iM6988 ^ i36) * (-3571)) ^ 1227784718;
                                            i39 = 1942954944;
                                        }
                                        break;
                                    case -126121154:
                                    case -77700917:
                                        if (C0714.f2697 >= 0) {
                                            iM6988 = (i37 - C2105.m6981("۠᩷")) * 87;
                                            i38 = ((iM6988 ^ i36) * (-11599)) ^ (-1708890236);
                                            i39 = -428753926;
                                        } else {
                                            iM6988 = (C2105.m6981("᩹ۨ") ^ i37) * 45;
                                            i38 = ((iM6988 ^ i36) * 23289) ^ 1959307516;
                                            i39 = 310340272;
                                        }
                                        break;
                                    case -584764:
                                    case 2046639824:
                                        if (C22628.f73083 <= 0) {
                                            iM6988 = (i37 - C2105.m6981("۠᩷")) * 87;
                                            i38 = ((iM6988 ^ i36) * (-11599)) ^ (-1708890236);
                                            i39 = -428753926;
                                        } else {
                                            iM6988 = (C2105.m6981("ۡۧ") ^ i37) * (-109);
                                            i38 = ((iM6988 ^ i36) * (-117)) ^ 1272080489;
                                            i39 = -197693395;
                                        }
                                        break;
                                    case 106490103:
                                    case 315155005:
                                        C1128.m3851();
                                        throw new RuntimeException();
                                    case 492129796:
                                    case 583645727:
                                        if (C4263.f13799 <= 0) {
                                            iM6988 = (C0630.m2566("᩻᩸") + i37) * (-123);
                                            i38 = ((iM6988 ^ i36) * 2461) ^ (-416074707);
                                            i39 = 1497592361;
                                        } else {
                                            iM6988 = C0630.m2566("᩹ᩴ") ^ i36;
                                            i38 = ((iM6988 ^ i37) * (-20121)) ^ 2112823666;
                                            i39 = -40280056;
                                        }
                                        break;
                                    case 605191333:
                                    case 1795417712:
                                        if (C2958.m9034() <= 0) {
                                            iM6988 = (i37 - C2105.m6981("۠᩷")) * 87;
                                            i38 = ((iM6988 ^ i36) * (-11599)) ^ (-1708890236);
                                            i39 = -428753926;
                                        } else {
                                            iM6988 = C0630.m2566("᩺ۨ") ^ i36;
                                            i38 = ((iM6988 ^ i37) * 21189) ^ 1847259626;
                                            i39 = 1468225085;
                                        }
                                        break;
                                    case 748328155:
                                    case 1282075220:
                                        if (C0050.f910 >= 0) {
                                            iM6988 = C0630.m2566("᩻ۗ") ^ i36;
                                            i38 = ((iM6988 ^ i37) * (-27195)) ^ (-1386270445);
                                            i39 = 83147268;
                                        } else {
                                            iM6988 = C2105.m6981("᩹۟") ^ i36;
                                            i38 = ((iM6988 ^ i37) * 21051) ^ 2023219862;
                                            i39 = -938557423;
                                        }
                                        break;
                                    case 837109280:
                                    case 841586758:
                                        return;
                                    case 1744738263:
                                    case 1970039701:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM6988 = (C0630.m2566("᩻᩸") + i37) * (-123);
                                            i38 = ((iM6988 ^ i36) * 2461) ^ (-416074707);
                                            i39 = 1497592361;
                                        } else {
                                            iM6988 = C0630.m2566("۫۫") ^ i37;
                                            i38 = ((iM6988 ^ i36) * 13191) ^ 1540335003;
                                            i39 = 1946222040;
                                        }
                                        break;
                                    case 1761867457:
                                    case 1893880238:
                                        C7106.m19120();
                                        if (C5695.m16023() < 0) {
                                            iM6988 = (i37 - C2105.m6981("۠᩷")) * 87;
                                            i38 = ((iM6988 ^ i36) * (-11599)) ^ (-1708890236);
                                            i39 = -428753926;
                                        } else {
                                            iM6988 = (C0630.m2566("᩻᩸") + i37) * (-123);
                                            i38 = ((iM6988 ^ i36) * 2461) ^ (-416074707);
                                            i39 = 1497592361;
                                        }
                                        break;
                                    default:
                                        ViewOnClickListenerC1958.m6429();
                                        C2105.m6982();
                                        iM6988 = (C0630.m2566("᩻᩸") + i37) * (-123);
                                        i38 = ((iM6988 ^ i36) * 2461) ^ (-416074707);
                                        i39 = 1497592361;
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:50:0x01fc A[PHI: r10 r11 r12 r13 r22
                          0x01fc: PHI (r10v6 l.۬ۤۡ) = (r10v3 l.۬ۤۡ), (r10v2 l.۬ۤۡ), (r10v2 l.۬ۤۡ) binds: [B:49:0x01fa, B:45:0x01d3, B:33:0x0126] A[DONT_GENERATE, DONT_INLINE]
                          0x01fc: PHI (r11v6 l.۫ۤۡ) = (r11v2 l.۫ۤۡ), (r11v3 l.۫ۤۡ), (r11v2 l.۫ۤۡ) binds: [B:49:0x01fa, B:45:0x01d3, B:33:0x0126] A[DONT_GENERATE, DONT_INLINE]
                          0x01fc: PHI (r12v6 boolean) = (r12v2 boolean), (r12v3 boolean), (r12v2 boolean) binds: [B:49:0x01fa, B:45:0x01d3, B:33:0x0126] A[DONT_GENERATE, DONT_INLINE]
                          0x01fc: PHI (r13v5 l.۬ۤۡ) = (r13v2 l.۬ۤۡ), (r13v2 l.۬ۤۡ), (r13v6 l.۬ۤۡ) binds: [B:49:0x01fa, B:45:0x01d3, B:33:0x0126] A[DONT_GENERATE, DONT_INLINE]
                          0x01fc: PHI (r22v22 android.view.View) = (r22v16 android.view.View), (r22v17 android.view.View), (r22v25 android.view.View) binds: [B:49:0x01fa, B:45:0x01d3, B:33:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            int iM6988;
                            int i35;
                            int i36;
                            View view5;
                            short[] sArr18;
                            int i37;
                            int i38;
                            int iM2569;
                            int i39;
                            int i40;
                            TextView textView14;
                            int i41;
                            int i42;
                            int i43;
                            int iM6989;
                            int i44;
                            int i45;
                            int i46 = 618484066;
                            int i47 = C4263.f13799;
                            int i48 = C1128.f4106;
                            int iM69810 = (C2105.m6981("ۧܰ") + i48) * (-19);
                            int i49 = ((iM69810 ^ i47) * (-19357)) ^ 939946936;
                            int i50 = iM69810 ^ 1502978950;
                            String strM3396 = null;
                            InterfaceC12344 interfaceC12344 = null;
                            InterfaceC13049 interfaceC13049M4377 = null;
                            short[] sArr19 = null;
                            short[] sArr20 = null;
                            int i51 = 0;
                            int i52 = 0;
                            int i53 = 0;
                            boolean z2 = false;
                            boolean zM12818 = false;
                            int i54 = 0;
                            int iM69811 = 0;
                            int i55 = 0;
                            short s2 = 0;
                            short s3 = 0;
                            int i56 = 0;
                            int i57 = 0;
                            String strM3005 = null;
                            InterfaceC13049 interfaceC13049M4378 = null;
                            boolean z3 = false;
                            C2978 c29716 = null;
                            View view6 = null;
                            C2978 c29717 = null;
                            TextView textView15 = null;
                            while (true) {
                                i46 = i50 ^ (i49 & (((i46 ^ i47) * 2793) >> 31));
                                switch (i46) {
                                    case -2093299444:
                                    case 1376777369:
                                        view5 = view6;
                                        iM69811 = C2105.m6981(C4263.m12817(f12509, 55, 3, i52));
                                        i55 = 2122621243;
                                        if (C0964.f3626 == 0) {
                                            iM6989 = (C0630.m2566("ۢۜ") + i48) * 47;
                                            i44 = ((iM6989 ^ i47) * (-14937)) ^ (-2103603221);
                                            i45 = -38702916;
                                            i50 = iM6989 ^ i45;
                                            i49 = i44;
                                            view6 = view5;
                                        } else {
                                            i42 = iM69811;
                                            i41 = 2122621243;
                                            i43 = i54;
                                            textView14 = textView15;
                                            int iM25610 = C0630.m2566("ܽۖ") ^ i48;
                                            i51 = i51;
                                            int i58 = ((iM25610 ^ i47) * (-15239)) ^ 521691875;
                                            i50 = iM25610 ^ (-1329075345);
                                            sArr20 = sArr20;
                                            textView15 = textView14;
                                            i56 = i56;
                                            c29717 = c29717;
                                            i57 = i57;
                                            c29716 = c29716;
                                            i54 = i43;
                                            iM69811 = i42;
                                            view6 = view5;
                                            i55 = i41;
                                            i49 = i58;
                                            i52 = i52;
                                        }
                                        break;
                                    case -1800968332:
                                    case 922379215:
                                        C3746.m11360(textView15, z3 ? 1 : 0);
                                        C3746.m11360(view6, i53);
                                        break;
                                    case -1610929622:
                                    case 1330070156:
                                        i40 = 30581;
                                        int iM25611 = C0630.m2566("ܳ᩺") ^ i47;
                                        i50 = iM25611 ^ 1530223392;
                                        sArr20 = sArr20;
                                        i56 = i56;
                                        i57 = i57;
                                        view6 = view6;
                                        i49 = ((iM25611 ^ i48) * (-26733)) ^ 799110257;
                                        i52 = i40;
                                        break;
                                    case -1203565666:
                                    case 1416880876:
                                        if (C21923.f70183 == 0) {
                                            i52 = i52;
                                            view5 = view6;
                                            int iM69812 = (i47 - C2105.m6981("ۗ᩺")) * (-105);
                                            i49 = ((iM69812 ^ i48) * (-21557)) ^ (-1035337036);
                                            i50 = iM69812 ^ (-749640821);
                                            view6 = view5;
                                            i52 = i52;
                                        } else {
                                            i52 = i52;
                                            view5 = view6;
                                            sArr18 = sArr20;
                                            i37 = i56;
                                            i38 = i57;
                                            iM2569 = C0630.m2566("֨ܿ") ^ i47;
                                            i49 = ((iM2569 ^ i48) * 16669) ^ 1591852545;
                                            i39 = -339483691;
                                            i50 = iM2569 ^ i39;
                                            i56 = i37;
                                            i57 = i38;
                                            view6 = view5;
                                            i52 = i52;
                                            sArr20 = sArr18;
                                        }
                                        break;
                                    case -1202607983:
                                    case 1553521280:
                                        view5 = view6;
                                        sArr20 = f12509;
                                        i56 = 1;
                                        i57 = 30;
                                        if (C1916.m6308() < 0) {
                                            iM6989 = C2105.m6981("ۢܺ") ^ i47;
                                            i44 = ((iM6989 ^ i48) * (-30121)) ^ 1565767289;
                                            i45 = -1909469050;
                                            i50 = iM6989 ^ i45;
                                            i49 = i44;
                                            view6 = view5;
                                        } else {
                                            i52 = i52;
                                            int iM69813 = (i47 - C2105.m6981("ۗ᩺")) * (-105);
                                            i49 = ((iM69813 ^ i48) * (-21557)) ^ (-1035337036);
                                            i50 = iM69813 ^ (-749640821);
                                            view6 = view5;
                                            i52 = i52;
                                        }
                                        break;
                                    case -1166858954:
                                    case 1255638407:
                                        View view7 = view6;
                                        sArr20 = sArr20;
                                        i56 = i56;
                                        int i59 = i57;
                                        strM3005 = C0798.m3005(sArr20, i56, i59, i52);
                                        strM3396 = C0964.m3396(f12509, 31, 21, i52);
                                        if (z) {
                                            int iM25612 = (C0630.m2566("۬ۢ") ^ i48) * (-67);
                                            i50 = iM25612 ^ (-1758120737);
                                            i49 = ((iM25612 ^ i47) * 14093) ^ (-1890238205);
                                        } else {
                                            int iM25613 = (C0630.m2566("ۖۗ") ^ i48) * (-53);
                                            i50 = iM25613 ^ 1028440436;
                                            i49 = ((iM25613 ^ i47) * 4389) ^ 390478559;
                                        }
                                        i57 = i59;
                                        view6 = view7;
                                        i53 = 8;
                                        z3 = false;
                                        break;
                                    case -1042615402:
                                    case 591490503:
                                        i40 = 1432;
                                        int iM25614 = C0630.m2566("ܳ᩺") ^ i47;
                                        i50 = iM25614 ^ 1530223392;
                                        sArr20 = sArr20;
                                        i56 = i56;
                                        i57 = i57;
                                        view6 = view6;
                                        i49 = ((iM25614 ^ i48) * (-26733)) ^ 799110257;
                                        i52 = i40;
                                        break;
                                    case -1038725424:
                                    case -778176619:
                                        if (!C2126.f7087) {
                                            iM6988 = C2105.m6981("۠ۢ") ^ i47;
                                            i35 = ((iM6988 ^ i48) * (-7101)) ^ 1832399125;
                                            i36 = 891429035;
                                            i50 = iM6988 ^ i36;
                                            i49 = i35;
                                        } else {
                                            i52 = i52;
                                            view5 = view6;
                                            sArr18 = sArr20;
                                            i37 = i56;
                                            i38 = i57;
                                            iM2569 = C0630.m2566("֨ܿ") ^ i47;
                                            i49 = ((iM2569 ^ i48) * 16669) ^ 1591852545;
                                            i39 = -339483691;
                                            i50 = iM2569 ^ i39;
                                            i56 = i37;
                                            i57 = i38;
                                            view6 = view5;
                                            i52 = i52;
                                            sArr20 = sArr18;
                                        }
                                        break;
                                    case -1005879104:
                                    case 2142003999:
                                        i52 = i52;
                                        view5 = view6;
                                        short[] sArr21 = sArr20;
                                        i37 = i56;
                                        i38 = i57;
                                        int i60 = s2 + s3;
                                        int i61 = (s2 * s2) + 81126049;
                                        if ((i60 * i60) - (i61 + i61) > 0) {
                                            iM2569 = C2105.m6981("ܽᩴ") ^ i48;
                                            sArr18 = sArr21;
                                            i49 = ((iM2569 ^ i47) * 18543) ^ (-1087838840);
                                            i39 = 734367960;
                                        } else {
                                            sArr18 = sArr21;
                                            iM2569 = C0630.m2566("ܺܰ") ^ i47;
                                            i49 = ((iM2569 ^ i48) * (-5269)) ^ 1991354068;
                                            i39 = 2065403026;
                                        }
                                        i50 = iM2569 ^ i39;
                                        i56 = i37;
                                        i57 = i38;
                                        view6 = view5;
                                        i52 = i52;
                                        sArr20 = sArr18;
                                        break;
                                    case -925202888:
                                    case 543945427:
                                        view5 = view6;
                                        C0964.m3401(c29717, C4263.m12818(interfaceC12344, strM3396, z2));
                                        C1128.m3853(c29716, z3 ? 1 : 0);
                                        if (C0714.m2804(c29716)) {
                                            iM6989 = C0630.m2566("᩻֡") ^ i48;
                                            i44 = ((iM6989 ^ i47) * 26697) ^ 476085859;
                                            i45 = 1743848262;
                                        } else {
                                            iM6989 = (i48 - C0630.m2566("۬ۙ")) * (-73);
                                            i44 = ((iM6989 ^ i47) * (-10587)) ^ (-1775764894);
                                            i45 = -1537044542;
                                        }
                                        i50 = iM6989 ^ i45;
                                        i49 = i44;
                                        view6 = view5;
                                        break;
                                    case -563411205:
                                    case 1895832886:
                                        view5 = view6;
                                        C7106.m19107(C4616.m13549(interfaceC13049M4378, strM3005, C2167.m7157(c29717)));
                                        interfaceC12344 = ApplicationC20075.f65008;
                                        z2 = true;
                                        if (C2520.f8000 >= 0) {
                                            iM6989 = C0630.m2566("ۚ֡") ^ i48;
                                            i44 = ((iM6989 ^ i47) * 10069) ^ 1389574390;
                                            i45 = -652662182;
                                        } else {
                                            iM6989 = C2105.m6981("᩷᩸") ^ i47;
                                            i44 = ((iM6989 ^ i48) * 2635) ^ (-1900781920);
                                            i45 = -58334735;
                                        }
                                        i50 = iM6989 ^ i45;
                                        i49 = i44;
                                        view6 = view5;
                                        break;
                                    case -543196054:
                                    case 1648475664:
                                        C3432.m10477();
                                        C4117.m12364();
                                        break;
                                    case -319044804:
                                    case -221356053:
                                        C4263.m12814(c29717, zM12818);
                                        C3746.m11360(textView15, z3 ? 1 : 0);
                                        C1128.m3853(view6, i53);
                                        C1128.m3853(c29716, i53);
                                        break;
                                    case 20118615:
                                    case 1714775583:
                                        view5 = view6;
                                        int iM69814 = C2105.m6981(C21923.m49334(f12509, 52, 3, i52));
                                        i54 = 2123651192;
                                        if (C0798.m2998() == 0) {
                                            int iM25615 = C0630.m2566("ۨ᩷") ^ i48;
                                            i50 = iM25615 ^ 1648913742;
                                            i51 = iM69814;
                                            i49 = ((iM25615 ^ i47) * (-6237)) ^ (-1460393138);
                                            view6 = view5;
                                        } else {
                                            i52 = i52;
                                            i51 = iM69814;
                                            i41 = i55;
                                            sArr20 = sArr20;
                                            i56 = i56;
                                            i57 = i57;
                                            i42 = iM69811;
                                            i43 = 2123651192;
                                            textView14 = textView15;
                                            int iM25616 = C0630.m2566("ܽۖ") ^ i48;
                                            i51 = i51;
                                            int i510 = ((iM25616 ^ i47) * (-15239)) ^ 521691875;
                                            i50 = iM25616 ^ (-1329075345);
                                            sArr20 = sArr20;
                                            textView15 = textView14;
                                            i56 = i56;
                                            c29717 = c29717;
                                            i57 = i57;
                                            c29716 = c29716;
                                            i54 = i43;
                                            iM69811 = i42;
                                            view6 = view5;
                                            i55 = i41;
                                            i49 = i510;
                                            i52 = i52;
                                        }
                                        break;
                                    case 25089409:
                                    case 1584414130:
                                        C21923.m49329();
                                        if (C3911.f12484 >= 0) {
                                            view5 = view6;
                                            i41 = i55;
                                            i42 = iM69811;
                                            i43 = i54;
                                            textView14 = textView15;
                                            int iM25617 = C0630.m2566("ܽۖ") ^ i48;
                                            i51 = i51;
                                            int i511 = ((iM25617 ^ i47) * (-15239)) ^ 521691875;
                                            i50 = iM25617 ^ (-1329075345);
                                            sArr20 = sArr20;
                                            textView15 = textView14;
                                            i56 = i56;
                                            c29717 = c29717;
                                            i57 = i57;
                                            c29716 = c29716;
                                            i54 = i43;
                                            iM69811 = i42;
                                            view6 = view5;
                                            i55 = i41;
                                            i49 = i511;
                                            i52 = i52;
                                        }
                                        i52 = i52;
                                        view5 = view6;
                                        int iM69815 = (i47 - C2105.m6981("ۗ᩺")) * (-105);
                                        i49 = ((iM69815 ^ i48) * (-21557)) ^ (-1035337036);
                                        i50 = iM69815 ^ (-749640821);
                                        view6 = view5;
                                        i52 = i52;
                                        break;
                                    case 129409435:
                                    case 1374235484:
                                        i52 = i52;
                                        view5 = view6;
                                        sArr18 = sArr20;
                                        i37 = i56;
                                        i38 = i57;
                                        sArr19 = f12509;
                                        if (C1711.f5919) {
                                            iM2569 = C0630.m2566("֨ܿ") ^ i47;
                                            i49 = ((iM2569 ^ i48) * 16669) ^ 1591852545;
                                            i39 = -339483691;
                                        } else {
                                            iM2569 = (i48 - C0630.m2566("ܳ᩵")) * 119;
                                            i49 = ((iM2569 ^ i47) * 16965) ^ 463804040;
                                            i39 = -2015842796;
                                        }
                                        i50 = iM2569 ^ i39;
                                        i56 = i37;
                                        i57 = i38;
                                        view6 = view5;
                                        i52 = i52;
                                        sArr20 = sArr18;
                                        break;
                                    case 154968547:
                                    case 1653457503:
                                        C1916.m6302(C7811.m20835(interfaceC13049M4377, strM3396, C2167.m7157(c29717)));
                                        zM12818 = C4263.m12818(ApplicationC20075.f65008, strM3005, z3);
                                        if (C4117.m12364() == 0) {
                                            iM6988 = C2105.m6981("ۘۨ") ^ i47;
                                            i35 = ((iM6988 ^ i48) * 27897) ^ (-1459754329);
                                            i36 = -660131580;
                                            i50 = iM6988 ^ i36;
                                            i49 = i35;
                                        } else {
                                            i52 = i52;
                                            view5 = view6;
                                            int iM69816 = (i47 - C2105.m6981("ۗ᩺")) * (-105);
                                            i49 = ((iM69816 ^ i48) * (-21557)) ^ (-1035337036);
                                            i50 = iM69816 ^ (-749640821);
                                            view6 = view5;
                                            i52 = i52;
                                        }
                                        break;
                                    case 655155772:
                                    case 1932737982:
                                        i52 = i52;
                                        view5 = view6;
                                        sArr18 = sArr20;
                                        i37 = i56;
                                        i38 = i57;
                                        s2 = sArr19[0];
                                        s3 = 9007;
                                        if (C2167.f7158 < 0) {
                                            iM2569 = (C2105.m6981("᩵᩺") + i47) * (-47);
                                            i49 = ((iM2569 ^ i48) * (-29279)) ^ 613144426;
                                            i39 = -1502445155;
                                            i50 = iM2569 ^ i39;
                                            i56 = i37;
                                            i57 = i38;
                                            view6 = view5;
                                            i52 = i52;
                                            sArr20 = sArr18;
                                        } else {
                                            i56 = i37;
                                            i57 = i38;
                                            sArr20 = sArr18;
                                            int iM69817 = (i47 - C2105.m6981("ۗ᩺")) * (-105);
                                            i49 = ((iM69817 ^ i48) * (-21557)) ^ (-1035337036);
                                            i50 = iM69817 ^ (-749640821);
                                            view6 = view5;
                                            i52 = i52;
                                        }
                                        break;
                                    case 695586547:
                                    case 1842654434:
                                        C0630.m2570(textView15, iM69811 ^ i55);
                                        interfaceC13049M4377 = C1294.m4377(ApplicationC20075.f65008);
                                        if (C1294.f4556 < 0) {
                                            iM6988 = (C2105.m6981("ۗۘ") + i47) * (-77);
                                            i35 = ((iM6988 ^ i48) * (-11223)) ^ 653978951;
                                            i36 = 579341076;
                                            i50 = iM6988 ^ i36;
                                            i49 = i35;
                                        } else {
                                            view5 = view6;
                                            iM6989 = C0630.m2566("ۚ֡") ^ i48;
                                            i44 = ((iM6989 ^ i47) * 10069) ^ 1389574390;
                                            i45 = -652662182;
                                            i50 = iM6989 ^ i45;
                                            i49 = i44;
                                            view6 = view5;
                                        }
                                        break;
                                    case 701759869:
                                    case 1870020104:
                                        C3746.m11360(textView15, i53);
                                        C3746.m11360(view6, z3 ? 1 : 0);
                                        break;
                                    case 1090486555:
                                    case 1869188015:
                                        sArr20 = sArr20;
                                        i56 = i56;
                                        i57 = i57;
                                        textView14 = textView13;
                                        c29717 = c29714;
                                        i52 = i52;
                                        view5 = view4;
                                        C2978 c29718 = c29712;
                                        if (C0964.f3626 != 0) {
                                            i41 = i55;
                                            i42 = iM69811;
                                            i43 = i54;
                                            c29716 = c29718;
                                            i51 = i51;
                                            int iM25618 = C0630.m2566("ܽۖ") ^ i48;
                                            i51 = i51;
                                            int i512 = ((iM25618 ^ i47) * (-15239)) ^ 521691875;
                                            i50 = iM25618 ^ (-1329075345);
                                            sArr20 = sArr20;
                                            textView15 = textView14;
                                            i56 = i56;
                                            c29717 = c29717;
                                            i57 = i57;
                                            c29716 = c29716;
                                            i54 = i43;
                                            iM69811 = i42;
                                            view6 = view5;
                                            i55 = i41;
                                            i49 = i512;
                                            i52 = i52;
                                        } else {
                                            int iM25619 = (C0630.m2566("᩺۟") ^ i48) * 37;
                                            sArr20 = sArr20;
                                            textView15 = textView14;
                                            i56 = i56;
                                            c29717 = c29717;
                                            i57 = i57;
                                            view6 = view5;
                                            c29716 = c29718;
                                            i49 = ((iM25619 ^ i47) * (-9769)) ^ (-1838968642);
                                            i52 = i52;
                                            i50 = iM25619 ^ (-2082860208);
                                        }
                                        break;
                                    case 1382316266:
                                    case 1791793673:
                                        view5 = view6;
                                        C2105.m6978(textView15, i51 ^ i54);
                                        interfaceC13049M4378 = C1294.m4377(ApplicationC20075.f65008);
                                        if (C1504.f5354) {
                                            iM6989 = C0630.m2566("ۚ֡") ^ i48;
                                            i44 = ((iM6989 ^ i47) * 10069) ^ 1389574390;
                                            i45 = -652662182;
                                        } else {
                                            iM6989 = (i47 - C2105.m6981("᩸۫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i44 = ((iM6989 ^ i48) * (-22323)) ^ (-621294160);
                                            i45 = 852469058;
                                        }
                                        i50 = iM6989 ^ i45;
                                        i49 = i44;
                                        view6 = view5;
                                        break;
                                    default:
                                        C0237.m1481();
                                        ViewOnClickListenerC1958.m6429();
                                        i52 = i52;
                                        view5 = view6;
                                        sArr18 = sArr20;
                                        i37 = i56;
                                        i38 = i57;
                                        iM2569 = C0630.m2566("֨ܿ") ^ i47;
                                        i49 = ((iM2569 ^ i48) * 16669) ^ 1591852545;
                                        i39 = -339483691;
                                        i50 = iM2569 ^ i39;
                                        i56 = i37;
                                        i57 = i38;
                                        view6 = view5;
                                        i52 = i52;
                                        sArr20 = sArr18;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩴۨܽ

                        /* JADX INFO: renamed from: ܶ᩸ܺ, reason: not valid java name and contains not printable characters */
                        private static final short[] f59224 = {3145, -16183, -16180, -16178, -16180, -16190};

                        {
                            int i35 = 658734253;
                            int i36 = C2958.f9394;
                            int i37 = RunnableC0588.f2309;
                            int iM2569 = C0630.m2566("ܽ۬") ^ i37;
                            int i38 = ((iM2569 ^ i36) * 1165) ^ (-2054674945);
                            int i39 = -184424480;
                            while (true) {
                                i35 = ((((i35 ^ i36) * (-943)) >> 31) & i38) ^ (iM2569 ^ i39);
                                switch (i35) {
                                    case -2111770458:
                                    case -558122401:
                                        ViewOnClickListenerC1958.m6429();
                                        throw new RuntimeException();
                                    case -1529611029:
                                    case 1928151654:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM2569 = (C0630.m2566("᩺ۢ") + i37) * (-29);
                                            i38 = ((iM2569 ^ i36) * 27109) ^ (-1776002877);
                                            i39 = 204912515;
                                        } else {
                                            iM2569 = (C0630.m2566("᩷ᩴ") + i36) * (-73);
                                            i38 = ((iM2569 ^ i37) * (-1349)) ^ (-409816729);
                                            i39 = 1818799901;
                                        }
                                        break;
                                    case -1387398265:
                                    case 476002975:
                                        if (C0630.m2564()) {
                                            iM2569 = (C2105.m6981("ۤ᩷") ^ i36) * (-63);
                                            i38 = ((iM2569 ^ i37) * 21295) ^ 953145857;
                                            i39 = -1551567017;
                                        } else {
                                            iM2569 = (C0630.m2566("᩺᩶") ^ i37) * 93;
                                            i38 = ((iM2569 ^ i36) * 22739) ^ 165837167;
                                            i39 = 955253401;
                                        }
                                        break;
                                    case -1282724492:
                                    case 1828388608:
                                        if (C1504.m5179()) {
                                            iM2569 = (C0630.m2566("ۧܽ") + i37) * 19;
                                            i38 = ((iM2569 ^ i36) * 10293) ^ (-272144687);
                                            i39 = -787177870;
                                        } else {
                                            iM2569 = (C2105.m6981("ۤ᩷") ^ i36) * (-63);
                                            i38 = ((iM2569 ^ i37) * 21295) ^ 953145857;
                                            i39 = -1551567017;
                                        }
                                        break;
                                    case -1191110141:
                                    case -1013388890:
                                        if (C3663.f11553) {
                                            iM2569 = (C2105.m6981("ۤ᩷") ^ i36) * (-63);
                                            i38 = ((iM2569 ^ i37) * 21295) ^ 953145857;
                                            i39 = -1551567017;
                                        } else {
                                            iM2569 = (C0630.m2566("ܶۢ") ^ i36) * 87;
                                            i38 = ((iM2569 ^ i37) * 14431) ^ (-1062175546);
                                            i39 = -470859062;
                                        }
                                        break;
                                    case -1127155059:
                                    case -426625068:
                                        if (C3746.f11829 <= 0) {
                                            iM2569 = C0630.m2566("ۙܰ") ^ i36;
                                            i38 = ((iM2569 ^ i37) * (-9299)) ^ (-1427388177);
                                            i39 = 1219120694;
                                        } else {
                                            iM2569 = C0630.m2566("֨֫") ^ i36;
                                            i38 = ((iM2569 ^ i37) * 21967) ^ 861873918;
                                            i39 = -1734628319;
                                        }
                                        break;
                                    case -1115140138:
                                    case 451737434:
                                        C3432.m10477();
                                        C22628.m50615();
                                        iM2569 = (C0630.m2566("᩺ۢ") + i37) * (-29);
                                        i38 = ((iM2569 ^ i36) * 27109) ^ (-1776002877);
                                        i39 = 204912515;
                                        break;
                                    case -988730303:
                                    case -676845570:
                                        return;
                                    case -982140620:
                                    case 1603046142:
                                        if (C3432.f10845 >= 0) {
                                            iM2569 = C2105.m6981("۠ۗ") ^ i37;
                                            i38 = ((iM2569 ^ i36) * (-27101)) ^ (-868246271);
                                            i39 = -1531677160;
                                        } else {
                                            iM2569 = (i36 - C0630.m2566("ܳ۬")) * (-109);
                                            i38 = ((iM2569 ^ i37) * (-31649)) ^ 479855061;
                                            i39 = -1620395078;
                                        }
                                        break;
                                    case -823851465:
                                    case 252935891:
                                        if (C4616.f14690 > 0) {
                                            iM2569 = (C0630.m2566("᩺ۢ") + i37) * (-29);
                                            i38 = ((iM2569 ^ i36) * 27109) ^ (-1776002877);
                                            i39 = 204912515;
                                        } else {
                                            iM2569 = C2105.m6981("ۛ᩵") ^ i36;
                                            i38 = ((iM2569 ^ i37) * (-7301)) ^ 1971227753;
                                            i39 = -211450008;
                                        }
                                        break;
                                    case -742993062:
                                    case 105362181:
                                        C3537.m10746();
                                        if (!C2126.f7087) {
                                            iM2569 = C0630.m2566("ۙܰ") ^ i36;
                                            i38 = ((iM2569 ^ i37) * (-9299)) ^ (-1427388177);
                                            i39 = 1219120694;
                                        } else {
                                            iM2569 = C2105.m6981("۠ۗ") ^ i37;
                                            i38 = ((iM2569 ^ i36) * (-27101)) ^ (-868246271);
                                            i39 = -1531677160;
                                        }
                                        break;
                                    case -700200305:
                                    case 605042128:
                                        if (C5695.f17556 >= 0) {
                                            iM2569 = (C2105.m6981("ۤ᩷") ^ i36) * (-63);
                                            i38 = ((iM2569 ^ i37) * 21295) ^ 953145857;
                                            i39 = -1551567017;
                                        } else {
                                            iM2569 = C2105.m6981("ܶ۫") ^ i37;
                                            i38 = ((iM2569 ^ i36) * (-10697)) ^ 2122378502;
                                            i39 = -350856260;
                                        }
                                        break;
                                    case -334022809:
                                    case 1953923825:
                                        if (C3911.f12484 >= 0) {
                                            iM2569 = C0630.m2566("ۙܰ") ^ i36;
                                            i38 = ((iM2569 ^ i37) * (-9299)) ^ (-1427388177);
                                            i39 = 1219120694;
                                        } else {
                                            iM2569 = (i37 - C0630.m2566("ۧܺ")) * 93;
                                            i38 = ((iM2569 ^ i36) * (-25347)) ^ (-1149647387);
                                            i39 = 894320184;
                                        }
                                        break;
                                    case 506057726:
                                    case 1840890805:
                                        if (C21923.f70183 != 0) {
                                            iM2569 = C2105.m6981("۠ۗ") ^ i37;
                                            i38 = ((iM2569 ^ i36) * (-27101)) ^ (-868246271);
                                            i39 = -1531677160;
                                        } else {
                                            iM2569 = (i36 - C2105.m6981("᩹᩷")) * 21;
                                            i38 = ((iM2569 ^ i37) * (-5147)) ^ 1561543509;
                                            i39 = 1065764157;
                                        }
                                        break;
                                    case 1028608576:
                                    case 1866264332:
                                        C3683.m11222();
                                        if (C1128.f4106 <= 0) {
                                            iM2569 = C0630.m2566("ۙܰ") ^ i36;
                                            i38 = ((iM2569 ^ i37) * (-9299)) ^ (-1427388177);
                                            i39 = 1219120694;
                                        } else {
                                            iM2569 = (C0630.m2566("᩺ۢ") + i37) * (-29);
                                            i38 = ((iM2569 ^ i36) * 27109) ^ (-1776002877);
                                            i39 = 204912515;
                                        }
                                        break;
                                    default:
                                        if (C0237.f1507 != 0) {
                                            iM2569 = C0630.m2566("ۙܰ") ^ i36;
                                            i38 = ((iM2569 ^ i37) * (-9299)) ^ (-1427388177);
                                            i39 = 1219120694;
                                        } else {
                                            iM2569 = (C2105.m6981("֫ۜ") ^ i37) * 5;
                                            i38 = ((iM2569 ^ i36) * 5645) ^ (-1555500664);
                                            i39 = -1192659915;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:62:0x0216 A[PHI: r7 r12 r13
                          0x0216: PHI (r7v4 l.۫ۤۡ) = (r7v2 l.۫ۤۡ), (r7v2 l.۫ۤۡ), (r7v5 l.۫ۤۡ) binds: [B:61:0x0214, B:14:0x0069, B:95:0x0216] A[DONT_GENERATE, DONT_INLINE]
                          0x0216: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v5 short[]) binds: [B:61:0x0214, B:14:0x0069, B:95:0x0216] A[DONT_GENERATE, DONT_INLINE]
                          0x0216: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:61:0x0214, B:14:0x0069, B:95:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:70:0x025c  */
                        /* JADX WARN: Code duplicated, block: B:74:0x0289  */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            int iM6988;
                            int i35;
                            int i36;
                            int iM2569;
                            int i37;
                            short[] sArr18;
                            C18741 c18741 = this;
                            int i38 = ServiceConnectionC3453.f10921;
                            int i39 = C3019.f9544;
                            int iM6989 = (i38 - C2105.m6981("ܿ᩹")) * (-125);
                            int i40 = ((iM6989 ^ i39) * 11603) ^ 1464156688;
                            View view5 = null;
                            short[] sArr19 = null;
                            short[] sArr20 = null;
                            int i41 = iM6989 ^ (-1893801601);
                            TextView textView14 = null;
                            int i42 = 0;
                            short s2 = 0;
                            int i43 = 0;
                            int i44 = 0;
                            int i45 = 0;
                            int i46 = -699668479;
                            InterfaceC12344 interfaceC12344 = null;
                            int i47 = 0;
                            while (true) {
                                i46 = i41 ^ (i40 & (((i46 ^ i39) * (-30563)) >> 31));
                                switch (i46) {
                                    case -2067659871:
                                    case 1651227084:
                                        if (C3746.f11829 <= 0) {
                                            iM2569 = C2105.m6981("ۗۖ") ^ i38;
                                            i40 = ((iM2569 ^ i39) * (-25447)) ^ 528900767;
                                            i37 = -403665379;
                                        } else {
                                            iM2569 = C0630.m2566("ۤ֨") ^ i38;
                                            i40 = ((iM2569 ^ i39) * 17409) ^ (-1229838318);
                                            i37 = 1488528368;
                                        }
                                        i41 = iM2569 ^ i37;
                                        c18741 = this;
                                        break;
                                    case -2023668435:
                                    case 352179089:
                                        i44 = 25901;
                                        iM6988 = C2105.m6981("۠᩹") ^ i38;
                                        i35 = ((iM6988 ^ i39) * (-3705)) ^ 86250290;
                                        i36 = 235754981;
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                    case -1787356275:
                                    case -217680324:
                                        interfaceC12344 = ApplicationC20075.f65008;
                                        sArr20 = f59224;
                                        i45 = 1;
                                        if (RunnableC0588.f2309 < 0) {
                                            iM6988 = (i38 - C2105.m6981("ۘܽ")) * (-15);
                                            i35 = ((iM6988 ^ i39) * (-235)) ^ (-2004095202);
                                            i36 = -858030144;
                                            i41 = iM6988 ^ i36;
                                            i40 = i35;
                                        } else {
                                            iM2569 = C2105.m6981("ۗۖ") ^ i38;
                                            i40 = ((iM2569 ^ i39) * (-25447)) ^ 528900767;
                                            i37 = -403665379;
                                            i41 = iM2569 ^ i37;
                                            c18741 = this;
                                        }
                                        break;
                                    case -1669616611:
                                    case 1410801298:
                                        if (C0630.f2410 <= 0) {
                                            sArr18 = sArr19;
                                            int iM25610 = C0630.m2566("᩻᩺") ^ i39;
                                            i35 = ((iM25610 ^ i38) * (-25509)) ^ 575505162;
                                            i41 = iM25610 ^ 1017271188;
                                            c18741 = this;
                                            sArr19 = sArr18;
                                            i40 = i35;
                                        } else {
                                            iM2569 = C2105.m6981("᩻۠") ^ i38;
                                            i40 = ((iM2569 ^ i39) * 15837) ^ 614525527;
                                            i37 = -1672219699;
                                            i41 = iM2569 ^ i37;
                                            c18741 = this;
                                        }
                                        break;
                                    case -1614716540:
                                    case -423300905:
                                        C0798.m2998();
                                        C0964.m3413();
                                        break;
                                    case -1269953084:
                                    case 119181842:
                                        if (C3537.f11231 >= 0) {
                                            iM2569 = C2105.m6981("᩻۠") ^ i38;
                                            i40 = ((iM2569 ^ i39) * 15837) ^ 614525527;
                                            i37 = -1672219699;
                                        } else {
                                            iM2569 = C0630.m2566("ۢۢ") ^ i39;
                                            i40 = ((iM2569 ^ i38) * (-29753)) ^ 794142536;
                                            i37 = -1627905605;
                                        }
                                        i41 = iM2569 ^ i37;
                                        c18741 = this;
                                        break;
                                    case -1221329876:
                                    case -211406510:
                                        C1128.m3853(textView14, i47);
                                        C1128.m3853(view5, i42);
                                        iM6988 = C2105.m6981("ۘۧ") ^ i39;
                                        i35 = ((iM6988 ^ i38) * (-3479)) ^ (-1458468330);
                                        i36 = 2027309426;
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                    case -1192970464:
                                    case 1966764616:
                                        s2 = sArr19[0];
                                        if (C4117.f13076 <= 0) {
                                            iM6988 = (C0630.m2566("ܰۚ") ^ i39) * (-127);
                                            i35 = ((iM6988 ^ i38) * 24681) ^ (-1879959115);
                                            i36 = 1224483272;
                                        } else {
                                            iM6988 = C2105.m6981("ۤۙ") ^ i39;
                                            i35 = ((iM6988 ^ i38) * (-3523)) ^ (-1633985212);
                                            i36 = -619875563;
                                        }
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                    case -1071038723:
                                    case 2138665856:
                                        if (C1047.m3599() >= 0) {
                                            iM2569 = (C2105.m6981("֫᩺") ^ i39) * q.h;
                                            i40 = ((iM2569 ^ i38) * 25161) ^ 624420024;
                                            i37 = -1736490393;
                                        } else {
                                            iM2569 = (C0630.m2566("ۛᩳ") ^ i38) * 7;
                                            i40 = ((iM2569 ^ i39) * 26031) ^ 1047768256;
                                            i37 = 97981115;
                                        }
                                        i41 = iM2569 ^ i37;
                                        c18741 = this;
                                        break;
                                    case -1035255180:
                                    case -788490949:
                                        C2520.m8026();
                                        if (C0630.f2410 > 0) {
                                            iM2569 = (C2105.m6981("֫᩺") ^ i39) * q.h;
                                            i40 = ((iM2569 ^ i38) * 25161) ^ 624420024;
                                            i37 = -1736490393;
                                        } else {
                                            iM2569 = C2105.m6981("᩻۠") ^ i38;
                                            i40 = ((iM2569 ^ i39) * 15837) ^ 614525527;
                                            i37 = -1672219699;
                                        }
                                        i41 = iM2569 ^ i37;
                                        c18741 = this;
                                        break;
                                    case -998693507:
                                    case 2126686235:
                                        if (C0483.f2088 < 0) {
                                            iM2569 = C0630.m2566("۟ۜ") ^ i39;
                                            i40 = ((iM2569 ^ i38) * 32763) ^ (-206735790);
                                            i37 = 763915472;
                                            i41 = iM2569 ^ i37;
                                            c18741 = this;
                                        } else {
                                            sArr18 = sArr19;
                                            int iM25611 = C0630.m2566("᩻᩺") ^ i39;
                                            i35 = ((iM25611 ^ i38) * (-25509)) ^ 575505162;
                                            i41 = iM25611 ^ 1017271188;
                                            c18741 = this;
                                            sArr19 = sArr18;
                                            i40 = i35;
                                        }
                                        break;
                                    case -782367077:
                                    case -675087742:
                                        C22870.m50970(interfaceC12344, C21923.m49334(sArr20, i45, 5, i44), z);
                                        iM6988 = (C0630.m2566("᩵۟") + i39) * (-95);
                                        i35 = ((iM6988 ^ i38) * (-14865)) ^ 414756933;
                                        i36 = -1683478642;
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                    case -727183176:
                                    case 498555149:
                                        if ((36060 * s2) - i43 > 0) {
                                            iM6988 = (i39 - C2105.m6981("ۤ᩺")) * 73;
                                            i35 = ((iM6988 ^ i38) * (-18549)) ^ 1628160610;
                                            i36 = -701100869;
                                        } else {
                                            iM6988 = C0630.m2566("ܽۛ") ^ i38;
                                            i35 = ((iM6988 ^ i39) * 24735) ^ (-1602539621);
                                            i36 = 3060830;
                                        }
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                    case -486912244:
                                    case 1171736337:
                                        if (C0714.m2804(c29713)) {
                                            iM6988 = (C0630.m2566("᩵۟") + i39) * (-95);
                                            i35 = ((iM6988 ^ i38) * (-14865)) ^ 414756933;
                                            i36 = -1683478642;
                                        } else {
                                            iM6988 = (i38 - C2105.m6981("֫᩸")) * 95;
                                            i35 = ((iM6988 ^ i39) * 24989) ^ (-2035961625);
                                            i36 = -564130435;
                                        }
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                    case -414346774:
                                    case 185049522:
                                        C3663.m11168();
                                        iM2569 = (C2105.m6981("֫᩺") ^ i39) * q.h;
                                        i40 = ((iM2569 ^ i38) * 25161) ^ 624420024;
                                        i37 = -1736490393;
                                        i41 = iM2569 ^ i37;
                                        c18741 = this;
                                        break;
                                    case -321280496:
                                    case 59994761:
                                        i44 = 49325;
                                        iM6988 = C2105.m6981("۠᩹") ^ i38;
                                        i35 = ((iM6988 ^ i39) * (-3705)) ^ 86250290;
                                        i36 = 235754981;
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                    case 512425873:
                                    case 969350227:
                                        if (C4263.f13799 > 0) {
                                            iM2569 = C0630.m2566("᩸ۗ") ^ i39;
                                            i40 = ((iM2569 ^ i38) * 1269) ^ 2098527750;
                                            i37 = 1767944462;
                                            i41 = iM2569 ^ i37;
                                            c18741 = this;
                                        } else {
                                            sArr18 = sArr19;
                                            int iM25612 = C0630.m2566("᩻᩺") ^ i39;
                                            i35 = ((iM25612 ^ i38) * (-25509)) ^ 575505162;
                                            i41 = iM25612 ^ 1017271188;
                                            c18741 = this;
                                            sArr19 = sArr18;
                                            i40 = i35;
                                        }
                                        break;
                                    case 610446558:
                                    case 836305056:
                                        textView14 = textView13;
                                        view5 = view4;
                                        i42 = 0;
                                        i47 = 8;
                                        if (z) {
                                            iM6988 = C0630.m2566("᩶ۖ") ^ i38;
                                            i35 = ((iM6988 ^ i39) * 20669) ^ (-436065186);
                                            i36 = 1539781244;
                                        } else {
                                            iM6988 = (C0630.m2566("ۢ᩺") + i39) * (-31);
                                            i35 = ((iM6988 ^ i38) * (-18989)) ^ 931547386;
                                            i36 = -1517371778;
                                        }
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                    case 748560574:
                                    case 1890008440:
                                        C3537.m10746();
                                        if (C5695.f17556 >= 0) {
                                            iM2569 = (C2105.m6981("֫᩺") ^ i39) * q.h;
                                            i40 = ((iM2569 ^ i38) * 25161) ^ 624420024;
                                            i37 = -1736490393;
                                        } else {
                                            iM2569 = C2105.m6981("ۗۖ") ^ i38;
                                            i40 = ((iM2569 ^ i39) * (-25447)) ^ 528900767;
                                            i37 = -403665379;
                                        }
                                        i41 = iM2569 ^ i37;
                                        c18741 = this;
                                        break;
                                    case 785638915:
                                    case 1935242251:
                                        sArr18 = f59224;
                                        if (ViewOnClickListenerC1958.f6529 > 0) {
                                            int iM69810 = C2105.m6981("ۜᩳ") ^ i38;
                                            i41 = iM69810 ^ 1410575687;
                                            sArr19 = sArr18;
                                            i40 = ((iM69810 ^ i39) * 20637) ^ 770275059;
                                            c18741 = this;
                                        } else {
                                            int iM25613 = C0630.m2566("᩻᩺") ^ i39;
                                            i35 = ((iM25613 ^ i38) * (-25509)) ^ 575505162;
                                            i41 = iM25613 ^ 1017271188;
                                            c18741 = this;
                                            sArr19 = sArr18;
                                            i40 = i35;
                                        }
                                        break;
                                    case 917251728:
                                    case 1021415349:
                                        i43 = (s2 * s2) + 325080900;
                                        if (C1420.f5096 > 0) {
                                            iM6988 = C0630.m2566("᩻ܿ") ^ i39;
                                            i35 = ((iM6988 ^ i38) * 18101) ^ (-1980972479);
                                            i36 = 956999020;
                                            i41 = iM6988 ^ i36;
                                            i40 = i35;
                                        }
                                        sArr18 = sArr19;
                                        int iM25614 = C0630.m2566("᩻᩺") ^ i39;
                                        i35 = ((iM25614 ^ i38) * (-25509)) ^ 575505162;
                                        i41 = iM25614 ^ 1017271188;
                                        c18741 = this;
                                        sArr19 = sArr18;
                                        i40 = i35;
                                        break;
                                    case 920583931:
                                    case 2132201987:
                                        if (C2958.f9394 >= 0) {
                                            iM2569 = C2105.m6981("᩻۠") ^ i38;
                                            i40 = ((iM2569 ^ i39) * 15837) ^ 614525527;
                                            i37 = -1672219699;
                                        } else {
                                            iM2569 = C0630.m2566("᩹ۡ") ^ i38;
                                            i40 = ((iM2569 ^ i39) * (-15875)) ^ 1937889578;
                                            i37 = -718024021;
                                        }
                                        i41 = iM2569 ^ i37;
                                        c18741 = this;
                                        break;
                                    case 1058502119:
                                    case 1416806580:
                                        break;
                                    default:
                                        C1128.m3853(textView14, i42);
                                        C1128.m3853(view5, i47);
                                        iM6988 = C2105.m6981("ۘۧ") ^ i39;
                                        i35 = ((iM6988 ^ i38) * (-3479)) ^ (-1458468330);
                                        i36 = 2027309426;
                                        i41 = iM6988 ^ i36;
                                        i40 = i35;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    int iM6988 = C2105.m6981("ۧۡ") ^ i24;
                    i27 = iM6988 ^ (-1363320807);
                    textView7 = textView13;
                    i34 = ((iM6988 ^ i23) * 5815) ^ (-1745634087);
                    c10237 = c10235;
                    c19258M2130 = c19258;
                    break;
                case -1752663479:
                case 903156579:
                    if (C4117.m12364() == 0) {
                        iM6982 = C2105.m6981("֫ܿ") ^ i24;
                        i20 = ((iM6982 ^ i23) * 31061) ^ (-491176377);
                        i21 = 1470795695;
                    } else {
                        iM6982 = (C0630.m2566("ۗ۠") + i24) * (-121);
                        i20 = ((iM6982 ^ i23) * 26921) ^ (-450732337);
                        i21 = 65386395;
                    }
                    i27 = iM6982 ^ i21;
                    i34 = i20;
                    break;
                case -1656922564:
                case 785898823:
                    c192512 = c19258M2130;
                    textView5 = textView8;
                    viewOnClickListenerC14056 = viewOnClickListenerC14058;
                    textView7 = textView7;
                    sArr9 = sArr15;
                    i13 = i31;
                    sArr10 = sArr16;
                    sArr11 = sArr17;
                    i14 = i33;
                    c29711 = c29713;
                    c29712 = c29712;
                    TextView textView14 = textView6;
                    strM1959 = strM1959;
                    textView = textView14;
                    c10237.m30477(strM24614);
                    i15 = i32;
                    view3 = view4;
                    str3 = "";
                    C22628.m50616(c10237, C4263.m12825(ApplicationC20075.f65008, RunnableC0588.m2436(f72243, 25, 5, i25), ""));
                    if (c10237.m30526() == 0) {
                        iM2567 = C0630.m2566("᩻۬") ^ i24;
                        i16 = ((iM2567 ^ i23) * 16489) ^ (-1295850294);
                        i17 = 1026771117;
                    } else {
                        iM2567 = (C0630.m2566("ۖ᩵") ^ i24) * (-109);
                        i16 = ((iM2567 ^ i23) * (-4765)) ^ 1212900307;
                        i17 = -274502582;
                    }
                    i27 = iM2567 ^ i17;
                    i34 = i16;
                    i33 = i14;
                    i32 = i15;
                    sArr17 = sArr11;
                    c29713 = c29711;
                    view4 = view3;
                    c19258M2130 = c192512;
                    textView8 = textView5;
                    sArr16 = sArr10;
                    sArr15 = sArr9;
                    i31 = i13;
                    viewOnClickListenerC14058 = viewOnClickListenerC14056;
                    str5 = str3;
                    c29712 = c29712;
                    textView7 = textView7;
                    String str9 = strM1959;
                    textView6 = textView;
                    strM1959 = str9;
                    break;
                case -1652082889:
                case -404314786:
                    view2 = view4;
                    c192510 = c19258M2130;
                    str2 = str5;
                    textView3 = textView8;
                    viewOnClickListenerC14055 = viewOnClickListenerC14058;
                    textView4 = textView7;
                    sArr5 = sArr14;
                    sArr6 = sArr15;
                    i8 = i31;
                    i9 = i32;
                    short[] sArr18 = sArr16;
                    sArr7 = sArr17;
                    i10 = i33;
                    c29710 = c29713;
                    TextView textView15 = textView6;
                    strM1959 = strM1959;
                    textView = textView15;
                    C2978 c29716 = (C2978) C1005.m3507(viewM9259, C0630.m2566(strM9934) ^ 2126298624);
                    int iM6989 = C2105.m6981(C0483.m2128(f72243, 13, 3, i25));
                    if (AbstractC2021.f6743 <= 0) {
                        c29712 = c29716;
                        sArr16 = sArr18;
                        i28 = iM6989;
                        int iM2569 = (C0630.m2566("۠۫") + i23) * (-99);
                        i11 = ((iM2569 ^ i24) * (-11051)) ^ (-2000252281);
                        sArr14 = sArr5;
                        i33 = i10;
                        i32 = i9;
                        sArr17 = sArr7;
                        c29713 = c29710;
                        view4 = view2;
                        c19258M2130 = c192510;
                        textView8 = textView3;
                        textView7 = textView4;
                        sArr15 = sArr6;
                        i31 = i8;
                        viewOnClickListenerC14058 = viewOnClickListenerC14055;
                        str5 = str2;
                        i27 = iM2569 ^ (-694770196);
                    } else {
                        int iM25610 = C0630.m2566("ۘ᩵") ^ i23;
                        i11 = ((iM25610 ^ i24) * (-15233)) ^ (-2010491487);
                        sArr14 = sArr5;
                        i33 = i10;
                        i32 = i9;
                        sArr17 = sArr7;
                        c29713 = c29710;
                        view4 = view2;
                        c19258M2130 = c192510;
                        textView8 = textView3;
                        sArr16 = sArr18;
                        textView7 = textView4;
                        sArr15 = sArr6;
                        i31 = i8;
                        viewOnClickListenerC14058 = viewOnClickListenerC14055;
                        str5 = str2;
                        i27 = iM25610 ^ 1949142095;
                        c29712 = c29716;
                        i28 = iM6989;
                    }
                    i34 = i11;
                    String str10 = strM1959;
                    textView6 = textView;
                    strM1959 = str10;
                    break;
                case -1527681291:
                case 1227582726:
                    c10235 = c10237;
                    C0964.m3401(c29714, zM3400);
                    c19258 = c19258M2130;
                    C4263.m12814(c29712, C0964.m3400(ApplicationC20075.f65008, C1294.m4373(f72243, 73, 5, i25), false));
                    iM2566 = (C2105.m6981("᩵ܽ") + i24) * 41;
                    i = ((iM2566 ^ i23) * (-14189)) ^ 237676988;
                    i2 = 1181346843;
                    i27 = iM2566 ^ i2;
                    i34 = i;
                    c10237 = c10235;
                    c19258M2130 = c19258;
                    break;
                case -1497649636:
                case -1446316847:
                    c10236 = c10237;
                    C5695.m16035(c19258M2130, C0630.m2566(C3245.m9934(f72243, 81, 3, i25)) ^ 2120883030, obj);
                    if (C4117.m12364() == 0) {
                        iM2568 = C0630.m2566("ۛۛ") ^ i23;
                        i18 = ((iM2568 ^ i24) * (-26109)) ^ (-1949368496);
                        i19 = 468582408;
                        i27 = iM2568 ^ i19;
                        i34 = i18;
                        c10237 = c10236;
                    } else {
                        c19259 = c19258M2130;
                        str5 = str5;
                        textView2 = textView8;
                        viewOnClickListenerC14054 = viewOnClickListenerC14058;
                        textView7 = textView7;
                        c10237 = c10236;
                        sArr12 = sArr12;
                        sArr15 = sArr15;
                        i31 = i31;
                        i32 = i32;
                        sArr3 = sArr16;
                        sArr4 = sArr17;
                        i6 = i33;
                        c2979 = c29713;
                        c29712 = c29712;
                        view = view4;
                        sArr2 = sArr14;
                        int iM25611 = C0630.m2566("ᩳ۟") ^ i24;
                        sArr12 = sArr12;
                        sArr14 = sArr2;
                        i33 = i6;
                        i32 = i32;
                        sArr17 = sArr4;
                        c29713 = c2979;
                        view4 = view;
                        c19258M2130 = c19259;
                        textView8 = textView2;
                        sArr16 = sArr3;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14054;
                        str5 = str5;
                        i27 = iM25611 ^ 325973871;
                        i34 = ((iM25611 ^ i23) * (-5707)) ^ 1482946623;
                        c29712 = c29712;
                        textView7 = textView7;
                    }
                    break;
                case -1449935194:
                case 948454948:
                    sArr = sArr13;
                    i3 = i30;
                    c2978 = c29713;
                    textView = textView6;
                    this.f72246 = c16560;
                    this.f72245 = abstractC15440;
                    viewM9259 = C3019.m9259(C21923.m49336(c16560), C2105.m6981(C1773.m5917(f72243, 1, 3, i25)) ^ 2123406131);
                    sArr12 = f72243;
                    iM6981 = (i24 - C2105.m6981("᩻᩻")) * 101;
                    i4 = ((iM6981 ^ i23) * (-4973)) ^ 1033769973;
                    i5 = 250115493;
                    i7 = iM6981 ^ i5;
                    sArr14 = sArr14;
                    i33 = i33;
                    i32 = i32;
                    sArr17 = sArr17;
                    c29713 = c2978;
                    view4 = view4;
                    c19258M2130 = c19258M2130;
                    textView8 = textView8;
                    sArr16 = sArr16;
                    sArr15 = sArr15;
                    i31 = i31;
                    viewOnClickListenerC14058 = viewOnClickListenerC14058;
                    str5 = str5;
                    sArr13 = sArr;
                    i30 = i3;
                    i27 = i7;
                    i34 = i4;
                    c29712 = c29712;
                    textView7 = textView7;
                    String str11 = strM1959;
                    textView6 = textView;
                    strM1959 = str11;
                    break;
                case -1437924499:
                case 1550903793:
                    view4 = view4;
                    c192511 = c19258M2130;
                    str5 = str5;
                    textView8 = textView8;
                    viewOnClickListenerC14058 = viewOnClickListenerC14058;
                    textView7 = textView7;
                    sArr15 = sArr15;
                    i31 = i31;
                    i32 = i32;
                    sArr16 = sArr16;
                    sArr8 = sArr17;
                    i12 = i33;
                    c29713 = c29713;
                    c29712 = c29712;
                    TextView textView16 = textView6;
                    strM1959 = strM1959;
                    textView = textView16;
                    c10237 = (C10235) C11340.m28028(viewM9259, C0630.m2566(C2105.m6988(f72243, 19, 3, i25)) ^ 2119049131);
                    sArr14 = f72243;
                    if (!C4159.f13567) {
                        i33 = i12;
                        sArr17 = sArr8;
                        c19258M2130 = c192511;
                        int iM69810 = C2105.m6981("ܶܶ") ^ i23;
                        i27 = iM69810 ^ (-734645922);
                        i34 = ((iM69810 ^ i24) * 16195) ^ (-754912372);
                        i32 = i32;
                        c29713 = c29713;
                        c29712 = c29712;
                        view4 = view4;
                        textView8 = textView8;
                        sArr16 = sArr16;
                        textView7 = textView7;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14058;
                        str5 = str5;
                        String str12 = strM1959;
                        textView6 = textView;
                        strM1959 = str12;
                    } else {
                        int iM25612 = (C0630.m2566("ۜܽ") ^ i24) * (-43);
                        i27 = iM25612 ^ 1266163495;
                        i34 = ((iM25612 ^ i23) * 31197) ^ (-535898935);
                        i33 = i12;
                        i32 = i32;
                        sArr17 = sArr8;
                        c29713 = c29713;
                        c29712 = c29712;
                        view4 = view4;
                        c19258M2130 = c192511;
                        textView8 = textView8;
                        sArr16 = sArr16;
                        textView7 = textView7;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14058;
                        str5 = str5;
                        String str13 = strM1959;
                        textView6 = textView;
                        strM1959 = str13;
                    }
                    break;
                case -1402183126:
                case 462138812:
                    C21923.m49331(c10237, c10237.m30509());
                    view3 = view4;
                    c192512 = c19258M2130;
                    textView5 = textView8;
                    viewOnClickListenerC14056 = viewOnClickListenerC14058;
                    textView7 = textView7;
                    sArr9 = sArr15;
                    i13 = i31;
                    sArr10 = sArr16;
                    sArr11 = sArr17;
                    i14 = i33;
                    c29711 = c29713;
                    c29712 = c29712;
                    str3 = str5;
                    i15 = i32;
                    TextView textView17 = textView6;
                    strM1959 = strM1959;
                    textView = textView17;
                    iM2567 = (C0630.m2566("ۖ᩵") ^ i24) * (-109);
                    i16 = ((iM2567 ^ i23) * (-4765)) ^ 1212900307;
                    i17 = -274502582;
                    i27 = iM2567 ^ i17;
                    i34 = i16;
                    i33 = i14;
                    i32 = i15;
                    sArr17 = sArr11;
                    c29713 = c29711;
                    view4 = view3;
                    c19258M2130 = c192512;
                    textView8 = textView5;
                    sArr16 = sArr10;
                    sArr15 = sArr9;
                    i31 = i13;
                    viewOnClickListenerC14058 = viewOnClickListenerC14056;
                    str5 = str3;
                    c29712 = c29712;
                    textView7 = textView7;
                    String str14 = strM1959;
                    textView6 = textView;
                    strM1959 = str14;
                    break;
                case -1289123708:
                case 1303822473:
                    if (C5695.f17556 < 0) {
                        str5 = str5;
                        textView8 = textView8;
                        viewOnClickListenerC14058 = viewOnClickListenerC14058;
                        textView7 = textView7;
                        TextView textView18 = textView6;
                        strM1959 = strM1959;
                        textView = textView18;
                        int iM69811 = C2105.m6981("ܶܶ") ^ i23;
                        i27 = iM69811 ^ (-734645922);
                        i34 = ((iM69811 ^ i24) * 16195) ^ (-754912372);
                        i32 = i32;
                        c29713 = c29713;
                        c29712 = c29712;
                        view4 = view4;
                        textView8 = textView8;
                        sArr16 = sArr16;
                        textView7 = textView7;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14058;
                        str5 = str5;
                        String str15 = strM1959;
                        textView6 = textView;
                        strM1959 = str15;
                    }
                    view2 = view4;
                    c192510 = c19258M2130;
                    str2 = str5;
                    textView3 = textView8;
                    viewOnClickListenerC14055 = viewOnClickListenerC14058;
                    textView4 = textView7;
                    sArr5 = sArr14;
                    sArr6 = sArr15;
                    i8 = i31;
                    i9 = i32;
                    sArr7 = sArr17;
                    i10 = i33;
                    c29710 = c29713;
                    TextView textView19 = textView6;
                    strM1959 = strM1959;
                    textView = textView19;
                    int iM25613 = (C0630.m2566("۠۫") + i23) * (-99);
                    i11 = ((iM25613 ^ i24) * (-11051)) ^ (-2000252281);
                    sArr14 = sArr5;
                    i33 = i10;
                    i32 = i9;
                    sArr17 = sArr7;
                    c29713 = c29710;
                    view4 = view2;
                    c19258M2130 = c192510;
                    textView8 = textView3;
                    textView7 = textView4;
                    sArr15 = sArr6;
                    i31 = i8;
                    viewOnClickListenerC14058 = viewOnClickListenerC14055;
                    str5 = str2;
                    i27 = iM25613 ^ (-694770196);
                    i34 = i11;
                    String str16 = strM1959;
                    textView6 = textView;
                    strM1959 = str16;
                    break;
                case -1178841868:
                case 1900054731:
                    ServiceConnectionC3453.m10564();
                    iM6982 = C2105.m6981("֫ܿ") ^ i24;
                    i20 = ((iM6982 ^ i23) * 31061) ^ (-491176377);
                    i21 = 1470795695;
                    i27 = iM6982 ^ i21;
                    i34 = i20;
                    break;
                case -1054018597:
                case 1538875826:
                    C10235 c10239 = c10237;
                    TextView textView20 = textView6;
                    ViewOnClickListenerC14054 viewOnClickListenerC14059 = viewOnClickListenerC14058;
                    TextView textView21 = textView7;
                    C2978 c29717 = c29713;
                    String str17 = strM1959;
                    C1047.m3601(textView20, str17);
                    textView = textView20;
                    strM1959 = str17;
                    C2978 c29718 = c29712;
                    TextView textView22 = (TextView) C1005.m3507(viewM9259, C0630.m2566(C2105.m6988(f72243, 43, 3, i25)) ^ 2122681075);
                    int iM25614 = (C0630.m2566("ۘ᩸") + i24) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    int i35 = ((iM25614 ^ i23) * (-15991)) ^ (-2036090872);
                    i27 = iM25614 ^ (-2098204730);
                    i33 = i33;
                    sArr17 = sArr17;
                    c29713 = c29717;
                    c19258M2130 = c19258M2130;
                    textView8 = textView22;
                    i34 = i35;
                    viewOnClickListenerC14058 = viewOnClickListenerC14059;
                    c29712 = c29718;
                    c10237 = c10239;
                    textView7 = textView21;
                    String str18 = strM1959;
                    textView6 = textView;
                    strM1959 = str18;
                    break;
                case -530026297:
                case 1211688261:
                    view = view4;
                    c19259 = c19258M2130;
                    str5 = str5;
                    textView2 = textView8;
                    viewOnClickListenerC14054 = viewOnClickListenerC14058;
                    textView7 = textView7;
                    sArr2 = sArr14;
                    sArr15 = sArr15;
                    i31 = i31;
                    i32 = i32;
                    sArr3 = sArr16;
                    sArr4 = sArr17;
                    i6 = i33;
                    c2979 = c29713;
                    c29712 = c29712;
                    TextView textView23 = textView6;
                    strM1959 = strM1959;
                    textView = textView23;
                    sArr12 = sArr12;
                    c29714 = (C2978) C11340.m28028(viewM9259, C0630.m2566(C3746.m11357(sArr12, 4, 3, i25)) ^ 2129139255);
                    sArr13 = f72243;
                    i30 = 7;
                    if (C2105.f7037 == 0) {
                        int iM25615 = C0630.m2566("᩺᩵") ^ i23;
                        i4 = ((iM25615 ^ i24) * (-30557)) ^ (-2092081251);
                        i7 = iM25615 ^ (-1504317205);
                        sArr12 = sArr12;
                        sArr14 = sArr2;
                        i33 = i6;
                        i32 = i32;
                        sArr17 = sArr4;
                        c29713 = c2979;
                        view4 = view;
                        c19258M2130 = c19259;
                        textView8 = textView2;
                        sArr16 = sArr3;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14054;
                        str5 = str5;
                        i27 = i7;
                        i34 = i4;
                        c29712 = c29712;
                        textView7 = textView7;
                        String str19 = strM1959;
                        textView6 = textView;
                        strM1959 = str19;
                    } else {
                        textView6 = textView;
                        strM1959 = strM1959;
                        int iM25616 = C0630.m2566("ᩳ۟") ^ i24;
                        sArr12 = sArr12;
                        sArr14 = sArr2;
                        i33 = i6;
                        i32 = i32;
                        sArr17 = sArr4;
                        c29713 = c2979;
                        view4 = view;
                        c19258M2130 = c19259;
                        textView8 = textView2;
                        sArr16 = sArr3;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14054;
                        str5 = str5;
                        i27 = iM25616 ^ 325973871;
                        i34 = ((iM25616 ^ i23) * (-5707)) ^ 1482946623;
                        c29712 = c29712;
                        textView7 = textView7;
                    }
                    break;
                case -514224222:
                case 1389461053:
                    textView = textView6;
                    short[] sArr19 = sArr13;
                    int i36 = i30;
                    c2978 = (C2978) C11340.m28028(viewM9259, C2105.m6981(C11340.m28025(sArr19, i36, 3, i25)) ^ 2099392609);
                    sArr = sArr19;
                    i3 = i36;
                    strM9934 = C3245.m9934(f72243, 10, 3, i25);
                    iM6981 = (C0630.m2566("۠ܳ") + i24) * 101;
                    i4 = ((iM6981 ^ i23) * 23539) ^ 522993663;
                    i5 = -1349293279;
                    i7 = iM6981 ^ i5;
                    sArr14 = sArr14;
                    i33 = i33;
                    i32 = i32;
                    sArr17 = sArr17;
                    c29713 = c2978;
                    view4 = view4;
                    c19258M2130 = c19258M2130;
                    textView8 = textView8;
                    sArr16 = sArr16;
                    sArr15 = sArr15;
                    i31 = i31;
                    viewOnClickListenerC14058 = viewOnClickListenerC14058;
                    str5 = str5;
                    sArr13 = sArr;
                    i30 = i3;
                    i27 = i7;
                    i34 = i4;
                    c29712 = c29712;
                    textView7 = textView7;
                    String str110 = strM1959;
                    textView6 = textView;
                    strM1959 = str110;
                    break;
                case -373084207:
                case 1896998811:
                    C2167.m7155();
                    RunnableC3474.m10630();
                    throw new RuntimeException();
                case -278324603:
                case 618167090:
                    C2520.m8033(c19258M2130, C2105.m6981(C7106.m19110(f72243, 84, 3, i25)) ^ 2129204377, obj);
                    c19258M2130.m44420(new DialogInterface.OnDismissListener() { // from class: l.֡ۨܽ

                        /* JADX INFO: renamed from: ۡ֡ۚ, reason: not valid java name and contains not printable characters */
                        private static final short[] f1845 = {1576, -24351, -24349, -24344, -24349, -24332, -24345, -24334, -24349, -24359, -24341, -24345, -24330, -24330, -24337, -24344, -24351, -24359, -24352, -24337, -24342, -24349, -24351, -24349, -24344, -24349, -24332, -24345, -24334, -24349, -24359, -24341, -24345, -24330, -24330, -24337, -24344, -24351, -24359, -24352, -24337, -24342, -24349, -24359, -24332, -24349, -24347, -24343, -24336, -24349, -24332, -24321, -24350, -24345, -24347, -24341, -24330, -24350, -24345, -24347, -24347, -24330};

                        {
                            int i37 = 116566640;
                            int i38 = AbstractC2021.f6743;
                            int i39 = C4263.f13799;
                            int iM69812 = C2105.m6981("ܳ֫") ^ i39;
                            int i40 = ((iM69812 ^ i38) * (-16165)) ^ (-1386001552);
                            int i41 = -1196253232;
                            while (true) {
                                i37 = ((((i37 ^ i38) * 20987) >> 31) & i40) ^ (iM69812 ^ i41);
                                switch (i37) {
                                    case -2027830105:
                                    case 1867234694:
                                        if (C2105.m6982() != 0) {
                                            iM69812 = C0630.m2566("ۨܳ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 17053) ^ (-1588846414);
                                            i41 = 6191783;
                                        } else {
                                            iM69812 = C0630.m2566("ۖۤ") ^ i38;
                                            i40 = ((iM69812 ^ i39) * 12341) ^ 1366096064;
                                            i41 = -2082788479;
                                        }
                                        break;
                                    case -1930538464:
                                    case 964886833:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM69812 = C0630.m2566("ܺۘ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 10379) ^ 1064206243;
                                            i41 = 50521139;
                                        } else {
                                            iM69812 = C2105.m6981("ۙۜ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 27557) ^ 658291081;
                                            i41 = -1283639636;
                                        }
                                        break;
                                    case -1761550415:
                                    case 100952099:
                                        if (C2105.f7037 != 0) {
                                            iM69812 = (i38 - C2105.m6981("ۖ᩻")) * 93;
                                            i40 = ((iM69812 ^ i39) * 19937) ^ (-597533772);
                                            i41 = -1779436940;
                                        } else {
                                            iM69812 = C0630.m2566("ۘܶ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * (-19327)) ^ 1278476592;
                                            i41 = -596513997;
                                        }
                                        break;
                                    case -1470687722:
                                    case 872582852:
                                        RunnableC0588.m2441();
                                        throw new RuntimeException();
                                    case -1090271801:
                                    case 903303099:
                                        return;
                                    case -998066392:
                                    case -294619758:
                                        C0050.m940();
                                        if (C1711.f5919) {
                                            iM69812 = C0630.m2566("ۨܳ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 17053) ^ (-1588846414);
                                            i41 = 6191783;
                                        } else {
                                            iM69812 = C2105.m6981("ۖܽ") ^ i38;
                                            i40 = ((iM69812 ^ i39) * (-21073)) ^ (-2131442151);
                                            i41 = 534020332;
                                        }
                                        break;
                                    case -713982260:
                                    case 809973477:
                                        if (C2520.f8000 >= 0) {
                                            iM69812 = (C0630.m2566("ۤܿ") ^ i38) * (-41);
                                            i40 = ((iM69812 ^ i39) * 29891) ^ 1222318003;
                                            i41 = -788694098;
                                        } else {
                                            iM69812 = C2105.m6981("᩹᩵") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 14705) ^ (-1981062097);
                                            i41 = -605212791;
                                        }
                                        break;
                                    case -603080135:
                                    case 399690923:
                                        if (RunnableC0588.m2441() >= 0) {
                                            iM69812 = (C0630.m2566("ۤܿ") ^ i38) * (-41);
                                            i40 = ((iM69812 ^ i39) * 29891) ^ 1222318003;
                                            i41 = -788694098;
                                        } else {
                                            iM69812 = C0630.m2566("ۡۘ") ^ i38;
                                            i40 = ((iM69812 ^ i39) * 9967) ^ (-1450986565);
                                            i41 = 1449485336;
                                        }
                                        break;
                                    case -399697595:
                                    case 348759040:
                                        if (AbstractC2021.m6574()) {
                                            iM69812 = C0630.m2566("ܺۘ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 10379) ^ 1064206243;
                                            i41 = 50521139;
                                        } else {
                                            iM69812 = C0630.m2566("᩶ᩴ") ^ i38;
                                            i40 = ((iM69812 ^ i39) * (-19589)) ^ (-1705670208);
                                            i41 = 1558376704;
                                        }
                                        break;
                                    case -273528387:
                                    case 164414805:
                                        if (C4263.m12819() >= 0) {
                                            iM69812 = C0630.m2566("ۨܳ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 17053) ^ (-1588846414);
                                            i41 = 6191783;
                                        } else {
                                            iM69812 = C0630.m2566("᩺᩺") ^ i38;
                                            i40 = ((iM69812 ^ i39) * 24891) ^ 1833583547;
                                            i41 = -1045880974;
                                        }
                                        break;
                                    case 13580172:
                                    case 1394145715:
                                        if (C22628.f73083 <= 0) {
                                            iM69812 = (C0630.m2566("ۤܿ") ^ i38) * (-41);
                                            i40 = ((iM69812 ^ i39) * 29891) ^ 1222318003;
                                            i41 = -788694098;
                                        } else {
                                            iM69812 = C0630.m2566("֨ܽ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 8251) ^ 443151414;
                                            i41 = -1956685190;
                                        }
                                        break;
                                    case 27750812:
                                    case 1109010588:
                                        if (C7106.m19120() <= 0) {
                                            iM69812 = C0630.m2566("ۨܳ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 17053) ^ (-1588846414);
                                            i41 = 6191783;
                                        } else {
                                            iM69812 = C0630.m2566("ۤܶ") ^ i38;
                                            i40 = ((iM69812 ^ i39) * (-695)) ^ (-1626933485);
                                            i41 = -1968707224;
                                        }
                                        break;
                                    case 88508650:
                                    case 172699709:
                                        if (C3683.m11222()) {
                                            iM69812 = (i38 - C2105.m6981("ۖ᩻")) * 93;
                                            i40 = ((iM69812 ^ i39) * 19937) ^ (-597533772);
                                            i41 = -1779436940;
                                        } else {
                                            iM69812 = C0630.m2566("᩺ۨ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * (-11725)) ^ (-687195905);
                                            i41 = 905470746;
                                        }
                                        break;
                                    case 928918469:
                                    case 1039602657:
                                        if (!C2272.f7362) {
                                            iM69812 = (i38 - C2105.m6981("ۖ᩻")) * 93;
                                            i40 = ((iM69812 ^ i39) * 19937) ^ (-597533772);
                                            i41 = -1779436940;
                                        } else {
                                            iM69812 = C0630.m2566("ۨܳ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 17053) ^ (-1588846414);
                                            i41 = 6191783;
                                        }
                                        break;
                                    case 1233048648:
                                    case 1916894437:
                                        C0382.m1848();
                                        iM69812 = C0630.m2566("ۨܳ") ^ i39;
                                        i40 = ((iM69812 ^ i38) * 17053) ^ (-1588846414);
                                        i41 = 6191783;
                                        break;
                                    default:
                                        AbstractC2021.m6574();
                                        if (C2520.f8000 >= 0) {
                                            iM69812 = C0630.m2566("ܺۘ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 10379) ^ 1064206243;
                                            i41 = 50521139;
                                        } else {
                                            iM69812 = C0630.m2566("ۨܳ") ^ i39;
                                            i40 = ((iM69812 ^ i38) * 17053) ^ (-1588846414);
                                            i41 = 6191783;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:44:0x0193 A[PHI: r3 r13 r14 r26
                          0x0193: PHI (r3v4 boolean) = (r3v3 boolean), (r3v2 boolean) binds: [B:43:0x0191, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
                          0x0193: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:43:0x0191, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
                          0x0193: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:43:0x0191, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]
                          0x0193: PHI (r26v29 l.۬ۤۡ) = (r26v21 l.۬ۤۡ), (r26v3 l.۬ۤۡ) binds: [B:43:0x0191, B:31:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            InterfaceC13049 interfaceC13049;
                            short[] sArr20;
                            int iM69812;
                            int i37;
                            int i38;
                            int iM69813;
                            int i39;
                            int iM25617;
                            int i40;
                            String strM4373;
                            int i41;
                            InterfaceC13049 interfaceC130410;
                            int iM69814;
                            int i42;
                            DialogInterfaceOnDismissListenerC0395 dialogInterfaceOnDismissListenerC0395 = this;
                            int i43 = -1260366630;
                            int i44 = C1128.f4106;
                            int i45 = C3683.f11629;
                            int iM69815 = C2105.m6981("ۛۘ") ^ i44;
                            int i46 = ((iM69815 ^ i45) * 30931) ^ 1392392130;
                            int i47 = iM69815 ^ 282924156;
                            short[] sArr21 = null;
                            short[] sArr22 = null;
                            short[] sArr23 = null;
                            int i48 = 0;
                            int i49 = 0;
                            int i50 = 0;
                            int i51 = 0;
                            int i52 = 0;
                            char c = 0;
                            short s2 = 0;
                            int i53 = 0;
                            int i54 = 0;
                            InterfaceC13049 interfaceC13049M6438 = null;
                            String strM19510 = null;
                            InterfaceC7785 interfaceC7785M3497 = null;
                            InterfaceC13049 interfaceC13049M2434 = null;
                            String strM947 = null;
                            C10235 c102310 = null;
                            InterfaceC13049 interfaceC13049M13549 = null;
                            String str20 = null;
                            boolean zM2804 = false;
                            while (true) {
                                i43 = i47 ^ (i46 & (((i43 ^ i45) * 14207) >> 31));
                                switch (i43) {
                                    case -2010901419:
                                    case 1235708091:
                                        C5695.m16023();
                                        if (!AbstractC2021.m6574()) {
                                            interfaceC13049M6438 = interfaceC13049M6438;
                                            iM25617 = C0630.m2566("᩺ۘ") ^ i44;
                                            i37 = ((iM25617 ^ i45) * (-32467)) ^ (-1372511765);
                                            i40 = 1420654170;
                                            i41 = iM25617 ^ i40;
                                            interfaceC13049M6438 = interfaceC13049M6438;
                                            i47 = i41;
                                            i46 = i37;
                                        } else {
                                            interfaceC130410 = interfaceC13049M6438;
                                            iM69814 = (C0630.m2566("ܰۛ") + i45) * (-91);
                                            i46 = ((iM69814 ^ i44) * 23137) ^ (-139549400);
                                            i42 = -1387070821;
                                            interfaceC13049M6438 = interfaceC130410;
                                            i47 = iM69814 ^ i42;
                                            dialogInterfaceOnDismissListenerC0395 = this;
                                        }
                                        break;
                                    case -2004589514:
                                    case -103296442:
                                        interfaceC13049M6438 = ViewOnClickListenerC1958.m6438(ApplicationC20075.f65008);
                                        zM2804 = C0714.m2804(c29714);
                                        if (C4263.f13799 <= 0) {
                                            iM69812 = C0630.m2566("ۤۧ") ^ i45;
                                            i37 = ((iM69812 ^ i44) * 14965) ^ (-2080844146);
                                            i38 = -871970151;
                                        } else {
                                            iM69812 = C0630.m2566("᩷ۨ") ^ i44;
                                            i37 = ((iM69812 ^ i45) * 7969) ^ 668520956;
                                            i38 = 1243715307;
                                        }
                                        i47 = iM69812 ^ i38;
                                        i46 = i37;
                                        break;
                                    case -1951842569:
                                    case -169466861:
                                        strM947 = C0050.m947(C11340.m28030(c102310));
                                        sArr22 = f1845;
                                        if (!C0382.m1848()) {
                                            iM69812 = (i44 - C0630.m2566("ۗۜ")) * (-19);
                                            i37 = ((iM69812 ^ i45) * (-23623)) ^ 1860664345;
                                            i38 = -26592003;
                                            i47 = iM69812 ^ i38;
                                            i46 = i37;
                                        }
                                        sArr20 = sArr21;
                                        interfaceC13049 = interfaceC13049M6438;
                                        iM69813 = (C2105.m6981("ۗۚ") ^ i45) * 71;
                                        i37 = ((iM69813 ^ i44) * (-23207)) ^ 1939538387;
                                        i39 = -1299117170;
                                        i41 = iM69813 ^ i39;
                                        sArr21 = sArr20;
                                        interfaceC13049M6438 = interfaceC13049;
                                        dialogInterfaceOnDismissListenerC0395 = this;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -1888419238:
                                    case -1083419070:
                                        strM4373 = C1294.m4373(f1845, 1, 21, i48);
                                        str20 = strM4373;
                                        iM25617 = (C0630.m2566("᩺᩸") ^ i45) * (-77);
                                        i37 = ((iM25617 ^ i44) * 21751) ^ 449489863;
                                        i40 = -56267073;
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -1715126616:
                                    case -1369297762:
                                        C1916.m6302(C3683.m11223(interfaceC13049M2434, C1047.m3603(sArr23, 57, 5, i48), strM19510));
                                        break;
                                    case -1607886886:
                                    case -1008000455:
                                        i49 = 52;
                                        i50 = 5;
                                        if (C22628.m50615() != 0) {
                                            iM69812 = C0630.m2566("ۤۧ") ^ i45;
                                            i37 = ((iM69812 ^ i44) * 14965) ^ (-2080844146);
                                            i38 = -871970151;
                                        } else {
                                            iM69812 = C2105.m6981("ܺ֨") ^ i45;
                                            i37 = ((iM69812 ^ i44) * (-30037)) ^ 249481226;
                                            i38 = 1099656414;
                                        }
                                        i47 = iM69812 ^ i38;
                                        i46 = i37;
                                        break;
                                    case -1593637428:
                                    case -1519893307:
                                        i48 = 41094;
                                        iM25617 = (i44 - C0630.m2566("ۛ᩹")) * (-113);
                                        i37 = ((iM25617 ^ i45) * (-21187)) ^ 1883906887;
                                        i40 = 1657431095;
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -1550473752:
                                    case 230378721:
                                        i48 = 20225;
                                        iM25617 = (i44 - C0630.m2566("ۛ᩹")) * (-113);
                                        i37 = ((iM25617 ^ i45) * (-21187)) ^ 1883906887;
                                        i40 = 1657431095;
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -1410332247:
                                    case 1558735585:
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        if (C2167.m7157(c29713)) {
                                            iM25617 = (C2105.m6981("᩵᩻") ^ i44) * 39;
                                            i37 = ((iM25617 ^ i45) * (-7983)) ^ 184841790;
                                            i40 = 950888981;
                                        } else {
                                            iM25617 = (C0630.m2566("ۜ᩸") ^ i45) * (-41);
                                            i37 = ((iM25617 ^ i44) * (-30683)) ^ 1401792851;
                                            i40 = 1495824701;
                                        }
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -1372411978:
                                    case 1949386199:
                                        strM4373 = C2958.m9031(f1845, 22, 30, i48);
                                        str20 = strM4373;
                                        iM25617 = (C0630.m2566("᩺᩸") ^ i45) * (-77);
                                        i37 = ((iM25617 ^ i44) * 21751) ^ 449489863;
                                        i40 = -56267073;
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -1257486179:
                                    case 1482959694:
                                        interfaceC13049M2434 = RunnableC0588.m2434(interfaceC13049M13549, C7811.m20837(sArr22, i49, i50, i48), strM947);
                                        interfaceC7785M3497 = C1005.m3497(c10238);
                                        if (!AbstractC2021.m6574()) {
                                            iM69812 = C0630.m2566("᩷ۜ") ^ i45;
                                            i37 = ((iM69812 ^ i44) * (-2659)) ^ 299155228;
                                            i38 = 1633763712;
                                            i47 = iM69812 ^ i38;
                                            i46 = i37;
                                        }
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        iM25617 = C0630.m2566("᩺ۘ") ^ i44;
                                        i37 = ((iM25617 ^ i45) * (-32467)) ^ (-1372511765);
                                        i40 = 1420654170;
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -1103194525:
                                    case 19877499:
                                        C0483.m2121();
                                        break;
                                    case -1102238361:
                                    case 1917019704:
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i54 = i53 * i53;
                                        i51 = s2 * s2;
                                        i52 = 11641744;
                                        if (C1047.f3863 >= 0) {
                                            iM25617 = C0630.m2566("᩺ۘ") ^ i44;
                                            i37 = ((iM25617 ^ i45) * (-32467)) ^ (-1372511765);
                                            i40 = 1420654170;
                                        } else {
                                            iM25617 = C0630.m2566("ܰ᩻") ^ i44;
                                            i37 = ((iM25617 ^ i45) * 20563) ^ 1268946024;
                                            i40 = 635703861;
                                        }
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -630925507:
                                    case 1269268947:
                                        interfaceC130410 = interfaceC13049M6438;
                                        c = 0;
                                        if (C0050.f910 >= 0) {
                                            iM69814 = (C0630.m2566("ܰۛ") + i45) * (-91);
                                            i46 = ((iM69814 ^ i44) * 23137) ^ (-139549400);
                                            i42 = -1387070821;
                                        } else {
                                            iM69814 = (C2105.m6981("ۨۡ") + i44) * 45;
                                            i46 = ((iM69814 ^ i45) * (-26639)) ^ (-1575047469);
                                            i42 = 1138706449;
                                        }
                                        interfaceC13049M6438 = interfaceC130410;
                                        i47 = iM69814 ^ i42;
                                        dialogInterfaceOnDismissListenerC0395 = this;
                                        break;
                                    case -568489868:
                                    case 761326774:
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        int i55 = i51 + i52;
                                        if ((i55 + i55) - i54 < 0) {
                                            iM25617 = C0630.m2566("ܳۨ") ^ i45;
                                            i37 = ((iM25617 ^ i44) * 8813) ^ 431357305;
                                            i40 = 1460830736;
                                        } else {
                                            iM25617 = (C0630.m2566("۟ۜ") + i44) * (-99);
                                            i37 = ((iM25617 ^ i45) * (-4767)) ^ 922039381;
                                            i40 = 301183988;
                                        }
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case -329160913:
                                    case 1015250428:
                                        interfaceC13049 = interfaceC13049M6438;
                                        short s3 = sArr21[c];
                                        int i56 = s3 + 3412;
                                        if (!C0382.f1805) {
                                            sArr20 = sArr21;
                                            s2 = s3;
                                            i53 = i56;
                                            iM69813 = (C2105.m6981("ۗۚ") ^ i45) * 71;
                                            i37 = ((iM69813 ^ i44) * (-23207)) ^ 1939538387;
                                            i39 = -1299117170;
                                            i41 = iM69813 ^ i39;
                                            sArr21 = sArr20;
                                            interfaceC13049M6438 = interfaceC13049;
                                            dialogInterfaceOnDismissListenerC0395 = this;
                                            i47 = i41;
                                            i46 = i37;
                                        } else {
                                            int iM69816 = (i45 - C2105.m6981("ܽۖ")) * (-111);
                                            int i57 = ((iM69816 ^ i44) * (-24947)) ^ 1272852051;
                                            i53 = i56;
                                            interfaceC13049M6438 = interfaceC13049;
                                            i47 = iM69816 ^ 1204422291;
                                            s2 = s3;
                                            i46 = i57;
                                            dialogInterfaceOnDismissListenerC0395 = this;
                                        }
                                        break;
                                    case -5256070:
                                    case 1118218866:
                                        InterfaceC13049 interfaceC130411 = interfaceC13049M6438;
                                        interfaceC13049M13549 = C4616.m13549(interfaceC130411, str20, zM2804);
                                        c102310 = c10237;
                                        if (C1005.f3721) {
                                            int iM25618 = C0630.m2566("ۛ۫") ^ i45;
                                            i46 = ((iM25618 ^ i44) * 25089) ^ 1400028593;
                                            interfaceC13049M6438 = interfaceC130411;
                                            i47 = iM25618 ^ 2133730410;
                                        } else {
                                            sArr20 = sArr21;
                                            interfaceC13049 = interfaceC130411;
                                            iM69813 = (C2105.m6981("ۗۚ") ^ i45) * 71;
                                            i37 = ((iM69813 ^ i44) * (-23207)) ^ 1939538387;
                                            i39 = -1299117170;
                                            i41 = iM69813 ^ i39;
                                            sArr21 = sArr20;
                                            interfaceC13049M6438 = interfaceC13049;
                                            dialogInterfaceOnDismissListenerC0395 = this;
                                            i47 = i41;
                                            i46 = i37;
                                        }
                                        break;
                                    case 349013285:
                                    case 1676249964:
                                        C0483.m2121();
                                        if (!C4159.f13567) {
                                            interfaceC130410 = interfaceC13049M6438;
                                            iM69814 = (C0630.m2566("ܰۛ") + i45) * (-91);
                                            i46 = ((iM69814 ^ i44) * 23137) ^ (-139549400);
                                            i42 = -1387070821;
                                            interfaceC13049M6438 = interfaceC130410;
                                            i47 = iM69814 ^ i42;
                                            dialogInterfaceOnDismissListenerC0395 = this;
                                        } else {
                                            iM69812 = C2105.m6981("᩸۟") ^ i44;
                                            i37 = ((iM69812 ^ i45) * (-20317)) ^ (-452993560);
                                            i38 = 1092637716;
                                            i47 = iM69812 ^ i38;
                                            i46 = i37;
                                        }
                                        break;
                                    case 408537321:
                                    case 1724282563:
                                        interfaceC13049 = interfaceC13049M6438;
                                        sArr20 = f1845;
                                        if (C0483.m2121()) {
                                            iM69813 = (C2105.m6981("۬۟") + i45) * (-51);
                                            i37 = ((iM69813 ^ i44) * (-14857)) ^ (-379871114);
                                            i39 = 57654835;
                                        } else {
                                            iM69813 = (C2105.m6981("ۗۚ") ^ i45) * 71;
                                            i37 = ((iM69813 ^ i44) * (-23207)) ^ 1939538387;
                                            i39 = -1299117170;
                                        }
                                        i41 = iM69813 ^ i39;
                                        sArr21 = sArr20;
                                        interfaceC13049M6438 = interfaceC13049;
                                        dialogInterfaceOnDismissListenerC0395 = this;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                    case 948033527:
                                    case 1510852775:
                                        C11340.m28031();
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            sArr20 = sArr21;
                                            interfaceC13049 = interfaceC13049M6438;
                                            iM69813 = (C2105.m6981("ۗۚ") ^ i45) * 71;
                                            i37 = ((iM69813 ^ i44) * (-23207)) ^ 1939538387;
                                            i39 = -1299117170;
                                            i41 = iM69813 ^ i39;
                                            sArr21 = sArr20;
                                            interfaceC13049M6438 = interfaceC13049;
                                            dialogInterfaceOnDismissListenerC0395 = this;
                                            i47 = i41;
                                            i46 = i37;
                                        } else {
                                            interfaceC130410 = interfaceC13049M6438;
                                            iM69814 = (C0630.m2566("ܰۛ") + i45) * (-91);
                                            i46 = ((iM69814 ^ i44) * 23137) ^ (-139549400);
                                            i42 = -1387070821;
                                            interfaceC13049M6438 = interfaceC130410;
                                            i47 = iM69814 ^ i42;
                                            dialogInterfaceOnDismissListenerC0395 = this;
                                        }
                                        break;
                                    case 1012383544:
                                    case 1546275340:
                                        C3911.m11924();
                                        C4616.m13552();
                                        interfaceC130410 = interfaceC13049M6438;
                                        iM69814 = (C0630.m2566("ܰۛ") + i45) * (-91);
                                        i46 = ((iM69814 ^ i44) * 23137) ^ (-139549400);
                                        i42 = -1387070821;
                                        interfaceC13049M6438 = interfaceC130410;
                                        i47 = iM69814 ^ i42;
                                        dialogInterfaceOnDismissListenerC0395 = this;
                                        break;
                                    default:
                                        strM19510 = C0422.m1959(interfaceC7785M3497);
                                        sArr23 = f1845;
                                        if (C1420.f5096 > 0) {
                                            iM69812 = (C2105.m6981("ܰ֫") ^ i44) * (-15);
                                            i37 = ((iM69812 ^ i45) * (-21461)) ^ 1418956620;
                                            i38 = 435394091;
                                            i47 = iM69812 ^ i38;
                                            i46 = i37;
                                        }
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        iM25617 = C0630.m2566("᩺ۘ") ^ i44;
                                        i37 = ((iM25617 ^ i45) * (-32467)) ^ (-1372511765);
                                        i40 = 1420654170;
                                        i41 = iM25617 ^ i40;
                                        interfaceC13049M6438 = interfaceC13049M6438;
                                        i47 = i41;
                                        i46 = i37;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    final DialogInterfaceC0206 dialogInterfaceC0206M11213 = C3683.m11213(c19258M2130);
                    C10025.m25199(c16560, dialogInterfaceC0206M11213, str);
                    final C2978 c29719 = c29713;
                    final C2978 c29720 = c29712;
                    final C10235 c102310 = c10237;
                    final C2978 c29721 = c29714;
                    final C10235 c102311 = c10238;
                    C4159.m12564(C21923.m49343(dialogInterfaceC0206M11213), new View.OnClickListener(this) { // from class: l.ۚۨܽ

                        /* JADX INFO: renamed from: ۟᩵᩺, reason: not valid java name and contains not printable characters */
                        private static final short[] f16638 = {8724, -23346, -3198, 10483, -3593, 8245, -2274, -5567, -3493, 10530, 9716};

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C22268 f16646;

                        {
                            int i37 = -1825553346;
                            int i38 = C4263.f13799;
                            int i39 = RunnableC1937.f6483;
                            int iM25617 = (i38 - C0630.m2566("ᩳۚ")) * 3;
                            int i40 = ((iM25617 ^ i39) * 5991) ^ 332620567;
                            int i41 = -312424524;
                            while (true) {
                                i37 = ((((i37 ^ i39) * 9373) >> 31) & i40) ^ (iM25617 ^ i41);
                                switch (i37) {
                                    case -2130470919:
                                    case -1766213641:
                                        if (C1711.f5919) {
                                            iM25617 = (i39 - C0630.m2566("ܺܶ")) * (-127);
                                            i40 = ((iM25617 ^ i38) * 3025) ^ (-600797714);
                                            i41 = -2139183558;
                                        } else {
                                            iM25617 = (C2105.m6981("ۜ᩹") ^ i39) * 43;
                                            i40 = ((iM25617 ^ i38) * (-15607)) ^ 1339765545;
                                            i41 = 1500225136;
                                        }
                                        break;
                                    case -1810318057:
                                    case 1260993413:
                                        if (!C11340.m28031()) {
                                            iM25617 = C2105.m6981("ۗۤ") ^ i38;
                                            i40 = ((iM25617 ^ i39) * (-13269)) ^ (-795707053);
                                            i41 = -314102519;
                                        } else {
                                            iM25617 = C2105.m6981("ۚܰ") ^ i39;
                                            i40 = ((iM25617 ^ i38) * 8329) ^ (-949697245);
                                            i41 = 1688040308;
                                        }
                                        break;
                                    case -1424271649:
                                    case -176261176:
                                        C3663.m11168();
                                        C4159.m12565();
                                        iM25617 = C2105.m6981("ۗۤ") ^ i38;
                                        i40 = ((iM25617 ^ i39) * (-13269)) ^ (-795707053);
                                        i41 = -314102519;
                                        break;
                                    case -1374609495:
                                    case 1835555594:
                                        return;
                                    case -1193392436:
                                    case -804070129:
                                        if (C0714.f2697 >= 0) {
                                            iM25617 = (C2105.m6981("۟᩻") + i39) * (-125);
                                            i40 = ((iM25617 ^ i38) * 6111) ^ (-1524330504);
                                            i41 = 49395892;
                                        } else {
                                            iM25617 = C0630.m2566("֫֫") ^ i38;
                                            i40 = ((iM25617 ^ i39) * 28411) ^ 884388663;
                                            i41 = 2142586350;
                                        }
                                        break;
                                    case -1044996026:
                                    case -692507304:
                                        if (ViewOnClickListenerC1958.f6529 > 0) {
                                            iM25617 = (i38 - C0630.m2566("ۚۡ")) * (-93);
                                            i40 = ((iM25617 ^ i39) * 13059) ^ (-1796690775);
                                            i41 = -1308782906;
                                        } else {
                                            iM25617 = C2105.m6981("ۚܰ") ^ i39;
                                            i40 = ((iM25617 ^ i38) * 8329) ^ (-949697245);
                                            i41 = 1688040308;
                                        }
                                        break;
                                    case -836483193:
                                    case 1273616806:
                                        if (C22628.f73083 <= 0) {
                                            iM25617 = (i39 - C0630.m2566("ܺܶ")) * (-127);
                                            i40 = ((iM25617 ^ i38) * 3025) ^ (-600797714);
                                            i41 = -2139183558;
                                        } else {
                                            iM25617 = (C0630.m2566("ۗ֨") + i39) * (-77);
                                            i40 = ((iM25617 ^ i38) * 6705) ^ (-1556746516);
                                            i41 = 156097631;
                                        }
                                        break;
                                    case -758467047:
                                    case -112330850:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM25617 = C2105.m6981("ۚܰ") ^ i39;
                                            i40 = ((iM25617 ^ i38) * 8329) ^ (-949697245);
                                            i41 = 1688040308;
                                        } else {
                                            iM25617 = (C0630.m2566("ۚۘ") + i39) * (-113);
                                            i40 = ((iM25617 ^ i38) * (-26391)) ^ (-1098434989);
                                            i41 = -166775629;
                                        }
                                        break;
                                    case -666728627:
                                    case -483386407:
                                        if (C0382.f1805) {
                                            iM25617 = C0630.m2566("ۨܶ") ^ i38;
                                            i40 = ((iM25617 ^ i39) * 12501) ^ 55837343;
                                            i41 = -1706169393;
                                        } else {
                                            iM25617 = C2105.m6981("ۚܰ") ^ i39;
                                            i40 = ((iM25617 ^ i38) * 8329) ^ (-949697245);
                                            i41 = 1688040308;
                                        }
                                        break;
                                    case -652484916:
                                    case 141928378:
                                        C0798.m2998();
                                        throw new RuntimeException();
                                    case 28466731:
                                    case 393853566:
                                        if (C2126.m7040()) {
                                            iM25617 = (i38 - C0630.m2566("ۚۡ")) * (-93);
                                            i40 = ((iM25617 ^ i39) * 13059) ^ (-1796690775);
                                            i41 = -1308782906;
                                        } else {
                                            iM25617 = C0630.m2566("ۜۜ") ^ i38;
                                            i40 = ((iM25617 ^ i39) * (-6711)) ^ (-758561643);
                                            i41 = -426359631;
                                        }
                                        break;
                                    case 436435071:
                                    case 517658067:
                                        if (C0798.f2919) {
                                            iM25617 = C2105.m6981("ۚܰ") ^ i39;
                                            i40 = ((iM25617 ^ i38) * 8329) ^ (-949697245);
                                            i41 = 1688040308;
                                        } else {
                                            iM25617 = C2105.m6981("᩸ۘ") ^ i39;
                                            i40 = ((iM25617 ^ i38) * 30517) ^ 1276464787;
                                            i41 = 646540874;
                                        }
                                        break;
                                    case 538552020:
                                    case 1932638108:
                                        C2126.m7040();
                                        if (C3911.m11924() > 0) {
                                            iM25617 = (C2105.m6981("۟᩻") + i39) * (-125);
                                            i40 = ((iM25617 ^ i38) * 6111) ^ (-1524330504);
                                            i41 = 49395892;
                                        } else {
                                            iM25617 = C2105.m6981("ۗۤ") ^ i38;
                                            i40 = ((iM25617 ^ i39) * (-13269)) ^ (-795707053);
                                            i41 = -314102519;
                                        }
                                        break;
                                    case 979639880:
                                    case 1812368555:
                                        if (C0964.f3626 != 0) {
                                            iM25617 = C2105.m6981("ۗۤ") ^ i38;
                                            i40 = ((iM25617 ^ i39) * (-13269)) ^ (-795707053);
                                            i41 = -314102519;
                                        } else {
                                            iM25617 = (i38 - C2105.m6981("᩵ۤ")) * (-105);
                                            i40 = ((iM25617 ^ i39) * 28651) ^ (-1850386837);
                                            i41 = -1721990548;
                                        }
                                        break;
                                    case 1093316895:
                                    case 1885998231:
                                        this.f16646 = this;
                                        if (C2105.f7037 != 0) {
                                            iM25617 = C2105.m6981("ۚܰ") ^ i39;
                                            i40 = ((iM25617 ^ i38) * 8329) ^ (-949697245);
                                            i41 = 1688040308;
                                        } else {
                                            iM25617 = C0630.m2566("۠ۢ") ^ i39;
                                            i40 = ((iM25617 ^ i38) * (-19979)) ^ (-919492157);
                                            i41 = 1106370087;
                                        }
                                        break;
                                    default:
                                        if (C3683.m11222()) {
                                            iM25617 = C2105.m6981("ۗۤ") ^ i38;
                                            i40 = ((iM25617 ^ i39) * (-13269)) ^ (-795707053);
                                            i41 = -314102519;
                                        } else {
                                            iM25617 = (C0630.m2566("ۜܰ") ^ i38) * 115;
                                            i40 = ((iM25617 ^ i39) * 2447) ^ 1845200588;
                                            i41 = 326668483;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:36:0x0122 A[PHI: r20
                          0x0122: PHI (r20v3 int) = (r20v2 int), (r20v1 int), (r20v1 int) binds: [B:35:0x0120, B:22:0x00c6, B:15:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:40:0x0166 A[PHI: r9
                          0x0166: PHI (r9v28 short[]) = (r9v20 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:39:0x0164, B:15:0x00ad, B:139:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:54:0x0203 A[PHI: r1 r5
                          0x0203: PHI (r1v59 l.᩵ۚۢ) = (r1v31 l.᩵ۚۢ), (r1v2 l.᩵ۚۢ), (r1v55 l.᩵ۚۢ), (r1v2 l.᩵ۚۢ), (r1v2 l.᩵ۚۢ) binds: [B:53:0x0201, B:124:0x0203, B:47:0x01d1, B:24:0x00ca, B:22:0x00c6] A[DONT_GENERATE, DONT_INLINE]
                          0x0203: PHI (r5v7 java.lang.String) = 
                          (r5v3 java.lang.String)
                          (r5v2 java.lang.String)
                          (r5v2 java.lang.String)
                          (r5v2 java.lang.String)
                          (r5v2 java.lang.String)
                         binds: [B:53:0x0201, B:124:0x0203, B:47:0x01d1, B:24:0x00ca, B:22:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            int i37;
                            int iM69812;
                            int i38;
                            int i39;
                            String str20;
                            short[] sArr20;
                            C2978 c29722;
                            C2978 c29723;
                            int iM69813;
                            int i40;
                            int i41;
                            int iM25617;
                            int i42;
                            int i43;
                            String str21;
                            int iM69814;
                            int i44;
                            int i45;
                            C16560 c16561 = null;
                            int iM69815 = 0;
                            String strM6988 = null;
                            int iM25618 = 0;
                            short s2 = 0;
                            short s3 = 0;
                            int i46 = 1230447002;
                            int i47 = C1420.f5096;
                            int i48 = C3432.f10845;
                            int iM69816 = (C2105.m6981("᩻ۘ") ^ i47) * (-21);
                            int i49 = ((iM69816 ^ i48) * 10329) ^ 1730853296;
                            int i50 = iM69816 ^ (-2003653050);
                            String strM19510 = null;
                            String str22 = null;
                            String strM9035 = null;
                            C19258 c192513 = null;
                            short[] sArr21 = null;
                            C2978 c29724 = null;
                            int i51 = 0;
                            int i52 = 0;
                            int length = 0;
                            C2978 c29725 = null;
                            String[] strArr = null;
                            SpannableStringBuilder spannableStringBuilderM28258 = null;
                            int i53 = 0;
                            final C10235 c102312 = null;
                            String strM3603 = null;
                            PatternSyntaxException patternSyntaxException = null;
                            int i54 = 0;
                            int iM3007 = 0;
                            while (true) {
                                i46 = i50 ^ (i49 & (((i46 ^ i48) * 14027) >> 31));
                                switch (i46) {
                                    case -2132250374:
                                    case 234454949:
                                        c192513 = c192513;
                                        i37 = length;
                                        strM19510 = C0422.m1959(C1005.m3497(c102312));
                                        strM3603 = C1047.m3603(f16638, 1, 1, i53);
                                        if (C2520.f8000 >= 0) {
                                            iM69812 = (C2105.m6981("᩵ܿ") ^ i47) * (-39);
                                            i38 = ((iM69812 ^ i48) * (-2199)) ^ (-765572267);
                                            i39 = -81783687;
                                        } else {
                                            iM69812 = C0630.m2566("ۙܽ") ^ i48;
                                            i38 = ((iM69812 ^ i47) * (-28999)) ^ (-244277563);
                                            i39 = -5855308;
                                        }
                                        i41 = iM69812 ^ i39;
                                        length = i37;
                                        C19258 c192514 = c192513;
                                        i50 = i41;
                                        i49 = i38;
                                        c192513 = c192514;
                                        break;
                                    case -1831247442:
                                    case -1465412449:
                                        c192513 = c192513;
                                        strM9035 = C2958.m9035(C4075.m12251(iM69815 ^ 2118840316), strM3603);
                                        if (!C2272.f7362) {
                                            iM69813 = (C2105.m6981("ۧ֨") ^ i48) * (-95);
                                            i38 = ((iM69813 ^ i47) * (-1599)) ^ (-1697849763);
                                            i40 = -1758112278;
                                            i41 = iM69813 ^ i40;
                                            C19258 c192515 = c192513;
                                            i50 = i41;
                                            i49 = i38;
                                            c192513 = c192515;
                                        } else {
                                            c192513 = c192513;
                                            iM69814 = (i48 - C2105.m6981("ۙۖ")) * 59;
                                            i44 = ((iM69814 ^ i47) * 27777) ^ 1064983096;
                                            i45 = -698545673;
                                            i50 = iM69814 ^ i45;
                                            i49 = i44;
                                        }
                                        break;
                                    case -1810036502:
                                    case 339860520:
                                        if (C3663.m11168() >= 0) {
                                            iM69814 = (C2105.m6981("ۖ۟") ^ i47) * (-95);
                                            i44 = ((iM69814 ^ i48) * (-25207)) ^ (-186351166);
                                            i45 = -710184092;
                                        } else {
                                            iM69814 = C0630.m2566("᩸֨") ^ i48;
                                            i44 = ((iM69814 ^ i47) * (-16035)) ^ 707796664;
                                            i45 = 742394412;
                                        }
                                        i50 = iM69814 ^ i45;
                                        i49 = i44;
                                        break;
                                    case -1746965884:
                                    case -1688225108:
                                        c192513 = c192513;
                                        str22 = strArr[i52];
                                        iM69813 = (C2105.m6981("ۘᩴ") ^ i47) * (-87);
                                        i38 = ((iM69813 ^ i48) * (-23)) ^ (-25951986);
                                        i40 = -1303067919;
                                        i41 = iM69813 ^ i40;
                                        C19258 c192516 = c192513;
                                        i50 = i41;
                                        i49 = i38;
                                        c192513 = c192516;
                                        break;
                                    case -1722324172:
                                    case -1362942640:
                                        if (RunnableC0588.m2441() >= 0) {
                                            c192513 = c192513;
                                            i37 = length;
                                            iM69812 = (C2105.m6981("᩵ܿ") ^ i47) * (-39);
                                            i38 = ((iM69812 ^ i48) * (-2199)) ^ (-765572267);
                                            i39 = -81783687;
                                            i41 = iM69812 ^ i39;
                                            length = i37;
                                            C19258 c192517 = c192513;
                                            i50 = i41;
                                            i49 = i38;
                                            c192513 = c192517;
                                        } else {
                                            iM69814 = (i48 - C2105.m6981("ۙۖ")) * 59;
                                            i44 = ((iM69814 ^ i47) * 27777) ^ 1064983096;
                                            i45 = -698545673;
                                            i50 = iM69814 ^ i45;
                                            i49 = i44;
                                        }
                                        break;
                                    case -1418721592:
                                    case -749610053:
                                        c192513 = c192513;
                                        strM3603 = strM3603;
                                        length = length;
                                        sArr21 = sArr21;
                                        if ((s2 * s3) - ((s2 * s2) + 8415801) <= 0) {
                                            iM25617 = C0630.m2566("ܽ᩷") ^ i47;
                                            i42 = ((iM25617 ^ i48) * 12911) ^ (-702305208);
                                            i43 = -1406658634;
                                        } else {
                                            iM25617 = C0630.m2566("ܶۗ") ^ i47;
                                            i42 = ((iM25617 ^ i48) * 27741) ^ 1872644947;
                                            i43 = 1458009070;
                                        }
                                        int i55 = iM25617 ^ i43;
                                        sArr21 = sArr21;
                                        c192513 = c192513;
                                        i50 = i55;
                                        i49 = i42;
                                        length = length;
                                        strM3603 = strM3603;
                                        break;
                                    case -1270073141:
                                    case -972587043:
                                        i54 += iM3007 + 1;
                                        i52++;
                                        str21 = strM19510;
                                        int iM69817 = (i47 - C2105.m6981("֡ۖ")) * (-127);
                                        i44 = ((iM69817 ^ i48) * (-12729)) ^ 1457719895;
                                        strM19510 = str21;
                                        c192513 = c192513;
                                        i50 = iM69817 ^ 351998566;
                                        i49 = i44;
                                        break;
                                    case -1247619540:
                                    case 1100521142:
                                        c192513 = c192513;
                                        spannableStringBuilderM28258 = C11459.m28258(patternSyntaxException);
                                        iM69815 = C2105.m6981(RunnableC0588.m2436(f16638, 2, 3, i53));
                                        if (!C0422.m1963()) {
                                            iM25617 = C2105.m6981("ܺᩳ") ^ i47;
                                            i42 = ((iM25617 ^ i48) * 17805) ^ 1095532164;
                                            i43 = 709689500;
                                            int i56 = iM25617 ^ i43;
                                            sArr21 = sArr21;
                                            c192513 = c192513;
                                            i50 = i56;
                                            i49 = i42;
                                            length = length;
                                            strM3603 = strM3603;
                                        } else {
                                            iM69813 = C0630.m2566("ۘܿ") ^ i47;
                                            i38 = ((iM69813 ^ i48) * (-1045)) ^ 2083388984;
                                            i40 = -345140116;
                                            i41 = iM69813 ^ i40;
                                            C19258 c192518 = c192513;
                                            i50 = i41;
                                            i49 = i38;
                                            c192513 = c192518;
                                        }
                                        break;
                                    case -1056990202:
                                    case -119393563:
                                        c192513 = c192513;
                                        strM3603 = strM3603;
                                        length = length;
                                        sArr21 = sArr21;
                                        s2 = f16638[0];
                                        s3 = 5802;
                                        if (C1773.f6144 <= 0) {
                                            iM25617 = C2105.m6981("᩹۠") ^ i48;
                                            i42 = ((iM25617 ^ i47) * (-1469)) ^ (-369603917);
                                            i43 = 554330181;
                                        } else {
                                            iM25617 = C0630.m2566("۬ܶ") ^ i48;
                                            i42 = ((iM25617 ^ i47) * (-18537)) ^ 1285793769;
                                            i43 = 1715821913;
                                        }
                                        int i57 = iM25617 ^ i43;
                                        sArr21 = sArr21;
                                        c192513 = c192513;
                                        i50 = i57;
                                        i49 = i42;
                                        length = length;
                                        strM3603 = strM3603;
                                        break;
                                    case -987806590:
                                    case 1624693073:
                                        c102312.mo25922(i54, C0798.m3007(str22) + i54);
                                        C0798.m3010(c102312);
                                        break;
                                    case -985459871:
                                    case 843492511:
                                        c192513 = c192513;
                                        str20 = strM3603;
                                        i37 = length;
                                        sArr20 = sArr21;
                                        C2978 c29726 = c29719;
                                        boolean zM2804 = C0714.m2804(c29726);
                                        C2978 c29727 = c29720;
                                        c102312 = c102310;
                                        C16560 c16562 = c16560;
                                        if (zM2804) {
                                            c29723 = c29726;
                                            c29722 = c29727;
                                            c16561 = c16562;
                                            int iM69818 = (C2105.m6981("ܺܳ") ^ i47) * (-117);
                                            c29724 = c29723;
                                            c192513 = c192513;
                                            c29725 = c29722;
                                            i50 = iM69818 ^ 121110697;
                                            i49 = ((iM69818 ^ i48) * 17635) ^ 436245374;
                                        } else {
                                            int iM69819 = C2105.m6981("ۤᩴ") ^ i48;
                                            i49 = ((iM69819 ^ i47) * (-31119)) ^ (-617152684);
                                            c29724 = c29726;
                                            c192513 = c192513;
                                            i50 = iM69819 ^ (-1372490670);
                                            c29725 = c29727;
                                            c16561 = c16562;
                                        }
                                        sArr21 = sArr20;
                                        strM3603 = str20;
                                        length = i37;
                                        break;
                                    case -949229452:
                                    case 1770463601:
                                        C2167.m7155();
                                        if (!C0382.f1805) {
                                            c192513 = c192513;
                                            strM3603 = strM3603;
                                            length = length;
                                            sArr21 = sArr21;
                                            iM25617 = C2105.m6981("᩹۠") ^ i48;
                                            i42 = ((iM25617 ^ i47) * (-1469)) ^ (-369603917);
                                            i43 = 554330181;
                                            int i58 = iM25617 ^ i43;
                                            sArr21 = sArr21;
                                            c192513 = c192513;
                                            i50 = i58;
                                            i49 = i42;
                                            length = length;
                                            strM3603 = strM3603;
                                        } else {
                                            iM69814 = C0630.m2566("᩸֨") ^ i48;
                                            i44 = ((iM69814 ^ i47) * (-16035)) ^ 707796664;
                                            i45 = 742394412;
                                            i50 = iM69814 ^ i45;
                                            i49 = i44;
                                        }
                                        break;
                                    case -640531803:
                                    case 1253189400:
                                        str21 = strM19510;
                                        String[] strArrM4374 = C1294.m4374(str21, strM3603);
                                        strArr = strArrM4374;
                                        length = strArrM4374.length;
                                        i54 = 0;
                                        i51 = 0;
                                        i52 = 0;
                                        int iM698110 = (i47 - C2105.m6981("֡ۖ")) * (-127);
                                        i44 = ((iM698110 ^ i48) * (-12729)) ^ 1457719895;
                                        strM19510 = str21;
                                        c192513 = c192513;
                                        i50 = iM698110 ^ 351998566;
                                        i49 = i44;
                                        break;
                                    case -428894298:
                                    case 228723993:
                                        C1916.m6308();
                                        iM69814 = (i48 - C2105.m6981("ۙۖ")) * 59;
                                        i44 = ((iM69814 ^ i47) * 27777) ^ 1064983096;
                                        i45 = -698545673;
                                        i50 = iM69814 ^ i45;
                                        i49 = i44;
                                        break;
                                    case -270387464:
                                    case 1201628298:
                                        i53 = 42180;
                                        iM25617 = C0630.m2566("ۗۨ") ^ i48;
                                        i42 = ((iM25617 ^ i47) * 279) ^ (-78522859);
                                        i43 = 1884787384;
                                        int i59 = iM25617 ^ i43;
                                        sArr21 = sArr21;
                                        c192513 = c192513;
                                        i50 = i59;
                                        i49 = i42;
                                        length = length;
                                        strM3603 = strM3603;
                                        break;
                                    case -125591807:
                                    case 355290651:
                                        i53 = 52274;
                                        iM25617 = C0630.m2566("ۗۨ") ^ i48;
                                        i42 = ((iM25617 ^ i47) * 279) ^ (-78522859);
                                        i43 = 1884787384;
                                        int i510 = iM25617 ^ i43;
                                        sArr21 = sArr21;
                                        c192513 = c192513;
                                        i50 = i510;
                                        i49 = i42;
                                        length = length;
                                        strM3603 = strM3603;
                                        break;
                                    case 61490246:
                                    case 334880333:
                                        c192513 = c192513;
                                        C3663.m11167(dialogInterfaceC0206M11213);
                                        Main mainM50612 = C22628.m50612(c16561);
                                        final C22268 c22268 = this.f16646;
                                        if (C1773.f6144 > 0) {
                                            final C2978 c29728 = c29721;
                                            final C10235 c102313 = c102311;
                                            final C2978 c29729 = c29724;
                                            final C2978 c29730 = c29725;
                                            C10025.m25197(new InterfaceC12846() { // from class: l.֨ۨܽ
                                                {
                                                    int i60 = -1778907199;
                                                    int i61 = C3911.f12484;
                                                    int i62 = C1047.f3863;
                                                    int iM25619 = (C0630.m2566("ۧۨ") + i62) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                    int i63 = ((iM25619 ^ i61) * (-19953)) ^ 738246919;
                                                    int i64 = -1322338554;
                                                    while (true) {
                                                        i60 = ((((i60 ^ i61) * (-26853)) >> 31) & i63) ^ (iM25619 ^ i64);
                                                        switch (i60) {
                                                            case -2054585100:
                                                            case 840458522:
                                                                return;
                                                            case -2035580953:
                                                            case 110807679:
                                                                if (C3663.f11553) {
                                                                    iM25619 = (C2105.m6981("ܽܺ") + i62) * (-5);
                                                                    i63 = ((iM25619 ^ i61) * 11511) ^ (-1374543281);
                                                                    i64 = -135600042;
                                                                } else {
                                                                    iM25619 = C0630.m2566("ۙܳ") ^ i62;
                                                                    i63 = ((iM25619 ^ i61) * (-30019)) ^ (-2118221317);
                                                                    i64 = 1815540212;
                                                                }
                                                                break;
                                                            case -2014945211:
                                                            case 30619160:
                                                                if (C2272.f7362) {
                                                                    iM25619 = (i61 - C2105.m6981("֫֫")) * (-13);
                                                                    i63 = ((iM25619 ^ i62) * 27025) ^ 1134978377;
                                                                    i64 = -725968541;
                                                                } else {
                                                                    iM25619 = (i62 - C0630.m2566("᩸ۗ")) * 13;
                                                                    i63 = ((iM25619 ^ i61) * (-22413)) ^ 1256270637;
                                                                    i64 = 1200561112;
                                                                }
                                                                break;
                                                            case -1967006237:
                                                            case -1841635412:
                                                                C1420.m4913();
                                                                iM25619 = (C2105.m6981("ܽܺ") + i62) * (-5);
                                                                i63 = ((iM25619 ^ i61) * 11511) ^ (-1374543281);
                                                                i64 = -135600042;
                                                                break;
                                                            case -1921994430:
                                                            case -1865058240:
                                                                if (C2105.f7037 != 0) {
                                                                    iM25619 = C0630.m2566("᩸ܰ") ^ i62;
                                                                    i63 = ((iM25619 ^ i61) * (-26787)) ^ 1947878710;
                                                                    i64 = -1172303356;
                                                                } else {
                                                                    iM25619 = C0630.m2566("ۘܺ") ^ i61;
                                                                    i63 = ((iM25619 ^ i62) * 11255) ^ 1041305259;
                                                                    i64 = 1764043891;
                                                                }
                                                                break;
                                                            case -1917073758:
                                                            case -267812869:
                                                                if (AbstractC2021.f6743 <= 0) {
                                                                    iM25619 = (i61 - C2105.m6981("֫֫")) * (-13);
                                                                    i63 = ((iM25619 ^ i62) * 27025) ^ 1134978377;
                                                                    i64 = -725968541;
                                                                } else {
                                                                    iM25619 = (C2105.m6981("ܰ᩵") ^ i61) * (-71);
                                                                    i63 = ((iM25619 ^ i62) * 3053) ^ 1328270665;
                                                                    i64 = 87003860;
                                                                }
                                                                break;
                                                            case -1882795772:
                                                            case -1208045219:
                                                                if (C3537.f11231 >= 0) {
                                                                    iM25619 = (i61 - C2105.m6981("֫֫")) * (-13);
                                                                    i63 = ((iM25619 ^ i62) * 27025) ^ 1134978377;
                                                                    i64 = -725968541;
                                                                } else {
                                                                    iM25619 = (C2105.m6981("ۜܿ") ^ i61) * 11;
                                                                    i63 = ((iM25619 ^ i62) * 7953) ^ (-2054341130);
                                                                    i64 = 1428570277;
                                                                }
                                                                break;
                                                            case -1597655702:
                                                            case -1091720905:
                                                                if (C3663.f11553) {
                                                                    iM25619 = C2105.m6981("᩵ۘ") ^ i61;
                                                                    i63 = ((iM25619 ^ i62) * 9441) ^ (-1153980230);
                                                                    i64 = 303334030;
                                                                } else {
                                                                    iM25619 = (C0630.m2566("᩵ܺ") + i62) * 9;
                                                                    i63 = ((iM25619 ^ i61) * 1135) ^ (-466979588);
                                                                    i64 = 157038789;
                                                                }
                                                                break;
                                                            case -1143188291:
                                                            case -185294952:
                                                                if (C2958.f9394 >= 0) {
                                                                    iM25619 = C2105.m6981("ۚۨ") ^ i62;
                                                                    i63 = ((iM25619 ^ i61) * 10813) ^ (-755309249);
                                                                    i64 = 1465160756;
                                                                } else {
                                                                    iM25619 = (C2105.m6981("ܽܺ") + i62) * (-5);
                                                                    i63 = ((iM25619 ^ i61) * 11511) ^ (-1374543281);
                                                                    i64 = -135600042;
                                                                }
                                                                break;
                                                            case -634631661:
                                                            case 842332358:
                                                                if (C4263.f13799 <= 0) {
                                                                    iM25619 = (i61 - C2105.m6981("֫֫")) * (-13);
                                                                    i63 = ((iM25619 ^ i62) * 27025) ^ 1134978377;
                                                                    i64 = -725968541;
                                                                } else {
                                                                    iM25619 = (C2105.m6981("ܽܺ") + i62) * (-5);
                                                                    i63 = ((iM25619 ^ i61) * 11511) ^ (-1374543281);
                                                                    i64 = -135600042;
                                                                }
                                                                break;
                                                            case -514969625:
                                                            case -316410254:
                                                                if (C1005.f3721) {
                                                                    iM25619 = (C0630.m2566("᩶۠") + i61) * (-47);
                                                                    i63 = ((iM25619 ^ i62) * (-18677)) ^ 1133968415;
                                                                    i64 = 475153706;
                                                                } else {
                                                                    iM25619 = C2105.m6981("᩵ۘ") ^ i61;
                                                                    i63 = ((iM25619 ^ i62) * 9441) ^ (-1153980230);
                                                                    i64 = 303334030;
                                                                }
                                                                break;
                                                            case -228769784:
                                                            case -203259388:
                                                                if (C1916.m6308() >= 0) {
                                                                    iM25619 = C0630.m2566("᩸ܰ") ^ i62;
                                                                    i63 = ((iM25619 ^ i61) * (-26787)) ^ 1947878710;
                                                                    i64 = -1172303356;
                                                                } else {
                                                                    iM25619 = C0630.m2566("֫ۧ") ^ i62;
                                                                    i63 = ((iM25619 ^ i61) * 10143) ^ 1055314894;
                                                                    i64 = 150025985;
                                                                }
                                                                break;
                                                            case -145100073:
                                                            case 928722133:
                                                                if (C0483.f2088 < 0) {
                                                                    iM25619 = C2105.m6981("᩵ۘ") ^ i61;
                                                                    i63 = ((iM25619 ^ i62) * 9441) ^ (-1153980230);
                                                                    i64 = 303334030;
                                                                } else {
                                                                    iM25619 = C2105.m6981("ۚۨ") ^ i62;
                                                                    i63 = ((iM25619 ^ i61) * 10813) ^ (-755309249);
                                                                    i64 = 1465160756;
                                                                }
                                                                break;
                                                            case 1312888986:
                                                            case 1519238336:
                                                                if (C2126.m7040()) {
                                                                    iM25619 = C0630.m2566("᩸ܰ") ^ i62;
                                                                    i63 = ((iM25619 ^ i61) * (-26787)) ^ 1947878710;
                                                                    i64 = -1172303356;
                                                                } else {
                                                                    iM25619 = (C2105.m6981("ۙۡ") + i61) * (-21);
                                                                    i63 = ((iM25619 ^ i62) * (-21753)) ^ (-706157694);
                                                                    i64 = 164704128;
                                                                }
                                                                break;
                                                            case 1626355106:
                                                            case 1767987546:
                                                                if (C2126.f7087) {
                                                                    iM25619 = (C2105.m6981("ܽܺ") + i62) * (-5);
                                                                    i63 = ((iM25619 ^ i61) * 11511) ^ (-1374543281);
                                                                    i64 = -135600042;
                                                                } else {
                                                                    iM25619 = (i62 - C2105.m6981("ۧ᩵")) * (-39);
                                                                    i63 = ((iM25619 ^ i61) * 10207) ^ (-735657880);
                                                                    i64 = -5538687;
                                                                }
                                                                break;
                                                            default:
                                                                C2105.m6982();
                                                                RunnableC1108.m3790();
                                                                throw new RuntimeException();
                                                        }
                                                    }
                                                }

                                                @Override // l.InterfaceC12846
                                                public final /* synthetic */ void onCanceled() {
                                                }

                                                /* JADX WARN: Code duplicated, block: B:19:0x006e  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
                                                /* JADX WARN: Code duplicated, block: B:60:0x01d5 A[PHI: r11 r12 r13
                                                  0x01d5: PHI (r11v5 l.᩹ۨܽ) = (r11v3 l.᩹ۨܽ), (r11v3 l.᩹ۨܽ), (r11v4 l.᩹ۨܽ), (r11v3 l.᩹ۨܽ), (r11v3 l.᩹ۨܽ) binds: [B:49:0x016f, B:45:0x0152, B:25:0x00a1, B:9:0x003e, B:6:0x0035] A[DONT_GENERATE, DONT_INLINE]
                                                  0x01d5: PHI (r12v3 l.ۗۘ) = (r12v1 l.ۗۘ), (r12v1 l.ۗۘ), (r12v2 l.ۗۘ), (r12v1 l.ۗۘ), (r12v1 l.ۗۘ) binds: [B:49:0x016f, B:45:0x0152, B:25:0x00a1, B:9:0x003e, B:6:0x0035] A[DONT_GENERATE, DONT_INLINE]
                                                  0x01d5: PHI (r13v3 l.ۗۘ) = (r13v1 l.ۗۘ), (r13v1 l.ۗۘ), (r13v2 l.ۗۘ), (r13v1 l.ۗۘ), (r13v1 l.ۗۘ) binds: [B:49:0x016f, B:45:0x0152, B:25:0x00a1, B:9:0x003e, B:6:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
                                                @Override // l.InterfaceC12846
                                                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                                                public final void mo3776(C11667 c11667, boolean z) {
                                                    int iM25619;
                                                    int i60;
                                                    int i61 = -1144666838;
                                                    int i62 = RunnableC1937.f6483;
                                                    int i63 = AbstractC2021.f6743;
                                                    int iM69820 = C2105.m6981("᩻ۘ") ^ i63;
                                                    int i64 = ((iM69820 ^ i62) * 21345) ^ 94477107;
                                                    int i65 = iM69820 ^ (-1568815684);
                                                    C10235 c102314 = null;
                                                    C10235 c102315 = null;
                                                    C22268 c22269 = null;
                                                    C2978 c29731 = null;
                                                    C2978 c29732 = null;
                                                    while (true) {
                                                        i61 = i65 ^ ((((i61 ^ i62) * (-26397)) >> 31) & i64);
                                                        switch (i61) {
                                                            case -1994907101:
                                                            case -1259820638:
                                                                c102314 = c102312;
                                                                C10235 c102316 = c102313;
                                                                if (RunnableC0588.m2441() >= 0) {
                                                                    c102315 = c102316;
                                                                    iM25619 = (i62 - C0630.m2566("֨᩹")) * (-7);
                                                                    i64 = ((iM25619 ^ i63) * 28135) ^ (-1161109333);
                                                                    i60 = -114310507;
                                                                    i65 = iM25619 ^ i60;
                                                                } else {
                                                                    int iM25620 = C0630.m2566("᩻᩸") ^ i62;
                                                                    i64 = ((iM25620 ^ i63) * (-31047)) ^ (-1427976672);
                                                                    i65 = iM25620 ^ (-535973642);
                                                                    c102315 = c102316;
                                                                }
                                                                break;
                                                            case -1956999609:
                                                            case -1251294845:
                                                                if (C0483.m2121()) {
                                                                    iM25619 = (i62 - C0630.m2566("۠ۗ")) * 59;
                                                                    i64 = ((iM25619 ^ i63) * 9463) ^ 313815769;
                                                                    i60 = -96470896;
                                                                } else {
                                                                    iM25619 = (i62 - C0630.m2566("֨᩹")) * (-7);
                                                                    i64 = ((iM25619 ^ i63) * 28135) ^ (-1161109333);
                                                                    i60 = -114310507;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case -1842662853:
                                                            case -1712094755:
                                                                C3019.m9255();
                                                                C3537.m10746();
                                                                break;
                                                            case -1715450886:
                                                            case 1882691202:
                                                                if (RunnableC3474.f10992 <= 0) {
                                                                    iM25619 = (i63 - C2105.m6981("ۜܿ")) * (-43);
                                                                    i64 = ((iM25619 ^ i62) * (-22019)) ^ (-781031480);
                                                                    i60 = -2037541345;
                                                                } else {
                                                                    iM25619 = (C2105.m6981("ۡۢ") + i62) * 9;
                                                                    i64 = ((iM25619 ^ i63) * (-21789)) ^ 2009129441;
                                                                    i60 = -1475168384;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case -1527286293:
                                                            case 2136427440:
                                                                C0964.m3413();
                                                                C7106.m19120();
                                                                iM25619 = (i63 - C0630.m2566("᩵ܳ")) * 63;
                                                                i64 = ((iM25619 ^ i62) * (-28661)) ^ 464622589;
                                                                i60 = -891407162;
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case -1158502635:
                                                            case -135052737:
                                                                ServiceConnectionC3453.m10564();
                                                                if (C1128.m3851() > 0) {
                                                                    iM25619 = (i63 - C0630.m2566("᩵ܳ")) * 63;
                                                                    i64 = ((iM25619 ^ i62) * (-28661)) ^ 464622589;
                                                                    i60 = -891407162;
                                                                } else {
                                                                    iM25619 = C0630.m2566("᩹ܽ") ^ i62;
                                                                    i64 = ((iM25619 ^ i63) * 15615) ^ 803656680;
                                                                    i60 = 890736933;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case -1099693768:
                                                            case 1894362652:
                                                                if (C3537.f11231 >= 0) {
                                                                    iM25619 = (i63 - C2105.m6981("ۜܿ")) * (-43);
                                                                    i64 = ((iM25619 ^ i62) * (-22019)) ^ (-781031480);
                                                                    i60 = -2037541345;
                                                                } else {
                                                                    iM25619 = (i63 - C0630.m2566("ۖ᩺")) * (-101);
                                                                    i64 = ((iM25619 ^ i62) * (-9523)) ^ 14800865;
                                                                    i60 = -696838176;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case -1078028998:
                                                            case -64248752:
                                                                if (C1504.f5354) {
                                                                    iM25619 = C2105.m6981("᩺ۚ") ^ i62;
                                                                    i64 = ((iM25619 ^ i63) * 20535) ^ (-1591450361);
                                                                    i60 = -1002642837;
                                                                } else {
                                                                    iM25619 = (C2105.m6981("۫ܶ") + i63) * 75;
                                                                    i64 = ((iM25619 ^ i62) * (-20093)) ^ 286076468;
                                                                    i60 = -783139335;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case -1034214984:
                                                            case 683240722:
                                                                if (C0714.f2697 >= 0) {
                                                                    iM25619 = (i63 - C2105.m6981("ۜܿ")) * (-43);
                                                                    i64 = ((iM25619 ^ i62) * (-22019)) ^ (-781031480);
                                                                    i60 = -2037541345;
                                                                } else {
                                                                    iM25619 = C0630.m2566("ܿۢ") ^ i62;
                                                                    i64 = ((iM25619 ^ i63) * (-17759)) ^ (-472180146);
                                                                    i60 = -519399755;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case -626713969:
                                                            case 21990679:
                                                                C22268.m49991(c22269, c29731, c29732, c29730, c102314, c102315, c11667, z);
                                                                break;
                                                            case -426267383:
                                                            case 1440483041:
                                                                C3537.m10746();
                                                                if (C0050.f910 >= 0) {
                                                                    iM25619 = (i63 - C0630.m2566("᩵ܳ")) * 63;
                                                                    i64 = ((iM25619 ^ i62) * (-28661)) ^ 464622589;
                                                                    i60 = -891407162;
                                                                } else {
                                                                    iM25619 = (i63 - C2105.m6981("ۜܿ")) * (-43);
                                                                    i64 = ((iM25619 ^ i62) * (-22019)) ^ (-781031480);
                                                                    i60 = -2037541345;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case -68835324:
                                                            case 634918289:
                                                                ViewOnClickListenerC1958.m6429();
                                                                if (C1916.f6442) {
                                                                    iM25619 = (i63 - C0630.m2566("᩵ܳ")) * 63;
                                                                    i64 = ((iM25619 ^ i62) * (-28661)) ^ 464622589;
                                                                    i60 = -891407162;
                                                                } else {
                                                                    iM25619 = C2105.m6981("᩺ۚ") ^ i62;
                                                                    i64 = ((iM25619 ^ i63) * 20535) ^ (-1591450361);
                                                                    i60 = -1002642837;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case 426015013:
                                                            case 1439739047:
                                                                if (C1005.f3721) {
                                                                    iM25619 = (i62 - C0630.m2566("ܳ۟")) * (-121);
                                                                    i64 = ((iM25619 ^ i63) * (-8969)) ^ 1684771405;
                                                                    i60 = -141302654;
                                                                } else {
                                                                    iM25619 = C2105.m6981("᩺ۚ") ^ i62;
                                                                    i64 = ((iM25619 ^ i63) * 20535) ^ (-1591450361);
                                                                    i60 = -1002642837;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case 1128892966:
                                                            case 1701725265:
                                                                if (C2167.f7158 >= 0) {
                                                                    iM25619 = (i63 - C2105.m6981("ۜܿ")) * (-43);
                                                                    i64 = ((iM25619 ^ i62) * (-22019)) ^ (-781031480);
                                                                    i60 = -2037541345;
                                                                } else {
                                                                    iM25619 = C2105.m6981("᩺֡") ^ i63;
                                                                    i64 = ((iM25619 ^ i62) * 6655) ^ 779705418;
                                                                    i60 = -815137250;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            case 1784226293:
                                                            case 1911365761:
                                                                c22269 = c22268;
                                                                c29731 = c29728;
                                                                c29732 = c29729;
                                                                if (C0483.m2121()) {
                                                                    iM25619 = (C0630.m2566("ᩴۙ") + i63) * 37;
                                                                    i64 = ((iM25619 ^ i62) * 32397) ^ (-1502723294);
                                                                    i60 = -2041459681;
                                                                } else {
                                                                    iM25619 = C2105.m6981("᩺ۚ") ^ i62;
                                                                    i64 = ((iM25619 ^ i63) * 20535) ^ (-1591450361);
                                                                    i60 = -1002642837;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                            default:
                                                                if (C7106.f21815 != 0) {
                                                                    iM25619 = C2105.m6981("᩺ۚ") ^ i62;
                                                                    i64 = ((iM25619 ^ i63) * 20535) ^ (-1591450361);
                                                                    i60 = -1002642837;
                                                                } else {
                                                                    iM25619 = C2105.m6981("۬᩵") ^ i63;
                                                                    i64 = ((iM25619 ^ i62) * (-27369)) ^ (-873600566);
                                                                    i60 = 2115179416;
                                                                }
                                                                i65 = iM25619 ^ i60;
                                                                break;
                                                        }
                                                        return;
                                                    }
                                                }

                                                @Override // l.InterfaceC12846
                                                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                                                public final /* synthetic */ boolean mo3777(Exception exc) {
                                                    return false;
                                                }
                                            }, mainM50612, str);
                                        }
                                        iM25617 = C2105.m6981("ܺᩳ") ^ i47;
                                        i42 = ((iM25617 ^ i48) * 17805) ^ 1095532164;
                                        i43 = 709689500;
                                        int i511 = iM25617 ^ i43;
                                        sArr21 = sArr21;
                                        c192513 = c192513;
                                        i50 = i511;
                                        i49 = i42;
                                        length = length;
                                        strM3603 = strM3603;
                                        break;
                                    case 186499043:
                                    case 1515264195:
                                        spannableStringBuilderM28258.insert(i51, (CharSequence) strM9035);
                                        Main mainM49336 = C21923.m49336(c16561);
                                        int i60 = DialogInterfaceC0206.f1451;
                                        c192513 = new C19258(mainM49336);
                                        if (RunnableC1108.m3790()) {
                                            iM69814 = (i48 - C2105.m6981("ۙۖ")) * 59;
                                            i44 = ((iM69814 ^ i47) * 27777) ^ 1064983096;
                                            i45 = -698545673;
                                        } else {
                                            iM69814 = (i47 - C2105.m6981("ۘ᩷")) * 29;
                                            i44 = ((iM69814 ^ i48) * 26779) ^ (-1939066537);
                                            i45 = -926650212;
                                        }
                                        i50 = iM69814 ^ i45;
                                        i49 = i44;
                                        break;
                                    case 282017389:
                                    case 486387400:
                                        ViewOnClickListenerC1958.m6441(c192513, iM25618 ^ 2118441824, null);
                                        RunnableC0588.m2438(c192513);
                                        if (!RunnableC1108.m3790()) {
                                            iM69814 = C0630.m2566("ܿ᩶") ^ i47;
                                            i44 = ((iM69814 ^ i48) * 8787) ^ 860312482;
                                            i45 = 589101522;
                                            i50 = iM69814 ^ i45;
                                            i49 = i44;
                                        } else {
                                            c192513 = c192513;
                                            strM3603 = strM3603;
                                            length = length;
                                            sArr21 = sArr21;
                                            iM25617 = C2105.m6981("᩹۠") ^ i48;
                                            i42 = ((iM25617 ^ i47) * (-1469)) ^ (-369603917);
                                            i43 = 554330181;
                                            int i512 = iM25617 ^ i43;
                                            sArr21 = sArr21;
                                            c192513 = c192513;
                                            i50 = i512;
                                            i49 = i42;
                                            length = length;
                                            strM3603 = strM3603;
                                        }
                                        break;
                                    case 904761071:
                                    case 1817385697:
                                        iM25618 = C0630.m2566(C0382.m1840(sArr21, 8, 3, i53));
                                        if (C3019.f9544 >= 0) {
                                            iM69814 = (C2105.m6981("ۖ۟") ^ i47) * (-95);
                                            i44 = ((iM69814 ^ i48) * (-25207)) ^ (-186351166);
                                            i45 = -710184092;
                                        } else {
                                            iM69814 = (i48 - C2105.m6981("ᩳᩴ")) * (-125);
                                            i44 = ((iM69814 ^ i47) * 8845) ^ 346298984;
                                            i45 = -2040267592;
                                        }
                                        i50 = iM69814 ^ i45;
                                        i49 = i44;
                                        break;
                                    case 975237851:
                                    case 1831046014:
                                        C3911.m11924();
                                        break;
                                    case 1142110393:
                                    case 1226553815:
                                        c192513 = c192513;
                                        try {
                                            C11459.m28260(str22);
                                            iM3007 = C0798.m3007(str22);
                                            iM69813 = C0630.m2566("᩸ۨ") ^ i48;
                                            i38 = ((iM69813 ^ i47) * 25981) ^ 1998023050;
                                            i40 = 1930436485;
                                        } catch (PatternSyntaxException e) {
                                            patternSyntaxException = e;
                                            iM69813 = C0630.m2566("ۤܺ") ^ i48;
                                            i38 = ((iM69813 ^ i47) * (-13199)) ^ 962267728;
                                            i40 = -192145080;
                                        }
                                        i41 = iM69813 ^ i40;
                                        C19258 c192519 = c192513;
                                        i50 = i41;
                                        i49 = i38;
                                        c192513 = c192519;
                                        break;
                                    case 1142130848:
                                    case 1523394866:
                                        C3432.m10490(c192513, C0630.m2566(strM6988) ^ 2129625499);
                                        C3019.m9252(c192513, spannableStringBuilderM28258);
                                        sArr21 = f16638;
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM69814 = C0630.m2566("᩸֨") ^ i48;
                                            i44 = ((iM69814 ^ i47) * (-16035)) ^ 707796664;
                                            i45 = 742394412;
                                        } else {
                                            iM69814 = (C0630.m2566("ᩴۗ") + i47) * (-105);
                                            i44 = ((iM69814 ^ i48) * (-5381)) ^ 626756749;
                                            i45 = 93669342;
                                        }
                                        i50 = iM69814 ^ i45;
                                        i49 = i44;
                                        break;
                                    case 1246500057:
                                    case 1856530543:
                                        c192513 = c192513;
                                        i37 = length;
                                        if (i52 >= i37) {
                                            str20 = strM3603;
                                            sArr20 = sArr21;
                                            c29722 = c29725;
                                            c29723 = c29724;
                                            int iM698111 = (C2105.m6981("ܺܳ") ^ i47) * (-117);
                                            c29724 = c29723;
                                            c192513 = c192513;
                                            c29725 = c29722;
                                            i50 = iM698111 ^ 121110697;
                                            i49 = ((iM698111 ^ i48) * 17635) ^ 436245374;
                                            sArr21 = sArr20;
                                            strM3603 = str20;
                                            length = i37;
                                        } else {
                                            iM69812 = C2105.m6981("᩵ۧ") ^ i48;
                                            i38 = ((iM69812 ^ i47) * (-9439)) ^ (-889857210);
                                            i39 = 776526486;
                                            i41 = iM69812 ^ i39;
                                            length = i37;
                                            C19258 c1925110 = c192513;
                                            i50 = i41;
                                            i49 = i38;
                                            c192513 = c1925110;
                                        }
                                        break;
                                    case 1440850868:
                                    case 1461628215:
                                        C2105.m6982();
                                        if (ServiceConnectionC3453.m10564() > 0) {
                                            iM69814 = (i48 - C2105.m6981("ۙۖ")) * 59;
                                            i44 = ((iM69814 ^ i47) * 27777) ^ 1064983096;
                                            i45 = -698545673;
                                        } else {
                                            iM69814 = (C2105.m6981("ۖ۟") ^ i47) * (-95);
                                            i44 = ((iM69814 ^ i48) * (-25207)) ^ (-186351166);
                                            i45 = -710184092;
                                        }
                                        i50 = iM69814 ^ i45;
                                        i49 = i44;
                                        break;
                                    case 1561030425:
                                    case 1696311133:
                                        c192513 = c192513;
                                        strM6988 = C2105.m6988(f16638, 5, 3, i53);
                                        if (C1047.f3863 < 0) {
                                            iM69813 = C2105.m6981("᩹ۜ") ^ i48;
                                            i38 = ((iM69813 ^ i47) * (-26449)) ^ (-1285568125);
                                            i40 = -251336693;
                                            i41 = iM69813 ^ i40;
                                            C19258 c1925111 = c192513;
                                            i50 = i41;
                                            i49 = i38;
                                            c192513 = c1925111;
                                        } else {
                                            iM25617 = C2105.m6981("ܺᩳ") ^ i47;
                                            i42 = ((iM25617 ^ i48) * 17805) ^ 1095532164;
                                            i43 = 709689500;
                                            int i513 = iM25617 ^ i43;
                                            sArr21 = sArr21;
                                            c192513 = c192513;
                                            i50 = i513;
                                            i49 = i42;
                                            length = length;
                                            strM3603 = strM3603;
                                        }
                                        break;
                                    default:
                                        c192513 = c192513;
                                        String str23 = strM19510;
                                        i37 = length;
                                        if (!C0714.m2804(c29725)) {
                                            strM19510 = str23;
                                            str20 = strM3603;
                                            sArr20 = sArr21;
                                            c29722 = c29725;
                                            c29723 = c29724;
                                            int iM698112 = (C2105.m6981("ܺܳ") ^ i47) * (-117);
                                            c29724 = c29723;
                                            c192513 = c192513;
                                            c29725 = c29722;
                                            i50 = iM698112 ^ 121110697;
                                            i49 = ((iM698112 ^ i48) * 17635) ^ 436245374;
                                            sArr21 = sArr20;
                                            strM3603 = str20;
                                            length = i37;
                                        } else {
                                            iM69812 = C2105.m6981("ۧ᩻") ^ i47;
                                            strM19510 = str23;
                                            i38 = ((iM69812 ^ i48) * 26157) ^ (-1961325449);
                                            i39 = -1021158630;
                                            i41 = iM69812 ^ i39;
                                            length = i37;
                                            C19258 c1925112 = c192513;
                                            i50 = i41;
                                            i49 = i38;
                                            c192513 = c1925112;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    return;
                case -258955468:
                case 1844387847:
                    TextView textView24 = textView6;
                    strM1959 = strM1959;
                    textView = textView24;
                    String str20 = str5;
                    C21923.m49331(c10238, C0964.m3407(ApplicationC20075.f65008, C4159.m12578(f72243, 30, 5, i25), str20));
                    sArr15 = f72243;
                    i31 = 35;
                    i32 = 3;
                    int iM69812 = (C2105.m6981("ܿᩳ") + i23) * (-125);
                    i27 = iM69812 ^ (-708150116);
                    i34 = ((iM69812 ^ i24) * IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) ^ 1169773624;
                    str5 = str20;
                    i33 = i33;
                    sArr17 = sArr17;
                    c29713 = c29713;
                    c29712 = c29712;
                    c10237 = c10237;
                    c19258M2130 = c19258M2130;
                    textView8 = textView8;
                    sArr16 = sArr16;
                    textView7 = textView7;
                    viewOnClickListenerC14058 = viewOnClickListenerC14058;
                    String str111 = strM1959;
                    textView6 = textView;
                    strM1959 = str111;
                    break;
                case -188261896:
                case 548476531:
                    C4159.m12565();
                    if (!C1005.f3721) {
                        iM6982 = C2105.m6981("֫ܿ") ^ i24;
                        i20 = ((iM6982 ^ i23) * 31061) ^ (-491176377);
                        i21 = 1470795695;
                        i27 = iM6982 ^ i21;
                        i34 = i20;
                    } else {
                        view2 = view4;
                        c192510 = c19258M2130;
                        str2 = str5;
                        textView3 = textView8;
                        viewOnClickListenerC14055 = viewOnClickListenerC14058;
                        textView4 = textView7;
                        sArr5 = sArr14;
                        sArr6 = sArr15;
                        i8 = i31;
                        i9 = i32;
                        sArr7 = sArr17;
                        i10 = i33;
                        c29710 = c29713;
                        TextView textView110 = textView6;
                        strM1959 = strM1959;
                        textView = textView110;
                        int iM25617 = (C0630.m2566("۠۫") + i23) * (-99);
                        i11 = ((iM25617 ^ i24) * (-11051)) ^ (-2000252281);
                        sArr14 = sArr5;
                        i33 = i10;
                        i32 = i9;
                        sArr17 = sArr7;
                        c29713 = c29710;
                        view4 = view2;
                        c19258M2130 = c192510;
                        textView8 = textView3;
                        textView7 = textView4;
                        sArr15 = sArr6;
                        i31 = i8;
                        viewOnClickListenerC14058 = viewOnClickListenerC14055;
                        str5 = str2;
                        i27 = iM25617 ^ (-694770196);
                        i34 = i11;
                        String str112 = strM1959;
                        textView6 = textView;
                        strM1959 = str112;
                    }
                    break;
                case -25827742:
                case -11381300:
                    c10236 = c10237;
                    obj = null;
                    C1294.m4380(c19258M2130, C2105.m6981(C4616.m13542(f72243, 78, 3, i25)) ^ 2125739378, null);
                    iM2568 = (C0630.m2566("ۡ֨") ^ i23) * (-99);
                    i18 = ((iM2568 ^ i24) * 9903) ^ (-2055332941);
                    i19 = -914676418;
                    i27 = iM2568 ^ i19;
                    i34 = i18;
                    c10237 = c10236;
                    break;
                case 13082385:
                case 2034028009:
                    c10236 = c10237;
                    c19259 = c19258M2130;
                    viewOnClickListenerC14057 = viewOnClickListenerC14058;
                    TextView textView25 = textView7;
                    C2126.m7039(viewM3507, viewOnClickListenerC14057);
                    c2979 = c29713;
                    iM6984 = C2105.m6981(C1773.m5917(f72243, 49, 3, i25));
                    i29 = 2103380871;
                    if (C7811.f24123 < 0) {
                        int iM69813 = (C2105.m6981("۬᩷") + i23) * (-11);
                        i27 = iM69813 ^ (-305109749);
                        i34 = ((iM69813 ^ i24) * 8149) ^ (-140614337);
                        textView7 = textView25;
                        c29713 = c2979;
                        c19258M2130 = c19259;
                        viewOnClickListenerC14058 = viewOnClickListenerC14057;
                        c10237 = c10236;
                    } else {
                        c29712 = c29712;
                        textView7 = textView25;
                        viewOnClickListenerC14054 = viewOnClickListenerC14057;
                        textView2 = textView8;
                        c10237 = c10236;
                        sArr3 = sArr16;
                        sArr4 = sArr17;
                        i6 = i33;
                        view = view4;
                        sArr2 = sArr14;
                        int iM25618 = C0630.m2566("ᩳ۟") ^ i24;
                        sArr12 = sArr12;
                        sArr14 = sArr2;
                        i33 = i6;
                        i32 = i32;
                        sArr17 = sArr4;
                        c29713 = c2979;
                        view4 = view;
                        c19258M2130 = c19259;
                        textView8 = textView2;
                        sArr16 = sArr3;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14054;
                        str5 = str5;
                        i27 = iM25618 ^ 325973871;
                        i34 = ((iM25618 ^ i23) * (-5707)) ^ 1482946623;
                        c29712 = c29712;
                        textView7 = textView7;
                    }
                    break;
                case 566252878:
                case 1939793380:
                    C2978 c29722 = c29713;
                    C10235 c102312 = c10237;
                    C19258 c192513 = c19258M2130;
                    short[] sArr20 = sArr17;
                    int i37 = i33;
                    viewM3507 = C1005.m3507(viewM9259, C2105.m6981(C4263.m12817(sArr20, i37, 3, i25)) ^ 2103994786);
                    ViewOnClickListenerC14054 viewOnClickListenerC140510 = new ViewOnClickListenerC14054(1, c16560);
                    int iM69814 = (C2105.m6981("۟ۙ") ^ i23) * 27;
                    i34 = ((iM69814 ^ i24) * (-22321)) ^ (-1389602949);
                    i27 = iM69814 ^ (-1291645404);
                    sArr17 = sArr20;
                    i33 = i37;
                    c29713 = c29722;
                    viewOnClickListenerC14058 = viewOnClickListenerC140510;
                    c10237 = c102312;
                    c19258M2130 = c192513;
                    textView7 = textView7;
                    break;
                case 897012389:
                case 2146828851:
                    c10236 = c10237;
                    c19259 = c19258M2130;
                    TextView textView26 = textView8;
                    viewOnClickListenerC14057 = viewOnClickListenerC14058;
                    TextView textView27 = textView7;
                    sArr4 = sArr17;
                    i6 = i33;
                    c2979 = c29713;
                    c29712 = c29712;
                    textView2 = textView26;
                    short[] sArr21 = sArr16;
                    textView6 = (TextView) C11340.m28028(viewM9259, C2105.m6981(C2272.m7507(sArr21, 38, 3, i25)) ^ 2104331568);
                    sArr3 = sArr21;
                    textView7 = textView27;
                    String strM10633 = RunnableC3474.m10633(f72243, 41, 2, i25);
                    StringBuilder sb = new StringBuilder(strM10633);
                    C1128.m3845(sb, C3683.m11212(textView6));
                    strM1959 = C0422.m1959(sb);
                    if (C3911.f12484 < 0) {
                        int iM25619 = (C0630.m2566("ۙܿ") ^ i23) * (-117);
                        i27 = iM25619 ^ 1710853291;
                        str4 = strM10633;
                        i34 = ((iM25619 ^ i24) * (-21357)) ^ 1907229682;
                        i33 = i6;
                        sArr17 = sArr4;
                        c29713 = c2979;
                        c29712 = c29712;
                        c19258M2130 = c19259;
                        textView8 = textView2;
                        sArr16 = sArr3;
                        textView7 = textView7;
                        viewOnClickListenerC14058 = viewOnClickListenerC14057;
                        c10237 = c10236;
                    } else {
                        str4 = strM10633;
                        viewOnClickListenerC14054 = viewOnClickListenerC14057;
                        c10237 = c10236;
                        view = view4;
                        sArr2 = sArr14;
                        int iM256110 = C0630.m2566("ᩳ۟") ^ i24;
                        sArr12 = sArr12;
                        sArr14 = sArr2;
                        i33 = i6;
                        i32 = i32;
                        sArr17 = sArr4;
                        c29713 = c2979;
                        view4 = view;
                        c19258M2130 = c19259;
                        textView8 = textView2;
                        sArr16 = sArr3;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14054;
                        str5 = str5;
                        i27 = iM256110 ^ 325973871;
                        i34 = ((iM256110 ^ i23) * (-5707)) ^ 1482946623;
                        c29712 = c29712;
                        textView7 = textView7;
                    }
                    break;
                case 904805458:
                case 1886035363:
                    view4 = view4;
                    c192511 = c19258M2130;
                    str5 = str5;
                    textView8 = textView8;
                    viewOnClickListenerC14058 = viewOnClickListenerC14058;
                    textView7 = textView7;
                    sArr15 = sArr15;
                    i31 = i31;
                    i32 = i32;
                    sArr16 = sArr16;
                    sArr8 = sArr17;
                    i12 = i33;
                    c29713 = c29713;
                    c29712 = c29712;
                    TextView textView28 = textView6;
                    strM1959 = strM1959;
                    textView = textView28;
                    short[] sArr22 = sArr14;
                    c10238 = (C10235) C11340.m28028(viewM9259, C2105.m6981(C1916.m6311(sArr22, 22, 3, i25)) ^ 2101545198);
                    strM24614 = C9679.m24614((Object[]) C5082.f15967, '\n');
                    int iM25620 = C0630.m2566("۟ܳ") ^ i23;
                    i27 = iM25620 ^ 1773814757;
                    i34 = ((iM25620 ^ i24) * (-1275)) ^ 1485492486;
                    sArr14 = sArr22;
                    i33 = i12;
                    i32 = i32;
                    sArr17 = sArr8;
                    c29713 = c29713;
                    c29712 = c29712;
                    view4 = view4;
                    c19258M2130 = c192511;
                    textView8 = textView8;
                    sArr16 = sArr16;
                    textView7 = textView7;
                    sArr15 = sArr15;
                    i31 = i31;
                    viewOnClickListenerC14058 = viewOnClickListenerC14058;
                    str5 = str5;
                    String str113 = strM1959;
                    textView6 = textView;
                    strM1959 = str113;
                    break;
                case 1290914335:
                case 1519451884:
                    C10235 c102313 = c10237;
                    c192510 = c19258M2130;
                    textView3 = textView8;
                    ViewOnClickListenerC14054 viewOnClickListenerC140511 = viewOnClickListenerC14058;
                    textView4 = textView7;
                    short[] sArr23 = sArr15;
                    sArr7 = sArr17;
                    i10 = i33;
                    c29710 = c29713;
                    C2978 c29723 = c29712;
                    int i38 = i31;
                    int i39 = i32;
                    TextView textView29 = textView6;
                    strM1959 = strM1959;
                    textView = textView29;
                    sArr6 = sArr23;
                    i8 = i38;
                    C2126.m7039(C1005.m3507(viewM9259, C2105.m6981(C3911.m11919(sArr23, i38, i39, i25)) ^ 2102019648), new View.OnClickListener(this) { // from class: l.ܺۨܽ

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C22268 f49169;

                        {
                            int i40 = 581224098;
                            int i41 = AbstractC2021.f6743;
                            int i42 = C4075.f12947;
                            int iM25621 = C0630.m2566("ۚᩴ") ^ i41;
                            int i43 = ((iM25621 ^ i42) * (-2975)) ^ (-189448379);
                            int i44 = 1736217715;
                            while (true) {
                                i40 = ((((i40 ^ i42) * 10511) >> 31) & i43) ^ (iM25621 ^ i44);
                                switch (i40) {
                                    case -2062883312:
                                    case -412356424:
                                        if (C3537.f11231 >= 0) {
                                            iM25621 = (i42 - C2105.m6981("ۡ᩷")) * (-25);
                                            i43 = ((iM25621 ^ i41) * (-14421)) ^ (-608484239);
                                            i44 = -288376201;
                                        } else {
                                            iM25621 = C2105.m6981("᩸᩹") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 27559) ^ 1051678099;
                                            i44 = 467508171;
                                        }
                                        break;
                                    case -1972077478:
                                    case 381329632:
                                        return;
                                    case -1640226452:
                                    case 1299471177:
                                        C3245.m9925();
                                        C0714.m2805();
                                        throw new RuntimeException();
                                    case -1618244017:
                                    case -1241592592:
                                        if (C2520.f8000 >= 0) {
                                            iM25621 = C2105.m6981("ۙۘ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 3231) ^ 1796094538;
                                            i44 = -328994565;
                                        } else {
                                            iM25621 = (C2105.m6981("ۧۙ") + i42) * (-53);
                                            i43 = ((iM25621 ^ i41) * 2509) ^ 28090121;
                                            i44 = -257513677;
                                        }
                                        break;
                                    case -1356781641:
                                    case -914753196:
                                        if (C0964.m3413()) {
                                            iM25621 = C0630.m2566("ۨۘ") ^ i42;
                                            i43 = ((iM25621 ^ i41) * 15017) ^ (-64322980);
                                            i44 = 1034224088;
                                        } else {
                                            iM25621 = C2105.m6981("ۙۘ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 3231) ^ 1796094538;
                                            i44 = -328994565;
                                        }
                                        break;
                                    case -1161190297:
                                    case 383691537:
                                        if (!C1916.f6442) {
                                            iM25621 = (i41 - C2105.m6981("ܶۧ")) * (-123);
                                            i43 = ((iM25621 ^ i42) * 28973) ^ (-1436352654);
                                            i44 = -646897078;
                                        } else {
                                            iM25621 = (C0630.m2566("ۘ᩺") + i42) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i43 = ((iM25621 ^ i41) * (-5103)) ^ (-439861373);
                                            i44 = 1553246091;
                                        }
                                        break;
                                    case -1051451906:
                                    case 638028471:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM25621 = C2105.m6981("ۙۘ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 3231) ^ 1796094538;
                                            i44 = -328994565;
                                        } else {
                                            iM25621 = C2105.m6981("֫ۤ") ^ i42;
                                            i43 = ((iM25621 ^ i41) * (-707)) ^ (-581665213);
                                            i44 = -1042161134;
                                        }
                                        break;
                                    case -552449238:
                                    case 1236944211:
                                        if (C4263.m12819() >= 0) {
                                            iM25621 = C2105.m6981("ۙۘ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 3231) ^ 1796094538;
                                            i44 = -328994565;
                                        } else {
                                            iM25621 = (C2105.m6981("ᩳܺ") + i41) * (-103);
                                            i43 = ((iM25621 ^ i42) * (-31673)) ^ (-35977043);
                                            i44 = -1892527571;
                                        }
                                        break;
                                    case -472976537:
                                    case -438349851:
                                        if (C4075.f12947 >= 0) {
                                            iM25621 = (C0630.m2566("ۘ᩺") + i42) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i43 = ((iM25621 ^ i41) * (-5103)) ^ (-439861373);
                                            i44 = 1553246091;
                                        } else {
                                            iM25621 = (i41 - C0630.m2566("ܺᩴ")) * 75;
                                            i43 = ((iM25621 ^ i42) * (-819)) ^ 820013400;
                                            i44 = 1146656717;
                                        }
                                        break;
                                    case -313106802:
                                    case 836171050:
                                        this.f49169 = this;
                                        if (C1711.f5919) {
                                            iM25621 = C2105.m6981("ۙۘ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 3231) ^ 1796094538;
                                            i44 = -328994565;
                                        } else {
                                            iM25621 = C0630.m2566("ܽ֡") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-27601)) ^ (-388066760);
                                            i44 = 1890444080;
                                        }
                                        break;
                                    case 200579401:
                                    case 670449262:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM25621 = C2105.m6981("ۙۘ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 3231) ^ 1796094538;
                                            i44 = -328994565;
                                        } else {
                                            iM25621 = C0630.m2566("֡᩹") ^ i42;
                                            i43 = ((iM25621 ^ i41) * (-29835)) ^ 192595397;
                                            i44 = -1629390400;
                                        }
                                        break;
                                    case 257526666:
                                    case 1088212599:
                                        if (C5695.m16023() >= 0) {
                                            iM25621 = C2105.m6981("ۙۘ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 3231) ^ 1796094538;
                                            i44 = -328994565;
                                        } else {
                                            iM25621 = (C0630.m2566("ܽ֫") + i41) * 7;
                                            i43 = ((iM25621 ^ i42) * 12971) ^ 770084489;
                                            i44 = -1058232700;
                                        }
                                        break;
                                    case 803773985:
                                    case 1998996763:
                                        if (RunnableC0588.m2441() < 0) {
                                            iM25621 = (i41 - C2105.m6981("ܶۧ")) * (-123);
                                            i43 = ((iM25621 ^ i42) * 28973) ^ (-1436352654);
                                            i44 = -646897078;
                                        } else {
                                            iM25621 = (i42 - C2105.m6981("ۡ᩷")) * (-25);
                                            i43 = ((iM25621 ^ i41) * (-14421)) ^ (-608484239);
                                            i44 = -288376201;
                                        }
                                        break;
                                    case 877736445:
                                    case 1334663517:
                                        if (C2958.f9394 >= 0) {
                                            iM25621 = (i41 - C2105.m6981("ܶۧ")) * (-123);
                                            i43 = ((iM25621 ^ i42) * 28973) ^ (-1436352654);
                                            i44 = -646897078;
                                        } else {
                                            iM25621 = C2105.m6981("ۗ۫") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 11203) ^ 399897520;
                                            i44 = 376871680;
                                        }
                                        break;
                                    case 1107103961:
                                    case 1109361831:
                                        C2105.m6982();
                                        iM25621 = C2105.m6981("᩸᩹") ^ i41;
                                        i43 = ((iM25621 ^ i42) * 27559) ^ 1051678099;
                                        i44 = 467508171;
                                        break;
                                    default:
                                        if (C1294.f4556 >= 0) {
                                            iM25621 = C2105.m6981("ۙۘ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 3231) ^ 1796094538;
                                            i44 = -328994565;
                                        } else {
                                            iM25621 = (C0630.m2566("ۛ֨") ^ i42) * (-91);
                                            i43 = ((iM25621 ^ i41) * (-31381)) ^ 399258316;
                                            i44 = 1687194766;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            C16560 c16561 = null;
                            Main mainM50612 = null;
                            InterfaceC7785 interfaceC7785M28030 = null;
                            int i40 = 30174922;
                            int i41 = C3911.f12484;
                            int i42 = C3683.f11629;
                            int iM25621 = (C0630.m2566("ۜ֨") ^ i41) * (-37);
                            int i43 = ((iM25621 ^ i42) * (-19807)) ^ 49810650;
                            int i44 = 51512637;
                            while (true) {
                                i40 = ((((i40 ^ i42) * (-3491)) >> 31) & i43) ^ (iM25621 ^ i44);
                                switch (i40) {
                                    case -2105025291:
                                    case -1222831094:
                                        if (C4117.m12364() == 0) {
                                            iM25621 = C2105.m6981("ᩴܶ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 6539) ^ 1324194609;
                                            i44 = -1230008046;
                                        } else {
                                            iM25621 = C0630.m2566("۫᩻") ^ i42;
                                            i43 = ((iM25621 ^ i41) * 7867) ^ (-1976329552);
                                            i44 = 1855502515;
                                        }
                                        break;
                                    case -2024223825:
                                    case 1909140194:
                                        if (C3245.f10203 <= 0) {
                                            iM25621 = C2105.m6981("ۗ᩶") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-26267)) ^ 876132796;
                                            i44 = 1684280479;
                                        } else {
                                            iM25621 = C0630.m2566("۫᩻") ^ i42;
                                            i43 = ((iM25621 ^ i41) * 7867) ^ (-1976329552);
                                            i44 = 1855502515;
                                        }
                                        break;
                                    case -1929871284:
                                    case 2000148779:
                                        if (C3911.f12484 >= 0) {
                                            iM25621 = C2105.m6981("ᩴܶ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 6539) ^ 1324194609;
                                            i44 = -1230008046;
                                        } else {
                                            iM25621 = C0630.m2566("۠ۙ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-12633)) ^ (-1466889807);
                                            i44 = 260155230;
                                        }
                                        break;
                                    case -1709209170:
                                    case 971231686:
                                        C2105.m6982();
                                        C4616.m13552();
                                        break;
                                    case -1575058914:
                                    case -35500726:
                                        if (C5695.f17556 >= 0) {
                                            iM25621 = (C2105.m6981("ܽᩳ") ^ i41) * 77;
                                            i43 = ((iM25621 ^ i42) * 10337) ^ 527036797;
                                            i44 = 477607739;
                                        } else {
                                            iM25621 = (C0630.m2566("ܰ᩸") + i42) * (-83);
                                            i43 = ((iM25621 ^ i41) * (-24873)) ^ 1901994235;
                                            i44 = -1063480070;
                                        }
                                        break;
                                    case -1444849899:
                                    case 75034119:
                                        mainM50612 = C22628.m50612(c16561);
                                        if (C0964.f3626 != 0) {
                                            iM25621 = (C2105.m6981("ܽᩳ") ^ i41) * 77;
                                            i43 = ((iM25621 ^ i42) * 10337) ^ 527036797;
                                            i44 = 477607739;
                                        } else {
                                            iM25621 = (C0630.m2566("֡ܽ") + i42) * (-51);
                                            i43 = ((iM25621 ^ i41) * 22615) ^ (-1246127362);
                                            i44 = 572318162;
                                        }
                                        break;
                                    case -812326121:
                                    case 945920296:
                                        if (C2126.f7087) {
                                            iM25621 = C2105.m6981("ۗ᩶") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-26267)) ^ 876132796;
                                            i44 = 1684280479;
                                        } else {
                                            iM25621 = C0630.m2566("ۛۜ") ^ i42;
                                            i43 = ((iM25621 ^ i41) * 14525) ^ 1396026638;
                                            i44 = -3129355;
                                        }
                                        break;
                                    case -652166014:
                                    case 190260601:
                                        if (C0483.f2088 >= 0) {
                                            iM25621 = C2105.m6981("ᩴܶ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 6539) ^ 1324194609;
                                            i44 = -1230008046;
                                        } else {
                                            iM25621 = C2105.m6981("ۘ᩹") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-20881)) ^ 2135050811;
                                            i44 = -1956407797;
                                        }
                                        break;
                                    case -379430222:
                                    case 710517156:
                                        if (C0714.f2697 >= 0) {
                                            iM25621 = (i42 - C2105.m6981("ᩴۜ")) * 9;
                                            i43 = ((iM25621 ^ i41) * (-6149)) ^ (-2068111195);
                                            i44 = 535852162;
                                        } else {
                                            iM25621 = C0630.m2566("֡ۡ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-31569)) ^ 224899031;
                                            i44 = -561903011;
                                        }
                                        break;
                                    case -56385773:
                                    case 1837129407:
                                        c16561 = c16560;
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM25621 = C2105.m6981("ۗ᩶") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-26267)) ^ 876132796;
                                            i44 = 1684280479;
                                        } else {
                                            iM25621 = C2105.m6981("ۧ֡") ^ i42;
                                            i43 = ((iM25621 ^ i41) * 5935) ^ (-867542292);
                                            i44 = -251661200;
                                        }
                                        break;
                                    case 535657657:
                                    case 1791805575:
                                        interfaceC7785M28030 = C11340.m28030(c10238);
                                        if (C21923.f70183 != 0) {
                                            iM25621 = (C2105.m6981("ܽᩳ") ^ i41) * 77;
                                            i43 = ((iM25621 ^ i42) * 10337) ^ 527036797;
                                            i44 = 477607739;
                                        } else {
                                            iM25621 = C0630.m2566("ۤᩴ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-10727)) ^ 773614609;
                                            i44 = 1941328001;
                                        }
                                        break;
                                    case 1011946890:
                                    case 1347390533:
                                        C1711.m5736();
                                        C3245.m9925();
                                        iM25621 = C0630.m2566("۫᩻") ^ i42;
                                        i43 = ((iM25621 ^ i41) * 7867) ^ (-1976329552);
                                        i44 = 1855502515;
                                        break;
                                    case 1680331755:
                                    case 1862193564:
                                        C2958.m9034();
                                        if (!C3663.f11553) {
                                            iM25621 = (i42 - C2105.m6981("ᩴۜ")) * 9;
                                            i43 = ((iM25621 ^ i41) * (-6149)) ^ (-2068111195);
                                            i44 = 535852162;
                                        } else {
                                            iM25621 = C2105.m6981("ۗ᩶") ^ i41;
                                            i43 = ((iM25621 ^ i42) * (-26267)) ^ 876132796;
                                            i44 = 1684280479;
                                        }
                                        break;
                                    default:
                                        String strM947 = C0050.m947(interfaceC7785M28030);
                                        if (C1711.m5736() > 0) {
                                            C22268 c22268 = this.f49169;
                                            if (RunnableC0588.f2309 < 0) {
                                                C0964.m3402(new C8157(c22268, mainM50612, strM947));
                                            }
                                            iM25621 = C2105.m6981("ᩴܶ") ^ i41;
                                            i43 = ((iM25621 ^ i42) * 6539) ^ 1324194609;
                                            i44 = -1230008046;
                                        } else {
                                            iM25621 = (i42 - C2105.m6981("ᩴۜ")) * 9;
                                            i43 = ((iM25621 ^ i41) * (-6149)) ^ (-2068111195);
                                            i44 = 535852162;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    sArr16 = f72243;
                    if (C11340.f33930 >= 0) {
                        viewOnClickListenerC14055 = viewOnClickListenerC140511;
                        str2 = str5;
                        c10237 = c102313;
                        i9 = i39;
                        view2 = view4;
                        c29712 = c29723;
                        sArr5 = sArr14;
                        int iM256111 = (C0630.m2566("۠۫") + i23) * (-99);
                        i11 = ((iM256111 ^ i24) * (-11051)) ^ (-2000252281);
                        sArr14 = sArr5;
                        i33 = i10;
                        i32 = i9;
                        sArr17 = sArr7;
                        c29713 = c29710;
                        view4 = view2;
                        c19258M2130 = c192510;
                        textView8 = textView3;
                        textView7 = textView4;
                        sArr15 = sArr6;
                        i31 = i8;
                        viewOnClickListenerC14058 = viewOnClickListenerC14055;
                        str5 = str2;
                        i27 = iM256111 ^ (-694770196);
                        i34 = i11;
                    } else {
                        int iM25621 = (C0630.m2566("֫ܳ") + i24) * 91;
                        i27 = iM25621 ^ (-260153315);
                        i32 = i39;
                        i34 = ((iM25621 ^ i23) * (-9439)) ^ (-255638429);
                        i33 = i10;
                        sArr17 = sArr7;
                        c29713 = c29710;
                        c29712 = c29723;
                        c19258M2130 = c192510;
                        textView8 = textView3;
                        textView7 = textView4;
                        sArr15 = sArr6;
                        i31 = i8;
                        viewOnClickListenerC14058 = viewOnClickListenerC140511;
                        c10237 = c102313;
                    }
                    String str114 = strM1959;
                    textView6 = textView;
                    strM1959 = str114;
                    break;
                default:
                    c10235 = c10237;
                    c19258 = c19258M2130;
                    ViewOnClickListenerC14054 viewOnClickListenerC140512 = viewOnClickListenerC14058;
                    TextView textView30 = textView7;
                    c29713 = c29713;
                    String str21 = str4;
                    StringBuilder sb2 = new StringBuilder(str21);
                    C1128.m3845(sb2, RunnableC0588.m2442(textView8));
                    TextView textView31 = textView8;
                    C1047.m3601(textView31, C0050.m947(sb2));
                    sArr17 = f72243;
                    i33 = 46;
                    if (C7811.f24123 < 0) {
                        int iM25622 = C0630.m2566("۬۠") ^ i24;
                        i27 = iM25622 ^ 1428547152;
                        i34 = ((iM25622 ^ i23) * 16587) ^ (-1264915399);
                        textView7 = textView30;
                        str4 = str21;
                        c29713 = c29713;
                        viewOnClickListenerC14058 = viewOnClickListenerC140512;
                        textView8 = textView31;
                        c10237 = c10235;
                        c19258M2130 = c19258;
                    } else {
                        str4 = str21;
                        c29712 = c29712;
                        textView7 = textView30;
                        viewOnClickListenerC14058 = viewOnClickListenerC140512;
                        textView8 = textView31;
                        str5 = str5;
                        c10237 = c10235;
                        c19258M2130 = c19258;
                        sArr15 = sArr15;
                        i31 = i31;
                        i32 = i32;
                        sArr16 = sArr16;
                        view4 = view4;
                        TextView textView111 = textView6;
                        strM1959 = strM1959;
                        textView = textView111;
                        int iM69815 = C2105.m6981("ܶܶ") ^ i23;
                        i27 = iM69815 ^ (-734645922);
                        i34 = ((iM69815 ^ i24) * 16195) ^ (-754912372);
                        i32 = i32;
                        c29713 = c29713;
                        c29712 = c29712;
                        view4 = view4;
                        textView8 = textView8;
                        sArr16 = sArr16;
                        textView7 = textView7;
                        sArr15 = sArr15;
                        i31 = i31;
                        viewOnClickListenerC14058 = viewOnClickListenerC14058;
                        str5 = str5;
                        String str115 = strM1959;
                        textView6 = textView;
                        strM1959 = str115;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0106 A[PHI: r11
      0x0106: PHI (r11v5 java.lang.String) = (r11v2 java.lang.String), (r11v4 java.lang.String), (r11v2 java.lang.String) binds: [B:99:0x0106, B:29:0x0104, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0262 A[PHI: r2 r3 r4 r7 r8 r21
      0x0262: PHI (r2v3 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v5 boolean) binds: [B:50:0x0208, B:9:0x0074, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r3v15 boolean) = (r3v10 boolean), (r3v2 boolean), (r3v17 boolean) binds: [B:50:0x0208, B:9:0x0074, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r4v3 boolean) = (r4v2 boolean), (r4v2 boolean), (r4v5 boolean) binds: [B:50:0x0208, B:9:0x0074, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r7v5 l.֨۠ۢ) = (r7v4 l.֨۠ۢ), (r7v2 l.֨۠ۢ), (r7v2 l.֨۠ۢ) binds: [B:50:0x0208, B:9:0x0074, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:50:0x0208, B:9:0x0074, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r21v4 java.lang.String) = (r21v3 java.lang.String), (r21v3 java.lang.String), (r21v6 java.lang.String) binds: [B:50:0x0208, B:9:0x0074, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0311 A[PHI: r13 r15 r20
      0x0311: PHI (r13v6 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:72:0x030f, B:68:0x02f4, B:45:0x01da, B:26:0x00d6, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r15v8 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v4 short[]), (r15v2 short[]) binds: [B:72:0x030f, B:68:0x02f4, B:45:0x01da, B:26:0x00d6, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r20v40 boolean) = (r20v19 boolean), (r20v20 boolean), (r20v26 boolean), (r20v29 boolean), (r20v41 boolean) binds: [B:72:0x030f, B:68:0x02f4, B:45:0x01da, B:26:0x00d6, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49991(C22268 c22268, C2978 c2978, C2978 c2979, C2978 c29710, C10235 c10235, C10235 c10236, C11667 c11667, boolean z) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5 = RunnableC1937.f6483;
        int i6 = C4075.f12947;
        int iM6982 = (C2105.m6981("᩻᩶") + i6) * 73;
        int i7 = ((iM6982 ^ i5) * (-15831)) ^ (-1639910821);
        String strM947 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM6982 ^ 982432956;
        boolean zM7157 = false;
        boolean zM2804 = false;
        boolean zM7158 = false;
        int i9 = 0;
        boolean zM5179 = false;
        int i10 = -1476639864;
        String str = null;
        String strM50602 = null;
        String str2 = null;
        String strM9031 = null;
        String strM9025 = null;
        C0994 c0994 = null;
        C16560 c16560 = null;
        while (true) {
            i10 = i8 ^ (i7 & (((i10 ^ i5) * 25889) >> 31));
            switch (i10) {
                case -2090261368:
                case -1854832629:
                    zM2804 = zM2804;
                    sArr = f72243;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("ᩴ۟") + i6) * 31;
                        i = ((iM6981 ^ i5) * (-5891)) ^ (-479594970);
                        i2 = 1911701006;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۡ") ^ i6) * (-123);
                        i = ((iM6981 ^ i5) * (-23213)) ^ 1147457762;
                        i2 = -2089837941;
                    }
                    boolean z2 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z2;
                    break;
                case -1936901310:
                case -8839577:
                    C3911.m11930(c0994, strM9031, zM2804);
                    zM2804 = zM2804;
                    RunnableC1937.m6379(c0994, C3537.m10748(f72243, 123, 12, i9), str2);
                    if (!C1711.f5919) {
                        iM6981 = C0630.m2566("ܺ᩺") ^ i6;
                        i = ((iM6981 ^ i5) * 32683) ^ (-1724949464);
                        i2 = 1920123848;
                        boolean z3 = zM2804;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        zM2804 = z3;
                    } else {
                        zM2804 = zM2804;
                        iM2566 = C0630.m2566("ۗܶ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 19297) ^ (-35365930);
                        i4 = 1451721968;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1895658777:
                case 1391771543:
                    i9 = 43544;
                    iM6981 = C0630.m2566("᩹ܽ") ^ i6;
                    i = ((iM6981 ^ i5) * (-2471)) ^ 1350390317;
                    i2 = -1267493749;
                    boolean z4 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z4;
                    break;
                case -1871347111:
                case 196379295:
                    zM2804 = zM2804;
                    int i11 = C15104.f46193;
                    c0994 = new C0994(C21563.class);
                    strM9025 = C2958.m9025(c22268.f72245);
                    if (C3683.f11629 < 0) {
                        iM6981 = (C2105.m6981("ۢۚ") ^ i5) * 19;
                        i = ((iM6981 ^ i6) * (-6421)) ^ (-125969298);
                        i2 = 650916357;
                        boolean z5 = zM2804;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        zM2804 = z5;
                    } else {
                        zM2804 = zM2804;
                        iM2566 = C0630.m2566("ۗܶ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 19297) ^ (-35365930);
                        i4 = 1451721968;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1829153938:
                case -224823917:
                    C4159.m12565();
                    break;
                case -1791148436:
                case 84017036:
                    str2 = "";
                    str = str2;
                    zM2804 = zM2804;
                    iM6981 = (i6 - C0630.m2566("֫ۨ")) * (-31);
                    i = ((iM6981 ^ i5) * (-18533)) ^ 1242070061;
                    i2 = 1991930180;
                    boolean z6 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z6;
                    break;
                case -1750889826:
                case -949714715:
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = (C2105.m6981("֡᩵") ^ i6) * (-3);
                        i3 = ((iM2566 ^ i5) * 25045) ^ 580871508;
                        i4 = -933933054;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                    } else {
                        zM2804 = zM2804;
                        iM6981 = (C0630.m2566("ᩴ۟") + i6) * 31;
                        i = ((iM6981 ^ i5) * (-5891)) ^ (-479594970);
                        i2 = 1911701006;
                        boolean z7 = zM2804;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        zM2804 = z7;
                    }
                    break;
                case -1749729669:
                case 756929890:
                    RunnableC1937.m6379(c0994, strM50602, str);
                    c0994.m3480(c16560);
                    c0994.m3472(C22628.m50612(c16560), c11667);
                    short[] sArr3 = f72243;
                    if (C3746.f11829 <= 0) {
                        zM2804 = zM2804;
                        sArr2 = sArr3;
                        iM6981 = (C0630.m2566("ᩴ۟") + i6) * 31;
                        i = ((iM6981 ^ i5) * (-5891)) ^ (-479594970);
                        i2 = 1911701006;
                        boolean z8 = zM2804;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        zM2804 = z8;
                    } else {
                        int iM2567 = (i5 - C0630.m2566("ܳ᩵")) * (-101);
                        i7 = ((iM2567 ^ i6) * 10165) ^ 838846517;
                        i8 = iM2567 ^ 124128267;
                        sArr2 = sArr3;
                    }
                    break;
                case -1586218331:
                case -664335561:
                    zM2804 = zM2804;
                    zM5179 = C1504.m5179();
                    iM6981 = (C2105.m6981("֡ۤ") + i6) * (-107);
                    i = ((iM6981 ^ i5) * 3375) ^ 1113212578;
                    i2 = -932119705;
                    boolean z9 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z9;
                    break;
                case -1538820716:
                case -499748647:
                    zM2804 = zM2804;
                    String strM1959 = C0422.m1959(C11340.m28030(c10236));
                    c16560 = c22268.f72246;
                    c22268.f72244 = null;
                    if (zM7158) {
                        str = strM1959;
                        str2 = strM947;
                        iM6981 = (i6 - C0630.m2566("֫ۨ")) * (-31);
                        i = ((iM6981 ^ i5) * (-18533)) ^ 1242070061;
                        i2 = 1991930180;
                    } else {
                        iM6981 = C0630.m2566("۫ۙ") ^ i6;
                        i = ((iM6981 ^ i5) * (-11815)) ^ (-1856636996);
                        i2 = -1923468518;
                    }
                    boolean z10 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z10;
                    break;
                case -1486724946:
                case 1915948308:
                    i9 = 30419;
                    iM6981 = C0630.m2566("᩹ܽ") ^ i6;
                    i = ((iM6981 ^ i5) * (-2471)) ^ 1350390317;
                    i2 = -1267493749;
                    boolean z11 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z11;
                    break;
                case -1391467386:
                case 1673615265:
                    zM2804 = zM2804;
                    strM9031 = C2958.m9031(f72243, UMErrorCode.E_UM_BE_CREATE_FAILED, 12, i9);
                    if (C3019.m9255() <= 0) {
                        iM6981 = C0630.m2566("᩻۠") ^ i6;
                        i = ((iM6981 ^ i5) * (-23477)) ^ 1924323967;
                        i2 = 2122884268;
                    } else {
                        iM6981 = C2105.m6981("᩶ۛ") ^ i6;
                        i = ((iM6981 ^ i5) * (-10691)) ^ 947940126;
                        i2 = 81072575;
                    }
                    boolean z12 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z12;
                    break;
                case -1363598210:
                case -204249692:
                    C0964.m3413();
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("ܿ᩻") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-29833)) ^ (-562320467);
                        i4 = -1587883405;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                    } else {
                        zM2804 = zM2804;
                        iM6981 = (C0630.m2566("ᩴ۟") + i6) * 31;
                        i = ((iM6981 ^ i5) * (-5891)) ^ (-479594970);
                        i2 = 1911701006;
                        boolean z13 = zM2804;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        zM2804 = z13;
                    }
                    break;
                case -1018268582:
                case 807462025:
                    zM2804 = zM2804;
                    C0237.m1486(c0994, C7811.m20837(f72243, 92, 19, i9), zM7157);
                    if (C3432.m10477() > 0) {
                        iM6981 = (C2105.m6981("۠֨") + i5) * 33;
                        i = ((iM6981 ^ i6) * 20155) ^ (-1885431095);
                        i2 = 1668553908;
                        boolean z14 = zM2804;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        zM2804 = z14;
                    } else {
                        zM2804 = zM2804;
                        iM2566 = C0630.m2566("ۗܶ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 19297) ^ (-35365930);
                        i4 = 1451721968;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -981902489:
                case -183170989:
                    zM2804 = zM2804;
                    RunnableC1937.m6379(c0994, C2167.m7159(f72243, 88, 4, i9), strM9025);
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("ᩴ۟") + i6) * 31;
                        i = ((iM6981 ^ i5) * (-5891)) ^ (-479594970);
                        i2 = 1911701006;
                    } else {
                        iM6981 = C0630.m2566("ۡ᩹") ^ i6;
                        i = ((iM6981 ^ i5) * 27907) ^ 1077572877;
                        i2 = 1259702842;
                    }
                    boolean z15 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z15;
                    break;
                case -908902096:
                case 1265696097:
                    zM2804 = zM2804;
                    if (zM5179) {
                        iM6981 = C2105.m6981("ۧᩴ") ^ i5;
                        i = ((iM6981 ^ i6) * (-18185)) ^ (-314632214);
                        i2 = 9613132;
                    } else {
                        iM6981 = (C0630.m2566("ᩴ۟") + i6) * 31;
                        i = ((iM6981 ^ i5) * (-5891)) ^ (-479594970);
                        i2 = 1911701006;
                    }
                    boolean z16 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z16;
                    break;
                case -217455970:
                case -97965936:
                    strM50602 = C22628.m50602(f72243, 135, 12, i9);
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C2105.m6981("֡᩵") ^ i6) * (-3);
                        i3 = ((iM2566 ^ i5) * 25045) ^ 580871508;
                        i4 = -933933054;
                    } else {
                        iM2566 = C0630.m2566("᩶ۙ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 4629) ^ (-384092356);
                        i4 = -1124257429;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -154104143:
                case 2039695315:
                    C3683.m11222();
                    if (RunnableC1937.m6387() == 0) {
                        iM2566 = (C2105.m6981("֡᩵") ^ i6) * (-3);
                        i3 = ((iM2566 ^ i5) * 25045) ^ 580871508;
                        i4 = -933933054;
                    } else {
                        iM2566 = C0630.m2566("ۗܶ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 19297) ^ (-35365930);
                        i4 = 1451721968;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -20180655:
                case 194659:
                    zM2804 = zM2804;
                    short s = sArr[87];
                    if ((s * 29994) - ((s * s) + 224910009) <= 0) {
                        iM6981 = C2105.m6981("ۧ֡") ^ i5;
                        i = ((iM6981 ^ i6) * (-19405)) ^ (-1409282558);
                        i2 = 914449438;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i5;
                        i = ((iM6981 ^ i6) * 4979) ^ (-409408560);
                        i2 = 518104543;
                    }
                    boolean z17 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z17;
                    break;
                case 758715978:
                case 817493573:
                    C0237.m1481();
                    zM2804 = zM2804;
                    iM6981 = (C0630.m2566("ᩴ۟") + i6) * 31;
                    i = ((iM6981 ^ i5) * (-5891)) ^ (-479594970);
                    i2 = 1911701006;
                    boolean z18 = zM2804;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    zM2804 = z18;
                    break;
                case 1433735142:
                case 1981644115:
                    C3911.m11930(c0994, C1916.m6311(sArr2, 147, 15, i9), z);
                    c0994.m3469();
                    break;
                default:
                    zM7157 = C2167.m7157(c2978);
                    zM2804 = C0714.m2804(c2979);
                    zM7158 = C2167.m7157(c29710);
                    strM947 = C0050.m947(C11340.m28030(c10235));
                    if (C1711.m5736() <= 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 19297) ^ (-35365930);
                        i4 = 1451721968;
                    } else {
                        iM2566 = C0630.m2566("۬᩹") ^ i5;
                        i3 = ((iM2566 ^ i6) * 25987) ^ (-1661378768);
                        i4 = 1943363326;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
            }
            return;
        }
    }
}
