package p067l;

import android.content.Intent;
import android.os.Bundle;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۚܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I7RA */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC7521 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۧ۠ܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f82000 = {4901, 147, 130, 153, 162, 147, 134, 154, 130, 135, 129, 154, 151, 128, 223, 155, 156, 129, 134, 147, 158, 158, 220, 159, 134, 130, 2771, -9419, -9463, -9456, -9470, -9460, -9461, -9419, -9456, -9450, -9459, -9472, -9449, -9417, -9472, -9466, -9472, -9460, -9453, -9472, -9449, -9436, -9466, -9455, -9460, -9453, -9460, -9455, -9444};

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        short[] sArr2 = null;
        int i3 = 0;
        int i4 = -578281274;
        int i5 = C0949.f81897;
        int i6 = ViewOnClickListenerC0939.f81888;
        int iM55979 = C0946.m55979("᩸ۗ") ^ i5;
        int i7 = ((iM55979 ^ i6) * 8273) ^ (-518022415);
        int i8 = -1866111287;
        while (true) {
            i4 = ((((i4 ^ i6) * (-13037)) >> 31) & i7) ^ (iM55979 ^ i8);
            switch (i4) {
                case -2073476403:
                case -513648360:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("ۗۚ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 17943) ^ (-1557554212);
                        i8 = 2046112739;
                    } else {
                        iM55979 = (C0873.m55680("ۡۖ") + i5) * 41;
                        i7 = ((iM55979 ^ i6) * 119) ^ 1334314552;
                        i8 = 698188946;
                    }
                    break;
                case -1936336074:
                case 1517801212:
                    C0892.m55749();
                    return null;
                case -1901896296:
                case -754759108:
                    c = 26;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i6 - C0946.m55979("۫ۤ")) * (-85);
                        i7 = ((iM55979 ^ i5) * 29521) ^ (-1362866202);
                        i8 = -1662639236;
                    } else {
                        iM55979 = C0946.m55979("᩵֫") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-24229)) ^ (-1288099225);
                        i8 = -146427456;
                    }
                    break;
                case -1807031314:
                case 655798909:
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0873.m55680("᩶᩶") ^ i6) * 23;
                        i7 = ((iM55979 ^ i5) * 21491) ^ 1240038320;
                        i8 = -163925617;
                    } else {
                        iM55979 = (i6 - C0946.m55979("۫ۤ")) * (-85);
                        i7 = ((iM55979 ^ i5) * 29521) ^ (-1362866202);
                        i8 = -1662639236;
                    }
                    break;
                case -1172705667:
                case 1757851351:
                    sArr2 = f82000;
                    i3 = 27;
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("۫ܽ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-16757)) ^ (-689698798);
                        i8 = -29301783;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ܰܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM55979 ^ i6) * 10317) ^ 192357265;
                        i8 = 480978118;
                    }
                    break;
                case -765446108:
                case 807019506:
                    i2 = 56165;
                    iM55979 = (C0873.m55680("֫۠") ^ i6) * 119;
                    i7 = ((iM55979 ^ i5) * 28429) ^ 357023458;
                    i8 = 1955268505;
                    break;
                case -667510652:
                case 1843330444:
                    return C1048.m56318(sArr2, i3, 28, i2);
                case -612538715:
                case 2070226867:
                    if (i - (s * s3) < 0) {
                        iM55979 = (i5 - C0946.m55979("ۘۢ")) * 25;
                        i7 = ((iM55979 ^ i6) * (-11311)) ^ 961243177;
                        i8 = 2121417129;
                    } else {
                        iM55979 = C0873.m55680("᩷ۛ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-10139)) ^ (-1091943585);
                        i8 = 1681570945;
                    }
                    break;
                case -558829799:
                case 270815683:
                    if (C1024.f81946) {
                        iM55979 = (i6 - C0946.m55979("۫ۤ")) * (-85);
                        i7 = ((iM55979 ^ i5) * 29521) ^ (-1362866202);
                        i8 = -1662639236;
                    } else {
                        iM55979 = C0946.m55979("᩺ᩴ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 24429) ^ 1980954091;
                        i8 = 173443360;
                    }
                    break;
                case -484245757:
                case 307411768:
                    int i9 = s + s2;
                    i = i9 * i9;
                    if (C1929.m56553()) {
                        iM55979 = C0946.m55979("ۗۚ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 17943) ^ (-1557554212);
                        i8 = 2046112739;
                    } else {
                        iM55979 = (i5 - C0946.m55979("᩷ۡ")) * (-33);
                        i7 = ((iM55979 ^ i6) * 13249) ^ 873343677;
                        i8 = -1746182308;
                    }
                    break;
                case -412994079:
                case 1420284229:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i6 - C0946.m55979("۫ۤ")) * (-85);
                        i7 = ((iM55979 ^ i5) * 29521) ^ (-1362866202);
                        i8 = -1662639236;
                    } else {
                        iM55979 = (C0873.m55680("ۡᩴ") ^ i6) * (-57);
                        i7 = ((iM55979 ^ i5) * 12023) ^ (-186928441);
                        i8 = 1525876630;
                    }
                    break;
                case 115338459:
                case 2026876350:
                    C1053.m56327();
                    iM55979 = (i6 - C0946.m55979("۫ۤ")) * (-85);
                    i7 = ((iM55979 ^ i5) * 29521) ^ (-1362866202);
                    i8 = -1662639236;
                    break;
                case 284870806:
                case 1806290168:
                    s3 = 584;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("᩶᩶") ^ i6) * 23;
                        i7 = ((iM55979 ^ i5) * 21491) ^ 1240038320;
                        i8 = -163925617;
                    } else {
                        iM55979 = (C0873.m55680("᩸ۢ") ^ i5) * (-37);
                        i7 = ((iM55979 ^ i6) * 15909) ^ (-789012919);
                        i8 = -302406217;
                    }
                    break;
                case 517416970:
                case 1762393787:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("۫ܽ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-16757)) ^ (-689698798);
                        i8 = -29301783;
                    } else {
                        iM55979 = (i5 - C0873.m55680("᩵᩺")) * (-65);
                        i7 = ((iM55979 ^ i6) * 11847) ^ 1068163810;
                        i8 = -1040632836;
                    }
                    break;
                case 527772083:
                case 1191578037:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0946.m55979("ۗۚ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 17943) ^ (-1557554212);
                        i8 = 2046112739;
                    } else {
                        iM55979 = (C0873.m55680("᩶᩶") ^ i6) * 23;
                        i7 = ((iM55979 ^ i5) * 21491) ^ 1240038320;
                        i8 = -163925617;
                    }
                    break;
                case 743084271:
                case 1234227632:
                    sArr = f82000;
                    if (C1964.f83032 <= 0) {
                        iM55979 = (i6 - C0946.m55979("۫ۤ")) * (-85);
                        i7 = ((iM55979 ^ i5) * 29521) ^ (-1362866202);
                        i8 = -1662639236;
                    } else {
                        iM55979 = (i6 - C0873.m55680("֡ۗ")) * (-119);
                        i7 = ((iM55979 ^ i5) * (-14097)) ^ 1394139924;
                        i8 = 44084337;
                    }
                    break;
                case 769019191:
                case 2029594965:
                    if (C1071.m56343() != 0) {
                        iM55979 = C0946.m55979("۫ܽ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-16757)) ^ (-689698798);
                        i8 = -29301783;
                    } else {
                        iM55979 = (C0873.m55680("᩶᩶") ^ i6) * 23;
                        i7 = ((iM55979 ^ i5) * 21491) ^ 1240038320;
                        i8 = -163925617;
                    }
                    break;
                case 1053967175:
                case 1194068501:
                    i2 = 41199;
                    iM55979 = (C0873.m55680("֫۠") ^ i6) * 119;
                    i7 = ((iM55979 ^ i5) * 28429) ^ 357023458;
                    i8 = 1955268505;
                    break;
                default:
                    s = sArr[c];
                    s2 = 146;
                    if (C0894.m55769() >= 0) {
                        iM55979 = (i5 - C0946.m55979("۫ۢ")) * (-3);
                        i7 = ((iM55979 ^ i6) * (-1467)) ^ (-689313998);
                        i8 = 888732198;
                    } else {
                        iM55979 = C0946.m55979("ۘܳ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-20125)) ^ (-1074168923);
                        i8 = 1181860948;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0276 A[PHI: r7 r8 r9 r19 r21
      0x0276: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:62:0x0274, B:58:0x0250] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:62:0x0274, B:58:0x0250] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:62:0x0274, B:58:0x0250] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r19v6 java.lang.String) = (r19v5 java.lang.String), (r19v7 java.lang.String) binds: [B:62:0x0274, B:58:0x0250] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r21v4 android.content.Intent) = (r21v3 android.content.Intent), (r21v5 android.content.Intent) binds: [B:62:0x0274, B:58:0x0250] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02d0 A[PHI: r4 r6 r10 r11 r19 r20 r21
      0x02d0: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String) binds: [B:70:0x02ce, B:66:0x02ab, B:54:0x022c, B:17:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:70:0x02ce, B:66:0x02ab, B:54:0x022c, B:17:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:70:0x02ce, B:66:0x02ab, B:54:0x022c, B:17:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:70:0x02ce, B:66:0x02ab, B:54:0x022c, B:17:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r19v24 java.lang.String) = (r19v3 java.lang.String), (r19v4 java.lang.String), (r19v8 java.lang.String), (r19v25 java.lang.String) binds: [B:70:0x02ce, B:66:0x02ab, B:54:0x022c, B:17:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:70:0x02ce, B:66:0x02ab, B:54:0x022c, B:17:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r21v22 android.content.Intent) = 
      (r21v1 android.content.Intent)
      (r21v2 android.content.Intent)
      (r21v6 android.content.Intent)
      (r21v23 android.content.Intent)
     binds: [B:70:0x02ce, B:66:0x02ab, B:54:0x022c, B:17:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        if (p067l.C1036.f81953 < 0) goto L16;
     */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int iM55681;
        int i4;
        int i5;
        int i6 = RunnableC1014.f81941;
        int i7 = C1012.f81938;
        int iM559710 = C0946.m55979("۠ۚ") ^ i6;
        int i8 = ((iM559710 ^ i7) * 4365) ^ (-1444016796);
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM559710 ^ (-667713200);
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = -23185011;
        String strM56203 = null;
        short[] sArr3 = null;
        int i15 = 0;
        AbstractC17043 abstractC17043 = null;
        String strM56175 = null;
        Intent intentM55991 = null;
        while (true) {
            i14 = i9 ^ (i8 & (((i14 ^ i7) * (-23157)) >> 31));
            switch (i14) {
                case -2082231656:
                case -591037180:
                    i15 = 36263;
                    iM55979 = (C0873.m55680("᩸֡") ^ i6) * (-95);
                    i = ((iM55979 ^ i7) * (-14255)) ^ 2028503550;
                    i2 = 2036734484;
                    int i16 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i16;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -1885993609:
                case -175311680:
                    C0917.m55854();
                    if (C0917.m55854()) {
                        intentM55991 = intentM55991;
                        strM56175 = strM56175;
                        iM55979 = (C0873.m55680("᩶ۢ") ^ i6) * 79;
                        i = ((iM55979 ^ i7) * 14581) ^ (-1470079488);
                        i2 = 1570234815;
                        int i17 = iM55979 ^ i2;
                        strM56175 = strM56175;
                        i9 = i17;
                        i8 = i;
                        intentM55991 = intentM55991;
                    }
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    iM55979 = (C0873.m55680("ۜ֫") + i7) * (-99);
                    i = ((iM55979 ^ i6) * 14647) ^ (-1469887297);
                    i2 = 1727652846;
                    int i18 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i18;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -1836210611:
                case -1114347079:
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    sArr3 = f82000;
                    if (C1024.m56209() >= 0) {
                        iM55979 = (C0873.m55680("ۜ֫") + i7) * (-99);
                        i = ((iM55979 ^ i6) * 14647) ^ (-1469887297);
                        i2 = 1727652846;
                    } else {
                        iM55979 = C0873.m55680("ۘۛ") ^ i6;
                        i = ((iM55979 ^ i7) * (-22183)) ^ 1325288193;
                        i2 = 1816275396;
                    }
                    int i19 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i19;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -1771842944:
                case 675625533:
                    C0949.m56012();
                    C1012.m56134();
                    break;
                case -1712678593:
                case -564894089:
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    sArr = f82000;
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i6;
                        i = ((iM55979 ^ i7) * 16983) ^ 1995963918;
                        i2 = -141941587;
                    } else {
                        iM55979 = C0946.m55979("ۜᩴ") ^ i7;
                        i = ((iM55979 ^ i6) * 11389) ^ 1826325286;
                        i2 = 1096012543;
                    }
                    int i110 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i110;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -1670593531:
                case 1623345662:
                    strM56175 = strM56175;
                    abstractC17043 = C17853.f53278;
                    sArr2 = f82000;
                    i13 = 8;
                    if (C1404.f82149 < 0) {
                        iM55681 = (C0946.m55979("ۧ۬") + i7) * (-49);
                        i4 = ((iM55681 ^ i6) * 13043) ^ 2101316587;
                        i5 = 1579700511;
                        String str = strM56175;
                        i9 = iM55681 ^ i5;
                        i8 = i4;
                        strM56175 = str;
                    } else {
                        intentM55991 = intentM55991;
                        iM55979 = (C0873.m55680("᩶ۢ") ^ i6) * 79;
                        i = ((iM55979 ^ i7) * 14581) ^ (-1470079488);
                        i2 = 1570234815;
                        int i111 = iM55979 ^ i2;
                        strM56175 = strM56175;
                        i9 = i111;
                        i8 = i;
                        intentM55991 = intentM55991;
                    }
                    break;
                case -1640648427:
                case -1232036656:
                    C1012.m56134();
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    iM55979 = C0946.m55979("᩹ۙ") ^ i6;
                    i = ((iM55979 ^ i7) * 16983) ^ 1995963918;
                    i2 = -141941587;
                    int i112 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i112;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -1539783664:
                case -1176922361:
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    if (C0927.f81875) {
                        iM55979 = (C0873.m55680("᩶ۢ") ^ i6) * 79;
                        i = ((iM55979 ^ i7) * 14581) ^ (-1470079488);
                        i2 = 1570234815;
                    } else {
                        iM55979 = (C0946.m55979("ۤۜ") + i6) * (-11);
                        i = ((iM55979 ^ i7) * 20193) ^ 878275945;
                        i2 = 344708638;
                    }
                    int i113 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i113;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -1537139016:
                case 967371418:
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    int i20 = i10 + i11;
                    i12 = i20 + i20;
                    s2 = 7138;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i6;
                        i = ((iM55979 ^ i7) * 16983) ^ 1995963918;
                        i2 = -141941587;
                    } else {
                        iM55979 = C0946.m55979("۠۫") ^ i6;
                        i = ((iM55979 ^ i7) * (-4891)) ^ 1040672868;
                        i2 = 1316220006;
                    }
                    int i114 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i114;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -1204089694:
                case 798621120:
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    int i21 = s + s2;
                    if ((i21 * i21) - i12 > 0) {
                        iM55979 = (C0946.m55979("ܽۜ") + i6) * 93;
                        i = ((iM55979 ^ i7) * (-16595)) ^ 1382193048;
                        i2 = 1315292344;
                    } else {
                        iM55979 = (i7 - C0946.m55979("᩵ۗ")) * (-19);
                        i = ((iM55979 ^ i6) * (-26541)) ^ 1593995951;
                        i2 = -433049717;
                    }
                    int i115 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i115;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -750044144:
                case -429046014:
                    strM56175 = strM56175;
                    super.onCreate(bundle);
                    m12275();
                    intentM55991 = C0947.m55991(this);
                    if (C0894.f81854 >= 0) {
                        iM55681 = (C0873.m55680("֡۟") + i6) * 79;
                        i4 = ((iM55681 ^ i7) * 11027) ^ (-1273048064);
                        i5 = -1037990747;
                    } else {
                        iM55681 = C0873.m55680("ۛ᩹") ^ i7;
                        i4 = ((iM55681 ^ i6) * (-17589)) ^ (-15865091);
                        i5 = 664343451;
                    }
                    String str2 = strM56175;
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    strM56175 = str2;
                    break;
                case -696123060:
                case 939758158:
                    C0890.m55729(new C2826(this, strM56175, C1024.m56217(abstractC17043, strM56203)));
                    break;
                case -535804740:
                case 792344349:
                    C0955.m56027(this);
                    break;
                case -481944067:
                case 229130090:
                    strM56175 = RunnableC1014.m56175(intentM55991, C0949.m56016(sArr3, 1, 7, i15));
                    if (strM56175 != null) {
                        iM55680 = C0873.m55680("ܰۜ") ^ i6;
                        i = ((iM55680 ^ i7) * (-14861)) ^ 1951551760;
                        i3 = -41489404;
                    } else {
                        iM55680 = C0873.m55680("ᩴۘ") ^ i7;
                        i = ((iM55680 ^ i6) * 19123) ^ (-1910906254);
                        i3 = 1426531696;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -449210013:
                case 1789194352:
                    C0955.m56025();
                    break;
                case -196647217:
                case 632600640:
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    c = 0;
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i6;
                        i = ((iM55979 ^ i7) * 16983) ^ 1995963918;
                        i2 = -141941587;
                    } else {
                        iM55979 = (C0946.m55979("ᩴۢ") ^ i7) * (-93);
                        i = ((iM55979 ^ i6) * 4671) ^ (-1216190629);
                        i2 = -928401755;
                    }
                    int i116 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i116;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -89726551:
                case 604948026:
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    i11 = 50951044;
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("֨ᩴ") ^ i7;
                        i = ((iM55979 ^ i6) * (-3059)) ^ 2042273431;
                        i2 = -1933805442;
                    } else {
                        iM55979 = C0873.m55680("᩷᩵") ^ i7;
                        i = ((iM55979 ^ i6) * (-10047)) ^ (-1512276764);
                        i2 = -1536785537;
                    }
                    int i117 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i117;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case -30880329:
                case 1609682413:
                    intentM55991 = intentM55991;
                    strM56175 = strM56175;
                    s = sArr[c];
                    i10 = s * s;
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("᩷᩵") ^ i7;
                        i = ((iM55979 ^ i6) * (-10047)) ^ (-1512276764);
                        i2 = -1536785537;
                    } else {
                        iM55979 = (C0946.m55979("᩵ᩴ") + i6) * (-37);
                        i = ((iM55979 ^ i7) * 25483) ^ 1140516471;
                        i2 = 573769901;
                    }
                    int i118 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i118;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
                case 148378780:
                case 154116317:
                    strM56203 = C1024.m56203(sArr2, i13, 18, i15);
                    if (!C1024.f81946) {
                        iM55681 = (C0873.m55680("ۜۡ") ^ i7) * (-87);
                        strM56175 = strM56175;
                        i4 = ((iM55681 ^ i6) * (-9775)) ^ 329502490;
                        i5 = 1309398907;
                        String str3 = strM56175;
                        i9 = iM55681 ^ i5;
                        i8 = i4;
                        strM56175 = str3;
                    } else {
                        intentM55991 = intentM55991;
                        strM56175 = strM56175;
                        iM55979 = C0946.m55979("᩹ۙ") ^ i6;
                        i = ((iM55979 ^ i7) * 16983) ^ 1995963918;
                        i2 = -141941587;
                        int i119 = iM55979 ^ i2;
                        strM56175 = strM56175;
                        i9 = i119;
                        i8 = i;
                        intentM55991 = intentM55991;
                    }
                    break;
                case 292656777:
                case 1564217078:
                    C0992.m56107();
                    if (C1964.f83032 > 0) {
                        strM56175 = strM56175;
                        iM55681 = (C0873.m55680("֡۟") + i6) * 79;
                        i4 = ((iM55681 ^ i7) * 11027) ^ (-1273048064);
                        i5 = -1037990747;
                        String str4 = strM56175;
                        i9 = iM55681 ^ i5;
                        i8 = i4;
                        strM56175 = str4;
                    } else {
                        intentM55991 = intentM55991;
                        strM56175 = strM56175;
                        iM55979 = (C0873.m55680("ۜ֫") + i7) * (-99);
                        i = ((iM55979 ^ i6) * 14647) ^ (-1469887297);
                        i2 = 1727652846;
                        int i1110 = iM55979 ^ i2;
                        strM56175 = strM56175;
                        i9 = i1110;
                        i8 = i;
                        intentM55991 = intentM55991;
                    }
                    break;
                default:
                    i15 = 242;
                    iM55979 = (C0873.m55680("᩸֡") ^ i6) * (-95);
                    i = ((iM55979 ^ i7) * (-14255)) ^ 2028503550;
                    i2 = 2036734484;
                    int i1111 = iM55979 ^ i2;
                    strM56175 = strM56175;
                    i9 = i1111;
                    i8 = i;
                    intentM55991 = intentM55991;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17425(ActivityC7521 activityC7521) {
        int i = -270699297;
        int i2 = C1229.f82066;
        int i3 = C0992.f81922;
        int iM55680 = (C0873.m55680("ۛۨ") ^ i3) * 87;
        int i4 = ((iM55680 ^ i2) * 3005) ^ (-770362239);
        int i5 = 2100865218;
        while (true) {
            i = ((((i ^ i2) * 4007) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2104941734:
                case 1052909066:
                    return true;
                case -1975884817:
                case 856428562:
                    if (C0892.f81851) {
                        iM55680 = C0946.m55979("ۙۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16113) ^ 1102706454;
                        i5 = -1879012957;
                    } else {
                        iM55680 = C0946.m55979("ܰ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-30011)) ^ 2004624728;
                        i5 = -1233413367;
                    }
                    break;
                case -1974147525:
                case -1258482147:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۤ᩷")) * 25;
                        i4 = ((iM55680 ^ i3) * 13109) ^ 1034692924;
                        i5 = 713437088;
                    } else {
                        iM55680 = C0946.m55979("֫ۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28069)) ^ 1921994748;
                        i5 = -1238414633;
                    }
                    break;
                case -1751142990:
                case 2107759480:
                    if (C0854.f81826 != 0) {
                        iM55680 = (i2 - C0946.m55979("᩵ۚ")) * (-37);
                        i4 = ((iM55680 ^ i3) * 20907) ^ 167565060;
                        i5 = -1863742378;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܳᩳ")) * 91;
                        i4 = ((iM55680 ^ i2) * 31871) ^ (-1265420119);
                        i5 = 1015742447;
                    }
                    break;
                case -1703350897:
                case -1119908662:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۤ᩷")) * 25;
                        i4 = ((iM55680 ^ i3) * 13109) ^ 1034692924;
                        i5 = 713437088;
                    } else {
                        iM55680 = (i2 - C0946.m55979("۠ܰ")) * 75;
                        i4 = ((iM55680 ^ i3) * 31551) ^ (-15092882);
                        i5 = -1418517582;
                    }
                    break;
                case -1369621121:
                case 1150923679:
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ۘ۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13901)) ^ 1788185133;
                        i5 = -1404305662;
                    } else {
                        iM55680 = C0873.m55680("ܶܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-12129)) ^ 783531657;
                        i5 = -1568886016;
                    }
                    break;
                case -1159350753:
                case -422752262:
                    if (C1929.m56553()) {
                        iM55680 = C0946.m55979("ۘ۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13901)) ^ 1788185133;
                        i5 = -1404305662;
                    } else {
                        iM55680 = (C0946.m55979("᩷۫") + i3) * (-57);
                        i4 = ((iM55680 ^ i2) * (-1811)) ^ 242660410;
                        i5 = -1418748138;
                    }
                    break;
                case -1125401703:
                case 978766260:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("۠ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14153)) ^ 1678319266;
                        i5 = -2016756326;
                    } else {
                        iM55680 = (C0946.m55979("᩷᩵") ^ i3) * 73;
                        i4 = ((iM55680 ^ i2) * 979) ^ 2109230973;
                        i5 = 2006440451;
                    }
                    break;
                case -666728416:
                case 1164816806:
                    C1028.m56247();
                    C0873.m55678();
                    return false;
                case -596465988:
                case 1257110964:
                    C1025.m56230();
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("۠ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14153)) ^ 1678319266;
                        i5 = -2016756326;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩵ۚ")) * (-37);
                        i4 = ((iM55680 ^ i3) * 20907) ^ 167565060;
                        i5 = -1863742378;
                    }
                    break;
                case -489721729:
                case 132069661:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("۠ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14153)) ^ 1678319266;
                        i5 = -2016756326;
                    } else {
                        iM55680 = (C0873.m55680("۟ᩳ") + i3) * (-23);
                        i4 = ((iM55680 ^ i2) * 30693) ^ 1902586275;
                        i5 = -1902066664;
                    }
                    break;
                case -351017904:
                case 684186652:
                    if (C0863.m55643()) {
                        iM55680 = (C0873.m55680("ܺܺ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * SecP521R1Field.P16) ^ (-1759070130);
                        i5 = -1283462148;
                    } else {
                        iM55680 = C0946.m55979("۠ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14153)) ^ 1678319266;
                        i5 = -2016756326;
                    }
                    break;
                case -267739086:
                case 1181748490:
                    if (activityC7521.isDestroyed()) {
                        iM55680 = (C0946.m55979("ܶ֡") + i3) * (-21);
                        i4 = ((iM55680 ^ i2) * 8229) ^ 1040730838;
                        i5 = 52806035;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܶܰ")) * (-83);
                        i4 = ((iM55680 ^ i2) * (-31985)) ^ 1645432885;
                        i5 = -186749949;
                    }
                    break;
                case 3504509:
                case 366180127:
                    return false;
                case 327979143:
                case 1006477799:
                    if (C0989.m56094(activityC7521)) {
                        iM55680 = (C0946.m55979("ܶ֡") + i3) * (-21);
                        i4 = ((iM55680 ^ i2) * 8229) ^ 1040730838;
                        i5 = 52806035;
                    } else {
                        iM55680 = (C0946.m55979("᩷ܰ") + i2) * (-61);
                        i4 = ((iM55680 ^ i3) * (-26641)) ^ 838052488;
                        i5 = -559167574;
                    }
                    break;
                case 772154930:
                case 1105898982:
                    C1404.m56468();
                    if (!C0882.f81846) {
                        iM55680 = (i2 - C0946.m55979("᩵ۚ")) * (-37);
                        i4 = ((iM55680 ^ i3) * 20907) ^ 167565060;
                        i5 = -1863742378;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۤ᩷")) * 25;
                        i4 = ((iM55680 ^ i3) * 13109) ^ 1034692924;
                        i5 = 713437088;
                    }
                    break;
                case 909812954:
                case 1955878824:
                    C1046.m56302();
                    if (!C1404.m56468()) {
                        iM55680 = C0946.m55979("ܰ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-30011)) ^ 2004624728;
                        i5 = -1233413367;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩵ۚ")) * (-37);
                        i4 = ((iM55680 ^ i3) * 20907) ^ 167565060;
                        i5 = -1863742378;
                    }
                    break;
                case 1245764982:
                case 1541076822:
                    AbstractC0942.m55971();
                    C1071.m56343();
                    iM55680 = (i2 - C0946.m55979("᩵ۚ")) * (-37);
                    i4 = ((iM55680 ^ i3) * 20907) ^ 167565060;
                    i5 = -1863742378;
                    break;
                default:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("۠ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14153)) ^ 1678319266;
                        i5 = -2016756326;
                    } else {
                        iM55680 = C0946.m55979("ۙܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21517) ^ 703084696;
                        i5 = 1463636283;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onStop() {
        int i = 2086833463;
        int i2 = C0877.f81843;
        int i3 = C1046.f81962;
        int iM55680 = C0873.m55680("֨ܿ") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-15163)) ^ (-1045741616);
        int i5 = -1102265045;
        while (true) {
            i = ((((i ^ i2) * (-1043)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2018657531:
                case 1564148926:
                    C1124.m56367();
                    iM55680 = C0946.m55979("᩶ۨ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 13835) ^ (-2037575387);
                    i5 = 768434422;
                    break;
                case -1998046078:
                case -1579555164:
                    C0894.m55769();
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("ۜۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11823) ^ 1090664269;
                        i5 = -1814473711;
                    } else {
                        iM55680 = C0946.m55979("᩶ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13835) ^ (-2037575387);
                        i5 = 768434422;
                    }
                    break;
                case -1698967557:
                case 1903229233:
                    if (C0937.m55918() >= 0) {
                        iM55680 = (C0873.m55680("ܰۖ") ^ i2) * (-67);
                        i4 = ((iM55680 ^ i3) * 24883) ^ (-2077476002);
                        i5 = 1241001613;
                    } else {
                        iM55680 = C0946.m55979("ۚ᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17777)) ^ 480733558;
                        i5 = 980803171;
                    }
                    break;
                case -1435732608:
                case -798567380:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۡۧ")) * 17;
                        i4 = ((iM55680 ^ i3) * (-19477)) ^ (-326737157);
                        i5 = 772348377;
                    } else {
                        iM55680 = (C0946.m55979("᩹ۛ") ^ i2) * (-23);
                        i4 = ((iM55680 ^ i3) * (-25613)) ^ (-1309788747);
                        i5 = -2017986259;
                    }
                    break;
                case -1197283199:
                case -583733689:
                    C0906.m55809();
                    if (C1229.f82066 < 0) {
                        iM55680 = (C0873.m55680("ܰۖ") ^ i2) * (-67);
                        i4 = ((iM55680 ^ i3) * 24883) ^ (-2077476002);
                        i5 = 1241001613;
                    } else {
                        iM55680 = C0946.m55979("᩶ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13835) ^ (-2037575387);
                        i5 = 768434422;
                    }
                    break;
                case -1117692050:
                case -875981489:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("᩶ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13835) ^ (-2037575387);
                        i5 = 768434422;
                    } else {
                        iM55680 = C0946.m55979("ۚۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1079) ^ 1971764788;
                        i5 = -12634012;
                    }
                    break;
                case -988801741:
                case 1627533551:
                    C0894.m55769();
                    if (C0845.f81821 < 0) {
                        iM55680 = (i2 - C0946.m55979("ۡۧ")) * 17;
                        i4 = ((iM55680 ^ i3) * (-19477)) ^ (-326737157);
                        i5 = 772348377;
                    } else {
                        iM55680 = C0946.m55979("᩶ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13835) ^ (-2037575387);
                        i5 = 768434422;
                    }
                    break;
                case -728162492:
                case 1114402743:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("᩶ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13835) ^ (-2037575387);
                        i5 = 768434422;
                    } else {
                        iM55680 = C0946.m55979("ᩳ۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14497)) ^ (-383059470);
                        i5 = -2035518381;
                    }
                    break;
                case -546519645:
                case 1767858190:
                    if (C1229.m56410() != 0) {
                        iM55680 = (C0873.m55680("ܽ֨") ^ i3) * (-7);
                        i4 = ((iM55680 ^ i2) * (-21115)) ^ (-102486317);
                        i5 = 2101967115;
                    } else {
                        iM55680 = (C0873.m55680("ۛ᩸") ^ i2) * (-123);
                        i4 = ((iM55680 ^ i3) * (-12479)) ^ (-1186735892);
                        i5 = -1506627121;
                    }
                    break;
                case -543068988:
                case 967305647:
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("ۜ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23383)) ^ (-704074292);
                        i5 = -1660886793;
                    } else {
                        iM55680 = C0946.m55979("᩶ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13835) ^ (-2037575387);
                        i5 = 768434422;
                    }
                    break;
                case -393877221:
                case 62648938:
                    super.onStop();
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۡۧ")) * 17;
                        i4 = ((iM55680 ^ i3) * (-19477)) ^ (-326737157);
                        i5 = 772348377;
                    } else {
                        iM55680 = C0873.m55680("ۧۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20097)) ^ 1658192356;
                        i5 = -870078087;
                    }
                    break;
                case -134090381:
                case 204615544:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("ܽ֨") ^ i3) * (-7);
                        i4 = ((iM55680 ^ i2) * (-21115)) ^ (-102486317);
                        i5 = 2101967115;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܺ") + i2) * 109;
                        i4 = ((iM55680 ^ i3) * 4201) ^ (-934641215);
                        i5 = -863657745;
                    }
                    break;
                case -74187005:
                case 574544449:
                    RunnableC0897.m55775(this);
                    iM55680 = C0946.m55979("᩵᩷") ^ i3;
                    i4 = ((iM55680 ^ i2) * 1945) ^ 123554957;
                    i5 = 1747238803;
                    break;
                case 690615107:
                case 1055812502:
                    break;
                case 876433833:
                case 1435184924:
                    if (C0989.m56094(this)) {
                        iM55680 = C0946.m55979("᩵᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1945) ^ 123554957;
                        i5 = 1747238803;
                    } else {
                        iM55680 = C0873.m55680("᩹ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24991) ^ (-11488529);
                        i5 = 1977605783;
                    }
                    break;
                case 1089522452:
                case 1824303652:
                    if (C1048.f81963) {
                        iM55680 = (i3 - C0873.m55680("᩸ۤ")) * (-77);
                        i4 = ((iM55680 ^ i2) * 29315) ^ 45724703;
                        i5 = -362318791;
                    } else {
                        iM55680 = C0946.m55979("ۜۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11823) ^ 1090664269;
                        i5 = -1814473711;
                    }
                    break;
                case 2064105827:
                case 2126999198:
                    RunnableC0897.m55784();
                    break;
                default:
                    if (C0854.f81826 != 0) {
                        iM55680 = (i2 - C0946.m55979("ۡۧ")) * 17;
                        i4 = ((iM55680 ^ i3) * (-19477)) ^ (-326737157);
                        i5 = 772348377;
                    } else {
                        iM55680 = C0946.m55979("ۢ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27317)) ^ (-1996747113);
                        i5 = 1066800509;
                    }
                    break;
            }
            return;
        }
    }
}
