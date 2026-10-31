package l;

import com.google.android.material.slider.BaseSlider;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩷ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 72SJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20843 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩳܶۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f67480 = {8999, -2295, -2608, -9377, -5772, -2562, -1221, 6578, 5592, -11284, 1352, 27843, -30221, -26572, 882, 22580, 22635, 22647, 22638, 22652, 22642, 22645, 22580, 22655, 22654, 22637, 22580, 22632, 22654, 22639, 22582, 22642, 22645, 22653, 22644, 22642, 22655, 22655, 22654, 22632, 22648, 22633, 22642, 22635, 22639, 22642, 22644, 22645, 22638, 22635, 22655, 22650, 22639, 22654, 22616, 22644, 22645, 22639, 22654, 22645, 22639, 22633, 22654, 22637, 22642, 22654, 22636};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f67481;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f67482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f67483;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8848 f67484;

    /* JADX WARN: Code duplicated, block: B:32:0x00d1 A[PHI: r15
      0x00d1: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:31:0x00cf, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x017f A[PHI: r2 r12 r14
      0x017f: PHI (r2v4 l.ۡۧ᩷) = (r2v2 l.ۡۧ᩷), (r2v3 l.ۡۧ᩷), (r2v2 l.ۡۧ᩷), (r2v2 l.ۡۧ᩷), (r2v2 l.ۡۧ᩷) binds: [B:46:0x017d, B:35:0x0105, B:17:0x0071, B:15:0x006d, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:46:0x017d, B:35:0x0105, B:17:0x0071, B:15:0x006d, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:46:0x017d, B:35:0x0105, B:17:0x0071, B:15:0x006d, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ec A[PHI: r3 r8
      0x01ec: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:27:0x00af, B:15:0x006d, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r8v3 short) = (r8v2 short), (r8v2 short), (r8v2 short), (r8v5 short) binds: [B:27:0x00af, B:15:0x006d, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021d A[PHI: r7 r10 r11
      0x021d: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:60:0x021b, B:50:0x01b3, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:60:0x021b, B:50:0x01b3, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:60:0x021b, B:50:0x01b3, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0251 A[PHI: r4 r5 r9 r20
      0x0251: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:64:0x024f, B:54:0x01d0, B:23:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:64:0x024f, B:54:0x01d0, B:23:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:64:0x024f, B:54:0x01d0, B:23:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x024f, B:54:0x01d0, B:23:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM2566;
        int i;
        int i2;
        int i3 = RunnableC1937.f6483;
        int i4 = C2958.f9394;
        int iM6981 = C2105.m6981("ᩴ᩶") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-14753)) ^ 521818738;
        String strM5726 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ (-723318498);
        ActivityC8848 activityC8848 = null;
        int iM6982 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1440654648;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-1795)) >> 31));
            switch (i14) {
                case -2109701112:
                case 1516928836:
                    C3663.m11168();
                    if (C0798.f2919) {
                        iM2566 = (C0630.m2566("ܺ᩷") ^ i3) * (-61);
                        i = ((iM2566 ^ i4) * 22229) ^ 1920778893;
                        i2 = -1811166495;
                    } else {
                        iM2566 = C0630.m2566("ᩴܿ") ^ i3;
                        i = ((iM2566 ^ i4) * (-21015)) ^ 391379839;
                        i2 = -2074806073;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2078768618:
                case 2036297404:
                    strM5726 = C1711.m5726(sArr2, i13, 3, i12);
                    if (C1711.f5919) {
                        iM2566 = C0630.m2566("ᩴܿ") ^ i3;
                        i = ((iM2566 ^ i4) * (-21015)) ^ 391379839;
                        i2 = -2074806073;
                    } else {
                        iM2566 = (C2105.m6981("ۤۢ") ^ i3) * 3;
                        i = ((iM2566 ^ i4) * (-21831)) ^ (-2087471402);
                        i2 = -274228305;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2078756521:
                case 1358397434:
                    int i15 = i10 + i11;
                    if ((i15 + i15) - i9 < 0) {
                        iM2566 = C0630.m2566("۟ܰ") ^ i3;
                        i = ((iM2566 ^ i4) * 8121) ^ 1618865978;
                        i2 = -1848438711;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۛ") + i4) * 7;
                        i = ((iM2566 ^ i3) * 19987) ^ 677112639;
                        i2 = -199123116;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1969213285:
                case 1076560693:
                    i12 = 58715;
                    iM2566 = (C2105.m6981("᩺ܰ") ^ i4) * 87;
                    i = ((iM2566 ^ i3) * 20537) ^ 1630403449;
                    i2 = 1734925180;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1861506515:
                case 46435665:
                    i13 = 11;
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("᩺۠") ^ i4;
                        i = ((iM2566 ^ i3) * 7527) ^ 1987569527;
                        i2 = 1899586343;
                    } else {
                        iM2566 = (C0630.m2566("ܺ᩷") ^ i3) * (-61);
                        i = ((iM2566 ^ i4) * 22229) ^ 1920778893;
                        i2 = -1811166495;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1857558381:
                case -1460940636:
                    C1773.m5908();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = (C2105.m6981("ۜ֡") ^ i4) * 85;
                        i = ((iM2566 ^ i3) * (-29229)) ^ (-156785948);
                        i2 = -1140833740;
                    } else {
                        iM2566 = (i4 - C0630.m2566("۠᩹")) * 55;
                        i = ((iM2566 ^ i3) * 13507) ^ 144594945;
                        i2 = -1242192454;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1692499753:
                case 1471892427:
                    c = '\n';
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i4 - C0630.m2566("۠᩹")) * 55;
                        i = ((iM2566 ^ i3) * 13507) ^ 144594945;
                        i2 = -1242192454;
                    } else {
                        iM2566 = (C0630.m2566("ۜܽ") + i4) * 47;
                        i = ((iM2566 ^ i3) * 31491) ^ (-1501958613);
                        i2 = 112801468;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1678508345:
                case 703286411:
                    activityC8848 = this.f67484;
                    sArr2 = f67480;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("ۜ֡") ^ i4) * 85;
                        i = ((iM2566 ^ i3) * (-29229)) ^ (-156785948);
                        i2 = -1140833740;
                    } else {
                        iM2566 = C2105.m6981("۫ܳ") ^ i3;
                        i = ((iM2566 ^ i4) * 32611) ^ (-1293427613);
                        i2 = -1826123821;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1199150017:
                case 364125350:
                    C0483.m2121();
                    C3245.m9925();
                    iM2566 = (C2105.m6981("ۜ֡") ^ i4) * 85;
                    i = ((iM2566 ^ i3) * (-29229)) ^ (-156785948);
                    i2 = -1140833740;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1037270729:
                case 1229971305:
                    i8 = s + 5625;
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("ۖ᩸") ^ i4;
                        i = ((iM2566 ^ i3) * (-8789)) ^ 308538297;
                        i2 = -1354216527;
                    } else {
                        iM2566 = (i4 - C0630.m2566("۟᩷")) * (-61);
                        i = ((iM2566 ^ i3) * 12761) ^ 2100631210;
                        i2 = -1712989361;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -988746649:
                case 252650194:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i4 - C0630.m2566("۠᩹")) * 55;
                        i = ((iM2566 ^ i3) * 13507) ^ 144594945;
                        i2 = -1242192454;
                    } else {
                        iM2566 = C2105.m6981("᩺᩵") ^ i4;
                        i = ((iM2566 ^ i3) * 79) ^ (-803858079);
                        i2 = 982536823;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -810432549:
                case 139665888:
                    i11 = 31640625;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ۜ֡") ^ i4) * 85;
                        i = ((iM2566 ^ i3) * (-29229)) ^ (-156785948);
                        i2 = -1140833740;
                    } else {
                        iM2566 = C0630.m2566("᩻᩺") ^ i3;
                        i = ((iM2566 ^ i4) * 20395) ^ (-1777595301);
                        i2 = -1055395953;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -666237042:
                case 1689653722:
                    C5695.m16023();
                    break;
                case 3150674:
                case 690214468:
                    i12 = 42001;
                    iM2566 = (C2105.m6981("᩺ܰ") ^ i4) * 87;
                    i = ((iM2566 ^ i3) * 20537) ^ 1630403449;
                    i2 = 1734925180;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 186553345:
                case 532470056:
                    C1294.m4372();
                    if (C2167.m7155()) {
                        iM2566 = (C2105.m6981("ۜ֡") ^ i4) * 85;
                        i = ((iM2566 ^ i3) * (-29229)) ^ (-156785948);
                        i2 = -1140833740;
                    } else {
                        iM2566 = C0630.m2566("ᩴܿ") ^ i3;
                        i = ((iM2566 ^ i4) * (-21015)) ^ 391379839;
                        i2 = -2074806073;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 566402315:
                case 1641376024:
                    sArr = f67480;
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("ۖ᩸") ^ i4;
                        i = ((iM2566 ^ i3) * (-8789)) ^ 308538297;
                        i2 = -1354216527;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۙ") + i3) * (-115);
                        i = ((iM2566 ^ i4) * (-7507)) ^ (-694395345);
                        i2 = 580231683;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 582549745:
                case 1545158475:
                    m20267(activityC8848, iM6982 ^ i7);
                    break;
                case 1510904403:
                case 1972957910:
                    iM6982 = C2105.m6981(strM5726);
                    i7 = 2097161052;
                    if (C1711.f5919) {
                        iM2566 = C0630.m2566("ۖ᩸") ^ i4;
                        i = ((iM2566 ^ i3) * (-8789)) ^ 308538297;
                        i2 = -1354216527;
                    } else {
                        iM2566 = (C2105.m6981("ܶܿ") + i3) * 69;
                        i = ((iM2566 ^ i4) * (-16173)) ^ 1231093890;
                        i2 = 1880119950;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = sArr[c];
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ᩴܿ") ^ i3;
                        i = ((iM2566 ^ i4) * (-21015)) ^ 391379839;
                        i2 = -2074806073;
                    } else {
                        iM2566 = C2105.m6981("ܿۚ") ^ i3;
                        i = ((iM2566 ^ i4) * 6757) ^ (-85603776);
                        i2 = -659757256;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C20843(ActivityC8848 activityC8848, JSONObject jSONObject, JSONObject jSONObject2) {
        int i = -553724794;
        int i2 = C4263.f13799;
        int i3 = C3537.f11231;
        this.f67484 = activityC8848;
        this.f67481 = jSONObject;
        this.f67483 = jSONObject2;
        int iM6981 = C2105.m6981("᩹۟") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-3679)) ^ (-1283901701);
        int i5 = -429988809;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i3) * (-16167)) >> 31));
            switch (i) {
                case -2092224395:
                case 1687003721:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ᩳۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27199)) ^ (-1188980545);
                        i5 = 2008186986;
                    } else {
                        iM6981 = (C2105.m6981("۬᩵") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * (-3441)) ^ 1331429195;
                        i5 = -1014121239;
                    }
                    break;
                case -1509378329:
                case 1013631549:
                    C21923.m49329();
                    C2958.m9034();
                    iM6981 = C0630.m2566("᩺ۙ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-26345)) ^ (-1815296642);
                    i5 = 1648282873;
                    break;
                case -968301896:
                case 1843887846:
                    if (!C0964.m3413()) {
                        iM6981 = C0630.m2566("᩺ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26345)) ^ (-1815296642);
                        i5 = 1648282873;
                    } else {
                        iM6981 = C0630.m2566("ᩳۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27199)) ^ (-1188980545);
                        i5 = 2008186986;
                    }
                    break;
                case -728111477:
                case 1449254478:
                    C1047.m3599();
                    throw new RuntimeException();
                case -548922267:
                case -80174758:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C0630.m2566("᩺ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26345)) ^ (-1815296642);
                        i5 = 1648282873;
                    } else {
                        iM6981 = (C2105.m6981("ۜᩳ") ^ i3) * 115;
                        i4 = ((iM6981 ^ i2) * (-23999)) ^ 1752749971;
                        i5 = 1376551054;
                    }
                    break;
                case -112837698:
                case 2069072595:
                    return;
                default:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C0630.m2566("ۤ᩵") + i2) * 49;
                        i4 = ((iM6981 ^ i3) * 10475) ^ 2068217758;
                        i5 = -18255181;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۬֫")) * 59;
                        i4 = ((iM6981 ^ i2) * 8915) ^ (-573819170);
                        i5 = -1405802185;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0143 A[PHI: r14 r15
      0x0143: PHI (r14v7 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:35:0x0141, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r15v7 int) = (r15v3 int), (r15v2 int) binds: [B:35:0x0141, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        C17687 c17687M41422;
        short[] sArr;
        int i;
        String str;
        int iM6981;
        C17687 c17687;
        int i2;
        short s;
        short[] sArr2;
        String str2;
        int iM6982;
        int i3;
        int i4;
        short[] sArr3;
        short s2;
        int iM6983;
        int i5;
        int i6;
        int iM6984;
        int i7;
        int iM2566;
        int i8;
        C20843 c20843 = this;
        int i9 = C4263.f13799;
        int i10 = C5695.f17556;
        int iM2567 = C0630.m2566("ۡᩴ") ^ i9;
        int i11 = ((iM2567 ^ i10) * (-3673)) ^ (-2115499893);
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i12 = iM2567 ^ 1880482284;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s3 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1751035593;
        String str3 = null;
        C14864 c14864M41428 = null;
        String strM1959 = null;
        String strM10568 = null;
        String strM19510 = null;
        String strM10488 = null;
        C17687 c17688 = null;
        while (true) {
            i19 = i12 ^ (i11 & (((i19 ^ i10) * 14197) >> 31));
            switch (i19) {
                case -1938178407:
                case 1786588174:
                    sArr3 = sArr5;
                    str2 = str3;
                    s2 = sArr4[c];
                    i17 = s2 * s2;
                    if (C5695.f17556 >= 0) {
                        iM6983 = (i9 - C0630.m2566("ۡ᩺")) * 115;
                        i3 = ((iM6983 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                    } else {
                        iM6983 = (C2105.m6981("ܳ᩺") ^ i10) * (-3);
                        i3 = ((iM6983 ^ i9) * (-2131)) ^ (-1921975778);
                        i5 = -79115120;
                    }
                    int i20 = iM6983 ^ i5;
                    sArr5 = sArr3;
                    str3 = str2;
                    s3 = s2;
                    i12 = i20;
                    i11 = i3;
                    c20843 = this;
                    break;
                case -1911846868:
                case -50035092:
                    C7106.m19120();
                    if (C3019.f9544 < 0) {
                        iM2566 = C2105.m6981("ۜܿ") ^ i10;
                        i6 = ((iM2566 ^ i9) * (-29421)) ^ 1353883796;
                        i8 = -1077437414;
                    } else {
                        iM2566 = C0630.m2566("ۘ᩹") ^ i10;
                        i6 = ((iM2566 ^ i9) * (-19275)) ^ (-2117121662);
                        i8 = -1269886525;
                    }
                    i12 = iM2566 ^ i8;
                    i11 = i6;
                    break;
                case -1816982450:
                case 1213733939:
                    str2 = str3;
                    c17688.m41430();
                    sArr6 = f67480;
                    i13 = 35;
                    i14 = 2;
                    if (C1420.f5096 > 0) {
                        iM6984 = C2105.m6981("ۚܰ") ^ i10;
                        i6 = ((iM6984 ^ i9) * 8773) ^ (-345923871);
                        i7 = -1546606958;
                        int i21 = iM6984 ^ i7;
                        str3 = str2;
                        i12 = i21;
                        i11 = i6;
                    } else {
                        s2 = s3;
                        sArr3 = sArr5;
                        iM6983 = (i9 - C0630.m2566("ۡ᩺")) * 115;
                        i3 = ((iM6983 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                        int i22 = iM6983 ^ i5;
                        sArr5 = sArr3;
                        str3 = str2;
                        s3 = s2;
                        i12 = i22;
                        i11 = i3;
                        c20843 = this;
                    }
                    break;
                case -1490325990:
                case 1421429329:
                    strM10568 = ServiceConnectionC3453.m10568(sArr8, i16, 13, i15);
                    strM1959 = C0422.m1959(c20843.f67483);
                    if (C2958.f9394 < 0) {
                        iM2566 = (C2105.m6981("᩻᩹") ^ i10) * (-45);
                        i6 = ((iM2566 ^ i9) * 3223) ^ (-1542860657);
                        i8 = 535976107;
                        i12 = iM2566 ^ i8;
                        i11 = i6;
                    } else {
                        s2 = s3;
                        sArr3 = sArr5;
                        str2 = str3;
                        iM6983 = (i9 - C0630.m2566("ۡ᩺")) * 115;
                        i3 = ((iM6983 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                        int i23 = iM6983 ^ i5;
                        sArr5 = sArr3;
                        str3 = str2;
                        s3 = s2;
                        i12 = i23;
                        i11 = i3;
                        c20843 = this;
                    }
                    break;
                case -1322890578:
                case 1391486894:
                    C0714.m2805();
                    return;
                case -1176636538:
                case -1022312800:
                    str2 = str3;
                    s = s3;
                    sArr2 = sArr5;
                    if ((i17 + 82719025) - (s * 18190) < 0) {
                        iM6982 = (C2105.m6981("ۖۖ") ^ i9) * (-15);
                        i3 = ((iM6982 ^ i10) * 13985) ^ (-248266841);
                        i4 = -768849244;
                    } else {
                        iM6982 = C2105.m6981("֡ۛ") ^ i10;
                        i3 = ((iM6982 ^ i9) * 29967) ^ 508843743;
                        i4 = -359868152;
                    }
                    int i24 = iM6982 ^ i4;
                    sArr5 = sArr2;
                    str3 = str2;
                    i12 = i24;
                    s3 = s;
                    i11 = i3;
                    c20843 = this;
                    break;
                case -935525408:
                case 1827613567:
                    ServiceConnectionC3453.m10556(c17688, strM10488, strM19510);
                    sArr8 = f67480;
                    i16 = 48;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("ۘ᩹") ^ i10;
                        i6 = ((iM2566 ^ i9) * (-19275)) ^ (-2117121662);
                        i8 = -1269886525;
                    } else {
                        iM2566 = C0630.m2566("ۨۗ") ^ i10;
                        i6 = ((iM2566 ^ i9) * 13437) ^ (-493182181);
                        i8 = 1243386530;
                    }
                    i12 = iM2566 ^ i8;
                    i11 = i6;
                    break;
                case -835750581:
                case -642671876:
                    C3746.m11369();
                    iM2566 = C2105.m6981("ۜܿ") ^ i10;
                    i6 = ((iM2566 ^ i9) * (-29421)) ^ 1353883796;
                    i8 = -1077437414;
                    i12 = iM2566 ^ i8;
                    i11 = i6;
                    break;
                case -725472005:
                case 1897774260:
                    strM10488 = C3432.m10488(sArr7, 37, 11, i15);
                    strM19510 = C0422.m1959(c20843.f67481);
                    if (C0237.f1507 == 0) {
                        iM2566 = C0630.m2566("ܳ᩹") ^ i9;
                        i6 = ((iM2566 ^ i10) * (-15059)) ^ (-207258694);
                        i8 = -60697746;
                        i12 = iM2566 ^ i8;
                        i11 = i6;
                    } else {
                        s2 = s3;
                        sArr3 = sArr5;
                        str2 = str3;
                        iM6983 = (i9 - C0630.m2566("ۡ᩺")) * 115;
                        i3 = ((iM6983 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                        int i25 = iM6983 ^ i5;
                        sArr5 = sArr3;
                        str3 = str2;
                        s3 = s2;
                        i12 = i25;
                        i11 = i3;
                        c20843 = this;
                    }
                    break;
                case -475793935:
                case 129715205:
                    i15 = 22555;
                    int iM2568 = C0630.m2566("ۘܽ") ^ i9;
                    i11 = ((iM2568 ^ i10) * (-679)) ^ 1248810300;
                    sArr5 = sArr5;
                    str3 = str3;
                    i12 = iM2568 ^ 2081578662;
                    c20843 = this;
                    break;
                case -353927122:
                case 912139555:
                    if (C4075.f12947 < 0) {
                        c17687M41422 = c17688;
                        sArr = sArr5;
                        i = i18;
                        str = str3;
                        iM6981 = C2105.m6981("ۜ᩷") ^ i9;
                        c17687 = c17687M41422;
                        i11 = ((iM6981 ^ i10) * (-30855)) ^ (-746303757);
                        i2 = -93080712;
                        int i26 = iM6981 ^ i2;
                        str3 = str;
                        i12 = i26;
                        sArr5 = sArr;
                        C17687 c17689 = c17687;
                        i18 = i;
                        c17688 = c17689;
                    } else {
                        iM2566 = C2105.m6981("ۜܿ") ^ i10;
                        i6 = ((iM2566 ^ i9) * (-29421)) ^ 1353883796;
                        i8 = -1077437414;
                        i12 = iM2566 ^ i8;
                        i11 = i6;
                    }
                    break;
                case 331762734:
                case 1108580348:
                    throw new C1637(c14864M41428.m35265());
                case 868294995:
                case 2116791001:
                    str2 = str3;
                    sArr5 = f67480;
                    i18 = 15;
                    if (C0237.m1481() < 0) {
                        iM6984 = (C2105.m6981("ۙ۫") + i10) * 119;
                        i6 = ((iM6984 ^ i9) * 8739) ^ 1299920935;
                        i7 = -1868802293;
                        int i27 = iM6984 ^ i7;
                        str3 = str2;
                        i12 = i27;
                        i11 = i6;
                    } else {
                        s = s3;
                        str3 = str2;
                        int iM6985 = C2105.m6981("᩶᩷") ^ i10;
                        i6 = ((iM6985 ^ i9) * 9215) ^ 202888527;
                        i12 = iM6985 ^ (-613790795);
                        c20843 = this;
                        s3 = s;
                        i11 = i6;
                    }
                    break;
                case 1017249740:
                case 2118215412:
                    i15 = 37037;
                    int iM2569 = C0630.m2566("ۘܽ") ^ i9;
                    i11 = ((iM2569 ^ i10) * (-679)) ^ 1248810300;
                    sArr5 = sArr5;
                    str3 = str3;
                    i12 = iM2569 ^ 2081578662;
                    c20843 = this;
                    break;
                case 1145644919:
                case 1199355112:
                    s = s3;
                    sArr2 = sArr5;
                    str2 = str3;
                    sArr4 = f67480;
                    c = 14;
                    if (RunnableC1937.f6483 < 0) {
                        iM6982 = C2105.m6981("ۖ֫") ^ i9;
                        i3 = ((iM6982 ^ i10) * 18853) ^ 118813253;
                        i4 = -1205514716;
                        int i28 = iM6982 ^ i4;
                        sArr5 = sArr2;
                        str3 = str2;
                        i12 = i28;
                        s3 = s;
                        i11 = i3;
                        c20843 = this;
                    } else {
                        sArr5 = sArr2;
                        str3 = str2;
                        int iM6986 = C2105.m6981("᩶᩷") ^ i10;
                        i6 = ((iM6986 ^ i9) * 9215) ^ 202888527;
                        i12 = iM6986 ^ (-613790795);
                        c20843 = this;
                        s3 = s;
                        i11 = i6;
                    }
                    break;
                case 1213115627:
                case 1361331421:
                    short[] sArr9 = sArr5;
                    str3 = c20843.f67484.f26943;
                    int i29 = C16275.f50041;
                    if (C22628.f73083 > 0) {
                        int iM6987 = (i10 - C2105.m6981("ܳ᩻")) * (-85);
                        i12 = iM6987 ^ 247727798;
                        i11 = ((iM6987 ^ i9) * 19085) ^ (-1447107741);
                        sArr5 = sArr9;
                        c20843 = this;
                    } else {
                        sArr5 = sArr9;
                        s = s3;
                        int iM6988 = C2105.m6981("᩶᩷") ^ i10;
                        i6 = ((iM6988 ^ i9) * 9215) ^ 202888527;
                        i12 = iM6988 ^ (-613790795);
                        c20843 = this;
                        s3 = s;
                        i11 = i6;
                    }
                    break;
                case 1234438527:
                case 1323785555:
                    String str4 = str3;
                    C4075.m12254(c17688, C2167.m7159(sArr6, i13, i14, i15), str4);
                    sArr7 = f67480;
                    if (!C2272.f7362) {
                        iM6984 = C2105.m6981("ۚ۫") ^ i9;
                        str2 = str4;
                        i6 = ((iM6984 ^ i10) * 21059) ^ (-715837883);
                        i7 = 1161907917;
                        int i210 = iM6984 ^ i7;
                        str3 = str2;
                        i12 = i210;
                        i11 = i6;
                    } else {
                        str2 = str4;
                        s2 = s3;
                        sArr3 = sArr5;
                        iM6983 = (i9 - C0630.m2566("ۡ᩺")) * 115;
                        i3 = ((iM6983 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                        int i211 = iM6983 ^ i5;
                        sArr5 = sArr3;
                        str3 = str2;
                        s3 = s2;
                        i12 = i211;
                        i11 = i3;
                        c20843 = this;
                    }
                    break;
                case 1379541952:
                case 1550080714:
                    ServiceConnectionC3453.m10556(c17688, strM10568, strM1959);
                    c14864M41428 = c17688.m41428();
                    if (c14864M41428.m35269()) {
                        iM2566 = C0630.m2566("ܰ۟") ^ i9;
                        i6 = ((iM2566 ^ i10) * (-4447)) ^ 195326883;
                        i8 = 1821895018;
                    } else {
                        iM2566 = (C2105.m6981("᩹ۧ") ^ i9) * 19;
                        i6 = ((iM2566 ^ i10) * 29749) ^ (-1307495205);
                        i8 = -1591872082;
                    }
                    i12 = iM2566 ^ i8;
                    i11 = i6;
                    break;
                case 1489708525:
                case 1968576670:
                    c20843.f67482 = c14864M41428.m35263(ServiceConnectionC3453.m10568(f67480, 61, 6, i15));
                    return;
                case 1501093685:
                case 1757581633:
                    C1047.m3599();
                    if (!C1916.f6442) {
                        c17687M41422 = c17688;
                        sArr = sArr5;
                        i = i18;
                        str = str3;
                        iM6981 = C2105.m6981("ۜ᩷") ^ i9;
                        c17687 = c17687M41422;
                        i11 = ((iM6981 ^ i10) * (-30855)) ^ (-746303757);
                        i2 = -93080712;
                        int i212 = iM6981 ^ i2;
                        str3 = str;
                        i12 = i212;
                        sArr5 = sArr;
                        C17687 c176810 = c17687;
                        i18 = i;
                        c17688 = c176810;
                    } else {
                        s = s3;
                        int iM6989 = C2105.m6981("᩶᩷") ^ i10;
                        i6 = ((iM6989 ^ i9) * 9215) ^ 202888527;
                        i12 = iM6989 ^ (-613790795);
                        c20843 = this;
                        s3 = s;
                        i11 = i6;
                    }
                    break;
                default:
                    str = str3;
                    sArr = sArr5;
                    i = i18;
                    c17687M41422 = C17687.m41422(RunnableC1937.m6385(sArr, i, 20, i15));
                    if (C3683.m11222()) {
                        iM6981 = C2105.m6981("ۜ᩷") ^ i9;
                        c17687 = c17687M41422;
                        i11 = ((iM6981 ^ i10) * (-30855)) ^ (-746303757);
                        i2 = -93080712;
                    } else {
                        iM6981 = (C2105.m6981("۠ۗ") ^ i9) * (-61);
                        c17687 = c17687M41422;
                        i11 = ((iM6981 ^ i10) * (-6421)) ^ (-462787885);
                        i2 = -847102738;
                    }
                    int i213 = iM6981 ^ i2;
                    str3 = str;
                    i12 = i213;
                    sArr5 = sArr;
                    C17687 c176811 = c17687;
                    i18 = i;
                    c17688 = c176811;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0152 A[PHI: r4 r7
      0x0152: PHI (r4v4 boolean) = (r4v2 boolean), (r4v3 boolean), (r4v2 boolean), (r4v2 boolean) binds: [B:37:0x0150, B:23:0x00b1, B:12:0x0084, B:9:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:37:0x0150, B:23:0x00b1, B:12:0x0084, B:9:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01ca A[PHI: r2 r6 r10 r11 r12 r13 r14
      0x01ca: PHI (r2v4 l.ۡۧ᩷) = (r2v2 l.ۡۧ᩷), (r2v2 l.ۡۧ᩷), (r2v3 l.ۡۧ᩷), (r2v2 l.ۡۧ᩷), (r2v2 l.ۡۧ᩷), (r2v2 l.ۡۧ᩷) binds: [B:47:0x01c8, B:43:0x01a7, B:32:0x0124, B:17:0x0091, B:15:0x008d, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r6v4 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:47:0x01c8, B:43:0x01a7, B:32:0x0124, B:17:0x0091, B:15:0x008d, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:47:0x01c8, B:43:0x01a7, B:32:0x0124, B:17:0x0091, B:15:0x008d, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:47:0x01c8, B:43:0x01a7, B:32:0x0124, B:17:0x0091, B:15:0x008d, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:47:0x01c8, B:43:0x01a7, B:32:0x0124, B:17:0x0091, B:15:0x008d, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:47:0x01c8, B:43:0x01a7, B:32:0x0124, B:17:0x0091, B:15:0x008d, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:47:0x01c8, B:43:0x01a7, B:32:0x0124, B:17:0x0091, B:15:0x008d, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02ac A[PHI: r18 r19
      0x02ac: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:66:0x02aa, B:15:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r19v4 short) = (r19v3 short), (r19v2 short) binds: [B:66:0x02aa, B:15:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02e2 A[PHI: r8 r16 r17 r20 r21 r26
      0x02e2: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:70:0x02e0, B:62:0x028a, B:9:0x0079, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02e0, B:62:0x028a, B:9:0x0079, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:70:0x02e0, B:62:0x028a, B:9:0x0079, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:70:0x02e0, B:62:0x028a, B:9:0x0079, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r21v4 int) = (r21v2 int), (r21v3 int), (r21v2 int), (r21v2 int) binds: [B:70:0x02e0, B:62:0x028a, B:9:0x0079, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r26v5 int) = (r26v3 int), (r26v4 int), (r26v3 int), (r26v3 int) binds: [B:70:0x02e0, B:62:0x028a, B:9:0x0079, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4 = C4263.f13799;
        int i5 = C0050.f910;
        int iM6983 = C2105.m6981("ܰ᩸") ^ i4;
        int i6 = ((iM6983 ^ i5) * 16109) ^ 1908831313;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM6983 ^ 1570134637;
        ActivityC8848 activityC8848 = null;
        int iM2566 = 0;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1061803704;
        int i15 = 0;
        short[] sArr3 = null;
        String strM49334 = null;
        String strM10748 = null;
        String strM7036 = null;
        int i16 = 0;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i5) * 30089) >> 31));
            switch (i14) {
                case -1847500549:
                case 1293077516:
                    C2126.m7040();
                    AbstractC2021.m6574();
                    iM6981 = C0630.m2566("ۤܳ") ^ i4;
                    i = ((iM6981 ^ i5) * (-11763)) ^ (-444248203);
                    i2 = -1895936803;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1768612020:
                case -1730852354:
                    sArr = f67480;
                    i9 = 1;
                    i10 = 3;
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("۟ܶ") ^ i5;
                        i = ((iM6981 ^ i4) * 31055) ^ 1661217407;
                        i2 = -1859738596;
                    } else {
                        iM6981 = C0630.m2566("ۤܳ") ^ i4;
                        i = ((iM6981 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1761631085:
                case 1774881293:
                    sArr3 = f67480;
                    c = 0;
                    if (C22628.m50615() != 0) {
                        iM6981 = (C2105.m6981("ۨᩴ") ^ i5) * (-59);
                        i = ((iM6981 ^ i4) * 6027) ^ (-676584005);
                        i2 = -561898292;
                    } else {
                        iM6981 = (C2105.m6981("ۜ᩷") + i4) * 45;
                        i = ((iM6981 ^ i5) * (-29867)) ^ 1075290859;
                        i2 = -452472465;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1698215360:
                case 203678921:
                    if (this.f67482) {
                        iM6981 = C0630.m2566("᩸ۤ") ^ i5;
                        i = ((iM6981 ^ i4) * (-19979)) ^ (-419124841);
                        i2 = -320811192;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۢ֨")) * 15;
                        i = ((iM6981 ^ i5) * 18349) ^ (-788466205);
                        i2 = -2016637774;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1667582747:
                case 1684648744:
                    i12 = s * s2;
                    i13 = s * s;
                    i15 = 5480281;
                    if (C21923.m49329()) {
                        iM6981 = (C2105.m6981("ۨᩴ") ^ i5) * (-59);
                        i = ((iM6981 ^ i4) * 6027) ^ (-676584005);
                        i2 = -561898292;
                    } else {
                        iM6981 = (C2105.m6981("ܳ֨") ^ i5) * 71;
                        i = ((iM6981 ^ i4) * 30205) ^ 1247619972;
                        i2 = -161182616;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1509140417:
                case -782593368:
                    s = sArr3[c];
                    s2 = 4682;
                    if (C3683.f11629 >= 0) {
                        iM6981 = C0630.m2566("᩷ۜ") ^ i5;
                        i = ((iM6981 ^ i4) * (-19519)) ^ (-1861922479);
                        i2 = -1313543678;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۚ") + i5) * 63;
                        i = ((iM6981 ^ i4) * (-20389)) ^ (-1519068749);
                        i2 = 1225030106;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1446827347:
                case 457191407:
                    C0964.m3413();
                    if (C1005.m3501()) {
                        iM6981 = (C2105.m6981("۬֨") ^ i4) * 63;
                        i = ((iM6981 ^ i5) * 8005) ^ (-816446931);
                        i2 = -1722029082;
                    } else {
                        iM6981 = C0630.m2566("ۤܳ") ^ i4;
                        i = ((iM6981 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1163740870:
                case 331751155:
                    C3245.m9925();
                    break;
                case -933925191:
                case 703841750:
                    i8 = 35515;
                    iM6981 = (i4 - C0630.m2566("֫ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM6981 ^ i5) * 17011) ^ (-350365896);
                    i2 = 1996824896;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -605517661:
                case 273082735:
                    strM10748 = C3537.m10748(f67480, 4, 3, i8);
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C2105.m6981("۬֨") ^ i4) * 63;
                        i = ((iM6981 ^ i5) * 8005) ^ (-816446931);
                        i2 = -1722029082;
                    } else {
                        iM6981 = C2105.m6981("᩸ۜ") ^ i5;
                        i = ((iM6981 ^ i4) * 23169) ^ (-1031392065);
                        i2 = -262677194;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -536306388:
                case -462637382:
                    if ((i13 + i15) - i12 < 0) {
                        iM6981 = (i5 - C2105.m6981("۟ۖ")) * (-41);
                        i = ((iM6981 ^ i4) * 21943) ^ (-1612793136);
                        i2 = -498977572;
                    } else {
                        iM6981 = C0630.m2566("᩸ۙ") ^ i4;
                        i = ((iM6981 ^ i5) * (-12959)) ^ (-1268456787);
                        i2 = -66421520;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -516045023:
                case 217185049:
                    iM6982 = C0630.m2566(strM10748);
                    i3 = 2123661704;
                    i16 = iM6982 ^ i3;
                    iM6981 = (i4 - C2105.m6981("ۛ᩶")) * (-101);
                    i = ((iM6981 ^ i5) * (-13175)) ^ 1516189193;
                    i2 = 1936290283;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -107592776:
                case 918206567:
                    C1005.m3501();
                    if (C1773.m5908() <= 0) {
                        iM6981 = (C2105.m6981("۬֨") ^ i4) * 63;
                        i = ((iM6981 ^ i5) * 8005) ^ (-816446931);
                        i2 = -1722029082;
                    } else {
                        iM6981 = (C2105.m6981("ۨᩴ") ^ i5) * (-59);
                        i = ((iM6981 ^ i4) * 6027) ^ (-676584005);
                        i2 = -561898292;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 55797772:
                case 915188549:
                    iM2566 = 2099879820 ^ C0630.m2566(strM49334);
                    if (C0714.m2805()) {
                        iM6981 = (C0630.m2566("ܳܰ") + i4) * (-69);
                        i = ((iM6981 ^ i5) * 17673) ^ (-631152907);
                        i2 = -1653910205;
                    } else {
                        iM6981 = C0630.m2566("᩸֫") ^ i5;
                        i = ((iM6981 ^ i4) * (-23539)) ^ (-1734278705);
                        i2 = -904093921;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 728464852:
                case 1558744265:
                    activityC8848 = this.f67484;
                    sArr2 = f67480;
                    i11 = 7;
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("ۤܳ") ^ i4;
                        i = ((iM6981 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩺") ^ i5;
                        i = ((iM6981 ^ i4) * 27087) ^ 1594619097;
                        i2 = -1905475026;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 761866995:
                case 1837327712:
                    strM7036 = C2126.m7036(sArr, i9, i10, i8);
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("ۤܳ") ^ i4;
                        i = ((iM6981 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    } else {
                        iM6981 = (C2105.m6981("֫ܿ") + i4) * 53;
                        i = ((iM6981 ^ i5) * (-15871)) ^ (-1574669315);
                        i2 = -1569639979;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 923242845:
                case 2139194468:
                    z = true;
                    activityC8848.m10217(iM2566, i16, true);
                    activityC8848.f26936 = false;
                    if (C1711.f5919) {
                        iM6981 = (C2105.m6981("۬֨") ^ i4) * 63;
                        i = ((iM6981 ^ i5) * 8005) ^ (-816446931);
                        i2 = -1722029082;
                    } else {
                        iM6981 = C2105.m6981("۫۠") ^ i5;
                        i = ((iM6981 ^ i4) * (-17747)) ^ 2101335195;
                        i2 = -1295468623;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 962340388:
                case 2075894794:
                    C0964.m3413();
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("᩷ۜ") ^ i5;
                        i = ((iM6981 ^ i4) * (-19519)) ^ (-1861922479);
                        i2 = -1313543678;
                    } else {
                        iM6981 = C0630.m2566("ۤܳ") ^ i4;
                        i = ((iM6981 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 1213167178:
                case 1315796911:
                    C11876.m29006(activityC8848.f26943);
                    ActivityC16608.f51007 = z;
                    break;
                case 1526849891:
                case 1967871001:
                    iM6982 = C2105.m6981(strM7036);
                    i3 = 2130026090;
                    i16 = iM6982 ^ i3;
                    iM6981 = (i4 - C2105.m6981("ۛ᩶")) * (-101);
                    i = ((iM6981 ^ i5) * (-13175)) ^ 1516189193;
                    i2 = 1936290283;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 1531143676:
                case 1811132592:
                    i8 = 28684;
                    iM6981 = (i4 - C0630.m2566("֫ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM6981 ^ i5) * 17011) ^ (-350365896);
                    i2 = 1996824896;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                default:
                    strM49334 = C21923.m49334(sArr2, i11, 3, i8);
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = (C2105.m6981("ۨᩴ") ^ i5) * (-59);
                        i = ((iM6981 ^ i4) * 6027) ^ (-676584005);
                        i2 = -561898292;
                    } else {
                        iM6981 = C2105.m6981("ۨۢ") ^ i4;
                        i = ((iM6981 ^ i5) * (-10393)) ^ (-476850234);
                        i2 = 47210135;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C0237.m1487(this);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC8848 activityC8848 = null;
        int i = 1335424290;
        int i2 = C1047.f3863;
        int i3 = AbstractC2021.f6743;
        int iM2566 = (C0630.m2566("ۨ۠") ^ i2) * (-33);
        int i4 = ((iM2566 ^ i3) * (-26561)) ^ (-190477834);
        int i5 = -1889666428;
        while (true) {
            i = ((((i ^ i3) * 959) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1884049134:
                case 511067304:
                    ServiceConnectionC3453.m10561(activityC8848, exc, null);
                    break;
                case -1832143715:
                case 368518696:
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("᩵᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6931) ^ 1183488851;
                        i5 = -2067268519;
                    } else {
                        iM2566 = C2105.m6981("ۗܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3059) ^ (-1147741328);
                        i5 = 346819873;
                    }
                    break;
                case -1691428665:
                case -384528556:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM2566 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۫ۛ")) * (-127);
                        i4 = ((iM2566 ^ i3) * 21709) ^ (-626314606);
                        i5 = 872111016;
                    }
                    break;
                case -1623854317:
                case 827601263:
                    if (C0964.m3413()) {
                        iM2566 = (i2 - C2105.m6981("ۧ۬")) * (-77);
                        i4 = ((iM2566 ^ i3) * 31637) ^ 2048393964;
                        i5 = -1572470766;
                    } else {
                        iM2566 = C2105.m6981("᩵᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6931) ^ 1183488851;
                        i5 = -2067268519;
                    }
                    break;
                case -1441169047:
                case -375688376:
                    if (C4159.f13567) {
                        iM2566 = (C2105.m6981("ۚᩳ") + i2) * 23;
                        i4 = ((iM2566 ^ i3) * (-12695)) ^ 797622505;
                        i5 = -1966335451;
                    } else {
                        iM2566 = (C2105.m6981("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM2566 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    }
                    break;
                case -1172586343:
                case 1334798414:
                    ViewOnClickListenerC1958.m6429();
                    C3663.m11168();
                    iM2566 = C2105.m6981("᩵᩷") ^ i2;
                    i4 = ((iM2566 ^ i3) * 6931) ^ 1183488851;
                    i5 = -2067268519;
                    break;
                case -936270620:
                case -253526542:
                    if (C3537.f11231 < 0) {
                        iM2566 = (C2105.m6981("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM2566 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM2566 = C2105.m6981("᩵᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6931) ^ 1183488851;
                        i5 = -2067268519;
                    }
                    break;
                case -781266850:
                case -744690999:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = C2105.m6981("ܰۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20209)) ^ (-936567338);
                        i5 = -1505159205;
                    } else {
                        iM2566 = C2105.m6981("۬ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4303)) ^ 736019907;
                        i5 = -53458403;
                    }
                    break;
                case -501727183:
                case 1110921841:
                    C2105.m6982();
                    if (C0714.f2697 < 0) {
                        iM2566 = C2105.m6981("ܰۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20209)) ^ (-936567338);
                        i5 = -1505159205;
                    } else {
                        iM2566 = (C2105.m6981("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM2566 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    }
                    break;
                case -476304101:
                case 430971266:
                    if (C0964.m3413()) {
                        iM2566 = C0630.m2566("ۢۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-6967)) ^ 295153593;
                        i5 = 1130198509;
                    } else {
                        iM2566 = (C2105.m6981("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM2566 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    }
                    break;
                case -439698537:
                case 1058139083:
                    activityC8848 = this.f67484;
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C0630.m2566("ܶۜ") + i3) * (-31);
                        i4 = ((iM2566 ^ i2) * (-27731)) ^ 2005750451;
                        i5 = 1747466141;
                    } else {
                        iM2566 = (C2105.m6981("ۘۤ") ^ i3) * (-95);
                        i4 = ((iM2566 ^ i2) * 20551) ^ (-1360595056);
                        i5 = 1501114365;
                    }
                    break;
                case -121565175:
                case 1278611147:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM2566 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM2566 = C0630.m2566("ۨᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 26391) ^ (-1794494162);
                        i5 = 1860491513;
                    }
                    break;
                case 163362706:
                case 1064502681:
                    C0422.m1963();
                    break;
                case 180821224:
                case 332042487:
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM2566 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM2566 = C2105.m6981("᩹ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8305)) ^ 1817984839;
                        i5 = 1744668051;
                    }
                    break;
                case 1091557981:
                case 1906873022:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C2105.m6981("᩵᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6931) ^ 1183488851;
                        i5 = -2067268519;
                    } else {
                        iM2566 = C0630.m2566("ۚᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26177) ^ (-405511663);
                        i5 = -55320528;
                    }
                    break;
                default:
                    if (RunnableC1108.m3790()) {
                        iM2566 = (C2105.m6981("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM2566 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM2566 = (C0630.m2566("᩻۟") + i3) * (-101);
                        i4 = ((iM2566 ^ i2) * 11403) ^ (-1375113405);
                        i5 = -559653878;
                    }
                    break;
            }
            return;
        }
    }
}
