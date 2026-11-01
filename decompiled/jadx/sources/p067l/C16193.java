package p067l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashSet;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes4.dex */
public final class C16193 implements InterfaceC19547 {

    /* JADX INFO: renamed from: ֫ */
    public int f47663;

    /* JADX INFO: renamed from: ۧ */
    public HashSet f47664;

    /* JADX INFO: renamed from: ܳ */
    public final String f47665;

    /* JADX INFO: renamed from: ܽ */
    public int[] f47666;

    /* JADX INFO: renamed from: ܿ */
    public final Random f47667;

    /* JADX INFO: renamed from: ᩳ */
    public int f47668;

    @Override // p067l.InterfaceC19547
    /* JADX INFO: renamed from: ֫ */
    public final synchronized String mo8333() {
        int i;
        StringBuilder sb;
        if (this.f47664.size() >= this.f47668) {
            m36887(this.f47663 + 1);
        }
        int iM55878 = C0927.m55878(this.f47665);
        int[] iArr = this.f47666;
        int i2 = 0;
        while (true) {
            if (i2 >= 1000) {
                i = -1;
                break;
            }
            i = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int iNextInt = this.f47667.nextInt(iM55878);
                iArr[i3] = iNextInt;
                i = (i * iM55878) + iNextInt;
            }
            if (!C1071.m56338(this.f47664, C1003.m56129(i))) {
                break;
            }
            i2++;
        }
        if (i == -1) {
            for (int i4 = 0; i4 < this.f47668; i4++) {
                if (!C1071.m56338(this.f47664, C0912.m55836(i4))) {
                    int i5 = i4;
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        iArr[length] = i5 % iM55878;
                        i5 /= iM55878;
                    }
                    i = i4;
                    break;
                }
            }
        }
        if (i == -1) {
            throw new RuntimeException();
        }
        C1044.m56271(this.f47664, C1003.m56129(i));
        sb = new StringBuilder();
        for (int i6 : iArr) {
            C0946.m55977(sb, C0882.m55712(this.f47665, i6));
        }
        return C0863.m55639(sb);
    }

    public C16193(String str) {
        Random random = null;
        HashSet hashSet = null;
        int i = 1922014415;
        int i2 = C1017.f81942;
        int i3 = C1071.f81975;
        int iM55680 = C0873.m55680("ۙۨ") ^ i3;
        int i4 = ((iM55680 ^ i2) * 31841) ^ 2079549891;
        int i5 = 2002624832;
        while (true) {
            i = ((((i ^ i2) * 5653) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1933398811:
                case 475051161:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        iM55680 = (C0873.m55680("ܿۙ") ^ i3) * (-41);
                        i4 = ((iM55680 ^ i2) * 15649) ^ 509262836;
                        i5 = 640482029;
                    }
                    break;
                case -1545132731:
                case 2129502027:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("᩺ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29543)) ^ 641445251;
                        i5 = -216439142;
                    } else {
                        iM55680 = C0873.m55680("ۖᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 10981) ^ (-766684808);
                        i5 = 843392462;
                    }
                    break;
                case -1400993581:
                case -366003237:
                    C0927.m55873();
                    iM55680 = C0873.m55680("᩺ܿ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-29543)) ^ 641445251;
                    i5 = -216439142;
                    break;
                case -1379548465:
                case 440324671:
                    C1964.m56597();
                    if (!C0866.m55645()) {
                        iM55680 = (C0873.m55680("ܿۙ") ^ i3) * (-41);
                        i4 = ((iM55680 ^ i2) * 15649) ^ 509262836;
                        i5 = 640482029;
                    } else {
                        iM55680 = C0873.m55680("᩺ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29543)) ^ 641445251;
                        i5 = -216439142;
                    }
                    break;
                case -1100718359:
                case 1374069935:
                    random = new Random();
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        iM55680 = (C0873.m55680("ܺۙ") ^ i2) * (-63);
                        i4 = ((iM55680 ^ i3) * 22099) ^ 11191633;
                        i5 = 1913519030;
                    }
                    break;
                case -1055391916:
                case 1579986041:
                    hashSet = new HashSet();
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0946.m55979("ۡ᩺") + i2) * 9;
                        i4 = ((iM55680 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        iM55680 = C0946.m55979("ܳۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14301)) ^ 2129416409;
                        i5 = 319863328;
                    }
                    break;
                case -996787167:
                case 581129941:
                    ViewOnClickListenerC0939.m55941();
                    throw new RuntimeException();
                case -965611862:
                case 393500242:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("ܰ᩻") ^ i3) * 77;
                        i4 = ((iM55680 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    }
                    break;
                case -508060838:
                case 246876025:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("ܰ᩻") ^ i3) * 77;
                        i4 = ((iM55680 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        iM55680 = C0873.m55680("᩵ۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-10663)) ^ (-29447826);
                        i5 = 1017050760;
                    }
                    break;
                case -469973030:
                case 1665836806:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        iM55680 = C0873.m55680("᩹ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-19117)) ^ 1767483835;
                        i5 = -955285992;
                    }
                    break;
                case 42843025:
                case 900432629:
                    this.f47664 = hashSet;
                    this.f47665 = str;
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("ܰ᩻") ^ i3) * 77;
                        i4 = ((iM55680 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        iM55680 = (C0946.m55979("ܳ᩻") ^ i2) * 123;
                        i4 = ((iM55680 ^ i3) * 15351) ^ 1397627583;
                        i5 = -1081655295;
                    }
                    break;
                case 131728637:
                case 288538339:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0946.m55979("ۡ᩺") + i2) * 9;
                        i4 = ((iM55680 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        iM55680 = C0873.m55680("᩹֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20827) ^ (-1253005626);
                        i5 = 1481997273;
                    }
                    break;
                case 301287122:
                case 2078172055:
                    m36887(1);
                    return;
                case 438702919:
                case 1799546644:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("ܰ᩻") ^ i3) * 77;
                        i4 = ((iM55680 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        iM55680 = C0946.m55979("᩺֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7471)) ^ 541690210;
                        i5 = -2126221046;
                    }
                    break;
                case 536061032:
                case 1358841646:
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0946.m55979("ۡ᩺") + i2) * 9;
                        i4 = ((iM55680 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        iM55680 = (C0873.m55680("ܿۧ") ^ i2) * 87;
                        i4 = ((iM55680 ^ i3) * 10189) ^ (-1957149690);
                        i5 = 1562710885;
                    }
                    break;
                default:
                    this.f47667 = random;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0946.m55979("ۡ᩺") + i2) * 9;
                        i4 = ((iM55680 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        iM55680 = C0873.m55680("֨ᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 17737) ^ (-1614219301);
                        i5 = 2023209845;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0183 A[PHI: r4 r16 r18
      0x0183: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:44:0x0136, B:15:0x0066, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r16v13 double) = (r16v6 double), (r16v10 double), (r16v14 double) binds: [B:44:0x0136, B:15:0x0066, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r18v14 double) = (r18v4 double), (r18v11 double), (r18v15 double) binds: [B:44:0x0136, B:15:0x0066, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    private void m36887(int i) {
        double d;
        double d2;
        int iM55680;
        int i2;
        int i3;
        int i4;
        int iM55979;
        double d3;
        int iM559710;
        int i5;
        int i6;
        int i7 = C1044.f81959;
        int i8 = C1071.f81975;
        int iM55681 = (C0873.m55680("ۖۘ") ^ i7) * 51;
        int i9 = ((iM55681 ^ i8) * 21301) ^ (-1098156034);
        String str = null;
        double dPow = 0.0d;
        int i10 = iM55681 ^ 328347343;
        int[] iArr = null;
        int i11 = 0;
        int i12 = -1615827674;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int iM55719 = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i8) * 9861) >> 31));
            switch (i12) {
                case -2131253120:
                case -121230067:
                    i11 = (int) dPow;
                    if (C0927.f81875) {
                        d3 = dPow;
                        iM559710 = (i7 - C0873.m55680("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM559710 ^ i8) * (-22169)) ^ 1651348861;
                        i6 = -1376649026;
                    } else {
                        iM559710 = C0873.m55680("ܶ۬") ^ i8;
                        d3 = dPow;
                        i5 = ((iM559710 ^ i7) * 13437) ^ (-759376087);
                        i6 = -1405517356;
                    }
                    double d6 = d3;
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    dPow = d6;
                    break;
                case -2051030471:
                case 1339938804:
                    d = d5;
                    d2 = dPow;
                    this.f47666 = iArr;
                    str = this.f47665;
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("᩸ۨ") ^ i7;
                        i2 = ((iM55680 ^ i8) * (-29005)) ^ 1680659731;
                        i3 = 1801498546;
                    } else {
                        iM55680 = (C0873.m55680("᩹ۗ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM55680 ^ i8) * 31355) ^ (-72223971);
                        i3 = 274783680;
                    }
                    dPow = d2;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1997301246:
                case -664173288:
                    d = d5;
                    d2 = dPow;
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("᩷ᩳ") ^ i8) * 25;
                        i2 = ((iM55680 ^ i7) * 12395) ^ (-919030910);
                        i3 = 1174989968;
                    } else {
                        iM55680 = C0946.m55979("᩷ᩴ") ^ i8;
                        i2 = ((iM55680 ^ i7) * (-10401)) ^ (-36386867);
                        i3 = -1770556120;
                    }
                    dPow = d2;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1971144350:
                case -1277100803:
                    this.f47668 = i11;
                    this.f47664.clear();
                    break;
                case -1968776784:
                case 315730663:
                    d = d5;
                    d2 = dPow;
                    iArr = new int[i];
                    if (C1048.f81963) {
                        iM55680 = C0946.m55979("۫᩶") ^ i8;
                        i2 = ((iM55680 ^ i7) * 20301) ^ 122498266;
                        i3 = -1559958510;
                    } else {
                        iM55680 = (C0946.m55979("᩸ۡ") + i8) * (-111);
                        i2 = ((iM55680 ^ i7) * 601) ^ 104328587;
                        i3 = 1900483004;
                    }
                    dPow = d2;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1911620052:
                case 280323938:
                    C1048.m56305();
                    if (C0894.f81854 >= 0) {
                        d = d5;
                        d2 = dPow;
                        iM55680 = C0873.m55680("᩸ۨ") ^ i7;
                        i2 = ((iM55680 ^ i8) * (-29005)) ^ 1680659731;
                        i3 = 1801498546;
                        dPow = d2;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    d = d5;
                    d2 = dPow;
                    iM55680 = (C0946.m55979("᩸ۡ") + i8) * (-111);
                    i2 = ((iM55680 ^ i7) * 601) ^ 104328587;
                    i3 = 1900483004;
                    dPow = d2;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1889063163:
                case -546512389:
                    C1124.m56367();
                    C1025.m56230();
                    d = d5;
                    d2 = dPow;
                    iM55680 = (C0946.m55979("᩸ۡ") + i8) * (-111);
                    i2 = ((iM55680 ^ i7) * 601) ^ 104328587;
                    i3 = 1900483004;
                    dPow = d2;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1853956018:
                case -951752169:
                    dPow = Math.pow(d5, d4);
                    if (C1012.f81938 >= 0) {
                        d = d5;
                        iM55979 = C0946.m55979("ܽۨ") ^ i8;
                        i2 = ((iM55979 ^ i7) * (-28945)) ^ 909055345;
                        i4 = -179616471;
                    } else {
                        iM55979 = (i7 - C0873.m55680("ۜۚ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        d = d5;
                        i2 = ((iM55979 ^ i8) * (-6355)) ^ 528887607;
                        i4 = -775061598;
                    }
                    i10 = iM55979 ^ i4;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1802516818:
                case -739214174:
                    if (C0946.f81894 == 0) {
                        d = d5;
                        d2 = dPow;
                        iM55680 = (C0873.m55680("᩷ᩳ") ^ i8) * 25;
                        i2 = ((iM55680 ^ i7) * 12395) ^ (-919030910);
                        i3 = 1174989968;
                        dPow = d2;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    d = d5;
                    d2 = dPow;
                    iM55680 = (C0946.m55979("᩸ۡ") + i8) * (-111);
                    i2 = ((iM55680 ^ i7) * 601) ^ 104328587;
                    i3 = 1900483004;
                    dPow = d2;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -891057927:
                case -20093562:
                    d = d5;
                    d2 = dPow;
                    iM55719 = C0882.m55719(str);
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ᩴۙ") ^ i7;
                        i2 = ((iM55680 ^ i8) * 14169) ^ 944502360;
                        i3 = 2068256509;
                        dPow = d2;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    dPow = d2;
                    iM55979 = C0946.m55979("ܽۨ") ^ i8;
                    i2 = ((iM55979 ^ i7) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i10 = iM55979 ^ i4;
                    i9 = i2;
                    d5 = d;
                    break;
                case -598602663:
                case 970676449:
                    d = d5;
                    d2 = dPow;
                    if (C0882.m55710() == 0) {
                        iM55680 = C0873.m55680("ۧۡ") ^ i8;
                        i2 = ((iM55680 ^ i7) * (-1255)) ^ 1756540625;
                        i3 = -660293761;
                        dPow = d2;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    dPow = d2;
                    iM55979 = C0946.m55979("ܽۨ") ^ i8;
                    i2 = ((iM55979 ^ i7) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i10 = iM55979 ^ i4;
                    i9 = i2;
                    d5 = d;
                    break;
                case -482835174:
                case 1100596401:
                    if (!C0863.m55643()) {
                        d3 = dPow;
                        iM559710 = (i7 - C0873.m55680("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM559710 ^ i8) * (-22169)) ^ 1651348861;
                        i6 = -1376649026;
                        double d7 = d3;
                        i10 = iM559710 ^ i6;
                        i9 = i5;
                        dPow = d7;
                    } else {
                        d = d5;
                        d2 = dPow;
                        iM55680 = (C0946.m55979("᩸ۡ") + i8) * (-111);
                        i2 = ((iM55680 ^ i7) * 601) ^ 104328587;
                        i3 = 1900483004;
                        dPow = d2;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    break;
                case -216056384:
                case 206378093:
                    d3 = dPow;
                    d5 = iM55719;
                    d4 = i;
                    if (C1017.f81942 >= 0) {
                        iM559710 = (i7 - C0873.m55680("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM559710 ^ i8) * (-22169)) ^ 1651348861;
                        i6 = -1376649026;
                    } else {
                        iM559710 = C0946.m55979("۟֨") ^ i8;
                        i5 = ((iM559710 ^ i7) * (-14069)) ^ 147615170;
                        i6 = -1211767769;
                    }
                    double d8 = d3;
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    dPow = d8;
                    break;
                case -31476379:
                case 634533958:
                    d = d5;
                    d2 = dPow;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = C0873.m55680("ܺۘ") ^ i7;
                        i2 = ((iM55680 ^ i8) * 24851) ^ (-1158872920);
                        i3 = 11037956;
                        dPow = d2;
                        i10 = iM55680 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    dPow = d2;
                    iM55979 = C0946.m55979("ܽۨ") ^ i8;
                    i2 = ((iM55979 ^ i7) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i10 = iM55979 ^ i4;
                    i9 = i2;
                    d5 = d;
                    break;
                case 1113897349:
                case 1514091831:
                    C1404.m56468();
                    C1964.m56597();
                    break;
                default:
                    d = d5;
                    d2 = dPow;
                    this.f47663 = i;
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("᩸ۨ") ^ i7;
                        i2 = ((iM55680 ^ i8) * (-29005)) ^ 1680659731;
                        i3 = 1801498546;
                    } else {
                        iM55680 = C0946.m55979("᩵֨") ^ i7;
                        i2 = ((iM55680 ^ i8) * (-20651)) ^ 1760412976;
                        i3 = 50262459;
                    }
                    dPow = d2;
                    i10 = iM55680 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
            }
            return;
        }
    }
}
