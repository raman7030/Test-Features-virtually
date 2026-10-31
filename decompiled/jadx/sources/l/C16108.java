package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16108 extends AbstractC19902 {

    /* JADX INFO: renamed from: ۜۙܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f49642 = {7807, 28410, 28410, 28410, 28410, 28410, 2426, -3301, 5903, 28384, 28410, 9174, 29056, 22605, -20227};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1292 f49643;

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = 765177751;
        int i4 = AbstractC2021.f6743;
        int i5 = RunnableC0588.f2309;
        int iM6981 = C2105.m6981("ᩴ᩹") ^ i5;
        int i6 = ((iM6981 ^ i4) * 23093) ^ 1297014390;
        int i7 = 571719278;
        while (true) {
            i3 = ((((i3 ^ i4) * (-6917)) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -1793222872:
                case 1287554152:
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("ܶۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 15503) ^ (-1357976035);
                        i7 = -125136184;
                    } else {
                        iM6981 = C2105.m6981("۟᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-21351)) ^ (-438811810);
                        i7 = -1430630664;
                    }
                    break;
                case -1651531632:
                case -988616110:
                    return 0;
                case -1604288559:
                case -717383589:
                    if (C1128.m3851() <= 0) {
                        iM6981 = C0630.m2566("᩺ᩴ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-17259)) ^ (-1200792296);
                        i7 = -1912048203;
                    } else {
                        iM6981 = C2105.m6981("۠᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-23107)) ^ (-294308221);
                        i7 = -2094574163;
                    }
                    break;
                case -1174384356:
                case 724020201:
                    C0237.m1481();
                    if (C1047.m3599() >= 0) {
                        iM6981 = C2105.m6981("ܶۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 15503) ^ (-1357976035);
                        i7 = -125136184;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۨ֨")) * 19;
                        i6 = ((iM6981 ^ i5) * 16523) ^ 1187622413;
                        i7 = -1362712099;
                    }
                    break;
                case -1144685413:
                case -1067516252:
                    C0630.m2564();
                    return 0;
                case -1142223036:
                case 548123599:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۨ֨")) * 19;
                        i6 = ((iM6981 ^ i5) * 16523) ^ 1187622413;
                        i7 = -1362712099;
                    } else {
                        iM6981 = C2105.m6981("ۧᩳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-28939)) ^ 1757338314;
                        i7 = 1288083352;
                    }
                    break;
                case -1005796412:
                case -209012843:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM6981 = (C0630.m2566("ܿ᩹") ^ i5) * (-3);
                        i6 = ((iM6981 ^ i4) * 19401) ^ 507201516;
                        i7 = 1180897366;
                    } else {
                        iM6981 = C2105.m6981("ܿۙ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-20179)) ^ 456743644;
                        i7 = -1816624469;
                    }
                    break;
                case -998332658:
                case 743264680:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩹ۧ")) * (-117);
                        i6 = ((iM6981 ^ i5) * 29903) ^ 1768182573;
                        i7 = 1319176942;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ܿ۟")) * (-39);
                        i6 = ((iM6981 ^ i4) * 15595) ^ (-568719417);
                        i7 = -1295177828;
                    }
                    break;
                case -844947306:
                case -612885898:
                    C1128.m3851();
                    if (C0630.f2410 > 0) {
                        iM6981 = C0630.m2566("᩺ᩴ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-17259)) ^ (-1200792296);
                        i7 = -1912048203;
                    } else {
                        iM6981 = C2105.m6981("ܶۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 15503) ^ (-1357976035);
                        i7 = -125136184;
                    }
                    break;
                case -838614384:
                case 947025739:
                    itemCount = getItemCount();
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C0630.m2566("ܰ۠") + i4) * (-89);
                        i6 = ((iM6981 ^ i5) * 1001) ^ 427473434;
                        i7 = 331833811;
                    } else {
                        iM6981 = C0630.m2566("ۖۚ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 8131) ^ (-111070487);
                        i7 = -1524571438;
                    }
                    break;
                case -577925247:
                case 1260077405:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("᩺ᩴ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-17259)) ^ (-1200792296);
                        i7 = -1912048203;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩺ܺ")) * 5;
                        i6 = ((iM6981 ^ i5) * 19887) ^ 310825977;
                        i7 = -1110170762;
                    }
                    break;
                case -103414783:
                case 1603518563:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۨ֨")) * 19;
                        i6 = ((iM6981 ^ i5) * 16523) ^ 1187622413;
                        i7 = -1362712099;
                    } else {
                        iM6981 = (C2105.m6981("ۢ᩶") + i5) * (-81);
                        i6 = ((iM6981 ^ i4) * (-4693)) ^ 732172796;
                        i7 = 1790273061;
                    }
                    break;
                case -66048500:
                case 112593969:
                    if (C1047.m3599() >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩹ۧ")) * (-117);
                        i6 = ((iM6981 ^ i5) * 29903) ^ 1768182573;
                        i7 = 1319176942;
                    } else {
                        iM6981 = (C2105.m6981("֨ܳ") ^ i4) * (-111);
                        i6 = ((iM6981 ^ i5) * 26809) ^ 1566939725;
                        i7 = 866289131;
                    }
                    break;
                case 210797305:
                case 1949738720:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (i4 - C0630.m2566("᩹ۧ")) * (-117);
                        i6 = ((iM6981 ^ i5) * 29903) ^ 1768182573;
                        i7 = 1319176942;
                    } else {
                        iM6981 = (C0630.m2566("ܺܿ") ^ i5) * 77;
                        i6 = ((iM6981 ^ i4) * (-28181)) ^ (-138253877);
                        i7 = -979637942;
                    }
                    break;
                case 401655072:
                case 2105624566:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩹ۧ")) * (-117);
                        i6 = ((iM6981 ^ i5) * 29903) ^ 1768182573;
                        i7 = 1319176942;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۨ֨")) * 19;
                        i6 = ((iM6981 ^ i5) * 16523) ^ 1187622413;
                        i7 = -1362712099;
                    }
                    break;
                case 599065546:
                case 1634831113:
                    C0382.m1848();
                    iM6981 = (i4 - C2105.m6981("ۨ֨")) * 19;
                    i6 = ((iM6981 ^ i5) * 16523) ^ 1187622413;
                    i7 = -1362712099;
                    break;
                case 1551586985:
                case 1953358263:
                    return i2;
                default:
                    if (C11340.m28031()) {
                        iM6981 = C0630.m2566("ۢۗ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-6185)) ^ (-1252009693);
                        i7 = -757046585;
                    } else {
                        iM6981 = (C0630.m2566("ܰ۠") + i4) * (-89);
                        i6 = ((iM6981 ^ i5) * 1001) ^ 427473434;
                        i7 = 331833811;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e8 A[PHI: r0 r9 r10 r13
      0x00e8: PHI (r0v65 int) = (r0v2 int), (r0v2 int), (r0v66 int) binds: [B:112:0x00e8, B:26:0x00e6, B:22:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r9v4 java.lang.StringBuilder) = (r9v2 java.lang.StringBuilder), (r9v3 java.lang.StringBuilder), (r9v2 java.lang.StringBuilder) binds: [B:112:0x00e8, B:26:0x00e6, B:22:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r10v4 java.lang.String) = (r10v2 java.lang.String), (r10v3 java.lang.String), (r10v2 java.lang.String) binds: [B:112:0x00e8, B:26:0x00e6, B:22:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:112:0x00e8, B:26:0x00e6, B:22:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0199 A[PHI: r8
      0x0199: PHI (r8v4 java.lang.String) = (r8v3 java.lang.String), (r8v2 java.lang.String) binds: [B:40:0x0182, B:30:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        int i2;
        short s;
        short[] sArr;
        String str;
        ViewOnClickListenerC5526 viewOnClickListenerC5526;
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        int iM6981;
        int i7;
        int i8;
        String str2;
        String str3;
        int iM6982;
        int i9;
        int i10;
        int iM2568;
        int i11;
        int i12;
        int i13 = -377570222;
        int i14 = RunnableC1937.f6483;
        int i15 = C1294.f4556;
        int iM2569 = C0630.m2566("ۢۨ") ^ i14;
        int i16 = ((iM2569 ^ i15) * (-19545)) ^ (-1721189995);
        int i17 = iM2569 ^ 1874726128;
        String strM5917 = null;
        String strM3841 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i18 = 0;
        int i19 = 0;
        StringBuilder sb = null;
        short s2 = 0;
        C19099 c19099 = null;
        String strM946 = null;
        ActivityC1292 activityC1292 = null;
        String strM40646 = null;
        ViewOnClickListenerC5526 viewOnClickListenerC5527 = null;
        StringBuilder sb2 = null;
        String strM43994 = null;
        String strM3502 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * 2583) >> 31));
            switch (i13) {
                case -2072899961:
                case 2114183966:
                    C1420.m4905(sb2, strM40646);
                    sArr4 = f49642;
                    i18 = 9;
                    if (C1916.f6442) {
                        iM2568 = (i14 - C0630.m2566("۠ܺ")) * 91;
                        i11 = ((iM2568 ^ i15) * 13177) ^ 264366924;
                        i12 = 206906689;
                    } else {
                        iM2568 = (C0630.m2566("۫ۛ") ^ i14) * (-113);
                        i11 = ((iM2568 ^ i15) * (-20769)) ^ (-1520349450);
                        i12 = 531585334;
                    }
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                case -2056998640:
                case 1628126389:
                    C1047.m3599();
                    if (!C4159.f13567) {
                        iM2568 = (C0630.m2566("ۖۖ") + i14) * 9;
                        i11 = ((iM2568 ^ i15) * (-1053)) ^ 1991163848;
                        i12 = 1458463266;
                        i17 = iM2568 ^ i12;
                        i16 = i11;
                    } else {
                        str3 = strM5917;
                        int iM6983 = C2105.m6981("֨۟") ^ i15;
                        strM5917 = str3;
                        i16 = ((iM6983 ^ i14) * (-3125)) ^ (-570814317);
                        i18 = i18;
                        i17 = iM6983 ^ (-1582864993);
                    }
                    break;
                case -2028462858:
                case -1319003609:
                    if (C7106.m19121(strM43994)) {
                        iM2568 = (i15 - C2105.m6981("۠᩵")) * (-109);
                        i11 = ((iM2568 ^ i14) * 32007) ^ 202542089;
                        i12 = -1858904036;
                    } else {
                        strM946 = strM43994;
                        iM2568 = C0630.m2566("ܶ۬") ^ i14;
                        i11 = ((iM2568 ^ i15) * 20623) ^ (-414496660);
                        i12 = 560115049;
                    }
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                case -1969694540:
                case 1746567021:
                    strM946 = C0050.m946(activityC1292, C0630.m2566(strM3841) ^ 2123011372);
                    iM2568 = C0630.m2566("ܶ۬") ^ i14;
                    i11 = ((iM2568 ^ i15) * 20623) ^ (-414496660);
                    i12 = 560115049;
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                case -1842602038:
                case -1036588572:
                    i19 = 28378;
                    iM6981 = C2105.m6981("ۙܿ") ^ i15;
                    i16 = ((iM6981 ^ i14) * (-28273)) ^ (-336925125);
                    i7 = 1245184623;
                    i8 = iM6981 ^ i7;
                    strM5917 = strM5917;
                    sArr2 = sArr2;
                    int i20 = i18;
                    i17 = i8;
                    i18 = i20;
                    break;
                case -1784639712:
                case -1333685195:
                    sb2 = new StringBuilder();
                    strM40646 = C17324.m40646(c19099.m44016());
                    if (C4117.f13076 <= 0) {
                        iM2568 = (C0630.m2566("۫ۛ") ^ i14) * (-113);
                        i11 = ((iM2568 ^ i15) * (-20769)) ^ (-1520349450);
                        i12 = 531585334;
                    } else {
                        iM2568 = (i15 - C0630.m2566("۠ۜ")) * (-61);
                        i11 = ((iM2568 ^ i14) * 24303) ^ 857084208;
                        i12 = 891478483;
                    }
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                case -1551233733:
                case 480655260:
                    C1420.m4905(sb, strM3502);
                    C1420.m4905(sb, c19099.m43996());
                    C1047.m3601(viewOnClickListenerC5527.f17100, C0050.m947(sb));
                    strM43994 = c19099.m43994();
                    if (strM43994 != null) {
                        iM2568 = C2105.m6981("ۨۧ") ^ i14;
                        i11 = ((iM2568 ^ i15) * 9409) ^ (-1556976977);
                        i12 = 545430002;
                    } else {
                        iM2568 = (i15 - C2105.m6981("۠᩵")) * (-109);
                        i11 = ((iM2568 ^ i14) * 32007) ^ 202542089;
                        i12 = -1858904036;
                    }
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                case -1550918385:
                case -1235243277:
                    i18 = i18;
                    sArr2 = sArr2;
                    strM5917 = C1773.m5917(sArr2, 1, 3, i19);
                    if (C4263.f13799 > 0) {
                        int iM6984 = (i14 - C2105.m6981("ᩳ᩵")) * 77;
                        i16 = ((iM6984 ^ i15) * 11385) ^ 34424335;
                        i8 = iM6984 ^ (-541526093);
                        sArr2 = sArr2;
                        int i21 = i18;
                        i17 = i8;
                        i18 = i21;
                    } else {
                        sArr2 = sArr2;
                        str2 = strM5917;
                        int iM6985 = (C2105.m6981("ۛܶ") ^ i15) * (-5);
                        c19099 = c19099;
                        viewOnClickListenerC5527 = viewOnClickListenerC5527;
                        activityC1292 = activityC1292;
                        i16 = ((iM6985 ^ i14) * 20367) ^ (-1493972092);
                        strM5917 = str2;
                        i18 = i18;
                        i17 = iM6985 ^ (-2050487481);
                        sb = null;
                    }
                    break;
                case -1300485484:
                case 589830986:
                    i18 = i18;
                    short[] sArr5 = sArr2;
                    str3 = strM5917;
                    viewOnClickListenerC5527.f17099 = c19099;
                    viewOnClickListenerC5527.m15668();
                    if (C7811.f24123 < 0) {
                        sb = new StringBuilder();
                        C1420.m4905(sb, c19099.m43986());
                        sArr2 = f49642;
                        if (C1916.f6442) {
                            iM6982 = (i15 - C2105.m6981("ܰܺ")) * 97;
                            i9 = ((iM6982 ^ i14) * (-6455)) ^ (-2126974785);
                            i10 = -226819698;
                            i8 = iM6982 ^ i10;
                            strM5917 = str3;
                            i16 = i9;
                            int i22 = i18;
                            i17 = i8;
                            i18 = i22;
                        } else {
                            str2 = str3;
                        }
                    } else {
                        activityC1292 = activityC1292;
                        sArr2 = sArr5;
                        str2 = str3;
                        c19099 = c19099;
                    }
                    int iM6986 = (C2105.m6981("ۛܶ") ^ i15) * (-5);
                    c19099 = c19099;
                    viewOnClickListenerC5527 = viewOnClickListenerC5527;
                    activityC1292 = activityC1292;
                    i16 = ((iM6986 ^ i14) * 20367) ^ (-1493972092);
                    strM5917 = str2;
                    i18 = i18;
                    i17 = iM6986 ^ (-2050487481);
                    sb = null;
                    break;
                case -1141924957:
                case -602387890:
                    break;
                case -848316290:
                case -672867663:
                    C1420.m4905(sb2, C3911.m11919(sArr4, i18, 2, i19));
                    C3245.m9923(sb2, strM946);
                    RunnableC1937.m6377(viewOnClickListenerC5527.f17096, C0050.m947(sb2));
                    i18 = i18;
                    sArr2 = sArr2;
                    strM5917 = strM5917;
                    iM6981 = C2105.m6981("᩹ܺ") ^ i15;
                    i16 = ((iM6981 ^ i14) * 9319) ^ (-1663628851);
                    i7 = 350492265;
                    i8 = iM6981 ^ i7;
                    strM5917 = strM5917;
                    sArr2 = sArr2;
                    int i23 = i18;
                    i17 = i8;
                    i18 = i23;
                    break;
                case -782811889:
                case -394063298:
                    strM3841 = C1128.m3841(f49642, 6, 3, i19);
                    if (RunnableC1937.f6483 < 0) {
                        iM2568 = C0630.m2566("֨᩸") ^ i15;
                        i11 = ((iM2568 ^ i14) * (-24017)) ^ (-357077114);
                        i12 = 630237007;
                        i17 = iM2568 ^ i12;
                        i16 = i11;
                    } else {
                        str3 = strM5917;
                        int iM6987 = C2105.m6981("֨۟") ^ i15;
                        strM5917 = str3;
                        i16 = ((iM6987 ^ i14) * (-3125)) ^ (-570814317);
                        i18 = i18;
                        i17 = iM6987 ^ (-1582864993);
                    }
                    break;
                case -535590918:
                case 984981931:
                    i19 = 38215;
                    iM6981 = C2105.m6981("ۙܿ") ^ i15;
                    i16 = ((iM6981 ^ i14) * (-28273)) ^ (-336925125);
                    i7 = 1245184623;
                    i8 = iM6981 ^ i7;
                    strM5917 = strM5917;
                    sArr2 = sArr2;
                    int i24 = i18;
                    i17 = i8;
                    i18 = i24;
                    break;
                case -511130685:
                case 2011491096:
                    C1711.m5736();
                    if (C22628.f73083 <= 0) {
                        i2 = i18;
                        s = s2;
                        sArr = sArr2;
                        str = strM5917;
                        viewOnClickListenerC5526 = viewOnClickListenerC5527;
                        iM2566 = C0630.m2566("ܳۨ") ^ i15;
                        i3 = ((iM2566 ^ i14) * 16703) ^ 2042919055;
                        i4 = -404504626;
                        int i25 = iM2566 ^ i4;
                        strM5917 = str;
                        sArr2 = sArr;
                        ViewOnClickListenerC5526 viewOnClickListenerC5528 = viewOnClickListenerC5526;
                        s2 = s;
                        i18 = i2;
                        i17 = i25;
                        i16 = i3;
                        viewOnClickListenerC5527 = viewOnClickListenerC5528;
                    } else {
                        str3 = strM5917;
                        int iM6988 = C2105.m6981("֨۟") ^ i15;
                        strM5917 = str3;
                        i16 = ((iM6988 ^ i14) * (-3125)) ^ (-570814317);
                        i18 = i18;
                        i17 = iM6988 ^ (-1582864993);
                    }
                    break;
                case -459097899:
                case 645990197:
                    int i26 = i18;
                    short[] sArr6 = sArr2;
                    String str4 = strM5917;
                    int i27 = (s2 * s2) + 599076;
                    short s3 = s2;
                    ViewOnClickListenerC5526 viewOnClickListenerC5529 = viewOnClickListenerC5527;
                    if ((s3 * 1548) - i27 <= 0) {
                        iM2567 = (C0630.m2566("᩶᩻") ^ i14) * 93;
                        i5 = ((iM2567 ^ i15) * 12415) ^ 1598107686;
                        i6 = 1824070681;
                    } else {
                        iM2567 = (C0630.m2566("ۗ۫") + i14) * (-85);
                        i5 = ((iM2567 ^ i15) * (-29813)) ^ (-1331055430);
                        i6 = 1864217584;
                    }
                    int i28 = iM2567 ^ i6;
                    strM5917 = str4;
                    sArr2 = sArr6;
                    i17 = i28;
                    i18 = i26;
                    s2 = s3;
                    i16 = i5;
                    viewOnClickListenerC5527 = viewOnClickListenerC5529;
                    break;
                case -449810494:
                case -40193648:
                    i18 = i18;
                    sArr2 = sArr2;
                    strM5917 = strM5917;
                    if (abstractC3255 instanceof ViewOnClickListenerC5526) {
                        int iM25610 = (i14 - C0630.m2566("ܰۤ")) * (-91);
                        int i29 = ((iM25610 ^ i15) * (-10425)) ^ 2128744641;
                        int i30 = iM25610 ^ 1151708250;
                        strM5917 = strM5917;
                        sArr2 = sArr2;
                        i16 = i29;
                        i18 = i18;
                        i17 = i30;
                    } else {
                        iM6981 = C2105.m6981("᩹ܺ") ^ i15;
                        i16 = ((iM6981 ^ i14) * 9319) ^ (-1663628851);
                        i7 = 350492265;
                        i8 = iM6981 ^ i7;
                        strM5917 = strM5917;
                        sArr2 = sArr2;
                        int i210 = i18;
                        i17 = i8;
                        i18 = i210;
                    }
                    break;
                case -99361182:
                case 85959199:
                    strM3502 = C1005.m3502(sArr3, 4, 2, i19);
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2568 = (C0630.m2566("ۖۖ") + i14) * 9;
                        i11 = ((iM2568 ^ i15) * (-1053)) ^ 1991163848;
                        i12 = 1458463266;
                    } else {
                        iM2568 = C0630.m2566("᩷ᩳ") ^ i14;
                        i11 = ((iM2568 ^ i15) * 1721) ^ 1503643154;
                        i12 = 845847757;
                    }
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                case 246375811:
                case 971060418:
                    C2105.m6982();
                    C4117.m12364();
                    break;
                case 287168375:
                case 600759669:
                    if (C4075.f12947 >= 0) {
                        iM2568 = (C0630.m2566("۫ۛ") ^ i14) * (-113);
                        i11 = ((iM2568 ^ i15) * (-20769)) ^ (-1520349450);
                        i12 = 531585334;
                        i17 = iM2568 ^ i12;
                        i16 = i11;
                    } else {
                        i2 = i18;
                        s = s2;
                        sArr = sArr2;
                        str = strM5917;
                        viewOnClickListenerC5526 = viewOnClickListenerC5527;
                        iM2566 = C0630.m2566("ܳۨ") ^ i15;
                        i3 = ((iM2566 ^ i14) * 16703) ^ 2042919055;
                        i4 = -404504626;
                        int i211 = iM2566 ^ i4;
                        strM5917 = str;
                        sArr2 = sArr;
                        ViewOnClickListenerC5526 viewOnClickListenerC55210 = viewOnClickListenerC5526;
                        s2 = s;
                        i18 = i2;
                        i17 = i211;
                        i16 = i3;
                        viewOnClickListenerC5527 = viewOnClickListenerC55210;
                    }
                    break;
                case 532730623:
                case 1060338587:
                    str3 = strM5917;
                    C1420.m4905(sb, str3);
                    C3245.m9923(sb, C22927.m51020(c19099.m43998()));
                    sArr3 = f49642;
                    if (C3911.f12484 < 0) {
                        i18 = i18;
                        iM6982 = (C2105.m6981("᩹ۚ") ^ i15) * 57;
                        i9 = ((iM6982 ^ i14) * 163) ^ 2133183405;
                        i10 = 58807480;
                        i8 = iM6982 ^ i10;
                        strM5917 = str3;
                        i16 = i9;
                        int i212 = i18;
                        i17 = i8;
                        i18 = i212;
                    } else {
                        int iM6989 = C2105.m6981("֨۟") ^ i15;
                        strM5917 = str3;
                        i16 = ((iM6989 ^ i14) * (-3125)) ^ (-570814317);
                        i18 = i18;
                        i17 = iM6989 ^ (-1582864993);
                    }
                    break;
                case 1223421936:
                case 2053365395:
                    C0382.m1848();
                    C1711.m5736();
                    str3 = strM5917;
                    int iM69810 = C2105.m6981("֨۟") ^ i15;
                    strM5917 = str3;
                    i16 = ((iM69810 ^ i14) * (-3125)) ^ (-570814317);
                    i18 = i18;
                    i17 = iM69810 ^ (-1582864993);
                    break;
                case 1580027862:
                case 1626668884:
                    sArr2 = sArr2;
                    viewOnClickListenerC5527 = (ViewOnClickListenerC5526) abstractC3255;
                    i18 = i18;
                    ActivityC1292 activityC1293 = this.f49643;
                    strM5917 = strM5917;
                    activityC1292 = activityC1293;
                    c19099 = (C19099) C22628.m50605(activityC1293.f4540, i);
                    if (C0630.f2410 > 0) {
                        int iM69811 = C2105.m6981("ܿۛ") ^ i14;
                        i16 = ((iM69811 ^ i15) * (-15015)) ^ 123308971;
                        i8 = iM69811 ^ (-1295310052);
                        viewOnClickListenerC5527 = viewOnClickListenerC5527;
                        activityC1292 = activityC1292;
                        c19099 = c19099;
                        strM5917 = strM5917;
                        sArr2 = sArr2;
                        int i213 = i18;
                        i17 = i8;
                        i18 = i213;
                    } else {
                        sArr2 = sArr2;
                        str2 = strM5917;
                        int iM69812 = (C2105.m6981("ۛܶ") ^ i15) * (-5);
                        c19099 = c19099;
                        viewOnClickListenerC5527 = viewOnClickListenerC5527;
                        activityC1292 = activityC1292;
                        i16 = ((iM69812 ^ i14) * 20367) ^ (-1493972092);
                        strM5917 = str2;
                        i18 = i18;
                        i17 = iM69812 ^ (-2050487481);
                        sb = null;
                    }
                    break;
                default:
                    i2 = i18;
                    viewOnClickListenerC5526 = viewOnClickListenerC5527;
                    sArr = sArr2;
                    str = strM5917;
                    s = f49642[0];
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i15;
                        i3 = ((iM2566 ^ i14) * (-3859)) ^ 1151912036;
                        i4 = 1269497579;
                    } else {
                        iM2566 = C0630.m2566("ܳۨ") ^ i15;
                        i3 = ((iM2566 ^ i14) * 16703) ^ 2042919055;
                        i4 = -404504626;
                    }
                    int i214 = iM2566 ^ i4;
                    strM5917 = str;
                    sArr2 = sArr;
                    ViewOnClickListenerC5526 viewOnClickListenerC55211 = viewOnClickListenerC5526;
                    s2 = s;
                    i18 = i2;
                    i17 = i214;
                    i16 = i3;
                    viewOnClickListenerC5527 = viewOnClickListenerC55211;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ActivityC1292 activityC1292 = null;
        int iM7032 = 0;
        int i = -1293867273;
        int i2 = RunnableC0588.f2309;
        int i3 = C4117.f13076;
        int iM6981 = (C2105.m6981("᩸ۗ") + i3) * (-75);
        int i4 = ((iM6981 ^ i2) * 27421) ^ (-1040505636);
        int i5 = 954188959;
        while (true) {
            i = ((((i ^ i2) * (-18319)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2075332370:
                case 1257349266:
                    return iM7032 + 1;
                case -1989732391:
                case -1122828538:
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("۠ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8837)) ^ 957150207;
                        i5 = 1250862927;
                    } else {
                        iM6981 = C2105.m6981("ܽ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30793)) ^ 938119481;
                        i5 = -25511001;
                    }
                    break;
                case -1659090312:
                case -440018971:
                    if (!RunnableC1108.m3790()) {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM6981 = C2105.m6981("۠ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8837)) ^ 957150207;
                        i5 = 1250862927;
                    }
                    break;
                case -1584455841:
                case 475271064:
                    C2520.m8026();
                    C4117.m12364();
                    iM6981 = C2105.m6981("۠ۛ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-8837)) ^ 957150207;
                    i5 = 1250862927;
                    break;
                case -1517330892:
                case 1666060919:
                    if (C0714.m2813(activityC1292.f4540)) {
                        iM6981 = (C2105.m6981("ܶᩴ") ^ i3) * (-23);
                        i4 = ((iM6981 ^ i2) * 25873) ^ (-165881972);
                        i5 = -1773164603;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩺۟")) * 15;
                        i4 = ((iM6981 ^ i2) * 5939) ^ 1438161703;
                        i5 = -116881702;
                    }
                    break;
                case -1515735868:
                case 1946697414:
                    return 0;
                case -1457354591:
                case -585736688:
                    activityC1292 = this.f49643;
                    if (C3746.m11369() >= 0) {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM6981 = C2105.m6981("ܿܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8437) ^ 783485365;
                        i5 = -2004885377;
                    }
                    break;
                case -1254878574:
                case 1750495237:
                    if (C2126.f7087) {
                        iM6981 = (i3 - C2105.m6981("֡ܿ")) * 91;
                        i4 = ((iM6981 ^ i2) * 19365) ^ 772438059;
                        i5 = 2028355980;
                    } else {
                        iM6981 = C0630.m2566("֫᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24691) ^ (-553875673);
                        i5 = 1478044095;
                    }
                    break;
                case -1042146243:
                case 174855813:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ۧۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21935) ^ (-1765899197);
                        i5 = 1123198440;
                    } else {
                        iM6981 = (C0630.m2566("ܶۛ") + i2) * 17;
                        i4 = ((iM6981 ^ i3) * (-23295)) ^ (-1394855760);
                        i5 = -1673258656;
                    }
                    break;
                case -1029800568:
                case 1227103820:
                    if (C0382.f1805) {
                        iM6981 = (C0630.m2566("᩻᩵") ^ i3) * (-21);
                        i4 = ((iM6981 ^ i2) * (-13615)) ^ (-175353849);
                        i5 = -1995832774;
                    } else {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    }
                    break;
                case -747273445:
                case 2000680229:
                    C0382.m1848();
                    return 0;
                case -620132697:
                case 919609212:
                    C1773.m5908();
                    if (C0422.f1886 > 0) {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25419) ^ 1050202315;
                        i5 = -1291013112;
                    }
                    break;
                case -558457588:
                case 1807165493:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i3 - C2105.m6981("֡ܿ")) * 91;
                        i4 = ((iM6981 ^ i2) * 19365) ^ 772438059;
                        i5 = 2028355980;
                    } else {
                        iM6981 = C0630.m2566("᩹᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-16511)) ^ (-729079836);
                        i5 = 1205120541;
                    }
                    break;
                case -325642300:
                case 1155299488:
                    iM7032 = C2126.m7032(activityC1292.f4540);
                    if (C3746.m11369() >= 0) {
                        iM6981 = C2105.m6981("۠ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8837)) ^ 957150207;
                        i5 = 1250862927;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܽܺ")) * 123;
                        i4 = ((iM6981 ^ i3) * 953) ^ 1415015877;
                        i5 = -1319817164;
                    }
                    break;
                case 381040753:
                case 1875354555:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM6981 = (C0630.m2566("᩸᩵") ^ i3) * 127;
                        i4 = ((iM6981 ^ i2) * (-24687)) ^ 386027741;
                        i5 = 1203455722;
                    }
                    break;
                case 1457110419:
                case 1583200176:
                    C4616.m13552();
                    if (!C2126.m7040()) {
                        iM6981 = (i3 - C2105.m6981("֡ܿ")) * 91;
                        i4 = ((iM6981 ^ i2) * 19365) ^ 772438059;
                        i5 = 2028355980;
                    } else {
                        iM6981 = C2105.m6981("۠ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8837)) ^ 957150207;
                        i5 = 1250862927;
                    }
                    break;
                case 1736556241:
                case 2144164495:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۢ᩻")) * (-109);
                        i4 = ((iM6981 ^ i3) * 19571) ^ 791830581;
                        i5 = 534635097;
                    }
                    break;
                default:
                    if (C1005.f3721) {
                        iM6981 = (i3 - C2105.m6981("ܳܰ")) * (-121);
                        i4 = ((iM6981 ^ i2) * 32167) ^ (-1089026592);
                        i5 = 1917181663;
                    } else {
                        iM6981 = C2105.m6981("ۛܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0112 A[PHI: r2 r12 r13 r14
      0x0112: PHI (r2v8 android.view.LayoutInflater) = (r2v4 android.view.LayoutInflater), (r2v2 android.view.LayoutInflater) binds: [B:33:0x0110, B:16:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r12v6 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:33:0x0110, B:16:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r13v6 int) = (r13v3 int), (r13v2 int) binds: [B:33:0x0110, B:16:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r14v6 int) = (r14v3 int), (r14v2 int) binds: [B:33:0x0110, B:16:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0286 A[PHI: r9 r10 r19 r20
      0x0286: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:72:0x0284, B:68:0x026a, B:62:0x0222, B:58:0x0201, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:72:0x0284, B:68:0x026a, B:62:0x0222, B:58:0x0201, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:72:0x0284, B:68:0x026a, B:62:0x0222, B:58:0x0201, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r20v12 l.֨ᩳ᩷) = (r20v0 l.֨ᩳ᩷), (r20v1 l.֨ᩳ᩷), (r20v2 l.֨ᩳ᩷), (r20v3 l.֨ᩳ᩷), (r20v13 l.֨ᩳ᩷) binds: [B:72:0x0284, B:68:0x026a, B:62:0x0222, B:58:0x0201, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM6981;
        int i2;
        int i3;
        int iM6982;
        int i4;
        int iM6983;
        int i5;
        int i6;
        int i7 = C3245.f10203;
        int i8 = ViewOnClickListenerC1958.f6529;
        int iM2566 = C0630.m2566("֡֨") ^ i8;
        int i9 = ((iM2566 ^ i7) * (-23019)) ^ 139610824;
        LayoutInflater layoutInflaterFrom = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM2566 ^ (-2104936790);
        ActivityC1292 activityC1292 = null;
        int i11 = 0;
        boolean z = false;
        int iM2567 = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        short s3 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1623379069;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i7) * 13267) >> 31));
            switch (i16) {
                case -1992694990:
                case -1954663741:
                    activityC1292 = activityC1292;
                    i12 = (s * s2) + 1;
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C2105.m6981("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM6981 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                    } else {
                        iM6981 = C0630.m2566("᩸ܽ") ^ i8;
                        i2 = ((iM6981 ^ i7) * 10883) ^ (-1208061367);
                        i3 = 1266876402;
                    }
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
                case -1971038001:
                case 1904866617:
                    View view = new View(activityC1292);
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        activityC1292 = activityC1292;
                        int iM4384 = C1294.m4384(5.0f);
                        if (C4159.m12565() < 0) {
                            view.setLayoutParams(new ViewGroup.LayoutParams(-1, iM4384));
                            return new C2704(view);
                        }
                        iM6981 = (C0630.m2566("᩹᩺") ^ i7) * (-77);
                        i2 = ((iM6981 ^ i8) * (-6697)) ^ (-726391227);
                        i3 = -1584560808;
                        i10 = iM6981 ^ i3;
                        i9 = i2;
                        activityC1292 = activityC1292;
                    }
                    activityC1292 = activityC1292;
                    iM6981 = (C2105.m6981("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i2 = ((iM6981 ^ i8) * (-13213)) ^ (-2022658300);
                    i3 = 1028704515;
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
                case -1849171073:
                case -96410048:
                    RunnableC0588.m2441();
                    iM6983 = C0630.m2566("ᩴܿ") ^ i7;
                    i5 = ((iM6983 ^ i8) * (-2647)) ^ 285384696;
                    i6 = 2093961680;
                    i10 = iM6983 ^ i6;
                    i9 = i5;
                    break;
                case -1629146404:
                case -1345349481:
                    i13 = 44689;
                    iM6981 = (i8 - C0630.m2566("ܳۡ")) * (-105);
                    i2 = ((iM6981 ^ i7) * 1103) ^ (-907392671);
                    i3 = 214707103;
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
                case -1275127950:
                case 13335123:
                    C2958.m9034();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6982 = C2105.m6981("֫ܺ") ^ i8;
                        i9 = ((iM6982 ^ i7) * 15181) ^ (-300179457);
                        i4 = -1302160902;
                        i10 = iM6982 ^ i4;
                    } else {
                        activityC1292 = activityC1292;
                        iM6981 = (C2105.m6981("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM6981 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                        i10 = iM6981 ^ i3;
                        i9 = i2;
                        activityC1292 = activityC1292;
                    }
                    break;
                case -1134380431:
                case 448949668:
                    iM2567 = C0630.m2566(C1420.m4902(sArr2, i14, i15, i13));
                    if (C1420.f5096 > 0) {
                        iM6983 = C0630.m2566("᩵ۧ") ^ i8;
                        i5 = ((iM6983 ^ i7) * (-14489)) ^ (-300095579);
                        i6 = 298582583;
                        i10 = iM6983 ^ i6;
                        i9 = i5;
                    } else {
                        iM6982 = C2105.m6981("֫ܺ") ^ i8;
                        i9 = ((iM6982 ^ i7) * 15181) ^ (-300179457);
                        i4 = -1302160902;
                        i10 = iM6982 ^ i4;
                    }
                    break;
                case -970106670:
                case -457621004:
                    layoutInflaterFrom = LayoutInflater.from(activityC1292);
                    sArr2 = f49642;
                    i14 = 12;
                    i15 = 3;
                    if (RunnableC0588.m2441() >= 0) {
                        iM6983 = C0630.m2566("ᩴܺ") ^ i8;
                        i5 = ((iM6983 ^ i7) * 9927) ^ 953188176;
                        i6 = -1369409231;
                    } else {
                        iM6983 = C0630.m2566("ۛ۫") ^ i7;
                        i5 = ((iM6983 ^ i8) * 23481) ^ 901042722;
                        i6 = 951840444;
                    }
                    i10 = iM6983 ^ i6;
                    i9 = i5;
                    break;
                case -804039254:
                case 232292312:
                    return new ViewOnClickListenerC5526(activityC1292, layoutInflaterFrom.inflate(i11, viewGroup, z));
                case -693492038:
                case 689286570:
                    activityC1292 = activityC1292;
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM6981 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                    } else {
                        iM6981 = C2105.m6981("۬۫") ^ i8;
                        i2 = ((iM6981 ^ i7) * (-20583)) ^ 706389724;
                        i3 = 1449731952;
                    }
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
                case -680408264:
                case 1896622768:
                    activityC1292 = this.f49643;
                    if (i != 0) {
                        iM6983 = (C2105.m6981("ۤ᩺") + i7) * 59;
                        i5 = ((iM6983 ^ i8) * (-17525)) ^ 1484736233;
                        i6 = -2086191053;
                        i10 = iM6983 ^ i6;
                        i9 = i5;
                    } else {
                        iM6982 = (i8 - C2105.m6981("᩻᩵")) * 3;
                        i9 = ((iM6982 ^ i7) * 19225) ^ 385489601;
                        i4 = 978167365;
                        i10 = iM6982 ^ i4;
                    }
                    break;
                case -609946932:
                case 379507256:
                    i13 = 8654;
                    iM6981 = (i8 - C0630.m2566("ܳۡ")) * (-105);
                    i2 = ((iM6981 ^ i7) * 1103) ^ (-907392671);
                    i3 = 214707103;
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
                case -487819897:
                case 530735104:
                    activityC1292 = activityC1292;
                    s3 = 1;
                    if (C3746.m11369() >= 0) {
                        iM6981 = (C2105.m6981("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM6981 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                    } else {
                        iM6981 = C0630.m2566("۠᩺") ^ i8;
                        i2 = ((iM6981 ^ i7) * (-4945)) ^ (-241121525);
                        i3 = 460785669;
                    }
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
                case -474680218:
                case 1154480596:
                    if (C0237.f1507 == 0) {
                        iM6983 = C0630.m2566("ᩴܿ") ^ i7;
                        i5 = ((iM6983 ^ i8) * (-2647)) ^ 285384696;
                        i6 = 2093961680;
                    } else {
                        iM6983 = C0630.m2566("ᩴܺ") ^ i8;
                        i5 = ((iM6983 ^ i7) * 9927) ^ 953188176;
                        i6 = -1369409231;
                    }
                    i10 = iM6983 ^ i6;
                    i9 = i5;
                    break;
                case -431912158:
                case 1610945069:
                    if (C0630.f2410 <= 0) {
                        activityC1292 = activityC1292;
                        iM6981 = (C2105.m6981("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM6981 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                        i10 = iM6981 ^ i3;
                        i9 = i2;
                        activityC1292 = activityC1292;
                    } else {
                        iM6983 = C0630.m2566("ᩴܿ") ^ i7;
                        i5 = ((iM6983 ^ i8) * (-2647)) ^ 285384696;
                        i6 = 2093961680;
                        i10 = iM6983 ^ i6;
                        i9 = i5;
                    }
                    break;
                case 38428216:
                case 523392196:
                    activityC1292 = activityC1292;
                    sArr = f49642;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM6981 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                    } else {
                        iM6981 = C0630.m2566("ۢۙ") ^ i7;
                        i2 = ((iM6981 ^ i8) * (-29019)) ^ 1562245554;
                        i3 = -815348073;
                    }
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
                case 167853375:
                case 1588933363:
                    C3432.m10477();
                    C1128.m3851();
                    return null;
                case 189755468:
                case 1173134610:
                    i11 = 2117189093 ^ iM2567;
                    if (C3019.f9544 >= 0) {
                        activityC1292 = activityC1292;
                        z = false;
                        iM6981 = (C0630.m2566("᩹᩺") ^ i7) * (-77);
                        i2 = ((iM6981 ^ i8) * (-6697)) ^ (-726391227);
                        i3 = -1584560808;
                        i10 = iM6981 ^ i3;
                        i9 = i2;
                        activityC1292 = activityC1292;
                    } else {
                        int iM2568 = C0630.m2566("ۙۘ") ^ i8;
                        i9 = ((iM2568 ^ i7) * 5103) ^ (-220246350);
                        i10 = iM2568 ^ 1509622000;
                        z = false;
                    }
                    break;
                case 1330922408:
                case 1627167496:
                    activityC1292 = activityC1292;
                    int i17 = s + s3;
                    if (i12 - (i17 * i17) > 0) {
                        iM6981 = (C0630.m2566("֡۠") ^ i7) * 89;
                        i2 = ((iM6981 ^ i8) * (-3049)) ^ 581651923;
                        i3 = 1403838600;
                    } else {
                        iM6981 = C2105.m6981("ܺۗ") ^ i7;
                        i2 = ((iM6981 ^ i8) * 32569) ^ (-1072937978);
                        i3 = -102937479;
                    }
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
                default:
                    activityC1292 = activityC1292;
                    s = sArr[11];
                    s2 = 2;
                    if (C0714.m2805()) {
                        iM6981 = (C2105.m6981("֨ۨ") + i7) * (-47);
                        i2 = ((iM6981 ^ i8) * 25325) ^ (-29861822);
                        i3 = 552173035;
                    } else {
                        iM6981 = (C0630.m2566("᩹᩺") ^ i7) * (-77);
                        i2 = ((iM6981 ^ i8) * (-6697)) ^ (-726391227);
                        i3 = -1584560808;
                    }
                    i10 = iM6981 ^ i3;
                    i9 = i2;
                    activityC1292 = activityC1292;
                    break;
            }
        }
    }

    public C16108(ActivityC1292 activityC1292) {
        this.f49643 = activityC1292;
    }
}
