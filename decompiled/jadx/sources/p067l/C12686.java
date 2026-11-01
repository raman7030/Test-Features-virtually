package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ۧ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB7Z */
/* JADX INFO: loaded from: classes3.dex */
public class C12686 extends LinearLayout {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f35586;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12686(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = 59632747;
        int i2 = C1124.f82007;
        int i3 = C1028.f81950;
        int iM55680 = (C0873.m55680("ܶۡ") + i3) * (-107);
        int i4 = ((iM55680 ^ i2) * (-27835)) ^ 133987777;
        int i5 = -695314574;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i2) * (-15655)) >> 31));
            switch (i) {
                case -1550281970:
                case 1537040034:
                    C0992.m56107();
                    if (AbstractC0942.f81890 > 0) {
                        iM55680 = C0946.m55979("֡ۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9341) ^ 1186024710;
                        i5 = 207118531;
                    } else {
                        iM55680 = (C0873.m55680("۠ۨ") + i2) * 3;
                        i4 = ((iM55680 ^ i3) * 12045) ^ (-1305744149);
                        i5 = 317391761;
                    }
                    break;
                case -733974814:
                case 1301685376:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ܶۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13793) ^ 2146655391;
                        i5 = -2017357625;
                    } else {
                        iM55680 = C0946.m55979("᩺ۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 28665) ^ 1155864361;
                        i5 = 1085073035;
                    }
                    break;
                case -716376436:
                case 523712511:
                    if (!C0873.m55678()) {
                        iM55680 = C0946.m55979("֡ۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9341) ^ 1186024710;
                        i5 = 207118531;
                    } else {
                        iM55680 = (C0873.m55680("ۨۚ") ^ i3) * (-29);
                        i4 = ((iM55680 ^ i2) * 13581) ^ (-110588079);
                        i5 = 1419390585;
                    }
                    break;
                case -512756286:
                case 1292423312:
                    C0946.m55980();
                    throw new RuntimeException();
                case 230692636:
                case 1265187271:
                    C0890.m55740();
                    C0967.m56074();
                    iM55680 = C0946.m55979("֡ۗ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 9341) ^ 1186024710;
                    i5 = 207118531;
                    break;
                case 645305798:
                case 1649252517:
                    return;
                default:
                    C1194.m56396();
                    if (C0854.f81826 == 0) {
                        iM55680 = (C0873.m55680("ۨۚ") ^ i3) * (-29);
                        i4 = ((iM55680 ^ i2) * 13581) ^ (-110588079);
                        i5 = 1419390585;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ᩳ۟")) * 41;
                        i4 = ((iM55680 ^ i3) * (-11595)) ^ 207431154;
                        i5 = -1496146463;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12686(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ArrayList arrayList = null;
        int i2 = 890768168;
        int i3 = C0877.f81843;
        int i4 = C1036.f81953;
        int iM55680 = (C0873.m55680("֫ۢ") + i3) * (-93);
        int i5 = ((iM55680 ^ i4) * 26675) ^ 779965990;
        int i6 = 1928505393;
        while (true) {
            i2 = (iM55680 ^ i6) ^ (i5 & (((i2 ^ i4) * 16049) >> 31));
            switch (i2) {
                case -2030568915:
                case 647881242:
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("֡ܺ") ^ i3) * (-11);
                        i5 = ((iM55680 ^ i4) * 29849) ^ 2110462493;
                        i6 = 1460409293;
                    } else {
                        iM55680 = C0946.m55979("ۡ᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17427) ^ (-1198508841);
                        i6 = -1998211470;
                    }
                    break;
                case -2029721832:
                case -1777803150:
                    super.setOrientation(1);
                    return;
                case -1944796446:
                case -1004819447:
                    C0861.m55626();
                    if (C0946.f81894 == 0) {
                        iM55680 = (C0946.m55979("ܺ۬") + i4) * (-31);
                        i5 = ((iM55680 ^ i3) * (-21103)) ^ 381621045;
                        i6 = 1143252404;
                    } else {
                        iM55680 = C0946.m55979("۫ۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 27673) ^ (-459173174);
                        i6 = -2059904627;
                    }
                    break;
                case -1872845071:
                case 314287838:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("۫ۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 27673) ^ (-459173174);
                        i6 = -2059904627;
                    } else {
                        iM55680 = (C0946.m55979("۫ۡ") ^ i4) * 79;
                        i5 = ((iM55680 ^ i3) * 7069) ^ (-627891109);
                        i6 = -461376301;
                    }
                    break;
                case -1541046914:
                case -679904299:
                    if (C1964.m56597() != 0) {
                        iM55680 = C0873.m55680("ۢ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * 15479) ^ 1692897265;
                        i6 = 39519425;
                    } else {
                        iM55680 = C0946.m55979("᩹ۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 32651) ^ 195991541;
                        i6 = 146529214;
                    }
                    break;
                case -1461179750:
                case -452754087:
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("᩸᩷") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-24101)) ^ (-259477406);
                        i6 = -195310028;
                    } else {
                        iM55680 = (C0873.m55680("֡ܺ") ^ i3) * (-11);
                        i5 = ((iM55680 ^ i4) * 29849) ^ 2110462493;
                        i6 = 1460409293;
                    }
                    break;
                case -1448008233:
                case -549706418:
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("ܺ۬") + i4) * (-31);
                        i5 = ((iM55680 ^ i3) * (-21103)) ^ 381621045;
                        i6 = 1143252404;
                    } else {
                        iM55680 = C0946.m55979("ܰ۬") ^ i4;
                        i5 = ((iM55680 ^ i3) * 17715) ^ (-1410184122);
                        i6 = 76420731;
                    }
                    break;
                case -1091075171:
                case 2071116771:
                    C1036.m56257();
                    iM55680 = (C0873.m55680("֡ܺ") ^ i3) * (-11);
                    i5 = ((iM55680 ^ i4) * 29849) ^ 2110462493;
                    i6 = 1460409293;
                    break;
                case -936936142:
                case 192388812:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("ۤۜ") ^ i4) * (-117);
                        i5 = ((iM55680 ^ i3) * (-21655)) ^ (-1194510084);
                        i6 = 45889484;
                    } else {
                        iM55680 = (C0873.m55680("֡ܺ") ^ i3) * (-11);
                        i5 = ((iM55680 ^ i4) * 29849) ^ 2110462493;
                        i6 = 1460409293;
                    }
                    break;
                case -496118318:
                case 948140872:
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("֡ܺ") ^ i3) * (-11);
                        i5 = ((iM55680 ^ i4) * 29849) ^ 2110462493;
                        i6 = 1460409293;
                    } else {
                        iM55680 = C0873.m55680("ܶۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-6623)) ^ (-1108187931);
                        i6 = 648533737;
                    }
                    break;
                case 15829952:
                case 1072924333:
                    arrayList = new ArrayList();
                    if (C0854.m55595() >= 0) {
                        iM55680 = (C0873.m55680("֡ܺ") ^ i3) * (-11);
                        i5 = ((iM55680 ^ i4) * 29849) ^ 2110462493;
                        i6 = 1460409293;
                    } else {
                        iM55680 = C0873.m55680("ۘܿ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-28407)) ^ (-1019870850);
                        i6 = 671016109;
                    }
                    break;
                case 111821781:
                case 322210100:
                    if (C0937.f81884) {
                        iM55680 = (i4 - C0946.m55979("᩷ܰ")) * 93;
                        i5 = ((iM55680 ^ i3) * (-25397)) ^ 1078754568;
                        i6 = -154879933;
                    } else {
                        iM55680 = C0946.m55979("۫ۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 27673) ^ (-459173174);
                        i6 = -2059904627;
                    }
                    break;
                case 131888457:
                case 589972152:
                    this.f35586 = arrayList;
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0873.m55680("ۢ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * 15479) ^ 1692897265;
                        i6 = 39519425;
                    } else {
                        iM55680 = C0873.m55680("᩵ᩴ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 1513) ^ (-1512031995);
                        i6 = 155759514;
                    }
                    break;
                case 698128207:
                case 1434229308:
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("ۤۜ") ^ i4) * (-117);
                        i5 = ((iM55680 ^ i3) * (-21655)) ^ (-1194510084);
                        i6 = 45889484;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۗ۬")) * 89;
                        i5 = ((iM55680 ^ i3) * 27005) ^ 157294904;
                        i6 = 1736858776;
                    }
                    break;
                case 1313261971:
                case 2022896252:
                    C1024.m56209();
                    if (C0930.f81879 > 0) {
                        iM55680 = C0946.m55979("۫ۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 27673) ^ (-459173174);
                        i6 = -2059904627;
                    } else {
                        iM55680 = (C0873.m55680("֡ܺ") ^ i3) * (-11);
                        i5 = ((iM55680 ^ i4) * 29849) ^ 2110462493;
                        i6 = 1460409293;
                    }
                    break;
                default:
                    C1017.m56187();
                    C1048.m56305();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x02f9 A[PHI: r2 r16 r17
      0x02f9: PHI (r2v7 int) = (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:77:0x02f7, B:56:0x022b, B:16:0x0081, B:14:0x007d, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r16v38 int) = (r16v6 int), (r16v8 int), (r16v18 int), (r16v20 int), (r16v39 int) binds: [B:77:0x02f7, B:56:0x022b, B:16:0x0081, B:14:0x007d, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r17v39 int) = (r17v10 int), (r17v12 int), (r17v22 int), (r17v24 int), (r17v40 int) binds: [B:77:0x02f7, B:56:0x022b, B:16:0x0081, B:14:0x007d, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0348 A[PHI: r4 r5 r16 r17
      0x0348: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:85:0x0346, B:81:0x0328, B:47:0x01d8, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r5v4 java.util.ArrayList) = (r5v2 java.util.ArrayList), (r5v2 java.util.ArrayList), (r5v3 java.util.ArrayList), (r5v2 java.util.ArrayList) binds: [B:85:0x0346, B:81:0x0328, B:47:0x01d8, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r16v19 int) = (r16v4 int), (r16v5 int), (r16v9 int), (r16v20 int) binds: [B:85:0x0346, B:81:0x0328, B:47:0x01d8, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r17v23 int) = (r17v8 int), (r17v9 int), (r17v13 int), (r17v24 int) binds: [B:85:0x0346, B:81:0x0328, B:47:0x01d8, B:14:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iM55979;
        int i3;
        int i4;
        int iM55680;
        int i5;
        int i6;
        int i7 = ServiceConnectionC1013.f81940;
        int i8 = C1036.f81953;
        int iM55681 = (C0873.m55680("ۨܶ") + i7) * (-93);
        int i9 = ((iM55681 ^ i8) * 15225) ^ 1442067286;
        ArrayList arrayList = null;
        C18049 c18049 = null;
        int i10 = iM55681 ^ 1133481725;
        int i11 = 0;
        int iMakeMeasureSpec = 0;
        int iM56236 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -992565928;
        View viewM56085 = null;
        Iterator itM56090 = null;
        int i16 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * 23939) >> 31));
            switch (i15) {
                case -2100094417:
                case 534593914:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    iM56236 = C1028.m56236(this);
                    arrayList = this.f35586;
                    RunnableC0938.m55934(arrayList);
                    if (C0967.m56074()) {
                        iM55680 = (C0946.m55979("ۢᩴ") + i8) * 97;
                        i5 = ((iM55680 ^ i7) * (-4961)) ^ 1248587181;
                        i6 = -1284693037;
                    } else {
                        iM55680 = (C0946.m55979("ۚۖ") + i7) * (-11);
                        i5 = ((iM55680 ^ i8) * 1931) ^ (-71338831);
                        i6 = 955541374;
                    }
                    int i17 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i17;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -2066767525:
                case -1876941714:
                    C1229.m56402((View) C0955.m56035(itM56090)).width = i13;
                    iM55680 = C0873.m55680("ۗ۬") ^ i8;
                    i5 = ((iM55680 ^ i7) * (-24083)) ^ (-386706036);
                    i6 = 480747925;
                    int i18 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i18;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -1926178189:
                case 1443805691:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    if (C0937.f81884) {
                        iM55680 = (C0946.m55979("ۜ᩺") ^ i8) * 97;
                        i5 = ((iM55680 ^ i7) * 24197) ^ (-1360795954);
                        i6 = 1170312945;
                    } else {
                        iM55680 = (C0946.m55979("ۢᩴ") + i8) * 97;
                        i5 = ((iM55680 ^ i7) * (-4961)) ^ 1248587181;
                        i6 = -1284693037;
                    }
                    int i19 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i19;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -1904474710:
                case -431754102:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0873.m55680("᩵ۘ") + i8) * 25;
                        i5 = ((iM55680 ^ i7) * 13047) ^ (-1972935557);
                        i6 = 954680723;
                    } else {
                        iM55680 = C0946.m55979("᩷᩻") ^ i8;
                        i5 = ((iM55680 ^ i7) * 17077) ^ (-1739752280);
                        i6 = -1987437556;
                    }
                    int i110 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i110;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -1743481773:
                case 965649370:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    if (C1044.m56286() <= 0) {
                        iM55680 = (i7 - C0873.m55680("ܺᩳ")) * (-47);
                        i5 = ((iM55680 ^ i8) * 17521) ^ (-2071030236);
                        i6 = -1452708020;
                    } else {
                        iM55680 = C0873.m55680("ۢܰ") ^ i7;
                        i5 = ((iM55680 ^ i8) * 32109) ^ 2121234223;
                        i6 = 179625332;
                    }
                    int i111 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i111;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -1592616306:
                case -33788940:
                    i14 = i14;
                    C1003.m56123();
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    if (C0927.f81875) {
                        iM55680 = (i7 - C0873.m55680("ܺᩳ")) * (-47);
                        i5 = ((iM55680 ^ i8) * 17521) ^ (-2071030236);
                        i6 = -1452708020;
                    } else {
                        iM55680 = (C0946.m55979("ۢᩴ") + i8) * 97;
                        i5 = ((iM55680 ^ i7) * (-4961)) ^ 1248587181;
                        i6 = -1284693037;
                    }
                    int i112 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i112;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -1441464825:
                case -200612186:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0946.m55979("ۢᩴ") + i8) * 97;
                        i5 = ((iM55680 ^ i7) * (-4961)) ^ 1248587181;
                        i6 = -1284693037;
                    } else {
                        iM55680 = (C0873.m55680("֫ܰ") + i7) * (-51);
                        i5 = ((iM55680 ^ i8) * (-30877)) ^ (-827341052);
                        i6 = -1669655830;
                    }
                    int i113 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i113;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -1206832826:
                case 1845412610:
                    itM56090 = C0989.m56090(arrayList);
                    iM55680 = C0873.m55680("ۗ۬") ^ i8;
                    i5 = ((iM55680 ^ i7) * (-24083)) ^ (-386706036);
                    i6 = 480747925;
                    int i114 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i114;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -831875488:
                case 1869247741:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    if (C0992.m56107() > 0) {
                        iM55680 = (i7 - C0873.m55680("ܰܿ")) * (-95);
                        i5 = ((iM55680 ^ i8) * 29939) ^ 215938200;
                        i6 = 30935293;
                        int i115 = iM55680 ^ i6;
                        i14 = i14;
                        i10 = i115;
                        i9 = i5;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                    } else {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        iM55979 = (C0946.m55979("᩵ۙ") + i7) * 5;
                        i3 = ((iM55979 ^ i8) * 31493) ^ (-1684543123);
                        i4 = -1369250988;
                        int i20 = i14;
                        i10 = iM55979 ^ i4;
                        i9 = i3;
                        i14 = i20;
                    }
                    break;
                case -821989548:
                case 593213072:
                    i14 = i14;
                    C0882.m55710();
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    iM55680 = (i7 - C0873.m55680("ܺᩳ")) * (-47);
                    i5 = ((iM55680 ^ i8) * 17521) ^ (-2071030236);
                    i6 = -1452708020;
                    int i116 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i116;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -808548664:
                case 429292425:
                    View viewM56299 = C1046.m56299(c18049, i12);
                    C1194.m56393(arrayList, viewM56299);
                    viewM56299.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth = viewM56299.getMeasuredWidth();
                    i14 = i13 < measuredWidth ? measuredWidth : i13;
                    int iM559710 = C0946.m55979("ۢܳ") ^ i7;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i5 = ((iM559710 ^ i8) * (-4603)) ^ (-752546888);
                    i10 = iM559710 ^ (-1796439181);
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -723774827:
                case -316290921:
                    i14 = i14;
                    viewM56085 = C0989.m56085(this, i16);
                    if (viewM56085 instanceof C18049) {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        iM55680 = (C0946.m55979("᩹֨") ^ i8) * (-61);
                        i5 = ((iM55680 ^ i7) * 23945) ^ 1022864081;
                        i6 = -2035203208;
                        int i117 = iM55680 ^ i6;
                        i14 = i14;
                        i10 = i117;
                        i9 = i5;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                    }
                    int iM559711 = C0946.m55979("ۢܳ") ^ i7;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i5 = ((iM559711 ^ i8) * (-4603)) ^ (-752546888);
                    i10 = iM559711 ^ (-1796439181);
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -674331669:
                case 796185949:
                    RunnableC0871.m55672();
                    RunnableC0897.m55784();
                    break;
                case -592456588:
                case 590158492:
                    i14 = i14;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = (C0946.m55979("᩵ۙ") + i7) * 5;
                        i3 = ((iM55979 ^ i8) * 31493) ^ (-1684543123);
                        i4 = -1369250988;
                    } else {
                        iM55979 = (C0946.m55979("۫֫") + i8) * (-125);
                        i3 = ((iM55979 ^ i7) * 5463) ^ 2042094828;
                        i4 = -1065748944;
                    }
                    int i21 = i14;
                    i10 = iM55979 ^ i4;
                    i9 = i3;
                    i14 = i21;
                    break;
                case -556202649:
                case 1398624740:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    if (i16 < iM56236) {
                        iM55680 = C0946.m55979("᩹᩹") ^ i7;
                        i5 = ((iM55680 ^ i8) * 25475) ^ 1920629837;
                        i6 = 942188741;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ܺۧ")) * 17;
                        i5 = ((iM55680 ^ i8) * 29129) ^ 1737419282;
                        i6 = -778488399;
                    }
                    int i118 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i118;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -373592094:
                case -37283792:
                    i14 = i14;
                    i12 = 0;
                    i16 = 0;
                    i13 = 0;
                    iM55680 = C0873.m55680("ۨۘ") ^ i8;
                    i5 = ((iM55680 ^ i7) * (-21929)) ^ 571566368;
                    i6 = 943390594;
                    int i119 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i119;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case -138976599:
                case -96182923:
                    i14 = i14;
                    if (C0866.m55647(itM56090)) {
                        iM55979 = (i8 - C0873.m55680("᩺ۙ")) * (-125);
                        i3 = ((iM55979 ^ i7) * 5051) ^ (-11900141);
                        i4 = -1067113159;
                    } else {
                        iM55979 = (C0946.m55979("֡ᩴ") + i7) * (-99);
                        i3 = ((iM55979 ^ i8) * 23291) ^ 1375033619;
                        i4 = 794713667;
                    }
                    int i22 = i14;
                    i10 = iM55979 ^ i4;
                    i9 = i3;
                    i14 = i22;
                    break;
                case 243601680:
                case 621406440:
                    C0917.m55854();
                    if (C0949.f81897 < 0) {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        i14 = i14;
                        iM55680 = (C0873.m55680("᩵ۘ") + i8) * 25;
                        i5 = ((iM55680 ^ i7) * 13047) ^ (-1972935557);
                        i6 = 954680723;
                        int i1110 = iM55680 ^ i6;
                        i14 = i14;
                        i10 = i1110;
                        i9 = i5;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                    }
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    iM55680 = (i7 - C0873.m55680("ܺᩳ")) * (-47);
                    i5 = ((iM55680 ^ i8) * 17521) ^ (-2071030236);
                    i6 = -1452708020;
                    int i1111 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i1111;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case 294208508:
                case 429731480:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    if (!C1048.f81963) {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        iM55979 = (C0946.m55979("᩵ۙ") + i7) * 5;
                        i3 = ((iM55979 ^ i8) * 31493) ^ (-1684543123);
                        i4 = -1369250988;
                        int i23 = i14;
                        i10 = iM55979 ^ i4;
                        i9 = i3;
                        i14 = i23;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩸") ^ i8;
                        i5 = ((iM55680 ^ i7) * (-23457)) ^ 353570887;
                        i6 = -736955091;
                        int i1112 = iM55680 ^ i6;
                        i14 = i14;
                        i10 = i1112;
                        i9 = i5;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                    }
                    break;
                case 665833924:
                case 2085975550:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    i11 = Mod.M30;
                    if (C1012.f81938 >= 0) {
                        iM55680 = (i7 - C0873.m55680("ܺᩳ")) * (-47);
                        i5 = ((iM55680 ^ i8) * 17521) ^ (-2071030236);
                        i6 = -1452708020;
                    } else {
                        iM55680 = (i8 - C0873.m55680("ۡ֨")) * (-127);
                        i5 = ((iM55680 ^ i7) * 623) ^ (-240722646);
                        i6 = -1458347942;
                    }
                    int i1113 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i1113;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                case 854670682:
                case 1349913732:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    i14 = i14;
                    if (C0912.f81867 > 0) {
                        iM55680 = (C0946.m55979("᩸ۧ") + i7) * (-83);
                        i5 = ((iM55680 ^ i8) * (-14241)) ^ 1614997664;
                        i6 = 1457148493;
                        int i1114 = iM55680 ^ i6;
                        i14 = i14;
                        i10 = i1114;
                        i9 = i5;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                    } else {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        iM55979 = (C0946.m55979("᩵ۙ") + i7) * 5;
                        i3 = ((iM55979 ^ i8) * 31493) ^ (-1684543123);
                        i4 = -1369250988;
                        int i24 = i14;
                        i10 = iM55979 ^ i4;
                        i9 = i3;
                        i14 = i24;
                    }
                    break;
                case 1304012745:
                case 2049474038:
                    i14 = i14;
                    c18049 = (C18049) viewM56085;
                    if (C0898.m55797(c18049) < 1) {
                        int iM559712 = C0946.m55979("ۢܳ") ^ i7;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        i5 = ((iM559712 ^ i8) * (-4603)) ^ (-752546888);
                        i10 = iM559712 ^ (-1796439181);
                        i9 = i5;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                    } else {
                        iM55979 = C0946.m55979("۫ܺ") ^ i8;
                        i3 = ((iM55979 ^ i7) * (-2111)) ^ 851636491;
                        i4 = 690847090;
                        int i25 = i14;
                        i10 = iM55979 ^ i4;
                        i9 = i3;
                        i14 = i25;
                    }
                    break;
                case 1564241201:
                case 1955594740:
                    RunnableC0938.m55934(arrayList);
                    super.onMeasure(i, i2);
                    break;
                case 1652262638:
                case 2015079058:
                    i14 = i14;
                    i16++;
                    i13 = i14;
                    iM55680 = C0873.m55680("ۨۘ") ^ i8;
                    i5 = ((iM55680 ^ i7) * (-21929)) ^ 571566368;
                    i6 = 943390594;
                    int i1115 = iM55680 ^ i6;
                    i14 = i14;
                    i10 = i1115;
                    i9 = i5;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    break;
                default:
                    if (C0949.f81897 < 0) {
                        iM55979 = C0873.m55680("ۨܺ") ^ i7;
                        i14 = i14;
                        i3 = ((iM55979 ^ i8) * 6871) ^ (-593004725);
                        i4 = 1306899116;
                        int i26 = i14;
                        i10 = iM55979 ^ i4;
                        i9 = i3;
                        i14 = i26;
                    } else {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        i14 = i14;
                        iM55680 = (i7 - C0873.m55680("ܺᩳ")) * (-47);
                        i5 = ((iM55680 ^ i8) * 17521) ^ (-2071030236);
                        i6 = -1452708020;
                        int i1116 = iM55680 ^ i6;
                        i14 = i14;
                        i10 = i1116;
                        i9 = i5;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        throw new UnsupportedOperationException();
    }
}
