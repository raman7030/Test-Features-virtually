package l;

import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G1XN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10012 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩶ۘ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f30153 = {630, 6729, -4543, -3747, 6868, 20177, 20190, 20187, 20178, 20102, 20177, 20190, 20187, 20178, 20101, 20190, 20164, 20211, 20178, 20175, 20209, 20190, 20187, 20178, 20180, 20191, 20182, 20185, 20176, 20178, 20179, 20195, 20174, 20167, 20178, 20164, 20180, 20191, 20182, 20185, 20176, 20178, 20179, 20211, 20178, 20175, 20178, 20164};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22711 f30154;

    public C10012(ActivityC22711 activityC22711) {
        this.f30154 = activityC22711;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C3019.m9260(this, this.f30154);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e7 A[PHI: r5 r6
      0x00e7: PHI (r5v4 l.ܰܳۡ) = (r5v3 l.ܰܳۡ), (r5v2 l.ܰܳۡ) binds: [B:31:0x00e5, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r6v4 java.util.ArrayList) = (r6v3 java.util.ArrayList), (r6v2 java.util.ArrayList) binds: [B:31:0x00e5, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0184 A[PHI: r1
      0x0184: PHI (r1v5 int) = (r1v4 int), (r1v2 int) binds: [B:43:0x0182, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01b0 A[PHI: r8
      0x01b0: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:17:0x0074, B:15:0x0070, B:9:0x0064, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x027e A[PHI: r2 r3 r7 r11 r12 r13 r14 r15 r16 r21
      0x027e: PHI (r2v4 l.᩺ۖ᩷) = (r2v2 l.᩺ۖ᩷), (r2v2 l.᩺ۖ᩷), (r2v2 l.᩺ۖ᩷), (r2v2 l.᩺ۖ᩷), (r2v2 l.᩺ۖ᩷), (r2v2 l.᩺ۖ᩷), (r2v2 l.᩺ۖ᩷), (r2v6 l.᩺ۖ᩷) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r3v4 l.ۖۢۡ) = (r3v2 l.ۖۢۡ), (r3v2 l.ۖۢۡ), (r3v2 l.ۖۢۡ), (r3v2 l.ۖۢۡ), (r3v2 l.ۖۢۡ), (r3v2 l.ۖۢۡ), (r3v2 l.ۖۢۡ), (r3v7 l.ۖۢۡ) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r7v5 l.ܰܳۡ) = (r7v2 l.ܰܳۡ), (r7v2 l.ܰܳۡ), (r7v2 l.ܰܳۡ), (r7v2 l.ܰܳۡ), (r7v3 l.ܰܳۡ), (r7v2 l.ܰܳۡ), (r7v2 l.ܰܳۡ), (r7v2 l.ܰܳۡ) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r11v5 short) = (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r12v5 short) = (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r15v5 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r16v5 short[]) = 
      (r16v3 short[])
      (r16v2 short[])
      (r16v2 short[])
      (r16v2 short[])
      (r16v2 short[])
      (r16v2 short[])
      (r16v2 short[])
      (r16v2 short[])
     binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r21v6 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:64:0x027c, B:60:0x025c, B:56:0x023a, B:27:0x00ba, B:23:0x0098, B:15:0x0070, B:12:0x006a, B:87:0x027e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM2566;
        int i;
        int i2;
        int i3 = C7811.f24123;
        int i4 = RunnableC3474.f10992;
        int iM6981 = (C2105.m6981("ۧܶ") + i3) * (-127);
        int i5 = ((iM6981 ^ i4) * (-22785)) ^ 1870151875;
        short[] sArr = null;
        int i6 = iM6981 ^ (-1001164004);
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -616879812;
        char c = 0;
        String strM8030 = null;
        C13876 c13876 = null;
        ArrayList arrayList = null;
        C13876 c13877 = null;
        C13876 c13878 = null;
        C2447 c2447 = null;
        ActivityC22711 activityC22711 = null;
        int iM2567 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-27075)) >> 31));
            switch (i11) {
                case -2008762724:
                case -1944751115:
                    i8 = s * s2;
                    i9 = s * s;
                    i10 = 46036225;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("۟ܰ") + i3) * (-91);
                        i = ((iM2566 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۚۨ")) * 33;
                        i = ((iM2566 ^ i4) * (-7735)) ^ (-1810207720);
                        i2 = 71113530;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1885994727:
                case -361204019:
                    c13878 = new C13876();
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("ܶ۬") + i3) * 11;
                        i = ((iM2566 ^ i4) * 13633) ^ 458230494;
                        i2 = 2125894541;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۢۡ")) * (-55);
                        i = ((iM2566 ^ i3) * (-8939)) ^ 1174758039;
                        i2 = -1993700111;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1661247730:
                case -1350672994:
                    i7 = 10788;
                    iM2566 = C2105.m6981("֡ܺ") ^ i3;
                    i = ((iM2566 ^ i4) * (-4333)) ^ 379238275;
                    i2 = 139483567;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1634539650:
                case 979781164:
                    c13876.m33258((InterfaceC8233) activityC22711);
                    ViewOnClickListenerC1958.m6442(c2447, activityC22711.f73373);
                    break;
                case -1616542313:
                case 864695404:
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("۬ۚ") + i4) * 5;
                        i = ((iM2566 ^ i3) * 14211) ^ 1669635781;
                        i2 = 1177093020;
                    } else {
                        iM2566 = (C0630.m2566("۟ܰ") + i3) * (-91);
                        i = ((iM2566 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1547409780:
                case 2104693866:
                    sArr = f30153;
                    c = 0;
                    if (C1420.m4913()) {
                        iM2566 = (C0630.m2566("۟ܰ") + i3) * (-91);
                        i = ((iM2566 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM2566 = C0630.m2566("ۡ֨") ^ i3;
                        i = ((iM2566 ^ i4) * (-16879)) ^ 1941958143;
                        i2 = -1720308457;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1400623842:
                case -1264388425:
                    activityC22711 = this.f30154;
                    c2447 = (C2447) C4263.m12813(activityC22711, iM2567);
                    if (C0382.f1805) {
                        int iM6982 = C2105.m6981("᩹ۘ") ^ i3;
                        i5 = ((iM6982 ^ i4) * 14153) ^ (-1532309591);
                        i6 = iM6982 ^ 1535871221;
                    } else {
                        iM2566 = (C0630.m2566("۟ܰ") + i3) * (-91);
                        i = ((iM2566 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1347202021:
                case -400059746:
                    C3663.m11168();
                    break;
                case -1305610629:
                case 386235032:
                    c13877.m33252(1, arrayList);
                    if (C2126.m7040()) {
                        iM2566 = (C0630.m2566("۟ܰ") + i3) * (-91);
                        i = ((iM2566 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM2566 = (C0630.m2566("᩵ۨ") ^ i3) * 71;
                        i = ((iM2566 ^ i4) * (-19877)) ^ (-540032223);
                        i2 = -1432606313;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1272428885:
                case 48466692:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("۟ܰ") + i3) * (-91);
                        i = ((iM2566 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM2566 = C2105.m6981("ܺܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-28083)) ^ (-1456423975);
                        i2 = 1382030977;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1130805355:
                case 679883447:
                    s = sArr[c];
                    s2 = 13570;
                    if (C0630.m2564()) {
                        iM2566 = (C0630.m2566("۟ܰ") + i3) * (-91);
                        i = ((iM2566 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM2566 = C2105.m6981("᩺᩵") ^ i4;
                        i = ((iM2566 ^ i3) * (-19903)) ^ 651709304;
                        i2 = -374524918;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -762786860:
                case 268356924:
                    C0050.m940();
                    C7811.m20844();
                    iM2566 = (C0630.m2566("۬ۚ") + i4) * 5;
                    i = ((iM2566 ^ i3) * 14211) ^ 1669635781;
                    i2 = 1177093020;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -606801262:
                case -219133058:
                    C3245.m9925();
                    if (C1504.f5354) {
                        iM2566 = (C0630.m2566("۬ۚ") + i4) * 5;
                        i = ((iM2566 ^ i3) * 14211) ^ 1669635781;
                        i2 = 1177093020;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩹") ^ i4;
                        i = ((iM2566 ^ i3) * 7147) ^ 1774837612;
                        i2 = -708680347;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -338677213:
                case -263546001:
                    if (i8 - (i9 + i10) <= 0) {
                        iM2566 = (i4 - C0630.m2566("ܰ֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i3) * (-9969)) ^ 1896515605;
                        i2 = -1770684613;
                    } else {
                        iM2566 = C0630.m2566("ᩳۗ") ^ i4;
                        i = ((iM2566 ^ i3) * (-30249)) ^ 1028702258;
                        i2 = -828921097;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -264789797:
                case 47091201:
                    activityC22711.f73373.m33259((InterfaceC15287) activityC22711);
                    c13876 = activityC22711.f73373;
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C0630.m2566("۟ܰ") + i3) * (-91);
                        i = ((iM2566 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM2566 = C2105.m6981("۬ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-6785)) ^ (-868415811);
                        i2 = 795017026;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 80818087:
                case 751779545:
                    iM2567 = 2124274870 ^ C0630.m2566(strM8030);
                    if (C3746.m11369() >= 0) {
                        iM2566 = C0630.m2566("ۖ᩹") ^ i4;
                        i = ((iM2566 ^ i3) * 7147) ^ 1774837612;
                        i2 = -708680347;
                    } else {
                        iM2566 = C2105.m6981("ۚۜ") ^ i4;
                        i = ((iM2566 ^ i3) * 13923) ^ 992186961;
                        i2 = -716644264;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 178684981:
                case 2140646831:
                    activityC22711.f73373 = c13878;
                    c13877 = activityC22711.f73373;
                    arrayList = activityC22711.f73372.f34165;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ܺܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-28083)) ^ (-1456423975);
                        i2 = 1382030977;
                    } else {
                        iM2566 = (C2105.m6981("ܽܶ") + i4) * 23;
                        i = ((iM2566 ^ i3) * (-11871)) ^ (-558481970);
                        i2 = 2113978161;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 511895413:
                case 697494018:
                    i7 = 32245;
                    iM2566 = C2105.m6981("֡ܺ") ^ i3;
                    i = ((iM2566 ^ i4) * (-4333)) ^ 379238275;
                    i2 = 139483567;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM8030 = C2520.m8030(f30153, 1, 3, i7);
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("۬ۚ") + i4) * 5;
                        i = ((iM2566 ^ i3) * 14211) ^ 1669635781;
                        i2 = 1177093020;
                    } else {
                        iM2566 = C2105.m6981("ۢ۠") ^ i3;
                        i = ((iM2566 ^ i4) * (-9673)) ^ (-1842196238);
                        i2 = -1656805472;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC22711 activityC22711 = null;
        int i = 724845425;
        int i2 = C0714.f2697;
        int i3 = C3432.f10845;
        int iM6981 = (C2105.m6981("ۨۜ") ^ i2) * 75;
        int i4 = ((iM6981 ^ i3) * (-28323)) ^ (-1907211344);
        int i5 = 478767469;
        while (true) {
            i = ((((i ^ i3) * 21695) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1835299420:
                case 1918249084:
                    C1504.m5179();
                    C1773.m5908();
                    iM6981 = C0630.m2566("ۜۘ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-24583)) ^ 1219625504;
                    i5 = -885926341;
                    break;
                case -1530780386:
                case 619305985:
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("᩶ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2645)) ^ 1005243649;
                        i5 = -952025622;
                    } else {
                        iM6981 = C0630.m2566("᩹᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31835) ^ (-749918093);
                        i5 = 523610036;
                    }
                    break;
                case -1513458878:
                case 802333880:
                    activityC22711.m10224((Throwable) exc, true);
                    break;
                case -1452856471:
                case 2082049950:
                    if (C1711.m5736() <= 0) {
                        iM6981 = C0630.m2566("ۜۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24583)) ^ 1219625504;
                        i5 = -885926341;
                    } else {
                        iM6981 = (C0630.m2566("ܺܿ") + i2) * 15;
                        i4 = ((iM6981 ^ i3) * 635) ^ 1215389508;
                        i5 = -517938544;
                    }
                    break;
                case -1440566398:
                case -968472904:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C2105.m6981("۫֫") + i3) * 41;
                        i4 = ((iM6981 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1345)) ^ 1301110121;
                        i5 = 23494939;
                    }
                    break;
                case -1378472146:
                case -569629119:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("۫֫") + i3) * 41;
                        i4 = ((iM6981 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21189)) ^ 2108905173;
                        i5 = -1431962217;
                    }
                    break;
                case -1267595341:
                case -632096815:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C2105.m6981("۫֫") + i3) * 41;
                        i4 = ((iM6981 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM6981 = (C2105.m6981("ۧ۫") + i2) * (-47);
                        i4 = ((iM6981 ^ i3) * (-31369)) ^ (-1892347332);
                        i5 = -590481798;
                    }
                    break;
                case -1078301079:
                case -842087756:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C2105.m6981("۫֫") + i3) * 41;
                        i4 = ((iM6981 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM6981 = C0630.m2566("ܺۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31145) ^ 405779971;
                        i5 = -851523199;
                    }
                    break;
                case -704820149:
                case 1872186242:
                    C0714.m2805();
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("ۙᩴ") ^ i2) * 95;
                        i4 = ((iM6981 ^ i3) * (-12439)) ^ (-1130277551);
                        i5 = -1637932147;
                    } else {
                        iM6981 = (C2105.m6981("۫֫") + i3) * 41;
                        i4 = ((iM6981 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    }
                    break;
                case -617961130:
                case 1168192302:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C2105.m6981("۫֫") + i3) * 41;
                        i4 = ((iM6981 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM6981 = (C2105.m6981("ܰᩳ") ^ i3) * (-113);
                        i4 = ((iM6981 ^ i2) * 16641) ^ (-179795921);
                        i5 = 1845346651;
                    }
                    break;
                case -506381121:
                case 2016048200:
                    activityC22711 = this.f30154;
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("ۚ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6221)) ^ 881829439;
                        i5 = -628897107;
                    } else {
                        iM6981 = C0630.m2566("۟᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23599)) ^ (-1382925751);
                        i5 = 730170921;
                    }
                    break;
                case -49410264:
                case 698005607:
                    C0483.m2121();
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("᩶ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2645)) ^ 1005243649;
                        i5 = -952025622;
                    } else {
                        iM6981 = C0630.m2566("ۜۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24583)) ^ 1219625504;
                        i5 = -885926341;
                    }
                    break;
                case 60575915:
                case 1227565352:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("ۙᩴ") ^ i2) * 95;
                        i4 = ((iM6981 ^ i3) * (-12439)) ^ (-1130277551);
                        i5 = -1637932147;
                    } else {
                        iM6981 = (C0630.m2566("ۛܽ") ^ i2) * (-63);
                        i4 = ((iM6981 ^ i3) * 10897) ^ (-1529062305);
                        i5 = -1073841871;
                    }
                    break;
                case 191855995:
                case 1165891418:
                    AbstractC2021.m6574();
                    C11340.m28031();
                    break;
                case 1076536900:
                case 1375005207:
                    C0714.m2805();
                    if (!C4159.f13567) {
                        iM6981 = C0630.m2566("ۜۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24583)) ^ 1219625504;
                        i5 = -885926341;
                    } else {
                        iM6981 = (C2105.m6981("۫֫") + i3) * 41;
                        i4 = ((iM6981 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    }
                    break;
                default:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("ۙᩴ") ^ i2) * 95;
                        i4 = ((iM6981 ^ i3) * (-12439)) ^ (-1130277551);
                        i5 = -1637932147;
                    } else {
                        iM6981 = (C0630.m2566("ۙ᩸") ^ i3) * 29;
                        i4 = ((iM6981 ^ i2) * 21651) ^ 1330757551;
                        i5 = 1021508722;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        int iM2566;
        int i;
        int i2;
        int i3;
        int i4;
        int iM6981;
        int i5;
        C7980 c7980;
        C7980 c7981;
        int iM6982;
        int i6;
        int i7;
        C7980 c7982;
        int i8;
        int iM2567;
        int i9;
        int i10;
        int iM2568;
        int i11;
        int i12;
        int i13;
        C7980 c7983;
        HashMap map;
        AbstractC15440 abstractC15440;
        int iM2569;
        int i14;
        int iM25610;
        int i15;
        int i16;
        int i17;
        HashMap map2 = null;
        HashMap map3 = null;
        ArrayList<String> stringArrayListExtra = null;
        HashSet hashSet = null;
        C18090 c18090 = null;
        Throwable th = null;
        C7980 c7984 = null;
        Iterator itM12354 = null;
        boolean zM5910 = false;
        Iterator itM7037 = null;
        boolean zM2123 = false;
        Iterator itM12568 = null;
        C7980 c7985 = null;
        boolean zM5911 = false;
        boolean zM13546 = false;
        C7980 c7986 = null;
        boolean zM13547 = false;
        int i18 = -467030469;
        int i19 = C0483.f2088;
        int i20 = C4263.f13799;
        int iM25611 = (C0630.m2566("᩷ܽ") ^ i19) * (-101);
        int i21 = ((iM25611 ^ i20) * 16535) ^ 483035376;
        int i22 = iM25611 ^ 191941401;
        AbstractC15440 abstractC15441 = null;
        ArrayList<String> arrayList = null;
        Iterator itM7038 = null;
        C18090 c18091 = null;
        Object obj = null;
        boolean z = false;
        int i23 = 0;
        int i24 = 0;
        boolean zM5912 = false;
        ActivityC22711 activityC22711 = null;
        int i25 = 0;
        AbstractC15440 abstractC15442 = null;
        Throwable th2 = null;
        Iterator itM9029 = null;
        Object obj2 = null;
        Iterator itM7039 = null;
        C3545 c3545M7156 = null;
        C7980 c7987 = null;
        C3545 c3545M2803 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i20) * 21915) >> 31));
            switch (i18) {
                case -2139285774:
                case -600630615:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    abstractC15442 = abstractC15442;
                    c7987 = c7987;
                    C1128.m3856(map2, C3663.m11174(c7987), c7987);
                    map2 = map2;
                    iM2568 = C2105.m6981("ܽ۠") ^ i20;
                    i11 = ((iM2568 ^ i19) * 3033) ^ 286067775;
                    i12 = 136529563;
                    int i26 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i26;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case -2120977962:
                case 1436917094:
                    c7983 = c7985;
                    C0714.m2815(th, obj);
                    map = map3;
                    c7984 = c7984;
                    abstractC15440 = abstractC15442;
                    z = z ? 1 : 0;
                    iM2569 = C0630.m2566("ۛ᩻") ^ i20;
                    i13 = ((iM2569 ^ i19) * (-19787)) ^ 1077101993;
                    i14 = 2014383096;
                    int i27 = iM2569 ^ i14;
                    abstractC15442 = abstractC15440;
                    map3 = map;
                    c7985 = c7983;
                    i22 = i27;
                    i21 = i13;
                    z = z;
                    c7984 = c7984;
                    break;
                case -2087941755:
                case -75709169:
                    map2 = map2;
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    abstractC15442 = abstractC15442;
                    C7980 c7988 = (C7980) C2272.m7513(itM7038);
                    if (!C7811.m20834(hashSet, C3663.m11174(c7988))) {
                        c7987 = c7988;
                        iM2568 = C2105.m6981("ܽ۠") ^ i20;
                        i11 = ((iM2568 ^ i19) * 3033) ^ 286067775;
                        i12 = 136529563;
                        int i28 = iM2568 ^ i12;
                        abstractC15442 = abstractC15442;
                        map3 = map3;
                        c7985 = c7985;
                        i22 = i28;
                        i21 = i11;
                        map2 = map2;
                        c7987 = c7987;
                        z = z;
                        c7984 = c7984;
                    } else {
                        int iM6983 = C2105.m6981("ۧۗ") ^ i20;
                        i13 = ((iM6983 ^ i19) * 28697) ^ (-1954881576);
                        abstractC15442 = abstractC15442;
                        map3 = map3;
                        c7985 = c7985;
                        i22 = iM6983 ^ (-1272847606);
                        map2 = map2;
                        c7987 = c7988;
                        i21 = i13;
                        z = z;
                        c7984 = c7984;
                    }
                    break;
                case -2055621403:
                case 168713037:
                    c7981 = c7986;
                    if (zM13547) {
                        iM6981 = (i19 - C2105.m6981("ۢ۠")) * 9;
                        c7986 = c7981;
                        i = ((iM6981 ^ i20) * (-3277)) ^ 262199213;
                        i5 = 1289468676;
                        i22 = iM6981 ^ i5;
                        i21 = i;
                    }
                    c7986 = c7981;
                    iM2566 = (C0630.m2566("۫ܽ") ^ i20) * 69;
                    i = ((iM2566 ^ i19) * (-18557)) ^ (-1210594682);
                    i2 = -151802779;
                    i3 = iM2566 ^ i2;
                    c7985 = c7985;
                    i22 = i3;
                    i21 = i;
                    break;
                case -2042042559:
                case 2052572408:
                    activityC22711.f73372.f34165 = stringArrayListExtra;
                    activityC22711.f73372.f34166 = z;
                    return;
                case -1991495035:
                case 835945118:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    try {
                        c3545M2803 = C0714.m2803(c18090, (String) RunnableC1108.m3791(itM9029));
                        iM25610 = C0630.m2566("ܿۗ") ^ i19;
                        i15 = ((iM25610 ^ i20) * (-6271)) ^ (-734715391);
                        i16 = -1979855248;
                        i17 = iM25610 ^ i16;
                        c7984 = c7984;
                        c7982 = c7985;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c7985 = c7982;
                    } catch (Throwable th3) {
                        th = th3;
                        map2 = map2;
                        iM2568 = C0630.m2566("֨ۤ") ^ i19;
                        i11 = ((iM2568 ^ i20) * 7747) ^ 11626422;
                        i12 = -807276761;
                        int i29 = iM2568 ^ i12;
                        abstractC15442 = abstractC15442;
                        map3 = map3;
                        c7985 = c7985;
                        i22 = i29;
                        i21 = i11;
                        map2 = map2;
                        c7987 = c7987;
                        z = z;
                        c7984 = c7984;
                    }
                    break;
                case -1950753583:
                case 385809992:
                    itM12568 = C4159.m12568((AbstractC18605) C3432.m10491(C12918.m31380(C3663.m11163(c18091, c3545M7156))));
                    iM2566 = (C0630.m2566("۫ܽ") ^ i20) * 69;
                    i = ((iM2566 ^ i19) * (-18557)) ^ (-1210594682);
                    i2 = -151802779;
                    i3 = iM2566 ^ i2;
                    c7985 = c7985;
                    i22 = i3;
                    i21 = i;
                    break;
                case -1938736213:
                case 281153304:
                    c7984 = c7984;
                    c7983 = c7985;
                    map = map3;
                    z = z ? 1 : 0;
                    abstractC15440 = abstractC15442;
                    try {
                        C2520.m8028(c18090);
                        iM2569 = C0630.m2566("ۛ᩻") ^ i20;
                        i13 = ((iM2569 ^ i19) * (-19787)) ^ 1077101993;
                        i14 = 2014383096;
                        int i210 = iM2569 ^ i14;
                        abstractC15442 = abstractC15440;
                        map3 = map;
                        c7985 = c7983;
                        i22 = i210;
                        i21 = i13;
                        z = z;
                        c7984 = c7984;
                    } catch (Throwable th4) {
                        int iM6984 = (i19 - C2105.m6981("ۜۖ")) * 85;
                        int i30 = ((iM6984 ^ i20) * (-6867)) ^ (-835499711);
                        abstractC15442 = abstractC15440;
                        map3 = map;
                        c7985 = c7983;
                        i22 = iM6984 ^ (-1746477397);
                        z = z ? 1 : 0;
                        c7984 = c7984;
                        i4 = i30;
                        obj = th4;
                        i21 = i4;
                    }
                    break;
                case -1930977131:
                case 217114595:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    map2 = map2;
                    AbstractC15440 abstractC15443 = abstractC15441;
                    c18090 = new C18090(abstractC15443);
                    iM2568 = (i19 - C0630.m2566("ܳ᩺")) * 49;
                    abstractC15441 = abstractC15443;
                    i11 = ((iM2568 ^ i20) * (-21391)) ^ 2037623181;
                    i12 = -874947556;
                    int i211 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i211;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case -1837432906:
                case 296213734:
                    c7985 = c7985;
                    map3 = map3;
                    c7984 = (C7980) C2272.m7513(itM7039);
                    if (!C4616.m13546(hashSet, C1504.m5165(c7984))) {
                        c7984 = c7984;
                        iM2568 = (C2105.m6981("ۢ۟") + i20) * 63;
                        i11 = ((iM2568 ^ i19) * 8567) ^ 1438549476;
                        i12 = -1995961042;
                        int i212 = iM2568 ^ i12;
                        abstractC15442 = abstractC15442;
                        map3 = map3;
                        c7985 = c7985;
                        i22 = i212;
                        i21 = i11;
                        map2 = map2;
                        c7987 = c7987;
                        z = z;
                        c7984 = c7984;
                    } else {
                        int iM6985 = (C2105.m6981("ܶܿ") + i20) * (-63);
                        i15 = ((iM6985 ^ i19) * (-28597)) ^ 476352150;
                        i17 = iM6985 ^ (-46803423);
                        c7982 = c7985;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c7985 = c7982;
                    }
                    break;
                case -1833123118:
                case 1329638611:
                    i8 = 56837;
                    int iM25612 = (i19 - C0630.m2566("᩸ۖ")) * 85;
                    th2 = th2;
                    c18091 = c18091;
                    i25 = i8;
                    i21 = ((iM25612 ^ i20) * (-20477)) ^ (-1729714572);
                    z = z ? 1 : 0;
                    c7984 = c7984;
                    c7982 = c7985;
                    i22 = iM25612 ^ (-1234581680);
                    map2 = map2;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7982;
                    break;
                case -1797472224:
                case -533936752:
                    c7985 = c7985;
                    c7984 = c7984;
                    C1128.m3856(map3, C3663.m11174(c7984), c7984);
                    map3 = map3;
                    iM2568 = (C2105.m6981("ۢ۟") + i20) * 63;
                    i11 = ((iM2568 ^ i19) * 8567) ^ 1438549476;
                    i12 = -1995961042;
                    int i213 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i213;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case -1796342551:
                case 718879611:
                    try {
                        c7981 = c7986;
                        try {
                            C1128.m3856(map3, C3663.m11174(c7986), c7981);
                            c7986 = c7981;
                            iM2566 = (C0630.m2566("۫ܽ") ^ i20) * 69;
                            i = ((iM2566 ^ i19) * (-18557)) ^ (-1210594682);
                            i2 = -151802779;
                            i3 = iM2566 ^ i2;
                            c7985 = c7985;
                            i22 = i3;
                            i21 = i;
                        } catch (Throwable th5) {
                            th2 = th5;
                            c7986 = c7981;
                            c7985 = c7985;
                            map3 = map3;
                            iM25610 = C0630.m2566("ۧۨ") ^ i20;
                            i15 = ((iM25610 ^ i19) * (-2127)) ^ 2004143327;
                            i16 = 1684032777;
                            i17 = iM25610 ^ i16;
                            c7984 = c7984;
                            c7982 = c7985;
                            i22 = i17;
                            i21 = i15;
                            map3 = map3;
                            c7985 = c7982;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                    break;
                case -1690216581:
                case 855125110:
                    c7985 = c7985;
                    zM2123 = C0483.m2123(itM7037);
                    iM2566 = C0630.m2566("۠᩷") ^ i19;
                    i = ((iM2566 ^ i20) * 22269) ^ (-153360348);
                    i2 = 292046862;
                    i3 = iM2566 ^ i2;
                    c7985 = c7985;
                    i22 = i3;
                    i21 = i;
                    break;
                case -1595867705:
                case -421123520:
                    c7985 = c7985;
                    C2520.m8028(c18091);
                    map3 = map3;
                    c7984 = c7984;
                    abstractC15442 = abstractC15442;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    i23 = i24;
                    iM2568 = (i20 - C2105.m6981("ܶۗ")) * (-5);
                    i11 = ((iM2568 ^ i19) * (-18959)) ^ 584924069;
                    i12 = 1277366600;
                    int i214 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i214;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case -1587682970:
                case 250598409:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    map2 = map2;
                    try {
                        zM5912 = C1773.m5910(itM9029);
                        iM2568 = (C2105.m6981("۫۠") ^ i19) * 115;
                        i11 = ((iM2568 ^ i20) * 22645) ^ (-1199685266);
                        i12 = 2069674347;
                    } catch (Throwable th7) {
                        th = th7;
                        iM2568 = C0630.m2566("֨ۤ") ^ i19;
                        i11 = ((iM2568 ^ i20) * 7747) ^ 11626422;
                        i12 = -807276761;
                    }
                    int i215 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i215;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case -1559410489:
                case 1244342064:
                    c7985 = c7985;
                    try {
                        c7985 = (C7980) RunnableC1108.m3791(itM7037);
                        try {
                            zM13546 = C4616.m13546(hashSet, C3663.m11174(c7985));
                            iM6981 = C2105.m6981("᩹ۛ") ^ i20;
                            i = ((iM6981 ^ i19) * (-19637)) ^ (-942375663);
                            i5 = 837979079;
                            i22 = iM6981 ^ i5;
                            i21 = i;
                        } catch (Throwable th8) {
                            th = th8;
                            c7984 = c7984;
                            c7985 = c7985;
                            map3 = map3;
                            map2 = map2;
                            iM2568 = C0630.m2566("֨ۤ") ^ i19;
                            i11 = ((iM2568 ^ i20) * 7747) ^ 11626422;
                            i12 = -807276761;
                            int i216 = iM2568 ^ i12;
                            abstractC15442 = abstractC15442;
                            map3 = map3;
                            c7985 = c7985;
                            i22 = i216;
                            i21 = i11;
                            map2 = map2;
                            c7987 = c7987;
                            z = z;
                            c7984 = c7984;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        c7984 = c7984;
                        map2 = map2;
                        iM2568 = C0630.m2566("֨ۤ") ^ i19;
                        i11 = ((iM2568 ^ i20) * 7747) ^ 11626422;
                        i12 = -807276761;
                        int i217 = iM2568 ^ i12;
                        abstractC15442 = abstractC15442;
                        map3 = map3;
                        c7985 = c7985;
                        i22 = i217;
                        i21 = i11;
                        map2 = map2;
                        c7987 = c7987;
                        z = z;
                        c7984 = c7984;
                    }
                    break;
                case -1547624551:
                case -512803762:
                    C7980 c7989 = c7984;
                    C7980 c79810 = c7985;
                    Object[] objArr = z ? 1 : 0;
                    C7980 c79811 = c7987;
                    ActivityC22711 activityC22712 = this.f30154;
                    HashMap map4 = activityC22712.f73372.f34164;
                    HashMap map5 = activityC22712.f73372.f34167;
                    Throwable th10 = th2;
                    int i31 = i25;
                    abstractC15441 = (AbstractC15440) C2126.m7034(activityC22712).getSerializableExtra(C3245.m9934(f30153, 5, 5, i31));
                    AbstractC15440 abstractC15444 = (AbstractC15440) C4159.m12571(activityC22712).getSerializableExtra(RunnableC3474.m10633(f30153, 10, 5, i31));
                    C18090 c18092 = c18091;
                    boolean booleanExtra = C4159.m12571(activityC22712).getBooleanExtra(C1047.m3603(f30153, 15, 9, i31), false);
                    map3 = map5;
                    stringArrayListExtra = C2126.m7034(activityC22712).getStringArrayListExtra(C1711.m5726(f30153, 24, 12, i31));
                    ArrayList<String> stringArrayListExtra2 = C2126.m7034(activityC22712).getStringArrayListExtra(C1773.m5917(f30153, 36, 12, i31));
                    C3537.m10749(abstractC15441);
                    C3537.m10749(abstractC15444);
                    C3537.m10749(stringArrayListExtra);
                    C3537.m10749(stringArrayListExtra2);
                    hashSet = new HashSet(stringArrayListExtra);
                    if (booleanExtra) {
                        iM2567 = (C0630.m2566("ᩴۘ") + i20) * (-39);
                        i9 = ((iM2567 ^ i19) * 5839) ^ (-1394651135);
                        i10 = 148073036;
                    } else {
                        iM2567 = C0630.m2566("۟ܶ") ^ i20;
                        i9 = ((iM2567 ^ i19) * (-19577)) ^ 1277743282;
                        i10 = -1195682422;
                    }
                    int i32 = iM2567 ^ i10;
                    c7987 = c79811;
                    activityC22711 = activityC22712;
                    c18091 = c18092;
                    arrayList = stringArrayListExtra2;
                    abstractC15442 = abstractC15444;
                    i21 = i9;
                    i25 = i31;
                    map2 = map4;
                    z = objArr == true ? 1 : 0;
                    th2 = th10;
                    i24 = 0;
                    c7984 = c7989;
                    c7982 = c79810;
                    i22 = i32;
                    map3 = map3;
                    c7985 = c7982;
                    break;
                case -1495195877:
                case 1214428501:
                    throw th2;
                case -1356781454:
                case -833883750:
                    c7985 = c7985;
                    if (!zM2123) {
                        iM2568 = (i19 - C0630.m2566("᩵ᩴ")) * (-9);
                        i11 = ((iM2568 ^ i20) * 8597) ^ (-33153653);
                        i12 = 691038581;
                        int i218 = iM2568 ^ i12;
                        abstractC15442 = abstractC15442;
                        map3 = map3;
                        c7985 = c7985;
                        i22 = i218;
                        i21 = i11;
                        map2 = map2;
                        c7987 = c7987;
                        z = z;
                        c7984 = c7984;
                    } else {
                        iM2566 = (C0630.m2566("֨ᩳ") ^ i20) * 9;
                        i = ((iM2566 ^ i19) * (-13627)) ^ (-436679633);
                        i2 = 1951313724;
                        i3 = iM2566 ^ i2;
                        c7985 = c7985;
                        i22 = i3;
                        i21 = i;
                    }
                    break;
                case -1354933218:
                case 1280167376:
                    throw th;
                case -1308611346:
                case 174689563:
                    try {
                        c7980 = c7985;
                        try {
                            C3746.m11368(map2, C3663.m11174(c7985), c7980);
                            c7985 = c7980;
                            iM2566 = C2105.m6981("ۗ۟") ^ i19;
                            i = ((iM2566 ^ i20) * 17785) ^ 515609382;
                            i2 = -304373603;
                            i3 = iM2566 ^ i2;
                            c7985 = c7985;
                            i22 = i3;
                            i21 = i;
                        } catch (Throwable th11) {
                            th = th11;
                            th = th;
                            c7985 = c7980;
                            c7984 = c7984;
                            map2 = map2;
                            iM2568 = C0630.m2566("֨ۤ") ^ i19;
                            i11 = ((iM2568 ^ i20) * 7747) ^ 11626422;
                            i12 = -807276761;
                            int i219 = iM2568 ^ i12;
                            abstractC15442 = abstractC15442;
                            map3 = map3;
                            c7985 = c7985;
                            i22 = i219;
                            i21 = i11;
                            map2 = map2;
                            c7987 = c7987;
                            z = z;
                            c7984 = c7984;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        c7980 = c7985;
                    }
                    break;
                case -1240161451:
                case 1562144462:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = true;
                    z = true;
                    if (i23 < C0382.m1847(stringArrayListExtra)) {
                        iM25610 = (C2105.m6981("۬ܺ") ^ i19) * (-3);
                        i15 = ((iM25610 ^ i20) * 25703) ^ (-1078341762);
                        i16 = -1791219567;
                    } else {
                        iM25610 = C0630.m2566("ۢ᩸") ^ i19;
                        i15 = ((iM25610 ^ i20) * 24449) ^ (-32845372);
                        i16 = 1500208788;
                    }
                    i17 = iM25610 ^ i16;
                    c7984 = c7984;
                    c7982 = c7985;
                    i22 = i17;
                    i21 = i15;
                    map3 = map3;
                    c7985 = c7982;
                    break;
                case -1216283687:
                case 1457422091:
                    c7985 = c7985;
                    if (c3545M2803 != null) {
                        iM2566 = C0630.m2566("ܳܿ") ^ i19;
                        i = ((iM2566 ^ i20) * 31169) ^ (-1563744524);
                        i2 = -2104864194;
                        i3 = iM2566 ^ i2;
                        c7985 = c7985;
                        i22 = i3;
                        i21 = i;
                    } else {
                        iM2568 = (i19 - C0630.m2566("᩵ᩴ")) * (-9);
                        i11 = ((iM2568 ^ i20) * 8597) ^ (-33153653);
                        i12 = 691038581;
                        int i2110 = iM2568 ^ i12;
                        abstractC15442 = abstractC15442;
                        map3 = map3;
                        c7985 = c7985;
                        i22 = i2110;
                        i21 = i11;
                        map2 = map2;
                        c7987 = c7987;
                        z = z;
                        c7984 = c7984;
                    }
                    break;
                case -1188485963:
                case -391581689:
                    c7985 = c7985;
                    zM5910 = C1773.m5910(itM12354);
                    iM2566 = C2105.m6981("ܽܽ") ^ i19;
                    i = ((iM2566 ^ i20) * (-22539)) ^ (-1774229377);
                    i2 = -1149264213;
                    i3 = iM2566 ^ i2;
                    c7985 = c7985;
                    i22 = i3;
                    i21 = i;
                    break;
                case -756250468:
                case 294088443:
                    c7985 = c7985;
                    c3545M7156 = C2167.m7156(c18091, (String) C2272.m7513(itM12354));
                    iM2566 = (C2105.m6981("֨ۖ") + i19) * (-55);
                    i = ((iM2566 ^ i20) * 18987) ^ (-1080252339);
                    i2 = 644065870;
                    i3 = iM2566 ^ i2;
                    c7985 = c7985;
                    i22 = i3;
                    i21 = i;
                    break;
                case -719862463:
                case -139889656:
                    c7984 = c7984;
                    c7985 = c7985;
                    String str = (String) C3019.m9263(stringArrayListExtra, i23);
                    map3 = map3;
                    stringArrayListExtra.set(i23, C11340.m28015(str, z ? 1 : 0, C1711.m5741(str) - (z ? 1 : 0)));
                    i23++;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    iM2568 = (i20 - C2105.m6981("ܶۗ")) * (-5);
                    i11 = ((iM2568 ^ i19) * (-18959)) ^ 584924069;
                    i12 = 1277366600;
                    int i2111 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i2111;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case -426426776:
                case -182330239:
                    C7980 c79812 = c7985;
                    try {
                        C7980 c79813 = (C7980) RunnableC1108.m3791(itM12568);
                        try {
                            zM13547 = C4616.m13546(hashSet, C1504.m5165(c79813));
                            int iM6986 = C2105.m6981("ۡ᩹") ^ i19;
                            c7985 = c79812;
                            i = ((iM6986 ^ i20) * (-29821)) ^ (-1169939567);
                            i3 = iM6986 ^ 1515851102;
                            c7986 = c79813;
                            c7985 = c7985;
                            i22 = i3;
                            i21 = i;
                        } catch (Throwable th13) {
                            c7985 = c79812;
                            th2 = th13;
                            c7986 = c79813;
                            map3 = map3;
                            iM25610 = C0630.m2566("ۧۨ") ^ i20;
                            i15 = ((iM25610 ^ i19) * (-2127)) ^ 2004143327;
                            i16 = 1684032777;
                            i17 = iM25610 ^ i16;
                            c7984 = c7984;
                            c7982 = c7985;
                            i22 = i17;
                            i21 = i15;
                            map3 = map3;
                            c7985 = c7982;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        c7985 = c79812;
                        th2 = th;
                        map3 = map3;
                        c7984 = c7984;
                        iM25610 = C0630.m2566("ۧۨ") ^ i20;
                        i15 = ((iM25610 ^ i19) * (-2127)) ^ 2004143327;
                        i16 = 1684032777;
                        i17 = iM25610 ^ i16;
                        c7984 = c7984;
                        c7982 = c7985;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c7985 = c7982;
                    }
                    break;
                case -335658521:
                case 1448845666:
                    c7985 = c7985;
                    try {
                        zM5911 = C1773.m5910(itM12568);
                        iM2566 = (C2105.m6981("ۢܶ") + i19) * (-53);
                        i = ((iM2566 ^ i20) * 3749) ^ (-1211083777);
                        i2 = -1661536547;
                        i3 = iM2566 ^ i2;
                        c7985 = c7985;
                        i22 = i3;
                        i21 = i;
                    } catch (Throwable th15) {
                        th = th15;
                        th2 = th;
                        map3 = map3;
                        c7984 = c7984;
                        iM25610 = C0630.m2566("ۧۨ") ^ i20;
                        i15 = ((iM25610 ^ i19) * (-2127)) ^ 2004143327;
                        i16 = 1684032777;
                        i17 = iM25610 ^ i16;
                        c7984 = c7984;
                        c7982 = c7985;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c7985 = c7982;
                    }
                    break;
                case -227742495:
                case 690146103:
                    c7985 = c7985;
                    if (c3545M7156 != null) {
                        iM2566 = C0630.m2566("ܺ᩺") ^ i20;
                        i = ((iM2566 ^ i19) * (-401)) ^ (-2139570756);
                        i2 = 581053920;
                        i3 = iM2566 ^ i2;
                        c7985 = c7985;
                        i22 = i3;
                        i21 = i;
                    } else {
                        map3 = map3;
                        c7984 = c7984;
                        iM25610 = (C2105.m6981("ۛ᩶") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = ((iM25610 ^ i19) * 15393) ^ 793867726;
                        i16 = 1470440266;
                        i17 = iM25610 ^ i16;
                        c7984 = c7984;
                        c7982 = c7985;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c7985 = c7982;
                    }
                    break;
                case -213616898:
                case 1500346391:
                    Throwable th16 = th2;
                    C7980 c79814 = c7984;
                    C7980 c79815 = c7985;
                    int i33 = i25;
                    map3 = map3;
                    Object[] objArr2 = z ? 1 : 0;
                    C18090 c18093 = c18091;
                    abstractC15442 = abstractC15442;
                    c7987 = c7987;
                    map2 = map2;
                    short s = f30153[4];
                    int i34 = 65920 * s;
                    int i35 = s + 16480;
                    if ((i35 * i35) - i34 < 0) {
                        iM6982 = (C0630.m2566("ۤܺ") ^ i19) * 59;
                        i6 = ((iM6982 ^ i20) * 9627) ^ 35700004;
                        i7 = 577786820;
                    } else {
                        iM6982 = (C2105.m6981("ۚۡ") ^ i20) * 101;
                        i6 = ((iM6982 ^ i19) * 7003) ^ (-916442651);
                        i7 = -1155966176;
                    }
                    int i36 = iM6982 ^ i7;
                    z = objArr2 == true ? 1 : 0;
                    c18091 = c18093;
                    i25 = i33;
                    c7984 = c79814;
                    th2 = th16;
                    c7982 = c79815;
                    i22 = i36;
                    i21 = i6;
                    map2 = map2;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7982;
                    break;
                case -143135376:
                case 1683762952:
                    c7985 = c7985;
                    if (zM5910) {
                        iM2566 = (i19 - C2105.m6981("ۜܺ")) * 63;
                        i = ((iM2566 ^ i20) * (-17649)) ^ (-1979868262);
                        i2 = 999327623;
                    } else {
                        iM2566 = C0630.m2566("ۛ᩸") ^ i20;
                        i = ((iM2566 ^ i19) * 20619) ^ (-36579147);
                        i2 = -759501419;
                    }
                    i3 = iM2566 ^ i2;
                    c7985 = c7985;
                    i22 = i3;
                    i21 = i;
                    break;
                case -99141485:
                case 469476426:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    itM7039 = C2126.m7037((AbstractC18605) C3432.m10491(C0237.m1494(ViewOnClickListenerC1958.m6430(abstractC15442))));
                    iM2568 = (C2105.m6981("ۢ۟") + i20) * 63;
                    i11 = ((iM2568 ^ i19) * 8567) ^ 1438549476;
                    i12 = -1995961042;
                    int i2112 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i2112;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case 2681525:
                case 1202400969:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    map2 = map2;
                    if (zM5912) {
                        iM2568 = C0630.m2566("۠ۗ") ^ i19;
                        i11 = ((iM2568 ^ i20) * (-11279)) ^ (-72337657);
                        i12 = -286257302;
                    } else {
                        iM2568 = C0630.m2566("᩵᩺") ^ i20;
                        i11 = ((iM2568 ^ i19) * 30091) ^ (-1600011771);
                        i12 = 2044550519;
                    }
                    int i2113 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i2113;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case 95263085:
                case 1589161215:
                    c7980 = c7985;
                    if (zM13546) {
                        int iM25613 = (C0630.m2566("ۡ֫") + i20) * 53;
                        i22 = iM25613 ^ (-584557919);
                        i21 = ((iM25613 ^ i19) * (-101)) ^ 155939830;
                        c7985 = c7980;
                    } else {
                        c7985 = c7980;
                        iM2566 = C2105.m6981("ۗ۟") ^ i19;
                        i = ((iM2566 ^ i20) * 17785) ^ 515609382;
                        i2 = -304373603;
                        i3 = iM2566 ^ i2;
                        c7985 = c7985;
                        i22 = i3;
                        i21 = i;
                    }
                    break;
                case 206818690:
                case 1562526562:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    try {
                        itM12354 = C4117.m12354(arrayList);
                        iM25610 = (C2105.m6981("ۛ᩶") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = ((iM25610 ^ i19) * 15393) ^ 793867726;
                        i16 = 1470440266;
                    } catch (Throwable th17) {
                        th2 = th17;
                        iM25610 = C0630.m2566("ۧۨ") ^ i20;
                        i15 = ((iM25610 ^ i19) * (-2127)) ^ 2004143327;
                        i16 = 1684032777;
                    }
                    i17 = iM25610 ^ i16;
                    c7984 = c7984;
                    c7982 = c7985;
                    i22 = i17;
                    i21 = i15;
                    map3 = map3;
                    c7985 = c7982;
                    break;
                case 228894816:
                case 1852056672:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    map2 = map2;
                    itM7038 = C2126.m7037((AbstractC18605) C0382.m1836(C0237.m1494(ViewOnClickListenerC1958.m6430(abstractC15441))));
                    iM2568 = C2105.m6981("ܽ۠") ^ i20;
                    i11 = ((iM2568 ^ i19) * 3033) ^ 286067775;
                    i12 = 136529563;
                    int i2114 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i2114;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case 330497771:
                case 901123862:
                    i8 = 20151;
                    int iM25614 = (i19 - C0630.m2566("᩸ۖ")) * 85;
                    th2 = th2;
                    c18091 = c18091;
                    i25 = i8;
                    i21 = ((iM25614 ^ i20) * (-20477)) ^ (-1729714572);
                    z = z ? 1 : 0;
                    c7984 = c7984;
                    c7982 = c7985;
                    i22 = iM25614 ^ (-1234581680);
                    map2 = map2;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7982;
                    break;
                case 633854242:
                case 1571414609:
                    c7985 = c7985;
                    itM7037 = C2126.m7037((AbstractC18605) C0382.m1836(C12918.m31380(C3663.m11163(c18090, c3545M2803))));
                    iM2566 = C2105.m6981("ۗ۟") ^ i19;
                    i = ((iM2566 ^ i20) * 17785) ^ 515609382;
                    i2 = -304373603;
                    i3 = iM2566 ^ i2;
                    c7985 = c7985;
                    i22 = i3;
                    i21 = i;
                    break;
                case 653443079:
                case 1887751830:
                    c7985 = c7985;
                    C2167.m7154(th2, obj2);
                    iM2566 = C2105.m6981("ܿۙ") ^ i20;
                    i = ((iM2566 ^ i19) * (-16997)) ^ (-538465211);
                    i2 = -1833053879;
                    i3 = iM2566 ^ i2;
                    c7985 = c7985;
                    i22 = i3;
                    i21 = i;
                    break;
                case 842521465:
                case 2118840704:
                    c7985 = c7985;
                    itM9029 = C2958.m9029(arrayList);
                    iM2568 = (i19 - C0630.m2566("᩵ᩴ")) * (-9);
                    i11 = ((iM2568 ^ i20) * 8597) ^ (-33153653);
                    i12 = 691038581;
                    int i2115 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i2115;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case 935734503:
                case 1014991088:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    map2 = map2;
                    if (C1773.m5910(itM7038)) {
                        iM2568 = C0630.m2566("ۡ᩵") ^ i20;
                        i11 = ((iM2568 ^ i19) * 15853) ^ 310282937;
                        i12 = -1211085031;
                    } else {
                        iM2568 = (C2105.m6981("֡ۙ") ^ i19) * 65;
                        i11 = ((iM2568 ^ i20) * (-1719)) ^ 730794066;
                        i12 = -1276699055;
                    }
                    int i2116 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i2116;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                case 1300380410:
                case 1916221157:
                    c7984 = c7984;
                    c7983 = c7985;
                    map = map3;
                    C5695.m16020(c18090);
                    abstractC15440 = abstractC15442;
                    c18091 = new C18090(abstractC15440);
                    iM2569 = (i20 - C0630.m2566("֫ۢ")) * (-97);
                    z = z ? 1 : 0;
                    i13 = ((iM2569 ^ i19) * (-24055)) ^ (-970985588);
                    i14 = 621435533;
                    int i2117 = iM2569 ^ i14;
                    abstractC15442 = abstractC15440;
                    map3 = map;
                    c7985 = c7983;
                    i22 = i2117;
                    i21 = i13;
                    z = z;
                    c7984 = c7984;
                    break;
                case 1346156736:
                case 1899385013:
                    c7985 = c7985;
                    try {
                        C5695.m16020(c18091);
                        iM2566 = C2105.m6981("ܿۙ") ^ i20;
                        i = ((iM2566 ^ i19) * (-16997)) ^ (-538465211);
                        i2 = -1833053879;
                        i3 = iM2566 ^ i2;
                        c7985 = c7985;
                        i22 = i3;
                        i21 = i;
                    } catch (Throwable th18) {
                        int iM25615 = (C0630.m2566("᩷ۜ") ^ i20) * (-23);
                        c7985 = c7985;
                        i22 = iM25615 ^ 1837602866;
                        i4 = ((iM25615 ^ i19) * (-9955)) ^ (-404525937);
                        obj2 = th18;
                        i21 = i4;
                    }
                    break;
                case 1628853369:
                case 1810652917:
                    c7984 = c7984;
                    c7985 = c7985;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c7987 = c7987;
                    abstractC15442 = abstractC15442;
                    if (C1773.m5910(itM7039)) {
                        iM2568 = C2105.m6981("ۙܺ") ^ i19;
                        map2 = map2;
                        i11 = ((iM2568 ^ i20) * 11371) ^ (-579196834);
                        i12 = -830189212;
                    } else {
                        i23 = i24;
                        iM2568 = (i20 - C2105.m6981("ܶۗ")) * (-5);
                        i11 = ((iM2568 ^ i19) * (-18959)) ^ 584924069;
                        i12 = 1277366600;
                    }
                    int i2118 = iM2568 ^ i12;
                    abstractC15442 = abstractC15442;
                    map3 = map3;
                    c7985 = c7985;
                    i22 = i2118;
                    i21 = i11;
                    map2 = map2;
                    c7987 = c7987;
                    z = z;
                    c7984 = c7984;
                    break;
                default:
                    c7985 = c7985;
                    if (!zM5911) {
                        map3 = map3;
                        c7984 = c7984;
                        iM25610 = (C2105.m6981("ۛ᩶") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = ((iM25610 ^ i19) * 15393) ^ 793867726;
                        i16 = 1470440266;
                        i17 = iM25610 ^ i16;
                        c7984 = c7984;
                        c7982 = c7985;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c7985 = c7982;
                    } else {
                        iM2566 = (C0630.m2566("۟֨") ^ i19) * (-117);
                        i = ((iM2566 ^ i20) * 15279) ^ 1081711187;
                        i2 = -236885297;
                        i3 = iM2566 ^ i2;
                        c7985 = c7985;
                        i22 = i3;
                        i21 = i;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C3911.m11927(this);
    }
}
