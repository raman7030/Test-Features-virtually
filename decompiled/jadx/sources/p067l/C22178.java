package p067l;

import com.google.android.material.slider.BaseSlider;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩷ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 72SJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22178 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩳܶۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f82986 = {8999, -2295, -2608, -9377, -5772, -2562, -1221, 6578, 5592, -11284, 1352, 27843, -30221, -26572, 882, 22580, 22635, 22647, 22638, 22652, 22642, 22645, 22580, 22655, 22654, 22637, 22580, 22632, 22654, 22639, 22582, 22642, 22645, 22653, 22644, 22642, 22655, 22655, 22654, 22632, 22648, 22633, 22642, 22635, 22639, 22642, 22644, 22645, 22638, 22635, 22655, 22650, 22639, 22654, 22616, 22644, 22645, 22639, 22654, 22645, 22639, 22633, 22654, 22637, 22642, 22654, 22636};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ JSONObject f70163;

    /* JADX INFO: renamed from: ܳ */
    public boolean f70164;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ JSONObject f70165;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC10778 f70166;

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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55680;
        int i;
        int i2;
        int i3 = RunnableC0938.f81886;
        int i4 = C0989.f81920;
        int iM55979 = C0946.m55979("ᩴ᩶") ^ i4;
        int i5 = ((iM55979 ^ i3) * (-14753)) ^ 521818738;
        String strM55863 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-723318498);
        ActivityC10778 activityC10778 = null;
        int iM559710 = 0;
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
                    C1024.m56209();
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("ܺ᩷") ^ i3) * (-61);
                        i = ((iM55680 ^ i4) * 22229) ^ 1920778893;
                        i2 = -1811166495;
                    } else {
                        iM55680 = C0873.m55680("ᩴܿ") ^ i3;
                        i = ((iM55680 ^ i4) * (-21015)) ^ 391379839;
                        i2 = -2074806073;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2078768618:
                case 2036297404:
                    strM55863 = C0927.m55863(sArr2, i13, 3, i12);
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("ᩴܿ") ^ i3;
                        i = ((iM55680 ^ i4) * (-21015)) ^ 391379839;
                        i2 = -2074806073;
                    } else {
                        iM55680 = (C0946.m55979("ۤۢ") ^ i3) * 3;
                        i = ((iM55680 ^ i4) * (-21831)) ^ (-2087471402);
                        i2 = -274228305;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2078756521:
                case 1358397434:
                    int i15 = i10 + i11;
                    if ((i15 + i15) - i9 < 0) {
                        iM55680 = C0873.m55680("۟ܰ") ^ i3;
                        i = ((iM55680 ^ i4) * 8121) ^ 1618865978;
                        i2 = -1848438711;
                    } else {
                        iM55680 = (C0873.m55680("᩻ۛ") + i4) * 7;
                        i = ((iM55680 ^ i3) * 19987) ^ 677112639;
                        i2 = -199123116;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1969213285:
                case 1076560693:
                    i12 = 58715;
                    iM55680 = (C0946.m55979("᩺ܰ") ^ i4) * 87;
                    i = ((iM55680 ^ i3) * 20537) ^ 1630403449;
                    i2 = 1734925180;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1861506515:
                case 46435665:
                    i13 = 11;
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("᩺۠") ^ i4;
                        i = ((iM55680 ^ i3) * 7527) ^ 1987569527;
                        i2 = 1899586343;
                    } else {
                        iM55680 = (C0873.m55680("ܺ᩷") ^ i3) * (-61);
                        i = ((iM55680 ^ i4) * 22229) ^ 1920778893;
                        i2 = -1811166495;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1857558381:
                case -1460940636:
                    C0930.m55885();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55680 = (C0946.m55979("ۜ֡") ^ i4) * 85;
                        i = ((iM55680 ^ i3) * (-29229)) ^ (-156785948);
                        i2 = -1140833740;
                    } else {
                        iM55680 = (i4 - C0873.m55680("۠᩹")) * 55;
                        i = ((iM55680 ^ i3) * 13507) ^ 144594945;
                        i2 = -1242192454;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1692499753:
                case 1471892427:
                    c = '\n';
                    if (C0863.f81833 <= 0) {
                        iM55680 = (i4 - C0873.m55680("۠᩹")) * 55;
                        i = ((iM55680 ^ i3) * 13507) ^ 144594945;
                        i2 = -1242192454;
                    } else {
                        iM55680 = (C0873.m55680("ۜܽ") + i4) * 47;
                        i = ((iM55680 ^ i3) * 31491) ^ (-1501958613);
                        i2 = 112801468;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1678508345:
                case 703286411:
                    activityC10778 = this.f70166;
                    sArr2 = f82986;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0946.m55979("ۜ֡") ^ i4) * 85;
                        i = ((iM55680 ^ i3) * (-29229)) ^ (-156785948);
                        i2 = -1140833740;
                    } else {
                        iM55680 = C0946.m55979("۫ܳ") ^ i3;
                        i = ((iM55680 ^ i4) * 32611) ^ (-1293427613);
                        i2 = -1826123821;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1199150017:
                case 364125350:
                    C0866.m55645();
                    C1003.m56123();
                    iM55680 = (C0946.m55979("ۜ֡") ^ i4) * 85;
                    i = ((iM55680 ^ i3) * (-29229)) ^ (-156785948);
                    i2 = -1140833740;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1037270729:
                case 1229971305:
                    i8 = s + 5625;
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("ۖ᩸") ^ i4;
                        i = ((iM55680 ^ i3) * (-8789)) ^ 308538297;
                        i2 = -1354216527;
                    } else {
                        iM55680 = (i4 - C0873.m55680("۟᩷")) * (-61);
                        i = ((iM55680 ^ i3) * 12761) ^ 2100631210;
                        i2 = -1712989361;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -988746649:
                case 252650194:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C1046.f81962 <= 0) {
                        iM55680 = (i4 - C0873.m55680("۠᩹")) * 55;
                        i = ((iM55680 ^ i3) * 13507) ^ 144594945;
                        i2 = -1242192454;
                    } else {
                        iM55680 = C0946.m55979("᩺᩵") ^ i4;
                        i = ((iM55680 ^ i3) * 79) ^ (-803858079);
                        i2 = 982536823;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -810432549:
                case 139665888:
                    i11 = 31640625;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۜ֡") ^ i4) * 85;
                        i = ((iM55680 ^ i3) * (-29229)) ^ (-156785948);
                        i2 = -1140833740;
                    } else {
                        iM55680 = C0873.m55680("᩻᩺") ^ i3;
                        i = ((iM55680 ^ i4) * 20395) ^ (-1777595301);
                        i2 = -1055395953;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -666237042:
                case 1689653722:
                    C1124.m56367();
                    break;
                case 3150674:
                case 690214468:
                    i12 = 42001;
                    iM55680 = (C0946.m55979("᩺ܰ") ^ i4) * 87;
                    i = ((iM55680 ^ i3) * 20537) ^ 1630403449;
                    i2 = 1734925180;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 186553345:
                case 532470056:
                    C0906.m55809();
                    if (C0949.m56012()) {
                        iM55680 = (C0946.m55979("ۜ֡") ^ i4) * 85;
                        i = ((iM55680 ^ i3) * (-29229)) ^ (-156785948);
                        i2 = -1140833740;
                    } else {
                        iM55680 = C0873.m55680("ᩴܿ") ^ i3;
                        i = ((iM55680 ^ i4) * (-21015)) ^ 391379839;
                        i2 = -2074806073;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 566402315:
                case 1641376024:
                    sArr = f82986;
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("ۖ᩸") ^ i4;
                        i = ((iM55680 ^ i3) * (-8789)) ^ 308538297;
                        i2 = -1354216527;
                    } else {
                        iM55680 = (C0873.m55680("᩻ۙ") + i3) * (-115);
                        i = ((iM55680 ^ i4) * (-7507)) ^ (-694395345);
                        i2 = 580231683;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 582549745:
                case 1545158475:
                    m22243(activityC10778, iM559710 ^ i7);
                    break;
                case 1510904403:
                case 1972957910:
                    iM559710 = C0946.m55979(strM55863);
                    i7 = 2097161052;
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("ۖ᩸") ^ i4;
                        i = ((iM55680 ^ i3) * (-8789)) ^ 308538297;
                        i2 = -1354216527;
                    } else {
                        iM55680 = (C0946.m55979("ܶܿ") + i3) * 69;
                        i = ((iM55680 ^ i4) * (-16173)) ^ 1231093890;
                        i2 = 1880119950;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = sArr[c];
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ᩴܿ") ^ i3;
                        i = ((iM55680 ^ i4) * (-21015)) ^ 391379839;
                        i2 = -2074806073;
                    } else {
                        iM55680 = C0946.m55979("ܿۚ") ^ i3;
                        i = ((iM55680 ^ i4) * 6757) ^ (-85603776);
                        i2 = -659757256;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C22178(ActivityC10778 activityC10778, JSONObject jSONObject, JSONObject jSONObject2) {
        int i = -553724794;
        int i2 = C1053.f81965;
        int i3 = C1017.f81942;
        this.f70166 = activityC10778;
        this.f70163 = jSONObject;
        this.f70165 = jSONObject2;
        int iM55979 = C0946.m55979("᩹۟") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-3679)) ^ (-1283901701);
        int i5 = -429988809;
        while (true) {
            i = (iM55979 ^ i5) ^ (i4 & (((i ^ i3) * (-16167)) >> 31));
            switch (i) {
                case -2092224395:
                case 1687003721:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("ᩳۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27199)) ^ (-1188980545);
                        i5 = 2008186986;
                    } else {
                        iM55979 = (C0946.m55979("۬᩵") ^ i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-3441)) ^ 1331429195;
                        i5 = -1014121239;
                    }
                    break;
                case -1509378329:
                case 1013631549:
                    C1929.m56553();
                    C0989.m56095();
                    iM55979 = C0873.m55680("᩺ۙ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-26345)) ^ (-1815296642);
                    i5 = 1648282873;
                    break;
                case -968301896:
                case 1843887846:
                    if (!C0890.m55740()) {
                        iM55979 = C0873.m55680("᩺ۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26345)) ^ (-1815296642);
                        i5 = 1648282873;
                    } else {
                        iM55979 = C0873.m55680("ᩳۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27199)) ^ (-1188980545);
                        i5 = 2008186986;
                    }
                    break;
                case -728111477:
                case 1449254478:
                    C0894.m55769();
                    throw new RuntimeException();
                case -548922267:
                case -80174758:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = C0873.m55680("᩺ۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26345)) ^ (-1815296642);
                        i5 = 1648282873;
                    } else {
                        iM55979 = (C0946.m55979("ۜᩳ") ^ i3) * 115;
                        i4 = ((iM55979 ^ i2) * (-23999)) ^ 1752749971;
                        i5 = 1376551054;
                    }
                    break;
                case -112837698:
                case 2069072595:
                    return;
                default:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ۤ᩵") + i2) * 49;
                        i4 = ((iM55979 ^ i3) * 10475) ^ 2068217758;
                        i5 = -18255181;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۬֫")) * 59;
                        i4 = ((iM55979 ^ i2) * 8915) ^ (-573819170);
                        i5 = -1405802185;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0143 A[PHI: r14 r15
      0x0143: PHI (r14v7 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:35:0x0141, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r15v7 int) = (r15v3 int), (r15v2 int) binds: [B:35:0x0141, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        C19179 c19179M43668;
        short[] sArr;
        int i;
        String str;
        int iM55979;
        C19179 c19179;
        int i2;
        short s;
        short[] sArr2;
        String str2;
        int iM559710;
        int i3;
        int i4;
        short[] sArr3;
        short s2;
        int iM559711;
        int i5;
        int i6;
        int iM559712;
        int i7;
        int iM55680;
        int i8;
        C22178 c22178 = this;
        int i9 = C1053.f81965;
        int i10 = C1124.f82007;
        int iM55681 = C0873.m55680("ۡᩴ") ^ i9;
        int i11 = ((iM55681 ^ i10) * (-3673)) ^ (-2115499893);
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i12 = iM55681 ^ 1880482284;
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
        C16496 c16496M43674 = null;
        String strM55639 = null;
        String strM56161 = null;
        String strM556310 = null;
        String strM56144 = null;
        C19179 c191710 = null;
        while (true) {
            i19 = i12 ^ (i11 & (((i19 ^ i10) * 14197) >> 31));
            switch (i19) {
                case -1938178407:
                case 1786588174:
                    sArr3 = sArr5;
                    str2 = str3;
                    s2 = sArr4[c];
                    i17 = s2 * s2;
                    if (C1124.f82007 >= 0) {
                        iM559711 = (i9 - C0873.m55680("ۡ᩺")) * 115;
                        i3 = ((iM559711 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                    } else {
                        iM559711 = (C0946.m55979("ܳ᩺") ^ i10) * (-3);
                        i3 = ((iM559711 ^ i9) * (-2131)) ^ (-1921975778);
                        i5 = -79115120;
                    }
                    int i20 = iM559711 ^ i5;
                    sArr5 = sArr3;
                    str3 = str2;
                    s3 = s2;
                    i12 = i20;
                    i11 = i3;
                    c22178 = this;
                    break;
                case -1911846868:
                case -50035092:
                    C1194.m56396();
                    if (C0992.f81922 < 0) {
                        iM55680 = C0946.m55979("ۜܿ") ^ i10;
                        i6 = ((iM55680 ^ i9) * (-29421)) ^ 1353883796;
                        i8 = -1077437414;
                    } else {
                        iM55680 = C0873.m55680("ۘ᩹") ^ i10;
                        i6 = ((iM55680 ^ i9) * (-19275)) ^ (-2117121662);
                        i8 = -1269886525;
                    }
                    i12 = iM55680 ^ i8;
                    i11 = i6;
                    break;
                case -1816982450:
                case 1213733939:
                    str2 = str3;
                    c191710.m43676();
                    sArr6 = f82986;
                    i13 = 35;
                    i14 = 2;
                    if (C0912.f81867 > 0) {
                        iM559712 = C0946.m55979("ۚܰ") ^ i10;
                        i6 = ((iM559712 ^ i9) * 8773) ^ (-345923871);
                        i7 = -1546606958;
                        int i21 = iM559712 ^ i7;
                        str3 = str2;
                        i12 = i21;
                        i11 = i6;
                    } else {
                        s2 = s3;
                        sArr3 = sArr5;
                        iM559711 = (i9 - C0873.m55680("ۡ᩺")) * 115;
                        i3 = ((iM559711 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                        int i22 = iM559711 ^ i5;
                        sArr5 = sArr3;
                        str3 = str2;
                        s3 = s2;
                        i12 = i22;
                        i11 = i3;
                        c22178 = this;
                    }
                    break;
                case -1490325990:
                case 1421429329:
                    strM56161 = ServiceConnectionC1013.m56161(sArr8, i16, 13, i15);
                    strM55639 = C0863.m55639(c22178.f70165);
                    if (C0989.f81920 < 0) {
                        iM55680 = (C0946.m55979("᩻᩹") ^ i10) * (-45);
                        i6 = ((iM55680 ^ i9) * 3223) ^ (-1542860657);
                        i8 = 535976107;
                        i12 = iM55680 ^ i8;
                        i11 = i6;
                    } else {
                        s2 = s3;
                        sArr3 = sArr5;
                        str2 = str3;
                        iM559711 = (i9 - C0873.m55680("ۡ᩺")) * 115;
                        i3 = ((iM559711 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                        int i23 = iM559711 ^ i5;
                        sArr5 = sArr3;
                        str3 = str2;
                        s3 = s2;
                        i12 = i23;
                        i11 = i3;
                        c22178 = this;
                    }
                    break;
                case -1322890578:
                case 1391486894:
                    C0877.m55696();
                    return;
                case -1176636538:
                case -1022312800:
                    str2 = str3;
                    s = s3;
                    sArr2 = sArr5;
                    if ((i17 + 82719025) - (s * 18190) < 0) {
                        iM559710 = (C0946.m55979("ۖۖ") ^ i9) * (-15);
                        i3 = ((iM559710 ^ i10) * 13985) ^ (-248266841);
                        i4 = -768849244;
                    } else {
                        iM559710 = C0946.m55979("֡ۛ") ^ i10;
                        i3 = ((iM559710 ^ i9) * 29967) ^ 508843743;
                        i4 = -359868152;
                    }
                    int i24 = iM559710 ^ i4;
                    sArr5 = sArr2;
                    str3 = str2;
                    i12 = i24;
                    s3 = s;
                    i11 = i3;
                    c22178 = this;
                    break;
                case -935525408:
                case 1827613567:
                    ServiceConnectionC1013.m56150(c191710, strM56144, strM556310);
                    sArr8 = f82986;
                    i16 = 48;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("ۘ᩹") ^ i10;
                        i6 = ((iM55680 ^ i9) * (-19275)) ^ (-2117121662);
                        i8 = -1269886525;
                    } else {
                        iM55680 = C0873.m55680("ۨۗ") ^ i10;
                        i6 = ((iM55680 ^ i9) * 13437) ^ (-493182181);
                        i8 = 1243386530;
                    }
                    i12 = iM55680 ^ i8;
                    i11 = i6;
                    break;
                case -835750581:
                case -642671876:
                    C1028.m56247();
                    iM55680 = C0946.m55979("ۜܿ") ^ i10;
                    i6 = ((iM55680 ^ i9) * (-29421)) ^ 1353883796;
                    i8 = -1077437414;
                    i12 = iM55680 ^ i8;
                    i11 = i6;
                    break;
                case -725472005:
                case 1897774260:
                    strM56144 = C1012.m56144(sArr7, 37, 11, i15);
                    strM556310 = C0863.m55639(c22178.f70163);
                    if (C0854.f81826 == 0) {
                        iM55680 = C0873.m55680("ܳ᩹") ^ i9;
                        i6 = ((iM55680 ^ i10) * (-15059)) ^ (-207258694);
                        i8 = -60697746;
                        i12 = iM55680 ^ i8;
                        i11 = i6;
                    } else {
                        s2 = s3;
                        sArr3 = sArr5;
                        str2 = str3;
                        iM559711 = (i9 - C0873.m55680("ۡ᩺")) * 115;
                        i3 = ((iM559711 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                        int i25 = iM559711 ^ i5;
                        sArr5 = sArr3;
                        str3 = str2;
                        s3 = s2;
                        i12 = i25;
                        i11 = i3;
                        c22178 = this;
                    }
                    break;
                case -475793935:
                case 129715205:
                    i15 = 22555;
                    int iM55682 = C0873.m55680("ۘܽ") ^ i9;
                    i11 = ((iM55682 ^ i10) * (-679)) ^ 1248810300;
                    sArr5 = sArr5;
                    str3 = str3;
                    i12 = iM55682 ^ 2081578662;
                    c22178 = this;
                    break;
                case -353927122:
                case 912139555:
                    if (C1044.f81959 < 0) {
                        c19179M43668 = c191710;
                        sArr = sArr5;
                        i = i18;
                        str = str3;
                        iM55979 = C0946.m55979("ۜ᩷") ^ i9;
                        c19179 = c19179M43668;
                        i11 = ((iM55979 ^ i10) * (-30855)) ^ (-746303757);
                        i2 = -93080712;
                        int i26 = iM55979 ^ i2;
                        str3 = str;
                        i12 = i26;
                        sArr5 = sArr;
                        C19179 c191711 = c19179;
                        i18 = i;
                        c191710 = c191711;
                    } else {
                        iM55680 = C0946.m55979("ۜܿ") ^ i10;
                        i6 = ((iM55680 ^ i9) * (-29421)) ^ 1353883796;
                        i8 = -1077437414;
                        i12 = iM55680 ^ i8;
                        i11 = i6;
                    }
                    break;
                case 331762734:
                case 1108580348:
                    throw new C3924(c16496M43674.m37418());
                case 868294995:
                case 2116791001:
                    str2 = str3;
                    sArr5 = f82986;
                    i18 = 15;
                    if (C0854.m55595() < 0) {
                        iM559712 = (C0946.m55979("ۙ۫") + i10) * 119;
                        i6 = ((iM559712 ^ i9) * 8739) ^ 1299920935;
                        i7 = -1868802293;
                        int i27 = iM559712 ^ i7;
                        str3 = str2;
                        i12 = i27;
                        i11 = i6;
                    } else {
                        s = s3;
                        str3 = str2;
                        int iM559713 = C0946.m55979("᩶᩷") ^ i10;
                        i6 = ((iM559713 ^ i9) * 9215) ^ 202888527;
                        i12 = iM559713 ^ (-613790795);
                        c22178 = this;
                        s3 = s;
                        i11 = i6;
                    }
                    break;
                case 1017249740:
                case 2118215412:
                    i15 = 37037;
                    int iM55683 = C0873.m55680("ۘܽ") ^ i9;
                    i11 = ((iM55683 ^ i10) * (-679)) ^ 1248810300;
                    sArr5 = sArr5;
                    str3 = str3;
                    i12 = iM55683 ^ 2081578662;
                    c22178 = this;
                    break;
                case 1145644919:
                case 1199355112:
                    s = s3;
                    sArr2 = sArr5;
                    str2 = str3;
                    sArr4 = f82986;
                    c = 14;
                    if (RunnableC0938.f81886 < 0) {
                        iM559710 = C0946.m55979("ۖ֫") ^ i9;
                        i3 = ((iM559710 ^ i10) * 18853) ^ 118813253;
                        i4 = -1205514716;
                        int i28 = iM559710 ^ i4;
                        sArr5 = sArr2;
                        str3 = str2;
                        i12 = i28;
                        s3 = s;
                        i11 = i3;
                        c22178 = this;
                    } else {
                        sArr5 = sArr2;
                        str3 = str2;
                        int iM559714 = C0946.m55979("᩶᩷") ^ i10;
                        i6 = ((iM559714 ^ i9) * 9215) ^ 202888527;
                        i12 = iM559714 ^ (-613790795);
                        c22178 = this;
                        s3 = s;
                        i11 = i6;
                    }
                    break;
                case 1213115627:
                case 1361331421:
                    short[] sArr9 = sArr5;
                    str3 = c22178.f70166.f29866;
                    int i29 = C17837.f53209;
                    if (C1964.f83032 > 0) {
                        int iM559715 = (i10 - C0946.m55979("ܳ᩻")) * (-85);
                        i12 = iM559715 ^ 247727798;
                        i11 = ((iM559715 ^ i9) * 19085) ^ (-1447107741);
                        sArr5 = sArr9;
                        c22178 = this;
                    } else {
                        sArr5 = sArr9;
                        s = s3;
                        int iM559716 = C0946.m55979("᩶᩷") ^ i10;
                        i6 = ((iM559716 ^ i9) * 9215) ^ 202888527;
                        i12 = iM559716 ^ (-613790795);
                        c22178 = this;
                        s3 = s;
                        i11 = i6;
                    }
                    break;
                case 1234438527:
                case 1323785555:
                    String str4 = str3;
                    C1044.m56278(c191710, C0949.m56016(sArr6, i13, i14, i15), str4);
                    sArr7 = f82986;
                    if (!C0955.f81898) {
                        iM559712 = C0946.m55979("ۚ۫") ^ i9;
                        str2 = str4;
                        i6 = ((iM559712 ^ i10) * 21059) ^ (-715837883);
                        i7 = 1161907917;
                        int i210 = iM559712 ^ i7;
                        str3 = str2;
                        i12 = i210;
                        i11 = i6;
                    } else {
                        str2 = str4;
                        s2 = s3;
                        sArr3 = sArr5;
                        iM559711 = (i9 - C0873.m55680("ۡ᩺")) * 115;
                        i3 = ((iM559711 ^ i10) * 27857) ^ 870800106;
                        i5 = 2046708401;
                        int i211 = iM559711 ^ i5;
                        sArr5 = sArr3;
                        str3 = str2;
                        s3 = s2;
                        i12 = i211;
                        i11 = i3;
                        c22178 = this;
                    }
                    break;
                case 1379541952:
                case 1550080714:
                    ServiceConnectionC1013.m56150(c191710, strM56161, strM55639);
                    c16496M43674 = c191710.m43674();
                    if (c16496M43674.m37422()) {
                        iM55680 = C0873.m55680("ܰ۟") ^ i9;
                        i6 = ((iM55680 ^ i10) * (-4447)) ^ 195326883;
                        i8 = 1821895018;
                    } else {
                        iM55680 = (C0946.m55979("᩹ۧ") ^ i9) * 19;
                        i6 = ((iM55680 ^ i10) * 29749) ^ (-1307495205);
                        i8 = -1591872082;
                    }
                    i12 = iM55680 ^ i8;
                    i11 = i6;
                    break;
                case 1489708525:
                case 1968576670:
                    c22178.f70164 = c16496M43674.m37416(ServiceConnectionC1013.m56161(f82986, 61, 6, i15));
                    return;
                case 1501093685:
                case 1757581633:
                    C0894.m55769();
                    if (!C0937.f81884) {
                        c19179M43668 = c191710;
                        sArr = sArr5;
                        i = i18;
                        str = str3;
                        iM55979 = C0946.m55979("ۜ᩷") ^ i9;
                        c19179 = c19179M43668;
                        i11 = ((iM55979 ^ i10) * (-30855)) ^ (-746303757);
                        i2 = -93080712;
                        int i212 = iM55979 ^ i2;
                        str3 = str;
                        i12 = i212;
                        sArr5 = sArr;
                        C19179 c191712 = c19179;
                        i18 = i;
                        c191710 = c191712;
                    } else {
                        s = s3;
                        int iM559717 = C0946.m55979("᩶᩷") ^ i10;
                        i6 = ((iM559717 ^ i9) * 9215) ^ 202888527;
                        i12 = iM559717 ^ (-613790795);
                        c22178 = this;
                        s3 = s;
                        i11 = i6;
                    }
                    break;
                default:
                    str = str3;
                    sArr = sArr5;
                    i = i18;
                    c19179M43668 = C19179.m43668(RunnableC0938.m55936(sArr, i, 20, i15));
                    if (C1025.m56230()) {
                        iM55979 = C0946.m55979("ۜ᩷") ^ i9;
                        c19179 = c19179M43668;
                        i11 = ((iM55979 ^ i10) * (-30855)) ^ (-746303757);
                        i2 = -93080712;
                    } else {
                        iM55979 = (C0946.m55979("۠ۗ") ^ i9) * (-61);
                        c19179 = c19179M43668;
                        i11 = ((iM55979 ^ i10) * (-6421)) ^ (-462787885);
                        i2 = -847102738;
                    }
                    int i213 = iM55979 ^ i2;
                    str3 = str;
                    i12 = i213;
                    sArr5 = sArr;
                    C19179 c191713 = c19179;
                    i18 = i;
                    c191710 = c191713;
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4 = C1053.f81965;
        int i5 = C0845.f81821;
        int iM559711 = C0946.m55979("ܰ᩸") ^ i4;
        int i6 = ((iM559711 ^ i5) * 16109) ^ 1908831313;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559711 ^ 1570134637;
        ActivityC10778 activityC10778 = null;
        int iM55680 = 0;
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
        String strM56558 = null;
        String strM56189 = null;
        String strM55993 = null;
        int i16 = 0;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i5) * 30089) >> 31));
            switch (i14) {
                case -1847500549:
                case 1293077516:
                    C0947.m55997();
                    AbstractC0942.m55971();
                    iM55979 = C0873.m55680("ۤܳ") ^ i4;
                    i = ((iM55979 ^ i5) * (-11763)) ^ (-444248203);
                    i2 = -1895936803;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1768612020:
                case -1730852354:
                    sArr = f82986;
                    i9 = 1;
                    i10 = 3;
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("۟ܶ") ^ i5;
                        i = ((iM55979 ^ i4) * 31055) ^ 1661217407;
                        i2 = -1859738596;
                    } else {
                        iM55979 = C0873.m55680("ۤܳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1761631085:
                case 1774881293:
                    sArr3 = f82986;
                    c = 0;
                    if (C1964.m56597() != 0) {
                        iM55979 = (C0946.m55979("ۨᩴ") ^ i5) * (-59);
                        i = ((iM55979 ^ i4) * 6027) ^ (-676584005);
                        i2 = -561898292;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩷") + i4) * 45;
                        i = ((iM55979 ^ i5) * (-29867)) ^ 1075290859;
                        i2 = -452472465;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1698215360:
                case 203678921:
                    if (this.f70164) {
                        iM55979 = C0873.m55680("᩸ۤ") ^ i5;
                        i = ((iM55979 ^ i4) * (-19979)) ^ (-419124841);
                        i2 = -320811192;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۢ֨")) * 15;
                        i = ((iM55979 ^ i5) * 18349) ^ (-788466205);
                        i2 = -2016637774;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1667582747:
                case 1684648744:
                    i12 = s * s2;
                    i13 = s * s;
                    i15 = 5480281;
                    if (C1929.m56553()) {
                        iM55979 = (C0946.m55979("ۨᩴ") ^ i5) * (-59);
                        i = ((iM55979 ^ i4) * 6027) ^ (-676584005);
                        i2 = -561898292;
                    } else {
                        iM55979 = (C0946.m55979("ܳ֨") ^ i5) * 71;
                        i = ((iM55979 ^ i4) * 30205) ^ 1247619972;
                        i2 = -161182616;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1509140417:
                case -782593368:
                    s = sArr3[c];
                    s2 = 4682;
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0873.m55680("᩷ۜ") ^ i5;
                        i = ((iM55979 ^ i4) * (-19519)) ^ (-1861922479);
                        i2 = -1313543678;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۚ") + i5) * 63;
                        i = ((iM55979 ^ i4) * (-20389)) ^ (-1519068749);
                        i2 = 1225030106;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1446827347:
                case 457191407:
                    C0890.m55740();
                    if (C0892.m55749()) {
                        iM55979 = (C0946.m55979("۬֨") ^ i4) * 63;
                        i = ((iM55979 ^ i5) * 8005) ^ (-816446931);
                        i2 = -1722029082;
                    } else {
                        iM55979 = C0873.m55680("ۤܳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1163740870:
                case 331751155:
                    C1003.m56123();
                    break;
                case -933925191:
                case 703841750:
                    i8 = 35515;
                    iM55979 = (i4 - C0873.m55680("֫ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM55979 ^ i5) * 17011) ^ (-350365896);
                    i2 = 1996824896;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -605517661:
                case 273082735:
                    strM56189 = C1017.m56189(f82986, 4, 3, i8);
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0946.m55979("۬֨") ^ i4) * 63;
                        i = ((iM55979 ^ i5) * 8005) ^ (-816446931);
                        i2 = -1722029082;
                    } else {
                        iM55979 = C0946.m55979("᩸ۜ") ^ i5;
                        i = ((iM55979 ^ i4) * 23169) ^ (-1031392065);
                        i2 = -262677194;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -536306388:
                case -462637382:
                    if ((i13 + i15) - i12 < 0) {
                        iM55979 = (i5 - C0946.m55979("۟ۖ")) * (-41);
                        i = ((iM55979 ^ i4) * 21943) ^ (-1612793136);
                        i2 = -498977572;
                    } else {
                        iM55979 = C0873.m55680("᩸ۙ") ^ i4;
                        i = ((iM55979 ^ i5) * (-12959)) ^ (-1268456787);
                        i2 = -66421520;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -516045023:
                case 217185049:
                    iM559710 = C0873.m55680(strM56189);
                    i3 = 2123661704;
                    i16 = iM559710 ^ i3;
                    iM55979 = (i4 - C0946.m55979("ۛ᩶")) * (-101);
                    i = ((iM55979 ^ i5) * (-13175)) ^ 1516189193;
                    i2 = 1936290283;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -107592776:
                case 918206567:
                    C0892.m55749();
                    if (C0930.m55885() <= 0) {
                        iM55979 = (C0946.m55979("۬֨") ^ i4) * 63;
                        i = ((iM55979 ^ i5) * 8005) ^ (-816446931);
                        i2 = -1722029082;
                    } else {
                        iM55979 = (C0946.m55979("ۨᩴ") ^ i5) * (-59);
                        i = ((iM55979 ^ i4) * 6027) ^ (-676584005);
                        i2 = -561898292;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 55797772:
                case 915188549:
                    iM55680 = 2099879820 ^ C0873.m55680(strM56558);
                    if (C0877.m55696()) {
                        iM55979 = (C0873.m55680("ܳܰ") + i4) * (-69);
                        i = ((iM55979 ^ i5) * 17673) ^ (-631152907);
                        i2 = -1653910205;
                    } else {
                        iM55979 = C0873.m55680("᩸֫") ^ i5;
                        i = ((iM55979 ^ i4) * (-23539)) ^ (-1734278705);
                        i2 = -904093921;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 728464852:
                case 1558744265:
                    activityC10778 = this.f70166;
                    sArr2 = f82986;
                    i11 = 7;
                    if (C0917.f81868) {
                        iM55979 = C0873.m55680("ۤܳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    } else {
                        iM55979 = C0946.m55979("ܰ᩺") ^ i5;
                        i = ((iM55979 ^ i4) * 27087) ^ 1594619097;
                        i2 = -1905475026;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 761866995:
                case 1837327712:
                    strM55993 = C0947.m55993(sArr, i9, i10, i8);
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("ۤܳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    } else {
                        iM55979 = (C0946.m55979("֫ܿ") + i4) * 53;
                        i = ((iM55979 ^ i5) * (-15871)) ^ (-1574669315);
                        i2 = -1569639979;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 923242845:
                case 2139194468:
                    z = true;
                    activityC10778.m12253(iM55680, i16, true);
                    activityC10778.f29859 = false;
                    if (C0927.f81875) {
                        iM55979 = (C0946.m55979("۬֨") ^ i4) * 63;
                        i = ((iM55979 ^ i5) * 8005) ^ (-816446931);
                        i2 = -1722029082;
                    } else {
                        iM55979 = C0946.m55979("۫۠") ^ i5;
                        i = ((iM55979 ^ i4) * (-17747)) ^ 2101335195;
                        i2 = -1295468623;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 962340388:
                case 2075894794:
                    C0890.m55740();
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("᩷ۜ") ^ i5;
                        i = ((iM55979 ^ i4) * (-19519)) ^ (-1861922479);
                        i2 = -1313543678;
                    } else {
                        iM55979 = C0873.m55680("ۤܳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-11763)) ^ (-444248203);
                        i2 = -1895936803;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 1213167178:
                case 1315796911:
                    C13656.m31058(activityC10778.f29866);
                    ActivityC18153.f54185 = z;
                    break;
                case 1526849891:
                case 1967871001:
                    iM559710 = C0946.m55979(strM55993);
                    i3 = 2130026090;
                    i16 = iM559710 ^ i3;
                    iM55979 = (i4 - C0946.m55979("ۛ᩶")) * (-101);
                    i = ((iM55979 ^ i5) * (-13175)) ^ 1516189193;
                    i2 = 1936290283;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 1531143676:
                case 1811132592:
                    i8 = 28684;
                    iM55979 = (i4 - C0873.m55680("֫ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM55979 ^ i5) * 17011) ^ (-350365896);
                    i2 = 1996824896;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                default:
                    strM56558 = C1929.m56558(sArr2, i11, 3, i8);
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55979 = (C0946.m55979("ۨᩴ") ^ i5) * (-59);
                        i = ((iM55979 ^ i4) * 6027) ^ (-676584005);
                        i2 = -561898292;
                    } else {
                        iM55979 = C0946.m55979("ۨۢ") ^ i4;
                        i = ((iM55979 ^ i5) * (-10393)) ^ (-476850234);
                        i2 = 47210135;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C0854.m55601(this);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC10778 activityC10778 = null;
        int i = 1335424290;
        int i2 = C0894.f81854;
        int i3 = AbstractC0942.f81890;
        int iM55680 = (C0873.m55680("ۨ۠") ^ i2) * (-33);
        int i4 = ((iM55680 ^ i3) * (-26561)) ^ (-190477834);
        int i5 = -1889666428;
        while (true) {
            i = ((((i ^ i3) * 959) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1884049134:
                case 511067304:
                    ServiceConnectionC1013.m56155(activityC10778, exc, null);
                    break;
                case -1832143715:
                case 368518696:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("᩵᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6931) ^ 1183488851;
                        i5 = -2067268519;
                    } else {
                        iM55680 = C0946.m55979("ۗܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3059) ^ (-1147741328);
                        i5 = 346819873;
                    }
                    break;
                case -1691428665:
                case -384528556:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0946.m55979("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM55680 = (i2 - C0946.m55979("۫ۛ")) * (-127);
                        i4 = ((iM55680 ^ i3) * 21709) ^ (-626314606);
                        i5 = 872111016;
                    }
                    break;
                case -1623854317:
                case 827601263:
                    if (C0890.m55740()) {
                        iM55680 = (i2 - C0946.m55979("ۧ۬")) * (-77);
                        i4 = ((iM55680 ^ i3) * 31637) ^ 2048393964;
                        i5 = -1572470766;
                    } else {
                        iM55680 = C0946.m55979("᩵᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6931) ^ 1183488851;
                        i5 = -2067268519;
                    }
                    break;
                case -1441169047:
                case -375688376:
                    if (C1048.f81963) {
                        iM55680 = (C0946.m55979("ۚᩳ") + i2) * 23;
                        i4 = ((iM55680 ^ i3) * (-12695)) ^ 797622505;
                        i5 = -1966335451;
                    } else {
                        iM55680 = (C0946.m55979("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    }
                    break;
                case -1172586343:
                case 1334798414:
                    ViewOnClickListenerC0939.m55941();
                    C1024.m56209();
                    iM55680 = C0946.m55979("᩵᩷") ^ i2;
                    i4 = ((iM55680 ^ i3) * 6931) ^ 1183488851;
                    i5 = -2067268519;
                    break;
                case -936270620:
                case -253526542:
                    if (C1017.f81942 < 0) {
                        iM55680 = (C0946.m55979("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM55680 = C0946.m55979("᩵᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6931) ^ 1183488851;
                        i5 = -2067268519;
                    }
                    break;
                case -781266850:
                case -744690999:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("ܰۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20209)) ^ (-936567338);
                        i5 = -1505159205;
                    } else {
                        iM55680 = C0946.m55979("۬ܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4303)) ^ 736019907;
                        i5 = -53458403;
                    }
                    break;
                case -501727183:
                case 1110921841:
                    C0946.m55980();
                    if (C0877.f81843 < 0) {
                        iM55680 = C0946.m55979("ܰۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20209)) ^ (-936567338);
                        i5 = -1505159205;
                    } else {
                        iM55680 = (C0946.m55979("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    }
                    break;
                case -476304101:
                case 430971266:
                    if (C0890.m55740()) {
                        iM55680 = C0873.m55680("ۢۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-6967)) ^ 295153593;
                        i5 = 1130198509;
                    } else {
                        iM55680 = (C0946.m55979("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    }
                    break;
                case -439698537:
                case 1058139083:
                    activityC10778 = this.f70166;
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("ܶۜ") + i3) * (-31);
                        i4 = ((iM55680 ^ i2) * (-27731)) ^ 2005750451;
                        i5 = 1747466141;
                    } else {
                        iM55680 = (C0946.m55979("ۘۤ") ^ i3) * (-95);
                        i4 = ((iM55680 ^ i2) * 20551) ^ (-1360595056);
                        i5 = 1501114365;
                    }
                    break;
                case -121565175:
                case 1278611147:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM55680 = C0873.m55680("ۨᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26391) ^ (-1794494162);
                        i5 = 1860491513;
                    }
                    break;
                case 163362706:
                case 1064502681:
                    C0863.m55643();
                    break;
                case 180821224:
                case 332042487:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0946.m55979("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM55680 = C0946.m55979("᩹ۘ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8305)) ^ 1817984839;
                        i5 = 1744668051;
                    }
                    break;
                case 1091557981:
                case 1906873022:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0946.m55979("᩵᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6931) ^ 1183488851;
                        i5 = -2067268519;
                    } else {
                        iM55680 = C0873.m55680("ۚᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26177) ^ (-405511663);
                        i5 = -55320528;
                    }
                    break;
                default:
                    if (RunnableC0897.m55784()) {
                        iM55680 = (C0946.m55979("ۙܺ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-19309)) ^ (-1823503974);
                        i5 = 19084216;
                    } else {
                        iM55680 = (C0873.m55680("᩻۟") + i3) * (-101);
                        i4 = ((iM55680 ^ i2) * 11403) ^ (-1375113405);
                        i5 = -559653878;
                    }
                    break;
            }
            return;
        }
    }
}
