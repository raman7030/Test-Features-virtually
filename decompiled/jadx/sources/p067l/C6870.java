package p067l;

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
public final /* synthetic */ class C6870 implements InterfaceC1666, InterfaceC9544, CanvasCompat.CanvasOperation {

    /* JADX INFO: renamed from: ᩺ܶ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f81978 = {6174, -13838, -13826, -27827, 21797, 22011};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f17853;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f17854;

    public /* synthetic */ C6870(int i, Object obj) {
        int i2 = 422934627;
        int i3 = C1003.f81929;
        int i4 = C0906.f81862;
        this.f17853 = i;
        this.f17854 = obj;
        int iM55680 = C0873.m55680("ۢ֨") ^ i4;
        int i5 = ((iM55680 ^ i3) * (-21075)) ^ 1691439300;
        int i6 = -1961328555;
        while (true) {
            i2 = (iM55680 ^ i6) ^ (i5 & (((i2 ^ i3) * 25491) >> 31));
            switch (i2) {
                case -2000591437:
                case -641846871:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("۫ۡ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-10803)) ^ (-1156583045);
                        i6 = 1521353286;
                    }
                    break;
                case -1610468516:
                case 129250730:
                    return;
                case -1577783870:
                case 1607249882:
                    C1024.m56209();
                    C0927.m55873();
                    break;
                case -1577444067:
                case 605089144:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ܰ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * 26247) ^ (-266384577);
                        i6 = -1430726549;
                    } else {
                        iM55680 = (C0946.m55979("ۢ۫") + i4) * (-117);
                        i5 = ((iM55680 ^ i3) * 8319) ^ (-714373222);
                        i6 = 118760790;
                        continue;
                    }
                    break;
                case -1317941888:
                case 145704316:
                    C0927.m55873();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۛܰ") + i4) * (-125);
                        i5 = ((iM55680 ^ i3) * 18257) ^ 1460020816;
                        i6 = 698820706;
                    }
                    break;
                case -476407232:
                case 661944658:
                    C0892.m55749();
                    C0882.m55710();
                    throw new RuntimeException();
                default:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("ۜۡ") + i3) * 27;
                        i5 = ((iM55680 ^ i4) * (-17571)) ^ (-965159688);
                        i6 = -1437844349;
                    }
                    break;
            }
            iM55680 = (C0946.m55979("֫᩻") + i3) * (-127);
            i5 = ((iM55680 ^ i4) * 10541) ^ 1183009125;
            i6 = -1038307382;
        }
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        int i = -409124730;
        int i2 = C0989.f81920;
        int i3 = C1964.f83032;
        int iM55979 = C0946.m55979("֡ᩳ") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-4499)) ^ 1176261818;
        int i5 = 1740979394;
        while (true) {
            i = ((((i ^ i2) * (-13717)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2096745308:
                case -877666999:
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("۫ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5417) ^ 1853514260;
                        i5 = 1706905382;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۨ֨")) * 5;
                        i4 = ((iM55979 ^ i2) * (-12371)) ^ (-1640136071);
                        i5 = 1408746321;
                    }
                    break;
                case -1977204891:
                case 1348375689:
                    C1229.m56410();
                    iM55979 = C0873.m55680("᩸ۨ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-19005)) ^ (-1358845843);
                    i5 = -876264693;
                    break;
                case -1947569145:
                case -228066272:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0873.m55680("۫᩶") ^ i3) * 53;
                        i4 = ((iM55979 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۨۙ")) * 45;
                        i4 = ((iM55979 ^ i3) * 18639) ^ (-1818405842);
                        i5 = -1778408822;
                    }
                    break;
                case -1875224342:
                case -915193848:
                    C0937.m55918();
                    if (C0873.f81841 > 0) {
                        iM55979 = (C0873.m55680("ᩴۘ") + i2) * (-73);
                        i4 = ((iM55979 ^ i3) * 18479) ^ (-390832154);
                        i5 = -978241090;
                    } else {
                        iM55979 = (C0873.m55680("۫᩶") ^ i3) * 53;
                        i4 = ((iM55979 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    }
                    break;
                case -1772785625:
                case -577575341:
                    C0892.m55749();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = (C0873.m55680("۫᩶") ^ i3) * 53;
                        i4 = ((iM55979 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    } else {
                        iM55979 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19005)) ^ (-1358845843);
                        i5 = -876264693;
                    }
                    break;
                case -1725887946:
                case -1242832300:
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("۫۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-15039)) ^ 1506693900;
                        i5 = 958568561;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۘ") + i2) * (-73);
                        i4 = ((iM55979 ^ i3) * 18479) ^ (-390832154);
                        i5 = -978241090;
                    }
                    break;
                case -1714014401:
                case -1708983505:
                    ((MaskableFrameLayout) this.f17854).lambda$dispatchDraw$1(canvas);
                    break;
                case -867230392:
                case 651882466:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27681)) ^ 1769468617;
                        i5 = 122054673;
                    } else {
                        iM55979 = (C0873.m55680("۫᩶") ^ i3) * 53;
                        i4 = ((iM55979 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    }
                    break;
                case -857555857:
                case 1044057756:
                    ((NavigationView) this.f17854).lambda$dispatchDraw$0(canvas);
                    break;
                case -560531897:
                case 1938144687:
                    if (C0946.f81894 == 0) {
                        iM55979 = C0946.m55979("۫ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5417) ^ 1853514260;
                        i5 = 1706905382;
                    } else {
                        iM55979 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19005)) ^ (-1358845843);
                        i5 = -876264693;
                    }
                    break;
                case 460826837:
                case 1331542671:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0946.m55979("۫ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5417) ^ 1853514260;
                        i5 = 1706905382;
                    } else {
                        iM55979 = (C0873.m55680("ۗ᩺") ^ i3) * (-87);
                        i4 = ((iM55979 ^ i2) * 32285) ^ 1597802782;
                        i5 = -105453886;
                    }
                    break;
                case 723699341:
                case 1055171308:
                    C0937.m55918();
                    C1048.m56305();
                    break;
                case 893933310:
                case 1489881917:
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("۬ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15481) ^ 238192040;
                        i5 = 1696096019;
                    } else {
                        iM55979 = C0873.m55680("۟ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29457)) ^ 1004736962;
                        i5 = 934750;
                    }
                    break;
                case 904765013:
                case 1926096179:
                    switch (this.f17853) {
                        case 2:
                            iM55979 = C0946.m55979("ܶܺ") ^ i2;
                            i4 = ((iM55979 ^ i3) * 19453) ^ 417088480;
                            i5 = 1827933036;
                            break;
                        default:
                            iM55979 = (i3 - C0873.m55680("ܽ᩹")) * 31;
                            i4 = ((iM55979 ^ i2) * (-12773)) ^ 1357878473;
                            i5 = -1201374651;
                            break;
                    }
                    break;
                case 1049206879:
                case 1587352830:
                    if (C1036.m56257() <= 0) {
                        iM55979 = (C0873.m55680("ᩴۘ") + i2) * (-73);
                        i4 = ((iM55979 ^ i3) * 18479) ^ (-390832154);
                        i5 = -978241090;
                    } else {
                        iM55979 = C0946.m55979("۫ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24071)) ^ (-1736675866);
                        i5 = -1166044944;
                    }
                    break;
                case 1378284243:
                case 1795094375:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0873.m55680("ᩴۘ") + i2) * (-73);
                        i4 = ((iM55979 ^ i3) * 18479) ^ (-390832154);
                        i5 = -978241090;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩻ۗ")) * (-25);
                        i4 = ((iM55979 ^ i2) * 27331) ^ (-1033592360);
                        i5 = 1902785657;
                    }
                    break;
                case 1446699426:
                case 1577639495:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19005)) ^ (-1358845843);
                        i5 = -876264693;
                    } else {
                        iM55979 = C0946.m55979("᩵۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 18925) ^ 616158660;
                        i5 = 1086981065;
                    }
                    break;
                default:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("۫᩶") ^ i3) * 53;
                        i4 = ((iM55979 ^ i2) * (-26241)) ^ 1594383017;
                        i5 = 1538544135;
                    } else {
                        iM55979 = C0946.m55979("ۗ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 5675) ^ (-1686196120);
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
    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo9168(C4360 c4360) {
        int i;
        int iM55979;
        int i2;
        C11903 c11903;
        SharedPreferences sharedPreferences;
        String str;
        short[] sArr;
        int iM559710;
        int i3;
        int iM559711;
        int i4;
        int i5;
        SharedPreferences sharedPreferences2;
        int i6 = 1853383215;
        int i7 = ServiceConnectionC1013.f81940;
        int i8 = C0866.f81837;
        int iM55680 = (i7 - C0873.m55680("۬ۘ")) * (-57);
        int i9 = ((iM55680 ^ i8) * (-8533)) ^ (-541875747);
        int i10 = iM55680 ^ 786795586;
        SharedPreferences sharedPreferencesM13265 = null;
        String strM9037 = null;
        ArrayList arrayList = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        C11903 c11904 = null;
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
        String[] strArrM24100 = null;
        String strM56403 = null;
        int i19 = 0;
        Context contextM9012 = null;
        int i20 = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * 7867) >> 31));
            switch (i6) {
                case -2073986671:
                case 555208709:
                    C0863.m55643();
                    if (!C0955.f81898) {
                        sArr = sArr2;
                        sharedPreferences = sharedPreferencesM13265;
                        str = strM9037;
                        c11903 = c11904;
                        iM559710 = (i8 - C0873.m55680("ۖۛ")) * (-65);
                        sArr2 = sArr;
                        i9 = ((iM559710 ^ i7) * (-28785)) ^ 1409366544;
                        i3 = -2061021416;
                        int i21 = iM559710 ^ i3;
                        strM9037 = str;
                        sharedPreferences2 = sharedPreferences;
                        i10 = i21;
                        c11904 = c11903;
                        sharedPreferencesM13265 = sharedPreferences2;
                    } else {
                        int iM559712 = C0946.m55979("ۚۚ") ^ i7;
                        i9 = ((iM559712 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM559712 ^ 1494799323;
                    }
                    break;
                case -2060082710:
                case 714056024:
                    sArr3 = f81978;
                    i14 = 1;
                    i15 = 2;
                    if (C1964.m56597() == 0) {
                        iM55979 = (i8 - C0946.m55979("ܺۨ")) * (-61);
                        i = ((iM55979 ^ i7) * 11105) ^ (-2029917681);
                        i2 = 2142314569;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        sharedPreferencesM13265 = sharedPreferencesM13265;
                        strM9037 = strM9037;
                        c11903 = c11904;
                        iM559711 = (i8 - C0946.m55979("ۤ᩷")) * 87;
                        i4 = ((iM559711 ^ i7) * 12557) ^ 658350580;
                        i5 = -173575019;
                        int i22 = iM559711 ^ i5;
                        strM9037 = strM9037;
                        sharedPreferences2 = sharedPreferencesM13265;
                        i10 = i22;
                        i9 = i4;
                        c11904 = c11903;
                        sharedPreferencesM13265 = sharedPreferences2;
                    }
                    break;
                case -1658463009:
                case -84863153:
                    sharedPreferencesM13265 = sharedPreferencesM13265;
                    strM9037 = strM9037;
                    c11903 = c11904;
                    c = 0;
                    if (C0937.m55918() >= 0) {
                        iM559711 = (i8 - C0946.m55979("ۤ᩷")) * 87;
                        i4 = ((iM559711 ^ i7) * 12557) ^ 658350580;
                        i5 = -173575019;
                    } else {
                        iM559711 = C0946.m55979("۬᩹") ^ i7;
                        i4 = ((iM559711 ^ i8) * (-16491)) ^ 1715271352;
                        i5 = 1919157345;
                    }
                    int i23 = iM559711 ^ i5;
                    strM9037 = strM9037;
                    sharedPreferences2 = sharedPreferencesM13265;
                    i10 = i23;
                    i9 = i4;
                    c11904 = c11903;
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case -1634533348:
                case -1190267918:
                    sharedPreferencesM13265 = sharedPreferencesM13265;
                    strM9037 = strM9037;
                    c11903 = c11904;
                    s = sArr2[c];
                    i17 = s + 1;
                    if (AbstractC0942.f81890 <= 0) {
                        iM559711 = (i8 - C0946.m55979("ۤ᩷")) * 87;
                        i4 = ((iM559711 ^ i7) * 12557) ^ 658350580;
                        i5 = -173575019;
                    } else {
                        iM559711 = C0873.m55680("ۖ۟") ^ i8;
                        i4 = ((iM559711 ^ i7) * (-13161)) ^ 1186606142;
                        i5 = -755991831;
                    }
                    int i24 = iM559711 ^ i5;
                    strM9037 = strM9037;
                    sharedPreferences2 = sharedPreferencesM13265;
                    i10 = i24;
                    i9 = i4;
                    c11904 = c11903;
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case -1493484429:
                case -925824693:
                    if (C0992.m56108(arrayList)) {
                        iM55979 = C0873.m55680("ܽᩳ") ^ i7;
                        i = ((iM55979 ^ i8) * (-12327)) ^ (-518917444);
                        i2 = 577297411;
                    } else {
                        iM55979 = (C0946.m55979("ܽۖ") ^ i8) * 35;
                        i = ((iM55979 ^ i7) * 10983) ^ (-2111880416);
                        i2 = -1418814538;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1458059703:
                case 888024464:
                    i13 = 33491;
                    iM559711 = (i8 - C0873.m55680("ۤᩴ")) * (-83);
                    c11903 = c11904;
                    i4 = ((iM559711 ^ i7) * (-10589)) ^ 406961689;
                    i5 = 1341182176;
                    int i25 = iM559711 ^ i5;
                    strM9037 = strM9037;
                    sharedPreferences2 = sharedPreferencesM13265;
                    i10 = i25;
                    i9 = i4;
                    c11904 = c11903;
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case -1418025034:
                case 1516118166:
                    return TextUtils.join(C0892.m55750(sArr3, i14, i15, i13), arrayList);
                case -1404077258:
                case 303967070:
                    sharedPreferences = sharedPreferencesM13265;
                    str = strM9037;
                    c11903 = c11904;
                    sArr = f81978;
                    if (C1404.f82149 >= 0) {
                        iM559710 = (i8 - C0873.m55680("ۖۛ")) * (-65);
                        sArr2 = sArr;
                        i9 = ((iM559710 ^ i7) * (-28785)) ^ 1409366544;
                        i3 = -2061021416;
                    } else {
                        iM559710 = (C0946.m55979("ܶ᩵") + i8) * 115;
                        sArr2 = sArr;
                        i9 = ((iM559710 ^ i7) * (-1365)) ^ (-1575027550);
                        i3 = -1603654599;
                    }
                    int i26 = iM559710 ^ i3;
                    strM9037 = str;
                    sharedPreferences2 = sharedPreferences;
                    i10 = i26;
                    c11904 = c11903;
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case -1374942812:
                case -585500070:
                    C0866.m55645();
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("ܶ᩷") ^ i7;
                        i = ((iM55979 ^ i8) * (-20189)) ^ 1391658656;
                        i2 = 694767332;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        int iM559713 = C0946.m55979("ۚۚ") ^ i7;
                        i9 = ((iM559713 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM559713 ^ 1494799323;
                    }
                    break;
                case -1276707243:
                case 336691615:
                    if (i20 < 3) {
                        iM55979 = (C0946.m55979("ܺ۬") + i7) * 37;
                        i = ((iM55979 ^ i8) * 11467) ^ 1193359822;
                        i2 = -500950724;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ۛۙ")) * 123;
                        i = ((iM55979 ^ i8) * 4897) ^ 1482363261;
                        i2 = 308842477;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1242563093:
                case 79555655:
                    C0845.m55584();
                    sharedPreferencesM13265 = sharedPreferencesM13265;
                    strM9037 = strM9037;
                    c11903 = c11904;
                    iM559711 = C0946.m55979("ܳ᩺") ^ i8;
                    i4 = ((iM559711 ^ i7) * 1455) ^ (-1524322354);
                    i5 = -1487523010;
                    int i27 = iM559711 ^ i5;
                    strM9037 = strM9037;
                    sharedPreferences2 = sharedPreferencesM13265;
                    i10 = i27;
                    i9 = i4;
                    c11904 = c11903;
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case -1197727789:
                case 2001750497:
                    return C0863.m55638(contextM9012, C0873.m55680(strM56403) ^ 2121640330);
                case -979484267:
                case 419646371:
                    C0845.m55584();
                    if (C0866.f81837 >= 0) {
                        int iM559714 = C0946.m55979("ۚۚ") ^ i7;
                        i9 = ((iM559714 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM559714 ^ 1494799323;
                    } else {
                        sharedPreferencesM13265 = sharedPreferencesM13265;
                        strM9037 = strM9037;
                        c11903 = c11904;
                        iM559711 = C0946.m55979("ܳ᩺") ^ i8;
                        i4 = ((iM559711 ^ i7) * 1455) ^ (-1524322354);
                        i5 = -1487523010;
                        int i28 = iM559711 ^ i5;
                        strM9037 = strM9037;
                        sharedPreferences2 = sharedPreferencesM13265;
                        i10 = i28;
                        i9 = i4;
                        c11904 = c11903;
                        sharedPreferencesM13265 = sharedPreferences2;
                    }
                    break;
                case -937608229:
                case 1688721093:
                    SharedPreferences sharedPreferences3 = sharedPreferencesM13265;
                    strM9037 = c11904.m9037();
                    i12 = 0;
                    if (C0898.m55800() > 0) {
                        int iM55681 = C0873.m55680("᩹ۚ") ^ i7;
                        i = ((iM55681 ^ i8) * (-22615)) ^ (-360826455);
                        sharedPreferencesM13265 = sharedPreferences3;
                        i10 = iM55681 ^ 930015808;
                        i9 = i;
                    } else {
                        sharedPreferencesM13265 = sharedPreferences3;
                        int iM559715 = C0946.m55979("ۚۚ") ^ i7;
                        i9 = ((iM559715 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM559715 ^ 1494799323;
                    }
                    break;
                case -828386395:
                case 1717126852:
                    contextM9012 = c11904.m9012();
                    sArr4 = f81978;
                    i11 = 3;
                    if (C1012.f81938 < 0) {
                        iM55979 = C0946.m55979("ۨ֨") ^ i7;
                        i = ((iM55979 ^ i8) * (-1743)) ^ (-113780560);
                        i2 = 212464058;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr2;
                        sharedPreferences = sharedPreferencesM13265;
                        str = strM9037;
                        c11903 = c11904;
                        iM559710 = (i8 - C0873.m55680("ۖۛ")) * (-65);
                        sArr2 = sArr;
                        i9 = ((iM559710 ^ i7) * (-28785)) ^ 1409366544;
                        i3 = -2061021416;
                        int i29 = iM559710 ^ i3;
                        strM9037 = str;
                        sharedPreferences2 = sharedPreferences;
                        i10 = i29;
                        c11904 = c11903;
                        sharedPreferencesM13265 = sharedPreferences2;
                    }
                    break;
                case -673816325:
                case -400022825:
                    String str2 = strM9037;
                    c11904 = (C11903) this.f17854;
                    sharedPreferencesM13265 = c11904.m13265();
                    if (C0946.f81894 != 0) {
                        strM9037 = str2;
                        int iM559716 = C0946.m55979("ۚۚ") ^ i7;
                        i9 = ((iM559716 ^ i8) * (-16631)) ^ 1856067431;
                        i10 = iM559716 ^ 1494799323;
                    } else {
                        int iM559717 = (C0946.m55979("ᩳۙ") ^ i7) * 109;
                        strM9037 = str2;
                        i10 = iM559717 ^ 740379557;
                        i9 = ((iM559717 ^ i8) * 8943) ^ (-108304979);
                        c11904 = c11904;
                    }
                    break;
                case -610655055:
                case 1958987994:
                    SharedPreferences sharedPreferences4 = sharedPreferencesM13265;
                    strM9037 = strM9037;
                    i19 = sharedPreferences4.getInt(strM9037, i12);
                    strArrM24100 = C10403.m24100(c11904.m9012());
                    if (C1404.f82149 >= 0) {
                        sharedPreferencesM13265 = sharedPreferences4;
                        c11903 = c11904;
                        iM559711 = C0946.m55979("ܳ᩺") ^ i8;
                        i4 = ((iM559711 ^ i7) * 1455) ^ (-1524322354);
                        i5 = -1487523010;
                        int i210 = iM559711 ^ i5;
                        strM9037 = strM9037;
                        sharedPreferences2 = sharedPreferencesM13265;
                        i10 = i210;
                        i9 = i4;
                        c11904 = c11903;
                    } else {
                        int iM55682 = C0873.m55680("֨ۗ") ^ i8;
                        i9 = ((iM55682 ^ i7) * (-12843)) ^ (-1364213241);
                        strM9037 = strM9037;
                        sharedPreferences2 = sharedPreferences4;
                        i10 = iM55682 ^ (-776554574);
                    }
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case -573324522:
                case 1246808667:
                    if (((1 << i20) & i19) != 0) {
                        iM55979 = (C0873.m55680("۫ۤ") ^ i7) * (-21);
                        i = ((iM55979 ^ i8) * (-625)) ^ 81117725;
                        i2 = 1814643374;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩸") ^ i8;
                        i = ((iM55979 ^ i7) * 20385) ^ (-141953960);
                        i2 = -509511465;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -530653430:
                case 87503609:
                    strM56403 = C1229.m56403(sArr4, i11, 3, i13);
                    if (C0937.m55918() < 0) {
                        iM55979 = C0946.m55979("֨ܶ") ^ i8;
                        i = ((iM55979 ^ i7) * 755) ^ 363892501;
                        i2 = -1468814996;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr2;
                        sharedPreferences = sharedPreferencesM13265;
                        str = strM9037;
                        c11903 = c11904;
                        iM559710 = (i8 - C0873.m55680("ۖۛ")) * (-65);
                        sArr2 = sArr;
                        i9 = ((iM559710 ^ i7) * (-28785)) ^ 1409366544;
                        i3 = -2061021416;
                        int i211 = iM559710 ^ i3;
                        strM9037 = str;
                        sharedPreferences2 = sharedPreferences;
                        i10 = i211;
                        c11904 = c11903;
                        sharedPreferencesM13265 = sharedPreferences2;
                    }
                    break;
                case -375518785:
                case 1048762225:
                    i20++;
                    iM55979 = (C0873.m55680("᩵۠") + i8) * (-87);
                    i = ((iM55979 ^ i7) * 5445) ^ 360415180;
                    i2 = -1711125909;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -140452317:
                case 564995285:
                    sharedPreferencesM13265 = sharedPreferencesM13265;
                    strM9037 = strM9037;
                    c11903 = c11904;
                    if (i18 - (i16 + 1) >= 0) {
                        iM559711 = (C0946.m55979("ܳۖ") + i7) * (-69);
                        i4 = ((iM559711 ^ i8) * 21575) ^ (-1303391650);
                        i5 = -630456653;
                    } else {
                        iM559711 = C0946.m55979("ۛܿ") ^ i8;
                        i4 = ((iM559711 ^ i7) * (-29637)) ^ 918359540;
                        i5 = -338845609;
                    }
                    int i212 = iM559711 ^ i5;
                    strM9037 = strM9037;
                    sharedPreferences2 = sharedPreferencesM13265;
                    i10 = i212;
                    i9 = i4;
                    c11904 = c11903;
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case -91806542:
                case 1145604706:
                    i13 = 51678;
                    iM559711 = (i8 - C0873.m55680("ۤᩴ")) * (-83);
                    c11903 = c11904;
                    i4 = ((iM559711 ^ i7) * (-10589)) ^ 406961689;
                    i5 = 1341182176;
                    int i213 = iM559711 ^ i5;
                    strM9037 = strM9037;
                    sharedPreferences2 = sharedPreferencesM13265;
                    i10 = i213;
                    i9 = i4;
                    c11904 = c11903;
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case 231994915:
                case 586407595:
                    sharedPreferencesM13265 = sharedPreferencesM13265;
                    strM9037 = strM9037;
                    c11903 = c11904;
                    i18 = i17 * i17;
                    i16 = s * 2;
                    if (C1071.m56343() != 0) {
                        iM559711 = C0946.m55979("ܳ᩺") ^ i8;
                        i4 = ((iM559711 ^ i7) * 1455) ^ (-1524322354);
                        i5 = -1487523010;
                    } else {
                        iM559711 = C0873.m55680("ۧܺ") ^ i7;
                        i4 = ((iM559711 ^ i8) * (-16379)) ^ 899386806;
                        i5 = -849736554;
                    }
                    int i214 = iM559711 ^ i5;
                    strM9037 = strM9037;
                    sharedPreferences2 = sharedPreferencesM13265;
                    i10 = i214;
                    i9 = i4;
                    c11904 = c11903;
                    sharedPreferencesM13265 = sharedPreferences2;
                    break;
                case 244668318:
                case 2131682325:
                    arrayList = new ArrayList();
                    i20 = i12;
                    iM55979 = (C0873.m55680("᩵۠") + i8) * (-87);
                    i = ((iM55979 ^ i7) * 5445) ^ 360415180;
                    i2 = -1711125909;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 1319176632:
                case 2020973722:
                    C0937.m55918();
                    return null;
                default:
                    C0937.m55917(arrayList, strArrM24100[i20]);
                    iM55979 = C0873.m55680("ܳ᩸") ^ i8;
                    i = ((iM55979 ^ i7) * 20385) ^ (-141953960);
                    i2 = -509511465;
                    i10 = iM55979 ^ i2;
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
    @Override // p067l.InterfaceC1666
    public C1914 onApplyWindowInsets(View view, C1914 c1914) {
        int i;
        int iM55680;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C1914 c1915 = c1914;
        View view2 = null;
        C1388 c1388M51163 = null;
        int i8 = 0;
        C1388 c1388M51164 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM56265 = 0;
        int i13 = 0;
        ViewGroup.LayoutParams layoutParamsM56402 = null;
        int i14 = 0;
        int i15 = 86429566;
        int i16 = C1028.f81950;
        int i17 = C1124.f82007;
        int iM55979 = (C0946.m55979("᩺ۡ") + i17) * (-111);
        int i18 = ((iM55979 ^ i16) * 30869) ^ (-1164177758);
        int i19 = iM55979 ^ 1299015604;
        Object obj = null;
        while (true) {
            int i20 = i19 ^ (i18 & (((i15 ^ i16) * 12147) >> 31));
            switch (i20) {
                case -2131654930:
                case 1627017965:
                    i = i20;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("᩵ۨ") ^ i17;
                        i18 = ((iM55680 ^ i16) * 743) ^ 1330833323;
                        i2 = -381864642;
                    } else {
                        iM55680 = (C0873.m55680("ۧۙ") ^ i16) * 45;
                        i18 = ((iM55680 ^ i17) * (-5657)) ^ 1503787021;
                        i2 = -190233981;
                    }
                    i6 = iM55680 ^ i2;
                    i15 = i;
                    i19 = i6;
                    c1915 = c1914;
                    break;
                case -2059376945:
                case -305884413:
                    i = i20;
                    iM56265 = C1036.m56265(i11, i12);
                    i13 = 0;
                    if (C0854.f81826 == 0) {
                        iM55681 = C0946.m55979("ܿ᩸") ^ i17;
                        i3 = ((iM55681 ^ i16) * 14659) ^ (-480859906);
                        i4 = -700075558;
                        i7 = i;
                        i19 = iM55681 ^ i4;
                        i18 = i3;
                        i15 = i7;
                    } else {
                        iM55680 = C0873.m55680("᩵ۨ") ^ i17;
                        i18 = ((iM55680 ^ i16) * 743) ^ 1330833323;
                        i2 = -381864642;
                        i6 = iM55680 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c1915 = c1914;
                    }
                    break;
                case -2012932029:
                case -1072749980:
                    i = i20;
                    c1388M51164 = c1915.m51163(i8);
                    i9 = c1388M51163.f36103;
                    if (C0967.m56074()) {
                        iM55681 = C0873.m55680("ۙۗ") ^ i17;
                        i3 = ((iM55681 ^ i16) * 5679) ^ 73023132;
                        i4 = 488155356;
                    } else {
                        iM55681 = (i17 - C0873.m55680("۬ܰ")) * (-67);
                        i3 = ((iM55681 ^ i16) * 18685) ^ 911337232;
                        i4 = 128288061;
                    }
                    i7 = i;
                    i19 = iM55681 ^ i4;
                    i18 = i3;
                    i15 = i7;
                    break;
                case -2008966477:
                case -426021263:
                    layoutParamsM56402.height = i14;
                    view2.requestLayout();
                    return c1915;
                case -1897201601:
                case 1265058238:
                    i = i20;
                    C1017.m56187();
                    C1036.m56257();
                    int iM559710 = (i17 - C0946.m55979("ᩳᩳ")) * (-97);
                    int i21 = ((iM559710 ^ i16) * (-19481)) ^ 1987591928;
                    i5 = iM559710 ^ 961745918;
                    i18 = i21;
                    c1915 = c1914;
                    i7 = i;
                    i19 = i5;
                    i15 = i7;
                    break;
                case -1812393707:
                case -1211003259:
                    i = i20;
                    Object obj2 = this.f17854;
                    if (C1053.f81965 > 0) {
                        int iM55682 = (C0873.m55680("ۡۚ") ^ i16) * (-15);
                        i18 = ((iM55682 ^ i17) * (-14503)) ^ 591309155;
                        i6 = iM55682 ^ (-2087924303);
                        obj = obj2;
                        i15 = i;
                        i19 = i6;
                        c1915 = c1914;
                    } else {
                        obj = obj2;
                        int iM559711 = (i17 - C0946.m55979("ᩳᩳ")) * (-97);
                        int i22 = ((iM559711 ^ i16) * (-19481)) ^ 1987591928;
                        i5 = iM559711 ^ 961745918;
                        i18 = i22;
                        c1915 = c1914;
                        i7 = i;
                        i19 = i5;
                        i15 = i7;
                    }
                    break;
                case -1317630661:
                case 638476951:
                    C1124.m56367();
                    C0949.m56012();
                    return null;
                case -1070159459:
                case -265333867:
                    if (!C0877.m55696()) {
                        i = i20;
                        iM55680 = C0873.m55680("ܽܰ") ^ i16;
                        i18 = ((iM55680 ^ i17) * 9497) ^ 710021114;
                        i2 = 1657319846;
                        i6 = iM55680 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c1915 = c1914;
                    }
                    i = i20;
                    iM55680 = C0873.m55680("᩵ۨ") ^ i17;
                    i18 = ((iM55680 ^ i16) * 743) ^ 1330833323;
                    i2 = -381864642;
                    i6 = iM55680 ^ i2;
                    i15 = i;
                    i19 = i6;
                    c1915 = c1914;
                    break;
                case -568373539:
                case 2060224653:
                    i = i20;
                    view2 = (View) obj;
                    int i23 = ViewOnClickListenerC9062.f24574;
                    if (C1046.f81962 > 0) {
                        iM55681 = C0873.m55680("ۙܰ") ^ i17;
                        i3 = ((iM55681 ^ i16) * 16993) ^ (-1225034814);
                        i4 = -827788624;
                        i7 = i;
                        i19 = iM55681 ^ i4;
                        i18 = i3;
                        i15 = i7;
                    } else {
                        iM55680 = C0873.m55680("᩵ۨ") ^ i17;
                        i18 = ((iM55680 ^ i16) * 743) ^ 1330833323;
                        i2 = -381864642;
                        i6 = iM55680 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c1915 = c1914;
                    }
                    break;
                case -527020248:
                case 1124625729:
                    i = i20;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("ܽܰ") ^ i16;
                        i18 = ((iM55680 ^ i17) * 9497) ^ 710021114;
                        i2 = 1657319846;
                    } else {
                        iM55680 = (C0946.m55979("ۗܺ") + i17) * 71;
                        i18 = ((iM55680 ^ i16) * 18919) ^ (-298819211);
                        i2 = 2102872371;
                    }
                    i6 = iM55680 ^ i2;
                    i15 = i;
                    i19 = i6;
                    c1915 = c1914;
                    break;
                case -311880006:
                case 1282780784:
                    i = i20;
                    i10 = c1388M51163.f36104;
                    i11 = c1388M51163.f36102;
                    i12 = c1388M51164.f36102;
                    if (C0863.f81833 <= 0) {
                        iM55681 = C0873.m55680("ۙۗ") ^ i17;
                        i3 = ((iM55681 ^ i16) * 5679) ^ 73023132;
                        i4 = 488155356;
                    } else {
                        iM55681 = (C0946.m55979("᩹ܽ") ^ i16) * 35;
                        i3 = ((iM55681 ^ i17) * (-28703)) ^ (-1963958472);
                        i4 = -1969365012;
                    }
                    i7 = i;
                    i19 = iM55681 ^ i4;
                    i18 = i3;
                    i15 = i7;
                    break;
                case 67710586:
                case 1452700054:
                    if (RunnableC0938.f81886 >= 0) {
                        i = i20;
                        int iM559712 = (i17 - C0946.m55979("ᩳᩳ")) * (-97);
                        int i24 = ((iM559712 ^ i16) * (-19481)) ^ 1987591928;
                        i5 = iM559712 ^ 961745918;
                        i18 = i24;
                        c1915 = c1914;
                        i7 = i;
                        i19 = i5;
                        i15 = i7;
                    }
                    iM55681 = (i16 - C0873.m55680("ܿۙ")) * (-107);
                    i = i20;
                    i3 = ((iM55681 ^ i17) * (-14783)) ^ 280137105;
                    i4 = -1922807688;
                    i7 = i;
                    i19 = iM55681 ^ i4;
                    i18 = i3;
                    i15 = i7;
                    break;
                case 68230864:
                case 179875347:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        i = i20;
                        iM55680 = C0873.m55680("᩵ۨ") ^ i17;
                        i18 = ((iM55680 ^ i16) * 743) ^ 1330833323;
                        i2 = -381864642;
                        i6 = iM55680 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c1915 = c1914;
                    } else {
                        iM55681 = (i16 - C0873.m55680("ܿۙ")) * (-107);
                        i = i20;
                        i3 = ((iM55681 ^ i17) * (-14783)) ^ 280137105;
                        i4 = -1922807688;
                        i7 = i;
                        i19 = iM55681 ^ i4;
                        i18 = i3;
                        i15 = i7;
                    }
                    break;
                case 447651319:
                case 597625232:
                    i = i20;
                    c1388M51163 = c1915.m51163(7);
                    i8 = 8;
                    if (C0892.f81851) {
                        iM55681 = C0873.m55680("᩹֨") ^ i16;
                        i3 = ((iM55681 ^ i17) * (-30227)) ^ 1898447646;
                        i4 = -1495969586;
                    } else {
                        iM55681 = C0873.m55680("ۙۗ") ^ i17;
                        i3 = ((iM55681 ^ i16) * 5679) ^ 73023132;
                        i4 = 488155356;
                    }
                    i7 = i;
                    i19 = iM55681 ^ i4;
                    i18 = i3;
                    i15 = i7;
                    break;
                case 997354132:
                case 1718975147:
                    i = i20;
                    view.setPadding(i9, i13, i10, iM56265);
                    layoutParamsM56402 = C1229.m56402(view2);
                    i14 = c1388M51163.f36105;
                    if (!C0947.f81895) {
                        int iM55683 = C0873.m55680("ܳ֡") ^ i16;
                        i18 = ((iM55683 ^ i17) * 9223) ^ 832418726;
                        i5 = iM55683 ^ (-292014440);
                        i7 = i;
                        i19 = i5;
                        i15 = i7;
                    } else {
                        iM55680 = C0873.m55680("ܽܰ") ^ i16;
                        i18 = ((iM55680 ^ i17) * 9497) ^ 710021114;
                        i2 = 1657319846;
                        i6 = iM55680 ^ i2;
                        i15 = i;
                        i19 = i6;
                        c1915 = c1914;
                    }
                    break;
                default:
                    i = i20;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("ܽܰ") ^ i16;
                        i18 = ((iM55680 ^ i17) * 9497) ^ 710021114;
                        i2 = 1657319846;
                    } else {
                        iM55680 = C0873.m55680("۠۫") ^ i17;
                        i18 = ((iM55680 ^ i16) * 9285) ^ (-1463063074);
                        i2 = 1841724082;
                    }
                    i6 = iM55680 ^ i2;
                    i15 = i;
                    i19 = i6;
                    c1915 = c1914;
                    break;
            }
        }
    }
}
