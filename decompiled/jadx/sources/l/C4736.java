package l;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4736 implements InterfaceC16610, InterfaceC7550, CanvasCompat.CanvasOperation {

    /* JADX INFO: renamed from: ᩺ܶ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f15021 = {6174, -13838, -13826, -27827, 21797, 22011};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15022;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15023;

    public /* synthetic */ C4736(int i, Object obj) {
        int i2 = 422934627;
        int i3 = C3245.f10203;
        int i4 = C1294.f4556;
        this.f15022 = i;
        this.f15023 = obj;
        int iM2566 = C0630.m2566("ۢ֨") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-21075)) ^ 1691439300;
        int i6 = -1961328555;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i3) * 25491) >> 31));
            switch (i2) {
                case -2000591437:
                case -641846871:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("۫ۡ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-10803)) ^ (-1156583045);
                        i6 = 1521353286;
                    }
                    break;
                case -1610468516:
                case 129250730:
                    return;
                case -1577783870:
                case 1607249882:
                    C3663.m11168();
                    C1711.m5736();
                    break;
                case -1577444067:
                case 605089144:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ܰ۠") ^ i3;
                        i5 = ((iM2566 ^ i4) * 26247) ^ (-266384577);
                        i6 = -1430726549;
                    } else {
                        iM2566 = (C2105.m6981("ۢ۫") + i4) * (-117);
                        i5 = ((iM2566 ^ i3) * 8319) ^ (-714373222);
                        i6 = 118760790;
                        continue;
                    }
                    break;
                case -1317941888:
                case 145704316:
                    C1711.m5736();
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("ۛܰ") + i4) * (-125);
                        i5 = ((iM2566 ^ i3) * 18257) ^ 1460020816;
                        i6 = 698820706;
                    }
                    break;
                case -476407232:
                case 661944658:
                    C1005.m3501();
                    C0798.m2998();
                    throw new RuntimeException();
                default:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C0630.m2566("ۜۡ") + i3) * 27;
                        i5 = ((iM2566 ^ i4) * (-17571)) ^ (-965159688);
                        i6 = -1437844349;
                    }
                    break;
            }
            iM2566 = (C2105.m6981("֫᩻") + i3) * (-127);
            i5 = ((iM2566 ^ i4) * 10541) ^ 1183009125;
            i6 = -1038307382;
        }
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        int i = -409124730;
        int i2 = C2958.f9394;
        int i3 = C22628.f73083;
        int iM6981 = C2105.m6981("֡ᩳ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-4499)) ^ 1176261818;
        int i5 = 1740979394;
        while (true) {
            i = ((((i ^ i2) * (-13717)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2096745308:
                case -877666999:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("۫ۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5417) ^ 1853514260;
                        i5 = 1706905382;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۨ֨")) * 5;
                        i4 = ((iM6981 ^ i2) * (-12371)) ^ (-1640136071);
                        i5 = 1408746321;
                    }
                    break;
                case -1977204891:
                case 1348375689:
                    C7811.m20844();
                    iM6981 = C0630.m2566("᩸ۨ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-19005)) ^ (-1358845843);
                    i5 = -876264693;
                    break;
                case -1947569145:
                case -228066272:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C0630.m2566("۫᩶") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۨۙ")) * 45;
                        i4 = ((iM6981 ^ i3) * 18639) ^ (-1818405842);
                        i5 = -1778408822;
                    }
                    break;
                case -1875224342:
                case -915193848:
                    C1916.m6308();
                    if (C0630.f2410 > 0) {
                        iM6981 = (C0630.m2566("ᩴۘ") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 18479) ^ (-390832154);
                        i5 = -978241090;
                    } else {
                        iM6981 = (C0630.m2566("۫᩶") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    }
                    break;
                case -1772785625:
                case -577575341:
                    C1005.m3501();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = (C0630.m2566("۫᩶") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    } else {
                        iM6981 = C0630.m2566("᩸ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-19005)) ^ (-1358845843);
                        i5 = -876264693;
                    }
                    break;
                case -1725887946:
                case -1242832300:
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("۫۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15039)) ^ 1506693900;
                        i5 = 958568561;
                    } else {
                        iM6981 = (C0630.m2566("ᩴۘ") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 18479) ^ (-390832154);
                        i5 = -978241090;
                    }
                    break;
                case -1714014401:
                case -1708983505:
                    ((MaskableFrameLayout) this.f15023).lambda$dispatchDraw$1(canvas);
                    break;
                case -867230392:
                case 651882466:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27681)) ^ 1769468617;
                        i5 = 122054673;
                    } else {
                        iM6981 = (C0630.m2566("۫᩶") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    }
                    break;
                case -857555857:
                case 1044057756:
                    ((NavigationView) this.f15023).lambda$dispatchDraw$0(canvas);
                    break;
                case -560531897:
                case 1938144687:
                    if (C2105.f7037 == 0) {
                        iM6981 = C2105.m6981("۫ۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5417) ^ 1853514260;
                        i5 = 1706905382;
                    } else {
                        iM6981 = C0630.m2566("᩸ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-19005)) ^ (-1358845843);
                        i5 = -876264693;
                    }
                    break;
                case 460826837:
                case 1331542671:
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("۫ۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5417) ^ 1853514260;
                        i5 = 1706905382;
                    } else {
                        iM6981 = (C0630.m2566("ۗ᩺") ^ i3) * (-87);
                        i4 = ((iM6981 ^ i2) * 32285) ^ 1597802782;
                        i5 = -105453886;
                    }
                    break;
                case 723699341:
                case 1055171308:
                    C1916.m6308();
                    C4159.m12565();
                    break;
                case 893933310:
                case 1489881917:
                    if (C0714.f2697 >= 0) {
                        iM6981 = C0630.m2566("۬ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15481) ^ 238192040;
                        i5 = 1696096019;
                    } else {
                        iM6981 = C0630.m2566("۟ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-29457)) ^ 1004736962;
                        i5 = 934750;
                    }
                    break;
                case 904765013:
                case 1926096179:
                    switch (this.f15022) {
                        case 2:
                            iM6981 = C2105.m6981("ܶܺ") ^ i2;
                            i4 = ((iM6981 ^ i3) * 19453) ^ 417088480;
                            i5 = 1827933036;
                            break;
                        default:
                            iM6981 = (i3 - C0630.m2566("ܽ᩹")) * 31;
                            i4 = ((iM6981 ^ i2) * (-12773)) ^ 1357878473;
                            i5 = -1201374651;
                            break;
                    }
                    break;
                case 1049206879:
                case 1587352830:
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C0630.m2566("ᩴۘ") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 18479) ^ (-390832154);
                        i5 = -978241090;
                    } else {
                        iM6981 = C2105.m6981("۫ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24071)) ^ (-1736675866);
                        i5 = -1166044944;
                    }
                    break;
                case 1378284243:
                case 1795094375:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C0630.m2566("ᩴۘ") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 18479) ^ (-390832154);
                        i5 = -978241090;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩻ۗ")) * (-25);
                        i4 = ((iM6981 ^ i2) * 27331) ^ (-1033592360);
                        i5 = 1902785657;
                    }
                    break;
                case 1446699426:
                case 1577639495:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("᩸ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-19005)) ^ (-1358845843);
                        i5 = -876264693;
                    } else {
                        iM6981 = C2105.m6981("᩵۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 18925) ^ 616158660;
                        i5 = 1086981065;
                    }
                    break;
                default:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C0630.m2566("۫᩶") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    } else {
                        iM6981 = C2105.m6981("ۗ۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5675) ^ (-1686196120);
                        i5 = -1066772836;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0382 A[PHI: r3 r12 r13 r14 r17 r18 r19 r21 r25
      0x0382: PHI (r3v45 java.lang.String) = (r3v28 java.lang.String), (r3v44 java.lang.String), (r3v46 java.lang.String) binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r12v6 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r13v6 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r14v6 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char) binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r18v3 short) = (r18v2 short), (r18v2 short), (r18v4 short) binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v4 int) binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r21v11 l.ۤۗ᩷) = (r21v7 l.ۤۗ᩷), (r21v10 l.ۤۗ᩷), (r21v12 l.ۤۗ᩷) binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r25v36 android.content.SharedPreferences) = 
      (r25v22 android.content.SharedPreferences)
      (r25v35 android.content.SharedPreferences)
      (r25v37 android.content.SharedPreferences)
     binds: [B:36:0x0120, B:83:0x0380, B:79:0x035c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC7550
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo7073(C2095 c2095) {
        int i;
        int iM6981;
        int i2;
        C10032 c10032;
        SharedPreferences sharedPreferences;
        String str;
        short[] sArr;
        int iM6982;
        int i3;
        int iM6983;
        int i4;
        int i5;
        SharedPreferences sharedPreferences2;
        int i6 = 1853383215;
        int i7 = ServiceConnectionC3453.f10921;
        int i8 = C0483.f2088;
        int iM2566 = (i7 - C0630.m2566("۬ۘ")) * (-57);
        int i9 = ((iM2566 ^ i8) * (-8533)) ^ (-541875747);
        int i10 = iM2566 ^ 786795586;
        SharedPreferences sharedPreferencesM11313 = null;
        String strM6911 = null;
        ArrayList arrayList = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        C10032 c10033 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 0;
        int i18 = 0;
        String[] strArrM22131 = null;
        String strM20837 = null;
        int i19 = 0;
        Context contextM6886 = null;
        int i20 = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * 7867) >> 31));
            switch (i6) {
                case -2073986671:
                case 555208709:
                    C0422.m1963();
                    if (!C2272.f7362) {
                        sArr = sArr2;
                        sharedPreferences = sharedPreferencesM11313;
                        str = strM6911;
                        c10032 = c10033;
                        iM6982 = (i8 - C0630.m2566("ۖۛ")) * (-65);
                        sArr2 = sArr;
                        i9 = ((iM6982 ^ i7) * (-28785)) ^ 1409366544;
                        i3 = -2061021416;
                        int i21 = iM6982 ^ i3;
                        strM6911 = str;
                        sharedPreferences2 = sharedPreferences;
                        i10 = i21;
                        c10033 = c10032;
                        sharedPreferencesM11313 = sharedPreferences2;
                    } else {
                        int iM6984 = C2105.m6981("ۚۚ") ^ i7;
                        i9 = ((iM6984 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM6984 ^ 1494799323;
                    }
                    break;
                case -2060082710:
                case 714056024:
                    sArr3 = f15021;
                    i14 = 1;
                    i15 = 2;
                    if (C22628.m50615() == 0) {
                        iM6981 = (i8 - C2105.m6981("ܺۨ")) * (-61);
                        i = ((iM6981 ^ i7) * 11105) ^ (-2029917681);
                        i2 = 2142314569;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        sharedPreferencesM11313 = sharedPreferencesM11313;
                        strM6911 = strM6911;
                        c10032 = c10033;
                        iM6983 = (i8 - C2105.m6981("ۤ᩷")) * 87;
                        i4 = ((iM6983 ^ i7) * 12557) ^ 658350580;
                        i5 = -173575019;
                        int i22 = iM6983 ^ i5;
                        strM6911 = strM6911;
                        sharedPreferences2 = sharedPreferencesM11313;
                        i10 = i22;
                        i9 = i4;
                        c10033 = c10032;
                        sharedPreferencesM11313 = sharedPreferences2;
                    }
                    break;
                case -1658463009:
                case -84863153:
                    sharedPreferencesM11313 = sharedPreferencesM11313;
                    strM6911 = strM6911;
                    c10032 = c10033;
                    c = 0;
                    if (C1916.m6308() >= 0) {
                        iM6983 = (i8 - C2105.m6981("ۤ᩷")) * 87;
                        i4 = ((iM6983 ^ i7) * 12557) ^ 658350580;
                        i5 = -173575019;
                    } else {
                        iM6983 = C2105.m6981("۬᩹") ^ i7;
                        i4 = ((iM6983 ^ i8) * (-16491)) ^ 1715271352;
                        i5 = 1919157345;
                    }
                    int i23 = iM6983 ^ i5;
                    strM6911 = strM6911;
                    sharedPreferences2 = sharedPreferencesM11313;
                    i10 = i23;
                    i9 = i4;
                    c10033 = c10032;
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case -1634533348:
                case -1190267918:
                    sharedPreferencesM11313 = sharedPreferencesM11313;
                    strM6911 = strM6911;
                    c10032 = c10033;
                    s = sArr2[c];
                    i17 = s + 1;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6983 = (i8 - C2105.m6981("ۤ᩷")) * 87;
                        i4 = ((iM6983 ^ i7) * 12557) ^ 658350580;
                        i5 = -173575019;
                    } else {
                        iM6983 = C0630.m2566("ۖ۟") ^ i8;
                        i4 = ((iM6983 ^ i7) * (-13161)) ^ 1186606142;
                        i5 = -755991831;
                    }
                    int i24 = iM6983 ^ i5;
                    strM6911 = strM6911;
                    sharedPreferences2 = sharedPreferencesM11313;
                    i10 = i24;
                    i9 = i4;
                    c10033 = c10032;
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case -1493484429:
                case -925824693:
                    if (C3019.m9256(arrayList)) {
                        iM6981 = C0630.m2566("ܽᩳ") ^ i7;
                        i = ((iM6981 ^ i8) * (-12327)) ^ (-518917444);
                        i2 = 577297411;
                    } else {
                        iM6981 = (C2105.m6981("ܽۖ") ^ i8) * 35;
                        i = ((iM6981 ^ i7) * 10983) ^ (-2111880416);
                        i2 = -1418814538;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1458059703:
                case 888024464:
                    i13 = 33491;
                    iM6983 = (i8 - C0630.m2566("ۤᩴ")) * (-83);
                    c10032 = c10033;
                    i4 = ((iM6983 ^ i7) * (-10589)) ^ 406961689;
                    i5 = 1341182176;
                    int i25 = iM6983 ^ i5;
                    strM6911 = strM6911;
                    sharedPreferences2 = sharedPreferencesM11313;
                    i10 = i25;
                    i9 = i4;
                    c10033 = c10032;
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case -1418025034:
                case 1516118166:
                    return TextUtils.join(C1005.m3502(sArr3, i14, i15, i13), arrayList);
                case -1404077258:
                case 303967070:
                    sharedPreferences = sharedPreferencesM11313;
                    str = strM6911;
                    c10032 = c10033;
                    sArr = f15021;
                    if (C11340.f33930 >= 0) {
                        iM6982 = (i8 - C0630.m2566("ۖۛ")) * (-65);
                        sArr2 = sArr;
                        i9 = ((iM6982 ^ i7) * (-28785)) ^ 1409366544;
                        i3 = -2061021416;
                    } else {
                        iM6982 = (C2105.m6981("ܶ᩵") + i8) * 115;
                        sArr2 = sArr;
                        i9 = ((iM6982 ^ i7) * (-1365)) ^ (-1575027550);
                        i3 = -1603654599;
                    }
                    int i26 = iM6982 ^ i3;
                    strM6911 = str;
                    sharedPreferences2 = sharedPreferences;
                    i10 = i26;
                    c10033 = c10032;
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case -1374942812:
                case -585500070:
                    C0483.m2121();
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ܶ᩷") ^ i7;
                        i = ((iM6981 ^ i8) * (-20189)) ^ 1391658656;
                        i2 = 694767332;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        int iM6985 = C2105.m6981("ۚۚ") ^ i7;
                        i9 = ((iM6985 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM6985 ^ 1494799323;
                    }
                    break;
                case -1276707243:
                case 336691615:
                    if (i20 < 3) {
                        iM6981 = (C2105.m6981("ܺ۬") + i7) * 37;
                        i = ((iM6981 ^ i8) * 11467) ^ 1193359822;
                        i2 = -500950724;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۛۙ")) * 123;
                        i = ((iM6981 ^ i8) * 4897) ^ 1482363261;
                        i2 = 308842477;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1242563093:
                case 79555655:
                    C0050.m940();
                    sharedPreferencesM11313 = sharedPreferencesM11313;
                    strM6911 = strM6911;
                    c10032 = c10033;
                    iM6983 = C2105.m6981("ܳ᩺") ^ i8;
                    i4 = ((iM6983 ^ i7) * 1455) ^ (-1524322354);
                    i5 = -1487523010;
                    int i27 = iM6983 ^ i5;
                    strM6911 = strM6911;
                    sharedPreferences2 = sharedPreferencesM11313;
                    i10 = i27;
                    i9 = i4;
                    c10033 = c10032;
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case -1197727789:
                case 2001750497:
                    return C0422.m1958(contextM6886, C0630.m2566(strM20837) ^ 2121640330);
                case -979484267:
                case 419646371:
                    C0050.m940();
                    if (C0483.f2088 >= 0) {
                        int iM6986 = C2105.m6981("ۚۚ") ^ i7;
                        i9 = ((iM6986 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM6986 ^ 1494799323;
                    } else {
                        sharedPreferencesM11313 = sharedPreferencesM11313;
                        strM6911 = strM6911;
                        c10032 = c10033;
                        iM6983 = C2105.m6981("ܳ᩺") ^ i8;
                        i4 = ((iM6983 ^ i7) * 1455) ^ (-1524322354);
                        i5 = -1487523010;
                        int i28 = iM6983 ^ i5;
                        strM6911 = strM6911;
                        sharedPreferences2 = sharedPreferencesM11313;
                        i10 = i28;
                        i9 = i4;
                        c10033 = c10032;
                        sharedPreferencesM11313 = sharedPreferences2;
                    }
                    break;
                case -937608229:
                case 1688721093:
                    SharedPreferences sharedPreferences3 = sharedPreferencesM11313;
                    strM6911 = c10033.m6911();
                    i12 = 0;
                    if (C1128.m3851() > 0) {
                        int iM2567 = C0630.m2566("᩹ۚ") ^ i7;
                        i = ((iM2567 ^ i8) * (-22615)) ^ (-360826455);
                        sharedPreferencesM11313 = sharedPreferences3;
                        i10 = iM2567 ^ 930015808;
                        i9 = i;
                    } else {
                        sharedPreferencesM11313 = sharedPreferences3;
                        int iM6987 = C2105.m6981("ۚۚ") ^ i7;
                        i9 = ((iM6987 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM6987 ^ 1494799323;
                    }
                    break;
                case -828386395:
                case 1717126852:
                    contextM6886 = c10033.m6886();
                    sArr4 = f15021;
                    i11 = 3;
                    if (C3432.f10845 < 0) {
                        iM6981 = C2105.m6981("ۨ֨") ^ i7;
                        i = ((iM6981 ^ i8) * (-1743)) ^ (-113780560);
                        i2 = 212464058;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr2;
                        sharedPreferences = sharedPreferencesM11313;
                        str = strM6911;
                        c10032 = c10033;
                        iM6982 = (i8 - C0630.m2566("ۖۛ")) * (-65);
                        sArr2 = sArr;
                        i9 = ((iM6982 ^ i7) * (-28785)) ^ 1409366544;
                        i3 = -2061021416;
                        int i29 = iM6982 ^ i3;
                        strM6911 = str;
                        sharedPreferences2 = sharedPreferences;
                        i10 = i29;
                        c10033 = c10032;
                        sharedPreferencesM11313 = sharedPreferences2;
                    }
                    break;
                case -673816325:
                case -400022825:
                    String str2 = strM6911;
                    c10033 = (C10032) this.f15023;
                    sharedPreferencesM11313 = c10033.m11313();
                    if (C2105.f7037 != 0) {
                        strM6911 = str2;
                        int iM6988 = C2105.m6981("ۚۚ") ^ i7;
                        i9 = ((iM6988 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM6988 ^ 1494799323;
                    } else {
                        int iM6989 = (C2105.m6981("ᩳۙ") ^ i7) * 109;
                        strM6911 = str2;
                        i10 = iM6989 ^ 740379557;
                        i9 = ((iM6989 ^ i8) * 8943) ^ (-108304979);
                        c10033 = c10033;
                    }
                    break;
                case -610655055:
                case 1958987994:
                    SharedPreferences sharedPreferences4 = sharedPreferencesM11313;
                    strM6911 = strM6911;
                    i19 = sharedPreferences4.getInt(strM6911, i12);
                    strArrM22131 = C8453.m22131(c10033.m6886());
                    if (C11340.f33930 >= 0) {
                        sharedPreferencesM11313 = sharedPreferences4;
                        c10032 = c10033;
                        iM6983 = C2105.m6981("ܳ᩺") ^ i8;
                        i4 = ((iM6983 ^ i7) * 1455) ^ (-1524322354);
                        i5 = -1487523010;
                        int i210 = iM6983 ^ i5;
                        strM6911 = strM6911;
                        sharedPreferences2 = sharedPreferencesM11313;
                        i10 = i210;
                        i9 = i4;
                        c10033 = c10032;
                    } else {
                        int iM2568 = C0630.m2566("֨ۗ") ^ i8;
                        i9 = ((iM2568 ^ i7) * (-12843)) ^ (-1364213241);
                        strM6911 = strM6911;
                        sharedPreferences2 = sharedPreferences4;
                        i10 = iM2568 ^ (-776554574);
                    }
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case -573324522:
                case 1246808667:
                    if (((1 << i20) & i19) != 0) {
                        iM6981 = (C0630.m2566("۫ۤ") ^ i7) * (-21);
                        i = ((iM6981 ^ i8) * (-625)) ^ 81117725;
                        i2 = 1814643374;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩸") ^ i8;
                        i = ((iM6981 ^ i7) * 20385) ^ (-141953960);
                        i2 = -509511465;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -530653430:
                case 87503609:
                    strM20837 = C7811.m20837(sArr4, i11, 3, i13);
                    if (C1916.m6308() < 0) {
                        iM6981 = C2105.m6981("֨ܶ") ^ i8;
                        i = ((iM6981 ^ i7) * 755) ^ 363892501;
                        i2 = -1468814996;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr2;
                        sharedPreferences = sharedPreferencesM11313;
                        str = strM6911;
                        c10032 = c10033;
                        iM6982 = (i8 - C0630.m2566("ۖۛ")) * (-65);
                        sArr2 = sArr;
                        i9 = ((iM6982 ^ i7) * (-28785)) ^ 1409366544;
                        i3 = -2061021416;
                        int i211 = iM6982 ^ i3;
                        strM6911 = str;
                        sharedPreferences2 = sharedPreferences;
                        i10 = i211;
                        c10033 = c10032;
                        sharedPreferencesM11313 = sharedPreferences2;
                    }
                    break;
                case -375518785:
                case 1048762225:
                    i20++;
                    iM6981 = (C0630.m2566("᩵۠") + i8) * (-87);
                    i = ((iM6981 ^ i7) * 5445) ^ 360415180;
                    i2 = -1711125909;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -140452317:
                case 564995285:
                    sharedPreferencesM11313 = sharedPreferencesM11313;
                    strM6911 = strM6911;
                    c10032 = c10033;
                    if (i18 - (i16 + 1) >= 0) {
                        iM6983 = (C2105.m6981("ܳۖ") + i7) * (-69);
                        i4 = ((iM6983 ^ i8) * 21575) ^ (-1303391650);
                        i5 = -630456653;
                    } else {
                        iM6983 = C2105.m6981("ۛܿ") ^ i8;
                        i4 = ((iM6983 ^ i7) * (-29637)) ^ 918359540;
                        i5 = -338845609;
                    }
                    int i212 = iM6983 ^ i5;
                    strM6911 = strM6911;
                    sharedPreferences2 = sharedPreferencesM11313;
                    i10 = i212;
                    i9 = i4;
                    c10033 = c10032;
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case -91806542:
                case 1145604706:
                    i13 = 51678;
                    iM6983 = (i8 - C0630.m2566("ۤᩴ")) * (-83);
                    c10032 = c10033;
                    i4 = ((iM6983 ^ i7) * (-10589)) ^ 406961689;
                    i5 = 1341182176;
                    int i213 = iM6983 ^ i5;
                    strM6911 = strM6911;
                    sharedPreferences2 = sharedPreferencesM11313;
                    i10 = i213;
                    i9 = i4;
                    c10033 = c10032;
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case 231994915:
                case 586407595:
                    sharedPreferencesM11313 = sharedPreferencesM11313;
                    strM6911 = strM6911;
                    c10032 = c10033;
                    i18 = i17 * i17;
                    i16 = s * 2;
                    if (C4616.m13552() != 0) {
                        iM6983 = C2105.m6981("ܳ᩺") ^ i8;
                        i4 = ((iM6983 ^ i7) * 1455) ^ (-1524322354);
                        i5 = -1487523010;
                    } else {
                        iM6983 = C0630.m2566("ۧܺ") ^ i7;
                        i4 = ((iM6983 ^ i8) * (-16379)) ^ 899386806;
                        i5 = -849736554;
                    }
                    int i214 = iM6983 ^ i5;
                    strM6911 = strM6911;
                    sharedPreferences2 = sharedPreferencesM11313;
                    i10 = i214;
                    i9 = i4;
                    c10033 = c10032;
                    sharedPreferencesM11313 = sharedPreferences2;
                    break;
                case 244668318:
                case 2131682325:
                    arrayList = new ArrayList();
                    i20 = i12;
                    iM6981 = (C0630.m2566("᩵۠") + i8) * (-87);
                    i = ((iM6981 ^ i7) * 5445) ^ 360415180;
                    i2 = -1711125909;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 1319176632:
                case 2020973722:
                    C1916.m6308();
                    return null;
                default:
                    C1916.m6307(arrayList, strArrM22131[i20]);
                    iM6981 = C0630.m2566("ܳ᩸") ^ i8;
                    i = ((iM6981 ^ i7) * 20385) ^ (-141953960);
                    i2 = -509511465;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013d A[PHI: r3 r4 r5 r6 r7 r8 r9 r17
      0x013d: PHI (r3v3 l.ۧ۬) = (r3v2 l.ۧ۬), (r3v1 l.ۧ۬), (r3v1 l.ۧ۬) binds: [B:42:0x013b, B:38:0x0116, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:42:0x013b, B:38:0x0116, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r5v3 l.ۧ۬) = (r5v1 l.ۧ۬), (r5v2 l.ۧ۬), (r5v1 l.ۧ۬) binds: [B:42:0x013b, B:38:0x0116, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:42:0x013b, B:38:0x0116, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r7v2 int) = (r7v1 int), (r7v1 int), (r7v3 int) binds: [B:42:0x013b, B:38:0x0116, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v3 int) binds: [B:42:0x013b, B:38:0x0116, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v3 int) binds: [B:42:0x013b, B:38:0x0116, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r17v12 int) = (r17v10 int), (r17v11 int), (r17v13 int) binds: [B:42:0x013b, B:38:0x0116, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0223 A[PHI: r12 r13 r17
      0x0223: PHI (r12v2 android.view.ViewGroup$LayoutParams) = 
      (r12v1 android.view.ViewGroup$LayoutParams)
      (r12v1 android.view.ViewGroup$LayoutParams)
      (r12v1 android.view.ViewGroup$LayoutParams)
      (r12v4 android.view.ViewGroup$LayoutParams)
     binds: [B:57:0x01db, B:11:0x004c, B:6:0x003e, B:85:0x0223] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v4 int) binds: [B:57:0x01db, B:11:0x004c, B:6:0x003e, B:85:0x0223] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r17v20 int) = (r17v7 int), (r17v8 int), (r17v9 int), (r17v23 int) binds: [B:57:0x01db, B:11:0x004c, B:6:0x003e, B:85:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC16610
    public C21610 onApplyWindowInsets(View view, C21610 c21610) {
        int i;
        int iM2566;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C21610 c21611 = c21610;
        View view2 = null;
        C11007 c11007M48815 = null;
        int i8 = 0;
        C11007 c11007M48816 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM11932 = 0;
        int i13 = 0;
        ViewGroup.LayoutParams layoutParamsM20836 = null;
        int i14 = 0;
        int i15 = 86429566;
        int i16 = C3746.f11829;
        int i17 = C5695.f17556;
        int iM6981 = (C2105.m6981("᩺ۡ") + i17) * (-111);
        int i18 = ((iM6981 ^ i16) * 30869) ^ (-1164177758);
        int i19 = iM6981 ^ 1299015604;
        Object obj = null;
        while (true) {
            int i20 = i19 ^ (i18 & (((i15 ^ i16) * 12147) >> 31));
            switch (i20) {
                case -2131654930:
                case 1627017965:
                    i = i20;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("᩵ۨ") ^ i17;
                        i18 = ((iM2566 ^ i16) * 743) ^ 1330833323;
                        i2 = -381864642;
                    } else {
                        iM2566 = (C0630.m2566("ۧۙ") ^ i16) * 45;
                        i18 = ((iM2566 ^ i17) * (-5657)) ^ 1503787021;
                        i2 = -190233981;
                    }
                    i6 = iM2566 ^ i2;
                    i15 = i;
                    i19 = i6;
                    c21611 = c21610;
                    break;
                case -2059376945:
                case -305884413:
                    i = i20;
                    iM11932 = C3911.m11932(i11, i12);
                    i13 = 0;
                    if (C0237.f1507 == 0) {
                        iM2567 = C2105.m6981("ܿ᩸") ^ i17;
                        i3 = ((iM2567 ^ i16) * 14659) ^ (-480859906);
                        i4 = -700075558;
                        i7 = i;
                        i19 = iM2567 ^ i4;
                        i18 = i3;
                        i15 = i7;
                    } else {
                        iM2566 = C0630.m2566("᩵ۨ") ^ i17;
                        i18 = ((iM2566 ^ i16) * 743) ^ 1330833323;
                        i2 = -381864642;
                        i6 = iM2566 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c21611 = c21610;
                    }
                    break;
                case -2012932029:
                case -1072749980:
                    i = i20;
                    c11007M48816 = c21611.m48815(i8);
                    i9 = c11007M48815.f33109;
                    if (C2520.m8026()) {
                        iM2567 = C0630.m2566("ۙۗ") ^ i17;
                        i3 = ((iM2567 ^ i16) * 5679) ^ 73023132;
                        i4 = 488155356;
                    } else {
                        iM2567 = (i17 - C0630.m2566("۬ܰ")) * (-67);
                        i3 = ((iM2567 ^ i16) * 18685) ^ 911337232;
                        i4 = 128288061;
                    }
                    i7 = i;
                    i19 = iM2567 ^ i4;
                    i18 = i3;
                    i15 = i7;
                    break;
                case -2008966477:
                case -426021263:
                    layoutParamsM20836.height = i14;
                    view2.requestLayout();
                    return c21611;
                case -1897201601:
                case 1265058238:
                    i = i20;
                    C3537.m10746();
                    C3911.m11924();
                    int iM6982 = (i17 - C2105.m6981("ᩳᩳ")) * (-97);
                    int i21 = ((iM6982 ^ i16) * (-19481)) ^ 1987591928;
                    i5 = iM6982 ^ 961745918;
                    i18 = i21;
                    c21611 = c21610;
                    i7 = i;
                    i19 = i5;
                    i15 = i7;
                    break;
                case -1812393707:
                case -1211003259:
                    i = i20;
                    Object obj2 = this.f15023;
                    if (C4263.f13799 > 0) {
                        int iM2568 = (C0630.m2566("ۡۚ") ^ i16) * (-15);
                        i18 = ((iM2568 ^ i17) * (-14503)) ^ 591309155;
                        i6 = iM2568 ^ (-2087924303);
                        obj = obj2;
                        i15 = i;
                        i19 = i6;
                        c21611 = c21610;
                    } else {
                        obj = obj2;
                        int iM6983 = (i17 - C2105.m6981("ᩳᩳ")) * (-97);
                        int i22 = ((iM6983 ^ i16) * (-19481)) ^ 1987591928;
                        i5 = iM6983 ^ 961745918;
                        i18 = i22;
                        c21611 = c21610;
                        i7 = i;
                        i19 = i5;
                        i15 = i7;
                    }
                    break;
                case -1317630661:
                case 638476951:
                    C5695.m16023();
                    C2167.m7155();
                    return null;
                case -1070159459:
                case -265333867:
                    if (!C0714.m2805()) {
                        i = i20;
                        iM2566 = C0630.m2566("ܽܰ") ^ i16;
                        i18 = ((iM2566 ^ i17) * 9497) ^ 710021114;
                        i2 = 1657319846;
                        i6 = iM2566 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c21611 = c21610;
                    }
                    i = i20;
                    iM2566 = C0630.m2566("᩵ۨ") ^ i17;
                    i18 = ((iM2566 ^ i16) * 743) ^ 1330833323;
                    i2 = -381864642;
                    i6 = iM2566 ^ i2;
                    i15 = i;
                    i19 = i6;
                    c21611 = c21610;
                    break;
                case -568373539:
                case 2060224653:
                    i = i20;
                    view2 = (View) obj;
                    int i23 = ViewOnClickListenerC7042.f21692;
                    if (C4117.f13076 > 0) {
                        iM2567 = C0630.m2566("ۙܰ") ^ i17;
                        i3 = ((iM2567 ^ i16) * 16993) ^ (-1225034814);
                        i4 = -827788624;
                        i7 = i;
                        i19 = iM2567 ^ i4;
                        i18 = i3;
                        i15 = i7;
                    } else {
                        iM2566 = C0630.m2566("᩵ۨ") ^ i17;
                        i18 = ((iM2566 ^ i16) * 743) ^ 1330833323;
                        i2 = -381864642;
                        i6 = iM2566 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c21611 = c21610;
                    }
                    break;
                case -527020248:
                case 1124625729:
                    i = i20;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ܽܰ") ^ i16;
                        i18 = ((iM2566 ^ i17) * 9497) ^ 710021114;
                        i2 = 1657319846;
                    } else {
                        iM2566 = (C2105.m6981("ۗܺ") + i17) * 71;
                        i18 = ((iM2566 ^ i16) * 18919) ^ (-298819211);
                        i2 = 2102872371;
                    }
                    i6 = iM2566 ^ i2;
                    i15 = i;
                    i19 = i6;
                    c21611 = c21610;
                    break;
                case -311880006:
                case 1282780784:
                    i = i20;
                    i10 = c11007M48815.f33110;
                    i11 = c11007M48815.f33108;
                    i12 = c11007M48816.f33108;
                    if (C0422.f1886 <= 0) {
                        iM2567 = C0630.m2566("ۙۗ") ^ i17;
                        i3 = ((iM2567 ^ i16) * 5679) ^ 73023132;
                        i4 = 488155356;
                    } else {
                        iM2567 = (C2105.m6981("᩹ܽ") ^ i16) * 35;
                        i3 = ((iM2567 ^ i17) * (-28703)) ^ (-1963958472);
                        i4 = -1969365012;
                    }
                    i7 = i;
                    i19 = iM2567 ^ i4;
                    i18 = i3;
                    i15 = i7;
                    break;
                case 67710586:
                case 1452700054:
                    if (RunnableC1937.f6483 >= 0) {
                        i = i20;
                        int iM6984 = (i17 - C2105.m6981("ᩳᩳ")) * (-97);
                        int i24 = ((iM6984 ^ i16) * (-19481)) ^ 1987591928;
                        i5 = iM6984 ^ 961745918;
                        i18 = i24;
                        c21611 = c21610;
                        i7 = i;
                        i19 = i5;
                        i15 = i7;
                    }
                    iM2567 = (i16 - C0630.m2566("ܿۙ")) * (-107);
                    i = i20;
                    i3 = ((iM2567 ^ i17) * (-14783)) ^ 280137105;
                    i4 = -1922807688;
                    i7 = i;
                    i19 = iM2567 ^ i4;
                    i18 = i3;
                    i15 = i7;
                    break;
                case 68230864:
                case 179875347:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        i = i20;
                        iM2566 = C0630.m2566("᩵ۨ") ^ i17;
                        i18 = ((iM2566 ^ i16) * 743) ^ 1330833323;
                        i2 = -381864642;
                        i6 = iM2566 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c21611 = c21610;
                    } else {
                        iM2567 = (i16 - C0630.m2566("ܿۙ")) * (-107);
                        i = i20;
                        i3 = ((iM2567 ^ i17) * (-14783)) ^ 280137105;
                        i4 = -1922807688;
                        i7 = i;
                        i19 = iM2567 ^ i4;
                        i18 = i3;
                        i15 = i7;
                    }
                    break;
                case 447651319:
                case 597625232:
                    i = i20;
                    c11007M48815 = c21611.m48815(7);
                    i8 = 8;
                    if (C1005.f3721) {
                        iM2567 = C0630.m2566("᩹֨") ^ i16;
                        i3 = ((iM2567 ^ i17) * (-30227)) ^ 1898447646;
                        i4 = -1495969586;
                    } else {
                        iM2567 = C0630.m2566("ۙۗ") ^ i17;
                        i3 = ((iM2567 ^ i16) * 5679) ^ 73023132;
                        i4 = 488155356;
                    }
                    i7 = i;
                    i19 = iM2567 ^ i4;
                    i18 = i3;
                    i15 = i7;
                    break;
                case 997354132:
                case 1718975147:
                    i = i20;
                    view.setPadding(i9, i13, i10, iM11932);
                    layoutParamsM20836 = C7811.m20836(view2);
                    i14 = c11007M48815.f33111;
                    if (!C2126.f7087) {
                        int iM2569 = C0630.m2566("ܳ֡") ^ i16;
                        i18 = ((iM2569 ^ i17) * 9223) ^ 832418726;
                        i5 = iM2569 ^ (-292014440);
                        i7 = i;
                        i19 = i5;
                        i15 = i7;
                    } else {
                        iM2566 = C0630.m2566("ܽܰ") ^ i16;
                        i18 = ((iM2566 ^ i17) * 9497) ^ 710021114;
                        i2 = 1657319846;
                        i6 = iM2566 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c21611 = c21610;
                    }
                    break;
                default:
                    i = i20;
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("ܽܰ") ^ i16;
                        i18 = ((iM2566 ^ i17) * 9497) ^ 710021114;
                        i2 = 1657319846;
                    } else {
                        iM2566 = C0630.m2566("۠۫") ^ i17;
                        i18 = ((iM2566 ^ i16) * 9285) ^ (-1463063074);
                        i2 = 1841724082;
                    }
                    i6 = iM2566 ^ i2;
                    i15 = i;
                    i19 = i6;
                    c21611 = c21610;
                    break;
            }
        }
    }
}
