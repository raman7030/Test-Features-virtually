package l;

import android.graphics.drawable.Drawable;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19184 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۠֨ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f60437 = {3998, -11641, 11922, 8584, 7030, 16041, 16018, 16023, 16018, 16019, 16011, 16018, 16092, 16008, 16005, 16012, 16025, 16092, 16019, 16026, 16092, 16031, 16019, 16017, 16012, 16029, 16014, 16021, 16015, 16019, 16018, 16092, 16014, 16025, 16015, 16009, 16016, 16008, 16070, 16092, 16021, 16018, 16026, 16019, 16082, 16022, 16015, 16019, 16018, 16008, 16005, 16012, 16025, 16026, 16021, 16016, 16025, 16077, 16026, 16021, 16016, 16025, 16078, 16024, 16025, 16004, 16029, 16014, 16015, 16031, 16082, 16004, 16017, 16016, 16029, 16004, 16017, 16016, -22141, 25250, 26593, 16082, 16015, 16017, 16029, 16016, 16021, -21811, 19357, 26941, 16021, 16027, 16018, 16019, 16014, 16025, 16046, 16025, 16027, 16021, 16015, 16008, 16025, 16014, 17721, 16706, 23933, 16021, 16027, 16018, 16019, 16014, 16025, 16050, 16019, 16012, 16053, 16018, 16015, 16008, 16014, 16009, 16031, 16008, 16021, 16019, 16018, 16021, 16027, 16018, 16019, 16014, 16025, 16046, 16025, 16015, 16053, 16024, 16063, 16020, 16029, 16018, 16027, 16025, 16015, 16032, 16015, 16086, 16032, 16082, 16014, 16025, 16027, 16021, 16015, 16008, 16025, 16014, 16015, 16092, 16032, 16024, 16087, 16032, 16015, 16086, 16032, 16015, 16086, 16084, 16018, 16019, 16012, 16085, 16067, 16032, 16015, 16086, 16032, 16015, 16086, 16031, 16019, 16018, 16015, 16008, 16084, 16083, 16032, 16024, 16087, 16085, 16067, 16092, 16039, 16012, 16010, 16033, 16032, 16024, 16087, 16080, 16092, 16076, 16004, 16075, 16026, 16039, 16076, 16081, 16069, 16029, 16081, 16026, 16033, 16007, 16074, 16001, 16032, 16015, 16086, 16032, 16015, 16086, 16032, 16082, 16026, 16021, 16025, 16016, 16024, 16092, 16012, 16009, 16030, 16016, 16021, 16031, 16092, 16015, 16008, 16029, 16008, 16021, 16031, 16092, 16084, 16067, 16070, 16026, 16021, 16018, 16029, 16016, 16092, 16085, 16067, 16039, 16034, 16070, 16113, 16118, 16033, 16087, 16070, 16053, 16092, 16065, 16092, 16076, 16004, 16075, 16026, 16039, 16076, 16081, 16069, 16029, 16081, 16026, 16033, 16007, 16074, 16001, 16032, 16015, 16086, 16029, 16083, 16032, 16015, 16086, 16076, 16004, 16075, 16026, 16039, 16076, 16081, 16069, 16029, 16081, 16026, 16033, 16007, 16074, 16001, 16032, 16015, 16086, 16030, 16083};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22006 f60438;

    public C19184(ActivityC22006 activityC22006) {
        this.f60438 = activityC22006;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ad A[PHI: r3 r4 r16
      0x01ad: PHI (r3v4 l.᩹ۖ᩷) = (r3v3 l.᩹ۖ᩷), (r3v2 l.᩹ۖ᩷) binds: [B:48:0x01ab, B:37:0x014a] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r4v5 l.۬۬ۧ) = (r4v4 l.۬۬ۧ), (r4v2 l.۬۬ۧ) binds: [B:48:0x01ab, B:37:0x014a] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r16v11 int) = (r16v9 int), (r16v12 int) binds: [B:48:0x01ab, B:37:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0223 A[PHI: r6 r7 r16
      0x0223: PHI (r6v4 l.֨֡᩷) = (r6v2 l.֨֡᩷), (r6v3 l.֨֡᩷), (r6v2 l.֨֡᩷) binds: [B:59:0x0221, B:28:0x00e9, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:59:0x0221, B:28:0x00e9, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r16v21 int) = (r16v7 int), (r16v14 int), (r16v22 int) binds: [B:59:0x0221, B:28:0x00e9, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0293 A[PHI: r3 r4 r5 r10 r11 r16
      0x0293: PHI (r3v5 l.᩹ۖ᩷) = (r3v2 l.᩹ۖ᩷), (r3v3 l.᩹ۖ᩷), (r3v2 l.᩹ۖ᩷), (r3v2 l.᩹ۖ᩷), (r3v2 l.᩹ۖ᩷) binds: [B:67:0x0291, B:51:0x01d3, B:41:0x0173, B:20:0x00a2, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r4v6 l.۬۬ۧ) = (r4v2 l.۬۬ۧ), (r4v4 l.۬۬ۧ), (r4v2 l.۬۬ۧ), (r4v2 l.۬۬ۧ), (r4v2 l.۬۬ۧ) binds: [B:67:0x0291, B:51:0x01d3, B:41:0x0173, B:20:0x00a2, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r5v4 l.ܰܳۡ) = (r5v2 l.ܰܳۡ), (r5v2 l.ܰܳۡ), (r5v3 l.ܰܳۡ), (r5v2 l.ܰܳۡ), (r5v2 l.ܰܳۡ) binds: [B:67:0x0291, B:51:0x01d3, B:41:0x0173, B:20:0x00a2, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:67:0x0291, B:51:0x01d3, B:41:0x0173, B:20:0x00a2, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:67:0x0291, B:51:0x01d3, B:41:0x0173, B:20:0x00a2, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r16v19 int) = (r16v3 int), (r16v9 int), (r16v10 int), (r16v18 int), (r16v20 int) binds: [B:67:0x0291, B:51:0x01d3, B:41:0x0173, B:20:0x00a2, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02c8 A[PHI: r2 r3 r4 r8 r9 r16
      0x02c8: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v2 int), (r2v2 int) binds: [B:71:0x02c6, B:55:0x01fa, B:45:0x019d, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r3v6 l.᩹ۖ᩷) = (r3v2 l.᩹ۖ᩷), (r3v2 l.᩹ۖ᩷), (r3v3 l.᩹ۖ᩷), (r3v2 l.᩹ۖ᩷) binds: [B:71:0x02c6, B:55:0x01fa, B:45:0x019d, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r4v7 l.۬۬ۧ) = (r4v2 l.۬۬ۧ), (r4v2 l.۬۬ۧ), (r4v4 l.۬۬ۧ), (r4v2 l.۬۬ۧ) binds: [B:71:0x02c6, B:55:0x01fa, B:45:0x019d, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r8v4 short[]) = (r8v3 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:71:0x02c6, B:55:0x01fa, B:45:0x019d, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r9v4 char) = (r9v3 char), (r9v2 char), (r9v2 char), (r9v2 char) binds: [B:71:0x02c6, B:55:0x01fa, B:45:0x019d, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r16v24 int) = (r16v2 int), (r16v8 int), (r16v9 int), (r16v25 int) binds: [B:71:0x02c6, B:55:0x01fa, B:45:0x019d, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM6981;
        int i;
        int i2;
        int i3 = C4263.f13799;
        int i4 = C2167.f7158;
        int iM6982 = (C2105.m6981("۬ܽ") ^ i4) * 97;
        int i5 = ((iM6982 ^ i3) * 32101) ^ (-1023362316);
        short[] sArr = null;
        int i6 = iM6982 ^ (-2017226334);
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 229533021;
        String strM1840 = null;
        ViewOnClickListenerC0775 viewOnClickListenerC0775 = null;
        C13876 c13876 = null;
        C13132 c13132 = null;
        ActivityC22006 activityC22006 = null;
        int iM2566 = 0;
        while (true) {
            int i10 = i6 ^ (i5 & (((i9 ^ i3) * (-26529)) >> 31));
            switch (i10) {
                case -2069817040:
                case -1651736657:
                    i10 = i10;
                    activityC22006.f70546.m33259((InterfaceC15287) activityC22006);
                    c13876 = activityC22006.f70546;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("ܶۜ") ^ i3;
                        i = ((iM6981 ^ i4) * 7509) ^ (-993694639);
                        i2 = -1656623754;
                    } else {
                        iM6981 = (C0630.m2566("᩸᩸") + i3) * 123;
                        i = ((iM6981 ^ i4) * 22399) ^ 2010040486;
                        i2 = -370396593;
                    }
                    int i11 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i11;
                    break;
                case -2029961370:
                case 1749311732:
                    i8 = 23508;
                    iM6981 = C2105.m6981("᩶֨") ^ i4;
                    i = ((iM6981 ^ i3) * 18389) ^ (-1714815554);
                    i2 = 2013498539;
                    int i12 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i12;
                    break;
                case -1806890595:
                case 900313115:
                    i10 = i10;
                    C3019.m9255();
                    C4159.m12565();
                    iM6981 = C2105.m6981("ܶۜ") ^ i3;
                    i = ((iM6981 ^ i4) * 7509) ^ (-993694639);
                    i2 = -1656623754;
                    int i13 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i13;
                    break;
                case -1588184705:
                case -619297427:
                    i10 = i10;
                    strM1840 = C0382.m1840(f60437, 1, 3, i8);
                    if (C7106.m19120() <= 0) {
                        iM6981 = (C0630.m2566("ۧܶ") ^ i3) * (-99);
                        i = ((iM6981 ^ i4) * 8329) ^ (-771222740);
                        i2 = -1967821500;
                    } else {
                        iM6981 = (C0630.m2566("᩹ܺ") ^ i3) * 75;
                        i = ((iM6981 ^ i4) * 2765) ^ 252186211;
                        i2 = -444094840;
                    }
                    int i14 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i14;
                    break;
                case -1457708488:
                case -1277990943:
                    C0050.m940();
                    C4616.m13552();
                    break;
                case -1302518165:
                case 602981321:
                    i10 = i10;
                    iM2566 = 2098735855 ^ C0630.m2566(strM1840);
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۚ֡") ^ i3;
                        i = ((iM6981 ^ i4) * 26525) ^ (-1861444613);
                        i2 = 121451211;
                    } else {
                        iM6981 = C2105.m6981("ۧ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * (-26935)) ^ 1570197982;
                        i2 = 1007262157;
                    }
                    int i15 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i15;
                    break;
                case -1070429833:
                case 699582515:
                    i10 = i10;
                    c13876.m33258((InterfaceC8233) activityC22006);
                    ViewOnClickListenerC1958.m6442(c13132, activityC22006.f70546);
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ۘ᩶") + i4) * q.h;
                        i = ((iM6981 ^ i3) * (-25415)) ^ 571047492;
                        i2 = 215582314;
                    } else {
                        iM6981 = (C2105.m6981("۫ۛ") ^ i4) * 85;
                        i = ((iM6981 ^ i3) * 14995) ^ 1993323858;
                        i2 = 135401652;
                    }
                    int i16 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i16;
                    break;
                case -1003884113:
                case -739616938:
                    i10 = i10;
                    try {
                        C2126.m7039(C14624.m34923(activityC22006.f10584), viewOnClickListenerC0775);
                        break;
                    } catch (NullPointerException unused) {
                    }
                    iM6981 = C2105.m6981("ܿ᩺") ^ i3;
                    i = ((iM6981 ^ i4) * (-5319)) ^ 482583757;
                    i2 = 678203969;
                    int i17 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i17;
                    break;
                case -939333252:
                case 1658891540:
                    i10 = i10;
                    viewOnClickListenerC0775 = new ViewOnClickListenerC0775(1, this);
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("ۧܶ") ^ i3) * (-99);
                        i = ((iM6981 ^ i4) * 8329) ^ (-771222740);
                        i2 = -1967821500;
                    } else {
                        iM6981 = (C0630.m2566("ᩴۛ") + i4) * 65;
                        i = ((iM6981 ^ i3) * 23855) ^ 698739478;
                        i2 = 1223222351;
                    }
                    int i18 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i18;
                    break;
                case -562651339:
                case 672322714:
                    i10 = i10;
                    sArr = f60437;
                    c = 0;
                    if (C2272.m7503()) {
                        iM6981 = C2105.m6981("ۧ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * (-26935)) ^ 1570197982;
                        i2 = 1007262157;
                    } else {
                        iM6981 = (C2105.m6981("ۘۛ") ^ i4) * (-57);
                        i = ((iM6981 ^ i3) * 8621) ^ (-1476292020);
                        i2 = -648011569;
                    }
                    int i19 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i19;
                    break;
                case -550002577:
                case 1847546436:
                    i8 = 19967;
                    iM6981 = C2105.m6981("᩶֨") ^ i4;
                    i = ((iM6981 ^ i3) * 18389) ^ (-1714815554);
                    i2 = 2013498539;
                    int i110 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i110;
                    break;
                case -446700136:
                case 1837099363:
                    C1504.m5179();
                    if (C3746.f11829 > 0) {
                        iM6981 = (i4 - C2105.m6981("ܶۤ")) * 83;
                        i10 = i10;
                        i = ((iM6981 ^ i3) * 26697) ^ 1485485574;
                        i2 = 1131219635;
                    } else {
                        i10 = i10;
                        iM6981 = (C0630.m2566("ۧܶ") ^ i3) * (-99);
                        i = ((iM6981 ^ i4) * 8329) ^ (-771222740);
                        i2 = -1967821500;
                    }
                    int i111 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i111;
                    break;
                case -380422214:
                case 565910682:
                    i10 = i10;
                    activityC22006.m49525();
                    if (C3537.m10750(activityC22006).f45586 != null) {
                        iM6981 = C0630.m2566("ۛۡ") ^ i4;
                        i = ((iM6981 ^ i3) * (-25025)) ^ (-70053904);
                        i2 = -1145636268;
                    } else {
                        iM6981 = C2105.m6981("ܿ᩺") ^ i3;
                        i = ((iM6981 ^ i4) * (-5319)) ^ 482583757;
                        i2 = 678203969;
                    }
                    int i112 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i112;
                    break;
                case -312156910:
                case 472924274:
                    break;
                case 326072286:
                case 830443814:
                    C0483.m2121();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = (i4 - C2105.m6981("ܶۤ")) * 83;
                        i10 = i10;
                        i = ((iM6981 ^ i3) * 26697) ^ 1485485574;
                        i2 = 1131219635;
                    } else {
                        i10 = i10;
                        iM6981 = C2105.m6981("ۧ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * (-26935)) ^ 1570197982;
                        i2 = 1007262157;
                    }
                    int i113 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i113;
                    break;
                case 862044644:
                case 987880858:
                    i10 = i10;
                    activityC22006 = this.f60438;
                    c13132 = (C13132) C4263.m12813(activityC22006, iM2566);
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("ۧ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * (-26935)) ^ 1570197982;
                        i2 = 1007262157;
                    } else {
                        Drawable[] drawableArrM35414 = C3019.m9264(activityC22006).m35414();
                        if (C2958.f9394 >= 0) {
                            iM6981 = (C2105.m6981("ۘ᩶") + i4) * q.h;
                            i = ((iM6981 ^ i3) * (-25415)) ^ 571047492;
                            i2 = 215582314;
                        } else {
                            activityC22006.f70546 = new C13876(drawableArrM35414);
                            activityC22006.f70546.m33262((InterfaceC18383) activityC22006);
                            if (C1047.f3863 >= 0) {
                                iM6981 = C2105.m6981("ܶۜ") ^ i3;
                                i = ((iM6981 ^ i4) * 7509) ^ (-993694639);
                                i2 = -1656623754;
                            } else {
                                iM6981 = (C2105.m6981("᩺ᩴ") ^ i4) * 85;
                                i = ((iM6981 ^ i3) * (-25303)) ^ 499780507;
                                i2 = -1378299524;
                            }
                        }
                    }
                    int i114 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i114;
                    break;
                case 1118222348:
                case 1994304655:
                    i10 = i10;
                    s = sArr[c];
                    i7 = s * s;
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("ܶۜ") ^ i3;
                        i = ((iM6981 ^ i4) * 7509) ^ (-993694639);
                        i2 = -1656623754;
                    } else {
                        iM6981 = (C2105.m6981("᩸۟") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM6981 ^ i4) * (-7781)) ^ (-2054264576);
                        i2 = 2021567966;
                    }
                    int i115 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i115;
                    break;
                case 1253624847:
                case 1875390582:
                    C3911.m11924();
                    if (C1504.f5354) {
                        iM6981 = (i4 - C2105.m6981("ܶۤ")) * 83;
                        i10 = i10;
                        i = ((iM6981 ^ i3) * 26697) ^ 1485485574;
                        i2 = 1131219635;
                    } else {
                        i10 = i10;
                        iM6981 = C2105.m6981("ܶۜ") ^ i3;
                        i = ((iM6981 ^ i4) * 7509) ^ (-993694639);
                        i2 = -1656623754;
                    }
                    int i116 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i116;
                    break;
                case 1730375170:
                case 1773417887:
                    i10 = i10;
                    C4159.m12564(C14624.m34924(activityC22006.f10584), viewOnClickListenerC0775);
                    iM6981 = C0630.m2566("᩻ۧ") ^ i3;
                    i = ((iM6981 ^ i4) * 24765) ^ (-1939778621);
                    i2 = -260644021;
                    int i117 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i117;
                    break;
                default:
                    i10 = i10;
                    if ((505521 + i7) - (s * 1422) < 0) {
                        iM6981 = C0630.m2566("᩵ܰ") ^ i3;
                        i = ((iM6981 ^ i4) * 1187) ^ (-1565403596);
                        i2 = 1514160183;
                    } else {
                        iM6981 = (C2105.m6981("֫ܽ") + i4) * (-45);
                        i = ((iM6981 ^ i3) * (-5869)) ^ 382158898;
                        i2 = 1286081454;
                    }
                    int i118 = i10;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i9 = i118;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C3019.m9260(this, this.f60438);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        int i;
        HashMap map;
        int i2;
        int i3;
        C3545 c3545;
        int iM2566;
        int i4;
        int iM2567;
        int i5;
        HashMap map2;
        int iM2568;
        int i6;
        int i7;
        int i8;
        String str;
        HashMap map3;
        HashMap map4;
        C3545 c3546;
        Throwable th;
        C21434 c21434;
        C21434 c21435;
        int iM6981;
        int i9;
        int i10;
        int i11 = C2167.f7158;
        int i12 = C0050.f910;
        int iM2569 = (i11 - C0630.m2566("ۢ᩹")) * q.h;
        int i13 = ((iM2569 ^ i12) * (-24909)) ^ (-1885007867);
        Throwable th2 = null;
        Object obj = null;
        C21434 c21436 = null;
        String strM48553 = null;
        String strM7159 = null;
        ArrayList arrayList = null;
        C3545 c3547 = null;
        String strM11363 = null;
        int i14 = iM2569 ^ (-1018417187);
        int i15 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean zM4369 = false;
        boolean zM48550 = false;
        boolean zM48551 = false;
        boolean zM5910 = false;
        boolean zM3794 = false;
        boolean zM6437 = false;
        boolean zM20838 = false;
        boolean zM20839 = false;
        int i16 = -464886525;
        boolean zM43610 = false;
        HashMap map5 = null;
        Iterator itM50611 = null;
        boolean zM48552 = false;
        ActivityC22006 activityC22006 = null;
        C18090 c18090 = null;
        String strM50602 = null;
        while (true) {
            i16 = i14 ^ (i13 & (((i16 ^ i12) * (-22557)) >> 31));
            switch (i16) {
                case -2108034417:
                case -2078781053:
                    C2520.m8028(c18090);
                    C3537.m10750(activityC22006).f45578 = z2;
                    return;
                case -2038995641:
                case -434700799:
                    map = map5;
                    c3545 = c3547;
                    c21435 = c21436;
                    z = false;
                    z = false;
                    z2 = true;
                    z2 = true;
                    if (zM6437) {
                        iM6981 = (C0630.m2566("ۗ۬") + i12) * 67;
                        i9 = ((iM6981 ^ i11) * (-7095)) ^ (-1676754424);
                        i10 = -73697385;
                    } else {
                        iM6981 = (C2105.m6981("ۨۜ") ^ i11) * 55;
                        i9 = ((iM6981 ^ i12) * 2159) ^ (-106789346);
                        i10 = -891263516;
                    }
                    c21436 = c21435;
                    map5 = map;
                    i14 = iM6981 ^ i10;
                    i13 = i9;
                    c3547 = c3545;
                    break;
                case -1934249606:
                case -1095223083:
                    map = map5;
                    activityC22006.runOnUiThread(new RunnableC3847(1, this));
                    c3545 = c3547;
                    iM2566 = C2105.m6981("ᩳۜ") ^ i11;
                    i2 = ((iM2566 ^ i12) * 5947) ^ 1419518457;
                    i4 = -1063159503;
                    i3 = iM2566 ^ i4;
                    c3547 = c3545;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1878201928:
                case -1623617721:
                    i15 = 3444;
                    iM2568 = (C2105.m6981("۬۫") + i11) * 63;
                    i6 = ((iM2568 ^ i12) * (-11735)) ^ (-1844951237);
                    i7 = -1399810789;
                    i8 = iM2568 ^ i7;
                    map5 = map5;
                    c3547 = c3547;
                    c18090 = c18090;
                    th2 = th2;
                    i14 = i8;
                    i13 = i6;
                    strM50602 = strM50602;
                    obj = obj;
                    break;
                case -1769042981:
                case -1574150930:
                    map = map5;
                    try {
                        C3019.m9264(activityC22006).f45581 = 2;
                        try {
                            c3545 = c3547;
                            try {
                                C3537.m10750(activityC22006).f45575 = C2105.m6981(C0422.m1955(f60437, IShizukuService.Stub.TRANSACTION_isHidden, 3, i15)) ^ 2129820421;
                                C3019.m9264(activityC22006).f45585 = strM7159;
                                activityC22006.runOnUiThread(new RunnableC16940(1, this));
                                iM2566 = C2105.m6981("ᩳۜ") ^ i11;
                                i2 = ((iM2566 ^ i12) * 5947) ^ 1419518457;
                                i4 = -1063159503;
                                i3 = iM2566 ^ i4;
                                c3547 = c3545;
                                map2 = map;
                                i14 = i3;
                                i13 = i2;
                                map5 = map2;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                map5 = map;
                                c3547 = c3545;
                                str = strM50602;
                                int iM25610 = C0630.m2566("ܳ۬") ^ i12;
                                i14 = iM25610 ^ 142474745;
                                i13 = ((iM25610 ^ i11) * 4987) ^ 2085564737;
                                strM50602 = str;
                                c18090 = c18090;
                                obj = obj;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c3545 = c3547;
                            th2 = th;
                            map5 = map;
                            c3547 = c3545;
                            str = strM50602;
                            int iM25611 = C0630.m2566("ܳ۬") ^ i12;
                            i14 = iM25611 ^ 142474745;
                            i13 = ((iM25611 ^ i11) * 4987) ^ 2085564737;
                            strM50602 = str;
                            c18090 = c18090;
                            obj = obj;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th2 = th;
                        map5 = map;
                        str = strM50602;
                        int iM25612 = C0630.m2566("ܳ۬") ^ i12;
                        i14 = iM25612 ^ 142474745;
                        i13 = ((iM25612 ^ i11) * 4987) ^ 2085564737;
                        strM50602 = str;
                        c18090 = c18090;
                        obj = obj;
                    }
                    break;
                case -1625880194:
                case 626336887:
                    HashMap map6 = map5;
                    C3545 c3548 = c3547;
                    obj = obj;
                    Throwable th6 = th2;
                    C21434 c21437 = c21436;
                    str = strM50602;
                    try {
                        HashMap map7 = C3019.m9264(activityC22006).f45582;
                        try {
                            map7.clear();
                            map3 = map7;
                            c21436 = c21437;
                            try {
                                C21434 c21434M14983 = AbstractC5206.m14983(new String(C3245.m9929(c18090, c18090.m42211(AbstractC2021.m6573(f60437, 40, 9, i15)), null), Charset.defaultCharset()));
                                try {
                                    c18090 = c18090;
                                    try {
                                        strM48553 = c21434M14983.m48553(C1916.m6311(f60437, 49, 4, i15));
                                        C3019.m9264(activityC22006).m35412(c21434M14983.m48553(RunnableC3474.m10633(f60437, 53, 5, i15)), c21434M14983.m48553(C1294.m4373(f60437, 58, 5, i15)));
                                        zM6437 = ViewOnClickListenerC1958.m6437(C2272.m7507(f60437, 63, 3, i15), strM48553);
                                        int iM25613 = C0630.m2566("֫֡") ^ i11;
                                        i14 = iM25613 ^ 1061209969;
                                        c21436 = c21434M14983;
                                        i13 = ((iM25613 ^ i12) * 1647) ^ 1193774291;
                                        strM50602 = str;
                                        map5 = map3;
                                        c3547 = c3548;
                                        c18090 = c18090;
                                        th2 = th6;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c21436 = c21434M14983;
                                        map5 = map3;
                                        c3547 = c3548;
                                        th2 = th;
                                        int iM25614 = C0630.m2566("ܳ۬") ^ i12;
                                        i14 = iM25614 ^ 142474745;
                                        i13 = ((iM25614 ^ i11) * 4987) ^ 2085564737;
                                        strM50602 = str;
                                        c18090 = c18090;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    c18090 = c18090;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                c18090 = c18090;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            map3 = map7;
                            c18090 = c18090;
                            c21436 = c21437;
                        }
                    } catch (Throwable th11) {
                        c18090 = c18090;
                        c21436 = c21437;
                        th2 = th11;
                        map5 = map6;
                        c3547 = c3548;
                    }
                    obj = obj;
                    break;
                case -1534314334:
                case 1539886271:
                    map = map5;
                    c3545 = c3547;
                    if (zM4369) {
                        iM2566 = (i12 - C0630.m2566("ܳᩴ")) * (-109);
                        i2 = ((iM2566 ^ i11) * (-30045)) ^ 1497296413;
                        i4 = -869233552;
                    } else {
                        iM2566 = (C2105.m6981("۠۠") ^ i11) * 95;
                        i2 = ((iM2566 ^ i12) * 21113) ^ (-1916616386);
                        i4 = -2017024987;
                    }
                    i3 = iM2566 ^ i4;
                    c3547 = c3545;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1532412085:
                case -232914856:
                    map = map5;
                    if (zM48551) {
                        iM2567 = (C2105.m6981("ۢܳ") ^ i12) * (-125);
                        i2 = ((iM2567 ^ i11) * 7957) ^ (-244116187);
                        i5 = -653072156;
                    } else {
                        iM2567 = C2105.m6981("᩻ܺ") ^ i11;
                        i2 = ((iM2567 ^ i12) * (-5421)) ^ 1268445144;
                        i5 = -936486841;
                    }
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1400877988:
                case -1297496135:
                    try {
                        ActivityC22006.m49519(map5, c3547, z);
                        map = map5;
                        iM2567 = C2105.m6981("ۗۤ") ^ i12;
                        i2 = ((iM2567 ^ i11) * (-7973)) ^ 2121187378;
                        i5 = -1539108116;
                        i3 = iM2567 ^ i5;
                        map2 = map;
                        i14 = i3;
                        i13 = i2;
                        map5 = map2;
                    } catch (Throwable th12) {
                        th2 = th12;
                        c18090 = c18090;
                        str = strM50602;
                        int iM25615 = C0630.m2566("ܳ۬") ^ i12;
                        i14 = iM25615 ^ 142474745;
                        i13 = ((iM25615 ^ i11) * 4987) ^ 2085564737;
                        strM50602 = str;
                        c18090 = c18090;
                        obj = obj;
                    }
                    break;
                case -1392103103:
                case -1245869874:
                    map = map5;
                    C1916.m6307(arrayList, ViewOnClickListenerC1958.m6435(f60437, 145, 21, i15));
                    iM2567 = C2105.m6981("ۜۖ") ^ i12;
                    i2 = ((iM2567 ^ i11) * (-8029)) ^ (-1777175626);
                    i5 = 1477245306;
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1062732293:
                case -142958586:
                    map = map5;
                    C1916.m6307(arrayList, RunnableC0588.m2436(f60437, 178, 43, i15));
                    C7106.m19117(arrayList, C4616.m13542(f60437, 221, 66, i15));
                    C7106.m19117(arrayList, C1128.m3841(f60437, 289, 21, i15));
                    iM2567 = C0630.m2566("᩺᩹") ^ i11;
                    i2 = ((iM2567 ^ i12) * 4121) ^ (-261660755);
                    i5 = 1743649740;
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1023007719:
                case 376747066:
                    map = map5;
                    c3545 = c3547;
                    C3019.m9264(activityC22006).f45581 = z2 ? 1 : 0;
                    C3019.m9264(activityC22006).f45575 = C2105.m6981(C0798.m3005(f60437, 87, 3, i15)) ^ 2099829394;
                    C3019.m9264(activityC22006).f45585 = strM7159;
                    activityC22006.runOnUiThread(new Runnable() { // from class: l.ᩴۖ᩷

                        /* JADX INFO: renamed from: ᩹᩹ۚ, reason: not valid java name and contains not printable characters */
                        private static final short[] f57281 = {5187, -26943, -28517, 27530};

                        /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[PHI: r13
                          0x00d9: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:29:0x00d7, B:15:0x006b, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:48:0x01a1 A[PHI: r10
                          0x01a1: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:47:0x019f, B:7:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:56:0x01f6 A[PHI: r1 r6 r7 r8 r9 r12
                          0x01f6: PHI (r1v4 l.᩹ۖ᩷) = (r1v2 l.᩹ۖ᩷), (r1v2 l.᩹ۖ᩷), (r1v2 l.᩹ۖ᩷), (r1v2 l.᩹ۖ᩷), (r1v2 l.᩹ۖ᩷), (r1v2 l.᩹ۖ᩷), (r1v7 l.᩹ۖ᩷) binds: [B:55:0x01f4, B:51:0x01d3, B:33:0x0109, B:13:0x0068, B:10:0x0062, B:7:0x0057, B:86:0x01f6] A[DONT_GENERATE, DONT_INLINE]
                          0x01f6: PHI (r6v5 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:55:0x01f4, B:51:0x01d3, B:33:0x0109, B:13:0x0068, B:10:0x0062, B:7:0x0057, B:86:0x01f6] A[DONT_GENERATE, DONT_INLINE]
                          0x01f6: PHI (r7v5 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:55:0x01f4, B:51:0x01d3, B:33:0x0109, B:13:0x0068, B:10:0x0062, B:7:0x0057, B:86:0x01f6] A[DONT_GENERATE, DONT_INLINE]
                          0x01f6: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:55:0x01f4, B:51:0x01d3, B:33:0x0109, B:13:0x0068, B:10:0x0062, B:7:0x0057, B:86:0x01f6] A[DONT_GENERATE, DONT_INLINE]
                          0x01f6: PHI (r9v5 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:55:0x01f4, B:51:0x01d3, B:33:0x0109, B:13:0x0068, B:10:0x0062, B:7:0x0057, B:86:0x01f6] A[DONT_GENERATE, DONT_INLINE]
                          0x01f6: PHI (r12v5 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:55:0x01f4, B:51:0x01d3, B:33:0x0109, B:13:0x0068, B:10:0x0062, B:7:0x0057, B:86:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:64:0x0240 A[PHI: r2 r5 r18
                          0x0240: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:63:0x023e, B:59:0x0221, B:21:0x0086, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
                          0x0240: PHI (r5v4 char) = (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:63:0x023e, B:59:0x0221, B:21:0x0086, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
                          0x0240: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:63:0x023e, B:59:0x0221, B:21:0x0086, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int iM25616;
                            int i17;
                            int i18;
                            int i19 = C3245.f10203;
                            int i20 = C0483.f2088;
                            int iM6982 = (i20 - C2105.m6981("ۨۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            int i21 = ((iM6982 ^ i19) * (-10803)) ^ (-163857856);
                            short[] sArr = null;
                            short[] sArr2 = null;
                            int i22 = iM6982 ^ (-1552223733);
                            ActivityC22006 activityC22007 = null;
                            char c = 0;
                            short s = 0;
                            short s2 = 0;
                            int i23 = 0;
                            short s3 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = -1096822827;
                            String strM3789 = null;
                            int iM25617 = 0;
                            while (true) {
                                i27 = i22 ^ (i21 & (((i27 ^ i19) * (-7103)) >> 31));
                                switch (i27) {
                                    case -2138304093:
                                    case 165876271:
                                        C1916.m6308();
                                        if (C3537.f11231 >= 0) {
                                            iM25616 = C2105.m6981("᩵ۧ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        } else {
                                            iM25616 = C2105.m6981("ۢ᩻") ^ i19;
                                            i17 = ((iM25616 ^ i20) * 31399) ^ 876245097;
                                            i18 = 839288303;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -2092579193:
                                    case 412505093:
                                        i23 = s * s2;
                                        s3 = 8467;
                                        if (RunnableC3474.m10630()) {
                                            iM25616 = (C2105.m6981("֡᩷") + i20) * (-51);
                                            i17 = ((iM25616 ^ i19) * 31369) ^ 600634860;
                                            i18 = -759520613;
                                        } else {
                                            iM25616 = C2105.m6981("᩵ۧ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1497750862:
                                    case -1129937751:
                                        sArr2 = f57281;
                                        if (C1005.f3721) {
                                            iM25616 = (C0630.m2566("ۖ᩵") + i20) * (-11);
                                            i17 = ((iM25616 ^ i19) * 5877) ^ (-384639213);
                                            i18 = 1793410294;
                                        } else {
                                            iM25616 = C2105.m6981("᩵ۧ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1494833177:
                                    case 1501001470:
                                        i24 = s + s3;
                                        if (ServiceConnectionC3453.m10564() <= 0) {
                                            iM25616 = C2105.m6981("ۢ᩻") ^ i19;
                                            i17 = ((iM25616 ^ i20) * 31399) ^ 876245097;
                                            i18 = 839288303;
                                        } else {
                                            iM25616 = C2105.m6981("ᩴۨ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * 531) ^ 1011477877;
                                            i18 = 454972733;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1463554066:
                                    case 410718534:
                                        s = sArr[c];
                                        s2 = 33868;
                                        if (C0237.f1507 != 0) {
                                            iM25616 = C2105.m6981("᩵ۧ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        } else {
                                            iM25616 = C2105.m6981("ۧۜ") ^ i19;
                                            i17 = ((iM25616 ^ i20) * (-29633)) ^ (-1442294208);
                                            i18 = 988795064;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1345882638:
                                    case 1116196860:
                                        i25 = 912;
                                        iM25616 = (C2105.m6981("᩷֨") + i20) * (-89);
                                        i17 = ((iM25616 ^ i19) * (-5661)) ^ (-1316914059);
                                        i18 = 22961830;
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1340607188:
                                    case -98651769:
                                        strM3789 = RunnableC1108.m3789(sArr2, i26, 3, i25);
                                        if (C2520.f8000 >= 0) {
                                            iM25616 = (C2105.m6981("ۚܰ") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i17 = ((iM25616 ^ i19) * 29077) ^ 6807525;
                                            i18 = 2064038734;
                                        } else {
                                            iM25616 = C2105.m6981("ۨۜ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-10995)) ^ 412253894;
                                            i18 = 690238300;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1315091159:
                                    case 276771422:
                                        C1128.m3851();
                                        if (C7811.m20844() != 0) {
                                            iM25616 = C2105.m6981("᩵ۧ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        } else {
                                            iM25616 = (C2105.m6981("᩸۠") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i17 = ((iM25616 ^ i20) * (-21749)) ^ (-1573547408);
                                            i18 = -1671921779;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1186930723:
                                    case -859878596:
                                        if (RunnableC1937.f6483 < 0) {
                                            iM25616 = C2105.m6981("ᩳۗ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-21853)) ^ 1586468345;
                                            i18 = -1060560159;
                                        } else {
                                            iM25616 = C2105.m6981("᩵ۧ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1002554934:
                                    case 2021650802:
                                        if ((i24 * i24) - i23 < 0) {
                                            iM25616 = (i19 - C2105.m6981("֫۫")) * (-111);
                                            i17 = ((iM25616 ^ i20) * 3431) ^ (-950600925);
                                            i18 = 1328944564;
                                        } else {
                                            iM25616 = C0630.m2566("ܺۡ") ^ i19;
                                            i17 = ((iM25616 ^ i20) * 9663) ^ (-1551612291);
                                            i18 = 1001039089;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -939555725:
                                    case 1791604650:
                                        activityC22007 = this.f57282.f60438;
                                        if (C3019.m9255() <= 0) {
                                            iM25616 = C2105.m6981("᩵ۧ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                            i22 = iM25616 ^ i18;
                                            i21 = i17;
                                        } else {
                                            int iM25618 = (i19 - C0630.m2566("ۜ᩷")) * 55;
                                            i21 = ((iM25618 ^ i20) * 17917) ^ 540898675;
                                            i22 = iM25618 ^ (-1050362567);
                                        }
                                        break;
                                    case -734936992:
                                    case -476440249:
                                        sArr = f57281;
                                        if (C3663.f11553) {
                                            iM25616 = (C2105.m6981("᩸۠") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i17 = ((iM25616 ^ i20) * (-21749)) ^ (-1573547408);
                                            i18 = -1671921779;
                                        } else {
                                            iM25616 = (C0630.m2566("۠۟") ^ i20) * (-99);
                                            i17 = ((iM25616 ^ i19) * (-15317)) ^ 1382543538;
                                            i18 = -153808834;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -638537174:
                                    case -622734290:
                                        C0483.m2121();
                                        iM25616 = C2105.m6981("ᩳۗ") ^ i20;
                                        i17 = ((iM25616 ^ i19) * (-21853)) ^ 1586468345;
                                        i18 = -1060560159;
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -434893748:
                                    case 1133840306:
                                        c = 0;
                                        if (C3432.f10845 >= 0) {
                                            iM25616 = (C2105.m6981("᩸۠") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i17 = ((iM25616 ^ i20) * (-21749)) ^ (-1573547408);
                                            i18 = -1671921779;
                                        } else {
                                            iM25616 = (C0630.m2566("ܿ᩵") ^ i19) * 83;
                                            i17 = ((iM25616 ^ i20) * (-31579)) ^ 1636990069;
                                            i18 = 889917596;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -167265877:
                                    case 1924020862:
                                        iM25617 = 2126018606 ^ C0630.m2566(strM3789);
                                        if (C4159.m12565() >= 0) {
                                            iM25616 = (C2105.m6981("᩸۠") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i17 = ((iM25616 ^ i20) * (-21749)) ^ (-1573547408);
                                            i18 = -1671921779;
                                        } else {
                                            iM25616 = C0630.m2566("ۗۚ") ^ i19;
                                            i17 = ((iM25616 ^ i20) * (-5165)) ^ 1838301593;
                                            i18 = 1261546124;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 60050236:
                                    case 1812291109:
                                        i26 = 1;
                                        if (C1005.f3721) {
                                            iM25616 = (C2105.m6981("᩸ۙ") + i19) * (-65);
                                            i17 = ((iM25616 ^ i20) * (-2893)) ^ (-2042604745);
                                            i18 = -1907782437;
                                        } else {
                                            iM25616 = C2105.m6981("ᩳۗ") ^ i20;
                                            i17 = ((iM25616 ^ i19) * (-21853)) ^ 1586468345;
                                            i18 = -1060560159;
                                        }
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 427760306:
                                    case 535383590:
                                        C0237.m1481();
                                        break;
                                    case 1521773958:
                                    case 1766336519:
                                        C4263.m12813(activityC22007, iM25617);
                                        activityC22007.invalidateOptionsMenu();
                                        break;
                                    default:
                                        i25 = 64317;
                                        iM25616 = (C2105.m6981("᩷֨") + i20) * (-89);
                                        i17 = ((iM25616 ^ i19) * (-5661)) ^ (-1316914059);
                                        i18 = 22961830;
                                        i22 = iM25616 ^ i18;
                                        i21 = i17;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    iM2566 = C2105.m6981("ᩳۜ") ^ i11;
                    i2 = ((iM2566 ^ i12) * 5947) ^ 1419518457;
                    i4 = -1063159503;
                    i3 = iM2566 ^ i4;
                    c3547 = c3545;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1003799756:
                case 756392472:
                    throw th2;
                case -986908600:
                case 549526079:
                    map = map5;
                    c3545 = c3547;
                    StringBuilder sb = new StringBuilder(strM50602);
                    C1420.m4905(sb, strM48553);
                    throw new C19401(C0050.m947(sb));
                case -984664234:
                case -187169109:
                    map4 = map5;
                    c3546 = c3547;
                    obj = obj;
                    th = th2;
                    c21434 = c21436;
                    try {
                        C2520.m8028(c18090);
                        int iM6982 = C2105.m6981("ۛۨ") ^ i12;
                        strM50602 = strM50602;
                        i6 = ((iM6982 ^ i11) * (-12989)) ^ (-1613707476);
                        i8 = iM6982 ^ (-776969154);
                        c21436 = c21434;
                        th2 = th;
                        map5 = map4;
                        c3547 = c3546;
                        i14 = i8;
                        i13 = i6;
                        strM50602 = strM50602;
                        obj = obj;
                    } catch (Throwable th13) {
                        String str2 = strM50602;
                        int iM6983 = (i11 - C2105.m6981("ۗᩴ")) * (-7);
                        i = ((iM6983 ^ i12) * (-5925)) ^ (-1758096352);
                        c21436 = c21434;
                        th2 = th;
                        map5 = map4;
                        c3547 = c3546;
                        i14 = iM6983 ^ 375840875;
                        strM50602 = str2;
                        obj = th13;
                        i13 = i;
                    }
                    break;
                case -862572720:
                case 293333118:
                    map = map5;
                    if (zM48552) {
                        iM2567 = (i12 - C2105.m6981("ۖ᩶")) * (-117);
                        i2 = ((iM2567 ^ i11) * (-9233)) ^ 606185644;
                        i5 = 1213297506;
                    } else {
                        iM2567 = C0630.m2566("᩺᩹") ^ i11;
                        i2 = ((iM2567 ^ i12) * 4121) ^ (-261660755);
                        i5 = 1743649740;
                    }
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -859910161:
                case 107754402:
                    map = map5;
                    if (zM48550) {
                        iM2567 = (i11 - C2105.m6981("ۤۤ")) * 41;
                        i2 = ((iM2567 ^ i12) * 25969) ^ 1522644738;
                        i5 = 1673466071;
                    } else {
                        iM2567 = C2105.m6981("ۜۖ") ^ i12;
                        i2 = ((iM2567 ^ i11) * (-8029)) ^ (-1777175626);
                        i5 = 1477245306;
                    }
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -819818172:
                case 1991524333:
                    map = map5;
                    C3545 c3549 = (C3545) C2272.m7513(itM50611);
                    try {
                        zM3794 = RunnableC1108.m3794(c3549);
                        int iM6984 = (C2105.m6981("ۛۖ") + i11) * (-73);
                        map2 = map;
                        i14 = iM6984 ^ 1481096481;
                        i13 = ((iM6984 ^ i12) * 16487) ^ (-809620429);
                        c3547 = c3549;
                        map5 = map2;
                    } catch (Throwable th14) {
                        th2 = th14;
                        c3547 = c3549;
                        map5 = map;
                        str = strM50602;
                        int iM25616 = C0630.m2566("ܳ۬") ^ i12;
                        i14 = iM25616 ^ 142474745;
                        i13 = ((iM25616 ^ i11) * 4987) ^ 2085564737;
                        strM50602 = str;
                        c18090 = c18090;
                        obj = obj;
                    }
                    break;
                case -804099456:
                case 431742699:
                    map = map5;
                    strM50602 = C22628.m50602(f60437, 5, 35, i15);
                    activityC22006 = this.f60438;
                    c18090 = new C18090(activityC22006.f70540);
                    int iM25617 = C0630.m2566("֫ܶ") ^ i12;
                    i2 = ((iM25617 ^ i11) * (-26437)) ^ 1254966251;
                    i3 = iM25617 ^ (-638545961);
                    obj = obj;
                    c3547 = c3547;
                    th2 = th2;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -662142264:
                case 1228683631:
                    map = map5;
                    c3545 = c3547;
                    zM4369 = C1294.m4369(C0237.m1483(f60437, 74, 4, i15), strM48553);
                    iM2566 = (C0630.m2566("֨ܽ") ^ i12) * (-19);
                    i2 = ((iM2566 ^ i11) * 32545) ^ (-963472707);
                    i4 = -1690827228;
                    i3 = iM2566 ^ i4;
                    c3547 = c3545;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -578716338:
                case 846940483:
                    c18090 = c18090;
                    map5 = map5;
                    c3547 = c3547;
                    obj = obj;
                    th2 = th2;
                    strM50602 = strM50602;
                    short s = f60437[4];
                    if (((s * s) + 337420161) - (s * 36738) < 0) {
                        iM2568 = (C0630.m2566("ۧۖ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2568 ^ i12) * (-13555)) ^ (-894734287);
                        i7 = 627643530;
                    } else {
                        iM2568 = C0630.m2566("ᩳۙ") ^ i12;
                        i6 = ((iM2568 ^ i11) * 11959) ^ 1237046680;
                        i7 = -1406666931;
                    }
                    i8 = iM2568 ^ i7;
                    map5 = map5;
                    c3547 = c3547;
                    c18090 = c18090;
                    th2 = th2;
                    i14 = i8;
                    i13 = i6;
                    strM50602 = strM50602;
                    obj = obj;
                    break;
                case -453734569:
                case 1164140745:
                    map = map5;
                    c3545 = c3547;
                    try {
                        C3537.m10750(activityC22006).f45581 = z ? 1 : 0;
                        try {
                            C3019.m9264(activityC22006).f45575 = C0630.m2566(C0798.m3005(f60437, 78, 3, i15)) ^ 2102804051;
                            C3019.m9264(activityC22006).f45585 = C22628.m50602(f60437, 81, 6, i15);
                            c21435 = c21436;
                            try {
                                zM48550 = c21435.m48550(RunnableC3474.m10633(f60437, 90, 14, i15));
                                zM48551 = c21435.m48550(C4117.m12355(f60437, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 20, i15));
                                zM48552 = c21435.m48550(C4117.m12355(f60437, 127, 18, i15));
                                arrayList = C3537.m10750(activityC22006).f45577;
                                iM6981 = (C2105.m6981("ۤᩴ") ^ i12) * (-35);
                                i9 = ((iM6981 ^ i11) * 26155) ^ (-2087219666);
                                i10 = -1175567520;
                                c21436 = c21435;
                                map5 = map;
                                i14 = iM6981 ^ i10;
                                i13 = i9;
                                c3547 = c3545;
                            } catch (Throwable th15) {
                                th = th15;
                                th2 = th;
                                c21436 = c21435;
                                map5 = map;
                                c3547 = c3545;
                                str = strM50602;
                                int iM25618 = C0630.m2566("ܳ۬") ^ i12;
                                i14 = iM25618 ^ 142474745;
                                i13 = ((iM25618 ^ i11) * 4987) ^ 2085564737;
                                strM50602 = str;
                                c18090 = c18090;
                                obj = obj;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            c21435 = c21436;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        th2 = th;
                        map5 = map;
                        c3547 = c3545;
                        str = strM50602;
                        int iM25619 = C0630.m2566("ܳ۬") ^ i12;
                        i14 = iM25619 ^ 142474745;
                        i13 = ((iM25619 ^ i11) * 4987) ^ 2085564737;
                        strM50602 = str;
                        c18090 = c18090;
                        obj = obj;
                        break;
                    }
                    break;
                case -433400383:
                case 1582612758:
                    map = map5;
                    if (zM3794) {
                        iM2567 = C2105.m6981("ۗۤ") ^ i12;
                        i2 = ((iM2567 ^ i11) * (-7973)) ^ 2121187378;
                        i5 = -1539108116;
                    } else {
                        iM2567 = C0630.m2566("ۢ۫") ^ i12;
                        i2 = ((iM2567 ^ i11) * 27751) ^ (-863618761);
                        i5 = -1485946388;
                    }
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -406756761:
                case 815771941:
                    ActivityC22006.m49519(map5, c3547, z2);
                    map = map5;
                    iM2567 = C2105.m6981("ۗۤ") ^ i12;
                    i2 = ((iM2567 ^ i11) * (-7973)) ^ 2121187378;
                    i5 = -1539108116;
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 175566647:
                case 270343250:
                    map = map5;
                    if (zM5910) {
                        iM2567 = (C0630.m2566("ۡܿ") + i11) * 45;
                        i2 = ((iM2567 ^ i12) * 10959) ^ (-45563080);
                        i5 = -75500144;
                    } else {
                        iM2567 = (C2105.m6981("ۙ֫") + i12) * (-19);
                        i2 = ((iM2567 ^ i11) * (-5111)) ^ (-1121209765);
                        i5 = -1107864330;
                    }
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 277587179:
                case 435474398:
                    map = map5;
                    itM50611 = C22628.m50611(C4616.m13557(c18090));
                    iM2567 = C2105.m6981("ۗۤ") ^ i12;
                    i2 = ((iM2567 ^ i11) * (-7973)) ^ 2121187378;
                    i5 = -1539108116;
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 285109383:
                case 2046996586:
                    map = map5;
                    C7106.m19117(arrayList, C7811.m20837(f60437, 166, 12, i15));
                    iM2567 = C2105.m6981("᩻ܺ") ^ i11;
                    i2 = ((iM2567 ^ i12) * (-5421)) ^ 1268445144;
                    i5 = -936486841;
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 295951148:
                case 1826884161:
                    try {
                        map = map5;
                        try {
                            zM20839 = C7811.m20838(strM11363, C1916.m6311(f60437, 310, 2, i15));
                            iM2567 = (C0630.m2566("᩵۠") ^ i11) * (-87);
                            i2 = ((iM2567 ^ i12) * 10795) ^ (-1580237763);
                            i5 = 410320288;
                            i3 = iM2567 ^ i5;
                            map2 = map;
                            i14 = i3;
                            i13 = i2;
                            map5 = map2;
                        } catch (Throwable th18) {
                            th = th18;
                            th2 = th;
                            map5 = map;
                            str = strM50602;
                            int iM256110 = C0630.m2566("ܳ۬") ^ i12;
                            i14 = iM256110 ^ 142474745;
                            i13 = ((iM256110 ^ i11) * 4987) ^ 2085564737;
                            strM50602 = str;
                            c18090 = c18090;
                            obj = obj;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        map = map5;
                    }
                    break;
                case 416174090:
                case 1183643332:
                    map4 = map5;
                    c3546 = c3547;
                    obj = obj;
                    th = th2;
                    c21434 = c21436;
                    C2167.m7154(th, obj);
                    int iM6985 = C2105.m6981("ۛۨ") ^ i12;
                    strM50602 = strM50602;
                    i6 = ((iM6985 ^ i11) * (-12989)) ^ (-1613707476);
                    i8 = iM6985 ^ (-776969154);
                    c21436 = c21434;
                    th2 = th;
                    map5 = map4;
                    c3547 = c3546;
                    i14 = i8;
                    i13 = i6;
                    strM50602 = strM50602;
                    obj = obj;
                    break;
                case 725189624:
                case 1491522890:
                    map = map5;
                    zM5910 = C1773.m5910(itM50611);
                    iM2567 = (C0630.m2566("۟ܰ") ^ i11) * 5;
                    i2 = ((iM2567 ^ i12) * 9839) ^ (-1444775891);
                    i5 = 886669124;
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 1001013781:
                case 1223111298:
                    if (!zM20839) {
                        map = map5;
                        iM2567 = C2105.m6981("ۗۤ") ^ i12;
                        i2 = ((iM2567 ^ i11) * (-7973)) ^ 2121187378;
                        i5 = -1539108116;
                        i3 = iM2567 ^ i5;
                        map2 = map;
                        i14 = i3;
                        i13 = i2;
                        map5 = map2;
                    } else {
                        int iM6986 = C2105.m6981("۬ܺ") ^ i11;
                        i = ((iM6986 ^ i12) * (-1043)) ^ 2140620802;
                        i14 = iM6986 ^ 1811912273;
                        i13 = i;
                    }
                    break;
                case 1155101797:
                case 1350684864:
                    i15 = 16124;
                    iM2568 = (C2105.m6981("۬۫") + i11) * 63;
                    i6 = ((iM2568 ^ i12) * (-11735)) ^ (-1844951237);
                    i7 = -1399810789;
                    i8 = iM2568 ^ i7;
                    map5 = map5;
                    c3547 = c3547;
                    c18090 = c18090;
                    th2 = th2;
                    i14 = i8;
                    i13 = i6;
                    strM50602 = strM50602;
                    obj = obj;
                    break;
                case 1296029965:
                case 2078588760:
                    map = map5;
                    c3545 = c3547;
                    strM7159 = C2167.m7159(f60437, 70, 4, i15);
                    if (zM43610) {
                        iM2566 = (i11 - C0630.m2566("ܽۜ")) * 59;
                        i2 = ((iM2566 ^ i12) * (-23149)) ^ 214496737;
                        i4 = 13219079;
                    } else {
                        iM2566 = C0630.m2566("۟֫") ^ i12;
                        i2 = ((iM2566 ^ i11) * 32131) ^ (-1496728732);
                        i4 = 606946607;
                    }
                    i3 = iM2566 ^ i4;
                    c3547 = c3545;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 1540063470:
                case 2116190373:
                    map = map5;
                    strM11363 = C3746.m11363(c3547);
                    zM20838 = C7811.m20838(strM11363, C1047.m3603(f60437, 287, 2, i15));
                    iM2567 = C2105.m6981("ۗۘ") ^ i12;
                    i2 = ((iM2567 ^ i11) * 14197) ^ 219796925;
                    i5 = -1858781057;
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 1809396287:
                case 2070624506:
                    map = map5;
                    c3545 = c3547;
                    c21435 = c21436;
                    zM43610 = C1294.m4369(C22628.m50602(f60437, 66, 4, i15), strM48553);
                    iM6981 = C0630.m2566("ᩳۖ") ^ i11;
                    i9 = ((iM6981 ^ i12) * (-9965)) ^ 275668415;
                    i10 = -1804963864;
                    c21436 = c21435;
                    map5 = map;
                    i14 = iM6981 ^ i10;
                    i13 = i9;
                    c3547 = c3545;
                    break;
                default:
                    map = map5;
                    if (zM20838) {
                        iM2567 = C2105.m6981("ܶ۫") ^ i12;
                        i2 = ((iM2567 ^ i11) * (-23419)) ^ (-269554630);
                        i5 = 459577689;
                    } else {
                        iM2567 = (C2105.m6981("ۤۘ") + i11) * (-33);
                        i2 = ((iM2567 ^ i12) * 12055) ^ 1017977510;
                        i5 = -1755345305;
                    }
                    i3 = iM2567 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC22006 activityC22006 = null;
        int i = -2060028159;
        int i2 = C4263.f13799;
        int i3 = RunnableC1937.f6483;
        int iM2566 = C0630.m2566("֫᩺") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-14045)) ^ 1954202557;
        int i5 = -138070832;
        while (true) {
            i = ((((i ^ i3) * (-27777)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1894478551:
                case 839504087:
                    if (C3663.f11553) {
                        iM2566 = (C0630.m2566("ۨ֡") ^ i3) * 101;
                        i4 = ((iM2566 ^ i2) * (-9115)) ^ 1965085988;
                        i5 = 272885132;
                    } else {
                        iM2566 = (C0630.m2566("᩻۠") ^ i3) * (-43);
                        i4 = ((iM2566 ^ i2) * (-20257)) ^ (-587873865);
                        i5 = 1034914715;
                    }
                    break;
                case -1630328717:
                case 157020548:
                    C2105.m6982();
                    if (C3537.m10746() > 0) {
                        iM2566 = C2105.m6981("ܳ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1535) ^ 1678814661;
                        i5 = -350081916;
                    } else {
                        iM2566 = C2105.m6981("ܰۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32521) ^ (-623558325);
                        i5 = 814609088;
                    }
                    break;
                case -1586575269:
                case -439945381:
                    C7811.m20844();
                    C1711.m5736();
                    break;
                case -1208904942:
                case 1260877077:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("᩻֨") + i3) * 41;
                        i4 = ((iM2566 ^ i2) * (-26529)) ^ 1534311149;
                        i5 = -1380152414;
                    } else {
                        iM2566 = (C0630.m2566("۠ۡ") + i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-28971)) ^ (-1409744151);
                        i5 = 103591739;
                    }
                    break;
                case -1013327913:
                case 617913165:
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("ۚۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * 7385) ^ (-1723009181);
                        i5 = -572277454;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۬ܺ")) * (-83);
                        i4 = ((iM2566 ^ i2) * (-18331)) ^ (-846662604);
                        i5 = 1890271824;
                    }
                    break;
                case -1009922692:
                case -717789476:
                    if (RunnableC3474.m10630()) {
                        iM2566 = (C2105.m6981("ܽۢ") + i2) * 51;
                        i4 = ((iM2566 ^ i3) * (-11887)) ^ 550500967;
                        i5 = 1912644737;
                    } else {
                        iM2566 = C2105.m6981("ܰۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32521) ^ (-623558325);
                        i5 = 814609088;
                    }
                    break;
                case -545326065:
                case 1878058901:
                    C3019.m9255();
                    iM2566 = C2105.m6981("ܰۡ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 32521) ^ (-623558325);
                    i5 = 814609088;
                    break;
                case -505971620:
                case 163877394:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("ܳ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1535) ^ 1678814661;
                        i5 = -350081916;
                    } else {
                        iM2566 = C2105.m6981("֡ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30169)) ^ (-813428619);
                        i5 = -990469150;
                    }
                    break;
                case -257278062:
                case 674883921:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("ۡ֨") + i3) * 15;
                        i4 = ((iM2566 ^ i2) * 23) ^ 1906199126;
                        i5 = 999781869;
                    } else {
                        iM2566 = (C2105.m6981("ۚۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * 7385) ^ (-1723009181);
                        i5 = -572277454;
                    }
                    break;
                case -243526277:
                case 1773621784:
                    C2105.m6982();
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM2566 = (C0630.m2566("ۨ֡") ^ i3) * 101;
                        i4 = ((iM2566 ^ i2) * (-9115)) ^ 1965085988;
                        i5 = 272885132;
                    } else {
                        iM2566 = C2105.m6981("ܰۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32521) ^ (-623558325);
                        i5 = 814609088;
                    }
                    break;
                case -205548051:
                case 1646237753:
                    if (!C3663.f11553) {
                        iM2566 = C2105.m6981("ܳ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1535) ^ 1678814661;
                        i5 = -350081916;
                    } else {
                        iM2566 = (C2105.m6981("ۚۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * 7385) ^ (-1723009181);
                        i5 = -572277454;
                    }
                    break;
                case 445715618:
                case 1023044399:
                    activityC22006.m10224((Throwable) exc, true);
                    break;
                case 478863670:
                case 2066261180:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("᩻֨") + i3) * 41;
                        i4 = ((iM2566 ^ i2) * (-26529)) ^ 1534311149;
                        i5 = -1380152414;
                    } else {
                        iM2566 = (C2105.m6981("ܶ᩷") + i3) * (-35);
                        i4 = ((iM2566 ^ i2) * 28493) ^ 484703713;
                        i5 = 1037007743;
                    }
                    break;
                case 558390794:
                case 813249632:
                    if (C2126.m7040()) {
                        iM2566 = (C0630.m2566("᩻֨") + i3) * 41;
                        i4 = ((iM2566 ^ i2) * (-26529)) ^ 1534311149;
                        i5 = -1380152414;
                    } else {
                        iM2566 = C0630.m2566("ۨܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-1809)) ^ 2030192616;
                        i5 = -1152878263;
                    }
                    break;
                case 1117126720:
                case 1962852442:
                    if (C3663.f11553) {
                        iM2566 = (C2105.m6981("ۚۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i3) * 7385) ^ (-1723009181);
                        i5 = -572277454;
                    } else {
                        iM2566 = C2105.m6981("֨ۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25457)) ^ 145704172;
                        i5 = -712252600;
                    }
                    break;
                default:
                    activityC22006 = this.f60438;
                    if (C1773.m5908() <= 0) {
                        iM2566 = (C0630.m2566("᩻֨") + i3) * 41;
                        i4 = ((iM2566 ^ i2) * (-26529)) ^ 1534311149;
                        i5 = -1380152414;
                    } else {
                        iM2566 = C2105.m6981("ᩳܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14725)) ^ (-45001065);
                        i5 = 785254054;
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
}
