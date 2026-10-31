package l;

import android.content.Intent;
import bin.mt.plugin.api.preference.PluginPreference;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ᩳܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes5.dex */
public final class C18121 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۬ۙۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f56391 = {4267, 22856, 22911, 22883, 22886, 22894, 22826, 22906, 22904, 22895, 22892, 22895, 22904, 22895, 22884, 22889, 22895, 22826, 22892, 22891, 22883, 22886, 22895, 22894, 2564, 3951, 3955, 3946, 3960, 3958, 3953, 3919, 3949, 3962, 3961, 3962, 3949, 3962, 3953, 3964, 3962};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16709 f56392;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public PluginPreference f56393;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18827 f56394;

    /* JADX WARN: Code duplicated, block: B:45:0x0179 A[PHI: r13
      0x0179: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:44:0x0177, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01af A[PHI: r7 r11 r12
      0x01af: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:48:0x01ad, B:32:0x00f9, B:15:0x007c, B:12:0x0076, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:48:0x01ad, B:32:0x00f9, B:15:0x007c, B:12:0x0076, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:48:0x01ad, B:32:0x00f9, B:15:0x007c, B:12:0x0076, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021c A[PHI: r2 r3 r4 r5 r6 r10 r15 r21
      0x021c: PHI (r2v4 l.ᩴܳ᩷) = (r2v2 l.ᩴܳ᩷), (r2v2 l.ᩴܳ᩷), (r2v3 l.ᩴܳ᩷), (r2v2 l.ᩴܳ᩷), (r2v2 l.ᩴܳ᩷) binds: [B:60:0x021a, B:52:0x01e1, B:36:0x011f, B:28:0x00db, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r3v4 android.content.Intent) = 
      (r3v2 android.content.Intent)
      (r3v2 android.content.Intent)
      (r3v3 android.content.Intent)
      (r3v2 android.content.Intent)
      (r3v2 android.content.Intent)
     binds: [B:60:0x021a, B:52:0x01e1, B:36:0x011f, B:28:0x00db, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r4v4 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:60:0x021a, B:52:0x01e1, B:36:0x011f, B:28:0x00db, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r5v3 l.ܽܳ᩷) = (r5v2 l.ܽܳ᩷), (r5v2 l.ܽܳ᩷), (r5v2 l.ܽܳ᩷), (r5v2 l.ܽܳ᩷), (r5v4 l.ܽܳ᩷) binds: [B:60:0x021a, B:52:0x01e1, B:36:0x011f, B:28:0x00db, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r6v3 bin.mt.plugin.api.preference.PluginPreference) = 
      (r6v2 bin.mt.plugin.api.preference.PluginPreference)
      (r6v2 bin.mt.plugin.api.preference.PluginPreference)
      (r6v2 bin.mt.plugin.api.preference.PluginPreference)
      (r6v2 bin.mt.plugin.api.preference.PluginPreference)
      (r6v4 bin.mt.plugin.api.preference.PluginPreference)
     binds: [B:60:0x021a, B:52:0x01e1, B:36:0x011f, B:28:0x00db, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:60:0x021a, B:52:0x01e1, B:36:0x011f, B:28:0x00db, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:60:0x021a, B:52:0x01e1, B:36:0x011f, B:28:0x00db, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:60:0x021a, B:52:0x01e1, B:36:0x011f, B:28:0x00db, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024e A[PHI: r9 r16
      0x024e: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:64:0x024c, B:56:0x01fe, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x024c, B:56:0x01fe, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        int iM2566;
        int i;
        int i2;
        int i3 = C2520.f8000;
        int i4 = RunnableC1937.f6483;
        int iM6981 = C2105.m6981("۠ܺ") ^ i4;
        int i5 = ((iM6981 ^ i3) * 3265) ^ 113909648;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ (-973814050);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -657019473;
        char c = 0;
        PluginPreference pluginPreferenceM39316 = null;
        C16709 c16709 = null;
        String strM6311 = null;
        Intent intentM12571 = null;
        ActivityC18827 activityC18827 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-13881)) >> 31));
            switch (i13) {
                case -1981028226:
                case -747452327:
                    this.f56393 = pluginPreferenceM39316;
                    activityC18827.f59393 = c16709.m39304();
                    break;
                case -1614238542:
                case 1051442936:
                    i8 = s + 8651;
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("֨᩵") ^ i3;
                        i = ((iM2566 ^ i4) * (-27357)) ^ (-738930902);
                        i2 = -2141132734;
                    } else {
                        iM2566 = C2105.m6981("᩶ܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-559)) ^ (-2005060145);
                        i2 = 1757005119;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1415134170:
                case 2052098618:
                    activityC18827 = this.f56394;
                    intentM12571 = C4159.m12571(activityC18827);
                    sArr2 = f56391;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("֨᩵") ^ i3;
                        i = ((iM2566 ^ i4) * (-27357)) ^ (-738930902);
                        i2 = -2141132734;
                    } else {
                        iM2566 = C0630.m2566("᩺۠") ^ i4;
                        i = ((iM2566 ^ i3) * 5963) ^ (-2029084426);
                        i2 = -1200009226;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1280076842:
                case -843211059:
                    if (C4075.f12947 < 0) {
                        iM2566 = (C0630.m2566("֨֨") + i4) * (-77);
                        i = ((iM2566 ^ i3) * 9333) ^ (-370985016);
                        i2 = -327825470;
                    } else {
                        iM2566 = (C2105.m6981("ܺ֫") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i4) * (-11901)) ^ (-1381149844);
                        i2 = 891870195;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1226176366:
                case 945034315:
                    C4117.m12364();
                    break;
                case -1146590742:
                case 726066469:
                    i12 = 3871;
                    iM2566 = (C2105.m6981("ۡ᩵") ^ i3) * 115;
                    i = ((iM2566 ^ i4) * (-18459)) ^ 1011818862;
                    i2 = 286993798;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1090356531:
                case 1129873079:
                    strM6311 = C1916.m6311(sArr2, i7, 16, i12);
                    if (RunnableC1108.m3790()) {
                        iM2566 = C0630.m2566("֨᩵") ^ i3;
                        i = ((iM2566 ^ i4) * (-27357)) ^ (-738930902);
                        i2 = -2141132734;
                    } else {
                        iM2566 = C2105.m6981("֡۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-13869)) ^ 861050280;
                        i2 = -1628682937;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -834483910:
                case -484559121:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C0630.m2566("֨֨") + i4) * (-77);
                        i = ((iM2566 ^ i3) * 9333) ^ (-370985016);
                        i2 = -327825470;
                    } else {
                        iM2566 = C0630.m2566("ۛۧ") ^ i4;
                        i = ((iM2566 ^ i3) * (-20447)) ^ 478968654;
                        i2 = 1707464625;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -409971782:
                case -124810625:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("ᩴܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-12137)) ^ 995461585;
                        i2 = -1447759833;
                    } else {
                        iM2566 = (C0630.m2566("֨֨") + i4) * (-77);
                        i = ((iM2566 ^ i3) * 9333) ^ (-370985016);
                        i2 = -327825470;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -229988196:
                case 1476993222:
                    AbstractC2021.m6574();
                    C4075.m12263();
                    iM2566 = C2105.m6981("ᩴܺ") ^ i4;
                    i = ((iM2566 ^ i3) * (-12137)) ^ 995461585;
                    i2 = -1447759833;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -198781961:
                case 466683627:
                    i11 = 74839801;
                    if (C0050.f910 >= 0) {
                        iM2566 = (i4 - C2105.m6981("۟ܰ")) * (-97);
                        i = ((iM2566 ^ i3) * 26667) ^ 1019064522;
                        i2 = 1967538538;
                    } else {
                        iM2566 = C2105.m6981("۠ܿ") ^ i3;
                        i = ((iM2566 ^ i4) * 677) ^ 1206224214;
                        i2 = -1959077373;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 197454299:
                case 1435404168:
                    if (C2520.m8026()) {
                        iM2566 = (C0630.m2566("֨֨") + i4) * (-77);
                        i = ((iM2566 ^ i3) * 9333) ^ (-370985016);
                        i2 = -327825470;
                    } else {
                        iM2566 = (i4 - C2105.m6981("۟ܰ")) * (-97);
                        i = ((iM2566 ^ i3) * 26667) ^ 1019064522;
                        i2 = 1967538538;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 252653362:
                case 2036871337:
                    String strM6570 = AbstractC2021.m6570(intentM12571, strM6311);
                    c16709 = this.f56392;
                    pluginPreferenceM39316 = c16709.m39316(strM6570);
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("֨᩵") ^ i3;
                        i = ((iM2566 ^ i4) * (-27357)) ^ (-738930902);
                        i2 = -2141132734;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܽۘ")) * (-121);
                        i = ((iM2566 ^ i4) * 12029) ^ 1389903574;
                        i2 = 1986098001;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 264468202:
                case 1524116578:
                    c = 24;
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("֨᩵") ^ i3;
                        i = ((iM2566 ^ i4) * (-27357)) ^ (-738930902);
                        i2 = -2141132734;
                    } else {
                        iM2566 = (C0630.m2566("ۨۜ") ^ i4) * 13;
                        i = ((iM2566 ^ i3) * (-11003)) ^ 614116317;
                        i2 = 431147154;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 697936762:
                case 2090303684:
                    i7 = 25;
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("᩵᩻") + i3) * 25;
                        i = ((iM2566 ^ i4) * (-19145)) ^ (-1963220806);
                        i2 = -533577507;
                    } else {
                        iM2566 = (C0630.m2566("֨֨") + i4) * (-77);
                        i = ((iM2566 ^ i3) * 9333) ^ (-370985016);
                        i2 = -327825470;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 824020307:
                case 1899363028:
                    s = sArr[c];
                    if (C0050.f910 >= 0) {
                        iM2566 = (C2105.m6981("ܺ֫") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i4) * (-11901)) ^ (-1381149844);
                        i2 = 891870195;
                    } else {
                        iM2566 = C2105.m6981("ۢۢ") ^ i4;
                        i = ((iM2566 ^ i3) * 10593) ^ (-710680012);
                        i2 = 237744088;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1101063534:
                case 1883739220:
                    i12 = 18443;
                    iM2566 = (C2105.m6981("ۡ᩵") ^ i3) * 115;
                    i = ((iM2566 ^ i4) * (-18459)) ^ 1011818862;
                    i2 = 286993798;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1410844078:
                case 2138573850:
                    sArr = f56391;
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ܺ֫") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i4) * (-11901)) ^ (-1381149844);
                        i2 = 891870195;
                    } else {
                        iM2566 = (C0630.m2566("ۚ᩺") + i3) * (-119);
                        i = ((iM2566 ^ i4) * 6867) ^ (-1332522286);
                        i2 = 1328544438;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i14 = i10 + i11;
                    if (i9 - (i14 + i14) > 0) {
                        iM2566 = C0630.m2566("ᩳܰ") ^ i3;
                        i = ((iM2566 ^ i4) * (-23037)) ^ 1725351443;
                        i2 = -905505241;
                    } else {
                        iM2566 = (C2105.m6981("᩷ܺ") ^ i4) * (-71);
                        i = ((iM2566 ^ i3) * (-27303)) ^ 444788802;
                        i2 = -1578730716;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C18121(ActivityC18827 activityC18827, C16709 c16709) {
        int i = 1155632492;
        int i2 = C1420.f5096;
        int i3 = C1294.f4556;
        this.f56394 = activityC18827;
        this.f56392 = c16709;
        int iM2566 = C0630.m2566("۬ܰ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-26535)) ^ (-229049594);
        int i5 = -20645363;
        while (true) {
            i = (iM2566 ^ i5) ^ (i4 & (((i ^ i3) * 22465) >> 31));
            switch (i) {
                case -1911743150:
                case -1286155403:
                    return;
                case -1676189273:
                case 1382798453:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9993) ^ (-1666473120);
                        i5 = -1136971664;
                    }
                    break;
                case -1245302347:
                case 2139169104:
                    C1711.m5736();
                    break;
                case -1123091363:
                case 2024498584:
                    if (C7106.f21815 != 0) {
                        iM2566 = (i2 - C0630.m2566("᩸۟")) * 49;
                        i4 = ((iM2566 ^ i3) * (-15381)) ^ 1471506112;
                        i5 = -1419871000;
                    } else {
                        iM2566 = (C0630.m2566("ܶܿ") ^ i2) * 41;
                        i4 = ((iM2566 ^ i3) * (-19751)) ^ (-882947655);
                        i5 = 1748304016;
                        continue;
                    }
                    break;
                case -407235405:
                case 1192131263:
                    C1047.m3599();
                    C3245.m9925();
                    throw new RuntimeException();
                case 321964389:
                case 814790540:
                    C1047.m3599();
                    if (C3537.f11231 < 0) {
                        iM2566 = (C2105.m6981("ᩳۖ") + i2) * (-99);
                        i4 = ((iM2566 ^ i3) * (-18887)) ^ (-1960590840);
                        i5 = 687227607;
                    }
                    break;
                default:
                    C1773.m5908();
                    if (C3746.m11369() >= 0) {
                        iM2566 = (C2105.m6981("ۢ᩺") + i3) * 77;
                        i4 = ((iM2566 ^ i2) * 32505) ^ 1762231870;
                        i5 = -630730825;
                    }
                    break;
            }
            iM2566 = C0630.m2566("ۚۡ") ^ i3;
            i4 = ((iM2566 ^ i2) * (-24115)) ^ (-156101996);
            i5 = 1219656159;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C3537.m10743(this, this.f56394);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C16709 c16709 = null;
        PluginPreference pluginPreference = null;
        int i = 1287043020;
        int i2 = C1294.f4556;
        int i3 = C0630.f2410;
        int iM2566 = (C0630.m2566("ۙܺ") ^ i3) * 47;
        int i4 = ((iM2566 ^ i2) * 12817) ^ 1320564977;
        int i5 = 347340284;
        while (true) {
            i = ((((i ^ i2) * 4255) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2131600303:
                case -1684370526:
                    this.f56394.m43490(c16709, pluginPreference);
                    break;
                case -2016153752:
                case -1295484487:
                    if (C0714.m2805()) {
                        iM2566 = (C2105.m6981("᩸ۘ") ^ i2) * 87;
                        i4 = ((iM2566 ^ i3) * 21207) ^ 569099921;
                        i5 = 1405974784;
                    } else {
                        iM2566 = C2105.m6981("᩶ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3797)) ^ (-528236907);
                        i5 = 867584774;
                    }
                    break;
                case -1972304216:
                case -1798641833:
                    pluginPreference = this.f56393;
                    if (C2126.f7087) {
                        iM2566 = (C2105.m6981("֫ۨ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * 12779) ^ 176912881;
                        i5 = 1151348918;
                    } else {
                        iM2566 = (C0630.m2566("ۛ᩸") + i2) * (-113);
                        i4 = ((iM2566 ^ i3) * 16481) ^ (-228976979);
                        i5 = 656708346;
                    }
                    break;
                case -1665289328:
                case 741982965:
                    if (C3537.f11231 < 0) {
                        iM2566 = (C2105.m6981("ۤۢ") + i3) * 69;
                        i4 = ((iM2566 ^ i2) * 26783) ^ 1954193467;
                        i5 = -1570064789;
                    } else {
                        iM2566 = (C0630.m2566("᩹ᩴ") + i3) * 59;
                        i4 = ((iM2566 ^ i2) * 6217) ^ (-1242505862);
                        i5 = -93603585;
                    }
                    break;
                case -1596424612:
                case 592270153:
                    if (!AbstractC2021.m6574()) {
                        iM2566 = (C2105.m6981("ۤۢ") + i3) * 69;
                        i4 = ((iM2566 ^ i2) * 26783) ^ 1954193467;
                        i5 = -1570064789;
                    } else {
                        iM2566 = C2105.m6981("᩶ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3797)) ^ (-528236907);
                        i5 = 867584774;
                    }
                    break;
                case -1572024656:
                case 1903544872:
                    if (C2126.f7087) {
                        iM2566 = (C2105.m6981("ۤۢ") + i3) * 69;
                        i4 = ((iM2566 ^ i2) * 26783) ^ 1954193467;
                        i5 = -1570064789;
                    } else {
                        iM2566 = C2105.m6981("ۛۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 3933) ^ (-992149332);
                        i5 = -1546175740;
                    }
                    break;
                case -999337109:
                case 1400181950:
                    C3663.m11168();
                    C0483.m2121();
                    break;
                case -746496577:
                case 1788675301:
                    C7106.m19120();
                    iM2566 = C0630.m2566("ᩳۤ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-16209)) ^ (-1255118255);
                    i5 = 1801772945;
                    break;
                case -135785387:
                case 776733508:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C2105.m6981("᩶ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3797)) ^ (-528236907);
                        i5 = 867584774;
                    } else {
                        iM2566 = C2105.m6981("֡᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22035)) ^ (-142691040);
                        i5 = 685478331;
                    }
                    break;
                case -110686430:
                case 773590583:
                    if (C1420.m4913()) {
                        iM2566 = (C2105.m6981("֫ۨ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * 12779) ^ 176912881;
                        i5 = 1151348918;
                    } else {
                        iM2566 = C0630.m2566("ۡۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-24171)) ^ 1397426435;
                        i5 = 1962684453;
                    }
                    break;
                case -11445840:
                case 736335568:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("ۤۢ") + i3) * 69;
                        i4 = ((iM2566 ^ i2) * 26783) ^ 1954193467;
                        i5 = -1570064789;
                    } else {
                        iM2566 = (C0630.m2566("ܽ᩵") ^ i2) * (-127);
                        i4 = ((iM2566 ^ i3) * (-8789)) ^ 943652095;
                        i5 = 1536432475;
                    }
                    break;
                case 15859978:
                case 317369376:
                    if (C0798.m2998() != 0) {
                        iM2566 = (C2105.m6981("ۤۢ") + i3) * 69;
                        i4 = ((iM2566 ^ i2) * 26783) ^ 1954193467;
                        i5 = -1570064789;
                    } else {
                        iM2566 = C2105.m6981("ۙ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 8451) ^ 1684388711;
                        i5 = 1901303638;
                    }
                    break;
                case 501340324:
                case 1501077550:
                    C0382.m1848();
                    if (!C0382.f1805) {
                        iM2566 = C0630.m2566("ᩳۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16209)) ^ (-1255118255);
                        i5 = 1801772945;
                    } else {
                        iM2566 = (C2105.m6981("ۤۢ") + i3) * 69;
                        i4 = ((iM2566 ^ i2) * 26783) ^ 1954193467;
                        i5 = -1570064789;
                    }
                    break;
                case 781070225:
                case 1602495600:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C2105.m6981("ۤۢ") + i3) * 69;
                        i4 = ((iM2566 ^ i2) * 26783) ^ 1954193467;
                        i5 = -1570064789;
                    } else {
                        iM2566 = (C0630.m2566("۬᩹") ^ i3) * 25;
                        i4 = ((iM2566 ^ i2) * 28425) ^ 1207338695;
                        i5 = 1363407867;
                    }
                    break;
                case 790658429:
                case 1089654625:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C2105.m6981("֫ۨ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * 12779) ^ 176912881;
                        i5 = 1151348918;
                    } else {
                        iM2566 = C2105.m6981("ۤ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20929) ^ (-747506549);
                        i5 = 87300017;
                    }
                    break;
                default:
                    c16709 = this.f56392;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("֫ۨ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * 12779) ^ 176912881;
                        i5 = 1151348918;
                    } else {
                        iM2566 = (C0630.m2566("᩺۠") ^ i2) * 27;
                        i4 = ((iM2566 ^ i3) * 26933) ^ (-1977817209);
                        i5 = 1992682709;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C3911.m11927(this);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110 A[PHI: r3 r14
      0x0110: PHI (r3v5 l.ۤ᩻᩷) = (r3v4 l.ۤ᩻᩷), (r3v2 l.ۤ᩻᩷), (r3v2 l.ۤ᩻᩷) binds: [B:35:0x010e, B:31:0x00e8, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0110: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:35:0x010e, B:31:0x00e8, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a0 A[PHI: r4 r9
      0x01a0: PHI (r4v3 l.ᩴܳ᩷) = (r4v2 l.ᩴܳ᩷), (r4v4 l.ᩴܳ᩷) binds: [B:47:0x019e, B:23:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:47:0x019e, B:23:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01fb A[PHI: r7 r8 r10 r11 r12 r21
      0x01fb: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:55:0x01f9, B:51:0x01d8, B:43:0x017e, B:17:0x0089, B:15:0x0085, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:55:0x01f9, B:51:0x01d8, B:43:0x017e, B:17:0x0089, B:15:0x0085, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:55:0x01f9, B:51:0x01d8, B:43:0x017e, B:17:0x0089, B:15:0x0085, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:55:0x01f9, B:51:0x01d8, B:43:0x017e, B:17:0x0089, B:15:0x0085, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:55:0x01f9, B:51:0x01d8, B:43:0x017e, B:17:0x0089, B:15:0x0085, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:55:0x01f9, B:51:0x01d8, B:43:0x017e, B:17:0x0089, B:15:0x0085, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x022b A[PHI: r16
      0x022b: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:59:0x0229, B:15:0x0085, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0259 A[PHI: r5 r15
      0x0259: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:63:0x0257, B:27:0x00c8, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:63:0x0257, B:27:0x00c8, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        int iM2566;
        int i;
        int i2;
        int i3 = C2520.f8000;
        int i4 = C0630.f2410;
        int iM2567 = (C0630.m2566("ᩴ۟") + i4) * 99;
        int i5 = ((iM2567 ^ i3) * (-1851)) ^ 1224499066;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ (-1851370705);
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1899976097;
        char c = 0;
        ActivityC18827 activityC18827 = null;
        C10632 c10632 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 29591) >> 31));
            switch (i14) {
                case -2128146747:
                case 1277549703:
                    i9 = i8 * i8;
                    i10 = s * s;
                    i11 = 289680400;
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("ۜۘ") ^ i3;
                        i = ((iM2566 ^ i4) * 21955) ^ 1169771773;
                        i2 = 1018016315;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۜ᩵")) * 89;
                        i = ((iM2566 ^ i3) * (-24967)) ^ 803378010;
                        i2 = -815062203;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2113272868:
                case 1932401701:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C2105.m6981("᩷۟") ^ i3;
                        i = ((iM2566 ^ i4) * (-17927)) ^ 1282477300;
                        i2 = -1821051901;
                    } else {
                        iM2566 = C0630.m2566("ܿۖ") ^ i3;
                        i = ((iM2566 ^ i4) * (-3057)) ^ 877151704;
                        i2 = 635479926;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1994043937:
                case 2099946670:
                    sArr2 = f56391;
                    if (C1420.f5096 <= 0) {
                        iM2566 = C0630.m2566("᩻ۤ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12177)) ^ 1500110511;
                        i2 = 688786099;
                    } else {
                        iM2566 = C0630.m2566("ۘ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-20217)) ^ (-1786023310);
                        i2 = 1339694562;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1975814629:
                case 916939498:
                    C3683.m11222();
                    C2126.m7040();
                    iM2566 = C0630.m2566("ۜۘ") ^ i3;
                    i = ((iM2566 ^ i4) * 21955) ^ 1169771773;
                    i2 = 1018016315;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1862710975:
                case 1430736798:
                    c = 0;
                    if (C0237.m1481() >= 0) {
                        iM2566 = C0630.m2566("ۜۘ") ^ i3;
                        i = ((iM2566 ^ i4) * 21955) ^ 1169771773;
                        i2 = 1018016315;
                    } else {
                        iM2566 = C2105.m6981("ۡۜ") ^ i3;
                        i = ((iM2566 ^ i4) * 22363) ^ 16326127;
                        i2 = -912729051;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1641488290:
                case -1334546144:
                    if (C2520.f8000 < 0) {
                        iM2566 = C0630.m2566("ۜۘ") ^ i3;
                        i = ((iM2566 ^ i4) * 21955) ^ 1169771773;
                        i2 = 1018016315;
                    } else {
                        iM2566 = C0630.m2566("᩻ۤ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12177)) ^ 1500110511;
                        i2 = 688786099;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1572891039:
                case 416483103:
                    C4159.m12565();
                    if (C4159.f13567) {
                        iM2566 = C2105.m6981("ܽۨ") ^ i4;
                        i = ((iM2566 ^ i3) * (-8281)) ^ 186783230;
                        i2 = -796164586;
                    } else {
                        iM2566 = C0630.m2566("ۜۘ") ^ i3;
                        i = ((iM2566 ^ i4) * 21955) ^ 1169771773;
                        i2 = 1018016315;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1565918930:
                case -1470343820:
                    C4159.m12565();
                    if (C4263.m12819() < 0) {
                        iM2566 = C2105.m6981("ܽۨ") ^ i4;
                        i = ((iM2566 ^ i3) * (-8281)) ^ 186783230;
                        i2 = -796164586;
                    } else {
                        iM2566 = C2105.m6981("᩷۟") ^ i3;
                        i = ((iM2566 ^ i4) * (-17927)) ^ 1282477300;
                        i2 = -1821051901;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1551521277:
                case 744928250:
                    i12 = 267;
                    iM2566 = C0630.m2566("֫ۜ") ^ i3;
                    i = ((iM2566 ^ i4) * 29139) ^ (-202653736);
                    i2 = -466718872;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1371240363:
                case -583121818:
                    sArr = f56391;
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ۡۧ") ^ i4;
                        i = ((iM2566 ^ i3) * (-24331)) ^ (-10555877);
                        i2 = -901154271;
                    } else {
                        iM2566 = C2105.m6981("ܽۨ") ^ i4;
                        i = ((iM2566 ^ i3) * (-8281)) ^ 186783230;
                        i2 = -796164586;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1276040101:
                case 1941736527:
                    c10632.log(C1773.m5917(sArr2, i13, i7, i12), exc);
                    activityC18827 = this.f56394;
                    if (C22628.m50615() != 0) {
                        iM2566 = (C2105.m6981("ۧۙ") + i4) * (-3);
                        i = ((iM2566 ^ i3) * (-2047)) ^ (-537763182);
                        i2 = 1908571110;
                    } else {
                        iM2566 = (C2105.m6981("᩵۠") ^ i4) * (-43);
                        i = ((iM2566 ^ i3) * (-16423)) ^ (-680948883);
                        i2 = -1064601350;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1224105709:
                case -931389404:
                    C1128.m3851();
                    break;
                case -998360280:
                case 480905102:
                    i13 = 1;
                    i7 = 23;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("᩷۟") ^ i3;
                        i = ((iM2566 ^ i4) * (-17927)) ^ 1282477300;
                        i2 = -1821051901;
                    } else {
                        iM2566 = (C2105.m6981("᩶᩵") ^ i4) * 127;
                        i = ((iM2566 ^ i3) * 20797) ^ 1205935955;
                        i2 = 1290565340;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -867266505:
                case 2018104163:
                    i12 = 22794;
                    iM2566 = C0630.m2566("֫ۜ") ^ i3;
                    i = ((iM2566 ^ i4) * 29139) ^ (-202653736);
                    i2 = -466718872;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -620439301:
                case 54538219:
                    activityC18827.m10224((Throwable) exc, true);
                    break;
                case -196120692:
                case 1871319469:
                    c10632 = (C10632) this.f56392.m39304();
                    if (C1916.m6308() >= 0) {
                        iM2566 = C0630.m2566("᩻ۤ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12177)) ^ 1500110511;
                        i2 = 688786099;
                    } else {
                        iM2566 = (i4 - C2105.m6981("۠ܺ")) * q.h;
                        i = ((iM2566 ^ i3) * (-26557)) ^ (-1528097975);
                        i2 = -824413981;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 413632785:
                case 1888174558:
                    i8 = s + s2;
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("ۧۙ") + i4) * (-3);
                        i = ((iM2566 ^ i3) * (-2047)) ^ (-537763182);
                        i2 = 1908571110;
                    } else {
                        iM2566 = (C0630.m2566("۫᩷") ^ i3) * (-83);
                        i = ((iM2566 ^ i4) * 10695) ^ 899848208;
                        i2 = 954634909;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 822124214:
                case 1111279722:
                    s = sArr[c];
                    s2 = 17020;
                    if (C0714.m2805()) {
                        iM2566 = (i4 - C2105.m6981("᩷ۛ")) * 5;
                        i = ((iM2566 ^ i3) * (-17679)) ^ (-435488591);
                        i2 = -574419685;
                    } else {
                        iM2566 = C0630.m2566("ۜۘ") ^ i3;
                        i = ((iM2566 ^ i4) * 21955) ^ 1169771773;
                        i2 = 1018016315;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i15 = i10 + i11;
                    if ((i15 + i15) - i9 >= 0) {
                        iM2566 = (C0630.m2566("ۘ۠") + i3) * (-5);
                        i = ((iM2566 ^ i4) * (-22585)) ^ (-667822646);
                        i2 = -1987223805;
                    } else {
                        iM2566 = (C0630.m2566("ۢۡ") ^ i4) * 79;
                        i = ((iM2566 ^ i3) * (-26483)) ^ (-2086145442);
                        i2 = -801549907;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
