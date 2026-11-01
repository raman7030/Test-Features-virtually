package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8982 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩻ܽۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f82041 = {5689, 29841, 29856, 29878, 29873, 8963, 29590, 29577, 29581, 29606, 29581, 29588, 29577, 29631, 29596, 29592, 29581, 29580, 29579, 29596, 29578, 29594, 29589, 29592, 29578, 29578, 29596, 29578, 29602, 29643, 29652, 29632, 29604, 29638, 29605, 29655, 29597, 29596, 29569, 29683, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29636, 29683};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f24330;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ViewOnClickListenerC4308 f24331;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ StringBuilder f24332;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C24164 f24333;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0807 A[PHI: r8 r14 r19 r20 r23 r24 r29 r30 r34 r35 r37
      0x0807: PHI (r8v64 l.᩵ۛۡ) = (r8v58 l.᩵ۛۡ), (r8v65 l.᩵ۛۡ) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r14v54 short[]) = (r14v48 short[]), (r14v55 short[]) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r19v10 java.lang.String) = (r19v2 java.lang.String), (r19v11 java.lang.String) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r20v16 java.lang.String) = (r20v2 java.lang.String), (r20v18 java.lang.String) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r23v4 short[]) = (r23v3 short[]), (r23v2 short[]) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r24v4 char) = (r24v3 char), (r24v2 char) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r29v38 java.lang.StringBuilder) = (r29v32 java.lang.StringBuilder), (r29v39 java.lang.StringBuilder) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r30v20 java.lang.Throwable) = (r30v14 java.lang.Throwable), (r30v21 java.lang.Throwable) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r34v59 java.lang.String) = (r34v53 java.lang.String), (r34v60 java.lang.String) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r35v44 java.lang.Throwable) = (r35v38 java.lang.Throwable), (r35v45 java.lang.Throwable) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r37v39 java.lang.Object) = (r37v33 java.lang.Object), (r37v40 java.lang.Object) binds: [B:184:0x0805, B:169:0x0716] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        short[] sArr;
        int iM55680;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int iM55979;
        int i5;
        String str2;
        short[] sArr2;
        Object obj;
        Throwable th;
        StringBuilder sb;
        C20689 c20689;
        int iM559710;
        int i6;
        int i7;
        int iM559711;
        int i8;
        short[] sArr3;
        short[] sArr4;
        int iM55681;
        int i9;
        int i10;
        String str3;
        int iM559712;
        int i11;
        int i12;
        String str4;
        short[] sArr5;
        Throwable thM55702;
        int i13;
        C8982 c8982 = this;
        int i14 = ViewOnClickListenerC0939.f81888;
        int i15 = C0989.f81920;
        int iM55682 = C0873.m55680("᩸ۚ") ^ i14;
        int i16 = ((iM55682 ^ i15) * 25551) ^ (-2100344404);
        Throwable th2 = null;
        Object obj2 = null;
        C20689 c206810 = null;
        Iterator it = null;
        String str5 = null;
        Iterator itM56308 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i17 = iM55682 ^ 383212487;
        int i18 = 0;
        int i19 = 0;
        boolean z = false;
        DexClassLoader dexClassLoader = null;
        boolean zM55886 = false;
        char c = 0;
        short s = 0;
        short s2 = 0;
        boolean zM55647 = false;
        int i20 = -906140079;
        String str6 = null;
        Iterator itM56593 = null;
        C5738 c5738 = null;
        StringBuilder sb2 = null;
        C19561 c19561 = null;
        Throwable th3 = null;
        boolean zMatches = false;
        HashSet hashSet = null;
        Object obj3 = null;
        Throwable th4 = null;
        String absolutePath = null;
        while (true) {
            i20 = i17 ^ (i16 & (((i20 ^ i15) * 27967) >> 31));
            switch (i20) {
                case -2032801226:
                case 429217159:
                    str5 = str5;
                    sArr = sArr7;
                    Throwable th5 = th2;
                    c206810 = c206810;
                    Object obj4 = obj2;
                    sb2 = sb2;
                    C0949.m56011(th5, obj4);
                    th2 = th5;
                    obj2 = obj4;
                    iM55979 = C0946.m55979("᩺ۛ") ^ i15;
                    i3 = ((iM55979 ^ i14) * (-29259)) ^ 1326468060;
                    i5 = -95734961;
                    i4 = iM55979 ^ i5;
                    sb2 = sb2;
                    th2 = th2;
                    obj2 = obj2;
                    c206810 = c206810;
                    sArr7 = sArr;
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                case -1984929349:
                case 484512921:
                    C0930.m55885();
                    C0930.m55885();
                    return;
                case -1977075352:
                case 438844556:
                    thM55702 = th3.getSuppressed()[0];
                    th4 = thM55702;
                    iM55681 = (i15 - C0946.m55979("ۡۧ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i9 = ((iM55681 ^ i14) * 25243) ^ 898372605;
                    i10 = 1770096376;
                    sArr4 = sArr7;
                    i17 = iM55681 ^ i10;
                    i16 = i9;
                    sArr7 = sArr4;
                    break;
                case -1847472368:
                case 258658937:
                    throw th2;
                case -1818573090:
                case -1158644779:
                    sArr7 = sArr7;
                    if (!zM55886) {
                        sArr = sArr7;
                        iM55979 = C0873.m55680("᩷ܳ") ^ i14;
                        i3 = ((iM55979 ^ i15) * (-9201)) ^ 1355326295;
                        i5 = -916795618;
                        i4 = iM55979 ^ i5;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    } else {
                        iM55681 = C0946.m55979("ۢᩳ") ^ i14;
                        i9 = ((iM55681 ^ i15) * (-30507)) ^ (-739064110);
                        i10 = 1467212385;
                        sArr4 = sArr7;
                        i17 = iM55681 ^ i10;
                        i16 = i9;
                        sArr7 = sArr4;
                    }
                    break;
                case -1805251051:
                case -1101019405:
                    thM55702 = C0877.m55702(th3);
                    th4 = thM55702;
                    iM55681 = (i15 - C0946.m55979("ۡۧ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i9 = ((iM55681 ^ i14) * 25243) ^ 898372605;
                    i10 = 1770096376;
                    sArr4 = sArr7;
                    i17 = iM55681 ^ i10;
                    i16 = i9;
                    sArr7 = sArr4;
                    break;
                case -1780707671:
                case 1716559855:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (i15 - C0946.m55979("ᩳ᩺")) * (-31);
                        i = ((iM55680 ^ i14) * (-26789)) ^ (-934091030);
                        i2 = 1953453802;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    } else {
                        str2 = str5;
                        sArr2 = sArr7;
                        obj = obj2;
                        c20689 = c206810;
                        sb = sb2;
                        th = th2;
                        iM559710 = (C0946.m55979("ۤܺ") ^ i15) * 83;
                        i6 = ((iM559710 ^ i14) * (-25197)) ^ 933672078;
                        i7 = 1726550922;
                        int i21 = iM559710 ^ i7;
                        sArr7 = sArr2;
                        th2 = th;
                        c206810 = c20689;
                        i16 = i6;
                        sb2 = sb;
                        obj2 = obj;
                        str3 = str2;
                        i17 = i21;
                        str5 = str3;
                    }
                    break;
                case -1714546804:
                case 1862132467:
                    sArr3 = sArr7;
                    try {
                        Class.forName(str5, z, dexClassLoader);
                        sArr = sArr3;
                        iM55979 = (C0873.m55680("۫ۚ") + i14) * (-67);
                        i3 = ((iM55979 ^ i15) * (-10209)) ^ 2143733500;
                        i5 = -831189141;
                        i4 = iM55979 ^ i5;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    } catch (Throwable th6) {
                        int iM55683 = C0873.m55680("ۤۡ") ^ i14;
                        th3 = th6;
                        i16 = ((iM55683 ^ i15) * (-2367)) ^ 2122552522;
                        sArr4 = sArr3;
                        i17 = iM55683 ^ (-2141291979);
                        sArr7 = sArr4;
                    }
                    break;
                case -1652928331:
                case -791188122:
                    str5 = str5;
                    sArr = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    th2 = th2;
                    try {
                        zM55647 = C0866.m55647(itM56593);
                        iM55979 = (C0946.m55979("۠ᩳ") ^ i15) * (-113);
                        i3 = ((iM55979 ^ i14) * 29983) ^ 930542372;
                        i5 = 701340638;
                        i4 = iM55979 ^ i5;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr;
                    } catch (Throwable th7) {
                        th = th7;
                        th2 = th;
                        int iM55684 = C0873.m55680("ۖۖ") ^ i15;
                        i3 = ((iM55684 ^ i14) * (-23253)) ^ (-1763413862);
                        i4 = iM55684 ^ 1602083679;
                        c206810 = c206810;
                        sArr7 = sArr;
                        sb2 = sb2;
                        obj2 = obj2;
                    }
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                case -1572533277:
                case -896389650:
                    str5 = str5;
                    sArr7 = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    th2 = th2;
                    th4 = th4;
                    if (((s * s) + 2608225) - (s * s2) >= 0) {
                        iM559712 = (C0873.m55680("ܽ֫") + i14) * 21;
                        i11 = ((iM559712 ^ i15) * (-17411)) ^ 2081911817;
                        i12 = 134351075;
                    } else {
                        iM559712 = (C0946.m55979("᩷ۡ") + i15) * (-29);
                        i11 = ((iM559712 ^ i14) * 26105) ^ (-1918114760);
                        i12 = -1649525140;
                    }
                    i13 = iM559712 ^ i12;
                    sb2 = sb2;
                    th4 = th4;
                    str5 = str5;
                    th2 = th2;
                    obj2 = obj2;
                    i17 = i13;
                    i16 = i11;
                    c206810 = c206810;
                    sArr7 = sArr7;
                    c8982 = this;
                    break;
                case -1546313262:
                case 1385195630:
                    return;
                case -1496573434:
                case -898501037:
                    sArr3 = sArr7;
                    C1003.m56121(sb2, C0861.m55618(sArr8, i18, 22, i19));
                    sArr = sArr3;
                    iM55979 = (C0873.m55680("۫ۚ") + i14) * (-67);
                    i3 = ((iM55979 ^ i15) * (-10209)) ^ 2143733500;
                    i5 = -831189141;
                    i4 = iM55979 ^ i5;
                    sb2 = sb2;
                    th2 = th2;
                    obj2 = obj2;
                    c206810 = c206810;
                    sArr7 = sArr;
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                case -1493058577:
                case -449670205:
                    i19 = 56597;
                    iM559712 = (i15 - C0946.m55979("ۘۘ")) * 41;
                    i11 = ((iM559712 ^ i14) * (-22503)) ^ 1750321909;
                    i12 = -218248365;
                    i13 = iM559712 ^ i12;
                    sb2 = sb2;
                    th4 = th4;
                    str5 = str5;
                    th2 = th2;
                    obj2 = obj2;
                    i17 = i13;
                    i16 = i11;
                    c206810 = c206810;
                    sArr7 = sArr7;
                    c8982 = this;
                    break;
                case -1466590573:
                case -500497694:
                    str5 = str5;
                    sArr = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    th2 = th2;
                    z = true;
                    z = true;
                    if (zM55647) {
                        iM55979 = (i14 - C0946.m55979("ᩴ֫")) * 115;
                        i3 = ((iM55979 ^ i15) * (-13081)) ^ (-713333741);
                        i5 = 1021497837;
                    } else {
                        iM55979 = C0946.m55979("۟ܿ") ^ i14;
                        i3 = ((iM55979 ^ i15) * 23387) ^ (-224957645);
                        i5 = 1236759473;
                    }
                    i4 = iM55979 ^ i5;
                    sb2 = sb2;
                    th2 = th2;
                    obj2 = obj2;
                    c206810 = c206810;
                    sArr7 = sArr;
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                case -1436558584:
                case 1231280050:
                    str5 = str5;
                    sArr = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    th2 = th2;
                    try {
                        C1124.m56366(c19561);
                        iM55979 = C0946.m55979("᩺ۛ") ^ i15;
                        i3 = ((iM55979 ^ i14) * (-29259)) ^ 1326468060;
                        i5 = -95734961;
                        i4 = iM55979 ^ i5;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    } catch (Throwable th8) {
                        int iM55685 = (C0873.m55680("ۤ᩻") + i14) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        th2 = th2;
                        c206810 = c206810;
                        sArr7 = sArr;
                        obj2 = th8;
                        i16 = ((iM55685 ^ i15) * 21655) ^ 1325925742;
                        sb2 = sb2;
                        i17 = iM55685 ^ (-1561289640);
                        str5 = str5;
                    }
                    break;
                case -1407446106:
                case 1257721998:
                    sArr7 = sArr7;
                    zM55886 = C0930.m55886(itM56308);
                    iM55681 = (C0946.m55979("۟᩻") ^ i14) * 21;
                    i9 = ((iM55681 ^ i15) * (-4697)) ^ 964312795;
                    i10 = 1544902386;
                    sArr4 = sArr7;
                    i17 = iM55681 ^ i10;
                    i16 = i9;
                    sArr7 = sArr4;
                    break;
                case -1358367635:
                case -262301605:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("ܶܰ") ^ i14;
                        i = ((iM55680 ^ i15) * 6641) ^ 399209592;
                        i2 = 499326526;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    } else {
                        str2 = str5;
                        sArr2 = sArr7;
                        obj = obj2;
                        c20689 = c206810;
                        sb = sb2;
                        th = th2;
                        iM559710 = (C0946.m55979("ۤܺ") ^ i15) * 83;
                        i6 = ((iM559710 ^ i14) * (-25197)) ^ 933672078;
                        i7 = 1726550922;
                        int i22 = iM559710 ^ i7;
                        sArr7 = sArr2;
                        th2 = th;
                        c206810 = c20689;
                        i16 = i6;
                        sb2 = sb;
                        obj2 = obj;
                        str3 = str2;
                        i17 = i22;
                        str5 = str3;
                    }
                    break;
                case -1332992900:
                case 1021770705:
                    str5 = str5;
                    sArr7 = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    str4 = str6;
                    th2 = th2;
                    File cacheDir = c8982.f24331.getCacheDir();
                    short[] sArr9 = f82041;
                    if (C1229.f82066 < 0) {
                        str6 = str4;
                        if (C1048.f81963) {
                            th4 = th4;
                            File file = new File(cacheDir, C1017.m56189(sArr9, 6, 7, i19));
                            C17425.m39677(file);
                            absolutePath = file.getAbsolutePath();
                            if (C1071.f81975 <= 0) {
                                iM559712 = C0946.m55979("۬ۗ") ^ i15;
                                i11 = ((iM559712 ^ i14) * (-18857)) ^ 1609527537;
                                i12 = -834050116;
                            } else {
                                iM559712 = C0946.m55979("ۙᩳ") ^ i14;
                                i11 = ((iM559712 ^ i15) * (-14327)) ^ (-1328611607);
                                i12 = 1179670733;
                            }
                            i13 = iM559712 ^ i12;
                            sb2 = sb2;
                            th4 = th4;
                        } else {
                            int iM559713 = C0946.m55979("ۢۜ") ^ i14;
                            i11 = ((iM559713 ^ i15) * 18483) ^ 2055382504;
                            i13 = iM559713 ^ 846456802;
                            sb2 = sb2;
                        }
                        str5 = str5;
                        th2 = th2;
                        obj2 = obj2;
                        i17 = i13;
                        i16 = i11;
                        c206810 = c206810;
                        sArr7 = sArr7;
                        c8982 = this;
                    } else {
                        sArr5 = sArr7;
                        str5 = str5;
                        int iM559714 = (C0946.m55979("ᩴܰ") + i15) * 45;
                        i = ((iM559714 ^ i14) * (-24359)) ^ 397865519;
                        i17 = iM559714 ^ (-2020501834);
                        c8982 = this;
                        str6 = str4;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr5;
                        i16 = i;
                    }
                    break;
                case -1250426241:
                case 257552738:
                    C1044.m56286();
                    if (C1124.m56367() >= 0) {
                        iM55680 = (i15 - C0946.m55979("ᩳ᩺")) * (-31);
                        i = ((iM55680 ^ i14) * (-26789)) ^ (-934091030);
                        i2 = 1953453802;
                    } else {
                        iM55680 = C0873.m55680("֡ܰ") ^ i14;
                        i = ((iM55680 ^ i15) * 29155) ^ 1592244405;
                        i2 = 2107240084;
                    }
                    i17 = iM55680 ^ i2;
                    i16 = i;
                    break;
                case -1238211880:
                case -60343140:
                    sArr7 = sArr7;
                    if (C0949.m56006(th3) != null) {
                        iM55681 = C0873.m55680("۠ۨ") ^ i14;
                        i9 = ((iM55681 ^ i15) * 17233) ^ 1966057422;
                        i10 = -360923444;
                    } else {
                        th4 = th3;
                        iM55681 = (i15 - C0946.m55979("ۡۧ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM55681 ^ i14) * 25243) ^ 898372605;
                        i10 = 1770096376;
                    }
                    sArr4 = sArr7;
                    i17 = iM55681 ^ i10;
                    i16 = i9;
                    sArr7 = sArr4;
                    break;
                case -1178872296:
                case 294956075:
                    sArr = sArr7;
                    if (C0845.m55582(str5, C1036.m56252(sArr, 13, 8, i19))) {
                        iM55979 = (C0873.m55680("۫ۚ") + i14) * (-67);
                        i3 = ((iM55979 ^ i15) * (-10209)) ^ 2143733500;
                        i5 = -831189141;
                        i4 = iM55979 ^ i5;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    } else {
                        int iM55686 = C0873.m55680("ܿ᩸") ^ i14;
                        i17 = iM55686 ^ (-1179716136);
                        i16 = ((iM55686 ^ i15) * (-16319)) ^ 1848355599;
                        sArr7 = sArr;
                    }
                    break;
                case -773267232:
                case 1123533970:
                    str5 = str5;
                    sArr7 = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    th2 = th2;
                    th4 = th4;
                    sArr6 = f82041;
                    c = 5;
                    if (C0989.m56095() <= 0) {
                        iM559712 = C0946.m55979("۬ۗ") ^ i15;
                        i11 = ((iM559712 ^ i14) * (-18857)) ^ 1609527537;
                        i12 = -834050116;
                    } else {
                        iM559712 = C0946.m55979("᩹֨") ^ i15;
                        i11 = ((iM559712 ^ i14) * 27797) ^ (-1976781930);
                        i12 = -37115356;
                    }
                    i13 = iM559712 ^ i12;
                    sb2 = sb2;
                    th4 = th4;
                    str5 = str5;
                    th2 = th2;
                    obj2 = obj2;
                    i17 = i13;
                    i16 = i11;
                    c206810 = c206810;
                    sArr7 = sArr7;
                    c8982 = this;
                    break;
                case -730004865:
                case -81678296:
                    sArr7 = sArr7;
                    if (th3.getSuppressed().length == z) {
                        iM55681 = (i14 - C0873.m55680("᩸ܿ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM55681 ^ i15) * (-12305)) ^ 24210093;
                        i10 = 866359900;
                    } else {
                        iM55681 = C0873.m55680("ۛۚ") ^ i14;
                        i9 = ((iM55681 ^ i15) * (-26031)) ^ 53786091;
                        i10 = -502194768;
                    }
                    sArr4 = sArr7;
                    i17 = iM55681 ^ i10;
                    i16 = i9;
                    sArr7 = sArr4;
                    break;
                case -646967475:
                case 625037530:
                    C1028.m56247();
                    str2 = str5;
                    sArr2 = sArr7;
                    obj = obj2;
                    c20689 = c206810;
                    sb = sb2;
                    th = th2;
                    iM559710 = (C0946.m55979("ۤܺ") ^ i15) * 83;
                    i6 = ((iM559710 ^ i14) * (-25197)) ^ 933672078;
                    i7 = 1726550922;
                    int i23 = iM559710 ^ i7;
                    sArr7 = sArr2;
                    th2 = th;
                    c206810 = c20689;
                    i16 = i6;
                    sb2 = sb;
                    obj2 = obj;
                    str3 = str2;
                    i17 = i23;
                    str5 = str3;
                    break;
                case -623730288:
                case 1795584551:
                    sArr7 = sArr7;
                    itM56308 = C1048.m56308((AbstractC20050) C0861.m55614(C0854.m55608(C1003.m56127(c19561, c5738, obj3))));
                    iM55681 = (C0946.m55979("᩵᩹") + i15) * (-41);
                    i9 = ((iM55681 ^ i14) * (-2437)) ^ (-1411345546);
                    i10 = -166447869;
                    sArr4 = sArr7;
                    i17 = iM55681 ^ i10;
                    i16 = i9;
                    sArr7 = sArr4;
                    break;
                case -462318927:
                case 1239440563:
                    RunnableC1014.m56177();
                    if (C1229.m56410() != 0) {
                        sArr = sArr7;
                        th2 = th2;
                        int iM559715 = C0946.m55979("ۧ۫") ^ i14;
                        i3 = ((iM559715 ^ i15) * (-16727)) ^ (-1280371934);
                        i4 = iM559715 ^ 1034691810;
                        th2 = th2;
                        obj2 = obj2;
                        dexClassLoader = null;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    } else {
                        iM55680 = C0873.m55680("֡ܰ") ^ i14;
                        i = ((iM55680 ^ i15) * 29155) ^ 1592244405;
                        i2 = 2107240084;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    }
                    break;
                case -360487856:
                case 55617927:
                    try {
                        String strM56215 = C1024.m56215((C9952) C0955.m56035(itM56308));
                        sArr7 = sArr7;
                        try {
                            C1044.m56271(hashSet, C1071.m56342(C1404.m56454(strM56215, z ? 1 : 0, C0882.m55719(strM56215) - (z ? 1 : 0)), '/', '.'));
                            iM55681 = (C0946.m55979("᩵᩹") + i15) * (-41);
                            i9 = ((iM55681 ^ i14) * (-2437)) ^ (-1411345546);
                            i10 = -166447869;
                            sArr4 = sArr7;
                            i17 = iM55681 ^ i10;
                            i16 = i9;
                            sArr7 = sArr4;
                        } catch (Throwable th9) {
                            th2 = th9;
                            sArr = sArr7;
                            sb2 = sb2;
                            int iM55687 = C0873.m55680("ۖۖ") ^ i15;
                            i3 = ((iM55687 ^ i14) * (-23253)) ^ (-1763413862);
                            i4 = iM55687 ^ 1602083679;
                            c206810 = c206810;
                            sArr7 = sArr;
                            sb2 = sb2;
                            obj2 = obj2;
                            str3 = str5;
                            i17 = i4;
                            i16 = i3;
                            str5 = str3;
                        }
                    } catch (Throwable th10) {
                        th2 = th10;
                        sArr = sArr7;
                    }
                    break;
                case -309482762:
                case -61689344:
                    sArr7 = sArr7;
                    System.out.println(str5);
                    iM55681 = (C0873.m55680("ܺܿ") ^ i15) * (-31);
                    i9 = ((iM55681 ^ i14) * 2165) ^ (-131091690);
                    i10 = -921398242;
                    sArr4 = sArr7;
                    i17 = iM55681 ^ i10;
                    i16 = i9;
                    sArr7 = sArr4;
                    break;
                case -285384886:
                case 2013842181:
                    i19 = 29689;
                    iM559712 = (i15 - C0946.m55979("ۘۘ")) * 41;
                    i11 = ((iM559712 ^ i14) * (-22503)) ^ 1750321909;
                    i12 = -218248365;
                    i13 = iM559712 ^ i12;
                    sb2 = sb2;
                    th4 = th4;
                    str5 = str5;
                    th2 = th2;
                    obj2 = obj2;
                    i17 = i13;
                    i16 = i11;
                    c206810 = c206810;
                    sArr7 = sArr7;
                    c8982 = this;
                    break;
                case -214594493:
                case 309531200:
                    str5 = str5;
                    sArr = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    th2 = th2;
                    ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                    String str7 = c8982.f24330;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        str6 = str7;
                        sb2 = sb2;
                        int iM559716 = C0946.m55979("ۧ۫") ^ i14;
                        i3 = ((iM559716 ^ i15) * (-16727)) ^ (-1280371934);
                        i4 = iM559716 ^ 1034691810;
                        th2 = th2;
                        obj2 = obj2;
                        dexClassLoader = null;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    } else {
                        obj3 = null;
                        str = absolutePath;
                        dexClassLoader = new DexClassLoader(str7, str, null, systemClassLoader);
                        if (ServiceConnectionC1013.m56157() <= 0) {
                            str6 = str7;
                            int iM55688 = (i15 - C0873.m55680("ᩳ᩹")) * (-113);
                            i3 = ((iM55688 ^ i14) * 1283) ^ 85443621;
                            i4 = iM55688 ^ (-1035276483);
                            absolutePath = str;
                            sb2 = sb2;
                            th2 = th2;
                            obj2 = obj2;
                            c206810 = c206810;
                            sArr7 = sArr;
                            str3 = str5;
                            i17 = i4;
                            i16 = i3;
                            str5 = str3;
                        } else {
                            int iM559717 = (C0946.m55979("ܽܺ") + i14) * (-77);
                            str6 = str7;
                            absolutePath = str;
                            sb2 = sb2;
                            str5 = str5;
                            th2 = th2;
                            obj2 = obj2;
                            i17 = iM559717 ^ (-218516352);
                            i16 = ((iM559717 ^ i15) * (-465)) ^ 790940396;
                            c206810 = c206810;
                            sArr7 = sArr;
                            obj3 = null;
                        }
                    }
                    break;
                case -160627091:
                case 1835549119:
                    str5 = str5;
                    sArr = sArr7;
                    Throwable th11 = th2;
                    c206810 = c206810;
                    Object obj5 = obj2;
                    sb2 = sb2;
                    try {
                        C5738 c5739 = (C5738) C0955.m56035(itM56593);
                        try {
                            th2 = th11;
                            obj2 = obj5;
                            try {
                                zMatches = C1028.m56241(c5739).matches(RunnableC0938.m55936(f82041, 21, 18, i19));
                                int iM559718 = C0946.m55979("᩷֨") ^ i15;
                                i3 = ((iM559718 ^ i14) * (-11937)) ^ (-295605191);
                                i4 = iM559718 ^ (-1329833374);
                                sb2 = sb2;
                                c5738 = c5739;
                                th2 = th2;
                                obj2 = obj2;
                                c206810 = c206810;
                                sArr7 = sArr;
                            } catch (Throwable th12) {
                                th = th12;
                                c5738 = c5739;
                                th2 = th;
                                int iM55689 = C0873.m55680("ۖۖ") ^ i15;
                                i3 = ((iM55689 ^ i14) * (-23253)) ^ (-1763413862);
                                i4 = iM55689 ^ 1602083679;
                                c206810 = c206810;
                                sArr7 = sArr;
                                sb2 = sb2;
                                obj2 = obj2;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            obj2 = obj5;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        obj2 = obj5;
                    }
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                case -127538444:
                case 700120844:
                    if (C1044.f81959 < 0) {
                        str5 = str5;
                        sArr7 = sArr7;
                        obj2 = obj2;
                        c206810 = c206810;
                        sb2 = sb2;
                        th2 = th2;
                        int iM559719 = C0946.m55979("ۢۜ") ^ i14;
                        i11 = ((iM559719 ^ i15) * 18483) ^ 2055382504;
                        i13 = iM559719 ^ 846456802;
                        sb2 = sb2;
                        str5 = str5;
                        th2 = th2;
                        obj2 = obj2;
                        i17 = i13;
                        i16 = i11;
                        c206810 = c206810;
                        sArr7 = sArr7;
                        c8982 = this;
                    } else {
                        str2 = str5;
                        sArr2 = sArr7;
                        obj = obj2;
                        c20689 = c206810;
                        sb = sb2;
                        th = th2;
                        iM559710 = (C0946.m55979("ۤܺ") ^ i15) * 83;
                        i6 = ((iM559710 ^ i14) * (-25197)) ^ 933672078;
                        i7 = 1726550922;
                        int i24 = iM559710 ^ i7;
                        sArr7 = sArr2;
                        th2 = th;
                        c206810 = c20689;
                        i16 = i6;
                        sb2 = sb;
                        obj2 = obj;
                        str3 = str2;
                        i17 = i24;
                        str5 = str3;
                    }
                    break;
                case -51314054:
                case 481615811:
                    sArr7 = sArr7;
                    sb2 = c8982.f24332;
                    C6112.m13909(sb2, th4);
                    sArr8 = f82041;
                    i18 = 39;
                    if (!C0861.f81831) {
                        sArr = sArr7;
                        th2 = th2;
                        int iM5597110 = C0946.m55979("ۧ۫") ^ i14;
                        i3 = ((iM5597110 ^ i15) * (-16727)) ^ (-1280371934);
                        i4 = iM5597110 ^ 1034691810;
                        th2 = th2;
                        obj2 = obj2;
                        dexClassLoader = null;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    } else {
                        iM55681 = C0946.m55979("᩻ۚ") ^ i15;
                        i9 = ((iM55681 ^ i14) * (-13767)) ^ 844182962;
                        i10 = 1062213499;
                        sArr4 = sArr7;
                        i17 = iM55681 ^ i10;
                        i16 = i9;
                        sArr7 = sArr4;
                    }
                    break;
                case -20567950:
                case 1167964900:
                    sArr7 = sArr7;
                    if (!zMatches) {
                        sArr = sArr7;
                        iM55979 = C0873.m55680("᩷ܳ") ^ i14;
                        i3 = ((iM55979 ^ i15) * (-9201)) ^ 1355326295;
                        i5 = -916795618;
                        i4 = iM55979 ^ i5;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    } else {
                        iM55681 = C0873.m55680("ܺۛ") ^ i15;
                        i9 = ((iM55681 ^ i14) * (-18227)) ^ (-895453254);
                        i10 = -1641787823;
                        sArr4 = sArr7;
                        i17 = iM55681 ^ i10;
                        i16 = i9;
                        sArr7 = sArr4;
                    }
                    break;
                case -479154:
                case 1011918152:
                    str5 = str5;
                    sArr = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    C0854.m55609(c206810, new C24793(c8982.f24333));
                    it = hashSet.iterator();
                    iM55979 = (C0873.m55680("۫ۚ") + i14) * (-67);
                    i3 = ((iM55979 ^ i15) * (-10209)) ^ 2143733500;
                    i5 = -831189141;
                    i4 = iM55979 ^ i5;
                    sb2 = sb2;
                    th2 = th2;
                    obj2 = obj2;
                    c206810 = c206810;
                    sArr7 = sArr;
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                case 66879645:
                case 1126044670:
                    sArr = sArr7;
                    itM56593 = C1964.m56593(C1071.m56348(c19561));
                    iM55979 = C0873.m55680("᩷ܳ") ^ i14;
                    i3 = ((iM55979 ^ i15) * (-9201)) ^ 1355326295;
                    i5 = -916795618;
                    i4 = iM55979 ^ i5;
                    sb2 = sb2;
                    th2 = th2;
                    obj2 = obj2;
                    c206810 = c206810;
                    sArr7 = sArr;
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                case 69130743:
                case 1771002929:
                    C0866.m55645();
                    if (C0992.m56107() <= 0) {
                        sArr5 = sArr7;
                        obj2 = obj2;
                        c206810 = c206810;
                        sb2 = sb2;
                        str4 = str6;
                        th2 = th2;
                        int iM5597111 = (C0946.m55979("ᩴܰ") + i15) * 45;
                        i = ((iM5597111 ^ i14) * (-24359)) ^ 397865519;
                        i17 = iM5597111 ^ (-2020501834);
                        c8982 = this;
                        str6 = str4;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr5;
                        i16 = i;
                    } else {
                        str5 = str5;
                        sArr7 = sArr7;
                        obj2 = obj2;
                        c206810 = c206810;
                        sb2 = sb2;
                        th2 = th2;
                        int iM5597112 = C0946.m55979("ۢۜ") ^ i14;
                        i11 = ((iM5597112 ^ i15) * 18483) ^ 2055382504;
                        i13 = iM5597112 ^ 846456802;
                        sb2 = sb2;
                        str5 = str5;
                        th2 = th2;
                        obj2 = obj2;
                        i17 = i13;
                        i16 = i11;
                        c206810 = c206810;
                        sArr7 = sArr7;
                        c8982 = this;
                    }
                    break;
                case 149441276:
                case 698485361:
                    str5 = str5;
                    sArr7 = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    th2 = th2;
                    th4 = th4;
                    s = sArr6[c];
                    s2 = 3230;
                    if (C0967.f81910 >= 0) {
                        iM559712 = C0946.m55979("ܰ۬") ^ i15;
                        i11 = ((iM559712 ^ i14) * 31689) ^ 1889292490;
                        i12 = 1512753990;
                    } else {
                        iM559712 = (C0946.m55979("ۚᩳ") + i14) * (-43);
                        i11 = ((iM559712 ^ i15) * 2215) ^ (-279923236);
                        i12 = 2141079475;
                    }
                    i13 = iM559712 ^ i12;
                    sb2 = sb2;
                    th4 = th4;
                    str5 = str5;
                    th2 = th2;
                    obj2 = obj2;
                    i17 = i13;
                    i16 = i11;
                    c206810 = c206810;
                    sArr7 = sArr7;
                    c8982 = this;
                    break;
                case 496241606:
                case 1064953173:
                    str2 = str5;
                    sArr2 = sArr7;
                    obj = obj2;
                    th = th2;
                    sb = sb2;
                    C0967.m56075(c19561);
                    c20689 = new C20689(hashSet.size());
                    if (C0947.f81895) {
                        iM559710 = (C0946.m55979("ۤܺ") ^ i15) * 83;
                        i6 = ((iM559710 ^ i14) * (-25197)) ^ 933672078;
                        i7 = 1726550922;
                    } else {
                        iM559710 = (i15 - C0946.m55979("ۧۗ")) * (-109);
                        i6 = ((iM559710 ^ i14) * 9979) ^ (-1420248896);
                        i7 = -1663674611;
                    }
                    int i25 = iM559710 ^ i7;
                    sArr7 = sArr2;
                    th2 = th;
                    c206810 = c20689;
                    i16 = i6;
                    sb2 = sb;
                    obj2 = obj;
                    str3 = str2;
                    i17 = i25;
                    str5 = str3;
                    break;
                case 872879749:
                case 2013074398:
                    sArr = sArr7;
                    c206810 = c206810;
                    if (C0866.m55647(it)) {
                        iM559711 = C0873.m55680("᩷᩷") ^ i14;
                        i3 = ((iM559711 ^ i15) * (-23445)) ^ (-705680716);
                        i8 = 966988808;
                    } else {
                        iM559711 = (i15 - C0946.m55979("᩻ۧ")) * 35;
                        i3 = ((iM559711 ^ i14) * (-8617)) ^ (-1035000026);
                        i8 = -775758417;
                    }
                    i4 = iM559711 ^ i8;
                    c206810 = c206810;
                    sArr7 = sArr;
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                case 987823787:
                case 1837367007:
                    str5 = (String) RunnableC0897.m55785(it);
                    c206810 = c206810;
                    RunnableC1014.m56171(c206810, z ? 1 : 0);
                    sArr5 = f82041;
                    if (C0947.f81895) {
                        obj2 = obj2;
                        th2 = th2;
                        sb2 = sb2;
                        str4 = str6;
                        int iM5597113 = (C0946.m55979("ᩴܰ") + i15) * 45;
                        i = ((iM5597113 ^ i14) * (-24359)) ^ 397865519;
                        i17 = iM5597113 ^ (-2020501834);
                        c8982 = this;
                        str6 = str4;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr5;
                        i16 = i;
                    } else {
                        int iM556810 = (C0873.m55680("᩷ۙ") ^ i15) * (-27);
                        i16 = ((iM556810 ^ i14) * (-4379)) ^ 2108671429;
                        c206810 = c206810;
                        sArr7 = sArr5;
                        i17 = iM556810 ^ 888767138;
                    }
                    break;
                case 996892736:
                case 1521609548:
                    C0898.m55800();
                    if (C1929.f83011 != 0) {
                        str5 = str5;
                        sArr7 = sArr7;
                        obj2 = obj2;
                        c206810 = c206810;
                        sb2 = sb2;
                        th2 = th2;
                        th4 = th4;
                        iM559712 = C0946.m55979("ܰ۬") ^ i15;
                        i11 = ((iM559712 ^ i14) * 31689) ^ 1889292490;
                        i12 = 1512753990;
                        i13 = iM559712 ^ i12;
                        sb2 = sb2;
                        th4 = th4;
                        str5 = str5;
                        th2 = th2;
                        obj2 = obj2;
                        i17 = i13;
                        i16 = i11;
                        c206810 = c206810;
                        sArr7 = sArr7;
                        c8982 = this;
                    } else {
                        sArr5 = sArr7;
                        obj2 = obj2;
                        c206810 = c206810;
                        sb2 = sb2;
                        str4 = str6;
                        th2 = th2;
                        int iM5597114 = (C0946.m55979("ᩴܰ") + i15) * 45;
                        i = ((iM5597114 ^ i14) * (-24359)) ^ 397865519;
                        i17 = iM5597114 ^ (-2020501834);
                        c8982 = this;
                        str6 = str4;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr5;
                        i16 = i;
                    }
                    break;
                case 1140344252:
                case 1354834229:
                    str5 = str5;
                    sArr = sArr7;
                    obj2 = obj2;
                    c206810 = c206810;
                    sb2 = sb2;
                    th2 = th2;
                    hashSet = new HashSet();
                    String str8 = str6;
                    c19561 = new C19561(str8);
                    int iM559720 = C0946.m55979("ᩳ֨") ^ i15;
                    i3 = ((iM559720 ^ i14) * (-27763)) ^ (-183684014);
                    i4 = iM559720 ^ (-1237323524);
                    str6 = str8;
                    sb2 = sb2;
                    th2 = th2;
                    obj2 = obj2;
                    c206810 = c206810;
                    sArr7 = sArr;
                    str3 = str5;
                    i17 = i4;
                    i16 = i3;
                    str5 = str3;
                    break;
                default:
                    if (AbstractC0942.f81890 <= 0) {
                        str5 = str5;
                        sArr = sArr7;
                        obj2 = obj2;
                        c206810 = c206810;
                        sb2 = sb2;
                        str = absolutePath;
                        th2 = th2;
                        int iM556811 = (i15 - C0873.m55680("ᩳ᩹")) * (-113);
                        i3 = ((iM556811 ^ i14) * 1283) ^ 85443621;
                        i4 = iM556811 ^ (-1035276483);
                        absolutePath = str;
                        sb2 = sb2;
                        th2 = th2;
                        obj2 = obj2;
                        c206810 = c206810;
                        sArr7 = sArr;
                        str3 = str5;
                        i17 = i4;
                        i16 = i3;
                        str5 = str3;
                    }
                    str2 = str5;
                    sArr2 = sArr7;
                    obj = obj2;
                    c20689 = c206810;
                    sb = sb2;
                    th = th2;
                    iM559710 = (C0946.m55979("ۤܺ") ^ i15) * 83;
                    i6 = ((iM559710 ^ i14) * (-25197)) ^ 933672078;
                    i7 = 1726550922;
                    int i26 = iM559710 ^ i7;
                    sArr7 = sArr2;
                    th2 = th;
                    c206810 = c20689;
                    i16 = i6;
                    sb2 = sb;
                    obj2 = obj;
                    str3 = str2;
                    i17 = i26;
                    str5 = str3;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ViewOnClickListenerC4308 viewOnClickListenerC4308 = null;
        int i = -1292709032;
        int i2 = C1124.f82007;
        int i3 = C1044.f81959;
        int iM55680 = C0873.m55680("ᩴ᩵") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-21327)) ^ 614434980;
        int i5 = 585374707;
        while (true) {
            i = ((((i ^ i3) * 24355) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2070206616:
                case -1482364007:
                    if (C0873.m55678()) {
                        iM55680 = (i2 - C0873.m55680("ۜ֨")) * (-83);
                        i4 = ((iM55680 ^ i3) * (-17327)) ^ 514697078;
                        i5 = 1300200696;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۡ") ^ i3) * (-111);
                        i4 = ((iM55680 ^ i2) * 5575) ^ 1454233357;
                        i5 = 390636139;
                    }
                    break;
                case -1530367370:
                case 217651508:
                    C1071.m56343();
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1319) ^ 338298472;
                        i5 = 465596642;
                    } else {
                        iM55680 = (C0946.m55979("ۢ۟") ^ i3) * (-29);
                        i4 = ((iM55680 ^ i2) * (-14795)) ^ (-1546323244);
                        i5 = -449658002;
                    }
                    break;
                case -1529947036:
                case -600579536:
                    viewOnClickListenerC4308 = this.f24331;
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("ᩳ֡") + i2) * (-75);
                        i4 = ((iM55680 ^ i3) * (-17027)) ^ (-1885071857);
                        i5 = 1664679053;
                    } else {
                        iM55680 = C0946.m55979("۫ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7065) ^ (-1289404838);
                        i5 = -506534860;
                    }
                    break;
                case -1285372019:
                case 1756065377:
                    C1036.m56257();
                    if (C0906.f81862 < 0) {
                        iM55680 = (i2 - C0873.m55680("ۜ֨")) * (-83);
                        i4 = ((iM55680 ^ i3) * (-17327)) ^ 514697078;
                        i5 = 1300200696;
                    } else {
                        iM55680 = C0873.m55680("ܺ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7703)) ^ (-560398442);
                        i5 = -1646558459;
                    }
                    break;
                case -962888844:
                case 242572800:
                    if (C1017.f81942 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ۜ֨")) * (-83);
                        i4 = ((iM55680 ^ i3) * (-17327)) ^ 514697078;
                        i5 = 1300200696;
                    } else {
                        iM55680 = (C0946.m55979("ۤ᩹") + i3) * (-125);
                        i4 = ((iM55680 ^ i2) * (-27711)) ^ (-836797081);
                        i5 = 274561922;
                    }
                    break;
                case -808422107:
                case 1730788655:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1319) ^ 338298472;
                        i5 = 465596642;
                    } else {
                        iM55680 = C0873.m55680("۫ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27723) ^ (-1981237852);
                        i5 = 1772935791;
                    }
                    break;
                case -354231236:
                case 360739899:
                    AbstractC0942.m55971();
                    RunnableC0897.m55784();
                    break;
                case -158519164:
                case 1500701313:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ۜ֨")) * (-83);
                        i4 = ((iM55680 ^ i3) * (-17327)) ^ 514697078;
                        i5 = 1300200696;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۙۛ")) * 11;
                        i4 = ((iM55680 ^ i3) * (-18903)) ^ (-1029673469);
                        i5 = 1059170119;
                    }
                    break;
                case -151773677:
                case 1134965828:
                    C0854.m55595();
                    C0882.m55710();
                    iM55680 = C0873.m55680("ܺ۠") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-7703)) ^ (-560398442);
                    i5 = -1646558459;
                    break;
                case 15148945:
                case 2031360094:
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0946.m55979("۫ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7065) ^ (-1289404838);
                        i5 = -506534860;
                    } else {
                        iM55680 = C0946.m55979("۬ܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-15095)) ^ 245769576;
                        i5 = 747966575;
                    }
                    break;
                case 25845638:
                case 484398436:
                    ServiceConnectionC1013.m56155(viewOnClickListenerC4308, exc, null);
                    break;
                case 190315121:
                case 424334013:
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1319) ^ 338298472;
                        i5 = 465596642;
                    } else {
                        iM55680 = (C0873.m55680("᩹֫") ^ i3) * 75;
                        i4 = ((iM55680 ^ i2) * (-12725)) ^ (-93224618);
                        i5 = -913318580;
                    }
                    break;
                case 208446130:
                case 2068739269:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("۫ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7065) ^ (-1289404838);
                        i5 = -506534860;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܽۢ")) * (-45);
                        i4 = ((iM55680 ^ i3) * 13173) ^ 491046570;
                        i5 = 1413293419;
                    }
                    break;
                case 487192838:
                case 1511536279:
                    C0906.m55809();
                    if (C1229.m56410() == 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1319) ^ 338298472;
                        i5 = 465596642;
                    } else {
                        iM55680 = C0873.m55680("ܺ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7703)) ^ (-560398442);
                        i5 = -1646558459;
                    }
                    break;
                case 921650375:
                case 945495074:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i2 - C0873.m55680("ۜ֨")) * (-83);
                        i4 = ((iM55680 ^ i3) * (-17327)) ^ 514697078;
                        i5 = 1300200696;
                    } else {
                        iM55680 = C0946.m55979("ۛۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24211) ^ (-2107670227);
                        i5 = -1036213584;
                    }
                    break;
                default:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1319) ^ 338298472;
                        i5 = 465596642;
                    } else {
                        iM55680 = C0946.m55979("֡ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8775)) ^ 212968848;
                        i5 = -2000911599;
                    }
                    break;
            }
            return;
        }
    }

    public C8982(ViewOnClickListenerC4308 viewOnClickListenerC4308, String str, C24164 c24164, StringBuilder sb) {
        int i = -1376834847;
        int i2 = C1229.f82066;
        int i3 = RunnableC0871.f81839;
        this.f24331 = viewOnClickListenerC4308;
        this.f24330 = str;
        this.f24333 = c24164;
        this.f24332 = sb;
        int iM55680 = (C0873.m55680("ܶ᩶") ^ i2) * 127;
        int i4 = ((iM55680 ^ i3) * 32285) ^ (-1202532627);
        int i5 = 1828005763;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i3) * (-3379)) >> 31));
            switch (i) {
                case -1963091577:
                case 1827931270:
                    C1048.m56305();
                    if (!C0937.f81884) {
                        iM55680 = C0873.m55680("ۨۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5843)) ^ 689416159;
                        i5 = 1117633530;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۜ۫")) * 47;
                        i4 = ((iM55680 ^ i3) * (-28101)) ^ 647922410;
                        i5 = 458905071;
                    }
                    break;
                case -1349070566:
                case -134496729:
                    C0882.m55710();
                    if (C0906.f81862 < 0) {
                        iM55680 = (i2 - C0946.m55979("ۜ۫")) * 47;
                        i4 = ((iM55680 ^ i3) * (-28101)) ^ 647922410;
                        i5 = 458905071;
                    } else {
                        iM55680 = C0946.m55979("ۛ֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-31519)) ^ (-253203756);
                        i5 = -2144873911;
                    }
                    break;
                case -1336820441:
                case 92806512:
                    RunnableC0897.m55784();
                    C0946.m55980();
                    iM55680 = C0873.m55680("ۨۡ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-5843)) ^ 689416159;
                    i5 = 1117633530;
                    break;
                case -614033236:
                case 169531022:
                    C0947.m55997();
                    throw new RuntimeException();
                case 718947258:
                case 1830944425:
                    if (C0930.m55885() <= 0) {
                        iM55680 = (C0873.m55680("᩺۟") ^ i2) * 23;
                        i4 = ((iM55680 ^ i3) * (-29017)) ^ (-1718107910);
                        i5 = 185620585;
                    } else {
                        iM55680 = C0873.m55680("ܽᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25359) ^ (-582154627);
                        i5 = -135022242;
                    }
                    break;
                case 1174636238:
                case 2135302146:
                    return;
                default:
                    C0873.m55678();
                    if (C0877.f81843 < 0) {
                        iM55680 = C0873.m55680("ۨۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5843)) ^ 689416159;
                        i5 = 1117633530;
                    } else {
                        iM55680 = C0873.m55680("ۙۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-15735)) ^ 1806419367;
                        i5 = 319208758;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[PHI: r5 r6
      0x0083: PHI (r5v4 java.lang.String) = 
      (r5v3 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:23:0x0081, B:17:0x0068, B:15:0x0065, B:12:0x0060, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r6v4 java.lang.String) = 
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:23:0x0081, B:17:0x0068, B:15:0x0065, B:12:0x0060, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0124 A[PHI: r2 r3
      0x0124: PHI (r2v4 java.io.PrintStream) = (r2v3 java.io.PrintStream), (r2v2 java.io.PrintStream), (r2v2 java.io.PrintStream) binds: [B:36:0x0122, B:32:0x0103, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r3v4 java.lang.StringBuilder) = (r3v3 java.lang.StringBuilder), (r3v2 java.lang.StringBuilder), (r3v2 java.lang.StringBuilder) binds: [B:36:0x0122, B:32:0x0103, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f1 A[PHI: r4 r9 r10
      0x01f1: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:55:0x01ef, B:15:0x0065, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:55:0x01ef, B:15:0x0065, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:55:0x01ef, B:15:0x0065, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x023e A[PHI: r8 r11 r12 r20
      0x023e: PHI (r8v4 char) = (r8v2 char), (r8v3 char), (r8v2 char), (r8v2 char), (r8v2 char) binds: [B:63:0x023c, B:59:0x0220, B:51:0x01ce, B:47:0x01ab, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:63:0x023c, B:59:0x0220, B:51:0x01ce, B:47:0x01ab, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r12v4 short) = (r12v2 short), (r12v2 short), (r12v2 short), (r12v3 short), (r12v2 short) binds: [B:63:0x023c, B:59:0x0220, B:51:0x01ce, B:47:0x01ab, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x023c, B:59:0x0220, B:51:0x01ce, B:47:0x01ab, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55979;
        int i;
        int i2;
        int i3 = C0894.f81854;
        int i4 = C0863.f81833;
        int iM55680 = C0873.m55680("۬۬") ^ i4;
        int i5 = ((iM55680 ^ i3) * 26469) ^ 2095269048;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55680 ^ 1281881144;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1253819789;
        String str = null;
        String strM55592 = null;
        String strM55591 = null;
        StringBuilder sb = null;
        PrintStream printStream = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * (-25849)) >> 31));
            switch (i11) {
                case -2044512584:
                case -244774779:
                    c = 0;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ۚۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-19233)) ^ (-193187275);
                        i2 = -43118862;
                    } else {
                        iM55979 = C0946.m55979("ܳ֡") ^ i3;
                        i = ((iM55979 ^ i4) * 23179) ^ 1218212898;
                        i2 = -710881036;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1772651707:
                case -425377358:
                    C0894.m55769();
                    C1124.m56367();
                    iM55979 = (C0873.m55680("ܳܶ") + i3) * 83;
                    i = ((iM55979 ^ i4) * 2273) ^ (-1757907993);
                    i2 = -1075459926;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1718375697:
                case 118205048:
                    RunnableC0938.m55938();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0873.m55680("ܳܶ") + i3) * 83;
                        i = ((iM55979 ^ i4) * 2273) ^ (-1757907993);
                        i2 = -1075459926;
                    } else {
                        iM55979 = C0946.m55979("ۚۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-19233)) ^ (-193187275);
                        i2 = -43118862;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1636981783:
                case 951557325:
                    sArr2 = f82041;
                    i10 = 1;
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("۟ۙ") ^ i3;
                        i = ((iM55979 ^ i4) * (-24735)) ^ (-967183770);
                        i2 = -349216525;
                    } else {
                        iM55979 = C0946.m55979("᩹֨") ^ i3;
                        i = ((iM55979 ^ i4) * 27259) ^ (-797601587);
                        i2 = -1231282052;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1416224279:
                case -894560627:
                    s2 = 22398;
                    if (C0949.m56012()) {
                        iM55979 = C0946.m55979("ۚۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-19233)) ^ (-193187275);
                        i2 = -43118862;
                    } else {
                        iM55979 = (C0946.m55979("ۙܰ") ^ i4) * 71;
                        i = ((iM55979 ^ i3) * (-24319)) ^ (-424940553);
                        i2 = 406308199;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1075318471:
                case 1686556137:
                    printStream = System.out;
                    sb = this.f24332;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i3) * 24973) ^ (-1558543799);
                        i2 = -1362478000;
                    } else {
                        iM55979 = C0873.m55680("֫ۢ") ^ i3;
                        i = ((iM55979 ^ i4) * (-26457)) ^ (-1219574334);
                        i2 = 1100972668;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1048221959:
                case -245330467:
                    if (i8 - (s * s2) >= 0) {
                        iM55979 = C0873.m55680("۠ۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 13625) ^ (-801823892);
                        i2 = -1454027122;
                    } else {
                        iM55979 = C0873.m55680("ᩳۙ") ^ i4;
                        i = ((iM55979 ^ i3) * 5505) ^ (-13653560);
                        i2 = 987611634;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -958888002:
                case 2065311323:
                    ActivityC16573.m37551(this.f24331, strM55591, strM55592, str, str);
                    break;
                case -857263742:
                case 36923929:
                    printStream.println(sb);
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i3) * 24973) ^ (-1558543799);
                        i2 = -1362478000;
                    } else {
                        iM55979 = C0946.m55979("᩵֫") ^ i4;
                        i = ((iM55979 ^ i3) * 24929) ^ (-332478277);
                        i2 = -746793863;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -451737517:
                case 573945909:
                    i9 = 30719;
                    iM55979 = (C0946.m55979("ᩴۘ") + i3) * 35;
                    i = ((iM55979 ^ i4) * 4879) ^ (-1085654006);
                    i2 = -398574658;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -444229967:
                case 1762970386:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = (C0873.m55680("ܳܶ") + i3) * 83;
                        i = ((iM55979 ^ i4) * 2273) ^ (-1757907993);
                        i2 = -1075459926;
                    } else {
                        iM55979 = (C0873.m55680("ܽ۬") ^ i3) * (-45);
                        i = ((iM55979 ^ i4) * 13181) ^ (-453900432);
                        i2 = -949649696;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 236185939:
                case 1490563411:
                    s = sArr[c];
                    i7 = s * s;
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0873.m55680("ܽ۬") ^ i3) * (-45);
                        i = ((iM55979 ^ i4) * 13181) ^ (-453900432);
                        i2 = -949649696;
                    } else {
                        iM55979 = C0946.m55979("ۙ۬") ^ i3;
                        i = ((iM55979 ^ i4) * 27407) ^ 417458357;
                        i2 = -1854273494;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 469948016:
                case 1921548176:
                    i8 = i7 + 125417601;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۚۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-19233)) ^ (-193187275);
                        i2 = -43118862;
                    } else {
                        iM55979 = (C0873.m55680("᩷ܽ") ^ i4) * 75;
                        i = ((iM55979 ^ i3) * 24473) ^ 355395712;
                        i2 = -2034938272;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 505414228:
                case 1717026368:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("ܳܶ") + i3) * 83;
                        i = ((iM55979 ^ i4) * 2273) ^ (-1757907993);
                        i2 = -1075459926;
                    } else {
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i3) * 24973) ^ (-1558543799);
                        i2 = -1362478000;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 606967779:
                case 684526211:
                    i9 = 29893;
                    iM55979 = (C0946.m55979("ᩴۘ") + i3) * 35;
                    i = ((iM55979 ^ i4) * 4879) ^ (-1085654006);
                    i2 = -398574658;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 893628652:
                case 1641134990:
                    RunnableC0871.m55672();
                    break;
                case 1005002586:
                case 1145127722:
                    strM55592 = C0845.m55592(sArr2, i10, 4, i9);
                    str = null;
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ܳܶ") + i3) * 83;
                        i = ((iM55979 ^ i4) * 2273) ^ (-1757907993);
                        i2 = -1075459926;
                    } else {
                        iM55979 = (C0873.m55680("᩶ۨ") ^ i4) * 123;
                        i = ((iM55979 ^ i3) * (-32207)) ^ (-1930162035);
                        i2 = -1934891302;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1318712457:
                case 1418488505:
                    sArr = f82041;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("ۚۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-19233)) ^ (-193187275);
                        i2 = -43118862;
                    } else {
                        iM55979 = C0946.m55979("ۛ᩹") ^ i4;
                        i = ((iM55979 ^ i3) * (-6447)) ^ 1764186187;
                        i2 = -1631020217;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM55591 = C0845.m55591(sb);
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("ܽ۬") ^ i3) * (-45);
                        i = ((iM55979 ^ i4) * 13181) ^ (-453900432);
                        i2 = -949649696;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ۟") ^ i4) * (-13);
                        i = ((iM55979 ^ i3) * 3917) ^ (-2140864446);
                        i2 = -2071573414;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f24333.m53442();
    }
}
