package p067l;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۬ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z43S */
/* JADX INFO: loaded from: classes.dex */
public final class C14976 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17043 f42784;

    /* JADX INFO: renamed from: ۗۨܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f82190;

    /* JADX INFO: renamed from: ۜ */
    public static ArrayList f42785;

    /* JADX INFO: renamed from: ۧ */
    public static final AtomicBoolean f42786;

    /* JADX INFO: renamed from: ܳ */
    public static int f42787;

    /* JADX INFO: renamed from: ܽ */
    public static boolean f42788;

    /* JADX INFO: renamed from: ܿ */
    public static C0977 f42789;

    /* JADX INFO: renamed from: ᩳ */
    public static ArrayList f42790;

    /* JADX INFO: renamed from: ᩻ */
    public static C7350 f42791;

    /* JADX INFO: renamed from: ֫ */
    public static native List m34301();

    /* JADX INFO: renamed from: ֫ */
    public static native C18249 m34303(C18249 c18249, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public static native void m34309(C19561 c19561, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, boolean z, boolean z2, InterfaceC5589 interfaceC5589);

    /* JADX INFO: renamed from: ۧ */
    public static native List m34312();

    /* JADX INFO: renamed from: ܿ */
    public static native synchronized void m34320();

    /* JADX INFO: renamed from: ᩻ */
    public static native synchronized void m34323();

    /* JADX WARN: Code duplicated, block: B:54:0x017e A[PHI: r6 r7 r8
      0x017e: PHI (r6v5 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:53:0x017c, B:49:0x015c, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r7v5 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:53:0x017c, B:49:0x015c, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:53:0x017c, B:49:0x015c, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x020d A[PHI: r2 r3
      0x020d: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:65:0x020b, B:61:0x01ec, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char) binds: [B:65:0x020b, B:61:0x01ec, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ */
    public static AbstractC17043 m34322(String str) {
        int iM55680;
        int i;
        int iM55681;
        int i2;
        AbstractC17043 abstractC17043 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1060825502;
        int i8 = ServiceConnectionC1013.f81940;
        int i9 = C1071.f81975;
        int iM55682 = (C0873.m55680("ۢ᩵") + i9) * C0254q.f1218h;
        int i10 = ((iM55682 ^ i8) * 14233) ^ (-51402697);
        int i11 = iM55682 ^ 831499306;
        while (true) {
            StringBuilder sb = null;
            while (true) {
                i7 = ((((i7 ^ i8) * 12557) >> 31) & i10) ^ i11;
                switch (i7) {
                    case -2101392869:
                    case -1853123531:
                        s = sArr[c];
                        s2 = 35580;
                        if (!C1404.m56468()) {
                            iM55681 = C0873.m55680("ۢۛ") ^ i9;
                            i10 = ((iM55681 ^ i8) * (-12723)) ^ 2011462202;
                            i2 = 1876442074;
                            i11 = iM55681 ^ i2;
                        } else {
                            iM55680 = (i8 - C0946.m55979("֨᩹")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i10 = ((iM55680 ^ i9) * 6827) ^ 753133908;
                            i = -240547768;
                            i11 = iM55680 ^ i;
                        }
                        break;
                    case -1911274777:
                    case 1991108422:
                        C1964.m56597();
                        C1024.m56209();
                        iM55680 = (C0873.m55680("۫ᩴ") + i8) * (-57);
                        i10 = ((iM55680 ^ i9) * 27975) ^ 1907842870;
                        i = -89468052;
                        i11 = iM55680 ^ i;
                        break;
                    case -1495595855:
                    case -102016010:
                        i3 = s * s2;
                        i4 = s * s;
                        if (C1012.f81938 >= 0) {
                            iM55680 = (C0873.m55680("۫ᩴ") + i8) * (-57);
                            i10 = ((iM55680 ^ i9) * 27975) ^ 1907842870;
                            i = -89468052;
                        } else {
                            iM55680 = (C0946.m55979("۬ܿ") ^ i9) * 65;
                            i10 = ((iM55680 ^ i8) * (-26263)) ^ (-1390388083);
                            i = -108896165;
                        }
                        i11 = iM55680 ^ i;
                        break;
                    case -1275538210:
                    case 754558856:
                        i5 = 316484100;
                        if (C0937.f81884) {
                            iM55680 = C0946.m55979("᩷۬") ^ i9;
                            i10 = ((iM55680 ^ i8) * (-14675)) ^ (-1007177731);
                            i = -517690076;
                        } else {
                            iM55680 = (C0873.m55680("۫ᩴ") + i8) * (-57);
                            i10 = ((iM55680 ^ i9) * 27975) ^ 1907842870;
                            i = -89468052;
                        }
                        i11 = iM55680 ^ i;
                        break;
                    case -1211900228:
                    case 2134081612:
                        c = 466;
                        if (C1003.m56123() != 0) {
                            iM55680 = C0873.m55680("ܰ᩹") ^ i8;
                            i10 = ((iM55680 ^ i9) * (-23217)) ^ (-60050073);
                            i = -468587341;
                        } else {
                            iM55680 = (C0873.m55680("ۢ֫") + i9) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i10 = ((iM55680 ^ i8) * 1743) ^ 1772100471;
                            i = 1516182034;
                        }
                        i11 = iM55680 ^ i;
                        break;
                    case -1190990010:
                    case 150356676:
                        abstractC17043 = C17853.f53284;
                        if (C0863.f81833 > 0) {
                            short[] sArr2 = f82190;
                            if (C0873.f81841 > 0) {
                                if (ServiceConnectionC1013.f81940 < 0) {
                                    sb = new StringBuilder(C0890.m55726(sArr2, 467, 7, i6));
                                    if (C0898.f81858 > 0) {
                                        int iM55979 = C0946.m55979("᩺᩹") ^ i9;
                                        i10 = 1811198983 ^ ((iM55979 ^ i8) * (-3675));
                                        i11 = iM55979 ^ 526987117;
                                        abstractC17043 = abstractC17043;
                                    } else {
                                        abstractC17043 = abstractC17043;
                                    }
                                    break;
                                }
                            }
                            iM55681 = (i9 - C0873.m55680("۫ۖ")) * 83;
                            i10 = ((iM55681 ^ i8) * (-8065)) ^ 260424768;
                            i2 = -133390423;
                            i11 = iM55681 ^ i2;
                            break;
                        }
                        iM55681 = C0873.m55680("ۢۛ") ^ i9;
                        i10 = ((iM55681 ^ i8) * (-12723)) ^ 2011462202;
                        i2 = 1876442074;
                        i11 = iM55681 ^ i2;
                        break;
                    case -1080540416:
                    case 835661836:
                        return C1024.m56217(abstractC17043, C0845.m55591(sb));
                    case -946059087:
                    case -906924147:
                        if ((i4 + i5) - i3 >= 0) {
                            iM55680 = (C0946.m55979("ᩴܿ") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i10 = ((iM55680 ^ i9) * (-19821)) ^ (-252007322);
                            i = -792776179;
                        } else {
                            iM55680 = C0873.m55680("ۨ֨") ^ i8;
                            i10 = ((iM55680 ^ i9) * (-23621)) ^ 1883941416;
                            i = -1155758095;
                        }
                        i11 = iM55680 ^ i;
                        break;
                    case -608210451:
                    case -241795195:
                        sArr = f82190;
                        if (RunnableC0871.f81839 >= 0) {
                            iM55680 = C0873.m55680("ܰ᩹") ^ i8;
                            i10 = ((iM55680 ^ i9) * (-23217)) ^ (-60050073);
                            i = -468587341;
                        } else {
                            iM55680 = (C0873.m55680("֫᩵") + i8) * (-117);
                            i10 = ((iM55680 ^ i9) * (-7269)) ^ (-1085703142);
                            i = 93564962;
                        }
                        i11 = iM55680 ^ i;
                        break;
                    case -599626716:
                    case -410138743:
                        i6 = 33419;
                        iM55680 = C0873.m55680("ᩴᩴ") ^ i9;
                        i10 = ((iM55680 ^ i8) * 21947) ^ (-1788643438);
                        i = 776917636;
                        i11 = iM55680 ^ i;
                        break;
                    case -559131048:
                    case 1339824901:
                        C1964.m56597();
                        if (C0898.f81858 <= 0) {
                            iM55681 = (i9 - C0873.m55680("۫ۖ")) * 83;
                            i10 = ((iM55681 ^ i8) * (-8065)) ^ 260424768;
                            i2 = -133390423;
                            i11 = iM55681 ^ i2;
                        }
                        iM55680 = (C0873.m55680("۫ᩴ") + i8) * (-57);
                        i10 = ((iM55680 ^ i9) * 27975) ^ 1907842870;
                        i = -89468052;
                        i11 = iM55680 ^ i;
                        break;
                    case -365182406:
                    case 149348490:
                        C1194.m56396();
                        if (!C1024.f81946) {
                            iM55681 = (i9 - C0873.m55680("۫ۖ")) * 83;
                            i10 = ((iM55681 ^ i8) * (-8065)) ^ 260424768;
                            i2 = -133390423;
                            i11 = iM55681 ^ i2;
                        } else {
                            int iM559710 = C0946.m55979("۟ۜ") ^ i9;
                            i10 = ((iM559710 ^ i8) * 32087) ^ (-1057316010);
                            i11 = iM559710 ^ 1768365592;
                        }
                        break;
                    case -329095746:
                    case 970047122:
                        C1003.m56121(sb, str);
                        if (C0930.f81879 > 0) {
                            int iM559711 = C0946.m55979("֡᩶") ^ i8;
                            i11 = iM559711 ^ (-583529079);
                            i10 = ((iM559711 ^ i9) * (-3437)) ^ 2079312275;
                        } else {
                            iM55681 = C0873.m55680("ۢۛ") ^ i9;
                            i10 = ((iM55681 ^ i8) * (-12723)) ^ 2011462202;
                            i2 = 1876442074;
                            i11 = iM55681 ^ i2;
                        }
                        break;
                    case -297078484:
                    case 1231239459:
                        C1124.m56367();
                        if (C0949.f81897 >= 0) {
                            iM55680 = C0873.m55680("ܰ᩹") ^ i8;
                            i10 = ((iM55680 ^ i9) * (-23217)) ^ (-60050073);
                            i = -468587341;
                            i11 = iM55680 ^ i;
                        }
                        iM55680 = (C0873.m55680("۫ᩴ") + i8) * (-57);
                        i10 = ((iM55680 ^ i9) * 27975) ^ 1907842870;
                        i = -89468052;
                        i11 = iM55680 ^ i;
                        break;
                    case -176426311:
                    case 1475062081:
                        i6 = 49655;
                        iM55680 = C0873.m55680("ᩴᩴ") ^ i9;
                        i10 = ((iM55680 ^ i8) * 21947) ^ (-1788643438);
                        i = 776917636;
                        i11 = iM55680 ^ i;
                        break;
                    default:
                        C0906.m55809();
                        return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m34315() {
        boolean z = false;
        AtomicBoolean atomicBoolean = null;
        boolean z2 = false;
        RuntimeException e = null;
        int i = 254587455;
        int i2 = C0906.f81862;
        int i3 = C1017.f81942;
        int iM55680 = (C0873.m55680("ܶܰ") ^ i2) * (-33);
        int i4 = ((iM55680 ^ i3) * (-28207)) ^ 1085753561;
        int i5 = 1318465848;
        while (true) {
            i = ((((i ^ i3) * (-337)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2068025522:
                case 485819300:
                    return;
                case -2032291648:
                case 655330087:
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("ܽ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5205)) ^ (-447061900);
                        i5 = -692383631;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۢ") + i3) * (-15);
                        i4 = ((iM55680 ^ i2) * (-15119)) ^ (-1478930568);
                        i5 = 707803045;
                    }
                    break;
                case -1926245649:
                case 1027495462:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0946.m55979("۟۬") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-8653)) ^ (-1154832682);
                        i5 = -1221783851;
                    } else {
                        iM55680 = C0946.m55979("ۤۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8483) ^ (-1856590424);
                        i5 = -2012749432;
                    }
                    break;
                case -1894962965:
                case 2041790545:
                    C0873.m55678();
                    iM55680 = (i3 - C0873.m55680("۟᩻")) * (-31);
                    i4 = ((iM55680 ^ i2) * 5773) ^ (-1796464307);
                    i5 = 726814345;
                    break;
                case -1768354999:
                case -1352224578:
                    ViewOnClickListenerC0939.m55941();
                    if (C1071.f81975 > 0) {
                        iM55680 = (C0946.m55979("۟۬") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-8653)) ^ (-1154832682);
                        i5 = -1221783851;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۟᩻")) * (-31);
                        i4 = ((iM55680 ^ i2) * 5773) ^ (-1796464307);
                        i5 = 726814345;
                    }
                    break;
                case -1765823779:
                case -659191357:
                    try {
                        C4081.f8988.execute(new RunnableC2906());
                        iM55680 = (i2 - C0873.m55680("ۗ᩵")) * (-73);
                        i4 = ((iM55680 ^ i3) * (-11105)) ^ (-355479467);
                        i5 = 171772943;
                    } catch (RuntimeException e2) {
                        e = e2;
                        iM55680 = (C0946.m55979("ۛۘ") + i3) * (-125);
                        i4 = ((iM55680 ^ i2) * (-31715)) ^ 213118852;
                        i5 = 736063092;
                    }
                    break;
                case -1614289891:
                case -1229029370:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("ۜۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28797)) ^ (-50977898);
                        i5 = 1935427515;
                    } else {
                        iM55680 = C0873.m55680("ۚۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14859)) ^ (-1335299359);
                        i5 = 711660768;
                    }
                    break;
                case -1490236196:
                case 2002808004:
                    if (C1017.m56187() <= 0) {
                        iM55680 = C0873.m55680("ܰ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2489)) ^ 210555648;
                        i5 = 2128566596;
                    } else {
                        iM55680 = C0946.m55979("ۘܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-15921)) ^ (-1012241069);
                        i5 = -1819867057;
                    }
                    break;
                case -1471906525:
                case -598463761:
                    C0917.m55854();
                    if (C0912.f81867 > 0) {
                        iM55680 = C0873.m55680("ܰ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2489)) ^ 210555648;
                        i5 = 2128566596;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۟᩻")) * (-31);
                        i4 = ((iM55680 ^ i2) * 5773) ^ (-1796464307);
                        i5 = 726814345;
                    }
                    break;
                case -1394962078:
                case 2021695227:
                    z2 = false;
                    if (atomicBoolean.compareAndSet(false, z)) {
                        iM55680 = (i3 - C0873.m55680("۬᩸")) * (-121);
                        i4 = ((iM55680 ^ i2) * 9785) ^ 526866959;
                        i5 = 122590833;
                    } else {
                        iM55680 = C0873.m55680("֡ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-21193)) ^ 40694423;
                        i5 = -1161319138;
                    }
                    break;
                case -1310274169:
                case -533684309:
                    C0854.m55595();
                    return;
                case -1276736255:
                case -462929629:
                    atomicBoolean.set(z2);
                    throw e;
                case -1238159231:
                case 2102921443:
                    C0917.m55854();
                    if (C0927.m55873() <= 0) {
                        iM55680 = C0873.m55680("ܽ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5205)) ^ (-447061900);
                        i5 = -692383631;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۟᩻")) * (-31);
                        i4 = ((iM55680 ^ i2) * 5773) ^ (-1796464307);
                        i5 = 726814345;
                    }
                    break;
                case -748676240:
                case 676696308:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("ۜۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28797)) ^ (-50977898);
                        i5 = 1935427515;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩺ۢ")) * (-77);
                        i4 = ((iM55680 ^ i3) * 25543) ^ 75492508;
                        i5 = -142559237;
                    }
                    break;
                case -666460827:
                case 365932169:
                    return;
                case -639246661:
                case 561753207:
                    z = true;
                    atomicBoolean = f42786;
                    if (C0892.f81851) {
                        iM55680 = C0946.m55979("ۧۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 849) ^ (-99009812);
                        i5 = 136619554;
                    } else {
                        iM55680 = (C0946.m55979("۟۬") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-8653)) ^ (-1154832682);
                        i5 = -1221783851;
                    }
                    break;
                case -209405834:
                case 2064287208:
                    if (C1003.m56123() != 0) {
                        iM55680 = (i3 - C0873.m55680("۟᩻")) * (-31);
                        i4 = ((iM55680 ^ i2) * 5773) ^ (-1796464307);
                        i5 = 726814345;
                    } else {
                        iM55680 = C0946.m55979("۠᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-10921)) ^ (-188576892);
                        i5 = 1553346879;
                    }
                    break;
                case 627724473:
                case 1184572018:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (i3 - C0873.m55680("۟᩻")) * (-31);
                        i4 = ((iM55680 ^ i2) * 5773) ^ (-1796464307);
                        i5 = 726814345;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۛ") + i2) * (-7);
                        i4 = ((iM55680 ^ i3) * (-1013)) ^ 280111967;
                        i5 = -987176993;
                    }
                    break;
                case 1111416670:
                case 1259660779:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("ܰ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2489)) ^ 210555648;
                        i5 = 2128566596;
                    } else {
                        iM55680 = C0873.m55680("ᩴᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-19633)) ^ 643864228;
                        i5 = -187690381;
                    }
                    break;
                default:
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("ܽ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5205)) ^ (-447061900);
                        i5 = -692383631;
                    } else {
                        iM55680 = (C0873.m55680("ۗۛ") + i3) * 101;
                        i4 = ((iM55680 ^ i2) * (-6363)) ^ 1491279973;
                        i5 = -1777490478;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m34307(EnumC15303 enumC15303) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1502633123;
        int i5 = ServiceConnectionC1013.f81940;
        int i6 = C0894.f81854;
        int iM55680 = C0873.m55680("۠᩻") ^ i6;
        int i7 = ((iM55680 ^ i5) * 7549) ^ 1526511886;
        int i8 = -648420857;
        while (true) {
            i4 = ((((i4 ^ i5) * 22173) >> 31) & i7) ^ (iM55680 ^ i8);
            switch (i4) {
                case -1798104156:
                case 2107096417:
                    break;
                case -1786865080:
                case -424904551:
                    f42787 = i3;
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0946.m55979("۠᩷") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-22127)) ^ (-1305106312);
                        i8 = -370532786;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ۨ֨")) * 83;
                        i7 = ((iM55680 ^ i6) * 17113) ^ (-735796264);
                        i8 = -1409408566;
                    }
                    break;
                case -1729038051:
                case -170807467:
                    i = f42787;
                    i2 = 1;
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0873.m55680("ۜ֫") ^ i5) * 87;
                        i7 = ((iM55680 ^ i6) * (-32229)) ^ 1964954951;
                        i8 = -503307397;
                    } else {
                        iM55680 = C0946.m55979("ۖۖ") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-6455)) ^ 1578612628;
                        i8 = 412499941;
                    }
                    break;
                case -1670070529:
                case 633661746:
                    if (C1017.m56187() <= 0) {
                        iM55680 = (C0873.m55680("ۜ֫") ^ i5) * 87;
                        i7 = ((iM55680 ^ i6) * (-32229)) ^ 1964954951;
                        i8 = -503307397;
                    } else {
                        iM55680 = (C0946.m55979("۟᩶") + i5) * 99;
                        i7 = ((iM55680 ^ i6) * (-11197)) ^ 445960056;
                        i8 = 422969782;
                    }
                    break;
                case -1518846560:
                case -194965419:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0946.m55979("۠᩷") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-22127)) ^ (-1305106312);
                        i8 = -370532786;
                    } else {
                        iM55680 = (C0873.m55680("ܶ᩸") ^ i6) * 9;
                        i7 = ((iM55680 ^ i5) * (-10589)) ^ (-1981146878);
                        i8 = -722951494;
                    }
                    break;
                case -1453046630:
                case 29328058:
                    C0873.m55678();
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0873.m55680("ۜ֫") ^ i5) * 87;
                        i7 = ((iM55680 ^ i6) * (-32229)) ^ 1964954951;
                        i8 = -503307397;
                    } else {
                        iM55680 = C0873.m55680("᩶ۜ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-21199)) ^ 2143456199;
                        i8 = 1138976972;
                    }
                    break;
                case -1395748001:
                case 791217472:
                    if (!C0947.f81895) {
                        iM55680 = (C0946.m55979("᩸ۘ") + i6) * 35;
                        i7 = ((iM55680 ^ i5) * (-8867)) ^ 127991519;
                        i8 = -21127199;
                    } else {
                        iM55680 = (C0873.m55680("ۜ֫") ^ i5) * 87;
                        i7 = ((iM55680 ^ i6) * (-32229)) ^ 1964954951;
                        i8 = -503307397;
                    }
                    break;
                case -1318760071:
                case -92872159:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("ۜ֫") ^ i5) * 87;
                        i7 = ((iM55680 ^ i6) * (-32229)) ^ 1964954951;
                        i8 = -503307397;
                    } else {
                        iM55680 = (C0946.m55979("۫ۙ") + i5) * (-39);
                        i7 = ((iM55680 ^ i6) * 5633) ^ 1908066755;
                        i8 = 416520049;
                    }
                    break;
                case -1268943825:
                case -1116306205:
                    i3 = i + i2;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0946.m55979("᩸ۘ") + i6) * 35;
                        i7 = ((iM55680 ^ i5) * (-8867)) ^ 127991519;
                        i8 = -21127199;
                    } else {
                        iM55680 = C0873.m55680("᩹۠") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-887)) ^ 1928895839;
                        i8 = 1809270391;
                    }
                    break;
                case -1218992309:
                case -828877181:
                    C0861.m55626();
                    C0955.m56025();
                    break;
                case -676745855:
                case 1411451125:
                    if (enumC15303.m34840()) {
                        iM55680 = C0946.m55979("ۧ᩺") ^ i5;
                        i7 = ((iM55680 ^ i6) * 30277) ^ (-587243945);
                        i8 = -1855932318;
                    } else {
                        iM55680 = C0873.m55680("۬ۗ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 13419) ^ (-1322094354);
                        i8 = 2024372055;
                    }
                    break;
                case -591796595:
                case -19650195:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("۠᩷") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-22127)) ^ (-1305106312);
                        i8 = -370532786;
                    } else {
                        iM55680 = C0946.m55979("᩵ᩳ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 29379) ^ 1119709464;
                        i8 = -1463835963;
                    }
                    break;
                case 509986760:
                case 1015168799:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("᩶ۜ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-21199)) ^ 2143456199;
                        i8 = 1138976972;
                    } else {
                        iM55680 = (C0946.m55979("᩸᩹") ^ i5) * (-75);
                        i7 = ((iM55680 ^ i6) * (-16329)) ^ 1510367820;
                        i8 = 623391132;
                    }
                    break;
                case 524669269:
                case 1778461970:
                    RunnableC0938.m55938();
                    RunnableC0871.m55672();
                    iM55680 = C0873.m55680("᩶ۜ") ^ i6;
                    i7 = ((iM55680 ^ i5) * (-21199)) ^ 2143456199;
                    i8 = 1138976972;
                    break;
                case 766007417:
                case 1857675650:
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0946.m55979("۠᩷") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-22127)) ^ (-1305106312);
                        i8 = -370532786;
                    } else {
                        iM55680 = C0873.m55680("ۗۡ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-5257)) ^ (-1176436958);
                        i8 = -1826809781;
                    }
                    break;
                case 1223737766:
                case 1687352496:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0946.m55979("᩸ۘ") + i6) * 35;
                        i7 = ((iM55680 ^ i5) * (-8867)) ^ 127991519;
                        i8 = -21127199;
                    } else {
                        iM55680 = (C0873.m55680("᩻ۚ") + i5) * (-43);
                        i7 = ((iM55680 ^ i6) * 2213) ^ (-730863771);
                        i8 = -1660932540;
                    }
                    break;
                case 1311020947:
                case 2145613274:
                    f42791.mo4062(C0912.m55836(i3));
                    iM55680 = C0946.m55979("ۧ᩺") ^ i5;
                    i7 = ((iM55680 ^ i6) * 30277) ^ (-587243945);
                    i8 = -1855932318;
                    break;
                default:
                    if (C1194.m56396() <= 0) {
                        iM55680 = C0873.m55680("᩶ۜ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-21199)) ^ 2143456199;
                        i8 = 1138976972;
                    } else {
                        iM55680 = (C0873.m55680("ۚ֫") ^ i6) * (-95);
                        i7 = ((iM55680 ^ i5) * (-13537)) ^ (-1579639272);
                        i8 = 2129738517;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x02cf A[PHI: r5 r6 r9 r10 r18 r20 r21
      0x02cf: PHI (r5v3 short[]) = (r5v2 short[]), (r5v1 short[]), (r5v1 short[]) binds: [B:73:0x02cd, B:59:0x0227, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r6v3 char) = (r6v2 char), (r6v1 char), (r6v1 char) binds: [B:73:0x02cd, B:59:0x0227, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:73:0x02cd, B:59:0x0227, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r10v3 short) = (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:73:0x02cd, B:59:0x0227, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r18v22 l.ۖ᩵) = (r18v5 l.ۖ᩵), (r18v8 l.ۖ᩵), (r18v25 l.ۖ᩵) binds: [B:73:0x02cd, B:59:0x0227, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r20v20 l.ܽܳ᩷) = (r20v0 l.ܽܳ᩷), (r20v3 l.ܽܳ᩷), (r20v22 l.ܽܳ᩷) binds: [B:73:0x02cd, B:59:0x0227, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r21v10 l.ܶ᩵ܿ) = (r21v0 l.ܶ᩵ܿ), (r21v3 l.ܶ᩵ܿ), (r21v11 l.ܶ᩵ܿ) binds: [B:73:0x02cd, B:59:0x0227, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (p067l.C1003.m56123() != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (p067l.C0967.f81910 < 0) goto L16;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m34306(String str) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        C0977 c0977;
        int iM559711;
        int i5;
        int i6;
        C0977 c0978 = null;
        C18249 c18249 = null;
        AbstractC17043 abstractC17043M34322 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1584457190;
        int i13 = C1046.f81962;
        int i14 = C1071.f81975;
        int iM55680 = C0873.m55680("֫᩵") ^ i14;
        int i15 = ((iM55680 ^ i13) * 4733) ^ (-951747627);
        int i16 = iM55680 ^ 1764235825;
        StringBuilder sb = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 23015) >> 31));
            switch (i12) {
                case -1941392354:
                case -1125096876:
                    break;
                case -1876544229:
                case -1782917577:
                    c0978 = c0978;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    s = sArr[c];
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = (C0946.m55979("ܶܳ") ^ i13) * 115;
                        i = ((iM55979 ^ i14) * (-22755)) ^ (-486044446);
                        i2 = 1619823845;
                        i6 = iM55979 ^ i2;
                        c18249 = c18249;
                        abstractC17043M34322 = abstractC17043M34322;
                        c0977 = c0978;
                        i16 = i6;
                        i15 = i;
                        c0978 = c0977;
                    }
                    int iM55681 = (i14 - C0873.m55680("ۨ᩺")) * 29;
                    i = ((iM55681 ^ i13) * 26489) ^ (-1640864206);
                    i6 = iM55681 ^ 1672837605;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    sb = null;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case -1676790965:
                case -1163299617:
                    c0978 = c0978;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    i7 = s * 2;
                    if (C0989.m56095() > 0) {
                        iM55979 = (i14 - C0946.m55979("֡ܳ")) * 13;
                        i = ((iM55979 ^ i13) * 27297) ^ 1121205225;
                        i2 = 1365288431;
                        i6 = iM55979 ^ i2;
                        c18249 = c18249;
                        abstractC17043M34322 = abstractC17043M34322;
                        c0977 = c0978;
                        i16 = i6;
                        i15 = i;
                        c0978 = c0977;
                    } else {
                        abstractC17043M34322 = abstractC17043M34322;
                        int iM55682 = (i14 - C0873.m55680("֫ۛ")) * (-45);
                        i = ((iM55682 ^ i13) * 25223) ^ (-1150023605);
                        i6 = iM55682 ^ (-1914073660);
                        c18249 = c18249;
                        sb = null;
                        c0977 = c0978;
                        i16 = i6;
                        i15 = i;
                        c0978 = c0977;
                    }
                    break;
                case -1645574143:
                case -1495158695:
                    c0978 = c0978;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    i8 = i7 + 1;
                    s2 = 1;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i14 - C0946.m55979("᩹ܺ")) * 99;
                        i = ((iM55979 ^ i13) * (-8803)) ^ (-1845280090);
                        i2 = -196159004;
                    } else {
                        iM55979 = (i13 - C0873.m55680("᩺ۚ")) * 89;
                        i = ((iM55979 ^ i14) * 26651) ^ 1792539131;
                        i2 = -1841861636;
                    }
                    i6 = iM55979 ^ i2;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case -1314274251:
                case -1273736159:
                    c0978 = f42789;
                    if (C0894.m55769() >= 0) {
                        iM559711 = (i13 - C0873.m55680("ۖۚ")) * (-119);
                        c0978 = c0978;
                        i = ((iM559711 ^ i14) * 22975) ^ (-1300896347);
                        i5 = 2040029206;
                    } else {
                        iM559711 = (C0946.m55979("ۨܳ") + i13) * (-101);
                        c0978 = c0978;
                        i = ((iM559711 ^ i14) * 30227) ^ (-100848534);
                        i5 = -941774146;
                    }
                    i6 = iM559711 ^ i5;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case -1195351405:
                case 1370377245:
                    c0978 = c0978;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    int i17 = s + s2;
                    if ((i17 * i17) - i8 >= 0) {
                        iM55979 = C0946.m55979("ܶۗ") ^ i13;
                        i = ((iM55979 ^ i14) * 19055) ^ (-1325628712);
                        i2 = 1597509967;
                    } else {
                        iM55979 = (i14 - C0873.m55680("ܳܽ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i13) * (-17291)) ^ (-1832604269);
                        i2 = 783645379;
                    }
                    i6 = iM55979 ^ i2;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case -963227138:
                case 868610451:
                    c18249.m41532();
                    c0978 = c0978;
                    iM559711 = (i14 - C0873.m55680("۬ۖ")) * (-43);
                    i = ((iM559711 ^ i13) * (-4693)) ^ (-869862427);
                    i5 = 1477441915;
                    i6 = iM559711 ^ i5;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case -950535840:
                case 96667448:
                    c18249 = (C18249) c0978.getOrDefault(str, null);
                    if (c18249 != null) {
                        iM559711 = C0873.m55680("ۢۙ") ^ i13;
                        c0978 = c0978;
                        i = ((iM559711 ^ i14) * (-13259)) ^ (-174397187);
                        i5 = 1695332099;
                    } else {
                        c0978 = c0978;
                        iM559711 = (i14 - C0873.m55680("۬ۖ")) * (-43);
                        i = ((iM559711 ^ i13) * (-4693)) ^ (-869862427);
                        i5 = 1477441915;
                    }
                    i6 = iM559711 ^ i5;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case -784945811:
                case 920056653:
                    C0882.m55710();
                    C0992.m56107();
                    c0978 = c0978;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    int iM55683 = (i14 - C0873.m55680("ۨ᩺")) * 29;
                    i = ((iM55683 ^ i13) * 26489) ^ (-1640864206);
                    i6 = iM55683 ^ 1672837605;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    sb = null;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case -665694086:
                case 343091250:
                    c0978 = c0978;
                    m34320();
                    short[] sArr3 = f82190;
                    if (C1929.m56553()) {
                        c18249 = c18249;
                        abstractC17043M34322 = abstractC17043M34322;
                        int iM55684 = (i14 - C0873.m55680("ۨ᩺")) * 29;
                        i = ((iM55684 ^ i13) * 26489) ^ (-1640864206);
                        i6 = iM55684 ^ 1672837605;
                        c18249 = c18249;
                        abstractC17043M34322 = abstractC17043M34322;
                        sb = null;
                        c0977 = c0978;
                        i16 = i6;
                        i15 = i;
                    } else {
                        c18249 = c18249;
                        if (RunnableC1014.f81941 <= 0) {
                            int iM55685 = (i14 - C0873.m55680("֫ۛ")) * (-45);
                            i = ((iM55685 ^ i13) * 25223) ^ (-1150023605);
                            i6 = iM55685 ^ (-1914073660);
                            c18249 = c18249;
                            sb = null;
                            c0977 = c0978;
                            i16 = i6;
                            i15 = i;
                        } else {
                            AbstractC17043 abstractC17043 = abstractC17043M34322;
                            StringBuilder sb2 = new StringBuilder(RunnableC0938.m55936(sArr3, 130, 12, i9));
                            C0912.m55825(sb2, str);
                            if (C1229.f82066 >= 0) {
                                iM559710 = (C0946.m55979("᩻ۗ") ^ i13) * 61;
                                i3 = ((iM559710 ^ i14) * (-12383)) ^ (-1469492445);
                                i4 = 1089213170;
                            } else {
                                iM559710 = C0946.m55979("۟ۛ") ^ i14;
                                i3 = ((iM559710 ^ i13) * 22579) ^ (-641957149);
                                i4 = -734584462;
                            }
                            int i18 = iM559710 ^ i4;
                            sb = sb2;
                            i15 = i3;
                            c18249 = c18249;
                            abstractC17043M34322 = abstractC17043;
                            c0977 = c0978;
                            i16 = i18;
                        }
                    }
                    c0978 = c0977;
                    break;
                case -426853172:
                case -225696658:
                    c0978 = c0978;
                    C16907.m38470(C0863.m55639(sb));
                    m34314(str);
                    if (C1017.f81942 < 0) {
                        iM559711 = C0946.m55979("ܺܺ") ^ i14;
                        i = ((iM559711 ^ i13) * 4377) ^ (-1648749093);
                        i5 = -1760363083;
                        i6 = iM559711 ^ i5;
                        c0977 = c0978;
                        i16 = i6;
                        i15 = i;
                        c0978 = c0977;
                    }
                    c18249 = c18249;
                    int iM55686 = (i14 - C0873.m55680("֫ۛ")) * (-45);
                    i = ((iM55686 ^ i13) * 25223) ^ (-1150023605);
                    i6 = iM55686 ^ (-1914073660);
                    c18249 = c18249;
                    sb = null;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case -291212899:
                case 1060564657:
                    C0912.m55833();
                    if (C1028.m56247() < 0) {
                        c0978 = c0978;
                        c18249 = c18249;
                        abstractC17043M34322 = abstractC17043M34322;
                        iM55979 = (i14 - C0946.m55979("᩹ܺ")) * 99;
                        i = ((iM55979 ^ i13) * (-8803)) ^ (-1845280090);
                        i2 = -196159004;
                        i6 = iM55979 ^ i2;
                        c18249 = c18249;
                        abstractC17043M34322 = abstractC17043M34322;
                        c0977 = c0978;
                        i16 = i6;
                        i15 = i;
                        c0978 = c0977;
                    }
                    c0978 = c0978;
                    c18249 = c18249;
                    int iM55687 = (i14 - C0873.m55680("֫ۛ")) * (-45);
                    i = ((iM55687 ^ i13) * 25223) ^ (-1150023605);
                    i6 = iM55687 ^ (-1914073660);
                    c18249 = c18249;
                    sb = null;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case 10060499:
                case 1560776808:
                    C0947.m55997();
                    C0873.m55678();
                    break;
                case 157567091:
                case 647577589:
                    abstractC17043M34322 = m34322(str);
                    sArr2 = f82190;
                    i11 = 5;
                    if (RunnableC0938.f81886 >= 0) {
                        c0978 = c0978;
                        c18249 = c18249;
                        i10 = 142;
                        int iM55688 = (i14 - C0873.m55680("֫ۛ")) * (-45);
                        i = ((iM55688 ^ i13) * 25223) ^ (-1150023605);
                        i6 = iM55688 ^ (-1914073660);
                        c18249 = c18249;
                        sb = null;
                        c0977 = c0978;
                        i16 = i6;
                        i15 = i;
                        c0978 = c0977;
                    } else {
                        int iM55689 = (C0873.m55680("ܿ۠") + i13) * (-77);
                        i16 = iM55689 ^ (-1560410819);
                        i15 = ((iM55689 ^ i14) * (-6707)) ^ 203551444;
                        i10 = 142;
                    }
                    break;
                case 166817161:
                case 1568936907:
                    i9 = 25457;
                    iM55979 = C0946.m55979("ܿ᩸") ^ i13;
                    i = ((iM55979 ^ i14) * (-31421)) ^ (-2144867406);
                    i2 = -1902431804;
                    i6 = iM55979 ^ i2;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                case 220734937:
                case 1554102541:
                    break;
                case 973271497:
                case 1206443205:
                    RunnableC1014.m56173(C1024.m56217(abstractC17043M34322, C1044.m56276(sArr2, i10, i11, i9)));
                    break;
                case 1335037659:
                case 2099679383:
                    c0978 = c0978;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    sArr = f82190;
                    c = 129;
                    if (C1404.f82149 >= 0) {
                        iM55979 = (i14 - C0946.m55979("᩹ܺ")) * 99;
                        i = ((iM55979 ^ i13) * (-8803)) ^ (-1845280090);
                        i2 = -196159004;
                    } else {
                        iM55979 = C0946.m55979("ᩴۡ") ^ i14;
                        i = ((iM55979 ^ i13) * 21085) ^ 912248590;
                        i2 = -1291701734;
                    }
                    i6 = iM55979 ^ i2;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
                default:
                    i9 = 7373;
                    iM55979 = C0946.m55979("ܿ᩸") ^ i13;
                    i = ((iM55979 ^ i14) * (-31421)) ^ (-2144867406);
                    i2 = -1902431804;
                    i6 = iM55979 ^ i2;
                    c18249 = c18249;
                    abstractC17043M34322 = abstractC17043M34322;
                    c0977 = c0978;
                    i16 = i6;
                    i15 = i;
                    c0978 = c0977;
                    break;
            }
            return;
        }
    }

    static {
        ApplicationC14266.m56479(IShizukuService.Stub.TRANSACTION_getFlagsForUid);
        f82190 = new short[]{5166, 18442, 18454, 18447, 18461, 18451, 18452, 18441, 4738, -8824, -8813, -8820, -8821, -8813, -8819, -8822, -8813, -8819, -8822, -8813, -8820, -8827, -8813, -8819, -8827, -8813, -8820, -8828, -8820, -8819, -8820, -8820, -8820, -8817, -8820, -8817, -8719, -8820, -8818, -8820, -8823, -8820, -8824, -8820, -8821, -16595, -20219, -18229, 17988, -30085, -28709, 6435, -29553, -29551, -21620, 22430, -20903, 19509, -20779, -29807, -29517, 18744, -19417, -18574, -17510, -29827, 23737, -10088, -9997, -10002, -9990, -10078, -10002, -10055, -10110, -10002, -10087, -10084, -10082, -10088, -9997, -10002, -9990, -10078, -10002, -10055, -10110, -10002, -10087, -10084, -10003, -10082, -10007, -10088, -9997, -10002, -9990, -10078, -10002, -10055, -10110, -10002, -10087, -10084, -10082, -29811, -20319, -23620, -27127, 21877, 16540, 6676, -3305, -3301, -3308, -3309, -3300, -3297, -3319, -3314, -3244, -3312, -3319, -3307, -3308, 27284, -26576, 30485, -3216, 1056, 25394, 25373, 25364, 25360, 25347, 25425, 25365, 25360, 25349, 25360, 25419, 25425, 25367, 25368, 25373, 25364, 25346, 1883, -526, -530, -521, -539, -533, -532, 7172, 13893, 13922, 13951, 13944, 13933, 13920, 13920, 13925, 13922, 13931, 13858, 13858, 13858, 13868, 13935, 13923, 13928, 13929, 13858, 13926, 13933, 13950, 13920, 13925, 13934, 13951, 13859, 13858, 13926, 13933, 13946, 13933, 13951, 13950, 13935, 13859, 13935, 13923, 13921, 13948, 13925, 13920, 13929, 13933, 13951, 13951, 13929, 13944, 13951, 13859, 13858, 13921, 13944, 13920, 13951, 13950, 13935, 13920, 13925, 13934, 13951, 13935, 13920, 13933, 13951, 13951, 13929, 13951, 13951, 13950, 13935, 13858, 13926, 13933, 13950, 13904, 13934, 13933, 13922, 13928, 13950, 13923, 13925, 13928, 13904, 13858, 13951, 13945, 13948, 13948, 13923, 13950, 13944, 13904, 13858, 13933, 13922, 13922, 13923, 13944, 13933, 13944, 13925, 13923, 13922, 13904, 13858, 13933, 13922, 13928, 13950, 13923, 13925, 13928, 13940, 13858, 13933, 13922, 13922, 13923, 13944, 13933, 13944, 13925, 13923, 13922, 13858, 13904, 13934, 13889, 13912, 13916, 13920, 13945, 13931, 13925, 13922, 13903, 13923, 13922, 13944, 13929, 13940, 13944, 13904, 13934, 13916, 13920, 13945, 13931, 13925, 13922, 13903, 13923, 13922, 13944, 13929, 13940, 13944, 13935, 13923, 13928, 13929, 13907, 13948, 13933, 13944, 13935, 13924, 13948, 13920, 13945, 13931, 13925, 13922, 13858, 13921, 13944, 13948, 13930, 13925, 13920, 13929, 13951, 13893, 13922, 13951, 13944, 13933, 13920, 13920, 13868, 13930, 13933, 13925, 13920, 13858, 13868, 13860, 13889, 13923, 13946, 13929, 13868, 13928, 13925, 13950, 13861, 13919, 13945, 13935, 13935, 13929, 13951, 13951, 13930, 13945, 13920, 13868, 13925, 13922, 13951, 13944, 13933, 13920, 13920, 13933, 13944, 13925, 13923, 13922, 13858, 1477, 3040, 9854, -7288, -7245, -7244, -7245, -7250, -7255, -7236, -7247, -7247, -7193, -7171, 8884, -27447, -27407, -27405, -27422, -27451, -27394, -27401, -27420, -27405, -27406, -27450, -27420, -27405, -27408, -27405, -27420, -27405, -27400, -27403, -27405, -27419, -27458, -27464, -27464, -27464, -27457, 2687, -21526, -21530, -21523, -21524, -21526, -21530, -21523, -21524, -21546, -21511, -21528, -21507, -21526, -21535, -21511, -21531, -21508, -21522, -21536, -21529, -21593, -21532, -21507, -21511, -21564, -21555, -21572, -21591, -21526, -21535, -21528, -21529, -21522, -21524, -21523, -21581, -21591, 4209, -32005, -32025, -32002, -32020, -32030, -32027, -32092};
        AbstractC17043 abstractC17043 = null;
        String strM55822 = null;
        ArrayList arrayList = null;
        C7350 c7350 = null;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr = null;
        int i4 = 0;
        int i5 = -111291308;
        int i6 = C1017.f81942;
        int i7 = C1025.f81947;
        int iM55979 = (i6 - C0946.m55979("۫ۨ")) * 39;
        int i8 = ((iM55979 ^ i7) * 14077) ^ (-1082390138);
        int i9 = -2020132372;
        while (true) {
            i5 = ((((i5 ^ i7) * 2555) >> 31) & i8) ^ (iM55979 ^ i9);
            switch (i5) {
                case -2112070002:
                case 63633804:
                    i3 = 65187;
                    iM55979 = C0873.m55680("۬ۘ") ^ i7;
                    i8 = ((iM55979 ^ i6) * 9777) ^ 121150642;
                    i9 = 937572700;
                    break;
                case -1828527692:
                case -1016781347:
                    abstractC17043 = C17853.f53284;
                    sArr = f82190;
                    i4 = 1;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0873.m55680("ۧ۫") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-2847)) ^ (-5847484);
                        i9 = -1714536531;
                    } else {
                        iM55979 = C0873.m55680("᩻ᩴ") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-27259)) ^ 627416463;
                        i9 = -1276004;
                    }
                    break;
                case -1810551866:
                case -645712622:
                    i2 = 182817441 + i;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (i6 - C0873.m55680("ܶܳ")) * (-89);
                        i8 = ((iM55979 ^ i7) * (-25703)) ^ 1452846174;
                        i9 = 1211378824;
                    } else {
                        iM55979 = (C0873.m55680("ܽ۠") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM55979 ^ i6) * (-15405)) ^ (-140207626);
                        i9 = 1717039620;
                    }
                    break;
                case -1763678079:
                case 382928498:
                    i3 = 18554;
                    iM55979 = C0873.m55680("۬ۘ") ^ i7;
                    i8 = ((iM55979 ^ i6) * 9777) ^ 121150642;
                    i9 = 937572700;
                    break;
                case -1755139636:
                case 1628875220:
                    int i10 = s + 13521;
                    if ((i2 + i2) - (i10 * i10) >= 0) {
                        iM55979 = C0873.m55680("ۚܰ") ^ i7;
                        i8 = ((iM55979 ^ i6) * (-15493)) ^ (-1715891592);
                        i9 = -497804279;
                    } else {
                        iM55979 = C0946.m55979("ۖܳ") ^ i6;
                        i8 = ((iM55979 ^ i7) * 7689) ^ 336478088;
                        i9 = -764203301;
                    }
                    break;
                case -1682717895:
                case 1567942490:
                    f42788 = true;
                    f42786 = new AtomicBoolean();
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("ۧ۫") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-2847)) ^ (-5847484);
                        i9 = -1714536531;
                    } else {
                        iM55979 = C0873.m55680("֫᩻") ^ i7;
                        i8 = ((iM55979 ^ i6) * (-28251)) ^ (-1230685200);
                        i9 = 172575071;
                    }
                    break;
                case -1678261258:
                case -208433561:
                    c7350.m4063((InterfaceC3326) new C21013());
                    return;
                case -1520266622:
                case 1804100009:
                    if (C0967.f81910 < 0) {
                        iM55979 = (i6 - C0873.m55680("ܶܳ")) * (-89);
                        i8 = ((iM55979 ^ i7) * (-25703)) ^ 1452846174;
                        i9 = 1211378824;
                    } else {
                        iM55979 = C0873.m55680("ۧ۫") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-2847)) ^ (-5847484);
                        i9 = -1714536531;
                    }
                    break;
                case -1475888394:
                case 777438351:
                    strM55822 = C0912.m55822(sArr, i4, 7, i3);
                    if (C0890.m55740()) {
                        iM55979 = (C0873.m55680("ۛۨ") ^ i7) * 29;
                        i8 = ((iM55979 ^ i6) * (-32617)) ^ (-554261643);
                        i9 = 1657905772;
                    } else {
                        iM55979 = C0873.m55680("ۧ۫") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-2847)) ^ (-5847484);
                        i9 = -1714536531;
                    }
                    break;
                case -1343681074:
                case 381764906:
                    f42790 = new ArrayList();
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i6 - C0946.m55979("ܳᩴ")) * (-111);
                        i8 = ((iM55979 ^ i7) * 22125) ^ (-2003754001);
                        i9 = 2057799952;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ܺ֨")) * (-5);
                        i8 = ((iM55979 ^ i6) * 3983) ^ (-1204291966);
                        i9 = 1680430495;
                    }
                    break;
                case -809555732:
                case -371354839:
                    f42785 = arrayList;
                    f42789 = new C0977();
                    if (C1003.m56123() != 0) {
                        iM55979 = C0946.m55979("᩻᩶") ^ i7;
                        i8 = ((iM55979 ^ i6) * 237) ^ (-1244469447);
                        i9 = 7678311;
                    } else {
                        iM55979 = (i6 - C0873.m55680("᩻ܰ")) * 37;
                        i8 = ((iM55979 ^ i7) * 24775) ^ (-93829576);
                        i9 = 1501975171;
                    }
                    break;
                case -778067220:
                case -700806465:
                    f42784 = C1024.m56217(abstractC17043, strM55822);
                    arrayList = new ArrayList();
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0873.m55680("ᩴۨ") + i7) * 11;
                        i8 = ((iM55979 ^ i6) * 29841) ^ 1587130686;
                        i9 = -936372471;
                    } else {
                        iM55979 = C0946.m55979("ۢۤ") ^ i6;
                        i8 = ((iM55979 ^ i7) * 3075) ^ 2129807978;
                        i9 = 503773412;
                    }
                    break;
                case -259031541:
                case 1590615411:
                    if (AbstractC0942.f81890 > 0) {
                        iM55979 = C0946.m55979("᩻᩶") ^ i7;
                        i8 = ((iM55979 ^ i6) * 237) ^ (-1244469447);
                        i9 = 7678311;
                    } else {
                        iM55979 = C0873.m55680("ۧ۫") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-2847)) ^ (-5847484);
                        i9 = -1714536531;
                    }
                    break;
                case -185489455:
                case 953222052:
                    C0992.m56107();
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0873.m55680("ᩴۨ") + i7) * 11;
                        i8 = ((iM55979 ^ i6) * 29841) ^ 1587130686;
                        i9 = -936372471;
                    } else {
                        iM55979 = C0873.m55680("ۧ۫") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-2847)) ^ (-5847484);
                        i9 = -1714536531;
                    }
                    break;
                case -20036990:
                case 1406865953:
                    f42787 = 0;
                    if (C0863.f81833 <= 0) {
                        iM55979 = (i6 - C0873.m55680("ܶܳ")) * (-89);
                        i8 = ((iM55979 ^ i7) * (-25703)) ^ 1452846174;
                        i9 = 1211378824;
                    } else {
                        f42791 = new C7350(C0912.m55836(0));
                        c7350 = C9269.f25170;
                        if (C1017.f81942 >= 0) {
                            iM55979 = (i6 - C0946.m55979("ܳᩴ")) * (-111);
                            i8 = ((iM55979 ^ i7) * 22125) ^ (-2003754001);
                            i9 = 2057799952;
                        } else {
                            iM55979 = (C0873.m55680("۠ۧ") ^ i6) * (-93);
                            i8 = ((iM55979 ^ i7) * (-32201)) ^ (-520403753);
                            i9 = 1022155360;
                        }
                    }
                    break;
                case 1215819523:
                case 1701785252:
                    C1017.m56187();
                    throw new RuntimeException();
                case 1237895842:
                case 1597026285:
                    AbstractC0942.m55971();
                    iM55979 = C0873.m55680("ۧ۫") ^ i6;
                    i8 = ((iM55979 ^ i7) * (-2847)) ^ (-5847484);
                    i9 = -1714536531;
                    break;
                default:
                    s = f82190[0];
                    i = s * s;
                    if (C1046.m56302() != 0) {
                        iM55979 = (i6 - C0946.m55979("ܳᩴ")) * (-111);
                        i8 = ((iM55979 ^ i7) * 22125) ^ (-2003754001);
                        i9 = 2057799952;
                    } else {
                        iM55979 = C0946.m55979("ۗܺ") ^ i6;
                        i8 = ((iM55979 ^ i7) * 9553) ^ (-1939723024);
                        i9 = 1168964815;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m34311(ArrayList arrayList) {
        Iterator itM56090 = null;
        String str = null;
        C0977 c0977 = null;
        Object obj = null;
        Object orDefault = null;
        int i = 745206185;
        int i2 = C1012.f81938;
        int i3 = C1404.f82149;
        int iM55979 = C0946.m55979("ۗ֡") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-23577)) ^ 476307736;
        int i5 = 1525309020;
        while (true) {
            i = ((((i ^ i3) * (-14899)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2092000608:
                case 1346209211:
                    if (C1044.m56286() <= 0) {
                        iM55979 = C0946.m55979("ܺۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 833) ^ (-363917853);
                        i5 = 1145519408;
                    } else {
                        iM55979 = (C0946.m55979("ܰ᩸") ^ i3) * 61;
                        i4 = ((iM55979 ^ i2) * 32555) ^ 2078014312;
                        i5 = -1374019340;
                    }
                    break;
                case -1830313122:
                case -324927084:
                    c0977 = f42789;
                    obj = null;
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0873.m55680("۟᩸") + i3) * 15;
                        i4 = ((iM55979 ^ i2) * (-3879)) ^ 13724234;
                        i5 = -594789625;
                    } else {
                        iM55979 = (C0873.m55680("ᩴ᩸") ^ i2) * 97;
                        i4 = ((iM55979 ^ i3) * (-7597)) ^ 253822437;
                        i5 = -327734816;
                    }
                    break;
                case -1818866873:
                case 1680561396:
                    if (C0882.m55713()) {
                        iM55979 = C0873.m55680("۠ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12601) ^ (-277991478);
                        i5 = -1455186220;
                    } else {
                        iM55979 = (C0946.m55979("֨ۜ") + i2) * 37;
                        i4 = ((iM55979 ^ i3) * (-13563)) ^ 221703118;
                        i5 = -545327486;
                    }
                    break;
                case -1776711243:
                case 1133031008:
                    str = (String) RunnableC0897.m55785(itM56090);
                    if (RunnableC0938.m55937(arrayList, str)) {
                        iM55979 = (i3 - C0873.m55680("֡ܶ")) * (-93);
                        i4 = ((iM55979 ^ i2) * (-693)) ^ (-4252885);
                        i5 = -389219132;
                    } else {
                        iM55979 = (C0873.m55680("ۗ۫") + i3) * (-3);
                        i4 = ((iM55979 ^ i2) * (-4261)) ^ 1029341058;
                        i5 = 1876752612;
                    }
                    break;
                case -1741737751:
                case 88781149:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("ۡۛ") ^ i3) * (-51);
                        i4 = ((iM55979 ^ i2) * 1309) ^ 1779950895;
                        i5 = -968294131;
                    } else {
                        iM55979 = C0873.m55680("ۙ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-32447)) ^ 1216723625;
                        i5 = 911874734;
                    }
                    break;
                case -1307938916:
                case 1326390125:
                    if (C1046.f81962 > 0) {
                        iM55979 = (C0873.m55680("ۡۛ") ^ i3) * (-51);
                        i4 = ((iM55979 ^ i2) * 1309) ^ 1779950895;
                        i5 = -968294131;
                    } else {
                        iM55979 = C0946.m55979("ܺۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 833) ^ (-363917853);
                        i5 = 1145519408;
                    }
                    break;
                case -1144411243:
                case 796001365:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("ۘۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-297)) ^ 806852731;
                        i5 = -1288140684;
                    } else {
                        iM55979 = (C0873.m55680("ۡۛ") ^ i3) * (-51);
                        i4 = ((iM55979 ^ i2) * 1309) ^ 1779950895;
                        i5 = -968294131;
                    }
                    break;
                case -1068202755:
                case -609313755:
                    C18249 c18249 = (C18249) orDefault;
                    C1017.m56190(c18249);
                    if (c18249.m41545()) {
                        iM55979 = (i3 - C0873.m55680("֡ܶ")) * (-93);
                        i4 = ((iM55979 ^ i2) * (-693)) ^ (-4252885);
                        i5 = -389219132;
                    } else {
                        iM55979 = C0873.m55680("᩹ۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15993) ^ (-829393830);
                        i5 = 1487359715;
                    }
                    break;
                case -307220811:
                case -295553035:
                    return true;
                case -268509986:
                case 248296884:
                    m34320();
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0873.m55680("ۘۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-297)) ^ 806852731;
                        i5 = -1288140684;
                    } else {
                        iM55979 = C0873.m55680("ۜܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26719)) ^ (-1491996374);
                        i5 = -901137429;
                    }
                    break;
                case -246185736:
                case 2007678703:
                    C0890.m55740();
                    return false;
                case -210406194:
                case 522949680:
                    return false;
                case -122383237:
                case 236360887:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("ۘۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-297)) ^ 806852731;
                        i5 = -1288140684;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۛۤ")) * (-81);
                        i4 = ((iM55979 ^ i2) * 27917) ^ 2067207766;
                        i5 = 587131430;
                    }
                    break;
                case -65935333:
                case 127371612:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ܰᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25463) ^ (-182040592);
                        i5 = 1877177837;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩺᩺")) * (-113);
                        i4 = ((iM55979 ^ i3) * (-5815)) ^ (-1548481417);
                        i5 = 2001922668;
                    }
                    break;
                case 71122225:
                case 1592910245:
                    if (C0866.m55647(itM56090)) {
                        iM55979 = C0946.m55979("ۧ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6083)) ^ (-1691554978);
                        i5 = -1750959825;
                    } else {
                        iM55979 = (C0946.m55979("֨ۜ") + i2) * 37;
                        i4 = ((iM55979 ^ i3) * (-13563)) ^ 221703118;
                        i5 = -545327486;
                    }
                    break;
                case 103549346:
                case 409717599:
                    if (!C0955.f81898) {
                        iM55979 = (C0873.m55680("۟᩸") + i3) * 15;
                        i4 = ((iM55979 ^ i2) * (-3879)) ^ 13724234;
                        i5 = -594789625;
                    } else {
                        iM55979 = (C0873.m55680("ۡۛ") ^ i3) * (-51);
                        i4 = ((iM55979 ^ i2) * 1309) ^ 1779950895;
                        i5 = -968294131;
                    }
                    break;
                case 153786941:
                case 1190892790:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("۟᩸") + i3) * 15;
                        i4 = ((iM55979 ^ i2) * (-3879)) ^ 13724234;
                        i5 = -594789625;
                    } else {
                        iM55979 = (C0873.m55680("ۗܰ") + i2) * (-63);
                        i4 = ((iM55979 ^ i3) * (-13231)) ^ (-633360671);
                        i5 = -1754068390;
                    }
                    break;
                case 426701474:
                case 2099705443:
                    C1036.m56257();
                    iM55979 = C0946.m55979("ܺۚ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 833) ^ (-363917853);
                    i5 = 1145519408;
                    break;
                case 475474536:
                case 1376997922:
                    itM56090 = C0989.m56090(f42790);
                    iM55979 = (i3 - C0873.m55680("֡ܶ")) * (-93);
                    i4 = ((iM55979 ^ i2) * (-693)) ^ (-4252885);
                    i5 = -389219132;
                    break;
                case 498971161:
                case 1908940748:
                    orDefault = c0977.getOrDefault(str, obj);
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("ܰᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25463) ^ (-182040592);
                        i5 = 1877177837;
                    } else {
                        iM55979 = C0873.m55680("ۢ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4995) ^ 2080890300;
                        i5 = 343821337;
                    }
                    break;
                case 539828560:
                case 590181308:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("ܰᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25463) ^ (-182040592);
                        i5 = 1877177837;
                    } else {
                        iM55979 = (C0873.m55680("֨ܿ") + i3) * 47;
                        i4 = ((iM55979 ^ i2) * (-455)) ^ 1656113126;
                        i5 = -1255854773;
                    }
                    break;
                default:
                    if (C1003.m56123() != 0) {
                        iM55979 = C0946.m55979("ܰᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25463) ^ (-182040592);
                        i5 = 1877177837;
                    } else {
                        iM55979 = (C0873.m55680("ܳܺ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * (-29241)) ^ (-1909209869);
                        i5 = -928965920;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01b7 A[PHI: r10 r17 r18
      0x01b7: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:54:0x01b5, B:39:0x0102, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r17v23 android.app.Application) = (r17v10 android.app.Application), (r17v16 android.app.Application), (r17v26 android.app.Application) binds: [B:54:0x01b5, B:39:0x0102, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r18v3 android.content.SharedPreferences$Editor) = 
      (r18v1 android.content.SharedPreferences$Editor)
      (r18v2 android.content.SharedPreferences$Editor)
      (r18v1 android.content.SharedPreferences$Editor)
     binds: [B:54:0x01b5, B:39:0x0102, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0225 A[PHI: r2 r7 r17
      0x0225: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String) binds: [B:62:0x0223, B:29:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:62:0x0223, B:29:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r17v17 android.app.Application) = (r17v8 android.app.Application), (r17v18 android.app.Application) binds: [B:62:0x0223, B:29:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02a9 A[PHI: r3 r4 r5 r17
      0x02a9: PHI (r3v4 java.lang.StringBuilder) = (r3v1 java.lang.StringBuilder), (r3v3 java.lang.StringBuilder), (r3v1 java.lang.StringBuilder) binds: [B:71:0x0291, B:14:0x0053, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r4v2 short[]) = (r4v1 short[]), (r4v1 short[]), (r4v3 short[]) binds: [B:71:0x0291, B:14:0x0053, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:71:0x0291, B:14:0x0053, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r17v27 android.app.Application) = (r17v6 android.app.Application), (r17v21 android.app.Application), (r17v28 android.app.Application) binds: [B:71:0x0291, B:14:0x0053, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (p067l.C0890.f81849 == 0) goto L14;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m34314(String str) {
        int iM55680;
        int i;
        int i2;
        Application applicationM56136 = null;
        String strM55792 = null;
        StringBuilder sbM21133 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = -1565091223;
        int i10 = C0989.f81920;
        int i11 = C0992.f81922;
        int iM55979 = (C0946.m55979("۟ۗ") + i11) * (-15);
        int i12 = ((iM55979 ^ i10) * (-29859)) ^ (-989820329);
        int i13 = iM55979 ^ (-1269759886);
        SharedPreferences.Editor editorEdit = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * 32687) >> 31));
            switch (i9) {
                case -1985265345:
                case 1547598891:
                    C0917.m55854();
                    break;
                case -1969098582:
                case -1366432499:
                    i7 = 3007;
                    iM55680 = C0873.m55680("᩵֫") ^ i10;
                    i = ((iM55680 ^ i11) * 10605) ^ 1144756843;
                    i2 = -1654892013;
                    Application application = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application;
                    break;
                case -1923600099:
                case 1567455132:
                    applicationM56136 = applicationM56136;
                    i6 = 232196644;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("ۚ۬") ^ i11;
                        i = ((iM55680 ^ i10) * (-28779)) ^ (-1386745043);
                        i2 = 791265851;
                    } else {
                        iM55680 = C0946.m55979("ۤ᩷") ^ i11;
                        i = ((iM55680 ^ i10) * (-22223)) ^ 1457892274;
                        i2 = 793787683;
                    }
                    Application application2 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application2;
                    break;
                case -1517134516:
                case -814915154:
                    applicationM56136 = applicationM56136;
                    c = 387;
                    if (C1046.f81962 <= 0) {
                        iM55680 = (C0946.m55979("֫᩸") ^ i10) * 97;
                        i = ((iM55680 ^ i11) * (-15939)) ^ 823275510;
                        i2 = 1749227333;
                    } else {
                        iM55680 = C0873.m55680("ۡ۠") ^ i11;
                        i = ((iM55680 ^ i10) * (-27505)) ^ 101675570;
                        i2 = -446758078;
                    }
                    Application application3 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application3;
                    break;
                case -1483176549:
                case 345810283:
                    applicationM56136 = C1012.m56136();
                    sArr2 = f82190;
                    if (C0937.f81884) {
                        int iM55681 = C0873.m55680("ܽܽ") ^ i10;
                        i13 = iM55681 ^ 394276721;
                        i12 = ((iM55681 ^ i11) * 29641) ^ (-1032497371);
                        i8 = 388;
                    } else {
                        i8 = 388;
                        iM55680 = (C0873.m55680("᩶᩸") + i10) * 73;
                        applicationM56136 = applicationM56136;
                        i = ((iM55680 ^ i11) * (-20703)) ^ 643029756;
                        i2 = 23375555;
                        Application application4 = applicationM56136;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                        applicationM56136 = application4;
                    }
                    break;
                case -1244270989:
                case -62550023:
                    sbM21133 = C9179.m21133(str, strM55792);
                    C0845.m55589(sbM21133, C0946.m55979(str));
                    if (C0955.f81898) {
                        applicationM56136 = applicationM56136;
                        iM55680 = (C0946.m55979("֫᩸") ^ i10) * 97;
                        i = ((iM55680 ^ i11) * (-15939)) ^ 823275510;
                        i2 = 1749227333;
                    } else {
                        iM55680 = C0873.m55680("ۧۙ") ^ i11;
                        applicationM56136 = applicationM56136;
                        i = ((iM55680 ^ i10) * 16185) ^ 1214388388;
                        i2 = -1252523507;
                    }
                    Application application5 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application5;
                    break;
                case -1158106248:
                case 1357493405:
                    applicationM56136 = applicationM56136;
                    i4 = i3 * i3;
                    i5 = s * s;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (i10 - C0873.m55680("᩸ۤ")) * (-9);
                        i = ((iM55680 ^ i11) * (-11669)) ^ 31787473;
                        i2 = -1629558023;
                    } else {
                        iM55680 = (i10 - C0946.m55979("۫ܰ")) * (-101);
                        i = ((iM55680 ^ i11) * (-8799)) ^ 447955895;
                        i2 = 351945498;
                    }
                    Application application6 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application6;
                    break;
                case -1053615076:
                case 1024366046:
                    i7 = 59242;
                    iM55680 = C0873.m55680("᩵֫") ^ i10;
                    i = ((iM55680 ^ i11) * 10605) ^ 1144756843;
                    i2 = -1654892013;
                    Application application7 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application7;
                    break;
                case -1031237479:
                case 1521582701:
                    if (RunnableC0871.f81839 < 0) {
                        applicationM56136 = applicationM56136;
                        iM55680 = (i10 - C0873.m55680("᩸ۤ")) * (-9);
                        i = ((iM55680 ^ i11) * (-11669)) ^ 31787473;
                        i2 = -1629558023;
                        Application application8 = applicationM56136;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                        applicationM56136 = application8;
                    }
                    applicationM56136 = applicationM56136;
                    iM55680 = (C0946.m55979("֫᩸") ^ i10) * 97;
                    i = ((iM55680 ^ i11) * (-15939)) ^ 823275510;
                    i2 = 1749227333;
                    Application application9 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application9;
                    break;
                case -1024375616:
                case 1622225478:
                    applicationM56136 = applicationM56136;
                    int i14 = i5 + i6;
                    if (i4 - (i14 + i14) <= 0) {
                        iM55680 = (i10 - C0873.m55680("᩶ܺ")) * 25;
                        i = ((iM55680 ^ i11) * 3369) ^ 695356228;
                        i2 = 2058844273;
                    } else {
                        iM55680 = C0873.m55680("۟ܰ") ^ i11;
                        i = ((iM55680 ^ i10) * (-15589)) ^ (-1065014832);
                        i2 = 747784669;
                    }
                    Application application10 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application10;
                    break;
                case -986462778:
                case 1492735791:
                    applicationM56136.deleteSharedPreferences(C0863.m55639(sbM21133));
                    break;
                case -746199708:
                case 1753069906:
                    applicationM56136 = applicationM56136;
                    if (Build.VERSION.SDK_INT >= 24) {
                        iM55680 = (C0946.m55979("᩹ۨ") ^ i10) * 95;
                        i = ((iM55680 ^ i11) * 24537) ^ (-1803158872);
                        i2 = 1342833267;
                    } else {
                        iM55680 = (C0946.m55979("ۤ᩹") ^ i11) * (-83);
                        i = ((iM55680 ^ i10) * 351) ^ 999426206;
                        i2 = -1168335690;
                    }
                    Application application11 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application11;
                    break;
                case -725438399:
                case -286306352:
                    C1053.m56327();
                    C0882.m55710();
                    applicationM56136 = applicationM56136;
                    iM55680 = (C0946.m55979("֫᩸") ^ i10) * 97;
                    i = ((iM55680 ^ i11) * (-15939)) ^ 823275510;
                    i2 = 1749227333;
                    Application application12 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application12;
                    break;
                case -492694970:
                case 1229525084:
                    applicationM56136 = applicationM56136;
                    strM55792 = C0898.m55792(sArr2, i8, 1, i7);
                    if (C0854.m55595() >= 0) {
                        applicationM56136 = applicationM56136;
                        iM55680 = (C0873.m55680("᩶᩸") + i10) * 73;
                        applicationM56136 = applicationM56136;
                        i = ((iM55680 ^ i11) * (-20703)) ^ 643029756;
                        i2 = 23375555;
                    } else {
                        iM55680 = (C0946.m55979("ܽ֨") ^ i11) * 119;
                        i = ((iM55680 ^ i10) * 889) ^ 903612896;
                        i2 = -1008802850;
                    }
                    Application application13 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application13;
                    break;
                case -427465566:
                case 1009871599:
                    if (C0912.f81867 <= 0) {
                        applicationM56136 = applicationM56136;
                        iM55680 = C0946.m55979("ۚ۬") ^ i11;
                        i = ((iM55680 ^ i10) * (-28779)) ^ (-1386745043);
                        i2 = 791265851;
                        Application application14 = applicationM56136;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                        applicationM56136 = application14;
                    }
                    applicationM56136 = applicationM56136;
                    iM55680 = C0873.m55680("ܶܿ") ^ i11;
                    i = ((iM55680 ^ i10) * (-30443)) ^ (-210240809);
                    i2 = 55451881;
                    Application application15 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application15;
                    break;
                case -12743292:
                case 1740954298:
                    break;
                case 150886061:
                case 1040687255:
                    applicationM56136 = applicationM56136;
                    s = sArr[c];
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("ܶܿ") ^ i11;
                        i = ((iM55680 ^ i10) * (-30443)) ^ (-210240809);
                        i2 = 55451881;
                    } else {
                        iM55680 = (C0873.m55680("۬ۡ") + i11) * 37;
                        i = ((iM55680 ^ i10) * 6311) ^ (-1513882715);
                        i2 = 256185273;
                    }
                    Application application16 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application16;
                    break;
                case 782694976:
                case 2116946517:
                    editorEdit.clear().apply();
                    break;
                case 1325000311:
                case 1839151875:
                    applicationM56136 = applicationM56136;
                    editorEdit = m34319(str).edit();
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0946.m55979("ۚ۬") ^ i11;
                        i = ((iM55680 ^ i10) * (-28779)) ^ (-1386745043);
                        i2 = 791265851;
                    } else {
                        iM55680 = C0946.m55979("ۜܽ") ^ i11;
                        i = ((iM55680 ^ i10) * (-21987)) ^ (-947813573);
                        i2 = -1022908335;
                    }
                    Application application17 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application17;
                    break;
                case 1463673376:
                case 2066055079:
                    applicationM56136 = applicationM56136;
                    i3 = s + 15238;
                    if (C0882.f81846) {
                        applicationM56136 = applicationM56136;
                        iM55680 = (C0873.m55680("᩶᩸") + i10) * 73;
                        applicationM56136 = applicationM56136;
                        i = ((iM55680 ^ i11) * (-20703)) ^ 643029756;
                        i2 = 23375555;
                    } else {
                        iM55680 = (C0873.m55680("ۗ֨") ^ i10) * 71;
                        i = ((iM55680 ^ i11) * 12393) ^ (-1001365521);
                        i2 = -1400411369;
                    }
                    Application application18 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application18;
                    break;
                default:
                    applicationM56136 = applicationM56136;
                    sArr = f82190;
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0946.m55979("֫᩸") ^ i10) * 97;
                        i = ((iM55680 ^ i11) * (-15939)) ^ 823275510;
                        i2 = 1749227333;
                    } else {
                        iM55680 = C0946.m55979("ۧܰ") ^ i10;
                        i = ((iM55680 ^ i11) * 5785) ^ (-1641677700);
                        i2 = 1353734898;
                    }
                    Application application19 = applicationM56136;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    applicationM56136 = application19;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[PHI: r0 r2
      0x00d3: PHI (r0v4 java.util.ArrayList) = 
      (r0v3 java.util.ArrayList)
      (r0v2 java.util.ArrayList)
      (r0v2 java.util.ArrayList)
      (r0v2 java.util.ArrayList)
      (r0v2 java.util.ArrayList)
     binds: [B:36:0x00bc, B:25:0x0076, B:17:0x005a, B:14:0x0052, B:7:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r2v4 java.lang.Class<l.۬ܿ᩷>) = 
      (r2v2 java.lang.Class<l.۬ܿ᩷>)
      (r2v3 java.lang.Class<l.۬ܿ᩷>)
      (r2v2 java.lang.Class<l.۬ܿ᩷>)
      (r2v2 java.lang.Class<l.۬ܿ᩷>)
      (r2v2 java.lang.Class<l.۬ܿ᩷>)
     binds: [B:36:0x00bc, B:25:0x0076, B:17:0x005a, B:14:0x0052, B:7:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x016d A[PHI: r8
      0x016d: PHI (r8v8 l.ۚܿ᩷) = (r8v4 l.ۚܿ᩷), (r8v4 l.ۚܿ᩷), (r8v7 l.ۚܿ᩷), (r8v4 l.ۚܿ᩷) binds: [B:54:0x016b, B:50:0x014f, B:32:0x009e, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0197  */
    /* JADX INFO: renamed from: ֫ */
    public static void m34305(int i, int i2) {
        int iM55979;
        int i3;
        ArrayList arrayList = null;
        Class<C14976> cls = null;
        int i4 = -952700895;
        int i5 = C0912.f81867;
        int i6 = C0845.f81821;
        int iM559710 = (i5 - C0946.m55979("۠ۨ")) * (-63);
        int i7 = ((iM559710 ^ i6) * (-3467)) ^ 866106957;
        int i8 = -1249047873;
        while (true) {
            int i9 = iM559710 ^ i8;
            RunnableC7601 runnableC7601 = null;
            while (true) {
                i4 = ((((i4 ^ i6) * 19269) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2147182699:
                    case -1969417805:
                        cls = C14976.class;
                        if (C1404.m56468()) {
                            iM55979 = C0873.m55680("ۛܶ") ^ i5;
                            i7 = ((iM55979 ^ i6) * 1093) ^ (-272775081);
                            i3 = 222832531;
                        } else {
                            iM55979 = (i6 - C0946.m55979("᩸ᩳ")) * (-37);
                            i7 = ((iM55979 ^ i5) * 9467) ^ (-673463146);
                            i3 = -1626808881;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    case -2002021164:
                    case 1668270137:
                        if (C0892.m55749()) {
                            iM55979 = C0873.m55680("۠ᩴ") ^ i5;
                            i7 = ((iM55979 ^ i6) * 10597) ^ (-1599834387);
                            i3 = -137019895;
                        } else {
                            iM55979 = C0946.m55979("ۗۡ") ^ i5;
                            i7 = ((iM55979 ^ i6) * 15503) ^ 1195444576;
                            i3 = -842628248;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    case -1911782890:
                    case 820029165:
                        if (C1024.m56209() < 0) {
                            iM55979 = C0946.m55979("ۨܺ") ^ i6;
                            i7 = ((iM55979 ^ i5) * (-6453)) ^ (-1888909724);
                            i3 = 625273587;
                        } else {
                            iM55979 = (i6 - C0946.m55979("᩸ᩳ")) * (-37);
                            i7 = ((iM55979 ^ i5) * 9467) ^ (-673463146);
                            i3 = -1626808881;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    case -1545577294:
                    case 1307944007:
                        arrayList = f42790;
                        if (C1012.f81938 >= 0) {
                            iM55979 = (i6 - C0946.m55979("᩸ᩳ")) * (-37);
                            i7 = ((iM55979 ^ i5) * 9467) ^ (-673463146);
                            i3 = -1626808881;
                        } else {
                            iM55979 = C0946.m55979("ܳܽ") ^ i5;
                            i7 = ((iM55979 ^ i6) * (-11737)) ^ (-1725023945);
                            i3 = -1268534409;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    case -1414167870:
                    case 146708333:
                        if (C1124.f82007 >= 0) {
                            iM55979 = C0946.m55979("ۨܺ") ^ i6;
                            i7 = ((iM55979 ^ i5) * (-6453)) ^ (-1888909724);
                            i3 = 625273587;
                        } else {
                            iM55979 = C0873.m55680("֡ۧ") ^ i5;
                            i7 = ((iM55979 ^ i6) * (-15003)) ^ 1105378550;
                            i3 = -587063293;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    case -1273034231:
                    case 1086534003:
                        if (C0882.f81846) {
                            iM55979 = C0946.m55979("ۗۡ") ^ i5;
                            i7 = ((iM55979 ^ i6) * 15503) ^ 1195444576;
                            i3 = -842628248;
                        } else {
                            iM55979 = (C0946.m55979("ܽۧ") + i5) * 11;
                            i7 = ((iM55979 ^ i6) * 24939) ^ 783842366;
                            i3 = 964619972;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    case -1149614707:
                    case -456714701:
                        if (C1036.f81953 >= 0) {
                            iM55979 = C0946.m55979("ۨܺ") ^ i6;
                            i7 = ((iM55979 ^ i5) * (-6453)) ^ (-1888909724);
                            i3 = 625273587;
                        } else {
                            iM55979 = (C0946.m55979("ܽ֫") + i6) * 17;
                            i7 = ((iM55979 ^ i5) * (-28351)) ^ 178705232;
                            i3 = 1336781885;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    case -792743602:
                    case 271895259:
                        if (!C0949.m56012()) {
                            iM55979 = (i6 - C0873.m55680("ۖۘ")) * 39;
                            i7 = ((iM55979 ^ i5) * 19389) ^ (-917106448);
                            i3 = 1975039410;
                            i9 = iM55979 ^ i3;
                        }
                        break;
                    case -758764991:
                    case -639554838:
                        C1044.m56286();
                        C1046.m56302();
                        break;
                    case -476712001:
                    case 1302073765:
                        RunnableC0938.m55938();
                        iM55979 = C0946.m55979("ۨܺ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-6453)) ^ (-1888909724);
                        i3 = 625273587;
                        i9 = iM55979 ^ i3;
                        break;
                    case -195587041:
                    case 1317152700:
                        C4081.m8188(runnableC7601, cls, 500L);
                        break;
                    case -139882871:
                    case 1552597549:
                        C8123.m18819(i, i2, arrayList);
                        if (C0906.f81862 < 0) {
                            runnableC7601 = new RunnableC7601(0);
                            if (C0967.f81910 >= 0) {
                                iM55979 = C0946.m55979("ۗۡ") ^ i5;
                                i7 = ((iM55979 ^ i6) * 15503) ^ 1195444576;
                                i3 = -842628248;
                            } else {
                                iM55979 = (C0873.m55680("ۨۙ") ^ i6) * (-47);
                                i7 = ((iM55979 ^ i5) * (-29825)) ^ 1866190228;
                                i3 = 496367951;
                            }
                            i9 = iM55979 ^ i3;
                        }
                        break;
                    case 190240139:
                    case 995970448:
                        if (C1929.f83011 == 0) {
                            iM55979 = C0946.m55979("ۨܺ") ^ i6;
                            i7 = ((iM55979 ^ i5) * (-6453)) ^ (-1888909724);
                            i3 = 625273587;
                        } else {
                            iM55979 = C0873.m55680("֨ۢ") ^ i6;
                            i7 = ((iM55979 ^ i5) * (-27879)) ^ 371168154;
                            i3 = -2135566196;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    case 1423926586:
                    case 2081453053:
                        if (C0894.f81854 < 0) {
                            iM55979 = (i6 - C0946.m55979("᩸ᩳ")) * (-37);
                            i7 = ((iM55979 ^ i5) * 9467) ^ (-673463146);
                            i3 = -1626808881;
                        } else {
                            iM55979 = C0946.m55979("ۗۡ") ^ i5;
                            i7 = ((iM55979 ^ i6) * 15503) ^ 1195444576;
                            i3 = -842628248;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                    default:
                        m34320();
                        if (ServiceConnectionC1013.m56157() <= 0) {
                            iM55979 = (i6 - C0946.m55979("᩸ᩳ")) * (-37);
                            i7 = ((iM55979 ^ i5) * 9467) ^ (-673463146);
                            i3 = -1626808881;
                        } else {
                            iM55979 = (C0873.m55680("ۨ᩸") ^ i6) * (-123);
                            i7 = ((iM55979 ^ i5) * 15161) ^ (-852572274);
                            i3 = 1067903861;
                        }
                        i9 = iM55979 ^ i3;
                        break;
                }
                return;
            }
            iM559710 = (C0946.m55979("᩵ᩴ") + i5) * 89;
            i7 = ((iM559710 ^ i6) * 26023) ^ (-1383555445);
            i8 = -1711636944;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m34317() {
        m34320();
        return f42787;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C7350 m34321() {
        m34320();
        return f42791;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m34313(ArrayList arrayList) {
        ArrayList arrayList2 = null;
        Iterator itM56090 = null;
        String str = null;
        C0977 c0977 = null;
        Object obj = null;
        Object orDefault = null;
        C18249 c18249 = null;
        int i = 1503218432;
        int i2 = C1028.f81950;
        int i3 = C1044.f81959;
        int iM55680 = (i2 - C0873.m55680("ۙۡ")) * 49;
        int i4 = ((iM55680 ^ i3) * (-18903)) ^ 1813359185;
        int i5 = -1323869114;
        while (true) {
            i = ((((i ^ i3) * 17289) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2143534262:
                case 1482996421:
                    c18249 = (C18249) orDefault;
                    C0992.m56109(c18249);
                    if (c18249.m41545()) {
                        iM55680 = (i2 - C0873.m55680("֫ܺ")) * (-33);
                        i4 = ((iM55680 ^ i3) * (-16187)) ^ 902639442;
                        i5 = 1364673450;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۖ᩻")) * (-5);
                        i4 = ((iM55680 ^ i2) * 14777) ^ (-474629488);
                        i5 = -1668014110;
                    }
                    break;
                case -2136125082:
                case -591373277:
                    c0977 = f42789;
                    obj = null;
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("۠ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19149)) ^ (-2130687968);
                        i5 = 959362013;
                    } else {
                        iM55680 = (C0946.m55979("ۜۗ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-32381)) ^ 1685136259;
                        i5 = 1410064730;
                    }
                    break;
                case -2119177204:
                case -1876435688:
                    C0912.m55833();
                    return null;
                case -1946931086:
                case 444529998:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (i3 - C0873.m55680("۟ۖ")) * (-25);
                        i4 = ((iM55680 ^ i2) * 19815) ^ (-966486699);
                        i5 = 492624082;
                    } else {
                        iM55680 = C0873.m55680("۠ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19149)) ^ (-2130687968);
                        i5 = 959362013;
                    }
                    break;
                case -1825740658:
                case 2117589006:
                    if (C0861.f81831) {
                        iM55680 = C0873.m55680("ۧ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5501)) ^ (-747615202);
                        i5 = -1524786784;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۟ۖ")) * (-25);
                        i4 = ((iM55680 ^ i2) * 19815) ^ (-966486699);
                        i5 = 492624082;
                    }
                    break;
                case -1744791059:
                case 1610032953:
                    C0937.m55918();
                    C0989.m56095();
                    iM55680 = (C0873.m55680("ۚۢ") + i2) * 99;
                    i4 = ((iM55680 ^ i3) * (-29221)) ^ 1106807665;
                    i5 = 1450975359;
                    break;
                case -1726543983:
                case 947335682:
                    return arrayList2;
                case -1701448737:
                case -3903033:
                    str = (String) RunnableC0897.m55785(itM56090);
                    if (arrayList.contains(str)) {
                        iM55680 = (i2 - C0873.m55680("֫ܺ")) * (-33);
                        i4 = ((iM55680 ^ i3) * (-16187)) ^ 902639442;
                        i5 = 1364673450;
                    } else {
                        iM55680 = C0946.m55979("᩺᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3779) ^ (-404495055);
                        i5 = -428386622;
                    }
                    break;
                case -1321535000:
                case 706163702:
                    arrayList2 = new ArrayList();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("ۚۢ") + i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-29221)) ^ 1106807665;
                        i5 = 1450975359;
                    } else {
                        iM55680 = C0946.m55979("۠ܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24907)) ^ (-500231983);
                        i5 = -1790359646;
                    }
                    break;
                case -1304306540:
                case 37677963:
                    orDefault = c0977.getOrDefault(str, obj);
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("ۗܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27151) ^ (-1842979319);
                        i5 = 2091347693;
                    } else {
                        iM55680 = (C0946.m55979("ۜ᩵") + i2) * 123;
                        i4 = ((iM55680 ^ i3) * (-22595)) ^ (-2100900219);
                        i5 = 851205583;
                    }
                    break;
                case -1301520075:
                case -292198994:
                    C1003.m56123();
                    if (C1048.m56305() >= 0) {
                        iM55680 = C0873.m55680("۠ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19149)) ^ (-2130687968);
                        i5 = 959362013;
                    } else {
                        iM55680 = C0946.m55979("᩷ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 3643) ^ 1665323978;
                        i5 = -1530150179;
                    }
                    break;
                case -1280089449:
                case 816821351:
                    if (C0882.m55713()) {
                        iM55680 = C0946.m55979("۠֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * 3383) ^ 1167322426;
                        i5 = 962671345;
                    } else {
                        iM55680 = C0946.m55979("ۗۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 8907) ^ 2056573331;
                        i5 = -1679272561;
                    }
                    break;
                case -1165320857:
                case -208612591:
                    itM56090 = C0989.m56090(f42790);
                    iM55680 = (i2 - C0873.m55680("֫ܺ")) * (-33);
                    i4 = ((iM55680 ^ i3) * (-16187)) ^ 902639442;
                    i5 = 1364673450;
                    break;
                case -1010562335:
                case -985929548:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("ۚۢ") + i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-29221)) ^ 1106807665;
                        i5 = 1450975359;
                    } else {
                        iM55680 = C0873.m55680("ᩴ۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23459)) ^ (-402747629);
                        i5 = 1956735506;
                    }
                    break;
                case -894873309:
                case 859479991:
                    C1194.m56393(arrayList2, c18249);
                    iM55680 = (i2 - C0873.m55680("֫ܺ")) * (-33);
                    i4 = ((iM55680 ^ i3) * (-16187)) ^ 902639442;
                    i5 = 1364673450;
                    break;
                case -544092073:
                case 1007813361:
                    if (C1194.m56396() <= 0) {
                        iM55680 = C0873.m55680("۠ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19149)) ^ (-2130687968);
                        i5 = 959362013;
                    } else {
                        iM55680 = C0873.m55680("֫ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-18273)) ^ (-2069773685);
                        i5 = -168498621;
                    }
                    break;
                case -534845976:
                case -280859424:
                    if (C0930.m55886(itM56090)) {
                        iM55680 = C0873.m55680("ۨܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28561)) ^ 905481198;
                        i5 = 315506512;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֫۠")) * 73;
                        i4 = ((iM55680 ^ i2) * (-27689)) ^ 1603994817;
                        i5 = 2027094410;
                    }
                    break;
                case -50773699:
                case 1042507340:
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0873.m55680("۠ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19149)) ^ (-2130687968);
                        i5 = 959362013;
                    } else {
                        iM55680 = C0946.m55979("۬۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11419)) ^ 1397455237;
                        i5 = -1505824244;
                    }
                    break;
                case 37138423:
                case 801839523:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("ۗܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27151) ^ (-1842979319);
                        i5 = 2091347693;
                    } else {
                        iM55680 = C0873.m55680("ۡܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15109)) ^ (-1046026619);
                        i5 = -714410496;
                    }
                    break;
                case 330538677:
                case 505766131:
                    return Collections.EMPTY_LIST;
                case 747890753:
                case 1155888232:
                    if (!C1024.f81946) {
                        iM55680 = (C0873.m55680("ۚۢ") + i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-29221)) ^ 1106807665;
                        i5 = 1450975359;
                    } else {
                        iM55680 = C0873.m55680("۠ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19149)) ^ (-2130687968);
                        i5 = 959362013;
                    }
                    break;
                case 778387111:
                case 1427258340:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("ۗܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27151) ^ (-1842979319);
                        i5 = 2091347693;
                    } else {
                        iM55680 = (C0873.m55680("ۨۜ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * (-11123)) ^ 1637876135;
                        i5 = 930469380;
                    }
                    break;
                default:
                    m34320();
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0873.m55680("ۚۢ") + i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-29221)) ^ 1106807665;
                        i5 = 1450975359;
                    } else {
                        iM55680 = C0946.m55979("۫֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25935) ^ (-79145387);
                        i5 = -1270231287;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C18249 m34318(String str) {
        int iM55979;
        int i;
        C18249 c18249 = null;
        int i2 = -2114765716;
        int i3 = C1053.f81965;
        int i4 = C0949.f81897;
        int iM55680 = C0873.m55680("ᩳۗ") ^ i3;
        int i5 = ((iM55680 ^ i4) * 5559) ^ (-1836033260);
        int i6 = 1453221787;
        while (true) {
            int i7 = iM55680 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-23519)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2024879205:
                    case -1025407552:
                        return (C18249) f42789.getOrDefault(str, c18249);
                    case -1999455296:
                    case -1446960972:
                        C1124.m56367();
                        RunnableC1014.m56177();
                        return null;
                    case -1886320555:
                    case 1123923848:
                        C0845.m55584();
                        if (C0949.f81897 >= 0) {
                            iM55680 = (C0946.m55979("ܺܽ") + i4) * 127;
                            i5 = ((iM55680 ^ i3) * (-3581)) ^ 1731324414;
                            i6 = -877345259;
                            break;
                        }
                        iM55680 = (C0873.m55680("ܶ᩸") ^ i3) * 75;
                        i5 = ((iM55680 ^ i4) * (-13181)) ^ (-1018817716);
                        i6 = -538745202;
                        break;
                    case -1786822445:
                    case 1286755535:
                        if (C0906.f81862 < 0) {
                            iM55680 = C0946.m55979("᩵۟") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23581)) ^ 667750296;
                            i6 = 2003091848;
                            break;
                        }
                        iM55680 = C0873.m55680("᩸ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 22869) ^ (-837604050);
                        i6 = -102457654;
                        break;
                    case -1781829167:
                    case 387697373:
                        if (!C0877.m55696()) {
                            iM55680 = (C0946.m55979("ܺܽ") + i4) * 127;
                            i5 = ((iM55680 ^ i3) * (-3581)) ^ 1731324414;
                            i6 = -877345259;
                            break;
                            break;
                        }
                        iM55680 = (C0946.m55979("۟۠") + i3) * 21;
                        i5 = ((iM55680 ^ i4) * (-23981)) ^ (-923786531);
                        i6 = 1030202641;
                        break;
                    case -1627964897:
                    case 1966162066:
                        return c18249;
                    case -1372490076:
                    case 954454192:
                        if (C0927.m55866()) {
                            iM55979 = (C0946.m55979("۫᩻") ^ i3) * (-107);
                            i5 = ((iM55979 ^ i4) * 5041) ^ 602671973;
                            i = -1703003869;
                        } else {
                            iM55979 = C0873.m55680("᩶۠") ^ i4;
                            i5 = ((iM55979 ^ i3) * 17903) ^ 140258577;
                            i = -1402669154;
                        }
                        i7 = iM55979 ^ i;
                        c18249 = null;
                        break;
                    case -1145577849:
                    case -441236882:
                        if (C1028.f81950 > 0) {
                            iM55680 = C0946.m55979("ܶ۬") ^ i3;
                            i5 = ((iM55680 ^ i4) * 27925) ^ 550211970;
                            i6 = -7729627;
                            break;
                        }
                        iM55680 = C0873.m55680("᩸ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 22869) ^ (-837604050);
                        i6 = -102457654;
                        break;
                        break;
                    case -877796347:
                    case 1656845431:
                        m34320();
                        if (C1036.f81953 < 0) {
                            iM55680 = (i3 - C0946.m55979("۠ᩳ")) * (-101);
                            i5 = ((iM55680 ^ i4) * (-10633)) ^ 517038708;
                            i6 = 978747122;
                            break;
                        }
                        iM55680 = (i3 - C0873.m55680("֫ᩳ")) * 39;
                        i5 = ((iM55680 ^ i4) * 21029) ^ 1103830078;
                        i6 = -1864657713;
                        break;
                    case -875118213:
                    case 999092257:
                        if (C1194.f82045 == 0) {
                            iM55680 = C0946.m55979("۠᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * 12319) ^ 111465556;
                            i6 = 931698023;
                            break;
                        }
                        iM55680 = (C0946.m55979("ܺܽ") + i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-3581)) ^ 1731324414;
                        i6 = -877345259;
                        break;
                        break;
                    case -617920479:
                    case 765926590:
                        if (C1071.f81975 > 0) {
                            iM55680 = C0946.m55979("ܳ᩹") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-29331)) ^ (-1677398124);
                            i6 = 2028897345;
                            break;
                        }
                        iM55680 = (C0946.m55979("ܺܽ") + i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-3581)) ^ 1731324414;
                        i6 = -877345259;
                        break;
                        break;
                    case -488420456:
                    case 548481411:
                        C0930.m55885();
                        if (C0937.m55918() >= 0) {
                            iM55680 = (i3 - C0873.m55680("֫ᩳ")) * 39;
                            i5 = ((iM55680 ^ i4) * 21029) ^ 1103830078;
                            i6 = -1864657713;
                            break;
                            break;
                        }
                        iM55680 = (C0873.m55680("ܶ᩸") ^ i3) * 75;
                        i5 = ((iM55680 ^ i4) * (-13181)) ^ (-1018817716);
                        i6 = -538745202;
                        break;
                        break;
                    case -287377702:
                    case 1245764229:
                        if (C0890.f81849 == 0) {
                            iM55680 = (C0873.m55680("ۨ֡") ^ i4) * 29;
                            i5 = ((iM55680 ^ i3) * 24979) ^ (-287044553);
                            i6 = -480772749;
                            break;
                        }
                        iM55680 = (i3 - C0873.m55680("֫ᩳ")) * 39;
                        i5 = ((iM55680 ^ i4) * 21029) ^ 1103830078;
                        i6 = -1864657713;
                        break;
                        break;
                    case 433489666:
                    case 937470017:
                        C1194.m56396();
                        iM55680 = (C0873.m55680("ܶ᩸") ^ i3) * 75;
                        i5 = ((iM55680 ^ i4) * (-13181)) ^ (-1018817716);
                        i6 = -538745202;
                        break;
                        break;
                    case 505833776:
                    case 1992740012:
                        if (!C0912.m55833()) {
                            iM55680 = (C0946.m55979("۫۬") ^ i4) * (-87);
                            i5 = ((iM55680 ^ i3) * (-14907)) ^ (-209820934);
                            i6 = -971431247;
                            break;
                        }
                        iM55680 = (C0873.m55680("ܶ᩸") ^ i3) * 75;
                        i5 = ((iM55680 ^ i4) * (-13181)) ^ (-1018817716);
                        i6 = -538745202;
                        break;
                        break;
                    case 1253641558:
                    case 1649686213:
                        if (RunnableC1014.f81941 > 0) {
                            iM55680 = (C0873.m55680("ۢܶ") + i4) * (-51);
                            i5 = ((iM55680 ^ i3) * 15901) ^ (-770533186);
                            i6 = 643650339;
                            break;
                        }
                        iM55680 = (C0946.m55979("ܺܽ") + i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-3581)) ^ 1731324414;
                        i6 = -877345259;
                        break;
                        break;
                    case 1873933302:
                    case 2106593392:
                        if (C0992.m56107() > 0) {
                            iM55680 = (C0946.m55979("۬ܶ") + i3) * (-93);
                            i5 = ((iM55680 ^ i4) * 32677) ^ 275130479;
                            i6 = 555692599;
                            break;
                        }
                        iM55680 = (C0946.m55979("ܺܽ") + i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-3581)) ^ 1731324414;
                        i6 = -877345259;
                        break;
                        break;
                    default:
                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                            iM55680 = (i4 - C0873.m55680("ܳۚ")) * 79;
                            i5 = ((iM55680 ^ i3) * 6905) ^ (-2121521108);
                            i6 = 1402205209;
                            break;
                        }
                        iM55680 = (C0873.m55680("ܶ᩸") ^ i3) * 75;
                        i5 = ((iM55680 ^ i4) * (-13181)) ^ (-1018817716);
                        i6 = -538745202;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18249 m34302(AbstractC17043 abstractC17043) {
        return m34304(new C19561(abstractC17043));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0230 A[PHI: r3 r6 r8 r9 r14 r18
      0x0230: PHI (r3v6 android.content.SharedPreferences) = 
      (r3v5 android.content.SharedPreferences)
      (r3v2 android.content.SharedPreferences)
      (r3v2 android.content.SharedPreferences)
     binds: [B:11:0x0060, B:62:0x022e, B:54:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:11:0x0060, B:62:0x022e, B:54:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:11:0x0060, B:62:0x022e, B:54:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:11:0x0060, B:62:0x022e, B:54:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r14v5 short[]) = (r14v4 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:11:0x0060, B:62:0x022e, B:54:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r18v12 java.lang.StringBuilder) = (r18v8 java.lang.StringBuilder), (r18v10 java.lang.StringBuilder), (r18v13 java.lang.StringBuilder) binds: [B:11:0x0060, B:62:0x022e, B:54:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܿ */
    public static SharedPreferences m34319(String str) {
        int iM55979;
        int i;
        int i2;
        StringBuilder sb;
        int iM559710;
        int i3;
        int i4;
        int i5 = C1044.f81959;
        int i6 = C1964.f83032;
        int iM559711 = C0946.m55979("ܰۖ") ^ i6;
        int i7 = ((iM559711 ^ i5) * (-3585)) ^ (-787466397);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM559711 ^ (-1264539163);
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 436122703;
        SharedPreferences sharedPreferences = null;
        String strM55591 = null;
        StringBuilder sbM21133 = null;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i5) * 2429) >> 31));
            switch (i15) {
                case -2131565847:
                case 171196446:
                    sharedPreferences = C0861.m55620().getSharedPreferences(strM55591, 0);
                    if (C1071.f81975 > 0) {
                        iM55979 = C0873.m55680("۠ܿ") ^ i6;
                        i = ((iM55979 ^ i5) * (-24259)) ^ 674408599;
                        i2 = 1769525729;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        sb = sbM21133;
                        iM559710 = C0946.m55979("᩶ۢ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 3105) ^ (-532247979);
                        i4 = 1247648089;
                        StringBuilder sb2 = sb;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        sbM21133 = sb2;
                    }
                    break;
                case -1849326558:
                case 1057350293:
                    sbM21133 = C9179.m21133(str, C0937.m55921(sArr2, i13, i14, i12));
                    if (C0992.f81922 >= 0) {
                        iM559710 = C0946.m55979("ۖᩳ") ^ i6;
                        sb = sbM21133;
                        i3 = ((iM559710 ^ i5) * 16363) ^ 1352105290;
                        i4 = -122602114;
                    } else {
                        iM559710 = C0873.m55680("᩵ۛ") ^ i5;
                        sb = sbM21133;
                        i3 = ((iM559710 ^ i6) * (-2275)) ^ (-1140940214);
                        i4 = -663864409;
                    }
                    StringBuilder sb3 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb3;
                    break;
                case -1802097332:
                case 1685260824:
                    C1048.m56305();
                    C1028.m56247();
                    iM55979 = C0873.m55680("۬᩷") ^ i6;
                    i = ((iM55979 ^ i5) * 18079) ^ (-1658174817);
                    i2 = -2021337913;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1301863633:
                case 1267037792:
                    C0989.m56095();
                    return null;
                case -1039813715:
                case 426965775:
                    C0992.m56107();
                    if (C0898.f81858 <= 0) {
                        sb = sbM21133;
                        iM559710 = (C0946.m55979("ۗ᩸") ^ i5) * (-29);
                        i3 = ((iM559710 ^ i6) * (-9747)) ^ (-1026382924);
                        i4 = -1684433593;
                        StringBuilder sb4 = sb;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        sbM21133 = sb4;
                    }
                    sb = sbM21133;
                    iM559710 = (C0946.m55979("ܰۛ") ^ i6) * 9;
                    i3 = ((iM559710 ^ i5) * (-15017)) ^ (-2130839452);
                    i4 = 1905578180;
                    StringBuilder sb5 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb5;
                    break;
                case -958085070:
                case 750004014:
                    C1048.m56315(sharedPreferences, C0992.m56102(sArr3, 403, 25, i12));
                    return sharedPreferences;
                case -850209344:
                case 870883880:
                    ServiceConnectionC1013.m56157();
                    if (C0898.f81858 <= 0) {
                        sb = sbM21133;
                        iM559710 = C0946.m55979("᩶ۢ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 3105) ^ (-532247979);
                        i4 = 1247648089;
                        StringBuilder sb6 = sb;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        sbM21133 = sb6;
                    } else {
                        iM55979 = C0873.m55680("۬᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 18079) ^ (-1658174817);
                        i2 = -2021337913;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -835386234:
                case 2097688361:
                    sb = sbM21133;
                    if ((i11 + 1) - i10 > 0) {
                        iM559710 = C0946.m55979("ܽ֨") ^ i6;
                        i3 = ((iM559710 ^ i5) * 16829) ^ 1308020920;
                        i4 = 86682521;
                    } else {
                        iM559710 = (C0946.m55979("ۧ᩸") ^ i6) * 51;
                        i3 = ((iM559710 ^ i5) * 5383) ^ 765752084;
                        i4 = -1584123162;
                    }
                    StringBuilder sb7 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb7;
                    break;
                case -718800610:
                case 1553664861:
                    sArr3 = f82190;
                    if (C0894.f81854 < 0) {
                        iM55979 = C0873.m55680("ܳ۠") ^ i5;
                        i = ((iM55979 ^ i6) * 28027) ^ 215944686;
                        i2 = 1321156583;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        sb = sbM21133;
                        iM559710 = C0946.m55979("᩶ۢ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 3105) ^ (-532247979);
                        i4 = 1247648089;
                        StringBuilder sb8 = sb;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        sbM21133 = sb8;
                    }
                    break;
                case -685342193:
                case -679032184:
                    sb = sbM21133;
                    i9 = s + 1;
                    if (C1044.f81959 >= 0) {
                        iM559710 = (C0946.m55979("ܰۛ") ^ i6) * 9;
                        i3 = ((iM559710 ^ i5) * (-15017)) ^ (-2130839452);
                        i4 = 1905578180;
                    } else {
                        iM559710 = C0873.m55680("ۘ᩺") ^ i5;
                        i3 = ((iM559710 ^ i6) * 15025) ^ 131908354;
                        i4 = 2025074116;
                    }
                    StringBuilder sb9 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb9;
                    break;
                case -498979467:
                case -252718402:
                    sb = sbM21133;
                    i10 = i9 * i9;
                    i11 = s * 2;
                    if (C0861.f81831) {
                        iM559710 = (C0873.m55680("᩺ܳ") + i5) * (-19);
                        i3 = ((iM559710 ^ i6) * (-1611)) ^ (-19692775);
                        i4 = 792018427;
                    } else {
                        iM559710 = C0946.m55979("᩶ۢ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 3105) ^ (-532247979);
                        i4 = 1247648089;
                    }
                    StringBuilder sb10 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb10;
                    break;
                case 40726234:
                case 1345720697:
                    C0845.m55589(sbM21133, C0873.m55680(str));
                    strM55591 = C0845.m55591(sbM21133);
                    if (C0894.f81854 < 0) {
                        iM55979 = (i5 - C0946.m55979("ۙ۫")) * (-81);
                        i = ((iM55979 ^ i6) * (-9763)) ^ 1449074402;
                        i2 = -784272028;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        iM559710 = C0946.m55979("ۖᩳ") ^ i6;
                        sb = sbM21133;
                        i3 = ((iM559710 ^ i5) * 16363) ^ 1352105290;
                        i4 = -122602114;
                        StringBuilder sb11 = sb;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        sbM21133 = sb11;
                    }
                    break;
                case 87374591:
                case 226483945:
                    sb = sbM21133;
                    c = 401;
                    if (C1025.f81947 >= 0) {
                        sbM21133 = sb;
                        iM559710 = C0946.m55979("ۖᩳ") ^ i6;
                        sb = sbM21133;
                        i3 = ((iM559710 ^ i5) * 16363) ^ 1352105290;
                        i4 = -122602114;
                    } else {
                        iM559710 = (C0946.m55979("᩶۠") ^ i5) * 115;
                        i3 = ((iM559710 ^ i6) * (-28825)) ^ 2112873718;
                        i4 = 638741195;
                    }
                    StringBuilder sb12 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb12;
                    break;
                case 369985452:
                case 1995405168:
                    if (C0873.f81841 <= 0) {
                        sb = sbM21133;
                        iM559710 = (C0946.m55979("ܰۛ") ^ i6) * 9;
                        i3 = ((iM559710 ^ i5) * (-15017)) ^ (-2130839452);
                        i4 = 1905578180;
                        StringBuilder sb13 = sb;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        sbM21133 = sb13;
                    } else {
                        iM55979 = C0873.m55680("۬᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 18079) ^ (-1658174817);
                        i2 = -2021337913;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case 428417149:
                case 2027156920:
                    sb = sbM21133;
                    s = sArr[c];
                    if (C1012.f81938 >= 0) {
                        iM559710 = C0946.m55979("᩶ۢ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 3105) ^ (-532247979);
                        i4 = 1247648089;
                    } else {
                        iM559710 = C0946.m55979("֫᩶") ^ i6;
                        i3 = ((iM559710 ^ i5) * 12977) ^ 1197322391;
                        i4 = -496695744;
                    }
                    StringBuilder sb14 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb14;
                    break;
                case 503197168:
                case 1137972038:
                    i12 = 38038;
                    iM559710 = (C0946.m55979("֡ۧ") ^ i5) * (-105);
                    sb = sbM21133;
                    i3 = ((iM559710 ^ i6) * 3767) ^ (-341253473);
                    i4 = 1135349068;
                    StringBuilder sb15 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb15;
                    break;
                case 818498417:
                case 2079906745:
                    i12 = 65013;
                    iM559710 = (C0946.m55979("֡ۧ") ^ i5) * (-105);
                    sb = sbM21133;
                    i3 = ((iM559710 ^ i6) * 3767) ^ (-341253473);
                    i4 = 1135349068;
                    StringBuilder sb16 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb16;
                    break;
                case 1371890526:
                case 1875096454:
                    sArr2 = f82190;
                    i14 = 1;
                    if (C1071.f81975 <= 0) {
                        i13 = 402;
                        iM559710 = C0946.m55979("ۖᩳ") ^ i6;
                        sb = sbM21133;
                        i3 = ((iM559710 ^ i5) * 16363) ^ 1352105290;
                        i4 = -122602114;
                        StringBuilder sb17 = sb;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        sbM21133 = sb17;
                    } else {
                        int iM55680 = (C0873.m55680("֫ᩳ") ^ i6) * 85;
                        i8 = iM55680 ^ 1969716037;
                        i7 = ((iM55680 ^ i5) * (-29191)) ^ 370740336;
                        i13 = 402;
                    }
                    break;
                default:
                    sb = sbM21133;
                    sArr = f82190;
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM559710 = (C0946.m55979("ۗ᩸") ^ i5) * (-29);
                        i3 = ((iM559710 ^ i6) * (-9747)) ^ (-1026382924);
                        i4 = -1684433593;
                    } else {
                        iM559710 = C0873.m55680("ۜܳ") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-19457)) ^ 1832634114;
                        i4 = 819390411;
                    }
                    StringBuilder sb18 = sb;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    sbM21133 = sb18;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x024c A[PHI: r2 r8 r21 r23 r24
      0x024c: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String) binds: [B:11:0x0080, B:61:0x024a, B:53:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v4 java.lang.String) binds: [B:11:0x0080, B:61:0x024a, B:53:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r21v24 l.ܽܳ᩷) = (r21v13 l.ܽܳ᩷), (r21v21 l.ܽܳ᩷), (r21v25 l.ܽܳ᩷) binds: [B:11:0x0080, B:61:0x024a, B:53:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r23v13 int) = (r23v2 int), (r23v10 int), (r23v14 int) binds: [B:11:0x0080, B:61:0x024a, B:53:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r24v14 int) = (r24v4 int), (r24v11 int), (r24v15 int) binds: [B:11:0x0080, B:61:0x024a, B:53:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00da, code lost:
    
        if (p067l.C1929.f83011 != 0) goto L27;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C18249 m34304(C19561 c19561) throws C3924 {
        int i;
        int i2;
        int iM55979;
        int i3;
        int iM55680;
        int i4;
        int i5;
        int i6;
        int iM55681;
        int i7;
        int i8;
        int i9 = C0912.f81867;
        int i10 = C0866.f81837;
        int iM55682 = C0873.m55680("ۚۚ") ^ i9;
        int i11 = ((iM55682 ^ i10) * (-15813)) ^ 714862803;
        C5738 c5738M55694 = null;
        short[] sArr = null;
        int i12 = iM55682 ^ 757923485;
        String strM55792 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = 331209102;
        short s = 0;
        short[] sArr2 = null;
        String strM55689 = null;
        C18249 c18249M41516 = null;
        Exception exc = null;
        Object obj = null;
        int iM559710 = 0;
        while (true) {
            i18 = i12 ^ (i11 & (((i18 ^ i10) * 14571) >> 31));
            switch (i18) {
                case -2074666364:
                case 1482369967:
                    C0882.m55710();
                    C1036.m56257();
                    c18249M41516 = c18249M41516;
                    i6 = i14;
                    iM55681 = C0873.m55680("ۤۗ") ^ i9;
                    i4 = ((iM55681 ^ i10) * (-6451)) ^ 1507081842;
                    i7 = -1091014939;
                    i8 = iM55681 ^ i7;
                    i14 = i6;
                    C18249 c18249 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c18249;
                    break;
                case -1963380897:
                case -1838628158:
                    i13 = 21829;
                    iM55680 = (C0873.m55680("ۡᩳ") ^ i10) * (-25);
                    i4 = ((iM55680 ^ i9) * (-9023)) ^ (-1527923677);
                    i5 = 28069107;
                    i8 = iM55680 ^ i5;
                    i14 = i14;
                    i15 = i15;
                    C18249 c182410 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c182410;
                    break;
                case -1960067934:
                case 572633207:
                    StringBuilder sb = new StringBuilder();
                    c18249M41516 = c18249M41516;
                    String strM56156 = ServiceConnectionC1013.m56156(iM559710);
                    if (!C1025.m56230()) {
                        C1003.m56121(sb, strM56156);
                        short[] sArr3 = f82190;
                        i6 = i14;
                        if (!RunnableC0897.m55784()) {
                            int i19 = i15;
                            C0912.m55825(sb, C1046.m56293(sArr3, 128, 1, i13));
                            if (!C0917.f81868) {
                                C0898.m55794(sb, exc);
                                throw new C3924(C0863.m55639(sb));
                            }
                            i15 = i19;
                            iM55681 = C0873.m55680("ۤۗ") ^ i9;
                            i4 = ((iM55681 ^ i10) * (-6451)) ^ 1507081842;
                            i7 = -1091014939;
                        }
                        i8 = iM55681 ^ i7;
                        i14 = i6;
                        C18249 c182411 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c182411;
                    } else {
                        i6 = i14;
                    }
                    iM55681 = C0873.m55680("᩷ۜ") ^ i9;
                    i4 = ((iM55681 ^ i10) * (-19019)) ^ 1009193172;
                    i7 = 1883044427;
                    i8 = iM55681 ^ i7;
                    i14 = i6;
                    C18249 c182412 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c182412;
                    break;
                case -1927794902:
                case -1419524941:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ܽۡ") ^ i9;
                        i = ((iM55979 ^ i10) * (-2449)) ^ (-399862020);
                        i3 = 1230215254;
                        i12 = iM55979 ^ i3;
                        i11 = i;
                    } else {
                        c18249M41516 = c18249M41516;
                        i15 = i15;
                        int iM559711 = (i10 - C0946.m55979("۠ۤ")) * 27;
                        i4 = ((iM559711 ^ i9) * (-1293)) ^ 2140882536;
                        i8 = iM559711 ^ (-788924854);
                        i15 = i15;
                        C18249 c182413 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c182413;
                    }
                    break;
                case -1788331730:
                case -1060746911:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    int i20 = i16 + i17;
                    if (i15 - (i20 + i20) <= 0) {
                        iM55680 = C0946.m55979("ܺܺ") ^ i9;
                        i4 = ((iM55680 ^ i10) * (-23975)) ^ 608238623;
                        i5 = 97145551;
                    } else {
                        iM55680 = C0946.m55979("ۤܶ") ^ i10;
                        i4 = ((iM55680 ^ i9) * (-29461)) ^ 1238088650;
                        i5 = 1440392590;
                    }
                    i8 = iM55680 ^ i5;
                    i14 = i14;
                    i15 = i15;
                    C18249 c182414 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c182414;
                    break;
                case -1728543599:
                case 1321331749:
                    c18249M41516 = c18249M41516;
                    i6 = i14;
                    i15 = i6 * i6;
                    i16 = s * s;
                    i17 = 156075049;
                    if (C0892.f81851) {
                        iM55681 = (C0873.m55680("֡ۖ") ^ i9) * (-95);
                        i4 = ((iM55681 ^ i10) * 4929) ^ (-362185043);
                        i7 = 1116266319;
                    } else {
                        iM55681 = C0873.m55680("ۤۗ") ^ i9;
                        i4 = ((iM55681 ^ i10) * (-6451)) ^ 1507081842;
                        i7 = -1091014939;
                    }
                    i8 = iM55681 ^ i7;
                    i14 = i6;
                    C18249 c182415 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c182415;
                    break;
                case -1683187452:
                case 875467076:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    strM55792 = C0898.m55792(f82190, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 13, i13);
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("᩸ܿ") + i10) * (-101);
                        i4 = ((iM55680 ^ i9) * 15991) ^ (-1015965903);
                        i5 = -429415120;
                    } else {
                        iM55680 = (C0873.m55680("۬᩹") + i9) * (-69);
                        i4 = ((iM55680 ^ i10) * 11263) ^ 222892827;
                        i5 = -857156031;
                    }
                    i8 = iM55680 ^ i5;
                    i14 = i14;
                    i15 = i15;
                    C18249 c182416 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c182416;
                    break;
                case -1559120385:
                case 666254808:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    obj = null;
                    iM55680 = C0873.m55680("ۘ᩺") ^ i10;
                    i4 = ((iM55680 ^ i9) * 12185) ^ (-540500822);
                    i5 = -1890209948;
                    i8 = iM55680 ^ i5;
                    i14 = i14;
                    i15 = i15;
                    C18249 c182417 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c182417;
                    break;
                case -1546078397:
                case 827638470:
                    return c18249M41516;
                case -1483844211:
                case 1611290802:
                    c18249M41516 = c18249M41516;
                    i15 = i15;
                    short s2 = s;
                    i14 = s2 + 12493;
                    if (!C0892.m55749()) {
                        s = s2;
                        int iM559712 = (i10 - C0946.m55979("۠ۤ")) * 27;
                        i4 = ((iM559712 ^ i9) * (-1293)) ^ 2140882536;
                        i8 = iM559712 ^ (-788924854);
                        i15 = i15;
                        C18249 c182418 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c182418;
                    } else {
                        int iM55683 = (i10 - C0873.m55680("᩻ۘ")) * 97;
                        i = ((iM55683 ^ i9) * (-30843)) ^ 721328878;
                        i2 = iM55683 ^ (-974645085);
                        s = s2;
                        c18249M41516 = c18249M41516;
                        i15 = i15;
                        i12 = i2;
                        i11 = i;
                    }
                    break;
                case -1247043397:
                case 1174433307:
                    i13 = 62330;
                    iM55680 = (C0873.m55680("ۡᩳ") ^ i10) * (-25);
                    i4 = ((iM55680 ^ i9) * (-9023)) ^ (-1527923677);
                    i5 = 28069107;
                    i8 = iM55680 ^ i5;
                    i14 = i14;
                    i15 = i15;
                    C18249 c182419 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c182419;
                    break;
                case -713303817:
                case -390397372:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    s = sArr2[c];
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = (i9 - C0873.m55680("ᩴܳ")) * 45;
                        i4 = ((iM55680 ^ i10) * 24687) ^ 2023701969;
                        i5 = -1977780669;
                        i8 = iM55680 ^ i5;
                        i14 = i14;
                        i15 = i15;
                        C18249 c1824110 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c1824110;
                    }
                    i14 = i14;
                    int iM559713 = (i10 - C0946.m55979("۠ۤ")) * 27;
                    i4 = ((iM559713 ^ i9) * (-1293)) ^ 2140882536;
                    i8 = iM559713 ^ (-788924854);
                    i15 = i15;
                    C18249 c1824111 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c1824111;
                    break;
                case -490471657:
                case 1860632137:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    short s3 = s;
                    sArr2 = f82190;
                    c = 'o';
                    if (C1017.f81942 < 0) {
                        int iM559714 = C0946.m55979("ۖܳ") ^ i10;
                        i = ((iM559714 ^ i9) * (-27279)) ^ (-2045551015);
                        i2 = iM559714 ^ 932745050;
                        s = s3;
                        c18249M41516 = c18249M41516;
                        i14 = i14;
                        i15 = i15;
                        i12 = i2;
                        i11 = i;
                    } else {
                        s = s3;
                        i14 = i14;
                        int iM559715 = (i10 - C0946.m55979("۠ۤ")) * 27;
                        i4 = ((iM559715 ^ i9) * (-1293)) ^ 2140882536;
                        i8 = iM559715 ^ (-788924854);
                        i15 = i15;
                        C18249 c1824112 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c1824112;
                    }
                    break;
                case -286009319:
                case 330292862:
                    C1071.m56343();
                    if (C1929.f83011 == 0) {
                        c18249M41516 = c18249M41516;
                        i14 = i14;
                        i15 = i15;
                        iM55680 = C0946.m55979("ۨܺ") ^ i9;
                        i4 = ((iM55680 ^ i10) * 10557) ^ (-2002259138);
                        i5 = 895626020;
                        i8 = iM55680 ^ i5;
                        i14 = i14;
                        i15 = i15;
                        C18249 c1824113 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c1824113;
                    } else {
                        iM55979 = (C0946.m55979("۟ۘ") + i10) * (-117);
                        i = ((iM55979 ^ i9) * (-28799)) ^ 1238177401;
                        i3 = -1989338786;
                        i12 = iM55979 ^ i3;
                        i11 = i;
                    }
                    break;
                case -47027966:
                case 1348680932:
                    C1929.m56553();
                    C1071.m56343();
                    return null;
                case 78380078:
                case 661162732:
                    throw new C3924(ServiceConnectionC1013.m56156(iM559710));
                case 163193095:
                case 177841286:
                    break;
                case 389653517:
                case 758956006:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    strM55689 = C0873.m55689(sArr, C0254q.f1218h, 3, i13);
                    if (C1025.m56230()) {
                        iM55680 = (C0946.m55979("᩸ܿ") + i10) * (-101);
                        i4 = ((iM55680 ^ i9) * 15991) ^ (-1015965903);
                        i5 = -429415120;
                    } else {
                        iM55680 = (i10 - C0946.m55979("ۢۚ")) * 115;
                        i4 = ((iM55680 ^ i9) * 17107) ^ (-88351078);
                        i5 = -1833093840;
                    }
                    i8 = iM55680 ^ i5;
                    i14 = i14;
                    i15 = i15;
                    C18249 c1824114 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c1824114;
                    break;
                case 565294644:
                case 871701146:
                    if (!C1929.m56553()) {
                        iM55979 = (C0946.m55979("۟ۘ") + i10) * (-117);
                        i = ((iM55979 ^ i9) * (-28799)) ^ 1238177401;
                        i3 = -1989338786;
                        i12 = iM55979 ^ i3;
                        i11 = i;
                    } else {
                        c18249M41516 = c18249M41516;
                        i14 = i14;
                        i15 = i15;
                        iM55680 = (C0946.m55979("᩸ܿ") + i10) * (-101);
                        i4 = ((iM55680 ^ i9) * 15991) ^ (-1015965903);
                        i5 = -429415120;
                        i8 = iM55680 ^ i5;
                        i14 = i14;
                        i15 = i15;
                        C18249 c1824115 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c1824115;
                    }
                    break;
                case 789417666:
                case 1349916613:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    try {
                        c18249M41516 = C18249.m41516(new JSONObject(new String(C1003.m56127(c19561, c5738M55694, obj), StandardCharsets.UTF_8)), c19561);
                        int iM559716 = C0946.m55979("۬ܶ") ^ i10;
                        i12 = iM559716 ^ (-294172401);
                        i11 = ((iM559716 ^ i9) * 5071) ^ (-1559062602);
                        i14 = i14;
                        i15 = i15;
                    } catch (Exception e) {
                        exc = e;
                        iM55680 = C0946.m55979("᩸ܳ") ^ i9;
                        i4 = ((iM55680 ^ i10) * (-21327)) ^ (-745830215);
                        i5 = 1642614872;
                        i8 = iM55680 ^ i5;
                        i14 = i14;
                        i15 = i15;
                        C18249 c1824116 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c1824116;
                    }
                    break;
                case 822054057:
                case 1996033754:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    c5738M55694 = C0877.m55694(c19561, strM55792);
                    sArr = f82190;
                    if (RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("᩷ܰ") ^ i9;
                        i4 = ((iM55680 ^ i10) * 10353) ^ (-905340987);
                        i5 = 1425032192;
                    } else {
                        iM55680 = C0946.m55979("ۨܺ") ^ i9;
                        i4 = ((iM55680 ^ i10) * 10557) ^ (-2002259138);
                        i5 = 895626020;
                    }
                    i8 = iM55680 ^ i5;
                    i14 = i14;
                    i15 = i15;
                    C18249 c1824117 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c1824117;
                    break;
                case 1065882925:
                case 1990733282:
                    if (C1012.m56134() > 0) {
                        iM55979 = (C0946.m55979("۟ۘ") + i10) * (-117);
                        i = ((iM55979 ^ i9) * (-28799)) ^ 1238177401;
                        i3 = -1989338786;
                        i12 = iM55979 ^ i3;
                        i11 = i;
                    } else {
                        c18249M41516 = c18249M41516;
                        i15 = i15;
                        int iM559717 = (i10 - C0946.m55979("۠ۤ")) * 27;
                        i4 = ((iM559717 ^ i9) * (-1293)) ^ 2140882536;
                        i8 = iM559717 ^ (-788924854);
                        i15 = i15;
                        C18249 c1824118 = c18249M41516;
                        i12 = i8;
                        i11 = i4;
                        c18249M41516 = c1824118;
                    }
                    break;
                default:
                    c18249M41516 = c18249M41516;
                    i14 = i14;
                    i15 = i15;
                    iM559710 = 2103271330 ^ C0946.m55979(strM55689);
                    if (c5738M55694 != null) {
                        iM55680 = C0873.m55680("ܿۚ") ^ i9;
                        i4 = ((iM55680 ^ i10) * 1359) ^ 2142835443;
                        i5 = 1685848375;
                    } else {
                        iM55680 = (C0873.m55680("ۚۧ") ^ i10) * (-83);
                        i4 = ((iM55680 ^ i9) * 12855) ^ 1805345164;
                        i5 = -1546464360;
                    }
                    i8 = iM55680 ^ i5;
                    i14 = i14;
                    i15 = i15;
                    C18249 c1824119 = c18249M41516;
                    i12 = i8;
                    i11 = i4;
                    c18249M41516 = c1824119;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x038e A[PHI: r3 r10 r13 r14 r15 r16 r19 r20 r23 r24 r25
      0x038e: PHI (r3v17 int) = (r3v12 int), (r3v16 int), (r3v18 int) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r10v15 int) = (r10v9 int), (r10v13 int), (r10v16 int) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r13v15 short[]) = (r13v9 short[]), (r13v13 short[]), (r13v16 short[]) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r14v20 int) = (r14v14 int), (r14v18 int), (r14v21 int) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r15v4 short) = (r15v2 short), (r15v3 short), (r15v2 short) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r16v3 int) = (r16v2 int), (r16v2 int), (r16v4 int) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r19v6 int) = (r19v5 int), (r19v5 int), (r19v7 int) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r20v2 int) = (r20v1 int), (r20v1 int), (r20v3 int) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r23v15 l.ᩳܰۡ) = (r23v10 l.ᩳܰۡ), (r23v14 l.ᩳܰۡ), (r23v16 l.ᩳܰۡ) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r24v14 short[]) = (r24v10 short[]), (r24v13 short[]), (r24v15 short[]) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r25v15 short) = (r25v10 short), (r25v14 short), (r25v16 short) binds: [B:81:0x038c, B:59:0x026d, B:54:0x023e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        if (p067l.C0892.f81851 != false) goto L14;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m34308(AbstractC17043 abstractC17043, boolean z, boolean z2, InterfaceC5589 interfaceC5589) throws Throwable {
        int i;
        int i2;
        short[] sArr;
        int i3;
        int iM55979;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        short[] sArr2;
        C19561 c19561;
        short s;
        int i8;
        int i9;
        short[] sArr3;
        int iM559711;
        int i10;
        int i11;
        int i12;
        int i13 = C0873.f81841;
        int i14 = C0894.f81854;
        int iM55680 = C0873.m55680("֫۬") ^ i14;
        int i15 = ((iM55680 ^ i13) * 25553) ^ (-1049301908);
        C19561 c19562 = null;
        C19561 c19563 = null;
        Throwable th = null;
        short[] sArr4 = null;
        int i16 = iM55680 ^ (-1955861426);
        int i17 = 529103326;
        int i18 = 0;
        int i19 = 0;
        short s2 = 0;
        short s3 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        C19561 c19564 = null;
        AbstractC17043 abstractC17043M55985 = null;
        short[] sArr5 = null;
        AbstractC17043 abstractC17044 = null;
        int i23 = 0;
        while (true) {
            i17 = i16 ^ (i15 & (((i17 ^ i13) * 17691) >> 31));
            switch (i17) {
                case -2134327831:
                case -1621270192:
                    i19 = 62695;
                    int iM55681 = (i13 - C0873.m55680("᩺ܺ")) * 39;
                    i4 = ((iM55681 ^ i14) * 10455) ^ 675954021;
                    i12 = iM55681 ^ (-1226509663);
                    i23 = i23;
                    i18 = i18;
                    sArr4 = sArr4;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    int i24 = i4;
                    i16 = i12;
                    i15 = i24;
                    break;
                case -2127168219:
                case -1590273055:
                    RunnableC0897.m55784();
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    iM55979 = C0946.m55979("᩶۟") ^ i14;
                    i4 = ((iM55979 ^ i13) * 643) ^ (-63008654);
                    i5 = 579448127;
                    i12 = iM55979 ^ i5;
                    i23 = i;
                    i18 = i2;
                    sArr4 = sArr;
                    i19 = i3;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    int i25 = i4;
                    i16 = i12;
                    i15 = i25;
                    break;
                case -2120735563:
                case 467640054:
                    i = i23;
                    i3 = i19;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    i2 = i18;
                    sArr = sArr4;
                    short s4 = sArr5[147];
                    s3 = 17273;
                    if (C1028.m56247() < 0) {
                        int iM559712 = C0946.m55979("֫ۡ") ^ i13;
                        i10 = ((iM559712 ^ i14) * (-10799)) ^ 880135741;
                        i16 = iM559712 ^ 1004221396;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s4;
                        i15 = i10;
                        i23 = i;
                    } else {
                        s2 = s4;
                        iM55979 = C0873.m55680("᩶ۙ") ^ i14;
                        i4 = ((iM55979 ^ i13) * 25041) ^ 250410261;
                        i5 = -1668303838;
                        i12 = iM55979 ^ i5;
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        int i26 = i4;
                        i16 = i12;
                        i15 = i26;
                    }
                    break;
                case -2119252848:
                case 1259097459:
                    C1028.m56249(c19563);
                    AbstractC0942.m55966(abstractC17043M55985);
                    throw th;
                case -1923542973:
                case 802450851:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("᩶ۙ") ^ i14;
                        i4 = ((iM55979 ^ i13) * 25041) ^ 250410261;
                        i5 = -1668303838;
                    } else {
                        iM55979 = (i13 - C0946.m55979("֨᩸")) * 7;
                        i4 = ((iM55979 ^ i14) * 17903) ^ 1228860153;
                        i5 = 1793050414;
                    }
                    i12 = iM55979 ^ i5;
                    i23 = i;
                    i18 = i2;
                    sArr4 = sArr;
                    i19 = i3;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    int i27 = i4;
                    i16 = i12;
                    i15 = i27;
                    break;
                case -1650503024:
                case 269402388:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0946.m55979("᩺ۧ") + i13) * 9;
                        i4 = ((iM55979 ^ i14) * 7649) ^ 1298833766;
                        i5 = -1319075922;
                    } else {
                        iM55979 = (i14 - C0946.m55979("᩸ܳ")) * (-73);
                        i4 = ((iM55979 ^ i13) * 20109) ^ 520156958;
                        i5 = 462823982;
                    }
                    i12 = iM55979 ^ i5;
                    i23 = i;
                    i18 = i2;
                    sArr4 = sArr;
                    i19 = i3;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    int i28 = i4;
                    i16 = i12;
                    i15 = i28;
                    break;
                case -1570274143:
                case -700389998:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    if (C0917.m55854()) {
                        iM55979 = C0946.m55979("ܶۗ") ^ i14;
                        i4 = ((iM55979 ^ i13) * 6551) ^ 481411658;
                        i5 = -1157113544;
                    } else {
                        iM55979 = C0946.m55979("᩶۟") ^ i14;
                        i4 = ((iM55979 ^ i13) * 643) ^ (-63008654);
                        i5 = 579448127;
                    }
                    i12 = iM55979 ^ i5;
                    i23 = i;
                    i18 = i2;
                    sArr4 = sArr;
                    i19 = i3;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    int i29 = i4;
                    i16 = i12;
                    i15 = i29;
                    break;
                case -1412465915:
                case 66481199:
                    i = i23;
                    int i30 = i18;
                    short[] sArr6 = sArr5;
                    short s5 = s2;
                    short[] sArr7 = sArr4;
                    int i31 = i19;
                    abstractC17043M55985 = C0946.m55985(C1024.m56217(abstractC17044, C0892.m55750(sArr7, i30, i, i31)));
                    int iM559713 = C0946.m55979("ۛۙ") ^ i13;
                    i10 = ((iM559713 ^ i14) * (-7425)) ^ 1181883045;
                    i16 = iM559713 ^ 1570798985;
                    i18 = i30;
                    sArr4 = sArr7;
                    i19 = i31;
                    sArr5 = sArr6;
                    s2 = s5;
                    c19562 = null;
                    i15 = i10;
                    i23 = i;
                    break;
                case -1343057025:
                case 1461846303:
                    C0873.m55678();
                    C1053.m56327();
                    return;
                case -1306239156:
                case 232119686:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    if (C1025.f81947 < 0) {
                        iM55979 = (C0946.m55979("ۛۖ") ^ i13) * (-71);
                        i4 = ((iM55979 ^ i14) * (-27193)) ^ 1462093431;
                        i5 = 2068189012;
                        i12 = iM55979 ^ i5;
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        int i210 = i4;
                        i16 = i12;
                        i15 = i210;
                    } else {
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        iM559710 = (i14 - C0946.m55979("ܰ᩸")) * (-3);
                        i6 = ((iM559710 ^ i13) * 22837) ^ 1215481051;
                        i7 = -1804939094;
                        i16 = i7 ^ iM559710;
                        i15 = i6;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                    }
                    break;
                case -1007678665:
                case -308290629:
                    break;
                case -868717635:
                case 1623233405:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    if (!C0927.f81875) {
                        iM55979 = (i14 - C0873.m55680("ۖܰ")) * (-49);
                        i4 = ((iM55979 ^ i13) * 30275) ^ 1702427989;
                        i5 = 1634334370;
                        i12 = iM55979 ^ i5;
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        int i211 = i4;
                        i16 = i12;
                        i15 = i211;
                    } else {
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        iM559710 = (i14 - C0946.m55979("ܰ᩸")) * (-3);
                        i6 = ((iM559710 ^ i13) * 22837) ^ 1215481051;
                        i7 = -1804939094;
                        i16 = i7 ^ iM559710;
                        i15 = i6;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                    }
                    break;
                case -772447470:
                case -189518134:
                    C0898.m55801(c19564);
                    AbstractC0942.m55966(abstractC17043M55985);
                    return;
                case -702675920:
                case 1634429444:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    int i32 = s2 + s3;
                    i20 = i32 * i32;
                    i21 = s2 * s2;
                    i22 = 298356529;
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("᩶ۙ") ^ i14;
                        i4 = ((iM55979 ^ i13) * 25041) ^ 250410261;
                        i5 = -1668303838;
                    } else {
                        iM55979 = C0946.m55979("ۡ۟") ^ i13;
                        i4 = ((iM55979 ^ i14) * (-3957)) ^ 113201662;
                        i5 = 533289534;
                    }
                    i12 = iM55979 ^ i5;
                    i23 = i;
                    i18 = i2;
                    sArr4 = sArr;
                    i19 = i3;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    int i212 = i4;
                    i16 = i12;
                    i15 = i212;
                    break;
                case -474750355:
                case 47177229:
                    i19 = 64898;
                    int iM55682 = (i13 - C0873.m55680("᩺ܺ")) * 39;
                    i4 = ((iM55682 ^ i14) * 10455) ^ 675954021;
                    i12 = iM55682 ^ (-1226509663);
                    i23 = i23;
                    i18 = i18;
                    sArr4 = sArr4;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    int i213 = i4;
                    i16 = i12;
                    i15 = i213;
                    break;
                case -443259901:
                case 1165584742:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    int i33 = i21 + i22;
                    if (i20 - (i33 + i33) > 0) {
                        iM55979 = C0873.m55680("ܿ۟") ^ i14;
                        i4 = ((iM55979 ^ i13) * 17383) ^ 244119888;
                        i5 = 229662464;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩷") ^ i14;
                        i4 = ((iM55979 ^ i13) * (-14603)) ^ (-800911708);
                        i5 = 1858799647;
                    }
                    i12 = iM55979 ^ i5;
                    i23 = i;
                    i18 = i2;
                    sArr4 = sArr;
                    i19 = i3;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    int i214 = i4;
                    i16 = i12;
                    i15 = i214;
                    break;
                case -84141960:
                case 914307632:
                    i = i23;
                    sArr2 = sArr4;
                    c19561 = c19562;
                    s = s2;
                    i8 = i18;
                    i9 = i19;
                    sArr3 = f82190;
                    if (C0882.f81846) {
                        iM559711 = (C0946.m55979("ܰۤ") ^ i13) * (-83);
                        i10 = ((iM559711 ^ i14) * (-16545)) ^ 1920529150;
                        i11 = -201841183;
                    } else {
                        iM559711 = C0946.m55979("ۗۘ") ^ i14;
                        i10 = ((iM559711 ^ i13) * (-2183)) ^ 1772120349;
                        i11 = 216070973;
                    }
                    i16 = iM559711 ^ i11;
                    i18 = i8;
                    sArr4 = sArr2;
                    i19 = i9;
                    c19562 = c19561;
                    s2 = s;
                    sArr5 = sArr3;
                    i15 = i10;
                    i23 = i;
                    break;
                case 101932934:
                case 1631177220:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    if (C0967.f81910 < 0) {
                        iM55979 = (i13 - C0946.m55979("᩵ܽ")) * (-63);
                        i4 = ((iM55979 ^ i14) * (-2649)) ^ 1341361441;
                        i5 = 1668863971;
                        i12 = iM55979 ^ i5;
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        int i215 = i4;
                        i16 = i12;
                        i15 = i215;
                    } else {
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        iM559710 = (i14 - C0946.m55979("ܰ᩸")) * (-3);
                        i6 = ((iM559710 ^ i13) * 22837) ^ 1215481051;
                        i7 = -1804939094;
                        i16 = i7 ^ iM559710;
                        i15 = i6;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                    }
                    break;
                case 118507921:
                case 1006391995:
                    i = i23;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i2 = i18;
                    sArr = sArr4;
                    i3 = i19;
                    try {
                        try {
                            C19561 c19565 = new C19561(abstractC17043);
                            int iM55683 = C0873.m55680("ܽܽ") ^ i14;
                            int i34 = ((iM55683 ^ i13) * 15213) ^ (-1373421339);
                            i16 = iM55683 ^ (-777701666);
                            c19564 = c19565;
                            i15 = i34;
                            i18 = i2;
                            sArr4 = sArr;
                            i19 = i3;
                            i17 = i17;
                            c19562 = c19562;
                            sArr5 = sArr5;
                            s2 = s2;
                            i23 = i;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            c19563 = c19562;
                            c19564 = null;
                            iM55979 = C0946.m55979("ۗᩳ") ^ i13;
                            i4 = ((iM55979 ^ i14) * (-28329)) ^ 1371271894;
                            i5 = -618740310;
                            i12 = iM55979 ^ i5;
                            i23 = i;
                            i18 = i2;
                            sArr4 = sArr;
                            i19 = i3;
                            i17 = i17;
                            c19562 = c19562;
                            sArr5 = sArr5;
                            s2 = s2;
                            int i216 = i4;
                            i16 = i12;
                            i15 = i216;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    break;
                case 162737681:
                case 1558041623:
                    i = i23;
                    c19562 = c19562;
                    i2 = i18;
                    sArr5 = sArr5;
                    sArr = sArr4;
                    s2 = s2;
                    i3 = i19;
                    try {
                        m34309(c19564, abstractC17043, abstractC17043M55985, z, z2, interfaceC5589);
                        int iM55684 = C0873.m55680("ۡ֫") ^ i13;
                        i16 = (-1958390082) ^ iM55684;
                        i23 = i;
                        i15 = ((iM55684 ^ i14) * (-5877)) ^ 1819879599;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                    } catch (Throwable th4) {
                        th = th4;
                        c19563 = c19564;
                        iM55979 = C0946.m55979("ۗᩳ") ^ i13;
                        i4 = ((iM55979 ^ i14) * (-28329)) ^ 1371271894;
                        i5 = -618740310;
                        i12 = iM55979 ^ i5;
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        int i217 = i4;
                        i16 = i12;
                        i15 = i217;
                    }
                    break;
                case 301238888:
                case 2021870001:
                    C1053.m56327();
                    if (C1964.f83032 <= 0) {
                        i = i23;
                        c19561 = c19562;
                        sArr3 = sArr5;
                        s = s2;
                        i8 = i18;
                        sArr2 = sArr4;
                        i9 = i19;
                        iM559711 = (C0946.m55979("ܰۤ") ^ i13) * (-83);
                        i10 = ((iM559711 ^ i14) * (-16545)) ^ 1920529150;
                        i11 = -201841183;
                        i16 = iM559711 ^ i11;
                        i18 = i8;
                        sArr4 = sArr2;
                        i19 = i9;
                        c19562 = c19561;
                        s2 = s;
                        sArr5 = sArr3;
                        i15 = i10;
                        i23 = i;
                    } else {
                        i = i23;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        i2 = i18;
                        sArr = sArr4;
                        i3 = i19;
                        iM55979 = (C0946.m55979("᩺ۧ") + i13) * 9;
                        i4 = ((iM55979 ^ i14) * 7649) ^ 1298833766;
                        i5 = -1319075922;
                        i12 = iM55979 ^ i5;
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        int i218 = i4;
                        i16 = i12;
                        i15 = i218;
                    }
                    break;
                case 1451548584:
                case 1796494955:
                    C1046.m56302();
                    if (C1025.f81947 < 0) {
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        i3 = i19;
                        iM559710 = (i14 - C0946.m55979("ܰ᩸")) * (-3);
                        i6 = ((iM559710 ^ i13) * 22837) ^ 1215481051;
                        i7 = -1804939094;
                        i16 = i7 ^ iM559710;
                        i15 = i6;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                    } else {
                        i = i23;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        i2 = i18;
                        sArr = sArr4;
                        i3 = i19;
                        iM55979 = C0946.m55979("᩶۟") ^ i14;
                        i4 = ((iM55979 ^ i13) * 643) ^ (-63008654);
                        i5 = 579448127;
                        i12 = iM55979 ^ i5;
                        i23 = i;
                        i18 = i2;
                        sArr4 = sArr;
                        i19 = i3;
                        i17 = i17;
                        c19562 = c19562;
                        sArr5 = sArr5;
                        s2 = s2;
                        int i219 = i4;
                        i16 = i12;
                        i15 = i219;
                    }
                    break;
                default:
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    i3 = i19;
                    abstractC17044 = C17853.f53284;
                    sArr4 = f82190;
                    i18 = 148;
                    i23 = 6;
                    if (C0947.f81895) {
                        iM559710 = (i14 - C0946.m55979("ܰ᩸")) * (-3);
                        i6 = ((iM559710 ^ i13) * 22837) ^ 1215481051;
                        i7 = -1804939094;
                    } else {
                        iM559710 = (i14 - C0873.m55680("ۧܰ")) * 83;
                        i6 = ((iM559710 ^ i13) * (-17233)) ^ (-113186896);
                        i7 = 1986885573;
                    }
                    i16 = i7 ^ iM559710;
                    i15 = i6;
                    i19 = i3;
                    i17 = i17;
                    c19562 = c19562;
                    sArr5 = sArr5;
                    s2 = s2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0633 A[PHI: r16 r17 r18 r20 r25
      0x0633: PHI (r16v4 short) = (r16v2 short), (r16v3 short), (r16v2 short) binds: [B:130:0x0631, B:122:0x05d2, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0633: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:130:0x0631, B:122:0x05d2, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0633: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:130:0x0631, B:122:0x05d2, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0633: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:130:0x0631, B:122:0x05d2, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0633: PHI (r25v39 int) = (r25v7 int), (r25v9 int), (r25v40 int) binds: [B:130:0x0631, B:122:0x05d2, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x014c A[PHI: r6 r7 r10
      0x014c: PHI (r6v4 java.lang.Integer) = (r6v3 java.lang.Integer), (r6v2 java.lang.Integer), (r6v2 java.lang.Integer), (r6v2 java.lang.Integer) binds: [B:43:0x014a, B:35:0x0100, B:19:0x00aa, B:7:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r7v4 java.lang.Object[]) = (r7v3 java.lang.Object[]), (r7v2 java.lang.Object[]), (r7v2 java.lang.Object[]), (r7v2 java.lang.Object[]) binds: [B:43:0x014a, B:35:0x0100, B:19:0x00aa, B:7:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:43:0x014a, B:35:0x0100, B:19:0x00aa, B:7:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static String m34300(int i) {
        int iM55979;
        int i2;
        int i3;
        int i4;
        short[] sArr;
        String strM55783;
        int iM559710;
        int i5;
        int i6;
        int iM55680;
        int i7;
        int i8;
        int i9;
        int iM559711;
        int i10;
        int i11 = 375467958;
        int i12 = C0863.f81833;
        int i13 = C0906.f81862;
        int iM55681 = (C0873.m55680("ܽ᩺") + i12) * 115;
        int i14 = ((iM55681 ^ i13) * 31069) ^ 572565272;
        int i15 = iM55681 ^ 1912837557;
        Object[] objArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i16 = 0;
        int i17 = 0;
        int iM559712 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        short s = 0;
        char c = 0;
        int i22 = 0;
        int i23 = 0;
        short s2 = 0;
        Integer numM56129 = null;
        short[] sArr4 = null;
        int iM559713 = 0;
        Object[] objArr2 = null;
        String strM55579 = null;
        char c2 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 12981) >> 31));
            switch (i11) {
                case -2109099783:
                case -325339122:
                    strM55783 = C0955.m56029(f82190, 15, 3, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -2045721445:
                case -251954965:
                    strM55783 = C1929.m56558(f82190, 37, 2, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -2014282633:
                case -1533537356:
                    i19 = 10866;
                    iM55979 = C0946.m55979("ۚۜ") ^ i13;
                    i2 = ((iM55979 ^ i12) * (-20141)) ^ (-1989655790);
                    i3 = 220712356;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1971366853:
                case 1992298580:
                    strM55783 = C0989.m56092(f82190, 34, 3, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1941552580:
                case -1680470137:
                    C0894.m55769();
                    ServiceConnectionC1013.m56157();
                    return null;
                case -1820852376:
                case -632183422:
                    i16 = i16;
                    strM55579 = C0845.m55579(i - 20);
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1573936947:
                case -1475211161:
                    i16 = i16;
                    switch (i) {
                        case 22:
                            iM55979 = C0946.m55979("ܶ֡") ^ i13;
                            i2 = ((iM55979 ^ i12) * 27927) ^ (-1175849157);
                            i3 = -580691614;
                            break;
                        case 23:
                            iM55979 = C0873.m55680("ᩳܳ") ^ i12;
                            i2 = ((iM55979 ^ i13) * 20049) ^ 836746315;
                            i3 = 1974727758;
                            break;
                        case 24:
                            iM55979 = C0946.m55979("֨ܺ") ^ i12;
                            i2 = ((iM55979 ^ i13) * 28119) ^ 1566654335;
                            i3 = -193966691;
                            break;
                        case 25:
                            iM55979 = C0873.m55680("֫۠") ^ i13;
                            i2 = ((iM55979 ^ i12) * (-25957)) ^ (-837648898);
                            i3 = 2044026023;
                            break;
                        case 26:
                            iM55979 = C0873.m55680("ܶܳ") ^ i12;
                            i2 = ((iM55979 ^ i13) * 6649) ^ 1643928085;
                            i3 = -1530609632;
                            break;
                        case 27:
                            iM55979 = C0946.m55979("ۖ۟") ^ i13;
                            i2 = ((iM55979 ^ i12) * (-26287)) ^ 1604323805;
                            i3 = 2103098178;
                            break;
                        case 28:
                            iM55979 = C0946.m55979("᩵۟") ^ i12;
                            i2 = ((iM55979 ^ i13) * 9429) ^ 284290544;
                            i3 = 2005193958;
                            break;
                        case 29:
                            iM55979 = C0873.m55680("֨᩷") ^ i13;
                            i2 = ((iM55979 ^ i12) * 14243) ^ (-1936516265);
                            i3 = -1472558242;
                            break;
                        case 30:
                            iM55979 = C0873.m55680("ܳۖ") ^ i12;
                            i2 = ((iM55979 ^ i13) * 14611) ^ 2135125972;
                            i3 = -1512511523;
                            break;
                        case 31:
                            iM55979 = (i13 - C0873.m55680("᩺֫")) * (-81);
                            i2 = ((iM55979 ^ i12) * 23755) ^ (-1941755522);
                            i3 = 1579104350;
                            break;
                        case 32:
                            iM55979 = (C0946.m55979("ۢ۬") ^ i12) * 23;
                            i2 = ((iM55979 ^ i13) * 1381) ^ (-1599200703);
                            i3 = -1219224698;
                            break;
                        case 33:
                            iM55979 = C0946.m55979("۠ۘ") ^ i13;
                            i2 = ((iM55979 ^ i12) * 31939) ^ 1783750022;
                            i3 = 689482056;
                            break;
                        case 34:
                            iM55979 = (i13 - C0946.m55979("ᩳۢ")) * 17;
                            i2 = ((iM55979 ^ i12) * 13413) ^ 570629328;
                            i3 = -332514590;
                            break;
                        case 35:
                            iM55979 = (C0946.m55979("ۗᩳ") ^ i12) * (-83);
                            i2 = ((iM55979 ^ i13) * (-8375)) ^ 2121176544;
                            i3 = 531895744;
                            break;
                        case 36:
                            iM55979 = (C0946.m55979("ܺۨ") ^ i12) * 83;
                            i2 = ((iM55979 ^ i13) * 20925) ^ (-513309875);
                            i3 = -1030516193;
                            break;
                        default:
                            iM55979 = C0946.m55979("۠֡") ^ i13;
                            i2 = ((iM55979 ^ i12) * 2385) ^ 458780832;
                            i3 = -1262506956;
                            break;
                    }
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1448907973:
                case -199043655:
                    strM55783 = C0989.m56092(f82190, 41, 2, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1335838332:
                case 1376421891:
                    if (!C0892.m55749()) {
                        iM559710 = C0946.m55979("ۨᩴ") ^ i12;
                        i2 = ((iM559710 ^ i13) * (-27763)) ^ (-1005748260);
                        i5 = 1418931445;
                        i15 = iM559710 ^ i5;
                        i14 = i2;
                    } else {
                        sArr = sArr2;
                        int iM55682 = (C0873.m55680("ۚ᩷") ^ i13) * (-69);
                        i16 = i16;
                        int i24 = ((iM55682 ^ i12) * 13045) ^ (-1684436578);
                        i4 = iM55682 ^ (-728097955);
                        sArr2 = sArr;
                        i14 = i24;
                        i16 = i16;
                        i15 = i4;
                    }
                    break;
                case -1313078457:
                case -336653528:
                    C1044.m56286();
                    i6 = i16;
                    sArr = sArr2;
                    iM55680 = C0873.m55680("ۜۛ") ^ i13;
                    i7 = ((iM55680 ^ i12) * (-22959)) ^ 1191676766;
                    i8 = 592326504;
                    i10 = iM55680 ^ i8;
                    sArr2 = sArr;
                    i14 = i7;
                    int i25 = i6;
                    i15 = i10;
                    i16 = i25;
                    break;
                case -1270107599:
                case 402580465:
                    return C1003.m56122(2101768856 ^ iM559713, objArr);
                case -1137744484:
                case -720047274:
                    strM55783 = C0912.m55822(f82190, 21, 3, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1120714017:
                case -143745024:
                    strM55783 = C1194.m56386(f82190, 30, 2, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1059941174:
                case -172983450:
                    numM56129 = C1003.m56129(i);
                    objArr = new Object[2];
                    objArr[c2] = strM55579;
                    if (C1046.m56302() != 0) {
                        iM559710 = C0873.m55680("ۗ۫") ^ i13;
                        i2 = ((iM559710 ^ i12) * 16581) ^ 1262313084;
                        i5 = -813853846;
                    } else {
                        iM559710 = C0946.m55979("᩶ۨ") ^ i12;
                        i2 = ((iM559710 ^ i13) * (-24493)) ^ (-180022618);
                        i5 = -477457767;
                    }
                    i15 = iM559710 ^ i5;
                    i14 = i2;
                    break;
                case -1050877320:
                case 1688518379:
                    strM55783 = C0967.m56077(f82190, 32, 2, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1034124726:
                case 712162890:
                    i16 = i16;
                    if ((s2 * s) - i23 > 0) {
                        iM55979 = (i12 - C0946.m55979("ܳܳ")) * 39;
                        i2 = ((iM55979 ^ i13) * (-27341)) ^ 354972551;
                        i3 = 1865158451;
                    } else {
                        iM55979 = C0946.m55979("֡᩸") ^ i13;
                        i2 = ((iM55979 ^ i12) * (-27941)) ^ (-1118671806);
                        i3 = 2109426576;
                    }
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -989195815:
                case -684493502:
                    return C1003.m56122(iM559712 ^ i18, objArr2);
                case -986599679:
                case -760007348:
                    i19 = 56765;
                    iM55979 = C0946.m55979("ۚۜ") ^ i13;
                    i2 = ((iM55979 ^ i12) * (-20141)) ^ (-1989655790);
                    i3 = 220712356;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -883360161:
                case 1936919550:
                    strM55783 = C1194.m56386(f82190, 39, 2, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -782972094:
                case -690136039:
                    strM55783 = C1046.m56293(f82190, 18, 3, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -766322784:
                case 1265569710:
                    strM55783 = C1964.m56584(f82190, 24, 3, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -712607780:
                case 725193065:
                    if (C0890.m55740()) {
                        iM559710 = C0946.m55979("ۨᩴ") ^ i12;
                        i2 = ((iM559710 ^ i13) * (-27763)) ^ (-1005748260);
                        i5 = 1418931445;
                    } else {
                        iM559710 = C0873.m55680("ۗ۫") ^ i13;
                        i2 = ((iM559710 ^ i12) * 16581) ^ 1262313084;
                        i5 = -813853846;
                    }
                    i15 = iM559710 ^ i5;
                    i14 = i2;
                    break;
                case -709943175:
                case 313417069:
                    i6 = i16;
                    sArr2 = f82190;
                    if (C1025.f81947 >= 0) {
                        iM559711 = C0946.m55979("ۜܳ") ^ i12;
                        i14 = ((iM559711 ^ i13) * (-3085)) ^ (-33740910);
                        i9 = 869403071;
                    } else {
                        iM559711 = (C0946.m55979("ۜ᩹") + i13) * (-103);
                        i14 = ((iM559711 ^ i12) * (-15163)) ^ 227299108;
                        i9 = -650340649;
                    }
                    i10 = iM559711 ^ i9;
                    int i26 = i6;
                    i15 = i10;
                    i16 = i26;
                    break;
                case -688562590:
                case 1658280529:
                    strM55783 = C0866.m55652(f82190, 43, 2, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -459980355:
                case 1869393133:
                    strM55783 = ServiceConnectionC1013.m56161(f82190, 27, 1, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -447304127:
                case 1169698472:
                    i16 = i16;
                    strM55579 = null;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -323152571:
                case 919259179:
                    i6 = i16;
                    sArr = sArr2;
                    objArr2 = new Object[i17];
                    objArr2[c2] = C1003.m56129(i);
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("ۜۛ") ^ i13;
                        i7 = ((iM55680 ^ i12) * (-22959)) ^ 1191676766;
                        i8 = 592326504;
                    } else {
                        iM55680 = (C0873.m55680("᩹֫") ^ i12) * (-23);
                        i7 = ((iM55680 ^ i13) * (-21511)) ^ 717672372;
                        i8 = -776780570;
                    }
                    i10 = iM55680 ^ i8;
                    sArr2 = sArr;
                    i14 = i7;
                    int i27 = i6;
                    i15 = i10;
                    i16 = i27;
                    break;
                case -261354226:
                case 1834716271:
                    strM55783 = C0955.m56029(f82190, 12, 3, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -201644677:
                case 2065383311:
                    i16 = i16;
                    s2 = sArr4[c];
                    i22 = s2 * s2;
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i12 - C0946.m55979("ۜۗ")) * 81;
                        i2 = ((iM55979 ^ i13) * (-15509)) ^ 786220139;
                        i3 = -1653795224;
                    } else {
                        iM55979 = (i12 - C0873.m55680("᩺ۧ")) * 23;
                        i2 = ((iM55979 ^ i13) * 6455) ^ 1722753744;
                        i3 = 1210361156;
                    }
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -122412978:
                case 1919617634:
                    strM55783 = RunnableC0897.m55783(f82190, 9, 3, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -77403478:
                case 1589520836:
                    objArr[i17] = numM56129;
                    sArr3 = f82190;
                    i16 = 48;
                    if (C0877.f81843 < 0) {
                        iM559710 = C0873.m55680("֡ܽ") ^ i13;
                        i2 = ((iM559710 ^ i12) * 6609) ^ 800620233;
                        i5 = -1671626383;
                        i15 = iM559710 ^ i5;
                        i14 = i2;
                    } else {
                        i16 = 48;
                        iM55979 = (i12 - C0946.m55979("ۜۗ")) * 81;
                        i2 = ((iM55979 ^ i13) * (-15509)) ^ 786220139;
                        i3 = -1653795224;
                        i16 = i16;
                        i15 = iM55979 ^ i3;
                        i14 = i2;
                    }
                    break;
                case -42218866:
                case -23737037:
                    int i28 = i16;
                    short[] sArr5 = sArr2;
                    c2 = 0;
                    if (strM55579 != null) {
                        int iM559714 = (C0946.m55979("ܿۡ") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        int i29 = ((iM559714 ^ i12) * (-18301)) ^ (-465262678);
                        i4 = iM559714 ^ 278603109;
                        sArr2 = sArr5;
                        i14 = i29;
                        i16 = i28;
                        i17 = 1;
                        i15 = i4;
                    } else {
                        int iM55683 = C0873.m55680("۫᩷") ^ i12;
                        sArr2 = sArr5;
                        i14 = ((iM55683 ^ i13) * (-28837)) ^ (-229541364);
                        i16 = i28;
                        i15 = iM55683 ^ (-195647832);
                        i17 = 1;
                    }
                    break;
                case 20709692:
                case 1683259427:
                    sArr = sArr2;
                    iM559712 = C0946.m55979(C0967.m56077(sArr, i20, i21, i19));
                    if (C1929.f83011 != 0) {
                        i18 = 2121107918;
                        int iM55684 = (C0873.m55680("ۚ᩷") ^ i13) * (-69);
                        i16 = i16;
                        int i210 = ((iM55684 ^ i12) * 13045) ^ (-1684436578);
                        i4 = iM55684 ^ (-728097955);
                        sArr2 = sArr;
                        i14 = i210;
                        i16 = i16;
                        i15 = i4;
                    } else {
                        int iM559715 = C0946.m55979("ۗܳ") ^ i12;
                        sArr2 = sArr;
                        i14 = ((iM559715 ^ i13) * 26151) ^ (-1782469183);
                        i15 = iM559715 ^ (-807867009);
                        i18 = 2121107918;
                    }
                    break;
                case 106569455:
                case 1928988734:
                    C0930.m55885();
                    if (C1964.f83032 <= 0) {
                        i6 = i16;
                        iM559711 = C0946.m55979("ۜܳ") ^ i12;
                        i14 = ((iM559711 ^ i13) * (-3085)) ^ (-33740910);
                        i9 = 869403071;
                        i10 = iM559711 ^ i9;
                        int i211 = i6;
                        i15 = i10;
                        i16 = i211;
                    } else {
                        iM559710 = C0946.m55979("ۨᩴ") ^ i12;
                        i2 = ((iM559710 ^ i13) * (-27763)) ^ (-1005748260);
                        i5 = 1418931445;
                        i15 = iM559710 ^ i5;
                        i14 = i2;
                    }
                    break;
                case 115854329:
                case 1962675656:
                    i16 = i16;
                    i23 = i22 + 15864289;
                    s = 7966;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0873.m55680("ܳۙ") ^ i12;
                        i2 = ((iM55979 ^ i13) * 29973) ^ (-2026848525);
                        i3 = -1453873600;
                    } else {
                        iM55979 = C0946.m55979("ۛܶ") ^ i12;
                        i2 = ((iM55979 ^ i13) * (-1335)) ^ (-429517351);
                        i3 = 848897776;
                    }
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case 383225546:
                case 1282973560:
                    C0947.m55997();
                    if (AbstractC0942.f81890 <= 0) {
                        i16 = i16;
                        iM55979 = C0873.m55680("ܳۙ") ^ i12;
                        i2 = ((iM55979 ^ i13) * 29973) ^ (-2026848525);
                        i3 = -1453873600;
                        i16 = i16;
                        i15 = iM55979 ^ i3;
                        i14 = i2;
                    } else {
                        i6 = i16;
                        sArr = sArr2;
                        iM55680 = C0873.m55680("ۜۛ") ^ i13;
                        i7 = ((iM55680 ^ i12) * (-22959)) ^ 1191676766;
                        i8 = 592326504;
                        i10 = iM55680 ^ i8;
                        sArr2 = sArr;
                        i14 = i7;
                        int i212 = i6;
                        i15 = i10;
                        i16 = i212;
                    }
                    break;
                case 465027294:
                case 729734181:
                    i16 = i16;
                    short[] sArr6 = sArr2;
                    if (i <= 35) {
                        sArr2 = sArr6;
                        iM55979 = (C0946.m55979("᩷ۗ") + i13) * (-39);
                        i2 = ((iM55979 ^ i12) * 26545) ^ (-1700682501);
                        i3 = -1334274318;
                        i16 = i16;
                        i15 = iM55979 ^ i3;
                        i14 = i2;
                    } else {
                        int iM559716 = (C0946.m55979("ۖܳ") ^ i13) * 5;
                        sArr2 = sArr6;
                        i14 = ((iM559716 ^ i12) * (-5739)) ^ (-1225556399);
                        i4 = iM559716 ^ (-1317304436);
                        i16 = i16;
                        i15 = i4;
                    }
                    break;
                case 861209318:
                case 1295719513:
                    iM559713 = C0946.m55979(C1044.m56276(sArr3, i16, 3, i19));
                    if (C1046.m56302() != 0) {
                        iM559710 = C0873.m55680("ۗ۫") ^ i13;
                        i2 = ((iM559710 ^ i12) * 16581) ^ 1262313084;
                        i5 = -813853846;
                    } else {
                        iM559710 = C0873.m55680("ᩴܶ") ^ i12;
                        i2 = ((iM559710 ^ i13) * (-14959)) ^ (-176709336);
                        i5 = -1398551950;
                    }
                    i15 = iM559710 ^ i5;
                    i14 = i2;
                    break;
                case 1075601167:
                case 1230254522:
                    i16 = i16;
                    sArr4 = f82190;
                    c = '\b';
                    if (C0882.m55710() != 0) {
                        iM55979 = C0873.m55680("ܳۙ") ^ i12;
                        i2 = ((iM55979 ^ i13) * 29973) ^ (-2026848525);
                        i3 = -1453873600;
                    } else {
                        iM55979 = (C0946.m55979("᩺ۗ") ^ i13) * C0254q.f1218h;
                        i2 = ((iM55979 ^ i12) * (-18639)) ^ 1335066459;
                        i3 = -1956703067;
                    }
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case 1243748063:
                case 1573298198:
                    sArr = sArr2;
                    i20 = 45;
                    i21 = 3;
                    if (!C0873.m55678()) {
                        i6 = i16;
                        iM55680 = (C0873.m55680("ᩳۖ") ^ i13) * (-87);
                        i7 = ((iM55680 ^ i12) * 5089) ^ (-516994026);
                        i8 = -2110841836;
                        i10 = iM55680 ^ i8;
                        sArr2 = sArr;
                        i14 = i7;
                        int i213 = i6;
                        i15 = i10;
                        i16 = i213;
                    } else {
                        int iM55685 = (C0873.m55680("ۚ᩷") ^ i13) * (-69);
                        i16 = i16;
                        int i214 = ((iM55685 ^ i12) * 13045) ^ (-1684436578);
                        i4 = iM55685 ^ (-728097955);
                        sArr2 = sArr;
                        i14 = i214;
                        i16 = i16;
                        i15 = i4;
                    }
                    break;
                case 1466013514:
                case 2135414542:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM559710 = C0873.m55680("ۗ۫") ^ i13;
                        i2 = ((iM559710 ^ i12) * 16581) ^ 1262313084;
                        i5 = -813853846;
                    } else {
                        iM559710 = C0873.m55680("۟ۜ") ^ i13;
                        i2 = ((iM559710 ^ i12) * 12367) ^ (-1249640514);
                        i5 = 526963826;
                    }
                    i15 = iM559710 ^ i5;
                    i14 = i2;
                    break;
                case 1618345909:
                case 1719923743:
                    C0967.m56074();
                    if (RunnableC0938.f81886 < 0) {
                        iM559710 = C0946.m55979("ۨᩴ") ^ i12;
                        i2 = ((iM559710 ^ i13) * (-27763)) ^ (-1005748260);
                        i5 = 1418931445;
                        i15 = iM559710 ^ i5;
                        i14 = i2;
                    } else {
                        i6 = i16;
                        sArr = sArr2;
                        iM55680 = C0873.m55680("ۜۛ") ^ i13;
                        i7 = ((iM55680 ^ i12) * (-22959)) ^ 1191676766;
                        i8 = 592326504;
                        i10 = iM55680 ^ i8;
                        sArr2 = sArr;
                        i14 = i7;
                        int i215 = i6;
                        i15 = i10;
                        i16 = i215;
                    }
                    break;
                default:
                    strM55783 = C1071.m56336(f82190, 28, 2, i19);
                    strM55579 = strM55783;
                    iM55979 = C0873.m55680("ᩴ۬") ^ i12;
                    i2 = ((iM55979 ^ i13) * 293) ^ 2007227623;
                    i3 = -443305097;
                    i16 = i16;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x02f2 A[PHI: r8 r9 r10 r17 r19 r20
      0x02f2: PHI (r8v6 char) = (r8v2 char), (r8v1 char), (r8v1 char) binds: [B:73:0x02f0, B:69:0x02d0, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r9v6 short) = (r9v1 short), (r9v2 short), (r9v1 short) binds: [B:73:0x02f0, B:69:0x02d0, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r10v6 int) = (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:73:0x02f0, B:69:0x02d0, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r17v25 java.util.ArrayList) = (r17v8 java.util.ArrayList), (r17v9 java.util.ArrayList), (r17v26 java.util.ArrayList) binds: [B:73:0x02f0, B:69:0x02d0, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r19v17 l.ܽܳ᩷) = (r19v3 l.ܽܳ᩷), (r19v4 l.ܽܳ᩷), (r19v18 l.ܽܳ᩷) binds: [B:73:0x02f0, B:69:0x02d0, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r20v19 java.util.ArrayList) = (r20v2 java.util.ArrayList), (r20v3 java.util.ArrayList), (r20v20 java.util.ArrayList) binds: [B:73:0x02f0, B:69:0x02d0, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ */
    public static void m34316(String str) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        int iM55681;
        int i6;
        int i7;
        ArrayList arrayList2 = null;
        C18249 c18249 = null;
        ArrayList arrayList3 = null;
        int iM56137 = 0;
        int i8 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = -566017045;
        int i13 = C0866.f81837;
        int i14 = AbstractC0942.f81890;
        int iM559710 = C0946.m55979("ܶܺ") ^ i14;
        int i15 = ((iM559710 ^ i13) * 5865) ^ 2123038307;
        int i16 = iM559710 ^ (-698635387);
        StringBuilder sb = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 28993) >> 31));
            switch (i12) {
                case -2131639614:
                case 119623749:
                    arrayList2 = arrayList2;
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    sArr = f82190;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("ܺ᩷") ^ i13;
                        i3 = ((iM55680 ^ i14) * 16725) ^ 1084704019;
                        i4 = 7315319;
                    } else {
                        iM55680 = (C0873.m55680("ܳᩳ") + i14) * (-29);
                        i3 = ((iM55680 ^ i13) * (-20795)) ^ (-2145371470);
                        i4 = 270256934;
                    }
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case -2083597136:
                case 266097633:
                    arrayList2 = arrayList2;
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    s = sArr[c];
                    i9 = s * s;
                    if (C0873.m55678()) {
                        iM55680 = (i14 - C0873.m55680("۠۬")) * (-119);
                        i3 = ((iM55680 ^ i13) * 17355) ^ (-190856861);
                        i4 = -1747412607;
                    } else {
                        iM55680 = C0946.m55979("ۢܿ") ^ i13;
                        i3 = ((iM55680 ^ i14) * (-17403)) ^ 851816903;
                        i4 = 1910887646;
                    }
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case -1508884836:
                case -1485288337:
                    C0873.m55678();
                    if (C1003.m56123() != 0) {
                        arrayList2 = arrayList2;
                        c18249 = c18249;
                        arrayList3 = arrayList3;
                        iM55680 = C0946.m55979("ܺ᩷") ^ i13;
                        i3 = ((iM55680 ^ i14) * 16725) ^ 1084704019;
                        i4 = 7315319;
                        i5 = iM55680 ^ i4;
                        arrayList3 = arrayList3;
                        c18249 = c18249;
                        i16 = i5;
                        i15 = i3;
                        arrayList2 = arrayList2;
                    }
                    arrayList2 = arrayList2;
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    iM55680 = (i14 - C0873.m55680("۠۬")) * (-119);
                    i3 = ((iM55680 ^ i13) * 17355) ^ (-190856861);
                    i4 = -1747412607;
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case -1456279763:
                case 1890676099:
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    C16907.m38470(C0845.m55591(sb));
                    m34314(str);
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = C0946.m55979("ܳ֫") ^ i14;
                        i = ((iM55979 ^ i13) * (-10451)) ^ 1467293147;
                        i2 = 711574491;
                        int i17 = iM55979 ^ i2;
                        arrayList3 = arrayList3;
                        i16 = i17;
                        i15 = i;
                        c18249 = c18249;
                    } else {
                        arrayList2 = arrayList2;
                        int iM559711 = (C0946.m55979("۠ܳ") + i14) * (-81);
                        i3 = ((iM559711 ^ i13) * (-14173)) ^ (-1829254776);
                        i5 = iM559711 ^ 884649253;
                        arrayList3 = arrayList3;
                        c18249 = c18249;
                        sb = null;
                        i16 = i5;
                        i15 = i3;
                        arrayList2 = arrayList2;
                    }
                    break;
                case -1452914178:
                case -152246952:
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    m34320();
                    short[] sArr2 = f82190;
                    if (C0890.f81849 == 0 && C0967.f81910 < 0) {
                        arrayList2 = arrayList2;
                        StringBuilder sb2 = new StringBuilder(C0989.m56092(sArr2, 390, 11, i11));
                        C0912.m55825(sb2, str);
                        if (C0861.f81831) {
                            int iM55682 = (C0873.m55680("۬ᩴ") + i13) * (-15);
                            sb = sb2;
                            i15 = ((iM55682 ^ i14) * 24817) ^ 1403590390;
                            arrayList3 = arrayList3;
                            c18249 = c18249;
                            i16 = iM55682 ^ (-1670464552);
                        }
                        arrayList2 = arrayList2;
                    } else {
                        arrayList2 = arrayList2;
                    }
                    int iM559712 = (C0946.m55979("۠ܳ") + i14) * (-81);
                    i3 = ((iM559712 ^ i13) * (-14173)) ^ (-1829254776);
                    i5 = iM559712 ^ 884649253;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    sb = null;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case -1408444423:
                case 1674056013:
                    arrayList2 = arrayList2;
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    if (i10 - (s * s2) >= 0) {
                        iM55680 = C0946.m55979("ܶܰ") ^ i13;
                        i3 = ((iM55680 ^ i14) * (-2559)) ^ (-576093856);
                        i4 = -693995502;
                    } else {
                        iM55680 = (C0873.m55680("֡ۤ") ^ i14) * 57;
                        i3 = ((iM55680 ^ i13) * 6847) ^ (-304108430);
                        i4 = 1222792563;
                    }
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case -1362731456:
                case -699233770:
                    arrayList2 = arrayList2;
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    i10 = i9 + 337971456;
                    s2 = 36768;
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("ۛ۬") ^ i14;
                        i3 = ((iM55680 ^ i13) * (-13199)) ^ 790994645;
                        i4 = -89750773;
                    } else {
                        iM55680 = C0946.m55979("ᩴܺ") ^ i14;
                        i3 = ((iM55680 ^ i13) * (-8351)) ^ (-1924405801);
                        i4 = 344315369;
                    }
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case -1215590350:
                case 1352091546:
                    i8 = iM56137 - 1;
                    if (i8 >= 0) {
                        iM55681 = C0873.m55680("᩹֫") ^ i13;
                        arrayList = arrayList3;
                        i6 = ((iM55681 ^ i14) * (-13659)) ^ 841177958;
                        i7 = -785644167;
                    } else {
                        arrayList = arrayList3;
                        iM55681 = C0873.m55680("۬ۚ") ^ i14;
                        i6 = ((iM55681 ^ i13) * (-14103)) ^ 151869740;
                        i7 = 2007971846;
                    }
                    ArrayList arrayList4 = arrayList;
                    i16 = iM55681 ^ i7;
                    i15 = i6;
                    arrayList3 = arrayList4;
                    break;
                case -1129873591:
                case 583550823:
                    ArrayList arrayList5 = f42785;
                    iM56137 = C1012.m56137(arrayList5);
                    arrayList3 = arrayList5;
                    int iM55683 = (C0873.m55680("֨᩵") + i14) * (-121);
                    c18249 = c18249;
                    i = ((iM55683 ^ i13) * 24881) ^ 1591549035;
                    i16 = iM55683 ^ 1502973610;
                    i15 = i;
                    c18249 = c18249;
                    break;
                case -1009252311:
                case 549784110:
                    C0894.m55769();
                    C0989.m56095();
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    iM55979 = (C0873.m55680("ۙ۠") ^ i13) * (-109);
                    i = ((iM55979 ^ i14) * 16867) ^ 102246546;
                    i2 = 282404509;
                    int i18 = iM55979 ^ i2;
                    arrayList3 = arrayList3;
                    i16 = i18;
                    i15 = i;
                    c18249 = c18249;
                    break;
                case -650292248:
                case -479919245:
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    RunnableC1014.m56173(m34322(str));
                    m34323();
                    if (!C0967.m56074()) {
                        iM55979 = C0946.m55979("ۨ۬") ^ i13;
                        i = ((iM55979 ^ i14) * (-2677)) ^ 1415380866;
                        i2 = -34878368;
                        int i19 = iM55979 ^ i2;
                        arrayList3 = arrayList3;
                        i16 = i19;
                        i15 = i;
                        c18249 = c18249;
                    } else {
                        arrayList2 = arrayList2;
                        iM55680 = C0946.m55979("ᩴܺ") ^ i14;
                        i3 = ((iM55680 ^ i13) * (-8351)) ^ (-1924405801);
                        i4 = 344315369;
                        i5 = iM55680 ^ i4;
                        arrayList3 = arrayList3;
                        c18249 = c18249;
                        i16 = i5;
                        i15 = i3;
                        arrayList2 = arrayList2;
                    }
                    break;
                case -548654327:
                case -481868261:
                    if (C0894.m55769() < 0) {
                        arrayList2 = arrayList2;
                        c18249 = c18249;
                        arrayList3 = arrayList3;
                        iM55680 = C0946.m55979("ᩴܺ") ^ i14;
                        i3 = ((iM55680 ^ i13) * (-8351)) ^ (-1924405801);
                        i4 = 344315369;
                        i5 = iM55680 ^ i4;
                        arrayList3 = arrayList3;
                        c18249 = c18249;
                        i16 = i5;
                        i15 = i3;
                        arrayList2 = arrayList2;
                    }
                    arrayList2 = arrayList2;
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    iM55680 = (i14 - C0873.m55680("۠۬")) * (-119);
                    i3 = ((iM55680 ^ i13) * 17355) ^ (-190856861);
                    i4 = -1747412607;
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case -309752788:
                case 740681166:
                    arrayList = arrayList3;
                    arrayList2.remove(str);
                    c18249 = (C18249) f42789.remove(str);
                    if (c18249 != null) {
                        iM55681 = C0873.m55680("۬᩷") ^ i13;
                        i6 = ((iM55681 ^ i14) * (-9431)) ^ (-1031637055);
                        i7 = -613381860;
                    } else {
                        iM55681 = (C0873.m55680("ۘᩳ") ^ i14) * 85;
                        i6 = ((iM55681 ^ i13) * (-7171)) ^ 1902123924;
                        i7 = 636960651;
                    }
                    ArrayList arrayList6 = arrayList;
                    i16 = iM55681 ^ i7;
                    i15 = i6;
                    arrayList3 = arrayList6;
                    break;
                case -221626730:
                case 72560148:
                    arrayList = arrayList3;
                    c18249.m41529(false);
                    c18249.m41532();
                    iM55681 = (C0873.m55680("ۘᩳ") ^ i14) * 85;
                    i6 = ((iM55681 ^ i13) * (-7171)) ^ 1902123924;
                    i7 = 636960651;
                    ArrayList arrayList7 = arrayList;
                    i16 = iM55681 ^ i7;
                    i15 = i6;
                    arrayList3 = arrayList7;
                    break;
                case -117185539:
                case 1110204716:
                    if (C1003.f81929 <= 0) {
                        arrayList2 = arrayList2;
                        c18249 = c18249;
                        arrayList3 = arrayList3;
                        iM55680 = (i14 - C0873.m55680("۠۬")) * (-119);
                        i3 = ((iM55680 ^ i13) * 17355) ^ (-190856861);
                        i4 = -1747412607;
                        i5 = iM55680 ^ i4;
                        arrayList3 = arrayList3;
                        c18249 = c18249;
                        i16 = i5;
                        i15 = i3;
                        arrayList2 = arrayList2;
                    } else {
                        c18249 = c18249;
                        arrayList3 = arrayList3;
                        iM55979 = (C0873.m55680("ۙ۠") ^ i13) * (-109);
                        i = ((iM55979 ^ i14) * 16867) ^ 102246546;
                        i2 = 282404509;
                        int i110 = iM55979 ^ i2;
                        arrayList3 = arrayList3;
                        i16 = i110;
                        i15 = i;
                        c18249 = c18249;
                    }
                    break;
                case -113724687:
                case 159500459:
                    i11 = 58333;
                    iM55680 = C0873.m55680("ۗۜ") ^ i14;
                    i3 = ((iM55680 ^ i13) * (-29581)) ^ (-326603015);
                    i4 = -1605980098;
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case 8767676:
                case 50679443:
                    i11 = 35660;
                    iM55680 = C0873.m55680("ۗۜ") ^ i14;
                    i3 = ((iM55680 ^ i13) * (-29581)) ^ (-326603015);
                    i4 = -1605980098;
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                case 235694376:
                case 1717155860:
                    ((InterfaceC25035) C1017.m56196(arrayList3, i8)).mo48805();
                    iM56137 = i8;
                    int iM55684 = (C0873.m55680("֨᩵") + i14) * (-121);
                    c18249 = c18249;
                    i = ((iM55684 ^ i13) * 24881) ^ 1591549035;
                    i16 = iM55684 ^ 1502973610;
                    i15 = i;
                    c18249 = c18249;
                    break;
                case 435815715:
                case 2093197440:
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    arrayList2 = f42790;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55979 = (C0873.m55680("ۙ۠") ^ i13) * (-109);
                        i = ((iM55979 ^ i14) * 16867) ^ 102246546;
                        i2 = 282404509;
                    } else {
                        iM55979 = C0946.m55979("᩵᩶") ^ i13;
                        i = ((iM55979 ^ i14) * (-21561)) ^ 656534597;
                        i2 = -217711252;
                    }
                    int i111 = iM55979 ^ i2;
                    arrayList3 = arrayList3;
                    i16 = i111;
                    i15 = i;
                    c18249 = c18249;
                    break;
                case 480862041:
                case 554003179:
                    break;
                case 1049279535:
                case 1372896815:
                    arrayList2 = arrayList2;
                    c18249 = c18249;
                    arrayList3 = arrayList3;
                    c = 389;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (i14 - C0873.m55680("۠۬")) * (-119);
                        i3 = ((iM55680 ^ i13) * 17355) ^ (-190856861);
                        i4 = -1747412607;
                    } else {
                        iM55680 = C0946.m55979("ۗ᩹") ^ i13;
                        i3 = ((iM55680 ^ i14) * 5211) ^ 268448487;
                        i4 = 1559063601;
                    }
                    i5 = iM55680 ^ i4;
                    arrayList3 = arrayList3;
                    c18249 = c18249;
                    i16 = i5;
                    i15 = i3;
                    arrayList2 = arrayList2;
                    break;
                default:
                    C0854.m55595();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34310(InterfaceC25035 interfaceC25035) {
        C1194.m56393(f42785, interfaceC25035);
    }
}
