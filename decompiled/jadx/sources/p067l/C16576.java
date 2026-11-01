package p067l;

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
public class C16576 extends AbstractC7545 {

    /* JADX INFO: renamed from: ᩵ܿ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82228 = {8263, -8865, -8895, -8865, 4377, -23115, -21582, -18440, 5442, 16686, 16721, 16723};

    /* JADX INFO: renamed from: ֫֫ */
    public int f48687;

    /* JADX INFO: renamed from: ۗ */
    public String f48688;

    /* JADX INFO: renamed from: ۙ */
    public ArrayList f48689;

    /* JADX INFO: renamed from: ۛ */
    public boolean f48690;

    /* JADX INFO: renamed from: ۟ */
    public C19548 f48691;

    /* JADX INFO: renamed from: ۤ */
    public boolean f48692;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f48693;

    /* JADX INFO: renamed from: ۨ */
    public HashMap f48694;

    /* JADX INFO: renamed from: ۫ */
    public boolean f48695;

    /* JADX INFO: renamed from: ۬ */
    public boolean f48696;

    /* JADX INFO: renamed from: ܰ */
    public String f48697;

    /* JADX INFO: renamed from: ᩺ */
    public String f48698;

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
    /* JADX INFO: renamed from: ᩳ */
    public final Drawable[] m37566() {
        int iM55979;
        int i;
        int i2;
        int i3 = RunnableC0871.f81839;
        int i4 = C0866.f81837;
        int iM55680 = C0873.m55680("ܰᩳ") ^ i3;
        int i5 = ((iM55680 ^ i4) * (-4709)) ^ 568277598;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55680 ^ (-670724382);
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
                    C1044.m56286();
                    if (C1071.f81975 > 0) {
                        iM55979 = (i3 - C0946.m55979("ܿܺ")) * (-119);
                        i = ((iM55979 ^ i4) * (-13351)) ^ (-1994711125);
                        i2 = -1526100738;
                    } else {
                        iM55979 = C0946.m55979("ۨᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-1969)) ^ (-980377675);
                        i2 = -1277780642;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1985567091:
                case -1594665130:
                    sArr2 = f82228;
                    i11 = 9;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("ܽۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    } else {
                        iM55979 = (C0873.m55680("۟۬") + i3) * (-85);
                        i = ((iM55979 ^ i4) * (-32541)) ^ 270749461;
                        i2 = -2017495810;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1808140068:
                case -1022493025:
                    if (C0946.f81894 != 0) {
                        iM55979 = (i3 - C0946.m55979("ܿܺ")) * (-119);
                        i = ((iM55979 ^ i4) * (-13351)) ^ (-1994711125);
                        i2 = -1526100738;
                    } else {
                        iM55979 = (C0873.m55680("۫֡") ^ i3) * 53;
                        i = ((iM55979 ^ i4) * (-4773)) ^ (-1420617113);
                        i2 = 2005874840;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1787934347:
                case -1350951815:
                    return C15556.m35366(AbstractC0942.m55970(sArr2, i11, i12, i10));
                case -1754178091:
                case 1961899272:
                    c = '\b';
                    if (C0890.m55740()) {
                        iM55979 = C0873.m55680("᩹᩷") ^ i3;
                        i = ((iM55979 ^ i4) * 10287) ^ (-270740698);
                        i2 = 795691020;
                    } else {
                        iM55979 = (C0873.m55680("ᩴ֫") + i4) * (-7);
                        i = ((iM55979 ^ i3) * (-5523)) ^ (-1176464824);
                        i2 = 1356029799;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1585742844:
                case 1953589178:
                    throw new RuntimeException();
                case -1492420250:
                case 295258905:
                    sArr3 = f82228;
                    i13 = 10;
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0873.m55680("ᩴ᩶") ^ i3;
                        i = ((iM55979 ^ i4) * (-12319)) ^ 1014987146;
                        i2 = 314578342;
                    } else {
                        iM55979 = C0873.m55680("᩺ܺ") ^ i3;
                        i = ((iM55979 ^ i4) * 22743) ^ (-711592990);
                        i2 = 1993903796;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1331695766:
                case 1828010966:
                    if (C1929.f83011 == 0) {
                        iM55979 = C0946.m55979("ܽۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܿܺ")) * (-119);
                        i = ((iM55979 ^ i4) * (-13351)) ^ (-1994711125);
                        i2 = -1526100738;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1256108403:
                case -117352028:
                    C0967.m56074();
                    return null;
                case -1239197305:
                case 455795818:
                    if (i9 - (s * s2) < 0) {
                        iM55979 = (i4 - C0946.m55979("᩸ۖ")) * (-25);
                        i = ((iM55979 ^ i3) * 26843) ^ 1375598065;
                        i2 = 1909523137;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩹ܺ")) * (-81);
                        i = ((iM55979 ^ i4) * (-10959)) ^ (-560698689);
                        i2 = -1922191683;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1232538007:
                case 29850640:
                    if (i7 != 1) {
                        iM55979 = (i3 - C0946.m55979("ܿܽ")) * (-59);
                        i = ((iM55979 ^ i4) * 21063) ^ 1655949862;
                        i2 = -575172549;
                    } else {
                        iM55979 = (C0946.m55979("ۨܽ") ^ i3) * 119;
                        i = ((iM55979 ^ i4) * (-6257)) ^ (-356110620);
                        i2 = 884357968;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1231685443:
                case 119669045:
                    s = sArr[c];
                    i8 = s * s;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ᩴ᩶") ^ i3;
                        i = ((iM55979 ^ i4) * (-12319)) ^ 1014987146;
                        i2 = 314578342;
                    } else {
                        iM55979 = C0873.m55680("ۚۤ") ^ i4;
                        i = ((iM55979 ^ i3) * (-30731)) ^ (-872380364);
                        i2 = -1747065457;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1227427355:
                case 1107200014:
                    sArr = f82228;
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ᩴ֫") + i4) * (-7);
                        i = ((iM55979 ^ i3) * (-5523)) ^ (-1176464824);
                        i2 = 1356029799;
                    } else {
                        iM55979 = C0946.m55979("ۜ֡") ^ i4;
                        i = ((iM55979 ^ i3) * (-1023)) ^ (-1304639062);
                        i2 = 472806105;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -987257489:
                case 1406866897:
                    i10 = 16749;
                    iM55979 = C0873.m55680("ۙ֨") ^ i3;
                    i = ((iM55979 ^ i4) * (-28569)) ^ (-806490304);
                    i2 = 1090038229;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -949457523:
                case -283095781:
                    i14 = 2;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0946.m55979("ۨᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-1969)) ^ (-980377675);
                        i2 = -1277780642;
                    } else {
                        iM55979 = (C0873.m55680("ۚۘ") + i4) * 93;
                        i = ((iM55979 ^ i3) * 23421) ^ (-1585119302);
                        i2 = 320910752;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -917610358:
                case 1972507902:
                    C0906.m55809();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("ᩴ֫") + i4) * (-7);
                        i = ((iM55979 ^ i3) * (-5523)) ^ (-1176464824);
                        i2 = 1356029799;
                    } else {
                        iM55979 = C0946.m55979("ܽۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -654078059:
                case -652625376:
                    i7 = this.f48693;
                    if (i7 != 0) {
                        int iM55681 = C0873.m55680("ۨ᩶") ^ i4;
                        i5 = ((iM55681 ^ i3) * 6667) ^ (-1290354161);
                        i6 = iM55681 ^ 1772835044;
                    } else {
                        iM55979 = C0873.m55680("᩶۬") ^ i4;
                        i = ((iM55979 ^ i3) * (-2247)) ^ 669633425;
                        i2 = 1451674552;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    }
                    break;
                case -584847523:
                case 300252887:
                    RunnableC1014.m56177();
                    C1003.m56123();
                    iM55979 = (C0873.m55680("ᩴ֫") + i4) * (-7);
                    i = ((iM55979 ^ i3) * (-5523)) ^ (-1176464824);
                    i2 = 1356029799;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -431665705:
                case 1141663522:
                    i10 = 4616;
                    iM55979 = C0873.m55680("ۙ֨") ^ i3;
                    i = ((iM55979 ^ i4) * (-28569)) ^ (-806490304);
                    i2 = 1090038229;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -408968211:
                case 50680125:
                    return C15556.m35366(RunnableC0871.m55667(sArr3, i13, i14, i10));
                case -97935124:
                case 1224632518:
                    i9 = i8 + 7661824;
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("ᩴ֫") + i4) * (-7);
                        i = ((iM55979 ^ i3) * (-5523)) ^ (-1176464824);
                        i2 = 1356029799;
                    } else {
                        iM55979 = C0946.m55979("ܶ۠") ^ i4;
                        i = ((iM55979 ^ i3) * 8479) ^ (-500994278);
                        i2 = -1030497902;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1250899738:
                case 1488216522:
                    i12 = 1;
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0946.m55979("ܽۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    } else {
                        iM55979 = C0946.m55979("ᩴۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 2363) ^ 920479544;
                        i2 = 1884975242;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1355828114:
                case 1586893550:
                    if (i7 == 2) {
                        iM55979 = (C0946.m55979("ۨܽ") ^ i3) * 119;
                        i = ((iM55979 ^ i4) * (-6257)) ^ (-356110620);
                        i2 = 884357968;
                    } else {
                        iM55979 = (C0873.m55680("᩹ۧ") + i4) * 35;
                        i = ((iM55979 ^ i3) * (-27295)) ^ (-613758910);
                        i2 = 591305431;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    s2 = 5536;
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ܽۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 4243) ^ (-1749439);
                        i2 = 1155069879;
                    } else {
                        iM55979 = (C0946.m55979("ۨۖ") ^ i3) * 5;
                        i = ((iM55979 ^ i4) * (-29223)) ^ (-864288069);
                        i2 = -1211831870;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0250  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (p067l.C0912.f81867 > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (p067l.C0877.f81843 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
    
        if (p067l.AbstractC0942.m55971() != false) goto L8;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m37564(String str, String str2) {
        int iM55979;
        int i;
        int i2;
        short s;
        int iM559710;
        int i3;
        int iM55680;
        int i4;
        C16576 c16576 = this;
        String strM56462 = null;
        StringBuilder sb = null;
        String strM26414 = null;
        int i5 = 0;
        StringBuilder sb2 = null;
        String strM26415 = null;
        String strM51852 = null;
        String strM51853 = null;
        int i6 = 0;
        int i7 = -1822877261;
        int i8 = C0949.f81897;
        int i9 = C1071.f81975;
        int iM55681 = (C0873.m55680("ܶۧ") ^ i8) * 67;
        int i10 = ((iM55681 ^ i9) * (-18773)) ^ 314566933;
        int i11 = iM55681 ^ 200425941;
        int i12 = 0;
        int i13 = 0;
        boolean zM55806 = false;
        short s2 = 0;
        short[] sArr = null;
        short[] sArr2 = null;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * 18559) >> 31));
            switch (i7) {
                case -2029968226:
                case 1327073465:
                    if (str != null) {
                        iM55979 = C0873.m55680("ۖ֡") ^ i9;
                        i = ((iM55979 ^ i8) * (-9521)) ^ 2129505324;
                        i2 = -1056801596;
                    } else {
                        iM55979 = (i8 - C0873.m55680("ۢ᩺")) * (-89);
                        i = ((iM55979 ^ i9) * 18765) ^ (-1883114430);
                        i2 = -977266511;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -2020805523:
                case 494883366:
                    s = s2;
                    sArr = f82228;
                    if (C0894.f81854 >= 0) {
                        iM559710 = C0873.m55680("ۡۢ") ^ i9;
                        i10 = ((iM559710 ^ i8) * 499) ^ 370211954;
                        i3 = -1333063889;
                    } else {
                        iM559710 = C0946.m55979("᩶ۙ") ^ i8;
                        i10 = ((iM559710 ^ i9) * 18233) ^ 1925369087;
                        i3 = 2136744061;
                    }
                    i11 = iM559710 ^ i3;
                    c16576 = this;
                    s2 = s;
                    break;
                case -1931257328:
                case -976767032:
                    strM51852 = ActivityC23283.m51852(i5, str);
                    strM51853 = ActivityC23283.m51852(i5, str2);
                    if (C0906.m55806(strM51852, strM51853)) {
                        iM55979 = (C0946.m55979("ۙ֨") + i9) * 29;
                        i = ((iM55979 ^ i8) * (-8539)) ^ 1365916811;
                        i2 = -1725747674;
                    } else {
                        iM55979 = C0946.m55979("ۛۡ") ^ i9;
                        i = ((iM55979 ^ i8) * (-18911)) ^ (-1572154190);
                        i2 = -1214929506;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1859215304:
                case 1622920458:
                    c16576.f48698 = C24104.m53357(strM51852, strM56462, strM51853);
                    break;
                case -1804512083:
                case 963655804:
                    C0912.m55825(sb2, strM26415);
                    C0912.m55825(sb2, strM56462);
                    if (C0890.f81849 == 0) {
                        iM55979 = C0873.m55680("۠᩺") ^ i9;
                        i = ((iM55979 ^ i8) * (-14969)) ^ 1110277073;
                        i2 = -2144001526;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM559710 = C0873.m55680("֡᩹") ^ i8;
                        i10 = ((iM559710 ^ i9) * (-3825)) ^ 1089402107;
                        i3 = -666562594;
                        i11 = iM559710 ^ i3;
                        c16576 = this;
                        s2 = s;
                    }
                    break;
                case -1775235634:
                case 1546501209:
                    break;
                case -1711762669:
                case -383644395:
                    sb2 = new StringBuilder();
                    strM26415 = C11419.m26414(str);
                    if (C1229.f82066 < 0) {
                        iM55979 = C0946.m55979("ܽۛ") ^ i8;
                        i = ((iM55979 ^ i9) * 26649) ^ 1024978633;
                        i2 = 1294417845;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM559710 = C0873.m55680("ۡۢ") ^ i9;
                        i10 = ((iM559710 ^ i8) * 499) ^ 370211954;
                        i3 = -1333063889;
                        i11 = iM559710 ^ i3;
                        c16576 = this;
                        s2 = s;
                    }
                    break;
                case -1608809083:
                case 812640999:
                    C1028.m56247();
                    break;
                case -1509320840:
                case -811568038:
                    s2 = sArr[0];
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("ۗۡ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-11543)) ^ (-792017522);
                        i4 = 383053517;
                    } else {
                        iM55680 = (i9 - C0873.m55680("᩸ܶ")) * 31;
                        i10 = ((iM55680 ^ i8) * 10567) ^ 2077441344;
                        i4 = -11676374;
                    }
                    i11 = iM55680 ^ i4;
                    c16576 = this;
                    break;
                case -1500638384:
                case -821022491:
                    C0912.m55825(sb2, C11419.m26414(str2));
                    c16576.f48698 = C0863.m55639(sb2);
                    iM55979 = (i8 - C0873.m55680("ۢ᩺")) * (-89);
                    i = ((iM55979 ^ i9) * 18765) ^ (-1883114430);
                    i2 = -977266511;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1276812421:
                case 1084797890:
                    strM56462 = C1404.m56462(sArr2, i12, 3, i6);
                    if (zM55806) {
                        iM55979 = C0946.m55979("᩷֡") ^ i8;
                        i = ((iM55979 ^ i9) * (-9369)) ^ 1095494899;
                        i2 = 517457424;
                    } else {
                        iM55979 = (C0873.m55680("ۖۗ") + i9) * 47;
                        i = ((iM55979 ^ i8) * (-415)) ^ 555136244;
                        i2 = 1763462677;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1258508205:
                case -816611797:
                    break;
                case -947752900:
                case 84641339:
                    sb = new StringBuilder();
                    strM26414 = C11419.m26414(str);
                    if (C0898.f81858 > 0) {
                        iM55979 = C0873.m55680("᩻ܳ") ^ i8;
                        i = ((iM55979 ^ i9) * 4931) ^ (-595530506);
                        i2 = -1335169621;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM559710 = (i8 - C0946.m55979("ۗ֡")) * 19;
                        i10 = ((iM559710 ^ i9) * 265) ^ 952821682;
                        i3 = 1041898876;
                        i11 = iM559710 ^ i3;
                        c16576 = this;
                        s2 = s;
                    }
                    break;
                case -792449462:
                case 753864268:
                    if (i5 < 10) {
                        iM55979 = (C0873.m55680("᩹ۜ") + i8) * 77;
                        i = ((iM55979 ^ i9) * 2715) ^ 1450734191;
                        i2 = -320710715;
                    } else {
                        iM55979 = C0873.m55680("᩸֡") ^ i9;
                        i = ((iM55979 ^ i8) * 16447) ^ (-452651785);
                        i2 = -811931140;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -721044028:
                case 1754333176:
                    i6 = 57380;
                    iM55979 = (C0946.m55979("֡ᩳ") ^ i8) * (-41);
                    i = ((iM55979 ^ i9) * (-25397)) ^ (-1191390749);
                    i2 = 2117563061;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -685532986:
                case 1350893025:
                    zM55806 = C0906.m55806(str, str2);
                    sArr2 = f82228;
                    i12 = 1;
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM55979 = C0946.m55979("ۚ᩵") ^ i8;
                        i = ((iM55979 ^ i9) * (-29055)) ^ (-340434940);
                        i2 = -1711353537;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM559710 = (C0946.m55979("᩶ۨ") + i8) * (-33);
                        i10 = ((iM559710 ^ i9) * 1489) ^ 54040685;
                        i3 = -1917659063;
                        i11 = iM559710 ^ i3;
                        c16576 = this;
                        s2 = s;
                    }
                    break;
                case -475331520:
                case 786907425:
                    C0912.m55825(sb, C11419.m26414(str2));
                    c16576.f48698 = C0863.m55639(sb);
                    break;
                case -407274609:
                case 926242944:
                    if (str2 == null) {
                        iM55979 = (i8 - C0873.m55680("ۢ᩺")) * (-89);
                        i = ((iM55979 ^ i9) * 18765) ^ (-1883114430);
                        i2 = -977266511;
                    } else {
                        iM55979 = (i9 - C0946.m55979("᩷ۜ")) * 25;
                        i = ((iM55979 ^ i8) * 4661) ^ (-685736562);
                        i2 = -1736242462;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -361786096:
                case -11320494:
                    s = s2;
                    if (C1964.f83032 <= 0) {
                        iM559710 = C0873.m55680("֡᩹") ^ i8;
                        i10 = ((iM559710 ^ i9) * (-3825)) ^ 1089402107;
                        i3 = -666562594;
                    } else {
                        iM559710 = (C0946.m55979("ۚۧ") + i9) * 57;
                        i10 = ((iM559710 ^ i8) * (-27567)) ^ (-2051788863);
                        i3 = -650272226;
                    }
                    i11 = iM559710 ^ i3;
                    c16576 = this;
                    s2 = s;
                    break;
                case -96221707:
                case 1617661847:
                    i5++;
                    iM55979 = (C0946.m55979("ܽۜ") ^ i8) * 71;
                    i = ((iM55979 ^ i9) * (-9783)) ^ 192196833;
                    i2 = -1775002203;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -63227767:
                case 2033766139:
                    s = s2;
                    if (C0854.f81826 != 0) {
                        iM559710 = (C0946.m55979("᩶ۨ") + i8) * (-33);
                        i10 = ((iM559710 ^ i9) * 1489) ^ 54040685;
                        i3 = -1917659063;
                    } else {
                        iM559710 = (i8 - C0873.m55680("֨ۗ")) * (-55);
                        i10 = ((iM559710 ^ i9) * (-23759)) ^ 633657524;
                        i3 = 1408259529;
                    }
                    i11 = iM559710 ^ i3;
                    c16576 = this;
                    s2 = s;
                    break;
                case 18041600:
                case 1394211385:
                    C1124.m56367();
                    break;
                case 142876782:
                case 524689992:
                    C1012.m56134();
                    break;
                case 188752124:
                case 1326868500:
                    s = s2;
                    i13 = (s * s) + 22686169;
                    if (C0892.f81851) {
                        iM559710 = (C0873.m55680("֡᩶") ^ i9) * (-15);
                        i10 = ((iM559710 ^ i8) * (-7369)) ^ 1538255224;
                        i3 = -181256466;
                    } else {
                        iM559710 = (i8 - C0946.m55979("ۗ֡")) * 19;
                        i10 = ((iM559710 ^ i9) * 265) ^ 952821682;
                        i3 = 1041898876;
                    }
                    i11 = iM559710 ^ i3;
                    c16576 = this;
                    s2 = s;
                    break;
                case 404510489:
                case 1765760405:
                    C1003.m56121(sb, strM26414);
                    C0912.m55825(sb, strM56462);
                    if (C0967.f81910 < 0) {
                        iM55979 = (C0946.m55979("ۧܰ") ^ i9) * (-31);
                        i = ((iM55979 ^ i8) * 21823) ^ 567561904;
                        i2 = -1393458551;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        s = s2;
                        iM559710 = (C0946.m55979("᩶ۨ") + i8) * (-33);
                        i10 = ((iM559710 ^ i9) * 1489) ^ 54040685;
                        i3 = -1917659063;
                        i11 = iM559710 ^ i3;
                        c16576 = this;
                        s2 = s;
                    }
                    break;
                case 954749540:
                case 1994364385:
                    C0906.m55809();
                    C1964.m56597();
                    s = s2;
                    iM559710 = C0873.m55680("֡᩹") ^ i8;
                    i10 = ((iM559710 ^ i9) * (-3825)) ^ 1089402107;
                    i3 = -666562594;
                    i11 = iM559710 ^ i3;
                    c16576 = this;
                    s2 = s;
                    break;
                case 1269864359:
                case 1975140538:
                    i5 = 1;
                    iM55979 = (C0946.m55979("ܽۜ") ^ i8) * 71;
                    i = ((iM55979 ^ i9) * (-9783)) ^ 192196833;
                    i2 = -1775002203;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case 1305346454:
                case 1312525323:
                    s = s2;
                    if (i13 - (s * 9526) >= 0) {
                        iM559710 = (C0946.m55979("ۛܳ") ^ i8) * 73;
                        i10 = ((iM559710 ^ i9) * 12153) ^ (-1143083397);
                        i3 = -1593011226;
                        i11 = iM559710 ^ i3;
                        c16576 = this;
                        s2 = s;
                    } else {
                        int iM559711 = C0946.m55979("ܿ᩶") ^ i9;
                        i11 = iM559711 ^ 1311496751;
                        i10 = ((iM559711 ^ i8) * (-30835)) ^ 486994561;
                        s2 = s;
                        c16576 = this;
                    }
                    break;
                default:
                    i6 = 56703;
                    iM55979 = (C0946.m55979("֡ᩳ") ^ i8) * (-41);
                    i = ((iM55979 ^ i9) * (-25397)) ^ (-1191390749);
                    i2 = 2117563061;
                    i11 = iM55979 ^ i2;
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
    public C16576() {
        int iM55979;
        int i;
        int i2 = -262579110;
        int i3 = C1028.f81950;
        int i4 = C0873.f81841;
        int iM55680 = (C0873.m55680("᩻᩶") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i5 = ((iM55680 ^ i3) * (-27705)) ^ (-1857787651);
        int i6 = -1275424867;
        while (true) {
            int i7 = iM55680 ^ i6;
            HashMap map = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-6715)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1508674000:
                    case -301466051:
                        if (C0930.m55885() <= 0) {
                            iM55979 = (C0946.m55979("᩸֨") ^ i3) * (-117);
                            i5 = ((iM55979 ^ i4) * (-6631)) ^ 1221028986;
                            i = -1357699061;
                        } else {
                            iM55979 = (C0946.m55979("᩵ۨ") ^ i3) * (-107);
                            i5 = ((iM55979 ^ i4) * 3029) ^ 651619011;
                            i = 1184774287;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1394263626:
                    case 1961616813:
                        if (!C0863.m55643()) {
                        }
                        map = new HashMap();
                        if (ServiceConnectionC1013.f81940 >= 0) {
                            iM55979 = C0873.m55680("۬᩶") ^ i3;
                            i5 = ((iM55979 ^ i4) * 16527) ^ 793955385;
                            i = 1832617965;
                        } else {
                            iM55979 = (i4 - C0946.m55979("ܿ᩹")) * (-17);
                            i5 = ((iM55979 ^ i3) * (-4799)) ^ 603720395;
                            i = -408211538;
                        }
                        i7 = iM55979 ^ i;
                        break;
                        break;
                    case -857016046:
                    case -843795824:
                        C0890.m55740();
                        if (C1124.m56367() >= 0) {
                        }
                        iM55979 = (C0946.m55979("۠ۜ") + i3) * (-47);
                        i5 = ((iM55979 ^ i4) * 14409) ^ (-539331134);
                        i = -816228517;
                        i7 = iM55979 ^ i;
                        break;
                    case -844410648:
                    case 1478491014:
                        C1404.m56468();
                        C0866.m55645();
                        throw new RuntimeException();
                    case -760582678:
                    case 609620807:
                        C1124.m56367();
                        C1003.m56123();
                        break;
                    case 4852465:
                    case 1215430728:
                        if (AbstractC0942.f81890 <= 0) {
                            iM55979 = C0873.m55680("۬᩶") ^ i3;
                            i5 = ((iM55979 ^ i4) * 16527) ^ 793955385;
                            i = 1832617965;
                        } else {
                            iM55979 = C0946.m55979("ۘܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 1861) ^ 1657570131;
                            i = -56409581;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 199376386:
                    case 808540764:
                        if (RunnableC0938.f81886 < 0) {
                            iM55979 = (C0946.m55979("۠ۜ") + i3) * (-47);
                            i5 = ((iM55979 ^ i4) * 14409) ^ (-539331134);
                            i = -816228517;
                        } else {
                            iM55979 = (C0946.m55979("᩸֨") ^ i3) * (-117);
                            i5 = ((iM55979 ^ i4) * (-6631)) ^ 1221028986;
                            i = -1357699061;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 416550811:
                    case 1868309195:
                        if (C0892.m55749()) {
                            iM55979 = (C0873.m55680("ۢۡ") ^ i3) * (-67);
                            i5 = ((iM55979 ^ i4) * (-12337)) ^ 694850711;
                            i = 1642458975;
                        } else {
                            iM55979 = C0873.m55680("ۛܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29657) ^ (-1726723397);
                            i = -1772434026;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 513933012:
                    case 1454447837:
                        if (RunnableC0938.m55938() != 0) {
                            iM55979 = C0873.m55680("ۛܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29657) ^ (-1726723397);
                            i = -1772434026;
                        } else {
                            iM55979 = C0946.m55979("ۡ᩵") ^ i3;
                            i5 = ((iM55979 ^ i4) * 5311) ^ 554255343;
                            i = 1263058632;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 711318506:
                    case 1143976097:
                        if (C0854.f81826 != 0) {
                            iM55979 = C0873.m55680("۬᩶") ^ i3;
                            i5 = ((iM55979 ^ i4) * 16527) ^ 793955385;
                            i = 1832617965;
                        } else {
                            iM55979 = (C0873.m55680("۠᩵") + i4) * (-75);
                            i5 = ((iM55979 ^ i3) * (-2003)) ^ 1768166339;
                            i = 1933724419;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 764483993:
                    case 1085722463:
                        if (C1964.f83032 <= 0) {
                            iM55979 = C0873.m55680("ۛܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29657) ^ (-1726723397);
                            i = -1772434026;
                        } else {
                            iM55979 = (i4 - C0873.m55680("ᩳ۠")) * (-35);
                            i5 = ((iM55979 ^ i3) * 1823) ^ (-1312593120);
                            i = -2104206098;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 1103380073:
                    case 1521263318:
                        this.f48693 = -1;
                        if (C1048.f81963) {
                            iM55979 = (C0946.m55979("۠ۙ") ^ i3) * (-19);
                            i5 = ((iM55979 ^ i4) * (-30541)) ^ 1106136423;
                            i = 363336868;
                        } else {
                            iM55979 = (C0946.m55979("᩸֨") ^ i3) * (-117);
                            i5 = ((iM55979 ^ i4) * (-6631)) ^ 1221028986;
                            i = -1357699061;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 1362799788:
                    case 1744530991:
                        C0930.m55885();
                        if (C0863.f81833 > 0) {
                            iM55979 = (C0946.m55979("۠ۜ") + i3) * (-47);
                            i5 = ((iM55979 ^ i4) * 14409) ^ (-539331134);
                            i = -816228517;
                        } else {
                            iM55979 = C0873.m55680("ۛܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29657) ^ (-1726723397);
                            i = -1772434026;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    default:
                        this.f48694 = map;
                        if (AbstractC0942.f81890 > 0) {
                            this.f48689 = new ArrayList();
                            return;
                        }
                        iM55979 = C0873.m55680("ۛܽ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 29657) ^ (-1726723397);
                        i = -1772434026;
                        i7 = iM55979 ^ i;
                        break;
                }
            }
            iM55680 = (C0873.m55680("ۛۜ") + i4) * 57;
            i5 = ((iM55680 ^ i3) * 13285) ^ 2109894364;
            i6 = 1770644649;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x02ed A[PHI: r1 r7
      0x02ed: PHI (r1v84 short) = (r1v47 short), (r1v48 short), (r1v85 short) binds: [B:75:0x02eb, B:71:0x02cb, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02ed: PHI (r7v8 java.lang.Object) = (r7v2 java.lang.Object), (r7v2 java.lang.Object), (r7v9 java.lang.Object) binds: [B:75:0x02eb, B:71:0x02cb, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final void m37565(C1326 c1326, C15556 c15556, Set set) {
        int iM55979;
        int i;
        int i2;
        short s;
        int iM55680;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        C16576 c16576 = this;
        c1326 = c1326;
        int i7 = C0898.f81858;
        int i8 = C1012.f81938;
        int iM559710 = C0946.m55979("ۧۧ") ^ i8;
        int i9 = ((iM559710 ^ i7) * (-7273)) ^ 882300472;
        String strM56336 = null;
        short[] sArr = null;
        int i10 = iM559710 ^ (-1771433505);
        final C19548 c19548 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = -346066403;
        int i15 = 0;
        Object[] objArr = null;
        String str = null;
        Object objCollect = null;
        InterfaceC19157 interfaceC19157Filter = null;
        int i16 = 0;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i7) * (-16905)) >> 31));
            switch (i14) {
                case -2113957488:
                case 627559987:
                    if (RunnableC0938.f81886 < 0) {
                        iM55979 = (i7 - C0873.m55680("᩶֨")) * (-93);
                        i = ((iM55979 ^ i8) * 15337) ^ (-177592830);
                        i2 = 111860452;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    }
                    iM55979 = (i8 - C0946.m55979("ۢ۟")) * 73;
                    i = ((iM55979 ^ i7) * (-20051)) ^ (-431340465);
                    i2 = -189977559;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -2022193100:
                case 1301736239:
                    i13 = 13044;
                    iM55979 = C0873.m55680("ۗ۟") ^ i7;
                    i = ((iM55979 ^ i8) * (-27301)) ^ 1844540172;
                    i2 = -94530058;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1993893950:
                case 392575130:
                    c15556.m35371(i16, set);
                    c15556.m35397();
                    C1929.m56564(c1326, c16576.f48698);
                    break;
                case -1769250086:
                case -960864186:
                    s2 = f82228[4];
                    if (C1036.f81953 >= 0) {
                        iM55681 = C0946.m55979("ܳ᩸") ^ i7;
                        i5 = ((iM55681 ^ i8) * (-26317)) ^ (-614217442);
                        i6 = 1144126220;
                    } else {
                        iM55681 = (i7 - C0873.m55680("ᩳܽ")) * (-119);
                        i5 = ((iM55681 ^ i8) * (-9103)) ^ (-10363590);
                        i6 = -1558884402;
                    }
                    i10 = iM55681 ^ i6;
                    c16576 = this;
                    i9 = i5;
                    break;
                case -1763392034:
                case -274734170:
                    C0866.m55645();
                    if (C1017.f81942 >= 0) {
                        iM55681 = C0946.m55979("ܳ᩸") ^ i7;
                        i5 = ((iM55681 ^ i8) * (-26317)) ^ (-614217442);
                        i6 = 1144126220;
                        i10 = iM55681 ^ i6;
                        c16576 = this;
                        i9 = i5;
                    }
                    s = s2;
                    iM55680 = (C0946.m55979("ۖܺ") ^ i8) * (-71);
                    i3 = ((iM55680 ^ i7) * (-30609)) ^ (-59304460);
                    i4 = 395935739;
                    i10 = iM55680 ^ i4;
                    c16576 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -1657533961:
                case 1074429938:
                    interfaceC19157Filter = C0949.m56009(set).filter(new Predicate() { // from class: l.۠ۖ᩷
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C20697.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo55838negate() {
                            return C20697.$default$negate(this);
                        }

                        /* JADX INFO: renamed from: or */
                        public /* synthetic */ Predicate m23146or(Predicate predicate) {
                            return C20697.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            String str2 = null;
                            int i17 = -1651618295;
                            int i18 = C0863.f81833;
                            int i19 = C0906.f81862;
                            int iM559711 = C0946.m55979("ۖۡ") ^ i18;
                            int i20 = ((iM559711 ^ i19) * 21147) ^ 502583912;
                            int i21 = 1539085312;
                            while (true) {
                                i17 = ((((i17 ^ i19) * (-7255)) >> 31) & i20) ^ (iM559711 ^ i21);
                                switch (i17) {
                                    case -1957098991:
                                    case 880180322:
                                        if (C0898.f81858 <= 0) {
                                            iM559711 = (C0873.m55680("ۨ۟") + i19) * (-93);
                                            i20 = ((iM559711 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM559711 = C0946.m55979("ۢۡ") ^ i18;
                                            i20 = ((iM559711 ^ i19) * (-15807)) ^ (-485214897);
                                            i21 = -2127386002;
                                        }
                                        break;
                                    case -1713818288:
                                    case -696821686:
                                        if (C1929.f83011 != 0) {
                                            iM559711 = (C0873.m55680("ۨ۟") + i19) * (-93);
                                            i20 = ((iM559711 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM559711 = (C0946.m55979("ۘܽ") + i18) * 47;
                                            i20 = ((iM559711 ^ i19) * (-14617)) ^ 200107612;
                                            i21 = 723623222;
                                        }
                                        break;
                                    case -1612556241:
                                    case -1317871074:
                                        if (C1053.f81965 <= 0) {
                                            iM559711 = C0946.m55979("֨ۤ") ^ i18;
                                            i20 = ((iM559711 ^ i19) * 17325) ^ (-2126945656);
                                            i21 = 681523722;
                                        } else {
                                            iM559711 = (i18 - C0873.m55680("ۡۚ")) * (-55);
                                            i20 = ((iM559711 ^ i19) * 28729) ^ (-1232630293);
                                            i21 = 1358118652;
                                        }
                                        break;
                                    case -1525128044:
                                    case -1358890959:
                                        if (C0894.f81854 >= 0) {
                                            iM559711 = (C0873.m55680("ۨ۟") + i19) * (-93);
                                            i20 = ((iM559711 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM559711 = (i19 - C0946.m55979("ܺ۬")) * 19;
                                            i20 = ((iM559711 ^ i18) * (-30537)) ^ 1531379015;
                                            i21 = 1290175269;
                                        }
                                        break;
                                    case -1287549420:
                                    case -810532130:
                                        C1053.m56327();
                                        C0992.m56107();
                                        return false;
                                    case -1200092788:
                                    case -1191954169:
                                        if (C0937.f81884) {
                                            iM559711 = C0873.m55680("ܿ᩸") ^ i19;
                                            i20 = ((iM559711 ^ i18) * 25053) ^ 747378361;
                                            i21 = -30922722;
                                        } else {
                                            iM559711 = C0873.m55680("᩹ۤ") ^ i18;
                                            i20 = ((iM559711 ^ i19) * 21683) ^ 1242022233;
                                            i21 = -443383476;
                                        }
                                        break;
                                    case -1161238894:
                                    case 1361077548:
                                        if (C1929.m56553()) {
                                            iM559711 = (C0946.m55979("۫۟") ^ i19) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i20 = ((iM559711 ^ i18) * 25029) ^ 605480549;
                                            i21 = -1451578137;
                                        } else {
                                            iM559711 = C0946.m55979("۠᩷") ^ i18;
                                            i20 = ((iM559711 ^ i19) * 1903) ^ (-1532977233);
                                            i21 = 1172002512;
                                        }
                                        break;
                                    case -1061461565:
                                    case 1306276086:
                                        if (C1012.f81938 < 0) {
                                            iM559711 = (i18 - C0946.m55979("ᩴ᩻")) * (-97);
                                            i20 = ((iM559711 ^ i19) * 22501) ^ 1852154287;
                                            i21 = -1496694058;
                                        } else {
                                            iM559711 = (C0873.m55680("ۨ۟") + i19) * (-93);
                                            i20 = ((iM559711 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        }
                                        break;
                                    case -782817090:
                                    case 920002320:
                                        C0949.m56012();
                                        iM559711 = (C0873.m55680("ۨ۟") + i19) * (-93);
                                        i20 = ((iM559711 ^ i18) * 20329) ^ (-998868811);
                                        i21 = -624688462;
                                        break;
                                    case -494897652:
                                    case -42272314:
                                        if (C1229.f82066 >= 0) {
                                            iM559711 = (C0946.m55979("۫۟") ^ i19) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i20 = ((iM559711 ^ i18) * 25029) ^ 605480549;
                                            i21 = -1451578137;
                                        } else {
                                            iM559711 = (i18 - C0946.m55979("ᩴ᩻")) * (-97);
                                            i20 = ((iM559711 ^ i19) * 22501) ^ 1852154287;
                                            i21 = -1496694058;
                                        }
                                        break;
                                    case 144942874:
                                    case 1563490886:
                                        str2 = (String) obj;
                                        if (C0927.f81875) {
                                            iM559711 = C0946.m55979("֨ۤ") ^ i18;
                                            i20 = ((iM559711 ^ i19) * 17325) ^ (-2126945656);
                                            i21 = 681523722;
                                        } else {
                                            iM559711 = C0873.m55680("᩺ۘ") ^ i19;
                                            i20 = ((iM559711 ^ i18) * (-29601)) ^ 1886414527;
                                            i21 = -1199145348;
                                        }
                                        break;
                                    case 242137697:
                                    case 812961591:
                                        if (C1229.f82066 >= 0) {
                                            iM559711 = C0873.m55680("᩹ۤ") ^ i18;
                                            i20 = ((iM559711 ^ i19) * 21683) ^ 1242022233;
                                            i21 = -443383476;
                                        } else {
                                            iM559711 = (C0873.m55680("ۨ۟") + i19) * (-93);
                                            i20 = ((iM559711 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        }
                                        break;
                                    case 395178953:
                                    case 960410042:
                                        return c19548.m44389(C11419.m26414(str2));
                                    case 501741026:
                                    case 1901255864:
                                        if (C1025.f81947 >= 0) {
                                            iM559711 = (C0873.m55680("ۨ۟") + i19) * (-93);
                                            i20 = ((iM559711 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM559711 = (C0946.m55979("ۛ᩺") + i19) * (-93);
                                            i20 = ((iM559711 ^ i18) * 6579) ^ (-1274095874);
                                            i21 = 1560839132;
                                        }
                                        break;
                                    case 1129778634:
                                    case 1162334361:
                                        if (ServiceConnectionC1013.m56157() <= 0) {
                                            iM559711 = (C0873.m55680("ۨ۟") + i19) * (-93);
                                            i20 = ((iM559711 ^ i18) * 20329) ^ (-998868811);
                                            i21 = -624688462;
                                        } else {
                                            iM559711 = (C0946.m55979("۟۟") ^ i18) * 21;
                                            i20 = ((iM559711 ^ i19) * 16989) ^ 816690819;
                                            i21 = -1370755359;
                                        }
                                        break;
                                    default:
                                        if (C0930.m55885() <= 0) {
                                            iM559711 = C0946.m55979("֨ۤ") ^ i18;
                                            i20 = ((iM559711 ^ i19) * 17325) ^ (-2126945656);
                                            i21 = 681523722;
                                        } else {
                                            iM559711 = (C0873.m55680("ۙ᩻") + i19) * (-37);
                                            i20 = ((iM559711 ^ i18) * (-20011)) ^ (-1624438964);
                                            i21 = -1026951929;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    if (C0845.f81821 >= 0) {
                        iM55979 = (i8 - C0946.m55979("ۢ۟")) * 73;
                        i = ((iM55979 ^ i7) * (-20051)) ^ (-431340465);
                        i2 = -189977559;
                    } else {
                        iM55979 = (C0873.m55680("᩸ۡ") ^ i8) * (-15);
                        i = ((iM55979 ^ i7) * (-9869)) ^ (-749231829);
                        i2 = -772875649;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1385119583:
                case -11607592:
                    strM56336 = C1071.m56336(sArr, i11, 3, i13);
                    if (!C0877.m55696()) {
                        iM55979 = (i8 - C0946.m55979("ۢ۟")) * 73;
                        i = ((iM55979 ^ i7) * (-20051)) ^ (-431340465);
                        i2 = -189977559;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        int iM55682 = C0873.m55680("۫᩺") ^ i7;
                        i5 = ((iM55682 ^ i8) * (-31387)) ^ 554266723;
                        i10 = iM55682 ^ 1059253360;
                        i9 = i5;
                    }
                    break;
                case -1355436736:
                case 108980796:
                    short s3 = s2;
                    int i17 = s3 * 11976;
                    i12 = s3 * s3;
                    if (AbstractC0942.f81890 <= 0) {
                        s2 = s3;
                        i15 = i17;
                        iM55681 = C0946.m55979("ܳ᩸") ^ i7;
                        i5 = ((iM55681 ^ i8) * (-26317)) ^ (-614217442);
                        i6 = 1144126220;
                        i10 = iM55681 ^ i6;
                        c16576 = this;
                        i9 = i5;
                    } else {
                        int iM559711 = (C0946.m55979("֨ۧ") + i8) * (-37);
                        i10 = iM559711 ^ 689168882;
                        i9 = ((iM559711 ^ i7) * 10117) ^ (-928258710);
                        s2 = s3;
                        i15 = i17;
                        c16576 = this;
                    }
                    break;
                case -1342916865:
                case -792132777:
                    C1044.m56286();
                    break;
                case -1303411122:
                case 299714238:
                    objCollect = interfaceC19157Filter.collect(C24205.toList());
                    if (!C0917.f81868) {
                        iM55979 = (i7 - C0873.m55680("ۚ᩹")) * (-31);
                        i = ((iM55979 ^ i8) * 14479) ^ 314269687;
                        i2 = -1954802751;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        iM55680 = (C0946.m55979("ۖܺ") ^ i8) * (-71);
                        i3 = ((iM55680 ^ i7) * (-30609)) ^ (-59304460);
                        i4 = 395935739;
                        i10 = iM55680 ^ i4;
                        c16576 = this;
                        s2 = s;
                        i9 = i3;
                    }
                    break;
                case -1010615478:
                case 1445076266:
                    C0892.m55749();
                    s = s2;
                    iM55680 = (C0946.m55979("ۖܺ") ^ i8) * (-71);
                    i3 = ((iM55680 ^ i7) * (-30609)) ^ (-59304460);
                    i4 = 395935739;
                    i10 = iM55680 ^ i4;
                    c16576 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -660187871:
                case 1979991562:
                    objArr[0] = str;
                    sArr = f82228;
                    i11 = 5;
                    if (C0955.f81898) {
                        iM55979 = (i7 - C0873.m55680("᩶֨")) * (-93);
                        i = ((iM55979 ^ i8) * 15337) ^ (-177592830);
                        i2 = 111860452;
                    } else {
                        iM55979 = (i8 - C0873.m55680("ܳ᩻")) * 83;
                        i = ((iM55979 ^ i7) * 15089) ^ 1525833649;
                        i2 = 406346785;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -476440619:
                case 1264238617:
                    s = s2;
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0946.m55979("ۖܺ") ^ i8) * (-71);
                        i3 = ((iM55680 ^ i7) * (-30609)) ^ (-59304460);
                        i4 = 395935739;
                    } else {
                        iM55680 = C0873.m55680("ۘ᩷") ^ i7;
                        i3 = ((iM55680 ^ i8) * (-551)) ^ (-1380003269);
                        i4 = -834762479;
                    }
                    i10 = iM55680 ^ i4;
                    c16576 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -177692080:
                case 1935927304:
                    c15556.m35371(i16, (List) objCollect);
                    c15556.m35397();
                    if (C0873.f81841 > 0) {
                        iM55979 = (C0946.m55979("ۘۧ") + i8) * (-57);
                        i = ((iM55979 ^ i7) * 23585) ^ (-1664434533);
                        i2 = -1192657506;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        iM55681 = C0946.m55979("ܳ᩸") ^ i7;
                        i5 = ((iM55681 ^ i8) * (-26317)) ^ (-614217442);
                        i6 = 1144126220;
                        i10 = iM55681 ^ i6;
                        c16576 = this;
                        i9 = i5;
                    }
                    break;
                case -85484049:
                case 369209388:
                    if (i15 - (35856144 + i12) <= 0) {
                        iM55979 = C0946.m55979("᩸ۖ") ^ i7;
                        i = ((iM55979 ^ i8) * 23881) ^ 1364834357;
                        i2 = -1880034142;
                    } else {
                        iM55979 = C0946.m55979("ۚۢ") ^ i8;
                        i = ((iM55979 ^ i7) * 16895) ^ (-1169307655);
                        i2 = -960191135;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 22956525:
                case 380604511:
                    str = c16576.f48688;
                    objArr = new Object[i16];
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0873.m55680("ۜۖ") ^ i8) * (-11);
                        i = ((iM55979 ^ i7) * 1299) ^ 997848981;
                        i2 = -1176375830;
                    } else {
                        iM55979 = C0946.m55979("֫ۜ") ^ i7;
                        i = ((iM55979 ^ i8) * 9541) ^ (-1487694242);
                        i2 = 2122381139;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case 109372864:
                case 1286931809:
                    C0989.m56095();
                    if (C1012.f81938 < 0) {
                        iM55979 = (i8 - C0946.m55979("ۢ۟")) * 73;
                        i = ((iM55979 ^ i7) * (-20051)) ^ (-431340465);
                        i2 = -189977559;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        iM55680 = (C0946.m55979("ۖܺ") ^ i8) * (-71);
                        i3 = ((iM55680 ^ i7) * (-30609)) ^ (-59304460);
                        i4 = 395935739;
                        i10 = iM55680 ^ i4;
                        c16576 = this;
                        s2 = s;
                        i9 = i3;
                    }
                    break;
                case 595498519:
                case 1716764719:
                    s = s2;
                    if (C1964.m56597() != 0) {
                        iM55680 = (C0946.m55979("ۖܺ") ^ i8) * (-71);
                        i3 = ((iM55680 ^ i7) * (-30609)) ^ (-59304460);
                        i4 = 395935739;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۘ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM55680 ^ i7) * (-19905)) ^ 1927877410;
                        i4 = -1523141745;
                    }
                    i10 = iM55680 ^ i4;
                    c16576 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case 933632855:
                case 1372047327:
                    C1964.m56588(c1326, C0912.m55826(C0873.m55680(strM56336) ^ 2102975577, objArr));
                    break;
                case 1291135648:
                case 1943020801:
                    i13 = 47528;
                    iM55979 = C0873.m55680("ۗ۟") ^ i7;
                    i = ((iM55979 ^ i8) * (-27301)) ^ 1844540172;
                    i2 = -94530058;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                default:
                    c19548 = c16576.f48691;
                    i16 = 1;
                    if (c19548 == null) {
                        iM55979 = (C0946.m55979("᩹᩺") + i7) * (-11);
                        i = ((iM55979 ^ i8) * (-26151)) ^ 1952184021;
                        i2 = -1253475481;
                    } else {
                        iM55979 = C0873.m55680("ᩳܳ") ^ i8;
                        i = ((iM55979 ^ i7) * 29427) ^ 1243647301;
                        i2 = -182640646;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
            }
            return;
        }
    }
}
