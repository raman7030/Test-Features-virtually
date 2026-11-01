package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0940 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8166 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۤ᩺ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f82021 = {3437, 14075, 9392, 13839, 2168, 25606, 25603, 25622, 25603};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ RunnableC20062 f21538;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC13531 f21539;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ List f21540;

    public C8166(ActivityC13531 activityC13531, ArrayList arrayList, RunnableC20062 runnableC20062) {
        int i = 1804156597;
        int i2 = C0989.f81920;
        int i3 = C1053.f81965;
        this.f21539 = activityC13531;
        this.f21540 = arrayList;
        this.f21538 = runnableC20062;
        int iM55680 = (C0873.m55680("֨᩹") ^ i3) * (-101);
        int i4 = ((iM55680 ^ i2) * 18381) ^ (-381356310);
        int i5 = -2131583390;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i2) * 21457) >> 31));
            switch (i) {
                case -1844823498:
                case 407936732:
                    return;
                case -1427459136:
                case 1541022322:
                    C0917.m55854();
                    if (C0882.m55710() == 0) {
                        iM55680 = (C0946.m55979("۟ܿ") + i3) * 59;
                        i4 = ((iM55680 ^ i2) * (-6985)) ^ (-1114234957);
                        i5 = 1237889630;
                    }
                    break;
                case -1016351668:
                case 1488489638:
                    C0927.m55873();
                    break;
                case 181068568:
                case 704633207:
                    C0894.m55769();
                    if (C1044.f81959 < 0) {
                        iM55680 = C0946.m55979("᩺ۘ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23807) ^ (-1695802666);
                        i5 = 1084609333;
                    }
                    break;
                case 505474954:
                case 1962590595:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۖۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6085) ^ (-889214003);
                        i5 = 1606988699;
                    }
                    break;
                case 1276658034:
                case 1853650699:
                    C1929.m56553();
                    throw new RuntimeException();
                default:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("ۡۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4281) ^ (-1809958066);
                        i5 = -1514087;
                    } else {
                        iM55680 = C0946.m55979("ۘ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29579)) ^ (-1020593921);
                        i5 = 739006826;
                        continue;
                    }
                    break;
            }
            iM55680 = C0873.m55680("ۛ۫") ^ i2;
            i4 = ((iM55680 ^ i3) * (-7627)) ^ 1681000098;
            i5 = -1187364715;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2 A[PHI: r2 r8 r9 r13
      0x01b2: PHI (r2v3 l.ۨܰܽ) = (r2v2 l.ۨܰܽ), (r2v4 l.ۨܰܽ) binds: [B:52:0x01b0, B:33:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:52:0x01b0, B:33:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:52:0x01b0, B:33:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r13v3 short[]) = (r13v2 short[]), (r13v4 short[]) binds: [B:52:0x01b0, B:33:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e3 A[PHI: r7
      0x01e3: PHI (r7v5 char) = (r7v3 char), (r7v2 char) binds: [B:56:0x01e1, B:8:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0214 A[PHI: r3 r4 r5 r10 r11
      0x0214: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:60:0x0212, B:48:0x018e, B:44:0x016c, B:25:0x00b4, B:21:0x0092, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:60:0x0212, B:48:0x018e, B:44:0x016c, B:25:0x00b4, B:21:0x0092, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:60:0x0212, B:48:0x018e, B:44:0x016c, B:25:0x00b4, B:21:0x0092, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:60:0x0212, B:48:0x018e, B:44:0x016c, B:25:0x00b4, B:21:0x0092, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:60:0x0212, B:48:0x018e, B:44:0x016c, B:25:0x00b4, B:21:0x0092, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0249 A[PHI: r14 r19
      0x0249: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:64:0x0247, B:29:0x00d5, B:14:0x0064, B:8:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x0247, B:29:0x00d5, B:14:0x0064, B:8:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55979;
        int i;
        int i2;
        int i3 = C1071.f81975;
        int i4 = C1012.f81938;
        int iM559710 = (i3 - C0946.m55979("ۜۘ")) * C0254q.f1218h;
        int i5 = ((iM559710 ^ i4) * 18495) ^ (-1284715897);
        String strM55592 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ 287658800;
        ActivityC13531 activityC13531 = null;
        int iM559711 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1802646082;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-14349)) >> 31));
            switch (i12) {
                case -2141025788:
                case -1659620269:
                    C0894.m55769();
                    iM55979 = (C0873.m55680("ۗܽ") + i4) * (-9);
                    i = ((iM55979 ^ i3) * 2747) ^ 2087020007;
                    i2 = -923961073;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1957455287:
                case 164405495:
                    C0890.m55740();
                    if (C0890.m55740()) {
                        iM55979 = (C0946.m55979("ۘۨ") + i4) * 109;
                        i = ((iM55979 ^ i3) * (-9957)) ^ 510885343;
                        i2 = -1704288292;
                    } else {
                        iM55979 = (C0873.m55680("ۗܽ") + i4) * (-9);
                        i = ((iM55979 ^ i3) * 2747) ^ 2087020007;
                        i2 = -923961073;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1682013616:
                case 682682531:
                    if ((s * s2) - i9 > 0) {
                        iM55979 = (C0946.m55979("۫֫") + i3) * 99;
                        i = ((iM55979 ^ i4) * 9997) ^ 1322843713;
                        i2 = 432025007;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۙ") + i4) * 81;
                        i = ((iM55979 ^ i3) * (-4583)) ^ 888303039;
                        i2 = 1112329578;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1465882809:
                case -1148555340:
                    i11 = 1;
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0946.m55979("ۘۨ") + i4) * 109;
                        i = ((iM55979 ^ i3) * (-9957)) ^ 510885343;
                        i2 = -1704288292;
                    } else {
                        iM55979 = C0873.m55680("ᩳ۟") ^ i3;
                        i = ((iM55979 ^ i4) * 18483) ^ 1510069284;
                        i2 = 1504726575;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1131209708:
                case 706725510:
                    s = sArr[c];
                    i8 = s * s;
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("۫ۚ") + i3) * 115;
                        i = ((iM55979 ^ i4) * (-7643)) ^ (-1497138066);
                        i2 = -1409258867;
                    } else {
                        iM55979 = C0946.m55979("ܽۗ") ^ i3;
                        i = ((iM55979 ^ i4) * 19675) ^ 1728827287;
                        i2 = 571507303;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1106373476:
                case 1501554695:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ᩴܿ") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5097)) ^ (-143618101);
                        i2 = 1270586764;
                    } else {
                        iM55979 = (C0873.m55680("ۙ֨") ^ i4) * (-41);
                        i = ((iM55979 ^ i3) * 10113) ^ (-1823573223);
                        i2 = -1000481365;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1091958569:
                case -892858320:
                    if (C0863.f81833 > 0) {
                        iM55979 = (C0946.m55979("ۘۨ") + i4) * 109;
                        i = ((iM55979 ^ i3) * (-9957)) ^ 510885343;
                        i2 = -1704288292;
                    } else {
                        iM55979 = C0946.m55979("ۤܺ") ^ i4;
                        i = ((iM55979 ^ i3) * 7107) ^ 1354015047;
                        i2 = 1259482124;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1028303523:
                case 238729079:
                    i10 = 43575;
                    iM55979 = (C0873.m55680("ۧ᩵") + i3) * 45;
                    i = ((iM55979 ^ i4) * 4293) ^ (-1937722353);
                    i2 = 53455275;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -965491034:
                case -482580209:
                    i10 = 45636;
                    iM55979 = (C0873.m55680("ۧ᩵") + i3) * 45;
                    i = ((iM55979 ^ i4) * 4293) ^ (-1937722353);
                    i2 = 53455275;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -907800931:
                case -547020219:
                    s2 = 22040;
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0873.m55680("ᩴܿ") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5097)) ^ (-143618101);
                        i2 = 1270586764;
                    } else {
                        iM55979 = (C0873.m55680("۫ᩴ") + i3) * 65;
                        i = ((iM55979 ^ i4) * 7561) ^ 2065915066;
                        i2 = 1313749945;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -870333763:
                case 4425988:
                    activityC13531 = this.f21539;
                    sArr2 = f82021;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("۫ۚ") + i3) * 115;
                        i = ((iM55979 ^ i4) * (-7643)) ^ (-1497138066);
                        i2 = -1409258867;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܶۙ")) * (-107);
                        i = ((iM55979 ^ i3) * 2627) ^ (-349320568);
                        i2 = -125937938;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -126498044:
                case 1087562343:
                    sArr = f82021;
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0946.m55979("ۘۨ") + i4) * 109;
                        i = ((iM55979 ^ i3) * (-9957)) ^ 510885343;
                        i2 = -1704288292;
                    } else {
                        iM55979 = (C0946.m55979("ᩴۗ") ^ i3) * 19;
                        i = ((iM55979 ^ i4) * 19717) ^ (-277596690);
                        i2 = 1639381509;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -104817700:
                case 1789685549:
                    C1071.m56343();
                    RunnableC0938.m55938();
                    break;
                case -69000974:
                case 1005245322:
                    c = 0;
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("ۤܺ") ^ i4;
                        i = ((iM55979 ^ i3) * 7107) ^ 1354015047;
                        i2 = 1259482124;
                    } else {
                        iM55979 = (C0946.m55979("᩸᩵") + i4) * 31;
                        i = ((iM55979 ^ i3) * (-8847)) ^ 1513234201;
                        i2 = 1364100719;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -33117198:
                case 1380486799:
                    if (C0892.f81851) {
                        iM55979 = (C0873.m55680("ᩴܿ") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5097)) ^ (-143618101);
                        i2 = 1270586764;
                    } else {
                        iM55979 = (C0873.m55680("ۗܽ") + i4) * (-9);
                        i = ((iM55979 ^ i3) * 2747) ^ 2087020007;
                        i2 = -923961073;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 78363549:
                case 201299372:
                    i9 = i8 + 121440400;
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("۬ܺ") ^ i4) * (-107);
                        i = ((iM55979 ^ i3) * 6345) ^ (-649154986);
                        i2 = -1718643901;
                    } else {
                        iM55979 = (C0873.m55680("ᩴܿ") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5097)) ^ (-143618101);
                        i2 = 1270586764;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 109437454:
                case 1873012441:
                    iM559711 = C0946.m55979(strM55592);
                    i7 = 2102161551;
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0873.m55680("ᩴܿ") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5097)) ^ (-143618101);
                        i2 = 1270586764;
                    } else {
                        iM55979 = C0873.m55680("ۢ᩺") ^ i3;
                        i = ((iM55979 ^ i4) * (-2461)) ^ (-719102758);
                        i2 = -1959136939;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 606423595:
                case 2131274275:
                    strM55592 = C0845.m55592(sArr2, i11, 3, i10);
                    if (C1229.m56410() != 0) {
                        iM55979 = (C0873.m55680("ᩴܿ") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-5097)) ^ (-143618101);
                        i2 = 1270586764;
                    } else {
                        iM55979 = (C0873.m55680("ܺ۠") + i4) * (-99);
                        i = ((iM55979 ^ i3) * (-29657)) ^ 250150861;
                        i2 = -29190504;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    m22243(activityC13531, iM559711 ^ i7);
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f21538.run();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC13531 activityC13531 = null;
        int i = 1191431861;
        int i2 = C0989.f81920;
        int i3 = C1025.f81947;
        int iM55979 = C0946.m55979("ᩴۧ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 27657) ^ 1271676110;
        int i5 = -483341271;
        while (true) {
            i = ((((i ^ i2) * (-19399)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2006635344:
                case -1267024355:
                    if (C0863.f81833 > 0) {
                        iM55979 = C0873.m55680("ۖܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28895)) ^ (-1508530894);
                        i5 = 873413104;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩺ܿ")) * (-41);
                        i4 = ((iM55979 ^ i3) * 22121) ^ 531204588;
                        i5 = 1899506554;
                    }
                    break;
                case -1808810645:
                case -382034457:
                    C1964.m56597();
                    ViewOnClickListenerC0939.m55941();
                    iM55979 = (i2 - C0873.m55680("᩺ܿ")) * (-41);
                    i4 = ((iM55979 ^ i3) * 22121) ^ 531204588;
                    i5 = 1899506554;
                    break;
                case -1097064584:
                case -962298136:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("ۡ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7171)) ^ (-436309601);
                        i5 = 2101816519;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۬۫")) * (-127);
                        i4 = ((iM55979 ^ i2) * (-17065)) ^ (-456159307);
                        i5 = -1583982092;
                    }
                    break;
                case -1064819907:
                case 1793824661:
                    RunnableC1014.m56177();
                    if (!C0861.m55626()) {
                        iM55979 = C0946.m55979("ܺۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-31905)) ^ 1034078749;
                        i5 = 741187940;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩺ܿ")) * (-41);
                        i4 = ((iM55979 ^ i3) * 22121) ^ 531204588;
                        i5 = 1899506554;
                    }
                    break;
                case -862147915:
                case 1127335259:
                    if (C0863.m55643()) {
                        iM55979 = C0946.m55979("ۘۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8675) ^ (-1298025468);
                        i5 = -197227427;
                    } else {
                        iM55979 = C0946.m55979("ܺۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-31905)) ^ 1034078749;
                        i5 = 741187940;
                    }
                    break;
                case -858279452:
                case -101180381:
                    C1012.m56134();
                    C0845.m55584();
                    break;
                case -653288163:
                case 1802142444:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0946.m55979("ۛۙ") ^ i3) * (-31);
                        i4 = ((iM55979 ^ i2) * 13129) ^ (-555224728);
                        i5 = -1969661516;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩺ܿ")) * (-41);
                        i4 = ((iM55979 ^ i3) * 22121) ^ 531204588;
                        i5 = 1899506554;
                    }
                    break;
                case -525857789:
                case -494503313:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("ۛۙ") ^ i3) * (-31);
                        i4 = ((iM55979 ^ i2) * 13129) ^ (-555224728);
                        i5 = -1969661516;
                    } else {
                        iM55979 = C0946.m55979("ۜ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4439) ^ 82413641;
                        i5 = 1995207290;
                    }
                    break;
                case -17958012:
                case 562314848:
                    if (C1024.f81946) {
                        iM55979 = (i2 - C0873.m55680("᩺ܿ")) * (-41);
                        i4 = ((iM55979 ^ i3) * 22121) ^ 531204588;
                        i5 = 1899506554;
                    } else {
                        iM55979 = (C0873.m55680("ۧ᩷") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i2) * (-24157)) ^ 716052152;
                        i5 = 253816190;
                    }
                    break;
                case 18648515:
                case 1618297150:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("ܺۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-31905)) ^ 1034078749;
                        i5 = 741187940;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۜܿ")) * 89;
                        i4 = ((iM55979 ^ i3) * (-3437)) ^ (-446054421);
                        i5 = -2041736212;
                    }
                    break;
                case 277017754:
                case 424796592:
                    if (C0854.m55595() >= 0) {
                        iM55979 = C0873.m55680("ۡ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7171)) ^ (-436309601);
                        i5 = 2101816519;
                    } else {
                        iM55979 = C0873.m55680("᩵ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-20781)) ^ 1789997870;
                        i5 = -655611143;
                    }
                    break;
                case 364266043:
                case 1360297112:
                    C1044.m56272(activityC13531, exc, null);
                    break;
                case 397686583:
                case 2021978664:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("ۖܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28895)) ^ (-1508530894);
                        i5 = 873413104;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩶᩹")) * 35;
                        i4 = ((iM55979 ^ i3) * 3981) ^ (-863502427);
                        i5 = -204598438;
                    }
                    break;
                case 466666846:
                case 1889406630:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0873.m55680("ۡ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7171)) ^ (-436309601);
                        i5 = 2101816519;
                    } else {
                        iM55979 = C0946.m55979("᩵ܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30329) ^ (-2059662112);
                        i5 = 174653751;
                    }
                    break;
                case 768461673:
                case 1660437824:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ܺۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-31905)) ^ 1034078749;
                        i5 = 741187940;
                    } else {
                        iM55979 = C0946.m55979("ۛܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7815)) ^ (-1221609324);
                        i5 = 369188928;
                    }
                    break;
                default:
                    activityC13531 = this.f21539;
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = C0873.m55680("ۡ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7171)) ^ (-436309601);
                        i5 = 2101816519;
                    } else {
                        iM55979 = C0873.m55680("ۤۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26871)) ^ 1265424482;
                        i5 = -527154129;
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

    /* JADX WARN: Code duplicated, block: B:46:0x017f A[PHI: r3 r4 r5 r9 r10
      0x017f: PHI (r3v5 int) = (r3v2 int), (r3v1 int), (r3v1 int) binds: [B:45:0x017d, B:37:0x013c, B:87:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r4v5 l.ܰ۟ۡ[]) = (r4v2 l.ܰ۟ۡ[]), (r4v1 l.ܰ۟ۡ[]), (r4v1 l.ܰ۟ۡ[]) binds: [B:45:0x017d, B:37:0x013c, B:87:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r5v5 l.᩸۟ۡ) = (r5v1 l.᩸۟ۡ), (r5v2 l.᩸۟ۡ), (r5v1 l.᩸۟ۡ) binds: [B:45:0x017d, B:37:0x013c, B:87:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r9v6 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:45:0x017d, B:37:0x013c, B:87:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r10v6 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:45:0x017d, B:37:0x013c, B:87:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0231 A[PHI: r13 r14
      0x0231: PHI (r13v5 int) = (r13v2 int), (r13v1 int), (r13v1 int), (r13v1 int), (r13v1 int) binds: [B:61:0x022f, B:17:0x0073, B:15:0x006f, B:9:0x0060, B:102:0x0231] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r14v5 int) = (r14v2 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:61:0x022f, B:17:0x0073, B:15:0x006f, B:9:0x0060, B:102:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0291 A[PHI: r18
      0x0291: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:69:0x028f, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02d3 A[PHI: r2 r16 r17 r23
      0x02d3: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String) binds: [B:74:0x02d1, B:51:0x01bd, B:15:0x006f, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:74:0x02d1, B:51:0x01bd, B:15:0x006f, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r17v3 char) = (r17v2 char), (r17v2 char), (r17v2 char), (r17v4 char) binds: [B:74:0x02d1, B:51:0x01bd, B:15:0x006f, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r23v4 l.ۨܰܽ) = (r23v1 l.ۨܰܽ), (r23v3 l.ۨܰܽ), (r23v1 l.ۨܰܽ), (r23v1 l.ۨܰܽ) binds: [B:74:0x02d1, B:51:0x01bd, B:15:0x006f, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        int iM55979;
        int i;
        int iM55680;
        int i2;
        int i3;
        C8166 c8166 = this;
        String strM38647 = null;
        int i4 = 0;
        EnumC15361[] enumC15361Arr = null;
        C22739 c22739M16894 = null;
        C3292 c3292 = null;
        Iterator itM55766 = null;
        C10674 c10674 = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1559396176;
        int i9 = C0930.f81879;
        int i10 = C0845.f81821;
        int iM55681 = C0873.m55680("֫֡") ^ i9;
        int i11 = ((iM55681 ^ i10) * (-29911)) ^ (-790063555);
        int i12 = iM55681 ^ 689225153;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        ActivityC13531 activityC13531 = null;
        int i15 = 0;
        short[] sArr = null;
        short[] sArr2 = null;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-20043)) >> 31));
            switch (i8) {
                case -2123290618:
                case 1089492646:
                    i7 = 25698;
                    iM55979 = C0946.m55979("۫֫") ^ i9;
                    i11 = ((iM55979 ^ i10) * 6197) ^ 896073420;
                    i = 1200773320;
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case -2031218433:
                case 128543073:
                    sArr = f82021;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0946.m55979("ۛ᩵") ^ i9) * C0254q.f1218h;
                        i11 = ((iM55979 ^ i10) * (-10087)) ^ (-1350012032);
                        i = -547796250;
                    } else {
                        iM55979 = (C0946.m55979("᩶ۧ") ^ i10) * 11;
                        i11 = ((iM55979 ^ i9) * (-14899)) ^ 1442762306;
                        i = -1525534885;
                    }
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case -1958506818:
                case 1060840985:
                    if ((i6 + 1) - i5 > 0) {
                        iM55979 = C0873.m55680("ܿܰ") ^ i10;
                        i11 = ((iM55979 ^ i9) * 2609) ^ (-184248685);
                        i = -309052088;
                    } else {
                        iM55979 = C0946.m55979("᩷᩺") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-27321)) ^ 654102706;
                        i = -1135213298;
                    }
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case -1889770594:
                case 946164111:
                    c10674 = (C10674) RunnableC0897.m55785(itM55766);
                    if (c10674.f29536 != null) {
                        iM55680 = C0873.m55680("᩸ᩳ") ^ i10;
                        i2 = ((iM55680 ^ i9) * (-5981)) ^ 1801046611;
                        i3 = 1797578085;
                    } else {
                        iM55680 = C0946.m55979("ۨۜ") ^ i10;
                        i2 = ((iM55680 ^ i9) * 23997) ^ (-1771830610);
                        i3 = -644970327;
                    }
                    i12 = iM55680 ^ i3;
                    i11 = i2;
                    break;
                case -1839144109:
                case 1764746526:
                    ActivityC13531 activityC13532 = c8166.f21539;
                    strM38647 = activityC13532.f38053.m38647();
                    if (C0890.f81849 != 0) {
                        activityC13531 = activityC13532;
                        iM55979 = (C0946.m55979("ۛ᩵") ^ i9) * C0254q.f1218h;
                        i11 = ((iM55979 ^ i10) * (-10087)) ^ (-1350012032);
                        i = -547796250;
                        i12 = iM55979 ^ i;
                    } else {
                        int iM559710 = C0946.m55979("֨ܿ") ^ i10;
                        i12 = iM559710 ^ (-370492328);
                        activityC13531 = activityC13532;
                        i11 = ((iM559710 ^ i9) * (-6045)) ^ (-330208524);
                    }
                    c8166 = this;
                    break;
                case -1803748516:
                case 2024311613:
                    i14 = 4;
                    if (!RunnableC1014.m56177()) {
                        iM55979 = C0873.m55680("ܳۛ") ^ i10;
                        i11 = ((iM55979 ^ i9) * 21467) ^ (-1804006981);
                        i = 1662089443;
                        i12 = iM55979 ^ i;
                        c8166 = this;
                    } else {
                        iM55680 = (C0873.m55680("ܿ᩵") + i9) * 83;
                        i2 = ((iM55680 ^ i10) * 12381) ^ 272193501;
                        i3 = 1416353894;
                        i12 = iM55680 ^ i3;
                        i11 = i2;
                    }
                    break;
                case -1774040895:
                case 4892660:
                    i5 = i15 * i15;
                    i6 = s * 2;
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("᩷֨") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-621)) ^ (-408078237);
                        i = 293961214;
                    } else {
                        iM55979 = C0946.m55979("ۨ۠") ^ i9;
                        i11 = ((iM55979 ^ i10) * 3405) ^ (-1458135897);
                        i = -1753303719;
                    }
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case -1753051435:
                case -968804844:
                    c3292.m5737(c10674.f29535).set(i4, c10674.f29536);
                    iM55680 = C0946.m55979("ۨۜ") ^ i10;
                    i2 = ((iM55680 ^ i9) * 23997) ^ (-1771830610);
                    i3 = -644970327;
                    i12 = iM55680 ^ i3;
                    i11 = i2;
                    break;
                case -1615559776:
                case -1091007028:
                    C0937.m55918();
                    if (C1012.m56134() > 0) {
                        iM55979 = C0946.m55979("ۨ۠") ^ i9;
                        i11 = ((iM55979 ^ i10) * 3405) ^ (-1458135897);
                        i = -1753303719;
                    } else {
                        iM55979 = C0873.m55680("ܶܿ") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-20883)) ^ (-825470290);
                        i = 617544863;
                    }
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case -1475931976:
                case 952481984:
                    i15 = s + 1;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0873.m55680("ܳۛ") ^ i10;
                        i11 = ((iM55979 ^ i9) * 21467) ^ (-1804006981);
                        i = 1662089443;
                    } else {
                        iM55979 = C0873.m55680("᩵۬") ^ i9;
                        i11 = ((iM55979 ^ i10) * 4053) ^ (-1214137);
                        i = -1191439840;
                    }
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case -1178400681:
                case 1633558833:
                    C0949.m56012();
                    C1012.m56134();
                    break;
                case -1121480355:
                case 623593750:
                    if (C0866.m55647(itM55766)) {
                        iM55680 = C0873.m55680("ۙۘ") ^ i9;
                        i2 = ((iM55680 ^ i10) * 29469) ^ 1461842251;
                        i3 = -1579034249;
                    } else {
                        iM55680 = (i10 - C0946.m55979("ܽ᩻")) * 109;
                        i2 = ((iM55680 ^ i9) * (-23025)) ^ (-1102671170);
                        i3 = -536732474;
                    }
                    i12 = iM55680 ^ i3;
                    i11 = i2;
                    break;
                case -923621651:
                case 288475090:
                    i7 = 21437;
                    iM55979 = C0946.m55979("۫֫") ^ i9;
                    i11 = ((iM55979 ^ i10) * 6197) ^ 896073420;
                    i = 1200773320;
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case -503536837:
                case 1118753037:
                    enumC15361Arr[0] = EnumC15361.OrderedField;
                    if (RunnableC0938.f81886 < 0) {
                        iM55680 = (C0946.m55979("۠ۛ") ^ i10) * (-113);
                        i2 = ((iM55680 ^ i9) * 22941) ^ 1944428392;
                        i3 = 1204464688;
                        i12 = iM55680 ^ i3;
                        i11 = i2;
                    } else {
                        iM55979 = C0873.m55680("ܳۛ") ^ i10;
                        i11 = ((iM55979 ^ i9) * 21467) ^ (-1804006981);
                        i = 1662089443;
                        i12 = iM55979 ^ i;
                        c8166 = this;
                    }
                    break;
                case -293140832:
                case 1442637156:
                    if (C0873.f81841 > 0) {
                        iM55979 = C0946.m55979("ۨ۠") ^ i9;
                        i11 = ((iM55979 ^ i10) * 3405) ^ (-1458135897);
                        i = -1753303719;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩵") ^ i9) * C0254q.f1218h;
                        i11 = ((iM55979 ^ i10) * (-10087)) ^ (-1350012032);
                        i = -547796250;
                    }
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case -75402279:
                case 481443782:
                    s = sArr[c];
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0873.m55680("ܶܿ") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-20883)) ^ (-825470290);
                        i = 617544863;
                    } else {
                        iM55979 = C0946.m55979("۟۬") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-25069)) ^ (-1224383864);
                        i = -1000309146;
                    }
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case 175340448:
                case 1472180842:
                    C1046.m56302();
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("ᩴۡ") ^ i10;
                        i2 = ((iM55680 ^ i9) * 5249) ^ (-1169732204);
                        i3 = 304161030;
                        i12 = iM55680 ^ i3;
                        i11 = i2;
                    } else {
                        iM55979 = C0946.m55979("ۨ۠") ^ i9;
                        i11 = ((iM55979 ^ i10) * 3405) ^ (-1458135897);
                        i = -1753303719;
                        i12 = iM55979 ^ i;
                        c8166 = this;
                    }
                    break;
                case 232231482:
                case 1662426757:
                    C0946.m55980();
                    iM55979 = C0946.m55979("ۨ۠") ^ i9;
                    i11 = ((iM55979 ^ i10) * 3405) ^ (-1458135897);
                    i = -1753303719;
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
                case 357504900:
                case 364659534:
                    i4 = 1;
                    enumC15361Arr = new EnumC15361[1];
                    if (C0927.m55873() <= 0) {
                        iM55680 = C0873.m55680("ᩴۡ") ^ i10;
                        i2 = ((iM55680 ^ i9) * 5249) ^ (-1169732204);
                        i3 = 304161030;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ۡ۟")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM55680 ^ i10) * (-11747)) ^ 1802551937;
                        i3 = 17881509;
                    }
                    i12 = iM55680 ^ i3;
                    i11 = i2;
                    break;
                case 1025106016:
                case 1535953862:
                    c22739M16894 = AbstractC7316.m16894(strM38647, enumC15361Arr);
                    sArr2 = f82021;
                    i13 = 5;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("ᩴۡ") ^ i10;
                        i2 = ((iM55680 ^ i9) * 5249) ^ (-1169732204);
                        i3 = 304161030;
                    } else {
                        iM55680 = C0873.m55680("ۢۗ") ^ i9;
                        i2 = ((iM55680 ^ i10) * 27447) ^ (-2101926567);
                        i3 = -1161738593;
                    }
                    i12 = iM55680 ^ i3;
                    i11 = i2;
                    break;
                case 1176292416:
                case 1910551727:
                    activityC13531.f38053.m38668(c22739M16894.mo16897());
                    break;
                case 1943270018:
                case 2011475916:
                    C3292 c3292M50891 = c22739M16894.m50891(C0937.m55921(sArr2, i13, i14, i7));
                    itM55766 = C0894.m55766(c8166.f21540);
                    c3292 = c3292M50891;
                    iM55680 = C0946.m55979("ۨۜ") ^ i10;
                    i2 = ((iM55680 ^ i9) * 23997) ^ (-1771830610);
                    i3 = -644970327;
                    i12 = iM55680 ^ i3;
                    i11 = i2;
                    break;
                default:
                    c = 4;
                    if (AbstractC0942.m55971()) {
                        iM55979 = (C0946.m55979("ۛ᩵") ^ i9) * C0254q.f1218h;
                        i11 = ((iM55979 ^ i10) * (-10087)) ^ (-1350012032);
                        i = -547796250;
                    } else {
                        iM55979 = C0873.m55680("ۨᩴ") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-13945)) ^ 1675635400;
                        i = 839888572;
                    }
                    i12 = iM55979 ^ i;
                    c8166 = this;
                    break;
            }
            return;
        }
    }
}
