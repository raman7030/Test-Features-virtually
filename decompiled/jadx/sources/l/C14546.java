package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashSet;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes4.dex */
public final class C14546 implements InterfaceC18075 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44557;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashSet f44558;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f44559;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f44560;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Random f44561;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f44562;

    @Override // l.InterfaceC18075
    /* JADX INFO: renamed from: ֫ */
    public final synchronized String mo6135() {
        int i;
        StringBuilder sb;
        if (this.f44558.size() >= this.f44562) {
            m34738(this.f44557 + 1);
        }
        int iM5741 = C1711.m5741(this.f44559);
        int[] iArr = this.f44560;
        int i2 = 0;
        while (true) {
            if (i2 >= 1000) {
                i = -1;
                break;
            }
            i = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int iNextInt = this.f44561.nextInt(iM5741);
                iArr[i3] = iNextInt;
                i = (i * iM5741) + iNextInt;
            }
            if (!C4616.m13546(this.f44558, C3245.m9931(i))) {
                break;
            }
            i2++;
        }
        if (i == -1) {
            for (int i4 = 0; i4 < this.f44562; i4++) {
                if (!C4616.m13546(this.f44558, C1420.m4916(i4))) {
                    int i5 = i4;
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        iArr[length] = i5 % iM5741;
                        i5 /= iM5741;
                    }
                    i = i4;
                    break;
                }
            }
        }
        if (i == -1) {
            throw new RuntimeException();
        }
        C4075.m12245(this.f44558, C3245.m9931(i));
        sb = new StringBuilder();
        for (int i6 : iArr) {
            C2105.m6979(sb, C0798.m3000(this.f44559, i6));
        }
        return C0422.m1959(sb);
    }

    public C14546(String str) {
        Random random = null;
        HashSet hashSet = null;
        int i = 1922014415;
        int i2 = C3537.f11231;
        int i3 = C4616.f14690;
        int iM2566 = C0630.m2566("ۙۨ") ^ i3;
        int i4 = ((iM2566 ^ i2) * 31841) ^ 2079549891;
        int i5 = 2002624832;
        while (true) {
            i = ((((i ^ i2) * 5653) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1933398811:
                case 475051161:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        iM2566 = (C0630.m2566("ܿۙ") ^ i3) * (-41);
                        i4 = ((iM2566 ^ i2) * 15649) ^ 509262836;
                        i5 = 640482029;
                    }
                    break;
                case -1545132731:
                case 2129502027:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("᩺ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29543)) ^ 641445251;
                        i5 = -216439142;
                    } else {
                        iM2566 = C0630.m2566("ۖᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10981) ^ (-766684808);
                        i5 = 843392462;
                    }
                    break;
                case -1400993581:
                case -366003237:
                    C1711.m5736();
                    iM2566 = C0630.m2566("᩺ܿ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-29543)) ^ 641445251;
                    i5 = -216439142;
                    break;
                case -1379548465:
                case 440324671:
                    C22628.m50615();
                    if (!C0483.m2121()) {
                        iM2566 = (C0630.m2566("ܿۙ") ^ i3) * (-41);
                        i4 = ((iM2566 ^ i2) * 15649) ^ 509262836;
                        i5 = 640482029;
                    } else {
                        iM2566 = C0630.m2566("᩺ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29543)) ^ 641445251;
                        i5 = -216439142;
                    }
                    break;
                case -1100718359:
                case 1374069935:
                    random = new Random();
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        iM2566 = (C0630.m2566("ܺۙ") ^ i2) * (-63);
                        i4 = ((iM2566 ^ i3) * 22099) ^ 11191633;
                        i5 = 1913519030;
                    }
                    break;
                case -1055391916:
                case 1579986041:
                    hashSet = new HashSet();
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("ۡ᩺") + i2) * 9;
                        i4 = ((iM2566 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        iM2566 = C2105.m6981("ܳۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14301)) ^ 2129416409;
                        i5 = 319863328;
                    }
                    break;
                case -996787167:
                case 581129941:
                    ViewOnClickListenerC1958.m6429();
                    throw new RuntimeException();
                case -965611862:
                case 393500242:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("ܰ᩻") ^ i3) * 77;
                        i4 = ((iM2566 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        iM2566 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    }
                    break;
                case -508060838:
                case 246876025:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C0630.m2566("ܰ᩻") ^ i3) * 77;
                        i4 = ((iM2566 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        iM2566 = C0630.m2566("᩵ۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-10663)) ^ (-29447826);
                        i5 = 1017050760;
                    }
                    break;
                case -469973030:
                case 1665836806:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        iM2566 = C0630.m2566("᩹ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19117)) ^ 1767483835;
                        i5 = -955285992;
                    }
                    break;
                case 42843025:
                case 900432629:
                    this.f44558 = hashSet;
                    this.f44559 = str;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("ܰ᩻") ^ i3) * 77;
                        i4 = ((iM2566 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        iM2566 = (C2105.m6981("ܳ᩻") ^ i2) * 123;
                        i4 = ((iM2566 ^ i3) * 15351) ^ 1397627583;
                        i5 = -1081655295;
                    }
                    break;
                case 131728637:
                case 288538339:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("ۡ᩺") + i2) * 9;
                        i4 = ((iM2566 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        iM2566 = C0630.m2566("᩹֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20827) ^ (-1253005626);
                        i5 = 1481997273;
                    }
                    break;
                case 301287122:
                case 2078172055:
                    m34738(1);
                    return;
                case 438702919:
                case 1799546644:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("ܰ᩻") ^ i3) * 77;
                        i4 = ((iM2566 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        iM2566 = C2105.m6981("᩺֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-7471)) ^ 541690210;
                        i5 = -2126221046;
                    }
                    break;
                case 536061032:
                case 1358841646:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C2105.m6981("ۡ᩺") + i2) * 9;
                        i4 = ((iM2566 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        iM2566 = (C0630.m2566("ܿۧ") ^ i2) * 87;
                        i4 = ((iM2566 ^ i3) * 10189) ^ (-1957149690);
                        i5 = 1562710885;
                    }
                    break;
                default:
                    this.f44561 = random;
                    if (C2105.f7037 != 0) {
                        iM2566 = (C2105.m6981("ۡ᩺") + i2) * 9;
                        i4 = ((iM2566 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        iM2566 = C0630.m2566("֨ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 17737) ^ (-1614219301);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34738(int i) {
        double d;
        double d2;
        int iM2566;
        int i2;
        int i3;
        int i4;
        int iM6981;
        double d3;
        int iM6982;
        int i5;
        int i6;
        int i7 = C4075.f12947;
        int i8 = C4616.f14690;
        int iM2567 = (C0630.m2566("ۖۘ") ^ i7) * 51;
        int i9 = ((iM2567 ^ i8) * 21301) ^ (-1098156034);
        String str = null;
        double dPow = 0.0d;
        int i10 = iM2567 ^ 328347343;
        int[] iArr = null;
        int i11 = 0;
        int i12 = -1615827674;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int iM3007 = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i8) * 9861) >> 31));
            switch (i12) {
                case -2131253120:
                case -121230067:
                    i11 = (int) dPow;
                    if (C1711.f5919) {
                        d3 = dPow;
                        iM6982 = (i7 - C0630.m2566("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM6982 ^ i8) * (-22169)) ^ 1651348861;
                        i6 = -1376649026;
                    } else {
                        iM6982 = C0630.m2566("ܶ۬") ^ i8;
                        d3 = dPow;
                        i5 = ((iM6982 ^ i7) * 13437) ^ (-759376087);
                        i6 = -1405517356;
                    }
                    double d6 = d3;
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    dPow = d6;
                    break;
                case -2051030471:
                case 1339938804:
                    d = d5;
                    d2 = dPow;
                    this.f44560 = iArr;
                    str = this.f44559;
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("᩸ۨ") ^ i7;
                        i2 = ((iM2566 ^ i8) * (-29005)) ^ 1680659731;
                        i3 = 1801498546;
                    } else {
                        iM2566 = (C0630.m2566("᩹ۗ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM2566 ^ i8) * 31355) ^ (-72223971);
                        i3 = 274783680;
                    }
                    dPow = d2;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1997301246:
                case -664173288:
                    d = d5;
                    d2 = dPow;
                    if (C0798.f2919) {
                        iM2566 = (C0630.m2566("᩷ᩳ") ^ i8) * 25;
                        i2 = ((iM2566 ^ i7) * 12395) ^ (-919030910);
                        i3 = 1174989968;
                    } else {
                        iM2566 = C2105.m6981("᩷ᩴ") ^ i8;
                        i2 = ((iM2566 ^ i7) * (-10401)) ^ (-36386867);
                        i3 = -1770556120;
                    }
                    dPow = d2;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1971144350:
                case -1277100803:
                    this.f44562 = i11;
                    this.f44558.clear();
                    break;
                case -1968776784:
                case 315730663:
                    d = d5;
                    d2 = dPow;
                    iArr = new int[i];
                    if (C4159.f13567) {
                        iM2566 = C2105.m6981("۫᩶") ^ i8;
                        i2 = ((iM2566 ^ i7) * 20301) ^ 122498266;
                        i3 = -1559958510;
                    } else {
                        iM2566 = (C2105.m6981("᩸ۡ") + i8) * (-111);
                        i2 = ((iM2566 ^ i7) * 601) ^ 104328587;
                        i3 = 1900483004;
                    }
                    dPow = d2;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1911620052:
                case 280323938:
                    C4159.m12565();
                    if (C1047.f3863 >= 0) {
                        d = d5;
                        d2 = dPow;
                        iM2566 = C0630.m2566("᩸ۨ") ^ i7;
                        i2 = ((iM2566 ^ i8) * (-29005)) ^ 1680659731;
                        i3 = 1801498546;
                        dPow = d2;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    d = d5;
                    d2 = dPow;
                    iM2566 = (C2105.m6981("᩸ۡ") + i8) * (-111);
                    i2 = ((iM2566 ^ i7) * 601) ^ 104328587;
                    i3 = 1900483004;
                    dPow = d2;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1889063163:
                case -546512389:
                    C5695.m16023();
                    C3683.m11222();
                    d = d5;
                    d2 = dPow;
                    iM2566 = (C2105.m6981("᩸ۡ") + i8) * (-111);
                    i2 = ((iM2566 ^ i7) * 601) ^ 104328587;
                    i3 = 1900483004;
                    dPow = d2;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1853956018:
                case -951752169:
                    dPow = Math.pow(d5, d4);
                    if (C3432.f10845 >= 0) {
                        d = d5;
                        iM6981 = C2105.m6981("ܽۨ") ^ i8;
                        i2 = ((iM6981 ^ i7) * (-28945)) ^ 909055345;
                        i4 = -179616471;
                    } else {
                        iM6981 = (i7 - C0630.m2566("ۜۚ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        d = d5;
                        i2 = ((iM6981 ^ i8) * (-6355)) ^ 528887607;
                        i4 = -775061598;
                    }
                    i10 = iM6981 ^ i4;
                    i9 = i2;
                    d5 = d;
                    break;
                case -1802516818:
                case -739214174:
                    if (C2105.f7037 == 0) {
                        d = d5;
                        d2 = dPow;
                        iM2566 = (C0630.m2566("᩷ᩳ") ^ i8) * 25;
                        i2 = ((iM2566 ^ i7) * 12395) ^ (-919030910);
                        i3 = 1174989968;
                        dPow = d2;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    d = d5;
                    d2 = dPow;
                    iM2566 = (C2105.m6981("᩸ۡ") + i8) * (-111);
                    i2 = ((iM2566 ^ i7) * 601) ^ 104328587;
                    i3 = 1900483004;
                    dPow = d2;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
                case -891057927:
                case -20093562:
                    d = d5;
                    d2 = dPow;
                    iM3007 = C0798.m3007(str);
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ᩴۙ") ^ i7;
                        i2 = ((iM2566 ^ i8) * 14169) ^ 944502360;
                        i3 = 2068256509;
                        dPow = d2;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    dPow = d2;
                    iM6981 = C2105.m6981("ܽۨ") ^ i8;
                    i2 = ((iM6981 ^ i7) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i10 = iM6981 ^ i4;
                    i9 = i2;
                    d5 = d;
                    break;
                case -598602663:
                case 970676449:
                    d = d5;
                    d2 = dPow;
                    if (C0798.m2998() == 0) {
                        iM2566 = C0630.m2566("ۧۡ") ^ i8;
                        i2 = ((iM2566 ^ i7) * (-1255)) ^ 1756540625;
                        i3 = -660293761;
                        dPow = d2;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    dPow = d2;
                    iM6981 = C2105.m6981("ܽۨ") ^ i8;
                    i2 = ((iM6981 ^ i7) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i10 = iM6981 ^ i4;
                    i9 = i2;
                    d5 = d;
                    break;
                case -482835174:
                case 1100596401:
                    if (!C0422.m1963()) {
                        d3 = dPow;
                        iM6982 = (i7 - C0630.m2566("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM6982 ^ i8) * (-22169)) ^ 1651348861;
                        i6 = -1376649026;
                        double d7 = d3;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        dPow = d7;
                    } else {
                        d = d5;
                        d2 = dPow;
                        iM2566 = (C2105.m6981("᩸ۡ") + i8) * (-111);
                        i2 = ((iM2566 ^ i7) * 601) ^ 104328587;
                        i3 = 1900483004;
                        dPow = d2;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    break;
                case -216056384:
                case 206378093:
                    d3 = dPow;
                    d5 = iM3007;
                    d4 = i;
                    if (C3537.f11231 >= 0) {
                        iM6982 = (i7 - C0630.m2566("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM6982 ^ i8) * (-22169)) ^ 1651348861;
                        i6 = -1376649026;
                    } else {
                        iM6982 = C2105.m6981("۟֨") ^ i8;
                        i5 = ((iM6982 ^ i7) * (-14069)) ^ 147615170;
                        i6 = -1211767769;
                    }
                    double d8 = d3;
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    dPow = d8;
                    break;
                case -31476379:
                case 634533958:
                    d = d5;
                    d2 = dPow;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = C0630.m2566("ܺۘ") ^ i7;
                        i2 = ((iM2566 ^ i8) * 24851) ^ (-1158872920);
                        i3 = 11037956;
                        dPow = d2;
                        i10 = iM2566 ^ i3;
                        i9 = i2;
                        d5 = d;
                    }
                    dPow = d2;
                    iM6981 = C2105.m6981("ܽۨ") ^ i8;
                    i2 = ((iM6981 ^ i7) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i10 = iM6981 ^ i4;
                    i9 = i2;
                    d5 = d;
                    break;
                case 1113897349:
                case 1514091831:
                    C11340.m28031();
                    C22628.m50615();
                    break;
                default:
                    d = d5;
                    d2 = dPow;
                    this.f44557 = i;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("᩸ۨ") ^ i7;
                        i2 = ((iM2566 ^ i8) * (-29005)) ^ 1680659731;
                        i3 = 1801498546;
                    } else {
                        iM2566 = C2105.m6981("᩵֨") ^ i7;
                        i2 = ((iM2566 ^ i8) * (-20651)) ^ 1760412976;
                        i3 = 50262459;
                    }
                    dPow = d2;
                    i10 = iM2566 ^ i3;
                    i9 = i2;
                    d5 = d;
                    break;
            }
            return;
        }
    }
}
