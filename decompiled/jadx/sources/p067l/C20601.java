package p067l;

import android.graphics.drawable.Drawable;
import com.alipay.sdk.p010m.p058y.C0254q;
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
public final class C20601 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۠֨ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f82327 = {3998, -11641, 11922, 8584, 7030, 16041, 16018, 16023, 16018, 16019, 16011, 16018, 16092, 16008, 16005, 16012, 16025, 16092, 16019, 16026, 16092, 16031, 16019, 16017, 16012, 16029, 16014, 16021, 16015, 16019, 16018, 16092, 16014, 16025, 16015, 16009, 16016, 16008, 16070, 16092, 16021, 16018, 16026, 16019, 16082, 16022, 16015, 16019, 16018, 16008, 16005, 16012, 16025, 16026, 16021, 16016, 16025, 16077, 16026, 16021, 16016, 16025, 16078, 16024, 16025, 16004, 16029, 16014, 16015, 16031, 16082, 16004, 16017, 16016, 16029, 16004, 16017, 16016, -22141, 25250, 26593, 16082, 16015, 16017, 16029, 16016, 16021, -21811, 19357, 26941, 16021, 16027, 16018, 16019, 16014, 16025, 16046, 16025, 16027, 16021, 16015, 16008, 16025, 16014, 17721, 16706, 23933, 16021, 16027, 16018, 16019, 16014, 16025, 16050, 16019, 16012, 16053, 16018, 16015, 16008, 16014, 16009, 16031, 16008, 16021, 16019, 16018, 16021, 16027, 16018, 16019, 16014, 16025, 16046, 16025, 16015, 16053, 16024, 16063, 16020, 16029, 16018, 16027, 16025, 16015, 16032, 16015, 16086, 16032, 16082, 16014, 16025, 16027, 16021, 16015, 16008, 16025, 16014, 16015, 16092, 16032, 16024, 16087, 16032, 16015, 16086, 16032, 16015, 16086, 16084, 16018, 16019, 16012, 16085, 16067, 16032, 16015, 16086, 16032, 16015, 16086, 16031, 16019, 16018, 16015, 16008, 16084, 16083, 16032, 16024, 16087, 16085, 16067, 16092, 16039, 16012, 16010, 16033, 16032, 16024, 16087, 16080, 16092, 16076, 16004, 16075, 16026, 16039, 16076, 16081, 16069, 16029, 16081, 16026, 16033, 16007, 16074, 16001, 16032, 16015, 16086, 16032, 16015, 16086, 16032, 16082, 16026, 16021, 16025, 16016, 16024, 16092, 16012, 16009, 16030, 16016, 16021, 16031, 16092, 16015, 16008, 16029, 16008, 16021, 16031, 16092, 16084, 16067, 16070, 16026, 16021, 16018, 16029, 16016, 16092, 16085, 16067, 16039, 16034, 16070, 16113, 16118, 16033, 16087, 16070, 16053, 16092, 16065, 16092, 16076, 16004, 16075, 16026, 16039, 16076, 16081, 16069, 16029, 16081, 16026, 16033, 16007, 16074, 16001, 16032, 16015, 16086, 16029, 16083, 16032, 16015, 16086, 16076, 16004, 16075, 16026, 16039, 16076, 16081, 16069, 16029, 16081, 16026, 16033, 16007, 16074, 16001, 16032, 16015, 16086, 16030, 16083};

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC23283 f63668;

    public C20601(ActivityC23283 activityC23283) {
        this.f63668 = activityC23283;
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55979;
        int i;
        int i2;
        int i3 = C1053.f81965;
        int i4 = C0949.f81897;
        int iM559710 = (C0946.m55979("۬ܽ") ^ i4) * 97;
        int i5 = ((iM559710 ^ i3) * 32101) ^ (-1023362316);
        short[] sArr = null;
        int i6 = iM559710 ^ (-2017226334);
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 229533021;
        String strM55618 = null;
        ViewOnClickListenerC3105 viewOnClickListenerC3105 = null;
        C15556 c15556 = null;
        C14849 c14849 = null;
        ActivityC23283 activityC23283 = null;
        int iM55680 = 0;
        while (true) {
            int i10 = i6 ^ (i5 & (((i9 ^ i3) * (-26529)) >> 31));
            switch (i10) {
                case -2069817040:
                case -1651736657:
                    i10 = i10;
                    activityC23283.f73259.m35378((InterfaceC16897) activityC23283);
                    c15556 = activityC23283.f73259;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0946.m55979("ܶۜ") ^ i3;
                        i = ((iM55979 ^ i4) * 7509) ^ (-993694639);
                        i2 = -1656623754;
                    } else {
                        iM55979 = (C0873.m55680("᩸᩸") + i3) * 123;
                        i = ((iM55979 ^ i4) * 22399) ^ 2010040486;
                        i2 = -370396593;
                    }
                    int i11 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i11;
                    break;
                case -2029961370:
                case 1749311732:
                    i8 = 23508;
                    iM55979 = C0946.m55979("᩶֨") ^ i4;
                    i = ((iM55979 ^ i3) * 18389) ^ (-1714815554);
                    i2 = 2013498539;
                    int i12 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i12;
                    break;
                case -1806890595:
                case 900313115:
                    i10 = i10;
                    C0992.m56107();
                    C1048.m56305();
                    iM55979 = C0946.m55979("ܶۜ") ^ i3;
                    i = ((iM55979 ^ i4) * 7509) ^ (-993694639);
                    i2 = -1656623754;
                    int i13 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i13;
                    break;
                case -1588184705:
                case -619297427:
                    i10 = i10;
                    strM55618 = C0861.m55618(f82327, 1, 3, i8);
                    if (C1194.m56396() <= 0) {
                        iM55979 = (C0873.m55680("ۧܶ") ^ i3) * (-99);
                        i = ((iM55979 ^ i4) * 8329) ^ (-771222740);
                        i2 = -1967821500;
                    } else {
                        iM55979 = (C0873.m55680("᩹ܺ") ^ i3) * 75;
                        i = ((iM55979 ^ i4) * 2765) ^ 252186211;
                        i2 = -444094840;
                    }
                    int i14 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i14;
                    break;
                case -1457708488:
                case -1277990943:
                    C0845.m55584();
                    C1071.m56343();
                    break;
                case -1302518165:
                case 602981321:
                    i10 = i10;
                    iM55680 = 2098735855 ^ C0873.m55680(strM55618);
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("ۚ֡") ^ i3;
                        i = ((iM55979 ^ i4) * 26525) ^ (-1861444613);
                        i2 = 121451211;
                    } else {
                        iM55979 = C0946.m55979("ۧ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * (-26935)) ^ 1570197982;
                        i2 = 1007262157;
                    }
                    int i15 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i15;
                    break;
                case -1070429833:
                case 699582515:
                    i10 = i10;
                    c15556.m35377((InterfaceC10193) activityC23283);
                    ViewOnClickListenerC0939.m55954(c14849, activityC23283.f73259);
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0946.m55979("ۘ᩶") + i4) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * (-25415)) ^ 571047492;
                        i2 = 215582314;
                    } else {
                        iM55979 = (C0946.m55979("۫ۛ") ^ i4) * 85;
                        i = ((iM55979 ^ i3) * 14995) ^ 1993323858;
                        i2 = 135401652;
                    }
                    int i16 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i16;
                    break;
                case -1003884113:
                case -739616938:
                    i10 = i10;
                    try {
                        C0947.m55996(C16267.m37070(activityC23283.f13392), viewOnClickListenerC3105);
                        break;
                    } catch (NullPointerException unused) {
                    }
                    iM55979 = C0946.m55979("ܿ᩺") ^ i3;
                    i = ((iM55979 ^ i4) * (-5319)) ^ 482583757;
                    i2 = 678203969;
                    int i17 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i17;
                    break;
                case -939333252:
                case 1658891540:
                    i10 = i10;
                    viewOnClickListenerC3105 = new ViewOnClickListenerC3105(1, this);
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("ۧܶ") ^ i3) * (-99);
                        i = ((iM55979 ^ i4) * 8329) ^ (-771222740);
                        i2 = -1967821500;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۛ") + i4) * 65;
                        i = ((iM55979 ^ i3) * 23855) ^ 698739478;
                        i2 = 1223222351;
                    }
                    int i18 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i18;
                    break;
                case -562651339:
                case 672322714:
                    i10 = i10;
                    sArr = f82327;
                    c = 0;
                    if (C0955.m56025()) {
                        iM55979 = C0946.m55979("ۧ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * (-26935)) ^ 1570197982;
                        i2 = 1007262157;
                    } else {
                        iM55979 = (C0946.m55979("ۘۛ") ^ i4) * (-57);
                        i = ((iM55979 ^ i3) * 8621) ^ (-1476292020);
                        i2 = -648011569;
                    }
                    int i19 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i19;
                    break;
                case -550002577:
                case 1847546436:
                    i8 = 19967;
                    iM55979 = C0946.m55979("᩶֨") ^ i4;
                    i = ((iM55979 ^ i3) * 18389) ^ (-1714815554);
                    i2 = 2013498539;
                    int i110 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i110;
                    break;
                case -446700136:
                case 1837099363:
                    C0917.m55854();
                    if (C1028.f81950 > 0) {
                        iM55979 = (i4 - C0946.m55979("ܶۤ")) * 83;
                        i10 = i10;
                        i = ((iM55979 ^ i3) * 26697) ^ 1485485574;
                        i2 = 1131219635;
                    } else {
                        i10 = i10;
                        iM55979 = (C0873.m55680("ۧܶ") ^ i3) * (-99);
                        i = ((iM55979 ^ i4) * 8329) ^ (-771222740);
                        i2 = -1967821500;
                    }
                    int i111 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i111;
                    break;
                case -380422214:
                case 565910682:
                    i10 = i10;
                    activityC23283.m51860();
                    if (C1017.m56191(activityC23283).f48698 != null) {
                        iM55979 = C0873.m55680("ۛۡ") ^ i4;
                        i = ((iM55979 ^ i3) * (-25025)) ^ (-70053904);
                        i2 = -1145636268;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩺") ^ i3;
                        i = ((iM55979 ^ i4) * (-5319)) ^ 482583757;
                        i2 = 678203969;
                    }
                    int i112 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i112;
                    break;
                case -312156910:
                case 472924274:
                    break;
                case 326072286:
                case 830443814:
                    C0866.m55645();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = (i4 - C0946.m55979("ܶۤ")) * 83;
                        i10 = i10;
                        i = ((iM55979 ^ i3) * 26697) ^ 1485485574;
                        i2 = 1131219635;
                    } else {
                        i10 = i10;
                        iM55979 = C0946.m55979("ۧ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * (-26935)) ^ 1570197982;
                        i2 = 1007262157;
                    }
                    int i113 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i113;
                    break;
                case 862044644:
                case 987880858:
                    i10 = i10;
                    activityC23283 = this.f63668;
                    c14849 = (C14849) C1053.m56321(activityC23283, iM55680);
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ۧ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * (-26935)) ^ 1570197982;
                        i2 = 1007262157;
                    } else {
                        Drawable[] drawableArrM37566 = C0992.m56116(activityC23283).m37566();
                        if (C0989.f81920 >= 0) {
                            iM55979 = (C0946.m55979("ۘ᩶") + i4) * C0254q.f1218h;
                            i = ((iM55979 ^ i3) * (-25415)) ^ 571047492;
                            i2 = 215582314;
                        } else {
                            activityC23283.f73259 = new C15556(drawableArrM37566);
                            activityC23283.f73259.m35381((InterfaceC19840) activityC23283);
                            if (C0894.f81854 >= 0) {
                                iM55979 = C0946.m55979("ܶۜ") ^ i3;
                                i = ((iM55979 ^ i4) * 7509) ^ (-993694639);
                                i2 = -1656623754;
                            } else {
                                iM55979 = (C0946.m55979("᩺ᩴ") ^ i4) * 85;
                                i = ((iM55979 ^ i3) * (-25303)) ^ 499780507;
                                i2 = -1378299524;
                            }
                        }
                    }
                    int i114 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i114;
                    break;
                case 1118222348:
                case 1994304655:
                    i10 = i10;
                    s = sArr[c];
                    i7 = s * s;
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("ܶۜ") ^ i3;
                        i = ((iM55979 ^ i4) * 7509) ^ (-993694639);
                        i2 = -1656623754;
                    } else {
                        iM55979 = (C0946.m55979("᩸۟") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i4) * (-7781)) ^ (-2054264576);
                        i2 = 2021567966;
                    }
                    int i115 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i115;
                    break;
                case 1253624847:
                case 1875390582:
                    C1036.m56257();
                    if (C0917.f81868) {
                        iM55979 = (i4 - C0946.m55979("ܶۤ")) * 83;
                        i10 = i10;
                        i = ((iM55979 ^ i3) * 26697) ^ 1485485574;
                        i2 = 1131219635;
                    } else {
                        i10 = i10;
                        iM55979 = C0946.m55979("ܶۜ") ^ i3;
                        i = ((iM55979 ^ i4) * 7509) ^ (-993694639);
                        i2 = -1656623754;
                    }
                    int i116 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i116;
                    break;
                case 1730375170:
                case 1773417887:
                    i10 = i10;
                    C1048.m56304(C16267.m37071(activityC23283.f13392), viewOnClickListenerC3105);
                    iM55979 = C0873.m55680("᩻ۧ") ^ i3;
                    i = ((iM55979 ^ i4) * 24765) ^ (-1939778621);
                    i2 = -260644021;
                    int i117 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i117;
                    break;
                default:
                    i10 = i10;
                    if ((505521 + i7) - (s * 1422) < 0) {
                        iM55979 = C0873.m55680("᩵ܰ") ^ i3;
                        i = ((iM55979 ^ i4) * 1187) ^ (-1565403596);
                        i2 = 1514160183;
                    } else {
                        iM55979 = (C0946.m55979("֫ܽ") + i4) * (-45);
                        i = ((iM55979 ^ i3) * (-5869)) ^ 382158898;
                        i2 = 1286081454;
                    }
                    int i118 = i10;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i9 = i118;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C0992.m56112(this, this.f63668);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        int i;
        HashMap map;
        int i2;
        int i3;
        C5738 c5738;
        int iM55680;
        int i4;
        int iM55681;
        int i5;
        HashMap map2;
        int iM55682;
        int i6;
        int i7;
        int i8;
        String str;
        HashMap map3;
        HashMap map4;
        C5738 c5739;
        Throwable th;
        C22739 c22739;
        C22739 c227310;
        int iM55979;
        int i9;
        int i10;
        int i11 = C0949.f81897;
        int i12 = C0845.f81821;
        int iM55683 = (i11 - C0873.m55680("ۢ᩹")) * C0254q.f1218h;
        int i13 = ((iM55683 ^ i12) * (-24909)) ^ (-1885007867);
        Throwable th2 = null;
        Object obj = null;
        C22739 c227311 = null;
        String strM50890 = null;
        String strM56016 = null;
        ArrayList arrayList = null;
        C5738 c57310 = null;
        String strM56241 = null;
        int i14 = iM55683 ^ (-1018417187);
        int i15 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean zM55806 = false;
        boolean zM50887 = false;
        boolean zM50888 = false;
        boolean zM55886 = false;
        boolean zM55788 = false;
        boolean zM55949 = false;
        boolean zM56404 = false;
        boolean zM56405 = false;
        int i16 = -464886525;
        boolean zM55807 = false;
        HashMap map5 = null;
        Iterator itM56593 = null;
        boolean zM50889 = false;
        ActivityC23283 activityC23283 = null;
        C19561 c19561 = null;
        String strM56584 = null;
        while (true) {
            i16 = i14 ^ (i13 & (((i16 ^ i12) * (-22557)) >> 31));
            switch (i16) {
                case -2108034417:
                case -2078781053:
                    C0967.m56075(c19561);
                    C1017.m56191(activityC23283).f48690 = z2;
                    return;
                case -2038995641:
                case -434700799:
                    map = map5;
                    c5738 = c57310;
                    c227310 = c227311;
                    z = false;
                    z = false;
                    z2 = true;
                    z2 = true;
                    if (zM55949) {
                        iM55979 = (C0873.m55680("ۗ۬") + i12) * 67;
                        i9 = ((iM55979 ^ i11) * (-7095)) ^ (-1676754424);
                        i10 = -73697385;
                    } else {
                        iM55979 = (C0946.m55979("ۨۜ") ^ i11) * 55;
                        i9 = ((iM55979 ^ i12) * 2159) ^ (-106789346);
                        i10 = -891263516;
                    }
                    c227311 = c227310;
                    map5 = map;
                    i14 = iM55979 ^ i10;
                    i13 = i9;
                    c57310 = c5738;
                    break;
                case -1934249606:
                case -1095223083:
                    map = map5;
                    activityC23283.runOnUiThread(new RunnableC6025(1, this));
                    c5738 = c57310;
                    iM55680 = C0946.m55979("ᩳۜ") ^ i11;
                    i2 = ((iM55680 ^ i12) * 5947) ^ 1419518457;
                    i4 = -1063159503;
                    i3 = iM55680 ^ i4;
                    c57310 = c5738;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1878201928:
                case -1623617721:
                    i15 = 3444;
                    iM55682 = (C0946.m55979("۬۫") + i11) * 63;
                    i6 = ((iM55682 ^ i12) * (-11735)) ^ (-1844951237);
                    i7 = -1399810789;
                    i8 = iM55682 ^ i7;
                    map5 = map5;
                    c57310 = c57310;
                    c19561 = c19561;
                    th2 = th2;
                    i14 = i8;
                    i13 = i6;
                    strM56584 = strM56584;
                    obj = obj;
                    break;
                case -1769042981:
                case -1574150930:
                    map = map5;
                    try {
                        C0992.m56116(activityC23283).f48693 = 2;
                        try {
                            c5738 = c57310;
                            try {
                                C1017.m56191(activityC23283).f48687 = C0946.m55979(C0863.m55635(f82327, IShizukuService.Stub.TRANSACTION_isHidden, 3, i15)) ^ 2129820421;
                                C0992.m56116(activityC23283).f48697 = strM56016;
                                activityC23283.runOnUiThread(new RunnableC18469(1, this));
                                iM55680 = C0946.m55979("ᩳۜ") ^ i11;
                                i2 = ((iM55680 ^ i12) * 5947) ^ 1419518457;
                                i4 = -1063159503;
                                i3 = iM55680 ^ i4;
                                c57310 = c5738;
                                map2 = map;
                                i14 = i3;
                                i13 = i2;
                                map5 = map2;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                map5 = map;
                                c57310 = c5738;
                                str = strM56584;
                                int iM55684 = C0873.m55680("ܳ۬") ^ i12;
                                i14 = iM55684 ^ 142474745;
                                i13 = ((iM55684 ^ i11) * 4987) ^ 2085564737;
                                strM56584 = str;
                                c19561 = c19561;
                                obj = obj;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c5738 = c57310;
                            th2 = th;
                            map5 = map;
                            c57310 = c5738;
                            str = strM56584;
                            int iM55685 = C0873.m55680("ܳ۬") ^ i12;
                            i14 = iM55685 ^ 142474745;
                            i13 = ((iM55685 ^ i11) * 4987) ^ 2085564737;
                            strM56584 = str;
                            c19561 = c19561;
                            obj = obj;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th2 = th;
                        map5 = map;
                        str = strM56584;
                        int iM55686 = C0873.m55680("ܳ۬") ^ i12;
                        i14 = iM55686 ^ 142474745;
                        i13 = ((iM55686 ^ i11) * 4987) ^ 2085564737;
                        strM56584 = str;
                        c19561 = c19561;
                        obj = obj;
                    }
                    break;
                case -1625880194:
                case 626336887:
                    HashMap map6 = map5;
                    C5738 c57311 = c57310;
                    obj = obj;
                    Throwable th6 = th2;
                    C22739 c227312 = c227311;
                    str = strM56584;
                    try {
                        HashMap map7 = C0992.m56116(activityC23283).f48694;
                        try {
                            map7.clear();
                            map3 = map7;
                            c227311 = c227312;
                            try {
                                C22739 c22739M16893 = AbstractC7316.m16893(new String(C1003.m56127(c19561, c19561.m44470(AbstractC0942.m55970(f82327, 40, 9, i15)), null), Charset.defaultCharset()));
                                try {
                                    c19561 = c19561;
                                    try {
                                        strM50890 = c22739M16893.m50890(C0937.m55921(f82327, 49, 4, i15));
                                        C0992.m56116(activityC23283).m37564(c22739M16893.m50890(RunnableC1014.m56180(f82327, 53, 5, i15)), c22739M16893.m50890(C0906.m55810(f82327, 58, 5, i15)));
                                        zM55949 = ViewOnClickListenerC0939.m55949(C0955.m56029(f82327, 63, 3, i15), strM50890);
                                        int iM55687 = C0873.m55680("֫֡") ^ i11;
                                        i14 = iM55687 ^ 1061209969;
                                        c227311 = c22739M16893;
                                        i13 = ((iM55687 ^ i12) * 1647) ^ 1193774291;
                                        strM56584 = str;
                                        map5 = map3;
                                        c57310 = c57311;
                                        c19561 = c19561;
                                        th2 = th6;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c227311 = c22739M16893;
                                        map5 = map3;
                                        c57310 = c57311;
                                        th2 = th;
                                        int iM55688 = C0873.m55680("ܳ۬") ^ i12;
                                        i14 = iM55688 ^ 142474745;
                                        i13 = ((iM55688 ^ i11) * 4987) ^ 2085564737;
                                        strM56584 = str;
                                        c19561 = c19561;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    c19561 = c19561;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                c19561 = c19561;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            map3 = map7;
                            c19561 = c19561;
                            c227311 = c227312;
                        }
                    } catch (Throwable th11) {
                        c19561 = c19561;
                        c227311 = c227312;
                        th2 = th11;
                        map5 = map6;
                        c57310 = c57311;
                    }
                    obj = obj;
                    break;
                case -1534314334:
                case 1539886271:
                    map = map5;
                    c5738 = c57310;
                    if (zM55806) {
                        iM55680 = (i12 - C0873.m55680("ܳᩴ")) * (-109);
                        i2 = ((iM55680 ^ i11) * (-30045)) ^ 1497296413;
                        i4 = -869233552;
                    } else {
                        iM55680 = (C0946.m55979("۠۠") ^ i11) * 95;
                        i2 = ((iM55680 ^ i12) * 21113) ^ (-1916616386);
                        i4 = -2017024987;
                    }
                    i3 = iM55680 ^ i4;
                    c57310 = c5738;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1532412085:
                case -232914856:
                    map = map5;
                    if (zM50888) {
                        iM55681 = (C0946.m55979("ۢܳ") ^ i12) * (-125);
                        i2 = ((iM55681 ^ i11) * 7957) ^ (-244116187);
                        i5 = -653072156;
                    } else {
                        iM55681 = C0946.m55979("᩻ܺ") ^ i11;
                        i2 = ((iM55681 ^ i12) * (-5421)) ^ 1268445144;
                        i5 = -936486841;
                    }
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1400877988:
                case -1297496135:
                    try {
                        ActivityC23283.m51854(map5, c57310, z);
                        map = map5;
                        iM55681 = C0946.m55979("ۗۤ") ^ i12;
                        i2 = ((iM55681 ^ i11) * (-7973)) ^ 2121187378;
                        i5 = -1539108116;
                        i3 = iM55681 ^ i5;
                        map2 = map;
                        i14 = i3;
                        i13 = i2;
                        map5 = map2;
                    } catch (Throwable th12) {
                        th2 = th12;
                        c19561 = c19561;
                        str = strM56584;
                        int iM55689 = C0873.m55680("ܳ۬") ^ i12;
                        i14 = iM55689 ^ 142474745;
                        i13 = ((iM55689 ^ i11) * 4987) ^ 2085564737;
                        strM56584 = str;
                        c19561 = c19561;
                        obj = obj;
                    }
                    break;
                case -1392103103:
                case -1245869874:
                    map = map5;
                    C0937.m55917(arrayList, ViewOnClickListenerC0939.m55947(f82327, 145, 21, i15));
                    iM55681 = C0946.m55979("ۜۖ") ^ i12;
                    i2 = ((iM55681 ^ i11) * (-8029)) ^ (-1777175626);
                    i5 = 1477245306;
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1062732293:
                case -142958586:
                    map = map5;
                    C0937.m55917(arrayList, RunnableC0871.m55667(f82327, 178, 43, i15));
                    C1194.m56393(arrayList, C1071.m56336(f82327, 221, 66, i15));
                    C1194.m56393(arrayList, C0898.m55792(f82327, 289, 21, i15));
                    iM55681 = C0873.m55680("᩺᩹") ^ i11;
                    i2 = ((iM55681 ^ i12) * 4121) ^ (-261660755);
                    i5 = 1743649740;
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -1023007719:
                case 376747066:
                    map = map5;
                    c5738 = c57310;
                    C0992.m56116(activityC23283).f48693 = z2 ? 1 : 0;
                    C0992.m56116(activityC23283).f48687 = C0946.m55979(C0882.m55717(f82327, 87, 3, i15)) ^ 2099829394;
                    C0992.m56116(activityC23283).f48697 = strM56016;
                    activityC23283.runOnUiThread(new Runnable() { // from class: l.ᩴۖ᩷

                        /* JADX INFO: renamed from: ᩹᩹ۚ, reason: not valid java name and contains not printable characters */
                        private static final short[] f82310 = {5187, -26943, -28517, 27530};

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
                            int iM556810;
                            int i17;
                            int i18;
                            int i19 = C1003.f81929;
                            int i20 = C0866.f81837;
                            int iM559710 = (i20 - C0946.m55979("ۨۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            int i21 = ((iM559710 ^ i19) * (-10803)) ^ (-163857856);
                            short[] sArr = null;
                            short[] sArr2 = null;
                            int i22 = iM559710 ^ (-1552223733);
                            ActivityC23283 activityC23284 = null;
                            char c = 0;
                            short s = 0;
                            short s2 = 0;
                            int i23 = 0;
                            short s3 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = -1096822827;
                            String strM55783 = null;
                            int iM556811 = 0;
                            while (true) {
                                i27 = i22 ^ (i21 & (((i27 ^ i19) * (-7103)) >> 31));
                                switch (i27) {
                                    case -2138304093:
                                    case 165876271:
                                        C0937.m55918();
                                        if (C1017.f81942 >= 0) {
                                            iM556810 = C0946.m55979("᩵ۧ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        } else {
                                            iM556810 = C0946.m55979("ۢ᩻") ^ i19;
                                            i17 = ((iM556810 ^ i20) * 31399) ^ 876245097;
                                            i18 = 839288303;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -2092579193:
                                    case 412505093:
                                        i23 = s * s2;
                                        s3 = 8467;
                                        if (RunnableC1014.m56177()) {
                                            iM556810 = (C0946.m55979("֡᩷") + i20) * (-51);
                                            i17 = ((iM556810 ^ i19) * 31369) ^ 600634860;
                                            i18 = -759520613;
                                        } else {
                                            iM556810 = C0946.m55979("᩵ۧ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1497750862:
                                    case -1129937751:
                                        sArr2 = f82310;
                                        if (C0892.f81851) {
                                            iM556810 = (C0873.m55680("ۖ᩵") + i20) * (-11);
                                            i17 = ((iM556810 ^ i19) * 5877) ^ (-384639213);
                                            i18 = 1793410294;
                                        } else {
                                            iM556810 = C0946.m55979("᩵ۧ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1494833177:
                                    case 1501001470:
                                        i24 = s + s3;
                                        if (ServiceConnectionC1013.m56157() <= 0) {
                                            iM556810 = C0946.m55979("ۢ᩻") ^ i19;
                                            i17 = ((iM556810 ^ i20) * 31399) ^ 876245097;
                                            i18 = 839288303;
                                        } else {
                                            iM556810 = C0946.m55979("ᩴۨ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * 531) ^ 1011477877;
                                            i18 = 454972733;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1463554066:
                                    case 410718534:
                                        s = sArr[c];
                                        s2 = 33868;
                                        if (C0854.f81826 != 0) {
                                            iM556810 = C0946.m55979("᩵ۧ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        } else {
                                            iM556810 = C0946.m55979("ۧۜ") ^ i19;
                                            i17 = ((iM556810 ^ i20) * (-29633)) ^ (-1442294208);
                                            i18 = 988795064;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1345882638:
                                    case 1116196860:
                                        i25 = 912;
                                        iM556810 = (C0946.m55979("᩷֨") + i20) * (-89);
                                        i17 = ((iM556810 ^ i19) * (-5661)) ^ (-1316914059);
                                        i18 = 22961830;
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1340607188:
                                    case -98651769:
                                        strM55783 = RunnableC0897.m55783(sArr2, i26, 3, i25);
                                        if (C0967.f81910 >= 0) {
                                            iM556810 = (C0946.m55979("ۚܰ") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i17 = ((iM556810 ^ i19) * 29077) ^ 6807525;
                                            i18 = 2064038734;
                                        } else {
                                            iM556810 = C0946.m55979("ۨۜ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-10995)) ^ 412253894;
                                            i18 = 690238300;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1315091159:
                                    case 276771422:
                                        C0898.m55800();
                                        if (C1229.m56410() != 0) {
                                            iM556810 = C0946.m55979("᩵ۧ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        } else {
                                            iM556810 = (C0946.m55979("᩸۠") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i17 = ((iM556810 ^ i20) * (-21749)) ^ (-1573547408);
                                            i18 = -1671921779;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1186930723:
                                    case -859878596:
                                        if (RunnableC0938.f81886 < 0) {
                                            iM556810 = C0946.m55979("ᩳۗ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-21853)) ^ 1586468345;
                                            i18 = -1060560159;
                                        } else {
                                            iM556810 = C0946.m55979("᩵ۧ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -1002554934:
                                    case 2021650802:
                                        if ((i24 * i24) - i23 < 0) {
                                            iM556810 = (i19 - C0946.m55979("֫۫")) * (-111);
                                            i17 = ((iM556810 ^ i20) * 3431) ^ (-950600925);
                                            i18 = 1328944564;
                                        } else {
                                            iM556810 = C0873.m55680("ܺۡ") ^ i19;
                                            i17 = ((iM556810 ^ i20) * 9663) ^ (-1551612291);
                                            i18 = 1001039089;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -939555725:
                                    case 1791604650:
                                        activityC23284 = this.f60501.f63668;
                                        if (C0992.m56107() <= 0) {
                                            iM556810 = C0946.m55979("᩵ۧ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-31005)) ^ 563062351;
                                            i18 = 96581951;
                                            i22 = iM556810 ^ i18;
                                            i21 = i17;
                                        } else {
                                            int iM556812 = (i19 - C0873.m55680("ۜ᩷")) * 55;
                                            i21 = ((iM556812 ^ i20) * 17917) ^ 540898675;
                                            i22 = iM556812 ^ (-1050362567);
                                        }
                                        break;
                                    case -734936992:
                                    case -476440249:
                                        sArr = f82310;
                                        if (C1024.f81946) {
                                            iM556810 = (C0946.m55979("᩸۠") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i17 = ((iM556810 ^ i20) * (-21749)) ^ (-1573547408);
                                            i18 = -1671921779;
                                        } else {
                                            iM556810 = (C0873.m55680("۠۟") ^ i20) * (-99);
                                            i17 = ((iM556810 ^ i19) * (-15317)) ^ 1382543538;
                                            i18 = -153808834;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -638537174:
                                    case -622734290:
                                        C0866.m55645();
                                        iM556810 = C0946.m55979("ᩳۗ") ^ i20;
                                        i17 = ((iM556810 ^ i19) * (-21853)) ^ 1586468345;
                                        i18 = -1060560159;
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -434893748:
                                    case 1133840306:
                                        c = 0;
                                        if (C1012.f81938 >= 0) {
                                            iM556810 = (C0946.m55979("᩸۠") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i17 = ((iM556810 ^ i20) * (-21749)) ^ (-1573547408);
                                            i18 = -1671921779;
                                        } else {
                                            iM556810 = (C0873.m55680("ܿ᩵") ^ i19) * 83;
                                            i17 = ((iM556810 ^ i20) * (-31579)) ^ 1636990069;
                                            i18 = 889917596;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case -167265877:
                                    case 1924020862:
                                        iM556811 = 2126018606 ^ C0873.m55680(strM55783);
                                        if (C1048.m56305() >= 0) {
                                            iM556810 = (C0946.m55979("᩸۠") + i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i17 = ((iM556810 ^ i20) * (-21749)) ^ (-1573547408);
                                            i18 = -1671921779;
                                        } else {
                                            iM556810 = C0873.m55680("ۗۚ") ^ i19;
                                            i17 = ((iM556810 ^ i20) * (-5165)) ^ 1838301593;
                                            i18 = 1261546124;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 60050236:
                                    case 1812291109:
                                        i26 = 1;
                                        if (C0892.f81851) {
                                            iM556810 = (C0946.m55979("᩸ۙ") + i19) * (-65);
                                            i17 = ((iM556810 ^ i20) * (-2893)) ^ (-2042604745);
                                            i18 = -1907782437;
                                        } else {
                                            iM556810 = C0946.m55979("ᩳۗ") ^ i20;
                                            i17 = ((iM556810 ^ i19) * (-21853)) ^ 1586468345;
                                            i18 = -1060560159;
                                        }
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                    case 427760306:
                                    case 535383590:
                                        C0854.m55595();
                                        break;
                                    case 1521773958:
                                    case 1766336519:
                                        C1053.m56321(activityC23284, iM556811);
                                        activityC23284.invalidateOptionsMenu();
                                        break;
                                    default:
                                        i25 = 64317;
                                        iM556810 = (C0946.m55979("᩷֨") + i20) * (-89);
                                        i17 = ((iM556810 ^ i19) * (-5661)) ^ (-1316914059);
                                        i18 = 22961830;
                                        i22 = iM556810 ^ i18;
                                        i21 = i17;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    iM55680 = C0946.m55979("ᩳۜ") ^ i11;
                    i2 = ((iM55680 ^ i12) * 5947) ^ 1419518457;
                    i4 = -1063159503;
                    i3 = iM55680 ^ i4;
                    c57310 = c5738;
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
                    c5738 = c57310;
                    StringBuilder sb = new StringBuilder(strM56584);
                    C0912.m55825(sb, strM50890);
                    throw new C20807(C0845.m55591(sb));
                case -984664234:
                case -187169109:
                    map4 = map5;
                    c5739 = c57310;
                    obj = obj;
                    th = th2;
                    c22739 = c227311;
                    try {
                        C0967.m56075(c19561);
                        int iM559710 = C0946.m55979("ۛۨ") ^ i12;
                        strM56584 = strM56584;
                        i6 = ((iM559710 ^ i11) * (-12989)) ^ (-1613707476);
                        i8 = iM559710 ^ (-776969154);
                        c227311 = c22739;
                        th2 = th;
                        map5 = map4;
                        c57310 = c5739;
                        i14 = i8;
                        i13 = i6;
                        strM56584 = strM56584;
                        obj = obj;
                    } catch (Throwable th13) {
                        String str2 = strM56584;
                        int iM559711 = (i11 - C0946.m55979("ۗᩴ")) * (-7);
                        i = ((iM559711 ^ i12) * (-5925)) ^ (-1758096352);
                        c227311 = c22739;
                        th2 = th;
                        map5 = map4;
                        c57310 = c5739;
                        i14 = iM559711 ^ 375840875;
                        strM56584 = str2;
                        obj = th13;
                        i13 = i;
                    }
                    break;
                case -862572720:
                case 293333118:
                    map = map5;
                    if (zM50889) {
                        iM55681 = (i12 - C0946.m55979("ۖ᩶")) * (-117);
                        i2 = ((iM55681 ^ i11) * (-9233)) ^ 606185644;
                        i5 = 1213297506;
                    } else {
                        iM55681 = C0873.m55680("᩺᩹") ^ i11;
                        i2 = ((iM55681 ^ i12) * 4121) ^ (-261660755);
                        i5 = 1743649740;
                    }
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -859910161:
                case 107754402:
                    map = map5;
                    if (zM50887) {
                        iM55681 = (i11 - C0946.m55979("ۤۤ")) * 41;
                        i2 = ((iM55681 ^ i12) * 25969) ^ 1522644738;
                        i5 = 1673466071;
                    } else {
                        iM55681 = C0946.m55979("ۜۖ") ^ i12;
                        i2 = ((iM55681 ^ i11) * (-8029)) ^ (-1777175626);
                        i5 = 1477245306;
                    }
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -819818172:
                case 1991524333:
                    map = map5;
                    C5738 c57312 = (C5738) C0955.m56035(itM56593);
                    try {
                        zM55788 = RunnableC0897.m55788(c57312);
                        int iM559712 = (C0946.m55979("ۛۖ") + i11) * (-73);
                        map2 = map;
                        i14 = iM559712 ^ 1481096481;
                        i13 = ((iM559712 ^ i12) * 16487) ^ (-809620429);
                        c57310 = c57312;
                        map5 = map2;
                    } catch (Throwable th14) {
                        th2 = th14;
                        c57310 = c57312;
                        map5 = map;
                        str = strM56584;
                        int iM556810 = C0873.m55680("ܳ۬") ^ i12;
                        i14 = iM556810 ^ 142474745;
                        i13 = ((iM556810 ^ i11) * 4987) ^ 2085564737;
                        strM56584 = str;
                        c19561 = c19561;
                        obj = obj;
                    }
                    break;
                case -804099456:
                case 431742699:
                    map = map5;
                    strM56584 = C1964.m56584(f82327, 5, 35, i15);
                    activityC23283 = this.f63668;
                    c19561 = new C19561(activityC23283.f73253);
                    int iM556811 = C0873.m55680("֫ܶ") ^ i12;
                    i2 = ((iM556811 ^ i11) * (-26437)) ^ 1254966251;
                    i3 = iM556811 ^ (-638545961);
                    obj = obj;
                    c57310 = c57310;
                    th2 = th2;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -662142264:
                case 1228683631:
                    map = map5;
                    c5738 = c57310;
                    zM55806 = C0906.m55806(C0854.m55597(f82327, 74, 4, i15), strM50890);
                    iM55680 = (C0873.m55680("֨ܽ") ^ i12) * (-19);
                    i2 = ((iM55680 ^ i11) * 32545) ^ (-963472707);
                    i4 = -1690827228;
                    i3 = iM55680 ^ i4;
                    c57310 = c5738;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -578716338:
                case 846940483:
                    c19561 = c19561;
                    map5 = map5;
                    c57310 = c57310;
                    obj = obj;
                    th2 = th2;
                    strM56584 = strM56584;
                    short s = f82327[4];
                    if (((s * s) + 337420161) - (s * 36738) < 0) {
                        iM55682 = (C0873.m55680("ۧۖ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM55682 ^ i12) * (-13555)) ^ (-894734287);
                        i7 = 627643530;
                    } else {
                        iM55682 = C0873.m55680("ᩳۙ") ^ i12;
                        i6 = ((iM55682 ^ i11) * 11959) ^ 1237046680;
                        i7 = -1406666931;
                    }
                    i8 = iM55682 ^ i7;
                    map5 = map5;
                    c57310 = c57310;
                    c19561 = c19561;
                    th2 = th2;
                    i14 = i8;
                    i13 = i6;
                    strM56584 = strM56584;
                    obj = obj;
                    break;
                case -453734569:
                case 1164140745:
                    map = map5;
                    c5738 = c57310;
                    try {
                        C1017.m56191(activityC23283).f48693 = z ? 1 : 0;
                        try {
                            C0992.m56116(activityC23283).f48687 = C0873.m55680(C0882.m55717(f82327, 78, 3, i15)) ^ 2102804051;
                            C0992.m56116(activityC23283).f48697 = C1964.m56584(f82327, 81, 6, i15);
                            c227310 = c227311;
                            try {
                                zM50887 = c227310.m50887(RunnableC1014.m56180(f82327, 90, 14, i15));
                                zM50888 = c227310.m50887(C1046.m56293(f82327, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 20, i15));
                                zM50889 = c227310.m50887(C1046.m56293(f82327, 127, 18, i15));
                                arrayList = C1017.m56191(activityC23283).f48689;
                                iM55979 = (C0946.m55979("ۤᩴ") ^ i12) * (-35);
                                i9 = ((iM55979 ^ i11) * 26155) ^ (-2087219666);
                                i10 = -1175567520;
                                c227311 = c227310;
                                map5 = map;
                                i14 = iM55979 ^ i10;
                                i13 = i9;
                                c57310 = c5738;
                            } catch (Throwable th15) {
                                th = th15;
                                th2 = th;
                                c227311 = c227310;
                                map5 = map;
                                c57310 = c5738;
                                str = strM56584;
                                int iM556812 = C0873.m55680("ܳ۬") ^ i12;
                                i14 = iM556812 ^ 142474745;
                                i13 = ((iM556812 ^ i11) * 4987) ^ 2085564737;
                                strM56584 = str;
                                c19561 = c19561;
                                obj = obj;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            c227310 = c227311;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        th2 = th;
                        map5 = map;
                        c57310 = c5738;
                        str = strM56584;
                        int iM556813 = C0873.m55680("ܳ۬") ^ i12;
                        i14 = iM556813 ^ 142474745;
                        i13 = ((iM556813 ^ i11) * 4987) ^ 2085564737;
                        strM56584 = str;
                        c19561 = c19561;
                        obj = obj;
                        break;
                    }
                    break;
                case -433400383:
                case 1582612758:
                    map = map5;
                    if (zM55788) {
                        iM55681 = C0946.m55979("ۗۤ") ^ i12;
                        i2 = ((iM55681 ^ i11) * (-7973)) ^ 2121187378;
                        i5 = -1539108116;
                    } else {
                        iM55681 = C0873.m55680("ۢ۫") ^ i12;
                        i2 = ((iM55681 ^ i11) * 27751) ^ (-863618761);
                        i5 = -1485946388;
                    }
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case -406756761:
                case 815771941:
                    ActivityC23283.m51854(map5, c57310, z2);
                    map = map5;
                    iM55681 = C0946.m55979("ۗۤ") ^ i12;
                    i2 = ((iM55681 ^ i11) * (-7973)) ^ 2121187378;
                    i5 = -1539108116;
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 175566647:
                case 270343250:
                    map = map5;
                    if (zM55886) {
                        iM55681 = (C0873.m55680("ۡܿ") + i11) * 45;
                        i2 = ((iM55681 ^ i12) * 10959) ^ (-45563080);
                        i5 = -75500144;
                    } else {
                        iM55681 = (C0946.m55979("ۙ֫") + i12) * (-19);
                        i2 = ((iM55681 ^ i11) * (-5111)) ^ (-1121209765);
                        i5 = -1107864330;
                    }
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 277587179:
                case 435474398:
                    map = map5;
                    itM56593 = C1964.m56593(C1071.m56348(c19561));
                    iM55681 = C0946.m55979("ۗۤ") ^ i12;
                    i2 = ((iM55681 ^ i11) * (-7973)) ^ 2121187378;
                    i5 = -1539108116;
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 285109383:
                case 2046996586:
                    map = map5;
                    C1194.m56393(arrayList, C1229.m56403(f82327, 166, 12, i15));
                    iM55681 = C0946.m55979("᩻ܺ") ^ i11;
                    i2 = ((iM55681 ^ i12) * (-5421)) ^ 1268445144;
                    i5 = -936486841;
                    i3 = iM55681 ^ i5;
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
                            zM56405 = C1229.m56404(strM56241, C0937.m55921(f82327, 310, 2, i15));
                            iM55681 = (C0873.m55680("᩵۠") ^ i11) * (-87);
                            i2 = ((iM55681 ^ i12) * 10795) ^ (-1580237763);
                            i5 = 410320288;
                            i3 = iM55681 ^ i5;
                            map2 = map;
                            i14 = i3;
                            i13 = i2;
                            map5 = map2;
                        } catch (Throwable th18) {
                            th = th18;
                            th2 = th;
                            map5 = map;
                            str = strM56584;
                            int iM556814 = C0873.m55680("ܳ۬") ^ i12;
                            i14 = iM556814 ^ 142474745;
                            i13 = ((iM556814 ^ i11) * 4987) ^ 2085564737;
                            strM56584 = str;
                            c19561 = c19561;
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
                    c5739 = c57310;
                    obj = obj;
                    th = th2;
                    c22739 = c227311;
                    C0949.m56011(th, obj);
                    int iM559713 = C0946.m55979("ۛۨ") ^ i12;
                    strM56584 = strM56584;
                    i6 = ((iM559713 ^ i11) * (-12989)) ^ (-1613707476);
                    i8 = iM559713 ^ (-776969154);
                    c227311 = c22739;
                    th2 = th;
                    map5 = map4;
                    c57310 = c5739;
                    i14 = i8;
                    i13 = i6;
                    strM56584 = strM56584;
                    obj = obj;
                    break;
                case 725189624:
                case 1491522890:
                    map = map5;
                    zM55886 = C0930.m55886(itM56593);
                    iM55681 = (C0873.m55680("۟ܰ") ^ i11) * 5;
                    i2 = ((iM55681 ^ i12) * 9839) ^ (-1444775891);
                    i5 = 886669124;
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 1001013781:
                case 1223111298:
                    if (!zM56405) {
                        map = map5;
                        iM55681 = C0946.m55979("ۗۤ") ^ i12;
                        i2 = ((iM55681 ^ i11) * (-7973)) ^ 2121187378;
                        i5 = -1539108116;
                        i3 = iM55681 ^ i5;
                        map2 = map;
                        i14 = i3;
                        i13 = i2;
                        map5 = map2;
                    } else {
                        int iM559714 = C0946.m55979("۬ܺ") ^ i11;
                        i = ((iM559714 ^ i12) * (-1043)) ^ 2140620802;
                        i14 = iM559714 ^ 1811912273;
                        i13 = i;
                    }
                    break;
                case 1155101797:
                case 1350684864:
                    i15 = 16124;
                    iM55682 = (C0946.m55979("۬۫") + i11) * 63;
                    i6 = ((iM55682 ^ i12) * (-11735)) ^ (-1844951237);
                    i7 = -1399810789;
                    i8 = iM55682 ^ i7;
                    map5 = map5;
                    c57310 = c57310;
                    c19561 = c19561;
                    th2 = th2;
                    i14 = i8;
                    i13 = i6;
                    strM56584 = strM56584;
                    obj = obj;
                    break;
                case 1296029965:
                case 2078588760:
                    map = map5;
                    c5738 = c57310;
                    strM56016 = C0949.m56016(f82327, 70, 4, i15);
                    if (zM55807) {
                        iM55680 = (i11 - C0873.m55680("ܽۜ")) * 59;
                        i2 = ((iM55680 ^ i12) * (-23149)) ^ 214496737;
                        i4 = 13219079;
                    } else {
                        iM55680 = C0873.m55680("۟֫") ^ i12;
                        i2 = ((iM55680 ^ i11) * 32131) ^ (-1496728732);
                        i4 = 606946607;
                    }
                    i3 = iM55680 ^ i4;
                    c57310 = c5738;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 1540063470:
                case 2116190373:
                    map = map5;
                    strM56241 = C1028.m56241(c57310);
                    zM56404 = C1229.m56404(strM56241, C0894.m55773(f82327, 287, 2, i15));
                    iM55681 = C0946.m55979("ۗۘ") ^ i12;
                    i2 = ((iM55681 ^ i11) * 14197) ^ 219796925;
                    i5 = -1858781057;
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
                case 1809396287:
                case 2070624506:
                    map = map5;
                    c5738 = c57310;
                    c227310 = c227311;
                    zM55807 = C0906.m55806(C1964.m56584(f82327, 66, 4, i15), strM50890);
                    iM55979 = C0873.m55680("ᩳۖ") ^ i11;
                    i9 = ((iM55979 ^ i12) * (-9965)) ^ 275668415;
                    i10 = -1804963864;
                    c227311 = c227310;
                    map5 = map;
                    i14 = iM55979 ^ i10;
                    i13 = i9;
                    c57310 = c5738;
                    break;
                default:
                    map = map5;
                    if (zM56404) {
                        iM55681 = C0946.m55979("ܶ۫") ^ i12;
                        i2 = ((iM55681 ^ i11) * (-23419)) ^ (-269554630);
                        i5 = 459577689;
                    } else {
                        iM55681 = (C0946.m55979("ۤۘ") + i11) * (-33);
                        i2 = ((iM55681 ^ i12) * 12055) ^ 1017977510;
                        i5 = -1755345305;
                    }
                    i3 = iM55681 ^ i5;
                    map2 = map;
                    i14 = i3;
                    i13 = i2;
                    map5 = map2;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC23283 activityC23283 = null;
        int i = -2060028159;
        int i2 = C1053.f81965;
        int i3 = RunnableC0938.f81886;
        int iM55680 = C0873.m55680("֫᩺") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-14045)) ^ 1954202557;
        int i5 = -138070832;
        while (true) {
            i = ((((i ^ i3) * (-27777)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1894478551:
                case 839504087:
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("ۨ֡") ^ i3) * 101;
                        i4 = ((iM55680 ^ i2) * (-9115)) ^ 1965085988;
                        i5 = 272885132;
                    } else {
                        iM55680 = (C0873.m55680("᩻۠") ^ i3) * (-43);
                        i4 = ((iM55680 ^ i2) * (-20257)) ^ (-587873865);
                        i5 = 1034914715;
                    }
                    break;
                case -1630328717:
                case 157020548:
                    C0946.m55980();
                    if (C1017.m56187() > 0) {
                        iM55680 = C0946.m55979("ܳ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1535) ^ 1678814661;
                        i5 = -350081916;
                    } else {
                        iM55680 = C0946.m55979("ܰۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32521) ^ (-623558325);
                        i5 = 814609088;
                    }
                    break;
                case -1586575269:
                case -439945381:
                    C1229.m56410();
                    C0927.m55873();
                    break;
                case -1208904942:
                case 1260877077:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("᩻֨") + i3) * 41;
                        i4 = ((iM55680 ^ i2) * (-26529)) ^ 1534311149;
                        i5 = -1380152414;
                    } else {
                        iM55680 = (C0873.m55680("۠ۡ") + i3) * (-3);
                        i4 = ((iM55680 ^ i2) * (-28971)) ^ (-1409744151);
                        i5 = 103591739;
                    }
                    break;
                case -1013327913:
                case 617913165:
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("ۚۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55680 ^ i3) * 7385) ^ (-1723009181);
                        i5 = -572277454;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۬ܺ")) * (-83);
                        i4 = ((iM55680 ^ i2) * (-18331)) ^ (-846662604);
                        i5 = 1890271824;
                    }
                    break;
                case -1009922692:
                case -717789476:
                    if (RunnableC1014.m56177()) {
                        iM55680 = (C0946.m55979("ܽۢ") + i2) * 51;
                        i4 = ((iM55680 ^ i3) * (-11887)) ^ 550500967;
                        i5 = 1912644737;
                    } else {
                        iM55680 = C0946.m55979("ܰۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32521) ^ (-623558325);
                        i5 = 814609088;
                    }
                    break;
                case -545326065:
                case 1878058901:
                    C0992.m56107();
                    iM55680 = C0946.m55979("ܰۡ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 32521) ^ (-623558325);
                    i5 = 814609088;
                    break;
                case -505971620:
                case 163877394:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("ܳ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1535) ^ 1678814661;
                        i5 = -350081916;
                    } else {
                        iM55680 = C0946.m55979("֡ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30169)) ^ (-813428619);
                        i5 = -990469150;
                    }
                    break;
                case -257278062:
                case 674883921:
                    if (C0937.f81884) {
                        iM55680 = (C0873.m55680("ۡ֨") + i3) * 15;
                        i4 = ((iM55680 ^ i2) * 23) ^ 1906199126;
                        i5 = 999781869;
                    } else {
                        iM55680 = (C0946.m55979("ۚۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55680 ^ i3) * 7385) ^ (-1723009181);
                        i5 = -572277454;
                    }
                    break;
                case -243526277:
                case 1773621784:
                    C0946.m55980();
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        iM55680 = (C0873.m55680("ۨ֡") ^ i3) * 101;
                        i4 = ((iM55680 ^ i2) * (-9115)) ^ 1965085988;
                        i5 = 272885132;
                    } else {
                        iM55680 = C0946.m55979("ܰۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32521) ^ (-623558325);
                        i5 = 814609088;
                    }
                    break;
                case -205548051:
                case 1646237753:
                    if (!C1024.f81946) {
                        iM55680 = C0946.m55979("ܳ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1535) ^ 1678814661;
                        i5 = -350081916;
                    } else {
                        iM55680 = (C0946.m55979("ۚۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55680 ^ i3) * 7385) ^ (-1723009181);
                        i5 = -572277454;
                    }
                    break;
                case 445715618:
                case 1023044399:
                    activityC23283.m12260((Throwable) exc, true);
                    break;
                case 478863670:
                case 2066261180:
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("᩻֨") + i3) * 41;
                        i4 = ((iM55680 ^ i2) * (-26529)) ^ 1534311149;
                        i5 = -1380152414;
                    } else {
                        iM55680 = (C0946.m55979("ܶ᩷") + i3) * (-35);
                        i4 = ((iM55680 ^ i2) * 28493) ^ 484703713;
                        i5 = 1037007743;
                    }
                    break;
                case 558390794:
                case 813249632:
                    if (C0947.m55997()) {
                        iM55680 = (C0873.m55680("᩻֨") + i3) * 41;
                        i4 = ((iM55680 ^ i2) * (-26529)) ^ 1534311149;
                        i5 = -1380152414;
                    } else {
                        iM55680 = C0873.m55680("ۨܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1809)) ^ 2030192616;
                        i5 = -1152878263;
                    }
                    break;
                case 1117126720:
                case 1962852442:
                    if (C1024.f81946) {
                        iM55680 = (C0946.m55979("ۚۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55680 ^ i3) * 7385) ^ (-1723009181);
                        i5 = -572277454;
                    } else {
                        iM55680 = C0946.m55979("֨ۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25457)) ^ 145704172;
                        i5 = -712252600;
                    }
                    break;
                default:
                    activityC23283 = this.f63668;
                    if (C0930.m55885() <= 0) {
                        iM55680 = (C0873.m55680("᩻֨") + i3) * 41;
                        i4 = ((iM55680 ^ i2) * (-26529)) ^ 1534311149;
                        i5 = -1380152414;
                    } else {
                        iM55680 = C0946.m55979("ᩳܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14725)) ^ (-45001065);
                        i5 = 785254054;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C1036.m56260(this);
    }
}
