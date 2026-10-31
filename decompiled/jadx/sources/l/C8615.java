package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.i;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar448;

/* JADX INFO: renamed from: l.ۡۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8615 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f26317 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f26318;

    /* JADX INFO: renamed from: ᩶ۚ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f26319 = {1174, 15088, 15077, 15076, 15083, 15083, 15079, 15076, 15079, 15098, 15084, 15073, 15077, 15085, 15078, 15084, 15098, 15081, 15103, 15081, 15082, 15076, 15085, 15086, 15079, 15078, 15100, 15086, 15098, 15081, 15083, 15100, 15073, 15079, 15078, 15073, 15084, 15073, 15078, 15100, 15085, 15098, 15096, 15079, 15076, 15081, 15100, 15079, 15098, 15073, 15078, 15100, 15085, 15087, 15085, 15098, 15076, 15081, 15089, 15079, 15101, 15100, 15077, 15073, 15096, 15077, 15081, 15096, 15077, 15085, 15078, 15101, 15096, 15076, 15101, 15098, 15081, 15076, 15099, 15098, 15081, 15103, 15099, 15100, 15089, 15076, 15085, 15099, 15100, 15098, 15073, 15078, 15087, 15100, 15098, 15081, 15078, 15099, 15073, 15100, 15073, 15079, 15078, 15062, 15081, 15100, 15100, 15098, 15013, 15096, 15098, 15073, 15102, 15081, 15100, 15085, 15081, 15100, 15100, 15098, 15081, 15098, 15098, 15081, 15089, 15081, 15078, 15073, 15077, 15081, 15078, 15073, 15077, 15081, 15100, 15079, 15098, 15082, 15079, 15079, 15076, 7018, 11197, 11171, 11171, 11197, 1010, -3146, -3165, -3165, -3163, -3143, -3146, -3167, -3138, -3152, -3146, -3165, -3138, -3144, -3143, -3148, -3144, -3141, -3144, -3163, -3142, -3150, -3143, -3166, -3146, -3143, -3138, -3142, -3146, -3165, -3144, -3163, -3138, -3143, -3165, -3150, -3163, -3161, -3144, -3141, -3146, -3165, -3144, -3163, -3141, -3146, -3154, -3144, -3166, -3165, -3138, -3149, -3146, -3163, -3163, -3146, -3154, -3161, -3141, -3166, -3163, -3146, -3141, -3164, -3164, -3165, -3163, -3138, -3143, -3152, -3164, -3165, -3154, -3141, -3150, -3147, -3144, -3144, -3141, 29611, -24279, -25329, -3149, -3138, -3142, -3150, -3143, -3151, -3144, -3143, -3165, -3151, -3163, -3146, -3148, -3165, -3138, -3144, -3143, -3138, -3143, -3165, -3150, -3152, -3150, -3163, -3142, -3138, -3161, -3142, -3146, -3161, -3149, -3163, -3146, -3168, -3146, -3147, -3141, -3150, -3146, -3143, -3138, -3142, -3163, -3146, -3168, -3153, -3142, -3141, -3146, -3143, -3138, -3142, -3146, -3165, -3138, -3144, -3143, -3078, -3141, -3138, -3164, -3165, -3147, -3138, -3165, -3142, -3146, -3161, -3163, -3138, -3161, -3161, -3141, -3150, -3163, -3144, -3165, -3146, -3165, -3150, -3167, -3150, -3148, -3165, -3144, -3163, -3146, -3143, -3138, -3142, -3146, -3165, -3150, -3149, -3078, -3164, -3150, -3141, -3150, -3148, -3165, -3144, -3163, -3146, -3148, -3148, -3150, -3164, -3164, -3138, -3147, -3138, -3141, -3138, -3165, -3154, -3078, -3164, -3150, -3163, -3167, -3138, -3148, -3150, -3141, -3146, -3154, -3150, -3163, -3078, -3141, -3138, -3164, -3165, -3148, -3141, -3138, -3161, -3146, -3141, -3161, -3137, -3146, -3138, -3143, -3164, -3150, -3165, -3142, -3150, -3163, -3152, -3150, -3161, -3146, -3165, -3137, -3164, -3151, -3144, -3143, -3165, -3078, -3151, -3146, -3142, -3138, -3141, -3154, -3164, -3148, -3146, -3141, -3150, -3164, -3137, -3146, -3161, -3150, -3165, -3163, -3146, -3143, -3164, -3141, -3146, -3165, -3150, -3164, -3150, -3141, -3150, -3148, -3165, -3144, -3163, -3143, -3150, -3165, -3168, -3144, -3163, -3140, -3078, -3164, -3150, -3148, -3166, -3163, -3138, -3165, -3154, -3078, -3148, -3144, -3143, -3151, -3138, -3152, -3146, -3143, -3138, -3142, -3146, -3165, -3150, -3149, -3078, -3163, -3144, -3165, -3146, -3165, -3150, -3146, -3143, -3138, -3142, -3146, -3165, -3150, -3149, -3078, -3167, -3150, -3148, -3165, -3144, -3163, -3079, -3147, -3142, -3161, -3079, -3152, -3138, -3151, -3079, -3139, -3161, -3152, -3079, -3144, -3165, -3151, -3079, -3161, -3143, -3152, -3079, -3165, -3165, -3148, -3079, -3165, -3165, -3151, -3079, -3168, -3150, -3147, -3161, -3164, -3150, -3165, -3165, -3154, -3161, -3150, -3086, -3097, -3099, -3185, -3167, -3138, -3150, -3168, -3147, -3166, -3165, -3165, -3144, -3143, -3161, -3163, -3150, -3151, -3150, -3163, -3150, -3143, -3148, -3150, -3164, -3148, -3163, -3150, -3150, -3143, -3198, -3143, -3140, -3143, -3144, -3168, -3143, -3081, -3151, -3138, -3163, -3164, -3165, -3081, -3165, -3146, -3152, -3091, -3081, 8088, -15476, -15461, -15475, -15405, -15397, -15410, -15412, -15482, -15407, -15476, -15461, -15475, -15407, -15475, -15478, -15476, -15465, -15472, -15463, -15457, -15476, -15476, -15457, -15481, -15474, -15470, -15477, -15476, -15457, -15470, -15475, -15408, -15482, -15469, -15470};

    static {
        short[] sArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        int i7;
        short[] sArr3;
        int i8;
        short[] sArr4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        short[] sArr5;
        int i14;
        int iM2566;
        int i15;
        int i16;
        short[] sArr6;
        short[] sArr7;
        short[] sArr8;
        short[] sArr9;
        int i17;
        int i18;
        short[] sArr10;
        int i19;
        int i20;
        short[] sArr11;
        int i21;
        int i22;
        int i23;
        int iM6981;
        short[] sArr12;
        short[] sArr13;
        int i24;
        short[] sArr14;
        int i25;
        int i26;
        short[] sArr15;
        int i27;
        int i28;
        short[] sArr16;
        int i29;
        short[] sArr17;
        short[] sArr18;
        int i30;
        int i31;
        int i32;
        int iM2567;
        short[] sArr19;
        int i33;
        String strM9934;
        short[] sArr20;
        int i34;
        int iM6982;
        int i35;
        int i36;
        short[] sArr21;
        int iM2568;
        int i37;
        int i38;
        int i39;
        short[] sArr22;
        int i40 = C3537.f11231;
        int i41 = ServiceConnectionC3453.f10921;
        int iM2569 = (C0630.m2566("ۚ᩺") + i41) * (-79);
        int i42 = ((iM2569 ^ i40) * (-24303)) ^ 1110784951;
        short s = 0;
        int i43 = 0;
        String strM3603 = null;
        String[] strArr = null;
        String strM2575 = null;
        String str = null;
        short[] sArr23 = null;
        short[] sArr24 = null;
        short[] sArr25 = null;
        short[] sArr26 = null;
        short[] sArr27 = null;
        int i44 = 787507361;
        String strM12252 = null;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        String strM19110 = null;
        String strM3502 = null;
        String strM2816 = null;
        String strM11225 = null;
        String strM1840 = null;
        String str2 = null;
        String str3 = null;
        short[] sArr28 = null;
        short[] sArr29 = null;
        short[] sArr30 = null;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        String strM2128 = null;
        String strM12355 = null;
        String str4 = null;
        int i54 = iM2569 ^ (-468530696);
        int i55 = 0;
        String str5 = null;
        String strM6435 = null;
        short[] sArr31 = null;
        String str6 = null;
        short[] sArr32 = null;
        String strM5917 = null;
        short[] sArr33 = null;
        String strM2129 = null;
        short[] sArr34 = null;
        String strM7507 = null;
        int i56 = 0;
        String strM28025 = null;
        short[] sArr35 = null;
        String strM3789 = null;
        short[] sArr36 = null;
        while (true) {
            int i57 = i54 ^ (i42 & (((i44 ^ i40) * (-4539)) >> 31));
            switch (i57) {
                case -1917750897:
                case 378426433:
                    i57 = i57;
                    i30 = i50;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr32 = sArr32;
                    sArr23 = sArr23;
                    sArr24 = sArr24;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    i45 = i45;
                    i46 = i46;
                    short[] sArr37 = sArr31;
                    i56 = i56;
                    i31 = i52;
                    i47 = i47;
                    i48 = i48;
                    sArr27 = sArr27;
                    i32 = i49;
                    String strM2576 = C0630.m2575(sArr27, i32, 13, i30);
                    String strM50602 = C22628.m50602(f26319, 116, 4, i30);
                    short[] sArr38 = f26319;
                    iM2567 = C0630.m2566("᩸۫") ^ i41;
                    str4 = strM2576;
                    str6 = strM50602;
                    sArr19 = sArr38;
                    i33 = ((iM2567 ^ i40) * 13049) ^ 1905949273;
                    strM9934 = str5;
                    sArr20 = sArr37;
                    i34 = -1180378259;
                    int i58 = iM2567 ^ i34;
                    sArr32 = sArr32;
                    i47 = i47;
                    i46 = i46;
                    i48 = i48;
                    i49 = i32;
                    sArr27 = sArr27;
                    i42 = i33;
                    str5 = strM9934;
                    sArr31 = sArr20;
                    i52 = i31;
                    i45 = i45;
                    i56 = i56;
                    i44 = i57;
                    i55 = i55;
                    sArr26 = sArr26;
                    sArr36 = sArr36;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr24 = sArr24;
                    sArr23 = sArr23;
                    sArr25 = sArr25;
                    i54 = i58;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr29 = sArr29;
                    int i59 = i30;
                    sArr30 = sArr19;
                    i50 = i59;
                    break;
                case -1905598676:
                case 646357832:
                    i57 = i57;
                    i55 = i55;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr32 = sArr32;
                    sArr = sArr23;
                    sArr24 = sArr24;
                    sArr26 = sArr26;
                    i45 = i45;
                    i = i46;
                    i2 = i48;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i52 = i52;
                    i47 = i47;
                    i3 = i50;
                    sArr25 = sArr25;
                    strM2129 = C0483.m2128(sArr25, 79, 3, i3);
                    short[] sArr39 = f26319;
                    i4 = 82;
                    i5 = 5;
                    if (C3245.f10203 > 0) {
                        int iM6983 = C2105.m6981("ۘᩳ") ^ i40;
                        i6 = ((iM6983 ^ i41) * 15743) ^ (-337132187);
                        i7 = iM6983 ^ 924107997;
                        sArr33 = sArr39;
                        sArr3 = sArr27;
                        sArr27 = sArr3;
                        i38 = i4;
                        i54 = i7;
                        i39 = i6;
                        sArr32 = sArr32;
                        i47 = i47;
                        i46 = i;
                        i48 = i2;
                        i42 = i39;
                        sArr25 = sArr25;
                        i56 = i5;
                        i52 = i52;
                        sArr31 = sArr31;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr23 = sArr;
                        i51 = i38;
                        i50 = i3;
                        sArr30 = sArr30;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    } else {
                        i46 = i;
                        sArr33 = sArr39;
                        sArr2 = sArr24;
                        i55 = i55;
                        i53 = i53;
                        int iM6984 = (C2105.m6981("ۨܿ") + i41) * (-99);
                        i24 = ((iM6984 ^ i40) * (-29961)) ^ (-2016879772);
                        i26 = iM6984 ^ (-1532575718);
                        i48 = i2;
                        i56 = i5;
                        sArr13 = sArr36;
                        sArr28 = sArr28;
                        int i60 = i4;
                        sArr14 = sArr2;
                        i9 = i26;
                        sArr12 = sArr;
                        i51 = i60;
                        sArr32 = sArr32;
                        i54 = i9;
                        i47 = i47;
                        i50 = i3;
                        sArr24 = sArr14;
                        sArr36 = sArr13;
                        sArr23 = sArr12;
                        i42 = i24;
                        sArr27 = sArr27;
                        i49 = i49;
                        sArr34 = sArr34;
                        i49 = i49;
                        sArr25 = sArr25;
                        sArr27 = sArr27;
                        i52 = i52;
                        sArr31 = sArr31;
                        sArr30 = sArr30;
                        i44 = i57;
                        sArr26 = sArr26;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr23;
                        i45 = i45;
                        sArr24 = sArr24;
                    }
                    break;
                case -1886326680:
                case 1687164413:
                    i57 = i57;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr32 = sArr32;
                    sArr23 = sArr23;
                    sArr24 = sArr24;
                    short[] sArr40 = sArr25;
                    sArr26 = sArr26;
                    i45 = i45;
                    i46 = i46;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i56 = i56;
                    i52 = i52;
                    i47 = i47;
                    i48 = i48;
                    i23 = i50;
                    if (((s * 2) + 1) - i43 <= 0) {
                        iM6981 = C0630.m2566("ۚܿ") ^ i41;
                        i15 = ((iM6981 ^ i40) * (-32271)) ^ 2051730524;
                        sArr27 = sArr27;
                        i49 = i49;
                        sArr25 = sArr40;
                        i16 = -844226263;
                    } else {
                        iM6981 = (i40 - C2105.m6981("ᩳۗ")) * 123;
                        i15 = ((iM6981 ^ i41) * 39) ^ 1200434061;
                        sArr27 = sArr27;
                        i49 = i49;
                        sArr25 = sArr40;
                        i16 = -1992553776;
                    }
                    sArr32 = sArr32;
                    i54 = iM6981 ^ i16;
                    i47 = i47;
                    i50 = i23;
                    i46 = i46;
                    sArr24 = sArr24;
                    i48 = i48;
                    sArr23 = sArr23;
                    i42 = i15;
                    i56 = i56;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    i49 = i49;
                    sArr25 = sArr25;
                    sArr27 = sArr27;
                    i52 = i52;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i44 = i57;
                    sArr26 = sArr26;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr23;
                    i45 = i45;
                    sArr24 = sArr24;
                    break;
                case -1813480448:
                case -618337540:
                    i57 = i57;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr6 = sArr32;
                    short[] sArr41 = sArr23;
                    sArr24 = sArr24;
                    sArr8 = sArr25;
                    sArr9 = sArr26;
                    i45 = i45;
                    i17 = i46;
                    sArr11 = sArr31;
                    sArr10 = sArr30;
                    i19 = i56;
                    i20 = i52;
                    i18 = i47;
                    i22 = i50;
                    i21 = i48;
                    sArr7 = sArr41;
                    strM5917 = C1773.m5917(sArr7, i21, 8, i22);
                    strM7507 = C2272.m7507(f26319, 35, 2, i22);
                    sArr29 = f26319;
                    if (C3432.f10845 >= 0) {
                        iM6982 = C2105.m6981("᩵᩶") ^ i41;
                        i35 = ((iM6982 ^ i40) * 13451) ^ 1171907912;
                        i36 = 1293833910;
                    } else {
                        iM6982 = (C2105.m6981("ۢܽ") ^ i40) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i35 = ((iM6982 ^ i41) * 32045) ^ 1215336413;
                        i36 = 1326646506;
                    }
                    i54 = iM6982 ^ i36;
                    sArr32 = sArr6;
                    i47 = i18;
                    i50 = i22;
                    i46 = i17;
                    i48 = i21;
                    i42 = i35;
                    i52 = i20;
                    i56 = i19;
                    sArr31 = sArr11;
                    sArr30 = sArr10;
                    i44 = i57;
                    i55 = i55;
                    sArr26 = sArr9;
                    sArr25 = sArr8;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr23 = sArr7;
                    i45 = i45;
                    i51 = i51;
                    sArr24 = sArr24;
                    sArr33 = sArr33;
                    break;
                case -1704318526:
                case -10437359:
                    i57 = i57;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr6 = sArr32;
                    sArr21 = sArr23;
                    sArr24 = sArr24;
                    sArr8 = sArr25;
                    sArr9 = sArr26;
                    i45 = i45;
                    i17 = i46;
                    sArr11 = sArr31;
                    sArr10 = sArr30;
                    i19 = i56;
                    i20 = i52;
                    i18 = i47;
                    i22 = i50;
                    if (C1128.f4106 > 0) {
                        i21 = i48;
                        sArr29 = sArr29;
                        sArr7 = sArr21;
                        iM6982 = C2105.m6981("᩵᩶") ^ i41;
                        i35 = ((iM6982 ^ i40) * 13451) ^ 1171907912;
                        i36 = 1293833910;
                        i54 = iM6982 ^ i36;
                        sArr32 = sArr6;
                        i47 = i18;
                        i50 = i22;
                        i46 = i17;
                        i48 = i21;
                        i42 = i35;
                        i52 = i20;
                        i56 = i19;
                        sArr31 = sArr11;
                        sArr30 = sArr10;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr9;
                        sArr25 = sArr8;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr23 = sArr7;
                        i45 = i45;
                        i51 = i51;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    }
                    int iM25610 = C0630.m2566("۠ۢ") ^ i41;
                    int i61 = ((iM25610 ^ i40) * (-4781)) ^ (-1069082277);
                    i54 = iM25610 ^ (-545099259);
                    sArr32 = sArr6;
                    i47 = i18;
                    i50 = i22;
                    i46 = i17;
                    i42 = i61;
                    i52 = i20;
                    i56 = i19;
                    sArr31 = sArr11;
                    sArr30 = sArr10;
                    i44 = i57;
                    i55 = i55;
                    sArr26 = sArr9;
                    sArr25 = sArr8;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr21;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr33 = sArr33;
                    break;
                case -1682188788:
                case 418461460:
                    i57 = i57;
                    sArr31 = sArr31;
                    i3 = i50;
                    strM3603 = C1047.m3603(f26319, 1, 3, i3);
                    sArr28 = f26319;
                    int iM25611 = (C0630.m2566("ۛ᩹") + i41) * 41;
                    i8 = ((iM25611 ^ i40) * (-31849)) ^ (-608777946);
                    i9 = iM25611 ^ (-1863726574);
                    sArr4 = sArr23;
                    i46 = i46;
                    sArr12 = sArr4;
                    i56 = i56;
                    i55 = i55;
                    sArr25 = sArr25;
                    i51 = i51;
                    sArr13 = sArr36;
                    i53 = i53;
                    i24 = i8;
                    sArr14 = sArr24;
                    sArr33 = sArr33;
                    sArr32 = sArr32;
                    i54 = i9;
                    i47 = i47;
                    i50 = i3;
                    sArr24 = sArr14;
                    sArr36 = sArr13;
                    sArr23 = sArr12;
                    i42 = i24;
                    sArr27 = sArr27;
                    i49 = i49;
                    sArr34 = sArr34;
                    i49 = i49;
                    sArr25 = sArr25;
                    sArr27 = sArr27;
                    i52 = i52;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i44 = i57;
                    sArr26 = sArr26;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr23;
                    i45 = i45;
                    sArr24 = sArr24;
                    break;
                case -1647342588:
                case -933177118:
                    f26318 = AbstractC6079.m16988(str4, str6, strM2575, str5, str, C4263.m12817(f26319, 137, 4, i50), strArr);
                    return;
                case -1578439321:
                case -162716410:
                    i57 = i57;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr17 = sArr32;
                    sArr15 = sArr23;
                    sArr24 = sArr24;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    i45 = i45;
                    i46 = i46;
                    sArr16 = sArr31;
                    sArr30 = sArr30;
                    i10 = i56;
                    i28 = i52;
                    i29 = i47;
                    i11 = i50;
                    if (C0630.f2410 <= 0) {
                        i52 = i28;
                        sArr32 = sArr17;
                        i47 = i29;
                        sArr31 = sArr16;
                        sArr23 = sArr15;
                        int iM6985 = (C2105.m6981("᩸ܿ") ^ i40) * (-35);
                        i54 = iM6985 ^ 1079677078;
                        i42 = ((iM6985 ^ i41) * (-21633)) ^ 1968595049;
                        i50 = i11;
                        i46 = i46;
                        i56 = i10;
                        sArr30 = sArr30;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        sArr25 = sArr25;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    } else {
                        sArr18 = sArr25;
                        iM2568 = C0630.m2566("᩷۬") ^ i40;
                        i27 = ((iM2568 ^ i41) * (-11173)) ^ (-1714393234);
                        i37 = -372416738;
                        i54 = iM2568 ^ i37;
                        i46 = i46;
                        sArr32 = sArr17;
                        i47 = i29;
                        i50 = i11;
                        i42 = i27;
                        i52 = i28;
                        sArr31 = sArr16;
                        sArr30 = sArr30;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr15;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                        int i62 = i10;
                        sArr25 = sArr18;
                        i56 = i62;
                    }
                    break;
                case -1535025391:
                case 589969429:
                    i57 = i57;
                    i55 = i55;
                    sArr33 = sArr33;
                    i10 = i56;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr17 = sArr32;
                    sArr15 = sArr23;
                    short[] sArr42 = sArr24;
                    sArr26 = sArr26;
                    i45 = i45;
                    sArr16 = sArr31;
                    sArr30 = sArr30;
                    i28 = i52;
                    i29 = i47;
                    i11 = i50;
                    i46 = i46;
                    sArr24 = sArr42;
                    strM11225 = C3683.m11225(sArr24, i46, 4, i11);
                    strM1840 = C0382.m1840(f26319, 72, 7, i11);
                    sArr18 = f26319;
                    if (C2126.f7087) {
                        iM2568 = C0630.m2566("᩷۬") ^ i40;
                        i27 = ((iM2568 ^ i41) * (-11173)) ^ (-1714393234);
                        i37 = -372416738;
                    } else {
                        iM2568 = C0630.m2566("ۙ֨") ^ i41;
                        i27 = ((iM2568 ^ i40) * (-10869)) ^ (-2130415421);
                        i37 = 1654518707;
                    }
                    i54 = iM2568 ^ i37;
                    i46 = i46;
                    sArr32 = sArr17;
                    i47 = i29;
                    i50 = i11;
                    i42 = i27;
                    i52 = i28;
                    sArr31 = sArr16;
                    sArr30 = sArr30;
                    i44 = i57;
                    i55 = i55;
                    sArr26 = sArr26;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr15;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr33 = sArr33;
                    int i63 = i10;
                    sArr25 = sArr18;
                    i56 = i63;
                    break;
                case -1516618053:
                case -469756908:
                    i57 = i57;
                    short[] sArr43 = sArr32;
                    sArr31 = sArr31;
                    i14 = i50;
                    strM6435 = ViewOnClickListenerC1958.m6435(sArr43, i47, 5, i14);
                    strM3502 = C1005.m3502(f26319, 15, 8, i14);
                    sArr34 = f26319;
                    int iM25612 = C0630.m2566("᩵֫") ^ i41;
                    i12 = ((iM25612 ^ i40) * 11653) ^ (-1874699798);
                    sArr5 = sArr43;
                    i13 = iM25612 ^ 941938271;
                    i54 = i13;
                    i50 = i14;
                    i42 = i12;
                    sArr32 = sArr5;
                    i56 = i56;
                    sArr27 = sArr27;
                    i55 = i55;
                    i49 = i49;
                    sArr33 = sArr33;
                    sArr25 = sArr25;
                    i51 = i51;
                    i53 = i53;
                    sArr28 = sArr28;
                    i49 = i49;
                    sArr25 = sArr25;
                    sArr27 = sArr27;
                    i52 = i52;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i44 = i57;
                    sArr26 = sArr26;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr23;
                    i45 = i45;
                    sArr24 = sArr24;
                    break;
                case -1468902129:
                case 559484924:
                    i25 = 14984;
                    sArr25 = sArr25;
                    sArr24 = sArr24;
                    sArr23 = sArr23;
                    int iM25613 = (i41 - C0630.m2566("᩺᩷")) * (-109);
                    i15 = ((iM25613 ^ i40) * 6729) ^ 921903043;
                    i16 = 52693853;
                    i23 = i25;
                    iM6981 = iM25613;
                    sArr32 = sArr32;
                    i54 = iM6981 ^ i16;
                    i47 = i47;
                    i50 = i23;
                    i46 = i46;
                    sArr24 = sArr24;
                    i48 = i48;
                    sArr23 = sArr23;
                    i42 = i15;
                    i56 = i56;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    i49 = i49;
                    sArr25 = sArr25;
                    sArr27 = sArr27;
                    i52 = i52;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i44 = i57;
                    sArr26 = sArr26;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr23;
                    i45 = i45;
                    sArr24 = sArr24;
                    break;
                case -1460529440:
                case 148241417:
                    i57 = i57;
                    short[] sArr44 = sArr31;
                    short[] sArr45 = sArr26;
                    int i64 = i45;
                    int i65 = i50;
                    sArr31 = sArr44;
                    sArr30 = sArr30;
                    i55 = i55;
                    sArr26 = sArr45;
                    sArr33 = sArr33;
                    sArr25 = sArr25;
                    i10 = i56;
                    i51 = i51;
                    short[] sArr46 = sArr24;
                    i45 = i64;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    short[] sArr47 = sArr23;
                    i52 = i52;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr32 = sArr32;
                    sArr28 = sArr28;
                    String[] strArr2 = {strM19110, strM6435, strM3502, strM2128, strM5917, strM7507, strM2816, strM12355, strM28025, strM3789, strM11225, strM1840, strM2129, str2, str3, C1005.m3502(sArr45, i64, 10, i50), strM3603, strM12252};
                    sArr3 = f26319;
                    i49 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    if (C4616.f14690 > 0) {
                        int iM25614 = (i40 - C0630.m2566("᩶۟")) * 31;
                        i7 = iM25614 ^ 1938425534;
                        i6 = ((iM25614 ^ i41) * 16909) ^ 1236092301;
                        strArr = strArr2;
                        i5 = i10;
                        i = i46;
                        i47 = i47;
                        i2 = i48;
                        sArr25 = sArr25;
                        i4 = i51;
                        sArr24 = sArr46;
                        sArr = sArr47;
                        i3 = i65;
                        sArr27 = sArr3;
                        i38 = i4;
                        i54 = i7;
                        i39 = i6;
                        sArr32 = sArr32;
                        i47 = i47;
                        i46 = i;
                        i48 = i2;
                        i42 = i39;
                        sArr25 = sArr25;
                        i56 = i5;
                        i52 = i52;
                        sArr31 = sArr31;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr23 = sArr;
                        i51 = i38;
                        i50 = i3;
                        sArr30 = sArr30;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    } else {
                        sArr32 = sArr32;
                        sArr27 = sArr3;
                        strArr = strArr2;
                        i52 = i52;
                        sArr31 = sArr31;
                        i46 = i46;
                        sArr24 = sArr46;
                        sArr23 = sArr47;
                        i11 = i65;
                        int iM6986 = (C2105.m6981("᩸ܿ") ^ i40) * (-35);
                        i54 = iM6986 ^ 1079677078;
                        i42 = ((iM6986 ^ i41) * (-21633)) ^ 1968595049;
                        i50 = i11;
                        i46 = i46;
                        i56 = i10;
                        sArr30 = sArr30;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        sArr25 = sArr25;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    }
                    break;
                case -1093285509:
                case 1874900515:
                    i57 = i57;
                    short[] sArr48 = sArr31;
                    strM2816 = C0714.m2816(sArr29, 37, 12, i50);
                    short[] sArr49 = f26319;
                    if (C1504.f5354) {
                        i55 = 7;
                        i53 = 49;
                        i4 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr49;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        sArr28 = sArr28;
                        sArr32 = sArr32;
                        sArr = sArr23;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        i47 = i47;
                        i5 = i56;
                        i52 = i52;
                        sArr31 = sArr48;
                        i2 = i48;
                        short[] sArr50 = sArr30;
                        i3 = i50;
                        sArr2 = sArr24;
                        i45 = i45;
                        sArr30 = sArr50;
                        int iM6987 = (C2105.m6981("ۨܿ") + i41) * (-99);
                        i24 = ((iM6987 ^ i40) * (-29961)) ^ (-2016879772);
                        i26 = iM6987 ^ (-1532575718);
                    } else {
                        int iM6988 = C2105.m6981("ۜ۬") ^ i40;
                        int i66 = ((iM6988 ^ i41) * 6497) ^ (-1045180343);
                        i55 = 7;
                        i4 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr49;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        sArr28 = sArr28;
                        sArr = sArr23;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        i53 = 49;
                        i26 = iM6988 ^ (-1742758838);
                        i5 = i56;
                        i52 = i52;
                        sArr31 = sArr48;
                        sArr32 = sArr32;
                        i2 = i48;
                        i24 = i66;
                        i47 = i47;
                        short[] sArr51 = sArr30;
                        i3 = i50;
                        sArr2 = sArr24;
                        i45 = i45;
                        sArr30 = sArr51;
                    }
                    i48 = i2;
                    i56 = i5;
                    sArr13 = sArr36;
                    sArr28 = sArr28;
                    int i67 = i4;
                    sArr14 = sArr2;
                    i9 = i26;
                    sArr12 = sArr;
                    i51 = i67;
                    sArr32 = sArr32;
                    i54 = i9;
                    i47 = i47;
                    i50 = i3;
                    sArr24 = sArr14;
                    sArr36 = sArr13;
                    sArr23 = sArr12;
                    i42 = i24;
                    sArr27 = sArr27;
                    i49 = i49;
                    sArr34 = sArr34;
                    i49 = i49;
                    sArr25 = sArr25;
                    sArr27 = sArr27;
                    i52 = i52;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i44 = i57;
                    sArr26 = sArr26;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr23;
                    i45 = i45;
                    sArr24 = sArr24;
                    break;
                case -1059261041:
                case -724559111:
                    i57 = i57;
                    short[] sArr52 = sArr31;
                    strM2128 = C0483.m2128(sArr34, 23, 4, i50);
                    short[] sArr53 = f26319;
                    if (C0630.f2410 > 0) {
                        int iM6989 = (i41 - C2105.m6981("֫ۧ")) * (-125);
                        i8 = ((iM6989 ^ i40) * (-11585)) ^ (-1990917962);
                        i48 = 27;
                        sArr4 = sArr53;
                        sArr31 = sArr52;
                        i3 = i50;
                        i9 = iM6989 ^ (-1872578432);
                        i46 = i46;
                        sArr12 = sArr4;
                        i56 = i56;
                        i55 = i55;
                        sArr25 = sArr25;
                        i51 = i51;
                        sArr13 = sArr36;
                        i53 = i53;
                        i24 = i8;
                        sArr14 = sArr24;
                        sArr33 = sArr33;
                        sArr32 = sArr32;
                        i54 = i9;
                        i47 = i47;
                        i50 = i3;
                        sArr24 = sArr14;
                        sArr36 = sArr13;
                        sArr23 = sArr12;
                        i42 = i24;
                        sArr27 = sArr27;
                        i49 = i49;
                        sArr34 = sArr34;
                        i49 = i49;
                        sArr25 = sArr25;
                        sArr27 = sArr27;
                        i52 = i52;
                        sArr31 = sArr31;
                        sArr30 = sArr30;
                        i44 = i57;
                        sArr26 = sArr26;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr23;
                        i45 = i45;
                        sArr24 = sArr24;
                    } else {
                        sArr23 = sArr53;
                        sArr31 = sArr52;
                        i48 = 27;
                        sArr30 = sArr30;
                        i10 = i56;
                        i11 = i50;
                        int iM69810 = (C2105.m6981("᩸ܿ") ^ i40) * (-35);
                        i54 = iM69810 ^ 1079677078;
                        i42 = ((iM69810 ^ i41) * (-21633)) ^ 1968595049;
                        i50 = i11;
                        i46 = i46;
                        i56 = i10;
                        sArr30 = sArr30;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        sArr25 = sArr25;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    }
                    break;
                case -1035760069:
                case 648869389:
                    i57 = i57;
                    short[] sArr54 = sArr31;
                    strM19110 = C7106.m19110(f26319, 5, 5, i50);
                    short[] sArr55 = f26319;
                    if (C2105.f7037 == 0) {
                        int iM25615 = (C0630.m2566("֡ᩳ") ^ i40) * (-97);
                        i12 = ((iM25615 ^ i41) * 26843) ^ (-724424121);
                        i13 = iM25615 ^ 1822188124;
                        i47 = 10;
                        sArr5 = sArr55;
                        sArr31 = sArr54;
                        i14 = i50;
                        i54 = i13;
                        i50 = i14;
                        i42 = i12;
                        sArr32 = sArr5;
                        i56 = i56;
                        sArr27 = sArr27;
                        i55 = i55;
                        i49 = i49;
                        sArr33 = sArr33;
                        sArr25 = sArr25;
                        i51 = i51;
                        i53 = i53;
                        sArr28 = sArr28;
                        i49 = i49;
                        sArr25 = sArr25;
                        sArr27 = sArr27;
                        i52 = i52;
                        sArr31 = sArr31;
                        sArr30 = sArr30;
                        i44 = i57;
                        sArr26 = sArr26;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr23;
                        i45 = i45;
                        sArr24 = sArr24;
                    } else {
                        sArr32 = sArr55;
                        sArr31 = sArr54;
                        i47 = 10;
                        sArr30 = sArr30;
                        i10 = i56;
                        i11 = i50;
                        int iM69811 = (C2105.m6981("᩸ܿ") ^ i40) * (-35);
                        i54 = iM69811 ^ 1079677078;
                        i42 = ((iM69811 ^ i41) * (-21633)) ^ 1968595049;
                        i50 = i11;
                        i46 = i46;
                        i56 = i10;
                        sArr30 = sArr30;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        sArr25 = sArr25;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    }
                    break;
                case -862056934:
                case 947349505:
                    RunnableC1937.m6387();
                    throw new RuntimeException();
                case -526341372:
                case 863329143:
                    i57 = i57;
                    sArr22 = sArr31;
                    C1711.m5736();
                    C4117.m12364();
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr17 = sArr32;
                    sArr15 = sArr23;
                    sArr24 = sArr24;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    i45 = i45;
                    i46 = i46;
                    i29 = i47;
                    sArr30 = sArr30;
                    i10 = i56;
                    i28 = i52;
                    sArr16 = sArr22;
                    i11 = i50;
                    sArr18 = sArr25;
                    iM2568 = C0630.m2566("᩷۬") ^ i40;
                    i27 = ((iM2568 ^ i41) * (-11173)) ^ (-1714393234);
                    i37 = -372416738;
                    i54 = iM2568 ^ i37;
                    i46 = i46;
                    sArr32 = sArr17;
                    i47 = i29;
                    i50 = i11;
                    i42 = i27;
                    i52 = i28;
                    sArr31 = sArr16;
                    sArr30 = sArr30;
                    i44 = i57;
                    i55 = i55;
                    sArr26 = sArr26;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr15;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr33 = sArr33;
                    int i68 = i10;
                    sArr25 = sArr18;
                    i56 = i68;
                    break;
                case -458185845:
                case 167832494:
                    i57 = i57;
                    short[] sArr56 = sArr31;
                    strM3789 = RunnableC1108.m3789(sArr35, 62, 6, i50);
                    short[] sArr57 = f26319;
                    i46 = 68;
                    if (RunnableC3474.f10992 > 0) {
                        int iM25616 = C0630.m2566("ᩳ֨") ^ i40;
                        i55 = i55;
                        sArr33 = sArr33;
                        i51 = i51;
                        sArr24 = sArr57;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr15 = sArr23;
                        sArr26 = sArr26;
                        i45 = i45;
                        i27 = ((iM25616 ^ i41) * (-7679)) ^ (-1491969621);
                        sArr30 = sArr30;
                        i28 = i52;
                        sArr16 = sArr56;
                        i29 = i47;
                        i54 = iM25616 ^ 1966828238;
                        i11 = i50;
                        sArr17 = sArr32;
                        short[] sArr58 = sArr25;
                        i10 = i56;
                        sArr18 = sArr58;
                        sArr32 = sArr17;
                        i47 = i29;
                        i50 = i11;
                        i42 = i27;
                        i52 = i28;
                        sArr31 = sArr16;
                        sArr30 = sArr30;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr15;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                        int i69 = i10;
                        sArr25 = sArr18;
                        i56 = i69;
                    } else {
                        i55 = i55;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr32 = sArr32;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        i45 = i45;
                        i47 = i47;
                        sArr30 = sArr30;
                        i5 = i56;
                        sArr31 = sArr56;
                        i2 = i48;
                        i3 = i50;
                        sArr2 = sArr57;
                        i4 = i51;
                        sArr = sArr23;
                        i52 = i52;
                        i55 = i55;
                        i53 = i53;
                        int iM69812 = (C2105.m6981("ۨܿ") + i41) * (-99);
                        i24 = ((iM69812 ^ i40) * (-29961)) ^ (-2016879772);
                        i26 = iM69812 ^ (-1532575718);
                        i48 = i2;
                        i56 = i5;
                        sArr13 = sArr36;
                        sArr28 = sArr28;
                        int i610 = i4;
                        sArr14 = sArr2;
                        i9 = i26;
                        sArr12 = sArr;
                        i51 = i610;
                        sArr32 = sArr32;
                        i54 = i9;
                        i47 = i47;
                        i50 = i3;
                        sArr24 = sArr14;
                        sArr36 = sArr13;
                        sArr23 = sArr12;
                        i42 = i24;
                        sArr27 = sArr27;
                        i49 = i49;
                        sArr34 = sArr34;
                        i49 = i49;
                        sArr25 = sArr25;
                        sArr27 = sArr27;
                        i52 = i52;
                        sArr31 = sArr31;
                        sArr30 = sArr30;
                        i44 = i57;
                        sArr26 = sArr26;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr23;
                        i45 = i45;
                        sArr24 = sArr24;
                    }
                    break;
                case -424860148:
                case 135657142:
                    i57 = i57;
                    short[] sArr59 = sArr31;
                    String strM3841 = C1128.m3841(sArr33, i51, i56, i50);
                    String strM12817 = C4263.m12817(f26319, 87, 6, i50);
                    short[] sArr60 = f26319;
                    int iM25617 = C0630.m2566("۠ܰ") ^ i41;
                    i39 = ((iM25617 ^ i40) * 23925) ^ (-932613733);
                    str3 = strM12817;
                    sArr26 = sArr60;
                    sArr30 = sArr30;
                    i55 = i55;
                    sArr33 = sArr33;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr31 = sArr59;
                    sArr32 = sArr32;
                    i54 = iM25617 ^ 1141194688;
                    sArr24 = sArr24;
                    sArr25 = sArr25;
                    i = i46;
                    i47 = i47;
                    i45 = 93;
                    i3 = i50;
                    i5 = i56;
                    i38 = i51;
                    str2 = strM3841;
                    sArr = sArr23;
                    i2 = i48;
                    i52 = i52;
                    sArr32 = sArr32;
                    i47 = i47;
                    i46 = i;
                    i48 = i2;
                    i42 = i39;
                    sArr25 = sArr25;
                    i56 = i5;
                    i52 = i52;
                    sArr31 = sArr31;
                    i44 = i57;
                    i55 = i55;
                    sArr26 = sArr26;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr23 = sArr;
                    i51 = i38;
                    i50 = i3;
                    sArr30 = sArr30;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr33 = sArr33;
                    break;
                case -195144650:
                case 1431311726:
                    i57 = i57;
                    strM2575 = C0630.m2575(sArr30, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 5, i50);
                    short[] sArr61 = f26319;
                    if (C0237.m1481() < 0) {
                        int iM25618 = (i40 - C0630.m2566("᩷ۘ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i33 = ((iM25618 ^ i41) * 20769) ^ (-368503574);
                        sArr20 = sArr61;
                        strM9934 = str5;
                        i34 = 1176645575;
                        i31 = q.h;
                        iM2567 = iM25618;
                        i32 = i49;
                        short[] sArr62 = sArr30;
                        i30 = i50;
                        sArr19 = sArr62;
                        int i510 = iM2567 ^ i34;
                        sArr32 = sArr32;
                        i47 = i47;
                        i46 = i46;
                        i48 = i48;
                        i49 = i32;
                        sArr27 = sArr27;
                        i42 = i33;
                        str5 = strM9934;
                        sArr31 = sArr20;
                        i52 = i31;
                        i45 = i45;
                        i56 = i56;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        sArr36 = sArr36;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr24 = sArr24;
                        sArr23 = sArr23;
                        sArr25 = sArr25;
                        i54 = i510;
                        sArr33 = sArr33;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr29 = sArr29;
                        int i511 = i30;
                        sArr30 = sArr19;
                        i50 = i511;
                    } else {
                        i52 = q.h;
                        i55 = i55;
                        sArr33 = sArr33;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr17 = sArr32;
                        sArr15 = sArr23;
                        sArr24 = sArr24;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        i45 = i45;
                        i46 = i46;
                        sArr16 = sArr61;
                        sArr30 = sArr30;
                        i10 = i56;
                        i29 = i47;
                        i11 = i50;
                        sArr32 = sArr17;
                        i47 = i29;
                        sArr31 = sArr16;
                        sArr23 = sArr15;
                        int iM69813 = (C2105.m6981("᩸ܿ") ^ i40) * (-35);
                        i54 = iM69813 ^ 1079677078;
                        i42 = ((iM69813 ^ i41) * (-21633)) ^ 1968595049;
                        i50 = i11;
                        i46 = i46;
                        i56 = i10;
                        sArr30 = sArr30;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        sArr25 = sArr25;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    }
                    break;
                case 332461871:
                case 722043889:
                    i57 = i57;
                    sArr22 = sArr31;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    if (C4159.m12565() >= 0) {
                        sArr6 = sArr32;
                        sArr21 = sArr23;
                        sArr24 = sArr24;
                        sArr8 = sArr25;
                        sArr9 = sArr26;
                        i45 = i45;
                        i17 = i46;
                        i18 = i47;
                        sArr10 = sArr30;
                        i19 = i56;
                        i20 = i52;
                        sArr11 = sArr22;
                        i22 = i50;
                        int iM25619 = C0630.m2566("۠ۢ") ^ i41;
                        int i611 = ((iM25619 ^ i40) * (-4781)) ^ (-1069082277);
                        i54 = iM25619 ^ (-545099259);
                        sArr32 = sArr6;
                        i47 = i18;
                        i50 = i22;
                        i46 = i17;
                        i42 = i611;
                        i52 = i20;
                        i56 = i19;
                        sArr31 = sArr11;
                        sArr30 = sArr10;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr9;
                        sArr25 = sArr8;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr21;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    } else {
                        sArr17 = sArr32;
                        sArr15 = sArr23;
                        sArr24 = sArr24;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        i45 = i45;
                        i46 = i46;
                        i29 = i47;
                        sArr30 = sArr30;
                        i10 = i56;
                        i28 = i52;
                        sArr16 = sArr22;
                        i11 = i50;
                        sArr18 = sArr25;
                        iM2568 = C0630.m2566("᩷۬") ^ i40;
                        i27 = ((iM2568 ^ i41) * (-11173)) ^ (-1714393234);
                        i37 = -372416738;
                        i54 = iM2568 ^ i37;
                        i46 = i46;
                        sArr32 = sArr17;
                        i47 = i29;
                        i50 = i11;
                        i42 = i27;
                        i52 = i28;
                        sArr31 = sArr16;
                        sArr30 = sArr30;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr26;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr15;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                        int i612 = i10;
                        sArr25 = sArr18;
                        i56 = i612;
                    }
                    break;
                case 357740198:
                case 1664442252:
                    i57 = i57;
                    short[] sArr63 = sArr31;
                    strM12252 = C4075.m12252(sArr28, 4, 1, i50);
                    if (C4263.f13799 > 0) {
                        iM2566 = (C0630.m2566("᩸᩸") ^ i40) * 95;
                        i15 = ((iM2566 ^ i41) * (-32087)) ^ 966778048;
                        sArr31 = sArr63;
                        i16 = 375223885;
                        i23 = i50;
                        iM6981 = iM2566;
                        sArr32 = sArr32;
                        sArr32 = sArr32;
                        i54 = iM6981 ^ i16;
                        i47 = i47;
                        i50 = i23;
                        i46 = i46;
                        sArr24 = sArr24;
                        i48 = i48;
                        sArr23 = sArr23;
                        i42 = i15;
                        i56 = i56;
                        i55 = i55;
                        sArr33 = sArr33;
                        i51 = i51;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        i49 = i49;
                        sArr25 = sArr25;
                        sArr27 = sArr27;
                        i52 = i52;
                        sArr31 = sArr31;
                        sArr30 = sArr30;
                        i44 = i57;
                        sArr26 = sArr26;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr29 = sArr29;
                        sArr23 = sArr23;
                        i45 = i45;
                        sArr24 = sArr24;
                    } else {
                        i55 = i55;
                        sArr33 = sArr33;
                        i51 = i51;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr6 = sArr32;
                        sArr7 = sArr23;
                        sArr24 = sArr24;
                        sArr8 = sArr25;
                        sArr9 = sArr26;
                        i45 = i45;
                        i17 = i46;
                        i18 = i47;
                        sArr10 = sArr30;
                        i19 = i56;
                        i20 = i52;
                        sArr11 = sArr63;
                        i21 = i48;
                        i22 = i50;
                        iM6982 = C2105.m6981("᩵᩶") ^ i41;
                        i35 = ((iM6982 ^ i40) * 13451) ^ 1171907912;
                        i36 = 1293833910;
                        i54 = iM6982 ^ i36;
                        sArr32 = sArr6;
                        i47 = i18;
                        i50 = i22;
                        i46 = i17;
                        i48 = i21;
                        i42 = i35;
                        i52 = i20;
                        i56 = i19;
                        sArr31 = sArr11;
                        sArr30 = sArr10;
                        i44 = i57;
                        i55 = i55;
                        sArr26 = sArr9;
                        sArr25 = sArr8;
                        sArr35 = sArr35;
                        sArr36 = sArr36;
                        sArr34 = sArr34;
                        i53 = i53;
                        sArr28 = sArr28;
                        sArr23 = sArr7;
                        i45 = i45;
                        i51 = i51;
                        sArr24 = sArr24;
                        sArr33 = sArr33;
                    }
                    break;
                case 905456549:
                case 992166568:
                    i57 = i57;
                    s = f26319[0];
                    int i70 = s + 1;
                    i43 = i70 * i70;
                    iM2566 = (i40 - C0630.m2566("ۨ֡")) * 95;
                    i15 = ((iM2566 ^ i41) * (-9273)) ^ (-1217762068);
                    sArr31 = sArr31;
                    i16 = 1556805031;
                    i23 = i50;
                    iM6981 = iM2566;
                    sArr32 = sArr32;
                    sArr32 = sArr32;
                    i54 = iM6981 ^ i16;
                    i47 = i47;
                    i50 = i23;
                    i46 = i46;
                    sArr24 = sArr24;
                    i48 = i48;
                    sArr23 = sArr23;
                    i42 = i15;
                    i56 = i56;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    i49 = i49;
                    sArr25 = sArr25;
                    sArr27 = sArr27;
                    i52 = i52;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i44 = i57;
                    sArr26 = sArr26;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr23;
                    i45 = i45;
                    sArr24 = sArr24;
                    break;
                case 1235635088:
                case 1407723443:
                    strM12355 = C4117.m12355(sArr36, i53, i55, i50);
                    strM28025 = C11340.m28025(f26319, 56, 6, i50);
                    sArr35 = f26319;
                    int iM25620 = (i41 - C0630.m2566("᩷ܶ")) * (-111);
                    i44 = i57;
                    i54 = iM25620 ^ (-1521234454);
                    i42 = ((iM25620 ^ i40) * i.a) ^ (-1914965490);
                    sArr31 = sArr31;
                    break;
                case 1489887878:
                case 1814186301:
                    i57 = i57;
                    sArr20 = sArr31;
                    strM9934 = C3245.m9934(sArr31, i52, 4, i50);
                    String strM7159 = C2167.m7159(f26319, 129, 8, i50);
                    int iM69814 = C2105.m6981("ۧۤ") ^ i41;
                    i34 = 1899537833;
                    str = strM7159;
                    iM2567 = iM69814;
                    i31 = i52;
                    i33 = ((iM69814 ^ i40) * (-15299)) ^ 521384173;
                    i32 = i49;
                    short[] sArr64 = sArr30;
                    i30 = i50;
                    sArr19 = sArr64;
                    int i512 = iM2567 ^ i34;
                    sArr32 = sArr32;
                    i47 = i47;
                    i46 = i46;
                    i48 = i48;
                    i49 = i32;
                    sArr27 = sArr27;
                    i42 = i33;
                    str5 = strM9934;
                    sArr31 = sArr20;
                    i52 = i31;
                    i45 = i45;
                    i56 = i56;
                    i44 = i57;
                    i55 = i55;
                    sArr26 = sArr26;
                    sArr36 = sArr36;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    sArr24 = sArr24;
                    sArr23 = sArr23;
                    sArr25 = sArr25;
                    i54 = i512;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr35 = sArr35;
                    sArr29 = sArr29;
                    int i513 = i30;
                    sArr30 = sArr19;
                    i50 = i513;
                    break;
                default:
                    sArr23 = sArr23;
                    sArr24 = sArr24;
                    sArr25 = sArr25;
                    i25 = 58420;
                    int iM256110 = (i41 - C0630.m2566("᩺᩷")) * (-109);
                    i15 = ((iM256110 ^ i40) * 6729) ^ 921903043;
                    i16 = 52693853;
                    i23 = i25;
                    iM6981 = iM256110;
                    sArr32 = sArr32;
                    i54 = iM6981 ^ i16;
                    i47 = i47;
                    i50 = i23;
                    i46 = i46;
                    sArr24 = sArr24;
                    i48 = i48;
                    sArr23 = sArr23;
                    i42 = i15;
                    i56 = i56;
                    i55 = i55;
                    sArr33 = sArr33;
                    i51 = i51;
                    sArr34 = sArr34;
                    i53 = i53;
                    sArr28 = sArr28;
                    i49 = i49;
                    sArr25 = sArr25;
                    sArr27 = sArr27;
                    i52 = i52;
                    sArr31 = sArr31;
                    sArr30 = sArr30;
                    i44 = i57;
                    sArr26 = sArr26;
                    sArr35 = sArr35;
                    sArr36 = sArr36;
                    sArr29 = sArr29;
                    sArr23 = sArr23;
                    i45 = i45;
                    sArr24 = sArr24;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x053e A[PHI: r9 r13 r14 r43
      0x053e: PHI (r9v5 l.ۙܿܽ) = (r9v4 l.ۙܿܽ), (r9v2 l.ۙܿܽ), (r9v2 l.ۙܿܽ) binds: [B:119:0x0526, B:116:0x04fd, B:87:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x053e: PHI (r13v4 java.lang.String) = (r13v2 java.lang.String), (r13v3 java.lang.String), (r13v2 java.lang.String) binds: [B:119:0x0526, B:116:0x04fd, B:87:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x053e: PHI (r14v84 java.lang.String) = (r14v65 java.lang.String), (r14v66 java.lang.String), (r14v85 java.lang.String) binds: [B:119:0x0526, B:116:0x04fd, B:87:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x053e: PHI (r43v68 java.lang.String) = (r43v58 java.lang.String), (r43v59 java.lang.String), (r43v69 java.lang.String) binds: [B:119:0x0526, B:116:0x04fd, B:87:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x031d A[PHI: r11 r33 r43
      0x031d: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:80:0x031b, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r33v3 java.lang.String) = (r33v2 java.lang.String), (r33v1 java.lang.String) binds: [B:80:0x031b, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r43v73 java.lang.String) = (r43v71 java.lang.String), (r43v74 java.lang.String) binds: [B:80:0x031b, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0396 A[PHI: r43
      0x0396: PHI (r43v94 java.lang.String) = 
      (r43v70 java.lang.String)
      (r43v75 java.lang.String)
      (r43v79 java.lang.String)
      (r43v82 java.lang.String)
      (r43v95 java.lang.String)
     binds: [B:85:0x034f, B:70:0x02b3, B:219:0x0396, B:60:0x0235, B:49:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016a, code lost:
    
        if (l.AbstractC2021.f6743 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0175, code lost:
    
        if (l.C7811.m20844() == 0) goto L8;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m22361(C9028 c9028, C18090 c18090, HashMap map, HashMap map2, C23431 c23431, boolean z) {
        int iM6981;
        int i;
        int i2;
        short s;
        short[] sArr;
        String str;
        int iM2566;
        int i3;
        int iM2567;
        int i4;
        String str2;
        int i5;
        short[] sArr2;
        Object[] objArr;
        int i6;
        String str3;
        short[] sArr3;
        int iM6982;
        int i7;
        int i8;
        int iM2568;
        int i9;
        int iM6983;
        int i10;
        int i11;
        int iM2569;
        int i12;
        int iM6984;
        int i13;
        int i14;
        map = map;
        map2 = map2;
        C20317 c20317 = null;
        Iterator itM20833 = null;
        int i15 = 0;
        C18906 c18906 = null;
        Iterator itM20834 = null;
        int i16 = 0;
        int iMo12858 = 0;
        int i17 = 0;
        int iMo2870 = 0;
        int i18 = 0;
        String str4 = null;
        long jM6296 = 0;
        byte[] bArrM1795 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 932977892;
        int i22 = ViewOnClickListenerC1958.f6529;
        int i23 = ServiceConnectionC3453.f10921;
        int iM25610 = (i23 - C0630.m2566("ۤۤ")) * 37;
        int i24 = ((iM25610 ^ i22) * (-24657)) ^ 1260969835;
        int i25 = iM25610 ^ (-883671612);
        String strM9030 = null;
        String strM7036 = null;
        String str5 = null;
        C4794 c4794 = null;
        String value = null;
        StringBuilder sb = null;
        C19720 c19720 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int iMo47883 = 0;
        int iLastIndexOf = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean z2 = false;
        char c = 0;
        int i29 = 0;
        Iterator itM20835 = null;
        short s2 = 0;
        C8322 c8322 = null;
        String strM48095 = null;
        Object[] objArr2 = null;
        String str6 = null;
        Iterator itM20836 = null;
        C3545 c3545 = null;
        Iterator itM13555 = null;
        String strM1844 = null;
        while (true) {
            i21 = i25 ^ (i24 & (((i21 ^ i22) * 15457) >> 31));
            switch (i21) {
                case -2094981489:
                case 758078039:
                    strM48095 = strM48095;
                    C3545 c3546 = (C3545) C4263.m12820(map, value);
                    int iM6985 = C2105.m6981("ܿۡ") ^ i22;
                    i10 = ((iM6985 ^ i23) * (-31743)) ^ (-187269602);
                    i25 = iM6985 ^ (-1728538388);
                    c3545 = c3546;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -2085965207:
                case 813465662:
                    C2105.m6982();
                    C3245.m9925();
                    break;
                case -2050119925:
                case -1727153211:
                    strM48095 = strM48095;
                    C1420.m4905(sb, strM1844);
                    iM2569 = C0630.m2566("۠ܿ") ^ i22;
                    i10 = ((iM2569 ^ i23) * 31297) ^ (-523226808);
                    i12 = 845776714;
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -2009010302:
                case -858006695:
                    strM48095 = strM48095;
                    if (c3545 != null) {
                        iM2569 = C0630.m2566("֡۫") ^ i22;
                        i10 = ((iM2569 ^ i23) * 22147) ^ (-1123025611);
                        i12 = -81968244;
                    } else {
                        iM2569 = C0630.m2566("᩷᩻") ^ i23;
                        i10 = ((iM2569 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                    }
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -1934952387:
                case -278196970:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    c20317 = (C20317) C2272.m7513(itM20836);
                    strM9030 = C2958.m9030(c20317);
                    sArr5 = f26319;
                    if (C0237.f1507 == 0) {
                        int iM6986 = (C2105.m6981("۟ܽ") ^ i23) * (-107);
                        i24 = 775971807 ^ ((iM6986 ^ i22) * 31877);
                        i25 = iM6986 ^ 1178174603;
                        map = map;
                        map2 = map2;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                    } else {
                        s = s2;
                        String str7 = strM9030;
                        i29 = i29;
                        str = str7;
                        int iM25611 = C0630.m2566("ۜ۬") ^ i23;
                        i24 = ((iM25611 ^ i22) * 26491) ^ (-893317533);
                        i25 = iM25611 ^ (-510427196);
                        s2 = s;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i30 = i29;
                        strM9030 = str;
                        i29 = i30;
                    }
                    break;
                case -1822736084:
                case -458340511:
                    ViewOnClickListenerC1958.m6429();
                    if (C1711.f5919) {
                        strM48095 = strM48095;
                        strM7036 = strM7036;
                        s = s2;
                        String str8 = strM9030;
                        i29 = i29;
                        str = str8;
                        int iM25612 = C0630.m2566("ۜ۬") ^ i23;
                        i24 = ((iM25612 ^ i22) * 26491) ^ (-893317533);
                        i25 = iM25612 ^ (-510427196);
                        s2 = s;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i31 = i29;
                        strM9030 = str;
                        i29 = i31;
                    }
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    s = s2;
                    sArr = sArr5;
                    String str9 = strM9030;
                    i29 = i29;
                    str = str9;
                    iM2566 = C0630.m2566("ۢܰ") ^ i23;
                    i24 = ((iM2566 ^ i22) * 17925) ^ 1237634017;
                    i3 = -463493722;
                    i25 = iM2566 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i32 = i29;
                    strM9030 = str;
                    i29 = i32;
                    break;
                case -1803837951:
                case -230563463:
                    try {
                        strM48095 = strM48095;
                        try {
                            C3245.m9923(sb, ServiceConnectionC3453.m10568(f26319, 598, 4, i26));
                            break;
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        strM48095 = strM48095;
                    }
                    iM2569 = C0630.m2566("۠ܿ") ^ i22;
                    i10 = ((iM2569 ^ i23) * 31297) ^ (-523226808);
                    i12 = 845776714;
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -1772197622:
                case 224678180:
                    if (!C1005.m3501()) {
                        iM6981 = (C2105.m6981("ۡܿ") ^ i23) * (-45);
                        i = ((iM6981 ^ i22) * (-32259)) ^ 1889338823;
                        i2 = 879620815;
                        i25 = iM6981 ^ i2;
                        i24 = i;
                    } else {
                        strM48095 = strM48095;
                        strM7036 = strM7036;
                        iM2568 = C0630.m2566("ܺܽ") ^ i22;
                        i8 = ((iM2568 ^ i23) * 9853) ^ 1207557397;
                        i9 = 833144854;
                        i25 = iM2568 ^ i9;
                        i24 = i8;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                    }
                    break;
                case -1744590869:
                case -974944909:
                    if (strM48095 == null) {
                        strM48095 = strM48095;
                        iM2569 = C0630.m2566("᩷᩻") ^ i23;
                        i10 = ((iM2569 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                        i25 = iM2569 ^ i12;
                        i24 = i10;
                        strM48095 = strM48095;
                    } else {
                        iM6981 = C2105.m6981("ۚᩴ") ^ i23;
                        i = ((iM6981 ^ i22) * (-235)) ^ 1730121711;
                        i2 = 1137468304;
                        i25 = iM6981 ^ i2;
                        i24 = i;
                    }
                    break;
                case -1737161042:
                case -1010835285:
                    strM48095 = strM48095;
                    str3 = strM9030;
                    strM7036 = strM7036;
                    sArr3 = sArr5;
                    if (C1773.m5910(itM20836)) {
                        iM6982 = C0630.m2566("᩷ۛ") ^ i23;
                        i6 = ((iM6982 ^ i22) * 22383) ^ 967575910;
                        i7 = 1616786953;
                    } else {
                        iM6982 = C2105.m6981("֨ܰ") ^ i22;
                        i6 = ((iM6982 ^ i23) * 15249) ^ (-132375952);
                        i7 = 1175798008;
                    }
                    i25 = iM6982 ^ i7;
                    strM9030 = str3;
                    sArr5 = sArr3;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    i24 = i6;
                    map2 = map2;
                    break;
                case -1692808207:
                case -1576825899:
                    strM48095 = strM48095;
                    iMo47883 = c18906.mo47883() | i17 | (iMo2870 << i18);
                    c19720 = c23431.f75236;
                    if (!C4159.f13567) {
                        strM7036 = strM7036;
                        s = s2;
                        sArr = sArr5;
                        String str10 = strM9030;
                        i29 = i29;
                        str = str10;
                        iM2566 = (C0630.m2566("֫ۧ") ^ i22) * (-63);
                        i24 = ((iM2566 ^ i23) * 30143) ^ 609422066;
                        i3 = 2065885141;
                        i25 = iM2566 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i33 = i29;
                        strM9030 = str;
                        i29 = i33;
                    } else {
                        int iM6987 = C2105.m6981("ۖ᩷") ^ i22;
                        i24 = ((iM6987 ^ i23) * (-24787)) ^ (-41667602);
                        i25 = iM6987 ^ (-1334463000);
                        strM48095 = strM48095;
                    }
                    break;
                case -1668223692:
                case -1355057094:
                    try {
                        C1420.m4905(sb, strM48095);
                        break;
                    } catch (Throwable unused3) {
                    }
                    strM48095 = strM48095;
                    iM2569 = C0630.m2566("۠ܿ") ^ i22;
                    i10 = ((iM2569 ^ i23) * 31297) ^ (-523226808);
                    i12 = 845776714;
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -1596486613:
                case -618774668:
                    strM48095 = strM48095;
                    if (iLastIndexOf < value.lastIndexOf(47)) {
                        strM1844 = str4;
                        iM2569 = C0630.m2566("ۗۨ") ^ i22;
                        i10 = ((iM2569 ^ i23) * (-27431)) ^ 502905224;
                        i12 = -772875827;
                    } else {
                        iM2569 = (i23 - C2105.m6981("ۜۗ")) * (-115);
                        i10 = ((iM2569 ^ i22) * (-25901)) ^ (-437399310);
                        i12 = -524261430;
                    }
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -1505845437:
                case -991009620:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    itM13555 = C4616.m13555(c20317.mo2872());
                    i28 = i27;
                    iM2568 = (i23 - C0630.m2566("ܿܳ")) * (-25);
                    i8 = ((iM2568 ^ i22) * 11941) ^ (-166104278);
                    i9 = -384530798;
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case -1471244315:
                case 663327028:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    s = s2;
                    sArr = sArr5;
                    String str11 = strM9030;
                    i29 = i29;
                    str = str11;
                    if (C0964.f3626 != 0) {
                        iM2566 = (C0630.m2566("֫ۧ") ^ i22) * (-63);
                        i24 = ((iM2566 ^ i23) * 30143) ^ 609422066;
                        i3 = 2065885141;
                    } else {
                        iM2566 = C2105.m6981("᩵۫") ^ i22;
                        i24 = ((iM2566 ^ i23) * 29447) ^ (-1229839497);
                        i3 = 497632059;
                    }
                    i25 = iM2566 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i34 = i29;
                    strM9030 = str;
                    i29 = i34;
                    break;
                case -1354870063:
                case 195448547:
                    strM48095 = strM48095;
                    jM6296 = C1916.m6296(c3545);
                    iM2569 = C2105.m6981("ܺۛ") ^ i22;
                    i10 = ((iM2569 ^ i23) * 30503) ^ 1110709641;
                    i12 = 2062697547;
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -1299695379:
                case -1285192409:
                    strM48095 = strM48095;
                    str3 = strM9030;
                    strM7036 = strM7036;
                    sArr3 = sArr5;
                    if (C1294.m4369(str3, C2126.m7036(sArr3, 580, 6, i26))) {
                        iM6982 = C0630.m2566("ۤܰ") ^ i23;
                        i6 = ((iM6982 ^ i22) * 785) ^ (-1743986370);
                        i7 = 793299223;
                    } else {
                        iM6982 = C2105.m6981("᩻ܿ") ^ i22;
                        i6 = ((iM6982 ^ i23) * (-17235)) ^ (-1526167584);
                        i7 = 1237340059;
                    }
                    i25 = iM6982 ^ i7;
                    strM9030 = str3;
                    sArr5 = sArr3;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    i24 = i6;
                    map2 = map2;
                    break;
                case -1267974270:
                case 1700250044:
                    strM48095 = strM48095;
                    i17 = iMo12858 << 24;
                    iMo2870 = c20317.mo2870();
                    i18 = 16;
                    if (C1773.f6144 <= 0) {
                        iM6983 = (i23 - C0630.m2566("ۘᩴ")) * (-25);
                        i10 = ((iM6983 ^ i22) * (-8513)) ^ 1886468919;
                        i11 = -1253317187;
                    } else {
                        iM6983 = (C2105.m6981("᩸֨") ^ i22) * 3;
                        i10 = ((iM6983 ^ i23) * 5627) ^ (-1405517533);
                        i11 = 1735922148;
                    }
                    i25 = iM6983 ^ i11;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -1202275235:
                case 1500733963:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    if (C1128.m3842(map2, value)) {
                        iM2568 = C2105.m6981("ᩳ᩺") ^ i23;
                        i8 = ((iM2568 ^ i22) * 17951) ^ 162427923;
                        i9 = -1573515999;
                    } else {
                        iM2568 = (C0630.m2566("ۖۘ") + i23) * 57;
                        i8 = ((iM2568 ^ i22) * (-28013)) ^ (-2126376147);
                        i9 = -1756996787;
                    }
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case -1179153189:
                case 1347759534:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    sArr5 = sArr5;
                    String str12 = strM9030;
                    i29 = i29;
                    str = str12;
                    c8322 = (C8322) C2272.m7513(itM20835);
                    c = 0;
                    if (z2) {
                        iM2567 = C2105.m6981("ܳ֡") ^ i23;
                        i24 = 495548165 ^ ((iM2567 ^ i22) * (-31933));
                        i4 = 342316353;
                    } else {
                        iM2567 = C0630.m2566("ܿۨ") ^ i22;
                        i24 = 1920140013 ^ ((iM2567 ^ i23) * (-4525));
                        i4 = 326740819;
                    }
                    i25 = iM2567 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i35 = i29;
                    strM9030 = str;
                    i29 = i35;
                    break;
                case -1166464207:
                case -565806384:
                    str = strM9030;
                    i26 = 42386;
                    iM2567 = C0630.m2566("ܰ۟") ^ i22;
                    i24 = 39661820 ^ ((iM2567 ^ i23) * 16749);
                    i4 = -1860119953;
                    i25 = iM2567 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i36 = i29;
                    strM9030 = str;
                    i29 = i36;
                    break;
                case -1166381740:
                case -787473447:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    if (C0483.m2123(itM20833)) {
                        iM2568 = C2105.m6981("ܽܶ") ^ i23;
                        i8 = ((iM2568 ^ i22) * 25473) ^ 1183562449;
                        i9 = -18086691;
                    } else {
                        i28 = i15;
                        iM2568 = (i23 - C0630.m2566("ܿܳ")) * (-25);
                        i8 = ((iM2568 ^ i22) * 11941) ^ (-166104278);
                        i9 = -384530798;
                    }
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case -1079014030:
                case 1716191010:
                    String strM1959 = C0422.m1959(sb);
                    C1128.m3856(map2, value, strM1959);
                    str6 = strM1959;
                    iM2569 = C0630.m2566("ܶ۟") ^ i23;
                    i10 = ((iM2569 ^ i22) * 8467) ^ (-750871561);
                    i12 = 754050519;
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -1073285426:
                case 811526995:
                    strM48095 = strM48095;
                    c4794.m13996(str6, null);
                    strM7036 = strM7036;
                    iM2568 = (C0630.m2566("᩻ܰ") + i23) * 11;
                    i8 = ((iM2568 ^ i22) * (-13405)) ^ (-670121997);
                    i9 = -286911073;
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case -1070779096:
                case 113137499:
                    i16 = 1;
                    iM2568 = (C2105.m6981("۫۬") ^ i23) * (-35);
                    i8 = ((iM2568 ^ i22) * 10089) ^ (-310410812);
                    i9 = -2090274481;
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case -1047610970:
                case -957968362:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    C2678 c2678 = (C2678) RunnableC1108.m3791(itM13555);
                    String strMo18744 = c2678.mo18744();
                    itM20833 = C7811.m20833(c2678.mo18746());
                    str5 = strMo18744;
                    i15 = i28;
                    iM2568 = C0630.m2566("ܳ֫") ^ i22;
                    i8 = ((iM2568 ^ i23) * (-19059)) ^ 278398238;
                    i9 = -296145477;
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case -1041538565:
                case 1302921648:
                    C1047.m3599();
                    if (C21923.f70183 == 0) {
                        iM6981 = C2105.m6981("ܳᩳ") ^ i22;
                        i = ((iM6981 ^ i23) * 9709) ^ (-329913703);
                        i2 = -1991733841;
                        i25 = iM6981 ^ i2;
                        i24 = i;
                    } else {
                        strM48095 = strM48095;
                        strM7036 = strM7036;
                        s = s2;
                        sArr = sArr5;
                        String str13 = strM9030;
                        i29 = i29;
                        str = str13;
                        iM2566 = (C0630.m2566("֫ۧ") ^ i22) * (-63);
                        i24 = ((iM2566 ^ i23) * 30143) ^ 609422066;
                        i3 = 2065885141;
                        i25 = iM2566 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i37 = i29;
                        strM9030 = str;
                        i29 = i37;
                    }
                    break;
                case -1004948528:
                case 2071180831:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    sArr5 = sArr5;
                    String str14 = strM9030;
                    i29 = i29;
                    str = str14;
                    s2 = f26319[566];
                    if (C1128.f4106 <= 0) {
                        iM2567 = C0630.m2566("ۚۙ") ^ i23;
                        i24 = (-292198413) ^ ((iM2567 ^ i22) * (-17447));
                        i4 = 756830132;
                    } else {
                        iM2567 = C0630.m2566("ۛܽ") ^ i23;
                        i24 = 279512697 ^ ((iM2567 ^ i22) * (-25677));
                        i4 = -339202140;
                    }
                    i25 = iM2567 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i38 = i29;
                    strM9030 = str;
                    i29 = i38;
                    break;
                case -989621257:
                case 1931562435:
                    str2 = strM9030;
                    i5 = 1;
                    itM20835 = C7811.m20833(c9028.mo21936());
                    z2 = true;
                    int iM25613 = (C0630.m2566("᩺ۤ") ^ i22) * (-127);
                    i24 = ((iM25613 ^ i23) * 24057) ^ 273369785;
                    i25 = iM25613 ^ 432203733;
                    map = map;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM9030 = str2;
                    strM48095 = strM48095;
                    i29 = i5;
                    map2 = map2;
                    break;
                case -895797640:
                case 750627474:
                    strM48095 = strM48095;
                    iLastIndexOf = value.lastIndexOf(46);
                    str4 = "";
                    if (iLastIndexOf == -1) {
                        strM1844 = str4;
                        iM2569 = C0630.m2566("ۗۨ") ^ i22;
                        i10 = ((iM2569 ^ i23) * (-27431)) ^ 502905224;
                        i12 = -772875827;
                    } else {
                        iM2569 = C0630.m2566("ܰۙ") ^ i23;
                        i10 = ((iM2569 ^ i22) * 15397) ^ (-353608391);
                        i12 = 938028973;
                    }
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -877808564:
                case 1609583284:
                    try {
                        strM48095 = C21144.m48095(bArrM1795);
                        iM6981 = (i22 - C2105.m6981("᩻᩺")) * 93;
                        i = ((iM6981 ^ i23) * (-31999)) ^ (-153477744);
                        i2 = 398292371;
                        i25 = iM6981 ^ i2;
                        i24 = i;
                    } catch (Throwable unused4) {
                        strM48095 = strM48095;
                        iM2569 = C0630.m2566("᩷᩻") ^ i23;
                        i10 = ((iM2569 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                        i25 = iM2569 ^ i12;
                        i24 = i10;
                        strM48095 = strM48095;
                    }
                    break;
                case -852155702:
                case 1197140205:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    short[] sArr6 = sArr5;
                    int i39 = i29;
                    str = strM9030;
                    Object[] objArr3 = new Object[i39];
                    objArr3[c] = C3245.m9931(c8322.mo12858());
                    sArr4 = f26319;
                    if (C1294.f4556 >= 0) {
                        i29 = i39;
                        objArr2 = objArr3;
                        sArr5 = sArr6;
                        s = s2;
                        int iM25614 = C0630.m2566("ۜ۬") ^ i23;
                        i24 = ((iM25614 ^ i22) * 26491) ^ (-893317533);
                        i25 = iM25614 ^ (-510427196);
                        s2 = s;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                    } else {
                        int iM6988 = C2105.m6981("֫ۚ") ^ i22;
                        i29 = i39;
                        i25 = iM6988 ^ 1153174324;
                        objArr2 = objArr3;
                        sArr5 = sArr6;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        i24 = ((iM6988 ^ i23) * (-26237)) ^ (-469732152);
                        map2 = map2;
                    }
                    int i310 = i29;
                    strM9030 = str;
                    i29 = i310;
                    break;
                case -769400752:
                case -670288087:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    str3 = strM9030;
                    if (!C1294.m4369(str3, C4263.m12817(f26319, 591, 7, i26))) {
                        int iM25615 = C0630.m2566("ܽ֫") ^ i22;
                        i8 = ((iM25615 ^ i23) * 11741) ^ (-1861552918);
                        i25 = iM25615 ^ (-1865603435);
                        map = map;
                        strM9030 = str3;
                        i24 = i8;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                    } else {
                        sArr3 = sArr5;
                        iM6982 = C0630.m2566("ۤܰ") ^ i23;
                        i6 = ((iM6982 ^ i22) * 785) ^ (-1743986370);
                        i7 = 793299223;
                        i25 = iM6982 ^ i7;
                        strM9030 = str3;
                        sArr5 = sArr3;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        i24 = i6;
                        map2 = map2;
                    }
                    break;
                case -595480605:
                case 852176214:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    if (!C1773.m5910(itM13555)) {
                        i27 = i28;
                        str3 = strM9030;
                        sArr3 = sArr5;
                        iM6982 = C0630.m2566("ۤܰ") ^ i23;
                        i6 = ((iM6982 ^ i22) * 785) ^ (-1743986370);
                        i7 = 793299223;
                        i25 = iM6982 ^ i7;
                        strM9030 = str3;
                        sArr5 = sArr3;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        i24 = i6;
                        map2 = map2;
                    } else {
                        iM2568 = (i22 - C0630.m2566("ۚۡ")) * 25;
                        i8 = ((iM2568 ^ i23) * (-10821)) ^ (-884127824);
                        i9 = -152361258;
                        i25 = iM2568 ^ i9;
                        i24 = i8;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                    }
                    break;
                case -580136904:
                case -394790278:
                    C3746.m11369();
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    s = s2;
                    sArr = sArr5;
                    String str15 = strM9030;
                    i29 = i29;
                    str = str15;
                    iM2566 = (C0630.m2566("֫ۧ") ^ i22) * (-63);
                    i24 = ((iM2566 ^ i23) * 30143) ^ 609422066;
                    i3 = 2065885141;
                    i25 = iM2566 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i311 = i29;
                    strM9030 = str;
                    i29 = i311;
                    break;
                case -552109196:
                case 1511143112:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    sArr5 = sArr5;
                    String str16 = strM9030;
                    i29 = i29;
                    str = str16;
                    if (C0483.m2123(itM20835)) {
                        iM2567 = (C2105.m6981("᩺۬") ^ i23) * 43;
                        i24 = 1677990020 ^ ((iM2567 ^ i22) * 26961);
                        i4 = 1957246541;
                    } else {
                        iM2567 = (C0630.m2566("۟ۖ") + i23) * (-55);
                        i24 = (-1907531094) ^ ((iM2567 ^ i22) * (-20143));
                        i4 = 1694216218;
                    }
                    i25 = iM2567 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i312 = i29;
                    strM9030 = str;
                    i29 = i312;
                    break;
                case -464060482:
                case -114622466:
                    strM48095 = strM48095;
                    String str17 = (String) c19720.get(iMo47883);
                    C3019.m9257(str17);
                    C1420.m4905(sb, str17);
                    iM2569 = C0630.m2566("ۛܳ") ^ i22;
                    i10 = ((iM2569 ^ i23) * 25051) ^ 141804541;
                    i12 = 2030839256;
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -438346529:
                case 992325102:
                    if (!z) {
                        strM48095 = strM48095;
                        iM2569 = C0630.m2566("᩷᩻") ^ i23;
                        i10 = ((iM2569 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                        i25 = iM2569 ^ i12;
                        i24 = i10;
                        strM48095 = strM48095;
                    } else {
                        iM6981 = (C0630.m2566("ܽ᩷") ^ i23) * (-63);
                        i = ((iM6981 ^ i22) * 27583) ^ (-1558540965);
                        i2 = 1688113510;
                        i25 = iM6981 ^ i2;
                        i24 = i;
                    }
                    break;
                case -274472079:
                case 1310744344:
                    strM48095 = strM48095;
                    try {
                        C15206.m35978(bArrM1795);
                        iM6984 = (i23 - C0630.m2566("֡ۘ")) * 87;
                        i13 = ((iM6984 ^ i22) * 16199) ^ 574406784;
                        i14 = 2051483910;
                    } catch (IOException unused5) {
                        iM6984 = (i22 - C2105.m6981("ᩳᩳ")) * 39;
                        i13 = ((iM6984 ^ i23) * 8821) ^ (-736886316);
                        i14 = 892489502;
                    } catch (Throwable unused6) {
                    }
                    i25 = iM6984 ^ i14;
                    i24 = i13;
                    strM48095 = strM48095;
                    break;
                case -260449010:
                case 813080885:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    sArr5 = sArr5;
                    String str18 = strM9030;
                    i29 = i29;
                    str = str18;
                    int i40 = i20 + 22024249;
                    if ((i40 + i40) - i19 >= 0) {
                        iM2567 = (C0630.m2566("ܶۨ") + i23) * (-27);
                        i24 = 350673940 ^ ((iM2567 ^ i22) * 7921);
                        i4 = 1041424575;
                    } else {
                        iM2567 = (C0630.m2566("᩹᩵") ^ i23) * 25;
                        i24 = (-1442423028) ^ ((iM2567 ^ i22) * (-10121));
                        i4 = -1717624899;
                    }
                    i25 = iM2567 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i313 = i29;
                    strM9030 = str;
                    i29 = i313;
                    break;
                case -258793085:
                case 1703644002:
                    RunnableC3474.m10630();
                    break;
                case -216132800:
                case 406070146:
                    strM48095 = strM48095;
                    try {
                        bArrM1795 = C0349.m1795(C3663.m11163(c18090, c3545), 0);
                        iM2569 = (i23 - C2105.m6981("ᩳ᩵")) * (-13);
                        i10 = ((iM2569 ^ i22) * (-24167)) ^ (-642335780);
                        i12 = 405825339;
                    } catch (Throwable unused7) {
                        iM2569 = C0630.m2566("᩷᩻") ^ i23;
                        i10 = ((iM2569 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                    }
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case -186472588:
                case 1100934998:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    s = s2;
                    sArr = sArr5;
                    String str19 = strM9030;
                    i29 = i29;
                    str = str19;
                    if (C0382.f1805) {
                        iM2566 = (C0630.m2566("ۙۡ") ^ i23) * 57;
                        i24 = ((iM2566 ^ i22) * (-5661)) ^ (-1597888516);
                        i3 = -461324116;
                    } else {
                        iM2566 = (C0630.m2566("۫᩺") ^ i22) * (-89);
                        i24 = ((iM2566 ^ i23) * 11611) ^ (-212651541);
                        i3 = -1305125570;
                    }
                    i25 = iM2566 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i314 = i29;
                    strM9030 = str;
                    i29 = i314;
                    break;
                case -169071865:
                case 1919990181:
                    break;
                case -124762881:
                case 1713286689:
                    strM7036 = C2126.m7036(f26319, 576, 4, i26);
                    objArr = objArr2;
                    sArr2 = sArr4;
                    int iM25616 = (C0630.m2566("۫ۖ") ^ i22) * 53;
                    objArr2 = objArr;
                    i6 = ((iM25616 ^ i23) * (-16339)) ^ (-278455214);
                    i25 = iM25616 ^ 266318375;
                    map = map;
                    strM9030 = strM9030;
                    sArr5 = sArr5;
                    sArr4 = sArr2;
                    strM48095 = strM48095;
                    i24 = i6;
                    map2 = map2;
                    break;
                case -74973868:
                case 145263704:
                    AbstractC2021.m6574();
                    break;
                case 121569558:
                case 1986029200:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    sArr = sArr5;
                    String str20 = strM9030;
                    i29 = i29;
                    str = str20;
                    s = s2;
                    int i41 = s + 4693;
                    i19 = i41 * i41;
                    i20 = s * s;
                    if (C0483.f2088 < 0) {
                        iM2566 = C2105.m6981("᩵ۤ") ^ i22;
                        i24 = ((iM2566 ^ i23) * 5749) ^ 1033551571;
                        i3 = -1537654218;
                        i25 = iM2566 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i315 = i29;
                        strM9030 = str;
                        i29 = i315;
                    } else {
                        sArr5 = sArr;
                        int iM25617 = C0630.m2566("ۜ۬") ^ i23;
                        i24 = ((iM25617 ^ i22) * 26491) ^ (-893317533);
                        i25 = iM25617 ^ (-510427196);
                        s2 = s;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i316 = i29;
                        strM9030 = str;
                        i29 = i316;
                    }
                    break;
                case 141479823:
                case 501274504:
                    strM48095 = strM48095;
                    str3 = strM9030;
                    strM7036 = strM7036;
                    if (C1294.m4369(str3, RunnableC0588.m2436(f26319, 586, 5, i26))) {
                        sArr3 = sArr5;
                        iM6982 = C0630.m2566("ۤܰ") ^ i23;
                        i6 = ((iM6982 ^ i22) * 785) ^ (-1743986370);
                        i7 = 793299223;
                        i25 = iM6982 ^ i7;
                        strM9030 = str3;
                        sArr5 = sArr3;
                    } else {
                        int iM6989 = C2105.m6981("۫ۧ") ^ i23;
                        i6 = ((iM6989 ^ i22) * 11149) ^ (-1967758170);
                        i25 = iM6989 ^ 888872709;
                        strM9030 = str3;
                    }
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    i24 = i6;
                    map2 = map2;
                    break;
                case 226680278:
                case 306473269:
                    C3683.m11222();
                    if (C3019.f9544 < 0) {
                        strM48095 = strM48095;
                        strM7036 = strM7036;
                        iM2568 = C0630.m2566("ܺܽ") ^ i22;
                        i8 = ((iM2568 ^ i23) * 9853) ^ 1207557397;
                        i9 = 833144854;
                        i25 = iM2568 ^ i9;
                        i24 = i8;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                    } else {
                        strM48095 = strM48095;
                        strM7036 = strM7036;
                        s = s2;
                        sArr = sArr5;
                        String str21 = strM9030;
                        i29 = i29;
                        str = str21;
                        iM2566 = C0630.m2566("ۢܰ") ^ i23;
                        i24 = ((iM2566 ^ i22) * 17925) ^ 1237634017;
                        i3 = -463493722;
                        i25 = iM2566 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i317 = i29;
                        strM9030 = str;
                        i29 = i317;
                    }
                    break;
                case 278862220:
                case 523128348:
                    sArr2 = sArr4;
                    objArr = objArr2;
                    strM7036 = String.format(C4616.m13542(sArr2, 567, 9, i26), objArr);
                    int iM25618 = (C0630.m2566("۫ۖ") ^ i22) * 53;
                    objArr2 = objArr;
                    i6 = ((iM25618 ^ i23) * (-16339)) ^ (-278455214);
                    i25 = iM25618 ^ 266318375;
                    map = map;
                    strM9030 = strM9030;
                    sArr5 = sArr5;
                    sArr4 = sArr2;
                    strM48095 = strM48095;
                    i24 = i6;
                    map2 = map2;
                    break;
                case 303090444:
                case 425555170:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    if (C0483.m2123(itM20834)) {
                        iM2568 = C2105.m6981("֡᩺") ^ i22;
                        i8 = ((iM2568 ^ i23) * (-14273)) ^ (-1561364730);
                        i9 = 1272477744;
                    } else {
                        i15 = i16;
                        iM2568 = C0630.m2566("ܳ֫") ^ i22;
                        i8 = ((iM2568 ^ i23) * (-19059)) ^ 278398238;
                        i9 = -296145477;
                    }
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case 303765044:
                case 829903675:
                    C18906 c18907 = (C18906) C2272.m7513(itM20833);
                    c18906 = c18907;
                    itM20834 = C7811.m20833(c18907.values());
                    i16 = i15;
                    iM2568 = (C2105.m6981("۫۬") ^ i23) * (-35);
                    i8 = ((iM2568 ^ i22) * 10089) ^ (-310410812);
                    i9 = -2090274481;
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case 305549895:
                case 674121992:
                    str2 = strM9030;
                    i5 = i27;
                    z2 = false;
                    int iM25619 = (C0630.m2566("᩺ۤ") ^ i22) * (-127);
                    i24 = ((iM25619 ^ i23) * 24057) ^ 273369785;
                    i25 = iM25619 ^ 432203733;
                    map = map;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM9030 = str2;
                    strM48095 = strM48095;
                    i29 = i5;
                    map2 = map2;
                    break;
                case 470977611:
                case 1826634309:
                    if (C0964.f3626 != 0) {
                        strM48095 = strM48095;
                        strM7036 = strM7036;
                        s = s2;
                        sArr = sArr5;
                        String str22 = strM9030;
                        i29 = i29;
                        str = str22;
                        iM2566 = (C0630.m2566("۫᩺") ^ i22) * (-89);
                        i24 = ((iM2566 ^ i23) * 11611) ^ (-212651541);
                        i3 = -1305125570;
                        i25 = iM2566 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i318 = i29;
                        strM9030 = str;
                        i29 = i318;
                    }
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    sArr5 = sArr5;
                    String str23 = strM9030;
                    i29 = i29;
                    str = str23;
                    iM2567 = C0630.m2566("ۚۙ") ^ i23;
                    i24 = (-292198413) ^ ((iM2567 ^ i22) * (-17447));
                    i4 = 756830132;
                    i25 = iM2567 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i319 = i29;
                    strM9030 = str;
                    i29 = i319;
                    break;
                case 485777485:
                case 1411383407:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    sb = new StringBuilder(strM7036);
                    C1420.m4905(sb, str5);
                    C2105.m6979(sb, '/');
                    iMo12858 = c8322.mo12858();
                    if (C1420.f5096 <= 0) {
                        iM2568 = C0630.m2566("ܺܽ") ^ i22;
                        i8 = ((iM2568 ^ i23) * 9853) ^ 1207557397;
                        i9 = 833144854;
                    } else {
                        iM2568 = C2105.m6981("ܰ۫") ^ i23;
                        i8 = ((iM2568 ^ i22) * (-23427)) ^ 535441714;
                        i9 = -1985949321;
                    }
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case 536548606:
                case 1201940026:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    c4794 = (C4794) C2272.m7513(itM20834);
                    if (c4794.mo5009()) {
                        iM2568 = C2105.m6981("᩶ۢ") ^ i22;
                        i8 = ((iM2568 ^ i23) * (-17491)) ^ (-1959466845);
                        i9 = 2114114983;
                    } else {
                        iM2568 = (C0630.m2566("᩻ܰ") + i23) * 11;
                        i8 = ((iM2568 ^ i22) * (-13405)) ^ (-670121997);
                        i9 = -286911073;
                    }
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case 600071939:
                case 1856745713:
                    C4159.m12565();
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ۢ᩶") ^ i22;
                        i = ((iM6981 ^ i23) * 12595) ^ (-47637500);
                        i2 = -1332933502;
                        i25 = iM6981 ^ i2;
                        i24 = i;
                    } else {
                        strM48095 = strM48095;
                        strM7036 = strM7036;
                        s = s2;
                        sArr = sArr5;
                        String str110 = strM9030;
                        i29 = i29;
                        str = str110;
                        iM2566 = (C0630.m2566("֫ۧ") ^ i22) * (-63);
                        i24 = ((iM2566 ^ i23) * 30143) ^ 609422066;
                        i3 = 2065885141;
                        i25 = iM2566 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM7036 = strM7036;
                        strM48095 = strM48095;
                        int i3110 = i29;
                        strM9030 = str;
                        i29 = i3110;
                    }
                    break;
                case 706890428:
                case 2029171024:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    value = c4794.mo5008().getValue();
                    if (C1128.m3842(map, value)) {
                        iM2568 = (C0630.m2566("ܳ᩵") + i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM2568 ^ i23) * (-17771)) ^ 1975114915;
                        i9 = 2098735052;
                    } else {
                        iM2568 = (C0630.m2566("᩻ܰ") + i23) * 11;
                        i8 = ((iM2568 ^ i22) * (-13405)) ^ (-670121997);
                        i9 = -286911073;
                    }
                    i25 = iM2568 ^ i9;
                    i24 = i8;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    break;
                case 765310042:
                case 1233771546:
                    strM48095 = strM48095;
                    strM7036 = strM7036;
                    s = s2;
                    sArr = sArr5;
                    String str24 = strM9030;
                    i29 = i29;
                    str = str24;
                    if (C2272.m7503()) {
                        iM2566 = C0630.m2566("ۢܰ") ^ i23;
                        i24 = ((iM2566 ^ i22) * 17925) ^ 1237634017;
                        i3 = -463493722;
                    } else {
                        iM2566 = C2105.m6981("ۡܺ") ^ i22;
                        i24 = ((iM2566 ^ i23) * 6563) ^ (-833947211);
                        i3 = -1875194978;
                    }
                    i25 = iM2566 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i3111 = i29;
                    strM9030 = str;
                    i29 = i3111;
                    break;
                case 785450653:
                case 1696806750:
                    strM48095 = strM48095;
                    if (jM6296 < 10485760) {
                        iM2569 = C0630.m2566("֨ۡ") ^ i23;
                        i10 = ((iM2569 ^ i22) * (-9453)) ^ 427673752;
                        i12 = 535384073;
                    } else {
                        iM2569 = C0630.m2566("᩷᩻") ^ i23;
                        i10 = ((iM2569 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                    }
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case 1018418427:
                case 1816080699:
                    strM48095 = strM48095;
                    strM1844 = C0382.m1844(value, iLastIndexOf);
                    iM2569 = C0630.m2566("ۗۨ") ^ i22;
                    i10 = ((iM2569 ^ i23) * (-27431)) ^ 502905224;
                    i12 = -772875827;
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case 1321383478:
                case 1944274629:
                    str6 = (String) C0964.m3410(map2, value);
                    iM2569 = C0630.m2566("ܶ۟") ^ i23;
                    i10 = ((iM2569 ^ i22) * 8467) ^ (-750871561);
                    i12 = 754050519;
                    i25 = iM2569 ^ i12;
                    i24 = i10;
                    strM48095 = strM48095;
                    break;
                case 1686606987:
                case 1863431541:
                    strM48095 = strM48095;
                    str3 = strM9030;
                    strM7036 = strM7036;
                    sArr3 = sArr5;
                    itM20836 = C7811.m20833(c8322.mo12850());
                    i27 = i29;
                    iM6982 = C0630.m2566("ۤܰ") ^ i23;
                    i6 = ((iM6982 ^ i22) * 785) ^ (-1743986370);
                    i7 = 793299223;
                    i25 = iM6982 ^ i7;
                    strM9030 = str3;
                    sArr5 = sArr3;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    i24 = i6;
                    map2 = map2;
                    break;
                default:
                    str = strM9030;
                    i26 = 50174;
                    iM2567 = C0630.m2566("ܰ۟") ^ i22;
                    i24 = 39661820 ^ ((iM2567 ^ i23) * 16749);
                    i4 = -1860119953;
                    i25 = iM2567 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM7036 = strM7036;
                    strM48095 = strM48095;
                    int i3112 = i29;
                    strM9030 = str;
                    i29 = i3112;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0559 A[PHI: r22 r25 r26
      0x0559: PHI (r22v15 short) = (r22v5 short), (r22v13 short), (r22v16 short) binds: [B:28:0x00da, B:130:0x0557, B:121:0x04f3] A[DONT_GENERATE, DONT_INLINE]
      0x0559: PHI (r25v8 int) = (r25v0 int), (r25v6 int), (r25v9 int) binds: [B:28:0x00da, B:130:0x0557, B:121:0x04f3] A[DONT_GENERATE, DONT_INLINE]
      0x0559: PHI (r26v8 java.util.Iterator) = (r26v0 java.util.Iterator), (r26v6 java.util.Iterator), (r26v9 java.util.Iterator) binds: [B:28:0x00da, B:130:0x0557, B:121:0x04f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x05d1 A[PHI: r18 r22 r25 r26
      0x05d1: PHI (r18v4 short[]) = (r18v2 short[]), (r18v3 short[]), (r18v2 short[]) binds: [B:138:0x05cf, B:117:0x04ce, B:24:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x05d1: PHI (r22v44 short) = (r22v10 short), (r22v17 short), (r22v45 short) binds: [B:138:0x05cf, B:117:0x04ce, B:24:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x05d1: PHI (r25v34 int) = (r25v3 int), (r25v10 int), (r25v35 int) binds: [B:138:0x05cf, B:117:0x04ce, B:24:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x05d1: PHI (r26v33 java.util.Iterator) = (r26v3 java.util.Iterator), (r26v10 java.util.Iterator), (r26v34 java.util.Iterator) binds: [B:138:0x05cf, B:117:0x04ce, B:24:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        if (l.C2958.f9394 < 0) goto L24;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m22359(C9028 c9028, HashMap map, C23431 c23431) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        short s;
        int iM6982;
        int i5;
        int i6;
        int iM6983;
        int i7;
        int i8;
        int i9;
        C8322 c8322 = null;
        Iterator itM13555 = null;
        C20317 c20317 = null;
        int iMo2878 = 0;
        int i10 = 0;
        String strM46622 = null;
        int iMo12858 = 0;
        int iMo2870 = 0;
        int i11 = 0;
        String str = null;
        boolean zM6437 = false;
        short s2 = 0;
        int i12 = 0;
        short s3 = 0;
        int i13 = 0;
        int i14 = 1271652800;
        int i15 = C3432.f10845;
        int i16 = RunnableC3474.f10992;
        int iM6984 = C2105.m6981("᩻ᩴ") ^ i16;
        int i17 = ((iM6984 ^ i15) * (-13647)) ^ (-1633148671);
        int i18 = iM6984 ^ (-121135719);
        short[] sArr = null;
        int i19 = 0;
        Iterator itM13556 = null;
        short s4 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * (-10659)) >> 31));
            switch (i14) {
                case -2137524828:
                case 828785648:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    sArr = f26319;
                    if (C1504.m5179()) {
                        iM2566 = C0630.m2566("ۚ᩸") ^ i16;
                        i3 = ((iM2566 ^ i15) * 27929) ^ (-103568375);
                        i4 = 1856330233;
                    } else {
                        iM2566 = C2105.m6981("ܳ᩷") ^ i16;
                        i3 = ((iM2566 ^ i15) * (-5033)) ^ 376859744;
                        i4 = -1671347519;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -2050131168:
                case 1108494665:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (C0483.m2123(itM13555)) {
                        iM2566 = (C0630.m2566("ۛۖ") ^ i15) * 73;
                        i3 = ((iM2566 ^ i16) * (-19857)) ^ 843950813;
                        i4 = 140994273;
                    } else {
                        iM2566 = (C2105.m6981("ܿۘ") ^ i15) * (-113);
                        i3 = ((iM2566 ^ i16) * 2057) ^ 373126829;
                        i4 = 424394379;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1985030720:
                case 353845332:
                    C1128.m3851();
                    if (C21923.f70183 == 0) {
                        iM6981 = C2105.m6981("ܺ᩻") ^ i15;
                        i = ((iM6981 ^ i16) * (-22615)) ^ (-360628764);
                        i2 = -1210305946;
                        i18 = iM6981 ^ i2;
                        i17 = i;
                    } else {
                        itM13555 = itM13555;
                        s2 = s2;
                        iM6983 = C2105.m6981("۟᩻") ^ i15;
                        i7 = ((iM6983 ^ i16) * 8023) ^ (-2137925581);
                        i8 = 1935691837;
                        i9 = iM6983 ^ i8;
                        i17 = i7;
                        s2 = s2;
                        i18 = i9;
                        itM13555 = itM13555;
                    }
                    break;
                case -1867534288:
                case -421519950:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    try {
                        String str2 = (String) c23431.f75236.get(i11 | i10);
                        try {
                            C3537.m10749(str2);
                            zM6437 = ViewOnClickListenerC1958.m6437(strM46622, str2);
                            int iM2567 = (C0630.m2566("ۜۙ") + i16) * (-35);
                            i17 = ((iM2567 ^ i15) * 3619) ^ (-1121113820);
                            s2 = s2;
                            i12 = i12;
                            i18 = iM2567 ^ 1769899647;
                            str = str2;
                        } catch (Exception unused) {
                            str = str2;
                            iM2566 = C2105.m6981("᩻ܽ") ^ i16;
                            i3 = ((iM2566 ^ i15) * (-6383)) ^ (-344365917);
                            i4 = 2037327299;
                            i9 = iM2566 ^ i4;
                            i17 = i3;
                            s2 = s2;
                            i12 = i12;
                            i18 = i9;
                        }
                    } catch (Exception unused2) {
                    }
                    itM13555 = itM13555;
                    break;
                case -1859157171:
                case 1287551131:
                    itM13555 = itM13555;
                    s2 = s2;
                    int i20 = s2 + s4;
                    i12 = i20 * i20;
                    s3 = 2;
                    if (C1504.m5179()) {
                        iM6983 = C2105.m6981("֫ۗ") ^ i15;
                        i7 = ((iM6983 ^ i16) * (-7373)) ^ (-1197518460);
                        i8 = -1174738169;
                    } else {
                        iM6983 = C2105.m6981("۟᩻") ^ i15;
                        i7 = ((iM6983 ^ i16) * 8023) ^ (-2137925581);
                        i8 = 1935691837;
                    }
                    i9 = iM6983 ^ i8;
                    i17 = i7;
                    s2 = s2;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1766006170:
                case 1515180373:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (C0964.m3413()) {
                        iM2566 = C0630.m2566("ۨ᩷") ^ i15;
                        i3 = ((iM2566 ^ i16) * 18743) ^ (-782048909);
                        i4 = -1755220208;
                    } else {
                        iM2566 = (C0630.m2566("ۜ᩷") + i16) * 115;
                        i3 = ((iM2566 ^ i15) * (-407)) ^ (-406268642);
                        i4 = -1343722504;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1725030547:
                case -1341585552:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (AbstractC2021.m6574()) {
                        iM2566 = C2105.m6981("ܳ᩷") ^ i16;
                        i3 = ((iM2566 ^ i15) * (-5033)) ^ 376859744;
                        i4 = -1671347519;
                    } else {
                        iM2566 = (C0630.m2566("ۖۙ") ^ i16) * (-9);
                        i3 = ((iM2566 ^ i15) * 13811) ^ (-374329779);
                        i4 = 410636100;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1650951375:
                case -491469838:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (i10 >= iMo2878) {
                        itM13555 = itM13555;
                        int iM6985 = C2105.m6981("۬ۢ") ^ i16;
                        i17 = ((iM6985 ^ i15) * 22173) ^ (-895024018);
                        s2 = s2;
                        i12 = i12;
                        i18 = iM6985 ^ (-467178501);
                    } else {
                        iM2566 = (C0630.m2566("ۧۜ") + i16) * (-105);
                        i3 = ((iM2566 ^ i15) * (-14689)) ^ (-1743868495);
                        i4 = -443807195;
                        i9 = iM2566 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM13555 = itM13555;
                    }
                    break;
                case -1650589125:
                case 143875764:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (C1773.m5910(itM13556)) {
                        iM2566 = (i15 - C0630.m2566("ۗ᩶")) * (-9);
                        i3 = ((iM2566 ^ i16) * (-18195)) ^ (-1332576706);
                        i4 = -798858496;
                    } else {
                        iM2566 = C0630.m2566("֡ۛ") ^ i16;
                        i3 = ((iM2566 ^ i15) * 20063) ^ 2101669026;
                        i4 = 1071330440;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1646287953:
                case 474359521:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    iMo12858 = c8322.mo12858() << 24;
                    iMo2870 = c20317.mo2870();
                    iM2566 = (C2105.m6981("ۡܶ") ^ i16) * (-127);
                    i3 = ((iM2566 ^ i15) * 15413) ^ (-688093192);
                    i4 = 258054944;
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1639112757:
                case 1915964687:
                    s2 = s2;
                    i12 = i12;
                    c8322 = (C8322) C2272.m7513(itM13556);
                    itM13555 = C4616.m13555(c8322.mo12850());
                    int iM6986 = C2105.m6981("۬ۢ") ^ i16;
                    i17 = ((iM6986 ^ i15) * 22173) ^ (-895024018);
                    s2 = s2;
                    i12 = i12;
                    i18 = iM6986 ^ (-467178501);
                    break;
                case -1521406750:
                case 174194685:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    itM13556 = C4616.m13555(c9028.mo21936());
                    iM2566 = (C2105.m6981("ܿۘ") ^ i15) * (-113);
                    i3 = ((iM2566 ^ i16) * 2057) ^ 373126829;
                    i4 = 424394379;
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1430272470:
                case -579192883:
                    itM13555 = itM13555;
                    C20317 c20318 = (C20317) RunnableC1108.m3791(itM13555);
                    iMo2878 = c20318.mo2878();
                    i10 = 0;
                    c20317 = c20318;
                    iM2566 = C2105.m6981("ۙ᩺") ^ i16;
                    i3 = ((iM2566 ^ i15) * 28309) ^ 820350807;
                    i4 = -59615139;
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1395542280:
                case 411489356:
                    itM13555 = itM13555;
                    i10++;
                    iM2566 = C2105.m6981("ۙ᩺") ^ i16;
                    i3 = ((iM2566 ^ i15) * 28309) ^ 820350807;
                    i4 = -59615139;
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1127304475:
                case -282182816:
                    C7106.m19120();
                    iM6981 = C2105.m6981("ۤܺ") ^ i15;
                    i = ((iM6981 ^ i16) * 5409) ^ 1947364563;
                    i2 = 1381890721;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    break;
                case -1093141534:
                case 578149559:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C0630.m2566("ᩳۡ") ^ i15) * 65;
                        i3 = ((iM2566 ^ i16) * 4989) ^ (-1558017275);
                        i4 = 507374786;
                    } else {
                        iM2566 = (C0630.m2566("۟ܰ") ^ i16) * 13;
                        i3 = ((iM2566 ^ i15) * 13393) ^ 224949537;
                        i4 = -267003445;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1089737870:
                case -461179801:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (strM46622 == null) {
                        iM2566 = C2105.m6981("᩻ܽ") ^ i16;
                        i3 = ((iM2566 ^ i15) * (-6383)) ^ (-344365917);
                        i4 = 2037327299;
                    } else {
                        iM2566 = C2105.m6981("ۛۗ") ^ i15;
                        i3 = ((iM2566 ^ i16) * 30749) ^ (-724235045);
                        i4 = 684401627;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -1070709617:
                case 46699471:
                    if (C1773.f6144 > 0) {
                        itM13555 = itM13555;
                        s2 = s2;
                        i12 = i12;
                        iM2566 = C2105.m6981("ܰۡ") ^ i15;
                        i3 = ((iM2566 ^ i16) * (-10025)) ^ 1942456464;
                        i4 = -230733079;
                        i9 = iM2566 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM13555 = itM13555;
                    } else {
                        iM6981 = (C0630.m2566("ܳ᩺") + i16) * (-87);
                        i = ((iM6981 ^ i15) * (-30777)) ^ (-368790783);
                        i2 = 68284561;
                        i18 = iM6981 ^ i2;
                        i17 = i;
                    }
                    break;
                case -1011125697:
                case -414614177:
                    C0483.m2121();
                    break;
                case -1003717810:
                case 1393403424:
                    break;
                case -965417879:
                case 1973790405:
                    C3746.m11369();
                    if (C0964.f3626 != 0) {
                        itM13555 = itM13555;
                        s2 = s2;
                        i12 = i12;
                        iM2566 = (C0630.m2566("ᩳۡ") ^ i15) * 65;
                        i3 = ((iM2566 ^ i16) * 4989) ^ (-1558017275);
                        i4 = 507374786;
                        i9 = iM2566 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM13555 = itM13555;
                    } else {
                        iM6981 = C2105.m6981("ۤܺ") ^ i15;
                        i = ((iM6981 ^ i16) * 5409) ^ 1947364563;
                        i2 = 1381890721;
                        i18 = iM6981 ^ i2;
                        i17 = i;
                    }
                    break;
                case -864404736:
                case 869997195:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    strM46622 = c20317.m46622(i10);
                    iM2566 = (C2105.m6981("ܽ᩷") + i15) * (-3);
                    i3 = ((iM2566 ^ i16) * (-26787)) ^ 1352138638;
                    i4 = 71109021;
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -813274881:
                case 620780597:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if ((i13 + 1) - i12 > 0) {
                        iM2566 = (C0630.m2566("᩵ۗ") + i15) * (-73);
                        i3 = ((iM2566 ^ i16) * 16565) ^ 390661699;
                        i4 = -1107490605;
                    } else {
                        iM2566 = C2105.m6981("֡ܶ") ^ i16;
                        i3 = ((iM2566 ^ i15) * (-11805)) ^ 368127057;
                        i4 = -1304445827;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -812043006:
                case 150420775:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = (i15 - C2105.m6981("᩵ۜ")) * 85;
                        i3 = ((iM2566 ^ i16) * (-13953)) ^ (-1587913278);
                        i4 = 2028481467;
                        i9 = iM2566 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM13555 = itM13555;
                    } else {
                        s = s2;
                        iM6982 = (i16 - C2105.m6981("ܰܶ")) * 75;
                        i5 = ((iM6982 ^ i15) * (-22243)) ^ (-1435122491);
                        i6 = -1164862023;
                        i18 = iM6982 ^ i6;
                        s2 = s;
                        i17 = i5;
                        i12 = i12;
                        itM13555 = itM13555;
                    }
                    break;
                case -796612256:
                case 256866954:
                    itM13555 = itM13555;
                    i12 = i12;
                    s = sArr[141];
                    s4 = 1;
                    if (RunnableC1108.f4040) {
                        iM6982 = (C2105.m6981("ۙ᩶") + i16) * (-41);
                        i5 = ((iM6982 ^ i15) * 2539) ^ 742743020;
                        i6 = -1072607157;
                    } else {
                        iM6982 = (i16 - C2105.m6981("ܰܶ")) * 75;
                        i5 = ((iM6982 ^ i15) * (-22243)) ^ (-1435122491);
                        i6 = -1164862023;
                    }
                    i18 = iM6982 ^ i6;
                    s2 = s;
                    i17 = i5;
                    i12 = i12;
                    itM13555 = itM13555;
                    break;
                case -740965275:
                case -221803612:
                    i19 = 11165;
                    iM2566 = (C0630.m2566("᩻۠") + i16) * (-21);
                    i3 = ((iM2566 ^ i15) * 6113) ^ (-1697729583);
                    i4 = 1378358596;
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -455985244:
                case 1440583358:
                    ServiceConnectionC3453.m10564();
                    if (C0483.f2088 >= 0) {
                        itM13555 = itM13555;
                        s2 = s2;
                        i12 = i12;
                        iM2566 = C2105.m6981("ܳ᩷") ^ i16;
                        i3 = ((iM2566 ^ i15) * (-5033)) ^ 376859744;
                        i4 = -1671347519;
                        i9 = iM2566 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM13555 = itM13555;
                    } else {
                        iM6981 = (C0630.m2566("ܳ᩺") + i16) * (-87);
                        i = ((iM6981 ^ i15) * (-30777)) ^ (-368790783);
                        i2 = 68284561;
                        i18 = iM6981 ^ i2;
                        i17 = i;
                    }
                    break;
                case -172402371:
                case 29136487:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (zM6437) {
                        iM2566 = C2105.m6981("᩻ܽ") ^ i16;
                        i3 = ((iM2566 ^ i15) * (-6383)) ^ (-344365917);
                        i4 = 2037327299;
                        i9 = iM2566 ^ i4;
                        i17 = i3;
                    } else {
                        int iM6987 = (C2105.m6981("֫ۙ") ^ i15) * (-27);
                        int i21 = ((iM6987 ^ i16) * 18483) ^ (-1118511203);
                        i9 = iM6987 ^ (-1156000373);
                        i17 = i21;
                    }
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -47742940:
                case 1715962190:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C0630.m2566("ᩳۡ") ^ i15) * 65;
                        i3 = ((iM2566 ^ i16) * 4989) ^ (-1558017275);
                        i4 = 507374786;
                    } else {
                        iM2566 = (C2105.m6981("ۢۚ") ^ i15) * (-103);
                        i3 = ((iM2566 ^ i16) * (-21745)) ^ (-1167057977);
                        i4 = 366734176;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case -41191736:
                case 1781803679:
                    C1047.m3599();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C2105.m6981("ۤܺ") ^ i15;
                        i = ((iM6981 ^ i16) * 5409) ^ 1947364563;
                        i2 = 1381890721;
                    } else {
                        iM6981 = (C0630.m2566("ܳ᩺") + i16) * (-87);
                        i = ((iM6981 ^ i15) * (-30777)) ^ (-368790783);
                        i2 = 68284561;
                    }
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    break;
                case 112592874:
                case 458971741:
                    if (C2958.f9394 < 0) {
                        itM13555 = itM13555;
                        s2 = s2;
                        i12 = i12;
                        iM2566 = (C0630.m2566("ۜ᩷") + i16) * 115;
                        i3 = ((iM2566 ^ i15) * (-407)) ^ (-406268642);
                        i4 = -1343722504;
                        i9 = iM2566 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM13555 = itM13555;
                    } else {
                        iM6981 = C2105.m6981("ۤܺ") ^ i15;
                        i = ((iM6981 ^ i16) * 5409) ^ 1947364563;
                        i2 = 1381890721;
                        i18 = iM6981 ^ i2;
                        i17 = i;
                    }
                    break;
                case 216925859:
                case 277744620:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    i13 = s2 * s3;
                    if (RunnableC0588.m2441() < 0) {
                        iM2566 = (i15 - C2105.m6981("۬ۡ")) * (-115);
                        i3 = ((iM2566 ^ i16) * (-13939)) ^ 1703714360;
                        i4 = -1925262174;
                        i9 = iM2566 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM13555 = itM13555;
                    } else {
                        i12 = i12;
                        iM6983 = C2105.m6981("۟᩻") ^ i15;
                        i7 = ((iM6983 ^ i16) * 8023) ^ (-2137925581);
                        i8 = 1935691837;
                        i9 = iM6983 ^ i8;
                        i17 = i7;
                        s2 = s2;
                        i18 = i9;
                        itM13555 = itM13555;
                    }
                    break;
                case 364162401:
                case 1574058741:
                    try {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder();
                        C1420.m4905(sb, strM46622);
                        s2 = s2;
                        try {
                            i12 = i12;
                            itM13555 = itM13555;
                            try {
                                C3245.m9923(sb, C1504.m5177(f26319, 142, 4, i19));
                                C1420.m4905(sb, str);
                                printStream.println(C0050.m947(sb));
                                c20317.m46610(i10, str);
                                try {
                                    C1128.m3856(map, strM46622, str);
                                    break;
                                } catch (Exception unused3) {
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Exception unused5) {
                            i12 = i12;
                        }
                    } catch (Exception unused6) {
                        s2 = s2;
                    }
                    iM2566 = C2105.m6981("᩻ܽ") ^ i16;
                    i3 = ((iM2566 ^ i15) * (-6383)) ^ (-344365917);
                    i4 = 2037327299;
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case 485473968:
                case 1669381880:
                    itM13555 = itM13555;
                    s2 = s2;
                    i12 = i12;
                    i11 = iMo12858 | (iMo2870 << 16);
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("ܰۡ") ^ i15;
                        i3 = ((iM2566 ^ i16) * (-10025)) ^ 1942456464;
                        i4 = -230733079;
                    } else {
                        iM2566 = C2105.m6981("ܿ᩻") ^ i15;
                        i3 = ((iM2566 ^ i16) * 15807) ^ (-4286555);
                        i4 = 633016324;
                    }
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
                case 727637068:
                case 1194062960:
                    C0050.m940();
                    if (C2105.m6982() == 0) {
                        iM6981 = C2105.m6981("ۤܺ") ^ i15;
                        i = ((iM6981 ^ i16) * 5409) ^ 1947364563;
                        i2 = 1381890721;
                    } else {
                        iM6981 = C2105.m6981("֡ۡ") ^ i16;
                        i = ((iM6981 ^ i15) * (-9193)) ^ 2015647780;
                        i2 = 2058429072;
                    }
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    break;
                case 1514725660:
                case 1580289151:
                    break;
                default:
                    i19 = 60782;
                    iM2566 = (C0630.m2566("᩻۠") + i16) * (-21);
                    i3 = ((iM2566 ^ i15) * 6113) ^ (-1697729583);
                    i4 = 1378358596;
                    i9 = iM2566 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM13555 = itM13555;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x032c  */
    /* JADX WARN: Code duplicated, block: B:306:0x05db  */
    /* JADX WARN: Code duplicated, block: B:308:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:349:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:350:0x06a6 A[PHI: r19 r22
      0x06a6: PHI (r19v5 int) = (r19v3 int), (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:346:0x069a, B:348:0x06a0, B:286:0x057b, B:295:0x05ab] A[DONT_GENERATE, DONT_INLINE]
      0x06a6: PHI (r22v5 int) = (r22v2 int), (r22v4 int), (r22v2 int), (r22v2 int) binds: [B:346:0x069a, B:348:0x06a0, B:286:0x057b, B:295:0x05ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22360(C9028 c9028, C18090 c18090) throws IOException {
        int i;
        int i2;
        String strM6435;
        int i3;
        String strM10488;
        Iterator it;
        int i4;
        int parent;
        int i5;
        boolean z;
        C3545 c3545M7156;
        String name;
        int iMo5004;
        short s = f26319[146];
        int i6 = (s * 2) + 1;
        int i7 = s + 1;
        int i8 = i6 - (i7 * i7) <= 0 ? 62423 : 5891;
        Iterator itM13555 = C4616.m13555(c9028.mo21936());
        while (C1773.m5910(itM13555)) {
            Iterator itM13556 = C4616.m13555(((C8322) RunnableC1108.m3791(itM13555)).mo12850());
            while (C0483.m2123(itM13556)) {
                C20317 c20317 = (C20317) C2272.m7513(itM13556);
                if (f26318.contains(C2958.m9030(c20317))) {
                    itM13555 = itM13555;
                    itM13556 = itM13556;
                } else {
                    int iMo2870 = c20317.mo2870();
                    String strM11357 = C3746.m11357(f26319, 147, 4, i8);
                    if (iMo2870 != 1 || c20317.mo2871() > 1 || c20317.mo2878() != 0) {
                        if (c20317.mo2871() == 1) {
                            Iterator itM20833 = C7811.m20833(c20317.mo2877(0).mo18746());
                            i = 0;
                            i2 = 0;
                            while (C0483.m2123(itM20833)) {
                                InterfaceC21211 interfaceC21211 = (InterfaceC21211) C2272.m7513(itM20833);
                                if (!interfaceC21211.mo29412()) {
                                    InterfaceC1454 value = interfaceC21211.getValue();
                                    if ((value.mo5009() && !value.mo5008().mo10323() && C7106.m19121(value.mo5008().getValue())) || (value.mo5004() == 18 && value.getValue() == 0)) {
                                        i++;
                                    }
                                }
                                if (interfaceC21211.mo29412() && interfaceC21211.mo29409() != 0 && interfaceC21211.getValue().mo5006() == 16777216) {
                                    i2++;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        Iterator itM13557 = C4616.m13555(c20317.mo2872());
                        int i9 = 0;
                        int i10 = 0;
                        int i11 = 0;
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        int i15 = 0;
                        int i16 = 0;
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 0;
                        while (true) {
                            boolean zM5910 = C1773.m5910(itM13557);
                            int i29 = i19;
                            int i30 = i20;
                            int i31 = i18;
                            String strM7159 = C2167.m7159(f26319, 151, 10, i8);
                            int i32 = i17;
                            String strM71510 = C2167.m7159(f26319, 161, 5, i8);
                            int i33 = i15;
                            String strM1840 = C0382.m1840(f26319, 166, 4, i8);
                            int i34 = i14;
                            String strM5177 = C1504.m5177(f26319, 170, 8, i8);
                            int i35 = i13;
                            String strM1841 = C0382.m1840(f26319, 178, 12, i8);
                            int i36 = i12;
                            String strM10568 = ServiceConnectionC3453.m10568(f26319, 190, 6, i8);
                            if (zM5910) {
                                Iterator itM13558 = C4616.m13555(((InterfaceC7099) C2272.m7513(itM13557)).mo18746());
                                while (C0483.m2123(itM13558)) {
                                    InterfaceC21211 interfaceC21212 = (InterfaceC21211) RunnableC1108.m3791(itM13558);
                                    if (interfaceC21212.mo29412() && interfaceC21212.mo29409() != 0) {
                                        Iterator itM13559 = C4616.m13555(interfaceC21212.values());
                                        int i37 = 16777217;
                                        while (true) {
                                            if (C0483.m2123(itM13559)) {
                                                it = itM13557;
                                                int i38 = i37 + 1;
                                                if (((InterfaceC1454) C2272.m7513(itM13559)).mo5006() == i37) {
                                                    i37 = i38;
                                                    itM13557 = it;
                                                }
                                            } else {
                                                it = itM13557;
                                                i9++;
                                            }
                                        }
                                    } else {
                                        it = itM13557;
                                    }
                                    if (interfaceC21212.mo29412() && interfaceC21212.mo29409() != 0) {
                                        Iterator itM135510 = C4616.m13555(interfaceC21212.values());
                                        while (true) {
                                            if (C1773.m5910(itM135510)) {
                                                InterfaceC1454 interfaceC1454 = (InterfaceC1454) RunnableC1108.m3791(itM135510);
                                                Iterator it2 = itM135510;
                                                int iMo5006 = interfaceC1454.mo5006();
                                                i4 = i9;
                                                if (iMo5006 >= 16777220 && iMo5006 <= 16777225 && ((iMo5004 = interfaceC1454.mo5004()) == 0 || iMo5004 == 1 || iMo5004 == 2 || iMo5004 == 3)) {
                                                    itM135510 = it2;
                                                    i9 = i4;
                                                }
                                            } else {
                                                i4 = i9;
                                                i10++;
                                            }
                                        }
                                    } else {
                                        i4 = i9;
                                    }
                                    if (interfaceC21212.mo29412() && ((parent = interfaceC21212.getParent()) == 0 || ((-65536) & parent) == 16973824 || ((parent >>> 16) & 255) == interfaceC21212.getType().mo2870())) {
                                        if (interfaceC21212.mo29409() == 0) {
                                            i5 = i10;
                                        } else {
                                            Iterator itM135511 = C4616.m13555(interfaceC21212.values());
                                            while (true) {
                                                if (C0483.m2123(itM135511)) {
                                                    InterfaceC1454 interfaceC1455 = (InterfaceC1454) RunnableC1108.m3791(itM135511);
                                                    Iterator it3 = itM135511;
                                                    if ((interfaceC1455.mo5006() & (-65536)) == 16842752) {
                                                        i5 = i10;
                                                    } else {
                                                        i5 = i10;
                                                        if ((interfaceC1455.mo5006() & (-16777216)) != (C2105.m6981(C1504.m5177(f26319, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i8)) ^ 2129448214)) {
                                                            itM135511 = it3;
                                                            i10 = i5;
                                                        }
                                                    }
                                                } else {
                                                    i5 = i10;
                                                }
                                            }
                                        }
                                        i36++;
                                    } else {
                                        i5 = i10;
                                    }
                                    if (!interfaceC21212.mo29412() && interfaceC21212.getValue().mo5004() == 18) {
                                        i35++;
                                    }
                                    if (!interfaceC21212.mo29412() && interfaceC21212.getValue().mo5004() == 5) {
                                        i34++;
                                    }
                                    if (!interfaceC21212.mo29412() && (interfaceC21212.getValue().mo5004() == 6 || interfaceC21212.getValue().mo5004() == 4)) {
                                        i32++;
                                    }
                                    if (interfaceC21212.mo29412() ? false : interfaceC21212.getValue().mo5007()) {
                                        i31++;
                                    }
                                    if (interfaceC21212.mo29412() ? false : interfaceC21212.getValue().mo5005()) {
                                        i16++;
                                    }
                                    if (interfaceC21212.mo29412()) {
                                        z = false;
                                    } else {
                                        InterfaceC1454 value2 = interfaceC21212.getValue();
                                        if (value2.mo5009() && C0714.m2803(c18090, value2.mo5008().getValue()) == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        i11++;
                                    }
                                    if (!interfaceC21212.mo29412() && interfaceC21212.getValue().mo5009() && (c3545M7156 = C2167.m7156(c18090, interfaceC21212.getValue().mo5008().getValue())) != null && C7106.m19111(c3545M7156) <= 1048576) {
                                        byte[] bArrM1795 = C0349.m1795(C3663.m11163(c18090, c3545M7156), 0);
                                        try {
                                            XmlResourceParserC10269 xmlResourceParserC10269M35994 = C15206.m35978(bArrM1795).m35994();
                                            while (true) {
                                                int next = xmlResourceParserC10269M35994.next();
                                                if (next != 1) {
                                                    if (next == 2) {
                                                        name = xmlResourceParserC10269M35994.getName();
                                                        if (!ViewOnClickListenerC1958.m6437(name, C4075.m12252(f26319, 510, 3, i8))) {
                                                        }
                                                    }
                                                    xmlResourceParserC10269M35994 = xmlResourceParserC10269M35994;
                                                } else {
                                                    name = null;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        byte b = -1;
                                        if (name != null) {
                                            switch (C0630.m2566(name)) {
                                                case -1493546681:
                                                    if (ViewOnClickListenerC1958.m6437(name, RunnableC0588.m2436(f26319, 276, 14, i8))) {
                                                        b = 0;
                                                    }
                                                    break;
                                                case -1388777169:
                                                    if (ViewOnClickListenerC1958.m6437(name, C7106.m19110(f26319, 290, 6, i8))) {
                                                        b = 1;
                                                    }
                                                    break;
                                                case -930826704:
                                                    if (C1294.m4369(name, C3019.m9250(f26319, 296, 6, i8))) {
                                                        b = 2;
                                                    }
                                                    break;
                                                case -925180581:
                                                    if (C1294.m4369(name, C1047.m3603(f26319, 302, 6, i8))) {
                                                        b = 3;
                                                    }
                                                    break;
                                                case -820387517:
                                                    if (ViewOnClickListenerC1958.m6437(name, C0050.m948(f26319, 308, 6, i8))) {
                                                        b = 4;
                                                    }
                                                    break;
                                                case -510364471:
                                                    if (ViewOnClickListenerC1958.m6437(name, C3245.m9934(f26319, 314, 17, i8))) {
                                                        b = 5;
                                                    }
                                                    break;
                                                case -173195978:
                                                    if (ViewOnClickListenerC1958.m6437(name, C2167.m7159(f26319, 331, 21, i8))) {
                                                        b = 6;
                                                    }
                                                    break;
                                                case -94197862:
                                                    if (ViewOnClickListenerC1958.m6437(name, C4075.m12252(f26319, 352, 10, i8))) {
                                                        b = 7;
                                                    }
                                                    break;
                                                case 3056464:
                                                    if (ViewOnClickListenerC1958.m6437(name, C0422.m1955(f26319, 362, 4, i8))) {
                                                        b = 8;
                                                    }
                                                    break;
                                                case 3347807:
                                                    if (C1294.m4369(name, strM1840)) {
                                                        b = 9;
                                                    }
                                                    break;
                                                case 92909918:
                                                    if (ViewOnClickListenerC1958.m6437(name, C4263.m12817(f26319, 366, 5, i8))) {
                                                        b = 10;
                                                    }
                                                    break;
                                                case 94842723:
                                                    if (ViewOnClickListenerC1958.m6437(name, strM71510)) {
                                                        b = 11;
                                                    }
                                                    break;
                                                case 100360477:
                                                    if (ViewOnClickListenerC1958.m6437(name, C7106.m19110(f26319, 371, 5, i8))) {
                                                        b = 12;
                                                    }
                                                    break;
                                                case 103785528:
                                                    if (C1294.m4369(name, C1711.m5726(f26319, 376, 5, i8))) {
                                                        b = cb.k;
                                                    }
                                                    break;
                                                case 106438894:
                                                    if (ViewOnClickListenerC1958.m6437(name, C3019.m9250(f26319, 381, 5, i8))) {
                                                        b = cb.f77931l;
                                                    }
                                                    break;
                                                case 108532386:
                                                    if (ViewOnClickListenerC1958.m6437(name, C2126.m7036(f26319, 386, 11, i8))) {
                                                        b = 15;
                                                    }
                                                    break;
                                                case 109250890:
                                                    if (ViewOnClickListenerC1958.m6437(name, C4117.m12355(f26319, 397, 5, i8))) {
                                                        b = 16;
                                                    }
                                                    break;
                                                case 109399969:
                                                    if (C1294.m4369(name, RunnableC3474.m10633(f26319, 402, 5, i8))) {
                                                        b = 17;
                                                    }
                                                    break;
                                                case 1052832078:
                                                    if (C1294.m4369(name, C0382.m1840(f26319, 407, 9, i8))) {
                                                        b = 18;
                                                    }
                                                    break;
                                                case 1191572447:
                                                    if (ViewOnClickListenerC1958.m6437(name, C1005.m3502(f26319, 416, 8, i8))) {
                                                        b = 19;
                                                    }
                                                    break;
                                                case 1747193040:
                                                    if (C1294.m4369(name, C2958.m9031(f26319, 424, 23, i8))) {
                                                        b = 20;
                                                    }
                                                    break;
                                                case 1862666772:
                                                    if (C1294.m4369(name, strM7159)) {
                                                        b = 21;
                                                    }
                                                    break;
                                                case 2013827269:
                                                    if (C1294.m4369(name, C0483.m2128(f26319, Scalar448.TARGET_LENGTH, 15, i8))) {
                                                        b = 22;
                                                    }
                                                    break;
                                                case 2118620333:
                                                    if (ViewOnClickListenerC1958.m6437(name, C3432.m10488(f26319, 462, 15, i8))) {
                                                        b = 23;
                                                    }
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 4:
                                                case 5:
                                                case 7:
                                                case 8:
                                                case 11:
                                                case 12:
                                                case 17:
                                                case 22:
                                                case 23:
                                                    i29++;
                                                    break;
                                                case 3:
                                                case 10:
                                                case 16:
                                                case 18:
                                                    i24++;
                                                    break;
                                                case 6:
                                                case 14:
                                                case 20:
                                                    i27++;
                                                    break;
                                                case 9:
                                                    i26++;
                                                    break;
                                                case 13:
                                                    i21++;
                                                    break;
                                                case 15:
                                                    i33++;
                                                    break;
                                                case 19:
                                                    i16++;
                                                    i29++;
                                                    break;
                                                case 21:
                                                    i28++;
                                                    break;
                                                default:
                                                    String strM3595 = C1047.m3595(name);
                                                    if (C0422.m1945(strM3595, strM10568) || C0422.m1945(strM3595, C1711.m5726(f26319, 521, 4, i8)) || C0422.m1945(strM3595, RunnableC1937.m6385(f26319, 525, 6, i8))) {
                                                        i21++;
                                                    } else if (C0050.m938(strM3595, strM1841)) {
                                                        i22++;
                                                    } else if (C0422.m1945(strM3595, strM5177)) {
                                                        i23++;
                                                    } else if (!C0422.m1945(strM3595, C0714.m2816(f26319, 531, 16, i8))) {
                                                        System.out.println(C4117.m12351(C3683.m11225(f26319, 547, 19, i8), name));
                                                    } else {
                                                        i27++;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            String strM48095 = C21144.m48095(bArrM1795);
                                            if (strM48095 != null) {
                                                switch (C2105.m6981(strM48095)) {
                                                    case 1468055:
                                                        if (ViewOnClickListenerC1958.m6437(strM48095, C2272.m7507(f26319, 477, 4, i8))) {
                                                            b = 0;
                                                        }
                                                        break;
                                                    case 1472726:
                                                        if (C1294.m4369(strM48095, C2167.m7159(f26319, 481, 4, i8))) {
                                                            b = 1;
                                                        }
                                                        break;
                                                    case 1475827:
                                                        if (C1294.m4369(strM48095, C1916.m6311(f26319, 485, 4, i8))) {
                                                            b = 2;
                                                        }
                                                        break;
                                                    case 1480755:
                                                        if (ViewOnClickListenerC1958.m6437(strM48095, C2126.m7036(f26319, 489, 4, i8))) {
                                                            b = 3;
                                                        }
                                                        break;
                                                    case 1481531:
                                                        if (C1294.m4369(strM48095, ServiceConnectionC3453.m10568(f26319, 493, 4, i8))) {
                                                            b = 4;
                                                        }
                                                        break;
                                                    case 1485557:
                                                        if (C1294.m4369(strM48095, C2272.m7507(f26319, 497, 4, i8))) {
                                                            b = 5;
                                                        }
                                                        break;
                                                    case 1485560:
                                                        if (C1294.m4369(strM48095, C21923.m49334(f26319, 501, 4, i8))) {
                                                            b = 6;
                                                        }
                                                        break;
                                                    case 46127306:
                                                        if (ViewOnClickListenerC1958.m6437(strM48095, RunnableC0588.m2436(f26319, 505, 5, i8))) {
                                                            b = 7;
                                                        }
                                                        break;
                                                }
                                                switch (b) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 7:
                                                        i29++;
                                                        break;
                                                    case 3:
                                                    case 5:
                                                    case 6:
                                                        i33++;
                                                        break;
                                                    case 4:
                                                        i30++;
                                                        i29++;
                                                        break;
                                                    default:
                                                        i25++;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    c18090 = c18090;
                                    i9 = i4;
                                    itM13557 = it;
                                    i10 = i5;
                                }
                                c18090 = c18090;
                                i19 = i29;
                                i20 = i30;
                                i18 = i31;
                                i17 = i32;
                                i15 = i33;
                                i14 = i34;
                                i13 = i35;
                                i12 = i36;
                            } else {
                                if (i > 0) {
                                    strM6435 = C1711.m5726(f26319, 196, 2, i8);
                                } else {
                                    i = 0;
                                    strM6435 = null;
                                }
                                if (i2 > i) {
                                    strM6435 = strM11357;
                                } else {
                                    i2 = i;
                                }
                                if (i9 > i2) {
                                    strM6435 = RunnableC1108.m3789(f26319, 198, 5, i8);
                                } else {
                                    i9 = i2;
                                }
                                if (i10 > i9) {
                                    strM6435 = C3537.m10748(f26319, 203, 7, i8);
                                } else {
                                    i10 = i9;
                                }
                                if (i11 > i10) {
                                    strM6435 = C3746.m11357(f26319, 210, 6, i8);
                                } else {
                                    i11 = i10;
                                }
                                int i39 = i36;
                                if (i39 > i11) {
                                    strM6435 = C0237.m1483(f26319, 216, 5, i8);
                                } else {
                                    i39 = i11;
                                }
                                if (i35 > i39) {
                                    strM6435 = ViewOnClickListenerC1958.m6435(f26319, 221, 4, i8);
                                    i39 = i35;
                                }
                                if (i34 > i39) {
                                    strM10488 = C0714.m2816(f26319, 228, 5, i8);
                                    i3 = i34;
                                } else {
                                    String str = strM6435;
                                    i3 = i39;
                                    strM10488 = str;
                                }
                                if (i33 > i3) {
                                    strM10488 = C3019.m9250(f26319, 233, 4, i8);
                                } else {
                                    i33 = i3;
                                }
                                if (i32 > i33) {
                                    strM10488 = ViewOnClickListenerC1958.m6435(f26319, 237, 8, i8);
                                    i33 = i32;
                                }
                                if (i31 > i33) {
                                    strM10488 = C2126.m7036(f26319, 245, 7, i8);
                                    i33 = i31;
                                }
                                if (i30 > i33) {
                                    strM10488 = C3663.m11162(f26319, 252, 6, i8);
                                    i33 = i30;
                                }
                                if (i29 > i33) {
                                    strM10488 = C3432.m10488(f26319, 258, 8, i8);
                                    i33 = i29;
                                }
                                int i40 = i16;
                                if (i40 > i33) {
                                    i33 = i40;
                                } else {
                                    strM71510 = strM10488;
                                }
                                int i41 = i21;
                                if (i41 > i33) {
                                    i33 = i41;
                                } else {
                                    strM10568 = strM71510;
                                }
                                int i42 = i22;
                                if (i42 > i33) {
                                    i33 = i42;
                                } else {
                                    strM1841 = strM10568;
                                }
                                int i43 = i23;
                                if (i43 > i33) {
                                    i33 = i43;
                                } else {
                                    strM5177 = strM1841;
                                }
                                int i44 = i24;
                                if (i44 > i33) {
                                    strM5177 = C0237.m1483(f26319, 266, 4, i8);
                                    i33 = i44;
                                }
                                int i45 = i25;
                                if (i45 > i33) {
                                    strM5177 = C7106.m19110(f26319, BottomAppBarTopEdgeTreatment.ANGLE_UP, 3, i8);
                                    i33 = i45;
                                }
                                int i46 = i26;
                                if (i46 > i33) {
                                    i33 = i46;
                                } else {
                                    strM1840 = strM5177;
                                }
                                int i47 = i27;
                                if (i47 > i33) {
                                    strM1840 = C1504.m5177(f26319, 273, 3, i8);
                                    i33 = i47;
                                }
                                if (i28 <= i33) {
                                    strM7159 = strM1840;
                                }
                                strM11357 = strM7159 != null ? strM7159 : String.format(C1128.m3841(f26319, 513, 8, i8), C1420.m4916(c20317.mo2870()));
                                c20317 = c20317;
                            }
                        }
                    }
                    c20317.m46623(strM11357);
                }
                itM13555 = itM13555;
                c18090 = c18090;
                itM13556 = itM13556;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22362(String str, boolean z) {
        int iM3007 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        char cM3000 = 0;
        int i3 = -962261866;
        int i4 = C4263.f13799;
        int i5 = ViewOnClickListenerC1958.f6529;
        int iM6981 = (C2105.m6981("۠ۙ") ^ i5) * 13;
        int i6 = ((iM6981 ^ i4) * 11669) ^ (-1885832604);
        int i7 = 1174491525;
        while (true) {
            i3 = ((((i3 ^ i4) * 27027) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -2145275821:
                case 212710096:
                    z2 = false;
                    z3 = true;
                    if (iM3007 >= 1) {
                        iM6981 = C2105.m6981("ܶۖ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-26781)) ^ 1932394489;
                        i7 = 852081682;
                    } else {
                        iM6981 = C2105.m6981("۬ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 19459) ^ (-1045323514);
                        i7 = -1422434458;
                    }
                    break;
                case -2053701609:
                case -606541206:
                    if (z) {
                        iM6981 = (C0630.m2566("ۤ᩸") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM6981 ^ i5) * 10295) ^ 1179753789;
                        i7 = 942042742;
                    } else {
                        iM6981 = C2105.m6981("۬ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 19459) ^ (-1045323514);
                        i7 = -1422434458;
                    }
                    break;
                case -2046359047:
                case -794594063:
                    i = 100;
                    iM6981 = (i5 - C0630.m2566("ᩳ᩺")) * (-15);
                    i6 = ((iM6981 ^ i4) * 31181) ^ (-1820829413);
                    i7 = 515328512;
                    break;
                case -1993703867:
                case 1892415291:
                    if (cM3000 == '$') {
                        iM6981 = C2105.m6981("۬ۗ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    } else {
                        iM6981 = (C2105.m6981("ᩳܽ") ^ i4) * (-77);
                        i6 = ((iM6981 ^ i5) * 31303) ^ 1629859082;
                        i7 = -1158638223;
                    }
                    break;
                case -1702920420:
                case 1996118989:
                    if (C1294.m4372() <= 0) {
                        iM6981 = (i5 - C0630.m2566("ۚ᩸")) * 13;
                        i6 = ((iM6981 ^ i4) * (-6781)) ^ 67276306;
                        i7 = 1700605119;
                    } else {
                        iM6981 = C0630.m2566("᩻᩶") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-5151)) ^ 1067919067;
                        i7 = 1380479679;
                    }
                    break;
                case -1688557541:
                case 164168030:
                    i2++;
                    iM6981 = C2105.m6981("ܰ۠") ^ i4;
                    i6 = ((iM6981 ^ i5) * (-22505)) ^ (-239819065);
                    i7 = 635708687;
                    break;
                case -1675823744:
                case 1524673594:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = (i4 - C2105.m6981("᩺ᩳ")) * (-77);
                        i6 = ((iM6981 ^ i5) * 5771) ^ (-643489631);
                        i7 = -1201456080;
                    } else {
                        iM6981 = C2105.m6981("ᩴ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    }
                    break;
                case -1620333667:
                case -1281324801:
                    return z2;
                case -1482270684:
                case -75715029:
                    if (cM3000 <= 'z') {
                        iM6981 = C2105.m6981("۬ۗ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    } else {
                        iM6981 = (C0630.m2566("֡ۤ") ^ i4) * (-115);
                        i6 = ((iM6981 ^ i5) * (-1965)) ^ 848978855;
                        i7 = 1603665604;
                    }
                    break;
                case -1468492084:
                case 107518419:
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("֨᩸") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-7807)) ^ 1080544740;
                        i7 = 409863162;
                    } else {
                        iM6981 = C0630.m2566("᩹۠") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-25715)) ^ (-560863119);
                        i7 = 489617944;
                    }
                    break;
                case -1440267173:
                case 100591356:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C2105.m6981("ᩴ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    } else {
                        iM6981 = (C2105.m6981("ۛ᩸") ^ i4) * (-109);
                        i6 = ((iM6981 ^ i5) * (-6739)) ^ (-1891482058);
                        i7 = -1686568368;
                    }
                    break;
                case -1112367010:
                case 815875727:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("ܽۙ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-25321)) ^ 45629624;
                        i7 = 839333145;
                    } else {
                        iM6981 = C0630.m2566("ۤᩴ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-24115)) ^ 439070930;
                        i7 = 1118208757;
                    }
                    break;
                case -967506686:
                case 1775449239:
                    RunnableC3474.m10630();
                    if (!C3663.f11553) {
                        iM6981 = (i4 - C2105.m6981("᩺ᩳ")) * (-77);
                        i6 = ((iM6981 ^ i5) * 5771) ^ (-643489631);
                        i7 = -1201456080;
                    } else {
                        iM6981 = C2105.m6981("ܳۧ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-22905)) ^ 939124249;
                        i7 = 1551603159;
                    }
                    break;
                case -959939924:
                case -707848555:
                    i = 75;
                    iM6981 = (i5 - C0630.m2566("ᩳ᩺")) * (-15);
                    i6 = ((iM6981 ^ i4) * 31181) ^ (-1820829413);
                    i7 = 515328512;
                    break;
                case -832621941:
                case 1705880204:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ᩴ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    } else {
                        iM6981 = (C0630.m2566("֨ᩳ") + i5) * (-89);
                        i6 = ((iM6981 ^ i4) * (-18081)) ^ 1412109579;
                        i7 = -1879799871;
                    }
                    break;
                case -821453313:
                case 788695502:
                    C11340.m28031();
                    C2167.m7155();
                    iM6981 = C0630.m2566("᩹۠") ^ i5;
                    i6 = ((iM6981 ^ i4) * (-25715)) ^ (-560863119);
                    i7 = 489617944;
                    break;
                case -795910330:
                case 331395880:
                    i2 = 0;
                    iM6981 = C2105.m6981("ܰ۠") ^ i4;
                    i6 = ((iM6981 ^ i5) * (-22505)) ^ (-239819065);
                    i7 = 635708687;
                    break;
                case -677803476:
                case -459472811:
                    if (C2272.f7362) {
                        iM6981 = (i5 - C0630.m2566("ۚ᩸")) * 13;
                        i6 = ((iM6981 ^ i4) * (-6781)) ^ 67276306;
                        i7 = 1700605119;
                    } else {
                        iM6981 = C0630.m2566("ܽۢ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-10519)) ^ 1130145101;
                        i7 = -1636070858;
                    }
                    break;
                case -636991548:
                case 636499083:
                    if ('A' <= cM3000) {
                        iM6981 = C0630.m2566("ۖ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * 16533) ^ 728454672;
                        i7 = 661226710;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۗ۠")) * (-31);
                        i6 = ((iM6981 ^ i4) * 405) ^ (-60983378);
                        i7 = 745399540;
                    }
                    break;
                case -475759750:
                case 471922762:
                    if ('0' <= cM3000) {
                        iM6981 = C0630.m2566("᩻۫") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-16723)) ^ 999767594;
                        i7 = 1182644915;
                    } else {
                        iM6981 = (C0630.m2566("ۚܺ") ^ i5) * (-11);
                        i6 = ((iM6981 ^ i4) * 14481) ^ 1073899810;
                        i7 = 614809715;
                    }
                    break;
                case -350303096:
                case 1614058165:
                    iM3007 = C0798.m3007(str);
                    if (z) {
                        iM6981 = C0630.m2566("᩸᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * 30203) ^ (-911313822);
                        i7 = -769137969;
                    } else {
                        iM6981 = C0630.m2566("ۢܳ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 27269) ^ (-890419457);
                        i7 = -225145067;
                    }
                    break;
                case -254805859:
                case 674575919:
                    return z3;
                case -114995411:
                case 2118713410:
                    C0422.m1963();
                    if (C3911.m11924() > 0) {
                        iM6981 = C2105.m6981("ᩴ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    } else {
                        iM6981 = C0630.m2566("᩹۠") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-25715)) ^ (-560863119);
                        i7 = 489617944;
                    }
                    break;
                case -19839409:
                case 737859101:
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("ᩴ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    } else {
                        iM6981 = C0630.m2566("֡۬") ^ i5;
                        i6 = ((iM6981 ^ i4) * 25505) ^ (-774646131);
                        i7 = -1329721079;
                    }
                    break;
                case 33240719:
                case 1713665554:
                    C0630.m2564();
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i5 - C0630.m2566("ۚ᩸")) * 13;
                        i6 = ((iM6981 ^ i4) * (-6781)) ^ 67276306;
                        i7 = 1700605119;
                    } else {
                        iM6981 = C2105.m6981("ܳۧ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-22905)) ^ 939124249;
                        i7 = 1551603159;
                    }
                    break;
                case 63712499:
                case 691992097:
                    if (C1504.f5354) {
                        iM6981 = (C2105.m6981("ۖ᩵") + i4) * 97;
                        i6 = ((iM6981 ^ i5) * 10363) ^ (-660187126);
                        i7 = -1918548451;
                    } else {
                        iM6981 = C2105.m6981("ᩳ۟") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-28459)) ^ 480918152;
                        i7 = -100654737;
                    }
                    break;
                case 110457690:
                case 2073556926:
                    if (iM3007 > i) {
                        iM6981 = C2105.m6981("۬ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 19459) ^ (-1045323514);
                        i7 = -1422434458;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ۚۢ")) * 77;
                        i6 = ((iM6981 ^ i4) * (-4901)) ^ (-135438393);
                        i7 = -1627836251;
                    }
                    break;
                case 140040180:
                case 674145568:
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = (C2105.m6981("ۖ᩵") + i4) * 97;
                        i6 = ((iM6981 ^ i5) * 10363) ^ (-660187126);
                        i7 = -1918548451;
                    } else {
                        iM6981 = C2105.m6981("ᩴ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    }
                    break;
                case 260728841:
                case 1188873456:
                    if (cM3000 != '_') {
                        iM6981 = C0630.m2566("ۨۢ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-26869)) ^ 352329385;
                        i7 = 619220982;
                    } else {
                        iM6981 = C2105.m6981("۬ۗ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    }
                    break;
                case 297331095:
                case 1064988905:
                    if (i2 < iM3007) {
                        iM6981 = C2105.m6981("۫۠") ^ i5;
                        i6 = ((iM6981 ^ i4) * 30125) ^ 1397202942;
                        i7 = -605243289;
                    } else {
                        iM6981 = (C0630.m2566("ܽ֨") + i5) * (-61);
                        i6 = ((iM6981 ^ i4) * (-2627)) ^ 631024772;
                        i7 = 59045595;
                    }
                    break;
                case 320280874:
                case 618499338:
                    if (cM3000 != '.') {
                        iM6981 = C2105.m6981("۬ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 19459) ^ (-1045323514);
                        i7 = -1422434458;
                    } else {
                        iM6981 = C2105.m6981("۬ۗ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    }
                    break;
                case 322257822:
                case 995802469:
                    if (cM3000 <= 'Z') {
                        iM6981 = C2105.m6981("۬ۗ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۗ۠")) * (-31);
                        i6 = ((iM6981 ^ i4) * 405) ^ (-60983378);
                        i7 = 745399540;
                    }
                    break;
                case 547232058:
                case 2029648559:
                    if (C2272.f7362) {
                        iM6981 = (C2105.m6981("ۖ᩵") + i4) * 97;
                        i6 = ((iM6981 ^ i5) * 10363) ^ (-660187126);
                        i7 = -1918548451;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩷") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-7975)) ^ (-1344252985);
                        i7 = 1636081538;
                    }
                    break;
                case 632511602:
                case 1440241717:
                    if (C4159.m12565() < 0) {
                        iM6981 = C0630.m2566("᩹۠") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-25715)) ^ (-560863119);
                        i7 = 489617944;
                    } else {
                        iM6981 = (C0630.m2566("ۨ۠") + i5) * (-85);
                        i6 = ((iM6981 ^ i4) * (-27723)) ^ (-1808455292);
                        i7 = 1614500597;
                    }
                    break;
                case 741532418:
                case 1520022953:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("ܳۧ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-22905)) ^ 939124249;
                        i7 = 1551603159;
                    } else {
                        iM6981 = (C0630.m2566("ۤ᩷") ^ i5) * 5;
                        i6 = ((iM6981 ^ i4) * (-17701)) ^ (-1634735066);
                        i7 = -1890946391;
                    }
                    break;
                case 789047327:
                case 1736634673:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ܽۙ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-25321)) ^ 45629624;
                        i7 = 839333145;
                    } else {
                        iM6981 = C0630.m2566("ۙ᩺") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-28939)) ^ 341567819;
                        i7 = 873977923;
                    }
                    break;
                case 1150532994:
                case 1914873931:
                    if (cM3000 > '9') {
                        iM6981 = (C0630.m2566("ۚܺ") ^ i5) * (-11);
                        i6 = ((iM6981 ^ i4) * 14481) ^ 1073899810;
                        i7 = 614809715;
                    } else {
                        iM6981 = C2105.m6981("۬ۗ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    }
                    break;
                case 1225680296:
                case 1731794017:
                    C0714.m2805();
                    RunnableC3474.m10630();
                    return false;
                case 1438033765:
                case 1876576656:
                    if (C0964.m3413()) {
                        iM6981 = (C2105.m6981("ۖ᩵") + i4) * 97;
                        i6 = ((iM6981 ^ i5) * 10363) ^ (-660187126);
                        i7 = -1918548451;
                    } else {
                        iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 6935) ^ 2113284049;
                        i7 = 1569466108;
                    }
                    break;
                default:
                    cM3000 = C0798.m3000(str, i2);
                    if ('a' <= cM3000) {
                        iM6981 = (C2105.m6981("۠֨") + i4) * (-49);
                        i6 = ((iM6981 ^ i5) * (-2019)) ^ 2013244772;
                        i7 = 1570006836;
                    } else {
                        iM6981 = (C0630.m2566("֡ۤ") ^ i4) * (-115);
                        i6 = ((iM6981 ^ i5) * (-1965)) ^ 848978855;
                        i7 = 1603665604;
                    }
                    break;
            }
        }
    }
}
