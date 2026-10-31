package l;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2495 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۫ۤ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f7945;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC5317 f7946;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f7947;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f7948;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12266 f7949;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f7950 = new ArrayList();

    static {
        ApplicationC12518.m30701(41);
        f7945 = new short[]{250, -17725, -17696, -17682, -17685, -17745, -17669, -17667, -17682, -17695, -17668, -17693, -17682, -17669, -17690, -17696, -17695, -17745, -17665, -17667, -17696, -17671, -17690, -17685, -17686, -17667, -17745, -17687, -17682, -17690, -17693, -17686, -17685, -17683, -17690, -17695, -17759, -17694, -17669, -17759, -17665, -17693, -17670, -17688, -17690, -17695, -17759, -17668, -17674, -17668, -17669, -17686, -17694};
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public native void mo1006();

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public native void mo1009();

    public C2495(DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317, AbstractActivityC12266 abstractActivityC12266, View view) {
        this.f7946 = dialogInterfaceOnDismissListenerC5317;
        this.f7949 = abstractActivityC12266;
        this.f7947 = view;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f7946.f16590 = true;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f7946.f16590 = false;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01b1 A[PHI: r2 r7 r13 r14
      0x01b1: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:49:0x01af, B:29:0x00c3, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:49:0x01af, B:29:0x00c3, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:49:0x01af, B:29:0x00c3, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:49:0x01af, B:29:0x00c3, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01e8 A[PHI: r5 r6 r10 r11 r12
      0x01e8: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:53:0x01e6, B:34:0x00fd, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:53:0x01e6, B:34:0x00fd, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:53:0x01e6, B:34:0x00fd, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:53:0x01e6, B:34:0x00fd, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:53:0x01e6, B:34:0x00fd, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0271 A[PHI: r4
      0x0271: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char) binds: [B:65:0x026f, B:57:0x021c, B:15:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (l.C4159.f13567 == false) goto L14;
     */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1007(Exception exc) {
        int iM6981;
        int i;
        int i2;
        exc = exc;
        int i3 = C2167.f7158;
        int i4 = C3683.f11629;
        int iM6982 = C2105.m6981("ۗۤ") ^ i3;
        int i5 = ((iM6982 ^ i4) * 32613) ^ 607197978;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM6982 ^ 815686513;
        String strM50602 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -673555824;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-23853)) >> 31));
            switch (i13) {
                case -1787648428:
                case -32932676:
                    break;
                case -1688519543:
                case -515182552:
                    sArr = f7945;
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ۙ᩺") + i3) * (-13);
                        i = ((iM6981 ^ i4) * 27361) ^ (-593187885);
                        i2 = -2146364409;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܿ۬")) * (-29);
                        i = ((iM6981 ^ i3) * (-28773)) ^ 720101373;
                        i2 = -1529920750;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1611843209:
                case 1772625766:
                    i9 = 47759;
                    iM6981 = C2105.m6981("ۚ᩺") ^ i3;
                    i = ((iM6981 ^ i4) * (-19965)) ^ 350760257;
                    i2 = 382248655;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1387972418:
                case -279407387:
                    s2 = 9686;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C2105.m6981("ۨ֫") ^ i4;
                        i = ((iM6981 ^ i3) * 25167) ^ 189499976;
                        i2 = 291246304;
                    } else {
                        iM6981 = C2105.m6981("ۘۨ") ^ i3;
                        i = ((iM6981 ^ i4) * (-8567)) ^ (-1671947858);
                        i2 = -1495107852;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1383100414:
                case 1555531362:
                    i9 = 33080;
                    iM6981 = C2105.m6981("ۚ᩺") ^ i3;
                    i = ((iM6981 ^ i4) * (-19965)) ^ 350760257;
                    i2 = 382248655;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1316168450:
                case -438629682:
                    AbstractC2021.m6574();
                    if (C1005.m3501()) {
                        iM6981 = (C2105.m6981("᩸ۘ") ^ i4) * (-55);
                        i = ((iM6981 ^ i3) * (-10503)) ^ 1122436371;
                        i2 = -1989716215;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    }
                    iM6981 = (C2105.m6981("ۙ᩺") + i3) * (-13);
                    i = ((iM6981 ^ i4) * 27361) ^ (-593187885);
                    i2 = -2146364409;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1077130581:
                case 409225111:
                    C7811.m20844();
                    if (C3746.m11369() < 0) {
                        iM6981 = C2105.m6981("ۨ֫") ^ i4;
                        i = ((iM6981 ^ i3) * 25167) ^ 189499976;
                        i2 = 291246304;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    }
                    iM6981 = C0630.m2566("۬֡") ^ i3;
                    i = ((iM6981 ^ i4) * (-4597)) ^ 948423527;
                    i2 = -1588275825;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1068149410:
                case -372755014:
                    if (C11340.m28031()) {
                        iM6981 = (i3 - C2105.m6981("ۨۛ")) * (-41);
                        i = ((iM6981 ^ i4) * 2673) ^ (-1406982887);
                        i2 = -1440887716;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۘ") ^ i4) * (-55);
                        i = ((iM6981 ^ i3) * (-10503)) ^ 1122436371;
                        i2 = -1989716215;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -811678711:
                case 1925916361:
                    sArr2 = f7945;
                    i10 = 1;
                    i11 = 32;
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("۬֡") ^ i3;
                        i = ((iM6981 ^ i4) * (-4597)) ^ 948423527;
                        i2 = -1588275825;
                    } else {
                        iM6981 = C2105.m6981("֫۠") ^ i4;
                        i = ((iM6981 ^ i3) * 1129) ^ 1480014620;
                        i2 = -590995806;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -548604982:
                case 1878107843:
                    s = sArr[c];
                    i7 = s * s;
                    if (AbstractC2021.m6574()) {
                        iM6981 = C0630.m2566("۬֡") ^ i3;
                        i = ((iM6981 ^ i4) * (-4597)) ^ 948423527;
                        i2 = -1588275825;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۠ᩳ")) * 53;
                        i = ((iM6981 ^ i4) * (-8991)) ^ 57912245;
                        i2 = -1818276536;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -394919886:
                case 793603437:
                    c = 0;
                    if (C3432.m10477() <= 0) {
                        iM6981 = (C2105.m6981("᩸ۘ") ^ i4) * (-55);
                        i = ((iM6981 ^ i3) * (-10503)) ^ 1122436371;
                        i2 = -1989716215;
                    } else {
                        iM6981 = C2105.m6981("۟۫") ^ i4;
                        i = ((iM6981 ^ i3) * 13539) ^ (-2082126436);
                        i2 = 734783947;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -220406040:
                case 564019032:
                    C15297.m36311(RunnableC1937.m6385(sArr3, i12, 20, i9), strM50602, exc);
                    if (RunnableC1108.m3790()) {
                        iM6981 = C2105.m6981("ۨ֫") ^ i4;
                        i = ((iM6981 ^ i3) * 25167) ^ 189499976;
                        i2 = 291246304;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM6983 = C2105.m6981("ܳᩴ") ^ i4;
                        i6 = iM6983 ^ (-2073966691);
                        i5 = ((iM6983 ^ i3) * (-23557)) ^ (-36396553);
                    }
                    break;
                case 794082105:
                case 1990186562:
                    C1711.m5736();
                    break;
                case 857948104:
                case 1894186961:
                    C4075.m12246(this.f7949, exc, null);
                    break;
                case 1288478047:
                case 2142511554:
                    if ((s * s2) - i8 > 0) {
                        iM6981 = (C0630.m2566("֫ܽ") ^ i3) * (-61);
                        i = ((iM6981 ^ i4) * (-29997)) ^ (-311068189);
                        i2 = 1791261982;
                    } else {
                        iM6981 = (C0630.m2566("ۚ᩹") ^ i4) * (-71);
                        i = ((iM6981 ^ i3) * (-32361)) ^ (-1565868211);
                        i2 = -1318268843;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1587804624:
                case 1831216935:
                    i8 = i7 + 23454649;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۨ֨") ^ i3;
                        i = ((iM6981 ^ i4) * (-8479)) ^ (-923835241);
                        i2 = -1053683599;
                    } else {
                        iM6981 = C2105.m6981("ܺᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * 7837) ^ (-281425450);
                        i2 = 1505887017;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1750934548:
                case 1853947456:
                    sArr3 = f7945;
                    i12 = 33;
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("ۨ֨") ^ i3;
                        i = ((iM6981 ^ i4) * (-8479)) ^ (-923835241);
                        i2 = -1053683599;
                    } else {
                        iM6981 = C0630.m2566("ۙ᩻") ^ i3;
                        i = ((iM6981 ^ i4) * (-32273)) ^ 362242007;
                        i2 = -121086532;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 2013431196:
                case 2067277585:
                    RunnableC0588.m2441();
                    iM6981 = (C2105.m6981("ۙ᩺") + i3) * (-13);
                    i = ((iM6981 ^ i4) * 27361) ^ (-593187885);
                    i2 = -2146364409;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM50602 = C22628.m50602(sArr2, i10, i11, i9);
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ۨ֨") ^ i3;
                        i = ((iM6981 ^ i4) * (-8479)) ^ (-923835241);
                        i2 = -1053683599;
                    } else {
                        iM6981 = (C0630.m2566("ۛۢ") ^ i4) * 5;
                        i = ((iM6981 ^ i3) * (-32101)) ^ (-1174502456);
                        i2 = -1359044442;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
