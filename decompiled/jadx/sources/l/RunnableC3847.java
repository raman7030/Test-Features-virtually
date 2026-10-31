package l;

import android.content.SharedPreferences;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۘۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3847 implements Runnable {

    /* JADX INFO: renamed from: ֫᩶ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f12279 = {2105, 15595, -12638, -11342, -20665, -20668, -20668, -20713, -20667, -20719, -20671, -20669, -20713, -20670, -20716, -20665, -20665, -20717, -20720, -20714, -20667, -20665, -20670, -20670, -20670, -20716, -20668, -20670};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12280;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12281;

    public /* synthetic */ RunnableC3847(int i, Object obj) {
        int i2 = 1497879582;
        int i3 = C0050.f910;
        int i4 = C0422.f1886;
        this.f12280 = i;
        this.f12281 = obj;
        int iM2566 = C0630.m2566("ܽᩴ") ^ i4;
        int i5 = ((iM2566 ^ i3) * 11351) ^ (-1577879920);
        int i6 = 1923123828;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i3) * (-21367)) >> 31));
            switch (i2) {
                case -1921393689:
                case 41903876:
                    C1504.m5179();
                    if (!C1711.f5919) {
                        iM2566 = C0630.m2566("֡۠") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-31075)) ^ 10793065;
                        i6 = 1818384030;
                    } else {
                        iM2566 = (C2105.m6981("֡᩺") ^ i4) * 79;
                        i5 = ((iM2566 ^ i3) * (-19491)) ^ (-903392872);
                        i6 = -1812845820;
                    }
                    break;
                case -1865941366:
                case -130193662:
                    C0714.m2805();
                    C1711.m5736();
                    throw new RuntimeException();
                case -1831881321:
                case 194582296:
                    return;
                case -1659315397:
                case 359887018:
                    if (C21923.f70183 != 0) {
                        iM2566 = (C2105.m6981("֡᩺") ^ i4) * 79;
                        i5 = ((iM2566 ^ i3) * (-19491)) ^ (-903392872);
                        i6 = -1812845820;
                    } else {
                        iM2566 = (C2105.m6981("ۙۨ") + i3) * (-23);
                        i5 = ((iM2566 ^ i4) * 22495) ^ (-1155619722);
                        i6 = 1332333070;
                    }
                    break;
                case -1498040765:
                case 591534732:
                    C4263.m12819();
                    C11340.m28031();
                    iM2566 = C0630.m2566("֡۠") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-31075)) ^ 10793065;
                    i6 = 1818384030;
                    break;
                case -792942487:
                case 1783313314:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i4 - C2105.m6981("᩻ܽ")) * (-91);
                        i5 = ((iM2566 ^ i3) * 9033) ^ 985894967;
                        i6 = -639766239;
                    } else {
                        iM2566 = C2105.m6981("ۚܿ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-30993)) ^ 539854510;
                        i6 = -1977340621;
                    }
                    break;
                default:
                    C2105.m6982();
                    if (C5695.f17556 < 0) {
                        iM2566 = (C2105.m6981("֡᩺") ^ i4) * 79;
                        i5 = ((iM2566 ^ i3) * (-19491)) ^ (-903392872);
                        i6 = -1812845820;
                    } else {
                        iM2566 = C0630.m2566("᩹᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * 22607) ^ 2044082858;
                        i6 = 1639876975;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0152 A[PHI: r4 r6 r7
      0x0152: PHI (r4v4 int) = (r4v1 int), (r4v3 int), (r4v1 int), (r4v1 int) binds: [B:99:0x0152, B:38:0x0150, B:24:0x00c5, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v2 java.lang.String), (r6v1 java.lang.String) binds: [B:99:0x0152, B:38:0x0150, B:24:0x00c5, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:99:0x0152, B:38:0x0150, B:24:0x00c5, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01de A[PHI: r3 r8 r10 r12 r13 r14
      0x01de: PHI (r3v5 l.᩹ۖ᩷) = (r3v2 l.᩹ۖ᩷), (r3v1 l.᩹ۖ᩷), (r3v1 l.᩹ۖ᩷), (r3v1 l.᩹ۖ᩷) binds: [B:50:0x01dc, B:42:0x0185, B:28:0x00ea, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r8v5 java.lang.String) = (r8v1 java.lang.String), (r8v2 java.lang.String), (r8v1 java.lang.String), (r8v1 java.lang.String) binds: [B:50:0x01dc, B:42:0x0185, B:28:0x00ea, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r10v6 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:50:0x01dc, B:42:0x0185, B:28:0x00ea, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r12v6 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:50:0x01dc, B:42:0x0185, B:28:0x00ea, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r13v6 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:50:0x01dc, B:42:0x0185, B:28:0x00ea, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r14v6 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:50:0x01dc, B:42:0x0185, B:28:0x00ea, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0346 A[PHI: r16 r17 r20 r21 r27
      0x0346: PHI (r16v4 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:111:0x0346, B:110:0x0346, B:79:0x0344, B:67:0x02ca, B:17:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r17v4 char) = (r17v2 char), (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:111:0x0346, B:110:0x0346, B:79:0x0344, B:67:0x02ca, B:17:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:111:0x0346, B:110:0x0346, B:79:0x0344, B:67:0x02ca, B:17:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r21v4 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:111:0x0346, B:110:0x0346, B:79:0x0344, B:67:0x02ca, B:17:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r27v5 int) = (r27v3 int), (r27v3 int), (r27v3 int), (r27v4 int), (r27v3 int) binds: [B:111:0x0346, B:110:0x0346, B:79:0x0344, B:67:0x02ca, B:17:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM2566;
        int i;
        int iM6981;
        int i2;
        int i3;
        RunnableC3847 runnableC3847 = this;
        ApplicationC20075 applicationC20075 = null;
        ActivityC22006 activityC22006 = null;
        int iM2567 = 0;
        C1024 c1024 = null;
        String strM10488 = null;
        int i4 = 0;
        String strM3005 = null;
        int i5 = -1214931691;
        int i6 = ViewOnClickListenerC1958.f6529;
        int i7 = C3911.f12484;
        int iM6982 = (C2105.m6981("ۜ᩵") ^ i7) * (-27);
        int i8 = ((iM6982 ^ i6) * 29391) ^ (-746138766);
        int i9 = iM6982 ^ (-624688510);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        Object obj = null;
        int i17 = 0;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i6) * (-11183)) >> 31));
            switch (i5) {
                case -2113625648:
                case -626938287:
                    UMConfigure.init(applicationC20075, strM10488, null, i4, null);
                    MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.LEGACY_MANUAL);
                    iM6981 = C0630.m2566("᩺֡") ^ i6;
                    i2 = ((iM6981 ^ i7) * 2405) ^ 34312070;
                    i3 = -580558333;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -2084466467:
                case 941112193:
                    i15 = i14 * i14;
                    i16 = s * s;
                    i17 = 196364169;
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("ۗܽ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 18555) ^ 2032398853;
                        i = -1872750016;
                    } else {
                        iM2566 = C2105.m6981("᩻۫") ^ i6;
                        i8 = ((iM2566 ^ i7) * 16267) ^ 1496808738;
                        i = 1694482652;
                    }
                    i9 = iM2566 ^ i;
                    runnableC3847 = this;
                    break;
                case -2069873870:
                case -110878509:
                    short s2 = s;
                    int i18 = s2 + 14013;
                    if (C4117.f13076 <= 0) {
                        s = s2;
                        i14 = i18;
                        iM2566 = (C2105.m6981("֡ۗ") + i7) * (-85);
                        i8 = ((iM2566 ^ i6) * 13065) ^ (-315892343);
                        i = -1875532615;
                        i9 = iM2566 ^ i;
                    } else {
                        int iM6983 = C2105.m6981("ۨ۠") ^ i7;
                        s = s2;
                        i9 = iM6983 ^ 1696754224;
                        i14 = i18;
                        i8 = ((iM6983 ^ i6) * (-19307)) ^ 1444403134;
                    }
                    runnableC3847 = this;
                    break;
                case -1991902125:
                case -470002708:
                    c1024 = new C1024();
                    if (C15871.m37616()) {
                        iM6981 = (C0630.m2566("᩷᩻") ^ i7) * (-87);
                        i2 = ((iM6981 ^ i6) * 22647) ^ 1108478121;
                        i3 = -1077760583;
                    } else {
                        iM6981 = (C2105.m6981("ۤ᩶") ^ i7) * (-29);
                        i2 = ((iM6981 ^ i6) * (-28805)) ^ (-509810258);
                        i3 = 1080806517;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -1738863296:
                case -998489832:
                    UMConfigure.getOaid(applicationC20075, new C23674(c1024));
                    iM6981 = (C0630.m2566("᩷᩻") ^ i7) * (-87);
                    i2 = ((iM6981 ^ i6) * 22647) ^ 1108478121;
                    i3 = -1077760583;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -1705227785:
                case -965901888:
                    C3911.m11924();
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6981 = C0630.m2566("۟ۚ") ^ i6;
                        i2 = ((iM6981 ^ i7) * (-10745)) ^ (-1156854628);
                        i3 = -816112178;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ᩳܽ")) * 93;
                        i2 = ((iM6981 ^ i7) * (-5567)) ^ (-47097732);
                        i3 = -1111786731;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -1690850057:
                case 1762957216:
                    s = sArr[c];
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("֡ۗ") + i7) * (-85);
                        i8 = ((iM2566 ^ i6) * 13065) ^ (-315892343);
                        i = -1875532615;
                    } else {
                        iM2566 = C0630.m2566("᩸᩶") ^ i6;
                        i8 = ((iM2566 ^ i7) * 19219) ^ (-599215179);
                        i = -1388000742;
                    }
                    i9 = iM2566 ^ i;
                    runnableC3847 = this;
                    break;
                case -1686609374:
                case 1946957169:
                    C0050.m940();
                    C0237.m1481();
                    iM2566 = C0630.m2566("ۗܽ") ^ i6;
                    i8 = ((iM2566 ^ i7) * 18555) ^ 2032398853;
                    i = -1872750016;
                    i9 = iM2566 ^ i;
                    runnableC3847 = this;
                    break;
                case -1632682248:
                case 1836297869:
                    applicationC20075 = (ApplicationC20075) obj;
                    SharedPreferences sharedPreferences = ApplicationC20075.f65010;
                    int i19 = C6741.f20946;
                    if (C15871.m37616()) {
                        iM6981 = C0630.m2566("᩺֡") ^ i6;
                        i2 = ((iM6981 ^ i7) * 2405) ^ 34312070;
                        i3 = -580558333;
                    } else {
                        iM6981 = (C2105.m6981("ܳ֫") + i7) * (-43);
                        i2 = ((iM6981 ^ i6) * (-26859)) ^ (-1477133056);
                        i3 = 1571129159;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -1580248295:
                case 1013262825:
                    strM3005 = C0798.m3005(sArr2, i11, 3, i10);
                    if (C7811.f24123 >= 0) {
                        iM6981 = (i6 - C0630.m2566("ᩳܽ")) * 93;
                        i2 = ((iM6981 ^ i7) * (-5567)) ^ (-47097732);
                        i3 = -1111786731;
                    } else {
                        iM6981 = (i7 - C0630.m2566("ۢܰ")) * 45;
                        i2 = ((iM6981 ^ i6) * (-16943)) ^ 1220723701;
                        i3 = -758848745;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -1364315250:
                case -586400997:
                    i11 = 1;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("ۡܺ") + i7) * 15;
                        i2 = ((iM6981 ^ i6) * 6981) ^ 33564370;
                        i3 = -1015240074;
                    } else {
                        iM6981 = C2105.m6981("ܽ۟") ^ i6;
                        i2 = ((iM6981 ^ i7) * 20367) ^ (-1519699376);
                        i3 = -169078676;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -1266613138:
                case 1974836530:
                    activityC22006 = ((C19184) obj).f60438;
                    sArr2 = f12279;
                    if (C4616.m13552() != 0) {
                        iM6981 = (i6 - C0630.m2566("ᩳܽ")) * 93;
                        i2 = ((iM6981 ^ i7) * (-5567)) ^ (-47097732);
                        i3 = -1111786731;
                    } else {
                        iM6981 = C0630.m2566("ۧ֫") ^ i6;
                        i2 = ((iM6981 ^ i7) * 1299) ^ 1973701223;
                        i3 = -91403235;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -1168957432:
                case 1779936630:
                    sArr3 = f12279;
                    i12 = 4;
                    i13 = 24;
                    if (C2126.m7040()) {
                        iM6981 = (i6 - C0630.m2566("ᩳܽ")) * 93;
                        i2 = ((iM6981 ^ i7) * (-5567)) ^ (-47097732);
                        i3 = -1111786731;
                    } else {
                        iM6981 = C2105.m6981("ۛۧ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 5607) ^ 1281741921;
                        i3 = 1343618634;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case -1002216143:
                case 1190102072:
                    C7106.m19120();
                    C3663.m11168();
                    break;
                case -908689496:
                case 606048980:
                    i10 = 34797;
                    iM2566 = C0630.m2566("᩵ܳ") ^ i6;
                    i8 = ((iM2566 ^ i7) * (-32703)) ^ (-2135698493);
                    i = 1685144776;
                    i9 = iM2566 ^ i;
                    runnableC3847 = this;
                    break;
                case 70680849:
                case 1521528338:
                    strM10488 = C3432.m10488(sArr3, i12, i13, i10);
                    i4 = 1;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("۟ۚ") ^ i6;
                        i2 = ((iM6981 ^ i7) * (-10745)) ^ (-1156854628);
                        i3 = -816112178;
                    } else {
                        iM6981 = (C0630.m2566("ۨۡ") ^ i6) * (-77);
                        i2 = ((iM6981 ^ i7) * 29823) ^ (-148274976);
                        i3 = 1811219547;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case 556516084:
                case 1409831833:
                    C4263.m12813(activityC22006, iM2567);
                    activityC22006.invalidateOptionsMenu();
                    break;
                case 810671009:
                case 907415582:
                    int i20 = runnableC3847.f12280;
                    Object obj2 = runnableC3847.f12281;
                    switch (i20) {
                        case 0:
                            int iM6984 = C2105.m6981("۟᩷") ^ i7;
                            i9 = iM6984 ^ 2018310037;
                            i8 = ((iM6984 ^ i6) * 3749) ^ 1339946871;
                            obj = obj2;
                            break;
                        default:
                            int iM6985 = (C2105.m6981("ۧۗ") ^ i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i8 = ((iM6985 ^ i6) * 2229) ^ (-1463241234);
                            i9 = iM6985 ^ (-1790934157);
                            runnableC3847 = this;
                            obj = obj2;
                            continue;
                    }
                    runnableC3847 = this;
                    break;
                case 842950351:
                case 1142983716:
                    C7106.m19120();
                    if (C2105.m6982() == 0) {
                        iM6981 = C0630.m2566("۟ۚ") ^ i6;
                        i2 = ((iM6981 ^ i7) * (-10745)) ^ (-1156854628);
                        i3 = -816112178;
                        i9 = iM6981 ^ i3;
                        i8 = i2;
                    } else {
                        iM2566 = C0630.m2566("ۗܽ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 18555) ^ 2032398853;
                        i = -1872750016;
                        i9 = iM2566 ^ i;
                        runnableC3847 = this;
                    }
                    break;
                case 847073964:
                case 1281112188:
                    if (C3537.m10746() > 0) {
                        iM6981 = (C2105.m6981("ۡܺ") + i7) * 15;
                        i2 = ((iM6981 ^ i6) * 6981) ^ 33564370;
                        i3 = -1015240074;
                        i9 = iM6981 ^ i3;
                        i8 = i2;
                    } else {
                        iM2566 = C0630.m2566("ۗܽ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 18555) ^ 2032398853;
                        i = -1872750016;
                        i9 = iM2566 ^ i;
                        runnableC3847 = this;
                    }
                    break;
                case 901013648:
                case 946384771:
                    i10 = 44914;
                    iM2566 = C0630.m2566("᩵ܳ") ^ i6;
                    i8 = ((iM2566 ^ i7) * (-32703)) ^ (-2135698493);
                    i = 1685144776;
                    i9 = iM2566 ^ i;
                    runnableC3847 = this;
                    break;
                case 914291616:
                case 1962250347:
                    break;
                case 1173576213:
                case 1191317420:
                    iM2567 = 2099536932 ^ C0630.m2566(strM3005);
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("۟ۚ") ^ i6;
                        i2 = ((iM6981 ^ i7) * (-10745)) ^ (-1156854628);
                        i3 = -816112178;
                    } else {
                        iM6981 = C0630.m2566("֡ۤ") ^ i7;
                        i2 = ((iM6981 ^ i6) * 6623) ^ 267840498;
                        i3 = -1293172497;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    break;
                case 2046233897:
                case 2134755646:
                    sArr = f12279;
                    c = 0;
                    if (C3432.m10477() <= 0) {
                        iM2566 = C0630.m2566("ۗܽ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 18555) ^ 2032398853;
                        i = -1872750016;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ܳۤ")) * (-119);
                        i8 = ((iM2566 ^ i6) * (-22321)) ^ (-1055115766);
                        i = -977229436;
                    }
                    i9 = iM2566 ^ i;
                    runnableC3847 = this;
                    break;
                default:
                    int i21 = i16 + i17;
                    if ((i21 + i21) - i15 >= 0) {
                        iM2566 = C0630.m2566("֡ܿ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-2945)) ^ (-1491302025);
                        i = 1816903178;
                    } else {
                        iM2566 = (i7 - C2105.m6981("᩸ۘ")) * (-75);
                        i8 = ((iM2566 ^ i6) * 17353) ^ 1483411138;
                        i = 2021240365;
                    }
                    i9 = iM2566 ^ i;
                    runnableC3847 = this;
                    break;
            }
            return;
        }
    }
}
