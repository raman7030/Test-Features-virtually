package p067l;

import android.content.SharedPreferences;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S3XU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7850 {

    /* JADX INFO: renamed from: ۨ᩺ܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f82010 = {7988, 9575, 9588, 9587, 9591, 9582, 9570, 9591, 9584, 9588, 9570, 9591, 9577, 9581, 9578, 9584, 9570, 9591, 9577, 9573, 9596, 9584, 760, -8350, -8347, -8350, -8354, -8347, -8328, -8322, -8325, -8325, -8348, -8327, -8321, -8338, -8337, -8405, -8328, -8338, -8321, -8321, -8350, -8347, -8340, -8328, -8405, -8343, -8345, -8348, -8344, -8352, -8399, -8405, -8354, -8347, -8328, -8322, -8325, -8325, -8348, -8327, -8321, -8338, -8337, -8405, -8325, -8327, -8338, -8339, -8338, -8327, -8338, -8347, -8344, -8338, -8405, -8321, -8334, -8325, -8338, -8399, -8405, -8340, -8338, -8321, -8413, -8411, -8411, -8411, -8414, -8346, -8350, -8347, -8350, -8352, -8338, -8334, -8339, -8328, -8346, -8342, -8333, -8321, -8339, -8328, -8346, -8350, -8347, -8321, -8339, -8328, -8321, -8325};

    /* JADX INFO: renamed from: ֫ */
    public C13885 f20584;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f20585;

    /* JADX INFO: renamed from: ܳ */
    public boolean f20586;

    /* JADX INFO: renamed from: ܽ */
    public boolean f20587;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f20588;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f20589;

    public C7850(boolean z) {
        this.f20588 = z;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m18144() {
        short[] sArr;
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int iM559710;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7 = C0949.f81897;
        int i8 = C1964.f83032;
        int iM559711 = (C0946.m55979("ۨۙ") ^ i8) * (-65);
        int i9 = ((iM559711 ^ i7) * (-26571)) ^ (-311348583);
        C13885 c13885 = null;
        C13885 c13886 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM559711 ^ (-917166342);
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
        InterfaceC14770 interfaceC14770M55950 = null;
        short[] sArr4 = null;
        boolean z3 = false;
        AbstractC17043 abstractC17043M50831 = null;
        C13885 c13887 = null;
        C13885 c13888 = null;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i7) * (-23681)) >> 31));
            switch (i16) {
                case -2052679234:
                case -1754201977:
                    sArr = sArr2;
                    if (this.f20589) {
                        iM55680 = (i8 - C0873.m55680("᩶ۡ")) * 19;
                        i = ((iM55680 ^ i7) * 13383) ^ 519126222;
                        i2 = 1677413970;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۚ᩷")) * C0254q.f1218h;
                        i = ((iM55680 ^ i8) * (-11147)) ^ (-421359562);
                        i2 = -1804771112;
                    }
                    int i17 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i17;
                    i9 = i;
                    break;
                case -2027491748:
                case 293773985:
                    c13885 = c13885;
                    ApplicationC21448.m48583();
                    if (this.f20588) {
                        int iM559712 = C0946.m55979("ᩴ۫") ^ i7;
                        i10 = iM559712 ^ 1182616943;
                        i9 = ((iM559712 ^ i8) * (-21091)) ^ (-1736489948);
                        c13885 = c13885;
                        z2 = true;
                    } else {
                        z2 = true;
                        iM559710 = C0946.m55979("ۗ᩶") ^ i8;
                        z2 = z2;
                        i4 = ((iM559710 ^ i7) * (-19323)) ^ (-1727528666);
                        i5 = -536570366;
                        i6 = iM559710 ^ i5;
                        c13885 = c13885;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    }
                    break;
                case -1969181571:
                case -572762699:
                    sArr = sArr2;
                    c13887 = this.f20584;
                    if (c13887 != null) {
                        iM55680 = (i7 - C0946.m55979("᩵ۘ")) * (-41);
                        i = ((iM55680 ^ i8) * 30225) ^ (-197309525);
                        i2 = 370151254;
                    } else {
                        iM55680 = C0873.m55680("ۜۜ") ^ i7;
                        i = ((iM55680 ^ i8) * 9651) ^ (-1076256490);
                        i2 = 2004230585;
                    }
                    int i18 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i18;
                    i9 = i;
                    break;
                case -1956183671:
                case 1310711346:
                    if (C1046.f81962 > 0) {
                        z2 = z2;
                        c13885 = c13885;
                        iM559710 = (C0873.m55680("ۢ᩸") + i8) * 109;
                        i4 = ((iM559710 ^ i7) * 11001) ^ (-504948772);
                        i5 = -994798558;
                        i6 = iM559710 ^ i5;
                        c13885 = c13885;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        iM55979 = (i8 - C0946.m55979("ܶۤ")) * (-91);
                        i = ((iM55979 ^ i7) * (-6521)) ^ (-2107492593);
                        i3 = -1316626475;
                        i10 = iM55979 ^ i3;
                        i9 = i;
                    }
                    break;
                case -1925627374:
                case 1035345975:
                    c13885 = c13885;
                    if (c13885.m31590(C0947.m55993(sArr2, i12, i13, i11)) != z2) {
                        z2 = z2;
                        c13885 = c13885;
                        int iM55681 = (C0873.m55680("֨ۜ") ^ i7) * (-59);
                        i4 = ((iM55681 ^ i8) * (-715)) ^ 1307627505;
                        i6 = iM55681 ^ 138442300;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    }
                    iM559710 = C0946.m55979("ۗ᩶") ^ i8;
                    z2 = z2;
                    i4 = ((iM559710 ^ i7) * (-19323)) ^ (-1727528666);
                    i5 = -536570366;
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1882731337:
                case -165433838:
                    sArr = sArr2;
                    C5918.m13303();
                    DialogInterfaceOnDismissListenerC18647.m42396();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("ۢ᩷") ^ i7;
                        i = ((iM55680 ^ i8) * 30723) ^ 1096675455;
                        i2 = 10001577;
                    } else {
                        iM55680 = (C0946.m55979("ۖ᩶") + i7) * 71;
                        i = ((iM55680 ^ i8) * (-27697)) ^ (-1423618888);
                        i2 = 240833911;
                    }
                    int i19 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i19;
                    i9 = i;
                    break;
                case -1847558684:
                case -909092903:
                    z2 = z2;
                    c13885 = c13885;
                    if ((s2 * s3) - i15 <= 0) {
                        iM559710 = (C0873.m55680("ۚۙ") + i7) * (-3);
                        i4 = ((iM559710 ^ i8) * 19667) ^ (-1688963754);
                        i5 = 125637769;
                    } else {
                        iM559710 = (C0873.m55680("۫᩵") ^ i7) * 53;
                        i4 = ((iM559710 ^ i8) * (-9683)) ^ 889382208;
                        i5 = -1000743432;
                    }
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
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
                    C19378.m44121();
                    C10199.m23789();
                    DialogInterfaceOnDismissListenerC16634.m37698();
                    C16606.m37627();
                    if (C1964.m56597() == 0) {
                        iM55680 = C0873.m55680("ۖۘ") ^ i8;
                        i = ((iM55680 ^ i7) * 11571) ^ 2127843008;
                        i2 = -1172041578;
                        int i110 = iM55680 ^ i2;
                        sArr2 = sArr;
                        i10 = i110;
                        i9 = i;
                    } else {
                        sArr2 = sArr;
                        c13885 = c13885;
                        z2 = z2;
                        iM559710 = C0946.m55979("ۖۚ") ^ i7;
                        i4 = ((iM559710 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                        i6 = iM559710 ^ i5;
                        c13885 = c13885;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    }
                    break;
                case -1737455724:
                case 7514853:
                    z2 = z2;
                    c13885 = c13885;
                    sArr4 = f82010;
                    c = 0;
                    if (C1046.m56302() != 0) {
                        iM559710 = C0946.m55979("ۖۚ") ^ i7;
                        i4 = ((iM559710 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                    } else {
                        iM559710 = (i8 - C0946.m55979("ۖܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM559710 ^ i7) * 2105) ^ 327088873;
                        i5 = -351112650;
                    }
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1726683023:
                case 1370450062:
                    sArr = sArr2;
                    interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                    sArr3 = f82010;
                    if (C1964.m56597() != 0) {
                        iM55680 = (C0946.m55979("᩻ۚ") ^ i7) * (-71);
                        i = ((iM55680 ^ i8) * 18527) ^ 2017771806;
                        i2 = -643528333;
                    } else {
                        iM55680 = C0946.m55979("۫᩻") ^ i8;
                        i = ((iM55680 ^ i7) * (-10109)) ^ (-1474231821);
                        i2 = 1316121386;
                    }
                    int i111 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i111;
                    i9 = i;
                    break;
                case -1670950662:
                case 1701122390:
                    sArr = sArr2;
                    if (this.f20587) {
                        iM55680 = C0873.m55680("ܶܶ") ^ i8;
                        i = ((iM55680 ^ i7) * 18585) ^ 797548151;
                        i2 = -821107815;
                    } else {
                        iM55680 = C0946.m55979("ۤܽ") ^ i7;
                        i = ((iM55680 ^ i8) * (-21039)) ^ (-1113868253);
                        i2 = 1078114446;
                    }
                    int i112 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i112;
                    i9 = i;
                    break;
                case -1661674211:
                case -371584495:
                    z2 = z2;
                    c13885 = c13885;
                    s2 = sArr4[c];
                    s = 730;
                    if (C1929.f83011 != 0) {
                        iM559710 = (i8 - C0946.m55979("᩹ۙ")) * (-57);
                        i4 = ((iM559710 ^ i7) * (-29043)) ^ 319018878;
                        i5 = 1372943074;
                    } else {
                        iM559710 = (C0946.m55979("ۧۙ") ^ i7) * (-79);
                        i4 = ((iM559710 ^ i8) * 21013) ^ 588633010;
                        i5 = -1842438397;
                    }
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1646475161:
                case 1347687706:
                    if (!C1404.m56468()) {
                        z2 = z2;
                        c13885 = c13885;
                        iM559710 = (C0873.m55680("ۢ᩸") + i8) * 109;
                        i4 = ((iM559710 ^ i7) * 11001) ^ (-504948772);
                        i5 = -994798558;
                        i6 = iM559710 ^ i5;
                        c13885 = c13885;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        iM55979 = (C0873.m55680("۬ܽ") + i7) * (-65);
                        i = ((iM55979 ^ i8) * (-8779)) ^ 416133001;
                        i3 = 1537808832;
                        i10 = iM55979 ^ i3;
                        i9 = i;
                    }
                    break;
                case -1624704066:
                case -138516688:
                    z2 = z2;
                    C13885 c13889 = this.f20584;
                    if (c13889 != null) {
                        int iM55682 = C0873.m55680("ۤ۠") ^ i8;
                        c13885 = c13889;
                        i9 = ((iM55682 ^ i7) * (-17681)) ^ 337907458;
                        z = z2;
                        i10 = iM55682 ^ 113147780;
                    } else {
                        c13885 = c13889;
                        int iM55683 = (C0873.m55680("֨ۜ") ^ i7) * (-59);
                        i4 = ((iM55683 ^ i8) * (-715)) ^ 1307627505;
                        i6 = iM55683 ^ 138442300;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                    }
                    z2 = z;
                    break;
                case -1576872907:
                case 1306228523:
                    sArr = sArr2;
                    if (c13886.m31590(C0930.m55893(f82010, 16, 6, i11)) == z2) {
                        iM55680 = (i8 - C0873.m55680("᩶ۡ")) * 19;
                        i = ((iM55680 ^ i7) * 13383) ^ 519126222;
                        i2 = 1677413970;
                    } else {
                        iM55680 = C0873.m55680("ܶܶ") ^ i8;
                        i = ((iM55680 ^ i7) * 18585) ^ 797548151;
                        i2 = -821107815;
                    }
                    int i113 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i113;
                    i9 = i;
                    break;
                case -1414894800:
                case -85130310:
                    sArr = sArr2;
                    int i20 = C13215.f37110;
                    C13215.m30222();
                    C22711.m50838();
                    if (C1024.f81946) {
                        iM55680 = (C0946.m55979("᩻ۚ") ^ i7) * (-71);
                        i = ((iM55680 ^ i8) * 18527) ^ 2017771806;
                        i2 = -643528333;
                    } else {
                        iM55680 = C0873.m55680("ܿ᩸") ^ i7;
                        i = ((iM55680 ^ i8) * 10279) ^ 1701979541;
                        i2 = -1035812127;
                    }
                    int i114 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i114;
                    i9 = i;
                    break;
                case -1403105371:
                case 1673050215:
                    sArr = sArr2;
                    C6846.m15687();
                    C21272.m48054();
                    C12248.m28251();
                    if (z3) {
                        iM55680 = (C0946.m55979("۟᩶") ^ i8) * 85;
                        i = ((iM55680 ^ i7) * (-16231)) ^ 2100429509;
                        i2 = 187225643;
                    } else {
                        iM55680 = C0873.m55680("᩹ۗ") ^ i7;
                        i = ((iM55680 ^ i8) * 9821) ^ (-966687726);
                        i2 = -1310255705;
                    }
                    int i115 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i115;
                    i9 = i;
                    break;
                case -1307347966:
                case 1756537599:
                    C0854.m55606(new RunnableC11874());
                    break;
                case -1252213262:
                case 521575383:
                    C1044.m56286();
                    if (C1025.f81947 < 0) {
                        sArr = sArr2;
                        iM55680 = (C0946.m55979("᩻ۚ") ^ i7) * (-71);
                        i = ((iM55680 ^ i8) * 18527) ^ 2017771806;
                        i2 = -643528333;
                        int i116 = iM55680 ^ i2;
                        sArr2 = sArr;
                        i10 = i116;
                        i9 = i;
                    }
                    iM55979 = (C0873.m55680("۬ܽ") + i7) * (-65);
                    i = ((iM55979 ^ i8) * (-8779)) ^ 416133001;
                    i3 = 1537808832;
                    i10 = iM55979 ^ i3;
                    i9 = i;
                    break;
                case -1137686746:
                case 2087951287:
                    z2 = z2;
                    c13885 = c13885;
                    int i21 = s2 + s;
                    i15 = i21 * i21;
                    s3 = 2920;
                    if (C1404.f82149 >= 0) {
                        iM559710 = (C0873.m55680("ۢ᩸") + i8) * 109;
                        i4 = ((iM559710 ^ i7) * 11001) ^ (-504948772);
                        i5 = -994798558;
                    } else {
                        iM559710 = (C0873.m55680("᩻ܶ") + i8) * (-69);
                        i4 = ((iM559710 ^ i7) * (-15859)) ^ 298554241;
                        i5 = -1321228717;
                    }
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -1100039679:
                case 466334707:
                    sArr = sArr2;
                    try {
                        C0882.m55714(abstractC17043M50831);
                        C17548.m39937();
                        break;
                    } catch (Exception unused) {
                    }
                    iM55680 = C0946.m55979("ۤۚ") ^ i8;
                    i = ((iM55680 ^ i7) * 10555) ^ (-1299972716);
                    i2 = -1551578169;
                    int i117 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i117;
                    i9 = i;
                    break;
                case -1081211572:
                case -175023076:
                    C0861.m55626();
                    iM55979 = (C0946.m55979("ܽ֫") ^ i7) * (-31);
                    i = ((iM55979 ^ i8) * (-32639)) ^ 2064308082;
                    i3 = -873609063;
                    i10 = iM55979 ^ i3;
                    i9 = i;
                    break;
                case -985836582:
                case -513741850:
                    z3 = true;
                    iM559710 = (C0946.m55979("۟۬") ^ i8) * (-43);
                    i4 = ((iM559710 ^ i7) * 9555) ^ (-61636629);
                    i5 = 476677207;
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -955835750:
                case -288335119:
                    c13885 = c13885;
                    c13888 = this.f20584;
                    if (c13888 != null) {
                        iM559710 = C0946.m55979("ܺ۟") ^ i7;
                        z2 = z2;
                        i4 = ((iM559710 ^ i8) * (-27729)) ^ (-2132228689);
                        i5 = -176352003;
                    } else {
                        z2 = z2;
                        iM559710 = (C0946.m55979("ᩳܿ") + i8) * (-63);
                        i4 = ((iM559710 ^ i7) * 13841) ^ 1930422208;
                        i5 = 972236785;
                    }
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -706249058:
                case 1824088858:
                    z3 = false;
                    iM559710 = (C0946.m55979("۟۬") ^ i8) * (-43);
                    i4 = ((iM559710 ^ i7) * 9555) ^ (-61636629);
                    i5 = 476677207;
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case -640745638:
                case 1441570837:
                    if (RunnableC0871.f81839 < 0) {
                        sArr = sArr2;
                        iM55680 = C0946.m55979("᩶ᩳ") ^ i8;
                        i = ((iM55680 ^ i7) * 16559) ^ 675571757;
                        i2 = 720819081;
                        int i118 = iM55680 ^ i2;
                        sArr2 = sArr;
                        i10 = i118;
                        i9 = i;
                    }
                    iM55979 = (C0873.m55680("۬ܽ") + i7) * (-65);
                    i = ((iM55979 ^ i8) * (-8779)) ^ 416133001;
                    i3 = 1537808832;
                    i10 = iM55979 ^ i3;
                    i9 = i;
                    break;
                case -276539377:
                case 459074040:
                    ArrayList arrayList = this.f20585;
                    C0949.m56008(arrayList);
                    C12248.m28244(arrayList);
                    sArr = sArr2;
                    iM55680 = C0873.m55680("᩹ۗ") ^ i7;
                    i = ((iM55680 ^ i8) * 9821) ^ (-966687726);
                    i2 = -1310255705;
                    int i119 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i119;
                    i9 = i;
                    break;
                case -258803820:
                case 1402508477:
                    sArr = sArr2;
                    C0937.m55912(interfaceC14770M55950.remove(C0917.m55852(sArr3, i14, 4, i11)));
                    iM55680 = C0873.m55680("ܶܶ") ^ i8;
                    i = ((iM55680 ^ i7) * 18585) ^ 797548151;
                    i2 = -821107815;
                    int i1110 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i1110;
                    i9 = i;
                    break;
                case -143952969:
                case 985533380:
                    i11 = 47385;
                    iM559710 = (C0946.m55979("۟᩸") ^ i8) * (-77);
                    i4 = ((iM559710 ^ i7) * 17363) ^ 1605579904;
                    i5 = -101260334;
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case 234227326:
                case 666373683:
                    sArr = sArr2;
                    if (c13887.m31590(C1012.m56144(f82010, 10, 6, i11)) == z2) {
                        iM55680 = (i8 - C0873.m55680("᩶ۡ")) * 19;
                        i = ((iM55680 ^ i7) * 13383) ^ 519126222;
                        i2 = 1677413970;
                    } else {
                        iM55680 = C0873.m55680("ۜۜ") ^ i7;
                        i = ((iM55680 ^ i8) * 9651) ^ (-1076256490);
                        i2 = 2004230585;
                    }
                    int i1111 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i1111;
                    i9 = i;
                    break;
                case 376823253:
                case 2073140537:
                    sArr = sArr2;
                    i14 = 6;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("᩶ᩳ") ^ i8;
                        i = ((iM55680 ^ i7) * 16559) ^ 675571757;
                        i2 = 720819081;
                    } else {
                        iM55680 = (C0946.m55979("ۨۘ") + i8) * 71;
                        i = ((iM55680 ^ i7) * (-6383)) ^ (-1667526150);
                        i2 = 44488721;
                    }
                    int i1112 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i1112;
                    i9 = i;
                    break;
                case 386410703:
                case 454342110:
                    sArr = sArr2;
                    abstractC17043M50831 = C22711.m50831();
                    if (C1003.m56124(abstractC17043M50831)) {
                        iM55680 = C0946.m55979("ۤۚ") ^ i8;
                        i = ((iM55680 ^ i7) * 10555) ^ (-1299972716);
                        i2 = -1551578169;
                    } else {
                        iM55680 = C0873.m55680("᩷ۧ") ^ i8;
                        i = ((iM55680 ^ i7) * 11229) ^ (-1406247597);
                        i2 = -1953593422;
                    }
                    int i1113 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i1113;
                    i9 = i;
                    break;
                case 553169800:
                case 1701113265:
                    C0898.m55800();
                    break;
                case 741047870:
                case 1010365041:
                    C13215.m30216(c13888);
                    c13885 = c13885;
                    z2 = z2;
                    iM559710 = (C0946.m55979("ᩳܿ") + i8) * (-63);
                    i4 = ((iM559710 ^ i7) * 13841) ^ 1930422208;
                    i5 = 972236785;
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case 861775131:
                case 1089260206:
                    c13885 = c13885;
                    sArr2 = f82010;
                    i13 = 5;
                    if (C0949.f81897 >= 0) {
                        z2 = z2;
                        i12 = 1;
                        iM559710 = C0946.m55979("ۖۚ") ^ i7;
                        i4 = ((iM559710 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                        i6 = iM559710 ^ i5;
                        c13885 = c13885;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        int iM559713 = (i7 - C0946.m55979("ܿۤ")) * (-53);
                        i10 = iM559713 ^ (-1937921863);
                        c13885 = c13885;
                        i9 = ((iM559713 ^ i8) * 2779) ^ 711889853;
                        i12 = 1;
                    }
                    break;
                case 864313212:
                case 1404105700:
                    z2 = z2;
                    c13885 = c13885;
                    if (this.f20586) {
                        iM559710 = (i7 - C0873.m55680("ܿ᩷")) * (-43);
                        i4 = ((iM559710 ^ i8) * (-31587)) ^ (-229761364);
                        i5 = -108638982;
                    } else {
                        iM559710 = (C0946.m55979("ᩳ۫") ^ i8) * 75;
                        i4 = ((iM559710 ^ i7) * 27229) ^ (-2147145128);
                        i5 = 1519403239;
                    }
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case 916756711:
                case 2147161584:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (i8 - C0946.m55979("ܶۤ")) * (-91);
                        i = ((iM55979 ^ i7) * (-6521)) ^ (-2107492593);
                        i3 = -1316626475;
                        i10 = iM55979 ^ i3;
                        i9 = i;
                    } else {
                        z2 = z2;
                        c13885 = c13885;
                        iM559710 = C0946.m55979("ۖۚ") ^ i7;
                        i4 = ((iM559710 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                        i6 = iM559710 ^ i5;
                        c13885 = c13885;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    }
                    break;
                case 993682270:
                case 1358873623:
                    if (C1003.f81929 > 0) {
                        iM55979 = (C0873.m55680("۬ܽ") + i7) * (-65);
                        i = ((iM55979 ^ i8) * (-8779)) ^ 416133001;
                        i3 = 1537808832;
                    } else {
                        iM55979 = (C0946.m55979("ܰۗ") ^ i7) * (-41);
                        i = ((iM55979 ^ i8) * (-3565)) ^ (-2132372447);
                        i3 = 1635585869;
                    }
                    i10 = iM55979 ^ i3;
                    i9 = i;
                    break;
                case 1226321501:
                case 1439744610:
                    sArr = sArr2;
                    C14815.m33832();
                    C3826.m7474();
                    C18825.m42883();
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0946.m55979("ۢ᩷") ^ i7;
                        i = ((iM55680 ^ i8) * 30723) ^ 1096675455;
                        i2 = 10001577;
                    } else {
                        iM55680 = C0873.m55680("֫ᩴ") ^ i7;
                        i = ((iM55680 ^ i8) * 5239) ^ (-21665162);
                        i2 = 1963461034;
                    }
                    int i1114 = iM55680 ^ i2;
                    sArr2 = sArr;
                    i10 = i1114;
                    i9 = i;
                    break;
                case 1231533234:
                case 1621007842:
                    if (C0845.f81821 >= 0) {
                        z2 = z2;
                        c13885 = c13885;
                        iM559710 = (i8 - C0946.m55979("᩹ۙ")) * (-57);
                        i4 = ((iM559710 ^ i7) * (-29043)) ^ 319018878;
                        i5 = 1372943074;
                        i6 = iM559710 ^ i5;
                        c13885 = c13885;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        iM55979 = (i8 - C0946.m55979("ܶۤ")) * (-91);
                        i = ((iM55979 ^ i7) * (-6521)) ^ (-2107492593);
                        i3 = -1316626475;
                        i10 = iM55979 ^ i3;
                        i9 = i;
                    }
                    break;
                case 1380660792:
                case 1954864472:
                    i11 = 9476;
                    iM559710 = (C0946.m55979("۟᩸") ^ i8) * (-77);
                    i4 = ((iM559710 ^ i7) * 17363) ^ 1605579904;
                    i5 = -101260334;
                    i6 = iM559710 ^ i5;
                    c13885 = c13885;
                    z = z2;
                    i10 = i6;
                    i9 = i4;
                    z2 = z;
                    break;
                case 1763420604:
                case 1828087578:
                    C0861.m55626();
                    if (AbstractC0942.f81890 > 0) {
                        z2 = z2;
                        c13885 = c13885;
                        iM559710 = C0946.m55979("ۖۚ") ^ i7;
                        i4 = ((iM559710 ^ i8) * (-4607)) ^ 1728735057;
                        i5 = 1725453230;
                        i6 = iM559710 ^ i5;
                        c13885 = c13885;
                        z = z2;
                        i10 = i6;
                        i9 = i4;
                        z2 = z;
                    } else {
                        iM55979 = (C0946.m55979("ܽ֫") ^ i7) * (-31);
                        i = ((iM55979 ^ i8) * (-32639)) ^ 2064308082;
                        i3 = -873609063;
                        i10 = iM55979 ^ i3;
                        i9 = i;
                    }
                    break;
                default:
                    sArr = sArr2;
                    c13886 = this.f20584;
                    if (c13886 != null) {
                        iM55680 = (C0873.m55680("᩻۬") + i8) * 51;
                        i = ((iM55680 ^ i7) * 18565) ^ 1872464380;
                        i2 = -251379977;
                    } else {
                        iM55680 = C0873.m55680("ܶܶ") ^ i8;
                        i = ((iM55680 ^ i7) * 18585) ^ 797548151;
                        i2 = -821107815;
                    }
                    int i1115 = iM55680 ^ i2;
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
    
        if (p067l.C0898.f81858 > 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m18145(int i, int i2, C14677 c14677) {
        C14677 c14678;
        int iM55979;
        int i3;
        int i4;
        C14677 c14679;
        String str;
        InterfaceC14100 interfaceC14100;
        int i5;
        int i6;
        Charset charset;
        int i7;
        int i8;
        String str2;
        C14555 c14555M30214;
        SharedPreferences sharedPreferences;
        C14555 c14555;
        int i9;
        int i10;
        String str3;
        Charset charset2;
        C14677 c146710;
        C14555 c14556;
        int i11;
        String str4;
        C14555 c14557;
        int i12;
        byte[] bArr;
        short[] sArr;
        int i13;
        InterfaceC14100 interfaceC14101;
        Charset charset3;
        int i14;
        Charset charset4;
        int i15;
        int i16;
        String str5;
        int iM55760;
        int iM559710;
        int i17;
        int i18;
        String strM55986;
        int iM559711;
        int i19;
        int i20;
        C14677 c146711;
        InterfaceC14100 interfaceC14102;
        int i21;
        Charset charset5;
        int i22;
        short[] sArr2;
        int i23;
        int i24;
        int i25;
        String str6;
        C14555 c14555M30220;
        C14677 c146712;
        Charset charset6;
        int iM33575;
        int iM559712;
        int i26;
        int i27;
        C14555 c14558;
        int i28;
        int i29;
        String str7;
        int iM55680;
        int i30;
        int i31;
        C14677 c146713;
        byte[] bArr2;
        Charset charset7;
        int iM559713;
        int i32;
        int i33;
        int i34;
        String str8;
        Charset charset8;
        int iM55681;
        int i35;
        int iM55682;
        int i36;
        int i37;
        c14677 = c14677;
        C5168 c5168 = null;
        short[] sArr3 = null;
        short s = 0;
        short s2 = 0;
        int i38 = -1153573380;
        int i39 = C0989.f81920;
        int i40 = C0912.f81867;
        int iM55683 = C0873.m55680("ۙᩴ") ^ i40;
        int i41 = ((iM55683 ^ i39) * (-509)) ^ (-1184894999);
        int i42 = iM55683 ^ (-514642680);
        SharedPreferences.Editor editorEdit = null;
        C5168 c5169 = null;
        InterfaceC14100 interfaceC14103 = null;
        Charset charset9 = null;
        Charset charset10 = null;
        int[] iArr = null;
        String strM55662 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i43 = 0;
        int iM559714 = 0;
        int i44 = 0;
        boolean z = false;
        int i45 = 0;
        int iM33576 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        String strM55667 = null;
        String str9 = null;
        C14555 c14559 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i49 = 0;
        C14555 c145510 = null;
        int i50 = 0;
        SharedPreferences sharedPreferences2 = null;
        String strM56235 = null;
        InterfaceC14770 interfaceC14770M55814 = null;
        int i51 = 0;
        int iM55625 = 0;
        while (true) {
            i38 = i42 ^ (i41 & (((i38 ^ i39) * 17411) >> 31));
            switch (i38) {
                case -2078700497:
                case -446470744:
                    C1012.m56134();
                    return;
                case -2043280755:
                case 1402349283:
                    if (C1053.f81965 <= 0) {
                        c146713 = c14677;
                        str8 = strM55662;
                        Charset charset11 = charset10;
                        i34 = i43;
                        charset8 = charset11;
                        int iM55684 = C0873.m55680("ۘ۫") ^ i39;
                        int i52 = ((iM55684 ^ i40) * (-4513)) ^ (-1406711007);
                        i42 = iM55684 ^ 2102644399;
                        c14677 = c146713;
                        int i53 = i34;
                        charset10 = charset8;
                        i43 = i53;
                        strM55662 = str8;
                        i41 = i52;
                    } else {
                        c14677 = c14677;
                        sharedPreferences2 = sharedPreferences2;
                        iM55625 = iM55625;
                        c145510 = c145510;
                        iM33576 = iM33576;
                        c14559 = c14559;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC14103 = interfaceC14103;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM55662 = strM55662;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM55979 = (C0873.m55680("᩹᩹") + i39) * (-17);
                        i3 = ((iM55979 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM55662 = strM55662;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM33576 = iM33576;
                        i42 = iM55979 ^ i4;
                        i41 = i3;
                        c14677 = c14677;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c14559 = c14559;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC14103 = interfaceC14103;
                        c145510 = c145510;
                        iM55625 = iM55625;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -2005807317:
                case -1522184198:
                    if (RunnableC1014.f81941 > 0) {
                        iM55682 = (i39 - C0873.m55680("ܿ۠")) * 81;
                        i36 = ((iM55682 ^ i40) * (-17179)) ^ (-58235914);
                        i37 = 2091636630;
                        i42 = iM55682 ^ i37;
                        i41 = i36;
                    } else {
                        c146710 = c14677;
                        c14556 = c145510;
                        i11 = iM33576;
                        c14557 = c14559;
                        i12 = i47;
                        sArr = sArr5;
                        i13 = i48;
                        interfaceC14101 = interfaceC14103;
                        charset3 = charset9;
                        i14 = i46;
                        i16 = i49;
                        str5 = strM55662;
                        Charset charset12 = charset10;
                        i15 = i43;
                        iM55760 = i45;
                        str4 = str9;
                        bArr = bArr4;
                        charset4 = charset12;
                        iM559710 = C0873.m55680("ۧᩴ") ^ i39;
                        i17 = ((iM559710 ^ i40) * (-29367)) ^ 958045583;
                        i18 = -1544947037;
                        int i54 = iM559710 ^ i18;
                        i48 = i13;
                        strM55662 = str5;
                        i46 = i14;
                        sArr5 = sArr;
                        iM33576 = i11;
                        i42 = i54;
                        i41 = i17;
                        i49 = i16;
                        i47 = i12;
                        c14559 = c14557;
                        charset9 = charset3;
                        interfaceC14103 = interfaceC14101;
                        c145510 = c14556;
                        c14677 = c146710;
                        String str10 = str4;
                        i45 = iM55760;
                        i43 = i15;
                        charset10 = charset4;
                        bArr4 = bArr;
                        str9 = str10;
                    }
                    break;
                case -1960234138:
                case 221497222:
                    c146712 = c14677;
                    charset6 = charset10;
                    iM33575 = c14677.m33575() + C1124.m56370(c14677);
                    interfaceC14770M55814 = C0906.m55814(interfaceC14103);
                    int iM55685 = (C0873.m55680("ۨܽ") ^ i40) * (-127);
                    int i55 = iM33575;
                    i41 = ((iM55685 ^ i39) * (-15513)) ^ 1636378871;
                    i42 = iM55685 ^ (-2144469412);
                    c14677 = c146712;
                    c14559 = c14559;
                    str9 = str9;
                    i43 = i43;
                    charset10 = charset6;
                    bArr4 = bArr4;
                    charset9 = charset9;
                    strM55662 = strM55662;
                    i46 = i46;
                    i47 = i55;
                    break;
                case -1889123764:
                case 2129458295:
                    c14677 = c14677;
                    c14559 = c14559;
                    i47 = i47;
                    i46 = i46;
                    strM55662 = strM55662;
                    Charset charset13 = charset10;
                    i43 = i43;
                    strM55986 = str9;
                    bArr4 = bArr4;
                    charset10 = charset13;
                    if (i49 != z) {
                        iM559712 = (i39 - C0946.m55979("ۨۤ")) * (-27);
                        i41 = ((iM559712 ^ i40) * (-25121)) ^ 1226134967;
                        i26 = -475361121;
                    } else {
                        iM559712 = (C0946.m55979("᩷ܳ") + i40) * (-93);
                        i41 = ((iM559712 ^ i39) * 16675) ^ (-1367860080);
                        i26 = 881972326;
                    }
                    i42 = iM559712 ^ i26;
                    c14677 = c14677;
                    strM55662 = strM55662;
                    i46 = i46;
                    i47 = i47;
                    c14559 = c14559;
                    byte[] bArr5 = bArr4;
                    str9 = strM55986;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr5;
                    break;
                case -1887199959:
                case 1834331342:
                    if (iM559714 != 3152905) {
                        iM55681 = (C0946.m55979("᩵ܰ") ^ i39) * (-113);
                        i41 = ((iM55681 ^ i40) * 12987) ^ (-1654834102);
                        i35 = -379641392;
                    } else {
                        iM55681 = C0946.m55979("ۢ֨") ^ i39;
                        i41 = ((iM55681 ^ i40) * 17811) ^ 55105175;
                        i35 = -707859978;
                    }
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case -1857056692:
                case 1485999170:
                    strM55662 = strM55662;
                    int iM33580 = c14677.m33580();
                    byte[] bArr6 = new byte[iM33580];
                    c146713 = c14677;
                    c146713.m33576(iM33580, bArr6);
                    interfaceC14770M55814.mo27877(C1025.m56223(c5168), bArr6);
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM559713 = C0946.m55979("֡֫") ^ i40;
                    i32 = ((iM559713 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case -1716577090:
                case -1097648734:
                    i51 = 57099;
                    iM55979 = (C0873.m55680("ܳۡ") ^ i39) * 21;
                    i3 = ((iM55979 ^ i40) * 24995) ^ (-1721031619);
                    i4 = 604509095;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -1707240211:
                case 1155221471:
                    strM55662 = RunnableC0871.m55662(c5168);
                    C1025.m56218(strM55662, C1053.m56325(f82010, 95, 3, i51));
                    iM559714 = C0946.m55979(strM55662);
                    if (iM559714 != -1265244707) {
                        iM55681 = C0946.m55979("ۙᩳ") ^ i39;
                        i41 = ((iM55681 ^ i40) * 10453) ^ 1561797236;
                        i35 = -851595865;
                    } else {
                        iM55681 = C0946.m55979("۠᩹") ^ i40;
                        i41 = ((iM55681 ^ i39) * 19527) ^ 1428344840;
                        i35 = 199859109;
                    }
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case -1687397028:
                case -944322074:
                    interfaceC14770M55814.putFloat(RunnableC0871.m55662(c5168), c14677.m33582());
                    c146713 = c14677;
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM559713 = C0946.m55979("֡֫") ^ i40;
                    i32 = ((iM559713 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case -1612270391:
                case -1126533807:
                    i34 = i43;
                    c146713 = c14677;
                    str8 = strM55662;
                    int iM33581 = c14677.m33580();
                    byte[] bArr7 = new byte[iM33581];
                    c146713.m33576(iM33581, bArr7);
                    charset8 = C9929.f27508;
                    if (!RunnableC0897.f81856) {
                        bArr4 = bArr7;
                        int iM55686 = C0873.m55680("ۘ۫") ^ i39;
                        int i56 = ((iM55686 ^ i40) * (-4513)) ^ (-1406711007);
                        i42 = iM55686 ^ 2102644399;
                        c14677 = c146713;
                        int i57 = i34;
                        charset10 = charset8;
                        i43 = i57;
                        strM55662 = str8;
                        i41 = i56;
                    } else {
                        int iM55687 = (C0873.m55680("֡۬") ^ i40) * 21;
                        int i58 = ((iM55687 ^ i39) * (-7833)) ^ (-1058508019);
                        i42 = iM55687 ^ (-1779298767);
                        strM55662 = str8;
                        i41 = i58;
                        i43 = i34;
                        charset10 = charset8;
                        bArr4 = bArr7;
                        c14677 = c146713;
                    }
                    break;
                case -1611337686:
                case 980405202:
                    throw new RuntimeException(C1003.m56125(c5169.m11038(), strM56235));
                case -1569389250:
                case 719294985:
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    int i59 = s + s2;
                    int i60 = (s * s) + 89302500;
                    if ((i59 * i59) - (i60 + i60) > 0) {
                        iM55979 = (C0946.m55979("ۢۙ") + i39) * 5;
                        i3 = ((iM55979 ^ i40) * (-1441)) ^ (-1366672549);
                        i4 = -770524323;
                    } else {
                        iM55979 = C0946.m55979("ۡܽ") ^ i40;
                        i3 = ((iM55979 ^ i39) * (-10021)) ^ 832932537;
                        i4 = -630908074;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -1567025113:
                case 1226680550:
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    sArr3 = f82010;
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0946.m55979("ۤܳ") ^ i40;
                        i3 = ((iM55979 ^ i39) * (-22713)) ^ 838682106;
                        i4 = -451616142;
                    } else {
                        iM55979 = (i40 - C0946.m55979("֡۠")) * (-31);
                        i3 = ((iM55979 ^ i39) * 23889) ^ 1789308174;
                        i4 = 937914573;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -1554051202:
                case 1581205828:
                    c146711 = c14677;
                    interfaceC14102 = interfaceC14103;
                    i21 = iM33576;
                    charset5 = charset9;
                    i22 = i47;
                    sArr2 = sArr5;
                    i23 = i48;
                    i24 = i49;
                    i25 = i46;
                    str6 = strM55662;
                    Charset charset14 = charset10;
                    i43 = i43;
                    strM55986 = str9;
                    bArr4 = bArr4;
                    charset10 = charset14;
                    c146711.seek(i21);
                    editorEdit.apply();
                    int i61 = C13215.f37110;
                    c14555M30220 = C13215.m30220();
                    if (C0967.f81910 >= 0) {
                        int iM559715 = C0946.m55979("ۙۗ") ^ i39;
                        int i62 = i21;
                        i27 = ((iM559715 ^ i40) * (-27299)) ^ 1180042965;
                        i48 = i23;
                        sArr5 = sArr2;
                        iM33576 = i62;
                        i42 = iM559715 ^ (-775245703);
                        strM55662 = str6;
                        i46 = i25;
                        i47 = i22;
                        c14559 = c14555M30220;
                        i49 = i24;
                        charset9 = charset5;
                        interfaceC14103 = interfaceC14102;
                        i41 = i27;
                        c14677 = c146711;
                        byte[] bArr8 = bArr4;
                        str9 = strM55986;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr8;
                    } else {
                        int iM55688 = (C0873.m55680("۠ۗ") + i39) * 17;
                        int i63 = ((iM55688 ^ i40) * 1383) ^ 59704184;
                        i48 = i23;
                        sArr5 = sArr2;
                        iM33576 = i21;
                        i42 = iM55688 ^ 2040685073;
                        c14677 = c146711;
                        str9 = strM55986;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr4;
                        interfaceC14103 = interfaceC14102;
                        i41 = i63;
                        strM55662 = str6;
                        i46 = i25;
                        i47 = i22;
                        c14559 = c14555M30220;
                        i49 = i24;
                        charset9 = charset5;
                    }
                    break;
                case -1495341783:
                case 1381644103:
                    C0992.m56107();
                    if (C1036.m56257() > 0) {
                        c146711 = c14677;
                        interfaceC14102 = interfaceC14103;
                        i21 = iM33576;
                        charset5 = charset9;
                        sArr2 = sArr5;
                        i23 = i48;
                        i24 = i49;
                        c14555M30220 = c14559;
                        i22 = i47;
                        i25 = i46;
                        str6 = strM55662;
                        Charset charset15 = charset10;
                        i43 = i43;
                        strM55986 = str9;
                        bArr4 = bArr4;
                        charset10 = charset15;
                        int iM559716 = C0946.m55979("ۙۗ") ^ i39;
                        int i64 = i21;
                        i27 = ((iM559716 ^ i40) * (-27299)) ^ 1180042965;
                        i48 = i23;
                        sArr5 = sArr2;
                        iM33576 = i64;
                        i42 = iM559716 ^ (-775245703);
                        strM55662 = str6;
                        i46 = i25;
                        i47 = i22;
                        c14559 = c14555M30220;
                        i49 = i24;
                        charset9 = charset5;
                        interfaceC14103 = interfaceC14102;
                        i41 = i27;
                        c14677 = c146711;
                        byte[] bArr9 = bArr4;
                        str9 = strM55986;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr9;
                    } else {
                        c14677 = c14677;
                        sharedPreferences2 = sharedPreferences2;
                        iM55625 = iM55625;
                        c145510 = c145510;
                        iM33576 = iM33576;
                        c14559 = c14559;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC14103 = interfaceC14103;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM55662 = strM55662;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM55979 = (i40 - C0946.m55979("ۢܳ")) * 89;
                        i3 = ((iM55979 ^ i39) * 18831) ^ (-1362359957);
                        i4 = -1783280099;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM55662 = strM55662;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM33576 = iM33576;
                        i42 = iM55979 ^ i4;
                        i41 = i3;
                        c14677 = c14677;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c14559 = c14559;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC14103 = interfaceC14103;
                        c145510 = c145510;
                        iM55625 = iM55625;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -1353440122:
                case 1718498044:
                    c146711 = c14677;
                    c14558 = c14559;
                    i28 = i47;
                    Charset charset16 = charset10;
                    i43 = i43;
                    int i65 = i46;
                    str7 = strM55662;
                    byte[] bArr10 = bArr4;
                    charset10 = charset16;
                    E e = c14558.get(i65);
                    i29 = i65;
                    strM55986 = str9;
                    C0947.m55988(e, strM55986);
                    c5168 = (C5168) e;
                    switch (c5168.m11038()) {
                        case 0:
                            bArr4 = bArr10;
                            iM55680 = C0946.m55979("ᩴᩳ") ^ i39;
                            i30 = ((iM55680 ^ i40) * 6801) ^ (-1570349916);
                            i31 = 1241244089;
                            break;
                        case 1:
                            bArr4 = bArr10;
                            iM55680 = (i40 - C0946.m55979("ۤܰ")) * (-107);
                            i30 = ((iM55680 ^ i39) * 1313) ^ (-980881789);
                            i31 = 1983912235;
                            break;
                        case 2:
                            bArr4 = bArr10;
                            iM55680 = (i39 - C0946.m55979("ܽܶ")) * 97;
                            i30 = ((iM55680 ^ i40) * 25947) ^ (-806091131);
                            i31 = -807593434;
                            break;
                        case 3:
                            bArr4 = bArr10;
                            iM55680 = (i39 - C0946.m55979("ۘ᩹")) * (-47);
                            i30 = ((iM55680 ^ i40) * (-28121)) ^ (-1900579031);
                            i31 = -529122295;
                            break;
                        case 4:
                            bArr4 = bArr10;
                            iM55680 = (C0946.m55979("ܺ᩵") ^ i40) * 115;
                            i30 = ((iM55680 ^ i39) * 14041) ^ (-340923603);
                            i31 = -1874992823;
                            break;
                        case 5:
                            bArr4 = bArr10;
                            iM55680 = (C0946.m55979("᩵֨") ^ i40) * (-23);
                            i30 = ((iM55680 ^ i39) * (-12279)) ^ (-1860344506);
                            i31 = -1337055267;
                            break;
                        case 6:
                            bArr4 = bArr10;
                            iM55680 = (i39 - C0946.m55979("ۧۗ")) * 59;
                            i30 = ((iM55680 ^ i40) * 19219) ^ 2135679865;
                            i31 = 611664103;
                            break;
                        case 7:
                            iM55680 = (C0873.m55680("۫ۗ") + i39) * (-35);
                            bArr4 = bArr10;
                            i30 = ((iM55680 ^ i40) * 4531) ^ (-1233040253);
                            i31 = -1146416623;
                            break;
                        default:
                            bArr4 = bArr10;
                            iM55680 = C0946.m55979("ۤ᩵") ^ i40;
                            i30 = ((iM55680 ^ i39) * (-20587)) ^ 518155535;
                            i31 = 2029050187;
                            break;
                    }
                    i42 = iM55680 ^ i31;
                    i41 = i30;
                    strM55662 = str7;
                    i46 = i29;
                    i47 = i28;
                    c14559 = c14558;
                    c14677 = c146711;
                    byte[] bArr11 = bArr4;
                    str9 = strM55986;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr11;
                    break;
                case -1301343228:
                case -1082488634:
                    ServiceConnectionC1013.m56157();
                    if (C1229.f82066 >= 0) {
                        c146710 = c14677;
                        c14556 = c145510;
                        i11 = iM33576;
                        c14557 = c14559;
                        i12 = i47;
                        sArr = sArr5;
                        i13 = i48;
                        interfaceC14101 = interfaceC14103;
                        charset3 = charset9;
                        i14 = i46;
                        i16 = i49;
                        str5 = strM55662;
                        Charset charset17 = charset10;
                        i15 = i43;
                        iM55760 = i45;
                        str4 = str9;
                        bArr = bArr4;
                        charset4 = charset17;
                        iM559710 = C0873.m55680("ۧᩴ") ^ i39;
                        i17 = ((iM559710 ^ i40) * (-29367)) ^ 958045583;
                        i18 = -1544947037;
                        int i510 = iM559710 ^ i18;
                        i48 = i13;
                        strM55662 = str5;
                        i46 = i14;
                        sArr5 = sArr;
                        iM33576 = i11;
                        i42 = i510;
                        i41 = i17;
                        i49 = i16;
                        i47 = i12;
                        c14559 = c14557;
                        charset9 = charset3;
                        interfaceC14103 = interfaceC14101;
                        c145510 = c14556;
                        c14677 = c146710;
                        String str11 = str4;
                        i45 = iM55760;
                        i43 = i15;
                        charset10 = charset4;
                        bArr4 = bArr;
                        str9 = str11;
                    } else {
                        c14677 = c14677;
                        sharedPreferences2 = sharedPreferences2;
                        iM55625 = iM55625;
                        c145510 = c145510;
                        iM33576 = iM33576;
                        c14559 = c14559;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC14103 = interfaceC14103;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM55662 = strM55662;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM55979 = (C0873.m55680("᩹᩹") + i39) * (-17);
                        i3 = ((iM55979 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM55662 = strM55662;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM33576 = iM33576;
                        i42 = iM55979 ^ i4;
                        i41 = i3;
                        c14677 = c14677;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c14559 = c14559;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC14103 = interfaceC14103;
                        c145510 = c145510;
                        iM55625 = iM55625;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -1292418219:
                case -866370755:
                    c146713 = c14677;
                    strM55662 = strM55662;
                    bArr2 = bArr4;
                    charset7 = charset10;
                    i43 = i43;
                    if (i49 != 6) {
                        iM559713 = (C0946.m55979("ۢۚ") + i40) * 15;
                        i32 = ((iM559713 ^ i39) * 24905) ^ (-1764331164);
                        i33 = -1309952879;
                    } else {
                        iM559713 = (C0946.m55979("ۚۘ") ^ i39) * (-83);
                        i32 = ((iM559713 ^ i40) * (-8043)) ^ (-1765436000);
                        i33 = 1074527281;
                    }
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case -1251413743:
                case -973960700:
                    editorEdit.putLong(RunnableC0871.m55662(c5169), c14677.readLong());
                    str3 = strM55662;
                    charset2 = charset10;
                    sharedPreferences2 = sharedPreferences2;
                    int iM559717 = (i39 - C0946.m55979("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences3 = sharedPreferences2;
                    int i66 = ((iM559717 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM559717 ^ 1103830654;
                    i48 = i48;
                    strM55662 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences3;
                    iM33576 = iM33576;
                    i47 = i47;
                    c14559 = c14559;
                    strM55667 = strM55667;
                    c14677 = c14677;
                    int i67 = iM55625;
                    i41 = i66;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = i67;
                    break;
                case -1226237415:
                case -118099038:
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    int i68 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    iM55625 = i68;
                    sArr4 = sArr4;
                    strM55667 = RunnableC0871.m55667(sArr4, 23, 3, i51);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0873.m55680("᩹᩹") + i39) * (-17);
                        i3 = ((iM55979 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                    } else {
                        iM55979 = C0873.m55680("᩵ܽ") ^ i40;
                        i3 = ((iM55979 ^ i39) * 19031) ^ 527331387;
                        i4 = 878921904;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -1216881381:
                case 963773160:
                    interfaceC14770M55814.mo27878(RunnableC0871.m55662(c5168), iArr);
                    c146713 = c14677;
                    strM55662 = strM55662;
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM559713 = C0946.m55979("֡֫") ^ i40;
                    i32 = ((iM559713 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case -1198633224:
                case 515084767:
                    c146713 = c14677;
                    strM55662 = strM55662;
                    C1071.m56341(interfaceC14770M55814, C1025.m56223(c5168), C0890.m55733(c14677));
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM559713 = C0946.m55979("֡֫") ^ i40;
                    i32 = ((iM559713 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case -1112818352:
                case 380120916:
                    c14677.seek(i47);
                    C0937.m55912(interfaceC14770M55814);
                    this.f20586 = z;
                    return;
                case -1108550965:
                case 2016551350:
                    c14677 = c14677;
                    c14559 = c14559;
                    i47 = i47;
                    i46 = i46;
                    strM55662 = strM55662;
                    Charset charset18 = charset10;
                    i43 = i43;
                    strM55986 = str9;
                    bArr4 = bArr4;
                    charset10 = charset18;
                    int iM33582 = c14677.m33580();
                    byte[] bArr12 = new byte[iM33582];
                    c14677.m33576(iM33582, bArr12);
                    charset9 = C9929.f27508;
                    if (RunnableC0897.f81856) {
                        int iM559718 = (i39 - C0946.m55979("ۖۖ")) * 33;
                        i42 = iM559718 ^ (-2067971950);
                        bArr3 = bArr12;
                        i41 = ((iM559718 ^ i40) * 1921) ^ (-2007688499);
                    } else {
                        bArr3 = bArr12;
                        iM559712 = C0946.m55979("ۧۛ") ^ i40;
                        i41 = ((iM559712 ^ i39) * 13597) ^ (-480560999);
                        i26 = -55537786;
                        i42 = iM559712 ^ i26;
                    }
                    c14677 = c14677;
                    strM55662 = strM55662;
                    i46 = i46;
                    i47 = i47;
                    c14559 = c14559;
                    byte[] bArr13 = bArr4;
                    str9 = strM55986;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr13;
                    break;
                case -969409054:
                case -960442312:
                    c146711 = c14677;
                    c14558 = c14559;
                    i28 = i47;
                    i29 = i46;
                    str7 = strM55662;
                    Charset charset19 = charset10;
                    i43 = i43;
                    strM55986 = str9;
                    bArr4 = bArr4;
                    charset10 = charset19;
                    if (i49 != 3) {
                        iM55680 = C0873.m55680("۟ۤ") ^ i39;
                        i30 = ((iM55680 ^ i40) * (-22483)) ^ 1694765574;
                        i31 = 1205158439;
                    } else {
                        iM55680 = (i40 - C0873.m55680("ۙܽ")) * 23;
                        i30 = ((iM55680 ^ i39) * (-9103)) ^ (-264549286);
                        i31 = -188543930;
                    }
                    i42 = iM55680 ^ i31;
                    i41 = i30;
                    strM55662 = str7;
                    i46 = i29;
                    i47 = i28;
                    c14559 = c14558;
                    c14677 = c146711;
                    byte[] bArr14 = bArr4;
                    str9 = strM55986;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr14;
                    break;
                case -958722576:
                case -923896467:
                    throw new IllegalArgumentException(C0912.m55829(i, ServiceConnectionC1013.m56161(f82010, 26, 28, i51)));
                case -817022343:
                case 1894618395:
                    c14677 = c14677;
                    int i69 = iM55625;
                    C14555 c145511 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    c145510 = c145511;
                    this.f20585 = new ArrayList(C12248.m28249());
                    sharedPreferences2 = sharedPreferences2;
                    iM55625 = i69;
                    sArr4 = sArr4;
                    iM55979 = (C0873.m55680("ܿᩳ") ^ i40) * (-29);
                    i3 = ((iM55979 ^ i39) * 12379) ^ 1903247463;
                    i4 = 1054601220;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -753540636:
                case 556946212:
                    this.f20584 = C13215.m30213(c14677, i2);
                    return;
                case -751657766:
                case 1356122843:
                    this.f20589 = z;
                    iM55681 = (C0946.m55979("᩵ܰ") ^ i39) * (-113);
                    i41 = ((iM55681 ^ i40) * 12987) ^ (-1654834102);
                    i35 = -379641392;
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case -660799352:
                case -320439478:
                    if (i43 < i44) {
                        iM55681 = (C0873.m55680("ۚᩴ") + i40) * 47;
                        i41 = ((iM55681 ^ i39) * 14599) ^ (-354337320);
                        i35 = -2103222901;
                    } else {
                        iM55681 = (i39 - C0873.m55680("ۘܶ")) * 47;
                        i41 = ((iM55681 ^ i40) * 19871) ^ 1822952462;
                        i35 = 944757151;
                    }
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case -590177469:
                case -568195553:
                    c146713 = c14677;
                    strM55662 = strM55662;
                    interfaceC14770M55814.mo27875(c14677.m33592(), C1025.m56223(c5168));
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM559713 = C0946.m55979("֡֫") ^ i40;
                    i32 = ((iM559713 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case -555001827:
                case 139283696:
                    c146711 = c14677;
                    String str12 = strM55662;
                    C14555 c145512 = c14559;
                    int i70 = i47;
                    Charset charset20 = charset10;
                    i43 = i43;
                    strM55986 = str9;
                    bArr4 = bArr4;
                    charset10 = charset20;
                    int iM55931 = RunnableC0938.m55931(c14677);
                    if (iM55931 >= C1012.m56137(c145512)) {
                        int iM559719 = (C0946.m55979("ۨ۫") ^ i40) * (-81);
                        i27 = ((iM559719 ^ i39) * (-8649)) ^ (-518403226);
                        i42 = iM559719 ^ 817387369;
                        i47 = i70;
                        strM55662 = str12;
                        c14559 = c145512;
                        i46 = iM55931;
                        i41 = i27;
                        c14677 = c146711;
                        byte[] bArr15 = bArr4;
                        str9 = strM55986;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr15;
                    } else {
                        int iM55689 = (i39 - C0873.m55680("ۛۨ")) * (-91);
                        int i71 = ((iM55689 ^ i40) * 26915) ^ (-694109400);
                        i42 = iM55689 ^ (-1165721874);
                        c14677 = c146711;
                        i47 = i70;
                        c14559 = c145512;
                        str9 = strM55986;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr4;
                        i46 = iM55931;
                        i41 = i71;
                        strM55662 = str12;
                    }
                    break;
                case -471528138:
                case 115791259:
                    String str13 = strM55662;
                    byte[] bArr16 = bArr4;
                    charset2 = charset10;
                    editorEdit.putBoolean(C1025.m56223(c5169), C0890.m55733(c14677));
                    str3 = str13;
                    charset9 = charset9;
                    str9 = str9;
                    bArr4 = bArr16;
                    int iM5597110 = (i39 - C0946.m55979("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences4 = sharedPreferences2;
                    int i610 = ((iM5597110 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM5597110 ^ 1103830654;
                    i48 = i48;
                    strM55662 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences4;
                    iM33576 = iM33576;
                    i47 = i47;
                    c14559 = c14559;
                    strM55667 = strM55667;
                    c14677 = c14677;
                    int i611 = iM55625;
                    i41 = i610;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = i611;
                    break;
                case -470753516:
                case -205078781:
                    c146713 = c14677;
                    strM55662 = strM55662;
                    interfaceC14770M55814.mo27874(C0937.m55914(c14677), RunnableC0871.m55662(c5168));
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM559713 = C0946.m55979("֡֫") ^ i40;
                    i32 = ((iM559713 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case -459996485:
                case 993718990:
                    throw new RuntimeException(C1003.m56125(c5168.m11038(), strM56235));
                case -371411153:
                case 552396903:
                    if (C0906.m55806(strM55662, C0863.m55635(f82010, UMErrorCode.E_UM_BE_JSON_FAILED, 4, i51))) {
                        iM55681 = (C0946.m55979("ۙ᩷") ^ i40) * 7;
                        i41 = ((iM55681 ^ i39) * 15373) ^ 646831036;
                        i35 = -1419573653;
                    } else {
                        iM55681 = (C0946.m55979("᩵ܰ") ^ i39) * (-113);
                        i41 = ((iM55681 ^ i40) * 12987) ^ (-1654834102);
                        i35 = -379641392;
                    }
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case -357559768:
                case 1520450618:
                    interfaceC14770M55814.mo27876(c14677.readLong(), RunnableC0871.m55662(c5168));
                    c146713 = c14677;
                    bArr2 = bArr4;
                    charset7 = charset10;
                    iM559713 = C0946.m55979("֡֫") ^ i40;
                    i32 = ((iM559713 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case -356836382:
                case -255232071:
                    iArr[i43] = c14677.m33592();
                    i43++;
                    c14678 = c14677;
                    int iM556810 = C0873.m55680("ۙۤ") ^ i39;
                    int i72 = ((iM556810 ^ i40) * (-23345)) ^ 60390810;
                    i42 = iM556810 ^ 432306934;
                    c14677 = c14678;
                    strM55662 = strM55662;
                    i41 = i72;
                    break;
                case -356678840:
                case 1920433122:
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    if (this.f20588) {
                        iM55979 = C0946.m55979("᩸۫") ^ i40;
                        i3 = ((iM55979 ^ i39) * 28635) ^ (-969858382);
                        i4 = -1937450338;
                    } else {
                        iM55979 = (C0873.m55680("ܿᩳ") ^ i40) * (-29);
                        i3 = ((iM55979 ^ i39) * 12379) ^ 1903247463;
                        i4 = 1054601220;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -332848248:
                case 1456197721:
                    C0947.m55997();
                    if (C1046.f81962 <= 0) {
                        iM55682 = C0873.m55680("᩸᩸") ^ i40;
                        i36 = ((iM55682 ^ i39) * 28469) ^ 1759804127;
                        i37 = 820257906;
                        i42 = iM55682 ^ i37;
                        i41 = i36;
                    } else {
                        c14677 = c14677;
                        sharedPreferences2 = sharedPreferences2;
                        iM55625 = iM55625;
                        c145510 = c145510;
                        iM33576 = iM33576;
                        c14559 = c14559;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC14103 = interfaceC14103;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM55662 = strM55662;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM55979 = (C0873.m55680("᩹᩹") + i39) * (-17);
                        i3 = ((iM55979 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM55662 = strM55662;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM33576 = iM33576;
                        i42 = iM55979 ^ i4;
                        i41 = i3;
                        c14677 = c14677;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c14559 = c14559;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC14103 = interfaceC14103;
                        c145510 = c145510;
                        iM55625 = iM55625;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -263395565:
                case 941595018:
                    if (iM559714 != -1265237329) {
                        iM55681 = (C0946.m55979("ۚ۠") ^ i40) * 63;
                        i41 = ((iM55681 ^ i39) * 16559) ^ 936352784;
                        i35 = 557166215;
                    } else {
                        iM55681 = C0946.m55979("֡ۚ") ^ i39;
                        i41 = ((iM55681 ^ i40) * 7987) ^ (-1619818796);
                        i35 = -1661635628;
                    }
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case -231368301:
                case 1789937654:
                    c14677 = c14677;
                    C14555 c145513 = c14559;
                    i47 = i47;
                    i46 = i46;
                    str3 = strM55662;
                    String str14 = str9;
                    bArr4 = bArr4;
                    charset2 = charset10;
                    editorEdit.putInt(RunnableC0871.m55662(c5169), c14677.m33592());
                    c14559 = c145513;
                    strM55667 = strM55667;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i49 = i49;
                    i45 = i45;
                    str9 = str14;
                    sharedPreferences2 = sharedPreferences2;
                    int iM5597111 = (i39 - C0946.m55979("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences5 = sharedPreferences2;
                    int i612 = ((iM5597111 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM5597111 ^ 1103830654;
                    i48 = i48;
                    strM55662 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences5;
                    iM33576 = iM33576;
                    i47 = i47;
                    c14559 = c14559;
                    strM55667 = strM55667;
                    c14677 = c14677;
                    int i613 = iM55625;
                    i41 = i612;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = i613;
                    break;
                case -216646048:
                case 850351164:
                    if (RunnableC1014.f81941 <= 0) {
                        c14677 = c14677;
                        c14559 = c14559;
                        i47 = i47;
                        i46 = i46;
                        strM55662 = strM55662;
                        Charset charset21 = charset10;
                        i43 = i43;
                        strM55986 = str9;
                        bArr4 = bArr4;
                        charset10 = charset21;
                        iM559712 = C0946.m55979("ۧۛ") ^ i40;
                        i41 = ((iM559712 ^ i39) * 13597) ^ (-480560999);
                        i26 = -55537786;
                        i42 = iM559712 ^ i26;
                        c14677 = c14677;
                        strM55662 = strM55662;
                        i46 = i46;
                        i47 = i47;
                        c14559 = c14559;
                        byte[] bArr17 = bArr4;
                        str9 = strM55986;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr17;
                    } else {
                        c14677 = c14677;
                        sharedPreferences2 = sharedPreferences2;
                        iM55625 = iM55625;
                        c145510 = c145510;
                        iM33576 = iM33576;
                        c14559 = c14559;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC14103 = interfaceC14103;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM55662 = strM55662;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM55979 = (C0873.m55680("᩹᩹") + i39) * (-17);
                        i3 = ((iM55979 ^ i40) * 11903) ^ 1624535732;
                        i4 = 1013888758;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM55662 = strM55662;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM33576 = iM33576;
                        i42 = iM55979 ^ i4;
                        i41 = i3;
                        c14677 = c14677;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c14559 = c14559;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC14103 = interfaceC14103;
                        c145510 = c145510;
                        iM55625 = iM55625;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case -127312751:
                case 1056800127:
                    c14679 = c14677;
                    c14559 = c14559;
                    i47 = i47;
                    i46 = i46;
                    strM55662 = strM55662;
                    Charset charset22 = charset9;
                    i7 = i49;
                    Charset charset23 = charset10;
                    i43 = i43;
                    strM55986 = str9;
                    bArr4 = bArr4;
                    charset10 = charset23;
                    interfaceC14103 = ApplicationC21448.f67649;
                    sArr5 = f82010;
                    i48 = 91;
                    if (C0989.f81920 < 0) {
                        int iM556811 = C0873.m55680("ۜ᩷") ^ i40;
                        i41 = ((iM556811 ^ i39) * (-30493)) ^ 1846917309;
                        i42 = iM556811 ^ 281580464;
                        c14677 = c14679;
                        i49 = i7;
                        charset9 = charset22;
                        strM55662 = strM55662;
                        i46 = i46;
                        i47 = i47;
                        c14559 = c14559;
                        byte[] bArr18 = bArr4;
                        str9 = strM55986;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr18;
                    } else {
                        sharedPreferences = sharedPreferences2;
                        str = strM55667;
                        i5 = iM55625;
                        i8 = i45;
                        i6 = iM33576;
                        str2 = strM55986;
                        c14555M30214 = c145510;
                        interfaceC14100 = interfaceC14103;
                        charset = charset22;
                        int iM559720 = C0946.m55979("۠ۢ") ^ i40;
                        c14555 = c14555M30214;
                        i9 = ((iM559720 ^ i39) * (-18525)) ^ (-627094835);
                        i10 = iM559720 ^ 274473333;
                        strM55662 = strM55662;
                        i46 = i46;
                        iM33576 = i6;
                        i42 = i10;
                        i47 = i47;
                        c14559 = c14559;
                        strM55667 = str;
                        c14677 = c14679;
                        SharedPreferences sharedPreferences6 = sharedPreferences;
                        i41 = i9;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr4;
                        str9 = str2;
                        i45 = i8;
                        i49 = i7;
                        charset9 = charset;
                        interfaceC14103 = interfaceC14100;
                        c145510 = c14555;
                        iM55625 = i5;
                        sharedPreferences2 = sharedPreferences6;
                    }
                    break;
                case -59860202:
                case 1210298280:
                    if (C0906.m55806(strM55662, C1024.m56203(f82010, 98, 6, i51))) {
                        iM55681 = C0873.m55680("ܶ᩹") ^ i40;
                        i41 = ((iM55681 ^ i39) * 6321) ^ (-847520511);
                        i35 = -1862746803;
                    } else {
                        iM55681 = (C0946.m55979("᩵ܰ") ^ i39) * (-113);
                        i41 = ((iM55681 ^ i40) * 12987) ^ (-1654834102);
                        i35 = -379641392;
                    }
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case -43897000:
                case 1754680820:
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    s = sArr3[22];
                    s2 = 9450;
                    if (C0894.f81854 >= 0) {
                        iM55979 = (i40 - C0946.m55979("ۢܳ")) * 89;
                        i3 = ((iM55979 ^ i39) * 18831) ^ (-1362359957);
                        i4 = -1783280099;
                    } else {
                        iM55979 = (C0946.m55979("۟۫") + i39) * (-53);
                        i3 = ((iM55979 ^ i40) * (-10313)) ^ 925079188;
                        i4 = 356820200;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case -29115994:
                case 1932374246:
                    if (!C0927.f81875) {
                        c14677 = c14677;
                        sharedPreferences2 = sharedPreferences2;
                        iM55625 = iM55625;
                        c145510 = c145510;
                        iM33576 = iM33576;
                        c14559 = c14559;
                        i47 = i47;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        i48 = i48;
                        interfaceC14103 = interfaceC14103;
                        charset9 = charset9;
                        i46 = i46;
                        i49 = i49;
                        strM55662 = strM55662;
                        i45 = i45;
                        str9 = str9;
                        bArr4 = bArr4;
                        charset10 = charset10;
                        i43 = i43;
                        iM55979 = C0946.m55979("ۤܳ") ^ i40;
                        i3 = ((iM55979 ^ i39) * (-22713)) ^ 838682106;
                        i4 = -451616142;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM55662 = strM55662;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM33576 = iM33576;
                        i42 = iM55979 ^ i4;
                        i41 = i3;
                        c14677 = c14677;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c14559 = c14559;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC14103 = interfaceC14103;
                        c145510 = c145510;
                        iM55625 = iM55625;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    iM55979 = (C0873.m55680("᩹᩹") + i39) * (-17);
                    i3 = ((iM55979 ^ i40) * 11903) ^ 1624535732;
                    i4 = 1013888758;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 76342806:
                case 356740697:
                    C1124.m56367();
                    C1053.m56327();
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    iM55979 = (C0873.m55680("᩹᩹") + i39) * (-17);
                    i3 = ((iM55979 ^ i40) * 11903) ^ 1624535732;
                    i4 = 1013888758;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 228426502:
                case 2122980121:
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    String str15 = strM55667;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    if (i == 1749442560) {
                        iM55979 = C0873.m55680("۫᩷") ^ i40;
                        strM55667 = str15;
                        i3 = ((iM55979 ^ i39) * (-27635)) ^ (-236664861);
                        i4 = 1660450908;
                    } else {
                        strM55667 = str15;
                        iM55979 = (i39 - C0873.m55680("֫ܰ")) * (-65);
                        i3 = ((iM55979 ^ i40) * 14597) ^ (-813009057);
                        i4 = 180001443;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 379396302:
                case 1824629124:
                    c14679 = c14677;
                    str = strM55667;
                    interfaceC14100 = interfaceC14103;
                    i5 = iM55625;
                    i6 = iM33576;
                    charset = charset9;
                    c14559 = c14559;
                    i47 = i47;
                    short[] sArr6 = sArr5;
                    int i73 = i48;
                    i7 = i49;
                    i8 = i45;
                    str2 = str9;
                    i46 = i46;
                    bArr4 = bArr4;
                    strM55662 = strM55662;
                    charset10 = charset10;
                    i43 = i43;
                    int i74 = C13215.f37110;
                    c14555M30214 = C13215.m30214();
                    sharedPreferences = ApplicationC21448.f67650;
                    sArr4 = f82010;
                    if (C0892.m55749()) {
                        int iM559721 = C0946.m55979("۬᩸") ^ i39;
                        c14555 = c14555M30214;
                        i9 = ((iM559721 ^ i40) * 1023) ^ (-1563712950);
                        i10 = iM559721 ^ 1137389954;
                        i48 = i73;
                        strM55662 = strM55662;
                        i46 = i46;
                        sArr5 = sArr6;
                    } else {
                        i48 = i73;
                        sArr5 = sArr6;
                        int iM559722 = C0946.m55979("۠ۢ") ^ i40;
                        c14555 = c14555M30214;
                        i9 = ((iM559722 ^ i39) * (-18525)) ^ (-627094835);
                        i10 = iM559722 ^ 274473333;
                        strM55662 = strM55662;
                        i46 = i46;
                    }
                    iM33576 = i6;
                    i42 = i10;
                    i47 = i47;
                    c14559 = c14559;
                    strM55667 = str;
                    c14677 = c14679;
                    SharedPreferences sharedPreferences7 = sharedPreferences;
                    i41 = i9;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr4;
                    str9 = str2;
                    i45 = i8;
                    i49 = i7;
                    charset9 = charset;
                    interfaceC14103 = interfaceC14100;
                    c145510 = c14555;
                    iM55625 = i5;
                    sharedPreferences2 = sharedPreferences7;
                    break;
                case 388365304:
                case 1618028163:
                    C14677 c146714 = c14677;
                    InterfaceC14100 interfaceC14104 = interfaceC14103;
                    C14555 c145514 = c145510;
                    int i75 = i45;
                    iM33576 = iM33576;
                    charset9 = charset9;
                    C14555 c145515 = c14559;
                    int i76 = i47;
                    sArr5 = sArr5;
                    i48 = i48;
                    int i77 = i46;
                    String str16 = strM55662;
                    Charset charset24 = charset10;
                    int i78 = i43;
                    String str17 = str9;
                    byte[] bArr19 = bArr4;
                    E e2 = c145514.get(i75);
                    C0947.m55988(e2, str17);
                    c5169 = (C5168) e2;
                    int iM11038 = c5169.m11038();
                    if (iM11038 != 0) {
                        int iM559723 = (C0946.m55979("᩹ۛ") + i39) * 55;
                        interfaceC14103 = interfaceC14104;
                        i42 = iM559723 ^ 608763155;
                        i41 = ((iM559723 ^ i40) * (-30809)) ^ 148077398;
                    } else {
                        int iM556812 = C0873.m55680("ۢۢ") ^ i40;
                        i41 = ((iM556812 ^ i39) * (-24661)) ^ 879465404;
                        interfaceC14103 = interfaceC14104;
                        i42 = iM556812 ^ 1006118498;
                    }
                    c145510 = c145514;
                    c14677 = c146714;
                    i43 = i78;
                    charset10 = charset24;
                    bArr4 = bArr19;
                    str9 = str17;
                    i45 = i75;
                    i49 = iM11038;
                    strM55662 = str16;
                    i46 = i77;
                    i47 = i76;
                    c14559 = c145515;
                    break;
                case 389214988:
                case 1910796877:
                    this.f20587 = z;
                    iM55681 = (C0946.m55979("᩵ܰ") ^ i39) * (-113);
                    i41 = ((iM55681 ^ i40) * 12987) ^ (-1654834102);
                    i35 = -379641392;
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case 443094234:
                case 954993203:
                    c146713 = c14677;
                    strM55662 = strM55662;
                    bArr2 = bArr4;
                    Charset charset25 = charset10;
                    charset7 = charset25;
                    C1025.m56231(interfaceC14770M55814, RunnableC0871.m55662(c5168), new String(bArr2, charset25));
                    iM559713 = C0946.m55979("֡֫") ^ i40;
                    i32 = ((iM559713 ^ i39) * 12705) ^ 1306531067;
                    i33 = -638059693;
                    i42 = iM559713 ^ i33;
                    i43 = i43;
                    charset10 = charset7;
                    bArr4 = bArr2;
                    strM55662 = strM55662;
                    i41 = i32;
                    c14677 = c146713;
                    break;
                case 463481179:
                case 633598766:
                    i51 = 55232;
                    iM55979 = (C0873.m55680("ܳۡ") ^ i39) * 21;
                    i3 = ((iM55979 ^ i40) * 24995) ^ (-1721031619);
                    i4 = 604509095;
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 496487955:
                case 629302606:
                    c146710 = c14677;
                    c14556 = c145510;
                    i11 = iM33576;
                    str4 = str9;
                    c14557 = c14559;
                    i12 = i47;
                    bArr = bArr4;
                    sArr = sArr5;
                    i13 = i48;
                    interfaceC14101 = interfaceC14103;
                    charset3 = charset9;
                    i14 = i46;
                    charset4 = charset10;
                    i15 = i43;
                    i16 = i49;
                    str5 = strM55662;
                    iM55760 = C0894.m55760(c14677);
                    iM55625 = C0861.m55625(c14556);
                    strM56235 = C1028.m56235(f82010, 54, 29, i51);
                    if (C1964.f83032 <= 0) {
                        iM559710 = C0873.m55680("ۧᩴ") ^ i39;
                        i17 = ((iM559710 ^ i40) * (-29367)) ^ 958045583;
                        i18 = -1544947037;
                    } else {
                        iM559710 = C0946.m55979("᩺ۜ") ^ i39;
                        i17 = ((iM559710 ^ i40) * (-27363)) ^ 694818259;
                        i18 = -841148234;
                    }
                    int i511 = iM559710 ^ i18;
                    i48 = i13;
                    strM55662 = str5;
                    i46 = i14;
                    sArr5 = sArr;
                    iM33576 = i11;
                    i42 = i511;
                    i41 = i17;
                    i49 = i16;
                    i47 = i12;
                    c14559 = c14557;
                    charset9 = charset3;
                    interfaceC14103 = interfaceC14101;
                    c145510 = c14556;
                    c14677 = c146710;
                    String str18 = str4;
                    i45 = iM55760;
                    i43 = i15;
                    charset10 = charset4;
                    bArr4 = bArr;
                    str9 = str18;
                    break;
                case 501004837:
                case 1269434187:
                    str3 = strM55662;
                    String str19 = str9;
                    bArr4 = bArr4;
                    charset2 = charset10;
                    Charset charset26 = charset9;
                    editorEdit.putString(C1025.m56223(c5169), new String(bArr3, charset26));
                    str9 = str19;
                    charset9 = charset26;
                    int iM5597112 = (i39 - C0946.m55979("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences8 = sharedPreferences2;
                    int i614 = ((iM5597112 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM5597112 ^ 1103830654;
                    i48 = i48;
                    strM55662 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences8;
                    iM33576 = iM33576;
                    i47 = i47;
                    c14559 = c14559;
                    strM55667 = strM55667;
                    c14677 = c14677;
                    int i615 = iM55625;
                    i41 = i614;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = i615;
                    break;
                case 619229680:
                case 2111023788:
                    break;
                case 626292004:
                case 1751986766:
                    C10027 c10027 = C10027.f27775;
                    c146712 = c14677;
                    iM33575 = i47;
                    charset6 = charset10;
                    int iM556813 = (C0873.m55680("ۨܽ") ^ i40) * (-127);
                    int i512 = iM33575;
                    i41 = ((iM556813 ^ i39) * (-15513)) ^ 1636378871;
                    i42 = iM556813 ^ (-2144469412);
                    c14677 = c146712;
                    c14559 = c14559;
                    str9 = str9;
                    i43 = i43;
                    charset10 = charset6;
                    bArr4 = bArr4;
                    charset9 = charset9;
                    strM55662 = strM55662;
                    i46 = i46;
                    i47 = i512;
                    break;
                case 956103043:
                case 1991423341:
                    C14677 c146715 = c14677;
                    C14555 c145516 = c145510;
                    int i79 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    bArr4 = bArr4;
                    short[] sArr7 = sArr5;
                    int i80 = i48;
                    InterfaceC14100 interfaceC14105 = interfaceC14103;
                    Charset charset27 = charset9;
                    int i81 = i46;
                    charset10 = charset10;
                    i43 = i43;
                    int i82 = i49;
                    String str20 = strM55662;
                    int i83 = i45;
                    strM55986 = C0946.m55986(f82010, 83, 8, i51);
                    int i84 = iM55625;
                    if (i83 >= i84) {
                        iM559711 = (i40 - C0873.m55680("᩻ܿ")) * 69;
                        i19 = ((iM559711 ^ i39) * (-16503)) ^ 2106387301;
                        i20 = 452112500;
                    } else {
                        iM559711 = (C0946.m55979("ۤ᩹") ^ i40) * (-57);
                        i19 = ((iM559711 ^ i39) * (-26329)) ^ 559524043;
                        i20 = -2020772156;
                    }
                    int i85 = iM559711 ^ i20;
                    iM55625 = i84;
                    i45 = i83;
                    i41 = i19;
                    i48 = i80;
                    i49 = i82;
                    sArr5 = sArr7;
                    iM33576 = i79;
                    z = true;
                    i42 = i85;
                    charset9 = charset27;
                    interfaceC14103 = interfaceC14105;
                    strM55662 = str20;
                    i46 = i81;
                    c145510 = c145516;
                    c14677 = c146715;
                    i47 = i47;
                    c14559 = c14559;
                    byte[] bArr110 = bArr4;
                    str9 = strM55986;
                    i43 = i43;
                    charset10 = charset10;
                    bArr4 = bArr110;
                    break;
                case 1027809020:
                case 1070000938:
                    c14677 = c14677;
                    sharedPreferences2 = sharedPreferences2;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    iM33576 = iM33576;
                    c14559 = c14559;
                    i47 = i47;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    strM55662 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset10 = charset10;
                    i43 = i43;
                    if (i != 1749442554) {
                        iM55979 = (C0946.m55979("ۘۙ") ^ i39) * (-5);
                        i3 = ((iM55979 ^ i40) * (-24647)) ^ (-1063420471);
                        i4 = 1222632203;
                    } else {
                        iM55979 = (C0946.m55979("۠᩵") + i40) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM55979 ^ i39) * 22325) ^ (-1070693318);
                        i4 = -1881107057;
                    }
                    sArr4 = sArr4;
                    i48 = i48;
                    strM55662 = strM55662;
                    i46 = i46;
                    sArr5 = sArr5;
                    iM33576 = iM33576;
                    i42 = iM55979 ^ i4;
                    i41 = i3;
                    c14677 = c14677;
                    i47 = i47;
                    i43 = i43;
                    charset10 = charset10;
                    c14559 = c14559;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = iM55625;
                    sharedPreferences2 = sharedPreferences2;
                    break;
                case 1039712458:
                case 1392682815:
                    c14677 = c14677;
                    c14559 = c14559;
                    i47 = i47;
                    i46 = i46;
                    strM55662 = strM55662;
                    Charset charset28 = charset9;
                    Charset charset29 = charset10;
                    i43 = i43;
                    strM55986 = str9;
                    bArr4 = bArr4;
                    charset10 = charset29;
                    i49 = i49;
                    short[] sArr8 = sArr5;
                    int i86 = i48;
                    String strM55822 = C0912.m55822(sArr8, i86, 4, i51);
                    sArr5 = sArr8;
                    InterfaceC14100 interfaceC14106 = interfaceC14103;
                    C0947.m55988(interfaceC14106, strM55822);
                    int i87 = i50;
                    C23395.m52060((InterfaceC21384) c14677, i87);
                    if (!C0927.f81875) {
                        int iM556814 = C0873.m55680("֫᩻") ^ i39;
                        i50 = i87;
                        int i88 = ((iM556814 ^ i40) * (-17371)) ^ 531703487;
                        i42 = iM556814 ^ 2114659265;
                        interfaceC14103 = interfaceC14106;
                        i48 = i86;
                        i49 = i49;
                        sArr5 = sArr5;
                        i41 = i88;
                        charset9 = charset28;
                        c14677 = c14677;
                        strM55662 = strM55662;
                        i46 = i46;
                        i47 = i47;
                        c14559 = c14559;
                        byte[] bArr111 = bArr4;
                        str9 = strM55986;
                        i43 = i43;
                        charset10 = charset10;
                        bArr4 = bArr111;
                    } else {
                        i50 = i87;
                        charset9 = charset28;
                        sharedPreferences2 = sharedPreferences2;
                        iM55625 = iM55625;
                        c145510 = c145510;
                        iM33576 = iM33576;
                        interfaceC14103 = interfaceC14106;
                        i48 = i86;
                        i45 = i45;
                        sArr4 = sArr4;
                        str9 = strM55986;
                        iM55979 = (i40 - C0946.m55979("ۢܳ")) * 89;
                        i3 = ((iM55979 ^ i39) * 18831) ^ (-1362359957);
                        i4 = -1783280099;
                        sArr4 = sArr4;
                        i48 = i48;
                        strM55662 = strM55662;
                        i46 = i46;
                        sArr5 = sArr5;
                        iM33576 = iM33576;
                        i42 = iM55979 ^ i4;
                        i41 = i3;
                        c14677 = c14677;
                        i47 = i47;
                        i43 = i43;
                        charset10 = charset10;
                        c14559 = c14559;
                        bArr4 = bArr4;
                        str9 = str9;
                        i45 = i45;
                        i49 = i49;
                        charset9 = charset9;
                        interfaceC14103 = interfaceC14103;
                        c145510 = c145510;
                        iM55625 = iM55625;
                        sharedPreferences2 = sharedPreferences2;
                    }
                    break;
                case 1075253290:
                case 2007672908:
                    c14677 = c14677;
                    strM55667 = strM55667;
                    iM55625 = iM55625;
                    c145510 = c145510;
                    c14559 = c14559;
                    i47 = i47;
                    sArr5 = sArr5;
                    i48 = i48;
                    interfaceC14103 = interfaceC14103;
                    charset9 = charset9;
                    i46 = i46;
                    i49 = i49;
                    str3 = strM55662;
                    i45 = i45;
                    str9 = str9;
                    bArr4 = bArr4;
                    charset2 = charset10;
                    i43 = i43;
                    sharedPreferences2 = sharedPreferences2;
                    C1048.m56315(sharedPreferences2, strM55667);
                    C23395.m52060((InterfaceC21384) c14677, 1749442553);
                    iM33576 = c14677.m33575() + C0967.m56070(c14677);
                    editorEdit = sharedPreferences2.edit();
                    i50 = 1749442553;
                    int iM5597113 = (i39 - C0946.m55979("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences9 = sharedPreferences2;
                    int i616 = ((iM5597113 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM5597113 ^ 1103830654;
                    i48 = i48;
                    strM55662 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences9;
                    iM33576 = iM33576;
                    i47 = i47;
                    c14559 = c14559;
                    strM55667 = strM55667;
                    c14677 = c14677;
                    int i617 = iM55625;
                    i41 = i616;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = i617;
                    break;
                case 1225027685:
                case 2010328122:
                    if (i49 == 7) {
                        iM55681 = C0873.m55680("ۘ۬") ^ i39;
                        i41 = ((iM55681 ^ i40) * 28661) ^ 56046537;
                        i35 = -1446509854;
                    } else {
                        iM55681 = (i40 - C0873.m55680("ۤ۬")) * (-31);
                        i41 = ((iM55681 ^ i39) * 16763) ^ (-717308159);
                        i35 = -253372834;
                    }
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                case 1557496235:
                case 1558840161:
                    editorEdit.putFloat(RunnableC0871.m55662(c5169), c14677.m33582());
                    str3 = strM55662;
                    charset2 = charset10;
                    sharedPreferences2 = sharedPreferences2;
                    int iM5597114 = (i39 - C0946.m55979("ۡۨ")) * 85;
                    SharedPreferences sharedPreferences10 = sharedPreferences2;
                    int i618 = ((iM5597114 ^ i40) * (-16257)) ^ (-1976165887);
                    i42 = iM5597114 ^ 1103830654;
                    i48 = i48;
                    strM55662 = str3;
                    i46 = i46;
                    sArr5 = sArr5;
                    sharedPreferences2 = sharedPreferences10;
                    iM33576 = iM33576;
                    i47 = i47;
                    c14559 = c14559;
                    strM55667 = strM55667;
                    c14677 = c14677;
                    int i619 = iM55625;
                    i41 = i618;
                    i43 = i43;
                    charset10 = charset2;
                    bArr4 = bArr4;
                    str9 = str9;
                    i45 = i45;
                    i49 = i49;
                    charset9 = charset9;
                    interfaceC14103 = interfaceC14103;
                    c145510 = c145510;
                    iM55625 = i619;
                    break;
                case 1754679584:
                case 1775705114:
                    if (ViewOnClickListenerC0939.m55949(strM55662, C0873.m55689(f82010, IShizukuService.Stub.TRANSACTION_isHidden, 6, i51))) {
                        iM55681 = C0873.m55680("ܶ᩹") ^ i40;
                        i41 = ((iM55681 ^ i39) * 6321) ^ (-847520511);
                        i35 = -1862746803;
                    } else {
                        iM55681 = (C0946.m55979("᩵ܰ") ^ i39) * (-113);
                        i41 = ((iM55681 ^ i40) * 12987) ^ (-1654834102);
                        i35 = -379641392;
                    }
                    i42 = iM55681 ^ i35;
                    c14677 = c14677;
                    break;
                default:
                    c14678 = c14677;
                    int iM33583 = c14677.m33580();
                    i44 = iM33583;
                    iArr = new int[iM33583];
                    i43 = 0;
                    int iM556815 = C0873.m55680("ۙۤ") ^ i39;
                    int i710 = ((iM556815 ^ i40) * (-23345)) ^ 60390810;
                    i42 = iM556815 ^ 432306934;
                    c14677 = c14678;
                    strM55662 = strM55662;
                    i41 = i710;
                    break;
            }
        }
    }
}
