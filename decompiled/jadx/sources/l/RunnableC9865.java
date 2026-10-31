package l;

import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9865 implements Runnable {

    /* JADX INFO: renamed from: ۬ۚ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f29838 = {6778, 16575, 16560, 16570, 16556, 16561, 16567, 16570, 16624, 16567, 16560, 16554, 16571, 16560, 16554, 16624, 16575, 16573, 16554, 16567, 16561, 16560, 16624, 16520, 16535, 16539, 16521};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f29839;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29840;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29841;

    public /* synthetic */ RunnableC9865(Object obj, Serializable serializable, int i) {
        int i2 = -162914146;
        int i3 = C4075.f12947;
        int i4 = ServiceConnectionC3453.f10921;
        this.f29840 = i;
        this.f29841 = obj;
        this.f29839 = serializable;
        int iM2566 = C0630.m2566("ۖ᩷") ^ i3;
        int i5 = ((iM2566 ^ i4) * 4035) ^ (-544824741);
        int i6 = 1341533871;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i4) * 23795) >> 31));
            switch (i2) {
                case -1805856749:
                case 2051057533:
                    C3663.m11168();
                    throw new RuntimeException();
                case -1575555317:
                case -1379789123:
                    C5695.m16023();
                    C1128.m3851();
                    iM2566 = C0630.m2566("ܺ᩶") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-29663)) ^ 304848442;
                    i6 = 470236087;
                    break;
                case -1427806294:
                case -1092834544:
                    C2105.m6982();
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("֫ۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-22717)) ^ (-1314850253);
                        i6 = 1494316760;
                    } else {
                        iM2566 = (C0630.m2566("֨᩺") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM2566 ^ i3) * 22601) ^ 1261658516;
                        i6 = -653856312;
                    }
                    break;
                case -1151283023:
                case -676082251:
                    return;
                case -944910058:
                case -611938986:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("۟۟") ^ i3;
                        i5 = ((iM2566 ^ i4) * 19849) ^ (-1156626126);
                        i6 = 582921618;
                    } else {
                        iM2566 = C0630.m2566("ܳۛ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 10035) ^ 779745508;
                        i6 = 994369229;
                    }
                    break;
                case -661350406:
                case 403462100:
                    if (C3746.m11369() < 0) {
                        iM2566 = C0630.m2566("֫ۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-22717)) ^ (-1314850253);
                        i6 = 1494316760;
                    } else {
                        iM2566 = C0630.m2566("᩺᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-28573)) ^ 460157613;
                        i6 = 709800338;
                    }
                    break;
                default:
                    C1005.m3501();
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("᩺᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-28573)) ^ 460157613;
                        i6 = 709800338;
                    } else {
                        iM2566 = C0630.m2566("ܺ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29663)) ^ 304848442;
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
    
        if (l.ServiceConnectionC3453.f10921 >= 0) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        int i6 = C3245.f10203;
        int i7 = C0714.f2697;
        int iM6981 = C2105.m6981("ۧ᩵") ^ i6;
        int i8 = ((iM6981 ^ i7) * 24399) ^ (-2135969515);
        short[] sArr = null;
        int i9 = iM6981 ^ (-2114868493);
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
        C10632 c10632 = null;
        Serializable serializable = null;
        C3885 c3885 = null;
        Serializable serializable2 = null;
        Main main = null;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i7) * 4211) >> 31));
            switch (i15) {
                case -2143388021:
                case 1535864655:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    c3885 = (C3885) this.f29841;
                    if (C3245.m9925() != 0) {
                        iM2567 = C0630.m2566("ۧ᩻") ^ i6;
                        i3 = ((iM2567 ^ i7) * (-993)) ^ 1390378630;
                        i4 = -1661240723;
                    } else {
                        iM2567 = C2105.m6981("ܿᩳ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-6293)) ^ 18559364;
                        i4 = 281553998;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c10633 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c10633;
                    break;
                case -1950583274:
                case 1944665694:
                    C3019.m9255();
                    if (!C0798.f2919) {
                        iM2566 = (C2105.m6981("᩺ܶ") + i6) * (-93);
                        i = ((iM2566 ^ i7) * 30681) ^ (-1091735219);
                        i2 = -1795605323;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        c10632 = c10632;
                        str = str;
                        th = th;
                        iM2567 = (C2105.m6981("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM2567 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                        i5 = iM2567 ^ i4;
                        str = str;
                        th = th;
                        C10632 c10634 = c10632;
                        i9 = i5;
                        i8 = i3;
                        c10632 = c10634;
                    }
                    break;
                case -1840660909:
                case -584146167:
                    c10632 = (C10632) this.f29841;
                    str = (String) this.f29839;
                    int iM2568 = C0630.m2566("۟ܰ") ^ i7;
                    i9 = iM2568 ^ 616557514;
                    i8 = ((iM2568 ^ i6) * 13463) ^ (-857725886);
                    th = th;
                    break;
                case -1789337903:
                case -348806224:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    serializable2 = this.f29839;
                    if (C4263.f13799 <= 0) {
                        iM2567 = C0630.m2566("ۖۤ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-13963)) ^ 993651778;
                        i4 = -1629138111;
                    } else {
                        iM2567 = (C2105.m6981("֨ۖ") ^ i7) * (-3);
                        i3 = ((iM2567 ^ i6) * 16077) ^ (-1070842534);
                        i4 = 54443342;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c10635 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c10635;
                    break;
                case -1635267257:
                case 1029307976:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    serializable = this.f29839;
                    if (C2958.f9394 >= 0) {
                        iM2567 = (C2105.m6981("ۜܺ") + i6) * (-121);
                        i3 = ((iM2567 ^ i7) * (-24007)) ^ (-1969407563);
                        i4 = 1575841718;
                    } else {
                        iM2567 = C2105.m6981("ܰܰ") ^ i7;
                        i3 = ((iM2567 ^ i6) * 21709) ^ 369809291;
                        i4 = 636011509;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c10636 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c10636;
                    break;
                case -1558753680:
                case 1445873193:
                    C21923.m49335(main, (String) serializable2);
                    break;
                case -1551367435:
                case 1407142069:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    sArr = f29838;
                    if (C2126.m7040()) {
                        iM2567 = C0630.m2566("ۖۤ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-13963)) ^ 993651778;
                        i4 = -1629138111;
                    } else {
                        iM2567 = C0630.m2566("۠᩷") ^ i6;
                        i3 = ((iM2567 ^ i7) * 28881) ^ (-419270307);
                        i4 = -859714527;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c10637 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c10637;
                    break;
                case -1427100186:
                case -900914248:
                    try {
                        c10632 = c10632;
                        try {
                            str = str;
                            try {
                                Intent intent = new Intent(C3537.m10748(f29838, 1, 26, i10), Uri.parse(C10632.m26673(str)));
                                C0798.m3009(intent, 268435456);
                                C22628.m50617(C0382.m1842(), intent);
                                iM2567 = C0630.m2566("ۢܳ") ^ i6;
                                i3 = ((iM2567 ^ i7) * 12133) ^ 1409179256;
                                i4 = -969042491;
                                i5 = iM2567 ^ i4;
                                str = str;
                                th = th;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                int iM6982 = C2105.m6981("ܽۨ") ^ i6;
                                i3 = ((iM6982 ^ i7) * 26389) ^ (-602885324);
                                i5 = iM6982 ^ (-743907383);
                                str = str;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str = str;
                            th = th;
                            int iM6983 = C2105.m6981("ܽۨ") ^ i6;
                            i3 = ((iM6983 ^ i7) * 26389) ^ (-602885324);
                            i5 = iM6983 ^ (-743907383);
                            str = str;
                            C10632 c10638 = c10632;
                            i9 = i5;
                            i8 = i3;
                            c10632 = c10638;
                            break;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c10632 = c10632;
                    }
                    C10632 c10639 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c10639;
                    break;
                case -1415102488:
                case 1746271698:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    if (((AtomicInteger) serializable).decrementAndGet() == 0) {
                        iM2567 = C2105.m6981("֨ܺ") ^ i7;
                        i3 = ((iM2567 ^ i6) * 393) ^ (-1341184039);
                        i4 = 1089958904;
                    } else {
                        iM2567 = C0630.m2566("ۛ᩺") ^ i6;
                        i3 = ((iM2567 ^ i7) * (-13419)) ^ 1842649586;
                        i4 = 377830903;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c106310 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c106310;
                    break;
                case -1334134905:
                case 1565536244:
                    i10 = 16606;
                    iM2567 = (C2105.m6981("ۙۜ") ^ i6) * (-79);
                    i3 = ((iM2567 ^ i7) * 10925) ^ 1163737391;
                    i4 = 975132820;
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c106311 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c106311;
                    break;
                case -1330427238:
                case -1278415620:
                    i10 = 40979;
                    iM2567 = (C2105.m6981("ۙۜ") ^ i6) * (-79);
                    i3 = ((iM2567 ^ i7) * 10925) ^ 1163737391;
                    i4 = 975132820;
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c106312 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c106312;
                    break;
                case -1300015403:
                case 1031777695:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    i14 = 127712601;
                    if (C0714.f2697 >= 0) {
                        iM2567 = (C0630.m2566("֫᩹") + i7) * 33;
                        i3 = ((iM2567 ^ i6) * (-26009)) ^ 262776637;
                        i4 = 732255221;
                    } else {
                        iM2567 = C0630.m2566("֫᩺") ^ i6;
                        i3 = ((iM2567 ^ i7) * (-19853)) ^ 955176797;
                        i4 = -113699726;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c106313 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c106313;
                    break;
                case -1288582976:
                case 888965984:
                    break;
                case -1098722703:
                case 327821032:
                    if (!RunnableC3474.m10630()) {
                        iM2566 = (C2105.m6981("ᩳ᩺") ^ i7) * 21;
                        i = ((iM2566 ^ i6) * (-18219)) ^ 212161999;
                        i2 = -40480986;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        c10632 = c10632;
                        str = str;
                        th = th;
                        iM2567 = C0630.m2566("ۖۤ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-13963)) ^ 993651778;
                        i4 = -1629138111;
                        i5 = iM2567 ^ i4;
                        str = str;
                        th = th;
                        C10632 c106314 = c10632;
                        i9 = i5;
                        i8 = i3;
                        c10632 = c106314;
                    }
                    break;
                case -962813997:
                case 2032213492:
                    C0050.m940();
                    if (C2520.f8000 < 0) {
                        c10632 = c10632;
                        str = str;
                        th = th;
                        iM2567 = (C2105.m6981("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM2567 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                        i5 = iM2567 ^ i4;
                        str = str;
                        th = th;
                        C10632 c106315 = c10632;
                        i9 = i5;
                        i8 = i3;
                        c10632 = c106315;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩺") ^ i7) * 21;
                        i = ((iM2566 ^ i6) * (-18219)) ^ 212161999;
                        i2 = -40480986;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    }
                    break;
                case -920425861:
                case 1516529582:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    s = sArr[c];
                    if (C3683.f11629 >= 0) {
                        iM2567 = (i7 - C0630.m2566("ۤۛ")) * (-99);
                        i3 = ((iM2567 ^ i6) * (-27939)) ^ (-519334975);
                        i4 = 400842598;
                    } else {
                        iM2567 = (C0630.m2566("ܺ᩵") ^ i7) * (-29);
                        i3 = ((iM2567 ^ i6) * (-22651)) ^ (-1106266542);
                        i4 = -425282922;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c106316 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c106316;
                    break;
                case -826744969:
                case 518655537:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    C3911.m11926(new RunnableC5622(2, c3885));
                    iM2567 = C0630.m2566("ۛ᩺") ^ i6;
                    i3 = ((iM2567 ^ i7) * (-13419)) ^ 1842649586;
                    i4 = 377830903;
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c106317 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c106317;
                    break;
                case -787414311:
                case 1372889380:
                    C3019.m9255();
                    C0798.m2998();
                    break;
                case -776937561:
                case 279614354:
                    C1128.m3851();
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("ᩳ۫") ^ i6;
                        i = ((iM2566 ^ i7) * 26031) ^ 1855208804;
                        i2 = -454623901;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        c10632 = c10632;
                        str = str;
                        th = th;
                        iM2567 = (C2105.m6981("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM2567 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                        i5 = iM2567 ^ i4;
                        str = str;
                        th = th;
                        C10632 c106318 = c10632;
                        i9 = i5;
                        i8 = i3;
                        c10632 = c106318;
                    }
                    break;
                case -616528331:
                case 1566409990:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    int i16 = i13 + i14;
                    if (i12 - (i16 + i16) > 0) {
                        iM2567 = (i6 - C2105.m6981("ۢ᩻")) * (-77);
                        i3 = ((iM2567 ^ i7) * (-18033)) ^ (-224755386);
                        i4 = 293324391;
                    } else {
                        iM2567 = C2105.m6981("ۖܿ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-31899)) ^ (-1518203585);
                        i4 = 1043691187;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c106319 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c106319;
                    break;
                case -610988249:
                case -530942040:
                    if (C5695.f17556 >= 0) {
                        c10632 = c10632;
                        str = str;
                        th = th;
                        iM2567 = (C2105.m6981("ۜܺ") + i6) * (-121);
                        i3 = ((iM2567 ^ i7) * (-24007)) ^ (-1969407563);
                        i4 = 1575841718;
                        i5 = iM2567 ^ i4;
                        str = str;
                        th = th;
                        C10632 c1063110 = c10632;
                        i9 = i5;
                        i8 = i3;
                        c10632 = c1063110;
                    }
                    c10632 = c10632;
                    str = str;
                    th = th;
                    iM2567 = (C0630.m2566("֫᩹") + i7) * 33;
                    i3 = ((iM2567 ^ i6) * (-26009)) ^ 262776637;
                    i4 = 732255221;
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c1063111 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c1063111;
                    break;
                case -465301188:
                case 1325581488:
                    break;
                case -372234916:
                case 1794394134:
                    C4263.m12819();
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i7 - C0630.m2566("ۚۜ")) * 21;
                        i = ((iM2566 ^ i6) * (-23823)) ^ 761047296;
                        i2 = -1921645695;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        c10632 = c10632;
                        str = str;
                        th = th;
                        iM2567 = (C2105.m6981("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM2567 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                        i5 = iM2567 ^ i4;
                        str = str;
                        th = th;
                        C10632 c1063112 = c10632;
                        i9 = i5;
                        i8 = i3;
                        c10632 = c1063112;
                    }
                    break;
                case -330880231:
                case 219920477:
                    C0798.m2998();
                    if (!C1504.m5179()) {
                        c10632 = c10632;
                        str = str;
                        th = th;
                        iM2567 = C0630.m2566("ۧ᩻") ^ i6;
                        i3 = ((iM2567 ^ i7) * (-993)) ^ 1390378630;
                        i4 = -1661240723;
                        i5 = iM2567 ^ i4;
                        str = str;
                        th = th;
                        C10632 c1063113 = c10632;
                        i9 = i5;
                        i8 = i3;
                        c10632 = c1063113;
                    }
                    c10632 = c10632;
                    str = str;
                    th = th;
                    iM2567 = (C2105.m6981("ۜ᩶") ^ i7) * (-31);
                    i3 = ((iM2567 ^ i6) * 27597) ^ 1382605837;
                    i4 = -786570788;
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c1063114 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c1063114;
                    break;
                case -237936406:
                case 825643976:
                    c10632.log(th);
                    C21374.m48464(C0050.m947(th));
                    c10632 = c10632;
                    str = str;
                    iM2567 = C0630.m2566("ۢܳ") ^ i6;
                    i3 = ((iM2567 ^ i7) * 12133) ^ 1409179256;
                    i4 = -969042491;
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c1063115 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c1063115;
                    break;
                case -120827943:
                case 555558006:
                    C3537.m10746();
                    break;
                case 106243812:
                case 1769762612:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    i11 = s + 11301;
                    if (C0382.f1805) {
                        iM2567 = (C0630.m2566("ۡ᩺") ^ i6) * 127;
                        i3 = ((iM2567 ^ i7) * (-8399)) ^ (-2035739226);
                        i4 = 1270156277;
                    } else {
                        iM2567 = (i7 - C0630.m2566("ۤۛ")) * (-99);
                        i3 = ((iM2567 ^ i6) * (-27939)) ^ (-519334975);
                        i4 = 400842598;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c1063116 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c1063116;
                    break;
                case 238804394:
                case 1542894119:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    main = (Main) this.f29841;
                    if (C2520.f8000 >= 0) {
                        iM2567 = (C0630.m2566("֫᩹") + i7) * 33;
                        i3 = ((iM2567 ^ i6) * (-26009)) ^ 262776637;
                        i4 = 732255221;
                    } else {
                        iM2567 = C0630.m2566("ܶ᩸") ^ i6;
                        i3 = ((iM2567 ^ i7) * (-17945)) ^ 1180307200;
                        i4 = -1222542149;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c1063117 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c1063117;
                    break;
                case 357348859:
                case 1276293557:
                    C1916.m6308();
                    iM2566 = (C2105.m6981("ᩳ᩺") ^ i7) * 21;
                    i = ((iM2566 ^ i6) * (-18219)) ^ 212161999;
                    i2 = -40480986;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case 1373059930:
                case 1566184686:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    i12 = i11 * i11;
                    i13 = s * s;
                    if (C0422.f1886 <= 0) {
                        iM2567 = (C2105.m6981("ۜ᩶") ^ i7) * (-31);
                        i3 = ((iM2567 ^ i6) * 27597) ^ 1382605837;
                        i4 = -786570788;
                    } else {
                        iM2567 = C2105.m6981("ۡ᩹") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-31761)) ^ (-1680616919);
                        i4 = 1020044144;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c1063118 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c1063118;
                    break;
                case 1609405614:
                case 1721705295:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    switch (this.f29840) {
                        case 0:
                            iM2567 = (C0630.m2566("ܿۙ") ^ i7) * (-9);
                            i3 = ((iM2567 ^ i6) * (-7507)) ^ (-1500892008);
                            i4 = -250885429;
                            break;
                        case 1:
                            iM2567 = C0630.m2566("ۙۚ") ^ i6;
                            i3 = ((iM2567 ^ i7) * (-8745)) ^ (-246327224);
                            i4 = -1572340286;
                            break;
                        default:
                            iM2567 = (C0630.m2566("ۖ᩻") ^ i6) * 39;
                            i3 = ((iM2567 ^ i7) * 29767) ^ (-1454701680);
                            i4 = -1650190094;
                            break;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c1063119 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c1063119;
                    break;
                default:
                    c10632 = c10632;
                    str = str;
                    th = th;
                    c = 0;
                    if (C3537.f11231 >= 0) {
                        iM2567 = (C0630.m2566("֫᩹") + i7) * 33;
                        i3 = ((iM2567 ^ i6) * (-26009)) ^ 262776637;
                        i4 = 732255221;
                    } else {
                        iM2567 = (i7 - C0630.m2566("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2567 ^ i6) * 32621) ^ 1851606891;
                        i4 = -1063646491;
                    }
                    i5 = iM2567 ^ i4;
                    str = str;
                    th = th;
                    C10632 c10631110 = c10632;
                    i9 = i5;
                    i8 = i3;
                    c10632 = c10631110;
                    break;
            }
            return;
        }
    }
}
