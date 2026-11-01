package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plugin.api.LocalString;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B50D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3968 {

    /* JADX INFO: renamed from: ᩻۫֫, reason: not valid java name and contains not printable characters */
    private static final short[] f81874 = {9159, 31738, 31735, 31736, 31729, 31715, 31735, 31729, 31731, 31689, 31742, 31743, 31730, 31730, 31731, 31736, 31689, 31736, 31731, 31713, 31690, 31722, 5639, -23026, -19430, 24564, 27905, -20057, 26511, 24438, -18923, -18189, -22926, -17128, 28184, 22150, -21955, -17389, -18585, -23140, 22363, 15124, 15104, 15105, 15130};

    /* JADX WARN: Code duplicated, block: B:33:0x0142 A[PHI: r15
      0x0142: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:18:0x00a3, B:9:0x006d, B:6:0x0067, B:109:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x02a2 A[PHI: r2 r3 r4 r11 r19 r21 r25
      0x02a2: PHI (r2v4 l.۫ۤۡ) = (r2v2 l.۫ۤۡ), (r2v3 l.۫ۤۡ), (r2v2 l.۫ۤۡ) binds: [B:64:0x02a0, B:49:0x01f0, B:42:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:64:0x02a0, B:49:0x01f0, B:42:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String) binds: [B:64:0x02a0, B:49:0x01f0, B:42:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r11v32 short[]) = (r11v26 short[]), (r11v31 short[]), (r11v33 short[]) binds: [B:64:0x02a0, B:49:0x01f0, B:42:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:64:0x02a0, B:49:0x01f0, B:42:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r21v4 short) = (r21v3 short), (r21v2 short), (r21v2 short) binds: [B:64:0x02a0, B:49:0x01f0, B:42:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r25v23 java.util.HashSet) = (r25v17 java.util.HashSet), (r25v22 java.util.HashSet), (r25v25 java.util.HashSet) binds: [B:64:0x02a0, B:49:0x01f0, B:42:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0349 A[PHI: r1 r5 r12 r13 r14 r16 r17 r20 r26
      0x0349: PHI (r1v39 java.util.HashSet) = (r1v2 java.util.HashSet), (r1v2 java.util.HashSet), (r1v35 java.util.HashSet), (r1v40 java.util.HashSet) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r16v6 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v7 short[]) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r17v6 char) = (r17v2 char), (r17v2 char), (r17v2 char), (r17v7 char) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r20v7 short) = (r20v2 short), (r20v2 short), (r20v2 short), (r20v8 short) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r26v30 short[]) = (r26v3 short[]), (r26v3 short[]), (r26v27 short[]), (r26v31 short[]) binds: [B:36:0x017a, B:9:0x006d, B:54:0x0217, B:46:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static HashSet m7912() {
        int iM55979;
        int i;
        int i2;
        short s;
        int iM55680;
        int i3;
        int i4;
        int i5;
        HashSet hashSet;
        int i6 = C1003.f81929;
        int i7 = C1044.f81959;
        int iM559710 = C0946.m55979("֫ۡ") ^ i6;
        int i8 = ((iM559710 ^ i7) * (-377)) ^ 157194399;
        String[] strArr = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM559710 ^ 1386373493;
        int length = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 0;
        short s2 = 0;
        short s3 = 0;
        int i16 = -22995478;
        String strM56333 = null;
        short[] sArr3 = null;
        String str = null;
        String str2 = null;
        int i17 = 0;
        String strM55936 = null;
        InterfaceC14100 interfaceC14100 = null;
        HashSet hashSet2 = null;
        while (true) {
            i16 = i9 ^ (i8 & (((i16 ^ i7) * (-11109)) >> 31));
            switch (i16) {
                case -2044045889:
                case -1646632710:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (i7 - C0873.m55680("ۚۤ")) * 23;
                        i = ((iM55979 ^ i6) * (-23091)) ^ 1151747770;
                        i2 = -1229432508;
                    } else {
                        iM55979 = (C0873.m55680("ۢۤ") ^ i7) * (-123);
                        i = ((iM55979 ^ i6) * (-27675)) ^ 876291800;
                        i2 = -232089412;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1982943298:
                case -1668215116:
                    C1012.m56134();
                    if (C0890.f81849 == 0) {
                        iM55979 = (C0946.m55979("ᩳᩴ") + i6) * (-47);
                        i = ((iM55979 ^ i7) * 10465) ^ (-1206606983);
                        i2 = -636745793;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    } else {
                        hashSet2 = hashSet2;
                        s = s2;
                        sArr = sArr;
                        int iM559711 = C0946.m55979("ۡۜ") ^ i6;
                        s2 = s;
                        i8 = ((iM559711 ^ i7) * (-17187)) ^ 1197243120;
                        sArr = sArr;
                        hashSet = hashSet2;
                        i9 = iM559711 ^ 800328483;
                        hashSet2 = hashSet;
                    }
                    break;
                case -1973041266:
                case 365462007:
                    i10 = 10577;
                    iM55680 = (C0946.m55979("᩸ۧ") + i6) * 85;
                    i3 = ((iM55680 ^ i7) * 14311) ^ 1029676188;
                    i4 = 291222507;
                    i5 = iM55680 ^ i4;
                    sArr = sArr;
                    hashSet = hashSet2;
                    i9 = i5;
                    i8 = i3;
                    hashSet2 = hashSet;
                    break;
                case -1925242676:
                case 205852780:
                    if (i17 < length) {
                        iM55979 = (i6 - C0873.m55680("᩵ۨ")) * (-123);
                        i = ((iM55979 ^ i7) * (-16177)) ^ (-2067690787);
                        i2 = 1646282741;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ܿ᩻")) * 119;
                        i = ((iM55979 ^ i6) * 23537) ^ 1201479568;
                        i2 = 1160140725;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1915095967:
                case -71543927:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    s2 = sArr3[c];
                    if (C1964.f83032 > 0) {
                        iM55680 = C0946.m55979("ܳ۫") ^ i7;
                        i3 = ((iM55680 ^ i6) * (-23735)) ^ 949517428;
                        i4 = -2047766682;
                        i5 = iM55680 ^ i4;
                        sArr = sArr;
                        hashSet = hashSet2;
                        i9 = i5;
                        i8 = i3;
                        hashSet2 = hashSet;
                    } else {
                        sArr = sArr;
                        hashSet2 = hashSet2;
                        iM55979 = (C0873.m55680("ۢۤ") ^ i7) * (-123);
                        i = ((iM55979 ^ i6) * (-27675)) ^ 876291800;
                        i2 = -232089412;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1857871959:
                case 1644602760:
                    sArr = sArr;
                    hashSet2 = new HashSet();
                    if (!C0917.f81868) {
                        iM55680 = (C0873.m55680("ۡ᩻") ^ i7) * (-113);
                        hashSet2 = hashSet2;
                        i3 = ((iM55680 ^ i6) * 9473) ^ 1049213296;
                        i4 = -2132659443;
                        i5 = iM55680 ^ i4;
                        sArr = sArr;
                        hashSet = hashSet2;
                        i9 = i5;
                        i8 = i3;
                        hashSet2 = hashSet;
                    } else {
                        sArr = sArr;
                        iM55979 = (C0873.m55680("ۢۤ") ^ i7) * (-123);
                        i = ((iM55979 ^ i6) * (-27675)) ^ 876291800;
                        i2 = -232089412;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1752235480:
                case -1671609375:
                    ServiceConnectionC1013.m56151(hashSet2, str2);
                    iM55979 = (i7 - C0873.m55680("ۨᩳ")) * (-55);
                    i = ((iM55979 ^ i6) * (-711)) ^ (-530141428);
                    i2 = 17030533;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1247738384:
                case 1368950153:
                    i17++;
                    iM55979 = C0946.m55979("۫ۘ") ^ i7;
                    i = ((iM55979 ^ i6) * 571) ^ (-94871313);
                    i2 = -2078352135;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1169574417:
                case 285031682:
                    hashSet2 = hashSet2;
                    sArr = f81874;
                    i12 = 1;
                    if (C1003.f81929 > 0) {
                        int iM55681 = C0873.m55680("ܺܶ") ^ i7;
                        i3 = ((iM55681 ^ i6) * (-7017)) ^ 34667237;
                        i5 = iM55681 ^ (-395842599);
                        hashSet = hashSet2;
                        i9 = i5;
                        i8 = i3;
                        hashSet2 = hashSet;
                    } else {
                        hashSet2 = hashSet2;
                        iM55979 = (C0873.m55680("ۢۤ") ^ i7) * (-123);
                        i = ((iM55979 ^ i6) * (-27675)) ^ 876291800;
                        i2 = -232089412;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case -892185997:
                case 521110222:
                    String[] strArrM55811 = C0906.m55811(strM56333, C1024.m56203(sArr2, i11, i13, i10));
                    length = strArrM55811.length;
                    i17 = 0;
                    strArr = strArrM55811;
                    iM55979 = C0946.m55979("۫ۘ") ^ i7;
                    i = ((iM55979 ^ i6) * 571) ^ (-94871313);
                    i2 = -2078352135;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -880638850:
                case 1896965798:
                    C0947.m55997();
                    if (RunnableC0871.m55672() < 0) {
                        hashSet2 = hashSet2;
                        s = s2;
                        sArr = sArr;
                        int iM559712 = C0946.m55979("ۡۜ") ^ i6;
                        s2 = s;
                        i8 = ((iM559712 ^ i7) * (-17187)) ^ 1197243120;
                        sArr = sArr;
                        hashSet = hashSet2;
                        i9 = iM559712 ^ 800328483;
                        hashSet2 = hashSet;
                    } else {
                        iM55979 = (i7 - C0873.m55680("ۚۤ")) * 23;
                        i = ((iM55979 ^ i6) * (-23091)) ^ 1151747770;
                        i2 = -1229432508;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case -774873369:
                case 1208008406:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    if (i15 - (s2 * s3) < 0) {
                        iM55680 = (C0873.m55680("ۛۘ") ^ i7) * 17;
                        i3 = ((iM55680 ^ i6) * (-79)) ^ (-777090604);
                        i4 = -2072136357;
                    } else {
                        iM55680 = C0873.m55680("ۗܳ") ^ i6;
                        i3 = ((iM55680 ^ i7) * 23297) ^ 295408058;
                        i4 = 831670276;
                    }
                    i5 = iM55680 ^ i4;
                    sArr = sArr;
                    hashSet = hashSet2;
                    i9 = i5;
                    i8 = i3;
                    hashSet2 = hashSet;
                    break;
                case -551155142:
                case 229275814:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    s = s2;
                    int i18 = s + 744;
                    if (RunnableC0938.m55938() == 0) {
                        s2 = s;
                        iM55680 = C0873.m55680("ᩴܶ") ^ i7;
                        i14 = i18;
                        i3 = ((iM55680 ^ i6) * 17091) ^ 340957783;
                        i4 = -1649552602;
                        i5 = iM55680 ^ i4;
                        sArr = sArr;
                        hashSet = hashSet2;
                        i9 = i5;
                        i8 = i3;
                        hashSet2 = hashSet;
                    } else {
                        i14 = i18;
                        int iM559713 = C0946.m55979("ۡۜ") ^ i6;
                        s2 = s;
                        i8 = ((iM559713 ^ i7) * (-17187)) ^ 1197243120;
                        sArr = sArr;
                        hashSet = hashSet2;
                        i9 = iM559713 ^ 800328483;
                        hashSet2 = hashSet;
                    }
                    break;
                case -417482466:
                case -157106298:
                    RunnableC0871.m55672();
                    return null;
                case -311344308:
                case 1614552381:
                    sArr = sArr;
                    strM55936 = RunnableC0938.m55936(sArr, i12, 19, i10);
                    str = "";
                    if (C1048.f81963) {
                        iM55680 = (i7 - C0946.m55979("᩷᩵")) * (-27);
                        hashSet2 = hashSet2;
                        i3 = ((iM55680 ^ i6) * 4747) ^ (-1194036761);
                        i4 = -293759550;
                    } else {
                        hashSet2 = hashSet2;
                        iM55680 = C0873.m55680("᩵֫") ^ i7;
                        i3 = ((iM55680 ^ i6) * 2837) ^ 2137173787;
                        i4 = 360859892;
                    }
                    i5 = iM55680 ^ i4;
                    sArr = sArr;
                    hashSet = hashSet2;
                    i9 = i5;
                    i8 = i3;
                    hashSet2 = hashSet;
                    break;
                case -162919322:
                case 334220112:
                    i10 = 31638;
                    iM55680 = (C0946.m55979("᩸ۧ") + i6) * 85;
                    i3 = ((iM55680 ^ i7) * 14311) ^ 1029676188;
                    i4 = 291222507;
                    i5 = iM55680 ^ i4;
                    sArr = sArr;
                    hashSet = hashSet2;
                    i9 = i5;
                    i8 = i3;
                    hashSet2 = hashSet;
                    break;
                case -91734721:
                case 231575376:
                    C1012.m56134();
                    iM55979 = (i7 - C0873.m55680("ۚۤ")) * 23;
                    i = ((iM55979 ^ i6) * (-23091)) ^ 1151747770;
                    i2 = -1229432508;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -34079522:
                case 320843740:
                    str2 = strArr[i17];
                    if (C1194.m56397(str2)) {
                        iM55979 = (i7 - C0873.m55680("ۨᩳ")) * (-55);
                        i = ((iM55979 ^ i6) * (-711)) ^ (-530141428);
                        i2 = 17030533;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ܽ᩺")) * 53;
                        i = ((iM55979 ^ i7) * (-16437)) ^ (-1649787812);
                        i2 = -1251713041;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case 200496670:
                case 1893437323:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    sArr3 = f81874;
                    c = 0;
                    if (C1036.f81953 < 0) {
                        iM55680 = (C0873.m55680("ܺ֡") ^ i6) * (-109);
                        i3 = ((iM55680 ^ i7) * 26771) ^ 113545271;
                        i4 = -537666884;
                        i5 = iM55680 ^ i4;
                        sArr = sArr;
                        hashSet = hashSet2;
                        i9 = i5;
                        i8 = i3;
                        hashSet2 = hashSet;
                    } else {
                        sArr = sArr;
                        hashSet2 = hashSet2;
                        iM55979 = (C0873.m55680("ۢۤ") ^ i7) * (-123);
                        i = ((iM55979 ^ i6) * (-27675)) ^ 876291800;
                        i2 = -232089412;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case 368441788:
                case 918262205:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    i15 = i14 * i14;
                    s3 = 2976;
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("᩵֫") ^ i7;
                        i3 = ((iM55680 ^ i6) * 2837) ^ 2137173787;
                        i4 = 360859892;
                    } else {
                        iM55680 = (C0946.m55979("֨ܿ") + i6) * (-35);
                        i3 = ((iM55680 ^ i7) * (-2387)) ^ 871331246;
                        i4 = -1734365756;
                    }
                    i5 = iM55680 ^ i4;
                    sArr = sArr;
                    hashSet = hashSet2;
                    i9 = i5;
                    i8 = i3;
                    hashSet2 = hashSet;
                    break;
                case 617006801:
                case 761680141:
                    return hashSet2;
                case 833478677:
                case 1334216115:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    interfaceC14100 = ApplicationC21448.f67649;
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("᩵֫") ^ i7;
                        i3 = ((iM55680 ^ i6) * 2837) ^ 2137173787;
                        i4 = 360859892;
                    } else {
                        iM55680 = (C0946.m55979("ۤ۫") + i6) * 127;
                        i3 = ((iM55680 ^ i7) * 19335) ^ (-1990474094);
                        i4 = -1595279490;
                    }
                    i5 = iM55680 ^ i4;
                    sArr = sArr;
                    hashSet = hashSet2;
                    i9 = i5;
                    i8 = i3;
                    hashSet2 = hashSet;
                    break;
                case 1241576745:
                case 1891891808:
                    strM56333 = C1053.m56333(interfaceC14100, strM55936, str);
                    sArr2 = f81874;
                    i11 = 20;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("ۢۤ") ^ i7) * (-123);
                        i = ((iM55979 ^ i6) * (-27675)) ^ 876291800;
                        i2 = -232089412;
                    } else {
                        iM55979 = (C0946.m55979("֨ۙ") + i6) * 37;
                        i = ((iM55979 ^ i7) * (-8709)) ^ (-1976138892);
                        i2 = 1833076037;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                default:
                    i13 = 2;
                    if (C0917.f81868) {
                        iM55979 = (i7 - C0873.m55680("ۚۤ")) * 23;
                        i = ((iM55979 ^ i6) * (-23091)) ^ 1151747770;
                        i2 = -1229432508;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ۖ᩷")) * C0254q.f1218h;
                        i = ((iM55979 ^ i7) * (-13349)) ^ (-436128100);
                        i2 = 504993560;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0146  */
    /* JADX WARN: Code duplicated, block: B:56:0x018d  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f6 A[PHI: r0 r1 r4 r5
      0x01f6: PHI (r0v6 bin.mt.plugin.api.LocalString) = 
      (r0v5 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
     binds: [B:63:0x01f4, B:39:0x010c, B:23:0x0066, B:16:0x0047, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r1v4 java.util.HashSet) = 
      (r1v3 java.util.HashSet)
      (r1v2 java.util.HashSet)
      (r1v2 java.util.HashSet)
      (r1v2 java.util.HashSet)
      (r1v2 java.util.HashSet)
     binds: [B:63:0x01f4, B:39:0x010c, B:23:0x0066, B:16:0x0047, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r4v3 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v6 java.lang.String)
     binds: [B:63:0x01f4, B:39:0x010c, B:23:0x0066, B:16:0x0047, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r5v5 l.᩶᩻᩷) = (r5v2 l.᩶᩻᩷), (r5v2 l.᩶᩻᩷), (r5v4 l.᩶᩻᩷), (r5v2 l.᩶᩻᩷), (r5v2 l.᩶᩻᩷) binds: [B:63:0x01f4, B:39:0x010c, B:23:0x0066, B:16:0x0047, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static Set m7914() {
        int iM55680;
        int i;
        LocalString localStringM38479 = null;
        HashSet hashSetM7912 = null;
        Iterator it = null;
        String str = null;
        C21862 c21862 = null;
        int i2 = 299423969;
        int i3 = C0863.f81833;
        int i4 = C0992.f81922;
        int iM55681 = C0873.m55680("ᩳۤ") ^ i3;
        int i5 = ((iM55681 ^ i4) * 4465) ^ (-920841352);
        int i6 = -1867907309;
        while (true) {
            int i7 = iM55681 ^ i6;
            C1782 c1782 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-20353)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2008971581:
                    case 1875479451:
                        localStringM38479 = C16907.m38479();
                        hashSetM7912 = m7912();
                        if (C0949.f81897 >= 0) {
                            iM55680 = (C0946.m55979("ܳ᩸") ^ i3) * 77;
                            i5 = ((iM55680 ^ i4) * (-31415)) ^ (-205836858);
                            i = 654171276;
                        } else {
                            iM55680 = C0873.m55680("᩹۠") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-13421)) ^ 1271914239;
                            i = 1905790824;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1987701286:
                    case 2095092912:
                        if (C0873.f81841 <= 0) {
                            iM55680 = (C0946.m55979("֫ܺ") + i4) * (-117);
                            i5 = ((iM55680 ^ i3) * 11589) ^ 759919188;
                            i = 1110441968;
                        } else {
                            iM55680 = (i4 - C0946.m55979("ᩳۜ")) * 53;
                            i5 = ((iM55680 ^ i3) * 31373) ^ (-174154844);
                            i = -293070137;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1971780364:
                    case 162408257:
                        if (C1024.f81946) {
                            iM55680 = (C0946.m55979("֫ܺ") + i4) * (-117);
                            i5 = ((iM55680 ^ i3) * 11589) ^ 759919188;
                            i = 1110441968;
                        } else {
                            iM55680 = (C0946.m55979("ܳ᩸") ^ i3) * 77;
                            i5 = ((iM55680 ^ i4) * (-31415)) ^ (-205836858);
                            i = 654171276;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1720200386:
                    case -1183961598:
                        return C21562.unmodifiableSet(c1782);
                    case -1601696038:
                    case 1478164440:
                        C0967.m56074();
                        C0894.m55769();
                        iM55680 = (C0946.m55979("֫ܺ") + i4) * (-117);
                        i5 = ((iM55680 ^ i3) * 11589) ^ 759919188;
                        i = 1110441968;
                        i7 = iM55680 ^ i;
                        break;
                    case -1463316013:
                    case 1768978414:
                        if (C0861.m55626()) {
                            iM55680 = (i3 - C0946.m55979("֡ۧ")) * 41;
                            i5 = ((iM55680 ^ i4) * 19795) ^ 2130569249;
                            i = -1342527503;
                        } else {
                            iM55680 = (C0946.m55979("᩵ᩳ") + i4) * (-93);
                            i5 = ((iM55680 ^ i3) * (-31697)) ^ (-1953406331);
                            i = -300904044;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1289070143:
                    case -997199519:
                        if (RunnableC0897.f81856) {
                            iM55680 = C0946.m55979("֨ۤ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-20807)) ^ (-1816393905);
                            i = 1678467469;
                        } else {
                            iM55680 = (C0873.m55680("֫᩺") ^ i4) * (-15);
                            i5 = ((iM55680 ^ i3) * (-28237)) ^ 471156191;
                            i = -1712062181;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1102972554:
                    case -515922390:
                        if (C0882.m55710() == 0) {
                            iM55680 = (C0946.m55979("֫ܺ") + i4) * (-117);
                            i5 = ((iM55680 ^ i3) * 11589) ^ 759919188;
                            i = 1110441968;
                        } else {
                            iM55680 = (i3 - C0946.m55979("֡ۧ")) * 41;
                            i5 = ((iM55680 ^ i4) * 19795) ^ 2130569249;
                            i = -1342527503;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1048181801:
                    case -615586023:
                        if (C1012.f81938 < 0) {
                            c1782 = new C1782(hashSetM7912.size());
                            it = hashSetM7912.iterator();
                            iM55680 = (i4 - C0946.m55979("ᩳ۫")) * 11;
                            i5 = ((iM55680 ^ i3) * 9555) ^ (-1585873299);
                            i = -598755380;
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case -548505132:
                    case 99868570:
                        if (C0912.m55833()) {
                            iM55680 = (C0946.m55979("ܳ᩸") ^ i3) * 77;
                            i5 = ((iM55680 ^ i4) * (-31415)) ^ (-205836858);
                            i = 654171276;
                        } else {
                            iM55680 = (C0873.m55680("ۧۡ") ^ i3) * 109;
                            i5 = ((iM55680 ^ i4) * 28491) ^ (-2012531605);
                            i = 1574245352;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -377302588:
                    case 1849942338:
                        if (C0866.m55647(it)) {
                            iM55680 = C0946.m55979("᩹ۡ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 4265) ^ 3226755;
                            i = -729609633;
                        } else {
                            iM55680 = C0873.m55680("ܺۨ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 3815) ^ 1145994437;
                            i = -2120452399;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -349811758:
                    case 1811734810:
                        if (C0927.f81875) {
                            iM55680 = (i3 - C0946.m55979("֡ۧ")) * 41;
                            i5 = ((iM55680 ^ i4) * 19795) ^ 2130569249;
                            i = -1342527503;
                        } else {
                            iM55680 = C0873.m55680("᩻᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * 26161) ^ 1240464993;
                            i = 690829297;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 407560158:
                    case 1158530558:
                        if (C0955.f81898) {
                            iM55680 = (C0946.m55979("֫ܺ") + i4) * (-117);
                            i5 = ((iM55680 ^ i3) * 11589) ^ 759919188;
                            i = 1110441968;
                        } else {
                            iM55680 = (i3 - C0873.m55680("ۡ᩺")) * 15;
                            i5 = ((iM55680 ^ i4) * (-26525)) ^ 819130256;
                            i = 507904034;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 653764069:
                    case 2123534805:
                        C0877.m55696();
                        return null;
                    case 727374938:
                    case 1382681122:
                        if (C0967.f81910 < 0) {
                            iM55680 = (C0946.m55979("֫ܺ") + i4) * (-117);
                            i5 = ((iM55680 ^ i3) * 11589) ^ 759919188;
                            i = 1110441968;
                        } else {
                            iM55680 = (C0873.m55680("֫᩺") ^ i4) * (-15);
                            i5 = ((iM55680 ^ i3) * (-28237)) ^ 471156191;
                            i = -1712062181;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 798360725:
                    case 1077893889:
                        c21862 = (C21862) localStringM38479;
                        if (C0967.f81910 >= 0) {
                            iM55680 = (C0946.m55979("ܳ᩸") ^ i3) * 77;
                            i5 = ((iM55680 ^ i4) * (-31415)) ^ (-205836858);
                            i = 654171276;
                        } else {
                            iM55680 = (C0873.m55680("ۙۚ") ^ i4) * 35;
                            i5 = ((iM55680 ^ i3) * (-8785)) ^ 2126190730;
                            i = 719501127;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 1475143124:
                    case 2137518480:
                        c1782.add(c21862.getOrDefault(str, str));
                        iM55680 = (i4 - C0946.m55979("ᩳ۫")) * 11;
                        i5 = ((iM55680 ^ i3) * 9555) ^ (-1585873299);
                        i = -598755380;
                        i7 = iM55680 ^ i;
                        break;
                    default:
                        str = (String) C0955.m56035(it);
                        if (C0947.f81895) {
                            iM55680 = (C0946.m55979("ܳ᩸") ^ i3) * 77;
                            i5 = ((iM55680 ^ i4) * (-31415)) ^ (-205836858);
                            i = 654171276;
                        } else {
                            iM55680 = (C0946.m55979("ܰܳ") ^ i3) * 93;
                            i5 = ((iM55680 ^ i4) * (-9107)) ^ 1942917142;
                            i = 571274543;
                        }
                        i7 = iM55680 ^ i;
                        break;
                }
            }
            iM55681 = (i4 - C0946.m55979("ۢۡ")) * (-121);
            i5 = ((iM55681 ^ i3) * (-15903)) ^ (-2143610166);
            i6 = 1311916413;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fb, code lost:
    
        if (p067l.C0906.f81862 >= 0) goto L12;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7913(AbstractActivityC5549 abstractActivityC5549, final Runnable runnable) {
        View view;
        int i;
        int i2;
        int i3;
        short[] sArr;
        int i4;
        int iM55979;
        int i5;
        int i6;
        int iM559710;
        int i7;
        int i8;
        int i9;
        int iM55680;
        int i10;
        int i11;
        Object obj;
        C21862 c21862;
        int i12;
        View viewM56111;
        int iM55681;
        int i13;
        int i14;
        View view2;
        C21862 c21863;
        ListView listView;
        short[] sArr2;
        int iM559711;
        int i15;
        int i16;
        int iM55682;
        int i17;
        int iM559712;
        int i18;
        int i19;
        int i20;
        int iM55683;
        int i21;
        AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
        int i22 = 0;
        int i23 = 0;
        int i24 = -711486211;
        int i25 = C1964.f83032;
        int i26 = ViewOnClickListenerC0939.f81888;
        int iM55684 = C0873.m55680("֨۫") ^ i26;
        int i27 = ((iM55684 ^ i25) * 17995) ^ 1296356990;
        int i28 = iM55684 ^ (-43057891);
        View view3 = null;
        ListView listView2 = null;
        final ArrayList arrayList = null;
        C9507 c9507 = null;
        short[] sArr3 = null;
        int i29 = 0;
        int iM55685 = 0;
        int iM55686 = 0;
        int iM55687 = 0;
        int iM559713 = 0;
        int iM559714 = 0;
        int i30 = 0;
        short s = 0;
        TextView textView = null;
        C21862 c21864 = null;
        String str = null;
        short[] sArr4 = null;
        int i31 = 0;
        Object obj2 = null;
        C20671 c20671 = null;
        int i32 = 0;
        final C23804 c23804 = null;
        Iterator it = null;
        HashSet hashSet = null;
        boolean z = false;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * (-3655)) >> 31));
            switch (i24) {
                case -2109717094:
                case 311910083:
                    C0912.m55833();
                    if (!C0937.f81884) {
                        c21864 = c21864;
                        view = view3;
                        i32 = i32;
                        i2 = i31;
                        i3 = i30;
                        sArr = sArr3;
                        int iM55688 = C0873.m55680("ۗܰ") ^ i25;
                        view2 = view;
                        i27 = ((iM55688 ^ i26) * 30589) ^ (-300620293);
                        sArr3 = sArr;
                        i30 = i3;
                        i31 = i2;
                        c21864 = c21864;
                        listView2 = listView2;
                        i28 = iM55688 ^ 1841703874;
                        i32 = i32;
                        view3 = view2;
                    } else {
                        c21864 = c21864;
                        view3 = view3;
                        int i33 = i30;
                        sArr3 = sArr3;
                        listView2 = listView2;
                        i31 = i31;
                        i4 = i33;
                        iM55680 = (i26 - C0946.m55979("ۖۙ")) * (-61);
                        i27 = ((iM55680 ^ i25) * 20459) ^ 1293026025;
                        i10 = 1320533132;
                        i9 = iM55680 ^ i10;
                        c21864 = c21864;
                        i32 = i32;
                        obj2 = obj2;
                        view3 = view3;
                        i28 = i9;
                        abstractActivityC55410 = abstractActivityC5549;
                        int i34 = i31;
                        listView2 = listView2;
                        sArr3 = sArr3;
                        i30 = i4;
                        i31 = i34;
                    }
                    break;
                case -2087641246:
                case 1961573762:
                    obj2 = obj2;
                    listView2 = listView2;
                    view3 = view3;
                    C21862 c21865 = (C21862) C16907.m38479();
                    TreeSet treeSet = new TreeSet(c21865.keySet());
                    arrayList = new ArrayList(treeSet.size() - 1);
                    HashSet hashSetM7912 = m7912();
                    c21863 = c21865;
                    it = treeSet.iterator();
                    hashSet = hashSetM7912;
                    z = true;
                    iM55682 = C0946.m55979("᩹ܳ") ^ i26;
                    i15 = ((iM55682 ^ i25) * 15579) ^ (-492338916);
                    i17 = 120676734;
                    i20 = iM55682 ^ i17;
                    listView2 = listView2;
                    c21864 = c21863;
                    i28 = i20;
                    i32 = i32;
                    view3 = view3;
                    i27 = i15;
                    obj2 = obj2;
                    break;
                case -2053529510:
                case 1478882840:
                    break;
                case -1983560118:
                case 220874098:
                    obj2 = obj2;
                    c21864 = c21864;
                    view3 = view3;
                    i32 = i32;
                    int i35 = i30;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i31 = i31;
                    i4 = i35;
                    iM559714 = C0946.m55979(C0890.m55726(f81874, 23, 3, i29)) ^ 2104356193;
                    if (C0882.f81846) {
                        iM55680 = (i26 - C0946.m55979("ۖۙ")) * (-61);
                        i27 = ((iM55680 ^ i25) * 20459) ^ 1293026025;
                        i10 = 1320533132;
                    } else {
                        iM55680 = (i26 - C0873.m55680("ܳ۬")) * 57;
                        i27 = ((iM55680 ^ i25) * 25481) ^ 353967790;
                        i10 = -2019114738;
                    }
                    i9 = iM55680 ^ i10;
                    c21864 = c21864;
                    i32 = i32;
                    obj2 = obj2;
                    view3 = view3;
                    i28 = i9;
                    abstractActivityC55410 = abstractActivityC5549;
                    int i36 = i31;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i30 = i4;
                    i31 = i36;
                    break;
                case -1898538847:
                case -1579622415:
                    c21863 = c21864;
                    iM559713 = C0946.m55979(C1012.m56144(sArr4, i32, 3, i29));
                    if (C0898.f81858 > 0) {
                        iM559712 = C0946.m55979("᩷ۖ") ^ i26;
                        i18 = ((iM559712 ^ i25) * 12719) ^ 1254905971;
                        i19 = 714243688;
                        int i37 = iM559712 ^ i19;
                        c21864 = c21863;
                        i28 = i37;
                        i27 = i18;
                    } else {
                        obj2 = obj2;
                        sArr2 = sArr3;
                        listView = listView2;
                        view3 = view3;
                        i32 = i32;
                        iM559711 = (C0946.m55979("ᩳܿ") ^ i25) * 65;
                        i15 = ((iM559711 ^ i26) * (-2083)) ^ 373144618;
                        i16 = -1594274432;
                        i20 = iM559711 ^ i16;
                        listView2 = listView;
                        c21864 = c21863;
                        sArr3 = sArr2;
                        i28 = i20;
                        i32 = i32;
                        view3 = view3;
                        i27 = i15;
                        obj2 = obj2;
                    }
                    break;
                case -1808002630:
                case -929693927:
                    obj2 = obj2;
                    c21863 = c21864;
                    listView = listView2;
                    view3 = view3;
                    i32 = i32;
                    textView = (TextView) C0892.m55755(view3, iM55686 ^ 2122520408);
                    sArr2 = f81874;
                    i30 = 32;
                    i31 = 3;
                    if (RunnableC0871.m55672() >= 0) {
                        iM559711 = (C0946.m55979("ᩳܿ") ^ i25) * 65;
                        i15 = ((iM559711 ^ i26) * (-2083)) ^ 373144618;
                        i16 = -1594274432;
                    } else {
                        iM559711 = (C0946.m55979("֫᩵") + i26) * (-113);
                        i15 = ((iM559711 ^ i25) * 16661) ^ 832150861;
                        i16 = -904815591;
                    }
                    i20 = iM559711 ^ i16;
                    listView2 = listView;
                    c21864 = c21863;
                    sArr3 = sArr2;
                    i28 = i20;
                    i32 = i32;
                    view3 = view3;
                    i27 = i15;
                    obj2 = obj2;
                    break;
                case -1763947728:
                case 2075210474:
                    obj2 = obj2;
                    c21863 = c21864;
                    view3 = view3;
                    i32 = i32;
                    c23804 = new C23804(abstractActivityC55410, arrayList);
                    listView2 = listView2;
                    listView2.setAdapter((ListAdapter) c23804);
                    listView2.setOnItemClickListener(c23804);
                    int i38 = DialogInterfaceC2564.f4230;
                    iM55682 = C0873.m55680("ۛ᩻") ^ i25;
                    i15 = ((iM55682 ^ i26) * 27467) ^ (-1080491608);
                    i17 = 713862651;
                    i20 = iM55682 ^ i17;
                    listView2 = listView2;
                    c21864 = c21863;
                    i28 = i20;
                    i32 = i32;
                    view3 = view3;
                    i27 = i15;
                    obj2 = obj2;
                    break;
                case -1742276998:
                case 1350966530:
                    C0937.m55917(arrayList, c9507);
                    c21863 = c21864;
                    iM55682 = C0946.m55979("᩹ܳ") ^ i26;
                    i15 = ((iM55682 ^ i25) * 15579) ^ (-492338916);
                    i17 = 120676734;
                    i20 = iM55682 ^ i17;
                    listView2 = listView2;
                    c21864 = c21863;
                    i28 = i20;
                    i32 = i32;
                    view3 = view3;
                    i27 = i15;
                    obj2 = obj2;
                    break;
                case -1557648212:
                case 527385624:
                    c21864 = c21864;
                    c20671 = new C20671(abstractActivityC55410);
                    view = view3;
                    C0927.m55864(c20671, view);
                    if (!C1929.m56553()) {
                        c20671.m46714(new DialogInterface.OnDismissListener() { // from class: l.᩺ܰܽ

                            /* JADX INFO: renamed from: ܽ֡֫, reason: not valid java name and contains not printable characters */
                            private static final short[] f83041 = {8305, 6226, 6239, 6224, 6233, 6219, 6239, 6233, 6235, 6241, 6230, 6231, 6234, 6234, 6235, 6224, 6241, 6224, 6235, 6217};

                            {
                                int i39 = -1462749381;
                                int i40 = C1964.f83032;
                                int i41 = C0898.f81858;
                                int iM559715 = C0946.m55979("֡ۙ") ^ i41;
                                int i42 = ((iM559715 ^ i40) * 30991) ^ (-785330775);
                                int i43 = 2140692578;
                                while (true) {
                                    i39 = ((((i39 ^ i40) * 27959) >> 31) & i42) ^ (iM559715 ^ i43);
                                    switch (i39) {
                                        case -1997454657:
                                        case 606597419:
                                            if (RunnableC0871.f81839 < 0) {
                                                iM559715 = C0946.m55979("᩺֫") ^ i41;
                                                i42 = ((iM559715 ^ i40) * 30977) ^ 182436582;
                                                i43 = 1255254876;
                                            } else {
                                                iM559715 = (C0873.m55680("۫ܿ") + i41) * (-85);
                                                i42 = ((iM559715 ^ i40) * 22987) ^ 334890747;
                                                i43 = 1598261303;
                                            }
                                            break;
                                        case -1963155502:
                                        case -21367511:
                                            if (ViewOnClickListenerC0939.f81888 <= 0) {
                                                iM559715 = C0873.m55680("֡ۨ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 17103) ^ (-813640992);
                                                i43 = 298074799;
                                            } else {
                                                iM559715 = (C0946.m55979("۠᩵") + i41) * 27;
                                                i42 = ((iM559715 ^ i40) * 4299) ^ 1258436803;
                                                i43 = 78849557;
                                            }
                                            break;
                                        case -1483973015:
                                        case 1723123721:
                                            C1124.m56367();
                                            iM559715 = C0946.m55979("᩺֫") ^ i41;
                                            i42 = ((iM559715 ^ i40) * 30977) ^ 182436582;
                                            i43 = 1255254876;
                                            break;
                                        case -1309923009:
                                        case -627857223:
                                            if (C1036.f81953 >= 0) {
                                                iM559715 = C0946.m55979("ۛܿ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 2931) ^ (-852031427);
                                                i43 = -1838185650;
                                            } else {
                                                iM559715 = C0873.m55680("ۤ᩻") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 2321) ^ (-1671897060);
                                                i43 = 2012362399;
                                            }
                                            break;
                                        case -818482400:
                                        case 281839733:
                                            if (C1048.f81963) {
                                                iM559715 = C0873.m55680("ܳۗ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * (-9739)) ^ (-651231036);
                                                i43 = 2125050013;
                                            } else {
                                                iM559715 = C0946.m55979("᩺֫") ^ i41;
                                                i42 = ((iM559715 ^ i40) * 30977) ^ 182436582;
                                                i43 = 1255254876;
                                            }
                                            break;
                                        case -768170495:
                                        case 1719580238:
                                            if (C0890.f81849 != 0) {
                                                iM559715 = C0946.m55979("᩺֫") ^ i41;
                                                i42 = ((iM559715 ^ i40) * 30977) ^ 182436582;
                                                i43 = 1255254876;
                                            } else {
                                                iM559715 = (i40 - C0873.m55680("ۤۤ")) * 25;
                                                i42 = ((iM559715 ^ i41) * 22777) ^ (-907934032);
                                                i43 = -907363207;
                                            }
                                            break;
                                        case -705130151:
                                        case 1112970981:
                                            RunnableC1014.m56177();
                                            ViewOnClickListenerC0939.m55941();
                                            throw new RuntimeException();
                                        case -491441958:
                                        case -32400643:
                                            return;
                                        case -447330086:
                                        case -424741091:
                                            if (C0917.f81868) {
                                                iM559715 = C0946.m55979("ۛܿ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 2931) ^ (-852031427);
                                                i43 = -1838185650;
                                            } else {
                                                iM559715 = C0946.m55979("۫۫") ^ i41;
                                                i42 = ((iM559715 ^ i40) * (-30939)) ^ 387520642;
                                                i43 = 407392989;
                                            }
                                            break;
                                        case 366535723:
                                        case 1512230588:
                                            if (C0912.f81867 > 0) {
                                                iM559715 = C0946.m55979("ۛܿ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 2931) ^ (-852031427);
                                                i43 = -1838185650;
                                            } else {
                                                iM559715 = C0946.m55979("᩺֫") ^ i41;
                                                i42 = ((iM559715 ^ i40) * 30977) ^ 182436582;
                                                i43 = 1255254876;
                                            }
                                            break;
                                        case 528574937:
                                        case 783384112:
                                            if (C1044.f81959 >= 0) {
                                                iM559715 = C0946.m55979("ۛܿ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 2931) ^ (-852031427);
                                                i43 = -1838185650;
                                            } else {
                                                iM559715 = (C0873.m55680("᩺ۜ") ^ i40) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i42 = ((iM559715 ^ i41) * (-8955)) ^ 1004833058;
                                                i43 = -38840461;
                                            }
                                            break;
                                        case 997323494:
                                        case 1998377714:
                                            if (C1024.f81946) {
                                                iM559715 = C0946.m55979("ۛܿ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 2931) ^ (-852031427);
                                                i43 = -1838185650;
                                            } else {
                                                iM559715 = (i41 - C0873.m55680("᩻ܶ")) * 17;
                                                i42 = ((iM559715 ^ i40) * (-8751)) ^ (-1730222216);
                                                i43 = 560049986;
                                            }
                                            break;
                                        case 1091757783:
                                        case 2010825781:
                                            if (C0890.f81849 != 0) {
                                                iM559715 = C0946.m55979("ۛܿ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 2931) ^ (-852031427);
                                                i43 = -1838185650;
                                            } else {
                                                iM559715 = (C0873.m55680("֡۫") ^ i41) * (-35);
                                                i42 = ((iM559715 ^ i40) * 28897) ^ 1733035862;
                                                i43 = 132986331;
                                            }
                                            break;
                                        case 1263161466:
                                        case 1650280005:
                                            if (C0955.f81898) {
                                                iM559715 = C0873.m55680("֡ۨ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 17103) ^ (-813640992);
                                                i43 = 298074799;
                                            } else {
                                                iM559715 = (C0946.m55979("ܿ᩵") ^ i40) * (-105);
                                                i42 = ((iM559715 ^ i41) * 12999) ^ (-1551665745);
                                                i43 = -1536282540;
                                            }
                                            break;
                                        case 1956398563:
                                        case 2075197573:
                                            if (C0894.m55769() < 0) {
                                                iM559715 = C0946.m55979("᩺֫") ^ i41;
                                                i42 = ((iM559715 ^ i40) * 30977) ^ 182436582;
                                                i43 = 1255254876;
                                            } else {
                                                iM559715 = C0873.m55680("ۛۧ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 31405) ^ (-1295090324);
                                                i43 = 540752292;
                                            }
                                            break;
                                        default:
                                            if (ViewOnClickListenerC0939.f81888 <= 0) {
                                                iM559715 = C0873.m55680("֡ۨ") ^ i40;
                                                i42 = ((iM559715 ^ i41) * 17103) ^ (-813640992);
                                                i43 = 298074799;
                                            } else {
                                                iM559715 = (C0946.m55979("᩷᩺") + i41) * (-77);
                                                i42 = ((iM559715 ^ i40) * (-535)) ^ (-1210372565);
                                                i43 = 1107005601;
                                            }
                                            break;
                                    }
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
                            /* JADX WARN: Code duplicated, block: B:47:0x0173 A[PHI: r13
                              0x0173: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:46:0x0171, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:65:0x024c  */
                            /* JADX WARN: Code duplicated, block: B:83:0x032d A[PHI: r8 r16
                              0x032d: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v3 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:82:0x032b, B:42:0x0154, B:16:0x009c, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]
                              0x032d: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:82:0x032b, B:42:0x0154, B:16:0x009c, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:87:0x0365 A[PHI: r14 r15
                              0x0365: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:143:0x0365, B:86:0x0363, B:26:0x00ca, B:23:0x00ae, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]
                              0x0365: PHI (r15v4 short) = (r15v2 short), (r15v3 short), (r15v2 short), (r15v2 short), (r15v2 short) binds: [B:143:0x0365, B:86:0x0363, B:26:0x00ca, B:23:0x00ae, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:91:0x0398 A[PHI: r7 r11 r18 r23
                              0x0398: PHI (r7v3 l.۬ۤۡ) = (r7v2 l.۬ۤۡ), (r7v4 l.۬ۤۡ) binds: [B:90:0x0396, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
                              0x0398: PHI (r11v3 short[]) = (r11v2 short[]), (r11v4 short[]) binds: [B:90:0x0396, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
                              0x0398: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:90:0x0396, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
                              0x0398: PHI (r23v5 short) = (r23v4 short), (r23v3 short) binds: [B:90:0x0396, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int iM55689;
                                int i39;
                                int i40;
                                short[] sArr5;
                                DialogInterfaceOnDismissListenerC24259 dialogInterfaceOnDismissListenerC24259 = this;
                                int i41 = -1802365280;
                                int i42 = C1046.f81962;
                                int i43 = C0992.f81922;
                                int iM556810 = C0873.m55680("᩻ۢ") ^ i43;
                                int i44 = ((iM556810 ^ i42) * 14203) ^ (-256816112);
                                int i45 = iM556810 ^ (-2144951698);
                                short[] sArr6 = null;
                                short[] sArr7 = null;
                                int i46 = 0;
                                int i47 = 0;
                                int i48 = 0;
                                short s2 = 0;
                                int i49 = 0;
                                char c = 0;
                                short s3 = 0;
                                short s4 = 0;
                                C9507 c9508 = null;
                                String strM56203 = null;
                                InterfaceC14770 interfaceC14770M55950 = null;
                                Iterator itM56292 = null;
                                StringBuilder sb = null;
                                Iterator itM56293 = null;
                                Iterator itM56294 = null;
                                ArrayList arrayList2 = null;
                                while (true) {
                                    i41 = i45 ^ (i44 & (((i41 ^ i42) * (-11891)) >> 31));
                                    switch (i41) {
                                        case -2147458781:
                                        case 19324373:
                                            C0882.m55724(runnable);
                                            break;
                                        case -2119465692:
                                        case 1337499645:
                                            if (C0866.m55647(itM56293)) {
                                                iM55689 = C0873.m55680("ۛۡ") ^ i43;
                                                i39 = ((iM55689 ^ i42) * 25029) ^ (-507382870);
                                                i40 = -998730612;
                                            } else {
                                                iM55689 = C0946.m55979("ۤ᩹") ^ i42;
                                                i39 = ((iM55689 ^ i43) * 155) ^ 1645412433;
                                                i40 = 449220693;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1965035715:
                                        case 1112672056:
                                            C1229.m56410();
                                            ViewOnClickListenerC0939.m55941();
                                            iM55689 = C0946.m55979("ۖ۬") ^ i42;
                                            i39 = ((iM55689 ^ i43) * (-18779)) ^ (-1757778139);
                                            i40 = 745121546;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1895419527:
                                        case 1837371481:
                                            if (C0866.f81837 >= 0) {
                                                sArr5 = sArr6;
                                                int iM559715 = C0946.m55979("ۛ᩷") ^ i43;
                                                i45 = iM559715 ^ 538661418;
                                                sArr6 = sArr5;
                                                i44 = ((iM559715 ^ i42) * 26825) ^ (-718960360);
                                            } else {
                                                int iM556811 = C0873.m55680("ܰ۫") ^ i43;
                                                i44 = ((iM556811 ^ i42) * 24545) ^ (-1271794070);
                                                i45 = iM556811 ^ (-2124608210);
                                            }
                                            dialogInterfaceOnDismissListenerC24259 = this;
                                            break;
                                        case -1837326324:
                                        case -269945665:
                                            c = 0;
                                            if (C0877.f81843 < 0) {
                                                iM55689 = C0873.m55680("ۚۜ") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-23903)) ^ 388443702;
                                                i40 = 132886592;
                                                i45 = iM55689 ^ i40;
                                                i44 = i39;
                                            } else {
                                                sArr5 = sArr6;
                                                int iM559716 = C0946.m55979("ۛ᩷") ^ i43;
                                                i45 = iM559716 ^ 538661418;
                                                sArr6 = sArr5;
                                                i44 = ((iM559716 ^ i42) * 26825) ^ (-718960360);
                                                dialogInterfaceOnDismissListenerC24259 = this;
                                            }
                                            break;
                                        case -1795494805:
                                        case -8203857:
                                            strM56203 = C1024.m56203(sArr7, i47, 19, i46);
                                            if (C1053.f81965 <= 0) {
                                                iM55689 = C0873.m55680("ܿᩴ") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-13607)) ^ (-661620321);
                                                i40 = -1586339946;
                                            } else {
                                                iM55689 = C0873.m55680("ۧۡ") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-28907)) ^ (-1427203272);
                                                i40 = -1738024849;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1782205367:
                                        case -138723804:
                                            if (C0866.f81837 >= 0) {
                                                sArr5 = sArr6;
                                                int iM559717 = C0946.m55979("ۛ᩷") ^ i43;
                                                i45 = iM559717 ^ 538661418;
                                                sArr6 = sArr5;
                                                i44 = ((iM559717 ^ i42) * 26825) ^ (-718960360);
                                                dialogInterfaceOnDismissListenerC24259 = this;
                                            } else {
                                                iM55689 = C0946.m55979("ۖ۬") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-18779)) ^ (-1757778139);
                                                i40 = 745121546;
                                                i45 = iM55689 ^ i40;
                                                i44 = i39;
                                            }
                                            break;
                                        case -1709466234:
                                        case 922667271:
                                            if (C0866.m55647(itM56292)) {
                                                iM55689 = C0873.m55680("ۡܿ") ^ i43;
                                                i39 = ((iM55689 ^ i42) * (-11581)) ^ (-1138698446);
                                                i40 = 622096619;
                                            } else {
                                                iM55689 = C0873.m55680("֨᩸") ^ i43;
                                                i39 = ((iM55689 ^ i42) * (-16805)) ^ 46792076;
                                                i40 = 469884933;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1669635525:
                                        case 1461966113:
                                            i49 = s4 + s2;
                                            if (ViewOnClickListenerC0939.m55941() >= 0) {
                                                iM55689 = C0873.m55680("ܿᩴ") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-13607)) ^ (-661620321);
                                                i40 = -1586339946;
                                            } else {
                                                iM55689 = (C0873.m55680("֫᩺") ^ i43) * (-111);
                                                i39 = ((iM55689 ^ i42) * 24355) ^ 379586096;
                                                i40 = -2055085740;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1626760084:
                                        case -927652507:
                                            c9508 = (C9507) C0955.m56035(itM56292);
                                            if (c9508.f26014) {
                                                iM55689 = (C0946.m55979("ۛۜ") + i43) * 119;
                                                i39 = ((iM55689 ^ i42) * (-17957)) ^ (-1592362704);
                                                i40 = -26378745;
                                            } else {
                                                iM55689 = (i42 - C0873.m55680("ۡܰ")) * 63;
                                                i39 = ((iM55689 ^ i43) * 13847) ^ (-665695351);
                                                i40 = -1048751538;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1568742773:
                                        case 92541735:
                                            if (C0866.m55647(itM56294)) {
                                                iM55689 = C0873.m55680("۟ܺ") ^ i42;
                                                i39 = ((iM55689 ^ i43) * 15555) ^ 1721879235;
                                                i40 = -1781870825;
                                            } else {
                                                iM55689 = C0946.m55979("᩺᩶") ^ i43;
                                                i39 = ((iM55689 ^ i42) * 15191) ^ 1777661903;
                                                i40 = 313310894;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1518991372:
                                        case 756569650:
                                            C0906.m55809();
                                            if (C0898.m55800() > 0) {
                                                iM55689 = (C0946.m55979("ۤۖ") + i42) * (-25);
                                                i39 = ((iM55689 ^ i43) * 2715) ^ (-179599392);
                                                i40 = -999794249;
                                            } else {
                                                iM55689 = C0873.m55680("ܿᩴ") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-13607)) ^ (-661620321);
                                                i40 = -1586339946;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1515242613:
                                        case 2074370594:
                                            ArrayList arrayList3 = arrayList;
                                            itM56294 = C1046.m56292(arrayList3);
                                            arrayList2 = arrayList3;
                                            iM55689 = C0946.m55979("ᩳᩳ") ^ i43;
                                            i39 = ((iM55689 ^ i42) * 8963) ^ 1207594249;
                                            i40 = -400108361;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1428063474:
                                        case 1622215270:
                                            i48 = s4 * s3;
                                            s2 = 9829;
                                            if (C1048.m56305() >= 0) {
                                                iM55689 = C0946.m55979("ۖ۬") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-18779)) ^ (-1757778139);
                                                i40 = 745121546;
                                            } else {
                                                iM55689 = C0946.m55979("ۚۧ") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-13057)) ^ (-1344094468);
                                                i40 = -894295087;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1370636558:
                                        case 282134241:
                                            i46 = 42387;
                                            iM55689 = (C0873.m55680("ۢ᩹") ^ i42) * 81;
                                            i39 = ((iM55689 ^ i43) * 3443) ^ 794973481;
                                            i40 = 236603986;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -1023178357:
                                        case -187626484:
                                            if (((C9507) RunnableC0897.m55785(itM56294)).f26014) {
                                                iM55689 = C0946.m55979("ᩳᩳ") ^ i43;
                                                i39 = ((iM55689 ^ i42) * 8963) ^ 1207594249;
                                                i40 = -400108361;
                                            } else {
                                                iM55689 = C0946.m55979("ۤ᩹") ^ i42;
                                                i39 = ((iM55689 ^ i43) * 155) ^ 1645412433;
                                                i40 = 449220693;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -843434714:
                                        case -723312771:
                                            C0894.m55769();
                                            if (C0866.f81837 < 0) {
                                                iM55689 = C0946.m55979("ۖ۬") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-18779)) ^ (-1757778139);
                                                i40 = 745121546;
                                            } else {
                                                iM55689 = (C0946.m55979("ۤۖ") + i42) * (-25);
                                                i39 = ((iM55689 ^ i43) * 2715) ^ (-179599392);
                                                i40 = -999794249;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -827417070:
                                        case 2143014075:
                                            C1194.m56383(C1025.m56231(interfaceC14770M55950, strM56203, C0863.m55639(sb)));
                                            if (C1044.f81959 < 0) {
                                                iM55689 = C0946.m55979("ܶ᩵") ^ i42;
                                                i39 = ((iM55689 ^ i43) * 31763) ^ 995391118;
                                                i40 = 1475329677;
                                                i45 = iM55689 ^ i40;
                                                i44 = i39;
                                            } else {
                                                sArr5 = sArr6;
                                                int iM559718 = C0946.m55979("ۛ᩷") ^ i43;
                                                i45 = iM559718 ^ 538661418;
                                                sArr6 = sArr5;
                                                i44 = ((iM559718 ^ i42) * 26825) ^ (-718960360);
                                                dialogInterfaceOnDismissListenerC24259 = this;
                                            }
                                            break;
                                        case -607480846:
                                        case 1379514090:
                                            if (C0949.f81897 >= 0) {
                                                iM55689 = C0946.m55979("ۖ۬") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-18779)) ^ (-1757778139);
                                                i40 = 745121546;
                                            } else {
                                                iM55689 = (C0946.m55979("ۤܽ") ^ i43) * 9;
                                                i39 = ((iM55689 ^ i42) * 20389) ^ 1464913292;
                                                i40 = 1916634826;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -375573602:
                                        case 1345225106:
                                            i47 = 1;
                                            if (C0992.f81922 >= 0) {
                                                iM55689 = (C0946.m55979("ۤܽ") ^ i43) * 9;
                                                i39 = ((iM55689 ^ i42) * 20389) ^ 1464913292;
                                                i40 = 1916634826;
                                            } else {
                                                iM55689 = C0946.m55979("ܽܿ") ^ i43;
                                                i39 = ((iM55689 ^ i42) * (-23679)) ^ 631133105;
                                                i40 = 2036040249;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -241131483:
                                        case 1720156756:
                                            interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                                            sArr7 = f83041;
                                            if (RunnableC1014.f81941 <= 0) {
                                                iM55689 = C0873.m55680("֡᩺") ^ i42;
                                                i39 = ((iM55689 ^ i43) * 11841) ^ (-454414794);
                                                i40 = -1929133652;
                                            } else {
                                                iM55689 = (C0946.m55979("ܽۗ") + i42) * 27;
                                                i39 = ((iM55689 ^ i43) * 13089) ^ (-1113446489);
                                                i40 = 2004169513;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case -114057488:
                                        case -15828894:
                                            itM56293 = C1046.m56292(arrayList2);
                                            iM55689 = C0873.m55680("֨ۢ") ^ i43;
                                            i39 = ((iM55689 ^ i42) * (-29407)) ^ (-398571820);
                                            i40 = -1575378889;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case 593799941:
                                        case 702137882:
                                            ((C9507) C0955.m56035(itM56293)).f26014 = false;
                                            iM55689 = C0873.m55680("֨ۢ") ^ i43;
                                            i39 = ((iM55689 ^ i42) * (-29407)) ^ (-398571820);
                                            i40 = -1575378889;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case 627818662:
                                        case 1361244581:
                                            s4 = sArr6[c];
                                            s3 = 39316;
                                            if (C1929.f83011 != 0) {
                                                iM55689 = C0873.m55680("֡᩺") ^ i42;
                                                i39 = ((iM55689 ^ i43) * 11841) ^ (-454414794);
                                                i40 = -1929133652;
                                            } else {
                                                iM55689 = (C0946.m55979("ۜۖ") ^ i43) * (-69);
                                                i39 = ((iM55689 ^ i42) * 32249) ^ 1194476617;
                                                i40 = -1825191256;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case 659534553:
                                        case 680949947:
                                            if (C1046.f81962 <= 0) {
                                                iM55689 = C0873.m55680("ܿᩴ") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-13607)) ^ (-661620321);
                                                i40 = -1586339946;
                                            } else {
                                                iM55689 = C0946.m55979("᩺۟") ^ i43;
                                                i39 = ((iM55689 ^ i42) * (-1897)) ^ (-1165768840);
                                                i40 = -1061493657;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case 771441352:
                                        case 1834949813:
                                            C1003.m56121(sb, c9508.f26015);
                                            iM55689 = (i42 - C0873.m55680("ۡܰ")) * 63;
                                            i39 = ((iM55689 ^ i43) * 13847) ^ (-665695351);
                                            i40 = -1048751538;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case 851760285:
                                        case 1314081068:
                                            C0946.m55977(sb, '|');
                                            iM55689 = C0946.m55979("֨᩻") ^ i42;
                                            i39 = ((iM55689 ^ i43) * (-15925)) ^ (-1896180527);
                                            i40 = 2066878908;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case 1258947016:
                                        case 2062395457:
                                            i46 = 6206;
                                            iM55689 = (C0873.m55680("ۢ᩹") ^ i42) * 81;
                                            i39 = ((iM55689 ^ i43) * 3443) ^ 794973481;
                                            i40 = 236603986;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case 1276115687:
                                        case 1453154880:
                                            StringBuilder sb2 = new StringBuilder();
                                            itM56292 = C1046.m56292(arrayList2);
                                            sb = sb2;
                                            iM55689 = (i42 - C0873.m55680("ۡܰ")) * 63;
                                            i39 = ((iM55689 ^ i43) * 13847) ^ (-665695351);
                                            i40 = -1048751538;
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        case 1828479333:
                                        case 1915686499:
                                            sArr5 = f83041;
                                            if (RunnableC0938.f81886 >= 0) {
                                                int iM559719 = C0946.m55979("ۛ᩷") ^ i43;
                                                i45 = iM559719 ^ 538661418;
                                                sArr6 = sArr5;
                                                i44 = ((iM559719 ^ i42) * 26825) ^ (-718960360);
                                                dialogInterfaceOnDismissListenerC24259 = this;
                                            } else {
                                                int iM556812 = C0873.m55680("ܽ᩻") ^ i42;
                                                sArr6 = sArr5;
                                                i44 = ((iM556812 ^ i43) * 7) ^ 1649030668;
                                                i45 = iM556812 ^ (-994721675);
                                            }
                                            break;
                                        case 1842355835:
                                        case 2057365371:
                                            C0947.m55997();
                                            C1028.m56247();
                                            break;
                                        case 1848588947:
                                        case 1922200347:
                                            if ((i49 * i49) - i48 < 0) {
                                                iM55689 = (C0873.m55680("᩻ۧ") ^ i43) * (-101);
                                                i39 = ((iM55689 ^ i42) * (-6493)) ^ 605008042;
                                                i40 = 773761205;
                                            } else {
                                                iM55689 = (C0946.m55979("ۚܳ") + i42) * 77;
                                                i39 = ((iM55689 ^ i43) * 4647) ^ 1157335897;
                                                i40 = 1611151617;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                        default:
                                            if (C0854.m55607(sb) > 0) {
                                                iM55689 = C0873.m55680("ۖۡ") ^ i43;
                                                i39 = ((iM55689 ^ i42) * 18697) ^ 79368141;
                                                i40 = -546994266;
                                            } else {
                                                iM55689 = C0946.m55979("֨᩻") ^ i42;
                                                i39 = ((iM55689 ^ i43) * (-15925)) ^ (-1896180527);
                                                i40 = 2066878908;
                                            }
                                            i45 = iM55689 ^ i40;
                                            i44 = i39;
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        i32 = i32;
                        Object obj3 = obj2;
                        iM55687 = C0873.m55680(C0866.m55652(f81874, 35, 3, i29));
                        if (C1194.f82045 == 0) {
                            int iM559715 = (i26 - C0946.m55979("۫ܿ")) * (-105);
                            i = ((iM559715 ^ i25) * (-18879)) ^ 1334554812;
                            c21864 = c21864;
                            obj2 = obj3;
                            i28 = iM559715 ^ (-803369364);
                            int i39 = i32;
                            view3 = view;
                            i27 = i;
                            i32 = i39;
                        } else {
                            obj2 = obj3;
                            i2 = i31;
                            i3 = i30;
                            sArr = sArr3;
                            int iM55689 = C0873.m55680("ۗܰ") ^ i25;
                            view2 = view;
                            i27 = ((iM55689 ^ i26) * 30589) ^ (-300620293);
                            sArr3 = sArr;
                            i30 = i3;
                            i31 = i2;
                            c21864 = c21864;
                            listView2 = listView2;
                            i28 = iM55689 ^ 1841703874;
                            i32 = i32;
                            view3 = view2;
                        }
                    } else {
                        view3 = view;
                        int i310 = i30;
                        sArr3 = sArr3;
                        listView2 = listView2;
                        i31 = i31;
                        i4 = i310;
                        iM55680 = (i26 - C0946.m55979("ۖۙ")) * (-61);
                        i27 = ((iM55680 ^ i25) * 20459) ^ 1293026025;
                        i10 = 1320533132;
                        i9 = iM55680 ^ i10;
                        c21864 = c21864;
                        i32 = i32;
                        obj2 = obj2;
                        view3 = view3;
                        i28 = i9;
                        abstractActivityC55410 = abstractActivityC5549;
                        int i311 = i31;
                        listView2 = listView2;
                        sArr3 = sArr3;
                        i30 = i4;
                        i31 = i311;
                    }
                    break;
                case -1492458074:
                case -1423261942:
                    c9507 = new C9507(0);
                    c9507.f26015 = str;
                    c9507.f26016 = c21864.getOrDefault(str, str);
                    if (C1071.m56338(hashSet, str)) {
                        iM55683 = C0873.m55680("᩵ܰ") ^ i26;
                        i18 = ((iM55683 ^ i25) * 11577) ^ (-1119300754);
                        i21 = -1579046262;
                    } else {
                        iM55683 = C0946.m55979("ۗ֫") ^ i25;
                        i18 = ((iM55683 ^ i26) * 3183) ^ (-1600317992);
                        i21 = 1701167701;
                    }
                    i28 = iM55683 ^ i21;
                    i27 = i18;
                    break;
                case -1454510231:
                case -856790230:
                    obj2 = obj2;
                    c21864 = c21864;
                    iM559714 = iM559714;
                    view3 = view3;
                    i32 = i32;
                    int i40 = i30;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i31 = i31;
                    i4 = i40;
                    s = f81874[22];
                    i22 = s * s;
                    i23 = 36590401;
                    if (C1964.f83032 <= 0) {
                        iM55979 = (i25 - C0946.m55979("ۘ᩹")) * (-105);
                        i5 = ((iM55979 ^ i26) * 25261) ^ (-132709131);
                        i6 = 1350898536;
                    } else {
                        iM55979 = (C0946.m55979("ܳ᩶") + i25) * 41;
                        i5 = ((iM55979 ^ i26) * 25939) ^ (-70447078);
                        i6 = 1962446048;
                    }
                    i9 = iM55979 ^ i6;
                    iM559714 = iM559714;
                    i27 = i5;
                    c21864 = c21864;
                    i32 = i32;
                    obj2 = obj2;
                    view3 = view3;
                    i28 = i9;
                    abstractActivityC55410 = abstractActivityC5549;
                    int i312 = i31;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i30 = i4;
                    i31 = i312;
                    break;
                case -1381950935:
                case 1573579443:
                    c21863 = c21864;
                    C0906.m55817(c20671, iM55687 ^ 2126306776, obj2);
                    sArr4 = f81874;
                    i32 = 38;
                    iM559712 = (i25 - C0946.m55979("ܰۤ")) * 51;
                    i18 = ((iM559712 ^ i26) * (-3395)) ^ (-87515886);
                    i19 = 500450220;
                    int i313 = iM559712 ^ i19;
                    c21864 = c21863;
                    i28 = i313;
                    i27 = i18;
                    break;
                case -1228857466:
                case 1885747158:
                    C0967.m56074();
                    c21864 = c21864;
                    view3 = view3;
                    int i314 = i30;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i31 = i31;
                    i4 = i314;
                    iM55680 = (i26 - C0946.m55979("ۖۙ")) * (-61);
                    i27 = ((iM55680 ^ i25) * 20459) ^ 1293026025;
                    i10 = 1320533132;
                    i9 = iM55680 ^ i10;
                    c21864 = c21864;
                    i32 = i32;
                    obj2 = obj2;
                    view3 = view3;
                    i28 = i9;
                    abstractActivityC55410 = abstractActivityC5549;
                    int i315 = i31;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i30 = i4;
                    i31 = i315;
                    break;
                case -1124056112:
                case 419132012:
                    C1964.m56597();
                    C1194.m56396();
                    break;
                case -1090422841:
                case 301652790:
                    obj2 = obj2;
                    c21864 = c21864;
                    int i41 = i30;
                    int i42 = i31;
                    view = view3;
                    i32 = i32;
                    short[] sArr5 = sArr3;
                    listView2 = listView2;
                    i31 = i42;
                    int iM556810 = C0873.m55680(C0882.m55717(sArr5, i41, i42, i29)) ^ 2102139594;
                    sArr3 = sArr5;
                    TextView textView2 = textView;
                    C0873.m55684(textView2, iM556810);
                    if (!RunnableC0897.f81856) {
                        view3 = view;
                        textView = textView2;
                        i4 = i41;
                        iM55680 = (i26 - C0946.m55979("ۖۙ")) * (-61);
                        i27 = ((iM55680 ^ i25) * 20459) ^ 1293026025;
                        i10 = 1320533132;
                        i9 = iM55680 ^ i10;
                        c21864 = c21864;
                        i32 = i32;
                        obj2 = obj2;
                        view3 = view3;
                        i28 = i9;
                        abstractActivityC55410 = abstractActivityC5549;
                        int i316 = i31;
                        listView2 = listView2;
                        sArr3 = sArr3;
                        i30 = i4;
                        i31 = i316;
                    } else {
                        int iM556811 = (C0873.m55680("᩹ۧ") + i25) * 101;
                        textView = textView2;
                        i = ((iM556811 ^ i26) * (-30713)) ^ 1281306766;
                        i31 = i31;
                        c21864 = c21864;
                        i28 = iM556811 ^ 926092055;
                        listView2 = listView2;
                        sArr3 = sArr3;
                        i30 = i41;
                        obj2 = obj2;
                        int i317 = i32;
                        view3 = view;
                        i27 = i;
                        i32 = i317;
                    }
                    break;
                case -922150106:
                case 867311080:
                    str = (String) C0955.m56035(it);
                    c21863 = c21864;
                    if (!C0906.m55806(str, C0894.m55773(f81874, 41, 4, i29))) {
                        iM559712 = (C0946.m55979("᩵ۚ") ^ i26) * (-39);
                        i18 = ((iM559712 ^ i25) * (-28945)) ^ 1288562627;
                        i19 = -2012390716;
                        int i318 = iM559712 ^ i19;
                        c21864 = c21863;
                        i28 = i318;
                        i27 = i18;
                    } else {
                        iM55682 = C0946.m55979("᩹ܳ") ^ i26;
                        i15 = ((iM55682 ^ i25) * 15579) ^ (-492338916);
                        i17 = 120676734;
                        i20 = iM55682 ^ i17;
                        listView2 = listView2;
                        c21864 = c21863;
                        i28 = i20;
                        i32 = i32;
                        view3 = view3;
                        i27 = i15;
                        obj2 = obj2;
                    }
                    break;
                case -880457355:
                case 1393688211:
                    obj2 = obj2;
                    c21863 = c21864;
                    listView2 = listView2;
                    view3 = view3;
                    i32 = i32;
                    if (C0866.m55647(it)) {
                        iM55682 = (C0873.m55680("ᩴᩳ") ^ i25) * (-33);
                        i15 = ((iM55682 ^ i26) * 13303) ^ 1661113179;
                        i17 = 1034206732;
                    } else {
                        iM55682 = (C0873.m55680("ۗ֨") ^ i25) * 61;
                        i15 = ((iM55682 ^ i26) * (-583)) ^ 1099278927;
                        i17 = -1392704416;
                    }
                    i20 = iM55682 ^ i17;
                    listView2 = listView2;
                    c21864 = c21863;
                    i28 = i20;
                    i32 = i32;
                    view3 = view3;
                    i27 = i15;
                    obj2 = obj2;
                    break;
                case -713254506:
                case -520317793:
                    obj2 = obj2;
                    c21864 = c21864;
                    int i43 = iM559714;
                    view3 = view3;
                    i32 = i32;
                    int i44 = i30;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i31 = i31;
                    i4 = i44;
                    int i45 = i22 + i23;
                    short s2 = s;
                    int i46 = s2 + 6049;
                    if ((i46 * i46) - (i45 + i45) <= 0) {
                        iM559710 = (i26 - C0946.m55979("᩸ۡ")) * 23;
                        i7 = ((iM559710 ^ i25) * 3899) ^ (-697034485);
                        i8 = -970746009;
                    } else {
                        iM559710 = C0946.m55979("᩶ܶ") ^ i26;
                        i7 = ((iM559710 ^ i25) * (-4935)) ^ (-1526769632);
                        i8 = 1443051853;
                    }
                    i9 = iM559710 ^ i8;
                    iM559714 = i43;
                    s = s2;
                    i27 = i7;
                    c21864 = c21864;
                    i32 = i32;
                    obj2 = obj2;
                    view3 = view3;
                    i28 = i9;
                    abstractActivityC55410 = abstractActivityC5549;
                    int i319 = i31;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i30 = i4;
                    i31 = i319;
                    break;
                case -224042282:
                case 1257152112:
                    obj2 = obj2;
                    c21863 = c21864;
                    int i47 = i30;
                    view3 = view3;
                    i32 = i32;
                    short[] sArr6 = sArr3;
                    listView = listView2;
                    int i48 = i31;
                    iM55686 = C0873.m55680(C0912.m55822(f81874, 29, 3, i29));
                    if (C1017.f81942 >= 0) {
                        sArr2 = sArr6;
                        i30 = i47;
                        i31 = i48;
                        iM559711 = (C0946.m55979("ᩳܿ") ^ i25) * 65;
                        i15 = ((iM559711 ^ i26) * (-2083)) ^ 373144618;
                        i16 = -1594274432;
                        i20 = iM559711 ^ i16;
                        listView2 = listView;
                        c21864 = c21863;
                        sArr3 = sArr2;
                        i28 = i20;
                        i32 = i32;
                        view3 = view3;
                        i27 = i15;
                        obj2 = obj2;
                    } else {
                        int iM556812 = C0873.m55680("ۖܰ") ^ i25;
                        c21864 = c21863;
                        obj2 = obj2;
                        i28 = iM556812 ^ (-1579168701);
                        view3 = view3;
                        i27 = ((iM556812 ^ i26) * (-7675)) ^ 114676645;
                        i32 = i32;
                        listView2 = listView;
                        sArr3 = sArr6;
                        i30 = i47;
                        i31 = i48;
                    }
                    break;
                case -171887130:
                case 1845671263:
                    c9507.f26014 = z;
                    iM55683 = C0946.m55979("ۗ֫") ^ i25;
                    i18 = ((iM55683 ^ i26) * 3183) ^ (-1600317992);
                    i21 = 1701167701;
                    i28 = iM55683 ^ i21;
                    i27 = i18;
                    break;
                case -125582482:
                case 35890938:
                    i4 = i30;
                    i29 = 40013;
                    iM55979 = C0946.m55979("᩸ܽ") ^ i25;
                    i5 = ((iM55979 ^ i26) * (-13899)) ^ (-1652059843);
                    i6 = -1138394260;
                    i9 = iM55979 ^ i6;
                    iM559714 = iM559714;
                    i27 = i5;
                    c21864 = c21864;
                    i32 = i32;
                    obj2 = obj2;
                    view3 = view3;
                    i28 = i9;
                    abstractActivityC55410 = abstractActivityC5549;
                    int i3110 = i31;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i30 = i4;
                    i31 = i3110;
                    break;
                case 219610127:
                case 1665140733:
                    C1194.m56396();
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        obj = obj2;
                        c21862 = c21864;
                        i12 = iM559714;
                        viewM56111 = view3;
                        i11 = i32;
                        int i49 = i30;
                        sArr3 = sArr3;
                        listView2 = listView2;
                        i31 = i31;
                        i4 = i49;
                        iM55681 = C0873.m55680("ܽᩴ") ^ i26;
                        i13 = ((iM55681 ^ i25) * 18671) ^ (-880535148);
                        i14 = -698147974;
                        int i50 = iM55681 ^ i14;
                        iM559714 = i12;
                        i27 = i13;
                        c21864 = c21862;
                        i32 = i11;
                        obj2 = obj;
                        i28 = i50;
                        view3 = viewM56111;
                        abstractActivityC55410 = abstractActivityC5549;
                        int i3111 = i31;
                        listView2 = listView2;
                        sArr3 = sArr3;
                        i30 = i4;
                        i31 = i3111;
                    }
                    obj2 = obj2;
                    c21864 = c21864;
                    iM559714 = iM559714;
                    view3 = view3;
                    i32 = i32;
                    int i51 = i30;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i31 = i31;
                    i4 = i51;
                    iM55979 = (i25 - C0946.m55979("ۘ᩹")) * (-105);
                    i5 = ((iM55979 ^ i26) * 25261) ^ (-132709131);
                    i6 = 1350898536;
                    i9 = iM55979 ^ i6;
                    iM559714 = iM559714;
                    i27 = i5;
                    c21864 = c21864;
                    i32 = i32;
                    obj2 = obj2;
                    view3 = view3;
                    i28 = i9;
                    abstractActivityC55410 = abstractActivityC5549;
                    int i3112 = i31;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i30 = i4;
                    i31 = i3112;
                    break;
                case 617961787:
                case 1008375200:
                    i11 = i32;
                    obj = obj2;
                    c21862 = c21864;
                    i12 = iM559714;
                    int i52 = i30;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i31 = i31;
                    i4 = i52;
                    viewM56111 = C0992.m56111(abstractActivityC55410, i12);
                    iM55685 = C0873.m55680(C1124.m56373(f81874, 26, 3, i29));
                    if (RunnableC0871.f81839 >= 0) {
                        iM55681 = C0873.m55680("ܽᩴ") ^ i26;
                        i13 = ((iM55681 ^ i25) * 18671) ^ (-880535148);
                        i14 = -698147974;
                    } else {
                        iM55681 = C0873.m55680("ۛ᩹") ^ i25;
                        i13 = ((iM55681 ^ i26) * (-23467)) ^ 68320780;
                        i14 = 1454715337;
                    }
                    int i53 = iM55681 ^ i14;
                    iM559714 = i12;
                    i27 = i13;
                    c21864 = c21862;
                    i32 = i11;
                    obj2 = obj;
                    i28 = i53;
                    view3 = viewM56111;
                    abstractActivityC55410 = abstractActivityC5549;
                    int i3113 = i31;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i30 = i4;
                    i31 = i3113;
                    break;
                case 1044289066:
                case 1666636244:
                    c21864 = c21864;
                    i2 = i31;
                    view = view3;
                    i32 = i32;
                    i3 = i30;
                    sArr = sArr3;
                    listView2 = (ListView) C0892.m55755(view, iM55685 ^ 2120202044);
                    C7040.m16181(listView2);
                    obj2 = null;
                    listView2.setDivider(null);
                    if (C0892.f81851) {
                        view2 = view;
                        int iM556813 = (i26 - C0873.m55680("ᩴ᩻")) * 49;
                        sArr3 = sArr;
                        i30 = i3;
                        i31 = i2;
                        c21864 = c21864;
                        i28 = iM556813 ^ 1356789952;
                        listView2 = listView2;
                        i27 = ((iM556813 ^ i25) * 17901) ^ (-2014480527);
                    } else {
                        int iM556814 = C0873.m55680("ۗܰ") ^ i25;
                        view2 = view;
                        i27 = ((iM556814 ^ i26) * 30589) ^ (-300620293);
                        sArr3 = sArr;
                        i30 = i3;
                        i31 = i2;
                        c21864 = c21864;
                        listView2 = listView2;
                        i28 = iM556814 ^ 1841703874;
                    }
                    i32 = i32;
                    view3 = view2;
                    break;
                case 1901235126:
                case 2125652320:
                    C0967.m56080(c20671, iM559713 ^ 2100523247, obj2);
                    C1048.m56304(C1071.m56337(C1025.m56221(c20671)), new View.OnClickListener() { // from class: l.ܰܰܽ
                        {
                            int i54 = -1281222828;
                            int i55 = RunnableC1014.f81941;
                            int i56 = C1003.f81929;
                            int iM556815 = (C0873.m55680("ۛۨ") + i55) * 75;
                            int i57 = ((iM556815 ^ i56) * 14015) ^ 1472627272;
                            int i58 = -2062866009;
                            while (true) {
                                i54 = ((((i54 ^ i56) * (-2271)) >> 31) & i57) ^ (iM556815 ^ i58);
                                switch (i54) {
                                    case -2058335094:
                                    case -1764931635:
                                        if (C1024.f81946) {
                                            iM556815 = C0946.m55979("ܿ۫") ^ i55;
                                            i57 = ((iM556815 ^ i56) * (-2907)) ^ 435528286;
                                            i58 = -1629204924;
                                        } else {
                                            iM556815 = (i55 - C0873.m55680("ۘۧ")) * (-121);
                                            i57 = ((iM556815 ^ i56) * (-9893)) ^ 1648896353;
                                            i58 = -1847281185;
                                        }
                                        break;
                                    case -1644516144:
                                    case -826564457:
                                        if (C1003.f81929 <= 0) {
                                            iM556815 = (C0946.m55979("᩺֨") + i56) * (-71);
                                            i57 = ((iM556815 ^ i55) * (-29541)) ^ 1742207876;
                                            i58 = 247489609;
                                        } else {
                                            iM556815 = C0873.m55680("ᩴۙ") ^ i56;
                                            i57 = ((iM556815 ^ i55) * 23595) ^ (-1299258793);
                                            i58 = -671014957;
                                        }
                                        break;
                                    case -1576199953:
                                    case -1277952678:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM556815 = (C0946.m55979("᩺֨") + i56) * (-71);
                                            i57 = ((iM556815 ^ i55) * (-29541)) ^ 1742207876;
                                            i58 = 247489609;
                                        } else {
                                            iM556815 = C0873.m55680("ۤۗ") ^ i55;
                                            i57 = ((iM556815 ^ i56) * 11699) ^ 1267574659;
                                            i58 = 192053237;
                                        }
                                        break;
                                    case -1440458608:
                                    case 1395267310:
                                        C0854.m55595();
                                        if (C1929.f83011 == 0) {
                                            iM556815 = C0946.m55979("ܿ۫") ^ i55;
                                            i57 = ((iM556815 ^ i56) * (-2907)) ^ 435528286;
                                            i58 = -1629204924;
                                        } else {
                                            iM556815 = (C0946.m55979("᩺֨") + i56) * (-71);
                                            i57 = ((iM556815 ^ i55) * (-29541)) ^ 1742207876;
                                            i58 = 247489609;
                                        }
                                        break;
                                    case -1269151743:
                                    case 2006159004:
                                        C1053.m56327();
                                        if (C0845.f81821 < 0) {
                                            iM556815 = (i56 - C0873.m55680("᩻ۗ")) * (-55);
                                            i57 = ((iM556815 ^ i55) * (-20943)) ^ (-190841314);
                                            i58 = 2066100631;
                                        } else {
                                            iM556815 = (C0873.m55680("۫ۖ") ^ i55) * 17;
                                            i57 = ((iM556815 ^ i56) * 16179) ^ (-322515372);
                                            i58 = -744420952;
                                        }
                                        break;
                                    case -802330373:
                                    case 889299769:
                                        if (ServiceConnectionC1013.m56157() <= 0) {
                                            iM556815 = (C0873.m55680("۫ۖ") ^ i55) * 17;
                                            i57 = ((iM556815 ^ i56) * 16179) ^ (-322515372);
                                            i58 = -744420952;
                                        } else {
                                            iM556815 = C0873.m55680("ۡۨ") ^ i56;
                                            i57 = ((iM556815 ^ i55) * 27499) ^ (-157062864);
                                            i58 = 933721727;
                                        }
                                        break;
                                    case -780753451:
                                    case 958000776:
                                        return;
                                    case -474356069:
                                    case 734305876:
                                        C1964.m56597();
                                        if (C0845.f81821 < 0) {
                                            iM556815 = (C0873.m55680("۫ۖ") ^ i55) * 17;
                                            i57 = ((iM556815 ^ i56) * 16179) ^ (-322515372);
                                            i58 = -744420952;
                                        } else {
                                            iM556815 = (C0946.m55979("᩺֨") + i56) * (-71);
                                            i57 = ((iM556815 ^ i55) * (-29541)) ^ 1742207876;
                                            i58 = 247489609;
                                        }
                                        break;
                                    case -92570274:
                                    case 281638249:
                                        if (C0873.f81841 <= 0) {
                                            iM556815 = (C0873.m55680("۫ۖ") ^ i55) * 17;
                                            i57 = ((iM556815 ^ i56) * 16179) ^ (-322515372);
                                            i58 = -744420952;
                                        } else {
                                            iM556815 = C0873.m55680("ۛۘ") ^ i55;
                                            i57 = ((iM556815 ^ i56) * 32475) ^ 1584261565;
                                            i58 = -767956054;
                                        }
                                        break;
                                    case -15834011:
                                    case 1112996662:
                                        C0992.m56107();
                                        iM556815 = (C0946.m55979("᩺֨") + i56) * (-71);
                                        i57 = ((iM556815 ^ i55) * (-29541)) ^ 1742207876;
                                        i58 = 247489609;
                                        break;
                                    case 48513514:
                                    case 1788374571:
                                        if (C0937.f81884) {
                                            iM556815 = C0873.m55680("᩵۠") ^ i56;
                                            i57 = ((iM556815 ^ i55) * (-17811)) ^ (-593407253);
                                            i58 = -217266506;
                                        } else {
                                            iM556815 = (C0946.m55979("᩺ۧ") + i55) * 29;
                                            i57 = ((iM556815 ^ i56) * 8501) ^ (-1401722561);
                                            i58 = -1548925133;
                                        }
                                        break;
                                    case 366932528:
                                    case 755813494:
                                        if (C0854.f81826 != 0) {
                                            iM556815 = (i56 - C0873.m55680("᩻ۗ")) * (-55);
                                            i57 = ((iM556815 ^ i55) * (-20943)) ^ (-190841314);
                                            i58 = 2066100631;
                                        } else {
                                            iM556815 = (C0873.m55680("۟۬") ^ i55) * (-69);
                                            i57 = ((iM556815 ^ i56) * 5813) ^ (-1560341105);
                                            i58 = 220546829;
                                        }
                                        break;
                                    case 478478272:
                                    case 1142765663:
                                        if (RunnableC1014.m56177()) {
                                            iM556815 = (C0873.m55680("ۗ᩶") ^ i56) * 37;
                                            i57 = ((iM556815 ^ i55) * (-22175)) ^ (-1971378567);
                                            i58 = 892137924;
                                        } else {
                                            iM556815 = (C0946.m55979("᩺֨") + i56) * (-71);
                                            i57 = ((iM556815 ^ i55) * (-29541)) ^ 1742207876;
                                            i58 = 247489609;
                                        }
                                        break;
                                    case 1116479458:
                                    case 1268151605:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM556815 = (C0946.m55979("᩺֨") + i56) * (-71);
                                            i57 = ((iM556815 ^ i55) * (-29541)) ^ 1742207876;
                                            i58 = 247489609;
                                        } else {
                                            iM556815 = (i55 - C0873.m55680("֡ܽ")) * (-107);
                                            i57 = ((iM556815 ^ i56) * (-28589)) ^ (-1067059448);
                                            i58 = 1463469594;
                                        }
                                        break;
                                    case 1167256258:
                                    case 1639129839:
                                        RunnableC1014.m56177();
                                        throw new RuntimeException();
                                    default:
                                        if (C0877.f81843 >= 0) {
                                            iM556815 = (C0873.m55680("۫ۖ") ^ i55) * 17;
                                            i57 = ((iM556815 ^ i56) * 16179) ^ (-322515372);
                                            i58 = -744420952;
                                        } else {
                                            iM556815 = (C0873.m55680("ۘ֫") + i56) * 17;
                                            i57 = ((iM556815 ^ i55) * (-21023)) ^ 1461995857;
                                            i58 = 143739401;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            Iterator itM56090 = null;
                            C9507 c9508 = null;
                            boolean z2 = false;
                            int i54 = -298701698;
                            int i55 = AbstractC0942.f81890;
                            int i56 = C0898.f81858;
                            int iM556815 = (C0873.m55680("ۤܺ") + i56) * (-91);
                            int i57 = ((iM556815 ^ i55) * 2261) ^ (-1715609681);
                            int i58 = 1919227942;
                            while (true) {
                                i54 = ((((i54 ^ i55) * (-19663)) >> 31) & i57) ^ (iM556815 ^ i58);
                                switch (i54) {
                                    case -2064354934:
                                    case -440980072:
                                        c9508 = (C9507) RunnableC0897.m55785(itM56090);
                                        if (C1048.m56305() >= 0) {
                                            iM556815 = C0946.m55979("ܿ᩹") ^ i56;
                                            i57 = ((iM556815 ^ i55) * 4663) ^ (-1757749716);
                                            i58 = -1101661948;
                                        } else {
                                            iM556815 = C0946.m55979("ۧ᩹") ^ i56;
                                            i57 = ((iM556815 ^ i55) * (-28843)) ^ (-956799411);
                                            i58 = -1235038452;
                                        }
                                        break;
                                    case -2050211801:
                                    case 104305384:
                                        C0894.m55769();
                                        iM556815 = (i55 - C0873.m55680("ۧۖ")) * 81;
                                        i57 = ((iM556815 ^ i56) * (-18101)) ^ 300057764;
                                        i58 = -2074740415;
                                        break;
                                    case -2016333651:
                                    case -313633860:
                                        itM56090 = C0989.m56090(arrayList);
                                        iM556815 = (i55 - C0873.m55680("᩵ۖ")) * (-57);
                                        i57 = ((iM556815 ^ i56) * 28723) ^ (-442711028);
                                        i58 = 1828401247;
                                        break;
                                    case -1968725008:
                                    case 1296846566:
                                        if (C0906.f81862 >= 0) {
                                            iM556815 = (i55 - C0873.m55680("ۧۖ")) * 81;
                                            i57 = ((iM556815 ^ i56) * (-18101)) ^ 300057764;
                                            i58 = -2074740415;
                                        } else {
                                            iM556815 = (C0873.m55680("۬ۛ") ^ i56) * (-107);
                                            i57 = ((iM556815 ^ i55) * (-6889)) ^ (-1705809485);
                                            i58 = 1214217059;
                                        }
                                        break;
                                    case -1873007723:
                                    case -1058743643:
                                        if (C0992.m56107() <= 0) {
                                            iM556815 = C0873.m55680("۠᩺") ^ i55;
                                            i57 = ((iM556815 ^ i56) * (-7371)) ^ (-168430472);
                                            i58 = 1348256607;
                                        } else {
                                            iM556815 = (C0873.m55680("ۖ᩹") + i55) * 21;
                                            i57 = ((iM556815 ^ i56) * 28783) ^ (-1064247953);
                                            i58 = 2102557588;
                                        }
                                        break;
                                    case -1577213027:
                                    case -1227815466:
                                        if (!C1025.m56230()) {
                                            iM556815 = C0873.m55680("۠᩺") ^ i55;
                                            i57 = ((iM556815 ^ i56) * (-7371)) ^ (-168430472);
                                            i58 = 1348256607;
                                        } else {
                                            iM556815 = (i56 - C0873.m55680("۫ۗ")) * (-61);
                                            i57 = ((iM556815 ^ i55) * (-11271)) ^ 969518832;
                                            i58 = -24546660;
                                        }
                                        break;
                                    case -1571272224:
                                    case 1820815943:
                                        c23804.notifyDataSetChanged();
                                        break;
                                    case -1180004180:
                                    case 1664329364:
                                        c9508.f26014 = !z2;
                                        iM556815 = (i55 - C0873.m55680("᩵ۖ")) * (-57);
                                        i57 = ((iM556815 ^ i56) * 28723) ^ (-442711028);
                                        i58 = 1828401247;
                                        break;
                                    case -1170039018:
                                    case -1092208458:
                                        z2 = c9508.f26014;
                                        if (C0955.f81898) {
                                            iM556815 = (C0946.m55979("۫ۨ") ^ i55) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i57 = ((iM556815 ^ i56) * 4727) ^ (-769363476);
                                            i58 = 982739030;
                                        } else {
                                            iM556815 = C0946.m55979("᩷֨") ^ i56;
                                            i57 = ((iM556815 ^ i55) * (-8711)) ^ (-2121720398);
                                            i58 = 1806998349;
                                        }
                                        break;
                                    case -1023995947:
                                    case 1660593913:
                                        if (C1071.f81975 <= 0) {
                                            iM556815 = (C0946.m55979("۫ۨ") ^ i55) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i57 = ((iM556815 ^ i56) * 4727) ^ (-769363476);
                                            i58 = 982739030;
                                        } else {
                                            iM556815 = (C0873.m55680("ۚۖ") + i56) * (-11);
                                            i57 = ((iM556815 ^ i55) * (-18693)) ^ 998554816;
                                            i58 = 1524918089;
                                        }
                                        break;
                                    case -930985083:
                                    case -270240843:
                                        C0967.m56074();
                                        C0877.m55696();
                                        break;
                                    case -860527569:
                                    case -666558639:
                                        if (C0866.m55647(itM56090)) {
                                            iM556815 = C0946.m55979("ۗ᩵") ^ i55;
                                            i57 = ((iM556815 ^ i56) * 21343) ^ (-1625800519);
                                            i58 = -1289925531;
                                        } else {
                                            iM556815 = (C0946.m55979("֨ܳ") + i56) * (-75);
                                            i57 = ((iM556815 ^ i55) * (-31093)) ^ (-1047069117);
                                            i58 = 591688783;
                                        }
                                        break;
                                    case -824473989:
                                    case 116826950:
                                        if (C0930.f81879 <= 0) {
                                            iM556815 = (i56 - C0873.m55680("۫ۗ")) * (-61);
                                            i57 = ((iM556815 ^ i55) * (-11271)) ^ 969518832;
                                            i58 = -24546660;
                                        } else {
                                            iM556815 = (i55 - C0873.m55680("ۧۖ")) * 81;
                                            i57 = ((iM556815 ^ i56) * (-18101)) ^ 300057764;
                                            i58 = -2074740415;
                                        }
                                        break;
                                    case -530915153:
                                    case 1631791178:
                                        if (C0892.f81851) {
                                            iM556815 = C0946.m55979("֡᩵") ^ i55;
                                            i57 = ((iM556815 ^ i56) * 16301) ^ (-136305268);
                                            i58 = -1187537105;
                                        } else {
                                            iM556815 = C0873.m55680("۠᩺") ^ i55;
                                            i57 = ((iM556815 ^ i56) * (-7371)) ^ (-168430472);
                                            i58 = 1348256607;
                                        }
                                        break;
                                    case -434086128:
                                    case -122791523:
                                        if (C1046.f81962 <= 0) {
                                            iM556815 = C0873.m55680("۠᩺") ^ i55;
                                            i57 = ((iM556815 ^ i56) * (-7371)) ^ (-168430472);
                                            i58 = 1348256607;
                                        } else {
                                            iM556815 = (i56 - C0946.m55979("۬ۚ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i57 = ((iM556815 ^ i55) * (-807)) ^ 71387465;
                                            i58 = 588677511;
                                        }
                                        break;
                                    case -274868136:
                                    case 525156295:
                                        if (C0892.f81851) {
                                            iM556815 = C0873.m55680("۬᩸") ^ i56;
                                            i57 = ((iM556815 ^ i55) * (-26127)) ^ (-1670645306);
                                            i58 = -439704200;
                                        } else {
                                            iM556815 = C0946.m55979("ܿ᩹") ^ i56;
                                            i57 = ((iM556815 ^ i55) * 4663) ^ (-1757749716);
                                            i58 = -1101661948;
                                        }
                                        break;
                                    case -155665869:
                                    case 942139216:
                                        if (RunnableC0871.m55672() >= 0) {
                                            iM556815 = (C0946.m55979("۫ۨ") ^ i55) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i57 = ((iM556815 ^ i56) * 4727) ^ (-769363476);
                                            i58 = 982739030;
                                        } else {
                                            iM556815 = C0946.m55979("ܳ᩷") ^ i55;
                                            i57 = ((iM556815 ^ i56) * (-24331)) ^ (-145243198);
                                            i58 = 1613473922;
                                        }
                                        break;
                                    case 914480805:
                                    case 1987015900:
                                        if (C0930.f81879 <= 0) {
                                            iM556815 = (C0946.m55979("۫ۨ") ^ i55) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i57 = ((iM556815 ^ i56) * 4727) ^ (-769363476);
                                            i58 = 982739030;
                                        } else {
                                            iM556815 = (C0946.m55979("ۚᩴ") ^ i55) * (-27);
                                            i57 = ((iM556815 ^ i56) * (-18603)) ^ 1594155541;
                                            i58 = 519091272;
                                        }
                                        break;
                                    default:
                                        C1017.m56187();
                                        if (C1053.m56327() < 0) {
                                            iM556815 = C0946.m55979("ܿ᩹") ^ i56;
                                            i57 = ((iM556815 ^ i55) * 4663) ^ (-1757749716);
                                            i58 = -1101661948;
                                        } else {
                                            iM556815 = (i56 - C0873.m55680("۫ۗ")) * (-61);
                                            i57 = ((iM556815 ^ i55) * (-11271)) ^ 969518832;
                                            i58 = -24546660;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                default:
                    i4 = i30;
                    i29 = 15221;
                    iM55979 = C0946.m55979("᩸ܽ") ^ i25;
                    i5 = ((iM55979 ^ i26) * (-13899)) ^ (-1652059843);
                    i6 = -1138394260;
                    i9 = iM55979 ^ i6;
                    iM559714 = iM559714;
                    i27 = i5;
                    c21864 = c21864;
                    i32 = i32;
                    obj2 = obj2;
                    view3 = view3;
                    i28 = i9;
                    abstractActivityC55410 = abstractActivityC5549;
                    int i3114 = i31;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i30 = i4;
                    i31 = i3114;
                    break;
            }
            return;
        }
    }
}
