package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܶۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VR */
/* JADX INFO: loaded from: classes.dex */
public class C15206 {

    /* JADX INFO: renamed from: ۗܳۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f46665;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C7073 f46666;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f46667;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f46668;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f46669;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f46670;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f46671;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13260 f46672;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f46673;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f46674;

    public native C15206(byte[] bArr);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private native void m35974(StringBuilder sb, byte[] bArr, C12534 c12534, boolean z);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m35982(C12534 c12534, boolean z);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m35983(C12534 c12534, boolean z, AbstractC15440 abstractC15440);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public native void m35988(C12534 c12534, boolean z);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public native C22968 m35990();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35975(char c) {
        int i = 1372928484;
        int i2 = C2958.f9394;
        int i3 = C22628.f73083;
        int iM2566 = C0630.m2566("᩵ܺ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-28261)) ^ 992766526;
        int i5 = 88232246;
        while (true) {
            i = ((((i ^ i2) * 20777) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1967682464:
                case 408105632:
                    if (C4075.m12263() <= 0) {
                        iM2566 = C2105.m6981("ۚ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21971) ^ 456738950;
                        i5 = 1417083102;
                    } else {
                        iM2566 = C2105.m6981("ܶۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31681) ^ 184129993;
                        i5 = 827801487;
                    }
                    break;
                case -1940160702:
                case 1027508866:
                    C4117.m12364();
                    if (C7106.f21815 == 0) {
                        iM2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-11491)) ^ 110707417;
                        i5 = 1078461999;
                    } else {
                        iM2566 = (C0630.m2566("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    }
                    break;
                case -1799845867:
                case 1974197045:
                    C2958.m9034();
                    C3432.m10477();
                    iM2566 = (C0630.m2566("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i4 = ((iM2566 ^ i3) * 22457) ^ 974367483;
                    i5 = 1378666158;
                    break;
                case -1773564007:
                case 2009434914:
                    if (c <= '9') {
                        iM2566 = (i2 - C0630.m2566("᩶ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 26981) ^ 1875822882;
                        i5 = 1497029338;
                    } else {
                        iM2566 = C2105.m6981("۠۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16249) ^ 1255760156;
                        i5 = -46344312;
                    }
                    break;
                case -1741824906:
                case 1517662517:
                    C0422.m1963();
                    return false;
                case -1731850312:
                case 1698495407:
                    if (C11340.m28031()) {
                        iM2566 = (C0630.m2566("᩷᩺") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i2) * (-15345)) ^ 34738243;
                        i5 = -731333446;
                    } else {
                        iM2566 = C2105.m6981("ۚ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21971) ^ 456738950;
                        i5 = 1417083102;
                    }
                    break;
                case -1602437753:
                case -523421223:
                    if (C2958.m9034() <= 0) {
                        iM2566 = (C0630.m2566("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    } else {
                        iM2566 = C2105.m6981("ۚ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25167)) ^ 35902554;
                        i5 = -1867252057;
                    }
                    break;
                case -1588266737:
                case 1276197311:
                    C1711.m5736();
                    if (!C2167.m7155()) {
                        iM2566 = C2105.m6981("᩻ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 22739) ^ 1362046108;
                        i5 = -1178910111;
                    } else {
                        iM2566 = (C0630.m2566("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    }
                    break;
                case -1457953201:
                case -590582501:
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C0630.m2566("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    } else {
                        iM2566 = (C2105.m6981("ۙۖ") ^ i3) * 5;
                        i4 = ((iM2566 ^ i2) * 30169) ^ (-643058167);
                        i5 = -471581668;
                    }
                    break;
                case -1263380357:
                case 28410668:
                    if (c >= 'a') {
                        iM2566 = (C0630.m2566("ۙ᩻") ^ i3) * (-55);
                        i4 = ((iM2566 ^ i2) * (-12075)) ^ (-1858855738);
                        i5 = -1892196556;
                    } else {
                        iM2566 = C0630.m2566("ۤۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7445) ^ (-2059436023);
                        i5 = 1161371276;
                    }
                    break;
                case -1248473825:
                case 60164694:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-11491)) ^ 110707417;
                        i5 = 1078461999;
                    } else {
                        iM2566 = (C2105.m6981("ۖۙ") + i2) * (-3);
                        i4 = ((iM2566 ^ i3) * (-5067)) ^ (-383752046);
                        i5 = 1168647261;
                    }
                    break;
                case -1171973686:
                case 2107629831:
                    if (c <= 'Z') {
                        iM2566 = (i2 - C0630.m2566("᩶ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 26981) ^ 1875822882;
                        i5 = 1497029338;
                    } else {
                        iM2566 = C2105.m6981("ۜܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7581) ^ (-1589399327);
                        i5 = 877813269;
                    }
                    break;
                case -998964356:
                case -434180955:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("ۤۨ") + i2) * (-35);
                        i4 = ((iM2566 ^ i3) * (-7783)) ^ 802132120;
                        i5 = -721121024;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩹ۡ")) * (-113);
                        i4 = ((iM2566 ^ i3) * (-26149)) ^ (-483606465);
                        i5 = 301270119;
                    }
                    break;
                case -929001660:
                case 1143485889:
                    return false;
                case -879670922:
                case 1973858040:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("᩻ᩳ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 22457) ^ 974367483;
                        i5 = 1378666158;
                    } else {
                        iM2566 = (C2105.m6981("ۨ᩸") + i3) * 83;
                        i4 = ((iM2566 ^ i2) * 16555) ^ (-271110124);
                        i5 = -661289010;
                    }
                    break;
                case -661490985:
                case 136237343:
                    if (c >= 'A') {
                        iM2566 = C2105.m6981("᩷ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7977) ^ (-1098026461);
                        i5 = 1325725719;
                    } else {
                        iM2566 = C2105.m6981("ۜܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7581) ^ (-1589399327);
                        i5 = 877813269;
                    }
                    break;
                case -587215354:
                case -513103089:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("۠ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-11491)) ^ 110707417;
                        i5 = 1078461999;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۜۚ")) * 57;
                        i4 = ((iM2566 ^ i2) * 8067) ^ (-1357364944);
                        i5 = -1963128955;
                    }
                    break;
                case -482443299:
                case 1083550157:
                    if (c <= 'z') {
                        iM2566 = (i2 - C0630.m2566("᩶ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 26981) ^ 1875822882;
                        i5 = 1497029338;
                    } else {
                        iM2566 = C0630.m2566("ۤۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7445) ^ (-2059436023);
                        i5 = 1161371276;
                    }
                    break;
                case -292066838:
                case -191561254:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("ۚ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21971) ^ 456738950;
                        i5 = 1417083102;
                    } else {
                        iM2566 = C2105.m6981("᩻ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 22739) ^ 1362046108;
                        i5 = -1178910111;
                    }
                    break;
                case -158221367:
                case 22135286:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C0630.m2566("ۤۨ") + i2) * (-35);
                        i4 = ((iM2566 ^ i3) * (-7783)) ^ 802132120;
                        i5 = -721121024;
                    } else {
                        iM2566 = (C0630.m2566("᩵᩺") + i2) * (-109);
                        i4 = ((iM2566 ^ i3) * (-19709)) ^ 451431126;
                        i5 = -1742097217;
                    }
                    break;
                case -134212482:
                case 1704066914:
                    if (C7106.f21815 != 0) {
                        iM2566 = (C0630.m2566("ۤۨ") + i2) * (-35);
                        i4 = ((iM2566 ^ i3) * (-7783)) ^ 802132120;
                        i5 = -721121024;
                    } else {
                        iM2566 = C0630.m2566("ۜܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28555)) ^ 1394693952;
                        i5 = 884088002;
                    }
                    break;
                case 115983819:
                case 1248883928:
                    if (c >= '0') {
                        iM2566 = C2105.m6981("᩵ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19171)) ^ 1573508433;
                        i5 = -1549159812;
                    } else {
                        iM2566 = C2105.m6981("۠۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16249) ^ 1255760156;
                        i5 = -46344312;
                    }
                    break;
                case 815951024:
                case 945786565:
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("᩻ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 22739) ^ 1362046108;
                        i5 = -1178910111;
                    } else {
                        iM2566 = C0630.m2566("۟֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3153)) ^ 1083817818;
                        i5 = -2139745963;
                    }
                    break;
                case 1496350266:
                case 1893385241:
                    if (c == '_') {
                        iM2566 = (i2 - C0630.m2566("᩶ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 26981) ^ 1875822882;
                        i5 = 1497029338;
                    } else {
                        iM2566 = C0630.m2566("ᩳ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8907) ^ 833052586;
                        i5 = 1031892746;
                    }
                    break;
                default:
                    return true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15206 m35978(byte[] bArr) throws IOException {
        int iM6981;
        int i;
        RuntimeException e = null;
        int i2 = 557986856;
        int i3 = ViewOnClickListenerC1958.f6529;
        int i4 = C2167.f7158;
        int iM2566 = C0630.m2566("ܽ۟") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-2161)) ^ 938661841;
        int i6 = -650814086;
        while (true) {
            int i7 = iM2566 ^ i6;
            C15206 c15206 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-22445)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1811528671:
                    case 833740688:
                        return c15206;
                    case -1809515014:
                    case -721634154:
                        C1504.m5179();
                        iM6981 = (C0630.m2566("۬ܽ") + i4) * (-83);
                        i5 = ((iM6981 ^ i3) * 27521) ^ 593028816;
                        i = -32293358;
                        i7 = iM6981 ^ i;
                        break;
                    case -686488174:
                    case 6501918:
                        try {
                            c15206 = new C15206(bArr);
                            iM6981 = C2105.m6981("᩺᩺") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-21997)) ^ 480505522;
                            i = 1297319751;
                            i7 = iM6981 ^ i;
                        } catch (RuntimeException e2) {
                            e = e2;
                            iM2566 = C0630.m2566("ܿۛ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-9801)) ^ (-381270785);
                            i6 = 1989226232;
                        }
                        break;
                    case -412515673:
                    case 582118835:
                        if (C3019.f9544 >= 0) {
                            iM6981 = (C0630.m2566("۬ܽ") + i4) * (-83);
                            i5 = ((iM6981 ^ i3) * 27521) ^ 593028816;
                            i = -32293358;
                        } else if (C21923.m49329()) {
                            iM6981 = (i3 - C0630.m2566("۠᩸")) * (-99);
                            i5 = ((iM6981 ^ i4) * (-30771)) ^ (-52238259);
                            i = -1570203115;
                        } else {
                            if (C1128.f4106 > 0) {
                                if (C3746.m11369() < 0) {
                                    if (C3663.f11553 || C2272.f7362) {
                                        iM6981 = (C2105.m6981("᩵᩹") + i3) * (-5);
                                        i5 = ((iM6981 ^ i4) * 18219) ^ (-1406848708);
                                        i = 1023138649;
                                    } else if (!C1005.f3721) {
                                        iM6981 = C2105.m6981("ۙۨ") ^ i4;
                                        i5 = ((iM6981 ^ i3) * (-8943)) ^ 954991235;
                                        i = -664892224;
                                    } else if (C3537.f11231 < 0) {
                                        if (C0714.f2697 >= 0) {
                                            iM6981 = (C0630.m2566("۬ܽ") + i4) * (-83);
                                            i5 = ((iM6981 ^ i3) * 27521) ^ 593028816;
                                            i = -32293358;
                                        } else if (C1916.f6442) {
                                            throw new IOException(e);
                                        }
                                    }
                                }
                                iM6981 = (i3 - C0630.m2566("۠᩸")) * (-99);
                                i5 = ((iM6981 ^ i4) * (-30771)) ^ (-52238259);
                                i = -1570203115;
                            }
                            iM6981 = (C2105.m6981("ܶۧ") ^ i3) * (-95);
                            i5 = ((iM6981 ^ i4) * 16075) ^ (-1671110876);
                            i = -2101789642;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 17357769:
                    case 2104980564:
                        if (C1294.f4556 >= 0) {
                            iM6981 = (i3 - C0630.m2566("۠᩸")) * (-99);
                            i5 = ((iM6981 ^ i4) * (-30771)) ^ (-52238259);
                            i = -1570203115;
                        } else {
                            iM6981 = (C2105.m6981("᩵᩹") + i3) * (-5);
                            i5 = ((iM6981 ^ i4) * 18219) ^ (-1406848708);
                            i = 1023138649;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 843001460:
                    case 1146311728:
                        C4075.m12263();
                        if (C1504.f5354) {
                            iM6981 = C2105.m6981("ۙۨ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-8943)) ^ 954991235;
                            i = -664892224;
                        } else {
                            iM6981 = (C0630.m2566("۬ܽ") + i4) * (-83);
                            i5 = ((iM6981 ^ i3) * 27521) ^ 593028816;
                            i = -32293358;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 1854152437:
                    case 1992006393:
                        C0714.m2805();
                        ViewOnClickListenerC1958.m6429();
                        return null;
                    default:
                        if (AbstractC2021.m6574()) {
                            iM6981 = (C0630.m2566("۬ܽ") + i4) * (-83);
                            i5 = ((iM6981 ^ i3) * 27521) ^ 593028816;
                            i = -32293358;
                        } else {
                            iM6981 = (i3 - C0630.m2566("۠᩸")) * (-99);
                            i5 = ((iM6981 ^ i4) * (-30771)) ^ (-52238259);
                            i = -1570203115;
                        }
                        i7 = iM6981 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0365 A[PHI: r10 r17
      0x0365: PHI (r10v3 short) = (r10v1 short), (r10v2 short), (r10v1 short) binds: [B:104:0x0363, B:80:0x0271, B:26:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0365: PHI (r17v26 byte[]) = (r17v5 byte[]), (r17v12 byte[]), (r17v27 byte[]) binds: [B:104:0x0363, B:80:0x0271, B:26:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x03cd A[PHI: r7 r8 r9 r17
      0x03cd: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:112:0x03cb, B:88:0x02ba, B:84:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x03cd: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:112:0x03cb, B:88:0x02ba, B:84:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x03cd: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v3 int) binds: [B:112:0x03cb, B:88:0x02ba, B:84:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x03cd: PHI (r17v10 byte[]) = (r17v3 byte[]), (r17v9 byte[]), (r17v11 byte[]) binds: [B:112:0x03cb, B:88:0x02ba, B:84:0x0297] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:97:0x02fb A[PHI: r6 r17
      0x02fb: PHI (r6v3 char) = (r6v1 char), (r6v2 char), (r6v1 char) binds: [B:96:0x02f9, B:92:0x02db, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r17v32 byte[]) = (r17v7 byte[]), (r17v8 byte[]), (r17v35 byte[]) binds: [B:96:0x02f9, B:92:0x02db, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (l.ServiceConnectionC3453.f10921 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (l.C0483.f2088 >= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if (l.C7106.f21815 != 0) goto L36;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C15206 m35971(AbstractC15440 abstractC15440) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[] bArr = null;
        Throwable th = null;
        C15206 c15206M35978 = null;
        Object obj = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = -1964948628;
        int i11 = C4263.f13799;
        int i12 = C0422.f1886;
        int iM2566 = C0630.m2566("֫᩵") ^ i11;
        int i13 = ((iM2566 ^ i12) * 23493) ^ (-1429300241);
        int i14 = iM2566 ^ (-534366141);
        C23411 c23411M36513 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 17895) >> 31));
            switch (i10) {
                case -2106761573:
                case -2030359649:
                    C0964.m3413();
                    if (C2167.f7158 >= 0) {
                        iM6982 = (i12 - C2105.m6981("ۘܶ")) * 83;
                        i = ((iM6982 ^ i11) * 6951) ^ (-374596790);
                        i3 = -966889880;
                    } else {
                        iM6982 = C2105.m6981("֡ۗ") ^ i11;
                        i = ((iM6982 ^ i12) * 5937) ^ 1768899857;
                        i3 = -2077978162;
                    }
                    i6 = iM6982 ^ i3;
                    int i15 = i;
                    i14 = i6;
                    i13 = i15;
                    break;
                case -2008458472:
                case -1312105945:
                    bArr = bArr;
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("۫ᩳ") ^ i11;
                        i = ((iM6981 ^ i12) * (-893)) ^ 799342176;
                        i2 = -1441406377;
                    } else {
                        iM6981 = C2105.m6981("᩸᩷") ^ i11;
                        i = ((iM6981 ^ i12) * 4887) ^ 654050928;
                        i2 = 1012446780;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i16 = i;
                    i14 = i6;
                    i13 = i16;
                    break;
                case -1979568867:
                case 815115155:
                    C4263.m12819();
                    break;
                case -1978541657:
                case -1955968732:
                    try {
                        c23411M36513.close();
                        iM6982 = (i12 - C2105.m6981("ۤ۬")) * 119;
                        i = ((iM6982 ^ i11) * (-2301)) ^ 1579530789;
                        i3 = -1248895992;
                        i6 = iM6982 ^ i3;
                        int i17 = i;
                        i14 = i6;
                        i13 = i17;
                    } catch (Throwable th2) {
                        int iM2567 = C0630.m2566("ۙ۠") ^ i12;
                        i4 = ((iM2567 ^ i11) * (-28845)) ^ (-2036823524);
                        i5 = iM2567 ^ (-400936786);
                        obj = th2;
                        i13 = i4;
                        i14 = i5;
                    }
                    break;
                case -1827679346:
                case 2030277875:
                    bArr = bArr;
                    if (abstractC15440.mo23127() > 52428800) {
                        iM6981 = (C0630.m2566("֨ۤ") + i11) * (-67);
                        i = ((iM6981 ^ i12) * (-8029)) ^ 410114606;
                        i2 = 71552944;
                    } else {
                        iM6981 = (i11 - C0630.m2566("᩸ܰ")) * 57;
                        i = ((iM6981 ^ i12) * (-6585)) ^ (-231330862);
                        i2 = -2005827546;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i18 = i;
                    i14 = i6;
                    i13 = i18;
                    break;
                case -1824025001:
                case 561708599:
                    throw th;
                case -1806744619:
                case 1102564966:
                    if (!C1504.f5354) {
                        bArr = bArr;
                        iM6981 = C2105.m6981("ۨ᩵") ^ i12;
                        i = ((iM6981 ^ i11) * (-5643)) ^ (-2045613220);
                        i2 = -1020417402;
                        i6 = iM6981 ^ i2;
                        bArr = bArr;
                        int i19 = i;
                        i14 = i6;
                        i13 = i19;
                    }
                    bArr = bArr;
                    iM6981 = C2105.m6981("᩷ܶ") ^ i11;
                    i = ((iM6981 ^ i12) * 10587) ^ 2142811964;
                    i2 = 80394532;
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i110 = i;
                    i14 = i6;
                    i13 = i110;
                    break;
                case -1639367785:
                case -1302009548:
                    C1294.m4372();
                    C2958.m9034();
                    return null;
                case -1591717206:
                case 1807436169:
                    bArr = bArr;
                    i8 = i7 + 316270656;
                    if (C7106.f21815 != 0) {
                        iM6981 = C2105.m6981("ܽ֡") ^ i11;
                        i = ((iM6981 ^ i12) * (-3033)) ^ (-1963194957);
                        i2 = 1870024114;
                    } else {
                        iM6981 = C2105.m6981("᩺ۡ") ^ i12;
                        i = ((iM6981 ^ i11) * 22097) ^ (-1757532487);
                        i2 = 3430633;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i111 = i;
                    i14 = i6;
                    i13 = i111;
                    break;
                case -1518487700:
                case 44096385:
                    bArr = bArr;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("ۨ᩵") ^ i12;
                        i = ((iM6981 ^ i11) * (-5643)) ^ (-2045613220);
                        i2 = -1020417402;
                    } else {
                        iM6981 = (C2105.m6981("ܶۙ") + i12) * (-5);
                        i = ((iM6981 ^ i11) * (-18129)) ^ (-1170421615);
                        i2 = -280039809;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i112 = i;
                    i14 = i6;
                    i13 = i112;
                    break;
                case -1346158495:
                case 1170409108:
                    return c15206M35978;
                case -1334309456:
                case -850298642:
                    if (!RunnableC1108.f4040) {
                        bArr = bArr;
                        iM6981 = (C0630.m2566("᩹ܳ") ^ i11) * (-45);
                        i = ((iM6981 ^ i12) * (-9975)) ^ (-1376557825);
                        i2 = -1914468433;
                        i6 = iM6981 ^ i2;
                        bArr = bArr;
                        int i113 = i;
                        i14 = i6;
                        i13 = i113;
                    }
                    iM6982 = C2105.m6981("۬ܺ") ^ i12;
                    i = ((iM6982 ^ i11) * (-16313)) ^ (-808221926);
                    i3 = 513775650;
                    i6 = iM6982 ^ i3;
                    int i114 = i;
                    i14 = i6;
                    i13 = i114;
                    break;
                case -1319254810:
                case 108267245:
                    break;
                case -1155061688:
                case -509344901:
                    if (bArr != null) {
                        iM6982 = (i12 - C2105.m6981("᩻ۛ")) * (-11);
                        i = ((iM6982 ^ i11) * (-31643)) ^ (-359771375);
                        i3 = 650575505;
                        i6 = iM6982 ^ i3;
                        int i115 = i;
                        i14 = i6;
                        i13 = i115;
                    }
                    bArr = bArr;
                    iM6981 = (i11 - C0630.m2566("᩸ܰ")) * 57;
                    i = ((iM6981 ^ i12) * (-6585)) ^ (-231330862);
                    i2 = -2005827546;
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i116 = i;
                    i14 = i6;
                    i13 = i116;
                    break;
                case -990605359:
                case -696782820:
                    bArr = bArr;
                    s = sArr[c];
                    i7 = s * s;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("ܽ֡") ^ i11;
                        i = ((iM6981 ^ i12) * (-3033)) ^ (-1963194957);
                        i2 = 1870024114;
                    } else {
                        iM6981 = C0630.m2566("᩹ᩳ") ^ i12;
                        i = ((iM6981 ^ i11) * (-1529)) ^ (-896087738);
                        i2 = -1178050895;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i117 = i;
                    i14 = i6;
                    i13 = i117;
                    break;
                case -926855516:
                case -441040444:
                    c15206M35978 = m35978(bArr);
                    iM6982 = (i11 - C0630.m2566("ۢܿ")) * (-5);
                    i = ((iM6982 ^ i12) * 18243) ^ 1940428333;
                    i3 = -1074493475;
                    i6 = iM6982 ^ i3;
                    int i118 = i;
                    i14 = i6;
                    i13 = i118;
                    break;
                case -787619297:
                case -482251629:
                    i9 = 4543;
                    iM6981 = C2105.m6981("۟ܿ") ^ i12;
                    i = ((iM6981 ^ i11) * 25075) ^ (-462181930);
                    i2 = -1947972401;
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i119 = i;
                    i14 = i6;
                    i13 = i119;
                    break;
                case -778341407:
                case -730145983:
                    bArr = bArr;
                    sArr = f46665;
                    if (C0714.m2805()) {
                        iM6981 = C2105.m6981("ܶᩴ") ^ i11;
                        i = ((iM6981 ^ i12) * 2083) ^ (-104181154);
                        i2 = 1746930935;
                    } else {
                        iM6981 = C0630.m2566("ۖ᩷") ^ i12;
                        i = ((iM6981 ^ i11) * (-6375)) ^ 1989580300;
                        i2 = -1643084033;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i1110 = i;
                    i14 = i6;
                    i13 = i1110;
                    break;
                case -710805583:
                case 1905570636:
                    C7811.m20844();
                    C3019.m9255();
                    bArr = bArr;
                    iM6981 = C0630.m2566("۫ᩳ") ^ i11;
                    i = ((iM6981 ^ i12) * (-893)) ^ 799342176;
                    i2 = -1441406377;
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i1111 = i;
                    i14 = i6;
                    i13 = i1111;
                    break;
                case -688433741:
                case 64565302:
                    bArr = bArr;
                    if (C1128.m3851() <= 0) {
                        iM6981 = C2105.m6981("᩷ܶ") ^ i11;
                        i = ((iM6981 ^ i12) * 10587) ^ 2142811964;
                        i2 = 80394532;
                    } else {
                        iM6981 = (C2105.m6981("ۧۖ") + i11) * (-97);
                        i = ((iM6981 ^ i12) * 22571) ^ (-1861609579);
                        i2 = -1916990971;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i1112 = i;
                    i14 = i6;
                    i13 = i1112;
                    break;
                case -607774454:
                case 285618338:
                    if (C1773.m5908() <= 0) {
                        bArr = bArr;
                        iM6981 = C0630.m2566("ۖ᩷") ^ i12;
                        i = ((iM6981 ^ i11) * (-6375)) ^ 1989580300;
                        i2 = -1643084033;
                        i6 = iM6981 ^ i2;
                        bArr = bArr;
                        int i1113 = i;
                        i14 = i6;
                        i13 = i1113;
                    }
                    bArr = bArr;
                    iM6981 = C2105.m6981("᩷ܶ") ^ i11;
                    i = ((iM6981 ^ i12) * 10587) ^ 2142811964;
                    i2 = 80394532;
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i1114 = i;
                    i14 = i6;
                    i13 = i1114;
                    break;
                case -498156059:
                case 394259989:
                    i9 = 3263;
                    iM6981 = C2105.m6981("۟ܿ") ^ i12;
                    i = ((iM6981 ^ i11) * 25075) ^ (-462181930);
                    i2 = -1947972401;
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i1115 = i;
                    i14 = i6;
                    i13 = i1115;
                    break;
                case -458049034:
                case 1529512606:
                    C22628.m50615();
                    if (C5695.m16023() >= 0) {
                        iM6982 = C2105.m6981("֡ۗ") ^ i11;
                        i = ((iM6982 ^ i12) * 5937) ^ 1768899857;
                        i3 = -2077978162;
                    } else {
                        iM6982 = (C0630.m2566("ۖ֨") ^ i11) * 35;
                        i = ((iM6982 ^ i12) * (-6063)) ^ (-2085484372);
                        i3 = -1124357445;
                    }
                    i6 = iM6982 ^ i3;
                    int i1116 = i;
                    i14 = i6;
                    i13 = i1116;
                    break;
                case -287918635:
                case 1341278052:
                    bArr = bArr;
                    try {
                        try {
                            c23411M36513 = abstractC15440.m36513(C1916.m6311(f46665, 32, 1, i9));
                            try {
                                byte[] bArrM35980 = m35980(c23411M36513);
                                try {
                                    c23411M36513.close();
                                    int iM2568 = (i12 - C0630.m2566("ۙ᩻")) * 101;
                                    i13 = ((iM2568 ^ i11) * (-21605)) ^ 1086042130;
                                    i14 = iM2568 ^ 903298976;
                                    bArr = bArrM35980;
                                } catch (Throwable unused) {
                                    bArr = bArrM35980;
                                    iM6981 = (i11 - C0630.m2566("᩸ܰ")) * 57;
                                    i = ((iM6981 ^ i12) * (-6585)) ^ (-231330862);
                                    i2 = -2005827546;
                                    i6 = iM6981 ^ i2;
                                    bArr = bArr;
                                    int i1117 = i;
                                    i14 = i6;
                                    i13 = i1117;
                                }
                            } catch (Throwable th3) {
                                int iM2569 = C0630.m2566("ܺܿ") ^ i11;
                                i4 = ((iM2569 ^ i12) * 9537) ^ (-479193873);
                                bArr = bArr;
                                i5 = iM2569 ^ (-1102243894);
                                th = th3;
                                i13 = i4;
                                i14 = i5;
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable unused3) {
                    }
                    break;
                case -218995330:
                case 1814945651:
                    bArr = bArr;
                    c = 31;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("ۨ᩵") ^ i12;
                        i = ((iM6981 ^ i11) * (-5643)) ^ (-2045613220);
                        i2 = -1020417402;
                    } else {
                        iM6981 = C2105.m6981("ۨۚ") ^ i11;
                        i = ((iM6981 ^ i12) * (-32149)) ^ 1447746628;
                        i2 = -257394165;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i1118 = i;
                    i14 = i6;
                    i13 = i1118;
                    break;
                case 134730219:
                case 1276176033:
                    bArr = bArr;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C0630.m2566("᩹ܳ") ^ i11) * (-45);
                        i = ((iM6981 ^ i12) * (-9975)) ^ (-1376557825);
                        i2 = -1914468433;
                    } else {
                        iM6981 = (i12 - C2105.m6981("ܽᩳ")) * (-89);
                        i = ((iM6981 ^ i11) * (-7949)) ^ 1628415642;
                        i2 = 1431689531;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i1119 = i;
                    i14 = i6;
                    i13 = i1119;
                    break;
                case 417079375:
                case 932286232:
                    bArr = bArr;
                    s2 = 35568;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C0630.m2566("᩹ܳ") ^ i11) * (-45);
                        i = ((iM6981 ^ i12) * (-9975)) ^ (-1376557825);
                        i2 = -1914468433;
                    } else {
                        iM6981 = (C0630.m2566("᩵֡") ^ i11) * 89;
                        i = ((iM6981 ^ i12) * 7543) ^ (-1552645961);
                        i2 = 799216648;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i11110 = i;
                    i14 = i6;
                    i13 = i11110;
                    break;
                case 447728460:
                case 713441000:
                    bArr = bArr;
                    if (i8 - (s * s2) < 0) {
                        iM6981 = (i11 - C0630.m2566("ۗۢ")) * 41;
                        i = ((iM6981 ^ i12) * (-9157)) ^ (-9353312);
                        i2 = -2116097194;
                    } else {
                        iM6981 = C0630.m2566("֡ۙ") ^ i12;
                        i = ((iM6981 ^ i11) * 29575) ^ (-613956505);
                        i2 = 261363788;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i11111 = i;
                    i14 = i6;
                    i13 = i11111;
                    break;
                case 542371027:
                case 800939478:
                    return m35978(C1294.m4379(abstractC15440));
                case 1185557721:
                case 1946764041:
                    AbstractC2021.m6574();
                    break;
                case 1551686689:
                case 2080464922:
                    bArr = bArr;
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ܽ֡") ^ i11;
                        i = ((iM6981 ^ i12) * (-3033)) ^ (-1963194957);
                        i2 = 1870024114;
                    } else {
                        iM6981 = (C0630.m2566("ۚᩴ") ^ i12) * (-119);
                        i = ((iM6981 ^ i11) * 29357) ^ 441558784;
                        i2 = -608635628;
                    }
                    i6 = iM6981 ^ i2;
                    bArr = bArr;
                    int i11112 = i;
                    i14 = i6;
                    i13 = i11112;
                    break;
                default:
                    try {
                        C2167.m7154(th, obj);
                        iM6982 = (i12 - C2105.m6981("ۤ۬")) * 119;
                        i = ((iM6982 ^ i11) * (-2301)) ^ 1579530789;
                        i3 = -1248895992;
                        i6 = iM6982 ^ i3;
                    } catch (Throwable unused4) {
                        bArr = bArr;
                        iM6981 = (i11 - C0630.m2566("᩸ܰ")) * 57;
                        i = ((iM6981 ^ i12) * (-6585)) ^ (-231330862);
                        i2 = -2005827546;
                        i6 = iM6981 ^ i2;
                        bArr = bArr;
                    }
                    int i11113 = i;
                    i14 = i6;
                    i13 = i11113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15206 m35970(InputStream inputStream) throws Throwable {
        int iM6981;
        int i;
        Throwable th = null;
        Object th2 = null;
        RuntimeException e = null;
        int i2 = 1615183990;
        int i3 = RunnableC1937.f6483;
        int i4 = ViewOnClickListenerC1958.f6529;
        int iM2566 = C0630.m2566("ܿ᩻") ^ i3;
        int i5 = ((iM2566 ^ i4) * 423) ^ 1917916341;
        int i6 = -1560917000;
        while (true) {
            int i7 = iM2566 ^ i6;
            C15206 c15206 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-11155)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2141717796:
                    case 857042894:
                        try {
                            if (C21923.f70183 != 0) {
                                iM2566 = (i4 - C2105.m6981("᩹ۘ")) * 115;
                                i5 = ((iM2566 ^ i3) * (-471)) ^ (-387183064);
                                i6 = -985965002;
                            } else if (C0964.m3413()) {
                                if (C1128.m3851() > 0) {
                                    if (C1504.f5354) {
                                        iM2566 = (C2105.m6981("֫ܽ") ^ i4) * 33;
                                        i5 = ((iM2566 ^ i3) * (-26931)) ^ (-1544952365);
                                        i6 = 1747754223;
                                    } else if (RunnableC0588.f2309 >= 0) {
                                        iM2566 = C0630.m2566("۬ܰ") ^ i3;
                                        i5 = ((iM2566 ^ i4) * 28071) ^ 844620228;
                                        i6 = -68266993;
                                    } else if (C1005.f3721) {
                                        if (C1711.f5919) {
                                            iM2566 = C2105.m6981("ۧۚ") ^ i3;
                                            i5 = ((iM2566 ^ i4) * (-521)) ^ (-706632446);
                                            i6 = -555331691;
                                        } else {
                                            if (ViewOnClickListenerC1958.f6529 > 0) {
                                                if (C3537.f11231 >= 0) {
                                                    iM2566 = (C2105.m6981("ܿ۠") ^ i4) * 97;
                                                    i5 = ((iM2566 ^ i3) * 25959) ^ (-1482171070);
                                                    i6 = -1295843289;
                                                } else if (C0050.f910 < 0) {
                                                    c15206 = new C15206(C0349.m1795(inputStream, 0));
                                                    iM6981 = (C0630.m2566("ۜܽ") ^ i4) * (-37);
                                                    i5 = ((iM6981 ^ i3) * 13371) ^ (-234442444);
                                                    i = 710392268;
                                                    i7 = iM6981 ^ i;
                                                    break;
                                                }
                                            }
                                            iM2566 = (C0630.m2566("᩸֨") ^ i4) * (-111);
                                            i5 = ((iM2566 ^ i3) * (-21575)) ^ 935901135;
                                            i6 = 1275041860;
                                        }
                                    }
                                }
                                iM2566 = (i3 - C2105.m6981("۠ᩳ")) * 5;
                                i5 = ((iM2566 ^ i4) * 15685) ^ 1032413405;
                                i6 = 861751320;
                            } else {
                                iM2566 = (i3 - C2105.m6981("᩶۫")) * 55;
                                i5 = ((iM2566 ^ i4) * (-7963)) ^ 368101984;
                                i6 = -1575503505;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            iM2566 = (C2105.m6981("ۤۜ") ^ i3) * 85;
                            i5 = ((iM2566 ^ i4) * 15925) ^ 584716081;
                            i6 = 831738243;
                        }
                        break;
                    case -1994114503:
                    case 1106463673:
                        if (inputStream != null) {
                            iM6981 = C0630.m2566("ۢᩳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 30547) ^ 1367272146;
                            i = -126419703;
                        } else {
                            iM6981 = C0630.m2566("ܽ۫") ^ i4;
                            i5 = ((iM6981 ^ i3) * 29189) ^ (-477123966);
                            i = -1990677063;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1991052864:
                    case 208575960:
                        RunnableC1108.m3785(inputStream);
                        iM6981 = C0630.m2566("ᩳܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-5471)) ^ 459354565;
                        i = -1991583714;
                        i7 = iM6981 ^ i;
                        break;
                    case -1703922428:
                    case 1771425266:
                        try {
                            RunnableC1108.m3785(inputStream);
                            iM6981 = C0630.m2566("ܽ۫") ^ i4;
                            i5 = ((iM6981 ^ i3) * 29189) ^ (-477123966);
                            i = -1990677063;
                        } catch (Throwable th4) {
                            th2 = th4;
                            iM6981 = C2105.m6981("ۜ᩺") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-13751)) ^ (-1425353234);
                            i = 1513635328;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1685248628:
                    case 413809684:
                        return c15206;
                    case -1668003875:
                    case -579080512:
                        throw th;
                    case -1498558238:
                    case -365697557:
                        C11340.m28031();
                        if (!C1005.f3721) {
                            iM2566 = (i4 - C2105.m6981("᩹ۘ")) * 115;
                            i5 = ((iM2566 ^ i3) * (-471)) ^ (-387183064);
                            i6 = -985965002;
                        } else {
                            iM2566 = (i3 - C2105.m6981("᩶۫")) * 55;
                            i5 = ((iM2566 ^ i4) * (-7963)) ^ 368101984;
                            i6 = -1575503505;
                        }
                        break;
                    case -1331038326:
                    case 1406517018:
                        C0798.m2998();
                        if (C0630.f2410 > 0) {
                            iM2566 = C0630.m2566("۬ܰ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 28071) ^ 844620228;
                            i6 = -68266993;
                        } else {
                            iM2566 = (C2105.m6981("ܿ۠") ^ i4) * 97;
                            i5 = ((iM2566 ^ i3) * 25959) ^ (-1482171070);
                            i6 = -1295843289;
                        }
                        break;
                    case -863022751:
                    case 1616157719:
                        throw new IOException(e);
                    case -271752958:
                    case -58114082:
                        if (inputStream != null) {
                            iM6981 = C0630.m2566("᩻ܿ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 20151) ^ 1534536615;
                            i = -579704365;
                        } else {
                            iM6981 = C0630.m2566("ᩳܳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-5471)) ^ 459354565;
                            i = -1991583714;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -179011380:
                    case 287195080:
                        C3911.m11924();
                        if (!C4159.f13567) {
                            iM2566 = (C2105.m6981("ܿ۠") ^ i4) * 97;
                            i5 = ((iM2566 ^ i3) * 25959) ^ (-1482171070);
                            i6 = -1295843289;
                        } else {
                            iM2566 = (C2105.m6981("֫ܽ") ^ i4) * 33;
                            i5 = ((iM2566 ^ i3) * (-26931)) ^ (-1544952365);
                            i6 = 1747754223;
                        }
                        break;
                    case 236680489:
                    case 1637888540:
                        try {
                            C0714.m2815(th, th2);
                            iM6981 = C0630.m2566("ܽ۫") ^ i4;
                            i5 = ((iM6981 ^ i3) * 29189) ^ (-477123966);
                            i = -1990677063;
                        } catch (RuntimeException e2) {
                            e = e2;
                            iM6981 = C2105.m6981("ۧ֡") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-27429)) ^ 1154191883;
                            i = -239626073;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 263476382:
                    case 765163364:
                        C0050.m940();
                        if (RunnableC0588.m2441() >= 0) {
                            iM2566 = (i3 - C2105.m6981("᩶۫")) * 55;
                            i5 = ((iM2566 ^ i4) * (-7963)) ^ 368101984;
                            i6 = -1575503505;
                        } else {
                            iM2566 = C0630.m2566("۬ܰ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 28071) ^ 844620228;
                            i6 = -68266993;
                        }
                        break;
                    case 269391020:
                    case 1325747308:
                        C21923.m49329();
                        if (!C4159.f13567) {
                            iM2566 = (C2105.m6981("֫ܽ") ^ i4) * 33;
                            i5 = ((iM2566 ^ i3) * (-26931)) ^ (-1544952365);
                            i6 = 1747754223;
                        } else {
                            iM2566 = (i3 - C2105.m6981("۠ᩳ")) * 5;
                            i5 = ((iM2566 ^ i4) * 15685) ^ 1032413405;
                            i6 = 861751320;
                        }
                        break;
                    case 327161367:
                    case 1402972113:
                        C11340.m28031();
                        C0382.m1848();
                        return null;
                    case 1609403306:
                    case 1779259105:
                        C0422.m1963();
                        C1711.m5736();
                        iM2566 = (C2105.m6981("ܿ۠") ^ i4) * 97;
                        i5 = ((iM2566 ^ i3) * 25959) ^ (-1482171070);
                        i6 = -1295843289;
                        break;
                    default:
                        if (AbstractC2021.f6743 > 0) {
                            iM2566 = C2105.m6981("ۧۚ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-521)) ^ (-706632446);
                            i6 = -555331691;
                        } else {
                            iM2566 = (C2105.m6981("ܿ۠") ^ i4) * 97;
                            i5 = ((iM2566 ^ i3) * 25959) ^ (-1482171070);
                            i6 = -1295843289;
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [byte[], l.᩵ۛۡ] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m35980(C23411 c23411) throws EOFException {
        int i;
        int i2;
        C1993 c1993;
        int i3;
        long j;
        int i4;
        int iM2566;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        int iM6981;
        int i9;
        int i10;
        int iM2567;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM6982;
        int i17;
        C1993 c1994;
        int i18;
        long j3;
        C1993 c1995;
        C1993 c1996;
        int i19;
        int i20;
        int iM6983;
        int i21;
        int i22;
        int iM6984;
        int i23;
        int i24;
        ?? r13;
        C23411 c23412 = c23411;
        int i25 = C2958.f9394;
        int i26 = ViewOnClickListenerC1958.f6529;
        int iM6985 = C2105.m6981("ۧۘ") ^ i26;
        int i27 = ((iM6985 ^ i25) * 2617) ^ (-1484731298);
        C1993 c1993M6524 = null;
        ?? r7 = 0;
        long j4 = 0;
        C10627 c10627 = null;
        C13260 c13260 = 0;
        byte[] bArr = null;
        long length = 0;
        int i28 = iM6985 ^ 313860036;
        int i29 = 0;
        int i30 = 0;
        C10130 c10130 = null;
        int i31 = 0;
        int i32 = 0;
        boolean z = false;
        int iM51856 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1236461171;
        int i38 = 0;
        long j5 = 0;
        C1993 c1993M6525 = null;
        while (true) {
            i37 = i28 ^ (i27 & (((i37 ^ i25) * 8955) >> 31));
            switch (i37) {
                case -1989424088:
                case 1855809767:
                    c1993M6524 = C1993.m6524(c23411);
                    i20 = i38;
                    iM6984 = (i25 - C2105.m6981("֡ܶ")) * 21;
                    i23 = ((iM6984 ^ i26) * (-16565)) ^ (-1921873690);
                    i24 = -1978212757;
                    int i39 = iM6984 ^ i24;
                    j4 = j4;
                    i38 = i20;
                    i32 = i32;
                    i31 = i31;
                    i28 = i39;
                    i27 = i23;
                    i29 = i29;
                    i36 = i36;
                    break;
                case -1912467517:
                case -1112111098:
                    i7 = i31;
                    i8 = i32;
                    length = c23411.length();
                    if (C21923.f70183 == 0) {
                        iM2567 = (C0630.m2566("ۜۧ") + i25) * (-103);
                        i11 = ((iM2567 ^ i26) * (-4125)) ^ (-411909982);
                        i12 = 289039965;
                        c13260 = c13260;
                        int i40 = iM2567 ^ i12;
                        i32 = i8;
                        i28 = i40;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        j2 = j4;
                        iM6981 = (C0630.m2566("۠ۜ") ^ i26) * (-47);
                        i5 = ((iM6981 ^ i25) * (-24853)) ^ 1571777172;
                        i9 = 2133225716;
                        i10 = iM6981 ^ i9;
                        j4 = j2;
                        i32 = i8;
                        i31 = i7;
                        i28 = i10;
                        i27 = i5;
                    }
                    break;
                case -1847863071:
                case -817962920:
                    int i41 = i29;
                    int i42 = i31;
                    int i43 = i32;
                    C1993 c1997 = c1993M6524;
                    int i44 = i38;
                    long j6 = j4;
                    int i45 = c1997.f6673;
                    if (c1997.f6676 != 1) {
                        iM6983 = C0630.m2566("᩹᩷") ^ i26;
                        i21 = ((iM6983 ^ i25) * 19899) ^ (-1755928695);
                        i22 = -142230605;
                    } else {
                        iM6983 = (C2105.m6981("ۤ۬") ^ i25) * (-11);
                        i21 = ((iM6983 ^ i26) * 29843) ^ 406154250;
                        i22 = -286736147;
                    }
                    int i46 = iM6983 ^ i22;
                    j4 = j6;
                    i38 = i44;
                    i32 = i43;
                    i31 = i42;
                    i28 = i46;
                    r7 = 0;
                    c1993M6524 = c1997;
                    i27 = i21;
                    i36 = i45;
                    i29 = i41;
                    break;
                case -1770785043:
                case -183916853:
                    i20 = i38;
                    c23412.skipBytes(i35 - i20);
                    c1993M6524 = C1993.m6524(c23411);
                    iM6984 = (i25 - C2105.m6981("֡ܶ")) * 21;
                    i23 = ((iM6984 ^ i26) * (-16565)) ^ (-1921873690);
                    i24 = -1978212757;
                    int i310 = iM6984 ^ i24;
                    j4 = j4;
                    i38 = i20;
                    i32 = i32;
                    i31 = i31;
                    i28 = i310;
                    i27 = i23;
                    i29 = i29;
                    i36 = i36;
                    break;
                case -1721664442:
                case 210158040:
                    i31 = i31;
                    i32 = i32;
                    i20 = i38;
                    j4 = j4;
                    i36 = i36;
                    if (i36 < 41943040) {
                        iM6984 = (i25 - C0630.m2566("ۤۤ")) * (-57);
                        i29 = i29;
                        i23 = ((iM6984 ^ i26) * (-30041)) ^ 1229476356;
                        i24 = -1143195402;
                    } else {
                        i29 = i29;
                        iM6984 = (C2105.m6981("ۛ۠") + i26) * (-121);
                        i23 = ((iM6984 ^ i25) * 11159) ^ 1448906316;
                        i24 = -869035103;
                    }
                    int i311 = iM6984 ^ i24;
                    j4 = j4;
                    i38 = i20;
                    i32 = i32;
                    i31 = i31;
                    i28 = i311;
                    i27 = i23;
                    i29 = i29;
                    i36 = i36;
                    break;
                case -1641457471:
                case -1032578136:
                    RunnableC3474.m10630();
                    if (C5695.f17556 >= 0) {
                        i7 = i31;
                        i8 = i32;
                        r13 = c13260;
                        iM2567 = C2105.m6981("᩵ۜ") ^ i25;
                        i11 = ((iM2567 ^ i26) * 11805) ^ 51354630;
                        i12 = 325165592;
                        c13260 = r13;
                        int i47 = iM2567 ^ i12;
                        i32 = i8;
                        i28 = i47;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        iM2566 = (i26 - C0630.m2566("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2566 ^ i25) * 25673) ^ 184090284;
                        i6 = 2075339630;
                        i28 = iM2566 ^ i6;
                        i27 = i5;
                    }
                    break;
                case -1550741270:
                case -45036667:
                    throw new EOFException();
                case -1549447014:
                case 1902349529:
                    i31 = i31;
                    i32 = i32;
                    j4 = j4;
                    c23412.skipBytes(i36 - 8);
                    i20 = i38;
                    if (c23411.available() < i20) {
                        i36 = i36;
                        iM6984 = (i25 - C0630.m2566("ۤۤ")) * (-57);
                        i29 = i29;
                        i23 = ((iM6984 ^ i26) * (-30041)) ^ 1229476356;
                        i24 = -1143195402;
                        int i312 = iM6984 ^ i24;
                        j4 = j4;
                        i38 = i20;
                        i32 = i32;
                        i31 = i31;
                        i28 = i312;
                        i27 = i23;
                        i29 = i29;
                        i36 = i36;
                    } else {
                        int iM6986 = C2105.m6981("᩵ܺ") ^ i25;
                        j4 = j4;
                        i38 = i20;
                        i32 = i32;
                        i31 = i31;
                        i28 = iM6986 ^ (-1682142955);
                        i27 = ((iM6986 ^ i26) * (-25799)) ^ 336358162;
                    }
                    break;
                case -1348026371:
                case -108759652:
                    C1420.m4913();
                    return null;
                case -1322705224:
                case 233949295:
                    i32 = c23412.read(bArr, z ? 1 : 0, RunnableC1108.m3783(i31, i33));
                    if (i32 >= 0) {
                        iM2566 = C0630.m2566("᩸ۗ") ^ i26;
                        i5 = ((iM2566 ^ i25) * 25555) ^ 217915283;
                        i6 = 81531023;
                    } else {
                        iM2566 = (C2105.m6981("۟ۘ") + i25) * (-49);
                        i5 = ((iM2566 ^ i26) * 2775) ^ (-2120344138);
                        i6 = 1844945704;
                    }
                    i28 = iM2566 ^ i6;
                    i27 = i5;
                    break;
                case -1176632349:
                case -1153677909:
                    i7 = i31;
                    i8 = i32;
                    if (!C3663.f11553) {
                        C10130 c10131 = new C10130();
                        c23412.seek(0L);
                        c10130 = c10131;
                        i29 = i34;
                        iM2567 = C2105.m6981("ۙ֫") ^ i26;
                        i11 = ((iM2567 ^ i25) * (-31105)) ^ 606504837;
                        i12 = -1710066737;
                        c13260 = c13260;
                        int i48 = iM2567 ^ i12;
                        i32 = i8;
                        i28 = i48;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        c1994 = c1993M6524;
                        i36 = i36;
                        i18 = i38;
                        j3 = j4;
                        i29 = i29;
                        c1995 = c1993M6525;
                        int iM6987 = C2105.m6981("ۧ۟") ^ i26;
                        int i49 = ((iM6987 ^ i25) * (-1459)) ^ (-1500480717);
                        i17 = iM6987 ^ 1435433493;
                        c1993M6524 = c1994;
                        c1993M6525 = c1995;
                        i27 = i49;
                        j4 = j3;
                        i38 = i18;
                        i29 = i29;
                        i32 = i8;
                        i31 = i7;
                        c10130 = null;
                        i28 = i17;
                        i36 = i36;
                        c23412 = c23411;
                    }
                    break;
                case -1165272421:
                case 1645767740:
                    if (i31 > 0) {
                        iM2566 = (i26 - C0630.m2566("֫ۧ")) * (-29);
                        i5 = ((iM2566 ^ i25) * 19287) ^ (-2050564099);
                        i6 = 1979374878;
                    } else {
                        iM2566 = (i25 - C2105.m6981("᩶۫")) * 15;
                        i5 = ((iM2566 ^ i26) * (-9795)) ^ (-1987256536);
                        i6 = 243775533;
                    }
                    i28 = iM2566 ^ i6;
                    i27 = i5;
                    break;
                case -1080476124:
                case -623573269:
                    i7 = i31;
                    i8 = i32;
                    j2 = j4;
                    c23412.seek(j2);
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("۠ۜ") ^ i26) * (-47);
                        i5 = ((iM6981 ^ i25) * (-24853)) ^ 1571777172;
                        i9 = 2133225716;
                    } else {
                        iM6981 = (C2105.m6981("۟ۚ") + i25) * 89;
                        i5 = ((iM6981 ^ i26) * 21229) ^ (-1634382720);
                        i9 = 543013574;
                    }
                    i10 = iM6981 ^ i9;
                    j4 = j2;
                    i32 = i8;
                    i31 = i7;
                    i28 = i10;
                    i27 = i5;
                    break;
                case -997001263:
                case 28148474:
                    if (!C1504.f5354) {
                        iM2566 = (i25 - C0630.m2566("֫֨")) * 49;
                        i5 = ((iM2566 ^ i26) * (-8341)) ^ (-1005414202);
                        i6 = 211864301;
                        i28 = iM2566 ^ i6;
                        i27 = i5;
                    } else {
                        i = i31;
                        i2 = i32;
                        c1993 = c1993M6524;
                        i36 = i36;
                        i3 = i38;
                        j = j4;
                        i4 = i29;
                        iM6982 = (C2105.m6981("۟᩺") ^ i25) * (-81);
                        i16 = ((iM6982 ^ i26) * 15567) ^ (-1996802153);
                        i15 = 161488462;
                        i17 = iM6982 ^ i15;
                        c1993M6524 = c1993;
                        i27 = i16;
                        j4 = j;
                        i38 = i3;
                        i29 = i4;
                        i32 = i2;
                        i31 = i;
                        i28 = i17;
                        i36 = i36;
                        c23412 = c23411;
                    }
                    break;
                case -977620688:
                case 890274667:
                    i7 = i31;
                    i8 = i32;
                    c1994 = c1993M6524;
                    i36 = i36;
                    i18 = i38;
                    j3 = j4;
                    i29 = i29;
                    c1995 = c1993M6525;
                    int i50 = c1995.f6674;
                    if (C3746.m11369() < 0) {
                        int iM2568 = (i26 - C0630.m2566("ܶ᩸")) * (-117);
                        i35 = i50;
                        c1993M6524 = c1994;
                        j4 = j3;
                        i38 = i18;
                        i32 = i8;
                        i31 = i7;
                        i27 = ((iM2568 ^ i25) * (-17305)) ^ 849508744;
                        i28 = iM2568 ^ 1173219436;
                        c23412 = c23411;
                        c1993M6525 = c1995;
                        i29 = i29;
                        i36 = i36;
                    } else {
                        i35 = i50;
                        int iM6988 = C2105.m6981("ۧ۟") ^ i26;
                        int i410 = ((iM6988 ^ i25) * (-1459)) ^ (-1500480717);
                        i17 = iM6988 ^ 1435433493;
                        c1993M6524 = c1994;
                        c1993M6525 = c1995;
                        i27 = i410;
                        j4 = j3;
                        i38 = i18;
                        i29 = i29;
                        i32 = i8;
                        i31 = i7;
                        c10130 = null;
                        i28 = i17;
                        i36 = i36;
                        c23412 = c23411;
                    }
                    break;
                case -922335877:
                case -813574769:
                    i7 = i31;
                    i8 = i32;
                    C13260 c13260M32176 = C13260.m32176(c10627);
                    i33 = 1024;
                    bArr = new byte[1024];
                    r13 = c13260M32176;
                    if (C1916.f6442) {
                        iM2567 = (i26 - C2105.m6981("ۛۢ")) * 77;
                        i11 = ((iM2567 ^ i25) * 32015) ^ 1529096481;
                        i12 = -179690693;
                        c13260 = c13260M32176;
                    } else {
                        iM2567 = C2105.m6981("᩵ۜ") ^ i25;
                        i11 = ((iM2567 ^ i26) * 11805) ^ 51354630;
                        i12 = 325165592;
                        c13260 = r13;
                    }
                    int i411 = iM2567 ^ i12;
                    i32 = i8;
                    i28 = i411;
                    i27 = i11;
                    i31 = i7;
                    break;
                case -909779541:
                case 817016083:
                    i13 = i31;
                    i14 = i32;
                    c1996 = c1993M6524;
                    i36 = i36;
                    long j7 = j4;
                    i29 = i29;
                    i38 = 8;
                    if (C0422.f1886 <= 0) {
                        j4 = j7;
                        int iM6989 = C2105.m6981("ܺ᩶") ^ i26;
                        int i51 = ((iM6989 ^ i25) * 18349) ^ 1703055301;
                        i19 = iM6989 ^ (-905312630);
                        c1993M6524 = c1996;
                        i27 = i51;
                    } else {
                        int iM2569 = (i26 - C0630.m2566("ۙ᩺")) * (-17);
                        int i52 = ((iM2569 ^ i25) * (-20285)) ^ 611838673;
                        i19 = iM2569 ^ (-4061753);
                        c1993M6524 = c1996;
                        j4 = j7;
                        i27 = i52;
                    }
                    i32 = i14;
                    i31 = i13;
                    i28 = i19;
                    i29 = i29;
                    i36 = i36;
                    break;
                case -906961319:
                case 1358729191:
                    c10130.write(bArr, z ? 1 : 0, i32);
                    i31 -= i32;
                    i8 = i32;
                    int iM25610 = C0630.m2566("۫ۖ") ^ i25;
                    int i53 = i8;
                    i28 = iM25610 ^ 1336499527;
                    i27 = ((iM25610 ^ i26) * (-3777)) ^ 1583327090;
                    i32 = i53;
                    break;
                case -879274872:
                case 1299566333:
                    i7 = i31;
                    i8 = i32;
                    c13260.m32180(c10130, z, (C19277) r7);
                    long j8 = iM51856;
                    c23412.seek(j8);
                    if (!C0798.f2919) {
                        int iM25611 = (C0630.m2566("۫۫") ^ i26) * (-69);
                        i5 = ((iM25611 ^ i25) * (-5725)) ^ 759007819;
                        i10 = iM25611 ^ (-272186485);
                        j5 = j8;
                        i32 = i8;
                        i31 = i7;
                        i28 = i10;
                        i27 = i5;
                    } else {
                        j5 = j8;
                        r13 = c13260;
                        iM2567 = C2105.m6981("᩵ۜ") ^ i25;
                        i11 = ((iM2567 ^ i26) * 11805) ^ 51354630;
                        i12 = 325165592;
                        c13260 = r13;
                        int i412 = iM2567 ^ i12;
                        i32 = i8;
                        i28 = i412;
                        i27 = i11;
                        i31 = i7;
                    }
                    break;
                case -835645942:
                case -66886623:
                    i7 = i31;
                    i8 = i32;
                    z = false;
                    z = false;
                    if (i29 > 0) {
                        iM2567 = C0630.m2566("ۤ᩶") ^ i26;
                        i11 = ((iM2567 ^ i25) * 14087) ^ 1973057512;
                        i12 = -1554036546;
                        c13260 = c13260;
                    } else {
                        iM2567 = (i25 - C0630.m2566("ܶۜ")) * 23;
                        i11 = ((iM2567 ^ i26) * 31177) ^ 1625397413;
                        i12 = -845437713;
                        c13260 = c13260;
                    }
                    int i413 = iM2567 ^ i12;
                    i32 = i8;
                    i28 = i413;
                    i27 = i11;
                    i31 = i7;
                    break;
                case -817700905:
                case 1527270713:
                    c10130.write(bArr, z ? 1 : 0, i30);
                    i29 -= i30;
                    i7 = i31;
                    i8 = i32;
                    iM2567 = C2105.m6981("ۙ֫") ^ i26;
                    i11 = ((iM2567 ^ i25) * (-31105)) ^ 606504837;
                    i12 = -1710066737;
                    c13260 = c13260;
                    int i414 = iM2567 ^ i12;
                    i32 = i8;
                    i28 = i414;
                    i27 = i11;
                    i31 = i7;
                    break;
                case -793619433:
                case -388933239:
                    return r7;
                case -783660977:
                case 2044573624:
                    throw new EOFException();
                case -431996024:
                case 1082800741:
                    if (C3663.m11168() < 0) {
                        i = i31;
                        i2 = i32;
                        c1993 = c1993M6524;
                        i36 = i36;
                        i3 = i38;
                        j = j4;
                        i4 = i29;
                        iM6982 = (C2105.m6981("۟᩺") ^ i25) * (-81);
                        i16 = ((iM6982 ^ i26) * 15567) ^ (-1996802153);
                        i15 = 161488462;
                        i17 = iM6982 ^ i15;
                        c1993M6524 = c1993;
                        i27 = i16;
                        j4 = j;
                        i38 = i3;
                        i29 = i4;
                        i32 = i2;
                        i31 = i;
                        i28 = i17;
                        i36 = i36;
                        c23412 = c23411;
                    } else {
                        iM2566 = (i26 - C0630.m2566("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2566 ^ i25) * 25673) ^ 184090284;
                        i6 = 2075339630;
                        i28 = iM2566 ^ i6;
                        i27 = i5;
                    }
                    break;
                case -405138753:
                case -228722353:
                    if (C0422.f1886 <= 0) {
                        i13 = i31;
                        i14 = i32;
                        c1996 = c1993M6524;
                        i36 = i36;
                        i29 = i29;
                        int iM69810 = C2105.m6981("ܺ᩶") ^ i26;
                        int i54 = ((iM69810 ^ i25) * 18349) ^ 1703055301;
                        i19 = iM69810 ^ (-905312630);
                        c1993M6524 = c1996;
                        i27 = i54;
                        i32 = i14;
                        i31 = i13;
                        i28 = i19;
                        i29 = i29;
                        i36 = i36;
                    } else {
                        iM2566 = (i26 - C0630.m2566("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2566 ^ i25) * 25673) ^ 184090284;
                        i6 = 2075339630;
                        i28 = iM2566 ^ i6;
                        i27 = i5;
                    }
                    break;
                case -352576399:
                case 1000187728:
                    throw new ArithmeticException();
                case -158581531:
                case 1215972060:
                    i13 = i31;
                    i14 = i32;
                    int iM51857 = c23411.m51856() - i38;
                    long j9 = iM51857;
                    if (C0382.f1805) {
                        int iM25612 = (C0630.m2566("᩸ܶ") + i26) * (-107);
                        i34 = iM51857;
                        j4 = j9;
                        i27 = ((iM25612 ^ i25) * (-9243)) ^ 1712833609;
                        i32 = i14;
                        i31 = i13;
                        i28 = iM25612 ^ 152396402;
                    } else {
                        i34 = iM51857;
                        j4 = j9;
                        c1996 = c1993M6524;
                        i36 = i36;
                        i29 = i29;
                        int iM69811 = C2105.m6981("ܺ᩶") ^ i26;
                        int i55 = ((iM69811 ^ i25) * 18349) ^ 1703055301;
                        i19 = iM69811 ^ (-905312630);
                        c1993M6524 = c1996;
                        i27 = i55;
                        i32 = i14;
                        i31 = i13;
                        i28 = i19;
                        i29 = i29;
                        i36 = i36;
                    }
                    break;
                case -142861157:
                case 1045778349:
                    i30 = c23412.read(bArr, z ? 1 : 0, RunnableC1108.m3783(i29, i33));
                    if (i30 >= 0) {
                        iM2566 = (C2105.m6981("۠ᩴ") + i26) * (-119);
                        i5 = ((iM2566 ^ i25) * 11681) ^ 1636304986;
                        i6 = 767398772;
                    } else {
                        iM2566 = C2105.m6981("ᩴۧ") ^ i25;
                        i5 = ((iM2566 ^ i26) * (-23289)) ^ (-972618198);
                        i6 = 141634529;
                    }
                    i28 = iM2566 ^ i6;
                    i27 = i5;
                    break;
                case 93677090:
                case 1335614991:
                    long j10 = length - j5;
                    int i56 = (int) j10;
                    i7 = i31;
                    i8 = i32;
                    if (j10 != i56) {
                        iM2567 = (i26 - C0630.m2566("ܿ᩶")) * (-95);
                        i11 = ((iM2567 ^ i25) * 28447) ^ 819122952;
                        i12 = -54617488;
                        c13260 = c13260;
                        int i415 = iM2567 ^ i12;
                        i32 = i8;
                        i28 = i415;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        i31 = i56;
                        int iM25613 = C0630.m2566("۫ۖ") ^ i25;
                        int i57 = i8;
                        i28 = iM25613 ^ 1336499527;
                        i27 = ((iM25613 ^ i26) * (-3777)) ^ 1583327090;
                        i32 = i57;
                    }
                    break;
                case 144916053:
                case 1184261922:
                    i = i31;
                    i2 = i32;
                    c1993 = c1993M6524;
                    i36 = i36;
                    i3 = i38;
                    j = j4;
                    i4 = i29;
                    c1993M6525 = C1993.m6524(c23411);
                    if (C3019.f9544 >= 0) {
                        iM6982 = (C2105.m6981("۟᩺") ^ i25) * (-81);
                        i16 = ((iM6982 ^ i26) * 15567) ^ (-1996802153);
                        i15 = 161488462;
                    } else {
                        iM6982 = (C2105.m6981("᩵᩵") ^ i25) * (-67);
                        i16 = ((iM6982 ^ i26) * (-19311)) ^ 5390391;
                        i15 = 495748267;
                    }
                    i17 = iM6982 ^ i15;
                    c1993M6524 = c1993;
                    i27 = i16;
                    j4 = j;
                    i38 = i3;
                    i29 = i4;
                    i32 = i2;
                    i31 = i;
                    i28 = i17;
                    i36 = i36;
                    c23412 = c23411;
                    break;
                case 423090020:
                case 1212400405:
                    i7 = i31;
                    i8 = i32;
                    c10627 = new C10627(c23412);
                    iM51856 = c23411.m51856();
                    if (C2167.f7158 < 0) {
                        iM2567 = C2105.m6981("۬ۖ") ^ i25;
                        i11 = ((iM2567 ^ i26) * 18347) ^ 100859162;
                        i12 = 1009009286;
                        c13260 = c13260;
                        int i416 = iM2567 ^ i12;
                        i32 = i8;
                        i28 = i416;
                        i27 = i11;
                        i31 = i7;
                    } else {
                        c1994 = c1993M6524;
                        i36 = i36;
                        i18 = i38;
                        j3 = j4;
                        i29 = i29;
                        c1995 = c1993M6525;
                        int iM69812 = C2105.m6981("ۧ۟") ^ i26;
                        int i417 = ((iM69812 ^ i25) * (-1459)) ^ (-1500480717);
                        i17 = iM69812 ^ 1435433493;
                        c1993M6524 = c1994;
                        c1993M6525 = c1995;
                        i27 = i417;
                        j4 = j3;
                        i38 = i18;
                        i29 = i29;
                        i32 = i8;
                        i31 = i7;
                        c10130 = null;
                        i28 = i17;
                        i36 = i36;
                        c23412 = c23411;
                    }
                    break;
                case 828090752:
                case 2039279130:
                    C0714.m2805();
                    iM2566 = (i26 - C0630.m2566("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i5 = ((iM2566 ^ i25) * 25673) ^ 184090284;
                    i6 = 2075339630;
                    i28 = iM2566 ^ i6;
                    i27 = i5;
                    break;
                case 1381887635:
                case 1464074654:
                    return c10130.m25444();
                default:
                    C2520.m8026();
                    if (RunnableC3474.f10992 <= 0) {
                        i7 = i31;
                        i8 = i32;
                        j2 = j4;
                        iM6981 = (C0630.m2566("۠ۜ") ^ i26) * (-47);
                        i5 = ((iM6981 ^ i25) * (-24853)) ^ 1571777172;
                        i9 = 2133225716;
                        i10 = iM6981 ^ i9;
                        j4 = j2;
                        i32 = i8;
                        i31 = i7;
                        i28 = i10;
                        i27 = i5;
                    }
                    iM2566 = (i26 - C0630.m2566("ܿᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i5 = ((iM2566 ^ i25) * 25673) ^ 184090284;
                    i6 = 2075339630;
                    i28 = iM2566 ^ i6;
                    i27 = i5;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15206 m35972(C23411 c23411) throws EOFException {
        long length = 0;
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        byte[] bArrM35980 = null;
        C15206 c15206M35978 = null;
        int i3 = -541242456;
        int i4 = C1128.f4106;
        int i5 = C1773.f6144;
        int iM6981 = C2105.m6981("᩺᩷") ^ i5;
        int i6 = ((iM6981 ^ i4) * (-31831)) ^ (-510032698);
        int i7 = -778860839;
        while (true) {
            i3 = ((((i3 ^ i4) * 19425) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -1976175164:
                case -1891298264:
                    i2 = 0;
                    if (C4117.m12364() != 0) {
                        iM6981 = C2105.m6981("ۜۢ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 17797) ^ (-2045658628);
                        i7 = -556912885;
                    } else {
                        iM6981 = C0630.m2566("ۖ᩷") ^ i5;
                        i6 = ((iM6981 ^ i4) * 16209) ^ (-914320000);
                        i7 = -793902382;
                    }
                    break;
                case -1926901309:
                case 1657884434:
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("᩹ۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    } else {
                        iM6981 = (C2105.m6981("ܶ۟") ^ i4) * 95;
                        i6 = ((iM6981 ^ i5) * 27289) ^ 116510340;
                        i7 = -2135300348;
                    }
                    break;
                case -1819571115:
                case -1025274433:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("᩵ܰ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-7207)) ^ (-1833969065);
                        i7 = -344942774;
                    } else {
                        iM6981 = C0630.m2566("᩻֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-24235)) ^ (-2033311804);
                        i7 = -1005684151;
                    }
                    break;
                case -1421199997:
                case 1397128302:
                    C0382.m1848();
                    return null;
                case -1316517541:
                case 283660016:
                    C7811.m20844();
                    if (C4159.m12565() < 0) {
                        iM6981 = C2105.m6981("᩵ܰ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-7207)) ^ (-1833969065);
                        i7 = -344942774;
                    } else {
                        iM6981 = C2105.m6981("֡۠") ^ i4;
                        i6 = ((iM6981 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    }
                    break;
                case -1188917259:
                case 781795922:
                    C1711.m5736();
                    RunnableC0588.m2441();
                    iM6981 = C2105.m6981("֡۠") ^ i4;
                    i6 = ((iM6981 ^ i5) * 5811) ^ 1251306302;
                    i7 = -1546746092;
                    break;
                case -1145255917:
                case -470307879:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("᩹ۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    } else {
                        iM6981 = C2105.m6981("֡۠") ^ i4;
                        i6 = ((iM6981 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    }
                    break;
                case -924141777:
                case -13785070:
                    length = c23411.length();
                    if (C4159.f13567) {
                        iM6981 = C0630.m2566("ۚ۠") ^ i5;
                        i6 = ((iM6981 ^ i4) * 10573) ^ 1363323849;
                        i7 = 1282209186;
                    } else {
                        iM6981 = C2105.m6981("᩹ۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    }
                    break;
                case -720693533:
                case 1860811883:
                    i = (int) length;
                    bArr = new byte[i];
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C2105.m6981("ᩴ᩶") + i5) * 41;
                        i6 = ((iM6981 ^ i4) * (-31059)) ^ 799273371;
                        i7 = -849622429;
                    } else {
                        iM6981 = C0630.m2566("ܳᩳ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 7195) ^ 1358560326;
                        i7 = -2102326356;
                    }
                    break;
                case -699731131:
                case 1014587937:
                    C4075.m12263();
                    if (C1420.f5096 > 0) {
                        iM6981 = (C2105.m6981("ᩴ᩶") + i5) * 41;
                        i6 = ((iM6981 ^ i4) * (-31059)) ^ 799273371;
                        i7 = -849622429;
                    } else {
                        iM6981 = C2105.m6981("᩹ۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    }
                    break;
                case -467512110:
                case 1971327550:
                    bArrM35980 = m35980(c23411);
                    iM6981 = C0630.m2566("᩸ܽ") ^ i4;
                    i6 = ((iM6981 ^ i5) * (-20151)) ^ 666394250;
                    i7 = 820228809;
                    break;
                case -357555921:
                case 1686244653:
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("᩹ۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-15599)) ^ 909628834;
                        i7 = 2562095;
                    } else {
                        iM6981 = C0630.m2566("ۧ֡") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-32395)) ^ (-979743986);
                        i7 = 994477090;
                    }
                    break;
                case -279944044:
                case 485601859:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("֡۠") ^ i4;
                        i6 = ((iM6981 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    } else {
                        iM6981 = (C2105.m6981("ۢۤ") ^ i5) * (-105);
                        i6 = ((iM6981 ^ i4) * 2789) ^ (-1965538622);
                        i7 = -581995559;
                    }
                    break;
                case -59209763:
                case 946114244:
                    if (bArrM35980 != null) {
                        iM6981 = (C0630.m2566("֡ܽ") + i5) * (-27);
                        i6 = ((iM6981 ^ i4) * 8361) ^ (-1323514831);
                        i7 = 331843212;
                    } else {
                        iM6981 = C0630.m2566("ۚ᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 1513) ^ (-455095750);
                        i7 = 164624721;
                    }
                    break;
                case -32273083:
                case 2001772490:
                    c23411.m51858(bArr, i2, i);
                    return m35978(bArr);
                case 36964022:
                case 1942895685:
                    try {
                        c15206M35978 = m35978(bArrM35980);
                        iM6981 = (i4 - C0630.m2566("᩷۬")) * (-71);
                        i6 = ((iM6981 ^ i5) * 2971) ^ (-1599438498);
                        i7 = -1709582758;
                    } catch (Throwable unused) {
                        iM6981 = C0630.m2566("ۚ᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 1513) ^ (-455095750);
                        i7 = 164624721;
                    }
                    break;
                case 157434613:
                case 2084110787:
                    if (C3683.m11222()) {
                        iM6981 = C2105.m6981("᩵ܰ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-7207)) ^ (-1833969065);
                        i7 = -344942774;
                    } else {
                        iM6981 = (i4 - C2105.m6981("᩹֡")) * 13;
                        i6 = ((iM6981 ^ i5) * (-7195)) ^ 1932453707;
                        i7 = 900461292;
                    }
                    break;
                case 479456169:
                case 1528929644:
                    if (length > 52428800) {
                        iM6981 = (C0630.m2566("᩺ۨ") + i4) * (-101);
                        i6 = ((iM6981 ^ i5) * 27825) ^ 1733253288;
                        i7 = 1182807712;
                    } else {
                        iM6981 = C2105.m6981("᩹ܳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-14971)) ^ (-749891076);
                        i7 = -72004401;
                    }
                    break;
                case 622288010:
                case 868374640:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("֡۠") ^ i4;
                        i6 = ((iM6981 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ܶۗ")) * (-119);
                        i6 = ((iM6981 ^ i4) * 26203) ^ 347865920;
                        i7 = -1456281303;
                    }
                    break;
                case 661812857:
                case 698634147:
                    c23411.seek(0L);
                    iM6981 = C2105.m6981("᩹ܳ") ^ i5;
                    i6 = ((iM6981 ^ i4) * (-14971)) ^ (-749891076);
                    i7 = -72004401;
                    break;
                case 1046387265:
                case 2072438368:
                    return c15206M35978;
                default:
                    if (C0237.m1481() >= 0) {
                        iM6981 = C2105.m6981("֡۠") ^ i4;
                        i6 = ((iM6981 ^ i5) * 5811) ^ 1251306302;
                        i7 = -1546746092;
                    } else {
                        iM6981 = (C0630.m2566("ᩴۙ") + i4) * (-27);
                        i6 = ((iM6981 ^ i5) * (-11283)) ^ (-1713806335);
                        i7 = -1976534124;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35976(long j, InputStream inputStream) {
        int i = -451798699;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C0714.f2697;
        int iM6981 = (i3 - C2105.m6981("ۙ᩹")) * (-79);
        int i4 = ((iM6981 ^ i2) * (-31193)) ^ 637323927;
        int i5 = 1833375173;
        while (true) {
            i = ((((i ^ i2) * 19847) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2042522090:
                case -1536661250:
                    RunnableC1108.m3790();
                    RunnableC0588.m2441();
                    iM6981 = (C2105.m6981("ܿۧ") + i2) * 19;
                    i4 = ((iM6981 ^ i3) * 17055) ^ 397460828;
                    i5 = 1056773426;
                    break;
                case -1912335154:
                case -1400086150:
                    return false;
                case -1770535313:
                case 695212268:
                    if (C4159.f13567) {
                        iM6981 = C0630.m2566("ۤ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15251) ^ (-1190971689);
                        i5 = -1451622795;
                    } else {
                        iM6981 = (C2105.m6981("ܿۧ") + i2) * 19;
                        i4 = ((iM6981 ^ i3) * 17055) ^ 397460828;
                        i5 = 1056773426;
                    }
                    break;
                case -1722119863:
                case 444752874:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6981 = C2105.m6981("ۖ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2197)) ^ 1008997683;
                        i5 = 1626056661;
                    } else {
                        iM6981 = C0630.m2566("ۧۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15529) ^ 666063321;
                        i5 = -1488986607;
                    }
                    break;
                case -1484487287:
                case 2024246152:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C2105.m6981("ܳ֡") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-4059)) ^ 1154839643;
                        i5 = -921145984;
                    } else {
                        iM6981 = (C2105.m6981("֡ᩳ") + i3) * 27;
                        i4 = ((iM6981 ^ i2) * 20099) ^ 1307301574;
                        i5 = -127692031;
                    }
                    break;
                case -1480926805:
                case -334992292:
                    return m35977(new C7307(inputStream));
                case -1405652825:
                case 2041168230:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ۖ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2197)) ^ 1008997683;
                        i5 = 1626056661;
                    } else {
                        iM6981 = C0630.m2566("ܳۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16039) ^ (-722746927);
                        i5 = 2062970134;
                    }
                    break;
                case -1381533448:
                case 225063550:
                    C3537.m10746();
                    if (C4263.f13799 > 0) {
                        iM6981 = (C2105.m6981("ܳ֡") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-4059)) ^ 1154839643;
                        i5 = -921145984;
                    } else {
                        iM6981 = (C2105.m6981("ۛۜ") + i3) * 83;
                        i4 = ((iM6981 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    }
                    break;
                case -518387788:
                case -99655276:
                    if (C1294.m4372() <= 0) {
                        iM6981 = (C2105.m6981("ۛۜ") + i3) * 83;
                        i4 = ((iM6981 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    } else {
                        iM6981 = (i2 - C2105.m6981("۠ۛ")) * 27;
                        i4 = ((iM6981 ^ i3) * 18147) ^ 600142714;
                        i5 = 1939631859;
                    }
                    break;
                case -170453526:
                case 1198258697:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("ܳ֡") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-4059)) ^ 1154839643;
                        i5 = -921145984;
                    } else {
                        iM6981 = C2105.m6981("᩻ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26547) ^ (-231704995);
                        i5 = -210880892;
                    }
                    break;
                case -169712667:
                case 869491430:
                    if (C4117.m12364() != 0) {
                        iM6981 = (C2105.m6981("ۛۜ") + i3) * 83;
                        i4 = ((iM6981 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    } else {
                        iM6981 = (C2105.m6981("ܿۧ") + i2) * 19;
                        i4 = ((iM6981 ^ i3) * 17055) ^ 397460828;
                        i5 = 1056773426;
                    }
                    break;
                case -44399047:
                case 582791021:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("ۛۜ") + i3) * 83;
                        i4 = ((iM6981 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    } else {
                        iM6981 = C0630.m2566("֫ۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18817) ^ (-329157840);
                        i5 = -607388388;
                    }
                    break;
                case 4934175:
                case 961795987:
                    C3911.m11924();
                    return false;
                case 534274292:
                case 1203008168:
                    if (j < 108) {
                        iM6981 = C0630.m2566("ۧۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21225) ^ (-1495361084);
                        i5 = 4968969;
                    } else {
                        iM6981 = C0630.m2566("ۘۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26433) ^ 1501853460;
                        i5 = -208034155;
                    }
                    break;
                case 785723173:
                case 1077298422:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ۖ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2197)) ^ 1008997683;
                        i5 = 1626056661;
                    } else {
                        iM6981 = C0630.m2566("ۗ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27467)) ^ 825701940;
                        i5 = -1798463418;
                    }
                    break;
                case 885578345:
                case 1933994001:
                    if (C1504.m5179()) {
                        iM6981 = (C2105.m6981("ܳ֡") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-4059)) ^ 1154839643;
                        i5 = -921145984;
                    } else {
                        iM6981 = (C0630.m2566("᩺ܳ") + i3) * (-15);
                        i4 = ((iM6981 ^ i2) * (-19157)) ^ (-1540231123);
                        i5 = 76254286;
                    }
                    break;
                case 1434734989:
                case 1728221979:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ۛۜ") + i3) * 83;
                        i4 = ((iM6981 ^ i2) * (-4311)) ^ 1335192861;
                        i5 = -2021327068;
                    } else {
                        iM6981 = (C0630.m2566("᩹᩷") + i2) * 51;
                        i4 = ((iM6981 ^ i3) * 22537) ^ (-420520863);
                        i5 = -2069265434;
                    }
                    break;
                default:
                    if (C4616.m13552() != 0) {
                        iM6981 = C2105.m6981("ۖ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2197)) ^ 1008997683;
                        i5 = 1626056661;
                    } else {
                        iM6981 = C2105.m6981("۫ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 30879) ^ 798242247;
                        i5 = 328665904;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x016e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c3  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m35986(C12534 c12534) throws IOException {
        int iM6981;
        int i;
        XmlPullParserException e = null;
        byte[] bArrM28563 = null;
        int i2 = -1173325035;
        int i3 = C1128.f4106;
        int i4 = RunnableC0588.f2309;
        int iM6982 = (i3 - C2105.m6981("ܿܺ")) * (-43);
        int i5 = ((iM6982 ^ i4) * (-19461)) ^ (-244383208);
        int i6 = -1974427694;
        while (true) {
            int i7 = iM6982 ^ i6;
            ByteArrayInputStream byteArrayInputStream = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-21023)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2007194122:
                    case 1254531242:
                        if (C3019.m9255() <= 0) {
                            iM6981 = C0630.m2566("᩹ܳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-31693)) ^ 293886684;
                            i = 18023821;
                        } else {
                            iM6981 = (C0630.m2566("ۘۚ") ^ i3) * (-47);
                            i5 = ((iM6981 ^ i4) * 20709) ^ 1011918901;
                            i = -1242198424;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1988163799:
                    case -193793040:
                        if (!AbstractC2021.m6574()) {
                            iM6981 = C2105.m6981("֡ۗ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 22699) ^ 731048861;
                            i = -791986794;
                            i7 = iM6981 ^ i;
                        } else {
                            iM6982 = C0630.m2566("ۢ۬") ^ i4;
                            i5 = ((iM6982 ^ i3) * (-19877)) ^ (-2100719298);
                            i6 = -1313929415;
                        }
                        break;
                    case -1793388060:
                    case 160709023:
                        C0382.m1848();
                        if (ServiceConnectionC3453.f10921 >= 0) {
                            iM6982 = C2105.m6981("᩺۬") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-27523)) ^ (-990486189);
                            i6 = -1194987745;
                        }
                        iM6981 = C0630.m2566("ۧ֫") ^ i4;
                        i5 = ((iM6981 ^ i3) * 30041) ^ (-474632642);
                        i = -408519237;
                        i7 = iM6981 ^ i;
                        break;
                    case -1536257446:
                    case 774773969:
                        C1047.m3599();
                        return null;
                    case -1337797787:
                    case 335114551:
                        ServiceConnectionC3453.m10564();
                        iM6981 = C0630.m2566("ۢ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * 10325) ^ (-1599730866);
                        i = -1393919420;
                        i7 = iM6981 ^ i;
                        break;
                    case -1301501861:
                    case 1073763387:
                        throw new IOException(e);
                    case -1022623540:
                    case 2009796056:
                        return bArrM28563;
                    case -905207528:
                    case 1841494456:
                        if (RunnableC1937.f6483 >= 0) {
                            iM6981 = C0630.m2566("ۢ᩸") ^ i3;
                            i5 = ((iM6981 ^ i4) * 10325) ^ (-1599730866);
                            i = -1393919420;
                        } else {
                            iM6981 = (C0630.m2566("᩷ᩳ") + i4) * q.h;
                            i5 = ((iM6981 ^ i3) * (-15805)) ^ 948702041;
                            i = -1175061463;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -827099631:
                    case 464076003:
                        if (AbstractC2021.f6743 <= 0) {
                            iM6981 = C0630.m2566("ۧ֫") ^ i4;
                            i5 = ((iM6981 ^ i3) * 30041) ^ (-474632642);
                            i = -408519237;
                        } else {
                            iM6981 = C2105.m6981("ܳ۠") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-20285)) ^ 1724068039;
                            i = -1164066302;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -665874680:
                    case 21758766:
                        m35981(c12534);
                        if (RunnableC1108.f4040) {
                            iM6981 = (C0630.m2566("۠᩻") ^ i4) * (-109);
                            i5 = ((iM6981 ^ i3) * (-18873)) ^ (-1988515838);
                            i = -1707319246;
                        } else {
                            iM6981 = C0630.m2566("ۢ᩸") ^ i3;
                            i5 = ((iM6981 ^ i4) * 10325) ^ (-1599730866);
                            i = -1393919420;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -630261630:
                    case 1769867790:
                        if (C0798.f2919) {
                            iM6981 = C0630.m2566("ۧ֫") ^ i4;
                            i5 = ((iM6981 ^ i3) * 30041) ^ (-474632642);
                            i = -408519237;
                        } else {
                            iM6981 = C2105.m6981("ۨܳ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24157) ^ (-459545664);
                            i = -1943993251;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -596156832:
                    case -366577170:
                        byte[] bArr = this.f46669;
                        if (!C3663.f11553) {
                            int length = bArr.length;
                            int i8 = this.f46670;
                            if (C0237.f1507 == 0) {
                                byteArrayInputStream = new ByteArrayInputStream(bArr, i8, length - i8);
                                iM6981 = C2105.m6981("ܶۜ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 15465) ^ (-2012434334);
                                i = -1914507953;
                                i7 = iM6981 ^ i;
                            } else {
                                iM6982 = C2105.m6981("᩺۬") ^ i3;
                                i5 = ((iM6982 ^ i4) * (-27523)) ^ (-990486189);
                                i6 = -1194987745;
                            }
                        } else {
                            iM6982 = C0630.m2566("ۢ۬") ^ i4;
                            i5 = ((iM6982 ^ i3) * (-19877)) ^ (-2100719298);
                            i6 = -1313929415;
                        }
                        break;
                    case -465645939:
                    case 337245318:
                        try {
                            bArrM28563 = new C11680(byteArrayInputStream, this.f46672).m28563();
                            iM6981 = C0630.m2566("ۗۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 12655) ^ (-545507800);
                            i = 1526146432;
                        } catch (XmlPullParserException e2) {
                            e = e2;
                            iM6981 = C2105.m6981("᩺ܺ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-22719)) ^ 1644884807;
                            i = -1158966381;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 366618297:
                    case 2073521541:
                        if (C1711.m5736() > 0) {
                            iM6981 = (i3 - C2105.m6981("֫ܽ")) * 51;
                            i5 = ((iM6981 ^ i4) * (-4115)) ^ (-335166256);
                            i = 1180428626;
                            i7 = iM6981 ^ i;
                        } else {
                            iM6982 = C0630.m2566("ۢ۬") ^ i4;
                            i5 = ((iM6982 ^ i3) * (-19877)) ^ (-2100719298);
                            i6 = -1313929415;
                        }
                        break;
                    case 676603100:
                    case 1370591261:
                        if (C0050.f910 >= 0) {
                            iM6981 = C0630.m2566("ۧ֫") ^ i4;
                            i5 = ((iM6981 ^ i3) * 30041) ^ (-474632642);
                            i = -408519237;
                        } else {
                            iM6981 = C0630.m2566("᩹ܳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-31693)) ^ 293886684;
                            i = 18023821;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 761494085:
                    case 2120047024:
                        if (C3019.f9544 >= 0) {
                            iM6982 = C2105.m6981("᩺۬") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-27523)) ^ (-990486189);
                            i6 = -1194987745;
                        }
                        iM6981 = C0630.m2566("ۢ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * 10325) ^ (-1599730866);
                        i = -1393919420;
                        i7 = iM6981 ^ i;
                        break;
                    default:
                        if (C4075.f12947 < 0) {
                            iM6981 = (C0630.m2566("֫ܶ") ^ i3) * (-69);
                            i5 = ((iM6981 ^ i4) * (-10007)) ^ (-757387570);
                            i = 2117591177;
                            i7 = iM6981 ^ i;
                        } else {
                            iM6982 = C2105.m6981("᩺۬") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-27523)) ^ (-990486189);
                            i6 = -1194987745;
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125 A[PHI: r3 r8
      0x0125: PHI (r3v5 boolean) = (r3v4 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:42:0x0123, B:33:0x00ca, B:13:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:42:0x0123, B:33:0x00ca, B:13:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x018f A[PHI: r2 r6 r7 r9
      0x018f: PHI (r2v4 short) = (r2v3 short), (r2v2 short), (r2v2 short), (r2v2 short) binds: [B:50:0x018d, B:25:0x0088, B:16:0x0052, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r6v3 byte[]) = (r6v2 byte[]), (r6v2 byte[]), (r6v2 byte[]), (r6v5 byte[]) binds: [B:50:0x018d, B:25:0x0088, B:16:0x0052, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:50:0x018d, B:25:0x0088, B:16:0x0052, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:50:0x018d, B:25:0x0088, B:16:0x0052, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m35985() {
        int iM6981;
        int i;
        short s = 0;
        boolean z = false;
        C19277 c19277 = null;
        C13260 c13260 = null;
        byte[] bArr = null;
        int length = 0;
        int i2 = 0;
        int size = 0;
        int i3 = 2066054383;
        int i4 = C7811.f24123;
        int i5 = ViewOnClickListenerC1958.f6529;
        int iM2566 = C0630.m2566("ܳ֡") ^ i5;
        int i6 = ((iM2566 ^ i4) * 27023) ^ 764416000;
        int i7 = 481884764;
        while (true) {
            int i8 = iM2566 ^ i7;
            C10130 c10130 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-32021)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2036036405:
                    case -1052776773:
                        c10130.mo13229(s);
                        c10130.mo13229((short) 8);
                        if (C0382.m1848()) {
                            iM6981 = (C2105.m6981("ۘ۟") ^ i5) * (-89);
                            i6 = ((iM6981 ^ i4) * 10203) ^ (-1350993491);
                            i = 575644947;
                        } else {
                            iM6981 = C0630.m2566("᩶᩹") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-30337)) ^ (-227172261);
                            i = 101401585;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1673167469:
                    case 1378593029:
                        c10130.skipBytes(4);
                        z = true;
                        if (C2126.f7087) {
                            iM6981 = C0630.m2566("᩹۫") ^ i4;
                            i6 = ((iM6981 ^ i5) * 7253) ^ 510486127;
                            i = 2004935707;
                        } else {
                            iM6981 = (C2105.m6981("ۙ۬") + i4) * (-51);
                            i6 = ((iM6981 ^ i5) * 19129) ^ (-1529902053);
                            i = 1554868031;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1647335613:
                    case -1645777597:
                        C3663.m11168();
                        if (C4117.f13076 > 0) {
                            iM6981 = C0630.m2566("᩶᩸") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-14595)) ^ (-1974609396);
                            i = 126992722;
                        } else {
                            iM6981 = C0630.m2566("᩹۫") ^ i4;
                            i6 = ((iM6981 ^ i5) * 7253) ^ 510486127;
                            i = 2004935707;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1635606200:
                    case 305961014:
                        i2 = this.f46670;
                        if (C1005.m3501()) {
                            iM6981 = (C2105.m6981("᩷ܰ") ^ i5) * (-51);
                            i6 = ((iM6981 ^ i4) * (-18643)) ^ (-2032504736);
                            i = 1847298064;
                        } else {
                            iM6981 = C0630.m2566("᩹۫") ^ i4;
                            i6 = ((iM6981 ^ i5) * 7253) ^ 510486127;
                            i = 2004935707;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1397165349:
                    case 1402714182:
                        c10130.write(bArr, i2, length - i2);
                        if (C3911.f12484 < 0) {
                            iM6981 = (i4 - C0630.m2566("ᩴۙ")) * (-103);
                            i6 = ((iM6981 ^ i5) * 7275) ^ 1605751225;
                            i = -2004564105;
                            i8 = iM6981 ^ i;
                        }
                        break;
                    case -1102823285:
                    case 572019384:
                        C22628.m50607(c10130, size);
                        return c10130.m25444();
                    case -1073702485:
                    case -965535026:
                        if (C2958.m9034() <= 0) {
                            iM6981 = C0630.m2566("᩶᩸") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-14595)) ^ (-1974609396);
                            i = 126992722;
                        } else {
                            iM6981 = C0630.m2566("ܶ۠") ^ i5;
                            i6 = ((iM6981 ^ i4) * 15723) ^ 347634329;
                            i = 154011987;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -797941619:
                    case 536310155:
                        c19277 = null;
                        c13260 = this.f46672;
                        if (C5695.f17556 < 0) {
                            iM6981 = (C2105.m6981("۟ۡ") + i4) * 35;
                            i6 = ((iM6981 ^ i5) * 2431) ^ (-1697656630);
                            i = -2089683626;
                            i8 = iM6981 ^ i;
                        }
                        break;
                    case -504785435:
                    case -56138069:
                        c10130.seek(4L);
                        size = c10130.size();
                        if (C2958.f9394 >= 0) {
                            iM6981 = C0630.m2566("ܶ۠") ^ i5;
                            i6 = ((iM6981 ^ i4) * 15723) ^ 347634329;
                            i = 154011987;
                        } else {
                            iM6981 = C0630.m2566("᩹۬") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-2519)) ^ 915251816;
                            i = 263700063;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -449651863:
                    case 1722499611:
                        C2272.m7503();
                        if (C1294.m4372() <= 0) {
                            iM6981 = C0630.m2566("᩶᩸") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-14595)) ^ (-1974609396);
                            i = 126992722;
                        } else {
                            iM6981 = (C2105.m6981("ۘ۟") ^ i5) * (-89);
                            i6 = ((iM6981 ^ i4) * 10203) ^ (-1350993491);
                            i = 575644947;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 705445697:
                    case 1404119975:
                        C1128.m3851();
                        return null;
                    case 1060083785:
                    case 1561152270:
                        C2167.m7155();
                        C22628.m50615();
                        iM6981 = C0630.m2566("᩶᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-14595)) ^ (-1974609396);
                        i = 126992722;
                        i8 = iM6981 ^ i;
                        break;
                    case 1174997383:
                    case 1218165413:
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            c10130 = new C10130();
                            if (C1047.m3599() < 0) {
                                iM6981 = (i5 - C2105.m6981("ۨ֨")) * (-53);
                                i6 = ((iM6981 ^ i4) * (-15897)) ^ (-1081721802);
                                i = -91775855;
                                i8 = iM6981 ^ i;
                            }
                        }
                        break;
                    case 1850467276:
                    case 1983010956:
                        s = 3;
                        if (C3245.f10203 <= 0) {
                            iM6981 = C0630.m2566("ܶ۠") ^ i5;
                            i6 = ((iM6981 ^ i4) * 15723) ^ 347634329;
                            i = 154011987;
                        } else {
                            iM6981 = C2105.m6981("᩺۠") ^ i4;
                            i6 = ((iM6981 ^ i5) * 13353) ^ 1732865590;
                            i = 1892423770;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    default:
                        c13260.m32180(c10130, z, c19277);
                        bArr = this.f46669;
                        length = bArr.length;
                        if (C1504.f5354) {
                            iM6981 = C0630.m2566("ܶ۠") ^ i5;
                            i6 = ((iM6981 ^ i4) * 15723) ^ 347634329;
                            i = 154011987;
                        } else {
                            iM6981 = (i5 - C0630.m2566("ۖᩳ")) * 69;
                            i6 = ((iM6981 ^ i4) * (-13083)) ^ 1307289991;
                            i = -1083728908;
                        }
                        i8 = iM6981 ^ i;
                        break;
                }
            }
            iM2566 = (i4 - C2105.m6981("ۤۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
            i6 = ((iM2566 ^ i5) * (-7705)) ^ (-1865489020);
            i7 = -11020348;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x0208  */
    /* JADX WARN: Code duplicated, block: B:73:0x0255  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x0326 A[PHI: r5
      0x0326: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:96:0x0324, B:84:0x02b9, B:76:0x0281, B:29:0x00ac, B:26:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35977(C7307 c7307) {
        int iM2566;
        int i;
        int i2;
        short s = 0;
        boolean z = false;
        int iM19584 = 0;
        int i3 = 0;
        int iM19585 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        int iM19586 = 0;
        int iM19587 = 0;
        int i6 = 78215830;
        int i7 = C22628.f73083;
        int i8 = C0714.f2697;
        int iM6981 = (i8 - C2105.m6981("ۛۗ")) * 53;
        int i9 = ((iM6981 ^ i7) * 19597) ^ (-4976943);
        int i10 = iM6981 ^ (-1926270220);
        boolean z3 = false;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * 1121) >> 31));
            switch (i6) {
                case -1974360091:
                case 1071376480:
                    if (z2) {
                        iM2566 = C0630.m2566("᩹ܰ") ^ i7;
                        i = ((iM2566 ^ i8) * (-23381)) ^ (-1182174910);
                        i2 = -1990384705;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ܿ۫")) * 5;
                        i = ((iM2566 ^ i7) * 2757) ^ (-1153880753);
                        i2 = -1633799801;
                    }
                    int i11 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i11;
                    break;
                case -1783489405:
                case 550588900:
                    i3 = iM19584 - 4;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ۚۤ") ^ i7;
                        i = ((iM2566 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    } else {
                        iM2566 = C2105.m6981("ۡ᩸") ^ i8;
                        i = ((iM2566 ^ i7) * 1743) ^ (-1284488433);
                        i2 = 1155693782;
                    }
                    int i12 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i12;
                    break;
                case -1742657410:
                case 1580216445:
                    C5695.m16023();
                    if (C4075.f12947 < 0) {
                        iM2566 = C2105.m6981("ۚ᩷") ^ i7;
                        i = ((iM2566 ^ i8) * 25777) ^ (-10331716);
                        i2 = 1270890365;
                    } else {
                        iM2566 = C2105.m6981("ۚۤ") ^ i7;
                        i = ((iM2566 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    }
                    int i13 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i13;
                    break;
                case -1686409358:
                case -509129688:
                    i4 = MLKEMEngine.KyberPolyBytes;
                    i5 = 2;
                    if (iM19585 == z) {
                        iM2566 = (C2105.m6981("֫ۚ") + i7) * 73;
                        i = ((iM2566 ^ i8) * (-11207)) ^ (-1032848926);
                        i2 = 1646980578;
                    } else {
                        iM2566 = (C0630.m2566("ۙ᩻") ^ i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i7) * 10869) ^ (-2013854262);
                        i2 = -1194398540;
                    }
                    int i14 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i14;
                    break;
                case -1617693592:
                case -512089607:
                    c7307.skipBytes(i5);
                    c7307.skipBytes(c7307.readInt() - 8);
                    iM19586 = c7307.m19584();
                    iM2566 = (C2105.m6981("֡֫") + i8) * 37;
                    i = ((iM2566 ^ i7) * 32269) ^ 1070277402;
                    i2 = -1919794505;
                    int i15 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i15;
                    break;
                case -1577079221:
                case 1802739069:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("֡᩸") ^ i8;
                        i = ((iM2566 ^ i7) * 25911) ^ (-1051804278);
                        i2 = -1765946650;
                    } else {
                        iM2566 = C0630.m2566("ۖ֡") ^ i7;
                        i = ((iM2566 ^ i8) * (-4015)) ^ 1551008416;
                        i2 = -2007375024;
                    }
                    int i16 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i16;
                    break;
                case -1524297907:
                case -83602989:
                    if (iM19585 == i4) {
                        iM2566 = (i7 - C0630.m2566("֨ᩳ")) * (-97);
                        i = ((iM2566 ^ i8) * (-28455)) ^ (-614318276);
                        i2 = 181742976;
                    } else {
                        iM2566 = (C2105.m6981("ۘ᩶") ^ i7) * 85;
                        i = ((iM2566 ^ i8) * (-6675)) ^ 704968267;
                        i2 = -972612414;
                    }
                    int i17 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i17;
                    break;
                case -1519809230:
                case -155835721:
                    c7307.skipBytes(i3);
                    iM19585 = c7307.m19584();
                    iM2566 = C0630.m2566("֫ᩴ") ^ i7;
                    i = ((iM2566 ^ i8) * 7997) ^ (-588310175);
                    i2 = -733708062;
                    int i18 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i18;
                    break;
                case -1248308530:
                case -81948927:
                    z3 = false;
                    iM2566 = C0630.m2566("֨۫") ^ i7;
                    i = ((iM2566 ^ i8) * (-8381)) ^ (-1186515340);
                    i2 = 719269357;
                    int i19 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i19;
                    break;
                case -1219386252:
                case -894596740:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C2105.m6981("ۚᩳ") ^ i8) * (-87);
                        i = ((iM2566 ^ i7) * (-25893)) ^ 1542731133;
                        i2 = -494568355;
                    } else {
                        iM2566 = C0630.m2566("ᩳ᩶") ^ i8;
                        i = ((iM2566 ^ i7) * (-26307)) ^ 210185693;
                        i2 = -1738556027;
                    }
                    int i110 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i110;
                    break;
                case -1201603244:
                case -259533662:
                    if (C1047.m3599() < 0) {
                        iM2566 = C2105.m6981("ۚ᩷") ^ i7;
                        i = ((iM2566 ^ i8) * 25777) ^ (-10331716);
                        i2 = 1270890365;
                    } else {
                        iM2566 = C2105.m6981("ᩴܶ") ^ i8;
                        i = ((iM2566 ^ i7) * (-259)) ^ 214010628;
                        i2 = -632878613;
                    }
                    int i111 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i111;
                    break;
                case -1199822505:
                case 734467891:
                    z = true;
                    if (s != 3) {
                        iM2566 = C0630.m2566("᩷۟") ^ i8;
                        i = ((iM2566 ^ i7) * (-20857)) ^ (-2042800243);
                        i2 = -638528602;
                    } else {
                        iM2566 = C0630.m2566("᩹ۛ") ^ i8;
                        i = ((iM2566 ^ i7) * 29271) ^ (-368449189);
                        i2 = -1356512620;
                    }
                    int i112 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i112;
                    break;
                case -1195250257:
                case -438463818:
                    C3537.m10746();
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("ۚ᩷") ^ i7;
                        i = ((iM2566 ^ i8) * 25777) ^ (-10331716);
                        i2 = 1270890365;
                    } else {
                        iM2566 = C2105.m6981("֡᩸") ^ i8;
                        i = ((iM2566 ^ i7) * 25911) ^ (-1051804278);
                        i2 = -1765946650;
                    }
                    int i113 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i113;
                    break;
                case -1128456565:
                case 1859650474:
                    c7307.skipBytes(i5);
                    c7307.skipBytes(c7307.readInt() - 8);
                    iM19587 = c7307.m19584();
                    iM2566 = C0630.m2566("ۙ᩶") ^ i8;
                    i = ((iM2566 ^ i7) * (-9829)) ^ 2120179425;
                    i2 = 1577227638;
                    int i114 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i114;
                    break;
                case -1128102643:
                case 37923943:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۡۘ") ^ i8;
                        i = ((iM2566 ^ i7) * 14145) ^ (-95661183);
                        i2 = -729989201;
                    } else {
                        iM2566 = (i8 - C2105.m6981("᩹᩵")) * (-117);
                        i = ((iM2566 ^ i7) * (-16955)) ^ (-1677041267);
                        i2 = 1379251641;
                    }
                    int i115 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i115;
                    break;
                case -1111868360:
                case 1956353181:
                    if (C2105.f7037 != 0) {
                        iM2566 = (C0630.m2566("᩹ܶ") ^ i7) * (-99);
                        i = ((iM2566 ^ i8) * (-5003)) ^ (-1553584300);
                        i2 = 1954046331;
                    } else {
                        iM2566 = (i8 - C2105.m6981("᩶ۖ")) * (-13);
                        i = ((iM2566 ^ i7) * 16425) ^ 188918542;
                        i2 = 2061969450;
                    }
                    int i116 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i116;
                    break;
                case -1034915435:
                case -966664879:
                    C1128.m3851();
                    if (C0237.f1507 == 0) {
                        iM2566 = C2105.m6981("ۚ᩷") ^ i7;
                        i = ((iM2566 ^ i8) * 25777) ^ (-10331716);
                        i2 = 1270890365;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩻") ^ i8;
                        i = ((iM2566 ^ i7) * (-27343)) ^ (-2288573);
                        i2 = 915282230;
                    }
                    int i117 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i117;
                    break;
                case -900911818:
                case -191704289:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = C2105.m6981("ۗ᩻") ^ i8;
                        i = ((iM2566 ^ i7) * (-27343)) ^ (-2288573);
                        i2 = 915282230;
                    } else {
                        iM2566 = C0630.m2566("ۧᩴ") ^ i7;
                        i = ((iM2566 ^ i8) * (-30471)) ^ 2021432895;
                        i2 = -139229413;
                    }
                    int i118 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i118;
                    break;
                case -800235050:
                case -421771610:
                    if (iM19587 == i4) {
                        iM2566 = (i8 - C0630.m2566("ܿ۫")) * 5;
                        i = ((iM2566 ^ i7) * 2757) ^ (-1153880753);
                        i2 = -1633799801;
                    } else {
                        iM2566 = (C2105.m6981("ۘ᩶") ^ i7) * 85;
                        i = ((iM2566 ^ i8) * (-6675)) ^ 704968267;
                        i2 = -972612414;
                    }
                    int i119 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i119;
                    break;
                case -798451508:
                case 2116278083:
                    C1005.m3501();
                    return false;
                case -714443743:
                case -396536717:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("ۚᩳ") ^ i8) * (-87);
                        i = ((iM2566 ^ i7) * (-25893)) ^ 1542731133;
                        i2 = -494568355;
                    } else {
                        iM2566 = (i7 - C2105.m6981("᩻ܰ")) * (-9);
                        i = ((iM2566 ^ i8) * (-22617)) ^ 1476269993;
                        i2 = 1474105512;
                    }
                    int i1110 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1110;
                    break;
                case -472760390:
                case 1291636330:
                    if (C2126.f7087) {
                        iM2566 = C2105.m6981("ۚۤ") ^ i7;
                        i = ((iM2566 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    } else {
                        iM2566 = C2105.m6981("۫ۗ") ^ i7;
                        i = ((iM2566 ^ i8) * 27755) ^ 199183236;
                        i2 = 2043912306;
                    }
                    int i1111 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1111;
                    break;
                case -166055836:
                case 581643587:
                    return z3;
                case -79032775:
                case 1079422265:
                    C2520.m8026();
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ۗ᩻") ^ i8;
                        i = ((iM2566 ^ i7) * (-27343)) ^ (-2288573);
                        i2 = 915282230;
                    } else {
                        iM2566 = C2105.m6981("ܺ۟") ^ i7;
                        i = ((iM2566 ^ i8) * 30201) ^ (-1487772310);
                        i2 = -5321424;
                    }
                    int i1112 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1112;
                    break;
                case -54518067:
                case 53638747:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C2105.m6981("᩸ܺ") ^ i8) * 101;
                        i = ((iM2566 ^ i7) * 7139) ^ (-1485223142);
                        i2 = -245159718;
                    } else {
                        iM2566 = C2105.m6981("ۚۤ") ^ i7;
                        i = ((iM2566 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    }
                    int i1113 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1113;
                    break;
                case 58403188:
                case 560554763:
                    z2 = false;
                    iM2566 = (i7 - C0630.m2566("ۡۧ")) * 7;
                    i = ((iM2566 ^ i8) * (-25683)) ^ (-1309277573);
                    i2 = -1303906210;
                    int i1114 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1114;
                    break;
                case 254017924:
                case 1472000755:
                    z2 = true;
                    iM2566 = (i7 - C0630.m2566("ۡۧ")) * 7;
                    i = ((iM2566 ^ i8) * (-25683)) ^ (-1309277573);
                    i2 = -1303906210;
                    int i1115 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1115;
                    break;
                case 352533823:
                case 1278245853:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("֡᩸") ^ i8;
                        i = ((iM2566 ^ i7) * 25911) ^ (-1051804278);
                        i2 = -1765946650;
                    } else {
                        iM2566 = C2105.m6981("ۘ۟") ^ i8;
                        i = ((iM2566 ^ i7) * (-4669)) ^ (-347544419);
                        i2 = -449029017;
                    }
                    int i1116 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1116;
                    break;
                case 370403835:
                case 874332239:
                    if (C2126.f7087) {
                        iM2566 = (C2105.m6981("ۚᩳ") ^ i8) * (-87);
                        i = ((iM2566 ^ i7) * (-25893)) ^ 1542731133;
                        i2 = -494568355;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ۜᩳ")) * 109;
                        i = ((iM2566 ^ i8) * (-10849)) ^ (-83699383);
                        i2 = 226770705;
                    }
                    int i1117 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1117;
                    break;
                case 418519052:
                case 1484111721:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۚۤ") ^ i7;
                        i = ((iM2566 ^ i8) * 1547) ^ 1442702666;
                        i2 = -983299829;
                    } else {
                        iM2566 = (C0630.m2566("᩹ܶ") ^ i7) * (-99);
                        i = ((iM2566 ^ i8) * (-5003)) ^ (-1553584300);
                        i2 = 1954046331;
                    }
                    int i1118 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1118;
                    break;
                case 471503604:
                case 1322063822:
                    if (iM19586 == z) {
                        iM2566 = (i8 - C0630.m2566("ܿ۫")) * 5;
                        i = ((iM2566 ^ i7) * 2757) ^ (-1153880753);
                        i2 = -1633799801;
                    } else {
                        iM2566 = (C2105.m6981("ۘ᩶") ^ i7) * 85;
                        i = ((iM2566 ^ i8) * (-6675)) ^ 704968267;
                        i2 = -972612414;
                    }
                    int i1119 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i1119;
                    break;
                case 524066125:
                case 2052454734:
                    s = c7307.readShort();
                    iM2566 = C2105.m6981("ۜᩴ") ^ i8;
                    i = ((iM2566 ^ i7) * 31161) ^ (-856110766);
                    i2 = 909368402;
                    int i11110 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i11110;
                    break;
                case 1157656444:
                case 1410017460:
                    C0798.m2998();
                    iM2566 = C2105.m6981("ۚ᩷") ^ i7;
                    i = ((iM2566 ^ i8) * 25777) ^ (-10331716);
                    i2 = 1270890365;
                    int i11111 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i11111;
                    break;
                case 1494797650:
                case 1713260435:
                    return z;
                case 1513290149:
                case 1680973837:
                    if (C7811.m20844() == 0) {
                        iM2566 = C2105.m6981("ۗ᩻") ^ i8;
                        i = ((iM2566 ^ i7) * (-27343)) ^ (-2288573);
                        i2 = 915282230;
                    } else {
                        iM2566 = (C2105.m6981("ۚᩳ") ^ i8) * (-87);
                        i = ((iM2566 ^ i7) * (-25893)) ^ 1542731133;
                        i2 = -494568355;
                    }
                    int i11112 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i11112;
                    break;
                default:
                    try {
                        iM19584 = c7307.m19584();
                        iM2566 = C0630.m2566("۫ۘ") ^ i7;
                        i = ((iM2566 ^ i8) * 19021) ^ (-677950032);
                        i2 = 355633738;
                    } catch (Throwable unused) {
                        iM2566 = (C2105.m6981("ۘ᩶") ^ i7) * 85;
                        i = ((iM2566 ^ i8) * (-6675)) ^ 704968267;
                        i2 = -972612414;
                    }
                    int i11113 = i;
                    i10 = iM2566 ^ i2;
                    i9 = i11113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final XmlResourceParserC10269 m35994() {
        int iM2566;
        int i;
        int i2 = -888078392;
        int i3 = C7811.f24123;
        int i4 = C2167.f7158;
        int iM2567 = (C0630.m2566("ܶܿ") + i3) * 59;
        int i5 = ((iM2567 ^ i4) * (-12751)) ^ (-989925802);
        int i6 = iM2567 ^ 1194783178;
        ByteArrayInputStream byteArrayInputStream = null;
        while (true) {
            XmlResourceParserC10269 xmlResourceParserC10269 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 30571) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -1738441168:
                    case -733562355:
                        AbstractC2021.m6574();
                        C1916.m6308();
                        return null;
                    case -1734441149:
                    case -595350903:
                        C1420.m4913();
                        C0237.m1481();
                        break;
                    case -1439656541:
                    case -60704963:
                        AbstractC2021.m6574();
                        if (C5695.m16023() >= 0) {
                        }
                        iM2566 = C0630.m2566("ۨ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * 2095) ^ (-2118744570);
                        i = -1975247650;
                        i6 = iM2566 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case -736389975:
                    case 211445352:
                        xmlResourceParserC10269.m26009(byteArrayInputStream, this.f46672);
                        return xmlResourceParserC10269;
                    case -697746014:
                    case 1001662742:
                        C4159.m12565();
                        if (C7811.f24123 < 0) {
                        }
                        iM2566 = (i4 - C0630.m2566("ܿ۫")) * 61;
                        i5 = ((iM2566 ^ i3) * (-11133)) ^ 784266645;
                        i = 367759931;
                        i6 = iM2566 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case 122925978:
                    case 1166300794:
                        if (C0382.f1805) {
                            if (C3746.f11829 <= 0) {
                                iM2566 = C0630.m2566("ۨ᩷") ^ i3;
                                i5 = ((iM2566 ^ i4) * 2095) ^ (-2118744570);
                                i = -1975247650;
                                i6 = iM2566 ^ i;
                                byteArrayInputStream = null;
                            } else {
                                if (!AbstractC2021.m6574()) {
                                    if (C7811.f24123 < 0) {
                                        if (!C2272.m7503()) {
                                            byte[] bArr = this.f46669;
                                            if (!C2272.m7503()) {
                                                int length = bArr.length;
                                                if (ViewOnClickListenerC1958.f6529 > 0) {
                                                    int i7 = this.f46670;
                                                    int i8 = length - i7;
                                                    if (!C0798.f2919) {
                                                        byteArrayInputStream = new ByteArrayInputStream(bArr, i7, i8);
                                                        if (C4075.m12263() <= 0) {
                                                        }
                                                        xmlResourceParserC10269 = new XmlResourceParserC10269();
                                                        if (C0382.f1805) {
                                                            int iM2568 = (i3 - C0630.m2566("۠֫")) * (-67);
                                                            i5 = ((iM2568 ^ i4) * 14591) ^ (-2058985833);
                                                            i6 = iM2568 ^ (-1171376859);
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    iM2566 = (i4 - C0630.m2566("ܿ۫")) * 61;
                                    i5 = ((iM2566 ^ i3) * (-11133)) ^ 784266645;
                                    i = 367759931;
                                    i6 = iM2566 ^ i;
                                    byteArrayInputStream = null;
                                }
                                iM2566 = C0630.m2566("ܰ֡") ^ i4;
                                i5 = ((iM2566 ^ i3) * (-12937)) ^ 659644654;
                                i = 1936129524;
                                i6 = iM2566 ^ i;
                                byteArrayInputStream = null;
                            }
                            break;
                        }
                        iM2566 = C0630.m2566("ۛ۫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 8469) ^ 1321762793;
                        i = 1968980482;
                        i6 = iM2566 ^ i;
                        byteArrayInputStream = null;
                        break;
                    default:
                        AbstractC2021.m6574();
                        if (C0630.f2410 > 0) {
                            iM2566 = (i4 - C0630.m2566("ܿ۫")) * 61;
                            i5 = ((iM2566 ^ i3) * (-11133)) ^ 784266645;
                            i = 367759931;
                        } else {
                            iM2566 = C0630.m2566("ܰ֡") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-12937)) ^ 659644654;
                            i = 1936129524;
                        }
                        i6 = iM2566 ^ i;
                        byteArrayInputStream = null;
                        break;
                }
            }
            int iM6981 = (C2105.m6981("ۗᩴ") + i4) * (-113);
            i5 = ((iM6981 ^ i3) * (-23999)) ^ 741606903;
            i6 = iM6981 ^ (-2013028291);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m35991() {
        return this.f46671;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m35979(StringBuilder sb, int i) {
        C13260 c13260 = null;
        int i2 = 104058472;
        int i3 = C11340.f33930;
        int i4 = C2520.f8000;
        int iM6981 = (C2105.m6981("ۜ֫") ^ i3) * (-111);
        int i5 = ((iM6981 ^ i4) * (-1881)) ^ 892149893;
        int i6 = -245895058;
        while (true) {
            i2 = ((((i2 ^ i4) * 21861) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1972357131:
                case -1529030083:
                    if (!C0798.f2919) {
                        iM6981 = (C0630.m2566("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    } else {
                        iM6981 = (C0630.m2566("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM6981 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    }
                    break;
                case -1952898377:
                case 337029668:
                    if (i >= 0) {
                        iM6981 = C2105.m6981("ۢۜ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-23267)) ^ 1421414748;
                        i6 = 272680823;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۘۧ")) * (-101);
                        i5 = ((iM6981 ^ i3) * 24567) ^ (-1195506750);
                        i6 = 1717490651;
                    }
                    break;
                case -1940182592:
                case 242809307:
                    C2272.m7503();
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C0630.m2566("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    } else {
                        iM6981 = C2105.m6981("۬ܿ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 10165) ^ 223217704;
                        i6 = -1916752164;
                    }
                    break;
                case -1799425337:
                case 1709946071:
                    if (C3432.m10477() <= 0) {
                        iM6981 = (C0630.m2566("ܿۧ") + i4) * (-81);
                        i5 = ((iM6981 ^ i3) * 27011) ^ 1346786496;
                        i6 = 1951367513;
                    } else {
                        iM6981 = C0630.m2566("ۡ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-18557)) ^ (-1089843893);
                        i6 = -223547181;
                    }
                    break;
                case -1655928836:
                case -1017518706:
                    C2105.m6979(sb, ':');
                    iM6981 = (i4 - C0630.m2566("ۘۧ")) * (-101);
                    i5 = ((iM6981 ^ i3) * 24567) ^ (-1195506750);
                    i6 = 1717490651;
                    break;
                case -1458719735:
                case 946996311:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    } else {
                        iM6981 = (C0630.m2566("ܺܺ") + i3) * 23;
                        i5 = ((iM6981 ^ i4) * (-3073)) ^ 583774723;
                        i6 = 466151168;
                    }
                    break;
                case -1254229568:
                case 217611121:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1066732597:
                case 1218418339:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM6981 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    } else {
                        iM6981 = C2105.m6981("۠۠") ^ i3;
                        i5 = ((iM6981 ^ i4) * 14931) ^ 1959333000;
                        i6 = -877852900;
                    }
                    break;
                case -999670671:
                case -703690905:
                    c13260 = this.f46672;
                    if (i >= c13260.size()) {
                        iM6981 = (i4 - C0630.m2566("ۘۧ")) * (-101);
                        i5 = ((iM6981 ^ i3) * 24567) ^ (-1195506750);
                        i6 = 1717490651;
                    } else {
                        iM6981 = C0630.m2566("ܳᩴ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 9967) ^ 1913393452;
                        i6 = -1598140362;
                    }
                    break;
                case -679795769:
                case -45142561:
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C0630.m2566("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    } else {
                        iM6981 = C0630.m2566("ۤ۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-7597)) ^ 1562958926;
                        i6 = -421480244;
                    }
                    break;
                case -672565557:
                case 155521153:
                    if (C1128.m3851() <= 0) {
                        iM6981 = (C0630.m2566("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM6981 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    } else {
                        iM6981 = (C0630.m2566("ۡۙ") ^ i4) * 93;
                        i5 = ((iM6981 ^ i3) * 30891) ^ (-800860944);
                        i6 = 774221147;
                    }
                    break;
                case -267654323:
                case 613478761:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM6981 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩺ۡ")) * 9;
                        i5 = ((iM6981 ^ i4) * 8959) ^ 1789383823;
                        i6 = -1574605830;
                    }
                    break;
                case -18436594:
                case 646330456:
                    if (C3663.m11168() >= 0) {
                        iM6981 = (C0630.m2566("ܿۧ") + i4) * (-81);
                        i5 = ((iM6981 ^ i3) * 27011) ^ 1346786496;
                        i6 = 1951367513;
                    } else {
                        iM6981 = C2105.m6981("ۤܶ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-14895)) ^ (-1403786108);
                        i6 = -1277816623;
                    }
                    break;
                case 337603400:
                case 723149251:
                    C1420.m4905(sb, c13260.m47858(i));
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("۟ܶ") ^ i4) * (-63);
                        i5 = ((iM6981 ^ i3) * 8687) ^ (-1586911382);
                        i6 = -1394212232;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩷") ^ i3;
                        i5 = ((iM6981 ^ i4) * 32385) ^ 1271170750;
                        i6 = 1231444324;
                    }
                    break;
                case 479420327:
                case 1931403203:
                    C22628.m50615();
                    iM6981 = (C0630.m2566("ۤᩳ") ^ i4) * (-99);
                    i5 = ((iM6981 ^ i3) * 8359) ^ 2140332340;
                    i6 = 1245957391;
                    break;
                case 529005600:
                case 1502530064:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (C2105.m6981("۟ܶ") ^ i4) * (-63);
                        i5 = ((iM6981 ^ i3) * 8687) ^ (-1586911382);
                        i6 = -1394212232;
                    } else {
                        iM6981 = (C2105.m6981("ܺܶ") ^ i3) * 61;
                        i5 = ((iM6981 ^ i4) * (-279)) ^ 735414846;
                        i6 = 1506195147;
                    }
                    break;
                case 1508529203:
                case 1843398444:
                    C1711.m5736();
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ܿۧ") + i4) * (-81);
                        i5 = ((iM6981 ^ i3) * 27011) ^ 1346786496;
                        i6 = 1951367513;
                    } else {
                        iM6981 = (C0630.m2566("۬ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30185) ^ 685951760;
                        i6 = -499878745;
                    }
                    break;
                case 1634394622:
                case 1833217040:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C0630.m2566("ۤᩳ") ^ i4) * (-99);
                        i5 = ((iM6981 ^ i3) * 8359) ^ 2140332340;
                        i6 = 1245957391;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ᩹") ^ i4) * 91;
                        i5 = ((iM6981 ^ i3) * (-8917)) ^ (-1385581930);
                        i6 = -334289563;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35987(C12534 c12534) {
        m35981(c12534);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 135341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35981(l.C12534 r89) {
        /*
            Method dump skipped, instruction units count: 13534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15206.m35981(l.۫ܽܽ):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35973(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 944516608;
        int i4 = C4117.f13076;
        int i5 = C0714.f2697;
        int iM6981 = (i4 - C2105.m6981("᩵ᩴ")) * 33;
        int i6 = ((iM6981 ^ i5) * (-11601)) ^ 750264715;
        int i7 = -838231942;
        while (true) {
            i3 = ((((i3 ^ i5) * 3525) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -2010804624:
                case -1822335129:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ܿۡ")) * (-105);
                        i6 = ((iM6981 ^ i5) * 13477) ^ (-288414650);
                        i7 = 341486546;
                    } else {
                        iM6981 = C0630.m2566("ۖ۬") ^ i5;
                        i6 = ((iM6981 ^ i4) * 1219) ^ 1266614639;
                        i7 = 1574969426;
                    }
                    break;
                case -1643760268:
                case 626445606:
                    C2958.m9034();
                    C0964.m3413();
                    iM6981 = (i4 - C2105.m6981("ܿۡ")) * (-105);
                    i6 = ((iM6981 ^ i5) * 13477) ^ (-288414650);
                    i7 = 341486546;
                    break;
                case -1626312270:
                case -743448423:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("۟֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 25655) ^ (-1239710975);
                        i7 = -330508992;
                    } else {
                        iM6981 = C0630.m2566("ۤ᩸") ^ i4;
                        i6 = ((iM6981 ^ i5) * 5297) ^ 1972808190;
                        i7 = -1993793655;
                    }
                    break;
                case -1615373174:
                case -538938054:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("۟֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 25655) ^ (-1239710975);
                        i7 = -330508992;
                    } else {
                        iM6981 = (C2105.m6981("ܰۘ") ^ i5) * 89;
                        i6 = ((iM6981 ^ i4) * 22787) ^ 366018097;
                        i7 = -979746607;
                    }
                    break;
                case -1521928972:
                case -623413439:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("᩸۟") ^ i4;
                        i6 = ((iM6981 ^ i5) * 27103) ^ (-796002623);
                        i7 = 1004526614;
                    } else {
                        iM6981 = C0630.m2566("֨᩵") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-19415)) ^ (-1674880675);
                        i7 = 2121613355;
                    }
                    break;
                case -1357759281:
                case 1717016513:
                    i2++;
                    iM6981 = C0630.m2566("ۖܽ") ^ i4;
                    i6 = ((iM6981 ^ i5) * 21171) ^ 807373018;
                    i7 = 1933670705;
                    break;
                case -1135237828:
                case 1725000915:
                    i2 = 0;
                    iM6981 = C0630.m2566("ۖܽ") ^ i4;
                    i6 = ((iM6981 ^ i5) * 21171) ^ 807373018;
                    i7 = 1933670705;
                    break;
                case -887832172:
                case 1830125014:
                    AbstractC2021.m6574();
                    if (!C4159.f13567) {
                        iM6981 = C0630.m2566("۟֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 25655) ^ (-1239710975);
                        i7 = -330508992;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۨۧ")) * (-51);
                        i6 = ((iM6981 ^ i5) * 10661) ^ 420383906;
                        i7 = 1735384819;
                    }
                    break;
                case -781325957:
                case 1852333008:
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = C0630.m2566("ۙۢ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 27591) ^ (-1008248809);
                        i7 = 273282112;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܿۡ")) * (-105);
                        i6 = ((iM6981 ^ i5) * 13477) ^ (-288414650);
                        i7 = 341486546;
                    }
                    break;
                case -736795574:
                case 1644369393:
                    C4117.m12364();
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (i4 - C0630.m2566("ۨۧ")) * (-51);
                        i6 = ((iM6981 ^ i5) * 10661) ^ 420383906;
                        i7 = 1735384819;
                    } else {
                        iM6981 = C0630.m2566("ۙۢ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 27591) ^ (-1008248809);
                        i7 = 273282112;
                    }
                    break;
                case -511289998:
                case 554907042:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C0630.m2566("۟֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * 25655) ^ (-1239710975);
                        i7 = -330508992;
                    } else {
                        iM6981 = C0630.m2566("֡ۖ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 21) ^ 1919189652;
                        i7 = 292873644;
                    }
                    break;
                case -271637346:
                case 1654096448:
                    break;
                case -153410479:
                case 1203620446:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ܿۡ")) * (-105);
                        i6 = ((iM6981 ^ i5) * 13477) ^ (-288414650);
                        i7 = 341486546;
                    } else {
                        iM6981 = C0630.m2566("ۖ᩺") ^ i5;
                        i6 = ((iM6981 ^ i4) * 13067) ^ 1782758975;
                        i7 = 721862797;
                    }
                    break;
                case 266001793:
                case 1945382401:
                    C1711.m5736();
                    break;
                case 446772117:
                case 2109183149:
                    if (C11340.m28031()) {
                        iM6981 = (i4 - C2105.m6981("ۛۘ")) * (-87);
                        i6 = ((iM6981 ^ i5) * (-1229)) ^ 2109118642;
                        i7 = 312976061;
                    } else {
                        iM6981 = C2105.m6981("᩸۟") ^ i4;
                        i6 = ((iM6981 ^ i5) * 27103) ^ (-796002623);
                        i7 = 1004526614;
                    }
                    break;
                case 452234130:
                case 1346795885:
                    C2105.m6979(sb, ' ');
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("᩸۟") ^ i4;
                        i6 = ((iM6981 ^ i5) * 27103) ^ (-796002623);
                        i7 = 1004526614;
                    } else {
                        iM6981 = C2105.m6981("᩶ܺ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-29615)) ^ 540904848;
                        i7 = 559816022;
                    }
                    break;
                case 629684401:
                case 2061363372:
                    if (i2 < i) {
                        iM6981 = (C2105.m6981("ܿ۬") + i4) * (-13);
                        i6 = ((iM6981 ^ i5) * 9869) ^ 1701354546;
                        i7 = -940500431;
                    } else {
                        iM6981 = (C2105.m6981("ᩴ֨") ^ i5) * 57;
                        i6 = ((iM6981 ^ i4) * (-1421)) ^ (-1365648788);
                        i7 = 1094505535;
                    }
                    break;
                case 656269470:
                case 774005961:
                    if (C4159.f13567) {
                        iM6981 = (C0630.m2566("۬ܺ") ^ i5) * 101;
                        i6 = ((iM6981 ^ i4) * 9199) ^ 2064051920;
                        i7 = 1489912466;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܿۡ")) * (-105);
                        i6 = ((iM6981 ^ i5) * 13477) ^ (-288414650);
                        i7 = 341486546;
                    }
                    break;
                default:
                    if (C2126.f7087) {
                        iM6981 = (i4 - C0630.m2566("ۨۧ")) * (-51);
                        i6 = ((iM6981 ^ i5) * 10661) ^ 420383906;
                        i7 = 1735384819;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩶") ^ i5;
                        i6 = ((iM6981 ^ i4) * 27725) ^ (-757693285);
                        i7 = -1603434606;
                    }
                    break;
            }
            return;
        }
    }

    static {
        ApplicationC12518.m30701(116);
        f46665 = new short[]{1441, -11076, -11069, -11104, -11128, -11104, -11118, -11046, -11041, -11046, -11123, -11127, -11117, -11128, -11065, -11046, -11107, -11119, -11124, -11065, -11046, -11120, -11128, -11065, -11046, -11109, -11128, -11065, -11104, -11104, -11065, 2402, 3277, 557, -1933, -1934, -1935, -1936, -1929, -1930, -1931, -1932, -1925, -1926, -2014, -2015, -2016, -2009, -2010, -2011, -1933, -1934, -1935, -1936, -1929, -1930, -1931, -1932, -1925, -1926, -2046, -2047, -2048, -2041, -2042, -2043, -1989, -2002, -2001, -2003, -2000, -1927, -1933, -1989, -2041, -2010, -1997, -1999, -2010, -2016, -2014, -1993, -2010, -2009, -1949, -1940, -1923, -1975, -1921, -1940, -1993, -1999, -1994, -2010, -2010, -1999, -1999, -2004, -1999, -2011, -2014, -2001, -2000, -2010, -1952, -1947, -1952, -1947, -2014, -2002, -1997, -1928, -1947, -2001, -1993, -1928, -1947, -2012, -1993, -1928, -1928, 7736, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4523, 4538, 4538, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4536, 4527, 4537, 4581, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4538, 4536, 4540, 4581, 4536, 4527, 4537, 4581, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4526, 4515, 4537, 4542, 4536, 4515, 4520, 4543, 4542, 4515, 4517, 4516, 4521, 4543, 4537, 4542, 4517, 4519, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4538, 4536, 4540, 4526, 4515, 4537, 4542, 4515, 4526, 4602, 4603, 4600, 4601, 4606, 4607, 4604, 4605, 4594, 4595, 4523, 4520, 4521, 4526, 4527, 4524, 4514, 4542, 4542, 4538, 4592, 4581, 4581, 4537, 4521, 4514, 4527, 4519, 4523, 4537, 4580, 4523, 4516, 4526, 4536, 4517, 4515, 4526, 4580, 4521, 4517, 4519, 4581, 4523, 4538, 4513, 4581, 4536, 4527, 4537, 4583, 4523, 4543, 4542, 4517, 9650, 17722, 20714, 23400, 6288, 31373, -32443, 30596, 1288, 24570, -22432, -19730, 9231, 29266, -29200, 17003};
        f46666 = new C7073();
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0863 A[PHI: r4 r5 r6 r8 r13 r23 r24 r25 r26 r27 r32 r33
      0x0863: PHI (r4v25 int) = (r4v24 int), (r4v26 int) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r5v22 int) = (r5v21 int), (r5v23 int) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r6v15 short[]) = (r6v14 short[]), (r6v16 short[]) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r8v76 int) = (r8v75 int), (r8v77 int) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r13v56 int) = (r13v55 int), (r13v57 int) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r23v11 java.lang.StringBuilder) = (r23v10 java.lang.StringBuilder), (r23v12 java.lang.StringBuilder) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r24v12 char) = (r24v11 char), (r24v13 char) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r25v11 char) = (r25v10 char), (r25v12 char) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r26v11 short[]) = (r26v10 short[]), (r26v12 short[]) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r27v25 int) = (r27v24 int), (r27v26 int) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r32v38 short[]) = (r32v37 short[]), (r32v39 short[]) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r33v25 int) = (r33v24 int), (r33v26 int) binds: [B:158:0x0849, B:152:0x080f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x024a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35969(String str) {
        int iM2566;
        int i;
        int i2;
        short[] sArr;
        int iM2567;
        int i3;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        int i7;
        int i8;
        int iM6981;
        int i9;
        short[] sArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        short[] sArr4;
        int iM2568;
        int i14;
        int i15;
        int iM6982;
        int i16;
        int i17;
        short[] sArr5;
        int i18;
        int i19;
        int iM2569;
        int i20;
        int i21;
        int i22;
        int i23;
        char c2;
        int i24;
        short[] sArr6;
        int i25;
        short[] sArr7;
        int i26;
        int iM6983;
        int i27;
        int i28;
        short[] sArr8;
        int i29 = 153687282;
        int i30 = C0050.f910;
        int i31 = C4075.f12947;
        int iM6984 = C2105.m6981("ۛۢ") ^ i31;
        int i32 = ((iM6984 ^ i30) * 23459) ^ (-371535566);
        int i33 = iM6984 ^ (-1004411125);
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        int i34 = 0;
        StringBuilder sb = null;
        char c3 = 0;
        int i35 = 0;
        char c4 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        char c5 = 0;
        short s = 0;
        short s2 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        short[] sArr15 = null;
        String strM10568 = null;
        char c6 = 0;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i30) * (-6719)) >> 31));
            switch (i29) {
                case -2131829804:
                case 597032822:
                    if (C2105.f7037 != 0) {
                        sArr2 = sArr14;
                        iM6981 = (i30 - C0630.m2566("ۚܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM6981 ^ i31) * 1575) ^ (-452915497);
                        i9 = 583010441;
                        i7 = iM6981 ^ i9;
                        sArr = sArr2;
                        i33 = i7;
                        i32 = i6;
                        sArr14 = sArr;
                    } else {
                        iM6983 = C2105.m6981("۠᩹") ^ i31;
                        i27 = ((iM6983 ^ i30) * 12799) ^ 1871792732;
                        i28 = 78516685;
                        i33 = iM6983 ^ i28;
                        i32 = i27;
                    }
                    break;
                case -2123959953:
                case -1699837282:
                    i35 = 0;
                    int iM6985 = C2105.m6981("ۡۡ") ^ i31;
                    i34 = i34;
                    i45 = i45;
                    sArr = sArr14;
                    i33 = iM6985 ^ 1818056926;
                    i32 = ((iM6985 ^ i30) * (-101)) ^ (-158853336);
                    i46 = i46;
                    sArr14 = sArr;
                    break;
                case -2068775379:
                case 931981847:
                    return "";
                case -2014150671:
                case 2040904745:
                    C3245.m9923(sb, C21923.m49334(sArr14, i38, 1, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM6986 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM6986 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM6986 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -2008949351:
                case -1151986440:
                    C1420.m4905(sb, C3663.m11162(f46665, 20, 4, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM6987 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM6987 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM6987 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -2000499611:
                case 225783385:
                    C2105.m6979(sb, c4);
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM6988 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM6988 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM6988 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -1992185249:
                case 524423809:
                    C1420.m4905(sb, C0964.m3396(f46665, 28, 2, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM6989 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM6989 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM6989 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -1954631682:
                case 1262081416:
                    sArr14 = sArr14;
                    i45 = i45;
                    i46 = i46;
                    i22 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    short[] sArr16 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr16;
                    i23 = i42;
                    sArr9 = sArr9;
                    c2 = '\\';
                    if (!C7811.m20838(str, C1916.m6311(sArr9, i23, 1, i39))) {
                        int iM69810 = (C2105.m6981("᩸֡") ^ i30) * (-115);
                        sb = sb;
                        i16 = ((iM69810 ^ i31) * 24627) ^ (-1155657339);
                        i24 = iM69810 ^ 1496976182;
                        i42 = i23;
                        i34 = i22;
                        c3 = '\\';
                        i45 = i45;
                        sArr8 = sArr14;
                        i33 = i24;
                        i32 = i16;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr8;
                        short[] sArr17 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr17;
                    } else {
                        int iM69811 = C2105.m6981("᩸ܰ") ^ i30;
                        i34 = i22;
                        i45 = i45;
                        short[] sArr18 = sArr14;
                        i33 = iM69811 ^ (-1543170240);
                        i32 = ((iM69811 ^ i31) * (-13947)) ^ 914127023;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr18;
                        char c7 = c2;
                        i42 = i23;
                        c3 = c7;
                        short[] sArr19 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr19;
                    }
                    break;
                case -1930039412:
                case -1338133210:
                    C1504.m5179();
                    C1711.m5736();
                    return null;
                case -1918360535:
                case 527032904:
                    sArr2 = sArr14;
                    if (c4 != c3) {
                        iM6981 = (i31 - C2105.m6981("۬ᩳ")) * (-33);
                        i6 = ((iM6981 ^ i30) * (-31343)) ^ 973253452;
                        i9 = -1610554991;
                    } else {
                        iM6981 = C2105.m6981("֨ܿ") ^ i30;
                        i6 = ((iM6981 ^ i31) * 19319) ^ (-1796990206);
                        i9 = -471352995;
                    }
                    i7 = iM6981 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1898686884:
                case -1128245893:
                    sArr2 = sArr14;
                    if (c4 != '&') {
                        iM6981 = C0630.m2566("ۧ۬") ^ i30;
                        i6 = ((iM6981 ^ i31) * (-9787)) ^ (-486896518);
                        i9 = 1720347210;
                    } else {
                        iM6981 = (i31 - C0630.m2566("۠ܳ")) * 97;
                        i6 = ((iM6981 ^ i30) * 4871) ^ (-2083590101);
                        i9 = 1389572921;
                    }
                    i7 = iM6981 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1869931915:
                case -634406700:
                    sArr2 = sArr14;
                    if (c4 != '\"') {
                        iM6981 = C2105.m6981("ۚ۬") ^ i31;
                        i6 = ((iM6981 ^ i30) * 12125) ^ 2015679290;
                        i9 = 110075094;
                    } else {
                        iM6981 = C0630.m2566("ܳܽ") ^ i30;
                        i6 = ((iM6981 ^ i31) * 12925) ^ 1282290229;
                        i9 = 708083999;
                    }
                    i7 = iM6981 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1843346709:
                case 998429912:
                    sArr2 = sArr14;
                    if (c4 != '>') {
                        iM6981 = C0630.m2566("۟ۢ") ^ i30;
                        i6 = ((iM6981 ^ i31) * 25201) ^ (-1607188975);
                        i9 = -473160480;
                    } else {
                        iM6981 = (C0630.m2566("ᩴۡ") ^ i31) * (-15);
                        i6 = ((iM6981 ^ i30) * (-14129)) ^ 1744256135;
                        i9 = 1154244187;
                    }
                    i7 = iM6981 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1708151836:
                case 1317099344:
                    sArr2 = sArr14;
                    if (c4 != '<') {
                        iM6981 = (C2105.m6981("ܰᩴ") ^ i31) * (-49);
                        i6 = ((iM6981 ^ i30) * (-20755)) ^ (-1398462992);
                        i9 = -571822340;
                    } else {
                        iM6981 = C2105.m6981("ۜ۬") ^ i30;
                        i6 = ((iM6981 ^ i31) * (-7173)) ^ (-459886192);
                        i9 = 1961106242;
                    }
                    i7 = iM6981 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1654730813:
                case -990318261:
                    sArr14 = sArr14;
                    i45 = i45;
                    i46 = i46;
                    i34 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    sArr9 = sArr9;
                    sb = sb;
                    short[] sArr20 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr20;
                    if ((i41 * i41) - i40 < 0) {
                        iM6982 = C2105.m6981("ۚ᩹") ^ i31;
                        i16 = ((iM6982 ^ i30) * 23491) ^ 518820345;
                        i17 = 2001880122;
                    } else {
                        iM6982 = C2105.m6981("᩹᩺") ^ i31;
                        i16 = ((iM6982 ^ i30) * (-28513)) ^ 2079887270;
                        i17 = -913272290;
                    }
                    i24 = iM6982 ^ i17;
                    i34 = i34;
                    i45 = i45;
                    sArr8 = sArr14;
                    i33 = i24;
                    i32 = i16;
                    sb = sb;
                    sArr9 = sArr9;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr8;
                    short[] sArr110 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr110;
                    break;
                case -1644798634:
                case -866048866:
                    if (c4 >= ' ') {
                        iM6983 = C2105.m6981("ܺۘ") ^ i31;
                        i27 = ((iM6983 ^ i30) * 7653) ^ (-1559765691);
                        i28 = -603099809;
                    } else {
                        iM6983 = C0630.m2566("ۚܳ") ^ i30;
                        i27 = ((iM6983 ^ i31) * (-31891)) ^ 832693531;
                        i28 = -2063601562;
                    }
                    i33 = iM6983 ^ i28;
                    i32 = i27;
                    break;
                case -1615010625:
                case 1726354575:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6983 = (i30 - C2105.m6981("᩵ۙ")) * 17;
                        i27 = ((iM6983 ^ i31) * (-8343)) ^ 1885416286;
                        i28 = 949543486;
                        i33 = iM6983 ^ i28;
                        i32 = i27;
                    } else {
                        sArr2 = sArr14;
                        i8 = i45;
                        i46 = i46;
                        i5 = i34;
                        i35 = i35;
                        i43 = i43;
                        c6 = c6;
                        sArr9 = sArr9;
                        sb = sb;
                        short[] sArr21 = sArr10;
                        c4 = c4;
                        i44 = i44;
                        sArr4 = sArr21;
                        iM2568 = C0630.m2566("۫᩵") ^ i31;
                        i32 = ((iM2568 ^ i30) * (-16235)) ^ 1728055494;
                        i14 = -921514789;
                        i15 = iM2568 ^ i14;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr2;
                        i33 = i15;
                        i34 = i5;
                        i45 = i8;
                        short[] sArr22 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr22;
                    }
                    break;
                case -1600886432:
                case 701473742:
                    sArr2 = sArr14;
                    sArr12 = f46665;
                    i36 = 5;
                    i37 = 2;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i30 - C0630.m2566("ۚܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM6981 ^ i31) * 1575) ^ (-452915497);
                        i9 = 583010441;
                    } else {
                        iM6981 = (i30 - C2105.m6981("ܿ۫")) * 33;
                        i6 = ((iM6981 ^ i31) * 21541) ^ 1516874358;
                        i9 = -1374406293;
                    }
                    i7 = iM6981 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case -1331183398:
                case 1283075508:
                    sArr2 = sArr14;
                    i8 = i45;
                    i46 = i46;
                    i5 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    sArr9 = sArr9;
                    sb = sb;
                    short[] sArr23 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr23;
                    sArr15 = f46665;
                    c5 = 0;
                    if (C0422.f1886 <= 0) {
                        iM2568 = C0630.m2566("۫᩵") ^ i31;
                        i32 = ((iM2568 ^ i30) * (-16235)) ^ 1728055494;
                        i14 = -921514789;
                    } else {
                        iM2568 = C0630.m2566("ۡ۟") ^ i31;
                        i32 = ((iM2568 ^ i30) * 171) ^ (-1562145893);
                        i14 = 1129675836;
                    }
                    i15 = iM2568 ^ i14;
                    sb = sb;
                    sArr9 = sArr9;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr2;
                    i33 = i15;
                    i34 = i5;
                    i45 = i8;
                    short[] sArr24 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr24;
                    break;
                case -1313963440:
                case -27728759:
                    C1773.m5908();
                    if (C0798.m2998() != 0) {
                        sArr2 = sArr14;
                        i8 = i45;
                        i46 = i46;
                        i5 = i34;
                        c6 = c6;
                        sArr9 = sArr9;
                        sb = sb;
                        short[] sArr25 = sArr10;
                        c4 = c4;
                        i44 = i44;
                        sArr4 = sArr25;
                        int iM25610 = (i31 - C0630.m2566("֫ܰ")) * (-75);
                        s = s;
                        i32 = ((iM25610 ^ i30) * (-30801)) ^ 606520359;
                        i34 = i5;
                        i45 = i8;
                        sArr8 = sArr2;
                        i33 = iM25610 ^ 840250923;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr8;
                        short[] sArr111 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr111;
                    } else {
                        sArr2 = sArr14;
                        sArr3 = sArr10;
                        i10 = i45;
                        i11 = i46;
                        i12 = i34;
                        i13 = i35;
                        c = c4;
                        int iM69812 = C2105.m6981("ۨۖ") ^ i30;
                        i34 = i12;
                        i45 = i10;
                        char c8 = c;
                        sArr10 = sArr3;
                        i32 = ((iM69812 ^ i31) * (-10573)) ^ (-1441722551);
                        c4 = c8;
                        short[] sArr26 = sArr2;
                        i33 = iM69812 ^ (-701134929);
                        i35 = i13;
                        i46 = i11;
                        sArr14 = sArr26;
                    }
                    break;
                case -1206999395:
                case 731686758:
                    sArr14 = sArr14;
                    sArr6 = sArr10;
                    i45 = i45;
                    i46 = i46;
                    i22 = i34;
                    i35 = i35;
                    c4 = c4;
                    i43 = i43;
                    i44 = i44;
                    c6 = c6;
                    if (!C7811.m20838(str, C1504.m5177(sArr6, i43, i44, i39))) {
                        int iM69813 = C2105.m6981("ۡۚ") ^ i30;
                        sArr4 = sArr6;
                        i32 = ((iM69813 ^ i31) * (-21847)) ^ (-1176423189);
                        i34 = i22;
                        i45 = i45;
                        char c9 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr14;
                        i33 = iM69813 ^ 1712016332;
                        c6 = c9;
                        short[] sArr112 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr112;
                    } else {
                        sArr4 = sArr6;
                        sArr9 = sArr9;
                        int i47 = i42;
                        c2 = c3;
                        i23 = i47;
                        int iM69814 = C2105.m6981("᩸ܰ") ^ i30;
                        i34 = i22;
                        i45 = i45;
                        short[] sArr113 = sArr14;
                        i33 = iM69814 ^ (-1543170240);
                        i32 = ((iM69814 ^ i31) * (-13947)) ^ 914127023;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr113;
                        char c10 = c2;
                        i42 = i23;
                        c3 = c10;
                        short[] sArr114 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr114;
                    }
                    break;
                case -1189750785:
                case 1066560740:
                    C2520.m8026();
                    if (!C1711.f5919) {
                        sArr14 = sArr14;
                        i45 = i45;
                        i46 = i46;
                        i34 = i34;
                        i35 = i35;
                        i43 = i43;
                        c6 = c6;
                        sArr9 = sArr9;
                        sb = sb;
                        short[] sArr27 = sArr10;
                        c4 = c4;
                        i44 = i44;
                        sArr4 = sArr27;
                        iM6982 = (C0630.m2566("֡ۡ") ^ i31) * 49;
                        i16 = ((iM6982 ^ i30) * (-12845)) ^ 942979922;
                        i17 = 1933028274;
                        i24 = iM6982 ^ i17;
                        i34 = i34;
                        i45 = i45;
                        sArr8 = sArr14;
                        i33 = i24;
                        i32 = i16;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr8;
                        short[] sArr115 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr115;
                    } else {
                        iM6983 = C2105.m6981("۠᩹") ^ i31;
                        i27 = ((iM6983 ^ i30) * 12799) ^ 1871792732;
                        i28 = 78516685;
                        i33 = iM6983 ^ i28;
                        i32 = i27;
                    }
                    break;
                case -1073854302:
                case 1914962949:
                    i35++;
                    int iM69815 = C2105.m6981("ۡۡ") ^ i31;
                    i34 = i34;
                    i45 = i45;
                    sArr = sArr14;
                    i33 = iM69815 ^ 1818056926;
                    i32 = ((iM69815 ^ i30) * (-101)) ^ (-158853336);
                    i46 = i46;
                    sArr14 = sArr;
                    break;
                case -1021470867:
                case 18399279:
                    if (C4616.f14690 <= 0) {
                        iM6983 = C0630.m2566("ܶۨ") ^ i30;
                        i27 = ((iM6983 ^ i31) * 27783) ^ (-992069481);
                        i28 = 1662590854;
                        i33 = iM6983 ^ i28;
                        i32 = i27;
                    } else {
                        sArr5 = sArr14;
                        i18 = i45;
                        i46 = i46;
                        i19 = i34;
                        i35 = i35;
                        i43 = i43;
                        c6 = c6;
                        short[] sArr28 = sArr10;
                        c4 = c4;
                        i44 = i44;
                        sArr4 = sArr28;
                        iM2569 = (C2105.m6981("᩵ۚ") ^ i30) * 45;
                        i20 = ((iM2569 ^ i31) * 17625) ^ 1670876060;
                        i21 = -371564446;
                        i34 = i19;
                        i45 = i18;
                        sArr8 = sArr5;
                        i33 = iM2569 ^ i21;
                        i32 = i20;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr8;
                        short[] sArr116 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr116;
                    }
                    break;
                case -973526161:
                case -469330650:
                    short[] sArr29 = sArr14;
                    int i48 = i45;
                    i46 = i46;
                    int i49 = i34;
                    if (i35 < C1711.m5741(str)) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i31;
                        i = ((iM2566 ^ i30) * (-21139)) ^ (-1962236811);
                        i2 = -664391287;
                    } else {
                        iM2566 = C0630.m2566("ۘۚ") ^ i30;
                        i = ((iM2566 ^ i31) * 21013) ^ (-1142541214);
                        i2 = 187612256;
                    }
                    i34 = i49;
                    i45 = i48;
                    sArr = sArr29;
                    i33 = iM2566 ^ i2;
                    i32 = i;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr;
                    break;
                case -888229382:
                case 1339585614:
                    sArr2 = sArr14;
                    i8 = i45;
                    i46 = i46;
                    i5 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    sArr9 = sArr9;
                    sb = sb;
                    short[] sArr30 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr30;
                    s = sArr15[c5];
                    s2 = 75368;
                    if (C3683.f11629 >= 0) {
                        iM2568 = C0630.m2566("᩶᩻") ^ i31;
                        i32 = ((iM2568 ^ i30) * (-12799)) ^ 1007493396;
                        i14 = -1992253646;
                    } else {
                        iM2568 = C2105.m6981("᩶ۘ") ^ i30;
                        i32 = ((iM2568 ^ i31) * 27311) ^ (-890999855);
                        i14 = -1925493989;
                    }
                    i15 = iM2568 ^ i14;
                    sb = sb;
                    sArr9 = sArr9;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr2;
                    i33 = i15;
                    i34 = i5;
                    i45 = i8;
                    short[] sArr210 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr210;
                    break;
                case -842130551:
                case 1001759353:
                    sArr14 = sArr14;
                    i45 = i45;
                    i46 = i46;
                    i34 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    sArr9 = sArr9;
                    sb = sb;
                    short[] sArr31 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr31;
                    i42 = 1;
                    if (C2105.f7037 != 0) {
                        iM6982 = (C0630.m2566("֡ۡ") ^ i31) * 49;
                        i16 = ((iM6982 ^ i30) * (-12845)) ^ 942979922;
                        i17 = 1933028274;
                    } else {
                        iM6982 = C0630.m2566("ۤۤ") ^ i31;
                        i16 = ((iM6982 ^ i30) * 20769) ^ 1961471749;
                        i17 = 52781734;
                    }
                    i24 = iM6982 ^ i17;
                    i34 = i34;
                    i45 = i45;
                    sArr8 = sArr14;
                    i33 = i24;
                    i32 = i16;
                    sb = sb;
                    sArr9 = sArr9;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr8;
                    short[] sArr117 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr117;
                    break;
                case -827103947:
                case -117607332:
                    C1420.m4905(sb, C4616.m13542(f46665, 15, 5, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM69816 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM69816 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM69816 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -804187098:
                case 371557061:
                    C2105.m6979(sb, c4);
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM69817 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM69817 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM69817 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -695109058:
                case 1889670558:
                    C1420.m4905(sb, C1005.m3502(f46665, 9, 6, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM69818 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM69818 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM69818 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -664386100:
                case -212015217:
                    c = c4;
                    char c11 = c6;
                    sArr2 = sArr14;
                    i10 = i45;
                    i11 = i46;
                    i12 = i34;
                    i13 = i35;
                    sArr3 = f46665;
                    i44 = 1;
                    if (C2958.f9394 >= 0) {
                        c6 = c11;
                        i43 = 2;
                        int iM69819 = C2105.m6981("ۨۖ") ^ i30;
                        i34 = i12;
                        i45 = i10;
                        char c12 = c;
                        sArr10 = sArr3;
                        i32 = ((iM69819 ^ i31) * (-10573)) ^ (-1441722551);
                        c4 = c12;
                        short[] sArr211 = sArr2;
                        i33 = iM69819 ^ (-701134929);
                        i35 = i13;
                        i46 = i11;
                        sArr14 = sArr211;
                    } else {
                        int iM69820 = C2105.m6981("ۢ᩶") ^ i31;
                        int i50 = ((iM69820 ^ i30) * 11613) ^ (-585233872);
                        i34 = i12;
                        i35 = i13;
                        i46 = i11;
                        i45 = i10;
                        sArr14 = sArr2;
                        i33 = iM69820 ^ 810899601;
                        c4 = c;
                        sArr10 = sArr3;
                        i32 = i50;
                        c6 = c11;
                        i43 = 2;
                    }
                    break;
                case -520151513:
                case 1779466828:
                    sArr14 = sArr14;
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    C3245.m9923(sb, C2167.m7159(sArr7, i26, i25, i39));
                    int iM698110 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM698110 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM698110 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case -509646641:
                case 1103678695:
                    sArr4 = sArr10;
                    i39 = 54524;
                    iM6982 = C0630.m2566("֡ۨ") ^ i30;
                    i16 = ((iM6982 ^ i31) * (-19285)) ^ (-1785715929);
                    i17 = -1266169456;
                    i24 = iM6982 ^ i17;
                    i34 = i34;
                    i45 = i45;
                    sArr8 = sArr14;
                    i33 = i24;
                    i32 = i16;
                    sb = sb;
                    sArr9 = sArr9;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr8;
                    short[] sArr118 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr118;
                    break;
                case -368521926:
                case 771598621:
                    sArr14 = sArr14;
                    i45 = i45;
                    i46 = i46;
                    i34 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    sArr9 = sArr9;
                    sb = sb;
                    short[] sArr32 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr32;
                    if (C7106.m19121(str)) {
                        iM6982 = (C0630.m2566("᩹ۛ") + i31) * (-63);
                        i16 = ((iM6982 ^ i30) * 24385) ^ (-2081846549);
                        i17 = 1195777229;
                    } else {
                        iM6982 = (i30 - C2105.m6981("᩹ۨ")) * 29;
                        i16 = ((iM6982 ^ i31) * (-26333)) ^ (-1289262670);
                        i17 = -587344930;
                    }
                    i24 = iM6982 ^ i17;
                    i34 = i34;
                    i45 = i45;
                    sArr8 = sArr14;
                    i33 = i24;
                    i32 = i16;
                    sb = sb;
                    sArr9 = sArr9;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr8;
                    short[] sArr119 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr119;
                    break;
                case -198461035:
                case 1440699002:
                    i5 = i34;
                    sArr2 = sArr14;
                    sArr11 = f46665;
                    i46 = 3;
                    if (C3911.f12484 < 0) {
                        int iM69821 = (C2105.m6981("֫ۚ") ^ i30) * 85;
                        i6 = ((iM69821 ^ i31) * (-20765)) ^ 793844623;
                        i7 = iM69821 ^ (-1995273640);
                        i34 = i5;
                        i45 = 2;
                        sArr = sArr2;
                        i33 = i7;
                        i32 = i6;
                        sArr14 = sArr;
                    } else {
                        i46 = 3;
                        i8 = 2;
                        c6 = c6;
                        sArr9 = sArr9;
                        sb = sb;
                        short[] sArr212 = sArr10;
                        c4 = c4;
                        i44 = i44;
                        sArr4 = sArr212;
                        int iM25611 = (i31 - C0630.m2566("֫ܰ")) * (-75);
                        s = s;
                        i32 = ((iM25611 ^ i30) * (-30801)) ^ 606520359;
                        i34 = i5;
                        i45 = i8;
                        sArr8 = sArr2;
                        i33 = iM25611 ^ 840250923;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr8;
                        short[] sArr1110 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr1110;
                    }
                    break;
                case -141854167:
                case 1972989614:
                    return C0422.m1959(sb);
                case -16139459:
                case 1500662048:
                    sArr4 = sArr10;
                    i39 = 55083;
                    iM6982 = C0630.m2566("֡ۨ") ^ i30;
                    i16 = ((iM6982 ^ i31) * (-19285)) ^ (-1785715929);
                    i17 = -1266169456;
                    i24 = iM6982 ^ i17;
                    i34 = i34;
                    i45 = i45;
                    sArr8 = sArr14;
                    i33 = i24;
                    i32 = i16;
                    sb = sb;
                    sArr9 = sArr9;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr8;
                    short[] sArr1111 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr1111;
                    break;
                case -8034497:
                case 1346228292:
                    short[] sArr33 = sArr14;
                    int i51 = i45;
                    i46 = i46;
                    int i52 = i34;
                    char cM5733 = C1711.m5733(str, i35);
                    if (cM5733 != '\t') {
                        iM2567 = (C2105.m6981("۬֡") ^ i31) * 59;
                        i3 = ((iM2567 ^ i30) * 20967) ^ 2062729326;
                        i4 = 1231905574;
                    } else {
                        iM2567 = (i31 - C0630.m2566("ۨ۟")) * 37;
                        i3 = ((iM2567 ^ i30) * (-14923)) ^ (-373813431);
                        i4 = -522782977;
                    }
                    i34 = i52;
                    i45 = i51;
                    sArr = sArr33;
                    i33 = iM2567 ^ i4;
                    i32 = i3;
                    c4 = cM5733;
                    i46 = i46;
                    sArr14 = sArr;
                    break;
                case 75376523:
                case 1176054206:
                    C3245.m9923(sb, C11340.m28025(f46665, 24, 4, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM698111 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM698111 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM698111 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case 212302279:
                case 1938976472:
                    C1420.m4905(sb, strM10568);
                    C0050.m945(sb, c4);
                    sArr14 = f46665;
                    i38 = 30;
                    if (!C0382.f1805) {
                        sArr14 = sArr14;
                        i45 = i45;
                        i46 = i46;
                        i34 = i34;
                        i35 = i35;
                        i43 = i43;
                        c6 = c6;
                        sArr9 = sArr9;
                        sb = sb;
                        short[] sArr213 = sArr10;
                        c4 = c4;
                        i44 = i44;
                        sArr4 = sArr213;
                        iM6982 = (C0630.m2566("֡ۡ") ^ i31) * 49;
                        i16 = ((iM6982 ^ i30) * (-12845)) ^ 942979922;
                        i17 = 1933028274;
                        i24 = iM6982 ^ i17;
                        i34 = i34;
                        i45 = i45;
                        sArr8 = sArr14;
                        i33 = i24;
                        i32 = i16;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr8;
                        short[] sArr1112 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr1112;
                    } else {
                        iM6983 = (C0630.m2566("ܶܽ") + i31) * 17;
                        i27 = ((iM6983 ^ i30) * 7367) ^ 1978688132;
                        i28 = -1981153922;
                        i33 = iM6983 ^ i28;
                        i32 = i27;
                    }
                    break;
                case 241968459:
                case 1487090099:
                    sArr14 = sArr14;
                    sArr6 = sArr10;
                    i45 = i45;
                    i46 = i46;
                    i22 = i34;
                    i35 = i35;
                    c4 = c4;
                    i43 = i43;
                    i44 = i44;
                    c6 = c6;
                    C2105.m6979(sb, c3);
                    int iM698112 = C2105.m6981("ۡۚ") ^ i30;
                    sArr4 = sArr6;
                    i32 = ((iM698112 ^ i31) * (-21847)) ^ (-1176423189);
                    i34 = i22;
                    i45 = i45;
                    char c13 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr14;
                    i33 = iM698112 ^ 1712016332;
                    c6 = c13;
                    short[] sArr1113 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr1113;
                    break;
                case 608507577:
                case 1249082779:
                    sArr2 = sArr14;
                    if (c4 != '\n') {
                        iM6981 = C2105.m6981("ܽ۠") ^ i30;
                        i6 = ((iM6981 ^ i31) * 15425) ^ 1018747423;
                        i9 = -844090238;
                    } else {
                        iM6981 = (C2105.m6981("᩶֫") + i31) * (-123);
                        i6 = ((iM6981 ^ i30) * (-26129)) ^ 1625790264;
                        i9 = 1400780623;
                    }
                    i7 = iM6981 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
                case 679116525:
                case 2019178164:
                    if (C10753.m26952(c4)) {
                        iM6983 = C2105.m6981("۟ۛ") ^ i31;
                        i27 = ((iM6983 ^ i30) * 14143) ^ 256841549;
                        i28 = 10028641;
                    } else {
                        iM6983 = (C2105.m6981("ۤۚ") + i30) * (-3);
                        i27 = ((iM6983 ^ i31) * 32195) ^ (-1235422736);
                        i28 = 2040298597;
                    }
                    i33 = iM6983 ^ i28;
                    i32 = i27;
                    break;
                case 708893600:
                case 1439828910:
                    C4616.m13552();
                    C2105.m6982();
                    iM6983 = C2105.m6981("۠᩹") ^ i31;
                    i27 = ((iM6983 ^ i30) * 12799) ^ 1871792732;
                    i28 = 78516685;
                    i33 = iM6983 ^ i28;
                    i32 = i27;
                    break;
                case 714098186:
                case 2138442788:
                    if (C1294.f4556 < 0) {
                        sArr2 = sArr14;
                        i8 = i45;
                        i46 = i46;
                        i5 = i34;
                        i35 = i35;
                        i43 = i43;
                        c6 = c6;
                        sArr9 = sArr9;
                        sb = sb;
                        short[] sArr214 = sArr10;
                        c4 = c4;
                        i44 = i44;
                        sArr4 = sArr214;
                        iM2568 = C0630.m2566("۫᩵") ^ i31;
                        i32 = ((iM2568 ^ i30) * (-16235)) ^ 1728055494;
                        i14 = -921514789;
                        i15 = iM2568 ^ i14;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr2;
                        i33 = i15;
                        i34 = i5;
                        i45 = i8;
                        short[] sArr215 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr215;
                    } else {
                        sArr2 = sArr14;
                        iM6981 = (i30 - C0630.m2566("ۚܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM6981 ^ i31) * 1575) ^ (-452915497);
                        i9 = 583010441;
                        i7 = iM6981 ^ i9;
                        sArr = sArr2;
                        i33 = i7;
                        i32 = i6;
                        sArr14 = sArr;
                    }
                    break;
                case 823512714:
                case 2119404357:
                    sArr2 = sArr14;
                    c6 = '\r';
                    sArr13 = f46665;
                    i34 = 7;
                    if (C1294.f4556 < 0) {
                        iM6981 = (C2105.m6981("֫֨") + i31) * (-111);
                        i6 = ((iM6981 ^ i30) * (-5831)) ^ 528783671;
                        i9 = -1977194811;
                        i7 = iM6981 ^ i9;
                        sArr = sArr2;
                        i33 = i7;
                        i32 = i6;
                        sArr14 = sArr;
                    } else {
                        sArr3 = sArr10;
                        i10 = i45;
                        i11 = i46;
                        i12 = 7;
                        i13 = i35;
                        c = c4;
                        int iM698113 = C2105.m6981("ۨۖ") ^ i30;
                        i34 = i12;
                        i45 = i10;
                        char c14 = c;
                        sArr10 = sArr3;
                        i32 = ((iM698113 ^ i31) * (-10573)) ^ (-1441722551);
                        c4 = c14;
                        short[] sArr216 = sArr2;
                        i33 = iM698113 ^ (-701134929);
                        i35 = i13;
                        i46 = i11;
                        sArr14 = sArr216;
                    }
                    break;
                case 956232721:
                case 1790782602:
                    RunnableC1108.m3790();
                    if (!C0382.f1805) {
                        iM6983 = C2105.m6981("۠᩹") ^ i31;
                        i27 = ((iM6983 ^ i30) * 12799) ^ 1871792732;
                        i28 = 78516685;
                        i33 = iM6983 ^ i28;
                        i32 = i27;
                    } else {
                        sArr2 = sArr14;
                        sArr3 = sArr10;
                        i10 = i45;
                        i11 = i46;
                        i12 = i34;
                        i13 = i35;
                        c = c4;
                        int iM698114 = C2105.m6981("ۨۖ") ^ i30;
                        i34 = i12;
                        i45 = i10;
                        char c15 = c;
                        sArr10 = sArr3;
                        i32 = ((iM698114 ^ i31) * (-10573)) ^ (-1441722551);
                        c4 = c15;
                        short[] sArr217 = sArr2;
                        i33 = iM698114 ^ (-701134929);
                        i35 = i13;
                        i46 = i11;
                        sArr14 = sArr217;
                    }
                    break;
                case 1061082356:
                case 1897381057:
                    C3245.m9923(sb, C7811.m20837(sArr12, i36, i37, i39));
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM698115 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM698115 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM698115 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case 1095314921:
                case 2130941762:
                    if (C1420.f5096 <= 0) {
                        sArr5 = sArr14;
                        i18 = i45;
                        i46 = i46;
                        i19 = i34;
                        i35 = i35;
                        i43 = i43;
                        c6 = c6;
                        short[] sArr218 = sArr10;
                        c4 = c4;
                        i44 = i44;
                        sArr4 = sArr218;
                        iM2569 = (C2105.m6981("᩵ۚ") ^ i30) * 45;
                        i20 = ((iM2569 ^ i31) * 17625) ^ 1670876060;
                        i21 = -371564446;
                        i34 = i19;
                        i45 = i18;
                        sArr8 = sArr5;
                        i33 = iM2569 ^ i21;
                        i32 = i20;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr8;
                        short[] sArr1114 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr1114;
                    } else {
                        iM6983 = C2105.m6981("۠᩹") ^ i31;
                        i27 = ((iM6983 ^ i30) * 12799) ^ 1871792732;
                        i28 = 78516685;
                        i33 = iM6983 ^ i28;
                        i32 = i27;
                    }
                    break;
                case 1118519698:
                case 1650743580:
                    sArr5 = sArr14;
                    i18 = i45;
                    i46 = i46;
                    i19 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    short[] sArr34 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr34;
                    sb = new StringBuilder();
                    sArr9 = f46665;
                    if (C0050.f910 >= 0) {
                        iM2569 = (C2105.m6981("᩵ۚ") ^ i30) * 45;
                        i20 = ((iM2569 ^ i31) * 17625) ^ 1670876060;
                        i21 = -371564446;
                    } else {
                        iM2569 = (C0630.m2566("ۘ֨") + i31) * 81;
                        i20 = ((iM2569 ^ i30) * (-26509)) ^ (-425397623);
                        i21 = 513815121;
                    }
                    i34 = i19;
                    i45 = i18;
                    sArr8 = sArr5;
                    i33 = iM2569 ^ i21;
                    i32 = i20;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr8;
                    short[] sArr1115 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr1115;
                    break;
                case 1146786592:
                case 1966427343:
                    C1420.m4905(sb, strM10568);
                    C0422.m1944(sb, c4);
                    C2105.m6979(sb, ';');
                    i25 = i45;
                    sArr7 = sArr11;
                    i26 = i46;
                    int iM698116 = (C2105.m6981("ᩴ۫") + i30) * 39;
                    sArr11 = sArr7;
                    i32 = ((iM698116 ^ i31) * 23521) ^ 1875418545;
                    i46 = i26;
                    sArr14 = sArr14;
                    i33 = iM698116 ^ (-1034208596);
                    i34 = i34;
                    i45 = i25;
                    break;
                case 1210212796:
                case 1531152231:
                    sArr14 = sArr14;
                    i45 = i45;
                    i46 = i46;
                    i34 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    sArr9 = sArr9;
                    sb = sb;
                    short[] sArr35 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr35;
                    if (str != null) {
                        iM6982 = (C0630.m2566("᩷᩸") ^ i30) * (-17);
                        i16 = ((iM6982 ^ i31) * 16959) ^ 1978692405;
                        i17 = -755188596;
                    } else {
                        iM6982 = (C0630.m2566("᩹ۛ") + i31) * (-63);
                        i16 = ((iM6982 ^ i30) * 24385) ^ (-2081846549);
                        i17 = 1195777229;
                    }
                    i24 = iM6982 ^ i17;
                    i34 = i34;
                    i45 = i45;
                    sArr8 = sArr14;
                    i33 = i24;
                    i32 = i16;
                    sb = sb;
                    sArr9 = sArr9;
                    c6 = c6;
                    i43 = i43;
                    i35 = i35;
                    i46 = i46;
                    sArr14 = sArr8;
                    short[] sArr1116 = sArr4;
                    i44 = i44;
                    c4 = c4;
                    sArr10 = sArr1116;
                    break;
                case 1414961753:
                case 2143488253:
                    if (c4 < 127) {
                        iM6983 = C2105.m6981("᩹ܺ") ^ i30;
                        i27 = ((iM6983 ^ i31) * (-31545)) ^ (-1882294403);
                        i28 = 750203532;
                    } else {
                        iM6983 = C0630.m2566("ۚܳ") ^ i30;
                        i27 = ((iM6983 ^ i31) * (-31891)) ^ 832693531;
                        i28 = -2063601562;
                    }
                    i33 = iM6983 ^ i28;
                    i32 = i27;
                    break;
                case 1766939996:
                case 1906142578:
                    sArr2 = sArr14;
                    i8 = i45;
                    i46 = i46;
                    i5 = i34;
                    i35 = i35;
                    i43 = i43;
                    c6 = c6;
                    sArr9 = sArr9;
                    sb = sb;
                    short[] sArr36 = sArr10;
                    c4 = c4;
                    i44 = i44;
                    sArr4 = sArr36;
                    i40 = s * s2;
                    s = s;
                    int i53 = s + 18842;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        int iM69822 = (i30 - C2105.m6981("ᩳۛ")) * (-91);
                        s = s;
                        i32 = ((iM69822 ^ i31) * (-16065)) ^ 2144208001;
                        i15 = iM69822 ^ (-158561756);
                        i41 = i53;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr2;
                        i33 = i15;
                        i34 = i5;
                        i45 = i8;
                        short[] sArr219 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr219;
                    } else {
                        i41 = i53;
                        int iM25612 = (i31 - C0630.m2566("֫ܰ")) * (-75);
                        s = s;
                        i32 = ((iM25612 ^ i30) * (-30801)) ^ 606520359;
                        i34 = i5;
                        i45 = i8;
                        sArr8 = sArr2;
                        i33 = iM25612 ^ 840250923;
                        sb = sb;
                        sArr9 = sArr9;
                        c6 = c6;
                        i43 = i43;
                        i35 = i35;
                        i46 = i46;
                        sArr14 = sArr8;
                        short[] sArr1117 = sArr4;
                        i44 = i44;
                        c4 = c4;
                        sArr10 = sArr1117;
                    }
                    break;
                default:
                    sArr2 = sArr14;
                    strM10568 = ServiceConnectionC3453.m10568(sArr13, i34, 2, i39);
                    if (c4 != c6) {
                        iM6981 = (C0630.m2566("ܿܺ") + i30) * 85;
                        i6 = ((iM6981 ^ i31) * 32377) ^ 921222071;
                        i9 = 959450442;
                    } else {
                        iM6981 = (C2105.m6981("ۖܰ") ^ i31) * 53;
                        i6 = ((iM6981 ^ i30) * 16477) ^ 812814802;
                        i9 = 2136631562;
                    }
                    i7 = iM6981 ^ i9;
                    sArr = sArr2;
                    i33 = i7;
                    i32 = i6;
                    sArr14 = sArr;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m35992() {
        return this.f46668;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m35989() {
        return this.f46669;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35984(byte[] bArr) {
        this.f46669 = bArr;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m35993() {
        return this.f46670;
    }
}
