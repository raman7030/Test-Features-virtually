package p067l;

import android.content.SharedPreferences;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۘۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6025 implements Runnable {

    /* JADX INFO: renamed from: ֫᩶ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f81952 = {2105, 15595, -12638, -11342, -20665, -20668, -20668, -20713, -20667, -20719, -20671, -20669, -20713, -20670, -20716, -20665, -20665, -20717, -20720, -20714, -20667, -20665, -20670, -20670, -20670, -20716, -20668, -20670};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f15087;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f15088;

    public /* synthetic */ RunnableC6025(int i, Object obj) {
        int i2 = 1497879582;
        int i3 = C0845.f81821;
        int i4 = C0863.f81833;
        this.f15087 = i;
        this.f15088 = obj;
        int iM55680 = C0873.m55680("ܽᩴ") ^ i4;
        int i5 = ((iM55680 ^ i3) * 11351) ^ (-1577879920);
        int i6 = 1923123828;
        while (true) {
            i2 = (iM55680 ^ i6) ^ (i5 & (((i2 ^ i3) * (-21367)) >> 31));
            switch (i2) {
                case -1921393689:
                case 41903876:
                    C0917.m55854();
                    if (!C0927.f81875) {
                        iM55680 = C0873.m55680("֡۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-31075)) ^ 10793065;
                        i6 = 1818384030;
                    } else {
                        iM55680 = (C0946.m55979("֡᩺") ^ i4) * 79;
                        i5 = ((iM55680 ^ i3) * (-19491)) ^ (-903392872);
                        i6 = -1812845820;
                    }
                    break;
                case -1865941366:
                case -130193662:
                    C0877.m55696();
                    C0927.m55873();
                    throw new RuntimeException();
                case -1831881321:
                case 194582296:
                    return;
                case -1659315397:
                case 359887018:
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0946.m55979("֡᩺") ^ i4) * 79;
                        i5 = ((iM55680 ^ i3) * (-19491)) ^ (-903392872);
                        i6 = -1812845820;
                    } else {
                        iM55680 = (C0946.m55979("ۙۨ") + i3) * (-23);
                        i5 = ((iM55680 ^ i4) * 22495) ^ (-1155619722);
                        i6 = 1332333070;
                    }
                    break;
                case -1498040765:
                case 591534732:
                    C1053.m56327();
                    C1404.m56468();
                    iM55680 = C0873.m55680("֡۠") ^ i3;
                    i5 = ((iM55680 ^ i4) * (-31075)) ^ 10793065;
                    i6 = 1818384030;
                    break;
                case -792942487:
                case 1783313314:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (i4 - C0946.m55979("᩻ܽ")) * (-91);
                        i5 = ((iM55680 ^ i3) * 9033) ^ 985894967;
                        i6 = -639766239;
                    } else {
                        iM55680 = C0946.m55979("ۚܿ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-30993)) ^ 539854510;
                        i6 = -1977340621;
                    }
                    break;
                default:
                    C0946.m55980();
                    if (C1124.f82007 < 0) {
                        iM55680 = (C0946.m55979("֡᩺") ^ i4) * 79;
                        i5 = ((iM55680 ^ i3) * (-19491)) ^ (-903392872);
                        i6 = -1812845820;
                    } else {
                        iM55680 = C0873.m55680("᩹᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * 22607) ^ 2044082858;
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
        int iM55680;
        int i;
        int iM55979;
        int i2;
        int i3;
        RunnableC6025 runnableC6025 = this;
        ApplicationC21448 applicationC21448 = null;
        ActivityC23283 activityC23283 = null;
        int iM55681 = 0;
        C3342 c3342 = null;
        String strM56144 = null;
        int i4 = 0;
        String strM55717 = null;
        int i5 = -1214931691;
        int i6 = ViewOnClickListenerC0939.f81888;
        int i7 = C1036.f81953;
        int iM559710 = (C0946.m55979("ۜ᩵") ^ i7) * (-27);
        int i8 = ((iM559710 ^ i6) * 29391) ^ (-746138766);
        int i9 = iM559710 ^ (-624688510);
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
                    UMConfigure.init(applicationC21448, strM56144, null, i4, null);
                    MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.LEGACY_MANUAL);
                    iM55979 = C0873.m55680("᩺֡") ^ i6;
                    i2 = ((iM55979 ^ i7) * 2405) ^ 34312070;
                    i3 = -580558333;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -2084466467:
                case 941112193:
                    i15 = i14 * i14;
                    i16 = s * s;
                    i17 = 196364169;
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("ۗܽ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 18555) ^ 2032398853;
                        i = -1872750016;
                    } else {
                        iM55680 = C0946.m55979("᩻۫") ^ i6;
                        i8 = ((iM55680 ^ i7) * 16267) ^ 1496808738;
                        i = 1694482652;
                    }
                    i9 = iM55680 ^ i;
                    runnableC6025 = this;
                    break;
                case -2069873870:
                case -110878509:
                    short s2 = s;
                    int i18 = s2 + 14013;
                    if (C1046.f81962 <= 0) {
                        s = s2;
                        i14 = i18;
                        iM55680 = (C0946.m55979("֡ۗ") + i7) * (-85);
                        i8 = ((iM55680 ^ i6) * 13065) ^ (-315892343);
                        i = -1875532615;
                        i9 = iM55680 ^ i;
                    } else {
                        int iM559711 = C0946.m55979("ۨ۠") ^ i7;
                        s = s2;
                        i9 = iM559711 ^ 1696754224;
                        i14 = i18;
                        i8 = ((iM559711 ^ i6) * (-19307)) ^ 1444403134;
                    }
                    runnableC6025 = this;
                    break;
                case -1991902125:
                case -470002708:
                    c3342 = new C3342();
                    if (C17452.m39788()) {
                        iM55979 = (C0873.m55680("᩷᩻") ^ i7) * (-87);
                        i2 = ((iM55979 ^ i6) * 22647) ^ 1108478121;
                        i3 = -1077760583;
                    } else {
                        iM55979 = (C0946.m55979("ۤ᩶") ^ i7) * (-29);
                        i2 = ((iM55979 ^ i6) * (-28805)) ^ (-509810258);
                        i3 = 1080806517;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -1738863296:
                case -998489832:
                    UMConfigure.getOaid(applicationC21448, new C24868(c3342));
                    iM55979 = (C0873.m55680("᩷᩻") ^ i7) * (-87);
                    i2 = ((iM55979 ^ i6) * 22647) ^ 1108478121;
                    i3 = -1077760583;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -1705227785:
                case -965901888:
                    C1036.m56257();
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0873.m55680("۟ۚ") ^ i6;
                        i2 = ((iM55979 ^ i7) * (-10745)) ^ (-1156854628);
                        i3 = -816112178;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ᩳܽ")) * 93;
                        i2 = ((iM55979 ^ i7) * (-5567)) ^ (-47097732);
                        i3 = -1111786731;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -1690850057:
                case 1762957216:
                    s = sArr[c];
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0946.m55979("֡ۗ") + i7) * (-85);
                        i8 = ((iM55680 ^ i6) * 13065) ^ (-315892343);
                        i = -1875532615;
                    } else {
                        iM55680 = C0873.m55680("᩸᩶") ^ i6;
                        i8 = ((iM55680 ^ i7) * 19219) ^ (-599215179);
                        i = -1388000742;
                    }
                    i9 = iM55680 ^ i;
                    runnableC6025 = this;
                    break;
                case -1686609374:
                case 1946957169:
                    C0845.m55584();
                    C0854.m55595();
                    iM55680 = C0873.m55680("ۗܽ") ^ i6;
                    i8 = ((iM55680 ^ i7) * 18555) ^ 2032398853;
                    i = -1872750016;
                    i9 = iM55680 ^ i;
                    runnableC6025 = this;
                    break;
                case -1632682248:
                case 1836297869:
                    applicationC21448 = (ApplicationC21448) obj;
                    SharedPreferences sharedPreferences = ApplicationC21448.f67650;
                    int i19 = C8775.f23820;
                    if (C17452.m39788()) {
                        iM55979 = C0873.m55680("᩺֡") ^ i6;
                        i2 = ((iM55979 ^ i7) * 2405) ^ 34312070;
                        i3 = -580558333;
                    } else {
                        iM55979 = (C0946.m55979("ܳ֫") + i7) * (-43);
                        i2 = ((iM55979 ^ i6) * (-26859)) ^ (-1477133056);
                        i3 = 1571129159;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -1580248295:
                case 1013262825:
                    strM55717 = C0882.m55717(sArr2, i11, 3, i10);
                    if (C1229.f82066 >= 0) {
                        iM55979 = (i6 - C0873.m55680("ᩳܽ")) * 93;
                        i2 = ((iM55979 ^ i7) * (-5567)) ^ (-47097732);
                        i3 = -1111786731;
                    } else {
                        iM55979 = (i7 - C0873.m55680("ۢܰ")) * 45;
                        i2 = ((iM55979 ^ i6) * (-16943)) ^ 1220723701;
                        i3 = -758848745;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -1364315250:
                case -586400997:
                    i11 = 1;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("ۡܺ") + i7) * 15;
                        i2 = ((iM55979 ^ i6) * 6981) ^ 33564370;
                        i3 = -1015240074;
                    } else {
                        iM55979 = C0946.m55979("ܽ۟") ^ i6;
                        i2 = ((iM55979 ^ i7) * 20367) ^ (-1519699376);
                        i3 = -169078676;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -1266613138:
                case 1974836530:
                    activityC23283 = ((C20601) obj).f63668;
                    sArr2 = f81952;
                    if (C1071.m56343() != 0) {
                        iM55979 = (i6 - C0873.m55680("ᩳܽ")) * 93;
                        i2 = ((iM55979 ^ i7) * (-5567)) ^ (-47097732);
                        i3 = -1111786731;
                    } else {
                        iM55979 = C0873.m55680("ۧ֫") ^ i6;
                        i2 = ((iM55979 ^ i7) * 1299) ^ 1973701223;
                        i3 = -91403235;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -1168957432:
                case 1779936630:
                    sArr3 = f81952;
                    i12 = 4;
                    i13 = 24;
                    if (C0947.m55997()) {
                        iM55979 = (i6 - C0873.m55680("ᩳܽ")) * 93;
                        i2 = ((iM55979 ^ i7) * (-5567)) ^ (-47097732);
                        i3 = -1111786731;
                    } else {
                        iM55979 = C0946.m55979("ۛۧ") ^ i6;
                        i2 = ((iM55979 ^ i7) * 5607) ^ 1281741921;
                        i3 = 1343618634;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case -1002216143:
                case 1190102072:
                    C1194.m56396();
                    C1024.m56209();
                    break;
                case -908689496:
                case 606048980:
                    i10 = 34797;
                    iM55680 = C0873.m55680("᩵ܳ") ^ i6;
                    i8 = ((iM55680 ^ i7) * (-32703)) ^ (-2135698493);
                    i = 1685144776;
                    i9 = iM55680 ^ i;
                    runnableC6025 = this;
                    break;
                case 70680849:
                case 1521528338:
                    strM56144 = C1012.m56144(sArr3, i12, i13, i10);
                    i4 = 1;
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0873.m55680("۟ۚ") ^ i6;
                        i2 = ((iM55979 ^ i7) * (-10745)) ^ (-1156854628);
                        i3 = -816112178;
                    } else {
                        iM55979 = (C0873.m55680("ۨۡ") ^ i6) * (-77);
                        i2 = ((iM55979 ^ i7) * 29823) ^ (-148274976);
                        i3 = 1811219547;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case 556516084:
                case 1409831833:
                    C1053.m56321(activityC23283, iM55681);
                    activityC23283.invalidateOptionsMenu();
                    break;
                case 810671009:
                case 907415582:
                    int i20 = runnableC6025.f15087;
                    Object obj2 = runnableC6025.f15088;
                    switch (i20) {
                        case 0:
                            int iM559712 = C0946.m55979("۟᩷") ^ i7;
                            i9 = iM559712 ^ 2018310037;
                            i8 = ((iM559712 ^ i6) * 3749) ^ 1339946871;
                            obj = obj2;
                            break;
                        default:
                            int iM559713 = (C0946.m55979("ۧۗ") ^ i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i8 = ((iM559713 ^ i6) * 2229) ^ (-1463241234);
                            i9 = iM559713 ^ (-1790934157);
                            runnableC6025 = this;
                            obj = obj2;
                            continue;
                    }
                    runnableC6025 = this;
                    break;
                case 842950351:
                case 1142983716:
                    C1194.m56396();
                    if (C0946.m55980() == 0) {
                        iM55979 = C0873.m55680("۟ۚ") ^ i6;
                        i2 = ((iM55979 ^ i7) * (-10745)) ^ (-1156854628);
                        i3 = -816112178;
                        i9 = iM55979 ^ i3;
                        i8 = i2;
                    } else {
                        iM55680 = C0873.m55680("ۗܽ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 18555) ^ 2032398853;
                        i = -1872750016;
                        i9 = iM55680 ^ i;
                        runnableC6025 = this;
                    }
                    break;
                case 847073964:
                case 1281112188:
                    if (C1017.m56187() > 0) {
                        iM55979 = (C0946.m55979("ۡܺ") + i7) * 15;
                        i2 = ((iM55979 ^ i6) * 6981) ^ 33564370;
                        i3 = -1015240074;
                        i9 = iM55979 ^ i3;
                        i8 = i2;
                    } else {
                        iM55680 = C0873.m55680("ۗܽ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 18555) ^ 2032398853;
                        i = -1872750016;
                        i9 = iM55680 ^ i;
                        runnableC6025 = this;
                    }
                    break;
                case 901013648:
                case 946384771:
                    i10 = 44914;
                    iM55680 = C0873.m55680("᩵ܳ") ^ i6;
                    i8 = ((iM55680 ^ i7) * (-32703)) ^ (-2135698493);
                    i = 1685144776;
                    i9 = iM55680 ^ i;
                    runnableC6025 = this;
                    break;
                case 914291616:
                case 1962250347:
                    break;
                case 1173576213:
                case 1191317420:
                    iM55681 = 2099536932 ^ C0873.m55680(strM55717);
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("۟ۚ") ^ i6;
                        i2 = ((iM55979 ^ i7) * (-10745)) ^ (-1156854628);
                        i3 = -816112178;
                    } else {
                        iM55979 = C0873.m55680("֡ۤ") ^ i7;
                        i2 = ((iM55979 ^ i6) * 6623) ^ 267840498;
                        i3 = -1293172497;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    break;
                case 2046233897:
                case 2134755646:
                    sArr = f81952;
                    c = 0;
                    if (C1012.m56134() <= 0) {
                        iM55680 = C0873.m55680("ۗܽ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 18555) ^ 2032398853;
                        i = -1872750016;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ܳۤ")) * (-119);
                        i8 = ((iM55680 ^ i6) * (-22321)) ^ (-1055115766);
                        i = -977229436;
                    }
                    i9 = iM55680 ^ i;
                    runnableC6025 = this;
                    break;
                default:
                    int i21 = i16 + i17;
                    if ((i21 + i21) - i15 >= 0) {
                        iM55680 = C0873.m55680("֡ܿ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-2945)) ^ (-1491302025);
                        i = 1816903178;
                    } else {
                        iM55680 = (i7 - C0946.m55979("᩸ۘ")) * (-75);
                        i8 = ((iM55680 ^ i6) * 17353) ^ 1483411138;
                        i = 2021240365;
                    }
                    i9 = iM55680 ^ i;
                    runnableC6025 = this;
                    break;
            }
            return;
        }
    }
}
