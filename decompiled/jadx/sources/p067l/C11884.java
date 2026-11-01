package p067l;

import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G1XN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11884 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩶ۘ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f82118 = {630, 6729, -4543, -3747, 6868, 20177, 20190, 20187, 20178, 20102, 20177, 20190, 20187, 20178, 20101, 20190, 20164, 20211, 20178, 20175, 20209, 20190, 20187, 20178, 20180, 20191, 20182, 20185, 20176, 20178, 20179, 20195, 20174, 20167, 20178, 20164, 20180, 20191, 20182, 20185, 20176, 20178, 20179, 20211, 20178, 20175, 20178, 20164};

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC23953 f33113;

    public C11884(ActivityC23953 activityC23953) {
        this.f33113 = activityC23953;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C0992.m56112(this, this.f33113);
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1229.f82066;
        int i4 = RunnableC1014.f81941;
        int iM55979 = (C0946.m55979("ۧܶ") + i3) * (-127);
        int i5 = ((iM55979 ^ i4) * (-22785)) ^ 1870151875;
        short[] sArr = null;
        int i6 = iM55979 ^ (-1001164004);
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -616879812;
        char c = 0;
        String strM56077 = null;
        C15556 c15556 = null;
        ArrayList arrayList = null;
        C15556 c15557 = null;
        C15556 c15558 = null;
        C4694 c4694 = null;
        ActivityC23953 activityC23953 = null;
        int iM55681 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-27075)) >> 31));
            switch (i11) {
                case -2008762724:
                case -1944751115:
                    i8 = s * s2;
                    i9 = s * s;
                    i10 = 46036225;
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0873.m55680("۟ܰ") + i3) * (-91);
                        i = ((iM55680 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۚۨ")) * 33;
                        i = ((iM55680 ^ i4) * (-7735)) ^ (-1810207720);
                        i2 = 71113530;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1885994727:
                case -361204019:
                    c15558 = new C15556();
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0873.m55680("ܶ۬") + i3) * 11;
                        i = ((iM55680 ^ i4) * 13633) ^ 458230494;
                        i2 = 2125894541;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۢۡ")) * (-55);
                        i = ((iM55680 ^ i3) * (-8939)) ^ 1174758039;
                        i2 = -1993700111;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1661247730:
                case -1350672994:
                    i7 = 10788;
                    iM55680 = C0946.m55979("֡ܺ") ^ i3;
                    i = ((iM55680 ^ i4) * (-4333)) ^ 379238275;
                    i2 = 139483567;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1634539650:
                case 979781164:
                    c15556.m35377((InterfaceC10193) activityC23953);
                    ViewOnClickListenerC0939.m55954(c4694, activityC23953.f76096);
                    break;
                case -1616542313:
                case 864695404:
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("۬ۚ") + i4) * 5;
                        i = ((iM55680 ^ i3) * 14211) ^ 1669635781;
                        i2 = 1177093020;
                    } else {
                        iM55680 = (C0873.m55680("۟ܰ") + i3) * (-91);
                        i = ((iM55680 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1547409780:
                case 2104693866:
                    sArr = f82118;
                    c = 0;
                    if (C0912.m55833()) {
                        iM55680 = (C0873.m55680("۟ܰ") + i3) * (-91);
                        i = ((iM55680 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM55680 = C0873.m55680("ۡ֨") ^ i3;
                        i = ((iM55680 ^ i4) * (-16879)) ^ 1941958143;
                        i2 = -1720308457;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1400623842:
                case -1264388425:
                    activityC23953 = this.f33113;
                    c4694 = (C4694) C1053.m56321(activityC23953, iM55681);
                    if (C0861.f81831) {
                        int iM559710 = C0946.m55979("᩹ۘ") ^ i3;
                        i5 = ((iM559710 ^ i4) * 14153) ^ (-1532309591);
                        i6 = iM559710 ^ 1535871221;
                    } else {
                        iM55680 = (C0873.m55680("۟ܰ") + i3) * (-91);
                        i = ((iM55680 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1347202021:
                case -400059746:
                    C1024.m56209();
                    break;
                case -1305610629:
                case 386235032:
                    c15557.m35371(1, arrayList);
                    if (C0947.m55997()) {
                        iM55680 = (C0873.m55680("۟ܰ") + i3) * (-91);
                        i = ((iM55680 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۨ") ^ i3) * 71;
                        i = ((iM55680 ^ i4) * (-19877)) ^ (-540032223);
                        i2 = -1432606313;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1272428885:
                case 48466692:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0873.m55680("۟ܰ") + i3) * (-91);
                        i = ((iM55680 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM55680 = C0946.m55979("ܺܺ") ^ i4;
                        i = ((iM55680 ^ i3) * (-28083)) ^ (-1456423975);
                        i2 = 1382030977;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1130805355:
                case 679883447:
                    s = sArr[c];
                    s2 = 13570;
                    if (C0873.m55678()) {
                        iM55680 = (C0873.m55680("۟ܰ") + i3) * (-91);
                        i = ((iM55680 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM55680 = C0946.m55979("᩺᩵") ^ i4;
                        i = ((iM55680 ^ i3) * (-19903)) ^ 651709304;
                        i2 = -374524918;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -762786860:
                case 268356924:
                    C0845.m55584();
                    C1229.m56410();
                    iM55680 = (C0873.m55680("۬ۚ") + i4) * 5;
                    i = ((iM55680 ^ i3) * 14211) ^ 1669635781;
                    i2 = 1177093020;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -606801262:
                case -219133058:
                    C1003.m56123();
                    if (C0917.f81868) {
                        iM55680 = (C0873.m55680("۬ۚ") + i4) * 5;
                        i = ((iM55680 ^ i3) * 14211) ^ 1669635781;
                        i2 = 1177093020;
                    } else {
                        iM55680 = C0873.m55680("ۖ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 7147) ^ 1774837612;
                        i2 = -708680347;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -338677213:
                case -263546001:
                    if (i8 - (i9 + i10) <= 0) {
                        iM55680 = (i4 - C0873.m55680("ܰ֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM55680 ^ i3) * (-9969)) ^ 1896515605;
                        i2 = -1770684613;
                    } else {
                        iM55680 = C0873.m55680("ᩳۗ") ^ i4;
                        i = ((iM55680 ^ i3) * (-30249)) ^ 1028702258;
                        i2 = -828921097;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -264789797:
                case 47091201:
                    activityC23953.f76096.m35378((InterfaceC16897) activityC23953);
                    c15556 = activityC23953.f76096;
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("۟ܰ") + i3) * (-91);
                        i = ((iM55680 ^ i4) * 17345) ^ (-527538083);
                        i2 = -1327147164;
                    } else {
                        iM55680 = C0946.m55979("۬ۧ") ^ i3;
                        i = ((iM55680 ^ i4) * (-6785)) ^ (-868415811);
                        i2 = 795017026;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 80818087:
                case 751779545:
                    iM55681 = 2124274870 ^ C0873.m55680(strM56077);
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0873.m55680("ۖ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 7147) ^ 1774837612;
                        i2 = -708680347;
                    } else {
                        iM55680 = C0946.m55979("ۚۜ") ^ i4;
                        i = ((iM55680 ^ i3) * 13923) ^ 992186961;
                        i2 = -716644264;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 178684981:
                case 2140646831:
                    activityC23953.f76096 = c15558;
                    c15557 = activityC23953.f76096;
                    arrayList = activityC23953.f76095.f37161;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("ܺܺ") ^ i4;
                        i = ((iM55680 ^ i3) * (-28083)) ^ (-1456423975);
                        i2 = 1382030977;
                    } else {
                        iM55680 = (C0946.m55979("ܽܶ") + i4) * 23;
                        i = ((iM55680 ^ i3) * (-11871)) ^ (-558481970);
                        i2 = 2113978161;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 511895413:
                case 697494018:
                    i7 = 32245;
                    iM55680 = C0946.m55979("֡ܺ") ^ i3;
                    i = ((iM55680 ^ i4) * (-4333)) ^ 379238275;
                    i2 = 139483567;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM56077 = C0967.m56077(f82118, 1, 3, i7);
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0873.m55680("۬ۚ") + i4) * 5;
                        i = ((iM55680 ^ i3) * 14211) ^ 1669635781;
                        i2 = 1177093020;
                    } else {
                        iM55680 = C0946.m55979("ۢ۠") ^ i3;
                        i = ((iM55680 ^ i4) * (-9673)) ^ (-1842196238);
                        i2 = -1656805472;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC23953 activityC23953 = null;
        int i = 724845425;
        int i2 = C0877.f81843;
        int i3 = C1012.f81938;
        int iM55979 = (C0946.m55979("ۨۜ") ^ i2) * 75;
        int i4 = ((iM55979 ^ i3) * (-28323)) ^ (-1907211344);
        int i5 = 478767469;
        while (true) {
            i = ((((i ^ i3) * 21695) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1835299420:
                case 1918249084:
                    C0917.m55854();
                    C0930.m55885();
                    iM55979 = C0873.m55680("ۜۘ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-24583)) ^ 1219625504;
                    i5 = -885926341;
                    break;
                case -1530780386:
                case 619305985:
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0946.m55979("᩶ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2645)) ^ 1005243649;
                        i5 = -952025622;
                    } else {
                        iM55979 = C0873.m55680("᩹᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31835) ^ (-749918093);
                        i5 = 523610036;
                    }
                    break;
                case -1513458878:
                case 802333880:
                    activityC23953.m12260((Throwable) exc, true);
                    break;
                case -1452856471:
                case 2082049950:
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0873.m55680("ۜۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24583)) ^ 1219625504;
                        i5 = -885926341;
                    } else {
                        iM55979 = (C0873.m55680("ܺܿ") + i2) * 15;
                        i4 = ((iM55979 ^ i3) * 635) ^ 1215389508;
                        i5 = -517938544;
                    }
                    break;
                case -1440566398:
                case -968472904:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0946.m55979("۫֫") + i3) * 41;
                        i4 = ((iM55979 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM55979 = C0873.m55680("۬۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1345)) ^ 1301110121;
                        i5 = 23494939;
                    }
                    break;
                case -1378472146:
                case -569629119:
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0946.m55979("۫֫") + i3) * 41;
                        i4 = ((iM55979 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM55979 = C0873.m55680("᩹ۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-21189)) ^ 2108905173;
                        i5 = -1431962217;
                    }
                    break;
                case -1267595341:
                case -632096815:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("۫֫") + i3) * 41;
                        i4 = ((iM55979 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM55979 = (C0946.m55979("ۧ۫") + i2) * (-47);
                        i4 = ((iM55979 ^ i3) * (-31369)) ^ (-1892347332);
                        i5 = -590481798;
                    }
                    break;
                case -1078301079:
                case -842087756:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0946.m55979("۫֫") + i3) * 41;
                        i4 = ((iM55979 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM55979 = C0873.m55680("ܺۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31145) ^ 405779971;
                        i5 = -851523199;
                    }
                    break;
                case -704820149:
                case 1872186242:
                    C0877.m55696();
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("ۙᩴ") ^ i2) * 95;
                        i4 = ((iM55979 ^ i3) * (-12439)) ^ (-1130277551);
                        i5 = -1637932147;
                    } else {
                        iM55979 = (C0946.m55979("۫֫") + i3) * 41;
                        i4 = ((iM55979 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    }
                    break;
                case -617961130:
                case 1168192302:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0946.m55979("۫֫") + i3) * 41;
                        i4 = ((iM55979 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    } else {
                        iM55979 = (C0946.m55979("ܰᩳ") ^ i3) * (-113);
                        i4 = ((iM55979 ^ i2) * 16641) ^ (-179795921);
                        i5 = 1845346651;
                    }
                    break;
                case -506381121:
                case 2016048200:
                    activityC23953 = this.f33113;
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("ۚ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6221)) ^ 881829439;
                        i5 = -628897107;
                    } else {
                        iM55979 = C0873.m55680("۟᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23599)) ^ (-1382925751);
                        i5 = 730170921;
                    }
                    break;
                case -49410264:
                case 698005607:
                    C0866.m55645();
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("᩶ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2645)) ^ 1005243649;
                        i5 = -952025622;
                    } else {
                        iM55979 = C0873.m55680("ۜۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24583)) ^ 1219625504;
                        i5 = -885926341;
                    }
                    break;
                case 60575915:
                case 1227565352:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0946.m55979("ۙᩴ") ^ i2) * 95;
                        i4 = ((iM55979 ^ i3) * (-12439)) ^ (-1130277551);
                        i5 = -1637932147;
                    } else {
                        iM55979 = (C0873.m55680("ۛܽ") ^ i2) * (-63);
                        i4 = ((iM55979 ^ i3) * 10897) ^ (-1529062305);
                        i5 = -1073841871;
                    }
                    break;
                case 191855995:
                case 1165891418:
                    AbstractC0942.m55971();
                    C1404.m56468();
                    break;
                case 1076536900:
                case 1375005207:
                    C0877.m55696();
                    if (!C1048.f81963) {
                        iM55979 = C0873.m55680("ۜۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24583)) ^ 1219625504;
                        i5 = -885926341;
                    } else {
                        iM55979 = (C0946.m55979("۫֫") + i3) * 41;
                        i4 = ((iM55979 ^ i2) * 8857) ^ 1907643458;
                        i5 = -43264608;
                    }
                    break;
                default:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0946.m55979("ۙᩴ") ^ i2) * 95;
                        i4 = ((iM55979 ^ i3) * (-12439)) ^ (-1130277551);
                        i5 = -1637932147;
                    } else {
                        iM55979 = (C0873.m55680("ۙ᩸") ^ i3) * 29;
                        i4 = ((iM55979 ^ i2) * 21651) ^ 1330757551;
                        i5 = 1021508722;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        int iM55680;
        int i;
        int i2;
        int i3;
        int i4;
        int iM55979;
        int i5;
        C9952 c9952;
        C9952 c9953;
        int iM559710;
        int i6;
        int i7;
        C9952 c9954;
        int i8;
        int iM55681;
        int i9;
        int i10;
        int iM55682;
        int i11;
        int i12;
        int i13;
        C9952 c9955;
        HashMap map;
        AbstractC17043 abstractC17043;
        int iM55683;
        int i14;
        int iM55684;
        int i15;
        int i16;
        int i17;
        HashMap map2 = null;
        HashMap map3 = null;
        ArrayList<String> stringArrayListExtra = null;
        HashSet hashSet = null;
        C19561 c19561 = null;
        Throwable th = null;
        C9952 c9956 = null;
        Iterator itM56292 = null;
        boolean zM55886 = false;
        Iterator itM55994 = null;
        boolean zM55647 = false;
        Iterator itM56308 = null;
        C9952 c9957 = null;
        boolean zM55887 = false;
        boolean zM56338 = false;
        C9952 c9958 = null;
        boolean zM56339 = false;
        int i18 = -467030469;
        int i19 = C0866.f81837;
        int i20 = C1053.f81965;
        int iM55685 = (C0873.m55680("᩷ܽ") ^ i19) * (-101);
        int i21 = ((iM55685 ^ i20) * 16535) ^ 483035376;
        int i22 = iM55685 ^ 191941401;
        AbstractC17043 abstractC17044 = null;
        ArrayList<String> arrayList = null;
        Iterator itM55995 = null;
        C19561 c19562 = null;
        Object obj = null;
        boolean z = false;
        int i23 = 0;
        int i24 = 0;
        boolean zM55888 = false;
        ActivityC23953 activityC23953 = null;
        int i25 = 0;
        AbstractC17043 abstractC17045 = null;
        Throwable th2 = null;
        Iterator itM56090 = null;
        Object obj2 = null;
        Iterator itM55996 = null;
        C5738 c5738M56013 = null;
        C9952 c9959 = null;
        C5738 c5738M55694 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i20) * 21915) >> 31));
            switch (i18) {
                case -2139285774:
                case -600630615:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    abstractC17045 = abstractC17045;
                    c9959 = c9959;
                    C0898.m55805(map2, C1024.m56215(c9959), c9959);
                    map2 = map2;
                    iM55682 = C0946.m55979("ܽ۠") ^ i20;
                    i11 = ((iM55682 ^ i19) * 3033) ^ 286067775;
                    i12 = 136529563;
                    int i26 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i26;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case -2120977962:
                case 1436917094:
                    c9955 = c9957;
                    C0877.m55706(th, obj);
                    map = map3;
                    c9956 = c9956;
                    abstractC17043 = abstractC17045;
                    z = z ? 1 : 0;
                    iM55683 = C0873.m55680("ۛ᩻") ^ i20;
                    i13 = ((iM55683 ^ i19) * (-19787)) ^ 1077101993;
                    i14 = 2014383096;
                    int i27 = iM55683 ^ i14;
                    abstractC17045 = abstractC17043;
                    map3 = map;
                    c9957 = c9955;
                    i22 = i27;
                    i21 = i13;
                    z = z;
                    c9956 = c9956;
                    break;
                case -2087941755:
                case -75709169:
                    map2 = map2;
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    abstractC17045 = abstractC17045;
                    C9952 c99510 = (C9952) C0955.m56035(itM55995);
                    if (!C1229.m56400(hashSet, C1024.m56215(c99510))) {
                        c9959 = c99510;
                        iM55682 = C0946.m55979("ܽ۠") ^ i20;
                        i11 = ((iM55682 ^ i19) * 3033) ^ 286067775;
                        i12 = 136529563;
                        int i28 = iM55682 ^ i12;
                        abstractC17045 = abstractC17045;
                        map3 = map3;
                        c9957 = c9957;
                        i22 = i28;
                        i21 = i11;
                        map2 = map2;
                        c9959 = c9959;
                        z = z;
                        c9956 = c9956;
                    } else {
                        int iM559711 = C0946.m55979("ۧۗ") ^ i20;
                        i13 = ((iM559711 ^ i19) * 28697) ^ (-1954881576);
                        abstractC17045 = abstractC17045;
                        map3 = map3;
                        c9957 = c9957;
                        i22 = iM559711 ^ (-1272847606);
                        map2 = map2;
                        c9959 = c99510;
                        i21 = i13;
                        z = z;
                        c9956 = c9956;
                    }
                    break;
                case -2055621403:
                case 168713037:
                    c9953 = c9958;
                    if (zM56339) {
                        iM55979 = (i19 - C0946.m55979("ۢ۠")) * 9;
                        c9958 = c9953;
                        i = ((iM55979 ^ i20) * (-3277)) ^ 262199213;
                        i5 = 1289468676;
                        i22 = iM55979 ^ i5;
                        i21 = i;
                    }
                    c9958 = c9953;
                    iM55680 = (C0873.m55680("۫ܽ") ^ i20) * 69;
                    i = ((iM55680 ^ i19) * (-18557)) ^ (-1210594682);
                    i2 = -151802779;
                    i3 = iM55680 ^ i2;
                    c9957 = c9957;
                    i22 = i3;
                    i21 = i;
                    break;
                case -2042042559:
                case 2052572408:
                    activityC23953.f76095.f37161 = stringArrayListExtra;
                    activityC23953.f76095.f37162 = z;
                    return;
                case -1991495035:
                case 835945118:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    try {
                        c5738M55694 = C0877.m55694(c19561, (String) RunnableC0897.m55785(itM56090));
                        iM55684 = C0873.m55680("ܿۗ") ^ i19;
                        i15 = ((iM55684 ^ i20) * (-6271)) ^ (-734715391);
                        i16 = -1979855248;
                        i17 = iM55684 ^ i16;
                        c9956 = c9956;
                        c9954 = c9957;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c9957 = c9954;
                    } catch (Throwable th3) {
                        th = th3;
                        map2 = map2;
                        iM55682 = C0873.m55680("֨ۤ") ^ i19;
                        i11 = ((iM55682 ^ i20) * 7747) ^ 11626422;
                        i12 = -807276761;
                        int i29 = iM55682 ^ i12;
                        abstractC17045 = abstractC17045;
                        map3 = map3;
                        c9957 = c9957;
                        i22 = i29;
                        i21 = i11;
                        map2 = map2;
                        c9959 = c9959;
                        z = z;
                        c9956 = c9956;
                    }
                    break;
                case -1950753583:
                case 385809992:
                    itM56308 = C1048.m56308((AbstractC20050) C1012.m56147(C14645.m33466(C1024.m56204(c19562, c5738M56013))));
                    iM55680 = (C0873.m55680("۫ܽ") ^ i20) * 69;
                    i = ((iM55680 ^ i19) * (-18557)) ^ (-1210594682);
                    i2 = -151802779;
                    i3 = iM55680 ^ i2;
                    c9957 = c9957;
                    i22 = i3;
                    i21 = i;
                    break;
                case -1938736213:
                case 281153304:
                    c9956 = c9956;
                    c9955 = c9957;
                    map = map3;
                    z = z ? 1 : 0;
                    abstractC17043 = abstractC17045;
                    try {
                        C0967.m56075(c19561);
                        iM55683 = C0873.m55680("ۛ᩻") ^ i20;
                        i13 = ((iM55683 ^ i19) * (-19787)) ^ 1077101993;
                        i14 = 2014383096;
                        int i210 = iM55683 ^ i14;
                        abstractC17045 = abstractC17043;
                        map3 = map;
                        c9957 = c9955;
                        i22 = i210;
                        i21 = i13;
                        z = z;
                        c9956 = c9956;
                    } catch (Throwable th4) {
                        int iM559712 = (i19 - C0946.m55979("ۜۖ")) * 85;
                        int i30 = ((iM559712 ^ i20) * (-6867)) ^ (-835499711);
                        abstractC17045 = abstractC17043;
                        map3 = map;
                        c9957 = c9955;
                        i22 = iM559712 ^ (-1746477397);
                        z = z ? 1 : 0;
                        c9956 = c9956;
                        i4 = i30;
                        obj = th4;
                        i21 = i4;
                    }
                    break;
                case -1930977131:
                case 217114595:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    map2 = map2;
                    AbstractC17043 abstractC17046 = abstractC17044;
                    c19561 = new C19561(abstractC17046);
                    iM55682 = (i19 - C0873.m55680("ܳ᩺")) * 49;
                    abstractC17044 = abstractC17046;
                    i11 = ((iM55682 ^ i20) * (-21391)) ^ 2037623181;
                    i12 = -874947556;
                    int i211 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i211;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case -1837432906:
                case 296213734:
                    c9957 = c9957;
                    map3 = map3;
                    c9956 = (C9952) C0955.m56035(itM55996);
                    if (!C1071.m56338(hashSet, C0917.m55840(c9956))) {
                        c9956 = c9956;
                        iM55682 = (C0946.m55979("ۢ۟") + i20) * 63;
                        i11 = ((iM55682 ^ i19) * 8567) ^ 1438549476;
                        i12 = -1995961042;
                        int i212 = iM55682 ^ i12;
                        abstractC17045 = abstractC17045;
                        map3 = map3;
                        c9957 = c9957;
                        i22 = i212;
                        i21 = i11;
                        map2 = map2;
                        c9959 = c9959;
                        z = z;
                        c9956 = c9956;
                    } else {
                        int iM559713 = (C0946.m55979("ܶܿ") + i20) * (-63);
                        i15 = ((iM559713 ^ i19) * (-28597)) ^ 476352150;
                        i17 = iM559713 ^ (-46803423);
                        c9954 = c9957;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c9957 = c9954;
                    }
                    break;
                case -1833123118:
                case 1329638611:
                    i8 = 56837;
                    int iM55686 = (i19 - C0873.m55680("᩸ۖ")) * 85;
                    th2 = th2;
                    c19562 = c19562;
                    i25 = i8;
                    i21 = ((iM55686 ^ i20) * (-20477)) ^ (-1729714572);
                    z = z ? 1 : 0;
                    c9956 = c9956;
                    c9954 = c9957;
                    i22 = iM55686 ^ (-1234581680);
                    map2 = map2;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9954;
                    break;
                case -1797472224:
                case -533936752:
                    c9957 = c9957;
                    c9956 = c9956;
                    C0898.m55805(map3, C1024.m56215(c9956), c9956);
                    map3 = map3;
                    iM55682 = (C0946.m55979("ۢ۟") + i20) * 63;
                    i11 = ((iM55682 ^ i19) * 8567) ^ 1438549476;
                    i12 = -1995961042;
                    int i213 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i213;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case -1796342551:
                case 718879611:
                    try {
                        c9953 = c9958;
                        try {
                            C0898.m55805(map3, C1024.m56215(c9958), c9953);
                            c9958 = c9953;
                            iM55680 = (C0873.m55680("۫ܽ") ^ i20) * 69;
                            i = ((iM55680 ^ i19) * (-18557)) ^ (-1210594682);
                            i2 = -151802779;
                            i3 = iM55680 ^ i2;
                            c9957 = c9957;
                            i22 = i3;
                            i21 = i;
                        } catch (Throwable th5) {
                            th2 = th5;
                            c9958 = c9953;
                            c9957 = c9957;
                            map3 = map3;
                            iM55684 = C0873.m55680("ۧۨ") ^ i20;
                            i15 = ((iM55684 ^ i19) * (-2127)) ^ 2004143327;
                            i16 = 1684032777;
                            i17 = iM55684 ^ i16;
                            c9956 = c9956;
                            c9954 = c9957;
                            i22 = i17;
                            i21 = i15;
                            map3 = map3;
                            c9957 = c9954;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                    break;
                case -1690216581:
                case 855125110:
                    c9957 = c9957;
                    zM55647 = C0866.m55647(itM55994);
                    iM55680 = C0873.m55680("۠᩷") ^ i19;
                    i = ((iM55680 ^ i20) * 22269) ^ (-153360348);
                    i2 = 292046862;
                    i3 = iM55680 ^ i2;
                    c9957 = c9957;
                    i22 = i3;
                    i21 = i;
                    break;
                case -1595867705:
                case -421123520:
                    c9957 = c9957;
                    C0967.m56075(c19562);
                    map3 = map3;
                    c9956 = c9956;
                    abstractC17045 = abstractC17045;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    i23 = i24;
                    iM55682 = (i20 - C0946.m55979("ܶۗ")) * (-5);
                    i11 = ((iM55682 ^ i19) * (-18959)) ^ 584924069;
                    i12 = 1277366600;
                    int i214 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i214;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case -1587682970:
                case 250598409:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    map2 = map2;
                    try {
                        zM55888 = C0930.m55886(itM56090);
                        iM55682 = (C0946.m55979("۫۠") ^ i19) * 115;
                        i11 = ((iM55682 ^ i20) * 22645) ^ (-1199685266);
                        i12 = 2069674347;
                    } catch (Throwable th7) {
                        th = th7;
                        iM55682 = C0873.m55680("֨ۤ") ^ i19;
                        i11 = ((iM55682 ^ i20) * 7747) ^ 11626422;
                        i12 = -807276761;
                    }
                    int i215 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i215;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case -1559410489:
                case 1244342064:
                    c9957 = c9957;
                    try {
                        c9957 = (C9952) RunnableC0897.m55785(itM55994);
                        try {
                            zM56338 = C1071.m56338(hashSet, C1024.m56215(c9957));
                            iM55979 = C0946.m55979("᩹ۛ") ^ i20;
                            i = ((iM55979 ^ i19) * (-19637)) ^ (-942375663);
                            i5 = 837979079;
                            i22 = iM55979 ^ i5;
                            i21 = i;
                        } catch (Throwable th8) {
                            th = th8;
                            c9956 = c9956;
                            c9957 = c9957;
                            map3 = map3;
                            map2 = map2;
                            iM55682 = C0873.m55680("֨ۤ") ^ i19;
                            i11 = ((iM55682 ^ i20) * 7747) ^ 11626422;
                            i12 = -807276761;
                            int i216 = iM55682 ^ i12;
                            abstractC17045 = abstractC17045;
                            map3 = map3;
                            c9957 = c9957;
                            i22 = i216;
                            i21 = i11;
                            map2 = map2;
                            c9959 = c9959;
                            z = z;
                            c9956 = c9956;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        c9956 = c9956;
                        map2 = map2;
                        iM55682 = C0873.m55680("֨ۤ") ^ i19;
                        i11 = ((iM55682 ^ i20) * 7747) ^ 11626422;
                        i12 = -807276761;
                        int i217 = iM55682 ^ i12;
                        abstractC17045 = abstractC17045;
                        map3 = map3;
                        c9957 = c9957;
                        i22 = i217;
                        i21 = i11;
                        map2 = map2;
                        c9959 = c9959;
                        z = z;
                        c9956 = c9956;
                    }
                    break;
                case -1547624551:
                case -512803762:
                    C9952 c99511 = c9956;
                    C9952 c99512 = c9957;
                    Object[] objArr = z ? 1 : 0;
                    C9952 c99513 = c9959;
                    ActivityC23953 activityC23954 = this.f33113;
                    HashMap map4 = activityC23954.f76095.f37160;
                    HashMap map5 = activityC23954.f76095.f37163;
                    Throwable th10 = th2;
                    int i31 = i25;
                    abstractC17044 = (AbstractC17043) C0947.m55991(activityC23954).getSerializableExtra(C1003.m56132(f82118, 5, 5, i31));
                    AbstractC17043 abstractC17047 = (AbstractC17043) C1048.m56311(activityC23954).getSerializableExtra(RunnableC1014.m56180(f82118, 10, 5, i31));
                    C19561 c19563 = c19562;
                    boolean booleanExtra = C1048.m56311(activityC23954).getBooleanExtra(C0894.m55773(f82118, 15, 9, i31), false);
                    map3 = map5;
                    stringArrayListExtra = C0947.m55991(activityC23954).getStringArrayListExtra(C0927.m55863(f82118, 24, 12, i31));
                    ArrayList<String> stringArrayListExtra2 = C0947.m55991(activityC23954).getStringArrayListExtra(C0930.m55893(f82118, 36, 12, i31));
                    C1017.m56190(abstractC17044);
                    C1017.m56190(abstractC17047);
                    C1017.m56190(stringArrayListExtra);
                    C1017.m56190(stringArrayListExtra2);
                    hashSet = new HashSet(stringArrayListExtra);
                    if (booleanExtra) {
                        iM55681 = (C0873.m55680("ᩴۘ") + i20) * (-39);
                        i9 = ((iM55681 ^ i19) * 5839) ^ (-1394651135);
                        i10 = 148073036;
                    } else {
                        iM55681 = C0873.m55680("۟ܶ") ^ i20;
                        i9 = ((iM55681 ^ i19) * (-19577)) ^ 1277743282;
                        i10 = -1195682422;
                    }
                    int i32 = iM55681 ^ i10;
                    c9959 = c99513;
                    activityC23953 = activityC23954;
                    c19562 = c19563;
                    arrayList = stringArrayListExtra2;
                    abstractC17045 = abstractC17047;
                    i21 = i9;
                    i25 = i31;
                    map2 = map4;
                    z = objArr == true ? 1 : 0;
                    th2 = th10;
                    i24 = 0;
                    c9956 = c99511;
                    c9954 = c99512;
                    i22 = i32;
                    map3 = map3;
                    c9957 = c9954;
                    break;
                case -1495195877:
                case 1214428501:
                    throw th2;
                case -1356781454:
                case -833883750:
                    c9957 = c9957;
                    if (!zM55647) {
                        iM55682 = (i19 - C0873.m55680("᩵ᩴ")) * (-9);
                        i11 = ((iM55682 ^ i20) * 8597) ^ (-33153653);
                        i12 = 691038581;
                        int i218 = iM55682 ^ i12;
                        abstractC17045 = abstractC17045;
                        map3 = map3;
                        c9957 = c9957;
                        i22 = i218;
                        i21 = i11;
                        map2 = map2;
                        c9959 = c9959;
                        z = z;
                        c9956 = c9956;
                    } else {
                        iM55680 = (C0873.m55680("֨ᩳ") ^ i20) * 9;
                        i = ((iM55680 ^ i19) * (-13627)) ^ (-436679633);
                        i2 = 1951313724;
                        i3 = iM55680 ^ i2;
                        c9957 = c9957;
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
                        c9952 = c9957;
                        try {
                            C1028.m56246(map2, C1024.m56215(c9957), c9952);
                            c9957 = c9952;
                            iM55680 = C0946.m55979("ۗ۟") ^ i19;
                            i = ((iM55680 ^ i20) * 17785) ^ 515609382;
                            i2 = -304373603;
                            i3 = iM55680 ^ i2;
                            c9957 = c9957;
                            i22 = i3;
                            i21 = i;
                        } catch (Throwable th11) {
                            th = th11;
                            th = th;
                            c9957 = c9952;
                            c9956 = c9956;
                            map2 = map2;
                            iM55682 = C0873.m55680("֨ۤ") ^ i19;
                            i11 = ((iM55682 ^ i20) * 7747) ^ 11626422;
                            i12 = -807276761;
                            int i219 = iM55682 ^ i12;
                            abstractC17045 = abstractC17045;
                            map3 = map3;
                            c9957 = c9957;
                            i22 = i219;
                            i21 = i11;
                            map2 = map2;
                            c9959 = c9959;
                            z = z;
                            c9956 = c9956;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        c9952 = c9957;
                    }
                    break;
                case -1240161451:
                case 1562144462:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = true;
                    z = true;
                    if (i23 < C0861.m55625(stringArrayListExtra)) {
                        iM55684 = (C0946.m55979("۬ܺ") ^ i19) * (-3);
                        i15 = ((iM55684 ^ i20) * 25703) ^ (-1078341762);
                        i16 = -1791219567;
                    } else {
                        iM55684 = C0873.m55680("ۢ᩸") ^ i19;
                        i15 = ((iM55684 ^ i20) * 24449) ^ (-32845372);
                        i16 = 1500208788;
                    }
                    i17 = iM55684 ^ i16;
                    c9956 = c9956;
                    c9954 = c9957;
                    i22 = i17;
                    i21 = i15;
                    map3 = map3;
                    c9957 = c9954;
                    break;
                case -1216283687:
                case 1457422091:
                    c9957 = c9957;
                    if (c5738M55694 != null) {
                        iM55680 = C0873.m55680("ܳܿ") ^ i19;
                        i = ((iM55680 ^ i20) * 31169) ^ (-1563744524);
                        i2 = -2104864194;
                        i3 = iM55680 ^ i2;
                        c9957 = c9957;
                        i22 = i3;
                        i21 = i;
                    } else {
                        iM55682 = (i19 - C0873.m55680("᩵ᩴ")) * (-9);
                        i11 = ((iM55682 ^ i20) * 8597) ^ (-33153653);
                        i12 = 691038581;
                        int i2110 = iM55682 ^ i12;
                        abstractC17045 = abstractC17045;
                        map3 = map3;
                        c9957 = c9957;
                        i22 = i2110;
                        i21 = i11;
                        map2 = map2;
                        c9959 = c9959;
                        z = z;
                        c9956 = c9956;
                    }
                    break;
                case -1188485963:
                case -391581689:
                    c9957 = c9957;
                    zM55886 = C0930.m55886(itM56292);
                    iM55680 = C0946.m55979("ܽܽ") ^ i19;
                    i = ((iM55680 ^ i20) * (-22539)) ^ (-1774229377);
                    i2 = -1149264213;
                    i3 = iM55680 ^ i2;
                    c9957 = c9957;
                    i22 = i3;
                    i21 = i;
                    break;
                case -756250468:
                case 294088443:
                    c9957 = c9957;
                    c5738M56013 = C0949.m56013(c19562, (String) C0955.m56035(itM56292));
                    iM55680 = (C0946.m55979("֨ۖ") + i19) * (-55);
                    i = ((iM55680 ^ i20) * 18987) ^ (-1080252339);
                    i2 = 644065870;
                    i3 = iM55680 ^ i2;
                    c9957 = c9957;
                    i22 = i3;
                    i21 = i;
                    break;
                case -719862463:
                case -139889656:
                    c9956 = c9956;
                    c9957 = c9957;
                    String str = (String) C0992.m56115(stringArrayListExtra, i23);
                    map3 = map3;
                    stringArrayListExtra.set(i23, C1404.m56454(str, z ? 1 : 0, C0927.m55878(str) - (z ? 1 : 0)));
                    i23++;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    iM55682 = (i20 - C0946.m55979("ܶۗ")) * (-5);
                    i11 = ((iM55682 ^ i19) * (-18959)) ^ 584924069;
                    i12 = 1277366600;
                    int i2111 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i2111;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case -426426776:
                case -182330239:
                    C9952 c99514 = c9957;
                    try {
                        C9952 c99515 = (C9952) RunnableC0897.m55785(itM56308);
                        try {
                            zM56339 = C1071.m56338(hashSet, C0917.m55840(c99515));
                            int iM559714 = C0946.m55979("ۡ᩹") ^ i19;
                            c9957 = c99514;
                            i = ((iM559714 ^ i20) * (-29821)) ^ (-1169939567);
                            i3 = iM559714 ^ 1515851102;
                            c9958 = c99515;
                            c9957 = c9957;
                            i22 = i3;
                            i21 = i;
                        } catch (Throwable th13) {
                            c9957 = c99514;
                            th2 = th13;
                            c9958 = c99515;
                            map3 = map3;
                            iM55684 = C0873.m55680("ۧۨ") ^ i20;
                            i15 = ((iM55684 ^ i19) * (-2127)) ^ 2004143327;
                            i16 = 1684032777;
                            i17 = iM55684 ^ i16;
                            c9956 = c9956;
                            c9954 = c9957;
                            i22 = i17;
                            i21 = i15;
                            map3 = map3;
                            c9957 = c9954;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        c9957 = c99514;
                        th2 = th;
                        map3 = map3;
                        c9956 = c9956;
                        iM55684 = C0873.m55680("ۧۨ") ^ i20;
                        i15 = ((iM55684 ^ i19) * (-2127)) ^ 2004143327;
                        i16 = 1684032777;
                        i17 = iM55684 ^ i16;
                        c9956 = c9956;
                        c9954 = c9957;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c9957 = c9954;
                    }
                    break;
                case -335658521:
                case 1448845666:
                    c9957 = c9957;
                    try {
                        zM55887 = C0930.m55886(itM56308);
                        iM55680 = (C0946.m55979("ۢܶ") + i19) * (-53);
                        i = ((iM55680 ^ i20) * 3749) ^ (-1211083777);
                        i2 = -1661536547;
                        i3 = iM55680 ^ i2;
                        c9957 = c9957;
                        i22 = i3;
                        i21 = i;
                    } catch (Throwable th15) {
                        th = th15;
                        th2 = th;
                        map3 = map3;
                        c9956 = c9956;
                        iM55684 = C0873.m55680("ۧۨ") ^ i20;
                        i15 = ((iM55684 ^ i19) * (-2127)) ^ 2004143327;
                        i16 = 1684032777;
                        i17 = iM55684 ^ i16;
                        c9956 = c9956;
                        c9954 = c9957;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c9957 = c9954;
                    }
                    break;
                case -227742495:
                case 690146103:
                    c9957 = c9957;
                    if (c5738M56013 != null) {
                        iM55680 = C0873.m55680("ܺ᩺") ^ i20;
                        i = ((iM55680 ^ i19) * (-401)) ^ (-2139570756);
                        i2 = 581053920;
                        i3 = iM55680 ^ i2;
                        c9957 = c9957;
                        i22 = i3;
                        i21 = i;
                    } else {
                        map3 = map3;
                        c9956 = c9956;
                        iM55684 = (C0946.m55979("ۛ᩶") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = ((iM55684 ^ i19) * 15393) ^ 793867726;
                        i16 = 1470440266;
                        i17 = iM55684 ^ i16;
                        c9956 = c9956;
                        c9954 = c9957;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c9957 = c9954;
                    }
                    break;
                case -213616898:
                case 1500346391:
                    Throwable th16 = th2;
                    C9952 c99516 = c9956;
                    C9952 c99517 = c9957;
                    int i33 = i25;
                    map3 = map3;
                    Object[] objArr2 = z ? 1 : 0;
                    C19561 c19564 = c19562;
                    abstractC17045 = abstractC17045;
                    c9959 = c9959;
                    map2 = map2;
                    short s = f82118[4];
                    int i34 = 65920 * s;
                    int i35 = s + 16480;
                    if ((i35 * i35) - i34 < 0) {
                        iM559710 = (C0873.m55680("ۤܺ") ^ i19) * 59;
                        i6 = ((iM559710 ^ i20) * 9627) ^ 35700004;
                        i7 = 577786820;
                    } else {
                        iM559710 = (C0946.m55979("ۚۡ") ^ i20) * 101;
                        i6 = ((iM559710 ^ i19) * 7003) ^ (-916442651);
                        i7 = -1155966176;
                    }
                    int i36 = iM559710 ^ i7;
                    z = objArr2 == true ? 1 : 0;
                    c19562 = c19564;
                    i25 = i33;
                    c9956 = c99516;
                    th2 = th16;
                    c9954 = c99517;
                    i22 = i36;
                    i21 = i6;
                    map2 = map2;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9954;
                    break;
                case -143135376:
                case 1683762952:
                    c9957 = c9957;
                    if (zM55886) {
                        iM55680 = (i19 - C0946.m55979("ۜܺ")) * 63;
                        i = ((iM55680 ^ i20) * (-17649)) ^ (-1979868262);
                        i2 = 999327623;
                    } else {
                        iM55680 = C0873.m55680("ۛ᩸") ^ i20;
                        i = ((iM55680 ^ i19) * 20619) ^ (-36579147);
                        i2 = -759501419;
                    }
                    i3 = iM55680 ^ i2;
                    c9957 = c9957;
                    i22 = i3;
                    i21 = i;
                    break;
                case -99141485:
                case 469476426:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    itM55996 = C0947.m55994((AbstractC20050) C1012.m56147(C0854.m55608(ViewOnClickListenerC0939.m55942(abstractC17045))));
                    iM55682 = (C0946.m55979("ۢ۟") + i20) * 63;
                    i11 = ((iM55682 ^ i19) * 8567) ^ 1438549476;
                    i12 = -1995961042;
                    int i2112 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i2112;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case 2681525:
                case 1202400969:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    map2 = map2;
                    if (zM55888) {
                        iM55682 = C0873.m55680("۠ۗ") ^ i19;
                        i11 = ((iM55682 ^ i20) * (-11279)) ^ (-72337657);
                        i12 = -286257302;
                    } else {
                        iM55682 = C0873.m55680("᩵᩺") ^ i20;
                        i11 = ((iM55682 ^ i19) * 30091) ^ (-1600011771);
                        i12 = 2044550519;
                    }
                    int i2113 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i2113;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case 95263085:
                case 1589161215:
                    c9952 = c9957;
                    if (zM56338) {
                        int iM55687 = (C0873.m55680("ۡ֫") + i20) * 53;
                        i22 = iM55687 ^ (-584557919);
                        i21 = ((iM55687 ^ i19) * (-101)) ^ 155939830;
                        c9957 = c9952;
                    } else {
                        c9957 = c9952;
                        iM55680 = C0946.m55979("ۗ۟") ^ i19;
                        i = ((iM55680 ^ i20) * 17785) ^ 515609382;
                        i2 = -304373603;
                        i3 = iM55680 ^ i2;
                        c9957 = c9957;
                        i22 = i3;
                        i21 = i;
                    }
                    break;
                case 206818690:
                case 1562526562:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    try {
                        itM56292 = C1046.m56292(arrayList);
                        iM55684 = (C0946.m55979("ۛ᩶") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = ((iM55684 ^ i19) * 15393) ^ 793867726;
                        i16 = 1470440266;
                    } catch (Throwable th17) {
                        th2 = th17;
                        iM55684 = C0873.m55680("ۧۨ") ^ i20;
                        i15 = ((iM55684 ^ i19) * (-2127)) ^ 2004143327;
                        i16 = 1684032777;
                    }
                    i17 = iM55684 ^ i16;
                    c9956 = c9956;
                    c9954 = c9957;
                    i22 = i17;
                    i21 = i15;
                    map3 = map3;
                    c9957 = c9954;
                    break;
                case 228894816:
                case 1852056672:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    map2 = map2;
                    itM55995 = C0947.m55994((AbstractC20050) C0861.m55614(C0854.m55608(ViewOnClickListenerC0939.m55942(abstractC17044))));
                    iM55682 = C0946.m55979("ܽ۠") ^ i20;
                    i11 = ((iM55682 ^ i19) * 3033) ^ 286067775;
                    i12 = 136529563;
                    int i2114 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i2114;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case 330497771:
                case 901123862:
                    i8 = 20151;
                    int iM55688 = (i19 - C0873.m55680("᩸ۖ")) * 85;
                    th2 = th2;
                    c19562 = c19562;
                    i25 = i8;
                    i21 = ((iM55688 ^ i20) * (-20477)) ^ (-1729714572);
                    z = z ? 1 : 0;
                    c9956 = c9956;
                    c9954 = c9957;
                    i22 = iM55688 ^ (-1234581680);
                    map2 = map2;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9954;
                    break;
                case 633854242:
                case 1571414609:
                    c9957 = c9957;
                    itM55994 = C0947.m55994((AbstractC20050) C0861.m55614(C14645.m33466(C1024.m56204(c19561, c5738M55694))));
                    iM55680 = C0946.m55979("ۗ۟") ^ i19;
                    i = ((iM55680 ^ i20) * 17785) ^ 515609382;
                    i2 = -304373603;
                    i3 = iM55680 ^ i2;
                    c9957 = c9957;
                    i22 = i3;
                    i21 = i;
                    break;
                case 653443079:
                case 1887751830:
                    c9957 = c9957;
                    C0949.m56011(th2, obj2);
                    iM55680 = C0946.m55979("ܿۙ") ^ i20;
                    i = ((iM55680 ^ i19) * (-16997)) ^ (-538465211);
                    i2 = -1833053879;
                    i3 = iM55680 ^ i2;
                    c9957 = c9957;
                    i22 = i3;
                    i21 = i;
                    break;
                case 842521465:
                case 2118840704:
                    c9957 = c9957;
                    itM56090 = C0989.m56090(arrayList);
                    iM55682 = (i19 - C0873.m55680("᩵ᩴ")) * (-9);
                    i11 = ((iM55682 ^ i20) * 8597) ^ (-33153653);
                    i12 = 691038581;
                    int i2115 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i2115;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case 935734503:
                case 1014991088:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    map2 = map2;
                    if (C0930.m55886(itM55995)) {
                        iM55682 = C0873.m55680("ۡ᩵") ^ i20;
                        i11 = ((iM55682 ^ i19) * 15853) ^ 310282937;
                        i12 = -1211085031;
                    } else {
                        iM55682 = (C0946.m55979("֡ۙ") ^ i19) * 65;
                        i11 = ((iM55682 ^ i20) * (-1719)) ^ 730794066;
                        i12 = -1276699055;
                    }
                    int i2116 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i2116;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                case 1300380410:
                case 1916221157:
                    c9956 = c9956;
                    c9955 = c9957;
                    map = map3;
                    C1124.m56366(c19561);
                    abstractC17043 = abstractC17045;
                    c19562 = new C19561(abstractC17043);
                    iM55683 = (i20 - C0873.m55680("֫ۢ")) * (-97);
                    z = z ? 1 : 0;
                    i13 = ((iM55683 ^ i19) * (-24055)) ^ (-970985588);
                    i14 = 621435533;
                    int i2117 = iM55683 ^ i14;
                    abstractC17045 = abstractC17043;
                    map3 = map;
                    c9957 = c9955;
                    i22 = i2117;
                    i21 = i13;
                    z = z;
                    c9956 = c9956;
                    break;
                case 1346156736:
                case 1899385013:
                    c9957 = c9957;
                    try {
                        C1124.m56366(c19562);
                        iM55680 = C0946.m55979("ܿۙ") ^ i20;
                        i = ((iM55680 ^ i19) * (-16997)) ^ (-538465211);
                        i2 = -1833053879;
                        i3 = iM55680 ^ i2;
                        c9957 = c9957;
                        i22 = i3;
                        i21 = i;
                    } catch (Throwable th18) {
                        int iM55689 = (C0873.m55680("᩷ۜ") ^ i20) * (-23);
                        c9957 = c9957;
                        i22 = iM55689 ^ 1837602866;
                        i4 = ((iM55689 ^ i19) * (-9955)) ^ (-404525937);
                        obj2 = th18;
                        i21 = i4;
                    }
                    break;
                case 1628853369:
                case 1810652917:
                    c9956 = c9956;
                    c9957 = c9957;
                    map3 = map3;
                    z = z ? 1 : 0;
                    c9959 = c9959;
                    abstractC17045 = abstractC17045;
                    if (C0930.m55886(itM55996)) {
                        iM55682 = C0946.m55979("ۙܺ") ^ i19;
                        map2 = map2;
                        i11 = ((iM55682 ^ i20) * 11371) ^ (-579196834);
                        i12 = -830189212;
                    } else {
                        i23 = i24;
                        iM55682 = (i20 - C0946.m55979("ܶۗ")) * (-5);
                        i11 = ((iM55682 ^ i19) * (-18959)) ^ 584924069;
                        i12 = 1277366600;
                    }
                    int i2118 = iM55682 ^ i12;
                    abstractC17045 = abstractC17045;
                    map3 = map3;
                    c9957 = c9957;
                    i22 = i2118;
                    i21 = i11;
                    map2 = map2;
                    c9959 = c9959;
                    z = z;
                    c9956 = c9956;
                    break;
                default:
                    c9957 = c9957;
                    if (!zM55887) {
                        map3 = map3;
                        c9956 = c9956;
                        iM55684 = (C0946.m55979("ۛ᩶") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = ((iM55684 ^ i19) * 15393) ^ 793867726;
                        i16 = 1470440266;
                        i17 = iM55684 ^ i16;
                        c9956 = c9956;
                        c9954 = c9957;
                        i22 = i17;
                        i21 = i15;
                        map3 = map3;
                        c9957 = c9954;
                    } else {
                        iM55680 = (C0873.m55680("۟֨") ^ i19) * (-117);
                        i = ((iM55680 ^ i20) * 15279) ^ 1081711187;
                        i2 = -236885297;
                        i3 = iM55680 ^ i2;
                        c9957 = c9957;
                        i22 = i3;
                        i21 = i;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C1036.m56260(this);
    }
}
