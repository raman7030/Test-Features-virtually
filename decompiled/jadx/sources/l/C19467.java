package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.style.ReplacementSpan;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩵۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes4.dex */
public final class C19467 extends ReplacementSpan {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Paint f62942;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Path f62943;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iM4384 = 0;
        float fM16015 = 0.0f;
        int iM1484 = 0;
        int iM4385 = 0;
        int iRound = 0;
        Paint.FontMetricsInt fontMetricsInt2 = null;
        int i3 = 1211844869;
        int i4 = C3537.f11231;
        int i5 = C5695.f17556;
        int iM2566 = (C0630.m2566("ۧ۬") ^ i5) * (-11);
        int i6 = ((iM2566 ^ i4) * (-10667)) ^ (-1405402965);
        int i7 = 516597174;
        while (true) {
            i3 = ((((i3 ^ i4) * (-27479)) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -2114772339:
                case -548741320:
                    if (C1916.m6308() < 0) {
                        iM2566 = C0630.m2566("ۛᩴ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 25913) ^ 983515184;
                        i7 = -1122808415;
                    } else {
                        iM2566 = C2105.m6981("᩺ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 10093) ^ 21938530;
                        i7 = -343288182;
                    }
                    break;
                case -1727632361:
                case -799899156:
                    if (C2167.m7155()) {
                        iM2566 = (C0630.m2566("ܳ֫") ^ i4) * 115;
                        i6 = ((iM2566 ^ i5) * 27939) ^ 1237888297;
                        i7 = -744016155;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ܽۖ")) * (-51);
                        i6 = ((iM2566 ^ i4) * 24377) ^ (-1038894075);
                        i7 = -1920309090;
                    }
                    break;
                case -1695040408:
                case -850118102:
                    iM1484 = C0237.m1484(iM4384, Math.round(fM16015));
                    iM4385 = C1294.m4384(4.0f);
                    if (C0798.m2998() != 0) {
                        iM2566 = C0630.m2566("֨۠") ^ i5;
                        i6 = ((iM2566 ^ i4) * 1907) ^ 1157610538;
                        i7 = 1824830690;
                    } else {
                        iM2566 = (C0630.m2566("᩸ܳ") + i5) * 35;
                        i6 = ((iM2566 ^ i4) * (-8847)) ^ 1840074697;
                        i7 = 38813826;
                    }
                    break;
                case -1654164993:
                case -741881650:
                    fontMetricsInt.top = fontMetricsInt2.top;
                    fontMetricsInt.bottom = fontMetricsInt2.bottom;
                    iM2566 = C0630.m2566("ᩴܶ") ^ i5;
                    i6 = ((iM2566 ^ i4) * (-8425)) ^ 1565333072;
                    i7 = -580853583;
                    break;
                case -1542022149:
                case 1344570127:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("ܳ֫") ^ i4) * 115;
                        i6 = ((iM2566 ^ i5) * 27939) ^ 1237888297;
                        i7 = -744016155;
                    } else {
                        iM2566 = C2105.m6981("᩺ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 10093) ^ 21938530;
                        i7 = -343288182;
                    }
                    break;
                case -1001609199:
                case -978691173:
                    if (RunnableC1108.f4040) {
                        iM2566 = (i5 - C0630.m2566("۫ۧ")) * (-69);
                        i6 = ((iM2566 ^ i4) * 8117) ^ (-1329172907);
                        i7 = -439866794;
                    } else {
                        iM2566 = C2105.m6981("᩺ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 10093) ^ 21938530;
                        i7 = -343288182;
                    }
                    break;
                case -821151277:
                case 1383347643:
                    fontMetricsInt2 = paint.getFontMetricsInt();
                    fontMetricsInt.ascent = fontMetricsInt2.ascent;
                    fontMetricsInt.descent = fontMetricsInt2.descent;
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C0630.m2566("ܳ֫") ^ i4) * 115;
                        i6 = ((iM2566 ^ i5) * 27939) ^ 1237888297;
                        i7 = -744016155;
                    } else {
                        iM2566 = (i5 - C2105.m6981("᩸ۗ")) * (-9);
                        i6 = ((iM2566 ^ i4) * (-9009)) ^ 667702191;
                        i7 = 877363895;
                    }
                    break;
                case -450605197:
                case 2134085689:
                    if (C4075.m12263() > 0) {
                        iM2566 = C2105.m6981("᩺ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 10093) ^ 21938530;
                        i7 = -343288182;
                    } else {
                        iM2566 = (i5 - C0630.m2566("֨ܿ")) * 63;
                        i6 = ((iM2566 ^ i4) * 15277) ^ 236595265;
                        i7 = 1843477231;
                    }
                    break;
                case -174598129:
                case 1413760565:
                    if (C0483.m2121()) {
                        iM2566 = (C2105.m6981("ܶᩴ") ^ i4) * 89;
                        i6 = ((iM2566 ^ i5) * (-6683)) ^ (-439573591);
                        i7 = -1273002009;
                    } else {
                        iM2566 = C0630.m2566("ۛᩴ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 25913) ^ 983515184;
                        i7 = -1122808415;
                    }
                    break;
                case 226835631:
                case 539951660:
                    C3911.m11924();
                    return 0;
                case 604149082:
                case 1290699359:
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("֨۠") ^ i5;
                        i6 = ((iM2566 ^ i4) * 1907) ^ 1157610538;
                        i7 = 1824830690;
                    } else {
                        iM2566 = C2105.m6981("᩷ܿ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 17593) ^ 349944909;
                        i7 = -1277328307;
                    }
                    break;
                case 766523261:
                case 810875812:
                    iM4384 = C1294.m4384(3.0f);
                    fM16015 = C5695.m16015(paint) * 0.2f;
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i5 - C0630.m2566("֨ܿ")) * 63;
                        i6 = ((iM2566 ^ i4) * 15277) ^ 236595265;
                        i7 = 1843477231;
                    } else {
                        iM2566 = (C0630.m2566("֨ܳ") ^ i4) * (-93);
                        i6 = ((iM2566 ^ i5) * 14883) ^ (-932424738);
                        i7 = 1433443211;
                    }
                    break;
                case 801601857:
                case 1823135476:
                    iRound = Math.round(C5695.m16015(paint) * 0.14f);
                    if (C22628.m50615() != 0) {
                        iM2566 = (i5 - C0630.m2566("֨ܿ")) * 63;
                        i6 = ((iM2566 ^ i4) * 15277) ^ 236595265;
                        i7 = 1843477231;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֫ܽ")) * 65;
                        i6 = ((iM2566 ^ i5) * 19317) ^ (-523836511);
                        i7 = 1860176209;
                    }
                    break;
                case 867760024:
                case 1343730801:
                    if (C22628.m50615() != 0) {
                        iM2566 = C2105.m6981("᩺ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 10093) ^ 21938530;
                        i7 = -343288182;
                    } else {
                        iM2566 = (C2105.m6981("᩻ܿ") ^ i4) * 61;
                        i6 = ((iM2566 ^ i5) * 32399) ^ (-1885536982);
                        i7 = -580968596;
                    }
                    break;
                case 976478562:
                case 2110526803:
                    C3746.m11369();
                    C7811.m20844();
                    iM2566 = (i5 - C0630.m2566("֨ܿ")) * 63;
                    i6 = ((iM2566 ^ i4) * 15277) ^ 236595265;
                    i7 = 1843477231;
                    break;
                case 1258175023:
                case 1650963375:
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("֨۠") ^ i5;
                        i6 = ((iM2566 ^ i4) * 1907) ^ 1157610538;
                        i7 = 1824830690;
                    } else {
                        iM2566 = (C0630.m2566("ۛܶ") ^ i5) * (-43);
                        i6 = ((iM2566 ^ i4) * (-693)) ^ (-1223198984);
                        i7 = -472643763;
                    }
                    break;
                case 1361945097:
                case 1658172275:
                    return (C3911.m11932(iM4385, iRound) * 2) + iM1484;
                default:
                    if (fontMetricsInt != null) {
                        iM2566 = (C0630.m2566("ܰ۠") ^ i4) * 97;
                        i6 = ((iM2566 ^ i5) * 19447) ^ 514169027;
                        i7 = 621122049;
                    } else {
                        iM2566 = C0630.m2566("ᩴܶ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-8425)) ^ 1565333072;
                        i7 = -580853583;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0292 A[PHI: r4 r5
      0x0292: PHI (r4v9 float) = (r4v2 float), (r4v2 float), (r4v4 float), (r4v2 float) binds: [B:61:0x0290, B:49:0x020e, B:39:0x019e, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r5v7 float) = (r5v2 float), (r5v2 float), (r5v3 float), (r5v2 float) binds: [B:61:0x0290, B:49:0x020e, B:39:0x019e, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (l.C4616.f14690 > 0) goto L14;
     */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM6981;
        int i6;
        int i7;
        int iM2566;
        int i8;
        int i9;
        float f2;
        int iM6982;
        int i10;
        C19467 c19467 = this;
        int i11 = C1773.f6144;
        int i12 = ServiceConnectionC3453.f10921;
        int iM2567 = C0630.m2566("ᩳᩳ") ^ i11;
        int i13 = ((iM2567 ^ i12) * (-2491)) ^ (-1683030962);
        Path path = null;
        int i14 = iM2567 ^ 1788706444;
        float f3 = 0.0f;
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        float fM6431 = 0.0f;
        float fMax3 = 0.0f;
        float f4 = 0.0f;
        int i15 = 0;
        int i16 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z = false;
        int i17 = -1765698052;
        Paint paint2 = null;
        float f8 = 0.0f;
        while (true) {
            i17 = i14 ^ (i13 & (((i17 ^ i12) * 13023) >> 31));
            switch (i17) {
                case -2118093717:
                case 157824590:
                    paint2.setAlpha(paint.getAlpha());
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C0630.m2566("֡ۜ") ^ i11) * 73;
                        i6 = ((iM6981 ^ i12) * (-29429)) ^ (-1550961642);
                        i7 = 725757100;
                    } else {
                        iM6981 = C0630.m2566("ܳۤ") ^ i11;
                        i6 = ((iM6981 ^ i12) * 21415) ^ (-847723735);
                        i7 = 243507163;
                    }
                    i14 = iM6981 ^ i7;
                    i13 = i6;
                    break;
                case -1761922823:
                case 1717064519:
                    fMax = Math.max(ViewOnClickListenerC1958.m6431(3.0f), C5695.m16015(paint) * 0.2f);
                    if (AbstractC2021.f6743 <= 0) {
                        f2 = 6.0f;
                        iM6982 = (C2105.m6981("֫᩻") ^ i11) * (-9);
                        f3 = f2;
                        i9 = ((iM6982 ^ i12) * (-25939)) ^ (-243539435);
                        i10 = 912352230;
                        i14 = iM6982 ^ i10;
                    } else {
                        int iM2568 = C0630.m2566("ܳۡ") ^ i11;
                        i9 = ((iM2568 ^ i12) * (-19261)) ^ 1668043137;
                        i14 = iM2568 ^ 1559046738;
                        f3 = 6.0f;
                    }
                    i13 = i9;
                    c19467 = this;
                    break;
                case -1619922388:
                case -259369326:
                    path.rewind();
                    float f9 = fMax2 / f5;
                    path.moveTo(f7, f6 - f9);
                    path.lineTo(f8, f6);
                    path.lineTo(f7, f6 + f9);
                    canvas.drawPath(path, paint2);
                    break;
                case -1529434454:
                case 1143165210:
                    z = C1005.f3721;
                    iM2566 = (i12 - C0630.m2566("۟֫")) * (-5);
                    i13 = ((iM2566 ^ i11) * (-13609)) ^ 2028519958;
                    i8 = -203426266;
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case -1393325046:
                case 283452938:
                    if (z) {
                        iM2566 = (C2105.m6981("ܽ᩶") ^ i11) * 29;
                        i13 = ((iM2566 ^ i12) * 5159) ^ (-1540886995);
                        i8 = -1850598382;
                    } else {
                        iM2566 = (i12 - C0630.m2566("ۙ۬")) * (-25);
                        i13 = ((iM2566 ^ i11) * 14925) ^ 1403233573;
                        i8 = -313854465;
                    }
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case -950211313:
                case 617731597:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (i12 - C0630.m2566("ۙ۬")) * (-25);
                        i13 = ((iM2566 ^ i11) * 14925) ^ 1403233573;
                        i8 = -313854465;
                    } else {
                        iM2566 = C2105.m6981("ܽ۠") ^ i12;
                        i13 = ((iM2566 ^ i11) * (-14825)) ^ 1725343501;
                        i8 = -1968225932;
                    }
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case -624392127:
                case -321917383:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("ܽ᩸") ^ i12;
                        i13 = ((iM2566 ^ i11) * (-13753)) ^ 868383981;
                        i8 = 111551109;
                    } else {
                        iM2566 = (i12 - C2105.m6981("ۘۧ")) * 21;
                        i13 = ((iM2566 ^ i11) * (-15771)) ^ 261420073;
                        i8 = 1426739846;
                    }
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case -556598669:
                case 1502894612:
                    f5 = 2.0f;
                    f6 = ((i15 + i16) / 2.0f) + f4;
                    f7 = f + fMax3;
                    f8 = fMax + f7;
                    int color = paint.getColor();
                    paint2 = c19467.f62942;
                    paint2.setColor(color);
                    if (C7811.f24123 < 0) {
                        iM6981 = (i12 - C2105.m6981("᩹᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM6981 ^ i11) * 509) ^ 676746763;
                        i7 = 1070885083;
                        i14 = iM6981 ^ i7;
                        i13 = i6;
                    } else {
                        iM2566 = C0630.m2566("ܽ᩸") ^ i12;
                        i13 = ((iM2566 ^ i11) * (-13753)) ^ 868383981;
                        i8 = 111551109;
                        i14 = iM2566 ^ i8;
                        c19467 = this;
                    }
                    break;
                case -363778770:
                case -154162168:
                    C0798.m2998();
                    C1294.m4372();
                    break;
                case -175627853:
                case 1917889962:
                    fMax2 = Math.max(ViewOnClickListenerC1958.m6431(f3), C2520.m8021(paint) * 0.42f);
                    fM6431 = ViewOnClickListenerC1958.m6431(4.0f);
                    if (C0237.f1507 != 0) {
                        iM2566 = (i12 - C0630.m2566("ۙ۬")) * (-25);
                        i13 = ((iM2566 ^ i11) * 14925) ^ 1403233573;
                        i8 = -313854465;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ᩴ֡")) * 17;
                        i13 = ((iM2566 ^ i12) * 4971) ^ (-1288881360);
                        i8 = 761348081;
                    }
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case -87177037:
                case 221856437:
                    if (C1128.m3851() <= 0) {
                        f2 = f3;
                        iM6982 = (C2105.m6981("֫᩻") ^ i11) * (-9);
                        f3 = f2;
                        i9 = ((iM6982 ^ i12) * (-25939)) ^ (-243539435);
                        i10 = 912352230;
                        i14 = iM6982 ^ i10;
                        i13 = i9;
                        c19467 = this;
                    }
                    iM2566 = (i12 - C0630.m2566("ۙ۬")) * (-25);
                    i13 = ((iM2566 ^ i11) * 14925) ^ 1403233573;
                    i8 = -313854465;
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case 217149076:
                case 540940348:
                    paint2.setStrokeWidth(Math.max(C1294.m4384(0.75f), C5695.m16015(paint) * 0.055f));
                    path = c19467.f62943;
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("֡ۜ") ^ i11) * 73;
                        i6 = ((iM6981 ^ i12) * (-29429)) ^ (-1550961642);
                        i7 = 725757100;
                        i14 = iM6981 ^ i7;
                        i13 = i6;
                    } else {
                        int iM6983 = (C2105.m6981("ۘۤ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i13 = ((iM6983 ^ i12) * (-29347)) ^ 1275186564;
                        i14 = iM6983 ^ (-2003097634);
                    }
                    break;
                case 625965939:
                case 2086150261:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("ۙ᩺") + i12) * (-33);
                        i13 = ((iM2566 ^ i11) * (-28895)) ^ (-1030767489);
                        i8 = 2127812378;
                    } else {
                        iM2566 = C2105.m6981("᩹ۤ") ^ i11;
                        i13 = ((iM2566 ^ i12) * 28835) ^ 302849605;
                        i8 = -371017870;
                    }
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case 636001224:
                case 915703284:
                    C1047.m3599();
                    C1711.m5736();
                    iM2566 = C0630.m2566("ܽ᩸") ^ i12;
                    i13 = ((iM2566 ^ i11) * (-13753)) ^ 868383981;
                    i8 = 111551109;
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case 926782248:
                case 1431743675:
                    fMax3 = Math.max(fM6431, C2520.m8021(paint) * 0.14f);
                    Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                    f4 = i4;
                    i15 = fontMetricsInt.ascent;
                    i16 = fontMetricsInt.descent;
                    if (AbstractC2021.f6743 > 0) {
                        iM6982 = C2105.m6981("ۚܺ") ^ i12;
                        i9 = ((iM6982 ^ i11) * 30451) ^ 708969845;
                        i10 = 841340067;
                        i14 = iM6982 ^ i10;
                        i13 = i9;
                        c19467 = this;
                    }
                    iM2566 = (C2105.m6981("ۙ᩺") + i12) * (-33);
                    i13 = ((iM2566 ^ i11) * (-28895)) ^ (-1030767489);
                    i8 = 2127812378;
                    i14 = iM2566 ^ i8;
                    c19467 = this;
                    break;
                case 2010738552:
                case 2137229817:
                    C0422.m1963();
                    break;
                default:
                    if (C3019.m9255() <= 0) {
                        iM6981 = (C0630.m2566("֡ۜ") ^ i11) * 73;
                        i6 = ((iM6981 ^ i12) * (-29429)) ^ (-1550961642);
                        i7 = 725757100;
                        i14 = iM6981 ^ i7;
                        i13 = i6;
                    } else {
                        iM2566 = (i12 - C0630.m2566("ۙ۬")) * (-25);
                        i13 = ((iM2566 ^ i11) * 14925) ^ 1403233573;
                        i8 = -313854465;
                        i14 = iM2566 ^ i8;
                        c19467 = this;
                    }
                    break;
            }
            return;
        }
    }

    public C19467() {
        int iM6981;
        int i;
        int i2 = -296524509;
        int i3 = C2520.f8000;
        int i4 = C1420.f5096;
        int iM2566 = (i4 - C0630.m2566("᩸ۧ")) * (-123);
        int i5 = ((iM2566 ^ i3) * (-25463)) ^ 1228485277;
        int i6 = -218126084;
        while (true) {
            int i7 = iM2566 ^ i6;
            Paint paint = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-1093)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1645631803:
                    case 1526269965:
                        if (C21923.f70183 == 0) {
                            if (C7811.f24123 < 0) {
                                if (RunnableC1108.f4040) {
                                    if (C1005.f3721) {
                                        if (C0050.m940() > 0) {
                                            if (C0382.f1805) {
                                                if (C3019.m9255() > 0) {
                                                    if (RunnableC1937.m6387() == 0) {
                                                        paint = new Paint(1);
                                                        if (RunnableC3474.f10992 > 0) {
                                                            iM6981 = (i4 - C2105.m6981("ܳۖ")) * 83;
                                                            i5 = ((iM6981 ^ i3) * (-2933)) ^ 835277958;
                                                            i = 41100019;
                                                            i7 = iM6981 ^ i;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        iM2566 = C2105.m6981("۫۟") ^ i3;
                                        i5 = ((iM2566 ^ i4) * 23445) ^ (-309197118);
                                        i6 = 1392870733;
                                        break;
                                    }
                                }
                                iM2566 = C0630.m2566("᩵۠") ^ i4;
                                i5 = ((iM2566 ^ i3) * (-16561)) ^ 682235187;
                                i6 = 1005638211;
                                break;
                            }
                            iM2566 = C0630.m2566("֫۟") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31563) ^ (-133254592);
                            i6 = 1592198809;
                        } else {
                            iM2566 = C2105.m6981("ۨ᩸") ^ i3;
                            i5 = ((iM2566 ^ i4) * 24305) ^ 30660700;
                            i6 = 1311627583;
                        }
                        break;
                    case -1551800329:
                    case -980819461:
                        C0050.m940();
                        C1711.m5736();
                        throw new RuntimeException();
                    case -729986153:
                    case 1350827770:
                        if (C1294.f4556 >= 0) {
                            iM2566 = C0630.m2566("֫۟") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31563) ^ (-133254592);
                            i6 = 1592198809;
                        } else {
                            iM2566 = C2105.m6981("ۨ᩸") ^ i3;
                            i5 = ((iM2566 ^ i4) * 24305) ^ 30660700;
                            i6 = 1311627583;
                        }
                        break;
                    case -660500403:
                    case 1054822059:
                        if (!C1711.f5919) {
                            iM6981 = (C0630.m2566("ܳ۫") ^ i4) * (-53);
                            i5 = ((iM6981 ^ i3) * (-17059)) ^ (-844170627);
                            i = 593234323;
                            i7 = iM6981 ^ i;
                        } else {
                            iM2566 = C0630.m2566("֫۟") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31563) ^ (-133254592);
                            i6 = 1592198809;
                        }
                        break;
                    case -283521915:
                    case 212047822:
                        this.f62943 = new Path();
                        return;
                    case 83497541:
                    case 489515929:
                        C3911.m11924();
                        iM2566 = C2105.m6981("ۨ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * 24305) ^ 30660700;
                        i6 = 1311627583;
                        break;
                    case 1925655626:
                    case 2017014492:
                        if (C5695.m16023() >= 0) {
                            iM2566 = C2105.m6981("۫۟") ^ i3;
                            i5 = ((iM2566 ^ i4) * 23445) ^ (-309197118);
                            i6 = 1392870733;
                        } else {
                            iM2566 = C0630.m2566("֫۟") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31563) ^ (-133254592);
                            i6 = 1592198809;
                        }
                        break;
                    default:
                        this.f62942 = paint;
                        if (!C1504.f5354) {
                            iM6981 = (i3 - C2105.m6981("ۚ֫")) * (-61);
                            i5 = ((iM6981 ^ i4) * 18569) ^ (-1689469362);
                            i = 1458173580;
                            i7 = iM6981 ^ i;
                        } else {
                            iM2566 = C0630.m2566("᩵۠") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-16561)) ^ 682235187;
                            i6 = 1005638211;
                        }
                        break;
                }
            }
        }
    }
}
