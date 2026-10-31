package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 77J6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11587 extends AbstractC19902 {

    /* JADX INFO: renamed from: ܽ֫ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f34542 = {8014, -23072, -31776, -23643, 21543, 17250, 24159, 16405, -19787, -16738, 3757, -22175, -22181, -22182, -22206, -22201, -22208, -22197, -22198, -22168, -22201, -22206, -22206, -22197, -22198};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ActivityC13702 f34543;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f34544;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f34545;

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        short[] sArr;
        int iM2566;
        int i2;
        int iM2567;
        int i3;
        int i4;
        short s;
        LayoutInflater layoutInflater;
        int iM6981;
        int i5;
        int i6;
        int i7 = 34072591;
        int i8 = C0483.f2088;
        int i9 = RunnableC0588.f2309;
        int iM2568 = (i8 - C0630.m2566("᩵ۨ")) * (-103);
        int i10 = ((iM2568 ^ i9) * 5095) ^ 1534488043;
        int i11 = iM2568 ^ (-1555664102);
        String strM11225 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        LayoutInflater layoutInflaterFrom = null;
        int iM2569 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        ImageView imageView = null;
        C22875 c22875 = null;
        View viewInflate = null;
        int iM25610 = 0;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * (-9011)) >> 31));
            switch (i7) {
                case -1910318224:
                case -1168306976:
                    c22875.f73796 = imageView;
                    sArr5 = f34542;
                    i13 = 7;
                    if (C1773.f6144 > 0) {
                        iM6981 = (i8 - C2105.m6981("۟ܳ")) * 95;
                        i5 = ((iM6981 ^ i9) * (-16401)) ^ (-783327277);
                        i6 = -874426118;
                        i11 = iM6981 ^ i6;
                        i10 = i5;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        s = s2;
                        iM2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2566 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                case -1868675198:
                case -1123814048:
                    RunnableC0588.m2441();
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = s2;
                    iM2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                    s2 = s;
                    i10 = ((iM2566 ^ i9) * 17573) ^ 704786823;
                    i2 = -1466304249;
                    layoutInflater = layoutInflaterFrom;
                    i11 = iM2566 ^ i2;
                    layoutInflaterFrom = layoutInflater;
                    break;
                case -1784779420:
                case 1850815240:
                    viewInflate = layoutInflaterFrom.inflate(iM25610, viewGroup, false);
                    c22875 = new C22875(viewInflate);
                    sArr4 = f34542;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2567 = (i9 - C2105.m6981("ܳ᩺")) * 25;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i3 = ((iM2567 ^ i8) * (-705)) ^ 1977852656;
                        i4 = -1485850282;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2567 ^ i4;
                        i10 = i3;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        sArr = sArr2;
                        int iM6982 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM6982 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM6982 ^ 1646500092;
                    }
                    break;
                case -1768313280:
                case -1248607417:
                    C0964.m3413();
                    if (C4263.m12819() >= 0) {
                        sArr = sArr2;
                        int iM6983 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM6983 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM6983 ^ 1646500092;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        s = s2;
                        iM2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2566 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                case -1722590614:
                case 1683179448:
                    layoutInflaterFrom = layoutInflaterFrom;
                    sArr = f34542;
                    if (C1773.f6144 > 0) {
                        iM2566 = C0630.m2566("ܶ᩸") ^ i9;
                        sArr2 = sArr;
                        i10 = ((iM2566 ^ i8) * 597) ^ 1373867854;
                        i2 = 1282311878;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2566 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        int iM6984 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM6984 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM6984 ^ 1646500092;
                    }
                    break;
                case -1640229229:
                case -251486655:
                    layoutInflaterFrom = LayoutInflater.from(this.f34543);
                    sArr3 = f34542;
                    i18 = 3;
                    if (C2105.m6982() != 0) {
                        sArr = sArr2;
                        i15 = 1;
                        int iM6985 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM6985 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM6985 ^ 1646500092;
                    } else {
                        int iM25611 = (C0630.m2566("ۛۘ") ^ i8) * 51;
                        int i19 = ((iM25611 ^ i9) * 879) ^ 1400454448;
                        i11 = iM25611 ^ 107810126;
                        i10 = i19;
                        i15 = 1;
                    }
                    break;
                case -1556234773:
                case -1318575551:
                    C1711.m5736();
                    RunnableC1108.m3790();
                    return null;
                case -1528544470:
                case -1295211809:
                    if (C1294.m4372() > 0) {
                        iM6981 = (i9 - C2105.m6981("۟᩺")) * 63;
                        i5 = ((iM6981 ^ i8) * 19789) ^ (-884421052);
                        i6 = 1917932172;
                    } else {
                        iM6981 = (i8 - C0630.m2566("ۙۧ")) * 31;
                        i5 = ((iM6981 ^ i9) * 25067) ^ 1139122449;
                        i6 = -772838464;
                    }
                    i11 = iM6981 ^ i6;
                    i10 = i5;
                    break;
                case -1360253026:
                case 876780955:
                    strM11225 = C3683.m11225(sArr4, 4, 3, i14);
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C2105.m6981("ܰᩴ") + i9) * 109;
                        i5 = ((iM6981 ^ i8) * 29987) ^ (-1423716567);
                        i6 = 578379176;
                    } else {
                        iM6981 = (C2105.m6981("۬ܶ") ^ i8) * 23;
                        i5 = ((iM6981 ^ i9) * 29749) ^ 140282619;
                        i6 = 1806359949;
                    }
                    i11 = iM6981 ^ i6;
                    i10 = i5;
                    break;
                case -1307760413:
                case -711621781:
                    layoutInflaterFrom = layoutInflaterFrom;
                    s2 = sArr2[0];
                    if (C1128.f4106 > 0) {
                        iM2567 = C0630.m2566("ۧۙ") ^ i8;
                        i3 = ((iM2567 ^ i9) * 8049) ^ 1048152478;
                        i4 = -205055281;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2567 ^ i4;
                        i10 = i3;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        sArr = sArr2;
                        layoutInflaterFrom = layoutInflaterFrom;
                        int iM6986 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM6986 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM6986 ^ 1646500092;
                    }
                    break;
                case -973332431:
                case 656595646:
                    c22875.f73797 = (TextView) C1005.m3507(viewInflate, iM2569 ^ i12);
                    return c22875;
                case -856057509:
                case 2077877963:
                    layoutInflaterFrom = layoutInflaterFrom;
                    if ((i17 + 93857344) - i16 < 0) {
                        iM2567 = (C2105.m6981("ܽ۠") + i8) * 115;
                        i3 = ((iM2567 ^ i9) * 24371) ^ 761753804;
                        i4 = -1782450103;
                    } else {
                        iM2567 = (i9 - C0630.m2566("ۡۨ")) * q.h;
                        i3 = ((iM2567 ^ i8) * (-6149)) ^ (-1992615798);
                        i4 = 1385754823;
                    }
                    layoutInflater = layoutInflaterFrom;
                    i11 = iM2567 ^ i4;
                    i10 = i3;
                    layoutInflaterFrom = layoutInflater;
                    break;
                case -768210599:
                case 1738232450:
                    imageView = (ImageView) C1005.m3507(viewInflate, C2105.m6981(strM11225) ^ 2097659380);
                    if (C5695.f17556 < 0) {
                        iM6981 = C2105.m6981("ܽ᩺") ^ i9;
                        i5 = ((iM6981 ^ i8) * 21241) ^ 123506041;
                        i6 = 400154114;
                        i11 = iM6981 ^ i6;
                        i10 = i5;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        s = s2;
                        iM2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2566 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                case -725371893:
                case -337212714:
                    if (!C3663.f11553) {
                        sArr = sArr2;
                        int iM6987 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM6987 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM6987 ^ 1646500092;
                    } else {
                        iM6981 = (i9 - C2105.m6981("۟᩺")) * 63;
                        i5 = ((iM6981 ^ i8) * 19789) ^ (-884421052);
                        i6 = 1917932172;
                        i11 = iM6981 ^ i6;
                        i10 = i5;
                    }
                    break;
                case -703591457:
                case 1920476404:
                    layoutInflaterFrom = layoutInflaterFrom;
                    int i20 = i18;
                    iM25610 = 2126894844 ^ C0630.m2566(ServiceConnectionC3453.m10568(sArr3, i15, i20, i14));
                    if (C1294.f4556 < 0) {
                        iM2566 = C0630.m2566("ܿ֨") ^ i9;
                        i18 = i20;
                        i10 = ((iM2566 ^ i8) * 11875) ^ (-1077062173);
                        i2 = -139842834;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2566 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        i18 = i20;
                        layoutInflaterFrom = layoutInflaterFrom;
                        sArr = sArr2;
                        int iM6988 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((iM6988 ^ i9) * (-485)) ^ (-275138685);
                        i11 = iM6988 ^ 1646500092;
                    }
                    break;
                case -490219686:
                case 103441195:
                    iM2569 = C0630.m2566(C0483.m2128(sArr5, i13, 3, i14));
                    i12 = 2101233296;
                    if (C1294.f4556 < 0) {
                        iM6981 = C2105.m6981("ۡۧ") ^ i9;
                        i5 = ((iM6981 ^ i8) * 7257) ^ (-1396371851);
                        i6 = -1093011145;
                        i11 = iM6981 ^ i6;
                        i10 = i5;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        s = s2;
                        iM2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2566 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                case -134407220:
                case 2100865455:
                    i14 = 54040;
                    iM2566 = C0630.m2566("۫ۢ") ^ i9;
                    i10 = ((iM2566 ^ i8) * 26087) ^ 1011228079;
                    i2 = 1761197241;
                    layoutInflater = layoutInflaterFrom;
                    i11 = iM2566 ^ i2;
                    layoutInflaterFrom = layoutInflater;
                    break;
                case 753176606:
                case 1767573278:
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = s2;
                    int i21 = s * 19376;
                    i17 = s * s;
                    if (C3746.m11369() < 0) {
                        s2 = s;
                        iM2567 = C2105.m6981("ۗ۠") ^ i8;
                        i16 = i21;
                        i3 = ((iM2567 ^ i9) * 25359) ^ 1818365851;
                        i4 = 333059505;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2567 ^ i4;
                        i10 = i3;
                        layoutInflaterFrom = layoutInflater;
                    } else {
                        i16 = i21;
                        iM2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((iM2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater = layoutInflaterFrom;
                        i11 = iM2566 ^ i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    break;
                default:
                    i14 = 52187;
                    iM2566 = C0630.m2566("۫ۢ") ^ i9;
                    i10 = ((iM2566 ^ i8) * 26087) ^ 1011228079;
                    i2 = 1761197241;
                    layoutInflater = layoutInflaterFrom;
                    i11 = iM2566 ^ i2;
                    layoutInflaterFrom = layoutInflater;
                    break;
            }
        }
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C22875 c22875 = null;
        List list = null;
        String str = null;
        C15518 c15518M46859 = null;
        int i2 = 441538440;
        int i3 = C3911.f12484;
        int i4 = C0630.f2410;
        int iM2566 = C0630.m2566("᩹֡") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-3869)) ^ (-1259797156);
        int i6 = -995219087;
        while (true) {
            i2 = ((((i2 ^ i4) * (-29065)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2013108702:
                case 53440574:
                    if (C0964.m3413()) {
                        iM2566 = C0630.m2566("ۖۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-16457)) ^ (-1418277279);
                        i6 = -756145466;
                    } else {
                        iM2566 = C0630.m2566("᩺ۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    }
                    break;
                case -2007099584:
                case -1539149260:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        iM2566 = C0630.m2566("ۛᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-6385)) ^ (-156213838);
                        i6 = -1463036483;
                    }
                    break;
                case -1993064899:
                case -799676722:
                    C2520.m8026();
                    if (C0630.f2410 > 0) {
                        iM2566 = C2105.m6981("ܽᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    } else {
                        iM2566 = C0630.m2566("᩺ۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    }
                    break;
                case -1976159635:
                case 519090727:
                    if (C0050.m940() <= 0) {
                        iM2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        iM2566 = C2105.m6981("ۛۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 23911) ^ (-2112693430);
                        i6 = 865106300;
                    }
                    break;
                case -1896639938:
                case 1191927762:
                    C0714.m2805();
                    break;
                case -1585549913:
                case 437071622:
                    if (C2167.m7155()) {
                        iM2566 = C2105.m6981("ۛ֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    } else {
                        iM2566 = (C2105.m6981("ۚ֨") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM2566 ^ i3) * 11089) ^ 118285058;
                        i6 = -1538978693;
                    }
                    break;
                case -1536636138:
                case -713849841:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ܽᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    } else {
                        iM2566 = C0630.m2566("۟᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29471)) ^ 921606029;
                        i6 = 322035956;
                    }
                    break;
                case -1466346578:
                case 409092655:
                    str = (String) C21923.m49339(list, i);
                    c15518M46859 = C20459.m46859(str, this.f34544);
                    if (c15518M46859 != null) {
                        iM2566 = C2105.m6981("ܳ۫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17685) ^ (-766446317);
                        i6 = -25954131;
                    } else {
                        iM2566 = (i4 - C0630.m2566("۬᩺")) * q.h;
                        i5 = ((iM2566 ^ i3) * 10663) ^ 911814761;
                        i6 = 1412003553;
                    }
                    break;
                case -687599841:
                case 1151287260:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("᩺ۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֫ܺ")) * (-39);
                        i5 = ((iM2566 ^ i4) * 609) ^ (-1318047227);
                        i6 = -741565161;
                    }
                    break;
                case -644120597:
                case 331765689:
                    c22875.f73796.setImageDrawable(c15518M46859);
                    C1047.m3601(c22875.f73797, str);
                    break;
                case -564896207:
                case 1350014724:
                    if (C2958.f9394 < 0) {
                        iM2566 = C0630.m2566("᩺ۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    } else {
                        iM2566 = C2105.m6981("ۛ֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    }
                    break;
                case -474936777:
                case -402685312:
                    C0630.m2564();
                    iM2566 = C2105.m6981("ۛ֡") ^ i3;
                    i5 = ((iM2566 ^ i4) * 12465) ^ 15642121;
                    i6 = 1745907213;
                    break;
                case -288098732:
                case 5082145:
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        iM2566 = (C2105.m6981("۠᩵") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM2566 ^ i3) * (-18393)) ^ 777304792;
                        i6 = 1616528299;
                    }
                    break;
                case -170776168:
                case 351616255:
                    c22875 = (C22875) abstractC3255;
                    list = this.f34545;
                    if (C3663.m11168() >= 0) {
                        iM2566 = C2105.m6981("ܽۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 24135) ^ (-1619247416);
                        i6 = 1876426518;
                    } else {
                        iM2566 = C2105.m6981("᩺ۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-23831)) ^ 478146022;
                        i6 = 1121031925;
                    }
                    break;
                case 340972948:
                case 412104864:
                    c15518M46859.setColorFilter(C14096.m33704(C21943.f70284));
                    iM2566 = (i4 - C0630.m2566("۬᩺")) * q.h;
                    i5 = ((iM2566 ^ i3) * 10663) ^ 911814761;
                    i6 = 1412003553;
                    break;
                case 957780457:
                case 1277885302:
                    if (!C4159.f13567) {
                        iM2566 = C2105.m6981("ۛ֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    } else {
                        iM2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    }
                    break;
                case 1311251793:
                case 1365768213:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        iM2566 = (C2105.m6981("ۧۗ") ^ i4) * (-97);
                        i5 = ((iM2566 ^ i3) * 18181) ^ (-638937999);
                        i6 = 688539207;
                    }
                    break;
                default:
                    if (C0237.m1481() >= 0) {
                        iM2566 = C2105.m6981("ܽᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    } else {
                        iM2566 = C2105.m6981("ۡܿ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 29701) ^ (-398160064);
                        i6 = -51456659;
                    }
                    break;
            }
            return;
        }
    }

    public C11587(ActivityC13702 activityC13702) {
        boolean z = false;
        int i = -102936173;
        int i2 = C0422.f1886;
        int i3 = C11340.f33930;
        int iM6981 = C2105.m6981("ܺ۫") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-16237)) ^ (-78676878);
        int i5 = 1766585176;
        while (true) {
            i = ((((i ^ i2) * 10665) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2090721733:
                case 407622122:
                    this.f34544 = z;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ۨ۫") ^ i3) * (-19);
                        i4 = ((iM6981 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        iM6981 = C2105.m6981("ܺܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9339) ^ (-747652043);
                        i5 = 1872602388;
                    }
                    break;
                case -1734482502:
                case -1661392664:
                    C7106.m19120();
                    if (C0630.f2410 <= 0) {
                        iM6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((iM6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    }
                    break;
                case -1204622577:
                case 192818359:
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        iM6981 = C2105.m6981("ᩳۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-19437)) ^ (-1790701100);
                        i5 = 557841492;
                    }
                    break;
                case -1145608943:
                case -4301880:
                    this.f34545 = C20459.m46861();
                    return;
                case -1117703531:
                case 1950700995:
                    this.f34543 = activityC13702;
                    z = true;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C2105.m6981("᩺۫") ^ i2) * (-13);
                        i4 = ((iM6981 ^ i3) * 7645) ^ (-1953068042);
                        i5 = 1498519748;
                    } else {
                        iM6981 = C2105.m6981("ܳᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18303)) ^ (-729405979);
                        i5 = -1092028561;
                    }
                    break;
                case -860801645:
                case 1532403998:
                    if (C2958.m9034() <= 0) {
                        iM6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۠֫")) * 65;
                        i4 = ((iM6981 ^ i2) * 12179) ^ (-279908806);
                        i5 = -394175569;
                    }
                    break;
                case -760668954:
                case 970425747:
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("᩻֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22883) ^ 1497104833;
                        i5 = -1685428297;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((iM6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                    break;
                case -497047156:
                case 1853463070:
                    if (C1504.m5179()) {
                        iM6981 = C0630.m2566("ܿᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13325) ^ (-2118571647);
                        i5 = 1191866561;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((iM6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                    break;
                case -446674988:
                case 1706358238:
                    C1504.m5179();
                    C3019.m9255();
                    throw new RuntimeException();
                case -406908600:
                case 378212869:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C2105.m6981("ۨ۫") ^ i3) * (-19);
                        i4 = ((iM6981 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۨ᩷")) * 27;
                        i4 = ((iM6981 ^ i2) * 18503) ^ 1151284618;
                        i5 = -664129744;
                    }
                    break;
                case 125323275:
                case 1791109619:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("ۨ۫") ^ i3) * (-19);
                        i4 = ((iM6981 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        iM6981 = (C0630.m2566("ۛۘ") ^ i2) * 39;
                        i4 = ((iM6981 ^ i3) * (-7443)) ^ (-941141174);
                        i5 = 700161928;
                    }
                    break;
                case 276740916:
                case 922563358:
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("֨᩶") + i2) * (-71);
                        i4 = ((iM6981 ^ i3) * 24213) ^ 314877386;
                        i5 = -248028193;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((iM6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                    break;
                case 518573991:
                case 824959322:
                    C0798.m2998();
                    iM6981 = (C2105.m6981("᩺۫") ^ i2) * (-13);
                    i4 = ((iM6981 ^ i3) * 7645) ^ (-1953068042);
                    i5 = 1498519748;
                    break;
                case 895993469:
                case 1765916339:
                    if (C22628.f73083 > 0) {
                        iM6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        iM6981 = (C2105.m6981("᩺۫") ^ i2) * (-13);
                        i4 = ((iM6981 ^ i3) * 7645) ^ (-1953068042);
                        i5 = 1498519748;
                    }
                    break;
                case 1608632533:
                case 1685181532:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((iM6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    } else {
                        iM6981 = (i3 - C0630.m2566("֫ۘ")) * (-45);
                        i4 = ((iM6981 ^ i2) * (-25933)) ^ 955802489;
                        i5 = -270430173;
                    }
                    break;
                default:
                    if (C3537.f11231 < 0) {
                        iM6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        iM6981 = C2105.m6981("ۨ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 389) ^ 641384143;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28481() {
        int iM2566;
        int i;
        int i2;
        List listM46862;
        String strM6988;
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
        int i9 = C1047.f3863;
        int i10 = C5695.f17556;
        int iM6981 = (C2105.m6981("ܿۤ") + i10) * 37;
        int i11 = ((iM6981 ^ i9) * (-4541)) ^ (-1841211512);
        int i12 = iM6981 ^ (-1855540446);
        short[] sArr3 = null;
        boolean z2 = false;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * 7641) >> 31));
            switch (i8) {
                case -2080048636:
                case -292556621:
                    i5 = 55413;
                    iM2566 = C2105.m6981("ܿ᩸") ^ i9;
                    i = ((iM2566 ^ i10) * 17357) ^ (-1047886975);
                    i2 = -1354138770;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1886758965:
                case 60747998:
                    C0050.m940();
                    break;
                case -1830440886:
                case 1525842820:
                    listM46862 = C20459.m46862();
                    list = listM46862;
                    iM2566 = C0630.m2566("֨ܶ") ^ i10;
                    i = ((iM2566 ^ i9) * (-12809)) ^ (-202468491);
                    i2 = -1556231354;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1675706192:
                case 1547667726:
                    C5695.m16023();
                    C3746.m11369();
                    iM2566 = C0630.m2566("᩵ܽ") ^ i9;
                    i = ((iM2566 ^ i10) * 29031) ^ (-737112689);
                    i2 = -1897541921;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1520110211:
                case -266027127:
                    RunnableC1108.m3790();
                    if (C1128.f4106 > 0) {
                        iM2566 = (C2105.m6981("᩺֡") ^ i10) * 15;
                        i = ((iM2566 ^ i9) * 22525) ^ 70152703;
                        i2 = 294499423;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩺") ^ i10) * 83;
                        i = ((iM2566 ^ i9) * (-8437)) ^ (-2087695491);
                        i2 = 1068078379;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1354167889:
                case 1846935489:
                    s2 = 37002;
                    if (C3019.m9255() <= 0) {
                        iM2566 = (C0630.m2566("ܳۖ") ^ i9) * (-13);
                        i = ((iM2566 ^ i10) * 10085) ^ (-2017794829);
                        i2 = 1287828270;
                    } else {
                        iM2566 = (C2105.m6981("ܶۤ") ^ i10) * (-37);
                        i = ((iM2566 ^ i9) * (-8935)) ^ 1069767613;
                        i2 = -964450480;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1346396102:
                case 1309302175:
                    this.f34545 = list;
                    ViewOnClickListenerC1958.m6434(this);
                    if (this.f34544) {
                        iM2566 = C2105.m6981("᩶ۚ") ^ i10;
                        i = ((iM2566 ^ i9) * (-12837)) ^ (-2084781206);
                        i2 = 849165161;
                    } else {
                        iM2566 = (C0630.m2566("᩵ᩳ") ^ i9) * (-43);
                        i = ((iM2566 ^ i10) * 24759) ^ (-546455474);
                        i2 = 1946069187;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1085025259:
                case 1233997456:
                    this.f34544 = z2 ^ z;
                    if (z2) {
                        iM2566 = C0630.m2566("ܺۘ") ^ i9;
                        i = ((iM2566 ^ i10) * 10159) ^ 893990382;
                        i2 = 530404349;
                    } else {
                        iM2566 = (C2105.m6981("ۨ᩻") ^ i9) * (-65);
                        i = ((iM2566 ^ i10) * (-7083)) ^ 1663958255;
                        i2 = -697211499;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1036456429:
                case 1565598361:
                    listM46862 = C20459.m46861();
                    list = listM46862;
                    iM2566 = C0630.m2566("֨ܶ") ^ i10;
                    i = ((iM2566 ^ i9) * (-12809)) ^ (-202468491);
                    i2 = -1556231354;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1027379591:
                case -624304747:
                    C3683.m11220(str);
                    break;
                case -790685537:
                case 574995155:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C0630.m2566("ܰ᩺") ^ i10) * 83;
                        i = ((iM2566 ^ i9) * (-8437)) ^ (-2087695491);
                        i2 = 1068078379;
                    } else {
                        iM2566 = C0630.m2566("۠ۖ") ^ i9;
                        i = ((iM2566 ^ i10) * (-19931)) ^ (-615236461);
                        i2 = -1335952845;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -706680917:
                case -692915892:
                    if (C3911.f12484 < 0) {
                        iM2566 = C0630.m2566("᩵ܽ") ^ i9;
                        i = ((iM2566 ^ i10) * 29031) ^ (-737112689);
                        i2 = -1897541921;
                    } else {
                        iM2566 = (C2105.m6981("᩺֡") ^ i10) * 15;
                        i = ((iM2566 ^ i9) * 22525) ^ 70152703;
                        i2 = 294499423;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -705125467:
                case -142590833:
                    C2105.m6982();
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("᩵ܽ") ^ i9;
                        i = ((iM2566 ^ i10) * 29031) ^ (-737112689);
                        i2 = -1897541921;
                    } else {
                        iM2566 = (C0630.m2566("ܳۖ") ^ i9) * (-13);
                        i = ((iM2566 ^ i10) * 10085) ^ (-2017794829);
                        i2 = 1287828270;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -662728210:
                case -627244983:
                    sArr3 = f34542;
                    if (C2105.f7037 != 0) {
                        iM2566 = (C2105.m6981("᩺֡") ^ i10) * 15;
                        i = ((iM2566 ^ i9) * 22525) ^ 70152703;
                        i2 = 294499423;
                    } else {
                        iM2566 = C0630.m2566("ۗᩴ") ^ i10;
                        i = ((iM2566 ^ i9) * (-1671)) ^ 1933539263;
                        i2 = -1023067437;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -542564326:
                case 1795912014:
                    sArr2 = f34542;
                    i7 = 19;
                    if (C3663.f11553) {
                        iM2566 = (C0630.m2566("ܰ᩺") ^ i10) * 83;
                        i = ((iM2566 ^ i9) * (-8437)) ^ (-2087695491);
                        i2 = 1068078379;
                    } else {
                        iM2566 = (i9 - C2105.m6981("᩻ܳ")) * (-19);
                        i = ((iM2566 ^ i10) * 12359) ^ (-1278485289);
                        i2 = -31929771;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -459137884:
                case 573670686:
                    boolean z3 = this.f34544;
                    if (C0237.f1507 != 0) {
                        z2 = z3;
                        z = true;
                        iM2566 = C0630.m2566("᩶۠") ^ i9;
                        i = ((iM2566 ^ i10) * (-28333)) ^ 1659068040;
                        i2 = 2103411146;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    } else {
                        int iM2567 = (C0630.m2566("ۢܶ") + i10) * (-17);
                        z2 = z3;
                        i11 = ((iM2567 ^ i9) * 20467) ^ (-197142303);
                        i12 = iM2567 ^ 1992653557;
                        z = true;
                    }
                    break;
                case 71034056:
                case 754750888:
                    i4 = i3 + 342287001;
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("᩶۠") ^ i9;
                        i = ((iM2566 ^ i10) * (-28333)) ^ 1659068040;
                        i2 = 2103411146;
                    } else {
                        iM2566 = (i10 - C2105.m6981("֫᩶")) * 73;
                        i = ((iM2566 ^ i9) * (-29163)) ^ (-1397060185);
                        i2 = -898929331;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 170245869:
                case 775091449:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("᩶۠") ^ i9;
                        i = ((iM2566 ^ i10) * (-28333)) ^ 1659068040;
                        i2 = 2103411146;
                    } else {
                        iM2566 = C0630.m2566("ᩴۜ") ^ i9;
                        i = ((iM2566 ^ i10) * (-27649)) ^ 1893677670;
                        i2 = 1571039006;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 616459380:
                case 2138549818:
                    strM6988 = C2105.m6988(sArr, i6, 8, i5);
                    str = strM6988;
                    iM2566 = C0630.m2566("ۙ᩻") ^ i10;
                    i = ((iM2566 ^ i9) * (-1835)) ^ (-1139905728);
                    i2 = 804561132;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 1025909932:
                case 1839004375:
                    c = '\n';
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (C0630.m2566("ܰ᩺") ^ i10) * 83;
                        i = ((iM2566 ^ i9) * (-8437)) ^ (-2087695491);
                        i2 = 1068078379;
                    } else {
                        iM2566 = (C0630.m2566("֡ۨ") + i10) * (-107);
                        i = ((iM2566 ^ i9) * (-5803)) ^ 1139332761;
                        i2 = -1931602503;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 1166863645:
                case 1433910319:
                    s = sArr3[c];
                    i3 = s * s;
                    if (C1420.m4913()) {
                        iM2566 = C0630.m2566("᩶۠") ^ i9;
                        i = ((iM2566 ^ i10) * (-28333)) ^ 1659068040;
                        i2 = 2103411146;
                    } else {
                        iM2566 = C0630.m2566("ᩴۨ") ^ i9;
                        i = ((iM2566 ^ i10) * 5565) ^ 2114485058;
                        i2 = -1992238251;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 1272257944:
                case 1395173383:
                    i5 = 43310;
                    iM2566 = C2105.m6981("ܿ᩸") ^ i9;
                    i = ((iM2566 ^ i10) * 17357) ^ (-1047886975);
                    i2 = -1354138770;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 1679125428:
                case 1886650003:
                    if (i4 - (s * s2) < 0) {
                        iM2566 = C0630.m2566("֡ۗ") ^ i10;
                        i = ((iM2566 ^ i9) * 21077) ^ 472336447;
                        i2 = 62416306;
                    } else {
                        iM2566 = C2105.m6981("֫ۤ") ^ i9;
                        i = ((iM2566 ^ i10) * 5737) ^ 1336827104;
                        i2 = -961696152;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 1937557849:
                case 2119025832:
                    strM6988 = C3019.m9250(sArr2, i7, 6, i5);
                    str = strM6988;
                    iM2566 = C0630.m2566("ۙ᩻") ^ i10;
                    i = ((iM2566 ^ i9) * (-1835)) ^ (-1139905728);
                    i2 = 804561132;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                default:
                    sArr = f34542;
                    i6 = 11;
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("ܳۖ") ^ i9) * (-13);
                        i = ((iM2566 ^ i10) * 10085) ^ (-2017794829);
                        i2 = 1287828270;
                    } else {
                        iM2566 = (C2105.m6981("᩺ܳ") ^ i10) * (-99);
                        i = ((iM2566 ^ i9) * (-4801)) ^ (-31581777);
                        i2 = 1617373122;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return C4159.m12563(this.f34545);
    }
}
