package l;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: UAQE */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC12210 extends ActivityC2124 {

    /* JADX INFO: renamed from: ܳۙۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f36441 = {7226, 23550, 23541, 23538, 23474, 23537, 23528, 23474, 23532, 23536, 23529, 23535, 23474, 23505, 23549, 23541, 23538, 23506, 23539, 23518, 23547, 23509, 23551, 23539, 23538, 23550, 23541, 23538, 23474, 23537, 23528, 23474, 23532, 23536, 23529, 23535, 23474, 23505, 23549, 23541, 23538, 23504, 23541, 23547, 23540, 23528, 23509, 23551, 23539, 23538, 23550, 23541, 23538, 23474, 23537, 23528, 23474, 23532, 23536, 23529, 23535, 23474, 23505, 23549, 23541, 23538, 23512, 23549, 23534, 23543, 23509, 23551, 23539, 23538, 3192, 19015, 19020, 19019, 18955, 19016, 19025, 18955, 19029, 19017, 19024, 19030, 18955, 19048, 19012, 19020, 19019, 19051, 19018, 19047, 19010, 19052, 19014, 19018, 19019, 19015, 19020, 19019, 18955, 19016, 19025, 18955, 19029, 19017, 19024, 19030, 18955, 19048, 19012, 19020, 19019, 19049, 19020, 19010, 19021, 19025, 19052, 19014, 19018, 19019, 19015, 19020, 19019, 18955, 19016, 19025, 18955, 19029, 19017, 19024, 19030, 18955, 19048, 19012, 19020, 19019, 19041, 19012, 19031, 19022, 19052, 19014, 19018, 19019, 19015, 19020, 19019, 18955, 19016, 19025, 18955, 19029, 19017, 19024, 19030, 18955, 19048, 19012, 19020, 19019, 9762, 12472, 12430, 12425, 12436, 12435, 12422, 12427, 12427, 12472, 12422, 12439, 12428, 12472, 12417, 12437, 12424, 12426, 12472, 12426, 12435, 12472, 12422, 12436, 12498, 12419, 12499, 12501, 12422, 12420, 12435, 12430, 12433, 12430, 12435, 12446, 12422, 12425, 12419, 12437, 12424, 12430, 12419, 12489, 12430, 12425, 12435, 12418, 12425, 12435, 12489, 12422, 12420, 12435, 12430, 12424, 12425, 12489, 12468, 12450, 12457, 12451, 12421, 12430, 12425, 12489, 12426, 12435, 12489, 12439, 12427, 12434, 12436, 12435, 12418, 12447, 12435, 12488, 12422, 12425, 12419, 12437, 12424, 12430, 12419, 12489, 12430, 12425, 12435, 12418, 12425, 12435, 12489, 12418, 12447, 12435, 12437, 12422, 12489, 12467, 12450, 12479, 12467, 12417, 12437, 12424, 12426, 12450, 12447, 12435, 12418, 12437, 12425, 12422, 12427, 12454, 12439, 12439, 12422, 12425, 12419, 12437, 12424, 12430, 12419, 12489, 12430, 12425, 12435, 12418, 12425, 12435, 12489, 12422, 12420, 12435, 12430, 12424, 12425, 12489, 12465, 12462, 12450, 12464};

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static C12915 f36442;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (l.C11340.f33930 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
    
        if (l.C1504.f5354 == false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m29697(ActivityManager.AppTask appTask) {
        int iM2566;
        int i;
        int i2;
        int i3;
        int iM6981;
        int i4;
        int i5;
        ActivityManager.RecentTaskInfo recentTaskInfo;
        ComponentName componentName;
        int iM2567;
        int i6;
        ?? r6;
        byte b;
        int i7 = C0714.f2697;
        int i8 = C4263.f13799;
        int iM2568 = C0630.m2566("᩶ܶ") ^ i8;
        int i9 = ((iM2568 ^ i7) * (-10139)) ^ (-260344124);
        String className = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM2568 ^ (-1055710512);
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        short s2 = 0;
        boolean z2 = false;
        int i20 = 0;
        int i21 = -1426860541;
        int i22 = 0;
        ComponentName componentName2 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        ?? r7 = 0;
        ActivityManager.RecentTaskInfo taskInfo = null;
        while (true) {
            i21 = i10 ^ (i9 & (((i21 ^ i7) * (-18775)) >> 31));
            switch (i21) {
                case -2105433136:
                case -428187348:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i23 = i20;
                    i11 = i11;
                    i3 = i23;
                    i19 = i18 + 7784100;
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۜ") ^ i8) * 71;
                        i4 = ((iM6981 ^ i7) * (-17825)) ^ (-1780958371);
                        i5 = -362969181;
                    } else {
                        iM6981 = C0630.m2566("֡۠") ^ i7;
                        i4 = ((iM6981 ^ i8) * (-12137)) ^ (-1513819331);
                        i5 = -2140763002;
                    }
                    int i24 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr6 = sArr;
                    i10 = i24;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr6;
                    int i25 = i11;
                    i20 = i3;
                    i11 = i25;
                    break;
                case -1924499753:
                case 879557364:
                    b = 3;
                    sArr5 = sArr5;
                    int i26 = i20;
                    i11 = i11;
                    i3 = i26;
                    r6 = b;
                    iM2567 = C0630.m2566("۟֡") ^ i8;
                    sArr = sArr;
                    i9 = ((iM2567 ^ i7) * 7607) ^ 1593247922;
                    i6 = -2103819490;
                    r7 = r6;
                    int i27 = iM2567 ^ i6;
                    i22 = i22;
                    int i28 = i11;
                    i20 = i3;
                    i11 = i28;
                    short[] sArr7 = sArr;
                    i10 = i27;
                    sArr5 = sArr5;
                    sArr = sArr7;
                    break;
                case -1884728962:
                case -705755861:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i29 = i20;
                    i11 = i11;
                    i3 = i29;
                    z2 = false;
                    if (componentName2 != null) {
                        iM6981 = C0630.m2566("᩵ۙ") ^ i8;
                        i4 = ((iM6981 ^ i7) * (-11283)) ^ 596869209;
                        i5 = -649187337;
                    } else {
                        iM6981 = (C0630.m2566("֨᩵") + i8) * (-103);
                        i4 = ((iM6981 ^ i7) * 789) ^ 1557033521;
                        i5 = -1233663193;
                    }
                    int i210 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr8 = sArr;
                    i10 = i210;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr8;
                    int i211 = i11;
                    i20 = i3;
                    i11 = i211;
                    break;
                case -1846663720:
                case 601870966:
                    if (!ViewOnClickListenerC1958.m6437(className, C2958.m9031(sArr2, i13, i14, i16))) {
                        sArr = sArr;
                        i22 = i22;
                        sArr5 = sArr5;
                        int i30 = i20;
                        i11 = i11;
                        i3 = i30;
                        iM6981 = (C0630.m2566("ۢܽ") ^ i7) * (-39);
                        i4 = ((iM6981 ^ i8) * (-157)) ^ 509270314;
                        i5 = 894280777;
                        int i212 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr9 = sArr;
                        i10 = i212;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr9;
                        int i213 = i11;
                        i20 = i3;
                        i11 = i213;
                    } else {
                        iM2566 = C0630.m2566("ۧۜ") ^ i7;
                        i = ((iM2566 ^ i8) * (-20343)) ^ (-1816512973);
                        i2 = -1201310490;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1845081215:
                case 1356070257:
                    C0237.m1481();
                    C0422.m1963();
                    return false;
                case -1763637926:
                case 1039346444:
                    return C1294.m4369(componentName2.getClassName(), Main.class.getName());
                case -1739169100:
                case -438380797:
                    break;
                case -1686552626:
                case 1107174670:
                    i3 = i20;
                    i16 = 18981;
                    iM6981 = C2105.m6981("۠ۙ") ^ i8;
                    i4 = ((iM6981 ^ i7) * 619) ^ (-775498528);
                    i5 = -876467419;
                    int i214 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr10 = sArr;
                    i10 = i214;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr10;
                    int i215 = i11;
                    i20 = i3;
                    i11 = i215;
                    break;
                case -1578875425:
                case -317637157:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i31 = i20;
                    i11 = i11;
                    i3 = i31;
                    className = componentName2.getClassName();
                    AbstractC2021.m6565(className);
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C2105.m6981("ۛۡ") ^ i7;
                        i4 = ((iM6981 ^ i8) * 15813) ^ (-213872052);
                        i5 = -1691788385;
                        int i216 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr11 = sArr;
                        i10 = i216;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr11;
                        int i217 = i11;
                        i20 = i3;
                        i11 = i217;
                    } else {
                        i22 = i22;
                        sArr5 = sArr5;
                        sArr = sArr;
                        int iM2569 = C0630.m2566("ܶ۠") ^ i7;
                        i10 = iM2569 ^ 2114314419;
                        i9 = ((iM2569 ^ i8) * 735) ^ 417684868;
                        int i32 = i11;
                        i20 = i3;
                        i11 = i32;
                    }
                    break;
                case -1570434649:
                case 1784812908:
                    if (C0422.f1886 > 0) {
                        iM2566 = C2105.m6981("ۘۧ") ^ i7;
                        i = ((iM2566 ^ i8) * 15837) ^ 1919434586;
                        i2 = 769199198;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr;
                        i22 = i22;
                        sArr5 = sArr5;
                        int i33 = i20;
                        i11 = i11;
                        i3 = i33;
                        iM6981 = (C0630.m2566("᩺ۜ") ^ i8) * 71;
                        i4 = ((iM6981 ^ i7) * (-17825)) ^ (-1780958371);
                        i5 = -362969181;
                        int i218 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr12 = sArr;
                        i10 = i218;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr12;
                        int i219 = i11;
                        i20 = i3;
                        i11 = i219;
                    }
                    break;
                case -1550398132:
                case -1334067708:
                    if (RunnableC0588.f2309 >= 0) {
                        sArr = sArr;
                        i22 = i22;
                        sArr5 = sArr5;
                        int i34 = i20;
                        i11 = i11;
                        i3 = i34;
                        iM6981 = (C0630.m2566("᩺ۜ") ^ i8) * 71;
                        i4 = ((iM6981 ^ i7) * (-17825)) ^ (-1780958371);
                        i5 = -362969181;
                        int i2110 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr13 = sArr;
                        i10 = i2110;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr13;
                        int i2111 = i11;
                        i20 = i3;
                        i11 = i2111;
                    } else {
                        iM2566 = C2105.m6981("ۢۧ") ^ i8;
                        i = ((iM2566 ^ i7) * 23001) ^ (-726970297);
                        i2 = -780000658;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1279412097:
                case 237577156:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i35 = i20;
                    i11 = i11;
                    i3 = i35;
                    s2 = 5580;
                    if (C1128.m3851() <= 0) {
                        iM6981 = (i7 - C0630.m2566("ᩴۧ")) * (-5);
                        i4 = ((iM6981 ^ i8) * 19217) ^ (-1989695082);
                        i5 = 1750554975;
                    } else {
                        iM6981 = (C2105.m6981("ۜ֨") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6981 ^ i8) * (-31475)) ^ 76756376;
                        i5 = 1132962312;
                    }
                    int i2112 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr14 = sArr;
                    i10 = i2112;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr14;
                    int i2113 = i11;
                    i20 = i3;
                    i11 = i2113;
                    break;
                case -1271998725:
                case 491498322:
                    C2958.m9034();
                    C2167.m7155();
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i36 = i20;
                    i11 = i11;
                    i3 = i36;
                    iM6981 = (i7 - C0630.m2566("ᩴۧ")) * (-5);
                    i4 = ((iM6981 ^ i8) * 19217) ^ (-1989695082);
                    i5 = 1750554975;
                    int i2114 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr15 = sArr;
                    i10 = i2114;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr15;
                    int i2115 = i11;
                    i20 = i3;
                    i11 = i2115;
                    break;
                case -1123835068:
                case -149700329:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i37 = i20;
                    i11 = i11;
                    i3 = i37;
                    if (i19 - (s * s2) < 0) {
                        iM6981 = (C0630.m2566("֨ᩳ") + i7) * (-69);
                        i4 = ((iM6981 ^ i8) * 22797) ^ (-744688552);
                        i5 = -395101594;
                    } else {
                        iM6981 = C2105.m6981("ۤ֡") ^ i8;
                        i4 = ((iM6981 ^ i7) * (-20331)) ^ (-812345752);
                        i5 = 1973606171;
                    }
                    int i2116 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr16 = sArr;
                    i10 = i2116;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr16;
                    int i2117 = i11;
                    i20 = i3;
                    i11 = i2117;
                    break;
                case -1098753667:
                case 1812177893:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("ۢۧ") ^ i8;
                        i = ((iM2566 ^ i7) * 23001) ^ (-726970297);
                        i2 = -780000658;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr;
                        i22 = i22;
                        sArr5 = sArr5;
                        int i38 = i20;
                        i11 = i11;
                        i3 = i38;
                        iM6981 = C0630.m2566("᩺֫") ^ i7;
                        i4 = ((iM6981 ^ i8) * 21641) ^ 2096773325;
                        i5 = -1828222146;
                        int i2118 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr17 = sArr;
                        i10 = i2118;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr17;
                        int i2119 = i11;
                        i20 = i3;
                        i11 = i2119;
                    }
                    break;
                case -1065621424:
                case -6366732:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i39 = i20;
                    i11 = i11;
                    i3 = i39;
                    taskInfo = appTask.getTaskInfo();
                    if (Build.VERSION.SDK_INT >= 23) {
                        iM6981 = C2105.m6981("ܿ۠") ^ i7;
                        i4 = ((iM6981 ^ i8) * (-17345)) ^ (-2102582359);
                        i5 = -1151788157;
                    } else {
                        iM6981 = C2105.m6981("ۛۧ") ^ i8;
                        i4 = ((iM6981 ^ i7) * 21821) ^ 309295351;
                        i5 = -990278834;
                    }
                    int i21110 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr18 = sArr;
                    i10 = i21110;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr18;
                    int i21111 = i11;
                    i20 = i3;
                    i11 = i21111;
                    break;
                case -944570481:
                case 1687512543:
                    b = -1;
                    sArr5 = sArr5;
                    int i220 = i20;
                    i11 = i11;
                    i3 = i220;
                    r6 = b;
                    iM2567 = C0630.m2566("۟֡") ^ i8;
                    sArr = sArr;
                    i9 = ((iM2567 ^ i7) * 7607) ^ 1593247922;
                    i6 = -2103819490;
                    r7 = r6;
                    int i221 = iM2567 ^ i6;
                    i22 = i22;
                    int i222 = i11;
                    i20 = i3;
                    i11 = i222;
                    short[] sArr19 = sArr;
                    i10 = i221;
                    sArr5 = sArr5;
                    sArr = sArr19;
                    break;
                case -922319767:
                case 1769999312:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i40 = i20;
                    i11 = i11;
                    i3 = i40;
                    s = sArr4[c];
                    i18 = s * s;
                    if (C4263.m12819() < 0) {
                        iM6981 = (C2105.m6981("ۢ֫") ^ i8) * (-85);
                        i4 = ((iM6981 ^ i7) * (-27237)) ^ 205927598;
                        i5 = 2069494311;
                        int i21112 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr110 = sArr;
                        i10 = i21112;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr110;
                        int i21113 = i11;
                        i20 = i3;
                        i11 = i21113;
                    } else {
                        i22 = i22;
                        sArr5 = sArr5;
                        sArr = sArr;
                        int iM25610 = C0630.m2566("ܶ۠") ^ i7;
                        i10 = iM25610 ^ 2114314419;
                        i9 = ((iM25610 ^ i8) * 735) ^ 417684868;
                        int i310 = i11;
                        i20 = i3;
                        i11 = i310;
                    }
                    break;
                case -870838269:
                case -458844268:
                    b = 2;
                    sArr5 = sArr5;
                    int i223 = i20;
                    i11 = i11;
                    i3 = i223;
                    r6 = b;
                    iM2567 = C0630.m2566("۟֡") ^ i8;
                    sArr = sArr;
                    i9 = ((iM2567 ^ i7) * 7607) ^ 1593247922;
                    i6 = -2103819490;
                    r7 = r6;
                    int i224 = iM2567 ^ i6;
                    i22 = i22;
                    int i225 = i11;
                    i20 = i3;
                    i11 = i225;
                    short[] sArr111 = sArr;
                    i10 = i224;
                    sArr5 = sArr5;
                    sArr = sArr111;
                    break;
                case -698426751:
                case -263578428:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i7 - C0630.m2566("ۖۨ")) * 69;
                        i = ((iM2566 ^ i8) * 11365) ^ (-1285651502);
                        i2 = 501236250;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr;
                        i22 = i22;
                        sArr5 = sArr5;
                        int i311 = i20;
                        i11 = i11;
                        i3 = i311;
                        iM6981 = C0630.m2566("᩺֫") ^ i7;
                        i4 = ((iM6981 ^ i8) * 21641) ^ 2096773325;
                        i5 = -1828222146;
                        int i21114 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr112 = sArr;
                        i10 = i21114;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr112;
                        int i21115 = i11;
                        i20 = i3;
                        i11 = i21115;
                    }
                    break;
                case -683601318:
                case 1796600082:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i41 = i20;
                    i11 = i11;
                    i3 = i41;
                    if (!ViewOnClickListenerC1958.m6437(className, C21923.m49334(sArr, i22, i3, i16))) {
                        sArr = sArr;
                        iM6981 = (C0630.m2566("ۢܽ") ^ i7) * (-39);
                        i4 = ((iM6981 ^ i8) * (-157)) ^ 509270314;
                        i5 = 894280777;
                        int i21116 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr113 = sArr;
                        i10 = i21116;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr113;
                        int i21117 = i11;
                        i20 = i3;
                        i11 = i21117;
                    } else {
                        r6 = z2;
                        iM2567 = C0630.m2566("۟֡") ^ i8;
                        sArr = sArr;
                        i9 = ((iM2567 ^ i7) * 7607) ^ 1593247922;
                        i6 = -2103819490;
                        r7 = r6;
                        int i226 = iM2567 ^ i6;
                        i22 = i22;
                        int i227 = i11;
                        i20 = i3;
                        i11 = i227;
                        short[] sArr114 = sArr;
                        i10 = i226;
                        sArr5 = sArr5;
                        sArr = sArr114;
                    }
                    break;
                case -578426993:
                case 885896572:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i42 = i20;
                    i11 = i11;
                    i3 = i42;
                    c = 'J';
                    if (C3911.m11924() <= 0) {
                        iM6981 = C0630.m2566("᩺֫") ^ i7;
                        i4 = ((iM6981 ^ i8) * 21641) ^ 2096773325;
                        i5 = -1828222146;
                    } else {
                        iM6981 = C0630.m2566("ۨۡ") ^ i8;
                        i4 = ((iM6981 ^ i7) * (-8167)) ^ 226387285;
                        i5 = -44404296;
                    }
                    int i21118 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr115 = sArr;
                    i10 = i21118;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr115;
                    int i21119 = i11;
                    i20 = i3;
                    i11 = i21119;
                    break;
                case -473931307:
                case -179556232:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i43 = i20;
                    i11 = i11;
                    i3 = i43;
                    sArr4 = f36441;
                    if (C0483.m2121()) {
                        iM6981 = (i7 - C2105.m6981("᩸ۚ")) * 57;
                        i4 = ((iM6981 ^ i8) * (-17603)) ^ (-69098772);
                        i5 = -1708580129;
                    } else {
                        iM6981 = (C0630.m2566("֡ۜ") ^ i8) * (-7);
                        i4 = ((iM6981 ^ i7) * 2087) ^ 1320286433;
                        i5 = -82465353;
                    }
                    int i211110 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr116 = sArr;
                    i10 = i211110;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr116;
                    int i211111 = i11;
                    i20 = i3;
                    i11 = i211111;
                    break;
                case -335882289:
                case 1162422859:
                    if (!C1294.m4369(className, C3663.m11162(sArr5, i12, i17, i16))) {
                        sArr = sArr;
                        i22 = i22;
                        sArr5 = sArr5;
                        int i312 = i20;
                        i11 = i11;
                        i3 = i312;
                        iM6981 = (C0630.m2566("ۢܽ") ^ i7) * (-39);
                        i4 = ((iM6981 ^ i8) * (-157)) ^ 509270314;
                        i5 = 894280777;
                        int i211112 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr117 = sArr;
                        i10 = i211112;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr117;
                        int i211113 = i11;
                        i20 = i3;
                        i11 = i211113;
                    } else {
                        iM2566 = C0630.m2566("ᩳ֫") ^ i8;
                        i = ((iM2566 ^ i7) * 26813) ^ 1527293338;
                        i2 = 3402308;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -257591030:
                case 271182792:
                    recentTaskInfo = taskInfo;
                    i3 = i20;
                    componentName = recentTaskInfo.origActivity;
                    componentName2 = componentName;
                    iM2567 = (C0630.m2566("ۢ۫") ^ i7) * 47;
                    taskInfo = recentTaskInfo;
                    i9 = ((iM2567 ^ i8) * (-28897)) ^ (-560557975);
                    i6 = -179671993;
                    r7 = r7;
                    int i228 = iM2567 ^ i6;
                    i22 = i22;
                    int i229 = i11;
                    i20 = i3;
                    i11 = i229;
                    short[] sArr118 = sArr;
                    i10 = i228;
                    sArr5 = sArr5;
                    sArr = sArr118;
                    break;
                case -89440728:
                case 867206141:
                    sArr3 = f36441;
                    i15 = 124;
                    i11 = 24;
                    if (C3019.f9544 < 0) {
                        iM2566 = C2105.m6981("᩹ۗ") ^ i8;
                        i = ((iM2566 ^ i7) * 24905) ^ 1682040821;
                        i2 = 1418854562;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        i3 = i20;
                        sArr = sArr;
                        i22 = i22;
                        i11 = 24;
                        sArr5 = sArr5;
                        iM6981 = (C0630.m2566("֡ۜ") ^ i8) * (-7);
                        i4 = ((iM6981 ^ i7) * 2087) ^ 1320286433;
                        i5 = -82465353;
                        int i211114 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr119 = sArr;
                        i10 = i211114;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr119;
                        int i211115 = i11;
                        i20 = i3;
                        i11 = i211115;
                    }
                    break;
                case -64627971:
                case 908767790:
                    b = 1;
                    sArr5 = sArr5;
                    int i2210 = i20;
                    i11 = i11;
                    i3 = i2210;
                    r6 = b;
                    iM2567 = C0630.m2566("۟֡") ^ i8;
                    sArr = sArr;
                    i9 = ((iM2567 ^ i7) * 7607) ^ 1593247922;
                    i6 = -2103819490;
                    r7 = r6;
                    int i2211 = iM2567 ^ i6;
                    i22 = i22;
                    int i2212 = i11;
                    i20 = i3;
                    i11 = i2212;
                    short[] sArr1110 = sArr;
                    i10 = i2211;
                    sArr5 = sArr5;
                    sArr = sArr1110;
                    break;
                case 4559183:
                case 559144006:
                    return z;
                case 160138871:
                case 359045860:
                    sArr = sArr;
                    i22 = i22;
                    sArr5 = sArr5;
                    int i44 = i20;
                    i11 = i11;
                    i3 = i44;
                    z = true;
                    switch (C2105.m6981(className)) {
                        case -1577057716:
                            iM6981 = (i7 - C2105.m6981("ܶۜ")) * 89;
                            i4 = ((iM6981 ^ i8) * (-29983)) ^ (-62108211);
                            i5 = 161719599;
                            break;
                        case -1350715006:
                            iM6981 = C0630.m2566("ܳۖ") ^ i8;
                            i4 = ((iM6981 ^ i7) * 11923) ^ 245507930;
                            i5 = 608822536;
                            break;
                        case 12451804:
                            iM6981 = C0630.m2566("֫ۛ") ^ i7;
                            i4 = ((iM6981 ^ i8) * (-26053)) ^ (-765742382);
                            i5 = 1961136805;
                            break;
                        case 1714856877:
                            iM6981 = C2105.m6981("᩻ۛ") ^ i8;
                            i4 = ((iM6981 ^ i7) * 23833) ^ (-787607832);
                            i5 = 1320610383;
                            break;
                        default:
                            iM6981 = (C0630.m2566("ۢܽ") ^ i7) * (-39);
                            i4 = ((iM6981 ^ i8) * (-157)) ^ 509270314;
                            i5 = 894280777;
                            break;
                    }
                    int i211116 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr1111 = sArr;
                    i10 = i211116;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr1111;
                    int i211117 = i11;
                    i20 = i3;
                    i11 = i211117;
                    break;
                case 269822499:
                case 1996763003:
                    sArr2 = f36441;
                    i13 = 99;
                    i14 = 25;
                    if (C0422.f1886 > 0) {
                        iM2566 = C0630.m2566("᩶ۡ") ^ i7;
                        i = ((iM2566 ^ i8) * (-25417)) ^ 209445596;
                        i2 = -1382812864;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr;
                        i22 = i22;
                        sArr5 = sArr5;
                        int i45 = i20;
                        i11 = i11;
                        i3 = i45;
                        iM6981 = (C0630.m2566("֡ۜ") ^ i8) * (-7);
                        i4 = ((iM6981 ^ i7) * 2087) ^ 1320286433;
                        i5 = -82465353;
                        int i211118 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr1112 = sArr;
                        i10 = i211118;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr1112;
                        int i211119 = i11;
                        i20 = i3;
                        i11 = i211119;
                    }
                    break;
                case 433000278:
                case 1275373598:
                    i3 = i20;
                    i16 = 24830;
                    iM6981 = C2105.m6981("۠ۙ") ^ i8;
                    i4 = ((iM6981 ^ i7) * 619) ^ (-775498528);
                    i5 = -876467419;
                    int i2111110 = iM6981 ^ i5;
                    i22 = i22;
                    short[] sArr1113 = sArr;
                    i10 = i2111110;
                    i9 = i4;
                    sArr5 = sArr5;
                    sArr = sArr1113;
                    int i2111111 = i11;
                    i20 = i3;
                    i11 = i2111111;
                    break;
                case 603368362:
                case 1888247728:
                    i11 = i11;
                    short[] sArr20 = sArr5;
                    short[] sArr21 = f36441;
                    i22 = 75;
                    i3 = 24;
                    if (C0237.m1481() < 0) {
                        int iM25611 = C0630.m2566("ۖܽ") ^ i8;
                        i = ((iM25611 ^ i7) * (-28717)) ^ 682407838;
                        i10 = iM25611 ^ (-484581291);
                        i11 = i11;
                        sArr5 = sArr20;
                        i20 = 24;
                        sArr = sArr21;
                        i9 = i;
                    } else {
                        sArr5 = sArr20;
                        sArr = sArr21;
                        int iM25612 = C0630.m2566("ܶ۠") ^ i7;
                        i10 = iM25612 ^ 2114314419;
                        i9 = ((iM25612 ^ i8) * 735) ^ 417684868;
                        int i313 = i11;
                        i20 = i3;
                        i11 = i313;
                    }
                    break;
                case 624573794:
                case 1624052468:
                    if (!C1294.m4369(className, C1420.m4902(sArr3, i15, i11, i16))) {
                        sArr = sArr;
                        i22 = i22;
                        sArr5 = sArr5;
                        int i314 = i20;
                        i11 = i11;
                        i3 = i314;
                        iM6981 = (C0630.m2566("ۢܽ") ^ i7) * (-39);
                        i4 = ((iM6981 ^ i8) * (-157)) ^ 509270314;
                        i5 = 894280777;
                        int i2111112 = iM6981 ^ i5;
                        i22 = i22;
                        short[] sArr1114 = sArr;
                        i10 = i2111112;
                        i9 = i4;
                        sArr5 = sArr5;
                        sArr = sArr1114;
                        int i2111113 = i11;
                        i20 = i3;
                        i11 = i2111113;
                    } else {
                        iM2566 = (C2105.m6981("ۨܽ") ^ i8) * (-89);
                        i = ((iM2566 ^ i7) * 2917) ^ 439380153;
                        i2 = 129437832;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case 647663812:
                case 1190612269:
                    break;
                case 836390394:
                case 890693151:
                    recentTaskInfo = taskInfo;
                    i3 = i20;
                    componentName = recentTaskInfo.baseActivity;
                    componentName2 = componentName;
                    iM2567 = (C0630.m2566("ۢ۫") ^ i7) * 47;
                    taskInfo = recentTaskInfo;
                    i9 = ((iM2567 ^ i8) * (-28897)) ^ (-560557975);
                    i6 = -179671993;
                    r7 = r7;
                    int i2213 = iM2567 ^ i6;
                    i22 = i22;
                    int i2214 = i11;
                    i20 = i3;
                    i11 = i2214;
                    short[] sArr1115 = sArr;
                    i10 = i2213;
                    sArr5 = sArr5;
                    sArr = sArr1115;
                    break;
                case 1429608098:
                case 2062153895:
                    sArr5 = f36441;
                    i12 = 148;
                    i17 = 16;
                    if (!C3683.m11222()) {
                        iM2566 = C2105.m6981("۬ۖ") ^ i7;
                        i = ((iM2566 ^ i8) * (-9165)) ^ (-356459159);
                        i2 = 1706365112;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        int i46 = i20;
                        i11 = i11;
                        i3 = i46;
                        int iM25613 = C0630.m2566("ܶ۠") ^ i7;
                        i10 = iM25613 ^ 2114314419;
                        i9 = ((iM25613 ^ i8) * 735) ^ 417684868;
                        int i315 = i11;
                        i20 = i3;
                        i11 = i315;
                    }
                    break;
                case 1491989578:
                case 1959781451:
                    return z2;
                default:
                    switch (r7) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            iM2566 = (i7 - C2105.m6981("᩻᩻")) * 61;
                            i = ((iM2566 ^ i8) * 4943) ^ 256293414;
                            i2 = -916679857;
                            break;
                        default:
                            iM2566 = C2105.m6981("֡֫") ^ i8;
                            i = ((iM2566 ^ i7) * (-22191)) ^ (-1773135463);
                            i2 = -1564633000;
                            break;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12915 m29695(Uri uri) {
        C12915 c12915 = null;
        C12915 c12916 = null;
        int i = -84109240;
        int i2 = C1128.f4106;
        int i3 = C4263.f13799;
        int iM2566 = C0630.m2566("᩷ۙ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-16489)) ^ (-280149733);
        int i5 = 1532063235;
        while (true) {
            i = ((((i ^ i3) * (-1215)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2112118711:
                case 1495708041:
                    C12915 c12917 = f36442;
                    f36442 = c12916;
                    return c12917;
                case -2025575942:
                case 566926090:
                    return c12916;
                case -2023347165:
                case 768087663:
                    if (C0630.m2564()) {
                        iM2566 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25947)) ^ (-199399857);
                        i5 = 377456036;
                    } else {
                        iM2566 = C2105.m6981("᩷ۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-475)) ^ 783029554;
                        i5 = 962509786;
                    }
                    break;
                case -2016619839:
                case -1903948449:
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25947)) ^ (-199399857);
                        i5 = 377456036;
                    } else {
                        iM2566 = C2105.m6981("᩺᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-13141)) ^ (-400818362);
                        i5 = -748302961;
                    }
                    break;
                case -1873904020:
                case 1854116914:
                    if (!C1916.f6442) {
                        iM2566 = (C0630.m2566("ۛۜ") + i3) * (-127);
                        i4 = ((iM2566 ^ i2) * (-7815)) ^ (-820226099);
                        i5 = 1609839150;
                    } else {
                        iM2566 = C2105.m6981("֡ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21013) ^ (-124757071);
                        i5 = 904523762;
                    }
                    break;
                case -1716924621:
                case 1464243004:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C2105.m6981("ܺ᩵") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 8337) ^ (-591680970);
                        i5 = -1355316766;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۗ۠")) * (-103);
                        i4 = ((iM2566 ^ i2) * (-12541)) ^ (-1122349994);
                        i5 = -1679158479;
                    }
                    break;
                case -1498208225:
                case 28668861:
                    C2958.m9034();
                    iM2566 = (C0630.m2566("ۛۜ") + i3) * (-127);
                    i4 = ((iM2566 ^ i2) * (-7815)) ^ (-820226099);
                    i5 = 1609839150;
                    break;
                case -1132402287:
                case 697754235:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C2105.m6981("ۗ᩷") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 8069) ^ 1990051390;
                        i5 = 276557732;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۧۘ")) * q.h;
                        i4 = ((iM2566 ^ i3) * (-6499)) ^ 1812566633;
                        i5 = 708205189;
                    }
                    break;
                case -622274679:
                case 186331018:
                    if (C5695.m16023() >= 0) {
                        iM2566 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25947)) ^ (-199399857);
                        i5 = 377456036;
                    } else {
                        iM2566 = C2105.m6981("۬ۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 5753) ^ 394643140;
                        i5 = 1012108837;
                    }
                    break;
                case -415585380:
                case 428389779:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25947)) ^ (-199399857);
                        i5 = 377456036;
                    } else {
                        iM2566 = C0630.m2566("ܳܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 17795) ^ 99607011;
                        i5 = -1998838054;
                    }
                    break;
                case -261588181:
                case 997520236:
                    C3746.m11369();
                    if (C0798.m2998() != 0) {
                        iM2566 = (C2105.m6981("ۗ᩷") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 8069) ^ 1990051390;
                        i5 = 276557732;
                    } else {
                        iM2566 = C2105.m6981("֡ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21013) ^ (-124757071);
                        i5 = 904523762;
                    }
                    break;
                case -132074724:
                case 1406554761:
                    c12915 = f36442;
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ۗ᩷") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 8069) ^ 1990051390;
                        i5 = 276557732;
                    } else {
                        iM2566 = C0630.m2566("᩻ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27963) ^ (-2088980534);
                        i5 = 1606527211;
                    }
                    break;
                case 37593118:
                case 409506992:
                    if (C0483.m2121()) {
                        iM2566 = (C0630.m2566("ۗ֨") + i3) * (-75);
                        i4 = ((iM2566 ^ i2) * 22557) ^ 1036507645;
                        i5 = 799409742;
                    } else {
                        iM2566 = (C0630.m2566("ۛۜ") + i3) * (-127);
                        i4 = ((iM2566 ^ i2) * (-7815)) ^ (-820226099);
                        i5 = 1609839150;
                    }
                    break;
                case 135232125:
                case 2029241257:
                    c12916 = null;
                    if (c12915 != null) {
                        iM2566 = C2105.m6981("ۙ֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-2273)) ^ 1056934444;
                        i5 = 1533488923;
                    } else {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 15827) ^ 1780570771;
                        i5 = 693007123;
                    }
                    break;
                case 168522304:
                case 836339538:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = (C2105.m6981("ܺ᩵") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 8337) ^ (-591680970);
                        i5 = -1355316766;
                    } else {
                        iM2566 = C0630.m2566("ܺᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 30469) ^ 721175809;
                        i5 = 60805688;
                    }
                    break;
                case 334168059:
                case 572749718:
                    C3245.m9925();
                    if (!C21923.m49329()) {
                        iM2566 = C2105.m6981("֡ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21013) ^ (-124757071);
                        i5 = 904523762;
                    } else {
                        iM2566 = (C2105.m6981("ܺ᩵") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 8337) ^ (-591680970);
                        i5 = -1355316766;
                    }
                    break;
                case 1118744275:
                case 1513026087:
                    C0237.m1481();
                    return null;
                case 1318949005:
                case 1957271446:
                    if (C7811.m20844() != 0) {
                        iM2566 = (C2105.m6981("ۗ᩷") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 8069) ^ 1990051390;
                        i5 = 276557732;
                    } else {
                        iM2566 = (C2105.m6981("ۨۚ") ^ i2) * (-97);
                        i4 = ((iM2566 ^ i3) * 11879) ^ 1548803868;
                        i5 = 1113865671;
                    }
                    break;
                default:
                    if (ViewOnClickListenerC1958.m6437(c12915.f38765, uri)) {
                        iM2566 = C0630.m2566("۟ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-24953)) ^ (-766717791);
                        i5 = 1369598582;
                    } else {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 15827) ^ 1780570771;
                        i5 = 693007123;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x02c6  */
    @Override // l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM6981;
        int i;
        int i2;
        boolean z;
        int i3;
        int iM2566;
        int i4;
        int i5;
        int i6;
        Intent intent;
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        String str2;
        int iM2567;
        int i11;
        int i12;
        int i13;
        Uri uriM36522;
        Uri uri;
        int i14 = C0483.f2088;
        int i15 = C3911.f12484;
        int iM2568 = (i15 - C0630.m2566("ۙܳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i16 = ((iM2568 ^ i14) * 12815) ^ 1966533601;
        ComponentName componentNameM29694 = null;
        AbstractC15440 abstractC15440M39867 = null;
        Iterator itM6374 = null;
        String str3 = null;
        ResolveInfo resolveInfo = null;
        Intent intent2 = null;
        String str4 = null;
        Uri uri2 = null;
        ActivityManager.AppTask appTask = null;
        int i17 = iM2568 ^ (-933007423);
        int taskId = 0;
        boolean z2 = false;
        int iM7032 = 0;
        boolean zM36507 = false;
        boolean zM7161 = false;
        boolean zM29697 = false;
        boolean zIsVisible = false;
        boolean z3 = false;
        Intent intentM12571 = null;
        int i18 = 741574141;
        int i19 = 0;
        int i20 = 0;
        C12915 c12915 = null;
        Intent intent3 = null;
        Iterator itM3596 = null;
        List<ActivityManager.AppTask> appTasks = null;
        ResolveInfo resolveInfo2 = null;
        String str5 = null;
        String str6 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z4 = false;
        List<ResolveInfo> list = null;
        int i24 = 0;
        while (true) {
            i18 = i17 ^ (i16 & (((i18 ^ i14) * 9939) >> 31));
            switch (i18) {
                case -2084083144:
                case -991869239:
                    if (zM7161) {
                        iM6981 = C0630.m2566("ܰܰ") ^ i14;
                        i = ((iM6981 ^ i15) * (-28003)) ^ (-1875767979);
                        i2 = -952449693;
                    } else {
                        iM6981 = C2105.m6981("ܰ۫") ^ i15;
                        i = ((iM6981 ^ i14) * 27145) ^ 817965696;
                        i2 = 1013427411;
                    }
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -2080432196:
                case -392704214:
                    str5 = str5;
                    str6 = str6;
                    ResolveInfo resolveInfo3 = resolveInfo;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    i3 = i19;
                    i24 = i24;
                    Uri uri3 = uri2;
                    try {
                        resolveInfo = resolveInfo3;
                        try {
                            uri2 = uri3;
                            try {
                                appTasks = appTasks;
                                taskId = taskId;
                                try {
                                    C12915 c12916 = new C12915(abstractC15440M39867.mo31567(), C1420.m4910(abstractC15440M39867), abstractC15440M39867.mo23127());
                                    f36442 = c12916;
                                    uriM36522 = c12916.f38765;
                                    int iM6982 = (C2105.m6981("᩻ᩴ") + i15) * 51;
                                    i13 = ((iM6982 ^ i14) * (-6461)) ^ (-1234240054);
                                    resolveInfo = resolveInfo;
                                    appTasks = appTasks;
                                    taskId = taskId;
                                    uri2 = uriM36522;
                                    intent3 = intent3;
                                    str5 = str5;
                                    i22 = i22;
                                    i17 = iM6982 ^ 380945757;
                                    i20 = i20;
                                    i24 = i24;
                                    i19 = i3;
                                    intent2 = intent2;
                                    intentM12571 = intentM12571;
                                    i16 = i13;
                                    str6 = str6;
                                } catch (Exception unused) {
                                    resolveInfo2 = resolveInfo2;
                                    iM2566 = C2105.m6981("᩶᩷") ^ i15;
                                    i4 = ((iM2566 ^ i14) * (-24981)) ^ 732021977;
                                    i5 = -1324949053;
                                    int i25 = iM2566 ^ i5;
                                    resolveInfo2 = resolveInfo2;
                                    appTasks = appTasks;
                                    str5 = str5;
                                    taskId = taskId;
                                    i17 = i25;
                                    uri2 = uri2;
                                    i24 = i24;
                                    i19 = i3;
                                    resolveInfo = resolveInfo;
                                    intent2 = intent2;
                                    intentM12571 = intentM12571;
                                    intent3 = intent3;
                                    i16 = i4;
                                    i22 = i22;
                                    str6 = str6;
                                    i20 = i20;
                                }
                            } catch (Exception unused2) {
                                appTasks = appTasks;
                                taskId = taskId;
                                resolveInfo2 = resolveInfo2;
                                iM2566 = C2105.m6981("᩶᩷") ^ i15;
                                i4 = ((iM2566 ^ i14) * (-24981)) ^ 732021977;
                                i5 = -1324949053;
                                int i26 = iM2566 ^ i5;
                                resolveInfo2 = resolveInfo2;
                                appTasks = appTasks;
                                str5 = str5;
                                taskId = taskId;
                                i17 = i26;
                                uri2 = uri2;
                                i24 = i24;
                                i19 = i3;
                                resolveInfo = resolveInfo;
                                intent2 = intent2;
                                intentM12571 = intentM12571;
                                intent3 = intent3;
                                i16 = i4;
                                i22 = i22;
                                str6 = str6;
                                i20 = i20;
                                break;
                            }
                        } catch (Exception unused3) {
                            uri2 = uri3;
                            appTasks = appTasks;
                            taskId = taskId;
                            resolveInfo2 = resolveInfo2;
                            iM2566 = C2105.m6981("᩶᩷") ^ i15;
                            i4 = ((iM2566 ^ i14) * (-24981)) ^ 732021977;
                            i5 = -1324949053;
                            int i27 = iM2566 ^ i5;
                            resolveInfo2 = resolveInfo2;
                            appTasks = appTasks;
                            str5 = str5;
                            taskId = taskId;
                            i17 = i27;
                            uri2 = uri2;
                            i24 = i24;
                            i19 = i3;
                            resolveInfo = resolveInfo;
                            intent2 = intent2;
                            intentM12571 = intentM12571;
                            intent3 = intent3;
                            i16 = i4;
                            i22 = i22;
                            str6 = str6;
                            i20 = i20;
                            break;
                        }
                    } catch (Exception unused4) {
                        resolveInfo = resolveInfo3;
                    }
                    break;
                case -2016078661:
                case -218569522:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    itM6374 = RunnableC1937.m6374(list);
                    iM2566 = (i14 - C0630.m2566("۠ۢ")) * 57;
                    i4 = ((iM2566 ^ i15) * (-28911)) ^ (-1084262900);
                    i5 = -528335387;
                    int i28 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i28;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -2004014025:
                case 851911214:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    C3746.m11371(c12915.f38763);
                    f36442 = null;
                    iM2566 = (i14 - C0630.m2566("۟ܰ")) * 77;
                    i4 = ((iM2566 ^ i15) * (-18551)) ^ 1918122916;
                    i5 = -948189889;
                    int i29 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i29;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -1954585251:
                case -1607540901:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    try {
                        abstractC15440M39867 = C16999.m39867(this);
                        zM36507 = abstractC15440M39867.m36507();
                        iM2566 = C2105.m6981("۠۫") ^ i14;
                        i4 = ((iM2566 ^ i15) * (-29619)) ^ 1107458845;
                        i5 = -748953069;
                    } catch (Exception unused5) {
                        iM2566 = C2105.m6981("᩶᩷") ^ i15;
                        i4 = ((iM2566 ^ i14) * (-24981)) ^ 732021977;
                        i5 = -1324949053;
                    }
                    int i210 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i210;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -1834774024:
                case 1924009653:
                    if (zM29697) {
                        iM6981 = (i15 - C2105.m6981("ۖۜ")) * (-9);
                        i = ((iM6981 ^ i14) * 17431) ^ 505385899;
                        i2 = 173427840;
                    } else {
                        iM6981 = (C0630.m2566("ۧ᩹") ^ i15) * 33;
                        i = ((iM6981 ^ i14) * 21923) ^ (-559567717);
                        i2 = 465188720;
                    }
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -1811494381:
                case 1543626542:
                    Intent intent4 = intentM12571;
                    int i30 = i19;
                    i20 = i20;
                    intent2 = intent2;
                    String str7 = str5;
                    String strM6573 = AbstractC2021.m6573(f36441, 242, 25, i30);
                    String strM10628 = RunnableC3474.m10628(intent4, strM6573);
                    if (strM10628 != null) {
                        int iM6983 = C2105.m6981("۬᩵") ^ i15;
                        i16 = ((iM6983 ^ i14) * (-2985)) ^ 399848651;
                        i20 = i20;
                        str4 = strM10628;
                        intent2 = intent2;
                        intentM12571 = intent4;
                        i17 = iM6983 ^ 1528045829;
                        str5 = str7;
                        i19 = i30;
                        str6 = strM6573;
                    } else {
                        i22 = i22;
                        i9 = taskId;
                        intentM12571 = intent4;
                        intent3 = intent3;
                        resolveInfo = resolveInfo;
                        uri2 = uri2;
                        str5 = str7;
                        str4 = strM10628;
                        i3 = i30;
                        appTasks = appTasks;
                        str6 = strM6573;
                        i10 = i24;
                        int iM6984 = C2105.m6981("᩷ۖ") ^ i14;
                        i6 = ((iM6984 ^ i15) * (-8091)) ^ (-1687478933);
                        i17 = iM6984 ^ (-570452935);
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                    }
                    break;
                case -1721154717:
                case 226433922:
                    i23 = appTask.getTaskInfo().id;
                    taskId = getTaskId();
                    iM6981 = (C2105.m6981("ۖܳ") + i15) * (-29);
                    i = ((iM6981 ^ i14) * (-6541)) ^ 145921276;
                    i2 = 600840738;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -1636889713:
                case 1369632025:
                    zIsVisible = appTask.getTaskInfo().isVisible();
                    iM6981 = (i14 - C0630.m2566("ܽ᩵")) * (-107);
                    i = ((iM6981 ^ i15) * 23177) ^ 1671424280;
                    i2 = -175560024;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -1599780857:
                case 650880637:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    resolveInfo2 = (ResolveInfo) RunnableC1108.m3791(itM3596);
                    if ((resolveInfo2.activityInfo.applicationInfo.flags & 129) == 0) {
                        resolveInfo2 = resolveInfo2;
                        intent = intent3;
                        int iM6985 = C2105.m6981("᩷ܶ") ^ i14;
                        i7 = ((iM6985 ^ i15) * 9655) ^ 580283984;
                        i8 = iM6985 ^ (-926425701);
                        appTasks = appTasks;
                        str6 = str6;
                        taskId = taskId;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent;
                        i24 = i24;
                        i19 = i3;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i7;
                        i22 = i22;
                        i20 = i20;
                        String str8 = str5;
                        i17 = i8;
                        str5 = str8;
                    } else {
                        iM2566 = C2105.m6981("ܽۚ") ^ i14;
                        i4 = ((iM2566 ^ i15) * (-2673)) ^ 209157496;
                        i5 = 1723442097;
                        int i211 = iM2566 ^ i5;
                        resolveInfo2 = resolveInfo2;
                        appTasks = appTasks;
                        str5 = str5;
                        taskId = taskId;
                        i17 = i211;
                        uri2 = uri2;
                        i24 = i24;
                        i19 = i3;
                        resolveInfo = resolveInfo;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        intent3 = intent3;
                        i16 = i4;
                        i22 = i22;
                        str6 = str6;
                        i20 = i20;
                    }
                    break;
                case -1599497522:
                case -609624609:
                    if (z3) {
                        iM6981 = C2105.m6981("ۡ۬") ^ i14;
                        i = ((iM6981 ^ i15) * (-25655)) ^ (-1135624703);
                        i2 = 1643573784;
                    } else {
                        iM6981 = (C0630.m2566("ܽ֡") ^ i15) * (-71);
                        i = ((iM6981 ^ i14) * 15177) ^ (-890148718);
                        i2 = -1338860390;
                    }
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -1463876804:
                case 1311709148:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    if (C0483.m2123(itM6374)) {
                        iM2566 = (C0630.m2566("ܶܿ") ^ i15) * 17;
                        i4 = ((iM2566 ^ i14) * (-4023)) ^ 1324700276;
                        i5 = 1623234050;
                    } else {
                        iM2566 = (i14 - C0630.m2566("ۜۚ")) * 39;
                        i4 = ((iM2566 ^ i15) * (-13133)) ^ 2106108566;
                        i5 = -881508261;
                    }
                    int i212 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i212;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -1349541131:
                case 364249263:
                    str2 = str5;
                    str = str6;
                    i9 = taskId;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i10 = i24;
                    appTasks = appTasks;
                    if (str3 == null) {
                        str5 = str2;
                        str6 = str;
                        int iM6986 = C2105.m6981("᩷ۖ") ^ i14;
                        i6 = ((iM6986 ^ i15) * (-8091)) ^ (-1687478933);
                        i17 = iM6986 ^ (-570452935);
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                    } else {
                        iM2567 = (C2105.m6981("ۜ۟") ^ i14) * (-5);
                        i11 = ((iM2567 ^ i15) * 12145) ^ (-143325719);
                        i12 = 1506383803;
                        int i31 = iM2567 ^ i12;
                        appTasks = appTasks;
                        str6 = str;
                        taskId = i9;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                        Intent intent5 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i11;
                        i24 = i10;
                        i19 = i3;
                        intent2 = intent5;
                        String str9 = str2;
                        i17 = i31;
                        str5 = str9;
                    }
                    break;
                case -1318949903:
                case 340926083:
                    if (i22 >= 32) {
                        iM6981 = C0630.m2566("֡֨") ^ i15;
                        i = ((iM6981 ^ i14) * (-12771)) ^ 726221083;
                        i2 = 2022480317;
                    } else {
                        iM6981 = C0630.m2566("֨ۚ") ^ i14;
                        i = ((iM6981 ^ i15) * (-5779)) ^ (-783189579);
                        i2 = -765658189;
                    }
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -1309403720:
                case 401059847:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    if (C1773.m5910(itM3596)) {
                        iM2566 = (i15 - C2105.m6981("᩵۟")) * (-33);
                        i4 = ((iM2566 ^ i14) * (-20289)) ^ (-2117761904);
                        i5 = 468260328;
                    } else {
                        iM2566 = (C2105.m6981("ۧ۫") ^ i15) * (-89);
                        i4 = ((iM2566 ^ i14) * (-23117)) ^ (-635513815);
                        i5 = 1030280844;
                    }
                    int i213 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i213;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -1260670663:
                case 1388684722:
                    i3 = 12519;
                    iM2566 = C0630.m2566("ܰ᩸") ^ i15;
                    i4 = ((iM2566 ^ i14) * (-29651)) ^ 559932709;
                    i5 = 338949226;
                    int i214 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i214;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -1181085041:
                case 1241053170:
                    Intent intent6 = intent3;
                    ActivityInfo activityInfo = resolveInfo2.activityInfo;
                    intent6.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    C21923.m49344(this, intent6);
                    RunnableC1108.m3781(this);
                    break;
                case -1176066393:
                case -67385484:
                    if (i23 != taskId) {
                        iM6981 = C2105.m6981("ܳ᩷") ^ i15;
                        i = ((iM6981 ^ i14) * (-18169)) ^ (-927236533);
                        i2 = -1114228732;
                    } else {
                        z = z4;
                        z3 = z;
                        iM6981 = (i14 - C2105.m6981("᩵ܳ")) * (-25);
                        i = ((iM6981 ^ i15) * 11733) ^ (-809464129);
                        i2 = -294340548;
                    }
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -1109525472:
                case 1534453685:
                    z = true;
                    z3 = z;
                    iM6981 = (i14 - C2105.m6981("᩵ܳ")) * (-25);
                    i = ((iM6981 ^ i15) * 11733) ^ (-809464129);
                    i2 = -294340548;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -1107823079:
                case 813477723:
                    int i32 = C19568.f63245;
                    Intent intent7 = new Intent(this, (Class<?>) ActivityC16315.class);
                    intent7.setAction(str5);
                    C3663.m11172(intent7, str6, str4);
                    intent7.setType(str3);
                    C0798.m3009(intent7, i21);
                    C0798.m3009(intent7, i20);
                    intentM12571.putExtra(AbstractC2021.m6573(f36441, 267, 15, i19), z2);
                    m29696((Activity) this);
                    C22628.m50617(this, intent7);
                    break;
                case -1093306320:
                case 1456073940:
                    appTask.moveToFront();
                    iM6981 = (C0630.m2566("ܽ֡") ^ i15) * (-71);
                    i = ((iM6981 ^ i14) * 15177) ^ (-890148718);
                    i2 = -1338860390;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -832688910:
                case -85653074:
                    i24 = 0;
                    iM6981 = (C2105.m6981("ۜ᩹") ^ i14) * (-3);
                    i = ((iM6981 ^ i15) * (-14637)) ^ (-968436826);
                    i2 = 2127556316;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -729991436:
                case -54022849:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    short s = f36441[164];
                    int i33 = s + 14582;
                    int i34 = (s * s) + 212634724;
                    if ((i34 + i34) - (i33 * i33) >= 0) {
                        iM2566 = (C2105.m6981("۫᩷") + i14) * (-77);
                        i4 = ((iM2566 ^ i15) * 21775) ^ 939510003;
                        i5 = -1328345169;
                    } else {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i15;
                        i4 = ((iM2566 ^ i14) * (-19629)) ^ 2146339679;
                        i5 = -1861126918;
                    }
                    int i215 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i215;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -677772252:
                case -396552519:
                    i22 = Build.VERSION.SDK_INT;
                    iM6981 = (i14 - C0630.m2566("ۧᩳ")) * (-39);
                    i = ((iM6981 ^ i15) * 13453) ^ (-2015184240);
                    i2 = 361798524;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -656108489:
                case -253524256:
                    i24++;
                    iM6981 = (C2105.m6981("ۜ᩹") ^ i14) * (-3);
                    i = ((iM6981 ^ i15) * (-14637)) ^ (-968436826);
                    i2 = 2127556316;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -635084523:
                case 104326662:
                    int i35 = i22;
                    String str10 = str6;
                    int i36 = taskId;
                    Intent intent8 = intentM12571;
                    Intent intent9 = intent2;
                    int i37 = i19;
                    appTasks = ((ActivityManager) RunnableC1108.m3793(this, C3746.m11357(f36441, 192, 8, i37))).getAppTasks();
                    componentNameM29694 = m29694(this, appTasks);
                    z2 = true;
                    int iM6987 = C2105.m6981("ۢܺ") ^ i14;
                    int i38 = ((iM6987 ^ i15) * 6959) ^ (-943517164);
                    resolveInfo2 = resolveInfo2;
                    uri2 = uri2;
                    str5 = str5;
                    i24 = i24;
                    i19 = i37;
                    i17 = iM6987 ^ 2131580352;
                    resolveInfo = resolveInfo;
                    intent2 = intent9;
                    str6 = str10;
                    intentM12571 = intent8;
                    intent3 = intent3;
                    i16 = i38;
                    i22 = i35;
                    taskId = i36;
                    i20 = 67108864;
                    break;
                case -628854915:
                case 805019880:
                    iM7032 = C2126.m7032(appTasks);
                    iM6981 = C2105.m6981("ᩴ۠") ^ i14;
                    i = ((iM6981 ^ i15) * (-21489)) ^ 2037152250;
                    i2 = 633693505;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -627597379:
                case 903829662:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    uri2 = uri2;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    appTasks = appTasks;
                    intent3 = intent3;
                    i3 = i19;
                    i24 = i24;
                    ResolveInfo resolveInfo4 = (ResolveInfo) C2272.m7513(itM6374);
                    if (!C7811.m20838(resolveInfo4.activityInfo.packageName, ServiceConnectionC3453.m10568(f36441, 226, 11, i3))) {
                        int iM2569 = C0630.m2566("ܿܰ") ^ i15;
                        i13 = ((iM2569 ^ i14) * 3443) ^ (-1127812431);
                        intent3 = intent3;
                        appTasks = appTasks;
                        i22 = i22;
                        taskId = taskId;
                        i20 = i20;
                        uri2 = uri2;
                        resolveInfo = resolveInfo4;
                        str5 = str5;
                        i17 = iM2569 ^ (-2070505393);
                        i24 = i24;
                        i19 = i3;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i13;
                        str6 = str6;
                    } else {
                        resolveInfo = resolveInfo4;
                        iM2566 = (i14 - C0630.m2566("۠ۢ")) * 57;
                        i4 = ((iM2566 ^ i15) * (-28911)) ^ (-1084262900);
                        i5 = -528335387;
                        int i216 = iM2566 ^ i5;
                        resolveInfo2 = resolveInfo2;
                        appTasks = appTasks;
                        str5 = str5;
                        taskId = taskId;
                        i17 = i216;
                        uri2 = uri2;
                        i24 = i24;
                        i19 = i3;
                        resolveInfo = resolveInfo;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        intent3 = intent3;
                        i16 = i4;
                        i22 = i22;
                        str6 = str6;
                        i20 = i20;
                    }
                    break;
                case -604138923:
                case 475740794:
                    if (i24 < iM7032) {
                        iM6981 = (C2105.m6981("ܿۢ") ^ i15) * 89;
                        i = ((iM6981 ^ i14) * 23259) ^ 1015368519;
                        i2 = 64643985;
                    } else {
                        iM6981 = C0630.m2566("ܰܰ") ^ i14;
                        i = ((iM6981 ^ i15) * (-28003)) ^ (-1875767979);
                        i2 = -952449693;
                    }
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -410583627:
                case -7475316:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    appTasks = appTasks;
                    i3 = i19;
                    i24 = i24;
                    intent = new Intent(intentM12571.getAction());
                    intent.setDataAndType(intentM12571.getData(), intentM12571.getType());
                    C1711.m5738(intent, i21);
                    C2837.m8731(intent, intentM12571.getData());
                    List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent, 65536);
                    list = listQueryIntentActivities;
                    itM3596 = C1047.m3596(listQueryIntentActivities);
                    int iM6988 = C2105.m6981("᩷ܶ") ^ i14;
                    i7 = ((iM6988 ^ i15) * 9655) ^ 580283984;
                    i8 = iM6988 ^ (-926425701);
                    appTasks = appTasks;
                    str6 = str6;
                    taskId = taskId;
                    uri2 = uri2;
                    resolveInfo = resolveInfo;
                    intent3 = intent;
                    i24 = i24;
                    i19 = i3;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    i16 = i7;
                    i22 = i22;
                    i20 = i20;
                    String str11 = str5;
                    i17 = i8;
                    str5 = str11;
                    break;
                case -379739721:
                case 803881222:
                    str5 = str5;
                    intentM12571 = intentM12571;
                    i3 = i19;
                    i20 = i20;
                    try {
                        Intent intent10 = new Intent();
                        i24 = i24;
                        ComponentName componentName = componentNameM29694;
                        try {
                            intent10.setComponent(componentName);
                            C0798.m3009(intent10, i21);
                            C1711.m5738(intent10, i20);
                            componentNameM29694 = componentName;
                            try {
                                i22 = i22;
                                str6 = str6;
                                try {
                                    try {
                                        intent10.setAction(C2520.m8030(f36441, 282, 26, i3));
                                        uri = uri2;
                                        try {
                                            intent10.setData(uri);
                                            zM7161 = C2167.m7161(appTasks);
                                            int iM6989 = (C2105.m6981("ۧܿ") + i14) * 67;
                                            intentM12571 = intentM12571;
                                            uri2 = uri;
                                            i16 = ((iM6989 ^ i15) * 12633) ^ 2038450229;
                                            i24 = i24;
                                            str6 = str6;
                                            i19 = i3;
                                            intent2 = intent10;
                                            str5 = str5;
                                            i17 = iM6989 ^ (-440532407);
                                            i22 = i22;
                                        } catch (Exception unused6) {
                                            intent2 = intent10;
                                            appTasks = appTasks;
                                            taskId = taskId;
                                            resolveInfo2 = resolveInfo2;
                                            intent3 = intent3;
                                            resolveInfo = resolveInfo;
                                            uri2 = uri;
                                            iM2566 = C2105.m6981("᩶᩷") ^ i15;
                                            i4 = ((iM2566 ^ i14) * (-24981)) ^ 732021977;
                                            i5 = -1324949053;
                                            int i217 = iM2566 ^ i5;
                                            resolveInfo2 = resolveInfo2;
                                            appTasks = appTasks;
                                            str5 = str5;
                                            taskId = taskId;
                                            i17 = i217;
                                            uri2 = uri2;
                                            i24 = i24;
                                            i19 = i3;
                                            resolveInfo = resolveInfo;
                                            intent2 = intent2;
                                            intentM12571 = intentM12571;
                                            intent3 = intent3;
                                            i16 = i4;
                                            i22 = i22;
                                            str6 = str6;
                                        }
                                    } catch (Exception unused7) {
                                        intent2 = intent10;
                                        resolveInfo2 = resolveInfo2;
                                        appTasks = appTasks;
                                        iM2566 = C2105.m6981("᩶᩷") ^ i15;
                                        i4 = ((iM2566 ^ i14) * (-24981)) ^ 732021977;
                                        i5 = -1324949053;
                                        int i218 = iM2566 ^ i5;
                                        resolveInfo2 = resolveInfo2;
                                        appTasks = appTasks;
                                        str5 = str5;
                                        taskId = taskId;
                                        i17 = i218;
                                        uri2 = uri2;
                                        i24 = i24;
                                        i19 = i3;
                                        resolveInfo = resolveInfo;
                                        intent2 = intent2;
                                        intentM12571 = intentM12571;
                                        intent3 = intent3;
                                        i16 = i4;
                                        i22 = i22;
                                        str6 = str6;
                                    }
                                } catch (Exception unused8) {
                                    uri = uri2;
                                    intent2 = intent10;
                                    appTasks = appTasks;
                                    taskId = taskId;
                                    resolveInfo2 = resolveInfo2;
                                    intent3 = intent3;
                                    resolveInfo = resolveInfo;
                                    uri2 = uri;
                                    iM2566 = C2105.m6981("᩶᩷") ^ i15;
                                    i4 = ((iM2566 ^ i14) * (-24981)) ^ 732021977;
                                    i5 = -1324949053;
                                    int i219 = iM2566 ^ i5;
                                    resolveInfo2 = resolveInfo2;
                                    appTasks = appTasks;
                                    str5 = str5;
                                    taskId = taskId;
                                    i17 = i219;
                                    uri2 = uri2;
                                    i24 = i24;
                                    i19 = i3;
                                    resolveInfo = resolveInfo;
                                    intent2 = intent2;
                                    intentM12571 = intentM12571;
                                    intent3 = intent3;
                                    i16 = i4;
                                    i22 = i22;
                                    str6 = str6;
                                    i20 = i20;
                                    break;
                                }
                            } catch (Exception unused9) {
                                i22 = i22;
                                str6 = str6;
                            }
                        } catch (Exception unused10) {
                            componentNameM29694 = componentName;
                            i22 = i22;
                            str6 = str6;
                        }
                    } catch (Exception unused11) {
                        i24 = i24;
                        i22 = i22;
                        str6 = str6;
                        intent2 = null;
                    }
                    i20 = i20;
                    break;
                case -221238473:
                case 991314836:
                    intent2 = intent2;
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    i3 = i19;
                    i20 = i20;
                    i24 = i24;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    appTasks = appTasks;
                    super.onCreate(bundle);
                    intentM12571 = C4159.m12571(this);
                    if (!intentM12571.getBooleanExtra(C4117.m12355(f36441, 165, 27, i3), false)) {
                        i21 = 268435456;
                        z4 = false;
                        iM2566 = (i14 - C0630.m2566("ۜۚ")) * 39;
                        i4 = ((iM2566 ^ i15) * (-13133)) ^ 2106108566;
                        i5 = -881508261;
                        int i2110 = iM2566 ^ i5;
                        resolveInfo2 = resolveInfo2;
                        appTasks = appTasks;
                        str5 = str5;
                        taskId = taskId;
                        i17 = i2110;
                        uri2 = uri2;
                        i24 = i24;
                        i19 = i3;
                        resolveInfo = resolveInfo;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        intent3 = intent3;
                        i16 = i4;
                        i22 = i22;
                        str6 = str6;
                        i20 = i20;
                    } else {
                        int iM25610 = C0630.m2566("֨᩶") ^ i15;
                        i6 = ((iM25610 ^ i14) * 26677) ^ 1483549569;
                        resolveInfo2 = resolveInfo2;
                        str5 = str5;
                        i24 = i24;
                        str6 = str6;
                        taskId = taskId;
                        z4 = false;
                        i19 = i3;
                        i17 = iM25610 ^ 23401070;
                        intent2 = intent2;
                        i21 = 268435456;
                        intentM12571 = intentM12571;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                    }
                    break;
                case -190585732:
                case 2012309996:
                    i3 = 41210;
                    iM2566 = C0630.m2566("ܰ᩸") ^ i15;
                    i4 = ((iM2566 ^ i14) * (-29651)) ^ 559932709;
                    i5 = 338949226;
                    int i2111 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i2111;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -116169917:
                case 48232709:
                    m29696((Activity) this);
                    break;
                case -41440453:
                case 1018738711:
                    str5 = str5;
                    String str12 = str6;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    i3 = i19;
                    i10 = i24;
                    Uri uri4 = uri2;
                    if (!C7811.m20838(str3, C5695.m16034(f36441, 237, 5, i3))) {
                        appTasks = appTasks;
                        i9 = taskId;
                        intent3 = intent3;
                        resolveInfo = resolveInfo;
                        str5 = str5;
                        str6 = str12;
                        uri2 = uri4;
                        int iM69810 = C2105.m6981("᩷ۖ") ^ i14;
                        i6 = ((iM69810 ^ i15) * (-8091)) ^ (-1687478933);
                        i17 = iM69810 ^ (-570452935);
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                    } else {
                        int iM69811 = C2105.m6981("ۤۖ") ^ i14;
                        i7 = ((iM69811 ^ i15) * (-19957)) ^ 247981425;
                        i8 = iM69811 ^ (-2094901921);
                        uri2 = uri4;
                        i24 = i10;
                        str6 = str12;
                        i19 = i3;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i7;
                        i22 = i22;
                        i20 = i20;
                        String str13 = str5;
                        i17 = i8;
                        str5 = str13;
                    }
                    break;
                case 209217563:
                case 1586279359:
                    str2 = str5;
                    str = str6;
                    i9 = taskId;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i10 = i24;
                    appTasks = appTasks;
                    if (zM36507) {
                        iM2567 = (C0630.m2566("᩵ۤ") + i15) * (-95);
                        i11 = ((iM2567 ^ i14) * (-5521)) ^ 639740415;
                        i12 = -746656744;
                    } else {
                        iM2567 = C0630.m2566("ۘܰ") ^ i14;
                        i11 = ((iM2567 ^ i15) * 28157) ^ 858042540;
                        i12 = -1050109888;
                    }
                    int i39 = iM2567 ^ i12;
                    appTasks = appTasks;
                    str6 = str;
                    taskId = i9;
                    uri2 = uri2;
                    resolveInfo = resolveInfo;
                    intent3 = intent3;
                    i22 = i22;
                    i20 = i20;
                    Intent intent11 = intent2;
                    intentM12571 = intentM12571;
                    i16 = i11;
                    i24 = i10;
                    i19 = i3;
                    intent2 = intent11;
                    String str14 = str2;
                    i17 = i39;
                    str5 = str14;
                    break;
                case 336021820:
                case 1352927363:
                    break;
                case 404321632:
                case 582348619:
                    m29696((Activity) this);
                    C22628.m50617(this, intent2);
                    iM6981 = C2105.m6981("ᩴۖ") ^ i15;
                    i = ((iM6981 ^ i14) * (-21629)) ^ (-1420972890);
                    i2 = -1655187671;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case 449558547:
                case 1474726167:
                    str = str6;
                    i9 = taskId;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i10 = i24;
                    appTasks = appTasks;
                    String action = intentM12571.getAction();
                    String type = intentM12571.getType();
                    String strM7036 = C2126.m7036(f36441, 200, 26, i3);
                    if (C1294.m4369(strM7036, action)) {
                        int iM69812 = C2105.m6981("ۤۙ") ^ i15;
                        int i40 = ((iM69812 ^ i14) * 32731) ^ 1197553643;
                        i17 = iM69812 ^ (-212469041);
                        str3 = type;
                        str5 = strM7036;
                        appTasks = appTasks;
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        uri2 = uri2;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i40;
                        resolveInfo = resolveInfo;
                        str6 = str;
                    } else {
                        str3 = type;
                        str5 = strM7036;
                        str6 = str;
                        int iM69813 = C2105.m6981("᩷ۖ") ^ i14;
                        i6 = ((iM69813 ^ i15) * (-8091)) ^ (-1687478933);
                        i17 = iM69813 ^ (-570452935);
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        intent2 = intent2;
                        intentM12571 = intentM12571;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                    }
                    intent3 = intent3;
                    i22 = i22;
                    i20 = i20;
                    break;
                case 508237083:
                case 825632673:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    uriM36522 = abstractC15440M39867.m36522();
                    int iM69814 = (C2105.m6981("᩻ᩴ") + i15) * 51;
                    i13 = ((iM69814 ^ i14) * (-6461)) ^ (-1234240054);
                    resolveInfo = resolveInfo;
                    appTasks = appTasks;
                    taskId = taskId;
                    uri2 = uriM36522;
                    intent3 = intent3;
                    str5 = str5;
                    i22 = i22;
                    i17 = iM69814 ^ 380945757;
                    i20 = i20;
                    i24 = i24;
                    i19 = i3;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    i16 = i13;
                    str6 = str6;
                    break;
                case 892725784:
                case 1231349932:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM12571 = intentM12571;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    c12915 = f36442;
                    if (c12915 != null) {
                        iM2566 = C0630.m2566("᩺᩷") ^ i15;
                        i4 = ((iM2566 ^ i14) * (-16523)) ^ 1769733566;
                        i5 = 1852654879;
                    } else {
                        iM2566 = (i14 - C0630.m2566("۟ܰ")) * 77;
                        i4 = ((iM2566 ^ i15) * (-18551)) ^ 1918122916;
                        i5 = -948189889;
                    }
                    int i2112 = iM2566 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i2112;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM12571 = intentM12571;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case 998874645:
                case 1227542447:
                    z = zIsVisible ^ z2;
                    z3 = z;
                    iM6981 = (i14 - C2105.m6981("᩵ܳ")) * (-25);
                    i = ((iM6981 ^ i15) * 11733) ^ (-809464129);
                    i2 = -294340548;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case 1189554131:
                case 1812985691:
                    AbstractActivityC3346.m10207(intent2, z2);
                    RunnableC1108.m3781(this);
                    iM6981 = C2105.m6981("֡᩶") ^ i14;
                    i = ((iM6981 ^ i15) * (-7617)) ^ (-463362974);
                    i2 = -1886939531;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case 1651857803:
                case 1737155167:
                    ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                    Intent intent12 = intent3;
                    intent12.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                    C21923.m49344(this, intent12);
                    RunnableC1108.m3781(this);
                    break;
                case 1744187812:
                case 2075642846:
                    break;
                default:
                    try {
                        ActivityManager.AppTask appTask2 = (ActivityManager.AppTask) C21923.m49339(appTasks, i24);
                        try {
                            zM29697 = m29697(appTask2);
                            int iM25611 = C0630.m2566("ۧ᩷") ^ i14;
                            i16 = ((iM25611 ^ i15) * (-1777)) ^ (-20372297);
                            appTask = appTask2;
                            i17 = iM25611 ^ (-1383225146);
                        } catch (Exception unused12) {
                            appTask = appTask2;
                            i3 = i19;
                            i24 = i24;
                            appTasks = appTasks;
                            iM2566 = C2105.m6981("᩶᩷") ^ i15;
                            i4 = ((iM2566 ^ i14) * (-24981)) ^ 732021977;
                            i5 = -1324949053;
                            int i2113 = iM2566 ^ i5;
                            resolveInfo2 = resolveInfo2;
                            appTasks = appTasks;
                            str5 = str5;
                            taskId = taskId;
                            i17 = i2113;
                            uri2 = uri2;
                            i24 = i24;
                            i19 = i3;
                            resolveInfo = resolveInfo;
                            intent2 = intent2;
                            intentM12571 = intentM12571;
                            intent3 = intent3;
                            i16 = i4;
                            i22 = i22;
                            str6 = str6;
                            i20 = i20;
                        }
                    } catch (Exception unused13) {
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29696(Activity activity) {
        int i = 1995744738;
        int i2 = C3683.f11629;
        int i3 = C3911.f12484;
        int iM6981 = (i3 - C2105.m6981("ۡܿ")) * 115;
        int i4 = ((iM6981 ^ i2) * 7489) ^ 1858291710;
        int i5 = -1900611153;
        while (true) {
            i = ((((i ^ i2) * 363) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2125140417:
                case 2096195094:
                    activity.finishAndRemoveTask();
                    break;
                case -2086296492:
                case 659309365:
                    ServiceConnectionC3453.m10564();
                    iM6981 = (C2105.m6981("᩻ۘ") ^ i2) * 17;
                    i4 = ((iM6981 ^ i3) * (-10177)) ^ (-2061778285);
                    i5 = -546951743;
                    break;
                case -1840193546:
                case 776776645:
                    C4117.m12364();
                    if (C0422.f1886 > 0) {
                        iM6981 = C0630.m2566("֨ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3877) ^ 766269295;
                        i5 = -1045441618;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۘ") ^ i2) * 17;
                        i4 = ((iM6981 ^ i3) * (-10177)) ^ (-2061778285);
                        i5 = -546951743;
                    }
                    break;
                case -1793112644:
                case 957478778:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C0630.m2566("ۘۚ") + i3) * (-33);
                        i4 = ((iM6981 ^ i2) * 12329) ^ 2082267359;
                        i5 = 896991541;
                    } else {
                        iM6981 = C2105.m6981("ۗۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-10093)) ^ 1798954051;
                        i5 = 154250086;
                    }
                    break;
                case -1737834503:
                case -474828143:
                    C1773.m5908();
                    C7811.m20844();
                    break;
                case -1154427164:
                case 35181989:
                    if (activity.isTaskRoot()) {
                        iM6981 = C0630.m2566("֡ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17373)) ^ 544764618;
                        i5 = 1976801899;
                    } else {
                        iM6981 = (C0630.m2566("ۤۡ") + i3) * (-13);
                        i4 = ((iM6981 ^ i2) * 6219) ^ (-1204645828);
                        i5 = 57292896;
                    }
                    break;
                case -880978854:
                case -244539276:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("֨ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3877) ^ 766269295;
                        i5 = -1045441618;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17635)) ^ (-2002654488);
                        i5 = -1139428823;
                    }
                    break;
                case -553654980:
                case 1217568090:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("᩻ۘ") ^ i2) * 17;
                        i4 = ((iM6981 ^ i3) * (-10177)) ^ (-2061778285);
                        i5 = -546951743;
                    } else {
                        iM6981 = (C0630.m2566("۠ۡ") ^ i3) * (-33);
                        i4 = ((iM6981 ^ i2) * 5137) ^ (-1307564853);
                        i5 = -796696115;
                    }
                    break;
                case -333471071:
                case 1005762811:
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("֨ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3877) ^ 766269295;
                        i5 = -1045441618;
                    } else {
                        iM6981 = (C0630.m2566("ᩴ᩶") ^ i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-20963)) ^ 1203767565;
                        i5 = -864424226;
                    }
                    break;
                case -303778205:
                case -227331332:
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM6981 = (C0630.m2566("ۘۚ") + i3) * (-33);
                        i4 = ((iM6981 ^ i2) * 12329) ^ 2082267359;
                        i5 = 896991541;
                    } else {
                        iM6981 = C0630.m2566("֨ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3877) ^ 766269295;
                        i5 = -1045441618;
                    }
                    break;
                case -271427694:
                case 1659414154:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (i2 - C2105.m6981("۫ۛ")) * 77;
                        i4 = ((iM6981 ^ i3) * 25755) ^ 1281787287;
                        i5 = 516037839;
                    } else {
                        iM6981 = C2105.m6981("ܽۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20637)) ^ 1700422704;
                        i5 = -319117860;
                    }
                    break;
                case 78085383:
                case 83671924:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C2105.m6981("ᩴ᩺") ^ i2) * 99;
                        i4 = ((iM6981 ^ i3) * (-27647)) ^ (-667360021);
                        i5 = 2100315293;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۫ۧ")) * (-61);
                        i4 = ((iM6981 ^ i3) * 30243) ^ (-522985869);
                        i5 = -1229710646;
                    }
                    break;
                case 89627475:
                case 410878836:
                    if (C0630.m2564()) {
                        iM6981 = (C2105.m6981("ᩴ᩺") ^ i2) * 99;
                        i4 = ((iM6981 ^ i3) * (-27647)) ^ (-667360021);
                        i5 = 2100315293;
                    } else {
                        iM6981 = C0630.m2566("᩶᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13611) ^ (-1218187194);
                        i5 = 765279375;
                    }
                    break;
                case 166518076:
                case 669758567:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i2 - C2105.m6981("۫ۛ")) * 77;
                        i4 = ((iM6981 ^ i3) * 25755) ^ 1281787287;
                        i5 = 516037839;
                    } else {
                        iM6981 = C0630.m2566("֨ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3877) ^ 766269295;
                        i5 = -1045441618;
                    }
                    break;
                case 225416121:
                case 841265976:
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("ۘۚ") + i3) * (-33);
                        i4 = ((iM6981 ^ i2) * 12329) ^ 2082267359;
                        i5 = 896991541;
                    } else {
                        iM6981 = (C0630.m2566("ۧۖ") + i3) * (-107);
                        i4 = ((iM6981 ^ i2) * (-2105)) ^ (-864993236);
                        i5 = 1886736080;
                    }
                    break;
                case 448588263:
                case 1624066326:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i2 - C2105.m6981("۫ۛ")) * 77;
                        i4 = ((iM6981 ^ i3) * 25755) ^ 1281787287;
                        i5 = 516037839;
                    } else {
                        iM6981 = C0630.m2566("֫᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-29721)) ^ (-819340174);
                        i5 = -498822851;
                    }
                    break;
                case 1157752566:
                case 1930672067:
                    C2272.m7505(activity);
                    break;
                default:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("ᩴ᩺") ^ i2) * 99;
                        i4 = ((iM6981 ^ i3) * (-27647)) ^ (-667360021);
                        i5 = 2100315293;
                    } else {
                        iM6981 = C2105.m6981("ܿ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10111) ^ (-650591905);
                        i5 = -157290670;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x04b2 A[PHI: r17 r18 r20 r21 r27
      0x04b2: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:123:0x04b0, B:119:0x048d, B:111:0x0443] A[DONT_GENERATE, DONT_INLINE]
      0x04b2: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:123:0x04b0, B:119:0x048d, B:111:0x0443] A[DONT_GENERATE, DONT_INLINE]
      0x04b2: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short) binds: [B:123:0x04b0, B:119:0x048d, B:111:0x0443] A[DONT_GENERATE, DONT_INLINE]
      0x04b2: PHI (r21v3 short) = (r21v2 short), (r21v2 short), (r21v4 short) binds: [B:123:0x04b0, B:119:0x048d, B:111:0x0443] A[DONT_GENERATE, DONT_INLINE]
      0x04b2: PHI (r27v53 int) = (r27v49 int), (r27v50 int), (r27v54 int) binds: [B:123:0x04b0, B:119:0x048d, B:111:0x0443] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x04eb A[PHI: r8 r9 r15 r16 r19 r27
      0x04eb: PHI (r8v6 int) = (r8v4 int), (r8v2 int), (r8v2 int) binds: [B:9:0x007c, B:127:0x04e9, B:115:0x0467] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r9v6 int) = (r9v4 int), (r9v2 int), (r9v2 int) binds: [B:9:0x007c, B:127:0x04e9, B:115:0x0467] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r15v5 short[]) = (r15v3 short[]), (r15v1 short[]), (r15v1 short[]) binds: [B:9:0x007c, B:127:0x04e9, B:115:0x0467] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:9:0x007c, B:127:0x04e9, B:115:0x0467] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v4 int) binds: [B:9:0x007c, B:127:0x04e9, B:115:0x0467] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r27v51 int) = (r27v11 int), (r27v48 int), (r27v52 int) binds: [B:9:0x007c, B:127:0x04e9, B:115:0x0467] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x015d A[PHI: r2 r4 r13
      0x015d: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:47:0x015b, B:22:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:47:0x015b, B:22:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]) binds: [B:47:0x015b, B:22:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01b9 A[PHI: r10 r11 r12
      0x01b9: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:175:0x01b9, B:55:0x01b7, B:11:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:175:0x01b9, B:55:0x01b7, B:11:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:175:0x01b9, B:55:0x01b7, B:11:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x028b A[PHI: r6
      0x028b: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v1 java.lang.String) binds: [B:71:0x0244, B:59:0x01ef, B:51:0x0193, B:43:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x010e. Please report as an issue. */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ComponentName m29694(Activity activity, List list) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int i5;
        ActivityManager.RecentTaskInfo taskInfo = null;
        String className = null;
        byte b = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = -683397753;
        int i8 = C5695.f17556;
        int i9 = C0714.f2697;
        int iM6983 = (i9 - C2105.m6981("ۘۡ")) * 47;
        int i10 = ((iM6983 ^ i8) * (-10475)) ^ (-414515716);
        int i11 = iM6983 ^ (-748151481);
        ActivityManager.AppTask appTask = null;
        ComponentName componentName = null;
        ComponentName componentName2 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        short s2 = 0;
        byte b2 = 0;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * (-29839)) >> 31));
            switch (i7) {
                case -2138154536:
                case 46908335:
                    componentName2 = taskInfo.origActivity;
                    iM6982 = (i8 - C0630.m2566("ۧ᩶")) * (-119);
                    i3 = ((iM6982 ^ i9) * 4929) ^ 1535543324;
                    i4 = -353471521;
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -2050708363:
                case 1287654454:
                    b = 1;
                    iM6981 = (i8 - C2105.m6981("ۘ֨")) * 93;
                    i = ((iM6981 ^ i9) * 5933) ^ (-212278495);
                    i2 = -343094908;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -2050448421:
                case 1119052785:
                    if (C3432.f10845 < 0) {
                        iM6981 = (C0630.m2566("᩻᩸") ^ i9) * 49;
                        i = ((iM6981 ^ i8) * 1539) ^ 659719234;
                        i2 = 564004295;
                    } else {
                        iM6981 = C0630.m2566("᩸᩷") ^ i8;
                        i = ((iM6981 ^ i9) * 2139) ^ 1848342757;
                        i2 = 1458120273;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -2001424587:
                case -1797746934:
                    C1047.m3599();
                    if (C1711.m5736() > 0) {
                        i12 = i12;
                        iM6982 = C2105.m6981("᩸᩹") ^ i9;
                        i3 = ((iM6982 ^ i8) * (-16331)) ^ 526834832;
                        i4 = 1679023064;
                        i5 = i12;
                        i11 = iM6982 ^ i4;
                        i10 = i3;
                        i12 = i5;
                    } else {
                        iM6981 = C2105.m6981("ۜܰ") ^ i9;
                        i = ((iM6981 ^ i8) * 9473) ^ 1251473072;
                        i2 = 751159318;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1947285933:
                case -158660267:
                    return new C1564(activity).m5345();
                case -1896089332:
                case 409431623:
                    if (C1294.m4369(className, C3245.m9934(sArr3, i17, i16, i6))) {
                        iM6981 = C2105.m6981("ۤ᩸") ^ i8;
                        i = ((iM6981 ^ i9) * (-18191)) ^ 1657319997;
                        i2 = -1577591691;
                    } else {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i9;
                        i = ((iM6981 ^ i8) * 19091) ^ (-2074245627);
                        i2 = -582764160;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1760146997:
                case 736501651:
                    if (ViewOnClickListenerC1958.m6437(className, C0630.m2575(sArr, i14, i15, i6))) {
                        b = b2;
                        iM6981 = (i8 - C2105.m6981("ۘ֨")) * 93;
                        i = ((iM6981 ^ i9) * 5933) ^ (-212278495);
                        i2 = -343094908;
                    } else {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i9;
                        i = ((iM6981 ^ i8) * 19091) ^ (-2074245627);
                        i2 = -582764160;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1748459328:
                case 1769716394:
                    i12 = i12;
                    s2 = 20606;
                    if (C2167.f7158 >= 0) {
                        iM6982 = (C0630.m2566("ܶۜ") ^ i8) * 69;
                        i3 = ((iM6982 ^ i9) * 15075) ^ 881870407;
                        i4 = 2025636864;
                    } else {
                        iM6982 = C2105.m6981("֨֡") ^ i9;
                        i3 = ((iM6982 ^ i8) * (-6859)) ^ 1089160647;
                        i4 = 1845267318;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -1568011809:
                case 873023729:
                    ViewOnClickListenerC1958.m6429();
                    if (C3019.f9544 >= 0) {
                        i12 = i12;
                        iM6982 = C2105.m6981("ܽۙ") ^ i8;
                        i3 = ((iM6982 ^ i9) * 26173) ^ (-211451618);
                        i4 = -1559846282;
                        i5 = i12;
                        i11 = iM6982 ^ i4;
                        i10 = i3;
                        i12 = i5;
                    } else {
                        iM6981 = C0630.m2566("᩸᩷") ^ i8;
                        i = ((iM6981 ^ i9) * 2139) ^ 1848342757;
                        i2 = 1458120273;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1501118651:
                case -8404832:
                    return componentName2;
                case -1414906965:
                case -551463797:
                    if (C22628.f73083 > 0) {
                        iM6981 = C2105.m6981("ۜۘ") ^ i9;
                        i = ((iM6981 ^ i8) * 6777) ^ (-1084130871);
                        i2 = 997544420;
                    } else {
                        iM6981 = (C0630.m2566("ۙۜ") ^ i9) * (-89);
                        i = ((iM6981 ^ i8) * 1111) ^ (-2001778759);
                        i2 = 59601577;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1391147419:
                case -87889385:
                    i12 = i12;
                    c = 0;
                    if (C3245.m9925() != 0) {
                        iM6982 = (C0630.m2566("ܶۜ") ^ i8) * 69;
                        i3 = ((iM6982 ^ i9) * 15075) ^ 881870407;
                        i4 = 2025636864;
                    } else {
                        iM6982 = (C2105.m6981("۬۫") ^ i9) * (-125);
                        i3 = ((iM6982 ^ i8) * 14493) ^ (-1446212968);
                        i4 = 982221505;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -1276238169:
                case 1321702931:
                    sArr3 = f36441;
                    i17 = 25;
                    i16 = 25;
                    if (C2272.m7503()) {
                        iM6981 = C2105.m6981("ۜܰ") ^ i9;
                        i = ((iM6981 ^ i8) * 9473) ^ 1251473072;
                        i2 = 751159318;
                    } else {
                        iM6981 = (i8 - C0630.m2566("ܰܿ")) * 37;
                        i = ((iM6981 ^ i9) * (-27903)) ^ (-105565634);
                        i2 = 1353777711;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1254453115:
                case 1096419274:
                    C11340.m28031();
                    return null;
                case -1218813179:
                case 543093290:
                    return new ComponentName(activity, (Class<?>) Main.class);
                case -1197815307:
                case 977654931:
                    b = 2;
                    iM6981 = (i8 - C2105.m6981("ۘ֨")) * 93;
                    i = ((iM6981 ^ i9) * 5933) ^ (-212278495);
                    i2 = -343094908;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1182783513:
                case -939384014:
                    i12 = i12;
                    s = sArr2[c];
                    i18 = s * s;
                    if (C3537.f11231 >= 0) {
                        iM6982 = (C0630.m2566("ܶۜ") ^ i8) * 69;
                        i3 = ((iM6982 ^ i9) * 15075) ^ 881870407;
                        i4 = 2025636864;
                    } else {
                        iM6982 = C2105.m6981("᩻᩻") ^ i8;
                        i3 = ((iM6982 ^ i9) * 20671) ^ (-1046577054);
                        i4 = -596885914;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -1160605588:
                case -1089432364:
                    i12 = i12;
                    sArr2 = f36441;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6982 = C2105.m6981("᩸᩹") ^ i9;
                        i3 = ((iM6982 ^ i8) * (-16331)) ^ 526834832;
                        i4 = 1679023064;
                    } else {
                        iM6982 = (C0630.m2566("ܰ֫") + i9) * 99;
                        i3 = ((iM6982 ^ i8) * 7689) ^ 961787877;
                        i4 = -231891233;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -1143125767:
                case -310504373:
                    if (C7106.f21815 == 0) {
                        iM6981 = C2105.m6981("ۜۘ") ^ i9;
                        i = ((iM6981 ^ i8) * 6777) ^ (-1084130871);
                        i2 = 997544420;
                    } else {
                        iM6981 = (C0630.m2566("᩻᩸") ^ i9) * 49;
                        i = ((iM6981 ^ i8) * 1539) ^ 659719234;
                        i2 = 564004295;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -952412529:
                case -842536080:
                    switch (b) {
                        case 0:
                        case 1:
                        case 2:
                            iM6981 = (C0630.m2566("ᩳܽ") ^ i8) * (-81);
                            i = ((iM6981 ^ i9) * (-2103)) ^ 1326996777;
                            i2 = -263680292;
                            i11 = iM6981 ^ i2;
                            i10 = i;
                            break;
                        default:
                            i12 = i12;
                            iM6982 = C0630.m2566("ۤۤ") ^ i8;
                            i3 = ((iM6982 ^ i9) * (-7543)) ^ 1050499960;
                            i4 = -65591923;
                            i5 = i12;
                            i11 = iM6982 ^ i4;
                            i10 = i3;
                            i12 = i5;
                            break;
                    }
                    break;
                case -927282604:
                case 1882640517:
                    className = componentName.getClassName();
                    AbstractC2021.m6565(className);
                    switch (C2105.m6981(className)) {
                        case -1577057716:
                            iM6981 = (C2105.m6981("᩺ۗ") ^ i8) * 55;
                            i = ((iM6981 ^ i9) * (-18463)) ^ (-1125501050);
                            i2 = -811028692;
                            break;
                        case -1350715006:
                            iM6981 = C2105.m6981("᩸ᩳ") ^ i9;
                            i = ((iM6981 ^ i8) * 4843) ^ (-39771953);
                            i2 = 1034056257;
                            break;
                        case 12451804:
                            iM6981 = (C0630.m2566("ᩴ۟") ^ i8) * 45;
                            i = ((iM6981 ^ i9) * 14101) ^ 1722005100;
                            i2 = -439880792;
                            break;
                        default:
                            iM6981 = C0630.m2566("᩸ܳ") ^ i9;
                            i = ((iM6981 ^ i8) * 19091) ^ (-2074245627);
                            i2 = -582764160;
                            break;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -708577206:
                case -124607061:
                    i6 = 7876;
                    iM6982 = C0630.m2566("ۘ֫") ^ i8;
                    i3 = ((iM6982 ^ i9) * (-30479)) ^ (-1487128353);
                    i4 = -953973966;
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -692334208:
                case -214595093:
                    i12 = i12;
                    if (C1047.f3863 >= 0) {
                        iM6982 = C2105.m6981("ܽۙ") ^ i8;
                        i3 = ((iM6982 ^ i9) * 26173) ^ (-211451618);
                        i4 = -1559846282;
                    } else {
                        iM6982 = (C2105.m6981("ۗ֫") ^ i8) * (-13);
                        i3 = ((iM6982 ^ i9) * (-14331)) ^ (-862663092);
                        i4 = 1262017453;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -474798702:
                case 1135659610:
                    i12 = i12;
                    if (i19 - (s * s2) >= 0) {
                        iM6982 = C0630.m2566("ܰۗ") ^ i8;
                        i3 = ((iM6982 ^ i9) * (-6509)) ^ 328824194;
                        i4 = 49115128;
                    } else {
                        iM6982 = (C0630.m2566("ۚܺ") ^ i9) * (-39);
                        i3 = ((iM6982 ^ i8) * 5225) ^ 833278419;
                        i4 = -2078636929;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -362836284:
                case 1309006547:
                    C7811.m20844();
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("᩻᩸") ^ i9) * 49;
                        i = ((iM6981 ^ i8) * 1539) ^ 659719234;
                        i2 = 564004295;
                    } else {
                        iM6981 = C2105.m6981("ۜܰ") ^ i9;
                        i = ((iM6981 ^ i8) * 9473) ^ 1251473072;
                        i2 = 751159318;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -291848100:
                case -277298395:
                    if (ViewOnClickListenerC1958.m6437(className, C2272.m7507(sArr4, i12, i13, i6))) {
                        iM6981 = C0630.m2566("۟᩸") ^ i9;
                        i = ((iM6981 ^ i8) * 23211) ^ 1853180535;
                        i2 = 919944337;
                    } else {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i9;
                        i = ((iM6981 ^ i8) * 19091) ^ (-2074245627);
                        i2 = -582764160;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -270882296:
                case 736713885:
                    i6 = 23452;
                    iM6982 = C0630.m2566("ۘ֫") ^ i8;
                    i3 = ((iM6982 ^ i9) * (-30479)) ^ (-1487128353);
                    i4 = -953973966;
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case -142557068:
                case 661573611:
                    taskInfo = appTask.getTaskInfo();
                    ComponentName componentName3 = taskInfo.origActivity;
                    if (componentName3 != null) {
                        int iM2566 = (C0630.m2566("᩸᩺") ^ i9) * (-21);
                        componentName = componentName3;
                        i10 = ((iM2566 ^ i8) * 10917) ^ (-1065695429);
                        i11 = iM2566 ^ 596366576;
                    } else {
                        componentName = componentName3;
                        i12 = i12;
                        iM6982 = C0630.m2566("ۤۤ") ^ i8;
                        i3 = ((iM6982 ^ i9) * (-7543)) ^ 1050499960;
                        i4 = -65591923;
                        i5 = i12;
                        i11 = iM6982 ^ i4;
                        i10 = i3;
                        i12 = i5;
                    }
                    break;
                case 144667565:
                case 1475297444:
                    sArr4 = f36441;
                    i12 = 50;
                    i13 = 24;
                    if (C3683.m11222()) {
                        iM6981 = (C0630.m2566("ۙۜ") ^ i9) * (-89);
                        i = ((iM6981 ^ i8) * 1111) ^ (-2001778759);
                        i2 = 59601577;
                    } else {
                        iM6981 = C2105.m6981("֨ۜ") ^ i9;
                        i = ((iM6981 ^ i8) * (-27527)) ^ 693583095;
                        i2 = 1624599669;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case 287365466:
                case 1058690104:
                    componentName2 = null;
                    iM6982 = (i8 - C0630.m2566("ۧ᩶")) * (-119);
                    i3 = ((iM6982 ^ i9) * 4929) ^ 1535543324;
                    i4 = -353471521;
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case 613466532:
                case 1967274754:
                    i12 = i12;
                    if (C2167.m7161(list)) {
                        iM6982 = C0630.m2566("ۤۤ") ^ i8;
                        i3 = ((iM6982 ^ i9) * (-7543)) ^ 1050499960;
                        i4 = -65591923;
                    } else {
                        iM6982 = C0630.m2566("ۙۚ") ^ i9;
                        i3 = ((iM6982 ^ i8) * (-24443)) ^ 1973831810;
                        i4 = -251472474;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case 705985206:
                case 2002176352:
                    i12 = i12;
                    if (Build.VERSION.SDK_INT <= 23) {
                        iM6982 = C0630.m2566("ۖ᩷") ^ i9;
                        i3 = ((iM6982 ^ i8) * (-30567)) ^ (-1643094251);
                        i4 = -82980994;
                    } else {
                        iM6982 = (i9 - C2105.m6981("᩻ܿ")) * 53;
                        i3 = ((iM6982 ^ i8) * (-9191)) ^ (-839536539);
                        i4 = 1441400487;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case 725130654:
                case 1361168631:
                    if (componentName2 == null) {
                        iM6981 = C2105.m6981("۠ܿ") ^ i9;
                        i = ((iM6981 ^ i8) * (-13753)) ^ 1754967765;
                        i2 = 2026163991;
                    } else {
                        iM6981 = (i8 - C2105.m6981("ۗܶ")) * (-59);
                        i = ((iM6981 ^ i9) * (-19141)) ^ (-1300894558);
                        i2 = -218584003;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case 827871569:
                case 1031756645:
                    i12 = i12;
                    i19 = i18 + 106151809;
                    if (C2272.f7362) {
                        iM6982 = C2105.m6981("᩸᩹") ^ i9;
                        i3 = ((iM6982 ^ i8) * (-16331)) ^ 526834832;
                        i4 = 1679023064;
                    } else {
                        iM6982 = (C2105.m6981("ᩴۡ") + i8) * (-97);
                        i3 = ((iM6982 ^ i9) * 12625) ^ (-1803287013);
                        i4 = -1960064004;
                    }
                    i5 = i12;
                    i11 = iM6982 ^ i4;
                    i10 = i3;
                    i12 = i5;
                    break;
                case 966350666:
                case 1033673687:
                    sArr = f36441;
                    i14 = 1;
                    i15 = 24;
                    if (C4117.f13076 > 0) {
                        iM6981 = C2105.m6981("ܺܽ") ^ i9;
                        i = ((iM6981 ^ i8) * (-30093)) ^ 1167684435;
                        i2 = 425309333;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    } else {
                        i12 = i12;
                        iM6982 = C2105.m6981("᩸᩹") ^ i9;
                        i3 = ((iM6982 ^ i8) * (-16331)) ^ 526834832;
                        i4 = 1679023064;
                        i5 = i12;
                        i11 = iM6982 ^ i4;
                        i10 = i3;
                        i12 = i5;
                    }
                    break;
                case 1311859997:
                case 1633496349:
                    C2105.m6982();
                    if (RunnableC1937.f6483 >= 0) {
                        iM6982 = (C2105.m6981("ܽۢ") + i8) * q.h;
                        i12 = i12;
                        i3 = ((iM6982 ^ i9) * (-10461)) ^ 1973271443;
                        i4 = 2146536583;
                        i5 = i12;
                        i11 = iM6982 ^ i4;
                        i10 = i3;
                        i12 = i5;
                    } else {
                        iM6981 = C2105.m6981("ۜۘ") ^ i9;
                        i = ((iM6981 ^ i8) * 6777) ^ (-1084130871);
                        i2 = 997544420;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    }
                    break;
                case 1393530918:
                case 2036586816:
                    b = -1;
                    iM6981 = (i8 - C2105.m6981("ۘ֨")) * 93;
                    i = ((iM6981 ^ i9) * 5933) ^ (-212278495);
                    i2 = -343094908;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case 1404018831:
                case 2135757978:
                    appTask = (ActivityManager.AppTask) C22628.m50605(list, 0);
                    if (C7106.f21815 != 0) {
                        b2 = 0;
                        iM6982 = (C2105.m6981("ܽۢ") + i8) * q.h;
                        i12 = i12;
                        i3 = ((iM6982 ^ i9) * (-10461)) ^ 1973271443;
                        i4 = 2146536583;
                        i5 = i12;
                        i11 = iM6982 ^ i4;
                        i10 = i3;
                    } else {
                        int i20 = i12;
                        int iM6984 = C2105.m6981("ܿ۬") ^ i8;
                        i10 = ((iM6984 ^ i9) * (-25933)) ^ (-1244936262);
                        b2 = 0;
                        i5 = i20;
                        i11 = iM6984 ^ 448202670;
                    }
                    i12 = i5;
                    break;
                default:
                    C0798.m2998();
                    C0422.m1963();
                    iM6981 = C2105.m6981("ۜۘ") ^ i9;
                    i = ((iM6981 ^ i8) * 6777) ^ (-1084130871);
                    i2 = 997544420;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
            }
        }
    }
}
