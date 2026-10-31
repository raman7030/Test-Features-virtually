package l;

import android.content.Intent;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J2RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1086 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۗۙۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f3979 = {8189, -5965, -5969, -5962, -5980, -5974, -5971, -6006, -5977, -5970, -5972, -5977, -5978, -30948, 29282, -29227, 25589, 24770, -31473, 5602, -16940, -17013, -17001, -17010, -16996, -17006, -17003, -16940, -16993, -16994, -17011, -16940, -17000, -17005, -16994, -17000, -17008, -16940, -17013, -17010, -16999, -17001, -17006, -17016, -17005, -16951, -17013, -17001, -17010, -16996, -17006, -17003, -16974, -16993, -17013, -16998, -17000, -17008, -16998, -16996, -16994, -16984, -17006, -17023, -16994};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8142 f3980;

    /* JADX WARN: Code duplicated, block: B:89:0x0304 A[PHI: r16 r17
      0x0304: PHI (r16v29 l.ܳ᩻᩷) = (r16v7 l.ܳ᩻᩷), (r16v8 l.ܳ᩻᩷), (r16v30 l.ܳ᩻᩷) binds: [B:88:0x0302, B:84:0x02e0, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0304: PHI (r17v30 int) = (r17v6 int), (r17v7 int), (r17v31 int) binds: [B:88:0x0302, B:84:0x02e0, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0394 A[PHI: r3 r16 r17
      0x0394: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:80:0x02c0, B:39:0x00c5, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r16v31 l.ܳ᩻᩷) = (r16v9 l.ܳ᩻᩷), (r16v18 l.ܳ᩻᩷), (r16v34 l.ܳ᩻᩷) binds: [B:80:0x02c0, B:39:0x00c5, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r17v32 int) = (r17v8 int), (r17v19 int), (r17v36 int) binds: [B:80:0x02c0, B:39:0x00c5, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (l.C4263.m12819() >= 0) goto L19;
     */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1009() throws C1637 {
        int iM2566;
        int i;
        C16709 c16709 = null;
        C14864 c14864M41428 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i2 = 0;
        short s3 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -524899440;
        int i6 = RunnableC0588.f2309;
        int i7 = C2958.f9394;
        int iM6981 = C2105.m6981("ۖۨ") ^ i6;
        int i8 = ((iM6981 ^ i7) * 15443) ^ (-776134906);
        int i9 = -1358770371;
        while (true) {
            int i10 = iM6981 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i7) * 9993) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2096584801:
                    case -1732852085:
                        C0714.m2805();
                        if (C11340.f33930 >= 0) {
                            c14864M41428 = c14864M41428;
                            i5 = i5;
                            iM2566 = C0630.m2566("ۨۜ") ^ i6;
                            i8 = (-1403149304) ^ ((iM2566 ^ i7) * 10255);
                            i = -163184796;
                            i10 = i ^ iM2566;
                            c14864M41428 = c14864M41428;
                            i5 = i5;
                        } else {
                            iM6981 = (C2105.m6981("᩸۠") + i7) * 31;
                            i8 = ((iM6981 ^ i6) * 6419) ^ (-460287436);
                            i9 = -307609890;
                        }
                        break;
                    case -2052348708:
                    case -690226464:
                        C3683.m11222();
                        if (!C2272.f7362) {
                            iM6981 = C2105.m6981("᩵ܺ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 17239) ^ 1847328810;
                            i9 = 1079087103;
                        }
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        iM2566 = (C0630.m2566("ۗۧ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = (-2054314786) ^ ((iM2566 ^ i7) * (-29209));
                        i = 1532228282;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                        break;
                    case -2048121448:
                    case 922348096:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        sArr = f3979;
                        if (C2167.f7158 >= 0) {
                            iM2566 = (C2105.m6981("ۢܶ") + i6) * (-51);
                            i8 = 1574941086 ^ ((iM2566 ^ i7) * (-15303));
                            i = 1741787504;
                        } else {
                            iM2566 = C0630.m2566("ܺܳ") ^ i7;
                            i8 = 37360688 ^ ((iM2566 ^ i6) * 32665);
                            i = -1558931565;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -2028805189:
                    case 1801076011:
                        if (C4117.f13076 > 0) {
                            iM6981 = C2105.m6981("᩵ܺ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 17239) ^ 1847328810;
                            i9 = 1079087103;
                        }
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        iM2566 = (i6 - C0630.m2566("ܿۨ")) * 85;
                        i8 = 974426473 ^ ((iM2566 ^ i7) * 28307);
                        i = -1956275002;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -2017525567:
                    case 1110873919:
                        if (C4075.f12947 < 0) {
                            c14864M41428 = c14864M41428;
                            i5 = i5;
                            iM2566 = C0630.m2566("ۘۡ") ^ i7;
                            i8 = (-179724711) ^ ((iM2566 ^ i6) * (-13627));
                            i = -1808318088;
                            i10 = i ^ iM2566;
                            c14864M41428 = c14864M41428;
                            i5 = i5;
                        }
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        iM2566 = (C2105.m6981("ۢܶ") + i6) * (-51);
                        i8 = 1574941086 ^ ((iM2566 ^ i7) * (-15303));
                        i = 1741787504;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -1948671603:
                    case 1522796622:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        if (C2105.f7037 != 0) {
                            iM2566 = (C0630.m2566("ۗۧ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i8 = (-2054314786) ^ ((iM2566 ^ i7) * (-29209));
                            i = 1532228282;
                        } else {
                            iM2566 = (i6 - C0630.m2566("ۚۛ")) * (-51);
                            i8 = 1905050615 ^ ((iM2566 ^ i7) * (-17151));
                            i = 1947815498;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -1770424665:
                    case 162203268:
                        C4616.m13552();
                        C4117.m12364();
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        iM2566 = (i6 - C0630.m2566("ܿۨ")) * 85;
                        i8 = 974426473 ^ ((iM2566 ^ i7) * 28307);
                        i = -1956275002;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -1720032715:
                    case -1603222114:
                        throw new C1637(c14864M41428.m35265());
                    case -1713008086:
                    case 653193308:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        c = 19;
                        if (C0630.f2410 <= 0) {
                            iM2566 = (i7 - C2105.m6981("۟۟")) * (-93);
                            i8 = 1564113113 ^ ((iM2566 ^ i6) * (-12087));
                            i = -83005183;
                        } else {
                            iM2566 = C2105.m6981("ۚۙ") ^ i6;
                            i8 = 754946329 ^ ((iM2566 ^ i7) * (-5381));
                            i = -343808774;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -1694679933:
                    case 1962451331:
                        if (!c14864M41428.m35269()) {
                            iM6981 = C0630.m2566("ܳ֫") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-17263)) ^ (-153229237);
                            i9 = 1817730170;
                        } else {
                            iM6981 = (C0630.m2566("ۡ᩸") + i6) * 87;
                            i8 = ((iM6981 ^ i7) * 23603) ^ 935762987;
                            i9 = -1214664497;
                        }
                        break;
                    case -1553848402:
                    case 1920647274:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        s = sArr[c];
                        s2 = 17900;
                        if (RunnableC3474.m10630()) {
                            iM2566 = (C2105.m6981("ۧᩳ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i8 = (-1809425633) ^ ((iM2566 ^ i6) * (-29817));
                            i = 1454538079;
                        } else {
                            iM2566 = C0630.m2566("ۛ֫") ^ i7;
                            i8 = (-1896245564) ^ ((iM2566 ^ i6) * (-26369));
                            i = 1888068731;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -1422223272:
                    case 1031820314:
                        C0964.m3413();
                        return;
                    case -1422095099:
                    case 1822304681:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        c16709 = this.f3980.f25132;
                        iM2566 = (C0630.m2566("ܿۙ") + i6) * (-37);
                        i8 = 1185633195 ^ ((iM2566 ^ i7) * (-18465));
                        i = 228251927;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -1406207293:
                    case 1874779199:
                        if (C1294.f4556 < 0) {
                            iM6981 = (C2105.m6981("᩸۠") + i7) * 31;
                            i8 = ((iM6981 ^ i6) * 6419) ^ (-460287436);
                            i9 = -307609890;
                        }
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        iM2566 = (i6 - C0630.m2566("ܿۨ")) * 85;
                        i8 = 974426473 ^ ((iM2566 ^ i7) * 28307);
                        i = -1956275002;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -1276621308:
                    case 1100741715:
                        try {
                            C9221 c9221M38286 = C16275.m38286(c16709);
                            c14864M41428 = c14864M41428;
                            try {
                                C17687 c17687M41422 = C17687.m41422(C3663.m11162(f3979, 20, 26, i4));
                                c17687M41422.m41430();
                                i5 = i5;
                                try {
                                    ServiceConnectionC3453.m10556(c17687M41422, C0237.m1483(f3979, 46, 8, i4), C0483.m2134(c16709));
                                    ServiceConnectionC3453.m10556(c17687M41422, C5695.m16034(f3979, 54, 11, i4), String.valueOf(c9221M38286.f27911));
                                    c14864M41428 = c17687M41422.m41428();
                                    int iM2567 = C0630.m2566("᩻᩹") ^ i7;
                                    i8 = 780965686 ^ ((iM2567 ^ i6) * 8313);
                                    i10 = 1876732234 ^ iM2567;
                                } catch (Exception unused) {
                                    int iM6982 = (C2105.m6981("ۨ᩵") + i6) * (-35);
                                    i8 = ((iM6982 ^ i7) * 16055) ^ (-1685270056);
                                    i10 = iM6982 ^ (-2022508033);
                                    c14864M41428 = c14864M41428;
                                }
                            } catch (Exception unused2) {
                                i5 = i5;
                                int iM6983 = (C2105.m6981("ۨ᩵") + i6) * (-35);
                                i8 = ((iM6983 ^ i7) * 16055) ^ (-1685270056);
                                i10 = iM6983 ^ (-2022508033);
                                c14864M41428 = c14864M41428;
                                i5 = i5;
                                break;
                            }
                        } catch (Exception unused3) {
                            c14864M41428 = c14864M41428;
                        }
                        i5 = i5;
                        break;
                    case -1250922995:
                    case -813775172:
                        C1128.m3851();
                        break;
                    case -1249273669:
                    case 618194822:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        if (C3432.f10845 >= 0) {
                            iM2566 = C2105.m6981("ܳۤ") ^ i6;
                            i8 = 1171208743 ^ ((iM2566 ^ i7) * 17631);
                            i = -224320363;
                        } else {
                            iM2566 = C0630.m2566("᩹ᩴ") ^ i6;
                            i8 = 1300635684 ^ ((iM2566 ^ i7) * (-29291));
                            i = -46622478;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -829665031:
                    case 896634839:
                        if (C2105.f7037 == 0) {
                            c14864M41428 = c14864M41428;
                            i5 = i5;
                            iM2566 = (i7 - C2105.m6981("۟۟")) * (-93);
                            i8 = 1564113113 ^ ((iM2566 ^ i6) * (-12087));
                            i = -83005183;
                            i10 = i ^ iM2566;
                            c14864M41428 = c14864M41428;
                            i5 = i5;
                        }
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        iM2566 = (i6 - C0630.m2566("ܿۨ")) * 85;
                        i8 = 974426473 ^ ((iM2566 ^ i7) * 28307);
                        i = -1956275002;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -808113690:
                    case 1964629555:
                        c14864M41428 = new C14864(2);
                        i5 = i5;
                        int iM2568 = C0630.m2566("᩻᩹") ^ i7;
                        i8 = 780965686 ^ ((iM2568 ^ i6) * 8313);
                        i10 = 1876732234 ^ iM2568;
                        i5 = i5;
                        break;
                    case -479401115:
                    case 1691016297:
                        return;
                    case -189590045:
                    case 702276084:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        if (C21923.f70183 != 0) {
                            iM2566 = (C0630.m2566("ۗۧ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i8 = (-2054314786) ^ ((iM2566 ^ i7) * (-29209));
                            i = 1532228282;
                        } else {
                            iM2566 = C0630.m2566("۟ۜ") ^ i7;
                            i8 = (-710198920) ^ ((iM2566 ^ i6) * (-18657));
                            i = 2130419911;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case -157024032:
                    case 753553185:
                        i4 = 1599;
                        iM2566 = C0630.m2566("ܽ᩻") ^ i7;
                        i8 = (-796470786) ^ ((iM2566 ^ i6) * 28147);
                        i = -1715729952;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case 338953533:
                    case 1690314822:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        if (C0964.f3626 != 0) {
                            iM2566 = (i6 - C0630.m2566("ܿۨ")) * 85;
                            i8 = 974426473 ^ ((iM2566 ^ i7) * 28307);
                            i = -1956275002;
                        } else {
                            iM2566 = C2105.m6981("᩵᩶") ^ i7;
                            i8 = 481887178 ^ ((iM2566 ^ i6) * 30949);
                            i = -587565630;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case 443958886:
                    case 912630260:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        i3 = s + s3;
                        if (C1773.f6144 <= 0) {
                            iM2566 = C0630.m2566("ۘۡ") ^ i7;
                            i8 = (-179724711) ^ ((iM2566 ^ i6) * (-13627));
                            i = -1808318088;
                        } else {
                            iM2566 = (C0630.m2566("᩺֨") + i7) * 101;
                            i8 = (-315678281) ^ ((iM2566 ^ i6) * (-14695));
                            i = -110589909;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case 603294646:
                    case 1362638147:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        i2 = s * s2;
                        s3 = 4475;
                        if (RunnableC1108.f4040) {
                            iM2566 = (C2105.m6981("ۡ֡") ^ i6) * 35;
                            i8 = 983405192 ^ ((iM2566 ^ i7) * 6241);
                            i = 993245241;
                        } else {
                            iM2566 = C0630.m2566("ۨۜ") ^ i6;
                            i8 = (-1403149304) ^ ((iM2566 ^ i7) * 10255);
                            i = -163184796;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case 734813606:
                    case 1410916651:
                        i4 = 48635;
                        iM2566 = C0630.m2566("ܽ᩻") ^ i7;
                        i8 = (-796470786) ^ ((iM2566 ^ i6) * 28147);
                        i = -1715729952;
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case 1097777874:
                    case 2043283203:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        if ((i3 * i3) - i2 >= 0) {
                            iM2566 = (i6 - C2105.m6981("᩹ۨ")) * (-47);
                            i8 = 2143673470 ^ ((iM2566 ^ i7) * 421);
                            i = -280289525;
                        } else {
                            iM2566 = (C0630.m2566("ܺܽ") ^ i7) * 91;
                            i8 = 1255653634 ^ ((iM2566 ^ i6) * 30705);
                            i = -711984452;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                    case 1551801098:
                    case 1628782822:
                        if (C3019.f9544 < 0) {
                            c14864M41428 = c14864M41428;
                            i5 = i5;
                            iM2566 = C2105.m6981("ܳۤ") ^ i6;
                            i8 = 1171208743 ^ ((iM2566 ^ i7) * 17631);
                            i = -224320363;
                            i10 = i ^ iM2566;
                            c14864M41428 = c14864M41428;
                            i5 = i5;
                        } else {
                            iM6981 = C2105.m6981("᩵ܺ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 17239) ^ 1847328810;
                            i9 = 1079087103;
                        }
                        break;
                    default:
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        if (C3911.f12484 >= 0) {
                            iM2566 = (i7 - C2105.m6981("۟۟")) * (-93);
                            i8 = 1564113113 ^ ((iM2566 ^ i6) * (-12087));
                            i = -83005183;
                        } else {
                            iM2566 = (C2105.m6981("ᩳ۟") ^ i6) * 15;
                            i8 = 1030129107 ^ ((iM2566 ^ i7) * (-9293));
                            i = 558593867;
                        }
                        i10 = i ^ iM2566;
                        c14864M41428 = c14864M41428;
                        i5 = i5;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0137 A[PHI: r10 r11 r12
      0x0137: PHI (r10v5 short[]) = (r10v2 short[]), (r10v4 short[]), (r10v2 short[]) binds: [B:87:0x0137, B:36:0x0135, B:28:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:87:0x0137, B:36:0x0135, B:28:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:87:0x0137, B:36:0x0135, B:28:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0194 A[PHI: r3
      0x0194: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:44:0x0192, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0274 A[PHI: r4 r5 r6 r7 r8 r9 r15 r18 r23
      0x0274: PHI (r4v4 android.content.Intent) = 
      (r4v2 android.content.Intent)
      (r4v3 android.content.Intent)
      (r4v2 android.content.Intent)
      (r4v2 android.content.Intent)
      (r4v2 android.content.Intent)
     binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r5v5 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v4 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v5 int) binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r9v5 java.lang.String) = 
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v4 java.lang.String)
      (r9v2 java.lang.String)
     binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r23v5 short) = (r23v4 short), (r23v3 short), (r23v3 short), (r23v3 short), (r23v3 short) binds: [B:60:0x0272, B:40:0x016e, B:32:0x010b, B:23:0x00a6, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x02ac A[PHI: r16 r17
      0x02ac: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:88:0x02ac, B:64:0x02aa, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char) binds: [B:88:0x02ac, B:64:0x02aa, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM6981;
        int i;
        int i2;
        int i3 = RunnableC1937.f6483;
        int i4 = C3432.f10845;
        int iM2566 = C0630.m2566("ܰᩴ") ^ i4;
        int i5 = ((iM2566 ^ i3) * 22887) ^ 1376394178;
        String strM6573 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ 1162261581;
        int i7 = 0;
        int iM6982 = 0;
        int i8 = 0;
        char c = 0;
        short s = 0;
        int i9 = 1420673366;
        short s2 = 0;
        Intent intent = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = 0;
        String strM5914 = null;
        String strM4373 = null;
        int i11 = 0;
        C16709 c16709 = null;
        ActivityC15196 activityC15196 = null;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i3) * 17127) >> 31));
            switch (i9) {
                case -2122429716:
                case -2086819983:
                    C2167.m7155();
                    int iM2567 = C0630.m2566("ܽ᩹") ^ i4;
                    i5 = ((iM2567 ^ i3) * 6695) ^ 885929740;
                    i6 = iM2567 ^ 1819090757;
                    break;
                case -2055486057:
                case -62655058:
                    strM5914 = C1773.m5914(c16709);
                    int i12 = ViewOnClickListenerC0380.f1796;
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("᩶ᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * (-15113)) ^ (-109710258);
                        i2 = -1332728939;
                    } else {
                        iM6981 = (C0630.m2566("᩻᩶") + i4) * 45;
                        i = ((iM6981 ^ i3) * (-19685)) ^ 693791913;
                        i2 = -1677631703;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2054332341:
                case -852260224:
                    ServiceConnectionC3453.m10564();
                    if (C3432.m10477() <= 0) {
                        iM6981 = C2105.m6981("֡ܳ") ^ i3;
                        i = ((iM6981 ^ i4) * (-23761)) ^ (-21577011);
                        i2 = 278732916;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM2568 = C0630.m2566("ܽ᩹") ^ i4;
                        i5 = ((iM2568 ^ i3) * 6695) ^ 885929740;
                        i6 = iM2568 ^ 1819090757;
                    }
                    break;
                case -1830444075:
                case 360525739:
                    i7 = iM6982 ^ i11;
                    strM4373 = C1294.m4373(f3979, 16, 3, i10);
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("֡᩶") ^ i3;
                        i = ((iM6981 ^ i4) * (-22155)) ^ (-2026536206);
                        i2 = -1716187033;
                    } else {
                        iM6981 = (C0630.m2566("ۖۖ") ^ i3) * 55;
                        i = ((iM6981 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1803442070:
                case 1617201507:
                    i10 = 13679;
                    iM6981 = C2105.m6981("ᩴ۬") ^ i4;
                    i = ((iM6981 ^ i3) * 24579) ^ (-1958183439);
                    i2 = -722241042;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1333202026:
                case 1666553261:
                    strM6573 = AbstractC2021.m6573(sArr, 9, 4, i10);
                    if (RunnableC1108.f4040) {
                        iM6981 = (C0630.m2566("ۨ֨") ^ i4) * 67;
                        i = ((iM6981 ^ i3) * 25785) ^ (-258229231);
                        i2 = -1888672855;
                    } else {
                        iM6981 = (C0630.m2566("ۖۖ") ^ i3) * 55;
                        i = ((iM6981 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1269219031:
                case 92749315:
                    if (C1420.f5096 > 0) {
                        iM6981 = C0630.m2566("᩷᩵") ^ i4;
                        i = ((iM6981 ^ i3) * 27279) ^ 1208123951;
                        i2 = 2015666038;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM2569 = C0630.m2566("ܽ᩹") ^ i4;
                        i5 = ((iM2569 ^ i3) * 6695) ^ 885929740;
                        i6 = iM2569 ^ 1819090757;
                    }
                    break;
                case -926950986:
                case -580803033:
                    int i13 = s + s2;
                    if ((67288 * s) - (i13 * i13) <= 0) {
                        iM6981 = (C0630.m2566("ܿۘ") + i3) * 109;
                        i = ((iM6981 ^ i4) * 30393) ^ (-1343271367);
                        i2 = 1068927848;
                    } else {
                        iM6981 = (C2105.m6981("ۨ᩷") ^ i4) * (-121);
                        i = ((iM6981 ^ i3) * 19675) ^ (-1159417744);
                        i2 = -38046085;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -646332751:
                case 690050671:
                    C0050.m940();
                    break;
                case -589850335:
                case 1642338366:
                    ViewOnClickListenerC8142 viewOnClickListenerC8142 = this.f3980;
                    ActivityC15196 activityC15197 = viewOnClickListenerC8142.f25130;
                    RunnableC1108.m3781(activityC15197);
                    C16709 c167010 = viewOnClickListenerC8142.f25132;
                    if (C1005.f3721) {
                        int iM6983 = (C2105.m6981("֫ۗ") ^ i3) * (-103);
                        i6 = iM6983 ^ (-1312584808);
                        i5 = ((iM6983 ^ i4) * 20283) ^ 2023817171;
                        c16709 = c167010;
                        activityC15196 = activityC15197;
                    } else {
                        c16709 = c167010;
                        activityC15196 = activityC15197;
                        int iM25610 = C0630.m2566("ܽ᩹") ^ i4;
                        i5 = ((iM25610 ^ i3) * 6695) ^ 885929740;
                        i6 = iM25610 ^ 1819090757;
                    }
                    break;
                case -433951330:
                case 1889291119:
                    C1504.m5168(intent, C4075.m12252(sArr4, 1, 8, i10), strM5914);
                    sArr = f3979;
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("᩷᩵") ^ i4;
                        i = ((iM6981 ^ i3) * 27279) ^ 1208123951;
                        i2 = 2015666038;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩺") ^ i3;
                        i = ((iM6981 ^ i4) * 193) ^ 223601967;
                        i2 = 560716970;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -349135087:
                case -288235646:
                    intent.putExtra(strM6573, 0);
                    ServiceConnectionC3453.m10570(activityC15196, intent);
                    sArr2 = f3979;
                    i8 = 13;
                    if (C7106.m19120() <= 0) {
                        iM6981 = C0630.m2566("᩷᩵") ^ i4;
                        i = ((iM6981 ^ i3) * 27279) ^ 1208123951;
                        i2 = 2015666038;
                    } else {
                        iM6981 = (C0630.m2566("᩹ܳ") ^ i4) * (-117);
                        i = ((iM6981 ^ i3) * (-14957)) ^ (-387762826);
                        i2 = -1561515666;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -263055839:
                case 1215869129:
                    sArr3 = f3979;
                    c = 0;
                    if (C3911.m11924() <= 0) {
                        iM6981 = C2105.m6981("֡ܳ") ^ i3;
                        i = ((iM6981 ^ i4) * (-23761)) ^ (-21577011);
                        i2 = 278732916;
                    } else {
                        iM6981 = (C2105.m6981("ۗۛ") + i4) * (-103);
                        i = ((iM6981 ^ i3) * (-17765)) ^ 472005678;
                        i2 = 526520924;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -90108344:
                case -57418147:
                    C1420.m4913();
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("֡ܳ") ^ i3;
                        i = ((iM6981 ^ i4) * (-23761)) ^ (-21577011);
                        i2 = 278732916;
                    } else {
                        iM6981 = C0630.m2566("᩶ᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * (-15113)) ^ (-109710258);
                        i2 = -1332728939;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -5210847:
                case 568203279:
                    i10 = 59587;
                    iM6981 = C2105.m6981("ᩴ۬") ^ i4;
                    i = ((iM6981 ^ i3) * 24579) ^ (-1958183439);
                    i2 = -722241042;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 139855800:
                case 1455275689:
                    activityC15196.overridePendingTransition(i7, C0630.m2566(strM4373) ^ 2098887614);
                    break;
                case 991253360:
                case 1794205436:
                    s = sArr3[c];
                    s2 = 16822;
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("ۖۖ") ^ i3) * 55;
                        i = ((iM6981 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    } else {
                        iM6981 = (C2105.m6981("ᩳۖ") + i3) * (-89);
                        i = ((iM6981 ^ i4) * 31375) ^ (-1432648340);
                        i2 = -1681499460;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1182971704:
                case 1227466286:
                    intent = new Intent(activityC15196, (Class<?>) ViewOnClickListenerC0380.class);
                    sArr4 = f3979;
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("ۖۖ") ^ i3) * 55;
                        i = ((iM6981 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    } else {
                        iM6981 = (C0630.m2566("ܰ᩷") ^ i3) * (-27);
                        i = ((iM6981 ^ i4) * (-21289)) ^ 883633694;
                        i2 = 2066259743;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    iM6982 = C2105.m6981(C22628.m50602(sArr2, i8, 3, i10));
                    i11 = 2125861545;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C0630.m2566("ۖۖ") ^ i3) * 55;
                        i = ((iM6981 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩶᩻")) * 29;
                        i = ((iM6981 ^ i4) * 9087) ^ (-1389307047);
                        i2 = -1827834662;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C1086(ViewOnClickListenerC8142 viewOnClickListenerC8142) {
        this.f3980 = viewOnClickListenerC8142;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C3537.m10743(this, this.f3980.f25130);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C0237.m1487(this);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ViewOnClickListenerC8142 viewOnClickListenerC8142 = null;
        int i = 178052643;
        int i2 = C22628.f73083;
        int i3 = RunnableC3474.f10992;
        int iM6981 = (C2105.m6981("֨᩸") + i2) * 87;
        int i4 = ((iM6981 ^ i3) * 9919) ^ (-2054575564);
        int i5 = 339002659;
        while (true) {
            i = ((((i ^ i3) * (-22539)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1813603084:
                case -74702291:
                    C1504.m5179();
                    C1005.m3501();
                    break;
                case -1731164442:
                case -68261444:
                    if (RunnableC1108.f4040) {
                        iM6981 = (i2 - C0630.m2566("ܿۘ")) * (-123);
                        i4 = ((iM6981 ^ i3) * 19735) ^ 996593944;
                        i5 = 260107309;
                    } else {
                        iM6981 = (C0630.m2566("ۤ۫") ^ i3) * (-21);
                        i4 = ((iM6981 ^ i2) * 7235) ^ (-154580821);
                        i5 = -38656382;
                    }
                    break;
                case -1612250964:
                case -719990032:
                    if (C2105.m6982() != 0) {
                        iM6981 = (C0630.m2566("ۤ۫") ^ i3) * (-21);
                        i4 = ((iM6981 ^ i2) * 7235) ^ (-154580821);
                        i5 = -38656382;
                    } else {
                        iM6981 = C2105.m6981("᩸ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6227)) ^ (-622621334);
                        i5 = -113676043;
                    }
                    break;
                case -1333955554:
                case 1693585487:
                    ServiceConnectionC3453.m10564();
                    if (C3537.m10746() <= 0) {
                        iM6981 = (C0630.m2566("ۤ۫") ^ i3) * (-21);
                        i4 = ((iM6981 ^ i2) * 7235) ^ (-154580821);
                        i5 = -38656382;
                    } else {
                        iM6981 = C2105.m6981("᩵᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6683)) ^ 2032346898;
                        i5 = -1509501770;
                    }
                    break;
                case -1118955128:
                case 961211999:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("᩵᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6683)) ^ 2032346898;
                        i5 = -1509501770;
                    } else {
                        iM6981 = C2105.m6981("֫᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2965)) ^ (-113243285);
                        i5 = -1258302090;
                    }
                    break;
                case -884333409:
                case 714851929:
                    C4075.m12246(viewOnClickListenerC8142.f25130, exc, null);
                    break;
                case -610710710:
                case 1147087350:
                    if (C1504.f5354) {
                        iM6981 = (i3 - C0630.m2566("᩸ܺ")) * (-99);
                        i4 = ((iM6981 ^ i2) * (-2443)) ^ (-89705741);
                        i5 = 1837337225;
                    } else {
                        iM6981 = (C2105.m6981("ۡܽ") ^ i2) * (-45);
                        i4 = ((iM6981 ^ i3) * (-28747)) ^ 637602807;
                        i5 = 1002212229;
                    }
                    break;
                case -562310958:
                case 811044056:
                    if (C2105.f7037 != 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ܺ")) * (-99);
                        i4 = ((iM6981 ^ i2) * (-2443)) ^ (-89705741);
                        i5 = 1837337225;
                    } else {
                        iM6981 = (C0630.m2566("ܽ۬") + i2) * (-39);
                        i4 = ((iM6981 ^ i3) * (-25531)) ^ (-182229063);
                        i5 = -1456331913;
                    }
                    break;
                case -539491943:
                case -1361059:
                    if (C0382.f1805) {
                        iM6981 = (C2105.m6981("ܳ᩻") ^ i2) * 45;
                        i4 = ((iM6981 ^ i3) * 9271) ^ (-543205431);
                        i5 = 865098949;
                    } else {
                        iM6981 = (C0630.m2566("ۤ۫") ^ i3) * (-21);
                        i4 = ((iM6981 ^ i2) * 7235) ^ (-154580821);
                        i5 = -38656382;
                    }
                    break;
                case -218896947:
                case 1250147562:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("᩹ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17517) ^ (-1844613214);
                        i5 = 920700941;
                    } else {
                        iM6981 = (C0630.m2566("ۤ۬") ^ i2) * (-21);
                        i4 = ((iM6981 ^ i3) * (-22831)) ^ 728650425;
                        i5 = -822253471;
                    }
                    break;
                case 333055039:
                case 1854997006:
                    if (C1504.m5179()) {
                        iM6981 = (C0630.m2566("ۙۤ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i2) * (-29421)) ^ 750277381;
                        i5 = 1063195109;
                    } else {
                        iM6981 = C0630.m2566("᩹ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17517) ^ (-1844613214);
                        i5 = 920700941;
                    }
                    break;
                case 350295369:
                case 1324423318:
                    C4159.m12565();
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("᩵᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6683)) ^ 2032346898;
                        i5 = -1509501770;
                    } else {
                        iM6981 = (C0630.m2566("ܽۘ") + i2) * (-27);
                        i4 = ((iM6981 ^ i3) * 24093) ^ (-679940418);
                        i5 = -527919416;
                    }
                    break;
                case 1335748405:
                case 1521646936:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("᩹ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17517) ^ (-1844613214);
                        i5 = 920700941;
                    } else {
                        iM6981 = C0630.m2566("ܿܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27815) ^ 1591964595;
                        i5 = -1080952146;
                    }
                    break;
                case 1453639976:
                case 1460226747:
                    C0382.m1848();
                    if (C22628.f73083 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ܺ")) * (-99);
                        i4 = ((iM6981 ^ i2) * (-2443)) ^ (-89705741);
                        i5 = 1837337225;
                    } else {
                        iM6981 = C2105.m6981("᩵᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6683)) ^ 2032346898;
                        i5 = -1509501770;
                    }
                    break;
                case 1668584725:
                case 1937207399:
                    viewOnClickListenerC8142 = this.f3980;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("᩹ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17517) ^ (-1844613214);
                        i5 = 920700941;
                    } else {
                        iM6981 = C0630.m2566("ۜܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19611) ^ 1941317110;
                        i5 = 1265750058;
                    }
                    break;
                default:
                    C0483.m2121();
                    C0964.m3413();
                    iM6981 = C2105.m6981("᩵᩶") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-6683)) ^ 2032346898;
                    i5 = -1509501770;
                    break;
            }
            return;
        }
    }
}
