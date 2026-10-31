package l;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.m.y.q;
import java.lang.ref.WeakReference;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11182 {

    /* JADX INFO: renamed from: ۛܶۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f33561 = {1720, -3697, -13476, -3505, 2635, 337, 819, -26315, -26310, -26307, -26313, -26363, -26310, -26314, -26332, -26351, -26326, -26342, -26313, -26245, -26243, -26243, -26243, -26246, 7134, -5947, 969, -5040, -6396, 3982, 4499, -2597, -7062, 6779, -6593, -5067, -7439, 6068, -14227, 4236, -3618, -13451, 8030, -13638, 861, -3829, 5130, -8117, 2695, -6804, 5582, 6860, -6060, -10612, 2445, -7013, -8037, -6174, 8189, 5557, -26244, -6015, 946, -15302, -26307, -26330, -26305, -26305, -26253, -26320, -26318, -26307, -26307, -26308, -26329, -26253, -26319, -26314, -26253, -26320, -26318, -26336, -26329, -26253, -26329, -26308, -26253, -26307, -26308, -26307, -26242, -26307, -26330, -26305, -26305, -26253, -26329, -26326, -26333, -26314, -26253, -26318, -26307, -26313, -26335, -26308, -26310, -26313, -26243, -26332, -26310, -26313, -26316, -26314, -26329, -26243, -26361, -26314, -26325, -26329, -26363, -26310, -26314, -26332, -26271, -26243, -26271, -26267, -26243, -26270, -26269, -26253, -26245, -26271, -26267, -26270, -26269, -26270, -26269, -26267, -26270, -26246, -26241, -26253, -26361, -26368, -26271, -26261, -14325, -6943, -12609, -14703, -6193, -2199, 3003, -964, -7637, 2185, -1124, -2476, -1729, 7090, 231, -2148, 2928, 3456, -13607, 4486, 74, -6968, -2802, 7474, 4328, -4674, -2790, -26367, -26340, -26340, -26361, -14622, -1462, -8014, -6195, 7380, -13764, -26368, -26341, -26346, -26337, -26337, 4268, -6226, 4814, -26307, -26330, -26305, -26305, -26253, -26320, -26318, -26307, -26307, -26308, -26329, -26253, -26319, -26314, -26253, -26320, -26318, -26336, -26329, -26253, -26329, -26308, -26253, -26307, -26308, -26307, -26242, -26307, -26330, -26305, -26305, -26253, -26329, -26326, -26333, -26314, -26253, -26318, -26307, -26313, -26335, -26308, -26310, -26313, -26243, -26331, -26310, -26314, -26332, -26243, -26363, -26310, -26314, -26332, -1358, -2822, -7791, -26316, -26314, -26329, -26367, -26314, -26336, -26308, -26330, -26335, -26320, -26314, -26336, -26245, -26243, -26243, -26243, -26246, 4185, 5312, 1166, -26307, -26330, -26305, -26305, -26253, -26320, -26318, -26307, -26307, -26308, -26329, -26253, -26319, -26314, -26253, -26320, -26318, -26336, -26329, -26253, -26329, -26308, -26253, -26307, -26308, -26307, -26242, -26307, -26330, -26305, -26305, -26253, -26329, -26326, -26333, -26314, -26253, -26318, -26307, -26313, -26335, -26308, -26310, -26313, -26243, -26331, -26310, -26314, -26332, -26243, -26363, -26310, -26314, -26332, -26348, -26335, -26308, -26330, -26333, 5453, -23074, -23102, -23102, -23076, -23101, -23082, -23075, -23104, -23081, -23080, -23086, -23101, -23078, -23159, -23140, -23140, -23087, -23078, -23095, -23054, -23084, -23082, -23075, -23097, -23140, -23102, -23074, -23140, -23102, -23103, -23156, -23098, -23103, -23073, -23154, -23077, -23097, -23097, -23101, -23146, -23168, -23054, -23146, -23167, -23051, -23146, -23167, -23051, -23102, -23074, -23139, -23102, -23102, -23139, -23088, -23076, -23074, -23146, -23167, -23051, -23088, -23084, -23078, -23138, -23087, -23078, -23075, -23146, -23167, -23051, -23102, -23074, -23146, -23167, -23051, -23102, -23103, -23146, -23168, -23051, -23083, -23103, -23076, -23074, -23146, -23168, -23049, -23086, -23101, -23101, -23146, -23167, -23163, -23101, -23146, -23168, -23049, -23086, -23075, -23081, -23103, -23076, -23078, -23081, -23146, -23167, -23163, -23079, -23098, -23074, -23101, -23060, -23083, -23103, -23076, -23074, -23146, -23168, -23049, -23100, -23082, -23087, -23086, -23101, -23078, -23146, -23167, -23163, -23080, -23146, -23168, -23049, 8078, 21091, 21089, 21110, 21099, 21108, 21099, 21110, 21115, 9294, 8844, 8851, 8863, 8845, 18208, -17350, -20045, 8859, 8854, 8842, 8850, 8859, 8846, 8840, 8859, 8852, 8841, 8854, 8859, 8846, 8851, 8853, 8852, 8867, -21770, 18597, 17279, 8840, 8853, 8846, 8859, 8846, 8851, 8853, 8852, -20992, 31898, -17245, -18653, -16533, -19698, 18927, 20900, -20432, -18104, -20766, 27854, -23721, -17377, 18880, 8852, 8847, 8854, 8854, 8922, 8857, 8859, 8852, 8852, 8853, 8846, 8922, 8856, 8863, 8922, 8857, 8859, 8841, 8846, 8922, 8846, 8853, 8922, 8852, 8853, 8852, 8919, 8852, 8847, 8854, 8854, 8922, 8846, 8835, 8842, 8863, 8922, 8859, 8852, 8862, 8840, 8853, 8851, 8862, 8916, 8844, 8851, 8863, 8845, 8916, 8876, 8851, 8863, 8845, 8893, 8840, 8853, 8847, 8842, 23086, 24280, 30136, 23041, 22247, -23832, 8852, 8847, 8854, 8854, 8922, 8857, 8859, 8852, 8852, 8853, 8846, 8922, 8856, 8863, 8922, 8857, 8859, 8841, 8846, 8922, 8846, 8853, 8922, 8852, 8853, 8852, 8919, 8852, 8847, 8854, 8854, 8922, 8846, 8835, 8842, 8863, 8922, 8859, 8852, 8862, 8840, 8853, 8851, 8862, 8916, 8844, 8851, 8863, 8845, 8916, 8876, 8851, 8863, 8845, -24135, 24501, -23246};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C8817 f33562 = C8817.m22788();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33563 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static WeakReference f33564;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f33565;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f33566;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6874 f33567;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient boolean f33568;

    /* JADX WARN: Code duplicated, block: B:66:0x0245 A[PHI: r5 r6 r7 r8 r17
      0x0245: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:65:0x0243, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:65:0x0243, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:65:0x0243, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r8v3 short) = (r8v2 short), (r8v4 short) binds: [B:65:0x0243, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r17v3 java.lang.String) = (r17v2 java.lang.String), (r17v4 java.lang.String) binds: [B:65:0x0243, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02a0 A[PHI: r1 r4 r17
      0x02a0: PHI (r1v13 android.content.Intent) = 
      (r1v2 android.content.Intent)
      (r1v2 android.content.Intent)
      (r1v12 android.content.Intent)
      (r1v14 android.content.Intent)
     binds: [B:73:0x029e, B:69:0x027b, B:44:0x013d, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r4v4 short[]) = (r4v2 short[]), (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:73:0x029e, B:69:0x027b, B:44:0x013d, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r17v15 java.lang.String) = (r17v0 java.lang.String), (r17v1 java.lang.String), (r17v14 java.lang.String), (r17v16 java.lang.String) binds: [B:73:0x029e, B:69:0x027b, B:44:0x013d, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27724(AbstractActivityC3346 abstractActivityC3346, String str, String str2) {
        int iM2566;
        int i;
        int iM6981;
        int i2;
        AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
        Intent intent = null;
        String str3 = null;
        Uri uri = null;
        short[] sArr = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short s3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -450584031;
        int i7 = C0630.f2410;
        int i8 = C11340.f33930;
        int iM6982 = (C2105.m6981("᩹ᩴ") ^ i7) * 69;
        int i9 = ((iM6982 ^ i8) * 28309) ^ (-959455376);
        int i10 = 449739425;
        while (true) {
            int i11 = iM6982 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i8) * (-13563)) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2040154242:
                    case -601058932:
                        C22628.m50608(abstractActivityC3347, str2);
                        break;
                    case -1954560333:
                    case 1137643961:
                        C7106.m19120();
                        ServiceConnectionC3453.m10564();
                        break;
                    case -1869288870:
                    case 1031664709:
                        intent = new Intent();
                        if (C7811.f24123 < 0) {
                            short[] sArr2 = f33561;
                            if (C7106.f21815 != 0) {
                                iM6981 = C0630.m2566("۬ܶ") ^ i8;
                                i9 = ((iM6981 ^ i7) * 18773) ^ 134551812;
                                i2 = -1696724583;
                                i11 = iM6981 ^ i2;
                            } else {
                                str3 = str3;
                                String strM3841 = C1128.m3841(sArr2, 330, 132, i5);
                                if (C0630.f2410 > 0) {
                                    StringBuilder sb = new StringBuilder(strM3841);
                                    C3245.m9923(sb, str);
                                    String strM947 = C0050.m947(sb);
                                    if (C11340.f33930 >= 0) {
                                        str3 = strM947;
                                    } else {
                                        int iM2567 = C0630.m2566("ۢ᩷") ^ i7;
                                        i9 = ((iM2567 ^ i8) * 31259) ^ 1099649574;
                                        str3 = strM947;
                                        i11 = iM2567 ^ (-1893063998);
                                        intent = intent;
                                    }
                                }
                                intent = intent;
                            }
                            abstractActivityC3347 = abstractActivityC3346;
                        } else {
                            str3 = str3;
                        }
                        iM2566 = C2105.m6981("ܰ۫") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-11199)) ^ (-1626194650);
                        i = -1724124358;
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case -1482960795:
                    case 1356837002:
                        intent.setData(uri);
                        C1711.m5738(intent, 268435456);
                        iM6981 = C2105.m6981("۫ۘ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 21665) ^ 946422537;
                        i2 = -1068727864;
                        i11 = iM6981 ^ i2;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case -1409409369:
                    case -1051731362:
                        str3 = str3;
                        sArr = f33561;
                        if (C2272.f7362) {
                            iM2566 = C2105.m6981("ܰ۫") ^ i8;
                            i9 = ((iM2566 ^ i7) * (-11199)) ^ (-1626194650);
                            i = -1724124358;
                        } else {
                            iM2566 = (C0630.m2566("۫᩷") ^ i7) * (-107);
                            i9 = ((iM2566 ^ i8) * (-9929)) ^ 1118433287;
                            i = 1310274196;
                        }
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case -1273568392:
                    case 485030808:
                        C3911.m11924();
                        if (C7811.f24123 >= 0) {
                            iM6981 = C0630.m2566("۬ܶ") ^ i8;
                            i9 = ((iM6981 ^ i7) * 18773) ^ 134551812;
                            i2 = -1696724583;
                            i11 = iM6981 ^ i2;
                            abstractActivityC3347 = abstractActivityC3346;
                        }
                        break;
                    case -917717233:
                    case -518307539:
                        str3 = str3;
                        int i12 = s + s2;
                        i3 = i12 * i12;
                        s3 = 2;
                        if (C3245.f10203 <= 0) {
                            iM2566 = C2105.m6981("ۜۙ") ^ i7;
                            i9 = ((iM2566 ^ i8) * 9095) ^ (-349706927);
                            i = 1180225443;
                        } else {
                            iM2566 = (i8 - C0630.m2566("᩵ۘ")) * 75;
                            i9 = ((iM2566 ^ i7) * 13881) ^ (-468683947);
                            i = 1616071392;
                        }
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case -840896138:
                    case 2127637031:
                        i5 = 42419;
                        iM2566 = C0630.m2566("᩻ܳ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 24083) ^ (-1329594023);
                        i = 1741563675;
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case -798240218:
                    case 87280593:
                        str3 = str3;
                        if ((i4 + 1) - i3 > 0) {
                            iM2566 = (C0630.m2566("ۘܶ") + i8) * q.h;
                            i9 = ((iM2566 ^ i7) * (-20661)) ^ 1345579614;
                            i = -1583327740;
                        } else {
                            iM2566 = (i8 - C0630.m2566("۟֫")) * (-61);
                            i9 = ((iM2566 ^ i7) * 22137) ^ (-58389225);
                            i = 217705367;
                        }
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case -601897181:
                    case 1450963302:
                        str3 = str3;
                        s = sArr[329];
                        s2 = 1;
                        if (C4117.f13076 <= 0) {
                            iM2566 = C2105.m6981("ۜۙ") ^ i7;
                            i9 = ((iM2566 ^ i8) * 9095) ^ (-349706927);
                            i = 1180225443;
                        } else {
                            iM2566 = (i7 - C0630.m2566("ܽ۟")) * 7;
                            i9 = ((iM2566 ^ i8) * (-7329)) ^ (-1323494718);
                            i = -1681163983;
                        }
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case -239341681:
                    case -213507278:
                        C1047.m3599();
                        if (AbstractC2021.f6743 <= 0) {
                        }
                        str3 = str3;
                        iM2566 = C2105.m6981("ܰ۫") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-11199)) ^ (-1626194650);
                        i = -1724124358;
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case -31229199:
                    case 1755595696:
                        str3 = str3;
                        if (C1294.m4372() <= 0) {
                            iM2566 = C2105.m6981("ܰ۫") ^ i8;
                            i9 = ((iM2566 ^ i7) * (-11199)) ^ (-1626194650);
                            i = -1724124358;
                        } else {
                            iM2566 = (C0630.m2566("֫᩶") ^ i8) * (-71);
                            i9 = ((iM2566 ^ i7) * 19039) ^ 872373630;
                            i = -2082070472;
                        }
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case 104907412:
                    case 950014774:
                        i5 = 13485;
                        iM2566 = C0630.m2566("᩻ܳ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 24083) ^ (-1329594023);
                        i = 1741563675;
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case 262768923:
                    case 1324675951:
                        C1773.m5908();
                        if (!C0483.m2121()) {
                            str3 = str3;
                            iM2566 = C0630.m2566("۠ۗ") ^ i7;
                            i9 = ((iM2566 ^ i8) * (-3665)) ^ 1993594590;
                            i = -1443489917;
                            i11 = iM2566 ^ i;
                            str3 = str3;
                            abstractActivityC3347 = abstractActivityC3346;
                        }
                        str3 = str3;
                        iM2566 = C2105.m6981("ܰ۫") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-11199)) ^ (-1626194650);
                        i = -1724124358;
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case 298998567:
                    case 342260665:
                        try {
                            C4075.m12261(abstractActivityC3347, intent);
                            int iM6983 = (i7 - C2105.m6981("۠᩷")) * (-67);
                            i11 = iM6983 ^ 88675210;
                            i9 = ((iM6983 ^ i8) * 24795) ^ (-1973900182);
                        } catch (Exception unused) {
                            iM6981 = (C2105.m6981("᩺ܽ") ^ i8) * (-57);
                            i9 = ((iM6981 ^ i7) * 16971) ^ 748873223;
                            i2 = 519339893;
                            i11 = iM6981 ^ i2;
                        }
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case 777104011:
                    case 1194622547:
                        str3 = str3;
                        i4 = s * s3;
                        if (C7106.f21815 != 0) {
                            iM2566 = C0630.m2566("۠ۗ") ^ i7;
                            i9 = ((iM2566 ^ i8) * (-3665)) ^ 1993594590;
                            i = -1443489917;
                        } else {
                            iM2566 = (i7 - C2105.m6981("ۜ۬")) * (-127);
                            i9 = ((iM2566 ^ i8) * (-8443)) ^ (-168572347);
                            i = 127267687;
                        }
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                    case 1186531001:
                    case 1989138438:
                        break;
                    case 1292972477:
                    case 1733000858:
                        C3911.m11924();
                        C4616.m13552();
                        break;
                    default:
                        uri = Uri.parse(str3);
                        if (!AbstractC2021.m6574()) {
                            iM6981 = C0630.m2566("ܿۡ") ^ i8;
                            i9 = ((iM6981 ^ i7) * (-6135)) ^ 2041057111;
                            i2 = -2064289740;
                            i11 = iM6981 ^ i2;
                            abstractActivityC3347 = abstractActivityC3346;
                        }
                        str3 = str3;
                        iM2566 = C0630.m2566("۠ۗ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-3665)) ^ 1993594590;
                        i = -1443489917;
                        i11 = iM2566 ^ i;
                        str3 = str3;
                        abstractActivityC3347 = abstractActivityC3346;
                        break;
                }
                return;
            }
            iM6982 = C0630.m2566("ۘ᩶") ^ i7;
            i9 = ((iM6982 ^ i8) * (-26797)) ^ (-893927194);
            i10 = -774912149;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 94921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public C11182(l.AbstractActivityC3346 r88, boolean r89, boolean r90, java.lang.Runnable r91) {
        /*
            Method dump skipped, instruction units count: 9492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11182.<init>(l.ۗܺ᩷, boolean, boolean, java.lang.Runnable):void");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27731(AbstractActivityC3346 abstractActivityC3346, List list) {
        int i = 0;
        String str = null;
        Object objM49339 = null;
        int i2 = -258611577;
        int i3 = C3432.f10845;
        int i4 = C2520.f8000;
        int iM6981 = (C2105.m6981("۬ۡ") ^ i3) * (-119);
        int i5 = ((iM6981 ^ i4) * (-9715)) ^ (-1288649760);
        int i6 = 546159172;
        while (true) {
            i2 = ((((i2 ^ i4) * (-1469)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2105977337:
                case 1046238886:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                        i5 = ((iM6981 ^ i4) * 24109) ^ 1590448866;
                        i6 = 842194662;
                    } else {
                        iM6981 = C2105.m6981("ۙܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-5085)) ^ (-1900557105);
                        i6 = -1195329962;
                    }
                    break;
                case -1921672266:
                case -1317243900:
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("֫᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-17353)) ^ 937140307;
                        i6 = -440810878;
                    } else {
                        iM6981 = C2105.m6981("۬ۙ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 3007) ^ (-669826063);
                        i6 = 1823055681;
                    }
                    break;
                case -1870112217:
                case -1441289433:
                    if (C21923.f70183 != 0) {
                        iM6981 = (C0630.m2566("ۖۜ") ^ i4) * 81;
                        i5 = ((iM6981 ^ i3) * (-721)) ^ (-1964447962);
                        i6 = 32705911;
                    } else {
                        iM6981 = C0630.m2566("ۨܳ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4623) ^ (-1376685160);
                        i6 = -1242020935;
                    }
                    break;
                case -1782134295:
                case 1845645967:
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("۬ܿ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-16545)) ^ 1132145731;
                        i6 = 945888589;
                    } else {
                        iM6981 = (C0630.m2566("ۖۜ") ^ i4) * 81;
                        i5 = ((iM6981 ^ i3) * (-721)) ^ (-1964447962);
                        i6 = 32705911;
                    }
                    break;
                case -1748033876:
                case -861359100:
                    C3663.m11168();
                    if (C1047.f3863 < 0) {
                        iM6981 = (C2105.m6981("֫۠") ^ i3) * (-19);
                        i5 = ((iM6981 ^ i4) * (-2553)) ^ 896531668;
                        i6 = 1800878626;
                    } else {
                        iM6981 = C2105.m6981("֫᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-17353)) ^ 937140307;
                        i6 = -440810878;
                    }
                    break;
                case -1472110823:
                case -1341208619:
                    str = (String) C22628.m50605(list, i);
                    if (C3683.m11222()) {
                        iM6981 = (C0630.m2566("ܺۡ") + i3) * 33;
                        i5 = ((iM6981 ^ i4) * 23759) ^ 1422711453;
                        i6 = -1066230461;
                    } else {
                        iM6981 = (C0630.m2566("ܽۜ") + i4) * 83;
                        i5 = ((iM6981 ^ i3) * (-18857)) ^ (-1131070457);
                        i6 = 1955464327;
                    }
                    break;
                case -1195336303:
                case -448692140:
                    C2272.m7503();
                    C4159.m12565();
                    break;
                case -418542984:
                case 1744449574:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("֫۠") ^ i3) * (-19);
                        i5 = ((iM6981 ^ i4) * (-2553)) ^ 896531668;
                        i6 = 1800878626;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۜۧ")) * 37;
                        i5 = ((iM6981 ^ i4) * 10817) ^ 1283420484;
                        i6 = 1623878172;
                    }
                    break;
                case -201838463:
                case 846604348:
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C0630.m2566("ۖۜ") ^ i4) * 81;
                        i5 = ((iM6981 ^ i3) * (-721)) ^ (-1964447962);
                        i6 = 32705911;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩷") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-5655)) ^ 164558684;
                        i6 = 520298127;
                    }
                    break;
                case -147536130:
                case 842655790:
                    objM49339 = C21923.m49339(list, 1);
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("ܺۡ") + i3) * 33;
                        i5 = ((iM6981 ^ i4) * 23759) ^ 1422711453;
                        i6 = -1066230461;
                    } else {
                        iM6981 = C2105.m6981("᩹ܽ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 18413) ^ (-774396865);
                        i6 = -885396114;
                    }
                    break;
                case -101775307:
                case 1847443704:
                    ViewOnClickListenerC1958.m6429();
                    C1711.m5736();
                    iM6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                    i5 = ((iM6981 ^ i4) * 24109) ^ 1590448866;
                    i6 = 842194662;
                    break;
                case 151498700:
                case 1260067757:
                    i = 2;
                    if (C4159.m12565() >= 0) {
                        iM6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                        i5 = ((iM6981 ^ i4) * 24109) ^ 1590448866;
                        i6 = 842194662;
                    } else {
                        iM6981 = C0630.m2566("۬۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-28993)) ^ 1511075528;
                        i6 = 1001050625;
                    }
                    break;
                case 232011268:
                case 1327143449:
                    if (C0050.m940() <= 0) {
                        iM6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                        i5 = ((iM6981 ^ i4) * 24109) ^ 1590448866;
                        i6 = 842194662;
                    } else {
                        iM6981 = (C0630.m2566("֡ۗ") + i4) * (-111);
                        i5 = ((iM6981 ^ i3) * (-1595)) ^ (-1463202292);
                        i6 = -419935581;
                    }
                    break;
                case 261489061:
                case 790293829:
                    if (C0050.m940() <= 0) {
                        iM6981 = C2105.m6981("֫᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-17353)) ^ 937140307;
                        i6 = -440810878;
                    } else {
                        iM6981 = (C0630.m2566("ᩳۜ") ^ i3) * 87;
                        i5 = ((iM6981 ^ i4) * 24109) ^ 1590448866;
                        i6 = 842194662;
                    }
                    break;
                case 1340871973:
                case 2116980130:
                    m27724(abstractActivityC3346, str, (String) objM49339);
                    break;
                default:
                    if (!C2272.f7362) {
                        iM6981 = (C0630.m2566("ۖۜ") ^ i4) * 81;
                        i5 = ((iM6981 ^ i3) * (-721)) ^ (-1964447962);
                        i6 = 32705911;
                    } else {
                        iM6981 = C2105.m6981("֫᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-17353)) ^ 937140307;
                        i6 = -440810878;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27725(AbstractActivityC3346 abstractActivityC3346, List list) {
        int i = 0;
        String str = null;
        Object objM50605 = null;
        int i2 = -420958498;
        int i3 = C5695.f17556;
        int i4 = C0483.f2088;
        int iM6981 = (C2105.m6981("۫᩷") + i3) * (-17);
        int i5 = ((iM6981 ^ i4) * 31855) ^ (-1568660834);
        int i6 = 984514373;
        while (true) {
            i2 = ((((i2 ^ i4) * (-11877)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2131007881:
                case -2033935900:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                        i5 = ((iM6981 ^ i4) * (-17165)) ^ (-656382910);
                        i6 = -1949358556;
                    } else {
                        iM6981 = C0630.m2566("֡ۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-2721)) ^ 70017766;
                        i6 = 858867929;
                    }
                    break;
                case -2118600695:
                case 2026166241:
                    str = (String) C22628.m50605(list, i);
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ۨᩴ") ^ i3) * 31;
                        i5 = ((iM6981 ^ i4) * (-28285)) ^ 1393632112;
                        i6 = 1522357765;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩺ۚ")) * 39;
                        i5 = ((iM6981 ^ i4) * (-19887)) ^ 738722775;
                        i6 = 963653034;
                    }
                    break;
                case -2025312804:
                case 2146033720:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("ۡۨ") + i4) * (-69);
                        i5 = ((iM6981 ^ i3) * (-22663)) ^ 2104027924;
                        i6 = 258339922;
                    } else {
                        iM6981 = (C2105.m6981("ܳܶ") ^ i4) * 95;
                        i5 = ((iM6981 ^ i3) * (-2217)) ^ (-1719017646);
                        i6 = -1088288933;
                    }
                    break;
                case -1965043420:
                case -1211745649:
                    i = 2;
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C0630.m2566("ۡۨ") + i4) * (-69);
                        i5 = ((iM6981 ^ i3) * (-22663)) ^ 2104027924;
                        i6 = 258339922;
                    } else {
                        iM6981 = (C0630.m2566("᩵ۤ") ^ i4) * 109;
                        i5 = ((iM6981 ^ i3) * 13607) ^ 659299205;
                        i6 = -2122918379;
                    }
                    break;
                case -1279504780:
                case 2102853635:
                    m27724(abstractActivityC3346, str, (String) objM50605);
                    break;
                case -1178779294:
                case -478208896:
                    if (!C4159.f13567) {
                        iM6981 = (C0630.m2566("᩺ܽ") + i4) * (-97);
                        i5 = ((iM6981 ^ i3) * 7665) ^ 928866967;
                        i6 = -866850621;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۫ܶ")) * (-25);
                        i5 = ((iM6981 ^ i4) * 21223) ^ (-1504514318);
                        i6 = -1983857714;
                    }
                    break;
                case -1103740039:
                case 956936947:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C0630.m2566("ۡۨ") + i4) * (-69);
                        i5 = ((iM6981 ^ i3) * (-22663)) ^ 2104027924;
                        i6 = 258339922;
                    } else {
                        iM6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                        i5 = ((iM6981 ^ i4) * (-17165)) ^ (-656382910);
                        i6 = -1949358556;
                    }
                    break;
                case -732197124:
                case -520615079:
                    C5695.m16023();
                    iM6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                    i5 = ((iM6981 ^ i4) * (-17165)) ^ (-656382910);
                    i6 = -1949358556;
                    break;
                case -613138748:
                case 99132872:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = (C2105.m6981("ۨᩴ") ^ i3) * 31;
                        i5 = ((iM6981 ^ i4) * (-28285)) ^ 1393632112;
                        i6 = 1522357765;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۤۙ")) * 35;
                        i5 = ((iM6981 ^ i4) * 6845) ^ (-861424139);
                        i6 = -383555014;
                    }
                    break;
                case 41091473:
                case 363184823:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("᩺ܽ") + i4) * (-97);
                        i5 = ((iM6981 ^ i3) * 7665) ^ 928866967;
                        i6 = -866850621;
                    } else {
                        iM6981 = C0630.m2566("ܰۧ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-31569)) ^ 2031568978;
                        i6 = -487968636;
                    }
                    break;
                case 266204516:
                case 849713435:
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("ۘܺ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 27871) ^ 1678524833;
                        i6 = 1525793210;
                    } else {
                        iM6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                        i5 = ((iM6981 ^ i4) * (-17165)) ^ (-656382910);
                        i6 = -1949358556;
                    }
                    break;
                case 462944843:
                case 1543882014:
                    objM50605 = C22628.m50605(list, 1);
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ۨᩴ") ^ i3) * 31;
                        i5 = ((iM6981 ^ i4) * (-28285)) ^ 1393632112;
                        i6 = 1522357765;
                    } else {
                        iM6981 = C0630.m2566("֫֫") ^ i4;
                        i5 = ((iM6981 ^ i3) * 29159) ^ (-1811064421);
                        i6 = -1569397920;
                    }
                    break;
                case 522473925:
                case 607603959:
                    C0422.m1963();
                    break;
                case 1339012265:
                case 1551091450:
                    if (!C0630.m2564()) {
                        iM6981 = (C0630.m2566("ۘۜ") + i3) * (-23);
                        i5 = ((iM6981 ^ i4) * (-17165)) ^ (-656382910);
                        i6 = -1949358556;
                    } else {
                        iM6981 = (C0630.m2566("᩺ܽ") + i4) * (-97);
                        i5 = ((iM6981 ^ i3) * 7665) ^ 928866967;
                        i6 = -866850621;
                    }
                    break;
                case 1897690363:
                case 2091020888:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i3 - C0630.m2566("۫ܶ")) * (-25);
                        i5 = ((iM6981 ^ i4) * 21223) ^ (-1504514318);
                        i6 = -1983857714;
                    } else {
                        iM6981 = (i4 - C2105.m6981("֡ۨ")) * 61;
                        i5 = ((iM6981 ^ i3) * (-415)) ^ 1112375816;
                        i6 = -1413799077;
                    }
                    break;
                default:
                    if (C0382.f1805) {
                        iM6981 = (i4 - C2105.m6981("᩷᩹")) * 43;
                        i5 = ((iM6981 ^ i3) * (-7299)) ^ 858950218;
                        i6 = 2014458650;
                    } else {
                        iM6981 = (C2105.m6981("ۨᩴ") ^ i3) * 31;
                        i5 = ((iM6981 ^ i4) * (-28285)) ^ 1393632112;
                        i6 = 1522357765;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 53821. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27729(l.C11182 r62, l.AbstractActivityC3346 r63, l.DialogInterfaceC0206 r64, android.view.View r0, boolean r66, android.view.View r67) {
        /*
            Method dump skipped, instruction units count: 5382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11182.m27729(l.ۧᩴۡ, l.ۗܺ᩷, l.֡ۚۢ, android.view.View, boolean, android.view.View):void");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27732(AbstractActivityC3346 abstractActivityC3346, List list) {
        int i = 0;
        String str = null;
        Object objM49339 = null;
        int i2 = -1604397226;
        int i3 = C3432.f10845;
        int i4 = C11340.f33930;
        int iM6981 = C2105.m6981("۠֡") ^ i3;
        int i5 = ((iM6981 ^ i4) * (-18643)) ^ 813361266;
        int i6 = -1456939360;
        while (true) {
            i2 = ((((i2 ^ i4) * (-19415)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1679625211:
                case 1796971138:
                    str = (String) C22628.m50605(list, i);
                    if (C1504.m5179()) {
                        iM6981 = (i4 - C2105.m6981("۬۠")) * (-83);
                        i5 = ((iM6981 ^ i3) * (-25285)) ^ (-17153859);
                        i6 = 1088111037;
                    } else {
                        iM6981 = C2105.m6981("۬᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4303) ^ (-1842120167);
                        i6 = 879463543;
                    }
                    break;
                case -1485179159:
                case 190436553:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                        i5 = ((iM6981 ^ i3) * 16801) ^ 259818144;
                        i6 = 1716865052;
                    } else {
                        iM6981 = C0630.m2566("ܶܰ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-25247)) ^ 893941969;
                        i6 = -1689681484;
                    }
                    break;
                case -1175317223:
                case 777862182:
                    i = 2;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C2105.m6981("ۧۖ") ^ i3) * (-11);
                        i5 = ((iM6981 ^ i4) * (-3951)) ^ (-323488674);
                        i6 = 2090376022;
                    } else {
                        iM6981 = (C0630.m2566("ۗᩴ") ^ i4) * 127;
                        i5 = ((iM6981 ^ i3) * (-30927)) ^ (-981884960);
                        i6 = -623172806;
                    }
                    break;
                case -1079762904:
                case 1984320917:
                    objM49339 = C21923.m49339(list, 1);
                    if (C4075.m12263() <= 0) {
                        iM6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((iM6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    } else {
                        iM6981 = (C2105.m6981("ۨ᩸") + i3) * 127;
                        i5 = ((iM6981 ^ i4) * 13073) ^ (-37507688);
                        i6 = -1662325470;
                    }
                    break;
                case -1033267128:
                case 18128498:
                    if (C3245.m9925() != 0) {
                        iM6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                        i5 = ((iM6981 ^ i3) * 16801) ^ 259818144;
                        i6 = 1716865052;
                    } else {
                        iM6981 = C2105.m6981("۠᩸") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-14353)) ^ (-740442685);
                        i6 = 226829019;
                    }
                    break;
                case -790379512:
                case -642782593:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ܺ۟")) * 5;
                        i5 = ((iM6981 ^ i4) * 31623) ^ (-599545701);
                        i6 = -1002814483;
                    } else {
                        iM6981 = C0630.m2566("ۨ᩹") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-29737)) ^ 670894801;
                        i6 = 1636194524;
                    }
                    break;
                case -728566939:
                case -434060537:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((iM6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    } else {
                        iM6981 = C0630.m2566("᩵ܽ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4347) ^ 1262240487;
                        i6 = 266020768;
                    }
                    break;
                case -532587962:
                case -132675736:
                    C3019.m9255();
                    if (!C1005.f3721) {
                        iM6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((iM6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    } else {
                        iM6981 = (C2105.m6981("ۧۖ") ^ i3) * (-11);
                        i5 = ((iM6981 ^ i4) * (-3951)) ^ (-323488674);
                        i6 = 2090376022;
                    }
                    break;
                case -491915285:
                case 814577407:
                    if (C3537.f11231 < 0) {
                        iM6981 = (i3 - C2105.m6981("ܺ۟")) * 5;
                        i5 = ((iM6981 ^ i4) * 31623) ^ (-599545701);
                        i6 = -1002814483;
                    } else {
                        iM6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                        i5 = ((iM6981 ^ i3) * 16801) ^ 259818144;
                        i6 = 1716865052;
                    }
                    break;
                case -99187300:
                case 1297811106:
                    ViewOnClickListenerC1958.m6429();
                    C3663.m11168();
                    iM6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                    i5 = ((iM6981 ^ i3) * 16801) ^ 259818144;
                    i6 = 1716865052;
                    break;
                case -78931386:
                case 1232764266:
                    m27724(abstractActivityC3346, str, (String) objM49339);
                    break;
                case 41181530:
                case 564036426:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("᩵᩵") ^ i4) * 115;
                        i5 = ((iM6981 ^ i3) * 16801) ^ 259818144;
                        i6 = 1716865052;
                    } else {
                        iM6981 = (C2105.m6981("ܺܶ") + i4) * 35;
                        i5 = ((iM6981 ^ i3) * (-32139)) ^ (-42332064);
                        i6 = -1499788159;
                    }
                    break;
                case 372646218:
                case 473718601:
                    if (C1916.m6308() >= 0) {
                        iM6981 = C2105.m6981("۬᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4303) ^ (-1842120167);
                        i6 = 879463543;
                    } else {
                        iM6981 = (C0630.m2566("֨ܽ") + i3) * (-77);
                        i5 = ((iM6981 ^ i4) * (-18347)) ^ 1954760653;
                        i6 = -1984089003;
                    }
                    break;
                case 547905156:
                case 1149678149:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((iM6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܺ۟")) * 5;
                        i5 = ((iM6981 ^ i4) * 31623) ^ (-599545701);
                        i6 = -1002814483;
                    }
                    break;
                case 684669192:
                case 1787981844:
                    C0237.m1481();
                    C4616.m13552();
                    break;
                default:
                    if (C2272.f7362) {
                        iM6981 = (C2105.m6981("ܽ᩺") ^ i4) * (-47);
                        i5 = ((iM6981 ^ i3) * (-7613)) ^ (-1843199201);
                        i6 = -292768678;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܽۢ")) * 35;
                        i5 = ((iM6981 ^ i4) * 3501) ^ 328648129;
                        i6 = -533308605;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a6 A[PHI: r7 r10
      0x01a6: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:49:0x01a4, B:41:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:49:0x01a4, B:41:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fc A[PHI: r4 r14
      0x01fc: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:57:0x01fa, B:26:0x00b1, B:11:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:57:0x01fa, B:26:0x00b1, B:11:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x022e A[PHI: r5 r6 r19
      0x022e: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:61:0x022c, B:53:0x01db, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:61:0x022c, B:53:0x01db, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:61:0x022c, B:53:0x01db, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025f A[PHI: r2 r12 r13
      0x025f: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String) binds: [B:65:0x025d, B:30:0x00d2, B:22:0x008d, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:65:0x025d, B:30:0x00d2, B:22:0x008d, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:65:0x025d, B:30:0x00d2, B:22:0x008d, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (l.C0714.f2697 >= 0) goto L7;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27726(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        int iM6981;
        int i;
        int i2 = C0422.f1886;
        int i3 = C2520.f8000;
        int iM2566 = C0630.m2566("ᩴ᩹") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-24743)) ^ (-1609253449);
        short[] sArr = null;
        short[] sArr2 = null;
        int i5 = iM2566 ^ 1338851170;
        String strM7507 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1756427369;
        while (true) {
            i13 = i5 ^ (i4 & (((i13 ^ i3) * (-30057)) >> 31));
            switch (i13) {
                case -2121957711:
                case 1634096052:
                    i6 = s + s2;
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C2105.m6981("ۙܽ") + i3) * 3;
                        i4 = ((iM6981 ^ i2) * (-7115)) ^ (-441381960);
                        i = 1170352993;
                    } else {
                        iM6981 = C2105.m6981("ۛܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22479)) ^ (-1683219873);
                        i = 1308945986;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case -2038152528:
                case 1318551242:
                    i10 = 20994;
                    iM6981 = (C0630.m2566("ܶۡ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM6981 ^ i3) * 26643) ^ (-1799960355);
                    i = -180388056;
                    i5 = iM6981 ^ i;
                    break;
                case -1948592785:
                case 1788259188:
                    strM7507 = C2272.m7507(sArr2, i11, i12, i10);
                    if (RunnableC1108.f4040) {
                        int iM2567 = (C0630.m2566("ۨۜ") + i2) * (-105);
                        i5 = iM2567 ^ (-2056971483);
                        i4 = ((iM2567 ^ i3) * 2457) ^ 320856041;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۧ") ^ i2) * 91;
                        i4 = ((iM6981 ^ i3) * 9493) ^ 731771526;
                        i = -1103367660;
                        i5 = iM6981 ^ i;
                    }
                    break;
                case -1618333940:
                case -788056191:
                    sArr2 = f33561;
                    i11 = 463;
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("ۗᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26777) ^ 1113780299;
                        i = 2055487069;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۧ") ^ i2) * 91;
                        i4 = ((iM6981 ^ i3) * 9493) ^ 731771526;
                        i = -1103367660;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case -1385849086:
                case 729241254:
                    if (C2105.m6982() == 0) {
                        iM6981 = (C2105.m6981("᩸ۧ") ^ i2) * 91;
                        i4 = ((iM6981 ^ i3) * 9493) ^ 731771526;
                        i = -1103367660;
                        i5 = iM6981 ^ i;
                    }
                    iM6981 = C0630.m2566("ۤۤ") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-6507)) ^ 2122922825;
                    i = 1178363645;
                    i5 = iM6981 ^ i;
                    break;
                case -1105422008:
                case 224172927:
                    int i14 = i8 + i9;
                    if (i7 - (i14 + i14) > 0) {
                        iM6981 = C0630.m2566("ܳ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11131) ^ 844051790;
                        i = -1922665967;
                    } else {
                        iM6981 = (C0630.m2566("᩷ܰ") ^ i2) * 109;
                        i4 = ((iM6981 ^ i3) * (-8557)) ^ (-2135694338);
                        i = 478091784;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case -919222106:
                case 192384728:
                    i9 = 365880384;
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("ۙܽ") + i3) * 3;
                        i4 = ((iM6981 ^ i2) * (-7115)) ^ (-441381960);
                        i = 1170352993;
                    } else {
                        iM6981 = C2105.m6981("ᩳۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-10063)) ^ 1862752897;
                        i = 901475295;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case -880275218:
                case 1687764238:
                    RunnableC3474.m10630();
                    break;
                case -845647319:
                case 491992473:
                    C1047.m3599();
                    iM6981 = C0630.m2566("ۗ۬") ^ i3;
                    i4 = ((iM6981 ^ i2) * 5283) ^ 604185455;
                    i = -1321263035;
                    i5 = iM6981 ^ i;
                    break;
                case -780703903:
                case 643413426:
                    c = 462;
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("ۤۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6507)) ^ 2122922825;
                        i = 1178363645;
                    } else {
                        iM6981 = C0630.m2566("ᩳܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20635)) ^ (-1928430534);
                        i = 33284345;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case -478582421:
                case 983249636:
                    C22628.m50615();
                    C4263.m12819();
                    break;
                case -376604159:
                case 1462055654:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C2105.m6981("᩸ۧ") ^ i2) * 91;
                        i4 = ((iM6981 ^ i3) * 9493) ^ 731771526;
                        i = -1103367660;
                    } else {
                        iM6981 = C2105.m6981("ۜۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4535) ^ (-1059298166);
                        i = 568515921;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case -249554828:
                case -121021225:
                    i12 = 8;
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۤۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6507)) ^ 2122922825;
                        i = 1178363645;
                    } else {
                        iM6981 = C2105.m6981("ܺܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26529) ^ 2015434763;
                        i = -1825476309;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case 113400904:
                case 705312846:
                    i10 = 16747;
                    iM6981 = (C0630.m2566("ܶۡ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM6981 ^ i3) * 26643) ^ (-1799960355);
                    i = -180388056;
                    i5 = iM6981 ^ i;
                    break;
                case 420714725:
                case 1298604215:
                    s = sArr[c];
                    s2 = 19128;
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("᩻ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26513) ^ (-815186239);
                        i = -1248991293;
                    } else {
                        iM6981 = C0630.m2566("ۜۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4269)) ^ (-1631961846);
                        i = -356368288;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case 473725744:
                case 1111752614:
                    C3683.m11210(abstractActivityC3346, strM7507);
                    C7925.m21215(abstractActivityC3346, false, z, null);
                    break;
                case 589436489:
                case 1458534134:
                    i7 = i6 * i6;
                    i8 = s * s;
                    if (C0714.f2697 >= 0) {
                        iM6981 = C0630.m2566("ۗ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5283) ^ 604185455;
                        i = -1321263035;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܿ᩺")) * (-61);
                        i4 = ((iM6981 ^ i2) * 11753) ^ (-1010587132);
                        i = -1299212365;
                    }
                    i5 = iM6981 ^ i;
                    break;
                case 956909020:
                case 1808012617:
                    sArr = f33561;
                    if (C4159.f13567) {
                        iM6981 = (C2105.m6981("۟۟") + i3) * (-7);
                        i4 = ((iM6981 ^ i2) * (-31545)) ^ 741972992;
                        i = 136394534;
                    } else {
                        iM6981 = C0630.m2566("᩻ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26513) ^ (-815186239);
                        i = -1248991293;
                    }
                    i5 = iM6981 ^ i;
                    break;
                default:
                    C3911.m11924();
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("᩻ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26513) ^ (-815186239);
                        i = -1248991293;
                        i5 = iM6981 ^ i;
                    }
                    iM6981 = C0630.m2566("ۗ۬") ^ i3;
                    i4 = ((iM6981 ^ i2) * 5283) ^ 604185455;
                    i = -1321263035;
                    i5 = iM6981 ^ i;
                    break;
            }
            return;
        }
    }
}
