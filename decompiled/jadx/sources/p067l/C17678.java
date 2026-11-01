package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17678 extends AbstractC21283 {

    /* JADX INFO: renamed from: ۜۙܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f82251 = {7807, 28410, 28410, 28410, 28410, 28410, 2426, -3301, 5903, 28384, 28410, 9174, 29056, 22605, -20227};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC3597 f52809;

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = 765177751;
        int i4 = AbstractC0942.f81890;
        int i5 = RunnableC0871.f81839;
        int iM55979 = C0946.m55979("ᩴ᩹") ^ i5;
        int i6 = ((iM55979 ^ i4) * 23093) ^ 1297014390;
        int i7 = 571719278;
        while (true) {
            i3 = ((((i3 ^ i4) * (-6917)) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -1793222872:
                case 1287554152:
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("ܶۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 15503) ^ (-1357976035);
                        i7 = -125136184;
                    } else {
                        iM55979 = C0946.m55979("۟᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-21351)) ^ (-438811810);
                        i7 = -1430630664;
                    }
                    break;
                case -1651531632:
                case -988616110:
                    return 0;
                case -1604288559:
                case -717383589:
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0873.m55680("᩺ᩴ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-17259)) ^ (-1200792296);
                        i7 = -1912048203;
                    } else {
                        iM55979 = C0946.m55979("۠᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-23107)) ^ (-294308221);
                        i7 = -2094574163;
                    }
                    break;
                case -1174384356:
                case 724020201:
                    C0854.m55595();
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0946.m55979("ܶۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 15503) ^ (-1357976035);
                        i7 = -125136184;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۨ֨")) * 19;
                        i6 = ((iM55979 ^ i5) * 16523) ^ 1187622413;
                        i7 = -1362712099;
                    }
                    break;
                case -1144685413:
                case -1067516252:
                    C0873.m55678();
                    return 0;
                case -1142223036:
                case 548123599:
                    if (C1964.f83032 <= 0) {
                        iM55979 = (i4 - C0946.m55979("ۨ֨")) * 19;
                        i6 = ((iM55979 ^ i5) * 16523) ^ 1187622413;
                        i7 = -1362712099;
                    } else {
                        iM55979 = C0946.m55979("ۧᩳ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-28939)) ^ 1757338314;
                        i7 = 1288083352;
                    }
                    break;
                case -1005796412:
                case -209012843:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM55979 = (C0873.m55680("ܿ᩹") ^ i5) * (-3);
                        i6 = ((iM55979 ^ i4) * 19401) ^ 507201516;
                        i7 = 1180897366;
                    } else {
                        iM55979 = C0946.m55979("ܿۙ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-20179)) ^ 456743644;
                        i7 = -1816624469;
                    }
                    break;
                case -998332658:
                case 743264680:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i4 - C0873.m55680("᩹ۧ")) * (-117);
                        i6 = ((iM55979 ^ i5) * 29903) ^ 1768182573;
                        i7 = 1319176942;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ܿ۟")) * (-39);
                        i6 = ((iM55979 ^ i4) * 15595) ^ (-568719417);
                        i7 = -1295177828;
                    }
                    break;
                case -844947306:
                case -612885898:
                    C0898.m55800();
                    if (C0873.f81841 > 0) {
                        iM55979 = C0873.m55680("᩺ᩴ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-17259)) ^ (-1200792296);
                        i7 = -1912048203;
                    } else {
                        iM55979 = C0946.m55979("ܶۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 15503) ^ (-1357976035);
                        i7 = -125136184;
                    }
                    break;
                case -838614384:
                case 947025739:
                    itemCount = getItemCount();
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0873.m55680("ܰ۠") + i4) * (-89);
                        i6 = ((iM55979 ^ i5) * 1001) ^ 427473434;
                        i7 = 331833811;
                    } else {
                        iM55979 = C0873.m55680("ۖۚ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 8131) ^ (-111070487);
                        i7 = -1524571438;
                    }
                    break;
                case -577925247:
                case 1260077405:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("᩺ᩴ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-17259)) ^ (-1200792296);
                        i7 = -1912048203;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩺ܺ")) * 5;
                        i6 = ((iM55979 ^ i5) * 19887) ^ 310825977;
                        i7 = -1110170762;
                    }
                    break;
                case -103414783:
                case 1603518563:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (i4 - C0946.m55979("ۨ֨")) * 19;
                        i6 = ((iM55979 ^ i5) * 16523) ^ 1187622413;
                        i7 = -1362712099;
                    } else {
                        iM55979 = (C0946.m55979("ۢ᩶") + i5) * (-81);
                        i6 = ((iM55979 ^ i4) * (-4693)) ^ 732172796;
                        i7 = 1790273061;
                    }
                    break;
                case -66048500:
                case 112593969:
                    if (C0894.m55769() >= 0) {
                        iM55979 = (i4 - C0873.m55680("᩹ۧ")) * (-117);
                        i6 = ((iM55979 ^ i5) * 29903) ^ 1768182573;
                        i7 = 1319176942;
                    } else {
                        iM55979 = (C0946.m55979("֨ܳ") ^ i4) * (-111);
                        i6 = ((iM55979 ^ i5) * 26809) ^ 1566939725;
                        i7 = 866289131;
                    }
                    break;
                case 210797305:
                case 1949738720:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (i4 - C0873.m55680("᩹ۧ")) * (-117);
                        i6 = ((iM55979 ^ i5) * 29903) ^ 1768182573;
                        i7 = 1319176942;
                    } else {
                        iM55979 = (C0873.m55680("ܺܿ") ^ i5) * 77;
                        i6 = ((iM55979 ^ i4) * (-28181)) ^ (-138253877);
                        i7 = -979637942;
                    }
                    break;
                case 401655072:
                case 2105624566:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (i4 - C0873.m55680("᩹ۧ")) * (-117);
                        i6 = ((iM55979 ^ i5) * 29903) ^ 1768182573;
                        i7 = 1319176942;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۨ֨")) * 19;
                        i6 = ((iM55979 ^ i5) * 16523) ^ 1187622413;
                        i7 = -1362712099;
                    }
                    break;
                case 599065546:
                case 1634831113:
                    C0861.m55626();
                    iM55979 = (i4 - C0946.m55979("ۨ֨")) * 19;
                    i6 = ((iM55979 ^ i5) * 16523) ^ 1187622413;
                    i7 = -1362712099;
                    break;
                case 1551586985:
                case 1953358263:
                    return i2;
                default:
                    if (C1404.m56468()) {
                        iM55979 = C0873.m55680("ۢۗ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-6185)) ^ (-1252009693);
                        i7 = -757046585;
                    } else {
                        iM55979 = (C0873.m55680("ܰ۠") + i4) * (-89);
                        i6 = ((iM55979 ^ i5) * 1001) ^ 427473434;
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
    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        int i2;
        short s;
        short[] sArr;
        String str;
        ViewOnClickListenerC7621 viewOnClickListenerC7621;
        int iM55680;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int iM55979;
        int i7;
        int i8;
        String str2;
        String str3;
        int iM559710;
        int i9;
        int i10;
        int iM55682;
        int i11;
        int i12;
        int i13 = -377570222;
        int i14 = RunnableC0938.f81886;
        int i15 = C0906.f81862;
        int iM55683 = C0873.m55680("ۢۨ") ^ i14;
        int i16 = ((iM55683 ^ i15) * (-19545)) ^ (-1721189995);
        int i17 = iM55683 ^ 1874726128;
        String strM55893 = null;
        String strM55792 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i18 = 0;
        int i19 = 0;
        StringBuilder sb = null;
        short s2 = 0;
        C20521 c20521 = null;
        String strM55590 = null;
        ActivityC3597 activityC3597 = null;
        String strM42897 = null;
        ViewOnClickListenerC7621 viewOnClickListenerC7622 = null;
        StringBuilder sb2 = null;
        String strM46288 = null;
        String strM55750 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * 2583) >> 31));
            switch (i13) {
                case -2072899961:
                case 2114183966:
                    C0912.m55825(sb2, strM42897);
                    sArr4 = f82251;
                    i18 = 9;
                    if (C0937.f81884) {
                        iM55682 = (i14 - C0873.m55680("۠ܺ")) * 91;
                        i11 = ((iM55682 ^ i15) * 13177) ^ 264366924;
                        i12 = 206906689;
                    } else {
                        iM55682 = (C0873.m55680("۫ۛ") ^ i14) * (-113);
                        i11 = ((iM55682 ^ i15) * (-20769)) ^ (-1520349450);
                        i12 = 531585334;
                    }
                    i17 = iM55682 ^ i12;
                    i16 = i11;
                    break;
                case -2056998640:
                case 1628126389:
                    C0894.m55769();
                    if (!C1048.f81963) {
                        iM55682 = (C0873.m55680("ۖۖ") + i14) * 9;
                        i11 = ((iM55682 ^ i15) * (-1053)) ^ 1991163848;
                        i12 = 1458463266;
                        i17 = iM55682 ^ i12;
                        i16 = i11;
                    } else {
                        str3 = strM55893;
                        int iM559711 = C0946.m55979("֨۟") ^ i15;
                        strM55893 = str3;
                        i16 = ((iM559711 ^ i14) * (-3125)) ^ (-570814317);
                        i18 = i18;
                        i17 = iM559711 ^ (-1582864993);
                    }
                    break;
                case -2028462858:
                case -1319003609:
                    if (C1194.m56397(strM46288)) {
                        iM55682 = (i15 - C0946.m55979("۠᩵")) * (-109);
                        i11 = ((iM55682 ^ i14) * 32007) ^ 202542089;
                        i12 = -1858904036;
                    } else {
                        strM55590 = strM46288;
                        iM55682 = C0873.m55680("ܶ۬") ^ i14;
                        i11 = ((iM55682 ^ i15) * 20623) ^ (-414496660);
                        i12 = 560115049;
                    }
                    i17 = iM55682 ^ i12;
                    i16 = i11;
                    break;
                case -1969694540:
                case 1746567021:
                    strM55590 = C0845.m55590(activityC3597, C0873.m55680(strM55792) ^ 2123011372);
                    iM55682 = C0873.m55680("ܶ۬") ^ i14;
                    i11 = ((iM55682 ^ i15) * 20623) ^ (-414496660);
                    i12 = 560115049;
                    i17 = iM55682 ^ i12;
                    i16 = i11;
                    break;
                case -1842602038:
                case -1036588572:
                    i19 = 28378;
                    iM55979 = C0946.m55979("ۙܿ") ^ i15;
                    i16 = ((iM55979 ^ i14) * (-28273)) ^ (-336925125);
                    i7 = 1245184623;
                    i8 = iM55979 ^ i7;
                    strM55893 = strM55893;
                    sArr2 = sArr2;
                    int i20 = i18;
                    i17 = i8;
                    i18 = i20;
                    break;
                case -1784639712:
                case -1333685195:
                    sb2 = new StringBuilder();
                    strM42897 = C18833.m42897(c20521.m46310());
                    if (C1046.f81962 <= 0) {
                        iM55682 = (C0873.m55680("۫ۛ") ^ i14) * (-113);
                        i11 = ((iM55682 ^ i15) * (-20769)) ^ (-1520349450);
                        i12 = 531585334;
                    } else {
                        iM55682 = (i15 - C0873.m55680("۠ۜ")) * (-61);
                        i11 = ((iM55682 ^ i14) * 24303) ^ 857084208;
                        i12 = 891478483;
                    }
                    i17 = iM55682 ^ i12;
                    i16 = i11;
                    break;
                case -1551233733:
                case 480655260:
                    C0912.m55825(sb, strM55750);
                    C0912.m55825(sb, c20521.m46290());
                    C0894.m55771(viewOnClickListenerC7622.f19942, C0845.m55591(sb));
                    strM46288 = c20521.m46288();
                    if (strM46288 != null) {
                        iM55682 = C0946.m55979("ۨۧ") ^ i14;
                        i11 = ((iM55682 ^ i15) * 9409) ^ (-1556976977);
                        i12 = 545430002;
                    } else {
                        iM55682 = (i15 - C0946.m55979("۠᩵")) * (-109);
                        i11 = ((iM55682 ^ i14) * 32007) ^ 202542089;
                        i12 = -1858904036;
                    }
                    i17 = iM55682 ^ i12;
                    i16 = i11;
                    break;
                case -1550918385:
                case -1235243277:
                    i18 = i18;
                    sArr2 = sArr2;
                    strM55893 = C0930.m55893(sArr2, 1, 3, i19);
                    if (C1053.f81965 > 0) {
                        int iM559712 = (i14 - C0946.m55979("ᩳ᩵")) * 77;
                        i16 = ((iM559712 ^ i15) * 11385) ^ 34424335;
                        i8 = iM559712 ^ (-541526093);
                        sArr2 = sArr2;
                        int i21 = i18;
                        i17 = i8;
                        i18 = i21;
                    } else {
                        sArr2 = sArr2;
                        str2 = strM55893;
                        int iM559713 = (C0946.m55979("ۛܶ") ^ i15) * (-5);
                        c20521 = c20521;
                        viewOnClickListenerC7622 = viewOnClickListenerC7622;
                        activityC3597 = activityC3597;
                        i16 = ((iM559713 ^ i14) * 20367) ^ (-1493972092);
                        strM55893 = str2;
                        i18 = i18;
                        i17 = iM559713 ^ (-2050487481);
                        sb = null;
                    }
                    break;
                case -1300485484:
                case 589830986:
                    i18 = i18;
                    short[] sArr5 = sArr2;
                    str3 = strM55893;
                    viewOnClickListenerC7622.f19941 = c20521;
                    viewOnClickListenerC7622.m17583();
                    if (C1229.f82066 < 0) {
                        sb = new StringBuilder();
                        C0912.m55825(sb, c20521.m46280());
                        sArr2 = f82251;
                        if (C0937.f81884) {
                            iM559710 = (i15 - C0946.m55979("ܰܺ")) * 97;
                            i9 = ((iM559710 ^ i14) * (-6455)) ^ (-2126974785);
                            i10 = -226819698;
                            i8 = iM559710 ^ i10;
                            strM55893 = str3;
                            i16 = i9;
                            int i22 = i18;
                            i17 = i8;
                            i18 = i22;
                        } else {
                            str2 = str3;
                        }
                    } else {
                        activityC3597 = activityC3597;
                        sArr2 = sArr5;
                        str2 = str3;
                        c20521 = c20521;
                    }
                    int iM559714 = (C0946.m55979("ۛܶ") ^ i15) * (-5);
                    c20521 = c20521;
                    viewOnClickListenerC7622 = viewOnClickListenerC7622;
                    activityC3597 = activityC3597;
                    i16 = ((iM559714 ^ i14) * 20367) ^ (-1493972092);
                    strM55893 = str2;
                    i18 = i18;
                    i17 = iM559714 ^ (-2050487481);
                    sb = null;
                    break;
                case -1141924957:
                case -602387890:
                    break;
                case -848316290:
                case -672867663:
                    C0912.m55825(sb2, C1036.m56252(sArr4, i18, 2, i19));
                    C1003.m56121(sb2, strM55590);
                    RunnableC0938.m55928(viewOnClickListenerC7622.f19938, C0845.m55591(sb2));
                    i18 = i18;
                    sArr2 = sArr2;
                    strM55893 = strM55893;
                    iM55979 = C0946.m55979("᩹ܺ") ^ i15;
                    i16 = ((iM55979 ^ i14) * 9319) ^ (-1663628851);
                    i7 = 350492265;
                    i8 = iM55979 ^ i7;
                    strM55893 = strM55893;
                    sArr2 = sArr2;
                    int i23 = i18;
                    i17 = i8;
                    i18 = i23;
                    break;
                case -782811889:
                case -394063298:
                    strM55792 = C0898.m55792(f82251, 6, 3, i19);
                    if (RunnableC0938.f81886 < 0) {
                        iM55682 = C0873.m55680("֨᩸") ^ i15;
                        i11 = ((iM55682 ^ i14) * (-24017)) ^ (-357077114);
                        i12 = 630237007;
                        i17 = iM55682 ^ i12;
                        i16 = i11;
                    } else {
                        str3 = strM55893;
                        int iM559715 = C0946.m55979("֨۟") ^ i15;
                        strM55893 = str3;
                        i16 = ((iM559715 ^ i14) * (-3125)) ^ (-570814317);
                        i18 = i18;
                        i17 = iM559715 ^ (-1582864993);
                    }
                    break;
                case -535590918:
                case 984981931:
                    i19 = 38215;
                    iM55979 = C0946.m55979("ۙܿ") ^ i15;
                    i16 = ((iM55979 ^ i14) * (-28273)) ^ (-336925125);
                    i7 = 1245184623;
                    i8 = iM55979 ^ i7;
                    strM55893 = strM55893;
                    sArr2 = sArr2;
                    int i24 = i18;
                    i17 = i8;
                    i18 = i24;
                    break;
                case -511130685:
                case 2011491096:
                    C0927.m55873();
                    if (C1964.f83032 <= 0) {
                        i2 = i18;
                        s = s2;
                        sArr = sArr2;
                        str = strM55893;
                        viewOnClickListenerC7621 = viewOnClickListenerC7622;
                        iM55680 = C0873.m55680("ܳۨ") ^ i15;
                        i3 = ((iM55680 ^ i14) * 16703) ^ 2042919055;
                        i4 = -404504626;
                        int i25 = iM55680 ^ i4;
                        strM55893 = str;
                        sArr2 = sArr;
                        ViewOnClickListenerC7621 viewOnClickListenerC7623 = viewOnClickListenerC7621;
                        s2 = s;
                        i18 = i2;
                        i17 = i25;
                        i16 = i3;
                        viewOnClickListenerC7622 = viewOnClickListenerC7623;
                    } else {
                        str3 = strM55893;
                        int iM559716 = C0946.m55979("֨۟") ^ i15;
                        strM55893 = str3;
                        i16 = ((iM559716 ^ i14) * (-3125)) ^ (-570814317);
                        i18 = i18;
                        i17 = iM559716 ^ (-1582864993);
                    }
                    break;
                case -459097899:
                case 645990197:
                    int i26 = i18;
                    short[] sArr6 = sArr2;
                    String str4 = strM55893;
                    int i27 = (s2 * s2) + 599076;
                    short s3 = s2;
                    ViewOnClickListenerC7621 viewOnClickListenerC7624 = viewOnClickListenerC7622;
                    if ((s3 * 1548) - i27 <= 0) {
                        iM55681 = (C0873.m55680("᩶᩻") ^ i14) * 93;
                        i5 = ((iM55681 ^ i15) * 12415) ^ 1598107686;
                        i6 = 1824070681;
                    } else {
                        iM55681 = (C0873.m55680("ۗ۫") + i14) * (-85);
                        i5 = ((iM55681 ^ i15) * (-29813)) ^ (-1331055430);
                        i6 = 1864217584;
                    }
                    int i28 = iM55681 ^ i6;
                    strM55893 = str4;
                    sArr2 = sArr6;
                    i17 = i28;
                    i18 = i26;
                    s2 = s3;
                    i16 = i5;
                    viewOnClickListenerC7622 = viewOnClickListenerC7624;
                    break;
                case -449810494:
                case -40193648:
                    i18 = i18;
                    sArr2 = sArr2;
                    strM55893 = strM55893;
                    if (abstractC5462 instanceof ViewOnClickListenerC7621) {
                        int iM55684 = (i14 - C0873.m55680("ܰۤ")) * (-91);
                        int i29 = ((iM55684 ^ i15) * (-10425)) ^ 2128744641;
                        int i30 = iM55684 ^ 1151708250;
                        strM55893 = strM55893;
                        sArr2 = sArr2;
                        i16 = i29;
                        i18 = i18;
                        i17 = i30;
                    } else {
                        iM55979 = C0946.m55979("᩹ܺ") ^ i15;
                        i16 = ((iM55979 ^ i14) * 9319) ^ (-1663628851);
                        i7 = 350492265;
                        i8 = iM55979 ^ i7;
                        strM55893 = strM55893;
                        sArr2 = sArr2;
                        int i210 = i18;
                        i17 = i8;
                        i18 = i210;
                    }
                    break;
                case -99361182:
                case 85959199:
                    strM55750 = C0892.m55750(sArr3, 4, 2, i19);
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55682 = (C0873.m55680("ۖۖ") + i14) * 9;
                        i11 = ((iM55682 ^ i15) * (-1053)) ^ 1991163848;
                        i12 = 1458463266;
                    } else {
                        iM55682 = C0873.m55680("᩷ᩳ") ^ i14;
                        i11 = ((iM55682 ^ i15) * 1721) ^ 1503643154;
                        i12 = 845847757;
                    }
                    i17 = iM55682 ^ i12;
                    i16 = i11;
                    break;
                case 246375811:
                case 971060418:
                    C0946.m55980();
                    C1046.m56302();
                    break;
                case 287168375:
                case 600759669:
                    if (C1044.f81959 >= 0) {
                        iM55682 = (C0873.m55680("۫ۛ") ^ i14) * (-113);
                        i11 = ((iM55682 ^ i15) * (-20769)) ^ (-1520349450);
                        i12 = 531585334;
                        i17 = iM55682 ^ i12;
                        i16 = i11;
                    } else {
                        i2 = i18;
                        s = s2;
                        sArr = sArr2;
                        str = strM55893;
                        viewOnClickListenerC7621 = viewOnClickListenerC7622;
                        iM55680 = C0873.m55680("ܳۨ") ^ i15;
                        i3 = ((iM55680 ^ i14) * 16703) ^ 2042919055;
                        i4 = -404504626;
                        int i211 = iM55680 ^ i4;
                        strM55893 = str;
                        sArr2 = sArr;
                        ViewOnClickListenerC7621 viewOnClickListenerC7625 = viewOnClickListenerC7621;
                        s2 = s;
                        i18 = i2;
                        i17 = i211;
                        i16 = i3;
                        viewOnClickListenerC7622 = viewOnClickListenerC7625;
                    }
                    break;
                case 532730623:
                case 1060338587:
                    str3 = strM55893;
                    C0912.m55825(sb, str3);
                    C1003.m56121(sb, C24158.m53411(c20521.m46292()));
                    sArr3 = f82251;
                    if (C1036.f81953 < 0) {
                        i18 = i18;
                        iM559710 = (C0946.m55979("᩹ۚ") ^ i15) * 57;
                        i9 = ((iM559710 ^ i14) * 163) ^ 2133183405;
                        i10 = 58807480;
                        i8 = iM559710 ^ i10;
                        strM55893 = str3;
                        i16 = i9;
                        int i212 = i18;
                        i17 = i8;
                        i18 = i212;
                    } else {
                        int iM559717 = C0946.m55979("֨۟") ^ i15;
                        strM55893 = str3;
                        i16 = ((iM559717 ^ i14) * (-3125)) ^ (-570814317);
                        i18 = i18;
                        i17 = iM559717 ^ (-1582864993);
                    }
                    break;
                case 1223421936:
                case 2053365395:
                    C0861.m55626();
                    C0927.m55873();
                    str3 = strM55893;
                    int iM559718 = C0946.m55979("֨۟") ^ i15;
                    strM55893 = str3;
                    i16 = ((iM559718 ^ i14) * (-3125)) ^ (-570814317);
                    i18 = i18;
                    i17 = iM559718 ^ (-1582864993);
                    break;
                case 1580027862:
                case 1626668884:
                    sArr2 = sArr2;
                    viewOnClickListenerC7622 = (ViewOnClickListenerC7621) abstractC5462;
                    i18 = i18;
                    ActivityC3597 activityC3598 = this.f52809;
                    strM55893 = strM55893;
                    activityC3597 = activityC3598;
                    c20521 = (C20521) C1964.m56587(activityC3598.f7313, i);
                    if (C0873.f81841 > 0) {
                        int iM559719 = C0946.m55979("ܿۛ") ^ i14;
                        i16 = ((iM559719 ^ i15) * (-15015)) ^ 123308971;
                        i8 = iM559719 ^ (-1295310052);
                        viewOnClickListenerC7622 = viewOnClickListenerC7622;
                        activityC3597 = activityC3597;
                        c20521 = c20521;
                        strM55893 = strM55893;
                        sArr2 = sArr2;
                        int i213 = i18;
                        i17 = i8;
                        i18 = i213;
                    } else {
                        sArr2 = sArr2;
                        str2 = strM55893;
                        int iM5597110 = (C0946.m55979("ۛܶ") ^ i15) * (-5);
                        c20521 = c20521;
                        viewOnClickListenerC7622 = viewOnClickListenerC7622;
                        activityC3597 = activityC3597;
                        i16 = ((iM5597110 ^ i14) * 20367) ^ (-1493972092);
                        strM55893 = str2;
                        i18 = i18;
                        i17 = iM5597110 ^ (-2050487481);
                        sb = null;
                    }
                    break;
                default:
                    i2 = i18;
                    viewOnClickListenerC7621 = viewOnClickListenerC7622;
                    sArr = sArr2;
                    str = strM55893;
                    s = f82251[0];
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("ۤ᩹") ^ i15;
                        i3 = ((iM55680 ^ i14) * (-3859)) ^ 1151912036;
                        i4 = 1269497579;
                    } else {
                        iM55680 = C0873.m55680("ܳۨ") ^ i15;
                        i3 = ((iM55680 ^ i14) * 16703) ^ 2042919055;
                        i4 = -404504626;
                    }
                    int i214 = iM55680 ^ i4;
                    strM55893 = str;
                    sArr2 = sArr;
                    ViewOnClickListenerC7621 viewOnClickListenerC7626 = viewOnClickListenerC7621;
                    s2 = s;
                    i18 = i2;
                    i17 = i214;
                    i16 = i3;
                    viewOnClickListenerC7622 = viewOnClickListenerC7626;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        ActivityC3597 activityC3597 = null;
        int iM55989 = 0;
        int i = -1293867273;
        int i2 = RunnableC0871.f81839;
        int i3 = C1046.f81962;
        int iM55979 = (C0946.m55979("᩸ۗ") + i3) * (-75);
        int i4 = ((iM55979 ^ i2) * 27421) ^ (-1040505636);
        int i5 = 954188959;
        while (true) {
            i = ((((i ^ i2) * (-18319)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2075332370:
                case 1257349266:
                    return iM55989 + 1;
                case -1989732391:
                case -1122828538:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("۠ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8837)) ^ 957150207;
                        i5 = 1250862927;
                    } else {
                        iM55979 = C0946.m55979("ܽ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30793)) ^ 938119481;
                        i5 = -25511001;
                    }
                    break;
                case -1659090312:
                case -440018971:
                    if (!RunnableC0897.m55784()) {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM55979 = C0946.m55979("۠ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8837)) ^ 957150207;
                        i5 = 1250862927;
                    }
                    break;
                case -1584455841:
                case 475271064:
                    C0967.m56074();
                    C1046.m56302();
                    iM55979 = C0946.m55979("۠ۛ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-8837)) ^ 957150207;
                    i5 = 1250862927;
                    break;
                case -1517330892:
                case 1666060919:
                    if (C0877.m55704(activityC3597.f7313)) {
                        iM55979 = (C0946.m55979("ܶᩴ") ^ i3) * (-23);
                        i4 = ((iM55979 ^ i2) * 25873) ^ (-165881972);
                        i5 = -1773164603;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩺۟")) * 15;
                        i4 = ((iM55979 ^ i2) * 5939) ^ 1438161703;
                        i5 = -116881702;
                    }
                    break;
                case -1515735868:
                case 1946697414:
                    return 0;
                case -1457354591:
                case -585736688:
                    activityC3597 = this.f52809;
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM55979 = C0946.m55979("ܿܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8437) ^ 783485365;
                        i5 = -2004885377;
                    }
                    break;
                case -1254878574:
                case 1750495237:
                    if (C0947.f81895) {
                        iM55979 = (i3 - C0946.m55979("֡ܿ")) * 91;
                        i4 = ((iM55979 ^ i2) * 19365) ^ 772438059;
                        i5 = 2028355980;
                    } else {
                        iM55979 = C0873.m55680("֫᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24691) ^ (-553875673);
                        i5 = 1478044095;
                    }
                    break;
                case -1042146243:
                case 174855813:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ۧۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21935) ^ (-1765899197);
                        i5 = 1123198440;
                    } else {
                        iM55979 = (C0873.m55680("ܶۛ") + i2) * 17;
                        i4 = ((iM55979 ^ i3) * (-23295)) ^ (-1394855760);
                        i5 = -1673258656;
                    }
                    break;
                case -1029800568:
                case 1227103820:
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("᩻᩵") ^ i3) * (-21);
                        i4 = ((iM55979 ^ i2) * (-13615)) ^ (-175353849);
                        i5 = -1995832774;
                    } else {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    }
                    break;
                case -747273445:
                case 2000680229:
                    C0861.m55626();
                    return 0;
                case -620132697:
                case 919609212:
                    C0930.m55885();
                    if (C0863.f81833 > 0) {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM55979 = C0946.m55979("ܰ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25419) ^ 1050202315;
                        i5 = -1291013112;
                    }
                    break;
                case -558457588:
                case 1807165493:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (i3 - C0946.m55979("֡ܿ")) * 91;
                        i4 = ((iM55979 ^ i2) * 19365) ^ 772438059;
                        i5 = 2028355980;
                    } else {
                        iM55979 = C0873.m55680("᩹᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-16511)) ^ (-729079836);
                        i5 = 1205120541;
                    }
                    break;
                case -325642300:
                case 1155299488:
                    iM55989 = C0947.m55989(activityC3597.f7313);
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0946.m55979("۠ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8837)) ^ 957150207;
                        i5 = 1250862927;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ܽܺ")) * 123;
                        i4 = ((iM55979 ^ i3) * 953) ^ 1415015877;
                        i5 = -1319817164;
                    }
                    break;
                case 381040753:
                case 1875354555:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM55979 = (C0873.m55680("᩸᩵") ^ i3) * 127;
                        i4 = ((iM55979 ^ i2) * (-24687)) ^ 386027741;
                        i5 = 1203455722;
                    }
                    break;
                case 1457110419:
                case 1583200176:
                    C1071.m56343();
                    if (!C0947.m55997()) {
                        iM55979 = (i3 - C0946.m55979("֡ܿ")) * 91;
                        i4 = ((iM55979 ^ i2) * 19365) ^ 772438059;
                        i5 = 2028355980;
                    } else {
                        iM55979 = C0946.m55979("۠ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8837)) ^ 957150207;
                        i5 = 1250862927;
                    }
                    break;
                case 1736556241:
                case 2144164495:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16497) ^ 764864288;
                        i5 = -819816057;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۢ᩻")) * (-109);
                        i4 = ((iM55979 ^ i3) * 19571) ^ 791830581;
                        i5 = 534635097;
                    }
                    break;
                default:
                    if (C0892.f81851) {
                        iM55979 = (i3 - C0946.m55979("ܳܰ")) * (-121);
                        i4 = ((iM55979 ^ i2) * 32167) ^ (-1089026592);
                        i5 = 1917181663;
                    } else {
                        iM55979 = C0946.m55979("ۛܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16497) ^ 764864288;
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
    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM55979;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int iM559711;
        int i5;
        int i6;
        int i7 = C1003.f81929;
        int i8 = ViewOnClickListenerC0939.f81888;
        int iM55680 = C0873.m55680("֡֨") ^ i8;
        int i9 = ((iM55680 ^ i7) * (-23019)) ^ 139610824;
        LayoutInflater layoutInflaterFrom = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM55680 ^ (-2104936790);
        ActivityC3597 activityC3597 = null;
        int i11 = 0;
        boolean z = false;
        int iM55681 = 0;
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
                    activityC3597 = activityC3597;
                    i12 = (s * s2) + 1;
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0946.m55979("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM55979 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                    } else {
                        iM55979 = C0873.m55680("᩸ܽ") ^ i8;
                        i2 = ((iM55979 ^ i7) * 10883) ^ (-1208061367);
                        i3 = 1266876402;
                    }
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
                case -1971038001:
                case 1904866617:
                    View view = new View(activityC3597);
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        activityC3597 = activityC3597;
                        int iM55821 = C0906.m55821(5.0f);
                        if (C1048.m56305() < 0) {
                            view.setLayoutParams(new ViewGroup.LayoutParams(-1, iM55821));
                            return new C4939(view);
                        }
                        iM55979 = (C0873.m55680("᩹᩺") ^ i7) * (-77);
                        i2 = ((iM55979 ^ i8) * (-6697)) ^ (-726391227);
                        i3 = -1584560808;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        activityC3597 = activityC3597;
                    }
                    activityC3597 = activityC3597;
                    iM55979 = (C0946.m55979("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i2 = ((iM55979 ^ i8) * (-13213)) ^ (-2022658300);
                    i3 = 1028704515;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
                case -1849171073:
                case -96410048:
                    RunnableC0871.m55672();
                    iM559711 = C0873.m55680("ᩴܿ") ^ i7;
                    i5 = ((iM559711 ^ i8) * (-2647)) ^ 285384696;
                    i6 = 2093961680;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    break;
                case -1629146404:
                case -1345349481:
                    i13 = 44689;
                    iM55979 = (i8 - C0873.m55680("ܳۡ")) * (-105);
                    i2 = ((iM55979 ^ i7) * 1103) ^ (-907392671);
                    i3 = 214707103;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
                case -1275127950:
                case 13335123:
                    C0989.m56095();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM559710 = C0946.m55979("֫ܺ") ^ i8;
                        i9 = ((iM559710 ^ i7) * 15181) ^ (-300179457);
                        i4 = -1302160902;
                        i10 = iM559710 ^ i4;
                    } else {
                        activityC3597 = activityC3597;
                        iM55979 = (C0946.m55979("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM55979 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        activityC3597 = activityC3597;
                    }
                    break;
                case -1134380431:
                case 448949668:
                    iM55681 = C0873.m55680(C0912.m55822(sArr2, i14, i15, i13));
                    if (C0912.f81867 > 0) {
                        iM559711 = C0873.m55680("᩵ۧ") ^ i8;
                        i5 = ((iM559711 ^ i7) * (-14489)) ^ (-300095579);
                        i6 = 298582583;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    } else {
                        iM559710 = C0946.m55979("֫ܺ") ^ i8;
                        i9 = ((iM559710 ^ i7) * 15181) ^ (-300179457);
                        i4 = -1302160902;
                        i10 = iM559710 ^ i4;
                    }
                    break;
                case -970106670:
                case -457621004:
                    layoutInflaterFrom = LayoutInflater.from(activityC3597);
                    sArr2 = f82251;
                    i14 = 12;
                    i15 = 3;
                    if (RunnableC0871.m55672() >= 0) {
                        iM559711 = C0873.m55680("ᩴܺ") ^ i8;
                        i5 = ((iM559711 ^ i7) * 9927) ^ 953188176;
                        i6 = -1369409231;
                    } else {
                        iM559711 = C0873.m55680("ۛ۫") ^ i7;
                        i5 = ((iM559711 ^ i8) * 23481) ^ 901042722;
                        i6 = 951840444;
                    }
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    break;
                case -804039254:
                case 232292312:
                    return new ViewOnClickListenerC7621(activityC3597, layoutInflaterFrom.inflate(i11, viewGroup, z));
                case -693492038:
                case 689286570:
                    activityC3597 = activityC3597;
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM55979 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                    } else {
                        iM55979 = C0946.m55979("۬۫") ^ i8;
                        i2 = ((iM55979 ^ i7) * (-20583)) ^ 706389724;
                        i3 = 1449731952;
                    }
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
                case -680408264:
                case 1896622768:
                    activityC3597 = this.f52809;
                    if (i != 0) {
                        iM559711 = (C0946.m55979("ۤ᩺") + i7) * 59;
                        i5 = ((iM559711 ^ i8) * (-17525)) ^ 1484736233;
                        i6 = -2086191053;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    } else {
                        iM559710 = (i8 - C0946.m55979("᩻᩵")) * 3;
                        i9 = ((iM559710 ^ i7) * 19225) ^ 385489601;
                        i4 = 978167365;
                        i10 = iM559710 ^ i4;
                    }
                    break;
                case -609946932:
                case 379507256:
                    i13 = 8654;
                    iM55979 = (i8 - C0873.m55680("ܳۡ")) * (-105);
                    i2 = ((iM55979 ^ i7) * 1103) ^ (-907392671);
                    i3 = 214707103;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
                case -487819897:
                case 530735104:
                    activityC3597 = activityC3597;
                    s3 = 1;
                    if (C1028.m56247() >= 0) {
                        iM55979 = (C0946.m55979("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM55979 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                    } else {
                        iM55979 = C0873.m55680("۠᩺") ^ i8;
                        i2 = ((iM55979 ^ i7) * (-4945)) ^ (-241121525);
                        i3 = 460785669;
                    }
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
                case -474680218:
                case 1154480596:
                    if (C0854.f81826 == 0) {
                        iM559711 = C0873.m55680("ᩴܿ") ^ i7;
                        i5 = ((iM559711 ^ i8) * (-2647)) ^ 285384696;
                        i6 = 2093961680;
                    } else {
                        iM559711 = C0873.m55680("ᩴܺ") ^ i8;
                        i5 = ((iM559711 ^ i7) * 9927) ^ 953188176;
                        i6 = -1369409231;
                    }
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    break;
                case -431912158:
                case 1610945069:
                    if (C0873.f81841 <= 0) {
                        activityC3597 = activityC3597;
                        iM55979 = (C0946.m55979("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM55979 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        activityC3597 = activityC3597;
                    } else {
                        iM559711 = C0873.m55680("ᩴܿ") ^ i7;
                        i5 = ((iM559711 ^ i8) * (-2647)) ^ 285384696;
                        i6 = 2093961680;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    }
                    break;
                case 38428216:
                case 523392196:
                    activityC3597 = activityC3597;
                    sArr = f82251;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("۟ܺ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM55979 ^ i8) * (-13213)) ^ (-2022658300);
                        i3 = 1028704515;
                    } else {
                        iM55979 = C0873.m55680("ۢۙ") ^ i7;
                        i2 = ((iM55979 ^ i8) * (-29019)) ^ 1562245554;
                        i3 = -815348073;
                    }
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
                case 167853375:
                case 1588933363:
                    C1012.m56134();
                    C0898.m55800();
                    return null;
                case 189755468:
                case 1173134610:
                    i11 = 2117189093 ^ iM55681;
                    if (C0992.f81922 >= 0) {
                        activityC3597 = activityC3597;
                        z = false;
                        iM55979 = (C0873.m55680("᩹᩺") ^ i7) * (-77);
                        i2 = ((iM55979 ^ i8) * (-6697)) ^ (-726391227);
                        i3 = -1584560808;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        activityC3597 = activityC3597;
                    } else {
                        int iM55682 = C0873.m55680("ۙۘ") ^ i8;
                        i9 = ((iM55682 ^ i7) * 5103) ^ (-220246350);
                        i10 = iM55682 ^ 1509622000;
                        z = false;
                    }
                    break;
                case 1330922408:
                case 1627167496:
                    activityC3597 = activityC3597;
                    int i17 = s + s3;
                    if (i12 - (i17 * i17) > 0) {
                        iM55979 = (C0873.m55680("֡۠") ^ i7) * 89;
                        i2 = ((iM55979 ^ i8) * (-3049)) ^ 581651923;
                        i3 = 1403838600;
                    } else {
                        iM55979 = C0946.m55979("ܺۗ") ^ i7;
                        i2 = ((iM55979 ^ i8) * 32569) ^ (-1072937978);
                        i3 = -102937479;
                    }
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
                default:
                    activityC3597 = activityC3597;
                    s = sArr[11];
                    s2 = 2;
                    if (C0877.m55696()) {
                        iM55979 = (C0946.m55979("֨ۨ") + i7) * (-47);
                        i2 = ((iM55979 ^ i8) * 25325) ^ (-29861822);
                        i3 = 552173035;
                    } else {
                        iM55979 = (C0873.m55680("᩹᩺") ^ i7) * (-77);
                        i2 = ((iM55979 ^ i8) * (-6697)) ^ (-726391227);
                        i3 = -1584560808;
                    }
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    activityC3597 = activityC3597;
                    break;
            }
        }
    }

    public C17678(ActivityC3597 activityC3597) {
        this.f52809 = activityC3597;
    }
}
