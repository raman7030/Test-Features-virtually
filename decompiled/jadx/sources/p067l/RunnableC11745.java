package p067l;

import android.content.Intent;
import android.net.Uri;
import bin.p000mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11745 implements Runnable {

    /* JADX INFO: renamed from: ۬ۚ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82114 = {6778, 16575, 16560, 16570, 16556, 16561, 16567, 16570, 16624, 16567, 16560, 16554, 16571, 16560, 16554, 16624, 16575, 16573, 16554, 16567, 16561, 16560, 16624, 16520, 16535, 16539, 16521};

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Serializable f32796;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32797;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f32798;

    public /* synthetic */ RunnableC11745(Object obj, Serializable serializable, int i) {
        int i2 = -162914146;
        int i3 = C1044.f81959;
        int i4 = ServiceConnectionC1013.f81940;
        this.f32797 = i;
        this.f32798 = obj;
        this.f32796 = serializable;
        int iM55680 = C0873.m55680("ۖ᩷") ^ i3;
        int i5 = ((iM55680 ^ i4) * 4035) ^ (-544824741);
        int i6 = 1341533871;
        while (true) {
            i2 = (iM55680 ^ i6) ^ (i5 & (((i2 ^ i4) * 23795) >> 31));
            switch (i2) {
                case -1805856749:
                case 2051057533:
                    C1024.m56209();
                    throw new RuntimeException();
                case -1575555317:
                case -1379789123:
                    C1124.m56367();
                    C0898.m55800();
                    iM55680 = C0873.m55680("ܺ᩶") ^ i3;
                    i5 = ((iM55680 ^ i4) * (-29663)) ^ 304848442;
                    i6 = 470236087;
                    break;
                case -1427806294:
                case -1092834544:
                    C0946.m55980();
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("֫ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-22717)) ^ (-1314850253);
                        i6 = 1494316760;
                    } else {
                        iM55680 = (C0873.m55680("֨᩺") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55680 ^ i3) * 22601) ^ 1261658516;
                        i6 = -653856312;
                    }
                    break;
                case -1151283023:
                case -676082251:
                    return;
                case -944910058:
                case -611938986:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0946.m55979("۟۟") ^ i3;
                        i5 = ((iM55680 ^ i4) * 19849) ^ (-1156626126);
                        i6 = 582921618;
                    } else {
                        iM55680 = C0873.m55680("ܳۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 10035) ^ 779745508;
                        i6 = 994369229;
                    }
                    break;
                case -661350406:
                case 403462100:
                    if (C1028.m56247() < 0) {
                        iM55680 = C0873.m55680("֫ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-22717)) ^ (-1314850253);
                        i6 = 1494316760;
                    } else {
                        iM55680 = C0873.m55680("᩺᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-28573)) ^ 460157613;
                        i6 = 709800338;
                    }
                    break;
                default:
                    C0892.m55749();
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("᩺᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-28573)) ^ 460157613;
                        i6 = 709800338;
                    } else {
                        iM55680 = C0873.m55680("ܺ᩶") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-29663)) ^ 304848442;
                        i6 = 470236087;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0410 A[PHI: r11 r12 r20 r22 r23
      0x0410: PHI (r11v4 short) = (r11v3 short), (r11v2 short) binds: [B:107:0x040e, B:103:0x03ea] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:107:0x040e, B:103:0x03ea] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r20v10 l.ۤ᩻᩷) = (r20v9 l.ۤ᩻᩷), (r20v11 l.ۤ᩻᩷) binds: [B:107:0x040e, B:103:0x03ea] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r22v2 java.lang.String) = (r22v1 java.lang.String), (r22v3 java.lang.String) binds: [B:107:0x040e, B:103:0x03ea] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r23v2 java.lang.Throwable) = (r23v1 java.lang.Throwable), (r23v3 java.lang.Throwable) binds: [B:107:0x040e, B:103:0x03ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x043d A[PHI: r2 r15 r20 r21 r22 r23
      0x043d: PHI (r2v5 bin.mt.plus.Main) = (r2v2 bin.mt.plus.Main), (r2v4 bin.mt.plus.Main), (r2v2 bin.mt.plus.Main), (r2v2 bin.mt.plus.Main) binds: [B:95:0x038d, B:79:0x02b4, B:10:0x0061, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x043d: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:95:0x038d, B:79:0x02b4, B:10:0x0061, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x043d: PHI (r20v36 l.ۤ᩻᩷) = (r20v13 l.ۤ᩻᩷), (r20v19 l.ۤ᩻᩷), (r20v34 l.ۤ᩻᩷), (r20v37 l.ۤ᩻᩷) binds: [B:95:0x038d, B:79:0x02b4, B:10:0x0061, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x043d: PHI (r21v4 char) = (r21v3 char), (r21v3 char), (r21v3 char), (r21v5 char) binds: [B:95:0x038d, B:79:0x02b4, B:10:0x0061, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x043d: PHI (r22v28 java.lang.String) = (r22v5 java.lang.String), (r22v11 java.lang.String), (r22v26 java.lang.String), (r22v29 java.lang.String) binds: [B:95:0x038d, B:79:0x02b4, B:10:0x0061, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x043d: PHI (r23v28 java.lang.Throwable) = (r23v5 java.lang.Throwable), (r23v11 java.lang.Throwable), (r23v26 java.lang.Throwable), (r23v29 java.lang.Throwable) binds: [B:95:0x038d, B:79:0x02b4, B:10:0x0061, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0477 A[PHI: r3 r16 r20 r22 r23
      0x0477: PHI (r3v4 java.io.Serializable) = (r3v2 java.io.Serializable), (r3v3 java.io.Serializable), (r3v2 java.io.Serializable) binds: [B:113:0x0475, B:75:0x028c, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0477: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:113:0x0475, B:75:0x028c, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0477: PHI (r20v31 l.ۤ᩻᩷) = (r20v8 l.ۤ᩻᩷), (r20v20 l.ۤ᩻᩷), (r20v32 l.ۤ᩻᩷) binds: [B:113:0x0475, B:75:0x028c, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0477: PHI (r22v23 java.lang.String) = (r22v0 java.lang.String), (r22v12 java.lang.String), (r22v24 java.lang.String) binds: [B:113:0x0475, B:75:0x028c, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0477: PHI (r23v23 java.lang.Throwable) = (r23v0 java.lang.Throwable), (r23v12 java.lang.Throwable), (r23v24 java.lang.Throwable) binds: [B:113:0x0475, B:75:0x028c, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        if (p067l.ServiceConnectionC1013.f81940 >= 0) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5;
        int i6 = C1003.f81929;
        int i7 = C0877.f81843;
        int iM55979 = C0946.m55979("ۧ᩵") ^ i6;
        int i8 = ((iM55979 ^ i7) * 24399) ^ (-2135969515);
        short[] sArr = null;
        int i9 = iM55979 ^ (-2114868493);
        int i10 = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 246159405;
        char c = 0;
        Throwable th = null;
        String str = null;
        C12474 c12474 = null;
        Serializable serializable = null;
        C6061 c6061 = null;
        Serializable serializable2 = null;
        Main main = null;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i7) * 4211) >> 31));
            switch (i15) {
                case -2143388021:
                case 1535864655:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    c6061 = (C6061) this.f32798;
                    if (C1003.m56123() != 0) {
                        iM55681 = C0873.m55680("ۧ᩻") ^ i6;
                        i3 = ((iM55681 ^ i7) * (-993)) ^ 1390378630;
                        i4 = -1661240723;
                    } else {
                        iM55681 = C0946.m55979("ܿᩳ") ^ i7;
                        i3 = ((iM55681 ^ i6) * (-6293)) ^ 18559364;
                        i4 = 281553998;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c12475 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c12475;
                    break;
                case -1950583274:
                case 1944665694:
                    C0992.m56107();
                    if (!C0882.f81846) {
                        iM55680 = (C0946.m55979("᩺ܶ") + i6) * (-93);
                        i = ((iM55680 ^ i7) * 30681) ^ (-1091735219);
                        i2 = -1795605323;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    } else {
                        c12474 = c12474;
                        str = str;
                        th = th;
                        iM55681 = (C0946.m55979("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM55681 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                        i5 = iM55681 ^ i4;
                        str = str;
                        th = th;
                        C12474 c12476 = c12474;
                        i9 = i5;
                        i8 = i3;
                        c12474 = c12476;
                    }
                    break;
                case -1840660909:
                case -584146167:
                    c12474 = (C12474) this.f32798;
                    str = (String) this.f32796;
                    int iM55682 = C0873.m55680("۟ܰ") ^ i7;
                    i9 = iM55682 ^ 616557514;
                    i8 = ((iM55682 ^ i6) * 13463) ^ (-857725886);
                    th = th;
                    break;
                case -1789337903:
                case -348806224:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    serializable2 = this.f32796;
                    if (C1053.f81965 <= 0) {
                        iM55681 = C0873.m55680("ۖۤ") ^ i7;
                        i3 = ((iM55681 ^ i6) * (-13963)) ^ 993651778;
                        i4 = -1629138111;
                    } else {
                        iM55681 = (C0946.m55979("֨ۖ") ^ i7) * (-3);
                        i3 = ((iM55681 ^ i6) * 16077) ^ (-1070842534);
                        i4 = 54443342;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c12477 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c12477;
                    break;
                case -1635267257:
                case 1029307976:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    serializable = this.f32796;
                    if (C0989.f81920 >= 0) {
                        iM55681 = (C0946.m55979("ۜܺ") + i6) * (-121);
                        i3 = ((iM55681 ^ i7) * (-24007)) ^ (-1969407563);
                        i4 = 1575841718;
                    } else {
                        iM55681 = C0946.m55979("ܰܰ") ^ i7;
                        i3 = ((iM55681 ^ i6) * 21709) ^ 369809291;
                        i4 = 636011509;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c12478 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c12478;
                    break;
                case -1558753680:
                case 1445873193:
                    C1929.m56559(main, (String) serializable2);
                    break;
                case -1551367435:
                case 1407142069:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    sArr = f82114;
                    if (C0947.m55997()) {
                        iM55681 = C0873.m55680("ۖۤ") ^ i7;
                        i3 = ((iM55681 ^ i6) * (-13963)) ^ 993651778;
                        i4 = -1629138111;
                    } else {
                        iM55681 = C0873.m55680("۠᩷") ^ i6;
                        i3 = ((iM55681 ^ i7) * 28881) ^ (-419270307);
                        i4 = -859714527;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c12479 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c12479;
                    break;
                case -1427100186:
                case -900914248:
                    try {
                        c12474 = c12474;
                        try {
                            str = str;
                            try {
                                Intent intent = new Intent(C1017.m56189(f82114, 1, 26, i10), Uri.parse(C12474.m28713(str)));
                                C0882.m55721(intent, 268435456);
                                C1964.m56599(C0861.m55620(), intent);
                                iM55681 = C0873.m55680("ۢܳ") ^ i6;
                                i3 = ((iM55681 ^ i7) * 12133) ^ 1409179256;
                                i4 = -969042491;
                                i5 = iM55681 ^ i4;
                                str = str;
                                th = th;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                int iM559710 = C0946.m55979("ܽۨ") ^ i6;
                                i3 = ((iM559710 ^ i7) * 26389) ^ (-602885324);
                                i5 = iM559710 ^ (-743907383);
                                str = str;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str = str;
                            th = th;
                            int iM559711 = C0946.m55979("ܽۨ") ^ i6;
                            i3 = ((iM559711 ^ i7) * 26389) ^ (-602885324);
                            i5 = iM559711 ^ (-743907383);
                            str = str;
                            C12474 c124710 = c12474;
                            i9 = i5;
                            i8 = i3;
                            c12474 = c124710;
                            break;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c12474 = c12474;
                    }
                    C12474 c124711 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c124711;
                    break;
                case -1415102488:
                case 1746271698:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    if (((AtomicInteger) serializable).decrementAndGet() == 0) {
                        iM55681 = C0946.m55979("֨ܺ") ^ i7;
                        i3 = ((iM55681 ^ i6) * 393) ^ (-1341184039);
                        i4 = 1089958904;
                    } else {
                        iM55681 = C0873.m55680("ۛ᩺") ^ i6;
                        i3 = ((iM55681 ^ i7) * (-13419)) ^ 1842649586;
                        i4 = 377830903;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c124712 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c124712;
                    break;
                case -1334134905:
                case 1565536244:
                    i10 = 16606;
                    iM55681 = (C0946.m55979("ۙۜ") ^ i6) * (-79);
                    i3 = ((iM55681 ^ i7) * 10925) ^ 1163737391;
                    i4 = 975132820;
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c124713 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c124713;
                    break;
                case -1330427238:
                case -1278415620:
                    i10 = 40979;
                    iM55681 = (C0946.m55979("ۙۜ") ^ i6) * (-79);
                    i3 = ((iM55681 ^ i7) * 10925) ^ 1163737391;
                    i4 = 975132820;
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c124714 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c124714;
                    break;
                case -1300015403:
                case 1031777695:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    i14 = 127712601;
                    if (C0877.f81843 >= 0) {
                        iM55681 = (C0873.m55680("֫᩹") + i7) * 33;
                        i3 = ((iM55681 ^ i6) * (-26009)) ^ 262776637;
                        i4 = 732255221;
                    } else {
                        iM55681 = C0873.m55680("֫᩺") ^ i6;
                        i3 = ((iM55681 ^ i7) * (-19853)) ^ 955176797;
                        i4 = -113699726;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c124715 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c124715;
                    break;
                case -1288582976:
                case 888965984:
                    break;
                case -1098722703:
                case 327821032:
                    if (!RunnableC1014.m56177()) {
                        iM55680 = (C0946.m55979("ᩳ᩺") ^ i7) * 21;
                        i = ((iM55680 ^ i6) * (-18219)) ^ 212161999;
                        i2 = -40480986;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    } else {
                        c12474 = c12474;
                        str = str;
                        th = th;
                        iM55681 = C0873.m55680("ۖۤ") ^ i7;
                        i3 = ((iM55681 ^ i6) * (-13963)) ^ 993651778;
                        i4 = -1629138111;
                        i5 = iM55681 ^ i4;
                        str = str;
                        th = th;
                        C12474 c124716 = c12474;
                        i9 = i5;
                        i8 = i3;
                        c12474 = c124716;
                    }
                    break;
                case -962813997:
                case 2032213492:
                    C0845.m55584();
                    if (C0967.f81910 < 0) {
                        c12474 = c12474;
                        str = str;
                        th = th;
                        iM55681 = (C0946.m55979("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM55681 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                        i5 = iM55681 ^ i4;
                        str = str;
                        th = th;
                        C12474 c124717 = c12474;
                        i9 = i5;
                        i8 = i3;
                        c12474 = c124717;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩺") ^ i7) * 21;
                        i = ((iM55680 ^ i6) * (-18219)) ^ 212161999;
                        i2 = -40480986;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    }
                    break;
                case -920425861:
                case 1516529582:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    s = sArr[c];
                    if (C1025.f81947 >= 0) {
                        iM55681 = (i7 - C0873.m55680("ۤۛ")) * (-99);
                        i3 = ((iM55681 ^ i6) * (-27939)) ^ (-519334975);
                        i4 = 400842598;
                    } else {
                        iM55681 = (C0873.m55680("ܺ᩵") ^ i7) * (-29);
                        i3 = ((iM55681 ^ i6) * (-22651)) ^ (-1106266542);
                        i4 = -425282922;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c124718 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c124718;
                    break;
                case -826744969:
                case 518655537:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    C1036.m56259(new RunnableC7712(2, c6061));
                    iM55681 = C0873.m55680("ۛ᩺") ^ i6;
                    i3 = ((iM55681 ^ i7) * (-13419)) ^ 1842649586;
                    i4 = 377830903;
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c124719 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c124719;
                    break;
                case -787414311:
                case 1372889380:
                    C0992.m56107();
                    C0882.m55710();
                    break;
                case -776937561:
                case 279614354:
                    C0898.m55800();
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("ᩳ۫") ^ i6;
                        i = ((iM55680 ^ i7) * 26031) ^ 1855208804;
                        i2 = -454623901;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    } else {
                        c12474 = c12474;
                        str = str;
                        th = th;
                        iM55681 = (C0946.m55979("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM55681 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                        i5 = iM55681 ^ i4;
                        str = str;
                        th = th;
                        C12474 c1247110 = c12474;
                        i9 = i5;
                        i8 = i3;
                        c12474 = c1247110;
                    }
                    break;
                case -616528331:
                case 1566409990:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    int i16 = i13 + i14;
                    if (i12 - (i16 + i16) > 0) {
                        iM55681 = (i6 - C0946.m55979("ۢ᩻")) * (-77);
                        i3 = ((iM55681 ^ i7) * (-18033)) ^ (-224755386);
                        i4 = 293324391;
                    } else {
                        iM55681 = C0946.m55979("ۖܿ") ^ i7;
                        i3 = ((iM55681 ^ i6) * (-31899)) ^ (-1518203585);
                        i4 = 1043691187;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c1247111 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c1247111;
                    break;
                case -610988249:
                case -530942040:
                    if (C1124.f82007 >= 0) {
                        c12474 = c12474;
                        str = str;
                        th = th;
                        iM55681 = (C0946.m55979("ۜܺ") + i6) * (-121);
                        i3 = ((iM55681 ^ i7) * (-24007)) ^ (-1969407563);
                        i4 = 1575841718;
                        i5 = iM55681 ^ i4;
                        str = str;
                        th = th;
                        C12474 c1247112 = c12474;
                        i9 = i5;
                        i8 = i3;
                        c12474 = c1247112;
                    }
                    c12474 = c12474;
                    str = str;
                    th = th;
                    iM55681 = (C0873.m55680("֫᩹") + i7) * 33;
                    i3 = ((iM55681 ^ i6) * (-26009)) ^ 262776637;
                    i4 = 732255221;
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c1247113 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c1247113;
                    break;
                case -465301188:
                case 1325581488:
                    break;
                case -372234916:
                case 1794394134:
                    C1053.m56327();
                    if (C1046.f81962 <= 0) {
                        iM55680 = (i7 - C0873.m55680("ۚۜ")) * 21;
                        i = ((iM55680 ^ i6) * (-23823)) ^ 761047296;
                        i2 = -1921645695;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    } else {
                        c12474 = c12474;
                        str = str;
                        th = th;
                        iM55681 = (C0946.m55979("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM55681 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                        i5 = iM55681 ^ i4;
                        str = str;
                        th = th;
                        C12474 c1247114 = c12474;
                        i9 = i5;
                        i8 = i3;
                        c12474 = c1247114;
                    }
                    break;
                case -330880231:
                case 219920477:
                    C0882.m55710();
                    if (!C0917.m55854()) {
                        c12474 = c12474;
                        str = str;
                        th = th;
                        iM55681 = C0873.m55680("ۧ᩻") ^ i6;
                        i3 = ((iM55681 ^ i7) * (-993)) ^ 1390378630;
                        i4 = -1661240723;
                        i5 = iM55681 ^ i4;
                        str = str;
                        th = th;
                        C12474 c1247115 = c12474;
                        i9 = i5;
                        i8 = i3;
                        c12474 = c1247115;
                    }
                    c12474 = c12474;
                    str = str;
                    th = th;
                    iM55681 = (C0946.m55979("ۜ᩶") ^ i7) * (-31);
                    i3 = ((iM55681 ^ i6) * 27597) ^ 1382605837;
                    i4 = -786570788;
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c1247116 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c1247116;
                    break;
                case -237936406:
                case 825643976:
                    c12474.log(th);
                    C22682.m50800(C0845.m55591(th));
                    c12474 = c12474;
                    str = str;
                    iM55681 = C0873.m55680("ۢܳ") ^ i6;
                    i3 = ((iM55681 ^ i7) * 12133) ^ 1409179256;
                    i4 = -969042491;
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c1247117 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c1247117;
                    break;
                case -120827943:
                case 555558006:
                    C1017.m56187();
                    break;
                case 106243812:
                case 1769762612:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    i11 = s + 11301;
                    if (C0861.f81831) {
                        iM55681 = (C0873.m55680("ۡ᩺") ^ i6) * 127;
                        i3 = ((iM55681 ^ i7) * (-8399)) ^ (-2035739226);
                        i4 = 1270156277;
                    } else {
                        iM55681 = (i7 - C0873.m55680("ۤۛ")) * (-99);
                        i3 = ((iM55681 ^ i6) * (-27939)) ^ (-519334975);
                        i4 = 400842598;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c1247118 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c1247118;
                    break;
                case 238804394:
                case 1542894119:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    main = (Main) this.f32798;
                    if (C0967.f81910 >= 0) {
                        iM55681 = (C0873.m55680("֫᩹") + i7) * 33;
                        i3 = ((iM55681 ^ i6) * (-26009)) ^ 262776637;
                        i4 = 732255221;
                    } else {
                        iM55681 = C0873.m55680("ܶ᩸") ^ i6;
                        i3 = ((iM55681 ^ i7) * (-17945)) ^ 1180307200;
                        i4 = -1222542149;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c1247119 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c1247119;
                    break;
                case 357348859:
                case 1276293557:
                    C0937.m55918();
                    iM55680 = (C0946.m55979("ᩳ᩺") ^ i7) * 21;
                    i = ((iM55680 ^ i6) * (-18219)) ^ 212161999;
                    i2 = -40480986;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case 1373059930:
                case 1566184686:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    i12 = i11 * i11;
                    i13 = s * s;
                    if (C0863.f81833 <= 0) {
                        iM55681 = (C0946.m55979("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM55681 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                    } else {
                        iM55681 = C0946.m55979("ۡ᩹") ^ i7;
                        i3 = ((iM55681 ^ i6) * (-31761)) ^ (-1680616919);
                        i4 = 1020044144;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c12471110 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c12471110;
                    break;
                case 1609405614:
                case 1721705295:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    switch (this.f32797) {
                        case 0:
                            iM55681 = (C0873.m55680("ܿۙ") ^ i7) * (-9);
                            i3 = ((iM55681 ^ i6) * (-7507)) ^ (-1500892008);
                            i4 = -250885429;
                            break;
                        case 1:
                            iM55681 = C0873.m55680("ۙۚ") ^ i6;
                            i3 = ((iM55681 ^ i7) * (-8745)) ^ (-246327224);
                            i4 = -1572340286;
                            break;
                        default:
                            iM55681 = (C0873.m55680("ۖ᩻") ^ i6) * 39;
                            i3 = ((iM55681 ^ i7) * 29767) ^ (-1454701680);
                            i4 = -1650190094;
                            break;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c12471111 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c12471111;
                    break;
                default:
                    c12474 = c12474;
                    str = str;
                    th = th;
                    c = 0;
                    if (C1017.f81942 >= 0) {
                        iM55681 = (C0873.m55680("֫᩹") + i7) * 33;
                        i3 = ((iM55681 ^ i6) * (-26009)) ^ 262776637;
                        i4 = 732255221;
                    } else {
                        iM55681 = (i7 - C0873.m55680("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM55681 ^ i6) * 32621) ^ 1851606891;
                        i4 = -1063646491;
                    }
                    i5 = iM55681 ^ i4;
                    str = str;
                    th = th;
                    C12474 c12471112 = c12474;
                    i9 = i5;
                    i8 = i3;
                    c12474 = c12471112;
                    break;
            }
            return;
        }
    }
}
