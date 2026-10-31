package l;

import android.content.SharedPreferences;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S3XU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5768 {

    /* JADX INFO: renamed from: ۨ᩺ܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f17736 = {7988, 9575, 9588, 9587, 9591, 9582, 9570, 9591, 9584, 9588, 9570, 9591, 9577, 9581, 9578, 9584, 9570, 9591, 9577, 9573, 9596, 9584, 760, -8350, -8347, -8350, -8354, -8347, -8328, -8322, -8325, -8325, -8348, -8327, -8321, -8338, -8337, -8405, -8328, -8338, -8321, -8321, -8350, -8347, -8340, -8328, -8405, -8343, -8345, -8348, -8344, -8352, -8399, -8405, -8354, -8347, -8328, -8322, -8325, -8325, -8348, -8327, -8321, -8338, -8337, -8405, -8325, -8327, -8338, -8339, -8338, -8327, -8338, -8347, -8344, -8338, -8405, -8321, -8334, -8325, -8338, -8399, -8405, -8340, -8338, -8321, -8413, -8411, -8411, -8411, -8414, -8346, -8350, -8347, -8350, -8352, -8338, -8334, -8339, -8328, -8346, -8342, -8333, -8321, -8339, -8328, -8346, -8350, -8347, -8321, -8339, -8328, -8321, -8325};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12118 f17737;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f17738;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f17739;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f17740;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f17741;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f17742;

    public C5768(boolean z) {
        this.f17741 = z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x039a A[PHI: r25
      0x039a: PHI (r25v25 short[]) = (r25v9 short[]), (r25v18 short[]), (r25v26 short[]) binds: [B:98:0x0382, B:69:0x0239, B:47:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01cd A[PHI: r25
      0x01cd: PHI (r25v20 short[]) = (r25v19 short[]), (r25v21 short[]) binds: [B:61:0x01cb, B:57:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x02ea A[PHI: r7 r12 r25
      0x02ea: PHI (r7v4 l.۬ۤۡ) = (r7v2 l.۬ۤۡ), (r7v3 l.۬ۤۡ), (r7v2 l.۬ۤۡ) binds: [B:85:0x02e8, B:77:0x028e, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:85:0x02e8, B:77:0x028e, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r25v33 short[]) = (r25v12 short[]), (r25v14 short[]), (r25v34 short[]) binds: [B:85:0x02e8, B:77:0x028e, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0333 A[PHI: r5 r25
      0x0333: PHI (r5v4 l.۫ۖۡ) = (r5v3 l.۫ۖۡ), (r5v2 l.۫ۖۡ) binds: [B:89:0x031a, B:69:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x0333: PHI (r25v17 short[]) = (r25v11 short[]), (r25v18 short[]) binds: [B:89:0x031a, B:69:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0361 A[PHI: r8 r25
      0x0361: PHI (r8v3 l.۫ۖۡ) = (r8v2 l.۫ۖۡ), (r8v2 l.۫ۖۡ), (r8v2 l.۫ۖۡ), (r8v6 l.۫ۖۡ) binds: [B:93:0x034b, B:71:0x023d, B:47:0x0155, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r25v41 short[]) = (r25v10 short[]), (r25v16 short[]), (r25v26 short[]), (r25v45 short[]) binds: [B:93:0x034b, B:71:0x023d, B:47:0x0155, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16225() {
        short[] sArr;
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int iM6982;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7 = C2167.f7158;
        int i8 = C22628.f73083;
        int iM6983 = (C2105.m6981("ۨۙ") ^ i8) * (-65);
        int i9 = ((iM6983 ^ i7) * (-26571)) ^ (-311348583);
        C12118 c12118 = null;
        C12118 c12119 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM6983 ^ (-917166342);
        boolean z2 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        int i15 = 0;
        short s2 = 0;
        short s3 = 0;
        int i16 = -572554066;
        InterfaceC13049 interfaceC13049M6438 = null;
        short[] sArr4 = null;
        boolean z3 = false;
        AbstractC15440 abstractC15440M48495 = null;
        C12118 c121110 = null;
        C12118 c121111 = null;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i7) * (-23681)) >> 31));
            switch (i16) {
                case -2052679234:
                case -1754201977:
                    sArr = sArr2;
                    if (this.f17742) {
                        iM2566 = (i8 - C0630.m2566("᩶ۡ")) * 19;
                        i = ((iM2566 ^ i7) * 13383) ^ 519126222;
                        i2 = 1677413970;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۚ᩷")) * q.h;
                        i = ((iM2566 ^ i8) * (-11147)) ^ (-421359562);
                        i2 = -1804771112;
                    }
                    int i17 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i17;
                    i9 = i;
                    break;
                case -2027491748:
                case 293773985:
                    c12118 = c12118;
                    ApplicationC20075.m46267();
                    if (this.f17741) {
                        int iM6984 = C2105.m6981("ᩴ۫") ^ i7;
                        i10 = iM6984 ^ 1182616943;
                        i9 = ((iM6984 ^ i8) * (-21091)) ^ (-1736489948);
                        c12118 = c12118;
                        z2 = true;
                    } else {
                        z2 = true;
                        iM6982 = C2105.m6981("ۗ᩶") ^ i8;
                        z2 = z2;
                        i4 = ((iM6982 ^ i7) * (-19323)) ^ (-1727528666);
                        i5 = -536570366;
                        i6 = iM6982 ^ i5;
                        c12118 = c12118;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    }
                    break;
                case -1969181571:
                case -572762699:
                    sArr = sArr2;
                    c121110 = this.f17737;
                    if (c121110 != null) {
                        iM2566 = (i7 - C2105.m6981("᩵ۘ")) * (-41);
                        i = ((iM2566 ^ i8) * 30225) ^ (-197309525);
                        i2 = 370151254;
                    } else {
                        iM2566 = C0630.m2566("ۜۜ") ^ i7;
                        i = ((iM2566 ^ i8) * 9651) ^ (-1076256490);
                        i2 = 2004230585;
                    }
                    int i18 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i18;
                    i9 = i;
                    break;
                case -1956183671:
                case 1310711346:
                    if (C4117.f13076 > 0) {
                        z2 = z2;
                        c12118 = c12118;
                        iM6982 = (C0630.m2566("ۢ᩸") + i8) * 109;
                        i4 = ((iM6982 ^ i7) * 11001) ^ (-504948772);
                        i5 = -994798558;
                        i6 = iM6982 ^ i5;
                        c12118 = c12118;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        iM6981 = (i8 - C2105.m6981("ܶۤ")) * (-91);
                        i = ((iM6981 ^ i7) * (-6521)) ^ (-2107492593);
                        i3 = -1316626475;
                        i10 = iM6981 ^ i3;
                        i9 = i;
                    }
                    break;
                case -1925627374:
                case 1035345975:
                    c12118 = c12118;
                    if (c12118.m29525(C2126.m7036(sArr2, i12, i13, i11)) != z2) {
                        z2 = z2;
                        c12118 = c12118;
                        int iM2567 = (C0630.m2566("֨ۜ") ^ i7) * (-59);
                        i4 = ((iM2567 ^ i8) * (-715)) ^ 1307627505;
                        i6 = iM2567 ^ 138442300;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    }
                    iM6982 = C2105.m6981("ۗ᩶") ^ i8;
                    z2 = z2;
                    i4 = ((iM6982 ^ i7) * (-19323)) ^ (-1727528666);
                    i5 = -536570366;
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1882731337:
                case -165433838:
                    sArr = sArr2;
                    C3735.m11351();
                    DialogInterfaceOnDismissListenerC17128.m40151();
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i7;
                        i = ((iM2566 ^ i8) * 30723) ^ 1096675455;
                        i2 = 10001577;
                    } else {
                        iM2566 = (C2105.m6981("ۖ᩶") + i7) * 71;
                        i = ((iM2566 ^ i8) * (-27697)) ^ (-1423618888);
                        i2 = 240833911;
                    }
                    int i19 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i19;
                    i9 = i;
                    break;
                case -1847558684:
                case -909092903:
                    z2 = z2;
                    c12118 = c12118;
                    if ((s2 * s3) - i15 <= 0) {
                        iM6982 = (C0630.m2566("ۚۙ") + i7) * (-3);
                        i4 = ((iM6982 ^ i8) * 19667) ^ (-1688963754);
                        i5 = 125637769;
                    } else {
                        iM6982 = (C0630.m2566("۫᩵") ^ i7) * 53;
                        i4 = ((iM6982 ^ i8) * (-9683)) ^ 889382208;
                        i5 = -1000743432;
                    }
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1843272274:
                case 705088677:
                    break;
                case -1771630254:
                case -1136047481:
                    sArr = sArr2;
                    C17897.m41874();
                    C8239.m21820();
                    DialogInterfaceOnDismissListenerC15010.m35542();
                    C14981.m35471();
                    if (C22628.m50615() == 0) {
                        iM2566 = C0630.m2566("ۖۘ") ^ i8;
                        i = ((iM2566 ^ i7) * 11571) ^ 2127843008;
                        i2 = -1172041578;
                        int i110 = iM2566 ^ i2;
                        sArr2 = sArr;
                        i10 = i110;
                        i9 = i;
                    } else {
                        sArr2 = sArr;
                        c12118 = c12118;
                        z2 = z2;
                        iM6982 = C2105.m6981("ۖۚ") ^ i7;
                        i4 = ((iM6982 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                        i6 = iM6982 ^ i5;
                        c12118 = c12118;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    }
                    break;
                case -1737455724:
                case 7514853:
                    z2 = z2;
                    c12118 = c12118;
                    sArr4 = f17736;
                    c = 0;
                    if (C4117.m12364() != 0) {
                        iM6982 = C2105.m6981("ۖۚ") ^ i7;
                        i4 = ((iM6982 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                    } else {
                        iM6982 = (i8 - C2105.m6981("ۖܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6982 ^ i7) * 2105) ^ 327088873;
                        i5 = -351112650;
                    }
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1726683023:
                case 1370450062:
                    sArr = sArr2;
                    interfaceC13049M6438 = ViewOnClickListenerC1958.m6438(ApplicationC20075.f65008);
                    sArr3 = f17736;
                    if (C22628.m50615() != 0) {
                        iM2566 = (C2105.m6981("᩻ۚ") ^ i7) * (-71);
                        i = ((iM2566 ^ i8) * 18527) ^ 2017771806;
                        i2 = -643528333;
                    } else {
                        iM2566 = C2105.m6981("۫᩻") ^ i8;
                        i = ((iM2566 ^ i7) * (-10109)) ^ (-1474231821);
                        i2 = 1316121386;
                    }
                    int i111 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i111;
                    i9 = i;
                    break;
                case -1670950662:
                case 1701122390:
                    sArr = sArr2;
                    if (this.f17740) {
                        iM2566 = C0630.m2566("ܶܶ") ^ i8;
                        i = ((iM2566 ^ i7) * 18585) ^ 797548151;
                        i2 = -821107815;
                    } else {
                        iM2566 = C2105.m6981("ۤܽ") ^ i7;
                        i = ((iM2566 ^ i8) * (-21039)) ^ (-1113868253);
                        i2 = 1078114446;
                    }
                    int i112 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i112;
                    i9 = i;
                    break;
                case -1661674211:
                case -371584495:
                    z2 = z2;
                    c12118 = c12118;
                    s2 = sArr4[c];
                    s = 730;
                    if (C21923.f70183 != 0) {
                        iM6982 = (i8 - C2105.m6981("᩹ۙ")) * (-57);
                        i4 = ((iM6982 ^ i7) * (-29043)) ^ 319018878;
                        i5 = 1372943074;
                    } else {
                        iM6982 = (C2105.m6981("ۧۙ") ^ i7) * (-79);
                        i4 = ((iM6982 ^ i8) * 21013) ^ 588633010;
                        i5 = -1842438397;
                    }
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1646475161:
                case 1347687706:
                    if (!C11340.m28031()) {
                        z2 = z2;
                        c12118 = c12118;
                        iM6982 = (C0630.m2566("ۢ᩸") + i8) * 109;
                        i4 = ((iM6982 ^ i7) * 11001) ^ (-504948772);
                        i5 = -994798558;
                        i6 = iM6982 ^ i5;
                        c12118 = c12118;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        iM6981 = (C0630.m2566("۬ܽ") + i7) * (-65);
                        i = ((iM6981 ^ i8) * (-8779)) ^ 416133001;
                        i3 = 1537808832;
                        i10 = iM6981 ^ i3;
                        i9 = i;
                    }
                    break;
                case -1624704066:
                case -138516688:
                    z2 = z2;
                    C12118 c121112 = this.f17737;
                    if (c121112 != null) {
                        int iM2568 = C0630.m2566("ۤ۠") ^ i8;
                        c12118 = c121112;
                        i9 = ((iM2568 ^ i7) * (-17681)) ^ 337907458;
                        z = z2;
                        i10 = iM2568 ^ 113147780;
                    } else {
                        c12118 = c121112;
                        int iM2569 = (C0630.m2566("֨ۜ") ^ i7) * (-59);
                        i4 = ((iM2569 ^ i8) * (-715)) ^ 1307627505;
                        i6 = iM2569 ^ 138442300;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                    }
                    z2 = z;
                    break;
                case -1576872907:
                case 1306228523:
                    sArr = sArr2;
                    if (c12119.m29525(C1773.m5917(f17736, 16, 6, i11)) == z2) {
                        iM2566 = (i8 - C0630.m2566("᩶ۡ")) * 19;
                        i = ((iM2566 ^ i7) * 13383) ^ 519126222;
                        i2 = 1677413970;
                    } else {
                        iM2566 = C0630.m2566("ܶܶ") ^ i8;
                        i = ((iM2566 ^ i7) * 18585) ^ 797548151;
                        i2 = -821107815;
                    }
                    int i113 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i113;
                    i9 = i;
                    break;
                case -1414894800:
                case -85130310:
                    sArr = sArr2;
                    int i20 = C11413.f34113;
                    C11413.m28178();
                    C21404.m48502();
                    if (C3663.f11553) {
                        iM2566 = (C2105.m6981("᩻ۚ") ^ i7) * (-71);
                        i = ((iM2566 ^ i8) * 18527) ^ 2017771806;
                        i2 = -643528333;
                    } else {
                        iM2566 = C0630.m2566("ܿ᩸") ^ i7;
                        i = ((iM2566 ^ i8) * 10279) ^ 1701979541;
                        i2 = -1035812127;
                    }
                    int i114 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i114;
                    i9 = i;
                    break;
                case -1403105371:
                case 1673050215:
                    sArr = sArr2;
                    C4711.m13811();
                    C19890.m45743();
                    C10395.m26222();
                    if (z3) {
                        iM2566 = (C2105.m6981("۟᩶") ^ i8) * 85;
                        i = ((iM2566 ^ i7) * (-16231)) ^ 2100429509;
                        i2 = 187225643;
                    } else {
                        iM2566 = C0630.m2566("᩹ۗ") ^ i7;
                        i = ((iM2566 ^ i8) * 9821) ^ (-966687726);
                        i2 = -1310255705;
                    }
                    int i115 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i115;
                    i9 = i;
                    break;
                case -1307347966:
                case 1756537599:
                    C0237.m1492(new RunnableC10002());
                    break;
                case -1252213262:
                case 521575383:
                    C4075.m12263();
                    if (C3683.f11629 < 0) {
                        sArr = sArr2;
                        iM2566 = (C2105.m6981("᩻ۚ") ^ i7) * (-71);
                        i = ((iM2566 ^ i8) * 18527) ^ 2017771806;
                        i2 = -643528333;
                        int i116 = iM2566 ^ i2;
                        sArr2 = sArr;
                        i10 = i116;
                        i9 = i;
                    }
                    iM6981 = (C0630.m2566("۬ܽ") + i7) * (-65);
                    i = ((iM6981 ^ i8) * (-8779)) ^ 416133001;
                    i3 = 1537808832;
                    i10 = iM6981 ^ i3;
                    i9 = i;
                    break;
                case -1137686746:
                case 2087951287:
                    z2 = z2;
                    c12118 = c12118;
                    int i21 = s2 + s;
                    i15 = i21 * i21;
                    s3 = 2920;
                    if (C11340.f33930 >= 0) {
                        iM6982 = (C0630.m2566("ۢ᩸") + i8) * 109;
                        i4 = ((iM6982 ^ i7) * 11001) ^ (-504948772);
                        i5 = -994798558;
                    } else {
                        iM6982 = (C0630.m2566("᩻ܶ") + i8) * (-69);
                        i4 = ((iM6982 ^ i7) * (-15859)) ^ 298554241;
                        i5 = -1321228717;
                    }
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1100039679:
                case 466334707:
                    sArr = sArr2;
                    try {
                        C0798.m3002(abstractC15440M48495);
                        C15972.m37753();
                        break;
                    } catch (Exception unused) {
                    }
                    iM2566 = C2105.m6981("ۤۚ") ^ i8;
                    i = ((iM2566 ^ i7) * 10555) ^ (-1299972716);
                    i2 = -1551578169;
                    int i117 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i117;
                    i9 = i;
                    break;
                case -1081211572:
                case -175023076:
                    C0382.m1848();
                    iM6981 = (C2105.m6981("ܽ֫") ^ i7) * (-31);
                    i = ((iM6981 ^ i8) * (-32639)) ^ 2064308082;
                    i3 = -873609063;
                    i10 = iM6981 ^ i3;
                    i9 = i;
                    break;
                case -985836582:
                case -513741850:
                    z3 = true;
                    iM6982 = (C2105.m6981("۟۬") ^ i8) * (-43);
                    i4 = ((iM6982 ^ i7) * 9555) ^ (-61636629);
                    i5 = 476677207;
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -955835750:
                case -288335119:
                    c12118 = c12118;
                    c121111 = this.f17737;
                    if (c121111 != null) {
                        iM6982 = C2105.m6981("ܺ۟") ^ i7;
                        z2 = z2;
                        i4 = ((iM6982 ^ i8) * (-27729)) ^ (-2132228689);
                        i5 = -176352003;
                    } else {
                        z2 = z2;
                        iM6982 = (C2105.m6981("ᩳܿ") + i8) * (-63);
                        i4 = ((iM6982 ^ i7) * 13841) ^ 1930422208;
                        i5 = 972236785;
                    }
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -706249058:
                case 1824088858:
                    z3 = false;
                    iM6982 = (C2105.m6981("۟۬") ^ i8) * (-43);
                    i4 = ((iM6982 ^ i7) * 9555) ^ (-61636629);
                    i5 = 476677207;
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -640745638:
                case 1441570837:
                    if (RunnableC0588.f2309 < 0) {
                        sArr = sArr2;
                        iM2566 = C2105.m6981("᩶ᩳ") ^ i8;
                        i = ((iM2566 ^ i7) * 16559) ^ 675571757;
                        i2 = 720819081;
                        int i118 = iM2566 ^ i2;
                        sArr2 = sArr;
                        i10 = i118;
                        i9 = i;
                    }
                    iM6981 = (C0630.m2566("۬ܽ") + i7) * (-65);
                    i = ((iM6981 ^ i8) * (-8779)) ^ 416133001;
                    i3 = 1537808832;
                    i10 = iM6981 ^ i3;
                    i9 = i;
                    break;
                case -276539377:
                case 459074040:
                    ArrayList arrayList = this.f17738;
                    C2167.m7151(arrayList);
                    C10395.m26215(arrayList);
                    sArr = sArr2;
                    iM2566 = C0630.m2566("᩹ۗ") ^ i7;
                    i = ((iM2566 ^ i8) * 9821) ^ (-966687726);
                    i2 = -1310255705;
                    int i119 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i119;
                    i9 = i;
                    break;
                case -258803820:
                case 1402508477:
                    sArr = sArr2;
                    C1916.m6302(interfaceC13049M6438.remove(C1504.m5177(sArr3, i14, 4, i11)));
                    iM2566 = C0630.m2566("ܶܶ") ^ i8;
                    i = ((iM2566 ^ i7) * 18585) ^ 797548151;
                    i2 = -821107815;
                    int i1110 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i1110;
                    i9 = i;
                    break;
                case -143952969:
                case 985533380:
                    i11 = 47385;
                    iM6982 = (C2105.m6981("۟᩸") ^ i8) * (-77);
                    i4 = ((iM6982 ^ i7) * 17363) ^ 1605579904;
                    i5 = -101260334;
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case 234227326:
                case 666373683:
                    sArr = sArr2;
                    if (c121110.m29525(C3432.m10488(f17736, 10, 6, i11)) == z2) {
                        iM2566 = (i8 - C0630.m2566("᩶ۡ")) * 19;
                        i = ((iM2566 ^ i7) * 13383) ^ 519126222;
                        i2 = 1677413970;
                    } else {
                        iM2566 = C0630.m2566("ۜۜ") ^ i7;
                        i = ((iM2566 ^ i8) * 9651) ^ (-1076256490);
                        i2 = 2004230585;
                    }
                    int i1111 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i1111;
                    i9 = i;
                    break;
                case 376823253:
                case 2073140537:
                    sArr = sArr2;
                    i14 = 6;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("᩶ᩳ") ^ i8;
                        i = ((iM2566 ^ i7) * 16559) ^ 675571757;
                        i2 = 720819081;
                    } else {
                        iM2566 = (C2105.m6981("ۨۘ") + i8) * 71;
                        i = ((iM2566 ^ i7) * (-6383)) ^ (-1667526150);
                        i2 = 44488721;
                    }
                    int i1112 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i1112;
                    i9 = i;
                    break;
                case 386410703:
                case 454342110:
                    sArr = sArr2;
                    abstractC15440M48495 = C21404.m48495();
                    if (C3245.m9926(abstractC15440M48495)) {
                        iM2566 = C2105.m6981("ۤۚ") ^ i8;
                        i = ((iM2566 ^ i7) * 10555) ^ (-1299972716);
                        i2 = -1551578169;
                    } else {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i8;
                        i = ((iM2566 ^ i7) * 11229) ^ (-1406247597);
                        i2 = -1953593422;
                    }
                    int i1113 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i1113;
                    i9 = i;
                    break;
                case 553169800:
                case 1701113265:
                    C1128.m3851();
                    break;
                case 741047870:
                case 1010365041:
                    C11413.m28172(c121111);
                    c12118 = c12118;
                    z2 = z2;
                    iM6982 = (C2105.m6981("ᩳܿ") + i8) * (-63);
                    i4 = ((iM6982 ^ i7) * 13841) ^ 1930422208;
                    i5 = 972236785;
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case 861775131:
                case 1089260206:
                    c12118 = c12118;
                    sArr2 = f17736;
                    i13 = 5;
                    if (C2167.f7158 >= 0) {
                        z2 = z2;
                        i12 = 1;
                        iM6982 = C2105.m6981("ۖۚ") ^ i7;
                        i4 = ((iM6982 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                        i6 = iM6982 ^ i5;
                        c12118 = c12118;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        int iM6985 = (i7 - C2105.m6981("ܿۤ")) * (-53);
                        i10 = iM6985 ^ (-1937921863);
                        c12118 = c12118;
                        i9 = ((iM6985 ^ i8) * 2779) ^ 711889853;
                        i12 = 1;
                    }
                    break;
                case 864313212:
                case 1404105700:
                    z2 = z2;
                    c12118 = c12118;
                    if (this.f17739) {
                        iM6982 = (i7 - C0630.m2566("ܿ᩷")) * (-43);
                        i4 = ((iM6982 ^ i8) * (-31587)) ^ (-229761364);
                        i5 = -108638982;
                    } else {
                        iM6982 = (C2105.m6981("ᩳ۫") ^ i8) * 75;
                        i4 = ((iM6982 ^ i7) * 27229) ^ (-2147145128);
                        i5 = 1519403239;
                    }
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case 916756711:
                case 2147161584:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (i8 - C2105.m6981("ܶۤ")) * (-91);
                        i = ((iM6981 ^ i7) * (-6521)) ^ (-2107492593);
                        i3 = -1316626475;
                        i10 = iM6981 ^ i3;
                        i9 = i;
                    } else {
                        z2 = z2;
                        c12118 = c12118;
                        iM6982 = C2105.m6981("ۖۚ") ^ i7;
                        i4 = ((iM6982 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                        i6 = iM6982 ^ i5;
                        c12118 = c12118;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    }
                    break;
                case 993682270:
                case 1358873623:
                    if (C3245.f10203 > 0) {
                        iM6981 = (C0630.m2566("۬ܽ") + i7) * (-65);
                        i = ((iM6981 ^ i8) * (-8779)) ^ 416133001;
                        i3 = 1537808832;
                    } else {
                        iM6981 = (C2105.m6981("ܰۗ") ^ i7) * (-41);
                        i = ((iM6981 ^ i8) * (-3565)) ^ (-2132372447);
                        i3 = 1635585869;
                    }
                    i10 = iM6981 ^ i3;
                    i9 = i;
                    break;
                case 1226321501:
                case 1439744610:
                    sArr = sArr2;
                    C13096.m31742();
                    C1534.m5245();
                    C17315.m40632();
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i7;
                        i = ((iM2566 ^ i8) * 30723) ^ 1096675455;
                        i2 = 10001577;
                    } else {
                        iM2566 = C0630.m2566("֫ᩴ") ^ i7;
                        i = ((iM2566 ^ i8) * 5239) ^ (-21665162);
                        i2 = 1963461034;
                    }
                    int i1114 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i1114;
                    i9 = i;
                    break;
                case 1231533234:
                case 1621007842:
                    if (C0050.f910 >= 0) {
                        z2 = z2;
                        c12118 = c12118;
                        iM6982 = (i8 - C2105.m6981("᩹ۙ")) * (-57);
                        i4 = ((iM6982 ^ i7) * (-29043)) ^ 319018878;
                        i5 = 1372943074;
                        i6 = iM6982 ^ i5;
                        c12118 = c12118;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        iM6981 = (i8 - C2105.m6981("ܶۤ")) * (-91);
                        i = ((iM6981 ^ i7) * (-6521)) ^ (-2107492593);
                        i3 = -1316626475;
                        i10 = iM6981 ^ i3;
                        i9 = i;
                    }
                    break;
                case 1380660792:
                case 1954864472:
                    i11 = 9476;
                    iM6982 = (C2105.m6981("۟᩸") ^ i8) * (-77);
                    i4 = ((iM6982 ^ i7) * 17363) ^ 1605579904;
                    i5 = -101260334;
                    i6 = iM6982 ^ i5;
                    c12118 = c12118;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case 1763420604:
                case 1828087578:
                    C0382.m1848();
                    if (AbstractC2021.f6743 > 0) {
                        z2 = z2;
                        c12118 = c12118;
                        iM6982 = C2105.m6981("ۖۚ") ^ i7;
                        i4 = ((iM6982 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                        i6 = iM6982 ^ i5;
                        c12118 = c12118;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        iM6981 = (C2105.m6981("ܽ֫") ^ i7) * (-31);
                        i = ((iM6981 ^ i8) * (-32639)) ^ 2064308082;
                        i3 = -873609063;
                        i10 = iM6981 ^ i3;
                        i9 = i;
                    }
                    break;
                default:
                    sArr = sArr2;
                    c12119 = this.f17737;
                    if (c12119 != null) {
                        iM2566 = (C0630.m2566("᩻۬") + i8) * 51;
                        i = ((iM2566 ^ i7) * 18565) ^ 1872464380;
                        i2 = -251379977;
                    } else {
                        iM2566 = C0630.m2566("ܶܶ") ^ i8;
                        i = ((iM2566 ^ i7) * 18585) ^ 797548151;
                        i2 = -821107815;
                    }
                    int i1115 = iM2566 ^ i2;
                    sArr2 = sArr;
                    i10 = i1115;
                    i9 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x02e5  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01f0, code lost:
    
        if (l.C1128.f4106 > 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m16226(int i, int i2, C12951 c12951) {
        C12951 c12952;
        int iM6981;
        int i3;
        int i4;
        C12951 c12953;
        String str;
        InterfaceC12344 interfaceC12344;
        int i5;
        int i6;
        Charset charset;
        int i7;
        int i8;
        String str2;
        C12823 c12823M28170;
        SharedPreferences sharedPreferences;
        C12823 c12823;
        int i9;
        int i10;
        String str3;
        Charset charset2;
        C12951 c12954;
        C12823 c12824;
        int i11;
        String str4;
        C12823 c12825;
        int i12;
        byte[] bArr;
        short[] sArr;
        int i13;
        InterfaceC12344 interfaceC12345;
        Charset charset3;
        int i14;
        Charset charset4;
        int i15;
        int i16;
        String str5;
        int iM3590;
        int iM6982;
        int i17;
        int i18;
        String strM6988;
        int iM6983;
        int i19;
        int i20;
        C12951 c12955;
        InterfaceC12344 interfaceC12346;
        int i21;
        Charset charset5;
        int i22;
        short[] sArr2;
        int i23;
        int i24;
        int i25;
        String str6;
        C12823 c12823M28176;
        C12951 c12956;
        Charset charset6;
        int iM31488;
        int iM6984;
        int i26;
        int i27;
        C12823 c12826;
        int i28;
        int i29;
        String str7;
        int iM2566;
        int i30;
        int i31;
        C12951 c12957;
        byte[] bArr2;
        Charset charset7;
        int iM6985;
        int i32;
        int i33;
        int i34;
        String str8;
        Charset charset8;
        int iM2567;
        int i35;
        int iM2568;
        int i36;
        int i37;
        c12951 = c12951;
        C2946 c2946 = null;
        short[] sArr3 = null;
        short s = 0;
        short s2 = 0;
        int i38 = -1153573380;
        int i39 = C2958.f9394;
        int i40 = C1420.f5096;
        int iM2569 = C0630.m2566("ۙᩴ") ^ i40;
        int i41 = ((iM2569 ^ i39) * (-509)) ^ (-1184894999);
        int i42 = iM2569 ^ (-514642680);
        SharedPreferences.Editor editorEdit = null;
        C2946 c2947 = null;
        InterfaceC12344 interfaceC12347 = null;
        Charset charset9 = null;
        Charset charset10 = null;
        int[] iArr = null;
        String strM2431 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i43 = 0;
        int iM6986 = 0;
        int i44 = 0;
        boolean z = false;
        int i45 = 0;
        int iM31489 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        String strM2436 = null;
        String str9 = null;
        C12823 c12827 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i49 = 0;
        C12823 c12828 = null;
        int i50 = 0;
        SharedPreferences sharedPreferences2 = null;
        String strM11357 = null;
        InterfaceC13049 interfaceC13049M4377 = null;
        int i51 = 0;
        int iM1847 = 0;
        while (true) {
            i38 = i42 ^ (i41 & (((i38 ^ i39) * 17411) >> 31));
            switch (i38) {
                case -2078700497:
                case -446470744:
                    C3432.m10477();
                    return;
                case -2043280755:
                case 1402349283:
                    if (C4263.f13799 <= 0) {
                        c12957 = c12951;
                        str8 = strM2431;
                        Charset charset11 = charset10;
                        i34 = i43;
                        charset8 = charset11;
                        int iM25610 = C0630.m2566("ۘ۫") ^ i39;
                        int i52 = ((iM25610 ^ i40) * (-4513)) ^ (-1406711007);
                        i42 = iM25610 ^ 2102644399;
                        c12951 = c12957;
                        int i53 = i34;
                        charset10 = charset8;
                        i43 = i53;
                        strM2431 = str8;
                        i41 = i52;
                    } else {
                        c12951 = c12951;
                        sharedPreferences2 = sharedPreferences2;
                        iM1847 = iM1847;
                        c12828 = c12828;
                        iM31489 = iM31489;
                        c12827 = c12827;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC12347 = interfaceC12347;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM2431 = strM2431;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM6981 = (C0630.m2566("᩹᩹") + i39) * (-17);
                        i3 = ((iM6981 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM2431 = strM2431;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM31489 = iM31489;
                        i42 = iM6981 ^ i4;
                        i41 = i3;
                        c12951 = c12951;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c12827 = c12827;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC12347 = interfaceC12347;
                        c12828 = c12828;
                        iM1847 = iM1847;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -2005807317:
                case -1522184198:
                    if (RunnableC3474.f10992 > 0) {
                        iM2568 = (i39 - C0630.m2566("ܿ۠")) * 81;
                        i36 = ((iM2568 ^ i40) * (-17179)) ^ (-58235914);
                        i37 = 2091636630;
                        i42 = iM2568 ^ i37;
                        i41 = i36;
                    } else {
                        c12954 = c12951;
                        c12824 = c12828;
                        i11 = iM31489;
                        c12825 = c12827;
                        i12 = i47;
                        sArr = sArr5;
                        i13 = i48;
                        interfaceC12345 = interfaceC12347;
                        charset3 = charset9;
                        i14 = i46;
                        i16 = i49;
                        str5 = strM2431;
                        Charset charset12 = charset10;
                        i15 = i43;
                        iM3590 = i45;
                        str4 = str9;
                        bArr = bArr4;
                        charset4 = charset12;
                        iM6982 = C0630.m2566("ۧᩴ") ^ i39;
                        i17 = ((iM6982 ^ i40) * (-29367)) ^ 958045583;
                        i18 = -1544947037;
                        int i54 = iM6982 ^ i18;
                        i48 = i13;
                        strM2431 = str5;
                        i46 = i14;
                        sArr5 = sArr;
                        iM31489 = i11;
                        i42 = i54;
                        i41 = i17;
                        i49 = i16;
                        i47 = i12;
                        c12827 = c12825;
                        charset9 = charset3;
                        interfaceC12347 = interfaceC12345;
                        c12828 = c12824;
                        c12951 = c12954;
                        String str10 = str4;
                        i45 = iM3590;
                        i43 = i15;
                        charset10 = charset4;
                        bArr4 = bArr;
                        str9 = str10;
                    }
                    break;
                case -1960234138:
                case 221497222:
                    c12956 = c12951;
                    charset6 = charset10;
                    iM31488 = c12951.m31488() + C5695.m16030(c12951);
                    interfaceC13049M4377 = C1294.m4377(interfaceC12347);
                    int iM25611 = (C0630.m2566("ۨܽ") ^ i40) * (-127);
                    int i55 = iM31488;
                    i41 = ((iM25611 ^ i39) * (-15513)) ^ 1636378871;
                    i42 = iM25611 ^ (-2144469412);
                    c12951 = c12956;
                    c12827 = c12827;
                    str9 = str9;
                    i43 = i43;
                    charset10 = charset6;
                    bArr4 = bArr4;
                    charset9 = charset9;
                    strM2431 = strM2431;
                    i46 = i46;
                    i47 = i55;
                    break;
                case -1889123764:
                case 2129458295:
                    c12951 = c12951;
                    c12827 = c12827;
                    i47 = i47;
                    i46 = i46;
                    strM2431 = strM2431;
                    Charset charset13 = charset10;
                    i43 = i43;
                    strM6988 = str9;
                    bArr4 = bArr4;
                    charset10 = charset13;
                    if (i49 != z) {
                        iM6984 = (i39 - C2105.m6981("ۨۤ")) * (-27);
                        i41 = ((iM6984 ^ i40) * (-25121)) ^ 1226134967;
                        i26 = -475361121;
                    } else {
                        iM6984 = (C2105.m6981("᩷ܳ") + i40) * (-93);
                        i41 = ((iM6984 ^ i39) * 16675) ^ (-1367860080);
                        i26 = 881972326;
                    }
                    i42 = iM6984 ^ i26;
                    c12951 = c12951;
                    strM2431 = strM2431;
                    i46 = i46;
                    i47 = i47;
                    c12827 = c12827;
                    byte[] bArr5 = bArr4;
                    str9 = strM6988;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr5;
                    break;
                case -1887199959:
                case 1834331342:
                    if (iM6986 != 3152905) {
                        iM2567 = (C2105.m6981("᩵ܰ") ^ i39) * (-113);
                        i41 = ((iM2567 ^ i40) * 12987) ^ (-1654834102);
                        i35 = -379641392;
                    } else {
                        iM2567 = C2105.m6981("ۢ֨") ^ i39;
                        i41 = ((iM2567 ^ i40) * 17811) ^ 55105175;
                        i35 = -707859978;
                    }
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case -1857056692:
                case 1485999170:
                    strM2431 = strM2431;
                    int iM31493 = c12951.m31493();
                    byte[] bArr6 = new byte[iM31493];
                    c12957 = c12951;
                    c12957.m31489(iM31493, bArr6);
                    interfaceC13049M4377.mo25855(C3683.m11215(c2946), bArr6);
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM6985 = C2105.m6981("֡֫") ^ i40;
                    i32 = ((iM6985 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case -1716577090:
                case -1097648734:
                    i51 = 57099;
                    iM6981 = (C0630.m2566("ܳۡ") ^ i39) * 21;
                    i3 = ((iM6981 ^ i40) * 24995) ^ (-1721031619);
                    i4 = 604509095;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -1707240211:
                case 1155221471:
                    strM2431 = RunnableC0588.m2431(c2946);
                    C3683.m11210(strM2431, C4263.m12817(f17736, 95, 3, i51));
                    iM6986 = C2105.m6981(strM2431);
                    if (iM6986 != -1265244707) {
                        iM2567 = C2105.m6981("ۙᩳ") ^ i39;
                        i41 = ((iM2567 ^ i40) * 10453) ^ 1561797236;
                        i35 = -851595865;
                    } else {
                        iM2567 = C2105.m6981("۠᩹") ^ i40;
                        i41 = ((iM2567 ^ i39) * 19527) ^ 1428344840;
                        i35 = 199859109;
                    }
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case -1687397028:
                case -944322074:
                    interfaceC13049M4377.putFloat(RunnableC0588.m2431(c2946), c12951.m31495());
                    c12957 = c12951;
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM6985 = C2105.m6981("֡֫") ^ i40;
                    i32 = ((iM6985 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case -1612270391:
                case -1126533807:
                    i34 = i43;
                    c12957 = c12951;
                    str8 = strM2431;
                    int iM31494 = c12951.m31493();
                    byte[] bArr7 = new byte[iM31494];
                    c12957.m31489(iM31494, bArr7);
                    charset8 = C7955.f24594;
                    if (!RunnableC1108.f4040) {
                        bArr4 = bArr7;
                        int iM25612 = C0630.m2566("ۘ۫") ^ i39;
                        int i56 = ((iM25612 ^ i40) * (-4513)) ^ (-1406711007);
                        i42 = iM25612 ^ 2102644399;
                        c12951 = c12957;
                        int i57 = i34;
                        charset10 = charset8;
                        i43 = i57;
                        strM2431 = str8;
                        i41 = i56;
                    } else {
                        int iM25613 = (C0630.m2566("֡۬") ^ i40) * 21;
                        int i58 = ((iM25613 ^ i39) * (-7833)) ^ (-1058508019);
                        i42 = iM25613 ^ (-1779298767);
                        strM2431 = str8;
                        i41 = i58;
                        i43 = i34;
                        charset10 = charset8;
                        bArr4 = bArr7;
                        c12951 = c12957;
                    }
                    break;
                case -1611337686:
                case 980405202:
                    throw new RuntimeException(C3245.m9927(c2947.m8970(), strM11357));
                case -1569389250:
                case 719294985:
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    int i59 = s + s2;
                    int i60 = (s * s) + 89302500;
                    if ((i59 * i59) - (i60 + i60) > 0) {
                        iM6981 = (C2105.m6981("ۢۙ") + i39) * 5;
                        i3 = ((iM6981 ^ i40) * (-1441)) ^ (-1366672549);
                        i4 = -770524323;
                    } else {
                        iM6981 = C2105.m6981("ۡܽ") ^ i40;
                        i3 = ((iM6981 ^ i39) * (-10021)) ^ 832932537;
                        i4 = -630908074;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -1567025113:
                case 1226680550:
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    sArr3 = f17736;
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("ۤܳ") ^ i40;
                        i3 = ((iM6981 ^ i39) * (-22713)) ^ 838682106;
                        i4 = -451616142;
                    } else {
                        iM6981 = (i40 - C2105.m6981("֡۠")) * (-31);
                        i3 = ((iM6981 ^ i39) * 23889) ^ 1789308174;
                        i4 = 937914573;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -1554051202:
                case 1581205828:
                    c12955 = c12951;
                    interfaceC12346 = interfaceC12347;
                    i21 = iM31489;
                    charset5 = charset9;
                    i22 = i47;
                    sArr2 = sArr5;
                    i23 = i48;
                    i24 = i49;
                    i25 = i46;
                    str6 = strM2431;
                    Charset charset14 = charset10;
                    i43 = i43;
                    strM6988 = str9;
                    bArr4 = bArr4;
                    charset10 = charset14;
                    c12955.seek(i21);
                    editorEdit.apply();
                    int i61 = C11413.f34113;
                    c12823M28176 = C11413.m28176();
                    if (C2520.f8000 >= 0) {
                        int iM6987 = C2105.m6981("ۙۗ") ^ i39;
                        int i62 = i21;
                        i27 = ((iM6987 ^ i40) * (-27299)) ^ 1180042965;
                        i48 = i23;
                        sArr5 = sArr2;
                        iM31489 = i62;
                        i42 = iM6987 ^ (-775245703);
                        strM2431 = str6;
                        i46 = i25;
                        i47 = i22;
                        c12827 = c12823M28176;
                        i49 = i24;
                        charset9 = charset5;
                        interfaceC12347 = interfaceC12346;
                        i41 = i27;
                        c12951 = c12955;
                        byte[] bArr8 = bArr4;
                        str9 = strM6988;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr8;
                    } else {
                        int iM25614 = (C0630.m2566("۠ۗ") + i39) * 17;
                        int i63 = ((iM25614 ^ i40) * 1383) ^ 59704184;
                        i48 = i23;
                        sArr5 = sArr2;
                        iM31489 = i21;
                        i42 = iM25614 ^ 2040685073;
                        c12951 = c12955;
                        str9 = strM6988;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr4;
                        interfaceC12347 = interfaceC12346;
                        i41 = i63;
                        strM2431 = str6;
                        i46 = i25;
                        i47 = i22;
                        c12827 = c12823M28176;
                        i49 = i24;
                        charset9 = charset5;
                    }
                    break;
                case -1495341783:
                case 1381644103:
                    C3019.m9255();
                    if (C3911.m11924() > 0) {
                        c12955 = c12951;
                        interfaceC12346 = interfaceC12347;
                        i21 = iM31489;
                        charset5 = charset9;
                        sArr2 = sArr5;
                        i23 = i48;
                        i24 = i49;
                        c12823M28176 = c12827;
                        i22 = i47;
                        i25 = i46;
                        str6 = strM2431;
                        Charset charset15 = charset10;
                        i43 = i43;
                        strM6988 = str9;
                        bArr4 = bArr4;
                        charset10 = charset15;
                        int iM6988 = C2105.m6981("ۙۗ") ^ i39;
                        int i64 = i21;
                        i27 = ((iM6988 ^ i40) * (-27299)) ^ 1180042965;
                        i48 = i23;
                        sArr5 = sArr2;
                        iM31489 = i64;
                        i42 = iM6988 ^ (-775245703);
                        strM2431 = str6;
                        i46 = i25;
                        i47 = i22;
                        c12827 = c12823M28176;
                        i49 = i24;
                        charset9 = charset5;
                        interfaceC12347 = interfaceC12346;
                        i41 = i27;
                        c12951 = c12955;
                        byte[] bArr9 = bArr4;
                        str9 = strM6988;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr9;
                    } else {
                        c12951 = c12951;
                        sharedPreferences2 = sharedPreferences2;
                        iM1847 = iM1847;
                        c12828 = c12828;
                        iM31489 = iM31489;
                        c12827 = c12827;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC12347 = interfaceC12347;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM2431 = strM2431;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM6981 = (i40 - C2105.m6981("ۢܳ")) * 89;
                        i3 = ((iM6981 ^ i39) * 18831) ^ (-1362359957);
                        i4 = -1783280099;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM2431 = strM2431;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM31489 = iM31489;
                        i42 = iM6981 ^ i4;
                        i41 = i3;
                        c12951 = c12951;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c12827 = c12827;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC12347 = interfaceC12347;
                        c12828 = c12828;
                        iM1847 = iM1847;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -1353440122:
                case 1718498044:
                    c12955 = c12951;
                    c12826 = c12827;
                    i28 = i47;
                    Charset charset16 = charset10;
                    i43 = i43;
                    int i65 = i46;
                    str7 = strM2431;
                    byte[] bArr10 = bArr4;
                    charset10 = charset16;
                    E e = c12826.get(i65);
                    i29 = i65;
                    strM6988 = str9;
                    C2126.m7031(e, strM6988);
                    c2946 = (C2946) e;
                    switch (c2946.m8970()) {
                        case 0:
                            bArr4 = bArr10;
                            iM2566 = C2105.m6981("ᩴᩳ") ^ i39;
                            i30 = ((iM2566 ^ i40) * 6801) ^ (-1570349916);
                            i31 = 1241244089;
                            break;
                        case 1:
                            bArr4 = bArr10;
                            iM2566 = (i40 - C2105.m6981("ۤܰ")) * (-107);
                            i30 = ((iM2566 ^ i39) * 1313) ^ (-980881789);
                            i31 = 1983912235;
                            break;
                        case 2:
                            bArr4 = bArr10;
                            iM2566 = (i39 - C2105.m6981("ܽܶ")) * 97;
                            i30 = ((iM2566 ^ i40) * 25947) ^ (-806091131);
                            i31 = -807593434;
                            break;
                        case 3:
                            bArr4 = bArr10;
                            iM2566 = (i39 - C2105.m6981("ۘ᩹")) * (-47);
                            i30 = ((iM2566 ^ i40) * (-28121)) ^ (-1900579031);
                            i31 = -529122295;
                            break;
                        case 4:
                            bArr4 = bArr10;
                            iM2566 = (C2105.m6981("ܺ᩵") ^ i40) * 115;
                            i30 = ((iM2566 ^ i39) * 14041) ^ (-340923603);
                            i31 = -1874992823;
                            break;
                        case 5:
                            bArr4 = bArr10;
                            iM2566 = (C2105.m6981("᩵֨") ^ i40) * (-23);
                            i30 = ((iM2566 ^ i39) * (-12279)) ^ (-1860344506);
                            i31 = -1337055267;
                            break;
                        case 6:
                            bArr4 = bArr10;
                            iM2566 = (i39 - C2105.m6981("ۧۗ")) * 59;
                            i30 = ((iM2566 ^ i40) * 19219) ^ 2135679865;
                            i31 = 611664103;
                            break;
                        case 7:
                            iM2566 = (C0630.m2566("۫ۗ") + i39) * (-35);
                            bArr4 = bArr10;
                            i30 = ((iM2566 ^ i40) * 4531) ^ (-1233040253);
                            i31 = -1146416623;
                            break;
                        default:
                            bArr4 = bArr10;
                            iM2566 = C2105.m6981("ۤ᩵") ^ i40;
                            i30 = ((iM2566 ^ i39) * (-20587)) ^ 518155535;
                            i31 = 2029050187;
                            break;
                    }
                    i42 = iM2566 ^ i31;
                    i41 = i30;
                    strM2431 = str7;
                    i46 = i29;
                    i47 = i28;
                    c12827 = c12826;
                    c12951 = c12955;
                    byte[] bArr11 = bArr4;
                    str9 = strM6988;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr11;
                    break;
                case -1301343228:
                case -1082488634:
                    ServiceConnectionC3453.m10564();
                    if (C7811.f24123 >= 0) {
                        c12954 = c12951;
                        c12824 = c12828;
                        i11 = iM31489;
                        c12825 = c12827;
                        i12 = i47;
                        sArr = sArr5;
                        i13 = i48;
                        interfaceC12345 = interfaceC12347;
                        charset3 = charset9;
                        i14 = i46;
                        i16 = i49;
                        str5 = strM2431;
                        Charset charset17 = charset10;
                        i15 = i43;
                        iM3590 = i45;
                        str4 = str9;
                        bArr = bArr4;
                        charset4 = charset17;
                        iM6982 = C0630.m2566("ۧᩴ") ^ i39;
                        i17 = ((iM6982 ^ i40) * (-29367)) ^ 958045583;
                        i18 = -1544947037;
                        int i510 = iM6982 ^ i18;
                        i48 = i13;
                        strM2431 = str5;
                        i46 = i14;
                        sArr5 = sArr;
                        iM31489 = i11;
                        i42 = i510;
                        i41 = i17;
                        i49 = i16;
                        i47 = i12;
                        c12827 = c12825;
                        charset9 = charset3;
                        interfaceC12347 = interfaceC12345;
                        c12828 = c12824;
                        c12951 = c12954;
                        String str11 = str4;
                        i45 = iM3590;
                        i43 = i15;
                        charset10 = charset4;
                        bArr4 = bArr;
                        str9 = str11;
                    } else {
                        c12951 = c12951;
                        sharedPreferences2 = sharedPreferences2;
                        iM1847 = iM1847;
                        c12828 = c12828;
                        iM31489 = iM31489;
                        c12827 = c12827;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC12347 = interfaceC12347;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM2431 = strM2431;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM6981 = (C0630.m2566("᩹᩹") + i39) * (-17);
                        i3 = ((iM6981 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM2431 = strM2431;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM31489 = iM31489;
                        i42 = iM6981 ^ i4;
                        i41 = i3;
                        c12951 = c12951;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c12827 = c12827;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC12347 = interfaceC12347;
                        c12828 = c12828;
                        iM1847 = iM1847;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -1292418219:
                case -866370755:
                    c12957 = c12951;
                    strM2431 = strM2431;
                    bArr2 = bArr4;
                    charset7 = charset10;
                    i43 = i43;
                    if (i49 != 6) {
                        iM6985 = (C2105.m6981("ۢۚ") + i40) * 15;
                        i32 = ((iM6985 ^ i39) * 24905) ^ (-1764331164);
                        i33 = -1309952879;
                    } else {
                        iM6985 = (C2105.m6981("ۚۘ") ^ i39) * (-83);
                        i32 = ((iM6985 ^ i40) * (-8043)) ^ (-1765436000);
                        i33 = 1074527281;
                    }
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case -1251413743:
                case -973960700:
                    editorEdit.putLong(RunnableC0588.m2431(c2947), c12951.readLong());
                    str3 = strM2431;
                    charset2 = charset10;
                    sharedPreferences2 = sharedPreferences2;
                    int iM6989 = (i39 - C2105.m6981("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences3 = sharedPreferences2;
                    int i66 = ((iM6989 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM6989 ^ 1103830654;
                    i48 = i48;
                    strM2431 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences3;
                    iM31489 = iM31489;
                    i47 = i47;
                    c12827 = c12827;
                    strM2436 = strM2436;
                    c12951 = c12951;
                    int i67 = iM1847;
                    i41 = i66;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = i67;
                    break;
                case -1226237415:
                case -118099038:
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    int i68 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    iM1847 = i68;
                    sArr4 = sArr4;
                    strM2436 = RunnableC0588.m2436(sArr4, 23, 3, i51);
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C0630.m2566("᩹᩹") + i39) * (-17);
                        i3 = ((iM6981 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                    } else {
                        iM6981 = C0630.m2566("᩵ܽ") ^ i40;
                        i3 = ((iM6981 ^ i39) * 19031) ^ 527331387;
                        i4 = 878921904;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -1216881381:
                case 963773160:
                    interfaceC13049M4377.mo25856(RunnableC0588.m2431(c2946), iArr);
                    c12957 = c12951;
                    strM2431 = strM2431;
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM6985 = C2105.m6981("֡֫") ^ i40;
                    i32 = ((iM6985 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case -1198633224:
                case 515084767:
                    c12957 = c12951;
                    strM2431 = strM2431;
                    C4616.m13549(interfaceC13049M4377, C3683.m11215(c2946), C0964.m3406(c12951));
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM6985 = C2105.m6981("֡֫") ^ i40;
                    i32 = ((iM6985 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case -1112818352:
                case 380120916:
                    c12951.seek(i47);
                    C1916.m6302(interfaceC13049M4377);
                    this.f17739 = z;
                    return;
                case -1108550965:
                case 2016551350:
                    c12951 = c12951;
                    c12827 = c12827;
                    i47 = i47;
                    i46 = i46;
                    strM2431 = strM2431;
                    Charset charset18 = charset10;
                    i43 = i43;
                    strM6988 = str9;
                    bArr4 = bArr4;
                    charset10 = charset18;
                    int iM31495 = c12951.m31493();
                    byte[] bArr12 = new byte[iM31495];
                    c12951.m31489(iM31495, bArr12);
                    charset9 = C7955.f24594;
                    if (RunnableC1108.f4040) {
                        int iM69810 = (i39 - C2105.m6981("ۖۖ")) * 33;
                        i42 = iM69810 ^ (-2067971950);
                        bArr3 = bArr12;
                        i41 = ((iM69810 ^ i40) * 1921) ^ (-2007688499);
                    } else {
                        bArr3 = bArr12;
                        iM6984 = C2105.m6981("ۧۛ") ^ i40;
                        i41 = ((iM6984 ^ i39) * 13597) ^ (-480560999);
                        i26 = -55537786;
                        i42 = iM6984 ^ i26;
                    }
                    c12951 = c12951;
                    strM2431 = strM2431;
                    i46 = i46;
                    i47 = i47;
                    c12827 = c12827;
                    byte[] bArr13 = bArr4;
                    str9 = strM6988;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr13;
                    break;
                case -969409054:
                case -960442312:
                    c12955 = c12951;
                    c12826 = c12827;
                    i28 = i47;
                    i29 = i46;
                    str7 = strM2431;
                    Charset charset19 = charset10;
                    i43 = i43;
                    strM6988 = str9;
                    bArr4 = bArr4;
                    charset10 = charset19;
                    if (i49 != 3) {
                        iM2566 = C0630.m2566("۟ۤ") ^ i39;
                        i30 = ((iM2566 ^ i40) * (-22483)) ^ 1694765574;
                        i31 = 1205158439;
                    } else {
                        iM2566 = (i40 - C0630.m2566("ۙܽ")) * 23;
                        i30 = ((iM2566 ^ i39) * (-9103)) ^ (-264549286);
                        i31 = -188543930;
                    }
                    i42 = iM2566 ^ i31;
                    i41 = i30;
                    strM2431 = str7;
                    i46 = i29;
                    i47 = i28;
                    c12827 = c12826;
                    c12951 = c12955;
                    byte[] bArr14 = bArr4;
                    str9 = strM6988;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr14;
                    break;
                case -958722576:
                case -923896467:
                    throw new IllegalArgumentException(C1420.m4909(i, ServiceConnectionC3453.m10568(f17736, 26, 28, i51)));
                case -817022343:
                case 1894618395:
                    c12951 = c12951;
                    int i69 = iM1847;
                    C12823 c12829 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    c12828 = c12829;
                    this.f17738 = new ArrayList(C10395.m26220());
                    sharedPreferences2 = sharedPreferences2;
                    iM1847 = i69;
                    sArr4 = sArr4;
                    iM6981 = (C0630.m2566("ܿᩳ") ^ i40) * (-29);
                    i3 = ((iM6981 ^ i39) * 12379) ^ 1903247463;
                    i4 = 1054601220;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -753540636:
                case 556946212:
                    this.f17737 = C11413.m28169(c12951, i2);
                    return;
                case -751657766:
                case 1356122843:
                    this.f17742 = z;
                    iM2567 = (C2105.m6981("᩵ܰ") ^ i39) * (-113);
                    i41 = ((iM2567 ^ i40) * 12987) ^ (-1654834102);
                    i35 = -379641392;
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case -660799352:
                case -320439478:
                    if (i43 < i44) {
                        iM2567 = (C0630.m2566("ۚᩴ") + i40) * 47;
                        i41 = ((iM2567 ^ i39) * 14599) ^ (-354337320);
                        i35 = -2103222901;
                    } else {
                        iM2567 = (i39 - C0630.m2566("ۘܶ")) * 47;
                        i41 = ((iM2567 ^ i40) * 19871) ^ 1822952462;
                        i35 = 944757151;
                    }
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case -590177469:
                case -568195553:
                    c12957 = c12951;
                    strM2431 = strM2431;
                    interfaceC13049M4377.mo25853(c12951.m31505(), C3683.m11215(c2946));
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM6985 = C2105.m6981("֡֫") ^ i40;
                    i32 = ((iM6985 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case -555001827:
                case 139283696:
                    c12955 = c12951;
                    String str12 = strM2431;
                    C12823 c128210 = c12827;
                    int i70 = i47;
                    Charset charset20 = charset10;
                    i43 = i43;
                    strM6988 = str9;
                    bArr4 = bArr4;
                    charset10 = charset20;
                    int iM6380 = RunnableC1937.m6380(c12951);
                    if (iM6380 >= C3432.m10481(c128210)) {
                        int iM69811 = (C2105.m6981("ۨ۫") ^ i40) * (-81);
                        i27 = ((iM69811 ^ i39) * (-8649)) ^ (-518403226);
                        i42 = iM69811 ^ 817387369;
                        i47 = i70;
                        strM2431 = str12;
                        c12827 = c128210;
                        i46 = iM6380;
                        i41 = i27;
                        c12951 = c12955;
                        byte[] bArr15 = bArr4;
                        str9 = strM6988;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr15;
                    } else {
                        int iM25615 = (i39 - C0630.m2566("ۛۨ")) * (-91);
                        int i71 = ((iM25615 ^ i40) * 26915) ^ (-694109400);
                        i42 = iM25615 ^ (-1165721874);
                        c12951 = c12955;
                        i47 = i70;
                        c12827 = c128210;
                        str9 = strM6988;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr4;
                        i46 = iM6380;
                        i41 = i71;
                        strM2431 = str12;
                    }
                    break;
                case -471528138:
                case 115791259:
                    String str13 = strM2431;
                    byte[] bArr16 = bArr4;
                    charset2 = charset10;
                    editorEdit.putBoolean(C3683.m11215(c2947), C0964.m3406(c12951));
                    str3 = str13;
                    charset9 = charset9;
                    str9 = str9;
                    bArr4 = bArr16;
                    int iM69812 = (i39 - C2105.m6981("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences4 = sharedPreferences2;
                    int i610 = ((iM69812 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM69812 ^ 1103830654;
                    i48 = i48;
                    strM2431 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences4;
                    iM31489 = iM31489;
                    i47 = i47;
                    c12827 = c12827;
                    strM2436 = strM2436;
                    c12951 = c12951;
                    int i611 = iM1847;
                    i41 = i610;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = i611;
                    break;
                case -470753516:
                case -205078781:
                    c12957 = c12951;
                    strM2431 = strM2431;
                    interfaceC13049M4377.mo25852(C1916.m6304(c12951), RunnableC0588.m2431(c2946));
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM6985 = C2105.m6981("֡֫") ^ i40;
                    i32 = ((iM6985 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case -459996485:
                case 993718990:
                    throw new RuntimeException(C3245.m9927(c2946.m8970(), strM11357));
                case -371411153:
                case 552396903:
                    if (C1294.m4369(strM2431, C0422.m1955(f17736, UMErrorCode.E_UM_BE_JSON_FAILED, 4, i51))) {
                        iM2567 = (C2105.m6981("ۙ᩷") ^ i40) * 7;
                        i41 = ((iM2567 ^ i39) * 15373) ^ 646831036;
                        i35 = -1419573653;
                    } else {
                        iM2567 = (C2105.m6981("᩵ܰ") ^ i39) * (-113);
                        i41 = ((iM2567 ^ i40) * 12987) ^ (-1654834102);
                        i35 = -379641392;
                    }
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case -357559768:
                case 1520450618:
                    interfaceC13049M4377.mo25854(c12951.readLong(), RunnableC0588.m2431(c2946));
                    c12957 = c12951;
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM6985 = C2105.m6981("֡֫") ^ i40;
                    i32 = ((iM6985 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case -356836382:
                case -255232071:
                    iArr[i43] = c12951.m31505();
                    i43++;
                    c12952 = c12951;
                    int iM25616 = C0630.m2566("ۙۤ") ^ i39;
                    int i72 = ((iM25616 ^ i40) * (-23345)) ^ 60390810;
                    i42 = iM25616 ^ 432306934;
                    c12951 = c12952;
                    strM2431 = strM2431;
                    i41 = i72;
                    break;
                case -356678840:
                case 1920433122:
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    if (this.f17741) {
                        iM6981 = C2105.m6981("᩸۫") ^ i40;
                        i3 = ((iM6981 ^ i39) * 28635) ^ (-969858382);
                        i4 = -1937450338;
                    } else {
                        iM6981 = (C0630.m2566("ܿᩳ") ^ i40) * (-29);
                        i3 = ((iM6981 ^ i39) * 12379) ^ 1903247463;
                        i4 = 1054601220;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -332848248:
                case 1456197721:
                    C2126.m7040();
                    if (C4117.f13076 <= 0) {
                        iM2568 = C0630.m2566("᩸᩸") ^ i40;
                        i36 = ((iM2568 ^ i39) * 28469) ^ 1759804127;
                        i37 = 820257906;
                        i42 = iM2568 ^ i37;
                        i41 = i36;
                    } else {
                        c12951 = c12951;
                        sharedPreferences2 = sharedPreferences2;
                        iM1847 = iM1847;
                        c12828 = c12828;
                        iM31489 = iM31489;
                        c12827 = c12827;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC12347 = interfaceC12347;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM2431 = strM2431;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM6981 = (C0630.m2566("᩹᩹") + i39) * (-17);
                        i3 = ((iM6981 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM2431 = strM2431;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM31489 = iM31489;
                        i42 = iM6981 ^ i4;
                        i41 = i3;
                        c12951 = c12951;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c12827 = c12827;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC12347 = interfaceC12347;
                        c12828 = c12828;
                        iM1847 = iM1847;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -263395565:
                case 941595018:
                    if (iM6986 != -1265237329) {
                        iM2567 = (C2105.m6981("ۚ۠") ^ i40) * 63;
                        i41 = ((iM2567 ^ i39) * 16559) ^ 936352784;
                        i35 = 557166215;
                    } else {
                        iM2567 = C2105.m6981("֡ۚ") ^ i39;
                        i41 = ((iM2567 ^ i40) * 7987) ^ (-1619818796);
                        i35 = -1661635628;
                    }
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case -231368301:
                case 1789937654:
                    c12951 = c12951;
                    C12823 c128211 = c12827;
                    i47 = i47;
                    i46 = i46;
                    str3 = strM2431;
                    String str14 = str9;
                    bArr4 = bArr4;
                    charset2 = charset10;
                    editorEdit.putInt(RunnableC0588.m2431(c2947), c12951.m31505());
                    c12827 = c128211;
                    strM2436 = strM2436;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i49 = i49;
                    i45 = i45;
                    str9 = str14;
                    sharedPreferences2 = sharedPreferences2;
                    int iM69813 = (i39 - C2105.m6981("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences5 = sharedPreferences2;
                    int i612 = ((iM69813 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM69813 ^ 1103830654;
                    i48 = i48;
                    strM2431 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences5;
                    iM31489 = iM31489;
                    i47 = i47;
                    c12827 = c12827;
                    strM2436 = strM2436;
                    c12951 = c12951;
                    int i613 = iM1847;
                    i41 = i612;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = i613;
                    break;
                case -216646048:
                case 850351164:
                    if (RunnableC3474.f10992 <= 0) {
                        c12951 = c12951;
                        c12827 = c12827;
                        i47 = i47;
                        i46 = i46;
                        strM2431 = strM2431;
                        Charset charset21 = charset10;
                        i43 = i43;
                        strM6988 = str9;
                        bArr4 = bArr4;
                        charset10 = charset21;
                        iM6984 = C2105.m6981("ۧۛ") ^ i40;
                        i41 = ((iM6984 ^ i39) * 13597) ^ (-480560999);
                        i26 = -55537786;
                        i42 = iM6984 ^ i26;
                        c12951 = c12951;
                        strM2431 = strM2431;
                        i46 = i46;
                        i47 = i47;
                        c12827 = c12827;
                        byte[] bArr17 = bArr4;
                        str9 = strM6988;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr17;
                    } else {
                        c12951 = c12951;
                        sharedPreferences2 = sharedPreferences2;
                        iM1847 = iM1847;
                        c12828 = c12828;
                        iM31489 = iM31489;
                        c12827 = c12827;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC12347 = interfaceC12347;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM2431 = strM2431;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM6981 = (C0630.m2566("᩹᩹") + i39) * (-17);
                        i3 = ((iM6981 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM2431 = strM2431;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM31489 = iM31489;
                        i42 = iM6981 ^ i4;
                        i41 = i3;
                        c12951 = c12951;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c12827 = c12827;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC12347 = interfaceC12347;
                        c12828 = c12828;
                        iM1847 = iM1847;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -127312751:
                case 1056800127:
                    c12953 = c12951;
                    c12827 = c12827;
                    i47 = i47;
                    i46 = i46;
                    strM2431 = strM2431;
                    Charset charset22 = charset9;
                    i7 = i49;
                    Charset charset23 = charset10;
                    i43 = i43;
                    strM6988 = str9;
                    bArr4 = bArr4;
                    charset10 = charset23;
                    interfaceC12347 = ApplicationC20075.f65008;
                    sArr5 = f17736;
                    i48 = 91;
                    if (C2958.f9394 < 0) {
                        int iM25617 = C0630.m2566("ۜ᩷") ^ i40;
                        i41 = ((iM25617 ^ i39) * (-30493)) ^ 1846917309;
                        i42 = iM25617 ^ 281580464;
                        c12951 = c12953;
                        i49 = i7;
                        charset9 = charset22;
                        strM2431 = strM2431;
                        i46 = i46;
                        i47 = i47;
                        c12827 = c12827;
                        byte[] bArr18 = bArr4;
                        str9 = strM6988;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr18;
                    } else {
                        sharedPreferences = sharedPreferences2;
                        str = strM2436;
                        i5 = iM1847;
                        i8 = i45;
                        i6 = iM31489;
                        str2 = strM6988;
                        c12823M28170 = c12828;
                        interfaceC12344 = interfaceC12347;
                        charset = charset22;
                        int iM69814 = C2105.m6981("۠ۢ") ^ i40;
                        c12823 = c12823M28170;
                        i9 = ((iM69814 ^ i39) * (-18525)) ^ (-627094835);
                        i10 = iM69814 ^ 274473333;
                        strM2431 = strM2431;
                        i46 = i46;
                        iM31489 = i6;
                        i42 = i10;
                        i47 = i47;
                        c12827 = c12827;
                        strM2436 = str;
                        c12951 = c12953;
                        SharedPreferences sharedPreferences6 = sharedPreferences;
                        i41 = i9;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr4;
                        str9 = str2;
                        i45 = i8;
                        i49 = i7;
                        charset9 = charset;
                        interfaceC12347 = interfaceC12344;
                        c12828 = c12823;
                        iM1847 = i5;
                        sharedPreferences2 = sharedPreferences6;
                    }
                    break;
                case -59860202:
                case 1210298280:
                    if (C1294.m4369(strM2431, C3663.m11162(f17736, 98, 6, i51))) {
                        iM2567 = C0630.m2566("ܶ᩹") ^ i40;
                        i41 = ((iM2567 ^ i39) * 6321) ^ (-847520511);
                        i35 = -1862746803;
                    } else {
                        iM2567 = (C2105.m6981("᩵ܰ") ^ i39) * (-113);
                        i41 = ((iM2567 ^ i40) * 12987) ^ (-1654834102);
                        i35 = -379641392;
                    }
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case -43897000:
                case 1754680820:
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    s = sArr3[22];
                    s2 = 9450;
                    if (C1047.f3863 >= 0) {
                        iM6981 = (i40 - C2105.m6981("ۢܳ")) * 89;
                        i3 = ((iM6981 ^ i39) * 18831) ^ (-1362359957);
                        i4 = -1783280099;
                    } else {
                        iM6981 = (C2105.m6981("۟۫") + i39) * (-53);
                        i3 = ((iM6981 ^ i40) * (-10313)) ^ 925079188;
                        i4 = 356820200;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -29115994:
                case 1932374246:
                    if (!C1711.f5919) {
                        c12951 = c12951;
                        sharedPreferences2 = sharedPreferences2;
                        iM1847 = iM1847;
                        c12828 = c12828;
                        iM31489 = iM31489;
                        c12827 = c12827;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC12347 = interfaceC12347;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM2431 = strM2431;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM6981 = C2105.m6981("ۤܳ") ^ i40;
                        i3 = ((iM6981 ^ i39) * (-22713)) ^ 838682106;
                        i4 = -451616142;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM2431 = strM2431;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM31489 = iM31489;
                        i42 = iM6981 ^ i4;
                        i41 = i3;
                        c12951 = c12951;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c12827 = c12827;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC12347 = interfaceC12347;
                        c12828 = c12828;
                        iM1847 = iM1847;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    iM6981 = (C0630.m2566("᩹᩹") + i39) * (-17);
                    i3 = ((iM6981 ^ i40) * 11903) ^ 1624535732;
                    i4 = 1013888758;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 76342806:
                case 356740697:
                    C5695.m16023();
                    C4263.m12819();
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    iM6981 = (C0630.m2566("᩹᩹") + i39) * (-17);
                    i3 = ((iM6981 ^ i40) * 11903) ^ 1624535732;
                    i4 = 1013888758;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 228426502:
                case 2122980121:
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    String str15 = strM2436;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    if (i == 1749442560) {
                        iM6981 = C0630.m2566("۫᩷") ^ i40;
                        strM2436 = str15;
                        i3 = ((iM6981 ^ i39) * (-27635)) ^ (-236664861);
                        i4 = 1660450908;
                    } else {
                        strM2436 = str15;
                        iM6981 = (i39 - C0630.m2566("֫ܰ")) * (-65);
                        i3 = ((iM6981 ^ i40) * 14597) ^ (-813009057);
                        i4 = 180001443;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 379396302:
                case 1824629124:
                    c12953 = c12951;
                    str = strM2436;
                    interfaceC12344 = interfaceC12347;
                    i5 = iM1847;
                    i6 = iM31489;
                    charset = charset9;
                    c12827 = c12827;
                    i47 = i47;
                    short[] sArr6 = sArr5;
                    int i73 = i48;
                    i7 = i49;
                    i8 = i45;
                    str2 = str9;
                    i46 = i46;
                    bArr4 = bArr4;
                    strM2431 = strM2431;
                    charset10 = charset10;
                    i43 = i43;
                    int i74 = C11413.f34113;
                    c12823M28170 = C11413.m28170();
                    sharedPreferences = ApplicationC20075.f65010;
                    sArr4 = f17736;
                    if (C1005.m3501()) {
                        int iM69815 = C2105.m6981("۬᩸") ^ i39;
                        c12823 = c12823M28170;
                        i9 = ((iM69815 ^ i40) * 1023) ^ (-1563712950);
                        i10 = iM69815 ^ 1137389954;
                        i48 = i73;
                        strM2431 = strM2431;
                        i46 = i46;
                        sArr5 = sArr6;
                    } else {
                        i48 = i73;
                        sArr5 = sArr6;
                        int iM69816 = C2105.m6981("۠ۢ") ^ i40;
                        c12823 = c12823M28170;
                        i9 = ((iM69816 ^ i39) * (-18525)) ^ (-627094835);
                        i10 = iM69816 ^ 274473333;
                        strM2431 = strM2431;
                        i46 = i46;
                    }
                    iM31489 = i6;
                    i42 = i10;
                    i47 = i47;
                    c12827 = c12827;
                    strM2436 = str;
                    c12951 = c12953;
                    SharedPreferences sharedPreferences7 = sharedPreferences;
                    i41 = i9;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr4;
                    str9 = str2;
                    i45 = i8;
                    i49 = i7;
                    charset9 = charset;
                    interfaceC12347 = interfaceC12344;
                    c12828 = c12823;
                    iM1847 = i5;
                    sharedPreferences2 = sharedPreferences7;
                    break;
                case 388365304:
                case 1618028163:
                    C12951 c12958 = c12951;
                    InterfaceC12344 interfaceC12348 = interfaceC12347;
                    C12823 c128212 = c12828;
                    int i75 = i45;
                    iM31489 = iM31489;
                    charset9 = charset9;
                    C12823 c128213 = c12827;
                    int i76 = i47;
                    sArr5 = sArr5;
                    i48 = i48;
                    int i77 = i46;
                    String str16 = strM2431;
                    Charset charset24 = charset10;
                    int i78 = i43;
                    String str17 = str9;
                    byte[] bArr19 = bArr4;
                    E e2 = c128212.get(i75);
                    C2126.m7031(e2, str17);
                    c2947 = (C2946) e2;
                    int iM8970 = c2947.m8970();
                    if (iM8970 != 0) {
                        int iM69817 = (C2105.m6981("᩹ۛ") + i39) * 55;
                        interfaceC12347 = interfaceC12348;
                        i42 = iM69817 ^ 608763155;
                        i41 = ((iM69817 ^ i40) * (-30809)) ^ 148077398;
                    } else {
                        int iM25618 = C0630.m2566("ۢۢ") ^ i40;
                        i41 = ((iM25618 ^ i39) * (-24661)) ^ 879465404;
                        interfaceC12347 = interfaceC12348;
                        i42 = iM25618 ^ 1006118498;
                    }
                    c12828 = c128212;
                    c12951 = c12958;
                    i43 = i78;
                    charset10 = charset24;
                    bArr4 = bArr19;
                    str9 = str17;
                    i45 = i75;
                    i49 = iM8970;
                    strM2431 = str16;
                    i46 = i77;
                    i47 = i76;
                    c12827 = c128213;
                    break;
                case 389214988:
                case 1910796877:
                    this.f17740 = z;
                    iM2567 = (C2105.m6981("᩵ܰ") ^ i39) * (-113);
                    i41 = ((iM2567 ^ i40) * 12987) ^ (-1654834102);
                    i35 = -379641392;
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case 443094234:
                case 954993203:
                    c12957 = c12951;
                    strM2431 = strM2431;
                    bArr2 = bArr4;
                    Charset charset25 = charset10;
                    charset7 = charset25;
                    C3683.m11223(interfaceC13049M4377, RunnableC0588.m2431(c2946), new String(bArr2, charset25));
                    iM6985 = C2105.m6981("֡֫") ^ i40;
                    i32 = ((iM6985 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM6985 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM2431 = strM2431;
                    i41 = i32;
                    c12951 = c12957;
                    break;
                case 463481179:
                case 633598766:
                    i51 = 55232;
                    iM6981 = (C0630.m2566("ܳۡ") ^ i39) * 21;
                    i3 = ((iM6981 ^ i40) * 24995) ^ (-1721031619);
                    i4 = 604509095;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 496487955:
                case 629302606:
                    c12954 = c12951;
                    c12824 = c12828;
                    i11 = iM31489;
                    str4 = str9;
                    c12825 = c12827;
                    i12 = i47;
                    bArr = bArr4;
                    sArr = sArr5;
                    i13 = i48;
                    interfaceC12345 = interfaceC12347;
                    charset3 = charset9;
                    i14 = i46;
                    charset4 = charset10;
                    i15 = i43;
                    i16 = i49;
                    str5 = strM2431;
                    iM3590 = C1047.m3590(c12951);
                    iM1847 = C0382.m1847(c12824);
                    strM11357 = C3746.m11357(f17736, 54, 29, i51);
                    if (C22628.f73083 <= 0) {
                        iM6982 = C0630.m2566("ۧᩴ") ^ i39;
                        i17 = ((iM6982 ^ i40) * (-29367)) ^ 958045583;
                        i18 = -1544947037;
                    } else {
                        iM6982 = C2105.m6981("᩺ۜ") ^ i39;
                        i17 = ((iM6982 ^ i40) * (-27363)) ^ 694818259;
                        i18 = -841148234;
                    }
                    int i511 = iM6982 ^ i18;
                    i48 = i13;
                    strM2431 = str5;
                    i46 = i14;
                    sArr5 = sArr;
                    iM31489 = i11;
                    i42 = i511;
                    i41 = i17;
                    i49 = i16;
                    i47 = i12;
                    c12827 = c12825;
                    charset9 = charset3;
                    interfaceC12347 = interfaceC12345;
                    c12828 = c12824;
                    c12951 = c12954;
                    String str18 = str4;
                    i45 = iM3590;
                    i43 = i15;
                    charset10 = charset4;
                    bArr4 = bArr;
                    str9 = str18;
                    break;
                case 501004837:
                case 1269434187:
                    str3 = strM2431;
                    String str19 = str9;
                    bArr4 = bArr4;
                    charset2 = charset10;
                    Charset charset26 = charset9;
                    editorEdit.putString(C3683.m11215(c2947), new String(bArr3, charset26));
                    str9 = str19;
                    charset9 = charset26;
                    int iM69818 = (i39 - C2105.m6981("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences8 = sharedPreferences2;
                    int i614 = ((iM69818 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM69818 ^ 1103830654;
                    i48 = i48;
                    strM2431 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences8;
                    iM31489 = iM31489;
                    i47 = i47;
                    c12827 = c12827;
                    strM2436 = strM2436;
                    c12951 = c12951;
                    int i615 = iM1847;
                    i41 = i614;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = i615;
                    break;
                case 619229680:
                case 2111023788:
                    break;
                case 626292004:
                case 1751986766:
                    C8058 c8058 = C8058.f24861;
                    c12956 = c12951;
                    iM31488 = i47;
                    charset6 = charset10;
                    int iM25619 = (C0630.m2566("ۨܽ") ^ i40) * (-127);
                    int i512 = iM31488;
                    i41 = ((iM25619 ^ i39) * (-15513)) ^ 1636378871;
                    i42 = iM25619 ^ (-2144469412);
                    c12951 = c12956;
                    c12827 = c12827;
                    str9 = str9;
                    i43 = i43;
                    charset10 = charset6;
                    bArr4 = bArr4;
                    charset9 = charset9;
                    strM2431 = strM2431;
                    i46 = i46;
                    i47 = i512;
                    break;
                case 956103043:
                case 1991423341:
                    C12951 c12959 = c12951;
                    C12823 c128214 = c12828;
                    int i79 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    bArr4 = bArr4;
                    short[] sArr7 = sArr5;
                    int i80 = i48;
                    InterfaceC12344 interfaceC12349 = interfaceC12347;
                    Charset charset27 = charset9;
                    int i81 = i46;
                    charset10 = charset10;
                    i43 = i43;
                    int i82 = i49;
                    String str20 = strM2431;
                    int i83 = i45;
                    strM6988 = C2105.m6988(f17736, 83, 8, i51);
                    int i84 = iM1847;
                    if (i83 >= i84) {
                        iM6983 = (i40 - C0630.m2566("᩻ܿ")) * 69;
                        i19 = ((iM6983 ^ i39) * (-16503)) ^ 2106387301;
                        i20 = 452112500;
                    } else {
                        iM6983 = (C2105.m6981("ۤ᩹") ^ i40) * (-57);
                        i19 = ((iM6983 ^ i39) * (-26329)) ^ 559524043;
                        i20 = -2020772156;
                    }
                    int i85 = iM6983 ^ i20;
                    iM1847 = i84;
                    i45 = i83;
                    i41 = i19;
                    i48 = i80;
                    i49 = i82;
                    sArr5 = sArr7;
                    iM31489 = i79;
                    z = true;
                    i42 = i85;
                    charset9 = charset27;
                    interfaceC12347 = interfaceC12349;
                    strM2431 = str20;
                    i46 = i81;
                    c12828 = c128214;
                    c12951 = c12959;
                    i47 = i47;
                    c12827 = c12827;
                    byte[] bArr110 = bArr4;
                    str9 = strM6988;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr110;
                    break;
                case 1027809020:
                case 1070000938:
                    c12951 = c12951;
                    sharedPreferences2 = sharedPreferences2;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    iM31489 = iM31489;
                    c12827 = c12827;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM2431 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    if (i != 1749442554) {
                        iM6981 = (C2105.m6981("ۘۙ") ^ i39) * (-5);
                        i3 = ((iM6981 ^ i40) * (-24647)) ^ (-1063420471);
                        i4 = 1222632203;
                    } else {
                        iM6981 = (C2105.m6981("۠᩵") + i40) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM6981 ^ i39) * 22325) ^ (-1070693318);
                        i4 = -1881107057;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM2431 = strM2431;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM31489 = iM31489;
                    i42 = iM6981 ^ i4;
                    i41 = i3;
                    c12951 = c12951;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c12827 = c12827;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = iM1847;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 1039712458:
                case 1392682815:
                    c12951 = c12951;
                    c12827 = c12827;
                    i47 = i47;
                    i46 = i46;
                    strM2431 = strM2431;
                    Charset charset28 = charset9;
                    Charset charset29 = charset10;
                    i43 = i43;
                    strM6988 = str9;
                    bArr4 = bArr4;
                    charset10 = charset29;
                    i49 = i49;
                    short[] sArr8 = sArr5;
                    int i86 = i48;
                    String strM4902 = C1420.m4902(sArr8, i86, 4, i51);
                    sArr5 = sArr8;
                    InterfaceC12344 interfaceC123410 = interfaceC12347;
                    C2126.m7031(interfaceC123410, strM4902);
                    int i87 = i50;
                    C22124.m49722((InterfaceC20008) c12951, i87);
                    if (!C1711.f5919) {
                        int iM25620 = C0630.m2566("֫᩻") ^ i39;
                        i50 = i87;
                        int i88 = ((iM25620 ^ i40) * (-17371)) ^ 531703487;
                        i42 = iM25620 ^ 2114659265;
                        interfaceC12347 = interfaceC123410;
                        i48 = i86;
                        i49 = i49;
                        sArr5 = sArr5;
                        i41 = i88;
                        charset9 = charset28;
                        c12951 = c12951;
                        strM2431 = strM2431;
                        i46 = i46;
                        i47 = i47;
                        c12827 = c12827;
                        byte[] bArr111 = bArr4;
                        str9 = strM6988;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr111;
                    } else {
                        i50 = i87;
                        charset9 = charset28;
                        sharedPreferences2 = sharedPreferences2;
                        iM1847 = iM1847;
                        c12828 = c12828;
                        iM31489 = iM31489;
                        interfaceC12347 = interfaceC123410;
                        i48 = i86;
                        i45 = i45;
                        sArr4 = sArr4;
                        str9 = strM6988;
                        iM6981 = (i40 - C2105.m6981("ۢܳ")) * 89;
                        i3 = ((iM6981 ^ i39) * 18831) ^ (-1362359957);
                        i4 = -1783280099;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM2431 = strM2431;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM31489 = iM31489;
                        i42 = iM6981 ^ i4;
                        i41 = i3;
                        c12951 = c12951;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c12827 = c12827;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC12347 = interfaceC12347;
                        c12828 = c12828;
                        iM1847 = iM1847;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case 1075253290:
                case 2007672908:
                    c12951 = c12951;
                    strM2436 = strM2436;
                    iM1847 = iM1847;
                    c12828 = c12828;
                    c12827 = c12827;
                    i47 = i47;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC12347 = interfaceC12347;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    str3 = strM2431;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset2 = charset10;
                    i43 = i43;
                    sharedPreferences2 = sharedPreferences2;
                    C4159.m12575(sharedPreferences2, strM2436);
                    C22124.m49722((InterfaceC20008) c12951, 1749442553);
                    iM31489 = c12951.m31488() + C2520.m8022(c12951);
                    editorEdit = sharedPreferences2.edit();
                    i50 = 1749442553;
                    int iM69819 = (i39 - C2105.m6981("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences9 = sharedPreferences2;
                    int i616 = ((iM69819 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM69819 ^ 1103830654;
                    i48 = i48;
                    strM2431 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences9;
                    iM31489 = iM31489;
                    i47 = i47;
                    c12827 = c12827;
                    strM2436 = strM2436;
                    c12951 = c12951;
                    int i617 = iM1847;
                    i41 = i616;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = i617;
                    break;
                case 1225027685:
                case 2010328122:
                    if (i49 == 7) {
                        iM2567 = C0630.m2566("ۘ۬") ^ i39;
                        i41 = ((iM2567 ^ i40) * 28661) ^ 56046537;
                        i35 = -1446509854;
                    } else {
                        iM2567 = (i40 - C0630.m2566("ۤ۬")) * (-31);
                        i41 = ((iM2567 ^ i39) * 16763) ^ (-717308159);
                        i35 = -253372834;
                    }
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                case 1557496235:
                case 1558840161:
                    editorEdit.putFloat(RunnableC0588.m2431(c2947), c12951.m31495());
                    str3 = strM2431;
                    charset2 = charset10;
                    sharedPreferences2 = sharedPreferences2;
                    int iM698110 = (i39 - C2105.m6981("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences10 = sharedPreferences2;
                    int i618 = ((iM698110 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM698110 ^ 1103830654;
                    i48 = i48;
                    strM2431 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences10;
                    iM31489 = iM31489;
                    i47 = i47;
                    c12827 = c12827;
                    strM2436 = strM2436;
                    c12951 = c12951;
                    int i619 = iM1847;
                    i41 = i618;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC12347 = interfaceC12347;
                    c12828 = c12828;
                    iM1847 = i619;
                    break;
                case 1754679584:
                case 1775705114:
                    if (ViewOnClickListenerC1958.m6437(strM2431, C0630.m2575(f17736, IShizukuService.Stub.TRANSACTION_isHidden, 6, i51))) {
                        iM2567 = C0630.m2566("ܶ᩹") ^ i40;
                        i41 = ((iM2567 ^ i39) * 6321) ^ (-847520511);
                        i35 = -1862746803;
                    } else {
                        iM2567 = (C2105.m6981("᩵ܰ") ^ i39) * (-113);
                        i41 = ((iM2567 ^ i40) * 12987) ^ (-1654834102);
                        i35 = -379641392;
                    }
                    i42 = iM2567 ^ i35;
                    c12951 = c12951;
                    break;
                default:
                    c12952 = c12951;
                    int iM31496 = c12951.m31493();
                    i44 = iM31496;
                    iArr = new int[iM31496];
                    i43 = 0;
                    int iM256110 = C0630.m2566("ۙۤ") ^ i39;
                    int i710 = ((iM256110 ^ i40) * (-23345)) ^ 60390810;
                    i42 = iM256110 ^ 432306934;
                    c12951 = c12952;
                    strM2431 = strM2431;
                    i41 = i710;
                    break;
            }
        }
    }
}
