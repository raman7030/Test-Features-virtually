package l;

import android.os.AsyncTask;
import android.os.PowerManager;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.Executor;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4WQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7548 {

    /* JADX INFO: renamed from: ۜۘܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f23320 = {2222, 30321, 30223, -17420, 6012, -14080, -7137, -2679};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Executor f23321 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13136 f23322;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC7379 f23323;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f23324;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11782 f23325;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1006();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1007(Exception exc);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo1008();

    /* JADX INFO: renamed from: ܳ */
    public boolean mo8740() {
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo1009();

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo1010();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20270(AbstractActivityC3346 abstractActivityC3346, C9170 c9170) {
        int i = -1706000109;
        int i2 = C3245.f10203;
        int i3 = C3019.f9544;
        int iM2566 = C0630.m2566("ܶ᩶") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-11259)) ^ (-869155580);
        int i5 = 68764479;
        while (true) {
            i = ((((i ^ i3) * 1025) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1737377247:
                case -454091727:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("֡᩷") + i2) * (-7);
                        i4 = ((iM2566 ^ i3) * 14457) ^ (-662546081);
                        i5 = 13915844;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܶۜ")) * 41;
                        i4 = ((iM2566 ^ i3) * (-21485)) ^ (-12849552);
                        i5 = -1577900814;
                    }
                    break;
                case -1640753035:
                case 482440573:
                    if (C4075.m12263() <= 0) {
                        iM2566 = (C0630.m2566("ۢ᩷") + i3) * 77;
                        i4 = ((iM2566 ^ i2) * 7323) ^ (-1381978642);
                        i5 = 1278501223;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۢ᩻")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i2) * (-18751)) ^ 998258492;
                        i5 = 1781749613;
                    }
                    break;
                case -1322484266:
                case 616130208:
                    m20271(abstractActivityC3346, c9170, (RunnableC4901) null);
                    break;
                case -1219411510:
                case -447170257:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("᩻۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2651)) ^ (-876428375);
                        i5 = -604169866;
                    } else {
                        iM2566 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22905) ^ (-352677858);
                        i5 = -1135761469;
                    }
                    break;
                case -1209425857:
                case -108561702:
                    C7106.m19120();
                    C3537.m10746();
                    break;
                case -1053027178:
                case -722389674:
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("᩻۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2651)) ^ (-876428375);
                        i5 = -604169866;
                    } else {
                        iM2566 = C0630.m2566("ܶ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7851) ^ 2022211386;
                        i5 = -1792482393;
                    }
                    break;
                case -820818526:
                case 63159699:
                    RunnableC1108.m3790();
                    iM2566 = C0630.m2566("᩻۟") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-2651)) ^ (-876428375);
                    i5 = -604169866;
                    break;
                case -420701552:
                case 1193084357:
                    if (C0964.m3413()) {
                        iM2566 = C0630.m2566("ۗ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-12795)) ^ 1880717413;
                        i5 = 2112699223;
                    } else {
                        iM2566 = (C0630.m2566("ۢ᩷") + i3) * 77;
                        i4 = ((iM2566 ^ i2) * 7323) ^ (-1381978642);
                        i5 = 1278501223;
                    }
                    break;
                case -419358629:
                case 243089578:
                    if (C4616.f14690 > 0) {
                        iM2566 = (C0630.m2566("ۢ᩷") + i3) * 77;
                        i4 = ((iM2566 ^ i2) * 7323) ^ (-1381978642);
                        i5 = 1278501223;
                    } else {
                        iM2566 = C0630.m2566("᩸ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16925)) ^ 223765385;
                        i5 = 582090530;
                    }
                    break;
                case -262849554:
                case 32504825:
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("᩻ۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-13851)) ^ 296741699;
                        i5 = -1430276109;
                    } else {
                        iM2566 = (C0630.m2566("֡᩷") + i2) * (-7);
                        i4 = ((iM2566 ^ i3) * 14457) ^ (-662546081);
                        i5 = 13915844;
                    }
                    break;
                case -210639226:
                case 1603582422:
                    if (C4159.m12565() >= 0) {
                        iM2566 = C0630.m2566("᩸ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16925)) ^ 223765385;
                        i5 = 582090530;
                    } else {
                        iM2566 = (C0630.m2566("ۛ᩺") ^ i3) * 13;
                        i4 = ((iM2566 ^ i2) * (-24275)) ^ 1359719941;
                        i5 = 1517986305;
                    }
                    break;
                case 193626771:
                case 1967598690:
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("᩸ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16925)) ^ 223765385;
                        i5 = 582090530;
                    } else {
                        iM2566 = C2105.m6981("ۘ֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-18161)) ^ 1069687336;
                        i5 = 1976625665;
                    }
                    break;
                case 233563563:
                case 643883351:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("᩸ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16925)) ^ 223765385;
                        i5 = 582090530;
                    } else {
                        iM2566 = C0630.m2566("ܽܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20185)) ^ (-460747261);
                        i5 = 961567547;
                    }
                    break;
                case 548875730:
                case 673440904:
                    if (!C3683.m11222()) {
                        iM2566 = C0630.m2566("᩸ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16925)) ^ 223765385;
                        i5 = 582090530;
                    } else {
                        iM2566 = C0630.m2566("᩻۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2651)) ^ (-876428375);
                        i5 = -604169866;
                    }
                    break;
                case 904577318:
                case 1167970331:
                    RunnableC1937.m6387();
                    if (C3019.m9255() <= 0) {
                        iM2566 = C0630.m2566("᩻۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2651)) ^ (-876428375);
                        i5 = -604169866;
                    } else {
                        iM2566 = C0630.m2566("ۢ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-723)) ^ 139381404;
                        i5 = 47099580;
                    }
                    break;
                default:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("֡᩷") + i2) * (-7);
                        i4 = ((iM2566 ^ i3) * 14457) ^ (-662546081);
                        i5 = 13915844;
                    } else {
                        iM2566 = (i2 - C0630.m2566("֫ܿ")) * 89;
                        i4 = ((iM2566 ^ i3) * (-12275)) ^ (-1404338523);
                        i5 = -1900606154;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20268(AbstractActivityC3346 abstractActivityC3346, int i, int i2) {
        int i3 = 310226889;
        int i4 = C4616.f14690;
        int i5 = C0714.f2697;
        int iM2566 = C0630.m2566("᩷᩻") ^ i4;
        int i6 = ((iM2566 ^ i5) * (-1579)) ^ (-1606594482);
        int i7 = 852108159;
        while (true) {
            i3 = ((((i3 ^ i5) * 14339) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -1909672073:
                case 520662630:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (i5 - C0630.m2566("ܽᩴ")) * (-63);
                        i6 = ((iM2566 ^ i4) * (-20539)) ^ 1265541403;
                        i7 = -1074841352;
                    } else {
                        iM2566 = (i5 - C2105.m6981("᩷ᩴ")) * (-73);
                        i6 = ((iM2566 ^ i4) * 10785) ^ (-238884092);
                        i7 = 2046842404;
                    }
                    break;
                case -1422251470:
                case 842713786:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (i4 - C2105.m6981("ܽۚ")) * (-103);
                        i6 = ((iM2566 ^ i5) * (-28213)) ^ 1446529129;
                        i7 = 1730011254;
                    } else {
                        iM2566 = C0630.m2566("ܺ۫") ^ i4;
                        i6 = ((iM2566 ^ i5) * 17231) ^ 2034275848;
                        i7 = 1018476451;
                    }
                    break;
                case -1334760178:
                case 230207205:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ܽۚ")) * (-103);
                        i6 = ((iM2566 ^ i5) * (-28213)) ^ 1446529129;
                        i7 = 1730011254;
                    } else {
                        iM2566 = C2105.m6981("᩻֫") ^ i4;
                        i6 = ((iM2566 ^ i5) * 18493) ^ 1499702626;
                        i7 = -808198499;
                    }
                    break;
                case -1298800650:
                case -378848563:
                    if (C4075.m12263() <= 0) {
                        iM2566 = C0630.m2566("֫᩻") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-16549)) ^ (-834806611);
                        i7 = 1150041782;
                    } else {
                        iM2566 = (C2105.m6981("ۧۢ") ^ i5) * (-41);
                        i6 = ((iM2566 ^ i4) * 9229) ^ 1366129743;
                        i7 = 1251637517;
                    }
                    break;
                case -1169297486:
                case 1358549309:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i4 - C2105.m6981("ܳܶ")) * 119;
                        i6 = ((iM2566 ^ i5) * (-26747)) ^ 239539497;
                        i7 = -878446555;
                    } else {
                        iM2566 = (i5 - C2105.m6981("֡ۖ")) * 69;
                        i6 = ((iM2566 ^ i4) * 19397) ^ 1251625176;
                        i7 = 101551992;
                    }
                    break;
                case -884307170:
                case 509187209:
                    C3683.m11222();
                    iM2566 = (i5 - C0630.m2566("ܽۨ")) * (-69);
                    i6 = ((iM2566 ^ i4) * 25651) ^ (-497151573);
                    i7 = -1082953283;
                    break;
                case -723619998:
                case 463420635:
                    C1711.m5736();
                    C0050.m940();
                    break;
                case -551885856:
                case 375610596:
                    m20269(abstractActivityC3346, i, i2, null);
                    break;
                case -89847706:
                case 232491581:
                    C7106.m19120();
                    if (!C4159.f13567) {
                        iM2566 = (i4 - C2105.m6981("ܳܶ")) * 119;
                        i6 = ((iM2566 ^ i5) * (-26747)) ^ 239539497;
                        i7 = -878446555;
                    } else {
                        iM2566 = C0630.m2566("֫᩻") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-16549)) ^ (-834806611);
                        i7 = 1150041782;
                    }
                    break;
                case -33675255:
                case 428479978:
                    if (C0483.m2121()) {
                        iM2566 = C2105.m6981("ܽۖ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 22913) ^ (-1102456305);
                        i7 = -1765141257;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ܽۨ")) * (-69);
                        i6 = ((iM2566 ^ i4) * 25651) ^ (-497151573);
                        i7 = -1082953283;
                    }
                    break;
                case -10819141:
                case 1160344894:
                    C22628.m50615();
                    if (C7106.f21815 == 0) {
                        iM2566 = (i4 - C2105.m6981("ܽۚ")) * (-103);
                        i6 = ((iM2566 ^ i5) * (-28213)) ^ 1446529129;
                        i7 = 1730011254;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܳܶ")) * 119;
                        i6 = ((iM2566 ^ i5) * (-26747)) ^ 239539497;
                        i7 = -878446555;
                    }
                    break;
                case 343061339:
                case 1700893048:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("֫᩻") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-16549)) ^ (-834806611);
                        i7 = 1150041782;
                    } else {
                        iM2566 = C2105.m6981("᩵֫") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-22299)) ^ 2144957023;
                        i7 = -1133057679;
                    }
                    break;
                case 421398400:
                case 1563207312:
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("֫᩻") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-16549)) ^ (-834806611);
                        i7 = 1150041782;
                    } else {
                        iM2566 = C2105.m6981("ᩴ֡") ^ i5;
                        i6 = ((iM2566 ^ i4) * 28477) ^ 764333651;
                        i7 = -1748617638;
                    }
                    break;
                case 437227410:
                case 1795626510:
                    if (C1711.f5919) {
                        iM2566 = (i5 - C0630.m2566("ܽᩴ")) * (-63);
                        i6 = ((iM2566 ^ i4) * (-20539)) ^ 1265541403;
                        i7 = -1074841352;
                    } else {
                        iM2566 = (i4 - C0630.m2566("֫ܰ")) * (-65);
                        i6 = ((iM2566 ^ i5) * 32615) ^ 869043143;
                        i7 = -1875439913;
                    }
                    break;
                case 1187511306:
                case 2141410119:
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ۤܳ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-23693)) ^ (-1446224121);
                        i7 = -1466452616;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ܽᩴ")) * (-63);
                        i6 = ((iM2566 ^ i4) * (-20539)) ^ 1265541403;
                        i7 = -1074841352;
                    }
                    break;
                default:
                    C3663.m11168();
                    if (C0237.f1507 == 0) {
                        iM2566 = (i4 - C2105.m6981("ܳܶ")) * 119;
                        i6 = ((iM2566 ^ i5) * (-26747)) ^ 239539497;
                        i7 = -878446555;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ܽۨ")) * (-69);
                        i6 = ((iM2566 ^ i4) * 25651) ^ (-497151573);
                        i7 = -1082953283;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x025e A[PHI: r1 r2 r3 r4 r5 r10 r11 r12 r16 r17 r18
      0x025e: PHI (r1v3 short[]) = (r1v2 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r2v2 char) = (r2v1 char), (r2v1 char), (r2v1 char), (r2v1 char), (r2v1 char), (r2v1 char), (r2v3 char) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short), (r3v1 short), (r3v1 short), (r3v1 short) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r10v3 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r16v19 int) = (r16v7 int), (r16v8 int), (r16v9 int), (r16v16 int), (r16v17 int), (r16v18 int), (r16v20 int) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r17v3 java.lang.String) = 
      (r17v1 java.lang.String)
      (r17v1 java.lang.String)
      (r17v1 java.lang.String)
      (r17v1 java.lang.String)
      (r17v1 java.lang.String)
      (r17v2 java.lang.String)
      (r17v1 java.lang.String)
     binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r18v14 int) = (r18v3 int), (r18v4 int), (r18v5 int), (r18v10 int), (r18v11 int), (r18v13 int), (r18v15 int) binds: [B:64:0x025c, B:59:0x0223, B:55:0x01fb, B:36:0x010d, B:32:0x00e7, B:29:0x00c3, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0296 A[PHI: r8 r16 r18
      0x0296: PHI (r8v4 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:68:0x0294, B:47:0x0199, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r16v28 int) = (r16v6 int), (r16v11 int), (r16v33 int) binds: [B:68:0x0294, B:47:0x0199, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r18v21 int) = (r18v2 int), (r18v7 int), (r18v25 int) binds: [B:68:0x0294, B:47:0x0199, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20266(AbstractActivityC3346 abstractActivityC3346) {
        int i;
        int iM2566;
        int i2;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1164397723;
        int i14 = C2958.f9394;
        int i15 = C5695.f17556;
        int iM6981 = (C2105.m6981("᩸ܺ") + i15) * (-93);
        int i16 = ((iM6981 ^ i14) * 5379) ^ (-771935772);
        int i17 = iM6981 ^ (-1805780224);
        String strM7159 = null;
        while (true) {
            int i18 = i17 ^ (i16 & (((i13 ^ i14) * (-6299)) >> 31));
            switch (i18) {
                case -1940422946:
                case 1930946497:
                    i = i10;
                    i18 = i18;
                    i9 = s * s3;
                    if (C2520.m8026()) {
                        iM2566 = C0630.m2566("ۛ֫") ^ i14;
                        i2 = ((iM2566 ^ i15) * (-731)) ^ (-1754192803);
                        i3 = -1213804600;
                    } else {
                        iM2566 = (i15 - C0630.m2566("ۖۙ")) * (-21);
                        i2 = ((iM2566 ^ i14) * (-8527)) ^ 1003375720;
                        i3 = -20357079;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case -1888776092:
                case 1705648814:
                    C4075.m12263();
                    break;
                case -1666696178:
                case -1117389893:
                    i = i10;
                    i18 = i18;
                    i8 = i7 * i7;
                    s3 = 2;
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C0630.m2566("ۜۛ") ^ i14) * (-17);
                        i2 = ((iM2566 ^ i15) * (-11103)) ^ 130352329;
                        i3 = -288358018;
                    } else {
                        iM2566 = (i14 - C0630.m2566("ܺۛ")) * 127;
                        i2 = ((iM2566 ^ i15) * 17221) ^ 569563342;
                        i3 = -390070133;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case -1444614432:
                case -447799407:
                    i18 = i18;
                    if (C1128.f4106 > 0) {
                        i = i10;
                        iM2566 = (C0630.m2566("ۜۛ") ^ i14) * (-17);
                        i2 = ((iM2566 ^ i15) * (-11103)) ^ 130352329;
                        i3 = -288358018;
                        i13 = i18;
                        i17 = iM2566 ^ i3;
                        i16 = i2;
                        i10 = i;
                    } else {
                        iM2567 = (i15 - C0630.m2566("ܳ۬")) * (-105);
                        i5 = ((iM2567 ^ i14) * 12739) ^ (-555976699);
                        i6 = -781697476;
                        int i19 = i18;
                        i17 = iM2567 ^ i6;
                        i16 = i5;
                        i13 = i19;
                    }
                    break;
                case -1439532893:
                case 439794517:
                    i = i10;
                    i18 = i18;
                    sArr2 = f23320;
                    i11 = 1;
                    if (C0050.f910 >= 0) {
                        iM2566 = (C2105.m6981("ۧ᩵") ^ i15) * 9;
                        i2 = ((iM2566 ^ i14) * 10105) ^ (-1592734612);
                        i3 = 1595739259;
                    } else {
                        iM2566 = C2105.m6981("᩷۠") ^ i14;
                        i2 = ((iM2566 ^ i15) * 1811) ^ 764204394;
                        i3 = -2113460578;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case -1246326522:
                case 1468611648:
                    i18 = i18;
                    strM7159 = C2167.m7159(sArr2, i11, i12, i10);
                    if (C7106.f21815 != 0) {
                        i = i10;
                        iM2566 = (C2105.m6981("ۧ᩵") ^ i15) * 9;
                        i2 = ((iM2566 ^ i14) * 10105) ^ (-1592734612);
                        i3 = 1595739259;
                    } else {
                        iM2566 = C0630.m2566("ܿᩳ") ^ i14;
                        i = i10;
                        i2 = ((iM2566 ^ i15) * 18481) ^ 1412046291;
                        i3 = 922916325;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case -1176791296:
                case 1450041062:
                    i18 = i18;
                    C0483.m2121();
                    iM2567 = (i15 - C0630.m2566("ܳ۬")) * (-105);
                    i5 = ((iM2567 ^ i14) * 12739) ^ (-555976699);
                    i6 = -781697476;
                    int i110 = i18;
                    i17 = iM2567 ^ i6;
                    i16 = i5;
                    i13 = i110;
                    break;
                case -1038044058:
                case 310530081:
                    m20267(abstractActivityC3346, C2105.m6981(strM7159) ^ 2129173143);
                    break;
                case -392648180:
                case 933373723:
                    i = i10;
                    i18 = i18;
                    i7 = s + s2;
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C2105.m6981("ۧ᩵") ^ i15) * 9;
                        i2 = ((iM2566 ^ i14) * 10105) ^ (-1592734612);
                        i3 = 1595739259;
                    } else {
                        iM2566 = (i15 - C2105.m6981("ۙܿ")) * 33;
                        i2 = ((iM2566 ^ i14) * (-32121)) ^ (-770581889);
                        i3 = 257352447;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case -295757438:
                case 1116000111:
                    if (C1294.m4372() <= 0) {
                        i18 = i18;
                        iM2567 = (i15 - C0630.m2566("ܳ۬")) * (-105);
                        i5 = ((iM2567 ^ i14) * 12739) ^ (-555976699);
                        i6 = -781697476;
                    } else {
                        iM2567 = C0630.m2566("᩹᩹") ^ i15;
                        i18 = i18;
                        i5 = ((iM2567 ^ i14) * (-31427)) ^ (-1733474543);
                        i6 = 142307558;
                    }
                    int i111 = i18;
                    i17 = iM2567 ^ i6;
                    i16 = i5;
                    i13 = i111;
                    break;
                case -203917477:
                case 1801957243:
                    i = i10;
                    i18 = i18;
                    sArr = f23320;
                    if (C0237.f1507 != 0) {
                        iM2566 = (C2105.m6981("ۧ᩵") ^ i15) * 9;
                        i2 = ((iM2566 ^ i14) * 10105) ^ (-1592734612);
                        i3 = 1595739259;
                    } else {
                        iM2566 = (C2105.m6981("ۜܶ") + i14) * 37;
                        i2 = ((iM2566 ^ i15) * (-21979)) ^ 882062135;
                        i3 = -1693207423;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case -200393627:
                case 1847802428:
                    i4 = 26442;
                    iM2566 = (C2105.m6981("ۛ᩻") ^ i14) * 47;
                    i = i4;
                    i2 = ((iM2566 ^ i15) * (-25053)) ^ (-1527880324);
                    i3 = 460418540;
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case 166420090:
                case 2025388784:
                    if (!C1005.f3721) {
                        i = i10;
                        i18 = i18;
                        iM2566 = C0630.m2566("ۛ֫") ^ i14;
                        i2 = ((iM2566 ^ i15) * (-731)) ^ (-1754192803);
                        i3 = -1213804600;
                        i13 = i18;
                        i17 = iM2566 ^ i3;
                        i16 = i2;
                        i10 = i;
                    } else {
                        iM2567 = C0630.m2566("᩹᩹") ^ i15;
                        i18 = i18;
                        i5 = ((iM2567 ^ i14) * (-31427)) ^ (-1733474543);
                        i6 = 142307558;
                        int i112 = i18;
                        i17 = iM2567 ^ i6;
                        i16 = i5;
                        i13 = i112;
                    }
                    break;
                case 703329077:
                case 1944494165:
                    i4 = 62681;
                    iM2566 = (C2105.m6981("ۛ᩻") ^ i14) * 47;
                    i = i4;
                    i2 = ((iM2566 ^ i15) * (-25053)) ^ (-1527880324);
                    i3 = 460418540;
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case 844172801:
                case 1999030080:
                    i = i10;
                    i18 = i18;
                    i12 = 3;
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("ۧ᩵") ^ i15) * 9;
                        i2 = ((iM2566 ^ i14) * 10105) ^ (-1592734612);
                        i3 = 1595739259;
                    } else {
                        iM2566 = (C2105.m6981("֨ܺ") ^ i15) * 85;
                        i2 = ((iM2566 ^ i14) * (-13647)) ^ (-374813224);
                        i3 = -1795411159;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case 1167159787:
                case 1862884731:
                    i = i10;
                    i18 = i18;
                    if (C0382.m1848()) {
                        iM2566 = C0630.m2566("ۛ֫") ^ i14;
                        i2 = ((iM2566 ^ i15) * (-731)) ^ (-1754192803);
                        i3 = -1213804600;
                    } else {
                        iM2566 = C0630.m2566("ۚ֨") ^ i15;
                        i2 = ((iM2566 ^ i14) * (-9077)) ^ (-2107371526);
                        i3 = 519015682;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case 1460448070:
                case 1950690037:
                    i = i10;
                    i18 = i18;
                    if (i8 - (i9 + 1) >= 0) {
                        iM2566 = (i14 - C0630.m2566("ܰܽ")) * 59;
                        i2 = ((iM2566 ^ i15) * (-25343)) ^ 1645544441;
                        i3 = 221641627;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۧ") + i15) * 53;
                        i2 = ((iM2566 ^ i14) * (-22381)) ^ 585979636;
                        i3 = 1933035796;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                case 1882908830:
                case 2022657305:
                    i = i10;
                    i18 = i18;
                    s = sArr[c];
                    s2 = 1;
                    if (C0483.m2121()) {
                        iM2566 = (i14 - C0630.m2566("ܽ۟")) * 21;
                        i2 = ((iM2566 ^ i15) * 15517) ^ (-1346347359);
                        i3 = 745198306;
                    } else {
                        iM2566 = (C2105.m6981("ۧ᩵") ^ i15) * 9;
                        i2 = ((iM2566 ^ i14) * 10105) ^ (-1592734612);
                        i3 = 1595739259;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
                default:
                    i = i10;
                    i18 = i18;
                    c = 0;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C2105.m6981("ۧ᩵") ^ i15) * 9;
                        i2 = ((iM2566 ^ i14) * 10105) ^ (-1592734612);
                        i3 = 1595739259;
                    } else {
                        iM2566 = C0630.m2566("᩵۠") ^ i15;
                        i2 = ((iM2566 ^ i14) * 17397) ^ 181026240;
                        i3 = -1659964478;
                    }
                    i13 = i18;
                    i17 = iM2566 ^ i3;
                    i16 = i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20267(AbstractActivityC3346 abstractActivityC3346, int i) {
        int i2 = -1709293836;
        int i3 = C7811.f24123;
        int i4 = C3245.f10203;
        int iM2566 = C0630.m2566("ۧ᩸") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-24123)) ^ (-642091862);
        int i6 = -1621336432;
        while (true) {
            i2 = ((((i2 ^ i4) * 23247) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -1952992033:
                case -1246312380:
                    if (C3683.m11222()) {
                        iM2566 = (C2105.m6981("᩺ۙ") + i3) * (-83);
                        i5 = ((iM2566 ^ i4) * (-17887)) ^ (-17964037);
                        i6 = -721161508;
                    } else {
                        iM2566 = (C2105.m6981("ܽ֨") + i4) * (-73);
                        i5 = ((iM2566 ^ i3) * (-13643)) ^ (-1289513955);
                        i6 = 1513446797;
                    }
                    break;
                case -1765932910:
                case 1754665269:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * 27863) ^ 577109492;
                        i6 = -1990124718;
                    } else {
                        iM2566 = C0630.m2566("۟ۗ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-15523)) ^ 1124810415;
                        i6 = 1098646433;
                    }
                    break;
                case -1730132046:
                case 1613057423:
                    C1773.m5908();
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i4 - C2105.m6981("᩸֡")) * (-119);
                        i5 = ((iM2566 ^ i3) * (-26417)) ^ 71755465;
                        i6 = 423359747;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * 27863) ^ 577109492;
                        i6 = -1990124718;
                    }
                    break;
                case -1312189503:
                case -219884591:
                    C0483.m2121();
                    C3746.m11369();
                    iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                    i5 = ((iM2566 ^ i4) * 27863) ^ 577109492;
                    i6 = -1990124718;
                    break;
                case -606529073:
                case 1378590334:
                    if (C11340.m28031()) {
                        iM2566 = (C2105.m6981("ܰܿ") ^ i4) * (-65);
                        i5 = ((iM2566 ^ i3) * 23771) ^ 919120086;
                        i6 = 325628572;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۙ") + i3) * (-83);
                        i5 = ((iM2566 ^ i4) * (-17887)) ^ (-17964037);
                        i6 = -721161508;
                    }
                    break;
                case -500431436:
                case 1164050029:
                    C3432.m10477();
                    if (!C3663.f11553) {
                        iM2566 = (i4 - C0630.m2566("۠۠")) * (-77);
                        i5 = ((iM2566 ^ i3) * 17799) ^ 1985707273;
                        i6 = -401843512;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * 27863) ^ 577109492;
                        i6 = -1990124718;
                    }
                    break;
                case -487949323:
                case 1607014037:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * 27863) ^ 577109492;
                        i6 = -1990124718;
                    } else {
                        iM2566 = (C2105.m6981("᩸ۛ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2566 ^ i3) * 21139) ^ (-915328480);
                        i6 = 1380817268;
                    }
                    break;
                case -259252930:
                case 1366478634:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i4 - C0630.m2566("۠۠")) * (-77);
                        i5 = ((iM2566 ^ i3) * 17799) ^ 1985707273;
                        i6 = -401843512;
                    } else {
                        iM2566 = (C2105.m6981("ۤᩴ") ^ i4) * (-47);
                        i5 = ((iM2566 ^ i3) * (-25071)) ^ (-1706447918);
                        i6 = -492321943;
                    }
                    break;
                case 624380672:
                case 1238290032:
                    C1047.m3599();
                    if (C3683.m11222()) {
                        iM2566 = (C2105.m6981("۟ۛ") + i3) * (-83);
                        i5 = ((iM2566 ^ i4) * (-3825)) ^ 1533649457;
                        i6 = -10399130;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * 27863) ^ 577109492;
                        i6 = -1990124718;
                    }
                    break;
                case 701725676:
                case 1225642641:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C2105.m6981("᩺ۙ") + i3) * (-83);
                        i5 = ((iM2566 ^ i4) * (-17887)) ^ (-17964037);
                        i6 = -721161508;
                    } else {
                        iM2566 = (C2105.m6981("ۧᩳ") ^ i3) * (-9);
                        i5 = ((iM2566 ^ i4) * 31113) ^ 1901608588;
                        i6 = 1700214962;
                    }
                    break;
                case 783051686:
                case 2117949530:
                    if (C2105.f7037 != 0) {
                        iM2566 = (i4 - C2105.m6981("᩸֡")) * (-119);
                        i5 = ((iM2566 ^ i3) * (-26417)) ^ 71755465;
                        i6 = 423359747;
                    } else {
                        iM2566 = C0630.m2566("ۖᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-9851)) ^ (-1946960338);
                        i6 = 71754589;
                    }
                    break;
                case 949129330:
                case 1615772926:
                    C1294.m4372();
                    C0483.m2121();
                    break;
                case 1328689215:
                case 1896967352:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C2105.m6981("᩺ۙ") + i3) * (-83);
                        i5 = ((iM2566 ^ i4) * (-17887)) ^ (-17964037);
                        i6 = -721161508;
                    } else {
                        iM2566 = (C2105.m6981("ۘ۫") + i3) * 25;
                        i5 = ((iM2566 ^ i4) * 10773) ^ 857750570;
                        i6 = -2106404033;
                    }
                    break;
                case 1354219099:
                case 2002061111:
                    if (C2126.f7087) {
                        iM2566 = (i4 - C2105.m6981("᩸֡")) * (-119);
                        i5 = ((iM2566 ^ i3) * (-26417)) ^ 71755465;
                        i6 = 423359747;
                    } else {
                        iM2566 = C2105.m6981("ۙ۬") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-6613)) ^ 684195603;
                        i6 = -1261993015;
                    }
                    break;
                default:
                    if (C3019.f9544 < 0) {
                        C13136 c13136 = new C13136(abstractActivityC3346, i);
                        C3746.m11365(c13136);
                        this.f23322 = c13136;
                    }
                    iM2566 = (C2105.m6981("᩺ۙ") + i3) * (-83);
                    i5 = ((iM2566 ^ i4) * (-17887)) ^ (-17964037);
                    i6 = -721161508;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v73, types: [l.ۨܶۡ, l.ܳۡ֫] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20271(final AbstractActivityC3346 abstractActivityC3346, final C9170 c9170, final RunnableC4901 runnableC4901) {
        AbstractC7379 abstractC7379M23580 = 0;
        long j = 0;
        int i = 1628517384;
        int i2 = C0714.f2697;
        int i3 = C2520.f8000;
        int iM6981 = C2105.m6981("ܽۤ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-11135)) ^ 1545393752;
        int i5 = -422912194;
        while (true) {
            i = ((((i ^ i2) * (-28415)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2064245090:
                case -370799063:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16301) ^ (-408783148);
                        i5 = 406637643;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩶ᩴ")) * (-61);
                        i4 = ((iM6981 ^ i2) * 2815) ^ 1460675843;
                        i5 = 1891711520;
                    }
                    break;
                case -1935698414:
                case 1443463773:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C0630.m2566("۬ܽ") ^ i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-765)) ^ 987264034;
                        i5 = 685593972;
                    } else {
                        iM6981 = C2105.m6981("֡ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15437)) ^ 1724037507;
                        i5 = 257057663;
                    }
                    break;
                case -1818697979:
                case -1558572090:
                    C0050.m940();
                    C7811.m20844();
                    break;
                case -1667114530:
                case -770020817:
                    C0630.m2564();
                    if (C5695.f17556 < 0) {
                        iM6981 = (C0630.m2566("۬ܽ") ^ i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-765)) ^ 987264034;
                        i5 = 685593972;
                    } else {
                        iM6981 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16301) ^ (-408783148);
                        i5 = 406637643;
                    }
                    break;
                case -1643059094:
                case 1540949170:
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16301) ^ (-408783148);
                        i5 = 406637643;
                    } else {
                        iM6981 = (C2105.m6981("ۙܺ") + i3) * (-83);
                        i4 = ((iM6981 ^ i2) * 12523) ^ 1170249555;
                        i5 = -142421107;
                    }
                    break;
                case -1626418851:
                case -528176273:
                    C0237.m1487(this);
                    if (c9170.m23581()) {
                        iM6981 = C0630.m2566("۠ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6229)) ^ (-227142409);
                        i5 = 667593437;
                    } else {
                        iM6981 = C0630.m2566("ܳۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31861)) ^ (-1159157491);
                        i5 = 1068461575;
                    }
                    break;
                case -1536380734:
                case 1346830463:
                    ?? r6 = new InterfaceC17236() { // from class: l.ۨܶۡ
                        @Override // l.InterfaceC17236
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                            if (enumC22901 == EnumC22901.ON_DESTROY) {
                                this.f35161.m20273();
                            }
                        }
                    };
                    this.f23325 = r6;
                    abstractC7379M23580.mo19833(r6);
                    iM6981 = C0630.m2566("ᩴᩳ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 14969) ^ (-67244472);
                    i5 = -801923677;
                    break;
                case -1536266148:
                case -1450873660:
                    abstractC7379M23580 = c9170.m23580();
                    this.f23323 = abstractC7379M23580;
                    if (abstractC7379M23580 != 0) {
                        iM6981 = (C2105.m6981("ܳ֨") + i2) * (-87);
                        i4 = ((iM6981 ^ i3) * 31667) ^ 189264735;
                        i5 = -224961603;
                    } else {
                        iM6981 = C0630.m2566("ᩴᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14969) ^ (-67244472);
                        i5 = -801923677;
                    }
                    break;
                case -1274331043:
                case 1355636445:
                    break;
                case -1089113477:
                case 1835986989:
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16301) ^ (-408783148);
                        i5 = 406637643;
                    } else {
                        iM6981 = C2105.m6981("۬ܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-28643)) ^ 239166872;
                        i5 = 47206853;
                    }
                    break;
                case -1054316706:
                case 447625718:
                    C4925.m14309(j, new Runnable() { // from class: l.᩺ܶۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC7548 abstractC7548 = this.f74211;
                            if (abstractC7548.f23324 && c9170.m23581()) {
                                C13136 c13136 = new C13136(abstractActivityC3346, R.string.MT_Protector);
                                c13136.m31864();
                                abstractC7548.f23322 = c13136;
                                Runnable runnable = runnableC4901;
                                if (runnable != null) {
                                    runnable.run();
                                }
                            }
                        }
                    });
                    break;
                case -901300894:
                case -231804992:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("᩹ܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16881) ^ (-48046258);
                        i5 = 1505597853;
                    } else {
                        iM6981 = (C0630.m2566("֡ۚ") ^ i2) * 93;
                        i4 = ((iM6981 ^ i3) * (-22627)) ^ (-634158616);
                        i5 = 1578125298;
                    }
                    break;
                case -734505504:
                case -322254033:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("ܰܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15175)) ^ 1642004892;
                        i5 = 1884722076;
                    } else {
                        iM6981 = (C2105.m6981("۬ܳ") + i2) * 55;
                        i4 = ((iM6981 ^ i3) * 11883) ^ 910378213;
                        i5 = -1853733860;
                    }
                    break;
                case -606849521:
                case 1585433025:
                    this.f23324 = true;
                    j = 300;
                    if (C21923.m49329()) {
                        iM6981 = C2105.m6981("ܰܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15175)) ^ 1642004892;
                        i5 = 1884722076;
                    } else {
                        iM6981 = (C2105.m6981("ۚ۬") + i3) * 73;
                        i4 = ((iM6981 ^ i2) * (-19675)) ^ (-1739541121);
                        i5 = -929721440;
                    }
                    break;
                case -320672698:
                case 395513294:
                    if (C1504.m5179()) {
                        iM6981 = C2105.m6981("᩵ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20283) ^ 71451190;
                        i5 = 1735211113;
                    } else {
                        iM6981 = C2105.m6981("᩹ܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16881) ^ (-48046258);
                        i5 = 1505597853;
                    }
                    break;
                case 44828128:
                case 307034173:
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("ܰܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15175)) ^ 1642004892;
                        i5 = 1884722076;
                    } else {
                        iM6981 = (C0630.m2566("ܶ᩸") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6981 ^ i3) * (-9883)) ^ 911692767;
                        i5 = 1330709957;
                    }
                    break;
                case 501503264:
                case 1170045186:
                    C1504.m5179();
                    iM6981 = C0630.m2566("ۖܰ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 16301) ^ (-408783148);
                    i5 = 406637643;
                    break;
                case 705140934:
                case 1538806587:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("᩹ܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16881) ^ (-48046258);
                        i5 = 1505597853;
                    } else {
                        iM6981 = C0630.m2566("ۖܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16301) ^ (-408783148);
                        i5 = 406637643;
                    }
                    break;
                case 1321808508:
                case 2076583051:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("ܰܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15175)) ^ 1642004892;
                        i5 = 1884722076;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۛۖ")) * (-9);
                        i4 = ((iM6981 ^ i2) * (-3263)) ^ 1777026448;
                        i5 = -138936240;
                    }
                    break;
                default:
                    C0714.m2805();
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("᩹ܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16881) ^ (-48046258);
                        i5 = 1505597853;
                    } else {
                        iM6981 = C0630.m2566("ۤۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6319)) ^ (-1690013951);
                        i5 = -705194669;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0103, code lost:
    
        if (l.C1711.m5736() > 0) goto L13;
     */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20274() {
        int iM6981;
        int i;
        int i2;
        Exception exc;
        Runnable runnable;
        Exception exc2;
        int iM2566;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        final AbstractC7548 abstractC7548 = this;
        int i7 = C4263.f13799;
        int i8 = RunnableC3474.f10992;
        int iM2567 = (i7 - C0630.m2566("ۛ᩸")) * (-37);
        int i9 = ((iM2567 ^ i8) * 4167) ^ 1642379746;
        StackTraceElement[] stackTrace = null;
        int i10 = iM2567 ^ (-1695340127);
        Runnable runnable2 = null;
        Thread thread = null;
        StringBuilder sb = null;
        int length = 0;
        char c = 0;
        int length2 = 0;
        char c2 = 0;
        int i11 = -870115380;
        Exception exc3 = null;
        Throwable th = null;
        RuntimeException runtimeException = null;
        Throwable th2 = null;
        boolean zMo8740 = false;
        while (true) {
            i11 = i10 ^ (i9 & (((i11 ^ i8) * 30261) >> 31));
            switch (i11) {
                case -2026636021:
                case 1213279039:
                    mo1010();
                    return;
                case -1987026796:
                case 1693059337:
                    if (C0382.f1805) {
                        iM6981 = (C2105.m6981("֫۬") + i7) * 63;
                        i = ((iM6981 ^ i8) * (-25585)) ^ (-726637767);
                        i2 = 1571427095;
                    } else {
                        iM6981 = (C2105.m6981("֡ۜ") + i7) * 9;
                        i = ((iM6981 ^ i8) * (-25149)) ^ 256080844;
                        i2 = -1866767409;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1971381160:
                case 1967006939:
                    C0964.m3413();
                    C4159.m12565();
                    return;
                case -1767593792:
                case 900084131:
                    try {
                        thread = new Thread(runnable2);
                        stackTrace = new Exception().getStackTrace();
                        try {
                            sb = new StringBuilder();
                            length = stackTrace.length;
                            iM6981 = (C2105.m6981("ܳܶ") ^ i7) * 115;
                            i = ((iM6981 ^ i8) * (-17903)) ^ 1250975625;
                            i2 = -1779885088;
                            i10 = iM6981 ^ i2;
                            i9 = i;
                        } catch (RuntimeException e) {
                            runtimeException = e;
                            runnable = runnable2;
                            exc2 = exc3;
                            sb = null;
                            iM6982 = C0630.m2566("ܳۧ") ^ i8;
                            i5 = ((iM6982 ^ i7) * (-27973)) ^ 1559105298;
                            i6 = -1036046959;
                            int i12 = iM6982 ^ i6;
                            exc3 = exc2;
                            Runnable runnable3 = runnable;
                            i10 = i12;
                            i9 = i5;
                            runnable2 = runnable3;
                        }
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        runnable = runnable2;
                        exc2 = exc3;
                        thread = null;
                    }
                    break;
                case -1713202991:
                case -1546320344:
                    try {
                        abstractC7548.mo1007(runtimeException);
                        iM6981 = (C0630.m2566("ۢۤ") ^ i7) * 93;
                        i = ((iM6981 ^ i8) * 5489) ^ (-398528629);
                        i2 = 1301548221;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } catch (Throwable th3) {
                        int iM2568 = C0630.m2566("᩵ۘ") ^ i8;
                        i10 = iM2568 ^ (-1418332678);
                        th = th3;
                        i9 = ((iM2568 ^ i7) * 11751) ^ (-1682040953);
                    }
                    break;
                case -1672084203:
                case 946937147:
                    if (C7106.m19120() > 0) {
                        iM6981 = (C2105.m6981("֡ۜ") + i7) * 9;
                        i = ((iM6981 ^ i8) * (-25149)) ^ 256080844;
                        i2 = -1866767409;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        exc = exc3;
                        iM2566 = (C2105.m6981("᩶ۙ") ^ i8) * 13;
                        i3 = ((iM2566 ^ i7) * 26807) ^ 960423222;
                        i4 = -18532818;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    }
                    break;
                case -1576349325:
                case 367546606:
                    C0630.m2560(abstractC7548.f23321, runnable2);
                    iM6981 = (C0630.m2566("ۘܿ") ^ i7) * (-87);
                    i = ((iM6981 ^ i8) * 27649) ^ 622599374;
                    i2 = -1692685463;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1561518594:
                case 1245595029:
                    length2 = stackTrace.length;
                    iM6981 = (C2105.m6981("ۧۨ") + i7) * (-27);
                    i = ((iM6981 ^ i8) * (-12953)) ^ 1308169698;
                    i2 = 1325753936;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1545930706:
                case 1297756243:
                    thread.setName(C0422.m1959(sb));
                    C1005.m3499(thread);
                    iM6981 = (i7 - C2105.m6981("ۡۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM6981 ^ i8) * (-25931)) ^ (-1786672258);
                    i2 = 453890406;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1367735123:
                case 583545650:
                    mo1010();
                    return;
                case -1351480242:
                case 1276883466:
                    return;
                case -1330394409:
                case 1014168314:
                    if (C2520.f8000 >= 0) {
                        exc = exc3;
                        iM2566 = C0630.m2566("ۗ֡") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-15581)) ^ 97982166;
                        i4 = 1788659816;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    } else {
                        iM6981 = C2105.m6981("᩻ܰ") ^ i7;
                        i = ((iM6981 ^ i8) * 14225) ^ 966885822;
                        i2 = 204343302;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1241458557:
                case 1484816354:
                    C3746.m11367(sb, stackTrace[c]);
                    iM6981 = (i8 - C0630.m2566("ۖ᩶")) * 95;
                    i = ((iM6981 ^ i7) * (-11765)) ^ (-677072286);
                    i2 = -148586387;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1083113120:
                case 1606129567:
                    if (C1773.f6144 > 0) {
                        exc = exc3;
                        iM2566 = C2105.m6981("᩶۬") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-23927)) ^ 855344008;
                        i4 = -1636255079;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    }
                    exc = exc3;
                    iM2566 = C0630.m2566("ۗ᩺") ^ i8;
                    i3 = ((iM2566 ^ i7) * (-8337)) ^ 1306700313;
                    i4 = 349439989;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    exc3 = exc;
                    runnable2 = null;
                    break;
                case -895745196:
                case 507849529:
                    mo1010();
                    throw th;
                case -756252961:
                case 892681053:
                    c2 = 2;
                    if (length2 > 2) {
                        iM6981 = C2105.m6981("۬۫") ^ i8;
                        i = ((iM6981 ^ i7) * 19167) ^ 472316443;
                        i2 = 1699859208;
                    } else {
                        iM6981 = (C0630.m2566("ᩳۧ") ^ i7) * (-91);
                        i = ((iM6981 ^ i8) * (-26997)) ^ (-1031143754);
                        i2 = 795465023;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -614845631:
                case -7255038:
                    C0237.m1481();
                    if (C3019.f9544 >= 0) {
                        exc = exc3;
                        iM2566 = (i8 - C0630.m2566("ܰ᩸")) * 99;
                        i3 = ((iM2566 ^ i7) * 16879) ^ 872090730;
                        i4 = -576931991;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۖۘ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6981 ^ i8) * 13449) ^ 1379104738;
                        i2 = -1880881984;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    }
                    break;
                case -516476327:
                case 1149045756:
                    mo1010();
                    throw th2;
                case -503719750:
                case -186236132:
                    runnable = runnable2;
                    exc2 = exc3;
                    try {
                        zMo8740 = mo8740();
                        iM6982 = C2105.m6981("۠۠") ^ i7;
                        i5 = ((iM6982 ^ i8) * 10863) ^ 2114825827;
                        i6 = 922761612;
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                        iM6982 = C0630.m2566("ܳۧ") ^ i8;
                        i5 = ((iM6982 ^ i7) * (-27973)) ^ 1559105298;
                        i6 = -1036046959;
                    }
                    int i13 = iM6982 ^ i6;
                    exc3 = exc2;
                    Runnable runnable4 = runnable;
                    i10 = i13;
                    i9 = i5;
                    runnable2 = runnable4;
                    break;
                case -395976328:
                case -289507389:
                    exc = exc3;
                    if (C1294.f4556 < 0) {
                        if (!C1711.f5919) {
                            if (C2126.f7087) {
                                iM2566 = (i8 - C0630.m2566("ܰ᩸")) * 99;
                                i3 = ((iM2566 ^ i7) * 16879) ^ 872090730;
                                i4 = -576931991;
                            } else if (C0630.f2410 > 0) {
                                if (C2105.m6982() != 0) {
                                    iM2566 = C2105.m6981("᩶۬") ^ i8;
                                    i3 = ((iM2566 ^ i7) * (-23927)) ^ 855344008;
                                    i4 = -1636255079;
                                } else if (ViewOnClickListenerC1958.f6529 > 0) {
                                    if (C2167.f7158 >= 0) {
                                        iM2566 = C0630.m2566("ۗ᩺") ^ i8;
                                        i3 = ((iM2566 ^ i7) * (-8337)) ^ 1306700313;
                                        i4 = 349439989;
                                    } else if (C3683.f11629 < 0) {
                                        if (C3432.f10845 < 0) {
                                            if (C7106.f21815 == 0) {
                                                runnable2 = new Runnable() { // from class: l.۫ܶۡ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        final AbstractC7548 abstractC7549 = this.f37518;
                                                        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C4925.m14335().getSystemService("power")).newWakeLock(1, C4925.m14337().concat(":AsyncTask"));
                                                        wakeLockNewWakeLock.acquire();
                                                        try {
                                                            try {
                                                                try {
                                                                    abstractC7549.mo1009();
                                                                    if (wakeLockNewWakeLock.isHeld()) {
                                                                        wakeLockNewWakeLock.release();
                                                                    }
                                                                    C4925.m14315(new Runnable() { // from class: l.ۤܶۡ
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            AbstractC7548 abstractC75410 = abstractC7549;
                                                                            abstractC75410.getClass();
                                                                            try {
                                                                                try {
                                                                                    abstractC75410.mo1006();
                                                                                    abstractC75410.mo1010();
                                                                                } catch (Throwable th4) {
                                                                                    abstractC75410.mo1010();
                                                                                    throw th4;
                                                                                }
                                                                            } catch (Exception e4) {
                                                                                abstractC75410.mo1007(e4);
                                                                                abstractC75410.mo1010();
                                                                            } catch (OutOfMemoryError e5) {
                                                                                abstractC75410.mo1007(new Exception(C4925.m14327(R.string.MT_Protector), e5));
                                                                                abstractC75410.mo1010();
                                                                            } catch (Throwable th5) {
                                                                                abstractC75410.mo1007(new Exception(th5));
                                                                                abstractC75410.mo1010();
                                                                            }
                                                                        }
                                                                    });
                                                                } catch (Exception e4) {
                                                                    C4925.m14315(new Runnable() { // from class: l.ܰܶۡ
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            Exception exc4 = e4;
                                                                            AbstractC7548 abstractC75410 = abstractC7549;
                                                                            abstractC75410.getClass();
                                                                            try {
                                                                                abstractC75410.mo1007(exc4);
                                                                            } finally {
                                                                                abstractC75410.mo1010();
                                                                            }
                                                                        }
                                                                    });
                                                                    if (!wakeLockNewWakeLock.isHeld()) {
                                                                        return;
                                                                    }
                                                                    wakeLockNewWakeLock.release();
                                                                }
                                                            } catch (OutOfMemoryError e5) {
                                                                final Exception exc4 = new Exception(C4925.m14327(R.string.MT_Protector), e5);
                                                                C4925.m14315(new Runnable() { // from class: l.ܰܶۡ
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        Exception exc5 = exc4;
                                                                        AbstractC7548 abstractC75410 = abstractC7549;
                                                                        abstractC75410.getClass();
                                                                        try {
                                                                            abstractC75410.mo1007(exc5);
                                                                        } finally {
                                                                            abstractC75410.mo1010();
                                                                        }
                                                                    }
                                                                });
                                                                if (!wakeLockNewWakeLock.isHeld()) {
                                                                    return;
                                                                }
                                                                wakeLockNewWakeLock.release();
                                                            } catch (Throwable th4) {
                                                                final Exception exc5 = new Exception(th4);
                                                                C4925.m14315(new Runnable() { // from class: l.ܰܶۡ
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        Exception exc6 = exc5;
                                                                        AbstractC7548 abstractC75410 = abstractC7549;
                                                                        abstractC75410.getClass();
                                                                        try {
                                                                            abstractC75410.mo1007(exc6);
                                                                        } finally {
                                                                            abstractC75410.mo1010();
                                                                        }
                                                                    }
                                                                });
                                                                if (!wakeLockNewWakeLock.isHeld()) {
                                                                    return;
                                                                }
                                                                wakeLockNewWakeLock.release();
                                                            }
                                                        } catch (Throwable th5) {
                                                            if (wakeLockNewWakeLock.isHeld()) {
                                                                wakeLockNewWakeLock.release();
                                                            }
                                                            throw th5;
                                                        }
                                                    }
                                                };
                                                int iM2569 = C0630.m2566("ۨᩳ") ^ i7;
                                                i10 = iM2569 ^ (-710606567);
                                                i9 = ((iM2569 ^ i8) * (-23411)) ^ (-754214896);
                                                exc3 = exc;
                                                abstractC7548 = this;
                                            } else {
                                                iM2566 = (i7 - C0630.m2566("֫ᩳ")) * (-63);
                                                i3 = ((iM2566 ^ i8) * 19655) ^ 386976230;
                                                i4 = 2036962825;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            i10 = iM2566 ^ i4;
                            i9 = i3;
                            exc3 = exc;
                            runnable2 = null;
                            break;
                        }
                        iM2566 = (C2105.m6981("᩶ۙ") ^ i8) * 13;
                        i3 = ((iM2566 ^ i7) * 26807) ^ 960423222;
                        i4 = -18532818;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                        break;
                    }
                    iM2566 = C0630.m2566("ۗ֡") ^ i8;
                    i3 = ((iM2566 ^ i7) * (-15581)) ^ 97982166;
                    i4 = 1788659816;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    exc3 = exc;
                    runnable2 = null;
                    break;
                case -210030918:
                case 1207480660:
                    ServiceConnectionC3453.m10564();
                    break;
                case -198984088:
                case 1259492918:
                    Runnable runnable5 = runnable2;
                    Exception exc4 = exc3;
                    try {
                        mo1008();
                        int iM25610 = (C0630.m2566("ܰۡ") + i8) * (-9);
                        exc3 = exc4;
                        runnable2 = runnable5;
                        i10 = iM25610 ^ 1611187825;
                        i9 = ((iM25610 ^ i7) * 3313) ^ (-254052799);
                    } catch (Exception e4) {
                        int iM25611 = (i8 - C0630.m2566("ۙۚ")) * (-91);
                        exc3 = e4;
                        i9 = ((iM25611 ^ i7) * (-22957)) ^ (-428060497);
                        runnable2 = runnable5;
                        i10 = iM25611 ^ 1676509053;
                    }
                    abstractC7548 = this;
                    break;
                case 15832166:
                case 458684773:
                    if (!C0714.m2805()) {
                        iM6981 = (i7 - C2105.m6981("ۖۘ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6981 ^ i8) * 13449) ^ 1379104738;
                        i2 = -1880881984;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        exc = exc3;
                        iM2566 = (C2105.m6981("᩶ۙ") ^ i8) * 13;
                        i3 = ((iM2566 ^ i7) * 26807) ^ 960423222;
                        i4 = -18532818;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    }
                    break;
                case 79420378:
                case 1323558151:
                    try {
                        C0630.m2567(sb, ' ');
                        C3746.m11367(sb, stackTrace[c2]);
                        iM6981 = (C0630.m2566("ᩳۧ") ^ i7) * (-91);
                        i = ((iM6981 ^ i8) * (-26997)) ^ (-1031143754);
                        i2 = 795465023;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } catch (RuntimeException e5) {
                        runtimeException = e5;
                        runnable = runnable2;
                        exc2 = exc3;
                        iM6982 = C0630.m2566("ܳۧ") ^ i8;
                        i5 = ((iM6982 ^ i7) * (-27973)) ^ 1559105298;
                        i6 = -1036046959;
                        int i14 = iM6982 ^ i6;
                        exc3 = exc2;
                        Runnable runnable6 = runnable;
                        i10 = i14;
                        i9 = i5;
                        runnable2 = runnable6;
                    }
                    break;
                case 100971288:
                case 1454927708:
                    C0382.m1848();
                    exc = exc3;
                    iM2566 = C0630.m2566("ۗ᩺") ^ i8;
                    i3 = ((iM2566 ^ i7) * (-8337)) ^ 1306700313;
                    i4 = 349439989;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    exc3 = exc;
                    runnable2 = null;
                    break;
                case 192339055:
                case 1173872852:
                    C4075.m12263();
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("᩻ܰ") ^ i7;
                        i = ((iM6981 ^ i8) * 14225) ^ 966885822;
                        i2 = 204343302;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        exc = exc3;
                        iM2566 = (C2105.m6981("᩶ۙ") ^ i8) * 13;
                        i3 = ((iM2566 ^ i7) * 26807) ^ 960423222;
                        i4 = -18532818;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    }
                    break;
                case 274203985:
                case 1419183620:
                    c = 1;
                    if (length > 1) {
                        iM6981 = C2105.m6981("ۨ᩷") ^ i8;
                        i = ((iM6981 ^ i7) * 29675) ^ (-1750842289);
                        i2 = 963265216;
                    } else {
                        iM6981 = (i8 - C0630.m2566("ۖ᩶")) * 95;
                        i = ((iM6981 ^ i7) * (-11765)) ^ (-677072286);
                        i2 = -148586387;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 1202087397:
                case 1652507663:
                    return;
                case 1285691026:
                case 1379645249:
                    exc2 = exc3;
                    try {
                        abstractC7548.mo1007(exc2);
                        iM6982 = C2105.m6981("ۘ᩶") ^ i8;
                        runnable = runnable2;
                        i5 = ((iM6982 ^ i7) * 11527) ^ (-613207518);
                        i6 = -812636258;
                        int i15 = iM6982 ^ i6;
                        exc3 = exc2;
                        Runnable runnable7 = runnable;
                        i10 = i15;
                        i9 = i5;
                        runnable2 = runnable7;
                    } catch (Throwable th4) {
                        Runnable runnable8 = runnable2;
                        int iM25612 = (C0630.m2566("ܶۧ") + i7) * 31;
                        exc3 = exc2;
                        th2 = th4;
                        i9 = ((iM25612 ^ i8) * (-5027)) ^ (-454998809);
                        i10 = iM25612 ^ 322562171;
                        runnable2 = runnable8;
                    }
                    break;
                default:
                    if (zMo8740) {
                        iM6981 = C2105.m6981("۫ܿ") ^ i8;
                        i = ((iM6981 ^ i7) * 30111) ^ 659714828;
                        i2 = -145835815;
                    } else {
                        iM6981 = C0630.m2566("ܶ᩵") ^ i7;
                        i = ((iM6981 ^ i8) * 1317) ^ 1174873407;
                        i2 = -1772748380;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x023f A[PHI: r1 r16
      0x023f: PHI (r1v4 short[]) = (r1v2 short[]), (r1v2 short[]), (r1v3 short[]), (r1v2 short[]) binds: [B:61:0x023d, B:52:0x01d8, B:48:0x01b5, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r16v14 int) = (r16v2 int), (r16v4 int), (r16v5 int), (r16v15 int) binds: [B:61:0x023d, B:52:0x01d8, B:48:0x01b5, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02b2 A[PHI: r3 r4 r6 r7 r8 r16
      0x02b2: PHI (r3v6 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:69:0x02b0, B:40:0x0166, B:11:0x0044, B:29:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r4v6 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:69:0x02b0, B:40:0x0166, B:11:0x0044, B:29:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r6v5 short[]) = (r6v2 short[]), (r6v2 short[]), (r6v2 short[]), (r6v7 short[]) binds: [B:69:0x02b0, B:40:0x0166, B:11:0x0044, B:29:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v7 int) binds: [B:69:0x02b0, B:40:0x0166, B:11:0x0044, B:29:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r8v5 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v7 int) binds: [B:69:0x02b0, B:40:0x0166, B:11:0x0044, B:29:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r16v21 int) = (r16v0 int), (r16v8 int), (r16v18 int), (r16v22 int) binds: [B:69:0x02b0, B:40:0x0166, B:11:0x0044, B:29:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20272(AbstractActivityC3346 abstractActivityC3346, int i) {
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM2566;
        int iM2567;
        int i5;
        int i6;
        int i7 = 0;
        short[] sArr = null;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 632174369;
        int i14 = C0630.f2410;
        int i15 = C4263.f13799;
        int iM6982 = C2105.m6981("ۘۧ") ^ i15;
        int i16 = ((iM6982 ^ i14) * 17071) ^ (-924806425);
        int i17 = 2088930707;
        while (true) {
            int i18 = iM6982 ^ i17;
            while (true) {
                i13 = ((((i13 ^ i14) * (-7589)) >> 31) & i16) ^ i18;
                switch (i13) {
                    case -2029512343:
                    case -758317023:
                        i2 = i7;
                        if (C1294.f4556 >= 0) {
                            iM6981 = (i15 - C0630.m2566("۠֫")) * (-39);
                            i3 = ((iM6981 ^ i14) * (-18817)) ^ 2135885640;
                            i4 = -869648245;
                        } else {
                            iM6981 = (i14 - C0630.m2566("ۜ۬")) * 79;
                            i3 = ((iM6981 ^ i15) * 28411) ^ (-730558723);
                            i4 = 1631296366;
                        }
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case -2022738060:
                    case 563543407:
                        ViewOnClickListenerC1958.m6429();
                        C2105.m6982();
                        i2 = i7;
                        iM6981 = (C0630.m2566("۫۫") ^ i14) * 15;
                        i3 = ((iM6981 ^ i15) * 19117) ^ 1592459833;
                        i4 = -2066798386;
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case -1653764540:
                    case -825708209:
                        i2 = i7;
                        if (C5695.m16023() < 0) {
                            iM6981 = (C0630.m2566("᩸ۗ") + i15) * (-125);
                            i3 = ((iM6981 ^ i14) * (-31483)) ^ (-1186585689);
                            i4 = 498277449;
                            i18 = iM6981 ^ i4;
                            i16 = i3;
                            i7 = i2;
                        }
                        iM2566 = i2;
                        iM2567 = (i15 - C2105.m6981("ۨ᩻")) * 77;
                        i2 = iM2566;
                        i5 = ((iM2567 ^ i14) * 14767) ^ (-1909434369);
                        i6 = 1661457190;
                        i16 = i5;
                        i18 = iM2567 ^ i6;
                        i7 = i2;
                        break;
                    case -1489749240:
                    case 707215011:
                        i2 = i7;
                        s = sArr[4];
                        if (RunnableC1937.f6483 < 0) {
                            iM6981 = C0630.m2566("ܿۜ") ^ i15;
                            i3 = ((iM6981 ^ i14) * 3077) ^ 1020187013;
                            i4 = -756584602;
                            i18 = iM6981 ^ i4;
                            i16 = i3;
                            i7 = i2;
                        }
                        iM2566 = i2;
                        iM2567 = (i15 - C2105.m6981("ۨ᩻")) * 77;
                        i2 = iM2566;
                        i5 = ((iM2567 ^ i14) * 14767) ^ (-1909434369);
                        i6 = 1661457190;
                        i16 = i5;
                        i18 = iM2567 ^ i6;
                        i7 = i2;
                        break;
                    case -1392627336:
                    case 127260050:
                        i2 = i7;
                        if ((134676025 + i9) - i8 >= 0) {
                            iM6981 = C2105.m6981("ۧܳ") ^ i14;
                            i3 = ((iM6981 ^ i15) * 22679) ^ (-1935881381);
                            i4 = 144155645;
                        } else {
                            iM6981 = C0630.m2566("᩵ۖ") ^ i15;
                            i3 = ((iM6981 ^ i14) * 24673) ^ (-1760690334);
                            i4 = 1224739123;
                        }
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case -1301668123:
                    case -557063501:
                        sArr2 = f23320;
                        i12 = 3;
                        if (C1128.f4106 <= 0) {
                            i2 = i7;
                            i11 = 5;
                            iM6981 = C2105.m6981("ۛ֨") ^ i14;
                            i3 = ((iM6981 ^ i15) * (-22725)) ^ (-1374699470);
                            i4 = -2068929989;
                            i18 = iM6981 ^ i4;
                            i16 = i3;
                            i7 = i2;
                        } else {
                            int iM2568 = (C0630.m2566("֡֡") ^ i14) * (-7);
                            i16 = ((iM2568 ^ i15) * (-8039)) ^ (-183597854);
                            i18 = iM2568 ^ (-2077842488);
                            i11 = 5;
                        }
                        break;
                    case -1120778647:
                    case -506853361:
                        m20269(abstractActivityC3346, i7 ^ 2118274276, i, null);
                        break;
                    case -986719493:
                    case -901957794:
                        C0050.m940();
                        if (C1711.m5736() > 0) {
                        }
                        i2 = i7;
                        iM6981 = (C0630.m2566("۫۫") ^ i14) * 15;
                        i3 = ((iM6981 ^ i15) * 19117) ^ 1592459833;
                        i4 = -2066798386;
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case -828923688:
                    case 244117301:
                        i2 = i7;
                        sArr = f23320;
                        if (C4159.f13567) {
                            iM6981 = C2105.m6981("ۗ۬") ^ i14;
                            i3 = ((iM6981 ^ i15) * 14719) ^ 345224782;
                            i4 = -41677125;
                        } else {
                            iM6981 = (i15 - C0630.m2566("۠֫")) * (-39);
                            i3 = ((iM6981 ^ i14) * (-18817)) ^ 2135885640;
                            i4 = -869648245;
                        }
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case -733956683:
                    case 981745087:
                        i2 = i7;
                        if (C7811.f24123 >= 0) {
                            iM6981 = (C0630.m2566("۫۫") ^ i14) * 15;
                            i3 = ((iM6981 ^ i15) * 19117) ^ 1592459833;
                            i4 = -2066798386;
                        } else {
                            iM6981 = (C0630.m2566("ۢ֫") + i15) * 25;
                            i3 = ((iM6981 ^ i14) * (-20963)) ^ 1301386363;
                            i4 = -807900952;
                        }
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case -596125705:
                    case 1360145201:
                        if (C7811.m20844() == 0) {
                            i2 = i7;
                            iM6981 = C2105.m6981("ۛ֨") ^ i14;
                            i3 = ((iM6981 ^ i15) * (-22725)) ^ (-1374699470);
                            i4 = -2068929989;
                            i18 = iM6981 ^ i4;
                            i16 = i3;
                            i7 = i2;
                        }
                        i2 = i7;
                        iM6981 = (C0630.m2566("۫۫") ^ i14) * 15;
                        i3 = ((iM6981 ^ i15) * 19117) ^ 1592459833;
                        i4 = -2066798386;
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case -568420528:
                    case 176582419:
                        if (C2520.f8000 < 0) {
                            i2 = i7;
                            iM6981 = (i15 - C0630.m2566("۠֫")) * (-39);
                            i3 = ((iM6981 ^ i14) * (-18817)) ^ 2135885640;
                            i4 = -869648245;
                            i18 = iM6981 ^ i4;
                            i16 = i3;
                            i7 = i2;
                        }
                        break;
                    case -430114327:
                    case -423911117:
                        i2 = i7;
                        i8 = s * 23210;
                        i9 = s * s;
                        if (C1773.m5908() <= 0) {
                            iM6981 = C2105.m6981("ۛ֨") ^ i14;
                            i3 = ((iM6981 ^ i15) * (-22725)) ^ (-1374699470);
                            i4 = -2068929989;
                        } else {
                            iM6981 = (C2105.m6981("ۤ֨") ^ i14) * 27;
                            i3 = ((iM6981 ^ i15) * 17545) ^ 20013540;
                            i4 = 1013665102;
                        }
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case -307608713:
                    case 2103384858:
                        i10 = 32203;
                        iM2567 = (C0630.m2566("ۜ۫") + i15) * (-23);
                        i2 = i7;
                        i5 = ((iM2567 ^ i14) * (-24191)) ^ 1839576607;
                        i6 = -103903894;
                        i16 = i5;
                        i18 = iM2567 ^ i6;
                        i7 = i2;
                        break;
                    case 17507326:
                    case 600831474:
                        iM2566 = C0630.m2566(C4117.m12355(sArr2, i11, i12, i10));
                        if (C2167.m7155()) {
                            iM2567 = (i15 - C2105.m6981("ۨ᩻")) * 77;
                            i2 = iM2566;
                            i5 = ((iM2567 ^ i14) * 14767) ^ (-1909434369);
                            i6 = 1661457190;
                        } else {
                            iM2567 = (C0630.m2566("ᩳۜ") + i15) * (-41);
                            i2 = iM2566;
                            i5 = ((iM2567 ^ i14) * 25181) ^ 1535415451;
                            i6 = 562739214;
                        }
                        i16 = i5;
                        i18 = iM2567 ^ i6;
                        i7 = i2;
                        break;
                    case 304540772:
                    case 1893267036:
                        i2 = i7;
                        if (C3432.f10845 >= 0) {
                            iM6981 = (i15 - C0630.m2566("۠֫")) * (-39);
                            i3 = ((iM6981 ^ i14) * (-18817)) ^ 2135885640;
                            i4 = -869648245;
                        } else {
                            iM6981 = (i15 - C2105.m6981("ܽۛ")) * 5;
                            i3 = ((iM6981 ^ i14) * (-14081)) ^ 1957987009;
                            i4 = -882906806;
                        }
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case 851835420:
                    case 1222541236:
                        i2 = i7;
                        if (AbstractC2021.f6743 <= 0) {
                            iM6981 = C2105.m6981("ۛ֨") ^ i14;
                            i3 = ((iM6981 ^ i15) * (-22725)) ^ (-1374699470);
                            i4 = -2068929989;
                        } else {
                            iM6981 = C2105.m6981("᩶᩷") ^ i14;
                            i3 = ((iM6981 ^ i15) * (-11841)) ^ 609898907;
                            i4 = 1614257208;
                        }
                        i18 = iM6981 ^ i4;
                        i16 = i3;
                        i7 = i2;
                        break;
                    case 1209637154:
                    case 1378324887:
                        i10 = 40086;
                        iM2567 = (C0630.m2566("ۜ۫") + i15) * (-23);
                        i2 = i7;
                        i5 = ((iM2567 ^ i14) * (-24191)) ^ 1839576607;
                        i6 = -103903894;
                        i16 = i5;
                        i18 = iM2567 ^ i6;
                        i7 = i2;
                        break;
                    default:
                        C4263.m12819();
                        C0483.m2121();
                        break;
                }
                return;
            }
            iM6982 = (C0630.m2566("ۧۖ") ^ i14) * 75;
            i16 = ((iM6982 ^ i15) * 19883) ^ (-936514494);
            i17 = 384855639;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20269(final AbstractActivityC3346 abstractActivityC3346, final int i, int i2, final Runnable runnable) {
        boolean z = false;
        int i3 = 405204975;
        int i4 = RunnableC1937.f6483;
        int i5 = C22628.f73083;
        int iM6981 = C2105.m6981("ۚܽ") ^ i5;
        int i6 = ((iM6981 ^ i4) * (-14521)) ^ 2117530153;
        int i7 = 320138532;
        while (true) {
            i3 = ((((i3 ^ i4) * 13655) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -2132471800:
                case 780427459:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C0630.m2566("֡ۨ") + i4) * (-23);
                        i6 = ((iM6981 ^ i5) * (-7089)) ^ 764634109;
                        i7 = -785889756;
                    } else {
                        iM6981 = C2105.m6981("᩸ۗ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-241)) ^ 1312156523;
                        i7 = 2098319857;
                    }
                    break;
                case -2000750984:
                case 268273063:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("᩷᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21663)) ^ 192516788;
                        i7 = -1608138739;
                    } else {
                        iM6981 = (C2105.m6981("֨۟") ^ i5) * 97;
                        i6 = ((iM6981 ^ i4) * 22379) ^ 558525566;
                        i7 = 1765221637;
                    }
                    break;
                case -1782216692:
                case 1788287731:
                    C2520.m8026();
                    break;
                case -1717494389:
                case 1152081748:
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("᩷᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21663)) ^ 192516788;
                        i7 = -1608138739;
                    } else {
                        iM6981 = (C0630.m2566("ۡ᩺") + i5) * (-43);
                        i6 = ((iM6981 ^ i4) * (-22477)) ^ (-1314705127);
                        i7 = -600706289;
                    }
                    break;
                case -1478125665:
                case -1415963473:
                    if (C1916.m6308() >= 0) {
                        iM6981 = C2105.m6981("᩷᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21663)) ^ 192516788;
                        i7 = -1608138739;
                    } else {
                        iM6981 = (C2105.m6981("ۖ۟") + i4) * 61;
                        i6 = ((iM6981 ^ i5) * (-3637)) ^ (-1685587127);
                        i7 = 479624299;
                    }
                    break;
                case -1276266738:
                case 1245887772:
                    if (C0050.f910 < 0) {
                        iM6981 = (C0630.m2566("ۡܽ") ^ i4) * (-45);
                        i6 = ((iM6981 ^ i5) * (-24627)) ^ 228937131;
                        i7 = -1117672856;
                    } else {
                        iM6981 = C2105.m6981("᩷᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21663)) ^ 192516788;
                        i7 = -1608138739;
                    }
                    break;
                case -985298209:
                case -585178341:
                    z = true;
                    if (C0798.f2919) {
                        iM6981 = (C2105.m6981("ܰ֡") + i5) * 59;
                        i6 = ((iM6981 ^ i4) * 32013) ^ 688394216;
                        i7 = 1446096076;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩵ܳ")) * q.h;
                        i6 = ((iM6981 ^ i5) * 8749) ^ (-1966107406);
                        i7 = 241861111;
                    }
                    break;
                case -888138007:
                case -552193396:
                    if (C3683.f11629 >= 0) {
                        iM6981 = (C0630.m2566("֡ۨ") + i4) * (-23);
                        i6 = ((iM6981 ^ i5) * (-7089)) ^ 764634109;
                        i7 = -785889756;
                    } else {
                        iM6981 = (i5 - C0630.m2566("᩵ᩳ")) * 41;
                        i6 = ((iM6981 ^ i4) * 15431) ^ (-2018977003);
                        i7 = 1704004050;
                    }
                    break;
                case -428227702:
                case 1905528044:
                    C0714.m2805();
                    C0630.m2564();
                    iM6981 = C2105.m6981("᩷᩹") ^ i5;
                    i6 = ((iM6981 ^ i4) * (-21663)) ^ 192516788;
                    i7 = -1608138739;
                    break;
                case -319736444:
                case 982740517:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("᩷᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21663)) ^ 192516788;
                        i7 = -1608138739;
                    } else {
                        iM6981 = (C2105.m6981("۟ܽ") ^ i5) * 51;
                        i6 = ((iM6981 ^ i4) * (-16923)) ^ 1587122545;
                        i7 = 402556584;
                    }
                    break;
                case -292637306:
                case 1035374736:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C0630.m2566("֡ۨ") + i4) * (-23);
                        i6 = ((iM6981 ^ i5) * (-7089)) ^ 764634109;
                        i7 = -785889756;
                    } else {
                        iM6981 = (C0630.m2566("ۡܽ") ^ i4) * (-45);
                        i6 = ((iM6981 ^ i5) * (-24627)) ^ 228937131;
                        i7 = -1117672856;
                    }
                    break;
                case 24343173:
                case 40969553:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("᩷᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-21663)) ^ 192516788;
                        i7 = -1608138739;
                    } else {
                        iM6981 = (C0630.m2566("ۧۛ") + i4) * (-83);
                        i6 = ((iM6981 ^ i5) * 16063) ^ (-1487266396);
                        i7 = -159624206;
                    }
                    break;
                case 599184171:
                case 653733988:
                    if (C0798.f2919) {
                        iM6981 = (C2105.m6981("۫ᩳ") + i5) * (-127);
                        i6 = ((iM6981 ^ i4) * 23101) ^ (-894762993);
                        i7 = 162180951;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ᩳܿ")) * (-99);
                        i6 = ((iM6981 ^ i5) * (-1157)) ^ (-1393201078);
                        i7 = -1197125281;
                    }
                    break;
                case 780518809:
                case 1600965396:
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("֡ۨ") + i4) * (-23);
                        i6 = ((iM6981 ^ i5) * (-7089)) ^ 764634109;
                        i7 = -785889756;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 19533) ^ (-473914038);
                        i7 = 975072740;
                    }
                    break;
                case 895410397:
                case 1466176294:
                    C1128.m3851();
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("۫ᩳ") + i5) * (-127);
                        i6 = ((iM6981 ^ i4) * 23101) ^ (-894762993);
                        i7 = 162180951;
                    } else {
                        iM6981 = (C0630.m2566("ۡܽ") ^ i4) * (-45);
                        i6 = ((iM6981 ^ i5) * (-24627)) ^ 228937131;
                        i7 = -1117672856;
                    }
                    break;
                default:
                    this.f23324 = z;
                    C4925.m14309(i2, new Runnable() { // from class: l.ۛܶۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC7548 abstractC7548 = this.f18910;
                            if (abstractC7548.f23324) {
                                C13136 c13136 = new C13136(abstractActivityC3346, i);
                                c13136.m31864();
                                abstractC7548.f23322 = c13136;
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        }
                    });
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.۟ۢ֫, l.ۨܶۡ, l.۬۬ܿ] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20273() {
        boolean z = false;
        AbstractC7379 abstractC7379 = null;
        ?? r2 = 0;
        C13136 c13136 = null;
        int i = -1332803908;
        int i2 = C4616.f14690;
        int i3 = AbstractC2021.f6743;
        int iM6981 = C2105.m6981("᩵᩹") ^ i2;
        int i4 = ((iM6981 ^ i3) * 26459) ^ 2129491180;
        int i5 = 684335536;
        while (true) {
            i = ((((i ^ i3) * 25741) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1863493606:
                case 1110181910:
                    abstractC7379.mo19834(this.f23325);
                    if (C1420.m4913()) {
                        iM6981 = C2105.m6981("ۜ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27487) ^ 280337685;
                        i5 = -1271974071;
                    } else {
                        iM6981 = C2105.m6981("ܺ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 523) ^ (-623012866);
                        i5 = -85198354;
                    }
                    break;
                case -1835781622:
                case 1772163679:
                    C4117.m12364();
                    break;
                case -1832712057:
                case -135034208:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("ۘ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22309) ^ 1916561619;
                        i5 = -1044972655;
                    } else {
                        iM6981 = (C2105.m6981("۟۟") + i3) * (-125);
                        i4 = ((iM6981 ^ i2) * (-30385)) ^ (-1150604123);
                        i5 = 1732166365;
                    }
                    break;
                case -1686648738:
                case 2127572797:
                    abstractC7379 = this.f23323;
                    r2 = 0;
                    r2 = 0;
                    if (abstractC7379 != null) {
                        iM6981 = (C2105.m6981("᩶᩻") ^ i3) * (-79);
                        i4 = ((iM6981 ^ i2) * (-11041)) ^ (-380324970);
                        i5 = 61952880;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۠᩶")) * (-75);
                        i4 = ((iM6981 ^ i3) * 31327) ^ (-1724108139);
                        i5 = -489007654;
                    }
                    break;
                case -1554090133:
                case 778744838:
                    if (C2958.m9034() > 0) {
                        iM6981 = C0630.m2566("ܿ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27217)) ^ (-705187714);
                        i5 = 1977506795;
                    } else {
                        iM6981 = C2105.m6981("ۜ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27487) ^ 280337685;
                        i5 = -1271974071;
                    }
                    break;
                case -1342841391:
                case -418526258:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C0630.m2566("᩺۬") ^ i3) * (-71);
                        i4 = ((iM6981 ^ i2) * (-31815)) ^ (-1833775540);
                        i5 = 1437692162;
                    } else {
                        iM6981 = C0630.m2566("ܿ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27217)) ^ (-705187714);
                        i5 = 1977506795;
                    }
                    break;
                case -1325417241:
                case 1582815170:
                    if (C3683.m11222()) {
                        iM6981 = C0630.m2566("ܿ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27217)) ^ (-705187714);
                        i5 = 1977506795;
                    } else {
                        iM6981 = (C0630.m2566("ۚܺ") + i2) * (-125);
                        i4 = ((iM6981 ^ i3) * 14965) ^ 1345167730;
                        i5 = 1263897171;
                    }
                    break;
                case -1161680385:
                case -235776841:
                    if (C4159.m12565() >= 0) {
                        iM6981 = C2105.m6981("ۜ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27487) ^ 280337685;
                        i5 = -1271974071;
                    } else {
                        iM6981 = (C2105.m6981("۟ۡ") ^ i3) * (-3);
                        i4 = ((iM6981 ^ i2) * 22303) ^ (-751607376);
                        i5 = 1849732652;
                    }
                    break;
                case -1036979941:
                case 594818020:
                    C2105.m6982();
                    iM6981 = C2105.m6981("ۜ۟") ^ i2;
                    i4 = ((iM6981 ^ i3) * 27487) ^ 280337685;
                    i5 = -1271974071;
                    break;
                case -915254668:
                case 1019682230:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("᩺۬") ^ i3) * (-71);
                        i4 = ((iM6981 ^ i2) * (-31815)) ^ (-1833775540);
                        i5 = 1437692162;
                    } else {
                        iM6981 = C2105.m6981("᩺ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29123)) ^ 1852139404;
                        i5 = 2028941980;
                    }
                    break;
                case -831341442:
                case 1586328947:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("ۘ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22309) ^ 1916561619;
                        i5 = -1044972655;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩻۟")) * 91;
                        i4 = ((iM6981 ^ i2) * 24447) ^ (-1837708360);
                        i5 = -1021401320;
                    }
                    break;
                case -643894400:
                case -243803944:
                    if (C3432.m10477() <= 0) {
                        iM6981 = C0630.m2566("ܿ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27217)) ^ (-705187714);
                        i5 = 1977506795;
                    } else {
                        iM6981 = C2105.m6981("᩷۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26151) ^ 203583357;
                        i5 = -1266946798;
                    }
                    break;
                case -598687288:
                case -222331871:
                    this.f23323 = r2;
                    this.f23325 = r2;
                    iM6981 = (i2 - C0630.m2566("۠᩶")) * (-75);
                    i4 = ((iM6981 ^ i3) * 31327) ^ (-1724108139);
                    i5 = -489007654;
                    break;
                case 6164307:
                case 1527513602:
                    if (!C1005.f3721) {
                        iM6981 = (C0630.m2566("᩺۬") ^ i3) * (-71);
                        i4 = ((iM6981 ^ i2) * (-31815)) ^ (-1833775540);
                        i5 = 1437692162;
                    } else {
                        iM6981 = C0630.m2566("ۘ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22309) ^ 1916561619;
                        i5 = -1044972655;
                    }
                    break;
                case 23927582:
                case 241460221:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = C0630.m2566("ۘ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22309) ^ 1916561619;
                        i5 = -1044972655;
                    } else {
                        iM6981 = (C2105.m6981("ۗ᩷") ^ i2) * 75;
                        i4 = ((iM6981 ^ i3) * 16809) ^ 851777907;
                        i5 = -501937345;
                    }
                    break;
                case 242397652:
                case 1373146405:
                    z = false;
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ܿ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27217)) ^ (-705187714);
                        i5 = 1977506795;
                    } else {
                        iM6981 = (C2105.m6981("ۛۚ") + i3) * 59;
                        i4 = ((iM6981 ^ i2) * 25117) ^ (-2054997146);
                        i5 = 150371022;
                    }
                    break;
                case 305272628:
                case 752987929:
                    break;
                case 832168658:
                case 1172421480:
                    c13136 = this.f23322;
                    if (c13136 != null) {
                        iM6981 = (C0630.m2566("ۨۜ") + i2) * q.h;
                        i4 = ((iM6981 ^ i3) * 22663) ^ (-2099889631);
                        i5 = -1472093386;
                    } else {
                        iM6981 = (C2105.m6981("ܳ۠") ^ i3) * (-67);
                        i4 = ((iM6981 ^ i2) * 22621) ^ (-1861956397);
                        i5 = 2106061007;
                    }
                    break;
                case 874250914:
                case 1113982418:
                    C3911.m11920(c13136);
                    this.f23322 = r2;
                    iM6981 = (C2105.m6981("ܳ۠") ^ i3) * (-67);
                    i4 = ((iM6981 ^ i2) * 22621) ^ (-1861956397);
                    i5 = 2106061007;
                    break;
                default:
                    this.f23324 = z;
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("᩹ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19149)) ^ 1608906218;
                        i5 = 228967067;
                    } else {
                        iM6981 = C0630.m2566("ۗ᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30381) ^ 260291930;
                        i5 = -841111133;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20265(Executor executor) {
        this.f23321 = executor;
    }
}
