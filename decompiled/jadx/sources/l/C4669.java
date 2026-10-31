package l;

import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H508 */
/* JADX INFO: loaded from: classes3.dex */
public class C4669 extends AbstractC22366 {

    /* JADX INFO: renamed from: ۗۧ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f14844 = {8540, 8823, -10798, 11570, -19751, -19752, -19749, -19742, -19762, -19756, -19750, -19757, -19742, -19754, -19752, -19772, -19742, -19766, -19748, -19761, -19757, 1413, 10934, 10925, 10932, 10932, 29578, -21007, -18144, -22827, -21755, -19046, 4755, -5809, -5818, -5797, -5814, -5812, -5784, -5799, -5822, -5798, -5784, -5765, -5778, -5770, -5767, -5784, -5763, -5791, -5766, -5770, -5798, -5824, -5810, -5817, 5987, -13081, -13490, 12370, 20029, 20029, 20029};

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f14845;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public ArrayList f14846;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f14847;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f14848;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f14849;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f14850;

    /* JADX WARN: Code duplicated, block: B:32:0x00e9 A[PHI: r2 r3
      0x00e9: PHI (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:31:0x00e7, B:27:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:31:0x00e7, B:27:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0174 A[PHI: r10 r12 r13 r14
      0x0174: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:43:0x0172, B:35:0x011e, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:43:0x0172, B:35:0x011e, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:43:0x0172, B:35:0x011e, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:43:0x0172, B:35:0x011e, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ee A[PHI: r4 r6 r15
      0x01ee: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:55:0x01ec, B:23:0x00a0, B:12:0x0078, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:55:0x01ec, B:23:0x00a0, B:12:0x0078, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:55:0x01ec, B:23:0x00a0, B:12:0x0078, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0223 A[PHI: r7 r8 r21
      0x0223: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:59:0x0221, B:51:0x01cb, B:15:0x0081, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:59:0x0221, B:51:0x01cb, B:15:0x0081, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:59:0x0221, B:51:0x01cb, B:15:0x0081, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0257 A[PHI: r9 r16
      0x0257: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:63:0x0255, B:47:0x01a8, B:17:0x0085, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0255, B:47:0x01a8, B:17:0x0085, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        int iM6981;
        int i;
        int i2;
        int i3 = C2167.f7158;
        int i4 = ServiceConnectionC3453.f10921;
        int iM2566 = C0630.m2566("ܶ᩹") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-4223)) ^ (-442438631);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2566 ^ (-503468539);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1392762556;
        char c = 0;
        String strM5177 = null;
        int iM6982 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-7351)) >> 31));
            switch (i14) {
                case -2073641794:
                case -280768749:
                    c = '8';
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("᩹֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-15095)) ^ (-419450463);
                        i2 = 1473903916;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۚ֨")) * 89;
                        i = ((iM6981 ^ i4) * 10289) ^ (-1235247450);
                        i2 = 491093805;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1851671316:
                case 950786080:
                    sArr = f14844;
                    if (C3537.m10746() <= 0) {
                        iM6981 = C0630.m2566("֫ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 3887) ^ (-1323537356);
                        i2 = 1495384135;
                    } else {
                        iM6981 = C2105.m6981("᩵ۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 23903) ^ (-1301579102);
                        i2 = 1754428105;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1819306635:
                case 2134982011:
                    s = sArr[c];
                    if (C5695.m16023() >= 0) {
                        iM6981 = (C0630.m2566("ۨۧ") + i3) * (-75);
                        i = ((iM6981 ^ i4) * (-30185)) ^ 573835629;
                        i2 = 345071673;
                    } else {
                        iM6981 = (C2105.m6981("ۗᩳ") ^ i4) * (-69);
                        i = ((iM6981 ^ i3) * 13139) ^ (-840869764);
                        i2 = 374958268;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1761555759:
                case -457552441:
                    strM5177 = C1504.m5177(sArr2, i12, i13, i11);
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("ܳܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-21865)) ^ (-552804003);
                        i2 = 489909173;
                    } else {
                        iM6981 = (C0630.m2566("ܽۧ") ^ i4) * 63;
                        i = ((iM6981 ^ i3) * 32397) ^ 1957155068;
                        i2 = 37824573;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1485023304:
                case 117518050:
                    i11 = 19987;
                    iM6981 = (i4 - C2105.m6981("ܽܽ")) * (-23);
                    i = ((iM6981 ^ i3) * (-10667)) ^ (-1635206760);
                    i2 = -127964199;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1472299019:
                case -690928140:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("᩹֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-15095)) ^ (-419450463);
                        i2 = 1473903916;
                    } else {
                        iM6981 = (C0630.m2566("ۨۧ") + i3) * (-75);
                        i = ((iM6981 ^ i4) * (-30185)) ^ 573835629;
                        i2 = 345071673;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1390862233:
                case 1384928379:
                    iM6982 = 2129540063 ^ C2105.m6981(strM5177);
                    if (C0382.f1805) {
                        iM6981 = (C0630.m2566("᩵᩹") + i3) * 119;
                        i = ((iM6981 ^ i4) * 7627) ^ (-1320667447);
                        i2 = 799013943;
                    } else {
                        iM6981 = C0630.m2566("ܳܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-21865)) ^ (-552804003);
                        i2 = 489909173;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1338776937:
                case -349104290:
                    int i15 = i8 + i9;
                    i10 = i15 + i15;
                    if (C1916.f6442) {
                        iM6981 = (C2105.m6981("۫ܰ") + i3) * 81;
                        i = ((iM6981 ^ i4) * (-10913)) ^ 1590565574;
                        i2 = -1151716614;
                    } else {
                        iM6981 = C0630.m2566("֫ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 3887) ^ (-1323537356);
                        i2 = 1495384135;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1244232772:
                case 1462367003:
                    AbstractC2021.m6574();
                    break;
                case -1164493280:
                case -794754347:
                    i11 = 11938;
                    iM6981 = (i4 - C2105.m6981("ܽܽ")) * (-23);
                    i = ((iM6981 ^ i3) * (-10667)) ^ (-1635206760);
                    i2 = -127964199;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1154665970:
                case 546368651:
                    C4159.m12565();
                    iM6981 = C0630.m2566("֫ۖ") ^ i4;
                    i = ((iM6981 ^ i3) * 3887) ^ (-1323537356);
                    i2 = 1495384135;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -845466230:
                case -476519379:
                    C2105.m6983(this, RunnableC0588.m2436(sArr3, i7, 3, i11));
                    break;
                case -807917614:
                case 2146585537:
                    s2 = 9289;
                    if (RunnableC1108.f4040) {
                        iM6981 = (i4 - C2105.m6981("᩶ᩴ")) * (-85);
                        i = ((iM6981 ^ i3) * (-11155)) ^ 341070859;
                        i2 = 1475883426;
                    } else {
                        iM6981 = C0630.m2566("֡ۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-18451)) ^ (-42817044);
                        i2 = 260537477;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -238782289:
                case 2015255958:
                    if (C3245.m9925() == 0) {
                        iM6981 = (C0630.m2566("ۨۧ") + i3) * (-75);
                        i = ((iM6981 ^ i4) * (-30185)) ^ 573835629;
                        i2 = 345071673;
                    } else {
                        iM6981 = C0630.m2566("֡ۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-18451)) ^ (-42817044);
                        i2 = 260537477;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 660295633:
                case 1437896682:
                    C1128.m3849(this, iM6982);
                    sArr3 = f14844;
                    i7 = 60;
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("ۨۧ") + i3) * (-75);
                        i = ((iM6981 ^ i4) * (-30185)) ^ 573835629;
                        i2 = 345071673;
                    } else {
                        iM6981 = (C0630.m2566("ܿ֫") + i3) * 101;
                        i = ((iM6981 ^ i4) * 23675) ^ 77327081;
                        i2 = 1545126615;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 926735736:
                case 1476284226:
                    i8 = s * s;
                    i9 = 86285521;
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("᩹֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-15095)) ^ (-419450463);
                        i2 = 1473903916;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܰۘ")) * 53;
                        i = ((iM6981 ^ i4) * 4875) ^ 751456427;
                        i2 = 1317575297;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1202430271:
                case 1301457289:
                    sArr2 = f14844;
                    i12 = 57;
                    i13 = 3;
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("֡ۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-18451)) ^ (-42817044);
                        i2 = 260537477;
                    } else {
                        iM6981 = C0630.m2566("᩵۬") ^ i3;
                        i = ((iM6981 ^ i4) * (-32511)) ^ (-981564329);
                        i2 = 1314225632;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1207259664:
                case 2107816322:
                    RunnableC1108.m3790();
                    if (C0237.f1507 == 0) {
                        iM6981 = C0630.m2566("֫ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 3887) ^ (-1323537356);
                        i2 = 1495384135;
                    } else {
                        iM6981 = C0630.m2566("᩹֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-15095)) ^ (-419450463);
                        i2 = 1473903916;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i16 = s + s2;
                    if ((i16 * i16) - i10 > 0) {
                        iM6981 = (C0630.m2566("ۘۨ") ^ i4) * (-79);
                        i = ((iM6981 ^ i3) * 20023) ^ 2042264575;
                        i2 = 1697615424;
                    } else {
                        iM6981 = C0630.m2566("ۗܳ") ^ i3;
                        i = ((iM6981 ^ i4) * (-16131)) ^ 945716120;
                        i2 = 2116681890;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x029a A[PHI: r3 r12 r13
      0x029a: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:71:0x0298, B:67:0x027d, B:59:0x023f, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r12v5 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v6 short[]) binds: [B:71:0x0298, B:67:0x027d, B:59:0x023f, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v6 int) binds: [B:71:0x0298, B:67:0x027d, B:59:0x023f, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02c8 A[PHI: r2 r9 r10 r11 r18
      0x02c8: PHI (r2v5 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v2 boolean), (r2v6 boolean) binds: [B:75:0x02c6, B:63:0x025f, B:51:0x01e5, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r9v5 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v6 short[]) binds: [B:75:0x02c6, B:63:0x025f, B:51:0x01e5, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v6 int) binds: [B:75:0x02c6, B:63:0x025f, B:51:0x01e5, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v6 int) binds: [B:75:0x02c6, B:63:0x025f, B:51:0x01e5, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r18v5 int) = (r18v3 int), (r18v3 int), (r18v4 int), (r18v3 int) binds: [B:75:0x02c6, B:63:0x025f, B:51:0x01e5, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        if (l.C3911.m11924() > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (l.C21923.f70183 == 0) goto L7;
     */
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3270(AbstractActivityC3346 abstractActivityC3346, C17222 c17222, boolean z) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
        int i4 = ServiceConnectionC3453.f10921;
        int i5 = ViewOnClickListenerC1958.f6529;
        int iM6981 = C2105.m6981("۫ۘ") ^ i4;
        int i6 = ((iM6981 ^ i5) * (-27277)) ^ 1069728937;
        String strM1958 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM6981 ^ 274748508;
        boolean z2 = false;
        int iM2568 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1514837161;
        int i14 = 0;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * 971) >> 31));
            switch (i13) {
                case -2125638832:
                case 288918563:
                    i9 = 1783;
                    iM2566 = (C2105.m6981("ۘۜ") + i5) * (-107);
                    i = ((iM2566 ^ i4) * 25087) ^ 596693965;
                    i2 = -2007879826;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -2044446955:
                case 1390381147:
                    i14 = (s * s) + 121749156;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C0630.m2566("۠ۡ") + i4) * 23;
                        i = ((iM2566 ^ i5) * 5563) ^ 96528393;
                        i2 = 374193018;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۛ") ^ i4) * (-9);
                        i = ((iM2566 ^ i5) * (-5063)) ^ (-1075313138);
                        i2 = 405185554;
                    }
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -1730544569:
                case 2134880984:
                    C7106.m19120();
                    break;
                case -1593929712:
                case 1286315830:
                    if (z) {
                        iM2567 = C0630.m2566("ܶܶ") ^ i5;
                        i = ((iM2567 ^ i4) * 26739) ^ (-1441640479);
                        i3 = 1227753014;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = C2105.m6981("ܳ᩺") ^ i4;
                    i = ((iM2566 ^ i5) * 4007) ^ 142140053;
                    i2 = 1090935950;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -1562507239:
                case -1436061187:
                    if (C3537.m10745(c17222)) {
                        iM2567 = C0630.m2566("ܽ۟") ^ i4;
                        i = ((iM2567 ^ i5) * (-10003)) ^ 204387719;
                        i3 = 1275691554;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = C2105.m6981("ܳ᩺") ^ i4;
                    i = ((iM2566 ^ i5) * 4007) ^ 142140053;
                    i2 = 1090935950;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -1391003412:
                case -1376694183:
                    break;
                case -1287494329:
                case 1314097563:
                    if ((s * 22068) - i14 <= 0) {
                        iM2566 = C0630.m2566("ۡ۬") ^ i5;
                        i = ((iM2566 ^ i4) * 23001) ^ 45169313;
                        i2 = 63049789;
                    } else {
                        iM2566 = C0630.m2566("ۘ᩹") ^ i4;
                        i = ((iM2566 ^ i5) * (-19079)) ^ (-1742500155);
                        i2 = 1840924801;
                    }
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -1211111379:
                case 1559035193:
                    if (this.f14848) {
                        int iM6982 = C2105.m6981("ۡ֡") ^ i5;
                        i7 = iM6982 ^ (-29094102);
                        i6 = ((iM6982 ^ i4) * (-6717)) ^ 1469233873;
                        abstractActivityC3347 = abstractActivityC3346;
                    } else {
                        iM2566 = C2105.m6981("ܳ᩺") ^ i4;
                        i = ((iM2566 ^ i5) * 4007) ^ 142140053;
                        i2 = 1090935950;
                        i7 = iM2566 ^ i2;
                        abstractActivityC3347 = abstractActivityC3346;
                        i6 = i;
                    }
                    break;
                case -1186407409:
                case 1416795982:
                    iM2568 = C0630.m2566(RunnableC0588.m2436(sArr, i10, i11, i9));
                    i8 = 2101259903;
                    if (C2105.f7037 != 0) {
                        iM2567 = (C2105.m6981("ۧ᩵") ^ i5) * (-49);
                        i = ((iM2567 ^ i4) * (-10107)) ^ 1188612237;
                        i3 = -271630009;
                    } else {
                        iM2567 = (C2105.m6981("ۙۛ") ^ i5) * 37;
                        i = ((iM2567 ^ i4) * 28181) ^ (-1696794902);
                        i3 = -254619523;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case -1092413739:
                case -767735274:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (C0630.m2566("۠ۡ") + i4) * 23;
                        i = ((iM2566 ^ i5) * 5563) ^ 96528393;
                        i2 = 374193018;
                    } else {
                        iM2566 = C2105.m6981("ۤۚ") ^ i5;
                        i = ((iM2566 ^ i4) * (-11239)) ^ (-439760879);
                        i2 = 1237806717;
                    }
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -1006223860:
                case 1474390049:
                    i9 = 45757;
                    iM2566 = (C2105.m6981("ۘۜ") + i5) * (-107);
                    i = ((iM2566 ^ i4) * 25087) ^ 596693965;
                    i2 = -2007879826;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -989707643:
                case 487408833:
                    z2 = true;
                    sArr = f14844;
                    i10 = 1;
                    i11 = 3;
                    if (!C0798.f2919) {
                        iM2567 = (C0630.m2566("۟֫") + i4) * (-23);
                        i = ((iM2567 ^ i5) * 20313) ^ (-455144622);
                        i3 = -505947598;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = (C0630.m2566("۠ۡ") + i4) * 23;
                    i = ((iM2566 ^ i5) * 5563) ^ 96528393;
                    i2 = 374193018;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -818700600:
                case -353019672:
                    s = f14844[0];
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("ۘۡ") ^ i5) * (-73);
                        i = ((iM2566 ^ i4) * (-15093)) ^ (-1056219823);
                        i2 = 1919392352;
                    } else {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i4) * (-103);
                        i = ((iM2566 ^ i5) * (-1927)) ^ (-689934409);
                        i2 = -95334163;
                    }
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -638349708:
                case 996505203:
                    strM1958 = C0422.m1958(abstractActivityC3347, iM2568 ^ i8);
                    sArr2 = f14844;
                    i12 = 4;
                    if (!C0630.m2564()) {
                        iM2567 = C0630.m2566("᩻᩶") ^ i5;
                        i = ((iM2567 ^ i4) * (-25975)) ^ (-29450294);
                        i3 = -1181122322;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = C0630.m2566("ܿᩳ") ^ i4;
                    i = ((iM2566 ^ i5) * (-25713)) ^ 1501786117;
                    i2 = -971801749;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -306615422:
                case 647495860:
                    DialogInterfaceOnClickListenerC10816.m27035(abstractActivityC3347, C3019.m9250(sArr2, i12, 17, i9), strM1958, z2);
                    iM2566 = C2105.m6981("ܳ᩺") ^ i4;
                    i = ((iM2566 ^ i5) * 4007) ^ 142140053;
                    i2 = 1090935950;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case -207158602:
                case -57181087:
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("۠ۡ") + i4) * 23;
                        i = ((iM2566 ^ i5) * 5563) ^ 96528393;
                        i2 = 374193018;
                    } else {
                        iM2566 = (C0630.m2566("ܺ֡") + i5) * 39;
                        i = ((iM2566 ^ i4) * (-22443)) ^ (-922888590);
                        i2 = -524419221;
                    }
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case 124712705:
                case 825032633:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("ܿᩳ") ^ i4;
                        i = ((iM2566 ^ i5) * (-25713)) ^ 1501786117;
                        i2 = -971801749;
                    } else {
                        iM2566 = C0630.m2566("ܺ۟") ^ i4;
                        i = ((iM2566 ^ i5) * (-2921)) ^ 117181951;
                        i2 = -1318028671;
                    }
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case 183737264:
                case 453626398:
                    C3683.m11222();
                    if (C2167.f7158 < 0) {
                        iM2567 = (C0630.m2566("۠۟") + i4) * (-49);
                        i = ((iM2567 ^ i5) * (-14847)) ^ 557113193;
                        i3 = -614442215;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = C0630.m2566("ܿᩳ") ^ i4;
                    i = ((iM2566 ^ i5) * (-25713)) ^ 1501786117;
                    i2 = -971801749;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case 501487164:
                case 2085651428:
                    if (C22628.m50615() != 0) {
                        iM2566 = C0630.m2566("ܿᩳ") ^ i4;
                        i = ((iM2566 ^ i5) * (-25713)) ^ 1501786117;
                        i2 = -971801749;
                    } else {
                        iM2566 = (C2105.m6981("ۡۨ") ^ i5) * 49;
                        i = ((iM2566 ^ i4) * (-111)) ^ 517014080;
                        i2 = -264461320;
                    }
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case 1470618725:
                case 1569155348:
                    if (C1711.m5736() <= 0) {
                        iM2566 = C0630.m2566("ܿᩳ") ^ i4;
                        i = ((iM2566 ^ i5) * (-25713)) ^ 1501786117;
                        i2 = -971801749;
                    } else {
                        iM2566 = C2105.m6981("ۙ֫") ^ i4;
                        i = ((iM2566 ^ i5) * 30165) ^ (-2020725926);
                        i2 = 1377057367;
                    }
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                case 1545038429:
                case 1619349732:
                    C1916.m6308();
                    C3911.m11924();
                    break;
                case 1632530709:
                case 1938238770:
                    C2520.m8026();
                    iM2566 = (C0630.m2566("۠ۡ") + i4) * 23;
                    i = ((iM2566 ^ i5) * 5563) ^ 96528393;
                    i2 = 374193018;
                    i7 = iM2566 ^ i2;
                    abstractActivityC3347 = abstractActivityC3346;
                    i6 = i;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    public C4669() {
        ArrayList arrayList = null;
        int i = -1093862008;
        int i2 = C4075.f12947;
        int i3 = C2958.f9394;
        int iM6981 = C2105.m6981("֡᩺") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-3451)) ^ (-188602742);
        int i5 = -801293824;
        while (true) {
            i = ((((i ^ i2) * (-15337)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2138723912:
                case 2122553512:
                    C2105.m6982();
                    C4159.m12565();
                    throw new RuntimeException();
                case -1626308722:
                case -389940:
                    if (C3432.f10845 < 0) {
                        iM6981 = C2105.m6981("ۧۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7031) ^ (-179861217);
                        i5 = 1213291195;
                    } else {
                        iM6981 = (C0630.m2566("֨ۘ") ^ i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    }
                    break;
                case -1457429385:
                case 1734982421:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ܰ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10465) ^ 2125514757;
                        i5 = 1503245295;
                    } else {
                        iM6981 = C0630.m2566("ۖ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12831) ^ 674360841;
                        i5 = -848153271;
                    }
                    break;
                case -1396993997:
                case -446771790:
                    C0483.m2121();
                    if (C0050.f910 < 0) {
                        iM6981 = C2105.m6981("᩺ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-907)) ^ 226890361;
                        i5 = 390616566;
                    } else {
                        iM6981 = (C0630.m2566("֨ۘ") ^ i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    }
                    break;
                case -1208960969:
                case 1160366798:
                    this.f14846 = arrayList;
                    return;
                case -1172258577:
                case 894743851:
                    if (C1773.m5908() <= 0) {
                        iM6981 = (C0630.m2566("֨ۘ") ^ i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩶۟")) * 87;
                        i4 = ((iM6981 ^ i3) * 26893) ^ (-1908527404);
                        i5 = 725514236;
                    }
                    break;
                case -1116513025:
                case 1358149732:
                    C3911.m11924();
                    if (!C4159.f13567) {
                        iM6981 = (C0630.m2566("֨ۘ") ^ i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM6981 = (C0630.m2566("ܿۗ") + i2) * 5;
                        i4 = ((iM6981 ^ i3) * (-28303)) ^ 69046023;
                        i5 = 693008168;
                    }
                    break;
                case -1099710653:
                case 264302824:
                    if (C0964.f3626 != 0) {
                        iM6981 = (C0630.m2566("֨ۘ") ^ i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM6981 = C0630.m2566("ۢᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27961) ^ 1255715404;
                        i5 = 1543721265;
                    }
                    break;
                case -1021520370:
                case 1702511003:
                    if (C4616.m13552() != 0) {
                        iM6981 = (C0630.m2566("֨ۘ") ^ i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM6981 = C2105.m6981("ۛ᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-671)) ^ (-1767190581);
                        i5 = 253883778;
                    }
                    break;
                case -1011637945:
                case 2129101445:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("᩸֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16137) ^ 212216290;
                        i5 = 1262812646;
                    } else {
                        iM6981 = (C0630.m2566("ܿۗ") + i2) * 5;
                        i4 = ((iM6981 ^ i3) * (-28303)) ^ 69046023;
                        i5 = 693008168;
                    }
                    break;
                case -1010831894:
                case 1402503802:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("ܰ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10465) ^ 2125514757;
                        i5 = 1503245295;
                    } else {
                        iM6981 = (C0630.m2566("ۙ۫") + i3) * (-89);
                        i4 = ((iM6981 ^ i2) * 27481) ^ 1397070827;
                        i5 = -205424588;
                    }
                    break;
                case -617524310:
                case 303129000:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("᩺ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-907)) ^ 226890361;
                        i5 = 390616566;
                    } else {
                        iM6981 = C0630.m2566("ۤۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32245) ^ (-1524865561);
                        i5 = -1497725799;
                    }
                    break;
                case -100417041:
                case 1944003761:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("֨ۘ") ^ i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۛܺ")) * 93;
                        i4 = ((iM6981 ^ i3) * (-3599)) ^ (-78398642);
                        i5 = -2129049606;
                    }
                    break;
                case 69063363:
                case 165470447:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("ۧۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7031) ^ (-179861217);
                        i5 = 1213291195;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9017)) ^ (-831780107);
                        i5 = 1263635241;
                    }
                    break;
                case 79841638:
                case 980058473:
                    C0630.m2564();
                    RunnableC0588.m2441();
                    iM6981 = (C0630.m2566("ܿۗ") + i2) * 5;
                    i4 = ((iM6981 ^ i3) * (-28303)) ^ 69046023;
                    i5 = 693008168;
                    break;
                default:
                    arrayList = new ArrayList();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۧۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7031) ^ (-179861217);
                        i5 = 1213291195;
                    } else {
                        iM6981 = (C2105.m6981("֫᩺") + i2) * (-121);
                        i4 = ((iM6981 ^ i3) * 31831) ^ (-1576683288);
                        i5 = 1470386971;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76969;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bf A[PHI: r5 r6 r7 r9
      0x00bf: PHI (r5v5 java.lang.String) = (r5v1 java.lang.String), (r5v1 java.lang.String), (r5v2 java.lang.String), (r5v1 java.lang.String) binds: [B:90:0x00bf, B:26:0x00bd, B:22:0x009d, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r6v6 short[]) = (r6v2 short[]), (r6v3 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:90:0x00bf, B:26:0x00bd, B:22:0x009d, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r7v6 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:90:0x00bf, B:26:0x00bd, B:22:0x009d, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r9v6 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:90:0x00bf, B:26:0x00bd, B:22:0x009d, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0299 A[PHI: r1 r8 r11 r24
      0x0299: PHI (r1v37 java.lang.String) = (r1v5 java.lang.String), (r1v36 java.lang.String), (r1v1 java.lang.String), (r1v1 java.lang.String) binds: [B:70:0x0297, B:34:0x011b, B:15:0x0071, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r8v6 short) = (r8v3 short), (r8v1 short), (r8v1 short), (r8v1 short) binds: [B:70:0x0297, B:34:0x011b, B:15:0x0071, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r11v6 short) = (r11v2 short), (r11v1 short), (r11v1 short), (r11v1 short) binds: [B:70:0x0297, B:34:0x011b, B:15:0x0071, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r24v8 int) = (r24v4 int), (r24v3 int), (r24v3 int), (r24v3 int) binds: [B:70:0x0297, B:34:0x011b, B:15:0x0071, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        String strM28023;
        String strM12251 = null;
        String str = null;
        String[] strArr = null;
        int iM2568 = 0;
        String strM6573 = null;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1270673904;
        int i10 = C0050.f910;
        int i11 = C3245.f10203;
        int iM6981 = (i10 - C2105.m6981("ܽ֡")) * 63;
        int i12 = ((iM6981 ^ i11) * 30217) ^ (-1494410904);
        int i13 = iM6981 ^ (-420156456);
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        AbstractC15440 abstractC15440 = null;
        int i17 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-17773)) >> 31));
            switch (i9) {
                case -1997187702:
                case -1935031557:
                    strM12251 = strM12251;
                    i16 = s * 2;
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("ۚۖ") ^ i11;
                        i = ((iM2566 ^ i10) * 11327) ^ 1562397221;
                        i2 = 733687414;
                    } else {
                        iM2566 = (C0630.m2566("᩸֡") ^ i10) * (-99);
                        i = ((iM2566 ^ i11) * 5227) ^ (-619697379);
                        i2 = 525407212;
                    }
                    i5 = iM2566 ^ i2;
                    String str2 = strM12251;
                    i13 = i5;
                    i12 = i;
                    strM12251 = str2;
                    break;
                case -1982838541:
                case 58325990:
                    i6 = 43347;
                    iM2566 = (C2105.m6981("֨۬") ^ i11) * 71;
                    i = ((iM2566 ^ i10) * 9753) ^ 219627287;
                    i2 = -272199166;
                    i5 = iM2566 ^ i2;
                    String str3 = strM12251;
                    i13 = i5;
                    i12 = i;
                    strM12251 = str3;
                    break;
                case -1896260279:
                case -1122472003:
                    strM28023 = C11340.m28023(abstractC15440);
                    str = strM28023;
                    iM2567 = C2105.m6981("ᩳ۫") ^ i11;
                    i3 = ((iM2567 ^ i10) * (-19751)) ^ 982845824;
                    i4 = -19238347;
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    break;
                case -1760815070:
                case 2122931084:
                    C2958.m9034();
                    return null;
                case -1751459162:
                case 163753250:
                    strM12251 = strM12251;
                    i17 = i16 + 1;
                    s2 = 1;
                    if (C0422.f1886 > 0) {
                        iM2566 = C0630.m2566("۫ۢ") ^ i10;
                        i = ((iM2566 ^ i11) * 15771) ^ 1296473715;
                        i2 = -1501169715;
                        i5 = iM2566 ^ i2;
                        String str4 = strM12251;
                        i13 = i5;
                        i12 = i;
                        strM12251 = str4;
                    } else {
                        strM12251 = strM12251;
                        iM2567 = (i10 - C2105.m6981("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2567 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -1450902554:
                case -1136471687:
                    strM12251 = strM12251;
                    s = sArr2[c];
                    if (C4117.f13076 > 0) {
                        iM2566 = C0630.m2566("ܳ۠") ^ i11;
                        i = ((iM2566 ^ i10) * 13491) ^ (-1590172069);
                        i2 = -1362068322;
                        i5 = iM2566 ^ i2;
                        String str5 = strM12251;
                        i13 = i5;
                        i12 = i;
                        strM12251 = str5;
                    } else {
                        strM12251 = strM12251;
                        iM2567 = (i10 - C2105.m6981("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2567 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -978904456:
                case 1743775288:
                    strArr = new String[]{str, strM12251};
                    if (C7811.f24123 < 0) {
                        iM2567 = (C2105.m6981("᩵ۘ") ^ i11) * (-27);
                        i3 = ((iM2567 ^ i10) * 13775) ^ 1100055035;
                        i4 = -1253196522;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                    } else {
                        strM12251 = strM12251;
                        iM2566 = (C0630.m2566("᩸֡") ^ i10) * (-99);
                        i = ((iM2566 ^ i11) * 5227) ^ (-619697379);
                        i2 = 525407212;
                        i5 = iM2566 ^ i2;
                        String str6 = strM12251;
                        i13 = i5;
                        i12 = i;
                        strM12251 = str6;
                    }
                    break;
                case -907604744:
                case 1564450210:
                    strM28023 = C0630.m2575(f14844, 22, 4, i6);
                    str = strM28023;
                    iM2567 = C2105.m6981("ᩳ۫") ^ i11;
                    i3 = ((iM2567 ^ i10) * (-19751)) ^ 982845824;
                    i4 = -19238347;
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    break;
                case -895651423:
                case 1417330768:
                    strM12251 = strM12251;
                    sArr2 = f14844;
                    c = 21;
                    if (C0483.f2088 >= 0) {
                        iM2566 = (C2105.m6981("۠ۘ") + i10) * (-39);
                        i = ((iM2566 ^ i11) * 2819) ^ (-1598663219);
                        i2 = -133828175;
                    } else {
                        iM2566 = (C0630.m2566("֨᩸") + i10) * 119;
                        i = ((iM2566 ^ i11) * 15337) ^ (-1482817806);
                        i2 = -660957589;
                    }
                    i5 = iM2566 ^ i2;
                    String str7 = strM12251;
                    i13 = i5;
                    i12 = i;
                    strM12251 = str7;
                    break;
                case -864039770:
                case -696202608:
                    if (C1005.f3721) {
                        iM2567 = C2105.m6981("ܳᩳ") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-2645)) ^ (-1998780113);
                        i4 = -1250575894;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2567 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                    }
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    break;
                case -816011433:
                case 325494522:
                    strM6573 = AbstractC2021.m6573(sArr3, i14, i15, i6);
                    if (C2272.m7503()) {
                        iM2567 = C2105.m6981("֨ܿ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 1797) ^ 2114300082;
                        i4 = -301587879;
                    } else {
                        iM2567 = C0630.m2566("ۨ֨") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-24405)) ^ 1944113614;
                        i4 = -388593939;
                    }
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    break;
                case -593489787:
                case 876615878:
                    sArr = f14844;
                    i7 = 26;
                    i8 = 3;
                    if (C3019.f9544 < 0) {
                        iM2567 = C0630.m2566("᩵ۨ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 1231) ^ 2122139554;
                        i4 = 44812228;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                    } else {
                        strM12251 = strM12251;
                        iM2566 = (C2105.m6981("۠ۘ") + i10) * (-39);
                        i = ((iM2566 ^ i11) * 2819) ^ (-1598663219);
                        i2 = -133828175;
                        i5 = iM2566 ^ i2;
                        String str8 = strM12251;
                        i13 = i5;
                        i12 = i;
                        strM12251 = str8;
                    }
                    break;
                case -396738911:
                case 328402590:
                    sArr3 = f14844;
                    i14 = 29;
                    i15 = 3;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2567 = C2105.m6981("֨ܿ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 1797) ^ 2114300082;
                        i4 = -301587879;
                    } else {
                        iM2567 = (C2105.m6981("᩵ۢ") + i10) * 99;
                        i3 = ((iM2567 ^ i11) * 15237) ^ 1312590413;
                        i4 = 2051444063;
                    }
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    break;
                case -368890931:
                case 550610111:
                    iM2568 = C0630.m2566(C2126.m7036(sArr, i7, i8, i6));
                    if (AbstractC2021.f6743 > 0) {
                        iM2567 = (i10 - C2105.m6981("ۙ֫")) * (-91);
                        i3 = ((iM2567 ^ i11) * 14029) ^ 1123943861;
                        i4 = 1851633812;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                    } else {
                        strM12251 = strM12251;
                        iM2566 = (C2105.m6981("۠ۘ") + i10) * (-39);
                        i = ((iM2566 ^ i11) * 2819) ^ (-1598663219);
                        i2 = -133828175;
                        i5 = iM2566 ^ i2;
                        String str9 = strM12251;
                        i13 = i5;
                        i12 = i;
                        strM12251 = str9;
                    }
                    break;
                case -331718074:
                case 1612160054:
                    AbstractC15440 abstractC15441 = this.f14849;
                    if (abstractC15441 == null) {
                        int iM2569 = (C0630.m2566("ܽۜ") + i10) * 59;
                        i12 = ((iM2569 ^ i11) * 29423) ^ 57447072;
                        i13 = iM2569 ^ 1736218220;
                        abstractC15440 = abstractC15441;
                    } else {
                        int iM25610 = C0630.m2566("۟ۘ") ^ i10;
                        strM12251 = strM12251;
                        i = ((iM25610 ^ i11) * 26593) ^ (-1874887346);
                        i5 = iM25610 ^ 1102948655;
                        abstractC15440 = abstractC15441;
                        String str10 = strM12251;
                        i13 = i5;
                        i12 = i;
                        strM12251 = str10;
                    }
                    break;
                case -272012510:
                case 92790986:
                    RunnableC0588.m2441();
                    C1294.m4372();
                    iM2567 = C2105.m6981("ܳᩳ") ^ i11;
                    i3 = ((iM2567 ^ i10) * (-2645)) ^ (-1998780113);
                    i4 = -1250575894;
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    break;
                case 444120670:
                case 2058549114:
                    if (C21923.f70183 == 0) {
                        iM2567 = (i10 - C2105.m6981("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2567 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                    } else {
                        iM2567 = C2105.m6981("֨ܿ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 1797) ^ 2114300082;
                        i4 = -301587879;
                    }
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    break;
                case 1094994765:
                case 1425004278:
                    C1773.m5908();
                    if (C0237.f1507 == 0) {
                        strM12251 = strM12251;
                        iM2566 = (C2105.m6981("۠ۘ") + i10) * (-39);
                        i = ((iM2566 ^ i11) * 2819) ^ (-1598663219);
                        i2 = -133828175;
                        i5 = iM2566 ^ i2;
                        String str11 = strM12251;
                        i13 = i5;
                        i12 = i;
                        strM12251 = str11;
                    } else {
                        iM2567 = C2105.m6981("֨ܿ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 1797) ^ 2114300082;
                        i4 = -301587879;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                    }
                    break;
                case 1379121421:
                case 1606533065:
                    strM12251 = C4075.m12251(2121414856 ^ iM2568);
                    if (C3432.f10845 >= 0) {
                        iM2567 = (i10 - C2105.m6981("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2567 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                    } else {
                        iM2567 = (C0630.m2566("ۢ۬") + i10) * (-105);
                        i3 = ((iM2567 ^ i11) * (-21557)) ^ 1750681209;
                        i4 = -1706312805;
                    }
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    break;
                case 1512060881:
                case 1753570206:
                    strM12251 = strM12251;
                    int i18 = s + s2;
                    if ((i18 * i18) - i17 < 0) {
                        iM2566 = (C0630.m2566("ۤܶ") ^ i11) * (-79);
                        i = ((iM2566 ^ i10) * 2843) ^ (-247018210);
                        i2 = -716160407;
                    } else {
                        iM2566 = C0630.m2566("ۜۨ") ^ i10;
                        i = ((iM2566 ^ i11) * 20361) ^ 1608373900;
                        i2 = -1991893969;
                    }
                    i5 = iM2566 ^ i2;
                    String str12 = strM12251;
                    i13 = i5;
                    i12 = i;
                    strM12251 = str12;
                    break;
                case 1932976323:
                case 1977866984:
                    i6 = 10968;
                    iM2566 = (C2105.m6981("֨۬") ^ i11) * 71;
                    i = ((iM2566 ^ i10) * 9753) ^ 219627287;
                    i2 = -272199166;
                    i5 = iM2566 ^ i2;
                    String str13 = strM12251;
                    i13 = i5;
                    i12 = i;
                    strM12251 = str13;
                    break;
                default:
                    return C3245.m9924(C0630.m2566(strM6573) ^ 2097946623, strArr);
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440 = null;
        int i = -1482016148;
        int i2 = C3683.f11629;
        int i3 = C11340.f33930;
        int iM2566 = C0630.m2566("ᩳۘ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-6997)) ^ (-1151353461);
        int i5 = 1800947875;
        while (true) {
            i = ((((i ^ i3) * (-13105)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2004473632:
                case 570187976:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("ۡܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    } else {
                        iM2566 = C0630.m2566("ۗ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 17069) ^ 1619332862;
                        i5 = 797674810;
                    }
                    break;
                case -1875255460:
                case -1612926069:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ۡܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    } else {
                        iM2566 = (i2 - C0630.m2566("֡᩷")) * (-71);
                        i4 = ((iM2566 ^ i3) * 15509) ^ (-571612520);
                        i5 = 336661015;
                    }
                    break;
                case -1853781426:
                case -956190245:
                    C3432.m10477();
                    if (C2958.f9394 < 0) {
                        iM2566 = (C2105.m6981("ܶۡ") ^ i3) * (-127);
                        i4 = ((iM2566 ^ i2) * (-18209)) ^ (-1673197792);
                        i5 = -1643746062;
                    } else {
                        iM2566 = C2105.m6981("ۡܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    }
                    break;
                case -1473274568:
                case 996620057:
                    C0422.m1956();
                    break;
                case -1153748319:
                case -23401881:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("ܺܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32375)) ^ 28618673;
                        i5 = 2080443981;
                    } else {
                        iM2566 = C2105.m6981("ۡܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    }
                    break;
                case -1063823595:
                case 403892246:
                    C1005.m3501();
                    C11340.m28031();
                    break;
                case -946108864:
                case 492305407:
                    abstractC15440 = this.f14850;
                    if (abstractC15440 != null) {
                        iM2566 = (i3 - C0630.m2566("᩻۠")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i2) * 4449) ^ (-1550134510);
                        i5 = -1769700909;
                    } else {
                        iM2566 = C0630.m2566("ۘܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1099)) ^ 721424698;
                        i5 = 2080727386;
                    }
                    break;
                case -728880946:
                case 1197495252:
                    if (C0382.f1805) {
                        iM2566 = (C2105.m6981("ۤ᩶") ^ i3) * (-39);
                        i4 = ((iM2566 ^ i2) * (-15153)) ^ 1188912539;
                        i5 = 373425503;
                    } else {
                        iM2566 = (C2105.m6981("᩷᩺") ^ i2) * 9;
                        i4 = ((iM2566 ^ i3) * (-16043)) ^ 1540323263;
                        i5 = -313597156;
                    }
                    break;
                case -624292772:
                case 1356849050:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("֨ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26505) ^ 1009290261;
                        i5 = -1931155719;
                    } else {
                        iM2566 = C2105.m6981("֨ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 9277) ^ (-1341285848);
                        i5 = 537469160;
                    }
                    break;
                case -583773524:
                case 1784977738:
                    AbstractC2021.m6569(abstractC15440);
                    iM2566 = C0630.m2566("ۘܶ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-1099)) ^ 721424698;
                    i5 = 2080727386;
                    break;
                case -550239274:
                case 789548809:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("֨ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26505) ^ 1009290261;
                        i5 = -1931155719;
                    } else {
                        iM2566 = (C0630.m2566("ۙۧ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-32537)) ^ 1545917678;
                        i5 = -612982389;
                    }
                    break;
                case -73305172:
                case 609608013:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("ܶۡ") ^ i3) * (-127);
                        i4 = ((iM2566 ^ i2) * (-18209)) ^ (-1673197792);
                        i5 = -1643746062;
                    } else {
                        iM2566 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 9951) ^ 753636451;
                        i5 = -94887;
                    }
                    break;
                case 159869370:
                case 192518059:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("ۤ۫") ^ i2) * (-123);
                        i4 = ((iM2566 ^ i3) * 28579) ^ (-1918656033);
                        i5 = 1142255561;
                    } else {
                        iM2566 = C0630.m2566("ۗܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18491) ^ (-1318254425);
                        i5 = 733157634;
                    }
                    break;
                case 212984887:
                case 1978131554:
                    if (!C1504.m5179()) {
                        iM2566 = C2105.m6981("ۡܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    } else {
                        iM2566 = (C2105.m6981("ۤ۫") ^ i2) * (-123);
                        i4 = ((iM2566 ^ i3) * 28579) ^ (-1918656033);
                        i5 = 1142255561;
                    }
                    break;
                case 247258990:
                case 2106581625:
                    if (C3537.m10745(c17222)) {
                        iM2566 = C0630.m2566("ۘܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1099)) ^ 721424698;
                        i5 = 2080727386;
                    } else {
                        iM2566 = C0630.m2566("ۖ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-233)) ^ (-1734855785);
                        i5 = 857513316;
                    }
                    break;
                case 550271269:
                case 1788014723:
                    C3663.m11168();
                    C1504.m5179();
                    iM2566 = C2105.m6981("ۡܺ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 4965) ^ 1731666763;
                    i5 = -325716606;
                    break;
                case 981596520:
                case 1594959119:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("֨ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26505) ^ 1009290261;
                        i5 = -1931155719;
                    } else {
                        iM2566 = C2105.m6981("ܿۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12857) ^ (-2058032888);
                        i5 = -675269525;
                    }
                    break;
                case 1489925975:
                case 1558975385:
                    if (C0050.f910 < 0) {
                        iM2566 = (C2105.m6981("᩷᩺") ^ i2) * 9;
                        i4 = ((iM2566 ^ i3) * (-16043)) ^ 1540323263;
                        i5 = -313597156;
                    } else {
                        iM2566 = (C2105.m6981("ܶۡ") ^ i3) * (-127);
                        i4 = ((iM2566 ^ i2) * (-18209)) ^ (-1673197792);
                        i5 = -1643746062;
                    }
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("᩷᩺") ^ i2) * 9;
                        i4 = ((iM2566 ^ i3) * (-16043)) ^ 1540323263;
                        i5 = -313597156;
                    } else {
                        iM2566 = (C2105.m6981("ۙۡ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i2) * (-793)) ^ (-1897090623);
                        i5 = -2021564336;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int iM6983;
        int i5;
        String[] strArr;
        AbstractC13262 abstractC13262;
        short[] sArr;
        int i6;
        C11667 c11667;
        AbstractC13262 abstractC13263;
        int iM6984;
        int i7;
        int i8;
        this = this;
        String[] strArr2 = null;
        C11667 c11668 = null;
        int i9 = 0;
        boolean z = false;
        boolean z2 = false;
        C20192 c20192 = null;
        int i10 = 0;
        AbstractC15440 abstractC15440M1845 = null;
        AbstractC15440 abstractC15440M36491 = null;
        long j = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 284421360;
        int i14 = C0714.f2697;
        int i15 = RunnableC0588.f2309;
        int iM2566 = C0630.m2566("ܶ֡") ^ i14;
        int i16 = ((iM2566 ^ i15) * (-24851)) ^ (-1840883326);
        int i17 = iM2566 ^ 1076793781;
        AbstractC13262 abstractC13262M28557 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i18 = 0;
        int i19 = 0;
        short s2 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean zM4907 = false;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-31107)) >> 31));
            switch (i13) {
                case -2139939796:
                case -551294015:
                    c11668 = c11668;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC13262M28557 = abstractC13262M28557;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    int i24 = i19 + i11;
                    i12 = i24 + i24;
                    s = 4621;
                    if (C2958.f9394 < 0) {
                        iM6981 = (i14 - C0630.m2566("ܿ۠")) * (-65);
                        i = ((iM6981 ^ i15) * (-25409)) ^ (-1284892127);
                        i2 = -1276270329;
                        int i25 = iM6981 ^ i2;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = i25;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    }
                    abstractC13262M28557 = abstractC13262M28557;
                    int iM6985 = (C2105.m6981("۬۟") ^ i15) * (-83);
                    i = ((iM6985 ^ i14) * 2227) ^ (-1221989767);
                    i21 = i21;
                    sArr3 = sArr3;
                    c11668 = c11668;
                    i17 = iM6985 ^ (-28823339);
                    i23 = i23;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case -2055771029:
                case 979878106:
                    C6022.m16847(this.f14849, this.f14850, c11668, c20192);
                    iM6983 = (C0630.m2566("᩷۠") + i14) * 51;
                    i = ((iM6983 ^ i15) * 31017) ^ 1528043442;
                    i5 = 1389402975;
                    i17 = iM6983 ^ i5;
                    i16 = i;
                    break;
                case -2046820952:
                case -670502515:
                    this.f14848 = z2;
                    this.f14845 = strArr2.length;
                    c20192 = new C20192(this);
                    i10 = 0;
                    iM6982 = C0630.m2566("ۨܳ") ^ i14;
                    i3 = ((iM6982 ^ i15) * 24527) ^ 1701245149;
                    i4 = 1214667979;
                    i8 = iM6982 ^ i4;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case -2013105537:
                case 766555278:
                    c11668 = c11668;
                    abstractC13263 = abstractC13262M28557;
                    sArr3 = f14844;
                    i22 = 42;
                    i23 = 9;
                    if (C0964.f3626 == 0) {
                        iM6984 = (C2105.m6981("ܶۗ") + i14) * (-83);
                        i3 = ((iM6984 ^ i15) * 30697) ^ 1093502201;
                        i7 = -1499337290;
                        i8 = iM6984 ^ i7;
                        abstractC13262M28557 = abstractC13263;
                        c11667 = c11668;
                        i17 = i8;
                        i16 = i3;
                        c11668 = c11667;
                    } else {
                        sArr = sArr2;
                        strArr = strArr2;
                        i6 = i21;
                        abstractC13262 = abstractC13263;
                        int iM2567 = (C0630.m2566("۟۠") + i14) * 115;
                        i3 = ((iM2567 ^ i15) * (-11947)) ^ (-301695916);
                        i8 = iM2567 ^ 2116844421;
                        abstractC13262M28557 = abstractC13262;
                        i21 = i6;
                        strArr2 = strArr;
                        sArr2 = sArr;
                        this = this;
                        c11667 = c11668;
                        i17 = i8;
                        i16 = i3;
                        c11668 = c11667;
                    }
                    break;
                case -2001866526:
                case -648387785:
                    RunnableC3474.m10630();
                    C0483.m2121();
                    return null;
                case -1996267724:
                case 1160152495:
                    return C17222.m40520();
                case -1815610721:
                case -699950:
                    if (!C3663.f11553) {
                        c11668 = c11668;
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC13262M28557 = abstractC13262M28557;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        iM6981 = C0630.m2566("᩺᩺") ^ i14;
                        i = ((iM6981 ^ i15) * 13739) ^ 1123455335;
                        i2 = 1972213972;
                        int i26 = iM6981 ^ i2;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = i26;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    } else {
                        c11668 = c11668;
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC13262M28557 = abstractC13262M28557;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        int iM6986 = C2105.m6981("۟ۜ") ^ i14;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = iM6986 ^ (-1796116631);
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = ((iM6986 ^ i15) * 24563) ^ (-1847783289);
                        this = this;
                    }
                    break;
                case -1569793786:
                case 512174082:
                    c11668 = c11668;
                    i9 = 0;
                    z = true;
                    abstractC13263 = abstractC13262M28557;
                    if (abstractC13263 == C15378.m36415()) {
                        iM6984 = C2105.m6981("ۜܰ") ^ i15;
                        i3 = ((iM6984 ^ i14) * (-19075)) ^ 1211809620;
                        i7 = 1706244433;
                    } else {
                        iM6984 = (i14 - C0630.m2566("ۧ֨")) * (-87);
                        i3 = ((iM6984 ^ i15) * 14011) ^ 322146880;
                        i7 = 1112690771;
                    }
                    i8 = iM6984 ^ i7;
                    abstractC13262M28557 = abstractC13263;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case -1466887401:
                case -970351715:
                    c11668 = c11668;
                    if (i10 < strArr2.length) {
                        iM6982 = (C0630.m2566("᩷᩺") + i15) * (-89);
                        i3 = ((iM6982 ^ i14) * 27811) ^ (-1911422628);
                        i4 = -1050352761;
                    } else {
                        iM6982 = C0630.m2566("ܰ᩻") ^ i14;
                        i3 = ((iM6982 ^ i15) * (-26179)) ^ (-998969778);
                        i4 = -882284807;
                    }
                    i8 = iM6982 ^ i4;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case -1405135700:
                case -1218884423:
                    c11668 = c11668;
                    abstractC15440M1845 = C0382.m1845(strArr2[i10], new String[i9]);
                    this.f14849 = abstractC15440M1845;
                    sArr4 = f14844;
                    if (C0630.f2410 > 0) {
                        iM6982 = (i14 - C2105.m6981("ۙ֫")) * (-49);
                        i3 = ((iM6982 ^ i15) * 22991) ^ (-1348601696);
                        i4 = -173973831;
                        i8 = iM6982 ^ i4;
                        c11667 = c11668;
                        i17 = i8;
                        i16 = i3;
                        c11668 = c11667;
                    } else {
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC13262M28557 = abstractC13262M28557;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        iM6981 = C0630.m2566("᩺᩺") ^ i14;
                        i = ((iM6981 ^ i15) * 13739) ^ 1123455335;
                        i2 = 1972213972;
                        int i27 = iM6981 ^ i2;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = i27;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    }
                    break;
                case -986711922:
                case 487601172:
                    c11668 = c11668;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC13262M28557 = abstractC13262M28557;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    i19 = s2 * s2;
                    i11 = 21353641;
                    if (!C1504.f5354) {
                        iM6981 = C2105.m6981("ۗᩴ") ^ i14;
                        i = ((iM6981 ^ i15) * 11901) ^ (-1302855170);
                        i2 = 238872652;
                        int i28 = iM6981 ^ i2;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = i28;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    }
                    abstractC13262M28557 = abstractC13262M28557;
                    int iM6987 = (C2105.m6981("۬۟") ^ i15) * (-83);
                    i = ((iM6987 ^ i14) * 2227) ^ (-1221989767);
                    i21 = i21;
                    sArr3 = sArr3;
                    c11668 = c11668;
                    i17 = iM6987 ^ (-28823339);
                    i23 = i23;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case -832475517:
                case 1431227556:
                    c11668 = c11668;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC13262M28557 = abstractC13262M28557;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    s2 = f14844[32];
                    if (C4616.m13552() != 0) {
                        iM6981 = C0630.m2566("᩺᩺") ^ i14;
                        i = ((iM6981 ^ i15) * 13739) ^ 1123455335;
                        i2 = 1972213972;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۟") ^ i15;
                        i = ((iM6981 ^ i14) * (-10297)) ^ 622608488;
                        i2 = -2065108617;
                    }
                    int i29 = iM6981 ^ i2;
                    abstractC13262M28557 = abstractC13262M28557;
                    sArr3 = sArr3;
                    i21 = i21;
                    i23 = i23;
                    c11668 = c11668;
                    i17 = i29;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case -701763962:
                case 2001959124:
                    C7106.m19117(this.f14846, C11340.m28023(this.f14850));
                    i10++;
                    iM6982 = C0630.m2566("ۨܳ") ^ i14;
                    i3 = ((iM6982 ^ i15) * 24527) ^ 1701245149;
                    i4 = 1214667979;
                    i8 = iM6982 ^ i4;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case -552473287:
                case 290967161:
                    c11668 = c11668;
                    this.f14847 = C19277.m44456(j, strArr2.length);
                    if (zM4907) {
                        iM6982 = (C2105.m6981("ᩴ۟") + i15) * (-121);
                        i3 = ((iM6982 ^ i14) * 11801) ^ 1647168210;
                        i4 = 1348571869;
                    } else {
                        iM6982 = (C2105.m6981("ۡۧ") + i15) * 95;
                        i3 = ((iM6982 ^ i14) * 6871) ^ 1775417168;
                        i4 = 1568912917;
                    }
                    i8 = iM6982 ^ i4;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case -516254833:
                case 709127118:
                    z2 = false;
                    iM6982 = C0630.m2566("ۜ᩹") ^ i15;
                    i3 = ((iM6982 ^ i14) * 1025) ^ (-1171666294);
                    i4 = 470084890;
                    i8 = iM6982 ^ i4;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case -400438669:
                case 448704169:
                    C4159.m12565();
                    if (C0050.f910 >= 0) {
                        iM6983 = (C2105.m6981("᩷ۘ") ^ i15) * (-51);
                        i = ((iM6983 ^ i14) * 6153) ^ (-6450027);
                        i5 = 1510877210;
                        i17 = iM6983 ^ i5;
                        i16 = i;
                    } else {
                        c11668 = c11668;
                        iM6982 = (i14 - C0630.m2566("۟᩻")) * 95;
                        i3 = ((iM6982 ^ i15) * (-16833)) ^ (-1236883931);
                        i4 = 1202463069;
                        i8 = iM6982 ^ i4;
                        c11667 = c11668;
                        i17 = i8;
                        i16 = i3;
                        c11668 = c11667;
                    }
                    break;
                case -356580044:
                case 2035687966:
                    if (!C2204.m7292(C1005.m3496(this.f14849), z).m7314()) {
                        iM6983 = C2105.m6981("֡᩸") ^ i15;
                        i = ((iM6983 ^ i14) * (-15135)) ^ 632238356;
                        i5 = -1549994110;
                        i17 = iM6983 ^ i5;
                        i16 = i;
                    } else {
                        c11668 = c11668;
                        iM6982 = (C2105.m6981("ᩴ۟") + i15) * (-121);
                        i3 = ((iM6982 ^ i14) * 11801) ^ 1647168210;
                        i4 = 1348571869;
                        i8 = iM6982 ^ i4;
                        c11667 = c11668;
                        i17 = i8;
                        i16 = i3;
                        c11668 = c11667;
                    }
                    break;
                case -304381319:
                case 477959107:
                    if (!RunnableC1108.f4040) {
                        c11668 = c11668;
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC13262M28557 = abstractC13262M28557;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        int iM6988 = C2105.m6981("۟ۜ") ^ i14;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = iM6988 ^ (-1796116631);
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = ((iM6988 ^ i15) * 24563) ^ (-1847783289);
                        this = this;
                    } else {
                        iM6983 = (C2105.m6981("᩷ۘ") ^ i15) * (-51);
                        i = ((iM6983 ^ i14) * 6153) ^ (-6450027);
                        i5 = 1510877210;
                        i17 = iM6983 ^ i5;
                        i16 = i;
                    }
                    break;
                case -71185015:
                case 1730417992:
                    if (C3432.f10845 >= 0) {
                        c11668 = c11668;
                        sArr2 = sArr2;
                        i21 = i21;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        int iM6989 = (C2105.m6981("۬۟") ^ i15) * (-83);
                        i = ((iM6989 ^ i14) * 2227) ^ (-1221989767);
                        i21 = i21;
                        sArr3 = sArr3;
                        c11668 = c11668;
                        i17 = iM6989 ^ (-28823339);
                        i23 = i23;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    } else {
                        c11668 = c11668;
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC13262M28557 = abstractC13262M28557;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        int iM69810 = C2105.m6981("۟ۜ") ^ i14;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = iM69810 ^ (-1796116631);
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = ((iM69810 ^ i15) * 24563) ^ (-1847783289);
                        this = this;
                    }
                    break;
                case -62382806:
                case 1892169648:
                    z2 = true;
                    iM6982 = C0630.m2566("ۜ᩹") ^ i15;
                    i3 = ((iM6982 ^ i14) * 1025) ^ (-1171666294);
                    i4 = 470084890;
                    i8 = iM6982 ^ i4;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case 159313036:
                case 855155450:
                    C4263.m12819();
                    C1128.m3851();
                    c11668 = c11668;
                    iM6982 = (i14 - C0630.m2566("۟᩻")) * 95;
                    i3 = ((iM6982 ^ i15) * (-16833)) ^ (-1236883931);
                    i4 = 1202463069;
                    i8 = iM6982 ^ i4;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case 294858200:
                case 2058238608:
                    short[] sArr5 = sArr3;
                    int i30 = i22;
                    int i31 = i23;
                    String[] strArrM11558 = this.m11558(C2105.m6988(sArr5, i30, i31, i18));
                    C11667 c11667M11533 = m11533();
                    abstractC13262M28557 = c11667M11533.m28557();
                    if (C11340.f33930 >= 0) {
                        sArr3 = sArr5;
                        i23 = i31;
                        sArr2 = sArr2;
                        i20 = i20;
                        c11668 = c11667M11533;
                        i22 = i30;
                        strArr2 = strArrM11558;
                        i21 = i21;
                        int iM69811 = (C2105.m6981("۬۟") ^ i15) * (-83);
                        i = ((iM69811 ^ i14) * 2227) ^ (-1221989767);
                        i21 = i21;
                        sArr3 = sArr3;
                        c11668 = c11668;
                        i17 = iM69811 ^ (-28823339);
                        i23 = i23;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    } else {
                        int iM2568 = C0630.m2566("ܰۨ") ^ i15;
                        i16 = ((iM2568 ^ i14) * (-1471)) ^ 1884960654;
                        i17 = iM2568 ^ 999670545;
                        i22 = i30;
                        c11668 = c11667M11533;
                        sArr3 = sArr5;
                        i23 = i31;
                        strArr2 = strArrM11558;
                    }
                    break;
                case 542765663:
                case 1521565498:
                    i18 = 59689;
                    iM6981 = C0630.m2566("ۤۨ") ^ i14;
                    i = ((iM6981 ^ i15) * (-7043)) ^ (-1397766501);
                    i2 = -918269988;
                    int i210 = iM6981 ^ i2;
                    abstractC13262M28557 = abstractC13262M28557;
                    sArr3 = sArr3;
                    i21 = i21;
                    i23 = i23;
                    c11668 = c11668;
                    i17 = i210;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case 597406810:
                case 917908414:
                    c11668 = c11668;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC13262M28557 = abstractC13262M28557;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    zM4907 = C1420.m4907(this, C0050.m948(sArr2, i20, i21, i18));
                    if (C1294.f4556 < 0) {
                        iM6981 = C2105.m6981("᩻ۨ") ^ i15;
                        i = ((iM6981 ^ i14) * (-5349)) ^ (-828978540);
                        i2 = -1270320916;
                        int i211 = iM6981 ^ i2;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = i211;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    } else {
                        int iM69812 = C2105.m6981("۟ۜ") ^ i14;
                        abstractC13262M28557 = abstractC13262M28557;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c11668 = c11668;
                        i17 = iM69812 ^ (-1796116631);
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = ((iM69812 ^ i15) * 24563) ^ (-1847783289);
                        this = this;
                    }
                    break;
                case 776532247:
                case 1293698147:
                    c11668 = c11668;
                    this.f14850 = abstractC15440M36491;
                    this.mo11546(C1005.m3496(this.f14849));
                    j = i10;
                    if (C1711.f5919) {
                        iM6982 = (i14 - C0630.m2566("۟᩻")) * 95;
                        i3 = ((iM6982 ^ i15) * (-16833)) ^ (-1236883931);
                        i4 = 1202463069;
                    } else {
                        iM6982 = C0630.m2566("᩻۬") ^ i14;
                        i3 = ((iM6982 ^ i15) * 27993) ^ 1188713515;
                        i4 = 1365101813;
                    }
                    i8 = iM6982 ^ i4;
                    c11667 = c11668;
                    i17 = i8;
                    i16 = i3;
                    c11668 = c11667;
                    break;
                case 916777340:
                case 1676703338:
                    c11668 = c11668;
                    abstractC15440M36491 = abstractC15440M1845.m36491(C0964.m3396(sArr4, 51, 5, i18));
                    if (C2520.f8000 < 0) {
                        iM6982 = (i15 - C0630.m2566("֡ۢ")) * (-19);
                        i3 = ((iM6982 ^ i14) * 24355) ^ 1168988565;
                        i4 = -1139700447;
                        i8 = iM6982 ^ i4;
                        c11667 = c11668;
                        i17 = i8;
                        i16 = i3;
                        c11668 = c11667;
                    } else {
                        sArr = sArr2;
                        strArr = strArr2;
                        i6 = i21;
                        abstractC13262 = abstractC13262M28557;
                        int iM2569 = (C0630.m2566("۟۠") + i14) * 115;
                        i3 = ((iM2569 ^ i15) * (-11947)) ^ (-301695916);
                        i8 = iM2569 ^ 2116844421;
                        abstractC13262M28557 = abstractC13262;
                        i21 = i6;
                        strArr2 = strArr;
                        sArr2 = sArr;
                        this = this;
                        c11667 = c11668;
                        i17 = i8;
                        i16 = i3;
                        c11668 = c11667;
                    }
                    break;
                case 924469376:
                case 1191938373:
                    strArr = strArr2;
                    c11668 = c11668;
                    int i32 = i22;
                    int i33 = i23;
                    abstractC13262 = abstractC13262M28557;
                    short[] sArr6 = sArr3;
                    sArr = f14844;
                    i6 = 9;
                    if (C1773.f6144 <= 0) {
                        sArr3 = sArr6;
                        i23 = i33;
                        i22 = i32;
                        i20 = 33;
                        int iM25610 = (C0630.m2566("۟۠") + i14) * 115;
                        i3 = ((iM25610 ^ i15) * (-11947)) ^ (-301695916);
                        i8 = iM25610 ^ 2116844421;
                        abstractC13262M28557 = abstractC13262;
                        i21 = i6;
                        strArr2 = strArr;
                        sArr2 = sArr;
                        this = this;
                        c11667 = c11668;
                        i17 = i8;
                        i16 = i3;
                    } else {
                        int iM69813 = (C2105.m6981("֫ۧ") + i14) * 115;
                        i16 = ((iM69813 ^ i15) * 26615) ^ 2119197256;
                        strArr2 = strArr;
                        abstractC13262M28557 = abstractC13262;
                        sArr3 = sArr6;
                        i21 = 9;
                        sArr2 = sArr;
                        i23 = i33;
                        this = this;
                        i22 = i32;
                        i20 = 33;
                        c11667 = c11668;
                        i17 = iM69813 ^ (-834570431);
                    }
                    c11668 = c11667;
                    break;
                case 995979758:
                case 1733451195:
                    this.f14850.mo27929();
                    return C3245.m9928();
                case 1050692221:
                case 1245304220:
                    i18 = 15622;
                    iM6981 = C0630.m2566("ۤۨ") ^ i14;
                    i = ((iM6981 ^ i15) * (-7043)) ^ (-1397766501);
                    i2 = -918269988;
                    int i212 = iM6981 ^ i2;
                    abstractC13262M28557 = abstractC13262M28557;
                    sArr3 = sArr3;
                    i21 = i21;
                    i23 = i23;
                    c11668 = c11668;
                    i17 = i212;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case 1097148426:
                case 1715265515:
                    C6705.m18266(this.f14849, this.f14850, c11668, z, c20192);
                    iM6983 = (C0630.m2566("᩷۠") + i14) * 51;
                    i = ((iM6983 ^ i15) * 31017) ^ 1528043442;
                    i5 = 1389402975;
                    i17 = iM6983 ^ i5;
                    i16 = i;
                    break;
                case 1284745015:
                case 1841860451:
                    c11668 = c11668;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC13262M28557 = abstractC13262M28557;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    int i34 = s2 + s;
                    if ((i34 * i34) - i12 <= 0) {
                        iM6981 = C2105.m6981("۫᩵") ^ i15;
                        i = ((iM6981 ^ i14) * 19435) ^ (-25652563);
                        i2 = -1180500710;
                    } else {
                        iM6981 = (C2105.m6981("ܽۨ") ^ i15) * (-13);
                        i = ((iM6981 ^ i14) * 32187) ^ 1192713834;
                        i2 = 278918673;
                    }
                    int i213 = iM6981 ^ i2;
                    abstractC13262M28557 = abstractC13262M28557;
                    sArr3 = sArr3;
                    i21 = i21;
                    i23 = i23;
                    c11668 = c11668;
                    i17 = i213;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                default:
                    if (C2167.m7150(this)) {
                        iM6983 = C2105.m6981("ۡܿ") ^ i15;
                        i = ((iM6983 ^ i14) * (-18471)) ^ (-280560199);
                        i5 = -22446486;
                    } else {
                        iM6983 = C0630.m2566("᩺ۡ") ^ i14;
                        i = ((iM6983 ^ i15) * (-14253)) ^ (-646906211);
                        i5 = 1483198268;
                    }
                    i17 = iM6983 ^ i5;
                    i16 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        ArrayList arrayList = null;
        int i = 280057959;
        int i2 = C3432.f10845;
        int i3 = C1420.f5096;
        int iM6981 = C2105.m6981("֨ۢ") ^ i3;
        int i4 = ((iM6981 ^ i2) * 9189) ^ (-774307213);
        int i5 = -131908501;
        while (true) {
            i = ((((i ^ i2) * (-16319)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2059622224:
                case 1457213379:
                    C0714.m2805();
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C2105.m6981("ۢۙ") ^ i3) * 55;
                        i4 = ((iM6981 ^ i2) * 25223) ^ (-2109005610);
                        i5 = 1035813207;
                    } else {
                        iM6981 = (C0630.m2566("ۛۗ") + i3) * 77;
                        i4 = ((iM6981 ^ i2) * 427) ^ 134762948;
                        i5 = -1672917913;
                    }
                    break;
                case -1935003406:
                case 1247596560:
                    if (C0382.f1805) {
                        iM6981 = (C0630.m2566("ܽۙ") + i3) * (-87);
                        i4 = ((iM6981 ^ i2) * 15645) ^ 1013944519;
                        i5 = 986681236;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۡܽ")) * 83;
                        i4 = ((iM6981 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    }
                    break;
                case -1861514040:
                case 1625633483:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C0630.m2566("᩶ܺ") ^ i3) * 17;
                        i4 = ((iM6981 ^ i2) * (-13743)) ^ 1318037708;
                        i5 = 580018639;
                    } else {
                        iM6981 = (C2105.m6981("۠ܿ") ^ i3) * (-111);
                        i4 = ((iM6981 ^ i2) * (-21043)) ^ (-857373327);
                        i5 = 1220584660;
                    }
                    break;
                case -1587844743:
                case 410340230:
                    c16560.m39041();
                    c16560.m39000((Collection) arrayList);
                    c16560.m39015();
                    iM6981 = C2105.m6981("ۖ᩻") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-9017)) ^ 1878538798;
                    i5 = -1826144824;
                    break;
                case -1560968993:
                case 1814836139:
                    C4075.m12263();
                    if (C2958.f9394 < 0) {
                        iM6981 = (i2 - C0630.m2566("ۡܽ")) * 83;
                        i4 = ((iM6981 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    } else {
                        iM6981 = (C2105.m6981("ۢۙ") ^ i3) * 55;
                        i4 = ((iM6981 ^ i2) * 25223) ^ (-2109005610);
                        i5 = 1035813207;
                    }
                    break;
                case -1378163374:
                case 139136831:
                    C3432.m10477();
                    C2958.m9034();
                    iM6981 = (C0630.m2566("ۛۗ") + i3) * 77;
                    i4 = ((iM6981 ^ i2) * 427) ^ 134762948;
                    i5 = -1672917913;
                    break;
                case -1269615536:
                case -405177034:
                    if (m11542(c16560)) {
                        iM6981 = C0630.m2566("᩹ܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7291)) ^ (-1680441702);
                        i5 = 340527500;
                    } else {
                        iM6981 = C2105.m6981("ۖ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-9017)) ^ 1878538798;
                        i5 = -1826144824;
                    }
                    break;
                case -1142337083:
                case 1544242280:
                    if (C3245.m9925() != 0) {
                        iM6981 = (i2 - C0630.m2566("ۡܽ")) * 83;
                        i4 = ((iM6981 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    } else {
                        iM6981 = (C0630.m2566("ۤ᩷") + i2) * 29;
                        i4 = ((iM6981 ^ i3) * 25339) ^ (-1680783398);
                        i5 = -477317276;
                    }
                    break;
                case -821082940:
                case 232792475:
                    if (C21923.m49329()) {
                        iM6981 = (C0630.m2566("ۛۗ") + i3) * 77;
                        i4 = ((iM6981 ^ i2) * 427) ^ 134762948;
                        i5 = -1672917913;
                    } else {
                        iM6981 = (C2105.m6981("֡ۤ") + i2) * 3;
                        i4 = ((iM6981 ^ i3) * (-21723)) ^ (-1711332730);
                        i5 = 479644403;
                    }
                    break;
                case -744080849:
                case -460931159:
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("ۛۗ") + i3) * 77;
                        i4 = ((iM6981 ^ i2) * 427) ^ 134762948;
                        i5 = -1672917913;
                    } else {
                        iM6981 = C0630.m2566("ܶ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-12899)) ^ 906058311;
                        i5 = -1559696710;
                    }
                    break;
                case -731489125:
                case -133215657:
                    C2520.m8026();
                    break;
                case -694545404:
                case 640911493:
                    break;
                case -524412352:
                case 381893210:
                    if (C5695.m16023() >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۡܽ")) * 83;
                        i4 = ((iM6981 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23789) ^ 1205600195;
                        i5 = 1241649097;
                    }
                    break;
                case 61471570:
                case 1385273725:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("᩷ܶ") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * (-4445)) ^ 1472342631;
                        i5 = 1104468348;
                    } else {
                        iM6981 = (C2105.m6981("ۛ᩵") + i3) * (-105);
                        i4 = ((iM6981 ^ i2) * (-6017)) ^ 2073229549;
                        i5 = 2105768869;
                    }
                    break;
                case 164117153:
                case 899208226:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C0630.m2566("᩶ܺ") ^ i3) * 17;
                        i4 = ((iM6981 ^ i2) * (-13743)) ^ 1318037708;
                        i5 = 580018639;
                    } else {
                        iM6981 = (C2105.m6981("ۖ۟") ^ i2) * 37;
                        i4 = ((iM6981 ^ i3) * 24089) ^ (-2044736181);
                        i5 = 1638536597;
                    }
                    break;
                case 370955431:
                case 942994661:
                    if (C3746.m11369() >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۡܽ")) * 83;
                        i4 = ((iM6981 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۚ᩷")) * (-93);
                        i4 = ((iM6981 ^ i2) * (-1135)) ^ 1006435210;
                        i5 = 1146645918;
                    }
                    break;
                case 469593115:
                case 1471114604:
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("᩷ܶ") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * (-4445)) ^ 1472342631;
                        i5 = 1104468348;
                    } else {
                        iM6981 = (C2105.m6981("ۗۢ") ^ i2) * (-39);
                        i4 = ((iM6981 ^ i3) * 27655) ^ (-931718653);
                        i5 = 2133000465;
                    }
                    break;
                case 2019428429:
                case 2040205093:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C0630.m2566("᩶ܺ") ^ i3) * 17;
                        i4 = ((iM6981 ^ i2) * (-13743)) ^ 1318037708;
                        i5 = 580018639;
                    } else {
                        iM6981 = (C0630.m2566("ۛۗ") + i3) * 77;
                        i4 = ((iM6981 ^ i2) * 427) ^ 134762948;
                        i5 = -1672917913;
                    }
                    break;
                default:
                    arrayList = this.f14846;
                    if (C3537.m10754(arrayList)) {
                        iM6981 = C2105.m6981("ۖ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-9017)) ^ 1878538798;
                        i5 = -1826144824;
                    } else {
                        iM6981 = (C2105.m6981("᩵ܿ") ^ i3) * (-93);
                        i4 = ((iM6981 ^ i2) * (-12153)) ^ 110550424;
                        i5 = -335906838;
                    }
                    break;
            }
            return;
        }
    }
}
