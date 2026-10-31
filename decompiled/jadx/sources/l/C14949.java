package l;

import android.graphics.drawable.Drawable;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܶۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJI */
/* JADX INFO: loaded from: classes4.dex */
public class C14949 extends AbstractC5447 {

    /* JADX INFO: renamed from: ᩵ܿ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f45574 = {8263, -8865, -8895, -8865, 4377, -23115, -21582, -18440, 5442, 16686, 16721, 16723};

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f45575;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f45576;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f45577;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f45578;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C18076 f45579;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f45580;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f45581;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f45582;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f45583;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f45584;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f45585;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f45586;

    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[PHI: r14
      0x00a8: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:29:0x00a6, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f6 A[PHI: r7 r9 r10 r11
      0x01f6: PHI (r7v3 short) = (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v4 short) binds: [B:47:0x0153, B:43:0x0133, B:15:0x0066, B:12:0x005d, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:47:0x0153, B:43:0x0133, B:15:0x0066, B:12:0x005d, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:47:0x0153, B:43:0x0133, B:15:0x0066, B:12:0x005d, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:47:0x0153, B:43:0x0133, B:15:0x0066, B:12:0x005d, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x024b A[PHI: r4 r5 r12 r13
      0x024b: PHI (r4v4 short) = (r4v3 short), (r4v2 short) binds: [B:68:0x0249, B:33:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:68:0x0249, B:33:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r12v3 short[]) = (r12v2 short[]), (r12v4 short[]) binds: [B:68:0x0249, B:33:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:68:0x0249, B:33:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0297  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ca A[PHI: r3 r6 r19
      0x02ca: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:80:0x02c8, B:72:0x027c, B:64:0x0229, B:17:0x006a, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:80:0x02c8, B:72:0x027c, B:64:0x0229, B:17:0x006a, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:80:0x02c8, B:72:0x027c, B:64:0x0229, B:17:0x006a, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Drawable[] m35414() {
        int iM6981;
        int i;
        int i2;
        int i3 = RunnableC0588.f2309;
        int i4 = C0483.f2088;
        int iM2566 = C0630.m2566("ܰᩳ") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-4709)) ^ 568277598;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2566 ^ (-670724382);
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -87340354;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * 29621) >> 31));
            switch (i15) {
                case -2025735057:
                case -1959222133:
                    C4075.m12263();
                    if (C4616.f14690 > 0) {
                        iM6981 = (i3 - C2105.m6981("ܿܺ")) * (-119);
                        i = ((iM6981 ^ i4) * (-13351)) ^ (-1994711125);
                        i2 = -1526100738;
                    } else {
                        iM6981 = C2105.m6981("ۨᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-1969)) ^ (-980377675);
                        i2 = -1277780642;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1985567091:
                case -1594665130:
                    sArr2 = f45574;
                    i11 = 9;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("ܽۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    } else {
                        iM6981 = (C0630.m2566("۟۬") + i3) * (-85);
                        i = ((iM6981 ^ i4) * (-32541)) ^ 270749461;
                        i2 = -2017495810;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1808140068:
                case -1022493025:
                    if (C2105.f7037 != 0) {
                        iM6981 = (i3 - C2105.m6981("ܿܺ")) * (-119);
                        i = ((iM6981 ^ i4) * (-13351)) ^ (-1994711125);
                        i2 = -1526100738;
                    } else {
                        iM6981 = (C0630.m2566("۫֡") ^ i3) * 53;
                        i = ((iM6981 ^ i4) * (-4773)) ^ (-1420617113);
                        i2 = 2005874840;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1787934347:
                case -1350951815:
                    return C13876.m33247(AbstractC2021.m6573(sArr2, i11, i12, i10));
                case -1754178091:
                case 1961899272:
                    c = '\b';
                    if (C0964.m3413()) {
                        iM6981 = C0630.m2566("᩹᩷") ^ i3;
                        i = ((iM6981 ^ i4) * 10287) ^ (-270740698);
                        i2 = 795691020;
                    } else {
                        iM6981 = (C0630.m2566("ᩴ֫") + i4) * (-7);
                        i = ((iM6981 ^ i3) * (-5523)) ^ (-1176464824);
                        i2 = 1356029799;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1585742844:
                case 1953589178:
                    throw new RuntimeException();
                case -1492420250:
                case 295258905:
                    sArr3 = f45574;
                    i13 = 10;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i = ((iM6981 ^ i4) * (-12319)) ^ 1014987146;
                        i2 = 314578342;
                    } else {
                        iM6981 = C0630.m2566("᩺ܺ") ^ i3;
                        i = ((iM6981 ^ i4) * 22743) ^ (-711592990);
                        i2 = 1993903796;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1331695766:
                case 1828010966:
                    if (C21923.f70183 == 0) {
                        iM6981 = C2105.m6981("ܽۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܿܺ")) * (-119);
                        i = ((iM6981 ^ i4) * (-13351)) ^ (-1994711125);
                        i2 = -1526100738;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1256108403:
                case -117352028:
                    C2520.m8026();
                    return null;
                case -1239197305:
                case 455795818:
                    if (i9 - (s * s2) < 0) {
                        iM6981 = (i4 - C2105.m6981("᩸ۖ")) * (-25);
                        i = ((iM6981 ^ i3) * 26843) ^ 1375598065;
                        i2 = 1909523137;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩹ܺ")) * (-81);
                        i = ((iM6981 ^ i4) * (-10959)) ^ (-560698689);
                        i2 = -1922191683;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1232538007:
                case 29850640:
                    if (i7 != 1) {
                        iM6981 = (i3 - C2105.m6981("ܿܽ")) * (-59);
                        i = ((iM6981 ^ i4) * 21063) ^ 1655949862;
                        i2 = -575172549;
                    } else {
                        iM6981 = (C2105.m6981("ۨܽ") ^ i3) * 119;
                        i = ((iM6981 ^ i4) * (-6257)) ^ (-356110620);
                        i2 = 884357968;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1231685443:
                case 119669045:
                    s = sArr[c];
                    i8 = s * s;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i = ((iM6981 ^ i4) * (-12319)) ^ 1014987146;
                        i2 = 314578342;
                    } else {
                        iM6981 = C0630.m2566("ۚۤ") ^ i4;
                        i = ((iM6981 ^ i3) * (-30731)) ^ (-872380364);
                        i2 = -1747065457;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1227427355:
                case 1107200014:
                    sArr = f45574;
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("ᩴ֫") + i4) * (-7);
                        i = ((iM6981 ^ i3) * (-5523)) ^ (-1176464824);
                        i2 = 1356029799;
                    } else {
                        iM6981 = C2105.m6981("ۜ֡") ^ i4;
                        i = ((iM6981 ^ i3) * (-1023)) ^ (-1304639062);
                        i2 = 472806105;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -987257489:
                case 1406866897:
                    i10 = 16749;
                    iM6981 = C0630.m2566("ۙ֨") ^ i3;
                    i = ((iM6981 ^ i4) * (-28569)) ^ (-806490304);
                    i2 = 1090038229;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -949457523:
                case -283095781:
                    i14 = 2;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C2105.m6981("ۨᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-1969)) ^ (-980377675);
                        i2 = -1277780642;
                    } else {
                        iM6981 = (C0630.m2566("ۚۘ") + i4) * 93;
                        i = ((iM6981 ^ i3) * 23421) ^ (-1585119302);
                        i2 = 320910752;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -917610358:
                case 1972507902:
                    C1294.m4372();
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ᩴ֫") + i4) * (-7);
                        i = ((iM6981 ^ i3) * (-5523)) ^ (-1176464824);
                        i2 = 1356029799;
                    } else {
                        iM6981 = C2105.m6981("ܽۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -654078059:
                case -652625376:
                    i7 = this.f45581;
                    if (i7 != 0) {
                        int iM2567 = C0630.m2566("ۨ᩶") ^ i4;
                        i5 = ((iM2567 ^ i3) * 6667) ^ (-1290354161);
                        i6 = iM2567 ^ 1772835044;
                    } else {
                        iM6981 = C0630.m2566("᩶۬") ^ i4;
                        i = ((iM6981 ^ i3) * (-2247)) ^ 669633425;
                        i2 = 1451674552;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    }
                    break;
                case -584847523:
                case 300252887:
                    RunnableC3474.m10630();
                    C3245.m9925();
                    iM6981 = (C0630.m2566("ᩴ֫") + i4) * (-7);
                    i = ((iM6981 ^ i3) * (-5523)) ^ (-1176464824);
                    i2 = 1356029799;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -431665705:
                case 1141663522:
                    i10 = 4616;
                    iM6981 = C0630.m2566("ۙ֨") ^ i3;
                    i = ((iM6981 ^ i4) * (-28569)) ^ (-806490304);
                    i2 = 1090038229;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -408968211:
                case 50680125:
                    return C13876.m33247(RunnableC0588.m2436(sArr3, i13, i14, i10));
                case -97935124:
                case 1224632518:
                    i9 = i8 + 7661824;
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("ᩴ֫") + i4) * (-7);
                        i = ((iM6981 ^ i3) * (-5523)) ^ (-1176464824);
                        i2 = 1356029799;
                    } else {
                        iM6981 = C2105.m6981("ܶ۠") ^ i4;
                        i = ((iM6981 ^ i3) * 8479) ^ (-500994278);
                        i2 = -1030497902;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1250899738:
                case 1488216522:
                    i12 = 1;
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("ܽۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    } else {
                        iM6981 = C2105.m6981("ᩴۤ") ^ i4;
                        i = ((iM6981 ^ i3) * 2363) ^ 920479544;
                        i2 = 1884975242;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1355828114:
                case 1586893550:
                    if (i7 == 2) {
                        iM6981 = (C2105.m6981("ۨܽ") ^ i3) * 119;
                        i = ((iM6981 ^ i4) * (-6257)) ^ (-356110620);
                        i2 = 884357968;
                    } else {
                        iM6981 = (C0630.m2566("᩹ۧ") + i4) * 35;
                        i = ((iM6981 ^ i3) * (-27295)) ^ (-613758910);
                        i2 = 591305431;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    s2 = 5536;
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ܽۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    } else {
                        iM6981 = (C2105.m6981("ۨۖ") ^ i3) * 5;
                        i = ((iM6981 ^ i4) * (-29223)) ^ (-864288069);
                        i2 = -1211831870;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0250  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (l.C1420.f5096 > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (l.C0714.f2697 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
    
        if (l.AbstractC2021.m6574() != false) goto L8;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m35412(String str, String str2) {
        int iM6981;
        int i;
        int i2;
        short s;
        int iM6982;
        int i3;
        int iM2566;
        int i4;
        C14949 c14949 = this;
        String strM28025 = null;
        StringBuilder sb = null;
        String strM24404 = null;
        int i5 = 0;
        StringBuilder sb2 = null;
        String strM24405 = null;
        String strM49517 = null;
        String strM49518 = null;
        int i6 = 0;
        int i7 = -1822877261;
        int i8 = C2167.f7158;
        int i9 = C4616.f14690;
        int iM2567 = (C0630.m2566("ܶۧ") ^ i8) * 67;
        int i10 = ((iM2567 ^ i9) * (-18773)) ^ 314566933;
        int i11 = iM2567 ^ 200425941;
        int i12 = 0;
        int i13 = 0;
        boolean zM4369 = false;
        short s2 = 0;
        short[] sArr = null;
        short[] sArr2 = null;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * 18559) >> 31));
            switch (i7) {
                case -2029968226:
                case 1327073465:
                    if (str != null) {
                        iM6981 = C0630.m2566("ۖ֡") ^ i9;
                        i = ((iM6981 ^ i8) * (-9521)) ^ 2129505324;
                        i2 = -1056801596;
                    } else {
                        iM6981 = (i8 - C0630.m2566("ۢ᩺")) * (-89);
                        i = ((iM6981 ^ i9) * 18765) ^ (-1883114430);
                        i2 = -977266511;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -2020805523:
                case 494883366:
                    s = s2;
                    sArr = f45574;
                    if (C1047.f3863 >= 0) {
                        iM6982 = C0630.m2566("ۡۢ") ^ i9;
                        i10 = ((iM6982 ^ i8) * 499) ^ 370211954;
                        i3 = -1333063889;
                    } else {
                        iM6982 = C2105.m6981("᩶ۙ") ^ i8;
                        i10 = ((iM6982 ^ i9) * 18233) ^ 1925369087;
                        i3 = 2136744061;
                    }
                    i11 = iM6982 ^ i3;
                    c14949 = this;
                    s2 = s;
                    break;
                case -1931257328:
                case -976767032:
                    strM49517 = ActivityC22006.m49517(i5, str);
                    strM49518 = ActivityC22006.m49517(i5, str2);
                    if (C1294.m4369(strM49517, strM49518)) {
                        iM6981 = (C2105.m6981("ۙ֨") + i9) * 29;
                        i = ((iM6981 ^ i8) * (-8539)) ^ 1365916811;
                        i2 = -1725747674;
                    } else {
                        iM6981 = C2105.m6981("ۛۡ") ^ i9;
                        i = ((iM6981 ^ i8) * (-18911)) ^ (-1572154190);
                        i2 = -1214929506;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1859215304:
                case 1622920458:
                    c14949.f45586 = C22870.m50967(strM49517, strM28025, strM49518);
                    break;
                case -1804512083:
                case 963655804:
                    C1420.m4905(sb2, strM24405);
                    C1420.m4905(sb2, strM28025);
                    if (C0964.f3626 == 0) {
                        iM6981 = C0630.m2566("۠᩺") ^ i9;
                        i = ((iM6981 ^ i8) * (-14969)) ^ 1110277073;
                        i2 = -2144001526;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM6982 = C0630.m2566("֡᩹") ^ i8;
                        i10 = ((iM6982 ^ i9) * (-3825)) ^ 1089402107;
                        i3 = -666562594;
                        i11 = iM6982 ^ i3;
                        c14949 = this;
                        s2 = s;
                    }
                    break;
                case -1775235634:
                case 1546501209:
                    break;
                case -1711762669:
                case -383644395:
                    sb2 = new StringBuilder();
                    strM24405 = C9523.m24404(str);
                    if (C7811.f24123 < 0) {
                        iM6981 = C2105.m6981("ܽۛ") ^ i8;
                        i = ((iM6981 ^ i9) * 26649) ^ 1024978633;
                        i2 = 1294417845;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM6982 = C0630.m2566("ۡۢ") ^ i9;
                        i10 = ((iM6982 ^ i8) * 499) ^ 370211954;
                        i3 = -1333063889;
                        i11 = iM6982 ^ i3;
                        c14949 = this;
                        s2 = s;
                    }
                    break;
                case -1608809083:
                case 812640999:
                    C3746.m11369();
                    break;
                case -1509320840:
                case -811568038:
                    s2 = sArr[0];
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ۗۡ") ^ i9;
                        i10 = ((iM2566 ^ i8) * (-11543)) ^ (-792017522);
                        i4 = 383053517;
                    } else {
                        iM2566 = (i9 - C0630.m2566("᩸ܶ")) * 31;
                        i10 = ((iM2566 ^ i8) * 10567) ^ 2077441344;
                        i4 = -11676374;
                    }
                    i11 = iM2566 ^ i4;
                    c14949 = this;
                    break;
                case -1500638384:
                case -821022491:
                    C1420.m4905(sb2, C9523.m24404(str2));
                    c14949.f45586 = C0422.m1959(sb2);
                    iM6981 = (i8 - C0630.m2566("ۢ᩺")) * (-89);
                    i = ((iM6981 ^ i9) * 18765) ^ (-1883114430);
                    i2 = -977266511;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1276812421:
                case 1084797890:
                    strM28025 = C11340.m28025(sArr2, i12, 3, i6);
                    if (zM4369) {
                        iM6981 = C2105.m6981("᩷֡") ^ i8;
                        i = ((iM6981 ^ i9) * (-9369)) ^ 1095494899;
                        i2 = 517457424;
                    } else {
                        iM6981 = (C0630.m2566("ۖۗ") + i9) * 47;
                        i = ((iM6981 ^ i8) * (-415)) ^ 555136244;
                        i2 = 1763462677;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1258508205:
                case -816611797:
                    break;
                case -947752900:
                case 84641339:
                    sb = new StringBuilder();
                    strM24404 = C9523.m24404(str);
                    if (C1128.f4106 > 0) {
                        iM6981 = C0630.m2566("᩻ܳ") ^ i8;
                        i = ((iM6981 ^ i9) * 4931) ^ (-595530506);
                        i2 = -1335169621;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM6982 = (i8 - C2105.m6981("ۗ֡")) * 19;
                        i10 = ((iM6982 ^ i9) * 265) ^ 952821682;
                        i3 = 1041898876;
                        i11 = iM6982 ^ i3;
                        c14949 = this;
                        s2 = s;
                    }
                    break;
                case -792449462:
                case 753864268:
                    if (i5 < 10) {
                        iM6981 = (C0630.m2566("᩹ۜ") + i8) * 77;
                        i = ((iM6981 ^ i9) * 2715) ^ 1450734191;
                        i2 = -320710715;
                    } else {
                        iM6981 = C0630.m2566("᩸֡") ^ i9;
                        i = ((iM6981 ^ i8) * 16447) ^ (-452651785);
                        i2 = -811931140;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -721044028:
                case 1754333176:
                    i6 = 57380;
                    iM6981 = (C2105.m6981("֡ᩳ") ^ i8) * (-41);
                    i = ((iM6981 ^ i9) * (-25397)) ^ (-1191390749);
                    i2 = 2117563061;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -685532986:
                case 1350893025:
                    zM4369 = C1294.m4369(str, str2);
                    sArr2 = f45574;
                    i12 = 1;
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM6981 = C2105.m6981("ۚ᩵") ^ i8;
                        i = ((iM6981 ^ i9) * (-29055)) ^ (-340434940);
                        i2 = -1711353537;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM6982 = (C2105.m6981("᩶ۨ") + i8) * (-33);
                        i10 = ((iM6982 ^ i9) * 1489) ^ 54040685;
                        i3 = -1917659063;
                        i11 = iM6982 ^ i3;
                        c14949 = this;
                        s2 = s;
                    }
                    break;
                case -475331520:
                case 786907425:
                    C1420.m4905(sb, C9523.m24404(str2));
                    c14949.f45586 = C0422.m1959(sb);
                    break;
                case -407274609:
                case 926242944:
                    if (str2 == null) {
                        iM6981 = (i8 - C0630.m2566("ۢ᩺")) * (-89);
                        i = ((iM6981 ^ i9) * 18765) ^ (-1883114430);
                        i2 = -977266511;
                    } else {
                        iM6981 = (i9 - C2105.m6981("᩷ۜ")) * 25;
                        i = ((iM6981 ^ i8) * 4661) ^ (-685736562);
                        i2 = -1736242462;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -361786096:
                case -11320494:
                    s = s2;
                    if (C22628.f73083 <= 0) {
                        iM6982 = C0630.m2566("֡᩹") ^ i8;
                        i10 = ((iM6982 ^ i9) * (-3825)) ^ 1089402107;
                        i3 = -666562594;
                    } else {
                        iM6982 = (C2105.m6981("ۚۧ") + i9) * 57;
                        i10 = ((iM6982 ^ i8) * (-27567)) ^ (-2051788863);
                        i3 = -650272226;
                    }
                    i11 = iM6982 ^ i3;
                    c14949 = this;
                    s2 = s;
                    break;
                case -96221707:
                case 1617661847:
                    i5++;
                    iM6981 = (C2105.m6981("ܽۜ") ^ i8) * 71;
                    i = ((iM6981 ^ i9) * (-9783)) ^ 192196833;
                    i2 = -1775002203;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -63227767:
                case 2033766139:
                    s = s2;
                    if (C0237.f1507 != 0) {
                        iM6982 = (C2105.m6981("᩶ۨ") + i8) * (-33);
                        i10 = ((iM6982 ^ i9) * 1489) ^ 54040685;
                        i3 = -1917659063;
                    } else {
                        iM6982 = (i8 - C0630.m2566("֨ۗ")) * (-55);
                        i10 = ((iM6982 ^ i9) * (-23759)) ^ 633657524;
                        i3 = 1408259529;
                    }
                    i11 = iM6982 ^ i3;
                    c14949 = this;
                    s2 = s;
                    break;
                case 18041600:
                case 1394211385:
                    C5695.m16023();
                    break;
                case 142876782:
                case 524689992:
                    C3432.m10477();
                    break;
                case 188752124:
                case 1326868500:
                    s = s2;
                    i13 = (s * s) + 22686169;
                    if (C1005.f3721) {
                        iM6982 = (C0630.m2566("֡᩶") ^ i9) * (-15);
                        i10 = ((iM6982 ^ i8) * (-7369)) ^ 1538255224;
                        i3 = -181256466;
                    } else {
                        iM6982 = (i8 - C2105.m6981("ۗ֡")) * 19;
                        i10 = ((iM6982 ^ i9) * 265) ^ 952821682;
                        i3 = 1041898876;
                    }
                    i11 = iM6982 ^ i3;
                    c14949 = this;
                    s2 = s;
                    break;
                case 404510489:
                case 1765760405:
                    C3245.m9923(sb, strM24404);
                    C1420.m4905(sb, strM28025);
                    if (C2520.f8000 < 0) {
                        iM6981 = (C2105.m6981("ۧܰ") ^ i9) * (-31);
                        i = ((iM6981 ^ i8) * 21823) ^ 567561904;
                        i2 = -1393458551;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM6982 = (C2105.m6981("᩶ۨ") + i8) * (-33);
                        i10 = ((iM6982 ^ i9) * 1489) ^ 54040685;
                        i3 = -1917659063;
                        i11 = iM6982 ^ i3;
                        c14949 = this;
                        s2 = s;
                    }
                    break;
                case 954749540:
                case 1994364385:
                    C1294.m4372();
                    C22628.m50615();
                    s = s2;
                    iM6982 = C0630.m2566("֡᩹") ^ i8;
                    i10 = ((iM6982 ^ i9) * (-3825)) ^ 1089402107;
                    i3 = -666562594;
                    i11 = iM6982 ^ i3;
                    c14949 = this;
                    s2 = s;
                    break;
                case 1269864359:
                case 1975140538:
                    i5 = 1;
                    iM6981 = (C2105.m6981("ܽۜ") ^ i8) * 71;
                    i = ((iM6981 ^ i9) * (-9783)) ^ 192196833;
                    i2 = -1775002203;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case 1305346454:
                case 1312525323:
                    s = s2;
                    if (i13 - (s * 9526) >= 0) {
                        iM6982 = (C2105.m6981("ۛܳ") ^ i8) * 73;
                        i10 = ((iM6982 ^ i9) * 12153) ^ (-1143083397);
                        i3 = -1593011226;
                        i11 = iM6982 ^ i3;
                        c14949 = this;
                        s2 = s;
                    } else {
                        int iM6983 = C2105.m6981("ܿ᩶") ^ i9;
                        i11 = iM6983 ^ 1311496751;
                        i10 = ((iM6983 ^ i8) * (-30835)) ^ 486994561;
                        s2 = s;
                        c14949 = this;
                    }
                    break;
                default:
                    i6 = 56703;
                    iM6981 = (C2105.m6981("֡ᩳ") ^ i8) * (-41);
                    i = ((iM6981 ^ i9) * (-25397)) ^ (-1191390749);
                    i2 = 2117563061;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a A[PHI: r6
      0x015a: PHI (r6v5 java.util.HashMap) = (r6v4 java.util.HashMap), (r6v4 java.util.HashMap), (r6v6 java.util.HashMap) binds: [B:52:0x0158, B:44:0x0121, B:28:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0187  */
    public C14949() {
        int iM6981;
        int i;
        int i2 = -262579110;
        int i3 = C3746.f11829;
        int i4 = C0630.f2410;
        int iM2566 = (C0630.m2566("᩻᩶") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i5 = ((iM2566 ^ i3) * (-27705)) ^ (-1857787651);
        int i6 = -1275424867;
        while (true) {
            int i7 = iM2566 ^ i6;
            HashMap map = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-6715)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1508674000:
                    case -301466051:
                        if (C1773.m5908() <= 0) {
                            iM6981 = (C2105.m6981("᩸֨") ^ i3) * (-117);
                            i5 = ((iM6981 ^ i4) * (-6631)) ^ 1221028986;
                            i = -1357699061;
                        } else {
                            iM6981 = (C2105.m6981("᩵ۨ") ^ i3) * (-107);
                            i5 = ((iM6981 ^ i4) * 3029) ^ 651619011;
                            i = 1184774287;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1394263626:
                    case 1961616813:
                        if (!C0422.m1963()) {
                        }
                        map = new HashMap();
                        if (ServiceConnectionC3453.f10921 >= 0) {
                            iM6981 = C0630.m2566("۬᩶") ^ i3;
                            i5 = ((iM6981 ^ i4) * 16527) ^ 793955385;
                            i = 1832617965;
                        } else {
                            iM6981 = (i4 - C2105.m6981("ܿ᩹")) * (-17);
                            i5 = ((iM6981 ^ i3) * (-4799)) ^ 603720395;
                            i = -408211538;
                        }
                        i7 = iM6981 ^ i;
                        break;
                        break;
                    case -857016046:
                    case -843795824:
                        C0964.m3413();
                        if (C5695.m16023() >= 0) {
                        }
                        iM6981 = (C2105.m6981("۠ۜ") + i3) * (-47);
                        i5 = ((iM6981 ^ i4) * 14409) ^ (-539331134);
                        i = -816228517;
                        i7 = iM6981 ^ i;
                        break;
                    case -844410648:
                    case 1478491014:
                        C11340.m28031();
                        C0483.m2121();
                        throw new RuntimeException();
                    case -760582678:
                    case 609620807:
                        C5695.m16023();
                        C3245.m9925();
                        break;
                    case 4852465:
                    case 1215430728:
                        if (AbstractC2021.f6743 <= 0) {
                            iM6981 = C0630.m2566("۬᩶") ^ i3;
                            i5 = ((iM6981 ^ i4) * 16527) ^ 793955385;
                            i = 1832617965;
                        } else {
                            iM6981 = C2105.m6981("ۘܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 1861) ^ 1657570131;
                            i = -56409581;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 199376386:
                    case 808540764:
                        if (RunnableC1937.f6483 < 0) {
                            iM6981 = (C2105.m6981("۠ۜ") + i3) * (-47);
                            i5 = ((iM6981 ^ i4) * 14409) ^ (-539331134);
                            i = -816228517;
                        } else {
                            iM6981 = (C2105.m6981("᩸֨") ^ i3) * (-117);
                            i5 = ((iM6981 ^ i4) * (-6631)) ^ 1221028986;
                            i = -1357699061;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 416550811:
                    case 1868309195:
                        if (C1005.m3501()) {
                            iM6981 = (C0630.m2566("ۢۡ") ^ i3) * (-67);
                            i5 = ((iM6981 ^ i4) * (-12337)) ^ 694850711;
                            i = 1642458975;
                        } else {
                            iM6981 = C0630.m2566("ۛܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 29657) ^ (-1726723397);
                            i = -1772434026;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 513933012:
                    case 1454447837:
                        if (RunnableC1937.m6387() != 0) {
                            iM6981 = C0630.m2566("ۛܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 29657) ^ (-1726723397);
                            i = -1772434026;
                        } else {
                            iM6981 = C2105.m6981("ۡ᩵") ^ i3;
                            i5 = ((iM6981 ^ i4) * 5311) ^ 554255343;
                            i = 1263058632;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 711318506:
                    case 1143976097:
                        if (C0237.f1507 != 0) {
                            iM6981 = C0630.m2566("۬᩶") ^ i3;
                            i5 = ((iM6981 ^ i4) * 16527) ^ 793955385;
                            i = 1832617965;
                        } else {
                            iM6981 = (C0630.m2566("۠᩵") + i4) * (-75);
                            i5 = ((iM6981 ^ i3) * (-2003)) ^ 1768166339;
                            i = 1933724419;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 764483993:
                    case 1085722463:
                        if (C22628.f73083 <= 0) {
                            iM6981 = C0630.m2566("ۛܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 29657) ^ (-1726723397);
                            i = -1772434026;
                        } else {
                            iM6981 = (i4 - C0630.m2566("ᩳ۠")) * (-35);
                            i5 = ((iM6981 ^ i3) * 1823) ^ (-1312593120);
                            i = -2104206098;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 1103380073:
                    case 1521263318:
                        this.f45581 = -1;
                        if (C4159.f13567) {
                            iM6981 = (C2105.m6981("۠ۙ") ^ i3) * (-19);
                            i5 = ((iM6981 ^ i4) * (-30541)) ^ 1106136423;
                            i = 363336868;
                        } else {
                            iM6981 = (C2105.m6981("᩸֨") ^ i3) * (-117);
                            i5 = ((iM6981 ^ i4) * (-6631)) ^ 1221028986;
                            i = -1357699061;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 1362799788:
                    case 1744530991:
                        C1773.m5908();
                        if (C0422.f1886 > 0) {
                            iM6981 = (C2105.m6981("۠ۜ") + i3) * (-47);
                            i5 = ((iM6981 ^ i4) * 14409) ^ (-539331134);
                            i = -816228517;
                        } else {
                            iM6981 = C0630.m2566("ۛܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 29657) ^ (-1726723397);
                            i = -1772434026;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    default:
                        this.f45582 = map;
                        if (AbstractC2021.f6743 > 0) {
                            this.f45577 = new ArrayList();
                            return;
                        }
                        iM6981 = C0630.m2566("ۛܽ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 29657) ^ (-1726723397);
                        i = -1772434026;
                        i7 = iM6981 ^ i;
                        break;
                }
            }
            iM2566 = (C0630.m2566("ۛۜ") + i4) * 57;
            i5 = ((iM2566 ^ i3) * 13285) ^ 2109894364;
            i6 = 1770644649;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x02ed A[PHI: r1 r7
      0x02ed: PHI (r1v84 short) = (r1v47 short), (r1v48 short), (r1v85 short) binds: [B:75:0x02eb, B:71:0x02cb, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r7v8 java.lang.Object) = (r7v2 java.lang.Object), (r7v2 java.lang.Object), (r7v9 java.lang.Object) binds: [B:75:0x02eb, B:71:0x02cb, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35413(C9762 c9762, C13876 c13876, Set set) {
        int iM6981;
        int i;
        int i2;
        short s;
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        C14949 c14949 = this;
        c9762 = c9762;
        int i7 = C1128.f4106;
        int i8 = C3432.f10845;
        int iM6982 = C2105.m6981("ۧۧ") ^ i8;
        int i9 = ((iM6982 ^ i7) * (-7273)) ^ 882300472;
        String strM13542 = null;
        short[] sArr = null;
        int i10 = iM6982 ^ (-1771433505);
        final C18076 c18076 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = -346066403;
        int i15 = 0;
        Object[] objArr = null;
        String str = null;
        Object objCollect = null;
        InterfaceC17664 interfaceC17664Filter = null;
        int i16 = 0;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i7) * (-16905)) >> 31));
            switch (i14) {
                case -2113957488:
                case 627559987:
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = (i7 - C0630.m2566("᩶֨")) * (-93);
                        i = ((iM6981 ^ i8) * 15337) ^ (-177592830);
                        i2 = 111860452;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    }
                    iM6981 = (i8 - C2105.m6981("ۢ۟")) * 73;
                    i = ((iM6981 ^ i7) * (-20051)) ^ (-431340465);
                    i2 = -189977559;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -2022193100:
                case 1301736239:
                    i13 = 13044;
                    iM6981 = C0630.m2566("ۗ۟") ^ i7;
                    i = ((iM6981 ^ i8) * (-27301)) ^ 1844540172;
                    i2 = -94530058;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1993893950:
                case 392575130:
                    c13876.m33252(i16, set);
                    c13876.m33278();
                    C21923.m49340(c9762, c14949.f45586);
                    break;
                case -1769250086:
                case -960864186:
                    s2 = f45574[4];
                    if (C3911.f12484 >= 0) {
                        iM2567 = C2105.m6981("ܳ᩸") ^ i7;
                        i5 = ((iM2567 ^ i8) * (-26317)) ^ (-614217442);
                        i6 = 1144126220;
                    } else {
                        iM2567 = (i7 - C0630.m2566("ᩳܽ")) * (-119);
                        i5 = ((iM2567 ^ i8) * (-9103)) ^ (-10363590);
                        i6 = -1558884402;
                    }
                    i10 = iM2567 ^ i6;
                    c14949 = this;
                    i9 = i5;
                    break;
                case -1763392034:
                case -274734170:
                    C0483.m2121();
                    if (C3537.f11231 >= 0) {
                        iM2567 = C2105.m6981("ܳ᩸") ^ i7;
                        i5 = ((iM2567 ^ i8) * (-26317)) ^ (-614217442);
                        i6 = 1144126220;
                        i10 = iM2567 ^ i6;
                        c14949 = this;
                        i9 = i5;
                    }
                    s = s2;
                    iM2566 = (C2105.m6981("ۖܺ") ^ i8) * (-71);
                    i3 = ((iM2566 ^ i7) * (-30609)) ^ (-59304460);
                    i4 = 395935739;
                    i10 = iM2566 ^ i4;
                    c14949 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -1657533961:
                case 1074429938:
                    interfaceC17664Filter = C2167.m7152(set).filter(new Predicate() { // from class: l.۠ۖ᩷
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19285.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo4928negate() {
                            return C19285.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19285.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            String str2 = null;
                            int i17 = -1651618295;
                            int i18 = C0422.f1886;
                            int i19 = C1294.f4556;
                            int iM6983 = C2105.m6981("ۖۡ") ^ i18;
                            int i20 = ((iM6983 ^ i19) * 21147) ^ 502583912;
                            int i21 = 1539085312;
                            while (true) {
                                i17 = ((((i17 ^ i19) * (-7255)) >> 31) & i20) ^ (iM6983 ^ i21);
                                switch (i17) {
                                    case -1957098991:
                                    case 880180322:
                                        if (C1128.f4106 <= 0) {
                                            iM6983 = (C0630.m2566("ۨ۟") + i19) * (-93);
                                            i20 = ((iM6983 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM6983 = C2105.m6981("ۢۡ") ^ i18;
                                            i20 = ((iM6983 ^ i19) * (-15807)) ^ (-485214897);
                                            i21 = -2127386002;
                                        }
                                        break;
                                    case -1713818288:
                                    case -696821686:
                                        if (C21923.f70183 != 0) {
                                            iM6983 = (C0630.m2566("ۨ۟") + i19) * (-93);
                                            i20 = ((iM6983 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM6983 = (C2105.m6981("ۘܽ") + i18) * 47;
                                            i20 = ((iM6983 ^ i19) * (-14617)) ^ 200107612;
                                            i21 = 723623222;
                                        }
                                        break;
                                    case -1612556241:
                                    case -1317871074:
                                        if (C4263.f13799 <= 0) {
                                            iM6983 = C2105.m6981("֨ۤ") ^ i18;
                                            i20 = ((iM6983 ^ i19) * 17325) ^ (-2126945656);
                                            i21 = 681523722;
                                        } else {
                                            iM6983 = (i18 - C0630.m2566("ۡۚ")) * (-55);
                                            i20 = ((iM6983 ^ i19) * 28729) ^ (-1232630293);
                                            i21 = 1358118652;
                                        }
                                        break;
                                    case -1525128044:
                                    case -1358890959:
                                        if (C1047.f3863 >= 0) {
                                            iM6983 = (C0630.m2566("ۨ۟") + i19) * (-93);
                                            i20 = ((iM6983 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM6983 = (i19 - C2105.m6981("ܺ۬")) * 19;
                                            i20 = ((iM6983 ^ i18) * (-30537)) ^ 1531379015;
                                            i21 = 1290175269;
                                        }
                                        break;
                                    case -1287549420:
                                    case -810532130:
                                        C4263.m12819();
                                        C3019.m9255();
                                        return false;
                                    case -1200092788:
                                    case -1191954169:
                                        if (C1916.f6442) {
                                            iM6983 = C0630.m2566("ܿ᩸") ^ i19;
                                            i20 = ((iM6983 ^ i18) * 25053) ^ 747378361;
                                            i21 = -30922722;
                                        } else {
                                            iM6983 = C0630.m2566("᩹ۤ") ^ i18;
                                            i20 = ((iM6983 ^ i19) * 21683) ^ 1242022233;
                                            i21 = -443383476;
                                        }
                                        break;
                                    case -1161238894:
                                    case 1361077548:
                                        if (C21923.m49329()) {
                                            iM6983 = (C2105.m6981("۫۟") ^ i19) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i20 = ((iM6983 ^ i18) * 25029) ^ 605480549;
                                            i21 = -1451578137;
                                        } else {
                                            iM6983 = C2105.m6981("۠᩷") ^ i18;
                                            i20 = ((iM6983 ^ i19) * 1903) ^ (-1532977233);
                                            i21 = 1172002512;
                                        }
                                        break;
                                    case -1061461565:
                                    case 1306276086:
                                        if (C3432.f10845 < 0) {
                                            iM6983 = (i18 - C2105.m6981("ᩴ᩻")) * (-97);
                                            i20 = ((iM6983 ^ i19) * 22501) ^ 1852154287;
                                            i21 = -1496694058;
                                        } else {
                                            iM6983 = (C0630.m2566("ۨ۟") + i19) * (-93);
                                            i20 = ((iM6983 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        }
                                        break;
                                    case -782817090:
                                    case 920002320:
                                        C2167.m7155();
                                        iM6983 = (C0630.m2566("ۨ۟") + i19) * (-93);
                                        i20 = ((iM6983 ^ i18) * 20329) ^ (-998868811);
                                        i21 = -624688462;
                                        break;
                                    case -494897652:
                                    case -42272314:
                                        if (C7811.f24123 >= 0) {
                                            iM6983 = (C2105.m6981("۫۟") ^ i19) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i20 = ((iM6983 ^ i18) * 25029) ^ 605480549;
                                            i21 = -1451578137;
                                        } else {
                                            iM6983 = (i18 - C2105.m6981("ᩴ᩻")) * (-97);
                                            i20 = ((iM6983 ^ i19) * 22501) ^ 1852154287;
                                            i21 = -1496694058;
                                        }
                                        break;
                                    case 144942874:
                                    case 1563490886:
                                        str2 = (String) obj;
                                        if (C1711.f5919) {
                                            iM6983 = C2105.m6981("֨ۤ") ^ i18;
                                            i20 = ((iM6983 ^ i19) * 17325) ^ (-2126945656);
                                            i21 = 681523722;
                                        } else {
                                            iM6983 = C0630.m2566("᩺ۘ") ^ i19;
                                            i20 = ((iM6983 ^ i18) * (-29601)) ^ 1886414527;
                                            i21 = -1199145348;
                                        }
                                        break;
                                    case 242137697:
                                    case 812961591:
                                        if (C7811.f24123 >= 0) {
                                            iM6983 = C0630.m2566("᩹ۤ") ^ i18;
                                            i20 = ((iM6983 ^ i19) * 21683) ^ 1242022233;
                                            i21 = -443383476;
                                        } else {
                                            iM6983 = (C0630.m2566("ۨ۟") + i19) * (-93);
                                            i20 = ((iM6983 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        }
                                        break;
                                    case 395178953:
                                    case 960410042:
                                        return c18076.m42137(C9523.m24404(str2));
                                    case 501741026:
                                    case 1901255864:
                                        if (C3683.f11629 >= 0) {
                                            iM6983 = (C0630.m2566("ۨ۟") + i19) * (-93);
                                            i20 = ((iM6983 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM6983 = (C2105.m6981("ۛ᩺") + i19) * (-93);
                                            i20 = ((iM6983 ^ i18) * 6579) ^ (-1274095874);
                                            i21 = 1560839132;
                                        }
                                        break;
                                    case 1129778634:
                                    case 1162334361:
                                        if (ServiceConnectionC3453.m10564() <= 0) {
                                            iM6983 = (C0630.m2566("ۨ۟") + i19) * (-93);
                                            i20 = ((iM6983 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM6983 = (C2105.m6981("۟۟") ^ i18) * 21;
                                            i20 = ((iM6983 ^ i19) * 16989) ^ 816690819;
                                            i21 = -1370755359;
                                        }
                                        break;
                                    default:
                                        if (C1773.m5908() <= 0) {
                                            iM6983 = C2105.m6981("֨ۤ") ^ i18;
                                            i20 = ((iM6983 ^ i19) * 17325) ^ (-2126945656);
                                            i21 = 681523722;
                                        } else {
                                            iM6983 = (C0630.m2566("ۙ᩻") + i19) * (-37);
                                            i20 = ((iM6983 ^ i18) * (-20011)) ^ (-1624438964);
                                            i21 = -1026951929;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    if (C0050.f910 >= 0) {
                        iM6981 = (i8 - C2105.m6981("ۢ۟")) * 73;
                        i = ((iM6981 ^ i7) * (-20051)) ^ (-431340465);
                        i2 = -189977559;
                    } else {
                        iM6981 = (C0630.m2566("᩸ۡ") ^ i8) * (-15);
                        i = ((iM6981 ^ i7) * (-9869)) ^ (-749231829);
                        i2 = -772875649;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1385119583:
                case -11607592:
                    strM13542 = C4616.m13542(sArr, i11, 3, i13);
                    if (!C0714.m2805()) {
                        iM6981 = (i8 - C2105.m6981("ۢ۟")) * 73;
                        i = ((iM6981 ^ i7) * (-20051)) ^ (-431340465);
                        i2 = -189977559;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        int iM2568 = C0630.m2566("۫᩺") ^ i7;
                        i5 = ((iM2568 ^ i8) * (-31387)) ^ 554266723;
                        i10 = iM2568 ^ 1059253360;
                        i9 = i5;
                    }
                    break;
                case -1355436736:
                case 108980796:
                    short s3 = s2;
                    int i17 = s3 * 11976;
                    i12 = s3 * s3;
                    if (AbstractC2021.f6743 <= 0) {
                        s2 = s3;
                        i15 = i17;
                        iM2567 = C2105.m6981("ܳ᩸") ^ i7;
                        i5 = ((iM2567 ^ i8) * (-26317)) ^ (-614217442);
                        i6 = 1144126220;
                        i10 = iM2567 ^ i6;
                        c14949 = this;
                        i9 = i5;
                    } else {
                        int iM6983 = (C2105.m6981("֨ۧ") + i8) * (-37);
                        i10 = iM6983 ^ 689168882;
                        i9 = ((iM6983 ^ i7) * 10117) ^ (-928258710);
                        s2 = s3;
                        i15 = i17;
                        c14949 = this;
                    }
                    break;
                case -1342916865:
                case -792132777:
                    C4075.m12263();
                    break;
                case -1303411122:
                case 299714238:
                    objCollect = interfaceC17664Filter.collect(C22976.toList());
                    if (!C1504.f5354) {
                        iM6981 = (i7 - C0630.m2566("ۚ᩹")) * (-31);
                        i = ((iM6981 ^ i8) * 14479) ^ 314269687;
                        i2 = -1954802751;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        iM2566 = (C2105.m6981("ۖܺ") ^ i8) * (-71);
                        i3 = ((iM2566 ^ i7) * (-30609)) ^ (-59304460);
                        i4 = 395935739;
                        i10 = iM2566 ^ i4;
                        c14949 = this;
                        s2 = s;
                        i9 = i3;
                    }
                    break;
                case -1010615478:
                case 1445076266:
                    C1005.m3501();
                    s = s2;
                    iM2566 = (C2105.m6981("ۖܺ") ^ i8) * (-71);
                    i3 = ((iM2566 ^ i7) * (-30609)) ^ (-59304460);
                    i4 = 395935739;
                    i10 = iM2566 ^ i4;
                    c14949 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -660187871:
                case 1979991562:
                    objArr[0] = str;
                    sArr = f45574;
                    i11 = 5;
                    if (C2272.f7362) {
                        iM6981 = (i7 - C0630.m2566("᩶֨")) * (-93);
                        i = ((iM6981 ^ i8) * 15337) ^ (-177592830);
                        i2 = 111860452;
                    } else {
                        iM6981 = (i8 - C0630.m2566("ܳ᩻")) * 83;
                        i = ((iM6981 ^ i7) * 15089) ^ 1525833649;
                        i2 = 406346785;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -476440619:
                case 1264238617:
                    s = s2;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("ۖܺ") ^ i8) * (-71);
                        i3 = ((iM2566 ^ i7) * (-30609)) ^ (-59304460);
                        i4 = 395935739;
                    } else {
                        iM2566 = C0630.m2566("ۘ᩷") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-551)) ^ (-1380003269);
                        i4 = -834762479;
                    }
                    i10 = iM2566 ^ i4;
                    c14949 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -177692080:
                case 1935927304:
                    c13876.m33252(i16, (List) objCollect);
                    c13876.m33278();
                    if (C0630.f2410 > 0) {
                        iM6981 = (C2105.m6981("ۘۧ") + i8) * (-57);
                        i = ((iM6981 ^ i7) * 23585) ^ (-1664434533);
                        i2 = -1192657506;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        iM2567 = C2105.m6981("ܳ᩸") ^ i7;
                        i5 = ((iM2567 ^ i8) * (-26317)) ^ (-614217442);
                        i6 = 1144126220;
                        i10 = iM2567 ^ i6;
                        c14949 = this;
                        i9 = i5;
                    }
                    break;
                case -85484049:
                case 369209388:
                    if (i15 - (35856144 + i12) <= 0) {
                        iM6981 = C2105.m6981("᩸ۖ") ^ i7;
                        i = ((iM6981 ^ i8) * 23881) ^ 1364834357;
                        i2 = -1880034142;
                    } else {
                        iM6981 = C2105.m6981("ۚۢ") ^ i8;
                        i = ((iM6981 ^ i7) * 16895) ^ (-1169307655);
                        i2 = -960191135;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 22956525:
                case 380604511:
                    str = c14949.f45576;
                    objArr = new Object[i16];
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C0630.m2566("ۜۖ") ^ i8) * (-11);
                        i = ((iM6981 ^ i7) * 1299) ^ 997848981;
                        i2 = -1176375830;
                    } else {
                        iM6981 = C2105.m6981("֫ۜ") ^ i7;
                        i = ((iM6981 ^ i8) * 9541) ^ (-1487694242);
                        i2 = 2122381139;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 109372864:
                case 1286931809:
                    C2958.m9034();
                    if (C3432.f10845 < 0) {
                        iM6981 = (i8 - C2105.m6981("ۢ۟")) * 73;
                        i = ((iM6981 ^ i7) * (-20051)) ^ (-431340465);
                        i2 = -189977559;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        iM2566 = (C2105.m6981("ۖܺ") ^ i8) * (-71);
                        i3 = ((iM2566 ^ i7) * (-30609)) ^ (-59304460);
                        i4 = 395935739;
                        i10 = iM2566 ^ i4;
                        c14949 = this;
                        s2 = s;
                        i9 = i3;
                    }
                    break;
                case 595498519:
                case 1716764719:
                    s = s2;
                    if (C22628.m50615() != 0) {
                        iM2566 = (C2105.m6981("ۖܺ") ^ i8) * (-71);
                        i3 = ((iM2566 ^ i7) * (-30609)) ^ (-59304460);
                        i4 = 395935739;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۘ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2566 ^ i7) * (-19905)) ^ 1927877410;
                        i4 = -1523141745;
                    }
                    i10 = iM2566 ^ i4;
                    c14949 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case 933632855:
                case 1372047327:
                    C22628.m50606(c9762, C1420.m4906(C0630.m2566(strM13542) ^ 2102975577, objArr));
                    break;
                case 1291135648:
                case 1943020801:
                    i13 = 47528;
                    iM6981 = C0630.m2566("ۗ۟") ^ i7;
                    i = ((iM6981 ^ i8) * (-27301)) ^ 1844540172;
                    i2 = -94530058;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                default:
                    c18076 = c14949.f45579;
                    i16 = 1;
                    if (c18076 == null) {
                        iM6981 = (C2105.m6981("᩹᩺") + i7) * (-11);
                        i = ((iM6981 ^ i8) * (-26151)) ^ 1952184021;
                        i2 = -1253475481;
                    } else {
                        iM6981 = C0630.m2566("ᩳܳ") ^ i8;
                        i = ((iM6981 ^ i7) * 29427) ^ 1243647301;
                        i2 = -182640646;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
            }
            return;
        }
    }
}
