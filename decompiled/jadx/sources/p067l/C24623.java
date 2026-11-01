package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩻ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: FA3A */
/* JADX INFO: loaded from: classes.dex */
public class C24623 extends Drawable {

    /* JADX INFO: renamed from: ۜ */
    public static final /* synthetic */ int f77940 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final Canvas f77941;

    /* JADX INFO: renamed from: ۧ */
    public final BitmapDrawable f77942;

    /* JADX INFO: renamed from: ܳ */
    public final float f77943;

    /* JADX INFO: renamed from: ܽ */
    public final Paint f77944;

    /* JADX INFO: renamed from: ܿ */
    public final float f77945;

    /* JADX INFO: renamed from: ᩳ */
    public float f77946;

    /* JADX INFO: renamed from: ᩻ */
    public final float f77947;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = -690642681;
        int i2 = RunnableC1014.f81941;
        int i3 = C0989.f81920;
        int iM55680 = (C0873.m55680("᩶۫") + i3) * (-27);
        int i4 = ((iM55680 ^ i2) * 32503) ^ 1557191785;
        int i5 = -965750851;
        while (true) {
            i = ((((i ^ i2) * 6287) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1783049574:
                case -732110046:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("۬۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1659) ^ 1645133811;
                        i5 = 1124585640;
                    } else {
                        iM55680 = C0873.m55680("ܶ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-16897)) ^ 96681052;
                        i5 = 1759369371;
                    }
                    break;
                case -1656045595:
                case 716950570:
                    super.onBoundsChange(rect);
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("۬ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8293)) ^ (-1629630549);
                        i5 = 1225453939;
                    } else {
                        iM55680 = C0946.m55979("ܶ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-12757)) ^ 614668962;
                        i5 = -1013202164;
                    }
                    break;
                case -1644169204:
                case 103996054:
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i3 - C0873.m55680("۬ۛ")) * (-21);
                        i4 = ((iM55680 ^ i2) * (-3585)) ^ (-1840787801);
                        i5 = -1321942089;
                    } else {
                        iM55680 = (C0873.m55680("֫ۜ") + i2) * (-9);
                        i4 = ((iM55680 ^ i3) * (-32755)) ^ 467351707;
                        i5 = -1343609281;
                    }
                    break;
                case -1624935651:
                case 1057565694:
                    C1025.m56230();
                    C0917.m55854();
                    break;
                case -1586520686:
                case 847650844:
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0946.m55979("۬ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9421) ^ (-1320726571);
                        i5 = -1736350573;
                    } else {
                        iM55680 = (C0873.m55680("᩻ۨ") + i3) * (-53);
                        i4 = ((iM55680 ^ i2) * 1721) ^ 864269747;
                        i5 = 1510818004;
                    }
                    break;
                case -1569592429:
                case 950658665:
                    this.f77942.setBounds(rect);
                    break;
                case -1545022141:
                case 1426257935:
                    C1071.m56343();
                    C0992.m56107();
                    iM55680 = (C0946.m55979("֡ۘ") + i2) * (-95);
                    i4 = ((iM55680 ^ i3) * 9251) ^ 129787770;
                    i5 = 918491801;
                    break;
                case -1239034036:
                case -451047508:
                    C1017.m56187();
                    if (C0967.f81910 < 0) {
                        iM55680 = C0946.m55979("۬ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9421) ^ (-1320726571);
                        i5 = -1736350573;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۬ۛ")) * (-21);
                        i4 = ((iM55680 ^ i2) * (-3585)) ^ (-1840787801);
                        i5 = -1321942089;
                    }
                    break;
                case -1173651931:
                case -461826328:
                    if (C0992.m56107() <= 0) {
                        iM55680 = C0946.m55979("۬ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8293)) ^ (-1629630549);
                        i5 = 1225453939;
                    } else {
                        iM55680 = (C0873.m55680("ܶۚ") ^ i2) * 29;
                        i4 = ((iM55680 ^ i3) * (-18521)) ^ 1182289350;
                        i5 = -1009117465;
                    }
                    break;
                case -1138166226:
                case 295491285:
                    if (C0930.f81879 > 0) {
                        iM55680 = C0873.m55680("۬۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1659) ^ 1645133811;
                        i5 = 1124585640;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۬ۛ")) * (-21);
                        i4 = ((iM55680 ^ i2) * (-3585)) ^ (-1840787801);
                        i5 = -1321942089;
                    }
                    break;
                case -493585215:
                case -32990961:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("۬ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8293)) ^ (-1629630549);
                        i5 = 1225453939;
                    } else {
                        iM55680 = (C0873.m55680("ۜۤ") ^ i2) * (-17);
                        i4 = ((iM55680 ^ i3) * (-16055)) ^ (-1522947793);
                        i5 = -1740234960;
                    }
                    break;
                case -416114501:
                case 1941805416:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("۬ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9421) ^ (-1320726571);
                        i5 = -1736350573;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۡ۬")) * (-53);
                        i4 = ((iM55680 ^ i2) * 30287) ^ 1709081098;
                        i5 = -2047005311;
                    }
                    break;
                case 150601355:
                case 1961504871:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (i3 - C0873.m55680("۬ۛ")) * (-21);
                        i4 = ((iM55680 ^ i2) * (-3585)) ^ (-1840787801);
                        i5 = -1321942089;
                    } else {
                        iM55680 = C0873.m55680("ܺۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20635)) ^ (-1923614854);
                        i5 = 1399589743;
                    }
                    break;
                case 559054829:
                case 1069510135:
                    if (C1929.m56553()) {
                        iM55680 = (C0946.m55979("֡ۘ") + i2) * (-95);
                        i4 = ((iM55680 ^ i3) * 9251) ^ 129787770;
                        i5 = 918491801;
                    } else {
                        iM55680 = (C0946.m55979("֫᩷") + i3) * (-33);
                        i4 = ((iM55680 ^ i2) * 2305) ^ (-2130431588);
                        i5 = 311292602;
                    }
                    break;
                case 954159282:
                case 1695554968:
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0946.m55979("۬ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9421) ^ (-1320726571);
                        i5 = -1736350573;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܰۢ")) * (-3);
                        i4 = ((iM55680 ^ i2) * 25567) ^ 452104267;
                        i5 = 169995643;
                    }
                    break;
                default:
                    if (C1028.m56247() < 0) {
                        iM55680 = (i3 - C0873.m55680("۬ۛ")) * (-21);
                        i4 = ((iM55680 ^ i2) * (-3585)) ^ (-1840787801);
                        i5 = -1321942089;
                    } else {
                        iM55680 = (C0946.m55979("֡ۘ") + i2) * (-95);
                        i4 = ((iM55680 ^ i3) * 9251) ^ 129787770;
                        i5 = 918491801;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        Paint paint = null;
        Canvas canvas2 = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = -1745788686;
        int i2 = C1036.f81953;
        int i3 = C0898.f81858;
        int iM55979 = (i2 - C0946.m55979("ۙۤ")) * 31;
        int i4 = ((iM55979 ^ i3) * (-14507)) ^ (-1487763470);
        int i5 = -472035581;
        while (true) {
            i = ((((i ^ i3) * (-7345)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1912899951:
                case -60552856:
                    C0866.m55645();
                    break;
                case -1848065543:
                case -860678468:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("᩷ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14119)) ^ 1553404357;
                        i5 = 1796959173;
                    } else {
                        iM55979 = (C0873.m55680("᩵֫") + i3) * (-91);
                        i4 = ((iM55979 ^ i2) * 17253) ^ (-218492234);
                        i5 = 1851534994;
                    }
                    break;
                case -1716026812:
                case -1612556515:
                    if (C0917.f81868) {
                        iM55979 = (i3 - C0946.m55979("ۨܳ")) * (-77);
                        i4 = ((iM55979 ^ i2) * 2349) ^ (-626097757);
                        i5 = -1767885339;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ܰ᩺")) * 25;
                        i4 = ((iM55979 ^ i3) * 17233) ^ (-609311851);
                        i5 = -890788830;
                    }
                    break;
                case -1697381210:
                case -1361530617:
                    f5 = this.f77947;
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("ۤᩴ") + i2) * (-3);
                        i4 = ((iM55979 ^ i3) * 10541) ^ 1671822154;
                        i5 = 2090455052;
                    } else {
                        iM55979 = (C0946.m55979("᩺֡") + i3) * (-107);
                        i4 = ((iM55979 ^ i2) * (-7353)) ^ (-1597561249);
                        i5 = -979153153;
                    }
                    break;
                case -1601259074:
                case 594963631:
                    f2 = this.f77946;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (i3 - C0946.m55979("ۨܳ")) * (-77);
                        i4 = ((iM55979 ^ i2) * 2349) ^ (-626097757);
                        i5 = -1767885339;
                    } else {
                        iM55979 = C0946.m55979("۬֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30859)) ^ 936413527;
                        i5 = -503889210;
                    }
                    break;
                case -1576818193:
                case 1190263793:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("᩷ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14119)) ^ 1553404357;
                        i5 = 1796959173;
                    } else {
                        iM55979 = (C0873.m55680("۠ۢ") + i3) * (-51);
                        i4 = ((iM55979 ^ i2) * 31433) ^ (-1508806316);
                        i5 = -446540274;
                    }
                    break;
                case -1568108289:
                case 702109935:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (i3 - C0946.m55979("ۨܳ")) * (-77);
                        i4 = ((iM55979 ^ i2) * 2349) ^ (-626097757);
                        i5 = -1767885339;
                    } else {
                        iM55979 = (C0873.m55680("᩺۠") ^ i2) * 127;
                        i4 = ((iM55979 ^ i3) * (-5953)) ^ (-508946178);
                        i5 = 418806324;
                    }
                    break;
                case -1461401396:
                case 33632087:
                    f = this.f77945;
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۨܳ")) * (-77);
                        i4 = ((iM55979 ^ i2) * 2349) ^ (-626097757);
                        i5 = -1767885339;
                    } else {
                        iM55979 = C0873.m55680("ᩴ۫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24787)) ^ 2058684787;
                        i5 = 1181656412;
                    }
                    break;
                case -1428940636:
                case 1566667097:
                    canvas2.drawCircle(f4, f5, f3, paint);
                    this.f77942.draw(canvas);
                    break;
                case -537891965:
                case 1285623800:
                    canvas2 = this.f77941;
                    f4 = this.f77943;
                    if (C0949.f81897 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۨܳ")) * (-77);
                        i4 = ((iM55979 ^ i2) * 2349) ^ (-626097757);
                        i5 = -1767885339;
                    } else {
                        iM55979 = C0873.m55680("֡᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6747)) ^ (-2022882868);
                        i5 = 1211850726;
                    }
                    break;
                case -433320574:
                case 1696124971:
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = C0873.m55680("᩷ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14119)) ^ 1553404357;
                        i5 = 1796959173;
                    } else {
                        iM55979 = C0873.m55680("᩹ܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31209)) ^ 1178000861;
                        i5 = -1344677818;
                    }
                    break;
                case -378300101:
                case 271020900:
                    f3 = f * f2;
                    paint = this.f77944;
                    if (C1048.f81963) {
                        iM55979 = (i2 - C0946.m55979("᩻ۚ")) * 77;
                        i4 = ((iM55979 ^ i3) * (-1603)) ^ 2037474885;
                        i5 = -1364651939;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۨܳ")) * (-77);
                        i4 = ((iM55979 ^ i2) * 2349) ^ (-626097757);
                        i5 = -1767885339;
                    }
                    break;
                case 226305489:
                case 381312341:
                    if (C0890.f81849 != 0) {
                        iM55979 = (i3 - C0946.m55979("ۨܳ")) * (-77);
                        i4 = ((iM55979 ^ i2) * 2349) ^ (-626097757);
                        i5 = -1767885339;
                    } else {
                        iM55979 = (C0946.m55979("᩺֨") ^ i3) * 19;
                        i4 = ((iM55979 ^ i2) * (-21873)) ^ 761569465;
                        i5 = -1949250627;
                    }
                    break;
                case 766219378:
                case 936013213:
                    C1404.m56468();
                    if (C0845.f81821 < 0) {
                        iM55979 = C0873.m55680("ܶۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9835) ^ 333006768;
                        i5 = 1884613284;
                    } else {
                        iM55979 = C0873.m55680("᩷ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14119)) ^ 1553404357;
                        i5 = 1796959173;
                    }
                    break;
                case 1711976521:
                case 2026900253:
                    C0866.m55645();
                    C0898.m55800();
                    iM55979 = C0873.m55680("᩷ۘ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-14119)) ^ 1553404357;
                    i5 = 1796959173;
                    break;
                default:
                    if (C1012.f81938 < 0) {
                        iM55979 = (C0873.m55680("ۤᩴ") + i2) * (-3);
                        i4 = ((iM55979 ^ i3) * 10541) ^ 1671822154;
                        i5 = 2090455052;
                    } else {
                        iM55979 = C0873.m55680("ܶۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9835) ^ 333006768;
                        i5 = 1884613284;
                    }
                    break;
            }
            return;
        }
    }

    public C24623(Bitmap bitmap, float f, float f2) {
        int iM55979;
        Canvas canvas;
        int i;
        int i2;
        int iM55680;
        int i3;
        C24623 c24623 = this;
        Canvas canvas2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        double dSqrt = 0.0d;
        int i7 = 0;
        int i8 = 227551430;
        int i9 = C1028.f81950;
        int i10 = C1036.f81953;
        int iM559710 = C0946.m55979("ۨܶ") ^ i10;
        int i11 = ((iM559710 ^ i9) * 29137) ^ 764089049;
        int i12 = 1625919496;
        while (true) {
            int i13 = iM559710 ^ i12;
            while (true) {
                Paint paint = null;
                while (true) {
                    i8 = ((((i8 ^ i9) * (-23539)) >> 31) & i11) ^ i13;
                    switch (i8) {
                        case -2080543882:
                        case -106918327:
                            C1048.m56305();
                            iM55680 = (C0873.m55680("۬ܺ") ^ i10) * 115;
                            i11 = ((iM55680 ^ i9) * 3033) ^ 2134936420;
                            i3 = -1958323673;
                            i13 = iM55680 ^ i3;
                            break;
                        case -2046137517:
                        case 851633556:
                            c24623.f77942 = new BitmapDrawable(bitmap);
                            if (C1017.f81942 < 0) {
                                int iM559711 = (i9 - C0946.m55979("ܽ᩻")) * (-55);
                                i11 = ((iM559711 ^ i10) * (-1889)) ^ 598604514;
                                i13 = iM559711 ^ (-274779163);
                                c24623 = this;
                            }
                            break;
                        case -1746083154:
                        case 135794586:
                            canvas2 = new Canvas(bitmap);
                            if (C0949.f81897 >= 0) {
                                iM55979 = (C0946.m55979("֫᩸") + i9) * (-127);
                                canvas = canvas2;
                                i = ((iM55979 ^ i10) * (-16829)) ^ (-1831164168);
                                i2 = 1667643092;
                            } else {
                                iM55979 = C0946.m55979("ۨ֡") ^ i10;
                                canvas = canvas2;
                                i = ((iM55979 ^ i9) * (-19835)) ^ (-1857563901);
                                i2 = 1919051013;
                            }
                            i11 = i;
                            i13 = iM55979 ^ i2;
                            canvas2 = canvas;
                            break;
                        case -1699300154:
                        case -801100309:
                            RunnableC0897.m55784();
                            if (C0946.f81894 != 0) {
                            }
                            iM55680 = C0946.m55979("۠۬") ^ i9;
                            i11 = ((iM55680 ^ i10) * (-7187)) ^ (-1452221824);
                            i3 = -1075232668;
                            i13 = iM55680 ^ i3;
                            break;
                        case -1574433533:
                        case 275987519:
                            paint.setColor(i7);
                            paint.setStyle(Paint.Style.FILL);
                            if (C1404.f82149 >= 0) {
                                break;
                            }
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            return;
                        case -1484635337:
                        case 1818772192:
                            if (C0992.f81922 < 0) {
                            }
                            iM55680 = C0946.m55979("۠۬") ^ i9;
                            i11 = ((iM55680 ^ i10) * (-7187)) ^ (-1452221824);
                            i3 = -1075232668;
                            i13 = iM55680 ^ i3;
                            break;
                        case -1365017652:
                        case -1092291236:
                            dSqrt = Math.sqrt(i6 + i5);
                            if (C1003.f81929 > 0) {
                                iM55680 = C0873.m55680("ۚ۠") ^ i10;
                                i11 = ((iM55680 ^ i9) * (-21679)) ^ (-294041970);
                                i3 = 955922619;
                                i13 = iM55680 ^ i3;
                            } else {
                                iM55979 = (C0946.m55979("֫᩸") + i9) * (-127);
                                canvas = canvas2;
                                i = ((iM55979 ^ i10) * (-16829)) ^ (-1831164168);
                                i2 = 1667643092;
                                i11 = i;
                                i13 = iM55979 ^ i2;
                                canvas2 = canvas;
                            }
                            break;
                        case -695214105:
                        case -181151091:
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            int i14 = width * width;
                            if (C1003.f81929 <= 0) {
                                i5 = i14;
                                i4 = height;
                                iM55680 = C0946.m55979("۠۬") ^ i9;
                                i11 = ((iM55680 ^ i10) * (-7187)) ^ (-1452221824);
                                i3 = -1075232668;
                                i13 = iM55680 ^ i3;
                            } else {
                                int iM55681 = C0873.m55680("ܰ۫") ^ i10;
                                i11 = ((iM55681 ^ i9) * (-29723)) ^ (-1516632445);
                                i13 = iM55681 ^ (-1889825489);
                                i5 = i14;
                                i4 = height;
                            }
                            break;
                        case -651111283:
                        case 1615931713:
                            if (C1048.m56305() >= 0) {
                            }
                            iM55680 = (C0873.m55680("۬ܺ") ^ i10) * 115;
                            i11 = ((iM55680 ^ i9) * 3033) ^ 2134936420;
                            i3 = -1958323673;
                            i13 = iM55680 ^ i3;
                            break;
                        case -568736280:
                        case 610178032:
                            c24623.f77945 = (float) dSqrt;
                            if (ViewOnClickListenerC0939.m55941() < 0) {
                                if (C0992.f81922 < 0) {
                                    paint = new Paint(1);
                                    c24623.f77944 = paint;
                                    i7 = 0;
                                    if (C1964.m56597() == 0) {
                                        iM55680 = C0873.m55680("ۚۤ") ^ i9;
                                        i11 = ((iM55680 ^ i10) * (-27933)) ^ (-878573870);
                                        i3 = -990798164;
                                        i13 = iM55680 ^ i3;
                                    }
                                }
                            }
                            break;
                        case 858552646:
                        case 936918214:
                            ServiceConnectionC1013.m56157();
                            C0866.m55645();
                            throw new RuntimeException();
                        case 1050090261:
                        case 1773686401:
                            i6 = i4 * i4;
                            if (C0854.f81826 == 0) {
                                iM55680 = (i9 - C0873.m55680("᩶ۡ")) * (-17);
                                i11 = ((iM55680 ^ i10) * (-3911)) ^ (-1338667061);
                                i3 = -2056622742;
                                i13 = iM55680 ^ i3;
                            }
                            break;
                        default:
                            c24623.f77941 = canvas2;
                            c24623.f77943 = f;
                            c24623.f77947 = f2;
                            if (C0873.f81841 > 0) {
                                int iM559712 = (C0946.m55979("۠֡") + i9) * (-79);
                                i11 = ((iM559712 ^ i10) * (-22665)) ^ 1825170303;
                                i13 = iM559712 ^ (-1214438069);
                            }
                            break;
                    }
                }
                int iM559713 = C0946.m55979("ᩳᩴ") ^ i10;
                i13 = iM559713 ^ (-1970787692);
                i11 = ((iM559713 ^ i9) * (-17699)) ^ (-645695750);
            }
            iM559710 = C0946.m55979("᩵ۙ") ^ i10;
            i11 = ((iM559710 ^ i9) * (-28211)) ^ (-1409749669);
            i12 = 524325720;
        }
    }

    @InterfaceC1080
    public void setProgress(float f) {
        this.f77946 = f;
        invalidateSelf();
    }
}
