package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.analytics.pro.C0713i;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.p080ec.rfc8032.Scalar448;

/* JADX INFO: renamed from: l.ۡۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10556 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f29233 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC8146 f29234;

    /* JADX INFO: renamed from: ᩶ۚ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f82089 = {1174, 15088, 15077, 15076, 15083, 15083, 15079, 15076, 15079, 15098, 15084, 15073, 15077, 15085, 15078, 15084, 15098, 15081, 15103, 15081, 15082, 15076, 15085, 15086, 15079, 15078, 15100, 15086, 15098, 15081, 15083, 15100, 15073, 15079, 15078, 15073, 15084, 15073, 15078, 15100, 15085, 15098, 15096, 15079, 15076, 15081, 15100, 15079, 15098, 15073, 15078, 15100, 15085, 15087, 15085, 15098, 15076, 15081, 15089, 15079, 15101, 15100, 15077, 15073, 15096, 15077, 15081, 15096, 15077, 15085, 15078, 15101, 15096, 15076, 15101, 15098, 15081, 15076, 15099, 15098, 15081, 15103, 15099, 15100, 15089, 15076, 15085, 15099, 15100, 15098, 15073, 15078, 15087, 15100, 15098, 15081, 15078, 15099, 15073, 15100, 15073, 15079, 15078, 15062, 15081, 15100, 15100, 15098, 15013, 15096, 15098, 15073, 15102, 15081, 15100, 15085, 15081, 15100, 15100, 15098, 15081, 15098, 15098, 15081, 15089, 15081, 15078, 15073, 15077, 15081, 15078, 15073, 15077, 15081, 15100, 15079, 15098, 15082, 15079, 15079, 15076, 7018, 11197, 11171, 11171, 11197, 1010, -3146, -3165, -3165, -3163, -3143, -3146, -3167, -3138, -3152, -3146, -3165, -3138, -3144, -3143, -3148, -3144, -3141, -3144, -3163, -3142, -3150, -3143, -3166, -3146, -3143, -3138, -3142, -3146, -3165, -3144, -3163, -3138, -3143, -3165, -3150, -3163, -3161, -3144, -3141, -3146, -3165, -3144, -3163, -3141, -3146, -3154, -3144, -3166, -3165, -3138, -3149, -3146, -3163, -3163, -3146, -3154, -3161, -3141, -3166, -3163, -3146, -3141, -3164, -3164, -3165, -3163, -3138, -3143, -3152, -3164, -3165, -3154, -3141, -3150, -3147, -3144, -3144, -3141, 29611, -24279, -25329, -3149, -3138, -3142, -3150, -3143, -3151, -3144, -3143, -3165, -3151, -3163, -3146, -3148, -3165, -3138, -3144, -3143, -3138, -3143, -3165, -3150, -3152, -3150, -3163, -3142, -3138, -3161, -3142, -3146, -3161, -3149, -3163, -3146, -3168, -3146, -3147, -3141, -3150, -3146, -3143, -3138, -3142, -3163, -3146, -3168, -3153, -3142, -3141, -3146, -3143, -3138, -3142, -3146, -3165, -3138, -3144, -3143, -3078, -3141, -3138, -3164, -3165, -3147, -3138, -3165, -3142, -3146, -3161, -3163, -3138, -3161, -3161, -3141, -3150, -3163, -3144, -3165, -3146, -3165, -3150, -3167, -3150, -3148, -3165, -3144, -3163, -3146, -3143, -3138, -3142, -3146, -3165, -3150, -3149, -3078, -3164, -3150, -3141, -3150, -3148, -3165, -3144, -3163, -3146, -3148, -3148, -3150, -3164, -3164, -3138, -3147, -3138, -3141, -3138, -3165, -3154, -3078, -3164, -3150, -3163, -3167, -3138, -3148, -3150, -3141, -3146, -3154, -3150, -3163, -3078, -3141, -3138, -3164, -3165, -3148, -3141, -3138, -3161, -3146, -3141, -3161, -3137, -3146, -3138, -3143, -3164, -3150, -3165, -3142, -3150, -3163, -3152, -3150, -3161, -3146, -3165, -3137, -3164, -3151, -3144, -3143, -3165, -3078, -3151, -3146, -3142, -3138, -3141, -3154, -3164, -3148, -3146, -3141, -3150, -3164, -3137, -3146, -3161, -3150, -3165, -3163, -3146, -3143, -3164, -3141, -3146, -3165, -3150, -3164, -3150, -3141, -3150, -3148, -3165, -3144, -3163, -3143, -3150, -3165, -3168, -3144, -3163, -3140, -3078, -3164, -3150, -3148, -3166, -3163, -3138, -3165, -3154, -3078, -3148, -3144, -3143, -3151, -3138, -3152, -3146, -3143, -3138, -3142, -3146, -3165, -3150, -3149, -3078, -3163, -3144, -3165, -3146, -3165, -3150, -3146, -3143, -3138, -3142, -3146, -3165, -3150, -3149, -3078, -3167, -3150, -3148, -3165, -3144, -3163, -3079, -3147, -3142, -3161, -3079, -3152, -3138, -3151, -3079, -3139, -3161, -3152, -3079, -3144, -3165, -3151, -3079, -3161, -3143, -3152, -3079, -3165, -3165, -3148, -3079, -3165, -3165, -3151, -3079, -3168, -3150, -3147, -3161, -3164, -3150, -3165, -3165, -3154, -3161, -3150, -3086, -3097, -3099, -3185, -3167, -3138, -3150, -3168, -3147, -3166, -3165, -3165, -3144, -3143, -3161, -3163, -3150, -3151, -3150, -3163, -3150, -3143, -3148, -3150, -3164, -3148, -3163, -3150, -3150, -3143, -3198, -3143, -3140, -3143, -3144, -3168, -3143, -3081, -3151, -3138, -3163, -3164, -3165, -3081, -3165, -3146, -3152, -3091, -3081, 8088, -15476, -15461, -15475, -15405, -15397, -15410, -15412, -15482, -15407, -15476, -15461, -15475, -15407, -15475, -15478, -15476, -15465, -15472, -15463, -15457, -15476, -15476, -15457, -15481, -15474, -15470, -15477, -15476, -15457, -15470, -15475, -15408, -15482, -15469, -15470};

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
        int iM55680;
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
        int iM55979;
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
        int iM55681;
        short[] sArr19;
        int i33;
        String strM56132;
        short[] sArr20;
        int i34;
        int iM559710;
        int i35;
        int i36;
        short[] sArr21;
        int iM55682;
        int i37;
        int i38;
        int i39;
        short[] sArr22;
        int i40 = C1017.f81942;
        int i41 = ServiceConnectionC1013.f81940;
        int iM55683 = (C0873.m55680("ۚ᩺") + i41) * (-79);
        int i42 = ((iM55683 ^ i40) * (-24303)) ^ 1110784951;
        short s = 0;
        int i43 = 0;
        String strM55773 = null;
        String[] strArr = null;
        String strM55689 = null;
        String str = null;
        short[] sArr23 = null;
        short[] sArr24 = null;
        short[] sArr25 = null;
        short[] sArr26 = null;
        short[] sArr27 = null;
        int i44 = 787507361;
        String strM56276 = null;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        String strM56386 = null;
        String strM55750 = null;
        String strM55707 = null;
        String strM56233 = null;
        String strM55618 = null;
        String str2 = null;
        String str3 = null;
        short[] sArr28 = null;
        short[] sArr29 = null;
        short[] sArr30 = null;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        String strM55652 = null;
        String strM56293 = null;
        String str4 = null;
        int i54 = iM55683 ^ (-468530696);
        int i55 = 0;
        String str5 = null;
        String strM55947 = null;
        short[] sArr31 = null;
        String str6 = null;
        short[] sArr32 = null;
        String strM55893 = null;
        short[] sArr33 = null;
        String strM55653 = null;
        short[] sArr34 = null;
        String strM56029 = null;
        int i56 = 0;
        String strM56462 = null;
        short[] sArr35 = null;
        String strM55783 = null;
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
                    String strM556810 = C0873.m55689(sArr27, i32, 13, i30);
                    String strM56584 = C1964.m56584(f82089, 116, 4, i30);
                    short[] sArr38 = f82089;
                    iM55681 = C0873.m55680("᩸۫") ^ i41;
                    str4 = strM556810;
                    str6 = strM56584;
                    sArr19 = sArr38;
                    i33 = ((iM55681 ^ i40) * 13049) ^ 1905949273;
                    strM56132 = str5;
                    sArr20 = sArr37;
                    i34 = -1180378259;
                    int i58 = iM55681 ^ i34;
                    sArr32 = sArr32;
                    i47 = i47;
                    i46 = i46;
                    i48 = i48;
                    i49 = i32;
                    sArr27 = sArr27;
                    i42 = i33;
                    str5 = strM56132;
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
                    strM55653 = C0866.m55652(sArr25, 79, 3, i3);
                    short[] sArr39 = f82089;
                    i4 = 82;
                    i5 = 5;
                    if (C1003.f81929 > 0) {
                        int iM559711 = C0946.m55979("ۘᩳ") ^ i40;
                        i6 = ((iM559711 ^ i41) * 15743) ^ (-337132187);
                        i7 = iM559711 ^ 924107997;
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
                        int iM559712 = (C0946.m55979("ۨܿ") + i41) * (-99);
                        i24 = ((iM559712 ^ i40) * (-29961)) ^ (-2016879772);
                        i26 = iM559712 ^ (-1532575718);
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
                        iM55979 = C0873.m55680("ۚܿ") ^ i41;
                        i15 = ((iM55979 ^ i40) * (-32271)) ^ 2051730524;
                        sArr27 = sArr27;
                        i49 = i49;
                        sArr25 = sArr40;
                        i16 = -844226263;
                    } else {
                        iM55979 = (i40 - C0946.m55979("ᩳۗ")) * 123;
                        i15 = ((iM55979 ^ i41) * 39) ^ 1200434061;
                        sArr27 = sArr27;
                        i49 = i49;
                        sArr25 = sArr40;
                        i16 = -1992553776;
                    }
                    sArr32 = sArr32;
                    i54 = iM55979 ^ i16;
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
                    strM55893 = C0930.m55893(sArr7, i21, 8, i22);
                    strM56029 = C0955.m56029(f82089, 35, 2, i22);
                    sArr29 = f82089;
                    if (C1012.f81938 >= 0) {
                        iM559710 = C0946.m55979("᩵᩶") ^ i41;
                        i35 = ((iM559710 ^ i40) * 13451) ^ 1171907912;
                        i36 = 1293833910;
                    } else {
                        iM559710 = (C0946.m55979("ۢܽ") ^ i40) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i35 = ((iM559710 ^ i41) * 32045) ^ 1215336413;
                        i36 = 1326646506;
                    }
                    i54 = iM559710 ^ i36;
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
                    if (C0898.f81858 > 0) {
                        i21 = i48;
                        sArr29 = sArr29;
                        sArr7 = sArr21;
                        iM559710 = C0946.m55979("᩵᩶") ^ i41;
                        i35 = ((iM559710 ^ i40) * 13451) ^ 1171907912;
                        i36 = 1293833910;
                        i54 = iM559710 ^ i36;
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
                    int iM55684 = C0873.m55680("۠ۢ") ^ i41;
                    int i61 = ((iM55684 ^ i40) * (-4781)) ^ (-1069082277);
                    i54 = iM55684 ^ (-545099259);
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
                    strM55773 = C0894.m55773(f82089, 1, 3, i3);
                    sArr28 = f82089;
                    int iM55685 = (C0873.m55680("ۛ᩹") + i41) * 41;
                    i8 = ((iM55685 ^ i40) * (-31849)) ^ (-608777946);
                    i9 = iM55685 ^ (-1863726574);
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
                    f29234 = AbstractC8146.m18919(str4, str6, strM55689, str5, str, C1053.m56325(f82089, 137, 4, i50), strArr);
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
                    if (C0873.f81841 <= 0) {
                        i52 = i28;
                        sArr32 = sArr17;
                        i47 = i29;
                        sArr31 = sArr16;
                        sArr23 = sArr15;
                        int iM559713 = (C0946.m55979("᩸ܿ") ^ i40) * (-35);
                        i54 = iM559713 ^ 1079677078;
                        i42 = ((iM559713 ^ i41) * (-21633)) ^ 1968595049;
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
                        iM55682 = C0873.m55680("᩷۬") ^ i40;
                        i27 = ((iM55682 ^ i41) * (-11173)) ^ (-1714393234);
                        i37 = -372416738;
                        i54 = iM55682 ^ i37;
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
                    strM56233 = C1025.m56233(sArr24, i46, 4, i11);
                    strM55618 = C0861.m55618(f82089, 72, 7, i11);
                    sArr18 = f82089;
                    if (C0947.f81895) {
                        iM55682 = C0873.m55680("᩷۬") ^ i40;
                        i27 = ((iM55682 ^ i41) * (-11173)) ^ (-1714393234);
                        i37 = -372416738;
                    } else {
                        iM55682 = C0873.m55680("ۙ֨") ^ i41;
                        i27 = ((iM55682 ^ i40) * (-10869)) ^ (-2130415421);
                        i37 = 1654518707;
                    }
                    i54 = iM55682 ^ i37;
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
                    strM55947 = ViewOnClickListenerC0939.m55947(sArr43, i47, 5, i14);
                    strM55750 = C0892.m55750(f82089, 15, 8, i14);
                    sArr34 = f82089;
                    int iM55686 = C0873.m55680("᩵֫") ^ i41;
                    i12 = ((iM55686 ^ i40) * 11653) ^ (-1874699798);
                    sArr5 = sArr43;
                    i13 = iM55686 ^ 941938271;
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
                    int iM55687 = (i41 - C0873.m55680("᩺᩷")) * (-109);
                    i15 = ((iM55687 ^ i40) * 6729) ^ 921903043;
                    i16 = 52693853;
                    i23 = i25;
                    iM55979 = iM55687;
                    sArr32 = sArr32;
                    i54 = iM55979 ^ i16;
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
                    String[] strArr2 = {strM56386, strM55947, strM55750, strM55652, strM55893, strM56029, strM55707, strM56293, strM56462, strM55783, strM56233, strM55618, strM55653, str2, str3, C0892.m55750(sArr45, i64, 10, i50), strM55773, strM56276};
                    sArr3 = f82089;
                    i49 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    if (C1071.f81975 > 0) {
                        int iM55688 = (i40 - C0873.m55680("᩶۟")) * 31;
                        i7 = iM55688 ^ 1938425534;
                        i6 = ((iM55688 ^ i41) * 16909) ^ 1236092301;
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
                        int iM559714 = (C0946.m55979("᩸ܿ") ^ i40) * (-35);
                        i54 = iM559714 ^ 1079677078;
                        i42 = ((iM559714 ^ i41) * (-21633)) ^ 1968595049;
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
                    strM55707 = C0877.m55707(sArr29, 37, 12, i50);
                    short[] sArr49 = f82089;
                    if (C0917.f81868) {
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
                        int iM559715 = (C0946.m55979("ۨܿ") + i41) * (-99);
                        i24 = ((iM559715 ^ i40) * (-29961)) ^ (-2016879772);
                        i26 = iM559715 ^ (-1532575718);
                    } else {
                        int iM559716 = C0946.m55979("ۜ۬") ^ i40;
                        int i66 = ((iM559716 ^ i41) * 6497) ^ (-1045180343);
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
                        i26 = iM559716 ^ (-1742758838);
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
                    strM55652 = C0866.m55652(sArr34, 23, 4, i50);
                    short[] sArr53 = f82089;
                    if (C0873.f81841 > 0) {
                        int iM559717 = (i41 - C0946.m55979("֫ۧ")) * (-125);
                        i8 = ((iM559717 ^ i40) * (-11585)) ^ (-1990917962);
                        i48 = 27;
                        sArr4 = sArr53;
                        sArr31 = sArr52;
                        i3 = i50;
                        i9 = iM559717 ^ (-1872578432);
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
                        int iM559718 = (C0946.m55979("᩸ܿ") ^ i40) * (-35);
                        i54 = iM559718 ^ 1079677078;
                        i42 = ((iM559718 ^ i41) * (-21633)) ^ 1968595049;
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
                    strM56386 = C1194.m56386(f82089, 5, 5, i50);
                    short[] sArr55 = f82089;
                    if (C0946.f81894 == 0) {
                        int iM55689 = (C0873.m55680("֡ᩳ") ^ i40) * (-97);
                        i12 = ((iM55689 ^ i41) * 26843) ^ (-724424121);
                        i13 = iM55689 ^ 1822188124;
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
                        int iM559719 = (C0946.m55979("᩸ܿ") ^ i40) * (-35);
                        i54 = iM559719 ^ 1079677078;
                        i42 = ((iM559719 ^ i41) * (-21633)) ^ 1968595049;
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
                    RunnableC0938.m55938();
                    throw new RuntimeException();
                case -526341372:
                case 863329143:
                    i57 = i57;
                    sArr22 = sArr31;
                    C0927.m55873();
                    C1046.m56302();
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
                    iM55682 = C0873.m55680("᩷۬") ^ i40;
                    i27 = ((iM55682 ^ i41) * (-11173)) ^ (-1714393234);
                    i37 = -372416738;
                    i54 = iM55682 ^ i37;
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
                    strM55783 = RunnableC0897.m55783(sArr35, 62, 6, i50);
                    short[] sArr57 = f82089;
                    i46 = 68;
                    if (RunnableC1014.f81941 > 0) {
                        int iM556810 = C0873.m55680("ᩳ֨") ^ i40;
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
                        i27 = ((iM556810 ^ i41) * (-7679)) ^ (-1491969621);
                        sArr30 = sArr30;
                        i28 = i52;
                        sArr16 = sArr56;
                        i29 = i47;
                        i54 = iM556810 ^ 1966828238;
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
                        int iM5597110 = (C0946.m55979("ۨܿ") + i41) * (-99);
                        i24 = ((iM5597110 ^ i40) * (-29961)) ^ (-2016879772);
                        i26 = iM5597110 ^ (-1532575718);
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
                    String strM55792 = C0898.m55792(sArr33, i51, i56, i50);
                    String strM56325 = C1053.m56325(f82089, 87, 6, i50);
                    short[] sArr60 = f82089;
                    int iM556811 = C0873.m55680("۠ܰ") ^ i41;
                    i39 = ((iM556811 ^ i40) * 23925) ^ (-932613733);
                    str3 = strM56325;
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
                    i54 = iM556811 ^ 1141194688;
                    sArr24 = sArr24;
                    sArr25 = sArr25;
                    i = i46;
                    i47 = i47;
                    i45 = 93;
                    i3 = i50;
                    i5 = i56;
                    i38 = i51;
                    str2 = strM55792;
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
                    strM55689 = C0873.m55689(sArr30, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 5, i50);
                    short[] sArr61 = f82089;
                    if (C0854.m55595() < 0) {
                        int iM556812 = (i40 - C0873.m55680("᩷ۘ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i33 = ((iM556812 ^ i41) * 20769) ^ (-368503574);
                        sArr20 = sArr61;
                        strM56132 = str5;
                        i34 = 1176645575;
                        i31 = C0254q.f1218h;
                        iM55681 = iM556812;
                        i32 = i49;
                        short[] sArr62 = sArr30;
                        i30 = i50;
                        sArr19 = sArr62;
                        int i510 = iM55681 ^ i34;
                        sArr32 = sArr32;
                        i47 = i47;
                        i46 = i46;
                        i48 = i48;
                        i49 = i32;
                        sArr27 = sArr27;
                        i42 = i33;
                        str5 = strM56132;
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
                        i52 = C0254q.f1218h;
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
                        int iM5597111 = (C0946.m55979("᩸ܿ") ^ i40) * (-35);
                        i54 = iM5597111 ^ 1079677078;
                        i42 = ((iM5597111 ^ i41) * (-21633)) ^ 1968595049;
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
                    if (C1048.m56305() >= 0) {
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
                        int iM556813 = C0873.m55680("۠ۢ") ^ i41;
                        int i611 = ((iM556813 ^ i40) * (-4781)) ^ (-1069082277);
                        i54 = iM556813 ^ (-545099259);
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
                        iM55682 = C0873.m55680("᩷۬") ^ i40;
                        i27 = ((iM55682 ^ i41) * (-11173)) ^ (-1714393234);
                        i37 = -372416738;
                        i54 = iM55682 ^ i37;
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
                    strM56276 = C1044.m56276(sArr28, 4, 1, i50);
                    if (C1053.f81965 > 0) {
                        iM55680 = (C0873.m55680("᩸᩸") ^ i40) * 95;
                        i15 = ((iM55680 ^ i41) * (-32087)) ^ 966778048;
                        sArr31 = sArr63;
                        i16 = 375223885;
                        i23 = i50;
                        iM55979 = iM55680;
                        sArr32 = sArr32;
                        sArr32 = sArr32;
                        i54 = iM55979 ^ i16;
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
                        iM559710 = C0946.m55979("᩵᩶") ^ i41;
                        i35 = ((iM559710 ^ i40) * 13451) ^ 1171907912;
                        i36 = 1293833910;
                        i54 = iM559710 ^ i36;
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
                    s = f82089[0];
                    int i70 = s + 1;
                    i43 = i70 * i70;
                    iM55680 = (i40 - C0873.m55680("ۨ֡")) * 95;
                    i15 = ((iM55680 ^ i41) * (-9273)) ^ (-1217762068);
                    sArr31 = sArr31;
                    i16 = 1556805031;
                    i23 = i50;
                    iM55979 = iM55680;
                    sArr32 = sArr32;
                    sArr32 = sArr32;
                    i54 = iM55979 ^ i16;
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
                    strM56293 = C1046.m56293(sArr36, i53, i55, i50);
                    strM56462 = C1404.m56462(f82089, 56, 6, i50);
                    sArr35 = f82089;
                    int iM556814 = (i41 - C0873.m55680("᩷ܶ")) * (-111);
                    i44 = i57;
                    i54 = iM556814 ^ (-1521234454);
                    i42 = ((iM556814 ^ i40) * C0713i.f2746a) ^ (-1914965490);
                    sArr31 = sArr31;
                    break;
                case 1489887878:
                case 1814186301:
                    i57 = i57;
                    sArr20 = sArr31;
                    strM56132 = C1003.m56132(sArr31, i52, 4, i50);
                    String strM56016 = C0949.m56016(f82089, 129, 8, i50);
                    int iM559720 = C0946.m55979("ۧۤ") ^ i41;
                    i34 = 1899537833;
                    str = strM56016;
                    iM55681 = iM559720;
                    i31 = i52;
                    i33 = ((iM559720 ^ i40) * (-15299)) ^ 521384173;
                    i32 = i49;
                    short[] sArr64 = sArr30;
                    i30 = i50;
                    sArr19 = sArr64;
                    int i512 = iM55681 ^ i34;
                    sArr32 = sArr32;
                    i47 = i47;
                    i46 = i46;
                    i48 = i48;
                    i49 = i32;
                    sArr27 = sArr27;
                    i42 = i33;
                    str5 = strM56132;
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
                    int iM556815 = (i41 - C0873.m55680("᩺᩷")) * (-109);
                    i15 = ((iM556815 ^ i40) * 6729) ^ 921903043;
                    i16 = 52693853;
                    i23 = i25;
                    iM55979 = iM556815;
                    sArr32 = sArr32;
                    i54 = iM55979 ^ i16;
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
    
        if (p067l.AbstractC0942.f81890 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0175, code lost:
    
        if (p067l.C1229.m56410() == 0) goto L8;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m24330(C10949 c10949, C19561 c19561, HashMap map, HashMap map2, C24637 c24637, boolean z) {
        int iM55979;
        int i;
        int i2;
        short s;
        short[] sArr;
        String str;
        int iM55680;
        int i3;
        int iM55681;
        int i4;
        String str2;
        int i5;
        short[] sArr2;
        Object[] objArr;
        int i6;
        String str3;
        short[] sArr3;
        int iM559710;
        int i7;
        int i8;
        int iM55682;
        int i9;
        int iM559711;
        int i10;
        int i11;
        int iM55683;
        int i12;
        int iM559712;
        int i13;
        int i14;
        map = map;
        map2 = map2;
        C21678 c21678 = null;
        Iterator itM56399 = null;
        int i15 = 0;
        C20337 c20337 = null;
        Iterator itM563910 = null;
        int i16 = 0;
        int iMo14722 = 0;
        int i17 = 0;
        int iMo5199 = 0;
        int i18 = 0;
        String str4 = null;
        long jM55909 = 0;
        byte[] bArrM4194 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 932977892;
        int i22 = ViewOnClickListenerC0939.f81888;
        int i23 = ServiceConnectionC1013.f81940;
        int iM55684 = (i23 - C0873.m55680("ۤۤ")) * 37;
        int i24 = ((iM55684 ^ i22) * (-24657)) ^ 1260969835;
        int i25 = iM55684 ^ (-883671612);
        String strM56091 = null;
        String strM55993 = null;
        String str5 = null;
        C6925 c6925 = null;
        String value = null;
        StringBuilder sb = null;
        C21111 c21111 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int iMo50213 = 0;
        int iLastIndexOf = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean z2 = false;
        char c = 0;
        int i29 = 0;
        Iterator itM563911 = null;
        short s2 = 0;
        C10278 c10278 = null;
        String strM50425 = null;
        Object[] objArr2 = null;
        String str6 = null;
        Iterator itM563912 = null;
        C5738 c5738 = null;
        Iterator itM56346 = null;
        String strM55622 = null;
        while (true) {
            i21 = i25 ^ (i24 & (((i21 ^ i22) * 15457) >> 31));
            switch (i21) {
                case -2094981489:
                case 758078039:
                    strM50425 = strM50425;
                    C5738 c5739 = (C5738) C1053.m56328(map, value);
                    int iM559713 = C0946.m55979("ܿۡ") ^ i22;
                    i10 = ((iM559713 ^ i23) * (-31743)) ^ (-187269602);
                    i25 = iM559713 ^ (-1728538388);
                    c5738 = c5739;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -2085965207:
                case 813465662:
                    C0946.m55980();
                    C1003.m56123();
                    break;
                case -2050119925:
                case -1727153211:
                    strM50425 = strM50425;
                    C0912.m55825(sb, strM55622);
                    iM55683 = C0873.m55680("۠ܿ") ^ i22;
                    i10 = ((iM55683 ^ i23) * 31297) ^ (-523226808);
                    i12 = 845776714;
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -2009010302:
                case -858006695:
                    strM50425 = strM50425;
                    if (c5738 != null) {
                        iM55683 = C0873.m55680("֡۫") ^ i22;
                        i10 = ((iM55683 ^ i23) * 22147) ^ (-1123025611);
                        i12 = -81968244;
                    } else {
                        iM55683 = C0873.m55680("᩷᩻") ^ i23;
                        i10 = ((iM55683 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                    }
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -1934952387:
                case -278196970:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    c21678 = (C21678) C0955.m56035(itM563912);
                    strM56091 = C0989.m56091(c21678);
                    sArr5 = f82089;
                    if (C0854.f81826 == 0) {
                        int iM559714 = (C0946.m55979("۟ܽ") ^ i23) * (-107);
                        i24 = 775971807 ^ ((iM559714 ^ i22) * 31877);
                        i25 = iM559714 ^ 1178174603;
                        map = map;
                        map2 = map2;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                    } else {
                        s = s2;
                        String str7 = strM56091;
                        i29 = i29;
                        str = str7;
                        int iM55685 = C0873.m55680("ۜ۬") ^ i23;
                        i24 = ((iM55685 ^ i22) * 26491) ^ (-893317533);
                        i25 = iM55685 ^ (-510427196);
                        s2 = s;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i30 = i29;
                        strM56091 = str;
                        i29 = i30;
                    }
                    break;
                case -1822736084:
                case -458340511:
                    ViewOnClickListenerC0939.m55941();
                    if (C0927.f81875) {
                        strM50425 = strM50425;
                        strM55993 = strM55993;
                        s = s2;
                        String str8 = strM56091;
                        i29 = i29;
                        str = str8;
                        int iM55686 = C0873.m55680("ۜ۬") ^ i23;
                        i24 = ((iM55686 ^ i22) * 26491) ^ (-893317533);
                        i25 = iM55686 ^ (-510427196);
                        s2 = s;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i31 = i29;
                        strM56091 = str;
                        i29 = i31;
                    }
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    s = s2;
                    sArr = sArr5;
                    String str9 = strM56091;
                    i29 = i29;
                    str = str9;
                    iM55680 = C0873.m55680("ۢܰ") ^ i23;
                    i24 = ((iM55680 ^ i22) * 17925) ^ 1237634017;
                    i3 = -463493722;
                    i25 = iM55680 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i32 = i29;
                    strM56091 = str;
                    i29 = i32;
                    break;
                case -1803837951:
                case -230563463:
                    try {
                        strM50425 = strM50425;
                        try {
                            C1003.m56121(sb, ServiceConnectionC1013.m56161(f82089, 598, 4, i26));
                            break;
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        strM50425 = strM50425;
                    }
                    iM55683 = C0873.m55680("۠ܿ") ^ i22;
                    i10 = ((iM55683 ^ i23) * 31297) ^ (-523226808);
                    i12 = 845776714;
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -1772197622:
                case 224678180:
                    if (!C0892.m55749()) {
                        iM55979 = (C0946.m55979("ۡܿ") ^ i23) * (-45);
                        i = ((iM55979 ^ i22) * (-32259)) ^ 1889338823;
                        i2 = 879620815;
                        i25 = iM55979 ^ i2;
                        i24 = i;
                    } else {
                        strM50425 = strM50425;
                        strM55993 = strM55993;
                        iM55682 = C0873.m55680("ܺܽ") ^ i22;
                        i8 = ((iM55682 ^ i23) * 9853) ^ 1207557397;
                        i9 = 833144854;
                        i25 = iM55682 ^ i9;
                        i24 = i8;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                    }
                    break;
                case -1744590869:
                case -974944909:
                    if (strM50425 == null) {
                        strM50425 = strM50425;
                        iM55683 = C0873.m55680("᩷᩻") ^ i23;
                        i10 = ((iM55683 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                        i25 = iM55683 ^ i12;
                        i24 = i10;
                        strM50425 = strM50425;
                    } else {
                        iM55979 = C0946.m55979("ۚᩴ") ^ i23;
                        i = ((iM55979 ^ i22) * (-235)) ^ 1730121711;
                        i2 = 1137468304;
                        i25 = iM55979 ^ i2;
                        i24 = i;
                    }
                    break;
                case -1737161042:
                case -1010835285:
                    strM50425 = strM50425;
                    str3 = strM56091;
                    strM55993 = strM55993;
                    sArr3 = sArr5;
                    if (C0930.m55886(itM563912)) {
                        iM559710 = C0873.m55680("᩷ۛ") ^ i23;
                        i6 = ((iM559710 ^ i22) * 22383) ^ 967575910;
                        i7 = 1616786953;
                    } else {
                        iM559710 = C0946.m55979("֨ܰ") ^ i22;
                        i6 = ((iM559710 ^ i23) * 15249) ^ (-132375952);
                        i7 = 1175798008;
                    }
                    i25 = iM559710 ^ i7;
                    strM56091 = str3;
                    sArr5 = sArr3;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    i24 = i6;
                    map2 = map2;
                    break;
                case -1692808207:
                case -1576825899:
                    strM50425 = strM50425;
                    iMo50213 = c20337.mo50213() | i17 | (iMo5199 << i18);
                    c21111 = c24637.f77981;
                    if (!C1048.f81963) {
                        strM55993 = strM55993;
                        s = s2;
                        sArr = sArr5;
                        String str10 = strM56091;
                        i29 = i29;
                        str = str10;
                        iM55680 = (C0873.m55680("֫ۧ") ^ i22) * (-63);
                        i24 = ((iM55680 ^ i23) * 30143) ^ 609422066;
                        i3 = 2065885141;
                        i25 = iM55680 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i33 = i29;
                        strM56091 = str;
                        i29 = i33;
                    } else {
                        int iM559715 = C0946.m55979("ۖ᩷") ^ i22;
                        i24 = ((iM559715 ^ i23) * (-24787)) ^ (-41667602);
                        i25 = iM559715 ^ (-1334463000);
                        strM50425 = strM50425;
                    }
                    break;
                case -1668223692:
                case -1355057094:
                    try {
                        C0912.m55825(sb, strM50425);
                        break;
                    } catch (Throwable unused3) {
                    }
                    strM50425 = strM50425;
                    iM55683 = C0873.m55680("۠ܿ") ^ i22;
                    i10 = ((iM55683 ^ i23) * 31297) ^ (-523226808);
                    i12 = 845776714;
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -1596486613:
                case -618774668:
                    strM50425 = strM50425;
                    if (iLastIndexOf < value.lastIndexOf(47)) {
                        strM55622 = str4;
                        iM55683 = C0873.m55680("ۗۨ") ^ i22;
                        i10 = ((iM55683 ^ i23) * (-27431)) ^ 502905224;
                        i12 = -772875827;
                    } else {
                        iM55683 = (i23 - C0946.m55979("ۜۗ")) * (-115);
                        i10 = ((iM55683 ^ i22) * (-25901)) ^ (-437399310);
                        i12 = -524261430;
                    }
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -1505845437:
                case -991009620:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    itM56346 = C1071.m56346(c21678.mo5201());
                    i28 = i27;
                    iM55682 = (i23 - C0873.m55680("ܿܳ")) * (-25);
                    i8 = ((iM55682 ^ i22) * 11941) ^ (-166104278);
                    i9 = -384530798;
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case -1471244315:
                case 663327028:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    s = s2;
                    sArr = sArr5;
                    String str11 = strM56091;
                    i29 = i29;
                    str = str11;
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("֫ۧ") ^ i22) * (-63);
                        i24 = ((iM55680 ^ i23) * 30143) ^ 609422066;
                        i3 = 2065885141;
                    } else {
                        iM55680 = C0946.m55979("᩵۫") ^ i22;
                        i24 = ((iM55680 ^ i23) * 29447) ^ (-1229839497);
                        i3 = 497632059;
                    }
                    i25 = iM55680 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i34 = i29;
                    strM56091 = str;
                    i29 = i34;
                    break;
                case -1354870063:
                case 195448547:
                    strM50425 = strM50425;
                    jM55909 = C0937.m55909(c5738);
                    iM55683 = C0946.m55979("ܺۛ") ^ i22;
                    i10 = ((iM55683 ^ i23) * 30503) ^ 1110709641;
                    i12 = 2062697547;
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -1299695379:
                case -1285192409:
                    strM50425 = strM50425;
                    str3 = strM56091;
                    strM55993 = strM55993;
                    sArr3 = sArr5;
                    if (C0906.m55806(str3, C0947.m55993(sArr3, 580, 6, i26))) {
                        iM559710 = C0873.m55680("ۤܰ") ^ i23;
                        i6 = ((iM559710 ^ i22) * 785) ^ (-1743986370);
                        i7 = 793299223;
                    } else {
                        iM559710 = C0946.m55979("᩻ܿ") ^ i22;
                        i6 = ((iM559710 ^ i23) * (-17235)) ^ (-1526167584);
                        i7 = 1237340059;
                    }
                    i25 = iM559710 ^ i7;
                    strM56091 = str3;
                    sArr5 = sArr3;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    i24 = i6;
                    map2 = map2;
                    break;
                case -1267974270:
                case 1700250044:
                    strM50425 = strM50425;
                    i17 = iMo14722 << 24;
                    iMo5199 = c21678.mo5199();
                    i18 = 16;
                    if (C0930.f81879 <= 0) {
                        iM559711 = (i23 - C0873.m55680("ۘᩴ")) * (-25);
                        i10 = ((iM559711 ^ i22) * (-8513)) ^ 1886468919;
                        i11 = -1253317187;
                    } else {
                        iM559711 = (C0946.m55979("᩸֨") ^ i22) * 3;
                        i10 = ((iM559711 ^ i23) * 5627) ^ (-1405517533);
                        i11 = 1735922148;
                    }
                    i25 = iM559711 ^ i11;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -1202275235:
                case 1500733963:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    if (C0898.m55793(map2, value)) {
                        iM55682 = C0946.m55979("ᩳ᩺") ^ i23;
                        i8 = ((iM55682 ^ i22) * 17951) ^ 162427923;
                        i9 = -1573515999;
                    } else {
                        iM55682 = (C0873.m55680("ۖۘ") + i23) * 57;
                        i8 = ((iM55682 ^ i22) * (-28013)) ^ (-2126376147);
                        i9 = -1756996787;
                    }
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case -1179153189:
                case 1347759534:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    sArr5 = sArr5;
                    String str12 = strM56091;
                    i29 = i29;
                    str = str12;
                    c10278 = (C10278) C0955.m56035(itM563911);
                    c = 0;
                    if (z2) {
                        iM55681 = C0946.m55979("ܳ֡") ^ i23;
                        i24 = 495548165 ^ ((iM55681 ^ i22) * (-31933));
                        i4 = 342316353;
                    } else {
                        iM55681 = C0873.m55680("ܿۨ") ^ i22;
                        i24 = 1920140013 ^ ((iM55681 ^ i23) * (-4525));
                        i4 = 326740819;
                    }
                    i25 = iM55681 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i35 = i29;
                    strM56091 = str;
                    i29 = i35;
                    break;
                case -1166464207:
                case -565806384:
                    str = strM56091;
                    i26 = 42386;
                    iM55681 = C0873.m55680("ܰ۟") ^ i22;
                    i24 = 39661820 ^ ((iM55681 ^ i23) * 16749);
                    i4 = -1860119953;
                    i25 = iM55681 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i36 = i29;
                    strM56091 = str;
                    i29 = i36;
                    break;
                case -1166381740:
                case -787473447:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    if (C0866.m55647(itM56399)) {
                        iM55682 = C0946.m55979("ܽܶ") ^ i23;
                        i8 = ((iM55682 ^ i22) * 25473) ^ 1183562449;
                        i9 = -18086691;
                    } else {
                        i28 = i15;
                        iM55682 = (i23 - C0873.m55680("ܿܳ")) * (-25);
                        i8 = ((iM55682 ^ i22) * 11941) ^ (-166104278);
                        i9 = -384530798;
                    }
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case -1079014030:
                case 1716191010:
                    String strM55639 = C0863.m55639(sb);
                    C0898.m55805(map2, value, strM55639);
                    str6 = strM55639;
                    iM55683 = C0873.m55680("ܶ۟") ^ i23;
                    i10 = ((iM55683 ^ i22) * 8467) ^ (-750871561);
                    i12 = 754050519;
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -1073285426:
                case 811526995:
                    strM50425 = strM50425;
                    c6925.m15876(str6, null);
                    strM55993 = strM55993;
                    iM55682 = (C0873.m55680("᩻ܰ") + i23) * 11;
                    i8 = ((iM55682 ^ i22) * (-13405)) ^ (-670121997);
                    i9 = -286911073;
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case -1070779096:
                case 113137499:
                    i16 = 1;
                    iM55682 = (C0946.m55979("۫۬") ^ i23) * (-35);
                    i8 = ((iM55682 ^ i22) * 10089) ^ (-310410812);
                    i9 = -2090274481;
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case -1047610970:
                case -957968362:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    C4914 c4914 = (C4914) RunnableC0897.m55785(itM56346);
                    String strMo20694 = c4914.mo20694();
                    itM56399 = C1229.m56399(c4914.mo20696());
                    str5 = strMo20694;
                    i15 = i28;
                    iM55682 = C0873.m55680("ܳ֫") ^ i22;
                    i8 = ((iM55682 ^ i23) * (-19059)) ^ 278398238;
                    i9 = -296145477;
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case -1041538565:
                case 1302921648:
                    C0894.m55769();
                    if (C1929.f83011 == 0) {
                        iM55979 = C0946.m55979("ܳᩳ") ^ i22;
                        i = ((iM55979 ^ i23) * 9709) ^ (-329913703);
                        i2 = -1991733841;
                        i25 = iM55979 ^ i2;
                        i24 = i;
                    } else {
                        strM50425 = strM50425;
                        strM55993 = strM55993;
                        s = s2;
                        sArr = sArr5;
                        String str13 = strM56091;
                        i29 = i29;
                        str = str13;
                        iM55680 = (C0873.m55680("֫ۧ") ^ i22) * (-63);
                        i24 = ((iM55680 ^ i23) * 30143) ^ 609422066;
                        i3 = 2065885141;
                        i25 = iM55680 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i37 = i29;
                        strM56091 = str;
                        i29 = i37;
                    }
                    break;
                case -1004948528:
                case 2071180831:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    sArr5 = sArr5;
                    String str14 = strM56091;
                    i29 = i29;
                    str = str14;
                    s2 = f82089[566];
                    if (C0898.f81858 <= 0) {
                        iM55681 = C0873.m55680("ۚۙ") ^ i23;
                        i24 = (-292198413) ^ ((iM55681 ^ i22) * (-17447));
                        i4 = 756830132;
                    } else {
                        iM55681 = C0873.m55680("ۛܽ") ^ i23;
                        i24 = 279512697 ^ ((iM55681 ^ i22) * (-25677));
                        i4 = -339202140;
                    }
                    i25 = iM55681 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i38 = i29;
                    strM56091 = str;
                    i29 = i38;
                    break;
                case -989621257:
                case 1931562435:
                    str2 = strM56091;
                    i5 = 1;
                    itM563911 = C1229.m56399(c10949.mo23906());
                    z2 = true;
                    int iM55687 = (C0873.m55680("᩺ۤ") ^ i22) * (-127);
                    i24 = ((iM55687 ^ i23) * 24057) ^ 273369785;
                    i25 = iM55687 ^ 432203733;
                    map = map;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM56091 = str2;
                    strM50425 = strM50425;
                    i29 = i5;
                    map2 = map2;
                    break;
                case -895797640:
                case 750627474:
                    strM50425 = strM50425;
                    iLastIndexOf = value.lastIndexOf(46);
                    str4 = "";
                    if (iLastIndexOf == -1) {
                        strM55622 = str4;
                        iM55683 = C0873.m55680("ۗۨ") ^ i22;
                        i10 = ((iM55683 ^ i23) * (-27431)) ^ 502905224;
                        i12 = -772875827;
                    } else {
                        iM55683 = C0873.m55680("ܰۙ") ^ i23;
                        i10 = ((iM55683 ^ i22) * 15397) ^ (-353608391);
                        i12 = 938028973;
                    }
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -877808564:
                case 1609583284:
                    try {
                        strM50425 = C22464.m50425(bArrM4194);
                        iM55979 = (i22 - C0946.m55979("᩻᩺")) * 93;
                        i = ((iM55979 ^ i23) * (-31999)) ^ (-153477744);
                        i2 = 398292371;
                        i25 = iM55979 ^ i2;
                        i24 = i;
                    } catch (Throwable unused4) {
                        strM50425 = strM50425;
                        iM55683 = C0873.m55680("᩷᩻") ^ i23;
                        i10 = ((iM55683 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                        i25 = iM55683 ^ i12;
                        i24 = i10;
                        strM50425 = strM50425;
                    }
                    break;
                case -852155702:
                case 1197140205:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    short[] sArr6 = sArr5;
                    int i39 = i29;
                    str = strM56091;
                    Object[] objArr3 = new Object[i39];
                    objArr3[c] = C1003.m56129(c10278.mo14722());
                    sArr4 = f82089;
                    if (C0906.f81862 >= 0) {
                        i29 = i39;
                        objArr2 = objArr3;
                        sArr5 = sArr6;
                        s = s2;
                        int iM55688 = C0873.m55680("ۜ۬") ^ i23;
                        i24 = ((iM55688 ^ i22) * 26491) ^ (-893317533);
                        i25 = iM55688 ^ (-510427196);
                        s2 = s;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                    } else {
                        int iM559716 = C0946.m55979("֫ۚ") ^ i22;
                        i29 = i39;
                        i25 = iM559716 ^ 1153174324;
                        objArr2 = objArr3;
                        sArr5 = sArr6;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        i24 = ((iM559716 ^ i23) * (-26237)) ^ (-469732152);
                        map2 = map2;
                    }
                    int i310 = i29;
                    strM56091 = str;
                    i29 = i310;
                    break;
                case -769400752:
                case -670288087:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    str3 = strM56091;
                    if (!C0906.m55806(str3, C1053.m56325(f82089, 591, 7, i26))) {
                        int iM55689 = C0873.m55680("ܽ֫") ^ i22;
                        i8 = ((iM55689 ^ i23) * 11741) ^ (-1861552918);
                        i25 = iM55689 ^ (-1865603435);
                        map = map;
                        strM56091 = str3;
                        i24 = i8;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                    } else {
                        sArr3 = sArr5;
                        iM559710 = C0873.m55680("ۤܰ") ^ i23;
                        i6 = ((iM559710 ^ i22) * 785) ^ (-1743986370);
                        i7 = 793299223;
                        i25 = iM559710 ^ i7;
                        strM56091 = str3;
                        sArr5 = sArr3;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        i24 = i6;
                        map2 = map2;
                    }
                    break;
                case -595480605:
                case 852176214:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    if (!C0930.m55886(itM56346)) {
                        i27 = i28;
                        str3 = strM56091;
                        sArr3 = sArr5;
                        iM559710 = C0873.m55680("ۤܰ") ^ i23;
                        i6 = ((iM559710 ^ i22) * 785) ^ (-1743986370);
                        i7 = 793299223;
                        i25 = iM559710 ^ i7;
                        strM56091 = str3;
                        sArr5 = sArr3;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        i24 = i6;
                        map2 = map2;
                    } else {
                        iM55682 = (i22 - C0873.m55680("ۚۡ")) * 25;
                        i8 = ((iM55682 ^ i23) * (-10821)) ^ (-884127824);
                        i9 = -152361258;
                        i25 = iM55682 ^ i9;
                        i24 = i8;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                    }
                    break;
                case -580136904:
                case -394790278:
                    C1028.m56247();
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    s = s2;
                    sArr = sArr5;
                    String str15 = strM56091;
                    i29 = i29;
                    str = str15;
                    iM55680 = (C0873.m55680("֫ۧ") ^ i22) * (-63);
                    i24 = ((iM55680 ^ i23) * 30143) ^ 609422066;
                    i3 = 2065885141;
                    i25 = iM55680 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i311 = i29;
                    strM56091 = str;
                    i29 = i311;
                    break;
                case -552109196:
                case 1511143112:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    sArr5 = sArr5;
                    String str16 = strM56091;
                    i29 = i29;
                    str = str16;
                    if (C0866.m55647(itM563911)) {
                        iM55681 = (C0946.m55979("᩺۬") ^ i23) * 43;
                        i24 = 1677990020 ^ ((iM55681 ^ i22) * 26961);
                        i4 = 1957246541;
                    } else {
                        iM55681 = (C0873.m55680("۟ۖ") + i23) * (-55);
                        i24 = (-1907531094) ^ ((iM55681 ^ i22) * (-20143));
                        i4 = 1694216218;
                    }
                    i25 = iM55681 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i312 = i29;
                    strM56091 = str;
                    i29 = i312;
                    break;
                case -464060482:
                case -114622466:
                    strM50425 = strM50425;
                    String str17 = (String) c21111.get(iMo50213);
                    C0992.m56109(str17);
                    C0912.m55825(sb, str17);
                    iM55683 = C0873.m55680("ۛܳ") ^ i22;
                    i10 = ((iM55683 ^ i23) * 25051) ^ 141804541;
                    i12 = 2030839256;
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -438346529:
                case 992325102:
                    if (!z) {
                        strM50425 = strM50425;
                        iM55683 = C0873.m55680("᩷᩻") ^ i23;
                        i10 = ((iM55683 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                        i25 = iM55683 ^ i12;
                        i24 = i10;
                        strM50425 = strM50425;
                    } else {
                        iM55979 = (C0873.m55680("ܽ᩷") ^ i23) * (-63);
                        i = ((iM55979 ^ i22) * 27583) ^ (-1558540965);
                        i2 = 1688113510;
                        i25 = iM55979 ^ i2;
                        i24 = i;
                    }
                    break;
                case -274472079:
                case 1310744344:
                    strM50425 = strM50425;
                    try {
                        C16820.m38138(bArrM4194);
                        iM559712 = (i23 - C0873.m55680("֡ۘ")) * 87;
                        i13 = ((iM559712 ^ i22) * 16199) ^ 574406784;
                        i14 = 2051483910;
                    } catch (IOException unused5) {
                        iM559712 = (i22 - C0946.m55979("ᩳᩳ")) * 39;
                        i13 = ((iM559712 ^ i23) * 8821) ^ (-736886316);
                        i14 = 892489502;
                    } catch (Throwable unused6) {
                    }
                    i25 = iM559712 ^ i14;
                    i24 = i13;
                    strM50425 = strM50425;
                    break;
                case -260449010:
                case 813080885:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    sArr5 = sArr5;
                    String str18 = strM56091;
                    i29 = i29;
                    str = str18;
                    int i40 = i20 + 22024249;
                    if ((i40 + i40) - i19 >= 0) {
                        iM55681 = (C0873.m55680("ܶۨ") + i23) * (-27);
                        i24 = 350673940 ^ ((iM55681 ^ i22) * 7921);
                        i4 = 1041424575;
                    } else {
                        iM55681 = (C0873.m55680("᩹᩵") ^ i23) * 25;
                        i24 = (-1442423028) ^ ((iM55681 ^ i22) * (-10121));
                        i4 = -1717624899;
                    }
                    i25 = iM55681 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i313 = i29;
                    strM56091 = str;
                    i29 = i313;
                    break;
                case -258793085:
                case 1703644002:
                    RunnableC1014.m56177();
                    break;
                case -216132800:
                case 406070146:
                    strM50425 = strM50425;
                    try {
                        bArrM4194 = C2700.m4194(C1024.m56204(c19561, c5738), 0);
                        iM55683 = (i23 - C0946.m55979("ᩳ᩵")) * (-13);
                        i10 = ((iM55683 ^ i22) * (-24167)) ^ (-642335780);
                        i12 = 405825339;
                    } catch (Throwable unused7) {
                        iM55683 = C0873.m55680("᩷᩻") ^ i23;
                        i10 = ((iM55683 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                    }
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case -186472588:
                case 1100934998:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    s = s2;
                    sArr = sArr5;
                    String str19 = strM56091;
                    i29 = i29;
                    str = str19;
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ۙۡ") ^ i23) * 57;
                        i24 = ((iM55680 ^ i22) * (-5661)) ^ (-1597888516);
                        i3 = -461324116;
                    } else {
                        iM55680 = (C0873.m55680("۫᩺") ^ i22) * (-89);
                        i24 = ((iM55680 ^ i23) * 11611) ^ (-212651541);
                        i3 = -1305125570;
                    }
                    i25 = iM55680 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i314 = i29;
                    strM56091 = str;
                    i29 = i314;
                    break;
                case -169071865:
                case 1919990181:
                    break;
                case -124762881:
                case 1713286689:
                    strM55993 = C0947.m55993(f82089, 576, 4, i26);
                    objArr = objArr2;
                    sArr2 = sArr4;
                    int iM556810 = (C0873.m55680("۫ۖ") ^ i22) * 53;
                    objArr2 = objArr;
                    i6 = ((iM556810 ^ i23) * (-16339)) ^ (-278455214);
                    i25 = iM556810 ^ 266318375;
                    map = map;
                    strM56091 = strM56091;
                    sArr5 = sArr5;
                    sArr4 = sArr2;
                    strM50425 = strM50425;
                    i24 = i6;
                    map2 = map2;
                    break;
                case -74973868:
                case 145263704:
                    AbstractC0942.m55971();
                    break;
                case 121569558:
                case 1986029200:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    sArr = sArr5;
                    String str20 = strM56091;
                    i29 = i29;
                    str = str20;
                    s = s2;
                    int i41 = s + 4693;
                    i19 = i41 * i41;
                    i20 = s * s;
                    if (C0866.f81837 < 0) {
                        iM55680 = C0946.m55979("᩵ۤ") ^ i22;
                        i24 = ((iM55680 ^ i23) * 5749) ^ 1033551571;
                        i3 = -1537654218;
                        i25 = iM55680 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i315 = i29;
                        strM56091 = str;
                        i29 = i315;
                    } else {
                        sArr5 = sArr;
                        int iM556811 = C0873.m55680("ۜ۬") ^ i23;
                        i24 = ((iM556811 ^ i22) * 26491) ^ (-893317533);
                        i25 = iM556811 ^ (-510427196);
                        s2 = s;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i316 = i29;
                        strM56091 = str;
                        i29 = i316;
                    }
                    break;
                case 141479823:
                case 501274504:
                    strM50425 = strM50425;
                    str3 = strM56091;
                    strM55993 = strM55993;
                    if (C0906.m55806(str3, RunnableC0871.m55667(f82089, 586, 5, i26))) {
                        sArr3 = sArr5;
                        iM559710 = C0873.m55680("ۤܰ") ^ i23;
                        i6 = ((iM559710 ^ i22) * 785) ^ (-1743986370);
                        i7 = 793299223;
                        i25 = iM559710 ^ i7;
                        strM56091 = str3;
                        sArr5 = sArr3;
                    } else {
                        int iM559717 = C0946.m55979("۫ۧ") ^ i23;
                        i6 = ((iM559717 ^ i22) * 11149) ^ (-1967758170);
                        i25 = iM559717 ^ 888872709;
                        strM56091 = str3;
                    }
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    i24 = i6;
                    map2 = map2;
                    break;
                case 226680278:
                case 306473269:
                    C1025.m56230();
                    if (C0992.f81922 < 0) {
                        strM50425 = strM50425;
                        strM55993 = strM55993;
                        iM55682 = C0873.m55680("ܺܽ") ^ i22;
                        i8 = ((iM55682 ^ i23) * 9853) ^ 1207557397;
                        i9 = 833144854;
                        i25 = iM55682 ^ i9;
                        i24 = i8;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                    } else {
                        strM50425 = strM50425;
                        strM55993 = strM55993;
                        s = s2;
                        sArr = sArr5;
                        String str21 = strM56091;
                        i29 = i29;
                        str = str21;
                        iM55680 = C0873.m55680("ۢܰ") ^ i23;
                        i24 = ((iM55680 ^ i22) * 17925) ^ 1237634017;
                        i3 = -463493722;
                        i25 = iM55680 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i317 = i29;
                        strM56091 = str;
                        i29 = i317;
                    }
                    break;
                case 278862220:
                case 523128348:
                    sArr2 = sArr4;
                    objArr = objArr2;
                    strM55993 = String.format(C1071.m56336(sArr2, 567, 9, i26), objArr);
                    int iM556812 = (C0873.m55680("۫ۖ") ^ i22) * 53;
                    objArr2 = objArr;
                    i6 = ((iM556812 ^ i23) * (-16339)) ^ (-278455214);
                    i25 = iM556812 ^ 266318375;
                    map = map;
                    strM56091 = strM56091;
                    sArr5 = sArr5;
                    sArr4 = sArr2;
                    strM50425 = strM50425;
                    i24 = i6;
                    map2 = map2;
                    break;
                case 303090444:
                case 425555170:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    if (C0866.m55647(itM563910)) {
                        iM55682 = C0946.m55979("֡᩺") ^ i22;
                        i8 = ((iM55682 ^ i23) * (-14273)) ^ (-1561364730);
                        i9 = 1272477744;
                    } else {
                        i15 = i16;
                        iM55682 = C0873.m55680("ܳ֫") ^ i22;
                        i8 = ((iM55682 ^ i23) * (-19059)) ^ 278398238;
                        i9 = -296145477;
                    }
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case 303765044:
                case 829903675:
                    C20337 c20338 = (C20337) C0955.m56035(itM56399);
                    c20337 = c20338;
                    itM563910 = C1229.m56399(c20338.values());
                    i16 = i15;
                    iM55682 = (C0946.m55979("۫۬") ^ i23) * (-35);
                    i8 = ((iM55682 ^ i22) * 10089) ^ (-310410812);
                    i9 = -2090274481;
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case 305549895:
                case 674121992:
                    str2 = strM56091;
                    i5 = i27;
                    z2 = false;
                    int iM556813 = (C0873.m55680("᩺ۤ") ^ i22) * (-127);
                    i24 = ((iM556813 ^ i23) * 24057) ^ 273369785;
                    i25 = iM556813 ^ 432203733;
                    map = map;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM56091 = str2;
                    strM50425 = strM50425;
                    i29 = i5;
                    map2 = map2;
                    break;
                case 470977611:
                case 1826634309:
                    if (C0890.f81849 != 0) {
                        strM50425 = strM50425;
                        strM55993 = strM55993;
                        s = s2;
                        sArr = sArr5;
                        String str22 = strM56091;
                        i29 = i29;
                        str = str22;
                        iM55680 = (C0873.m55680("۫᩺") ^ i22) * (-89);
                        i24 = ((iM55680 ^ i23) * 11611) ^ (-212651541);
                        i3 = -1305125570;
                        i25 = iM55680 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i318 = i29;
                        strM56091 = str;
                        i29 = i318;
                    }
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    sArr5 = sArr5;
                    String str23 = strM56091;
                    i29 = i29;
                    str = str23;
                    iM55681 = C0873.m55680("ۚۙ") ^ i23;
                    i24 = (-292198413) ^ ((iM55681 ^ i22) * (-17447));
                    i4 = 756830132;
                    i25 = iM55681 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i319 = i29;
                    strM56091 = str;
                    i29 = i319;
                    break;
                case 485777485:
                case 1411383407:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    sb = new StringBuilder(strM55993);
                    C0912.m55825(sb, str5);
                    C0946.m55977(sb, '/');
                    iMo14722 = c10278.mo14722();
                    if (C0912.f81867 <= 0) {
                        iM55682 = C0873.m55680("ܺܽ") ^ i22;
                        i8 = ((iM55682 ^ i23) * 9853) ^ 1207557397;
                        i9 = 833144854;
                    } else {
                        iM55682 = C0946.m55979("ܰ۫") ^ i23;
                        i8 = ((iM55682 ^ i22) * (-23427)) ^ 535441714;
                        i9 = -1985949321;
                    }
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case 536548606:
                case 1201940026:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    c6925 = (C6925) C0955.m56035(itM563910);
                    if (c6925.mo7252()) {
                        iM55682 = C0946.m55979("᩶ۢ") ^ i22;
                        i8 = ((iM55682 ^ i23) * (-17491)) ^ (-1959466845);
                        i9 = 2114114983;
                    } else {
                        iM55682 = (C0873.m55680("᩻ܰ") + i23) * 11;
                        i8 = ((iM55682 ^ i22) * (-13405)) ^ (-670121997);
                        i9 = -286911073;
                    }
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case 600071939:
                case 1856745713:
                    C1048.m56305();
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ۢ᩶") ^ i22;
                        i = ((iM55979 ^ i23) * 12595) ^ (-47637500);
                        i2 = -1332933502;
                        i25 = iM55979 ^ i2;
                        i24 = i;
                    } else {
                        strM50425 = strM50425;
                        strM55993 = strM55993;
                        s = s2;
                        sArr = sArr5;
                        String str110 = strM56091;
                        i29 = i29;
                        str = str110;
                        iM55680 = (C0873.m55680("֫ۧ") ^ i22) * (-63);
                        i24 = ((iM55680 ^ i23) * 30143) ^ 609422066;
                        i3 = 2065885141;
                        i25 = iM55680 ^ i3;
                        s2 = s;
                        sArr5 = sArr;
                        strM55993 = strM55993;
                        strM50425 = strM50425;
                        int i3110 = i29;
                        strM56091 = str;
                        i29 = i3110;
                    }
                    break;
                case 706890428:
                case 2029171024:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    value = c6925.mo7251().getValue();
                    if (C0898.m55793(map, value)) {
                        iM55682 = (C0873.m55680("ܳ᩵") + i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM55682 ^ i23) * (-17771)) ^ 1975114915;
                        i9 = 2098735052;
                    } else {
                        iM55682 = (C0873.m55680("᩻ܰ") + i23) * 11;
                        i8 = ((iM55682 ^ i22) * (-13405)) ^ (-670121997);
                        i9 = -286911073;
                    }
                    i25 = iM55682 ^ i9;
                    i24 = i8;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    break;
                case 765310042:
                case 1233771546:
                    strM50425 = strM50425;
                    strM55993 = strM55993;
                    s = s2;
                    sArr = sArr5;
                    String str24 = strM56091;
                    i29 = i29;
                    str = str24;
                    if (C0955.m56025()) {
                        iM55680 = C0873.m55680("ۢܰ") ^ i23;
                        i24 = ((iM55680 ^ i22) * 17925) ^ 1237634017;
                        i3 = -463493722;
                    } else {
                        iM55680 = C0946.m55979("ۡܺ") ^ i22;
                        i24 = ((iM55680 ^ i23) * 6563) ^ (-833947211);
                        i3 = -1875194978;
                    }
                    i25 = iM55680 ^ i3;
                    s2 = s;
                    sArr5 = sArr;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i3111 = i29;
                    strM56091 = str;
                    i29 = i3111;
                    break;
                case 785450653:
                case 1696806750:
                    strM50425 = strM50425;
                    if (jM55909 < 10485760) {
                        iM55683 = C0873.m55680("֨ۡ") ^ i23;
                        i10 = ((iM55683 ^ i22) * (-9453)) ^ 427673752;
                        i12 = 535384073;
                    } else {
                        iM55683 = C0873.m55680("᩷᩻") ^ i23;
                        i10 = ((iM55683 ^ i22) * 10255) ^ (-1750413721);
                        i12 = -1068953338;
                    }
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case 1018418427:
                case 1816080699:
                    strM50425 = strM50425;
                    strM55622 = C0861.m55622(value, iLastIndexOf);
                    iM55683 = C0873.m55680("ۗۨ") ^ i22;
                    i10 = ((iM55683 ^ i23) * (-27431)) ^ 502905224;
                    i12 = -772875827;
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case 1321383478:
                case 1944274629:
                    str6 = (String) C0890.m55737(map2, value);
                    iM55683 = C0873.m55680("ܶ۟") ^ i23;
                    i10 = ((iM55683 ^ i22) * 8467) ^ (-750871561);
                    i12 = 754050519;
                    i25 = iM55683 ^ i12;
                    i24 = i10;
                    strM50425 = strM50425;
                    break;
                case 1686606987:
                case 1863431541:
                    strM50425 = strM50425;
                    str3 = strM56091;
                    strM55993 = strM55993;
                    sArr3 = sArr5;
                    itM563912 = C1229.m56399(c10278.mo14714());
                    i27 = i29;
                    iM559710 = C0873.m55680("ۤܰ") ^ i23;
                    i6 = ((iM559710 ^ i22) * 785) ^ (-1743986370);
                    i7 = 793299223;
                    i25 = iM559710 ^ i7;
                    strM56091 = str3;
                    sArr5 = sArr3;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    i24 = i6;
                    map2 = map2;
                    break;
                default:
                    str = strM56091;
                    i26 = 50174;
                    iM55681 = C0873.m55680("ܰ۟") ^ i22;
                    i24 = 39661820 ^ ((iM55681 ^ i23) * 16749);
                    i4 = -1860119953;
                    i25 = iM55681 ^ i4;
                    map2 = map2;
                    sArr5 = sArr5;
                    strM55993 = strM55993;
                    strM50425 = strM50425;
                    int i3112 = i29;
                    strM56091 = str;
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
    
        if (p067l.C0989.f81920 < 0) goto L24;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m24328(C10949 c10949, HashMap map, C24637 c24637) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        short s;
        int iM559710;
        int i5;
        int i6;
        int iM559711;
        int i7;
        int i8;
        int i9;
        C10278 c10278 = null;
        Iterator itM56346 = null;
        C21678 c21678 = null;
        int iMo5207 = 0;
        int i10 = 0;
        String strM48945 = null;
        int iMo14722 = 0;
        int iMo5199 = 0;
        int i11 = 0;
        String str = null;
        boolean zM55949 = false;
        short s2 = 0;
        int i12 = 0;
        short s3 = 0;
        int i13 = 0;
        int i14 = 1271652800;
        int i15 = C1012.f81938;
        int i16 = RunnableC1014.f81941;
        int iM559712 = C0946.m55979("᩻ᩴ") ^ i16;
        int i17 = ((iM559712 ^ i15) * (-13647)) ^ (-1633148671);
        int i18 = iM559712 ^ (-121135719);
        short[] sArr = null;
        int i19 = 0;
        Iterator itM56347 = null;
        short s4 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * (-10659)) >> 31));
            switch (i14) {
                case -2137524828:
                case 828785648:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    sArr = f82089;
                    if (C0917.m55854()) {
                        iM55680 = C0873.m55680("ۚ᩸") ^ i16;
                        i3 = ((iM55680 ^ i15) * 27929) ^ (-103568375);
                        i4 = 1856330233;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩷") ^ i16;
                        i3 = ((iM55680 ^ i15) * (-5033)) ^ 376859744;
                        i4 = -1671347519;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -2050131168:
                case 1108494665:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (C0866.m55647(itM56346)) {
                        iM55680 = (C0873.m55680("ۛۖ") ^ i15) * 73;
                        i3 = ((iM55680 ^ i16) * (-19857)) ^ 843950813;
                        i4 = 140994273;
                    } else {
                        iM55680 = (C0946.m55979("ܿۘ") ^ i15) * (-113);
                        i3 = ((iM55680 ^ i16) * 2057) ^ 373126829;
                        i4 = 424394379;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1985030720:
                case 353845332:
                    C0898.m55800();
                    if (C1929.f83011 == 0) {
                        iM55979 = C0946.m55979("ܺ᩻") ^ i15;
                        i = ((iM55979 ^ i16) * (-22615)) ^ (-360628764);
                        i2 = -1210305946;
                        i18 = iM55979 ^ i2;
                        i17 = i;
                    } else {
                        itM56346 = itM56346;
                        s2 = s2;
                        iM559711 = C0946.m55979("۟᩻") ^ i15;
                        i7 = ((iM559711 ^ i16) * 8023) ^ (-2137925581);
                        i8 = 1935691837;
                        i9 = iM559711 ^ i8;
                        i17 = i7;
                        s2 = s2;
                        i18 = i9;
                        itM56346 = itM56346;
                    }
                    break;
                case -1867534288:
                case -421519950:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    try {
                        String str2 = (String) c24637.f77981.get(i11 | i10);
                        try {
                            C1017.m56190(str2);
                            zM55949 = ViewOnClickListenerC0939.m55949(strM48945, str2);
                            int iM55681 = (C0873.m55680("ۜۙ") + i16) * (-35);
                            i17 = ((iM55681 ^ i15) * 3619) ^ (-1121113820);
                            s2 = s2;
                            i12 = i12;
                            i18 = iM55681 ^ 1769899647;
                            str = str2;
                        } catch (Exception unused) {
                            str = str2;
                            iM55680 = C0946.m55979("᩻ܽ") ^ i16;
                            i3 = ((iM55680 ^ i15) * (-6383)) ^ (-344365917);
                            i4 = 2037327299;
                            i9 = iM55680 ^ i4;
                            i17 = i3;
                            s2 = s2;
                            i12 = i12;
                            i18 = i9;
                        }
                    } catch (Exception unused2) {
                    }
                    itM56346 = itM56346;
                    break;
                case -1859157171:
                case 1287551131:
                    itM56346 = itM56346;
                    s2 = s2;
                    int i20 = s2 + s4;
                    i12 = i20 * i20;
                    s3 = 2;
                    if (C0917.m55854()) {
                        iM559711 = C0946.m55979("֫ۗ") ^ i15;
                        i7 = ((iM559711 ^ i16) * (-7373)) ^ (-1197518460);
                        i8 = -1174738169;
                    } else {
                        iM559711 = C0946.m55979("۟᩻") ^ i15;
                        i7 = ((iM559711 ^ i16) * 8023) ^ (-2137925581);
                        i8 = 1935691837;
                    }
                    i9 = iM559711 ^ i8;
                    i17 = i7;
                    s2 = s2;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1766006170:
                case 1515180373:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (C0890.m55740()) {
                        iM55680 = C0873.m55680("ۨ᩷") ^ i15;
                        i3 = ((iM55680 ^ i16) * 18743) ^ (-782048909);
                        i4 = -1755220208;
                    } else {
                        iM55680 = (C0873.m55680("ۜ᩷") + i16) * 115;
                        i3 = ((iM55680 ^ i15) * (-407)) ^ (-406268642);
                        i4 = -1343722504;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1725030547:
                case -1341585552:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0946.m55979("ܳ᩷") ^ i16;
                        i3 = ((iM55680 ^ i15) * (-5033)) ^ 376859744;
                        i4 = -1671347519;
                    } else {
                        iM55680 = (C0873.m55680("ۖۙ") ^ i16) * (-9);
                        i3 = ((iM55680 ^ i15) * 13811) ^ (-374329779);
                        i4 = 410636100;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1650951375:
                case -491469838:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (i10 >= iMo5207) {
                        itM56346 = itM56346;
                        int iM559713 = C0946.m55979("۬ۢ") ^ i16;
                        i17 = ((iM559713 ^ i15) * 22173) ^ (-895024018);
                        s2 = s2;
                        i12 = i12;
                        i18 = iM559713 ^ (-467178501);
                    } else {
                        iM55680 = (C0873.m55680("ۧۜ") + i16) * (-105);
                        i3 = ((iM55680 ^ i15) * (-14689)) ^ (-1743868495);
                        i4 = -443807195;
                        i9 = iM55680 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM56346 = itM56346;
                    }
                    break;
                case -1650589125:
                case 143875764:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (C0930.m55886(itM56347)) {
                        iM55680 = (i15 - C0873.m55680("ۗ᩶")) * (-9);
                        i3 = ((iM55680 ^ i16) * (-18195)) ^ (-1332576706);
                        i4 = -798858496;
                    } else {
                        iM55680 = C0873.m55680("֡ۛ") ^ i16;
                        i3 = ((iM55680 ^ i15) * 20063) ^ 2101669026;
                        i4 = 1071330440;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1646287953:
                case 474359521:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    iMo14722 = c10278.mo14722() << 24;
                    iMo5199 = c21678.mo5199();
                    iM55680 = (C0946.m55979("ۡܶ") ^ i16) * (-127);
                    i3 = ((iM55680 ^ i15) * 15413) ^ (-688093192);
                    i4 = 258054944;
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1639112757:
                case 1915964687:
                    s2 = s2;
                    i12 = i12;
                    c10278 = (C10278) C0955.m56035(itM56347);
                    itM56346 = C1071.m56346(c10278.mo14714());
                    int iM559714 = C0946.m55979("۬ۢ") ^ i16;
                    i17 = ((iM559714 ^ i15) * 22173) ^ (-895024018);
                    s2 = s2;
                    i12 = i12;
                    i18 = iM559714 ^ (-467178501);
                    break;
                case -1521406750:
                case 174194685:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    itM56347 = C1071.m56346(c10949.mo23906());
                    iM55680 = (C0946.m55979("ܿۘ") ^ i15) * (-113);
                    i3 = ((iM55680 ^ i16) * 2057) ^ 373126829;
                    i4 = 424394379;
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1430272470:
                case -579192883:
                    itM56346 = itM56346;
                    C21678 c21679 = (C21678) RunnableC0897.m55785(itM56346);
                    iMo5207 = c21679.mo5207();
                    i10 = 0;
                    c21678 = c21679;
                    iM55680 = C0946.m55979("ۙ᩺") ^ i16;
                    i3 = ((iM55680 ^ i15) * 28309) ^ 820350807;
                    i4 = -59615139;
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1395542280:
                case 411489356:
                    itM56346 = itM56346;
                    i10++;
                    iM55680 = C0946.m55979("ۙ᩺") ^ i16;
                    i3 = ((iM55680 ^ i15) * 28309) ^ 820350807;
                    i4 = -59615139;
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1127304475:
                case -282182816:
                    C1194.m56396();
                    iM55979 = C0946.m55979("ۤܺ") ^ i15;
                    i = ((iM55979 ^ i16) * 5409) ^ 1947364563;
                    i2 = 1381890721;
                    i18 = iM55979 ^ i2;
                    i17 = i;
                    break;
                case -1093141534:
                case 578149559:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0873.m55680("ᩳۡ") ^ i15) * 65;
                        i3 = ((iM55680 ^ i16) * 4989) ^ (-1558017275);
                        i4 = 507374786;
                    } else {
                        iM55680 = (C0873.m55680("۟ܰ") ^ i16) * 13;
                        i3 = ((iM55680 ^ i15) * 13393) ^ 224949537;
                        i4 = -267003445;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1089737870:
                case -461179801:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (strM48945 == null) {
                        iM55680 = C0946.m55979("᩻ܽ") ^ i16;
                        i3 = ((iM55680 ^ i15) * (-6383)) ^ (-344365917);
                        i4 = 2037327299;
                    } else {
                        iM55680 = C0946.m55979("ۛۗ") ^ i15;
                        i3 = ((iM55680 ^ i16) * 30749) ^ (-724235045);
                        i4 = 684401627;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -1070709617:
                case 46699471:
                    if (C0930.f81879 > 0) {
                        itM56346 = itM56346;
                        s2 = s2;
                        i12 = i12;
                        iM55680 = C0946.m55979("ܰۡ") ^ i15;
                        i3 = ((iM55680 ^ i16) * (-10025)) ^ 1942456464;
                        i4 = -230733079;
                        i9 = iM55680 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM56346 = itM56346;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩺") + i16) * (-87);
                        i = ((iM55979 ^ i15) * (-30777)) ^ (-368790783);
                        i2 = 68284561;
                        i18 = iM55979 ^ i2;
                        i17 = i;
                    }
                    break;
                case -1011125697:
                case -414614177:
                    C0866.m55645();
                    break;
                case -1003717810:
                case 1393403424:
                    break;
                case -965417879:
                case 1973790405:
                    C1028.m56247();
                    if (C0890.f81849 != 0) {
                        itM56346 = itM56346;
                        s2 = s2;
                        i12 = i12;
                        iM55680 = (C0873.m55680("ᩳۡ") ^ i15) * 65;
                        i3 = ((iM55680 ^ i16) * 4989) ^ (-1558017275);
                        i4 = 507374786;
                        i9 = iM55680 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM56346 = itM56346;
                    } else {
                        iM55979 = C0946.m55979("ۤܺ") ^ i15;
                        i = ((iM55979 ^ i16) * 5409) ^ 1947364563;
                        i2 = 1381890721;
                        i18 = iM55979 ^ i2;
                        i17 = i;
                    }
                    break;
                case -864404736:
                case 869997195:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    strM48945 = c21678.m48945(i10);
                    iM55680 = (C0946.m55979("ܽ᩷") + i15) * (-3);
                    i3 = ((iM55680 ^ i16) * (-26787)) ^ 1352138638;
                    i4 = 71109021;
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -813274881:
                case 620780597:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if ((i13 + 1) - i12 > 0) {
                        iM55680 = (C0873.m55680("᩵ۗ") + i15) * (-73);
                        i3 = ((iM55680 ^ i16) * 16565) ^ 390661699;
                        i4 = -1107490605;
                    } else {
                        iM55680 = C0946.m55979("֡ܶ") ^ i16;
                        i3 = ((iM55680 ^ i15) * (-11805)) ^ 368127057;
                        i4 = -1304445827;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -812043006:
                case 150420775:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = (i15 - C0946.m55979("᩵ۜ")) * 85;
                        i3 = ((iM55680 ^ i16) * (-13953)) ^ (-1587913278);
                        i4 = 2028481467;
                        i9 = iM55680 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM56346 = itM56346;
                    } else {
                        s = s2;
                        iM559710 = (i16 - C0946.m55979("ܰܶ")) * 75;
                        i5 = ((iM559710 ^ i15) * (-22243)) ^ (-1435122491);
                        i6 = -1164862023;
                        i18 = iM559710 ^ i6;
                        s2 = s;
                        i17 = i5;
                        i12 = i12;
                        itM56346 = itM56346;
                    }
                    break;
                case -796612256:
                case 256866954:
                    itM56346 = itM56346;
                    i12 = i12;
                    s = sArr[141];
                    s4 = 1;
                    if (RunnableC0897.f81856) {
                        iM559710 = (C0946.m55979("ۙ᩶") + i16) * (-41);
                        i5 = ((iM559710 ^ i15) * 2539) ^ 742743020;
                        i6 = -1072607157;
                    } else {
                        iM559710 = (i16 - C0946.m55979("ܰܶ")) * 75;
                        i5 = ((iM559710 ^ i15) * (-22243)) ^ (-1435122491);
                        i6 = -1164862023;
                    }
                    i18 = iM559710 ^ i6;
                    s2 = s;
                    i17 = i5;
                    i12 = i12;
                    itM56346 = itM56346;
                    break;
                case -740965275:
                case -221803612:
                    i19 = 11165;
                    iM55680 = (C0873.m55680("᩻۠") + i16) * (-21);
                    i3 = ((iM55680 ^ i15) * 6113) ^ (-1697729583);
                    i4 = 1378358596;
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -455985244:
                case 1440583358:
                    ServiceConnectionC1013.m56157();
                    if (C0866.f81837 >= 0) {
                        itM56346 = itM56346;
                        s2 = s2;
                        i12 = i12;
                        iM55680 = C0946.m55979("ܳ᩷") ^ i16;
                        i3 = ((iM55680 ^ i15) * (-5033)) ^ 376859744;
                        i4 = -1671347519;
                        i9 = iM55680 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM56346 = itM56346;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩺") + i16) * (-87);
                        i = ((iM55979 ^ i15) * (-30777)) ^ (-368790783);
                        i2 = 68284561;
                        i18 = iM55979 ^ i2;
                        i17 = i;
                    }
                    break;
                case -172402371:
                case 29136487:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (zM55949) {
                        iM55680 = C0946.m55979("᩻ܽ") ^ i16;
                        i3 = ((iM55680 ^ i15) * (-6383)) ^ (-344365917);
                        i4 = 2037327299;
                        i9 = iM55680 ^ i4;
                        i17 = i3;
                    } else {
                        int iM559715 = (C0946.m55979("֫ۙ") ^ i15) * (-27);
                        int i21 = ((iM559715 ^ i16) * 18483) ^ (-1118511203);
                        i9 = iM559715 ^ (-1156000373);
                        i17 = i21;
                    }
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -47742940:
                case 1715962190:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0873.m55680("ᩳۡ") ^ i15) * 65;
                        i3 = ((iM55680 ^ i16) * 4989) ^ (-1558017275);
                        i4 = 507374786;
                    } else {
                        iM55680 = (C0946.m55979("ۢۚ") ^ i15) * (-103);
                        i3 = ((iM55680 ^ i16) * (-21745)) ^ (-1167057977);
                        i4 = 366734176;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case -41191736:
                case 1781803679:
                    C0894.m55769();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = C0946.m55979("ۤܺ") ^ i15;
                        i = ((iM55979 ^ i16) * 5409) ^ 1947364563;
                        i2 = 1381890721;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩺") + i16) * (-87);
                        i = ((iM55979 ^ i15) * (-30777)) ^ (-368790783);
                        i2 = 68284561;
                    }
                    i18 = iM55979 ^ i2;
                    i17 = i;
                    break;
                case 112592874:
                case 458971741:
                    if (C0989.f81920 < 0) {
                        itM56346 = itM56346;
                        s2 = s2;
                        i12 = i12;
                        iM55680 = (C0873.m55680("ۜ᩷") + i16) * 115;
                        i3 = ((iM55680 ^ i15) * (-407)) ^ (-406268642);
                        i4 = -1343722504;
                        i9 = iM55680 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM56346 = itM56346;
                    } else {
                        iM55979 = C0946.m55979("ۤܺ") ^ i15;
                        i = ((iM55979 ^ i16) * 5409) ^ 1947364563;
                        i2 = 1381890721;
                        i18 = iM55979 ^ i2;
                        i17 = i;
                    }
                    break;
                case 216925859:
                case 277744620:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    i13 = s2 * s3;
                    if (RunnableC0871.m55672() < 0) {
                        iM55680 = (i15 - C0946.m55979("۬ۡ")) * (-115);
                        i3 = ((iM55680 ^ i16) * (-13939)) ^ 1703714360;
                        i4 = -1925262174;
                        i9 = iM55680 ^ i4;
                        i17 = i3;
                        s2 = s2;
                        i12 = i12;
                        i18 = i9;
                        itM56346 = itM56346;
                    } else {
                        i12 = i12;
                        iM559711 = C0946.m55979("۟᩻") ^ i15;
                        i7 = ((iM559711 ^ i16) * 8023) ^ (-2137925581);
                        i8 = 1935691837;
                        i9 = iM559711 ^ i8;
                        i17 = i7;
                        s2 = s2;
                        i18 = i9;
                        itM56346 = itM56346;
                    }
                    break;
                case 364162401:
                case 1574058741:
                    try {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder();
                        C0912.m55825(sb, strM48945);
                        s2 = s2;
                        try {
                            i12 = i12;
                            itM56346 = itM56346;
                            try {
                                C1003.m56121(sb, C0917.m55852(f82089, 142, 4, i19));
                                C0912.m55825(sb, str);
                                printStream.println(C0845.m55591(sb));
                                c21678.m48933(i10, str);
                                try {
                                    C0898.m55805(map, strM48945, str);
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
                    iM55680 = C0946.m55979("᩻ܽ") ^ i16;
                    i3 = ((iM55680 ^ i15) * (-6383)) ^ (-344365917);
                    i4 = 2037327299;
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case 485473968:
                case 1669381880:
                    itM56346 = itM56346;
                    s2 = s2;
                    i12 = i12;
                    i11 = iMo14722 | (iMo5199 << 16);
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("ܰۡ") ^ i15;
                        i3 = ((iM55680 ^ i16) * (-10025)) ^ 1942456464;
                        i4 = -230733079;
                    } else {
                        iM55680 = C0946.m55979("ܿ᩻") ^ i15;
                        i3 = ((iM55680 ^ i16) * 15807) ^ (-4286555);
                        i4 = 633016324;
                    }
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
                    break;
                case 727637068:
                case 1194062960:
                    C0845.m55584();
                    if (C0946.m55980() == 0) {
                        iM55979 = C0946.m55979("ۤܺ") ^ i15;
                        i = ((iM55979 ^ i16) * 5409) ^ 1947364563;
                        i2 = 1381890721;
                    } else {
                        iM55979 = C0946.m55979("֡ۡ") ^ i16;
                        i = ((iM55979 ^ i15) * (-9193)) ^ 2015647780;
                        i2 = 2058429072;
                    }
                    i18 = iM55979 ^ i2;
                    i17 = i;
                    break;
                case 1514725660:
                case 1580289151:
                    break;
                default:
                    i19 = 60782;
                    iM55680 = (C0873.m55680("᩻۠") + i16) * (-21);
                    i3 = ((iM55680 ^ i15) * 6113) ^ (-1697729583);
                    i4 = 1378358596;
                    i9 = iM55680 ^ i4;
                    i17 = i3;
                    s2 = s2;
                    i12 = i12;
                    i18 = i9;
                    itM56346 = itM56346;
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
    /* JADX INFO: renamed from: ֫ */
    public static void m24329(C10949 c10949, C19561 c19561) throws IOException {
        int i;
        int i2;
        String strM55947;
        int i3;
        String strM56144;
        Iterator it;
        int i4;
        int parent;
        int i5;
        boolean z;
        C5738 c5738M56013;
        String name;
        int iMo7247;
        short s = f82089[146];
        int i6 = (s * 2) + 1;
        int i7 = s + 1;
        int i8 = i6 - (i7 * i7) <= 0 ? 62423 : 5891;
        Iterator itM56346 = C1071.m56346(c10949.mo23906());
        while (C0930.m55886(itM56346)) {
            Iterator itM56347 = C1071.m56346(((C10278) RunnableC0897.m55785(itM56346)).mo14714());
            while (C0866.m55647(itM56347)) {
                C21678 c21678 = (C21678) C0955.m56035(itM56347);
                if (f29234.contains(C0989.m56091(c21678))) {
                    itM56346 = itM56346;
                    itM56347 = itM56347;
                } else {
                    int iMo5199 = c21678.mo5199();
                    String strM56235 = C1028.m56235(f82089, 147, 4, i8);
                    if (iMo5199 != 1 || c21678.mo5200() > 1 || c21678.mo5207() != 0) {
                        if (c21678.mo5200() == 1) {
                            Iterator itM56399 = C1229.m56399(c21678.mo5206(0).mo20696());
                            i = 0;
                            i2 = 0;
                            while (C0866.m55647(itM56399)) {
                                InterfaceC22528 interfaceC22528 = (InterfaceC22528) C0955.m56035(itM56399);
                                if (!interfaceC22528.mo31474()) {
                                    InterfaceC3751 value = interfaceC22528.getValue();
                                    if ((value.mo7252() && !value.mo7251().mo12361() && C1194.m56397(value.mo7251().getValue())) || (value.mo7247() == 18 && value.getValue() == 0)) {
                                        i++;
                                    }
                                }
                                if (interfaceC22528.mo31474() && interfaceC22528.mo31471() != 0 && interfaceC22528.getValue().mo7249() == 16777216) {
                                    i2++;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        Iterator itM56348 = C1071.m56346(c21678.mo5201());
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
                            boolean zM55886 = C0930.m55886(itM56348);
                            int i29 = i19;
                            int i30 = i20;
                            int i31 = i18;
                            String strM56016 = C0949.m56016(f82089, 151, 10, i8);
                            int i32 = i17;
                            String strM56017 = C0949.m56016(f82089, 161, 5, i8);
                            int i33 = i15;
                            String strM55618 = C0861.m55618(f82089, 166, 4, i8);
                            int i34 = i14;
                            String strM55852 = C0917.m55852(f82089, 170, 8, i8);
                            int i35 = i13;
                            String strM55619 = C0861.m55618(f82089, 178, 12, i8);
                            int i36 = i12;
                            String strM56161 = ServiceConnectionC1013.m56161(f82089, 190, 6, i8);
                            if (zM55886) {
                                Iterator itM56349 = C1071.m56346(((InterfaceC9116) C0955.m56035(itM56348)).mo20696());
                                while (C0866.m55647(itM56349)) {
                                    InterfaceC22528 interfaceC22529 = (InterfaceC22528) RunnableC0897.m55785(itM56349);
                                    if (interfaceC22529.mo31474() && interfaceC22529.mo31471() != 0) {
                                        Iterator itM563410 = C1071.m56346(interfaceC22529.values());
                                        int i37 = 16777217;
                                        while (true) {
                                            if (C0866.m55647(itM563410)) {
                                                it = itM56348;
                                                int i38 = i37 + 1;
                                                if (((InterfaceC3751) C0955.m56035(itM563410)).mo7249() == i37) {
                                                    i37 = i38;
                                                    itM56348 = it;
                                                }
                                            } else {
                                                it = itM56348;
                                                i9++;
                                            }
                                        }
                                    } else {
                                        it = itM56348;
                                    }
                                    if (interfaceC22529.mo31474() && interfaceC22529.mo31471() != 0) {
                                        Iterator itM563411 = C1071.m56346(interfaceC22529.values());
                                        while (true) {
                                            if (C0930.m55886(itM563411)) {
                                                InterfaceC3751 interfaceC3751 = (InterfaceC3751) RunnableC0897.m55785(itM563411);
                                                Iterator it2 = itM563411;
                                                int iMo7249 = interfaceC3751.mo7249();
                                                i4 = i9;
                                                if (iMo7249 >= 16777220 && iMo7249 <= 16777225 && ((iMo7247 = interfaceC3751.mo7247()) == 0 || iMo7247 == 1 || iMo7247 == 2 || iMo7247 == 3)) {
                                                    itM563411 = it2;
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
                                    if (interfaceC22529.mo31474() && ((parent = interfaceC22529.getParent()) == 0 || ((-65536) & parent) == 16973824 || ((parent >>> 16) & 255) == interfaceC22529.getType().mo5199())) {
                                        if (interfaceC22529.mo31471() == 0) {
                                            i5 = i10;
                                        } else {
                                            Iterator itM563412 = C1071.m56346(interfaceC22529.values());
                                            while (true) {
                                                if (C0866.m55647(itM563412)) {
                                                    InterfaceC3751 interfaceC3752 = (InterfaceC3751) RunnableC0897.m55785(itM563412);
                                                    Iterator it3 = itM563412;
                                                    if ((interfaceC3752.mo7249() & (-65536)) == 16842752) {
                                                        i5 = i10;
                                                    } else {
                                                        i5 = i10;
                                                        if ((interfaceC3752.mo7249() & (-16777216)) != (C0946.m55979(C0917.m55852(f82089, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i8)) ^ 2129448214)) {
                                                            itM563412 = it3;
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
                                    if (!interfaceC22529.mo31474() && interfaceC22529.getValue().mo7247() == 18) {
                                        i35++;
                                    }
                                    if (!interfaceC22529.mo31474() && interfaceC22529.getValue().mo7247() == 5) {
                                        i34++;
                                    }
                                    if (!interfaceC22529.mo31474() && (interfaceC22529.getValue().mo7247() == 6 || interfaceC22529.getValue().mo7247() == 4)) {
                                        i32++;
                                    }
                                    if (interfaceC22529.mo31474() ? false : interfaceC22529.getValue().mo7250()) {
                                        i31++;
                                    }
                                    if (interfaceC22529.mo31474() ? false : interfaceC22529.getValue().mo7248()) {
                                        i16++;
                                    }
                                    if (interfaceC22529.mo31474()) {
                                        z = false;
                                    } else {
                                        InterfaceC3751 value2 = interfaceC22529.getValue();
                                        if (value2.mo7252() && C0877.m55694(c19561, value2.mo7251().getValue()) == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        i11++;
                                    }
                                    if (!interfaceC22529.mo31474() && interfaceC22529.getValue().mo7252() && (c5738M56013 = C0949.m56013(c19561, interfaceC22529.getValue().mo7251().getValue())) != null && C1194.m56387(c5738M56013) <= 1048576) {
                                        byte[] bArrM4194 = C2700.m4194(C1024.m56204(c19561, c5738M56013), 0);
                                        try {
                                            XmlResourceParserC12128 xmlResourceParserC12128M38154 = C16820.m38138(bArrM4194).m38154();
                                            while (true) {
                                                int next = xmlResourceParserC12128M38154.next();
                                                if (next != 1) {
                                                    if (next == 2) {
                                                        name = xmlResourceParserC12128M38154.getName();
                                                        if (!ViewOnClickListenerC0939.m55949(name, C1044.m56276(f82089, 510, 3, i8))) {
                                                        }
                                                    }
                                                    xmlResourceParserC12128M38154 = xmlResourceParserC12128M38154;
                                                } else {
                                                    name = null;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        byte b = -1;
                                        if (name != null) {
                                            switch (C0873.m55680(name)) {
                                                case -1493546681:
                                                    if (ViewOnClickListenerC0939.m55949(name, RunnableC0871.m55667(f82089, 276, 14, i8))) {
                                                        b = 0;
                                                    }
                                                    break;
                                                case -1388777169:
                                                    if (ViewOnClickListenerC0939.m55949(name, C1194.m56386(f82089, 290, 6, i8))) {
                                                        b = 1;
                                                    }
                                                    break;
                                                case -930826704:
                                                    if (C0906.m55806(name, C0992.m56102(f82089, 296, 6, i8))) {
                                                        b = 2;
                                                    }
                                                    break;
                                                case -925180581:
                                                    if (C0906.m55806(name, C0894.m55773(f82089, 302, 6, i8))) {
                                                        b = 3;
                                                    }
                                                    break;
                                                case -820387517:
                                                    if (ViewOnClickListenerC0939.m55949(name, C0845.m55592(f82089, 308, 6, i8))) {
                                                        b = 4;
                                                    }
                                                    break;
                                                case -510364471:
                                                    if (ViewOnClickListenerC0939.m55949(name, C1003.m56132(f82089, 314, 17, i8))) {
                                                        b = 5;
                                                    }
                                                    break;
                                                case -173195978:
                                                    if (ViewOnClickListenerC0939.m55949(name, C0949.m56016(f82089, 331, 21, i8))) {
                                                        b = 6;
                                                    }
                                                    break;
                                                case -94197862:
                                                    if (ViewOnClickListenerC0939.m55949(name, C1044.m56276(f82089, 352, 10, i8))) {
                                                        b = 7;
                                                    }
                                                    break;
                                                case 3056464:
                                                    if (ViewOnClickListenerC0939.m55949(name, C0863.m55635(f82089, 362, 4, i8))) {
                                                        b = 8;
                                                    }
                                                    break;
                                                case 3347807:
                                                    if (C0906.m55806(name, strM55618)) {
                                                        b = 9;
                                                    }
                                                    break;
                                                case 92909918:
                                                    if (ViewOnClickListenerC0939.m55949(name, C1053.m56325(f82089, 366, 5, i8))) {
                                                        b = 10;
                                                    }
                                                    break;
                                                case 94842723:
                                                    if (ViewOnClickListenerC0939.m55949(name, strM56017)) {
                                                        b = 11;
                                                    }
                                                    break;
                                                case 100360477:
                                                    if (ViewOnClickListenerC0939.m55949(name, C1194.m56386(f82089, 371, 5, i8))) {
                                                        b = 12;
                                                    }
                                                    break;
                                                case 103785528:
                                                    if (C0906.m55806(name, C0927.m55863(f82089, 376, 5, i8))) {
                                                        b = C0698cb.f2569k;
                                                    }
                                                    break;
                                                case 106438894:
                                                    if (ViewOnClickListenerC0939.m55949(name, C0992.m56102(f82089, 381, 5, i8))) {
                                                        b = C0698cb.f2570l;
                                                    }
                                                    break;
                                                case 108532386:
                                                    if (ViewOnClickListenerC0939.m55949(name, C0947.m55993(f82089, 386, 11, i8))) {
                                                        b = 15;
                                                    }
                                                    break;
                                                case 109250890:
                                                    if (ViewOnClickListenerC0939.m55949(name, C1046.m56293(f82089, 397, 5, i8))) {
                                                        b = 16;
                                                    }
                                                    break;
                                                case 109399969:
                                                    if (C0906.m55806(name, RunnableC1014.m56180(f82089, 402, 5, i8))) {
                                                        b = 17;
                                                    }
                                                    break;
                                                case 1052832078:
                                                    if (C0906.m55806(name, C0861.m55618(f82089, 407, 9, i8))) {
                                                        b = 18;
                                                    }
                                                    break;
                                                case 1191572447:
                                                    if (ViewOnClickListenerC0939.m55949(name, C0892.m55750(f82089, 416, 8, i8))) {
                                                        b = 19;
                                                    }
                                                    break;
                                                case 1747193040:
                                                    if (C0906.m55806(name, C0989.m56092(f82089, 424, 23, i8))) {
                                                        b = 20;
                                                    }
                                                    break;
                                                case 1862666772:
                                                    if (C0906.m55806(name, strM56016)) {
                                                        b = 21;
                                                    }
                                                    break;
                                                case 2013827269:
                                                    if (C0906.m55806(name, C0866.m55652(f82089, Scalar448.TARGET_LENGTH, 15, i8))) {
                                                        b = 22;
                                                    }
                                                    break;
                                                case 2118620333:
                                                    if (ViewOnClickListenerC0939.m55949(name, C1012.m56144(f82089, 462, 15, i8))) {
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
                                                    String strM55765 = C0894.m55765(name);
                                                    if (C0863.m55630(strM55765, strM56161) || C0863.m55630(strM55765, C0927.m55863(f82089, 521, 4, i8)) || C0863.m55630(strM55765, RunnableC0938.m55936(f82089, 525, 6, i8))) {
                                                        i21++;
                                                    } else if (C0845.m55582(strM55765, strM55619)) {
                                                        i22++;
                                                    } else if (C0863.m55630(strM55765, strM55852)) {
                                                        i23++;
                                                    } else if (!C0863.m55630(strM55765, C0877.m55707(f82089, 531, 16, i8))) {
                                                        System.out.println(C1046.m56289(C1025.m56233(f82089, 547, 19, i8), name));
                                                    } else {
                                                        i27++;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            String strM50425 = C22464.m50425(bArrM4194);
                                            if (strM50425 != null) {
                                                switch (C0946.m55979(strM50425)) {
                                                    case 1468055:
                                                        if (ViewOnClickListenerC0939.m55949(strM50425, C0955.m56029(f82089, 477, 4, i8))) {
                                                            b = 0;
                                                        }
                                                        break;
                                                    case 1472726:
                                                        if (C0906.m55806(strM50425, C0949.m56016(f82089, 481, 4, i8))) {
                                                            b = 1;
                                                        }
                                                        break;
                                                    case 1475827:
                                                        if (C0906.m55806(strM50425, C0937.m55921(f82089, 485, 4, i8))) {
                                                            b = 2;
                                                        }
                                                        break;
                                                    case 1480755:
                                                        if (ViewOnClickListenerC0939.m55949(strM50425, C0947.m55993(f82089, 489, 4, i8))) {
                                                            b = 3;
                                                        }
                                                        break;
                                                    case 1481531:
                                                        if (C0906.m55806(strM50425, ServiceConnectionC1013.m56161(f82089, 493, 4, i8))) {
                                                            b = 4;
                                                        }
                                                        break;
                                                    case 1485557:
                                                        if (C0906.m55806(strM50425, C0955.m56029(f82089, 497, 4, i8))) {
                                                            b = 5;
                                                        }
                                                        break;
                                                    case 1485560:
                                                        if (C0906.m55806(strM50425, C1929.m56558(f82089, 501, 4, i8))) {
                                                            b = 6;
                                                        }
                                                        break;
                                                    case 46127306:
                                                        if (ViewOnClickListenerC0939.m55949(strM50425, RunnableC0871.m55667(f82089, 505, 5, i8))) {
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
                                    c19561 = c19561;
                                    i9 = i4;
                                    itM56348 = it;
                                    i10 = i5;
                                }
                                c19561 = c19561;
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
                                    strM55947 = C0927.m55863(f82089, 196, 2, i8);
                                } else {
                                    i = 0;
                                    strM55947 = null;
                                }
                                if (i2 > i) {
                                    strM55947 = strM56235;
                                } else {
                                    i2 = i;
                                }
                                if (i9 > i2) {
                                    strM55947 = RunnableC0897.m55783(f82089, 198, 5, i8);
                                } else {
                                    i9 = i2;
                                }
                                if (i10 > i9) {
                                    strM55947 = C1017.m56189(f82089, 203, 7, i8);
                                } else {
                                    i10 = i9;
                                }
                                if (i11 > i10) {
                                    strM55947 = C1028.m56235(f82089, 210, 6, i8);
                                } else {
                                    i11 = i10;
                                }
                                int i39 = i36;
                                if (i39 > i11) {
                                    strM55947 = C0854.m55597(f82089, 216, 5, i8);
                                } else {
                                    i39 = i11;
                                }
                                if (i35 > i39) {
                                    strM55947 = ViewOnClickListenerC0939.m55947(f82089, 221, 4, i8);
                                    i39 = i35;
                                }
                                if (i34 > i39) {
                                    strM56144 = C0877.m55707(f82089, 228, 5, i8);
                                    i3 = i34;
                                } else {
                                    String str = strM55947;
                                    i3 = i39;
                                    strM56144 = str;
                                }
                                if (i33 > i3) {
                                    strM56144 = C0992.m56102(f82089, 233, 4, i8);
                                } else {
                                    i33 = i3;
                                }
                                if (i32 > i33) {
                                    strM56144 = ViewOnClickListenerC0939.m55947(f82089, 237, 8, i8);
                                    i33 = i32;
                                }
                                if (i31 > i33) {
                                    strM56144 = C0947.m55993(f82089, 245, 7, i8);
                                    i33 = i31;
                                }
                                if (i30 > i33) {
                                    strM56144 = C1024.m56203(f82089, 252, 6, i8);
                                    i33 = i30;
                                }
                                if (i29 > i33) {
                                    strM56144 = C1012.m56144(f82089, 258, 8, i8);
                                    i33 = i29;
                                }
                                int i40 = i16;
                                if (i40 > i33) {
                                    i33 = i40;
                                } else {
                                    strM56017 = strM56144;
                                }
                                int i41 = i21;
                                if (i41 > i33) {
                                    i33 = i41;
                                } else {
                                    strM56161 = strM56017;
                                }
                                int i42 = i22;
                                if (i42 > i33) {
                                    i33 = i42;
                                } else {
                                    strM55619 = strM56161;
                                }
                                int i43 = i23;
                                if (i43 > i33) {
                                    i33 = i43;
                                } else {
                                    strM55852 = strM55619;
                                }
                                int i44 = i24;
                                if (i44 > i33) {
                                    strM55852 = C0854.m55597(f82089, 266, 4, i8);
                                    i33 = i44;
                                }
                                int i45 = i25;
                                if (i45 > i33) {
                                    strM55852 = C1194.m56386(f82089, BottomAppBarTopEdgeTreatment.ANGLE_UP, 3, i8);
                                    i33 = i45;
                                }
                                int i46 = i26;
                                if (i46 > i33) {
                                    i33 = i46;
                                } else {
                                    strM55618 = strM55852;
                                }
                                int i47 = i27;
                                if (i47 > i33) {
                                    strM55618 = C0917.m55852(f82089, 273, 3, i8);
                                    i33 = i47;
                                }
                                if (i28 <= i33) {
                                    strM56016 = strM55618;
                                }
                                strM56235 = strM56016 != null ? strM56016 : String.format(C0898.m55792(f82089, 513, 8, i8), C0912.m55836(c21678.mo5199()));
                                c21678 = c21678;
                            }
                        }
                    }
                    c21678.m48946(strM56235);
                }
                itM56346 = itM56346;
                c19561 = c19561;
                itM56347 = itM56347;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24331(String str, boolean z) {
        int iM55719 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        char cM55712 = 0;
        int i3 = -962261866;
        int i4 = C1053.f81965;
        int i5 = ViewOnClickListenerC0939.f81888;
        int iM55979 = (C0946.m55979("۠ۙ") ^ i5) * 13;
        int i6 = ((iM55979 ^ i4) * 11669) ^ (-1885832604);
        int i7 = 1174491525;
        while (true) {
            i3 = ((((i3 ^ i4) * 27027) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -2145275821:
                case 212710096:
                    z2 = false;
                    z3 = true;
                    if (iM55719 >= 1) {
                        iM55979 = C0946.m55979("ܶۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-26781)) ^ 1932394489;
                        i7 = 852081682;
                    } else {
                        iM55979 = C0946.m55979("۬ܿ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 19459) ^ (-1045323514);
                        i7 = -1422434458;
                    }
                    break;
                case -2053701609:
                case -606541206:
                    if (z) {
                        iM55979 = (C0873.m55680("ۤ᩸") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM55979 ^ i5) * 10295) ^ 1179753789;
                        i7 = 942042742;
                    } else {
                        iM55979 = C0946.m55979("۬ܿ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 19459) ^ (-1045323514);
                        i7 = -1422434458;
                    }
                    break;
                case -2046359047:
                case -794594063:
                    i = 100;
                    iM55979 = (i5 - C0873.m55680("ᩳ᩺")) * (-15);
                    i6 = ((iM55979 ^ i4) * 31181) ^ (-1820829413);
                    i7 = 515328512;
                    break;
                case -1993703867:
                case 1892415291:
                    if (cM55712 == '$') {
                        iM55979 = C0946.m55979("۬ۗ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    } else {
                        iM55979 = (C0946.m55979("ᩳܽ") ^ i4) * (-77);
                        i6 = ((iM55979 ^ i5) * 31303) ^ 1629859082;
                        i7 = -1158638223;
                    }
                    break;
                case -1702920420:
                case 1996118989:
                    if (C0906.m55809() <= 0) {
                        iM55979 = (i5 - C0873.m55680("ۚ᩸")) * 13;
                        i6 = ((iM55979 ^ i4) * (-6781)) ^ 67276306;
                        i7 = 1700605119;
                    } else {
                        iM55979 = C0873.m55680("᩻᩶") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-5151)) ^ 1067919067;
                        i7 = 1380479679;
                    }
                    break;
                case -1688557541:
                case 164168030:
                    i2++;
                    iM55979 = C0946.m55979("ܰ۠") ^ i4;
                    i6 = ((iM55979 ^ i5) * (-22505)) ^ (-239819065);
                    i7 = 635708687;
                    break;
                case -1675823744:
                case 1524673594:
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (i4 - C0946.m55979("᩺ᩳ")) * (-77);
                        i6 = ((iM55979 ^ i5) * 5771) ^ (-643489631);
                        i7 = -1201456080;
                    } else {
                        iM55979 = C0946.m55979("ᩴ֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    }
                    break;
                case -1620333667:
                case -1281324801:
                    return z2;
                case -1482270684:
                case -75715029:
                    if (cM55712 <= 'z') {
                        iM55979 = C0946.m55979("۬ۗ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    } else {
                        iM55979 = (C0873.m55680("֡ۤ") ^ i4) * (-115);
                        i6 = ((iM55979 ^ i5) * (-1965)) ^ 848978855;
                        i7 = 1603665604;
                    }
                    break;
                case -1468492084:
                case 107518419:
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("֨᩸") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-7807)) ^ 1080544740;
                        i7 = 409863162;
                    } else {
                        iM55979 = C0873.m55680("᩹۠") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-25715)) ^ (-560863119);
                        i7 = 489617944;
                    }
                    break;
                case -1440267173:
                case 100591356:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("ᩴ֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩸") ^ i4) * (-109);
                        i6 = ((iM55979 ^ i5) * (-6739)) ^ (-1891482058);
                        i7 = -1686568368;
                    }
                    break;
                case -1112367010:
                case 815875727:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("ܽۙ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-25321)) ^ 45629624;
                        i7 = 839333145;
                    } else {
                        iM55979 = C0873.m55680("ۤᩴ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-24115)) ^ 439070930;
                        i7 = 1118208757;
                    }
                    break;
                case -967506686:
                case 1775449239:
                    RunnableC1014.m56177();
                    if (!C1024.f81946) {
                        iM55979 = (i4 - C0946.m55979("᩺ᩳ")) * (-77);
                        i6 = ((iM55979 ^ i5) * 5771) ^ (-643489631);
                        i7 = -1201456080;
                    } else {
                        iM55979 = C0946.m55979("ܳۧ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-22905)) ^ 939124249;
                        i7 = 1551603159;
                    }
                    break;
                case -959939924:
                case -707848555:
                    i = 75;
                    iM55979 = (i5 - C0873.m55680("ᩳ᩺")) * (-15);
                    i6 = ((iM55979 ^ i4) * 31181) ^ (-1820829413);
                    i7 = 515328512;
                    break;
                case -832621941:
                case 1705880204:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ᩴ֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    } else {
                        iM55979 = (C0873.m55680("֨ᩳ") + i5) * (-89);
                        i6 = ((iM55979 ^ i4) * (-18081)) ^ 1412109579;
                        i7 = -1879799871;
                    }
                    break;
                case -821453313:
                case 788695502:
                    C1404.m56468();
                    C0949.m56012();
                    iM55979 = C0873.m55680("᩹۠") ^ i5;
                    i6 = ((iM55979 ^ i4) * (-25715)) ^ (-560863119);
                    i7 = 489617944;
                    break;
                case -795910330:
                case 331395880:
                    i2 = 0;
                    iM55979 = C0946.m55979("ܰ۠") ^ i4;
                    i6 = ((iM55979 ^ i5) * (-22505)) ^ (-239819065);
                    i7 = 635708687;
                    break;
                case -677803476:
                case -459472811:
                    if (C0955.f81898) {
                        iM55979 = (i5 - C0873.m55680("ۚ᩸")) * 13;
                        i6 = ((iM55979 ^ i4) * (-6781)) ^ 67276306;
                        i7 = 1700605119;
                    } else {
                        iM55979 = C0873.m55680("ܽۢ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-10519)) ^ 1130145101;
                        i7 = -1636070858;
                    }
                    break;
                case -636991548:
                case 636499083:
                    if ('A' <= cM55712) {
                        iM55979 = C0873.m55680("ۖ᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * 16533) ^ 728454672;
                        i7 = 661226710;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۗ۠")) * (-31);
                        i6 = ((iM55979 ^ i4) * 405) ^ (-60983378);
                        i7 = 745399540;
                    }
                    break;
                case -475759750:
                case 471922762:
                    if ('0' <= cM55712) {
                        iM55979 = C0873.m55680("᩻۫") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-16723)) ^ 999767594;
                        i7 = 1182644915;
                    } else {
                        iM55979 = (C0873.m55680("ۚܺ") ^ i5) * (-11);
                        i6 = ((iM55979 ^ i4) * 14481) ^ 1073899810;
                        i7 = 614809715;
                    }
                    break;
                case -350303096:
                case 1614058165:
                    iM55719 = C0882.m55719(str);
                    if (z) {
                        iM55979 = C0873.m55680("᩸᩹") ^ i5;
                        i6 = ((iM55979 ^ i4) * 30203) ^ (-911313822);
                        i7 = -769137969;
                    } else {
                        iM55979 = C0873.m55680("ۢܳ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 27269) ^ (-890419457);
                        i7 = -225145067;
                    }
                    break;
                case -254805859:
                case 674575919:
                    return z3;
                case -114995411:
                case 2118713410:
                    C0863.m55643();
                    if (C1036.m56257() > 0) {
                        iM55979 = C0946.m55979("ᩴ֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    } else {
                        iM55979 = C0873.m55680("᩹۠") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-25715)) ^ (-560863119);
                        i7 = 489617944;
                    }
                    break;
                case -19839409:
                case 737859101:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("ᩴ֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    } else {
                        iM55979 = C0873.m55680("֡۬") ^ i5;
                        i6 = ((iM55979 ^ i4) * 25505) ^ (-774646131);
                        i7 = -1329721079;
                    }
                    break;
                case 33240719:
                case 1713665554:
                    C0873.m55678();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i5 - C0873.m55680("ۚ᩸")) * 13;
                        i6 = ((iM55979 ^ i4) * (-6781)) ^ 67276306;
                        i7 = 1700605119;
                    } else {
                        iM55979 = C0946.m55979("ܳۧ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-22905)) ^ 939124249;
                        i7 = 1551603159;
                    }
                    break;
                case 63712499:
                case 691992097:
                    if (C0917.f81868) {
                        iM55979 = (C0946.m55979("ۖ᩵") + i4) * 97;
                        i6 = ((iM55979 ^ i5) * 10363) ^ (-660187126);
                        i7 = -1918548451;
                    } else {
                        iM55979 = C0946.m55979("ᩳ۟") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-28459)) ^ 480918152;
                        i7 = -100654737;
                    }
                    break;
                case 110457690:
                case 2073556926:
                    if (iM55719 > i) {
                        iM55979 = C0946.m55979("۬ܿ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 19459) ^ (-1045323514);
                        i7 = -1422434458;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ۚۢ")) * 77;
                        i6 = ((iM55979 ^ i4) * (-4901)) ^ (-135438393);
                        i7 = -1627836251;
                    }
                    break;
                case 140040180:
                case 674145568:
                    if (RunnableC0871.f81839 < 0) {
                        iM55979 = (C0946.m55979("ۖ᩵") + i4) * 97;
                        i6 = ((iM55979 ^ i5) * 10363) ^ (-660187126);
                        i7 = -1918548451;
                    } else {
                        iM55979 = C0946.m55979("ᩴ֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * 12011) ^ 452661769;
                        i7 = 2065830990;
                    }
                    break;
                case 260728841:
                case 1188873456:
                    if (cM55712 != '_') {
                        iM55979 = C0873.m55680("ۨۢ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-26869)) ^ 352329385;
                        i7 = 619220982;
                    } else {
                        iM55979 = C0946.m55979("۬ۗ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    }
                    break;
                case 297331095:
                case 1064988905:
                    if (i2 < iM55719) {
                        iM55979 = C0946.m55979("۫۠") ^ i5;
                        i6 = ((iM55979 ^ i4) * 30125) ^ 1397202942;
                        i7 = -605243289;
                    } else {
                        iM55979 = (C0873.m55680("ܽ֨") + i5) * (-61);
                        i6 = ((iM55979 ^ i4) * (-2627)) ^ 631024772;
                        i7 = 59045595;
                    }
                    break;
                case 320280874:
                case 618499338:
                    if (cM55712 != '.') {
                        iM55979 = C0946.m55979("۬ܿ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 19459) ^ (-1045323514);
                        i7 = -1422434458;
                    } else {
                        iM55979 = C0946.m55979("۬ۗ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    }
                    break;
                case 322257822:
                case 995802469:
                    if (cM55712 <= 'Z') {
                        iM55979 = C0946.m55979("۬ۗ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۗ۠")) * (-31);
                        i6 = ((iM55979 ^ i4) * 405) ^ (-60983378);
                        i7 = 745399540;
                    }
                    break;
                case 547232058:
                case 2029648559:
                    if (C0955.f81898) {
                        iM55979 = (C0946.m55979("ۖ᩵") + i4) * 97;
                        i6 = ((iM55979 ^ i5) * 10363) ^ (-660187126);
                        i7 = -1918548451;
                    } else {
                        iM55979 = C0946.m55979("ۘ᩷") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-7975)) ^ (-1344252985);
                        i7 = 1636081538;
                    }
                    break;
                case 632511602:
                case 1440241717:
                    if (C1048.m56305() < 0) {
                        iM55979 = C0873.m55680("᩹۠") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-25715)) ^ (-560863119);
                        i7 = 489617944;
                    } else {
                        iM55979 = (C0873.m55680("ۨ۠") + i5) * (-85);
                        i6 = ((iM55979 ^ i4) * (-27723)) ^ (-1808455292);
                        i7 = 1614500597;
                    }
                    break;
                case 741532418:
                case 1520022953:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0946.m55979("ܳۧ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-22905)) ^ 939124249;
                        i7 = 1551603159;
                    } else {
                        iM55979 = (C0873.m55680("ۤ᩷") ^ i5) * 5;
                        i6 = ((iM55979 ^ i4) * (-17701)) ^ (-1634735066);
                        i7 = -1890946391;
                    }
                    break;
                case 789047327:
                case 1736634673:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0873.m55680("ܽۙ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-25321)) ^ 45629624;
                        i7 = 839333145;
                    } else {
                        iM55979 = C0873.m55680("ۙ᩺") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-28939)) ^ 341567819;
                        i7 = 873977923;
                    }
                    break;
                case 1150532994:
                case 1914873931:
                    if (cM55712 > '9') {
                        iM55979 = (C0873.m55680("ۚܺ") ^ i5) * (-11);
                        i6 = ((iM55979 ^ i4) * 14481) ^ 1073899810;
                        i7 = 614809715;
                    } else {
                        iM55979 = C0946.m55979("۬ۗ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-31899)) ^ 1969336449;
                        i7 = 1575647234;
                    }
                    break;
                case 1225680296:
                case 1731794017:
                    C0877.m55696();
                    RunnableC1014.m56177();
                    return false;
                case 1438033765:
                case 1876576656:
                    if (C0890.m55740()) {
                        iM55979 = (C0946.m55979("ۖ᩵") + i4) * 97;
                        i6 = ((iM55979 ^ i5) * 10363) ^ (-660187126);
                        i7 = -1918548451;
                    } else {
                        iM55979 = C0946.m55979("᩷ۚ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 6935) ^ 2113284049;
                        i7 = 1569466108;
                    }
                    break;
                default:
                    cM55712 = C0882.m55712(str, i2);
                    if ('a' <= cM55712) {
                        iM55979 = (C0946.m55979("۠֨") + i4) * (-49);
                        i6 = ((iM55979 ^ i5) * (-2019)) ^ 2013244772;
                        i7 = 1570006836;
                    } else {
                        iM55979 = (C0873.m55680("֡ۤ") ^ i4) * (-115);
                        i6 = ((iM55979 ^ i5) * (-1965)) ^ 848978855;
                        i7 = 1603665604;
                    }
                    break;
            }
        }
    }
}
