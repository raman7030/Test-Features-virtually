package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 77J6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13381 extends AbstractC21283 {

    /* JADX INFO: renamed from: ܽ֫ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f82155 = {8014, -23072, -31776, -23643, 21543, 17250, 24159, 16405, -19787, -16738, 3757, -22175, -22181, -22182, -22206, -22201, -22208, -22197, -22198, -22168, -22201, -22206, -22206, -22197, -22198};

    /* JADX INFO: renamed from: ֫ */
    public final ActivityC15391 f37541;

    /* JADX INFO: renamed from: ۧ */
    public boolean f37542;

    /* JADX INFO: renamed from: ܽ */
    public List f37543;

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        short[] sArr;
        int iM55680;
        int i2;
        int iM55681;
        int i3;
        int i4;
        short s;
        LayoutInflater layoutInflater;
        int iM55979;
        int i5;
        int i6;
        int i7 = 34072591;
        int i8 = C0866.f81837;
        int i9 = RunnableC0871.f81839;
        int iM55682 = (i8 - C0873.m55680("᩵ۨ")) * (-103);
        int i10 = ((iM55682 ^ i9) * 5095) ^ 1534488043;
        int i11 = iM55682 ^ (-1555664102);
        String strM56233 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        LayoutInflater layoutInflaterFrom = null;
        int iM55683 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        ImageView imageView = null;
        C24109 c24109 = null;
        View viewInflate = null;
        int iM55684 = 0;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * (-9011)) >> 31));
            switch (i7) {
                case -1910318224:
                case -1168306976:
                    c24109.f76527 = imageView;
                    sArr5 = f82155;
                    i13 = 7;
                    if (C0930.f81879 > 0) {
                        iM55979 = (i8 - C0946.m55979("۟ܳ")) * 95;
                        i5 = ((iM55979 ^ i9) * (-16401)) ^ (-783327277);
                        i6 = -874426118;
                        i11 = iM55979 ^ i6;
                        i10 = i5;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        s = s2;
                        iM55680 = (i8 - C0873.m55680("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM55680 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55680 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                case -1868675198:
                case -1123814048:
                    RunnableC0871.m55672();
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = s2;
                    iM55680 = (i8 - C0873.m55680("֡᩺")) * 7;
                    s2 = s;
                    i10 = ((iM55680 ^ i9) * 17573) ^ 704786823;
                    i2 = -1466304249;
                    layoutInflater = layoutInflaterFrom;
                    i11 = iM55680 ^ i2;
                    layoutInflaterFrom = layoutInflater;
                    break;
                case -1784779420:
                case 1850815240:
                    viewInflate = layoutInflaterFrom.inflate(iM55684, viewGroup, false);
                    c24109 = new C24109(viewInflate);
                    sArr4 = f82155;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55681 = (i9 - C0946.m55979("ܳ᩺")) * 25;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i3 = ((iM55681 ^ i8) * (-705)) ^ 1977852656;
                        i4 = -1485850282;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55681 ^ i4;
                        i10 = i3;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        sArr = sArr2;
                        int iM559710 = C0946.m55979("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM559710 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM559710 ^ 1646500092;
                    }
                    break;
                case -1768313280:
                case -1248607417:
                    C0890.m55740();
                    if (C1053.m56327() >= 0) {
                        sArr = sArr2;
                        int iM559711 = C0946.m55979("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM559711 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM559711 ^ 1646500092;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        s = s2;
                        iM55680 = (i8 - C0873.m55680("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM55680 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55680 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                case -1722590614:
                case 1683179448:
                    layoutInflaterFrom = layoutInflaterFrom;
                    sArr = f82155;
                    if (C0930.f81879 > 0) {
                        iM55680 = C0873.m55680("ܶ᩸") ^ i9;
                        sArr2 = sArr;
                        i10 = ((iM55680 ^ i8) * 597) ^ 1373867854;
                        i2 = 1282311878;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55680 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        int iM559712 = C0946.m55979("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM559712 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM559712 ^ 1646500092;
                    }
                    break;
                case -1640229229:
                case -251486655:
                    layoutInflaterFrom = LayoutInflater.from(this.f37541);
                    sArr3 = f82155;
                    i18 = 3;
                    if (C0946.m55980() != 0) {
                        sArr = sArr2;
                        i15 = 1;
                        int iM559713 = C0946.m55979("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM559713 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM559713 ^ 1646500092;
                    } else {
                        int iM55685 = (C0873.m55680("ۛۘ") ^ i8) * 51;
                        int i19 = ((iM55685 ^ i9) * 879) ^ 1400454448;
                        i11 = iM55685 ^ 107810126;
                        i10 = i19;
                        i15 = 1;
                    }
                    break;
                case -1556234773:
                case -1318575551:
                    C0927.m55873();
                    RunnableC0897.m55784();
                    return null;
                case -1528544470:
                case -1295211809:
                    if (C0906.m55809() > 0) {
                        iM55979 = (i9 - C0946.m55979("۟᩺")) * 63;
                        i5 = ((iM55979 ^ i8) * 19789) ^ (-884421052);
                        i6 = 1917932172;
                    } else {
                        iM55979 = (i8 - C0873.m55680("ۙۧ")) * 31;
                        i5 = ((iM55979 ^ i9) * 25067) ^ 1139122449;
                        i6 = -772838464;
                    }
                    i11 = iM55979 ^ i6;
                    i10 = i5;
                    break;
                case -1360253026:
                case 876780955:
                    strM56233 = C1025.m56233(sArr4, 4, 3, i14);
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("ܰᩴ") + i9) * 109;
                        i5 = ((iM55979 ^ i8) * 29987) ^ (-1423716567);
                        i6 = 578379176;
                    } else {
                        iM55979 = (C0946.m55979("۬ܶ") ^ i8) * 23;
                        i5 = ((iM55979 ^ i9) * 29749) ^ 140282619;
                        i6 = 1806359949;
                    }
                    i11 = iM55979 ^ i6;
                    i10 = i5;
                    break;
                case -1307760413:
                case -711621781:
                    layoutInflaterFrom = layoutInflaterFrom;
                    s2 = sArr2[0];
                    if (C0898.f81858 > 0) {
                        iM55681 = C0873.m55680("ۧۙ") ^ i8;
                        i3 = ((iM55681 ^ i9) * 8049) ^ 1048152478;
                        i4 = -205055281;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55681 ^ i4;
                        i10 = i3;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        sArr = sArr2;
                        layoutInflaterFrom = layoutInflaterFrom;
                        int iM559714 = C0946.m55979("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM559714 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM559714 ^ 1646500092;
                    }
                    break;
                case -973332431:
                case 656595646:
                    c24109.f76528 = (TextView) C0892.m55755(viewInflate, iM55683 ^ i12);
                    return c24109;
                case -856057509:
                case 2077877963:
                    layoutInflaterFrom = layoutInflaterFrom;
                    if ((i17 + 93857344) - i16 < 0) {
                        iM55681 = (C0946.m55979("ܽ۠") + i8) * 115;
                        i3 = ((iM55681 ^ i9) * 24371) ^ 761753804;
                        i4 = -1782450103;
                    } else {
                        iM55681 = (i9 - C0873.m55680("ۡۨ")) * C0254q.f1218h;
                        i3 = ((iM55681 ^ i8) * (-6149)) ^ (-1992615798);
                        i4 = 1385754823;
                    }
                    layoutInflater = layoutInflaterFrom;
                    i11 = iM55681 ^ i4;
                    i10 = i3;
                    layoutInflaterFrom = layoutInflater;
                    break;
                case -768210599:
                case 1738232450:
                    imageView = (ImageView) C0892.m55755(viewInflate, C0946.m55979(strM56233) ^ 2097659380);
                    if (C1124.f82007 < 0) {
                        iM55979 = C0946.m55979("ܽ᩺") ^ i9;
                        i5 = ((iM55979 ^ i8) * 21241) ^ 123506041;
                        i6 = 400154114;
                        i11 = iM55979 ^ i6;
                        i10 = i5;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        s = s2;
                        iM55680 = (i8 - C0873.m55680("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM55680 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55680 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                case -725371893:
                case -337212714:
                    if (!C1024.f81946) {
                        sArr = sArr2;
                        int iM559715 = C0946.m55979("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM559715 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM559715 ^ 1646500092;
                    } else {
                        iM55979 = (i9 - C0946.m55979("۟᩺")) * 63;
                        i5 = ((iM55979 ^ i8) * 19789) ^ (-884421052);
                        i6 = 1917932172;
                        i11 = iM55979 ^ i6;
                        i10 = i5;
                    }
                    break;
                case -703591457:
                case 1920476404:
                    layoutInflaterFrom = layoutInflaterFrom;
                    int i20 = i18;
                    iM55684 = 2126894844 ^ C0873.m55680(ServiceConnectionC1013.m56161(sArr3, i15, i20, i14));
                    if (C0906.f81862 < 0) {
                        iM55680 = C0873.m55680("ܿ֨") ^ i9;
                        i18 = i20;
                        i10 = ((iM55680 ^ i8) * 11875) ^ (-1077062173);
                        i2 = -139842834;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55680 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        i18 = i20;
                        layoutInflaterFrom = layoutInflaterFrom;
                        sArr = sArr2;
                        int iM559716 = C0946.m55979("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM559716 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM559716 ^ 1646500092;
                    }
                    break;
                case -490219686:
                case 103441195:
                    iM55683 = C0873.m55680(C0866.m55652(sArr5, i13, 3, i14));
                    i12 = 2101233296;
                    if (C0906.f81862 < 0) {
                        iM55979 = C0946.m55979("ۡۧ") ^ i9;
                        i5 = ((iM55979 ^ i8) * 7257) ^ (-1396371851);
                        i6 = -1093011145;
                        i11 = iM55979 ^ i6;
                        i10 = i5;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        s = s2;
                        iM55680 = (i8 - C0873.m55680("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM55680 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55680 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                case -134407220:
                case 2100865455:
                    i14 = 54040;
                    iM55680 = C0873.m55680("۫ۢ") ^ i9;
                    i10 = ((iM55680 ^ i8) * 26087) ^ 1011228079;
                    i2 = 1761197241;
                    layoutInflater = layoutInflaterFrom;
                    i11 = iM55680 ^ i2;
                    layoutInflaterFrom = layoutInflater;
                    break;
                case 753176606:
                case 1767573278:
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = s2;
                    int i21 = s * 19376;
                    i17 = s * s;
                    if (C1028.m56247() < 0) {
                        s2 = s;
                        iM55681 = C0946.m55979("ۗ۠") ^ i8;
                        i16 = i21;
                        i3 = ((iM55681 ^ i9) * 25359) ^ 1818365851;
                        i4 = 333059505;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55681 ^ i4;
                        i10 = i3;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        i16 = i21;
                        iM55680 = (i8 - C0873.m55680("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM55680 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM55680 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                default:
                    i14 = 52187;
                    iM55680 = C0873.m55680("۫ۢ") ^ i9;
                    i10 = ((iM55680 ^ i8) * 26087) ^ 1011228079;
                    i2 = 1761197241;
                    layoutInflater = layoutInflaterFrom;
                    i11 = iM55680 ^ i2;
                    layoutInflaterFrom = layoutInflater;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C24109 c24109 = null;
        List list = null;
        String str = null;
        C17117 c17117M49182 = null;
        int i2 = 441538440;
        int i3 = C1036.f81953;
        int i4 = C0873.f81841;
        int iM55680 = C0873.m55680("᩹֡") ^ i3;
        int i5 = ((iM55680 ^ i4) * (-3869)) ^ (-1259797156);
        int i6 = -995219087;
        while (true) {
            i2 = ((((i2 ^ i4) * (-29065)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2013108702:
                case 53440574:
                    if (C0890.m55740()) {
                        iM55680 = C0873.m55680("ۖۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-16457)) ^ (-1418277279);
                        i6 = -756145466;
                    } else {
                        iM55680 = C0873.m55680("᩺ۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    }
                    break;
                case -2007099584:
                case -1539149260:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0946.m55979("᩷ۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        iM55680 = C0873.m55680("ۛᩴ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-6385)) ^ (-156213838);
                        i6 = -1463036483;
                    }
                    break;
                case -1993064899:
                case -799676722:
                    C0967.m56074();
                    if (C0873.f81841 > 0) {
                        iM55680 = C0946.m55979("ܽᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    } else {
                        iM55680 = C0873.m55680("᩺ۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    }
                    break;
                case -1976159635:
                case 519090727:
                    if (C0845.m55584() <= 0) {
                        iM55680 = C0946.m55979("᩷ۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        iM55680 = C0946.m55979("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 23911) ^ (-2112693430);
                        i6 = 865106300;
                    }
                    break;
                case -1896639938:
                case 1191927762:
                    C0877.m55696();
                    break;
                case -1585549913:
                case 437071622:
                    if (C0949.m56012()) {
                        iM55680 = C0946.m55979("ۛ֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    } else {
                        iM55680 = (C0946.m55979("ۚ֨") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM55680 ^ i3) * 11089) ^ 118285058;
                        i6 = -1538978693;
                    }
                    break;
                case -1536636138:
                case -713849841:
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0946.m55979("ܽᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    } else {
                        iM55680 = C0873.m55680("۟᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-29471)) ^ 921606029;
                        i6 = 322035956;
                    }
                    break;
                case -1466346578:
                case 409092655:
                    str = (String) C1929.m56563(list, i);
                    c17117M49182 = C21813.m49182(str, this.f37542);
                    if (c17117M49182 != null) {
                        iM55680 = C0946.m55979("ܳ۫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17685) ^ (-766446317);
                        i6 = -25954131;
                    } else {
                        iM55680 = (i4 - C0873.m55680("۬᩺")) * C0254q.f1218h;
                        i5 = ((iM55680 ^ i3) * 10663) ^ 911814761;
                        i6 = 1412003553;
                    }
                    break;
                case -687599841:
                case 1151287260:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("᩺ۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֫ܺ")) * (-39);
                        i5 = ((iM55680 ^ i4) * 609) ^ (-1318047227);
                        i6 = -741565161;
                    }
                    break;
                case -644120597:
                case 331765689:
                    c24109.f76527.setImageDrawable(c17117M49182);
                    C0894.m55771(c24109.f76528, str);
                    break;
                case -564896207:
                case 1350014724:
                    if (C0989.f81920 < 0) {
                        iM55680 = C0873.m55680("᩺ۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    } else {
                        iM55680 = C0946.m55979("ۛ֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    }
                    break;
                case -474936777:
                case -402685312:
                    C0873.m55678();
                    iM55680 = C0946.m55979("ۛ֡") ^ i3;
                    i5 = ((iM55680 ^ i4) * 12465) ^ 15642121;
                    i6 = 1745907213;
                    break;
                case -288098732:
                case 5082145:
                    if (C0882.f81846) {
                        iM55680 = C0946.m55979("᩷ۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        iM55680 = (C0946.m55979("۠᩵") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM55680 ^ i3) * (-18393)) ^ 777304792;
                        i6 = 1616528299;
                    }
                    break;
                case -170776168:
                case 351616255:
                    c24109 = (C24109) abstractC5462;
                    list = this.f37543;
                    if (C1024.m56209() >= 0) {
                        iM55680 = C0946.m55979("ܽۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24135) ^ (-1619247416);
                        i6 = 1876426518;
                    } else {
                        iM55680 = C0946.m55979("᩺ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-23831)) ^ 478146022;
                        i6 = 1121031925;
                    }
                    break;
                case 340972948:
                case 412104864:
                    c17117M49182.setColorFilter(C15766.m35830(C23223.f72995));
                    iM55680 = (i4 - C0873.m55680("۬᩺")) * C0254q.f1218h;
                    i5 = ((iM55680 ^ i3) * 10663) ^ 911814761;
                    i6 = 1412003553;
                    break;
                case 957780457:
                case 1277885302:
                    if (!C1048.f81963) {
                        iM55680 = C0946.m55979("ۛ֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    } else {
                        iM55680 = C0946.m55979("᩷ۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    }
                    break;
                case 1311251793:
                case 1365768213:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("᩷ۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        iM55680 = (C0946.m55979("ۧۗ") ^ i4) * (-97);
                        i5 = ((iM55680 ^ i3) * 18181) ^ (-638937999);
                        i6 = 688539207;
                    }
                    break;
                default:
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0946.m55979("ܽᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    } else {
                        iM55680 = C0946.m55979("ۡܿ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 29701) ^ (-398160064);
                        i6 = -51456659;
                    }
                    break;
            }
            return;
        }
    }

    public C13381(ActivityC15391 activityC15391) {
        boolean z = false;
        int i = -102936173;
        int i2 = C0863.f81833;
        int i3 = C1404.f82149;
        int iM55979 = C0946.m55979("ܺ۫") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-16237)) ^ (-78676878);
        int i5 = 1766585176;
        while (true) {
            i = ((((i ^ i2) * 10665) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2090721733:
                case 407622122:
                    this.f37542 = z;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0946.m55979("ۨ۫") ^ i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        iM55979 = C0946.m55979("ܺܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9339) ^ (-747652043);
                        i5 = 1872602388;
                    }
                    break;
                case -1734482502:
                case -1661392664:
                    C1194.m56396();
                    if (C0873.f81841 <= 0) {
                        iM55979 = (i2 - C0946.m55979("᩶᩶")) * 87;
                        i4 = ((iM55979 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    }
                    break;
                case -1204622577:
                case 192818359:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ۛ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        iM55979 = C0946.m55979("ᩳۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19437)) ^ (-1790701100);
                        i5 = 557841492;
                    }
                    break;
                case -1145608943:
                case -4301880:
                    this.f37543 = C21813.m49184();
                    return;
                case -1117703531:
                case 1950700995:
                    this.f37541 = activityC15391;
                    z = true;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0946.m55979("᩺۫") ^ i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 7645) ^ (-1953068042);
                        i5 = 1498519748;
                    } else {
                        iM55979 = C0946.m55979("ܳᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18303)) ^ (-729405979);
                        i5 = -1092028561;
                    }
                    break;
                case -860801645:
                case 1532403998:
                    if (C0989.m56095() <= 0) {
                        iM55979 = C0873.m55680("ۛ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۠֫")) * 65;
                        i4 = ((iM55979 ^ i2) * 12179) ^ (-279908806);
                        i5 = -394175569;
                    }
                    break;
                case -760668954:
                case 970425747:
                    if (C1048.f81963) {
                        iM55979 = C0946.m55979("᩻֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22883) ^ 1497104833;
                        i5 = -1685428297;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩶᩶")) * 87;
                        i4 = ((iM55979 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                    break;
                case -497047156:
                case 1853463070:
                    if (C0917.m55854()) {
                        iM55979 = C0873.m55680("ܿᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13325) ^ (-2118571647);
                        i5 = 1191866561;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩶᩶")) * 87;
                        i4 = ((iM55979 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                    break;
                case -446674988:
                case 1706358238:
                    C0917.m55854();
                    C0992.m56107();
                    throw new RuntimeException();
                case -406908600:
                case 378212869:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0946.m55979("ۨ۫") ^ i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۨ᩷")) * 27;
                        i4 = ((iM55979 ^ i2) * 18503) ^ 1151284618;
                        i5 = -664129744;
                    }
                    break;
                case 125323275:
                case 1791109619:
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0946.m55979("ۨ۫") ^ i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        iM55979 = (C0873.m55680("ۛۘ") ^ i2) * 39;
                        i4 = ((iM55979 ^ i3) * (-7443)) ^ (-941141174);
                        i5 = 700161928;
                    }
                    break;
                case 276740916:
                case 922563358:
                    if (C0892.f81851) {
                        iM55979 = (C0946.m55979("֨᩶") + i2) * (-71);
                        i4 = ((iM55979 ^ i3) * 24213) ^ 314877386;
                        i5 = -248028193;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩶᩶")) * 87;
                        i4 = ((iM55979 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                    break;
                case 518573991:
                case 824959322:
                    C0882.m55710();
                    iM55979 = (C0946.m55979("᩺۫") ^ i2) * (-13);
                    i4 = ((iM55979 ^ i3) * 7645) ^ (-1953068042);
                    i5 = 1498519748;
                    break;
                case 895993469:
                case 1765916339:
                    if (C1964.f83032 > 0) {
                        iM55979 = C0873.m55680("ۛ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        iM55979 = (C0946.m55979("᩺۫") ^ i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 7645) ^ (-1953068042);
                        i5 = 1498519748;
                    }
                    break;
                case 1608632533:
                case 1685181532:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i2 - C0946.m55979("᩶᩶")) * 87;
                        i4 = ((iM55979 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֫ۘ")) * (-45);
                        i4 = ((iM55979 ^ i2) * (-25933)) ^ 955802489;
                        i5 = -270430173;
                    }
                    break;
                default:
                    if (C1017.f81942 < 0) {
                        iM55979 = C0873.m55680("ۛ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        iM55979 = C0946.m55979("ۨ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 389) ^ 641384143;
                        i5 = 1221841616;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f4 A[PHI: r10 r12 r13
      0x01f4: PHI (r10v3 short) = (r10v2 short), (r10v1 short), (r10v1 short) binds: [B:54:0x01f2, B:15:0x005c, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x01f4: PHI (r12v2 short[]) = (r12v1 short[]), (r12v1 short[]), (r12v3 short[]) binds: [B:54:0x01f2, B:15:0x005c, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x01f4: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v3 int) binds: [B:54:0x01f2, B:15:0x005c, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x028b A[PHI: r6 r14 r15
      0x028b: PHI (r6v3 char) = (r6v1 char), (r6v2 char), (r6v1 char), (r6v1 char) binds: [B:70:0x0289, B:66:0x026c, B:25:0x008f, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r14v3 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v2 short[]), (r14v1 short[]) binds: [B:70:0x0289, B:66:0x026c, B:25:0x008f, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int) binds: [B:70:0x0289, B:66:0x026c, B:25:0x008f, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02bc A[PHI: r2 r7 r8 r9 r20
      0x02bc: PHI (r2v3 boolean) = (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v5 boolean) binds: [B:74:0x02ba, B:62:0x024f, B:58:0x022b, B:44:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r7v4 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:74:0x02ba, B:62:0x024f, B:58:0x022b, B:44:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r8v4 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:74:0x02ba, B:62:0x024f, B:58:0x022b, B:44:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r9v4 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:74:0x02ba, B:62:0x024f, B:58:0x022b, B:44:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r20v3 boolean) = (r20v1 boolean), (r20v1 boolean), (r20v1 boolean), (r20v5 boolean) binds: [B:74:0x02ba, B:62:0x024f, B:58:0x022b, B:44:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02ec A[PHI: r21
      0x02ec: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]), (r21v3 short[]) binds: [B:78:0x02ea, B:12:0x0054, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final void m30527() {
        int iM55680;
        int i;
        int i2;
        List listM49185;
        String strM55986;
        boolean z = false;
        List list = null;
        String str = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 654317173;
        int i9 = C0894.f81854;
        int i10 = C1124.f82007;
        int iM55979 = (C0946.m55979("ܿۤ") + i10) * 37;
        int i11 = ((iM55979 ^ i9) * (-4541)) ^ (-1841211512);
        int i12 = iM55979 ^ (-1855540446);
        short[] sArr3 = null;
        boolean z2 = false;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * 7641) >> 31));
            switch (i8) {
                case -2080048636:
                case -292556621:
                    i5 = 55413;
                    iM55680 = C0946.m55979("ܿ᩸") ^ i9;
                    i = ((iM55680 ^ i10) * 17357) ^ (-1047886975);
                    i2 = -1354138770;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1886758965:
                case 60747998:
                    C0845.m55584();
                    break;
                case -1830440886:
                case 1525842820:
                    listM49185 = C21813.m49185();
                    list = listM49185;
                    iM55680 = C0873.m55680("֨ܶ") ^ i10;
                    i = ((iM55680 ^ i9) * (-12809)) ^ (-202468491);
                    i2 = -1556231354;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1675706192:
                case 1547667726:
                    C1124.m56367();
                    C1028.m56247();
                    iM55680 = C0873.m55680("᩵ܽ") ^ i9;
                    i = ((iM55680 ^ i10) * 29031) ^ (-737112689);
                    i2 = -1897541921;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1520110211:
                case -266027127:
                    RunnableC0897.m55784();
                    if (C0898.f81858 > 0) {
                        iM55680 = (C0946.m55979("᩺֡") ^ i10) * 15;
                        i = ((iM55680 ^ i9) * 22525) ^ 70152703;
                        i2 = 294499423;
                    } else {
                        iM55680 = (C0873.m55680("ܰ᩺") ^ i10) * 83;
                        i = ((iM55680 ^ i9) * (-8437)) ^ (-2087695491);
                        i2 = 1068078379;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1354167889:
                case 1846935489:
                    s2 = 37002;
                    if (C0992.m56107() <= 0) {
                        iM55680 = (C0873.m55680("ܳۖ") ^ i9) * (-13);
                        i = ((iM55680 ^ i10) * 10085) ^ (-2017794829);
                        i2 = 1287828270;
                    } else {
                        iM55680 = (C0946.m55979("ܶۤ") ^ i10) * (-37);
                        i = ((iM55680 ^ i9) * (-8935)) ^ 1069767613;
                        i2 = -964450480;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1346396102:
                case 1309302175:
                    this.f37543 = list;
                    ViewOnClickListenerC0939.m55946(this);
                    if (this.f37542) {
                        iM55680 = C0946.m55979("᩶ۚ") ^ i10;
                        i = ((iM55680 ^ i9) * (-12837)) ^ (-2084781206);
                        i2 = 849165161;
                    } else {
                        iM55680 = (C0873.m55680("᩵ᩳ") ^ i9) * (-43);
                        i = ((iM55680 ^ i10) * 24759) ^ (-546455474);
                        i2 = 1946069187;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1085025259:
                case 1233997456:
                    this.f37542 = z2 ^ z;
                    if (z2) {
                        iM55680 = C0873.m55680("ܺۘ") ^ i9;
                        i = ((iM55680 ^ i10) * 10159) ^ 893990382;
                        i2 = 530404349;
                    } else {
                        iM55680 = (C0946.m55979("ۨ᩻") ^ i9) * (-65);
                        i = ((iM55680 ^ i10) * (-7083)) ^ 1663958255;
                        i2 = -697211499;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1036456429:
                case 1565598361:
                    listM49185 = C21813.m49184();
                    list = listM49185;
                    iM55680 = C0873.m55680("֨ܶ") ^ i10;
                    i = ((iM55680 ^ i9) * (-12809)) ^ (-202468491);
                    i2 = -1556231354;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1027379591:
                case -624304747:
                    C1025.m56228(str);
                    break;
                case -790685537:
                case 574995155:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("ܰ᩺") ^ i10) * 83;
                        i = ((iM55680 ^ i9) * (-8437)) ^ (-2087695491);
                        i2 = 1068078379;
                    } else {
                        iM55680 = C0873.m55680("۠ۖ") ^ i9;
                        i = ((iM55680 ^ i10) * (-19931)) ^ (-615236461);
                        i2 = -1335952845;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -706680917:
                case -692915892:
                    if (C1036.f81953 < 0) {
                        iM55680 = C0873.m55680("᩵ܽ") ^ i9;
                        i = ((iM55680 ^ i10) * 29031) ^ (-737112689);
                        i2 = -1897541921;
                    } else {
                        iM55680 = (C0946.m55979("᩺֡") ^ i10) * 15;
                        i = ((iM55680 ^ i9) * 22525) ^ 70152703;
                        i2 = 294499423;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -705125467:
                case -142590833:
                    C0946.m55980();
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0873.m55680("᩵ܽ") ^ i9;
                        i = ((iM55680 ^ i10) * 29031) ^ (-737112689);
                        i2 = -1897541921;
                    } else {
                        iM55680 = (C0873.m55680("ܳۖ") ^ i9) * (-13);
                        i = ((iM55680 ^ i10) * 10085) ^ (-2017794829);
                        i2 = 1287828270;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -662728210:
                case -627244983:
                    sArr3 = f82155;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0946.m55979("᩺֡") ^ i10) * 15;
                        i = ((iM55680 ^ i9) * 22525) ^ 70152703;
                        i2 = 294499423;
                    } else {
                        iM55680 = C0873.m55680("ۗᩴ") ^ i10;
                        i = ((iM55680 ^ i9) * (-1671)) ^ 1933539263;
                        i2 = -1023067437;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -542564326:
                case 1795912014:
                    sArr2 = f82155;
                    i7 = 19;
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("ܰ᩺") ^ i10) * 83;
                        i = ((iM55680 ^ i9) * (-8437)) ^ (-2087695491);
                        i2 = 1068078379;
                    } else {
                        iM55680 = (i9 - C0946.m55979("᩻ܳ")) * (-19);
                        i = ((iM55680 ^ i10) * 12359) ^ (-1278485289);
                        i2 = -31929771;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -459137884:
                case 573670686:
                    boolean z3 = this.f37542;
                    if (C0854.f81826 != 0) {
                        z2 = z3;
                        z = true;
                        iM55680 = C0873.m55680("᩶۠") ^ i9;
                        i = ((iM55680 ^ i10) * (-28333)) ^ 1659068040;
                        i2 = 2103411146;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    } else {
                        int iM55681 = (C0873.m55680("ۢܶ") + i10) * (-17);
                        z2 = z3;
                        i11 = ((iM55681 ^ i9) * 20467) ^ (-197142303);
                        i12 = iM55681 ^ 1992653557;
                        z = true;
                    }
                    break;
                case 71034056:
                case 754750888:
                    i4 = i3 + 342287001;
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("᩶۠") ^ i9;
                        i = ((iM55680 ^ i10) * (-28333)) ^ 1659068040;
                        i2 = 2103411146;
                    } else {
                        iM55680 = (i10 - C0946.m55979("֫᩶")) * 73;
                        i = ((iM55680 ^ i9) * (-29163)) ^ (-1397060185);
                        i2 = -898929331;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 170245869:
                case 775091449:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("᩶۠") ^ i9;
                        i = ((iM55680 ^ i10) * (-28333)) ^ 1659068040;
                        i2 = 2103411146;
                    } else {
                        iM55680 = C0873.m55680("ᩴۜ") ^ i9;
                        i = ((iM55680 ^ i10) * (-27649)) ^ 1893677670;
                        i2 = 1571039006;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 616459380:
                case 2138549818:
                    strM55986 = C0946.m55986(sArr, i6, 8, i5);
                    str = strM55986;
                    iM55680 = C0873.m55680("ۙ᩻") ^ i10;
                    i = ((iM55680 ^ i9) * (-1835)) ^ (-1139905728);
                    i2 = 804561132;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 1025909932:
                case 1839004375:
                    c = '\n';
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("ܰ᩺") ^ i10) * 83;
                        i = ((iM55680 ^ i9) * (-8437)) ^ (-2087695491);
                        i2 = 1068078379;
                    } else {
                        iM55680 = (C0873.m55680("֡ۨ") + i10) * (-107);
                        i = ((iM55680 ^ i9) * (-5803)) ^ 1139332761;
                        i2 = -1931602503;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 1166863645:
                case 1433910319:
                    s = sArr3[c];
                    i3 = s * s;
                    if (C0912.m55833()) {
                        iM55680 = C0873.m55680("᩶۠") ^ i9;
                        i = ((iM55680 ^ i10) * (-28333)) ^ 1659068040;
                        i2 = 2103411146;
                    } else {
                        iM55680 = C0873.m55680("ᩴۨ") ^ i9;
                        i = ((iM55680 ^ i10) * 5565) ^ 2114485058;
                        i2 = -1992238251;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 1272257944:
                case 1395173383:
                    i5 = 43310;
                    iM55680 = C0946.m55979("ܿ᩸") ^ i9;
                    i = ((iM55680 ^ i10) * 17357) ^ (-1047886975);
                    i2 = -1354138770;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 1679125428:
                case 1886650003:
                    if (i4 - (s * s2) < 0) {
                        iM55680 = C0873.m55680("֡ۗ") ^ i10;
                        i = ((iM55680 ^ i9) * 21077) ^ 472336447;
                        i2 = 62416306;
                    } else {
                        iM55680 = C0946.m55979("֫ۤ") ^ i9;
                        i = ((iM55680 ^ i10) * 5737) ^ 1336827104;
                        i2 = -961696152;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 1937557849:
                case 2119025832:
                    strM55986 = C0992.m56102(sArr2, i7, 6, i5);
                    str = strM55986;
                    iM55680 = C0873.m55680("ۙ᩻") ^ i10;
                    i = ((iM55680 ^ i9) * (-1835)) ^ (-1139905728);
                    i2 = 804561132;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                default:
                    sArr = f82155;
                    i6 = 11;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("ܳۖ") ^ i9) * (-13);
                        i = ((iM55680 ^ i10) * 10085) ^ (-2017794829);
                        i2 = 1287828270;
                    } else {
                        iM55680 = (C0946.m55979("᩺ܳ") ^ i10) * (-99);
                        i = ((iM55680 ^ i9) * (-4801)) ^ (-31581777);
                        i2 = 1617373122;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return C1048.m56303(this.f37543);
    }
}
