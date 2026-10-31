package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۤۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N5VT */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceConnectionC10197 extends AbstractActivityC3346 implements CompoundButton.OnCheckedChangeListener, ServiceConnection {

    /* JADX INFO: renamed from: ۖ֨ۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f30638 = {7773, -29756, 22852, -31851, -29840, -22457, -30371, -9001, -8995, -8994, -9008, -9019, -9000, -8993, -9002, -8978, -9005, -9020, -9019, -9019, -8994, -8993, -8978, -9022, -9019, -9000, -9006, -8998, -8978, -9019, -8994, -8978, -9004, -9003, -9002, -9004, 20336, 21776, -18423, -9004, -8993, -9008, -9005, -8995, -9004, -8978, -9005, -9000, -8993, -8978, -9006, -8994, -8993, -9017, -9004, -9021, -9019, -9004, -8993, -9008, -9005, -8995, -9004, -8978, -8994, -9006, -9019, -8978, -9006, -8994, -8993, -9017, -9004, -9021, -9019, 8013, -27831, 24151, 30933, -26554, -30214, 29123, 16466, 28724, -24953, -29568, 21015, -26687, 3825, 3835, 3832, 3830, 3811, 3838, 3833, 3824, 3784, 3829, 3810, 3811, 3811, 3832, 3833, 3784, 3812, 3811, 3838, 3828, 3836, 3784, 3811, 3832, 3784, 3826, 3827, 3824, 3826, 29807, 26396, 26389, 3826, 3833, 3830, 3829, 3835, 3826, 3784, 3829, 3838, 3833, 3784, 3828, 3832, 3833, 3809, 3826, 3813, 3811, -26371, -26394, 22833, 3826, 3833, 3830, 3829, 3835, 3826, 3784, 3832, 3828, 3811, 3784, 3828, 3832, 3833, 3809, 3826, 3813, 3811, 147, -27893, 28081, -32011, 30159, -31345, 28240, 2084, -29293, -29280, -29279, -29263, -29309, -29273, -29257, -29280, -29269, -29311, -29257, -29274, -29274, -29253, -29252, -29259, -29279};

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30639 = 0;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public BinderC3141 f30640;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ֫ */
    public final void mo117(C20986 c20986) {
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -980436734;
        int i6 = ServiceConnectionC3453.f10921;
        int i7 = C0483.f2088;
        int iM2566 = (C0630.m2566("۟ۨ") + i6) * 91;
        int i8 = ((iM2566 ^ i7) * (-30249)) ^ (-606658667);
        int i9 = 190185365;
        while (true) {
            i5 = ((((i5 ^ i7) * 1697) >> 31) & i8) ^ (iM2566 ^ i9);
            switch (i5) {
                case -2069043058:
                case -1775977039:
                    C0422.m1963();
                    return null;
                case -1956359363:
                case 489510164:
                    s2 = 1;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("ۜᩳ") ^ i6) * (-79);
                        i8 = ((iM2566 ^ i7) * 22243) ^ (-2080148983);
                        i9 = 2039569064;
                    } else {
                        iM2566 = C2105.m6981("᩷֡") ^ i6;
                        i8 = ((iM2566 ^ i7) * 811) ^ 2025995052;
                        i9 = 1005668100;
                    }
                    break;
                case -1910561219:
                case -652649171:
                    s = sArr[c];
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("ۡܽ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-23479)) ^ 2070315640;
                        i9 = 1750843778;
                    } else {
                        iM2566 = (i6 - C2105.m6981("֨ۢ")) * 109;
                        i8 = ((iM2566 ^ i7) * 9451) ^ 882469996;
                        i9 = -660251722;
                    }
                    break;
                case -1815838463:
                case -687503234:
                    int i10 = s + s2;
                    if (i2 - (i10 * i10) > 0) {
                        iM2566 = C2105.m6981("ۡۤ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-20319)) ^ 1976284444;
                        i9 = 869280471;
                    } else {
                        iM2566 = (C2105.m6981("ۨ᩷") ^ i7) * (-111);
                        i8 = ((iM2566 ^ i6) * 18113) ^ (-637392905);
                        i9 = 123334089;
                    }
                    break;
                case -1807804057:
                case -1622006958:
                    if (C0964.f3626 != 0) {
                        iM2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((iM2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        iM2566 = C2105.m6981("᩶ܺ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-10817)) ^ 1618587856;
                        i9 = -1910818222;
                    }
                    break;
                case -1707628600:
                case -551091324:
                    i3 = 47591;
                    iM2566 = (C2105.m6981("֫ܺ") + i7) * 51;
                    i8 = ((iM2566 ^ i6) * 24605) ^ (-1750607413);
                    i9 = 1056705565;
                    break;
                case -1535589264:
                case -242749308:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("ۜᩳ") ^ i6) * (-79);
                        i8 = ((iM2566 ^ i7) * 22243) ^ (-2080148983);
                        i9 = 2039569064;
                    } else {
                        iM2566 = C2105.m6981("ܰ۟") ^ i6;
                        i8 = ((iM2566 ^ i7) * 2595) ^ 1806135841;
                        i9 = 2026375608;
                    }
                    break;
                case -1506836321:
                case 1524643978:
                    AbstractC2021.m6574();
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("᩷᩷") ^ i7;
                        i8 = ((iM2566 ^ i6) * 20427) ^ 2077987175;
                        i9 = -912779529;
                    } else {
                        iM2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((iM2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    }
                    break;
                case -889519933:
                case 925340982:
                    sArr = f30638;
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("᩷᩷") ^ i7;
                        i8 = ((iM2566 ^ i6) * 20427) ^ 2077987175;
                        i9 = -912779529;
                    } else {
                        iM2566 = (C2105.m6981("᩷ܽ") + i6) * (-101);
                        i8 = ((iM2566 ^ i7) * (-11867)) ^ 2139475671;
                        i9 = -463622484;
                    }
                    break;
                case -739614750:
                case 381160980:
                    C2520.m8026();
                    if (C1773.f6144 > 0) {
                        iM2566 = (C0630.m2566("ۗܳ") ^ i6) * 9;
                        i8 = ((iM2566 ^ i7) * 2565) ^ (-1189261102);
                        i9 = 777553847;
                    } else {
                        iM2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((iM2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    }
                    break;
                case -367162699:
                case 1043596952:
                    i2 = i + 1;
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((iM2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        iM2566 = (C2105.m6981("᩺᩶") ^ i6) * 31;
                        i8 = ((iM2566 ^ i7) * (-29585)) ^ (-2052504336);
                        i9 = 986110985;
                    }
                    break;
                case 103288603:
                case 1038135880:
                    i = s * 2;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("ۜᩳ") ^ i6) * (-79);
                        i8 = ((iM2566 ^ i7) * 22243) ^ (-2080148983);
                        i9 = 2039569064;
                    } else {
                        iM2566 = (i7 - C0630.m2566("᩸ܺ")) * (-89);
                        i8 = ((iM2566 ^ i6) * (-8089)) ^ 456950636;
                        i9 = 1407375871;
                    }
                    break;
                case 141493518:
                case 1255315499:
                    sArr2 = f30638;
                    i4 = 167;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("ۗܳ") ^ i6) * 9;
                        i8 = ((iM2566 ^ i7) * 2565) ^ (-1189261102);
                        i9 = 777553847;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ᩴ᩻")) * 47;
                        i8 = ((iM2566 ^ i6) * (-4945)) ^ 1148335288;
                        i9 = 1082542819;
                    }
                    break;
                case 434649606:
                case 1525833646:
                    C0237.m1481();
                    C3663.m11168();
                    iM2566 = C2105.m6981("ۡܽ") ^ i6;
                    i8 = ((iM2566 ^ i7) * (-23479)) ^ 2070315640;
                    i9 = 1750843778;
                    break;
                case 794647324:
                case 1689783550:
                    if (C2126.f7087) {
                        iM2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((iM2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        iM2566 = C2105.m6981("᩶ܰ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 3011) ^ (-1791097553);
                        i9 = 782736893;
                    }
                    break;
                case 953361541:
                case 1295241806:
                    i3 = 36306;
                    iM2566 = (C2105.m6981("֫ܺ") + i7) * 51;
                    i8 = ((iM2566 ^ i6) * 24605) ^ (-1750607413);
                    i9 = 1056705565;
                    break;
                case 1114886306:
                case 2062034715:
                    if (!C0798.f2919) {
                        iM2566 = C2105.m6981("ۡܽ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-23479)) ^ 2070315640;
                        i9 = 1750843778;
                    } else {
                        iM2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((iM2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    }
                    break;
                case 1181434956:
                case 1362843605:
                    c = 166;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((iM2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        iM2566 = C2105.m6981("۟ܳ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-21445)) ^ 1865445965;
                        i9 = 104519450;
                    }
                    break;
                default:
                    return C2272.m7507(sArr2, i4, 17, i3);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BinderC3141 binderC3141 = null;
        int i = -1814660418;
        int i2 = C4263.f13799;
        int i3 = C0422.f1886;
        int iM6981 = C2105.m6981("ܽۛ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-23203)) ^ (-1774361411);
        int i5 = 1709243979;
        while (true) {
            i = ((((i ^ i3) * 22129) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2045495679:
                case 452929681:
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("ۢ۬") + i2) * (-127);
                        i4 = ((iM6981 ^ i3) * 2179) ^ 1112741345;
                        i5 = 1652424684;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۬᩶")) * (-29);
                        i4 = ((iM6981 ^ i2) * (-9457)) ^ (-1493260642);
                        i5 = 53359349;
                    }
                    break;
                case -1946799942:
                case -920011053:
                    binderC3141 = (BinderC3141) iBinder;
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ۚܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10919) ^ (-289898908);
                        i5 = -2127864308;
                    } else {
                        iM6981 = (C0630.m2566("ܽ᩸") + i3) * 11;
                        i4 = ((iM6981 ^ i2) * 11295) ^ (-2119364106);
                        i5 = -839390211;
                    }
                    break;
                case -1920057351:
                case 2080352036:
                    if (C0798.f2919) {
                        iM6981 = (i3 - C2105.m6981("۬᩶")) * (-29);
                        i4 = ((iM6981 ^ i2) * (-9457)) ^ (-1493260642);
                        i5 = 53359349;
                    } else {
                        iM6981 = (C2105.m6981("ۖۢ") ^ i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 10791) ^ 195023367;
                        i5 = 470285382;
                    }
                    break;
                case -1715419474:
                case 965594572:
                    RunnableC3474.m10630();
                    if (C22628.f73083 > 0) {
                        iM6981 = (i3 - C2105.m6981("۬᩶")) * (-29);
                        i4 = ((iM6981 ^ i2) * (-9457)) ^ (-1493260642);
                        i5 = 53359349;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۫ܳ")) * 13;
                        i4 = ((iM6981 ^ i3) * 20331) ^ 1509063024;
                        i5 = -98329144;
                    }
                    break;
                case -1217158004:
                case 1698244739:
                    if (C3663.m11168() >= 0) {
                        iM6981 = C2105.m6981("ۚܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10919) ^ (-289898908);
                        i5 = -2127864308;
                    } else {
                        iM6981 = C0630.m2566("ۚᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19179)) ^ 292236850;
                        i5 = -1788505566;
                    }
                    break;
                case -1169862820:
                case 745585389:
                    C3911.m11924();
                    C0382.m1848();
                    iM6981 = (i2 - C0630.m2566("۫ܳ")) * 13;
                    i4 = ((iM6981 ^ i3) * 20331) ^ 1509063024;
                    i5 = -98329144;
                    break;
                case -604029255:
                case 6607606:
                    if (C3432.m10477() <= 0) {
                        iM6981 = C2105.m6981("۠֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8117)) ^ 934492677;
                        i5 = 799044822;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-28475)) ^ 1576052836;
                        i5 = -42632837;
                    }
                    break;
                case -539933815:
                case -378722213:
                    this.f30640 = binderC3141;
                    binderC3141.m9566();
                    this.f30640.m9568();
                    break;
                case -383408842:
                case 226070458:
                    if (C3683.f11629 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۬᩶")) * (-29);
                        i4 = ((iM6981 ^ i2) * (-9457)) ^ (-1493260642);
                        i5 = 53359349;
                    } else {
                        iM6981 = C0630.m2566("ܰۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11939) ^ (-318810186);
                        i5 = -451533648;
                    }
                    break;
                case -328059113:
                case 1059557008:
                    if (RunnableC1108.f4040) {
                        iM6981 = (C0630.m2566("᩻᩺") + i3) * (-109);
                        i4 = ((iM6981 ^ i2) * (-18519)) ^ (-1995112616);
                        i5 = -461399135;
                    } else {
                        iM6981 = C2105.m6981("۠֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8117)) ^ 934492677;
                        i5 = 799044822;
                    }
                    break;
                case -33717754:
                case 1705771050:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (i3 - C0630.m2566("ۤ᩸")) * 33;
                        i4 = ((iM6981 ^ i2) * (-29117)) ^ (-1698608738);
                        i5 = -1938685999;
                    } else {
                        iM6981 = (C2105.m6981("۬᩵") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * 15661) ^ 183104691;
                        i5 = 1249890260;
                    }
                    break;
                case 268119814:
                case 469534517:
                    C3663.m11168();
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = (i3 - C0630.m2566("ۤ᩸")) * 33;
                        i4 = ((iM6981 ^ i2) * (-29117)) ^ (-1698608738);
                        i5 = -1938685999;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۫ܳ")) * 13;
                        i4 = ((iM6981 ^ i3) * 20331) ^ 1509063024;
                        i5 = -98329144;
                    }
                    break;
                case 304144589:
                case 777684464:
                    RunnableC1108.m3790();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = C2105.m6981("۠֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8117)) ^ 934492677;
                        i5 = 799044822;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۤ᩸")) * 33;
                        i4 = ((iM6981 ^ i2) * (-29117)) ^ (-1698608738);
                        i5 = -1938685999;
                    }
                    break;
                case 939933883:
                case 1371287645:
                    if (C1773.m5908() <= 0) {
                        iM6981 = (i2 - C0630.m2566("۫ܳ")) * 13;
                        i4 = ((iM6981 ^ i3) * 20331) ^ 1509063024;
                        i5 = -98329144;
                    } else {
                        iM6981 = C2105.m6981("֨۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1573) ^ 384364245;
                        i5 = -668030852;
                    }
                    break;
                case 1566759334:
                case 1739043742:
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("ۚܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10919) ^ (-289898908);
                        i5 = -2127864308;
                    } else {
                        iM6981 = C0630.m2566("ۨ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12869) ^ 1007166493;
                        i5 = 2110959681;
                    }
                    break;
                default:
                    C1773.m5908();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01f8 A[PHI: r9 r10 r19
      0x01f8: PHI (r9v5 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:54:0x01f6, B:50:0x01ce, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r10v5 short) = (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:54:0x01f6, B:50:0x01ce, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r19v24 int) = (r19v5 int), (r19v6 int), (r19v29 int) binds: [B:54:0x01f6, B:50:0x01ce, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0234 A[PHI: r2 r3 r7 r8 r12 r13 r14 r19
      0x0234: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:58:0x0232, B:40:0x0155, B:36:0x012e, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:58:0x0232, B:40:0x0155, B:36:0x012e, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r7v5 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:58:0x0232, B:40:0x0155, B:36:0x012e, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r8v5 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:58:0x0232, B:40:0x0155, B:36:0x012e, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r12v5 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:58:0x0232, B:40:0x0155, B:36:0x012e, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r13v5 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:58:0x0232, B:40:0x0155, B:36:0x012e, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r14v5 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:58:0x0232, B:40:0x0155, B:36:0x012e, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r19v13 int) = (r19v4 int), (r19v9 int), (r19v10 int), (r19v14 int) binds: [B:58:0x0232, B:40:0x0155, B:36:0x012e, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (l.C3245.f10203 <= 0) goto L16;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPause() {
        int iM6981;
        int i;
        int i2;
        int i3;
        int i4 = C7811.f24123;
        int i5 = C1128.f4106;
        int iM2566 = (i4 - C0630.m2566("᩹ۨ")) * 17;
        int i6 = ((iM2566 ^ i5) * 14901) ^ (-400471654);
        String strM12817 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2566 ^ (-1494547462);
        int i8 = 0;
        int iM6982 = 0;
        int iM6983 = 0;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -2038495562;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i5) * 7299) >> 31));
            switch (i14) {
                case -1813227678:
                case -1353599792:
                    if (!C1504.f5354) {
                        int iM2567 = C0630.m2566("ۘۖ") ^ i4;
                        i7 = iM2567 ^ (-211520012);
                        i6 = ((iM2567 ^ i5) * 4151) ^ 1084197694;
                    } else {
                        i8 = i8;
                        iM6981 = (C2105.m6981("ܳۖ") ^ i5) * 13;
                        i = ((iM6981 ^ i4) * (-2155)) ^ 1230857549;
                        i2 = -1124062251;
                        int i15 = i8;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        i8 = i15;
                    }
                    break;
                case -1795471003:
                case -1588322704:
                    iM6983 = C2105.m6981(strM12817);
                    if (C0237.f1507 != 0) {
                        i8 = i8;
                        iM6981 = (C0630.m2566("۠۬") ^ i4) * (-37);
                        i = ((iM6981 ^ i5) * (-18797)) ^ (-1948907245);
                        i2 = 2095769986;
                    } else {
                        iM6981 = (C2105.m6981("ۧۖ") + i5) * (-101);
                        i8 = i8;
                        i = ((iM6981 ^ i4) * (-32269)) ^ (-657625146);
                        i2 = 1775517159;
                    }
                    int i16 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i16;
                    break;
                case -1569886790:
                case 1206409760:
                    C2105.m6982();
                    i8 = i8;
                    iM6981 = (C0630.m2566("۠۬") ^ i4) * (-37);
                    i = ((iM6981 ^ i5) * (-18797)) ^ (-1948907245);
                    i2 = 2095769986;
                    int i17 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i17;
                    break;
                case -1409158634:
                case 1808254420:
                    i8 = i8;
                    s = sArr[c];
                    i9 = s * s;
                    if (C3537.f11231 >= 0) {
                        i3 = i8;
                        iM6981 = (C0630.m2566("᩻ۜ") + i4) * (-9);
                        i8 = i3;
                        i = ((iM6981 ^ i5) * 29631) ^ 2059899170;
                        i2 = 289030760;
                    } else {
                        iM6981 = C2105.m6981("ۨ᩵") ^ i4;
                        i = ((iM6981 ^ i5) * 8891) ^ 1292520170;
                        i2 = -275059541;
                    }
                    int i18 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i18;
                    break;
                case -1365025353:
                case -641737206:
                    i8 = i8;
                    s2 = 32282;
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C2105.m6981("ܳۖ") ^ i5) * 13;
                        i = ((iM6981 ^ i4) * (-2155)) ^ 1230857549;
                        i2 = -1124062251;
                    } else {
                        iM6981 = (C2105.m6981("ۛܽ") ^ i4) * 17;
                        i = ((iM6981 ^ i5) * (-12853)) ^ (-803939284);
                        i2 = 819022669;
                    }
                    int i19 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i19;
                    break;
                case -1228771457:
                case -742433638:
                    C5695.m16023();
                    if (C3245.f10203 <= 0) {
                        int iM2568 = C0630.m2566("ۘۖ") ^ i4;
                        i7 = iM2568 ^ (-211520012);
                        i6 = ((iM2568 ^ i5) * 4151) ^ 1084197694;
                    } else {
                        i8 = i8;
                        iM6981 = C0630.m2566("ᩳ۠") ^ i5;
                        i = ((iM6981 ^ i4) * 24501) ^ 1131819824;
                        i2 = -1427484481;
                        int i110 = i8;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        i8 = i110;
                    }
                    break;
                case -953960783:
                case 452714926:
                    i8 = i8;
                    iM6982 = C2105.m6981(C1773.m5917(sArr2, i12, i13, i11));
                    if (C3683.m11222()) {
                        i3 = i8;
                        iM6981 = (C0630.m2566("᩻ۜ") + i4) * (-9);
                        i8 = i3;
                        i = ((iM6981 ^ i5) * 29631) ^ 2059899170;
                        i2 = 289030760;
                    } else {
                        iM6981 = (C2105.m6981("ܽ᩵") ^ i5) * (-21);
                        i = ((iM6981 ^ i4) * (-16693)) ^ (-1140266654);
                        i2 = 285428298;
                    }
                    int i111 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i111;
                    break;
                case -901386870:
                case 1513079442:
                    overridePendingTransition(i8, 2099913474 ^ iM6983);
                    super.onPause();
                    break;
                case -825547551:
                case -310583627:
                    i8 = i8;
                    c = 159;
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("۠۬") ^ i4) * (-37);
                        i = ((iM6981 ^ i5) * (-18797)) ^ (-1948907245);
                        i2 = 2095769986;
                    } else {
                        iM6981 = (C0630.m2566("ۗ֫") + i5) * 81;
                        i = ((iM6981 ^ i4) * (-28493)) ^ 1942977219;
                        i2 = 504015402;
                    }
                    int i112 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i112;
                    break;
                case -534557288:
                case 325946187:
                    i8 = i8;
                    if ((s * s2) - i10 <= 0) {
                        iM6981 = (C2105.m6981("ۨ֨") ^ i5) * 115;
                        i = ((iM6981 ^ i4) * (-13065)) ^ (-142782242);
                        i2 = 276515727;
                    } else {
                        iM6981 = C0630.m2566("۫ᩳ") ^ i5;
                        i = ((iM6981 ^ i4) * 22423) ^ (-2010066571);
                        i2 = 724772584;
                    }
                    int i113 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i113;
                    break;
                case -169584387:
                case 1584060769:
                    i8 = i8;
                    i10 = i9 + 260531881;
                    if (C3663.m11168() >= 0) {
                        iM6981 = (C2105.m6981("ܳۖ") ^ i5) * 13;
                        i = ((iM6981 ^ i4) * (-2155)) ^ 1230857549;
                        i2 = -1124062251;
                    } else {
                        iM6981 = (C0630.m2566("᩹ۢ") + i5) * 53;
                        i = ((iM6981 ^ i4) * (-24595)) ^ 1478532071;
                        i2 = 1789112946;
                    }
                    int i114 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i114;
                    break;
                case -131548021:
                case 883339691:
                    C1128.m3851();
                    break;
                case -103574149:
                case 1565898931:
                    i8 = i8;
                    sArr2 = f30638;
                    i12 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                    i13 = 3;
                    if (RunnableC3474.f10992 <= 0) {
                        i3 = i8;
                        iM6981 = (C0630.m2566("᩻ۜ") + i4) * (-9);
                        i8 = i3;
                        i = ((iM6981 ^ i5) * 29631) ^ 2059899170;
                        i2 = 289030760;
                    } else {
                        iM6981 = (C2105.m6981("ܰ᩺") ^ i4) * (-91);
                        i = ((iM6981 ^ i5) * 3907) ^ 1706402852;
                        i2 = 2025394640;
                    }
                    int i115 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i115;
                    break;
                case 9261661:
                case 1350366189:
                    i8 = i8;
                    strM12817 = C4263.m12817(sArr3, 163, 3, i11);
                    if (C3746.f11829 <= 0) {
                        i3 = i8;
                        iM6981 = (C0630.m2566("᩻ۜ") + i4) * (-9);
                        i8 = i3;
                        i = ((iM6981 ^ i5) * 29631) ^ 2059899170;
                        i2 = 289030760;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۚᩴ")) * 45;
                        i = ((iM6981 ^ i4) * 23383) ^ (-22335662);
                        i2 = -336582477;
                    }
                    int i116 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i116;
                    break;
                case 460566836:
                case 1117022797:
                    break;
                case 599249352:
                case 1261288316:
                    i11 = 13407;
                    iM6981 = C2105.m6981("᩶᩺") ^ i4;
                    i = ((iM6981 ^ i5) * (-5707)) ^ (-949134897);
                    i2 = -324652240;
                    int i117 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i117;
                    break;
                case 1544845306:
                case 1574839109:
                    i3 = iM6982 ^ 2127314723;
                    sArr3 = f30638;
                    if (C7106.f21815 != 0) {
                        iM6981 = (C0630.m2566("᩻ۜ") + i4) * (-9);
                        i8 = i3;
                        i = ((iM6981 ^ i5) * 29631) ^ 2059899170;
                        i2 = 289030760;
                    } else {
                        iM6981 = C0630.m2566("ۜۨ") ^ i4;
                        i8 = i3;
                        i = ((iM6981 ^ i5) * 2259) ^ 730404041;
                        i2 = -510857946;
                    }
                    int i118 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i118;
                    break;
                case 1603794152:
                case 1982670530:
                    i8 = i8;
                    sArr = f30638;
                    if (RunnableC1108.f4040) {
                        iM6981 = (i4 - C2105.m6981("ۘᩳ")) * 37;
                        i = ((iM6981 ^ i5) * (-27565)) ^ (-1329458392);
                        i2 = 1524029545;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۠") ^ i5;
                        i = ((iM6981 ^ i4) * 24501) ^ 1131819824;
                        i2 = -1427484481;
                    }
                    int i119 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i119;
                    break;
                default:
                    i11 = 58706;
                    iM6981 = C2105.m6981("᩶᩺") ^ i4;
                    i = ((iM6981 ^ i5) * (-5707)) ^ (-949134897);
                    i2 = -324652240;
                    int i1110 = i8;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    i8 = i1110;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0454 A[PHI: r3 r5 r9 r10 r14 r15 r18 r19 r20 r21 r22 r24 r25 r31
      0x0454: PHI (r3v33 int) = (r3v8 int), (r3v9 int), (r3v34 int) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r5v38 android.widget.CheckBox) = (r5v14 android.widget.CheckBox), (r5v15 android.widget.CheckBox), (r5v39 android.widget.CheckBox) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r9v5 android.widget.CheckBox) = (r9v2 android.widget.CheckBox), (r9v2 android.widget.CheckBox), (r9v6 android.widget.CheckBox) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r10v5 l.۫ۤۡ) = (r10v2 l.۫ۤۡ), (r10v2 l.۫ۤۡ), (r10v6 l.۫ۤۡ) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r14v6 int) = (r14v2 int), (r14v2 int), (r14v7 int) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r15v6 int) = (r15v2 int), (r15v2 int), (r15v7 int) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r18v6 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r19v6 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r20v6 java.lang.String) = (r20v2 java.lang.String), (r20v3 java.lang.String), (r20v2 java.lang.String) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r21v21 int) = (r21v8 int), (r21v9 int), (r21v22 int) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r22v22 short[]) = (r22v8 short[]), (r22v9 short[]), (r22v23 short[]) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r24v26 short[]) = (r24v8 short[]), (r24v9 short[]), (r24v27 short[]) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r25v26 short[]) = (r25v8 short[]), (r25v9 short[]), (r25v27 short[]) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r31v41 short[]) = (r31v17 short[]), (r31v18 short[]), (r31v42 short[]) binds: [B:72:0x0452, B:68:0x0413, B:11:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, android.content.ServiceConnection, java.lang.Object, l.ۗܺ᩷] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        InterfaceC12344 interfaceC12344;
        CheckBox checkBox;
        short[] sArr;
        int iM6981;
        short[] sArr2;
        int i;
        short[] sArr3;
        int i2;
        short[] sArr4;
        int i3;
        short[] sArr5;
        short[] sArr6;
        short[] sArr7;
        int iM2566;
        int i4;
        int i5;
        int i6;
        int iM2567;
        int i7;
        int i8;
        short[] sArr8;
        CheckBox checkBox2;
        short[] sArr9;
        int iM2568;
        int i9;
        int i10;
        int iM6982;
        int i11;
        int i12;
        int iM6983;
        int i13;
        int i14;
        ?? r0 = this;
        int i15 = 0;
        int i16 = -767003404;
        int i17 = ViewOnClickListenerC1958.f6529;
        int i18 = C5695.f17556;
        int iM6984 = C2105.m6981("۬ۚ") ^ i18;
        int i19 = ((iM6984 ^ i17) * (-23403)) ^ (-604602845);
        int i20 = iM6984 ^ (-1506902306);
        CheckBox checkBox3 = null;
        InterfaceC12344 interfaceC12345 = null;
        InterfaceC12344 interfaceC12346 = null;
        InterfaceC12344 interfaceC12347 = null;
        String strM28025 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int iM6985 = 0;
        int i24 = 0;
        int iM2569 = 0;
        int iM25610 = 0;
        int i25 = 0;
        int i26 = 0;
        short s = 0;
        View viewM3409 = null;
        CheckBox checkBox4 = null;
        CheckBox checkBox5 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        boolean z = false;
        int i27 = 0;
        int iM25611 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * (-5093)) >> 31));
            switch (i16) {
                case -2113857953:
                case 1365425476:
                    sArr14 = sArr14;
                    checkBox3 = checkBox3;
                    short[] sArr15 = sArr10;
                    sArr12 = sArr12;
                    i25 = i25;
                    sArr13 = sArr13;
                    i26 = i26;
                    sArr7 = sArr15;
                    super.onCreate(bundle);
                    iM25610 = C0630.m2566(C2167.m7159(f30638, 76, 3, i22));
                    i27 = 2101924691;
                    if (C7811.f24123 >= 0) {
                        iM2567 = (i18 - C0630.m2566("ۢ۬")) * (-49);
                        i19 = ((iM2567 ^ i17) * 6577) ^ 1031864833;
                        i7 = 1811963232;
                    } else {
                        iM2567 = (i17 - C0630.m2566("ۚ᩺")) * 51;
                        i19 = ((iM2567 ^ i18) * (-26239)) ^ (-475970970);
                        i7 = 375640376;
                    }
                    i6 = iM2567 ^ i7;
                    checkBox3 = checkBox3;
                    sArr14 = sArr14;
                    i20 = i6;
                    r0 = this;
                    short[] sArr16 = sArr13;
                    i25 = i25;
                    sArr12 = sArr12;
                    sArr10 = sArr7;
                    i26 = i26;
                    sArr13 = sArr16;
                    break;
                case -2022848723:
                case -650950488:
                    sArr14 = sArr14;
                    C3663.m11173(checkBox4, r0);
                    iM2569 = C0630.m2566(C3746.m11357(f30638, 138, 3, i22));
                    iM6983 = C2105.m6981("ܽܳ") ^ i18;
                    i13 = ((iM6983 ^ i17) * (-17215)) ^ (-2080274629);
                    i14 = 1069950476;
                    short[] sArr17 = sArr14;
                    i20 = iM6983 ^ i14;
                    i19 = i13;
                    sArr14 = sArr17;
                    break;
                case -1989411946:
                case -191060765:
                    if (RunnableC0588.m2441() >= 0) {
                        sArr14 = sArr14;
                        checkBox2 = checkBox3;
                        short[] sArr18 = sArr10;
                        sArr3 = sArr12;
                        sArr9 = sArr18;
                        iM2568 = (i17 - C2105.m6981("᩺۠")) * 53;
                        i9 = ((iM2568 ^ i18) * (-6143)) ^ 761051488;
                        i10 = 363735714;
                        int i28 = iM2568 ^ i10;
                        checkBox3 = checkBox2;
                        short[] sArr19 = sArr14;
                        i20 = i28;
                        i19 = i9;
                        sArr14 = sArr19;
                        short[] sArr20 = sArr9;
                        i26 = i26;
                        sArr12 = sArr3;
                        sArr10 = sArr20;
                    } else {
                        iM6982 = C2105.m6981("ۖ᩻") ^ i18;
                        i11 = ((iM6982 ^ i17) * (-28403)) ^ (-1851256629);
                        i12 = 1005392333;
                        i20 = iM6982 ^ i12;
                        i19 = i11;
                    }
                    break;
                case -1895213712:
                case 237123774:
                    sArr7 = sArr10;
                    i22 = 3735;
                    iM2567 = (C0630.m2566("ܺ֫") + i17) * 75;
                    i19 = ((iM2567 ^ i18) * 31485) ^ (-485495832);
                    i7 = 615870631;
                    i6 = iM2567 ^ i7;
                    checkBox3 = checkBox3;
                    sArr14 = sArr14;
                    i20 = i6;
                    r0 = this;
                    short[] sArr110 = sArr13;
                    i25 = i25;
                    sArr12 = sArr12;
                    sArr10 = sArr7;
                    i26 = i26;
                    sArr13 = sArr110;
                    break;
                case -1746333431:
                case -808421270:
                    checkBox2 = checkBox3;
                    sArr14 = sArr14;
                    short[] sArr21 = sArr10;
                    sArr3 = sArr12;
                    i26 = i26;
                    viewM3409 = C0964.m3409(r0, C2105.m6981(C3019.m9250(sArr21, i26, 3, i22)) ^ 2130585075);
                    iM2568 = (C0630.m2566("᩵ܶ") ^ i17) * (-125);
                    sArr9 = sArr21;
                    i9 = ((iM2568 ^ i18) * 29023) ^ 2027261313;
                    i10 = 920859296;
                    int i29 = iM2568 ^ i10;
                    checkBox3 = checkBox2;
                    short[] sArr111 = sArr14;
                    i20 = i29;
                    i19 = i9;
                    sArr14 = sArr111;
                    short[] sArr22 = sArr9;
                    i26 = i26;
                    sArr12 = sArr3;
                    sArr10 = sArr22;
                    break;
                case -882640779:
                case -690298881:
                    C1047.m3599();
                    C5695.m16023();
                    sArr = sArr11;
                    checkBox = checkBox3;
                    interfaceC12344 = interfaceC12345;
                    iM6981 = C0630.m2566("۠ۙ") ^ i17;
                    sArr2 = sArr;
                    i19 = ((iM6981 ^ i18) * 8465) ^ (-191266137);
                    i = 1560284458;
                    int i30 = iM6981 ^ i;
                    interfaceC12345 = interfaceC12344;
                    sArr11 = sArr2;
                    i20 = i30;
                    checkBox3 = checkBox;
                    break;
                case -782327092:
                case 1104827337:
                    sArr7 = sArr10;
                    i22 = 52261;
                    iM2567 = (C0630.m2566("ܺ֫") + i17) * 75;
                    i19 = ((iM2567 ^ i18) * 31485) ^ (-485495832);
                    i7 = 615870631;
                    i6 = iM2567 ^ i7;
                    checkBox3 = checkBox3;
                    sArr14 = sArr14;
                    i20 = i6;
                    r0 = this;
                    short[] sArr112 = sArr13;
                    i25 = i25;
                    sArr12 = sArr12;
                    sArr10 = sArr7;
                    i26 = i26;
                    sArr13 = sArr112;
                    break;
                case -777939274:
                case -117440282:
                    sArr14 = sArr14;
                    C2167.m7160(checkBox5, C4263.m12818(interfaceC12347, C7106.m19110(f30638, 141, 18, i22), z));
                    iM6983 = (C0630.m2566("ۡ۟") ^ i17) * 71;
                    i13 = ((iM6983 ^ i18) * (-307)) ^ 81189807;
                    i14 = 1154198199;
                    short[] sArr113 = sArr14;
                    i20 = iM6983 ^ i14;
                    i19 = i13;
                    sArr14 = sArr113;
                    break;
                case -755899955:
                case 1260544640:
                    sArr14 = sArr14;
                    checkBox5 = (CheckBox) C0964.m3409(r0, iM2569 ^ 2102211551);
                    interfaceC12347 = ApplicationC20075.f65008;
                    if (C3911.m11924() > 0) {
                        iM6983 = (i18 - C0630.m2566("ۙ᩸")) * 81;
                        i13 = ((iM6983 ^ i17) * (-1427)) ^ 414612819;
                        i14 = -148524546;
                        short[] sArr114 = sArr14;
                        i20 = iM6983 ^ i14;
                        i19 = i13;
                        sArr14 = sArr114;
                    } else {
                        checkBox3 = checkBox3;
                        short[] sArr23 = sArr10;
                        sArr12 = sArr12;
                        i25 = i25;
                        sArr13 = sArr13;
                        i26 = i26;
                        sArr7 = sArr23;
                        iM2567 = (i18 - C0630.m2566("ۢ۬")) * (-49);
                        i19 = ((iM2567 ^ i17) * 6577) ^ 1031864833;
                        i7 = 1811963232;
                        i6 = iM2567 ^ i7;
                        checkBox3 = checkBox3;
                        sArr14 = sArr14;
                        i20 = i6;
                        r0 = this;
                        short[] sArr115 = sArr13;
                        i25 = i25;
                        sArr12 = sArr12;
                        sArr10 = sArr7;
                        i26 = i26;
                        sArr13 = sArr115;
                    }
                    break;
                case -729157267:
                case 74743817:
                    sArr14 = sArr14;
                    checkBox3 = checkBox3;
                    short[] sArr24 = sArr10;
                    sArr12 = sArr12;
                    i25 = i25;
                    sArr13 = sArr13;
                    i26 = i26;
                    sArr7 = sArr24;
                    C0964.m3409(r0, iM25610 ^ i27);
                    strM28025 = C11340.m28025(f30638, 79, 3, i22);
                    if (C3746.m11369() >= 0) {
                        iM2567 = (i18 - C0630.m2566("ۢ۬")) * (-49);
                        i19 = ((iM2567 ^ i17) * 6577) ^ 1031864833;
                        i7 = 1811963232;
                    } else {
                        iM2567 = (i18 - C0630.m2566("֫֡")) * (-69);
                        i19 = ((iM2567 ^ i17) * 11867) ^ 913369822;
                        i7 = -93183032;
                    }
                    i6 = iM2567 ^ i7;
                    checkBox3 = checkBox3;
                    sArr14 = sArr14;
                    i20 = i6;
                    r0 = this;
                    short[] sArr116 = sArr13;
                    i25 = i25;
                    sArr12 = sArr12;
                    sArr10 = sArr7;
                    i26 = i26;
                    sArr13 = sArr116;
                    break;
                case -621739614:
                case 1752055208:
                    checkBox3 = (CheckBox) viewM3409;
                    interfaceC12345 = ApplicationC20075.f65008;
                    sArr14 = f30638;
                    i23 = 88;
                    if (C21923.f70183 == 0) {
                        iM6982 = C2105.m6981("ۜۖ") ^ i17;
                        i11 = ((iM6982 ^ i18) * 15989) ^ 782887306;
                        i12 = -1337918139;
                        i20 = iM6982 ^ i12;
                        i19 = i11;
                    } else {
                        sArr14 = sArr14;
                        sArr8 = sArr10;
                        sArr3 = sArr12;
                        i2 = i25;
                        int iM6986 = C2105.m6981("ܽᩴ") ^ i18;
                        short[] sArr25 = sArr8;
                        i19 = ((iM6986 ^ i17) * 15265) ^ 750314618;
                        i25 = i2;
                        sArr12 = sArr3;
                        sArr10 = sArr25;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        i20 = iM6986 ^ (-1563937903);
                    }
                    break;
                case -561647453:
                case 2058679631:
                    sArr14 = sArr14;
                    checkBox4 = (CheckBox) C4263.m12813(r0, iM6985 ^ i24);
                    interfaceC12346 = ApplicationC20075.f65008;
                    sArr12 = f30638;
                    i21 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                    iM6983 = (C2105.m6981("ܿۤ") + i18) * (-79);
                    i13 = ((iM6983 ^ i17) * (-5717)) ^ (-498857354);
                    i14 = -767101402;
                    short[] sArr117 = sArr14;
                    i20 = iM6983 ^ i14;
                    i19 = i13;
                    sArr14 = sArr117;
                    break;
                case -506031115:
                case 435381562:
                    sArr14 = sArr14;
                    z = false;
                    z = false;
                    C2167.m7160(checkBox4, C4263.m12818(interfaceC12346, C3245.m9934(sArr12, i21, 18, i22), false));
                    if (C1420.f5096 > 0) {
                        iM6983 = C0630.m2566("ᩳܽ") ^ i17;
                        i13 = ((iM6983 ^ i18) * 11699) ^ (-966505157);
                        i14 = -749905872;
                        short[] sArr118 = sArr14;
                        i20 = iM6983 ^ i14;
                        i19 = i13;
                        sArr14 = sArr118;
                    } else {
                        sArr8 = sArr10;
                        sArr3 = sArr12;
                        i2 = i25;
                        int iM6987 = C2105.m6981("ܽᩴ") ^ i18;
                        short[] sArr26 = sArr8;
                        i19 = ((iM6987 ^ i17) * 15265) ^ 750314618;
                        i25 = i2;
                        sArr12 = sArr3;
                        sArr10 = sArr26;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        i20 = iM6987 ^ (-1563937903);
                    }
                    break;
                case -466590735:
                case 185912222:
                    sArr14 = sArr14;
                    iM6985 = C2105.m6981(C0483.m2128(sArr11, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i22));
                    i24 = 2127613584;
                    if (C11340.f33930 < 0) {
                        iM6983 = (C2105.m6981("᩷۠") + i17) * 123;
                        i13 = ((iM6983 ^ i18) * (-30495)) ^ (-15797477);
                        i14 = 337221583;
                        short[] sArr119 = sArr14;
                        i20 = iM6983 ^ i14;
                        i19 = i13;
                        sArr14 = sArr119;
                    } else {
                        checkBox3 = checkBox3;
                        short[] sArr27 = sArr10;
                        sArr12 = sArr12;
                        i25 = i25;
                        sArr13 = sArr13;
                        i26 = i26;
                        sArr7 = sArr27;
                        iM2567 = (i18 - C0630.m2566("ۢ۬")) * (-49);
                        i19 = ((iM2567 ^ i17) * 6577) ^ 1031864833;
                        i7 = 1811963232;
                        i6 = iM2567 ^ i7;
                        checkBox3 = checkBox3;
                        sArr14 = sArr14;
                        i20 = i6;
                        r0 = this;
                        short[] sArr1110 = sArr13;
                        i25 = i25;
                        sArr12 = sArr12;
                        sArr10 = sArr7;
                        i26 = i26;
                        sArr13 = sArr1110;
                    }
                    break;
                case -463240696:
                case 1335732576:
                    interfaceC12344 = interfaceC12345;
                    checkBox = checkBox3;
                    C0714.m2802(checkBox, C4263.m12818(interfaceC12344, C3432.m10488(sArr14, i23, 29, i22), true));
                    C3663.m11173(checkBox, r0);
                    sArr = f30638;
                    if (C21923.m49329()) {
                        iM6981 = C0630.m2566("۠ۙ") ^ i17;
                        sArr2 = sArr;
                        i19 = ((iM6981 ^ i18) * 8465) ^ (-191266137);
                        i = 1560284458;
                    } else {
                        iM6981 = (i18 - C2105.m6981("ᩴۗ")) * 109;
                        sArr2 = sArr;
                        i19 = ((iM6981 ^ i17) * 11517) ^ (-1910506392);
                        i = -200508934;
                    }
                    int i31 = iM6981 ^ i;
                    interfaceC12345 = interfaceC12344;
                    sArr11 = sArr2;
                    i20 = i31;
                    checkBox3 = checkBox;
                    break;
                case -366539917:
                case 2134047849:
                    sArr14 = sArr14;
                    int i32 = i26;
                    short[] sArr28 = sArr10;
                    short[] sArr29 = sArr12;
                    C0964.m3409(r0, C0630.m2566(strM28025) ^ 2102004742);
                    short[] sArr30 = f30638;
                    i25 = 82;
                    int iM6988 = (C2105.m6981("᩺ܶ") + i18) * (-33);
                    int i33 = ((iM6988 ^ i17) * 2231) ^ 1621549033;
                    i8 = iM6988 ^ 847342564;
                    checkBox3 = checkBox3;
                    sArr13 = sArr30;
                    i19 = i33;
                    sArr12 = sArr29;
                    sArr10 = sArr28;
                    i26 = i32;
                    short[] sArr31 = sArr14;
                    i20 = i8;
                    sArr14 = sArr31;
                    break;
                case -130469662:
                case 1259963367:
                    short[] sArr32 = sArr14;
                    short[] sArr33 = sArr10;
                    sArr3 = sArr12;
                    i2 = i25;
                    sArr4 = sArr13;
                    i3 = i26;
                    sArr5 = sArr33;
                    short s2 = f30638[75];
                    int iM25612 = C0630.m2566("֡ۧ") ^ i17;
                    checkBox3 = checkBox3;
                    s = s2;
                    i15 = s2 + 5239;
                    i19 = ((iM25612 ^ i18) * EnumC5983.f18409) ^ 1222158635;
                    r0 = this;
                    sArr6 = sArr32;
                    i20 = iM25612 ^ 236337633;
                    sArr14 = sArr6;
                    short[] sArr34 = sArr4;
                    i25 = i2;
                    sArr12 = sArr3;
                    sArr10 = sArr5;
                    i26 = i3;
                    sArr13 = sArr34;
                    break;
                case 287177192:
                case 1550331695:
                    C1504.m5166(checkBox5, r0);
                    r0.bindService(new Intent((Context) r0, (Class<?>) ServiceC13018.class), r0, z ? 1 : 0);
                    break;
                case 414049173:
                case 2132511911:
                    C11340.m28031();
                    if (RunnableC3474.f10992 > 0) {
                        iM6982 = C2105.m6981("ۖ᩻") ^ i18;
                        i11 = ((iM6982 ^ i17) * (-28403)) ^ (-1851256629);
                        i12 = 1005392333;
                        i20 = iM6982 ^ i12;
                        i19 = i11;
                    } else {
                        sArr = sArr11;
                        checkBox = checkBox3;
                        interfaceC12344 = interfaceC12345;
                        iM6981 = C0630.m2566("۠ۙ") ^ i17;
                        sArr2 = sArr;
                        i19 = ((iM6981 ^ i18) * 8465) ^ (-191266137);
                        i = 1560284458;
                        int i34 = iM6981 ^ i;
                        interfaceC12345 = interfaceC12344;
                        sArr11 = sArr2;
                        i20 = i34;
                        checkBox3 = checkBox;
                    }
                    break;
                case 563580552:
                case 1188535329:
                    sArr14 = sArr14;
                    checkBox2 = checkBox3;
                    short[] sArr35 = sArr10;
                    sArr3 = sArr12;
                    sArr9 = sArr35;
                    C9762 c9762 = (C9762) C4263.m12813(r0, iM25611);
                    r0.f10584 = c9762;
                    RunnableC1108.m3780(r0, c9762);
                    C1773.m5915(this);
                    C9762 c9763 = r0.f10584;
                    if (C0714.f2697 < 0) {
                        RunnableC3474.m10625(c9763, new ViewOnClickListenerC9264(r0, 1));
                        sArr8 = f30638;
                        i26 = 85;
                        if (C1128.m3851() > 0) {
                            int iM25613 = (C0630.m2566("ۛ᩸") ^ i18) * (-97);
                            int i35 = ((iM25613 ^ i17) * 23181) ^ 401795790;
                            i8 = iM25613 ^ (-771044868);
                            checkBox3 = checkBox2;
                            sArr10 = sArr8;
                            i19 = i35;
                            sArr12 = sArr3;
                            short[] sArr36 = sArr14;
                            i20 = i8;
                            sArr14 = sArr36;
                        } else {
                            checkBox3 = checkBox2;
                            i2 = i25;
                            int iM6989 = C2105.m6981("ܽᩴ") ^ i18;
                            short[] sArr210 = sArr8;
                            i19 = ((iM6989 ^ i17) * 15265) ^ 750314618;
                            i25 = i2;
                            sArr12 = sArr3;
                            sArr10 = sArr210;
                            sArr13 = sArr13;
                            sArr14 = sArr14;
                            i20 = iM6989 ^ (-1563937903);
                        }
                    } else {
                        iM2568 = (i17 - C2105.m6981("᩺۠")) * 53;
                        i9 = ((iM2568 ^ i18) * (-6143)) ^ 761051488;
                        i10 = 363735714;
                        int i210 = iM2568 ^ i10;
                        checkBox3 = checkBox2;
                        short[] sArr1111 = sArr14;
                        i20 = i210;
                        i19 = i9;
                        sArr14 = sArr1111;
                        short[] sArr211 = sArr9;
                        i26 = i26;
                        sArr12 = sArr3;
                        sArr10 = sArr211;
                    }
                    break;
                case 776990582:
                case 1509651113:
                    sArr14 = sArr14;
                    CheckBox checkBox6 = checkBox3;
                    short[] sArr37 = sArr10;
                    sArr3 = sArr12;
                    int i36 = i26;
                    sArr5 = sArr37;
                    sArr13 = sArr13;
                    i3 = i36;
                    i2 = i25;
                    iM25611 = C0630.m2566(C2520.m8030(sArr13, i2, 3, i22)) ^ 2117964136;
                    if (C1916.m6308() < 0) {
                        int iM25614 = C0630.m2566("ۡ᩷") ^ i17;
                        sArr4 = sArr13;
                        checkBox3 = checkBox6;
                        sArr6 = sArr14;
                        i20 = iM25614 ^ 1974781193;
                        i19 = ((iM25614 ^ i18) * (-17353)) ^ 838746195;
                        r0 = r0;
                        sArr14 = sArr6;
                        short[] sArr38 = sArr4;
                        i25 = i2;
                        sArr12 = sArr3;
                        sArr10 = sArr5;
                        i26 = i3;
                        sArr13 = sArr38;
                    } else {
                        checkBox3 = checkBox6;
                        sArr8 = sArr5;
                        i26 = i3;
                        int iM69810 = C2105.m6981("ܽᩴ") ^ i18;
                        short[] sArr212 = sArr8;
                        i19 = ((iM69810 ^ i17) * 15265) ^ 750314618;
                        i25 = i2;
                        sArr12 = sArr3;
                        sArr10 = sArr212;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        i20 = iM69810 ^ (-1563937903);
                    }
                    break;
                case 1300451169:
                case 1513433264:
                    sArr14 = sArr14;
                    checkBox3 = checkBox3;
                    short[] sArr39 = sArr10;
                    sArr12 = sArr12;
                    i25 = i25;
                    sArr13 = sArr13;
                    i26 = i26;
                    sArr7 = sArr39;
                    short s3 = s;
                    if ((s3 * 20956) - (i15 * i15) <= 0) {
                        iM2566 = (i18 - C2105.m6981("ۨۨ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i17) * 29609) ^ 111567156;
                        i5 = -1431867347;
                    } else {
                        iM2566 = C0630.m2566("ۚᩴ") ^ i18;
                        i4 = ((iM2566 ^ i17) * (-16353)) ^ (-565273213);
                        i5 = -1393713852;
                    }
                    i6 = iM2566 ^ i5;
                    s = s3;
                    i19 = i4;
                    checkBox3 = checkBox3;
                    sArr14 = sArr14;
                    i20 = i6;
                    r0 = this;
                    short[] sArr1112 = sArr13;
                    i25 = i25;
                    sArr12 = sArr12;
                    sArr10 = sArr7;
                    i26 = i26;
                    sArr13 = sArr1112;
                    break;
                case 1342171409:
                case 2085671804:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        sArr14 = sArr14;
                        checkBox3 = checkBox3;
                        short[] sArr213 = sArr10;
                        sArr12 = sArr12;
                        i25 = i25;
                        sArr13 = sArr13;
                        i26 = i26;
                        sArr7 = sArr213;
                        iM2567 = (i18 - C0630.m2566("ۢ۬")) * (-49);
                        i19 = ((iM2567 ^ i17) * 6577) ^ 1031864833;
                        i7 = 1811963232;
                        i6 = iM2567 ^ i7;
                        checkBox3 = checkBox3;
                        sArr14 = sArr14;
                        i20 = i6;
                        r0 = this;
                        short[] sArr1113 = sArr13;
                        i25 = i25;
                        sArr12 = sArr12;
                        sArr10 = sArr7;
                        i26 = i26;
                        sArr13 = sArr1113;
                    } else {
                        sArr = sArr11;
                        checkBox = checkBox3;
                        interfaceC12344 = interfaceC12345;
                        iM6981 = C0630.m2566("۠ۙ") ^ i17;
                        sArr2 = sArr;
                        i19 = ((iM6981 ^ i18) * 8465) ^ (-191266137);
                        i = 1560284458;
                        int i37 = iM6981 ^ i;
                        interfaceC12345 = interfaceC12344;
                        sArr11 = sArr2;
                        i20 = i37;
                        checkBox3 = checkBox;
                    }
                    break;
                default:
                    C2105.m6982();
                    C3432.m10477();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        BinderC3141 binderC3141 = null;
        int i = 234308500;
        int i2 = C1773.f6144;
        int i3 = C3911.f12484;
        int iM2566 = C0630.m2566("ۗۘ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-14765)) ^ (-385296509);
        int i5 = -2143776959;
        while (true) {
            i = ((((i ^ i2) * 3053) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2066390292:
                case 135991637:
                    break;
                case -1739789136:
                case 1779387939:
                    C1128.m3851();
                    if (C0050.f910 < 0) {
                        iM2566 = (C2105.m6981("֫ۖ") ^ i2) * 23;
                        i4 = ((iM2566 ^ i3) * (-2177)) ^ (-1905611479);
                        i5 = -2139648712;
                    } else {
                        iM2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    }
                    break;
                case -1628437085:
                case -1461276377:
                    C5695.m16023();
                    if (AbstractC2021.f6743 > 0) {
                        iM2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    } else {
                        iM2566 = (C0630.m2566("ܶܽ") + i3) * 51;
                        i4 = ((iM2566 ^ i2) * 5675) ^ 1242129349;
                        i5 = -1199630242;
                    }
                    break;
                case -1427414728:
                case 1448882763:
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    } else {
                        iM2566 = C2105.m6981("ۙ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27705) ^ 833638589;
                        i5 = -827136804;
                    }
                    break;
                case -1283862269:
                case -91192584:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ۘۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7245) ^ (-1414339096);
                        i5 = 1308970445;
                    } else {
                        iM2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    }
                    break;
                case -1222894304:
                case 22227783:
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("֫ۖ") ^ i2) * 23;
                        i4 = ((iM2566 ^ i3) * (-2177)) ^ (-1905611479);
                        i5 = -2139648712;
                    } else {
                        iM2566 = C2105.m6981("ܶۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15763)) ^ (-1466250421);
                        i5 = -966706940;
                    }
                    break;
                case -1100857556:
                case 2073673330:
                    binderC3141 = this.f30640;
                    if (binderC3141 != null) {
                        iM2566 = C0630.m2566("ۡᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17075)) ^ 1643116798;
                        i5 = -192405693;
                    } else {
                        iM2566 = C2105.m6981("ۘۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27835) ^ (-1141592308);
                        i5 = 632005210;
                    }
                    break;
                case -1033333165:
                case 1331141692:
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("ᩴۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22461)) ^ (-1239888631);
                        i5 = -500210301;
                    } else {
                        iM2566 = C2105.m6981("ۘۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7245) ^ (-1414339096);
                        i5 = 1308970445;
                    }
                    break;
                case -1022186688:
                case 1064391416:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C2105.m6981("۠ܺ") + i2) * (-95);
                        i4 = ((iM2566 ^ i3) * 27319) ^ (-923078720);
                        i5 = 1059720416;
                    } else {
                        iM2566 = (C2105.m6981("ܶ֨") ^ i3) * 83;
                        i4 = ((iM2566 ^ i2) * (-21185)) ^ 337775874;
                        i5 = -1802511975;
                    }
                    break;
                case -862896506:
                case 938723519:
                    if (C0382.f1805) {
                        iM2566 = C0630.m2566("᩺ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-18861)) ^ 898279825;
                        i5 = -1652972655;
                    } else {
                        iM2566 = (C2105.m6981("۠ܺ") + i2) * (-95);
                        i4 = ((iM2566 ^ i3) * 27319) ^ (-923078720);
                        i5 = 1059720416;
                    }
                    break;
                case -535863796:
                case 1451953516:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۘۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7245) ^ (-1414339096);
                        i5 = 1308970445;
                    } else {
                        iM2566 = (C0630.m2566("֡ܿ") + i2) * 119;
                        i4 = ((iM2566 ^ i3) * (-28807)) ^ 903531794;
                        i5 = -1652020925;
                    }
                    break;
                case -388186478:
                case 627801886:
                    if (C2105.m6982() != 0) {
                        iM2566 = (C2105.m6981("֫ۖ") ^ i2) * 23;
                        i4 = ((iM2566 ^ i3) * (-2177)) ^ (-1905611479);
                        i5 = -2139648712;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۠ۘ")) * 91;
                        i4 = ((iM2566 ^ i3) * 1757) ^ (-933040453);
                        i5 = -1569524814;
                    }
                    break;
                case -134532782:
                case 2001367579:
                    RunnableC1108.m3781(this);
                    iM2566 = (C0630.m2566("ۗᩴ") + i3) * 79;
                    i4 = ((iM2566 ^ i2) * 16737) ^ 1019608641;
                    i5 = -994624542;
                    break;
                case -91938676:
                case 668282351:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C2105.m6981("۠ܺ") + i2) * (-95);
                        i4 = ((iM2566 ^ i3) * 27319) ^ (-923078720);
                        i5 = 1059720416;
                    } else {
                        iM2566 = C2105.m6981("ᩳۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12583) ^ 127682491;
                        i5 = -1749563997;
                    }
                    break;
                case -20188981:
                case 2122409196:
                    C4159.m12565();
                    C2167.m7155();
                    iM2566 = (C0630.m2566("ܶܽ") + i3) * 51;
                    i4 = ((iM2566 ^ i2) * 5675) ^ 1242129349;
                    i5 = -1199630242;
                    break;
                case 147445648:
                case 1725658037:
                    super.onStop();
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۧ֨")) * 31;
                        i4 = ((iM2566 ^ i2) * (-8785)) ^ (-1829907307);
                        i5 = 1603036468;
                    }
                    break;
                case 233784135:
                case 309057252:
                    binderC3141.m9569();
                    iM2566 = C2105.m6981("ۘۧ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 27835) ^ (-1141592308);
                    i5 = 632005210;
                    break;
                case 502850422:
                case 1901582713:
                    if (C1504.f5354) {
                        iM2566 = (C2105.m6981("۠ܺ") + i2) * (-95);
                        i4 = ((iM2566 ^ i3) * 27319) ^ (-923078720);
                        i5 = 1059720416;
                    } else {
                        iM2566 = C0630.m2566("ۢܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 17603) ^ 1997679830;
                        i5 = 1375725485;
                    }
                    break;
                case 1192335242:
                case 2014781433:
                    C3245.m9925();
                    break;
                default:
                    if (C4117.m12349(this)) {
                        iM2566 = (C0630.m2566("ۗᩴ") + i3) * 79;
                        i4 = ((iM2566 ^ i2) * 16737) ^ 1019608641;
                        i5 = -994624542;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܰۨ")) * 11;
                        i4 = ((iM2566 ^ i3) * (-20359)) ^ 2006112526;
                        i5 = 1968383153;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01b6 A[PHI: r3 r5 r6 r7
      0x01b6: PHI (r3v4 java.lang.String) = 
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:47:0x01b4, B:37:0x013a, B:17:0x0077, B:15:0x0073, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:47:0x01b4, B:37:0x013a, B:17:0x0077, B:15:0x0073, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:47:0x01b4, B:37:0x013a, B:17:0x0077, B:15:0x0073, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:47:0x01b4, B:37:0x013a, B:17:0x0077, B:15:0x0073, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x025f A[PHI: r1 r10 r11
      0x025f: PHI (r1v4 int) = (r1v3 int), (r1v2 int) binds: [B:60:0x025d, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]) binds: [B:60:0x025d, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:60:0x025d, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02f2 A[PHI: r18 r23
      0x02f2: PHI (r18v4 int) = (r18v3 int), (r18v2 int) binds: [B:71:0x02f0, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r23v5 int) = (r23v4 int), (r23v3 int) binds: [B:71:0x02f0, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0343 A[PHI: r4 r12 r16 r17
      0x0343: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:79:0x0341, B:75:0x0323, B:33:0x0119, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:79:0x0341, B:75:0x0323, B:33:0x0119, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:79:0x0341, B:75:0x0323, B:33:0x0119, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r17v4 short) = (r17v2 short), (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:79:0x0341, B:75:0x0323, B:33:0x0119, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0375 A[PHI: r13 r14 r15
      0x0375: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:83:0x0373, B:51:0x01e8, B:12:0x006b, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0375: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:83:0x0373, B:51:0x01e8, B:12:0x006b, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0375: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:83:0x0373, B:51:0x01e8, B:12:0x006b, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int iM2566;
        int i;
        int i2;
        String strM10568;
        int i3 = C1773.f6144;
        int i4 = C22628.f73083;
        int iM2567 = C0630.m2566("᩷ۖ") ^ i4;
        int i5 = ((iM2567 ^ i3) * (-8825)) ^ (-1842266504);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = iM2567 ^ (-456825884);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 823963732;
        int i16 = 0;
        String strM16034 = null;
        String strM6573 = null;
        String str = null;
        int iM3006 = 0;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * (-9929)) >> 31));
            switch (i15) {
                case -2138791756:
                case 121781037:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ܳ᩷") ^ i4;
                        i = ((iM2566 ^ i3) * 25973) ^ (-612781321);
                        i2 = -636884846;
                    } else {
                        iM2566 = C2105.m6981("᩷ܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-35)) ^ 1406493166;
                        i2 = -1278147564;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2137348631:
                case -1253373146:
                    RunnableC1937.m6387();
                    C1420.m4913();
                    iM2566 = C0630.m2566("ܳ᩷") ^ i4;
                    i = ((iM2566 ^ i3) * 25973) ^ (-612781321);
                    i2 = -636884846;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2098397560:
                case -1952374068:
                    if (iM3006 == (C0630.m2566(C22628.m50602(sArr2, i10, i11, i9)) ^ 2119362266)) {
                        iM2566 = C2105.m6981("ۜۗ") ^ i4;
                        i = ((iM2566 ^ i3) * 131) ^ 859421041;
                        i2 = 630263814;
                    } else {
                        iM2566 = C2105.m6981("ۤ۟") ^ i4;
                        i = ((iM2566 ^ i3) * (-23175)) ^ 811200890;
                        i2 = -364588976;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2043594412:
                case -1747448924:
                    if (C3537.m10746() > 0) {
                        iM2566 = C0630.m2566("ܳ᩷") ^ i4;
                        i = ((iM2566 ^ i3) * 25973) ^ (-612781321);
                        i2 = -636884846;
                    } else {
                        iM2566 = C2105.m6981("۠֡") ^ i3;
                        i = ((iM2566 ^ i4) * 21441) ^ 1814656539;
                        i2 = -1678331887;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2008345892:
                case 206312797:
                    break;
                case -1912590480:
                case 1770291573:
                    strM10568 = null;
                    str = strM10568;
                    iM2566 = C0630.m2566("ۧ᩵") ^ i3;
                    i = ((iM2566 ^ i4) * 21303) ^ (-1092915294);
                    i2 = -892410376;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1853633122:
                case 67336230:
                    strM6573 = AbstractC2021.m6573(sArr3, i12, i13, i9);
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = C0630.m2566("ܳ᩷") ^ i4;
                        i = ((iM2566 ^ i3) * 25973) ^ (-612781321);
                        i2 = -636884846;
                    } else {
                        iM2566 = C2105.m6981("ۡᩳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-1657)) ^ 1932700039;
                        i2 = 1562391401;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1720299863:
                case 320316732:
                    strM10568 = C3432.m10488(f30638, 39, 18, i9);
                    str = strM10568;
                    iM2566 = C0630.m2566("ۧ᩵") ^ i3;
                    i = ((iM2566 ^ i4) * 21303) ^ (-1092915294);
                    i2 = -892410376;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1652019752:
                case 687572999:
                    iM3006 = C0798.m3006(compoundButton);
                    sArr2 = f30638;
                    i10 = 1;
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("ܳۛ") ^ i3;
                        i = ((iM2566 ^ i4) * 30427) ^ 2124237398;
                        i2 = 704625875;
                    } else {
                        iM2566 = (C0630.m2566("ܿᩴ") ^ i4) * 71;
                        i = ((iM2566 ^ i3) * 31909) ^ (-1946941153);
                        i2 = 999334554;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1491276941:
                case 1536959925:
                    sArr = f30638;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C0630.m2566("᩻֫") ^ i3;
                        i = ((iM2566 ^ i4) * (-23493)) ^ 445710183;
                        i2 = 1542237450;
                    } else {
                        iM2566 = (C0630.m2566("ۖ֨") + i3) * (-31);
                        i = ((iM2566 ^ i4) * (-10305)) ^ 1783172419;
                        i2 = 749426878;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1484744109:
                case -791858047:
                    i14 = s * 39260;
                    i16 = s * s;
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("۠֡") ^ i3;
                        i = ((iM2566 ^ i4) * 21441) ^ 1814656539;
                        i2 = -1678331887;
                    } else {
                        iM2566 = C0630.m2566("֫ܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 19929) ^ 531821401;
                        i2 = 1236354347;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1395095732:
                case -542700856:
                    sArr3 = f30638;
                    i12 = 4;
                    i13 = 3;
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ܶۚ") ^ i4;
                        i = ((iM2566 ^ i3) * 19115) ^ 202085827;
                        i2 = 836802721;
                    } else {
                        iM2566 = C2105.m6981("᩷ܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-35)) ^ 1406493166;
                        i2 = -1278147564;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1356150612:
                case 1968371308:
                    C3663.m11168();
                    if (C1711.m5736() > 0) {
                        iM2566 = C2105.m6981("᩷ܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-35)) ^ 1406493166;
                        i2 = -1278147564;
                    } else {
                        iM2566 = C2105.m6981("ܳۛ") ^ i3;
                        i = ((iM2566 ^ i4) * 30427) ^ 2124237398;
                        i2 = 704625875;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1070182527:
                case 1728877106:
                    if ((i16 + 385336900) - i14 >= 0) {
                        iM2566 = C2105.m6981("᩻ᩳ") ^ i4;
                        i = ((iM2566 ^ i3) * (-13305)) ^ (-582398353);
                        i2 = 1958041857;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۘܰ")) * (-49);
                        i = ((iM2566 ^ i4) * 14237) ^ (-1152569531);
                        i2 = 482009946;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -786080200:
                case -373965722:
                    if (C4616.m13552() != 0) {
                        iM2566 = C2105.m6981("᩷ܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-35)) ^ 1406493166;
                        i2 = -1278147564;
                    } else {
                        iM2566 = (C0630.m2566("֫ۡ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i3) * (-19219)) ^ (-803876665);
                        i2 = 159847520;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -707826573:
                case 2051181628:
                    strM16034 = C5695.m16034(sArr4, i7, i8, i9);
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("᩻֫") ^ i3;
                        i = ((iM2566 ^ i4) * (-23493)) ^ 445710183;
                        i2 = 1542237450;
                    } else {
                        iM2566 = C2105.m6981("ۚܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 24821) ^ (-1883530699);
                        i2 = 480289320;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -691570769:
                case -462195616:
                    if (str != null) {
                        iM2566 = (i4 - C2105.m6981("֨ۛ")) * (-83);
                        i = ((iM2566 ^ i3) * (-21657)) ^ 341052042;
                        i2 = 1694698298;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۜۙ")) * (-91);
                        i = ((iM2566 ^ i4) * 3507) ^ 74576251;
                        i2 = 1857038240;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -642618437:
                case 1939717421:
                    if (iM3006 == (C2105.m6981(strM6573) ^ 2120084456)) {
                        iM2566 = C0630.m2566("ܶܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-10857)) ^ (-829468847);
                        i2 = -1399476605;
                    } else {
                        iM2566 = C0630.m2566("᩺۫") ^ i3;
                        i = ((iM2566 ^ i4) * (-24087)) ^ 1906849162;
                        i2 = 103450963;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -498467129:
                case -269871147:
                    C2272.m7503();
                    break;
                case -493036086:
                case 1895461418:
                    C22870.m50970(ApplicationC20075.f65008, str, z);
                    iM2566 = (i3 - C0630.m2566("ۜۙ")) * (-91);
                    i = ((iM2566 ^ i4) * 3507) ^ 74576251;
                    i2 = 1857038240;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -204381216:
                case 290511000:
                    i9 = 24840;
                    iM2566 = (C0630.m2566("ۨ۟") + i3) * (-81);
                    i = ((iM2566 ^ i4) * (-27115)) ^ (-281537857);
                    i2 = 490053380;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 39304326:
                case 1693562096:
                    strM10568 = C22628.m50602(f30638, 57, 18, i9);
                    str = strM10568;
                    iM2566 = C0630.m2566("ۧ᩵") ^ i3;
                    i = ((iM2566 ^ i4) * 21303) ^ (-1092915294);
                    i2 = -892410376;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 97057650:
                case 840767614:
                    if (iM3006 == (C0630.m2566(strM16034) ^ 2100409944)) {
                        iM2566 = (C0630.m2566("۟۟") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i3) * 21593) ^ (-964341853);
                        i2 = 474454747;
                    } else {
                        iM2566 = C2105.m6981("ۛܽ") ^ i3;
                        i = ((iM2566 ^ i4) * 687) ^ (-1799853316);
                        i2 = -1598188220;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 275959198:
                case 573642917:
                    strM10568 = ServiceConnectionC3453.m10568(f30638, 7, 29, i9);
                    str = strM10568;
                    iM2566 = C0630.m2566("ۧ᩵") ^ i3;
                    i = ((iM2566 ^ i4) * 21303) ^ (-1092915294);
                    i2 = -892410376;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 463770586:
                case 680842004:
                    sArr4 = f30638;
                    i7 = 36;
                    i8 = 3;
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("ܳ᩷") ^ i4;
                        i = ((iM2566 ^ i3) * 25973) ^ (-612781321);
                        i2 = -636884846;
                    } else {
                        iM2566 = (C0630.m2566("ۢܿ") ^ i4) * (-53);
                        i = ((iM2566 ^ i3) * 20683) ^ (-219239301);
                        i2 = -1382985770;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1096093882:
                case 1329604814:
                    i9 = 56497;
                    iM2566 = (C0630.m2566("ۨ۟") + i3) * (-81);
                    i = ((iM2566 ^ i4) * (-27115)) ^ (-281537857);
                    i2 = 490053380;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 2052952630:
                case 2140340128:
                    s = sArr[0];
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("᩻֫") ^ i3;
                        i = ((iM2566 ^ i4) * (-23493)) ^ 445710183;
                        i2 = 1542237450;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۡ۠")) * 79;
                        i = ((iM2566 ^ i3) * (-31377)) ^ (-1670953980);
                        i2 = 122398767;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 3;
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("᩻֫") ^ i3;
                        i = ((iM2566 ^ i4) * (-23493)) ^ 445710183;
                        i2 = 1542237450;
                    } else {
                        iM2566 = (C2105.m6981("᩺֨") ^ i3) * (-19);
                        i = ((iM2566 ^ i4) * 12359) ^ (-1308753799);
                        i2 = 209588596;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f30640 = null;
    }
}
