package p067l;

import android.content.Intent;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J2RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3401 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۗۙۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f81855 = {8189, -5965, -5969, -5962, -5980, -5974, -5971, -6006, -5977, -5970, -5972, -5977, -5978, -30948, 29282, -29227, 25589, 24770, -31473, 5602, -16940, -17013, -17001, -17010, -16996, -17006, -17003, -16940, -16993, -16994, -17011, -16940, -17000, -17005, -16994, -17000, -17008, -16940, -17013, -17010, -16999, -17001, -17006, -17016, -17005, -16951, -17013, -17001, -17010, -16996, -17006, -17003, -16974, -16993, -17013, -16998, -17000, -17008, -16998, -16996, -16994, -16984, -17006, -17023, -16994};

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ViewOnClickListenerC10107 f6751;

    /* JADX WARN: Code duplicated, block: B:89:0x0304 A[PHI: r16 r17
      0x0304: PHI (r16v29 l.ܳ᩻᩷) = (r16v7 l.ܳ᩻᩷), (r16v8 l.ܳ᩻᩷), (r16v30 l.ܳ᩻᩷) binds: [B:88:0x0302, B:84:0x02e0, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0304: PHI (r17v30 int) = (r17v6 int), (r17v7 int), (r17v31 int) binds: [B:88:0x0302, B:84:0x02e0, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0394 A[PHI: r3 r16 r17
      0x0394: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:80:0x02c0, B:39:0x00c5, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r16v31 l.ܳ᩻᩷) = (r16v9 l.ܳ᩻᩷), (r16v18 l.ܳ᩻᩷), (r16v34 l.ܳ᩻᩷) binds: [B:80:0x02c0, B:39:0x00c5, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r17v32 int) = (r17v8 int), (r17v19 int), (r17v36 int) binds: [B:80:0x02c0, B:39:0x00c5, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (p067l.C1053.m56327() >= 0) goto L19;
     */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3405() throws C3924 {
        int iM55680;
        int i;
        C18249 c18249 = null;
        C16496 c16496M43674 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i2 = 0;
        short s3 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -524899440;
        int i6 = RunnableC0871.f81839;
        int i7 = C0989.f81920;
        int iM55979 = C0946.m55979("ۖۨ") ^ i6;
        int i8 = ((iM55979 ^ i7) * 15443) ^ (-776134906);
        int i9 = -1358770371;
        while (true) {
            int i10 = iM55979 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i7) * 9993) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2096584801:
                    case -1732852085:
                        C0877.m55696();
                        if (C1404.f82149 >= 0) {
                            c16496M43674 = c16496M43674;
                            i5 = i5;
                            iM55680 = C0873.m55680("ۨۜ") ^ i6;
                            i8 = (-1403149304) ^ ((iM55680 ^ i7) * 10255);
                            i = -163184796;
                            i10 = i ^ iM55680;
                            c16496M43674 = c16496M43674;
                            i5 = i5;
                        } else {
                            iM55979 = (C0946.m55979("᩸۠") + i7) * 31;
                            i8 = ((iM55979 ^ i6) * 6419) ^ (-460287436);
                            i9 = -307609890;
                        }
                        break;
                    case -2052348708:
                    case -690226464:
                        C1025.m56230();
                        if (!C0955.f81898) {
                            iM55979 = C0946.m55979("᩵ܺ") ^ i7;
                            i8 = ((iM55979 ^ i6) * 17239) ^ 1847328810;
                            i9 = 1079087103;
                        }
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        iM55680 = (C0873.m55680("ۗۧ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = (-2054314786) ^ ((iM55680 ^ i7) * (-29209));
                        i = 1532228282;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                        break;
                    case -2048121448:
                    case 922348096:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        sArr = f81855;
                        if (C0949.f81897 >= 0) {
                            iM55680 = (C0946.m55979("ۢܶ") + i6) * (-51);
                            i8 = 1574941086 ^ ((iM55680 ^ i7) * (-15303));
                            i = 1741787504;
                        } else {
                            iM55680 = C0873.m55680("ܺܳ") ^ i7;
                            i8 = 37360688 ^ ((iM55680 ^ i6) * 32665);
                            i = -1558931565;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -2028805189:
                    case 1801076011:
                        if (C1046.f81962 > 0) {
                            iM55979 = C0946.m55979("᩵ܺ") ^ i7;
                            i8 = ((iM55979 ^ i6) * 17239) ^ 1847328810;
                            i9 = 1079087103;
                        }
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        iM55680 = (i6 - C0873.m55680("ܿۨ")) * 85;
                        i8 = 974426473 ^ ((iM55680 ^ i7) * 28307);
                        i = -1956275002;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -2017525567:
                    case 1110873919:
                        if (C1044.f81959 < 0) {
                            c16496M43674 = c16496M43674;
                            i5 = i5;
                            iM55680 = C0873.m55680("ۘۡ") ^ i7;
                            i8 = (-179724711) ^ ((iM55680 ^ i6) * (-13627));
                            i = -1808318088;
                            i10 = i ^ iM55680;
                            c16496M43674 = c16496M43674;
                            i5 = i5;
                        }
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        iM55680 = (C0946.m55979("ۢܶ") + i6) * (-51);
                        i8 = 1574941086 ^ ((iM55680 ^ i7) * (-15303));
                        i = 1741787504;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -1948671603:
                    case 1522796622:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        if (C0946.f81894 != 0) {
                            iM55680 = (C0873.m55680("ۗۧ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i8 = (-2054314786) ^ ((iM55680 ^ i7) * (-29209));
                            i = 1532228282;
                        } else {
                            iM55680 = (i6 - C0873.m55680("ۚۛ")) * (-51);
                            i8 = 1905050615 ^ ((iM55680 ^ i7) * (-17151));
                            i = 1947815498;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -1770424665:
                    case 162203268:
                        C1071.m56343();
                        C1046.m56302();
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        iM55680 = (i6 - C0873.m55680("ܿۨ")) * 85;
                        i8 = 974426473 ^ ((iM55680 ^ i7) * 28307);
                        i = -1956275002;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -1720032715:
                    case -1603222114:
                        throw new C3924(c16496M43674.m37418());
                    case -1713008086:
                    case 653193308:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        c = 19;
                        if (C0873.f81841 <= 0) {
                            iM55680 = (i7 - C0946.m55979("۟۟")) * (-93);
                            i8 = 1564113113 ^ ((iM55680 ^ i6) * (-12087));
                            i = -83005183;
                        } else {
                            iM55680 = C0946.m55979("ۚۙ") ^ i6;
                            i8 = 754946329 ^ ((iM55680 ^ i7) * (-5381));
                            i = -343808774;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -1694679933:
                    case 1962451331:
                        if (!c16496M43674.m37422()) {
                            iM55979 = C0873.m55680("ܳ֫") ^ i7;
                            i8 = ((iM55979 ^ i6) * (-17263)) ^ (-153229237);
                            i9 = 1817730170;
                        } else {
                            iM55979 = (C0873.m55680("ۡ᩸") + i6) * 87;
                            i8 = ((iM55979 ^ i7) * 23603) ^ 935762987;
                            i9 = -1214664497;
                        }
                        break;
                    case -1553848402:
                    case 1920647274:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        s = sArr[c];
                        s2 = 17900;
                        if (RunnableC1014.m56177()) {
                            iM55680 = (C0946.m55979("ۧᩳ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i8 = (-1809425633) ^ ((iM55680 ^ i6) * (-29817));
                            i = 1454538079;
                        } else {
                            iM55680 = C0873.m55680("ۛ֫") ^ i7;
                            i8 = (-1896245564) ^ ((iM55680 ^ i6) * (-26369));
                            i = 1888068731;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -1422223272:
                    case 1031820314:
                        C0890.m55740();
                        return;
                    case -1422095099:
                    case 1822304681:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        c18249 = this.f6751.f28044;
                        iM55680 = (C0873.m55680("ܿۙ") + i6) * (-37);
                        i8 = 1185633195 ^ ((iM55680 ^ i7) * (-18465));
                        i = 228251927;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -1406207293:
                    case 1874779199:
                        if (C0906.f81862 < 0) {
                            iM55979 = (C0946.m55979("᩸۠") + i7) * 31;
                            i8 = ((iM55979 ^ i6) * 6419) ^ (-460287436);
                            i9 = -307609890;
                        }
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        iM55680 = (i6 - C0873.m55680("ܿۨ")) * 85;
                        i8 = 974426473 ^ ((iM55680 ^ i7) * 28307);
                        i = -1956275002;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -1276621308:
                    case 1100741715:
                        try {
                            C11133 c11133M40500 = C17837.m40500(c18249);
                            c16496M43674 = c16496M43674;
                            try {
                                C19179 c19179M43668 = C19179.m43668(C1024.m56203(f81855, 20, 26, i4));
                                c19179M43668.m43676();
                                i5 = i5;
                                try {
                                    ServiceConnectionC1013.m56150(c19179M43668, C0854.m55597(f81855, 46, 8, i4), C0866.m55658(c18249));
                                    ServiceConnectionC1013.m56150(c19179M43668, C1124.m56373(f81855, 54, 11, i4), String.valueOf(c11133M40500.f30857));
                                    c16496M43674 = c19179M43668.m43674();
                                    int iM55681 = C0873.m55680("᩻᩹") ^ i7;
                                    i8 = 780965686 ^ ((iM55681 ^ i6) * 8313);
                                    i10 = 1876732234 ^ iM55681;
                                } catch (Exception unused) {
                                    int iM559710 = (C0946.m55979("ۨ᩵") + i6) * (-35);
                                    i8 = ((iM559710 ^ i7) * 16055) ^ (-1685270056);
                                    i10 = iM559710 ^ (-2022508033);
                                    c16496M43674 = c16496M43674;
                                }
                            } catch (Exception unused2) {
                                i5 = i5;
                                int iM559711 = (C0946.m55979("ۨ᩵") + i6) * (-35);
                                i8 = ((iM559711 ^ i7) * 16055) ^ (-1685270056);
                                i10 = iM559711 ^ (-2022508033);
                                c16496M43674 = c16496M43674;
                                i5 = i5;
                                break;
                            }
                        } catch (Exception unused3) {
                            c16496M43674 = c16496M43674;
                        }
                        i5 = i5;
                        break;
                    case -1250922995:
                    case -813775172:
                        C0898.m55800();
                        break;
                    case -1249273669:
                    case 618194822:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        if (C1012.f81938 >= 0) {
                            iM55680 = C0946.m55979("ܳۤ") ^ i6;
                            i8 = 1171208743 ^ ((iM55680 ^ i7) * 17631);
                            i = -224320363;
                        } else {
                            iM55680 = C0873.m55680("᩹ᩴ") ^ i6;
                            i8 = 1300635684 ^ ((iM55680 ^ i7) * (-29291));
                            i = -46622478;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -829665031:
                    case 896634839:
                        if (C0946.f81894 == 0) {
                            c16496M43674 = c16496M43674;
                            i5 = i5;
                            iM55680 = (i7 - C0946.m55979("۟۟")) * (-93);
                            i8 = 1564113113 ^ ((iM55680 ^ i6) * (-12087));
                            i = -83005183;
                            i10 = i ^ iM55680;
                            c16496M43674 = c16496M43674;
                            i5 = i5;
                        }
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        iM55680 = (i6 - C0873.m55680("ܿۨ")) * 85;
                        i8 = 974426473 ^ ((iM55680 ^ i7) * 28307);
                        i = -1956275002;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -808113690:
                    case 1964629555:
                        c16496M43674 = new C16496(2);
                        i5 = i5;
                        int iM55682 = C0873.m55680("᩻᩹") ^ i7;
                        i8 = 780965686 ^ ((iM55682 ^ i6) * 8313);
                        i10 = 1876732234 ^ iM55682;
                        i5 = i5;
                        break;
                    case -479401115:
                    case 1691016297:
                        return;
                    case -189590045:
                    case 702276084:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        if (C1929.f83011 != 0) {
                            iM55680 = (C0873.m55680("ۗۧ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i8 = (-2054314786) ^ ((iM55680 ^ i7) * (-29209));
                            i = 1532228282;
                        } else {
                            iM55680 = C0873.m55680("۟ۜ") ^ i7;
                            i8 = (-710198920) ^ ((iM55680 ^ i6) * (-18657));
                            i = 2130419911;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case -157024032:
                    case 753553185:
                        i4 = 1599;
                        iM55680 = C0873.m55680("ܽ᩻") ^ i7;
                        i8 = (-796470786) ^ ((iM55680 ^ i6) * 28147);
                        i = -1715729952;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case 338953533:
                    case 1690314822:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        if (C0890.f81849 != 0) {
                            iM55680 = (i6 - C0873.m55680("ܿۨ")) * 85;
                            i8 = 974426473 ^ ((iM55680 ^ i7) * 28307);
                            i = -1956275002;
                        } else {
                            iM55680 = C0946.m55979("᩵᩶") ^ i7;
                            i8 = 481887178 ^ ((iM55680 ^ i6) * 30949);
                            i = -587565630;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case 443958886:
                    case 912630260:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        i3 = s + s3;
                        if (C0930.f81879 <= 0) {
                            iM55680 = C0873.m55680("ۘۡ") ^ i7;
                            i8 = (-179724711) ^ ((iM55680 ^ i6) * (-13627));
                            i = -1808318088;
                        } else {
                            iM55680 = (C0873.m55680("᩺֨") + i7) * 101;
                            i8 = (-315678281) ^ ((iM55680 ^ i6) * (-14695));
                            i = -110589909;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case 603294646:
                    case 1362638147:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        i2 = s * s2;
                        s3 = 4475;
                        if (RunnableC0897.f81856) {
                            iM55680 = (C0946.m55979("ۡ֡") ^ i6) * 35;
                            i8 = 983405192 ^ ((iM55680 ^ i7) * 6241);
                            i = 993245241;
                        } else {
                            iM55680 = C0873.m55680("ۨۜ") ^ i6;
                            i8 = (-1403149304) ^ ((iM55680 ^ i7) * 10255);
                            i = -163184796;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case 734813606:
                    case 1410916651:
                        i4 = 48635;
                        iM55680 = C0873.m55680("ܽ᩻") ^ i7;
                        i8 = (-796470786) ^ ((iM55680 ^ i6) * 28147);
                        i = -1715729952;
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case 1097777874:
                    case 2043283203:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        if ((i3 * i3) - i2 >= 0) {
                            iM55680 = (i6 - C0946.m55979("᩹ۨ")) * (-47);
                            i8 = 2143673470 ^ ((iM55680 ^ i7) * 421);
                            i = -280289525;
                        } else {
                            iM55680 = (C0873.m55680("ܺܽ") ^ i7) * 91;
                            i8 = 1255653634 ^ ((iM55680 ^ i6) * 30705);
                            i = -711984452;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        break;
                    case 1551801098:
                    case 1628782822:
                        if (C0992.f81922 < 0) {
                            c16496M43674 = c16496M43674;
                            i5 = i5;
                            iM55680 = C0946.m55979("ܳۤ") ^ i6;
                            i8 = 1171208743 ^ ((iM55680 ^ i7) * 17631);
                            i = -224320363;
                            i10 = i ^ iM55680;
                            c16496M43674 = c16496M43674;
                            i5 = i5;
                        } else {
                            iM55979 = C0946.m55979("᩵ܺ") ^ i7;
                            i8 = ((iM55979 ^ i6) * 17239) ^ 1847328810;
                            i9 = 1079087103;
                        }
                        break;
                    default:
                        c16496M43674 = c16496M43674;
                        i5 = i5;
                        if (C1036.f81953 >= 0) {
                            iM55680 = (i7 - C0946.m55979("۟۟")) * (-93);
                            i8 = 1564113113 ^ ((iM55680 ^ i6) * (-12087));
                            i = -83005183;
                        } else {
                            iM55680 = (C0946.m55979("ᩳ۟") ^ i6) * 15;
                            i8 = 1030129107 ^ ((iM55680 ^ i7) * (-9293));
                            i = 558593867;
                        }
                        i10 = i ^ iM55680;
                        c16496M43674 = c16496M43674;
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55979;
        int i;
        int i2;
        int i3 = RunnableC0938.f81886;
        int i4 = C1012.f81938;
        int iM55680 = C0873.m55680("ܰᩴ") ^ i4;
        int i5 = ((iM55680 ^ i3) * 22887) ^ 1376394178;
        String strM55970 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55680 ^ 1162261581;
        int i7 = 0;
        int iM559710 = 0;
        int i8 = 0;
        char c = 0;
        short s = 0;
        int i9 = 1420673366;
        short s2 = 0;
        Intent intent = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = 0;
        String strM55890 = null;
        String strM55810 = null;
        int i11 = 0;
        C18249 c18249 = null;
        ActivityC16811 activityC16811 = null;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i3) * 17127) >> 31));
            switch (i9) {
                case -2122429716:
                case -2086819983:
                    C0949.m56012();
                    int iM55681 = C0873.m55680("ܽ᩹") ^ i4;
                    i5 = ((iM55681 ^ i3) * 6695) ^ 885929740;
                    i6 = iM55681 ^ 1819090757;
                    break;
                case -2055486057:
                case -62655058:
                    strM55890 = C0930.m55890(c18249);
                    int i12 = ViewOnClickListenerC2730.f4575;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0873.m55680("᩶ᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * (-15113)) ^ (-109710258);
                        i2 = -1332728939;
                    } else {
                        iM55979 = (C0873.m55680("᩻᩶") + i4) * 45;
                        i = ((iM55979 ^ i3) * (-19685)) ^ 693791913;
                        i2 = -1677631703;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2054332341:
                case -852260224:
                    ServiceConnectionC1013.m56157();
                    if (C1012.m56134() <= 0) {
                        iM55979 = C0946.m55979("֡ܳ") ^ i3;
                        i = ((iM55979 ^ i4) * (-23761)) ^ (-21577011);
                        i2 = 278732916;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55682 = C0873.m55680("ܽ᩹") ^ i4;
                        i5 = ((iM55682 ^ i3) * 6695) ^ 885929740;
                        i6 = iM55682 ^ 1819090757;
                    }
                    break;
                case -1830444075:
                case 360525739:
                    i7 = iM559710 ^ i11;
                    strM55810 = C0906.m55810(f81855, 16, 3, i10);
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("֡᩶") ^ i3;
                        i = ((iM55979 ^ i4) * (-22155)) ^ (-2026536206);
                        i2 = -1716187033;
                    } else {
                        iM55979 = (C0873.m55680("ۖۖ") ^ i3) * 55;
                        i = ((iM55979 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1803442070:
                case 1617201507:
                    i10 = 13679;
                    iM55979 = C0946.m55979("ᩴ۬") ^ i4;
                    i = ((iM55979 ^ i3) * 24579) ^ (-1958183439);
                    i2 = -722241042;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1333202026:
                case 1666553261:
                    strM55970 = AbstractC0942.m55970(sArr, 9, 4, i10);
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("ۨ֨") ^ i4) * 67;
                        i = ((iM55979 ^ i3) * 25785) ^ (-258229231);
                        i2 = -1888672855;
                    } else {
                        iM55979 = (C0873.m55680("ۖۖ") ^ i3) * 55;
                        i = ((iM55979 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1269219031:
                case 92749315:
                    if (C0912.f81867 > 0) {
                        iM55979 = C0873.m55680("᩷᩵") ^ i4;
                        i = ((iM55979 ^ i3) * 27279) ^ 1208123951;
                        i2 = 2015666038;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55683 = C0873.m55680("ܽ᩹") ^ i4;
                        i5 = ((iM55683 ^ i3) * 6695) ^ 885929740;
                        i6 = iM55683 ^ 1819090757;
                    }
                    break;
                case -926950986:
                case -580803033:
                    int i13 = s + s2;
                    if ((67288 * s) - (i13 * i13) <= 0) {
                        iM55979 = (C0873.m55680("ܿۘ") + i3) * 109;
                        i = ((iM55979 ^ i4) * 30393) ^ (-1343271367);
                        i2 = 1068927848;
                    } else {
                        iM55979 = (C0946.m55979("ۨ᩷") ^ i4) * (-121);
                        i = ((iM55979 ^ i3) * 19675) ^ (-1159417744);
                        i2 = -38046085;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -646332751:
                case 690050671:
                    C0845.m55584();
                    break;
                case -589850335:
                case 1642338366:
                    ViewOnClickListenerC10107 viewOnClickListenerC10107 = this.f6751;
                    ActivityC16811 activityC16812 = viewOnClickListenerC10107.f28042;
                    RunnableC0897.m55775(activityC16812);
                    C18249 c182410 = viewOnClickListenerC10107.f28044;
                    if (C0892.f81851) {
                        int iM559711 = (C0946.m55979("֫ۗ") ^ i3) * (-103);
                        i6 = iM559711 ^ (-1312584808);
                        i5 = ((iM559711 ^ i4) * 20283) ^ 2023817171;
                        c18249 = c182410;
                        activityC16811 = activityC16812;
                    } else {
                        c18249 = c182410;
                        activityC16811 = activityC16812;
                        int iM55684 = C0873.m55680("ܽ᩹") ^ i4;
                        i5 = ((iM55684 ^ i3) * 6695) ^ 885929740;
                        i6 = iM55684 ^ 1819090757;
                    }
                    break;
                case -433951330:
                case 1889291119:
                    C0917.m55843(intent, C1044.m56276(sArr4, 1, 8, i10), strM55890);
                    sArr = f81855;
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("᩷᩵") ^ i4;
                        i = ((iM55979 ^ i3) * 27279) ^ 1208123951;
                        i2 = 2015666038;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩺") ^ i3;
                        i = ((iM55979 ^ i4) * 193) ^ 223601967;
                        i2 = 560716970;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -349135087:
                case -288235646:
                    intent.putExtra(strM55970, 0);
                    ServiceConnectionC1013.m56163(activityC16811, intent);
                    sArr2 = f81855;
                    i8 = 13;
                    if (C1194.m56396() <= 0) {
                        iM55979 = C0873.m55680("᩷᩵") ^ i4;
                        i = ((iM55979 ^ i3) * 27279) ^ 1208123951;
                        i2 = 2015666038;
                    } else {
                        iM55979 = (C0873.m55680("᩹ܳ") ^ i4) * (-117);
                        i = ((iM55979 ^ i3) * (-14957)) ^ (-387762826);
                        i2 = -1561515666;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -263055839:
                case 1215869129:
                    sArr3 = f81855;
                    c = 0;
                    if (C1036.m56257() <= 0) {
                        iM55979 = C0946.m55979("֡ܳ") ^ i3;
                        i = ((iM55979 ^ i4) * (-23761)) ^ (-21577011);
                        i2 = 278732916;
                    } else {
                        iM55979 = (C0946.m55979("ۗۛ") + i4) * (-103);
                        i = ((iM55979 ^ i3) * (-17765)) ^ 472005678;
                        i2 = 526520924;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -90108344:
                case -57418147:
                    C0912.m55833();
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("֡ܳ") ^ i3;
                        i = ((iM55979 ^ i4) * (-23761)) ^ (-21577011);
                        i2 = 278732916;
                    } else {
                        iM55979 = C0873.m55680("᩶ᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * (-15113)) ^ (-109710258);
                        i2 = -1332728939;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -5210847:
                case 568203279:
                    i10 = 59587;
                    iM55979 = C0946.m55979("ᩴ۬") ^ i4;
                    i = ((iM55979 ^ i3) * 24579) ^ (-1958183439);
                    i2 = -722241042;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 139855800:
                case 1455275689:
                    activityC16811.overridePendingTransition(i7, C0873.m55680(strM55810) ^ 2098887614);
                    break;
                case 991253360:
                case 1794205436:
                    s = sArr3[c];
                    s2 = 16822;
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("ۖۖ") ^ i3) * 55;
                        i = ((iM55979 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    } else {
                        iM55979 = (C0946.m55979("ᩳۖ") + i3) * (-89);
                        i = ((iM55979 ^ i4) * 31375) ^ (-1432648340);
                        i2 = -1681499460;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1182971704:
                case 1227466286:
                    intent = new Intent(activityC16811, (Class<?>) ViewOnClickListenerC2730.class);
                    sArr4 = f81855;
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ۖۖ") ^ i3) * 55;
                        i = ((iM55979 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    } else {
                        iM55979 = (C0873.m55680("ܰ᩷") ^ i3) * (-27);
                        i = ((iM55979 ^ i4) * (-21289)) ^ 883633694;
                        i2 = 2066259743;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    iM559710 = C0946.m55979(C1964.m56584(sArr2, i8, 3, i10));
                    i11 = 2125861545;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0873.m55680("ۖۖ") ^ i3) * 55;
                        i = ((iM55979 ^ i4) * 17385) ^ 1762044939;
                        i2 = -1385739506;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩶᩻")) * 29;
                        i = ((iM55979 ^ i4) * 9087) ^ (-1389307047);
                        i2 = -1827834662;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C3401(ViewOnClickListenerC10107 viewOnClickListenerC10107) {
        this.f6751 = viewOnClickListenerC10107;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C1017.m56184(this, this.f6751.f28042);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C0854.m55601(this);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ViewOnClickListenerC10107 viewOnClickListenerC10107 = null;
        int i = 178052643;
        int i2 = C1964.f83032;
        int i3 = RunnableC1014.f81941;
        int iM55979 = (C0946.m55979("֨᩸") + i2) * 87;
        int i4 = ((iM55979 ^ i3) * 9919) ^ (-2054575564);
        int i5 = 339002659;
        while (true) {
            i = ((((i ^ i3) * (-22539)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1813603084:
                case -74702291:
                    C0917.m55854();
                    C0892.m55749();
                    break;
                case -1731164442:
                case -68261444:
                    if (RunnableC0897.f81856) {
                        iM55979 = (i2 - C0873.m55680("ܿۘ")) * (-123);
                        i4 = ((iM55979 ^ i3) * 19735) ^ 996593944;
                        i5 = 260107309;
                    } else {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i3) * (-21);
                        i4 = ((iM55979 ^ i2) * 7235) ^ (-154580821);
                        i5 = -38656382;
                    }
                    break;
                case -1612250964:
                case -719990032:
                    if (C0946.m55980() != 0) {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i3) * (-21);
                        i4 = ((iM55979 ^ i2) * 7235) ^ (-154580821);
                        i5 = -38656382;
                    } else {
                        iM55979 = C0946.m55979("᩸ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6227)) ^ (-622621334);
                        i5 = -113676043;
                    }
                    break;
                case -1333955554:
                case 1693585487:
                    ServiceConnectionC1013.m56157();
                    if (C1017.m56187() <= 0) {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i3) * (-21);
                        i4 = ((iM55979 ^ i2) * 7235) ^ (-154580821);
                        i5 = -38656382;
                    } else {
                        iM55979 = C0946.m55979("᩵᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6683)) ^ 2032346898;
                        i5 = -1509501770;
                    }
                    break;
                case -1118955128:
                case 961211999:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("᩵᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6683)) ^ 2032346898;
                        i5 = -1509501770;
                    } else {
                        iM55979 = C0946.m55979("֫᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2965)) ^ (-113243285);
                        i5 = -1258302090;
                    }
                    break;
                case -884333409:
                case 714851929:
                    C1044.m56272(viewOnClickListenerC10107.f28042, exc, null);
                    break;
                case -610710710:
                case 1147087350:
                    if (C0917.f81868) {
                        iM55979 = (i3 - C0873.m55680("᩸ܺ")) * (-99);
                        i4 = ((iM55979 ^ i2) * (-2443)) ^ (-89705741);
                        i5 = 1837337225;
                    } else {
                        iM55979 = (C0946.m55979("ۡܽ") ^ i2) * (-45);
                        i4 = ((iM55979 ^ i3) * (-28747)) ^ 637602807;
                        i5 = 1002212229;
                    }
                    break;
                case -562310958:
                case 811044056:
                    if (C0946.f81894 != 0) {
                        iM55979 = (i3 - C0873.m55680("᩸ܺ")) * (-99);
                        i4 = ((iM55979 ^ i2) * (-2443)) ^ (-89705741);
                        i5 = 1837337225;
                    } else {
                        iM55979 = (C0873.m55680("ܽ۬") + i2) * (-39);
                        i4 = ((iM55979 ^ i3) * (-25531)) ^ (-182229063);
                        i5 = -1456331913;
                    }
                    break;
                case -539491943:
                case -1361059:
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("ܳ᩻") ^ i2) * 45;
                        i4 = ((iM55979 ^ i3) * 9271) ^ (-543205431);
                        i5 = 865098949;
                    } else {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i3) * (-21);
                        i4 = ((iM55979 ^ i2) * 7235) ^ (-154580821);
                        i5 = -38656382;
                    }
                    break;
                case -218896947:
                case 1250147562:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("᩹ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17517) ^ (-1844613214);
                        i5 = 920700941;
                    } else {
                        iM55979 = (C0873.m55680("ۤ۬") ^ i2) * (-21);
                        i4 = ((iM55979 ^ i3) * (-22831)) ^ 728650425;
                        i5 = -822253471;
                    }
                    break;
                case 333055039:
                case 1854997006:
                    if (C0917.m55854()) {
                        iM55979 = (C0873.m55680("ۙۤ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i2) * (-29421)) ^ 750277381;
                        i5 = 1063195109;
                    } else {
                        iM55979 = C0873.m55680("᩹ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17517) ^ (-1844613214);
                        i5 = 920700941;
                    }
                    break;
                case 350295369:
                case 1324423318:
                    C1048.m56305();
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("᩵᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6683)) ^ 2032346898;
                        i5 = -1509501770;
                    } else {
                        iM55979 = (C0873.m55680("ܽۘ") + i2) * (-27);
                        i4 = ((iM55979 ^ i3) * 24093) ^ (-679940418);
                        i5 = -527919416;
                    }
                    break;
                case 1335748405:
                case 1521646936:
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0873.m55680("᩹ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17517) ^ (-1844613214);
                        i5 = 920700941;
                    } else {
                        iM55979 = C0873.m55680("ܿܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27815) ^ 1591964595;
                        i5 = -1080952146;
                    }
                    break;
                case 1453639976:
                case 1460226747:
                    C0861.m55626();
                    if (C1964.f83032 <= 0) {
                        iM55979 = (i3 - C0873.m55680("᩸ܺ")) * (-99);
                        i4 = ((iM55979 ^ i2) * (-2443)) ^ (-89705741);
                        i5 = 1837337225;
                    } else {
                        iM55979 = C0946.m55979("᩵᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6683)) ^ 2032346898;
                        i5 = -1509501770;
                    }
                    break;
                case 1668584725:
                case 1937207399:
                    viewOnClickListenerC10107 = this.f6751;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("᩹ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17517) ^ (-1844613214);
                        i5 = 920700941;
                    } else {
                        iM55979 = C0873.m55680("ۜܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19611) ^ 1941317110;
                        i5 = 1265750058;
                    }
                    break;
                default:
                    C0866.m55645();
                    C0890.m55740();
                    iM55979 = C0946.m55979("᩵᩶") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-6683)) ^ 2032346898;
                    i5 = -1509501770;
                    break;
            }
            return;
        }
    }
}
