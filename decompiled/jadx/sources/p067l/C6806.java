package p067l;

import bin.p000mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H508 */
/* JADX INFO: loaded from: classes3.dex */
public class C6806 extends AbstractC23625 {

    /* JADX INFO: renamed from: ۗۧ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f81977 = {8540, 8823, -10798, 11570, -19751, -19752, -19749, -19742, -19762, -19756, -19750, -19757, -19742, -19754, -19752, -19772, -19742, -19766, -19748, -19761, -19757, 1413, 10934, 10925, 10932, 10932, 29578, -21007, -18144, -22827, -21755, -19046, 4755, -5809, -5818, -5797, -5814, -5812, -5784, -5799, -5822, -5798, -5784, -5765, -5778, -5770, -5767, -5784, -5763, -5791, -5766, -5770, -5798, -5824, -5810, -5817, 5987, -13081, -13490, 12370, 20029, 20029, 20029};

    /* JADX INFO: renamed from: ֡֫ */
    public int f17674;

    /* JADX INFO: renamed from: ֨֫ */
    public ArrayList f17675;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f17676;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f17677;

    /* JADX INFO: renamed from: ᩴ֫ */
    public AbstractC17043 f17678;

    /* JADX INFO: renamed from: ᩵֫ */
    public AbstractC17043 f17679;

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
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        int iM55979;
        int i;
        int i2;
        int i3 = C0949.f81897;
        int i4 = ServiceConnectionC1013.f81940;
        int iM55680 = C0873.m55680("ܶ᩹") ^ i3;
        int i5 = ((iM55680 ^ i4) * (-4223)) ^ (-442438631);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55680 ^ (-503468539);
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
        String strM55852 = null;
        int iM559710 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-7351)) >> 31));
            switch (i14) {
                case -2073641794:
                case -280768749:
                    c = '8';
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("᩹֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-15095)) ^ (-419450463);
                        i2 = 1473903916;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۚ֨")) * 89;
                        i = ((iM55979 ^ i4) * 10289) ^ (-1235247450);
                        i2 = 491093805;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1851671316:
                case 950786080:
                    sArr = f81977;
                    if (C1017.m56187() <= 0) {
                        iM55979 = C0873.m55680("֫ۖ") ^ i4;
                        i = ((iM55979 ^ i3) * 3887) ^ (-1323537356);
                        i2 = 1495384135;
                    } else {
                        iM55979 = C0946.m55979("᩵ۜ") ^ i4;
                        i = ((iM55979 ^ i3) * 23903) ^ (-1301579102);
                        i2 = 1754428105;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1819306635:
                case 2134982011:
                    s = sArr[c];
                    if (C1124.m56367() >= 0) {
                        iM55979 = (C0873.m55680("ۨۧ") + i3) * (-75);
                        i = ((iM55979 ^ i4) * (-30185)) ^ 573835629;
                        i2 = 345071673;
                    } else {
                        iM55979 = (C0946.m55979("ۗᩳ") ^ i4) * (-69);
                        i = ((iM55979 ^ i3) * 13139) ^ (-840869764);
                        i2 = 374958268;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1761555759:
                case -457552441:
                    strM55852 = C0917.m55852(sArr2, i12, i13, i11);
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("ܳܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-21865)) ^ (-552804003);
                        i2 = 489909173;
                    } else {
                        iM55979 = (C0873.m55680("ܽۧ") ^ i4) * 63;
                        i = ((iM55979 ^ i3) * 32397) ^ 1957155068;
                        i2 = 37824573;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1485023304:
                case 117518050:
                    i11 = 19987;
                    iM55979 = (i4 - C0946.m55979("ܽܽ")) * (-23);
                    i = ((iM55979 ^ i3) * (-10667)) ^ (-1635206760);
                    i2 = -127964199;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1472299019:
                case -690928140:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("᩹֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-15095)) ^ (-419450463);
                        i2 = 1473903916;
                    } else {
                        iM55979 = (C0873.m55680("ۨۧ") + i3) * (-75);
                        i = ((iM55979 ^ i4) * (-30185)) ^ 573835629;
                        i2 = 345071673;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1390862233:
                case 1384928379:
                    iM559710 = 2129540063 ^ C0946.m55979(strM55852);
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("᩵᩹") + i3) * 119;
                        i = ((iM55979 ^ i4) * 7627) ^ (-1320667447);
                        i2 = 799013943;
                    } else {
                        iM55979 = C0873.m55680("ܳܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-21865)) ^ (-552804003);
                        i2 = 489909173;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1338776937:
                case -349104290:
                    int i15 = i8 + i9;
                    i10 = i15 + i15;
                    if (C0937.f81884) {
                        iM55979 = (C0946.m55979("۫ܰ") + i3) * 81;
                        i = ((iM55979 ^ i4) * (-10913)) ^ 1590565574;
                        i2 = -1151716614;
                    } else {
                        iM55979 = C0873.m55680("֫ۖ") ^ i4;
                        i = ((iM55979 ^ i3) * 3887) ^ (-1323537356);
                        i2 = 1495384135;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1244232772:
                case 1462367003:
                    AbstractC0942.m55971();
                    break;
                case -1164493280:
                case -794754347:
                    i11 = 11938;
                    iM55979 = (i4 - C0946.m55979("ܽܽ")) * (-23);
                    i = ((iM55979 ^ i3) * (-10667)) ^ (-1635206760);
                    i2 = -127964199;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1154665970:
                case 546368651:
                    C1048.m56305();
                    iM55979 = C0873.m55680("֫ۖ") ^ i4;
                    i = ((iM55979 ^ i3) * 3887) ^ (-1323537356);
                    i2 = 1495384135;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -845466230:
                case -476519379:
                    C0946.m55981(this, RunnableC0871.m55667(sArr3, i7, 3, i11));
                    break;
                case -807917614:
                case 2146585537:
                    s2 = 9289;
                    if (RunnableC0897.f81856) {
                        iM55979 = (i4 - C0946.m55979("᩶ᩴ")) * (-85);
                        i = ((iM55979 ^ i3) * (-11155)) ^ 341070859;
                        i2 = 1475883426;
                    } else {
                        iM55979 = C0873.m55680("֡ۘ") ^ i3;
                        i = ((iM55979 ^ i4) * (-18451)) ^ (-42817044);
                        i2 = 260537477;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -238782289:
                case 2015255958:
                    if (C1003.m56123() == 0) {
                        iM55979 = (C0873.m55680("ۨۧ") + i3) * (-75);
                        i = ((iM55979 ^ i4) * (-30185)) ^ 573835629;
                        i2 = 345071673;
                    } else {
                        iM55979 = C0873.m55680("֡ۘ") ^ i3;
                        i = ((iM55979 ^ i4) * (-18451)) ^ (-42817044);
                        i2 = 260537477;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 660295633:
                case 1437896682:
                    C0898.m55798(this, iM559710);
                    sArr3 = f81977;
                    i7 = 60;
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0873.m55680("ۨۧ") + i3) * (-75);
                        i = ((iM55979 ^ i4) * (-30185)) ^ 573835629;
                        i2 = 345071673;
                    } else {
                        iM55979 = (C0873.m55680("ܿ֫") + i3) * 101;
                        i = ((iM55979 ^ i4) * 23675) ^ 77327081;
                        i2 = 1545126615;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 926735736:
                case 1476284226:
                    i8 = s * s;
                    i9 = 86285521;
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("᩹֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-15095)) ^ (-419450463);
                        i2 = 1473903916;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܰۘ")) * 53;
                        i = ((iM55979 ^ i4) * 4875) ^ 751456427;
                        i2 = 1317575297;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1202430271:
                case 1301457289:
                    sArr2 = f81977;
                    i12 = 57;
                    i13 = 3;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("֡ۘ") ^ i3;
                        i = ((iM55979 ^ i4) * (-18451)) ^ (-42817044);
                        i2 = 260537477;
                    } else {
                        iM55979 = C0873.m55680("᩵۬") ^ i3;
                        i = ((iM55979 ^ i4) * (-32511)) ^ (-981564329);
                        i2 = 1314225632;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1207259664:
                case 2107816322:
                    RunnableC0897.m55784();
                    if (C0854.f81826 == 0) {
                        iM55979 = C0873.m55680("֫ۖ") ^ i4;
                        i = ((iM55979 ^ i3) * 3887) ^ (-1323537356);
                        i2 = 1495384135;
                    } else {
                        iM55979 = C0873.m55680("᩹֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-15095)) ^ (-419450463);
                        i2 = 1473903916;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i16 = s + s2;
                    if ((i16 * i16) - i10 > 0) {
                        iM55979 = (C0873.m55680("ۘۨ") ^ i4) * (-79);
                        i = ((iM55979 ^ i3) * 20023) ^ 2042264575;
                        i2 = 1697615424;
                    } else {
                        iM55979 = C0873.m55680("ۗܳ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16131)) ^ 945716120;
                        i2 = 2116681890;
                    }
                    i6 = iM55979 ^ i2;
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
    
        if (p067l.C1036.m56257() > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (p067l.C1929.f83011 == 0) goto L7;
     */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5589(AbstractActivityC5549 abstractActivityC5549, C18736 c18736, boolean z) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
        int i4 = ServiceConnectionC1013.f81940;
        int i5 = ViewOnClickListenerC0939.f81888;
        int iM55979 = C0946.m55979("۫ۘ") ^ i4;
        int i6 = ((iM55979 ^ i5) * (-27277)) ^ 1069728937;
        String strM55638 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM55979 ^ 274748508;
        boolean z2 = false;
        int iM55682 = 0;
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
                    iM55680 = (C0946.m55979("ۘۜ") + i5) * (-107);
                    i = ((iM55680 ^ i4) * 25087) ^ 596693965;
                    i2 = -2007879826;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -2044446955:
                case 1390381147:
                    i14 = (s * s) + 121749156;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0873.m55680("۠ۡ") + i4) * 23;
                        i = ((iM55680 ^ i5) * 5563) ^ 96528393;
                        i2 = 374193018;
                    } else {
                        iM55680 = (C0873.m55680("᩸ۛ") ^ i4) * (-9);
                        i = ((iM55680 ^ i5) * (-5063)) ^ (-1075313138);
                        i2 = 405185554;
                    }
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -1730544569:
                case 2134880984:
                    C1194.m56396();
                    break;
                case -1593929712:
                case 1286315830:
                    if (z) {
                        iM55681 = C0873.m55680("ܶܶ") ^ i5;
                        i = ((iM55681 ^ i4) * 26739) ^ (-1441640479);
                        i3 = 1227753014;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    iM55680 = C0946.m55979("ܳ᩺") ^ i4;
                    i = ((iM55680 ^ i5) * 4007) ^ 142140053;
                    i2 = 1090935950;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -1562507239:
                case -1436061187:
                    if (C1017.m56186(c18736)) {
                        iM55681 = C0873.m55680("ܽ۟") ^ i4;
                        i = ((iM55681 ^ i5) * (-10003)) ^ 204387719;
                        i3 = 1275691554;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    iM55680 = C0946.m55979("ܳ᩺") ^ i4;
                    i = ((iM55680 ^ i5) * 4007) ^ 142140053;
                    i2 = 1090935950;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -1391003412:
                case -1376694183:
                    break;
                case -1287494329:
                case 1314097563:
                    if ((s * 22068) - i14 <= 0) {
                        iM55680 = C0873.m55680("ۡ۬") ^ i5;
                        i = ((iM55680 ^ i4) * 23001) ^ 45169313;
                        i2 = 63049789;
                    } else {
                        iM55680 = C0873.m55680("ۘ᩹") ^ i4;
                        i = ((iM55680 ^ i5) * (-19079)) ^ (-1742500155);
                        i2 = 1840924801;
                    }
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -1211111379:
                case 1559035193:
                    if (this.f17677) {
                        int iM559710 = C0946.m55979("ۡ֡") ^ i5;
                        i7 = iM559710 ^ (-29094102);
                        i6 = ((iM559710 ^ i4) * (-6717)) ^ 1469233873;
                        abstractActivityC55410 = abstractActivityC5549;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩺") ^ i4;
                        i = ((iM55680 ^ i5) * 4007) ^ 142140053;
                        i2 = 1090935950;
                        i7 = iM55680 ^ i2;
                        abstractActivityC55410 = abstractActivityC5549;
                        i6 = i;
                    }
                    break;
                case -1186407409:
                case 1416795982:
                    iM55682 = C0873.m55680(RunnableC0871.m55667(sArr, i10, i11, i9));
                    i8 = 2101259903;
                    if (C0946.f81894 != 0) {
                        iM55681 = (C0946.m55979("ۧ᩵") ^ i5) * (-49);
                        i = ((iM55681 ^ i4) * (-10107)) ^ 1188612237;
                        i3 = -271630009;
                    } else {
                        iM55681 = (C0946.m55979("ۙۛ") ^ i5) * 37;
                        i = ((iM55681 ^ i4) * 28181) ^ (-1696794902);
                        i3 = -254619523;
                    }
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                case -1092413739:
                case -767735274:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = (C0873.m55680("۠ۡ") + i4) * 23;
                        i = ((iM55680 ^ i5) * 5563) ^ 96528393;
                        i2 = 374193018;
                    } else {
                        iM55680 = C0946.m55979("ۤۚ") ^ i5;
                        i = ((iM55680 ^ i4) * (-11239)) ^ (-439760879);
                        i2 = 1237806717;
                    }
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -1006223860:
                case 1474390049:
                    i9 = 45757;
                    iM55680 = (C0946.m55979("ۘۜ") + i5) * (-107);
                    i = ((iM55680 ^ i4) * 25087) ^ 596693965;
                    i2 = -2007879826;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -989707643:
                case 487408833:
                    z2 = true;
                    sArr = f81977;
                    i10 = 1;
                    i11 = 3;
                    if (!C0882.f81846) {
                        iM55681 = (C0873.m55680("۟֫") + i4) * (-23);
                        i = ((iM55681 ^ i5) * 20313) ^ (-455144622);
                        i3 = -505947598;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    iM55680 = (C0873.m55680("۠ۡ") + i4) * 23;
                    i = ((iM55680 ^ i5) * 5563) ^ 96528393;
                    i2 = 374193018;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -818700600:
                case -353019672:
                    s = f81977[0];
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("ۘۡ") ^ i5) * (-73);
                        i = ((iM55680 ^ i4) * (-15093)) ^ (-1056219823);
                        i2 = 1919392352;
                    } else {
                        iM55680 = (C0873.m55680("۫ۡ") ^ i4) * (-103);
                        i = ((iM55680 ^ i5) * (-1927)) ^ (-689934409);
                        i2 = -95334163;
                    }
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -638349708:
                case 996505203:
                    strM55638 = C0863.m55638(abstractActivityC55410, iM55682 ^ i8);
                    sArr2 = f81977;
                    i12 = 4;
                    if (!C0873.m55678()) {
                        iM55681 = C0873.m55680("᩻᩶") ^ i5;
                        i = ((iM55681 ^ i4) * (-25975)) ^ (-29450294);
                        i3 = -1181122322;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    iM55680 = C0873.m55680("ܿᩳ") ^ i4;
                    i = ((iM55680 ^ i5) * (-25713)) ^ 1501786117;
                    i2 = -971801749;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -306615422:
                case 647495860:
                    DialogInterfaceOnClickListenerC12648.m29080(abstractActivityC55410, C0992.m56102(sArr2, i12, 17, i9), strM55638, z2);
                    iM55680 = C0946.m55979("ܳ᩺") ^ i4;
                    i = ((iM55680 ^ i5) * 4007) ^ 142140053;
                    i2 = 1090935950;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case -207158602:
                case -57181087:
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("۠ۡ") + i4) * 23;
                        i = ((iM55680 ^ i5) * 5563) ^ 96528393;
                        i2 = 374193018;
                    } else {
                        iM55680 = (C0873.m55680("ܺ֡") + i5) * 39;
                        i = ((iM55680 ^ i4) * (-22443)) ^ (-922888590);
                        i2 = -524419221;
                    }
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case 124712705:
                case 825032633:
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("ܿᩳ") ^ i4;
                        i = ((iM55680 ^ i5) * (-25713)) ^ 1501786117;
                        i2 = -971801749;
                    } else {
                        iM55680 = C0873.m55680("ܺ۟") ^ i4;
                        i = ((iM55680 ^ i5) * (-2921)) ^ 117181951;
                        i2 = -1318028671;
                    }
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case 183737264:
                case 453626398:
                    C1025.m56230();
                    if (C0949.f81897 < 0) {
                        iM55681 = (C0873.m55680("۠۟") + i4) * (-49);
                        i = ((iM55681 ^ i5) * (-14847)) ^ 557113193;
                        i3 = -614442215;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    iM55680 = C0873.m55680("ܿᩳ") ^ i4;
                    i = ((iM55680 ^ i5) * (-25713)) ^ 1501786117;
                    i2 = -971801749;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case 501487164:
                case 2085651428:
                    if (C1964.m56597() != 0) {
                        iM55680 = C0873.m55680("ܿᩳ") ^ i4;
                        i = ((iM55680 ^ i5) * (-25713)) ^ 1501786117;
                        i2 = -971801749;
                    } else {
                        iM55680 = (C0946.m55979("ۡۨ") ^ i5) * 49;
                        i = ((iM55680 ^ i4) * (-111)) ^ 517014080;
                        i2 = -264461320;
                    }
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case 1470618725:
                case 1569155348:
                    if (C0927.m55873() <= 0) {
                        iM55680 = C0873.m55680("ܿᩳ") ^ i4;
                        i = ((iM55680 ^ i5) * (-25713)) ^ 1501786117;
                        i2 = -971801749;
                    } else {
                        iM55680 = C0946.m55979("ۙ֫") ^ i4;
                        i = ((iM55680 ^ i5) * 30165) ^ (-2020725926);
                        i2 = 1377057367;
                    }
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                case 1545038429:
                case 1619349732:
                    C0937.m55918();
                    C1036.m56257();
                    break;
                case 1632530709:
                case 1938238770:
                    C0967.m56074();
                    iM55680 = (C0873.m55680("۠ۡ") + i4) * 23;
                    i = ((iM55680 ^ i5) * 5563) ^ 96528393;
                    i2 = 374193018;
                    i7 = iM55680 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    i6 = i;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    public C6806() {
        ArrayList arrayList = null;
        int i = -1093862008;
        int i2 = C1044.f81959;
        int i3 = C0989.f81920;
        int iM55979 = C0946.m55979("֡᩺") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-3451)) ^ (-188602742);
        int i5 = -801293824;
        while (true) {
            i = ((((i ^ i2) * (-15337)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2138723912:
                case 2122553512:
                    C0946.m55980();
                    C1048.m56305();
                    throw new RuntimeException();
                case -1626308722:
                case -389940:
                    if (C1012.f81938 < 0) {
                        iM55979 = C0946.m55979("ۧۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7031) ^ (-179861217);
                        i5 = 1213291195;
                    } else {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    }
                    break;
                case -1457429385:
                case 1734982421:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("ܰ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10465) ^ 2125514757;
                        i5 = 1503245295;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12831) ^ 674360841;
                        i5 = -848153271;
                    }
                    break;
                case -1396993997:
                case -446771790:
                    C0866.m55645();
                    if (C0845.f81821 < 0) {
                        iM55979 = C0946.m55979("᩺ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-907)) ^ 226890361;
                        i5 = 390616566;
                    } else {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    }
                    break;
                case -1208960969:
                case 1160366798:
                    this.f17675 = arrayList;
                    return;
                case -1172258577:
                case 894743851:
                    if (C0930.m55885() <= 0) {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩶۟")) * 87;
                        i4 = ((iM55979 ^ i3) * 26893) ^ (-1908527404);
                        i5 = 725514236;
                    }
                    break;
                case -1116513025:
                case 1358149732:
                    C1036.m56257();
                    if (!C1048.f81963) {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM55979 = (C0873.m55680("ܿۗ") + i2) * 5;
                        i4 = ((iM55979 ^ i3) * (-28303)) ^ 69046023;
                        i5 = 693008168;
                    }
                    break;
                case -1099710653:
                case 264302824:
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM55979 = C0873.m55680("ۢᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27961) ^ 1255715404;
                        i5 = 1543721265;
                    }
                    break;
                case -1021520370:
                case 1702511003:
                    if (C1071.m56343() != 0) {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM55979 = C0946.m55979("ۛ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-671)) ^ (-1767190581);
                        i5 = 253883778;
                    }
                    break;
                case -1011637945:
                case 2129101445:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("᩸֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16137) ^ 212216290;
                        i5 = 1262812646;
                    } else {
                        iM55979 = (C0873.m55680("ܿۗ") + i2) * 5;
                        i4 = ((iM55979 ^ i3) * (-28303)) ^ 69046023;
                        i5 = 693008168;
                    }
                    break;
                case -1010831894:
                case 1402503802:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("ܰ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10465) ^ 2125514757;
                        i5 = 1503245295;
                    } else {
                        iM55979 = (C0873.m55680("ۙ۫") + i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 27481) ^ 1397070827;
                        i5 = -205424588;
                    }
                    break;
                case -617524310:
                case 303129000:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("᩺ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-907)) ^ 226890361;
                        i5 = 390616566;
                    } else {
                        iM55979 = C0873.m55680("ۤۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 32245) ^ (-1524865561);
                        i5 = -1497725799;
                    }
                    break;
                case -100417041:
                case 1944003761:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-17073)) ^ (-758853746);
                        i5 = -279674223;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۛܺ")) * 93;
                        i4 = ((iM55979 ^ i3) * (-3599)) ^ (-78398642);
                        i5 = -2129049606;
                    }
                    break;
                case 69063363:
                case 165470447:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("ۧۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7031) ^ (-179861217);
                        i5 = 1213291195;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9017)) ^ (-831780107);
                        i5 = 1263635241;
                    }
                    break;
                case 79841638:
                case 980058473:
                    C0873.m55678();
                    RunnableC0871.m55672();
                    iM55979 = (C0873.m55680("ܿۗ") + i2) * 5;
                    i4 = ((iM55979 ^ i3) * (-28303)) ^ 69046023;
                    i5 = 693008168;
                    break;
                default:
                    arrayList = new ArrayList();
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۧۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7031) ^ (-179861217);
                        i5 = 1213291195;
                    } else {
                        iM55979 = (C0946.m55979("֫᩺") + i2) * (-121);
                        i4 = ((iM55979 ^ i3) * 31831) ^ (-1576683288);
                        i5 = 1470386971;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79721;
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
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5;
        String strM56460;
        String strM56275 = null;
        String str = null;
        String[] strArr = null;
        int iM55682 = 0;
        String strM55970 = null;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1270673904;
        int i10 = C0845.f81821;
        int i11 = C1003.f81929;
        int iM55979 = (i10 - C0946.m55979("ܽ֡")) * 63;
        int i12 = ((iM55979 ^ i11) * 30217) ^ (-1494410904);
        int i13 = iM55979 ^ (-420156456);
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        AbstractC17043 abstractC17043 = null;
        int i17 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-17773)) >> 31));
            switch (i9) {
                case -1997187702:
                case -1935031557:
                    strM56275 = strM56275;
                    i16 = s * 2;
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("ۚۖ") ^ i11;
                        i = ((iM55680 ^ i10) * 11327) ^ 1562397221;
                        i2 = 733687414;
                    } else {
                        iM55680 = (C0873.m55680("᩸֡") ^ i10) * (-99);
                        i = ((iM55680 ^ i11) * 5227) ^ (-619697379);
                        i2 = 525407212;
                    }
                    i5 = iM55680 ^ i2;
                    String str2 = strM56275;
                    i13 = i5;
                    i12 = i;
                    strM56275 = str2;
                    break;
                case -1982838541:
                case 58325990:
                    i6 = 43347;
                    iM55680 = (C0946.m55979("֨۬") ^ i11) * 71;
                    i = ((iM55680 ^ i10) * 9753) ^ 219627287;
                    i2 = -272199166;
                    i5 = iM55680 ^ i2;
                    String str3 = strM56275;
                    i13 = i5;
                    i12 = i;
                    strM56275 = str3;
                    break;
                case -1896260279:
                case -1122472003:
                    strM56460 = C1404.m56460(abstractC17043);
                    str = strM56460;
                    iM55681 = C0946.m55979("ᩳ۫") ^ i11;
                    i3 = ((iM55681 ^ i10) * (-19751)) ^ 982845824;
                    i4 = -19238347;
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    break;
                case -1760815070:
                case 2122931084:
                    C0989.m56095();
                    return null;
                case -1751459162:
                case 163753250:
                    strM56275 = strM56275;
                    i17 = i16 + 1;
                    s2 = 1;
                    if (C0863.f81833 > 0) {
                        iM55680 = C0873.m55680("۫ۢ") ^ i10;
                        i = ((iM55680 ^ i11) * 15771) ^ 1296473715;
                        i2 = -1501169715;
                        i5 = iM55680 ^ i2;
                        String str4 = strM56275;
                        i13 = i5;
                        i12 = i;
                        strM56275 = str4;
                    } else {
                        strM56275 = strM56275;
                        iM55681 = (i10 - C0946.m55979("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM55681 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -1450902554:
                case -1136471687:
                    strM56275 = strM56275;
                    s = sArr2[c];
                    if (C1046.f81962 > 0) {
                        iM55680 = C0873.m55680("ܳ۠") ^ i11;
                        i = ((iM55680 ^ i10) * 13491) ^ (-1590172069);
                        i2 = -1362068322;
                        i5 = iM55680 ^ i2;
                        String str5 = strM56275;
                        i13 = i5;
                        i12 = i;
                        strM56275 = str5;
                    } else {
                        strM56275 = strM56275;
                        iM55681 = (i10 - C0946.m55979("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM55681 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -978904456:
                case 1743775288:
                    strArr = new String[]{str, strM56275};
                    if (C1229.f82066 < 0) {
                        iM55681 = (C0946.m55979("᩵ۘ") ^ i11) * (-27);
                        i3 = ((iM55681 ^ i10) * 13775) ^ 1100055035;
                        i4 = -1253196522;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                    } else {
                        strM56275 = strM56275;
                        iM55680 = (C0873.m55680("᩸֡") ^ i10) * (-99);
                        i = ((iM55680 ^ i11) * 5227) ^ (-619697379);
                        i2 = 525407212;
                        i5 = iM55680 ^ i2;
                        String str6 = strM56275;
                        i13 = i5;
                        i12 = i;
                        strM56275 = str6;
                    }
                    break;
                case -907604744:
                case 1564450210:
                    strM56460 = C0873.m55689(f81977, 22, 4, i6);
                    str = strM56460;
                    iM55681 = C0946.m55979("ᩳ۫") ^ i11;
                    i3 = ((iM55681 ^ i10) * (-19751)) ^ 982845824;
                    i4 = -19238347;
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    break;
                case -895651423:
                case 1417330768:
                    strM56275 = strM56275;
                    sArr2 = f81977;
                    c = 21;
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("۠ۘ") + i10) * (-39);
                        i = ((iM55680 ^ i11) * 2819) ^ (-1598663219);
                        i2 = -133828175;
                    } else {
                        iM55680 = (C0873.m55680("֨᩸") + i10) * 119;
                        i = ((iM55680 ^ i11) * 15337) ^ (-1482817806);
                        i2 = -660957589;
                    }
                    i5 = iM55680 ^ i2;
                    String str7 = strM56275;
                    i13 = i5;
                    i12 = i;
                    strM56275 = str7;
                    break;
                case -864039770:
                case -696202608:
                    if (C0892.f81851) {
                        iM55681 = C0946.m55979("ܳᩳ") ^ i11;
                        i3 = ((iM55681 ^ i10) * (-2645)) ^ (-1998780113);
                        i4 = -1250575894;
                    } else {
                        iM55681 = (i10 - C0946.m55979("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM55681 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    break;
                case -816011433:
                case 325494522:
                    strM55970 = AbstractC0942.m55970(sArr3, i14, i15, i6);
                    if (C0955.m56025()) {
                        iM55681 = C0946.m55979("֨ܿ") ^ i11;
                        i3 = ((iM55681 ^ i10) * 1797) ^ 2114300082;
                        i4 = -301587879;
                    } else {
                        iM55681 = C0873.m55680("ۨ֨") ^ i11;
                        i3 = ((iM55681 ^ i10) * (-24405)) ^ 1944113614;
                        i4 = -388593939;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    break;
                case -593489787:
                case 876615878:
                    sArr = f81977;
                    i7 = 26;
                    i8 = 3;
                    if (C0992.f81922 < 0) {
                        iM55681 = C0873.m55680("᩵ۨ") ^ i11;
                        i3 = ((iM55681 ^ i10) * 1231) ^ 2122139554;
                        i4 = 44812228;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                    } else {
                        strM56275 = strM56275;
                        iM55680 = (C0946.m55979("۠ۘ") + i10) * (-39);
                        i = ((iM55680 ^ i11) * 2819) ^ (-1598663219);
                        i2 = -133828175;
                        i5 = iM55680 ^ i2;
                        String str8 = strM56275;
                        i13 = i5;
                        i12 = i;
                        strM56275 = str8;
                    }
                    break;
                case -396738911:
                case 328402590:
                    sArr3 = f81977;
                    i14 = 29;
                    i15 = 3;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55681 = C0946.m55979("֨ܿ") ^ i11;
                        i3 = ((iM55681 ^ i10) * 1797) ^ 2114300082;
                        i4 = -301587879;
                    } else {
                        iM55681 = (C0946.m55979("᩵ۢ") + i10) * 99;
                        i3 = ((iM55681 ^ i11) * 15237) ^ 1312590413;
                        i4 = 2051444063;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    break;
                case -368890931:
                case 550610111:
                    iM55682 = C0873.m55680(C0947.m55993(sArr, i7, i8, i6));
                    if (AbstractC0942.f81890 > 0) {
                        iM55681 = (i10 - C0946.m55979("ۙ֫")) * (-91);
                        i3 = ((iM55681 ^ i11) * 14029) ^ 1123943861;
                        i4 = 1851633812;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                    } else {
                        strM56275 = strM56275;
                        iM55680 = (C0946.m55979("۠ۘ") + i10) * (-39);
                        i = ((iM55680 ^ i11) * 2819) ^ (-1598663219);
                        i2 = -133828175;
                        i5 = iM55680 ^ i2;
                        String str9 = strM56275;
                        i13 = i5;
                        i12 = i;
                        strM56275 = str9;
                    }
                    break;
                case -331718074:
                case 1612160054:
                    AbstractC17043 abstractC17044 = this.f17678;
                    if (abstractC17044 == null) {
                        int iM55683 = (C0873.m55680("ܽۜ") + i10) * 59;
                        i12 = ((iM55683 ^ i11) * 29423) ^ 57447072;
                        i13 = iM55683 ^ 1736218220;
                        abstractC17043 = abstractC17044;
                    } else {
                        int iM55684 = C0873.m55680("۟ۘ") ^ i10;
                        strM56275 = strM56275;
                        i = ((iM55684 ^ i11) * 26593) ^ (-1874887346);
                        i5 = iM55684 ^ 1102948655;
                        abstractC17043 = abstractC17044;
                        String str10 = strM56275;
                        i13 = i5;
                        i12 = i;
                        strM56275 = str10;
                    }
                    break;
                case -272012510:
                case 92790986:
                    RunnableC0871.m55672();
                    C0906.m55809();
                    iM55681 = C0946.m55979("ܳᩳ") ^ i11;
                    i3 = ((iM55681 ^ i10) * (-2645)) ^ (-1998780113);
                    i4 = -1250575894;
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    break;
                case 444120670:
                case 2058549114:
                    if (C1929.f83011 == 0) {
                        iM55681 = (i10 - C0946.m55979("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM55681 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                    } else {
                        iM55681 = C0946.m55979("֨ܿ") ^ i11;
                        i3 = ((iM55681 ^ i10) * 1797) ^ 2114300082;
                        i4 = -301587879;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    break;
                case 1094994765:
                case 1425004278:
                    C0930.m55885();
                    if (C0854.f81826 == 0) {
                        strM56275 = strM56275;
                        iM55680 = (C0946.m55979("۠ۘ") + i10) * (-39);
                        i = ((iM55680 ^ i11) * 2819) ^ (-1598663219);
                        i2 = -133828175;
                        i5 = iM55680 ^ i2;
                        String str11 = strM56275;
                        i13 = i5;
                        i12 = i;
                        strM56275 = str11;
                    } else {
                        iM55681 = C0946.m55979("֨ܿ") ^ i11;
                        i3 = ((iM55681 ^ i10) * 1797) ^ 2114300082;
                        i4 = -301587879;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                    }
                    break;
                case 1379121421:
                case 1606533065:
                    strM56275 = C1044.m56275(2121414856 ^ iM55682);
                    if (C1012.f81938 >= 0) {
                        iM55681 = (i10 - C0946.m55979("ۨܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM55681 ^ i11) * (-27271)) ^ (-441725741);
                        i4 = -1697013263;
                    } else {
                        iM55681 = (C0873.m55680("ۢ۬") + i10) * (-105);
                        i3 = ((iM55681 ^ i11) * (-21557)) ^ 1750681209;
                        i4 = -1706312805;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    break;
                case 1512060881:
                case 1753570206:
                    strM56275 = strM56275;
                    int i18 = s + s2;
                    if ((i18 * i18) - i17 < 0) {
                        iM55680 = (C0873.m55680("ۤܶ") ^ i11) * (-79);
                        i = ((iM55680 ^ i10) * 2843) ^ (-247018210);
                        i2 = -716160407;
                    } else {
                        iM55680 = C0873.m55680("ۜۨ") ^ i10;
                        i = ((iM55680 ^ i11) * 20361) ^ 1608373900;
                        i2 = -1991893969;
                    }
                    i5 = iM55680 ^ i2;
                    String str12 = strM56275;
                    i13 = i5;
                    i12 = i;
                    strM56275 = str12;
                    break;
                case 1932976323:
                case 1977866984:
                    i6 = 10968;
                    iM55680 = (C0946.m55979("֨۬") ^ i11) * 71;
                    i = ((iM55680 ^ i10) * 9753) ^ 219627287;
                    i2 = -272199166;
                    i5 = iM55680 ^ i2;
                    String str13 = strM56275;
                    i13 = i5;
                    i12 = i;
                    strM56275 = str13;
                    break;
                default:
                    return C1003.m56122(C0873.m55680(strM55970) ^ 2097946623, strArr);
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043 = null;
        int i = -1482016148;
        int i2 = C1025.f81947;
        int i3 = C1404.f82149;
        int iM55680 = C0873.m55680("ᩳۘ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-6997)) ^ (-1151353461);
        int i5 = 1800947875;
        while (true) {
            i = ((((i ^ i3) * (-13105)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2004473632:
                case 570187976:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("ۡܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    } else {
                        iM55680 = C0873.m55680("ۗ֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * 17069) ^ 1619332862;
                        i5 = 797674810;
                    }
                    break;
                case -1875255460:
                case -1612926069:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ۡܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    } else {
                        iM55680 = (i2 - C0873.m55680("֡᩷")) * (-71);
                        i4 = ((iM55680 ^ i3) * 15509) ^ (-571612520);
                        i5 = 336661015;
                    }
                    break;
                case -1853781426:
                case -956190245:
                    C1012.m56134();
                    if (C0989.f81920 < 0) {
                        iM55680 = (C0946.m55979("ܶۡ") ^ i3) * (-127);
                        i4 = ((iM55680 ^ i2) * (-18209)) ^ (-1673197792);
                        i5 = -1643746062;
                    } else {
                        iM55680 = C0946.m55979("ۡܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    }
                    break;
                case -1473274568:
                case 996620057:
                    C0863.m55636();
                    break;
                case -1153748319:
                case -23401881:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("ܺܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-32375)) ^ 28618673;
                        i5 = 2080443981;
                    } else {
                        iM55680 = C0946.m55979("ۡܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    }
                    break;
                case -1063823595:
                case 403892246:
                    C0892.m55749();
                    C1404.m56468();
                    break;
                case -946108864:
                case 492305407:
                    abstractC17043 = this.f17679;
                    if (abstractC17043 != null) {
                        iM55680 = (i3 - C0873.m55680("᩻۠")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55680 ^ i2) * 4449) ^ (-1550134510);
                        i5 = -1769700909;
                    } else {
                        iM55680 = C0873.m55680("ۘܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1099)) ^ 721424698;
                        i5 = 2080727386;
                    }
                    break;
                case -728880946:
                case 1197495252:
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("ۤ᩶") ^ i3) * (-39);
                        i4 = ((iM55680 ^ i2) * (-15153)) ^ 1188912539;
                        i5 = 373425503;
                    } else {
                        iM55680 = (C0946.m55979("᩷᩺") ^ i2) * 9;
                        i4 = ((iM55680 ^ i3) * (-16043)) ^ 1540323263;
                        i5 = -313597156;
                    }
                    break;
                case -624292772:
                case 1356849050:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("֨ܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26505) ^ 1009290261;
                        i5 = -1931155719;
                    } else {
                        iM55680 = C0946.m55979("֨ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9277) ^ (-1341285848);
                        i5 = 537469160;
                    }
                    break;
                case -583773524:
                case 1784977738:
                    AbstractC0942.m55966(abstractC17043);
                    iM55680 = C0873.m55680("ۘܶ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-1099)) ^ 721424698;
                    i5 = 2080727386;
                    break;
                case -550239274:
                case 789548809:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("֨ܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26505) ^ 1009290261;
                        i5 = -1931155719;
                    } else {
                        iM55680 = (C0873.m55680("ۙۧ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-32537)) ^ 1545917678;
                        i5 = -612982389;
                    }
                    break;
                case -73305172:
                case 609608013:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0946.m55979("ܶۡ") ^ i3) * (-127);
                        i4 = ((iM55680 ^ i2) * (-18209)) ^ (-1673197792);
                        i5 = -1643746062;
                    } else {
                        iM55680 = C0946.m55979("ۙۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9951) ^ 753636451;
                        i5 = -94887;
                    }
                    break;
                case 159869370:
                case 192518059:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("ۤ۫") ^ i2) * (-123);
                        i4 = ((iM55680 ^ i3) * 28579) ^ (-1918656033);
                        i5 = 1142255561;
                    } else {
                        iM55680 = C0873.m55680("ۗܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18491) ^ (-1318254425);
                        i5 = 733157634;
                    }
                    break;
                case 212984887:
                case 1978131554:
                    if (!C0917.m55854()) {
                        iM55680 = C0946.m55979("ۡܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4965) ^ 1731666763;
                        i5 = -325716606;
                    } else {
                        iM55680 = (C0946.m55979("ۤ۫") ^ i2) * (-123);
                        i4 = ((iM55680 ^ i3) * 28579) ^ (-1918656033);
                        i5 = 1142255561;
                    }
                    break;
                case 247258990:
                case 2106581625:
                    if (C1017.m56186(c18736)) {
                        iM55680 = C0873.m55680("ۘܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1099)) ^ 721424698;
                        i5 = 2080727386;
                    } else {
                        iM55680 = C0873.m55680("ۖ۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-233)) ^ (-1734855785);
                        i5 = 857513316;
                    }
                    break;
                case 550271269:
                case 1788014723:
                    C1024.m56209();
                    C0917.m55854();
                    iM55680 = C0946.m55979("ۡܺ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 4965) ^ 1731666763;
                    i5 = -325716606;
                    break;
                case 981596520:
                case 1594959119:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("֨ܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26505) ^ 1009290261;
                        i5 = -1931155719;
                    } else {
                        iM55680 = C0946.m55979("ܿۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12857) ^ (-2058032888);
                        i5 = -675269525;
                    }
                    break;
                case 1489925975:
                case 1558975385:
                    if (C0845.f81821 < 0) {
                        iM55680 = (C0946.m55979("᩷᩺") ^ i2) * 9;
                        i4 = ((iM55680 ^ i3) * (-16043)) ^ 1540323263;
                        i5 = -313597156;
                    } else {
                        iM55680 = (C0946.m55979("ܶۡ") ^ i3) * (-127);
                        i4 = ((iM55680 ^ i2) * (-18209)) ^ (-1673197792);
                        i5 = -1643746062;
                    }
                    break;
                default:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("᩷᩺") ^ i2) * 9;
                        i4 = ((iM55680 ^ i3) * (-16043)) ^ 1540323263;
                        i5 = -313597156;
                    } else {
                        iM55680 = (C0946.m55979("ۙۡ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i2) * (-793)) ^ (-1897090623);
                        i5 = -2021564336;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int iM559711;
        int i5;
        String[] strArr;
        AbstractC14973 abstractC14973;
        short[] sArr;
        int i6;
        C13457 c13457;
        AbstractC14973 abstractC14974;
        int iM559712;
        int i7;
        int i8;
        this = this;
        String[] strArr2 = null;
        C13457 c13458 = null;
        int i9 = 0;
        boolean z = false;
        boolean z2 = false;
        C21559 c21559 = null;
        int i10 = 0;
        AbstractC17043 abstractC17043M55623 = null;
        AbstractC17043 abstractC17043M38649 = null;
        long j = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 284421360;
        int i14 = C0877.f81843;
        int i15 = RunnableC0871.f81839;
        int iM55680 = C0873.m55680("ܶ֡") ^ i14;
        int i16 = ((iM55680 ^ i15) * (-24851)) ^ (-1840883326);
        int i17 = iM55680 ^ 1076793781;
        AbstractC14973 abstractC14973M30605 = null;
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
        boolean zM55827 = false;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-31107)) >> 31));
            switch (i13) {
                case -2139939796:
                case -551294015:
                    c13458 = c13458;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC14973M30605 = abstractC14973M30605;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    int i24 = i19 + i11;
                    i12 = i24 + i24;
                    s = 4621;
                    if (C0989.f81920 < 0) {
                        iM55979 = (i14 - C0873.m55680("ܿ۠")) * (-65);
                        i = ((iM55979 ^ i15) * (-25409)) ^ (-1284892127);
                        i2 = -1276270329;
                        int i25 = iM55979 ^ i2;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
                        i17 = i25;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    }
                    abstractC14973M30605 = abstractC14973M30605;
                    int iM559713 = (C0946.m55979("۬۟") ^ i15) * (-83);
                    i = ((iM559713 ^ i14) * 2227) ^ (-1221989767);
                    i21 = i21;
                    sArr3 = sArr3;
                    c13458 = c13458;
                    i17 = iM559713 ^ (-28823339);
                    i23 = i23;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case -2055771029:
                case 979878106:
                    C8092.m18775(this.f17678, this.f17679, c13458, c21559);
                    iM559711 = (C0873.m55680("᩷۠") + i14) * 51;
                    i = ((iM559711 ^ i15) * 31017) ^ 1528043442;
                    i5 = 1389402975;
                    i17 = iM559711 ^ i5;
                    i16 = i;
                    break;
                case -2046820952:
                case -670502515:
                    this.f17677 = z2;
                    this.f17674 = strArr2.length;
                    c21559 = new C21559(this);
                    i10 = 0;
                    iM559710 = C0873.m55680("ۨܳ") ^ i14;
                    i3 = ((iM559710 ^ i15) * 24527) ^ 1701245149;
                    i4 = 1214667979;
                    i8 = iM559710 ^ i4;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case -2013105537:
                case 766555278:
                    c13458 = c13458;
                    abstractC14974 = abstractC14973M30605;
                    sArr3 = f81977;
                    i22 = 42;
                    i23 = 9;
                    if (C0890.f81849 == 0) {
                        iM559712 = (C0946.m55979("ܶۗ") + i14) * (-83);
                        i3 = ((iM559712 ^ i15) * 30697) ^ 1093502201;
                        i7 = -1499337290;
                        i8 = iM559712 ^ i7;
                        abstractC14973M30605 = abstractC14974;
                        c13457 = c13458;
                        i17 = i8;
                        i16 = i3;
                        c13458 = c13457;
                    } else {
                        sArr = sArr2;
                        strArr = strArr2;
                        i6 = i21;
                        abstractC14973 = abstractC14974;
                        int iM55681 = (C0873.m55680("۟۠") + i14) * 115;
                        i3 = ((iM55681 ^ i15) * (-11947)) ^ (-301695916);
                        i8 = iM55681 ^ 2116844421;
                        abstractC14973M30605 = abstractC14973;
                        i21 = i6;
                        strArr2 = strArr;
                        sArr2 = sArr;
                        this = this;
                        c13457 = c13458;
                        i17 = i8;
                        i16 = i3;
                        c13458 = c13457;
                    }
                    break;
                case -2001866526:
                case -648387785:
                    RunnableC1014.m56177();
                    C0866.m55645();
                    return null;
                case -1996267724:
                case 1160152495:
                    return C18736.m42767();
                case -1815610721:
                case -699950:
                    if (!C1024.f81946) {
                        c13458 = c13458;
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC14973M30605 = abstractC14973M30605;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        iM55979 = C0873.m55680("᩺᩺") ^ i14;
                        i = ((iM55979 ^ i15) * 13739) ^ 1123455335;
                        i2 = 1972213972;
                        int i26 = iM55979 ^ i2;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
                        i17 = i26;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    } else {
                        c13458 = c13458;
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC14973M30605 = abstractC14973M30605;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        int iM559714 = C0946.m55979("۟ۜ") ^ i14;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
                        i17 = iM559714 ^ (-1796116631);
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = ((iM559714 ^ i15) * 24563) ^ (-1847783289);
                        this = this;
                    }
                    break;
                case -1569793786:
                case 512174082:
                    c13458 = c13458;
                    i9 = 0;
                    z = true;
                    abstractC14974 = abstractC14973M30605;
                    if (abstractC14974 == C16984.m38573()) {
                        iM559712 = C0946.m55979("ۜܰ") ^ i15;
                        i3 = ((iM559712 ^ i14) * (-19075)) ^ 1211809620;
                        i7 = 1706244433;
                    } else {
                        iM559712 = (i14 - C0873.m55680("ۧ֨")) * (-87);
                        i3 = ((iM559712 ^ i15) * 14011) ^ 322146880;
                        i7 = 1112690771;
                    }
                    i8 = iM559712 ^ i7;
                    abstractC14973M30605 = abstractC14974;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case -1466887401:
                case -970351715:
                    c13458 = c13458;
                    if (i10 < strArr2.length) {
                        iM559710 = (C0873.m55680("᩷᩺") + i15) * (-89);
                        i3 = ((iM559710 ^ i14) * 27811) ^ (-1911422628);
                        i4 = -1050352761;
                    } else {
                        iM559710 = C0873.m55680("ܰ᩻") ^ i14;
                        i3 = ((iM559710 ^ i15) * (-26179)) ^ (-998969778);
                        i4 = -882284807;
                    }
                    i8 = iM559710 ^ i4;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case -1405135700:
                case -1218884423:
                    c13458 = c13458;
                    abstractC17043M55623 = C0861.m55623(strArr2[i10], new String[i9]);
                    this.f17678 = abstractC17043M55623;
                    sArr4 = f81977;
                    if (C0873.f81841 > 0) {
                        iM559710 = (i14 - C0946.m55979("ۙ֫")) * (-49);
                        i3 = ((iM559710 ^ i15) * 22991) ^ (-1348601696);
                        i4 = -173973831;
                        i8 = iM559710 ^ i4;
                        c13457 = c13458;
                        i17 = i8;
                        i16 = i3;
                        c13458 = c13457;
                    } else {
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC14973M30605 = abstractC14973M30605;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        iM55979 = C0873.m55680("᩺᩺") ^ i14;
                        i = ((iM55979 ^ i15) * 13739) ^ 1123455335;
                        i2 = 1972213972;
                        int i27 = iM55979 ^ i2;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
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
                    c13458 = c13458;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC14973M30605 = abstractC14973M30605;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    i19 = s2 * s2;
                    i11 = 21353641;
                    if (!C0917.f81868) {
                        iM55979 = C0946.m55979("ۗᩴ") ^ i14;
                        i = ((iM55979 ^ i15) * 11901) ^ (-1302855170);
                        i2 = 238872652;
                        int i28 = iM55979 ^ i2;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
                        i17 = i28;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    }
                    abstractC14973M30605 = abstractC14973M30605;
                    int iM559715 = (C0946.m55979("۬۟") ^ i15) * (-83);
                    i = ((iM559715 ^ i14) * 2227) ^ (-1221989767);
                    i21 = i21;
                    sArr3 = sArr3;
                    c13458 = c13458;
                    i17 = iM559715 ^ (-28823339);
                    i23 = i23;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case -832475517:
                case 1431227556:
                    c13458 = c13458;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC14973M30605 = abstractC14973M30605;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    s2 = f81977[32];
                    if (C1071.m56343() != 0) {
                        iM55979 = C0873.m55680("᩺᩺") ^ i14;
                        i = ((iM55979 ^ i15) * 13739) ^ 1123455335;
                        i2 = 1972213972;
                    } else {
                        iM55979 = C0873.m55680("ᩳ۟") ^ i15;
                        i = ((iM55979 ^ i14) * (-10297)) ^ 622608488;
                        i2 = -2065108617;
                    }
                    int i29 = iM55979 ^ i2;
                    abstractC14973M30605 = abstractC14973M30605;
                    sArr3 = sArr3;
                    i21 = i21;
                    i23 = i23;
                    c13458 = c13458;
                    i17 = i29;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case -701763962:
                case 2001959124:
                    C1194.m56393(this.f17675, C1404.m56460(this.f17679));
                    i10++;
                    iM559710 = C0873.m55680("ۨܳ") ^ i14;
                    i3 = ((iM559710 ^ i15) * 24527) ^ 1701245149;
                    i4 = 1214667979;
                    i8 = iM559710 ^ i4;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case -552473287:
                case 290967161:
                    c13458 = c13458;
                    this.f17676 = C20689.m46750(j, strArr2.length);
                    if (zM55827) {
                        iM559710 = (C0946.m55979("ᩴ۟") + i15) * (-121);
                        i3 = ((iM559710 ^ i14) * 11801) ^ 1647168210;
                        i4 = 1348571869;
                    } else {
                        iM559710 = (C0946.m55979("ۡۧ") + i15) * 95;
                        i3 = ((iM559710 ^ i14) * 6871) ^ 1775417168;
                        i4 = 1568912917;
                    }
                    i8 = iM559710 ^ i4;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case -516254833:
                case 709127118:
                    z2 = false;
                    iM559710 = C0873.m55680("ۜ᩹") ^ i15;
                    i3 = ((iM559710 ^ i14) * 1025) ^ (-1171666294);
                    i4 = 470084890;
                    i8 = iM559710 ^ i4;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case -400438669:
                case 448704169:
                    C1048.m56305();
                    if (C0845.f81821 >= 0) {
                        iM559711 = (C0946.m55979("᩷ۘ") ^ i15) * (-51);
                        i = ((iM559711 ^ i14) * 6153) ^ (-6450027);
                        i5 = 1510877210;
                        i17 = iM559711 ^ i5;
                        i16 = i;
                    } else {
                        c13458 = c13458;
                        iM559710 = (i14 - C0873.m55680("۟᩻")) * 95;
                        i3 = ((iM559710 ^ i15) * (-16833)) ^ (-1236883931);
                        i4 = 1202463069;
                        i8 = iM559710 ^ i4;
                        c13457 = c13458;
                        i17 = i8;
                        i16 = i3;
                        c13458 = c13457;
                    }
                    break;
                case -356580044:
                case 2035687966:
                    if (!C4463.m9371(C0892.m55744(this.f17678), z).m9393()) {
                        iM559711 = C0946.m55979("֡᩸") ^ i15;
                        i = ((iM559711 ^ i14) * (-15135)) ^ 632238356;
                        i5 = -1549994110;
                        i17 = iM559711 ^ i5;
                        i16 = i;
                    } else {
                        c13458 = c13458;
                        iM559710 = (C0946.m55979("ᩴ۟") + i15) * (-121);
                        i3 = ((iM559710 ^ i14) * 11801) ^ 1647168210;
                        i4 = 1348571869;
                        i8 = iM559710 ^ i4;
                        c13457 = c13458;
                        i17 = i8;
                        i16 = i3;
                        c13458 = c13457;
                    }
                    break;
                case -304381319:
                case 477959107:
                    if (!RunnableC0897.f81856) {
                        c13458 = c13458;
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC14973M30605 = abstractC14973M30605;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        int iM559716 = C0946.m55979("۟ۜ") ^ i14;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
                        i17 = iM559716 ^ (-1796116631);
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = ((iM559716 ^ i15) * 24563) ^ (-1847783289);
                        this = this;
                    } else {
                        iM559711 = (C0946.m55979("᩷ۘ") ^ i15) * (-51);
                        i = ((iM559711 ^ i14) * 6153) ^ (-6450027);
                        i5 = 1510877210;
                        i17 = iM559711 ^ i5;
                        i16 = i;
                    }
                    break;
                case -71185015:
                case 1730417992:
                    if (C1012.f81938 >= 0) {
                        c13458 = c13458;
                        sArr2 = sArr2;
                        i21 = i21;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        int iM559717 = (C0946.m55979("۬۟") ^ i15) * (-83);
                        i = ((iM559717 ^ i14) * 2227) ^ (-1221989767);
                        i21 = i21;
                        sArr3 = sArr3;
                        c13458 = c13458;
                        i17 = iM559717 ^ (-28823339);
                        i23 = i23;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    } else {
                        c13458 = c13458;
                        sArr2 = sArr2;
                        i21 = i21;
                        abstractC14973M30605 = abstractC14973M30605;
                        strArr2 = strArr2;
                        i20 = i20;
                        i22 = i22;
                        i23 = i23;
                        sArr3 = sArr3;
                        int iM559718 = C0946.m55979("۟ۜ") ^ i14;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
                        i17 = iM559718 ^ (-1796116631);
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = ((iM559718 ^ i15) * 24563) ^ (-1847783289);
                        this = this;
                    }
                    break;
                case -62382806:
                case 1892169648:
                    z2 = true;
                    iM559710 = C0873.m55680("ۜ᩹") ^ i15;
                    i3 = ((iM559710 ^ i14) * 1025) ^ (-1171666294);
                    i4 = 470084890;
                    i8 = iM559710 ^ i4;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case 159313036:
                case 855155450:
                    C1053.m56327();
                    C0898.m55800();
                    c13458 = c13458;
                    iM559710 = (i14 - C0873.m55680("۟᩻")) * 95;
                    i3 = ((iM559710 ^ i15) * (-16833)) ^ (-1236883931);
                    i4 = 1202463069;
                    i8 = iM559710 ^ i4;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case 294858200:
                case 2058238608:
                    short[] sArr5 = sArr3;
                    int i30 = i22;
                    int i31 = i23;
                    String[] strArrM13494 = this.m13494(C0946.m55986(sArr5, i30, i31, i18));
                    C13457 c13457M13469 = m13469();
                    abstractC14973M30605 = c13457M13469.m30605();
                    if (C1404.f82149 >= 0) {
                        sArr3 = sArr5;
                        i23 = i31;
                        sArr2 = sArr2;
                        i20 = i20;
                        c13458 = c13457M13469;
                        i22 = i30;
                        strArr2 = strArrM13494;
                        i21 = i21;
                        int iM559719 = (C0946.m55979("۬۟") ^ i15) * (-83);
                        i = ((iM559719 ^ i14) * 2227) ^ (-1221989767);
                        i21 = i21;
                        sArr3 = sArr3;
                        c13458 = c13458;
                        i17 = iM559719 ^ (-28823339);
                        i23 = i23;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    } else {
                        int iM55682 = C0873.m55680("ܰۨ") ^ i15;
                        i16 = ((iM55682 ^ i14) * (-1471)) ^ 1884960654;
                        i17 = iM55682 ^ 999670545;
                        i22 = i30;
                        c13458 = c13457M13469;
                        sArr3 = sArr5;
                        i23 = i31;
                        strArr2 = strArrM13494;
                    }
                    break;
                case 542765663:
                case 1521565498:
                    i18 = 59689;
                    iM55979 = C0873.m55680("ۤۨ") ^ i14;
                    i = ((iM55979 ^ i15) * (-7043)) ^ (-1397766501);
                    i2 = -918269988;
                    int i210 = iM55979 ^ i2;
                    abstractC14973M30605 = abstractC14973M30605;
                    sArr3 = sArr3;
                    i21 = i21;
                    i23 = i23;
                    c13458 = c13458;
                    i17 = i210;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case 597406810:
                case 917908414:
                    c13458 = c13458;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC14973M30605 = abstractC14973M30605;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    zM55827 = C0912.m55827(this, C0845.m55592(sArr2, i20, i21, i18));
                    if (C0906.f81862 < 0) {
                        iM55979 = C0946.m55979("᩻ۨ") ^ i15;
                        i = ((iM55979 ^ i14) * (-5349)) ^ (-828978540);
                        i2 = -1270320916;
                        int i211 = iM55979 ^ i2;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
                        i17 = i211;
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = i;
                    } else {
                        int iM5597110 = C0946.m55979("۟ۜ") ^ i14;
                        abstractC14973M30605 = abstractC14973M30605;
                        sArr3 = sArr3;
                        i21 = i21;
                        i23 = i23;
                        c13458 = c13458;
                        i17 = iM5597110 ^ (-1796116631);
                        i22 = i22;
                        i20 = i20;
                        strArr2 = strArr2;
                        sArr2 = sArr2;
                        i16 = ((iM5597110 ^ i15) * 24563) ^ (-1847783289);
                        this = this;
                    }
                    break;
                case 776532247:
                case 1293698147:
                    c13458 = c13458;
                    this.f17679 = abstractC17043M38649;
                    this.mo13482(C0892.m55744(this.f17678));
                    j = i10;
                    if (C0927.f81875) {
                        iM559710 = (i14 - C0873.m55680("۟᩻")) * 95;
                        i3 = ((iM559710 ^ i15) * (-16833)) ^ (-1236883931);
                        i4 = 1202463069;
                    } else {
                        iM559710 = C0873.m55680("᩻۬") ^ i14;
                        i3 = ((iM559710 ^ i15) * 27993) ^ 1188713515;
                        i4 = 1365101813;
                    }
                    i8 = iM559710 ^ i4;
                    c13457 = c13458;
                    i17 = i8;
                    i16 = i3;
                    c13458 = c13457;
                    break;
                case 916777340:
                case 1676703338:
                    c13458 = c13458;
                    abstractC17043M38649 = abstractC17043M55623.m38649(C0890.m55726(sArr4, 51, 5, i18));
                    if (C0967.f81910 < 0) {
                        iM559710 = (i15 - C0873.m55680("֡ۢ")) * (-19);
                        i3 = ((iM559710 ^ i14) * 24355) ^ 1168988565;
                        i4 = -1139700447;
                        i8 = iM559710 ^ i4;
                        c13457 = c13458;
                        i17 = i8;
                        i16 = i3;
                        c13458 = c13457;
                    } else {
                        sArr = sArr2;
                        strArr = strArr2;
                        i6 = i21;
                        abstractC14973 = abstractC14973M30605;
                        int iM55683 = (C0873.m55680("۟۠") + i14) * 115;
                        i3 = ((iM55683 ^ i15) * (-11947)) ^ (-301695916);
                        i8 = iM55683 ^ 2116844421;
                        abstractC14973M30605 = abstractC14973;
                        i21 = i6;
                        strArr2 = strArr;
                        sArr2 = sArr;
                        this = this;
                        c13457 = c13458;
                        i17 = i8;
                        i16 = i3;
                        c13458 = c13457;
                    }
                    break;
                case 924469376:
                case 1191938373:
                    strArr = strArr2;
                    c13458 = c13458;
                    int i32 = i22;
                    int i33 = i23;
                    abstractC14973 = abstractC14973M30605;
                    short[] sArr6 = sArr3;
                    sArr = f81977;
                    i6 = 9;
                    if (C0930.f81879 <= 0) {
                        sArr3 = sArr6;
                        i23 = i33;
                        i22 = i32;
                        i20 = 33;
                        int iM55684 = (C0873.m55680("۟۠") + i14) * 115;
                        i3 = ((iM55684 ^ i15) * (-11947)) ^ (-301695916);
                        i8 = iM55684 ^ 2116844421;
                        abstractC14973M30605 = abstractC14973;
                        i21 = i6;
                        strArr2 = strArr;
                        sArr2 = sArr;
                        this = this;
                        c13457 = c13458;
                        i17 = i8;
                        i16 = i3;
                    } else {
                        int iM559720 = (C0946.m55979("֫ۧ") + i14) * 115;
                        i16 = ((iM559720 ^ i15) * 26615) ^ 2119197256;
                        strArr2 = strArr;
                        abstractC14973M30605 = abstractC14973;
                        sArr3 = sArr6;
                        i21 = 9;
                        sArr2 = sArr;
                        i23 = i33;
                        this = this;
                        i22 = i32;
                        i20 = 33;
                        c13457 = c13458;
                        i17 = iM559720 ^ (-834570431);
                    }
                    c13458 = c13457;
                    break;
                case 995979758:
                case 1733451195:
                    this.f17679.mo29990();
                    return C1003.m56126();
                case 1050692221:
                case 1245304220:
                    i18 = 15622;
                    iM55979 = C0873.m55680("ۤۨ") ^ i14;
                    i = ((iM55979 ^ i15) * (-7043)) ^ (-1397766501);
                    i2 = -918269988;
                    int i212 = iM55979 ^ i2;
                    abstractC14973M30605 = abstractC14973M30605;
                    sArr3 = sArr3;
                    i21 = i21;
                    i23 = i23;
                    c13458 = c13458;
                    i17 = i212;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                case 1097148426:
                case 1715265515:
                    C8741.m20214(this.f17678, this.f17679, c13458, z, c21559);
                    iM559711 = (C0873.m55680("᩷۠") + i14) * 51;
                    i = ((iM559711 ^ i15) * 31017) ^ 1528043442;
                    i5 = 1389402975;
                    i17 = iM559711 ^ i5;
                    i16 = i;
                    break;
                case 1284745015:
                case 1841860451:
                    c13458 = c13458;
                    sArr2 = sArr2;
                    i21 = i21;
                    abstractC14973M30605 = abstractC14973M30605;
                    strArr2 = strArr2;
                    i20 = i20;
                    i22 = i22;
                    i23 = i23;
                    sArr3 = sArr3;
                    int i34 = s2 + s;
                    if ((i34 * i34) - i12 <= 0) {
                        iM55979 = C0946.m55979("۫᩵") ^ i15;
                        i = ((iM55979 ^ i14) * 19435) ^ (-25652563);
                        i2 = -1180500710;
                    } else {
                        iM55979 = (C0946.m55979("ܽۨ") ^ i15) * (-13);
                        i = ((iM55979 ^ i14) * 32187) ^ 1192713834;
                        i2 = 278918673;
                    }
                    int i213 = iM55979 ^ i2;
                    abstractC14973M30605 = abstractC14973M30605;
                    sArr3 = sArr3;
                    i21 = i21;
                    i23 = i23;
                    c13458 = c13458;
                    i17 = i213;
                    i22 = i22;
                    i20 = i20;
                    strArr2 = strArr2;
                    sArr2 = sArr2;
                    i16 = i;
                    break;
                default:
                    if (C0949.m56007(this)) {
                        iM559711 = C0946.m55979("ۡܿ") ^ i15;
                        i = ((iM559711 ^ i14) * (-18471)) ^ (-280560199);
                        i5 = -22446486;
                    } else {
                        iM559711 = C0873.m55680("᩺ۡ") ^ i14;
                        i = ((iM559711 ^ i15) * (-14253)) ^ (-646906211);
                        i5 = 1483198268;
                    }
                    i17 = iM559711 ^ i5;
                    i16 = i;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        ArrayList arrayList = null;
        int i = 280057959;
        int i2 = C1012.f81938;
        int i3 = C0912.f81867;
        int iM55979 = C0946.m55979("֨ۢ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 9189) ^ (-774307213);
        int i5 = -131908501;
        while (true) {
            i = ((((i ^ i2) * (-16319)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2059622224:
                case 1457213379:
                    C0877.m55696();
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0946.m55979("ۢۙ") ^ i3) * 55;
                        i4 = ((iM55979 ^ i2) * 25223) ^ (-2109005610);
                        i5 = 1035813207;
                    } else {
                        iM55979 = (C0873.m55680("ۛۗ") + i3) * 77;
                        i4 = ((iM55979 ^ i2) * 427) ^ 134762948;
                        i5 = -1672917913;
                    }
                    break;
                case -1935003406:
                case 1247596560:
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("ܽۙ") + i3) * (-87);
                        i4 = ((iM55979 ^ i2) * 15645) ^ 1013944519;
                        i5 = 986681236;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۡܽ")) * 83;
                        i4 = ((iM55979 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    }
                    break;
                case -1861514040:
                case 1625633483:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("᩶ܺ") ^ i3) * 17;
                        i4 = ((iM55979 ^ i2) * (-13743)) ^ 1318037708;
                        i5 = 580018639;
                    } else {
                        iM55979 = (C0946.m55979("۠ܿ") ^ i3) * (-111);
                        i4 = ((iM55979 ^ i2) * (-21043)) ^ (-857373327);
                        i5 = 1220584660;
                    }
                    break;
                case -1587844743:
                case 410340230:
                    c18107.m41267();
                    c18107.m41226((Collection) arrayList);
                    c18107.m41241();
                    iM55979 = C0946.m55979("ۖ᩻") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-9017)) ^ 1878538798;
                    i5 = -1826144824;
                    break;
                case -1560968993:
                case 1814836139:
                    C1044.m56286();
                    if (C0989.f81920 < 0) {
                        iM55979 = (i2 - C0873.m55680("ۡܽ")) * 83;
                        i4 = ((iM55979 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    } else {
                        iM55979 = (C0946.m55979("ۢۙ") ^ i3) * 55;
                        i4 = ((iM55979 ^ i2) * 25223) ^ (-2109005610);
                        i5 = 1035813207;
                    }
                    break;
                case -1378163374:
                case 139136831:
                    C1012.m56134();
                    C0989.m56095();
                    iM55979 = (C0873.m55680("ۛۗ") + i3) * 77;
                    i4 = ((iM55979 ^ i2) * 427) ^ 134762948;
                    i5 = -1672917913;
                    break;
                case -1269615536:
                case -405177034:
                    if (m13478(c18107)) {
                        iM55979 = C0873.m55680("᩹ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7291)) ^ (-1680441702);
                        i5 = 340527500;
                    } else {
                        iM55979 = C0946.m55979("ۖ᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9017)) ^ 1878538798;
                        i5 = -1826144824;
                    }
                    break;
                case -1142337083:
                case 1544242280:
                    if (C1003.m56123() != 0) {
                        iM55979 = (i2 - C0873.m55680("ۡܽ")) * 83;
                        i4 = ((iM55979 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    } else {
                        iM55979 = (C0873.m55680("ۤ᩷") + i2) * 29;
                        i4 = ((iM55979 ^ i3) * 25339) ^ (-1680783398);
                        i5 = -477317276;
                    }
                    break;
                case -821082940:
                case 232792475:
                    if (C1929.m56553()) {
                        iM55979 = (C0873.m55680("ۛۗ") + i3) * 77;
                        i4 = ((iM55979 ^ i2) * 427) ^ 134762948;
                        i5 = -1672917913;
                    } else {
                        iM55979 = (C0946.m55979("֡ۤ") + i2) * 3;
                        i4 = ((iM55979 ^ i3) * (-21723)) ^ (-1711332730);
                        i5 = 479644403;
                    }
                    break;
                case -744080849:
                case -460931159:
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("ۛۗ") + i3) * 77;
                        i4 = ((iM55979 ^ i2) * 427) ^ 134762948;
                        i5 = -1672917913;
                    } else {
                        iM55979 = C0873.m55680("ܶ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-12899)) ^ 906058311;
                        i5 = -1559696710;
                    }
                    break;
                case -731489125:
                case -133215657:
                    C0967.m56074();
                    break;
                case -694545404:
                case 640911493:
                    break;
                case -524412352:
                case 381893210:
                    if (C1124.m56367() >= 0) {
                        iM55979 = (i2 - C0873.m55680("ۡܽ")) * 83;
                        i4 = ((iM55979 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23789) ^ 1205600195;
                        i5 = 1241649097;
                    }
                    break;
                case 61471570:
                case 1385273725:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0946.m55979("᩷ܶ") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * (-4445)) ^ 1472342631;
                        i5 = 1104468348;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩵") + i3) * (-105);
                        i4 = ((iM55979 ^ i2) * (-6017)) ^ 2073229549;
                        i5 = 2105768869;
                    }
                    break;
                case 164117153:
                case 899208226:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("᩶ܺ") ^ i3) * 17;
                        i4 = ((iM55979 ^ i2) * (-13743)) ^ 1318037708;
                        i5 = 580018639;
                    } else {
                        iM55979 = (C0946.m55979("ۖ۟") ^ i2) * 37;
                        i4 = ((iM55979 ^ i3) * 24089) ^ (-2044736181);
                        i5 = 1638536597;
                    }
                    break;
                case 370955431:
                case 942994661:
                    if (C1028.m56247() >= 0) {
                        iM55979 = (i2 - C0873.m55680("ۡܽ")) * 83;
                        i4 = ((iM55979 ^ i3) * 12975) ^ (-1173222461);
                        i5 = -477536761;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۚ᩷")) * (-93);
                        i4 = ((iM55979 ^ i2) * (-1135)) ^ 1006435210;
                        i5 = 1146645918;
                    }
                    break;
                case 469593115:
                case 1471114604:
                    if (C0947.f81895) {
                        iM55979 = (C0946.m55979("᩷ܶ") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * (-4445)) ^ 1472342631;
                        i5 = 1104468348;
                    } else {
                        iM55979 = (C0946.m55979("ۗۢ") ^ i2) * (-39);
                        i4 = ((iM55979 ^ i3) * 27655) ^ (-931718653);
                        i5 = 2133000465;
                    }
                    break;
                case 2019428429:
                case 2040205093:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0873.m55680("᩶ܺ") ^ i3) * 17;
                        i4 = ((iM55979 ^ i2) * (-13743)) ^ 1318037708;
                        i5 = 580018639;
                    } else {
                        iM55979 = (C0873.m55680("ۛۗ") + i3) * 77;
                        i4 = ((iM55979 ^ i2) * 427) ^ 134762948;
                        i5 = -1672917913;
                    }
                    break;
                default:
                    arrayList = this.f17675;
                    if (C1017.m56195(arrayList)) {
                        iM55979 = C0946.m55979("ۖ᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9017)) ^ 1878538798;
                        i5 = -1826144824;
                    } else {
                        iM55979 = (C0946.m55979("᩵ܿ") ^ i3) * (-93);
                        i4 = ((iM55979 ^ i2) * (-12153)) ^ 110550424;
                        i5 = -335906838;
                    }
                    break;
            }
            return;
        }
    }
}
